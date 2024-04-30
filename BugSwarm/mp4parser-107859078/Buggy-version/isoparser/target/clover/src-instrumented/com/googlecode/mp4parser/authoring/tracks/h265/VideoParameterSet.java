/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.googlecode.mp4parser.authoring.tracks.h265;

import com.googlecode.mp4parser.h264.read.CAVLCReader;
import com.googlecode.mp4parser.util.ByteBufferByteChannel;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;

public class VideoParameterSet {public static class __CLR4_5_29qp9qplvl9eiv9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,12834,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    ByteBuffer vps;

    int vps_parameter_set_id;

    public VideoParameterSet(ByteBuffer vps) throws IOException {try{__CLR4_5_29qp9qplvl9eiv9.R.inc(12625);
        __CLR4_5_29qp9qplvl9eiv9.R.inc(12626);this.vps = vps;
        __CLR4_5_29qp9qplvl9eiv9.R.inc(12627);CAVLCReader r = new CAVLCReader(Channels.newInputStream(new ByteBufferByteChannel((ByteBuffer) vps.position(0))));
        __CLR4_5_29qp9qplvl9eiv9.R.inc(12628);vps_parameter_set_id = r.readU(4, "vps_parameter_set_id");
        __CLR4_5_29qp9qplvl9eiv9.R.inc(12629);int vps_reserved_three_2bits = r.readU(2, "vps_reserved_three_2bits");
        __CLR4_5_29qp9qplvl9eiv9.R.inc(12630);int vps_max_layers_minus1 = r.readU(6, "vps_max_layers_minus1");
        __CLR4_5_29qp9qplvl9eiv9.R.inc(12631);int vps_max_sub_layers_minus1 = r.readU(3, "vps_max_sub_layers_minus1");
        __CLR4_5_29qp9qplvl9eiv9.R.inc(12632);boolean vps_temporal_id_nesting_flag = r.readBool("vps_temporal_id_nesting_flag");
        __CLR4_5_29qp9qplvl9eiv9.R.inc(12633);int vps_reserved_0xffff_16bits = r.readU(16, "vps_reserved_0xffff_16bits");
        __CLR4_5_29qp9qplvl9eiv9.R.inc(12634);profile_tier_level(vps_max_sub_layers_minus1, r);


        __CLR4_5_29qp9qplvl9eiv9.R.inc(12635);boolean vps_sub_layer_ordering_info_present_flag = r.readBool("vps_sub_layer_ordering_info_present_flag");
        __CLR4_5_29qp9qplvl9eiv9.R.inc(12636);int[] vps_max_dec_pic_buffering_minus1 = new int[(((vps_sub_layer_ordering_info_present_flag )&&(__CLR4_5_29qp9qplvl9eiv9.R.iget(12637)!=0|true))||(__CLR4_5_29qp9qplvl9eiv9.R.iget(12638)==0&false))? 1 : vps_max_sub_layers_minus1 + 1];
        __CLR4_5_29qp9qplvl9eiv9.R.inc(12639);int[] vps_max_num_reorder_pics = new int[(((vps_sub_layer_ordering_info_present_flag )&&(__CLR4_5_29qp9qplvl9eiv9.R.iget(12640)!=0|true))||(__CLR4_5_29qp9qplvl9eiv9.R.iget(12641)==0&false))? 1 : vps_max_sub_layers_minus1 + 1];
        __CLR4_5_29qp9qplvl9eiv9.R.inc(12642);int[] vps_max_latency_increase_plus1 = new int[(((vps_sub_layer_ordering_info_present_flag )&&(__CLR4_5_29qp9qplvl9eiv9.R.iget(12643)!=0|true))||(__CLR4_5_29qp9qplvl9eiv9.R.iget(12644)==0&false))? 1 : vps_max_sub_layers_minus1 + 1];
        __CLR4_5_29qp9qplvl9eiv9.R.inc(12645);for (int i = ((((vps_sub_layer_ordering_info_present_flag )&&(__CLR4_5_29qp9qplvl9eiv9.R.iget(12646)!=0|true))||(__CLR4_5_29qp9qplvl9eiv9.R.iget(12647)==0&false))? 0 : vps_max_sub_layers_minus1); (((i <= vps_max_sub_layers_minus1)&&(__CLR4_5_29qp9qplvl9eiv9.R.iget(12648)!=0|true))||(__CLR4_5_29qp9qplvl9eiv9.R.iget(12649)==0&false)); i++) {{
            __CLR4_5_29qp9qplvl9eiv9.R.inc(12650);vps_max_dec_pic_buffering_minus1[i] = r.readUE("vps_max_dec_pic_buffering_minus1[" + i + "]");
            __CLR4_5_29qp9qplvl9eiv9.R.inc(12651);vps_max_num_reorder_pics[i] = r.readUE("vps_max_dec_pic_buffering_minus1[" + i + "]");
            __CLR4_5_29qp9qplvl9eiv9.R.inc(12652);vps_max_latency_increase_plus1[i] = r.readUE("vps_max_dec_pic_buffering_minus1[" + i + "]");
        }
        }__CLR4_5_29qp9qplvl9eiv9.R.inc(12653);int vps_max_layer_id = r.readU(6, "vps_max_layer_id");
        __CLR4_5_29qp9qplvl9eiv9.R.inc(12654);int vps_num_layer_sets_minus1 = r.readUE("vps_num_layer_sets_minus1");
        __CLR4_5_29qp9qplvl9eiv9.R.inc(12655);boolean[][] layer_id_included_flag = new boolean[vps_num_layer_sets_minus1][vps_max_layer_id];
        __CLR4_5_29qp9qplvl9eiv9.R.inc(12656);for (int i = 1; (((i <= vps_num_layer_sets_minus1)&&(__CLR4_5_29qp9qplvl9eiv9.R.iget(12657)!=0|true))||(__CLR4_5_29qp9qplvl9eiv9.R.iget(12658)==0&false)); i++) {{
            __CLR4_5_29qp9qplvl9eiv9.R.inc(12659);for (int j = 0; (((j <= vps_max_layer_id)&&(__CLR4_5_29qp9qplvl9eiv9.R.iget(12660)!=0|true))||(__CLR4_5_29qp9qplvl9eiv9.R.iget(12661)==0&false)); j++) {{
                __CLR4_5_29qp9qplvl9eiv9.R.inc(12662);layer_id_included_flag[i][j] = r.readBool("layer_id_included_flag[" + i + "][" + j + "]");
            }
        }}
        }__CLR4_5_29qp9qplvl9eiv9.R.inc(12663);boolean vps_timing_info_present_flag = r.readBool("vps_timing_info_present_flag");
        __CLR4_5_29qp9qplvl9eiv9.R.inc(12664);if ((((vps_timing_info_present_flag)&&(__CLR4_5_29qp9qplvl9eiv9.R.iget(12665)!=0|true))||(__CLR4_5_29qp9qplvl9eiv9.R.iget(12666)==0&false))) {{
            __CLR4_5_29qp9qplvl9eiv9.R.inc(12667);long vps_num_units_in_tick = r.readU(32, "vps_num_units_in_tick");
            __CLR4_5_29qp9qplvl9eiv9.R.inc(12668);long vps_time_scale = r.readU(32, "vps_time_scale");
            __CLR4_5_29qp9qplvl9eiv9.R.inc(12669);boolean vps_poc_proportional_to_timing_flag = r.readBool("vps_poc_proportional_to_timing_flag");
            __CLR4_5_29qp9qplvl9eiv9.R.inc(12670);if ((((vps_poc_proportional_to_timing_flag)&&(__CLR4_5_29qp9qplvl9eiv9.R.iget(12671)!=0|true))||(__CLR4_5_29qp9qplvl9eiv9.R.iget(12672)==0&false))) {{
                __CLR4_5_29qp9qplvl9eiv9.R.inc(12673);int vps_num_ticks_poc_diff_one_minus1 = r.readUE("vps_num_ticks_poc_diff_one_minus1");
            }
            }__CLR4_5_29qp9qplvl9eiv9.R.inc(12674);int vps_num_hrd_parameters = r.readUE("vps_num_hrd_parameters");
            __CLR4_5_29qp9qplvl9eiv9.R.inc(12675);int hrd_layer_set_idx[] = new int[vps_num_hrd_parameters];
            __CLR4_5_29qp9qplvl9eiv9.R.inc(12676);boolean cprms_present_flag[] = new boolean[vps_num_hrd_parameters];
            __CLR4_5_29qp9qplvl9eiv9.R.inc(12677);for (int i = 0; (((i < vps_num_hrd_parameters)&&(__CLR4_5_29qp9qplvl9eiv9.R.iget(12678)!=0|true))||(__CLR4_5_29qp9qplvl9eiv9.R.iget(12679)==0&false)); i++) {{
                __CLR4_5_29qp9qplvl9eiv9.R.inc(12680);hrd_layer_set_idx[i] = r.readUE("hrd_layer_set_idx[" + i + "]");
                __CLR4_5_29qp9qplvl9eiv9.R.inc(12681);if ((((i > 0)&&(__CLR4_5_29qp9qplvl9eiv9.R.iget(12682)!=0|true))||(__CLR4_5_29qp9qplvl9eiv9.R.iget(12683)==0&false))) {{
                    __CLR4_5_29qp9qplvl9eiv9.R.inc(12684);cprms_present_flag[i] = r.readBool("cprms_present_flag[" + i + "]");
                } }else {{
                    __CLR4_5_29qp9qplvl9eiv9.R.inc(12685);cprms_present_flag[0] = true;
                }

                }__CLR4_5_29qp9qplvl9eiv9.R.inc(12686);hrd_parameters(cprms_present_flag[i], vps_max_sub_layers_minus1, r);
            }
        }}

        }__CLR4_5_29qp9qplvl9eiv9.R.inc(12687);boolean vps_extension_flag = r.readBool("vps_extension_flag");
        __CLR4_5_29qp9qplvl9eiv9.R.inc(12688);if ((((vps_extension_flag)&&(__CLR4_5_29qp9qplvl9eiv9.R.iget(12689)!=0|true))||(__CLR4_5_29qp9qplvl9eiv9.R.iget(12690)==0&false))) {{
            __CLR4_5_29qp9qplvl9eiv9.R.inc(12691);while ((((r.moreRBSPData())&&(__CLR4_5_29qp9qplvl9eiv9.R.iget(12692)!=0|true))||(__CLR4_5_29qp9qplvl9eiv9.R.iget(12693)==0&false))) {{
                __CLR4_5_29qp9qplvl9eiv9.R.inc(12694);boolean vps_extension_data_flag = r.readBool("vps_extension_data_flag");
            }
        }}
        }__CLR4_5_29qp9qplvl9eiv9.R.inc(12695);r.readTrailingBits();

    }finally{__CLR4_5_29qp9qplvl9eiv9.R.flushNeeded();}}

