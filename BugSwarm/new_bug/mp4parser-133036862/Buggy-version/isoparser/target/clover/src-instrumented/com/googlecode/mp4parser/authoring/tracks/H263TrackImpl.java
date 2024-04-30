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
public class H263TrackImpl extends AbstractH26XTrack {public static class __CLR4_5_289a89alvluli5n{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,10903,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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
        super(dataSource, false);__CLR4_5_289a89alvluli5n.R.inc(10703);try{__CLR4_5_289a89alvluli5n.R.inc(10702);
        __CLR4_5_289a89alvluli5n.R.inc(10704);LookAhead la = new LookAhead(dataSource);
        __CLR4_5_289a89alvluli5n.R.inc(10705);ByteBuffer nal;
        __CLR4_5_289a89alvluli5n.R.inc(10706);List<ByteBuffer> nalsInSample = new ArrayList<ByteBuffer>();
        __CLR4_5_289a89alvluli5n.R.inc(10707);int visual_object_verid = 0;

        __CLR4_5_289a89alvluli5n.R.inc(10708);VisualSampleEntry mp4v = new VisualSampleEntry("mp4v");
        __CLR4_5_289a89alvluli5n.R.inc(10709);stsd = new SampleDescriptionBox();
        __CLR4_5_289a89alvluli5n.R.inc(10710);stsd.addBox(mp4v);

        __CLR4_5_289a89alvluli5n.R.inc(10711);long last_sync_point = 0;
        __CLR4_5_289a89alvluli5n.R.inc(10712);long last_time_code = -1;

        __CLR4_5_289a89alvluli5n.R.inc(10713);while ((nal = findNextNal(la)) != null) {{
            __CLR4_5_289a89alvluli5n.R.inc(10716);ByteBuffer origNal = nal.duplicate();
            __CLR4_5_289a89alvluli5n.R.inc(10717);int type = IsoTypeReader.readUInt8(nal);
            __CLR4_5_289a89alvluli5n.R.inc(10718);if ((((((type == 0xb0) || // visual_object_sequence_start_code
                    (type == 0xb5) || // visual_object_start_code
                    (type == 0x00) || // video_object_start_code
                    (type == 0x20) || // video_object_layer_start_code
                    (type == 0xb2)) // user_data_start_code
                    )&&(__CLR4_5_289a89alvluli5n.R.iget(10719)!=0|true))||(__CLR4_5_289a89alvluli5n.R.iget(10720)==0&false))) {{
                __CLR4_5_289a89alvluli5n.R.inc(10721);if ((((!esdsComplete)&&(__CLR4_5_289a89alvluli5n.R.iget(10722)!=0|true))||(__CLR4_5_289a89alvluli5n.R.iget(10723)==0&false))) {{
                    __CLR4_5_289a89alvluli5n.R.inc(10724);esdsStuff.add(origNal);

                    __CLR4_5_289a89alvluli5n.R.inc(10725);if ((((type == 0x20)&&(__CLR4_5_289a89alvluli5n.R.iget(10726)!=0|true))||(__CLR4_5_289a89alvluli5n.R.iget(10727)==0&false))) {{
                        __CLR4_5_289a89alvluli5n.R.inc(10728);parse0x20Unit(nal, visual_object_verid, mp4v);
                    } }else {__CLR4_5_289a89alvluli5n.R.inc(10729);if ((((type == 0xb5)&&(__CLR4_5_289a89alvluli5n.R.iget(10730)!=0|true))||(__CLR4_5_289a89alvluli5n.R.iget(10731)==0&false))) {{
                        __CLR4_5_289a89alvluli5n.R.inc(10732);visual_object_verid = parse0x05Unit(nal);
                    }
                }}}
            }} }else {__CLR4_5_289a89alvluli5n.R.inc(10733);if ((((type == 0xb3)&&(__CLR4_5_289a89alvluli5n.R.iget(10734)!=0|true))||(__CLR4_5_289a89alvluli5n.R.iget(10735)==0&false))) {{ // group_of_vop_start_code
                __CLR4_5_289a89alvluli5n.R.inc(10736);esdsComplete = true;
                __CLR4_5_289a89alvluli5n.R.inc(10737);BitReaderBuffer bitReaderBuffer = new BitReaderBuffer(nal);
                __CLR4_5_289a89alvluli5n.R.inc(10738);int time_code = bitReaderBuffer.readBits(18);
                __CLR4_5_289a89alvluli5n.R.inc(10739);last_sync_point = ((time_code & 0x3f) + ((time_code >>> 7 & 0x3f) * 60) + ((time_code >>> 13 & 0x1f) * 60 * 60));
                __CLR4_5_289a89alvluli5n.R.inc(10740);stss.add(samples.size() + 1);
                __CLR4_5_289a89alvluli5n.R.inc(10741);nalsInSample.add(origNal);
            } }else {__CLR4_5_289a89alvluli5n.R.inc(10742);if ((((type == 0xb6)&&(__CLR4_5_289a89alvluli5n.R.iget(10743)!=0|true))||(__CLR4_5_289a89alvluli5n.R.iget(10744)==0&false))) {{ // vop_start_code
                __CLR4_5_289a89alvluli5n.R.inc(10745);BitReaderBuffer brb = new BitReaderBuffer(nal);
                __CLR4_5_289a89alvluli5n.R.inc(10746);int vop_coding_type = brb.readBits(2);
                __CLR4_5_289a89alvluli5n.R.inc(10747);while ((((brb.readBool())&&(__CLR4_5_289a89alvluli5n.R.iget(10748)!=0|true))||(__CLR4_5_289a89alvluli5n.R.iget(10749)==0&false))) {{
                    __CLR4_5_289a89alvluli5n.R.inc(10750);last_sync_point++;
                }
                }__CLR4_5_289a89alvluli5n.R.inc(10751);boolean marker_bit = brb.readBool();
                __CLR4_5_289a89alvluli5n.R.inc(10752);int i = 0;
                __CLR4_5_289a89alvluli5n.R.inc(10753);while ((((vop_time_increment_resolution >= (1 << i))&&(__CLR4_5_289a89alvluli5n.R.iget(10754)!=0|true))||(__CLR4_5_289a89alvluli5n.R.iget(10755)==0&false))) {{
                    __CLR4_5_289a89alvluli5n.R.inc(10756);i++;
                }
                }__CLR4_5_289a89alvluli5n.R.inc(10757);int vop_time_increment = brb.readBits(i);
                __CLR4_5_289a89alvluli5n.R.inc(10758);long time_code = (last_sync_point * vop_time_increment_resolution + (vop_time_increment % vop_time_increment_resolution));
                __CLR4_5_289a89alvluli5n.R.inc(10759);if ((((last_time_code != -1)&&(__CLR4_5_289a89alvluli5n.R.iget(10760)!=0|true))||(__CLR4_5_289a89alvluli5n.R.iget(10761)==0&false))) {{
                    __CLR4_5_289a89alvluli5n.R.inc(10762);decodingTimes = Mp4Arrays.copyOfAndAppend(decodingTimes, new long[]{time_code - last_time_code});
                }
                }__CLR4_5_289a89alvluli5n.R.inc(10763);System.err.println("Frame increment: " + (time_code - last_time_code) + " vop time increment: " + vop_time_increment + " last_sync_point: " + last_sync_point + " time_code: " + time_code);
                __CLR4_5_289a89alvluli5n.R.inc(10764);last_time_code = time_code;
                __CLR4_5_289a89alvluli5n.R.inc(10765);nalsInSample.add(origNal);
                __CLR4_5_289a89alvluli5n.R.inc(10766);samples.add(createSampleObject(nalsInSample));
                __CLR4_5_289a89alvluli5n.R.inc(10767);nalsInSample.clear();
            } }else {{
                __CLR4_5_289a89alvluli5n.R.inc(10768);throw new RuntimeException("Got start code I don't know. Ask Sebastian via mp4parser mailing list what to do");
            }


        }}}}
        // I cannot know the decoding time of the last sample therefore I'll just assume it's as long on the screen as
        // the sample before. I must have lots fantasy to imagine an edge that will make it noticeable.
        }__CLR4_5_289a89alvluli5n.R.inc(10769);decodingTimes = Mp4Arrays.copyOfAndAppend(decodingTimes, new long[]{decodingTimes[decodingTimes.length - 1]});

        __CLR4_5_289a89alvluli5n.R.inc(10770);ESDescriptor esDescriptor = new ESDescriptor();
        __CLR4_5_289a89alvluli5n.R.inc(10771);esDescriptor.setEsId(1);
        __CLR4_5_289a89alvluli5n.R.inc(10772);DecoderConfigDescriptor decoderConfigDescriptor = new DecoderConfigDescriptor();
        __CLR4_5_289a89alvluli5n.R.inc(10773);decoderConfigDescriptor.setObjectTypeIndication(32);
        __CLR4_5_289a89alvluli5n.R.inc(10774);decoderConfigDescriptor.setStreamType(4);
        __CLR4_5_289a89alvluli5n.R.inc(10775);DecoderSpecificInfo decoderSpecificInfo = new DecoderSpecificInfo();
        __CLR4_5_289a89alvluli5n.R.inc(10776);Sample s = createSampleObject(esdsStuff);
        __CLR4_5_289a89alvluli5n.R.inc(10777);byte[] data = new byte[l2i(s.getSize())];
        __CLR4_5_289a89alvluli5n.R.inc(10778);s.asByteBuffer().get(data);
        __CLR4_5_289a89alvluli5n.R.inc(10779);decoderSpecificInfo.setData(data);
        __CLR4_5_289a89alvluli5n.R.inc(10780);decoderConfigDescriptor.setDecoderSpecificInfo(decoderSpecificInfo);
        __CLR4_5_289a89alvluli5n.R.inc(10781);esDescriptor.setDecoderConfigDescriptor(decoderConfigDescriptor);
        __CLR4_5_289a89alvluli5n.R.inc(10782);SLConfigDescriptor slConfigDescriptor = new SLConfigDescriptor();
        __CLR4_5_289a89alvluli5n.R.inc(10783);slConfigDescriptor.setPredefined(2);
        __CLR4_5_289a89alvluli5n.R.inc(10784);esDescriptor.setSlConfigDescriptor(slConfigDescriptor);

        __CLR4_5_289a89alvluli5n.R.inc(10785);ESDescriptorBox esds = new ESDescriptorBox();
        __CLR4_5_289a89alvluli5n.R.inc(10786);esds.setEsDescriptor(esDescriptor);
        __CLR4_5_289a89alvluli5n.R.inc(10787);mp4v.addBox(esds);

        __CLR4_5_289a89alvluli5n.R.inc(10788);trackMetaData.setTimescale(vop_time_increment_resolution);

    }finally{__CLR4_5_289a89alvluli5n.R.flushNeeded();}}

