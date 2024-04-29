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
public class AudioSpecificConfig extends BaseDescriptor {public static class __CLR4_5_2carcarlvl9ek7u{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,16951,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static Map<Integer, Integer> samplingFrequencyIndexMap = new HashMap<Integer, Integer>();
    public static Map<Integer, String> audioObjectTypeMap = new HashMap<Integer, String>();

    static {try{__CLR4_5_2carcarlvl9ek7u.R.inc(15939);
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
        __CLR4_5_2carcarlvl9ek7u.R.inc(15940);samplingFrequencyIndexMap.put(0x0, 96000);
        __CLR4_5_2carcarlvl9ek7u.R.inc(15941);samplingFrequencyIndexMap.put(0x1, 88200);
        __CLR4_5_2carcarlvl9ek7u.R.inc(15942);samplingFrequencyIndexMap.put(0x2, 64000);
        __CLR4_5_2carcarlvl9ek7u.R.inc(15943);samplingFrequencyIndexMap.put(0x3, 48000);
        __CLR4_5_2carcarlvl9ek7u.R.inc(15944);samplingFrequencyIndexMap.put(0x4, 44100);
        __CLR4_5_2carcarlvl9ek7u.R.inc(15945);samplingFrequencyIndexMap.put(0x5, 32000);
        __CLR4_5_2carcarlvl9ek7u.R.inc(15946);samplingFrequencyIndexMap.put(0x6, 24000);
        __CLR4_5_2carcarlvl9ek7u.R.inc(15947);samplingFrequencyIndexMap.put(0x7, 22050);
        __CLR4_5_2carcarlvl9ek7u.R.inc(15948);samplingFrequencyIndexMap.put(0x8, 16000);
        __CLR4_5_2carcarlvl9ek7u.R.inc(15949);samplingFrequencyIndexMap.put(0x9, 12000);
        __CLR4_5_2carcarlvl9ek7u.R.inc(15950);samplingFrequencyIndexMap.put(0xa, 11025);
        __CLR4_5_2carcarlvl9ek7u.R.inc(15951);samplingFrequencyIndexMap.put(0xb, 8000);

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
        __CLR4_5_2carcarlvl9ek7u.R.inc(15952);audioObjectTypeMap.put(1, "AAC main");
        __CLR4_5_2carcarlvl9ek7u.R.inc(15953);audioObjectTypeMap.put(2, "AAC LC");
        __CLR4_5_2carcarlvl9ek7u.R.inc(15954);audioObjectTypeMap.put(3, "AAC SSR");
        __CLR4_5_2carcarlvl9ek7u.R.inc(15955);audioObjectTypeMap.put(4, "AAC LTP");
        __CLR4_5_2carcarlvl9ek7u.R.inc(15956);audioObjectTypeMap.put(5, "SBR");
        __CLR4_5_2carcarlvl9ek7u.R.inc(15957);audioObjectTypeMap.put(6, "AAC Scalable");
        __CLR4_5_2carcarlvl9ek7u.R.inc(15958);audioObjectTypeMap.put(7, "TwinVQ");
        __CLR4_5_2carcarlvl9ek7u.R.inc(15959);audioObjectTypeMap.put(8, "CELP");
        __CLR4_5_2carcarlvl9ek7u.R.inc(15960);audioObjectTypeMap.put(9, "HVXC");
        __CLR4_5_2carcarlvl9ek7u.R.inc(15961);audioObjectTypeMap.put(10, "(reserved)");
        __CLR4_5_2carcarlvl9ek7u.R.inc(15962);audioObjectTypeMap.put(11, "(reserved)");
        __CLR4_5_2carcarlvl9ek7u.R.inc(15963);audioObjectTypeMap.put(12, "TTSI");
        __CLR4_5_2carcarlvl9ek7u.R.inc(15964);audioObjectTypeMap.put(13, "Main synthetic");
        __CLR4_5_2carcarlvl9ek7u.R.inc(15965);audioObjectTypeMap.put(14, "Wavetable synthesis");
        __CLR4_5_2carcarlvl9ek7u.R.inc(15966);audioObjectTypeMap.put(15, "General MIDI");
        __CLR4_5_2carcarlvl9ek7u.R.inc(15967);audioObjectTypeMap.put(16, "Algorithmic Synthesis and Audio FX");
        __CLR4_5_2carcarlvl9ek7u.R.inc(15968);audioObjectTypeMap.put(17, "ER AAC LC");
        __CLR4_5_2carcarlvl9ek7u.R.inc(15969);audioObjectTypeMap.put(18, "(reserved)");
        __CLR4_5_2carcarlvl9ek7u.R.inc(15970);audioObjectTypeMap.put(19, "ER AAC LTP");
        __CLR4_5_2carcarlvl9ek7u.R.inc(15971);audioObjectTypeMap.put(20, "ER AAC Scalable");
        __CLR4_5_2carcarlvl9ek7u.R.inc(15972);audioObjectTypeMap.put(21, "ER TwinVQ");
        __CLR4_5_2carcarlvl9ek7u.R.inc(15973);audioObjectTypeMap.put(22, "ER BSAC");
        __CLR4_5_2carcarlvl9ek7u.R.inc(15974);audioObjectTypeMap.put(23, "ER AAC LD");
        __CLR4_5_2carcarlvl9ek7u.R.inc(15975);audioObjectTypeMap.put(24, "ER CELP");
        __CLR4_5_2carcarlvl9ek7u.R.inc(15976);audioObjectTypeMap.put(25, "ER HVXC");
        __CLR4_5_2carcarlvl9ek7u.R.inc(15977);audioObjectTypeMap.put(26, "ER HILN");
        __CLR4_5_2carcarlvl9ek7u.R.inc(15978);audioObjectTypeMap.put(27, "ER Parametric");
        __CLR4_5_2carcarlvl9ek7u.R.inc(15979);audioObjectTypeMap.put(28, "SSC");
        __CLR4_5_2carcarlvl9ek7u.R.inc(15980);audioObjectTypeMap.put(29, "PS");
        __CLR4_5_2carcarlvl9ek7u.R.inc(15981);audioObjectTypeMap.put(30, "MPEG Surround");
        __CLR4_5_2carcarlvl9ek7u.R.inc(15982);audioObjectTypeMap.put(31, "(escape)");
        __CLR4_5_2carcarlvl9ek7u.R.inc(15983);audioObjectTypeMap.put(32, "Layer-1");
        __CLR4_5_2carcarlvl9ek7u.R.inc(15984);audioObjectTypeMap.put(33, "Layer-2");
        __CLR4_5_2carcarlvl9ek7u.R.inc(15985);audioObjectTypeMap.put(34, "Layer-3");
        __CLR4_5_2carcarlvl9ek7u.R.inc(15986);audioObjectTypeMap.put(35, "DST");
        __CLR4_5_2carcarlvl9ek7u.R.inc(15987);audioObjectTypeMap.put(36, "ALS");
        __CLR4_5_2carcarlvl9ek7u.R.inc(15988);audioObjectTypeMap.put(37, "SLS");
        __CLR4_5_2carcarlvl9ek7u.R.inc(15989);audioObjectTypeMap.put(38, "SLS non-core");
        __CLR4_5_2carcarlvl9ek7u.R.inc(15990);audioObjectTypeMap.put(39, "ER AAC ELD");
        __CLR4_5_2carcarlvl9ek7u.R.inc(15991);audioObjectTypeMap.put(40, "SMR Simple");
        __CLR4_5_2carcarlvl9ek7u.R.inc(15992);audioObjectTypeMap.put(41, "SMR Main");

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
    }finally{__CLR4_5_2carcarlvl9ek7u.R.flushNeeded();}}

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

    public AudioSpecificConfig() {try{__CLR4_5_2carcarlvl9ek7u.R.inc(15993);
        __CLR4_5_2carcarlvl9ek7u.R.inc(15994);tag = 0x5;
    }finally{__CLR4_5_2carcarlvl9ek7u.R.flushNeeded();}}

    boolean parsed = false;

    @Override
    public void parseDetail(ByteBuffer bb) throws IOException {try{__CLR4_5_2carcarlvl9ek7u.R.inc(15995);
        __CLR4_5_2carcarlvl9ek7u.R.inc(15996);parsed = true;
        __CLR4_5_2carcarlvl9ek7u.R.inc(15997);ByteBuffer configBytes = bb.slice();
        __CLR4_5_2carcarlvl9ek7u.R.inc(15998);configBytes.limit(sizeOfInstance);
        __CLR4_5_2carcarlvl9ek7u.R.inc(15999);bb.position(bb.position() + sizeOfInstance);

        //copy original bytes to internal array for constructing codec config strings (todo until writing of the config is supported)
        __CLR4_5_2carcarlvl9ek7u.R.inc(16000);this.configBytes = new byte[sizeOfInstance];
        __CLR4_5_2carcarlvl9ek7u.R.inc(16001);configBytes.get(this.configBytes);
        __CLR4_5_2carcarlvl9ek7u.R.inc(16002);configBytes.rewind();

        __CLR4_5_2carcarlvl9ek7u.R.inc(16003);BitReaderBuffer bitReaderBuffer = new BitReaderBuffer(configBytes);
        __CLR4_5_2carcarlvl9ek7u.R.inc(16004);originalAudioObjectType = audioObjectType = getAudioObjectType(bitReaderBuffer);
        __CLR4_5_2carcarlvl9ek7u.R.inc(16005);samplingFrequencyIndex = bitReaderBuffer.readBits(4);

        __CLR4_5_2carcarlvl9ek7u.R.inc(16006);if ((((samplingFrequencyIndex == 0xf)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16007)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16008)==0&false))) {{
            __CLR4_5_2carcarlvl9ek7u.R.inc(16009);samplingFrequency = bitReaderBuffer.readBits(24);
        }

        }__CLR4_5_2carcarlvl9ek7u.R.inc(16010);channelConfiguration = bitReaderBuffer.readBits(4);

