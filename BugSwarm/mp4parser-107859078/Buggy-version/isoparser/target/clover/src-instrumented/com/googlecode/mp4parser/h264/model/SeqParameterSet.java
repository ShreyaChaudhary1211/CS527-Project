/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
Copyright (c) 2011 Stanislav Vitvitskiy

Permission is hereby granted, free of charge, to any person obtaining a copy of this
software and associated documentation files (the "Software"), to deal in the Software
without restriction, including without limitation the rights to use, copy, modify,
merge, publish, distribute, sublicense, and/or sell copies of the Software, and to
permit persons to whom the Software is furnished to do so, subject to the following
conditions:

The above copyright notice and this permission notice shall be included in all copies or
substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED,
INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR
PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE
FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT,
TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE
OR OTHER DEALINGS IN THE SOFTWARE.
*/
package com.googlecode.mp4parser.h264.model;

import com.googlecode.mp4parser.h264.read.CAVLCReader;
import com.googlecode.mp4parser.h264.write.CAVLCWriter;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Sequence Parameter Set structure of h264 bitstream
 * <p>
 * capable to serialize and deserialize with CAVLC bitstream</p>
 *
 * @author Stanislav Vitvitskiy
 */
public class SeqParameterSet extends BitstreamElement {public static class __CLR4_5_2ey2ey2lvl9ektp{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,19717,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public int pic_order_cnt_type;
    public boolean field_pic_flag;
    public boolean delta_pic_order_always_zero_flag;
    public boolean weighted_pred_flag;
    public int weighted_bipred_idc;
    public boolean entropy_coding_mode_flag;
    public boolean mb_adaptive_frame_field_flag;
    public boolean direct_8x8_inference_flag;
    public ChromaFormat chroma_format_idc;
    public int log2_max_frame_num_minus4;
    public int log2_max_pic_order_cnt_lsb_minus4;
    public int pic_height_in_map_units_minus1;
    public int pic_width_in_mbs_minus1;
    public int bit_depth_luma_minus8;
    public int bit_depth_chroma_minus8;
    public boolean qpprime_y_zero_transform_bypass_flag;
    public int profile_idc;
    public long reserved_zero_2bits;
    public boolean constraint_set_0_flag;
    public boolean constraint_set_1_flag;
    public boolean constraint_set_2_flag;
    public boolean constraint_set_3_flag;
    public boolean constraint_set_4_flag;
    public boolean constraint_set_5_flag;
    public int level_idc;
    public int seq_parameter_set_id;
    public boolean residual_color_transform_flag;
    public int offset_for_non_ref_pic;
    public int offset_for_top_to_bottom_field;
    public int num_ref_frames;
    public boolean gaps_in_frame_num_value_allowed_flag;
    public boolean frame_mbs_only_flag;
    public boolean frame_cropping_flag;
    public int frame_crop_left_offset;
    public int frame_crop_right_offset;
    public int frame_crop_top_offset;
    public int frame_crop_bottom_offset;
    public int[] offsetForRefFrame;
    public VUIParameters vuiParams;
    public ScalingMatrix scalingMatrix;
    public int num_ref_frames_in_pic_order_cnt_cycle;


    public static SeqParameterSet read(byte[] b) throws IOException {try{__CLR4_5_2ey2ey2lvl9ektp.R.inc(19370);
        __CLR4_5_2ey2ey2lvl9ektp.R.inc(19371);return read(new ByteArrayInputStream(b));
    }finally{__CLR4_5_2ey2ey2lvl9ektp.R.flushNeeded();}}

