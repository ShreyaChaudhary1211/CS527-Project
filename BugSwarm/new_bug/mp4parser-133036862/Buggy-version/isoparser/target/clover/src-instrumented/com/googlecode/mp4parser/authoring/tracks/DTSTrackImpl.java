/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.boxes.*;
import com.coremedia.iso.boxes.sampleentry.AudioSampleEntry;
import com.googlecode.mp4parser.DataSource;
import com.googlecode.mp4parser.authoring.AbstractTrack;
import com.googlecode.mp4parser.authoring.Sample;
import com.googlecode.mp4parser.authoring.TrackMetaData;
import com.googlecode.mp4parser.boxes.DTSSpecificBox;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBuffer;

import java.io.EOFException;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.*;


@java.lang.SuppressWarnings({"fallthrough"}) public class DTSTrackImpl extends AbstractTrack {public static class __CLR4_5_27ce7celvlulhwn{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,10297,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    TrackMetaData trackMetaData = new TrackMetaData();
    SampleDescriptionBox sampleDescriptionBox;

    int samplerate;
    int bitrate;
    int frameSize = 0;
    int sampleSize;
    int samplesPerFrame;
    int channelCount;
    private long[] sampleDurations;
    private int dataOffset = 0;
    DTSSpecificBox ddts = new DTSSpecificBox();

    private DataSource dataSource;
    private List<Sample> samples;

    // Info from the headers
    boolean isVBR = false;
    boolean coreSubStreamPresent = false;
    boolean extensionSubStreamPresent = false;
    int numExtSubStreams = 0;
    int coreMaxSampleRate = 0;
    int coreBitRate = 0;
    int coreChannelMask = 0;
    int coreFramePayloadInBytes = 0;
    int extAvgBitrate = 0;
    int extPeakBitrate = 0;
    int extSmoothBuffSize = 0;
    int extFramePayloadInBytes = 0;

    int maxSampleRate = 0;
    int lbrCodingPresent = 0;
    int numFramesTotal = 0;
    int samplesPerFrameAtMaxFs = 0;
    int numSamplesOrigAudioAtMaxFs = 0;
    int channelMask = 0;
    int codecDelayAtMaxFs = 0;
    int bcCoreMaxSampleRate = 0;
    int bcCoreBitRate = 0;
    int bcCoreChannelMask = 0;
    int lsbTrimPercent = 0;

    String type = "none";
    private String lang = "eng";

    public DTSTrackImpl(DataSource dataSource, String lang) throws IOException {
        super(dataSource.toString());__CLR4_5_27ce7celvlulhwn.R.inc(9519);try{__CLR4_5_27ce7celvlulhwn.R.inc(9518);
        __CLR4_5_27ce7celvlulhwn.R.inc(9520);this.lang = lang;
        __CLR4_5_27ce7celvlulhwn.R.inc(9521);this.dataSource = dataSource;
        __CLR4_5_27ce7celvlulhwn.R.inc(9522);parse();
    }finally{__CLR4_5_27ce7celvlulhwn.R.flushNeeded();}}

    public DTSTrackImpl(DataSource dataSource) throws IOException {
        super(dataSource.toString());__CLR4_5_27ce7celvlulhwn.R.inc(9524);try{__CLR4_5_27ce7celvlulhwn.R.inc(9523);
        __CLR4_5_27ce7celvlulhwn.R.inc(9525);this.dataSource = dataSource;
        __CLR4_5_27ce7celvlulhwn.R.inc(9526);parse();
    }finally{__CLR4_5_27ce7celvlulhwn.R.flushNeeded();}}

    public void close() throws IOException {try{__CLR4_5_27ce7celvlulhwn.R.inc(9527);
        __CLR4_5_27ce7celvlulhwn.R.inc(9528);dataSource.close();
    }finally{__CLR4_5_27ce7celvlulhwn.R.flushNeeded();}}

    private void parse() throws IOException {try{__CLR4_5_27ce7celvlulhwn.R.inc(9529);
        __CLR4_5_27ce7celvlulhwn.R.inc(9530);if ((((!readVariables())&&(__CLR4_5_27ce7celvlulhwn.R.iget(9531)!=0|true))||(__CLR4_5_27ce7celvlulhwn.R.iget(9532)==0&false))) {{
            __CLR4_5_27ce7celvlulhwn.R.inc(9533);throw new IOException();
        }

        }__CLR4_5_27ce7celvlulhwn.R.inc(9534);sampleDescriptionBox = new SampleDescriptionBox();
        __CLR4_5_27ce7celvlulhwn.R.inc(9535);AudioSampleEntry audioSampleEntry = new AudioSampleEntry(type);
        __CLR4_5_27ce7celvlulhwn.R.inc(9536);audioSampleEntry.setChannelCount(channelCount);
        __CLR4_5_27ce7celvlulhwn.R.inc(9537);audioSampleEntry.setSampleRate(samplerate);
        __CLR4_5_27ce7celvlulhwn.R.inc(9538);audioSampleEntry.setDataReferenceIndex(1);
        __CLR4_5_27ce7celvlulhwn.R.inc(9539);audioSampleEntry.setSampleSize(16);


        __CLR4_5_27ce7celvlulhwn.R.inc(9540);audioSampleEntry.addBox(ddts);
        __CLR4_5_27ce7celvlulhwn.R.inc(9541);sampleDescriptionBox.addBox(audioSampleEntry);

        __CLR4_5_27ce7celvlulhwn.R.inc(9542);trackMetaData.setCreationTime(new Date());
        __CLR4_5_27ce7celvlulhwn.R.inc(9543);trackMetaData.setModificationTime(new Date());
        __CLR4_5_27ce7celvlulhwn.R.inc(9544);trackMetaData.setLanguage(lang);
        __CLR4_5_27ce7celvlulhwn.R.inc(9545);trackMetaData.setTimescale(samplerate); // Audio tracks always use samplerate as timescale


    }finally{__CLR4_5_27ce7celvlulhwn.R.flushNeeded();}}


    public List<Sample> getSamples() {try{__CLR4_5_27ce7celvlulhwn.R.inc(9546);

        __CLR4_5_27ce7celvlulhwn.R.inc(9547);return samples;
    }finally{__CLR4_5_27ce7celvlulhwn.R.flushNeeded();}}

    public SampleDescriptionBox getSampleDescriptionBox() {try{__CLR4_5_27ce7celvlulhwn.R.inc(9548);
        __CLR4_5_27ce7celvlulhwn.R.inc(9549);return sampleDescriptionBox;
    }finally{__CLR4_5_27ce7celvlulhwn.R.flushNeeded();}}

    public long[] getSampleDurations() {try{__CLR4_5_27ce7celvlulhwn.R.inc(9550);
        __CLR4_5_27ce7celvlulhwn.R.inc(9551);return sampleDurations;
    }finally{__CLR4_5_27ce7celvlulhwn.R.flushNeeded();}}

    public List<CompositionTimeToSample.Entry> getCompositionTimeEntries() {try{__CLR4_5_27ce7celvlulhwn.R.inc(9552);
        __CLR4_5_27ce7celvlulhwn.R.inc(9553);return null;
    }finally{__CLR4_5_27ce7celvlulhwn.R.flushNeeded();}}

    public long[] getSyncSamples() {try{__CLR4_5_27ce7celvlulhwn.R.inc(9554);
        __CLR4_5_27ce7celvlulhwn.R.inc(9555);return null;
    }finally{__CLR4_5_27ce7celvlulhwn.R.flushNeeded();}}

    public List<SampleDependencyTypeBox.Entry> getSampleDependencies() {try{__CLR4_5_27ce7celvlulhwn.R.inc(9556);
        __CLR4_5_27ce7celvlulhwn.R.inc(9557);return null;
    }finally{__CLR4_5_27ce7celvlulhwn.R.flushNeeded();}}

    public TrackMetaData getTrackMetaData() {try{__CLR4_5_27ce7celvlulhwn.R.inc(9558);
        __CLR4_5_27ce7celvlulhwn.R.inc(9559);return trackMetaData;
    }finally{__CLR4_5_27ce7celvlulhwn.R.flushNeeded();}}

    public String getHandler() {try{__CLR4_5_27ce7celvlulhwn.R.inc(9560);
        __CLR4_5_27ce7celvlulhwn.R.inc(9561);return "soun";
    }finally{__CLR4_5_27ce7celvlulhwn.R.flushNeeded();}}

    private void parseDtshdhdr(int size, ByteBuffer bb) {try{__CLR4_5_27ce7celvlulhwn.R.inc(9562);
        __CLR4_5_27ce7celvlulhwn.R.inc(9563);int hdrVersion = bb.getInt();
        __CLR4_5_27ce7celvlulhwn.R.inc(9564);int timeCodeHigh = bb.get();
        __CLR4_5_27ce7celvlulhwn.R.inc(9565);int timeCode = bb.getInt();
        __CLR4_5_27ce7celvlulhwn.R.inc(9566);int timeCodeFrameRate = bb.get();
        __CLR4_5_27ce7celvlulhwn.R.inc(9567);int bitwStreamMetadata = bb.getShort();
        __CLR4_5_27ce7celvlulhwn.R.inc(9568);int numAudioPresentations = bb.get();
        __CLR4_5_27ce7celvlulhwn.R.inc(9569);numExtSubStreams = bb.get();

        __CLR4_5_27ce7celvlulhwn.R.inc(9570);if (((((bitwStreamMetadata & 1) == 1)&&(__CLR4_5_27ce7celvlulhwn.R.iget(9571)!=0|true))||(__CLR4_5_27ce7celvlulhwn.R.iget(9572)==0&false))) {{
            __CLR4_5_27ce7celvlulhwn.R.inc(9573);isVBR = true;
        }
        }__CLR4_5_27ce7celvlulhwn.R.inc(9574);if (((((bitwStreamMetadata & 8) == 8)&&(__CLR4_5_27ce7celvlulhwn.R.iget(9575)!=0|true))||(__CLR4_5_27ce7celvlulhwn.R.iget(9576)==0&false))) {{
            __CLR4_5_27ce7celvlulhwn.R.inc(9577);coreSubStreamPresent = true;
        }
        }__CLR4_5_27ce7celvlulhwn.R.inc(9578);if (((((bitwStreamMetadata & 0x10) == 0x10)&&(__CLR4_5_27ce7celvlulhwn.R.iget(9579)!=0|true))||(__CLR4_5_27ce7celvlulhwn.R.iget(9580)==0&false))) {{
            __CLR4_5_27ce7celvlulhwn.R.inc(9581);extensionSubStreamPresent = true;
            __CLR4_5_27ce7celvlulhwn.R.inc(9582);numExtSubStreams++;
        } }else {{
            __CLR4_5_27ce7celvlulhwn.R.inc(9583);numExtSubStreams = 0;
        }
        }__CLR4_5_27ce7celvlulhwn.R.inc(9584);int i = 14;
        __CLR4_5_27ce7celvlulhwn.R.inc(9585);while ((((i < size)&&(__CLR4_5_27ce7celvlulhwn.R.iget(9586)!=0|true))||(__CLR4_5_27ce7celvlulhwn.R.iget(9587)==0&false))) {{
            __CLR4_5_27ce7celvlulhwn.R.inc(9588);bb.get();
            __CLR4_5_27ce7celvlulhwn.R.inc(9589);i++;
        }
    }}finally{__CLR4_5_27ce7celvlulhwn.R.flushNeeded();}}

    private boolean parseCoressmd(int size, ByteBuffer bb) {try{__CLR4_5_27ce7celvlulhwn.R.inc(9590);
        __CLR4_5_27ce7celvlulhwn.R.inc(9591);int cmsr_1 = bb.get();
        __CLR4_5_27ce7celvlulhwn.R.inc(9592);int cmsr_2 = bb.getShort();
        __CLR4_5_27ce7celvlulhwn.R.inc(9593);coreMaxSampleRate = (cmsr_1 << 16) | (cmsr_2 & 0xffff);
        __CLR4_5_27ce7celvlulhwn.R.inc(9594);coreBitRate = bb.getShort();
        __CLR4_5_27ce7celvlulhwn.R.inc(9595);coreChannelMask = bb.getShort();
        __CLR4_5_27ce7celvlulhwn.R.inc(9596);coreFramePayloadInBytes = bb.getInt();
        __CLR4_5_27ce7celvlulhwn.R.inc(9597);int i = 11;
        __CLR4_5_27ce7celvlulhwn.R.inc(9598);while ((((i < size)&&(__CLR4_5_27ce7celvlulhwn.R.iget(9599)!=0|true))||(__CLR4_5_27ce7celvlulhwn.R.iget(9600)==0&false))) {{
            __CLR4_5_27ce7celvlulhwn.R.inc(9601);bb.get();
            __CLR4_5_27ce7celvlulhwn.R.inc(9602);i++;
        }
        }__CLR4_5_27ce7celvlulhwn.R.inc(9603);return true;
    }finally{__CLR4_5_27ce7celvlulhwn.R.flushNeeded();}}

    private boolean parseAuprhdr(int size, ByteBuffer bb) {try{__CLR4_5_27ce7celvlulhwn.R.inc(9604);
        __CLR4_5_27ce7celvlulhwn.R.inc(9605);int audioPresIndex = bb.get();  // Audio_Pres_Index
        __CLR4_5_27ce7celvlulhwn.R.inc(9606);int bitwAupresData = bb.getShort(); // Bitw_Aupres_Metadata
        __CLR4_5_27ce7celvlulhwn.R.inc(9607);int a = bb.get();
        __CLR4_5_27ce7celvlulhwn.R.inc(9608);int b = bb.getShort();
        __CLR4_5_27ce7celvlulhwn.R.inc(9609);maxSampleRate = (a << 16) | (b & 0xffff);
        __CLR4_5_27ce7celvlulhwn.R.inc(9610);numFramesTotal = bb.getInt();
        __CLR4_5_27ce7celvlulhwn.R.inc(9611);samplesPerFrameAtMaxFs = bb.getShort();
        __CLR4_5_27ce7celvlulhwn.R.inc(9612);a = bb.get();
        __CLR4_5_27ce7celvlulhwn.R.inc(9613);b = bb.getInt();
        __CLR4_5_27ce7celvlulhwn.R.inc(9614);numSamplesOrigAudioAtMaxFs = (a << 32) | (b & 0xffff);
        __CLR4_5_27ce7celvlulhwn.R.inc(9615);channelMask = bb.getShort();
        __CLR4_5_27ce7celvlulhwn.R.inc(9616);codecDelayAtMaxFs = bb.getShort();
        __CLR4_5_27ce7celvlulhwn.R.inc(9617);int c = 21;
        __CLR4_5_27ce7celvlulhwn.R.inc(9618);if (((((bitwAupresData & 3) == 3)&&(__CLR4_5_27ce7celvlulhwn.R.iget(9619)!=0|true))||(__CLR4_5_27ce7celvlulhwn.R.iget(9620)==0&false))) {{
            __CLR4_5_27ce7celvlulhwn.R.inc(9621);a = bb.get();
            __CLR4_5_27ce7celvlulhwn.R.inc(9622);b = bb.getShort();
            __CLR4_5_27ce7celvlulhwn.R.inc(9623);bcCoreMaxSampleRate = (a << 16) | (b & 0xffff);
            __CLR4_5_27ce7celvlulhwn.R.inc(9624);bcCoreBitRate = bb.getShort();
            __CLR4_5_27ce7celvlulhwn.R.inc(9625);bcCoreChannelMask = bb.getShort();
            __CLR4_5_27ce7celvlulhwn.R.inc(9626);c += 7;
        }
        }__CLR4_5_27ce7celvlulhwn.R.inc(9627);if (((((bitwAupresData & 0x4) > 0)&&(__CLR4_5_27ce7celvlulhwn.R.iget(9628)!=0|true))||(__CLR4_5_27ce7celvlulhwn.R.iget(9629)==0&false))) {{
            __CLR4_5_27ce7celvlulhwn.R.inc(9630);lsbTrimPercent = bb.get();
            __CLR4_5_27ce7celvlulhwn.R.inc(9631);c++;
        }
        }__CLR4_5_27ce7celvlulhwn.R.inc(9632);if (((((bitwAupresData & 0x8) > 0)&&(__CLR4_5_27ce7celvlulhwn.R.iget(9633)!=0|true))||(__CLR4_5_27ce7celvlulhwn.R.iget(9634)==0&false))) {{
            __CLR4_5_27ce7celvlulhwn.R.inc(9635);lbrCodingPresent = 1;
        }
        }__CLR4_5_27ce7celvlulhwn.R.inc(9636);while ((((c < size)&&(__CLR4_5_27ce7celvlulhwn.R.iget(9637)!=0|true))||(__CLR4_5_27ce7celvlulhwn.R.iget(9638)==0&false))) {{
            __CLR4_5_27ce7celvlulhwn.R.inc(9639);bb.get();
            __CLR4_5_27ce7celvlulhwn.R.inc(9640);c++;
        }

        }__CLR4_5_27ce7celvlulhwn.R.inc(9641);return true;
    }finally{__CLR4_5_27ce7celvlulhwn.R.flushNeeded();}}

    /**
     * EXTSS_MD
     */
    private boolean parseExtssmd(int size, ByteBuffer bb) {try{__CLR4_5_27ce7celvlulhwn.R.inc(9642);
        __CLR4_5_27ce7celvlulhwn.R.inc(9643);int a = bb.get();
        __CLR4_5_27ce7celvlulhwn.R.inc(9644);int b = bb.getShort();
        __CLR4_5_27ce7celvlulhwn.R.inc(9645);extAvgBitrate = (a << 16) | (b & 0xffff);
        __CLR4_5_27ce7celvlulhwn.R.inc(9646);int i = 3;
        __CLR4_5_27ce7celvlulhwn.R.inc(9647);if ((((isVBR)&&(__CLR4_5_27ce7celvlulhwn.R.iget(9648)!=0|true))||(__CLR4_5_27ce7celvlulhwn.R.iget(9649)==0&false))) {{
            __CLR4_5_27ce7celvlulhwn.R.inc(9650);a = bb.get();
            __CLR4_5_27ce7celvlulhwn.R.inc(9651);b = bb.getShort();
            __CLR4_5_27ce7celvlulhwn.R.inc(9652);extPeakBitrate = (a << 16) | (b & 0xffff);
            __CLR4_5_27ce7celvlulhwn.R.inc(9653);extSmoothBuffSize = bb.getShort();
            __CLR4_5_27ce7celvlulhwn.R.inc(9654);i += 5;
        } }else {{
            __CLR4_5_27ce7celvlulhwn.R.inc(9655);extFramePayloadInBytes = bb.getInt();
            __CLR4_5_27ce7celvlulhwn.R.inc(9656);i += 4;
        }
        }__CLR4_5_27ce7celvlulhwn.R.inc(9657);while ((((i < size)&&(__CLR4_5_27ce7celvlulhwn.R.iget(9658)!=0|true))||(__CLR4_5_27ce7celvlulhwn.R.iget(9659)==0&false))) {{
            __CLR4_5_27ce7celvlulhwn.R.inc(9660);bb.get();
            __CLR4_5_27ce7celvlulhwn.R.inc(9661);i++;
        }
        }__CLR4_5_27ce7celvlulhwn.R.inc(9662);return true;
    }finally{__CLR4_5_27ce7celvlulhwn.R.flushNeeded();}}

    private boolean readVariables() throws IOException {try{__CLR4_5_27ce7celvlulhwn.R.inc(9663);
        __CLR4_5_27ce7celvlulhwn.R.inc(9664);ByteBuffer bb = dataSource.map(0, 25000);
        __CLR4_5_27ce7celvlulhwn.R.inc(9665);int testHeader1 = bb.getInt();
        __CLR4_5_27ce7celvlulhwn.R.inc(9666);int testHeader2 = bb.getInt();
        __CLR4_5_27ce7celvlulhwn.R.inc(9667);if ((((testHeader1 != 0x44545348 || (testHeader2 != 0x44484452))&&(__CLR4_5_27ce7celvlulhwn.R.iget(9668)!=0|true))||(__CLR4_5_27ce7celvlulhwn.R.iget(9669)==0&false))) {{ // ASCII: DTSHDHDR
            __CLR4_5_27ce7celvlulhwn.R.inc(9670);throw new IOException("data does not start with 'DTSHDHDR' as required for a DTS-HD file");
        }

        }__CLR4_5_27ce7celvlulhwn.R.inc(9671);while (((((testHeader1 != 0x5354524d || testHeader2 != 0x44415441) && bb.remaining() > 100)&&(__CLR4_5_27ce7celvlulhwn.R.iget(9672)!=0|true))||(__CLR4_5_27ce7celvlulhwn.R.iget(9673)==0&false))) {{ // ASCII: STRMDATA
            __CLR4_5_27ce7celvlulhwn.R.inc(9674);int size = (int) bb.getLong();
            __CLR4_5_27ce7celvlulhwn.R.inc(9675);if ((((testHeader1 == 0x44545348 && testHeader2 == 0x44484452)&&(__CLR4_5_27ce7celvlulhwn.R.iget(9676)!=0|true))||(__CLR4_5_27ce7celvlulhwn.R.iget(9677)==0&false))) {{ // ASCII: DTSHDHDR
                __CLR4_5_27ce7celvlulhwn.R.inc(9678);parseDtshdhdr(size, bb);
            } }else {__CLR4_5_27ce7celvlulhwn.R.inc(9679);if ((((testHeader1 == 0x434f5245 && testHeader2 == 0x53534d44)&&(__CLR4_5_27ce7celvlulhwn.R.iget(9680)!=0|true))||(__CLR4_5_27ce7celvlulhwn.R.iget(9681)==0&false))) {{ // ASCII: CORESSMD
                __CLR4_5_27ce7celvlulhwn.R.inc(9682);if ((((!parseCoressmd(size, bb))&&(__CLR4_5_27ce7celvlulhwn.R.iget(9683)!=0|true))||(__CLR4_5_27ce7celvlulhwn.R.iget(9684)==0&false))) {{
                    __CLR4_5_27ce7celvlulhwn.R.inc(9685);return false;
                }
            }} }else {__CLR4_5_27ce7celvlulhwn.R.inc(9686);if ((((testHeader1 == 0x41555052 && testHeader2 == 0x2d484452)&&(__CLR4_5_27ce7celvlulhwn.R.iget(9687)!=0|true))||(__CLR4_5_27ce7celvlulhwn.R.iget(9688)==0&false))) {{ // ASCII: AUPR-HDR
                __CLR4_5_27ce7celvlulhwn.R.inc(9689);if ((((!parseAuprhdr(size, bb))&&(__CLR4_5_27ce7celvlulhwn.R.iget(9690)!=0|true))||(__CLR4_5_27ce7celvlulhwn.R.iget(9691)==0&false))) {{
                    __CLR4_5_27ce7celvlulhwn.R.inc(9692);return false;
                }
            }} }else {__CLR4_5_27ce7celvlulhwn.R.inc(9693);if ((((testHeader1 == 0x45585453 && testHeader2 == 0x535f4d44)&&(__CLR4_5_27ce7celvlulhwn.R.iget(9694)!=0|true))||(__CLR4_5_27ce7celvlulhwn.R.iget(9695)==0&false))) {{ // ASCII: EXTSS_MD
                __CLR4_5_27ce7celvlulhwn.R.inc(9696);if ((((!parseExtssmd(size, bb))&&(__CLR4_5_27ce7celvlulhwn.R.iget(9697)!=0|true))||(__CLR4_5_27ce7celvlulhwn.R.iget(9698)==0&false))) {{
                    __CLR4_5_27ce7celvlulhwn.R.inc(9699);return false;
                }
            }} }else {{
                __CLR4_5_27ce7celvlulhwn.R.inc(9700);for (int i = 0; (((i < size)&&(__CLR4_5_27ce7celvlulhwn.R.iget(9701)!=0|true))||(__CLR4_5_27ce7celvlulhwn.R.iget(9702)==0&false)); i++) {{
                    __CLR4_5_27ce7celvlulhwn.R.inc(9703);byte b = bb.get();
                }
            }}
            }}}}__CLR4_5_27ce7celvlulhwn.R.inc(9704);testHeader1 = bb.getInt();
            __CLR4_5_27ce7celvlulhwn.R.inc(9705);testHeader2 = bb.getInt();
        }
        }__CLR4_5_27ce7celvlulhwn.R.inc(9706);long dataSize = bb.getLong();
        __CLR4_5_27ce7celvlulhwn.R.inc(9707);dataOffset = bb.position();

        __CLR4_5_27ce7celvlulhwn.R.inc(9708);int amode = -1;
        __CLR4_5_27ce7celvlulhwn.R.inc(9709);int extAudioId = 0;
        __CLR4_5_27ce7celvlulhwn.R.inc(9710);int extAudio = 0;

        __CLR4_5_27ce7celvlulhwn.R.inc(9711);int corePresent = -1;
        __CLR4_5_27ce7celvlulhwn.R.inc(9712);int extPresent = -1;
        __CLR4_5_27ce7celvlulhwn.R.inc(9713);int extXch = 0;
        __CLR4_5_27ce7celvlulhwn.R.inc(9714);int extXXch = 0;
        __CLR4_5_27ce7celvlulhwn.R.inc(9715);int extX96k = 0;
        __CLR4_5_27ce7celvlulhwn.R.inc(9716);int extXbr = 0;
        __CLR4_5_27ce7celvlulhwn.R.inc(9717);int extLbr = 0;
        __CLR4_5_27ce7celvlulhwn.R.inc(9718);int extXll = 0;
        __CLR4_5_27ce7celvlulhwn.R.inc(9719);int extCore = 0;

        __CLR4_5_27ce7celvlulhwn.R.inc(9720);boolean done = false;


        __CLR4_5_27ce7celvlulhwn.R.inc(9721);while ((((!done)&&(__CLR4_5_27ce7celvlulhwn.R.iget(9722)!=0|true))||(__CLR4_5_27ce7celvlulhwn.R.iget(9723)==0&false))) {{
            __CLR4_5_27ce7celvlulhwn.R.inc(9724);int offset = bb.position();
            __CLR4_5_27ce7celvlulhwn.R.inc(9725);int sync = bb.getInt();
            __CLR4_5_27ce7celvlulhwn.R.inc(9726);if ((((sync == 0x7ffe8001)&&(__CLR4_5_27ce7celvlulhwn.R.iget(9727)!=0|true))||(__CLR4_5_27ce7celvlulhwn.R.iget(9728)==0&false))) {{ // DTS_SYNCWORD_CORE
                __CLR4_5_27ce7celvlulhwn.R.inc(9729);if ((((corePresent == 1)&&(__CLR4_5_27ce7celvlulhwn.R.iget(9730)!=0|true))||(__CLR4_5_27ce7celvlulhwn.R.iget(9731)==0&false))) {{
                    __CLR4_5_27ce7celvlulhwn.R.inc(9732);done = true;
                } }else {{
                    __CLR4_5_27ce7celvlulhwn.R.inc(9733);corePresent = 1;
                    __CLR4_5_27ce7celvlulhwn.R.inc(9734);BitReaderBuffer brb = new BitReaderBuffer(bb);

                    __CLR4_5_27ce7celvlulhwn.R.inc(9735);int ftype = brb.readBits(1);
                    __CLR4_5_27ce7celvlulhwn.R.inc(9736);int shrt = brb.readBits(5);
                    __CLR4_5_27ce7celvlulhwn.R.inc(9737);int cpf = brb.readBits(1); // Should always be 0 - CRC is not present
                    __CLR4_5_27ce7celvlulhwn.R.inc(9738);if ((((ftype != 1 || shrt != 31 || cpf != 0)&&(__CLR4_5_27ce7celvlulhwn.R.iget(9739)!=0|true))||(__CLR4_5_27ce7celvlulhwn.R.iget(9740)==0&false)))

                    {{ // Termination frames - first frame should not be the last...
                        __CLR4_5_27ce7celvlulhwn.R.inc(9741);return false;
                    }

                    }__CLR4_5_27ce7celvlulhwn.R.inc(9742);int nblks = brb.readBits(7);
                    __CLR4_5_27ce7celvlulhwn.R.inc(9743);samplesPerFrame = 32 * (nblks + 1);
                    __CLR4_5_27ce7celvlulhwn.R.inc(9744);int fsize = brb.readBits(14);
                    __CLR4_5_27ce7celvlulhwn.R.inc(9745);frameSize += fsize + 1;
                    __CLR4_5_27ce7celvlulhwn.R.inc(9746);amode = brb.readBits(6); // Calc channel layout from this
                    __CLR4_5_27ce7celvlulhwn.R.inc(9747);int sfreq = brb.readBits(4);

                    __CLR4_5_27ce7celvlulhwn.R.inc(9748);samplerate = getSampleRate(sfreq);

                    __CLR4_5_27ce7celvlulhwn.R.inc(9749);int rate = brb.readBits(5);

                    __CLR4_5_27ce7celvlulhwn.R.inc(9750);bitrate = getBitRate(rate);

                    __CLR4_5_27ce7celvlulhwn.R.inc(9751);int fixedBit = brb.readBits(1);
                    __CLR4_5_27ce7celvlulhwn.R.inc(9752);if ((((fixedBit != 0)&&(__CLR4_5_27ce7celvlulhwn.R.iget(9753)!=0|true))||(__CLR4_5_27ce7celvlulhwn.R.iget(9754)==0&false)))

                    {{
                        __CLR4_5_27ce7celvlulhwn.R.inc(9755);return false;
                    }

                    }__CLR4_5_27ce7celvlulhwn.R.inc(9756);int dynf = brb.readBits(1);
                    __CLR4_5_27ce7celvlulhwn.R.inc(9757);int timef = brb.readBits(1);
                    __CLR4_5_27ce7celvlulhwn.R.inc(9758);int auxf = brb.readBits(1);
                    __CLR4_5_27ce7celvlulhwn.R.inc(9759);int hdcd = brb.readBits(1);
                    __CLR4_5_27ce7celvlulhwn.R.inc(9760);extAudioId = brb.readBits(3);
                    __CLR4_5_27ce7celvlulhwn.R.inc(9761);extAudio = brb.readBits(1);
                    __CLR4_5_27ce7celvlulhwn.R.inc(9762);int aspf = brb.readBits(1);
                    __CLR4_5_27ce7celvlulhwn.R.inc(9763);int lff = brb.readBits(2);
                    __CLR4_5_27ce7celvlulhwn.R.inc(9764);int hflag = brb.readBits(1);
                    __CLR4_5_27ce7celvlulhwn.R.inc(9765);int hcrc = 0;
                    __CLR4_5_27ce7celvlulhwn.R.inc(9766);if ((((cpf == 1)&&(__CLR4_5_27ce7celvlulhwn.R.iget(9767)!=0|true))||(__CLR4_5_27ce7celvlulhwn.R.iget(9768)==0&false)))

                    {{ // Present only if CPF=1.
                        __CLR4_5_27ce7celvlulhwn.R.inc(9769);hcrc = brb.readBits(16);
                    }

                    }__CLR4_5_27ce7celvlulhwn.R.inc(9770);int filts = brb.readBits(1);
                    __CLR4_5_27ce7celvlulhwn.R.inc(9771);int vernum = brb.readBits(4);
                    __CLR4_5_27ce7celvlulhwn.R.inc(9772);int chist = brb.readBits(2);
                    __CLR4_5_27ce7celvlulhwn.R.inc(9773);int pcmr = brb.readBits(3);
                    boolean __CLB4_5_2_bool0=false;__CLR4_5_27ce7celvlulhwn.R.inc(9774);switch (pcmr)

                    {
                        case 0:if (!__CLB4_5_2_bool0) {__CLR4_5_27ce7celvlulhwn.R.inc(9775);__CLB4_5_2_bool0=true;}
                        case 1:if (!__CLB4_5_2_bool0) {__CLR4_5_27ce7celvlulhwn.R.inc(9776);__CLB4_5_2_bool0=true;}
                            __CLR4_5_27ce7celvlulhwn.R.inc(9777);sampleSize = 16;
                            __CLR4_5_27ce7celvlulhwn.R.inc(9778);break;

                        case 2:if (!__CLB4_5_2_bool0) {__CLR4_5_27ce7celvlulhwn.R.inc(9779);__CLB4_5_2_bool0=true;}
                        case 3:if (!__CLB4_5_2_bool0) {__CLR4_5_27ce7celvlulhwn.R.inc(9780);__CLB4_5_2_bool0=true;}
                            __CLR4_5_27ce7celvlulhwn.R.inc(9781);sampleSize = 20;
                            __CLR4_5_27ce7celvlulhwn.R.inc(9782);break;

                        case 5:if (!__CLB4_5_2_bool0) {__CLR4_5_27ce7celvlulhwn.R.inc(9783);__CLB4_5_2_bool0=true;}
                        case 6:if (!__CLB4_5_2_bool0) {__CLR4_5_27ce7celvlulhwn.R.inc(9784);__CLB4_5_2_bool0=true;}
                            __CLR4_5_27ce7celvlulhwn.R.inc(9785);sampleSize = 24;
                            __CLR4_5_27ce7celvlulhwn.R.inc(9786);break;

                        default:if (!__CLB4_5_2_bool0) {__CLR4_5_27ce7celvlulhwn.R.inc(9787);__CLB4_5_2_bool0=true;}
                            __CLR4_5_27ce7celvlulhwn.R.inc(9788);return false;
                    }

                    __CLR4_5_27ce7celvlulhwn.R.inc(9789);int sumf = brb.readBits(1);
                    __CLR4_5_27ce7celvlulhwn.R.inc(9790);int sums = brb.readBits(1);
                    __CLR4_5_27ce7celvlulhwn.R.inc(9791);int dialnorm = 0;
                    __CLR4_5_27ce7celvlulhwn.R.inc(9792);int dng = 0;
                    boolean __CLB4_5_2_bool1=false;__CLR4_5_27ce7celvlulhwn.R.inc(9793);switch (vernum)

                    {
                        case 6:if (!__CLB4_5_2_bool1) {__CLR4_5_27ce7celvlulhwn.R.inc(9794);__CLB4_5_2_bool1=true;}
                            __CLR4_5_27ce7celvlulhwn.R.inc(9795);dialnorm = brb.readBits(4);
                            __CLR4_5_27ce7celvlulhwn.R.inc(9796);dng = -(16 + dialnorm);
                            __CLR4_5_27ce7celvlulhwn.R.inc(9797);break;

                        case 7:if (!__CLB4_5_2_bool1) {__CLR4_5_27ce7celvlulhwn.R.inc(9798);__CLB4_5_2_bool1=true;}
                            __CLR4_5_27ce7celvlulhwn.R.inc(9799);dialnorm = brb.readBits(4);
                            __CLR4_5_27ce7celvlulhwn.R.inc(9800);dng = -dialnorm;
                            __CLR4_5_27ce7celvlulhwn.R.inc(9801);break;

                        default:if (!__CLB4_5_2_bool1) {__CLR4_5_27ce7celvlulhwn.R.inc(9802);__CLB4_5_2_bool1=true;}
                            __CLR4_5_27ce7celvlulhwn.R.inc(9803);brb.readBits(4);
                            __CLR4_5_27ce7celvlulhwn.R.inc(9804);break;
                    }
                    __CLR4_5_27ce7celvlulhwn.R.inc(9805);bb.position(offset + fsize + 1);
                }
            }} }else {__CLR4_5_27ce7celvlulhwn.R.inc(9806);if ((((sync == 0x64582025)&&(__CLR4_5_27ce7celvlulhwn.R.iget(9807)!=0|true))||(__CLR4_5_27ce7celvlulhwn.R.iget(9808)==0&false))) {{ // DTS_SYNCWORD_SUBSTREAM
                __CLR4_5_27ce7celvlulhwn.R.inc(9809);if ((((corePresent == -1)&&(__CLR4_5_27ce7celvlulhwn.R.iget(9810)!=0|true))||(__CLR4_5_27ce7celvlulhwn.R.iget(9811)==0&false))) {{
                    __CLR4_5_27ce7celvlulhwn.R.inc(9812);corePresent = 0;
                    __CLR4_5_27ce7celvlulhwn.R.inc(9813);samplesPerFrame = samplesPerFrameAtMaxFs;
                }
                }__CLR4_5_27ce7celvlulhwn.R.inc(9814);extPresent = 1;
                __CLR4_5_27ce7celvlulhwn.R.inc(9815);BitReaderBuffer brb = new BitReaderBuffer(bb);
                __CLR4_5_27ce7celvlulhwn.R.inc(9816);int userDefinedBits = brb.readBits(8);
                __CLR4_5_27ce7celvlulhwn.R.inc(9817);int nExtSSIndex = brb.readBits(2);
                __CLR4_5_27ce7celvlulhwn.R.inc(9818);int headerSizeType = brb.readBits(1);
                __CLR4_5_27ce7celvlulhwn.R.inc(9819);int nuBits4Header = 12;
                __CLR4_5_27ce7celvlulhwn.R.inc(9820);int nuBits4ExSSFsize = 20;
                __CLR4_5_27ce7celvlulhwn.R.inc(9821);if ((((headerSizeType == 0)&&(__CLR4_5_27ce7celvlulhwn.R.iget(9822)!=0|true))||(__CLR4_5_27ce7celvlulhwn.R.iget(9823)==0&false))) {{
                    __CLR4_5_27ce7celvlulhwn.R.inc(9824);nuBits4Header = 8;
                    __CLR4_5_27ce7celvlulhwn.R.inc(9825);nuBits4ExSSFsize = 16;
                }
                }__CLR4_5_27ce7celvlulhwn.R.inc(9826);int nuExtSSHeaderSize = brb.readBits(nuBits4Header) + 1;
                __CLR4_5_27ce7celvlulhwn.R.inc(9827);int nuExtSSFsize = brb.readBits(nuBits4ExSSFsize) + 1;
                __CLR4_5_27ce7celvlulhwn.R.inc(9828);bb.position(offset + nuExtSSHeaderSize);
                __CLR4_5_27ce7celvlulhwn.R.inc(9829);int extSync = bb.getInt();
                __CLR4_5_27ce7celvlulhwn.R.inc(9830);if ((((extSync == 0x5a5a5a5a)&&(__CLR4_5_27ce7celvlulhwn.R.iget(9831)!=0|true))||(__CLR4_5_27ce7celvlulhwn.R.iget(9832)==0&false))) {{
                    __CLR4_5_27ce7celvlulhwn.R.inc(9833);if ((((extXch == 1)&&(__CLR4_5_27ce7celvlulhwn.R.iget(9834)!=0|true))||(__CLR4_5_27ce7celvlulhwn.R.iget(9835)==0&false))) {{
                        __CLR4_5_27ce7celvlulhwn.R.inc(9836);done = true;
                    }
                    }__CLR4_5_27ce7celvlulhwn.R.inc(9837);extXch = 1;
                } }else {__CLR4_5_27ce7celvlulhwn.R.inc(9838);if ((((extSync == 0x47004a03)&&(__CLR4_5_27ce7celvlulhwn.R.iget(9839)!=0|true))||(__CLR4_5_27ce7celvlulhwn.R.iget(9840)==0&false))) {{
                    __CLR4_5_27ce7celvlulhwn.R.inc(9841);if ((((extXXch == 1)&&(__CLR4_5_27ce7celvlulhwn.R.iget(9842)!=0|true))||(__CLR4_5_27ce7celvlulhwn.R.iget(9843)==0&false))) {{
                        __CLR4_5_27ce7celvlulhwn.R.inc(9844);done = true;
                    }
                    }__CLR4_5_27ce7celvlulhwn.R.inc(9845);extXXch = 1;
                } }else {__CLR4_5_27ce7celvlulhwn.R.inc(9846);if ((((extSync == 0x1d95f262)&&(__CLR4_5_27ce7celvlulhwn.R.iget(9847)!=0|true))||(__CLR4_5_27ce7celvlulhwn.R.iget(9848)==0&false))) {{
                    __CLR4_5_27ce7celvlulhwn.R.inc(9849);if ((((extX96k == 1)&&(__CLR4_5_27ce7celvlulhwn.R.iget(9850)!=0|true))||(__CLR4_5_27ce7celvlulhwn.R.iget(9851)==0&false))) {{
                        __CLR4_5_27ce7celvlulhwn.R.inc(9852);done = true;
                    }
                    }__CLR4_5_27ce7celvlulhwn.R.inc(9853);extX96k = 1;
                } }else {__CLR4_5_27ce7celvlulhwn.R.inc(9854);if ((((extSync == 0x655e315e)&&(__CLR4_5_27ce7celvlulhwn.R.iget(9855)!=0|true))||(__CLR4_5_27ce7celvlulhwn.R.iget(9856)==0&false))) {{
                    __CLR4_5_27ce7celvlulhwn.R.inc(9857);if ((((extXbr == 1)&&(__CLR4_5_27ce7celvlulhwn.R.iget(9858)!=0|true))||(__CLR4_5_27ce7celvlulhwn.R.iget(9859)==0&false))) {{
                        __CLR4_5_27ce7celvlulhwn.R.inc(9860);done = true;
                    }
                    }__CLR4_5_27ce7celvlulhwn.R.inc(9861);extXbr = 1;
                } }else {__CLR4_5_27ce7celvlulhwn.R.inc(9862);if ((((extSync == 0x0a801921)&&(__CLR4_5_27ce7celvlulhwn.R.iget(9863)!=0|true))||(__CLR4_5_27ce7celvlulhwn.R.iget(9864)==0&false))) {{
                    __CLR4_5_27ce7celvlulhwn.R.inc(9865);if ((((extLbr == 1)&&(__CLR4_5_27ce7celvlulhwn.R.iget(9866)!=0|true))||(__CLR4_5_27ce7celvlulhwn.R.iget(9867)==0&false))) {{
                        __CLR4_5_27ce7celvlulhwn.R.inc(9868);done = true;
                    }
                    }__CLR4_5_27ce7celvlulhwn.R.inc(9869);extLbr = 1;
                } }else {__CLR4_5_27ce7celvlulhwn.R.inc(9870);if ((((extSync == 0x41a29547)&&(__CLR4_5_27ce7celvlulhwn.R.iget(9871)!=0|true))||(__CLR4_5_27ce7celvlulhwn.R.iget(9872)==0&false))) {{
                    __CLR4_5_27ce7celvlulhwn.R.inc(9873);if ((((extXll == 1)&&(__CLR4_5_27ce7celvlulhwn.R.iget(9874)!=0|true))||(__CLR4_5_27ce7celvlulhwn.R.iget(9875)==0&false))) {{
                        __CLR4_5_27ce7celvlulhwn.R.inc(9876);done = true;
                    }
                    }__CLR4_5_27ce7celvlulhwn.R.inc(9877);extXll = 1;
                } }else {__CLR4_5_27ce7celvlulhwn.R.inc(9878);if ((((extSync == 0x02b09261)&&(__CLR4_5_27ce7celvlulhwn.R.iget(9879)!=0|true))||(__CLR4_5_27ce7celvlulhwn.R.iget(9880)==0&false))) {{
                    __CLR4_5_27ce7celvlulhwn.R.inc(9881);if ((((extCore == 1)&&(__CLR4_5_27ce7celvlulhwn.R.iget(9882)!=0|true))||(__CLR4_5_27ce7celvlulhwn.R.iget(9883)==0&false))) {{
                        __CLR4_5_27ce7celvlulhwn.R.inc(9884);done = true;
                    }
                    }__CLR4_5_27ce7celvlulhwn.R.inc(9885);extCore = 1;
                }
                }}}}}}}__CLR4_5_27ce7celvlulhwn.R.inc(9886);if ((((!done)&&(__CLR4_5_27ce7celvlulhwn.R.iget(9887)!=0|true))||(__CLR4_5_27ce7celvlulhwn.R.iget(9888)==0&false))) {{
                    __CLR4_5_27ce7celvlulhwn.R.inc(9889);frameSize += nuExtSSFsize;
                }
                }__CLR4_5_27ce7celvlulhwn.R.inc(9890);bb.position(offset + nuExtSSFsize);
            } }else {{
                __CLR4_5_27ce7celvlulhwn.R.inc(9891);throw new IOException("No DTS_SYNCWORD_* found at " + bb.position());
            }

        }}}
        }__CLR4_5_27ce7celvlulhwn.R.inc(9892);int fd = -1;
        boolean __CLB4_5_2_bool2=false;__CLR4_5_27ce7celvlulhwn.R.inc(9893);switch (samplesPerFrame)

        {
            case 512:if (!__CLB4_5_2_bool2) {__CLR4_5_27ce7celvlulhwn.R.inc(9894);__CLB4_5_2_bool2=true;}
                __CLR4_5_27ce7celvlulhwn.R.inc(9895);fd = 0;
                __CLR4_5_27ce7celvlulhwn.R.inc(9896);break;

            case 1024:if (!__CLB4_5_2_bool2) {__CLR4_5_27ce7celvlulhwn.R.inc(9897);__CLB4_5_2_bool2=true;}
                __CLR4_5_27ce7celvlulhwn.R.inc(9898);fd = 1;
                __CLR4_5_27ce7celvlulhwn.R.inc(9899);break;

            case 2048:if (!__CLB4_5_2_bool2) {__CLR4_5_27ce7celvlulhwn.R.inc(9900);__CLB4_5_2_bool2=true;}
                __CLR4_5_27ce7celvlulhwn.R.inc(9901);fd = 2;
                __CLR4_5_27ce7celvlulhwn.R.inc(9902);break;

            case 4096:if (!__CLB4_5_2_bool2) {__CLR4_5_27ce7celvlulhwn.R.inc(9903);__CLB4_5_2_bool2=true;}
                __CLR4_5_27ce7celvlulhwn.R.inc(9904);fd = 3;
                __CLR4_5_27ce7celvlulhwn.R.inc(9905);break;
        }

        __CLR4_5_27ce7celvlulhwn.R.inc(9906);if ((((fd == -1)&&(__CLR4_5_27ce7celvlulhwn.R.iget(9907)!=0|true))||(__CLR4_5_27ce7celvlulhwn.R.iget(9908)==0&false)))

        {{
            __CLR4_5_27ce7celvlulhwn.R.inc(9909);return false;
        }

        }__CLR4_5_27ce7celvlulhwn.R.inc(9910);int coreLayout = 31;
        boolean __CLB4_5_2_bool3=false;__CLR4_5_27ce7celvlulhwn.R.inc(9911);switch (amode)

        {
            case 0:if (!__CLB4_5_2_bool3) {__CLR4_5_27ce7celvlulhwn.R.inc(9912);__CLB4_5_2_bool3=true;}
            case 2:if (!__CLB4_5_2_bool3) {__CLR4_5_27ce7celvlulhwn.R.inc(9913);__CLB4_5_2_bool3=true;}
            case 4:if (!__CLB4_5_2_bool3) {__CLR4_5_27ce7celvlulhwn.R.inc(9914);__CLB4_5_2_bool3=true;}
            case 5:if (!__CLB4_5_2_bool3) {__CLR4_5_27ce7celvlulhwn.R.inc(9915);__CLB4_5_2_bool3=true;}
            case 6:if (!__CLB4_5_2_bool3) {__CLR4_5_27ce7celvlulhwn.R.inc(9916);__CLB4_5_2_bool3=true;}
            case 7:if (!__CLB4_5_2_bool3) {__CLR4_5_27ce7celvlulhwn.R.inc(9917);__CLB4_5_2_bool3=true;}
            case 8:if (!__CLB4_5_2_bool3) {__CLR4_5_27ce7celvlulhwn.R.inc(9918);__CLB4_5_2_bool3=true;}
            case 9:if (!__CLB4_5_2_bool3) {__CLR4_5_27ce7celvlulhwn.R.inc(9919);__CLB4_5_2_bool3=true;}
                __CLR4_5_27ce7celvlulhwn.R.inc(9920);coreLayout = amode;
        }

        __CLR4_5_27ce7celvlulhwn.R.inc(9921);int streamContruction = 0;
        __CLR4_5_27ce7celvlulhwn.R.inc(9922);if ((((corePresent == 0)&&(__CLR4_5_27ce7celvlulhwn.R.iget(9923)!=0|true))||(__CLR4_5_27ce7celvlulhwn.R.iget(9924)==0&false))) {{
            __CLR4_5_27ce7celvlulhwn.R.inc(9925);if ((((extXll == 1)&&(__CLR4_5_27ce7celvlulhwn.R.iget(9926)!=0|true))||(__CLR4_5_27ce7celvlulhwn.R.iget(9927)==0&false))) {{
                __CLR4_5_27ce7celvlulhwn.R.inc(9928);if ((((extCore == 0)&&(__CLR4_5_27ce7celvlulhwn.R.iget(9929)!=0|true))||(__CLR4_5_27ce7celvlulhwn.R.iget(9930)==0&false))) {{
                    __CLR4_5_27ce7celvlulhwn.R.inc(9931);streamContruction = 17;
                    __CLR4_5_27ce7celvlulhwn.R.inc(9932);type = "dtsl";
                } }else {{
                    __CLR4_5_27ce7celvlulhwn.R.inc(9933);streamContruction = 21;
                    __CLR4_5_27ce7celvlulhwn.R.inc(9934);type = "dtsh";
                }
            }} }else {__CLR4_5_27ce7celvlulhwn.R.inc(9935);if ((((extLbr == 1)&&(__CLR4_5_27ce7celvlulhwn.R.iget(9936)!=0|true))||(__CLR4_5_27ce7celvlulhwn.R.iget(9937)==0&false))) {{
                __CLR4_5_27ce7celvlulhwn.R.inc(9938);streamContruction = 18;
                __CLR4_5_27ce7celvlulhwn.R.inc(9939);type = "dtse";
            } }else {__CLR4_5_27ce7celvlulhwn.R.inc(9940);if ((((extCore == 1)&&(__CLR4_5_27ce7celvlulhwn.R.iget(9941)!=0|true))||(__CLR4_5_27ce7celvlulhwn.R.iget(9942)==0&false))) {{
                __CLR4_5_27ce7celvlulhwn.R.inc(9943);type = "dtsh";
                __CLR4_5_27ce7celvlulhwn.R.inc(9944);if ((((extXXch == 0 && extXll == 0)&&(__CLR4_5_27ce7celvlulhwn.R.iget(9945)!=0|true))||(__CLR4_5_27ce7celvlulhwn.R.iget(9946)==0&false))) {{
                    __CLR4_5_27ce7celvlulhwn.R.inc(9947);streamContruction = 19;
                } }else {__CLR4_5_27ce7celvlulhwn.R.inc(9948);if ((((extXXch == 1 && extXll == 0)&&(__CLR4_5_27ce7celvlulhwn.R.iget(9949)!=0|true))||(__CLR4_5_27ce7celvlulhwn.R.iget(9950)==0&false))) {{
                    __CLR4_5_27ce7celvlulhwn.R.inc(9951);streamContruction = 20;
                } }else {__CLR4_5_27ce7celvlulhwn.R.inc(9952);if ((((extXXch == 0 && extXll == 1)&&(__CLR4_5_27ce7celvlulhwn.R.iget(9953)!=0|true))||(__CLR4_5_27ce7celvlulhwn.R.iget(9954)==0&false))) {{
                    __CLR4_5_27ce7celvlulhwn.R.inc(9955);streamContruction = 21;
                }
            }}}}
            }}}__CLR4_5_27ce7celvlulhwn.R.inc(9956);samplerate = maxSampleRate;
            __CLR4_5_27ce7celvlulhwn.R.inc(9957);sampleSize = 24; // Is this always true?
        } }else {{
            __CLR4_5_27ce7celvlulhwn.R.inc(9958);if ((((extPresent < 1)&&(__CLR4_5_27ce7celvlulhwn.R.iget(9959)!=0|true))||(__CLR4_5_27ce7celvlulhwn.R.iget(9960)==0&false))) {{
                __CLR4_5_27ce7celvlulhwn.R.inc(9961);if ((((extAudio > 0)&&(__CLR4_5_27ce7celvlulhwn.R.iget(9962)!=0|true))||(__CLR4_5_27ce7celvlulhwn.R.iget(9963)==0&false))) {{
                    boolean __CLB4_5_2_bool4=false;__CLR4_5_27ce7celvlulhwn.R.inc(9964);switch (extAudioId) {
                        case 0:if (!__CLB4_5_2_bool4) {__CLR4_5_27ce7celvlulhwn.R.inc(9965);__CLB4_5_2_bool4=true;}
                            __CLR4_5_27ce7celvlulhwn.R.inc(9966);streamContruction = 2;
                            __CLR4_5_27ce7celvlulhwn.R.inc(9967);type = "dtsc";
                            __CLR4_5_27ce7celvlulhwn.R.inc(9968);break;

                        case 2:if (!__CLB4_5_2_bool4) {__CLR4_5_27ce7celvlulhwn.R.inc(9969);__CLB4_5_2_bool4=true;}
                            __CLR4_5_27ce7celvlulhwn.R.inc(9970);streamContruction = 4;
                            __CLR4_5_27ce7celvlulhwn.R.inc(9971);type = "dtsc";
                            __CLR4_5_27ce7celvlulhwn.R.inc(9972);break;

                        case 6:if (!__CLB4_5_2_bool4) {__CLR4_5_27ce7celvlulhwn.R.inc(9973);__CLB4_5_2_bool4=true;}
                            __CLR4_5_27ce7celvlulhwn.R.inc(9974);streamContruction = 3;
                            __CLR4_5_27ce7celvlulhwn.R.inc(9975);type = "dtsh";
                            __CLR4_5_27ce7celvlulhwn.R.inc(9976);break;

                        default:if (!__CLB4_5_2_bool4) {__CLR4_5_27ce7celvlulhwn.R.inc(9977);__CLB4_5_2_bool4=true;}
                            __CLR4_5_27ce7celvlulhwn.R.inc(9978);streamContruction = 0;
                            __CLR4_5_27ce7celvlulhwn.R.inc(9979);type = "dtsh";
                            __CLR4_5_27ce7celvlulhwn.R.inc(9980);break;
                    }
                } }else {{
                    __CLR4_5_27ce7celvlulhwn.R.inc(9981);streamContruction = 1;
                    __CLR4_5_27ce7celvlulhwn.R.inc(9982);type = "dtsc";
                }
            }} }else {{
                __CLR4_5_27ce7celvlulhwn.R.inc(9983);type = "dtsh";
                __CLR4_5_27ce7celvlulhwn.R.inc(9984);if ((((extAudio == 0)&&(__CLR4_5_27ce7celvlulhwn.R.iget(9985)!=0|true))||(__CLR4_5_27ce7celvlulhwn.R.iget(9986)==0&false))) {{
                    __CLR4_5_27ce7celvlulhwn.R.inc(9987);if (((((extCore == 0) && (extXXch == 1) && (extX96k == 0) && (extXbr == 0) && (extXll == 0) && (extLbr == 0))&&(__CLR4_5_27ce7celvlulhwn.R.iget(9988)!=0|true))||(__CLR4_5_27ce7celvlulhwn.R.iget(9989)==0&false))) {{
                        __CLR4_5_27ce7celvlulhwn.R.inc(9990);streamContruction = 5;
                    } }else {__CLR4_5_27ce7celvlulhwn.R.inc(9991);if ((((extCore == 0 && extXXch == 0 && extX96k == 0 && extXbr == 1 && extXll == 0 && extLbr == 0)&&(__CLR4_5_27ce7celvlulhwn.R.iget(9992)!=0|true))||(__CLR4_5_27ce7celvlulhwn.R.iget(9993)==0&false))) {{
                        __CLR4_5_27ce7celvlulhwn.R.inc(9994);streamContruction = 6;
                    } }else {__CLR4_5_27ce7celvlulhwn.R.inc(9995);if ((((extCore == 0 && extXXch == 1 && extX96k == 0 && extXbr == 1 && extXll == 0 && extLbr == 0)&&(__CLR4_5_27ce7celvlulhwn.R.iget(9996)!=0|true))||(__CLR4_5_27ce7celvlulhwn.R.iget(9997)==0&false))) {{
                        __CLR4_5_27ce7celvlulhwn.R.inc(9998);streamContruction = 9;
                    } }else {__CLR4_5_27ce7celvlulhwn.R.inc(9999);if ((((extCore == 0 && extXXch == 0 && extX96k == 1 && extXbr == 0 && extXll == 0 && extLbr == 0)&&(__CLR4_5_27ce7celvlulhwn.R.iget(10000)!=0|true))||(__CLR4_5_27ce7celvlulhwn.R.iget(10001)==0&false))) {{
                        __CLR4_5_27ce7celvlulhwn.R.inc(10002);streamContruction = 10;
                    } }else {__CLR4_5_27ce7celvlulhwn.R.inc(10003);if ((((extCore == 0 && extXXch == 1 && extX96k == 1 && extXbr == 0 && extXll == 0 && extLbr == 0)&&(__CLR4_5_27ce7celvlulhwn.R.iget(10004)!=0|true))||(__CLR4_5_27ce7celvlulhwn.R.iget(10005)==0&false))) {{
                        __CLR4_5_27ce7celvlulhwn.R.inc(10006);streamContruction = 13;
                    } }else {__CLR4_5_27ce7celvlulhwn.R.inc(10007);if ((((extCore == 0 && extXXch == 0 && extX96k == 0 && extXbr == 0 && extXll == 1 && extLbr == 0)&&(__CLR4_5_27ce7celvlulhwn.R.iget(10008)!=0|true))||(__CLR4_5_27ce7celvlulhwn.R.iget(10009)==0&false))) {{
                        __CLR4_5_27ce7celvlulhwn.R.inc(10010);streamContruction = 14;
                    }
                }}}}}}} }else {{
                    __CLR4_5_27ce7celvlulhwn.R.inc(10011);if (((((extAudioId == 0) && (extCore == 0) && (extXXch == 0) && (extX96k == 0) && (extXbr == 1) && (extXll == 0) && (extLbr == 0))&&(__CLR4_5_27ce7celvlulhwn.R.iget(10012)!=0|true))||(__CLR4_5_27ce7celvlulhwn.R.iget(10013)==0&false))) {{
                        __CLR4_5_27ce7celvlulhwn.R.inc(10014);streamContruction = 7;
                    } }else {__CLR4_5_27ce7celvlulhwn.R.inc(10015);if (((((extAudioId == 6) && (extCore == 0) && (extXXch == 0) && (extX96k == 0) && (extXbr == 1) && (extXll == 0) && (extLbr == 0))&&(__CLR4_5_27ce7celvlulhwn.R.iget(10016)!=0|true))||(__CLR4_5_27ce7celvlulhwn.R.iget(10017)==0&false))) {{
                        __CLR4_5_27ce7celvlulhwn.R.inc(10018);streamContruction = 8;
                    } }else {__CLR4_5_27ce7celvlulhwn.R.inc(10019);if (((((extAudioId == 0) && (extCore == 0) && (extXXch == 0) && (extX96k == 1) && (extXbr == 0) && (extXll == 0) && (extLbr == 0))&&(__CLR4_5_27ce7celvlulhwn.R.iget(10020)!=0|true))||(__CLR4_5_27ce7celvlulhwn.R.iget(10021)==0&false))) {{
                        __CLR4_5_27ce7celvlulhwn.R.inc(10022);streamContruction = 11;
                    } }else {__CLR4_5_27ce7celvlulhwn.R.inc(10023);if (((((extAudioId == 6) && (extCore == 0) && (extXXch == 0) && (extX96k == 1) && (extXbr == 0) && (extXll == 0) && (extLbr == 0))&&(__CLR4_5_27ce7celvlulhwn.R.iget(10024)!=0|true))||(__CLR4_5_27ce7celvlulhwn.R.iget(10025)==0&false))) {{
                        __CLR4_5_27ce7celvlulhwn.R.inc(10026);streamContruction = 12;
                    } }else {__CLR4_5_27ce7celvlulhwn.R.inc(10027);if (((((extAudioId == 0) && (extCore == 0) && (extXXch == 0) && (extX96k == 0) && (extXbr == 0) && (extXll == 1) && (extLbr == 0))&&(__CLR4_5_27ce7celvlulhwn.R.iget(10028)!=0|true))||(__CLR4_5_27ce7celvlulhwn.R.iget(10029)==0&false))) {{
                        __CLR4_5_27ce7celvlulhwn.R.inc(10030);streamContruction = 15;
                    } }else {__CLR4_5_27ce7celvlulhwn.R.inc(10031);if (((((extAudioId == 2) && (extCore == 0) && (extXXch == 0) && (extX96k == 0) && (extXbr == 0) && (extXll == 1) && (extLbr == 0))&&(__CLR4_5_27ce7celvlulhwn.R.iget(10032)!=0|true))||(__CLR4_5_27ce7celvlulhwn.R.iget(10033)==0&false))) {{
                        __CLR4_5_27ce7celvlulhwn.R.inc(10034);streamContruction = 16;
                    }
                }}}}}}}
            }}
        }}
        }__CLR4_5_27ce7celvlulhwn.R.inc(10035);ddts.setDTSSamplingFrequency(maxSampleRate);
        __CLR4_5_27ce7celvlulhwn.R.inc(10036);if ((((isVBR)&&(__CLR4_5_27ce7celvlulhwn.R.iget(10037)!=0|true))||(__CLR4_5_27ce7celvlulhwn.R.iget(10038)==0&false))) {{
            __CLR4_5_27ce7celvlulhwn.R.inc(10039);ddts.setMaxBitRate(1000 * (coreBitRate + extPeakBitrate));
        } }else {{
            __CLR4_5_27ce7celvlulhwn.R.inc(10040);ddts.setMaxBitRate(1000 * (coreBitRate + extAvgBitrate));
        }
        }__CLR4_5_27ce7celvlulhwn.R.inc(10041);ddts.setAvgBitRate(1000 * (coreBitRate + extAvgBitrate));
        __CLR4_5_27ce7celvlulhwn.R.inc(10042);ddts.setPcmSampleDepth(sampleSize);
        __CLR4_5_27ce7celvlulhwn.R.inc(10043);ddts.setFrameDuration(fd);
        __CLR4_5_27ce7celvlulhwn.R.inc(10044);ddts.setStreamConstruction(streamContruction); // We still need to look at this...
        __CLR4_5_27ce7celvlulhwn.R.inc(10045);if (((((coreChannelMask & 0x8) > 0 || (coreChannelMask & 0x1000) > 0)&&(__CLR4_5_27ce7celvlulhwn.R.iget(10046)!=0|true))||(__CLR4_5_27ce7celvlulhwn.R.iget(10047)==0&false))) {{
            __CLR4_5_27ce7celvlulhwn.R.inc(10048);ddts.setCoreLFEPresent(1);
        } }else {{
            __CLR4_5_27ce7celvlulhwn.R.inc(10049);ddts.setCoreLFEPresent(0);
        }
        }__CLR4_5_27ce7celvlulhwn.R.inc(10050);ddts.setCoreLayout(coreLayout);
        __CLR4_5_27ce7celvlulhwn.R.inc(10051);ddts.setCoreSize(coreFramePayloadInBytes);
        __CLR4_5_27ce7celvlulhwn.R.inc(10052);ddts.setStereoDownmix(0);
        __CLR4_5_27ce7celvlulhwn.R.inc(10053);ddts.setRepresentationType(4); // This was set in the other files?
        __CLR4_5_27ce7celvlulhwn.R.inc(10054);ddts.setChannelLayout(channelMask);
        __CLR4_5_27ce7celvlulhwn.R.inc(10055);if ((((coreMaxSampleRate > 0 && extAvgBitrate > 0)&&(__CLR4_5_27ce7celvlulhwn.R.iget(10056)!=0|true))||(__CLR4_5_27ce7celvlulhwn.R.iget(10057)==0&false))) {{
            __CLR4_5_27ce7celvlulhwn.R.inc(10058);ddts.setMultiAssetFlag(1);
        } }else {{
            __CLR4_5_27ce7celvlulhwn.R.inc(10059);ddts.setMultiAssetFlag(0);
        }
        }__CLR4_5_27ce7celvlulhwn.R.inc(10060);ddts.setLBRDurationMod(lbrCodingPresent);
        __CLR4_5_27ce7celvlulhwn.R.inc(10061);ddts.setReservedBoxPresent(0);

        __CLR4_5_27ce7celvlulhwn.R.inc(10062);channelCount = 0;
        __CLR4_5_27ce7celvlulhwn.R.inc(10063);for (int bit = 0; (((bit < 16)&&(__CLR4_5_27ce7celvlulhwn.R.iget(10064)!=0|true))||(__CLR4_5_27ce7celvlulhwn.R.iget(10065)==0&false)); bit++) {{
            __CLR4_5_27ce7celvlulhwn.R.inc(10066);if ((((((channelMask >> bit) & 1) == 1)&&(__CLR4_5_27ce7celvlulhwn.R.iget(10067)!=0|true))||(__CLR4_5_27ce7celvlulhwn.R.iget(10068)==0&false))) {{
                boolean __CLB4_5_2_bool5=false;__CLR4_5_27ce7celvlulhwn.R.inc(10069);switch (bit) {
                    case 0:if (!__CLB4_5_2_bool5) {__CLR4_5_27ce7celvlulhwn.R.inc(10070);__CLB4_5_2_bool5=true;}
                    case 3:if (!__CLB4_5_2_bool5) {__CLR4_5_27ce7celvlulhwn.R.inc(10071);__CLB4_5_2_bool5=true;}
                    case 4:if (!__CLB4_5_2_bool5) {__CLR4_5_27ce7celvlulhwn.R.inc(10072);__CLB4_5_2_bool5=true;}
                    case 7:if (!__CLB4_5_2_bool5) {__CLR4_5_27ce7celvlulhwn.R.inc(10073);__CLB4_5_2_bool5=true;}
                    case 8:if (!__CLB4_5_2_bool5) {__CLR4_5_27ce7celvlulhwn.R.inc(10074);__CLB4_5_2_bool5=true;}
                    case 12:if (!__CLB4_5_2_bool5) {__CLR4_5_27ce7celvlulhwn.R.inc(10075);__CLB4_5_2_bool5=true;}
                    case 14:if (!__CLB4_5_2_bool5) {__CLR4_5_27ce7celvlulhwn.R.inc(10076);__CLB4_5_2_bool5=true;}
                        __CLR4_5_27ce7celvlulhwn.R.inc(10077);channelCount++;
                        __CLR4_5_27ce7celvlulhwn.R.inc(10078);break;

                    default:if (!__CLB4_5_2_bool5) {__CLR4_5_27ce7celvlulhwn.R.inc(10079);__CLB4_5_2_bool5=true;}
                        __CLR4_5_27ce7celvlulhwn.R.inc(10080);channelCount += 2;
                        __CLR4_5_27ce7celvlulhwn.R.inc(10081);break;
                }
            }
        }}
        }__CLR4_5_27ce7celvlulhwn.R.inc(10082);samples = generateSamples(dataSource, dataOffset, dataSize, corePresent);
        __CLR4_5_27ce7celvlulhwn.R.inc(10083);sampleDurations = new long[samples.size()];
        __CLR4_5_27ce7celvlulhwn.R.inc(10084);Arrays.fill(sampleDurations, samplesPerFrame );

        __CLR4_5_27ce7celvlulhwn.R.inc(10085);return true;
    }finally{__CLR4_5_27ce7celvlulhwn.R.flushNeeded();}}

    private List<Sample> generateSamples(DataSource dataSource, int dataOffset, long dataSize, int corePresent) throws IOException {try{__CLR4_5_27ce7celvlulhwn.R.inc(10086);
        __CLR4_5_27ce7celvlulhwn.R.inc(10087);LookAhead la = new LookAhead(dataSource, dataOffset, dataSize , corePresent);
        __CLR4_5_27ce7celvlulhwn.R.inc(10088);ByteBuffer sample;
        __CLR4_5_27ce7celvlulhwn.R.inc(10089);List<Sample> mySamples = new ArrayList<Sample>();

        __CLR4_5_27ce7celvlulhwn.R.inc(10090);while ((sample = la.findNextStart()) != null) {{
            __CLR4_5_27ce7celvlulhwn.R.inc(10093);final ByteBuffer finalSample = sample;
            __CLR4_5_27ce7celvlulhwn.R.inc(10094);mySamples.add(new Sample() {
                public void writeTo(WritableByteChannel channel) throws IOException {try{__CLR4_5_27ce7celvlulhwn.R.inc(10095);
                    __CLR4_5_27ce7celvlulhwn.R.inc(10096);channel.write((ByteBuffer) finalSample.rewind());
                }finally{__CLR4_5_27ce7celvlulhwn.R.flushNeeded();}}

                public long getSize() {try{__CLR4_5_27ce7celvlulhwn.R.inc(10097);
                    __CLR4_5_27ce7celvlulhwn.R.inc(10098);return finalSample.rewind().remaining();
                }finally{__CLR4_5_27ce7celvlulhwn.R.flushNeeded();}}

                public ByteBuffer asByteBuffer() {try{__CLR4_5_27ce7celvlulhwn.R.inc(10099);
                    __CLR4_5_27ce7celvlulhwn.R.inc(10100);return finalSample;
                }finally{__CLR4_5_27ce7celvlulhwn.R.flushNeeded();}}
            });
            //System.err.println(finalSample.remaining());
        }
        }__CLR4_5_27ce7celvlulhwn.R.inc(10101);System.err.println("all samples found");
        __CLR4_5_27ce7celvlulhwn.R.inc(10102);return mySamples;
    }finally{__CLR4_5_27ce7celvlulhwn.R.flushNeeded();}}

    private int getBitRate(int rate) throws IOException {try{__CLR4_5_27ce7celvlulhwn.R.inc(10103);
        __CLR4_5_27ce7celvlulhwn.R.inc(10104);int bitrate;
        boolean __CLB4_5_2_bool6=false;__CLR4_5_27ce7celvlulhwn.R.inc(10105);switch (rate)

        {
            case 0:if (!__CLB4_5_2_bool6) {__CLR4_5_27ce7celvlulhwn.R.inc(10106);__CLB4_5_2_bool6=true;}
                __CLR4_5_27ce7celvlulhwn.R.inc(10107);bitrate = 32;
                __CLR4_5_27ce7celvlulhwn.R.inc(10108);break;

            case 1:if (!__CLB4_5_2_bool6) {__CLR4_5_27ce7celvlulhwn.R.inc(10109);__CLB4_5_2_bool6=true;}
                __CLR4_5_27ce7celvlulhwn.R.inc(10110);bitrate = 56;
                __CLR4_5_27ce7celvlulhwn.R.inc(10111);break;

            case 2:if (!__CLB4_5_2_bool6) {__CLR4_5_27ce7celvlulhwn.R.inc(10112);__CLB4_5_2_bool6=true;}
                __CLR4_5_27ce7celvlulhwn.R.inc(10113);bitrate = 64;
                __CLR4_5_27ce7celvlulhwn.R.inc(10114);break;

            case 3:if (!__CLB4_5_2_bool6) {__CLR4_5_27ce7celvlulhwn.R.inc(10115);__CLB4_5_2_bool6=true;}
                __CLR4_5_27ce7celvlulhwn.R.inc(10116);bitrate = 96;
                __CLR4_5_27ce7celvlulhwn.R.inc(10117);break;

            case 4:if (!__CLB4_5_2_bool6) {__CLR4_5_27ce7celvlulhwn.R.inc(10118);__CLB4_5_2_bool6=true;}
                __CLR4_5_27ce7celvlulhwn.R.inc(10119);bitrate = 112;
                __CLR4_5_27ce7celvlulhwn.R.inc(10120);break;

            case 5:if (!__CLB4_5_2_bool6) {__CLR4_5_27ce7celvlulhwn.R.inc(10121);__CLB4_5_2_bool6=true;}
                __CLR4_5_27ce7celvlulhwn.R.inc(10122);bitrate = 128;
                __CLR4_5_27ce7celvlulhwn.R.inc(10123);break;

            case 6:if (!__CLB4_5_2_bool6) {__CLR4_5_27ce7celvlulhwn.R.inc(10124);__CLB4_5_2_bool6=true;}
                __CLR4_5_27ce7celvlulhwn.R.inc(10125);bitrate = 192;
                __CLR4_5_27ce7celvlulhwn.R.inc(10126);break;

            case 7:if (!__CLB4_5_2_bool6) {__CLR4_5_27ce7celvlulhwn.R.inc(10127);__CLB4_5_2_bool6=true;}
                __CLR4_5_27ce7celvlulhwn.R.inc(10128);bitrate = 224;
                __CLR4_5_27ce7celvlulhwn.R.inc(10129);break;

            case 8:if (!__CLB4_5_2_bool6) {__CLR4_5_27ce7celvlulhwn.R.inc(10130);__CLB4_5_2_bool6=true;}
                __CLR4_5_27ce7celvlulhwn.R.inc(10131);bitrate = 256;
                __CLR4_5_27ce7celvlulhwn.R.inc(10132);break;

            case 9:if (!__CLB4_5_2_bool6) {__CLR4_5_27ce7celvlulhwn.R.inc(10133);__CLB4_5_2_bool6=true;}
                __CLR4_5_27ce7celvlulhwn.R.inc(10134);bitrate = 320;
                __CLR4_5_27ce7celvlulhwn.R.inc(10135);break;

            case 10:if (!__CLB4_5_2_bool6) {__CLR4_5_27ce7celvlulhwn.R.inc(10136);__CLB4_5_2_bool6=true;}
                __CLR4_5_27ce7celvlulhwn.R.inc(10137);bitrate = 384;
                __CLR4_5_27ce7celvlulhwn.R.inc(10138);break;

            case 11:if (!__CLB4_5_2_bool6) {__CLR4_5_27ce7celvlulhwn.R.inc(10139);__CLB4_5_2_bool6=true;}
                __CLR4_5_27ce7celvlulhwn.R.inc(10140);bitrate = 448;
                __CLR4_5_27ce7celvlulhwn.R.inc(10141);break;

            case 12:if (!__CLB4_5_2_bool6) {__CLR4_5_27ce7celvlulhwn.R.inc(10142);__CLB4_5_2_bool6=true;}
                __CLR4_5_27ce7celvlulhwn.R.inc(10143);bitrate = 512;
                __CLR4_5_27ce7celvlulhwn.R.inc(10144);break;

            case 13:if (!__CLB4_5_2_bool6) {__CLR4_5_27ce7celvlulhwn.R.inc(10145);__CLB4_5_2_bool6=true;}
                __CLR4_5_27ce7celvlulhwn.R.inc(10146);bitrate = 576;
                __CLR4_5_27ce7celvlulhwn.R.inc(10147);break;

            case 14:if (!__CLB4_5_2_bool6) {__CLR4_5_27ce7celvlulhwn.R.inc(10148);__CLB4_5_2_bool6=true;}
                __CLR4_5_27ce7celvlulhwn.R.inc(10149);bitrate = 640;
                __CLR4_5_27ce7celvlulhwn.R.inc(10150);break;

            case 15:if (!__CLB4_5_2_bool6) {__CLR4_5_27ce7celvlulhwn.R.inc(10151);__CLB4_5_2_bool6=true;}
                __CLR4_5_27ce7celvlulhwn.R.inc(10152);bitrate = 768;
                __CLR4_5_27ce7celvlulhwn.R.inc(10153);break;

            case 16:if (!__CLB4_5_2_bool6) {__CLR4_5_27ce7celvlulhwn.R.inc(10154);__CLB4_5_2_bool6=true;}
                __CLR4_5_27ce7celvlulhwn.R.inc(10155);bitrate = 960;
                __CLR4_5_27ce7celvlulhwn.R.inc(10156);break;

            case 17:if (!__CLB4_5_2_bool6) {__CLR4_5_27ce7celvlulhwn.R.inc(10157);__CLB4_5_2_bool6=true;}
                __CLR4_5_27ce7celvlulhwn.R.inc(10158);bitrate = 1024;
                __CLR4_5_27ce7celvlulhwn.R.inc(10159);break;

            case 18:if (!__CLB4_5_2_bool6) {__CLR4_5_27ce7celvlulhwn.R.inc(10160);__CLB4_5_2_bool6=true;}
                __CLR4_5_27ce7celvlulhwn.R.inc(10161);bitrate = 1152;
                __CLR4_5_27ce7celvlulhwn.R.inc(10162);break;

            case 19:if (!__CLB4_5_2_bool6) {__CLR4_5_27ce7celvlulhwn.R.inc(10163);__CLB4_5_2_bool6=true;}
                __CLR4_5_27ce7celvlulhwn.R.inc(10164);bitrate = 1280;
                __CLR4_5_27ce7celvlulhwn.R.inc(10165);break;

            case 20:if (!__CLB4_5_2_bool6) {__CLR4_5_27ce7celvlulhwn.R.inc(10166);__CLB4_5_2_bool6=true;}
                __CLR4_5_27ce7celvlulhwn.R.inc(10167);bitrate = 1344;
                __CLR4_5_27ce7celvlulhwn.R.inc(10168);break;

            case 21:if (!__CLB4_5_2_bool6) {__CLR4_5_27ce7celvlulhwn.R.inc(10169);__CLB4_5_2_bool6=true;}
                __CLR4_5_27ce7celvlulhwn.R.inc(10170);bitrate = 1408;
                __CLR4_5_27ce7celvlulhwn.R.inc(10171);break;

            case 22:if (!__CLB4_5_2_bool6) {__CLR4_5_27ce7celvlulhwn.R.inc(10172);__CLB4_5_2_bool6=true;}
                __CLR4_5_27ce7celvlulhwn.R.inc(10173);bitrate = 1411;
                __CLR4_5_27ce7celvlulhwn.R.inc(10174);break;

            case 23:if (!__CLB4_5_2_bool6) {__CLR4_5_27ce7celvlulhwn.R.inc(10175);__CLB4_5_2_bool6=true;}
                __CLR4_5_27ce7celvlulhwn.R.inc(10176);bitrate = 1472;
                __CLR4_5_27ce7celvlulhwn.R.inc(10177);break;

            case 24:if (!__CLB4_5_2_bool6) {__CLR4_5_27ce7celvlulhwn.R.inc(10178);__CLB4_5_2_bool6=true;}
                __CLR4_5_27ce7celvlulhwn.R.inc(10179);bitrate = 1536;
                __CLR4_5_27ce7celvlulhwn.R.inc(10180);break;

            case 25:if (!__CLB4_5_2_bool6) {__CLR4_5_27ce7celvlulhwn.R.inc(10181);__CLB4_5_2_bool6=true;}
                __CLR4_5_27ce7celvlulhwn.R.inc(10182);bitrate = -1; // Open, some other bitrate....
                __CLR4_5_27ce7celvlulhwn.R.inc(10183);break;

            default:if (!__CLB4_5_2_bool6) {__CLR4_5_27ce7celvlulhwn.R.inc(10184);__CLB4_5_2_bool6=true;}
                __CLR4_5_27ce7celvlulhwn.R.inc(10185);throw new IOException("Unknown bitrate value");

        }
        __CLR4_5_27ce7celvlulhwn.R.inc(10186);return bitrate;
    }finally{__CLR4_5_27ce7celvlulhwn.R.flushNeeded();}}

    private int getSampleRate(int sfreq) throws IOException {try{__CLR4_5_27ce7celvlulhwn.R.inc(10187);
        __CLR4_5_27ce7celvlulhwn.R.inc(10188);int samplerate;
        boolean __CLB4_5_2_bool7=false;__CLR4_5_27ce7celvlulhwn.R.inc(10189);switch (sfreq)

        {
            case 1:if (!__CLB4_5_2_bool7) {__CLR4_5_27ce7celvlulhwn.R.inc(10190);__CLB4_5_2_bool7=true;}
                __CLR4_5_27ce7celvlulhwn.R.inc(10191);samplerate = 8000;
                __CLR4_5_27ce7celvlulhwn.R.inc(10192);break;

            case 2:if (!__CLB4_5_2_bool7) {__CLR4_5_27ce7celvlulhwn.R.inc(10193);__CLB4_5_2_bool7=true;}
                __CLR4_5_27ce7celvlulhwn.R.inc(10194);samplerate = 16000;
                __CLR4_5_27ce7celvlulhwn.R.inc(10195);break;

            case 3:if (!__CLB4_5_2_bool7) {__CLR4_5_27ce7celvlulhwn.R.inc(10196);__CLB4_5_2_bool7=true;}
                __CLR4_5_27ce7celvlulhwn.R.inc(10197);samplerate = 32000;
                __CLR4_5_27ce7celvlulhwn.R.inc(10198);break;

            case 6:if (!__CLB4_5_2_bool7) {__CLR4_5_27ce7celvlulhwn.R.inc(10199);__CLB4_5_2_bool7=true;}
                __CLR4_5_27ce7celvlulhwn.R.inc(10200);samplerate = 11025;
                __CLR4_5_27ce7celvlulhwn.R.inc(10201);break;

            case 7:if (!__CLB4_5_2_bool7) {__CLR4_5_27ce7celvlulhwn.R.inc(10202);__CLB4_5_2_bool7=true;}
                __CLR4_5_27ce7celvlulhwn.R.inc(10203);samplerate = 22050;
                __CLR4_5_27ce7celvlulhwn.R.inc(10204);break;

            case 8:if (!__CLB4_5_2_bool7) {__CLR4_5_27ce7celvlulhwn.R.inc(10205);__CLB4_5_2_bool7=true;}
                __CLR4_5_27ce7celvlulhwn.R.inc(10206);samplerate = 44100;
                __CLR4_5_27ce7celvlulhwn.R.inc(10207);break;

            case 11:if (!__CLB4_5_2_bool7) {__CLR4_5_27ce7celvlulhwn.R.inc(10208);__CLB4_5_2_bool7=true;}
                __CLR4_5_27ce7celvlulhwn.R.inc(10209);samplerate = 12000;
                __CLR4_5_27ce7celvlulhwn.R.inc(10210);break;

            case 12:if (!__CLB4_5_2_bool7) {__CLR4_5_27ce7celvlulhwn.R.inc(10211);__CLB4_5_2_bool7=true;}
                __CLR4_5_27ce7celvlulhwn.R.inc(10212);samplerate = 24000;
                __CLR4_5_27ce7celvlulhwn.R.inc(10213);break;

            case 13:if (!__CLB4_5_2_bool7) {__CLR4_5_27ce7celvlulhwn.R.inc(10214);__CLB4_5_2_bool7=true;}
                __CLR4_5_27ce7celvlulhwn.R.inc(10215);samplerate = 48000;
                __CLR4_5_27ce7celvlulhwn.R.inc(10216);break;

            default:if (!__CLB4_5_2_bool7) {__CLR4_5_27ce7celvlulhwn.R.inc(10217);__CLB4_5_2_bool7=true;} // No other base samplerates allowed
                __CLR4_5_27ce7celvlulhwn.R.inc(10218);throw new IOException("Unknown Sample Rate");

        }
        __CLR4_5_27ce7celvlulhwn.R.inc(10219);return samplerate;
    }finally{__CLR4_5_27ce7celvlulhwn.R.flushNeeded();}}



    private static final int BUFFER = 1024 * 1024 * 64;

    class LookAhead {
        private final int corePresent;
        long bufferStartPos;
        int inBufferPos = 0;
        DataSource dataSource;
        long dataEnd;
        ByteBuffer buffer;

        long start;

        LookAhead(DataSource dataSource, long bufferStartPos, long dataSize, int corePresent) throws IOException {try{__CLR4_5_27ce7celvlulhwn.R.inc(10220);
            __CLR4_5_27ce7celvlulhwn.R.inc(10221);this.dataSource = dataSource;
            __CLR4_5_27ce7celvlulhwn.R.inc(10222);this.bufferStartPos = bufferStartPos;
            __CLR4_5_27ce7celvlulhwn.R.inc(10223);this.dataEnd = dataSize + bufferStartPos;
            __CLR4_5_27ce7celvlulhwn.R.inc(10224);this.corePresent = corePresent;
            __CLR4_5_27ce7celvlulhwn.R.inc(10225);fillBuffer();
        }finally{__CLR4_5_27ce7celvlulhwn.R.flushNeeded();}}

        public ByteBuffer findNextStart() throws IOException {try{__CLR4_5_27ce7celvlulhwn.R.inc(10226);
            __CLR4_5_27ce7celvlulhwn.R.inc(10227);try {
                // If core DTS stream is present then sync word is 0x7FFE8001
                // otherwise 0x64582025
                __CLR4_5_27ce7celvlulhwn.R.inc(10228);while (((((((corePresent==1)&&(__CLR4_5_27ce7celvlulhwn.R.iget(10229)!=0|true))||(__CLR4_5_27ce7celvlulhwn.R.iget(10230)==0&false))?!this.nextFourEquals0x7FFE8001():!nextFourEquals0x64582025())&&(__CLR4_5_27ce7celvlulhwn.R.iget(10231)!=0|true))||(__CLR4_5_27ce7celvlulhwn.R.iget(10232)==0&false))) {{
                    __CLR4_5_27ce7celvlulhwn.R.inc(10233);this.discardByte();
                }
                }__CLR4_5_27ce7celvlulhwn.R.inc(10234);this.discardNext4AndMarkStart();

                __CLR4_5_27ce7celvlulhwn.R.inc(10235);while (((((((corePresent==1)&&(__CLR4_5_27ce7celvlulhwn.R.iget(10236)!=0|true))||(__CLR4_5_27ce7celvlulhwn.R.iget(10237)==0&false))?!this.nextFourEquals0x7FFE8001orEof():!nextFourEquals0x64582025orEof())&&(__CLR4_5_27ce7celvlulhwn.R.iget(10238)!=0|true))||(__CLR4_5_27ce7celvlulhwn.R.iget(10239)==0&false))) {{
                    __CLR4_5_27ce7celvlulhwn.R.inc(10240);this.discardQWord();
                }
                }__CLR4_5_27ce7celvlulhwn.R.inc(10241);return this.getSample();
            } catch (EOFException e) {
                __CLR4_5_27ce7celvlulhwn.R.inc(10242);return null;
            }
        }finally{__CLR4_5_27ce7celvlulhwn.R.flushNeeded();}}


        private void fillBuffer() throws IOException {try{__CLR4_5_27ce7celvlulhwn.R.inc(10243);
            __CLR4_5_27ce7celvlulhwn.R.inc(10244);System.err.println("Fill Buffer");
            __CLR4_5_27ce7celvlulhwn.R.inc(10245);buffer = dataSource.map(bufferStartPos, Math.min(dataEnd - bufferStartPos, BUFFER));
        }finally{__CLR4_5_27ce7celvlulhwn.R.flushNeeded();}}

        private boolean nextFourEquals0x64582025() throws IOException {try{__CLR4_5_27ce7celvlulhwn.R.inc(10246);
            __CLR4_5_27ce7celvlulhwn.R.inc(10247);return nextFourEquals((byte) 100, (byte) 88, (byte) 32, (byte) 37);
        }finally{__CLR4_5_27ce7celvlulhwn.R.flushNeeded();}}

        private boolean nextFourEquals0x7FFE8001() throws IOException {try{__CLR4_5_27ce7celvlulhwn.R.inc(10248);
            __CLR4_5_27ce7celvlulhwn.R.inc(10249);return nextFourEquals((byte) 127, (byte) -2, (byte) -128, (byte) 1);
        }finally{__CLR4_5_27ce7celvlulhwn.R.flushNeeded();}}

        private boolean nextFourEquals(byte a, byte b, byte c, byte d) throws IOException {try{__CLR4_5_27ce7celvlulhwn.R.inc(10250);
            __CLR4_5_27ce7celvlulhwn.R.inc(10251);if ((((buffer.limit() - inBufferPos >= 4)&&(__CLR4_5_27ce7celvlulhwn.R.iget(10252)!=0|true))||(__CLR4_5_27ce7celvlulhwn.R.iget(10253)==0&false))) {{
                __CLR4_5_27ce7celvlulhwn.R.inc(10254);return ((buffer.get(inBufferPos) ==  a &&
                        buffer.get(inBufferPos + 1) == b &&
                        buffer.get(inBufferPos + 2) == c &&
                        (buffer.get(inBufferPos + 3) == d)));
            }
            }__CLR4_5_27ce7celvlulhwn.R.inc(10255);if ((((bufferStartPos + inBufferPos + 4 >= dataSource.size())&&(__CLR4_5_27ce7celvlulhwn.R.iget(10256)!=0|true))||(__CLR4_5_27ce7celvlulhwn.R.iget(10257)==0&false))) {{
                __CLR4_5_27ce7celvlulhwn.R.inc(10258);throw new EOFException();
            }
            }__CLR4_5_27ce7celvlulhwn.R.inc(10259);return false;
        }finally{__CLR4_5_27ce7celvlulhwn.R.flushNeeded();}}
        private boolean nextFourEquals0x64582025orEof() throws IOException {try{__CLR4_5_27ce7celvlulhwn.R.inc(10260);
            __CLR4_5_27ce7celvlulhwn.R.inc(10261);return nextFourEqualsOrEof((byte) 100, (byte) 88, (byte) 32, (byte) 37);
        }finally{__CLR4_5_27ce7celvlulhwn.R.flushNeeded();}}


        private boolean nextFourEquals0x7FFE8001orEof() throws IOException {try{__CLR4_5_27ce7celvlulhwn.R.inc(10262);
            __CLR4_5_27ce7celvlulhwn.R.inc(10263);return nextFourEqualsOrEof((byte) 127, (byte) -2, (byte) -128, (byte) 1);
        }finally{__CLR4_5_27ce7celvlulhwn.R.flushNeeded();}}
        private boolean nextFourEqualsOrEof(byte a, byte b, byte c, byte d) throws IOException {try{__CLR4_5_27ce7celvlulhwn.R.inc(10264);
            __CLR4_5_27ce7celvlulhwn.R.inc(10265);if ((((buffer.limit() - inBufferPos >= 4)&&(__CLR4_5_27ce7celvlulhwn.R.iget(10266)!=0|true))||(__CLR4_5_27ce7celvlulhwn.R.iget(10267)==0&false))) {{
                __CLR4_5_27ce7celvlulhwn.R.inc(10268);if ((((((bufferStartPos + inBufferPos) % (1024 * 1024)) == 0)&&(__CLR4_5_27ce7celvlulhwn.R.iget(10269)!=0|true))||(__CLR4_5_27ce7celvlulhwn.R.iget(10270)==0&false))) {{
                    __CLR4_5_27ce7celvlulhwn.R.inc(10271);System.err.println("" + ((bufferStartPos + inBufferPos) / 1024 / 1024));
                }
                }__CLR4_5_27ce7celvlulhwn.R.inc(10272);return ((buffer.get(inBufferPos) ==  a /*0x7F */&&
                        buffer.get(inBufferPos + 1) == b/*0xfe*/ &&
                        buffer.get(inBufferPos + 2) == c /*0x80*/ &&
                        (buffer.get(inBufferPos + 3) == d)));
            } }else {{
                __CLR4_5_27ce7celvlulhwn.R.inc(10273);if ((((bufferStartPos + inBufferPos + 4 > dataEnd)&&(__CLR4_5_27ce7celvlulhwn.R.iget(10274)!=0|true))||(__CLR4_5_27ce7celvlulhwn.R.iget(10275)==0&false))) {{
                    __CLR4_5_27ce7celvlulhwn.R.inc(10276);return bufferStartPos + inBufferPos == dataEnd;
                } }else {{
                    __CLR4_5_27ce7celvlulhwn.R.inc(10277);bufferStartPos = start;
                    __CLR4_5_27ce7celvlulhwn.R.inc(10278);inBufferPos = 0;
                    __CLR4_5_27ce7celvlulhwn.R.inc(10279);fillBuffer();
                    __CLR4_5_27ce7celvlulhwn.R.inc(10280);return nextFourEquals0x7FFE8001();
                }
            }}
        }}finally{__CLR4_5_27ce7celvlulhwn.R.flushNeeded();}}


        private void discardByte() {try{__CLR4_5_27ce7celvlulhwn.R.inc(10281);
            __CLR4_5_27ce7celvlulhwn.R.inc(10282);inBufferPos += 1;
        }finally{__CLR4_5_27ce7celvlulhwn.R.flushNeeded();}}
        private void discardQWord() {try{__CLR4_5_27ce7celvlulhwn.R.inc(10283);
            __CLR4_5_27ce7celvlulhwn.R.inc(10284);inBufferPos += 4;
        }finally{__CLR4_5_27ce7celvlulhwn.R.flushNeeded();}}


        private void discardNext4AndMarkStart() {try{__CLR4_5_27ce7celvlulhwn.R.inc(10285);
            __CLR4_5_27ce7celvlulhwn.R.inc(10286);start = bufferStartPos + inBufferPos;
            __CLR4_5_27ce7celvlulhwn.R.inc(10287);inBufferPos += 4;
        }finally{__CLR4_5_27ce7celvlulhwn.R.flushNeeded();}}

        private ByteBuffer getSample() {try{__CLR4_5_27ce7celvlulhwn.R.inc(10288);
            __CLR4_5_27ce7celvlulhwn.R.inc(10289);if ((((start >= bufferStartPos)&&(__CLR4_5_27ce7celvlulhwn.R.iget(10290)!=0|true))||(__CLR4_5_27ce7celvlulhwn.R.iget(10291)==0&false))) {{
                __CLR4_5_27ce7celvlulhwn.R.inc(10292);buffer.position((int) (start - bufferStartPos));
                __CLR4_5_27ce7celvlulhwn.R.inc(10293);Buffer sample = buffer.slice();
                __CLR4_5_27ce7celvlulhwn.R.inc(10294);sample.limit((int) (inBufferPos - (start - bufferStartPos)));
                __CLR4_5_27ce7celvlulhwn.R.inc(10295);return (ByteBuffer) sample;
            } }else {{
                __CLR4_5_27ce7celvlulhwn.R.inc(10296);throw new RuntimeException("damn! NAL exceeds buffer");
                // this can only happen if NAL is bigger than the buffer
            }

        }}finally{__CLR4_5_27ce7celvlulhwn.R.flushNeeded();}}
    }


}