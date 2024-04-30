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
public class PictureParameterSet extends BitstreamElement {public static class __CLR4_5_2epwepwlvluln4g{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,19421,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static class PPSExt {
        public boolean transform_8x8_mode_flag;
        public ScalingMatrix scalindMatrix = new ScalingMatrix();
        public int second_chroma_qp_index_offset;
        public boolean[] pic_scaling_list_present_flag;

        @Override
        public String toString() {try{__CLR4_5_2epwepwlvluln4g.R.inc(19076);
            __CLR4_5_2epwepwlvluln4g.R.inc(19077);return "PPSExt{" +
                    "transform_8x8_mode_flag=" + transform_8x8_mode_flag +
                    ", scalindMatrix=" + scalindMatrix +
                    ", second_chroma_qp_index_offset=" + second_chroma_qp_index_offset +
                    ", pic_scaling_list_present_flag=" + pic_scaling_list_present_flag +
                    '}';
        }finally{__CLR4_5_2epwepwlvluln4g.R.flushNeeded();}}
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

    public static PictureParameterSet read(byte[] b) throws IOException {try{__CLR4_5_2epwepwlvluln4g.R.inc(19078);
        __CLR4_5_2epwepwlvluln4g.R.inc(19079);return read(new ByteArrayInputStream(b));
    }finally{__CLR4_5_2epwepwlvluln4g.R.flushNeeded();}}

