/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.googlecode.mp4parser.authoring.tracks.h265;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.boxes.Container;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.sampleentry.VisualSampleEntry;
import com.googlecode.mp4parser.DataSource;
import com.googlecode.mp4parser.FileDataSourceImpl;
import com.googlecode.mp4parser.authoring.Movie;
import com.googlecode.mp4parser.authoring.Sample;
import com.googlecode.mp4parser.authoring.Track;
import com.googlecode.mp4parser.authoring.builder.DefaultMp4Builder;
import com.googlecode.mp4parser.authoring.tracks.AbstractH26XTrack;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBuffer;
import com.googlecode.mp4parser.util.ByteBufferByteChannel;
import com.mp4parser.iso14496.part15.HevcConfigurationBox;
import com.mp4parser.iso14496.part15.HevcDecoderConfigurationRecord;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by sannies on 02.01.2015.
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class H265TrackImpl extends AbstractH26XTrack implements H265NalUnitTypes {public static class __CLR4_5_298d98dlvlulija{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,12125,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    ArrayList<ByteBuffer> sps = new ArrayList<ByteBuffer>();
    ArrayList<ByteBuffer> pps = new ArrayList<ByteBuffer>();
    ArrayList<ByteBuffer> vps = new ArrayList<ByteBuffer>();
    ArrayList<Sample> samples = new ArrayList<Sample>();

    SampleDescriptionBox stsd;

    public H265TrackImpl(DataSource dataSource) throws IOException {
        super(dataSource);__CLR4_5_298d98dlvlulija.R.inc(11966);try{__CLR4_5_298d98dlvlulija.R.inc(11965);
        __CLR4_5_298d98dlvlulija.R.inc(11967);ArrayList<ByteBuffer> nals = new ArrayList<ByteBuffer>();
        __CLR4_5_298d98dlvlulija.R.inc(11968);LookAhead la = new LookAhead(dataSource);
        __CLR4_5_298d98dlvlulija.R.inc(11969);ByteBuffer nal;
        __CLR4_5_298d98dlvlulija.R.inc(11970);boolean[] vclNalUnitSeenInAU = new boolean[]{false};
        __CLR4_5_298d98dlvlulija.R.inc(11971);boolean[] isIdr = new boolean[]{true};


        __CLR4_5_298d98dlvlulija.R.inc(11972);while ((nal = findNextNal(la)) != null) {{

            __CLR4_5_298d98dlvlulija.R.inc(11975);H265NalUnitHeader unitHeader = getNalUnitHeader(nal);
            //
            __CLR4_5_298d98dlvlulija.R.inc(11976);if ((((vclNalUnitSeenInAU[0])&&(__CLR4_5_298d98dlvlulija.R.iget(11977)!=0|true))||(__CLR4_5_298d98dlvlulija.R.iget(11978)==0&false))) {{ // we need at least 1 VCL per AU
                // This branch checks if we encountered the start of a samples/AU
                __CLR4_5_298d98dlvlulija.R.inc(11979);if ((((isVcl(unitHeader))&&(__CLR4_5_298d98dlvlulija.R.iget(11980)!=0|true))||(__CLR4_5_298d98dlvlulija.R.iget(11981)==0&false))) {{
                    __CLR4_5_298d98dlvlulija.R.inc(11982);if (((((nal.get(2) & -128) != 0)&&(__CLR4_5_298d98dlvlulija.R.iget(11983)!=0|true))||(__CLR4_5_298d98dlvlulija.R.iget(11984)==0&false))) {{ // this is: first_slice_segment_in_pic_flag  u(1)
                        __CLR4_5_298d98dlvlulija.R.inc(11985);wrapUp(nals, vclNalUnitSeenInAU, isIdr);
                    }
                }} }else {{
                    boolean __CLB4_5_2_bool0=false;__CLR4_5_298d98dlvlulija.R.inc(11986);switch (unitHeader.nalUnitType) {
                        case NAL_TYPE_PREFIX_SEI_NUT:if (!__CLB4_5_2_bool0) {__CLR4_5_298d98dlvlulija.R.inc(11987);__CLB4_5_2_bool0=true;}
                        case NAL_TYPE_AUD_NUT:if (!__CLB4_5_2_bool0) {__CLR4_5_298d98dlvlulija.R.inc(11988);__CLB4_5_2_bool0=true;}
                        case NAL_TYPE_PPS_NUT:if (!__CLB4_5_2_bool0) {__CLR4_5_298d98dlvlulija.R.inc(11989);__CLB4_5_2_bool0=true;}
                        case NAL_TYPE_VPS_NUT:if (!__CLB4_5_2_bool0) {__CLR4_5_298d98dlvlulija.R.inc(11990);__CLB4_5_2_bool0=true;}
                        case NAL_TYPE_SPS_NUT:if (!__CLB4_5_2_bool0) {__CLR4_5_298d98dlvlulija.R.inc(11991);__CLB4_5_2_bool0=true;}
                        case NAL_TYPE_RSV_NVCL41:if (!__CLB4_5_2_bool0) {__CLR4_5_298d98dlvlulija.R.inc(11992);__CLB4_5_2_bool0=true;}
                        case NAL_TYPE_RSV_NVCL42:if (!__CLB4_5_2_bool0) {__CLR4_5_298d98dlvlulija.R.inc(11993);__CLB4_5_2_bool0=true;}
                        case NAL_TYPE_RSV_NVCL43:if (!__CLB4_5_2_bool0) {__CLR4_5_298d98dlvlulija.R.inc(11994);__CLB4_5_2_bool0=true;}
                        case NAL_TYPE_RSV_NVCL44:if (!__CLB4_5_2_bool0) {__CLR4_5_298d98dlvlulija.R.inc(11995);__CLB4_5_2_bool0=true;}
                        case NAL_TYPE_UNSPEC48:if (!__CLB4_5_2_bool0) {__CLR4_5_298d98dlvlulija.R.inc(11996);__CLB4_5_2_bool0=true;}
                        case NAL_TYPE_UNSPEC49:if (!__CLB4_5_2_bool0) {__CLR4_5_298d98dlvlulija.R.inc(11997);__CLB4_5_2_bool0=true;}
                        case NAL_TYPE_UNSPEC50:if (!__CLB4_5_2_bool0) {__CLR4_5_298d98dlvlulija.R.inc(11998);__CLB4_5_2_bool0=true;}
                        case NAL_TYPE_UNSPEC51:if (!__CLB4_5_2_bool0) {__CLR4_5_298d98dlvlulija.R.inc(11999);__CLB4_5_2_bool0=true;}
                        case NAL_TYPE_UNSPEC52:if (!__CLB4_5_2_bool0) {__CLR4_5_298d98dlvlulija.R.inc(12000);__CLB4_5_2_bool0=true;}
                        case NAL_TYPE_UNSPEC53:if (!__CLB4_5_2_bool0) {__CLR4_5_298d98dlvlulija.R.inc(12001);__CLB4_5_2_bool0=true;}
                        case NAL_TYPE_UNSPEC54:if (!__CLB4_5_2_bool0) {__CLR4_5_298d98dlvlulija.R.inc(12002);__CLB4_5_2_bool0=true;}
                        case NAL_TYPE_UNSPEC55:if (!__CLB4_5_2_bool0) {__CLR4_5_298d98dlvlulija.R.inc(12003);__CLB4_5_2_bool0=true;}

                        case NAL_TYPE_EOB_NUT:if (!__CLB4_5_2_bool0) {__CLR4_5_298d98dlvlulija.R.inc(12004);__CLB4_5_2_bool0=true;} // a bit special but also causes a sample to be formed
                        case NAL_TYPE_EOS_NUT:if (!__CLB4_5_2_bool0) {__CLR4_5_298d98dlvlulija.R.inc(12005);__CLB4_5_2_bool0=true;}
                            __CLR4_5_298d98dlvlulija.R.inc(12006);wrapUp(nals, vclNalUnitSeenInAU, isIdr);
                            __CLR4_5_298d98dlvlulija.R.inc(12007);break;
                    }
                }
            }}
            // collect sps/vps/pps
            }boolean __CLB4_5_2_bool1=false;__CLR4_5_298d98dlvlulija.R.inc(12008);switch (unitHeader.nalUnitType) {
                case NAL_TYPE_PPS_NUT:if (!__CLB4_5_2_bool1) {__CLR4_5_298d98dlvlulija.R.inc(12009);__CLB4_5_2_bool1=true;}
                    __CLR4_5_298d98dlvlulija.R.inc(12010);nal.position(2);
                    __CLR4_5_298d98dlvlulija.R.inc(12011);pps.add(nal.slice());
                    __CLR4_5_298d98dlvlulija.R.inc(12012);System.err.println("Stored PPS");
                    __CLR4_5_298d98dlvlulija.R.inc(12013);break;
                case NAL_TYPE_VPS_NUT:if (!__CLB4_5_2_bool1) {__CLR4_5_298d98dlvlulija.R.inc(12014);__CLB4_5_2_bool1=true;}
                    __CLR4_5_298d98dlvlulija.R.inc(12015);nal.position(2);
                    __CLR4_5_298d98dlvlulija.R.inc(12016);vps.add(nal.slice());
                    __CLR4_5_298d98dlvlulija.R.inc(12017);System.err.println("Stored VPS");
                    __CLR4_5_298d98dlvlulija.R.inc(12018);break;
                case NAL_TYPE_SPS_NUT:if (!__CLB4_5_2_bool1) {__CLR4_5_298d98dlvlulija.R.inc(12019);__CLB4_5_2_bool1=true;}
                    __CLR4_5_298d98dlvlulija.R.inc(12020);nal.position(2);
                    __CLR4_5_298d98dlvlulija.R.inc(12021);sps.add(nal.slice());
                    __CLR4_5_298d98dlvlulija.R.inc(12022);nal.position(1);
                    __CLR4_5_298d98dlvlulija.R.inc(12023);new SequenceParameterSetRbsp(Channels.newInputStream(new ByteBufferByteChannel(nal.slice())));
                    __CLR4_5_298d98dlvlulija.R.inc(12024);System.err.println("Stored SPS");
                    __CLR4_5_298d98dlvlulija.R.inc(12025);break;
                case NAL_TYPE_PREFIX_SEI_NUT:if (!__CLB4_5_2_bool1) {__CLR4_5_298d98dlvlulija.R.inc(12026);__CLB4_5_2_bool1=true;}
                    __CLR4_5_298d98dlvlulija.R.inc(12027);new SEIMessage(new BitReaderBuffer(nal.slice()));
                    __CLR4_5_298d98dlvlulija.R.inc(12028);break;
            }


            boolean __CLB4_5_2_bool2=false;__CLR4_5_298d98dlvlulija.R.inc(12029);switch (unitHeader.nalUnitType) {
                case NAL_TYPE_SPS_NUT:if (!__CLB4_5_2_bool2) {__CLR4_5_298d98dlvlulija.R.inc(12030);__CLB4_5_2_bool2=true;}
                case NAL_TYPE_VPS_NUT:if (!__CLB4_5_2_bool2) {__CLR4_5_298d98dlvlulija.R.inc(12031);__CLB4_5_2_bool2=true;}
                case NAL_TYPE_PPS_NUT:if (!__CLB4_5_2_bool2) {__CLR4_5_298d98dlvlulija.R.inc(12032);__CLB4_5_2_bool2=true;}
                case NAL_TYPE_EOB_NUT:if (!__CLB4_5_2_bool2) {__CLR4_5_298d98dlvlulija.R.inc(12033);__CLB4_5_2_bool2=true;}
                case NAL_TYPE_EOS_NUT:if (!__CLB4_5_2_bool2) {__CLR4_5_298d98dlvlulija.R.inc(12034);__CLB4_5_2_bool2=true;}
                case NAL_TYPE_AUD_NUT:if (!__CLB4_5_2_bool2) {__CLR4_5_298d98dlvlulija.R.inc(12035);__CLB4_5_2_bool2=true;}
                case NAL_TYPE_FD_NUT:if (!__CLB4_5_2_bool2) {__CLR4_5_298d98dlvlulija.R.inc(12036);__CLB4_5_2_bool2=true;}
                    // ignore these
                    __CLR4_5_298d98dlvlulija.R.inc(12037);break;
                default:if (!__CLB4_5_2_bool2) {__CLR4_5_298d98dlvlulija.R.inc(12038);__CLB4_5_2_bool2=true;}
                    __CLR4_5_298d98dlvlulija.R.inc(12039);System.err.println("Adding " + unitHeader.nalUnitType);
                    __CLR4_5_298d98dlvlulija.R.inc(12040);nals.add(nal);
            }
            __CLR4_5_298d98dlvlulija.R.inc(12041);if ((((isVcl(unitHeader))&&(__CLR4_5_298d98dlvlulija.R.iget(12042)!=0|true))||(__CLR4_5_298d98dlvlulija.R.iget(12043)==0&false))) {{
                boolean __CLB4_5_2_bool3=false;__CLR4_5_298d98dlvlulija.R.inc(12044);switch (unitHeader.nalUnitType) {
                    case NAL_TYPE_IDR_W_RADL:if (!__CLB4_5_2_bool3) {__CLR4_5_298d98dlvlulija.R.inc(12045);__CLB4_5_2_bool3=true;}
                    case NAL_TYPE_IDR_N_LP:if (!__CLB4_5_2_bool3) {__CLR4_5_298d98dlvlulija.R.inc(12046);__CLB4_5_2_bool3=true;}
                        __CLR4_5_298d98dlvlulija.R.inc(12047);isIdr[0] &= true;
                        __CLR4_5_298d98dlvlulija.R.inc(12048);break;
                    default:if (!__CLB4_5_2_bool3) {__CLR4_5_298d98dlvlulija.R.inc(12049);__CLB4_5_2_bool3=true;}
                        __CLR4_5_298d98dlvlulija.R.inc(12050);isIdr[0] = false;
                }
            }

            }__CLR4_5_298d98dlvlulija.R.inc(12051);vclNalUnitSeenInAU[0] |= isVcl(unitHeader);

        }
        }__CLR4_5_298d98dlvlulija.R.inc(12052);stsd = createSampleDescriptionBox();
        __CLR4_5_298d98dlvlulija.R.inc(12053);decodingTimes = new long[samples.size()];
        __CLR4_5_298d98dlvlulija.R.inc(12054);getTrackMetaData().setTimescale(25);
        __CLR4_5_298d98dlvlulija.R.inc(12055);Arrays.fill(decodingTimes, 1);
    }finally{__CLR4_5_298d98dlvlulija.R.flushNeeded();}}

    private SampleDescriptionBox createSampleDescriptionBox() {try{__CLR4_5_298d98dlvlulija.R.inc(12056);

        __CLR4_5_298d98dlvlulija.R.inc(12057);stsd = new SampleDescriptionBox();
        __CLR4_5_298d98dlvlulija.R.inc(12058);VisualSampleEntry visualSampleEntry = new VisualSampleEntry("hvc1");
        __CLR4_5_298d98dlvlulija.R.inc(12059);visualSampleEntry.setDataReferenceIndex(1);
        __CLR4_5_298d98dlvlulija.R.inc(12060);visualSampleEntry.setDepth(24);
        __CLR4_5_298d98dlvlulija.R.inc(12061);visualSampleEntry.setFrameCount(1);
        __CLR4_5_298d98dlvlulija.R.inc(12062);visualSampleEntry.setHorizresolution(72);
        __CLR4_5_298d98dlvlulija.R.inc(12063);visualSampleEntry.setVertresolution(72);
        __CLR4_5_298d98dlvlulija.R.inc(12064);visualSampleEntry.setWidth(640);
        __CLR4_5_298d98dlvlulija.R.inc(12065);visualSampleEntry.setHeight(480);
        __CLR4_5_298d98dlvlulija.R.inc(12066);visualSampleEntry.setCompressorname("HEVC Coding");

        __CLR4_5_298d98dlvlulija.R.inc(12067);HevcConfigurationBox hevcConfigurationBox = new HevcConfigurationBox();

        __CLR4_5_298d98dlvlulija.R.inc(12068);HevcDecoderConfigurationRecord.Array spsArray = new HevcDecoderConfigurationRecord.Array();
        __CLR4_5_298d98dlvlulija.R.inc(12069);spsArray.array_completeness = true;
        __CLR4_5_298d98dlvlulija.R.inc(12070);spsArray.nal_unit_type = NAL_TYPE_SPS_NUT;
        __CLR4_5_298d98dlvlulija.R.inc(12071);spsArray.nalUnits = new ArrayList<byte[]>();
        __CLR4_5_298d98dlvlulija.R.inc(12072);for (ByteBuffer sp : sps) {{
            __CLR4_5_298d98dlvlulija.R.inc(12073);spsArray.nalUnits.add(toArray(sp));
        }

        }__CLR4_5_298d98dlvlulija.R.inc(12074);HevcDecoderConfigurationRecord.Array ppsArray = new HevcDecoderConfigurationRecord.Array();
        __CLR4_5_298d98dlvlulija.R.inc(12075);ppsArray.array_completeness = true;
        __CLR4_5_298d98dlvlulija.R.inc(12076);ppsArray.nal_unit_type = NAL_TYPE_PPS_NUT;
        __CLR4_5_298d98dlvlulija.R.inc(12077);ppsArray.nalUnits = new ArrayList<byte[]>();
        __CLR4_5_298d98dlvlulija.R.inc(12078);for (ByteBuffer pp : pps) {{
            __CLR4_5_298d98dlvlulija.R.inc(12079);ppsArray.nalUnits.add(toArray(pp));
        }

        }__CLR4_5_298d98dlvlulija.R.inc(12080);HevcDecoderConfigurationRecord.Array vpsArray = new HevcDecoderConfigurationRecord.Array();
        __CLR4_5_298d98dlvlulija.R.inc(12081);vpsArray.array_completeness = true;
        __CLR4_5_298d98dlvlulija.R.inc(12082);vpsArray.nal_unit_type = NAL_TYPE_PPS_NUT;
        __CLR4_5_298d98dlvlulija.R.inc(12083);vpsArray.nalUnits = new ArrayList<byte[]>();
        __CLR4_5_298d98dlvlulija.R.inc(12084);for (ByteBuffer vp : vps) {{
            __CLR4_5_298d98dlvlulija.R.inc(12085);vpsArray.nalUnits.add(toArray(vp));
        }

        }__CLR4_5_298d98dlvlulija.R.inc(12086);hevcConfigurationBox.getArrays().addAll(Arrays.asList(spsArray, vpsArray, ppsArray));

        __CLR4_5_298d98dlvlulija.R.inc(12087);visualSampleEntry.addBox(hevcConfigurationBox);
        __CLR4_5_298d98dlvlulija.R.inc(12088);stsd.addBox(visualSampleEntry);

        __CLR4_5_298d98dlvlulija.R.inc(12089);return stsd;
    }finally{__CLR4_5_298d98dlvlulija.R.flushNeeded();}}


    public void wrapUp(List<ByteBuffer> nals, boolean[] vclNalUnitSeenInAU, boolean[] isIdr) {try{__CLR4_5_298d98dlvlulija.R.inc(12090);

        __CLR4_5_298d98dlvlulija.R.inc(12091);samples.add(createSampleObject(nals));
        __CLR4_5_298d98dlvlulija.R.inc(12092);System.err.print("Create AU from " + nals.size() + " NALs");
        __CLR4_5_298d98dlvlulija.R.inc(12093);if ((((isIdr[0])&&(__CLR4_5_298d98dlvlulija.R.iget(12094)!=0|true))||(__CLR4_5_298d98dlvlulija.R.iget(12095)==0&false))) {{
            __CLR4_5_298d98dlvlulija.R.inc(12096);System.err.println("  IDR");
        } }else {{
            __CLR4_5_298d98dlvlulija.R.inc(12097);System.err.println();
        }
        }__CLR4_5_298d98dlvlulija.R.inc(12098);vclNalUnitSeenInAU[0] = false;
        __CLR4_5_298d98dlvlulija.R.inc(12099);isIdr[0] = true;
        __CLR4_5_298d98dlvlulija.R.inc(12100);nals.clear();
    }finally{__CLR4_5_298d98dlvlulija.R.flushNeeded();}}


    public SampleDescriptionBox getSampleDescriptionBox() {try{__CLR4_5_298d98dlvlulija.R.inc(12101);
        __CLR4_5_298d98dlvlulija.R.inc(12102);return null;
    }finally{__CLR4_5_298d98dlvlulija.R.flushNeeded();}}


    public String getHandler() {try{__CLR4_5_298d98dlvlulija.R.inc(12103);
        __CLR4_5_298d98dlvlulija.R.inc(12104);return "vide";
    }finally{__CLR4_5_298d98dlvlulija.R.flushNeeded();}}

    public List<Sample> getSamples() {try{__CLR4_5_298d98dlvlulija.R.inc(12105);
        __CLR4_5_298d98dlvlulija.R.inc(12106);return samples;
    }finally{__CLR4_5_298d98dlvlulija.R.flushNeeded();}}


    boolean isVcl(H265NalUnitHeader nalUnitHeader) {try{__CLR4_5_298d98dlvlulija.R.inc(12107);
        __CLR4_5_298d98dlvlulija.R.inc(12108);return nalUnitHeader.nalUnitType >= 0 && nalUnitHeader.nalUnitType <= 31;
    }finally{__CLR4_5_298d98dlvlulija.R.flushNeeded();}}

    public static H265NalUnitHeader getNalUnitHeader(ByteBuffer nal) {try{__CLR4_5_298d98dlvlulija.R.inc(12109);
        __CLR4_5_298d98dlvlulija.R.inc(12110);nal.position(0);
        __CLR4_5_298d98dlvlulija.R.inc(12111);int nal_unit_header = IsoTypeReader.readUInt16(nal);


        __CLR4_5_298d98dlvlulija.R.inc(12112);H265NalUnitHeader nalUnitHeader = new H265NalUnitHeader();
        __CLR4_5_298d98dlvlulija.R.inc(12113);nalUnitHeader.forbiddenZeroFlag = (nal_unit_header & 0x8000) >> 15;
        __CLR4_5_298d98dlvlulija.R.inc(12114);nalUnitHeader.nalUnitType = (nal_unit_header & 0x7E00) >> 9;
        __CLR4_5_298d98dlvlulija.R.inc(12115);nalUnitHeader.nuhLayerId = (nal_unit_header & 0x1F8) >> 3;
        __CLR4_5_298d98dlvlulija.R.inc(12116);nalUnitHeader.nuhTemporalIdPlusOne = (nal_unit_header & 0x7);
        __CLR4_5_298d98dlvlulija.R.inc(12117);return nalUnitHeader;
    }finally{__CLR4_5_298d98dlvlulija.R.flushNeeded();}}


    public static void main(String[] args) throws IOException {try{__CLR4_5_298d98dlvlulija.R.inc(12118);
        __CLR4_5_298d98dlvlulija.R.inc(12119);Track track = new H265TrackImpl(new FileDataSourceImpl("c:\\content\\test-UHD-HEVC_01_FMV_Med_track1.hvc"));
        __CLR4_5_298d98dlvlulija.R.inc(12120);Movie movie = new Movie();
        __CLR4_5_298d98dlvlulija.R.inc(12121);movie.addTrack(track);
        __CLR4_5_298d98dlvlulija.R.inc(12122);DefaultMp4Builder mp4Builder = new DefaultMp4Builder();
        __CLR4_5_298d98dlvlulija.R.inc(12123);Container c = mp4Builder.build(movie);
        __CLR4_5_298d98dlvlulija.R.inc(12124);c.writeContainer(new FileOutputStream("output.mp4").getChannel());

    }finally{__CLR4_5_298d98dlvlulija.R.flushNeeded();}}

}
