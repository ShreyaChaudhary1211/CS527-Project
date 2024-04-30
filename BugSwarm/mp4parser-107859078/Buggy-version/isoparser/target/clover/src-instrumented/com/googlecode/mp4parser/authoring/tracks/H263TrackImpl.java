/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.Hex;
import com.coremedia.iso.IsoFile;
import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.boxes.Container;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.sampleentry.VisualSampleEntry;
import com.googlecode.mp4parser.DataSource;
import com.googlecode.mp4parser.FileDataSourceImpl;
import com.googlecode.mp4parser.MultiFileDataSourceImpl;
import com.googlecode.mp4parser.authoring.Movie;
import com.googlecode.mp4parser.authoring.Sample;
import com.googlecode.mp4parser.authoring.SampleImpl;
import com.googlecode.mp4parser.authoring.Track;
import com.googlecode.mp4parser.authoring.builder.DefaultMp4Builder;
import com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.*;
import com.googlecode.mp4parser.util.Mp4Arrays;
import com.googlecode.mp4parser.util.Path;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

import static com.googlecode.mp4parser.util.CastUtils.l2i;

/**
 * Created by sannies on 26.04.2015.
 */
public class H263TrackImpl extends AbstractH26XTrack {public static class __CLR4_5_286n86nlvl9eifo{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,10808,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static Logger LOG = Logger.getLogger(ESDescriptor.class.getName());

    int RECTANGULAR = 0;
    int BINARY = 1;
    int BINARY_ONLY = 2;
    int GRAYSCALE = 3;

    SampleDescriptionBox stsd;


    List<Sample> samples = new ArrayList<Sample>();
    List<ByteBuffer> esdsStuff = new ArrayList<ByteBuffer>();
    boolean esdsComplete = false;
    int fixed_vop_time_increment = -1;
    int vop_time_increment_resolution = 0;