    public static PictureParameterSet read(InputStream is) throws IOException {try{__CLR4_5_2epwepwlvluln4g.R.inc(19080);
        __CLR4_5_2epwepwlvluln4g.R.inc(19081);CAVLCReader reader = new CAVLCReader(is);
        __CLR4_5_2epwepwlvluln4g.R.inc(19082);PictureParameterSet pps = new PictureParameterSet();

        __CLR4_5_2epwepwlvluln4g.R.inc(19083);pps.pic_parameter_set_id = reader.readUE("PPS: pic_parameter_set_id");
        __CLR4_5_2epwepwlvluln4g.R.inc(19084);pps.seq_parameter_set_id = reader.readUE("PPS: seq_parameter_set_id");
        __CLR4_5_2epwepwlvluln4g.R.inc(19085);pps.entropy_coding_mode_flag = reader
                .readBool("PPS: entropy_coding_mode_flag");
        __CLR4_5_2epwepwlvluln4g.R.inc(19086);pps.bottom_field_pic_order_in_frame_present_flag = reader
                .readBool("PPS: pic_order_present_flag");
        __CLR4_5_2epwepwlvluln4g.R.inc(19087);pps.num_slice_groups_minus1 = reader
                .readUE("PPS: num_slice_groups_minus1");
        __CLR4_5_2epwepwlvluln4g.R.inc(19088);if ((((pps.num_slice_groups_minus1 > 0)&&(__CLR4_5_2epwepwlvluln4g.R.iget(19089)!=0|true))||(__CLR4_5_2epwepwlvluln4g.R.iget(19090)==0&false))) {{
            __CLR4_5_2epwepwlvluln4g.R.inc(19091);pps.slice_group_map_type = reader
                    .readUE("PPS: slice_group_map_type");
            __CLR4_5_2epwepwlvluln4g.R.inc(19092);pps.top_left = new int[pps.num_slice_groups_minus1 + 1];
            __CLR4_5_2epwepwlvluln4g.R.inc(19093);pps.bottom_right = new int[pps.num_slice_groups_minus1 + 1];
            __CLR4_5_2epwepwlvluln4g.R.inc(19094);pps.run_length_minus1 = new int[pps.num_slice_groups_minus1 + 1];
            __CLR4_5_2epwepwlvluln4g.R.inc(19095);if ((((pps.slice_group_map_type == 0)&&(__CLR4_5_2epwepwlvluln4g.R.iget(19096)!=0|true))||(__CLR4_5_2epwepwlvluln4g.R.iget(19097)==0&false)))
                {__CLR4_5_2epwepwlvluln4g.R.inc(19098);for (int iGroup = 0; (((iGroup <= pps.num_slice_groups_minus1)&&(__CLR4_5_2epwepwlvluln4g.R.iget(19099)!=0|true))||(__CLR4_5_2epwepwlvluln4g.R.iget(19100)==0&false)); iGroup++)
                    {__CLR4_5_2epwepwlvluln4g.R.inc(19101);pps.run_length_minus1[iGroup] = reader
                            .readUE("PPS: run_length_minus1");
            }}else {__CLR4_5_2epwepwlvluln4g.R.inc(19102);if ((((pps.slice_group_map_type == 2)&&(__CLR4_5_2epwepwlvluln4g.R.iget(19103)!=0|true))||(__CLR4_5_2epwepwlvluln4g.R.iget(19104)==0&false)))
                {__CLR4_5_2epwepwlvluln4g.R.inc(19105);for (int iGroup = 0; (((iGroup < pps.num_slice_groups_minus1)&&(__CLR4_5_2epwepwlvluln4g.R.iget(19106)!=0|true))||(__CLR4_5_2epwepwlvluln4g.R.iget(19107)==0&false)); iGroup++) {{
                    __CLR4_5_2epwepwlvluln4g.R.inc(19108);pps.top_left[iGroup] = reader.readUE("PPS: top_left");
                    __CLR4_5_2epwepwlvluln4g.R.inc(19109);pps.bottom_right[iGroup] = reader
                            .readUE("PPS: bottom_right");
                }
            }}else {__CLR4_5_2epwepwlvluln4g.R.inc(19110);if ((((pps.slice_group_map_type == 3
                    || pps.slice_group_map_type == 4
                    || pps.slice_group_map_type == 5)&&(__CLR4_5_2epwepwlvluln4g.R.iget(19111)!=0|true))||(__CLR4_5_2epwepwlvluln4g.R.iget(19112)==0&false))) {{
                __CLR4_5_2epwepwlvluln4g.R.inc(19113);pps.slice_group_change_direction_flag = reader
                        .readBool("PPS: slice_group_change_direction_flag");
                __CLR4_5_2epwepwlvluln4g.R.inc(19114);pps.slice_group_change_rate_minus1 = reader
                        .readUE("PPS: slice_group_change_rate_minus1");
            } }else {__CLR4_5_2epwepwlvluln4g.R.inc(19115);if ((((pps.slice_group_map_type == 6)&&(__CLR4_5_2epwepwlvluln4g.R.iget(19116)!=0|true))||(__CLR4_5_2epwepwlvluln4g.R.iget(19117)==0&false))) {{
                __CLR4_5_2epwepwlvluln4g.R.inc(19118);int NumberBitsPerSliceGroupId;
                __CLR4_5_2epwepwlvluln4g.R.inc(19119);if ((((pps.num_slice_groups_minus1 + 1 > 4)&&(__CLR4_5_2epwepwlvluln4g.R.iget(19120)!=0|true))||(__CLR4_5_2epwepwlvluln4g.R.iget(19121)==0&false)))
                    {__CLR4_5_2epwepwlvluln4g.R.inc(19122);NumberBitsPerSliceGroupId = 3;
                }else {__CLR4_5_2epwepwlvluln4g.R.inc(19123);if ((((pps.num_slice_groups_minus1 + 1 > 2)&&(__CLR4_5_2epwepwlvluln4g.R.iget(19124)!=0|true))||(__CLR4_5_2epwepwlvluln4g.R.iget(19125)==0&false)))
                    {__CLR4_5_2epwepwlvluln4g.R.inc(19126);NumberBitsPerSliceGroupId = 2;
                }else
                    {__CLR4_5_2epwepwlvluln4g.R.inc(19127);NumberBitsPerSliceGroupId = 1;
                }}__CLR4_5_2epwepwlvluln4g.R.inc(19128);int pic_size_in_map_units_minus1 = reader
                        .readUE("PPS: pic_size_in_map_units_minus1");
                __CLR4_5_2epwepwlvluln4g.R.inc(19129);pps.slice_group_id = new int[pic_size_in_map_units_minus1 + 1];
                __CLR4_5_2epwepwlvluln4g.R.inc(19130);for (int i = 0; (((i <= pic_size_in_map_units_minus1)&&(__CLR4_5_2epwepwlvluln4g.R.iget(19131)!=0|true))||(__CLR4_5_2epwepwlvluln4g.R.iget(19132)==0&false)); i++) {{
                    __CLR4_5_2epwepwlvluln4g.R.inc(19133);pps.slice_group_id[i] = reader.readU(
                            NumberBitsPerSliceGroupId, "PPS: slice_group_id ["
                            + i + "]f");
                }
            }}
        }}}}}
        }__CLR4_5_2epwepwlvluln4g.R.inc(19134);pps.num_ref_idx_l0_active_minus1 = reader
                .readUE("PPS: num_ref_idx_l0_active_minus1");
        __CLR4_5_2epwepwlvluln4g.R.inc(19135);pps.num_ref_idx_l1_active_minus1 = reader
                .readUE("PPS: num_ref_idx_l1_active_minus1");
        __CLR4_5_2epwepwlvluln4g.R.inc(19136);pps.weighted_pred_flag = reader.readBool("PPS: weighted_pred_flag");
        __CLR4_5_2epwepwlvluln4g.R.inc(19137);pps.weighted_bipred_idc = (int) reader.readNBit(2,
                "PPS: weighted_bipred_idc");
        __CLR4_5_2epwepwlvluln4g.R.inc(19138);pps.pic_init_qp_minus26 = reader.readSE("PPS: pic_init_qp_minus26");
        __CLR4_5_2epwepwlvluln4g.R.inc(19139);pps.pic_init_qs_minus26 = reader.readSE("PPS: pic_init_qs_minus26");
        __CLR4_5_2epwepwlvluln4g.R.inc(19140);pps.chroma_qp_index_offset = reader
                .readSE("PPS: chroma_qp_index_offset");
        __CLR4_5_2epwepwlvluln4g.R.inc(19141);pps.deblocking_filter_control_present_flag = reader
                .readBool("PPS: deblocking_filter_control_present_flag");
        __CLR4_5_2epwepwlvluln4g.R.inc(19142);pps.constrained_intra_pred_flag = reader
                .readBool("PPS: constrained_intra_pred_flag");
        __CLR4_5_2epwepwlvluln4g.R.inc(19143);pps.redundant_pic_cnt_present_flag = reader
                .readBool("PPS: redundant_pic_cnt_present_flag");
        __CLR4_5_2epwepwlvluln4g.R.inc(19144);if ((((reader.moreRBSPData())&&(__CLR4_5_2epwepwlvluln4g.R.iget(19145)!=0|true))||(__CLR4_5_2epwepwlvluln4g.R.iget(19146)==0&false))) {{
            __CLR4_5_2epwepwlvluln4g.R.inc(19147);pps.extended = new PictureParameterSet.PPSExt();
            __CLR4_5_2epwepwlvluln4g.R.inc(19148);pps.extended.transform_8x8_mode_flag = reader
                    .readBool("PPS: transform_8x8_mode_flag");
            __CLR4_5_2epwepwlvluln4g.R.inc(19149);boolean pic_scaling_matrix_present_flag = reader
                    .readBool("PPS: pic_scaling_matrix_present_flag");
            __CLR4_5_2epwepwlvluln4g.R.inc(19150);if ((((pic_scaling_matrix_present_flag)&&(__CLR4_5_2epwepwlvluln4g.R.iget(19151)!=0|true))||(__CLR4_5_2epwepwlvluln4g.R.iget(19152)==0&false))) {{
                __CLR4_5_2epwepwlvluln4g.R.inc(19153);for (int i = 0; (((i < 6 + 2 * ((((pps.extended.transform_8x8_mode_flag )&&(__CLR4_5_2epwepwlvluln4g.R.iget(19154)!=0|true))||(__CLR4_5_2epwepwlvluln4g.R.iget(19155)==0&false))? 1
                        : 0))&&(__CLR4_5_2epwepwlvluln4g.R.iget(19156)!=0|true))||(__CLR4_5_2epwepwlvluln4g.R.iget(19157)==0&false)); i++) {{
                    __CLR4_5_2epwepwlvluln4g.R.inc(19158);boolean pic_scaling_list_present_flag = reader
                            .readBool("PPS: pic_scaling_list_present_flag");
                    __CLR4_5_2epwepwlvluln4g.R.inc(19159);if ((((pic_scaling_list_present_flag)&&(__CLR4_5_2epwepwlvluln4g.R.iget(19160)!=0|true))||(__CLR4_5_2epwepwlvluln4g.R.iget(19161)==0&false))) {{
                        __CLR4_5_2epwepwlvluln4g.R.inc(19162);pps.extended.scalindMatrix.ScalingList4x4 = new ScalingList[8];
                        __CLR4_5_2epwepwlvluln4g.R.inc(19163);pps.extended.scalindMatrix.ScalingList8x8 = new ScalingList[8];
                        __CLR4_5_2epwepwlvluln4g.R.inc(19164);if ((((i < 6)&&(__CLR4_5_2epwepwlvluln4g.R.iget(19165)!=0|true))||(__CLR4_5_2epwepwlvluln4g.R.iget(19166)==0&false))) {{
                            __CLR4_5_2epwepwlvluln4g.R.inc(19167);pps.extended.scalindMatrix.ScalingList4x4[i] = ScalingList
                                    .read(reader, 16);
                        } }else {{
                            __CLR4_5_2epwepwlvluln4g.R.inc(19168);pps.extended.scalindMatrix.ScalingList8x8[i - 6] = ScalingList
                                    .read(reader, 64);
                        }
                    }}
                }}
            }}
            }__CLR4_5_2epwepwlvluln4g.R.inc(19169);pps.extended.second_chroma_qp_index_offset = reader
                    .readSE("PPS: second_chroma_qp_index_offset");
        }

        }__CLR4_5_2epwepwlvluln4g.R.inc(19170);reader.readTrailingBits();

        __CLR4_5_2epwepwlvluln4g.R.inc(19171);return pps;
    }finally{__CLR4_5_2epwepwlvluln4g.R.flushNeeded();}}