    public static SeqParameterSet read(InputStream is) throws IOException {try{__CLR4_5_2ey2ey2lvl9ektp.R.inc(19372);
        __CLR4_5_2ey2ey2lvl9ektp.R.inc(19373);CAVLCReader reader = new CAVLCReader(is);
        __CLR4_5_2ey2ey2lvl9ektp.R.inc(19374);SeqParameterSet sps = new SeqParameterSet();

        __CLR4_5_2ey2ey2lvl9ektp.R.inc(19375);sps.profile_idc = (int) reader.readNBit(8, "SPS: profile_idc");
        __CLR4_5_2ey2ey2lvl9ektp.R.inc(19376);sps.constraint_set_0_flag = reader
                .readBool("SPS: constraint_set_0_flag");
        __CLR4_5_2ey2ey2lvl9ektp.R.inc(19377);sps.constraint_set_1_flag = reader
                .readBool("SPS: constraint_set_1_flag");
        __CLR4_5_2ey2ey2lvl9ektp.R.inc(19378);sps.constraint_set_2_flag = reader
                .readBool("SPS: constraint_set_2_flag");
        __CLR4_5_2ey2ey2lvl9ektp.R.inc(19379);sps.constraint_set_3_flag = reader
                .readBool("SPS: constraint_set_3_flag");
        __CLR4_5_2ey2ey2lvl9ektp.R.inc(19380);sps.constraint_set_4_flag = reader
                .readBool("SPS: constraint_set_4_flag");
        __CLR4_5_2ey2ey2lvl9ektp.R.inc(19381);sps.constraint_set_5_flag = reader
                .readBool("SPS: constraint_set_5_flag");

        __CLR4_5_2ey2ey2lvl9ektp.R.inc(19382);sps.reserved_zero_2bits = reader.readNBit(2, "SPS: reserved_zero_2bits");
        __CLR4_5_2ey2ey2lvl9ektp.R.inc(19383);sps.level_idc = (int) reader.readNBit(8, "SPS: level_idc");
        __CLR4_5_2ey2ey2lvl9ektp.R.inc(19384);sps.seq_parameter_set_id = reader.readUE("SPS: seq_parameter_set_id");

        __CLR4_5_2ey2ey2lvl9ektp.R.inc(19385);if ((((sps.profile_idc == 100 || sps.profile_idc == 110
                || sps.profile_idc == 122 || sps.profile_idc == 144)&&(__CLR4_5_2ey2ey2lvl9ektp.R.iget(19386)!=0|true))||(__CLR4_5_2ey2ey2lvl9ektp.R.iget(19387)==0&false))) {{
            __CLR4_5_2ey2ey2lvl9ektp.R.inc(19388);sps.chroma_format_idc = ChromaFormat.fromId(reader
                    .readUE("SPS: chroma_format_idc"));
            __CLR4_5_2ey2ey2lvl9ektp.R.inc(19389);if ((((sps.chroma_format_idc == ChromaFormat.YUV_444)&&(__CLR4_5_2ey2ey2lvl9ektp.R.iget(19390)!=0|true))||(__CLR4_5_2ey2ey2lvl9ektp.R.iget(19391)==0&false))) {{
                __CLR4_5_2ey2ey2lvl9ektp.R.inc(19392);sps.residual_color_transform_flag = reader
                        .readBool("SPS: residual_color_transform_flag");
            }
            }__CLR4_5_2ey2ey2lvl9ektp.R.inc(19393);sps.bit_depth_luma_minus8 = reader
                    .readUE("SPS: bit_depth_luma_minus8");
            __CLR4_5_2ey2ey2lvl9ektp.R.inc(19394);sps.bit_depth_chroma_minus8 = reader
                    .readUE("SPS: bit_depth_chroma_minus8");
            __CLR4_5_2ey2ey2lvl9ektp.R.inc(19395);sps.qpprime_y_zero_transform_bypass_flag = reader
                    .readBool("SPS: qpprime_y_zero_transform_bypass_flag");
            __CLR4_5_2ey2ey2lvl9ektp.R.inc(19396);boolean seqScalingMatrixPresent = reader
                    .readBool("SPS: seq_scaling_matrix_present_lag");
            __CLR4_5_2ey2ey2lvl9ektp.R.inc(19397);if ((((seqScalingMatrixPresent)&&(__CLR4_5_2ey2ey2lvl9ektp.R.iget(19398)!=0|true))||(__CLR4_5_2ey2ey2lvl9ektp.R.iget(19399)==0&false))) {{
                __CLR4_5_2ey2ey2lvl9ektp.R.inc(19400);readScalingListMatrix(reader, sps);
            }
        }} }else {{
            __CLR4_5_2ey2ey2lvl9ektp.R.inc(19401);sps.chroma_format_idc = ChromaFormat.YUV_420;
        }
        }__CLR4_5_2ey2ey2lvl9ektp.R.inc(19402);sps.log2_max_frame_num_minus4 = reader
                .readUE("SPS: log2_max_frame_num_minus4");
        __CLR4_5_2ey2ey2lvl9ektp.R.inc(19403);sps.pic_order_cnt_type = reader.readUE("SPS: pic_order_cnt_type");
        __CLR4_5_2ey2ey2lvl9ektp.R.inc(19404);if ((((sps.pic_order_cnt_type == 0)&&(__CLR4_5_2ey2ey2lvl9ektp.R.iget(19405)!=0|true))||(__CLR4_5_2ey2ey2lvl9ektp.R.iget(19406)==0&false))) {{
            __CLR4_5_2ey2ey2lvl9ektp.R.inc(19407);sps.log2_max_pic_order_cnt_lsb_minus4 = reader
                    .readUE("SPS: log2_max_pic_order_cnt_lsb_minus4");
        } }else {__CLR4_5_2ey2ey2lvl9ektp.R.inc(19408);if ((((sps.pic_order_cnt_type == 1)&&(__CLR4_5_2ey2ey2lvl9ektp.R.iget(19409)!=0|true))||(__CLR4_5_2ey2ey2lvl9ektp.R.iget(19410)==0&false))) {{
            __CLR4_5_2ey2ey2lvl9ektp.R.inc(19411);sps.delta_pic_order_always_zero_flag = reader
                    .readBool("SPS: delta_pic_order_always_zero_flag");
            __CLR4_5_2ey2ey2lvl9ektp.R.inc(19412);sps.offset_for_non_ref_pic = reader
                    .readSE("SPS: offset_for_non_ref_pic");
            __CLR4_5_2ey2ey2lvl9ektp.R.inc(19413);sps.offset_for_top_to_bottom_field = reader
                    .readSE("SPS: offset_for_top_to_bottom_field");
            __CLR4_5_2ey2ey2lvl9ektp.R.inc(19414);sps.num_ref_frames_in_pic_order_cnt_cycle = reader
                    .readUE("SPS: num_ref_frames_in_pic_order_cnt_cycle");
            __CLR4_5_2ey2ey2lvl9ektp.R.inc(19415);sps.offsetForRefFrame = new int[sps.num_ref_frames_in_pic_order_cnt_cycle];
            __CLR4_5_2ey2ey2lvl9ektp.R.inc(19416);for (int i = 0; (((i < sps.num_ref_frames_in_pic_order_cnt_cycle)&&(__CLR4_5_2ey2ey2lvl9ektp.R.iget(19417)!=0|true))||(__CLR4_5_2ey2ey2lvl9ektp.R.iget(19418)==0&false)); i++) {{
                __CLR4_5_2ey2ey2lvl9ektp.R.inc(19419);sps.offsetForRefFrame[i] = reader
                        .readSE("SPS: offsetForRefFrame [" + i + "]");
            }
        }}
        }}__CLR4_5_2ey2ey2lvl9ektp.R.inc(19420);sps.num_ref_frames = reader.readUE("SPS: num_ref_frames");
        __CLR4_5_2ey2ey2lvl9ektp.R.inc(19421);sps.gaps_in_frame_num_value_allowed_flag = reader
                .readBool("SPS: gaps_in_frame_num_value_allowed_flag");
        __CLR4_5_2ey2ey2lvl9ektp.R.inc(19422);sps.pic_width_in_mbs_minus1 = reader
                .readUE("SPS: pic_width_in_mbs_minus1");
        __CLR4_5_2ey2ey2lvl9ektp.R.inc(19423);sps.pic_height_in_map_units_minus1 = reader
                .readUE("SPS: pic_height_in_map_units_minus1");
        __CLR4_5_2ey2ey2lvl9ektp.R.inc(19424);sps.frame_mbs_only_flag = reader.readBool("SPS: frame_mbs_only_flag");
        __CLR4_5_2ey2ey2lvl9ektp.R.inc(19425);if ((((!sps.frame_mbs_only_flag)&&(__CLR4_5_2ey2ey2lvl9ektp.R.iget(19426)!=0|true))||(__CLR4_5_2ey2ey2lvl9ektp.R.iget(19427)==0&false))) {{
            __CLR4_5_2ey2ey2lvl9ektp.R.inc(19428);sps.mb_adaptive_frame_field_flag = reader
                    .readBool("SPS: mb_adaptive_frame_field_flag");
        }
        }__CLR4_5_2ey2ey2lvl9ektp.R.inc(19429);sps.direct_8x8_inference_flag = reader
                .readBool("SPS: direct_8x8_inference_flag");
        __CLR4_5_2ey2ey2lvl9ektp.R.inc(19430);sps.frame_cropping_flag = reader.readBool("SPS: frame_cropping_flag");
        __CLR4_5_2ey2ey2lvl9ektp.R.inc(19431);if ((((sps.frame_cropping_flag)&&(__CLR4_5_2ey2ey2lvl9ektp.R.iget(19432)!=0|true))||(__CLR4_5_2ey2ey2lvl9ektp.R.iget(19433)==0&false))) {{
            __CLR4_5_2ey2ey2lvl9ektp.R.inc(19434);sps.frame_crop_left_offset = reader
                    .readUE("SPS: frame_crop_left_offset");
            __CLR4_5_2ey2ey2lvl9ektp.R.inc(19435);sps.frame_crop_right_offset = reader
                    .readUE("SPS: frame_crop_right_offset");
            __CLR4_5_2ey2ey2lvl9ektp.R.inc(19436);sps.frame_crop_top_offset = reader
                    .readUE("SPS: frame_crop_top_offset");
            __CLR4_5_2ey2ey2lvl9ektp.R.inc(19437);sps.frame_crop_bottom_offset = reader
                    .readUE("SPS: frame_crop_bottom_offset");
        }
        }__CLR4_5_2ey2ey2lvl9ektp.R.inc(19438);boolean vui_parameters_present_flag = reader
                .readBool("SPS: vui_parameters_present_flag");
        __CLR4_5_2ey2ey2lvl9ektp.R.inc(19439);if ((((vui_parameters_present_flag)&&(__CLR4_5_2ey2ey2lvl9ektp.R.iget(19440)!=0|true))||(__CLR4_5_2ey2ey2lvl9ektp.R.iget(19441)==0&false)))
            {__CLR4_5_2ey2ey2lvl9ektp.R.inc(19442);sps.vuiParams = ReadVUIParameters(reader);

        }__CLR4_5_2ey2ey2lvl9ektp.R.inc(19443);reader.readTrailingBits();

        __CLR4_5_2ey2ey2lvl9ektp.R.inc(19444);return sps;
    }finally{__CLR4_5_2ey2ey2lvl9ektp.R.flushNeeded();}}

