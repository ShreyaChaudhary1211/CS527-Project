/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2011 castLabs, Berlin
 *
 * Licensed under the Apache License, Version 2.0 (the License);
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an AS IS BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.googlecode.mp4parser.boxes.mp4.objectdescriptors;

import com.coremedia.iso.Hex;
import com.coremedia.iso.IsoTypeWriter;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


//
//GetAudioObjectType()
//{
//audioObjectType; 5 uimsbf
//if (audioObjectType == 31) {
//audioObjectType = 32 + audioObjectTypeExt; 6 uimsbf
//}
//return audioObjectType;
//}
//AudioSpecificConfig ()
//{
//audioObjectType = GetAudioObjectType();
//samplingFrequencyIndex; 4 bslbf
//if ( samplingFrequencyIndex == 0xf ) {
//samplingFrequency; 24 uimsbf
//}
//channelConfiguration; 4 bslbf
//sbrPresentFlag = -1;
//psPresentFlag = -1;
//if ( audioObjectType == 5 ||
//audioObjectType == 29 ) {
//extensionAudioObjectType = 5;
//sbrPresentFlag = 1;
//if ( audioObjectType == 29 ) {
//psPresentFlag = 1;
//}
//extensionSamplingFrequencyIndex; 4 uimsbf
//if ( extensionSamplingFrequencyIndex == 0xf )
//extensionSamplingFrequency; 24 uimsbf
//audioObjectType = GetAudioObjectType();
//if ( audioObjectType == 22 )
//extensionChannelConfiguration; 4 uimsbf
//}
//else {
//extensionAudioObjectType = 0;
//}
//switch (audioObjectType) {
//case 1:
//case 2:
//case 3:
//case 4:
//case 6:
//case 7:
//case 17:
//case 19:
//case 20:
//case 21:
//case 22:
//case 23:
//GASpecificConfig();
//break:
//case 8:
//CelpSpecificConfig();
//break;
//case 9:
//HvxcSpecificConfig();
//break:
//case 12:
//TTSSpecificConfig();
//break;
//case 13:
//case 14:
//case 15:
//case 16:
//StructuredAudioSpecificConfig();
//break;
//case 24:
//ErrorResilientCelpSpecificConfig();
//break;
//case 25:
//ErrorResilientHvxcSpecificConfig();
//break;
//case 26:
//case 27:
//ParametricSpecificConfig();
//break;
// case 28:
//SSCSpecificConfig();
//break;
//case 30:
//sacPayloadEmbedding; 1 uimsbf
//SpatialSpecificConfig();
//break;
//case 32:
//case 33:
//case 34:
//MPEG_1_2_SpecificConfig();
//break;
//case 35:
//DSTSpecificConfig();
//break;
//case 36:
//fillBits; 5 bslbf
//ALSSpecificConfig();
//break;
//case 37:
//case 38:
//SLSSpecificConfig();
//break;
//case 39:
//ELDSpecificConfig(channelConfiguration);
//break:
//case 40:
//case 41:
//SymbolicMusicSpecificConfig();
//break;
//default:
///* reserved */
//}
//switch (audioObjectType) {
//case 17:
//case 19:
//case 20:
//case 21:
//case 22:
//case 23:
//case 24:
//case 25:
//case 26:
//case 27:
//case 39:
//epConfig; 2 bslbf
//if ( epConfig == 2 || epConfig == 3 ) {
//ErrorProtectionSpecificConfig();
//}
//if ( epConfig == 3 ) {
//directMapping; 1 bslbf
//if ( ! directMapping ) {
///* tbd */
//}
//}
//}
//if ( extensionAudioObjectType != 5 && bits_to_decode() >= 16 ) {
//syncExtensionType; 11 bslbf
//if (syncExtensionType == 0x2b7) {
//        extensionAudioObjectType = GetAudioObjectType();
//if ( extensionAudioObjectType == 5 ) {
//sbrPresentFlag; 1 uimsbf
//if (sbrPresentFlag == 1) {
//extensionSamplingFrequencyIndex; 4 uimsbf
//if ( extensionSamplingFrequencyIndex == 0xf ) {
//extensionSamplingFrequency; 24 uimsbf
//}
//if ( bits_to_decode() >= 12 ) {
//syncExtensionType; 11 bslbf
//if (syncExtesionType == 0x548) {
//psPresentFlag; 1 uimsbf
//}
//}
//}
//}
//if ( extensionAudioObjectType == 22 ) {
//sbrPresentFlag; 1 uimsbf
//if (sbrPresentFlag == 1) {
//extensionSamplingFrequencyIndex; 4 uimsbf
//if ( extensionSamplingFrequencyIndex == 0xf ) {
//extensionSamplingFrequency; 24 uimsbf
//}
//}
//extensionChannelConfiguration; 4 uimsbf
//}
//}
//}
//}
//        }
//
// TFCodingType
//0x0 AAC scaleable
//0x1 BSAC
//0x2 TwinVQ
//0x3 AAC non scaleable (i.e. multichannel)
//
// class TFSpecificConfig( uint(4) samplingFrequencyIndex, uint(4) channelConfiguration ) {
//uint(2) TFCodingType;
//uint(1) frameLength;
//uint(1) dependsOnCoreCoder;
//if (dependsOnCoreCoder == 1){
//uint(14)coreCoderDelay
//}
//if (TFCodingType==BSAC) {
//uint(11) lslayer_length
//}
//uint (1) extensionFlag;
//if (channelConfiguration == 0 ){
//program_config_element();
//}
//if (extensionFlag==1){
//<to be defined in mpeg4 phase 2>
//}
//}
//
//program_config_element()
//{
//element_instance_tag 4 uimsbf
//profile 2 uimsbf
//sampling_frequency_index 4 uimsbf
//num_front_channel_elements 4 uimsbf
//num_side_channel_elements 4 uimsbf
//num_back_channel_elements 4 uimsbf
// num_lfe_channel_elements 2 uimsbf
//num_assoc_data_elements 3 uimsbf
//num_valid_cc_elements 4 uimsbf
//mono_mixdown_present 1 uimsbf
//if ( mono_mixdown_present == 1 )
//mono_mixdown_element_number 4 uimsbf
//stereo_mixdown_present 1 uimsbf
//if ( stereo_mixdown_present == 1 )
//stereo_mixdown_element_number 4 uimsbf
//matrix_mixdown_idx_present 1 uimsbf
//if ( matrix_mixdown_idx_present == 1 ) {
//matrix_mixdown_idx 2 uimsbf
//pseudo_surround_enable 1 uimsbf
//}
//for ( i = 0; i < num_front_channel_elements; i++) {
//front_element_is_cpe[i]; 1 bslbf
//front_element_tag_select[i]; 4 uimsbf
//}
//for ( i = 0; i < num_side_channel_elements; i++) {
//side_element_is_cpe[i]; 1 bslbf
//side_element_tag_select[i]; 4 uimsbf
//}
//for ( i = 0; i < num_back_channel_elements; i++) {
//back_element_is_cpe[i]; 1 bslbf
//back_element_tag_select[i]; 4 uimsbf
//}
//for ( i = 0; i < num_lfe_channel_elements; i++)
//lfe_element_tag_select[i]; 4 uimsbf
//for ( i = 0; i < num_assoc_data_elements; i++)
//assoc_data_element_tag_select[i]; 4 uimsbf
//for ( i = 0; i < num_valid_cc_elements; i++) {
//cc_element_is_ind_sw[i]; 1 uimsbf
//valid_cc_element_tag_select[i]; 4 uimsbf
//}
//byte_alignment()
//comment_field_bytes 8 uimsbf
//for ( i = 0; i < comment_field_bytes; i++)
//comment_field_data[i]; 8 uimsbf
//}

@java.lang.SuppressWarnings({"fallthrough"}) @Descriptor(tags = 0x5, objectTypeIndication = 0x40)
public class AudioSpecificConfig extends BaseDescriptor {public static class __CLR4_5_2cdecdelvlullpi{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,17046,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static Map<Integer, Integer> samplingFrequencyIndexMap = new HashMap<Integer, Integer>();
    public static Map<Integer, String> audioObjectTypeMap = new HashMap<Integer, String>();

    static {try{__CLR4_5_2cdecdelvlullpi.R.inc(16034);
        // sampling_frequency_index sampling frequeny
//0x0 96000
//0x1 88200
//0x2 64000
//0x3 48000
//0x4 44100
//0x5 32000
//0x6 24000
//0x7 22050
//0x8 16000
//0x9 12000
//0xa 11025
//0xb 8000
//0xc reserved
//0xd reserved
//0xe reserved
//0xf reserved
        __CLR4_5_2cdecdelvlullpi.R.inc(16035);samplingFrequencyIndexMap.put(0x0, 96000);
        __CLR4_5_2cdecdelvlullpi.R.inc(16036);samplingFrequencyIndexMap.put(0x1, 88200);
        __CLR4_5_2cdecdelvlullpi.R.inc(16037);samplingFrequencyIndexMap.put(0x2, 64000);
        __CLR4_5_2cdecdelvlullpi.R.inc(16038);samplingFrequencyIndexMap.put(0x3, 48000);
        __CLR4_5_2cdecdelvlullpi.R.inc(16039);samplingFrequencyIndexMap.put(0x4, 44100);
        __CLR4_5_2cdecdelvlullpi.R.inc(16040);samplingFrequencyIndexMap.put(0x5, 32000);
        __CLR4_5_2cdecdelvlullpi.R.inc(16041);samplingFrequencyIndexMap.put(0x6, 24000);
        __CLR4_5_2cdecdelvlullpi.R.inc(16042);samplingFrequencyIndexMap.put(0x7, 22050);
        __CLR4_5_2cdecdelvlullpi.R.inc(16043);samplingFrequencyIndexMap.put(0x8, 16000);
        __CLR4_5_2cdecdelvlullpi.R.inc(16044);samplingFrequencyIndexMap.put(0x9, 12000);
        __CLR4_5_2cdecdelvlullpi.R.inc(16045);samplingFrequencyIndexMap.put(0xa, 11025);
        __CLR4_5_2cdecdelvlullpi.R.inc(16046);samplingFrequencyIndexMap.put(0xb, 8000);

        /* audioObjectType IDs
          0 Null
        1 AAC main X X
        2 AAC LC X X X X X X X
        3 AAC SSR X X
        4 AAC LTP X X X X
        5 SBR X X
        6 AAC Scalable X X X X
        7 TwinVQ X X X
        8 CELP X X X X X X
        9 HVXC X X X X X
        10 (reserved)
        11 (reserved)
        12 TTSI X X X X X X
        13 Main synthetic X X
        14 Wavetable synthesis X* X*
        15 General MIDI X* X*
        16 Algorithmic Synthesis and Audio FX X* X*
        17 ER AAC LC X X X
        18 (reserved)
        19 ER AAC LTP X X
        20 ER AAC Scalable X X X
        21 ER TwinVQ X X
        22 ER BSAC X X
        23 ER AAC LD X X X X
        24 ER CELP X X X
        25 ER HVXC X X
        26 ER HILN X
        27 ER Parametric X
        28 SSC
        29 PS X
        30 MPEG Surround
        31 (escape)
        32 Layer-1
        33 Layer-2
        34 Layer-3
        35 DST
        36 ALS
        37 SLS
        38 SLS non-core
        39 ER AAC ELD
        40 SMR Simple
        41 SMR Main
        */
        __CLR4_5_2cdecdelvlullpi.R.inc(16047);audioObjectTypeMap.put(1, "AAC main");
        __CLR4_5_2cdecdelvlullpi.R.inc(16048);audioObjectTypeMap.put(2, "AAC LC");
        __CLR4_5_2cdecdelvlullpi.R.inc(16049);audioObjectTypeMap.put(3, "AAC SSR");
        __CLR4_5_2cdecdelvlullpi.R.inc(16050);audioObjectTypeMap.put(4, "AAC LTP");
        __CLR4_5_2cdecdelvlullpi.R.inc(16051);audioObjectTypeMap.put(5, "SBR");
        __CLR4_5_2cdecdelvlullpi.R.inc(16052);audioObjectTypeMap.put(6, "AAC Scalable");
        __CLR4_5_2cdecdelvlullpi.R.inc(16053);audioObjectTypeMap.put(7, "TwinVQ");
        __CLR4_5_2cdecdelvlullpi.R.inc(16054);audioObjectTypeMap.put(8, "CELP");
        __CLR4_5_2cdecdelvlullpi.R.inc(16055);audioObjectTypeMap.put(9, "HVXC");
        __CLR4_5_2cdecdelvlullpi.R.inc(16056);audioObjectTypeMap.put(10, "(reserved)");
        __CLR4_5_2cdecdelvlullpi.R.inc(16057);audioObjectTypeMap.put(11, "(reserved)");
        __CLR4_5_2cdecdelvlullpi.R.inc(16058);audioObjectTypeMap.put(12, "TTSI");
        __CLR4_5_2cdecdelvlullpi.R.inc(16059);audioObjectTypeMap.put(13, "Main synthetic");
        __CLR4_5_2cdecdelvlullpi.R.inc(16060);audioObjectTypeMap.put(14, "Wavetable synthesis");
        __CLR4_5_2cdecdelvlullpi.R.inc(16061);audioObjectTypeMap.put(15, "General MIDI");
        __CLR4_5_2cdecdelvlullpi.R.inc(16062);audioObjectTypeMap.put(16, "Algorithmic Synthesis and Audio FX");
        __CLR4_5_2cdecdelvlullpi.R.inc(16063);audioObjectTypeMap.put(17, "ER AAC LC");
        __CLR4_5_2cdecdelvlullpi.R.inc(16064);audioObjectTypeMap.put(18, "(reserved)");
        __CLR4_5_2cdecdelvlullpi.R.inc(16065);audioObjectTypeMap.put(19, "ER AAC LTP");
        __CLR4_5_2cdecdelvlullpi.R.inc(16066);audioObjectTypeMap.put(20, "ER AAC Scalable");
        __CLR4_5_2cdecdelvlullpi.R.inc(16067);audioObjectTypeMap.put(21, "ER TwinVQ");
        __CLR4_5_2cdecdelvlullpi.R.inc(16068);audioObjectTypeMap.put(22, "ER BSAC");
        __CLR4_5_2cdecdelvlullpi.R.inc(16069);audioObjectTypeMap.put(23, "ER AAC LD");
        __CLR4_5_2cdecdelvlullpi.R.inc(16070);audioObjectTypeMap.put(24, "ER CELP");
        __CLR4_5_2cdecdelvlullpi.R.inc(16071);audioObjectTypeMap.put(25, "ER HVXC");
        __CLR4_5_2cdecdelvlullpi.R.inc(16072);audioObjectTypeMap.put(26, "ER HILN");
        __CLR4_5_2cdecdelvlullpi.R.inc(16073);audioObjectTypeMap.put(27, "ER Parametric");
        __CLR4_5_2cdecdelvlullpi.R.inc(16074);audioObjectTypeMap.put(28, "SSC");
        __CLR4_5_2cdecdelvlullpi.R.inc(16075);audioObjectTypeMap.put(29, "PS");
        __CLR4_5_2cdecdelvlullpi.R.inc(16076);audioObjectTypeMap.put(30, "MPEG Surround");
        __CLR4_5_2cdecdelvlullpi.R.inc(16077);audioObjectTypeMap.put(31, "(escape)");
        __CLR4_5_2cdecdelvlullpi.R.inc(16078);audioObjectTypeMap.put(32, "Layer-1");
        __CLR4_5_2cdecdelvlullpi.R.inc(16079);audioObjectTypeMap.put(33, "Layer-2");
        __CLR4_5_2cdecdelvlullpi.R.inc(16080);audioObjectTypeMap.put(34, "Layer-3");
        __CLR4_5_2cdecdelvlullpi.R.inc(16081);audioObjectTypeMap.put(35, "DST");
        __CLR4_5_2cdecdelvlullpi.R.inc(16082);audioObjectTypeMap.put(36, "ALS");
        __CLR4_5_2cdecdelvlullpi.R.inc(16083);audioObjectTypeMap.put(37, "SLS");
        __CLR4_5_2cdecdelvlullpi.R.inc(16084);audioObjectTypeMap.put(38, "SLS non-core");
        __CLR4_5_2cdecdelvlullpi.R.inc(16085);audioObjectTypeMap.put(39, "ER AAC ELD");
        __CLR4_5_2cdecdelvlullpi.R.inc(16086);audioObjectTypeMap.put(40, "SMR Simple");
        __CLR4_5_2cdecdelvlullpi.R.inc(16087);audioObjectTypeMap.put(41, "SMR Main");

        /* profileLevelIds
       0x00 Reserved for ISO use -
     0x01 Main Audio Profile L1
     0x02 Main Audio Profile L2
     0x03 Main Audio Profile L3
     0x04 Main Audio Profile L4
     0x05 Scalable Audio Profile L1
     0x06 Scalable Audio Profile L2
     0x07 Scalable Audio Profile L3
     0x08 Scalable Audio Profile L4
     0x09 Speech Audio Profile L1
     0x0A Speech Audio Profile L2
     0x0B Synthetic Audio Profile L1
     0x0C Synthetic Audio Profile L2
     0x0D Synthetic Audio Profile L3
     0x0E High Quality Audio Profile L1
     0x0F High Quality Audio Profile L2
     0x10 High Quality Audio Profile L3
     0x11 High Quality Audio Profile L4
     0x12 High Quality Audio Profile L5
     0x13 High Quality Audio Profile L6
     0x14 High Quality Audio Profile L7
     0x15 High Quality Audio Profile L8
     0x16 Low Delay Audio Profile L1
     0x17 Low Delay Audio Profile L2
     0x18 Low Delay Audio Profile L3
     0x19 Low Delay Audio Profile L4
     0x1A Low Delay Audio Profile L5
     0x1B Low Delay Audio Profile L6
     0x1C Low Delay Audio Profile L7
     0x1D Low Delay Audio Profile L8
     0x1E Natural Audio Profile L1
     0x1F Natural Audio Profile L2
     0x20 Natural Audio Profile L3
     0x21 Natural Audio Profile L4
     0x22 Mobile Audio Internetworking Profile L1
     0x23 Mobile Audio Internetworking Profile L2
     0x24 Mobile Audio Internetworking Profile L3
     0x25 Mobile Audio Internetworking Profile L4
     0x26 Mobile Audio Internetworking Profile L5
     0x27 Mobile Audio Internetworking Profile L6
     0x28 AAC Profile L1
     0x29 AAC Profile L2
     0x2A AAC Profile L4
     0x2B AAC Profile L5
     0x2C High Efficiency AAC Profile L2
     0x2D High Efficiency AAC Profile L3
     0x2E High Efficiency AAC Profile L4
     0x2F High Efficiency AAC Profile L5
     0x30 High Efficiency AAC v2 Profile L2
     0x31 High Efficiency AAC v2 Profile L3
     0x32 High Efficiency AAC v2 Profile L4
     0x33 High Efficiency AAC v2 Profile L5
     0x34 Low Delay AAC Profile L1
     0x35 Baseline MPEG Surround Profile (see ISO/IEC
     23003-1)
     L1
     0x36 Baseline MPEG Surround Profile (see ISO/IEC
     23003-1)
     L2
     0x37 Baseline MPEG Surround Profile (see ISO/IEC
     23003-1)
     L3
     0x38 Baseline MPEG Surround Profile (see ISO/IEC
     23003-1)
     L4
     0c39 Baseline MPEG Surround Profile (see ISO/IEC
     23003-1)
     L5
     0x3A Baseline MPEG Surround Profile (see ISO/IEC
     23003-1)
     L6
     0x3B - 0x7F reserved for ISO use -
     0x80 - 0xFD user private -
     0xFE no audio profile specified -
     0xFF no audio capability required -

        */
    }finally{__CLR4_5_2cdecdelvlullpi.R.flushNeeded();}}