    public void write(OutputStream out) throws IOException {try{__CLR4_5_2epwepwlvluln4g.R.inc(19172);
        __CLR4_5_2epwepwlvluln4g.R.inc(19173);CAVLCWriter writer = new CAVLCWriter(out);

        __CLR4_5_2epwepwlvluln4g.R.inc(19174);writer.writeUE(pic_parameter_set_id, "PPS: pic_parameter_set_id");
        __CLR4_5_2epwepwlvluln4g.R.inc(19175);writer.writeUE(seq_parameter_set_id, "PPS: seq_parameter_set_id");
        __CLR4_5_2epwepwlvluln4g.R.inc(19176);writer.writeBool(entropy_coding_mode_flag,
                "PPS: entropy_coding_mode_flag");
        __CLR4_5_2epwepwlvluln4g.R.inc(19177);writer.writeBool(bottom_field_pic_order_in_frame_present_flag, "PPS: pic_order_present_flag");
        __CLR4_5_2epwepwlvluln4g.R.inc(19178);writer.writeUE(num_slice_groups_minus1, "PPS: num_slice_groups_minus1");
        __CLR4_5_2epwepwlvluln4g.R.inc(19179);if ((((num_slice_groups_minus1 > 0)&&(__CLR4_5_2epwepwlvluln4g.R.iget(19180)!=0|true))||(__CLR4_5_2epwepwlvluln4g.R.iget(19181)==0&false))) {{
            __CLR4_5_2epwepwlvluln4g.R.inc(19182);writer.writeUE(slice_group_map_type, "PPS: slice_group_map_type");
            __CLR4_5_2epwepwlvluln4g.R.inc(19183);int[] top_left = new int[1];
            __CLR4_5_2epwepwlvluln4g.R.inc(19184);int[] bottom_right = new int[1];
            __CLR4_5_2epwepwlvluln4g.R.inc(19185);int[] run_length_minus1 = new int[1];
            __CLR4_5_2epwepwlvluln4g.R.inc(19186);if ((((slice_group_map_type == 0)&&(__CLR4_5_2epwepwlvluln4g.R.iget(19187)!=0|true))||(__CLR4_5_2epwepwlvluln4g.R.iget(19188)==0&false))) {{
                __CLR4_5_2epwepwlvluln4g.R.inc(19189);for (int iGroup = 0; (((iGroup <= num_slice_groups_minus1)&&(__CLR4_5_2epwepwlvluln4g.R.iget(19190)!=0|true))||(__CLR4_5_2epwepwlvluln4g.R.iget(19191)==0&false)); iGroup++) {{
                    __CLR4_5_2epwepwlvluln4g.R.inc(19192);writer.writeUE(run_length_minus1[iGroup], "PPS: ");
                }
            }} }else {__CLR4_5_2epwepwlvluln4g.R.inc(19193);if ((((slice_group_map_type == 2)&&(__CLR4_5_2epwepwlvluln4g.R.iget(19194)!=0|true))||(__CLR4_5_2epwepwlvluln4g.R.iget(19195)==0&false))) {{
                __CLR4_5_2epwepwlvluln4g.R.inc(19196);for (int iGroup = 0; (((iGroup < num_slice_groups_minus1)&&(__CLR4_5_2epwepwlvluln4g.R.iget(19197)!=0|true))||(__CLR4_5_2epwepwlvluln4g.R.iget(19198)==0&false)); iGroup++) {{
                    __CLR4_5_2epwepwlvluln4g.R.inc(19199);writer.writeUE(top_left[iGroup], "PPS: ");
                    __CLR4_5_2epwepwlvluln4g.R.inc(19200);writer.writeUE(bottom_right[iGroup], "PPS: ");
                }
            }} }else {__CLR4_5_2epwepwlvluln4g.R.inc(19201);if ((((slice_group_map_type == 3 || slice_group_map_type == 4
                    || slice_group_map_type == 5)&&(__CLR4_5_2epwepwlvluln4g.R.iget(19202)!=0|true))||(__CLR4_5_2epwepwlvluln4g.R.iget(19203)==0&false))) {{
                __CLR4_5_2epwepwlvluln4g.R.inc(19204);writer.writeBool(slice_group_change_direction_flag,
                        "PPS: slice_group_change_direction_flag");
                __CLR4_5_2epwepwlvluln4g.R.inc(19205);writer.writeUE(slice_group_change_rate_minus1,
                        "PPS: slice_group_change_rate_minus1");
            } }else {__CLR4_5_2epwepwlvluln4g.R.inc(19206);if ((((slice_group_map_type == 6)&&(__CLR4_5_2epwepwlvluln4g.R.iget(19207)!=0|true))||(__CLR4_5_2epwepwlvluln4g.R.iget(19208)==0&false))) {{
                __CLR4_5_2epwepwlvluln4g.R.inc(19209);int NumberBitsPerSliceGroupId;
                __CLR4_5_2epwepwlvluln4g.R.inc(19210);if ((((num_slice_groups_minus1 + 1 > 4)&&(__CLR4_5_2epwepwlvluln4g.R.iget(19211)!=0|true))||(__CLR4_5_2epwepwlvluln4g.R.iget(19212)==0&false)))
                    {__CLR4_5_2epwepwlvluln4g.R.inc(19213);NumberBitsPerSliceGroupId = 3;
                }else {__CLR4_5_2epwepwlvluln4g.R.inc(19214);if ((((num_slice_groups_minus1 + 1 > 2)&&(__CLR4_5_2epwepwlvluln4g.R.iget(19215)!=0|true))||(__CLR4_5_2epwepwlvluln4g.R.iget(19216)==0&false)))
                    {__CLR4_5_2epwepwlvluln4g.R.inc(19217);NumberBitsPerSliceGroupId = 2;
                }else
                    {__CLR4_5_2epwepwlvluln4g.R.inc(19218);NumberBitsPerSliceGroupId = 1;
                }}__CLR4_5_2epwepwlvluln4g.R.inc(19219);writer.writeUE(slice_group_id.length, "PPS: ");
                __CLR4_5_2epwepwlvluln4g.R.inc(19220);for (int i = 0; (((i <= slice_group_id.length)&&(__CLR4_5_2epwepwlvluln4g.R.iget(19221)!=0|true))||(__CLR4_5_2epwepwlvluln4g.R.iget(19222)==0&false)); i++) {{
                    __CLR4_5_2epwepwlvluln4g.R.inc(19223);writer.writeU(slice_group_id[i], NumberBitsPerSliceGroupId);
                }
            }}
        }}}}}
        }__CLR4_5_2epwepwlvluln4g.R.inc(19224);writer.writeUE(num_ref_idx_l0_active_minus1,
                "PPS: num_ref_idx_l0_active_minus1");
        __CLR4_5_2epwepwlvluln4g.R.inc(19225);writer.writeUE(num_ref_idx_l1_active_minus1,
                "PPS: num_ref_idx_l1_active_minus1");
        __CLR4_5_2epwepwlvluln4g.R.inc(19226);writer.writeBool(weighted_pred_flag, "PPS: weighted_pred_flag");
        __CLR4_5_2epwepwlvluln4g.R.inc(19227);writer.writeNBit(weighted_bipred_idc, 2, "PPS: weighted_bipred_idc");
        __CLR4_5_2epwepwlvluln4g.R.inc(19228);writer.writeSE(pic_init_qp_minus26, "PPS: pic_init_qp_minus26");
        __CLR4_5_2epwepwlvluln4g.R.inc(19229);writer.writeSE(pic_init_qs_minus26, "PPS: pic_init_qs_minus26");
        __CLR4_5_2epwepwlvluln4g.R.inc(19230);writer.writeSE(chroma_qp_index_offset, "PPS: chroma_qp_index_offset");
        __CLR4_5_2epwepwlvluln4g.R.inc(19231);writer.writeBool(deblocking_filter_control_present_flag,
                "PPS: deblocking_filter_control_present_flag");
        __CLR4_5_2epwepwlvluln4g.R.inc(19232);writer.writeBool(constrained_intra_pred_flag,
                "PPS: constrained_intra_pred_flag");
        __CLR4_5_2epwepwlvluln4g.R.inc(19233);writer.writeBool(redundant_pic_cnt_present_flag,
                "PPS: redundant_pic_cnt_present_flag");
        __CLR4_5_2epwepwlvluln4g.R.inc(19234);if ((((extended != null)&&(__CLR4_5_2epwepwlvluln4g.R.iget(19235)!=0|true))||(__CLR4_5_2epwepwlvluln4g.R.iget(19236)==0&false))) {{
            __CLR4_5_2epwepwlvluln4g.R.inc(19237);writer.writeBool(extended.transform_8x8_mode_flag,
                    "PPS: transform_8x8_mode_flag");
            __CLR4_5_2epwepwlvluln4g.R.inc(19238);writer.writeBool(extended.scalindMatrix != null,
                    "PPS: scalindMatrix");
            __CLR4_5_2epwepwlvluln4g.R.inc(19239);if ((((extended.scalindMatrix != null)&&(__CLR4_5_2epwepwlvluln4g.R.iget(19240)!=0|true))||(__CLR4_5_2epwepwlvluln4g.R.iget(19241)==0&false))) {{
                __CLR4_5_2epwepwlvluln4g.R.inc(19242);for (int i = 0; (((i < 6 + 2 * ((((extended.transform_8x8_mode_flag )&&(__CLR4_5_2epwepwlvluln4g.R.iget(19243)!=0|true))||(__CLR4_5_2epwepwlvluln4g.R.iget(19244)==0&false))? 1
                        : 0))&&(__CLR4_5_2epwepwlvluln4g.R.iget(19245)!=0|true))||(__CLR4_5_2epwepwlvluln4g.R.iget(19246)==0&false)); i++) {{
                    __CLR4_5_2epwepwlvluln4g.R.inc(19247);if ((((i < 6)&&(__CLR4_5_2epwepwlvluln4g.R.iget(19248)!=0|true))||(__CLR4_5_2epwepwlvluln4g.R.iget(19249)==0&false))) {{
                        __CLR4_5_2epwepwlvluln4g.R.inc(19250);writer
                                .writeBool(
                                        extended.scalindMatrix.ScalingList4x4[i] != null,
                                        "PPS: ");
                        __CLR4_5_2epwepwlvluln4g.R.inc(19251);if ((((extended.scalindMatrix.ScalingList4x4[i] != null)&&(__CLR4_5_2epwepwlvluln4g.R.iget(19252)!=0|true))||(__CLR4_5_2epwepwlvluln4g.R.iget(19253)==0&false))) {{
                            __CLR4_5_2epwepwlvluln4g.R.inc(19254);extended.scalindMatrix.ScalingList4x4[i]
                                    .write(writer);
                        }

                    }} }else {{
                        __CLR4_5_2epwepwlvluln4g.R.inc(19255);writer
                                .writeBool(
                                        extended.scalindMatrix.ScalingList8x8[i - 6] != null,
                                        "PPS: ");
                        __CLR4_5_2epwepwlvluln4g.R.inc(19256);if ((((extended.scalindMatrix.ScalingList8x8[i - 6] != null)&&(__CLR4_5_2epwepwlvluln4g.R.iget(19257)!=0|true))||(__CLR4_5_2epwepwlvluln4g.R.iget(19258)==0&false))) {{
                            __CLR4_5_2epwepwlvluln4g.R.inc(19259);extended.scalindMatrix.ScalingList8x8[i - 6]
                                    .write(writer);
                        }
                    }}
                }}
            }}
            }__CLR4_5_2epwepwlvluln4g.R.inc(19260);writer.writeSE(extended.second_chroma_qp_index_offset, "PPS: ");
        }

        }__CLR4_5_2epwepwlvluln4g.R.inc(19261);writer.writeTrailingBits();
    }finally{__CLR4_5_2epwepwlvluln4g.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_5_2epwepwlvluln4g.R.inc(19262);
        __CLR4_5_2epwepwlvluln4g.R.inc(19263);final int prime = 31;
        __CLR4_5_2epwepwlvluln4g.R.inc(19264);int result = 1;
        __CLR4_5_2epwepwlvluln4g.R.inc(19265);result = prime * result + Arrays.hashCode(bottom_right);
        __CLR4_5_2epwepwlvluln4g.R.inc(19266);result = prime * result + chroma_qp_index_offset;
        __CLR4_5_2epwepwlvluln4g.R.inc(19267);result = prime * result + ((((constrained_intra_pred_flag )&&(__CLR4_5_2epwepwlvluln4g.R.iget(19268)!=0|true))||(__CLR4_5_2epwepwlvluln4g.R.iget(19269)==0&false))? 1231 : 1237);
        __CLR4_5_2epwepwlvluln4g.R.inc(19270);result = prime * result
                + ((((deblocking_filter_control_present_flag )&&(__CLR4_5_2epwepwlvluln4g.R.iget(19271)!=0|true))||(__CLR4_5_2epwepwlvluln4g.R.iget(19272)==0&false))? 1231 : 1237);
        __CLR4_5_2epwepwlvluln4g.R.inc(19273);result = prime * result + ((((entropy_coding_mode_flag )&&(__CLR4_5_2epwepwlvluln4g.R.iget(19274)!=0|true))||(__CLR4_5_2epwepwlvluln4g.R.iget(19275)==0&false))? 1231 : 1237);
        __CLR4_5_2epwepwlvluln4g.R.inc(19276);result = prime * result
                + (((((extended == null) )&&(__CLR4_5_2epwepwlvluln4g.R.iget(19277)!=0|true))||(__CLR4_5_2epwepwlvluln4g.R.iget(19278)==0&false))? 0 : extended.hashCode());
        __CLR4_5_2epwepwlvluln4g.R.inc(19279);result = prime * result + num_ref_idx_l0_active_minus1;
        __CLR4_5_2epwepwlvluln4g.R.inc(19280);result = prime * result + num_ref_idx_l1_active_minus1;
        __CLR4_5_2epwepwlvluln4g.R.inc(19281);result = prime * result + num_slice_groups_minus1;
        __CLR4_5_2epwepwlvluln4g.R.inc(19282);result = prime * result + pic_init_qp_minus26;
        __CLR4_5_2epwepwlvluln4g.R.inc(19283);result = prime * result + pic_init_qs_minus26;
        __CLR4_5_2epwepwlvluln4g.R.inc(19284);result = prime * result + ((((bottom_field_pic_order_in_frame_present_flag )&&(__CLR4_5_2epwepwlvluln4g.R.iget(19285)!=0|true))||(__CLR4_5_2epwepwlvluln4g.R.iget(19286)==0&false))? 1231 : 1237);
        __CLR4_5_2epwepwlvluln4g.R.inc(19287);result = prime * result + pic_parameter_set_id;
        __CLR4_5_2epwepwlvluln4g.R.inc(19288);result = prime * result
                + ((((redundant_pic_cnt_present_flag )&&(__CLR4_5_2epwepwlvluln4g.R.iget(19289)!=0|true))||(__CLR4_5_2epwepwlvluln4g.R.iget(19290)==0&false))? 1231 : 1237);
        __CLR4_5_2epwepwlvluln4g.R.inc(19291);result = prime * result + Arrays.hashCode(run_length_minus1);
        __CLR4_5_2epwepwlvluln4g.R.inc(19292);result = prime * result + seq_parameter_set_id;
        __CLR4_5_2epwepwlvluln4g.R.inc(19293);result = prime * result
                + ((((slice_group_change_direction_flag )&&(__CLR4_5_2epwepwlvluln4g.R.iget(19294)!=0|true))||(__CLR4_5_2epwepwlvluln4g.R.iget(19295)==0&false))? 1231 : 1237);
        __CLR4_5_2epwepwlvluln4g.R.inc(19296);result = prime * result + slice_group_change_rate_minus1;
        __CLR4_5_2epwepwlvluln4g.R.inc(19297);result = prime * result + Arrays.hashCode(slice_group_id);
        __CLR4_5_2epwepwlvluln4g.R.inc(19298);result = prime * result + slice_group_map_type;
        __CLR4_5_2epwepwlvluln4g.R.inc(19299);result = prime * result + Arrays.hashCode(top_left);
        __CLR4_5_2epwepwlvluln4g.R.inc(19300);result = prime * result + weighted_bipred_idc;
        __CLR4_5_2epwepwlvluln4g.R.inc(19301);result = prime * result + ((((weighted_pred_flag )&&(__CLR4_5_2epwepwlvluln4g.R.iget(19302)!=0|true))||(__CLR4_5_2epwepwlvluln4g.R.iget(19303)==0&false))? 1231 : 1237);
        __CLR4_5_2epwepwlvluln4g.R.inc(19304);return result;
    }finally{__CLR4_5_2epwepwlvluln4g.R.flushNeeded();}}