    private static void readScalingListMatrix(CAVLCReader reader,
                                              SeqParameterSet sps) throws IOException {try{__CLR4_5_2ey2ey2lvl9ektp.R.inc(19445);
        __CLR4_5_2ey2ey2lvl9ektp.R.inc(19446);sps.scalingMatrix = new ScalingMatrix();
        __CLR4_5_2ey2ey2lvl9ektp.R.inc(19447);for (int i = 0; (((i < 8)&&(__CLR4_5_2ey2ey2lvl9ektp.R.iget(19448)!=0|true))||(__CLR4_5_2ey2ey2lvl9ektp.R.iget(19449)==0&false)); i++) {{
            __CLR4_5_2ey2ey2lvl9ektp.R.inc(19450);boolean seqScalingListPresentFlag = reader
                    .readBool("SPS: seqScalingListPresentFlag");
            __CLR4_5_2ey2ey2lvl9ektp.R.inc(19451);if ((((seqScalingListPresentFlag)&&(__CLR4_5_2ey2ey2lvl9ektp.R.iget(19452)!=0|true))||(__CLR4_5_2ey2ey2lvl9ektp.R.iget(19453)==0&false))) {{
                __CLR4_5_2ey2ey2lvl9ektp.R.inc(19454);sps.scalingMatrix.ScalingList4x4 = new ScalingList[8];
                __CLR4_5_2ey2ey2lvl9ektp.R.inc(19455);sps.scalingMatrix.ScalingList8x8 = new ScalingList[8];
                __CLR4_5_2ey2ey2lvl9ektp.R.inc(19456);if ((((i < 6)&&(__CLR4_5_2ey2ey2lvl9ektp.R.iget(19457)!=0|true))||(__CLR4_5_2ey2ey2lvl9ektp.R.iget(19458)==0&false))) {{
                    __CLR4_5_2ey2ey2lvl9ektp.R.inc(19459);sps.scalingMatrix.ScalingList4x4[i] = ScalingList.read(
                            reader, 16);
                } }else {{
                    __CLR4_5_2ey2ey2lvl9ektp.R.inc(19460);sps.scalingMatrix.ScalingList8x8[i - 6] = ScalingList.read(
                            reader, 64);
                }
            }}
        }}
    }}finally{__CLR4_5_2ey2ey2lvl9ektp.R.flushNeeded();}}

