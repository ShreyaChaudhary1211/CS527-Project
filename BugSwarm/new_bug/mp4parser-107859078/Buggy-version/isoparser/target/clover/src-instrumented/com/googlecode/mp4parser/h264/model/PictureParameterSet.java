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
import java.util.Arrays;

/**
 * Picture Parameter Set entity of H264 bitstream
 * <p>
 * capable to serialize / deserialize with CAVLC bitstream</p>
 *
 * @author Stanislav Vitvitskiy
 */
public class PictureParameterSet extends BitstreamElement {public static class __CLR4_5_2en9en9lvl9eks1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,19326,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static class PPSExt {
        public boolean transform_8x8_mode_flag;
        public ScalingMatrix scalindMatrix = new ScalingMatrix();
        public int second_chroma_qp_index_offset;
        public boolean[] pic_scaling_list_present_flag;

        @Override
        public String toString() {try{__CLR4_5_2en9en9lvl9eks1.R.inc(18981);
            __CLR4_5_2en9en9lvl9eks1.R.inc(18982);return "PPSExt{" +
                    "transform_8x8_mode_flag=" + transform_8x8_mode_flag +
                    ", scalindMatrix=" + scalindMatrix +
                    ", second_chroma_qp_index_offset=" + second_chroma_qp_index_offset +
                    ", pic_scaling_list_present_flag=" + pic_scaling_list_present_flag +
                    '}';
        }finally{__CLR4_5_2en9en9lvl9eks1.R.flushNeeded();}}
    }

    public boolean entropy_coding_mode_flag;
    public int num_ref_idx_l0_active_minus1;
    public int num_ref_idx_l1_active_minus1;
    public int slice_group_change_rate_minus1;
    public int pic_parameter_set_id;
    public int seq_parameter_set_id;
    public boolean bottom_field_pic_order_in_frame_present_flag;
    public int num_slice_groups_minus1;
    public int slice_group_map_type;
    public boolean weighted_pred_flag;
    public int weighted_bipred_idc;
    public int pic_init_qp_minus26;
    public int pic_init_qs_minus26;
    public int chroma_qp_index_offset;
    public boolean deblocking_filter_control_present_flag;
    public boolean constrained_intra_pred_flag;
    public boolean redundant_pic_cnt_present_flag;
    public int[] top_left;
    public int[] bottom_right;
    public int[] run_length_minus1;
    public boolean slice_group_change_direction_flag;
    public int[] slice_group_id;
    public PPSExt extended;

    public static PictureParameterSet read(byte[] b) throws IOException {try{__CLR4_5_2en9en9lvl9eks1.R.inc(18983);
        __CLR4_5_2en9en9lvl9eks1.R.inc(18984);return read(new ByteArrayInputStream(b));
    }finally{__CLR4_5_2en9en9lvl9eks1.R.flushNeeded();}}

