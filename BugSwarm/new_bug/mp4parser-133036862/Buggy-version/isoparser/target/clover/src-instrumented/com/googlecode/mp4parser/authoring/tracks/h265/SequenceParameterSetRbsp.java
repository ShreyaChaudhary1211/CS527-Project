/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.googlecode.mp4parser.authoring.tracks.h265;

import com.googlecode.mp4parser.h264.read.BitstreamReader;
import com.googlecode.mp4parser.h264.read.CAVLCReader;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by sannies on 03.02.2015.
 */
public class SequenceParameterSetRbsp {public static class __CLR4_5_29op9oplvluliqt{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,12720,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public SequenceParameterSetRbsp(InputStream is) throws IOException {try{__CLR4_5_29op9oplvluliqt.R.inc(12553);
        __CLR4_5_29op9oplvluliqt.R.inc(12554);CAVLCReader bsr = new CAVLCReader(is);

        __CLR4_5_29op9oplvluliqt.R.inc(12555);int sps_video_parameter_set_id = (int) bsr.readNBit(4, "sps_video_parameter_set_id");
        __CLR4_5_29op9oplvluliqt.R.inc(12556);int sps_max_sub_layers_minus1 = (int) bsr.readNBit(3, "sps_max_sub_layers_minus1");
        __CLR4_5_29op9oplvluliqt.R.inc(12557);boolean sps_temporal_id_nesting_flag = bsr.readBool("sps_temporal_id_nesting_flag");
        __CLR4_5_29op9oplvluliqt.R.inc(12558);profile_tier_level(sps_max_sub_layers_minus1, bsr);
        __CLR4_5_29op9oplvluliqt.R.inc(12559);int sps_seq_parameter_set_id = bsr.readUE("sps_seq_parameter_set_id");
        __CLR4_5_29op9oplvluliqt.R.inc(12560);int chroma_format_idc = bsr.readUE("chroma_format_idc");
        __CLR4_5_29op9oplvluliqt.R.inc(12561);if ((((chroma_format_idc == 3)&&(__CLR4_5_29op9oplvluliqt.R.iget(12562)!=0|true))||(__CLR4_5_29op9oplvluliqt.R.iget(12563)==0&false))) {{
            __CLR4_5_29op9oplvluliqt.R.inc(12564);int separate_colour_plane_flag = bsr.read1Bit();
            __CLR4_5_29op9oplvluliqt.R.inc(12565);int pic_width_in_luma_samples = bsr.readUE("pic_width_in_luma_samples");
            __CLR4_5_29op9oplvluliqt.R.inc(12566);int pic_height_in_luma_samples = bsr.readUE("pic_width_in_luma_samples");
            __CLR4_5_29op9oplvluliqt.R.inc(12567);boolean conformance_window_flag = bsr.readBool("conformance_window_flag");
            __CLR4_5_29op9oplvluliqt.R.inc(12568);if ((((conformance_window_flag)&&(__CLR4_5_29op9oplvluliqt.R.iget(12569)!=0|true))||(__CLR4_5_29op9oplvluliqt.R.iget(12570)==0&false))) {{
                __CLR4_5_29op9oplvluliqt.R.inc(12571);int conf_win_left_offset = bsr.readUE("conf_win_left_offset");
                __CLR4_5_29op9oplvluliqt.R.inc(12572);int conf_win_right_offset = bsr.readUE("conf_win_right_offset");
                __CLR4_5_29op9oplvluliqt.R.inc(12573);int conf_win_top_offset = bsr.readUE("conf_win_top_offset");
                __CLR4_5_29op9oplvluliqt.R.inc(12574);int conf_win_bottom_offset = bsr.readUE("conf_win_bottom_offset");
            }
        }}
        }__CLR4_5_29op9oplvluliqt.R.inc(12575);int bit_depth_luma_minus8 = bsr.readUE("bit_depth_luma_minus8");
        __CLR4_5_29op9oplvluliqt.R.inc(12576);int bit_depth_chroma_minus8 = bsr.readUE("bit_depth_chroma_minus8");
        __CLR4_5_29op9oplvluliqt.R.inc(12577);int log2_max_pic_order_cnt_lsb_minus4 = bsr.readUE("log2_max_pic_order_cnt_lsb_minus4");
        __CLR4_5_29op9oplvluliqt.R.inc(12578);boolean sps_sub_layer_ordering_info_present_flag = bsr.readBool("sps_sub_layer_ordering_info_present_flag");