    private static VUIParameters ReadVUIParameters(CAVLCReader reader)
            throws IOException {try{__CLR4_5_2ey2ey2lvl9ektp.R.inc(19461);
        __CLR4_5_2ey2ey2lvl9ektp.R.inc(19462);VUIParameters vuip = new VUIParameters();
        __CLR4_5_2ey2ey2lvl9ektp.R.inc(19463);vuip.aspect_ratio_info_present_flag = reader
                .readBool("VUI: aspect_ratio_info_present_flag");
        __CLR4_5_2ey2ey2lvl9ektp.R.inc(19464);if ((((vuip.aspect_ratio_info_present_flag)&&(__CLR4_5_2ey2ey2lvl9ektp.R.iget(19465)!=0|true))||(__CLR4_5_2ey2ey2lvl9ektp.R.iget(19466)==0&false))) {{
            __CLR4_5_2ey2ey2lvl9ektp.R.inc(19467);vuip.aspect_ratio = AspectRatio.fromValue((int) reader.readNBit(8,
                    "VUI: aspect_ratio"));
            __CLR4_5_2ey2ey2lvl9ektp.R.inc(19468);if ((((vuip.aspect_ratio == AspectRatio.Extended_SAR)&&(__CLR4_5_2ey2ey2lvl9ektp.R.iget(19469)!=0|true))||(__CLR4_5_2ey2ey2lvl9ektp.R.iget(19470)==0&false))) {{
                __CLR4_5_2ey2ey2lvl9ektp.R.inc(19471);vuip.sar_width = (int) reader.readNBit(16, "VUI: sar_width");
                __CLR4_5_2ey2ey2lvl9ektp.R.inc(19472);vuip.sar_height = (int) reader.readNBit(16, "VUI: sar_height");
            }
        }}
        }__CLR4_5_2ey2ey2lvl9ektp.R.inc(19473);vuip.overscan_info_present_flag = reader
                .readBool("VUI: overscan_info_present_flag");
        __CLR4_5_2ey2ey2lvl9ektp.R.inc(19474);if ((((vuip.overscan_info_present_flag)&&(__CLR4_5_2ey2ey2lvl9ektp.R.iget(19475)!=0|true))||(__CLR4_5_2ey2ey2lvl9ektp.R.iget(19476)==0&false))) {{
            __CLR4_5_2ey2ey2lvl9ektp.R.inc(19477);vuip.overscan_appropriate_flag = reader
                    .readBool("VUI: overscan_appropriate_flag");
        }
        }__CLR4_5_2ey2ey2lvl9ektp.R.inc(19478);vuip.video_signal_type_present_flag = reader
                .readBool("VUI: video_signal_type_present_flag");
        __CLR4_5_2ey2ey2lvl9ektp.R.inc(19479);if ((((vuip.video_signal_type_present_flag)&&(__CLR4_5_2ey2ey2lvl9ektp.R.iget(19480)!=0|true))||(__CLR4_5_2ey2ey2lvl9ektp.R.iget(19481)==0&false))) {{
            __CLR4_5_2ey2ey2lvl9ektp.R.inc(19482);vuip.video_format = (int) reader.readNBit(3, "VUI: video_format");
            __CLR4_5_2ey2ey2lvl9ektp.R.inc(19483);vuip.video_full_range_flag = reader
                    .readBool("VUI: video_full_range_flag");
            __CLR4_5_2ey2ey2lvl9ektp.R.inc(19484);vuip.colour_description_present_flag = reader
                    .readBool("VUI: colour_description_present_flag");
            __CLR4_5_2ey2ey2lvl9ektp.R.inc(19485);if ((((vuip.colour_description_present_flag)&&(__CLR4_5_2ey2ey2lvl9ektp.R.iget(19486)!=0|true))||(__CLR4_5_2ey2ey2lvl9ektp.R.iget(19487)==0&false))) {{
                __CLR4_5_2ey2ey2lvl9ektp.R.inc(19488);vuip.colour_primaries = (int) reader.readNBit(8,
                        "VUI: colour_primaries");
                __CLR4_5_2ey2ey2lvl9ektp.R.inc(19489);vuip.transfer_characteristics = (int) reader.readNBit(8,
                        "VUI: transfer_characteristics");
                __CLR4_5_2ey2ey2lvl9ektp.R.inc(19490);vuip.matrix_coefficients = (int) reader.readNBit(8,
                        "VUI: matrix_coefficients");
            }
        }}
        }__CLR4_5_2ey2ey2lvl9ektp.R.inc(19491);vuip.chroma_loc_info_present_flag = reader
                .readBool("VUI: chroma_loc_info_present_flag");
        __CLR4_5_2ey2ey2lvl9ektp.R.inc(19492);if ((((vuip.chroma_loc_info_present_flag)&&(__CLR4_5_2ey2ey2lvl9ektp.R.iget(19493)!=0|true))||(__CLR4_5_2ey2ey2lvl9ektp.R.iget(19494)==0&false))) {{
            __CLR4_5_2ey2ey2lvl9ektp.R.inc(19495);vuip.chroma_sample_loc_type_top_field = reader
                    .readUE("VUI chroma_sample_loc_type_top_field");
            __CLR4_5_2ey2ey2lvl9ektp.R.inc(19496);vuip.chroma_sample_loc_type_bottom_field = reader
                    .readUE("VUI chroma_sample_loc_type_bottom_field");
        }
        }__CLR4_5_2ey2ey2lvl9ektp.R.inc(19497);vuip.timing_info_present_flag = reader
                .readBool("VUI: timing_info_present_flag");
        __CLR4_5_2ey2ey2lvl9ektp.R.inc(19498);if ((((vuip.timing_info_present_flag)&&(__CLR4_5_2ey2ey2lvl9ektp.R.iget(19499)!=0|true))||(__CLR4_5_2ey2ey2lvl9ektp.R.iget(19500)==0&false))) {{
            __CLR4_5_2ey2ey2lvl9ektp.R.inc(19501);vuip.num_units_in_tick = (int) reader.readNBit(32,
                    "VUI: num_units_in_tick");
            __CLR4_5_2ey2ey2lvl9ektp.R.inc(19502);vuip.time_scale = (int) reader.readNBit(32, "VUI: time_scale");
            __CLR4_5_2ey2ey2lvl9ektp.R.inc(19503);vuip.fixed_frame_rate_flag = reader
                    .readBool("VUI: fixed_frame_rate_flag");
        }
        }__CLR4_5_2ey2ey2lvl9ektp.R.inc(19504);boolean nal_hrd_parameters_present_flag = reader
                .readBool("VUI: nal_hrd_parameters_present_flag");
        __CLR4_5_2ey2ey2lvl9ektp.R.inc(19505);if ((((nal_hrd_parameters_present_flag)&&(__CLR4_5_2ey2ey2lvl9ektp.R.iget(19506)!=0|true))||(__CLR4_5_2ey2ey2lvl9ektp.R.iget(19507)==0&false)))
            {__CLR4_5_2ey2ey2lvl9ektp.R.inc(19508);vuip.nalHRDParams = readHRDParameters(reader);
        }__CLR4_5_2ey2ey2lvl9ektp.R.inc(19509);boolean vcl_hrd_parameters_present_flag = reader
                .readBool("VUI: vcl_hrd_parameters_present_flag");
        __CLR4_5_2ey2ey2lvl9ektp.R.inc(19510);if ((((vcl_hrd_parameters_present_flag)&&(__CLR4_5_2ey2ey2lvl9ektp.R.iget(19511)!=0|true))||(__CLR4_5_2ey2ey2lvl9ektp.R.iget(19512)==0&false)))
            {__CLR4_5_2ey2ey2lvl9ektp.R.inc(19513);vuip.vclHRDParams = readHRDParameters(reader);
        }__CLR4_5_2ey2ey2lvl9ektp.R.inc(19514);if ((((nal_hrd_parameters_present_flag || vcl_hrd_parameters_present_flag)&&(__CLR4_5_2ey2ey2lvl9ektp.R.iget(19515)!=0|true))||(__CLR4_5_2ey2ey2lvl9ektp.R.iget(19516)==0&false))) {{
            __CLR4_5_2ey2ey2lvl9ektp.R.inc(19517);vuip.low_delay_hrd_flag = reader
                    .readBool("VUI: low_delay_hrd_flag");
        }
        }__CLR4_5_2ey2ey2lvl9ektp.R.inc(19518);vuip.pic_struct_present_flag = reader
                .readBool("VUI: pic_struct_present_flag");
        __CLR4_5_2ey2ey2lvl9ektp.R.inc(19519);boolean bitstream_restriction_flag = reader
                .readBool("VUI: bitstream_restriction_flag");
        __CLR4_5_2ey2ey2lvl9ektp.R.inc(19520);if ((((bitstream_restriction_flag)&&(__CLR4_5_2ey2ey2lvl9ektp.R.iget(19521)!=0|true))||(__CLR4_5_2ey2ey2lvl9ektp.R.iget(19522)==0&false))) {{
            __CLR4_5_2ey2ey2lvl9ektp.R.inc(19523);vuip.bitstreamRestriction = new VUIParameters.BitstreamRestriction();
            __CLR4_5_2ey2ey2lvl9ektp.R.inc(19524);vuip.bitstreamRestriction.motion_vectors_over_pic_boundaries_flag = reader
                    .readBool("VUI: motion_vectors_over_pic_boundaries_flag");
            __CLR4_5_2ey2ey2lvl9ektp.R.inc(19525);vuip.bitstreamRestriction.max_bytes_per_pic_denom = reader
                    .readUE("VUI max_bytes_per_pic_denom");
            __CLR4_5_2ey2ey2lvl9ektp.R.inc(19526);vuip.bitstreamRestriction.max_bits_per_mb_denom = reader
                    .readUE("VUI max_bits_per_mb_denom");
            __CLR4_5_2ey2ey2lvl9ektp.R.inc(19527);vuip.bitstreamRestriction.log2_max_mv_length_horizontal = reader
                    .readUE("VUI log2_max_mv_length_horizontal");
            __CLR4_5_2ey2ey2lvl9ektp.R.inc(19528);vuip.bitstreamRestriction.log2_max_mv_length_vertical = reader
                    .readUE("VUI log2_max_mv_length_vertical");
            __CLR4_5_2ey2ey2lvl9ektp.R.inc(19529);vuip.bitstreamRestriction.num_reorder_frames = reader
                    .readUE("VUI num_reorder_frames");
            __CLR4_5_2ey2ey2lvl9ektp.R.inc(19530);vuip.bitstreamRestriction.max_dec_frame_buffering = reader
                    .readUE("VUI max_dec_frame_buffering");
        }

        }__CLR4_5_2ey2ey2lvl9ektp.R.inc(19531);return vuip;
    }finally{__CLR4_5_2ey2ey2lvl9ektp.R.flushNeeded();}}

    private static HRDParameters readHRDParameters(CAVLCReader reader)
            throws IOException {try{__CLR4_5_2ey2ey2lvl9ektp.R.inc(19532);
        __CLR4_5_2ey2ey2lvl9ektp.R.inc(19533);HRDParameters hrd = new HRDParameters();
        __CLR4_5_2ey2ey2lvl9ektp.R.inc(19534);hrd.cpb_cnt_minus1 = reader.readUE("SPS: cpb_cnt_minus1");
        __CLR4_5_2ey2ey2lvl9ektp.R.inc(19535);hrd.bit_rate_scale = (int) reader.readNBit(4, "HRD: bit_rate_scale");
        __CLR4_5_2ey2ey2lvl9ektp.R.inc(19536);hrd.cpb_size_scale = (int) reader.readNBit(4, "HRD: cpb_size_scale");
        __CLR4_5_2ey2ey2lvl9ektp.R.inc(19537);hrd.bit_rate_value_minus1 = new int[hrd.cpb_cnt_minus1 + 1];
        __CLR4_5_2ey2ey2lvl9ektp.R.inc(19538);hrd.cpb_size_value_minus1 = new int[hrd.cpb_cnt_minus1 + 1];
        __CLR4_5_2ey2ey2lvl9ektp.R.inc(19539);hrd.cbr_flag = new boolean[hrd.cpb_cnt_minus1 + 1];

        __CLR4_5_2ey2ey2lvl9ektp.R.inc(19540);for (int SchedSelIdx = 0; (((SchedSelIdx <= hrd.cpb_cnt_minus1)&&(__CLR4_5_2ey2ey2lvl9ektp.R.iget(19541)!=0|true))||(__CLR4_5_2ey2ey2lvl9ektp.R.iget(19542)==0&false)); SchedSelIdx++) {{
            __CLR4_5_2ey2ey2lvl9ektp.R.inc(19543);hrd.bit_rate_value_minus1[SchedSelIdx] = reader
                    .readUE("HRD: bit_rate_value_minus1");
            __CLR4_5_2ey2ey2lvl9ektp.R.inc(19544);hrd.cpb_size_value_minus1[SchedSelIdx] = reader
                    .readUE("HRD: cpb_size_value_minus1");
            __CLR4_5_2ey2ey2lvl9ektp.R.inc(19545);hrd.cbr_flag[SchedSelIdx] = reader.readBool("HRD: cbr_flag");
        }
        }__CLR4_5_2ey2ey2lvl9ektp.R.inc(19546);hrd.initial_cpb_removal_delay_length_minus1 = (int) reader.readNBit(5,
                "HRD: initial_cpb_removal_delay_length_minus1");
        __CLR4_5_2ey2ey2lvl9ektp.R.inc(19547);hrd.cpb_removal_delay_length_minus1 = (int) reader.readNBit(5,
                "HRD: cpb_removal_delay_length_minus1");
        __CLR4_5_2ey2ey2lvl9ektp.R.inc(19548);hrd.dpb_output_delay_length_minus1 = (int) reader.readNBit(5,
                "HRD: dpb_output_delay_length_minus1");
        __CLR4_5_2ey2ey2lvl9ektp.R.inc(19549);hrd.time_offset_length = (int) reader.readNBit(5,
                "HRD: time_offset_length");
        __CLR4_5_2ey2ey2lvl9ektp.R.inc(19550);return hrd;
    }finally{__CLR4_5_2ey2ey2lvl9ektp.R.flushNeeded();}}