    public H263TrackImpl(DataSource dataSource) throws IOException {
        super(dataSource, false);__CLR4_5_286n86nlvl9eifo.R.inc(10608);try{__CLR4_5_286n86nlvl9eifo.R.inc(10607);
        __CLR4_5_286n86nlvl9eifo.R.inc(10609);LookAhead la = new LookAhead(dataSource);
        __CLR4_5_286n86nlvl9eifo.R.inc(10610);ByteBuffer nal;
        __CLR4_5_286n86nlvl9eifo.R.inc(10611);List<ByteBuffer> nalsInSample = new ArrayList<ByteBuffer>();
        __CLR4_5_286n86nlvl9eifo.R.inc(10612);int visual_object_verid = 0;

        __CLR4_5_286n86nlvl9eifo.R.inc(10613);VisualSampleEntry mp4v = new VisualSampleEntry("mp4v");
        __CLR4_5_286n86nlvl9eifo.R.inc(10614);stsd = new SampleDescriptionBox();
        __CLR4_5_286n86nlvl9eifo.R.inc(10615);stsd.addBox(mp4v);

        __CLR4_5_286n86nlvl9eifo.R.inc(10616);long last_sync_point = 0;
        __CLR4_5_286n86nlvl9eifo.R.inc(10617);long last_time_code = -1;

        __CLR4_5_286n86nlvl9eifo.R.inc(10618);while ((nal = findNextNal(la)) != null) {{
            __CLR4_5_286n86nlvl9eifo.R.inc(10621);ByteBuffer origNal = nal.duplicate();
            __CLR4_5_286n86nlvl9eifo.R.inc(10622);int type = IsoTypeReader.readUInt8(nal);
            __CLR4_5_286n86nlvl9eifo.R.inc(10623);if ((((((type == 0xb0) || // visual_object_sequence_start_code
                    (type == 0xb5) || // visual_object_start_code
                    (type == 0x00) || // video_object_start_code
                    (type == 0x20) || // video_object_layer_start_code
                    (type == 0xb2)) // user_data_start_code
                    )&&(__CLR4_5_286n86nlvl9eifo.R.iget(10624)!=0|true))||(__CLR4_5_286n86nlvl9eifo.R.iget(10625)==0&false))) {{
                __CLR4_5_286n86nlvl9eifo.R.inc(10626);if ((((!esdsComplete)&&(__CLR4_5_286n86nlvl9eifo.R.iget(10627)!=0|true))||(__CLR4_5_286n86nlvl9eifo.R.iget(10628)==0&false))) {{
                    __CLR4_5_286n86nlvl9eifo.R.inc(10629);esdsStuff.add(origNal);

                    __CLR4_5_286n86nlvl9eifo.R.inc(10630);if ((((type == 0x20)&&(__CLR4_5_286n86nlvl9eifo.R.iget(10631)!=0|true))||(__CLR4_5_286n86nlvl9eifo.R.iget(10632)==0&false))) {{
                        __CLR4_5_286n86nlvl9eifo.R.inc(10633);parse0x20Unit(nal, visual_object_verid, mp4v);
                    } }else {__CLR4_5_286n86nlvl9eifo.R.inc(10634);if ((((type == 0xb5)&&(__CLR4_5_286n86nlvl9eifo.R.iget(10635)!=0|true))||(__CLR4_5_286n86nlvl9eifo.R.iget(10636)==0&false))) {{
                        __CLR4_5_286n86nlvl9eifo.R.inc(10637);visual_object_verid = parse0x05Unit(nal);
                    }
                }}}
            }} }else {__CLR4_5_286n86nlvl9eifo.R.inc(10638);if ((((type == 0xb3)&&(__CLR4_5_286n86nlvl9eifo.R.iget(10639)!=0|true))||(__CLR4_5_286n86nlvl9eifo.R.iget(10640)==0&false))) {{ // group_of_vop_start_code
                __CLR4_5_286n86nlvl9eifo.R.inc(10641);esdsComplete = true;
                __CLR4_5_286n86nlvl9eifo.R.inc(10642);BitReaderBuffer bitReaderBuffer = new BitReaderBuffer(nal);
                __CLR4_5_286n86nlvl9eifo.R.inc(10643);int time_code = bitReaderBuffer.readBits(18);
                __CLR4_5_286n86nlvl9eifo.R.inc(10644);last_sync_point = ((time_code & 0x3f) + ((time_code >>> 7 & 0x3f) * 60) + ((time_code >>> 13 & 0x1f) * 60 * 60));
                __CLR4_5_286n86nlvl9eifo.R.inc(10645);stss.add(samples.size() + 1);
                __CLR4_5_286n86nlvl9eifo.R.inc(10646);nalsInSample.add(origNal);
            } }else {__CLR4_5_286n86nlvl9eifo.R.inc(10647);if ((((type == 0xb6)&&(__CLR4_5_286n86nlvl9eifo.R.iget(10648)!=0|true))||(__CLR4_5_286n86nlvl9eifo.R.iget(10649)==0&false))) {{ // vop_start_code
                __CLR4_5_286n86nlvl9eifo.R.inc(10650);BitReaderBuffer brb = new BitReaderBuffer(nal);
                __CLR4_5_286n86nlvl9eifo.R.inc(10651);int vop_coding_type = brb.readBits(2);
                __CLR4_5_286n86nlvl9eifo.R.inc(10652);while ((((brb.readBool())&&(__CLR4_5_286n86nlvl9eifo.R.iget(10653)!=0|true))||(__CLR4_5_286n86nlvl9eifo.R.iget(10654)==0&false))) {{
                    __CLR4_5_286n86nlvl9eifo.R.inc(10655);last_sync_point++;
                }
                }__CLR4_5_286n86nlvl9eifo.R.inc(10656);boolean marker_bit = brb.readBool();
                __CLR4_5_286n86nlvl9eifo.R.inc(10657);int i = 0;
                __CLR4_5_286n86nlvl9eifo.R.inc(10658);while ((((vop_time_increment_resolution >= (1 << i))&&(__CLR4_5_286n86nlvl9eifo.R.iget(10659)!=0|true))||(__CLR4_5_286n86nlvl9eifo.R.iget(10660)==0&false))) {{
                    __CLR4_5_286n86nlvl9eifo.R.inc(10661);i++;
                }
                }__CLR4_5_286n86nlvl9eifo.R.inc(10662);int vop_time_increment = brb.readBits(i);
                __CLR4_5_286n86nlvl9eifo.R.inc(10663);long time_code = (last_sync_point * vop_time_increment_resolution + (vop_time_increment % vop_time_increment_resolution));
                __CLR4_5_286n86nlvl9eifo.R.inc(10664);if ((((last_time_code != -1)&&(__CLR4_5_286n86nlvl9eifo.R.iget(10665)!=0|true))||(__CLR4_5_286n86nlvl9eifo.R.iget(10666)==0&false))) {{
                    __CLR4_5_286n86nlvl9eifo.R.inc(10667);decodingTimes = Mp4Arrays.copyOfAndAppend(decodingTimes, new long[]{time_code - last_time_code});
                }
                }__CLR4_5_286n86nlvl9eifo.R.inc(10668);System.err.println("Frame increment: " + (time_code - last_time_code) + " vop time increment: " + vop_time_increment + " last_sync_point: " + last_sync_point + " time_code: " + time_code);
                __CLR4_5_286n86nlvl9eifo.R.inc(10669);last_time_code = time_code;
                __CLR4_5_286n86nlvl9eifo.R.inc(10670);nalsInSample.add(origNal);
                __CLR4_5_286n86nlvl9eifo.R.inc(10671);samples.add(createSampleObject(nalsInSample));
                __CLR4_5_286n86nlvl9eifo.R.inc(10672);nalsInSample.clear();
            } }else {{
                __CLR4_5_286n86nlvl9eifo.R.inc(10673);throw new RuntimeException("Got start code I don't know. Ask Sebastian via mp4parser mailing list what to do");
            }


        }}}}
        // I cannot know the decoding time of the last sample therefore I'll just assume it's as long on the screen as
        // the sample before. I must have lots fantasy to imagine an edge that will make it noticeable.
        }__CLR4_5_286n86nlvl9eifo.R.inc(10674);decodingTimes = Mp4Arrays.copyOfAndAppend(decodingTimes, new long[]{decodingTimes[decodingTimes.length - 1]});

        __CLR4_5_286n86nlvl9eifo.R.inc(10675);ESDescriptor esDescriptor = new ESDescriptor();
        __CLR4_5_286n86nlvl9eifo.R.inc(10676);esDescriptor.setEsId(1);
        __CLR4_5_286n86nlvl9eifo.R.inc(10677);DecoderConfigDescriptor decoderConfigDescriptor = new DecoderConfigDescriptor();
        __CLR4_5_286n86nlvl9eifo.R.inc(10678);decoderConfigDescriptor.setObjectTypeIndication(32);
        __CLR4_5_286n86nlvl9eifo.R.inc(10679);decoderConfigDescriptor.setStreamType(4);
        __CLR4_5_286n86nlvl9eifo.R.inc(10680);DecoderSpecificInfo decoderSpecificInfo = new DecoderSpecificInfo();
        __CLR4_5_286n86nlvl9eifo.R.inc(10681);Sample s = createSampleObject(esdsStuff);
        __CLR4_5_286n86nlvl9eifo.R.inc(10682);byte[] data = new byte[l2i(s.getSize())];
        __CLR4_5_286n86nlvl9eifo.R.inc(10683);s.asByteBuffer().get(data);
        __CLR4_5_286n86nlvl9eifo.R.inc(10684);decoderSpecificInfo.setData(data);
        __CLR4_5_286n86nlvl9eifo.R.inc(10685);decoderConfigDescriptor.setDecoderSpecificInfo(decoderSpecificInfo);
        __CLR4_5_286n86nlvl9eifo.R.inc(10686);esDescriptor.setDecoderConfigDescriptor(decoderConfigDescriptor);
        __CLR4_5_286n86nlvl9eifo.R.inc(10687);SLConfigDescriptor slConfigDescriptor = new SLConfigDescriptor();
        __CLR4_5_286n86nlvl9eifo.R.inc(10688);slConfigDescriptor.setPredefined(2);
        __CLR4_5_286n86nlvl9eifo.R.inc(10689);esDescriptor.setSlConfigDescriptor(slConfigDescriptor);

        __CLR4_5_286n86nlvl9eifo.R.inc(10690);ESDescriptorBox esds = new ESDescriptorBox();
        __CLR4_5_286n86nlvl9eifo.R.inc(10691);esds.setEsDescriptor(esDescriptor);
        __CLR4_5_286n86nlvl9eifo.R.inc(10692);mp4v.addBox(esds);

        __CLR4_5_286n86nlvl9eifo.R.inc(10693);trackMetaData.setTimescale(vop_time_increment_resolution);

    }finally{__CLR4_5_286n86nlvl9eifo.R.flushNeeded();}}