    public void profile_tier_level(int maxNumSubLayersMinus1, CAVLCReader r) throws IOException {try{__CLR4_5_29qp9qplvl9eiv9.R.inc(12696);
        __CLR4_5_29qp9qplvl9eiv9.R.inc(12697);int general_profile_space = r.readU(2, "general_profile_space ");
        __CLR4_5_29qp9qplvl9eiv9.R.inc(12698);boolean general_tier_flag = r.readBool("general_tier_flag");
        __CLR4_5_29qp9qplvl9eiv9.R.inc(12699);int general_profile_idc = r.readU(5, "general_profile_idc");
        __CLR4_5_29qp9qplvl9eiv9.R.inc(12700);boolean[] general_profile_compatibility_flag = new boolean[32];
        __CLR4_5_29qp9qplvl9eiv9.R.inc(12701);for (int j = 0; (((j < 32)&&(__CLR4_5_29qp9qplvl9eiv9.R.iget(12702)!=0|true))||(__CLR4_5_29qp9qplvl9eiv9.R.iget(12703)==0&false)); j++) {{
            __CLR4_5_29qp9qplvl9eiv9.R.inc(12704);general_profile_compatibility_flag[j] = r.readBool("general_profile_compatibility_flag[" + j + "]");
        }
        }__CLR4_5_29qp9qplvl9eiv9.R.inc(12705);boolean general_progressive_source_flag = r.readBool("general_progressive_source_flag");
        __CLR4_5_29qp9qplvl9eiv9.R.inc(12706);boolean general_interlaced_source_flag = r.readBool("general_interlaced_source_flag");
        __CLR4_5_29qp9qplvl9eiv9.R.inc(12707);boolean general_non_packed_constraint_flag = r.readBool("general_non_packed_constraint_flag");
        __CLR4_5_29qp9qplvl9eiv9.R.inc(12708);boolean general_frame_only_constraint_flag = r.readBool("general_frame_only_constraint_flag");

        __CLR4_5_29qp9qplvl9eiv9.R.inc(12709);long general_reserved_zero_44bits = r.readU(44, "general_reserved_zero_44bits");
        __CLR4_5_29qp9qplvl9eiv9.R.inc(12710);int general_level_idc = r.readU(8, "general_level_idc");

        __CLR4_5_29qp9qplvl9eiv9.R.inc(12711);boolean[] sub_layer_profile_present_flag = new boolean[maxNumSubLayersMinus1];
        __CLR4_5_29qp9qplvl9eiv9.R.inc(12712);boolean[] sub_layer_level_present_flag = new boolean[maxNumSubLayersMinus1];
        __CLR4_5_29qp9qplvl9eiv9.R.inc(12713);for (int i = 0; (((i < maxNumSubLayersMinus1)&&(__CLR4_5_29qp9qplvl9eiv9.R.iget(12714)!=0|true))||(__CLR4_5_29qp9qplvl9eiv9.R.iget(12715)==0&false)); i++) {{
            __CLR4_5_29qp9qplvl9eiv9.R.inc(12716);sub_layer_profile_present_flag[i] = r.readBool("sub_layer_profile_present_flag[" + i + "]");
            __CLR4_5_29qp9qplvl9eiv9.R.inc(12717);sub_layer_level_present_flag[i] = r.readBool("sub_layer_level_present_flag[" + i + "]");
        }
        }__CLR4_5_29qp9qplvl9eiv9.R.inc(12718);if ((((maxNumSubLayersMinus1 > 0)&&(__CLR4_5_29qp9qplvl9eiv9.R.iget(12719)!=0|true))||(__CLR4_5_29qp9qplvl9eiv9.R.iget(12720)==0&false))) {{
            __CLR4_5_29qp9qplvl9eiv9.R.inc(12721);for (int i = maxNumSubLayersMinus1; (((i < 8)&&(__CLR4_5_29qp9qplvl9eiv9.R.iget(12722)!=0|true))||(__CLR4_5_29qp9qplvl9eiv9.R.iget(12723)==0&false)); i++) {{
                __CLR4_5_29qp9qplvl9eiv9.R.inc(12724);r.readU(2, "reserved_zero_2bits");
            }
        }}


        }__CLR4_5_29qp9qplvl9eiv9.R.inc(12725);int[] sub_layer_profile_space = new int[maxNumSubLayersMinus1];
        __CLR4_5_29qp9qplvl9eiv9.R.inc(12726);boolean[] sub_layer_tier_flag = new boolean[maxNumSubLayersMinus1];
        __CLR4_5_29qp9qplvl9eiv9.R.inc(12727);int[] sub_layer_profile_idc = new int[maxNumSubLayersMinus1];
        __CLR4_5_29qp9qplvl9eiv9.R.inc(12728);boolean[][] sub_layer_profile_compatibility_flag = new boolean[maxNumSubLayersMinus1][32];
        __CLR4_5_29qp9qplvl9eiv9.R.inc(12729);boolean[] sub_layer_progressive_source_flag = new boolean[maxNumSubLayersMinus1];

        __CLR4_5_29qp9qplvl9eiv9.R.inc(12730);boolean[] sub_layer_interlaced_source_flag = new boolean[maxNumSubLayersMinus1];
        __CLR4_5_29qp9qplvl9eiv9.R.inc(12731);boolean[] sub_layer_non_packed_constraint_flag = new boolean[maxNumSubLayersMinus1];
        __CLR4_5_29qp9qplvl9eiv9.R.inc(12732);boolean[] sub_layer_frame_only_constraint_flag = new boolean[maxNumSubLayersMinus1];
        __CLR4_5_29qp9qplvl9eiv9.R.inc(12733);int[] sub_layer_level_idc = new int[maxNumSubLayersMinus1];

        __CLR4_5_29qp9qplvl9eiv9.R.inc(12734);for (int i = 0; (((i < maxNumSubLayersMinus1)&&(__CLR4_5_29qp9qplvl9eiv9.R.iget(12735)!=0|true))||(__CLR4_5_29qp9qplvl9eiv9.R.iget(12736)==0&false)); i++) {{
            __CLR4_5_29qp9qplvl9eiv9.R.inc(12737);if ((((sub_layer_profile_present_flag[i])&&(__CLR4_5_29qp9qplvl9eiv9.R.iget(12738)!=0|true))||(__CLR4_5_29qp9qplvl9eiv9.R.iget(12739)==0&false))) {{
                __CLR4_5_29qp9qplvl9eiv9.R.inc(12740);sub_layer_profile_space[i] = r.readU(2, "sub_layer_profile_space[" + i + "]");
                __CLR4_5_29qp9qplvl9eiv9.R.inc(12741);sub_layer_tier_flag[i] = r.readBool("sub_layer_tier_flag[" + i + "]");
                __CLR4_5_29qp9qplvl9eiv9.R.inc(12742);sub_layer_profile_idc[i] = r.readU(5, "sub_layer_profile_idc[" + i + "]");
                __CLR4_5_29qp9qplvl9eiv9.R.inc(12743);for (int j = 0; (((j < 32)&&(__CLR4_5_29qp9qplvl9eiv9.R.iget(12744)!=0|true))||(__CLR4_5_29qp9qplvl9eiv9.R.iget(12745)==0&false)); j++) {{
                    __CLR4_5_29qp9qplvl9eiv9.R.inc(12746);sub_layer_profile_compatibility_flag[i][j] = r.readBool("sub_layer_profile_compatibility_flag[" + i + "][" + j + "]");
                }
                }__CLR4_5_29qp9qplvl9eiv9.R.inc(12747);sub_layer_progressive_source_flag[i] = r.readBool("sub_layer_progressive_source_flag[" + i + "]");
                __CLR4_5_29qp9qplvl9eiv9.R.inc(12748);sub_layer_interlaced_source_flag[i] = r.readBool("sub_layer_interlaced_source_flag[" + i + "]");
                __CLR4_5_29qp9qplvl9eiv9.R.inc(12749);sub_layer_non_packed_constraint_flag[i] = r.readBool("sub_layer_non_packed_constraint_flag[" + i + "]");
                __CLR4_5_29qp9qplvl9eiv9.R.inc(12750);sub_layer_frame_only_constraint_flag[i] = r.readBool("sub_layer_frame_only_constraint_flag[" + i + "]");
                __CLR4_5_29qp9qplvl9eiv9.R.inc(12751);r.readNBit(44, "reserved");
            }
            }__CLR4_5_29qp9qplvl9eiv9.R.inc(12752);if ((((sub_layer_level_present_flag[i])&&(__CLR4_5_29qp9qplvl9eiv9.R.iget(12753)!=0|true))||(__CLR4_5_29qp9qplvl9eiv9.R.iget(12754)==0&false)))
                {__CLR4_5_29qp9qplvl9eiv9.R.inc(12755);sub_layer_level_idc[i] = r.readU(8, "sub_layer_level_idc");
        }}
    }}finally{__CLR4_5_29qp9qplvl9eiv9.R.flushNeeded();}}