    public void write(OutputStream out) throws IOException {try{__CLR4_5_2ey2ey2lvl9ektp.R.inc(19551);
        __CLR4_5_2ey2ey2lvl9ektp.R.inc(19552);CAVLCWriter writer = new CAVLCWriter(out);

        __CLR4_5_2ey2ey2lvl9ektp.R.inc(19553);writer.writeNBit(profile_idc, 8, "SPS: profile_idc");
        __CLR4_5_2ey2ey2lvl9ektp.R.inc(19554);writer.writeBool(constraint_set_0_flag, "SPS: constraint_set_0_flag");
        __CLR4_5_2ey2ey2lvl9ektp.R.inc(19555);writer.writeBool(constraint_set_1_flag, "SPS: constraint_set_1_flag");
        __CLR4_5_2ey2ey2lvl9ektp.R.inc(19556);writer.writeBool(constraint_set_2_flag, "SPS: constraint_set_2_flag");
        __CLR4_5_2ey2ey2lvl9ektp.R.inc(19557);writer.writeBool(constraint_set_3_flag, "SPS: constraint_set_3_flag");
        __CLR4_5_2ey2ey2lvl9ektp.R.inc(19558);writer.writeNBit(0, 4, "SPS: reserved");
        __CLR4_5_2ey2ey2lvl9ektp.R.inc(19559);writer.writeNBit(level_idc, 8, "SPS: level_idc");
        __CLR4_5_2ey2ey2lvl9ektp.R.inc(19560);writer.writeUE(seq_parameter_set_id, "SPS: seq_parameter_set_id");

        __CLR4_5_2ey2ey2lvl9ektp.R.inc(19561);if ((((profile_idc == 100 || profile_idc == 110 || profile_idc == 122
                || profile_idc == 144)&&(__CLR4_5_2ey2ey2lvl9ektp.R.iget(19562)!=0|true))||(__CLR4_5_2ey2ey2lvl9ektp.R.iget(19563)==0&false))) {{
            __CLR4_5_2ey2ey2lvl9ektp.R.inc(19564);writer.writeUE(chroma_format_idc.getId(), "SPS: chroma_format_idc");
            __CLR4_5_2ey2ey2lvl9ektp.R.inc(19565);if ((((chroma_format_idc == ChromaFormat.YUV_444)&&(__CLR4_5_2ey2ey2lvl9ektp.R.iget(19566)!=0|true))||(__CLR4_5_2ey2ey2lvl9ektp.R.iget(19567)==0&false))) {{
                __CLR4_5_2ey2ey2lvl9ektp.R.inc(19568);writer.writeBool(residual_color_transform_flag,
                        "SPS: residual_color_transform_flag");
            }
            }__CLR4_5_2ey2ey2lvl9ektp.R.inc(19569);writer.writeUE(bit_depth_luma_minus8, "SPS: ");
            __CLR4_5_2ey2ey2lvl9ektp.R.inc(19570);writer.writeUE(bit_depth_chroma_minus8, "SPS: ");
            __CLR4_5_2ey2ey2lvl9ektp.R.inc(19571);writer.writeBool(qpprime_y_zero_transform_bypass_flag,
                    "SPS: qpprime_y_zero_transform_bypass_flag");
            __CLR4_5_2ey2ey2lvl9ektp.R.inc(19572);writer.writeBool(scalingMatrix != null, "SPS: ");
            __CLR4_5_2ey2ey2lvl9ektp.R.inc(19573);if ((((scalingMatrix != null)&&(__CLR4_5_2ey2ey2lvl9ektp.R.iget(19574)!=0|true))||(__CLR4_5_2ey2ey2lvl9ektp.R.iget(19575)==0&false))) {{
                __CLR4_5_2ey2ey2lvl9ektp.R.inc(19576);for (int i = 0; (((i < 8)&&(__CLR4_5_2ey2ey2lvl9ektp.R.iget(19577)!=0|true))||(__CLR4_5_2ey2ey2lvl9ektp.R.iget(19578)==0&false)); i++) {{
                    __CLR4_5_2ey2ey2lvl9ektp.R.inc(19579);if ((((i < 6)&&(__CLR4_5_2ey2ey2lvl9ektp.R.iget(19580)!=0|true))||(__CLR4_5_2ey2ey2lvl9ektp.R.iget(19581)==0&false))) {{
                        __CLR4_5_2ey2ey2lvl9ektp.R.inc(19582);writer.writeBool(
                                scalingMatrix.ScalingList4x4[i] != null,
                                "SPS: ");
                        __CLR4_5_2ey2ey2lvl9ektp.R.inc(19583);if ((((scalingMatrix.ScalingList4x4[i] != null)&&(__CLR4_5_2ey2ey2lvl9ektp.R.iget(19584)!=0|true))||(__CLR4_5_2ey2ey2lvl9ektp.R.iget(19585)==0&false))) {{
                            __CLR4_5_2ey2ey2lvl9ektp.R.inc(19586);scalingMatrix.ScalingList4x4[i].write(writer);
                        }
                    }} }else {{
                        __CLR4_5_2ey2ey2lvl9ektp.R.inc(19587);writer.writeBool(
                                scalingMatrix.ScalingList8x8[i - 6] != null,
                                "SPS: ");
                        __CLR4_5_2ey2ey2lvl9ektp.R.inc(19588);if ((((scalingMatrix.ScalingList8x8[i - 6] != null)&&(__CLR4_5_2ey2ey2lvl9ektp.R.iget(19589)!=0|true))||(__CLR4_5_2ey2ey2lvl9ektp.R.iget(19590)==0&false))) {{
                            __CLR4_5_2ey2ey2lvl9ektp.R.inc(19591);scalingMatrix.ScalingList8x8[i - 6].write(writer);
                        }
                    }}
                }}
            }}
        }}
        }__CLR4_5_2ey2ey2lvl9ektp.R.inc(19592);writer.writeUE(log2_max_frame_num_minus4,
                "SPS: log2_max_frame_num_minus4");
        __CLR4_5_2ey2ey2lvl9ektp.R.inc(19593);writer.writeUE(pic_order_cnt_type, "SPS: pic_order_cnt_type");
        __CLR4_5_2ey2ey2lvl9ektp.R.inc(19594);if ((((pic_order_cnt_type == 0)&&(__CLR4_5_2ey2ey2lvl9ektp.R.iget(19595)!=0|true))||(__CLR4_5_2ey2ey2lvl9ektp.R.iget(19596)==0&false))) {{
            __CLR4_5_2ey2ey2lvl9ektp.R.inc(19597);writer.writeUE(log2_max_pic_order_cnt_lsb_minus4,
                    "SPS: log2_max_pic_order_cnt_lsb_minus4");
        } }else {__CLR4_5_2ey2ey2lvl9ektp.R.inc(19598);if ((((pic_order_cnt_type == 1)&&(__CLR4_5_2ey2ey2lvl9ektp.R.iget(19599)!=0|true))||(__CLR4_5_2ey2ey2lvl9ektp.R.iget(19600)==0&false))) {{
            __CLR4_5_2ey2ey2lvl9ektp.R.inc(19601);writer.writeBool(delta_pic_order_always_zero_flag,
                    "SPS: delta_pic_order_always_zero_flag");
            __CLR4_5_2ey2ey2lvl9ektp.R.inc(19602);writer.writeSE(offset_for_non_ref_pic,
                    "SPS: offset_for_non_ref_pic");
            __CLR4_5_2ey2ey2lvl9ektp.R.inc(19603);writer.writeSE(offset_for_top_to_bottom_field,
                    "SPS: offset_for_top_to_bottom_field");
            __CLR4_5_2ey2ey2lvl9ektp.R.inc(19604);writer.writeUE(offsetForRefFrame.length, "SPS: ");
            __CLR4_5_2ey2ey2lvl9ektp.R.inc(19605);for (int i = 0; (((i < offsetForRefFrame.length)&&(__CLR4_5_2ey2ey2lvl9ektp.R.iget(19606)!=0|true))||(__CLR4_5_2ey2ey2lvl9ektp.R.iget(19607)==0&false)); i++)
                {__CLR4_5_2ey2ey2lvl9ektp.R.inc(19608);writer.writeSE(offsetForRefFrame[i], "SPS: ");
        }}
        }}__CLR4_5_2ey2ey2lvl9ektp.R.inc(19609);writer.writeUE(num_ref_frames, "SPS: num_ref_frames");
        __CLR4_5_2ey2ey2lvl9ektp.R.inc(19610);writer.writeBool(gaps_in_frame_num_value_allowed_flag,
                "SPS: gaps_in_frame_num_value_allowed_flag");
        __CLR4_5_2ey2ey2lvl9ektp.R.inc(19611);writer.writeUE(pic_width_in_mbs_minus1, "SPS: pic_width_in_mbs_minus1");
        __CLR4_5_2ey2ey2lvl9ektp.R.inc(19612);writer.writeUE(pic_height_in_map_units_minus1,
                "SPS: pic_height_in_map_units_minus1");
        __CLR4_5_2ey2ey2lvl9ektp.R.inc(19613);writer.writeBool(frame_mbs_only_flag, "SPS: frame_mbs_only_flag");
        __CLR4_5_2ey2ey2lvl9ektp.R.inc(19614);if ((((!frame_mbs_only_flag)&&(__CLR4_5_2ey2ey2lvl9ektp.R.iget(19615)!=0|true))||(__CLR4_5_2ey2ey2lvl9ektp.R.iget(19616)==0&false))) {{
            __CLR4_5_2ey2ey2lvl9ektp.R.inc(19617);writer.writeBool(mb_adaptive_frame_field_flag,
                    "SPS: mb_adaptive_frame_field_flag");
        }
        }__CLR4_5_2ey2ey2lvl9ektp.R.inc(19618);writer.writeBool(direct_8x8_inference_flag,
                "SPS: direct_8x8_inference_flag");
        __CLR4_5_2ey2ey2lvl9ektp.R.inc(19619);writer.writeBool(frame_cropping_flag, "SPS: frame_cropping_flag");
        __CLR4_5_2ey2ey2lvl9ektp.R.inc(19620);if ((((frame_cropping_flag)&&(__CLR4_5_2ey2ey2lvl9ektp.R.iget(19621)!=0|true))||(__CLR4_5_2ey2ey2lvl9ektp.R.iget(19622)==0&false))) {{
            __CLR4_5_2ey2ey2lvl9ektp.R.inc(19623);writer.writeUE(frame_crop_left_offset,
                    "SPS: frame_crop_left_offset");
            __CLR4_5_2ey2ey2lvl9ektp.R.inc(19624);writer.writeUE(frame_crop_right_offset,
                    "SPS: frame_crop_right_offset");
            __CLR4_5_2ey2ey2lvl9ektp.R.inc(19625);writer.writeUE(frame_crop_top_offset, "SPS: frame_crop_top_offset");
            __CLR4_5_2ey2ey2lvl9ektp.R.inc(19626);writer.writeUE(frame_crop_bottom_offset,
                    "SPS: frame_crop_bottom_offset");
        }
        }__CLR4_5_2ey2ey2lvl9ektp.R.inc(19627);writer.writeBool(vuiParams != null, "SPS: ");
        __CLR4_5_2ey2ey2lvl9ektp.R.inc(19628);if ((((vuiParams != null)&&(__CLR4_5_2ey2ey2lvl9ektp.R.iget(19629)!=0|true))||(__CLR4_5_2ey2ey2lvl9ektp.R.iget(19630)==0&false)))
            {__CLR4_5_2ey2ey2lvl9ektp.R.inc(19631);writeVUIParameters(vuiParams, writer);

        }__CLR4_5_2ey2ey2lvl9ektp.R.inc(19632);writer.writeTrailingBits();
    }finally{__CLR4_5_2ey2ey2lvl9ektp.R.flushNeeded();}}

