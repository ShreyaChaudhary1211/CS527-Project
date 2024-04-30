/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.googlecode.mp4parser.authoring.tracks.h264;

import com.googlecode.mp4parser.h264.model.PictureParameterSet;
import com.googlecode.mp4parser.h264.model.SeqParameterSet;
import com.googlecode.mp4parser.h264.read.CAVLCReader;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

/**
 * Created by sannies on 13.08.2015.
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class SliceHeader {public static class __CLR4_5_296j96jlvluliey{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,11965,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public enum SliceType {
        P, B, I, SP, SI
    }

    public int first_mb_in_slice;
    public SliceType slice_type;
    public int pic_parameter_set_id;
    public int colour_plane_id;
    public int frame_num;
    public boolean field_pic_flag = false;
    public boolean bottom_field_flag = false;
    public int idr_pic_id;
    public int pic_order_cnt_lsb;
    public int delta_pic_order_cnt_bottom;
    public int delta_pic_order_cnt_0;
    public int delta_pic_order_cnt_1;

    PictureParameterSet pps;
    SeqParameterSet sps;

    public SliceHeader(InputStream is, Map<Integer, SeqParameterSet> spss, Map<Integer, PictureParameterSet> ppss, boolean IdrPicFlag) {try{__CLR4_5_296j96jlvluliey.R.inc(11899);
        __CLR4_5_296j96jlvluliey.R.inc(11900);try {
            __CLR4_5_296j96jlvluliey.R.inc(11901);is.read();
            __CLR4_5_296j96jlvluliey.R.inc(11902);CAVLCReader reader = new CAVLCReader(is);
            __CLR4_5_296j96jlvluliey.R.inc(11903);first_mb_in_slice = reader.readUE("SliceHeader: first_mb_in_slice");
            __CLR4_5_296j96jlvluliey.R.inc(11904);int sliceTypeInt = reader.readUE("SliceHeader: slice_type");
            boolean __CLB4_5_2_bool0=false;__CLR4_5_296j96jlvluliey.R.inc(11905);switch (sliceTypeInt) {
                case 0:if (!__CLB4_5_2_bool0) {__CLR4_5_296j96jlvluliey.R.inc(11906);__CLB4_5_2_bool0=true;}
                case 5:if (!__CLB4_5_2_bool0) {__CLR4_5_296j96jlvluliey.R.inc(11907);__CLB4_5_2_bool0=true;}
                    __CLR4_5_296j96jlvluliey.R.inc(11908);slice_type = SliceType.P;
                    __CLR4_5_296j96jlvluliey.R.inc(11909);break;

                case 1:if (!__CLB4_5_2_bool0) {__CLR4_5_296j96jlvluliey.R.inc(11910);__CLB4_5_2_bool0=true;}
                case 6:if (!__CLB4_5_2_bool0) {__CLR4_5_296j96jlvluliey.R.inc(11911);__CLB4_5_2_bool0=true;}
                    __CLR4_5_296j96jlvluliey.R.inc(11912);slice_type = SliceType.B;
                    __CLR4_5_296j96jlvluliey.R.inc(11913);break;

                case 2:if (!__CLB4_5_2_bool0) {__CLR4_5_296j96jlvluliey.R.inc(11914);__CLB4_5_2_bool0=true;}
                case 7:if (!__CLB4_5_2_bool0) {__CLR4_5_296j96jlvluliey.R.inc(11915);__CLB4_5_2_bool0=true;}
                    __CLR4_5_296j96jlvluliey.R.inc(11916);slice_type = SliceType.I;
                    __CLR4_5_296j96jlvluliey.R.inc(11917);break;

                case 3:if (!__CLB4_5_2_bool0) {__CLR4_5_296j96jlvluliey.R.inc(11918);__CLB4_5_2_bool0=true;}
                case 8:if (!__CLB4_5_2_bool0) {__CLR4_5_296j96jlvluliey.R.inc(11919);__CLB4_5_2_bool0=true;}
                    __CLR4_5_296j96jlvluliey.R.inc(11920);slice_type = SliceType.SP;
                    __CLR4_5_296j96jlvluliey.R.inc(11921);break;

                case 4:if (!__CLB4_5_2_bool0) {__CLR4_5_296j96jlvluliey.R.inc(11922);__CLB4_5_2_bool0=true;}
                case 9:if (!__CLB4_5_2_bool0) {__CLR4_5_296j96jlvluliey.R.inc(11923);__CLB4_5_2_bool0=true;}
                    __CLR4_5_296j96jlvluliey.R.inc(11924);slice_type = SliceType.SI;
                    __CLR4_5_296j96jlvluliey.R.inc(11925);break;

            }

            __CLR4_5_296j96jlvluliey.R.inc(11926);pic_parameter_set_id = reader.readUE("SliceHeader: pic_parameter_set_id");
            __CLR4_5_296j96jlvluliey.R.inc(11927);pps = ppss.get(pic_parameter_set_id);
            __CLR4_5_296j96jlvluliey.R.inc(11928);sps = spss.get(pps.seq_parameter_set_id);
            __CLR4_5_296j96jlvluliey.R.inc(11929);if ((((sps.residual_color_transform_flag)&&(__CLR4_5_296j96jlvluliey.R.iget(11930)!=0|true))||(__CLR4_5_296j96jlvluliey.R.iget(11931)==0&false))) {{
                __CLR4_5_296j96jlvluliey.R.inc(11932);colour_plane_id = reader.readU(2, "SliceHeader: colour_plane_id");
            }
            }__CLR4_5_296j96jlvluliey.R.inc(11933);frame_num = reader.readU(sps.log2_max_frame_num_minus4 + 4, "SliceHeader: frame_num");
            __CLR4_5_296j96jlvluliey.R.inc(11934);if ((((!sps.frame_mbs_only_flag)&&(__CLR4_5_296j96jlvluliey.R.iget(11935)!=0|true))||(__CLR4_5_296j96jlvluliey.R.iget(11936)==0&false))) {{
                __CLR4_5_296j96jlvluliey.R.inc(11937);field_pic_flag = reader.readBool("SliceHeader: field_pic_flag");
                __CLR4_5_296j96jlvluliey.R.inc(11938);if ((((field_pic_flag)&&(__CLR4_5_296j96jlvluliey.R.iget(11939)!=0|true))||(__CLR4_5_296j96jlvluliey.R.iget(11940)==0&false))) {{
                    __CLR4_5_296j96jlvluliey.R.inc(11941);bottom_field_flag = reader.readBool("SliceHeader: bottom_field_flag");
                }
            }}
            }__CLR4_5_296j96jlvluliey.R.inc(11942);if ((((IdrPicFlag)&&(__CLR4_5_296j96jlvluliey.R.iget(11943)!=0|true))||(__CLR4_5_296j96jlvluliey.R.iget(11944)==0&false))) {{

                __CLR4_5_296j96jlvluliey.R.inc(11945);idr_pic_id = reader.readUE("SliceHeader: idr_pic_id");
            }
            }__CLR4_5_296j96jlvluliey.R.inc(11946);if ((((sps.pic_order_cnt_type == 0)&&(__CLR4_5_296j96jlvluliey.R.iget(11947)!=0|true))||(__CLR4_5_296j96jlvluliey.R.iget(11948)==0&false))) {{
                __CLR4_5_296j96jlvluliey.R.inc(11949);pic_order_cnt_lsb = reader.readU(sps.log2_max_pic_order_cnt_lsb_minus4 + 4, "SliceHeader: pic_order_cnt_lsb");
                __CLR4_5_296j96jlvluliey.R.inc(11950);if ((((pps.bottom_field_pic_order_in_frame_present_flag && !field_pic_flag)&&(__CLR4_5_296j96jlvluliey.R.iget(11951)!=0|true))||(__CLR4_5_296j96jlvluliey.R.iget(11952)==0&false))) {{
                    __CLR4_5_296j96jlvluliey.R.inc(11953);delta_pic_order_cnt_bottom = reader.readSE("SliceHeader: delta_pic_order_cnt_bottom");
                }
            }}

            }__CLR4_5_296j96jlvluliey.R.inc(11954);if ((((sps.pic_order_cnt_type == 1 && !sps.delta_pic_order_always_zero_flag)&&(__CLR4_5_296j96jlvluliey.R.iget(11955)!=0|true))||(__CLR4_5_296j96jlvluliey.R.iget(11956)==0&false))) {{

                __CLR4_5_296j96jlvluliey.R.inc(11957);delta_pic_order_cnt_0 = reader.readSE("delta_pic_order_cnt_0");
                __CLR4_5_296j96jlvluliey.R.inc(11958);if ((((pps.bottom_field_pic_order_in_frame_present_flag && !field_pic_flag)&&(__CLR4_5_296j96jlvluliey.R.iget(11959)!=0|true))||(__CLR4_5_296j96jlvluliey.R.iget(11960)==0&false))) {{
                    __CLR4_5_296j96jlvluliey.R.inc(11961);delta_pic_order_cnt_1 = reader.readSE("delta_pic_order_cnt_1");
                }
            }}
        }} catch (IOException e) {
            __CLR4_5_296j96jlvluliey.R.inc(11962);throw new RuntimeException(e);
        }

    }finally{__CLR4_5_296j96jlvluliey.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_5_296j96jlvluliey.R.inc(11963);
        __CLR4_5_296j96jlvluliey.R.inc(11964);return "SliceHeader{" +
                "first_mb_in_slice=" + first_mb_in_slice +
                ", slice_type=" + slice_type +
                ", pic_parameter_set_id=" + pic_parameter_set_id +
                ", colour_plane_id=" + colour_plane_id +
                ", frame_num=" + frame_num +
                ", field_pic_flag=" + field_pic_flag +
                ", bottom_field_flag=" + bottom_field_flag +
                ", idr_pic_id=" + idr_pic_id +
                ", pic_order_cnt_lsb=" + pic_order_cnt_lsb +
                ", delta_pic_order_cnt_bottom=" + delta_pic_order_cnt_bottom +
                '}';
    }finally{__CLR4_5_296j96jlvluliey.R.flushNeeded();}}
}