    public ELDSpecificConfig eldSpecificConfig;
    public int audioObjectType;
    public int originalAudioObjectType;
    public int samplingFrequencyIndex;
    public int samplingFrequency;
    public int channelConfiguration;
    public int extensionAudioObjectType;
    public int origExtensionAudioObjectType;
    public boolean sbrPresentFlag;
    public boolean psPresentFlag;
    public int extensionSamplingFrequencyIndex = -1;
    public int extensionSamplingFrequency;
    public int extensionChannelConfiguration;
    public int sacPayloadEmbedding;
    public int fillBits;
    public int epConfig;
    public int directMapping;
    public int syncExtensionType = -1;
    public int innerSyncExtensionType = -1;
    public int outerSyncExtensionType = -1;
    //GASpecificConfig
    public int frameLengthFlag;
    public int dependsOnCoreCoder;
    public int coreCoderDelay;
    public int extensionFlag;
    public int layerNr;
    public int numOfSubFrame;
    public int layer_length;
    public boolean aacSectionDataResilienceFlag;
    public boolean aacScalefactorDataResilienceFlag;
    public boolean aacSpectralDataResilienceFlag;
    public int extensionFlag3;
    public boolean gaSpecificConfig;
    //ParametricSpecificConfig
    public int isBaseLayer;
    public int paraMode;
    public int paraExtensionFlag;
    public int hvxcVarMode;
    public int hvxcRateMode;
    public int erHvxcExtensionFlag;
    public int var_ScalableFlag;
    public int hilnQuantMode;
    public int hilnMaxNumLine;
    public int hilnSampleRateCode;
    public int hilnFrameLength;
    public int hilnContMode;
    public int hilnEnhaLayer;
    public int hilnEnhaQuantMode;
    public boolean parametricSpecificConfig;
    byte[] configBytes;

    public AudioSpecificConfig() {try{__CLR4_5_2cdecdelvlullpi.R.inc(16088);
        __CLR4_5_2cdecdelvlullpi.R.inc(16089);tag = 0x5;
    }finally{__CLR4_5_2cdecdelvlullpi.R.flushNeeded();}}

    boolean parsed = false;

    @Override
    public void parseDetail(ByteBuffer bb) throws IOException {try{__CLR4_5_2cdecdelvlullpi.R.inc(16090);
        __CLR4_5_2cdecdelvlullpi.R.inc(16091);parsed = true;
        __CLR4_5_2cdecdelvlullpi.R.inc(16092);ByteBuffer configBytes = bb.slice();
        __CLR4_5_2cdecdelvlullpi.R.inc(16093);configBytes.limit(sizeOfInstance);
        __CLR4_5_2cdecdelvlullpi.R.inc(16094);bb.position(bb.position() + sizeOfInstance);

        //copy original bytes to internal array for constructing codec config strings (todo until writing of the config is supported)
        __CLR4_5_2cdecdelvlullpi.R.inc(16095);this.configBytes = new byte[sizeOfInstance];
        __CLR4_5_2cdecdelvlullpi.R.inc(16096);configBytes.get(this.configBytes);
        __CLR4_5_2cdecdelvlullpi.R.inc(16097);configBytes.rewind();

        __CLR4_5_2cdecdelvlullpi.R.inc(16098);BitReaderBuffer bitReaderBuffer = new BitReaderBuffer(configBytes);
        __CLR4_5_2cdecdelvlullpi.R.inc(16099);originalAudioObjectType = audioObjectType = getAudioObjectType(bitReaderBuffer);
        __CLR4_5_2cdecdelvlullpi.R.inc(16100);samplingFrequencyIndex = bitReaderBuffer.readBits(4);

        __CLR4_5_2cdecdelvlullpi.R.inc(16101);if ((((samplingFrequencyIndex == 0xf)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16102)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16103)==0&false))) {{
            __CLR4_5_2cdecdelvlullpi.R.inc(16104);samplingFrequency = bitReaderBuffer.readBits(24);
        }

        }__CLR4_5_2cdecdelvlullpi.R.inc(16105);channelConfiguration = bitReaderBuffer.readBits(4);