        __CLR4_5_29op9oplvluliqt.R.inc(12579);int j = sps_max_sub_layers_minus1 - ((((sps_sub_layer_ordering_info_present_flag )&&(__CLR4_5_29op9oplvluliqt.R.iget(12580)!=0|true))||(__CLR4_5_29op9oplvluliqt.R.iget(12581)==0&false))? 0 : sps_max_sub_layers_minus1) + 1;
        __CLR4_5_29op9oplvluliqt.R.inc(12582);int sps_max_dec_pic_buffering_minus1[] = new int[j];
        __CLR4_5_29op9oplvluliqt.R.inc(12583);int sps_max_num_reorder_pics[] = new int[j];
        __CLR4_5_29op9oplvluliqt.R.inc(12584);int sps_max_latency_increase_plus1[] = new int[j];

        __CLR4_5_29op9oplvluliqt.R.inc(12585);for (int i = ((((sps_sub_layer_ordering_info_present_flag )&&(__CLR4_5_29op9oplvluliqt.R.iget(12586)!=0|true))||(__CLR4_5_29op9oplvluliqt.R.iget(12587)==0&false))? 0 : sps_max_sub_layers_minus1); (((i <= sps_max_sub_layers_minus1)&&(__CLR4_5_29op9oplvluliqt.R.iget(12588)!=0|true))||(__CLR4_5_29op9oplvluliqt.R.iget(12589)==0&false)); i++) {{
            __CLR4_5_29op9oplvluliqt.R.inc(12590);sps_max_dec_pic_buffering_minus1[i] = bsr.readUE("sps_max_dec_pic_buffering_minus1[" + i + "]");
            __CLR4_5_29op9oplvluliqt.R.inc(12591);sps_max_num_reorder_pics[i] = bsr.readUE("sps_max_num_reorder_pics[" + i + "]");
            __CLR4_5_29op9oplvluliqt.R.inc(12592);sps_max_latency_increase_plus1[i] = bsr.readUE("sps_max_latency_increase_plus1[" + i + "]");
        }

        }__CLR4_5_29op9oplvluliqt.R.inc(12593);int log2_min_luma_coding_block_size_minus3 = bsr.readUE("log2_min_luma_coding_block_size_minus3");
        __CLR4_5_29op9oplvluliqt.R.inc(12594);int log2_diff_max_min_luma_coding_block_size = bsr.readUE("log2_diff_max_min_luma_coding_block_size");
        __CLR4_5_29op9oplvluliqt.R.inc(12595);int log2_min_transform_block_size_minus2 = bsr.readUE("log2_min_transform_block_size_minus2");
        __CLR4_5_29op9oplvluliqt.R.inc(12596);int log2_diff_max_min_transform_block_size = bsr.readUE("log2_diff_max_min_transform_block_size");
        __CLR4_5_29op9oplvluliqt.R.inc(12597);int max_transform_hierarchy_depth_inter = bsr.readUE("max_transform_hierarchy_depth_inter");
        __CLR4_5_29op9oplvluliqt.R.inc(12598);int max_transform_hierarchy_depth_intra = bsr.readUE("max_transform_hierarchy_depth_intra");