    private int parse0x05Unit(ByteBuffer nal) {try{__CLR4_5_286n86nlvl9eifo.R.inc(10694);
        __CLR4_5_286n86nlvl9eifo.R.inc(10695);int visual_object_verid = 0;
        __CLR4_5_286n86nlvl9eifo.R.inc(10696);BitReaderBuffer brb = new BitReaderBuffer(nal);
        __CLR4_5_286n86nlvl9eifo.R.inc(10697);boolean is_visual_object_identifier = brb.readBool();
        __CLR4_5_286n86nlvl9eifo.R.inc(10698);if ((((is_visual_object_identifier)&&(__CLR4_5_286n86nlvl9eifo.R.iget(10699)!=0|true))||(__CLR4_5_286n86nlvl9eifo.R.iget(10700)==0&false))) {{
            __CLR4_5_286n86nlvl9eifo.R.inc(10701);visual_object_verid = brb.readBits(4);
            __CLR4_5_286n86nlvl9eifo.R.inc(10702);int visual_object_priority = brb.readBits(3);
        }
        }__CLR4_5_286n86nlvl9eifo.R.inc(10703);return visual_object_verid;
    }finally{__CLR4_5_286n86nlvl9eifo.R.flushNeeded();}}

    private void parse0x20Unit(ByteBuffer nal, int visual_object_verid, VisualSampleEntry mp4v) {try{__CLR4_5_286n86nlvl9eifo.R.inc(10704);
        __CLR4_5_286n86nlvl9eifo.R.inc(10705);BitReaderBuffer brb = new BitReaderBuffer(nal);
        __CLR4_5_286n86nlvl9eifo.R.inc(10706);boolean random_accessible_vol = brb.readBool();
        __CLR4_5_286n86nlvl9eifo.R.inc(10707);int video_object_type_indication = brb.readBits(8);
        __CLR4_5_286n86nlvl9eifo.R.inc(10708);boolean is_object_layer_identifier = brb.readBool();
        __CLR4_5_286n86nlvl9eifo.R.inc(10709);int video_object_layer_verid = visual_object_verid;
        __CLR4_5_286n86nlvl9eifo.R.inc(10710);if ((((is_object_layer_identifier)&&(__CLR4_5_286n86nlvl9eifo.R.iget(10711)!=0|true))||(__CLR4_5_286n86nlvl9eifo.R.iget(10712)==0&false))) {{
            __CLR4_5_286n86nlvl9eifo.R.inc(10713);video_object_layer_verid = brb.readBits(4);
            __CLR4_5_286n86nlvl9eifo.R.inc(10714);int video_object_layer_priority = brb.readBits(3);
        }
        }__CLR4_5_286n86nlvl9eifo.R.inc(10715);int aspect_ratio_info = brb.readBits(4);
        // 0000  Forbidden
        // 0001 1:1 (Square)
        // 0010  12:11 (625-type for 4:3 picture)
        // 0011  10:11 (525-type for 4:3 picture)
        // 0100  16:11 (625-type stretched for 16:9 picture)
        // 0101  40:33 (525-type stretched for 16:9 picture)
        // 0110-1110 Reserved
        // 1111 extended PAR
        __CLR4_5_286n86nlvl9eifo.R.inc(10716);if ((((aspect_ratio_info == 15)&&(__CLR4_5_286n86nlvl9eifo.R.iget(10717)!=0|true))||(__CLR4_5_286n86nlvl9eifo.R.iget(10718)==0&false))) {{
            __CLR4_5_286n86nlvl9eifo.R.inc(10719);int par_width = brb.readBits(8);
            __CLR4_5_286n86nlvl9eifo.R.inc(10720);int par_height = brb.readBits(8);
        }
        }__CLR4_5_286n86nlvl9eifo.R.inc(10721);boolean vol_control_parameters = brb.readBool();
        __CLR4_5_286n86nlvl9eifo.R.inc(10722);if ((((vol_control_parameters)&&(__CLR4_5_286n86nlvl9eifo.R.iget(10723)!=0|true))||(__CLR4_5_286n86nlvl9eifo.R.iget(10724)==0&false))) {{
            __CLR4_5_286n86nlvl9eifo.R.inc(10725);int chroma_format = brb.readBits(2);
            __CLR4_5_286n86nlvl9eifo.R.inc(10726);boolean low_delay = brb.readBool();
            __CLR4_5_286n86nlvl9eifo.R.inc(10727);boolean vbv_parameters = brb.readBool();
            __CLR4_5_286n86nlvl9eifo.R.inc(10728);if ((((vbv_parameters)&&(__CLR4_5_286n86nlvl9eifo.R.iget(10729)!=0|true))||(__CLR4_5_286n86nlvl9eifo.R.iget(10730)==0&false))) {{
                __CLR4_5_286n86nlvl9eifo.R.inc(10731);throw new RuntimeException("Implemented when needed");
                // first_half_bit_rate  15 uimsbf
                // marker_bit  1 bslbf
                // latter_half_bit_rate  15 uimsbf
                // marker_bit  1 bslbf
                // first_half_vbv_buffer_size  15 uimsbf
                // marker_bit  1 bslbf
                // latter_half_vbv_buffer_size  3 uimsbf
                // first_half_vbv_occupancy  11 uimsbf
                // marker_bit  1 blsbf
                // latter_half_vbv_occupancy  15 uimsbf
                // marker_bit  1 blsbf
            }

        }}
        }__CLR4_5_286n86nlvl9eifo.R.inc(10732);int video_object_layer_shape = brb.readBits(2);
        // 00 rectangular
        // 01 binary
        // 10 binary only
        // 11 grayscale


        __CLR4_5_286n86nlvl9eifo.R.inc(10733);if ((((video_object_layer_shape == GRAYSCALE
                && video_object_layer_verid != 1)&&(__CLR4_5_286n86nlvl9eifo.R.iget(10734)!=0|true))||(__CLR4_5_286n86nlvl9eifo.R.iget(10735)==0&false))) {{
            __CLR4_5_286n86nlvl9eifo.R.inc(10736);int video_object_layer_shape_extension = brb.readBits(4);
        }
        }__CLR4_5_286n86nlvl9eifo.R.inc(10737);boolean marker_bit = brb.readBool();
        __CLR4_5_286n86nlvl9eifo.R.inc(10738);vop_time_increment_resolution = brb.readBits(16);
        __CLR4_5_286n86nlvl9eifo.R.inc(10739);marker_bit = brb.readBool();
        __CLR4_5_286n86nlvl9eifo.R.inc(10740);boolean fixed_vop_rate = brb.readBool();
        __CLR4_5_286n86nlvl9eifo.R.inc(10741);if ((((fixed_vop_rate)&&(__CLR4_5_286n86nlvl9eifo.R.iget(10742)!=0|true))||(__CLR4_5_286n86nlvl9eifo.R.iget(10743)==0&false))) {{
            __CLR4_5_286n86nlvl9eifo.R.inc(10744);LOG.info("Fixed Frame Rate");
            __CLR4_5_286n86nlvl9eifo.R.inc(10745);int i = 0;
            __CLR4_5_286n86nlvl9eifo.R.inc(10746);while ((((vop_time_increment_resolution >= (1 << i))&&(__CLR4_5_286n86nlvl9eifo.R.iget(10747)!=0|true))||(__CLR4_5_286n86nlvl9eifo.R.iget(10748)==0&false))) {{
                __CLR4_5_286n86nlvl9eifo.R.inc(10749);i++;
            }
            }__CLR4_5_286n86nlvl9eifo.R.inc(10750);fixed_vop_time_increment = brb.readBits(i);
        }
        }__CLR4_5_286n86nlvl9eifo.R.inc(10751);if ((((video_object_layer_shape != BINARY_ONLY)&&(__CLR4_5_286n86nlvl9eifo.R.iget(10752)!=0|true))||(__CLR4_5_286n86nlvl9eifo.R.iget(10753)==0&false))) {{
            __CLR4_5_286n86nlvl9eifo.R.inc(10754);if ((((video_object_layer_shape == RECTANGULAR)&&(__CLR4_5_286n86nlvl9eifo.R.iget(10755)!=0|true))||(__CLR4_5_286n86nlvl9eifo.R.iget(10756)==0&false))) {{
                __CLR4_5_286n86nlvl9eifo.R.inc(10757);marker_bit = brb.readBool();
                __CLR4_5_286n86nlvl9eifo.R.inc(10758);int video_object_layer_width = brb.readBits(13);
                __CLR4_5_286n86nlvl9eifo.R.inc(10759);mp4v.setWidth(video_object_layer_width);
                __CLR4_5_286n86nlvl9eifo.R.inc(10760);marker_bit = brb.readBool();
                __CLR4_5_286n86nlvl9eifo.R.inc(10761);int video_object_layer_height = brb.readBits(13);
                __CLR4_5_286n86nlvl9eifo.R.inc(10762);mp4v.setHeight(video_object_layer_height);
                __CLR4_5_286n86nlvl9eifo.R.inc(10763);marker_bit = brb.readBool();
            }
/****************************************************************************************************************************
 *
 * SOMETHING IS NOT RIGHT WITH THE FOLLOWING CODE TO PARSE THE  video_object_layer BUT I DON'T NEED IT SO
 * I WON'T DEBUG RIGHT NOW. The data is copied into the MP4 byte by byte so it's really not an issue
 *
 ***************************************************************************************************************************/

          /*  boolean interlaced = brb.readBool();
            boolean obmc_disable = brb.readBool();
            int sprite_enable;
            // 0  00  sprite not used
            // 1  01 static (Basic/Low Latency)
            // -  10  GMC (Global Motion Compensation)
            // -  11 Reserved
            if (video_object_layer_verid == 1) {
                sprite_enable = brb.readBits(1);
            } else {
                sprite_enable = brb.readBits(2);
            }
            if (sprite_enable == 1 || sprite_enable == 2) {
                if (sprite_enable != 2) {
                    int sprite_width = brb.readBits(13);
                    marker_bit = brb.readBool();
                    int sprite_height = brb.readBits(13);
                    marker_bit = brb.readBool();
                    int sprite_left_coordinate = brb.readBits(13);
                    marker_bit = brb.readBool();

                    int sprite_top_coordinate = brb.readBits(13);
                    marker_bit = brb.readBool();
                }

                int no_of_sprite_warping_points = brb.readBits(6);
                int sprite_warping_accuracy = brb.readBits(2);
                boolean sprite_brightness_change = brb.readBool();
                if (sprite_enable != 2) {
                    boolean low_latency_sprite_enable = brb.readBool();
                }
            }


            if (video_object_layer_verid != 1 &&
                    video_object_layer_shape != RECTANGULAR) {
                boolean sadct_disable = brb.readBool();
            }
            boolean not_8_bit = brb.readBool();
            if (not_8_bit) {
                int quant_precision = brb.readBits(4);
                int bits_per_pixel = brb.readBits(4);
            }
            if (video_object_layer_shape == GRAYSCALE) {
                boolean no_gray_quant_update = brb.readBool();
                boolean composition_method = brb.readBool();
                boolean linear_composition = brb.readBool();
            }

            boolean quant_type = brb.readBool();
            if (quant_type) {
                boolean load_intra_quant_mat = brb.readBool();
                if (load_intra_quant_mat) {
                    throw new RuntimeException("Please implement me");
                    // intra_quant_mat 8 *[2 - 64]uimsbf
                }
                boolean load_nonintra_quant_mat = brb.readBool();
                if (load_nonintra_quant_mat) {
                    throw new RuntimeException("Please implement me");
                    // nonintra_quant_mat 8 *[2 - 64]uimsbf
                }
                if (video_object_layer_shape == GRAYSCALE) {
                    throw new RuntimeException("Please implement me");
                    //for(i=0; i<aux_comp_count; i++) {
                    //   boolean  load_intra_quant_mat_grayscale  = brb.readBool();
                    //  if(load_intra_quant_mat_grayscale)
                    //       intra_quant_mat_grayscale[i]  8*[2-64] uimsbf
                    //    boolean load_nonintra_quant_mat_grayscale = brb.readBool();
                    //    if(load_nonintra_quant_mat_grayscale)
                    //        nonintra_quant_mat_grayscale[i]  8*[2-64] uimsbf
                    //}
                }
            }

            if (video_object_layer_verid != 1) {
                boolean quarter_sample = brb.readBool();
            }
            boolean complexity_estimation_disable = brb.readBool();

            if (!complexity_estimation_disable) {
                throw new RuntimeException("Please implement me");
                // define_vop_complexity_estimation_header()
            }
            boolean resync_marker_disable = brb.readBool();
            boolean data_partitioned = brb.readBool();
            if (data_partitioned) {
                boolean reversible_vlc = brb.readBool();
            }
            if (video_object_layer_verid != 1) {
                boolean newpred_enable = brb.readBool();
                if (newpred_enable) {
                    int requested_upstream_message_type = brb.readBits(2);
                    boolean newpred_segment_type = brb.readBool();
                }
                boolean reduced_resolution_vop_enable = brb.readBool();
            }
            boolean scalability = brb.readBool();
            if (scalability) {
                boolean hierarchy_type = brb.readBool();
                int ref_layer_id = brb.readBits(4);
                boolean ref_layer_sampling_direc = brb.readBool();
                int hor_sampling_factor_n = brb.readBits(5);
                int hor_sampling_factor_m = brb.readBits(5);
                int vert_sampling_factor_n = brb.readBits(5);
                int vert_sampling_factor_m = brb.readBits(5);
                boolean enhancement_type = brb.readBool();
                if (video_object_layer_shape == 1 && !hierarchy_type) {
                    boolean use_ref_shape = brb.readBool();
                    boolean use_ref_texture = brb.readBool();
                    int shape_hor_sampling_factor_n = brb.readBits(5);
                    int shape_hor_sampling_factor_m = brb.readBits(5);
                    int shape_vert_sampling_factor_n = brb.readBits(5);
                    int shape_vert_sampling_factor_m = brb.readBits(5);
                }
            }*/
        }} }else {{
            __CLR4_5_286n86nlvl9eifo.R.inc(10764);throw new RuntimeException("Please implmenet me");
        }
    }}finally{__CLR4_5_286n86nlvl9eifo.R.flushNeeded();}}