        __CLR4_5_2cdecdelvlullpi.R.inc(16106);if ((((audioObjectType == 5 ||
                audioObjectType == 29)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16107)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16108)==0&false))) {{
            __CLR4_5_2cdecdelvlullpi.R.inc(16109);extensionAudioObjectType = 5;
            __CLR4_5_2cdecdelvlullpi.R.inc(16110);sbrPresentFlag = true;
            __CLR4_5_2cdecdelvlullpi.R.inc(16111);if ((((audioObjectType == 29)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16112)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16113)==0&false))) {{
                __CLR4_5_2cdecdelvlullpi.R.inc(16114);psPresentFlag = true;
            }
            }__CLR4_5_2cdecdelvlullpi.R.inc(16115);extensionSamplingFrequencyIndex = bitReaderBuffer.readBits(4);
            __CLR4_5_2cdecdelvlullpi.R.inc(16116);if ((((extensionSamplingFrequencyIndex == 0xf)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16117)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16118)==0&false)))
                {__CLR4_5_2cdecdelvlullpi.R.inc(16119);extensionSamplingFrequency = bitReaderBuffer.readBits(24);
            }__CLR4_5_2cdecdelvlullpi.R.inc(16120);audioObjectType = getAudioObjectType(bitReaderBuffer);
            __CLR4_5_2cdecdelvlullpi.R.inc(16121);if ((((audioObjectType == 22)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16122)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16123)==0&false)))
                {__CLR4_5_2cdecdelvlullpi.R.inc(16124);extensionChannelConfiguration = bitReaderBuffer.readBits(4);
        }} }else {{
            __CLR4_5_2cdecdelvlullpi.R.inc(16125);extensionAudioObjectType = 0;
        }

        }boolean __CLB4_5_2_bool0=false;__CLR4_5_2cdecdelvlullpi.R.inc(16126);switch (audioObjectType) {
            case 1:if (!__CLB4_5_2_bool0) {__CLR4_5_2cdecdelvlullpi.R.inc(16127);__CLB4_5_2_bool0=true;}
            case 2:if (!__CLB4_5_2_bool0) {__CLR4_5_2cdecdelvlullpi.R.inc(16128);__CLB4_5_2_bool0=true;}
            case 3:if (!__CLB4_5_2_bool0) {__CLR4_5_2cdecdelvlullpi.R.inc(16129);__CLB4_5_2_bool0=true;}
            case 4:if (!__CLB4_5_2_bool0) {__CLR4_5_2cdecdelvlullpi.R.inc(16130);__CLB4_5_2_bool0=true;}
            case 6:if (!__CLB4_5_2_bool0) {__CLR4_5_2cdecdelvlullpi.R.inc(16131);__CLB4_5_2_bool0=true;}
            case 7:if (!__CLB4_5_2_bool0) {__CLR4_5_2cdecdelvlullpi.R.inc(16132);__CLB4_5_2_bool0=true;}
            case 17:if (!__CLB4_5_2_bool0) {__CLR4_5_2cdecdelvlullpi.R.inc(16133);__CLB4_5_2_bool0=true;}
            case 19:if (!__CLB4_5_2_bool0) {__CLR4_5_2cdecdelvlullpi.R.inc(16134);__CLB4_5_2_bool0=true;}
            case 20:if (!__CLB4_5_2_bool0) {__CLR4_5_2cdecdelvlullpi.R.inc(16135);__CLB4_5_2_bool0=true;}
            case 21:if (!__CLB4_5_2_bool0) {__CLR4_5_2cdecdelvlullpi.R.inc(16136);__CLB4_5_2_bool0=true;}
            case 22:if (!__CLB4_5_2_bool0) {__CLR4_5_2cdecdelvlullpi.R.inc(16137);__CLB4_5_2_bool0=true;}
            case 23:if (!__CLB4_5_2_bool0) {__CLR4_5_2cdecdelvlullpi.R.inc(16138);__CLB4_5_2_bool0=true;}
                __CLR4_5_2cdecdelvlullpi.R.inc(16139);parseGaSpecificConfig(samplingFrequencyIndex, channelConfiguration, audioObjectType, bitReaderBuffer);
                //GASpecificConfig();
                __CLR4_5_2cdecdelvlullpi.R.inc(16140);break;
            case 8:if (!__CLB4_5_2_bool0) {__CLR4_5_2cdecdelvlullpi.R.inc(16141);__CLB4_5_2_bool0=true;}
                __CLR4_5_2cdecdelvlullpi.R.inc(16142);throw new UnsupportedOperationException("can't parse CelpSpecificConfig yet");
                //CelpSpecificConfig();
                //break;
            case 9:if (!__CLB4_5_2_bool0) {__CLR4_5_2cdecdelvlullpi.R.inc(16143);__CLB4_5_2_bool0=true;}
                __CLR4_5_2cdecdelvlullpi.R.inc(16144);throw new UnsupportedOperationException("can't parse HvxcSpecificConfig yet");
                //HvxcSpecificConfig();
                //break;
            case 12:if (!__CLB4_5_2_bool0) {__CLR4_5_2cdecdelvlullpi.R.inc(16145);__CLB4_5_2_bool0=true;}
                __CLR4_5_2cdecdelvlullpi.R.inc(16146);throw new UnsupportedOperationException("can't parse TTSSpecificConfig yet");
                //TTSSpecificConfig();
                //break;
            case 13:if (!__CLB4_5_2_bool0) {__CLR4_5_2cdecdelvlullpi.R.inc(16147);__CLB4_5_2_bool0=true;}
            case 14:if (!__CLB4_5_2_bool0) {__CLR4_5_2cdecdelvlullpi.R.inc(16148);__CLB4_5_2_bool0=true;}
            case 15:if (!__CLB4_5_2_bool0) {__CLR4_5_2cdecdelvlullpi.R.inc(16149);__CLB4_5_2_bool0=true;}
            case 16:if (!__CLB4_5_2_bool0) {__CLR4_5_2cdecdelvlullpi.R.inc(16150);__CLB4_5_2_bool0=true;}
                __CLR4_5_2cdecdelvlullpi.R.inc(16151);throw new UnsupportedOperationException("can't parse StructuredAudioSpecificConfig yet");
                //StructuredAudioSpecificConfig();
                //break;
            case 24:if (!__CLB4_5_2_bool0) {__CLR4_5_2cdecdelvlullpi.R.inc(16152);__CLB4_5_2_bool0=true;}
                __CLR4_5_2cdecdelvlullpi.R.inc(16153);throw new UnsupportedOperationException("can't parse ErrorResilientCelpSpecificConfig yet");
                //ErrorResilientCelpSpecificConfig();
                //break;
            case 25:if (!__CLB4_5_2_bool0) {__CLR4_5_2cdecdelvlullpi.R.inc(16154);__CLB4_5_2_bool0=true;}
                __CLR4_5_2cdecdelvlullpi.R.inc(16155);throw new UnsupportedOperationException("can't parse ErrorResilientHvxcSpecificConfig yet");
                //ErrorResilientHvxcSpecificConfig();
                //break;
            case 26:if (!__CLB4_5_2_bool0) {__CLR4_5_2cdecdelvlullpi.R.inc(16156);__CLB4_5_2_bool0=true;}
            case 27:if (!__CLB4_5_2_bool0) {__CLR4_5_2cdecdelvlullpi.R.inc(16157);__CLB4_5_2_bool0=true;}
                __CLR4_5_2cdecdelvlullpi.R.inc(16158);parseParametricSpecificConfig(samplingFrequencyIndex, channelConfiguration, audioObjectType, bitReaderBuffer);
                //ParametricSpecificConfig();
                __CLR4_5_2cdecdelvlullpi.R.inc(16159);break;
            case 28:if (!__CLB4_5_2_bool0) {__CLR4_5_2cdecdelvlullpi.R.inc(16160);__CLB4_5_2_bool0=true;}
                __CLR4_5_2cdecdelvlullpi.R.inc(16161);throw new UnsupportedOperationException("can't parse SSCSpecificConfig yet");
                //SSCSpecificConfig();
                //break;
            case 30:if (!__CLB4_5_2_bool0) {__CLR4_5_2cdecdelvlullpi.R.inc(16162);__CLB4_5_2_bool0=true;}
                __CLR4_5_2cdecdelvlullpi.R.inc(16163);sacPayloadEmbedding = bitReaderBuffer.readBits(1);
                __CLR4_5_2cdecdelvlullpi.R.inc(16164);throw new UnsupportedOperationException("can't parse SpatialSpecificConfig yet");
                //SpatialSpecificConfig();
                //break;
            case 32:if (!__CLB4_5_2_bool0) {__CLR4_5_2cdecdelvlullpi.R.inc(16165);__CLB4_5_2_bool0=true;}
            case 33:if (!__CLB4_5_2_bool0) {__CLR4_5_2cdecdelvlullpi.R.inc(16166);__CLB4_5_2_bool0=true;}
            case 34:if (!__CLB4_5_2_bool0) {__CLR4_5_2cdecdelvlullpi.R.inc(16167);__CLB4_5_2_bool0=true;}
                __CLR4_5_2cdecdelvlullpi.R.inc(16168);throw new UnsupportedOperationException("can't parse MPEG_1_2_SpecificConfig yet");
                //MPEG_1_2_SpecificConfig();
                //break;
            case 35:if (!__CLB4_5_2_bool0) {__CLR4_5_2cdecdelvlullpi.R.inc(16169);__CLB4_5_2_bool0=true;}
                __CLR4_5_2cdecdelvlullpi.R.inc(16170);throw new UnsupportedOperationException("can't parse DSTSpecificConfig yet");
                //DSTSpecificConfig();
                //break;
            case 36:if (!__CLB4_5_2_bool0) {__CLR4_5_2cdecdelvlullpi.R.inc(16171);__CLB4_5_2_bool0=true;}
                __CLR4_5_2cdecdelvlullpi.R.inc(16172);fillBits = bitReaderBuffer.readBits(5);
                __CLR4_5_2cdecdelvlullpi.R.inc(16173);throw new UnsupportedOperationException("can't parse ALSSpecificConfig yet");
                //ALSSpecificConfig();
                //break;
            case 37:if (!__CLB4_5_2_bool0) {__CLR4_5_2cdecdelvlullpi.R.inc(16174);__CLB4_5_2_bool0=true;}
            case 38:if (!__CLB4_5_2_bool0) {__CLR4_5_2cdecdelvlullpi.R.inc(16175);__CLB4_5_2_bool0=true;}
                __CLR4_5_2cdecdelvlullpi.R.inc(16176);throw new UnsupportedOperationException("can't parse SLSSpecificConfig yet");
                //SLSSpecificConfig();
                //break;
            case 39:if (!__CLB4_5_2_bool0) {__CLR4_5_2cdecdelvlullpi.R.inc(16177);__CLB4_5_2_bool0=true;}
                __CLR4_5_2cdecdelvlullpi.R.inc(16178);eldSpecificConfig = new ELDSpecificConfig(channelConfiguration, bitReaderBuffer);
                __CLR4_5_2cdecdelvlullpi.R.inc(16179);break;
            case 40:if (!__CLB4_5_2_bool0) {__CLR4_5_2cdecdelvlullpi.R.inc(16180);__CLB4_5_2_bool0=true;}
            case 41:if (!__CLB4_5_2_bool0) {__CLR4_5_2cdecdelvlullpi.R.inc(16181);__CLB4_5_2_bool0=true;}
                __CLR4_5_2cdecdelvlullpi.R.inc(16182);throw new UnsupportedOperationException("can't parse SymbolicMusicSpecificConfig yet");
                //SymbolicMusicSpecificConfig();
                //break;
            default:if (!__CLB4_5_2_bool0) {__CLR4_5_2cdecdelvlullpi.R.inc(16183);__CLB4_5_2_bool0=true;}
                /* reserved */
        }

        boolean __CLB4_5_2_bool1=false;__CLR4_5_2cdecdelvlullpi.R.inc(16184);switch (audioObjectType) {
            case 17:if (!__CLB4_5_2_bool1) {__CLR4_5_2cdecdelvlullpi.R.inc(16185);__CLB4_5_2_bool1=true;}
            case 19:if (!__CLB4_5_2_bool1) {__CLR4_5_2cdecdelvlullpi.R.inc(16186);__CLB4_5_2_bool1=true;}
            case 20:if (!__CLB4_5_2_bool1) {__CLR4_5_2cdecdelvlullpi.R.inc(16187);__CLB4_5_2_bool1=true;}
            case 21:if (!__CLB4_5_2_bool1) {__CLR4_5_2cdecdelvlullpi.R.inc(16188);__CLB4_5_2_bool1=true;}
            case 22:if (!__CLB4_5_2_bool1) {__CLR4_5_2cdecdelvlullpi.R.inc(16189);__CLB4_5_2_bool1=true;}
            case 23:if (!__CLB4_5_2_bool1) {__CLR4_5_2cdecdelvlullpi.R.inc(16190);__CLB4_5_2_bool1=true;}
            case 24:if (!__CLB4_5_2_bool1) {__CLR4_5_2cdecdelvlullpi.R.inc(16191);__CLB4_5_2_bool1=true;}
            case 25:if (!__CLB4_5_2_bool1) {__CLR4_5_2cdecdelvlullpi.R.inc(16192);__CLB4_5_2_bool1=true;}
            case 26:if (!__CLB4_5_2_bool1) {__CLR4_5_2cdecdelvlullpi.R.inc(16193);__CLB4_5_2_bool1=true;}
            case 27:if (!__CLB4_5_2_bool1) {__CLR4_5_2cdecdelvlullpi.R.inc(16194);__CLB4_5_2_bool1=true;}
            case 39:if (!__CLB4_5_2_bool1) {__CLR4_5_2cdecdelvlullpi.R.inc(16195);__CLB4_5_2_bool1=true;}
                __CLR4_5_2cdecdelvlullpi.R.inc(16196);epConfig = bitReaderBuffer.readBits(2);
                __CLR4_5_2cdecdelvlullpi.R.inc(16197);if ((((epConfig == 2 || epConfig == 3)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16198)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16199)==0&false))) {{
                    __CLR4_5_2cdecdelvlullpi.R.inc(16200);throw new UnsupportedOperationException("can't parse ErrorProtectionSpecificConfig yet");
                    //ErrorProtectionSpecificConfig();
                }
                }__CLR4_5_2cdecdelvlullpi.R.inc(16201);if ((((epConfig == 3)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16202)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16203)==0&false))) {{
                    __CLR4_5_2cdecdelvlullpi.R.inc(16204);directMapping = bitReaderBuffer.readBits(1);
                    __CLR4_5_2cdecdelvlullpi.R.inc(16205);if ((((directMapping == 0)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16206)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16207)==0&false))) {{
                        /* tbd */
                        __CLR4_5_2cdecdelvlullpi.R.inc(16208);throw new RuntimeException("not implemented");
                    }
                }}
        }}

        __CLR4_5_2cdecdelvlullpi.R.inc(16209);if ((((extensionAudioObjectType != 5 && bitReaderBuffer.remainingBits() >= 16)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16210)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16211)==0&false))) {{
            __CLR4_5_2cdecdelvlullpi.R.inc(16212);outerSyncExtensionType = syncExtensionType = bitReaderBuffer.readBits(11);
            __CLR4_5_2cdecdelvlullpi.R.inc(16213);if ((((syncExtensionType == 0x2b7)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16214)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16215)==0&false))) {{
                __CLR4_5_2cdecdelvlullpi.R.inc(16216);extensionAudioObjectType = getAudioObjectType(bitReaderBuffer);
                __CLR4_5_2cdecdelvlullpi.R.inc(16217);if ((((extensionAudioObjectType == 5)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16218)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16219)==0&false))) {{
                    __CLR4_5_2cdecdelvlullpi.R.inc(16220);sbrPresentFlag = bitReaderBuffer.readBool();
                    __CLR4_5_2cdecdelvlullpi.R.inc(16221);if ((((sbrPresentFlag)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16222)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16223)==0&false))) {{
                        __CLR4_5_2cdecdelvlullpi.R.inc(16224);extensionSamplingFrequencyIndex = bitReaderBuffer.readBits(4);
                        __CLR4_5_2cdecdelvlullpi.R.inc(16225);if ((((extensionSamplingFrequencyIndex == 0xf)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16226)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16227)==0&false))) {{
                            __CLR4_5_2cdecdelvlullpi.R.inc(16228);extensionSamplingFrequency = bitReaderBuffer.readBits(24);
                        }
                        }__CLR4_5_2cdecdelvlullpi.R.inc(16229);if ((((bitReaderBuffer.remainingBits() >= 12)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16230)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16231)==0&false))) {{
                            __CLR4_5_2cdecdelvlullpi.R.inc(16232);innerSyncExtensionType = syncExtensionType = bitReaderBuffer.readBits(11); //10101001000
                            __CLR4_5_2cdecdelvlullpi.R.inc(16233);if ((((syncExtensionType == 0x548)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16234)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16235)==0&false))) {{
                                __CLR4_5_2cdecdelvlullpi.R.inc(16236);psPresentFlag = bitReaderBuffer.readBool();
                            }
                        }}
                    }}
                }}
                }__CLR4_5_2cdecdelvlullpi.R.inc(16237);if ((((extensionAudioObjectType == 22)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16238)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16239)==0&false))) {{
                    __CLR4_5_2cdecdelvlullpi.R.inc(16240);sbrPresentFlag = bitReaderBuffer.readBool();
                    __CLR4_5_2cdecdelvlullpi.R.inc(16241);if ((((sbrPresentFlag)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16242)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16243)==0&false))) {{
                        __CLR4_5_2cdecdelvlullpi.R.inc(16244);extensionSamplingFrequencyIndex = bitReaderBuffer.readBits(4);
                        __CLR4_5_2cdecdelvlullpi.R.inc(16245);if ((((extensionSamplingFrequencyIndex == 0xf)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16246)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16247)==0&false))) {{
                            __CLR4_5_2cdecdelvlullpi.R.inc(16248);extensionSamplingFrequency = bitReaderBuffer.readBits(24);
                        }
                    }}
                    }__CLR4_5_2cdecdelvlullpi.R.inc(16249);extensionChannelConfiguration = bitReaderBuffer.readBits(4);
                }
            }}
        }}
    }}finally{__CLR4_5_2cdecdelvlullpi.R.flushNeeded();}}

    private int gaSpecificConfigSize() {try{__CLR4_5_2cdecdelvlullpi.R.inc(16250);
        __CLR4_5_2cdecdelvlullpi.R.inc(16251);int n = 0;
        __CLR4_5_2cdecdelvlullpi.R.inc(16252);n += 1; // frameLengthFlag = in.readBits(1);
        __CLR4_5_2cdecdelvlullpi.R.inc(16253);n += 1; //dependsOnCoreCoder = in.readBits(1);
        __CLR4_5_2cdecdelvlullpi.R.inc(16254);if ((((dependsOnCoreCoder == 1)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16255)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16256)==0&false))) {{
            __CLR4_5_2cdecdelvlullpi.R.inc(16257);n += 14; // coreCoderDelay = in.readBits(14);
        }
        }__CLR4_5_2cdecdelvlullpi.R.inc(16258);n += 1; // extensionFlag = in.readBits(1);
        __CLR4_5_2cdecdelvlullpi.R.inc(16259);if ((((channelConfiguration == 0)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16260)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16261)==0&false))) {{
            __CLR4_5_2cdecdelvlullpi.R.inc(16262);throw new UnsupportedOperationException("can't parse program_config_element yet");
            //program_config_element ();
        }
        }__CLR4_5_2cdecdelvlullpi.R.inc(16263);if (((((audioObjectType == 6) || (audioObjectType == 20))&&(__CLR4_5_2cdecdelvlullpi.R.iget(16264)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16265)==0&false))) {{
            __CLR4_5_2cdecdelvlullpi.R.inc(16266);n += 3; // layerNr = in.readBits(3);
        }
        }__CLR4_5_2cdecdelvlullpi.R.inc(16267);if ((((extensionFlag == 1)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16268)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16269)==0&false))) {{
            __CLR4_5_2cdecdelvlullpi.R.inc(16270);if ((((audioObjectType == 22)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16271)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16272)==0&false))) {{
                __CLR4_5_2cdecdelvlullpi.R.inc(16273);n += 5; // numOfSubFrame = in.readBits(5);
                __CLR4_5_2cdecdelvlullpi.R.inc(16274);n += 11; //layer_length = in.readBits(11);
            }
            }__CLR4_5_2cdecdelvlullpi.R.inc(16275);if ((((audioObjectType == 17 || audioObjectType == 19 ||
                    audioObjectType == 20 || audioObjectType == 23)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16276)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16277)==0&false))) {{
                __CLR4_5_2cdecdelvlullpi.R.inc(16278);n += 1; // aacSectionDataResilienceFlag = in.readBool();
                __CLR4_5_2cdecdelvlullpi.R.inc(16279);n += 1; //aacScalefactorDataResilienceFlag = in.readBool();
                __CLR4_5_2cdecdelvlullpi.R.inc(16280);n += 1; //aacSpectralDataResilienceFlag = in.readBool();
            }
            }__CLR4_5_2cdecdelvlullpi.R.inc(16281);n += 1; //extensionFlag3 = in.readBits(1);
            __CLR4_5_2cdecdelvlullpi.R.inc(16282);if ((((extensionFlag3 == 1)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16283)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16284)==0&false))) {{
                __CLR4_5_2cdecdelvlullpi.R.inc(16285);throw new RuntimeException("Not implemented");
            }
        }}
        }__CLR4_5_2cdecdelvlullpi.R.inc(16286);return n;
    }finally{__CLR4_5_2cdecdelvlullpi.R.flushNeeded();}}

    int getContentSize() {try{__CLR4_5_2cdecdelvlullpi.R.inc(16287);
        __CLR4_5_2cdecdelvlullpi.R.inc(16288);int sizeInBits = 5;
        __CLR4_5_2cdecdelvlullpi.R.inc(16289);if ((((originalAudioObjectType > 30)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16290)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16291)==0&false))) {{
            __CLR4_5_2cdecdelvlullpi.R.inc(16292);sizeInBits += 6; // extended type
        }
        }__CLR4_5_2cdecdelvlullpi.R.inc(16293);sizeInBits += 4; // samplingFrequencyIndex
        __CLR4_5_2cdecdelvlullpi.R.inc(16294);if ((((samplingFrequencyIndex == 0xf)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16295)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16296)==0&false))) {{
            __CLR4_5_2cdecdelvlullpi.R.inc(16297);sizeInBits += 24;
        }
        }__CLR4_5_2cdecdelvlullpi.R.inc(16298);sizeInBits += 4; // channelConfiguration
        __CLR4_5_2cdecdelvlullpi.R.inc(16299);if ((((audioObjectType == 5 ||
                audioObjectType == 29)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16300)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16301)==0&false))) {{
            __CLR4_5_2cdecdelvlullpi.R.inc(16302);sizeInBits += 4; // extensionSamplingFrequencyIndex = bitReaderBuffer.readBits(4);
            __CLR4_5_2cdecdelvlullpi.R.inc(16303);if ((((extensionSamplingFrequencyIndex == 0xf)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16304)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16305)==0&false))) {{
                // extensionSamplingFrequency = bitReaderBuffer.readBits(24);
                __CLR4_5_2cdecdelvlullpi.R.inc(16306);sizeInBits += 24;
            }
        }}

        }__CLR4_5_2cdecdelvlullpi.R.inc(16307);if ((((audioObjectType == 22)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16308)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16309)==0&false))) {{
            __CLR4_5_2cdecdelvlullpi.R.inc(16310);sizeInBits += 4; //   extensionChannelConfiguration
        }


        }__CLR4_5_2cdecdelvlullpi.R.inc(16311);if ((((gaSpecificConfig)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16312)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16313)==0&false))) {{
            __CLR4_5_2cdecdelvlullpi.R.inc(16314);sizeInBits += gaSpecificConfigSize();
        }
        }__CLR4_5_2cdecdelvlullpi.R.inc(16315);if ((((outerSyncExtensionType >= 0)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16316)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16317)==0&false))) {{
            __CLR4_5_2cdecdelvlullpi.R.inc(16318);sizeInBits += 11; //outerSyncExtensionType = syncExtensionType = bitReaderBuffer.readBits(11);
            __CLR4_5_2cdecdelvlullpi.R.inc(16319);if ((((outerSyncExtensionType == 0x2b7)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16320)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16321)==0&false))) {{
                __CLR4_5_2cdecdelvlullpi.R.inc(16322);sizeInBits += 5;
                __CLR4_5_2cdecdelvlullpi.R.inc(16323);if ((((extensionAudioObjectType > 30)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16324)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16325)==0&false))) {{
                    __CLR4_5_2cdecdelvlullpi.R.inc(16326);sizeInBits += 6; // extended type
                } // extensionAudioObjectType = getAudioObjectType(bitReaderBuffer);
                }__CLR4_5_2cdecdelvlullpi.R.inc(16327);if ((((extensionAudioObjectType == 5)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16328)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16329)==0&false))) {{
                    __CLR4_5_2cdecdelvlullpi.R.inc(16330);sizeInBits += 1;
                    __CLR4_5_2cdecdelvlullpi.R.inc(16331);if ((((sbrPresentFlag)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16332)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16333)==0&false))) {{
                        __CLR4_5_2cdecdelvlullpi.R.inc(16334);sizeInBits += 4; // extensionSamplingFrequencyIndex = bitReaderBuffer.readBits(4);
                        __CLR4_5_2cdecdelvlullpi.R.inc(16335);if ((((extensionSamplingFrequencyIndex == 0xf)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16336)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16337)==0&false))) {{
                            __CLR4_5_2cdecdelvlullpi.R.inc(16338);sizeInBits += 24; // extensionSamplingFrequency = bitReaderBuffer.readBits(24);
                        }
                        }__CLR4_5_2cdecdelvlullpi.R.inc(16339);if ((((innerSyncExtensionType >= 0)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16340)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16341)==0&false))) {{
                            __CLR4_5_2cdecdelvlullpi.R.inc(16342);sizeInBits += 11;   // innerSyncExtensionType = syncExtensionType = bitReaderBuffer.readBits(11); //10101001000
                            __CLR4_5_2cdecdelvlullpi.R.inc(16343);if ((((innerSyncExtensionType == 0x548)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16344)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16345)==0&false))) {{
                                __CLR4_5_2cdecdelvlullpi.R.inc(16346);sizeInBits += 1; // psPresentFlag = bitReaderBuffer.readBool();
                            }
                        }}
                    }}
                }}
                }__CLR4_5_2cdecdelvlullpi.R.inc(16347);if ((((extensionAudioObjectType == 22)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16348)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16349)==0&false))) {{
                    __CLR4_5_2cdecdelvlullpi.R.inc(16350);sizeInBits += 1; //sbrPresentFlag = bitReaderBuffer.readBool();
                    __CLR4_5_2cdecdelvlullpi.R.inc(16351);if ((((sbrPresentFlag)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16352)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16353)==0&false))) {{
                        __CLR4_5_2cdecdelvlullpi.R.inc(16354);sizeInBits += 4; // extensionSamplingFrequencyIndex = bitReaderBuffer.readBits(4);
                        __CLR4_5_2cdecdelvlullpi.R.inc(16355);if ((((extensionSamplingFrequencyIndex == 0xf)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16356)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16357)==0&false))) {{
                            __CLR4_5_2cdecdelvlullpi.R.inc(16358);sizeInBits += 24; //extensionSamplingFrequency = bitReaderBuffer.readBits(24);
                        }
                    }}
                    }__CLR4_5_2cdecdelvlullpi.R.inc(16359);sizeInBits += 4; //extensionChannelConfiguration = bitReaderBuffer.readBits(4);
                }
            }}
        }}
        }__CLR4_5_2cdecdelvlullpi.R.inc(16360);return (int) Math.ceil(((double) sizeInBits) / 8);
    }finally{__CLR4_5_2cdecdelvlullpi.R.flushNeeded();}}

    public ByteBuffer serialize() {try{__CLR4_5_2cdecdelvlullpi.R.inc(16361);
        __CLR4_5_2cdecdelvlullpi.R.inc(16362);ByteBuffer out = ByteBuffer.allocate(getSize());
        __CLR4_5_2cdecdelvlullpi.R.inc(16363);IsoTypeWriter.writeUInt8(out, tag);
        __CLR4_5_2cdecdelvlullpi.R.inc(16364);writeSize(out, getContentSize());
        __CLR4_5_2cdecdelvlullpi.R.inc(16365);out.put(serializeConfigBytes());
        __CLR4_5_2cdecdelvlullpi.R.inc(16366);return (ByteBuffer) out.rewind();
    }finally{__CLR4_5_2cdecdelvlullpi.R.flushNeeded();}}

    private ByteBuffer serializeConfigBytes() {try{__CLR4_5_2cdecdelvlullpi.R.inc(16367);
        __CLR4_5_2cdecdelvlullpi.R.inc(16368);ByteBuffer out = ByteBuffer.wrap(new byte[getContentSize()]);
        __CLR4_5_2cdecdelvlullpi.R.inc(16369);BitWriterBuffer bitWriterBuffer = new BitWriterBuffer(out);
        __CLR4_5_2cdecdelvlullpi.R.inc(16370);writeAudioObjectType(originalAudioObjectType, bitWriterBuffer);
        __CLR4_5_2cdecdelvlullpi.R.inc(16371);bitWriterBuffer.writeBits(samplingFrequencyIndex, 4);

        __CLR4_5_2cdecdelvlullpi.R.inc(16372);if ((((samplingFrequencyIndex == 0xf)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16373)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16374)==0&false))) {{
            __CLR4_5_2cdecdelvlullpi.R.inc(16375);bitWriterBuffer.writeBits(samplingFrequency, 24);
        }

        }__CLR4_5_2cdecdelvlullpi.R.inc(16376);bitWriterBuffer.writeBits(channelConfiguration, 4);

        __CLR4_5_2cdecdelvlullpi.R.inc(16377);if ((((audioObjectType == 5 ||
                audioObjectType == 29)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16378)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16379)==0&false))) {{
            __CLR4_5_2cdecdelvlullpi.R.inc(16380);extensionAudioObjectType = 5;
            __CLR4_5_2cdecdelvlullpi.R.inc(16381);sbrPresentFlag = true;
            __CLR4_5_2cdecdelvlullpi.R.inc(16382);if ((((audioObjectType == 29)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16383)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16384)==0&false))) {{
                __CLR4_5_2cdecdelvlullpi.R.inc(16385);psPresentFlag = true;
            }
            }__CLR4_5_2cdecdelvlullpi.R.inc(16386);bitWriterBuffer.writeBits(extensionSamplingFrequencyIndex, 4);
            __CLR4_5_2cdecdelvlullpi.R.inc(16387);if ((((extensionSamplingFrequencyIndex == 0xf)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16388)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16389)==0&false)))
                {__CLR4_5_2cdecdelvlullpi.R.inc(16390);bitWriterBuffer.writeBits(extensionSamplingFrequency, 24);
            }__CLR4_5_2cdecdelvlullpi.R.inc(16391);writeAudioObjectType(audioObjectType, bitWriterBuffer);
            __CLR4_5_2cdecdelvlullpi.R.inc(16392);if ((((audioObjectType == 22)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16393)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16394)==0&false)))
                {__CLR4_5_2cdecdelvlullpi.R.inc(16395);bitWriterBuffer.writeBits(extensionChannelConfiguration, 4);
        }}
        }boolean __CLB4_5_2_bool2=false;__CLR4_5_2cdecdelvlullpi.R.inc(16396);switch (audioObjectType) {
            case 1:if (!__CLB4_5_2_bool2) {__CLR4_5_2cdecdelvlullpi.R.inc(16397);__CLB4_5_2_bool2=true;}
            case 2:if (!__CLB4_5_2_bool2) {__CLR4_5_2cdecdelvlullpi.R.inc(16398);__CLB4_5_2_bool2=true;}
            case 3:if (!__CLB4_5_2_bool2) {__CLR4_5_2cdecdelvlullpi.R.inc(16399);__CLB4_5_2_bool2=true;}
            case 4:if (!__CLB4_5_2_bool2) {__CLR4_5_2cdecdelvlullpi.R.inc(16400);__CLB4_5_2_bool2=true;}
            case 6:if (!__CLB4_5_2_bool2) {__CLR4_5_2cdecdelvlullpi.R.inc(16401);__CLB4_5_2_bool2=true;}
            case 7:if (!__CLB4_5_2_bool2) {__CLR4_5_2cdecdelvlullpi.R.inc(16402);__CLB4_5_2_bool2=true;}
            case 17:if (!__CLB4_5_2_bool2) {__CLR4_5_2cdecdelvlullpi.R.inc(16403);__CLB4_5_2_bool2=true;}
            case 19:if (!__CLB4_5_2_bool2) {__CLR4_5_2cdecdelvlullpi.R.inc(16404);__CLB4_5_2_bool2=true;}
            case 20:if (!__CLB4_5_2_bool2) {__CLR4_5_2cdecdelvlullpi.R.inc(16405);__CLB4_5_2_bool2=true;}
            case 21:if (!__CLB4_5_2_bool2) {__CLR4_5_2cdecdelvlullpi.R.inc(16406);__CLB4_5_2_bool2=true;}
            case 22:if (!__CLB4_5_2_bool2) {__CLR4_5_2cdecdelvlullpi.R.inc(16407);__CLB4_5_2_bool2=true;}
            case 23:if (!__CLB4_5_2_bool2) {__CLR4_5_2cdecdelvlullpi.R.inc(16408);__CLB4_5_2_bool2=true;}
                __CLR4_5_2cdecdelvlullpi.R.inc(16409);writeGaSpecificConfig(bitWriterBuffer);
                //GASpecificConfig();
                __CLR4_5_2cdecdelvlullpi.R.inc(16410);break;
            case 8:if (!__CLB4_5_2_bool2) {__CLR4_5_2cdecdelvlullpi.R.inc(16411);__CLB4_5_2_bool2=true;}
                __CLR4_5_2cdecdelvlullpi.R.inc(16412);throw new UnsupportedOperationException("can't write CelpSpecificConfig yet");
                //CelpSpecificConfig();
                //break;
            case 9:if (!__CLB4_5_2_bool2) {__CLR4_5_2cdecdelvlullpi.R.inc(16413);__CLB4_5_2_bool2=true;}
                __CLR4_5_2cdecdelvlullpi.R.inc(16414);throw new UnsupportedOperationException("can't write HvxcSpecificConfig yet");
                //HvxcSpecificConfig();
                //break;
            case 12:if (!__CLB4_5_2_bool2) {__CLR4_5_2cdecdelvlullpi.R.inc(16415);__CLB4_5_2_bool2=true;}
                __CLR4_5_2cdecdelvlullpi.R.inc(16416);throw new UnsupportedOperationException("can't write TTSSpecificConfig yet");
                //TTSSpecificConfig();
                //break;
            case 13:if (!__CLB4_5_2_bool2) {__CLR4_5_2cdecdelvlullpi.R.inc(16417);__CLB4_5_2_bool2=true;}
            case 14:if (!__CLB4_5_2_bool2) {__CLR4_5_2cdecdelvlullpi.R.inc(16418);__CLB4_5_2_bool2=true;}
            case 15:if (!__CLB4_5_2_bool2) {__CLR4_5_2cdecdelvlullpi.R.inc(16419);__CLB4_5_2_bool2=true;}
            case 16:if (!__CLB4_5_2_bool2) {__CLR4_5_2cdecdelvlullpi.R.inc(16420);__CLB4_5_2_bool2=true;}
                __CLR4_5_2cdecdelvlullpi.R.inc(16421);throw new UnsupportedOperationException("can't write StructuredAudioSpecificConfig yet");
                //StructuredAudioSpecificConfig();
                //break;
            case 24:if (!__CLB4_5_2_bool2) {__CLR4_5_2cdecdelvlullpi.R.inc(16422);__CLB4_5_2_bool2=true;}
                __CLR4_5_2cdecdelvlullpi.R.inc(16423);throw new UnsupportedOperationException("can't write ErrorResilientCelpSpecificConfig yet");
                //ErrorResilientCelpSpecificConfig();
                //break;
            case 25:if (!__CLB4_5_2_bool2) {__CLR4_5_2cdecdelvlullpi.R.inc(16424);__CLB4_5_2_bool2=true;}
                __CLR4_5_2cdecdelvlullpi.R.inc(16425);throw new UnsupportedOperationException("can't write ErrorResilientHvxcSpecificConfig yet");
                //ErrorResilientHvxcSpecificConfig();
                //break;
            case 26:if (!__CLB4_5_2_bool2) {__CLR4_5_2cdecdelvlullpi.R.inc(16426);__CLB4_5_2_bool2=true;}
            case 27:if (!__CLB4_5_2_bool2) {__CLR4_5_2cdecdelvlullpi.R.inc(16427);__CLB4_5_2_bool2=true;}
                __CLR4_5_2cdecdelvlullpi.R.inc(16428);throw new UnsupportedOperationException("can't write parseParametricSpecificConfig yet");
                // parseParametricSpecificConfig(samplingFrequencyIndex, channelConfiguration, audioObjectType, bitWriterBuffer);
                // ParametricSpecificConfig();
                // break;
            case 28:if (!__CLB4_5_2_bool2) {__CLR4_5_2cdecdelvlullpi.R.inc(16429);__CLB4_5_2_bool2=true;}
                __CLR4_5_2cdecdelvlullpi.R.inc(16430);throw new UnsupportedOperationException("can't write SSCSpecificConfig yet");
                //SSCSpecificConfig();
                //break;
            case 30:if (!__CLB4_5_2_bool2) {__CLR4_5_2cdecdelvlullpi.R.inc(16431);__CLB4_5_2_bool2=true;}
                __CLR4_5_2cdecdelvlullpi.R.inc(16432);bitWriterBuffer.writeBits(sacPayloadEmbedding, 1);
                __CLR4_5_2cdecdelvlullpi.R.inc(16433);throw new UnsupportedOperationException("can't write SpatialSpecificConfig yet");
                //SpatialSpecificConfig();
                //break;
            case 32:if (!__CLB4_5_2_bool2) {__CLR4_5_2cdecdelvlullpi.R.inc(16434);__CLB4_5_2_bool2=true;}
            case 33:if (!__CLB4_5_2_bool2) {__CLR4_5_2cdecdelvlullpi.R.inc(16435);__CLB4_5_2_bool2=true;}
            case 34:if (!__CLB4_5_2_bool2) {__CLR4_5_2cdecdelvlullpi.R.inc(16436);__CLB4_5_2_bool2=true;}
                __CLR4_5_2cdecdelvlullpi.R.inc(16437);throw new UnsupportedOperationException("can't write MPEG_1_2_SpecificConfig yet");
                //MPEG_1_2_SpecificConfig();
                //break;
            case 35:if (!__CLB4_5_2_bool2) {__CLR4_5_2cdecdelvlullpi.R.inc(16438);__CLB4_5_2_bool2=true;}
                __CLR4_5_2cdecdelvlullpi.R.inc(16439);throw new UnsupportedOperationException("can't write DSTSpecificConfig yet");
                //DSTSpecificConfig();
                //break;
            case 36:if (!__CLB4_5_2_bool2) {__CLR4_5_2cdecdelvlullpi.R.inc(16440);__CLB4_5_2_bool2=true;}
                __CLR4_5_2cdecdelvlullpi.R.inc(16441);bitWriterBuffer.writeBits(fillBits, 5);
                __CLR4_5_2cdecdelvlullpi.R.inc(16442);throw new UnsupportedOperationException("can't write ALSSpecificConfig yet");
                //ALSSpecificConfig();
                //break;
            case 37:if (!__CLB4_5_2_bool2) {__CLR4_5_2cdecdelvlullpi.R.inc(16443);__CLB4_5_2_bool2=true;}
            case 38:if (!__CLB4_5_2_bool2) {__CLR4_5_2cdecdelvlullpi.R.inc(16444);__CLB4_5_2_bool2=true;}
                __CLR4_5_2cdecdelvlullpi.R.inc(16445);throw new UnsupportedOperationException("can't write SLSSpecificConfig yet");
                //SLSSpecificConfig();
                //break;
            case 39:if (!__CLB4_5_2_bool2) {__CLR4_5_2cdecdelvlullpi.R.inc(16446);__CLB4_5_2_bool2=true;}
                __CLR4_5_2cdecdelvlullpi.R.inc(16447);throw new UnsupportedOperationException("can't write ELDSpecificConfig yet");
                //eldSpecificConfig = new ELDSpecificConfig(channelConfiguration, bitWriterBuffer);
                // break;
            case 40:if (!__CLB4_5_2_bool2) {__CLR4_5_2cdecdelvlullpi.R.inc(16448);__CLB4_5_2_bool2=true;}
            case 41:if (!__CLB4_5_2_bool2) {__CLR4_5_2cdecdelvlullpi.R.inc(16449);__CLB4_5_2_bool2=true;}
                __CLR4_5_2cdecdelvlullpi.R.inc(16450);throw new UnsupportedOperationException("can't parse SymbolicMusicSpecificConfig yet");
                //SymbolicMusicSpecificConfig();
                //break;
            default:if (!__CLB4_5_2_bool2) {__CLR4_5_2cdecdelvlullpi.R.inc(16451);__CLB4_5_2_bool2=true;}
                /* reserved */
        }

        boolean __CLB4_5_2_bool3=false;__CLR4_5_2cdecdelvlullpi.R.inc(16452);switch (audioObjectType) {
            case 17:if (!__CLB4_5_2_bool3) {__CLR4_5_2cdecdelvlullpi.R.inc(16453);__CLB4_5_2_bool3=true;}
            case 19:if (!__CLB4_5_2_bool3) {__CLR4_5_2cdecdelvlullpi.R.inc(16454);__CLB4_5_2_bool3=true;}
            case 20:if (!__CLB4_5_2_bool3) {__CLR4_5_2cdecdelvlullpi.R.inc(16455);__CLB4_5_2_bool3=true;}
            case 21:if (!__CLB4_5_2_bool3) {__CLR4_5_2cdecdelvlullpi.R.inc(16456);__CLB4_5_2_bool3=true;}
            case 22:if (!__CLB4_5_2_bool3) {__CLR4_5_2cdecdelvlullpi.R.inc(16457);__CLB4_5_2_bool3=true;}
            case 23:if (!__CLB4_5_2_bool3) {__CLR4_5_2cdecdelvlullpi.R.inc(16458);__CLB4_5_2_bool3=true;}
            case 24:if (!__CLB4_5_2_bool3) {__CLR4_5_2cdecdelvlullpi.R.inc(16459);__CLB4_5_2_bool3=true;}
            case 25:if (!__CLB4_5_2_bool3) {__CLR4_5_2cdecdelvlullpi.R.inc(16460);__CLB4_5_2_bool3=true;}
            case 26:if (!__CLB4_5_2_bool3) {__CLR4_5_2cdecdelvlullpi.R.inc(16461);__CLB4_5_2_bool3=true;}
            case 27:if (!__CLB4_5_2_bool3) {__CLR4_5_2cdecdelvlullpi.R.inc(16462);__CLB4_5_2_bool3=true;}
            case 39:if (!__CLB4_5_2_bool3) {__CLR4_5_2cdecdelvlullpi.R.inc(16463);__CLB4_5_2_bool3=true;}
                __CLR4_5_2cdecdelvlullpi.R.inc(16464);bitWriterBuffer.writeBits(epConfig, 2);
                __CLR4_5_2cdecdelvlullpi.R.inc(16465);if ((((epConfig == 2 || epConfig == 3)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16466)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16467)==0&false))) {{
                    __CLR4_5_2cdecdelvlullpi.R.inc(16468);throw new UnsupportedOperationException("can't parse ErrorProtectionSpecificConfig yet");
                    //ErrorProtectionSpecificConfig();
                }
                }__CLR4_5_2cdecdelvlullpi.R.inc(16469);if ((((epConfig == 3)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16470)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16471)==0&false))) {{
                    __CLR4_5_2cdecdelvlullpi.R.inc(16472);bitWriterBuffer.writeBits(directMapping, 1);
                    __CLR4_5_2cdecdelvlullpi.R.inc(16473);if ((((directMapping == 0)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16474)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16475)==0&false))) {{
                        /* tbd */
                        __CLR4_5_2cdecdelvlullpi.R.inc(16476);throw new RuntimeException("not implemented");
                    }
                }}
        }}

        __CLR4_5_2cdecdelvlullpi.R.inc(16477);if ((((outerSyncExtensionType >= 0)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16478)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16479)==0&false))) {{
            __CLR4_5_2cdecdelvlullpi.R.inc(16480);bitWriterBuffer.writeBits(outerSyncExtensionType, 11);
            __CLR4_5_2cdecdelvlullpi.R.inc(16481);if ((((outerSyncExtensionType == 0x2b7)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16482)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16483)==0&false))) {{// 695
                __CLR4_5_2cdecdelvlullpi.R.inc(16484);writeAudioObjectType(extensionAudioObjectType, bitWriterBuffer);
                __CLR4_5_2cdecdelvlullpi.R.inc(16485);if ((((extensionAudioObjectType == 5)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16486)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16487)==0&false))) {{
                    __CLR4_5_2cdecdelvlullpi.R.inc(16488);bitWriterBuffer.writeBool(sbrPresentFlag);
                    __CLR4_5_2cdecdelvlullpi.R.inc(16489);if ((((sbrPresentFlag)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16490)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16491)==0&false))) {{
                        __CLR4_5_2cdecdelvlullpi.R.inc(16492);bitWriterBuffer.writeBits(extensionSamplingFrequencyIndex, 4);
                        __CLR4_5_2cdecdelvlullpi.R.inc(16493);if ((((extensionSamplingFrequencyIndex == 0xf)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16494)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16495)==0&false))) {{
                            __CLR4_5_2cdecdelvlullpi.R.inc(16496);bitWriterBuffer.writeBits(extensionSamplingFrequency, 24);
                        }
                        }__CLR4_5_2cdecdelvlullpi.R.inc(16497);if ((((innerSyncExtensionType >= 0)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16498)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16499)==0&false))) {{
                            __CLR4_5_2cdecdelvlullpi.R.inc(16500);bitWriterBuffer.writeBits(innerSyncExtensionType, 11); //10101001000
                            __CLR4_5_2cdecdelvlullpi.R.inc(16501);if ((((syncExtensionType == 0x548)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16502)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16503)==0&false))) {{
                                __CLR4_5_2cdecdelvlullpi.R.inc(16504);bitWriterBuffer.writeBool(psPresentFlag);
                            }
                        }}
                    }}
                }}
                }__CLR4_5_2cdecdelvlullpi.R.inc(16505);if ((((extensionAudioObjectType == 22)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16506)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16507)==0&false))) {{
                    __CLR4_5_2cdecdelvlullpi.R.inc(16508);bitWriterBuffer.writeBool(sbrPresentFlag);
                    __CLR4_5_2cdecdelvlullpi.R.inc(16509);if ((((sbrPresentFlag)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16510)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16511)==0&false))) {{
                        __CLR4_5_2cdecdelvlullpi.R.inc(16512);bitWriterBuffer.writeBits(extensionSamplingFrequencyIndex, 4);
                        __CLR4_5_2cdecdelvlullpi.R.inc(16513);if ((((extensionSamplingFrequencyIndex == 0xf)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16514)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16515)==0&false))) {{
                            __CLR4_5_2cdecdelvlullpi.R.inc(16516);bitWriterBuffer.writeBits(extensionSamplingFrequency, 24);
                        }
                    }}
                    }__CLR4_5_2cdecdelvlullpi.R.inc(16517);bitWriterBuffer.writeBits(extensionChannelConfiguration, 4);
                }
            }}
        }}

        }__CLR4_5_2cdecdelvlullpi.R.inc(16518);return (ByteBuffer) out.rewind();
    }finally{__CLR4_5_2cdecdelvlullpi.R.flushNeeded();}}

    private void writeAudioObjectType(int audioObjectType, BitWriterBuffer bitWriterBuffer) {try{__CLR4_5_2cdecdelvlullpi.R.inc(16519);
        __CLR4_5_2cdecdelvlullpi.R.inc(16520);if ((((audioObjectType >= 32)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16521)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16522)==0&false))) {{
            __CLR4_5_2cdecdelvlullpi.R.inc(16523);bitWriterBuffer.writeBits(31, 5);
            __CLR4_5_2cdecdelvlullpi.R.inc(16524);bitWriterBuffer.writeBits(audioObjectType - 32, 6);
        } }else {{
            __CLR4_5_2cdecdelvlullpi.R.inc(16525);bitWriterBuffer.writeBits(audioObjectType, 5);
        }
    }}finally{__CLR4_5_2cdecdelvlullpi.R.flushNeeded();}}

    private int getAudioObjectType(BitReaderBuffer in) throws IOException {try{__CLR4_5_2cdecdelvlullpi.R.inc(16526);
        __CLR4_5_2cdecdelvlullpi.R.inc(16527);int audioObjectType = in.readBits(5);
        __CLR4_5_2cdecdelvlullpi.R.inc(16528);if ((((audioObjectType == 31)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16529)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16530)==0&false))) {{
            __CLR4_5_2cdecdelvlullpi.R.inc(16531);audioObjectType = 32 + in.readBits(6);
        }
        }__CLR4_5_2cdecdelvlullpi.R.inc(16532);return audioObjectType;
    }finally{__CLR4_5_2cdecdelvlullpi.R.flushNeeded();}}

    private void parseGaSpecificConfig(int samplingFrequencyIndex, int channelConfiguration, int audioObjectType, BitReaderBuffer in) throws IOException {try{__CLR4_5_2cdecdelvlullpi.R.inc(16533);
//    GASpecificConfig (samplingFrequencyIndex,
//            channelConfiguration,
//            audioObjectType)
//    {
        __CLR4_5_2cdecdelvlullpi.R.inc(16534);frameLengthFlag = in.readBits(1);
        __CLR4_5_2cdecdelvlullpi.R.inc(16535);dependsOnCoreCoder = in.readBits(1);
        __CLR4_5_2cdecdelvlullpi.R.inc(16536);if ((((dependsOnCoreCoder == 1)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16537)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16538)==0&false))) {{
            __CLR4_5_2cdecdelvlullpi.R.inc(16539);coreCoderDelay = in.readBits(14);
        }
        }__CLR4_5_2cdecdelvlullpi.R.inc(16540);extensionFlag = in.readBits(1);
        __CLR4_5_2cdecdelvlullpi.R.inc(16541);if ((((channelConfiguration == 0)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16542)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16543)==0&false))) {{
            __CLR4_5_2cdecdelvlullpi.R.inc(16544);throw new UnsupportedOperationException("can't parse program_config_element yet");
            //program_config_element ();
        }
        }__CLR4_5_2cdecdelvlullpi.R.inc(16545);if (((((audioObjectType == 6) || (audioObjectType == 20))&&(__CLR4_5_2cdecdelvlullpi.R.iget(16546)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16547)==0&false))) {{
            __CLR4_5_2cdecdelvlullpi.R.inc(16548);layerNr = in.readBits(3);
        }
        }__CLR4_5_2cdecdelvlullpi.R.inc(16549);if ((((extensionFlag == 1)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16550)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16551)==0&false))) {{
            __CLR4_5_2cdecdelvlullpi.R.inc(16552);if ((((audioObjectType == 22)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16553)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16554)==0&false))) {{
                __CLR4_5_2cdecdelvlullpi.R.inc(16555);numOfSubFrame = in.readBits(5);
                __CLR4_5_2cdecdelvlullpi.R.inc(16556);layer_length = in.readBits(11);
            }
            }__CLR4_5_2cdecdelvlullpi.R.inc(16557);if ((((audioObjectType == 17 || audioObjectType == 19 ||
                    audioObjectType == 20 || audioObjectType == 23)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16558)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16559)==0&false))) {{
                __CLR4_5_2cdecdelvlullpi.R.inc(16560);aacSectionDataResilienceFlag = in.readBool();
                __CLR4_5_2cdecdelvlullpi.R.inc(16561);aacScalefactorDataResilienceFlag = in.readBool();
                __CLR4_5_2cdecdelvlullpi.R.inc(16562);aacSpectralDataResilienceFlag = in.readBool();
            }
            }__CLR4_5_2cdecdelvlullpi.R.inc(16563);extensionFlag3 = in.readBits(1);
            __CLR4_5_2cdecdelvlullpi.R.inc(16564);if ((((extensionFlag3 == 1)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16565)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16566)==0&false))) {{
                __CLR4_5_2cdecdelvlullpi.R.inc(16567);throw new RuntimeException("not yet implemented");
            }
        }}