        __CLR4_5_29op9oplvluliqt.R.inc(12599);boolean scaling_list_enabled_flag = bsr.readBool("scaling_list_enabled_flag");
        __CLR4_5_29op9oplvluliqt.R.inc(12600);if ((((scaling_list_enabled_flag)&&(__CLR4_5_29op9oplvluliqt.R.iget(12601)!=0|true))||(__CLR4_5_29op9oplvluliqt.R.iget(12602)==0&false))) {{
            __CLR4_5_29op9oplvluliqt.R.inc(12603);boolean sps_scaling_list_data_present_flag = bsr.readBool("sps_scaling_list_data_present_flag");
            __CLR4_5_29op9oplvluliqt.R.inc(12604);if ((((sps_scaling_list_data_present_flag)&&(__CLR4_5_29op9oplvluliqt.R.iget(12605)!=0|true))||(__CLR4_5_29op9oplvluliqt.R.iget(12606)==0&false))) {{
                __CLR4_5_29op9oplvluliqt.R.inc(12607);scaling_list_data(bsr);
            }
        }}
        }__CLR4_5_29op9oplvluliqt.R.inc(12608);boolean amp_enabled_flag = bsr.readBool("amp_enabled_flag");
        __CLR4_5_29op9oplvluliqt.R.inc(12609);boolean sample_adaptive_offset_enabled_flag = bsr.readBool("sample_adaptive_offset_enabled_flag");
        __CLR4_5_29op9oplvluliqt.R.inc(12610);boolean pcm_enabled_flag = bsr.readBool("pcm_enabled_flag");

        __CLR4_5_29op9oplvluliqt.R.inc(12611);if ((((pcm_enabled_flag)&&(__CLR4_5_29op9oplvluliqt.R.iget(12612)!=0|true))||(__CLR4_5_29op9oplvluliqt.R.iget(12613)==0&false))) {{
            __CLR4_5_29op9oplvluliqt.R.inc(12614);int pcm_sample_bit_depth_luma_minus1 = (int) bsr.readNBit(4, "pcm_sample_bit_depth_luma_minus1");
            __CLR4_5_29op9oplvluliqt.R.inc(12615);int pcm_sample_bit_depth_chroma_minus1 = (int) bsr.readNBit(4, "pcm_sample_bit_depth_chroma_minus1");
            __CLR4_5_29op9oplvluliqt.R.inc(12616);int log2_min_pcm_luma_coding_block_size_minus3 = bsr.readUE("log2_min_pcm_luma_coding_block_size_minus3");
        }
    }}finally{__CLR4_5_29op9oplvluliqt.R.flushNeeded();}}