    @Override
    public boolean equals(Object obj) {try{__CLR4_5_2epwepwlvluln4g.R.inc(19305);
        __CLR4_5_2epwepwlvluln4g.R.inc(19306);if ((((this == obj)&&(__CLR4_5_2epwepwlvluln4g.R.iget(19307)!=0|true))||(__CLR4_5_2epwepwlvluln4g.R.iget(19308)==0&false)))
            {__CLR4_5_2epwepwlvluln4g.R.inc(19309);return true;
        }__CLR4_5_2epwepwlvluln4g.R.inc(19310);if ((((obj == null)&&(__CLR4_5_2epwepwlvluln4g.R.iget(19311)!=0|true))||(__CLR4_5_2epwepwlvluln4g.R.iget(19312)==0&false)))
            {__CLR4_5_2epwepwlvluln4g.R.inc(19313);return false;
        }__CLR4_5_2epwepwlvluln4g.R.inc(19314);if ((((getClass() != obj.getClass())&&(__CLR4_5_2epwepwlvluln4g.R.iget(19315)!=0|true))||(__CLR4_5_2epwepwlvluln4g.R.iget(19316)==0&false)))
            {__CLR4_5_2epwepwlvluln4g.R.inc(19317);return false;
        }__CLR4_5_2epwepwlvluln4g.R.inc(19318);PictureParameterSet other = (PictureParameterSet) obj;
        __CLR4_5_2epwepwlvluln4g.R.inc(19319);if ((((!Arrays.equals(bottom_right, other.bottom_right))&&(__CLR4_5_2epwepwlvluln4g.R.iget(19320)!=0|true))||(__CLR4_5_2epwepwlvluln4g.R.iget(19321)==0&false)))
            {__CLR4_5_2epwepwlvluln4g.R.inc(19322);return false;
        }__CLR4_5_2epwepwlvluln4g.R.inc(19323);if ((((chroma_qp_index_offset != other.chroma_qp_index_offset)&&(__CLR4_5_2epwepwlvluln4g.R.iget(19324)!=0|true))||(__CLR4_5_2epwepwlvluln4g.R.iget(19325)==0&false)))
            {__CLR4_5_2epwepwlvluln4g.R.inc(19326);return false;
        }__CLR4_5_2epwepwlvluln4g.R.inc(19327);if ((((constrained_intra_pred_flag != other.constrained_intra_pred_flag)&&(__CLR4_5_2epwepwlvluln4g.R.iget(19328)!=0|true))||(__CLR4_5_2epwepwlvluln4g.R.iget(19329)==0&false)))
            {__CLR4_5_2epwepwlvluln4g.R.inc(19330);return false;
        }__CLR4_5_2epwepwlvluln4g.R.inc(19331);if ((((deblocking_filter_control_present_flag != other.deblocking_filter_control_present_flag)&&(__CLR4_5_2epwepwlvluln4g.R.iget(19332)!=0|true))||(__CLR4_5_2epwepwlvluln4g.R.iget(19333)==0&false)))
            {__CLR4_5_2epwepwlvluln4g.R.inc(19334);return false;
        }__CLR4_5_2epwepwlvluln4g.R.inc(19335);if ((((entropy_coding_mode_flag != other.entropy_coding_mode_flag)&&(__CLR4_5_2epwepwlvluln4g.R.iget(19336)!=0|true))||(__CLR4_5_2epwepwlvluln4g.R.iget(19337)==0&false)))
            {__CLR4_5_2epwepwlvluln4g.R.inc(19338);return false;
        }__CLR4_5_2epwepwlvluln4g.R.inc(19339);if ((((extended == null)&&(__CLR4_5_2epwepwlvluln4g.R.iget(19340)!=0|true))||(__CLR4_5_2epwepwlvluln4g.R.iget(19341)==0&false))) {{
            __CLR4_5_2epwepwlvluln4g.R.inc(19342);if ((((other.extended != null)&&(__CLR4_5_2epwepwlvluln4g.R.iget(19343)!=0|true))||(__CLR4_5_2epwepwlvluln4g.R.iget(19344)==0&false)))
                {__CLR4_5_2epwepwlvluln4g.R.inc(19345);return false;
        }} }else {__CLR4_5_2epwepwlvluln4g.R.inc(19346);if ((((!extended.equals(other.extended))&&(__CLR4_5_2epwepwlvluln4g.R.iget(19347)!=0|true))||(__CLR4_5_2epwepwlvluln4g.R.iget(19348)==0&false)))
            {__CLR4_5_2epwepwlvluln4g.R.inc(19349);return false;
        }}__CLR4_5_2epwepwlvluln4g.R.inc(19350);if ((((num_ref_idx_l0_active_minus1 != other.num_ref_idx_l0_active_minus1)&&(__CLR4_5_2epwepwlvluln4g.R.iget(19351)!=0|true))||(__CLR4_5_2epwepwlvluln4g.R.iget(19352)==0&false)))
            {__CLR4_5_2epwepwlvluln4g.R.inc(19353);return false;
        }__CLR4_5_2epwepwlvluln4g.R.inc(19354);if ((((num_ref_idx_l1_active_minus1 != other.num_ref_idx_l1_active_minus1)&&(__CLR4_5_2epwepwlvluln4g.R.iget(19355)!=0|true))||(__CLR4_5_2epwepwlvluln4g.R.iget(19356)==0&false)))
            {__CLR4_5_2epwepwlvluln4g.R.inc(19357);return false;
        }__CLR4_5_2epwepwlvluln4g.R.inc(19358);if ((((num_slice_groups_minus1 != other.num_slice_groups_minus1)&&(__CLR4_5_2epwepwlvluln4g.R.iget(19359)!=0|true))||(__CLR4_5_2epwepwlvluln4g.R.iget(19360)==0&false)))
            {__CLR4_5_2epwepwlvluln4g.R.inc(19361);return false;
        }__CLR4_5_2epwepwlvluln4g.R.inc(19362);if ((((pic_init_qp_minus26 != other.pic_init_qp_minus26)&&(__CLR4_5_2epwepwlvluln4g.R.iget(19363)!=0|true))||(__CLR4_5_2epwepwlvluln4g.R.iget(19364)==0&false)))
            {__CLR4_5_2epwepwlvluln4g.R.inc(19365);return false;
        }__CLR4_5_2epwepwlvluln4g.R.inc(19366);if ((((pic_init_qs_minus26 != other.pic_init_qs_minus26)&&(__CLR4_5_2epwepwlvluln4g.R.iget(19367)!=0|true))||(__CLR4_5_2epwepwlvluln4g.R.iget(19368)==0&false)))
            {__CLR4_5_2epwepwlvluln4g.R.inc(19369);return false;
        }__CLR4_5_2epwepwlvluln4g.R.inc(19370);if ((((bottom_field_pic_order_in_frame_present_flag != other.bottom_field_pic_order_in_frame_present_flag)&&(__CLR4_5_2epwepwlvluln4g.R.iget(19371)!=0|true))||(__CLR4_5_2epwepwlvluln4g.R.iget(19372)==0&false)))
            {__CLR4_5_2epwepwlvluln4g.R.inc(19373);return false;
        }__CLR4_5_2epwepwlvluln4g.R.inc(19374);if ((((pic_parameter_set_id != other.pic_parameter_set_id)&&(__CLR4_5_2epwepwlvluln4g.R.iget(19375)!=0|true))||(__CLR4_5_2epwepwlvluln4g.R.iget(19376)==0&false)))
            {__CLR4_5_2epwepwlvluln4g.R.inc(19377);return false;
        }__CLR4_5_2epwepwlvluln4g.R.inc(19378);if ((((redundant_pic_cnt_present_flag != other.redundant_pic_cnt_present_flag)&&(__CLR4_5_2epwepwlvluln4g.R.iget(19379)!=0|true))||(__CLR4_5_2epwepwlvluln4g.R.iget(19380)==0&false)))
            {__CLR4_5_2epwepwlvluln4g.R.inc(19381);return false;
        }__CLR4_5_2epwepwlvluln4g.R.inc(19382);if ((((!Arrays.equals(run_length_minus1, other.run_length_minus1))&&(__CLR4_5_2epwepwlvluln4g.R.iget(19383)!=0|true))||(__CLR4_5_2epwepwlvluln4g.R.iget(19384)==0&false)))
            {__CLR4_5_2epwepwlvluln4g.R.inc(19385);return false;
        }__CLR4_5_2epwepwlvluln4g.R.inc(19386);if ((((seq_parameter_set_id != other.seq_parameter_set_id)&&(__CLR4_5_2epwepwlvluln4g.R.iget(19387)!=0|true))||(__CLR4_5_2epwepwlvluln4g.R.iget(19388)==0&false)))
            {__CLR4_5_2epwepwlvluln4g.R.inc(19389);return false;
        }__CLR4_5_2epwepwlvluln4g.R.inc(19390);if ((((slice_group_change_direction_flag != other.slice_group_change_direction_flag)&&(__CLR4_5_2epwepwlvluln4g.R.iget(19391)!=0|true))||(__CLR4_5_2epwepwlvluln4g.R.iget(19392)==0&false)))
            {__CLR4_5_2epwepwlvluln4g.R.inc(19393);return false;
        }__CLR4_5_2epwepwlvluln4g.R.inc(19394);if ((((slice_group_change_rate_minus1 != other.slice_group_change_rate_minus1)&&(__CLR4_5_2epwepwlvluln4g.R.iget(19395)!=0|true))||(__CLR4_5_2epwepwlvluln4g.R.iget(19396)==0&false)))
            {__CLR4_5_2epwepwlvluln4g.R.inc(19397);return false;
        }__CLR4_5_2epwepwlvluln4g.R.inc(19398);if ((((!Arrays.equals(slice_group_id, other.slice_group_id))&&(__CLR4_5_2epwepwlvluln4g.R.iget(19399)!=0|true))||(__CLR4_5_2epwepwlvluln4g.R.iget(19400)==0&false)))
            {__CLR4_5_2epwepwlvluln4g.R.inc(19401);return false;
        }__CLR4_5_2epwepwlvluln4g.R.inc(19402);if ((((slice_group_map_type != other.slice_group_map_type)&&(__CLR4_5_2epwepwlvluln4g.R.iget(19403)!=0|true))||(__CLR4_5_2epwepwlvluln4g.R.iget(19404)==0&false)))
            {__CLR4_5_2epwepwlvluln4g.R.inc(19405);return false;
        }__CLR4_5_2epwepwlvluln4g.R.inc(19406);if ((((!Arrays.equals(top_left, other.top_left))&&(__CLR4_5_2epwepwlvluln4g.R.iget(19407)!=0|true))||(__CLR4_5_2epwepwlvluln4g.R.iget(19408)==0&false)))
            {__CLR4_5_2epwepwlvluln4g.R.inc(19409);return false;
        }__CLR4_5_2epwepwlvluln4g.R.inc(19410);if ((((weighted_bipred_idc != other.weighted_bipred_idc)&&(__CLR4_5_2epwepwlvluln4g.R.iget(19411)!=0|true))||(__CLR4_5_2epwepwlvluln4g.R.iget(19412)==0&false)))
            {__CLR4_5_2epwepwlvluln4g.R.inc(19413);return false;
        }__CLR4_5_2epwepwlvluln4g.R.inc(19414);if ((((weighted_pred_flag != other.weighted_pred_flag)&&(__CLR4_5_2epwepwlvluln4g.R.iget(19415)!=0|true))||(__CLR4_5_2epwepwlvluln4g.R.iget(19416)==0&false)))
            {__CLR4_5_2epwepwlvluln4g.R.inc(19417);return false;
        }__CLR4_5_2epwepwlvluln4g.R.inc(19418);return true;
    }finally{__CLR4_5_2epwepwlvluln4g.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_5_2epwepwlvluln4g.R.inc(19419);
        __CLR4_5_2epwepwlvluln4g.R.inc(19420);return "PictureParameterSet{" +
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
    }finally{__CLR4_5_2epwepwlvluln4g.R.flushNeeded();}}
}