//    }
        }__CLR4_5_2cdecdelvlullpi.R.inc(16568);gaSpecificConfig = true;
    }finally{__CLR4_5_2cdecdelvlullpi.R.flushNeeded();}}

    private void writeGaSpecificConfig(BitWriterBuffer out) {try{__CLR4_5_2cdecdelvlullpi.R.inc(16569);
//    GASpecificConfig (samplingFrequencyIndex,
//            channelConfiguration,
//            audioObjectType)
//    {
        __CLR4_5_2cdecdelvlullpi.R.inc(16570);out.writeBits(frameLengthFlag, 1); // frameLengthFlag = in.readBits(1);
        __CLR4_5_2cdecdelvlullpi.R.inc(16571);out.writeBits(dependsOnCoreCoder, 1); //= in.readBits(1);
        __CLR4_5_2cdecdelvlullpi.R.inc(16572);if ((((dependsOnCoreCoder == 1)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16573)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16574)==0&false))) {{
            __CLR4_5_2cdecdelvlullpi.R.inc(16575);out.writeBits(coreCoderDelay, 14); // = in.readBits(14);
        }
        }__CLR4_5_2cdecdelvlullpi.R.inc(16576);out.writeBits(extensionFlag, 1); // = in.readBits(1);
        __CLR4_5_2cdecdelvlullpi.R.inc(16577);if ((((channelConfiguration == 0)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16578)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16579)==0&false))) {{
            __CLR4_5_2cdecdelvlullpi.R.inc(16580);throw new UnsupportedOperationException("can't parse program_config_element yet");
            //program_config_element ();
        }
        }__CLR4_5_2cdecdelvlullpi.R.inc(16581);if (((((audioObjectType == 6) || (audioObjectType == 20))&&(__CLR4_5_2cdecdelvlullpi.R.iget(16582)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16583)==0&false))) {{
            __CLR4_5_2cdecdelvlullpi.R.inc(16584);out.writeBits(layerNr, 3);// = in.readBits(3);
        }
        }__CLR4_5_2cdecdelvlullpi.R.inc(16585);if ((((extensionFlag == 1)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16586)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16587)==0&false))) {{
            __CLR4_5_2cdecdelvlullpi.R.inc(16588);if ((((audioObjectType == 22)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16589)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16590)==0&false))) {{
                __CLR4_5_2cdecdelvlullpi.R.inc(16591);out.writeBits(numOfSubFrame, 5); // = in.readBits(5);
                __CLR4_5_2cdecdelvlullpi.R.inc(16592);out.writeBits(layer_length, 11); // = in.readBits(11);
            }
            }__CLR4_5_2cdecdelvlullpi.R.inc(16593);if ((((audioObjectType == 17 || audioObjectType == 19 ||
                    audioObjectType == 20 || audioObjectType == 23)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16594)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16595)==0&false))) {{
                __CLR4_5_2cdecdelvlullpi.R.inc(16596);out.writeBool(aacSectionDataResilienceFlag); // = in.readBool();
                __CLR4_5_2cdecdelvlullpi.R.inc(16597);out.writeBool(aacScalefactorDataResilienceFlag); // = in.readBool();
                __CLR4_5_2cdecdelvlullpi.R.inc(16598);out.writeBool(aacSpectralDataResilienceFlag); // = in.readBool();
            }
            }__CLR4_5_2cdecdelvlullpi.R.inc(16599);out.writeBits(extensionFlag3, 1); // = in.readBits(1);
            __CLR4_5_2cdecdelvlullpi.R.inc(16600);if ((((extensionFlag3 == 1)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16601)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16602)==0&false))) {{
                __CLR4_5_2cdecdelvlullpi.R.inc(16603);throw new RuntimeException("not yet implemented");
            }
        }}
    }}finally{__CLR4_5_2cdecdelvlullpi.R.flushNeeded();}}

    private void parseParametricSpecificConfig(int samplingFrequencyIndex, int channelConfiguration, int audioObjectType, BitReaderBuffer in) throws IOException {try{__CLR4_5_2cdecdelvlullpi.R.inc(16604);
        /*
        ParametricSpecificConfig() {
            isBaseLayer; 1 uimsbf
            if (isBaseLayer) {
                PARAconfig();
            } else {
                HILNenexConfig();
            }
        }
        */
        __CLR4_5_2cdecdelvlullpi.R.inc(16605);isBaseLayer = in.readBits(1);
        __CLR4_5_2cdecdelvlullpi.R.inc(16606);if ((((isBaseLayer == 1)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16607)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16608)==0&false))) {{
            __CLR4_5_2cdecdelvlullpi.R.inc(16609);parseParaConfig(samplingFrequencyIndex, channelConfiguration, audioObjectType, in);
        } }else {{
            __CLR4_5_2cdecdelvlullpi.R.inc(16610);parseHilnEnexConfig(samplingFrequencyIndex, channelConfiguration, audioObjectType, in);
        }
    }}finally{__CLR4_5_2cdecdelvlullpi.R.flushNeeded();}}

    private void parseParaConfig(int samplingFrequencyIndex, int channelConfiguration, int audioObjectType, BitReaderBuffer in) throws IOException {try{__CLR4_5_2cdecdelvlullpi.R.inc(16611);
        /*
        PARAconfig()
        {
            PARAmode; 2 uimsbf
            if (PARAmode != 1) {
                ErHVXCconfig();
            }
            if (PARAmode != 0) {
                HILNconfig();
            }
            PARAextensionFlag; 1 uimsbf
            if (PARAextensionFlag) {
                // to be defined in MPEG-4 Phase 3
            }
        }
        */
        __CLR4_5_2cdecdelvlullpi.R.inc(16612);paraMode = in.readBits(2);

        __CLR4_5_2cdecdelvlullpi.R.inc(16613);if ((((paraMode != 1)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16614)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16615)==0&false))) {{
            __CLR4_5_2cdecdelvlullpi.R.inc(16616);parseErHvxcConfig(samplingFrequencyIndex, channelConfiguration, audioObjectType, in);
        }
        }__CLR4_5_2cdecdelvlullpi.R.inc(16617);if ((((paraMode != 0)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16618)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16619)==0&false))) {{
            __CLR4_5_2cdecdelvlullpi.R.inc(16620);parseHilnConfig(samplingFrequencyIndex, channelConfiguration, audioObjectType, in);
        }

        }__CLR4_5_2cdecdelvlullpi.R.inc(16621);paraExtensionFlag = in.readBits(1);
        __CLR4_5_2cdecdelvlullpi.R.inc(16622);parametricSpecificConfig = true;
    }finally{__CLR4_5_2cdecdelvlullpi.R.flushNeeded();}}

    private void parseErHvxcConfig(int samplingFrequencyIndex, int channelConfiguration, int audioObjectType, BitReaderBuffer in) throws IOException {try{__CLR4_5_2cdecdelvlullpi.R.inc(16623);
        /*
        ErHVXCconfig()
        {
            HVXCvarMode; 1 uimsbf
                HVXCrateMode; 2 uimsbf
                extensionFlag; 1 uimsbf
            if (extensionFlag) {
                var_ScalableFlag; 1 uimsbf
            }
        }
        */
        __CLR4_5_2cdecdelvlullpi.R.inc(16624);hvxcVarMode = in.readBits(1);
        __CLR4_5_2cdecdelvlullpi.R.inc(16625);hvxcRateMode = in.readBits(2);
        __CLR4_5_2cdecdelvlullpi.R.inc(16626);erHvxcExtensionFlag = in.readBits(1);

        __CLR4_5_2cdecdelvlullpi.R.inc(16627);if ((((erHvxcExtensionFlag == 1)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16628)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16629)==0&false))) {{
            __CLR4_5_2cdecdelvlullpi.R.inc(16630);var_ScalableFlag = in.readBits(1);
        }
    }}finally{__CLR4_5_2cdecdelvlullpi.R.flushNeeded();}}

    private void parseHilnConfig(int samplingFrequencyIndex, int channelConfiguration, int audioObjectType, BitReaderBuffer in) throws IOException {try{__CLR4_5_2cdecdelvlullpi.R.inc(16631);
        /*
        HILNconfig()
        {
            HILNquantMode; 1 uimsbf
            HILNmaxNumLine; 8 uimsbf
            HILNsampleRateCode; 4 uimsbf
            HILNframeLength; 12 uimsbf
            HILNcontMode; 2 uimsbf
        }
        */
        __CLR4_5_2cdecdelvlullpi.R.inc(16632);hilnQuantMode = in.readBits(1);
        __CLR4_5_2cdecdelvlullpi.R.inc(16633);hilnMaxNumLine = in.readBits(8);
        __CLR4_5_2cdecdelvlullpi.R.inc(16634);hilnSampleRateCode = in.readBits(4);
        __CLR4_5_2cdecdelvlullpi.R.inc(16635);hilnFrameLength = in.readBits(12);
        __CLR4_5_2cdecdelvlullpi.R.inc(16636);hilnContMode = in.readBits(2);
    }finally{__CLR4_5_2cdecdelvlullpi.R.flushNeeded();}}

    private void parseHilnEnexConfig(int samplingFrequencyIndex, int channelConfiguration, int audioObjectType, BitReaderBuffer in) throws IOException {try{__CLR4_5_2cdecdelvlullpi.R.inc(16637);
        /*
        HILNenexConfig()
        {
            HILNenhaLayer; 1 uimsbf
            if (HILNenhaLayer) {
                HILNenhaQuantMode; 2 uimsbf
            }
        }
        */
        __CLR4_5_2cdecdelvlullpi.R.inc(16638);hilnEnhaLayer = in.readBits(1);
        __CLR4_5_2cdecdelvlullpi.R.inc(16639);if ((((hilnEnhaLayer == 1)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16640)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16641)==0&false))) {{
            __CLR4_5_2cdecdelvlullpi.R.inc(16642);hilnEnhaQuantMode = in.readBits(2);
        }
    }}finally{__CLR4_5_2cdecdelvlullpi.R.flushNeeded();}}

    public byte[] getConfigBytes() {try{__CLR4_5_2cdecdelvlullpi.R.inc(16643);
        __CLR4_5_2cdecdelvlullpi.R.inc(16644);return serializeConfigBytes().array();
    }finally{__CLR4_5_2cdecdelvlullpi.R.flushNeeded();}}

    public int getAudioObjectType() {try{__CLR4_5_2cdecdelvlullpi.R.inc(16645);
        __CLR4_5_2cdecdelvlullpi.R.inc(16646);return audioObjectType;
    }finally{__CLR4_5_2cdecdelvlullpi.R.flushNeeded();}}

    public void setAudioObjectType(int audioObjectType) {try{__CLR4_5_2cdecdelvlullpi.R.inc(16647);
        __CLR4_5_2cdecdelvlullpi.R.inc(16648);this.audioObjectType = audioObjectType;
    }finally{__CLR4_5_2cdecdelvlullpi.R.flushNeeded();}}

    public void setOriginalAudioObjectType(int originalAudioObjectType) {try{__CLR4_5_2cdecdelvlullpi.R.inc(16649);
        __CLR4_5_2cdecdelvlullpi.R.inc(16650);this.originalAudioObjectType = originalAudioObjectType;
    }finally{__CLR4_5_2cdecdelvlullpi.R.flushNeeded();}}

    public int getExtensionAudioObjectType() {try{__CLR4_5_2cdecdelvlullpi.R.inc(16651);
        __CLR4_5_2cdecdelvlullpi.R.inc(16652);return extensionAudioObjectType;
    }finally{__CLR4_5_2cdecdelvlullpi.R.flushNeeded();}}

    public void setSamplingFrequencyIndex(int samplingFrequencyIndex) {try{__CLR4_5_2cdecdelvlullpi.R.inc(16653);
        __CLR4_5_2cdecdelvlullpi.R.inc(16654);this.samplingFrequencyIndex = samplingFrequencyIndex;
    }finally{__CLR4_5_2cdecdelvlullpi.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_5_2cdecdelvlullpi.R.inc(16655);
        __CLR4_5_2cdecdelvlullpi.R.inc(16656);final StringBuilder sb = new StringBuilder();
        __CLR4_5_2cdecdelvlullpi.R.inc(16657);sb.append("AudioSpecificConfig");
        __CLR4_5_2cdecdelvlullpi.R.inc(16658);sb.append("{configBytes=").append(Hex.encodeHex(configBytes));
        __CLR4_5_2cdecdelvlullpi.R.inc(16659);sb.append(", audioObjectType=").append(audioObjectType).append(" (").append(audioObjectTypeMap.get(audioObjectType)).append(")");
        __CLR4_5_2cdecdelvlullpi.R.inc(16660);sb.append(", samplingFrequencyIndex=").append(samplingFrequencyIndex).append(" (").append(samplingFrequencyIndexMap.get(samplingFrequencyIndex)).append(")");
        __CLR4_5_2cdecdelvlullpi.R.inc(16661);sb.append(", samplingFrequency=").append(samplingFrequency);
        __CLR4_5_2cdecdelvlullpi.R.inc(16662);sb.append(", channelConfiguration=").append(channelConfiguration);
        __CLR4_5_2cdecdelvlullpi.R.inc(16663);if ((((extensionAudioObjectType > 0)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16664)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16665)==0&false))) {{
            __CLR4_5_2cdecdelvlullpi.R.inc(16666);sb.append(", extensionAudioObjectType=").append(extensionAudioObjectType).append(" (").append(audioObjectTypeMap.get(extensionAudioObjectType)).append(")");
            __CLR4_5_2cdecdelvlullpi.R.inc(16667);sb.append(", sbrPresentFlag=").append(sbrPresentFlag);
            __CLR4_5_2cdecdelvlullpi.R.inc(16668);sb.append(", psPresentFlag=").append(psPresentFlag);
            __CLR4_5_2cdecdelvlullpi.R.inc(16669);sb.append(", extensionSamplingFrequencyIndex=").append(extensionSamplingFrequencyIndex).append(" (").append(samplingFrequencyIndexMap.get(extensionSamplingFrequencyIndex)).append(")");
            __CLR4_5_2cdecdelvlullpi.R.inc(16670);sb.append(", extensionSamplingFrequency=").append(extensionSamplingFrequency);
            __CLR4_5_2cdecdelvlullpi.R.inc(16671);sb.append(", extensionChannelConfiguration=").append(extensionChannelConfiguration);
        }
//    sb.append(", sacPayloadEmbedding=").append(sacPayloadEmbedding);
//    sb.append(", fillBits=").append(fillBits);
//    sb.append(", epConfig=").append(epConfig);
//    sb.append(", directMapping=").append(directMapping);
        }__CLR4_5_2cdecdelvlullpi.R.inc(16672);sb.append(", syncExtensionType=").append(syncExtensionType);
        __CLR4_5_2cdecdelvlullpi.R.inc(16673);if ((((gaSpecificConfig)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16674)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16675)==0&false))) {{
            __CLR4_5_2cdecdelvlullpi.R.inc(16676);sb.append(", frameLengthFlag=").append(frameLengthFlag);
            __CLR4_5_2cdecdelvlullpi.R.inc(16677);sb.append(", dependsOnCoreCoder=").append(dependsOnCoreCoder);
            __CLR4_5_2cdecdelvlullpi.R.inc(16678);sb.append(", coreCoderDelay=").append(coreCoderDelay);
            __CLR4_5_2cdecdelvlullpi.R.inc(16679);sb.append(", extensionFlag=").append(extensionFlag);
            __CLR4_5_2cdecdelvlullpi.R.inc(16680);sb.append(", layerNr=").append(layerNr);
            __CLR4_5_2cdecdelvlullpi.R.inc(16681);sb.append(", numOfSubFrame=").append(numOfSubFrame);
            __CLR4_5_2cdecdelvlullpi.R.inc(16682);sb.append(", layer_length=").append(layer_length);
            __CLR4_5_2cdecdelvlullpi.R.inc(16683);sb.append(", aacSectionDataResilienceFlag=").append(aacSectionDataResilienceFlag);
            __CLR4_5_2cdecdelvlullpi.R.inc(16684);sb.append(", aacScalefactorDataResilienceFlag=").append(aacScalefactorDataResilienceFlag);
            __CLR4_5_2cdecdelvlullpi.R.inc(16685);sb.append(", aacSpectralDataResilienceFlag=").append(aacSpectralDataResilienceFlag);
            __CLR4_5_2cdecdelvlullpi.R.inc(16686);sb.append(", extensionFlag3=").append(extensionFlag3);
        }
        }__CLR4_5_2cdecdelvlullpi.R.inc(16687);if ((((parametricSpecificConfig)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16688)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16689)==0&false))) {{
            __CLR4_5_2cdecdelvlullpi.R.inc(16690);sb.append(", isBaseLayer=").append(isBaseLayer);
            __CLR4_5_2cdecdelvlullpi.R.inc(16691);sb.append(", paraMode=").append(paraMode);
            __CLR4_5_2cdecdelvlullpi.R.inc(16692);sb.append(", paraExtensionFlag=").append(paraExtensionFlag);
            __CLR4_5_2cdecdelvlullpi.R.inc(16693);sb.append(", hvxcVarMode=").append(hvxcVarMode);
            __CLR4_5_2cdecdelvlullpi.R.inc(16694);sb.append(", hvxcRateMode=").append(hvxcRateMode);
            __CLR4_5_2cdecdelvlullpi.R.inc(16695);sb.append(", erHvxcExtensionFlag=").append(erHvxcExtensionFlag);
            __CLR4_5_2cdecdelvlullpi.R.inc(16696);sb.append(", var_ScalableFlag=").append(var_ScalableFlag);
            __CLR4_5_2cdecdelvlullpi.R.inc(16697);sb.append(", hilnQuantMode=").append(hilnQuantMode);
            __CLR4_5_2cdecdelvlullpi.R.inc(16698);sb.append(", hilnMaxNumLine=").append(hilnMaxNumLine);
            __CLR4_5_2cdecdelvlullpi.R.inc(16699);sb.append(", hilnSampleRateCode=").append(hilnSampleRateCode);
            __CLR4_5_2cdecdelvlullpi.R.inc(16700);sb.append(", hilnFrameLength=").append(hilnFrameLength);
            __CLR4_5_2cdecdelvlullpi.R.inc(16701);sb.append(", hilnContMode=").append(hilnContMode);
            __CLR4_5_2cdecdelvlullpi.R.inc(16702);sb.append(", hilnEnhaLayer=").append(hilnEnhaLayer);
            __CLR4_5_2cdecdelvlullpi.R.inc(16703);sb.append(", hilnEnhaQuantMode=").append(hilnEnhaQuantMode);
        }
        }__CLR4_5_2cdecdelvlullpi.R.inc(16704);sb.append('}');
        __CLR4_5_2cdecdelvlullpi.R.inc(16705);return sb.toString();
    }finally{__CLR4_5_2cdecdelvlullpi.R.flushNeeded();}}

    public int getSamplingFrequency() {try{__CLR4_5_2cdecdelvlullpi.R.inc(16706);
        __CLR4_5_2cdecdelvlullpi.R.inc(16707);return (((samplingFrequencyIndex == 0xf )&&(__CLR4_5_2cdecdelvlullpi.R.iget(16708)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16709)==0&false))? samplingFrequency : samplingFrequencyIndexMap.get(samplingFrequencyIndex);
    }finally{__CLR4_5_2cdecdelvlullpi.R.flushNeeded();}}

    public int getExtensionSamplingFrequency() {try{__CLR4_5_2cdecdelvlullpi.R.inc(16710);
        __CLR4_5_2cdecdelvlullpi.R.inc(16711);return (((extensionSamplingFrequencyIndex == 0xf )&&(__CLR4_5_2cdecdelvlullpi.R.iget(16712)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16713)==0&false))? extensionSamplingFrequency : samplingFrequencyIndexMap.get(extensionSamplingFrequencyIndex);
    }finally{__CLR4_5_2cdecdelvlullpi.R.flushNeeded();}}

    public void setSamplingFrequency(int samplingFrequency) {try{__CLR4_5_2cdecdelvlullpi.R.inc(16714);
        __CLR4_5_2cdecdelvlullpi.R.inc(16715);this.samplingFrequency = samplingFrequency;
    }finally{__CLR4_5_2cdecdelvlullpi.R.flushNeeded();}}

    public int getChannelConfiguration() {try{__CLR4_5_2cdecdelvlullpi.R.inc(16716);
        __CLR4_5_2cdecdelvlullpi.R.inc(16717);return channelConfiguration;
    }finally{__CLR4_5_2cdecdelvlullpi.R.flushNeeded();}}

    public void setChannelConfiguration(int channelConfiguration) {try{__CLR4_5_2cdecdelvlullpi.R.inc(16718);
        __CLR4_5_2cdecdelvlullpi.R.inc(16719);this.channelConfiguration = channelConfiguration;
    }finally{__CLR4_5_2cdecdelvlullpi.R.flushNeeded();}}

    @Override
    public boolean equals(Object o) {try{__CLR4_5_2cdecdelvlullpi.R.inc(16720);
        __CLR4_5_2cdecdelvlullpi.R.inc(16721);if ((((this == o)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16722)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16723)==0&false))) {{
            __CLR4_5_2cdecdelvlullpi.R.inc(16724);return true;
        }
        }__CLR4_5_2cdecdelvlullpi.R.inc(16725);if ((((o == null || getClass() != o.getClass())&&(__CLR4_5_2cdecdelvlullpi.R.iget(16726)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16727)==0&false))) {{
            __CLR4_5_2cdecdelvlullpi.R.inc(16728);return false;
        }

        }__CLR4_5_2cdecdelvlullpi.R.inc(16729);AudioSpecificConfig that = (AudioSpecificConfig) o;

        __CLR4_5_2cdecdelvlullpi.R.inc(16730);if ((((aacScalefactorDataResilienceFlag != that.aacScalefactorDataResilienceFlag)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16731)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16732)==0&false))) {{
            __CLR4_5_2cdecdelvlullpi.R.inc(16733);return false;
        }
        }__CLR4_5_2cdecdelvlullpi.R.inc(16734);if ((((aacSectionDataResilienceFlag != that.aacSectionDataResilienceFlag)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16735)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16736)==0&false))) {{
            __CLR4_5_2cdecdelvlullpi.R.inc(16737);return false;
        }
        }__CLR4_5_2cdecdelvlullpi.R.inc(16738);if ((((aacSpectralDataResilienceFlag != that.aacSpectralDataResilienceFlag)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16739)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16740)==0&false))) {{
            __CLR4_5_2cdecdelvlullpi.R.inc(16741);return false;
        }
        }__CLR4_5_2cdecdelvlullpi.R.inc(16742);if ((((audioObjectType != that.audioObjectType)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16743)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16744)==0&false))) {{
            __CLR4_5_2cdecdelvlullpi.R.inc(16745);return false;
        }
        }__CLR4_5_2cdecdelvlullpi.R.inc(16746);if ((((channelConfiguration != that.channelConfiguration)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16747)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16748)==0&false))) {{
            __CLR4_5_2cdecdelvlullpi.R.inc(16749);return false;
        }
        }__CLR4_5_2cdecdelvlullpi.R.inc(16750);if ((((coreCoderDelay != that.coreCoderDelay)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16751)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16752)==0&false))) {{
            __CLR4_5_2cdecdelvlullpi.R.inc(16753);return false;
        }
        }__CLR4_5_2cdecdelvlullpi.R.inc(16754);if ((((dependsOnCoreCoder != that.dependsOnCoreCoder)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16755)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16756)==0&false))) {{
            __CLR4_5_2cdecdelvlullpi.R.inc(16757);return false;
        }
        }__CLR4_5_2cdecdelvlullpi.R.inc(16758);if ((((directMapping != that.directMapping)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16759)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16760)==0&false))) {{
            __CLR4_5_2cdecdelvlullpi.R.inc(16761);return false;
        }
        }__CLR4_5_2cdecdelvlullpi.R.inc(16762);if ((((epConfig != that.epConfig)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16763)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16764)==0&false))) {{
            __CLR4_5_2cdecdelvlullpi.R.inc(16765);return false;
        }
        }__CLR4_5_2cdecdelvlullpi.R.inc(16766);if ((((erHvxcExtensionFlag != that.erHvxcExtensionFlag)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16767)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16768)==0&false))) {{
            __CLR4_5_2cdecdelvlullpi.R.inc(16769);return false;
        }
        }__CLR4_5_2cdecdelvlullpi.R.inc(16770);if ((((extensionAudioObjectType != that.extensionAudioObjectType)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16771)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16772)==0&false))) {{
            __CLR4_5_2cdecdelvlullpi.R.inc(16773);return false;
        }
        }__CLR4_5_2cdecdelvlullpi.R.inc(16774);if ((((extensionChannelConfiguration != that.extensionChannelConfiguration)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16775)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16776)==0&false))) {{
            __CLR4_5_2cdecdelvlullpi.R.inc(16777);return false;
        }
        }__CLR4_5_2cdecdelvlullpi.R.inc(16778);if ((((extensionFlag != that.extensionFlag)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16779)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16780)==0&false))) {{
            __CLR4_5_2cdecdelvlullpi.R.inc(16781);return false;
        }
        }__CLR4_5_2cdecdelvlullpi.R.inc(16782);if ((((extensionFlag3 != that.extensionFlag3)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16783)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16784)==0&false))) {{
            __CLR4_5_2cdecdelvlullpi.R.inc(16785);return false;
        }
        }__CLR4_5_2cdecdelvlullpi.R.inc(16786);if ((((extensionSamplingFrequency != that.extensionSamplingFrequency)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16787)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16788)==0&false))) {{
            __CLR4_5_2cdecdelvlullpi.R.inc(16789);return false;
        }
        }__CLR4_5_2cdecdelvlullpi.R.inc(16790);if ((((extensionSamplingFrequencyIndex != that.extensionSamplingFrequencyIndex)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16791)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16792)==0&false))) {{
            __CLR4_5_2cdecdelvlullpi.R.inc(16793);return false;
        }
        }__CLR4_5_2cdecdelvlullpi.R.inc(16794);if ((((fillBits != that.fillBits)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16795)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16796)==0&false))) {{
            __CLR4_5_2cdecdelvlullpi.R.inc(16797);return false;
        }
        }__CLR4_5_2cdecdelvlullpi.R.inc(16798);if ((((frameLengthFlag != that.frameLengthFlag)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16799)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16800)==0&false))) {{
            __CLR4_5_2cdecdelvlullpi.R.inc(16801);return false;
        }
        }__CLR4_5_2cdecdelvlullpi.R.inc(16802);if ((((gaSpecificConfig != that.gaSpecificConfig)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16803)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16804)==0&false))) {{
            __CLR4_5_2cdecdelvlullpi.R.inc(16805);return false;
        }
        }__CLR4_5_2cdecdelvlullpi.R.inc(16806);if ((((hilnContMode != that.hilnContMode)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16807)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16808)==0&false))) {{
            __CLR4_5_2cdecdelvlullpi.R.inc(16809);return false;
        }
        }__CLR4_5_2cdecdelvlullpi.R.inc(16810);if ((((hilnEnhaLayer != that.hilnEnhaLayer)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16811)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16812)==0&false))) {{
            __CLR4_5_2cdecdelvlullpi.R.inc(16813);return false;
        }
        }__CLR4_5_2cdecdelvlullpi.R.inc(16814);if ((((hilnEnhaQuantMode != that.hilnEnhaQuantMode)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16815)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16816)==0&false))) {{
            __CLR4_5_2cdecdelvlullpi.R.inc(16817);return false;
        }
        }__CLR4_5_2cdecdelvlullpi.R.inc(16818);if ((((hilnFrameLength != that.hilnFrameLength)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16819)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16820)==0&false))) {{
            __CLR4_5_2cdecdelvlullpi.R.inc(16821);return false;
        }
        }__CLR4_5_2cdecdelvlullpi.R.inc(16822);if ((((hilnMaxNumLine != that.hilnMaxNumLine)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16823)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16824)==0&false))) {{
            __CLR4_5_2cdecdelvlullpi.R.inc(16825);return false;
        }
        }__CLR4_5_2cdecdelvlullpi.R.inc(16826);if ((((hilnQuantMode != that.hilnQuantMode)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16827)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16828)==0&false))) {{
            __CLR4_5_2cdecdelvlullpi.R.inc(16829);return false;
        }
        }__CLR4_5_2cdecdelvlullpi.R.inc(16830);if ((((hilnSampleRateCode != that.hilnSampleRateCode)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16831)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16832)==0&false))) {{
            __CLR4_5_2cdecdelvlullpi.R.inc(16833);return false;
        }
        }__CLR4_5_2cdecdelvlullpi.R.inc(16834);if ((((hvxcRateMode != that.hvxcRateMode)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16835)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16836)==0&false))) {{
            __CLR4_5_2cdecdelvlullpi.R.inc(16837);return false;
        }
        }__CLR4_5_2cdecdelvlullpi.R.inc(16838);if ((((hvxcVarMode != that.hvxcVarMode)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16839)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16840)==0&false))) {{
            __CLR4_5_2cdecdelvlullpi.R.inc(16841);return false;
        }
        }__CLR4_5_2cdecdelvlullpi.R.inc(16842);if ((((isBaseLayer != that.isBaseLayer)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16843)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16844)==0&false))) {{
            __CLR4_5_2cdecdelvlullpi.R.inc(16845);return false;
        }
        }__CLR4_5_2cdecdelvlullpi.R.inc(16846);if ((((layerNr != that.layerNr)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16847)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16848)==0&false))) {{
            __CLR4_5_2cdecdelvlullpi.R.inc(16849);return false;
        }
        }__CLR4_5_2cdecdelvlullpi.R.inc(16850);if ((((layer_length != that.layer_length)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16851)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16852)==0&false))) {{
            __CLR4_5_2cdecdelvlullpi.R.inc(16853);return false;
        }
        }__CLR4_5_2cdecdelvlullpi.R.inc(16854);if ((((numOfSubFrame != that.numOfSubFrame)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16855)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16856)==0&false))) {{
            __CLR4_5_2cdecdelvlullpi.R.inc(16857);return false;
        }
        }__CLR4_5_2cdecdelvlullpi.R.inc(16858);if ((((paraExtensionFlag != that.paraExtensionFlag)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16859)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16860)==0&false))) {{
            __CLR4_5_2cdecdelvlullpi.R.inc(16861);return false;
        }
        }__CLR4_5_2cdecdelvlullpi.R.inc(16862);if ((((paraMode != that.paraMode)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16863)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16864)==0&false))) {{
            __CLR4_5_2cdecdelvlullpi.R.inc(16865);return false;
        }
        }__CLR4_5_2cdecdelvlullpi.R.inc(16866);if ((((parametricSpecificConfig != that.parametricSpecificConfig)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16867)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16868)==0&false))) {{
            __CLR4_5_2cdecdelvlullpi.R.inc(16869);return false;
        }
        }__CLR4_5_2cdecdelvlullpi.R.inc(16870);if ((((psPresentFlag != that.psPresentFlag)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16871)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16872)==0&false))) {{
            __CLR4_5_2cdecdelvlullpi.R.inc(16873);return false;
        }
        }__CLR4_5_2cdecdelvlullpi.R.inc(16874);if ((((sacPayloadEmbedding != that.sacPayloadEmbedding)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16875)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16876)==0&false))) {{
            __CLR4_5_2cdecdelvlullpi.R.inc(16877);return false;
        }
        }__CLR4_5_2cdecdelvlullpi.R.inc(16878);if ((((samplingFrequency != that.samplingFrequency)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16879)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16880)==0&false))) {{
            __CLR4_5_2cdecdelvlullpi.R.inc(16881);return false;
        }
        }__CLR4_5_2cdecdelvlullpi.R.inc(16882);if ((((samplingFrequencyIndex != that.samplingFrequencyIndex)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16883)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16884)==0&false))) {{
            __CLR4_5_2cdecdelvlullpi.R.inc(16885);return false;
        }
        }__CLR4_5_2cdecdelvlullpi.R.inc(16886);if ((((sbrPresentFlag != that.sbrPresentFlag)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16887)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16888)==0&false))) {{
            __CLR4_5_2cdecdelvlullpi.R.inc(16889);return false;
        }
        }__CLR4_5_2cdecdelvlullpi.R.inc(16890);if ((((syncExtensionType != that.syncExtensionType)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16891)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16892)==0&false))) {{
            __CLR4_5_2cdecdelvlullpi.R.inc(16893);return false;
        }
        }__CLR4_5_2cdecdelvlullpi.R.inc(16894);if ((((var_ScalableFlag != that.var_ScalableFlag)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16895)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16896)==0&false))) {{
            __CLR4_5_2cdecdelvlullpi.R.inc(16897);return false;
        }
        }__CLR4_5_2cdecdelvlullpi.R.inc(16898);if ((((!Arrays.equals(configBytes, that.configBytes))&&(__CLR4_5_2cdecdelvlullpi.R.iget(16899)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16900)==0&false))) {{
            __CLR4_5_2cdecdelvlullpi.R.inc(16901);return false;
        }

        }__CLR4_5_2cdecdelvlullpi.R.inc(16902);return true;
    }finally{__CLR4_5_2cdecdelvlullpi.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_5_2cdecdelvlullpi.R.inc(16903);
        __CLR4_5_2cdecdelvlullpi.R.inc(16904);int result = (((configBytes != null )&&(__CLR4_5_2cdecdelvlullpi.R.iget(16905)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16906)==0&false))? Arrays.hashCode(configBytes) : 0;
        __CLR4_5_2cdecdelvlullpi.R.inc(16907);result = 31 * result + audioObjectType;
        __CLR4_5_2cdecdelvlullpi.R.inc(16908);result = 31 * result + samplingFrequencyIndex;
        __CLR4_5_2cdecdelvlullpi.R.inc(16909);result = 31 * result + samplingFrequency;
        __CLR4_5_2cdecdelvlullpi.R.inc(16910);result = 31 * result + channelConfiguration;
        __CLR4_5_2cdecdelvlullpi.R.inc(16911);result = 31 * result + extensionAudioObjectType;
        __CLR4_5_2cdecdelvlullpi.R.inc(16912);result = 31 * result + ((((sbrPresentFlag )&&(__CLR4_5_2cdecdelvlullpi.R.iget(16913)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16914)==0&false))? 1 : 0);
        __CLR4_5_2cdecdelvlullpi.R.inc(16915);result = 31 * result + ((((psPresentFlag )&&(__CLR4_5_2cdecdelvlullpi.R.iget(16916)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16917)==0&false))? 1 : 0);
        __CLR4_5_2cdecdelvlullpi.R.inc(16918);result = 31 * result + extensionSamplingFrequencyIndex;
        __CLR4_5_2cdecdelvlullpi.R.inc(16919);result = 31 * result + extensionSamplingFrequency;
        __CLR4_5_2cdecdelvlullpi.R.inc(16920);result = 31 * result + extensionChannelConfiguration;
        __CLR4_5_2cdecdelvlullpi.R.inc(16921);result = 31 * result + sacPayloadEmbedding;
        __CLR4_5_2cdecdelvlullpi.R.inc(16922);result = 31 * result + fillBits;
        __CLR4_5_2cdecdelvlullpi.R.inc(16923);result = 31 * result + epConfig;
        __CLR4_5_2cdecdelvlullpi.R.inc(16924);result = 31 * result + directMapping;
        __CLR4_5_2cdecdelvlullpi.R.inc(16925);result = 31 * result + syncExtensionType;
        __CLR4_5_2cdecdelvlullpi.R.inc(16926);result = 31 * result + frameLengthFlag;
        __CLR4_5_2cdecdelvlullpi.R.inc(16927);result = 31 * result + dependsOnCoreCoder;
        __CLR4_5_2cdecdelvlullpi.R.inc(16928);result = 31 * result + coreCoderDelay;
        __CLR4_5_2cdecdelvlullpi.R.inc(16929);result = 31 * result + extensionFlag;
        __CLR4_5_2cdecdelvlullpi.R.inc(16930);result = 31 * result + layerNr;
        __CLR4_5_2cdecdelvlullpi.R.inc(16931);result = 31 * result + numOfSubFrame;
        __CLR4_5_2cdecdelvlullpi.R.inc(16932);result = 31 * result + layer_length;
        __CLR4_5_2cdecdelvlullpi.R.inc(16933);result = 31 * result + ((((aacSectionDataResilienceFlag )&&(__CLR4_5_2cdecdelvlullpi.R.iget(16934)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16935)==0&false))? 1 : 0);
        __CLR4_5_2cdecdelvlullpi.R.inc(16936);result = 31 * result + ((((aacScalefactorDataResilienceFlag )&&(__CLR4_5_2cdecdelvlullpi.R.iget(16937)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16938)==0&false))? 1 : 0);
        __CLR4_5_2cdecdelvlullpi.R.inc(16939);result = 31 * result + ((((aacSpectralDataResilienceFlag )&&(__CLR4_5_2cdecdelvlullpi.R.iget(16940)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16941)==0&false))? 1 : 0);
        __CLR4_5_2cdecdelvlullpi.R.inc(16942);result = 31 * result + extensionFlag3;
        __CLR4_5_2cdecdelvlullpi.R.inc(16943);result = 31 * result + ((((gaSpecificConfig )&&(__CLR4_5_2cdecdelvlullpi.R.iget(16944)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16945)==0&false))? 1 : 0);
        __CLR4_5_2cdecdelvlullpi.R.inc(16946);result = 31 * result + isBaseLayer;
        __CLR4_5_2cdecdelvlullpi.R.inc(16947);result = 31 * result + paraMode;
        __CLR4_5_2cdecdelvlullpi.R.inc(16948);result = 31 * result + paraExtensionFlag;
        __CLR4_5_2cdecdelvlullpi.R.inc(16949);result = 31 * result + hvxcVarMode;
        __CLR4_5_2cdecdelvlullpi.R.inc(16950);result = 31 * result + hvxcRateMode;
        __CLR4_5_2cdecdelvlullpi.R.inc(16951);result = 31 * result + erHvxcExtensionFlag;
        __CLR4_5_2cdecdelvlullpi.R.inc(16952);result = 31 * result + var_ScalableFlag;
        __CLR4_5_2cdecdelvlullpi.R.inc(16953);result = 31 * result + hilnQuantMode;
        __CLR4_5_2cdecdelvlullpi.R.inc(16954);result = 31 * result + hilnMaxNumLine;
        __CLR4_5_2cdecdelvlullpi.R.inc(16955);result = 31 * result + hilnSampleRateCode;
        __CLR4_5_2cdecdelvlullpi.R.inc(16956);result = 31 * result + hilnFrameLength;
        __CLR4_5_2cdecdelvlullpi.R.inc(16957);result = 31 * result + hilnContMode;
        __CLR4_5_2cdecdelvlullpi.R.inc(16958);result = 31 * result + hilnEnhaLayer;
        __CLR4_5_2cdecdelvlullpi.R.inc(16959);result = 31 * result + hilnEnhaQuantMode;
        __CLR4_5_2cdecdelvlullpi.R.inc(16960);result = 31 * result + ((((parametricSpecificConfig )&&(__CLR4_5_2cdecdelvlullpi.R.iget(16961)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16962)==0&false))? 1 : 0);
        __CLR4_5_2cdecdelvlullpi.R.inc(16963);return result;
    }finally{__CLR4_5_2cdecdelvlullpi.R.flushNeeded();}}

    public class ELDSpecificConfig {
        private static final int ELDEXT_TERM = 0x0;//0b0000;
        public boolean frameLengthFlag;
        public boolean aacSectionDataResilienceFlag;
        public boolean aacScalefactorDataResilienceFlag;
        public boolean aacSpectralDataResilienceFlag;
        public boolean ldSbrPresentFlag;
        public boolean ldSbrSamplingRate;
        public boolean ldSbrCrcFlag;

        public ELDSpecificConfig(int channelConfiguration, BitReaderBuffer bitReaderBuffer) {try{__CLR4_5_2cdecdelvlullpi.R.inc(16964);

            __CLR4_5_2cdecdelvlullpi.R.inc(16965);this.frameLengthFlag = bitReaderBuffer.readBool();
            __CLR4_5_2cdecdelvlullpi.R.inc(16966);this.aacSectionDataResilienceFlag = bitReaderBuffer.readBool();
            __CLR4_5_2cdecdelvlullpi.R.inc(16967);this.aacScalefactorDataResilienceFlag = bitReaderBuffer.readBool();
            __CLR4_5_2cdecdelvlullpi.R.inc(16968);this.aacSpectralDataResilienceFlag = bitReaderBuffer.readBool();

            __CLR4_5_2cdecdelvlullpi.R.inc(16969);this.ldSbrPresentFlag = bitReaderBuffer.readBool();
            __CLR4_5_2cdecdelvlullpi.R.inc(16970);if ((((ldSbrPresentFlag)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16971)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16972)==0&false))) {{
                __CLR4_5_2cdecdelvlullpi.R.inc(16973);ldSbrSamplingRate = bitReaderBuffer.readBool();
                __CLR4_5_2cdecdelvlullpi.R.inc(16974);ldSbrCrcFlag = bitReaderBuffer.readBool();
                __CLR4_5_2cdecdelvlullpi.R.inc(16975);ld_sbr_header(channelConfiguration, bitReaderBuffer);
            }
            }__CLR4_5_2cdecdelvlullpi.R.inc(16976);int eldExtType;
            __CLR4_5_2cdecdelvlullpi.R.inc(16977);while ((eldExtType = bitReaderBuffer.readBits(4)) != ELDEXT_TERM) {{
                __CLR4_5_2cdecdelvlullpi.R.inc(16980);int eldExtLen = bitReaderBuffer.readBits(4);
                __CLR4_5_2cdecdelvlullpi.R.inc(16981);int len = eldExtLen;
                __CLR4_5_2cdecdelvlullpi.R.inc(16982);int eldExtLenAdd = 0;
                __CLR4_5_2cdecdelvlullpi.R.inc(16983);if ((((eldExtLen == 15)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16984)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16985)==0&false))) {{
                    __CLR4_5_2cdecdelvlullpi.R.inc(16986);eldExtLenAdd = bitReaderBuffer.readBits(8);
                    __CLR4_5_2cdecdelvlullpi.R.inc(16987);len += eldExtLenAdd;
                }
                }__CLR4_5_2cdecdelvlullpi.R.inc(16988);if ((((eldExtLenAdd == 255)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16989)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16990)==0&false))) {{
                    __CLR4_5_2cdecdelvlullpi.R.inc(16991);int eldExtLenAddAdd = bitReaderBuffer.readBits(16);
                    __CLR4_5_2cdecdelvlullpi.R.inc(16992);len += eldExtLenAddAdd;
                }
                }boolean __CLB4_5_2_bool4=false;__CLR4_5_2cdecdelvlullpi.R.inc(16993);switch (eldExtType) {
                    /* add future eld extension configs here */
                    default:if (!__CLB4_5_2_bool4) {__CLR4_5_2cdecdelvlullpi.R.inc(16994);__CLB4_5_2_bool4=true;}
                        __CLR4_5_2cdecdelvlullpi.R.inc(16995);for (int cnt = 0; (((cnt < len)&&(__CLR4_5_2cdecdelvlullpi.R.iget(16996)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(16997)==0&false)); cnt++) {{
                            __CLR4_5_2cdecdelvlullpi.R.inc(16998);int other_byte = bitReaderBuffer.readBits(8);
                        }
                        }__CLR4_5_2cdecdelvlullpi.R.inc(16999);break;

                }
            }
        }}finally{__CLR4_5_2cdecdelvlullpi.R.flushNeeded();}}

        public void ld_sbr_header(int channelConfiguration, BitReaderBuffer bitReaderBuffer) {try{__CLR4_5_2cdecdelvlullpi.R.inc(17000);
            __CLR4_5_2cdecdelvlullpi.R.inc(17001);int numSbrHeader;
            boolean __CLB4_5_2_bool5=false;__CLR4_5_2cdecdelvlullpi.R.inc(17002);switch (channelConfiguration) {
                case 1:if (!__CLB4_5_2_bool5) {__CLR4_5_2cdecdelvlullpi.R.inc(17003);__CLB4_5_2_bool5=true;}
                case 2:if (!__CLB4_5_2_bool5) {__CLR4_5_2cdecdelvlullpi.R.inc(17004);__CLB4_5_2_bool5=true;}
                    __CLR4_5_2cdecdelvlullpi.R.inc(17005);numSbrHeader = 1;
                    __CLR4_5_2cdecdelvlullpi.R.inc(17006);break;
                case 3:if (!__CLB4_5_2_bool5) {__CLR4_5_2cdecdelvlullpi.R.inc(17007);__CLB4_5_2_bool5=true;}
                    __CLR4_5_2cdecdelvlullpi.R.inc(17008);numSbrHeader = 2;
                    __CLR4_5_2cdecdelvlullpi.R.inc(17009);break;
                case 4:if (!__CLB4_5_2_bool5) {__CLR4_5_2cdecdelvlullpi.R.inc(17010);__CLB4_5_2_bool5=true;}
                case 5:if (!__CLB4_5_2_bool5) {__CLR4_5_2cdecdelvlullpi.R.inc(17011);__CLB4_5_2_bool5=true;}
                case 6:if (!__CLB4_5_2_bool5) {__CLR4_5_2cdecdelvlullpi.R.inc(17012);__CLB4_5_2_bool5=true;}
                    __CLR4_5_2cdecdelvlullpi.R.inc(17013);numSbrHeader = 3;
                    __CLR4_5_2cdecdelvlullpi.R.inc(17014);break;
                case 7:if (!__CLB4_5_2_bool5) {__CLR4_5_2cdecdelvlullpi.R.inc(17015);__CLB4_5_2_bool5=true;}
                    __CLR4_5_2cdecdelvlullpi.R.inc(17016);numSbrHeader = 4;
                    __CLR4_5_2cdecdelvlullpi.R.inc(17017);break;
                default:if (!__CLB4_5_2_bool5) {__CLR4_5_2cdecdelvlullpi.R.inc(17018);__CLB4_5_2_bool5=true;}
                    __CLR4_5_2cdecdelvlullpi.R.inc(17019);numSbrHeader = 0;
                    __CLR4_5_2cdecdelvlullpi.R.inc(17020);break;
            }
            __CLR4_5_2cdecdelvlullpi.R.inc(17021);for (int el = 0; (((el < numSbrHeader)&&(__CLR4_5_2cdecdelvlullpi.R.iget(17022)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(17023)==0&false)); el++) {{
                __CLR4_5_2cdecdelvlullpi.R.inc(17024);new sbr_header(bitReaderBuffer);
            }
        }}finally{__CLR4_5_2cdecdelvlullpi.R.flushNeeded();}}


    }

    public class sbr_header {
        public boolean bs_amp_res;
        public int bs_start_freq;
        public int bs_stop_freq;
        public int bs_xover_band;
        public int bs_reserved;
        public boolean bs_header_extra_1;
        public boolean bs_header_extra_2;
        public int bs_freq_scale;
        public boolean bs_alter_scale;
        public int bs_noise_bands;
        public int bs_limiter_bands;
        public int bs_limiter_gains;
        public boolean bs_interpol_freq;
        public boolean bs_smoothing_mode;

        public sbr_header(BitReaderBuffer b) {try{__CLR4_5_2cdecdelvlullpi.R.inc(17025);
            __CLR4_5_2cdecdelvlullpi.R.inc(17026);bs_amp_res = b.readBool();
            __CLR4_5_2cdecdelvlullpi.R.inc(17027);bs_start_freq = b.readBits(4);
            __CLR4_5_2cdecdelvlullpi.R.inc(17028);bs_stop_freq = b.readBits(4);
            __CLR4_5_2cdecdelvlullpi.R.inc(17029);bs_xover_band = b.readBits(3);
            __CLR4_5_2cdecdelvlullpi.R.inc(17030);bs_reserved = b.readBits(2);
            __CLR4_5_2cdecdelvlullpi.R.inc(17031);bs_header_extra_1 = b.readBool();
            __CLR4_5_2cdecdelvlullpi.R.inc(17032);bs_header_extra_2 = b.readBool();
            __CLR4_5_2cdecdelvlullpi.R.inc(17033);if ((((bs_header_extra_1)&&(__CLR4_5_2cdecdelvlullpi.R.iget(17034)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(17035)==0&false))) {{
                __CLR4_5_2cdecdelvlullpi.R.inc(17036);bs_freq_scale = b.readBits(2);
                __CLR4_5_2cdecdelvlullpi.R.inc(17037);bs_alter_scale = b.readBool();
                __CLR4_5_2cdecdelvlullpi.R.inc(17038);bs_noise_bands = b.readBits(2);
            }
            }__CLR4_5_2cdecdelvlullpi.R.inc(17039);if ((((bs_header_extra_2)&&(__CLR4_5_2cdecdelvlullpi.R.iget(17040)!=0|true))||(__CLR4_5_2cdecdelvlullpi.R.iget(17041)==0&false))) {{
                __CLR4_5_2cdecdelvlullpi.R.inc(17042);bs_limiter_bands = b.readBits(2);
                __CLR4_5_2cdecdelvlullpi.R.inc(17043);bs_limiter_gains = b.readBits(2);
                __CLR4_5_2cdecdelvlullpi.R.inc(17044);bs_interpol_freq = b.readBool();
            }
            }__CLR4_5_2cdecdelvlullpi.R.inc(17045);bs_smoothing_mode = b.readBool();
        }finally{__CLR4_5_2cdecdelvlullpi.R.flushNeeded();}}
    }
}