    private void scaling_list_data(CAVLCReader bsr) throws IOException {try{__CLR4_5_29op9oplvluliqt.R.inc(12617);
        __CLR4_5_29op9oplvluliqt.R.inc(12618);boolean[][] scaling_list_pred_mode_flag = new boolean[4][];
        __CLR4_5_29op9oplvluliqt.R.inc(12619);int[][] scaling_list_pred_matrix_id_delta = new int[4][];
        __CLR4_5_29op9oplvluliqt.R.inc(12620);int[][] scaling_list_dc_coef_minus8 = new int[2][];
        __CLR4_5_29op9oplvluliqt.R.inc(12621);int[][][] ScalingList = new int[4][][];

        __CLR4_5_29op9oplvluliqt.R.inc(12622);for (int sizeId = 0; (((sizeId < 4)&&(__CLR4_5_29op9oplvluliqt.R.iget(12623)!=0|true))||(__CLR4_5_29op9oplvluliqt.R.iget(12624)==0&false)); sizeId++) {{
            __CLR4_5_29op9oplvluliqt.R.inc(12625);for (int matrixId = 0; (((matrixId < (((((sizeId == 3) )&&(__CLR4_5_29op9oplvluliqt.R.iget(12626)!=0|true))||(__CLR4_5_29op9oplvluliqt.R.iget(12627)==0&false))? 2 : 6))&&(__CLR4_5_29op9oplvluliqt.R.iget(12628)!=0|true))||(__CLR4_5_29op9oplvluliqt.R.iget(12629)==0&false)); matrixId++) {{
                __CLR4_5_29op9oplvluliqt.R.inc(12630);scaling_list_pred_mode_flag[sizeId] = new boolean[(((((sizeId == 3) )&&(__CLR4_5_29op9oplvluliqt.R.iget(12631)!=0|true))||(__CLR4_5_29op9oplvluliqt.R.iget(12632)==0&false))? 2 : 6)];
                __CLR4_5_29op9oplvluliqt.R.inc(12633);scaling_list_pred_matrix_id_delta[sizeId] = new int[(((((sizeId == 3) )&&(__CLR4_5_29op9oplvluliqt.R.iget(12634)!=0|true))||(__CLR4_5_29op9oplvluliqt.R.iget(12635)==0&false))? 2 : 6)];
                __CLR4_5_29op9oplvluliqt.R.inc(12636);ScalingList[sizeId] = new int[((((sizeId == 3) )&&(__CLR4_5_29op9oplvluliqt.R.iget(12637)!=0|true))||(__CLR4_5_29op9oplvluliqt.R.iget(12638)==0&false))? 2 : 6][];
                __CLR4_5_29op9oplvluliqt.R.inc(12639);scaling_list_pred_mode_flag[sizeId][matrixId] = bsr.readBool();
                __CLR4_5_29op9oplvluliqt.R.inc(12640);if ((((!scaling_list_pred_mode_flag[sizeId][matrixId])&&(__CLR4_5_29op9oplvluliqt.R.iget(12641)!=0|true))||(__CLR4_5_29op9oplvluliqt.R.iget(12642)==0&false))) {{
                    __CLR4_5_29op9oplvluliqt.R.inc(12643);scaling_list_pred_matrix_id_delta[sizeId][matrixId] = bsr.readUE("scaling_list_pred_matrix_id_delta[" + sizeId + "][" + matrixId + "]");
                } }else {{
                    __CLR4_5_29op9oplvluliqt.R.inc(12644);int nextCoef = 8;
                    __CLR4_5_29op9oplvluliqt.R.inc(12645);int coefNum = Math.min(64, (1 << (4 + (sizeId << 1))));
                    __CLR4_5_29op9oplvluliqt.R.inc(12646);if ((((sizeId > 1)&&(__CLR4_5_29op9oplvluliqt.R.iget(12647)!=0|true))||(__CLR4_5_29op9oplvluliqt.R.iget(12648)==0&false))) {{
                        __CLR4_5_29op9oplvluliqt.R.inc(12649);scaling_list_dc_coef_minus8[sizeId - 2][matrixId] = bsr.readSE("scaling_list_dc_coef_minus8[" + sizeId + "- 2][" + matrixId + "]");
                        __CLR4_5_29op9oplvluliqt.R.inc(12650);nextCoef = scaling_list_dc_coef_minus8[sizeId - 2][matrixId] + 8;
                    }
                    }__CLR4_5_29op9oplvluliqt.R.inc(12651);ScalingList[sizeId][matrixId] = new int[coefNum];
                    __CLR4_5_29op9oplvluliqt.R.inc(12652);for (int i = 0; (((i < coefNum)&&(__CLR4_5_29op9oplvluliqt.R.iget(12653)!=0|true))||(__CLR4_5_29op9oplvluliqt.R.iget(12654)==0&false)); i++) {{
                        __CLR4_5_29op9oplvluliqt.R.inc(12655);int scaling_list_delta_coef = bsr.readSE("scaling_list_delta_coef ");
                        __CLR4_5_29op9oplvluliqt.R.inc(12656);nextCoef = (nextCoef + scaling_list_delta_coef + 256) % 256;
                        __CLR4_5_29op9oplvluliqt.R.inc(12657);ScalingList[sizeId][matrixId][i] = nextCoef;
                    }
                }}
            }}
        }}
    }}finally{__CLR4_5_29op9oplvluliqt.R.flushNeeded();}}