    private void writeVUIParameters(VUIParameters vuip, CAVLCWriter writer)
            throws IOException {try{__CLR4_5_2ey2ey2lvl9ektp.R.inc(19633);
        __CLR4_5_2ey2ey2lvl9ektp.R.inc(19634);writer.writeBool(vuip.aspect_ratio_info_present_flag,
                "VUI: aspect_ratio_info_present_flag");
        __CLR4_5_2ey2ey2lvl9ektp.R.inc(19635);if ((((vuip.aspect_ratio_info_present_flag)&&(__CLR4_5_2ey2ey2lvl9ektp.R.iget(19636)!=0|true))||(__CLR4_5_2ey2ey2lvl9ektp.R.iget(19637)==0&false))) {{
            __CLR4_5_2ey2ey2lvl9ektp.R.inc(19638);writer.writeNBit(vuip.aspect_ratio.getValue(), 8,
                    "VUI: aspect_ratio");
            __CLR4_5_2ey2ey2lvl9ektp.R.inc(19639);if ((((vuip.aspect_ratio == AspectRatio.Extended_SAR)&&(__CLR4_5_2ey2ey2lvl9ektp.R.iget(19640)!=0|true))||(__CLR4_5_2ey2ey2lvl9ektp.R.iget(19641)==0&false))) {{
                __CLR4_5_2ey2ey2lvl9ektp.R.inc(19642);writer.writeNBit(vuip.sar_width, 16, "VUI: sar_width");
                __CLR4_5_2ey2ey2lvl9ektp.R.inc(19643);writer.writeNBit(vuip.sar_height, 16, "VUI: sar_height");
            }
        }}
        }__CLR4_5_2ey2ey2lvl9ektp.R.inc(19644);writer.writeBool(vuip.overscan_info_present_flag,
                "VUI: overscan_info_present_flag");
        __CLR4_5_2ey2ey2lvl9ektp.R.inc(19645);if ((((vuip.overscan_info_present_flag)&&(__CLR4_5_2ey2ey2lvl9ektp.R.iget(19646)!=0|true))||(__CLR4_5_2ey2ey2lvl9ektp.R.iget(19647)==0&false))) {{
            __CLR4_5_2ey2ey2lvl9ektp.R.inc(19648);writer.writeBool(vuip.overscan_appropriate_flag,
                    "VUI: overscan_appropriate_flag");
        }
        }__CLR4_5_2ey2ey2lvl9ektp.R.inc(19649);writer.writeBool(vuip.video_signal_type_present_flag,
                "VUI: video_signal_type_present_flag");
        __CLR4_5_2ey2ey2lvl9ektp.R.inc(19650);if ((((vuip.video_signal_type_present_flag)&&(__CLR4_5_2ey2ey2lvl9ektp.R.iget(19651)!=0|true))||(__CLR4_5_2ey2ey2lvl9ektp.R.iget(19652)==0&false))) {{
            __CLR4_5_2ey2ey2lvl9ektp.R.inc(19653);writer.writeNBit(vuip.video_format, 3, "VUI: video_format");
            __CLR4_5_2ey2ey2lvl9ektp.R.inc(19654);writer.writeBool(vuip.video_full_range_flag,
                    "VUI: video_full_range_flag");
            __CLR4_5_2ey2ey2lvl9ektp.R.inc(19655);writer.writeBool(vuip.colour_description_present_flag,
                    "VUI: colour_description_present_flag");
            __CLR4_5_2ey2ey2lvl9ektp.R.inc(19656);if ((((vuip.colour_description_present_flag)&&(__CLR4_5_2ey2ey2lvl9ektp.R.iget(19657)!=0|true))||(__CLR4_5_2ey2ey2lvl9ektp.R.iget(19658)==0&false))) {{
                __CLR4_5_2ey2ey2lvl9ektp.R.inc(19659);writer.writeNBit(vuip.colour_primaries, 8,
                        "VUI: colour_primaries");
                __CLR4_5_2ey2ey2lvl9ektp.R.inc(19660);writer.writeNBit(vuip.transfer_characteristics, 8,
                        "VUI: transfer_characteristics");
                __CLR4_5_2ey2ey2lvl9ektp.R.inc(19661);writer.writeNBit(vuip.matrix_coefficients, 8,
                        "VUI: matrix_coefficients");
            }
        }}
        }__CLR4_5_2ey2ey2lvl9ektp.R.inc(19662);writer.writeBool(vuip.chroma_loc_info_present_flag,
                "VUI: chroma_loc_info_present_flag");
        __CLR4_5_2ey2ey2lvl9ektp.R.inc(19663);if ((((vuip.chroma_loc_info_present_flag)&&(__CLR4_5_2ey2ey2lvl9ektp.R.iget(19664)!=0|true))||(__CLR4_5_2ey2ey2lvl9ektp.R.iget(19665)==0&false))) {{
            __CLR4_5_2ey2ey2lvl9ektp.R.inc(19666);writer.writeUE(vuip.chroma_sample_loc_type_top_field,
                    "VUI: chroma_sample_loc_type_top_field");
            __CLR4_5_2ey2ey2lvl9ektp.R.inc(19667);writer.writeUE(vuip.chroma_sample_loc_type_bottom_field,
                    "VUI: chroma_sample_loc_type_bottom_field");
        }
        }__CLR4_5_2ey2ey2lvl9ektp.R.inc(19668);writer.writeBool(vuip.timing_info_present_flag,
                "VUI: timing_info_present_flag");
        __CLR4_5_2ey2ey2lvl9ektp.R.inc(19669);if ((((vuip.timing_info_present_flag)&&(__CLR4_5_2ey2ey2lvl9ektp.R.iget(19670)!=0|true))||(__CLR4_5_2ey2ey2lvl9ektp.R.iget(19671)==0&false))) {{
            __CLR4_5_2ey2ey2lvl9ektp.R.inc(19672);writer.writeNBit(vuip.num_units_in_tick, 32,
                    "VUI: num_units_in_tick");
            __CLR4_5_2ey2ey2lvl9ektp.R.inc(19673);writer.writeNBit(vuip.time_scale, 32, "VUI: time_scale");
            __CLR4_5_2ey2ey2lvl9ektp.R.inc(19674);writer.writeBool(vuip.fixed_frame_rate_flag,
                    "VUI: fixed_frame_rate_flag");
        }
        }__CLR4_5_2ey2ey2lvl9ektp.R.inc(19675);writer.writeBool(vuip.nalHRDParams != null, "VUI: ");
        __CLR4_5_2ey2ey2lvl9ektp.R.inc(19676);if ((((vuip.nalHRDParams != null)&&(__CLR4_5_2ey2ey2lvl9ektp.R.iget(19677)!=0|true))||(__CLR4_5_2ey2ey2lvl9ektp.R.iget(19678)==0&false))) {{
            __CLR4_5_2ey2ey2lvl9ektp.R.inc(19679);writeHRDParameters(vuip.nalHRDParams, writer);
        }
        }__CLR4_5_2ey2ey2lvl9ektp.R.inc(19680);writer.writeBool(vuip.vclHRDParams != null, "VUI: ");
        __CLR4_5_2ey2ey2lvl9ektp.R.inc(19681);if ((((vuip.vclHRDParams != null)&&(__CLR4_5_2ey2ey2lvl9ektp.R.iget(19682)!=0|true))||(__CLR4_5_2ey2ey2lvl9ektp.R.iget(19683)==0&false))) {{
            __CLR4_5_2ey2ey2lvl9ektp.R.inc(19684);writeHRDParameters(vuip.vclHRDParams, writer);
        }

        }__CLR4_5_2ey2ey2lvl9ektp.R.inc(19685);if ((((vuip.nalHRDParams != null || vuip.vclHRDParams != null)&&(__CLR4_5_2ey2ey2lvl9ektp.R.iget(19686)!=0|true))||(__CLR4_5_2ey2ey2lvl9ektp.R.iget(19687)==0&false))) {{
            __CLR4_5_2ey2ey2lvl9ektp.R.inc(19688);writer
                    .writeBool(vuip.low_delay_hrd_flag,
                            "VUI: low_delay_hrd_flag");
        }
        }__CLR4_5_2ey2ey2lvl9ektp.R.inc(19689);writer.writeBool(vuip.pic_struct_present_flag,
                "VUI: pic_struct_present_flag");
        __CLR4_5_2ey2ey2lvl9ektp.R.inc(19690);writer.writeBool(vuip.bitstreamRestriction != null, "VUI: ");
        __CLR4_5_2ey2ey2lvl9ektp.R.inc(19691);if ((((vuip.bitstreamRestriction != null)&&(__CLR4_5_2ey2ey2lvl9ektp.R.iget(19692)!=0|true))||(__CLR4_5_2ey2ey2lvl9ektp.R.iget(19693)==0&false))) {{
            __CLR4_5_2ey2ey2lvl9ektp.R.inc(19694);writer
                    .writeBool(
                            vuip.bitstreamRestriction.motion_vectors_over_pic_boundaries_flag,
                            "VUI: motion_vectors_over_pic_boundaries_flag");
            __CLR4_5_2ey2ey2lvl9ektp.R.inc(19695);writer.writeUE(vuip.bitstreamRestriction.max_bytes_per_pic_denom,
                    "VUI: max_bytes_per_pic_denom");
            __CLR4_5_2ey2ey2lvl9ektp.R.inc(19696);writer.writeUE(vuip.bitstreamRestriction.max_bits_per_mb_denom,
                    "VUI: max_bits_per_mb_denom");
            __CLR4_5_2ey2ey2lvl9ektp.R.inc(19697);writer.writeUE(
                    vuip.bitstreamRestriction.log2_max_mv_length_horizontal,
                    "VUI: log2_max_mv_length_horizontal");
            __CLR4_5_2ey2ey2lvl9ektp.R.inc(19698);writer.writeUE(
                    vuip.bitstreamRestriction.log2_max_mv_length_vertical,
                    "VUI: log2_max_mv_length_vertical");
            __CLR4_5_2ey2ey2lvl9ektp.R.inc(19699);writer.writeUE(vuip.bitstreamRestriction.num_reorder_frames,
                    "VUI: num_reorder_frames");
            __CLR4_5_2ey2ey2lvl9ektp.R.inc(19700);writer.writeUE(vuip.bitstreamRestriction.max_dec_frame_buffering,
                    "VUI: max_dec_frame_buffering");
        }

    }}finally{__CLR4_5_2ey2ey2lvl9ektp.R.flushNeeded();}}