    public static PictureParameterSet read(InputStream is) throws IOException {try{__CLR4_5_2en9en9lvl9eks1.R.inc(18985);
        __CLR4_5_2en9en9lvl9eks1.R.inc(18986);CAVLCReader reader = new CAVLCReader(is);
        __CLR4_5_2en9en9lvl9eks1.R.inc(18987);PictureParameterSet pps = new PictureParameterSet();

        __CLR4_5_2en9en9lvl9eks1.R.inc(18988);pps.pic_parameter_set_id = reader.readUE("PPS: pic_parameter_set_id");
        __CLR4_5_2en9en9lvl9eks1.R.inc(18989);pps.seq_parameter_set_id = reader.readUE("PPS: seq_parameter_set_id");
        __CLR4_5_2en9en9lvl9eks1.R.inc(18990);pps.entropy_coding_mode_flag = reader
                .readBool("PPS: entropy_coding_mode_flag");
        __CLR4_5_2en9en9lvl9eks1.R.inc(18991);pps.bottom_field_pic_order_in_frame_present_flag = reader
                .readBool("PPS: pic_order_present_flag");
        __CLR4_5_2en9en9lvl9eks1.R.inc(18992);pps.num_slice_groups_minus1 = reader
                .readUE("PPS: num_slice_groups_minus1");
        __CLR4_5_2en9en9lvl9eks1.R.inc(18993);if ((((pps.num_slice_groups_minus1 > 0)&&(__CLR4_5_2en9en9lvl9eks1.R.iget(18994)!=0|true))||(__CLR4_5_2en9en9lvl9eks1.R.iget(18995)==0&false))) {{
            __CLR4_5_2en9en9lvl9eks1.R.inc(18996);pps.slice_group_map_type = reader
                    .readUE("PPS: slice_group_map_type");
            __CLR4_5_2en9en9lvl9eks1.R.inc(18997);pps.top_left = new int[pps.num_slice_groups_minus1 + 1];
            __CLR4_5_2en9en9lvl9eks1.R.inc(18998);pps.bottom_right = new int[pps.num_slice_groups_minus1 + 1];
            __CLR4_5_2en9en9lvl9eks1.R.inc(18999);pps.run_length_minus1 = new int[pps.num_slice_groups_minus1 + 1];
            __CLR4_5_2en9en9lvl9eks1.R.inc(19000);if ((((pps.slice_group_map_type == 0)&&(__CLR4_5_2en9en9lvl9eks1.R.iget(19001)!=0|true))||(__CLR4_5_2en9en9lvl9eks1.R.iget(19002)==0&false)))
                {__CLR4_5_2en9en9lvl9eks1.R.inc(19003);for (int iGroup = 0; (((iGroup <= pps.num_slice_groups_minus1)&&(__CLR4_5_2en9en9lvl9eks1.R.iget(19004)!=0|true))||(__CLR4_5_2en9en9lvl9eks1.R.iget(19005)==0&false)); iGroup++)
                    {__CLR4_5_2en9en9lvl9eks1.R.inc(19006);pps.run_length_minus1[iGroup] = reader
                            .readUE("PPS: run_length_minus1");
            }}else {__CLR4_5_2en9en9lvl9eks1.R.inc(19007);if ((((pps.slice_group_map_type == 2)&&(__CLR4_5_2en9en9lvl9eks1.R.iget(19008)!=0|true))||(__CLR4_5_2en9en9lvl9eks1.R.iget(19009)==0&false)))
                {__CLR4_5_2en9en9lvl9eks1.R.inc(19010);for (int iGroup = 0; (((iGroup < pps.num_slice_groups_minus1)&&(__CLR4_5_2en9en9lvl9eks1.R.iget(19011)!=0|true))||(__CLR4_5_2en9en9lvl9eks1.R.iget(19012)==0&false)); iGroup++) {{
                    __CLR4_5_2en9en9lvl9eks1.R.inc(19013);pps.top_left[iGroup] = reader.readUE("PPS: top_left");
                    __CLR4_5_2en9en9lvl9eks1.R.inc(19014);pps.bottom_right[iGroup] = reader
                            .readUE("PPS: bottom_right");
                }
            }}else {__CLR4_5_2en9en9lvl9eks1.R.inc(19015);if ((((pps.slice_group_map_type == 3
                    || pps.slice_group_map_type == 4
                    || pps.slice_group_map_type == 5)&&(__CLR4_5_2en9en9lvl9eks1.R.iget(19016)!=0|true))||(__CLR4_5_2en9en9lvl9eks1.R.iget(19017)==0&false))) {{
                __CLR4_5_2en9en9lvl9eks1.R.inc(19018);pps.slice_group_change_direction_flag = reader
                        .readBool("PPS: slice_group_change_direction_flag");
                __CLR4_5_2en9en9lvl9eks1.R.inc(19019);pps.slice_group_change_rate_minus1 = reader
                        .readUE("PPS: slice_group_change_rate_minus1");
            } }else {__CLR4_5_2en9en9lvl9eks1.R.inc(19020);if ((((pps.slice_group_map_type == 6)&&(__CLR4_5_2en9en9lvl9eks1.R.iget(19021)!=0|true))||(__CLR4_5_2en9en9lvl9eks1.R.iget(19022)==0&false))) {{
                __CLR4_5_2en9en9lvl9eks1.R.inc(19023);int NumberBitsPerSliceGroupId;
                __CLR4_5_2en9en9lvl9eks1.R.inc(19024);if ((((pps.num_slice_groups_minus1 + 1 > 4)&&(__CLR4_5_2en9en9lvl9eks1.R.iget(19025)!=0|true))||(__CLR4_5_2en9en9lvl9eks1.R.iget(19026)==0&false)))
                    {__CLR4_5_2en9en9lvl9eks1.R.inc(19027);NumberBitsPerSliceGroupId = 3;
                }else {__CLR4_5_2en9en9lvl9eks1.R.inc(19028);if ((((pps.num_slice_groups_minus1 + 1 > 2)&&(__CLR4_5_2en9en9lvl9eks1.R.iget(19029)!=0|true))||(__CLR4_5_2en9en9lvl9eks1.R.iget(19030)==0&false)))
                    {__CLR4_5_2en9en9lvl9eks1.R.inc(19031);NumberBitsPerSliceGroupId = 2;
                }else
                    {__CLR4_5_2en9en9lvl9eks1.R.inc(19032);NumberBitsPerSliceGroupId = 1;
                }}__CLR4_5_2en9en9lvl9eks1.R.inc(19033);int pic_size_in_map_units_minus1 = reader
                        .readUE("PPS: pic_size_in_map_units_minus1");
                __CLR4_5_2en9en9lvl9eks1.R.inc(19034);pps.slice_group_id = new int[pic_size_in_map_units_minus1 + 1];
                __CLR4_5_2en9en9lvl9eks1.R.inc(19035);for (int i = 0; (((i <= pic_size_in_map_units_minus1)&&(__CLR4_5_2en9en9lvl9eks1.R.iget(19036)!=0|true))||(__CLR4_5_2en9en9lvl9eks1.R.iget(19037)==0&false)); i++) {{
                    __CLR4_5_2en9en9lvl9eks1.R.inc(19038);pps.slice_group_id[i] = reader.readU(
                            NumberBitsPerSliceGroupId, "PPS: slice_group_id ["
                            + i + "]f");
                }
            }}
        }}}}}
        }__CLR4_5_2en9en9lvl9eks1.R.inc(19039);pps.num_ref_idx_l0_active_minus1 = reader
                .readUE("PPS: num_ref_idx_l0_active_minus1");
        __CLR4_5_2en9en9lvl9eks1.R.inc(19040);pps.num_ref_idx_l1_active_minus1 = reader
                .readUE("PPS: num_ref_idx_l1_active_minus1");
        __CLR4_5_2en9en9lvl9eks1.R.inc(19041);pps.weighted_pred_flag = reader.readBool("PPS: weighted_pred_flag");
        __CLR4_5_2en9en9lvl9eks1.R.inc(19042);pps.weighted_bipred_idc = (int) reader.readNBit(2,
                "PPS: weighted_bipred_idc");
        __CLR4_5_2en9en9lvl9eks1.R.inc(19043);pps.pic_init_qp_minus26 = reader.readSE("PPS: pic_init_qp_minus26");
        __CLR4_5_2en9en9lvl9eks1.R.inc(19044);pps.pic_init_qs_minus26 = reader.readSE("PPS: pic_init_qs_minus26");
        __CLR4_5_2en9en9lvl9eks1.R.inc(19045);pps.chroma_qp_index_offset = reader
                .readSE("PPS: chroma_qp_index_offset");
        __CLR4_5_2en9en9lvl9eks1.R.inc(19046);pps.deblocking_filter_control_present_flag = reader
                .readBool("PPS: deblocking_filter_control_present_flag");
        __CLR4_5_2en9en9lvl9eks1.R.inc(19047);pps.constrained_intra_pred_flag = reader
                .readBool("PPS: constrained_intra_pred_flag");
        __CLR4_5_2en9en9lvl9eks1.R.inc(19048);pps.redundant_pic_cnt_present_flag = reader
                .readBool("PPS: redundant_pic_cnt_present_flag");
        __CLR4_5_2en9en9lvl9eks1.R.inc(19049);if ((((reader.moreRBSPData())&&(__CLR4_5_2en9en9lvl9eks1.R.iget(19050)!=0|true))||(__CLR4_5_2en9en9lvl9eks1.R.iget(19051)==0&false))) {{
            __CLR4_5_2en9en9lvl9eks1.R.inc(19052);pps.extended = new PictureParameterSet.PPSExt();
            __CLR4_5_2en9en9lvl9eks1.R.inc(19053);pps.extended.transform_8x8_mode_flag = reader
                    .readBool("PPS: transform_8x8_mode_flag");
            __CLR4_5_2en9en9lvl9eks1.R.inc(19054);boolean pic_scaling_matrix_present_flag = reader
                    .readBool("PPS: pic_scaling_matrix_present_flag");
            __CLR4_5_2en9en9lvl9eks1.R.inc(19055);if ((((pic_scaling_matrix_present_flag)&&(__CLR4_5_2en9en9lvl9eks1.R.iget(19056)!=0|true))||(__CLR4_5_2en9en9lvl9eks1.R.iget(19057)==0&false))) {{
                __CLR4_5_2en9en9lvl9eks1.R.inc(19058);for (int i = 0; (((i < 6 + 2 * ((((pps.extended.transform_8x8_mode_flag )&&(__CLR4_5_2en9en9lvl9eks1.R.iget(19059)!=0|true))||(__CLR4_5_2en9en9lvl9eks1.R.iget(19060)==0&false))? 1
                        : 0))&&(__CLR4_5_2en9en9lvl9eks1.R.iget(19061)!=0|true))||(__CLR4_5_2en9en9lvl9eks1.R.iget(19062)==0&false)); i++) {{
                    __CLR4_5_2en9en9lvl9eks1.R.inc(19063);boolean pic_scaling_list_present_flag = reader
                            .readBool("PPS: pic_scaling_list_present_flag");
                    __CLR4_5_2en9en9lvl9eks1.R.inc(19064);if ((((pic_scaling_list_present_flag)&&(__CLR4_5_2en9en9lvl9eks1.R.iget(19065)!=0|true))||(__CLR4_5_2en9en9lvl9eks1.R.iget(19066)==0&false))) {{
                        __CLR4_5_2en9en9lvl9eks1.R.inc(19067);pps.extended.scalindMatrix.ScalingList4x4 = new ScalingList[8];
                        __CLR4_5_2en9en9lvl9eks1.R.inc(19068);pps.extended.scalindMatrix.ScalingList8x8 = new ScalingList[8];
                        __CLR4_5_2en9en9lvl9eks1.R.inc(19069);if ((((i < 6)&&(__CLR4_5_2en9en9lvl9eks1.R.iget(19070)!=0|true))||(__CLR4_5_2en9en9lvl9eks1.R.iget(19071)==0&false))) {{
                            __CLR4_5_2en9en9lvl9eks1.R.inc(19072);pps.extended.scalindMatrix.ScalingList4x4[i] = ScalingList
                                    .read(reader, 16);
                        } }else {{
                            __CLR4_5_2en9en9lvl9eks1.R.inc(19073);pps.extended.scalindMatrix.ScalingList8x8[i - 6] = ScalingList
                                    .read(reader, 64);
                        }
                    }}
                }}
            }}
            }__CLR4_5_2en9en9lvl9eks1.R.inc(19074);pps.extended.second_chroma_qp_index_offset = reader
                    .readSE("PPS: second_chroma_qp_index_offset");
        }

        }__CLR4_5_2en9en9lvl9eks1.R.inc(19075);reader.readTrailingBits();

        __CLR4_5_2en9en9lvl9eks1.R.inc(19076);return pps;
    }finally{__CLR4_5_2en9en9lvl9eks1.R.flushNeeded();}}

