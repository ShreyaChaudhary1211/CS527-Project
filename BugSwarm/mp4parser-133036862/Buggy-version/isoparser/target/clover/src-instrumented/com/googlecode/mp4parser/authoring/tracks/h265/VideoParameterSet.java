/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.googlecode.mp4parser.authoring.tracks.h265;

import com.googlecode.mp4parser.h264.read.CAVLCReader;
import com.googlecode.mp4parser.util.ByteBufferByteChannel;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;

public class VideoParameterSet {public static class __CLR4_5_29tc9tclvlulirq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,12929,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    ByteBuffer vps;

    int vps_parameter_set_id;

    public VideoParameterSet(ByteBuffer vps) throws IOException {try{__CLR4_5_29tc9tclvlulirq.R.inc(12720);
        __CLR4_5_29tc9tclvlulirq.R.inc(12721);this.vps = vps;
        __CLR4_5_29tc9tclvlulirq.R.inc(12722);CAVLCReader r = new CAVLCReader(Channels.newInputStream(new ByteBufferByteChannel((ByteBuffer) vps.position(0))));
        __CLR4_5_29tc9tclvlulirq.R.inc(12723);vps_parameter_set_id = r.readU(4, "vps_parameter_set_id");
        __CLR4_5_29tc9tclvlulirq.R.inc(12724);int vps_reserved_three_2bits = r.readU(2, "vps_reserved_three_2bits");
        __CLR4_5_29tc9tclvlulirq.R.inc(12725);int vps_max_layers_minus1 = r.readU(6, "vps_max_layers_minus1");
        __CLR4_5_29tc9tclvlulirq.R.inc(12726);int vps_max_sub_layers_minus1 = r.readU(3, "vps_max_sub_layers_minus1");
        __CLR4_5_29tc9tclvlulirq.R.inc(12727);boolean vps_temporal_id_nesting_flag = r.readBool("vps_temporal_id_nesting_flag");
        __CLR4_5_29tc9tclvlulirq.R.inc(12728);int vps_reserved_0xffff_16bits = r.readU(16, "vps_reserved_0xffff_16bits");
        __CLR4_5_29tc9tclvlulirq.R.inc(12729);profile_tier_level(vps_max_sub_layers_minus1, r);


        __CLR4_5_29tc9tclvlulirq.R.inc(12730);boolean vps_sub_layer_ordering_info_present_flag = r.readBool("vps_sub_layer_ordering_info_present_flag");
        __CLR4_5_29tc9tclvlulirq.R.inc(12731);int[] vps_max_dec_pic_buffering_minus1 = new int[(((vps_sub_layer_ordering_info_present_flag )&&(__CLR4_5_29tc9tclvlulirq.R.iget(12732)!=0|true))||(__CLR4_5_29tc9tclvlulirq.R.iget(12733)==0&false))? 1 : vps_max_sub_layers_minus1 + 1];
        __CLR4_5_29tc9tclvlulirq.R.inc(12734);int[] vps_max_num_reorder_pics = new int[(((vps_sub_layer_ordering_info_present_flag )&&(__CLR4_5_29tc9tclvlulirq.R.iget(12735)!=0|true))||(__CLR4_5_29tc9tclvlulirq.R.iget(12736)==0&false))? 1 : vps_max_sub_layers_minus1 + 1];
        __CLR4_5_29tc9tclvlulirq.R.inc(12737);int[] vps_max_latency_increase_plus1 = new int[(((vps_sub_layer_ordering_info_present_flag )&&(__CLR4_5_29tc9tclvlulirq.R.iget(12738)!=0|true))||(__CLR4_5_29tc9tclvlulirq.R.iget(12739)==0&false))? 1 : vps_max_sub_layers_minus1 + 1];
        __CLR4_5_29tc9tclvlulirq.R.inc(12740);for (int i = ((((vps_sub_layer_ordering_info_present_flag )&&(__CLR4_5_29tc9tclvlulirq.R.iget(12741)!=0|true))||(__CLR4_5_29tc9tclvlulirq.R.iget(12742)==0&false))? 0 : vps_max_sub_layers_minus1); (((i <= vps_max_sub_layers_minus1)&&(__CLR4_5_29tc9tclvlulirq.R.iget(12743)!=0|true))||(__CLR4_5_29tc9tclvlulirq.R.iget(12744)==0&false)); i++) {{
            __CLR4_5_29tc9tclvlulirq.R.inc(12745);vps_max_dec_pic_buffering_minus1[i] = r.readUE("vps_max_dec_pic_buffering_minus1[" + i + "]");
            __CLR4_5_29tc9tclvlulirq.R.inc(12746);vps_max_num_reorder_pics[i] = r.readUE("vps_max_dec_pic_buffering_minus1[" + i + "]");
            __CLR4_5_29tc9tclvlulirq.R.inc(12747);vps_max_latency_increase_plus1[i] = r.readUE("vps_max_dec_pic_buffering_minus1[" + i + "]");
        }
        }__CLR4_5_29tc9tclvlulirq.R.inc(12748);int vps_max_layer_id = r.readU(6, "vps_max_layer_id");
        __CLR4_5_29tc9tclvlulirq.R.inc(12749);int vps_num_layer_sets_minus1 = r.readUE("vps_num_layer_sets_minus1");
        __CLR4_5_29tc9tclvlulirq.R.inc(12750);boolean[][] layer_id_included_flag = new boolean[vps_num_layer_sets_minus1][vps_max_layer_id];
        __CLR4_5_29tc9tclvlulirq.R.inc(12751);for (int i = 1; (((i <= vps_num_layer_sets_minus1)&&(__CLR4_5_29tc9tclvlulirq.R.iget(12752)!=0|true))||(__CLR4_5_29tc9tclvlulirq.R.iget(12753)==0&false)); i++) {{
            __CLR4_5_29tc9tclvlulirq.R.inc(12754);for (int j = 0; (((j <= vps_max_layer_id)&&(__CLR4_5_29tc9tclvlulirq.R.iget(12755)!=0|true))||(__CLR4_5_29tc9tclvlulirq.R.iget(12756)==0&false)); j++) {{
                __CLR4_5_29tc9tclvlulirq.R.inc(12757);layer_id_included_flag[i][j] = r.readBool("layer_id_included_flag[" + i + "][" + j + "]");
            }
        }}
        }__CLR4_5_29tc9tclvlulirq.R.inc(12758);boolean vps_timing_info_present_flag = r.readBool("vps_timing_info_present_flag");
        __CLR4_5_29tc9tclvlulirq.R.inc(12759);if ((((vps_timing_info_present_flag)&&(__CLR4_5_29tc9tclvlulirq.R.iget(12760)!=0|true))||(__CLR4_5_29tc9tclvlulirq.R.iget(12761)==0&false))) {{
            __CLR4_5_29tc9tclvlulirq.R.inc(12762);long vps_num_units_in_tick = r.readU(32, "vps_num_units_in_tick");
            __CLR4_5_29tc9tclvlulirq.R.inc(12763);long vps_time_scale = r.readU(32, "vps_time_scale");
            __CLR4_5_29tc9tclvlulirq.R.inc(12764);boolean vps_poc_proportional_to_timing_flag = r.readBool("vps_poc_proportional_to_timing_flag");
            __CLR4_5_29tc9tclvlulirq.R.inc(12765);if ((((vps_poc_proportional_to_timing_flag)&&(__CLR4_5_29tc9tclvlulirq.R.iget(12766)!=0|true))||(__CLR4_5_29tc9tclvlulirq.R.iget(12767)==0&false))) {{
                __CLR4_5_29tc9tclvlulirq.R.inc(12768);int vps_num_ticks_poc_diff_one_minus1 = r.readUE("vps_num_ticks_poc_diff_one_minus1");
            }
            }__CLR4_5_29tc9tclvlulirq.R.inc(12769);int vps_num_hrd_parameters = r.readUE("vps_num_hrd_parameters");
            __CLR4_5_29tc9tclvlulirq.R.inc(12770);int hrd_layer_set_idx[] = new int[vps_num_hrd_parameters];
            __CLR4_5_29tc9tclvlulirq.R.inc(12771);boolean cprms_present_flag[] = new boolean[vps_num_hrd_parameters];
            __CLR4_5_29tc9tclvlulirq.R.inc(12772);for (int i = 0; (((i < vps_num_hrd_parameters)&&(__CLR4_5_29tc9tclvlulirq.R.iget(12773)!=0|true))||(__CLR4_5_29tc9tclvlulirq.R.iget(12774)==0&false)); i++) {{
                __CLR4_5_29tc9tclvlulirq.R.inc(12775);hrd_layer_set_idx[i] = r.readUE("hrd_layer_set_idx[" + i + "]");
                __CLR4_5_29tc9tclvlulirq.R.inc(12776);if ((((i > 0)&&(__CLR4_5_29tc9tclvlulirq.R.iget(12777)!=0|true))||(__CLR4_5_29tc9tclvlulirq.R.iget(12778)==0&false))) {{
                    __CLR4_5_29tc9tclvlulirq.R.inc(12779);cprms_present_flag[i] = r.readBool("cprms_present_flag[" + i + "]");
                } }else {{
                    __CLR4_5_29tc9tclvlulirq.R.inc(12780);cprms_present_flag[0] = true;
                }

                }__CLR4_5_29tc9tclvlulirq.R.inc(12781);hrd_parameters(cprms_present_flag[i], vps_max_sub_layers_minus1, r);
            }
        }}

        }__CLR4_5_29tc9tclvlulirq.R.inc(12782);boolean vps_extension_flag = r.readBool("vps_extension_flag");
        __CLR4_5_29tc9tclvlulirq.R.inc(12783);if ((((vps_extension_flag)&&(__CLR4_5_29tc9tclvlulirq.R.iget(12784)!=0|true))||(__CLR4_5_29tc9tclvlulirq.R.iget(12785)==0&false))) {{
            __CLR4_5_29tc9tclvlulirq.R.inc(12786);while ((((r.moreRBSPData())&&(__CLR4_5_29tc9tclvlulirq.R.iget(12787)!=0|true))||(__CLR4_5_29tc9tclvlulirq.R.iget(12788)==0&false))) {{
                __CLR4_5_29tc9tclvlulirq.R.inc(12789);boolean vps_extension_data_flag = r.readBool("vps_extension_data_flag");
            }
        }}
        }__CLR4_5_29tc9tclvlulirq.R.inc(12790);r.readTrailingBits();

    }finally{__CLR4_5_29tc9tclvlulirq.R.flushNeeded();}}

