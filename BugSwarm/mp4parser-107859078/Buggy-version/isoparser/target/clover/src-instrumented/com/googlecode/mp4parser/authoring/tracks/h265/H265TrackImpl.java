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
@java.lang.SuppressWarnings({"fallthrough"}) public class H265TrackImpl extends AbstractH26XTrack implements H265NalUnitTypes {public static class __CLR4_5_295q95qlvl9eioj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,12030,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    ArrayList<ByteBuffer> sps = new ArrayList<ByteBuffer>();
    ArrayList<ByteBuffer> pps = new ArrayList<ByteBuffer>();
    ArrayList<ByteBuffer> vps = new ArrayList<ByteBuffer>();
    ArrayList<Sample> samples = new ArrayList<Sample>();

    SampleDescriptionBox stsd;

    public H265TrackImpl(DataSource dataSource) throws IOException {
        super(dataSource);__CLR4_5_295q95qlvl9eioj.R.inc(11871);try{__CLR4_5_295q95qlvl9eioj.R.inc(11870);
        __CLR4_5_295q95qlvl9eioj.R.inc(11872);ArrayList<ByteBuffer> nals = new ArrayList<ByteBuffer>();
        __CLR4_5_295q95qlvl9eioj.R.inc(11873);LookAhead la = new LookAhead(dataSource);
        __CLR4_5_295q95qlvl9eioj.R.inc(11874);ByteBuffer nal;
        __CLR4_5_295q95qlvl9eioj.R.inc(11875);boolean[] vclNalUnitSeenInAU = new boolean[]{false};
        __CLR4_5_295q95qlvl9eioj.R.inc(11876);boolean[] isIdr = new boolean[]{true};


        __CLR4_5_295q95qlvl9eioj.R.inc(11877);while ((nal = findNextNal(la)) != null) {{

            __CLR4_5_295q95qlvl9eioj.R.inc(11880);H265NalUnitHeader unitHeader = getNalUnitHeader(nal);
            //
            __CLR4_5_295q95qlvl9eioj.R.inc(11881);if ((((vclNalUnitSeenInAU[0])&&(__CLR4_5_295q95qlvl9eioj.R.iget(11882)!=0|true))||(__CLR4_5_295q95qlvl9eioj.R.iget(11883)==0&false))) {{ // we need at least 1 VCL per AU
                // This branch checks if we encountered the start of a samples/AU
                __CLR4_5_295q95qlvl9eioj.R.inc(11884);if ((((isVcl(unitHeader))&&(__CLR4_5_295q95qlvl9eioj.R.iget(11885)!=0|true))||(__CLR4_5_295q95qlvl9eioj.R.iget(11886)==0&false))) {{
                    __CLR4_5_295q95qlvl9eioj.R.inc(11887);if (((((nal.get(2) & -128) != 0)&&(__CLR4_5_295q95qlvl9eioj.R.iget(11888)!=0|true))||(__CLR4_5_295q95qlvl9eioj.R.iget(11889)==0&false))) {{ // this is: first_slice_segment_in_pic_flag  u(1)
                        __CLR4_5_295q95qlvl9eioj.R.inc(11890);wrapUp(nals, vclNalUnitSeenInAU, isIdr);
                    }
                }} }else {{
                    boolean __CLB4_5_2_bool0=false;__CLR4_5_295q95qlvl9eioj.R.inc(11891);switch (unitHeader.nalUnitType) {
                        case NAL_TYPE_PREFIX_SEI_NUT:if (!__CLB4_5_2_bool0) {__CLR4_5_295q95qlvl9eioj.R.inc(11892);__CLB4_5_2_bool0=true;}
                        case NAL_TYPE_AUD_NUT:if (!__CLB4_5_2_bool0) {__CLR4_5_295q95qlvl9eioj.R.inc(11893);__CLB4_5_2_bool0=true;}
                        case NAL_TYPE_PPS_NUT:if (!__CLB4_5_2_bool0) {__CLR4_5_295q95qlvl9eioj.R.inc(11894);__CLB4_5_2_bool0=true;}
                        case NAL_TYPE_VPS_NUT:if (!__CLB4_5_2_bool0) {__CLR4_5_295q95qlvl9eioj.R.inc(11895);__CLB4_5_2_bool0=true;}
                        case NAL_TYPE_SPS_NUT:if (!__CLB4_5_2_bool0) {__CLR4_5_295q95qlvl9eioj.R.inc(11896);__CLB4_5_2_bool0=true;}
                        case NAL_TYPE_RSV_NVCL41:if (!__CLB4_5_2_bool0) {__CLR4_5_295q95qlvl9eioj.R.inc(11897);__CLB4_5_2_bool0=true;}
                        case NAL_TYPE_RSV_NVCL42:if (!__CLB4_5_2_bool0) {__CLR4_5_295q95qlvl9eioj.R.inc(11898);__CLB4_5_2_bool0=true;}
                        case NAL_TYPE_RSV_NVCL43:if (!__CLB4_5_2_bool0) {__CLR4_5_295q95qlvl9eioj.R.inc(11899);__CLB4_5_2_bool0=true;}
                        case NAL_TYPE_RSV_NVCL44:if (!__CLB4_5_2_bool0) {__CLR4_5_295q95qlvl9eioj.R.inc(11900);__CLB4_5_2_bool0=true;}
                        case NAL_TYPE_UNSPEC48:if (!__CLB4_5_2_bool0) {__CLR4_5_295q95qlvl9eioj.R.inc(11901);__CLB4_5_2_bool0=true;}
                        case NAL_TYPE_UNSPEC49:if (!__CLB4_5_2_bool0) {__CLR4_5_295q95qlvl9eioj.R.inc(11902);__CLB4_5_2_bool0=true;}
                        case NAL_TYPE_UNSPEC50:if (!__CLB4_5_2_bool0) {__CLR4_5_295q95qlvl9eioj.R.inc(11903);__CLB4_5_2_bool0=true;}
                        case NAL_TYPE_UNSPEC51:if (!__CLB4_5_2_bool0) {__CLR4_5_295q95qlvl9eioj.R.inc(11904);__CLB4_5_2_bool0=true;}
                        case NAL_TYPE_UNSPEC52:if (!__CLB4_5_2_bool0) {__CLR4_5_295q95qlvl9eioj.R.inc(11905);__CLB4_5_2_bool0=true;}
                        case NAL_TYPE_UNSPEC53:if (!__CLB4_5_2_bool0) {__CLR4_5_295q95qlvl9eioj.R.inc(11906);__CLB4_5_2_bool0=true;}
                        case NAL_TYPE_UNSPEC54:if (!__CLB4_5_2_bool0) {__CLR4_5_295q95qlvl9eioj.R.inc(11907);__CLB4_5_2_bool0=true;}
                        case NAL_TYPE_UNSPEC55:if (!__CLB4_5_2_bool0) {__CLR4_5_295q95qlvl9eioj.R.inc(11908);__CLB4_5_2_bool0=true;}

                        case NAL_TYPE_EOB_NUT:if (!__CLB4_5_2_bool0) {__CLR4_5_295q95qlvl9eioj.R.inc(11909);__CLB4_5_2_bool0=true;} // a bit special but also causes a sample to be formed
                        case NAL_TYPE_EOS_NUT:if (!__CLB4_5_2_bool0) {__CLR4_5_295q95qlvl9eioj.R.inc(11910);__CLB4_5_2_bool0=true;}
                            __CLR4_5_295q95qlvl9eioj.R.inc(11911);wrapUp(nals, vclNalUnitSeenInAU, isIdr);
                            __CLR4_5_295q95qlvl9eioj.R.inc(11912);break;
                    }
                }
            }}
            // collect sps/vps/pps
            }boolean __CLB4_5_2_bool1=false;__CLR4_5_295q95qlvl9eioj.R.inc(11913);switch (unitHeader.nalUnitType) {
                case NAL_TYPE_PPS_NUT:if (!__CLB4_5_2_bool1) {__CLR4_5_295q95qlvl9eioj.R.inc(11914);__CLB4_5_2_bool1=true;}
                    __CLR4_5_295q95qlvl9eioj.R.inc(11915);nal.position(2);
                    __CLR4_5_295q95qlvl9eioj.R.inc(11916);pps.add(nal.slice());
                    __CLR4_5_295q95qlvl9eioj.R.inc(11917);System.err.println("Stored PPS");
                    __CLR4_5_295q95qlvl9eioj.R.inc(11918);break;
                case NAL_TYPE_VPS_NUT:if (!__CLB4_5_2_bool1) {__CLR4_5_295q95qlvl9eioj.R.inc(11919);__CLB4_5_2_bool1=true;}
                    __CLR4_5_295q95qlvl9eioj.R.inc(11920);nal.position(2);
                    __CLR4_5_295q95qlvl9eioj.R.inc(11921);vps.add(nal.slice());
                    __CLR4_5_295q95qlvl9eioj.R.inc(11922);System.err.println("Stored VPS");
                    __CLR4_5_295q95qlvl9eioj.R.inc(11923);break;
                case NAL_TYPE_SPS_NUT:if (!__CLB4_5_2_bool1) {__CLR4_5_295q95qlvl9eioj.R.inc(11924);__CLB4_5_2_bool1=true;}
                    __CLR4_5_295q95qlvl9eioj.R.inc(11925);nal.position(2);
                    __CLR4_5_295q95qlvl9eioj.R.inc(11926);sps.add(nal.slice());
                    __CLR4_5_295q95qlvl9eioj.R.inc(11927);nal.position(1);
                    __CLR4_5_295q95qlvl9eioj.R.inc(11928);new SequenceParameterSetRbsp(Channels.newInputStream(new ByteBufferByteChannel(nal.slice())));
                    __CLR4_5_295q95qlvl9eioj.R.inc(11929);System.err.println("Stored SPS");
                    __CLR4_5_295q95qlvl9eioj.R.inc(11930);break;
                case NAL_TYPE_PREFIX_SEI_NUT:if (!__CLB4_5_2_bool1) {__CLR4_5_295q95qlvl9eioj.R.inc(11931);__CLB4_5_2_bool1=true;}
                    __CLR4_5_295q95qlvl9eioj.R.inc(11932);new SEIMessage(new BitReaderBuffer(nal.slice()));
                    __CLR4_5_295q95qlvl9eioj.R.inc(11933);break;
            }


            boolean __CLB4_5_2_bool2=false;__CLR4_5_295q95qlvl9eioj.R.inc(11934);switch (unitHeader.nalUnitType) {
                case NAL_TYPE_SPS_NUT:if (!__CLB4_5_2_bool2) {__CLR4_5_295q95qlvl9eioj.R.inc(11935);__CLB4_5_2_bool2=true;}
                case NAL_TYPE_VPS_NUT:if (!__CLB4_5_2_bool2) {__CLR4_5_295q95qlvl9eioj.R.inc(11936);__CLB4_5_2_bool2=true;}
                case NAL_TYPE_PPS_NUT:if (!__CLB4_5_2_bool2) {__CLR4_5_295q95qlvl9eioj.R.inc(11937);__CLB4_5_2_bool2=true;}
                case NAL_TYPE_EOB_NUT:if (!__CLB4_5_2_bool2) {__CLR4_5_295q95qlvl9eioj.R.inc(11938);__CLB4_5_2_bool2=true;}
                case NAL_TYPE_EOS_NUT:if (!__CLB4_5_2_bool2) {__CLR4_5_295q95qlvl9eioj.R.inc(11939);__CLB4_5_2_bool2=true;}
                case NAL_TYPE_AUD_NUT:if (!__CLB4_5_2_bool2) {__CLR4_5_295q95qlvl9eioj.R.inc(11940);__CLB4_5_2_bool2=true;}
                case NAL_TYPE_FD_NUT:if (!__CLB4_5_2_bool2) {__CLR4_5_295q95qlvl9eioj.R.inc(11941);__CLB4_5_2_bool2=true;}
                    // ignore these
                    __CLR4_5_295q95qlvl9eioj.R.inc(11942);break;
                default:if (!__CLB4_5_2_bool2) {__CLR4_5_295q95qlvl9eioj.R.inc(11943);__CLB4_5_2_bool2=true;}
                    __CLR4_5_295q95qlvl9eioj.R.inc(11944);System.err.println("Adding " + unitHeader.nalUnitType);
                    __CLR4_5_295q95qlvl9eioj.R.inc(11945);nals.add(nal);
            }
            __CLR4_5_295q95qlvl9eioj.R.inc(11946);if ((((isVcl(unitHeader))&&(__CLR4_5_295q95qlvl9eioj.R.iget(11947)!=0|true))||(__CLR4_5_295q95qlvl9eioj.R.iget(11948)==0&false))) {{
                boolean __CLB4_5_2_bool3=false;__CLR4_5_295q95qlvl9eioj.R.inc(11949);switch (unitHeader.nalUnitType) {
                    case NAL_TYPE_IDR_W_RADL:if (!__CLB4_5_2_bool3) {__CLR4_5_295q95qlvl9eioj.R.inc(11950);__CLB4_5_2_bool3=true;}
                    case NAL_TYPE_IDR_N_LP:if (!__CLB4_5_2_bool3) {__CLR4_5_295q95qlvl9eioj.R.inc(11951);__CLB4_5_2_bool3=true;}
                        __CLR4_5_295q95qlvl9eioj.R.inc(11952);isIdr[0] &= true;
                        __CLR4_5_295q95qlvl9eioj.R.inc(11953);break;
                    default:if (!__CLB4_5_2_bool3) {__CLR4_5_295q95qlvl9eioj.R.inc(11954);__CLB4_5_2_bool3=true;}
                        __CLR4_5_295q95qlvl9eioj.R.inc(11955);isIdr[0] = false;
                }
            }

            }__CLR4_5_295q95qlvl9eioj.R.inc(11956);vclNalUnitSeenInAU[0] |= isVcl(unitHeader);

        }
        }__CLR4_5_295q95qlvl9eioj.R.inc(11957);stsd = createSampleDescriptionBox();
        __CLR4_5_295q95qlvl9eioj.R.inc(11958);decodingTimes = new long[samples.size()];
        __CLR4_5_295q95qlvl9eioj.R.inc(11959);getTrackMetaData().setTimescale(25);
        __CLR4_5_295q95qlvl9eioj.R.inc(11960);Arrays.fill(decodingTimes, 1);
    }finally{__CLR4_5_295q95qlvl9eioj.R.flushNeeded();}}

    private SampleDescriptionBox createSampleDescriptionBox() {try{__CLR4_5_295q95qlvl9eioj.R.inc(11961);

        __CLR4_5_295q95qlvl9eioj.R.inc(11962);stsd = new SampleDescriptionBox();
        __CLR4_5_295q95qlvl9eioj.R.inc(11963);VisualSampleEntry visualSampleEntry = new VisualSampleEntry("hvc1");
        __CLR4_5_295q95qlvl9eioj.R.inc(11964);visualSampleEntry.setDataReferenceIndex(1);
        __CLR4_5_295q95qlvl9eioj.R.inc(11965);visualSampleEntry.setDepth(24);
        __CLR4_5_295q95qlvl9eioj.R.inc(11966);visualSampleEntry.setFrameCount(1);
        __CLR4_5_295q95qlvl9eioj.R.inc(11967);visualSampleEntry.setHorizresolution(72);
        __CLR4_5_295q95qlvl9eioj.R.inc(11968);visualSampleEntry.setVertresolution(72);
        __CLR4_5_295q95qlvl9eioj.R.inc(11969);visualSampleEntry.setWidth(640);
        __CLR4_5_295q95qlvl9eioj.R.inc(11970);visualSampleEntry.setHeight(480);
        __CLR4_5_295q95qlvl9eioj.R.inc(11971);visualSampleEntry.setCompressorname("HEVC Coding");

        __CLR4_5_295q95qlvl9eioj.R.inc(11972);HevcConfigurationBox hevcConfigurationBox = new HevcConfigurationBox();

        __CLR4_5_295q95qlvl9eioj.R.inc(11973);HevcDecoderConfigurationRecord.Array spsArray = new HevcDecoderConfigurationRecord.Array();
        __CLR4_5_295q95qlvl9eioj.R.inc(11974);spsArray.array_completeness = true;
        __CLR4_5_295q95qlvl9eioj.R.inc(11975);spsArray.nal_unit_type = NAL_TYPE_SPS_NUT;
        __CLR4_5_295q95qlvl9eioj.R.inc(11976);spsArray.nalUnits = new ArrayList<byte[]>();
        __CLR4_5_295q95qlvl9eioj.R.inc(11977);for (ByteBuffer sp : sps) {{
            __CLR4_5_295q95qlvl9eioj.R.inc(11978);spsArray.nalUnits.add(toArray(sp));
        }

        }__CLR4_5_295q95qlvl9eioj.R.inc(11979);HevcDecoderConfigurationRecord.Array ppsArray = new HevcDecoderConfigurationRecord.Array();
        __CLR4_5_295q95qlvl9eioj.R.inc(11980);ppsArray.array_completeness = true;
        __CLR4_5_295q95qlvl9eioj.R.inc(11981);ppsArray.nal_unit_type = NAL_TYPE_PPS_NUT;
        __CLR4_5_295q95qlvl9eioj.R.inc(11982);ppsArray.nalUnits = new ArrayList<byte[]>();
        __CLR4_5_295q95qlvl9eioj.R.inc(11983);for (ByteBuffer pp : pps) {{
            __CLR4_5_295q95qlvl9eioj.R.inc(11984);ppsArray.nalUnits.add(toArray(pp));
        }

        }__CLR4_5_295q95qlvl9eioj.R.inc(11985);HevcDecoderConfigurationRecord.Array vpsArray = new HevcDecoderConfigurationRecord.Array();
        __CLR4_5_295q95qlvl9eioj.R.inc(11986);vpsArray.array_completeness = true;
        __CLR4_5_295q95qlvl9eioj.R.inc(11987);vpsArray.nal_unit_type = NAL_TYPE_PPS_NUT;
        __CLR4_5_295q95qlvl9eioj.R.inc(11988);vpsArray.nalUnits = new ArrayList<byte[]>();
        __CLR4_5_295q95qlvl9eioj.R.inc(11989);for (ByteBuffer vp : vps) {{
            __CLR4_5_295q95qlvl9eioj.R.inc(11990);vpsArray.nalUnits.add(toArray(vp));
        }

        }__CLR4_5_295q95qlvl9eioj.R.inc(11991);hevcConfigurationBox.getArrays().addAll(Arrays.asList(spsArray, vpsArray, ppsArray));

        __CLR4_5_295q95qlvl9eioj.R.inc(11992);visualSampleEntry.addBox(hevcConfigurationBox);
        __CLR4_5_295q95qlvl9eioj.R.inc(11993);stsd.addBox(visualSampleEntry);

        __CLR4_5_295q95qlvl9eioj.R.inc(11994);return stsd;
    }finally{__CLR4_5_295q95qlvl9eioj.R.flushNeeded();}}


    public void wrapUp(List<ByteBuffer> nals, boolean[] vclNalUnitSeenInAU, boolean[] isIdr) {try{__CLR4_5_295q95qlvl9eioj.R.inc(11995);

        __CLR4_5_295q95qlvl9eioj.R.inc(11996);samples.add(createSampleObject(nals));
        __CLR4_5_295q95qlvl9eioj.R.inc(11997);System.err.print("Create AU from " + nals.size() + " NALs");
        __CLR4_5_295q95qlvl9eioj.R.inc(11998);if ((((isIdr[0])&&(__CLR4_5_295q95qlvl9eioj.R.iget(11999)!=0|true))||(__CLR4_5_295q95qlvl9eioj.R.iget(12000)==0&false))) {{
            __CLR4_5_295q95qlvl9eioj.R.inc(12001);System.err.println("  IDR");
        } }else {{
            __CLR4_5_295q95qlvl9eioj.R.inc(12002);System.err.println();
        }
        }__CLR4_5_295q95qlvl9eioj.R.inc(12003);vclNalUnitSeenInAU[0] = false;
        __CLR4_5_295q95qlvl9eioj.R.inc(12004);isIdr[0] = true;
        __CLR4_5_295q95qlvl9eioj.R.inc(12005);nals.clear();
    }finally{__CLR4_5_295q95qlvl9eioj.R.flushNeeded();}}


    public SampleDescriptionBox getSampleDescriptionBox() {try{__CLR4_5_295q95qlvl9eioj.R.inc(12006);
        __CLR4_5_295q95qlvl9eioj.R.inc(12007);return null;
    }finally{__CLR4_5_295q95qlvl9eioj.R.flushNeeded();}}


    public String getHandler() {try{__CLR4_5_295q95qlvl9eioj.R.inc(12008);
        __CLR4_5_295q95qlvl9eioj.R.inc(12009);return "vide";
    }finally{__CLR4_5_295q95qlvl9eioj.R.flushNeeded();}}

    public List<Sample> getSamples() {try{__CLR4_5_295q95qlvl9eioj.R.inc(12010);
        __CLR4_5_295q95qlvl9eioj.R.inc(12011);return samples;
    }finally{__CLR4_5_295q95qlvl9eioj.R.flushNeeded();}}


    boolean isVcl(H265NalUnitHeader nalUnitHeader) {try{__CLR4_5_295q95qlvl9eioj.R.inc(12012);
        __CLR4_5_295q95qlvl9eioj.R.inc(12013);return nalUnitHeader.nalUnitType >= 0 && nalUnitHeader.nalUnitType <= 31;
    }finally{__CLR4_5_295q95qlvl9eioj.R.flushNeeded();}}

    public static H265NalUnitHeader getNalUnitHeader(ByteBuffer nal) {try{__CLR4_5_295q95qlvl9eioj.R.inc(12014);
        __CLR4_5_295q95qlvl9eioj.R.inc(12015);nal.position(0);
        __CLR4_5_295q95qlvl9eioj.R.inc(12016);int nal_unit_header = IsoTypeReader.readUInt16(nal);


        __CLR4_5_295q95qlvl9eioj.R.inc(12017);H265NalUnitHeader nalUnitHeader = new H265NalUnitHeader();
        __CLR4_5_295q95qlvl9eioj.R.inc(12018);nalUnitHeader.forbiddenZeroFlag = (nal_unit_header & 0x8000) >> 15;
        __CLR4_5_295q95qlvl9eioj.R.inc(12019);nalUnitHeader.nalUnitType = (nal_unit_header & 0x7E00) >> 9;
        __CLR4_5_295q95qlvl9eioj.R.inc(12020);nalUnitHeader.nuhLayerId = (nal_unit_header & 0x1F8) >> 3;
        __CLR4_5_295q95qlvl9eioj.R.inc(12021);nalUnitHeader.nuhTemporalIdPlusOne = (nal_unit_header & 0x7);
        __CLR4_5_295q95qlvl9eioj.R.inc(12022);return nalUnitHeader;
    }finally{__CLR4_5_295q95qlvl9eioj.R.flushNeeded();}}


    public static void main(String[] args) throws IOException {try{__CLR4_5_295q95qlvl9eioj.R.inc(12023);
        __CLR4_5_295q95qlvl9eioj.R.inc(12024);Track track = new H265TrackImpl(new FileDataSourceImpl("c:\\content\\test-UHD-HEVC_01_FMV_Med_track1.hvc"));
        __CLR4_5_295q95qlvl9eioj.R.inc(12025);Movie movie = new Movie();
        __CLR4_5_295q95qlvl9eioj.R.inc(12026);movie.addTrack(track);
        __CLR4_5_295q95qlvl9eioj.R.inc(12027);DefaultMp4Builder mp4Builder = new DefaultMp4Builder();
        __CLR4_5_295q95qlvl9eioj.R.inc(12028);Container c = mp4Builder.build(movie);
        __CLR4_5_295q95qlvl9eioj.R.inc(12029);c.writeContainer(new FileOutputStream("output.mp4").getChannel());

    }finally{__CLR4_5_295q95qlvl9eioj.R.flushNeeded();}}

}
