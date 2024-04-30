/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.googlecode.mp4parser.authoring.tracks.h265;

import com.coremedia.iso.IsoTypeReader;
import com.googlecode.mp4parser.DataSource;
import com.googlecode.mp4parser.FileDataSourceImpl;
import com.googlecode.mp4parser.authoring.Sample;
import com.googlecode.mp4parser.authoring.SampleImpl;
import com.googlecode.mp4parser.h264.read.CAVLCReader;
import com.googlecode.mp4parser.util.ByteBufferByteChannel;
import com.mp4parser.iso14496.part15.HevcDecoderConfigurationRecord;

import java.io.EOFException;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * Created by sannies on 08.09.2014.
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class H265TrackImplOld {public static class __CLR4_5_29ct9ctlvluliol{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,12535,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static final int VPS_NUT = 32;
    public static final int SPS_NUT = 33;
    public static final int PPS_NUT = 34;
    public static final int AUD_NUT = 35;
    public static final int PREFIX_SEI_NUT = 39;
    public static final int RSV_NVCL41 = 41;
    public static final int RSV_NVCL42 = 42;
    public static final int RSV_NVCL43 = 43;
    public static final int RSV_NVCL44 = 44;
    public static final int UNSPEC48 = 48;
    public static final int UNSPEC49 = 49;
    public static final int UNSPEC50 = 50;
    public static final int UNSPEC51 = 51;
    public static final int UNSPEC52 = 52;
    public static final int UNSPEC53 = 53;
    public static final int UNSPEC54 = 54;
    public static final int UNSPEC55 = 55;
    private static final int TRAIL_N = 0;
    private static final int TRAIL_R = 1;
    private static final int TSA_N = 2;
    private static final int TSA_R = 3;
    private static final int STSA_N = 4;
    private static final int STSA_R = 5;
    private static final int RADL_N = 6;
    private static final int RADL_R = 7;
    private static final int RASL_N = 8;
    private static final int RASL_R = 9;
    private static final int BLA_W_LP = 16;
    private static final int BLA_W_RADL = 17;
    private static final int BLA_N_LP = 18;
    private static final int IDR_W_RADL = 19;
    private static final int IDR_N_LP = 20;
    private static final int CRA_NUT = 21;

    private static final long BUFFER = 1024 * 1024;
    LinkedHashMap<Long, ByteBuffer> videoParamterSets = new LinkedHashMap<Long, ByteBuffer>();
    LinkedHashMap<Long, ByteBuffer> sequenceParamterSets = new LinkedHashMap<Long, ByteBuffer>();
    LinkedHashMap<Long, ByteBuffer> pictureParamterSets = new LinkedHashMap<Long, ByteBuffer>();
    List<Long> syncSamples = new ArrayList<Long>();
    List<Sample> samples = new ArrayList<Sample>();

    public H265TrackImplOld(DataSource ds) throws IOException {try{__CLR4_5_29ct9ctlvluliol.R.inc(12125);
        __CLR4_5_29ct9ctlvluliol.R.inc(12126);LookAhead la = new LookAhead(ds);

        __CLR4_5_29ct9ctlvluliol.R.inc(12127);long sampleNo = 1;
        __CLR4_5_29ct9ctlvluliol.R.inc(12128);List<ByteBuffer> accessUnit = new ArrayList<ByteBuffer>();
        __CLR4_5_29ct9ctlvluliol.R.inc(12129);int accessUnitNalType = 0;

        __CLR4_5_29ct9ctlvluliol.R.inc(12130);ByteBuffer nal;
        __CLR4_5_29ct9ctlvluliol.R.inc(12131);while ((nal = findNextNal(la)) != null) {{

            __CLR4_5_29ct9ctlvluliol.R.inc(12134);NalUnitHeader nalUnitHeader = getNalUnitHeader(nal);

            //System.err.println(String.format("type: %3d - layer: %3d - tempId: %3d",
            //        nalUnitHeader.nalUnitType, nalUnitHeader.nuhLayerId, nalUnitHeader.nuhTemporalIdPlusOne));
            boolean __CLB4_5_2_bool0=false;__CLR4_5_29ct9ctlvluliol.R.inc(12135);switch (nalUnitHeader.nalUnitType) {
                case VPS_NUT:if (!__CLB4_5_2_bool0) {__CLR4_5_29ct9ctlvluliol.R.inc(12136);__CLB4_5_2_bool0=true;}
                    __CLR4_5_29ct9ctlvluliol.R.inc(12137);videoParamterSets.put(sampleNo, nal);
                    __CLR4_5_29ct9ctlvluliol.R.inc(12138);break;
                case SPS_NUT:if (!__CLB4_5_2_bool0) {__CLR4_5_29ct9ctlvluliol.R.inc(12139);__CLB4_5_2_bool0=true;}
                    __CLR4_5_29ct9ctlvluliol.R.inc(12140);sequenceParamterSets.put(sampleNo, nal);
                    __CLR4_5_29ct9ctlvluliol.R.inc(12141);break;
                case PPS_NUT:if (!__CLB4_5_2_bool0) {__CLR4_5_29ct9ctlvluliol.R.inc(12142);__CLB4_5_2_bool0=true;}
                    __CLR4_5_29ct9ctlvluliol.R.inc(12143);pictureParamterSets.put(sampleNo, nal);
                    __CLR4_5_29ct9ctlvluliol.R.inc(12144);break;
            }
            __CLR4_5_29ct9ctlvluliol.R.inc(12145);if ((((nalUnitHeader.nalUnitType < 32)&&(__CLR4_5_29ct9ctlvluliol.R.iget(12146)!=0|true))||(__CLR4_5_29ct9ctlvluliol.R.iget(12147)==0&false))) {{
                __CLR4_5_29ct9ctlvluliol.R.inc(12148);accessUnitNalType = nalUnitHeader.nalUnitType;
                // All NAL in one Access Unit Sample have same nal unit type
            }

            }__CLR4_5_29ct9ctlvluliol.R.inc(12149);if ((((isFirstOfAU(nalUnitHeader.nalUnitType, nal, accessUnit) && !accessUnit.isEmpty())&&(__CLR4_5_29ct9ctlvluliol.R.iget(12150)!=0|true))||(__CLR4_5_29ct9ctlvluliol.R.iget(12151)==0&false))) {{

                __CLR4_5_29ct9ctlvluliol.R.inc(12152);System.err.println("##########################");
                __CLR4_5_29ct9ctlvluliol.R.inc(12153);for (ByteBuffer byteBuffer : accessUnit) {{
                    __CLR4_5_29ct9ctlvluliol.R.inc(12154);NalUnitHeader _nalUnitHeader = getNalUnitHeader(byteBuffer);
                    __CLR4_5_29ct9ctlvluliol.R.inc(12155);System.err.println(String.format("type: %3d - layer: %3d - tempId: %3d - size: %3d",
                            _nalUnitHeader.nalUnitType, _nalUnitHeader.nuhLayerId, _nalUnitHeader.nuhTemporalIdPlusOne, byteBuffer.limit()));
                }

                }__CLR4_5_29ct9ctlvluliol.R.inc(12156);System.err.println("                          ##########################");
                __CLR4_5_29ct9ctlvluliol.R.inc(12157);samples.add(createSample(accessUnit));
                __CLR4_5_29ct9ctlvluliol.R.inc(12158);accessUnit.clear();
                __CLR4_5_29ct9ctlvluliol.R.inc(12159);sampleNo++;
            }
            }__CLR4_5_29ct9ctlvluliol.R.inc(12160);accessUnit.add(nal);
            __CLR4_5_29ct9ctlvluliol.R.inc(12161);if ((((accessUnitNalType >= 16 && accessUnitNalType <= 21)&&(__CLR4_5_29ct9ctlvluliol.R.iget(12162)!=0|true))||(__CLR4_5_29ct9ctlvluliol.R.iget(12163)==0&false))) {{
                __CLR4_5_29ct9ctlvluliol.R.inc(12164);syncSamples.add(sampleNo);
            }


        }}

        }__CLR4_5_29ct9ctlvluliol.R.inc(12165);System.err.println("");
        __CLR4_5_29ct9ctlvluliol.R.inc(12166);HevcDecoderConfigurationRecord hvcC = new HevcDecoderConfigurationRecord();

        __CLR4_5_29ct9ctlvluliol.R.inc(12167);hvcC.setArrays(getArrays());
        __CLR4_5_29ct9ctlvluliol.R.inc(12168);hvcC.setAvgFrameRate(0);
    }finally{__CLR4_5_29ct9ctlvluliol.R.flushNeeded();}}

    public static void main(String[] args) throws IOException {try{__CLR4_5_29ct9ctlvluliol.R.inc(12169);
        __CLR4_5_29ct9ctlvluliol.R.inc(12170);new H265TrackImplOld(new FileDataSourceImpl("c:\\content\\test-UHD-HEVC_01_FMV_Med_track1.hvc"));
    }finally{__CLR4_5_29ct9ctlvluliol.R.flushNeeded();}}

    private ByteBuffer findNextNal(LookAhead la) throws IOException {try{__CLR4_5_29ct9ctlvluliol.R.inc(12171);
        __CLR4_5_29ct9ctlvluliol.R.inc(12172);try {
            __CLR4_5_29ct9ctlvluliol.R.inc(12173);while ((((!la.nextThreeEquals001())&&(__CLR4_5_29ct9ctlvluliol.R.iget(12174)!=0|true))||(__CLR4_5_29ct9ctlvluliol.R.iget(12175)==0&false))) {{
                __CLR4_5_29ct9ctlvluliol.R.inc(12176);la.discardByte();
            }
            }__CLR4_5_29ct9ctlvluliol.R.inc(12177);la.discardNext3AndMarkStart();

            __CLR4_5_29ct9ctlvluliol.R.inc(12178);while ((((!la.nextThreeEquals000or001orEof())&&(__CLR4_5_29ct9ctlvluliol.R.iget(12179)!=0|true))||(__CLR4_5_29ct9ctlvluliol.R.iget(12180)==0&false))) {{
                __CLR4_5_29ct9ctlvluliol.R.inc(12181);la.discardByte();
            }
            }__CLR4_5_29ct9ctlvluliol.R.inc(12182);return la.getNal();
        } catch (EOFException e) {
            __CLR4_5_29ct9ctlvluliol.R.inc(12183);return null;
        }

    }finally{__CLR4_5_29ct9ctlvluliol.R.flushNeeded();}}

    public void profile_tier_level(int maxNumSubLayersMinus1, CAVLCReader r) throws IOException {try{__CLR4_5_29ct9ctlvluliol.R.inc(12184);
        __CLR4_5_29ct9ctlvluliol.R.inc(12185);int general_profile_space = r.readU(2, "general_profile_space ");
        __CLR4_5_29ct9ctlvluliol.R.inc(12186);boolean general_tier_flag = r.readBool("general_tier_flag");
        __CLR4_5_29ct9ctlvluliol.R.inc(12187);int general_profile_idc = r.readU(5, "general_profile_idc");
        __CLR4_5_29ct9ctlvluliol.R.inc(12188);boolean[] general_profile_compatibility_flag = new boolean[32];
        __CLR4_5_29ct9ctlvluliol.R.inc(12189);for (int j = 0; (((j < 32)&&(__CLR4_5_29ct9ctlvluliol.R.iget(12190)!=0|true))||(__CLR4_5_29ct9ctlvluliol.R.iget(12191)==0&false)); j++) {{
            __CLR4_5_29ct9ctlvluliol.R.inc(12192);general_profile_compatibility_flag[j] = r.readBool("general_profile_compatibility_flag[" + j + "]");
        }
        }__CLR4_5_29ct9ctlvluliol.R.inc(12193);boolean general_progressive_source_flag = r.readBool("general_progressive_source_flag");
        __CLR4_5_29ct9ctlvluliol.R.inc(12194);boolean general_interlaced_source_flag = r.readBool("general_interlaced_source_flag");
        __CLR4_5_29ct9ctlvluliol.R.inc(12195);boolean general_non_packed_constraint_flag = r.readBool("general_non_packed_constraint_flag");
        __CLR4_5_29ct9ctlvluliol.R.inc(12196);boolean general_frame_only_constraint_flag = r.readBool("general_frame_only_constraint_flag");

        __CLR4_5_29ct9ctlvluliol.R.inc(12197);long general_reserved_zero_44bits = r.readU(44, "general_reserved_zero_44bits");
        __CLR4_5_29ct9ctlvluliol.R.inc(12198);int general_level_idc = r.readU(8, "general_level_idc");

        __CLR4_5_29ct9ctlvluliol.R.inc(12199);boolean[] sub_layer_profile_present_flag = new boolean[maxNumSubLayersMinus1];
        __CLR4_5_29ct9ctlvluliol.R.inc(12200);boolean[] sub_layer_level_present_flag = new boolean[maxNumSubLayersMinus1];
        __CLR4_5_29ct9ctlvluliol.R.inc(12201);for (int i = 0; (((i < maxNumSubLayersMinus1)&&(__CLR4_5_29ct9ctlvluliol.R.iget(12202)!=0|true))||(__CLR4_5_29ct9ctlvluliol.R.iget(12203)==0&false)); i++) {{
            __CLR4_5_29ct9ctlvluliol.R.inc(12204);sub_layer_profile_present_flag[i] = r.readBool("sub_layer_profile_present_flag[" + i + "]");
            __CLR4_5_29ct9ctlvluliol.R.inc(12205);sub_layer_level_present_flag[i] = r.readBool("sub_layer_level_present_flag[" + i + "]");
        }
        }__CLR4_5_29ct9ctlvluliol.R.inc(12206);if ((((maxNumSubLayersMinus1 > 0)&&(__CLR4_5_29ct9ctlvluliol.R.iget(12207)!=0|true))||(__CLR4_5_29ct9ctlvluliol.R.iget(12208)==0&false))) {{
            __CLR4_5_29ct9ctlvluliol.R.inc(12209);for (int i = maxNumSubLayersMinus1; (((i < 8)&&(__CLR4_5_29ct9ctlvluliol.R.iget(12210)!=0|true))||(__CLR4_5_29ct9ctlvluliol.R.iget(12211)==0&false)); i++) {{
                __CLR4_5_29ct9ctlvluliol.R.inc(12212);r.readU(2, "reserved_zero_2bits");
            }
        }}


        }__CLR4_5_29ct9ctlvluliol.R.inc(12213);int[] sub_layer_profile_space = new int[maxNumSubLayersMinus1];
        __CLR4_5_29ct9ctlvluliol.R.inc(12214);boolean[] sub_layer_tier_flag = new boolean[maxNumSubLayersMinus1];
        __CLR4_5_29ct9ctlvluliol.R.inc(12215);int[] sub_layer_profile_idc = new int[maxNumSubLayersMinus1];
        __CLR4_5_29ct9ctlvluliol.R.inc(12216);boolean[][] sub_layer_profile_compatibility_flag = new boolean[maxNumSubLayersMinus1][32];
        __CLR4_5_29ct9ctlvluliol.R.inc(12217);boolean[] sub_layer_progressive_source_flag = new boolean[maxNumSubLayersMinus1];

        __CLR4_5_29ct9ctlvluliol.R.inc(12218);boolean[] sub_layer_interlaced_source_flag = new boolean[maxNumSubLayersMinus1];
        __CLR4_5_29ct9ctlvluliol.R.inc(12219);boolean[] sub_layer_non_packed_constraint_flag = new boolean[maxNumSubLayersMinus1];
        __CLR4_5_29ct9ctlvluliol.R.inc(12220);boolean[] sub_layer_frame_only_constraint_flag = new boolean[maxNumSubLayersMinus1];
        __CLR4_5_29ct9ctlvluliol.R.inc(12221);int[] sub_layer_level_idc = new int[maxNumSubLayersMinus1];

        __CLR4_5_29ct9ctlvluliol.R.inc(12222);for (int i = 0; (((i < maxNumSubLayersMinus1)&&(__CLR4_5_29ct9ctlvluliol.R.iget(12223)!=0|true))||(__CLR4_5_29ct9ctlvluliol.R.iget(12224)==0&false)); i++) {{
            __CLR4_5_29ct9ctlvluliol.R.inc(12225);if ((((sub_layer_profile_present_flag[i])&&(__CLR4_5_29ct9ctlvluliol.R.iget(12226)!=0|true))||(__CLR4_5_29ct9ctlvluliol.R.iget(12227)==0&false))) {{
                __CLR4_5_29ct9ctlvluliol.R.inc(12228);sub_layer_profile_space[i] = r.readU(2, "sub_layer_profile_space[" + i + "]");
                __CLR4_5_29ct9ctlvluliol.R.inc(12229);sub_layer_tier_flag[i] = r.readBool("sub_layer_tier_flag[" + i + "]");
                __CLR4_5_29ct9ctlvluliol.R.inc(12230);sub_layer_profile_idc[i] = r.readU(5, "sub_layer_profile_idc[" + i + "]");
                __CLR4_5_29ct9ctlvluliol.R.inc(12231);for (int j = 0; (((j < 32)&&(__CLR4_5_29ct9ctlvluliol.R.iget(12232)!=0|true))||(__CLR4_5_29ct9ctlvluliol.R.iget(12233)==0&false)); j++) {{
                    __CLR4_5_29ct9ctlvluliol.R.inc(12234);sub_layer_profile_compatibility_flag[i][j] = r.readBool("sub_layer_profile_compatibility_flag[" + i + "][" + j + "]");
                }
                }__CLR4_5_29ct9ctlvluliol.R.inc(12235);sub_layer_progressive_source_flag[i] = r.readBool("sub_layer_progressive_source_flag[" + i + "]");
                __CLR4_5_29ct9ctlvluliol.R.inc(12236);sub_layer_interlaced_source_flag[i] = r.readBool("sub_layer_interlaced_source_flag[" + i + "]");
                __CLR4_5_29ct9ctlvluliol.R.inc(12237);sub_layer_non_packed_constraint_flag[i] = r.readBool("sub_layer_non_packed_constraint_flag[" + i + "]");
                __CLR4_5_29ct9ctlvluliol.R.inc(12238);sub_layer_frame_only_constraint_flag[i] = r.readBool("sub_layer_frame_only_constraint_flag[" + i + "]");
                __CLR4_5_29ct9ctlvluliol.R.inc(12239);r.readNBit(44, "reserved");
            }
            }__CLR4_5_29ct9ctlvluliol.R.inc(12240);if ((((sub_layer_level_present_flag[i])&&(__CLR4_5_29ct9ctlvluliol.R.iget(12241)!=0|true))||(__CLR4_5_29ct9ctlvluliol.R.iget(12242)==0&false)))
                {__CLR4_5_29ct9ctlvluliol.R.inc(12243);sub_layer_level_idc[i] = r.readU(8, "sub_layer_level_idc");
        }}
    }}finally{__CLR4_5_29ct9ctlvluliol.R.flushNeeded();}}


    public int getFrameRate(ByteBuffer vps) throws IOException {try{__CLR4_5_29ct9ctlvluliol.R.inc(12244);
        __CLR4_5_29ct9ctlvluliol.R.inc(12245);CAVLCReader r = new CAVLCReader(Channels.newInputStream(new ByteBufferByteChannel((ByteBuffer) vps.position(0))));
        __CLR4_5_29ct9ctlvluliol.R.inc(12246);int vps_parameter_set_id = r.readU(4, "vps_parameter_set_id");
        __CLR4_5_29ct9ctlvluliol.R.inc(12247);int vps_reserved_three_2bits = r.readU(2, "vps_reserved_three_2bits");
        __CLR4_5_29ct9ctlvluliol.R.inc(12248);int vps_max_layers_minus1 = r.readU(6, "vps_max_layers_minus1");
        __CLR4_5_29ct9ctlvluliol.R.inc(12249);int vps_max_sub_layers_minus1 = r.readU(3, "vps_max_sub_layers_minus1");
        __CLR4_5_29ct9ctlvluliol.R.inc(12250);boolean vps_temporal_id_nesting_flag = r.readBool("vps_temporal_id_nesting_flag");
        __CLR4_5_29ct9ctlvluliol.R.inc(12251);int vps_reserved_0xffff_16bits = r.readU(16, "vps_reserved_0xffff_16bits");
        __CLR4_5_29ct9ctlvluliol.R.inc(12252);profile_tier_level(vps_max_sub_layers_minus1, r);


        __CLR4_5_29ct9ctlvluliol.R.inc(12253);boolean vps_sub_layer_ordering_info_present_flag = r.readBool("vps_sub_layer_ordering_info_present_flag");
        __CLR4_5_29ct9ctlvluliol.R.inc(12254);int[] vps_max_dec_pic_buffering_minus1 = new int[(((vps_sub_layer_ordering_info_present_flag )&&(__CLR4_5_29ct9ctlvluliol.R.iget(12255)!=0|true))||(__CLR4_5_29ct9ctlvluliol.R.iget(12256)==0&false))? 0 : vps_max_sub_layers_minus1];
        __CLR4_5_29ct9ctlvluliol.R.inc(12257);int[] vps_max_num_reorder_pics = new int[(((vps_sub_layer_ordering_info_present_flag )&&(__CLR4_5_29ct9ctlvluliol.R.iget(12258)!=0|true))||(__CLR4_5_29ct9ctlvluliol.R.iget(12259)==0&false))? 0 : vps_max_sub_layers_minus1];
        __CLR4_5_29ct9ctlvluliol.R.inc(12260);int[] vps_max_latency_increase_plus1 = new int[(((vps_sub_layer_ordering_info_present_flag )&&(__CLR4_5_29ct9ctlvluliol.R.iget(12261)!=0|true))||(__CLR4_5_29ct9ctlvluliol.R.iget(12262)==0&false))? 0 : vps_max_sub_layers_minus1];
        __CLR4_5_29ct9ctlvluliol.R.inc(12263);for (int i = ((((vps_sub_layer_ordering_info_present_flag )&&(__CLR4_5_29ct9ctlvluliol.R.iget(12264)!=0|true))||(__CLR4_5_29ct9ctlvluliol.R.iget(12265)==0&false))? 0 : vps_max_sub_layers_minus1); (((i <= vps_max_sub_layers_minus1)&&(__CLR4_5_29ct9ctlvluliol.R.iget(12266)!=0|true))||(__CLR4_5_29ct9ctlvluliol.R.iget(12267)==0&false)); i++) {{
            __CLR4_5_29ct9ctlvluliol.R.inc(12268);vps_max_dec_pic_buffering_minus1[i] = r.readUE("vps_max_dec_pic_buffering_minus1[" + i + "]");
            __CLR4_5_29ct9ctlvluliol.R.inc(12269);vps_max_num_reorder_pics[i] = r.readUE("vps_max_dec_pic_buffering_minus1[" + i + "]");
            __CLR4_5_29ct9ctlvluliol.R.inc(12270);vps_max_latency_increase_plus1[i] = r.readUE("vps_max_dec_pic_buffering_minus1[" + i + "]");
        }
        }__CLR4_5_29ct9ctlvluliol.R.inc(12271);int vps_max_layer_id = r.readU(6, "vps_max_layer_id");
        __CLR4_5_29ct9ctlvluliol.R.inc(12272);int vps_num_layer_sets_minus1 = r.readUE("vps_num_layer_sets_minus1");
        __CLR4_5_29ct9ctlvluliol.R.inc(12273);boolean[][] layer_id_included_flag = new boolean[vps_num_layer_sets_minus1][vps_max_layer_id];
        __CLR4_5_29ct9ctlvluliol.R.inc(12274);for (int i = 1; (((i <= vps_num_layer_sets_minus1)&&(__CLR4_5_29ct9ctlvluliol.R.iget(12275)!=0|true))||(__CLR4_5_29ct9ctlvluliol.R.iget(12276)==0&false)); i++) {{
            __CLR4_5_29ct9ctlvluliol.R.inc(12277);for (int j = 0; (((j <= vps_max_layer_id)&&(__CLR4_5_29ct9ctlvluliol.R.iget(12278)!=0|true))||(__CLR4_5_29ct9ctlvluliol.R.iget(12279)==0&false)); j++) {{
                __CLR4_5_29ct9ctlvluliol.R.inc(12280);layer_id_included_flag[i][j] = r.readBool("layer_id_included_flag[" + i + "][" + j + "]");
            }
        }}
        }__CLR4_5_29ct9ctlvluliol.R.inc(12281);boolean vps_timing_info_present_flag = r.readBool("vps_timing_info_present_flag");
        __CLR4_5_29ct9ctlvluliol.R.inc(12282);if ((((vps_timing_info_present_flag)&&(__CLR4_5_29ct9ctlvluliol.R.iget(12283)!=0|true))||(__CLR4_5_29ct9ctlvluliol.R.iget(12284)==0&false))) {{
            __CLR4_5_29ct9ctlvluliol.R.inc(12285);long vps_num_units_in_tick = r.readU(32, "vps_num_units_in_tick");
            __CLR4_5_29ct9ctlvluliol.R.inc(12286);long vps_time_scale = r.readU(32, "vps_time_scale");
            __CLR4_5_29ct9ctlvluliol.R.inc(12287);boolean vps_poc_proportional_to_timing_flag = r.readBool("vps_poc_proportional_to_timing_flag");
            __CLR4_5_29ct9ctlvluliol.R.inc(12288);if ((((vps_poc_proportional_to_timing_flag)&&(__CLR4_5_29ct9ctlvluliol.R.iget(12289)!=0|true))||(__CLR4_5_29ct9ctlvluliol.R.iget(12290)==0&false))) {{
                __CLR4_5_29ct9ctlvluliol.R.inc(12291);int vps_num_ticks_poc_diff_one_minus1 = r.readUE("vps_num_ticks_poc_diff_one_minus1");
            }
            }__CLR4_5_29ct9ctlvluliol.R.inc(12292);int vps_num_hrd_parameters = r.readUE("vps_num_hrd_parameters");
            __CLR4_5_29ct9ctlvluliol.R.inc(12293);int hrd_layer_set_idx[] = new int[vps_num_hrd_parameters];
            __CLR4_5_29ct9ctlvluliol.R.inc(12294);boolean cprms_present_flag[] = new boolean[vps_num_hrd_parameters];
            __CLR4_5_29ct9ctlvluliol.R.inc(12295);for (int i = 0; (((i < vps_num_hrd_parameters)&&(__CLR4_5_29ct9ctlvluliol.R.iget(12296)!=0|true))||(__CLR4_5_29ct9ctlvluliol.R.iget(12297)==0&false)); i++) {{
                __CLR4_5_29ct9ctlvluliol.R.inc(12298);hrd_layer_set_idx[i] = r.readUE("hrd_layer_set_idx[" + i + "]");
                __CLR4_5_29ct9ctlvluliol.R.inc(12299);if ((((i > 0)&&(__CLR4_5_29ct9ctlvluliol.R.iget(12300)!=0|true))||(__CLR4_5_29ct9ctlvluliol.R.iget(12301)==0&false))) {{
                    __CLR4_5_29ct9ctlvluliol.R.inc(12302);cprms_present_flag[i] = r.readBool("cprms_present_flag[" + i + "]");
                } }else {{
                    __CLR4_5_29ct9ctlvluliol.R.inc(12303);cprms_present_flag[0] = true;
                }

                }__CLR4_5_29ct9ctlvluliol.R.inc(12304);hrd_parameters(cprms_present_flag[i], vps_max_sub_layers_minus1, r);
            }
        }}

        }__CLR4_5_29ct9ctlvluliol.R.inc(12305);boolean vps_extension_flag = r.readBool("vps_extension_flag");
        __CLR4_5_29ct9ctlvluliol.R.inc(12306);if ((((vps_extension_flag)&&(__CLR4_5_29ct9ctlvluliol.R.iget(12307)!=0|true))||(__CLR4_5_29ct9ctlvluliol.R.iget(12308)==0&false))) {{
            __CLR4_5_29ct9ctlvluliol.R.inc(12309);while ((((r.moreRBSPData())&&(__CLR4_5_29ct9ctlvluliol.R.iget(12310)!=0|true))||(__CLR4_5_29ct9ctlvluliol.R.iget(12311)==0&false))) {{
                __CLR4_5_29ct9ctlvluliol.R.inc(12312);boolean vps_extension_data_flag = r.readBool("vps_extension_data_flag");
            }
        }}
        }__CLR4_5_29ct9ctlvluliol.R.inc(12313);r.readTrailingBits();
        __CLR4_5_29ct9ctlvluliol.R.inc(12314);return 0;
    }finally{__CLR4_5_29ct9ctlvluliol.R.flushNeeded();}}

    private void hrd_parameters(boolean commonInfPresentFlag, int maxNumSubLayersMinus1, CAVLCReader r) throws IOException {try{__CLR4_5_29ct9ctlvluliol.R.inc(12315);
        __CLR4_5_29ct9ctlvluliol.R.inc(12316);boolean nal_hrd_parameters_present_flag = false;
        __CLR4_5_29ct9ctlvluliol.R.inc(12317);boolean vcl_hrd_parameters_present_flag = false;
        __CLR4_5_29ct9ctlvluliol.R.inc(12318);boolean sub_pic_hrd_params_present_flag = false;
        __CLR4_5_29ct9ctlvluliol.R.inc(12319);if ((((commonInfPresentFlag)&&(__CLR4_5_29ct9ctlvluliol.R.iget(12320)!=0|true))||(__CLR4_5_29ct9ctlvluliol.R.iget(12321)==0&false))) {{
            __CLR4_5_29ct9ctlvluliol.R.inc(12322);nal_hrd_parameters_present_flag = r.readBool("nal_hrd_parameters_present_flag");
            __CLR4_5_29ct9ctlvluliol.R.inc(12323);vcl_hrd_parameters_present_flag = r.readBool("vcl_hrd_parameters_present_flag");
            __CLR4_5_29ct9ctlvluliol.R.inc(12324);if ((((nal_hrd_parameters_present_flag || vcl_hrd_parameters_present_flag)&&(__CLR4_5_29ct9ctlvluliol.R.iget(12325)!=0|true))||(__CLR4_5_29ct9ctlvluliol.R.iget(12326)==0&false))) {{
                __CLR4_5_29ct9ctlvluliol.R.inc(12327);sub_pic_hrd_params_present_flag = r.readBool("sub_pic_hrd_params_present_flag");
                __CLR4_5_29ct9ctlvluliol.R.inc(12328);if ((((sub_pic_hrd_params_present_flag)&&(__CLR4_5_29ct9ctlvluliol.R.iget(12329)!=0|true))||(__CLR4_5_29ct9ctlvluliol.R.iget(12330)==0&false))) {{
                    __CLR4_5_29ct9ctlvluliol.R.inc(12331);int tick_divisor_minus2 = r.readU(8, "tick_divisor_minus2");
                    __CLR4_5_29ct9ctlvluliol.R.inc(12332);int du_cpb_removal_delay_increment_length_minus1 = r.readU(5, "du_cpb_removal_delay_increment_length_minus1");
                    __CLR4_5_29ct9ctlvluliol.R.inc(12333);boolean sub_pic_cpb_params_in_pic_timing_sei_flag = r.readBool("sub_pic_cpb_params_in_pic_timing_sei_flag");
                    __CLR4_5_29ct9ctlvluliol.R.inc(12334);int dpb_output_delay_du_length_minus1 = r.readU(5, "dpb_output_delay_du_length_minus1");

                }
                }__CLR4_5_29ct9ctlvluliol.R.inc(12335);int bit_rate_scale = r.readU(4, "bit_rate_scale");
                __CLR4_5_29ct9ctlvluliol.R.inc(12336);int cpb_size_scale = r.readU(4, "cpb_size_scale");
                __CLR4_5_29ct9ctlvluliol.R.inc(12337);if ((((sub_pic_hrd_params_present_flag)&&(__CLR4_5_29ct9ctlvluliol.R.iget(12338)!=0|true))||(__CLR4_5_29ct9ctlvluliol.R.iget(12339)==0&false))) {{
                    __CLR4_5_29ct9ctlvluliol.R.inc(12340);int cpb_size_du_scale = r.readU(4, "cpb_size_du_scale");
                }
                }__CLR4_5_29ct9ctlvluliol.R.inc(12341);int initial_cpb_removal_delay_length_minus1 = r.readU(5, "initial_cpb_removal_delay_length_minus1");
                __CLR4_5_29ct9ctlvluliol.R.inc(12342);int au_cpb_removal_delay_length_minus1 = r.readU(5, "au_cpb_removal_delay_length_minus1");
                __CLR4_5_29ct9ctlvluliol.R.inc(12343);int dpb_output_delay_length_minus1 = r.readU(5, "dpb_output_delay_length_minus1");
            }
        }}
        }__CLR4_5_29ct9ctlvluliol.R.inc(12344);boolean fixed_pic_rate_general_flag[] = new boolean[maxNumSubLayersMinus1];
        __CLR4_5_29ct9ctlvluliol.R.inc(12345);boolean fixed_pic_rate_within_cvs_flag[] = new boolean[maxNumSubLayersMinus1];
        __CLR4_5_29ct9ctlvluliol.R.inc(12346);boolean low_delay_hrd_flag[] = new boolean[maxNumSubLayersMinus1];
        __CLR4_5_29ct9ctlvluliol.R.inc(12347);int cpb_cnt_minus1[] = new int[maxNumSubLayersMinus1];
        __CLR4_5_29ct9ctlvluliol.R.inc(12348);int elemental_duration_in_tc_minus1[] = new int[maxNumSubLayersMinus1];
        __CLR4_5_29ct9ctlvluliol.R.inc(12349);for (int i = 0; (((i <= maxNumSubLayersMinus1)&&(__CLR4_5_29ct9ctlvluliol.R.iget(12350)!=0|true))||(__CLR4_5_29ct9ctlvluliol.R.iget(12351)==0&false)); i++) {{
            __CLR4_5_29ct9ctlvluliol.R.inc(12352);fixed_pic_rate_general_flag[i] = r.readBool("fixed_pic_rate_general_flag[" + i + "]");
            __CLR4_5_29ct9ctlvluliol.R.inc(12353);if ((((!fixed_pic_rate_general_flag[i])&&(__CLR4_5_29ct9ctlvluliol.R.iget(12354)!=0|true))||(__CLR4_5_29ct9ctlvluliol.R.iget(12355)==0&false))) {{
                __CLR4_5_29ct9ctlvluliol.R.inc(12356);fixed_pic_rate_within_cvs_flag[i] = r.readBool("fixed_pic_rate_within_cvs_flag[" + i + "]");
            }
            }__CLR4_5_29ct9ctlvluliol.R.inc(12357);if ((((fixed_pic_rate_within_cvs_flag[i])&&(__CLR4_5_29ct9ctlvluliol.R.iget(12358)!=0|true))||(__CLR4_5_29ct9ctlvluliol.R.iget(12359)==0&false))) {{
                __CLR4_5_29ct9ctlvluliol.R.inc(12360);elemental_duration_in_tc_minus1[i] = r.readUE("elemental_duration_in_tc_minus1[" + i + "]");
            } }else {{
                __CLR4_5_29ct9ctlvluliol.R.inc(12361);low_delay_hrd_flag[i] = r.readBool("low_delay_hrd_flag[" + i + "]");
            }
            }__CLR4_5_29ct9ctlvluliol.R.inc(12362);if ((((!low_delay_hrd_flag[i])&&(__CLR4_5_29ct9ctlvluliol.R.iget(12363)!=0|true))||(__CLR4_5_29ct9ctlvluliol.R.iget(12364)==0&false))) {{
                __CLR4_5_29ct9ctlvluliol.R.inc(12365);cpb_cnt_minus1[i] = r.readUE("cpb_cnt_minus1[" + i + "]");
            }
            }__CLR4_5_29ct9ctlvluliol.R.inc(12366);if ((((nal_hrd_parameters_present_flag)&&(__CLR4_5_29ct9ctlvluliol.R.iget(12367)!=0|true))||(__CLR4_5_29ct9ctlvluliol.R.iget(12368)==0&false))) {{
                __CLR4_5_29ct9ctlvluliol.R.inc(12369);sub_layer_hrd_parameters(i, cpb_cnt_minus1[i], sub_pic_hrd_params_present_flag, r);
            }
            }__CLR4_5_29ct9ctlvluliol.R.inc(12370);if ((((vcl_hrd_parameters_present_flag)&&(__CLR4_5_29ct9ctlvluliol.R.iget(12371)!=0|true))||(__CLR4_5_29ct9ctlvluliol.R.iget(12372)==0&false))) {{
                __CLR4_5_29ct9ctlvluliol.R.inc(12373);sub_layer_hrd_parameters(i, cpb_cnt_minus1[i], sub_pic_hrd_params_present_flag, r);
            }
        }}

    }}finally{__CLR4_5_29ct9ctlvluliol.R.flushNeeded();}}

    void sub_layer_hrd_parameters(int subLayerId, int cpbCnt, boolean sub_pic_hrd_params_present_flag, CAVLCReader r) throws IOException {try{__CLR4_5_29ct9ctlvluliol.R.inc(12374);
        __CLR4_5_29ct9ctlvluliol.R.inc(12375);int bit_rate_value_minus1[] = new int[cpbCnt];
        __CLR4_5_29ct9ctlvluliol.R.inc(12376);int cpb_size_value_minus1[] = new int[cpbCnt];
        __CLR4_5_29ct9ctlvluliol.R.inc(12377);int cpb_size_du_value_minus1[] = new int[cpbCnt];
        __CLR4_5_29ct9ctlvluliol.R.inc(12378);int bit_rate_du_value_minus1[] = new int[cpbCnt];
        __CLR4_5_29ct9ctlvluliol.R.inc(12379);boolean cbr_flag[] = new boolean[cpbCnt];
        __CLR4_5_29ct9ctlvluliol.R.inc(12380);for (int i = 0; (((i <= cpbCnt)&&(__CLR4_5_29ct9ctlvluliol.R.iget(12381)!=0|true))||(__CLR4_5_29ct9ctlvluliol.R.iget(12382)==0&false)); i++) {{
            __CLR4_5_29ct9ctlvluliol.R.inc(12383);bit_rate_value_minus1[i] = r.readUE("bit_rate_value_minus1[" + i + "]");
            __CLR4_5_29ct9ctlvluliol.R.inc(12384);cpb_size_value_minus1[i] = r.readUE("cpb_size_value_minus1[" + i + "]");
            __CLR4_5_29ct9ctlvluliol.R.inc(12385);if ((((sub_pic_hrd_params_present_flag)&&(__CLR4_5_29ct9ctlvluliol.R.iget(12386)!=0|true))||(__CLR4_5_29ct9ctlvluliol.R.iget(12387)==0&false))) {{
                __CLR4_5_29ct9ctlvluliol.R.inc(12388);cpb_size_du_value_minus1[i] = r.readUE("cpb_size_du_value_minus1[" + i + "]");
                __CLR4_5_29ct9ctlvluliol.R.inc(12389);bit_rate_du_value_minus1[i] = r.readUE("bit_rate_du_value_minus1[" + i + "]");
            }
            }__CLR4_5_29ct9ctlvluliol.R.inc(12390);cbr_flag[i] = r.readBool("cbr_flag[" + i + "]");
        }
    }}finally{__CLR4_5_29ct9ctlvluliol.R.flushNeeded();}}

    private List<HevcDecoderConfigurationRecord.Array> getArrays() {try{__CLR4_5_29ct9ctlvluliol.R.inc(12391);
        __CLR4_5_29ct9ctlvluliol.R.inc(12392);HevcDecoderConfigurationRecord.Array vpsArray = new HevcDecoderConfigurationRecord.Array();
        __CLR4_5_29ct9ctlvluliol.R.inc(12393);vpsArray.array_completeness = true;
        __CLR4_5_29ct9ctlvluliol.R.inc(12394);vpsArray.nal_unit_type = VPS_NUT;
        __CLR4_5_29ct9ctlvluliol.R.inc(12395);vpsArray.nalUnits = new ArrayList<byte[]>();
        __CLR4_5_29ct9ctlvluliol.R.inc(12396);for (ByteBuffer byteBuffer : videoParamterSets.values()) {{
            __CLR4_5_29ct9ctlvluliol.R.inc(12397);byte[] ps = new byte[byteBuffer.limit()];
            __CLR4_5_29ct9ctlvluliol.R.inc(12398);byteBuffer.position(0);
            __CLR4_5_29ct9ctlvluliol.R.inc(12399);byteBuffer.get(ps);
            __CLR4_5_29ct9ctlvluliol.R.inc(12400);vpsArray.nalUnits.add(ps);
        }

        }__CLR4_5_29ct9ctlvluliol.R.inc(12401);HevcDecoderConfigurationRecord.Array spsArray = new HevcDecoderConfigurationRecord.Array();
        __CLR4_5_29ct9ctlvluliol.R.inc(12402);spsArray.array_completeness = true;
        __CLR4_5_29ct9ctlvluliol.R.inc(12403);spsArray.nal_unit_type = SPS_NUT;
        __CLR4_5_29ct9ctlvluliol.R.inc(12404);spsArray.nalUnits = new ArrayList<byte[]>();
        __CLR4_5_29ct9ctlvluliol.R.inc(12405);for (ByteBuffer byteBuffer : sequenceParamterSets.values()) {{
            __CLR4_5_29ct9ctlvluliol.R.inc(12406);byte[] ps = new byte[byteBuffer.limit()];
            __CLR4_5_29ct9ctlvluliol.R.inc(12407);byteBuffer.position(0);
            __CLR4_5_29ct9ctlvluliol.R.inc(12408);byteBuffer.get(ps);
            __CLR4_5_29ct9ctlvluliol.R.inc(12409);spsArray.nalUnits.add(ps);
        }

        }__CLR4_5_29ct9ctlvluliol.R.inc(12410);HevcDecoderConfigurationRecord.Array ppsArray = new HevcDecoderConfigurationRecord.Array();
        __CLR4_5_29ct9ctlvluliol.R.inc(12411);ppsArray.array_completeness = true;
        __CLR4_5_29ct9ctlvluliol.R.inc(12412);ppsArray.nal_unit_type = SPS_NUT;
        __CLR4_5_29ct9ctlvluliol.R.inc(12413);ppsArray.nalUnits = new ArrayList<byte[]>();
        __CLR4_5_29ct9ctlvluliol.R.inc(12414);for (ByteBuffer byteBuffer : pictureParamterSets.values()) {{
            __CLR4_5_29ct9ctlvluliol.R.inc(12415);byte[] ps = new byte[byteBuffer.limit()];
            __CLR4_5_29ct9ctlvluliol.R.inc(12416);byteBuffer.position(0);
            __CLR4_5_29ct9ctlvluliol.R.inc(12417);byteBuffer.get(ps);
            __CLR4_5_29ct9ctlvluliol.R.inc(12418);ppsArray.nalUnits.add(ps);
        }
        }__CLR4_5_29ct9ctlvluliol.R.inc(12419);return Arrays.asList(vpsArray, spsArray, ppsArray);
    }finally{__CLR4_5_29ct9ctlvluliol.R.flushNeeded();}}

    boolean isFirstOfAU(int nalUnitType, ByteBuffer nalUnit, List<ByteBuffer> accessUnit) {try{__CLR4_5_29ct9ctlvluliol.R.inc(12420);
        __CLR4_5_29ct9ctlvluliol.R.inc(12421);if ((((accessUnit.isEmpty())&&(__CLR4_5_29ct9ctlvluliol.R.iget(12422)!=0|true))||(__CLR4_5_29ct9ctlvluliol.R.iget(12423)==0&false))) {{
            __CLR4_5_29ct9ctlvluliol.R.inc(12424);return true;
        }
        }__CLR4_5_29ct9ctlvluliol.R.inc(12425);boolean vclPresentInCurrentAU = getNalUnitHeader(accessUnit.get(accessUnit.size() - 1)).nalUnitType <= 31;
        boolean __CLB4_5_2_bool1=false;__CLR4_5_29ct9ctlvluliol.R.inc(12426);switch (nalUnitType) {
            case VPS_NUT:if (!__CLB4_5_2_bool1) {__CLR4_5_29ct9ctlvluliol.R.inc(12427);__CLB4_5_2_bool1=true;}
            case SPS_NUT:if (!__CLB4_5_2_bool1) {__CLR4_5_29ct9ctlvluliol.R.inc(12428);__CLB4_5_2_bool1=true;}
            case PPS_NUT:if (!__CLB4_5_2_bool1) {__CLR4_5_29ct9ctlvluliol.R.inc(12429);__CLB4_5_2_bool1=true;}
            case AUD_NUT:if (!__CLB4_5_2_bool1) {__CLR4_5_29ct9ctlvluliol.R.inc(12430);__CLB4_5_2_bool1=true;}
            case PREFIX_SEI_NUT:if (!__CLB4_5_2_bool1) {__CLR4_5_29ct9ctlvluliol.R.inc(12431);__CLB4_5_2_bool1=true;}
            case RSV_NVCL41:if (!__CLB4_5_2_bool1) {__CLR4_5_29ct9ctlvluliol.R.inc(12432);__CLB4_5_2_bool1=true;}
            case RSV_NVCL42:if (!__CLB4_5_2_bool1) {__CLR4_5_29ct9ctlvluliol.R.inc(12433);__CLB4_5_2_bool1=true;}
            case RSV_NVCL43:if (!__CLB4_5_2_bool1) {__CLR4_5_29ct9ctlvluliol.R.inc(12434);__CLB4_5_2_bool1=true;}
            case RSV_NVCL44:if (!__CLB4_5_2_bool1) {__CLR4_5_29ct9ctlvluliol.R.inc(12435);__CLB4_5_2_bool1=true;}
            case UNSPEC48:if (!__CLB4_5_2_bool1) {__CLR4_5_29ct9ctlvluliol.R.inc(12436);__CLB4_5_2_bool1=true;}
            case UNSPEC49:if (!__CLB4_5_2_bool1) {__CLR4_5_29ct9ctlvluliol.R.inc(12437);__CLB4_5_2_bool1=true;}
            case UNSPEC50:if (!__CLB4_5_2_bool1) {__CLR4_5_29ct9ctlvluliol.R.inc(12438);__CLB4_5_2_bool1=true;}
            case UNSPEC51:if (!__CLB4_5_2_bool1) {__CLR4_5_29ct9ctlvluliol.R.inc(12439);__CLB4_5_2_bool1=true;}
            case UNSPEC52:if (!__CLB4_5_2_bool1) {__CLR4_5_29ct9ctlvluliol.R.inc(12440);__CLB4_5_2_bool1=true;}
            case UNSPEC53:if (!__CLB4_5_2_bool1) {__CLR4_5_29ct9ctlvluliol.R.inc(12441);__CLB4_5_2_bool1=true;}
            case UNSPEC54:if (!__CLB4_5_2_bool1) {__CLR4_5_29ct9ctlvluliol.R.inc(12442);__CLB4_5_2_bool1=true;}
            case UNSPEC55:if (!__CLB4_5_2_bool1) {__CLR4_5_29ct9ctlvluliol.R.inc(12443);__CLB4_5_2_bool1=true;}
                __CLR4_5_29ct9ctlvluliol.R.inc(12444);if ((((vclPresentInCurrentAU)&&(__CLR4_5_29ct9ctlvluliol.R.iget(12445)!=0|true))||(__CLR4_5_29ct9ctlvluliol.R.iget(12446)==0&false))) {{
                    __CLR4_5_29ct9ctlvluliol.R.inc(12447);return true;
                }
        }}
        boolean __CLB4_5_2_bool2=false;__CLR4_5_29ct9ctlvluliol.R.inc(12448);switch (nalUnitType) {
            case TRAIL_N:if (!__CLB4_5_2_bool2) {__CLR4_5_29ct9ctlvluliol.R.inc(12449);__CLB4_5_2_bool2=true;}
            case TRAIL_R:if (!__CLB4_5_2_bool2) {__CLR4_5_29ct9ctlvluliol.R.inc(12450);__CLB4_5_2_bool2=true;}
            case TSA_N:if (!__CLB4_5_2_bool2) {__CLR4_5_29ct9ctlvluliol.R.inc(12451);__CLB4_5_2_bool2=true;}
            case TSA_R:if (!__CLB4_5_2_bool2) {__CLR4_5_29ct9ctlvluliol.R.inc(12452);__CLB4_5_2_bool2=true;}
            case STSA_N:if (!__CLB4_5_2_bool2) {__CLR4_5_29ct9ctlvluliol.R.inc(12453);__CLB4_5_2_bool2=true;}
            case STSA_R:if (!__CLB4_5_2_bool2) {__CLR4_5_29ct9ctlvluliol.R.inc(12454);__CLB4_5_2_bool2=true;}
            case RADL_N:if (!__CLB4_5_2_bool2) {__CLR4_5_29ct9ctlvluliol.R.inc(12455);__CLB4_5_2_bool2=true;}
            case RADL_R:if (!__CLB4_5_2_bool2) {__CLR4_5_29ct9ctlvluliol.R.inc(12456);__CLB4_5_2_bool2=true;}
            case RASL_N:if (!__CLB4_5_2_bool2) {__CLR4_5_29ct9ctlvluliol.R.inc(12457);__CLB4_5_2_bool2=true;}
            case RASL_R:if (!__CLB4_5_2_bool2) {__CLR4_5_29ct9ctlvluliol.R.inc(12458);__CLB4_5_2_bool2=true;}
            case BLA_W_LP:if (!__CLB4_5_2_bool2) {__CLR4_5_29ct9ctlvluliol.R.inc(12459);__CLB4_5_2_bool2=true;}
            case BLA_W_RADL:if (!__CLB4_5_2_bool2) {__CLR4_5_29ct9ctlvluliol.R.inc(12460);__CLB4_5_2_bool2=true;}
            case BLA_N_LP:if (!__CLB4_5_2_bool2) {__CLR4_5_29ct9ctlvluliol.R.inc(12461);__CLB4_5_2_bool2=true;}
            case IDR_W_RADL:if (!__CLB4_5_2_bool2) {__CLR4_5_29ct9ctlvluliol.R.inc(12462);__CLB4_5_2_bool2=true;}
            case IDR_N_LP:if (!__CLB4_5_2_bool2) {__CLR4_5_29ct9ctlvluliol.R.inc(12463);__CLB4_5_2_bool2=true;}
            case CRA_NUT:if (!__CLB4_5_2_bool2) {__CLR4_5_29ct9ctlvluliol.R.inc(12464);__CLB4_5_2_bool2=true;}
                __CLR4_5_29ct9ctlvluliol.R.inc(12465);byte b[] = new byte[50];
                __CLR4_5_29ct9ctlvluliol.R.inc(12466);nalUnit.position(0);
                __CLR4_5_29ct9ctlvluliol.R.inc(12467);nalUnit.get(b);
                __CLR4_5_29ct9ctlvluliol.R.inc(12468);nalUnit.position(2);
                __CLR4_5_29ct9ctlvluliol.R.inc(12469);int firstRsbp8Bit = IsoTypeReader.readUInt8(nalUnit);

                __CLR4_5_29ct9ctlvluliol.R.inc(12470);return vclPresentInCurrentAU && (firstRsbp8Bit & 0x80) > 0;
        }
        __CLR4_5_29ct9ctlvluliol.R.inc(12471);return false;
    }finally{__CLR4_5_29ct9ctlvluliol.R.flushNeeded();}}

    public NalUnitHeader getNalUnitHeader(ByteBuffer nal) {try{__CLR4_5_29ct9ctlvluliol.R.inc(12472);
        __CLR4_5_29ct9ctlvluliol.R.inc(12473);nal.position(0);
        __CLR4_5_29ct9ctlvluliol.R.inc(12474);int nal_unit_header = IsoTypeReader.readUInt16(nal);


        __CLR4_5_29ct9ctlvluliol.R.inc(12475);NalUnitHeader nalUnitHeader = new NalUnitHeader();
        __CLR4_5_29ct9ctlvluliol.R.inc(12476);nalUnitHeader.forbiddenZeroFlag = (nal_unit_header & 0x8000) >> 15;
        __CLR4_5_29ct9ctlvluliol.R.inc(12477);nalUnitHeader.nalUnitType = (nal_unit_header & 0x7E00) >> 9;
        __CLR4_5_29ct9ctlvluliol.R.inc(12478);nalUnitHeader.nuhLayerId = (nal_unit_header & 0x1F8) >> 3;
        __CLR4_5_29ct9ctlvluliol.R.inc(12479);nalUnitHeader.nuhTemporalIdPlusOne = (nal_unit_header & 0x7);
        __CLR4_5_29ct9ctlvluliol.R.inc(12480);return nalUnitHeader;
    }finally{__CLR4_5_29ct9ctlvluliol.R.flushNeeded();}}

    protected Sample createSample(List<ByteBuffer> nals) {try{__CLR4_5_29ct9ctlvluliol.R.inc(12481);
        __CLR4_5_29ct9ctlvluliol.R.inc(12482);byte[] sizeInfo = new byte[nals.size() * 4];
        __CLR4_5_29ct9ctlvluliol.R.inc(12483);ByteBuffer sizeBuf = ByteBuffer.wrap(sizeInfo);
        __CLR4_5_29ct9ctlvluliol.R.inc(12484);for (ByteBuffer b : nals) {{
            __CLR4_5_29ct9ctlvluliol.R.inc(12485);sizeBuf.putInt(b.remaining());
        }

        }__CLR4_5_29ct9ctlvluliol.R.inc(12486);ByteBuffer[] data = new ByteBuffer[nals.size() * 2];

        __CLR4_5_29ct9ctlvluliol.R.inc(12487);for (int i = 0; (((i < nals.size())&&(__CLR4_5_29ct9ctlvluliol.R.iget(12488)!=0|true))||(__CLR4_5_29ct9ctlvluliol.R.iget(12489)==0&false)); i++) {{
            __CLR4_5_29ct9ctlvluliol.R.inc(12490);data[2 * i] = ByteBuffer.wrap(sizeInfo, i * 4, 4);
            __CLR4_5_29ct9ctlvluliol.R.inc(12491);data[2 * i + 1] = nals.get(i);
        }

        }__CLR4_5_29ct9ctlvluliol.R.inc(12492);return new SampleImpl(data);
    }finally{__CLR4_5_29ct9ctlvluliol.R.flushNeeded();}}

    public enum PARSE_STATE {
        AUD_SEI_SLICE,
        SEI_SLICE,
        SLICE_OES_EOB,
    }

    public static class NalUnitHeader {
        int forbiddenZeroFlag;
        int nalUnitType;
        int nuhLayerId;
        int nuhTemporalIdPlusOne;
    }

    class LookAhead {
        long bufferStartPos = 0;
        int inBufferPos = 0;
        DataSource dataSource;
        ByteBuffer buffer;

        long start;

        LookAhead(DataSource dataSource) throws IOException {try{__CLR4_5_29ct9ctlvluliol.R.inc(12493);
            __CLR4_5_29ct9ctlvluliol.R.inc(12494);this.dataSource = dataSource;
            __CLR4_5_29ct9ctlvluliol.R.inc(12495);fillBuffer();
        }finally{__CLR4_5_29ct9ctlvluliol.R.flushNeeded();}}

        public void fillBuffer() throws IOException {try{__CLR4_5_29ct9ctlvluliol.R.inc(12496);
            __CLR4_5_29ct9ctlvluliol.R.inc(12497);buffer = dataSource.map(bufferStartPos, Math.min(dataSource.size() - bufferStartPos, BUFFER));
        }finally{__CLR4_5_29ct9ctlvluliol.R.flushNeeded();}}

        boolean nextThreeEquals001() throws IOException {try{__CLR4_5_29ct9ctlvluliol.R.inc(12498);
            __CLR4_5_29ct9ctlvluliol.R.inc(12499);if ((((buffer.limit() - inBufferPos >= 3)&&(__CLR4_5_29ct9ctlvluliol.R.iget(12500)!=0|true))||(__CLR4_5_29ct9ctlvluliol.R.iget(12501)==0&false))) {{
                __CLR4_5_29ct9ctlvluliol.R.inc(12502);return (buffer.get(inBufferPos) == 0 &&
                        buffer.get(inBufferPos + 1) == 0 &&
                        buffer.get(inBufferPos + 2) == 1);
            } }else {{
                __CLR4_5_29ct9ctlvluliol.R.inc(12503);if ((((bufferStartPos + inBufferPos == dataSource.size())&&(__CLR4_5_29ct9ctlvluliol.R.iget(12504)!=0|true))||(__CLR4_5_29ct9ctlvluliol.R.iget(12505)==0&false))) {{
                    __CLR4_5_29ct9ctlvluliol.R.inc(12506);throw new EOFException();
                }
                }__CLR4_5_29ct9ctlvluliol.R.inc(12507);throw new RuntimeException("buffer repositioning require");
            }
        }}finally{__CLR4_5_29ct9ctlvluliol.R.flushNeeded();}}

        boolean nextThreeEquals000or001orEof() throws IOException {try{__CLR4_5_29ct9ctlvluliol.R.inc(12508);
            __CLR4_5_29ct9ctlvluliol.R.inc(12509);if ((((buffer.limit() - inBufferPos >= 3)&&(__CLR4_5_29ct9ctlvluliol.R.iget(12510)!=0|true))||(__CLR4_5_29ct9ctlvluliol.R.iget(12511)==0&false))) {{
                __CLR4_5_29ct9ctlvluliol.R.inc(12512);return ((buffer.get(inBufferPos) == 0 &&
                        buffer.get(inBufferPos + 1) == 0 &&
                        (buffer.get(inBufferPos + 2) == 0 || buffer.get(inBufferPos + 2) == 1)));
            } }else {{
                __CLR4_5_29ct9ctlvluliol.R.inc(12513);if ((((bufferStartPos + inBufferPos + 3 > dataSource.size())&&(__CLR4_5_29ct9ctlvluliol.R.iget(12514)!=0|true))||(__CLR4_5_29ct9ctlvluliol.R.iget(12515)==0&false))) {{
                    __CLR4_5_29ct9ctlvluliol.R.inc(12516);return bufferStartPos + inBufferPos == dataSource.size();
                } }else {{
                    __CLR4_5_29ct9ctlvluliol.R.inc(12517);bufferStartPos = start;
                    __CLR4_5_29ct9ctlvluliol.R.inc(12518);inBufferPos = 0;
                    __CLR4_5_29ct9ctlvluliol.R.inc(12519);fillBuffer();
                    __CLR4_5_29ct9ctlvluliol.R.inc(12520);return nextThreeEquals000or001orEof();
                }
            }}
        }}finally{__CLR4_5_29ct9ctlvluliol.R.flushNeeded();}}

        void discardByte() {try{__CLR4_5_29ct9ctlvluliol.R.inc(12521);
            __CLR4_5_29ct9ctlvluliol.R.inc(12522);inBufferPos++;
        }finally{__CLR4_5_29ct9ctlvluliol.R.flushNeeded();}}

        void discardNext3AndMarkStart() {try{__CLR4_5_29ct9ctlvluliol.R.inc(12523);
            __CLR4_5_29ct9ctlvluliol.R.inc(12524);inBufferPos += 3;
            __CLR4_5_29ct9ctlvluliol.R.inc(12525);start = bufferStartPos + inBufferPos;
        }finally{__CLR4_5_29ct9ctlvluliol.R.flushNeeded();}}

        public ByteBuffer getNal() {try{__CLR4_5_29ct9ctlvluliol.R.inc(12526);
            __CLR4_5_29ct9ctlvluliol.R.inc(12527);if ((((start >= bufferStartPos)&&(__CLR4_5_29ct9ctlvluliol.R.iget(12528)!=0|true))||(__CLR4_5_29ct9ctlvluliol.R.iget(12529)==0&false))) {{
                __CLR4_5_29ct9ctlvluliol.R.inc(12530);buffer.position((int) (start - bufferStartPos));
                __CLR4_5_29ct9ctlvluliol.R.inc(12531);Buffer sample = buffer.slice();
                __CLR4_5_29ct9ctlvluliol.R.inc(12532);sample.limit((int) (inBufferPos - (start - bufferStartPos)));
                __CLR4_5_29ct9ctlvluliol.R.inc(12533);return (ByteBuffer) sample;
            } }else {{
                __CLR4_5_29ct9ctlvluliol.R.inc(12534);throw new RuntimeException("damn! NAL exceeds buffer");
                // this can only happen if NAL is bigger than the buffer
            }

        }}finally{__CLR4_5_29ct9ctlvluliol.R.flushNeeded();}}
    }
}