    protected Sample createSampleObject(List<? extends ByteBuffer> nals) {try{__CLR4_5_286n86nlvl9eifo.R.inc(10765);
        __CLR4_5_286n86nlvl9eifo.R.inc(10766);ByteBuffer startcode = ByteBuffer.wrap(new byte[]{0, 0, 1});
        __CLR4_5_286n86nlvl9eifo.R.inc(10767);ByteBuffer[] data = new ByteBuffer[nals.size() * 2];
        __CLR4_5_286n86nlvl9eifo.R.inc(10768);for (int i = 0; (((i < nals.size())&&(__CLR4_5_286n86nlvl9eifo.R.iget(10769)!=0|true))||(__CLR4_5_286n86nlvl9eifo.R.iget(10770)==0&false)); i++) {{
            __CLR4_5_286n86nlvl9eifo.R.inc(10771);data[2 * i] = startcode;
            __CLR4_5_286n86nlvl9eifo.R.inc(10772);data[2 * i + 1] = nals.get(i);
        }
        }__CLR4_5_286n86nlvl9eifo.R.inc(10773);return new SampleImpl(data);
    }finally{__CLR4_5_286n86nlvl9eifo.R.flushNeeded();}}

    public SampleDescriptionBox getSampleDescriptionBox() {try{__CLR4_5_286n86nlvl9eifo.R.inc(10774);

        __CLR4_5_286n86nlvl9eifo.R.inc(10775);return stsd;
    }finally{__CLR4_5_286n86nlvl9eifo.R.flushNeeded();}}

