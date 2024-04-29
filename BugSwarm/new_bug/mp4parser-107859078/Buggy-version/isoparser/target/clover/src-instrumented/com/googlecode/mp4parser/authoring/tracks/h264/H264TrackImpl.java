/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.googlecode.mp4parser.authoring.tracks.h264;

import com.coremedia.iso.boxes.CompositionTimeToSample;
import com.coremedia.iso.boxes.SampleDependencyTypeBox;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.sampleentry.VisualSampleEntry;
import com.googlecode.mp4parser.DataSource;
import com.googlecode.mp4parser.authoring.Sample;
import com.googlecode.mp4parser.authoring.tracks.AbstractH26XTrack;
import com.googlecode.mp4parser.h264.model.PictureParameterSet;
import com.googlecode.mp4parser.h264.model.SeqParameterSet;
import com.googlecode.mp4parser.h264.read.CAVLCReader;
import com.googlecode.mp4parser.util.Mp4Arrays;
import com.googlecode.mp4parser.util.RangeStartMap;
import com.mp4parser.iso14496.part15.AvcConfigurationBox;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.*;
import java.util.logging.Logger;

/**
 * The <code>H264TrackImpl</code> creates a <code>Track</code> from an H.264
 * Annex B file.
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class H264TrackImpl extends AbstractH26XTrack {public static class __CLR4_5_28m78m7lvl9eija{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,11804,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final Logger LOG = Logger.getLogger(H264TrackImpl.class.getName());

    Map<Integer, byte[]> spsIdToSpsBytes = new HashMap<Integer, byte[]>();
    Map<Integer, SeqParameterSet> spsIdToSps = new HashMap<Integer, SeqParameterSet>();
    Map<Integer, byte[]> ppsIdToPpsBytes = new HashMap<Integer, byte[]>();
    Map<Integer, PictureParameterSet> ppsIdToPps = new HashMap<Integer, PictureParameterSet>();

    SampleDescriptionBox sampleDescriptionBox;
    SeqParameterSet firstSeqParameterSet = null;
    PictureParameterSet firstPictureParameterSet = null;
    SeqParameterSet currentSeqParameterSet = null;
    PictureParameterSet currentPictureParameterSet = null;
    RangeStartMap<Integer, byte[]> seqParameterRangeMap = new RangeStartMap<Integer, byte[]>();
    RangeStartMap<Integer, byte[]> pictureParameterRangeMap = new RangeStartMap<Integer, byte[]>();
    int frameNrInGop = 0;
    int[] pictureOrderCounts = new int[0];
    int prevPicOrderCntLsb = 0;
    int prevPicOrderCntMsb = 0;
    private List<Sample> samples;
    private int width;
    private int height;
    private long timescale;
    private int frametick;
    private SEIMessage seiMessage;
    private boolean determineFrameRate = true;
    private String lang = "eng";

    /**
     * Creates a new <code>Track</code> object from a raw H264 source (<code>DataSource dataSource1</code>).
     * Whenever the timescale and frametick are set to negative value (e.g. -1) the H264TrackImpl
     * tries to detect the frame rate.
     * Typically values for <code>timescale</code> and <code>frametick</code> are:
     * <ul>
     * <li>23.976 FPS: timescale = 24000; frametick = 1001</li>
     * <li>25 FPS: timescale = 25; frametick = 1</li>
     * <li>29.97 FPS: timescale = 30000; frametick = 1001</li>
     * <li>30 FPS: timescale = 30; frametick = 1</li>
     * </ul>
     *
     * @param dataSource the source file of the H264 samples
     * @param lang       language of the movie (in doubt: use "eng")
     * @param timescale  number of time units (ticks) in one second
     * @param frametick  number of time units (ticks) that pass while showing exactly one frame
     * @throws IOException in case of problems whiel reading from the <code>DataSource</code>
     */
    public H264TrackImpl(DataSource dataSource, String lang, long timescale, int frametick) throws IOException {
        super(dataSource);__CLR4_5_28m78m7lvl9eija.R.inc(11168);try{__CLR4_5_28m78m7lvl9eija.R.inc(11167);
        __CLR4_5_28m78m7lvl9eija.R.inc(11169);this.lang = lang;
        __CLR4_5_28m78m7lvl9eija.R.inc(11170);this.timescale = timescale; //e.g. 23976
        __CLR4_5_28m78m7lvl9eija.R.inc(11171);this.frametick = frametick;
        __CLR4_5_28m78m7lvl9eija.R.inc(11172);if (((((timescale > 0) && (frametick > 0))&&(__CLR4_5_28m78m7lvl9eija.R.iget(11173)!=0|true))||(__CLR4_5_28m78m7lvl9eija.R.iget(11174)==0&false))) {{
            __CLR4_5_28m78m7lvl9eija.R.inc(11175);this.determineFrameRate = false;
        }

        }__CLR4_5_28m78m7lvl9eija.R.inc(11176);parse(new LookAhead(dataSource));
    }finally{__CLR4_5_28m78m7lvl9eija.R.flushNeeded();}}

    public H264TrackImpl(DataSource dataSource, String lang) throws IOException {
        this(dataSource, lang, -1, -1);__CLR4_5_28m78m7lvl9eija.R.inc(11178);try{__CLR4_5_28m78m7lvl9eija.R.inc(11177);
    }finally{__CLR4_5_28m78m7lvl9eija.R.flushNeeded();}}

    public H264TrackImpl(DataSource dataSource) throws IOException {
        this(dataSource, "eng");__CLR4_5_28m78m7lvl9eija.R.inc(11180);try{__CLR4_5_28m78m7lvl9eija.R.inc(11179);
    }finally{__CLR4_5_28m78m7lvl9eija.R.flushNeeded();}}

    public static H264NalUnitHeader getNalUnitHeader(ByteBuffer nal) {try{__CLR4_5_28m78m7lvl9eija.R.inc(11181);
        __CLR4_5_28m78m7lvl9eija.R.inc(11182);H264NalUnitHeader nalUnitHeader = new H264NalUnitHeader();
        __CLR4_5_28m78m7lvl9eija.R.inc(11183);int type = nal.get(0);
        __CLR4_5_28m78m7lvl9eija.R.inc(11184);nalUnitHeader.nal_ref_idc = (type >> 5) & 3;
        __CLR4_5_28m78m7lvl9eija.R.inc(11185);nalUnitHeader.nal_unit_type = type & 0x1f;

        __CLR4_5_28m78m7lvl9eija.R.inc(11186);return nalUnitHeader;
    }finally{__CLR4_5_28m78m7lvl9eija.R.flushNeeded();}}

    private void parse(LookAhead la) throws IOException {try{__CLR4_5_28m78m7lvl9eija.R.inc(11187);


        __CLR4_5_28m78m7lvl9eija.R.inc(11188);samples = new ArrayList<Sample>();
        __CLR4_5_28m78m7lvl9eija.R.inc(11189);if ((((!readSamples(la))&&(__CLR4_5_28m78m7lvl9eija.R.iget(11190)!=0|true))||(__CLR4_5_28m78m7lvl9eija.R.iget(11191)==0&false))) {{
            __CLR4_5_28m78m7lvl9eija.R.inc(11192);throw new IOException();
        }

        }__CLR4_5_28m78m7lvl9eija.R.inc(11193);if ((((!readVariables())&&(__CLR4_5_28m78m7lvl9eija.R.iget(11194)!=0|true))||(__CLR4_5_28m78m7lvl9eija.R.iget(11195)==0&false))) {{
            __CLR4_5_28m78m7lvl9eija.R.inc(11196);throw new IOException();
        }

        }__CLR4_5_28m78m7lvl9eija.R.inc(11197);sampleDescriptionBox = new SampleDescriptionBox();
        __CLR4_5_28m78m7lvl9eija.R.inc(11198);VisualSampleEntry visualSampleEntry = new VisualSampleEntry("avc1");
        __CLR4_5_28m78m7lvl9eija.R.inc(11199);visualSampleEntry.setDataReferenceIndex(1);
        __CLR4_5_28m78m7lvl9eija.R.inc(11200);visualSampleEntry.setDepth(24);
        __CLR4_5_28m78m7lvl9eija.R.inc(11201);visualSampleEntry.setFrameCount(1);
        __CLR4_5_28m78m7lvl9eija.R.inc(11202);visualSampleEntry.setHorizresolution(72);
        __CLR4_5_28m78m7lvl9eija.R.inc(11203);visualSampleEntry.setVertresolution(72);
        __CLR4_5_28m78m7lvl9eija.R.inc(11204);visualSampleEntry.setWidth(width);
        __CLR4_5_28m78m7lvl9eija.R.inc(11205);visualSampleEntry.setHeight(height);
        __CLR4_5_28m78m7lvl9eija.R.inc(11206);visualSampleEntry.setCompressorname("AVC Coding");

        __CLR4_5_28m78m7lvl9eija.R.inc(11207);AvcConfigurationBox avcConfigurationBox = new AvcConfigurationBox();

        __CLR4_5_28m78m7lvl9eija.R.inc(11208);avcConfigurationBox.setSequenceParameterSets(new ArrayList<byte[]>(spsIdToSpsBytes.values()));
        __CLR4_5_28m78m7lvl9eija.R.inc(11209);avcConfigurationBox.setPictureParameterSets(new ArrayList<byte[]>(ppsIdToPpsBytes.values()));
        __CLR4_5_28m78m7lvl9eija.R.inc(11210);avcConfigurationBox.setAvcLevelIndication(firstSeqParameterSet.level_idc);
        __CLR4_5_28m78m7lvl9eija.R.inc(11211);avcConfigurationBox.setAvcProfileIndication(firstSeqParameterSet.profile_idc);
        __CLR4_5_28m78m7lvl9eija.R.inc(11212);avcConfigurationBox.setBitDepthLumaMinus8(firstSeqParameterSet.bit_depth_luma_minus8);
        __CLR4_5_28m78m7lvl9eija.R.inc(11213);avcConfigurationBox.setBitDepthChromaMinus8(firstSeqParameterSet.bit_depth_chroma_minus8);
        __CLR4_5_28m78m7lvl9eija.R.inc(11214);avcConfigurationBox.setChromaFormat(firstSeqParameterSet.chroma_format_idc.getId());
        __CLR4_5_28m78m7lvl9eija.R.inc(11215);avcConfigurationBox.setConfigurationVersion(1);
        __CLR4_5_28m78m7lvl9eija.R.inc(11216);avcConfigurationBox.setLengthSizeMinusOne(3);


        __CLR4_5_28m78m7lvl9eija.R.inc(11217);avcConfigurationBox.setProfileCompatibility(
                ((((firstSeqParameterSet.constraint_set_0_flag )&&(__CLR4_5_28m78m7lvl9eija.R.iget(11218)!=0|true))||(__CLR4_5_28m78m7lvl9eija.R.iget(11219)==0&false))? 128 : 0) +
                        ((((firstSeqParameterSet.constraint_set_1_flag )&&(__CLR4_5_28m78m7lvl9eija.R.iget(11220)!=0|true))||(__CLR4_5_28m78m7lvl9eija.R.iget(11221)==0&false))? 64 : 0) +
                        ((((firstSeqParameterSet.constraint_set_2_flag )&&(__CLR4_5_28m78m7lvl9eija.R.iget(11222)!=0|true))||(__CLR4_5_28m78m7lvl9eija.R.iget(11223)==0&false))? 32 : 0) +
                        ((((firstSeqParameterSet.constraint_set_3_flag )&&(__CLR4_5_28m78m7lvl9eija.R.iget(11224)!=0|true))||(__CLR4_5_28m78m7lvl9eija.R.iget(11225)==0&false))? 16 : 0) +
                        ((((firstSeqParameterSet.constraint_set_4_flag )&&(__CLR4_5_28m78m7lvl9eija.R.iget(11226)!=0|true))||(__CLR4_5_28m78m7lvl9eija.R.iget(11227)==0&false))? 8 : 0) +
                        (int) (firstSeqParameterSet.reserved_zero_2bits & 0x3)
        );

        __CLR4_5_28m78m7lvl9eija.R.inc(11228);visualSampleEntry.addBox(avcConfigurationBox);
        __CLR4_5_28m78m7lvl9eija.R.inc(11229);sampleDescriptionBox.addBox(visualSampleEntry);

        __CLR4_5_28m78m7lvl9eija.R.inc(11230);trackMetaData.setCreationTime(new Date());
        __CLR4_5_28m78m7lvl9eija.R.inc(11231);trackMetaData.setModificationTime(new Date());
        __CLR4_5_28m78m7lvl9eija.R.inc(11232);trackMetaData.setLanguage(lang);
        __CLR4_5_28m78m7lvl9eija.R.inc(11233);trackMetaData.setTimescale(timescale);
        __CLR4_5_28m78m7lvl9eija.R.inc(11234);trackMetaData.setWidth(width);
        __CLR4_5_28m78m7lvl9eija.R.inc(11235);trackMetaData.setHeight(height);
    }finally{__CLR4_5_28m78m7lvl9eija.R.flushNeeded();}}

    public SampleDescriptionBox getSampleDescriptionBox() {try{__CLR4_5_28m78m7lvl9eija.R.inc(11236);
        __CLR4_5_28m78m7lvl9eija.R.inc(11237);return sampleDescriptionBox;
    }finally{__CLR4_5_28m78m7lvl9eija.R.flushNeeded();}}

    public String getHandler() {try{__CLR4_5_28m78m7lvl9eija.R.inc(11238);
        __CLR4_5_28m78m7lvl9eija.R.inc(11239);return "vide";
    }finally{__CLR4_5_28m78m7lvl9eija.R.flushNeeded();}}

    public List<Sample> getSamples() {try{__CLR4_5_28m78m7lvl9eija.R.inc(11240);
        __CLR4_5_28m78m7lvl9eija.R.inc(11241);return samples;
    }finally{__CLR4_5_28m78m7lvl9eija.R.flushNeeded();}}

    private boolean readVariables() {try{__CLR4_5_28m78m7lvl9eija.R.inc(11242);
        __CLR4_5_28m78m7lvl9eija.R.inc(11243);width = (firstSeqParameterSet.pic_width_in_mbs_minus1 + 1) * 16;
        __CLR4_5_28m78m7lvl9eija.R.inc(11244);int mult = 2;
        __CLR4_5_28m78m7lvl9eija.R.inc(11245);if ((((firstSeqParameterSet.frame_mbs_only_flag)&&(__CLR4_5_28m78m7lvl9eija.R.iget(11246)!=0|true))||(__CLR4_5_28m78m7lvl9eija.R.iget(11247)==0&false))) {{
            __CLR4_5_28m78m7lvl9eija.R.inc(11248);mult = 1;
        }
        }__CLR4_5_28m78m7lvl9eija.R.inc(11249);height = 16 * (firstSeqParameterSet.pic_height_in_map_units_minus1 + 1) * mult;
        __CLR4_5_28m78m7lvl9eija.R.inc(11250);if ((((firstSeqParameterSet.frame_cropping_flag)&&(__CLR4_5_28m78m7lvl9eija.R.iget(11251)!=0|true))||(__CLR4_5_28m78m7lvl9eija.R.iget(11252)==0&false))) {{
            __CLR4_5_28m78m7lvl9eija.R.inc(11253);int chromaArrayType = 0;
            __CLR4_5_28m78m7lvl9eija.R.inc(11254);if ((((!firstSeqParameterSet.residual_color_transform_flag)&&(__CLR4_5_28m78m7lvl9eija.R.iget(11255)!=0|true))||(__CLR4_5_28m78m7lvl9eija.R.iget(11256)==0&false))) {{
                __CLR4_5_28m78m7lvl9eija.R.inc(11257);chromaArrayType = firstSeqParameterSet.chroma_format_idc.getId();
            }
            }__CLR4_5_28m78m7lvl9eija.R.inc(11258);int cropUnitX = 1;
            __CLR4_5_28m78m7lvl9eija.R.inc(11259);int cropUnitY = mult;
            __CLR4_5_28m78m7lvl9eija.R.inc(11260);if ((((chromaArrayType != 0)&&(__CLR4_5_28m78m7lvl9eija.R.iget(11261)!=0|true))||(__CLR4_5_28m78m7lvl9eija.R.iget(11262)==0&false))) {{
                __CLR4_5_28m78m7lvl9eija.R.inc(11263);cropUnitX = firstSeqParameterSet.chroma_format_idc.getSubWidth();
                __CLR4_5_28m78m7lvl9eija.R.inc(11264);cropUnitY = firstSeqParameterSet.chroma_format_idc.getSubHeight() * mult;
            }

            }__CLR4_5_28m78m7lvl9eija.R.inc(11265);width -= cropUnitX * (firstSeqParameterSet.frame_crop_left_offset + firstSeqParameterSet.frame_crop_right_offset);
            __CLR4_5_28m78m7lvl9eija.R.inc(11266);height -= cropUnitY * (firstSeqParameterSet.frame_crop_top_offset + firstSeqParameterSet.frame_crop_bottom_offset);
        }
        }__CLR4_5_28m78m7lvl9eija.R.inc(11267);return true;
    }finally{__CLR4_5_28m78m7lvl9eija.R.flushNeeded();}}

    private boolean readSamples(LookAhead la) throws IOException {try{__CLR4_5_28m78m7lvl9eija.R.inc(11268);


        __CLR4_5_28m78m7lvl9eija.R.inc(11269);List<ByteBuffer> buffered = new ArrayList<ByteBuffer>();


        __CLR4_5_28m78m7lvl9eija.R.inc(11270);ByteBuffer nal;


        class FirstVclNalDetector {

            int frame_num;
            int pic_parameter_set_id;
            boolean field_pic_flag;
            boolean bottom_field_flag;
            int nal_ref_idc;
            int pic_order_cnt_type;
            int delta_pic_order_cnt_bottom;
            int pic_order_cnt_lsb;
            int delta_pic_order_cnt_0;
            int delta_pic_order_cnt_1;
            boolean idrPicFlag;
            int idr_pic_id;
            public FirstVclNalDetector(ByteBuffer nal, int nal_ref_idc, int nal_unit_type) {try{__CLR4_5_28m78m7lvl9eija.R.inc(11271);
                __CLR4_5_28m78m7lvl9eija.R.inc(11272);InputStream bs = cleanBuffer(new ByteBufferBackedInputStream(nal));
                __CLR4_5_28m78m7lvl9eija.R.inc(11273);SliceHeader sh = new SliceHeader(bs, spsIdToSps, ppsIdToPps, nal_unit_type == 5);
                __CLR4_5_28m78m7lvl9eija.R.inc(11274);this.frame_num = sh.frame_num;
                __CLR4_5_28m78m7lvl9eija.R.inc(11275);this.pic_parameter_set_id = sh.pic_parameter_set_id;
                __CLR4_5_28m78m7lvl9eija.R.inc(11276);this.field_pic_flag = sh.field_pic_flag;
                __CLR4_5_28m78m7lvl9eija.R.inc(11277);this.bottom_field_flag = sh.bottom_field_flag;
                __CLR4_5_28m78m7lvl9eija.R.inc(11278);this.nal_ref_idc = nal_ref_idc;
                __CLR4_5_28m78m7lvl9eija.R.inc(11279);this.pic_order_cnt_type = spsIdToSps.get(ppsIdToPps.get(sh.pic_parameter_set_id).seq_parameter_set_id).pic_order_cnt_type;
                __CLR4_5_28m78m7lvl9eija.R.inc(11280);this.delta_pic_order_cnt_bottom = sh.delta_pic_order_cnt_bottom;
                __CLR4_5_28m78m7lvl9eija.R.inc(11281);this.pic_order_cnt_lsb = sh.pic_order_cnt_lsb;
                __CLR4_5_28m78m7lvl9eija.R.inc(11282);this.delta_pic_order_cnt_0 = sh.delta_pic_order_cnt_0;
                __CLR4_5_28m78m7lvl9eija.R.inc(11283);this.delta_pic_order_cnt_1 = sh.delta_pic_order_cnt_1;
                __CLR4_5_28m78m7lvl9eija.R.inc(11284);this.idr_pic_id = sh.idr_pic_id;
            }finally{__CLR4_5_28m78m7lvl9eija.R.flushNeeded();}}

            boolean isFirstInNew(FirstVclNalDetector nu) {try{__CLR4_5_28m78m7lvl9eija.R.inc(11285);
                __CLR4_5_28m78m7lvl9eija.R.inc(11286);if ((((nu.frame_num != frame_num)&&(__CLR4_5_28m78m7lvl9eija.R.iget(11287)!=0|true))||(__CLR4_5_28m78m7lvl9eija.R.iget(11288)==0&false))) {{
                    __CLR4_5_28m78m7lvl9eija.R.inc(11289);return true;
                }
                }__CLR4_5_28m78m7lvl9eija.R.inc(11290);if ((((nu.pic_parameter_set_id != pic_parameter_set_id)&&(__CLR4_5_28m78m7lvl9eija.R.iget(11291)!=0|true))||(__CLR4_5_28m78m7lvl9eija.R.iget(11292)==0&false))) {{
                    __CLR4_5_28m78m7lvl9eija.R.inc(11293);return true;
                }
                }__CLR4_5_28m78m7lvl9eija.R.inc(11294);if ((((nu.field_pic_flag != field_pic_flag)&&(__CLR4_5_28m78m7lvl9eija.R.iget(11295)!=0|true))||(__CLR4_5_28m78m7lvl9eija.R.iget(11296)==0&false))) {{
                    __CLR4_5_28m78m7lvl9eija.R.inc(11297);return true;
                }
                }__CLR4_5_28m78m7lvl9eija.R.inc(11298);if ((((nu.field_pic_flag)&&(__CLR4_5_28m78m7lvl9eija.R.iget(11299)!=0|true))||(__CLR4_5_28m78m7lvl9eija.R.iget(11300)==0&false))) {{
                    __CLR4_5_28m78m7lvl9eija.R.inc(11301);if ((((nu.bottom_field_flag != bottom_field_flag)&&(__CLR4_5_28m78m7lvl9eija.R.iget(11302)!=0|true))||(__CLR4_5_28m78m7lvl9eija.R.iget(11303)==0&false))) {{
                        __CLR4_5_28m78m7lvl9eija.R.inc(11304);return true;
                    }
                }}
                }__CLR4_5_28m78m7lvl9eija.R.inc(11305);if ((((nu.nal_ref_idc != nal_ref_idc)&&(__CLR4_5_28m78m7lvl9eija.R.iget(11306)!=0|true))||(__CLR4_5_28m78m7lvl9eija.R.iget(11307)==0&false))) {{
                    __CLR4_5_28m78m7lvl9eija.R.inc(11308);return true;
                }
                }__CLR4_5_28m78m7lvl9eija.R.inc(11309);if ((((nu.pic_order_cnt_type == 0 && pic_order_cnt_type == 0)&&(__CLR4_5_28m78m7lvl9eija.R.iget(11310)!=0|true))||(__CLR4_5_28m78m7lvl9eija.R.iget(11311)==0&false))) {{
                    __CLR4_5_28m78m7lvl9eija.R.inc(11312);if ((((nu.pic_order_cnt_lsb != pic_order_cnt_lsb)&&(__CLR4_5_28m78m7lvl9eija.R.iget(11313)!=0|true))||(__CLR4_5_28m78m7lvl9eija.R.iget(11314)==0&false))) {{
                        __CLR4_5_28m78m7lvl9eija.R.inc(11315);return true;
                    }
                    }__CLR4_5_28m78m7lvl9eija.R.inc(11316);if ((((nu.delta_pic_order_cnt_bottom != delta_pic_order_cnt_bottom)&&(__CLR4_5_28m78m7lvl9eija.R.iget(11317)!=0|true))||(__CLR4_5_28m78m7lvl9eija.R.iget(11318)==0&false))) {{
                        __CLR4_5_28m78m7lvl9eija.R.inc(11319);return true;
                    }
                }}
                }__CLR4_5_28m78m7lvl9eija.R.inc(11320);if ((((nu.pic_order_cnt_type == 1 && pic_order_cnt_type == 1)&&(__CLR4_5_28m78m7lvl9eija.R.iget(11321)!=0|true))||(__CLR4_5_28m78m7lvl9eija.R.iget(11322)==0&false))) {{
                    __CLR4_5_28m78m7lvl9eija.R.inc(11323);if ((((nu.delta_pic_order_cnt_0 != delta_pic_order_cnt_0)&&(__CLR4_5_28m78m7lvl9eija.R.iget(11324)!=0|true))||(__CLR4_5_28m78m7lvl9eija.R.iget(11325)==0&false))) {{
                        __CLR4_5_28m78m7lvl9eija.R.inc(11326);return true;
                    }
                    }__CLR4_5_28m78m7lvl9eija.R.inc(11327);if ((((nu.delta_pic_order_cnt_1 != delta_pic_order_cnt_1)&&(__CLR4_5_28m78m7lvl9eija.R.iget(11328)!=0|true))||(__CLR4_5_28m78m7lvl9eija.R.iget(11329)==0&false))) {{
                        __CLR4_5_28m78m7lvl9eija.R.inc(11330);return true;
                    }
                }}
                }__CLR4_5_28m78m7lvl9eija.R.inc(11331);if ((((nu.idrPicFlag != idrPicFlag)&&(__CLR4_5_28m78m7lvl9eija.R.iget(11332)!=0|true))||(__CLR4_5_28m78m7lvl9eija.R.iget(11333)==0&false))) {{
                    __CLR4_5_28m78m7lvl9eija.R.inc(11334);return true;
                }
                }__CLR4_5_28m78m7lvl9eija.R.inc(11335);if ((((nu.idrPicFlag && idrPicFlag)&&(__CLR4_5_28m78m7lvl9eija.R.iget(11336)!=0|true))||(__CLR4_5_28m78m7lvl9eija.R.iget(11337)==0&false))) {{
                    __CLR4_5_28m78m7lvl9eija.R.inc(11338);if ((((nu.idr_pic_id != idr_pic_id)&&(__CLR4_5_28m78m7lvl9eija.R.iget(11339)!=0|true))||(__CLR4_5_28m78m7lvl9eija.R.iget(11340)==0&false))) {{
                        __CLR4_5_28m78m7lvl9eija.R.inc(11341);return true;
                    }
                }}
                }__CLR4_5_28m78m7lvl9eija.R.inc(11342);return false;
            }finally{__CLR4_5_28m78m7lvl9eija.R.flushNeeded();}}
        }
        __CLR4_5_28m78m7lvl9eija.R.inc(11343);FirstVclNalDetector fvnd = null;


        __CLR4_5_28m78m7lvl9eija.R.inc(11344);nal_loop:
        while ((nal = findNextNal(la)) != null) {{
            __CLR4_5_28m78m7lvl9eija.R.inc(11347);H264NalUnitHeader nalUnitHeader = getNalUnitHeader(nal);

            boolean __CLB4_5_2_bool0=false;__CLR4_5_28m78m7lvl9eija.R.inc(11348);switch (nalUnitHeader.nal_unit_type) {
                case H264NalUnitTypes.CODED_SLICE_NON_IDR:if (!__CLB4_5_2_bool0) {__CLR4_5_28m78m7lvl9eija.R.inc(11349);__CLB4_5_2_bool0=true;}
                case H264NalUnitTypes.CODED_SLICE_DATA_PART_A:if (!__CLB4_5_2_bool0) {__CLR4_5_28m78m7lvl9eija.R.inc(11350);__CLB4_5_2_bool0=true;}
                case H264NalUnitTypes.CODED_SLICE_DATA_PART_B:if (!__CLB4_5_2_bool0) {__CLR4_5_28m78m7lvl9eija.R.inc(11351);__CLB4_5_2_bool0=true;}
                case H264NalUnitTypes.CODED_SLICE_DATA_PART_C:if (!__CLB4_5_2_bool0) {__CLR4_5_28m78m7lvl9eija.R.inc(11352);__CLB4_5_2_bool0=true;}
                case H264NalUnitTypes.CODED_SLICE_IDR:if (!__CLB4_5_2_bool0) {__CLR4_5_28m78m7lvl9eija.R.inc(11353);__CLB4_5_2_bool0=true;}
                    __CLR4_5_28m78m7lvl9eija.R.inc(11354);FirstVclNalDetector current = new FirstVclNalDetector(nal,
                            nalUnitHeader.nal_ref_idc, nalUnitHeader.nal_unit_type);
                    __CLR4_5_28m78m7lvl9eija.R.inc(11355);if ((((fvnd != null && fvnd.isFirstInNew(current))&&(__CLR4_5_28m78m7lvl9eija.R.iget(11356)!=0|true))||(__CLR4_5_28m78m7lvl9eija.R.iget(11357)==0&false))) {{
                        __CLR4_5_28m78m7lvl9eija.R.inc(11358);LOG.finer("Wrapping up cause of first vcl nal is found");
                        __CLR4_5_28m78m7lvl9eija.R.inc(11359);createSample(buffered);
                    }
                    }__CLR4_5_28m78m7lvl9eija.R.inc(11360);fvnd = current;
                    //System.err.println("" + nalUnitHeader.nal_unit_type);
                    __CLR4_5_28m78m7lvl9eija.R.inc(11361);buffered.add((ByteBuffer) nal.rewind());
                    //log.finer("NAL Unit Type: " + nalUnitHeader.nal_unit_type + " " + fvnd.frame_num);
                    __CLR4_5_28m78m7lvl9eija.R.inc(11362);break;

                case H264NalUnitTypes.SEI:if (!__CLB4_5_2_bool0) {__CLR4_5_28m78m7lvl9eija.R.inc(11363);__CLB4_5_2_bool0=true;}
                    __CLR4_5_28m78m7lvl9eija.R.inc(11364);if ((((fvnd != null)&&(__CLR4_5_28m78m7lvl9eija.R.iget(11365)!=0|true))||(__CLR4_5_28m78m7lvl9eija.R.iget(11366)==0&false))) {{
                        __CLR4_5_28m78m7lvl9eija.R.inc(11367);LOG.finer("Wrapping up cause of SEI after vcl marks new sample");
                        __CLR4_5_28m78m7lvl9eija.R.inc(11368);createSample(buffered);
                        __CLR4_5_28m78m7lvl9eija.R.inc(11369);fvnd = null;
                    }
                    }__CLR4_5_28m78m7lvl9eija.R.inc(11370);seiMessage = new SEIMessage(cleanBuffer(new ByteBufferBackedInputStream(nal)), currentSeqParameterSet);
                    //System.err.println("" + nalUnitHeader.nal_unit_type);
                    __CLR4_5_28m78m7lvl9eija.R.inc(11371);buffered.add(nal);
                    __CLR4_5_28m78m7lvl9eija.R.inc(11372);break;

                case H264NalUnitTypes.AU_UNIT_DELIMITER:if (!__CLB4_5_2_bool0) {__CLR4_5_28m78m7lvl9eija.R.inc(11373);__CLB4_5_2_bool0=true;}
                    __CLR4_5_28m78m7lvl9eija.R.inc(11374);if ((((fvnd != null)&&(__CLR4_5_28m78m7lvl9eija.R.iget(11375)!=0|true))||(__CLR4_5_28m78m7lvl9eija.R.iget(11376)==0&false))) {{
                        __CLR4_5_28m78m7lvl9eija.R.inc(11377);LOG.finer("Wrapping up cause of AU after vcl marks new sample");
                        __CLR4_5_28m78m7lvl9eija.R.inc(11378);createSample(buffered);
                        __CLR4_5_28m78m7lvl9eija.R.inc(11379);fvnd = null;
                    }
                    //System.err.println("" + nalUnitHeader.nal_unit_type);
                    }__CLR4_5_28m78m7lvl9eija.R.inc(11380);buffered.add(nal);
                    __CLR4_5_28m78m7lvl9eija.R.inc(11381);break;
                case H264NalUnitTypes.SEQ_PARAMETER_SET:if (!__CLB4_5_2_bool0) {__CLR4_5_28m78m7lvl9eija.R.inc(11382);__CLB4_5_2_bool0=true;}
                    __CLR4_5_28m78m7lvl9eija.R.inc(11383);if ((((fvnd != null)&&(__CLR4_5_28m78m7lvl9eija.R.iget(11384)!=0|true))||(__CLR4_5_28m78m7lvl9eija.R.iget(11385)==0&false))) {{
                        __CLR4_5_28m78m7lvl9eija.R.inc(11386);LOG.finer("Wrapping up cause of SPS after vcl marks new sample");
                        __CLR4_5_28m78m7lvl9eija.R.inc(11387);createSample(buffered);
                        __CLR4_5_28m78m7lvl9eija.R.inc(11388);fvnd = null;
                    }
                    }__CLR4_5_28m78m7lvl9eija.R.inc(11389);handleSPS((ByteBuffer) nal.rewind());
                    __CLR4_5_28m78m7lvl9eija.R.inc(11390);break;
                case 8:if (!__CLB4_5_2_bool0) {__CLR4_5_28m78m7lvl9eija.R.inc(11391);__CLB4_5_2_bool0=true;}
                    __CLR4_5_28m78m7lvl9eija.R.inc(11392);if ((((fvnd != null)&&(__CLR4_5_28m78m7lvl9eija.R.iget(11393)!=0|true))||(__CLR4_5_28m78m7lvl9eija.R.iget(11394)==0&false))) {{
                        __CLR4_5_28m78m7lvl9eija.R.inc(11395);LOG.finer("Wrapping up cause of PPS after vcl marks new sample");
                        __CLR4_5_28m78m7lvl9eija.R.inc(11396);createSample(buffered);
                        __CLR4_5_28m78m7lvl9eija.R.inc(11397);fvnd = null;
                    }
                    }__CLR4_5_28m78m7lvl9eija.R.inc(11398);handlePPS((ByteBuffer) nal.rewind());
                    __CLR4_5_28m78m7lvl9eija.R.inc(11399);break;
                case H264NalUnitTypes.END_OF_SEQUENCE:if (!__CLB4_5_2_bool0) {__CLR4_5_28m78m7lvl9eija.R.inc(11400);__CLB4_5_2_bool0=true;}
                case H264NalUnitTypes.END_OF_STREAM:if (!__CLB4_5_2_bool0) {__CLR4_5_28m78m7lvl9eija.R.inc(11401);__CLB4_5_2_bool0=true;}

                    __CLR4_5_28m78m7lvl9eija.R.inc(11402);break nal_loop;

                case H264NalUnitTypes.SEQ_PARAMETER_SET_EXT:if (!__CLB4_5_2_bool0) {__CLR4_5_28m78m7lvl9eija.R.inc(11403);__CLB4_5_2_bool0=true;}
                    __CLR4_5_28m78m7lvl9eija.R.inc(11404);throw new RuntimeException("Sequence parameter set extension is not yet handled. Needs TLC.");

                default:if (!__CLB4_5_2_bool0) {__CLR4_5_28m78m7lvl9eija.R.inc(11405);__CLB4_5_2_bool0=true;}
                    //  buffered.add(nal);
                    __CLR4_5_28m78m7lvl9eija.R.inc(11406);LOG.warning("Unknown NAL unit type: " + nalUnitHeader.nal_unit_type);

            }


        }
        }__CLR4_5_28m78m7lvl9eija.R.inc(11407);if ((((buffered.size() > 0)&&(__CLR4_5_28m78m7lvl9eija.R.iget(11408)!=0|true))||(__CLR4_5_28m78m7lvl9eija.R.iget(11409)==0&false))) {{
            __CLR4_5_28m78m7lvl9eija.R.inc(11410);createSample(buffered);
        }
        }__CLR4_5_28m78m7lvl9eija.R.inc(11411);calcCtts();

        __CLR4_5_28m78m7lvl9eija.R.inc(11412);decodingTimes = new long[samples.size()];
        __CLR4_5_28m78m7lvl9eija.R.inc(11413);Arrays.fill(decodingTimes, frametick);


        __CLR4_5_28m78m7lvl9eija.R.inc(11414);return true;
    }finally{__CLR4_5_28m78m7lvl9eija.R.flushNeeded();}}

    public void calcCtts() {try{__CLR4_5_28m78m7lvl9eija.R.inc(11415);

        __CLR4_5_28m78m7lvl9eija.R.inc(11416);int pTime = 0;
        __CLR4_5_28m78m7lvl9eija.R.inc(11417);int lastPoc = -1;
        __CLR4_5_28m78m7lvl9eija.R.inc(11418);for (int j = 0; (((j < pictureOrderCounts.length)&&(__CLR4_5_28m78m7lvl9eija.R.iget(11419)!=0|true))||(__CLR4_5_28m78m7lvl9eija.R.iget(11420)==0&false)); j++) {{
            __CLR4_5_28m78m7lvl9eija.R.inc(11421);int minIndex = 0;
            __CLR4_5_28m78m7lvl9eija.R.inc(11422);int minValue = Integer.MAX_VALUE;
            __CLR4_5_28m78m7lvl9eija.R.inc(11423);for (int i = Math.max(0, j - 128); (((i < Math.min(pictureOrderCounts.length, j + 128))&&(__CLR4_5_28m78m7lvl9eija.R.iget(11424)!=0|true))||(__CLR4_5_28m78m7lvl9eija.R.iget(11425)==0&false)); i++) {{
                __CLR4_5_28m78m7lvl9eija.R.inc(11426);if ((((pictureOrderCounts[i] > lastPoc && pictureOrderCounts[i] < minValue)&&(__CLR4_5_28m78m7lvl9eija.R.iget(11427)!=0|true))||(__CLR4_5_28m78m7lvl9eija.R.iget(11428)==0&false))) {{
                    __CLR4_5_28m78m7lvl9eija.R.inc(11429);minIndex = i;
                    __CLR4_5_28m78m7lvl9eija.R.inc(11430);minValue = pictureOrderCounts[i];
                }
            }}
            }__CLR4_5_28m78m7lvl9eija.R.inc(11431);lastPoc = pictureOrderCounts[minIndex];
            __CLR4_5_28m78m7lvl9eija.R.inc(11432);pictureOrderCounts[minIndex] = pTime++;
        }
        }__CLR4_5_28m78m7lvl9eija.R.inc(11433);for (int i = 0; (((i < pictureOrderCounts.length)&&(__CLR4_5_28m78m7lvl9eija.R.iget(11434)!=0|true))||(__CLR4_5_28m78m7lvl9eija.R.iget(11435)==0&false)); i++) {{
            __CLR4_5_28m78m7lvl9eija.R.inc(11436);ctts.add(new CompositionTimeToSample.Entry(1, pictureOrderCounts[i] - i + currentSeqParameterSet.num_ref_frames));
        }

        }__CLR4_5_28m78m7lvl9eija.R.inc(11437);pictureOrderCounts = new int[0];
    }finally{__CLR4_5_28m78m7lvl9eija.R.flushNeeded();}}

    private void createSample(List<ByteBuffer> buffered) throws IOException {try{__CLR4_5_28m78m7lvl9eija.R.inc(11438);

        __CLR4_5_28m78m7lvl9eija.R.inc(11439);SampleDependencyTypeBox.Entry sampleDependency = new SampleDependencyTypeBox.Entry(0);

        __CLR4_5_28m78m7lvl9eija.R.inc(11440);boolean IdrPicFlag = false;
        __CLR4_5_28m78m7lvl9eija.R.inc(11441);H264NalUnitHeader nu = null;
        __CLR4_5_28m78m7lvl9eija.R.inc(11442);for (ByteBuffer nal : buffered) {{
            __CLR4_5_28m78m7lvl9eija.R.inc(11443);H264NalUnitHeader _nu = getNalUnitHeader(nal);

            boolean __CLB4_5_2_bool1=false;__CLR4_5_28m78m7lvl9eija.R.inc(11444);switch (_nu.nal_unit_type) {
                case H264NalUnitTypes.CODED_SLICE_IDR:if (!__CLB4_5_2_bool1) {__CLR4_5_28m78m7lvl9eija.R.inc(11445);__CLB4_5_2_bool1=true;}
                    __CLR4_5_28m78m7lvl9eija.R.inc(11446);IdrPicFlag = true;
                case H264NalUnitTypes.CODED_SLICE_NON_IDR:if (!__CLB4_5_2_bool1) {__CLR4_5_28m78m7lvl9eija.R.inc(11447);__CLB4_5_2_bool1=true;}
                case H264NalUnitTypes.CODED_SLICE_DATA_PART_A:if (!__CLB4_5_2_bool1) {__CLR4_5_28m78m7lvl9eija.R.inc(11448);__CLB4_5_2_bool1=true;}
                case H264NalUnitTypes.CODED_SLICE_DATA_PART_B:if (!__CLB4_5_2_bool1) {__CLR4_5_28m78m7lvl9eija.R.inc(11449);__CLB4_5_2_bool1=true;}
                case H264NalUnitTypes.CODED_SLICE_DATA_PART_C:if (!__CLB4_5_2_bool1) {__CLR4_5_28m78m7lvl9eija.R.inc(11450);__CLB4_5_2_bool1=true;}
                    __CLR4_5_28m78m7lvl9eija.R.inc(11451);nu = _nu;
            }
        }
        }__CLR4_5_28m78m7lvl9eija.R.inc(11452);if ((((nu == null)&&(__CLR4_5_28m78m7lvl9eija.R.iget(11453)!=0|true))||(__CLR4_5_28m78m7lvl9eija.R.iget(11454)==0&false))) {{
            __CLR4_5_28m78m7lvl9eija.R.inc(11455);LOG.warning("Sample without Slice");
            __CLR4_5_28m78m7lvl9eija.R.inc(11456);return;
        }

        }__CLR4_5_28m78m7lvl9eija.R.inc(11457);if ((((IdrPicFlag)&&(__CLR4_5_28m78m7lvl9eija.R.iget(11458)!=0|true))||(__CLR4_5_28m78m7lvl9eija.R.iget(11459)==0&false))) {{
            __CLR4_5_28m78m7lvl9eija.R.inc(11460);calcCtts();
        }
        // cleans the buffer we just added
        }__CLR4_5_28m78m7lvl9eija.R.inc(11461);InputStream bs = cleanBuffer(new ByteBufferBackedInputStream(buffered.get(buffered.size() - 1)));
        __CLR4_5_28m78m7lvl9eija.R.inc(11462);SliceHeader sh = new SliceHeader(bs, spsIdToSps, ppsIdToPps, IdrPicFlag);

        __CLR4_5_28m78m7lvl9eija.R.inc(11463);if ((((nu.nal_ref_idc== 0)&&(__CLR4_5_28m78m7lvl9eija.R.iget(11464)!=0|true))||(__CLR4_5_28m78m7lvl9eija.R.iget(11465)==0&false))) {{
            __CLR4_5_28m78m7lvl9eija.R.inc(11466);sampleDependency.setSampleIsDependentOn(2);
        } }else {{
            __CLR4_5_28m78m7lvl9eija.R.inc(11467);sampleDependency.setSampleIsDependentOn(1);
        }
        }__CLR4_5_28m78m7lvl9eija.R.inc(11468);if (((((sh.slice_type == SliceHeader.SliceType.I) || (sh.slice_type == SliceHeader.SliceType.SI) )&&(__CLR4_5_28m78m7lvl9eija.R.iget(11469)!=0|true))||(__CLR4_5_28m78m7lvl9eija.R.iget(11470)==0&false))) {{
            __CLR4_5_28m78m7lvl9eija.R.inc(11471);sampleDependency.setSampleDependsOn(2);
        } }else {{
            __CLR4_5_28m78m7lvl9eija.R.inc(11472);sampleDependency.setSampleDependsOn(1);
        }
        }__CLR4_5_28m78m7lvl9eija.R.inc(11473);Sample bb = createSampleObject(buffered);
//                    LOG.fine("Adding sample with size " + bb.capacity() + " and header " + sh);
        __CLR4_5_28m78m7lvl9eija.R.inc(11474);buffered.clear();

        __CLR4_5_28m78m7lvl9eija.R.inc(11475);if ((((seiMessage == null || seiMessage.n_frames == 0)&&(__CLR4_5_28m78m7lvl9eija.R.iget(11476)!=0|true))||(__CLR4_5_28m78m7lvl9eija.R.iget(11477)==0&false))) {{
            __CLR4_5_28m78m7lvl9eija.R.inc(11478);frameNrInGop = 0;
        }
        }__CLR4_5_28m78m7lvl9eija.R.inc(11479);int offset = 0;
        __CLR4_5_28m78m7lvl9eija.R.inc(11480);if ((((sh.sps.pic_order_cnt_type == 0)&&(__CLR4_5_28m78m7lvl9eija.R.iget(11481)!=0|true))||(__CLR4_5_28m78m7lvl9eija.R.iget(11482)==0&false))) {{
            __CLR4_5_28m78m7lvl9eija.R.inc(11483);int max_pic_order_count_lsb = (1 << (sh.sps.log2_max_pic_order_cnt_lsb_minus4 + 4));
            // System.out.print(" pic_order_cnt_lsb " + pic_order_cnt_lsb + " " + max_pic_order_count);
            __CLR4_5_28m78m7lvl9eija.R.inc(11484);int picOrderCountLsb = sh.pic_order_cnt_lsb;
            __CLR4_5_28m78m7lvl9eija.R.inc(11485);int picOrderCntMsb = 0;
            __CLR4_5_28m78m7lvl9eija.R.inc(11486);if (((((picOrderCountLsb < prevPicOrderCntLsb) &&
                    ((prevPicOrderCntLsb - picOrderCountLsb) >= (max_pic_order_count_lsb / 2)))&&(__CLR4_5_28m78m7lvl9eija.R.iget(11487)!=0|true))||(__CLR4_5_28m78m7lvl9eija.R.iget(11488)==0&false))) {{
                __CLR4_5_28m78m7lvl9eija.R.inc(11489);picOrderCntMsb = prevPicOrderCntMsb + max_pic_order_count_lsb;
            } }else {__CLR4_5_28m78m7lvl9eija.R.inc(11490);if (((((picOrderCountLsb > prevPicOrderCntLsb) &&
                    ((picOrderCountLsb - prevPicOrderCntLsb) > (max_pic_order_count_lsb / 2)))&&(__CLR4_5_28m78m7lvl9eija.R.iget(11491)!=0|true))||(__CLR4_5_28m78m7lvl9eija.R.iget(11492)==0&false))) {{
                __CLR4_5_28m78m7lvl9eija.R.inc(11493);picOrderCntMsb = prevPicOrderCntMsb - max_pic_order_count_lsb;
            } }else {{
                __CLR4_5_28m78m7lvl9eija.R.inc(11494);picOrderCntMsb = prevPicOrderCntMsb;
            }

            }}__CLR4_5_28m78m7lvl9eija.R.inc(11495);pictureOrderCounts = Mp4Arrays.copyOfAndAppend(pictureOrderCounts, picOrderCntMsb + picOrderCountLsb);
            __CLR4_5_28m78m7lvl9eija.R.inc(11496);prevPicOrderCntLsb = picOrderCountLsb;
            __CLR4_5_28m78m7lvl9eija.R.inc(11497);prevPicOrderCntMsb = picOrderCntMsb;


        } }else {__CLR4_5_28m78m7lvl9eija.R.inc(11498);if ((((sh.sps.pic_order_cnt_type == 1)&&(__CLR4_5_28m78m7lvl9eija.R.iget(11499)!=0|true))||(__CLR4_5_28m78m7lvl9eija.R.iget(11500)==0&false))) {{
                /*if (seiMessage != null && seiMessage.clock_timestamp_flag) {
                    offset = seiMessage.n_frames - frameNrInGop;
                } else if (seiMessage != null && seiMessage.removal_delay_flag) {
                    offset = seiMessage.dpb_removal_delay / 2;
                }

                if (seiMessage == null) {
                    LOG.warning("CTS timing in ctts box is most likely not OK");
                }*/
            __CLR4_5_28m78m7lvl9eija.R.inc(11501);throw new RuntimeException("pic_order_cnt_type == 1 needs to be implemented");
        } }else {__CLR4_5_28m78m7lvl9eija.R.inc(11502);if ((((sh.sps.pic_order_cnt_type == 2)&&(__CLR4_5_28m78m7lvl9eija.R.iget(11503)!=0|true))||(__CLR4_5_28m78m7lvl9eija.R.iget(11504)==0&false))) {{
            __CLR4_5_28m78m7lvl9eija.R.inc(11505);pictureOrderCounts = Mp4Arrays.copyOfAndAppend(pictureOrderCounts, samples.size());
        }

        }}}__CLR4_5_28m78m7lvl9eija.R.inc(11506);sdtp.add(sampleDependency);
        __CLR4_5_28m78m7lvl9eija.R.inc(11507);frameNrInGop++;

        __CLR4_5_28m78m7lvl9eija.R.inc(11508);samples.add(bb);
        __CLR4_5_28m78m7lvl9eija.R.inc(11509);if ((((IdrPicFlag)&&(__CLR4_5_28m78m7lvl9eija.R.iget(11510)!=0|true))||(__CLR4_5_28m78m7lvl9eija.R.iget(11511)==0&false))) {{ // IDR Picture
            __CLR4_5_28m78m7lvl9eija.R.inc(11512);stss.add(samples.size());
        }
    }}finally{__CLR4_5_28m78m7lvl9eija.R.flushNeeded();}}

    private int calcPoc(int absFrameNum, H264NalUnitHeader nu, SliceHeader sh) {try{__CLR4_5_28m78m7lvl9eija.R.inc(11513);
        __CLR4_5_28m78m7lvl9eija.R.inc(11514);if ((((sh.sps.pic_order_cnt_type == 0)&&(__CLR4_5_28m78m7lvl9eija.R.iget(11515)!=0|true))||(__CLR4_5_28m78m7lvl9eija.R.iget(11516)==0&false))) {{
            __CLR4_5_28m78m7lvl9eija.R.inc(11517);return calcPOC0(nu, sh);
        } }else {__CLR4_5_28m78m7lvl9eija.R.inc(11518);if ((((sh.sps.pic_order_cnt_type == 1)&&(__CLR4_5_28m78m7lvl9eija.R.iget(11519)!=0|true))||(__CLR4_5_28m78m7lvl9eija.R.iget(11520)==0&false))) {{
            __CLR4_5_28m78m7lvl9eija.R.inc(11521);return calcPOC1(absFrameNum, nu, sh);
        } }else {{
            __CLR4_5_28m78m7lvl9eija.R.inc(11522);return calcPOC2(absFrameNum, nu, sh);
        }
    }}}finally{__CLR4_5_28m78m7lvl9eija.R.flushNeeded();}}

    private int calcPOC2(int absFrameNum, H264NalUnitHeader nu, SliceHeader sh) {try{__CLR4_5_28m78m7lvl9eija.R.inc(11523);

        __CLR4_5_28m78m7lvl9eija.R.inc(11524);if ((((nu.nal_ref_idc == 0)&&(__CLR4_5_28m78m7lvl9eija.R.iget(11525)!=0|true))||(__CLR4_5_28m78m7lvl9eija.R.iget(11526)==0&false)))
            {__CLR4_5_28m78m7lvl9eija.R.inc(11527);return 2 * absFrameNum - 1;
        }else
            {__CLR4_5_28m78m7lvl9eija.R.inc(11528);return 2 * absFrameNum;
    }}finally{__CLR4_5_28m78m7lvl9eija.R.flushNeeded();}}

    private int calcPOC1(int absFrameNum, H264NalUnitHeader nu, SliceHeader sh) {try{__CLR4_5_28m78m7lvl9eija.R.inc(11529);

        __CLR4_5_28m78m7lvl9eija.R.inc(11530);if ((((sh.sps.num_ref_frames_in_pic_order_cnt_cycle == 0)&&(__CLR4_5_28m78m7lvl9eija.R.iget(11531)!=0|true))||(__CLR4_5_28m78m7lvl9eija.R.iget(11532)==0&false)))
            {__CLR4_5_28m78m7lvl9eija.R.inc(11533);absFrameNum = 0;
        }__CLR4_5_28m78m7lvl9eija.R.inc(11534);if ((((nu.nal_ref_idc == 0 && absFrameNum > 0)&&(__CLR4_5_28m78m7lvl9eija.R.iget(11535)!=0|true))||(__CLR4_5_28m78m7lvl9eija.R.iget(11536)==0&false)))
            {__CLR4_5_28m78m7lvl9eija.R.inc(11537);absFrameNum = absFrameNum - 1;

        }__CLR4_5_28m78m7lvl9eija.R.inc(11538);int expectedDeltaPerPicOrderCntCycle = 0;
        __CLR4_5_28m78m7lvl9eija.R.inc(11539);for (int i = 0; (((i < sh.sps.num_ref_frames_in_pic_order_cnt_cycle)&&(__CLR4_5_28m78m7lvl9eija.R.iget(11540)!=0|true))||(__CLR4_5_28m78m7lvl9eija.R.iget(11541)==0&false)); i++)
            {__CLR4_5_28m78m7lvl9eija.R.inc(11542);expectedDeltaPerPicOrderCntCycle += sh.sps.offsetForRefFrame[i];

        }__CLR4_5_28m78m7lvl9eija.R.inc(11543);int expectedPicOrderCnt;
        __CLR4_5_28m78m7lvl9eija.R.inc(11544);if ((((absFrameNum > 0)&&(__CLR4_5_28m78m7lvl9eija.R.iget(11545)!=0|true))||(__CLR4_5_28m78m7lvl9eija.R.iget(11546)==0&false))) {{
            __CLR4_5_28m78m7lvl9eija.R.inc(11547);int picOrderCntCycleCnt = (absFrameNum - 1) / sh.sps.num_ref_frames_in_pic_order_cnt_cycle;
            __CLR4_5_28m78m7lvl9eija.R.inc(11548);int frameNumInPicOrderCntCycle = (absFrameNum - 1) % sh.sps.num_ref_frames_in_pic_order_cnt_cycle;

            __CLR4_5_28m78m7lvl9eija.R.inc(11549);expectedPicOrderCnt = picOrderCntCycleCnt * expectedDeltaPerPicOrderCntCycle;
            __CLR4_5_28m78m7lvl9eija.R.inc(11550);for (int i = 0; (((i <= frameNumInPicOrderCntCycle)&&(__CLR4_5_28m78m7lvl9eija.R.iget(11551)!=0|true))||(__CLR4_5_28m78m7lvl9eija.R.iget(11552)==0&false)); i++)
                {__CLR4_5_28m78m7lvl9eija.R.inc(11553);expectedPicOrderCnt = expectedPicOrderCnt + sh.sps.offsetForRefFrame[i];
        }} }else {{
            __CLR4_5_28m78m7lvl9eija.R.inc(11554);expectedPicOrderCnt = 0;
        }
        }__CLR4_5_28m78m7lvl9eija.R.inc(11555);if ((((nu.nal_ref_idc == 0)&&(__CLR4_5_28m78m7lvl9eija.R.iget(11556)!=0|true))||(__CLR4_5_28m78m7lvl9eija.R.iget(11557)==0&false)))
            {__CLR4_5_28m78m7lvl9eija.R.inc(11558);expectedPicOrderCnt = expectedPicOrderCnt + sh.sps.offset_for_non_ref_pic;

        }__CLR4_5_28m78m7lvl9eija.R.inc(11559);return expectedPicOrderCnt + sh.delta_pic_order_cnt_0;
    }finally{__CLR4_5_28m78m7lvl9eija.R.flushNeeded();}}

    private int calcPOC0(H264NalUnitHeader nu, SliceHeader sh) {try{__CLR4_5_28m78m7lvl9eija.R.inc(11560);

        __CLR4_5_28m78m7lvl9eija.R.inc(11561);int pocCntLsb = sh.pic_order_cnt_lsb;
        __CLR4_5_28m78m7lvl9eija.R.inc(11562);int maxPicOrderCntLsb = 1 << (sh.sps.log2_max_pic_order_cnt_lsb_minus4 + 4);

        // TODO prevPicOrderCntMsb should be wrapped!!
        __CLR4_5_28m78m7lvl9eija.R.inc(11563);int picOrderCntMsb;
        __CLR4_5_28m78m7lvl9eija.R.inc(11564);if (((((pocCntLsb < prevPicOrderCntLsb) && ((prevPicOrderCntLsb - pocCntLsb) >= (maxPicOrderCntLsb / 2)))&&(__CLR4_5_28m78m7lvl9eija.R.iget(11565)!=0|true))||(__CLR4_5_28m78m7lvl9eija.R.iget(11566)==0&false)))
            {__CLR4_5_28m78m7lvl9eija.R.inc(11567);picOrderCntMsb = prevPicOrderCntMsb + maxPicOrderCntLsb;
        }else {__CLR4_5_28m78m7lvl9eija.R.inc(11568);if (((((pocCntLsb > prevPicOrderCntLsb) && ((pocCntLsb - prevPicOrderCntLsb) > (maxPicOrderCntLsb / 2)))&&(__CLR4_5_28m78m7lvl9eija.R.iget(11569)!=0|true))||(__CLR4_5_28m78m7lvl9eija.R.iget(11570)==0&false)))
            {__CLR4_5_28m78m7lvl9eija.R.inc(11571);picOrderCntMsb = prevPicOrderCntMsb - maxPicOrderCntLsb;
        }else
            {__CLR4_5_28m78m7lvl9eija.R.inc(11572);picOrderCntMsb = prevPicOrderCntMsb;

        }}__CLR4_5_28m78m7lvl9eija.R.inc(11573);if ((((nu.nal_ref_idc != 0)&&(__CLR4_5_28m78m7lvl9eija.R.iget(11574)!=0|true))||(__CLR4_5_28m78m7lvl9eija.R.iget(11575)==0&false))) {{
            __CLR4_5_28m78m7lvl9eija.R.inc(11576);prevPicOrderCntMsb = picOrderCntMsb;
            __CLR4_5_28m78m7lvl9eija.R.inc(11577);prevPicOrderCntLsb = pocCntLsb;
        }

        }__CLR4_5_28m78m7lvl9eija.R.inc(11578);return picOrderCntMsb + pocCntLsb;
    }finally{__CLR4_5_28m78m7lvl9eija.R.flushNeeded();}}

    private void handlePPS(ByteBuffer data) throws IOException {try{__CLR4_5_28m78m7lvl9eija.R.inc(11579);
        __CLR4_5_28m78m7lvl9eija.R.inc(11580);InputStream is = new ByteBufferBackedInputStream(data);
        __CLR4_5_28m78m7lvl9eija.R.inc(11581);is.read();

        __CLR4_5_28m78m7lvl9eija.R.inc(11582);PictureParameterSet _pictureParameterSet = PictureParameterSet.read(is);
        __CLR4_5_28m78m7lvl9eija.R.inc(11583);if ((((firstPictureParameterSet == null)&&(__CLR4_5_28m78m7lvl9eija.R.iget(11584)!=0|true))||(__CLR4_5_28m78m7lvl9eija.R.iget(11585)==0&false))) {{
            __CLR4_5_28m78m7lvl9eija.R.inc(11586);firstPictureParameterSet = _pictureParameterSet;
        }

        }__CLR4_5_28m78m7lvl9eija.R.inc(11587);currentPictureParameterSet = _pictureParameterSet;

        __CLR4_5_28m78m7lvl9eija.R.inc(11588);byte[] ppsBytes = toArray((ByteBuffer) data.rewind());
        __CLR4_5_28m78m7lvl9eija.R.inc(11589);byte[] oldPpsSameId = ppsIdToPpsBytes.get(_pictureParameterSet.pic_parameter_set_id);


        __CLR4_5_28m78m7lvl9eija.R.inc(11590);if ((((oldPpsSameId != null && !Arrays.equals(oldPpsSameId, ppsBytes))&&(__CLR4_5_28m78m7lvl9eija.R.iget(11591)!=0|true))||(__CLR4_5_28m78m7lvl9eija.R.iget(11592)==0&false))) {{
            __CLR4_5_28m78m7lvl9eija.R.inc(11593);throw new RuntimeException("OMG - I got two SPS with same ID but different settings! (AVC3 is the solution)");
        } }else {{
            __CLR4_5_28m78m7lvl9eija.R.inc(11594);if ((((oldPpsSameId == null)&&(__CLR4_5_28m78m7lvl9eija.R.iget(11595)!=0|true))||(__CLR4_5_28m78m7lvl9eija.R.iget(11596)==0&false))) {{
                __CLR4_5_28m78m7lvl9eija.R.inc(11597);pictureParameterRangeMap.put(samples.size(), ppsBytes);
            }
            }__CLR4_5_28m78m7lvl9eija.R.inc(11598);ppsIdToPpsBytes.put(_pictureParameterSet.pic_parameter_set_id, ppsBytes);
            __CLR4_5_28m78m7lvl9eija.R.inc(11599);ppsIdToPps.put(_pictureParameterSet.pic_parameter_set_id, _pictureParameterSet);
        }


    }}finally{__CLR4_5_28m78m7lvl9eija.R.flushNeeded();}}

    private void handleSPS(ByteBuffer data) throws IOException {try{__CLR4_5_28m78m7lvl9eija.R.inc(11600);
        __CLR4_5_28m78m7lvl9eija.R.inc(11601);InputStream spsInputStream = cleanBuffer(new ByteBufferBackedInputStream(data));
        __CLR4_5_28m78m7lvl9eija.R.inc(11602);spsInputStream.read();
        __CLR4_5_28m78m7lvl9eija.R.inc(11603);SeqParameterSet _seqParameterSet = SeqParameterSet.read(spsInputStream);
        __CLR4_5_28m78m7lvl9eija.R.inc(11604);if ((((firstSeqParameterSet == null)&&(__CLR4_5_28m78m7lvl9eija.R.iget(11605)!=0|true))||(__CLR4_5_28m78m7lvl9eija.R.iget(11606)==0&false))) {{
            __CLR4_5_28m78m7lvl9eija.R.inc(11607);firstSeqParameterSet = _seqParameterSet;
            __CLR4_5_28m78m7lvl9eija.R.inc(11608);configureFramerate();
        }
        }__CLR4_5_28m78m7lvl9eija.R.inc(11609);currentSeqParameterSet = _seqParameterSet;

        __CLR4_5_28m78m7lvl9eija.R.inc(11610);byte[] spsBytes = toArray((ByteBuffer) data.rewind());
        __CLR4_5_28m78m7lvl9eija.R.inc(11611);byte[] oldSpsSameId = spsIdToSpsBytes.get(_seqParameterSet.seq_parameter_set_id);
        __CLR4_5_28m78m7lvl9eija.R.inc(11612);if ((((oldSpsSameId != null && !Arrays.equals(oldSpsSameId, spsBytes))&&(__CLR4_5_28m78m7lvl9eija.R.iget(11613)!=0|true))||(__CLR4_5_28m78m7lvl9eija.R.iget(11614)==0&false))) {{
            __CLR4_5_28m78m7lvl9eija.R.inc(11615);throw new RuntimeException("OMG - I got two SPS with same ID but different settings!");
        } }else {{
            __CLR4_5_28m78m7lvl9eija.R.inc(11616);if ((((oldSpsSameId != null)&&(__CLR4_5_28m78m7lvl9eija.R.iget(11617)!=0|true))||(__CLR4_5_28m78m7lvl9eija.R.iget(11618)==0&false))) {{
                __CLR4_5_28m78m7lvl9eija.R.inc(11619);seqParameterRangeMap.put(samples.size(), spsBytes);
            }
            }__CLR4_5_28m78m7lvl9eija.R.inc(11620);spsIdToSpsBytes.put(_seqParameterSet.seq_parameter_set_id, spsBytes);
            __CLR4_5_28m78m7lvl9eija.R.inc(11621);spsIdToSps.put(_seqParameterSet.seq_parameter_set_id, _seqParameterSet);

        }


    }}finally{__CLR4_5_28m78m7lvl9eija.R.flushNeeded();}}

    private void configureFramerate() {try{__CLR4_5_28m78m7lvl9eija.R.inc(11622);
        __CLR4_5_28m78m7lvl9eija.R.inc(11623);if ((((determineFrameRate)&&(__CLR4_5_28m78m7lvl9eija.R.iget(11624)!=0|true))||(__CLR4_5_28m78m7lvl9eija.R.iget(11625)==0&false))) {{
            __CLR4_5_28m78m7lvl9eija.R.inc(11626);if ((((firstSeqParameterSet.vuiParams != null)&&(__CLR4_5_28m78m7lvl9eija.R.iget(11627)!=0|true))||(__CLR4_5_28m78m7lvl9eija.R.iget(11628)==0&false))) {{
                __CLR4_5_28m78m7lvl9eija.R.inc(11629);timescale = firstSeqParameterSet.vuiParams.time_scale >> 1; // Not sure why, but I found this in several places, and it works...
                __CLR4_5_28m78m7lvl9eija.R.inc(11630);frametick = firstSeqParameterSet.vuiParams.num_units_in_tick;
                __CLR4_5_28m78m7lvl9eija.R.inc(11631);if ((((timescale == 0 || frametick == 0)&&(__CLR4_5_28m78m7lvl9eija.R.iget(11632)!=0|true))||(__CLR4_5_28m78m7lvl9eija.R.iget(11633)==0&false))) {{
                    __CLR4_5_28m78m7lvl9eija.R.inc(11634);LOG.warning("vuiParams contain invalid values: time_scale: " + timescale + " and frame_tick: " + frametick + ". Setting frame rate to 25fps");
                    __CLR4_5_28m78m7lvl9eija.R.inc(11635);timescale = 90000;
                    __CLR4_5_28m78m7lvl9eija.R.inc(11636);frametick = 3600;
                }

                }__CLR4_5_28m78m7lvl9eija.R.inc(11637);if ((((timescale / frametick > 100)&&(__CLR4_5_28m78m7lvl9eija.R.iget(11638)!=0|true))||(__CLR4_5_28m78m7lvl9eija.R.iget(11639)==0&false))) {{
                    __CLR4_5_28m78m7lvl9eija.R.inc(11640);LOG.warning("Framerate is " + (timescale / frametick) + ". That is suspicious.");
                }
            }} }else {{
                __CLR4_5_28m78m7lvl9eija.R.inc(11641);LOG.warning("Can't determine frame rate. Guessing 25 fps");
                __CLR4_5_28m78m7lvl9eija.R.inc(11642);timescale = 90000;
                __CLR4_5_28m78m7lvl9eija.R.inc(11643);frametick = 3600;
            }
        }}
    }}finally{__CLR4_5_28m78m7lvl9eija.R.flushNeeded();}}

    public class ByteBufferBackedInputStream extends InputStream {

        private final ByteBuffer buf;

        public ByteBufferBackedInputStream(ByteBuffer buf) {try{__CLR4_5_28m78m7lvl9eija.R.inc(11644);
            // make a coy of the buffer
            __CLR4_5_28m78m7lvl9eija.R.inc(11645);this.buf = buf.duplicate();
        }finally{__CLR4_5_28m78m7lvl9eija.R.flushNeeded();}}

        public int read() throws IOException {try{__CLR4_5_28m78m7lvl9eija.R.inc(11646);
            __CLR4_5_28m78m7lvl9eija.R.inc(11647);if ((((!buf.hasRemaining())&&(__CLR4_5_28m78m7lvl9eija.R.iget(11648)!=0|true))||(__CLR4_5_28m78m7lvl9eija.R.iget(11649)==0&false))) {{
                __CLR4_5_28m78m7lvl9eija.R.inc(11650);return -1;
            }
            }__CLR4_5_28m78m7lvl9eija.R.inc(11651);return buf.get() & 0xFF;
        }finally{__CLR4_5_28m78m7lvl9eija.R.flushNeeded();}}

        public int read(byte[] bytes, int off, int len)
                throws IOException {try{__CLR4_5_28m78m7lvl9eija.R.inc(11652);
            __CLR4_5_28m78m7lvl9eija.R.inc(11653);if ((((!buf.hasRemaining())&&(__CLR4_5_28m78m7lvl9eija.R.iget(11654)!=0|true))||(__CLR4_5_28m78m7lvl9eija.R.iget(11655)==0&false))) {{
                __CLR4_5_28m78m7lvl9eija.R.inc(11656);return -1;
            }

            }__CLR4_5_28m78m7lvl9eija.R.inc(11657);len = Math.min(len, buf.remaining());
            __CLR4_5_28m78m7lvl9eija.R.inc(11658);buf.get(bytes, off, len);
            __CLR4_5_28m78m7lvl9eija.R.inc(11659);return len;
        }finally{__CLR4_5_28m78m7lvl9eija.R.flushNeeded();}}
    }

    public class SEIMessage {

        int payloadType = 0;
        int payloadSize = 0;

        boolean removal_delay_flag;
        int cpb_removal_delay;
        int dpb_removal_delay;

        boolean clock_timestamp_flag;
        int pic_struct;
        int ct_type;
        int nuit_field_based_flag;
        int counting_type;
        int full_timestamp_flag;
        int discontinuity_flag;
        int cnt_dropped_flag;
        int n_frames;
        int seconds_value;
        int minutes_value;
        int hours_value;
        int time_offset_length;
        int time_offset;

        SeqParameterSet sps;

        public SEIMessage(InputStream is, SeqParameterSet sps) throws IOException {try{__CLR4_5_28m78m7lvl9eija.R.inc(11660);
            __CLR4_5_28m78m7lvl9eija.R.inc(11661);this.sps = sps;
            __CLR4_5_28m78m7lvl9eija.R.inc(11662);is.read();
            __CLR4_5_28m78m7lvl9eija.R.inc(11663);int datasize = is.available();
            __CLR4_5_28m78m7lvl9eija.R.inc(11664);int read = 0;
            __CLR4_5_28m78m7lvl9eija.R.inc(11665);while ((((read < datasize)&&(__CLR4_5_28m78m7lvl9eija.R.iget(11666)!=0|true))||(__CLR4_5_28m78m7lvl9eija.R.iget(11667)==0&false))) {{
                __CLR4_5_28m78m7lvl9eija.R.inc(11668);payloadType = 0;
                __CLR4_5_28m78m7lvl9eija.R.inc(11669);payloadSize = 0;
                __CLR4_5_28m78m7lvl9eija.R.inc(11670);int last_payload_type_bytes = is.read();
                __CLR4_5_28m78m7lvl9eija.R.inc(11671);read++;
                __CLR4_5_28m78m7lvl9eija.R.inc(11672);while ((((last_payload_type_bytes == 0xff)&&(__CLR4_5_28m78m7lvl9eija.R.iget(11673)!=0|true))||(__CLR4_5_28m78m7lvl9eija.R.iget(11674)==0&false))) {{
                    __CLR4_5_28m78m7lvl9eija.R.inc(11675);payloadType += last_payload_type_bytes;
                    __CLR4_5_28m78m7lvl9eija.R.inc(11676);last_payload_type_bytes = is.read();
                    __CLR4_5_28m78m7lvl9eija.R.inc(11677);read++;
                }
                }__CLR4_5_28m78m7lvl9eija.R.inc(11678);payloadType += last_payload_type_bytes;
                __CLR4_5_28m78m7lvl9eija.R.inc(11679);int last_payload_size_bytes = is.read();
                __CLR4_5_28m78m7lvl9eija.R.inc(11680);read++;

                __CLR4_5_28m78m7lvl9eija.R.inc(11681);while ((((last_payload_size_bytes == 0xff)&&(__CLR4_5_28m78m7lvl9eija.R.iget(11682)!=0|true))||(__CLR4_5_28m78m7lvl9eija.R.iget(11683)==0&false))) {{
                    __CLR4_5_28m78m7lvl9eija.R.inc(11684);payloadSize += last_payload_size_bytes;
                    __CLR4_5_28m78m7lvl9eija.R.inc(11685);last_payload_size_bytes = is.read();
                    __CLR4_5_28m78m7lvl9eija.R.inc(11686);read++;
                }
                }__CLR4_5_28m78m7lvl9eija.R.inc(11687);payloadSize += last_payload_size_bytes;
                __CLR4_5_28m78m7lvl9eija.R.inc(11688);if ((((datasize - read >= payloadSize)&&(__CLR4_5_28m78m7lvl9eija.R.iget(11689)!=0|true))||(__CLR4_5_28m78m7lvl9eija.R.iget(11690)==0&false))) {{
                    __CLR4_5_28m78m7lvl9eija.R.inc(11691);if ((((payloadType == 1)&&(__CLR4_5_28m78m7lvl9eija.R.iget(11692)!=0|true))||(__CLR4_5_28m78m7lvl9eija.R.iget(11693)==0&false))) {{ // pic_timing is what we are interested in!
                        __CLR4_5_28m78m7lvl9eija.R.inc(11694);if ((((sps.vuiParams != null && (sps.vuiParams.nalHRDParams != null || sps.vuiParams.vclHRDParams != null || sps.vuiParams.pic_struct_present_flag))&&(__CLR4_5_28m78m7lvl9eija.R.iget(11695)!=0|true))||(__CLR4_5_28m78m7lvl9eija.R.iget(11696)==0&false))) {{
                            __CLR4_5_28m78m7lvl9eija.R.inc(11697);byte[] data = new byte[payloadSize];
                            __CLR4_5_28m78m7lvl9eija.R.inc(11698);is.read(data);
                            __CLR4_5_28m78m7lvl9eija.R.inc(11699);read += payloadSize;
                            __CLR4_5_28m78m7lvl9eija.R.inc(11700);CAVLCReader reader = new CAVLCReader(new ByteArrayInputStream(data));
                            __CLR4_5_28m78m7lvl9eija.R.inc(11701);if ((((sps.vuiParams.nalHRDParams != null || sps.vuiParams.vclHRDParams != null)&&(__CLR4_5_28m78m7lvl9eija.R.iget(11702)!=0|true))||(__CLR4_5_28m78m7lvl9eija.R.iget(11703)==0&false))) {{
                                __CLR4_5_28m78m7lvl9eija.R.inc(11704);removal_delay_flag = true;
                                __CLR4_5_28m78m7lvl9eija.R.inc(11705);cpb_removal_delay = reader.readU(sps.vuiParams.nalHRDParams.cpb_removal_delay_length_minus1 + 1, "SEI: cpb_removal_delay");
                                __CLR4_5_28m78m7lvl9eija.R.inc(11706);dpb_removal_delay = reader.readU(sps.vuiParams.nalHRDParams.dpb_output_delay_length_minus1 + 1, "SEI: dpb_removal_delay");
                            } }else {{
                                __CLR4_5_28m78m7lvl9eija.R.inc(11707);removal_delay_flag = false;
                            }
                            }__CLR4_5_28m78m7lvl9eija.R.inc(11708);if ((((sps.vuiParams.pic_struct_present_flag)&&(__CLR4_5_28m78m7lvl9eija.R.iget(11709)!=0|true))||(__CLR4_5_28m78m7lvl9eija.R.iget(11710)==0&false))) {{
                                __CLR4_5_28m78m7lvl9eija.R.inc(11711);pic_struct = reader.readU(4, "SEI: pic_struct");
                                __CLR4_5_28m78m7lvl9eija.R.inc(11712);int numClockTS;
                                boolean __CLB4_5_2_bool2=false;__CLR4_5_28m78m7lvl9eija.R.inc(11713);switch (pic_struct) {
                                    case 0:if (!__CLB4_5_2_bool2) {__CLR4_5_28m78m7lvl9eija.R.inc(11714);__CLB4_5_2_bool2=true;}
                                    case 1:if (!__CLB4_5_2_bool2) {__CLR4_5_28m78m7lvl9eija.R.inc(11715);__CLB4_5_2_bool2=true;}
                                    case 2:if (!__CLB4_5_2_bool2) {__CLR4_5_28m78m7lvl9eija.R.inc(11716);__CLB4_5_2_bool2=true;}
                                    default:if (!__CLB4_5_2_bool2) {__CLR4_5_28m78m7lvl9eija.R.inc(11717);__CLB4_5_2_bool2=true;}
                                        __CLR4_5_28m78m7lvl9eija.R.inc(11718);numClockTS = 1;
                                        __CLR4_5_28m78m7lvl9eija.R.inc(11719);break;

                                    case 3:if (!__CLB4_5_2_bool2) {__CLR4_5_28m78m7lvl9eija.R.inc(11720);__CLB4_5_2_bool2=true;}
                                    case 4:if (!__CLB4_5_2_bool2) {__CLR4_5_28m78m7lvl9eija.R.inc(11721);__CLB4_5_2_bool2=true;}
                                    case 7:if (!__CLB4_5_2_bool2) {__CLR4_5_28m78m7lvl9eija.R.inc(11722);__CLB4_5_2_bool2=true;}
                                        __CLR4_5_28m78m7lvl9eija.R.inc(11723);numClockTS = 2;
                                        __CLR4_5_28m78m7lvl9eija.R.inc(11724);break;

                                    case 5:if (!__CLB4_5_2_bool2) {__CLR4_5_28m78m7lvl9eija.R.inc(11725);__CLB4_5_2_bool2=true;}
                                    case 6:if (!__CLB4_5_2_bool2) {__CLR4_5_28m78m7lvl9eija.R.inc(11726);__CLB4_5_2_bool2=true;}
                                    case 8:if (!__CLB4_5_2_bool2) {__CLR4_5_28m78m7lvl9eija.R.inc(11727);__CLB4_5_2_bool2=true;}
                                        __CLR4_5_28m78m7lvl9eija.R.inc(11728);numClockTS = 3;
                                        __CLR4_5_28m78m7lvl9eija.R.inc(11729);break;
                                }
                                __CLR4_5_28m78m7lvl9eija.R.inc(11730);for (int i = 0; (((i < numClockTS)&&(__CLR4_5_28m78m7lvl9eija.R.iget(11731)!=0|true))||(__CLR4_5_28m78m7lvl9eija.R.iget(11732)==0&false)); i++) {{
                                    __CLR4_5_28m78m7lvl9eija.R.inc(11733);clock_timestamp_flag = reader.readBool("pic_timing SEI: clock_timestamp_flag[" + i + "]");
                                    __CLR4_5_28m78m7lvl9eija.R.inc(11734);if ((((clock_timestamp_flag)&&(__CLR4_5_28m78m7lvl9eija.R.iget(11735)!=0|true))||(__CLR4_5_28m78m7lvl9eija.R.iget(11736)==0&false))) {{
                                        __CLR4_5_28m78m7lvl9eija.R.inc(11737);ct_type = reader.readU(2, "pic_timing SEI: ct_type");
                                        __CLR4_5_28m78m7lvl9eija.R.inc(11738);nuit_field_based_flag = reader.readU(1, "pic_timing SEI: nuit_field_based_flag");
                                        __CLR4_5_28m78m7lvl9eija.R.inc(11739);counting_type = reader.readU(5, "pic_timing SEI: counting_type");
                                        __CLR4_5_28m78m7lvl9eija.R.inc(11740);full_timestamp_flag = reader.readU(1, "pic_timing SEI: full_timestamp_flag");
                                        __CLR4_5_28m78m7lvl9eija.R.inc(11741);discontinuity_flag = reader.readU(1, "pic_timing SEI: discontinuity_flag");
                                        __CLR4_5_28m78m7lvl9eija.R.inc(11742);cnt_dropped_flag = reader.readU(1, "pic_timing SEI: cnt_dropped_flag");
                                        __CLR4_5_28m78m7lvl9eija.R.inc(11743);n_frames = reader.readU(8, "pic_timing SEI: n_frames");
                                        __CLR4_5_28m78m7lvl9eija.R.inc(11744);if ((((full_timestamp_flag == 1)&&(__CLR4_5_28m78m7lvl9eija.R.iget(11745)!=0|true))||(__CLR4_5_28m78m7lvl9eija.R.iget(11746)==0&false))) {{
                                            __CLR4_5_28m78m7lvl9eija.R.inc(11747);seconds_value = reader.readU(6, "pic_timing SEI: seconds_value");
                                            __CLR4_5_28m78m7lvl9eija.R.inc(11748);minutes_value = reader.readU(6, "pic_timing SEI: minutes_value");
                                            __CLR4_5_28m78m7lvl9eija.R.inc(11749);hours_value = reader.readU(5, "pic_timing SEI: hours_value");
                                        } }else {{
                                            __CLR4_5_28m78m7lvl9eija.R.inc(11750);if ((((reader.readBool("pic_timing SEI: seconds_flag"))&&(__CLR4_5_28m78m7lvl9eija.R.iget(11751)!=0|true))||(__CLR4_5_28m78m7lvl9eija.R.iget(11752)==0&false))) {{
                                                __CLR4_5_28m78m7lvl9eija.R.inc(11753);seconds_value = reader.readU(6, "pic_timing SEI: seconds_value");
                                                __CLR4_5_28m78m7lvl9eija.R.inc(11754);if ((((reader.readBool("pic_timing SEI: minutes_flag"))&&(__CLR4_5_28m78m7lvl9eija.R.iget(11755)!=0|true))||(__CLR4_5_28m78m7lvl9eija.R.iget(11756)==0&false))) {{
                                                    __CLR4_5_28m78m7lvl9eija.R.inc(11757);minutes_value = reader.readU(6, "pic_timing SEI: minutes_value");
                                                    __CLR4_5_28m78m7lvl9eija.R.inc(11758);if ((((reader.readBool("pic_timing SEI: hours_flag"))&&(__CLR4_5_28m78m7lvl9eija.R.iget(11759)!=0|true))||(__CLR4_5_28m78m7lvl9eija.R.iget(11760)==0&false))) {{
                                                        __CLR4_5_28m78m7lvl9eija.R.inc(11761);hours_value = reader.readU(5, "pic_timing SEI: hours_value");
                                                    }
                                                }}
                                            }}
                                        }}
                                        }__CLR4_5_28m78m7lvl9eija.R.inc(11762);if (true) {{
                                            __CLR4_5_28m78m7lvl9eija.R.inc(11763);if ((((sps.vuiParams.nalHRDParams != null)&&(__CLR4_5_28m78m7lvl9eija.R.iget(11764)!=0|true))||(__CLR4_5_28m78m7lvl9eija.R.iget(11765)==0&false))) {{
                                                __CLR4_5_28m78m7lvl9eija.R.inc(11766);time_offset_length = sps.vuiParams.nalHRDParams.time_offset_length;
                                            } }else {__CLR4_5_28m78m7lvl9eija.R.inc(11767);if ((((sps.vuiParams.vclHRDParams != null)&&(__CLR4_5_28m78m7lvl9eija.R.iget(11768)!=0|true))||(__CLR4_5_28m78m7lvl9eija.R.iget(11769)==0&false))) {{
                                                __CLR4_5_28m78m7lvl9eija.R.inc(11770);time_offset_length = sps.vuiParams.vclHRDParams.time_offset_length;
                                            } }else {{
                                                __CLR4_5_28m78m7lvl9eija.R.inc(11771);time_offset_length = 24;
                                            }
                                            }}__CLR4_5_28m78m7lvl9eija.R.inc(11772);time_offset = reader.readU(24, "pic_timing SEI: time_offset");
                                        }
                                    }}
                                }}
                            }}

                        }} }else {{
                            __CLR4_5_28m78m7lvl9eija.R.inc(11773);for (int i = 0; (((i < payloadSize)&&(__CLR4_5_28m78m7lvl9eija.R.iget(11774)!=0|true))||(__CLR4_5_28m78m7lvl9eija.R.iget(11775)==0&false)); i++) {{
                                __CLR4_5_28m78m7lvl9eija.R.inc(11776);is.read();
                                __CLR4_5_28m78m7lvl9eija.R.inc(11777);read++;
                            }
                        }}
                    }} }else {{
                        __CLR4_5_28m78m7lvl9eija.R.inc(11778);for (int i = 0; (((i < payloadSize)&&(__CLR4_5_28m78m7lvl9eija.R.iget(11779)!=0|true))||(__CLR4_5_28m78m7lvl9eija.R.iget(11780)==0&false)); i++) {{
                            __CLR4_5_28m78m7lvl9eija.R.inc(11781);is.read();
                            __CLR4_5_28m78m7lvl9eija.R.inc(11782);read++;
                        }
                    }}
                }} }else {{
                    __CLR4_5_28m78m7lvl9eija.R.inc(11783);read = datasize;
                }
                }__CLR4_5_28m78m7lvl9eija.R.inc(11784);LOG.fine(this.toString());
            }
        }}finally{__CLR4_5_28m78m7lvl9eija.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_5_28m78m7lvl9eija.R.inc(11785);
            __CLR4_5_28m78m7lvl9eija.R.inc(11786);String out = "SEIMessage{" +
                    "payloadType=" + payloadType +
                    ", payloadSize=" + payloadSize;
            __CLR4_5_28m78m7lvl9eija.R.inc(11787);if ((((payloadType == 1)&&(__CLR4_5_28m78m7lvl9eija.R.iget(11788)!=0|true))||(__CLR4_5_28m78m7lvl9eija.R.iget(11789)==0&false))) {{
                __CLR4_5_28m78m7lvl9eija.R.inc(11790);if ((((sps.vuiParams.nalHRDParams != null || sps.vuiParams.vclHRDParams != null)&&(__CLR4_5_28m78m7lvl9eija.R.iget(11791)!=0|true))||(__CLR4_5_28m78m7lvl9eija.R.iget(11792)==0&false))) {{

                    __CLR4_5_28m78m7lvl9eija.R.inc(11793);out += ", cpb_removal_delay=" + cpb_removal_delay +
                            ", dpb_removal_delay=" + dpb_removal_delay;
                }
                }__CLR4_5_28m78m7lvl9eija.R.inc(11794);if ((((sps.vuiParams.pic_struct_present_flag)&&(__CLR4_5_28m78m7lvl9eija.R.iget(11795)!=0|true))||(__CLR4_5_28m78m7lvl9eija.R.iget(11796)==0&false))) {{
                    __CLR4_5_28m78m7lvl9eija.R.inc(11797);out += ", pic_struct=" + pic_struct;
                    __CLR4_5_28m78m7lvl9eija.R.inc(11798);if ((((clock_timestamp_flag)&&(__CLR4_5_28m78m7lvl9eija.R.iget(11799)!=0|true))||(__CLR4_5_28m78m7lvl9eija.R.iget(11800)==0&false))) {{
                        __CLR4_5_28m78m7lvl9eija.R.inc(11801);out += ", ct_type=" + ct_type +
                                ", nuit_field_based_flag=" + nuit_field_based_flag +
                                ", counting_type=" + counting_type +
                                ", full_timestamp_flag=" + full_timestamp_flag +
                                ", discontinuity_flag=" + discontinuity_flag +
                                ", cnt_dropped_flag=" + cnt_dropped_flag +
                                ", n_frames=" + n_frames +
                                ", seconds_value=" + seconds_value +
                                ", minutes_value=" + minutes_value +
                                ", hours_value=" + hours_value +
                                ", time_offset_length=" + time_offset_length +
                                ", time_offset=" + time_offset;
                    }
                }}
            }}
            }__CLR4_5_28m78m7lvl9eija.R.inc(11802);out += '}';
            __CLR4_5_28m78m7lvl9eija.R.inc(11803);return out;
        }finally{__CLR4_5_28m78m7lvl9eija.R.flushNeeded();}}
    }

}