        __CLR4_5_2carcarlvl9ek7u.R.inc(16011);if ((((audioObjectType == 5 ||
                audioObjectType == 29)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16012)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16013)==0&false))) {{
            __CLR4_5_2carcarlvl9ek7u.R.inc(16014);extensionAudioObjectType = 5;
            __CLR4_5_2carcarlvl9ek7u.R.inc(16015);sbrPresentFlag = true;
            __CLR4_5_2carcarlvl9ek7u.R.inc(16016);if ((((audioObjectType == 29)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16017)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16018)==0&false))) {{
                __CLR4_5_2carcarlvl9ek7u.R.inc(16019);psPresentFlag = true;
            }
            }__CLR4_5_2carcarlvl9ek7u.R.inc(16020);extensionSamplingFrequencyIndex = bitReaderBuffer.readBits(4);
            __CLR4_5_2carcarlvl9ek7u.R.inc(16021);if ((((extensionSamplingFrequencyIndex == 0xf)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16022)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16023)==0&false)))
                {__CLR4_5_2carcarlvl9ek7u.R.inc(16024);extensionSamplingFrequency = bitReaderBuffer.readBits(24);
            }__CLR4_5_2carcarlvl9ek7u.R.inc(16025);audioObjectType = getAudioObjectType(bitReaderBuffer);
            __CLR4_5_2carcarlvl9ek7u.R.inc(16026);if ((((audioObjectType == 22)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16027)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16028)==0&false)))
                {__CLR4_5_2carcarlvl9ek7u.R.inc(16029);extensionChannelConfiguration = bitReaderBuffer.readBits(4);
        }} }else {{
            __CLR4_5_2carcarlvl9ek7u.R.inc(16030);extensionAudioObjectType = 0;
        }

        }boolean __CLB4_5_2_bool0=false;__CLR4_5_2carcarlvl9ek7u.R.inc(16031);switch (audioObjectType) {
            case 1:if (!__CLB4_5_2_bool0) {__CLR4_5_2carcarlvl9ek7u.R.inc(16032);__CLB4_5_2_bool0=true;}
            case 2:if (!__CLB4_5_2_bool0) {__CLR4_5_2carcarlvl9ek7u.R.inc(16033);__CLB4_5_2_bool0=true;}
            case 3:if (!__CLB4_5_2_bool0) {__CLR4_5_2carcarlvl9ek7u.R.inc(16034);__CLB4_5_2_bool0=true;}
            case 4:if (!__CLB4_5_2_bool0) {__CLR4_5_2carcarlvl9ek7u.R.inc(16035);__CLB4_5_2_bool0=true;}
            case 6:if (!__CLB4_5_2_bool0) {__CLR4_5_2carcarlvl9ek7u.R.inc(16036);__CLB4_5_2_bool0=true;}
            case 7:if (!__CLB4_5_2_bool0) {__CLR4_5_2carcarlvl9ek7u.R.inc(16037);__CLB4_5_2_bool0=true;}
            case 17:if (!__CLB4_5_2_bool0) {__CLR4_5_2carcarlvl9ek7u.R.inc(16038);__CLB4_5_2_bool0=true;}
            case 19:if (!__CLB4_5_2_bool0) {__CLR4_5_2carcarlvl9ek7u.R.inc(16039);__CLB4_5_2_bool0=true;}
            case 20:if (!__CLB4_5_2_bool0) {__CLR4_5_2carcarlvl9ek7u.R.inc(16040);__CLB4_5_2_bool0=true;}
            case 21:if (!__CLB4_5_2_bool0) {__CLR4_5_2carcarlvl9ek7u.R.inc(16041);__CLB4_5_2_bool0=true;}
            case 22:if (!__CLB4_5_2_bool0) {__CLR4_5_2carcarlvl9ek7u.R.inc(16042);__CLB4_5_2_bool0=true;}
            case 23:if (!__CLB4_5_2_bool0) {__CLR4_5_2carcarlvl9ek7u.R.inc(16043);__CLB4_5_2_bool0=true;}
                __CLR4_5_2carcarlvl9ek7u.R.inc(16044);parseGaSpecificConfig(samplingFrequencyIndex, channelConfiguration, audioObjectType, bitReaderBuffer);
                //GASpecificConfig();
                __CLR4_5_2carcarlvl9ek7u.R.inc(16045);break;
            case 8:if (!__CLB4_5_2_bool0) {__CLR4_5_2carcarlvl9ek7u.R.inc(16046);__CLB4_5_2_bool0=true;}
                __CLR4_5_2carcarlvl9ek7u.R.inc(16047);throw new UnsupportedOperationException("can't parse CelpSpecificConfig yet");
                //CelpSpecificConfig();
                //break;
            case 9:if (!__CLB4_5_2_bool0) {__CLR4_5_2carcarlvl9ek7u.R.inc(16048);__CLB4_5_2_bool0=true;}
                __CLR4_5_2carcarlvl9ek7u.R.inc(16049);throw new UnsupportedOperationException("can't parse HvxcSpecificConfig yet");
                //HvxcSpecificConfig();
                //break;
            case 12:if (!__CLB4_5_2_bool0) {__CLR4_5_2carcarlvl9ek7u.R.inc(16050);__CLB4_5_2_bool0=true;}
                __CLR4_5_2carcarlvl9ek7u.R.inc(16051);throw new UnsupportedOperationException("can't parse TTSSpecificConfig yet");
                //TTSSpecificConfig();
                //break;
            case 13:if (!__CLB4_5_2_bool0) {__CLR4_5_2carcarlvl9ek7u.R.inc(16052);__CLB4_5_2_bool0=true;}
            case 14:if (!__CLB4_5_2_bool0) {__CLR4_5_2carcarlvl9ek7u.R.inc(16053);__CLB4_5_2_bool0=true;}
            case 15:if (!__CLB4_5_2_bool0) {__CLR4_5_2carcarlvl9ek7u.R.inc(16054);__CLB4_5_2_bool0=true;}
            case 16:if (!__CLB4_5_2_bool0) {__CLR4_5_2carcarlvl9ek7u.R.inc(16055);__CLB4_5_2_bool0=true;}
                __CLR4_5_2carcarlvl9ek7u.R.inc(16056);throw new UnsupportedOperationException("can't parse StructuredAudioSpecificConfig yet");
                //StructuredAudioSpecificConfig();
                //break;
            case 24:if (!__CLB4_5_2_bool0) {__CLR4_5_2carcarlvl9ek7u.R.inc(16057);__CLB4_5_2_bool0=true;}
                __CLR4_5_2carcarlvl9ek7u.R.inc(16058);throw new UnsupportedOperationException("can't parse ErrorResilientCelpSpecificConfig yet");
                //ErrorResilientCelpSpecificConfig();
                //break;
            case 25:if (!__CLB4_5_2_bool0) {__CLR4_5_2carcarlvl9ek7u.R.inc(16059);__CLB4_5_2_bool0=true;}
                __CLR4_5_2carcarlvl9ek7u.R.inc(16060);throw new UnsupportedOperationException("can't parse ErrorResilientHvxcSpecificConfig yet");
                //ErrorResilientHvxcSpecificConfig();
                //break;
            case 26:if (!__CLB4_5_2_bool0) {__CLR4_5_2carcarlvl9ek7u.R.inc(16061);__CLB4_5_2_bool0=true;}
            case 27:if (!__CLB4_5_2_bool0) {__CLR4_5_2carcarlvl9ek7u.R.inc(16062);__CLB4_5_2_bool0=true;}
                __CLR4_5_2carcarlvl9ek7u.R.inc(16063);parseParametricSpecificConfig(samplingFrequencyIndex, channelConfiguration, audioObjectType, bitReaderBuffer);
                //ParametricSpecificConfig();
                __CLR4_5_2carcarlvl9ek7u.R.inc(16064);break;
            case 28:if (!__CLB4_5_2_bool0) {__CLR4_5_2carcarlvl9ek7u.R.inc(16065);__CLB4_5_2_bool0=true;}
                __CLR4_5_2carcarlvl9ek7u.R.inc(16066);throw new UnsupportedOperationException("can't parse SSCSpecificConfig yet");
                //SSCSpecificConfig();
                //break;
            case 30:if (!__CLB4_5_2_bool0) {__CLR4_5_2carcarlvl9ek7u.R.inc(16067);__CLB4_5_2_bool0=true;}
                __CLR4_5_2carcarlvl9ek7u.R.inc(16068);sacPayloadEmbedding = bitReaderBuffer.readBits(1);
                __CLR4_5_2carcarlvl9ek7u.R.inc(16069);throw new UnsupportedOperationException("can't parse SpatialSpecificConfig yet");
                //SpatialSpecificConfig();
                //break;
            case 32:if (!__CLB4_5_2_bool0) {__CLR4_5_2carcarlvl9ek7u.R.inc(16070);__CLB4_5_2_bool0=true;}
            case 33:if (!__CLB4_5_2_bool0) {__CLR4_5_2carcarlvl9ek7u.R.inc(16071);__CLB4_5_2_bool0=true;}
            case 34:if (!__CLB4_5_2_bool0) {__CLR4_5_2carcarlvl9ek7u.R.inc(16072);__CLB4_5_2_bool0=true;}
                __CLR4_5_2carcarlvl9ek7u.R.inc(16073);throw new UnsupportedOperationException("can't parse MPEG_1_2_SpecificConfig yet");
                //MPEG_1_2_SpecificConfig();
                //break;
            case 35:if (!__CLB4_5_2_bool0) {__CLR4_5_2carcarlvl9ek7u.R.inc(16074);__CLB4_5_2_bool0=true;}
                __CLR4_5_2carcarlvl9ek7u.R.inc(16075);throw new UnsupportedOperationException("can't parse DSTSpecificConfig yet");
                //DSTSpecificConfig();
                //break;
            case 36:if (!__CLB4_5_2_bool0) {__CLR4_5_2carcarlvl9ek7u.R.inc(16076);__CLB4_5_2_bool0=true;}
                __CLR4_5_2carcarlvl9ek7u.R.inc(16077);fillBits = bitReaderBuffer.readBits(5);
                __CLR4_5_2carcarlvl9ek7u.R.inc(16078);throw new UnsupportedOperationException("can't parse ALSSpecificConfig yet");
                //ALSSpecificConfig();
                //break;
            case 37:if (!__CLB4_5_2_bool0) {__CLR4_5_2carcarlvl9ek7u.R.inc(16079);__CLB4_5_2_bool0=true;}
            case 38:if (!__CLB4_5_2_bool0) {__CLR4_5_2carcarlvl9ek7u.R.inc(16080);__CLB4_5_2_bool0=true;}
                __CLR4_5_2carcarlvl9ek7u.R.inc(16081);throw new UnsupportedOperationException("can't parse SLSSpecificConfig yet");
                //SLSSpecificConfig();
                //break;
            case 39:if (!__CLB4_5_2_bool0) {__CLR4_5_2carcarlvl9ek7u.R.inc(16082);__CLB4_5_2_bool0=true;}
                __CLR4_5_2carcarlvl9ek7u.R.inc(16083);eldSpecificConfig = new ELDSpecificConfig(channelConfiguration, bitReaderBuffer);
                __CLR4_5_2carcarlvl9ek7u.R.inc(16084);break;
            case 40:if (!__CLB4_5_2_bool0) {__CLR4_5_2carcarlvl9ek7u.R.inc(16085);__CLB4_5_2_bool0=true;}
            case 41:if (!__CLB4_5_2_bool0) {__CLR4_5_2carcarlvl9ek7u.R.inc(16086);__CLB4_5_2_bool0=true;}
                __CLR4_5_2carcarlvl9ek7u.R.inc(16087);throw new UnsupportedOperationException("can't parse SymbolicMusicSpecificConfig yet");
                //SymbolicMusicSpecificConfig();
                //break;
            default:if (!__CLB4_5_2_bool0) {__CLR4_5_2carcarlvl9ek7u.R.inc(16088);__CLB4_5_2_bool0=true;}
                /* reserved */
        }

        boolean __CLB4_5_2_bool1=false;__CLR4_5_2carcarlvl9ek7u.R.inc(16089);switch (audioObjectType) {
            case 17:if (!__CLB4_5_2_bool1) {__CLR4_5_2carcarlvl9ek7u.R.inc(16090);__CLB4_5_2_bool1=true;}
            case 19:if (!__CLB4_5_2_bool1) {__CLR4_5_2carcarlvl9ek7u.R.inc(16091);__CLB4_5_2_bool1=true;}
            case 20:if (!__CLB4_5_2_bool1) {__CLR4_5_2carcarlvl9ek7u.R.inc(16092);__CLB4_5_2_bool1=true;}
            case 21:if (!__CLB4_5_2_bool1) {__CLR4_5_2carcarlvl9ek7u.R.inc(16093);__CLB4_5_2_bool1=true;}
            case 22:if (!__CLB4_5_2_bool1) {__CLR4_5_2carcarlvl9ek7u.R.inc(16094);__CLB4_5_2_bool1=true;}
            case 23:if (!__CLB4_5_2_bool1) {__CLR4_5_2carcarlvl9ek7u.R.inc(16095);__CLB4_5_2_bool1=true;}
            case 24:if (!__CLB4_5_2_bool1) {__CLR4_5_2carcarlvl9ek7u.R.inc(16096);__CLB4_5_2_bool1=true;}
            case 25:if (!__CLB4_5_2_bool1) {__CLR4_5_2carcarlvl9ek7u.R.inc(16097);__CLB4_5_2_bool1=true;}
            case 26:if (!__CLB4_5_2_bool1) {__CLR4_5_2carcarlvl9ek7u.R.inc(16098);__CLB4_5_2_bool1=true;}
            case 27:if (!__CLB4_5_2_bool1) {__CLR4_5_2carcarlvl9ek7u.R.inc(16099);__CLB4_5_2_bool1=true;}
            case 39:if (!__CLB4_5_2_bool1) {__CLR4_5_2carcarlvl9ek7u.R.inc(16100);__CLB4_5_2_bool1=true;}
                __CLR4_5_2carcarlvl9ek7u.R.inc(16101);epConfig = bitReaderBuffer.readBits(2);
                __CLR4_5_2carcarlvl9ek7u.R.inc(16102);if ((((epConfig == 2 || epConfig == 3)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16103)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16104)==0&false))) {{
                    __CLR4_5_2carcarlvl9ek7u.R.inc(16105);throw new UnsupportedOperationException("can't parse ErrorProtectionSpecificConfig yet");
                    //ErrorProtectionSpecificConfig();
                }
                }__CLR4_5_2carcarlvl9ek7u.R.inc(16106);if ((((epConfig == 3)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16107)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16108)==0&false))) {{
                    __CLR4_5_2carcarlvl9ek7u.R.inc(16109);directMapping = bitReaderBuffer.readBits(1);
                    __CLR4_5_2carcarlvl9ek7u.R.inc(16110);if ((((directMapping == 0)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16111)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16112)==0&false))) {{
                        /* tbd */
                        __CLR4_5_2carcarlvl9ek7u.R.inc(16113);throw new RuntimeException("not implemented");
                    }
                }}
        }}

        __CLR4_5_2carcarlvl9ek7u.R.inc(16114);if ((((extensionAudioObjectType != 5 && bitReaderBuffer.remainingBits() >= 16)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16115)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16116)==0&false))) {{
            __CLR4_5_2carcarlvl9ek7u.R.inc(16117);outerSyncExtensionType = syncExtensionType = bitReaderBuffer.readBits(11);
            __CLR4_5_2carcarlvl9ek7u.R.inc(16118);if ((((syncExtensionType == 0x2b7)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16119)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16120)==0&false))) {{
                __CLR4_5_2carcarlvl9ek7u.R.inc(16121);extensionAudioObjectType = getAudioObjectType(bitReaderBuffer);
                __CLR4_5_2carcarlvl9ek7u.R.inc(16122);if ((((extensionAudioObjectType == 5)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16123)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16124)==0&false))) {{
                    __CLR4_5_2carcarlvl9ek7u.R.inc(16125);sbrPresentFlag = bitReaderBuffer.readBool();
                    __CLR4_5_2carcarlvl9ek7u.R.inc(16126);if ((((sbrPresentFlag)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16127)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16128)==0&false))) {{
                        __CLR4_5_2carcarlvl9ek7u.R.inc(16129);extensionSamplingFrequencyIndex = bitReaderBuffer.readBits(4);
                        __CLR4_5_2carcarlvl9ek7u.R.inc(16130);if ((((extensionSamplingFrequencyIndex == 0xf)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16131)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16132)==0&false))) {{
                            __CLR4_5_2carcarlvl9ek7u.R.inc(16133);extensionSamplingFrequency = bitReaderBuffer.readBits(24);
                        }
                        }__CLR4_5_2carcarlvl9ek7u.R.inc(16134);if ((((bitReaderBuffer.remainingBits() >= 12)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16135)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16136)==0&false))) {{
                            __CLR4_5_2carcarlvl9ek7u.R.inc(16137);innerSyncExtensionType = syncExtensionType = bitReaderBuffer.readBits(11); //10101001000
                            __CLR4_5_2carcarlvl9ek7u.R.inc(16138);if ((((syncExtensionType == 0x548)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16139)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16140)==0&false))) {{
                                __CLR4_5_2carcarlvl9ek7u.R.inc(16141);psPresentFlag = bitReaderBuffer.readBool();
                            }
                        }}
                    }}
                }}
                }__CLR4_5_2carcarlvl9ek7u.R.inc(16142);if ((((extensionAudioObjectType == 22)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16143)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16144)==0&false))) {{
                    __CLR4_5_2carcarlvl9ek7u.R.inc(16145);sbrPresentFlag = bitReaderBuffer.readBool();
                    __CLR4_5_2carcarlvl9ek7u.R.inc(16146);if ((((sbrPresentFlag)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16147)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16148)==0&false))) {{
                        __CLR4_5_2carcarlvl9ek7u.R.inc(16149);extensionSamplingFrequencyIndex = bitReaderBuffer.readBits(4);
                        __CLR4_5_2carcarlvl9ek7u.R.inc(16150);if ((((extensionSamplingFrequencyIndex == 0xf)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16151)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16152)==0&false))) {{
                            __CLR4_5_2carcarlvl9ek7u.R.inc(16153);extensionSamplingFrequency = bitReaderBuffer.readBits(24);
                        }
                    }}
                    }__CLR4_5_2carcarlvl9ek7u.R.inc(16154);extensionChannelConfiguration = bitReaderBuffer.readBits(4);
                }
            }}
        }}
    }}finally{__CLR4_5_2carcarlvl9ek7u.R.flushNeeded();}}

    private int gaSpecificConfigSize() {try{__CLR4_5_2carcarlvl9ek7u.R.inc(16155);
        __CLR4_5_2carcarlvl9ek7u.R.inc(16156);int n = 0;
        __CLR4_5_2carcarlvl9ek7u.R.inc(16157);n += 1; // frameLengthFlag = in.readBits(1);
        __CLR4_5_2carcarlvl9ek7u.R.inc(16158);n += 1; //dependsOnCoreCoder = in.readBits(1);
        __CLR4_5_2carcarlvl9ek7u.R.inc(16159);if ((((dependsOnCoreCoder == 1)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16160)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16161)==0&false))) {{
            __CLR4_5_2carcarlvl9ek7u.R.inc(16162);n += 14; // coreCoderDelay = in.readBits(14);
        }
        }__CLR4_5_2carcarlvl9ek7u.R.inc(16163);n += 1; // extensionFlag = in.readBits(1);
        __CLR4_5_2carcarlvl9ek7u.R.inc(16164);if ((((channelConfiguration == 0)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16165)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16166)==0&false))) {{
            __CLR4_5_2carcarlvl9ek7u.R.inc(16167);throw new UnsupportedOperationException("can't parse program_config_element yet");
            //program_config_element ();
        }
        }__CLR4_5_2carcarlvl9ek7u.R.inc(16168);if (((((audioObjectType == 6) || (audioObjectType == 20))&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16169)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16170)==0&false))) {{
            __CLR4_5_2carcarlvl9ek7u.R.inc(16171);n += 3; // layerNr = in.readBits(3);
        }
        }__CLR4_5_2carcarlvl9ek7u.R.inc(16172);if ((((extensionFlag == 1)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16173)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16174)==0&false))) {{
            __CLR4_5_2carcarlvl9ek7u.R.inc(16175);if ((((audioObjectType == 22)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16176)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16177)==0&false))) {{
                __CLR4_5_2carcarlvl9ek7u.R.inc(16178);n += 5; // numOfSubFrame = in.readBits(5);
                __CLR4_5_2carcarlvl9ek7u.R.inc(16179);n += 11; //layer_length = in.readBits(11);
            }
            }__CLR4_5_2carcarlvl9ek7u.R.inc(16180);if ((((audioObjectType == 17 || audioObjectType == 19 ||
                    audioObjectType == 20 || audioObjectType == 23)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16181)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16182)==0&false))) {{
                __CLR4_5_2carcarlvl9ek7u.R.inc(16183);n += 1; // aacSectionDataResilienceFlag = in.readBool();
                __CLR4_5_2carcarlvl9ek7u.R.inc(16184);n += 1; //aacScalefactorDataResilienceFlag = in.readBool();
                __CLR4_5_2carcarlvl9ek7u.R.inc(16185);n += 1; //aacSpectralDataResilienceFlag = in.readBool();
            }
            }__CLR4_5_2carcarlvl9ek7u.R.inc(16186);n += 1; //extensionFlag3 = in.readBits(1);
            __CLR4_5_2carcarlvl9ek7u.R.inc(16187);if ((((extensionFlag3 == 1)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16188)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16189)==0&false))) {{
                __CLR4_5_2carcarlvl9ek7u.R.inc(16190);throw new RuntimeException("Not implemented");
            }
        }}
        }__CLR4_5_2carcarlvl9ek7u.R.inc(16191);return n;
    }finally{__CLR4_5_2carcarlvl9ek7u.R.flushNeeded();}}

    int getContentSize() {try{__CLR4_5_2carcarlvl9ek7u.R.inc(16192);
        __CLR4_5_2carcarlvl9ek7u.R.inc(16193);int sizeInBits = 5;
        __CLR4_5_2carcarlvl9ek7u.R.inc(16194);if ((((originalAudioObjectType > 30)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16195)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16196)==0&false))) {{
            __CLR4_5_2carcarlvl9ek7u.R.inc(16197);sizeInBits += 6; // extended type
        }
        }__CLR4_5_2carcarlvl9ek7u.R.inc(16198);sizeInBits += 4; // samplingFrequencyIndex
        __CLR4_5_2carcarlvl9ek7u.R.inc(16199);if ((((samplingFrequencyIndex == 0xf)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16200)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16201)==0&false))) {{
            __CLR4_5_2carcarlvl9ek7u.R.inc(16202);sizeInBits += 24;
        }
        }__CLR4_5_2carcarlvl9ek7u.R.inc(16203);sizeInBits += 4; // channelConfiguration
        __CLR4_5_2carcarlvl9ek7u.R.inc(16204);if ((((audioObjectType == 5 ||
                audioObjectType == 29)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16205)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16206)==0&false))) {{
            __CLR4_5_2carcarlvl9ek7u.R.inc(16207);sizeInBits += 4; // extensionSamplingFrequencyIndex = bitReaderBuffer.readBits(4);
            __CLR4_5_2carcarlvl9ek7u.R.inc(16208);if ((((extensionSamplingFrequencyIndex == 0xf)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16209)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16210)==0&false))) {{
                // extensionSamplingFrequency = bitReaderBuffer.readBits(24);
                __CLR4_5_2carcarlvl9ek7u.R.inc(16211);sizeInBits += 24;
            }
        }}

        }__CLR4_5_2carcarlvl9ek7u.R.inc(16212);if ((((audioObjectType == 22)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16213)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16214)==0&false))) {{
            __CLR4_5_2carcarlvl9ek7u.R.inc(16215);sizeInBits += 4; //   extensionChannelConfiguration
        }


        }__CLR4_5_2carcarlvl9ek7u.R.inc(16216);if ((((gaSpecificConfig)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16217)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16218)==0&false))) {{
            __CLR4_5_2carcarlvl9ek7u.R.inc(16219);sizeInBits += gaSpecificConfigSize();
        }
        }__CLR4_5_2carcarlvl9ek7u.R.inc(16220);if ((((outerSyncExtensionType >= 0)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16221)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16222)==0&false))) {{
            __CLR4_5_2carcarlvl9ek7u.R.inc(16223);sizeInBits += 11; //outerSyncExtensionType = syncExtensionType = bitReaderBuffer.readBits(11);
            __CLR4_5_2carcarlvl9ek7u.R.inc(16224);if ((((outerSyncExtensionType == 0x2b7)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16225)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16226)==0&false))) {{
                __CLR4_5_2carcarlvl9ek7u.R.inc(16227);sizeInBits += 5;
                __CLR4_5_2carcarlvl9ek7u.R.inc(16228);if ((((extensionAudioObjectType > 30)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16229)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16230)==0&false))) {{
                    __CLR4_5_2carcarlvl9ek7u.R.inc(16231);sizeInBits += 6; // extended type
                } // extensionAudioObjectType = getAudioObjectType(bitReaderBuffer);
                }__CLR4_5_2carcarlvl9ek7u.R.inc(16232);if ((((extensionAudioObjectType == 5)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16233)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16234)==0&false))) {{
                    __CLR4_5_2carcarlvl9ek7u.R.inc(16235);sizeInBits += 1;
                    __CLR4_5_2carcarlvl9ek7u.R.inc(16236);if ((((sbrPresentFlag)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16237)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16238)==0&false))) {{
                        __CLR4_5_2carcarlvl9ek7u.R.inc(16239);sizeInBits += 4; // extensionSamplingFrequencyIndex = bitReaderBuffer.readBits(4);
                        __CLR4_5_2carcarlvl9ek7u.R.inc(16240);if ((((extensionSamplingFrequencyIndex == 0xf)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16241)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16242)==0&false))) {{
                            __CLR4_5_2carcarlvl9ek7u.R.inc(16243);sizeInBits += 24; // extensionSamplingFrequency = bitReaderBuffer.readBits(24);
                        }
                        }__CLR4_5_2carcarlvl9ek7u.R.inc(16244);if ((((innerSyncExtensionType >= 0)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16245)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16246)==0&false))) {{
                            __CLR4_5_2carcarlvl9ek7u.R.inc(16247);sizeInBits += 11;   // innerSyncExtensionType = syncExtensionType = bitReaderBuffer.readBits(11); //10101001000
                            __CLR4_5_2carcarlvl9ek7u.R.inc(16248);if ((((innerSyncExtensionType == 0x548)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16249)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16250)==0&false))) {{
                                __CLR4_5_2carcarlvl9ek7u.R.inc(16251);sizeInBits += 1; // psPresentFlag = bitReaderBuffer.readBool();
                            }
                        }}
                    }}
                }}
                }__CLR4_5_2carcarlvl9ek7u.R.inc(16252);if ((((extensionAudioObjectType == 22)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16253)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16254)==0&false))) {{
                    __CLR4_5_2carcarlvl9ek7u.R.inc(16255);sizeInBits += 1; //sbrPresentFlag = bitReaderBuffer.readBool();
                    __CLR4_5_2carcarlvl9ek7u.R.inc(16256);if ((((sbrPresentFlag)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16257)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16258)==0&false))) {{
                        __CLR4_5_2carcarlvl9ek7u.R.inc(16259);sizeInBits += 4; // extensionSamplingFrequencyIndex = bitReaderBuffer.readBits(4);
                        __CLR4_5_2carcarlvl9ek7u.R.inc(16260);if ((((extensionSamplingFrequencyIndex == 0xf)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16261)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16262)==0&false))) {{
                            __CLR4_5_2carcarlvl9ek7u.R.inc(16263);sizeInBits += 24; //extensionSamplingFrequency = bitReaderBuffer.readBits(24);
                        }
                    }}
                    }__CLR4_5_2carcarlvl9ek7u.R.inc(16264);sizeInBits += 4; //extensionChannelConfiguration = bitReaderBuffer.readBits(4);
                }
            }}
        }}
        }__CLR4_5_2carcarlvl9ek7u.R.inc(16265);return (int) Math.ceil(((double) sizeInBits) / 8);
    }finally{__CLR4_5_2carcarlvl9ek7u.R.flushNeeded();}}

    public ByteBuffer serialize() {try{__CLR4_5_2carcarlvl9ek7u.R.inc(16266);
        __CLR4_5_2carcarlvl9ek7u.R.inc(16267);ByteBuffer out = ByteBuffer.allocate(getSize());
        __CLR4_5_2carcarlvl9ek7u.R.inc(16268);IsoTypeWriter.writeUInt8(out, tag);
        __CLR4_5_2carcarlvl9ek7u.R.inc(16269);writeSize(out, getContentSize());
        __CLR4_5_2carcarlvl9ek7u.R.inc(16270);out.put(serializeConfigBytes());
        __CLR4_5_2carcarlvl9ek7u.R.inc(16271);return (ByteBuffer) out.rewind();
    }finally{__CLR4_5_2carcarlvl9ek7u.R.flushNeeded();}}

    private ByteBuffer serializeConfigBytes() {try{__CLR4_5_2carcarlvl9ek7u.R.inc(16272);
        __CLR4_5_2carcarlvl9ek7u.R.inc(16273);ByteBuffer out = ByteBuffer.wrap(new byte[getContentSize()]);
        __CLR4_5_2carcarlvl9ek7u.R.inc(16274);BitWriterBuffer bitWriterBuffer = new BitWriterBuffer(out);
        __CLR4_5_2carcarlvl9ek7u.R.inc(16275);writeAudioObjectType(originalAudioObjectType, bitWriterBuffer);
        __CLR4_5_2carcarlvl9ek7u.R.inc(16276);bitWriterBuffer.writeBits(samplingFrequencyIndex, 4);

        __CLR4_5_2carcarlvl9ek7u.R.inc(16277);if ((((samplingFrequencyIndex == 0xf)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16278)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16279)==0&false))) {{
            __CLR4_5_2carcarlvl9ek7u.R.inc(16280);bitWriterBuffer.writeBits(samplingFrequency, 24);
        }

        }__CLR4_5_2carcarlvl9ek7u.R.inc(16281);bitWriterBuffer.writeBits(channelConfiguration, 4);

        __CLR4_5_2carcarlvl9ek7u.R.inc(16282);if ((((audioObjectType == 5 ||
                audioObjectType == 29)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16283)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16284)==0&false))) {{
            __CLR4_5_2carcarlvl9ek7u.R.inc(16285);extensionAudioObjectType = 5;
            __CLR4_5_2carcarlvl9ek7u.R.inc(16286);sbrPresentFlag = true;
            __CLR4_5_2carcarlvl9ek7u.R.inc(16287);if ((((audioObjectType == 29)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16288)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16289)==0&false))) {{
                __CLR4_5_2carcarlvl9ek7u.R.inc(16290);psPresentFlag = true;
            }
            }__CLR4_5_2carcarlvl9ek7u.R.inc(16291);bitWriterBuffer.writeBits(extensionSamplingFrequencyIndex, 4);
            __CLR4_5_2carcarlvl9ek7u.R.inc(16292);if ((((extensionSamplingFrequencyIndex == 0xf)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16293)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16294)==0&false)))
                {__CLR4_5_2carcarlvl9ek7u.R.inc(16295);bitWriterBuffer.writeBits(extensionSamplingFrequency, 24);
            }__CLR4_5_2carcarlvl9ek7u.R.inc(16296);writeAudioObjectType(audioObjectType, bitWriterBuffer);
            __CLR4_5_2carcarlvl9ek7u.R.inc(16297);if ((((audioObjectType == 22)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16298)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16299)==0&false)))
                {__CLR4_5_2carcarlvl9ek7u.R.inc(16300);bitWriterBuffer.writeBits(extensionChannelConfiguration, 4);
        }}
        }boolean __CLB4_5_2_bool2=false;__CLR4_5_2carcarlvl9ek7u.R.inc(16301);switch (audioObjectType) {
            case 1:if (!__CLB4_5_2_bool2) {__CLR4_5_2carcarlvl9ek7u.R.inc(16302);__CLB4_5_2_bool2=true;}
            case 2:if (!__CLB4_5_2_bool2) {__CLR4_5_2carcarlvl9ek7u.R.inc(16303);__CLB4_5_2_bool2=true;}
            case 3:if (!__CLB4_5_2_bool2) {__CLR4_5_2carcarlvl9ek7u.R.inc(16304);__CLB4_5_2_bool2=true;}
            case 4:if (!__CLB4_5_2_bool2) {__CLR4_5_2carcarlvl9ek7u.R.inc(16305);__CLB4_5_2_bool2=true;}
            case 6:if (!__CLB4_5_2_bool2) {__CLR4_5_2carcarlvl9ek7u.R.inc(16306);__CLB4_5_2_bool2=true;}
            case 7:if (!__CLB4_5_2_bool2) {__CLR4_5_2carcarlvl9ek7u.R.inc(16307);__CLB4_5_2_bool2=true;}
            case 17:if (!__CLB4_5_2_bool2) {__CLR4_5_2carcarlvl9ek7u.R.inc(16308);__CLB4_5_2_bool2=true;}
            case 19:if (!__CLB4_5_2_bool2) {__CLR4_5_2carcarlvl9ek7u.R.inc(16309);__CLB4_5_2_bool2=true;}
            case 20:if (!__CLB4_5_2_bool2) {__CLR4_5_2carcarlvl9ek7u.R.inc(16310);__CLB4_5_2_bool2=true;}
            case 21:if (!__CLB4_5_2_bool2) {__CLR4_5_2carcarlvl9ek7u.R.inc(16311);__CLB4_5_2_bool2=true;}
            case 22:if (!__CLB4_5_2_bool2) {__CLR4_5_2carcarlvl9ek7u.R.inc(16312);__CLB4_5_2_bool2=true;}
            case 23:if (!__CLB4_5_2_bool2) {__CLR4_5_2carcarlvl9ek7u.R.inc(16313);__CLB4_5_2_bool2=true;}
                __CLR4_5_2carcarlvl9ek7u.R.inc(16314);writeGaSpecificConfig(bitWriterBuffer);
                //GASpecificConfig();
                __CLR4_5_2carcarlvl9ek7u.R.inc(16315);break;
            case 8:if (!__CLB4_5_2_bool2) {__CLR4_5_2carcarlvl9ek7u.R.inc(16316);__CLB4_5_2_bool2=true;}
                __CLR4_5_2carcarlvl9ek7u.R.inc(16317);throw new UnsupportedOperationException("can't write CelpSpecificConfig yet");
                //CelpSpecificConfig();
                //break;
            case 9:if (!__CLB4_5_2_bool2) {__CLR4_5_2carcarlvl9ek7u.R.inc(16318);__CLB4_5_2_bool2=true;}
                __CLR4_5_2carcarlvl9ek7u.R.inc(16319);throw new UnsupportedOperationException("can't write HvxcSpecificConfig yet");
                //HvxcSpecificConfig();
                //break;
            case 12:if (!__CLB4_5_2_bool2) {__CLR4_5_2carcarlvl9ek7u.R.inc(16320);__CLB4_5_2_bool2=true;}
                __CLR4_5_2carcarlvl9ek7u.R.inc(16321);throw new UnsupportedOperationException("can't write TTSSpecificConfig yet");
                //TTSSpecificConfig();
                //break;
            case 13:if (!__CLB4_5_2_bool2) {__CLR4_5_2carcarlvl9ek7u.R.inc(16322);__CLB4_5_2_bool2=true;}
            case 14:if (!__CLB4_5_2_bool2) {__CLR4_5_2carcarlvl9ek7u.R.inc(16323);__CLB4_5_2_bool2=true;}
            case 15:if (!__CLB4_5_2_bool2) {__CLR4_5_2carcarlvl9ek7u.R.inc(16324);__CLB4_5_2_bool2=true;}
            case 16:if (!__CLB4_5_2_bool2) {__CLR4_5_2carcarlvl9ek7u.R.inc(16325);__CLB4_5_2_bool2=true;}
                __CLR4_5_2carcarlvl9ek7u.R.inc(16326);throw new UnsupportedOperationException("can't write StructuredAudioSpecificConfig yet");
                //StructuredAudioSpecificConfig();
                //break;
            case 24:if (!__CLB4_5_2_bool2) {__CLR4_5_2carcarlvl9ek7u.R.inc(16327);__CLB4_5_2_bool2=true;}
                __CLR4_5_2carcarlvl9ek7u.R.inc(16328);throw new UnsupportedOperationException("can't write ErrorResilientCelpSpecificConfig yet");
                //ErrorResilientCelpSpecificConfig();
                //break;
            case 25:if (!__CLB4_5_2_bool2) {__CLR4_5_2carcarlvl9ek7u.R.inc(16329);__CLB4_5_2_bool2=true;}
                __CLR4_5_2carcarlvl9ek7u.R.inc(16330);throw new UnsupportedOperationException("can't write ErrorResilientHvxcSpecificConfig yet");
                //ErrorResilientHvxcSpecificConfig();
                //break;
            case 26:if (!__CLB4_5_2_bool2) {__CLR4_5_2carcarlvl9ek7u.R.inc(16331);__CLB4_5_2_bool2=true;}
            case 27:if (!__CLB4_5_2_bool2) {__CLR4_5_2carcarlvl9ek7u.R.inc(16332);__CLB4_5_2_bool2=true;}
                __CLR4_5_2carcarlvl9ek7u.R.inc(16333);throw new UnsupportedOperationException("can't write parseParametricSpecificConfig yet");
                // parseParametricSpecificConfig(samplingFrequencyIndex, channelConfiguration, audioObjectType, bitWriterBuffer);
                // ParametricSpecificConfig();
                // break;
            case 28:if (!__CLB4_5_2_bool2) {__CLR4_5_2carcarlvl9ek7u.R.inc(16334);__CLB4_5_2_bool2=true;}
                __CLR4_5_2carcarlvl9ek7u.R.inc(16335);throw new UnsupportedOperationException("can't write SSCSpecificConfig yet");
                //SSCSpecificConfig();
                //break;
            case 30:if (!__CLB4_5_2_bool2) {__CLR4_5_2carcarlvl9ek7u.R.inc(16336);__CLB4_5_2_bool2=true;}
                __CLR4_5_2carcarlvl9ek7u.R.inc(16337);bitWriterBuffer.writeBits(sacPayloadEmbedding, 1);
                __CLR4_5_2carcarlvl9ek7u.R.inc(16338);throw new UnsupportedOperationException("can't write SpatialSpecificConfig yet");
                //SpatialSpecificConfig();
                //break;
            case 32:if (!__CLB4_5_2_bool2) {__CLR4_5_2carcarlvl9ek7u.R.inc(16339);__CLB4_5_2_bool2=true;}
            case 33:if (!__CLB4_5_2_bool2) {__CLR4_5_2carcarlvl9ek7u.R.inc(16340);__CLB4_5_2_bool2=true;}
            case 34:if (!__CLB4_5_2_bool2) {__CLR4_5_2carcarlvl9ek7u.R.inc(16341);__CLB4_5_2_bool2=true;}
                __CLR4_5_2carcarlvl9ek7u.R.inc(16342);throw new UnsupportedOperationException("can't write MPEG_1_2_SpecificConfig yet");
                //MPEG_1_2_SpecificConfig();
                //break;
            case 35:if (!__CLB4_5_2_bool2) {__CLR4_5_2carcarlvl9ek7u.R.inc(16343);__CLB4_5_2_bool2=true;}
                __CLR4_5_2carcarlvl9ek7u.R.inc(16344);throw new UnsupportedOperationException("can't write DSTSpecificConfig yet");
                //DSTSpecificConfig();
                //break;
            case 36:if (!__CLB4_5_2_bool2) {__CLR4_5_2carcarlvl9ek7u.R.inc(16345);__CLB4_5_2_bool2=true;}
                __CLR4_5_2carcarlvl9ek7u.R.inc(16346);bitWriterBuffer.writeBits(fillBits, 5);
                __CLR4_5_2carcarlvl9ek7u.R.inc(16347);throw new UnsupportedOperationException("can't write ALSSpecificConfig yet");
                //ALSSpecificConfig();
                //break;
            case 37:if (!__CLB4_5_2_bool2) {__CLR4_5_2carcarlvl9ek7u.R.inc(16348);__CLB4_5_2_bool2=true;}
            case 38:if (!__CLB4_5_2_bool2) {__CLR4_5_2carcarlvl9ek7u.R.inc(16349);__CLB4_5_2_bool2=true;}
                __CLR4_5_2carcarlvl9ek7u.R.inc(16350);throw new UnsupportedOperationException("can't write SLSSpecificConfig yet");
                //SLSSpecificConfig();
                //break;
            case 39:if (!__CLB4_5_2_bool2) {__CLR4_5_2carcarlvl9ek7u.R.inc(16351);__CLB4_5_2_bool2=true;}
                __CLR4_5_2carcarlvl9ek7u.R.inc(16352);throw new UnsupportedOperationException("can't write ELDSpecificConfig yet");
                //eldSpecificConfig = new ELDSpecificConfig(channelConfiguration, bitWriterBuffer);
                // break;
            case 40:if (!__CLB4_5_2_bool2) {__CLR4_5_2carcarlvl9ek7u.R.inc(16353);__CLB4_5_2_bool2=true;}
            case 41:if (!__CLB4_5_2_bool2) {__CLR4_5_2carcarlvl9ek7u.R.inc(16354);__CLB4_5_2_bool2=true;}
                __CLR4_5_2carcarlvl9ek7u.R.inc(16355);throw new UnsupportedOperationException("can't parse SymbolicMusicSpecificConfig yet");
                //SymbolicMusicSpecificConfig();
                //break;
            default:if (!__CLB4_5_2_bool2) {__CLR4_5_2carcarlvl9ek7u.R.inc(16356);__CLB4_5_2_bool2=true;}
                /* reserved */
        }

        boolean __CLB4_5_2_bool3=false;__CLR4_5_2carcarlvl9ek7u.R.inc(16357);switch (audioObjectType) {
            case 17:if (!__CLB4_5_2_bool3) {__CLR4_5_2carcarlvl9ek7u.R.inc(16358);__CLB4_5_2_bool3=true;}
            case 19:if (!__CLB4_5_2_bool3) {__CLR4_5_2carcarlvl9ek7u.R.inc(16359);__CLB4_5_2_bool3=true;}
            case 20:if (!__CLB4_5_2_bool3) {__CLR4_5_2carcarlvl9ek7u.R.inc(16360);__CLB4_5_2_bool3=true;}
            case 21:if (!__CLB4_5_2_bool3) {__CLR4_5_2carcarlvl9ek7u.R.inc(16361);__CLB4_5_2_bool3=true;}
            case 22:if (!__CLB4_5_2_bool3) {__CLR4_5_2carcarlvl9ek7u.R.inc(16362);__CLB4_5_2_bool3=true;}
            case 23:if (!__CLB4_5_2_bool3) {__CLR4_5_2carcarlvl9ek7u.R.inc(16363);__CLB4_5_2_bool3=true;}
            case 24:if (!__CLB4_5_2_bool3) {__CLR4_5_2carcarlvl9ek7u.R.inc(16364);__CLB4_5_2_bool3=true;}
            case 25:if (!__CLB4_5_2_bool3) {__CLR4_5_2carcarlvl9ek7u.R.inc(16365);__CLB4_5_2_bool3=true;}
            case 26:if (!__CLB4_5_2_bool3) {__CLR4_5_2carcarlvl9ek7u.R.inc(16366);__CLB4_5_2_bool3=true;}
            case 27:if (!__CLB4_5_2_bool3) {__CLR4_5_2carcarlvl9ek7u.R.inc(16367);__CLB4_5_2_bool3=true;}
            case 39:if (!__CLB4_5_2_bool3) {__CLR4_5_2carcarlvl9ek7u.R.inc(16368);__CLB4_5_2_bool3=true;}
                __CLR4_5_2carcarlvl9ek7u.R.inc(16369);bitWriterBuffer.writeBits(epConfig, 2);
                __CLR4_5_2carcarlvl9ek7u.R.inc(16370);if ((((epConfig == 2 || epConfig == 3)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16371)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16372)==0&false))) {{
                    __CLR4_5_2carcarlvl9ek7u.R.inc(16373);throw new UnsupportedOperationException("can't parse ErrorProtectionSpecificConfig yet");
                    //ErrorProtectionSpecificConfig();
                }
                }__CLR4_5_2carcarlvl9ek7u.R.inc(16374);if ((((epConfig == 3)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16375)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16376)==0&false))) {{
                    __CLR4_5_2carcarlvl9ek7u.R.inc(16377);bitWriterBuffer.writeBits(directMapping, 1);
                    __CLR4_5_2carcarlvl9ek7u.R.inc(16378);if ((((directMapping == 0)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16379)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16380)==0&false))) {{
                        /* tbd */
                        __CLR4_5_2carcarlvl9ek7u.R.inc(16381);throw new RuntimeException("not implemented");
                    }
                }}
        }}

        __CLR4_5_2carcarlvl9ek7u.R.inc(16382);if ((((outerSyncExtensionType >= 0)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16383)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16384)==0&false))) {{
            __CLR4_5_2carcarlvl9ek7u.R.inc(16385);bitWriterBuffer.writeBits(outerSyncExtensionType, 11);
            __CLR4_5_2carcarlvl9ek7u.R.inc(16386);if ((((outerSyncExtensionType == 0x2b7)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16387)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16388)==0&false))) {{// 695
                __CLR4_5_2carcarlvl9ek7u.R.inc(16389);writeAudioObjectType(extensionAudioObjectType, bitWriterBuffer);
                __CLR4_5_2carcarlvl9ek7u.R.inc(16390);if ((((extensionAudioObjectType == 5)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16391)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16392)==0&false))) {{
                    __CLR4_5_2carcarlvl9ek7u.R.inc(16393);bitWriterBuffer.writeBool(sbrPresentFlag);
                    __CLR4_5_2carcarlvl9ek7u.R.inc(16394);if ((((sbrPresentFlag)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16395)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16396)==0&false))) {{
                        __CLR4_5_2carcarlvl9ek7u.R.inc(16397);bitWriterBuffer.writeBits(extensionSamplingFrequencyIndex, 4);
                        __CLR4_5_2carcarlvl9ek7u.R.inc(16398);if ((((extensionSamplingFrequencyIndex == 0xf)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16399)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16400)==0&false))) {{
                            __CLR4_5_2carcarlvl9ek7u.R.inc(16401);bitWriterBuffer.writeBits(extensionSamplingFrequency, 24);
                        }
                        }__CLR4_5_2carcarlvl9ek7u.R.inc(16402);if ((((innerSyncExtensionType >= 0)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16403)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16404)==0&false))) {{
                            __CLR4_5_2carcarlvl9ek7u.R.inc(16405);bitWriterBuffer.writeBits(innerSyncExtensionType, 11); //10101001000
                            __CLR4_5_2carcarlvl9ek7u.R.inc(16406);if ((((syncExtensionType == 0x548)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16407)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16408)==0&false))) {{
                                __CLR4_5_2carcarlvl9ek7u.R.inc(16409);bitWriterBuffer.writeBool(psPresentFlag);
                            }
                        }}
                    }}
                }}
                }__CLR4_5_2carcarlvl9ek7u.R.inc(16410);if ((((extensionAudioObjectType == 22)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16411)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16412)==0&false))) {{
                    __CLR4_5_2carcarlvl9ek7u.R.inc(16413);bitWriterBuffer.writeBool(sbrPresentFlag);
                    __CLR4_5_2carcarlvl9ek7u.R.inc(16414);if ((((sbrPresentFlag)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16415)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16416)==0&false))) {{
                        __CLR4_5_2carcarlvl9ek7u.R.inc(16417);bitWriterBuffer.writeBits(extensionSamplingFrequencyIndex, 4);
                        __CLR4_5_2carcarlvl9ek7u.R.inc(16418);if ((((extensionSamplingFrequencyIndex == 0xf)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16419)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16420)==0&false))) {{
                            __CLR4_5_2carcarlvl9ek7u.R.inc(16421);bitWriterBuffer.writeBits(extensionSamplingFrequency, 24);
                        }
                    }}
                    }__CLR4_5_2carcarlvl9ek7u.R.inc(16422);bitWriterBuffer.writeBits(extensionChannelConfiguration, 4);
                }
            }}
        }}

        }__CLR4_5_2carcarlvl9ek7u.R.inc(16423);return (ByteBuffer) out.rewind();
    }finally{__CLR4_5_2carcarlvl9ek7u.R.flushNeeded();}}

    private void writeAudioObjectType(int audioObjectType, BitWriterBuffer bitWriterBuffer) {try{__CLR4_5_2carcarlvl9ek7u.R.inc(16424);
        __CLR4_5_2carcarlvl9ek7u.R.inc(16425);if ((((audioObjectType >= 32)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16426)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16427)==0&false))) {{
            __CLR4_5_2carcarlvl9ek7u.R.inc(16428);bitWriterBuffer.writeBits(31, 5);
            __CLR4_5_2carcarlvl9ek7u.R.inc(16429);bitWriterBuffer.writeBits(audioObjectType - 32, 6);
        } }else {{
            __CLR4_5_2carcarlvl9ek7u.R.inc(16430);bitWriterBuffer.writeBits(audioObjectType, 5);
        }
    }}finally{__CLR4_5_2carcarlvl9ek7u.R.flushNeeded();}}

    private int getAudioObjectType(BitReaderBuffer in) throws IOException {try{__CLR4_5_2carcarlvl9ek7u.R.inc(16431);
        __CLR4_5_2carcarlvl9ek7u.R.inc(16432);int audioObjectType = in.readBits(5);
        __CLR4_5_2carcarlvl9ek7u.R.inc(16433);if ((((audioObjectType == 31)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16434)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16435)==0&false))) {{
            __CLR4_5_2carcarlvl9ek7u.R.inc(16436);audioObjectType = 32 + in.readBits(6);
        }
        }__CLR4_5_2carcarlvl9ek7u.R.inc(16437);return audioObjectType;
    }finally{__CLR4_5_2carcarlvl9ek7u.R.flushNeeded();}}

    private void parseGaSpecificConfig(int samplingFrequencyIndex, int channelConfiguration, int audioObjectType, BitReaderBuffer in) throws IOException {try{__CLR4_5_2carcarlvl9ek7u.R.inc(16438);
//    GASpecificConfig (samplingFrequencyIndex,
//            channelConfiguration,
//            audioObjectType)
//    {
        __CLR4_5_2carcarlvl9ek7u.R.inc(16439);frameLengthFlag = in.readBits(1);
        __CLR4_5_2carcarlvl9ek7u.R.inc(16440);dependsOnCoreCoder = in.readBits(1);
        __CLR4_5_2carcarlvl9ek7u.R.inc(16441);if ((((dependsOnCoreCoder == 1)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16442)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16443)==0&false))) {{
            __CLR4_5_2carcarlvl9ek7u.R.inc(16444);coreCoderDelay = in.readBits(14);
        }
        }__CLR4_5_2carcarlvl9ek7u.R.inc(16445);extensionFlag = in.readBits(1);
        __CLR4_5_2carcarlvl9ek7u.R.inc(16446);if ((((channelConfiguration == 0)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16447)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16448)==0&false))) {{
            __CLR4_5_2carcarlvl9ek7u.R.inc(16449);throw new UnsupportedOperationException("can't parse program_config_element yet");
            //program_config_element ();
        }
        }__CLR4_5_2carcarlvl9ek7u.R.inc(16450);if (((((audioObjectType == 6) || (audioObjectType == 20))&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16451)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16452)==0&false))) {{
            __CLR4_5_2carcarlvl9ek7u.R.inc(16453);layerNr = in.readBits(3);
        }
        }__CLR4_5_2carcarlvl9ek7u.R.inc(16454);if ((((extensionFlag == 1)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16455)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16456)==0&false))) {{
            __CLR4_5_2carcarlvl9ek7u.R.inc(16457);if ((((audioObjectType == 22)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16458)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16459)==0&false))) {{
                __CLR4_5_2carcarlvl9ek7u.R.inc(16460);numOfSubFrame = in.readBits(5);
                __CLR4_5_2carcarlvl9ek7u.R.inc(16461);layer_length = in.readBits(11);
            }
            }__CLR4_5_2carcarlvl9ek7u.R.inc(16462);if ((((audioObjectType == 17 || audioObjectType == 19 ||
                    audioObjectType == 20 || audioObjectType == 23)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16463)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16464)==0&false))) {{
                __CLR4_5_2carcarlvl9ek7u.R.inc(16465);aacSectionDataResilienceFlag = in.readBool();
                __CLR4_5_2carcarlvl9ek7u.R.inc(16466);aacScalefactorDataResilienceFlag = in.readBool();
                __CLR4_5_2carcarlvl9ek7u.R.inc(16467);aacSpectralDataResilienceFlag = in.readBool();
            }
            }__CLR4_5_2carcarlvl9ek7u.R.inc(16468);extensionFlag3 = in.readBits(1);
            __CLR4_5_2carcarlvl9ek7u.R.inc(16469);if ((((extensionFlag3 == 1)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16470)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16471)==0&false))) {{
                __CLR4_5_2carcarlvl9ek7u.R.inc(16472);throw new RuntimeException("not yet implemented");
            }
        }}
