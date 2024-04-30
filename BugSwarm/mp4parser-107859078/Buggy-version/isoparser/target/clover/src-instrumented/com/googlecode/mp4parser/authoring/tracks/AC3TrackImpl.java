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

@java.lang.SuppressWarnings({"fallthrough"}) public class AC3TrackImpl extends AbstractTrack {public static class __CLR4_5_262o62olvl9eht3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,8271,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    static int[][][][] bitRateAndFrameSizeTable;
    private final DataSource dataSource;
    private List<Sample> samples;
    private long[] duration;
    private TrackMetaData trackMetaData = new TrackMetaData();
    private SampleDescriptionBox sampleDescriptionBox;


    public AC3TrackImpl(DataSource dataSource) throws IOException {
        this(dataSource, "eng");__CLR4_5_262o62olvl9eht3.R.inc(7873);try{__CLR4_5_262o62olvl9eht3.R.inc(7872);
    }finally{__CLR4_5_262o62olvl9eht3.R.flushNeeded();}}

    public AC3TrackImpl(DataSource dataSource, String lang) throws IOException {
        super(dataSource.toString());__CLR4_5_262o62olvl9eht3.R.inc(7875);try{__CLR4_5_262o62olvl9eht3.R.inc(7874);
        __CLR4_5_262o62olvl9eht3.R.inc(7876);this.dataSource = dataSource;
        __CLR4_5_262o62olvl9eht3.R.inc(7877);this.trackMetaData.setLanguage(lang);

        __CLR4_5_262o62olvl9eht3.R.inc(7878);samples = readSamples();


        __CLR4_5_262o62olvl9eht3.R.inc(7879);sampleDescriptionBox = new SampleDescriptionBox();
        __CLR4_5_262o62olvl9eht3.R.inc(7880);AudioSampleEntry ase = createAudioSampleEntry();
        __CLR4_5_262o62olvl9eht3.R.inc(7881);sampleDescriptionBox.addBox(ase);

        __CLR4_5_262o62olvl9eht3.R.inc(7882);trackMetaData.setCreationTime(new Date());
        __CLR4_5_262o62olvl9eht3.R.inc(7883);trackMetaData.setModificationTime(new Date());
        __CLR4_5_262o62olvl9eht3.R.inc(7884);trackMetaData.setLanguage(lang);
        __CLR4_5_262o62olvl9eht3.R.inc(7885);trackMetaData.setTimescale(ase.getSampleRate()); // Audio tracks always use samplerate as timescale
        __CLR4_5_262o62olvl9eht3.R.inc(7886);trackMetaData.setVolume(1);

    }finally{__CLR4_5_262o62olvl9eht3.R.flushNeeded();}}

    public void close() throws IOException {try{__CLR4_5_262o62olvl9eht3.R.inc(7887);
        __CLR4_5_262o62olvl9eht3.R.inc(7888);dataSource.close();
    }finally{__CLR4_5_262o62olvl9eht3.R.flushNeeded();}}

    public List<Sample> getSamples() {try{__CLR4_5_262o62olvl9eht3.R.inc(7889);

        __CLR4_5_262o62olvl9eht3.R.inc(7890);return samples;
    }finally{__CLR4_5_262o62olvl9eht3.R.flushNeeded();}}

    public SampleDescriptionBox getSampleDescriptionBox() {try{__CLR4_5_262o62olvl9eht3.R.inc(7891);
        __CLR4_5_262o62olvl9eht3.R.inc(7892);return sampleDescriptionBox;
    }finally{__CLR4_5_262o62olvl9eht3.R.flushNeeded();}}

    public synchronized long[] getSampleDurations() {try{__CLR4_5_262o62olvl9eht3.R.inc(7893);
        __CLR4_5_262o62olvl9eht3.R.inc(7894);return duration;
    }finally{__CLR4_5_262o62olvl9eht3.R.flushNeeded();}}

    public List<CompositionTimeToSample.Entry> getCompositionTimeEntries() {try{__CLR4_5_262o62olvl9eht3.R.inc(7895);
        __CLR4_5_262o62olvl9eht3.R.inc(7896);return null;
    }finally{__CLR4_5_262o62olvl9eht3.R.flushNeeded();}}

    public long[] getSyncSamples() {try{__CLR4_5_262o62olvl9eht3.R.inc(7897);
        __CLR4_5_262o62olvl9eht3.R.inc(7898);return null;
    }finally{__CLR4_5_262o62olvl9eht3.R.flushNeeded();}}

    public List<SampleDependencyTypeBox.Entry> getSampleDependencies() {try{__CLR4_5_262o62olvl9eht3.R.inc(7899);
        __CLR4_5_262o62olvl9eht3.R.inc(7900);return null;
    }finally{__CLR4_5_262o62olvl9eht3.R.flushNeeded();}}

    public TrackMetaData getTrackMetaData() {try{__CLR4_5_262o62olvl9eht3.R.inc(7901);
        __CLR4_5_262o62olvl9eht3.R.inc(7902);return trackMetaData;
    }finally{__CLR4_5_262o62olvl9eht3.R.flushNeeded();}}

    public String getHandler() {try{__CLR4_5_262o62olvl9eht3.R.inc(7903);
        __CLR4_5_262o62olvl9eht3.R.inc(7904);return "soun";
    }finally{__CLR4_5_262o62olvl9eht3.R.flushNeeded();}}

    public SubSampleInformationBox getSubsampleInformationBox() {try{__CLR4_5_262o62olvl9eht3.R.inc(7905);
        __CLR4_5_262o62olvl9eht3.R.inc(7906);return null;
    }finally{__CLR4_5_262o62olvl9eht3.R.flushNeeded();}}

    private AudioSampleEntry createAudioSampleEntry() throws IOException {try{__CLR4_5_262o62olvl9eht3.R.inc(7907);


        __CLR4_5_262o62olvl9eht3.R.inc(7908);ByteBuffer bb = samples.get(0).asByteBuffer();
        __CLR4_5_262o62olvl9eht3.R.inc(7909);BitReaderBuffer brb = new BitReaderBuffer(bb);
        __CLR4_5_262o62olvl9eht3.R.inc(7910);int syncword = brb.readBits(16);
        __CLR4_5_262o62olvl9eht3.R.inc(7911);if ((((syncword != 0xb77)&&(__CLR4_5_262o62olvl9eht3.R.iget(7912)!=0|true))||(__CLR4_5_262o62olvl9eht3.R.iget(7913)==0&false))) {{
            __CLR4_5_262o62olvl9eht3.R.inc(7914);throw new RuntimeException("Stream doesn't seem to be AC3");
        }
        }__CLR4_5_262o62olvl9eht3.R.inc(7915);brb.readBits(16); // CRC-1
        __CLR4_5_262o62olvl9eht3.R.inc(7916);int fscod = brb.readBits(2);
        __CLR4_5_262o62olvl9eht3.R.inc(7917);int samplerate;
        boolean __CLB4_5_2_bool0=false;__CLR4_5_262o62olvl9eht3.R.inc(7918);switch (fscod) {
            case 0:if (!__CLB4_5_2_bool0) {__CLR4_5_262o62olvl9eht3.R.inc(7919);__CLB4_5_2_bool0=true;}
                __CLR4_5_262o62olvl9eht3.R.inc(7920);samplerate = 48000;
                __CLR4_5_262o62olvl9eht3.R.inc(7921);break;

            case 1:if (!__CLB4_5_2_bool0) {__CLR4_5_262o62olvl9eht3.R.inc(7922);__CLB4_5_2_bool0=true;}
                __CLR4_5_262o62olvl9eht3.R.inc(7923);samplerate = 44100;
                __CLR4_5_262o62olvl9eht3.R.inc(7924);break;

            case 2:if (!__CLB4_5_2_bool0) {__CLR4_5_262o62olvl9eht3.R.inc(7925);__CLB4_5_2_bool0=true;}
                __CLR4_5_262o62olvl9eht3.R.inc(7926);samplerate = 32000;
                __CLR4_5_262o62olvl9eht3.R.inc(7927);break;

            default:if (!__CLB4_5_2_bool0) {__CLR4_5_262o62olvl9eht3.R.inc(7928);__CLB4_5_2_bool0=true;}
                __CLR4_5_262o62olvl9eht3.R.inc(7929);throw new RuntimeException("Unsupported Sample Rate");

        }

        __CLR4_5_262o62olvl9eht3.R.inc(7930);int frmsizecod = brb.readBits(6);


        __CLR4_5_262o62olvl9eht3.R.inc(7931);int bsid = brb.readBits(5);
        __CLR4_5_262o62olvl9eht3.R.inc(7932);int bsmod = brb.readBits(3);
        __CLR4_5_262o62olvl9eht3.R.inc(7933);int acmod = brb.readBits(3);

        __CLR4_5_262o62olvl9eht3.R.inc(7934);if ((((bsid == 16)&&(__CLR4_5_262o62olvl9eht3.R.iget(7935)!=0|true))||(__CLR4_5_262o62olvl9eht3.R.iget(7936)==0&false))) {{
            __CLR4_5_262o62olvl9eht3.R.inc(7937);throw new RuntimeException("You cannot read E-AC-3 track with AC3TrackImpl.class - user EC3TrackImpl.class");
        }

        }__CLR4_5_262o62olvl9eht3.R.inc(7938);if ((((bsid == 9)&&(__CLR4_5_262o62olvl9eht3.R.iget(7939)!=0|true))||(__CLR4_5_262o62olvl9eht3.R.iget(7940)==0&false))) {{
            __CLR4_5_262o62olvl9eht3.R.inc(7941);samplerate /= 2;
        } }else {__CLR4_5_262o62olvl9eht3.R.inc(7942);if ((((bsid != 8 && bsid != 6)&&(__CLR4_5_262o62olvl9eht3.R.iget(7943)!=0|true))||(__CLR4_5_262o62olvl9eht3.R.iget(7944)==0&false))) {{
            __CLR4_5_262o62olvl9eht3.R.inc(7945);throw new RuntimeException("Unsupported bsid");
        }

        }}__CLR4_5_262o62olvl9eht3.R.inc(7946);if (((((acmod != 1) && ((acmod & 1) == 1))&&(__CLR4_5_262o62olvl9eht3.R.iget(7947)!=0|true))||(__CLR4_5_262o62olvl9eht3.R.iget(7948)==0&false))) {{
            __CLR4_5_262o62olvl9eht3.R.inc(7949);brb.readBits(2);
        }

        }__CLR4_5_262o62olvl9eht3.R.inc(7950);if ((((0 != (acmod & 4))&&(__CLR4_5_262o62olvl9eht3.R.iget(7951)!=0|true))||(__CLR4_5_262o62olvl9eht3.R.iget(7952)==0&false))) {{
            __CLR4_5_262o62olvl9eht3.R.inc(7953);brb.readBits(2);
        }

        }__CLR4_5_262o62olvl9eht3.R.inc(7954);if ((((acmod == 2)&&(__CLR4_5_262o62olvl9eht3.R.iget(7955)!=0|true))||(__CLR4_5_262o62olvl9eht3.R.iget(7956)==0&false))) {{
            __CLR4_5_262o62olvl9eht3.R.inc(7957);brb.readBits(2);
        }
        }__CLR4_5_262o62olvl9eht3.R.inc(7958);int channelCount;
        boolean __CLB4_5_2_bool1=false;__CLR4_5_262o62olvl9eht3.R.inc(7959);switch (acmod) {
            case 0:if (!__CLB4_5_2_bool1) {__CLR4_5_262o62olvl9eht3.R.inc(7960);__CLB4_5_2_bool1=true;}
                __CLR4_5_262o62olvl9eht3.R.inc(7961);channelCount = 2;
                __CLR4_5_262o62olvl9eht3.R.inc(7962);break;

            case 1:if (!__CLB4_5_2_bool1) {__CLR4_5_262o62olvl9eht3.R.inc(7963);__CLB4_5_2_bool1=true;}
                __CLR4_5_262o62olvl9eht3.R.inc(7964);channelCount = 1;
                __CLR4_5_262o62olvl9eht3.R.inc(7965);break;

            case 2:if (!__CLB4_5_2_bool1) {__CLR4_5_262o62olvl9eht3.R.inc(7966);__CLB4_5_2_bool1=true;}
                __CLR4_5_262o62olvl9eht3.R.inc(7967);channelCount = 2;
                __CLR4_5_262o62olvl9eht3.R.inc(7968);break;

            case 3:if (!__CLB4_5_2_bool1) {__CLR4_5_262o62olvl9eht3.R.inc(7969);__CLB4_5_2_bool1=true;}
                __CLR4_5_262o62olvl9eht3.R.inc(7970);channelCount = 3;
                __CLR4_5_262o62olvl9eht3.R.inc(7971);break;

            case 4:if (!__CLB4_5_2_bool1) {__CLR4_5_262o62olvl9eht3.R.inc(7972);__CLB4_5_2_bool1=true;}
                __CLR4_5_262o62olvl9eht3.R.inc(7973);channelCount = 3;
                __CLR4_5_262o62olvl9eht3.R.inc(7974);break;

            case 5:if (!__CLB4_5_2_bool1) {__CLR4_5_262o62olvl9eht3.R.inc(7975);__CLB4_5_2_bool1=true;}
                __CLR4_5_262o62olvl9eht3.R.inc(7976);channelCount = 4;
                __CLR4_5_262o62olvl9eht3.R.inc(7977);break;

            case 6:if (!__CLB4_5_2_bool1) {__CLR4_5_262o62olvl9eht3.R.inc(7978);__CLB4_5_2_bool1=true;}
                __CLR4_5_262o62olvl9eht3.R.inc(7979);channelCount = 4;
                __CLR4_5_262o62olvl9eht3.R.inc(7980);break;

            case 7:if (!__CLB4_5_2_bool1) {__CLR4_5_262o62olvl9eht3.R.inc(7981);__CLB4_5_2_bool1=true;}
                __CLR4_5_262o62olvl9eht3.R.inc(7982);channelCount = 5;
                __CLR4_5_262o62olvl9eht3.R.inc(7983);break;
            default:if (!__CLB4_5_2_bool1) {__CLR4_5_262o62olvl9eht3.R.inc(7984);__CLB4_5_2_bool1=true;}
                __CLR4_5_262o62olvl9eht3.R.inc(7985);throw new RuntimeException("Unsupported acmod");

        }

        __CLR4_5_262o62olvl9eht3.R.inc(7986);int lfeon = brb.readBits(1);

        __CLR4_5_262o62olvl9eht3.R.inc(7987);if ((((lfeon == 1)&&(__CLR4_5_262o62olvl9eht3.R.iget(7988)!=0|true))||(__CLR4_5_262o62olvl9eht3.R.iget(7989)==0&false))) {{
            __CLR4_5_262o62olvl9eht3.R.inc(7990);channelCount++;
        }
        }__CLR4_5_262o62olvl9eht3.R.inc(7991);AudioSampleEntry audioSampleEntry = new AudioSampleEntry("ac-3");
        __CLR4_5_262o62olvl9eht3.R.inc(7992);audioSampleEntry.setChannelCount(2);  // According to  ETSI TS 102 366 Annex F
        __CLR4_5_262o62olvl9eht3.R.inc(7993);audioSampleEntry.setSampleRate(samplerate);
        __CLR4_5_262o62olvl9eht3.R.inc(7994);audioSampleEntry.setDataReferenceIndex(1);
        __CLR4_5_262o62olvl9eht3.R.inc(7995);audioSampleEntry.setSampleSize(16);

        __CLR4_5_262o62olvl9eht3.R.inc(7996);AC3SpecificBox ac3 = new AC3SpecificBox();
        __CLR4_5_262o62olvl9eht3.R.inc(7997);ac3.setAcmod(acmod);
        __CLR4_5_262o62olvl9eht3.R.inc(7998);ac3.setBitRateCode(frmsizecod >> 1);
        __CLR4_5_262o62olvl9eht3.R.inc(7999);ac3.setBsid(bsid);
        __CLR4_5_262o62olvl9eht3.R.inc(8000);ac3.setBsmod(bsmod);
        __CLR4_5_262o62olvl9eht3.R.inc(8001);ac3.setFscod(fscod);
        __CLR4_5_262o62olvl9eht3.R.inc(8002);ac3.setLfeon(lfeon);
        __CLR4_5_262o62olvl9eht3.R.inc(8003);ac3.setReserved(0);

        __CLR4_5_262o62olvl9eht3.R.inc(8004);audioSampleEntry.addBox(ac3);
        __CLR4_5_262o62olvl9eht3.R.inc(8005);return audioSampleEntry;
    }finally{__CLR4_5_262o62olvl9eht3.R.flushNeeded();}}

    private int getFrameSize(int code, int fscod) {try{__CLR4_5_262o62olvl9eht3.R.inc(8006);
        __CLR4_5_262o62olvl9eht3.R.inc(8007);int frmsizecode = code >>> 1;
        __CLR4_5_262o62olvl9eht3.R.inc(8008);int flag = code & 1;
        __CLR4_5_262o62olvl9eht3.R.inc(8009);if ((((frmsizecode > 18 || flag > 1 || fscod > 2)&&(__CLR4_5_262o62olvl9eht3.R.iget(8010)!=0|true))||(__CLR4_5_262o62olvl9eht3.R.iget(8011)==0&false))) {{
            __CLR4_5_262o62olvl9eht3.R.inc(8012);throw new RuntimeException("Cannot determine framesize of current sample");
        }
        }__CLR4_5_262o62olvl9eht3.R.inc(8013);return  2 * bitRateAndFrameSizeTable[frmsizecode][flag][fscod][1];

    }finally{__CLR4_5_262o62olvl9eht3.R.flushNeeded();}}


    private List<Sample> readSamples() throws IOException {try{__CLR4_5_262o62olvl9eht3.R.inc(8014);
        class SampleImpl implements Sample{
            private final long start;
            private final long size;
            private final DataSource dataSource;

            public SampleImpl(long start, long size, DataSource dataSource) {try{__CLR4_5_262o62olvl9eht3.R.inc(8015);

                __CLR4_5_262o62olvl9eht3.R.inc(8016);this.start = start;
                __CLR4_5_262o62olvl9eht3.R.inc(8017);this.size = size;
                __CLR4_5_262o62olvl9eht3.R.inc(8018);this.dataSource = dataSource;
            }finally{__CLR4_5_262o62olvl9eht3.R.flushNeeded();}}
            public void writeTo(WritableByteChannel channel) throws IOException {try{__CLR4_5_262o62olvl9eht3.R.inc(8019);
                __CLR4_5_262o62olvl9eht3.R.inc(8020);dataSource.transferTo(start, size, channel);
            }finally{__CLR4_5_262o62olvl9eht3.R.flushNeeded();}}

            public long getSize() {try{__CLR4_5_262o62olvl9eht3.R.inc(8021);
                __CLR4_5_262o62olvl9eht3.R.inc(8022);return size;
            }finally{__CLR4_5_262o62olvl9eht3.R.flushNeeded();}}

            public ByteBuffer asByteBuffer() {try{__CLR4_5_262o62olvl9eht3.R.inc(8023);
                __CLR4_5_262o62olvl9eht3.R.inc(8024);try {
                    __CLR4_5_262o62olvl9eht3.R.inc(8025);return dataSource.map(start, size);
                } catch (IOException e) {
                    __CLR4_5_262o62olvl9eht3.R.inc(8026);throw new RuntimeException(e);
                }
            }finally{__CLR4_5_262o62olvl9eht3.R.flushNeeded();}}

        }

        __CLR4_5_262o62olvl9eht3.R.inc(8027);ByteBuffer header =  ByteBuffer.allocate(5);
        __CLR4_5_262o62olvl9eht3.R.inc(8028);List<Sample> mysamples = new ArrayList<Sample>();

        __CLR4_5_262o62olvl9eht3.R.inc(8029);while ((((-1 != dataSource.read(header))&&(__CLR4_5_262o62olvl9eht3.R.iget(8030)!=0|true))||(__CLR4_5_262o62olvl9eht3.R.iget(8031)==0&false))) {{
            __CLR4_5_262o62olvl9eht3.R.inc(8032);int frmsizecode = header.get(4) & 63;
            __CLR4_5_262o62olvl9eht3.R.inc(8033);int fscod = header.get(4)>>6;
            __CLR4_5_262o62olvl9eht3.R.inc(8034);int frameSize = getFrameSize(frmsizecode, fscod);
            __CLR4_5_262o62olvl9eht3.R.inc(8035);mysamples.add(new SampleImpl(dataSource.position()-5 , frameSize, dataSource));
            __CLR4_5_262o62olvl9eht3.R.inc(8036);dataSource.position(dataSource.position() - 5 + frameSize);
            __CLR4_5_262o62olvl9eht3.R.inc(8037);header.rewind();

        }
        }__CLR4_5_262o62olvl9eht3.R.inc(8038);duration = new long[mysamples.size()];
        __CLR4_5_262o62olvl9eht3.R.inc(8039);Arrays.fill(duration, 1536);
        __CLR4_5_262o62olvl9eht3.R.inc(8040);return mysamples;
    }finally{__CLR4_5_262o62olvl9eht3.R.flushNeeded();}}

    static {try{__CLR4_5_262o62olvl9eht3.R.inc(8041);
        __CLR4_5_262o62olvl9eht3.R.inc(8042);bitRateAndFrameSizeTable = new int[19][2][3][2];
        // ETSI 102 366 Table 4.13, in frmsizecod, flag, fscod, bitrate/size order. Note that all sizes are in words, and all bitrates in kbps

        // 48kHz
        __CLR4_5_262o62olvl9eht3.R.inc(8043);bitRateAndFrameSizeTable[0][0][0][0] = 32;
        __CLR4_5_262o62olvl9eht3.R.inc(8044);bitRateAndFrameSizeTable[0][1][0][0] = 32;
        __CLR4_5_262o62olvl9eht3.R.inc(8045);bitRateAndFrameSizeTable[0][0][0][1] = 64;
        __CLR4_5_262o62olvl9eht3.R.inc(8046);bitRateAndFrameSizeTable[0][1][0][1] = 64;
        __CLR4_5_262o62olvl9eht3.R.inc(8047);bitRateAndFrameSizeTable[1][0][0][0] = 40;
        __CLR4_5_262o62olvl9eht3.R.inc(8048);bitRateAndFrameSizeTable[1][1][0][0] = 40;
        __CLR4_5_262o62olvl9eht3.R.inc(8049);bitRateAndFrameSizeTable[1][0][0][1] = 80;
        __CLR4_5_262o62olvl9eht3.R.inc(8050);bitRateAndFrameSizeTable[1][1][0][1] = 80;
        __CLR4_5_262o62olvl9eht3.R.inc(8051);bitRateAndFrameSizeTable[2][0][0][0] = 48;
        __CLR4_5_262o62olvl9eht3.R.inc(8052);bitRateAndFrameSizeTable[2][1][0][0] = 48;
        __CLR4_5_262o62olvl9eht3.R.inc(8053);bitRateAndFrameSizeTable[2][0][0][1] = 96;
        __CLR4_5_262o62olvl9eht3.R.inc(8054);bitRateAndFrameSizeTable[2][1][0][1] = 96;
        __CLR4_5_262o62olvl9eht3.R.inc(8055);bitRateAndFrameSizeTable[3][0][0][0] = 56;
        __CLR4_5_262o62olvl9eht3.R.inc(8056);bitRateAndFrameSizeTable[3][1][0][0] = 56;
        __CLR4_5_262o62olvl9eht3.R.inc(8057);bitRateAndFrameSizeTable[3][0][0][1] = 112;
        __CLR4_5_262o62olvl9eht3.R.inc(8058);bitRateAndFrameSizeTable[3][1][0][1] = 112;
        __CLR4_5_262o62olvl9eht3.R.inc(8059);bitRateAndFrameSizeTable[4][0][0][0] = 64;
        __CLR4_5_262o62olvl9eht3.R.inc(8060);bitRateAndFrameSizeTable[4][1][0][0] = 64;
        __CLR4_5_262o62olvl9eht3.R.inc(8061);bitRateAndFrameSizeTable[4][0][0][1] = 128;
        __CLR4_5_262o62olvl9eht3.R.inc(8062);bitRateAndFrameSizeTable[4][1][0][1] = 128;
        __CLR4_5_262o62olvl9eht3.R.inc(8063);bitRateAndFrameSizeTable[5][0][0][0] = 80;
        __CLR4_5_262o62olvl9eht3.R.inc(8064);bitRateAndFrameSizeTable[5][1][0][0] = 80;
        __CLR4_5_262o62olvl9eht3.R.inc(8065);bitRateAndFrameSizeTable[5][0][0][1] = 160;
        __CLR4_5_262o62olvl9eht3.R.inc(8066);bitRateAndFrameSizeTable[5][1][0][1] = 160;
        __CLR4_5_262o62olvl9eht3.R.inc(8067);bitRateAndFrameSizeTable[6][0][0][0] = 96;
        __CLR4_5_262o62olvl9eht3.R.inc(8068);bitRateAndFrameSizeTable[6][1][0][0] = 96;
        __CLR4_5_262o62olvl9eht3.R.inc(8069);bitRateAndFrameSizeTable[6][0][0][1] = 192;
        __CLR4_5_262o62olvl9eht3.R.inc(8070);bitRateAndFrameSizeTable[6][1][0][1] = 192;
        __CLR4_5_262o62olvl9eht3.R.inc(8071);bitRateAndFrameSizeTable[7][0][0][0] = 112;
        __CLR4_5_262o62olvl9eht3.R.inc(8072);bitRateAndFrameSizeTable[7][1][0][0] = 112;
        __CLR4_5_262o62olvl9eht3.R.inc(8073);bitRateAndFrameSizeTable[7][0][0][1] = 224;
        __CLR4_5_262o62olvl9eht3.R.inc(8074);bitRateAndFrameSizeTable[7][1][0][1] = 224;
        __CLR4_5_262o62olvl9eht3.R.inc(8075);bitRateAndFrameSizeTable[8][0][0][0] = 128;
        __CLR4_5_262o62olvl9eht3.R.inc(8076);bitRateAndFrameSizeTable[8][1][0][0] = 128;
        __CLR4_5_262o62olvl9eht3.R.inc(8077);bitRateAndFrameSizeTable[8][0][0][1] = 256;
        __CLR4_5_262o62olvl9eht3.R.inc(8078);bitRateAndFrameSizeTable[8][1][0][1] = 256;
        __CLR4_5_262o62olvl9eht3.R.inc(8079);bitRateAndFrameSizeTable[9][0][0][0] = 160;
        __CLR4_5_262o62olvl9eht3.R.inc(8080);bitRateAndFrameSizeTable[9][1][0][0] = 160;
        __CLR4_5_262o62olvl9eht3.R.inc(8081);bitRateAndFrameSizeTable[9][0][0][1] = 320;
        __CLR4_5_262o62olvl9eht3.R.inc(8082);bitRateAndFrameSizeTable[9][1][0][1] = 320;
        __CLR4_5_262o62olvl9eht3.R.inc(8083);bitRateAndFrameSizeTable[10][0][0][0] = 192;
        __CLR4_5_262o62olvl9eht3.R.inc(8084);bitRateAndFrameSizeTable[10][1][0][0] = 192;
        __CLR4_5_262o62olvl9eht3.R.inc(8085);bitRateAndFrameSizeTable[10][0][0][1] = 384;
        __CLR4_5_262o62olvl9eht3.R.inc(8086);bitRateAndFrameSizeTable[10][1][0][1] = 384;
        __CLR4_5_262o62olvl9eht3.R.inc(8087);bitRateAndFrameSizeTable[11][0][0][0] = 224;
        __CLR4_5_262o62olvl9eht3.R.inc(8088);bitRateAndFrameSizeTable[11][1][0][0] = 224;
        __CLR4_5_262o62olvl9eht3.R.inc(8089);bitRateAndFrameSizeTable[11][0][0][1] = 448;
        __CLR4_5_262o62olvl9eht3.R.inc(8090);bitRateAndFrameSizeTable[11][1][0][1] = 448;
        __CLR4_5_262o62olvl9eht3.R.inc(8091);bitRateAndFrameSizeTable[12][0][0][0] = 256;
        __CLR4_5_262o62olvl9eht3.R.inc(8092);bitRateAndFrameSizeTable[12][1][0][0] = 256;
        __CLR4_5_262o62olvl9eht3.R.inc(8093);bitRateAndFrameSizeTable[12][0][0][1] = 512;
        __CLR4_5_262o62olvl9eht3.R.inc(8094);bitRateAndFrameSizeTable[12][1][0][1] = 512;
        __CLR4_5_262o62olvl9eht3.R.inc(8095);bitRateAndFrameSizeTable[13][0][0][0] = 320;
        __CLR4_5_262o62olvl9eht3.R.inc(8096);bitRateAndFrameSizeTable[13][1][0][0] = 320;
        __CLR4_5_262o62olvl9eht3.R.inc(8097);bitRateAndFrameSizeTable[13][0][0][1] = 640;
        __CLR4_5_262o62olvl9eht3.R.inc(8098);bitRateAndFrameSizeTable[13][1][0][1] = 640;
        __CLR4_5_262o62olvl9eht3.R.inc(8099);bitRateAndFrameSizeTable[14][0][0][0] = 384;
        __CLR4_5_262o62olvl9eht3.R.inc(8100);bitRateAndFrameSizeTable[14][1][0][0] = 384;
        __CLR4_5_262o62olvl9eht3.R.inc(8101);bitRateAndFrameSizeTable[14][0][0][1] = 768;
        __CLR4_5_262o62olvl9eht3.R.inc(8102);bitRateAndFrameSizeTable[14][1][0][1] = 768;
        __CLR4_5_262o62olvl9eht3.R.inc(8103);bitRateAndFrameSizeTable[15][0][0][0] = 448;
        __CLR4_5_262o62olvl9eht3.R.inc(8104);bitRateAndFrameSizeTable[15][1][0][0] = 448;
        __CLR4_5_262o62olvl9eht3.R.inc(8105);bitRateAndFrameSizeTable[15][0][0][1] = 896;
        __CLR4_5_262o62olvl9eht3.R.inc(8106);bitRateAndFrameSizeTable[15][1][0][1] = 896;
        __CLR4_5_262o62olvl9eht3.R.inc(8107);bitRateAndFrameSizeTable[16][0][0][0] = 512;
        __CLR4_5_262o62olvl9eht3.R.inc(8108);bitRateAndFrameSizeTable[16][1][0][0] = 512;
        __CLR4_5_262o62olvl9eht3.R.inc(8109);bitRateAndFrameSizeTable[16][0][0][1] = 1024;
        __CLR4_5_262o62olvl9eht3.R.inc(8110);bitRateAndFrameSizeTable[16][1][0][1] = 1024;
        __CLR4_5_262o62olvl9eht3.R.inc(8111);bitRateAndFrameSizeTable[17][0][0][0] = 576;
        __CLR4_5_262o62olvl9eht3.R.inc(8112);bitRateAndFrameSizeTable[17][1][0][0] = 576;
        __CLR4_5_262o62olvl9eht3.R.inc(8113);bitRateAndFrameSizeTable[17][0][0][1] = 1152;
        __CLR4_5_262o62olvl9eht3.R.inc(8114);bitRateAndFrameSizeTable[17][1][0][1] = 1152;
        __CLR4_5_262o62olvl9eht3.R.inc(8115);bitRateAndFrameSizeTable[18][0][0][0] = 640;
        __CLR4_5_262o62olvl9eht3.R.inc(8116);bitRateAndFrameSizeTable[18][1][0][0] = 640;
        __CLR4_5_262o62olvl9eht3.R.inc(8117);bitRateAndFrameSizeTable[18][0][0][1] = 1280;
        __CLR4_5_262o62olvl9eht3.R.inc(8118);bitRateAndFrameSizeTable[18][1][0][1] = 1280;

        // 44.1 kHz
        __CLR4_5_262o62olvl9eht3.R.inc(8119);bitRateAndFrameSizeTable[0][0][1][0] = 32;
        __CLR4_5_262o62olvl9eht3.R.inc(8120);bitRateAndFrameSizeTable[0][1][1][0] = 32;
        __CLR4_5_262o62olvl9eht3.R.inc(8121);bitRateAndFrameSizeTable[0][0][1][1] = 69;
        __CLR4_5_262o62olvl9eht3.R.inc(8122);bitRateAndFrameSizeTable[0][1][1][1] = 70;
        __CLR4_5_262o62olvl9eht3.R.inc(8123);bitRateAndFrameSizeTable[1][0][1][0] = 40;
        __CLR4_5_262o62olvl9eht3.R.inc(8124);bitRateAndFrameSizeTable[1][1][1][0] = 40;
        __CLR4_5_262o62olvl9eht3.R.inc(8125);bitRateAndFrameSizeTable[1][0][1][1] = 87;
        __CLR4_5_262o62olvl9eht3.R.inc(8126);bitRateAndFrameSizeTable[1][1][1][1] = 88;
        __CLR4_5_262o62olvl9eht3.R.inc(8127);bitRateAndFrameSizeTable[2][0][1][0] = 48;
        __CLR4_5_262o62olvl9eht3.R.inc(8128);bitRateAndFrameSizeTable[2][1][1][0] = 48;
        __CLR4_5_262o62olvl9eht3.R.inc(8129);bitRateAndFrameSizeTable[2][0][1][1] = 104;
        __CLR4_5_262o62olvl9eht3.R.inc(8130);bitRateAndFrameSizeTable[2][1][1][1] = 105;
        __CLR4_5_262o62olvl9eht3.R.inc(8131);bitRateAndFrameSizeTable[3][0][1][0] = 56;
        __CLR4_5_262o62olvl9eht3.R.inc(8132);bitRateAndFrameSizeTable[3][1][1][0] = 56;
        __CLR4_5_262o62olvl9eht3.R.inc(8133);bitRateAndFrameSizeTable[3][0][1][1] = 121;
        __CLR4_5_262o62olvl9eht3.R.inc(8134);bitRateAndFrameSizeTable[3][1][1][1] = 122;
        __CLR4_5_262o62olvl9eht3.R.inc(8135);bitRateAndFrameSizeTable[4][0][1][0] = 64;
        __CLR4_5_262o62olvl9eht3.R.inc(8136);bitRateAndFrameSizeTable[4][1][1][0] = 64;
        __CLR4_5_262o62olvl9eht3.R.inc(8137);bitRateAndFrameSizeTable[4][0][1][1] = 139;
        __CLR4_5_262o62olvl9eht3.R.inc(8138);bitRateAndFrameSizeTable[4][1][1][1] = 140;
        __CLR4_5_262o62olvl9eht3.R.inc(8139);bitRateAndFrameSizeTable[5][0][1][0] = 80;
        __CLR4_5_262o62olvl9eht3.R.inc(8140);bitRateAndFrameSizeTable[5][1][1][0] = 80;
        __CLR4_5_262o62olvl9eht3.R.inc(8141);bitRateAndFrameSizeTable[5][0][1][1] = 174;
        __CLR4_5_262o62olvl9eht3.R.inc(8142);bitRateAndFrameSizeTable[5][1][1][1] = 175;
        __CLR4_5_262o62olvl9eht3.R.inc(8143);bitRateAndFrameSizeTable[6][0][1][0] = 96;
        __CLR4_5_262o62olvl9eht3.R.inc(8144);bitRateAndFrameSizeTable[6][1][1][0] = 96;
        __CLR4_5_262o62olvl9eht3.R.inc(8145);bitRateAndFrameSizeTable[6][0][1][1] = 208;
        __CLR4_5_262o62olvl9eht3.R.inc(8146);bitRateAndFrameSizeTable[6][1][1][1] = 209;
        __CLR4_5_262o62olvl9eht3.R.inc(8147);bitRateAndFrameSizeTable[7][0][1][0] = 112;
        __CLR4_5_262o62olvl9eht3.R.inc(8148);bitRateAndFrameSizeTable[7][1][1][0] = 112;
        __CLR4_5_262o62olvl9eht3.R.inc(8149);bitRateAndFrameSizeTable[7][0][1][1] = 243;
        __CLR4_5_262o62olvl9eht3.R.inc(8150);bitRateAndFrameSizeTable[7][1][1][1] = 244;
        __CLR4_5_262o62olvl9eht3.R.inc(8151);bitRateAndFrameSizeTable[8][0][1][0] = 128;
        __CLR4_5_262o62olvl9eht3.R.inc(8152);bitRateAndFrameSizeTable[8][1][1][0] = 128;
        __CLR4_5_262o62olvl9eht3.R.inc(8153);bitRateAndFrameSizeTable[8][0][1][1] = 278;
        __CLR4_5_262o62olvl9eht3.R.inc(8154);bitRateAndFrameSizeTable[8][1][1][1] = 279;
        __CLR4_5_262o62olvl9eht3.R.inc(8155);bitRateAndFrameSizeTable[9][0][1][0] = 160;
        __CLR4_5_262o62olvl9eht3.R.inc(8156);bitRateAndFrameSizeTable[9][1][1][0] = 160;
        __CLR4_5_262o62olvl9eht3.R.inc(8157);bitRateAndFrameSizeTable[9][0][1][1] = 348;
        __CLR4_5_262o62olvl9eht3.R.inc(8158);bitRateAndFrameSizeTable[9][1][1][1] = 349;
        __CLR4_5_262o62olvl9eht3.R.inc(8159);bitRateAndFrameSizeTable[10][0][1][0] = 192;
        __CLR4_5_262o62olvl9eht3.R.inc(8160);bitRateAndFrameSizeTable[10][1][1][0] = 192;
        __CLR4_5_262o62olvl9eht3.R.inc(8161);bitRateAndFrameSizeTable[10][0][1][1] = 417;
        __CLR4_5_262o62olvl9eht3.R.inc(8162);bitRateAndFrameSizeTable[10][1][1][1] = 418;
        __CLR4_5_262o62olvl9eht3.R.inc(8163);bitRateAndFrameSizeTable[11][0][1][0] = 224;
        __CLR4_5_262o62olvl9eht3.R.inc(8164);bitRateAndFrameSizeTable[11][1][1][0] = 224;
        __CLR4_5_262o62olvl9eht3.R.inc(8165);bitRateAndFrameSizeTable[11][0][1][1] = 487;
        __CLR4_5_262o62olvl9eht3.R.inc(8166);bitRateAndFrameSizeTable[11][1][1][1] = 488;
        __CLR4_5_262o62olvl9eht3.R.inc(8167);bitRateAndFrameSizeTable[12][0][1][0] = 256;
        __CLR4_5_262o62olvl9eht3.R.inc(8168);bitRateAndFrameSizeTable[12][1][1][0] = 256;
        __CLR4_5_262o62olvl9eht3.R.inc(8169);bitRateAndFrameSizeTable[12][0][1][1] = 557;
        __CLR4_5_262o62olvl9eht3.R.inc(8170);bitRateAndFrameSizeTable[12][1][1][1] = 558;
        __CLR4_5_262o62olvl9eht3.R.inc(8171);bitRateAndFrameSizeTable[13][0][1][0] = 320;
        __CLR4_5_262o62olvl9eht3.R.inc(8172);bitRateAndFrameSizeTable[13][1][1][0] = 320;
        __CLR4_5_262o62olvl9eht3.R.inc(8173);bitRateAndFrameSizeTable[13][0][1][1] = 696;
        __CLR4_5_262o62olvl9eht3.R.inc(8174);bitRateAndFrameSizeTable[13][1][1][1] = 697;
        __CLR4_5_262o62olvl9eht3.R.inc(8175);bitRateAndFrameSizeTable[14][0][1][0] = 384;
        __CLR4_5_262o62olvl9eht3.R.inc(8176);bitRateAndFrameSizeTable[14][1][1][0] = 384;
        __CLR4_5_262o62olvl9eht3.R.inc(8177);bitRateAndFrameSizeTable[14][0][1][1] = 835;
        __CLR4_5_262o62olvl9eht3.R.inc(8178);bitRateAndFrameSizeTable[14][1][1][1] = 836;
        __CLR4_5_262o62olvl9eht3.R.inc(8179);bitRateAndFrameSizeTable[15][0][1][0] = 448;
        __CLR4_5_262o62olvl9eht3.R.inc(8180);bitRateAndFrameSizeTable[15][1][1][0] = 448;
        __CLR4_5_262o62olvl9eht3.R.inc(8181);bitRateAndFrameSizeTable[15][0][1][1] = 975;
        __CLR4_5_262o62olvl9eht3.R.inc(8182);bitRateAndFrameSizeTable[15][1][1][1] = 975;
        __CLR4_5_262o62olvl9eht3.R.inc(8183);bitRateAndFrameSizeTable[16][0][1][0] = 512;
        __CLR4_5_262o62olvl9eht3.R.inc(8184);bitRateAndFrameSizeTable[16][1][1][0] = 512;
        __CLR4_5_262o62olvl9eht3.R.inc(8185);bitRateAndFrameSizeTable[16][0][1][1] = 1114;
        __CLR4_5_262o62olvl9eht3.R.inc(8186);bitRateAndFrameSizeTable[16][1][1][1] = 1115;
        __CLR4_5_262o62olvl9eht3.R.inc(8187);bitRateAndFrameSizeTable[17][0][1][0] = 576;
        __CLR4_5_262o62olvl9eht3.R.inc(8188);bitRateAndFrameSizeTable[17][1][1][0] = 576;
        __CLR4_5_262o62olvl9eht3.R.inc(8189);bitRateAndFrameSizeTable[17][0][1][1] = 1253;
        __CLR4_5_262o62olvl9eht3.R.inc(8190);bitRateAndFrameSizeTable[17][1][1][1] = 1254;
        __CLR4_5_262o62olvl9eht3.R.inc(8191);bitRateAndFrameSizeTable[18][0][1][0] = 640;
        __CLR4_5_262o62olvl9eht3.R.inc(8192);bitRateAndFrameSizeTable[18][1][1][0] = 640;
        __CLR4_5_262o62olvl9eht3.R.inc(8193);bitRateAndFrameSizeTable[18][0][1][1] = 1393;
        __CLR4_5_262o62olvl9eht3.R.inc(8194);bitRateAndFrameSizeTable[18][1][1][1] = 1394;

        // 32kHz
        __CLR4_5_262o62olvl9eht3.R.inc(8195);bitRateAndFrameSizeTable[0][0][2][0] = 32;
        __CLR4_5_262o62olvl9eht3.R.inc(8196);bitRateAndFrameSizeTable[0][1][2][0] = 32;
        __CLR4_5_262o62olvl9eht3.R.inc(8197);bitRateAndFrameSizeTable[0][0][2][1] = 96;
        __CLR4_5_262o62olvl9eht3.R.inc(8198);bitRateAndFrameSizeTable[0][1][2][1] = 96;
        __CLR4_5_262o62olvl9eht3.R.inc(8199);bitRateAndFrameSizeTable[1][0][2][0] = 40;
        __CLR4_5_262o62olvl9eht3.R.inc(8200);bitRateAndFrameSizeTable[1][1][2][0] = 40;
        __CLR4_5_262o62olvl9eht3.R.inc(8201);bitRateAndFrameSizeTable[1][0][2][1] = 120;
        __CLR4_5_262o62olvl9eht3.R.inc(8202);bitRateAndFrameSizeTable[1][1][2][1] = 120;
        __CLR4_5_262o62olvl9eht3.R.inc(8203);bitRateAndFrameSizeTable[2][0][2][0] = 48;
        __CLR4_5_262o62olvl9eht3.R.inc(8204);bitRateAndFrameSizeTable[2][1][2][0] = 48;
        __CLR4_5_262o62olvl9eht3.R.inc(8205);bitRateAndFrameSizeTable[2][0][2][1] = 144;
        __CLR4_5_262o62olvl9eht3.R.inc(8206);bitRateAndFrameSizeTable[2][1][2][1] = 144;
        __CLR4_5_262o62olvl9eht3.R.inc(8207);bitRateAndFrameSizeTable[3][0][2][0] = 56;
        __CLR4_5_262o62olvl9eht3.R.inc(8208);bitRateAndFrameSizeTable[3][1][2][0] = 56;
        __CLR4_5_262o62olvl9eht3.R.inc(8209);bitRateAndFrameSizeTable[3][0][2][1] = 168;
        __CLR4_5_262o62olvl9eht3.R.inc(8210);bitRateAndFrameSizeTable[3][1][2][1] = 168;
        __CLR4_5_262o62olvl9eht3.R.inc(8211);bitRateAndFrameSizeTable[4][0][2][0] = 64;
        __CLR4_5_262o62olvl9eht3.R.inc(8212);bitRateAndFrameSizeTable[4][1][2][0] = 64;
        __CLR4_5_262o62olvl9eht3.R.inc(8213);bitRateAndFrameSizeTable[4][0][2][1] = 192;
        __CLR4_5_262o62olvl9eht3.R.inc(8214);bitRateAndFrameSizeTable[4][1][2][1] = 192;
        __CLR4_5_262o62olvl9eht3.R.inc(8215);bitRateAndFrameSizeTable[5][0][2][0] = 80;
        __CLR4_5_262o62olvl9eht3.R.inc(8216);bitRateAndFrameSizeTable[5][1][2][0] = 80;
        __CLR4_5_262o62olvl9eht3.R.inc(8217);bitRateAndFrameSizeTable[5][0][2][1] = 240;
        __CLR4_5_262o62olvl9eht3.R.inc(8218);bitRateAndFrameSizeTable[5][1][2][1] = 240;
        __CLR4_5_262o62olvl9eht3.R.inc(8219);bitRateAndFrameSizeTable[6][0][2][0] = 96;
        __CLR4_5_262o62olvl9eht3.R.inc(8220);bitRateAndFrameSizeTable[6][1][2][0] = 96;
        __CLR4_5_262o62olvl9eht3.R.inc(8221);bitRateAndFrameSizeTable[6][0][2][1] = 288;
        __CLR4_5_262o62olvl9eht3.R.inc(8222);bitRateAndFrameSizeTable[6][1][2][1] = 288;
        __CLR4_5_262o62olvl9eht3.R.inc(8223);bitRateAndFrameSizeTable[7][0][2][0] = 112;
        __CLR4_5_262o62olvl9eht3.R.inc(8224);bitRateAndFrameSizeTable[7][1][2][0] = 112;
        __CLR4_5_262o62olvl9eht3.R.inc(8225);bitRateAndFrameSizeTable[7][0][2][1] = 336;
        __CLR4_5_262o62olvl9eht3.R.inc(8226);bitRateAndFrameSizeTable[7][1][2][1] = 336;
        __CLR4_5_262o62olvl9eht3.R.inc(8227);bitRateAndFrameSizeTable[8][0][2][0] = 128;
        __CLR4_5_262o62olvl9eht3.R.inc(8228);bitRateAndFrameSizeTable[8][1][2][0] = 128;
        __CLR4_5_262o62olvl9eht3.R.inc(8229);bitRateAndFrameSizeTable[8][0][2][1] = 384;
        __CLR4_5_262o62olvl9eht3.R.inc(8230);bitRateAndFrameSizeTable[8][1][2][1] = 384;
        __CLR4_5_262o62olvl9eht3.R.inc(8231);bitRateAndFrameSizeTable[9][0][2][0] = 160;
        __CLR4_5_262o62olvl9eht3.R.inc(8232);bitRateAndFrameSizeTable[9][1][2][0] = 160;
        __CLR4_5_262o62olvl9eht3.R.inc(8233);bitRateAndFrameSizeTable[9][0][2][1] = 480;
        __CLR4_5_262o62olvl9eht3.R.inc(8234);bitRateAndFrameSizeTable[9][1][2][1] = 480;
        __CLR4_5_262o62olvl9eht3.R.inc(8235);bitRateAndFrameSizeTable[10][0][2][0] = 192;
        __CLR4_5_262o62olvl9eht3.R.inc(8236);bitRateAndFrameSizeTable[10][1][2][0] = 192;
        __CLR4_5_262o62olvl9eht3.R.inc(8237);bitRateAndFrameSizeTable[10][0][2][1] = 576;
        __CLR4_5_262o62olvl9eht3.R.inc(8238);bitRateAndFrameSizeTable[10][1][2][1] = 576;
        __CLR4_5_262o62olvl9eht3.R.inc(8239);bitRateAndFrameSizeTable[11][0][2][0] = 224;
        __CLR4_5_262o62olvl9eht3.R.inc(8240);bitRateAndFrameSizeTable[11][1][2][0] = 224;
        __CLR4_5_262o62olvl9eht3.R.inc(8241);bitRateAndFrameSizeTable[11][0][2][1] = 672;
        __CLR4_5_262o62olvl9eht3.R.inc(8242);bitRateAndFrameSizeTable[11][1][2][1] = 672;
        __CLR4_5_262o62olvl9eht3.R.inc(8243);bitRateAndFrameSizeTable[12][0][2][0] = 256;
        __CLR4_5_262o62olvl9eht3.R.inc(8244);bitRateAndFrameSizeTable[12][1][2][0] = 256;
        __CLR4_5_262o62olvl9eht3.R.inc(8245);bitRateAndFrameSizeTable[12][0][2][1] = 768;
        __CLR4_5_262o62olvl9eht3.R.inc(8246);bitRateAndFrameSizeTable[12][1][2][1] = 768;
        __CLR4_5_262o62olvl9eht3.R.inc(8247);bitRateAndFrameSizeTable[13][0][2][0] = 320;
        __CLR4_5_262o62olvl9eht3.R.inc(8248);bitRateAndFrameSizeTable[13][1][2][0] = 320;
        __CLR4_5_262o62olvl9eht3.R.inc(8249);bitRateAndFrameSizeTable[13][0][2][1] = 960;
        __CLR4_5_262o62olvl9eht3.R.inc(8250);bitRateAndFrameSizeTable[13][1][2][1] = 960;
        __CLR4_5_262o62olvl9eht3.R.inc(8251);bitRateAndFrameSizeTable[14][0][2][0] = 384;
        __CLR4_5_262o62olvl9eht3.R.inc(8252);bitRateAndFrameSizeTable[14][1][2][0] = 384;
        __CLR4_5_262o62olvl9eht3.R.inc(8253);bitRateAndFrameSizeTable[14][0][2][1] = 1152;
        __CLR4_5_262o62olvl9eht3.R.inc(8254);bitRateAndFrameSizeTable[14][1][2][1] = 1152;
        __CLR4_5_262o62olvl9eht3.R.inc(8255);bitRateAndFrameSizeTable[15][0][2][0] = 448;
        __CLR4_5_262o62olvl9eht3.R.inc(8256);bitRateAndFrameSizeTable[15][1][2][0] = 448;
        __CLR4_5_262o62olvl9eht3.R.inc(8257);bitRateAndFrameSizeTable[15][0][2][1] = 1344;
        __CLR4_5_262o62olvl9eht3.R.inc(8258);bitRateAndFrameSizeTable[15][1][2][1] = 1344;
        __CLR4_5_262o62olvl9eht3.R.inc(8259);bitRateAndFrameSizeTable[16][0][2][0] = 512;
        __CLR4_5_262o62olvl9eht3.R.inc(8260);bitRateAndFrameSizeTable[16][1][2][0] = 512;
        __CLR4_5_262o62olvl9eht3.R.inc(8261);bitRateAndFrameSizeTable[16][0][2][1] = 1536;
        __CLR4_5_262o62olvl9eht3.R.inc(8262);bitRateAndFrameSizeTable[16][1][2][1] = 1536;
        __CLR4_5_262o62olvl9eht3.R.inc(8263);bitRateAndFrameSizeTable[17][0][2][0] = 576;
        __CLR4_5_262o62olvl9eht3.R.inc(8264);bitRateAndFrameSizeTable[17][1][2][0] = 576;
        __CLR4_5_262o62olvl9eht3.R.inc(8265);bitRateAndFrameSizeTable[17][0][2][1] = 1728;
        __CLR4_5_262o62olvl9eht3.R.inc(8266);bitRateAndFrameSizeTable[17][1][2][1] = 1728;
        __CLR4_5_262o62olvl9eht3.R.inc(8267);bitRateAndFrameSizeTable[18][0][2][0] = 640;
        __CLR4_5_262o62olvl9eht3.R.inc(8268);bitRateAndFrameSizeTable[18][1][2][0] = 640;
        __CLR4_5_262o62olvl9eht3.R.inc(8269);bitRateAndFrameSizeTable[18][0][2][1] = 1920;
        __CLR4_5_262o62olvl9eht3.R.inc(8270);bitRateAndFrameSizeTable[18][1][2][1] = 1920;
    }finally{__CLR4_5_262o62olvl9eht3.R.flushNeeded();}}
}