    public void write(OutputStream out) throws IOException {try{__CLR4_5_2en9en9lvl9eks1.R.inc(19077);
        __CLR4_5_2en9en9lvl9eks1.R.inc(19078);CAVLCWriter writer = new CAVLCWriter(out);

        __CLR4_5_2en9en9lvl9eks1.R.inc(19079);writer.writeUE(pic_parameter_set_id, "PPS: pic_parameter_set_id");
        __CLR4_5_2en9en9lvl9eks1.R.inc(19080);writer.writeUE(seq_parameter_set_id, "PPS: seq_parameter_set_id");
        __CLR4_5_2en9en9lvl9eks1.R.inc(19081);writer.writeBool(entropy_coding_mode_flag,
                "PPS: entropy_coding_mode_flag");
        __CLR4_5_2en9en9lvl9eks1.R.inc(19082);writer.writeBool(bottom_field_pic_order_in_frame_present_flag, "PPS: pic_order_present_flag");
        __CLR4_5_2en9en9lvl9eks1.R.inc(19083);writer.writeUE(num_slice_groups_minus1, "PPS: num_slice_groups_minus1");
        __CLR4_5_2en9en9lvl9eks1.R.inc(19084);if ((((num_slice_groups_minus1 > 0)&&(__CLR4_5_2en9en9lvl9eks1.R.iget(19085)!=0|true))||(__CLR4_5_2en9en9lvl9eks1.R.iget(19086)==0&false))) {{
            __CLR4_5_2en9en9lvl9eks1.R.inc(19087);writer.writeUE(slice_group_map_type, "PPS: slice_group_map_type");
            __CLR4_5_2en9en9lvl9eks1.R.inc(19088);int[] top_left = new int[1];
            __CLR4_5_2en9en9lvl9eks1.R.inc(19089);int[] bottom_right = new int[1];
            __CLR4_5_2en9en9lvl9eks1.R.inc(19090);int[] run_length_minus1 = new int[1];
            __CLR4_5_2en9en9lvl9eks1.R.inc(19091);if ((((slice_group_map_type == 0)&&(__CLR4_5_2en9en9lvl9eks1.R.iget(19092)!=0|true))||(__CLR4_5_2en9en9lvl9eks1.R.iget(19093)==0&false))) {{
                __CLR4_5_2en9en9lvl9eks1.R.inc(19094);for (int iGroup = 0; (((iGroup <= num_slice_groups_minus1)&&(__CLR4_5_2en9en9lvl9eks1.R.iget(19095)!=0|true))||(__CLR4_5_2en9en9lvl9eks1.R.iget(19096)==0&false)); iGroup++) {{
                    __CLR4_5_2en9en9lvl9eks1.R.inc(19097);writer.writeUE(run_length_minus1[iGroup], "PPS: ");
                }
            }} }else {__CLR4_5_2en9en9lvl9eks1.R.inc(19098);if ((((slice_group_map_type == 2)&&(__CLR4_5_2en9en9lvl9eks1.R.iget(19099)!=0|true))||(__CLR4_5_2en9en9lvl9eks1.R.iget(19100)==0&false))) {{
                __CLR4_5_2en9en9lvl9eks1.R.inc(19101);for (int iGroup = 0; (((iGroup < num_slice_groups_minus1)&&(__CLR4_5_2en9en9lvl9eks1.R.iget(19102)!=0|true))||(__CLR4_5_2en9en9lvl9eks1.R.iget(19103)==0&false)); iGroup++) {{
                    __CLR4_5_2en9en9lvl9eks1.R.inc(19104);writer.writeUE(top_left[iGroup], "PPS: ");
                    __CLR4_5_2en9en9lvl9eks1.R.inc(19105);writer.writeUE(bottom_right[iGroup], "PPS: ");
                }
            }} }else {__CLR4_5_2en9en9lvl9eks1.R.inc(19106);if ((((slice_group_map_type == 3 || slice_group_map_type == 4
                    || slice_group_map_type == 5)&&(__CLR4_5_2en9en9lvl9eks1.R.iget(19107)!=0|true))||(__CLR4_5_2en9en9lvl9eks1.R.iget(19108)==0&false))) {{
                __CLR4_5_2en9en9lvl9eks1.R.inc(19109);writer.writeBool(slice_group_change_direction_flag,
                        "PPS: slice_group_change_direction_flag");
                __CLR4_5_2en9en9lvl9eks1.R.inc(19110);writer.writeUE(slice_group_change_rate_minus1,
                        "PPS: slice_group_change_rate_minus1");
            } }else {__CLR4_5_2en9en9lvl9eks1.R.inc(19111);if ((((slice_group_map_type == 6)&&(__CLR4_5_2en9en9lvl9eks1.R.iget(19112)!=0|true))||(__CLR4_5_2en9en9lvl9eks1.R.iget(19113)==0&false))) {{
                __CLR4_5_2en9en9lvl9eks1.R.inc(19114);int NumberBitsPerSliceGroupId;
                __CLR4_5_2en9en9lvl9eks1.R.inc(19115);if ((((num_slice_groups_minus1 + 1 > 4)&&(__CLR4_5_2en9en9lvl9eks1.R.iget(19116)!=0|true))||(__CLR4_5_2en9en9lvl9eks1.R.iget(19117)==0&false)))
                    {__CLR4_5_2en9en9lvl9eks1.R.inc(19118);NumberBitsPerSliceGroupId = 3;
                }else {__CLR4_5_2en9en9lvl9eks1.R.inc(19119);if ((((num_slice_groups_minus1 + 1 > 2)&&(__CLR4_5_2en9en9lvl9eks1.R.iget(19120)!=0|true))||(__CLR4_5_2en9en9lvl9eks1.R.iget(19121)==0&false)))
                    {__CLR4_5_2en9en9lvl9eks1.R.inc(19122);NumberBitsPerSliceGroupId = 2;
                }else
                    {__CLR4_5_2en9en9lvl9eks1.R.inc(19123);NumberBitsPerSliceGroupId = 1;
                }}__CLR4_5_2en9en9lvl9eks1.R.inc(19124);writer.writeUE(slice_group_id.length, "PPS: ");
                __CLR4_5_2en9en9lvl9eks1.R.inc(19125);for (int i = 0; (((i <= slice_group_id.length)&&(__CLR4_5_2en9en9lvl9eks1.R.iget(19126)!=0|true))||(__CLR4_5_2en9en9lvl9eks1.R.iget(19127)==0&false)); i++) {{
                    __CLR4_5_2en9en9lvl9eks1.R.inc(19128);writer.writeU(slice_group_id[i], NumberBitsPerSliceGroupId);
                }
            }}
        }}}}}
        }__CLR4_5_2en9en9lvl9eks1.R.inc(19129);writer.writeUE(num_ref_idx_l0_active_minus1,
                "PPS: num_ref_idx_l0_active_minus1");
        __CLR4_5_2en9en9lvl9eks1.R.inc(19130);writer.writeUE(num_ref_idx_l1_active_minus1,
                "PPS: num_ref_idx_l1_active_minus1");
        __CLR4_5_2en9en9lvl9eks1.R.inc(19131);writer.writeBool(weighted_pred_flag, "PPS: weighted_pred_flag");
        __CLR4_5_2en9en9lvl9eks1.R.inc(19132);writer.writeNBit(weighted_bipred_idc, 2, "PPS: weighted_bipred_idc");
        __CLR4_5_2en9en9lvl9eks1.R.inc(19133);writer.writeSE(pic_init_qp_minus26, "PPS: pic_init_qp_minus26");
        __CLR4_5_2en9en9lvl9eks1.R.inc(19134);writer.writeSE(pic_init_qs_minus26, "PPS: pic_init_qs_minus26");
        __CLR4_5_2en9en9lvl9eks1.R.inc(19135);writer.writeSE(chroma_qp_index_offset, "PPS: chroma_qp_index_offset");
        __CLR4_5_2en9en9lvl9eks1.R.inc(19136);writer.writeBool(deblocking_filter_control_present_flag,
                "PPS: deblocking_filter_control_present_flag");
        __CLR4_5_2en9en9lvl9eks1.R.inc(19137);writer.writeBool(constrained_intra_pred_flag,
                "PPS: constrained_intra_pred_flag");
        __CLR4_5_2en9en9lvl9eks1.R.inc(19138);writer.writeBool(redundant_pic_cnt_present_flag,
                "PPS: redundant_pic_cnt_present_flag");
        __CLR4_5_2en9en9lvl9eks1.R.inc(19139);if ((((extended != null)&&(__CLR4_5_2en9en9lvl9eks1.R.iget(19140)!=0|true))||(__CLR4_5_2en9en9lvl9eks1.R.iget(19141)==0&false))) {{
            __CLR4_5_2en9en9lvl9eks1.R.inc(19142);writer.writeBool(extended.transform_8x8_mode_flag,
                    "PPS: transform_8x8_mode_flag");
            __CLR4_5_2en9en9lvl9eks1.R.inc(19143);writer.writeBool(extended.scalindMatrix != null,
                    "PPS: scalindMatrix");
            __CLR4_5_2en9en9lvl9eks1.R.inc(19144);if ((((extended.scalindMatrix != null)&&(__CLR4_5_2en9en9lvl9eks1.R.iget(19145)!=0|true))||(__CLR4_5_2en9en9lvl9eks1.R.iget(19146)==0&false))) {{
                __CLR4_5_2en9en9lvl9eks1.R.inc(19147);for (int i = 0; (((i < 6 + 2 * ((((extended.transform_8x8_mode_flag )&&(__CLR4_5_2en9en9lvl9eks1.R.iget(19148)!=0|true))||(__CLR4_5_2en9en9lvl9eks1.R.iget(19149)==0&false))? 1
                        : 0))&&(__CLR4_5_2en9en9lvl9eks1.R.iget(19150)!=0|true))||(__CLR4_5_2en9en9lvl9eks1.R.iget(19151)==0&false)); i++) {{
                    __CLR4_5_2en9en9lvl9eks1.R.inc(19152);if ((((i < 6)&&(__CLR4_5_2en9en9lvl9eks1.R.iget(19153)!=0|true))||(__CLR4_5_2en9en9lvl9eks1.R.iget(19154)==0&false))) {{
                        __CLR4_5_2en9en9lvl9eks1.R.inc(19155);writer
                                .writeBool(
                                        extended.scalindMatrix.ScalingList4x4[i] != null,
                                        "PPS: ");
                        __CLR4_5_2en9en9lvl9eks1.R.inc(19156);if ((((extended.scalindMatrix.ScalingList4x4[i] != null)&&(__CLR4_5_2en9en9lvl9eks1.R.iget(19157)!=0|true))||(__CLR4_5_2en9en9lvl9eks1.R.iget(19158)==0&false))) {{
                            __CLR4_5_2en9en9lvl9eks1.R.inc(19159);extended.scalindMatrix.ScalingList4x4[i]
                                    .write(writer);
                        }

                    }} }else {{
                        __CLR4_5_2en9en9lvl9eks1.R.inc(19160);writer
                                .writeBool(
                                        extended.scalindMatrix.ScalingList8x8[i - 6] != null,
                                        "PPS: ");
                        __CLR4_5_2en9en9lvl9eks1.R.inc(19161);if ((((extended.scalindMatrix.ScalingList8x8[i - 6] != null)&&(__CLR4_5_2en9en9lvl9eks1.R.iget(19162)!=0|true))||(__CLR4_5_2en9en9lvl9eks1.R.iget(19163)==0&false))) {{
                            __CLR4_5_2en9en9lvl9eks1.R.inc(19164);extended.scalindMatrix.ScalingList8x8[i - 6]
                                    .write(writer);
                        }
                    }}
                }}
            }}
            }__CLR4_5_2en9en9lvl9eks1.R.inc(19165);writer.writeSE(extended.second_chroma_qp_index_offset, "PPS: ");
        }

        }__CLR4_5_2en9en9lvl9eks1.R.inc(19166);writer.writeTrailingBits();
    }finally{__CLR4_5_2en9en9lvl9eks1.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_5_2en9en9lvl9eks1.R.inc(19167);
        __CLR4_5_2en9en9lvl9eks1.R.inc(19168);final int prime = 31;
        __CLR4_5_2en9en9lvl9eks1.R.inc(19169);int result = 1;
        __CLR4_5_2en9en9lvl9eks1.R.inc(19170);result = prime * result + Arrays.hashCode(bottom_right);
        __CLR4_5_2en9en9lvl9eks1.R.inc(19171);result = prime * result + chroma_qp_index_offset;
        __CLR4_5_2en9en9lvl9eks1.R.inc(19172);result = prime * result + ((((constrained_intra_pred_flag )&&(__CLR4_5_2en9en9lvl9eks1.R.iget(19173)!=0|true))||(__CLR4_5_2en9en9lvl9eks1.R.iget(19174)==0&false))? 1231 : 1237);
        __CLR4_5_2en9en9lvl9eks1.R.inc(19175);result = prime * result
                + ((((deblocking_filter_control_present_flag )&&(__CLR4_5_2en9en9lvl9eks1.R.iget(19176)!=0|true))||(__CLR4_5_2en9en9lvl9eks1.R.iget(19177)==0&false))? 1231 : 1237);
        __CLR4_5_2en9en9lvl9eks1.R.inc(19178);result = prime * result + ((((entropy_coding_mode_flag )&&(__CLR4_5_2en9en9lvl9eks1.R.iget(19179)!=0|true))||(__CLR4_5_2en9en9lvl9eks1.R.iget(19180)==0&false))? 1231 : 1237);
        __CLR4_5_2en9en9lvl9eks1.R.inc(19181);result = prime * result
                + (((((extended == null) )&&(__CLR4_5_2en9en9lvl9eks1.R.iget(19182)!=0|true))||(__CLR4_5_2en9en9lvl9eks1.R.iget(19183)==0&false))? 0 : extended.hashCode());
        __CLR4_5_2en9en9lvl9eks1.R.inc(19184);result = prime * result + num_ref_idx_l0_active_minus1;
        __CLR4_5_2en9en9lvl9eks1.R.inc(19185);result = prime * result + num_ref_idx_l1_active_minus1;
        __CLR4_5_2en9en9lvl9eks1.R.inc(19186);result = prime * result + num_slice_groups_minus1;
        __CLR4_5_2en9en9lvl9eks1.R.inc(19187);result = prime * result + pic_init_qp_minus26;
        __CLR4_5_2en9en9lvl9eks1.R.inc(19188);result = prime * result + pic_init_qs_minus26;
        __CLR4_5_2en9en9lvl9eks1.R.inc(19189);result = prime * result + ((((bottom_field_pic_order_in_frame_present_flag )&&(__CLR4_5_2en9en9lvl9eks1.R.iget(19190)!=0|true))||(__CLR4_5_2en9en9lvl9eks1.R.iget(19191)==0&false))? 1231 : 1237);
        __CLR4_5_2en9en9lvl9eks1.R.inc(19192);result = prime * result + pic_parameter_set_id;
        __CLR4_5_2en9en9lvl9eks1.R.inc(19193);result = prime * result
                + ((((redundant_pic_cnt_present_flag )&&(__CLR4_5_2en9en9lvl9eks1.R.iget(19194)!=0|true))||(__CLR4_5_2en9en9lvl9eks1.R.iget(19195)==0&false))? 1231 : 1237);
        __CLR4_5_2en9en9lvl9eks1.R.inc(19196);result = prime * result + Arrays.hashCode(run_length_minus1);
        __CLR4_5_2en9en9lvl9eks1.R.inc(19197);result = prime * result + seq_parameter_set_id;
        __CLR4_5_2en9en9lvl9eks1.R.inc(19198);result = prime * result
                + ((((slice_group_change_direction_flag )&&(__CLR4_5_2en9en9lvl9eks1.R.iget(19199)!=0|true))||(__CLR4_5_2en9en9lvl9eks1.R.iget(19200)==0&false))? 1231 : 1237);
        __CLR4_5_2en9en9lvl9eks1.R.inc(19201);result = prime * result + slice_group_change_rate_minus1;
        __CLR4_5_2en9en9lvl9eks1.R.inc(19202);result = prime * result + Arrays.hashCode(slice_group_id);
        __CLR4_5_2en9en9lvl9eks1.R.inc(19203);result = prime * result + slice_group_map_type;
        __CLR4_5_2en9en9lvl9eks1.R.inc(19204);result = prime * result + Arrays.hashCode(top_left);
        __CLR4_5_2en9en9lvl9eks1.R.inc(19205);result = prime * result + weighted_bipred_idc;
        __CLR4_5_2en9en9lvl9eks1.R.inc(19206);result = prime * result + ((((weighted_pred_flag )&&(__CLR4_5_2en9en9lvl9eks1.R.iget(19207)!=0|true))||(__CLR4_5_2en9en9lvl9eks1.R.iget(19208)==0&false))? 1231 : 1237);
        __CLR4_5_2en9en9lvl9eks1.R.inc(19209);return result;
    }finally{__CLR4_5_2en9en9lvl9eks1.R.flushNeeded();}}

