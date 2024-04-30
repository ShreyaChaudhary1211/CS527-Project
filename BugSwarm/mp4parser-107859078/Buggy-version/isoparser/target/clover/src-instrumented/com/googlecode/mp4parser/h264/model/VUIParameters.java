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

public class VUIParameters {public static class __CLR4_5_2f7pf7plvl9ekts{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,19730,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static class BitstreamRestriction {

        public boolean motion_vectors_over_pic_boundaries_flag;
        public int max_bytes_per_pic_denom;
        public int max_bits_per_mb_denom;
        public int log2_max_mv_length_horizontal;
        public int log2_max_mv_length_vertical;
        public int num_reorder_frames;
        public int max_dec_frame_buffering;

        @Override
        public String toString() {try{__CLR4_5_2f7pf7plvl9ekts.R.inc(19717);
            __CLR4_5_2f7pf7plvl9ekts.R.inc(19718);final StringBuilder sb = new StringBuilder("BitstreamRestriction{");
            __CLR4_5_2f7pf7plvl9ekts.R.inc(19719);sb.append("motion_vectors_over_pic_boundaries_flag=").append(motion_vectors_over_pic_boundaries_flag);
            __CLR4_5_2f7pf7plvl9ekts.R.inc(19720);sb.append(", max_bytes_per_pic_denom=").append(max_bytes_per_pic_denom);
            __CLR4_5_2f7pf7plvl9ekts.R.inc(19721);sb.append(", max_bits_per_mb_denom=").append(max_bits_per_mb_denom);
            __CLR4_5_2f7pf7plvl9ekts.R.inc(19722);sb.append(", log2_max_mv_length_horizontal=").append(log2_max_mv_length_horizontal);
            __CLR4_5_2f7pf7plvl9ekts.R.inc(19723);sb.append(", log2_max_mv_length_vertical=").append(log2_max_mv_length_vertical);
            __CLR4_5_2f7pf7plvl9ekts.R.inc(19724);sb.append(", num_reorder_frames=").append(num_reorder_frames);
            __CLR4_5_2f7pf7plvl9ekts.R.inc(19725);sb.append(", max_dec_frame_buffering=").append(max_dec_frame_buffering);
            __CLR4_5_2f7pf7plvl9ekts.R.inc(19726);sb.append('}');
            __CLR4_5_2f7pf7plvl9ekts.R.inc(19727);return sb.toString();
        }finally{__CLR4_5_2f7pf7plvl9ekts.R.flushNeeded();}}
    }

    public boolean aspect_ratio_info_present_flag;
    public int sar_width;
    public int sar_height;
    public boolean overscan_info_present_flag;
    public boolean overscan_appropriate_flag;
    public boolean video_signal_type_present_flag;
    public int video_format;
    public boolean video_full_range_flag;
    public boolean colour_description_present_flag;
    public int colour_primaries;
    public int transfer_characteristics;
    public int matrix_coefficients;
    public boolean chroma_loc_info_present_flag;
    public int chroma_sample_loc_type_top_field;
    public int chroma_sample_loc_type_bottom_field;
    public boolean timing_info_present_flag;
    public int num_units_in_tick;
    public int time_scale;
    public boolean fixed_frame_rate_flag;
    public boolean low_delay_hrd_flag;
    public boolean pic_struct_present_flag;
    public HRDParameters nalHRDParams;
    public HRDParameters vclHRDParams;

    public BitstreamRestriction bitstreamRestriction;
    public AspectRatio aspect_ratio;

    @Override
    public String toString() {try{__CLR4_5_2f7pf7plvl9ekts.R.inc(19728);
        __CLR4_5_2f7pf7plvl9ekts.R.inc(19729);return "VUIParameters{" + "\n" +
                "aspect_ratio_info_present_flag=" + aspect_ratio_info_present_flag + "\n" +
                ", sar_width=" + sar_width + "\n" +
                ", sar_height=" + sar_height + "\n" +
                ", overscan_info_present_flag=" + overscan_info_present_flag + "\n" +
                ", overscan_appropriate_flag=" + overscan_appropriate_flag + "\n" +
                ", video_signal_type_present_flag=" + video_signal_type_present_flag + "\n" +
                ", video_format=" + video_format + "\n" +
                ", video_full_range_flag=" + video_full_range_flag + "\n" +
                ", colour_description_present_flag=" + colour_description_present_flag + "\n" +
                ", colour_primaries=" + colour_primaries + "\n" +
                ", transfer_characteristics=" + transfer_characteristics + "\n" +
                ", matrix_coefficients=" + matrix_coefficients + "\n" +
                ", chroma_loc_info_present_flag=" + chroma_loc_info_present_flag + "\n" +
                ", chroma_sample_loc_type_top_field=" + chroma_sample_loc_type_top_field + "\n" +
                ", chroma_sample_loc_type_bottom_field=" + chroma_sample_loc_type_bottom_field + "\n" +
                ", timing_info_present_flag=" + timing_info_present_flag + "\n" +
                ", num_units_in_tick=" + num_units_in_tick + "\n" +
                ", time_scale=" + time_scale + "\n" +
                ", fixed_frame_rate_flag=" + fixed_frame_rate_flag + "\n" +
                ", low_delay_hrd_flag=" + low_delay_hrd_flag + "\n" +
                ", pic_struct_present_flag=" + pic_struct_present_flag + "\n" +
                ", nalHRDParams=" + nalHRDParams + "\n" +
                ", vclHRDParams=" + vclHRDParams + "\n" +
                ", bitstreamRestriction=" + bitstreamRestriction + "\n" +
                ", aspect_ratio=" + aspect_ratio + "\n" +
                '}';
    }finally{__CLR4_5_2f7pf7plvl9ekts.R.flushNeeded();}}
}