    public String getHandler() {try{__CLR4_5_286n86nlvl9eifo.R.inc(10776);
        __CLR4_5_286n86nlvl9eifo.R.inc(10777);return "vide";
    }finally{__CLR4_5_286n86nlvl9eifo.R.flushNeeded();}}

    public List<Sample> getSamples() {try{__CLR4_5_286n86nlvl9eifo.R.inc(10778);
        __CLR4_5_286n86nlvl9eifo.R.inc(10779);return samples;
    }finally{__CLR4_5_286n86nlvl9eifo.R.flushNeeded();}}

    public static void main1(String[] args) throws IOException {try{__CLR4_5_286n86nlvl9eifo.R.inc(10780);
        __CLR4_5_286n86nlvl9eifo.R.inc(10781);File[] files = new File("C:\\dev\\mp4parser\\frames").listFiles();
        __CLR4_5_286n86nlvl9eifo.R.inc(10782);Arrays.sort(files);
        __CLR4_5_286n86nlvl9eifo.R.inc(10783);Movie m = new Movie();
        __CLR4_5_286n86nlvl9eifo.R.inc(10784);Track track = new H263TrackImpl(new MultiFileDataSourceImpl(files));
        __CLR4_5_286n86nlvl9eifo.R.inc(10785);m.addTrack(track);
        __CLR4_5_286n86nlvl9eifo.R.inc(10786);DefaultMp4Builder builder = new DefaultMp4Builder();
        __CLR4_5_286n86nlvl9eifo.R.inc(10787);Container c = builder.build(m);
        __CLR4_5_286n86nlvl9eifo.R.inc(10788);FileOutputStream fos = new FileOutputStream("output.mp4");
        __CLR4_5_286n86nlvl9eifo.R.inc(10789);c.writeContainer(Channels.newChannel(fos));
    }finally{__CLR4_5_286n86nlvl9eifo.R.flushNeeded();}}