    private void writeHRDParameters(HRDParameters hrd, CAVLCWriter writer)
            throws IOException {try{__CLR4_5_2ey2ey2lvl9ektp.R.inc(19701);
        __CLR4_5_2ey2ey2lvl9ektp.R.inc(19702);writer.writeUE(hrd.cpb_cnt_minus1, "HRD: cpb_cnt_minus1");
        __CLR4_5_2ey2ey2lvl9ektp.R.inc(19703);writer.writeNBit(hrd.bit_rate_scale, 4, "HRD: bit_rate_scale");
        __CLR4_5_2ey2ey2lvl9ektp.R.inc(19704);writer.writeNBit(hrd.cpb_size_scale, 4, "HRD: cpb_size_scale");

        __CLR4_5_2ey2ey2lvl9ektp.R.inc(19705);for (int SchedSelIdx = 0; (((SchedSelIdx <= hrd.cpb_cnt_minus1)&&(__CLR4_5_2ey2ey2lvl9ektp.R.iget(19706)!=0|true))||(__CLR4_5_2ey2ey2lvl9ektp.R.iget(19707)==0&false)); SchedSelIdx++) {{
            __CLR4_5_2ey2ey2lvl9ektp.R.inc(19708);writer.writeUE(hrd.bit_rate_value_minus1[SchedSelIdx], "HRD: ");
            __CLR4_5_2ey2ey2lvl9ektp.R.inc(19709);writer.writeUE(hrd.cpb_size_value_minus1[SchedSelIdx], "HRD: ");
            __CLR4_5_2ey2ey2lvl9ektp.R.inc(19710);writer.writeBool(hrd.cbr_flag[SchedSelIdx], "HRD: ");
        }
        }__CLR4_5_2ey2ey2lvl9ektp.R.inc(19711);writer.writeNBit(hrd.initial_cpb_removal_delay_length_minus1, 5,
                "HRD: initial_cpb_removal_delay_length_minus1");
        __CLR4_5_2ey2ey2lvl9ektp.R.inc(19712);writer.writeNBit(hrd.cpb_removal_delay_length_minus1, 5,
                "HRD: cpb_removal_delay_length_minus1");
        __CLR4_5_2ey2ey2lvl9ektp.R.inc(19713);writer.writeNBit(hrd.dpb_output_delay_length_minus1, 5,
                "HRD: dpb_output_delay_length_minus1");
        __CLR4_5_2ey2ey2lvl9ektp.R.inc(19714);writer.writeNBit(hrd.time_offset_length, 5, "HRD: time_offset_length");
    }finally{__CLR4_5_2ey2ey2lvl9ektp.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_5_2ey2ey2lvl9ektp.R.inc(19715);
        __CLR4_5_2ey2ey2lvl9ektp.R.inc(19716);return "SeqParameterSet{ " +
                "\n        pic_order_cnt_type=" + pic_order_cnt_type +
                ", \n        field_pic_flag=" + field_pic_flag +
                ", \n        delta_pic_order_always_zero_flag=" + delta_pic_order_always_zero_flag +
                ", \n        weighted_pred_flag=" + weighted_pred_flag +
                ", \n        weighted_bipred_idc=" + weighted_bipred_idc +
                ", \n        entropy_coding_mode_flag=" + entropy_coding_mode_flag +
                ", \n        mb_adaptive_frame_field_flag=" + mb_adaptive_frame_field_flag +
                ", \n        direct_8x8_inference_flag=" + direct_8x8_inference_flag +
                ", \n        chroma_format_idc=" + chroma_format_idc +
                ", \n        log2_max_frame_num_minus4=" + log2_max_frame_num_minus4 +
                ", \n        log2_max_pic_order_cnt_lsb_minus4=" + log2_max_pic_order_cnt_lsb_minus4 +
                ", \n        pic_height_in_map_units_minus1=" + pic_height_in_map_units_minus1 +
                ", \n        pic_width_in_mbs_minus1=" + pic_width_in_mbs_minus1 +
                ", \n        bit_depth_luma_minus8=" + bit_depth_luma_minus8 +
                ", \n        bit_depth_chroma_minus8=" + bit_depth_chroma_minus8 +
                ", \n        qpprime_y_zero_transform_bypass_flag=" + qpprime_y_zero_transform_bypass_flag +
                ", \n        profile_idc=" + profile_idc +
                ", \n        constraint_set_0_flag=" + constraint_set_0_flag +
                ", \n        constraint_set_1_flag=" + constraint_set_1_flag +
                ", \n        constraint_set_2_flag=" + constraint_set_2_flag +
                ", \n        constraint_set_3_flag=" + constraint_set_3_flag +
                ", \n        constraint_set_4_flag=" + constraint_set_4_flag +
                ", \n        constraint_set_5_flag=" + constraint_set_5_flag +
                ", \n        level_idc=" + level_idc +
                ", \n        seq_parameter_set_id=" + seq_parameter_set_id +
                ", \n        residual_color_transform_flag=" + residual_color_transform_flag +
                ", \n        offset_for_non_ref_pic=" + offset_for_non_ref_pic +
                ", \n        offset_for_top_to_bottom_field=" + offset_for_top_to_bottom_field +
                ", \n        num_ref_frames=" + num_ref_frames +
                ", \n        gaps_in_frame_num_value_allowed_flag=" + gaps_in_frame_num_value_allowed_flag +
                ", \n        frame_mbs_only_flag=" + frame_mbs_only_flag +
                ", \n        frame_cropping_flag=" + frame_cropping_flag +
                ", \n        frame_crop_left_offset=" + frame_crop_left_offset +
                ", \n        frame_crop_right_offset=" + frame_crop_right_offset +
                ", \n        frame_crop_top_offset=" + frame_crop_top_offset +
                ", \n        frame_crop_bottom_offset=" + frame_crop_bottom_offset +
                ", \n        offsetForRefFrame=" + offsetForRefFrame +
                ", \n        vuiParams=" + vuiParams +
                ", \n        scalingMatrix=" + scalingMatrix +
                ", \n        num_ref_frames_in_pic_order_cnt_cycle=" + num_ref_frames_in_pic_order_cnt_cycle +
                '}';
    }finally{__CLR4_5_2ey2ey2lvl9ektp.R.flushNeeded();}}
}