    private void hrd_parameters(boolean commonInfPresentFlag, int maxNumSubLayersMinus1, CAVLCReader r) throws IOException {try{__CLR4_5_29qp9qplvl9eiv9.R.inc(12756);
        __CLR4_5_29qp9qplvl9eiv9.R.inc(12757);boolean nal_hrd_parameters_present_flag = false;
        __CLR4_5_29qp9qplvl9eiv9.R.inc(12758);boolean vcl_hrd_parameters_present_flag = false;
        __CLR4_5_29qp9qplvl9eiv9.R.inc(12759);boolean sub_pic_hrd_params_present_flag = false;
        __CLR4_5_29qp9qplvl9eiv9.R.inc(12760);if ((((commonInfPresentFlag)&&(__CLR4_5_29qp9qplvl9eiv9.R.iget(12761)!=0|true))||(__CLR4_5_29qp9qplvl9eiv9.R.iget(12762)==0&false))) {{
            __CLR4_5_29qp9qplvl9eiv9.R.inc(12763);nal_hrd_parameters_present_flag = r.readBool("nal_hrd_parameters_present_flag");
            __CLR4_5_29qp9qplvl9eiv9.R.inc(12764);vcl_hrd_parameters_present_flag = r.readBool("vcl_hrd_parameters_present_flag");
            __CLR4_5_29qp9qplvl9eiv9.R.inc(12765);if ((((nal_hrd_parameters_present_flag || vcl_hrd_parameters_present_flag)&&(__CLR4_5_29qp9qplvl9eiv9.R.iget(12766)!=0|true))||(__CLR4_5_29qp9qplvl9eiv9.R.iget(12767)==0&false))) {{
                __CLR4_5_29qp9qplvl9eiv9.R.inc(12768);sub_pic_hrd_params_present_flag = r.readBool("sub_pic_hrd_params_present_flag");
                __CLR4_5_29qp9qplvl9eiv9.R.inc(12769);if ((((sub_pic_hrd_params_present_flag)&&(__CLR4_5_29qp9qplvl9eiv9.R.iget(12770)!=0|true))||(__CLR4_5_29qp9qplvl9eiv9.R.iget(12771)==0&false))) {{
                    __CLR4_5_29qp9qplvl9eiv9.R.inc(12772);int tick_divisor_minus2 = r.readU(8, "tick_divisor_minus2");
                    __CLR4_5_29qp9qplvl9eiv9.R.inc(12773);int du_cpb_removal_delay_increment_length_minus1 = r.readU(5, "du_cpb_removal_delay_increment_length_minus1");
                    __CLR4_5_29qp9qplvl9eiv9.R.inc(12774);boolean sub_pic_cpb_params_in_pic_timing_sei_flag = r.readBool("sub_pic_cpb_params_in_pic_timing_sei_flag");
                    __CLR4_5_29qp9qplvl9eiv9.R.inc(12775);int dpb_output_delay_du_length_minus1 = r.readU(5, "dpb_output_delay_du_length_minus1");

                }
                }__CLR4_5_29qp9qplvl9eiv9.R.inc(12776);int bit_rate_scale = r.readU(4, "bit_rate_scale");
                __CLR4_5_29qp9qplvl9eiv9.R.inc(12777);int cpb_size_scale = r.readU(4, "cpb_size_scale");
                __CLR4_5_29qp9qplvl9eiv9.R.inc(12778);if ((((sub_pic_hrd_params_present_flag)&&(__CLR4_5_29qp9qplvl9eiv9.R.iget(12779)!=0|true))||(__CLR4_5_29qp9qplvl9eiv9.R.iget(12780)==0&false))) {{
                    __CLR4_5_29qp9qplvl9eiv9.R.inc(12781);int cpb_size_du_scale = r.readU(4, "cpb_size_du_scale");
                }
                }__CLR4_5_29qp9qplvl9eiv9.R.inc(12782);int initial_cpb_removal_delay_length_minus1 = r.readU(5, "initial_cpb_removal_delay_length_minus1");
                __CLR4_5_29qp9qplvl9eiv9.R.inc(12783);int au_cpb_removal_delay_length_minus1 = r.readU(5, "au_cpb_removal_delay_length_minus1");
                __CLR4_5_29qp9qplvl9eiv9.R.inc(12784);int dpb_output_delay_length_minus1 = r.readU(5, "dpb_output_delay_length_minus1");
            }
        }}
        }__CLR4_5_29qp9qplvl9eiv9.R.inc(12785);boolean fixed_pic_rate_general_flag[] = new boolean[maxNumSubLayersMinus1];
        __CLR4_5_29qp9qplvl9eiv9.R.inc(12786);boolean fixed_pic_rate_within_cvs_flag[] = new boolean[maxNumSubLayersMinus1];
        __CLR4_5_29qp9qplvl9eiv9.R.inc(12787);boolean low_delay_hrd_flag[] = new boolean[maxNumSubLayersMinus1];
        __CLR4_5_29qp9qplvl9eiv9.R.inc(12788);int cpb_cnt_minus1[] = new int[maxNumSubLayersMinus1];
        __CLR4_5_29qp9qplvl9eiv9.R.inc(12789);int elemental_duration_in_tc_minus1[] = new int[maxNumSubLayersMinus1];
        __CLR4_5_29qp9qplvl9eiv9.R.inc(12790);for (int i = 0; (((i <= maxNumSubLayersMinus1)&&(__CLR4_5_29qp9qplvl9eiv9.R.iget(12791)!=0|true))||(__CLR4_5_29qp9qplvl9eiv9.R.iget(12792)==0&false)); i++) {{
            __CLR4_5_29qp9qplvl9eiv9.R.inc(12793);fixed_pic_rate_general_flag[i] = r.readBool("fixed_pic_rate_general_flag[" + i + "]");
            __CLR4_5_29qp9qplvl9eiv9.R.inc(12794);if ((((!fixed_pic_rate_general_flag[i])&&(__CLR4_5_29qp9qplvl9eiv9.R.iget(12795)!=0|true))||(__CLR4_5_29qp9qplvl9eiv9.R.iget(12796)==0&false))) {{
                __CLR4_5_29qp9qplvl9eiv9.R.inc(12797);fixed_pic_rate_within_cvs_flag[i] = r.readBool("fixed_pic_rate_within_cvs_flag[" + i + "]");
            }
            }__CLR4_5_29qp9qplvl9eiv9.R.inc(12798);if ((((fixed_pic_rate_within_cvs_flag[i])&&(__CLR4_5_29qp9qplvl9eiv9.R.iget(12799)!=0|true))||(__CLR4_5_29qp9qplvl9eiv9.R.iget(12800)==0&false))) {{
                __CLR4_5_29qp9qplvl9eiv9.R.inc(12801);elemental_duration_in_tc_minus1[i] = r.readUE("elemental_duration_in_tc_minus1[" + i + "]");
            } }else {{
                __CLR4_5_29qp9qplvl9eiv9.R.inc(12802);low_delay_hrd_flag[i] = r.readBool("low_delay_hrd_flag[" + i + "]");
            }
            }__CLR4_5_29qp9qplvl9eiv9.R.inc(12803);if ((((!low_delay_hrd_flag[i])&&(__CLR4_5_29qp9qplvl9eiv9.R.iget(12804)!=0|true))||(__CLR4_5_29qp9qplvl9eiv9.R.iget(12805)==0&false))) {{
                __CLR4_5_29qp9qplvl9eiv9.R.inc(12806);cpb_cnt_minus1[i] = r.readUE("cpb_cnt_minus1[" + i + "]");
            }
            }__CLR4_5_29qp9qplvl9eiv9.R.inc(12807);if ((((nal_hrd_parameters_present_flag)&&(__CLR4_5_29qp9qplvl9eiv9.R.iget(12808)!=0|true))||(__CLR4_5_29qp9qplvl9eiv9.R.iget(12809)==0&false))) {{
                __CLR4_5_29qp9qplvl9eiv9.R.inc(12810);sub_layer_hrd_parameters(i, cpb_cnt_minus1[i], sub_pic_hrd_params_present_flag, r);
            }
            }__CLR4_5_29qp9qplvl9eiv9.R.inc(12811);if ((((vcl_hrd_parameters_present_flag)&&(__CLR4_5_29qp9qplvl9eiv9.R.iget(12812)!=0|true))||(__CLR4_5_29qp9qplvl9eiv9.R.iget(12813)==0&false))) {{
                __CLR4_5_29qp9qplvl9eiv9.R.inc(12814);sub_layer_hrd_parameters(i, cpb_cnt_minus1[i], sub_pic_hrd_params_present_flag, r);
            }
        }}

    }}finally{__CLR4_5_29qp9qplvl9eiv9.R.flushNeeded();}}

