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
@java.lang.SuppressWarnings({"fallthrough"}) public class H264TrackImpl extends AbstractH26XTrack {public static class __CLR4_5_28ou8oulvlulicw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,11899,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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
        super(dataSource);__CLR4_5_28ou8oulvlulicw.R.inc(11263);try{__CLR4_5_28ou8oulvlulicw.R.inc(11262);
        __CLR4_5_28ou8oulvlulicw.R.inc(11264);this.lang = lang;
        __CLR4_5_28ou8oulvlulicw.R.inc(11265);this.timescale = timescale; //e.g. 23976
        __CLR4_5_28ou8oulvlulicw.R.inc(11266);this.frametick = frametick;
        __CLR4_5_28ou8oulvlulicw.R.inc(11267);if (((((timescale > 0) && (frametick > 0))&&(__CLR4_5_28ou8oulvlulicw.R.iget(11268)!=0|true))||(__CLR4_5_28ou8oulvlulicw.R.iget(11269)==0&false))) {{
            __CLR4_5_28ou8oulvlulicw.R.inc(11270);this.determineFrameRate = false;
        }

        }__CLR4_5_28ou8oulvlulicw.R.inc(11271);parse(new LookAhead(dataSource));
    }finally{__CLR4_5_28ou8oulvlulicw.R.flushNeeded();}}

    public H264TrackImpl(DataSource dataSource, String lang) throws IOException {
        this(dataSource, lang, -1, -1);__CLR4_5_28ou8oulvlulicw.R.inc(11273);try{__CLR4_5_28ou8oulvlulicw.R.inc(11272);
    }finally{__CLR4_5_28ou8oulvlulicw.R.flushNeeded();}}

    public H264TrackImpl(DataSource dataSource) throws IOException {
        this(dataSource, "eng");__CLR4_5_28ou8oulvlulicw.R.inc(11275);try{__CLR4_5_28ou8oulvlulicw.R.inc(11274);
    }finally{__CLR4_5_28ou8oulvlulicw.R.flushNeeded();}}

    public static H264NalUnitHeader getNalUnitHeader(ByteBuffer nal) {try{__CLR4_5_28ou8oulvlulicw.R.inc(11276);
        __CLR4_5_28ou8oulvlulicw.R.inc(11277);H264NalUnitHeader nalUnitHeader = new H264NalUnitHeader();
        __CLR4_5_28ou8oulvlulicw.R.inc(11278);int type = nal.get(0);
        __CLR4_5_28ou8oulvlulicw.R.inc(11279);nalUnitHeader.nal_ref_idc = (type >> 5) & 3;
        __CLR4_5_28ou8oulvlulicw.R.inc(11280);nalUnitHeader.nal_unit_type = type & 0x1f;

        __CLR4_5_28ou8oulvlulicw.R.inc(11281);return nalUnitHeader;
    }finally{__CLR4_5_28ou8oulvlulicw.R.flushNeeded();}}

    private void parse(LookAhead la) throws IOException {try{__CLR4_5_28ou8oulvlulicw.R.inc(11282);


        __CLR4_5_28ou8oulvlulicw.R.inc(11283);samples = new ArrayList<Sample>();
        __CLR4_5_28ou8oulvlulicw.R.inc(11284);if ((((!readSamples(la))&&(__CLR4_5_28ou8oulvlulicw.R.iget(11285)!=0|true))||(__CLR4_5_28ou8oulvlulicw.R.iget(11286)==0&false))) {{
            __CLR4_5_28ou8oulvlulicw.R.inc(11287);throw new IOException();
        }

        }__CLR4_5_28ou8oulvlulicw.R.inc(11288);if ((((!readVariables())&&(__CLR4_5_28ou8oulvlulicw.R.iget(11289)!=0|true))||(__CLR4_5_28ou8oulvlulicw.R.iget(11290)==0&false))) {{
            __CLR4_5_28ou8oulvlulicw.R.inc(11291);throw new IOException();
        }

        }__CLR4_5_28ou8oulvlulicw.R.inc(11292);sampleDescriptionBox = new SampleDescriptionBox();
        __CLR4_5_28ou8oulvlulicw.R.inc(11293);VisualSampleEntry visualSampleEntry = new VisualSampleEntry("avc1");
        __CLR4_5_28ou8oulvlulicw.R.inc(11294);visualSampleEntry.setDataReferenceIndex(1);
        __CLR4_5_28ou8oulvlulicw.R.inc(11295);visualSampleEntry.setDepth(24);
        __CLR4_5_28ou8oulvlulicw.R.inc(11296);visualSampleEntry.setFrameCount(1);
        __CLR4_5_28ou8oulvlulicw.R.inc(11297);visualSampleEntry.setHorizresolution(72);
        __CLR4_5_28ou8oulvlulicw.R.inc(11298);visualSampleEntry.setVertresolution(72);
        __CLR4_5_28ou8oulvlulicw.R.inc(11299);visualSampleEntry.setWidth(width);
        __CLR4_5_28ou8oulvlulicw.R.inc(11300);visualSampleEntry.setHeight(height);
        __CLR4_5_28ou8oulvlulicw.R.inc(11301);visualSampleEntry.setCompressorname("AVC Coding");

        __CLR4_5_28ou8oulvlulicw.R.inc(11302);AvcConfigurationBox avcConfigurationBox = new AvcConfigurationBox();

        __CLR4_5_28ou8oulvlulicw.R.inc(11303);avcConfigurationBox.setSequenceParameterSets(new ArrayList<byte[]>(spsIdToSpsBytes.values()));
        __CLR4_5_28ou8oulvlulicw.R.inc(11304);avcConfigurationBox.setPictureParameterSets(new ArrayList<byte[]>(ppsIdToPpsBytes.values()));
        __CLR4_5_28ou8oulvlulicw.R.inc(11305);avcConfigurationBox.setAvcLevelIndication(firstSeqParameterSet.level_idc);
        __CLR4_5_28ou8oulvlulicw.R.inc(11306);avcConfigurationBox.setAvcProfileIndication(firstSeqParameterSet.profile_idc);
        __CLR4_5_28ou8oulvlulicw.R.inc(11307);avcConfigurationBox.setBitDepthLumaMinus8(firstSeqParameterSet.bit_depth_luma_minus8);
        __CLR4_5_28ou8oulvlulicw.R.inc(11308);avcConfigurationBox.setBitDepthChromaMinus8(firstSeqParameterSet.bit_depth_chroma_minus8);
        __CLR4_5_28ou8oulvlulicw.R.inc(11309);avcConfigurationBox.setChromaFormat(firstSeqParameterSet.chroma_format_idc.getId());
        __CLR4_5_28ou8oulvlulicw.R.inc(11310);avcConfigurationBox.setConfigurationVersion(1);
        __CLR4_5_28ou8oulvlulicw.R.inc(11311);avcConfigurationBox.setLengthSizeMinusOne(3);


        __CLR4_5_28ou8oulvlulicw.R.inc(11312);avcConfigurationBox.setProfileCompatibility(
                ((((firstSeqParameterSet.constraint_set_0_flag )&&(__CLR4_5_28ou8oulvlulicw.R.iget(11313)!=0|true))||(__CLR4_5_28ou8oulvlulicw.R.iget(11314)==0&false))? 128 : 0) +
                        ((((firstSeqParameterSet.constraint_set_1_flag )&&(__CLR4_5_28ou8oulvlulicw.R.iget(11315)!=0|true))||(__CLR4_5_28ou8oulvlulicw.R.iget(11316)==0&false))? 64 : 0) +
                        ((((firstSeqParameterSet.constraint_set_2_flag )&&(__CLR4_5_28ou8oulvlulicw.R.iget(11317)!=0|true))||(__CLR4_5_28ou8oulvlulicw.R.iget(11318)==0&false))? 32 : 0) +
                        ((((firstSeqParameterSet.constraint_set_3_flag )&&(__CLR4_5_28ou8oulvlulicw.R.iget(11319)!=0|true))||(__CLR4_5_28ou8oulvlulicw.R.iget(11320)==0&false))? 16 : 0) +
                        ((((firstSeqParameterSet.constraint_set_4_flag )&&(__CLR4_5_28ou8oulvlulicw.R.iget(11321)!=0|true))||(__CLR4_5_28ou8oulvlulicw.R.iget(11322)==0&false))? 8 : 0) +
                        (int) (firstSeqParameterSet.reserved_zero_2bits & 0x3)
        );

        __CLR4_5_28ou8oulvlulicw.R.inc(11323);visualSampleEntry.addBox(avcConfigurationBox);
        __CLR4_5_28ou8oulvlulicw.R.inc(11324);sampleDescriptionBox.addBox(visualSampleEntry);

        __CLR4_5_28ou8oulvlulicw.R.inc(11325);trackMetaData.setCreationTime(new Date());
        __CLR4_5_28ou8oulvlulicw.R.inc(11326);trackMetaData.setModificationTime(new Date());
        __CLR4_5_28ou8oulvlulicw.R.inc(11327);trackMetaData.setLanguage(lang);
        __CLR4_5_28ou8oulvlulicw.R.inc(11328);trackMetaData.setTimescale(timescale);
        __CLR4_5_28ou8oulvlulicw.R.inc(11329);trackMetaData.setWidth(width);
        __CLR4_5_28ou8oulvlulicw.R.inc(11330);trackMetaData.setHeight(height);
    }finally{__CLR4_5_28ou8oulvlulicw.R.flushNeeded();}}

    public SampleDescriptionBox getSampleDescriptionBox() {try{__CLR4_5_28ou8oulvlulicw.R.inc(11331);
        __CLR4_5_28ou8oulvlulicw.R.inc(11332);return sampleDescriptionBox;
    }finally{__CLR4_5_28ou8oulvlulicw.R.flushNeeded();}}

    public String getHandler() {try{__CLR4_5_28ou8oulvlulicw.R.inc(11333);
        __CLR4_5_28ou8oulvlulicw.R.inc(11334);return "vide";
    }finally{__CLR4_5_28ou8oulvlulicw.R.flushNeeded();}}

    public List<Sample> getSamples() {try{__CLR4_5_28ou8oulvlulicw.R.inc(11335);
        __CLR4_5_28ou8oulvlulicw.R.inc(11336);return samples;
    }finally{__CLR4_5_28ou8oulvlulicw.R.flushNeeded();}}

    private boolean readVariables() {try{__CLR4_5_28ou8oulvlulicw.R.inc(11337);
        __CLR4_5_28ou8oulvlulicw.R.inc(11338);width = (firstSeqParameterSet.pic_width_in_mbs_minus1 + 1) * 16;
        __CLR4_5_28ou8oulvlulicw.R.inc(11339);int mult = 2;
        __CLR4_5_28ou8oulvlulicw.R.inc(11340);if ((((firstSeqParameterSet.frame_mbs_only_flag)&&(__CLR4_5_28ou8oulvlulicw.R.iget(11341)!=0|true))||(__CLR4_5_28ou8oulvlulicw.R.iget(11342)==0&false))) {{
            __CLR4_5_28ou8oulvlulicw.R.inc(11343);mult = 1;
        }
        }__CLR4_5_28ou8oulvlulicw.R.inc(11344);height = 16 * (firstSeqParameterSet.pic_height_in_map_units_minus1 + 1) * mult;
        __CLR4_5_28ou8oulvlulicw.R.inc(11345);if ((((firstSeqParameterSet.frame_cropping_flag)&&(__CLR4_5_28ou8oulvlulicw.R.iget(11346)!=0|true))||(__CLR4_5_28ou8oulvlulicw.R.iget(11347)==0&false))) {{
            __CLR4_5_28ou8oulvlulicw.R.inc(11348);int chromaArrayType = 0;
            __CLR4_5_28ou8oulvlulicw.R.inc(11349);if ((((!firstSeqParameterSet.residual_color_transform_flag)&&(__CLR4_5_28ou8oulvlulicw.R.iget(11350)!=0|true))||(__CLR4_5_28ou8oulvlulicw.R.iget(11351)==0&false))) {{
                __CLR4_5_28ou8oulvlulicw.R.inc(11352);chromaArrayType = firstSeqParameterSet.chroma_format_idc.getId();
            }
            }__CLR4_5_28ou8oulvlulicw.R.inc(11353);int cropUnitX = 1;
            __CLR4_5_28ou8oulvlulicw.R.inc(11354);int cropUnitY = mult;
            __CLR4_5_28ou8oulvlulicw.R.inc(11355);if ((((chromaArrayType != 0)&&(__CLR4_5_28ou8oulvlulicw.R.iget(11356)!=0|true))||(__CLR4_5_28ou8oulvlulicw.R.iget(11357)==0&false))) {{
                __CLR4_5_28ou8oulvlulicw.R.inc(11358);cropUnitX = firstSeqParameterSet.chroma_format_idc.getSubWidth();
                __CLR4_5_28ou8oulvlulicw.R.inc(11359);cropUnitY = firstSeqParameterSet.chroma_format_idc.getSubHeight() * mult;
            }

            }__CLR4_5_28ou8oulvlulicw.R.inc(11360);width -= cropUnitX * (firstSeqParameterSet.frame_crop_left_offset + firstSeqParameterSet.frame_crop_right_offset);
            __CLR4_5_28ou8oulvlulicw.R.inc(11361);height -= cropUnitY * (firstSeqParameterSet.frame_crop_top_offset + firstSeqParameterSet.frame_crop_bottom_offset);
        }
        }__CLR4_5_28ou8oulvlulicw.R.inc(11362);return true;
    }finally{__CLR4_5_28ou8oulvlulicw.R.flushNeeded();}}

    private boolean readSamples(LookAhead la) throws IOException {try{__CLR4_5_28ou8oulvlulicw.R.inc(11363);


        __CLR4_5_28ou8oulvlulicw.R.inc(11364);List<ByteBuffer> buffered = new ArrayList<ByteBuffer>();


        __CLR4_5_28ou8oulvlulicw.R.inc(11365);ByteBuffer nal;


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
            public FirstVclNalDetector(ByteBuffer nal, int nal_ref_idc, int nal_unit_type) {try{__CLR4_5_28ou8oulvlulicw.R.inc(11366);
                __CLR4_5_28ou8oulvlulicw.R.inc(11367);InputStream bs = cleanBuffer(new ByteBufferBackedInputStream(nal));
                __CLR4_5_28ou8oulvlulicw.R.inc(11368);SliceHeader sh = new SliceHeader(bs, spsIdToSps, ppsIdToPps, nal_unit_type == 5);
                __CLR4_5_28ou8oulvlulicw.R.inc(11369);this.frame_num = sh.frame_num;
                __CLR4_5_28ou8oulvlulicw.R.inc(11370);this.pic_parameter_set_id = sh.pic_parameter_set_id;
                __CLR4_5_28ou8oulvlulicw.R.inc(11371);this.field_pic_flag = sh.field_pic_flag;
                __CLR4_5_28ou8oulvlulicw.R.inc(11372);this.bottom_field_flag = sh.bottom_field_flag;
                __CLR4_5_28ou8oulvlulicw.R.inc(11373);this.nal_ref_idc = nal_ref_idc;
                __CLR4_5_28ou8oulvlulicw.R.inc(11374);this.pic_order_cnt_type = spsIdToSps.get(ppsIdToPps.get(sh.pic_parameter_set_id).seq_parameter_set_id).pic_order_cnt_type;
                __CLR4_5_28ou8oulvlulicw.R.inc(11375);this.delta_pic_order_cnt_bottom = sh.delta_pic_order_cnt_bottom;
                __CLR4_5_28ou8oulvlulicw.R.inc(11376);this.pic_order_cnt_lsb = sh.pic_order_cnt_lsb;
                __CLR4_5_28ou8oulvlulicw.R.inc(11377);this.delta_pic_order_cnt_0 = sh.delta_pic_order_cnt_0;
                __CLR4_5_28ou8oulvlulicw.R.inc(11378);this.delta_pic_order_cnt_1 = sh.delta_pic_order_cnt_1;
                __CLR4_5_28ou8oulvlulicw.R.inc(11379);this.idr_pic_id = sh.idr_pic_id;
            }finally{__CLR4_5_28ou8oulvlulicw.R.flushNeeded();}}

            boolean isFirstInNew(FirstVclNalDetector nu) {try{__CLR4_5_28ou8oulvlulicw.R.inc(11380);
                __CLR4_5_28ou8oulvlulicw.R.inc(11381);if ((((nu.frame_num != frame_num)&&(__CLR4_5_28ou8oulvlulicw.R.iget(11382)!=0|true))||(__CLR4_5_28ou8oulvlulicw.R.iget(11383)==0&false))) {{
                    __CLR4_5_28ou8oulvlulicw.R.inc(11384);return true;
                }
                }__CLR4_5_28ou8oulvlulicw.R.inc(11385);if ((((nu.pic_parameter_set_id != pic_parameter_set_id)&&(__CLR4_5_28ou8oulvlulicw.R.iget(11386)!=0|true))||(__CLR4_5_28ou8oulvlulicw.R.iget(11387)==0&false))) {{
                    __CLR4_5_28ou8oulvlulicw.R.inc(11388);return true;
                }
                }__CLR4_5_28ou8oulvlulicw.R.inc(11389);if ((((nu.field_pic_flag != field_pic_flag)&&(__CLR4_5_28ou8oulvlulicw.R.iget(11390)!=0|true))||(__CLR4_5_28ou8oulvlulicw.R.iget(11391)==0&false))) {{
                    __CLR4_5_28ou8oulvlulicw.R.inc(11392);return true;
                }
                }__CLR4_5_28ou8oulvlulicw.R.inc(11393);if ((((nu.field_pic_flag)&&(__CLR4_5_28ou8oulvlulicw.R.iget(11394)!=0|true))||(__CLR4_5_28ou8oulvlulicw.R.iget(11395)==0&false))) {{
                    __CLR4_5_28ou8oulvlulicw.R.inc(11396);if ((((nu.bottom_field_flag != bottom_field_flag)&&(__CLR4_5_28ou8oulvlulicw.R.iget(11397)!=0|true))||(__CLR4_5_28ou8oulvlulicw.R.iget(11398)==0&false))) {{
                        __CLR4_5_28ou8oulvlulicw.R.inc(11399);return true;
                    }
                }}
                }__CLR4_5_28ou8oulvlulicw.R.inc(11400);if ((((nu.nal_ref_idc != nal_ref_idc)&&(__CLR4_5_28ou8oulvlulicw.R.iget(11401)!=0|true))||(__CLR4_5_28ou8oulvlulicw.R.iget(11402)==0&false))) {{
                    __CLR4_5_28ou8oulvlulicw.R.inc(11403);return true;
                }
                }__CLR4_5_28ou8oulvlulicw.R.inc(11404);if ((((nu.pic_order_cnt_type == 0 && pic_order_cnt_type == 0)&&(__CLR4_5_28ou8oulvlulicw.R.iget(11405)!=0|true))||(__CLR4_5_28ou8oulvlulicw.R.iget(11406)==0&false))) {{
                    __CLR4_5_28ou8oulvlulicw.R.inc(11407);if ((((nu.pic_order_cnt_lsb != pic_order_cnt_lsb)&&(__CLR4_5_28ou8oulvlulicw.R.iget(11408)!=0|true))||(__CLR4_5_28ou8oulvlulicw.R.iget(11409)==0&false))) {{
                        __CLR4_5_28ou8oulvlulicw.R.inc(11410);return true;
                    }
                    }__CLR4_5_28ou8oulvlulicw.R.inc(11411);if ((((nu.delta_pic_order_cnt_bottom != delta_pic_order_cnt_bottom)&&(__CLR4_5_28ou8oulvlulicw.R.iget(11412)!=0|true))||(__CLR4_5_28ou8oulvlulicw.R.iget(11413)==0&false))) {{
                        __CLR4_5_28ou8oulvlulicw.R.inc(11414);return true;
                    }
                }}
                }__CLR4_5_28ou8oulvlulicw.R.inc(11415);if ((((nu.pic_order_cnt_type == 1 && pic_order_cnt_type == 1)&&(__CLR4_5_28ou8oulvlulicw.R.iget(11416)!=0|true))||(__CLR4_5_28ou8oulvlulicw.R.iget(11417)==0&false))) {{
                    __CLR4_5_28ou8oulvlulicw.R.inc(11418);if ((((nu.delta_pic_order_cnt_0 != delta_pic_order_cnt_0)&&(__CLR4_5_28ou8oulvlulicw.R.iget(11419)!=0|true))||(__CLR4_5_28ou8oulvlulicw.R.iget(11420)==0&false))) {{
                        __CLR4_5_28ou8oulvlulicw.R.inc(11421);return true;
                    }
                    }__CLR4_5_28ou8oulvlulicw.R.inc(11422);if ((((nu.delta_pic_order_cnt_1 != delta_pic_order_cnt_1)&&(__CLR4_5_28ou8oulvlulicw.R.iget(11423)!=0|true))||(__CLR4_5_28ou8oulvlulicw.R.iget(11424)==0&false))) {{
                        __CLR4_5_28ou8oulvlulicw.R.inc(11425);return true;
                    }
                }}
                }__CLR4_5_28ou8oulvlulicw.R.inc(11426);if ((((nu.idrPicFlag != idrPicFlag)&&(__CLR4_5_28ou8oulvlulicw.R.iget(11427)!=0|true))||(__CLR4_5_28ou8oulvlulicw.R.iget(11428)==0&false))) {{
                    __CLR4_5_28ou8oulvlulicw.R.inc(11429);return true;
                }
                }__CLR4_5_28ou8oulvlulicw.R.inc(11430);if ((((nu.idrPicFlag && idrPicFlag)&&(__CLR4_5_28ou8oulvlulicw.R.iget(11431)!=0|true))||(__CLR4_5_28ou8oulvlulicw.R.iget(11432)==0&false))) {{
                    __CLR4_5_28ou8oulvlulicw.R.inc(11433);if ((((nu.idr_pic_id != idr_pic_id)&&(__CLR4_5_28ou8oulvlulicw.R.iget(11434)!=0|true))||(__CLR4_5_28ou8oulvlulicw.R.iget(11435)==0&false))) {{
                        __CLR4_5_28ou8oulvlulicw.R.inc(11436);return true;
                    }
                }}
                }__CLR4_5_28ou8oulvlulicw.R.inc(11437);return false;
            }finally{__CLR4_5_28ou8oulvlulicw.R.flushNeeded();}}
        }
        __CLR4_5_28ou8oulvlulicw.R.inc(11438);FirstVclNalDetector fvnd = null;


        __CLR4_5_28ou8oulvlulicw.R.inc(11439);nal_loop:
        while ((nal = findNextNal(la)) != null) {{
            __CLR4_5_28ou8oulvlulicw.R.inc(11442);H264NalUnitHeader nalUnitHeader = getNalUnitHeader(nal);

            boolean __CLB4_5_2_bool0=false;__CLR4_5_28ou8oulvlulicw.R.inc(11443);switch (nalUnitHeader.nal_unit_type) {
                case H264NalUnitTypes.CODED_SLICE_NON_IDR:if (!__CLB4_5_2_bool0) {__CLR4_5_28ou8oulvlulicw.R.inc(11444);__CLB4_5_2_bool0=true;}
                case H264NalUnitTypes.CODED_SLICE_DATA_PART_A:if (!__CLB4_5_2_bool0) {__CLR4_5_28ou8oulvlulicw.R.inc(11445);__CLB4_5_2_bool0=true;}
                case H264NalUnitTypes.CODED_SLICE_DATA_PART_B:if (!__CLB4_5_2_bool0) {__CLR4_5_28ou8oulvlulicw.R.inc(11446);__CLB4_5_2_bool0=true;}
                case H264NalUnitTypes.CODED_SLICE_DATA_PART_C:if (!__CLB4_5_2_bool0) {__CLR4_5_28ou8oulvlulicw.R.inc(11447);__CLB4_5_2_bool0=true;}
                case H264NalUnitTypes.CODED_SLICE_IDR:if (!__CLB4_5_2_bool0) {__CLR4_5_28ou8oulvlulicw.R.inc(11448);__CLB4_5_2_bool0=true;}
                    __CLR4_5_28ou8oulvlulicw.R.inc(11449);FirstVclNalDetector current = new FirstVclNalDetector(nal,
                            nalUnitHeader.nal_ref_idc, nalUnitHeader.nal_unit_type);
                    __CLR4_5_28ou8oulvlulicw.R.inc(11450);if ((((fvnd != null && fvnd.isFirstInNew(current))&&(__CLR4_5_28ou8oulvlulicw.R.iget(11451)!=0|true))||(__CLR4_5_28ou8oulvlulicw.R.iget(11452)==0&false))) {{
                        __CLR4_5_28ou8oulvlulicw.R.inc(11453);LOG.finer("Wrapping up cause of first vcl nal is found");
                        __CLR4_5_28ou8oulvlulicw.R.inc(11454);createSample(buffered);
                    }
                    }__CLR4_5_28ou8oulvlulicw.R.inc(11455);fvnd = current;
                    //System.err.println("" + nalUnitHeader.nal_unit_type);
                    __CLR4_5_28ou8oulvlulicw.R.inc(11456);buffered.add((ByteBuffer) nal.rewind());
                    //log.finer("NAL Unit Type: " + nalUnitHeader.nal_unit_type + " " + fvnd.frame_num);
                    __CLR4_5_28ou8oulvlulicw.R.inc(11457);break;

                case H264NalUnitTypes.SEI:if (!__CLB4_5_2_bool0) {__CLR4_5_28ou8oulvlulicw.R.inc(11458);__CLB4_5_2_bool0=true;}
                    __CLR4_5_28ou8oulvlulicw.R.inc(11459);if ((((fvnd != null)&&(__CLR4_5_28ou8oulvlulicw.R.iget(11460)!=0|true))||(__CLR4_5_28ou8oulvlulicw.R.iget(11461)==0&false))) {{
                        __CLR4_5_28ou8oulvlulicw.R.inc(11462);LOG.finer("Wrapping up cause of SEI after vcl marks new sample");
                        __CLR4_5_28ou8oulvlulicw.R.inc(11463);createSample(buffered);
                        __CLR4_5_28ou8oulvlulicw.R.inc(11464);fvnd = null;
                    }
                    }__CLR4_5_28ou8oulvlulicw.R.inc(11465);seiMessage = new SEIMessage(cleanBuffer(new ByteBufferBackedInputStream(nal)), currentSeqParameterSet);
                    //System.err.println("" + nalUnitHeader.nal_unit_type);
                    __CLR4_5_28ou8oulvlulicw.R.inc(11466);buffered.add(nal);
                    __CLR4_5_28ou8oulvlulicw.R.inc(11467);break;

                case H264NalUnitTypes.AU_UNIT_DELIMITER:if (!__CLB4_5_2_bool0) {__CLR4_5_28ou8oulvlulicw.R.inc(11468);__CLB4_5_2_bool0=true;}
                    __CLR4_5_28ou8oulvlulicw.R.inc(11469);if ((((fvnd != null)&&(__CLR4_5_28ou8oulvlulicw.R.iget(11470)!=0|true))||(__CLR4_5_28ou8oulvlulicw.R.iget(11471)==0&false))) {{
                        __CLR4_5_28ou8oulvlulicw.R.inc(11472);LOG.finer("Wrapping up cause of AU after vcl marks new sample");
                        __CLR4_5_28ou8oulvlulicw.R.inc(11473);createSample(buffered);
                        __CLR4_5_28ou8oulvlulicw.R.inc(11474);fvnd = null;
                    }
                    //System.err.println("" + nalUnitHeader.nal_unit_type);
                    }__CLR4_5_28ou8oulvlulicw.R.inc(11475);buffered.add(nal);
                    __CLR4_5_28ou8oulvlulicw.R.inc(11476);break;
                case H264NalUnitTypes.SEQ_PARAMETER_SET:if (!__CLB4_5_2_bool0) {__CLR4_5_28ou8oulvlulicw.R.inc(11477);__CLB4_5_2_bool0=true;}
                    __CLR4_5_28ou8oulvlulicw.R.inc(11478);if ((((fvnd != null)&&(__CLR4_5_28ou8oulvlulicw.R.iget(11479)!=0|true))||(__CLR4_5_28ou8oulvlulicw.R.iget(11480)==0&false))) {{
                        __CLR4_5_28ou8oulvlulicw.R.inc(11481);LOG.finer("Wrapping up cause of SPS after vcl marks new sample");
                        __CLR4_5_28ou8oulvlulicw.R.inc(11482);createSample(buffered);
                        __CLR4_5_28ou8oulvlulicw.R.inc(11483);fvnd = null;
                    }
                    }__CLR4_5_28ou8oulvlulicw.R.inc(11484);handleSPS((ByteBuffer) nal.rewind());
                    __CLR4_5_28ou8oulvlulicw.R.inc(11485);break;
                case 8:if (!__CLB4_5_2_bool0) {__CLR4_5_28ou8oulvlulicw.R.inc(11486);__CLB4_5_2_bool0=true;}
                    __CLR4_5_28ou8oulvlulicw.R.inc(11487);if ((((fvnd != null)&&(__CLR4_5_28ou8oulvlulicw.R.iget(11488)!=0|true))||(__CLR4_5_28ou8oulvlulicw.R.iget(11489)==0&false))) {{
                        __CLR4_5_28ou8oulvlulicw.R.inc(11490);LOG.finer("Wrapping up cause of PPS after vcl marks new sample");
                        __CLR4_5_28ou8oulvlulicw.R.inc(11491);createSample(buffered);
                        __CLR4_5_28ou8oulvlulicw.R.inc(11492);fvnd = null;
                    }
                    }__CLR4_5_28ou8oulvlulicw.R.inc(11493);handlePPS((ByteBuffer) nal.rewind());
                    __CLR4_5_28ou8oulvlulicw.R.inc(11494);break;
                case H264NalUnitTypes.END_OF_SEQUENCE:if (!__CLB4_5_2_bool0) {__CLR4_5_28ou8oulvlulicw.R.inc(11495);__CLB4_5_2_bool0=true;}
                case H264NalUnitTypes.END_OF_STREAM:if (!__CLB4_5_2_bool0) {__CLR4_5_28ou8oulvlulicw.R.inc(11496);__CLB4_5_2_bool0=true;}

                    __CLR4_5_28ou8oulvlulicw.R.inc(11497);break nal_loop;

                case H264NalUnitTypes.SEQ_PARAMETER_SET_EXT:if (!__CLB4_5_2_bool0) {__CLR4_5_28ou8oulvlulicw.R.inc(11498);__CLB4_5_2_bool0=true;}
                    __CLR4_5_28ou8oulvlulicw.R.inc(11499);throw new RuntimeException("Sequence parameter set extension is not yet handled. Needs TLC.");

                default:if (!__CLB4_5_2_bool0) {__CLR4_5_28ou8oulvlulicw.R.inc(11500);__CLB4_5_2_bool0=true;}
                    //  buffered.add(nal);
                    __CLR4_5_28ou8oulvlulicw.R.inc(11501);LOG.warning("Unknown NAL unit type: " + nalUnitHeader.nal_unit_type);

            }


        }
        }__CLR4_5_28ou8oulvlulicw.R.inc(11502);if ((((buffered.size() > 0)&&(__CLR4_5_28ou8oulvlulicw.R.iget(11503)!=0|true))||(__CLR4_5_28ou8oulvlulicw.R.iget(11504)==0&false))) {{
            __CLR4_5_28ou8oulvlulicw.R.inc(11505);createSample(buffered);
        }
        }__CLR4_5_28ou8oulvlulicw.R.inc(11506);calcCtts();

        __CLR4_5_28ou8oulvlulicw.R.inc(11507);decodingTimes = new long[samples.size()];
        __CLR4_5_28ou8oulvlulicw.R.inc(11508);Arrays.fill(decodingTimes, frametick);


        __CLR4_5_28ou8oulvlulicw.R.inc(11509);return true;
    }finally{__CLR4_5_28ou8oulvlulicw.R.flushNeeded();}}

    public void calcCtts() {try{__CLR4_5_28ou8oulvlulicw.R.inc(11510);

        __CLR4_5_28ou8oulvlulicw.R.inc(11511);int pTime = 0;
        __CLR4_5_28ou8oulvlulicw.R.inc(11512);int lastPoc = -1;
        __CLR4_5_28ou8oulvlulicw.R.inc(11513);for (int j = 0; (((j < pictureOrderCounts.length)&&(__CLR4_5_28ou8oulvlulicw.R.iget(11514)!=0|true))||(__CLR4_5_28ou8oulvlulicw.R.iget(11515)==0&false)); j++) {{
            __CLR4_5_28ou8oulvlulicw.R.inc(11516);int minIndex = 0;
            __CLR4_5_28ou8oulvlulicw.R.inc(11517);int minValue = Integer.MAX_VALUE;
            __CLR4_5_28ou8oulvlulicw.R.inc(11518);for (int i = Math.max(0, j - 128); (((i < Math.min(pictureOrderCounts.length, j + 128))&&(__CLR4_5_28ou8oulvlulicw.R.iget(11519)!=0|true))||(__CLR4_5_28ou8oulvlulicw.R.iget(11520)==0&false)); i++) {{
                __CLR4_5_28ou8oulvlulicw.R.inc(11521);if ((((pictureOrderCounts[i] > lastPoc && pictureOrderCounts[i] < minValue)&&(__CLR4_5_28ou8oulvlulicw.R.iget(11522)!=0|true))||(__CLR4_5_28ou8oulvlulicw.R.iget(11523)==0&false))) {{
                    __CLR4_5_28ou8oulvlulicw.R.inc(11524);minIndex = i;
                    __CLR4_5_28ou8oulvlulicw.R.inc(11525);minValue = pictureOrderCounts[i];
                }
            }}
            }__CLR4_5_28ou8oulvlulicw.R.inc(11526);lastPoc = pictureOrderCounts[minIndex];
            __CLR4_5_28ou8oulvlulicw.R.inc(11527);pictureOrderCounts[minIndex] = pTime++;
        }
        }__CLR4_5_28ou8oulvlulicw.R.inc(11528);for (int i = 0; (((i < pictureOrderCounts.length)&&(__CLR4_5_28ou8oulvlulicw.R.iget(11529)!=0|true))||(__CLR4_5_28ou8oulvlulicw.R.iget(11530)==0&false)); i++) {{
            __CLR4_5_28ou8oulvlulicw.R.inc(11531);ctts.add(new CompositionTimeToSample.Entry(1, pictureOrderCounts[i] - i));
        }

        }__CLR4_5_28ou8oulvlulicw.R.inc(11532);pictureOrderCounts = new int[0];
    }finally{__CLR4_5_28ou8oulvlulicw.R.flushNeeded();}}

    private void createSample(List<ByteBuffer> buffered) throws IOException {try{__CLR4_5_28ou8oulvlulicw.R.inc(11533);

        __CLR4_5_28ou8oulvlulicw.R.inc(11534);SampleDependencyTypeBox.Entry sampleDependency = new SampleDependencyTypeBox.Entry(0);

        __CLR4_5_28ou8oulvlulicw.R.inc(11535);boolean IdrPicFlag = false;
        __CLR4_5_28ou8oulvlulicw.R.inc(11536);H264NalUnitHeader nu = null;
        __CLR4_5_28ou8oulvlulicw.R.inc(11537);for (ByteBuffer nal : buffered) {{
            __CLR4_5_28ou8oulvlulicw.R.inc(11538);H264NalUnitHeader _nu = getNalUnitHeader(nal);

            boolean __CLB4_5_2_bool1=false;__CLR4_5_28ou8oulvlulicw.R.inc(11539);switch (_nu.nal_unit_type) {
                case H264NalUnitTypes.CODED_SLICE_IDR:if (!__CLB4_5_2_bool1) {__CLR4_5_28ou8oulvlulicw.R.inc(11540);__CLB4_5_2_bool1=true;}
                    __CLR4_5_28ou8oulvlulicw.R.inc(11541);IdrPicFlag = true;
                case H264NalUnitTypes.CODED_SLICE_NON_IDR:if (!__CLB4_5_2_bool1) {__CLR4_5_28ou8oulvlulicw.R.inc(11542);__CLB4_5_2_bool1=true;}
                case H264NalUnitTypes.CODED_SLICE_DATA_PART_A:if (!__CLB4_5_2_bool1) {__CLR4_5_28ou8oulvlulicw.R.inc(11543);__CLB4_5_2_bool1=true;}
                case H264NalUnitTypes.CODED_SLICE_DATA_PART_B:if (!__CLB4_5_2_bool1) {__CLR4_5_28ou8oulvlulicw.R.inc(11544);__CLB4_5_2_bool1=true;}
                case H264NalUnitTypes.CODED_SLICE_DATA_PART_C:if (!__CLB4_5_2_bool1) {__CLR4_5_28ou8oulvlulicw.R.inc(11545);__CLB4_5_2_bool1=true;}
                    __CLR4_5_28ou8oulvlulicw.R.inc(11546);nu = _nu;
            }
        }
        }__CLR4_5_28ou8oulvlulicw.R.inc(11547);if ((((nu == null)&&(__CLR4_5_28ou8oulvlulicw.R.iget(11548)!=0|true))||(__CLR4_5_28ou8oulvlulicw.R.iget(11549)==0&false))) {{
            __CLR4_5_28ou8oulvlulicw.R.inc(11550);LOG.warning("Sample without Slice");
            __CLR4_5_28ou8oulvlulicw.R.inc(11551);return;
        }

        }__CLR4_5_28ou8oulvlulicw.R.inc(11552);if ((((IdrPicFlag)&&(__CLR4_5_28ou8oulvlulicw.R.iget(11553)!=0|true))||(__CLR4_5_28ou8oulvlulicw.R.iget(11554)==0&false))) {{
            __CLR4_5_28ou8oulvlulicw.R.inc(11555);calcCtts();
        }
        // cleans the buffer we just added
        }__CLR4_5_28ou8oulvlulicw.R.inc(11556);InputStream bs = cleanBuffer(new ByteBufferBackedInputStream(buffered.get(buffered.size() - 1)));
        __CLR4_5_28ou8oulvlulicw.R.inc(11557);SliceHeader sh = new SliceHeader(bs, spsIdToSps, ppsIdToPps, IdrPicFlag);

        __CLR4_5_28ou8oulvlulicw.R.inc(11558);if ((((nu.nal_ref_idc== 0)&&(__CLR4_5_28ou8oulvlulicw.R.iget(11559)!=0|true))||(__CLR4_5_28ou8oulvlulicw.R.iget(11560)==0&false))) {{
            __CLR4_5_28ou8oulvlulicw.R.inc(11561);sampleDependency.setSampleIsDependentOn(2);
        } }else {{
            __CLR4_5_28ou8oulvlulicw.R.inc(11562);sampleDependency.setSampleIsDependentOn(1);
        }
        }__CLR4_5_28ou8oulvlulicw.R.inc(11563);if (((((sh.slice_type == SliceHeader.SliceType.I) || (sh.slice_type == SliceHeader.SliceType.SI) )&&(__CLR4_5_28ou8oulvlulicw.R.iget(11564)!=0|true))||(__CLR4_5_28ou8oulvlulicw.R.iget(11565)==0&false))) {{
            __CLR4_5_28ou8oulvlulicw.R.inc(11566);sampleDependency.setSampleDependsOn(2);
        } }else {{
            __CLR4_5_28ou8oulvlulicw.R.inc(11567);sampleDependency.setSampleDependsOn(1);
        }
        }__CLR4_5_28ou8oulvlulicw.R.inc(11568);Sample bb = createSampleObject(buffered);
//                    LOG.fine("Adding sample with size " + bb.capacity() + " and header " + sh);
        __CLR4_5_28ou8oulvlulicw.R.inc(11569);buffered.clear();

        __CLR4_5_28ou8oulvlulicw.R.inc(11570);if ((((seiMessage == null || seiMessage.n_frames == 0)&&(__CLR4_5_28ou8oulvlulicw.R.iget(11571)!=0|true))||(__CLR4_5_28ou8oulvlulicw.R.iget(11572)==0&false))) {{
            __CLR4_5_28ou8oulvlulicw.R.inc(11573);frameNrInGop = 0;
        }
        }__CLR4_5_28ou8oulvlulicw.R.inc(11574);int offset = 0;
        __CLR4_5_28ou8oulvlulicw.R.inc(11575);if ((((sh.sps.pic_order_cnt_type == 0)&&(__CLR4_5_28ou8oulvlulicw.R.iget(11576)!=0|true))||(__CLR4_5_28ou8oulvlulicw.R.iget(11577)==0&false))) {{
            __CLR4_5_28ou8oulvlulicw.R.inc(11578);int max_pic_order_count_lsb = (1 << (sh.sps.log2_max_pic_order_cnt_lsb_minus4 + 4));
            // System.out.print(" pic_order_cnt_lsb " + pic_order_cnt_lsb + " " + max_pic_order_count);
            __CLR4_5_28ou8oulvlulicw.R.inc(11579);int picOrderCountLsb = sh.pic_order_cnt_lsb;
            __CLR4_5_28ou8oulvlulicw.R.inc(11580);int picOrderCntMsb = 0;
            __CLR4_5_28ou8oulvlulicw.R.inc(11581);if (((((picOrderCountLsb < prevPicOrderCntLsb) &&
                    ((prevPicOrderCntLsb - picOrderCountLsb) >= (max_pic_order_count_lsb / 2)))&&(__CLR4_5_28ou8oulvlulicw.R.iget(11582)!=0|true))||(__CLR4_5_28ou8oulvlulicw.R.iget(11583)==0&false))) {{
                __CLR4_5_28ou8oulvlulicw.R.inc(11584);picOrderCntMsb = prevPicOrderCntMsb + max_pic_order_count_lsb;
            } }else {__CLR4_5_28ou8oulvlulicw.R.inc(11585);if (((((picOrderCountLsb > prevPicOrderCntLsb) &&
                    ((picOrderCountLsb - prevPicOrderCntLsb) > (max_pic_order_count_lsb / 2)))&&(__CLR4_5_28ou8oulvlulicw.R.iget(11586)!=0|true))||(__CLR4_5_28ou8oulvlulicw.R.iget(11587)==0&false))) {{
                __CLR4_5_28ou8oulvlulicw.R.inc(11588);picOrderCntMsb = prevPicOrderCntMsb - max_pic_order_count_lsb;
            } }else {{
                __CLR4_5_28ou8oulvlulicw.R.inc(11589);picOrderCntMsb = prevPicOrderCntMsb;
            }

            }}__CLR4_5_28ou8oulvlulicw.R.inc(11590);pictureOrderCounts = Mp4Arrays.copyOfAndAppend(pictureOrderCounts, picOrderCntMsb + picOrderCountLsb);
            __CLR4_5_28ou8oulvlulicw.R.inc(11591);prevPicOrderCntLsb = picOrderCountLsb;
            __CLR4_5_28ou8oulvlulicw.R.inc(11592);prevPicOrderCntMsb = picOrderCntMsb;


        } }else {__CLR4_5_28ou8oulvlulicw.R.inc(11593);if ((((sh.sps.pic_order_cnt_type == 1)&&(__CLR4_5_28ou8oulvlulicw.R.iget(11594)!=0|true))||(__CLR4_5_28ou8oulvlulicw.R.iget(11595)==0&false))) {{
                /*if (seiMessage != null && seiMessage.clock_timestamp_flag) {
                    offset = seiMessage.n_frames - frameNrInGop;
                } else if (seiMessage != null && seiMessage.removal_delay_flag) {
                    offset = seiMessage.dpb_removal_delay / 2;
                }

                if (seiMessage == null) {
                    LOG.warning("CTS timing in ctts box is most likely not OK");
                }*/
            __CLR4_5_28ou8oulvlulicw.R.inc(11596);throw new RuntimeException("pic_order_cnt_type == 1 needs to be implemented");
        } }else {__CLR4_5_28ou8oulvlulicw.R.inc(11597);if ((((sh.sps.pic_order_cnt_type == 2)&&(__CLR4_5_28ou8oulvlulicw.R.iget(11598)!=0|true))||(__CLR4_5_28ou8oulvlulicw.R.iget(11599)==0&false))) {{
            __CLR4_5_28ou8oulvlulicw.R.inc(11600);pictureOrderCounts = Mp4Arrays.copyOfAndAppend(pictureOrderCounts, samples.size());
        }

        }}}__CLR4_5_28ou8oulvlulicw.R.inc(11601);sdtp.add(sampleDependency);
        __CLR4_5_28ou8oulvlulicw.R.inc(11602);frameNrInGop++;

        __CLR4_5_28ou8oulvlulicw.R.inc(11603);samples.add(bb);
        __CLR4_5_28ou8oulvlulicw.R.inc(11604);if ((((IdrPicFlag)&&(__CLR4_5_28ou8oulvlulicw.R.iget(11605)!=0|true))||(__CLR4_5_28ou8oulvlulicw.R.iget(11606)==0&false))) {{ // IDR Picture
            __CLR4_5_28ou8oulvlulicw.R.inc(11607);stss.add(samples.size());
        }
    }}finally{__CLR4_5_28ou8oulvlulicw.R.flushNeeded();}}

    private int calcPoc(int absFrameNum, H264NalUnitHeader nu, SliceHeader sh) {try{__CLR4_5_28ou8oulvlulicw.R.inc(11608);
        __CLR4_5_28ou8oulvlulicw.R.inc(11609);if ((((sh.sps.pic_order_cnt_type == 0)&&(__CLR4_5_28ou8oulvlulicw.R.iget(11610)!=0|true))||(__CLR4_5_28ou8oulvlulicw.R.iget(11611)==0&false))) {{
            __CLR4_5_28ou8oulvlulicw.R.inc(11612);return calcPOC0(nu, sh);
        } }else {__CLR4_5_28ou8oulvlulicw.R.inc(11613);if ((((sh.sps.pic_order_cnt_type == 1)&&(__CLR4_5_28ou8oulvlulicw.R.iget(11614)!=0|true))||(__CLR4_5_28ou8oulvlulicw.R.iget(11615)==0&false))) {{
            __CLR4_5_28ou8oulvlulicw.R.inc(11616);return calcPOC1(absFrameNum, nu, sh);
        } }else {{
            __CLR4_5_28ou8oulvlulicw.R.inc(11617);return calcPOC2(absFrameNum, nu, sh);
        }
    }}}finally{__CLR4_5_28ou8oulvlulicw.R.flushNeeded();}}

    private int calcPOC2(int absFrameNum, H264NalUnitHeader nu, SliceHeader sh) {try{__CLR4_5_28ou8oulvlulicw.R.inc(11618);

        __CLR4_5_28ou8oulvlulicw.R.inc(11619);if ((((nu.nal_ref_idc == 0)&&(__CLR4_5_28ou8oulvlulicw.R.iget(11620)!=0|true))||(__CLR4_5_28ou8oulvlulicw.R.iget(11621)==0&false)))
            {__CLR4_5_28ou8oulvlulicw.R.inc(11622);return 2 * absFrameNum - 1;
        }else
            {__CLR4_5_28ou8oulvlulicw.R.inc(11623);return 2 * absFrameNum;
    }}finally{__CLR4_5_28ou8oulvlulicw.R.flushNeeded();}}

    private int calcPOC1(int absFrameNum, H264NalUnitHeader nu, SliceHeader sh) {try{__CLR4_5_28ou8oulvlulicw.R.inc(11624);

        __CLR4_5_28ou8oulvlulicw.R.inc(11625);if ((((sh.sps.num_ref_frames_in_pic_order_cnt_cycle == 0)&&(__CLR4_5_28ou8oulvlulicw.R.iget(11626)!=0|true))||(__CLR4_5_28ou8oulvlulicw.R.iget(11627)==0&false)))
            {__CLR4_5_28ou8oulvlulicw.R.inc(11628);absFrameNum = 0;
        }__CLR4_5_28ou8oulvlulicw.R.inc(11629);if ((((nu.nal_ref_idc == 0 && absFrameNum > 0)&&(__CLR4_5_28ou8oulvlulicw.R.iget(11630)!=0|true))||(__CLR4_5_28ou8oulvlulicw.R.iget(11631)==0&false)))
            {__CLR4_5_28ou8oulvlulicw.R.inc(11632);absFrameNum = absFrameNum - 1;

        }__CLR4_5_28ou8oulvlulicw.R.inc(11633);int expectedDeltaPerPicOrderCntCycle = 0;
        __CLR4_5_28ou8oulvlulicw.R.inc(11634);for (int i = 0; (((i < sh.sps.num_ref_frames_in_pic_order_cnt_cycle)&&(__CLR4_5_28ou8oulvlulicw.R.iget(11635)!=0|true))||(__CLR4_5_28ou8oulvlulicw.R.iget(11636)==0&false)); i++)
            {__CLR4_5_28ou8oulvlulicw.R.inc(11637);expectedDeltaPerPicOrderCntCycle += sh.sps.offsetForRefFrame[i];

        }__CLR4_5_28ou8oulvlulicw.R.inc(11638);int expectedPicOrderCnt;
        __CLR4_5_28ou8oulvlulicw.R.inc(11639);if ((((absFrameNum > 0)&&(__CLR4_5_28ou8oulvlulicw.R.iget(11640)!=0|true))||(__CLR4_5_28ou8oulvlulicw.R.iget(11641)==0&false))) {{
            __CLR4_5_28ou8oulvlulicw.R.inc(11642);int picOrderCntCycleCnt = (absFrameNum - 1) / sh.sps.num_ref_frames_in_pic_order_cnt_cycle;
            __CLR4_5_28ou8oulvlulicw.R.inc(11643);int frameNumInPicOrderCntCycle = (absFrameNum - 1) % sh.sps.num_ref_frames_in_pic_order_cnt_cycle;

            __CLR4_5_28ou8oulvlulicw.R.inc(11644);expectedPicOrderCnt = picOrderCntCycleCnt * expectedDeltaPerPicOrderCntCycle;
            __CLR4_5_28ou8oulvlulicw.R.inc(11645);for (int i = 0; (((i <= frameNumInPicOrderCntCycle)&&(__CLR4_5_28ou8oulvlulicw.R.iget(11646)!=0|true))||(__CLR4_5_28ou8oulvlulicw.R.iget(11647)==0&false)); i++)
                {__CLR4_5_28ou8oulvlulicw.R.inc(11648);expectedPicOrderCnt = expectedPicOrderCnt + sh.sps.offsetForRefFrame[i];
        }} }else {{
            __CLR4_5_28ou8oulvlulicw.R.inc(11649);expectedPicOrderCnt = 0;
        }
        }__CLR4_5_28ou8oulvlulicw.R.inc(11650);if ((((nu.nal_ref_idc == 0)&&(__CLR4_5_28ou8oulvlulicw.R.iget(11651)!=0|true))||(__CLR4_5_28ou8oulvlulicw.R.iget(11652)==0&false)))
            {__CLR4_5_28ou8oulvlulicw.R.inc(11653);expectedPicOrderCnt = expectedPicOrderCnt + sh.sps.offset_for_non_ref_pic;

        }__CLR4_5_28ou8oulvlulicw.R.inc(11654);return expectedPicOrderCnt + sh.delta_pic_order_cnt_0;
    }finally{__CLR4_5_28ou8oulvlulicw.R.flushNeeded();}}

    private int calcPOC0(H264NalUnitHeader nu, SliceHeader sh) {try{__CLR4_5_28ou8oulvlulicw.R.inc(11655);

        __CLR4_5_28ou8oulvlulicw.R.inc(11656);int pocCntLsb = sh.pic_order_cnt_lsb;
        __CLR4_5_28ou8oulvlulicw.R.inc(11657);int maxPicOrderCntLsb = 1 << (sh.sps.log2_max_pic_order_cnt_lsb_minus4 + 4);

        // TODO prevPicOrderCntMsb should be wrapped!!
        __CLR4_5_28ou8oulvlulicw.R.inc(11658);int picOrderCntMsb;
        __CLR4_5_28ou8oulvlulicw.R.inc(11659);if (((((pocCntLsb < prevPicOrderCntLsb) && ((prevPicOrderCntLsb - pocCntLsb) >= (maxPicOrderCntLsb / 2)))&&(__CLR4_5_28ou8oulvlulicw.R.iget(11660)!=0|true))||(__CLR4_5_28ou8oulvlulicw.R.iget(11661)==0&false)))
            {__CLR4_5_28ou8oulvlulicw.R.inc(11662);picOrderCntMsb = prevPicOrderCntMsb + maxPicOrderCntLsb;
        }else {__CLR4_5_28ou8oulvlulicw.R.inc(11663);if (((((pocCntLsb > prevPicOrderCntLsb) && ((pocCntLsb - prevPicOrderCntLsb) > (maxPicOrderCntLsb / 2)))&&(__CLR4_5_28ou8oulvlulicw.R.iget(11664)!=0|true))||(__CLR4_5_28ou8oulvlulicw.R.iget(11665)==0&false)))
            {__CLR4_5_28ou8oulvlulicw.R.inc(11666);picOrderCntMsb = prevPicOrderCntMsb - maxPicOrderCntLsb;
        }else
            {__CLR4_5_28ou8oulvlulicw.R.inc(11667);picOrderCntMsb = prevPicOrderCntMsb;

        }}__CLR4_5_28ou8oulvlulicw.R.inc(11668);if ((((nu.nal_ref_idc != 0)&&(__CLR4_5_28ou8oulvlulicw.R.iget(11669)!=0|true))||(__CLR4_5_28ou8oulvlulicw.R.iget(11670)==0&false))) {{
            __CLR4_5_28ou8oulvlulicw.R.inc(11671);prevPicOrderCntMsb = picOrderCntMsb;
            __CLR4_5_28ou8oulvlulicw.R.inc(11672);prevPicOrderCntLsb = pocCntLsb;
        }

        }__CLR4_5_28ou8oulvlulicw.R.inc(11673);return picOrderCntMsb + pocCntLsb;
    }finally{__CLR4_5_28ou8oulvlulicw.R.flushNeeded();}}

    private void handlePPS(ByteBuffer data) throws IOException {try{__CLR4_5_28ou8oulvlulicw.R.inc(11674);
        __CLR4_5_28ou8oulvlulicw.R.inc(11675);InputStream is = new ByteBufferBackedInputStream(data);
        __CLR4_5_28ou8oulvlulicw.R.inc(11676);is.read();

        __CLR4_5_28ou8oulvlulicw.R.inc(11677);PictureParameterSet _pictureParameterSet = PictureParameterSet.read(is);
        __CLR4_5_28ou8oulvlulicw.R.inc(11678);if ((((firstPictureParameterSet == null)&&(__CLR4_5_28ou8oulvlulicw.R.iget(11679)!=0|true))||(__CLR4_5_28ou8oulvlulicw.R.iget(11680)==0&false))) {{
            __CLR4_5_28ou8oulvlulicw.R.inc(11681);firstPictureParameterSet = _pictureParameterSet;
        }

        }__CLR4_5_28ou8oulvlulicw.R.inc(11682);currentPictureParameterSet = _pictureParameterSet;

        __CLR4_5_28ou8oulvlulicw.R.inc(11683);byte[] ppsBytes = toArray((ByteBuffer) data.rewind());
        __CLR4_5_28ou8oulvlulicw.R.inc(11684);byte[] oldPpsSameId = ppsIdToPpsBytes.get(_pictureParameterSet.pic_parameter_set_id);


        __CLR4_5_28ou8oulvlulicw.R.inc(11685);if ((((oldPpsSameId != null && !Arrays.equals(oldPpsSameId, ppsBytes))&&(__CLR4_5_28ou8oulvlulicw.R.iget(11686)!=0|true))||(__CLR4_5_28ou8oulvlulicw.R.iget(11687)==0&false))) {{
            __CLR4_5_28ou8oulvlulicw.R.inc(11688);throw new RuntimeException("OMG - I got two SPS with same ID but different settings! (AVC3 is the solution)");
        } }else {{
            __CLR4_5_28ou8oulvlulicw.R.inc(11689);if ((((oldPpsSameId == null)&&(__CLR4_5_28ou8oulvlulicw.R.iget(11690)!=0|true))||(__CLR4_5_28ou8oulvlulicw.R.iget(11691)==0&false))) {{
                __CLR4_5_28ou8oulvlulicw.R.inc(11692);pictureParameterRangeMap.put(samples.size(), ppsBytes);
            }
            }__CLR4_5_28ou8oulvlulicw.R.inc(11693);ppsIdToPpsBytes.put(_pictureParameterSet.pic_parameter_set_id, ppsBytes);
            __CLR4_5_28ou8oulvlulicw.R.inc(11694);ppsIdToPps.put(_pictureParameterSet.pic_parameter_set_id, _pictureParameterSet);
        }


    }}finally{__CLR4_5_28ou8oulvlulicw.R.flushNeeded();}}

    private void handleSPS(ByteBuffer data) throws IOException {try{__CLR4_5_28ou8oulvlulicw.R.inc(11695);
        __CLR4_5_28ou8oulvlulicw.R.inc(11696);InputStream spsInputStream = cleanBuffer(new ByteBufferBackedInputStream(data));
        __CLR4_5_28ou8oulvlulicw.R.inc(11697);spsInputStream.read();
        __CLR4_5_28ou8oulvlulicw.R.inc(11698);SeqParameterSet _seqParameterSet = SeqParameterSet.read(spsInputStream);
        __CLR4_5_28ou8oulvlulicw.R.inc(11699);if ((((firstSeqParameterSet == null)&&(__CLR4_5_28ou8oulvlulicw.R.iget(11700)!=0|true))||(__CLR4_5_28ou8oulvlulicw.R.iget(11701)==0&false))) {{
            __CLR4_5_28ou8oulvlulicw.R.inc(11702);firstSeqParameterSet = _seqParameterSet;
            __CLR4_5_28ou8oulvlulicw.R.inc(11703);configureFramerate();
        }
        }__CLR4_5_28ou8oulvlulicw.R.inc(11704);currentSeqParameterSet = _seqParameterSet;

        __CLR4_5_28ou8oulvlulicw.R.inc(11705);byte[] spsBytes = toArray((ByteBuffer) data.rewind());
        __CLR4_5_28ou8oulvlulicw.R.inc(11706);byte[] oldSpsSameId = spsIdToSpsBytes.get(_seqParameterSet.seq_parameter_set_id);
        __CLR4_5_28ou8oulvlulicw.R.inc(11707);if ((((oldSpsSameId != null && !Arrays.equals(oldSpsSameId, spsBytes))&&(__CLR4_5_28ou8oulvlulicw.R.iget(11708)!=0|true))||(__CLR4_5_28ou8oulvlulicw.R.iget(11709)==0&false))) {{
            __CLR4_5_28ou8oulvlulicw.R.inc(11710);throw new RuntimeException("OMG - I got two SPS with same ID but different settings!");
        } }else {{
            __CLR4_5_28ou8oulvlulicw.R.inc(11711);if ((((oldSpsSameId != null)&&(__CLR4_5_28ou8oulvlulicw.R.iget(11712)!=0|true))||(__CLR4_5_28ou8oulvlulicw.R.iget(11713)==0&false))) {{
                __CLR4_5_28ou8oulvlulicw.R.inc(11714);seqParameterRangeMap.put(samples.size(), spsBytes);
            }
            }__CLR4_5_28ou8oulvlulicw.R.inc(11715);spsIdToSpsBytes.put(_seqParameterSet.seq_parameter_set_id, spsBytes);
            __CLR4_5_28ou8oulvlulicw.R.inc(11716);spsIdToSps.put(_seqParameterSet.seq_parameter_set_id, _seqParameterSet);

        }


    }}finally{__CLR4_5_28ou8oulvlulicw.R.flushNeeded();}}

    private void configureFramerate() {try{__CLR4_5_28ou8oulvlulicw.R.inc(11717);
        __CLR4_5_28ou8oulvlulicw.R.inc(11718);if ((((determineFrameRate)&&(__CLR4_5_28ou8oulvlulicw.R.iget(11719)!=0|true))||(__CLR4_5_28ou8oulvlulicw.R.iget(11720)==0&false))) {{
            __CLR4_5_28ou8oulvlulicw.R.inc(11721);if ((((firstSeqParameterSet.vuiParams != null)&&(__CLR4_5_28ou8oulvlulicw.R.iget(11722)!=0|true))||(__CLR4_5_28ou8oulvlulicw.R.iget(11723)==0&false))) {{
                __CLR4_5_28ou8oulvlulicw.R.inc(11724);timescale = firstSeqParameterSet.vuiParams.time_scale >> 1; // Not sure why, but I found this in several places, and it works...
                __CLR4_5_28ou8oulvlulicw.R.inc(11725);frametick = firstSeqParameterSet.vuiParams.num_units_in_tick;
                __CLR4_5_28ou8oulvlulicw.R.inc(11726);if ((((timescale == 0 || frametick == 0)&&(__CLR4_5_28ou8oulvlulicw.R.iget(11727)!=0|true))||(__CLR4_5_28ou8oulvlulicw.R.iget(11728)==0&false))) {{
                    __CLR4_5_28ou8oulvlulicw.R.inc(11729);LOG.warning("vuiParams contain invalid values: time_scale: " + timescale + " and frame_tick: " + frametick + ". Setting frame rate to 25fps");
                    __CLR4_5_28ou8oulvlulicw.R.inc(11730);timescale = 90000;
                    __CLR4_5_28ou8oulvlulicw.R.inc(11731);frametick = 3600;
                }

                }__CLR4_5_28ou8oulvlulicw.R.inc(11732);if ((((timescale / frametick > 100)&&(__CLR4_5_28ou8oulvlulicw.R.iget(11733)!=0|true))||(__CLR4_5_28ou8oulvlulicw.R.iget(11734)==0&false))) {{
                    __CLR4_5_28ou8oulvlulicw.R.inc(11735);LOG.warning("Framerate is " + (timescale / frametick) + ". That is suspicious.");
                }
            }} }else {{
                __CLR4_5_28ou8oulvlulicw.R.inc(11736);LOG.warning("Can't determine frame rate. Guessing 25 fps");
                __CLR4_5_28ou8oulvlulicw.R.inc(11737);timescale = 90000;
                __CLR4_5_28ou8oulvlulicw.R.inc(11738);frametick = 3600;
            }
        }}
    }}finally{__CLR4_5_28ou8oulvlulicw.R.flushNeeded();}}

    public class ByteBufferBackedInputStream extends InputStream {

        private final ByteBuffer buf;

        public ByteBufferBackedInputStream(ByteBuffer buf) {try{__CLR4_5_28ou8oulvlulicw.R.inc(11739);
            // make a coy of the buffer
            __CLR4_5_28ou8oulvlulicw.R.inc(11740);this.buf = buf.duplicate();
        }finally{__CLR4_5_28ou8oulvlulicw.R.flushNeeded();}}

        public int read() throws IOException {try{__CLR4_5_28ou8oulvlulicw.R.inc(11741);
            __CLR4_5_28ou8oulvlulicw.R.inc(11742);if ((((!buf.hasRemaining())&&(__CLR4_5_28ou8oulvlulicw.R.iget(11743)!=0|true))||(__CLR4_5_28ou8oulvlulicw.R.iget(11744)==0&false))) {{
                __CLR4_5_28ou8oulvlulicw.R.inc(11745);return -1;
            }
            }__CLR4_5_28ou8oulvlulicw.R.inc(11746);return buf.get() & 0xFF;
        }finally{__CLR4_5_28ou8oulvlulicw.R.flushNeeded();}}

        public int read(byte[] bytes, int off, int len)
                throws IOException {try{__CLR4_5_28ou8oulvlulicw.R.inc(11747);
            __CLR4_5_28ou8oulvlulicw.R.inc(11748);if ((((!buf.hasRemaining())&&(__CLR4_5_28ou8oulvlulicw.R.iget(11749)!=0|true))||(__CLR4_5_28ou8oulvlulicw.R.iget(11750)==0&false))) {{
                __CLR4_5_28ou8oulvlulicw.R.inc(11751);return -1;
            }

            }__CLR4_5_28ou8oulvlulicw.R.inc(11752);len = Math.min(len, buf.remaining());
            __CLR4_5_28ou8oulvlulicw.R.inc(11753);buf.get(bytes, off, len);
            __CLR4_5_28ou8oulvlulicw.R.inc(11754);return len;
        }finally{__CLR4_5_28ou8oulvlulicw.R.flushNeeded();}}
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

        public SEIMessage(InputStream is, SeqParameterSet sps) throws IOException {try{__CLR4_5_28ou8oulvlulicw.R.inc(11755);
            __CLR4_5_28ou8oulvlulicw.R.inc(11756);this.sps = sps;
            __CLR4_5_28ou8oulvlulicw.R.inc(11757);is.read();
            __CLR4_5_28ou8oulvlulicw.R.inc(11758);int datasize = is.available();
            __CLR4_5_28ou8oulvlulicw.R.inc(11759);int read = 0;
            __CLR4_5_28ou8oulvlulicw.R.inc(11760);while ((((read < datasize)&&(__CLR4_5_28ou8oulvlulicw.R.iget(11761)!=0|true))||(__CLR4_5_28ou8oulvlulicw.R.iget(11762)==0&false))) {{
                __CLR4_5_28ou8oulvlulicw.R.inc(11763);payloadType = 0;
                __CLR4_5_28ou8oulvlulicw.R.inc(11764);payloadSize = 0;
                __CLR4_5_28ou8oulvlulicw.R.inc(11765);int last_payload_type_bytes = is.read();
                __CLR4_5_28ou8oulvlulicw.R.inc(11766);read++;
                __CLR4_5_28ou8oulvlulicw.R.inc(11767);while ((((last_payload_type_bytes == 0xff)&&(__CLR4_5_28ou8oulvlulicw.R.iget(11768)!=0|true))||(__CLR4_5_28ou8oulvlulicw.R.iget(11769)==0&false))) {{
                    __CLR4_5_28ou8oulvlulicw.R.inc(11770);payloadType += last_payload_type_bytes;
                    __CLR4_5_28ou8oulvlulicw.R.inc(11771);last_payload_type_bytes = is.read();
                    __CLR4_5_28ou8oulvlulicw.R.inc(11772);read++;
                }
                }__CLR4_5_28ou8oulvlulicw.R.inc(11773);payloadType += last_payload_type_bytes;
                __CLR4_5_28ou8oulvlulicw.R.inc(11774);int last_payload_size_bytes = is.read();
                __CLR4_5_28ou8oulvlulicw.R.inc(11775);read++;

                __CLR4_5_28ou8oulvlulicw.R.inc(11776);while ((((last_payload_size_bytes == 0xff)&&(__CLR4_5_28ou8oulvlulicw.R.iget(11777)!=0|true))||(__CLR4_5_28ou8oulvlulicw.R.iget(11778)==0&false))) {{
                    __CLR4_5_28ou8oulvlulicw.R.inc(11779);payloadSize += last_payload_size_bytes;
                    __CLR4_5_28ou8oulvlulicw.R.inc(11780);last_payload_size_bytes = is.read();
                    __CLR4_5_28ou8oulvlulicw.R.inc(11781);read++;
                }
                }__CLR4_5_28ou8oulvlulicw.R.inc(11782);payloadSize += last_payload_size_bytes;
                __CLR4_5_28ou8oulvlulicw.R.inc(11783);if ((((datasize - read >= payloadSize)&&(__CLR4_5_28ou8oulvlulicw.R.iget(11784)!=0|true))||(__CLR4_5_28ou8oulvlulicw.R.iget(11785)==0&false))) {{
                    __CLR4_5_28ou8oulvlulicw.R.inc(11786);if ((((payloadType == 1)&&(__CLR4_5_28ou8oulvlulicw.R.iget(11787)!=0|true))||(__CLR4_5_28ou8oulvlulicw.R.iget(11788)==0&false))) {{ // pic_timing is what we are interested in!
                        __CLR4_5_28ou8oulvlulicw.R.inc(11789);if ((((sps.vuiParams != null && (sps.vuiParams.nalHRDParams != null || sps.vuiParams.vclHRDParams != null || sps.vuiParams.pic_struct_present_flag))&&(__CLR4_5_28ou8oulvlulicw.R.iget(11790)!=0|true))||(__CLR4_5_28ou8oulvlulicw.R.iget(11791)==0&false))) {{
                            __CLR4_5_28ou8oulvlulicw.R.inc(11792);byte[] data = new byte[payloadSize];
                            __CLR4_5_28ou8oulvlulicw.R.inc(11793);is.read(data);
                            __CLR4_5_28ou8oulvlulicw.R.inc(11794);read += payloadSize;
                            __CLR4_5_28ou8oulvlulicw.R.inc(11795);CAVLCReader reader = new CAVLCReader(new ByteArrayInputStream(data));
                            __CLR4_5_28ou8oulvlulicw.R.inc(11796);if ((((sps.vuiParams.nalHRDParams != null || sps.vuiParams.vclHRDParams != null)&&(__CLR4_5_28ou8oulvlulicw.R.iget(11797)!=0|true))||(__CLR4_5_28ou8oulvlulicw.R.iget(11798)==0&false))) {{
                                __CLR4_5_28ou8oulvlulicw.R.inc(11799);removal_delay_flag = true;
                                __CLR4_5_28ou8oulvlulicw.R.inc(11800);cpb_removal_delay = reader.readU(sps.vuiParams.nalHRDParams.cpb_removal_delay_length_minus1 + 1, "SEI: cpb_removal_delay");
                                __CLR4_5_28ou8oulvlulicw.R.inc(11801);dpb_removal_delay = reader.readU(sps.vuiParams.nalHRDParams.dpb_output_delay_length_minus1 + 1, "SEI: dpb_removal_delay");
                            } }else {{
                                __CLR4_5_28ou8oulvlulicw.R.inc(11802);removal_delay_flag = false;
                            }
                            }__CLR4_5_28ou8oulvlulicw.R.inc(11803);if ((((sps.vuiParams.pic_struct_present_flag)&&(__CLR4_5_28ou8oulvlulicw.R.iget(11804)!=0|true))||(__CLR4_5_28ou8oulvlulicw.R.iget(11805)==0&false))) {{
                                __CLR4_5_28ou8oulvlulicw.R.inc(11806);pic_struct = reader.readU(4, "SEI: pic_struct");
                                __CLR4_5_28ou8oulvlulicw.R.inc(11807);int numClockTS;
                                boolean __CLB4_5_2_bool2=false;__CLR4_5_28ou8oulvlulicw.R.inc(11808);switch (pic_struct) {
                                    case 0:if (!__CLB4_5_2_bool2) {__CLR4_5_28ou8oulvlulicw.R.inc(11809);__CLB4_5_2_bool2=true;}
                                    case 1:if (!__CLB4_5_2_bool2) {__CLR4_5_28ou8oulvlulicw.R.inc(11810);__CLB4_5_2_bool2=true;}
                                    case 2:if (!__CLB4_5_2_bool2) {__CLR4_5_28ou8oulvlulicw.R.inc(11811);__CLB4_5_2_bool2=true;}
                                    default:if (!__CLB4_5_2_bool2) {__CLR4_5_28ou8oulvlulicw.R.inc(11812);__CLB4_5_2_bool2=true;}
                                        __CLR4_5_28ou8oulvlulicw.R.inc(11813);numClockTS = 1;
                                        __CLR4_5_28ou8oulvlulicw.R.inc(11814);break;

                                    case 3:if (!__CLB4_5_2_bool2) {__CLR4_5_28ou8oulvlulicw.R.inc(11815);__CLB4_5_2_bool2=true;}
                                    case 4:if (!__CLB4_5_2_bool2) {__CLR4_5_28ou8oulvlulicw.R.inc(11816);__CLB4_5_2_bool2=true;}
                                    case 7:if (!__CLB4_5_2_bool2) {__CLR4_5_28ou8oulvlulicw.R.inc(11817);__CLB4_5_2_bool2=true;}
                                        __CLR4_5_28ou8oulvlulicw.R.inc(11818);numClockTS = 2;
                                        __CLR4_5_28ou8oulvlulicw.R.inc(11819);break;

                                    case 5:if (!__CLB4_5_2_bool2) {__CLR4_5_28ou8oulvlulicw.R.inc(11820);__CLB4_5_2_bool2=true;}
                                    case 6:if (!__CLB4_5_2_bool2) {__CLR4_5_28ou8oulvlulicw.R.inc(11821);__CLB4_5_2_bool2=true;}
                                    case 8:if (!__CLB4_5_2_bool2) {__CLR4_5_28ou8oulvlulicw.R.inc(11822);__CLB4_5_2_bool2=true;}
                                        __CLR4_5_28ou8oulvlulicw.R.inc(11823);numClockTS = 3;
                                        __CLR4_5_28ou8oulvlulicw.R.inc(11824);break;
                                }
                                __CLR4_5_28ou8oulvlulicw.R.inc(11825);for (int i = 0; (((i < numClockTS)&&(__CLR4_5_28ou8oulvlulicw.R.iget(11826)!=0|true))||(__CLR4_5_28ou8oulvlulicw.R.iget(11827)==0&false)); i++) {{
                                    __CLR4_5_28ou8oulvlulicw.R.inc(11828);clock_timestamp_flag = reader.readBool("pic_timing SEI: clock_timestamp_flag[" + i + "]");
                                    __CLR4_5_28ou8oulvlulicw.R.inc(11829);if ((((clock_timestamp_flag)&&(__CLR4_5_28ou8oulvlulicw.R.iget(11830)!=0|true))||(__CLR4_5_28ou8oulvlulicw.R.iget(11831)==0&false))) {{
                                        __CLR4_5_28ou8oulvlulicw.R.inc(11832);ct_type = reader.readU(2, "pic_timing SEI: ct_type");
                                        __CLR4_5_28ou8oulvlulicw.R.inc(11833);nuit_field_based_flag = reader.readU(1, "pic_timing SEI: nuit_field_based_flag");
                                        __CLR4_5_28ou8oulvlulicw.R.inc(11834);counting_type = reader.readU(5, "pic_timing SEI: counting_type");
                                        __CLR4_5_28ou8oulvlulicw.R.inc(11835);full_timestamp_flag = reader.readU(1, "pic_timing SEI: full_timestamp_flag");
                                        __CLR4_5_28ou8oulvlulicw.R.inc(11836);discontinuity_flag = reader.readU(1, "pic_timing SEI: discontinuity_flag");
                                        __CLR4_5_28ou8oulvlulicw.R.inc(11837);cnt_dropped_flag = reader.readU(1, "pic_timing SEI: cnt_dropped_flag");
                                        __CLR4_5_28ou8oulvlulicw.R.inc(11838);n_frames = reader.readU(8, "pic_timing SEI: n_frames");
                                        __CLR4_5_28ou8oulvlulicw.R.inc(11839);if ((((full_timestamp_flag == 1)&&(__CLR4_5_28ou8oulvlulicw.R.iget(11840)!=0|true))||(__CLR4_5_28ou8oulvlulicw.R.iget(11841)==0&false))) {{
                                            __CLR4_5_28ou8oulvlulicw.R.inc(11842);seconds_value = reader.readU(6, "pic_timing SEI: seconds_value");
                                            __CLR4_5_28ou8oulvlulicw.R.inc(11843);minutes_value = reader.readU(6, "pic_timing SEI: minutes_value");
                                            __CLR4_5_28ou8oulvlulicw.R.inc(11844);hours_value = reader.readU(5, "pic_timing SEI: hours_value");
                                        } }else {{
                                            __CLR4_5_28ou8oulvlulicw.R.inc(11845);if ((((reader.readBool("pic_timing SEI: seconds_flag"))&&(__CLR4_5_28ou8oulvlulicw.R.iget(11846)!=0|true))||(__CLR4_5_28ou8oulvlulicw.R.iget(11847)==0&false))) {{
                                                __CLR4_5_28ou8oulvlulicw.R.inc(11848);seconds_value = reader.readU(6, "pic_timing SEI: seconds_value");
                                                __CLR4_5_28ou8oulvlulicw.R.inc(11849);if ((((reader.readBool("pic_timing SEI: minutes_flag"))&&(__CLR4_5_28ou8oulvlulicw.R.iget(11850)!=0|true))||(__CLR4_5_28ou8oulvlulicw.R.iget(11851)==0&false))) {{
                                                    __CLR4_5_28ou8oulvlulicw.R.inc(11852);minutes_value = reader.readU(6, "pic_timing SEI: minutes_value");
                                                    __CLR4_5_28ou8oulvlulicw.R.inc(11853);if ((((reader.readBool("pic_timing SEI: hours_flag"))&&(__CLR4_5_28ou8oulvlulicw.R.iget(11854)!=0|true))||(__CLR4_5_28ou8oulvlulicw.R.iget(11855)==0&false))) {{
                                                        __CLR4_5_28ou8oulvlulicw.R.inc(11856);hours_value = reader.readU(5, "pic_timing SEI: hours_value");
                                                    }
                                                }}
                                            }}
                                        }}
                                        }__CLR4_5_28ou8oulvlulicw.R.inc(11857);if (true) {{
                                            __CLR4_5_28ou8oulvlulicw.R.inc(11858);if ((((sps.vuiParams.nalHRDParams != null)&&(__CLR4_5_28ou8oulvlulicw.R.iget(11859)!=0|true))||(__CLR4_5_28ou8oulvlulicw.R.iget(11860)==0&false))) {{
                                                __CLR4_5_28ou8oulvlulicw.R.inc(11861);time_offset_length = sps.vuiParams.nalHRDParams.time_offset_length;
                                            } }else {__CLR4_5_28ou8oulvlulicw.R.inc(11862);if ((((sps.vuiParams.vclHRDParams != null)&&(__CLR4_5_28ou8oulvlulicw.R.iget(11863)!=0|true))||(__CLR4_5_28ou8oulvlulicw.R.iget(11864)==0&false))) {{
                                                __CLR4_5_28ou8oulvlulicw.R.inc(11865);time_offset_length = sps.vuiParams.vclHRDParams.time_offset_length;
                                            } }else {{
                                                __CLR4_5_28ou8oulvlulicw.R.inc(11866);time_offset_length = 24;
                                            }
                                            }}__CLR4_5_28ou8oulvlulicw.R.inc(11867);time_offset = reader.readU(24, "pic_timing SEI: time_offset");
                                        }
                                    }}
                                }}
                            }}

                        }} }else {{
                            __CLR4_5_28ou8oulvlulicw.R.inc(11868);for (int i = 0; (((i < payloadSize)&&(__CLR4_5_28ou8oulvlulicw.R.iget(11869)!=0|true))||(__CLR4_5_28ou8oulvlulicw.R.iget(11870)==0&false)); i++) {{
                                __CLR4_5_28ou8oulvlulicw.R.inc(11871);is.read();
                                __CLR4_5_28ou8oulvlulicw.R.inc(11872);read++;
                            }
                        }}
                    }} }else {{
                        __CLR4_5_28ou8oulvlulicw.R.inc(11873);for (int i = 0; (((i < payloadSize)&&(__CLR4_5_28ou8oulvlulicw.R.iget(11874)!=0|true))||(__CLR4_5_28ou8oulvlulicw.R.iget(11875)==0&false)); i++) {{
                            __CLR4_5_28ou8oulvlulicw.R.inc(11876);is.read();
                            __CLR4_5_28ou8oulvlulicw.R.inc(11877);read++;
                        }
                    }}
                }} }else {{
                    __CLR4_5_28ou8oulvlulicw.R.inc(11878);read = datasize;
                }
                }__CLR4_5_28ou8oulvlulicw.R.inc(11879);LOG.fine(this.toString());
            }
        }}finally{__CLR4_5_28ou8oulvlulicw.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_5_28ou8oulvlulicw.R.inc(11880);
            __CLR4_5_28ou8oulvlulicw.R.inc(11881);String out = "SEIMessage{" +
                    "payloadType=" + payloadType +
                    ", payloadSize=" + payloadSize;
            __CLR4_5_28ou8oulvlulicw.R.inc(11882);if ((((payloadType == 1)&&(__CLR4_5_28ou8oulvlulicw.R.iget(11883)!=0|true))||(__CLR4_5_28ou8oulvlulicw.R.iget(11884)==0&false))) {{
                __CLR4_5_28ou8oulvlulicw.R.inc(11885);if ((((sps.vuiParams.nalHRDParams != null || sps.vuiParams.vclHRDParams != null)&&(__CLR4_5_28ou8oulvlulicw.R.iget(11886)!=0|true))||(__CLR4_5_28ou8oulvlulicw.R.iget(11887)==0&false))) {{

                    __CLR4_5_28ou8oulvlulicw.R.inc(11888);out += ", cpb_removal_delay=" + cpb_removal_delay +
                            ", dpb_removal_delay=" + dpb_removal_delay;
                }
                }__CLR4_5_28ou8oulvlulicw.R.inc(11889);if ((((sps.vuiParams.pic_struct_present_flag)&&(__CLR4_5_28ou8oulvlulicw.R.iget(11890)!=0|true))||(__CLR4_5_28ou8oulvlulicw.R.iget(11891)==0&false))) {{
                    __CLR4_5_28ou8oulvlulicw.R.inc(11892);out += ", pic_struct=" + pic_struct;
                    __CLR4_5_28ou8oulvlulicw.R.inc(11893);if ((((clock_timestamp_flag)&&(__CLR4_5_28ou8oulvlulicw.R.iget(11894)!=0|true))||(__CLR4_5_28ou8oulvlulicw.R.iget(11895)==0&false))) {{
                        __CLR4_5_28ou8oulvlulicw.R.inc(11896);out += ", ct_type=" + ct_type +
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
            }__CLR4_5_28ou8oulvlulicw.R.inc(11897);out += '}';
            __CLR4_5_28ou8oulvlulicw.R.inc(11898);return out;
        }finally{__CLR4_5_28ou8oulvlulicw.R.flushNeeded();}}
    }

}