    private int parse0x05Unit(ByteBuffer nal) {try{__CLR4_5_289a89alvluli5n.R.inc(10789);
        __CLR4_5_289a89alvluli5n.R.inc(10790);int visual_object_verid = 0;
        __CLR4_5_289a89alvluli5n.R.inc(10791);BitReaderBuffer brb = new BitReaderBuffer(nal);
        __CLR4_5_289a89alvluli5n.R.inc(10792);boolean is_visual_object_identifier = brb.readBool();
        __CLR4_5_289a89alvluli5n.R.inc(10793);if ((((is_visual_object_identifier)&&(__CLR4_5_289a89alvluli5n.R.iget(10794)!=0|true))||(__CLR4_5_289a89alvluli5n.R.iget(10795)==0&false))) {{
            __CLR4_5_289a89alvluli5n.R.inc(10796);visual_object_verid = brb.readBits(4);
            __CLR4_5_289a89alvluli5n.R.inc(10797);int visual_object_priority = brb.readBits(3);
        }
        }__CLR4_5_289a89alvluli5n.R.inc(10798);return visual_object_verid;
    }finally{__CLR4_5_289a89alvluli5n.R.flushNeeded();}}

    private void parse0x20Unit(ByteBuffer nal, int visual_object_verid, VisualSampleEntry mp4v) {try{__CLR4_5_289a89alvluli5n.R.inc(10799);
        __CLR4_5_289a89alvluli5n.R.inc(10800);BitReaderBuffer brb = new BitReaderBuffer(nal);
        __CLR4_5_289a89alvluli5n.R.inc(10801);boolean random_accessible_vol = brb.readBool();
        __CLR4_5_289a89alvluli5n.R.inc(10802);int video_object_type_indication = brb.readBits(8);
        __CLR4_5_289a89alvluli5n.R.inc(10803);boolean is_object_layer_identifier = brb.readBool();
        __CLR4_5_289a89alvluli5n.R.inc(10804);int video_object_layer_verid = visual_object_verid;
        __CLR4_5_289a89alvluli5n.R.inc(10805);if ((((is_object_layer_identifier)&&(__CLR4_5_289a89alvluli5n.R.iget(10806)!=0|true))||(__CLR4_5_289a89alvluli5n.R.iget(10807)==0&false))) {{
            __CLR4_5_289a89alvluli5n.R.inc(10808);video_object_layer_verid = brb.readBits(4);
            __CLR4_5_289a89alvluli5n.R.inc(10809);int video_object_layer_priority = brb.readBits(3);
        }
        }__CLR4_5_289a89alvluli5n.R.inc(10810);int aspect_ratio_info = brb.readBits(4);
        // 0000  Forbidden
        // 0001 1:1 (Square)
        // 0010  12:11 (625-type for 4:3 picture)
        // 0011  10:11 (525-type for 4:3 picture)
        // 0100  16:11 (625-type stretched for 16:9 picture)
        // 0101  40:33 (525-type stretched for 16:9 picture)
        // 0110-1110 Reserved
        // 1111 extended PAR
        __CLR4_5_289a89alvluli5n.R.inc(10811);if ((((aspect_ratio_info == 15)&&(__CLR4_5_289a89alvluli5n.R.iget(10812)!=0|true))||(__CLR4_5_289a89alvluli5n.R.iget(10813)==0&false))) {{
            __CLR4_5_289a89alvluli5n.R.inc(10814);int par_width = brb.readBits(8);
            __CLR4_5_289a89alvluli5n.R.inc(10815);int par_height = brb.readBits(8);
        }
        }__CLR4_5_289a89alvluli5n.R.inc(10816);boolean vol_control_parameters = brb.readBool();
        __CLR4_5_289a89alvluli5n.R.inc(10817);if ((((vol_control_parameters)&&(__CLR4_5_289a89alvluli5n.R.iget(10818)!=0|true))||(__CLR4_5_289a89alvluli5n.R.iget(10819)==0&false))) {{
            __CLR4_5_289a89alvluli5n.R.inc(10820);int chroma_format = brb.readBits(2);
            __CLR4_5_289a89alvluli5n.R.inc(10821);boolean low_delay = brb.readBool();
            __CLR4_5_289a89alvluli5n.R.inc(10822);boolean vbv_parameters = brb.readBool();
            __CLR4_5_289a89alvluli5n.R.inc(10823);if ((((vbv_parameters)&&(__CLR4_5_289a89alvluli5n.R.iget(10824)!=0|true))||(__CLR4_5_289a89alvluli5n.R.iget(10825)==0&false))) {{
                __CLR4_5_289a89alvluli5n.R.inc(10826);throw new RuntimeException("Implemented when needed");
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
        }__CLR4_5_289a89alvluli5n.R.inc(10827);int video_object_layer_shape = brb.readBits(2);
        // 00 rectangular
        // 01 binary
        // 10 binary only
        // 11 grayscale


        __CLR4_5_289a89alvluli5n.R.inc(10828);if ((((video_object_layer_shape == GRAYSCALE
                && video_object_layer_verid != 1)&&(__CLR4_5_289a89alvluli5n.R.iget(10829)!=0|true))||(__CLR4_5_289a89alvluli5n.R.iget(10830)==0&false))) {{
            __CLR4_5_289a89alvluli5n.R.inc(10831);int video_object_layer_shape_extension = brb.readBits(4);
        }
        }__CLR4_5_289a89alvluli5n.R.inc(10832);boolean marker_bit = brb.readBool();
        __CLR4_5_289a89alvluli5n.R.inc(10833);vop_time_increment_resolution = brb.readBits(16);
        __CLR4_5_289a89alvluli5n.R.inc(10834);marker_bit = brb.readBool();
        __CLR4_5_289a89alvluli5n.R.inc(10835);boolean fixed_vop_rate = brb.readBool();
        __CLR4_5_289a89alvluli5n.R.inc(10836);if ((((fixed_vop_rate)&&(__CLR4_5_289a89alvluli5n.R.iget(10837)!=0|true))||(__CLR4_5_289a89alvluli5n.R.iget(10838)==0&false))) {{
            __CLR4_5_289a89alvluli5n.R.inc(10839);LOG.info("Fixed Frame Rate");
            __CLR4_5_289a89alvluli5n.R.inc(10840);int i = 0;
            __CLR4_5_289a89alvluli5n.R.inc(10841);while ((((vop_time_increment_resolution >= (1 << i))&&(__CLR4_5_289a89alvluli5n.R.iget(10842)!=0|true))||(__CLR4_5_289a89alvluli5n.R.iget(10843)==0&false))) {{
                __CLR4_5_289a89alvluli5n.R.inc(10844);i++;
            }
            }__CLR4_5_289a89alvluli5n.R.inc(10845);fixed_vop_time_increment = brb.readBits(i);
        }
        }__CLR4_5_289a89alvluli5n.R.inc(10846);if ((((video_object_layer_shape != BINARY_ONLY)&&(__CLR4_5_289a89alvluli5n.R.iget(10847)!=0|true))||(__CLR4_5_289a89alvluli5n.R.iget(10848)==0&false))) {{
            __CLR4_5_289a89alvluli5n.R.inc(10849);if ((((video_object_layer_shape == RECTANGULAR)&&(__CLR4_5_289a89alvluli5n.R.iget(10850)!=0|true))||(__CLR4_5_289a89alvluli5n.R.iget(10851)==0&false))) {{
                __CLR4_5_289a89alvluli5n.R.inc(10852);marker_bit = brb.readBool();
                __CLR4_5_289a89alvluli5n.R.inc(10853);int video_object_layer_width = brb.readBits(13);
                __CLR4_5_289a89alvluli5n.R.inc(10854);mp4v.setWidth(video_object_layer_width);
                __CLR4_5_289a89alvluli5n.R.inc(10855);marker_bit = brb.readBool();
                __CLR4_5_289a89alvluli5n.R.inc(10856);int video_object_layer_height = brb.readBits(13);
                __CLR4_5_289a89alvluli5n.R.inc(10857);mp4v.setHeight(video_object_layer_height);
                __CLR4_5_289a89alvluli5n.R.inc(10858);marker_bit = brb.readBool();
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
            __CLR4_5_289a89alvluli5n.R.inc(10859);throw new RuntimeException("Please implmenet me");
        }
    }}finally{__CLR4_5_289a89alvluli5n.R.flushNeeded();}}

    protected Sample createSampleObject(List<? extends ByteBuffer> nals) {try{__CLR4_5_289a89alvluli5n.R.inc(10860);
        __CLR4_5_289a89alvluli5n.R.inc(10861);ByteBuffer startcode = ByteBuffer.wrap(new byte[]{0, 0, 1});
        __CLR4_5_289a89alvluli5n.R.inc(10862);ByteBuffer[] data = new ByteBuffer[nals.size() * 2];
        __CLR4_5_289a89alvluli5n.R.inc(10863);for (int i = 0; (((i < nals.size())&&(__CLR4_5_289a89alvluli5n.R.iget(10864)!=0|true))||(__CLR4_5_289a89alvluli5n.R.iget(10865)==0&false)); i++) {{
            __CLR4_5_289a89alvluli5n.R.inc(10866);data[2 * i] = startcode;
            __CLR4_5_289a89alvluli5n.R.inc(10867);data[2 * i + 1] = nals.get(i);
        }
        }__CLR4_5_289a89alvluli5n.R.inc(10868);return new SampleImpl(data);
    }finally{__CLR4_5_289a89alvluli5n.R.flushNeeded();}}

    public SampleDescriptionBox getSampleDescriptionBox() {try{__CLR4_5_289a89alvluli5n.R.inc(10869);

        __CLR4_5_289a89alvluli5n.R.inc(10870);return stsd;
    }finally{__CLR4_5_289a89alvluli5n.R.flushNeeded();}}

    public String getHandler() {try{__CLR4_5_289a89alvluli5n.R.inc(10871);
        __CLR4_5_289a89alvluli5n.R.inc(10872);return "vide";
    }finally{__CLR4_5_289a89alvluli5n.R.flushNeeded();}}

    public List<Sample> getSamples() {try{__CLR4_5_289a89alvluli5n.R.inc(10873);
        __CLR4_5_289a89alvluli5n.R.inc(10874);return samples;
    }finally{__CLR4_5_289a89alvluli5n.R.flushNeeded();}}

    public static void main1(String[] args) throws IOException {try{__CLR4_5_289a89alvluli5n.R.inc(10875);
        __CLR4_5_289a89alvluli5n.R.inc(10876);File[] files = new File("C:\\dev\\mp4parser\\frames").listFiles();
        __CLR4_5_289a89alvluli5n.R.inc(10877);Arrays.sort(files);
        __CLR4_5_289a89alvluli5n.R.inc(10878);Movie m = new Movie();
        __CLR4_5_289a89alvluli5n.R.inc(10879);Track track = new H263TrackImpl(new MultiFileDataSourceImpl(files));
        __CLR4_5_289a89alvluli5n.R.inc(10880);m.addTrack(track);
        __CLR4_5_289a89alvluli5n.R.inc(10881);DefaultMp4Builder builder = new DefaultMp4Builder();
        __CLR4_5_289a89alvluli5n.R.inc(10882);Container c = builder.build(m);
        __CLR4_5_289a89alvluli5n.R.inc(10883);FileOutputStream fos = new FileOutputStream("output.mp4");
        __CLR4_5_289a89alvluli5n.R.inc(10884);c.writeContainer(Channels.newChannel(fos));
    }finally{__CLR4_5_289a89alvluli5n.R.flushNeeded();}}

    public static void main(String[] args) throws IOException {try{__CLR4_5_289a89alvluli5n.R.inc(10885);
        __CLR4_5_289a89alvluli5n.R.inc(10886);DataSource ds = new FileDataSourceImpl("C:\\content\\bbb.h263");
        __CLR4_5_289a89alvluli5n.R.inc(10887);Movie m = new Movie();
        __CLR4_5_289a89alvluli5n.R.inc(10888);Track track = new H263TrackImpl(ds);
        __CLR4_5_289a89alvluli5n.R.inc(10889);m.addTrack(track);
        __CLR4_5_289a89alvluli5n.R.inc(10890);DefaultMp4Builder builder = new DefaultMp4Builder();
        __CLR4_5_289a89alvluli5n.R.inc(10891);Container c = builder.build(m);
        __CLR4_5_289a89alvluli5n.R.inc(10892);FileOutputStream fos = new FileOutputStream("output.mp4");
        __CLR4_5_289a89alvluli5n.R.inc(10893);c.writeContainer(Channels.newChannel(fos));

    }finally{__CLR4_5_289a89alvluli5n.R.flushNeeded();}}

    public static void main2(String[] args) throws IOException {try{__CLR4_5_289a89alvluli5n.R.inc(10894);
        __CLR4_5_289a89alvluli5n.R.inc(10895);ESDescriptorBox esds = Path.getPath(new IsoFile("C:\\content\\bbb.mp4"), "/moov[0]/trak[0]/mdia[0]/minf[0]/stbl[0]/stsd[0]/mp4v[0]/esds[0]");
        __CLR4_5_289a89alvluli5n.R.inc(10896);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_5_289a89alvluli5n.R.inc(10897);esds.getBox(Channels.newChannel(baos));
        __CLR4_5_289a89alvluli5n.R.inc(10898);System.err.println(Hex.encodeHex(baos.toByteArray()));
        __CLR4_5_289a89alvluli5n.R.inc(10899);System.err.println(esds.getEsDescriptor());
        __CLR4_5_289a89alvluli5n.R.inc(10900);baos = new ByteArrayOutputStream();
        __CLR4_5_289a89alvluli5n.R.inc(10901);esds.getBox(Channels.newChannel(baos));
        __CLR4_5_289a89alvluli5n.R.inc(10902);System.err.println(Hex.encodeHex(baos.toByteArray()));
    }finally{__CLR4_5_289a89alvluli5n.R.flushNeeded();}}
}