    private void profile_tier_level(int maxNumSubLayersMinus1, CAVLCReader bsr) throws IOException {try{__CLR4_5_29op9oplvluliqt.R.inc(12658);
        __CLR4_5_29op9oplvluliqt.R.inc(12659);int general_profile_space = bsr.readU(2, "general_profile_space");
        __CLR4_5_29op9oplvluliqt.R.inc(12660);boolean general_tier_flag = bsr.readBool("general_tier_flag");
        __CLR4_5_29op9oplvluliqt.R.inc(12661);int general_profile_idc = bsr.readU(5, "general_profile_idc");
        __CLR4_5_29op9oplvluliqt.R.inc(12662);boolean general_profile_compatibility_flag[] = new boolean[32];
        __CLR4_5_29op9oplvluliqt.R.inc(12663);for (int j = 0; (((j < 32)&&(__CLR4_5_29op9oplvluliqt.R.iget(12664)!=0|true))||(__CLR4_5_29op9oplvluliqt.R.iget(12665)==0&false)); j++) {{
            __CLR4_5_29op9oplvluliqt.R.inc(12666);general_profile_compatibility_flag[j] = bsr.readBool();
        }
        }__CLR4_5_29op9oplvluliqt.R.inc(12667);boolean general_progressive_source_flag = bsr.readBool("general_progressive_source_flag");
        __CLR4_5_29op9oplvluliqt.R.inc(12668);boolean general_interlaced_source_flag = bsr.readBool("general_interlaced_source_flag");
        __CLR4_5_29op9oplvluliqt.R.inc(12669);boolean general_non_packed_constraint_flag = bsr.readBool("general_non_packed_constraint_flag");
        __CLR4_5_29op9oplvluliqt.R.inc(12670);boolean general_frame_only_constraint_flag = bsr.readBool("general_frame_only_constraint_flag");
        __CLR4_5_29op9oplvluliqt.R.inc(12671);long general_reserved_zero_44bits = bsr.readNBit(44, "general_reserved_zero_44bits");
        __CLR4_5_29op9oplvluliqt.R.inc(12672);int general_level_idc = bsr.readByte();
        __CLR4_5_29op9oplvluliqt.R.inc(12673);boolean[] sub_layer_profile_present_flag = new boolean[maxNumSubLayersMinus1];
        __CLR4_5_29op9oplvluliqt.R.inc(12674);boolean[] sub_layer_level_present_flag = new boolean[maxNumSubLayersMinus1];
        __CLR4_5_29op9oplvluliqt.R.inc(12675);for (int i = 0; (((i < maxNumSubLayersMinus1)&&(__CLR4_5_29op9oplvluliqt.R.iget(12676)!=0|true))||(__CLR4_5_29op9oplvluliqt.R.iget(12677)==0&false)); i++) {{
            __CLR4_5_29op9oplvluliqt.R.inc(12678);sub_layer_profile_present_flag[i] = bsr.readBool("sub_layer_profile_present_flag[" + i + "]");
            __CLR4_5_29op9oplvluliqt.R.inc(12679);sub_layer_level_present_flag[i] = bsr.readBool("sub_layer_level_present_flag[" + i + "]");
        }

        }__CLR4_5_29op9oplvluliqt.R.inc(12680);if ((((maxNumSubLayersMinus1 > 0)&&(__CLR4_5_29op9oplvluliqt.R.iget(12681)!=0|true))||(__CLR4_5_29op9oplvluliqt.R.iget(12682)==0&false))) {{
            __CLR4_5_29op9oplvluliqt.R.inc(12683);int[] reserved_zero_2bits = new int[8];

            __CLR4_5_29op9oplvluliqt.R.inc(12684);for (int i = maxNumSubLayersMinus1; (((i < 8)&&(__CLR4_5_29op9oplvluliqt.R.iget(12685)!=0|true))||(__CLR4_5_29op9oplvluliqt.R.iget(12686)==0&false)); i++) {{
                __CLR4_5_29op9oplvluliqt.R.inc(12687);reserved_zero_2bits[i] = bsr.readU(2, "reserved_zero_2bits[" + i + "]");
            }
        }}
        }__CLR4_5_29op9oplvluliqt.R.inc(12688);int[] sub_layer_profile_space = new int[maxNumSubLayersMinus1];
        __CLR4_5_29op9oplvluliqt.R.inc(12689);boolean[] sub_layer_tier_flag = new boolean[maxNumSubLayersMinus1];
        __CLR4_5_29op9oplvluliqt.R.inc(12690);int[] sub_layer_profile_idc = new int[maxNumSubLayersMinus1];
        __CLR4_5_29op9oplvluliqt.R.inc(12691);boolean[][] sub_layer_profile_compatibility_flag = new boolean[maxNumSubLayersMinus1][32];
        __CLR4_5_29op9oplvluliqt.R.inc(12692);boolean[] sub_layer_progressive_source_flag = new boolean[maxNumSubLayersMinus1];
        __CLR4_5_29op9oplvluliqt.R.inc(12693);boolean[] sub_layer_interlaced_source_flag = new boolean[maxNumSubLayersMinus1];
        __CLR4_5_29op9oplvluliqt.R.inc(12694);boolean[] sub_layer_non_packed_constraint_flag = new boolean[maxNumSubLayersMinus1];
        __CLR4_5_29op9oplvluliqt.R.inc(12695);boolean[] sub_layer_frame_only_constraint_flag = new boolean[maxNumSubLayersMinus1];
        __CLR4_5_29op9oplvluliqt.R.inc(12696);long[] sub_layer_reserved_zero_44bits = new long[maxNumSubLayersMinus1];
        __CLR4_5_29op9oplvluliqt.R.inc(12697);int[] sub_layer_level_idc = new int[maxNumSubLayersMinus1];


        __CLR4_5_29op9oplvluliqt.R.inc(12698);for (int i = 0; (((i < maxNumSubLayersMinus1)&&(__CLR4_5_29op9oplvluliqt.R.iget(12699)!=0|true))||(__CLR4_5_29op9oplvluliqt.R.iget(12700)==0&false)); i++) {{
            __CLR4_5_29op9oplvluliqt.R.inc(12701);if ((((sub_layer_profile_present_flag[i])&&(__CLR4_5_29op9oplvluliqt.R.iget(12702)!=0|true))||(__CLR4_5_29op9oplvluliqt.R.iget(12703)==0&false))) {{
                __CLR4_5_29op9oplvluliqt.R.inc(12704);sub_layer_profile_space[i] = bsr.readU(2, "sub_layer_profile_space[" + i + "]");
                __CLR4_5_29op9oplvluliqt.R.inc(12705);sub_layer_tier_flag[i] = bsr.readBool("sub_layer_tier_flag[" + i + "]");
                __CLR4_5_29op9oplvluliqt.R.inc(12706);sub_layer_profile_idc[i] = bsr.readU(5, "sub_layer_profile_idc[" + i + "]");
                __CLR4_5_29op9oplvluliqt.R.inc(12707);for (int j = 0; (((j < 32)&&(__CLR4_5_29op9oplvluliqt.R.iget(12708)!=0|true))||(__CLR4_5_29op9oplvluliqt.R.iget(12709)==0&false)); j++) {{
                    __CLR4_5_29op9oplvluliqt.R.inc(12710);sub_layer_profile_compatibility_flag[i][j] = bsr.readBool("sub_layer_profile_compatibility_flag[" + i + "][" + j + "]");
                }
                }__CLR4_5_29op9oplvluliqt.R.inc(12711);sub_layer_progressive_source_flag[i] = bsr.readBool("sub_layer_progressive_source_flag[" + i + "]");
                __CLR4_5_29op9oplvluliqt.R.inc(12712);sub_layer_interlaced_source_flag[i] = bsr.readBool("sub_layer_interlaced_source_flag[" + i + "]");
                __CLR4_5_29op9oplvluliqt.R.inc(12713);sub_layer_non_packed_constraint_flag[i] = bsr.readBool("sub_layer_non_packed_constraint_flag[" + i + "]");
                __CLR4_5_29op9oplvluliqt.R.inc(12714);sub_layer_frame_only_constraint_flag[i] = bsr.readBool("sub_layer_frame_only_constraint_flag[" + i + "]");
                __CLR4_5_29op9oplvluliqt.R.inc(12715);sub_layer_reserved_zero_44bits[i] = bsr.readNBit(44);
            }
            }__CLR4_5_29op9oplvluliqt.R.inc(12716);if ((((sub_layer_level_present_flag[i])&&(__CLR4_5_29op9oplvluliqt.R.iget(12717)!=0|true))||(__CLR4_5_29op9oplvluliqt.R.iget(12718)==0&false))) {{
                __CLR4_5_29op9oplvluliqt.R.inc(12719);sub_layer_level_idc[i] = bsr.readU(8, "sub_layer_level_idc[" + i + "]");
            }
        }}
    }}finally{__CLR4_5_29op9oplvluliqt.R.flushNeeded();}}
}