    public void profile_tier_level(int maxNumSubLayersMinus1, CAVLCReader r) throws IOException {try{__CLR4_5_29tc9tclvlulirq.R.inc(12791);
        __CLR4_5_29tc9tclvlulirq.R.inc(12792);int general_profile_space = r.readU(2, "general_profile_space ");
        __CLR4_5_29tc9tclvlulirq.R.inc(12793);boolean general_tier_flag = r.readBool("general_tier_flag");
        __CLR4_5_29tc9tclvlulirq.R.inc(12794);int general_profile_idc = r.readU(5, "general_profile_idc");
        __CLR4_5_29tc9tclvlulirq.R.inc(12795);boolean[] general_profile_compatibility_flag = new boolean[32];
        __CLR4_5_29tc9tclvlulirq.R.inc(12796);for (int j = 0; (((j < 32)&&(__CLR4_5_29tc9tclvlulirq.R.iget(12797)!=0|true))||(__CLR4_5_29tc9tclvlulirq.R.iget(12798)==0&false)); j++) {{
            __CLR4_5_29tc9tclvlulirq.R.inc(12799);general_profile_compatibility_flag[j] = r.readBool("general_profile_compatibility_flag[" + j + "]");
        }
        }__CLR4_5_29tc9tclvlulirq.R.inc(12800);boolean general_progressive_source_flag = r.readBool("general_progressive_source_flag");
        __CLR4_5_29tc9tclvlulirq.R.inc(12801);boolean general_interlaced_source_flag = r.readBool("general_interlaced_source_flag");
        __CLR4_5_29tc9tclvlulirq.R.inc(12802);boolean general_non_packed_constraint_flag = r.readBool("general_non_packed_constraint_flag");
        __CLR4_5_29tc9tclvlulirq.R.inc(12803);boolean general_frame_only_constraint_flag = r.readBool("general_frame_only_constraint_flag");

        __CLR4_5_29tc9tclvlulirq.R.inc(12804);long general_reserved_zero_44bits = r.readU(44, "general_reserved_zero_44bits");
        __CLR4_5_29tc9tclvlulirq.R.inc(12805);int general_level_idc = r.readU(8, "general_level_idc");

        __CLR4_5_29tc9tclvlulirq.R.inc(12806);boolean[] sub_layer_profile_present_flag = new boolean[maxNumSubLayersMinus1];
        __CLR4_5_29tc9tclvlulirq.R.inc(12807);boolean[] sub_layer_level_present_flag = new boolean[maxNumSubLayersMinus1];
        __CLR4_5_29tc9tclvlulirq.R.inc(12808);for (int i = 0; (((i < maxNumSubLayersMinus1)&&(__CLR4_5_29tc9tclvlulirq.R.iget(12809)!=0|true))||(__CLR4_5_29tc9tclvlulirq.R.iget(12810)==0&false)); i++) {{
            __CLR4_5_29tc9tclvlulirq.R.inc(12811);sub_layer_profile_present_flag[i] = r.readBool("sub_layer_profile_present_flag[" + i + "]");
            __CLR4_5_29tc9tclvlulirq.R.inc(12812);sub_layer_level_present_flag[i] = r.readBool("sub_layer_level_present_flag[" + i + "]");
        }
        }__CLR4_5_29tc9tclvlulirq.R.inc(12813);if ((((maxNumSubLayersMinus1 > 0)&&(__CLR4_5_29tc9tclvlulirq.R.iget(12814)!=0|true))||(__CLR4_5_29tc9tclvlulirq.R.iget(12815)==0&false))) {{
            __CLR4_5_29tc9tclvlulirq.R.inc(12816);for (int i = maxNumSubLayersMinus1; (((i < 8)&&(__CLR4_5_29tc9tclvlulirq.R.iget(12817)!=0|true))||(__CLR4_5_29tc9tclvlulirq.R.iget(12818)==0&false)); i++) {{
                __CLR4_5_29tc9tclvlulirq.R.inc(12819);r.readU(2, "reserved_zero_2bits");
            }
        }}


        }__CLR4_5_29tc9tclvlulirq.R.inc(12820);int[] sub_layer_profile_space = new int[maxNumSubLayersMinus1];
        __CLR4_5_29tc9tclvlulirq.R.inc(12821);boolean[] sub_layer_tier_flag = new boolean[maxNumSubLayersMinus1];
        __CLR4_5_29tc9tclvlulirq.R.inc(12822);int[] sub_layer_profile_idc = new int[maxNumSubLayersMinus1];
        __CLR4_5_29tc9tclvlulirq.R.inc(12823);boolean[][] sub_layer_profile_compatibility_flag = new boolean[maxNumSubLayersMinus1][32];
        __CLR4_5_29tc9tclvlulirq.R.inc(12824);boolean[] sub_layer_progressive_source_flag = new boolean[maxNumSubLayersMinus1];

        __CLR4_5_29tc9tclvlulirq.R.inc(12825);boolean[] sub_layer_interlaced_source_flag = new boolean[maxNumSubLayersMinus1];
        __CLR4_5_29tc9tclvlulirq.R.inc(12826);boolean[] sub_layer_non_packed_constraint_flag = new boolean[maxNumSubLayersMinus1];
        __CLR4_5_29tc9tclvlulirq.R.inc(12827);boolean[] sub_layer_frame_only_constraint_flag = new boolean[maxNumSubLayersMinus1];
        __CLR4_5_29tc9tclvlulirq.R.inc(12828);int[] sub_layer_level_idc = new int[maxNumSubLayersMinus1];

        __CLR4_5_29tc9tclvlulirq.R.inc(12829);for (int i = 0; (((i < maxNumSubLayersMinus1)&&(__CLR4_5_29tc9tclvlulirq.R.iget(12830)!=0|true))||(__CLR4_5_29tc9tclvlulirq.R.iget(12831)==0&false)); i++) {{
            __CLR4_5_29tc9tclvlulirq.R.inc(12832);if ((((sub_layer_profile_present_flag[i])&&(__CLR4_5_29tc9tclvlulirq.R.iget(12833)!=0|true))||(__CLR4_5_29tc9tclvlulirq.R.iget(12834)==0&false))) {{
                __CLR4_5_29tc9tclvlulirq.R.inc(12835);sub_layer_profile_space[i] = r.readU(2, "sub_layer_profile_space[" + i + "]");
                __CLR4_5_29tc9tclvlulirq.R.inc(12836);sub_layer_tier_flag[i] = r.readBool("sub_layer_tier_flag[" + i + "]");
                __CLR4_5_29tc9tclvlulirq.R.inc(12837);sub_layer_profile_idc[i] = r.readU(5, "sub_layer_profile_idc[" + i + "]");
                __CLR4_5_29tc9tclvlulirq.R.inc(12838);for (int j = 0; (((j < 32)&&(__CLR4_5_29tc9tclvlulirq.R.iget(12839)!=0|true))||(__CLR4_5_29tc9tclvlulirq.R.iget(12840)==0&false)); j++) {{
                    __CLR4_5_29tc9tclvlulirq.R.inc(12841);sub_layer_profile_compatibility_flag[i][j] = r.readBool("sub_layer_profile_compatibility_flag[" + i + "][" + j + "]");
                }
                }__CLR4_5_29tc9tclvlulirq.R.inc(12842);sub_layer_progressive_source_flag[i] = r.readBool("sub_layer_progressive_source_flag[" + i + "]");
                __CLR4_5_29tc9tclvlulirq.R.inc(12843);sub_layer_interlaced_source_flag[i] = r.readBool("sub_layer_interlaced_source_flag[" + i + "]");
                __CLR4_5_29tc9tclvlulirq.R.inc(12844);sub_layer_non_packed_constraint_flag[i] = r.readBool("sub_layer_non_packed_constraint_flag[" + i + "]");
                __CLR4_5_29tc9tclvlulirq.R.inc(12845);sub_layer_frame_only_constraint_flag[i] = r.readBool("sub_layer_frame_only_constraint_flag[" + i + "]");
                __CLR4_5_29tc9tclvlulirq.R.inc(12846);r.readNBit(44, "reserved");
            }
            }__CLR4_5_29tc9tclvlulirq.R.inc(12847);if ((((sub_layer_level_present_flag[i])&&(__CLR4_5_29tc9tclvlulirq.R.iget(12848)!=0|true))||(__CLR4_5_29tc9tclvlulirq.R.iget(12849)==0&false)))
                {__CLR4_5_29tc9tclvlulirq.R.inc(12850);sub_layer_level_idc[i] = r.readU(8, "sub_layer_level_idc");
        }}
    }}finally{__CLR4_5_29tc9tclvlulirq.R.flushNeeded();}}