    void sub_layer_hrd_parameters(int subLayerId, int cpbCnt, boolean sub_pic_hrd_params_present_flag, CAVLCReader r) throws IOException {try{__CLR4_5_29qp9qplvl9eiv9.R.inc(12815);
        __CLR4_5_29qp9qplvl9eiv9.R.inc(12816);int bit_rate_value_minus1[] = new int[cpbCnt];
        __CLR4_5_29qp9qplvl9eiv9.R.inc(12817);int cpb_size_value_minus1[] = new int[cpbCnt];
        __CLR4_5_29qp9qplvl9eiv9.R.inc(12818);int cpb_size_du_value_minus1[] = new int[cpbCnt];
        __CLR4_5_29qp9qplvl9eiv9.R.inc(12819);int bit_rate_du_value_minus1[] = new int[cpbCnt];
        __CLR4_5_29qp9qplvl9eiv9.R.inc(12820);boolean cbr_flag[] = new boolean[cpbCnt];
        __CLR4_5_29qp9qplvl9eiv9.R.inc(12821);for (int i = 0; (((i <= cpbCnt)&&(__CLR4_5_29qp9qplvl9eiv9.R.iget(12822)!=0|true))||(__CLR4_5_29qp9qplvl9eiv9.R.iget(12823)==0&false)); i++) {{
            __CLR4_5_29qp9qplvl9eiv9.R.inc(12824);bit_rate_value_minus1[i] = r.readUE("bit_rate_value_minus1[" + i + "]");
            __CLR4_5_29qp9qplvl9eiv9.R.inc(12825);cpb_size_value_minus1[i] = r.readUE("cpb_size_value_minus1[" + i + "]");
            __CLR4_5_29qp9qplvl9eiv9.R.inc(12826);if ((((sub_pic_hrd_params_present_flag)&&(__CLR4_5_29qp9qplvl9eiv9.R.iget(12827)!=0|true))||(__CLR4_5_29qp9qplvl9eiv9.R.iget(12828)==0&false))) {{
                __CLR4_5_29qp9qplvl9eiv9.R.inc(12829);cpb_size_du_value_minus1[i] = r.readUE("cpb_size_du_value_minus1[" + i + "]");
                __CLR4_5_29qp9qplvl9eiv9.R.inc(12830);bit_rate_du_value_minus1[i] = r.readUE("bit_rate_du_value_minus1[" + i + "]");
            }
            }__CLR4_5_29qp9qplvl9eiv9.R.inc(12831);cbr_flag[i] = r.readBool("cbr_flag[" + i + "]");
        }
    }}finally{__CLR4_5_29qp9qplvl9eiv9.R.flushNeeded();}}

    public ByteBuffer toByteBuffer() {try{__CLR4_5_29qp9qplvl9eiv9.R.inc(12832);
        __CLR4_5_29qp9qplvl9eiv9.R.inc(12833);return vps;
    }finally{__CLR4_5_29qp9qplvl9eiv9.R.flushNeeded();}}
}