    @Override
    public boolean equals(Object obj) {try{__CLR4_5_2en9en9lvl9eks1.R.inc(19210);
        __CLR4_5_2en9en9lvl9eks1.R.inc(19211);if ((((this == obj)&&(__CLR4_5_2en9en9lvl9eks1.R.iget(19212)!=0|true))||(__CLR4_5_2en9en9lvl9eks1.R.iget(19213)==0&false)))
            {__CLR4_5_2en9en9lvl9eks1.R.inc(19214);return true;
        }__CLR4_5_2en9en9lvl9eks1.R.inc(19215);if ((((obj == null)&&(__CLR4_5_2en9en9lvl9eks1.R.iget(19216)!=0|true))||(__CLR4_5_2en9en9lvl9eks1.R.iget(19217)==0&false)))
            {__CLR4_5_2en9en9lvl9eks1.R.inc(19218);return false;
        }__CLR4_5_2en9en9lvl9eks1.R.inc(19219);if ((((getClass() != obj.getClass())&&(__CLR4_5_2en9en9lvl9eks1.R.iget(19220)!=0|true))||(__CLR4_5_2en9en9lvl9eks1.R.iget(19221)==0&false)))
            {__CLR4_5_2en9en9lvl9eks1.R.inc(19222);return false;
        }__CLR4_5_2en9en9lvl9eks1.R.inc(19223);PictureParameterSet other = (PictureParameterSet) obj;
        __CLR4_5_2en9en9lvl9eks1.R.inc(19224);if ((((!Arrays.equals(bottom_right, other.bottom_right))&&(__CLR4_5_2en9en9lvl9eks1.R.iget(19225)!=0|true))||(__CLR4_5_2en9en9lvl9eks1.R.iget(19226)==0&false)))
            {__CLR4_5_2en9en9lvl9eks1.R.inc(19227);return false;
        }__CLR4_5_2en9en9lvl9eks1.R.inc(19228);if ((((chroma_qp_index_offset != other.chroma_qp_index_offset)&&(__CLR4_5_2en9en9lvl9eks1.R.iget(19229)!=0|true))||(__CLR4_5_2en9en9lvl9eks1.R.iget(19230)==0&false)))
            {__CLR4_5_2en9en9lvl9eks1.R.inc(19231);return false;
        }__CLR4_5_2en9en9lvl9eks1.R.inc(19232);if ((((constrained_intra_pred_flag != other.constrained_intra_pred_flag)&&(__CLR4_5_2en9en9lvl9eks1.R.iget(19233)!=0|true))||(__CLR4_5_2en9en9lvl9eks1.R.iget(19234)==0&false)))
            {__CLR4_5_2en9en9lvl9eks1.R.inc(19235);return false;
        }__CLR4_5_2en9en9lvl9eks1.R.inc(19236);if ((((deblocking_filter_control_present_flag != other.deblocking_filter_control_present_flag)&&(__CLR4_5_2en9en9lvl9eks1.R.iget(19237)!=0|true))||(__CLR4_5_2en9en9lvl9eks1.R.iget(19238)==0&false)))
            {__CLR4_5_2en9en9lvl9eks1.R.inc(19239);return false;
        }__CLR4_5_2en9en9lvl9eks1.R.inc(19240);if ((((entropy_coding_mode_flag != other.entropy_coding_mode_flag)&&(__CLR4_5_2en9en9lvl9eks1.R.iget(19241)!=0|true))||(__CLR4_5_2en9en9lvl9eks1.R.iget(19242)==0&false)))
            {__CLR4_5_2en9en9lvl9eks1.R.inc(19243);return false;
        }__CLR4_5_2en9en9lvl9eks1.R.inc(19244);if ((((extended == null)&&(__CLR4_5_2en9en9lvl9eks1.R.iget(19245)!=0|true))||(__CLR4_5_2en9en9lvl9eks1.R.iget(19246)==0&false))) {{
            __CLR4_5_2en9en9lvl9eks1.R.inc(19247);if ((((other.extended != null)&&(__CLR4_5_2en9en9lvl9eks1.R.iget(19248)!=0|true))||(__CLR4_5_2en9en9lvl9eks1.R.iget(19249)==0&false)))
                {__CLR4_5_2en9en9lvl9eks1.R.inc(19250);return false;
        }} }else {__CLR4_5_2en9en9lvl9eks1.R.inc(19251);if ((((!extended.equals(other.extended))&&(__CLR4_5_2en9en9lvl9eks1.R.iget(19252)!=0|true))||(__CLR4_5_2en9en9lvl9eks1.R.iget(19253)==0&false)))
            {__CLR4_5_2en9en9lvl9eks1.R.inc(19254);return false;
        }}__CLR4_5_2en9en9lvl9eks1.R.inc(19255);if ((((num_ref_idx_l0_active_minus1 != other.num_ref_idx_l0_active_minus1)&&(__CLR4_5_2en9en9lvl9eks1.R.iget(19256)!=0|true))||(__CLR4_5_2en9en9lvl9eks1.R.iget(19257)==0&false)))
            {__CLR4_5_2en9en9lvl9eks1.R.inc(19258);return false;
        }__CLR4_5_2en9en9lvl9eks1.R.inc(19259);if ((((num_ref_idx_l1_active_minus1 != other.num_ref_idx_l1_active_minus1)&&(__CLR4_5_2en9en9lvl9eks1.R.iget(19260)!=0|true))||(__CLR4_5_2en9en9lvl9eks1.R.iget(19261)==0&false)))
            {__CLR4_5_2en9en9lvl9eks1.R.inc(19262);return false;
        }__CLR4_5_2en9en9lvl9eks1.R.inc(19263);if ((((num_slice_groups_minus1 != other.num_slice_groups_minus1)&&(__CLR4_5_2en9en9lvl9eks1.R.iget(19264)!=0|true))||(__CLR4_5_2en9en9lvl9eks1.R.iget(19265)==0&false)))
            {__CLR4_5_2en9en9lvl9eks1.R.inc(19266);return false;
        }__CLR4_5_2en9en9lvl9eks1.R.inc(19267);if ((((pic_init_qp_minus26 != other.pic_init_qp_minus26)&&(__CLR4_5_2en9en9lvl9eks1.R.iget(19268)!=0|true))||(__CLR4_5_2en9en9lvl9eks1.R.iget(19269)==0&false)))
            {__CLR4_5_2en9en9lvl9eks1.R.inc(19270);return false;
        }__CLR4_5_2en9en9lvl9eks1.R.inc(19271);if ((((pic_init_qs_minus26 != other.pic_init_qs_minus26)&&(__CLR4_5_2en9en9lvl9eks1.R.iget(19272)!=0|true))||(__CLR4_5_2en9en9lvl9eks1.R.iget(19273)==0&false)))
            {__CLR4_5_2en9en9lvl9eks1.R.inc(19274);return false;
        }__CLR4_5_2en9en9lvl9eks1.R.inc(19275);if ((((bottom_field_pic_order_in_frame_present_flag != other.bottom_field_pic_order_in_frame_present_flag)&&(__CLR4_5_2en9en9lvl9eks1.R.iget(19276)!=0|true))||(__CLR4_5_2en9en9lvl9eks1.R.iget(19277)==0&false)))
            {__CLR4_5_2en9en9lvl9eks1.R.inc(19278);return false;
        }__CLR4_5_2en9en9lvl9eks1.R.inc(19279);if ((((pic_parameter_set_id != other.pic_parameter_set_id)&&(__CLR4_5_2en9en9lvl9eks1.R.iget(19280)!=0|true))||(__CLR4_5_2en9en9lvl9eks1.R.iget(19281)==0&false)))
            {__CLR4_5_2en9en9lvl9eks1.R.inc(19282);return false;
        }__CLR4_5_2en9en9lvl9eks1.R.inc(19283);if ((((redundant_pic_cnt_present_flag != other.redundant_pic_cnt_present_flag)&&(__CLR4_5_2en9en9lvl9eks1.R.iget(19284)!=0|true))||(__CLR4_5_2en9en9lvl9eks1.R.iget(19285)==0&false)))
            {__CLR4_5_2en9en9lvl9eks1.R.inc(19286);return false;
        }__CLR4_5_2en9en9lvl9eks1.R.inc(19287);if ((((!Arrays.equals(run_length_minus1, other.run_length_minus1))&&(__CLR4_5_2en9en9lvl9eks1.R.iget(19288)!=0|true))||(__CLR4_5_2en9en9lvl9eks1.R.iget(19289)==0&false)))
            {__CLR4_5_2en9en9lvl9eks1.R.inc(19290);return false;
        }__CLR4_5_2en9en9lvl9eks1.R.inc(19291);if ((((seq_parameter_set_id != other.seq_parameter_set_id)&&(__CLR4_5_2en9en9lvl9eks1.R.iget(19292)!=0|true))||(__CLR4_5_2en9en9lvl9eks1.R.iget(19293)==0&false)))
            {__CLR4_5_2en9en9lvl9eks1.R.inc(19294);return false;
        }__CLR4_5_2en9en9lvl9eks1.R.inc(19295);if ((((slice_group_change_direction_flag != other.slice_group_change_direction_flag)&&(__CLR4_5_2en9en9lvl9eks1.R.iget(19296)!=0|true))||(__CLR4_5_2en9en9lvl9eks1.R.iget(19297)==0&false)))
            {__CLR4_5_2en9en9lvl9eks1.R.inc(19298);return false;
        }__CLR4_5_2en9en9lvl9eks1.R.inc(19299);if ((((slice_group_change_rate_minus1 != other.slice_group_change_rate_minus1)&&(__CLR4_5_2en9en9lvl9eks1.R.iget(19300)!=0|true))||(__CLR4_5_2en9en9lvl9eks1.R.iget(19301)==0&false)))
            {__CLR4_5_2en9en9lvl9eks1.R.inc(19302);return false;
        }__CLR4_5_2en9en9lvl9eks1.R.inc(19303);if ((((!Arrays.equals(slice_group_id, other.slice_group_id))&&(__CLR4_5_2en9en9lvl9eks1.R.iget(19304)!=0|true))||(__CLR4_5_2en9en9lvl9eks1.R.iget(19305)==0&false)))
            {__CLR4_5_2en9en9lvl9eks1.R.inc(19306);return false;
        }__CLR4_5_2en9en9lvl9eks1.R.inc(19307);if ((((slice_group_map_type != other.slice_group_map_type)&&(__CLR4_5_2en9en9lvl9eks1.R.iget(19308)!=0|true))||(__CLR4_5_2en9en9lvl9eks1.R.iget(19309)==0&false)))
            {__CLR4_5_2en9en9lvl9eks1.R.inc(19310);return false;
        }__CLR4_5_2en9en9lvl9eks1.R.inc(19311);if ((((!Arrays.equals(top_left, other.top_left))&&(__CLR4_5_2en9en9lvl9eks1.R.iget(19312)!=0|true))||(__CLR4_5_2en9en9lvl9eks1.R.iget(19313)==0&false)))
            {__CLR4_5_2en9en9lvl9eks1.R.inc(19314);return false;
        }__CLR4_5_2en9en9lvl9eks1.R.inc(19315);if ((((weighted_bipred_idc != other.weighted_bipred_idc)&&(__CLR4_5_2en9en9lvl9eks1.R.iget(19316)!=0|true))||(__CLR4_5_2en9en9lvl9eks1.R.iget(19317)==0&false)))
            {__CLR4_5_2en9en9lvl9eks1.R.inc(19318);return false;
        }__CLR4_5_2en9en9lvl9eks1.R.inc(19319);if ((((weighted_pred_flag != other.weighted_pred_flag)&&(__CLR4_5_2en9en9lvl9eks1.R.iget(19320)!=0|true))||(__CLR4_5_2en9en9lvl9eks1.R.iget(19321)==0&false)))
            {__CLR4_5_2en9en9lvl9eks1.R.inc(19322);return false;
        }__CLR4_5_2en9en9lvl9eks1.R.inc(19323);return true;
    }finally{__CLR4_5_2en9en9lvl9eks1.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_5_2en9en9lvl9eks1.R.inc(19324);
        __CLR4_5_2en9en9lvl9eks1.R.inc(19325);return "PictureParameterSet{" +
                "\n       entropy_coding_mode_flag=" + entropy_coding_mode_flag +
                ",\n       num_ref_idx_l0_active_minus1=" + num_ref_idx_l0_active_minus1 +
                ",\n       num_ref_idx_l1_active_minus1=" + num_ref_idx_l1_active_minus1 +
                ",\n       slice_group_change_rate_minus1=" + slice_group_change_rate_minus1 +
                ",\n       pic_parameter_set_id=" + pic_parameter_set_id +
                ",\n       seq_parameter_set_id=" + seq_parameter_set_id +
                ",\n       pic_order_present_flag=" + bottom_field_pic_order_in_frame_present_flag +
                ",\n       num_slice_groups_minus1=" + num_slice_groups_minus1 +
                ",\n       slice_group_map_type=" + slice_group_map_type +
                ",\n       weighted_pred_flag=" + weighted_pred_flag +
                ",\n       weighted_bipred_idc=" + weighted_bipred_idc +
                ",\n       pic_init_qp_minus26=" + pic_init_qp_minus26 +
                ",\n       pic_init_qs_minus26=" + pic_init_qs_minus26 +
                ",\n       chroma_qp_index_offset=" + chroma_qp_index_offset +
                ",\n       deblocking_filter_control_present_flag=" + deblocking_filter_control_present_flag +
                ",\n       constrained_intra_pred_flag=" + constrained_intra_pred_flag +
                ",\n       redundant_pic_cnt_present_flag=" + redundant_pic_cnt_present_flag +
                ",\n       top_left=" + top_left +
                ",\n       bottom_right=" + bottom_right +
                ",\n       run_length_minus1=" + run_length_minus1 +
                ",\n       slice_group_change_direction_flag=" + slice_group_change_direction_flag +
                ",\n       slice_group_id=" + slice_group_id +
                ",\n       extended=" + extended +
                '}';
    }finally{__CLR4_5_2en9en9lvl9eks1.R.flushNeeded();}}
}