    private void hrd_parameters(boolean commonInfPresentFlag, int maxNumSubLayersMinus1, CAVLCReader r) throws IOException {try{__CLR4_5_29tc9tclvlulirq.R.inc(12851);
        __CLR4_5_29tc9tclvlulirq.R.inc(12852);boolean nal_hrd_parameters_present_flag = false;
        __CLR4_5_29tc9tclvlulirq.R.inc(12853);boolean vcl_hrd_parameters_present_flag = false;
        __CLR4_5_29tc9tclvlulirq.R.inc(12854);boolean sub_pic_hrd_params_present_flag = false;
        __CLR4_5_29tc9tclvlulirq.R.inc(12855);if ((((commonInfPresentFlag)&&(__CLR4_5_29tc9tclvlulirq.R.iget(12856)!=0|true))||(__CLR4_5_29tc9tclvlulirq.R.iget(12857)==0&false))) {{
            __CLR4_5_29tc9tclvlulirq.R.inc(12858);nal_hrd_parameters_present_flag = r.readBool("nal_hrd_parameters_present_flag");
            __CLR4_5_29tc9tclvlulirq.R.inc(12859);vcl_hrd_parameters_present_flag = r.readBool("vcl_hrd_parameters_present_flag");
            __CLR4_5_29tc9tclvlulirq.R.inc(12860);if ((((nal_hrd_parameters_present_flag || vcl_hrd_parameters_present_flag)&&(__CLR4_5_29tc9tclvlulirq.R.iget(12861)!=0|true))||(__CLR4_5_29tc9tclvlulirq.R.iget(12862)==0&false))) {{
                __CLR4_5_29tc9tclvlulirq.R.inc(12863);sub_pic_hrd_params_present_flag = r.readBool("sub_pic_hrd_params_present_flag");
                __CLR4_5_29tc9tclvlulirq.R.inc(12864);if ((((sub_pic_hrd_params_present_flag)&&(__CLR4_5_29tc9tclvlulirq.R.iget(12865)!=0|true))||(__CLR4_5_29tc9tclvlulirq.R.iget(12866)==0&false))) {{
                    __CLR4_5_29tc9tclvlulirq.R.inc(12867);int tick_divisor_minus2 = r.readU(8, "tick_divisor_minus2");
                    __CLR4_5_29tc9tclvlulirq.R.inc(12868);int du_cpb_removal_delay_increment_length_minus1 = r.readU(5, "du_cpb_removal_delay_increment_length_minus1");
                    __CLR4_5_29tc9tclvlulirq.R.inc(12869);boolean sub_pic_cpb_params_in_pic_timing_sei_flag = r.readBool("sub_pic_cpb_params_in_pic_timing_sei_flag");
                    __CLR4_5_29tc9tclvlulirq.R.inc(12870);int dpb_output_delay_du_length_minus1 = r.readU(5, "dpb_output_delay_du_length_minus1");

                }
                }__CLR4_5_29tc9tclvlulirq.R.inc(12871);int bit_rate_scale = r.readU(4, "bit_rate_scale");
                __CLR4_5_29tc9tclvlulirq.R.inc(12872);int cpb_size_scale = r.readU(4, "cpb_size_scale");
                __CLR4_5_29tc9tclvlulirq.R.inc(12873);if ((((sub_pic_hrd_params_present_flag)&&(__CLR4_5_29tc9tclvlulirq.R.iget(12874)!=0|true))||(__CLR4_5_29tc9tclvlulirq.R.iget(12875)==0&false))) {{
                    __CLR4_5_29tc9tclvlulirq.R.inc(12876);int cpb_size_du_scale = r.readU(4, "cpb_size_du_scale");
                }
                }__CLR4_5_29tc9tclvlulirq.R.inc(12877);int initial_cpb_removal_delay_length_minus1 = r.readU(5, "initial_cpb_removal_delay_length_minus1");
                __CLR4_5_29tc9tclvlulirq.R.inc(12878);int au_cpb_removal_delay_length_minus1 = r.readU(5, "au_cpb_removal_delay_length_minus1");
                __CLR4_5_29tc9tclvlulirq.R.inc(12879);int dpb_output_delay_length_minus1 = r.readU(5, "dpb_output_delay_length_minus1");
            }
        }}
        }__CLR4_5_29tc9tclvlulirq.R.inc(12880);boolean fixed_pic_rate_general_flag[] = new boolean[maxNumSubLayersMinus1];
        __CLR4_5_29tc9tclvlulirq.R.inc(12881);boolean fixed_pic_rate_within_cvs_flag[] = new boolean[maxNumSubLayersMinus1];
        __CLR4_5_29tc9tclvlulirq.R.inc(12882);boolean low_delay_hrd_flag[] = new boolean[maxNumSubLayersMinus1];
        __CLR4_5_29tc9tclvlulirq.R.inc(12883);int cpb_cnt_minus1[] = new int[maxNumSubLayersMinus1];
        __CLR4_5_29tc9tclvlulirq.R.inc(12884);int elemental_duration_in_tc_minus1[] = new int[maxNumSubLayersMinus1];
        __CLR4_5_29tc9tclvlulirq.R.inc(12885);for (int i = 0; (((i <= maxNumSubLayersMinus1)&&(__CLR4_5_29tc9tclvlulirq.R.iget(12886)!=0|true))||(__CLR4_5_29tc9tclvlulirq.R.iget(12887)==0&false)); i++) {{
            __CLR4_5_29tc9tclvlulirq.R.inc(12888);fixed_pic_rate_general_flag[i] = r.readBool("fixed_pic_rate_general_flag[" + i + "]");
            __CLR4_5_29tc9tclvlulirq.R.inc(12889);if ((((!fixed_pic_rate_general_flag[i])&&(__CLR4_5_29tc9tclvlulirq.R.iget(12890)!=0|true))||(__CLR4_5_29tc9tclvlulirq.R.iget(12891)==0&false))) {{
                __CLR4_5_29tc9tclvlulirq.R.inc(12892);fixed_pic_rate_within_cvs_flag[i] = r.readBool("fixed_pic_rate_within_cvs_flag[" + i + "]");
            }
            }__CLR4_5_29tc9tclvlulirq.R.inc(12893);if ((((fixed_pic_rate_within_cvs_flag[i])&&(__CLR4_5_29tc9tclvlulirq.R.iget(12894)!=0|true))||(__CLR4_5_29tc9tclvlulirq.R.iget(12895)==0&false))) {{
                __CLR4_5_29tc9tclvlulirq.R.inc(12896);elemental_duration_in_tc_minus1[i] = r.readUE("elemental_duration_in_tc_minus1[" + i + "]");
            } }else {{
                __CLR4_5_29tc9tclvlulirq.R.inc(12897);low_delay_hrd_flag[i] = r.readBool("low_delay_hrd_flag[" + i + "]");
            }
            }__CLR4_5_29tc9tclvlulirq.R.inc(12898);if ((((!low_delay_hrd_flag[i])&&(__CLR4_5_29tc9tclvlulirq.R.iget(12899)!=0|true))||(__CLR4_5_29tc9tclvlulirq.R.iget(12900)==0&false))) {{
                __CLR4_5_29tc9tclvlulirq.R.inc(12901);cpb_cnt_minus1[i] = r.readUE("cpb_cnt_minus1[" + i + "]");
            }
            }__CLR4_5_29tc9tclvlulirq.R.inc(12902);if ((((nal_hrd_parameters_present_flag)&&(__CLR4_5_29tc9tclvlulirq.R.iget(12903)!=0|true))||(__CLR4_5_29tc9tclvlulirq.R.iget(12904)==0&false))) {{
                __CLR4_5_29tc9tclvlulirq.R.inc(12905);sub_layer_hrd_parameters(i, cpb_cnt_minus1[i], sub_pic_hrd_params_present_flag, r);
            }
            }__CLR4_5_29tc9tclvlulirq.R.inc(12906);if ((((vcl_hrd_parameters_present_flag)&&(__CLR4_5_29tc9tclvlulirq.R.iget(12907)!=0|true))||(__CLR4_5_29tc9tclvlulirq.R.iget(12908)==0&false))) {{
                __CLR4_5_29tc9tclvlulirq.R.inc(12909);sub_layer_hrd_parameters(i, cpb_cnt_minus1[i], sub_pic_hrd_params_present_flag, r);
            }
        }}

    }}finally{__CLR4_5_29tc9tclvlulirq.R.flushNeeded();}}