    public static void main(String[] args) throws IOException {try{__CLR4_5_286n86nlvl9eifo.R.inc(10790);
        __CLR4_5_286n86nlvl9eifo.R.inc(10791);DataSource ds = new FileDataSourceImpl("C:\\content\\bbb.h263");
        __CLR4_5_286n86nlvl9eifo.R.inc(10792);Movie m = new Movie();
        __CLR4_5_286n86nlvl9eifo.R.inc(10793);Track track = new H263TrackImpl(ds);
        __CLR4_5_286n86nlvl9eifo.R.inc(10794);m.addTrack(track);
        __CLR4_5_286n86nlvl9eifo.R.inc(10795);DefaultMp4Builder builder = new DefaultMp4Builder();
        __CLR4_5_286n86nlvl9eifo.R.inc(10796);Container c = builder.build(m);
        __CLR4_5_286n86nlvl9eifo.R.inc(10797);FileOutputStream fos = new FileOutputStream("output.mp4");
        __CLR4_5_286n86nlvl9eifo.R.inc(10798);c.writeContainer(Channels.newChannel(fos));

    }finally{__CLR4_5_286n86nlvl9eifo.R.flushNeeded();}}

    public static void main2(String[] args) throws IOException {try{__CLR4_5_286n86nlvl9eifo.R.inc(10799);
        __CLR4_5_286n86nlvl9eifo.R.inc(10800);ESDescriptorBox esds = Path.getPath(new IsoFile("C:\\content\\bbb.mp4"), "/moov[0]/trak[0]/mdia[0]/minf[0]/stbl[0]/stsd[0]/mp4v[0]/esds[0]");
        __CLR4_5_286n86nlvl9eifo.R.inc(10801);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_5_286n86nlvl9eifo.R.inc(10802);esds.getBox(Channels.newChannel(baos));
        __CLR4_5_286n86nlvl9eifo.R.inc(10803);System.err.println(Hex.encodeHex(baos.toByteArray()));
        __CLR4_5_286n86nlvl9eifo.R.inc(10804);System.err.println(esds.getEsDescriptor());
        __CLR4_5_286n86nlvl9eifo.R.inc(10805);baos = new ByteArrayOutputStream();
        __CLR4_5_286n86nlvl9eifo.R.inc(10806);esds.getBox(Channels.newChannel(baos));
        __CLR4_5_286n86nlvl9eifo.R.inc(10807);System.err.println(Hex.encodeHex(baos.toByteArray()));
    }finally{__CLR4_5_286n86nlvl9eifo.R.flushNeeded();}}
}
