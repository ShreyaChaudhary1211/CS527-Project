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
@java.lang.SuppressWarnings({"fallthrough"}) public class H265TrackImplOld {public static class __CLR4_5_29a69a6lvl9eiq6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,12440,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public H265TrackImplOld(DataSource ds) throws IOException {try{__CLR4_5_29a69a6lvl9eiq6.R.inc(12030);
        __CLR4_5_29a69a6lvl9eiq6.R.inc(12031);LookAhead la = new LookAhead(ds);

        __CLR4_5_29a69a6lvl9eiq6.R.inc(12032);long sampleNo = 1;
        __CLR4_5_29a69a6lvl9eiq6.R.inc(12033);List<ByteBuffer> accessUnit = new ArrayList<ByteBuffer>();
        __CLR4_5_29a69a6lvl9eiq6.R.inc(12034);int accessUnitNalType = 0;

        __CLR4_5_29a69a6lvl9eiq6.R.inc(12035);ByteBuffer nal;
        __CLR4_5_29a69a6lvl9eiq6.R.inc(12036);while ((nal = findNextNal(la)) != null) {{

            __CLR4_5_29a69a6lvl9eiq6.R.inc(12039);NalUnitHeader nalUnitHeader = getNalUnitHeader(nal);

            //System.err.println(String.format("type: %3d - layer: %3d - tempId: %3d",
            //        nalUnitHeader.nalUnitType, nalUnitHeader.nuhLayerId, nalUnitHeader.nuhTemporalIdPlusOne));
            boolean __CLB4_5_2_bool0=false;__CLR4_5_29a69a6lvl9eiq6.R.inc(12040);switch (nalUnitHeader.nalUnitType) {
                case VPS_NUT:if (!__CLB4_5_2_bool0) {__CLR4_5_29a69a6lvl9eiq6.R.inc(12041);__CLB4_5_2_bool0=true;}
                    __CLR4_5_29a69a6lvl9eiq6.R.inc(12042);videoParamterSets.put(sampleNo, nal);
                    __CLR4_5_29a69a6lvl9eiq6.R.inc(12043);break;
                case SPS_NUT:if (!__CLB4_5_2_bool0) {__CLR4_5_29a69a6lvl9eiq6.R.inc(12044);__CLB4_5_2_bool0=true;}
                    __CLR4_5_29a69a6lvl9eiq6.R.inc(12045);sequenceParamterSets.put(sampleNo, nal);
                    __CLR4_5_29a69a6lvl9eiq6.R.inc(12046);break;
                case PPS_NUT:if (!__CLB4_5_2_bool0) {__CLR4_5_29a69a6lvl9eiq6.R.inc(12047);__CLB4_5_2_bool0=true;}
                    __CLR4_5_29a69a6lvl9eiq6.R.inc(12048);pictureParamterSets.put(sampleNo, nal);
                    __CLR4_5_29a69a6lvl9eiq6.R.inc(12049);break;
            }
            __CLR4_5_29a69a6lvl9eiq6.R.inc(12050);if ((((nalUnitHeader.nalUnitType < 32)&&(__CLR4_5_29a69a6lvl9eiq6.R.iget(12051)!=0|true))||(__CLR4_5_29a69a6lvl9eiq6.R.iget(12052)==0&false))) {{
                __CLR4_5_29a69a6lvl9eiq6.R.inc(12053);accessUnitNalType = nalUnitHeader.nalUnitType;
                // All NAL in one Access Unit Sample have same nal unit type
            }

            }__CLR4_5_29a69a6lvl9eiq6.R.inc(12054);if ((((isFirstOfAU(nalUnitHeader.nalUnitType, nal, accessUnit) && !accessUnit.isEmpty())&&(__CLR4_5_29a69a6lvl9eiq6.R.iget(12055)!=0|true))||(__CLR4_5_29a69a6lvl9eiq6.R.iget(12056)==0&false))) {{

                __CLR4_5_29a69a6lvl9eiq6.R.inc(12057);System.err.println("##########################");
                __CLR4_5_29a69a6lvl9eiq6.R.inc(12058);for (ByteBuffer byteBuffer : accessUnit) {{
                    __CLR4_5_29a69a6lvl9eiq6.R.inc(12059);NalUnitHeader _nalUnitHeader = getNalUnitHeader(byteBuffer);
                    __CLR4_5_29a69a6lvl9eiq6.R.inc(12060);System.err.println(String.format("type: %3d - layer: %3d - tempId: %3d - size: %3d",
                            _nalUnitHeader.nalUnitType, _nalUnitHeader.nuhLayerId, _nalUnitHeader.nuhTemporalIdPlusOne, byteBuffer.limit()));
                }

                }__CLR4_5_29a69a6lvl9eiq6.R.inc(12061);System.err.println("                          ##########################");
                __CLR4_5_29a69a6lvl9eiq6.R.inc(12062);samples.add(createSample(accessUnit));
                __CLR4_5_29a69a6lvl9eiq6.R.inc(12063);accessUnit.clear();
                __CLR4_5_29a69a6lvl9eiq6.R.inc(12064);sampleNo++;
            }
            }__CLR4_5_29a69a6lvl9eiq6.R.inc(12065);accessUnit.add(nal);
            __CLR4_5_29a69a6lvl9eiq6.R.inc(12066);if ((((accessUnitNalType >= 16 && accessUnitNalType <= 21)&&(__CLR4_5_29a69a6lvl9eiq6.R.iget(12067)!=0|true))||(__CLR4_5_29a69a6lvl9eiq6.R.iget(12068)==0&false))) {{
                __CLR4_5_29a69a6lvl9eiq6.R.inc(12069);syncSamples.add(sampleNo);
            }


        }}

        }__CLR4_5_29a69a6lvl9eiq6.R.inc(12070);System.err.println("");
        __CLR4_5_29a69a6lvl9eiq6.R.inc(12071);HevcDecoderConfigurationRecord hvcC = new HevcDecoderConfigurationRecord();

        __CLR4_5_29a69a6lvl9eiq6.R.inc(12072);hvcC.setArrays(getArrays());
        __CLR4_5_29a69a6lvl9eiq6.R.inc(12073);hvcC.setAvgFrameRate(0);
    }finally{__CLR4_5_29a69a6lvl9eiq6.R.flushNeeded();}}

    public static void main(String[] args) throws IOException {try{__CLR4_5_29a69a6lvl9eiq6.R.inc(12074);
        __CLR4_5_29a69a6lvl9eiq6.R.inc(12075);new H265TrackImplOld(new FileDataSourceImpl("c:\\content\\test-UHD-HEVC_01_FMV_Med_track1.hvc"));
    }finally{__CLR4_5_29a69a6lvl9eiq6.R.flushNeeded();}}

    private ByteBuffer findNextNal(LookAhead la) throws IOException {try{__CLR4_5_29a69a6lvl9eiq6.R.inc(12076);
        __CLR4_5_29a69a6lvl9eiq6.R.inc(12077);try {
            __CLR4_5_29a69a6lvl9eiq6.R.inc(12078);while ((((!la.nextThreeEquals001())&&(__CLR4_5_29a69a6lvl9eiq6.R.iget(12079)!=0|true))||(__CLR4_5_29a69a6lvl9eiq6.R.iget(12080)==0&false))) {{
                __CLR4_5_29a69a6lvl9eiq6.R.inc(12081);la.discardByte();
            }
            }__CLR4_5_29a69a6lvl9eiq6.R.inc(12082);la.discardNext3AndMarkStart();

            __CLR4_5_29a69a6lvl9eiq6.R.inc(12083);while ((((!la.nextThreeEquals000or001orEof())&&(__CLR4_5_29a69a6lvl9eiq6.R.iget(12084)!=0|true))||(__CLR4_5_29a69a6lvl9eiq6.R.iget(12085)==0&false))) {{
                __CLR4_5_29a69a6lvl9eiq6.R.inc(12086);la.discardByte();
            }
            }__CLR4_5_29a69a6lvl9eiq6.R.inc(12087);return la.getNal();
        } catch (EOFException e) {
            __CLR4_5_29a69a6lvl9eiq6.R.inc(12088);return null;
        }

    }finally{__CLR4_5_29a69a6lvl9eiq6.R.flushNeeded();}}

    public void profile_tier_level(int maxNumSubLayersMinus1, CAVLCReader r) throws IOException {try{__CLR4_5_29a69a6lvl9eiq6.R.inc(12089);
        __CLR4_5_29a69a6lvl9eiq6.R.inc(12090);int general_profile_space = r.readU(2, "general_profile_space ");
        __CLR4_5_29a69a6lvl9eiq6.R.inc(12091);boolean general_tier_flag = r.readBool("general_tier_flag");
        __CLR4_5_29a69a6lvl9eiq6.R.inc(12092);int general_profile_idc = r.readU(5, "general_profile_idc");
        __CLR4_5_29a69a6lvl9eiq6.R.inc(12093);boolean[] general_profile_compatibility_flag = new boolean[32];
        __CLR4_5_29a69a6lvl9eiq6.R.inc(12094);for (int j = 0; (((j < 32)&&(__CLR4_5_29a69a6lvl9eiq6.R.iget(12095)!=0|true))||(__CLR4_5_29a69a6lvl9eiq6.R.iget(12096)==0&false)); j++) {{
            __CLR4_5_29a69a6lvl9eiq6.R.inc(12097);general_profile_compatibility_flag[j] = r.readBool("general_profile_compatibility_flag[" + j + "]");
        }
        }__CLR4_5_29a69a6lvl9eiq6.R.inc(12098);boolean general_progressive_source_flag = r.readBool("general_progressive_source_flag");
        __CLR4_5_29a69a6lvl9eiq6.R.inc(12099);boolean general_interlaced_source_flag = r.readBool("general_interlaced_source_flag");
        __CLR4_5_29a69a6lvl9eiq6.R.inc(12100);boolean general_non_packed_constraint_flag = r.readBool("general_non_packed_constraint_flag");
        __CLR4_5_29a69a6lvl9eiq6.R.inc(12101);boolean general_frame_only_constraint_flag = r.readBool("general_frame_only_constraint_flag");

        __CLR4_5_29a69a6lvl9eiq6.R.inc(12102);long general_reserved_zero_44bits = r.readU(44, "general_reserved_zero_44bits");
        __CLR4_5_29a69a6lvl9eiq6.R.inc(12103);int general_level_idc = r.readU(8, "general_level_idc");

        __CLR4_5_29a69a6lvl9eiq6.R.inc(12104);boolean[] sub_layer_profile_present_flag = new boolean[maxNumSubLayersMinus1];
        __CLR4_5_29a69a6lvl9eiq6.R.inc(12105);boolean[] sub_layer_level_present_flag = new boolean[maxNumSubLayersMinus1];
        __CLR4_5_29a69a6lvl9eiq6.R.inc(12106);for (int i = 0; (((i < maxNumSubLayersMinus1)&&(__CLR4_5_29a69a6lvl9eiq6.R.iget(12107)!=0|true))||(__CLR4_5_29a69a6lvl9eiq6.R.iget(12108)==0&false)); i++) {{
            __CLR4_5_29a69a6lvl9eiq6.R.inc(12109);sub_layer_profile_present_flag[i] = r.readBool("sub_layer_profile_present_flag[" + i + "]");
            __CLR4_5_29a69a6lvl9eiq6.R.inc(12110);sub_layer_level_present_flag[i] = r.readBool("sub_layer_level_present_flag[" + i + "]");
        }
        }__CLR4_5_29a69a6lvl9eiq6.R.inc(12111);if ((((maxNumSubLayersMinus1 > 0)&&(__CLR4_5_29a69a6lvl9eiq6.R.iget(12112)!=0|true))||(__CLR4_5_29a69a6lvl9eiq6.R.iget(12113)==0&false))) {{
            __CLR4_5_29a69a6lvl9eiq6.R.inc(12114);for (int i = maxNumSubLayersMinus1; (((i < 8)&&(__CLR4_5_29a69a6lvl9eiq6.R.iget(12115)!=0|true))||(__CLR4_5_29a69a6lvl9eiq6.R.iget(12116)==0&false)); i++) {{
                __CLR4_5_29a69a6lvl9eiq6.R.inc(12117);r.readU(2, "reserved_zero_2bits");
            }
        }}


        }__CLR4_5_29a69a6lvl9eiq6.R.inc(12118);int[] sub_layer_profile_space = new int[maxNumSubLayersMinus1];
        __CLR4_5_29a69a6lvl9eiq6.R.inc(12119);boolean[] sub_layer_tier_flag = new boolean[maxNumSubLayersMinus1];
        __CLR4_5_29a69a6lvl9eiq6.R.inc(12120);int[] sub_layer_profile_idc = new int[maxNumSubLayersMinus1];
        __CLR4_5_29a69a6lvl9eiq6.R.inc(12121);boolean[][] sub_layer_profile_compatibility_flag = new boolean[maxNumSubLayersMinus1][32];
        __CLR4_5_29a69a6lvl9eiq6.R.inc(12122);boolean[] sub_layer_progressive_source_flag = new boolean[maxNumSubLayersMinus1];

        __CLR4_5_29a69a6lvl9eiq6.R.inc(12123);boolean[] sub_layer_interlaced_source_flag = new boolean[maxNumSubLayersMinus1];
        __CLR4_5_29a69a6lvl9eiq6.R.inc(12124);boolean[] sub_layer_non_packed_constraint_flag = new boolean[maxNumSubLayersMinus1];
        __CLR4_5_29a69a6lvl9eiq6.R.inc(12125);boolean[] sub_layer_frame_only_constraint_flag = new boolean[maxNumSubLayersMinus1];
        __CLR4_5_29a69a6lvl9eiq6.R.inc(12126);int[] sub_layer_level_idc = new int[maxNumSubLayersMinus1];

        __CLR4_5_29a69a6lvl9eiq6.R.inc(12127);for (int i = 0; (((i < maxNumSubLayersMinus1)&&(__CLR4_5_29a69a6lvl9eiq6.R.iget(12128)!=0|true))||(__CLR4_5_29a69a6lvl9eiq6.R.iget(12129)==0&false)); i++) {{
            __CLR4_5_29a69a6lvl9eiq6.R.inc(12130);if ((((sub_layer_profile_present_flag[i])&&(__CLR4_5_29a69a6lvl9eiq6.R.iget(12131)!=0|true))||(__CLR4_5_29a69a6lvl9eiq6.R.iget(12132)==0&false))) {{
                __CLR4_5_29a69a6lvl9eiq6.R.inc(12133);sub_layer_profile_space[i] = r.readU(2, "sub_layer_profile_space[" + i + "]");
                __CLR4_5_29a69a6lvl9eiq6.R.inc(12134);sub_layer_tier_flag[i] = r.readBool("sub_layer_tier_flag[" + i + "]");
                __CLR4_5_29a69a6lvl9eiq6.R.inc(12135);sub_layer_profile_idc[i] = r.readU(5, "sub_layer_profile_idc[" + i + "]");
                __CLR4_5_29a69a6lvl9eiq6.R.inc(12136);for (int j = 0; (((j < 32)&&(__CLR4_5_29a69a6lvl9eiq6.R.iget(12137)!=0|true))||(__CLR4_5_29a69a6lvl9eiq6.R.iget(12138)==0&false)); j++) {{
                    __CLR4_5_29a69a6lvl9eiq6.R.inc(12139);sub_layer_profile_compatibility_flag[i][j] = r.readBool("sub_layer_profile_compatibility_flag[" + i + "][" + j + "]");
                }
                }__CLR4_5_29a69a6lvl9eiq6.R.inc(12140);sub_layer_progressive_source_flag[i] = r.readBool("sub_layer_progressive_source_flag[" + i + "]");
                __CLR4_5_29a69a6lvl9eiq6.R.inc(12141);sub_layer_interlaced_source_flag[i] = r.readBool("sub_layer_interlaced_source_flag[" + i + "]");
                __CLR4_5_29a69a6lvl9eiq6.R.inc(12142);sub_layer_non_packed_constraint_flag[i] = r.readBool("sub_layer_non_packed_constraint_flag[" + i + "]");
                __CLR4_5_29a69a6lvl9eiq6.R.inc(12143);sub_layer_frame_only_constraint_flag[i] = r.readBool("sub_layer_frame_only_constraint_flag[" + i + "]");
                __CLR4_5_29a69a6lvl9eiq6.R.inc(12144);r.readNBit(44, "reserved");
            }
            }__CLR4_5_29a69a6lvl9eiq6.R.inc(12145);if ((((sub_layer_level_present_flag[i])&&(__CLR4_5_29a69a6lvl9eiq6.R.iget(12146)!=0|true))||(__CLR4_5_29a69a6lvl9eiq6.R.iget(12147)==0&false)))
                {__CLR4_5_29a69a6lvl9eiq6.R.inc(12148);sub_layer_level_idc[i] = r.readU(8, "sub_layer_level_idc");
        }}
    }}finally{__CLR4_5_29a69a6lvl9eiq6.R.flushNeeded();}}


    public int getFrameRate(ByteBuffer vps) throws IOException {try{__CLR4_5_29a69a6lvl9eiq6.R.inc(12149);
        __CLR4_5_29a69a6lvl9eiq6.R.inc(12150);CAVLCReader r = new CAVLCReader(Channels.newInputStream(new ByteBufferByteChannel((ByteBuffer) vps.position(0))));
        __CLR4_5_29a69a6lvl9eiq6.R.inc(12151);int vps_parameter_set_id = r.readU(4, "vps_parameter_set_id");
        __CLR4_5_29a69a6lvl9eiq6.R.inc(12152);int vps_reserved_three_2bits = r.readU(2, "vps_reserved_three_2bits");
        __CLR4_5_29a69a6lvl9eiq6.R.inc(12153);int vps_max_layers_minus1 = r.readU(6, "vps_max_layers_minus1");
        __CLR4_5_29a69a6lvl9eiq6.R.inc(12154);int vps_max_sub_layers_minus1 = r.readU(3, "vps_max_sub_layers_minus1");
        __CLR4_5_29a69a6lvl9eiq6.R.inc(12155);boolean vps_temporal_id_nesting_flag = r.readBool("vps_temporal_id_nesting_flag");
        __CLR4_5_29a69a6lvl9eiq6.R.inc(12156);int vps_reserved_0xffff_16bits = r.readU(16, "vps_reserved_0xffff_16bits");
        __CLR4_5_29a69a6lvl9eiq6.R.inc(12157);profile_tier_level(vps_max_sub_layers_minus1, r);


        __CLR4_5_29a69a6lvl9eiq6.R.inc(12158);boolean vps_sub_layer_ordering_info_present_flag = r.readBool("vps_sub_layer_ordering_info_present_flag");
        __CLR4_5_29a69a6lvl9eiq6.R.inc(12159);int[] vps_max_dec_pic_buffering_minus1 = new int[(((vps_sub_layer_ordering_info_present_flag )&&(__CLR4_5_29a69a6lvl9eiq6.R.iget(12160)!=0|true))||(__CLR4_5_29a69a6lvl9eiq6.R.iget(12161)==0&false))? 0 : vps_max_sub_layers_minus1];
        __CLR4_5_29a69a6lvl9eiq6.R.inc(12162);int[] vps_max_num_reorder_pics = new int[(((vps_sub_layer_ordering_info_present_flag )&&(__CLR4_5_29a69a6lvl9eiq6.R.iget(12163)!=0|true))||(__CLR4_5_29a69a6lvl9eiq6.R.iget(12164)==0&false))? 0 : vps_max_sub_layers_minus1];
        __CLR4_5_29a69a6lvl9eiq6.R.inc(12165);int[] vps_max_latency_increase_plus1 = new int[(((vps_sub_layer_ordering_info_present_flag )&&(__CLR4_5_29a69a6lvl9eiq6.R.iget(12166)!=0|true))||(__CLR4_5_29a69a6lvl9eiq6.R.iget(12167)==0&false))? 0 : vps_max_sub_layers_minus1];
        __CLR4_5_29a69a6lvl9eiq6.R.inc(12168);for (int i = ((((vps_sub_layer_ordering_info_present_flag )&&(__CLR4_5_29a69a6lvl9eiq6.R.iget(12169)!=0|true))||(__CLR4_5_29a69a6lvl9eiq6.R.iget(12170)==0&false))? 0 : vps_max_sub_layers_minus1); (((i <= vps_max_sub_layers_minus1)&&(__CLR4_5_29a69a6lvl9eiq6.R.iget(12171)!=0|true))||(__CLR4_5_29a69a6lvl9eiq6.R.iget(12172)==0&false)); i++) {{
            __CLR4_5_29a69a6lvl9eiq6.R.inc(12173);vps_max_dec_pic_buffering_minus1[i] = r.readUE("vps_max_dec_pic_buffering_minus1[" + i + "]");
            __CLR4_5_29a69a6lvl9eiq6.R.inc(12174);vps_max_num_reorder_pics[i] = r.readUE("vps_max_dec_pic_buffering_minus1[" + i + "]");
            __CLR4_5_29a69a6lvl9eiq6.R.inc(12175);vps_max_latency_increase_plus1[i] = r.readUE("vps_max_dec_pic_buffering_minus1[" + i + "]");
        }
        }__CLR4_5_29a69a6lvl9eiq6.R.inc(12176);int vps_max_layer_id = r.readU(6, "vps_max_layer_id");
        __CLR4_5_29a69a6lvl9eiq6.R.inc(12177);int vps_num_layer_sets_minus1 = r.readUE("vps_num_layer_sets_minus1");
        __CLR4_5_29a69a6lvl9eiq6.R.inc(12178);boolean[][] layer_id_included_flag = new boolean[vps_num_layer_sets_minus1][vps_max_layer_id];
        __CLR4_5_29a69a6lvl9eiq6.R.inc(12179);for (int i = 1; (((i <= vps_num_layer_sets_minus1)&&(__CLR4_5_29a69a6lvl9eiq6.R.iget(12180)!=0|true))||(__CLR4_5_29a69a6lvl9eiq6.R.iget(12181)==0&false)); i++) {{
            __CLR4_5_29a69a6lvl9eiq6.R.inc(12182);for (int j = 0; (((j <= vps_max_layer_id)&&(__CLR4_5_29a69a6lvl9eiq6.R.iget(12183)!=0|true))||(__CLR4_5_29a69a6lvl9eiq6.R.iget(12184)==0&false)); j++) {{
                __CLR4_5_29a69a6lvl9eiq6.R.inc(12185);layer_id_included_flag[i][j] = r.readBool("layer_id_included_flag[" + i + "][" + j + "]");
            }
        }}
        }__CLR4_5_29a69a6lvl9eiq6.R.inc(12186);boolean vps_timing_info_present_flag = r.readBool("vps_timing_info_present_flag");
        __CLR4_5_29a69a6lvl9eiq6.R.inc(12187);if ((((vps_timing_info_present_flag)&&(__CLR4_5_29a69a6lvl9eiq6.R.iget(12188)!=0|true))||(__CLR4_5_29a69a6lvl9eiq6.R.iget(12189)==0&false))) {{
            __CLR4_5_29a69a6lvl9eiq6.R.inc(12190);long vps_num_units_in_tick = r.readU(32, "vps_num_units_in_tick");
            __CLR4_5_29a69a6lvl9eiq6.R.inc(12191);long vps_time_scale = r.readU(32, "vps_time_scale");
            __CLR4_5_29a69a6lvl9eiq6.R.inc(12192);boolean vps_poc_proportional_to_timing_flag = r.readBool("vps_poc_proportional_to_timing_flag");
            __CLR4_5_29a69a6lvl9eiq6.R.inc(12193);if ((((vps_poc_proportional_to_timing_flag)&&(__CLR4_5_29a69a6lvl9eiq6.R.iget(12194)!=0|true))||(__CLR4_5_29a69a6lvl9eiq6.R.iget(12195)==0&false))) {{
                __CLR4_5_29a69a6lvl9eiq6.R.inc(12196);int vps_num_ticks_poc_diff_one_minus1 = r.readUE("vps_num_ticks_poc_diff_one_minus1");
            }
            }__CLR4_5_29a69a6lvl9eiq6.R.inc(12197);int vps_num_hrd_parameters = r.readUE("vps_num_hrd_parameters");
            __CLR4_5_29a69a6lvl9eiq6.R.inc(12198);int hrd_layer_set_idx[] = new int[vps_num_hrd_parameters];
            __CLR4_5_29a69a6lvl9eiq6.R.inc(12199);boolean cprms_present_flag[] = new boolean[vps_num_hrd_parameters];
            __CLR4_5_29a69a6lvl9eiq6.R.inc(12200);for (int i = 0; (((i < vps_num_hrd_parameters)&&(__CLR4_5_29a69a6lvl9eiq6.R.iget(12201)!=0|true))||(__CLR4_5_29a69a6lvl9eiq6.R.iget(12202)==0&false)); i++) {{
                __CLR4_5_29a69a6lvl9eiq6.R.inc(12203);hrd_layer_set_idx[i] = r.readUE("hrd_layer_set_idx[" + i + "]");
                __CLR4_5_29a69a6lvl9eiq6.R.inc(12204);if ((((i > 0)&&(__CLR4_5_29a69a6lvl9eiq6.R.iget(12205)!=0|true))||(__CLR4_5_29a69a6lvl9eiq6.R.iget(12206)==0&false))) {{
                    __CLR4_5_29a69a6lvl9eiq6.R.inc(12207);cprms_present_flag[i] = r.readBool("cprms_present_flag[" + i + "]");
                } }else {{
                    __CLR4_5_29a69a6lvl9eiq6.R.inc(12208);cprms_present_flag[0] = true;
                }

                }__CLR4_5_29a69a6lvl9eiq6.R.inc(12209);hrd_parameters(cprms_present_flag[i], vps_max_sub_layers_minus1, r);
            }
        }}

        }__CLR4_5_29a69a6lvl9eiq6.R.inc(12210);boolean vps_extension_flag = r.readBool("vps_extension_flag");
        __CLR4_5_29a69a6lvl9eiq6.R.inc(12211);if ((((vps_extension_flag)&&(__CLR4_5_29a69a6lvl9eiq6.R.iget(12212)!=0|true))||(__CLR4_5_29a69a6lvl9eiq6.R.iget(12213)==0&false))) {{
            __CLR4_5_29a69a6lvl9eiq6.R.inc(12214);while ((((r.moreRBSPData())&&(__CLR4_5_29a69a6lvl9eiq6.R.iget(12215)!=0|true))||(__CLR4_5_29a69a6lvl9eiq6.R.iget(12216)==0&false))) {{
                __CLR4_5_29a69a6lvl9eiq6.R.inc(12217);boolean vps_extension_data_flag = r.readBool("vps_extension_data_flag");
            }
        }}
        }__CLR4_5_29a69a6lvl9eiq6.R.inc(12218);r.readTrailingBits();
        __CLR4_5_29a69a6lvl9eiq6.R.inc(12219);return 0;
    }finally{__CLR4_5_29a69a6lvl9eiq6.R.flushNeeded();}}

    private void hrd_parameters(boolean commonInfPresentFlag, int maxNumSubLayersMinus1, CAVLCReader r) throws IOException {try{__CLR4_5_29a69a6lvl9eiq6.R.inc(12220);
        __CLR4_5_29a69a6lvl9eiq6.R.inc(12221);boolean nal_hrd_parameters_present_flag = false;
        __CLR4_5_29a69a6lvl9eiq6.R.inc(12222);boolean vcl_hrd_parameters_present_flag = false;
        __CLR4_5_29a69a6lvl9eiq6.R.inc(12223);boolean sub_pic_hrd_params_present_flag = false;
        __CLR4_5_29a69a6lvl9eiq6.R.inc(12224);if ((((commonInfPresentFlag)&&(__CLR4_5_29a69a6lvl9eiq6.R.iget(12225)!=0|true))||(__CLR4_5_29a69a6lvl9eiq6.R.iget(12226)==0&false))) {{
            __CLR4_5_29a69a6lvl9eiq6.R.inc(12227);nal_hrd_parameters_present_flag = r.readBool("nal_hrd_parameters_present_flag");
            __CLR4_5_29a69a6lvl9eiq6.R.inc(12228);vcl_hrd_parameters_present_flag = r.readBool("vcl_hrd_parameters_present_flag");
            __CLR4_5_29a69a6lvl9eiq6.R.inc(12229);if ((((nal_hrd_parameters_present_flag || vcl_hrd_parameters_present_flag)&&(__CLR4_5_29a69a6lvl9eiq6.R.iget(12230)!=0|true))||(__CLR4_5_29a69a6lvl9eiq6.R.iget(12231)==0&false))) {{
                __CLR4_5_29a69a6lvl9eiq6.R.inc(12232);sub_pic_hrd_params_present_flag = r.readBool("sub_pic_hrd_params_present_flag");
                __CLR4_5_29a69a6lvl9eiq6.R.inc(12233);if ((((sub_pic_hrd_params_present_flag)&&(__CLR4_5_29a69a6lvl9eiq6.R.iget(12234)!=0|true))||(__CLR4_5_29a69a6lvl9eiq6.R.iget(12235)==0&false))) {{
                    __CLR4_5_29a69a6lvl9eiq6.R.inc(12236);int tick_divisor_minus2 = r.readU(8, "tick_divisor_minus2");
                    __CLR4_5_29a69a6lvl9eiq6.R.inc(12237);int du_cpb_removal_delay_increment_length_minus1 = r.readU(5, "du_cpb_removal_delay_increment_length_minus1");
                    __CLR4_5_29a69a6lvl9eiq6.R.inc(12238);boolean sub_pic_cpb_params_in_pic_timing_sei_flag = r.readBool("sub_pic_cpb_params_in_pic_timing_sei_flag");
                    __CLR4_5_29a69a6lvl9eiq6.R.inc(12239);int dpb_output_delay_du_length_minus1 = r.readU(5, "dpb_output_delay_du_length_minus1");

                }
                }__CLR4_5_29a69a6lvl9eiq6.R.inc(12240);int bit_rate_scale = r.readU(4, "bit_rate_scale");
                __CLR4_5_29a69a6lvl9eiq6.R.inc(12241);int cpb_size_scale = r.readU(4, "cpb_size_scale");
                __CLR4_5_29a69a6lvl9eiq6.R.inc(12242);if ((((sub_pic_hrd_params_present_flag)&&(__CLR4_5_29a69a6lvl9eiq6.R.iget(12243)!=0|true))||(__CLR4_5_29a69a6lvl9eiq6.R.iget(12244)==0&false))) {{
                    __CLR4_5_29a69a6lvl9eiq6.R.inc(12245);int cpb_size_du_scale = r.readU(4, "cpb_size_du_scale");
                }
                }__CLR4_5_29a69a6lvl9eiq6.R.inc(12246);int initial_cpb_removal_delay_length_minus1 = r.readU(5, "initial_cpb_removal_delay_length_minus1");
                __CLR4_5_29a69a6lvl9eiq6.R.inc(12247);int au_cpb_removal_delay_length_minus1 = r.readU(5, "au_cpb_removal_delay_length_minus1");
                __CLR4_5_29a69a6lvl9eiq6.R.inc(12248);int dpb_output_delay_length_minus1 = r.readU(5, "dpb_output_delay_length_minus1");
            }
        }}
        }__CLR4_5_29a69a6lvl9eiq6.R.inc(12249);boolean fixed_pic_rate_general_flag[] = new boolean[maxNumSubLayersMinus1];
        __CLR4_5_29a69a6lvl9eiq6.R.inc(12250);boolean fixed_pic_rate_within_cvs_flag[] = new boolean[maxNumSubLayersMinus1];
        __CLR4_5_29a69a6lvl9eiq6.R.inc(12251);boolean low_delay_hrd_flag[] = new boolean[maxNumSubLayersMinus1];
        __CLR4_5_29a69a6lvl9eiq6.R.inc(12252);int cpb_cnt_minus1[] = new int[maxNumSubLayersMinus1];
        __CLR4_5_29a69a6lvl9eiq6.R.inc(12253);int elemental_duration_in_tc_minus1[] = new int[maxNumSubLayersMinus1];
        __CLR4_5_29a69a6lvl9eiq6.R.inc(12254);for (int i = 0; (((i <= maxNumSubLayersMinus1)&&(__CLR4_5_29a69a6lvl9eiq6.R.iget(12255)!=0|true))||(__CLR4_5_29a69a6lvl9eiq6.R.iget(12256)==0&false)); i++) {{
            __CLR4_5_29a69a6lvl9eiq6.R.inc(12257);fixed_pic_rate_general_flag[i] = r.readBool("fixed_pic_rate_general_flag[" + i + "]");
            __CLR4_5_29a69a6lvl9eiq6.R.inc(12258);if ((((!fixed_pic_rate_general_flag[i])&&(__CLR4_5_29a69a6lvl9eiq6.R.iget(12259)!=0|true))||(__CLR4_5_29a69a6lvl9eiq6.R.iget(12260)==0&false))) {{
                __CLR4_5_29a69a6lvl9eiq6.R.inc(12261);fixed_pic_rate_within_cvs_flag[i] = r.readBool("fixed_pic_rate_within_cvs_flag[" + i + "]");
            }
            }__CLR4_5_29a69a6lvl9eiq6.R.inc(12262);if ((((fixed_pic_rate_within_cvs_flag[i])&&(__CLR4_5_29a69a6lvl9eiq6.R.iget(12263)!=0|true))||(__CLR4_5_29a69a6lvl9eiq6.R.iget(12264)==0&false))) {{
                __CLR4_5_29a69a6lvl9eiq6.R.inc(12265);elemental_duration_in_tc_minus1[i] = r.readUE("elemental_duration_in_tc_minus1[" + i + "]");
            } }else {{
                __CLR4_5_29a69a6lvl9eiq6.R.inc(12266);low_delay_hrd_flag[i] = r.readBool("low_delay_hrd_flag[" + i + "]");
            }
            }__CLR4_5_29a69a6lvl9eiq6.R.inc(12267);if ((((!low_delay_hrd_flag[i])&&(__CLR4_5_29a69a6lvl9eiq6.R.iget(12268)!=0|true))||(__CLR4_5_29a69a6lvl9eiq6.R.iget(12269)==0&false))) {{
                __CLR4_5_29a69a6lvl9eiq6.R.inc(12270);cpb_cnt_minus1[i] = r.readUE("cpb_cnt_minus1[" + i + "]");
            }
            }__CLR4_5_29a69a6lvl9eiq6.R.inc(12271);if ((((nal_hrd_parameters_present_flag)&&(__CLR4_5_29a69a6lvl9eiq6.R.iget(12272)!=0|true))||(__CLR4_5_29a69a6lvl9eiq6.R.iget(12273)==0&false))) {{
                __CLR4_5_29a69a6lvl9eiq6.R.inc(12274);sub_layer_hrd_parameters(i, cpb_cnt_minus1[i], sub_pic_hrd_params_present_flag, r);
            }
            }__CLR4_5_29a69a6lvl9eiq6.R.inc(12275);if ((((vcl_hrd_parameters_present_flag)&&(__CLR4_5_29a69a6lvl9eiq6.R.iget(12276)!=0|true))||(__CLR4_5_29a69a6lvl9eiq6.R.iget(12277)==0&false))) {{
                __CLR4_5_29a69a6lvl9eiq6.R.inc(12278);sub_layer_hrd_parameters(i, cpb_cnt_minus1[i], sub_pic_hrd_params_present_flag, r);
            }
        }}

    }}finally{__CLR4_5_29a69a6lvl9eiq6.R.flushNeeded();}}

    void sub_layer_hrd_parameters(int subLayerId, int cpbCnt, boolean sub_pic_hrd_params_present_flag, CAVLCReader r) throws IOException {try{__CLR4_5_29a69a6lvl9eiq6.R.inc(12279);
        __CLR4_5_29a69a6lvl9eiq6.R.inc(12280);int bit_rate_value_minus1[] = new int[cpbCnt];
        __CLR4_5_29a69a6lvl9eiq6.R.inc(12281);int cpb_size_value_minus1[] = new int[cpbCnt];
        __CLR4_5_29a69a6lvl9eiq6.R.inc(12282);int cpb_size_du_value_minus1[] = new int[cpbCnt];
        __CLR4_5_29a69a6lvl9eiq6.R.inc(12283);int bit_rate_du_value_minus1[] = new int[cpbCnt];
        __CLR4_5_29a69a6lvl9eiq6.R.inc(12284);boolean cbr_flag[] = new boolean[cpbCnt];
        __CLR4_5_29a69a6lvl9eiq6.R.inc(12285);for (int i = 0; (((i <= cpbCnt)&&(__CLR4_5_29a69a6lvl9eiq6.R.iget(12286)!=0|true))||(__CLR4_5_29a69a6lvl9eiq6.R.iget(12287)==0&false)); i++) {{
            __CLR4_5_29a69a6lvl9eiq6.R.inc(12288);bit_rate_value_minus1[i] = r.readUE("bit_rate_value_minus1[" + i + "]");
            __CLR4_5_29a69a6lvl9eiq6.R.inc(12289);cpb_size_value_minus1[i] = r.readUE("cpb_size_value_minus1[" + i + "]");
            __CLR4_5_29a69a6lvl9eiq6.R.inc(12290);if ((((sub_pic_hrd_params_present_flag)&&(__CLR4_5_29a69a6lvl9eiq6.R.iget(12291)!=0|true))||(__CLR4_5_29a69a6lvl9eiq6.R.iget(12292)==0&false))) {{
                __CLR4_5_29a69a6lvl9eiq6.R.inc(12293);cpb_size_du_value_minus1[i] = r.readUE("cpb_size_du_value_minus1[" + i + "]");
                __CLR4_5_29a69a6lvl9eiq6.R.inc(12294);bit_rate_du_value_minus1[i] = r.readUE("bit_rate_du_value_minus1[" + i + "]");
            }
            }__CLR4_5_29a69a6lvl9eiq6.R.inc(12295);cbr_flag[i] = r.readBool("cbr_flag[" + i + "]");
        }
    }}finally{__CLR4_5_29a69a6lvl9eiq6.R.flushNeeded();}}

    private List<HevcDecoderConfigurationRecord.Array> getArrays() {try{__CLR4_5_29a69a6lvl9eiq6.R.inc(12296);
        __CLR4_5_29a69a6lvl9eiq6.R.inc(12297);HevcDecoderConfigurationRecord.Array vpsArray = new HevcDecoderConfigurationRecord.Array();
        __CLR4_5_29a69a6lvl9eiq6.R.inc(12298);vpsArray.array_completeness = true;
        __CLR4_5_29a69a6lvl9eiq6.R.inc(12299);vpsArray.nal_unit_type = VPS_NUT;
        __CLR4_5_29a69a6lvl9eiq6.R.inc(12300);vpsArray.nalUnits = new ArrayList<byte[]>();
        __CLR4_5_29a69a6lvl9eiq6.R.inc(12301);for (ByteBuffer byteBuffer : videoParamterSets.values()) {{
            __CLR4_5_29a69a6lvl9eiq6.R.inc(12302);byte[] ps = new byte[byteBuffer.limit()];
            __CLR4_5_29a69a6lvl9eiq6.R.inc(12303);byteBuffer.position(0);
            __CLR4_5_29a69a6lvl9eiq6.R.inc(12304);byteBuffer.get(ps);
            __CLR4_5_29a69a6lvl9eiq6.R.inc(12305);vpsArray.nalUnits.add(ps);
        }

        }__CLR4_5_29a69a6lvl9eiq6.R.inc(12306);HevcDecoderConfigurationRecord.Array spsArray = new HevcDecoderConfigurationRecord.Array();
        __CLR4_5_29a69a6lvl9eiq6.R.inc(12307);spsArray.array_completeness = true;
        __CLR4_5_29a69a6lvl9eiq6.R.inc(12308);spsArray.nal_unit_type = SPS_NUT;
        __CLR4_5_29a69a6lvl9eiq6.R.inc(12309);spsArray.nalUnits = new ArrayList<byte[]>();
        __CLR4_5_29a69a6lvl9eiq6.R.inc(12310);for (ByteBuffer byteBuffer : sequenceParamterSets.values()) {{
            __CLR4_5_29a69a6lvl9eiq6.R.inc(12311);byte[] ps = new byte[byteBuffer.limit()];
            __CLR4_5_29a69a6lvl9eiq6.R.inc(12312);byteBuffer.position(0);
            __CLR4_5_29a69a6lvl9eiq6.R.inc(12313);byteBuffer.get(ps);
            __CLR4_5_29a69a6lvl9eiq6.R.inc(12314);spsArray.nalUnits.add(ps);
        }

        }__CLR4_5_29a69a6lvl9eiq6.R.inc(12315);HevcDecoderConfigurationRecord.Array ppsArray = new HevcDecoderConfigurationRecord.Array();
        __CLR4_5_29a69a6lvl9eiq6.R.inc(12316);ppsArray.array_completeness = true;
        __CLR4_5_29a69a6lvl9eiq6.R.inc(12317);ppsArray.nal_unit_type = SPS_NUT;
        __CLR4_5_29a69a6lvl9eiq6.R.inc(12318);ppsArray.nalUnits = new ArrayList<byte[]>();
        __CLR4_5_29a69a6lvl9eiq6.R.inc(12319);for (ByteBuffer byteBuffer : pictureParamterSets.values()) {{
            __CLR4_5_29a69a6lvl9eiq6.R.inc(12320);byte[] ps = new byte[byteBuffer.limit()];
            __CLR4_5_29a69a6lvl9eiq6.R.inc(12321);byteBuffer.position(0);
            __CLR4_5_29a69a6lvl9eiq6.R.inc(12322);byteBuffer.get(ps);
            __CLR4_5_29a69a6lvl9eiq6.R.inc(12323);ppsArray.nalUnits.add(ps);
        }
        }__CLR4_5_29a69a6lvl9eiq6.R.inc(12324);return Arrays.asList(vpsArray, spsArray, ppsArray);
    }finally{__CLR4_5_29a69a6lvl9eiq6.R.flushNeeded();}}

    boolean isFirstOfAU(int nalUnitType, ByteBuffer nalUnit, List<ByteBuffer> accessUnit) {try{__CLR4_5_29a69a6lvl9eiq6.R.inc(12325);
        __CLR4_5_29a69a6lvl9eiq6.R.inc(12326);if ((((accessUnit.isEmpty())&&(__CLR4_5_29a69a6lvl9eiq6.R.iget(12327)!=0|true))||(__CLR4_5_29a69a6lvl9eiq6.R.iget(12328)==0&false))) {{
            __CLR4_5_29a69a6lvl9eiq6.R.inc(12329);return true;
        }
        }__CLR4_5_29a69a6lvl9eiq6.R.inc(12330);boolean vclPresentInCurrentAU = getNalUnitHeader(accessUnit.get(accessUnit.size() - 1)).nalUnitType <= 31;
        boolean __CLB4_5_2_bool1=false;__CLR4_5_29a69a6lvl9eiq6.R.inc(12331);switch (nalUnitType) {
            case VPS_NUT:if (!__CLB4_5_2_bool1) {__CLR4_5_29a69a6lvl9eiq6.R.inc(12332);__CLB4_5_2_bool1=true;}
            case SPS_NUT:if (!__CLB4_5_2_bool1) {__CLR4_5_29a69a6lvl9eiq6.R.inc(12333);__CLB4_5_2_bool1=true;}
            case PPS_NUT:if (!__CLB4_5_2_bool1) {__CLR4_5_29a69a6lvl9eiq6.R.inc(12334);__CLB4_5_2_bool1=true;}
            case AUD_NUT:if (!__CLB4_5_2_bool1) {__CLR4_5_29a69a6lvl9eiq6.R.inc(12335);__CLB4_5_2_bool1=true;}
            case PREFIX_SEI_NUT:if (!__CLB4_5_2_bool1) {__CLR4_5_29a69a6lvl9eiq6.R.inc(12336);__CLB4_5_2_bool1=true;}
            case RSV_NVCL41:if (!__CLB4_5_2_bool1) {__CLR4_5_29a69a6lvl9eiq6.R.inc(12337);__CLB4_5_2_bool1=true;}
            case RSV_NVCL42:if (!__CLB4_5_2_bool1) {__CLR4_5_29a69a6lvl9eiq6.R.inc(12338);__CLB4_5_2_bool1=true;}
            case RSV_NVCL43:if (!__CLB4_5_2_bool1) {__CLR4_5_29a69a6lvl9eiq6.R.inc(12339);__CLB4_5_2_bool1=true;}
            case RSV_NVCL44:if (!__CLB4_5_2_bool1) {__CLR4_5_29a69a6lvl9eiq6.R.inc(12340);__CLB4_5_2_bool1=true;}
            case UNSPEC48:if (!__CLB4_5_2_bool1) {__CLR4_5_29a69a6lvl9eiq6.R.inc(12341);__CLB4_5_2_bool1=true;}
            case UNSPEC49:if (!__CLB4_5_2_bool1) {__CLR4_5_29a69a6lvl9eiq6.R.inc(12342);__CLB4_5_2_bool1=true;}
            case UNSPEC50:if (!__CLB4_5_2_bool1) {__CLR4_5_29a69a6lvl9eiq6.R.inc(12343);__CLB4_5_2_bool1=true;}
            case UNSPEC51:if (!__CLB4_5_2_bool1) {__CLR4_5_29a69a6lvl9eiq6.R.inc(12344);__CLB4_5_2_bool1=true;}
            case UNSPEC52:if (!__CLB4_5_2_bool1) {__CLR4_5_29a69a6lvl9eiq6.R.inc(12345);__CLB4_5_2_bool1=true;}
            case UNSPEC53:if (!__CLB4_5_2_bool1) {__CLR4_5_29a69a6lvl9eiq6.R.inc(12346);__CLB4_5_2_bool1=true;}
            case UNSPEC54:if (!__CLB4_5_2_bool1) {__CLR4_5_29a69a6lvl9eiq6.R.inc(12347);__CLB4_5_2_bool1=true;}
            case UNSPEC55:if (!__CLB4_5_2_bool1) {__CLR4_5_29a69a6lvl9eiq6.R.inc(12348);__CLB4_5_2_bool1=true;}
                __CLR4_5_29a69a6lvl9eiq6.R.inc(12349);if ((((vclPresentInCurrentAU)&&(__CLR4_5_29a69a6lvl9eiq6.R.iget(12350)!=0|true))||(__CLR4_5_29a69a6lvl9eiq6.R.iget(12351)==0&false))) {{
                    __CLR4_5_29a69a6lvl9eiq6.R.inc(12352);return true;
                }
        }}
        boolean __CLB4_5_2_bool2=false;__CLR4_5_29a69a6lvl9eiq6.R.inc(12353);switch (nalUnitType) {
            case TRAIL_N:if (!__CLB4_5_2_bool2) {__CLR4_5_29a69a6lvl9eiq6.R.inc(12354);__CLB4_5_2_bool2=true;}
            case TRAIL_R:if (!__CLB4_5_2_bool2) {__CLR4_5_29a69a6lvl9eiq6.R.inc(12355);__CLB4_5_2_bool2=true;}
            case TSA_N:if (!__CLB4_5_2_bool2) {__CLR4_5_29a69a6lvl9eiq6.R.inc(12356);__CLB4_5_2_bool2=true;}
            case TSA_R:if (!__CLB4_5_2_bool2) {__CLR4_5_29a69a6lvl9eiq6.R.inc(12357);__CLB4_5_2_bool2=true;}
            case STSA_N:if (!__CLB4_5_2_bool2) {__CLR4_5_29a69a6lvl9eiq6.R.inc(12358);__CLB4_5_2_bool2=true;}
            case STSA_R:if (!__CLB4_5_2_bool2) {__CLR4_5_29a69a6lvl9eiq6.R.inc(12359);__CLB4_5_2_bool2=true;}
            case RADL_N:if (!__CLB4_5_2_bool2) {__CLR4_5_29a69a6lvl9eiq6.R.inc(12360);__CLB4_5_2_bool2=true;}
            case RADL_R:if (!__CLB4_5_2_bool2) {__CLR4_5_29a69a6lvl9eiq6.R.inc(12361);__CLB4_5_2_bool2=true;}
            case RASL_N:if (!__CLB4_5_2_bool2) {__CLR4_5_29a69a6lvl9eiq6.R.inc(12362);__CLB4_5_2_bool2=true;}
            case RASL_R:if (!__CLB4_5_2_bool2) {__CLR4_5_29a69a6lvl9eiq6.R.inc(12363);__CLB4_5_2_bool2=true;}
            case BLA_W_LP:if (!__CLB4_5_2_bool2) {__CLR4_5_29a69a6lvl9eiq6.R.inc(12364);__CLB4_5_2_bool2=true;}
            case BLA_W_RADL:if (!__CLB4_5_2_bool2) {__CLR4_5_29a69a6lvl9eiq6.R.inc(12365);__CLB4_5_2_bool2=true;}
            case BLA_N_LP:if (!__CLB4_5_2_bool2) {__CLR4_5_29a69a6lvl9eiq6.R.inc(12366);__CLB4_5_2_bool2=true;}
            case IDR_W_RADL:if (!__CLB4_5_2_bool2) {__CLR4_5_29a69a6lvl9eiq6.R.inc(12367);__CLB4_5_2_bool2=true;}
            case IDR_N_LP:if (!__CLB4_5_2_bool2) {__CLR4_5_29a69a6lvl9eiq6.R.inc(12368);__CLB4_5_2_bool2=true;}
            case CRA_NUT:if (!__CLB4_5_2_bool2) {__CLR4_5_29a69a6lvl9eiq6.R.inc(12369);__CLB4_5_2_bool2=true;}
                __CLR4_5_29a69a6lvl9eiq6.R.inc(12370);byte b[] = new byte[50];
                __CLR4_5_29a69a6lvl9eiq6.R.inc(12371);nalUnit.position(0);
                __CLR4_5_29a69a6lvl9eiq6.R.inc(12372);nalUnit.get(b);
                __CLR4_5_29a69a6lvl9eiq6.R.inc(12373);nalUnit.position(2);
                __CLR4_5_29a69a6lvl9eiq6.R.inc(12374);int firstRsbp8Bit = IsoTypeReader.readUInt8(nalUnit);

                __CLR4_5_29a69a6lvl9eiq6.R.inc(12375);return vclPresentInCurrentAU && (firstRsbp8Bit & 0x80) > 0;
        }
        __CLR4_5_29a69a6lvl9eiq6.R.inc(12376);return false;
    }finally{__CLR4_5_29a69a6lvl9eiq6.R.flushNeeded();}}

    public NalUnitHeader getNalUnitHeader(ByteBuffer nal) {try{__CLR4_5_29a69a6lvl9eiq6.R.inc(12377);
        __CLR4_5_29a69a6lvl9eiq6.R.inc(12378);nal.position(0);
        __CLR4_5_29a69a6lvl9eiq6.R.inc(12379);int nal_unit_header = IsoTypeReader.readUInt16(nal);


        __CLR4_5_29a69a6lvl9eiq6.R.inc(12380);NalUnitHeader nalUnitHeader = new NalUnitHeader();
        __CLR4_5_29a69a6lvl9eiq6.R.inc(12381);nalUnitHeader.forbiddenZeroFlag = (nal_unit_header & 0x8000) >> 15;
        __CLR4_5_29a69a6lvl9eiq6.R.inc(12382);nalUnitHeader.nalUnitType = (nal_unit_header & 0x7E00) >> 9;
        __CLR4_5_29a69a6lvl9eiq6.R.inc(12383);nalUnitHeader.nuhLayerId = (nal_unit_header & 0x1F8) >> 3;
        __CLR4_5_29a69a6lvl9eiq6.R.inc(12384);nalUnitHeader.nuhTemporalIdPlusOne = (nal_unit_header & 0x7);
        __CLR4_5_29a69a6lvl9eiq6.R.inc(12385);return nalUnitHeader;
    }finally{__CLR4_5_29a69a6lvl9eiq6.R.flushNeeded();}}

    protected Sample createSample(List<ByteBuffer> nals) {try{__CLR4_5_29a69a6lvl9eiq6.R.inc(12386);
        __CLR4_5_29a69a6lvl9eiq6.R.inc(12387);byte[] sizeInfo = new byte[nals.size() * 4];
        __CLR4_5_29a69a6lvl9eiq6.R.inc(12388);ByteBuffer sizeBuf = ByteBuffer.wrap(sizeInfo);
        __CLR4_5_29a69a6lvl9eiq6.R.inc(12389);for (ByteBuffer b : nals) {{
            __CLR4_5_29a69a6lvl9eiq6.R.inc(12390);sizeBuf.putInt(b.remaining());
        }

        }__CLR4_5_29a69a6lvl9eiq6.R.inc(12391);ByteBuffer[] data = new ByteBuffer[nals.size() * 2];

        __CLR4_5_29a69a6lvl9eiq6.R.inc(12392);for (int i = 0; (((i < nals.size())&&(__CLR4_5_29a69a6lvl9eiq6.R.iget(12393)!=0|true))||(__CLR4_5_29a69a6lvl9eiq6.R.iget(12394)==0&false)); i++) {{
            __CLR4_5_29a69a6lvl9eiq6.R.inc(12395);data[2 * i] = ByteBuffer.wrap(sizeInfo, i * 4, 4);
            __CLR4_5_29a69a6lvl9eiq6.R.inc(12396);data[2 * i + 1] = nals.get(i);
        }

        }__CLR4_5_29a69a6lvl9eiq6.R.inc(12397);return new SampleImpl(data);
    }finally{__CLR4_5_29a69a6lvl9eiq6.R.flushNeeded();}}

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

        LookAhead(DataSource dataSource) throws IOException {try{__CLR4_5_29a69a6lvl9eiq6.R.inc(12398);
            __CLR4_5_29a69a6lvl9eiq6.R.inc(12399);this.dataSource = dataSource;
            __CLR4_5_29a69a6lvl9eiq6.R.inc(12400);fillBuffer();
        }finally{__CLR4_5_29a69a6lvl9eiq6.R.flushNeeded();}}

        public void fillBuffer() throws IOException {try{__CLR4_5_29a69a6lvl9eiq6.R.inc(12401);
            __CLR4_5_29a69a6lvl9eiq6.R.inc(12402);buffer = dataSource.map(bufferStartPos, Math.min(dataSource.size() - bufferStartPos, BUFFER));
        }finally{__CLR4_5_29a69a6lvl9eiq6.R.flushNeeded();}}

        boolean nextThreeEquals001() throws IOException {try{__CLR4_5_29a69a6lvl9eiq6.R.inc(12403);
            __CLR4_5_29a69a6lvl9eiq6.R.inc(12404);if ((((buffer.limit() - inBufferPos >= 3)&&(__CLR4_5_29a69a6lvl9eiq6.R.iget(12405)!=0|true))||(__CLR4_5_29a69a6lvl9eiq6.R.iget(12406)==0&false))) {{
                __CLR4_5_29a69a6lvl9eiq6.R.inc(12407);return (buffer.get(inBufferPos) == 0 &&
                        buffer.get(inBufferPos + 1) == 0 &&
                        buffer.get(inBufferPos + 2) == 1);
            } }else {{
                __CLR4_5_29a69a6lvl9eiq6.R.inc(12408);if ((((bufferStartPos + inBufferPos == dataSource.size())&&(__CLR4_5_29a69a6lvl9eiq6.R.iget(12409)!=0|true))||(__CLR4_5_29a69a6lvl9eiq6.R.iget(12410)==0&false))) {{
                    __CLR4_5_29a69a6lvl9eiq6.R.inc(12411);throw new EOFException();
                }
                }__CLR4_5_29a69a6lvl9eiq6.R.inc(12412);throw new RuntimeException("buffer repositioning require");
            }
        }}finally{__CLR4_5_29a69a6lvl9eiq6.R.flushNeeded();}}

        boolean nextThreeEquals000or001orEof() throws IOException {try{__CLR4_5_29a69a6lvl9eiq6.R.inc(12413);
            __CLR4_5_29a69a6lvl9eiq6.R.inc(12414);if ((((buffer.limit() - inBufferPos >= 3)&&(__CLR4_5_29a69a6lvl9eiq6.R.iget(12415)!=0|true))||(__CLR4_5_29a69a6lvl9eiq6.R.iget(12416)==0&false))) {{
                __CLR4_5_29a69a6lvl9eiq6.R.inc(12417);return ((buffer.get(inBufferPos) == 0 &&
                        buffer.get(inBufferPos + 1) == 0 &&
                        (buffer.get(inBufferPos + 2) == 0 || buffer.get(inBufferPos + 2) == 1)));
            } }else {{
                __CLR4_5_29a69a6lvl9eiq6.R.inc(12418);if ((((bufferStartPos + inBufferPos + 3 > dataSource.size())&&(__CLR4_5_29a69a6lvl9eiq6.R.iget(12419)!=0|true))||(__CLR4_5_29a69a6lvl9eiq6.R.iget(12420)==0&false))) {{
                    __CLR4_5_29a69a6lvl9eiq6.R.inc(12421);return bufferStartPos + inBufferPos == dataSource.size();
                } }else {{
                    __CLR4_5_29a69a6lvl9eiq6.R.inc(12422);bufferStartPos = start;
                    __CLR4_5_29a69a6lvl9eiq6.R.inc(12423);inBufferPos = 0;
                    __CLR4_5_29a69a6lvl9eiq6.R.inc(12424);fillBuffer();
                    __CLR4_5_29a69a6lvl9eiq6.R.inc(12425);return nextThreeEquals000or001orEof();
                }
            }}
        }}finally{__CLR4_5_29a69a6lvl9eiq6.R.flushNeeded();}}

        void discardByte() {try{__CLR4_5_29a69a6lvl9eiq6.R.inc(12426);
            __CLR4_5_29a69a6lvl9eiq6.R.inc(12427);inBufferPos++;
        }finally{__CLR4_5_29a69a6lvl9eiq6.R.flushNeeded();}}

        void discardNext3AndMarkStart() {try{__CLR4_5_29a69a6lvl9eiq6.R.inc(12428);
            __CLR4_5_29a69a6lvl9eiq6.R.inc(12429);inBufferPos += 3;
            __CLR4_5_29a69a6lvl9eiq6.R.inc(12430);start = bufferStartPos + inBufferPos;
        }finally{__CLR4_5_29a69a6lvl9eiq6.R.flushNeeded();}}

        public ByteBuffer getNal() {try{__CLR4_5_29a69a6lvl9eiq6.R.inc(12431);
            __CLR4_5_29a69a6lvl9eiq6.R.inc(12432);if ((((start >= bufferStartPos)&&(__CLR4_5_29a69a6lvl9eiq6.R.iget(12433)!=0|true))||(__CLR4_5_29a69a6lvl9eiq6.R.iget(12434)==0&false))) {{
                __CLR4_5_29a69a6lvl9eiq6.R.inc(12435);buffer.position((int) (start - bufferStartPos));
                __CLR4_5_29a69a6lvl9eiq6.R.inc(12436);Buffer sample = buffer.slice();
                __CLR4_5_29a69a6lvl9eiq6.R.inc(12437);sample.limit((int) (inBufferPos - (start - bufferStartPos)));
                __CLR4_5_29a69a6lvl9eiq6.R.inc(12438);return (ByteBuffer) sample;
            } }else {{
                __CLR4_5_29a69a6lvl9eiq6.R.inc(12439);throw new RuntimeException("damn! NAL exceeds buffer");
                // this can only happen if NAL is bigger than the buffer
            }

        }}finally{__CLR4_5_29a69a6lvl9eiq6.R.flushNeeded();}}
    }
}