    void sub_layer_hrd_parameters(int subLayerId, int cpbCnt, boolean sub_pic_hrd_params_present_flag, CAVLCReader r) throws IOException {try{__CLR4_5_29tc9tclvlulirq.R.inc(12910);
        __CLR4_5_29tc9tclvlulirq.R.inc(12911);int bit_rate_value_minus1[] = new int[cpbCnt];
        __CLR4_5_29tc9tclvlulirq.R.inc(12912);int cpb_size_value_minus1[] = new int[cpbCnt];
        __CLR4_5_29tc9tclvlulirq.R.inc(12913);int cpb_size_du_value_minus1[] = new int[cpbCnt];
        __CLR4_5_29tc9tclvlulirq.R.inc(12914);int bit_rate_du_value_minus1[] = new int[cpbCnt];
        __CLR4_5_29tc9tclvlulirq.R.inc(12915);boolean cbr_flag[] = new boolean[cpbCnt];
        __CLR4_5_29tc9tclvlulirq.R.inc(12916);for (int i = 0; (((i <= cpbCnt)&&(__CLR4_5_29tc9tclvlulirq.R.iget(12917)!=0|true))||(__CLR4_5_29tc9tclvlulirq.R.iget(12918)==0&false)); i++) {{
            __CLR4_5_29tc9tclvlulirq.R.inc(12919);bit_rate_value_minus1[i] = r.readUE("bit_rate_value_minus1[" + i + "]");
            __CLR4_5_29tc9tclvlulirq.R.inc(12920);cpb_size_value_minus1[i] = r.readUE("cpb_size_value_minus1[" + i + "]");
            __CLR4_5_29tc9tclvlulirq.R.inc(12921);if ((((sub_pic_hrd_params_present_flag)&&(__CLR4_5_29tc9tclvlulirq.R.iget(12922)!=0|true))||(__CLR4_5_29tc9tclvlulirq.R.iget(12923)==0&false))) {{
                __CLR4_5_29tc9tclvlulirq.R.inc(12924);cpb_size_du_value_minus1[i] = r.readUE("cpb_size_du_value_minus1[" + i + "]");
                __CLR4_5_29tc9tclvlulirq.R.inc(12925);bit_rate_du_value_minus1[i] = r.readUE("bit_rate_du_value_minus1[" + i + "]");
            }
            }__CLR4_5_29tc9tclvlulirq.R.inc(12926);cbr_flag[i] = r.readBool("cbr_flag[" + i + "]");
        }
    }}finally{__CLR4_5_29tc9tclvlulirq.R.flushNeeded();}}

    public ByteBuffer toByteBuffer() {try{__CLR4_5_29tc9tclvlulirq.R.inc(12927);
        __CLR4_5_29tc9tclvlulirq.R.inc(12928);return vps;
    }finally{__CLR4_5_29tc9tclvlulirq.R.flushNeeded();}}
}
