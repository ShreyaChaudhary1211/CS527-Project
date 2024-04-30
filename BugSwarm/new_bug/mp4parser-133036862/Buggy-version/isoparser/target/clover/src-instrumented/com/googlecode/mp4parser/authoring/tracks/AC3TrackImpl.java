/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.boxes.*;
import com.coremedia.iso.boxes.sampleentry.AudioSampleEntry;
import com.googlecode.mp4parser.DataSource;
import com.googlecode.mp4parser.authoring.AbstractTrack;
import com.googlecode.mp4parser.authoring.Sample;
import com.googlecode.mp4parser.authoring.SampleImpl;
import com.googlecode.mp4parser.authoring.TrackMetaData;
import com.googlecode.mp4parser.boxes.AC3SpecificBox;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBuffer;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.*;

@java.lang.SuppressWarnings({"fallthrough"}) public class AC3TrackImpl extends AbstractTrack {public static class __CLR4_5_265b65blvlulgsz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,8366,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    static int[][][][] bitRateAndFrameSizeTable;
    private final DataSource dataSource;
    private List<Sample> samples;
    private long[] duration;
    private TrackMetaData trackMetaData = new TrackMetaData();
    private SampleDescriptionBox sampleDescriptionBox;


    public AC3TrackImpl(DataSource dataSource) throws IOException {
        this(dataSource, "eng");__CLR4_5_265b65blvlulgsz.R.inc(7968);try{__CLR4_5_265b65blvlulgsz.R.inc(7967);
    }finally{__CLR4_5_265b65blvlulgsz.R.flushNeeded();}}

    public AC3TrackImpl(DataSource dataSource, String lang) throws IOException {
        super(dataSource.toString());__CLR4_5_265b65blvlulgsz.R.inc(7970);try{__CLR4_5_265b65blvlulgsz.R.inc(7969);
        __CLR4_5_265b65blvlulgsz.R.inc(7971);this.dataSource = dataSource;
        __CLR4_5_265b65blvlulgsz.R.inc(7972);this.trackMetaData.setLanguage(lang);

        __CLR4_5_265b65blvlulgsz.R.inc(7973);samples = readSamples();


        __CLR4_5_265b65blvlulgsz.R.inc(7974);sampleDescriptionBox = new SampleDescriptionBox();
        __CLR4_5_265b65blvlulgsz.R.inc(7975);AudioSampleEntry ase = createAudioSampleEntry();
        __CLR4_5_265b65blvlulgsz.R.inc(7976);sampleDescriptionBox.addBox(ase);

        __CLR4_5_265b65blvlulgsz.R.inc(7977);trackMetaData.setCreationTime(new Date());
        __CLR4_5_265b65blvlulgsz.R.inc(7978);trackMetaData.setModificationTime(new Date());
        __CLR4_5_265b65blvlulgsz.R.inc(7979);trackMetaData.setLanguage(lang);
        __CLR4_5_265b65blvlulgsz.R.inc(7980);trackMetaData.setTimescale(ase.getSampleRate()); // Audio tracks always use samplerate as timescale
        __CLR4_5_265b65blvlulgsz.R.inc(7981);trackMetaData.setVolume(1);

    }finally{__CLR4_5_265b65blvlulgsz.R.flushNeeded();}}

    public void close() throws IOException {try{__CLR4_5_265b65blvlulgsz.R.inc(7982);
        __CLR4_5_265b65blvlulgsz.R.inc(7983);dataSource.close();
    }finally{__CLR4_5_265b65blvlulgsz.R.flushNeeded();}}

    public List<Sample> getSamples() {try{__CLR4_5_265b65blvlulgsz.R.inc(7984);

        __CLR4_5_265b65blvlulgsz.R.inc(7985);return samples;
    }finally{__CLR4_5_265b65blvlulgsz.R.flushNeeded();}}

    public SampleDescriptionBox getSampleDescriptionBox() {try{__CLR4_5_265b65blvlulgsz.R.inc(7986);
        __CLR4_5_265b65blvlulgsz.R.inc(7987);return sampleDescriptionBox;
    }finally{__CLR4_5_265b65blvlulgsz.R.flushNeeded();}}

    public synchronized long[] getSampleDurations() {try{__CLR4_5_265b65blvlulgsz.R.inc(7988);
        __CLR4_5_265b65blvlulgsz.R.inc(7989);return duration;
    }finally{__CLR4_5_265b65blvlulgsz.R.flushNeeded();}}

    public List<CompositionTimeToSample.Entry> getCompositionTimeEntries() {try{__CLR4_5_265b65blvlulgsz.R.inc(7990);
        __CLR4_5_265b65blvlulgsz.R.inc(7991);return null;
    }finally{__CLR4_5_265b65blvlulgsz.R.flushNeeded();}}

    public long[] getSyncSamples() {try{__CLR4_5_265b65blvlulgsz.R.inc(7992);
        __CLR4_5_265b65blvlulgsz.R.inc(7993);return null;
    }finally{__CLR4_5_265b65blvlulgsz.R.flushNeeded();}}

    public List<SampleDependencyTypeBox.Entry> getSampleDependencies() {try{__CLR4_5_265b65blvlulgsz.R.inc(7994);
        __CLR4_5_265b65blvlulgsz.R.inc(7995);return null;
    }finally{__CLR4_5_265b65blvlulgsz.R.flushNeeded();}}

    public TrackMetaData getTrackMetaData() {try{__CLR4_5_265b65blvlulgsz.R.inc(7996);
        __CLR4_5_265b65blvlulgsz.R.inc(7997);return trackMetaData;
    }finally{__CLR4_5_265b65blvlulgsz.R.flushNeeded();}}

    public String getHandler() {try{__CLR4_5_265b65blvlulgsz.R.inc(7998);
        __CLR4_5_265b65blvlulgsz.R.inc(7999);return "soun";
    }finally{__CLR4_5_265b65blvlulgsz.R.flushNeeded();}}

    public SubSampleInformationBox getSubsampleInformationBox() {try{__CLR4_5_265b65blvlulgsz.R.inc(8000);
        __CLR4_5_265b65blvlulgsz.R.inc(8001);return null;
    }finally{__CLR4_5_265b65blvlulgsz.R.flushNeeded();}}

    private AudioSampleEntry createAudioSampleEntry() throws IOException {try{__CLR4_5_265b65blvlulgsz.R.inc(8002);


        __CLR4_5_265b65blvlulgsz.R.inc(8003);ByteBuffer bb = samples.get(0).asByteBuffer();
        __CLR4_5_265b65blvlulgsz.R.inc(8004);BitReaderBuffer brb = new BitReaderBuffer(bb);
        __CLR4_5_265b65blvlulgsz.R.inc(8005);int syncword = brb.readBits(16);
        __CLR4_5_265b65blvlulgsz.R.inc(8006);if ((((syncword != 0xb77)&&(__CLR4_5_265b65blvlulgsz.R.iget(8007)!=0|true))||(__CLR4_5_265b65blvlulgsz.R.iget(8008)==0&false))) {{
            __CLR4_5_265b65blvlulgsz.R.inc(8009);throw new RuntimeException("Stream doesn't seem to be AC3");
        }
        }__CLR4_5_265b65blvlulgsz.R.inc(8010);brb.readBits(16); // CRC-1
        __CLR4_5_265b65blvlulgsz.R.inc(8011);int fscod = brb.readBits(2);
        __CLR4_5_265b65blvlulgsz.R.inc(8012);int samplerate;
        boolean __CLB4_5_2_bool0=false;__CLR4_5_265b65blvlulgsz.R.inc(8013);switch (fscod) {
            case 0:if (!__CLB4_5_2_bool0) {__CLR4_5_265b65blvlulgsz.R.inc(8014);__CLB4_5_2_bool0=true;}
                __CLR4_5_265b65blvlulgsz.R.inc(8015);samplerate = 48000;
                __CLR4_5_265b65blvlulgsz.R.inc(8016);break;

            case 1:if (!__CLB4_5_2_bool0) {__CLR4_5_265b65blvlulgsz.R.inc(8017);__CLB4_5_2_bool0=true;}
                __CLR4_5_265b65blvlulgsz.R.inc(8018);samplerate = 44100;
                __CLR4_5_265b65blvlulgsz.R.inc(8019);break;

            case 2:if (!__CLB4_5_2_bool0) {__CLR4_5_265b65blvlulgsz.R.inc(8020);__CLB4_5_2_bool0=true;}
                __CLR4_5_265b65blvlulgsz.R.inc(8021);samplerate = 32000;
                __CLR4_5_265b65blvlulgsz.R.inc(8022);break;

            default:if (!__CLB4_5_2_bool0) {__CLR4_5_265b65blvlulgsz.R.inc(8023);__CLB4_5_2_bool0=true;}
                __CLR4_5_265b65blvlulgsz.R.inc(8024);throw new RuntimeException("Unsupported Sample Rate");

        }

        __CLR4_5_265b65blvlulgsz.R.inc(8025);int frmsizecod = brb.readBits(6);


        __CLR4_5_265b65blvlulgsz.R.inc(8026);int bsid = brb.readBits(5);
        __CLR4_5_265b65blvlulgsz.R.inc(8027);int bsmod = brb.readBits(3);
        __CLR4_5_265b65blvlulgsz.R.inc(8028);int acmod = brb.readBits(3);

        __CLR4_5_265b65blvlulgsz.R.inc(8029);if ((((bsid == 16)&&(__CLR4_5_265b65blvlulgsz.R.iget(8030)!=0|true))||(__CLR4_5_265b65blvlulgsz.R.iget(8031)==0&false))) {{
            __CLR4_5_265b65blvlulgsz.R.inc(8032);throw new RuntimeException("You cannot read E-AC-3 track with AC3TrackImpl.class - user EC3TrackImpl.class");
        }

        }__CLR4_5_265b65blvlulgsz.R.inc(8033);if ((((bsid == 9)&&(__CLR4_5_265b65blvlulgsz.R.iget(8034)!=0|true))||(__CLR4_5_265b65blvlulgsz.R.iget(8035)==0&false))) {{
            __CLR4_5_265b65blvlulgsz.R.inc(8036);samplerate /= 2;
        } }else {__CLR4_5_265b65blvlulgsz.R.inc(8037);if ((((bsid != 8 && bsid != 6)&&(__CLR4_5_265b65blvlulgsz.R.iget(8038)!=0|true))||(__CLR4_5_265b65blvlulgsz.R.iget(8039)==0&false))) {{
            __CLR4_5_265b65blvlulgsz.R.inc(8040);throw new RuntimeException("Unsupported bsid");
        }

        }}__CLR4_5_265b65blvlulgsz.R.inc(8041);if (((((acmod != 1) && ((acmod & 1) == 1))&&(__CLR4_5_265b65blvlulgsz.R.iget(8042)!=0|true))||(__CLR4_5_265b65blvlulgsz.R.iget(8043)==0&false))) {{
            __CLR4_5_265b65blvlulgsz.R.inc(8044);brb.readBits(2);
        }

        }__CLR4_5_265b65blvlulgsz.R.inc(8045);if ((((0 != (acmod & 4))&&(__CLR4_5_265b65blvlulgsz.R.iget(8046)!=0|true))||(__CLR4_5_265b65blvlulgsz.R.iget(8047)==0&false))) {{
            __CLR4_5_265b65blvlulgsz.R.inc(8048);brb.readBits(2);
        }

        }__CLR4_5_265b65blvlulgsz.R.inc(8049);if ((((acmod == 2)&&(__CLR4_5_265b65blvlulgsz.R.iget(8050)!=0|true))||(__CLR4_5_265b65blvlulgsz.R.iget(8051)==0&false))) {{
            __CLR4_5_265b65blvlulgsz.R.inc(8052);brb.readBits(2);
        }
        }__CLR4_5_265b65blvlulgsz.R.inc(8053);int channelCount;
        boolean __CLB4_5_2_bool1=false;__CLR4_5_265b65blvlulgsz.R.inc(8054);switch (acmod) {
            case 0:if (!__CLB4_5_2_bool1) {__CLR4_5_265b65blvlulgsz.R.inc(8055);__CLB4_5_2_bool1=true;}
                __CLR4_5_265b65blvlulgsz.R.inc(8056);channelCount = 2;
                __CLR4_5_265b65blvlulgsz.R.inc(8057);break;

            case 1:if (!__CLB4_5_2_bool1) {__CLR4_5_265b65blvlulgsz.R.inc(8058);__CLB4_5_2_bool1=true;}
                __CLR4_5_265b65blvlulgsz.R.inc(8059);channelCount = 1;
                __CLR4_5_265b65blvlulgsz.R.inc(8060);break;

            case 2:if (!__CLB4_5_2_bool1) {__CLR4_5_265b65blvlulgsz.R.inc(8061);__CLB4_5_2_bool1=true;}
                __CLR4_5_265b65blvlulgsz.R.inc(8062);channelCount = 2;
                __CLR4_5_265b65blvlulgsz.R.inc(8063);break;

            case 3:if (!__CLB4_5_2_bool1) {__CLR4_5_265b65blvlulgsz.R.inc(8064);__CLB4_5_2_bool1=true;}
                __CLR4_5_265b65blvlulgsz.R.inc(8065);channelCount = 3;
                __CLR4_5_265b65blvlulgsz.R.inc(8066);break;

            case 4:if (!__CLB4_5_2_bool1) {__CLR4_5_265b65blvlulgsz.R.inc(8067);__CLB4_5_2_bool1=true;}
                __CLR4_5_265b65blvlulgsz.R.inc(8068);channelCount = 3;
                __CLR4_5_265b65blvlulgsz.R.inc(8069);break;

            case 5:if (!__CLB4_5_2_bool1) {__CLR4_5_265b65blvlulgsz.R.inc(8070);__CLB4_5_2_bool1=true;}
                __CLR4_5_265b65blvlulgsz.R.inc(8071);channelCount = 4;
                __CLR4_5_265b65blvlulgsz.R.inc(8072);break;

            case 6:if (!__CLB4_5_2_bool1) {__CLR4_5_265b65blvlulgsz.R.inc(8073);__CLB4_5_2_bool1=true;}
                __CLR4_5_265b65blvlulgsz.R.inc(8074);channelCount = 4;
                __CLR4_5_265b65blvlulgsz.R.inc(8075);break;

            case 7:if (!__CLB4_5_2_bool1) {__CLR4_5_265b65blvlulgsz.R.inc(8076);__CLB4_5_2_bool1=true;}
                __CLR4_5_265b65blvlulgsz.R.inc(8077);channelCount = 5;
                __CLR4_5_265b65blvlulgsz.R.inc(8078);break;
            default:if (!__CLB4_5_2_bool1) {__CLR4_5_265b65blvlulgsz.R.inc(8079);__CLB4_5_2_bool1=true;}
                __CLR4_5_265b65blvlulgsz.R.inc(8080);throw new RuntimeException("Unsupported acmod");

        }

        __CLR4_5_265b65blvlulgsz.R.inc(8081);int lfeon = brb.readBits(1);

        __CLR4_5_265b65blvlulgsz.R.inc(8082);if ((((lfeon == 1)&&(__CLR4_5_265b65blvlulgsz.R.iget(8083)!=0|true))||(__CLR4_5_265b65blvlulgsz.R.iget(8084)==0&false))) {{
            __CLR4_5_265b65blvlulgsz.R.inc(8085);channelCount++;
        }
        }__CLR4_5_265b65blvlulgsz.R.inc(8086);AudioSampleEntry audioSampleEntry = new AudioSampleEntry("ac-3");
        __CLR4_5_265b65blvlulgsz.R.inc(8087);audioSampleEntry.setChannelCount(2);  // According to  ETSI TS 102 366 Annex F
        __CLR4_5_265b65blvlulgsz.R.inc(8088);audioSampleEntry.setSampleRate(samplerate);
        __CLR4_5_265b65blvlulgsz.R.inc(8089);audioSampleEntry.setDataReferenceIndex(1);
        __CLR4_5_265b65blvlulgsz.R.inc(8090);audioSampleEntry.setSampleSize(16);

        __CLR4_5_265b65blvlulgsz.R.inc(8091);AC3SpecificBox ac3 = new AC3SpecificBox();
        __CLR4_5_265b65blvlulgsz.R.inc(8092);ac3.setAcmod(acmod);
        __CLR4_5_265b65blvlulgsz.R.inc(8093);ac3.setBitRateCode(frmsizecod >> 1);
        __CLR4_5_265b65blvlulgsz.R.inc(8094);ac3.setBsid(bsid);
        __CLR4_5_265b65blvlulgsz.R.inc(8095);ac3.setBsmod(bsmod);
        __CLR4_5_265b65blvlulgsz.R.inc(8096);ac3.setFscod(fscod);
        __CLR4_5_265b65blvlulgsz.R.inc(8097);ac3.setLfeon(lfeon);
        __CLR4_5_265b65blvlulgsz.R.inc(8098);ac3.setReserved(0);

        __CLR4_5_265b65blvlulgsz.R.inc(8099);audioSampleEntry.addBox(ac3);
        __CLR4_5_265b65blvlulgsz.R.inc(8100);return audioSampleEntry;
    }finally{__CLR4_5_265b65blvlulgsz.R.flushNeeded();}}

    private int getFrameSize(int code, int fscod) {try{__CLR4_5_265b65blvlulgsz.R.inc(8101);
        __CLR4_5_265b65blvlulgsz.R.inc(8102);int frmsizecode = code >>> 1;
        __CLR4_5_265b65blvlulgsz.R.inc(8103);int flag = code & 1;
        __CLR4_5_265b65blvlulgsz.R.inc(8104);if ((((frmsizecode > 18 || flag > 1 || fscod > 2)&&(__CLR4_5_265b65blvlulgsz.R.iget(8105)!=0|true))||(__CLR4_5_265b65blvlulgsz.R.iget(8106)==0&false))) {{
            __CLR4_5_265b65blvlulgsz.R.inc(8107);throw new RuntimeException("Cannot determine framesize of current sample");
        }
        }__CLR4_5_265b65blvlulgsz.R.inc(8108);return  2 * bitRateAndFrameSizeTable[frmsizecode][flag][fscod][1];

    }finally{__CLR4_5_265b65blvlulgsz.R.flushNeeded();}}


    private List<Sample> readSamples() throws IOException {try{__CLR4_5_265b65blvlulgsz.R.inc(8109);
        class SampleImpl implements Sample{
            private final long start;
            private final long size;
            private final DataSource dataSource;

            public SampleImpl(long start, long size, DataSource dataSource) {try{__CLR4_5_265b65blvlulgsz.R.inc(8110);

                __CLR4_5_265b65blvlulgsz.R.inc(8111);this.start = start;
                __CLR4_5_265b65blvlulgsz.R.inc(8112);this.size = size;
                __CLR4_5_265b65blvlulgsz.R.inc(8113);this.dataSource = dataSource;
            }finally{__CLR4_5_265b65blvlulgsz.R.flushNeeded();}}
            public void writeTo(WritableByteChannel channel) throws IOException {try{__CLR4_5_265b65blvlulgsz.R.inc(8114);
                __CLR4_5_265b65blvlulgsz.R.inc(8115);dataSource.transferTo(start, size, channel);
            }finally{__CLR4_5_265b65blvlulgsz.R.flushNeeded();}}

            public long getSize() {try{__CLR4_5_265b65blvlulgsz.R.inc(8116);
                __CLR4_5_265b65blvlulgsz.R.inc(8117);return size;
            }finally{__CLR4_5_265b65blvlulgsz.R.flushNeeded();}}

            public ByteBuffer asByteBuffer() {try{__CLR4_5_265b65blvlulgsz.R.inc(8118);
                __CLR4_5_265b65blvlulgsz.R.inc(8119);try {
                    __CLR4_5_265b65blvlulgsz.R.inc(8120);return dataSource.map(start, size);
                } catch (IOException e) {
                    __CLR4_5_265b65blvlulgsz.R.inc(8121);throw new RuntimeException(e);
                }
            }finally{__CLR4_5_265b65blvlulgsz.R.flushNeeded();}}

        }

        __CLR4_5_265b65blvlulgsz.R.inc(8122);ByteBuffer header =  ByteBuffer.allocate(5);
        __CLR4_5_265b65blvlulgsz.R.inc(8123);List<Sample> mysamples = new ArrayList<Sample>();

        __CLR4_5_265b65blvlulgsz.R.inc(8124);while ((((-1 != dataSource.read(header))&&(__CLR4_5_265b65blvlulgsz.R.iget(8125)!=0|true))||(__CLR4_5_265b65blvlulgsz.R.iget(8126)==0&false))) {{
            __CLR4_5_265b65blvlulgsz.R.inc(8127);int frmsizecode = header.get(4) & 63;
            __CLR4_5_265b65blvlulgsz.R.inc(8128);int fscod = header.get(4)>>6;
            __CLR4_5_265b65blvlulgsz.R.inc(8129);int frameSize = getFrameSize(frmsizecode, fscod);
            __CLR4_5_265b65blvlulgsz.R.inc(8130);mysamples.add(new SampleImpl(dataSource.position()-5 , frameSize, dataSource));
            __CLR4_5_265b65blvlulgsz.R.inc(8131);dataSource.position(dataSource.position() - 5 + frameSize);
            __CLR4_5_265b65blvlulgsz.R.inc(8132);header.rewind();

        }
        }__CLR4_5_265b65blvlulgsz.R.inc(8133);duration = new long[mysamples.size()];
        __CLR4_5_265b65blvlulgsz.R.inc(8134);Arrays.fill(duration, 1536);
        __CLR4_5_265b65blvlulgsz.R.inc(8135);return mysamples;
    }finally{__CLR4_5_265b65blvlulgsz.R.flushNeeded();}}

    static {try{__CLR4_5_265b65blvlulgsz.R.inc(8136);
        __CLR4_5_265b65blvlulgsz.R.inc(8137);bitRateAndFrameSizeTable = new int[19][2][3][2];
        // ETSI 102 366 Table 4.13, in frmsizecod, flag, fscod, bitrate/size order. Note that all sizes are in words, and all bitrates in kbps

        // 48kHz
        __CLR4_5_265b65blvlulgsz.R.inc(8138);bitRateAndFrameSizeTable[0][0][0][0] = 32;
        __CLR4_5_265b65blvlulgsz.R.inc(8139);bitRateAndFrameSizeTable[0][1][0][0] = 32;
        __CLR4_5_265b65blvlulgsz.R.inc(8140);bitRateAndFrameSizeTable[0][0][0][1] = 64;
        __CLR4_5_265b65blvlulgsz.R.inc(8141);bitRateAndFrameSizeTable[0][1][0][1] = 64;
        __CLR4_5_265b65blvlulgsz.R.inc(8142);bitRateAndFrameSizeTable[1][0][0][0] = 40;
        __CLR4_5_265b65blvlulgsz.R.inc(8143);bitRateAndFrameSizeTable[1][1][0][0] = 40;
        __CLR4_5_265b65blvlulgsz.R.inc(8144);bitRateAndFrameSizeTable[1][0][0][1] = 80;
        __CLR4_5_265b65blvlulgsz.R.inc(8145);bitRateAndFrameSizeTable[1][1][0][1] = 80;
        __CLR4_5_265b65blvlulgsz.R.inc(8146);bitRateAndFrameSizeTable[2][0][0][0] = 48;
        __CLR4_5_265b65blvlulgsz.R.inc(8147);bitRateAndFrameSizeTable[2][1][0][0] = 48;
        __CLR4_5_265b65blvlulgsz.R.inc(8148);bitRateAndFrameSizeTable[2][0][0][1] = 96;
        __CLR4_5_265b65blvlulgsz.R.inc(8149);bitRateAndFrameSizeTable[2][1][0][1] = 96;
        __CLR4_5_265b65blvlulgsz.R.inc(8150);bitRateAndFrameSizeTable[3][0][0][0] = 56;
        __CLR4_5_265b65blvlulgsz.R.inc(8151);bitRateAndFrameSizeTable[3][1][0][0] = 56;
        __CLR4_5_265b65blvlulgsz.R.inc(8152);bitRateAndFrameSizeTable[3][0][0][1] = 112;
        __CLR4_5_265b65blvlulgsz.R.inc(8153);bitRateAndFrameSizeTable[3][1][0][1] = 112;
        __CLR4_5_265b65blvlulgsz.R.inc(8154);bitRateAndFrameSizeTable[4][0][0][0] = 64;
        __CLR4_5_265b65blvlulgsz.R.inc(8155);bitRateAndFrameSizeTable[4][1][0][0] = 64;
        __CLR4_5_265b65blvlulgsz.R.inc(8156);bitRateAndFrameSizeTable[4][0][0][1] = 128;
        __CLR4_5_265b65blvlulgsz.R.inc(8157);bitRateAndFrameSizeTable[4][1][0][1] = 128;
        __CLR4_5_265b65blvlulgsz.R.inc(8158);bitRateAndFrameSizeTable[5][0][0][0] = 80;
        __CLR4_5_265b65blvlulgsz.R.inc(8159);bitRateAndFrameSizeTable[5][1][0][0] = 80;
        __CLR4_5_265b65blvlulgsz.R.inc(8160);bitRateAndFrameSizeTable[5][0][0][1] = 160;
        __CLR4_5_265b65blvlulgsz.R.inc(8161);bitRateAndFrameSizeTable[5][1][0][1] = 160;
        __CLR4_5_265b65blvlulgsz.R.inc(8162);bitRateAndFrameSizeTable[6][0][0][0] = 96;
        __CLR4_5_265b65blvlulgsz.R.inc(8163);bitRateAndFrameSizeTable[6][1][0][0] = 96;
        __CLR4_5_265b65blvlulgsz.R.inc(8164);bitRateAndFrameSizeTable[6][0][0][1] = 192;
        __CLR4_5_265b65blvlulgsz.R.inc(8165);bitRateAndFrameSizeTable[6][1][0][1] = 192;
        __CLR4_5_265b65blvlulgsz.R.inc(8166);bitRateAndFrameSizeTable[7][0][0][0] = 112;
        __CLR4_5_265b65blvlulgsz.R.inc(8167);bitRateAndFrameSizeTable[7][1][0][0] = 112;
        __CLR4_5_265b65blvlulgsz.R.inc(8168);bitRateAndFrameSizeTable[7][0][0][1] = 224;
        __CLR4_5_265b65blvlulgsz.R.inc(8169);bitRateAndFrameSizeTable[7][1][0][1] = 224;
        __CLR4_5_265b65blvlulgsz.R.inc(8170);bitRateAndFrameSizeTable[8][0][0][0] = 128;
        __CLR4_5_265b65blvlulgsz.R.inc(8171);bitRateAndFrameSizeTable[8][1][0][0] = 128;
        __CLR4_5_265b65blvlulgsz.R.inc(8172);bitRateAndFrameSizeTable[8][0][0][1] = 256;
        __CLR4_5_265b65blvlulgsz.R.inc(8173);bitRateAndFrameSizeTable[8][1][0][1] = 256;
        __CLR4_5_265b65blvlulgsz.R.inc(8174);bitRateAndFrameSizeTable[9][0][0][0] = 160;
        __CLR4_5_265b65blvlulgsz.R.inc(8175);bitRateAndFrameSizeTable[9][1][0][0] = 160;
        __CLR4_5_265b65blvlulgsz.R.inc(8176);bitRateAndFrameSizeTable[9][0][0][1] = 320;
        __CLR4_5_265b65blvlulgsz.R.inc(8177);bitRateAndFrameSizeTable[9][1][0][1] = 320;
        __CLR4_5_265b65blvlulgsz.R.inc(8178);bitRateAndFrameSizeTable[10][0][0][0] = 192;
        __CLR4_5_265b65blvlulgsz.R.inc(8179);bitRateAndFrameSizeTable[10][1][0][0] = 192;
        __CLR4_5_265b65blvlulgsz.R.inc(8180);bitRateAndFrameSizeTable[10][0][0][1] = 384;
        __CLR4_5_265b65blvlulgsz.R.inc(8181);bitRateAndFrameSizeTable[10][1][0][1] = 384;
        __CLR4_5_265b65blvlulgsz.R.inc(8182);bitRateAndFrameSizeTable[11][0][0][0] = 224;
        __CLR4_5_265b65blvlulgsz.R.inc(8183);bitRateAndFrameSizeTable[11][1][0][0] = 224;
        __CLR4_5_265b65blvlulgsz.R.inc(8184);bitRateAndFrameSizeTable[11][0][0][1] = 448;
        __CLR4_5_265b65blvlulgsz.R.inc(8185);bitRateAndFrameSizeTable[11][1][0][1] = 448;
        __CLR4_5_265b65blvlulgsz.R.inc(8186);bitRateAndFrameSizeTable[12][0][0][0] = 256;
        __CLR4_5_265b65blvlulgsz.R.inc(8187);bitRateAndFrameSizeTable[12][1][0][0] = 256;
        __CLR4_5_265b65blvlulgsz.R.inc(8188);bitRateAndFrameSizeTable[12][0][0][1] = 512;
        __CLR4_5_265b65blvlulgsz.R.inc(8189);bitRateAndFrameSizeTable[12][1][0][1] = 512;
        __CLR4_5_265b65blvlulgsz.R.inc(8190);bitRateAndFrameSizeTable[13][0][0][0] = 320;
        __CLR4_5_265b65blvlulgsz.R.inc(8191);bitRateAndFrameSizeTable[13][1][0][0] = 320;
        __CLR4_5_265b65blvlulgsz.R.inc(8192);bitRateAndFrameSizeTable[13][0][0][1] = 640;
        __CLR4_5_265b65blvlulgsz.R.inc(8193);bitRateAndFrameSizeTable[13][1][0][1] = 640;
        __CLR4_5_265b65blvlulgsz.R.inc(8194);bitRateAndFrameSizeTable[14][0][0][0] = 384;
        __CLR4_5_265b65blvlulgsz.R.inc(8195);bitRateAndFrameSizeTable[14][1][0][0] = 384;
        __CLR4_5_265b65blvlulgsz.R.inc(8196);bitRateAndFrameSizeTable[14][0][0][1] = 768;
        __CLR4_5_265b65blvlulgsz.R.inc(8197);bitRateAndFrameSizeTable[14][1][0][1] = 768;
        __CLR4_5_265b65blvlulgsz.R.inc(8198);bitRateAndFrameSizeTable[15][0][0][0] = 448;
        __CLR4_5_265b65blvlulgsz.R.inc(8199);bitRateAndFrameSizeTable[15][1][0][0] = 448;
        __CLR4_5_265b65blvlulgsz.R.inc(8200);bitRateAndFrameSizeTable[15][0][0][1] = 896;
        __CLR4_5_265b65blvlulgsz.R.inc(8201);bitRateAndFrameSizeTable[15][1][0][1] = 896;
        __CLR4_5_265b65blvlulgsz.R.inc(8202);bitRateAndFrameSizeTable[16][0][0][0] = 512;
        __CLR4_5_265b65blvlulgsz.R.inc(8203);bitRateAndFrameSizeTable[16][1][0][0] = 512;
        __CLR4_5_265b65blvlulgsz.R.inc(8204);bitRateAndFrameSizeTable[16][0][0][1] = 1024;
        __CLR4_5_265b65blvlulgsz.R.inc(8205);bitRateAndFrameSizeTable[16][1][0][1] = 1024;
        __CLR4_5_265b65blvlulgsz.R.inc(8206);bitRateAndFrameSizeTable[17][0][0][0] = 576;
        __CLR4_5_265b65blvlulgsz.R.inc(8207);bitRateAndFrameSizeTable[17][1][0][0] = 576;
        __CLR4_5_265b65blvlulgsz.R.inc(8208);bitRateAndFrameSizeTable[17][0][0][1] = 1152;
        __CLR4_5_265b65blvlulgsz.R.inc(8209);bitRateAndFrameSizeTable[17][1][0][1] = 1152;
        __CLR4_5_265b65blvlulgsz.R.inc(8210);bitRateAndFrameSizeTable[18][0][0][0] = 640;
        __CLR4_5_265b65blvlulgsz.R.inc(8211);bitRateAndFrameSizeTable[18][1][0][0] = 640;
        __CLR4_5_265b65blvlulgsz.R.inc(8212);bitRateAndFrameSizeTable[18][0][0][1] = 1280;
        __CLR4_5_265b65blvlulgsz.R.inc(8213);bitRateAndFrameSizeTable[18][1][0][1] = 1280;

        // 44.1 kHz
        __CLR4_5_265b65blvlulgsz.R.inc(8214);bitRateAndFrameSizeTable[0][0][1][0] = 32;
        __CLR4_5_265b65blvlulgsz.R.inc(8215);bitRateAndFrameSizeTable[0][1][1][0] = 32;
        __CLR4_5_265b65blvlulgsz.R.inc(8216);bitRateAndFrameSizeTable[0][0][1][1] = 69;
        __CLR4_5_265b65blvlulgsz.R.inc(8217);bitRateAndFrameSizeTable[0][1][1][1] = 70;
        __CLR4_5_265b65blvlulgsz.R.inc(8218);bitRateAndFrameSizeTable[1][0][1][0] = 40;
        __CLR4_5_265b65blvlulgsz.R.inc(8219);bitRateAndFrameSizeTable[1][1][1][0] = 40;
        __CLR4_5_265b65blvlulgsz.R.inc(8220);bitRateAndFrameSizeTable[1][0][1][1] = 87;
        __CLR4_5_265b65blvlulgsz.R.inc(8221);bitRateAndFrameSizeTable[1][1][1][1] = 88;
        __CLR4_5_265b65blvlulgsz.R.inc(8222);bitRateAndFrameSizeTable[2][0][1][0] = 48;
        __CLR4_5_265b65blvlulgsz.R.inc(8223);bitRateAndFrameSizeTable[2][1][1][0] = 48;
        __CLR4_5_265b65blvlulgsz.R.inc(8224);bitRateAndFrameSizeTable[2][0][1][1] = 104;
        __CLR4_5_265b65blvlulgsz.R.inc(8225);bitRateAndFrameSizeTable[2][1][1][1] = 105;
        __CLR4_5_265b65blvlulgsz.R.inc(8226);bitRateAndFrameSizeTable[3][0][1][0] = 56;
        __CLR4_5_265b65blvlulgsz.R.inc(8227);bitRateAndFrameSizeTable[3][1][1][0] = 56;
        __CLR4_5_265b65blvlulgsz.R.inc(8228);bitRateAndFrameSizeTable[3][0][1][1] = 121;
        __CLR4_5_265b65blvlulgsz.R.inc(8229);bitRateAndFrameSizeTable[3][1][1][1] = 122;
        __CLR4_5_265b65blvlulgsz.R.inc(8230);bitRateAndFrameSizeTable[4][0][1][0] = 64;
        __CLR4_5_265b65blvlulgsz.R.inc(8231);bitRateAndFrameSizeTable[4][1][1][0] = 64;
        __CLR4_5_265b65blvlulgsz.R.inc(8232);bitRateAndFrameSizeTable[4][0][1][1] = 139;
        __CLR4_5_265b65blvlulgsz.R.inc(8233);bitRateAndFrameSizeTable[4][1][1][1] = 140;
        __CLR4_5_265b65blvlulgsz.R.inc(8234);bitRateAndFrameSizeTable[5][0][1][0] = 80;
        __CLR4_5_265b65blvlulgsz.R.inc(8235);bitRateAndFrameSizeTable[5][1][1][0] = 80;
        __CLR4_5_265b65blvlulgsz.R.inc(8236);bitRateAndFrameSizeTable[5][0][1][1] = 174;
        __CLR4_5_265b65blvlulgsz.R.inc(8237);bitRateAndFrameSizeTable[5][1][1][1] = 175;
        __CLR4_5_265b65blvlulgsz.R.inc(8238);bitRateAndFrameSizeTable[6][0][1][0] = 96;
        __CLR4_5_265b65blvlulgsz.R.inc(8239);bitRateAndFrameSizeTable[6][1][1][0] = 96;
        __CLR4_5_265b65blvlulgsz.R.inc(8240);bitRateAndFrameSizeTable[6][0][1][1] = 208;
        __CLR4_5_265b65blvlulgsz.R.inc(8241);bitRateAndFrameSizeTable[6][1][1][1] = 209;
        __CLR4_5_265b65blvlulgsz.R.inc(8242);bitRateAndFrameSizeTable[7][0][1][0] = 112;
        __CLR4_5_265b65blvlulgsz.R.inc(8243);bitRateAndFrameSizeTable[7][1][1][0] = 112;
        __CLR4_5_265b65blvlulgsz.R.inc(8244);bitRateAndFrameSizeTable[7][0][1][1] = 243;
        __CLR4_5_265b65blvlulgsz.R.inc(8245);bitRateAndFrameSizeTable[7][1][1][1] = 244;
        __CLR4_5_265b65blvlulgsz.R.inc(8246);bitRateAndFrameSizeTable[8][0][1][0] = 128;
        __CLR4_5_265b65blvlulgsz.R.inc(8247);bitRateAndFrameSizeTable[8][1][1][0] = 128;
        __CLR4_5_265b65blvlulgsz.R.inc(8248);bitRateAndFrameSizeTable[8][0][1][1] = 278;
        __CLR4_5_265b65blvlulgsz.R.inc(8249);bitRateAndFrameSizeTable[8][1][1][1] = 279;
        __CLR4_5_265b65blvlulgsz.R.inc(8250);bitRateAndFrameSizeTable[9][0][1][0] = 160;
        __CLR4_5_265b65blvlulgsz.R.inc(8251);bitRateAndFrameSizeTable[9][1][1][0] = 160;
        __CLR4_5_265b65blvlulgsz.R.inc(8252);bitRateAndFrameSizeTable[9][0][1][1] = 348;
        __CLR4_5_265b65blvlulgsz.R.inc(8253);bitRateAndFrameSizeTable[9][1][1][1] = 349;
        __CLR4_5_265b65blvlulgsz.R.inc(8254);bitRateAndFrameSizeTable[10][0][1][0] = 192;
        __CLR4_5_265b65blvlulgsz.R.inc(8255);bitRateAndFrameSizeTable[10][1][1][0] = 192;
        __CLR4_5_265b65blvlulgsz.R.inc(8256);bitRateAndFrameSizeTable[10][0][1][1] = 417;
        __CLR4_5_265b65blvlulgsz.R.inc(8257);bitRateAndFrameSizeTable[10][1][1][1] = 418;
        __CLR4_5_265b65blvlulgsz.R.inc(8258);bitRateAndFrameSizeTable[11][0][1][0] = 224;
        __CLR4_5_265b65blvlulgsz.R.inc(8259);bitRateAndFrameSizeTable[11][1][1][0] = 224;
        __CLR4_5_265b65blvlulgsz.R.inc(8260);bitRateAndFrameSizeTable[11][0][1][1] = 487;
        __CLR4_5_265b65blvlulgsz.R.inc(8261);bitRateAndFrameSizeTable[11][1][1][1] = 488;
        __CLR4_5_265b65blvlulgsz.R.inc(8262);bitRateAndFrameSizeTable[12][0][1][0] = 256;
        __CLR4_5_265b65blvlulgsz.R.inc(8263);bitRateAndFrameSizeTable[12][1][1][0] = 256;
        __CLR4_5_265b65blvlulgsz.R.inc(8264);bitRateAndFrameSizeTable[12][0][1][1] = 557;
        __CLR4_5_265b65blvlulgsz.R.inc(8265);bitRateAndFrameSizeTable[12][1][1][1] = 558;
        __CLR4_5_265b65blvlulgsz.R.inc(8266);bitRateAndFrameSizeTable[13][0][1][0] = 320;
        __CLR4_5_265b65blvlulgsz.R.inc(8267);bitRateAndFrameSizeTable[13][1][1][0] = 320;
        __CLR4_5_265b65blvlulgsz.R.inc(8268);bitRateAndFrameSizeTable[13][0][1][1] = 696;
        __CLR4_5_265b65blvlulgsz.R.inc(8269);bitRateAndFrameSizeTable[13][1][1][1] = 697;
        __CLR4_5_265b65blvlulgsz.R.inc(8270);bitRateAndFrameSizeTable[14][0][1][0] = 384;
        __CLR4_5_265b65blvlulgsz.R.inc(8271);bitRateAndFrameSizeTable[14][1][1][0] = 384;
        __CLR4_5_265b65blvlulgsz.R.inc(8272);bitRateAndFrameSizeTable[14][0][1][1] = 835;
        __CLR4_5_265b65blvlulgsz.R.inc(8273);bitRateAndFrameSizeTable[14][1][1][1] = 836;
        __CLR4_5_265b65blvlulgsz.R.inc(8274);bitRateAndFrameSizeTable[15][0][1][0] = 448;
        __CLR4_5_265b65blvlulgsz.R.inc(8275);bitRateAndFrameSizeTable[15][1][1][0] = 448;
        __CLR4_5_265b65blvlulgsz.R.inc(8276);bitRateAndFrameSizeTable[15][0][1][1] = 975;
        __CLR4_5_265b65blvlulgsz.R.inc(8277);bitRateAndFrameSizeTable[15][1][1][1] = 975;
        __CLR4_5_265b65blvlulgsz.R.inc(8278);bitRateAndFrameSizeTable[16][0][1][0] = 512;
        __CLR4_5_265b65blvlulgsz.R.inc(8279);bitRateAndFrameSizeTable[16][1][1][0] = 512;
        __CLR4_5_265b65blvlulgsz.R.inc(8280);bitRateAndFrameSizeTable[16][0][1][1] = 1114;
        __CLR4_5_265b65blvlulgsz.R.inc(8281);bitRateAndFrameSizeTable[16][1][1][1] = 1115;
        __CLR4_5_265b65blvlulgsz.R.inc(8282);bitRateAndFrameSizeTable[17][0][1][0] = 576;
        __CLR4_5_265b65blvlulgsz.R.inc(8283);bitRateAndFrameSizeTable[17][1][1][0] = 576;
        __CLR4_5_265b65blvlulgsz.R.inc(8284);bitRateAndFrameSizeTable[17][0][1][1] = 1253;
        __CLR4_5_265b65blvlulgsz.R.inc(8285);bitRateAndFrameSizeTable[17][1][1][1] = 1254;
        __CLR4_5_265b65blvlulgsz.R.inc(8286);bitRateAndFrameSizeTable[18][0][1][0] = 640;
        __CLR4_5_265b65blvlulgsz.R.inc(8287);bitRateAndFrameSizeTable[18][1][1][0] = 640;
        __CLR4_5_265b65blvlulgsz.R.inc(8288);bitRateAndFrameSizeTable[18][0][1][1] = 1393;
        __CLR4_5_265b65blvlulgsz.R.inc(8289);bitRateAndFrameSizeTable[18][1][1][1] = 1394;

        // 32kHz
        __CLR4_5_265b65blvlulgsz.R.inc(8290);bitRateAndFrameSizeTable[0][0][2][0] = 32;
        __CLR4_5_265b65blvlulgsz.R.inc(8291);bitRateAndFrameSizeTable[0][1][2][0] = 32;
        __CLR4_5_265b65blvlulgsz.R.inc(8292);bitRateAndFrameSizeTable[0][0][2][1] = 96;
        __CLR4_5_265b65blvlulgsz.R.inc(8293);bitRateAndFrameSizeTable[0][1][2][1] = 96;
        __CLR4_5_265b65blvlulgsz.R.inc(8294);bitRateAndFrameSizeTable[1][0][2][0] = 40;
        __CLR4_5_265b65blvlulgsz.R.inc(8295);bitRateAndFrameSizeTable[1][1][2][0] = 40;
        __CLR4_5_265b65blvlulgsz.R.inc(8296);bitRateAndFrameSizeTable[1][0][2][1] = 120;
        __CLR4_5_265b65blvlulgsz.R.inc(8297);bitRateAndFrameSizeTable[1][1][2][1] = 120;
        __CLR4_5_265b65blvlulgsz.R.inc(8298);bitRateAndFrameSizeTable[2][0][2][0] = 48;
        __CLR4_5_265b65blvlulgsz.R.inc(8299);bitRateAndFrameSizeTable[2][1][2][0] = 48;
        __CLR4_5_265b65blvlulgsz.R.inc(8300);bitRateAndFrameSizeTable[2][0][2][1] = 144;
        __CLR4_5_265b65blvlulgsz.R.inc(8301);bitRateAndFrameSizeTable[2][1][2][1] = 144;
        __CLR4_5_265b65blvlulgsz.R.inc(8302);bitRateAndFrameSizeTable[3][0][2][0] = 56;
        __CLR4_5_265b65blvlulgsz.R.inc(8303);bitRateAndFrameSizeTable[3][1][2][0] = 56;
        __CLR4_5_265b65blvlulgsz.R.inc(8304);bitRateAndFrameSizeTable[3][0][2][1] = 168;
        __CLR4_5_265b65blvlulgsz.R.inc(8305);bitRateAndFrameSizeTable[3][1][2][1] = 168;
        __CLR4_5_265b65blvlulgsz.R.inc(8306);bitRateAndFrameSizeTable[4][0][2][0] = 64;
        __CLR4_5_265b65blvlulgsz.R.inc(8307);bitRateAndFrameSizeTable[4][1][2][0] = 64;
        __CLR4_5_265b65blvlulgsz.R.inc(8308);bitRateAndFrameSizeTable[4][0][2][1] = 192;
        __CLR4_5_265b65blvlulgsz.R.inc(8309);bitRateAndFrameSizeTable[4][1][2][1] = 192;
        __CLR4_5_265b65blvlulgsz.R.inc(8310);bitRateAndFrameSizeTable[5][0][2][0] = 80;
        __CLR4_5_265b65blvlulgsz.R.inc(8311);bitRateAndFrameSizeTable[5][1][2][0] = 80;
        __CLR4_5_265b65blvlulgsz.R.inc(8312);bitRateAndFrameSizeTable[5][0][2][1] = 240;
        __CLR4_5_265b65blvlulgsz.R.inc(8313);bitRateAndFrameSizeTable[5][1][2][1] = 240;
        __CLR4_5_265b65blvlulgsz.R.inc(8314);bitRateAndFrameSizeTable[6][0][2][0] = 96;
        __CLR4_5_265b65blvlulgsz.R.inc(8315);bitRateAndFrameSizeTable[6][1][2][0] = 96;
        __CLR4_5_265b65blvlulgsz.R.inc(8316);bitRateAndFrameSizeTable[6][0][2][1] = 288;
        __CLR4_5_265b65blvlulgsz.R.inc(8317);bitRateAndFrameSizeTable[6][1][2][1] = 288;
        __CLR4_5_265b65blvlulgsz.R.inc(8318);bitRateAndFrameSizeTable[7][0][2][0] = 112;
        __CLR4_5_265b65blvlulgsz.R.inc(8319);bitRateAndFrameSizeTable[7][1][2][0] = 112;
        __CLR4_5_265b65blvlulgsz.R.inc(8320);bitRateAndFrameSizeTable[7][0][2][1] = 336;
        __CLR4_5_265b65blvlulgsz.R.inc(8321);bitRateAndFrameSizeTable[7][1][2][1] = 336;
        __CLR4_5_265b65blvlulgsz.R.inc(8322);bitRateAndFrameSizeTable[8][0][2][0] = 128;
        __CLR4_5_265b65blvlulgsz.R.inc(8323);bitRateAndFrameSizeTable[8][1][2][0] = 128;
        __CLR4_5_265b65blvlulgsz.R.inc(8324);bitRateAndFrameSizeTable[8][0][2][1] = 384;
        __CLR4_5_265b65blvlulgsz.R.inc(8325);bitRateAndFrameSizeTable[8][1][2][1] = 384;
        __CLR4_5_265b65blvlulgsz.R.inc(8326);bitRateAndFrameSizeTable[9][0][2][0] = 160;
        __CLR4_5_265b65blvlulgsz.R.inc(8327);bitRateAndFrameSizeTable[9][1][2][0] = 160;
        __CLR4_5_265b65blvlulgsz.R.inc(8328);bitRateAndFrameSizeTable[9][0][2][1] = 480;
        __CLR4_5_265b65blvlulgsz.R.inc(8329);bitRateAndFrameSizeTable[9][1][2][1] = 480;
        __CLR4_5_265b65blvlulgsz.R.inc(8330);bitRateAndFrameSizeTable[10][0][2][0] = 192;
        __CLR4_5_265b65blvlulgsz.R.inc(8331);bitRateAndFrameSizeTable[10][1][2][0] = 192;
        __CLR4_5_265b65blvlulgsz.R.inc(8332);bitRateAndFrameSizeTable[10][0][2][1] = 576;
        __CLR4_5_265b65blvlulgsz.R.inc(8333);bitRateAndFrameSizeTable[10][1][2][1] = 576;
        __CLR4_5_265b65blvlulgsz.R.inc(8334);bitRateAndFrameSizeTable[11][0][2][0] = 224;
        __CLR4_5_265b65blvlulgsz.R.inc(8335);bitRateAndFrameSizeTable[11][1][2][0] = 224;
        __CLR4_5_265b65blvlulgsz.R.inc(8336);bitRateAndFrameSizeTable[11][0][2][1] = 672;
        __CLR4_5_265b65blvlulgsz.R.inc(8337);bitRateAndFrameSizeTable[11][1][2][1] = 672;
        __CLR4_5_265b65blvlulgsz.R.inc(8338);bitRateAndFrameSizeTable[12][0][2][0] = 256;
        __CLR4_5_265b65blvlulgsz.R.inc(8339);bitRateAndFrameSizeTable[12][1][2][0] = 256;
        __CLR4_5_265b65blvlulgsz.R.inc(8340);bitRateAndFrameSizeTable[12][0][2][1] = 768;
        __CLR4_5_265b65blvlulgsz.R.inc(8341);bitRateAndFrameSizeTable[12][1][2][1] = 768;
        __CLR4_5_265b65blvlulgsz.R.inc(8342);bitRateAndFrameSizeTable[13][0][2][0] = 320;
        __CLR4_5_265b65blvlulgsz.R.inc(8343);bitRateAndFrameSizeTable[13][1][2][0] = 320;
        __CLR4_5_265b65blvlulgsz.R.inc(8344);bitRateAndFrameSizeTable[13][0][2][1] = 960;
        __CLR4_5_265b65blvlulgsz.R.inc(8345);bitRateAndFrameSizeTable[13][1][2][1] = 960;
        __CLR4_5_265b65blvlulgsz.R.inc(8346);bitRateAndFrameSizeTable[14][0][2][0] = 384;
        __CLR4_5_265b65blvlulgsz.R.inc(8347);bitRateAndFrameSizeTable[14][1][2][0] = 384;
        __CLR4_5_265b65blvlulgsz.R.inc(8348);bitRateAndFrameSizeTable[14][0][2][1] = 1152;
        __CLR4_5_265b65blvlulgsz.R.inc(8349);bitRateAndFrameSizeTable[14][1][2][1] = 1152;
        __CLR4_5_265b65blvlulgsz.R.inc(8350);bitRateAndFrameSizeTable[15][0][2][0] = 448;
        __CLR4_5_265b65blvlulgsz.R.inc(8351);bitRateAndFrameSizeTable[15][1][2][0] = 448;
        __CLR4_5_265b65blvlulgsz.R.inc(8352);bitRateAndFrameSizeTable[15][0][2][1] = 1344;
        __CLR4_5_265b65blvlulgsz.R.inc(8353);bitRateAndFrameSizeTable[15][1][2][1] = 1344;
        __CLR4_5_265b65blvlulgsz.R.inc(8354);bitRateAndFrameSizeTable[16][0][2][0] = 512;
        __CLR4_5_265b65blvlulgsz.R.inc(8355);bitRateAndFrameSizeTable[16][1][2][0] = 512;
        __CLR4_5_265b65blvlulgsz.R.inc(8356);bitRateAndFrameSizeTable[16][0][2][1] = 1536;
        __CLR4_5_265b65blvlulgsz.R.inc(8357);bitRateAndFrameSizeTable[16][1][2][1] = 1536;
        __CLR4_5_265b65blvlulgsz.R.inc(8358);bitRateAndFrameSizeTable[17][0][2][0] = 576;
        __CLR4_5_265b65blvlulgsz.R.inc(8359);bitRateAndFrameSizeTable[17][1][2][0] = 576;
        __CLR4_5_265b65blvlulgsz.R.inc(8360);bitRateAndFrameSizeTable[17][0][2][1] = 1728;
        __CLR4_5_265b65blvlulgsz.R.inc(8361);bitRateAndFrameSizeTable[17][1][2][1] = 1728;
        __CLR4_5_265b65blvlulgsz.R.inc(8362);bitRateAndFrameSizeTable[18][0][2][0] = 640;
        __CLR4_5_265b65blvlulgsz.R.inc(8363);bitRateAndFrameSizeTable[18][1][2][0] = 640;
        __CLR4_5_265b65blvlulgsz.R.inc(8364);bitRateAndFrameSizeTable[18][0][2][1] = 1920;
        __CLR4_5_265b65blvlulgsz.R.inc(8365);bitRateAndFrameSizeTable[18][1][2][1] = 1920;
    }finally{__CLR4_5_265b65blvlulgsz.R.flushNeeded();}}
}