//    }
        }__CLR4_5_2carcarlvl9ek7u.R.inc(16473);gaSpecificConfig = true;
    }finally{__CLR4_5_2carcarlvl9ek7u.R.flushNeeded();}}

    private void writeGaSpecificConfig(BitWriterBuffer out) {try{__CLR4_5_2carcarlvl9ek7u.R.inc(16474);
//    GASpecificConfig (samplingFrequencyIndex,
//            channelConfiguration,
//            audioObjectType)
//    {
        __CLR4_5_2carcarlvl9ek7u.R.inc(16475);out.writeBits(frameLengthFlag, 1); // frameLengthFlag = in.readBits(1);
        __CLR4_5_2carcarlvl9ek7u.R.inc(16476);out.writeBits(dependsOnCoreCoder, 1); //= in.readBits(1);
        __CLR4_5_2carcarlvl9ek7u.R.inc(16477);if ((((dependsOnCoreCoder == 1)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16478)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16479)==0&false))) {{
            __CLR4_5_2carcarlvl9ek7u.R.inc(16480);out.writeBits(coreCoderDelay, 14); // = in.readBits(14);
        }
        }__CLR4_5_2carcarlvl9ek7u.R.inc(16481);out.writeBits(extensionFlag, 1); // = in.readBits(1);
        __CLR4_5_2carcarlvl9ek7u.R.inc(16482);if ((((channelConfiguration == 0)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16483)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16484)==0&false))) {{
            __CLR4_5_2carcarlvl9ek7u.R.inc(16485);throw new UnsupportedOperationException("can't parse program_config_element yet");
            //program_config_element ();
        }
        }__CLR4_5_2carcarlvl9ek7u.R.inc(16486);if (((((audioObjectType == 6) || (audioObjectType == 20))&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16487)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16488)==0&false))) {{
            __CLR4_5_2carcarlvl9ek7u.R.inc(16489);out.writeBits(layerNr, 3);// = in.readBits(3);
        }
        }__CLR4_5_2carcarlvl9ek7u.R.inc(16490);if ((((extensionFlag == 1)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16491)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16492)==0&false))) {{
            __CLR4_5_2carcarlvl9ek7u.R.inc(16493);if ((((audioObjectType == 22)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16494)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16495)==0&false))) {{
                __CLR4_5_2carcarlvl9ek7u.R.inc(16496);out.writeBits(numOfSubFrame, 5); // = in.readBits(5);
                __CLR4_5_2carcarlvl9ek7u.R.inc(16497);out.writeBits(layer_length, 11); // = in.readBits(11);
            }
            }__CLR4_5_2carcarlvl9ek7u.R.inc(16498);if ((((audioObjectType == 17 || audioObjectType == 19 ||
                    audioObjectType == 20 || audioObjectType == 23)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16499)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16500)==0&false))) {{
                __CLR4_5_2carcarlvl9ek7u.R.inc(16501);out.writeBool(aacSectionDataResilienceFlag); // = in.readBool();
                __CLR4_5_2carcarlvl9ek7u.R.inc(16502);out.writeBool(aacScalefactorDataResilienceFlag); // = in.readBool();
                __CLR4_5_2carcarlvl9ek7u.R.inc(16503);out.writeBool(aacSpectralDataResilienceFlag); // = in.readBool();
            }
            }__CLR4_5_2carcarlvl9ek7u.R.inc(16504);out.writeBits(extensionFlag3, 1); // = in.readBits(1);
            __CLR4_5_2carcarlvl9ek7u.R.inc(16505);if ((((extensionFlag3 == 1)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16506)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16507)==0&false))) {{
                __CLR4_5_2carcarlvl9ek7u.R.inc(16508);throw new RuntimeException("not yet implemented");
            }
        }}
    }}finally{__CLR4_5_2carcarlvl9ek7u.R.flushNeeded();}}

    private void parseParametricSpecificConfig(int samplingFrequencyIndex, int channelConfiguration, int audioObjectType, BitReaderBuffer in) throws IOException {try{__CLR4_5_2carcarlvl9ek7u.R.inc(16509);
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
        __CLR4_5_2carcarlvl9ek7u.R.inc(16510);isBaseLayer = in.readBits(1);
        __CLR4_5_2carcarlvl9ek7u.R.inc(16511);if ((((isBaseLayer == 1)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16512)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16513)==0&false))) {{
            __CLR4_5_2carcarlvl9ek7u.R.inc(16514);parseParaConfig(samplingFrequencyIndex, channelConfiguration, audioObjectType, in);
        } }else {{
            __CLR4_5_2carcarlvl9ek7u.R.inc(16515);parseHilnEnexConfig(samplingFrequencyIndex, channelConfiguration, audioObjectType, in);
        }
    }}finally{__CLR4_5_2carcarlvl9ek7u.R.flushNeeded();}}

    private void parseParaConfig(int samplingFrequencyIndex, int channelConfiguration, int audioObjectType, BitReaderBuffer in) throws IOException {try{__CLR4_5_2carcarlvl9ek7u.R.inc(16516);
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
        __CLR4_5_2carcarlvl9ek7u.R.inc(16517);paraMode = in.readBits(2);

        __CLR4_5_2carcarlvl9ek7u.R.inc(16518);if ((((paraMode != 1)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16519)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16520)==0&false))) {{
            __CLR4_5_2carcarlvl9ek7u.R.inc(16521);parseErHvxcConfig(samplingFrequencyIndex, channelConfiguration, audioObjectType, in);
        }
        }__CLR4_5_2carcarlvl9ek7u.R.inc(16522);if ((((paraMode != 0)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16523)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16524)==0&false))) {{
            __CLR4_5_2carcarlvl9ek7u.R.inc(16525);parseHilnConfig(samplingFrequencyIndex, channelConfiguration, audioObjectType, in);
        }

        }__CLR4_5_2carcarlvl9ek7u.R.inc(16526);paraExtensionFlag = in.readBits(1);
        __CLR4_5_2carcarlvl9ek7u.R.inc(16527);parametricSpecificConfig = true;
    }finally{__CLR4_5_2carcarlvl9ek7u.R.flushNeeded();}}

    private void parseErHvxcConfig(int samplingFrequencyIndex, int channelConfiguration, int audioObjectType, BitReaderBuffer in) throws IOException {try{__CLR4_5_2carcarlvl9ek7u.R.inc(16528);
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
        __CLR4_5_2carcarlvl9ek7u.R.inc(16529);hvxcVarMode = in.readBits(1);
        __CLR4_5_2carcarlvl9ek7u.R.inc(16530);hvxcRateMode = in.readBits(2);
        __CLR4_5_2carcarlvl9ek7u.R.inc(16531);erHvxcExtensionFlag = in.readBits(1);

        __CLR4_5_2carcarlvl9ek7u.R.inc(16532);if ((((erHvxcExtensionFlag == 1)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16533)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16534)==0&false))) {{
            __CLR4_5_2carcarlvl9ek7u.R.inc(16535);var_ScalableFlag = in.readBits(1);
        }
    }}finally{__CLR4_5_2carcarlvl9ek7u.R.flushNeeded();}}

    private void parseHilnConfig(int samplingFrequencyIndex, int channelConfiguration, int audioObjectType, BitReaderBuffer in) throws IOException {try{__CLR4_5_2carcarlvl9ek7u.R.inc(16536);
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
        __CLR4_5_2carcarlvl9ek7u.R.inc(16537);hilnQuantMode = in.readBits(1);
        __CLR4_5_2carcarlvl9ek7u.R.inc(16538);hilnMaxNumLine = in.readBits(8);
        __CLR4_5_2carcarlvl9ek7u.R.inc(16539);hilnSampleRateCode = in.readBits(4);
        __CLR4_5_2carcarlvl9ek7u.R.inc(16540);hilnFrameLength = in.readBits(12);
        __CLR4_5_2carcarlvl9ek7u.R.inc(16541);hilnContMode = in.readBits(2);
    }finally{__CLR4_5_2carcarlvl9ek7u.R.flushNeeded();}}

    private void parseHilnEnexConfig(int samplingFrequencyIndex, int channelConfiguration, int audioObjectType, BitReaderBuffer in) throws IOException {try{__CLR4_5_2carcarlvl9ek7u.R.inc(16542);
        /*
        HILNenexConfig()
        {
            HILNenhaLayer; 1 uimsbf
            if (HILNenhaLayer) {
                HILNenhaQuantMode; 2 uimsbf
            }
        }
        */
        __CLR4_5_2carcarlvl9ek7u.R.inc(16543);hilnEnhaLayer = in.readBits(1);
        __CLR4_5_2carcarlvl9ek7u.R.inc(16544);if ((((hilnEnhaLayer == 1)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16545)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16546)==0&false))) {{
            __CLR4_5_2carcarlvl9ek7u.R.inc(16547);hilnEnhaQuantMode = in.readBits(2);
        }
    }}finally{__CLR4_5_2carcarlvl9ek7u.R.flushNeeded();}}

    public byte[] getConfigBytes() {try{__CLR4_5_2carcarlvl9ek7u.R.inc(16548);
        __CLR4_5_2carcarlvl9ek7u.R.inc(16549);return serializeConfigBytes().array();
    }finally{__CLR4_5_2carcarlvl9ek7u.R.flushNeeded();}}

    public int getAudioObjectType() {try{__CLR4_5_2carcarlvl9ek7u.R.inc(16550);
        __CLR4_5_2carcarlvl9ek7u.R.inc(16551);return audioObjectType;
    }finally{__CLR4_5_2carcarlvl9ek7u.R.flushNeeded();}}

    public void setAudioObjectType(int audioObjectType) {try{__CLR4_5_2carcarlvl9ek7u.R.inc(16552);
        __CLR4_5_2carcarlvl9ek7u.R.inc(16553);this.audioObjectType = audioObjectType;
    }finally{__CLR4_5_2carcarlvl9ek7u.R.flushNeeded();}}

    public void setOriginalAudioObjectType(int originalAudioObjectType) {try{__CLR4_5_2carcarlvl9ek7u.R.inc(16554);
        __CLR4_5_2carcarlvl9ek7u.R.inc(16555);this.originalAudioObjectType = originalAudioObjectType;
    }finally{__CLR4_5_2carcarlvl9ek7u.R.flushNeeded();}}

    public int getExtensionAudioObjectType() {try{__CLR4_5_2carcarlvl9ek7u.R.inc(16556);
        __CLR4_5_2carcarlvl9ek7u.R.inc(16557);return extensionAudioObjectType;
    }finally{__CLR4_5_2carcarlvl9ek7u.R.flushNeeded();}}

    public void setSamplingFrequencyIndex(int samplingFrequencyIndex) {try{__CLR4_5_2carcarlvl9ek7u.R.inc(16558);
        __CLR4_5_2carcarlvl9ek7u.R.inc(16559);this.samplingFrequencyIndex = samplingFrequencyIndex;
    }finally{__CLR4_5_2carcarlvl9ek7u.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_5_2carcarlvl9ek7u.R.inc(16560);
        __CLR4_5_2carcarlvl9ek7u.R.inc(16561);final StringBuilder sb = new StringBuilder();
        __CLR4_5_2carcarlvl9ek7u.R.inc(16562);sb.append("AudioSpecificConfig");
        __CLR4_5_2carcarlvl9ek7u.R.inc(16563);sb.append("{configBytes=").append(Hex.encodeHex(configBytes));
        __CLR4_5_2carcarlvl9ek7u.R.inc(16564);sb.append(", audioObjectType=").append(audioObjectType).append(" (").append(audioObjectTypeMap.get(audioObjectType)).append(")");
        __CLR4_5_2carcarlvl9ek7u.R.inc(16565);sb.append(", samplingFrequencyIndex=").append(samplingFrequencyIndex).append(" (").append(samplingFrequencyIndexMap.get(samplingFrequencyIndex)).append(")");
        __CLR4_5_2carcarlvl9ek7u.R.inc(16566);sb.append(", samplingFrequency=").append(samplingFrequency);
        __CLR4_5_2carcarlvl9ek7u.R.inc(16567);sb.append(", channelConfiguration=").append(channelConfiguration);
        __CLR4_5_2carcarlvl9ek7u.R.inc(16568);if ((((extensionAudioObjectType > 0)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16569)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16570)==0&false))) {{
            __CLR4_5_2carcarlvl9ek7u.R.inc(16571);sb.append(", extensionAudioObjectType=").append(extensionAudioObjectType).append(" (").append(audioObjectTypeMap.get(extensionAudioObjectType)).append(")");
            __CLR4_5_2carcarlvl9ek7u.R.inc(16572);sb.append(", sbrPresentFlag=").append(sbrPresentFlag);
            __CLR4_5_2carcarlvl9ek7u.R.inc(16573);sb.append(", psPresentFlag=").append(psPresentFlag);
            __CLR4_5_2carcarlvl9ek7u.R.inc(16574);sb.append(", extensionSamplingFrequencyIndex=").append(extensionSamplingFrequencyIndex).append(" (").append(samplingFrequencyIndexMap.get(extensionSamplingFrequencyIndex)).append(")");
            __CLR4_5_2carcarlvl9ek7u.R.inc(16575);sb.append(", extensionSamplingFrequency=").append(extensionSamplingFrequency);
            __CLR4_5_2carcarlvl9ek7u.R.inc(16576);sb.append(", extensionChannelConfiguration=").append(extensionChannelConfiguration);
        }
//    sb.append(", sacPayloadEmbedding=").append(sacPayloadEmbedding);
//    sb.append(", fillBits=").append(fillBits);
//    sb.append(", epConfig=").append(epConfig);
//    sb.append(", directMapping=").append(directMapping);
        }__CLR4_5_2carcarlvl9ek7u.R.inc(16577);sb.append(", syncExtensionType=").append(syncExtensionType);
        __CLR4_5_2carcarlvl9ek7u.R.inc(16578);if ((((gaSpecificConfig)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16579)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16580)==0&false))) {{
            __CLR4_5_2carcarlvl9ek7u.R.inc(16581);sb.append(", frameLengthFlag=").append(frameLengthFlag);
            __CLR4_5_2carcarlvl9ek7u.R.inc(16582);sb.append(", dependsOnCoreCoder=").append(dependsOnCoreCoder);
            __CLR4_5_2carcarlvl9ek7u.R.inc(16583);sb.append(", coreCoderDelay=").append(coreCoderDelay);
            __CLR4_5_2carcarlvl9ek7u.R.inc(16584);sb.append(", extensionFlag=").append(extensionFlag);
            __CLR4_5_2carcarlvl9ek7u.R.inc(16585);sb.append(", layerNr=").append(layerNr);
            __CLR4_5_2carcarlvl9ek7u.R.inc(16586);sb.append(", numOfSubFrame=").append(numOfSubFrame);
            __CLR4_5_2carcarlvl9ek7u.R.inc(16587);sb.append(", layer_length=").append(layer_length);
            __CLR4_5_2carcarlvl9ek7u.R.inc(16588);sb.append(", aacSectionDataResilienceFlag=").append(aacSectionDataResilienceFlag);
            __CLR4_5_2carcarlvl9ek7u.R.inc(16589);sb.append(", aacScalefactorDataResilienceFlag=").append(aacScalefactorDataResilienceFlag);
            __CLR4_5_2carcarlvl9ek7u.R.inc(16590);sb.append(", aacSpectralDataResilienceFlag=").append(aacSpectralDataResilienceFlag);
            __CLR4_5_2carcarlvl9ek7u.R.inc(16591);sb.append(", extensionFlag3=").append(extensionFlag3);
        }
        }__CLR4_5_2carcarlvl9ek7u.R.inc(16592);if ((((parametricSpecificConfig)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16593)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16594)==0&false))) {{
            __CLR4_5_2carcarlvl9ek7u.R.inc(16595);sb.append(", isBaseLayer=").append(isBaseLayer);
            __CLR4_5_2carcarlvl9ek7u.R.inc(16596);sb.append(", paraMode=").append(paraMode);
            __CLR4_5_2carcarlvl9ek7u.R.inc(16597);sb.append(", paraExtensionFlag=").append(paraExtensionFlag);
            __CLR4_5_2carcarlvl9ek7u.R.inc(16598);sb.append(", hvxcVarMode=").append(hvxcVarMode);
            __CLR4_5_2carcarlvl9ek7u.R.inc(16599);sb.append(", hvxcRateMode=").append(hvxcRateMode);
            __CLR4_5_2carcarlvl9ek7u.R.inc(16600);sb.append(", erHvxcExtensionFlag=").append(erHvxcExtensionFlag);
            __CLR4_5_2carcarlvl9ek7u.R.inc(16601);sb.append(", var_ScalableFlag=").append(var_ScalableFlag);
            __CLR4_5_2carcarlvl9ek7u.R.inc(16602);sb.append(", hilnQuantMode=").append(hilnQuantMode);
            __CLR4_5_2carcarlvl9ek7u.R.inc(16603);sb.append(", hilnMaxNumLine=").append(hilnMaxNumLine);
            __CLR4_5_2carcarlvl9ek7u.R.inc(16604);sb.append(", hilnSampleRateCode=").append(hilnSampleRateCode);
            __CLR4_5_2carcarlvl9ek7u.R.inc(16605);sb.append(", hilnFrameLength=").append(hilnFrameLength);
            __CLR4_5_2carcarlvl9ek7u.R.inc(16606);sb.append(", hilnContMode=").append(hilnContMode);
            __CLR4_5_2carcarlvl9ek7u.R.inc(16607);sb.append(", hilnEnhaLayer=").append(hilnEnhaLayer);
            __CLR4_5_2carcarlvl9ek7u.R.inc(16608);sb.append(", hilnEnhaQuantMode=").append(hilnEnhaQuantMode);
        }
        }__CLR4_5_2carcarlvl9ek7u.R.inc(16609);sb.append('}');
        __CLR4_5_2carcarlvl9ek7u.R.inc(16610);return sb.toString();
    }finally{__CLR4_5_2carcarlvl9ek7u.R.flushNeeded();}}

    public int getSamplingFrequency() {try{__CLR4_5_2carcarlvl9ek7u.R.inc(16611);
        __CLR4_5_2carcarlvl9ek7u.R.inc(16612);return (((samplingFrequencyIndex == 0xf )&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16613)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16614)==0&false))? samplingFrequency : samplingFrequencyIndexMap.get(samplingFrequencyIndex);
    }finally{__CLR4_5_2carcarlvl9ek7u.R.flushNeeded();}}

    public int getExtensionSamplingFrequency() {try{__CLR4_5_2carcarlvl9ek7u.R.inc(16615);
        __CLR4_5_2carcarlvl9ek7u.R.inc(16616);return (((extensionSamplingFrequencyIndex == 0xf )&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16617)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16618)==0&false))? extensionSamplingFrequency : samplingFrequencyIndexMap.get(extensionSamplingFrequencyIndex);
    }finally{__CLR4_5_2carcarlvl9ek7u.R.flushNeeded();}}

    public void setSamplingFrequency(int samplingFrequency) {try{__CLR4_5_2carcarlvl9ek7u.R.inc(16619);
        __CLR4_5_2carcarlvl9ek7u.R.inc(16620);this.samplingFrequency = samplingFrequency;
    }finally{__CLR4_5_2carcarlvl9ek7u.R.flushNeeded();}}

    public int getChannelConfiguration() {try{__CLR4_5_2carcarlvl9ek7u.R.inc(16621);
        __CLR4_5_2carcarlvl9ek7u.R.inc(16622);return channelConfiguration;
    }finally{__CLR4_5_2carcarlvl9ek7u.R.flushNeeded();}}

    public void setChannelConfiguration(int channelConfiguration) {try{__CLR4_5_2carcarlvl9ek7u.R.inc(16623);
        __CLR4_5_2carcarlvl9ek7u.R.inc(16624);this.channelConfiguration = channelConfiguration;
    }finally{__CLR4_5_2carcarlvl9ek7u.R.flushNeeded();}}

    @Override
    public boolean equals(Object o) {try{__CLR4_5_2carcarlvl9ek7u.R.inc(16625);
        __CLR4_5_2carcarlvl9ek7u.R.inc(16626);if ((((this == o)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16627)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16628)==0&false))) {{
            __CLR4_5_2carcarlvl9ek7u.R.inc(16629);return true;
        }
        }__CLR4_5_2carcarlvl9ek7u.R.inc(16630);if ((((o == null || getClass() != o.getClass())&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16631)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16632)==0&false))) {{
            __CLR4_5_2carcarlvl9ek7u.R.inc(16633);return false;
        }

        }__CLR4_5_2carcarlvl9ek7u.R.inc(16634);AudioSpecificConfig that = (AudioSpecificConfig) o;

        __CLR4_5_2carcarlvl9ek7u.R.inc(16635);if ((((aacScalefactorDataResilienceFlag != that.aacScalefactorDataResilienceFlag)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16636)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16637)==0&false))) {{
            __CLR4_5_2carcarlvl9ek7u.R.inc(16638);return false;
        }
        }__CLR4_5_2carcarlvl9ek7u.R.inc(16639);if ((((aacSectionDataResilienceFlag != that.aacSectionDataResilienceFlag)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16640)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16641)==0&false))) {{
            __CLR4_5_2carcarlvl9ek7u.R.inc(16642);return false;
        }
        }__CLR4_5_2carcarlvl9ek7u.R.inc(16643);if ((((aacSpectralDataResilienceFlag != that.aacSpectralDataResilienceFlag)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16644)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16645)==0&false))) {{
            __CLR4_5_2carcarlvl9ek7u.R.inc(16646);return false;
        }
        }__CLR4_5_2carcarlvl9ek7u.R.inc(16647);if ((((audioObjectType != that.audioObjectType)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16648)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16649)==0&false))) {{
            __CLR4_5_2carcarlvl9ek7u.R.inc(16650);return false;
        }
        }__CLR4_5_2carcarlvl9ek7u.R.inc(16651);if ((((channelConfiguration != that.channelConfiguration)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16652)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16653)==0&false))) {{
            __CLR4_5_2carcarlvl9ek7u.R.inc(16654);return false;
        }
        }__CLR4_5_2carcarlvl9ek7u.R.inc(16655);if ((((coreCoderDelay != that.coreCoderDelay)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16656)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16657)==0&false))) {{
            __CLR4_5_2carcarlvl9ek7u.R.inc(16658);return false;
        }
        }__CLR4_5_2carcarlvl9ek7u.R.inc(16659);if ((((dependsOnCoreCoder != that.dependsOnCoreCoder)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16660)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16661)==0&false))) {{
            __CLR4_5_2carcarlvl9ek7u.R.inc(16662);return false;
        }
        }__CLR4_5_2carcarlvl9ek7u.R.inc(16663);if ((((directMapping != that.directMapping)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16664)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16665)==0&false))) {{
            __CLR4_5_2carcarlvl9ek7u.R.inc(16666);return false;
        }
        }__CLR4_5_2carcarlvl9ek7u.R.inc(16667);if ((((epConfig != that.epConfig)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16668)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16669)==0&false))) {{
            __CLR4_5_2carcarlvl9ek7u.R.inc(16670);return false;
        }
        }__CLR4_5_2carcarlvl9ek7u.R.inc(16671);if ((((erHvxcExtensionFlag != that.erHvxcExtensionFlag)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16672)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16673)==0&false))) {{
            __CLR4_5_2carcarlvl9ek7u.R.inc(16674);return false;
        }
        }__CLR4_5_2carcarlvl9ek7u.R.inc(16675);if ((((extensionAudioObjectType != that.extensionAudioObjectType)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16676)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16677)==0&false))) {{
            __CLR4_5_2carcarlvl9ek7u.R.inc(16678);return false;
        }
        }__CLR4_5_2carcarlvl9ek7u.R.inc(16679);if ((((extensionChannelConfiguration != that.extensionChannelConfiguration)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16680)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16681)==0&false))) {{
            __CLR4_5_2carcarlvl9ek7u.R.inc(16682);return false;
        }
        }__CLR4_5_2carcarlvl9ek7u.R.inc(16683);if ((((extensionFlag != that.extensionFlag)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16684)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16685)==0&false))) {{
            __CLR4_5_2carcarlvl9ek7u.R.inc(16686);return false;
        }
        }__CLR4_5_2carcarlvl9ek7u.R.inc(16687);if ((((extensionFlag3 != that.extensionFlag3)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16688)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16689)==0&false))) {{
            __CLR4_5_2carcarlvl9ek7u.R.inc(16690);return false;
        }
        }__CLR4_5_2carcarlvl9ek7u.R.inc(16691);if ((((extensionSamplingFrequency != that.extensionSamplingFrequency)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16692)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16693)==0&false))) {{
            __CLR4_5_2carcarlvl9ek7u.R.inc(16694);return false;
        }
        }__CLR4_5_2carcarlvl9ek7u.R.inc(16695);if ((((extensionSamplingFrequencyIndex != that.extensionSamplingFrequencyIndex)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16696)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16697)==0&false))) {{
            __CLR4_5_2carcarlvl9ek7u.R.inc(16698);return false;
        }
        }__CLR4_5_2carcarlvl9ek7u.R.inc(16699);if ((((fillBits != that.fillBits)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16700)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16701)==0&false))) {{
            __CLR4_5_2carcarlvl9ek7u.R.inc(16702);return false;
        }
        }__CLR4_5_2carcarlvl9ek7u.R.inc(16703);if ((((frameLengthFlag != that.frameLengthFlag)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16704)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16705)==0&false))) {{
            __CLR4_5_2carcarlvl9ek7u.R.inc(16706);return false;
        }
        }__CLR4_5_2carcarlvl9ek7u.R.inc(16707);if ((((gaSpecificConfig != that.gaSpecificConfig)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16708)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16709)==0&false))) {{
            __CLR4_5_2carcarlvl9ek7u.R.inc(16710);return false;
        }
        }__CLR4_5_2carcarlvl9ek7u.R.inc(16711);if ((((hilnContMode != that.hilnContMode)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16712)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16713)==0&false))) {{
            __CLR4_5_2carcarlvl9ek7u.R.inc(16714);return false;
        }
        }__CLR4_5_2carcarlvl9ek7u.R.inc(16715);if ((((hilnEnhaLayer != that.hilnEnhaLayer)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16716)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16717)==0&false))) {{
            __CLR4_5_2carcarlvl9ek7u.R.inc(16718);return false;
        }
        }__CLR4_5_2carcarlvl9ek7u.R.inc(16719);if ((((hilnEnhaQuantMode != that.hilnEnhaQuantMode)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16720)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16721)==0&false))) {{
            __CLR4_5_2carcarlvl9ek7u.R.inc(16722);return false;
        }
        }__CLR4_5_2carcarlvl9ek7u.R.inc(16723);if ((((hilnFrameLength != that.hilnFrameLength)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16724)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16725)==0&false))) {{
            __CLR4_5_2carcarlvl9ek7u.R.inc(16726);return false;
        }
        }__CLR4_5_2carcarlvl9ek7u.R.inc(16727);if ((((hilnMaxNumLine != that.hilnMaxNumLine)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16728)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16729)==0&false))) {{
            __CLR4_5_2carcarlvl9ek7u.R.inc(16730);return false;
        }
        }__CLR4_5_2carcarlvl9ek7u.R.inc(16731);if ((((hilnQuantMode != that.hilnQuantMode)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16732)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16733)==0&false))) {{
            __CLR4_5_2carcarlvl9ek7u.R.inc(16734);return false;
        }
        }__CLR4_5_2carcarlvl9ek7u.R.inc(16735);if ((((hilnSampleRateCode != that.hilnSampleRateCode)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16736)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16737)==0&false))) {{
            __CLR4_5_2carcarlvl9ek7u.R.inc(16738);return false;
        }
        }__CLR4_5_2carcarlvl9ek7u.R.inc(16739);if ((((hvxcRateMode != that.hvxcRateMode)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16740)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16741)==0&false))) {{
            __CLR4_5_2carcarlvl9ek7u.R.inc(16742);return false;
        }
        }__CLR4_5_2carcarlvl9ek7u.R.inc(16743);if ((((hvxcVarMode != that.hvxcVarMode)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16744)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16745)==0&false))) {{
            __CLR4_5_2carcarlvl9ek7u.R.inc(16746);return false;
        }
        }__CLR4_5_2carcarlvl9ek7u.R.inc(16747);if ((((isBaseLayer != that.isBaseLayer)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16748)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16749)==0&false))) {{
            __CLR4_5_2carcarlvl9ek7u.R.inc(16750);return false;
        }
        }__CLR4_5_2carcarlvl9ek7u.R.inc(16751);if ((((layerNr != that.layerNr)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16752)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16753)==0&false))) {{
            __CLR4_5_2carcarlvl9ek7u.R.inc(16754);return false;
        }
        }__CLR4_5_2carcarlvl9ek7u.R.inc(16755);if ((((layer_length != that.layer_length)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16756)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16757)==0&false))) {{
            __CLR4_5_2carcarlvl9ek7u.R.inc(16758);return false;
        }
        }__CLR4_5_2carcarlvl9ek7u.R.inc(16759);if ((((numOfSubFrame != that.numOfSubFrame)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16760)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16761)==0&false))) {{
            __CLR4_5_2carcarlvl9ek7u.R.inc(16762);return false;
        }
        }__CLR4_5_2carcarlvl9ek7u.R.inc(16763);if ((((paraExtensionFlag != that.paraExtensionFlag)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16764)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16765)==0&false))) {{
            __CLR4_5_2carcarlvl9ek7u.R.inc(16766);return false;
        }
        }__CLR4_5_2carcarlvl9ek7u.R.inc(16767);if ((((paraMode != that.paraMode)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16768)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16769)==0&false))) {{
            __CLR4_5_2carcarlvl9ek7u.R.inc(16770);return false;
        }
        }__CLR4_5_2carcarlvl9ek7u.R.inc(16771);if ((((parametricSpecificConfig != that.parametricSpecificConfig)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16772)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16773)==0&false))) {{
            __CLR4_5_2carcarlvl9ek7u.R.inc(16774);return false;
        }
        }__CLR4_5_2carcarlvl9ek7u.R.inc(16775);if ((((psPresentFlag != that.psPresentFlag)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16776)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16777)==0&false))) {{
            __CLR4_5_2carcarlvl9ek7u.R.inc(16778);return false;
        }
        }__CLR4_5_2carcarlvl9ek7u.R.inc(16779);if ((((sacPayloadEmbedding != that.sacPayloadEmbedding)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16780)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16781)==0&false))) {{
            __CLR4_5_2carcarlvl9ek7u.R.inc(16782);return false;
        }
        }__CLR4_5_2carcarlvl9ek7u.R.inc(16783);if ((((samplingFrequency != that.samplingFrequency)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16784)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16785)==0&false))) {{
            __CLR4_5_2carcarlvl9ek7u.R.inc(16786);return false;
        }
        }__CLR4_5_2carcarlvl9ek7u.R.inc(16787);if ((((samplingFrequencyIndex != that.samplingFrequencyIndex)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16788)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16789)==0&false))) {{
            __CLR4_5_2carcarlvl9ek7u.R.inc(16790);return false;
        }
        }__CLR4_5_2carcarlvl9ek7u.R.inc(16791);if ((((sbrPresentFlag != that.sbrPresentFlag)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16792)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16793)==0&false))) {{
            __CLR4_5_2carcarlvl9ek7u.R.inc(16794);return false;
        }
        }__CLR4_5_2carcarlvl9ek7u.R.inc(16795);if ((((syncExtensionType != that.syncExtensionType)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16796)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16797)==0&false))) {{
            __CLR4_5_2carcarlvl9ek7u.R.inc(16798);return false;
        }
        }__CLR4_5_2carcarlvl9ek7u.R.inc(16799);if ((((var_ScalableFlag != that.var_ScalableFlag)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16800)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16801)==0&false))) {{
            __CLR4_5_2carcarlvl9ek7u.R.inc(16802);return false;
        }
        }__CLR4_5_2carcarlvl9ek7u.R.inc(16803);if ((((!Arrays.equals(configBytes, that.configBytes))&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16804)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16805)==0&false))) {{
            __CLR4_5_2carcarlvl9ek7u.R.inc(16806);return false;
        }

        }__CLR4_5_2carcarlvl9ek7u.R.inc(16807);return true;
    }finally{__CLR4_5_2carcarlvl9ek7u.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_5_2carcarlvl9ek7u.R.inc(16808);
        __CLR4_5_2carcarlvl9ek7u.R.inc(16809);int result = (((configBytes != null )&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16810)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16811)==0&false))? Arrays.hashCode(configBytes) : 0;
        __CLR4_5_2carcarlvl9ek7u.R.inc(16812);result = 31 * result + audioObjectType;
        __CLR4_5_2carcarlvl9ek7u.R.inc(16813);result = 31 * result + samplingFrequencyIndex;
        __CLR4_5_2carcarlvl9ek7u.R.inc(16814);result = 31 * result + samplingFrequency;
        __CLR4_5_2carcarlvl9ek7u.R.inc(16815);result = 31 * result + channelConfiguration;
        __CLR4_5_2carcarlvl9ek7u.R.inc(16816);result = 31 * result + extensionAudioObjectType;
        __CLR4_5_2carcarlvl9ek7u.R.inc(16817);result = 31 * result + ((((sbrPresentFlag )&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16818)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16819)==0&false))? 1 : 0);
        __CLR4_5_2carcarlvl9ek7u.R.inc(16820);result = 31 * result + ((((psPresentFlag )&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16821)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16822)==0&false))? 1 : 0);
        __CLR4_5_2carcarlvl9ek7u.R.inc(16823);result = 31 * result + extensionSamplingFrequencyIndex;
        __CLR4_5_2carcarlvl9ek7u.R.inc(16824);result = 31 * result + extensionSamplingFrequency;
        __CLR4_5_2carcarlvl9ek7u.R.inc(16825);result = 31 * result + extensionChannelConfiguration;
        __CLR4_5_2carcarlvl9ek7u.R.inc(16826);result = 31 * result + sacPayloadEmbedding;
        __CLR4_5_2carcarlvl9ek7u.R.inc(16827);result = 31 * result + fillBits;
        __CLR4_5_2carcarlvl9ek7u.R.inc(16828);result = 31 * result + epConfig;
        __CLR4_5_2carcarlvl9ek7u.R.inc(16829);result = 31 * result + directMapping;
        __CLR4_5_2carcarlvl9ek7u.R.inc(16830);result = 31 * result + syncExtensionType;
        __CLR4_5_2carcarlvl9ek7u.R.inc(16831);result = 31 * result + frameLengthFlag;
        __CLR4_5_2carcarlvl9ek7u.R.inc(16832);result = 31 * result + dependsOnCoreCoder;
        __CLR4_5_2carcarlvl9ek7u.R.inc(16833);result = 31 * result + coreCoderDelay;
        __CLR4_5_2carcarlvl9ek7u.R.inc(16834);result = 31 * result + extensionFlag;
        __CLR4_5_2carcarlvl9ek7u.R.inc(16835);result = 31 * result + layerNr;
        __CLR4_5_2carcarlvl9ek7u.R.inc(16836);result = 31 * result + numOfSubFrame;
        __CLR4_5_2carcarlvl9ek7u.R.inc(16837);result = 31 * result + layer_length;
        __CLR4_5_2carcarlvl9ek7u.R.inc(16838);result = 31 * result + ((((aacSectionDataResilienceFlag )&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16839)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16840)==0&false))? 1 : 0);
        __CLR4_5_2carcarlvl9ek7u.R.inc(16841);result = 31 * result + ((((aacScalefactorDataResilienceFlag )&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16842)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16843)==0&false))? 1 : 0);
        __CLR4_5_2carcarlvl9ek7u.R.inc(16844);result = 31 * result + ((((aacSpectralDataResilienceFlag )&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16845)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16846)==0&false))? 1 : 0);
        __CLR4_5_2carcarlvl9ek7u.R.inc(16847);result = 31 * result + extensionFlag3;
        __CLR4_5_2carcarlvl9ek7u.R.inc(16848);result = 31 * result + ((((gaSpecificConfig )&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16849)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16850)==0&false))? 1 : 0);
        __CLR4_5_2carcarlvl9ek7u.R.inc(16851);result = 31 * result + isBaseLayer;
        __CLR4_5_2carcarlvl9ek7u.R.inc(16852);result = 31 * result + paraMode;
        __CLR4_5_2carcarlvl9ek7u.R.inc(16853);result = 31 * result + paraExtensionFlag;
        __CLR4_5_2carcarlvl9ek7u.R.inc(16854);result = 31 * result + hvxcVarMode;
        __CLR4_5_2carcarlvl9ek7u.R.inc(16855);result = 31 * result + hvxcRateMode;
        __CLR4_5_2carcarlvl9ek7u.R.inc(16856);result = 31 * result + erHvxcExtensionFlag;
        __CLR4_5_2carcarlvl9ek7u.R.inc(16857);result = 31 * result + var_ScalableFlag;
        __CLR4_5_2carcarlvl9ek7u.R.inc(16858);result = 31 * result + hilnQuantMode;
        __CLR4_5_2carcarlvl9ek7u.R.inc(16859);result = 31 * result + hilnMaxNumLine;
        __CLR4_5_2carcarlvl9ek7u.R.inc(16860);result = 31 * result + hilnSampleRateCode;
        __CLR4_5_2carcarlvl9ek7u.R.inc(16861);result = 31 * result + hilnFrameLength;
        __CLR4_5_2carcarlvl9ek7u.R.inc(16862);result = 31 * result + hilnContMode;
        __CLR4_5_2carcarlvl9ek7u.R.inc(16863);result = 31 * result + hilnEnhaLayer;
        __CLR4_5_2carcarlvl9ek7u.R.inc(16864);result = 31 * result + hilnEnhaQuantMode;
        __CLR4_5_2carcarlvl9ek7u.R.inc(16865);result = 31 * result + ((((parametricSpecificConfig )&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16866)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16867)==0&false))? 1 : 0);
        __CLR4_5_2carcarlvl9ek7u.R.inc(16868);return result;
    }finally{__CLR4_5_2carcarlvl9ek7u.R.flushNeeded();}}

    public class ELDSpecificConfig {
        private static final int ELDEXT_TERM = 0x0;//0b0000;
        public boolean frameLengthFlag;
        public boolean aacSectionDataResilienceFlag;
        public boolean aacScalefactorDataResilienceFlag;
        public boolean aacSpectralDataResilienceFlag;
        public boolean ldSbrPresentFlag;
        public boolean ldSbrSamplingRate;
        public boolean ldSbrCrcFlag;

        public ELDSpecificConfig(int channelConfiguration, BitReaderBuffer bitReaderBuffer) {try{__CLR4_5_2carcarlvl9ek7u.R.inc(16869);

            __CLR4_5_2carcarlvl9ek7u.R.inc(16870);this.frameLengthFlag = bitReaderBuffer.readBool();
            __CLR4_5_2carcarlvl9ek7u.R.inc(16871);this.aacSectionDataResilienceFlag = bitReaderBuffer.readBool();
            __CLR4_5_2carcarlvl9ek7u.R.inc(16872);this.aacScalefactorDataResilienceFlag = bitReaderBuffer.readBool();
            __CLR4_5_2carcarlvl9ek7u.R.inc(16873);this.aacSpectralDataResilienceFlag = bitReaderBuffer.readBool();

            __CLR4_5_2carcarlvl9ek7u.R.inc(16874);this.ldSbrPresentFlag = bitReaderBuffer.readBool();
            __CLR4_5_2carcarlvl9ek7u.R.inc(16875);if ((((ldSbrPresentFlag)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16876)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16877)==0&false))) {{
                __CLR4_5_2carcarlvl9ek7u.R.inc(16878);ldSbrSamplingRate = bitReaderBuffer.readBool();
                __CLR4_5_2carcarlvl9ek7u.R.inc(16879);ldSbrCrcFlag = bitReaderBuffer.readBool();
                __CLR4_5_2carcarlvl9ek7u.R.inc(16880);ld_sbr_header(channelConfiguration, bitReaderBuffer);
            }
            }__CLR4_5_2carcarlvl9ek7u.R.inc(16881);int eldExtType;
            __CLR4_5_2carcarlvl9ek7u.R.inc(16882);while ((eldExtType = bitReaderBuffer.readBits(4)) != ELDEXT_TERM) {{
                __CLR4_5_2carcarlvl9ek7u.R.inc(16885);int eldExtLen = bitReaderBuffer.readBits(4);
                __CLR4_5_2carcarlvl9ek7u.R.inc(16886);int len = eldExtLen;
                __CLR4_5_2carcarlvl9ek7u.R.inc(16887);int eldExtLenAdd = 0;
                __CLR4_5_2carcarlvl9ek7u.R.inc(16888);if ((((eldExtLen == 15)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16889)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16890)==0&false))) {{
                    __CLR4_5_2carcarlvl9ek7u.R.inc(16891);eldExtLenAdd = bitReaderBuffer.readBits(8);
                    __CLR4_5_2carcarlvl9ek7u.R.inc(16892);len += eldExtLenAdd;
                }
                }__CLR4_5_2carcarlvl9ek7u.R.inc(16893);if ((((eldExtLenAdd == 255)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16894)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16895)==0&false))) {{
                    __CLR4_5_2carcarlvl9ek7u.R.inc(16896);int eldExtLenAddAdd = bitReaderBuffer.readBits(16);
                    __CLR4_5_2carcarlvl9ek7u.R.inc(16897);len += eldExtLenAddAdd;
                }
                }boolean __CLB4_5_2_bool4=false;__CLR4_5_2carcarlvl9ek7u.R.inc(16898);switch (eldExtType) {
                    /* add future eld extension configs here */
                    default:if (!__CLB4_5_2_bool4) {__CLR4_5_2carcarlvl9ek7u.R.inc(16899);__CLB4_5_2_bool4=true;}
                        __CLR4_5_2carcarlvl9ek7u.R.inc(16900);for (int cnt = 0; (((cnt < len)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16901)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16902)==0&false)); cnt++) {{
                            __CLR4_5_2carcarlvl9ek7u.R.inc(16903);int other_byte = bitReaderBuffer.readBits(8);
                        }
                        }__CLR4_5_2carcarlvl9ek7u.R.inc(16904);break;

                }
            }
        }}finally{__CLR4_5_2carcarlvl9ek7u.R.flushNeeded();}}

        public void ld_sbr_header(int channelConfiguration, BitReaderBuffer bitReaderBuffer) {try{__CLR4_5_2carcarlvl9ek7u.R.inc(16905);
            __CLR4_5_2carcarlvl9ek7u.R.inc(16906);int numSbrHeader;
            boolean __CLB4_5_2_bool5=false;__CLR4_5_2carcarlvl9ek7u.R.inc(16907);switch (channelConfiguration) {
                case 1:if (!__CLB4_5_2_bool5) {__CLR4_5_2carcarlvl9ek7u.R.inc(16908);__CLB4_5_2_bool5=true;}
                case 2:if (!__CLB4_5_2_bool5) {__CLR4_5_2carcarlvl9ek7u.R.inc(16909);__CLB4_5_2_bool5=true;}
                    __CLR4_5_2carcarlvl9ek7u.R.inc(16910);numSbrHeader = 1;
                    __CLR4_5_2carcarlvl9ek7u.R.inc(16911);break;
                case 3:if (!__CLB4_5_2_bool5) {__CLR4_5_2carcarlvl9ek7u.R.inc(16912);__CLB4_5_2_bool5=true;}
                    __CLR4_5_2carcarlvl9ek7u.R.inc(16913);numSbrHeader = 2;
                    __CLR4_5_2carcarlvl9ek7u.R.inc(16914);break;
                case 4:if (!__CLB4_5_2_bool5) {__CLR4_5_2carcarlvl9ek7u.R.inc(16915);__CLB4_5_2_bool5=true;}
                case 5:if (!__CLB4_5_2_bool5) {__CLR4_5_2carcarlvl9ek7u.R.inc(16916);__CLB4_5_2_bool5=true;}
                case 6:if (!__CLB4_5_2_bool5) {__CLR4_5_2carcarlvl9ek7u.R.inc(16917);__CLB4_5_2_bool5=true;}
                    __CLR4_5_2carcarlvl9ek7u.R.inc(16918);numSbrHeader = 3;
                    __CLR4_5_2carcarlvl9ek7u.R.inc(16919);break;
                case 7:if (!__CLB4_5_2_bool5) {__CLR4_5_2carcarlvl9ek7u.R.inc(16920);__CLB4_5_2_bool5=true;}
                    __CLR4_5_2carcarlvl9ek7u.R.inc(16921);numSbrHeader = 4;
                    __CLR4_5_2carcarlvl9ek7u.R.inc(16922);break;
                default:if (!__CLB4_5_2_bool5) {__CLR4_5_2carcarlvl9ek7u.R.inc(16923);__CLB4_5_2_bool5=true;}
                    __CLR4_5_2carcarlvl9ek7u.R.inc(16924);numSbrHeader = 0;
                    __CLR4_5_2carcarlvl9ek7u.R.inc(16925);break;
            }
            __CLR4_5_2carcarlvl9ek7u.R.inc(16926);for (int el = 0; (((el < numSbrHeader)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16927)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16928)==0&false)); el++) {{
                __CLR4_5_2carcarlvl9ek7u.R.inc(16929);new sbr_header(bitReaderBuffer);
            }
        }}finally{__CLR4_5_2carcarlvl9ek7u.R.flushNeeded();}}


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

        public sbr_header(BitReaderBuffer b) {try{__CLR4_5_2carcarlvl9ek7u.R.inc(16930);
            __CLR4_5_2carcarlvl9ek7u.R.inc(16931);bs_amp_res = b.readBool();
            __CLR4_5_2carcarlvl9ek7u.R.inc(16932);bs_start_freq = b.readBits(4);
            __CLR4_5_2carcarlvl9ek7u.R.inc(16933);bs_stop_freq = b.readBits(4);
            __CLR4_5_2carcarlvl9ek7u.R.inc(16934);bs_xover_band = b.readBits(3);
            __CLR4_5_2carcarlvl9ek7u.R.inc(16935);bs_reserved = b.readBits(2);
            __CLR4_5_2carcarlvl9ek7u.R.inc(16936);bs_header_extra_1 = b.readBool();
            __CLR4_5_2carcarlvl9ek7u.R.inc(16937);bs_header_extra_2 = b.readBool();
            __CLR4_5_2carcarlvl9ek7u.R.inc(16938);if ((((bs_header_extra_1)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16939)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16940)==0&false))) {{
                __CLR4_5_2carcarlvl9ek7u.R.inc(16941);bs_freq_scale = b.readBits(2);
                __CLR4_5_2carcarlvl9ek7u.R.inc(16942);bs_alter_scale = b.readBool();
                __CLR4_5_2carcarlvl9ek7u.R.inc(16943);bs_noise_bands = b.readBits(2);
            }
            }__CLR4_5_2carcarlvl9ek7u.R.inc(16944);if ((((bs_header_extra_2)&&(__CLR4_5_2carcarlvl9ek7u.R.iget(16945)!=0|true))||(__CLR4_5_2carcarlvl9ek7u.R.iget(16946)==0&false))) {{
                __CLR4_5_2carcarlvl9ek7u.R.inc(16947);bs_limiter_bands = b.readBits(2);
                __CLR4_5_2carcarlvl9ek7u.R.inc(16948);bs_limiter_gains = b.readBits(2);
                __CLR4_5_2carcarlvl9ek7u.R.inc(16949);bs_interpol_freq = b.readBool();
            }
            }__CLR4_5_2carcarlvl9ek7u.R.inc(16950);bs_smoothing_mode = b.readBool();
        }finally{__CLR4_5_2carcarlvl9ek7u.R.flushNeeded();}}
    }
}
