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


@java.lang.SuppressWarnings({"fallthrough"}) public class DTSTrackImpl extends AbstractTrack {public static class __CLR4_5_279r79rlvl9eiat{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,10202,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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
        super(dataSource.toString());__CLR4_5_279r79rlvl9eiat.R.inc(9424);try{__CLR4_5_279r79rlvl9eiat.R.inc(9423);
        __CLR4_5_279r79rlvl9eiat.R.inc(9425);this.lang = lang;
        __CLR4_5_279r79rlvl9eiat.R.inc(9426);this.dataSource = dataSource;
        __CLR4_5_279r79rlvl9eiat.R.inc(9427);parse();
    }finally{__CLR4_5_279r79rlvl9eiat.R.flushNeeded();}}

    public DTSTrackImpl(DataSource dataSource) throws IOException {
        super(dataSource.toString());__CLR4_5_279r79rlvl9eiat.R.inc(9429);try{__CLR4_5_279r79rlvl9eiat.R.inc(9428);
        __CLR4_5_279r79rlvl9eiat.R.inc(9430);this.dataSource = dataSource;
        __CLR4_5_279r79rlvl9eiat.R.inc(9431);parse();
    }finally{__CLR4_5_279r79rlvl9eiat.R.flushNeeded();}}

    public void close() throws IOException {try{__CLR4_5_279r79rlvl9eiat.R.inc(9432);
        __CLR4_5_279r79rlvl9eiat.R.inc(9433);dataSource.close();
    }finally{__CLR4_5_279r79rlvl9eiat.R.flushNeeded();}}

    private void parse() throws IOException {try{__CLR4_5_279r79rlvl9eiat.R.inc(9434);
        __CLR4_5_279r79rlvl9eiat.R.inc(9435);if ((((!readVariables())&&(__CLR4_5_279r79rlvl9eiat.R.iget(9436)!=0|true))||(__CLR4_5_279r79rlvl9eiat.R.iget(9437)==0&false))) {{
            __CLR4_5_279r79rlvl9eiat.R.inc(9438);throw new IOException();
        }

        }__CLR4_5_279r79rlvl9eiat.R.inc(9439);sampleDescriptionBox = new SampleDescriptionBox();
        __CLR4_5_279r79rlvl9eiat.R.inc(9440);AudioSampleEntry audioSampleEntry = new AudioSampleEntry(type);
        __CLR4_5_279r79rlvl9eiat.R.inc(9441);audioSampleEntry.setChannelCount(channelCount);
        __CLR4_5_279r79rlvl9eiat.R.inc(9442);audioSampleEntry.setSampleRate(samplerate);
        __CLR4_5_279r79rlvl9eiat.R.inc(9443);audioSampleEntry.setDataReferenceIndex(1);
        __CLR4_5_279r79rlvl9eiat.R.inc(9444);audioSampleEntry.setSampleSize(16);


        __CLR4_5_279r79rlvl9eiat.R.inc(9445);audioSampleEntry.addBox(ddts);
        __CLR4_5_279r79rlvl9eiat.R.inc(9446);sampleDescriptionBox.addBox(audioSampleEntry);

        __CLR4_5_279r79rlvl9eiat.R.inc(9447);trackMetaData.setCreationTime(new Date());
        __CLR4_5_279r79rlvl9eiat.R.inc(9448);trackMetaData.setModificationTime(new Date());
        __CLR4_5_279r79rlvl9eiat.R.inc(9449);trackMetaData.setLanguage(lang);
        __CLR4_5_279r79rlvl9eiat.R.inc(9450);trackMetaData.setTimescale(samplerate); // Audio tracks always use samplerate as timescale


    }finally{__CLR4_5_279r79rlvl9eiat.R.flushNeeded();}}


    public List<Sample> getSamples() {try{__CLR4_5_279r79rlvl9eiat.R.inc(9451);

        __CLR4_5_279r79rlvl9eiat.R.inc(9452);return samples;
    }finally{__CLR4_5_279r79rlvl9eiat.R.flushNeeded();}}

    public SampleDescriptionBox getSampleDescriptionBox() {try{__CLR4_5_279r79rlvl9eiat.R.inc(9453);
        __CLR4_5_279r79rlvl9eiat.R.inc(9454);return sampleDescriptionBox;
    }finally{__CLR4_5_279r79rlvl9eiat.R.flushNeeded();}}

    public long[] getSampleDurations() {try{__CLR4_5_279r79rlvl9eiat.R.inc(9455);
        __CLR4_5_279r79rlvl9eiat.R.inc(9456);return sampleDurations;
    }finally{__CLR4_5_279r79rlvl9eiat.R.flushNeeded();}}

    public List<CompositionTimeToSample.Entry> getCompositionTimeEntries() {try{__CLR4_5_279r79rlvl9eiat.R.inc(9457);
        __CLR4_5_279r79rlvl9eiat.R.inc(9458);return null;
    }finally{__CLR4_5_279r79rlvl9eiat.R.flushNeeded();}}

    public long[] getSyncSamples() {try{__CLR4_5_279r79rlvl9eiat.R.inc(9459);
        __CLR4_5_279r79rlvl9eiat.R.inc(9460);return null;
    }finally{__CLR4_5_279r79rlvl9eiat.R.flushNeeded();}}

    public List<SampleDependencyTypeBox.Entry> getSampleDependencies() {try{__CLR4_5_279r79rlvl9eiat.R.inc(9461);
        __CLR4_5_279r79rlvl9eiat.R.inc(9462);return null;
    }finally{__CLR4_5_279r79rlvl9eiat.R.flushNeeded();}}

    public TrackMetaData getTrackMetaData() {try{__CLR4_5_279r79rlvl9eiat.R.inc(9463);
        __CLR4_5_279r79rlvl9eiat.R.inc(9464);return trackMetaData;
    }finally{__CLR4_5_279r79rlvl9eiat.R.flushNeeded();}}

    public String getHandler() {try{__CLR4_5_279r79rlvl9eiat.R.inc(9465);
        __CLR4_5_279r79rlvl9eiat.R.inc(9466);return "soun";
    }finally{__CLR4_5_279r79rlvl9eiat.R.flushNeeded();}}

    private void parseDtshdhdr(int size, ByteBuffer bb) {try{__CLR4_5_279r79rlvl9eiat.R.inc(9467);
        __CLR4_5_279r79rlvl9eiat.R.inc(9468);int hdrVersion = bb.getInt();
        __CLR4_5_279r79rlvl9eiat.R.inc(9469);int timeCodeHigh = bb.get();
        __CLR4_5_279r79rlvl9eiat.R.inc(9470);int timeCode = bb.getInt();
        __CLR4_5_279r79rlvl9eiat.R.inc(9471);int timeCodeFrameRate = bb.get();
        __CLR4_5_279r79rlvl9eiat.R.inc(9472);int bitwStreamMetadata = bb.getShort();
        __CLR4_5_279r79rlvl9eiat.R.inc(9473);int numAudioPresentations = bb.get();
        __CLR4_5_279r79rlvl9eiat.R.inc(9474);numExtSubStreams = bb.get();

        __CLR4_5_279r79rlvl9eiat.R.inc(9475);if (((((bitwStreamMetadata & 1) == 1)&&(__CLR4_5_279r79rlvl9eiat.R.iget(9476)!=0|true))||(__CLR4_5_279r79rlvl9eiat.R.iget(9477)==0&false))) {{
            __CLR4_5_279r79rlvl9eiat.R.inc(9478);isVBR = true;
        }
        }__CLR4_5_279r79rlvl9eiat.R.inc(9479);if (((((bitwStreamMetadata & 8) == 8)&&(__CLR4_5_279r79rlvl9eiat.R.iget(9480)!=0|true))||(__CLR4_5_279r79rlvl9eiat.R.iget(9481)==0&false))) {{
            __CLR4_5_279r79rlvl9eiat.R.inc(9482);coreSubStreamPresent = true;
        }
        }__CLR4_5_279r79rlvl9eiat.R.inc(9483);if (((((bitwStreamMetadata & 0x10) == 0x10)&&(__CLR4_5_279r79rlvl9eiat.R.iget(9484)!=0|true))||(__CLR4_5_279r79rlvl9eiat.R.iget(9485)==0&false))) {{
            __CLR4_5_279r79rlvl9eiat.R.inc(9486);extensionSubStreamPresent = true;
            __CLR4_5_279r79rlvl9eiat.R.inc(9487);numExtSubStreams++;
        } }else {{
            __CLR4_5_279r79rlvl9eiat.R.inc(9488);numExtSubStreams = 0;
        }
        }__CLR4_5_279r79rlvl9eiat.R.inc(9489);int i = 14;
        __CLR4_5_279r79rlvl9eiat.R.inc(9490);while ((((i < size)&&(__CLR4_5_279r79rlvl9eiat.R.iget(9491)!=0|true))||(__CLR4_5_279r79rlvl9eiat.R.iget(9492)==0&false))) {{
            __CLR4_5_279r79rlvl9eiat.R.inc(9493);bb.get();
            __CLR4_5_279r79rlvl9eiat.R.inc(9494);i++;
        }
    }}finally{__CLR4_5_279r79rlvl9eiat.R.flushNeeded();}}

    private boolean parseCoressmd(int size, ByteBuffer bb) {try{__CLR4_5_279r79rlvl9eiat.R.inc(9495);
        __CLR4_5_279r79rlvl9eiat.R.inc(9496);int cmsr_1 = bb.get();
        __CLR4_5_279r79rlvl9eiat.R.inc(9497);int cmsr_2 = bb.getShort();
        __CLR4_5_279r79rlvl9eiat.R.inc(9498);coreMaxSampleRate = (cmsr_1 << 16) | (cmsr_2 & 0xffff);
        __CLR4_5_279r79rlvl9eiat.R.inc(9499);coreBitRate = bb.getShort();
        __CLR4_5_279r79rlvl9eiat.R.inc(9500);coreChannelMask = bb.getShort();
        __CLR4_5_279r79rlvl9eiat.R.inc(9501);coreFramePayloadInBytes = bb.getInt();
        __CLR4_5_279r79rlvl9eiat.R.inc(9502);int i = 11;
        __CLR4_5_279r79rlvl9eiat.R.inc(9503);while ((((i < size)&&(__CLR4_5_279r79rlvl9eiat.R.iget(9504)!=0|true))||(__CLR4_5_279r79rlvl9eiat.R.iget(9505)==0&false))) {{
            __CLR4_5_279r79rlvl9eiat.R.inc(9506);bb.get();
            __CLR4_5_279r79rlvl9eiat.R.inc(9507);i++;
        }
        }__CLR4_5_279r79rlvl9eiat.R.inc(9508);return true;
    }finally{__CLR4_5_279r79rlvl9eiat.R.flushNeeded();}}

    private boolean parseAuprhdr(int size, ByteBuffer bb) {try{__CLR4_5_279r79rlvl9eiat.R.inc(9509);
        __CLR4_5_279r79rlvl9eiat.R.inc(9510);int audioPresIndex = bb.get();  // Audio_Pres_Index
        __CLR4_5_279r79rlvl9eiat.R.inc(9511);int bitwAupresData = bb.getShort(); // Bitw_Aupres_Metadata
        __CLR4_5_279r79rlvl9eiat.R.inc(9512);int a = bb.get();
        __CLR4_5_279r79rlvl9eiat.R.inc(9513);int b = bb.getShort();
        __CLR4_5_279r79rlvl9eiat.R.inc(9514);maxSampleRate = (a << 16) | (b & 0xffff);
        __CLR4_5_279r79rlvl9eiat.R.inc(9515);numFramesTotal = bb.getInt();
        __CLR4_5_279r79rlvl9eiat.R.inc(9516);samplesPerFrameAtMaxFs = bb.getShort();
        __CLR4_5_279r79rlvl9eiat.R.inc(9517);a = bb.get();
        __CLR4_5_279r79rlvl9eiat.R.inc(9518);b = bb.getInt();
        __CLR4_5_279r79rlvl9eiat.R.inc(9519);numSamplesOrigAudioAtMaxFs = (a << 32) | (b & 0xffff);
        __CLR4_5_279r79rlvl9eiat.R.inc(9520);channelMask = bb.getShort();
        __CLR4_5_279r79rlvl9eiat.R.inc(9521);codecDelayAtMaxFs = bb.getShort();
        __CLR4_5_279r79rlvl9eiat.R.inc(9522);int c = 21;
        __CLR4_5_279r79rlvl9eiat.R.inc(9523);if (((((bitwAupresData & 3) == 3)&&(__CLR4_5_279r79rlvl9eiat.R.iget(9524)!=0|true))||(__CLR4_5_279r79rlvl9eiat.R.iget(9525)==0&false))) {{
            __CLR4_5_279r79rlvl9eiat.R.inc(9526);a = bb.get();
            __CLR4_5_279r79rlvl9eiat.R.inc(9527);b = bb.getShort();
            __CLR4_5_279r79rlvl9eiat.R.inc(9528);bcCoreMaxSampleRate = (a << 16) | (b & 0xffff);
            __CLR4_5_279r79rlvl9eiat.R.inc(9529);bcCoreBitRate = bb.getShort();
            __CLR4_5_279r79rlvl9eiat.R.inc(9530);bcCoreChannelMask = bb.getShort();
            __CLR4_5_279r79rlvl9eiat.R.inc(9531);c += 7;
        }
        }__CLR4_5_279r79rlvl9eiat.R.inc(9532);if (((((bitwAupresData & 0x4) > 0)&&(__CLR4_5_279r79rlvl9eiat.R.iget(9533)!=0|true))||(__CLR4_5_279r79rlvl9eiat.R.iget(9534)==0&false))) {{
            __CLR4_5_279r79rlvl9eiat.R.inc(9535);lsbTrimPercent = bb.get();
            __CLR4_5_279r79rlvl9eiat.R.inc(9536);c++;
        }
        }__CLR4_5_279r79rlvl9eiat.R.inc(9537);if (((((bitwAupresData & 0x8) > 0)&&(__CLR4_5_279r79rlvl9eiat.R.iget(9538)!=0|true))||(__CLR4_5_279r79rlvl9eiat.R.iget(9539)==0&false))) {{
            __CLR4_5_279r79rlvl9eiat.R.inc(9540);lbrCodingPresent = 1;
        }
        }__CLR4_5_279r79rlvl9eiat.R.inc(9541);while ((((c < size)&&(__CLR4_5_279r79rlvl9eiat.R.iget(9542)!=0|true))||(__CLR4_5_279r79rlvl9eiat.R.iget(9543)==0&false))) {{
            __CLR4_5_279r79rlvl9eiat.R.inc(9544);bb.get();
            __CLR4_5_279r79rlvl9eiat.R.inc(9545);c++;
        }

        }__CLR4_5_279r79rlvl9eiat.R.inc(9546);return true;
    }finally{__CLR4_5_279r79rlvl9eiat.R.flushNeeded();}}

    /**
     * EXTSS_MD
     */
    private boolean parseExtssmd(int size, ByteBuffer bb) {try{__CLR4_5_279r79rlvl9eiat.R.inc(9547);
        __CLR4_5_279r79rlvl9eiat.R.inc(9548);int a = bb.get();
        __CLR4_5_279r79rlvl9eiat.R.inc(9549);int b = bb.getShort();
        __CLR4_5_279r79rlvl9eiat.R.inc(9550);extAvgBitrate = (a << 16) | (b & 0xffff);
        __CLR4_5_279r79rlvl9eiat.R.inc(9551);int i = 3;
        __CLR4_5_279r79rlvl9eiat.R.inc(9552);if ((((isVBR)&&(__CLR4_5_279r79rlvl9eiat.R.iget(9553)!=0|true))||(__CLR4_5_279r79rlvl9eiat.R.iget(9554)==0&false))) {{
            __CLR4_5_279r79rlvl9eiat.R.inc(9555);a = bb.get();
            __CLR4_5_279r79rlvl9eiat.R.inc(9556);b = bb.getShort();
            __CLR4_5_279r79rlvl9eiat.R.inc(9557);extPeakBitrate = (a << 16) | (b & 0xffff);
            __CLR4_5_279r79rlvl9eiat.R.inc(9558);extSmoothBuffSize = bb.getShort();
            __CLR4_5_279r79rlvl9eiat.R.inc(9559);i += 5;
        } }else {{
            __CLR4_5_279r79rlvl9eiat.R.inc(9560);extFramePayloadInBytes = bb.getInt();
            __CLR4_5_279r79rlvl9eiat.R.inc(9561);i += 4;
        }
        }__CLR4_5_279r79rlvl9eiat.R.inc(9562);while ((((i < size)&&(__CLR4_5_279r79rlvl9eiat.R.iget(9563)!=0|true))||(__CLR4_5_279r79rlvl9eiat.R.iget(9564)==0&false))) {{
            __CLR4_5_279r79rlvl9eiat.R.inc(9565);bb.get();
            __CLR4_5_279r79rlvl9eiat.R.inc(9566);i++;
        }
        }__CLR4_5_279r79rlvl9eiat.R.inc(9567);return true;
    }finally{__CLR4_5_279r79rlvl9eiat.R.flushNeeded();}}

    private boolean readVariables() throws IOException {try{__CLR4_5_279r79rlvl9eiat.R.inc(9568);
        __CLR4_5_279r79rlvl9eiat.R.inc(9569);ByteBuffer bb = dataSource.map(0, 25000);
        __CLR4_5_279r79rlvl9eiat.R.inc(9570);int testHeader1 = bb.getInt();
        __CLR4_5_279r79rlvl9eiat.R.inc(9571);int testHeader2 = bb.getInt();
        __CLR4_5_279r79rlvl9eiat.R.inc(9572);if ((((testHeader1 != 0x44545348 || (testHeader2 != 0x44484452))&&(__CLR4_5_279r79rlvl9eiat.R.iget(9573)!=0|true))||(__CLR4_5_279r79rlvl9eiat.R.iget(9574)==0&false))) {{ // ASCII: DTSHDHDR
            __CLR4_5_279r79rlvl9eiat.R.inc(9575);throw new IOException("data does not start with 'DTSHDHDR' as required for a DTS-HD file");
        }

        }__CLR4_5_279r79rlvl9eiat.R.inc(9576);while (((((testHeader1 != 0x5354524d || testHeader2 != 0x44415441) && bb.remaining() > 100)&&(__CLR4_5_279r79rlvl9eiat.R.iget(9577)!=0|true))||(__CLR4_5_279r79rlvl9eiat.R.iget(9578)==0&false))) {{ // ASCII: STRMDATA
            __CLR4_5_279r79rlvl9eiat.R.inc(9579);int size = (int) bb.getLong();
            __CLR4_5_279r79rlvl9eiat.R.inc(9580);if ((((testHeader1 == 0x44545348 && testHeader2 == 0x44484452)&&(__CLR4_5_279r79rlvl9eiat.R.iget(9581)!=0|true))||(__CLR4_5_279r79rlvl9eiat.R.iget(9582)==0&false))) {{ // ASCII: DTSHDHDR
                __CLR4_5_279r79rlvl9eiat.R.inc(9583);parseDtshdhdr(size, bb);
            } }else {__CLR4_5_279r79rlvl9eiat.R.inc(9584);if ((((testHeader1 == 0x434f5245 && testHeader2 == 0x53534d44)&&(__CLR4_5_279r79rlvl9eiat.R.iget(9585)!=0|true))||(__CLR4_5_279r79rlvl9eiat.R.iget(9586)==0&false))) {{ // ASCII: CORESSMD
                __CLR4_5_279r79rlvl9eiat.R.inc(9587);if ((((!parseCoressmd(size, bb))&&(__CLR4_5_279r79rlvl9eiat.R.iget(9588)!=0|true))||(__CLR4_5_279r79rlvl9eiat.R.iget(9589)==0&false))) {{
                    __CLR4_5_279r79rlvl9eiat.R.inc(9590);return false;
                }
            }} }else {__CLR4_5_279r79rlvl9eiat.R.inc(9591);if ((((testHeader1 == 0x41555052 && testHeader2 == 0x2d484452)&&(__CLR4_5_279r79rlvl9eiat.R.iget(9592)!=0|true))||(__CLR4_5_279r79rlvl9eiat.R.iget(9593)==0&false))) {{ // ASCII: AUPR-HDR
                __CLR4_5_279r79rlvl9eiat.R.inc(9594);if ((((!parseAuprhdr(size, bb))&&(__CLR4_5_279r79rlvl9eiat.R.iget(9595)!=0|true))||(__CLR4_5_279r79rlvl9eiat.R.iget(9596)==0&false))) {{
                    __CLR4_5_279r79rlvl9eiat.R.inc(9597);return false;
                }
            }} }else {__CLR4_5_279r79rlvl9eiat.R.inc(9598);if ((((testHeader1 == 0x45585453 && testHeader2 == 0x535f4d44)&&(__CLR4_5_279r79rlvl9eiat.R.iget(9599)!=0|true))||(__CLR4_5_279r79rlvl9eiat.R.iget(9600)==0&false))) {{ // ASCII: EXTSS_MD
                __CLR4_5_279r79rlvl9eiat.R.inc(9601);if ((((!parseExtssmd(size, bb))&&(__CLR4_5_279r79rlvl9eiat.R.iget(9602)!=0|true))||(__CLR4_5_279r79rlvl9eiat.R.iget(9603)==0&false))) {{
                    __CLR4_5_279r79rlvl9eiat.R.inc(9604);return false;
                }
            }} }else {{
                __CLR4_5_279r79rlvl9eiat.R.inc(9605);for (int i = 0; (((i < size)&&(__CLR4_5_279r79rlvl9eiat.R.iget(9606)!=0|true))||(__CLR4_5_279r79rlvl9eiat.R.iget(9607)==0&false)); i++) {{
                    __CLR4_5_279r79rlvl9eiat.R.inc(9608);byte b = bb.get();
                }
            }}
            }}}}__CLR4_5_279r79rlvl9eiat.R.inc(9609);testHeader1 = bb.getInt();
            __CLR4_5_279r79rlvl9eiat.R.inc(9610);testHeader2 = bb.getInt();
        }
        }__CLR4_5_279r79rlvl9eiat.R.inc(9611);long dataSize = bb.getLong();
        __CLR4_5_279r79rlvl9eiat.R.inc(9612);dataOffset = bb.position();

        __CLR4_5_279r79rlvl9eiat.R.inc(9613);int amode = -1;
        __CLR4_5_279r79rlvl9eiat.R.inc(9614);int extAudioId = 0;
        __CLR4_5_279r79rlvl9eiat.R.inc(9615);int extAudio = 0;

        __CLR4_5_279r79rlvl9eiat.R.inc(9616);int corePresent = -1;
        __CLR4_5_279r79rlvl9eiat.R.inc(9617);int extPresent = -1;
        __CLR4_5_279r79rlvl9eiat.R.inc(9618);int extXch = 0;
        __CLR4_5_279r79rlvl9eiat.R.inc(9619);int extXXch = 0;
        __CLR4_5_279r79rlvl9eiat.R.inc(9620);int extX96k = 0;
        __CLR4_5_279r79rlvl9eiat.R.inc(9621);int extXbr = 0;
        __CLR4_5_279r79rlvl9eiat.R.inc(9622);int extLbr = 0;
        __CLR4_5_279r79rlvl9eiat.R.inc(9623);int extXll = 0;
        __CLR4_5_279r79rlvl9eiat.R.inc(9624);int extCore = 0;

        __CLR4_5_279r79rlvl9eiat.R.inc(9625);boolean done = false;


        __CLR4_5_279r79rlvl9eiat.R.inc(9626);while ((((!done)&&(__CLR4_5_279r79rlvl9eiat.R.iget(9627)!=0|true))||(__CLR4_5_279r79rlvl9eiat.R.iget(9628)==0&false))) {{
            __CLR4_5_279r79rlvl9eiat.R.inc(9629);int offset = bb.position();
            __CLR4_5_279r79rlvl9eiat.R.inc(9630);int sync = bb.getInt();
            __CLR4_5_279r79rlvl9eiat.R.inc(9631);if ((((sync == 0x7ffe8001)&&(__CLR4_5_279r79rlvl9eiat.R.iget(9632)!=0|true))||(__CLR4_5_279r79rlvl9eiat.R.iget(9633)==0&false))) {{ // DTS_SYNCWORD_CORE
                __CLR4_5_279r79rlvl9eiat.R.inc(9634);if ((((corePresent == 1)&&(__CLR4_5_279r79rlvl9eiat.R.iget(9635)!=0|true))||(__CLR4_5_279r79rlvl9eiat.R.iget(9636)==0&false))) {{
                    __CLR4_5_279r79rlvl9eiat.R.inc(9637);done = true;
                } }else {{
                    __CLR4_5_279r79rlvl9eiat.R.inc(9638);corePresent = 1;
                    __CLR4_5_279r79rlvl9eiat.R.inc(9639);BitReaderBuffer brb = new BitReaderBuffer(bb);

                    __CLR4_5_279r79rlvl9eiat.R.inc(9640);int ftype = brb.readBits(1);
                    __CLR4_5_279r79rlvl9eiat.R.inc(9641);int shrt = brb.readBits(5);
                    __CLR4_5_279r79rlvl9eiat.R.inc(9642);int cpf = brb.readBits(1); // Should always be 0 - CRC is not present
                    __CLR4_5_279r79rlvl9eiat.R.inc(9643);if ((((ftype != 1 || shrt != 31 || cpf != 0)&&(__CLR4_5_279r79rlvl9eiat.R.iget(9644)!=0|true))||(__CLR4_5_279r79rlvl9eiat.R.iget(9645)==0&false)))

                    {{ // Termination frames - first frame should not be the last...
                        __CLR4_5_279r79rlvl9eiat.R.inc(9646);return false;
                    }

                    }__CLR4_5_279r79rlvl9eiat.R.inc(9647);int nblks = brb.readBits(7);
                    __CLR4_5_279r79rlvl9eiat.R.inc(9648);samplesPerFrame = 32 * (nblks + 1);
                    __CLR4_5_279r79rlvl9eiat.R.inc(9649);int fsize = brb.readBits(14);
                    __CLR4_5_279r79rlvl9eiat.R.inc(9650);frameSize += fsize + 1;
                    __CLR4_5_279r79rlvl9eiat.R.inc(9651);amode = brb.readBits(6); // Calc channel layout from this
                    __CLR4_5_279r79rlvl9eiat.R.inc(9652);int sfreq = brb.readBits(4);

                    __CLR4_5_279r79rlvl9eiat.R.inc(9653);samplerate = getSampleRate(sfreq);

                    __CLR4_5_279r79rlvl9eiat.R.inc(9654);int rate = brb.readBits(5);

                    __CLR4_5_279r79rlvl9eiat.R.inc(9655);bitrate = getBitRate(rate);

                    __CLR4_5_279r79rlvl9eiat.R.inc(9656);int fixedBit = brb.readBits(1);
                    __CLR4_5_279r79rlvl9eiat.R.inc(9657);if ((((fixedBit != 0)&&(__CLR4_5_279r79rlvl9eiat.R.iget(9658)!=0|true))||(__CLR4_5_279r79rlvl9eiat.R.iget(9659)==0&false)))

                    {{
                        __CLR4_5_279r79rlvl9eiat.R.inc(9660);return false;
                    }

                    }__CLR4_5_279r79rlvl9eiat.R.inc(9661);int dynf = brb.readBits(1);
                    __CLR4_5_279r79rlvl9eiat.R.inc(9662);int timef = brb.readBits(1);
                    __CLR4_5_279r79rlvl9eiat.R.inc(9663);int auxf = brb.readBits(1);
                    __CLR4_5_279r79rlvl9eiat.R.inc(9664);int hdcd = brb.readBits(1);
                    __CLR4_5_279r79rlvl9eiat.R.inc(9665);extAudioId = brb.readBits(3);
                    __CLR4_5_279r79rlvl9eiat.R.inc(9666);extAudio = brb.readBits(1);
                    __CLR4_5_279r79rlvl9eiat.R.inc(9667);int aspf = brb.readBits(1);
                    __CLR4_5_279r79rlvl9eiat.R.inc(9668);int lff = brb.readBits(2);
                    __CLR4_5_279r79rlvl9eiat.R.inc(9669);int hflag = brb.readBits(1);
                    __CLR4_5_279r79rlvl9eiat.R.inc(9670);int hcrc = 0;
                    __CLR4_5_279r79rlvl9eiat.R.inc(9671);if ((((cpf == 1)&&(__CLR4_5_279r79rlvl9eiat.R.iget(9672)!=0|true))||(__CLR4_5_279r79rlvl9eiat.R.iget(9673)==0&false)))

                    {{ // Present only if CPF=1.
                        __CLR4_5_279r79rlvl9eiat.R.inc(9674);hcrc = brb.readBits(16);
                    }

                    }__CLR4_5_279r79rlvl9eiat.R.inc(9675);int filts = brb.readBits(1);
                    __CLR4_5_279r79rlvl9eiat.R.inc(9676);int vernum = brb.readBits(4);
                    __CLR4_5_279r79rlvl9eiat.R.inc(9677);int chist = brb.readBits(2);
                    __CLR4_5_279r79rlvl9eiat.R.inc(9678);int pcmr = brb.readBits(3);
                    boolean __CLB4_5_2_bool0=false;__CLR4_5_279r79rlvl9eiat.R.inc(9679);switch (pcmr)

                    {
                        case 0:if (!__CLB4_5_2_bool0) {__CLR4_5_279r79rlvl9eiat.R.inc(9680);__CLB4_5_2_bool0=true;}
                        case 1:if (!__CLB4_5_2_bool0) {__CLR4_5_279r79rlvl9eiat.R.inc(9681);__CLB4_5_2_bool0=true;}
                            __CLR4_5_279r79rlvl9eiat.R.inc(9682);sampleSize = 16;
                            __CLR4_5_279r79rlvl9eiat.R.inc(9683);break;

                        case 2:if (!__CLB4_5_2_bool0) {__CLR4_5_279r79rlvl9eiat.R.inc(9684);__CLB4_5_2_bool0=true;}
                        case 3:if (!__CLB4_5_2_bool0) {__CLR4_5_279r79rlvl9eiat.R.inc(9685);__CLB4_5_2_bool0=true;}
                            __CLR4_5_279r79rlvl9eiat.R.inc(9686);sampleSize = 20;
                            __CLR4_5_279r79rlvl9eiat.R.inc(9687);break;

                        case 5:if (!__CLB4_5_2_bool0) {__CLR4_5_279r79rlvl9eiat.R.inc(9688);__CLB4_5_2_bool0=true;}
                        case 6:if (!__CLB4_5_2_bool0) {__CLR4_5_279r79rlvl9eiat.R.inc(9689);__CLB4_5_2_bool0=true;}
                            __CLR4_5_279r79rlvl9eiat.R.inc(9690);sampleSize = 24;
                            __CLR4_5_279r79rlvl9eiat.R.inc(9691);break;

                        default:if (!__CLB4_5_2_bool0) {__CLR4_5_279r79rlvl9eiat.R.inc(9692);__CLB4_5_2_bool0=true;}
                            __CLR4_5_279r79rlvl9eiat.R.inc(9693);return false;
                    }

                    __CLR4_5_279r79rlvl9eiat.R.inc(9694);int sumf = brb.readBits(1);
                    __CLR4_5_279r79rlvl9eiat.R.inc(9695);int sums = brb.readBits(1);
                    __CLR4_5_279r79rlvl9eiat.R.inc(9696);int dialnorm = 0;
                    __CLR4_5_279r79rlvl9eiat.R.inc(9697);int dng = 0;
                    boolean __CLB4_5_2_bool1=false;__CLR4_5_279r79rlvl9eiat.R.inc(9698);switch (vernum)

                    {
                        case 6:if (!__CLB4_5_2_bool1) {__CLR4_5_279r79rlvl9eiat.R.inc(9699);__CLB4_5_2_bool1=true;}
                            __CLR4_5_279r79rlvl9eiat.R.inc(9700);dialnorm = brb.readBits(4);
                            __CLR4_5_279r79rlvl9eiat.R.inc(9701);dng = -(16 + dialnorm);
                            __CLR4_5_279r79rlvl9eiat.R.inc(9702);break;

                        case 7:if (!__CLB4_5_2_bool1) {__CLR4_5_279r79rlvl9eiat.R.inc(9703);__CLB4_5_2_bool1=true;}
                            __CLR4_5_279r79rlvl9eiat.R.inc(9704);dialnorm = brb.readBits(4);
                            __CLR4_5_279r79rlvl9eiat.R.inc(9705);dng = -dialnorm;
                            __CLR4_5_279r79rlvl9eiat.R.inc(9706);break;

                        default:if (!__CLB4_5_2_bool1) {__CLR4_5_279r79rlvl9eiat.R.inc(9707);__CLB4_5_2_bool1=true;}
                            __CLR4_5_279r79rlvl9eiat.R.inc(9708);brb.readBits(4);
                            __CLR4_5_279r79rlvl9eiat.R.inc(9709);break;
                    }
                    __CLR4_5_279r79rlvl9eiat.R.inc(9710);bb.position(offset + fsize + 1);
                }
            }} }else {__CLR4_5_279r79rlvl9eiat.R.inc(9711);if ((((sync == 0x64582025)&&(__CLR4_5_279r79rlvl9eiat.R.iget(9712)!=0|true))||(__CLR4_5_279r79rlvl9eiat.R.iget(9713)==0&false))) {{ // DTS_SYNCWORD_SUBSTREAM
                __CLR4_5_279r79rlvl9eiat.R.inc(9714);if ((((corePresent == -1)&&(__CLR4_5_279r79rlvl9eiat.R.iget(9715)!=0|true))||(__CLR4_5_279r79rlvl9eiat.R.iget(9716)==0&false))) {{
                    __CLR4_5_279r79rlvl9eiat.R.inc(9717);corePresent = 0;
                    __CLR4_5_279r79rlvl9eiat.R.inc(9718);samplesPerFrame = samplesPerFrameAtMaxFs;
                }
                }__CLR4_5_279r79rlvl9eiat.R.inc(9719);extPresent = 1;
                __CLR4_5_279r79rlvl9eiat.R.inc(9720);BitReaderBuffer brb = new BitReaderBuffer(bb);
                __CLR4_5_279r79rlvl9eiat.R.inc(9721);int userDefinedBits = brb.readBits(8);
                __CLR4_5_279r79rlvl9eiat.R.inc(9722);int nExtSSIndex = brb.readBits(2);
                __CLR4_5_279r79rlvl9eiat.R.inc(9723);int headerSizeType = brb.readBits(1);
                __CLR4_5_279r79rlvl9eiat.R.inc(9724);int nuBits4Header = 12;
                __CLR4_5_279r79rlvl9eiat.R.inc(9725);int nuBits4ExSSFsize = 20;
                __CLR4_5_279r79rlvl9eiat.R.inc(9726);if ((((headerSizeType == 0)&&(__CLR4_5_279r79rlvl9eiat.R.iget(9727)!=0|true))||(__CLR4_5_279r79rlvl9eiat.R.iget(9728)==0&false))) {{
                    __CLR4_5_279r79rlvl9eiat.R.inc(9729);nuBits4Header = 8;
                    __CLR4_5_279r79rlvl9eiat.R.inc(9730);nuBits4ExSSFsize = 16;
                }
                }__CLR4_5_279r79rlvl9eiat.R.inc(9731);int nuExtSSHeaderSize = brb.readBits(nuBits4Header) + 1;
                __CLR4_5_279r79rlvl9eiat.R.inc(9732);int nuExtSSFsize = brb.readBits(nuBits4ExSSFsize) + 1;
                __CLR4_5_279r79rlvl9eiat.R.inc(9733);bb.position(offset + nuExtSSHeaderSize);
                __CLR4_5_279r79rlvl9eiat.R.inc(9734);int extSync = bb.getInt();
                __CLR4_5_279r79rlvl9eiat.R.inc(9735);if ((((extSync == 0x5a5a5a5a)&&(__CLR4_5_279r79rlvl9eiat.R.iget(9736)!=0|true))||(__CLR4_5_279r79rlvl9eiat.R.iget(9737)==0&false))) {{
                    __CLR4_5_279r79rlvl9eiat.R.inc(9738);if ((((extXch == 1)&&(__CLR4_5_279r79rlvl9eiat.R.iget(9739)!=0|true))||(__CLR4_5_279r79rlvl9eiat.R.iget(9740)==0&false))) {{
                        __CLR4_5_279r79rlvl9eiat.R.inc(9741);done = true;
                    }
                    }__CLR4_5_279r79rlvl9eiat.R.inc(9742);extXch = 1;
                } }else {__CLR4_5_279r79rlvl9eiat.R.inc(9743);if ((((extSync == 0x47004a03)&&(__CLR4_5_279r79rlvl9eiat.R.iget(9744)!=0|true))||(__CLR4_5_279r79rlvl9eiat.R.iget(9745)==0&false))) {{
                    __CLR4_5_279r79rlvl9eiat.R.inc(9746);if ((((extXXch == 1)&&(__CLR4_5_279r79rlvl9eiat.R.iget(9747)!=0|true))||(__CLR4_5_279r79rlvl9eiat.R.iget(9748)==0&false))) {{
                        __CLR4_5_279r79rlvl9eiat.R.inc(9749);done = true;
                    }
                    }__CLR4_5_279r79rlvl9eiat.R.inc(9750);extXXch = 1;
                } }else {__CLR4_5_279r79rlvl9eiat.R.inc(9751);if ((((extSync == 0x1d95f262)&&(__CLR4_5_279r79rlvl9eiat.R.iget(9752)!=0|true))||(__CLR4_5_279r79rlvl9eiat.R.iget(9753)==0&false))) {{
                    __CLR4_5_279r79rlvl9eiat.R.inc(9754);if ((((extX96k == 1)&&(__CLR4_5_279r79rlvl9eiat.R.iget(9755)!=0|true))||(__CLR4_5_279r79rlvl9eiat.R.iget(9756)==0&false))) {{
                        __CLR4_5_279r79rlvl9eiat.R.inc(9757);done = true;
                    }
                    }__CLR4_5_279r79rlvl9eiat.R.inc(9758);extX96k = 1;
                } }else {__CLR4_5_279r79rlvl9eiat.R.inc(9759);if ((((extSync == 0x655e315e)&&(__CLR4_5_279r79rlvl9eiat.R.iget(9760)!=0|true))||(__CLR4_5_279r79rlvl9eiat.R.iget(9761)==0&false))) {{
                    __CLR4_5_279r79rlvl9eiat.R.inc(9762);if ((((extXbr == 1)&&(__CLR4_5_279r79rlvl9eiat.R.iget(9763)!=0|true))||(__CLR4_5_279r79rlvl9eiat.R.iget(9764)==0&false))) {{
                        __CLR4_5_279r79rlvl9eiat.R.inc(9765);done = true;
                    }
                    }__CLR4_5_279r79rlvl9eiat.R.inc(9766);extXbr = 1;
                } }else {__CLR4_5_279r79rlvl9eiat.R.inc(9767);if ((((extSync == 0x0a801921)&&(__CLR4_5_279r79rlvl9eiat.R.iget(9768)!=0|true))||(__CLR4_5_279r79rlvl9eiat.R.iget(9769)==0&false))) {{
                    __CLR4_5_279r79rlvl9eiat.R.inc(9770);if ((((extLbr == 1)&&(__CLR4_5_279r79rlvl9eiat.R.iget(9771)!=0|true))||(__CLR4_5_279r79rlvl9eiat.R.iget(9772)==0&false))) {{
                        __CLR4_5_279r79rlvl9eiat.R.inc(9773);done = true;
                    }
                    }__CLR4_5_279r79rlvl9eiat.R.inc(9774);extLbr = 1;
                } }else {__CLR4_5_279r79rlvl9eiat.R.inc(9775);if ((((extSync == 0x41a29547)&&(__CLR4_5_279r79rlvl9eiat.R.iget(9776)!=0|true))||(__CLR4_5_279r79rlvl9eiat.R.iget(9777)==0&false))) {{
                    __CLR4_5_279r79rlvl9eiat.R.inc(9778);if ((((extXll == 1)&&(__CLR4_5_279r79rlvl9eiat.R.iget(9779)!=0|true))||(__CLR4_5_279r79rlvl9eiat.R.iget(9780)==0&false))) {{
                        __CLR4_5_279r79rlvl9eiat.R.inc(9781);done = true;
                    }
                    }__CLR4_5_279r79rlvl9eiat.R.inc(9782);extXll = 1;
                } }else {__CLR4_5_279r79rlvl9eiat.R.inc(9783);if ((((extSync == 0x02b09261)&&(__CLR4_5_279r79rlvl9eiat.R.iget(9784)!=0|true))||(__CLR4_5_279r79rlvl9eiat.R.iget(9785)==0&false))) {{
                    __CLR4_5_279r79rlvl9eiat.R.inc(9786);if ((((extCore == 1)&&(__CLR4_5_279r79rlvl9eiat.R.iget(9787)!=0|true))||(__CLR4_5_279r79rlvl9eiat.R.iget(9788)==0&false))) {{
                        __CLR4_5_279r79rlvl9eiat.R.inc(9789);done = true;
                    }
                    }__CLR4_5_279r79rlvl9eiat.R.inc(9790);extCore = 1;
                }
                }}}}}}}__CLR4_5_279r79rlvl9eiat.R.inc(9791);if ((((!done)&&(__CLR4_5_279r79rlvl9eiat.R.iget(9792)!=0|true))||(__CLR4_5_279r79rlvl9eiat.R.iget(9793)==0&false))) {{
                    __CLR4_5_279r79rlvl9eiat.R.inc(9794);frameSize += nuExtSSFsize;
                }
                }__CLR4_5_279r79rlvl9eiat.R.inc(9795);bb.position(offset + nuExtSSFsize);
            } }else {{
                __CLR4_5_279r79rlvl9eiat.R.inc(9796);throw new IOException("No DTS_SYNCWORD_* found at " + bb.position());
            }

        }}}
        }__CLR4_5_279r79rlvl9eiat.R.inc(9797);int fd = -1;
        boolean __CLB4_5_2_bool2=false;__CLR4_5_279r79rlvl9eiat.R.inc(9798);switch (samplesPerFrame)

        {
            case 512:if (!__CLB4_5_2_bool2) {__CLR4_5_279r79rlvl9eiat.R.inc(9799);__CLB4_5_2_bool2=true;}
                __CLR4_5_279r79rlvl9eiat.R.inc(9800);fd = 0;
                __CLR4_5_279r79rlvl9eiat.R.inc(9801);break;

            case 1024:if (!__CLB4_5_2_bool2) {__CLR4_5_279r79rlvl9eiat.R.inc(9802);__CLB4_5_2_bool2=true;}
                __CLR4_5_279r79rlvl9eiat.R.inc(9803);fd = 1;
                __CLR4_5_279r79rlvl9eiat.R.inc(9804);break;

            case 2048:if (!__CLB4_5_2_bool2) {__CLR4_5_279r79rlvl9eiat.R.inc(9805);__CLB4_5_2_bool2=true;}
                __CLR4_5_279r79rlvl9eiat.R.inc(9806);fd = 2;
                __CLR4_5_279r79rlvl9eiat.R.inc(9807);break;

            case 4096:if (!__CLB4_5_2_bool2) {__CLR4_5_279r79rlvl9eiat.R.inc(9808);__CLB4_5_2_bool2=true;}
                __CLR4_5_279r79rlvl9eiat.R.inc(9809);fd = 3;
                __CLR4_5_279r79rlvl9eiat.R.inc(9810);break;
        }

        __CLR4_5_279r79rlvl9eiat.R.inc(9811);if ((((fd == -1)&&(__CLR4_5_279r79rlvl9eiat.R.iget(9812)!=0|true))||(__CLR4_5_279r79rlvl9eiat.R.iget(9813)==0&false)))

        {{
            __CLR4_5_279r79rlvl9eiat.R.inc(9814);return false;
        }

        }__CLR4_5_279r79rlvl9eiat.R.inc(9815);int coreLayout = 31;
        boolean __CLB4_5_2_bool3=false;__CLR4_5_279r79rlvl9eiat.R.inc(9816);switch (amode)

        {
            case 0:if (!__CLB4_5_2_bool3) {__CLR4_5_279r79rlvl9eiat.R.inc(9817);__CLB4_5_2_bool3=true;}
            case 2:if (!__CLB4_5_2_bool3) {__CLR4_5_279r79rlvl9eiat.R.inc(9818);__CLB4_5_2_bool3=true;}
            case 4:if (!__CLB4_5_2_bool3) {__CLR4_5_279r79rlvl9eiat.R.inc(9819);__CLB4_5_2_bool3=true;}
            case 5:if (!__CLB4_5_2_bool3) {__CLR4_5_279r79rlvl9eiat.R.inc(9820);__CLB4_5_2_bool3=true;}
            case 6:if (!__CLB4_5_2_bool3) {__CLR4_5_279r79rlvl9eiat.R.inc(9821);__CLB4_5_2_bool3=true;}
            case 7:if (!__CLB4_5_2_bool3) {__CLR4_5_279r79rlvl9eiat.R.inc(9822);__CLB4_5_2_bool3=true;}
            case 8:if (!__CLB4_5_2_bool3) {__CLR4_5_279r79rlvl9eiat.R.inc(9823);__CLB4_5_2_bool3=true;}
            case 9:if (!__CLB4_5_2_bool3) {__CLR4_5_279r79rlvl9eiat.R.inc(9824);__CLB4_5_2_bool3=true;}
                __CLR4_5_279r79rlvl9eiat.R.inc(9825);coreLayout = amode;
        }

        __CLR4_5_279r79rlvl9eiat.R.inc(9826);int streamContruction = 0;
        __CLR4_5_279r79rlvl9eiat.R.inc(9827);if ((((corePresent == 0)&&(__CLR4_5_279r79rlvl9eiat.R.iget(9828)!=0|true))||(__CLR4_5_279r79rlvl9eiat.R.iget(9829)==0&false))) {{
            __CLR4_5_279r79rlvl9eiat.R.inc(9830);if ((((extXll == 1)&&(__CLR4_5_279r79rlvl9eiat.R.iget(9831)!=0|true))||(__CLR4_5_279r79rlvl9eiat.R.iget(9832)==0&false))) {{
                __CLR4_5_279r79rlvl9eiat.R.inc(9833);if ((((extCore == 0)&&(__CLR4_5_279r79rlvl9eiat.R.iget(9834)!=0|true))||(__CLR4_5_279r79rlvl9eiat.R.iget(9835)==0&false))) {{
                    __CLR4_5_279r79rlvl9eiat.R.inc(9836);streamContruction = 17;
                    __CLR4_5_279r79rlvl9eiat.R.inc(9837);type = "dtsl";
                } }else {{
                    __CLR4_5_279r79rlvl9eiat.R.inc(9838);streamContruction = 21;
                    __CLR4_5_279r79rlvl9eiat.R.inc(9839);type = "dtsh";
                }
            }} }else {__CLR4_5_279r79rlvl9eiat.R.inc(9840);if ((((extLbr == 1)&&(__CLR4_5_279r79rlvl9eiat.R.iget(9841)!=0|true))||(__CLR4_5_279r79rlvl9eiat.R.iget(9842)==0&false))) {{
                __CLR4_5_279r79rlvl9eiat.R.inc(9843);streamContruction = 18;
                __CLR4_5_279r79rlvl9eiat.R.inc(9844);type = "dtse";
            } }else {__CLR4_5_279r79rlvl9eiat.R.inc(9845);if ((((extCore == 1)&&(__CLR4_5_279r79rlvl9eiat.R.iget(9846)!=0|true))||(__CLR4_5_279r79rlvl9eiat.R.iget(9847)==0&false))) {{
                __CLR4_5_279r79rlvl9eiat.R.inc(9848);type = "dtsh";
                __CLR4_5_279r79rlvl9eiat.R.inc(9849);if ((((extXXch == 0 && extXll == 0)&&(__CLR4_5_279r79rlvl9eiat.R.iget(9850)!=0|true))||(__CLR4_5_279r79rlvl9eiat.R.iget(9851)==0&false))) {{
                    __CLR4_5_279r79rlvl9eiat.R.inc(9852);streamContruction = 19;
                } }else {__CLR4_5_279r79rlvl9eiat.R.inc(9853);if ((((extXXch == 1 && extXll == 0)&&(__CLR4_5_279r79rlvl9eiat.R.iget(9854)!=0|true))||(__CLR4_5_279r79rlvl9eiat.R.iget(9855)==0&false))) {{
                    __CLR4_5_279r79rlvl9eiat.R.inc(9856);streamContruction = 20;
                } }else {__CLR4_5_279r79rlvl9eiat.R.inc(9857);if ((((extXXch == 0 && extXll == 1)&&(__CLR4_5_279r79rlvl9eiat.R.iget(9858)!=0|true))||(__CLR4_5_279r79rlvl9eiat.R.iget(9859)==0&false))) {{
                    __CLR4_5_279r79rlvl9eiat.R.inc(9860);streamContruction = 21;
                }
            }}}}
            }}}__CLR4_5_279r79rlvl9eiat.R.inc(9861);samplerate = maxSampleRate;
            __CLR4_5_279r79rlvl9eiat.R.inc(9862);sampleSize = 24; // Is this always true?
        } }else {{
            __CLR4_5_279r79rlvl9eiat.R.inc(9863);if ((((extPresent < 1)&&(__CLR4_5_279r79rlvl9eiat.R.iget(9864)!=0|true))||(__CLR4_5_279r79rlvl9eiat.R.iget(9865)==0&false))) {{
                __CLR4_5_279r79rlvl9eiat.R.inc(9866);if ((((extAudio > 0)&&(__CLR4_5_279r79rlvl9eiat.R.iget(9867)!=0|true))||(__CLR4_5_279r79rlvl9eiat.R.iget(9868)==0&false))) {{
                    boolean __CLB4_5_2_bool4=false;__CLR4_5_279r79rlvl9eiat.R.inc(9869);switch (extAudioId) {
                        case 0:if (!__CLB4_5_2_bool4) {__CLR4_5_279r79rlvl9eiat.R.inc(9870);__CLB4_5_2_bool4=true;}
                            __CLR4_5_279r79rlvl9eiat.R.inc(9871);streamContruction = 2;
                            __CLR4_5_279r79rlvl9eiat.R.inc(9872);type = "dtsc";
                            __CLR4_5_279r79rlvl9eiat.R.inc(9873);break;

                        case 2:if (!__CLB4_5_2_bool4) {__CLR4_5_279r79rlvl9eiat.R.inc(9874);__CLB4_5_2_bool4=true;}
                            __CLR4_5_279r79rlvl9eiat.R.inc(9875);streamContruction = 4;
                            __CLR4_5_279r79rlvl9eiat.R.inc(9876);type = "dtsc";
                            __CLR4_5_279r79rlvl9eiat.R.inc(9877);break;

                        case 6:if (!__CLB4_5_2_bool4) {__CLR4_5_279r79rlvl9eiat.R.inc(9878);__CLB4_5_2_bool4=true;}
                            __CLR4_5_279r79rlvl9eiat.R.inc(9879);streamContruction = 3;
                            __CLR4_5_279r79rlvl9eiat.R.inc(9880);type = "dtsh";
                            __CLR4_5_279r79rlvl9eiat.R.inc(9881);break;

                        default:if (!__CLB4_5_2_bool4) {__CLR4_5_279r79rlvl9eiat.R.inc(9882);__CLB4_5_2_bool4=true;}
                            __CLR4_5_279r79rlvl9eiat.R.inc(9883);streamContruction = 0;
                            __CLR4_5_279r79rlvl9eiat.R.inc(9884);type = "dtsh";
                            __CLR4_5_279r79rlvl9eiat.R.inc(9885);break;
                    }
                } }else {{
                    __CLR4_5_279r79rlvl9eiat.R.inc(9886);streamContruction = 1;
                    __CLR4_5_279r79rlvl9eiat.R.inc(9887);type = "dtsc";
                }
            }} }else {{
                __CLR4_5_279r79rlvl9eiat.R.inc(9888);type = "dtsh";
                __CLR4_5_279r79rlvl9eiat.R.inc(9889);if ((((extAudio == 0)&&(__CLR4_5_279r79rlvl9eiat.R.iget(9890)!=0|true))||(__CLR4_5_279r79rlvl9eiat.R.iget(9891)==0&false))) {{
                    __CLR4_5_279r79rlvl9eiat.R.inc(9892);if (((((extCore == 0) && (extXXch == 1) && (extX96k == 0) && (extXbr == 0) && (extXll == 0) && (extLbr == 0))&&(__CLR4_5_279r79rlvl9eiat.R.iget(9893)!=0|true))||(__CLR4_5_279r79rlvl9eiat.R.iget(9894)==0&false))) {{
                        __CLR4_5_279r79rlvl9eiat.R.inc(9895);streamContruction = 5;
                    } }else {__CLR4_5_279r79rlvl9eiat.R.inc(9896);if ((((extCore == 0 && extXXch == 0 && extX96k == 0 && extXbr == 1 && extXll == 0 && extLbr == 0)&&(__CLR4_5_279r79rlvl9eiat.R.iget(9897)!=0|true))||(__CLR4_5_279r79rlvl9eiat.R.iget(9898)==0&false))) {{
                        __CLR4_5_279r79rlvl9eiat.R.inc(9899);streamContruction = 6;
                    } }else {__CLR4_5_279r79rlvl9eiat.R.inc(9900);if ((((extCore == 0 && extXXch == 1 && extX96k == 0 && extXbr == 1 && extXll == 0 && extLbr == 0)&&(__CLR4_5_279r79rlvl9eiat.R.iget(9901)!=0|true))||(__CLR4_5_279r79rlvl9eiat.R.iget(9902)==0&false))) {{
                        __CLR4_5_279r79rlvl9eiat.R.inc(9903);streamContruction = 9;
                    } }else {__CLR4_5_279r79rlvl9eiat.R.inc(9904);if ((((extCore == 0 && extXXch == 0 && extX96k == 1 && extXbr == 0 && extXll == 0 && extLbr == 0)&&(__CLR4_5_279r79rlvl9eiat.R.iget(9905)!=0|true))||(__CLR4_5_279r79rlvl9eiat.R.iget(9906)==0&false))) {{
                        __CLR4_5_279r79rlvl9eiat.R.inc(9907);streamContruction = 10;
                    } }else {__CLR4_5_279r79rlvl9eiat.R.inc(9908);if ((((extCore == 0 && extXXch == 1 && extX96k == 1 && extXbr == 0 && extXll == 0 && extLbr == 0)&&(__CLR4_5_279r79rlvl9eiat.R.iget(9909)!=0|true))||(__CLR4_5_279r79rlvl9eiat.R.iget(9910)==0&false))) {{
                        __CLR4_5_279r79rlvl9eiat.R.inc(9911);streamContruction = 13;
                    } }else {__CLR4_5_279r79rlvl9eiat.R.inc(9912);if ((((extCore == 0 && extXXch == 0 && extX96k == 0 && extXbr == 0 && extXll == 1 && extLbr == 0)&&(__CLR4_5_279r79rlvl9eiat.R.iget(9913)!=0|true))||(__CLR4_5_279r79rlvl9eiat.R.iget(9914)==0&false))) {{
                        __CLR4_5_279r79rlvl9eiat.R.inc(9915);streamContruction = 14;
                    }
                }}}}}}} }else {{
                    __CLR4_5_279r79rlvl9eiat.R.inc(9916);if (((((extAudioId == 0) && (extCore == 0) && (extXXch == 0) && (extX96k == 0) && (extXbr == 1) && (extXll == 0) && (extLbr == 0))&&(__CLR4_5_279r79rlvl9eiat.R.iget(9917)!=0|true))||(__CLR4_5_279r79rlvl9eiat.R.iget(9918)==0&false))) {{
                        __CLR4_5_279r79rlvl9eiat.R.inc(9919);streamContruction = 7;
                    } }else {__CLR4_5_279r79rlvl9eiat.R.inc(9920);if (((((extAudioId == 6) && (extCore == 0) && (extXXch == 0) && (extX96k == 0) && (extXbr == 1) && (extXll == 0) && (extLbr == 0))&&(__CLR4_5_279r79rlvl9eiat.R.iget(9921)!=0|true))||(__CLR4_5_279r79rlvl9eiat.R.iget(9922)==0&false))) {{
                        __CLR4_5_279r79rlvl9eiat.R.inc(9923);streamContruction = 8;
                    } }else {__CLR4_5_279r79rlvl9eiat.R.inc(9924);if (((((extAudioId == 0) && (extCore == 0) && (extXXch == 0) && (extX96k == 1) && (extXbr == 0) && (extXll == 0) && (extLbr == 0))&&(__CLR4_5_279r79rlvl9eiat.R.iget(9925)!=0|true))||(__CLR4_5_279r79rlvl9eiat.R.iget(9926)==0&false))) {{
                        __CLR4_5_279r79rlvl9eiat.R.inc(9927);streamContruction = 11;
                    } }else {__CLR4_5_279r79rlvl9eiat.R.inc(9928);if (((((extAudioId == 6) && (extCore == 0) && (extXXch == 0) && (extX96k == 1) && (extXbr == 0) && (extXll == 0) && (extLbr == 0))&&(__CLR4_5_279r79rlvl9eiat.R.iget(9929)!=0|true))||(__CLR4_5_279r79rlvl9eiat.R.iget(9930)==0&false))) {{
                        __CLR4_5_279r79rlvl9eiat.R.inc(9931);streamContruction = 12;
                    } }else {__CLR4_5_279r79rlvl9eiat.R.inc(9932);if (((((extAudioId == 0) && (extCore == 0) && (extXXch == 0) && (extX96k == 0) && (extXbr == 0) && (extXll == 1) && (extLbr == 0))&&(__CLR4_5_279r79rlvl9eiat.R.iget(9933)!=0|true))||(__CLR4_5_279r79rlvl9eiat.R.iget(9934)==0&false))) {{
                        __CLR4_5_279r79rlvl9eiat.R.inc(9935);streamContruction = 15;
                    } }else {__CLR4_5_279r79rlvl9eiat.R.inc(9936);if (((((extAudioId == 2) && (extCore == 0) && (extXXch == 0) && (extX96k == 0) && (extXbr == 0) && (extXll == 1) && (extLbr == 0))&&(__CLR4_5_279r79rlvl9eiat.R.iget(9937)!=0|true))||(__CLR4_5_279r79rlvl9eiat.R.iget(9938)==0&false))) {{
                        __CLR4_5_279r79rlvl9eiat.R.inc(9939);streamContruction = 16;
                    }
                }}}}}}}
            }}
        }}
        }__CLR4_5_279r79rlvl9eiat.R.inc(9940);ddts.setDTSSamplingFrequency(maxSampleRate);
        __CLR4_5_279r79rlvl9eiat.R.inc(9941);if ((((isVBR)&&(__CLR4_5_279r79rlvl9eiat.R.iget(9942)!=0|true))||(__CLR4_5_279r79rlvl9eiat.R.iget(9943)==0&false))) {{
            __CLR4_5_279r79rlvl9eiat.R.inc(9944);ddts.setMaxBitRate(1000 * (coreBitRate + extPeakBitrate));
        } }else {{
            __CLR4_5_279r79rlvl9eiat.R.inc(9945);ddts.setMaxBitRate(1000 * (coreBitRate + extAvgBitrate));
        }
        }__CLR4_5_279r79rlvl9eiat.R.inc(9946);ddts.setAvgBitRate(1000 * (coreBitRate + extAvgBitrate));
        __CLR4_5_279r79rlvl9eiat.R.inc(9947);ddts.setPcmSampleDepth(sampleSize);
        __CLR4_5_279r79rlvl9eiat.R.inc(9948);ddts.setFrameDuration(fd);
        __CLR4_5_279r79rlvl9eiat.R.inc(9949);ddts.setStreamConstruction(streamContruction); // We still need to look at this...
        __CLR4_5_279r79rlvl9eiat.R.inc(9950);if (((((coreChannelMask & 0x8) > 0 || (coreChannelMask & 0x1000) > 0)&&(__CLR4_5_279r79rlvl9eiat.R.iget(9951)!=0|true))||(__CLR4_5_279r79rlvl9eiat.R.iget(9952)==0&false))) {{
            __CLR4_5_279r79rlvl9eiat.R.inc(9953);ddts.setCoreLFEPresent(1);
        } }else {{
            __CLR4_5_279r79rlvl9eiat.R.inc(9954);ddts.setCoreLFEPresent(0);
        }
        }__CLR4_5_279r79rlvl9eiat.R.inc(9955);ddts.setCoreLayout(coreLayout);
        __CLR4_5_279r79rlvl9eiat.R.inc(9956);ddts.setCoreSize(coreFramePayloadInBytes);
        __CLR4_5_279r79rlvl9eiat.R.inc(9957);ddts.setStereoDownmix(0);
        __CLR4_5_279r79rlvl9eiat.R.inc(9958);ddts.setRepresentationType(4); // This was set in the other files?
        __CLR4_5_279r79rlvl9eiat.R.inc(9959);ddts.setChannelLayout(channelMask);
        __CLR4_5_279r79rlvl9eiat.R.inc(9960);if ((((coreMaxSampleRate > 0 && extAvgBitrate > 0)&&(__CLR4_5_279r79rlvl9eiat.R.iget(9961)!=0|true))||(__CLR4_5_279r79rlvl9eiat.R.iget(9962)==0&false))) {{
            __CLR4_5_279r79rlvl9eiat.R.inc(9963);ddts.setMultiAssetFlag(1);
        } }else {{
            __CLR4_5_279r79rlvl9eiat.R.inc(9964);ddts.setMultiAssetFlag(0);
        }
        }__CLR4_5_279r79rlvl9eiat.R.inc(9965);ddts.setLBRDurationMod(lbrCodingPresent);
        __CLR4_5_279r79rlvl9eiat.R.inc(9966);ddts.setReservedBoxPresent(0);

        __CLR4_5_279r79rlvl9eiat.R.inc(9967);channelCount = 0;
        __CLR4_5_279r79rlvl9eiat.R.inc(9968);for (int bit = 0; (((bit < 16)&&(__CLR4_5_279r79rlvl9eiat.R.iget(9969)!=0|true))||(__CLR4_5_279r79rlvl9eiat.R.iget(9970)==0&false)); bit++) {{
            __CLR4_5_279r79rlvl9eiat.R.inc(9971);if ((((((channelMask >> bit) & 1) == 1)&&(__CLR4_5_279r79rlvl9eiat.R.iget(9972)!=0|true))||(__CLR4_5_279r79rlvl9eiat.R.iget(9973)==0&false))) {{
                boolean __CLB4_5_2_bool5=false;__CLR4_5_279r79rlvl9eiat.R.inc(9974);switch (bit) {
                    case 0:if (!__CLB4_5_2_bool5) {__CLR4_5_279r79rlvl9eiat.R.inc(9975);__CLB4_5_2_bool5=true;}
                    case 3:if (!__CLB4_5_2_bool5) {__CLR4_5_279r79rlvl9eiat.R.inc(9976);__CLB4_5_2_bool5=true;}
                    case 4:if (!__CLB4_5_2_bool5) {__CLR4_5_279r79rlvl9eiat.R.inc(9977);__CLB4_5_2_bool5=true;}
                    case 7:if (!__CLB4_5_2_bool5) {__CLR4_5_279r79rlvl9eiat.R.inc(9978);__CLB4_5_2_bool5=true;}
                    case 8:if (!__CLB4_5_2_bool5) {__CLR4_5_279r79rlvl9eiat.R.inc(9979);__CLB4_5_2_bool5=true;}
                    case 12:if (!__CLB4_5_2_bool5) {__CLR4_5_279r79rlvl9eiat.R.inc(9980);__CLB4_5_2_bool5=true;}
                    case 14:if (!__CLB4_5_2_bool5) {__CLR4_5_279r79rlvl9eiat.R.inc(9981);__CLB4_5_2_bool5=true;}
                        __CLR4_5_279r79rlvl9eiat.R.inc(9982);channelCount++;
                        __CLR4_5_279r79rlvl9eiat.R.inc(9983);break;

                    default:if (!__CLB4_5_2_bool5) {__CLR4_5_279r79rlvl9eiat.R.inc(9984);__CLB4_5_2_bool5=true;}
                        __CLR4_5_279r79rlvl9eiat.R.inc(9985);channelCount += 2;
                        __CLR4_5_279r79rlvl9eiat.R.inc(9986);break;
                }
            }
        }}
        }__CLR4_5_279r79rlvl9eiat.R.inc(9987);samples = generateSamples(dataSource, dataOffset, dataSize, corePresent);
        __CLR4_5_279r79rlvl9eiat.R.inc(9988);sampleDurations = new long[samples.size()];
        __CLR4_5_279r79rlvl9eiat.R.inc(9989);Arrays.fill(sampleDurations, samplesPerFrame );

        __CLR4_5_279r79rlvl9eiat.R.inc(9990);return true;
    }finally{__CLR4_5_279r79rlvl9eiat.R.flushNeeded();}}

    private List<Sample> generateSamples(DataSource dataSource, int dataOffset, long dataSize, int corePresent) throws IOException {try{__CLR4_5_279r79rlvl9eiat.R.inc(9991);
        __CLR4_5_279r79rlvl9eiat.R.inc(9992);LookAhead la = new LookAhead(dataSource, dataOffset, dataSize , corePresent);
        __CLR4_5_279r79rlvl9eiat.R.inc(9993);ByteBuffer sample;
        __CLR4_5_279r79rlvl9eiat.R.inc(9994);List<Sample> mySamples = new ArrayList<Sample>();

        __CLR4_5_279r79rlvl9eiat.R.inc(9995);while ((sample = la.findNextStart()) != null) {{
            __CLR4_5_279r79rlvl9eiat.R.inc(9998);final ByteBuffer finalSample = sample;
            __CLR4_5_279r79rlvl9eiat.R.inc(9999);mySamples.add(new Sample() {
                public void writeTo(WritableByteChannel channel) throws IOException {try{__CLR4_5_279r79rlvl9eiat.R.inc(10000);
                    __CLR4_5_279r79rlvl9eiat.R.inc(10001);channel.write((ByteBuffer) finalSample.rewind());
                }finally{__CLR4_5_279r79rlvl9eiat.R.flushNeeded();}}

                public long getSize() {try{__CLR4_5_279r79rlvl9eiat.R.inc(10002);
                    __CLR4_5_279r79rlvl9eiat.R.inc(10003);return finalSample.rewind().remaining();
                }finally{__CLR4_5_279r79rlvl9eiat.R.flushNeeded();}}

                public ByteBuffer asByteBuffer() {try{__CLR4_5_279r79rlvl9eiat.R.inc(10004);
                    __CLR4_5_279r79rlvl9eiat.R.inc(10005);return finalSample;
                }finally{__CLR4_5_279r79rlvl9eiat.R.flushNeeded();}}
            });
            //System.err.println(finalSample.remaining());
        }
        }__CLR4_5_279r79rlvl9eiat.R.inc(10006);System.err.println("all samples found");
        __CLR4_5_279r79rlvl9eiat.R.inc(10007);return mySamples;
    }finally{__CLR4_5_279r79rlvl9eiat.R.flushNeeded();}}

    private int getBitRate(int rate) throws IOException {try{__CLR4_5_279r79rlvl9eiat.R.inc(10008);
        __CLR4_5_279r79rlvl9eiat.R.inc(10009);int bitrate;
        boolean __CLB4_5_2_bool6=false;__CLR4_5_279r79rlvl9eiat.R.inc(10010);switch (rate)

        {
            case 0:if (!__CLB4_5_2_bool6) {__CLR4_5_279r79rlvl9eiat.R.inc(10011);__CLB4_5_2_bool6=true;}
                __CLR4_5_279r79rlvl9eiat.R.inc(10012);bitrate = 32;
                __CLR4_5_279r79rlvl9eiat.R.inc(10013);break;

            case 1:if (!__CLB4_5_2_bool6) {__CLR4_5_279r79rlvl9eiat.R.inc(10014);__CLB4_5_2_bool6=true;}
                __CLR4_5_279r79rlvl9eiat.R.inc(10015);bitrate = 56;
                __CLR4_5_279r79rlvl9eiat.R.inc(10016);break;

            case 2:if (!__CLB4_5_2_bool6) {__CLR4_5_279r79rlvl9eiat.R.inc(10017);__CLB4_5_2_bool6=true;}
                __CLR4_5_279r79rlvl9eiat.R.inc(10018);bitrate = 64;
                __CLR4_5_279r79rlvl9eiat.R.inc(10019);break;

            case 3:if (!__CLB4_5_2_bool6) {__CLR4_5_279r79rlvl9eiat.R.inc(10020);__CLB4_5_2_bool6=true;}
                __CLR4_5_279r79rlvl9eiat.R.inc(10021);bitrate = 96;
                __CLR4_5_279r79rlvl9eiat.R.inc(10022);break;

            case 4:if (!__CLB4_5_2_bool6) {__CLR4_5_279r79rlvl9eiat.R.inc(10023);__CLB4_5_2_bool6=true;}
                __CLR4_5_279r79rlvl9eiat.R.inc(10024);bitrate = 112;
                __CLR4_5_279r79rlvl9eiat.R.inc(10025);break;

            case 5:if (!__CLB4_5_2_bool6) {__CLR4_5_279r79rlvl9eiat.R.inc(10026);__CLB4_5_2_bool6=true;}
                __CLR4_5_279r79rlvl9eiat.R.inc(10027);bitrate = 128;
                __CLR4_5_279r79rlvl9eiat.R.inc(10028);break;

            case 6:if (!__CLB4_5_2_bool6) {__CLR4_5_279r79rlvl9eiat.R.inc(10029);__CLB4_5_2_bool6=true;}
                __CLR4_5_279r79rlvl9eiat.R.inc(10030);bitrate = 192;
                __CLR4_5_279r79rlvl9eiat.R.inc(10031);break;

            case 7:if (!__CLB4_5_2_bool6) {__CLR4_5_279r79rlvl9eiat.R.inc(10032);__CLB4_5_2_bool6=true;}
                __CLR4_5_279r79rlvl9eiat.R.inc(10033);bitrate = 224;
                __CLR4_5_279r79rlvl9eiat.R.inc(10034);break;

            case 8:if (!__CLB4_5_2_bool6) {__CLR4_5_279r79rlvl9eiat.R.inc(10035);__CLB4_5_2_bool6=true;}
                __CLR4_5_279r79rlvl9eiat.R.inc(10036);bitrate = 256;
                __CLR4_5_279r79rlvl9eiat.R.inc(10037);break;

            case 9:if (!__CLB4_5_2_bool6) {__CLR4_5_279r79rlvl9eiat.R.inc(10038);__CLB4_5_2_bool6=true;}
                __CLR4_5_279r79rlvl9eiat.R.inc(10039);bitrate = 320;
                __CLR4_5_279r79rlvl9eiat.R.inc(10040);break;

            case 10:if (!__CLB4_5_2_bool6) {__CLR4_5_279r79rlvl9eiat.R.inc(10041);__CLB4_5_2_bool6=true;}
                __CLR4_5_279r79rlvl9eiat.R.inc(10042);bitrate = 384;
                __CLR4_5_279r79rlvl9eiat.R.inc(10043);break;

            case 11:if (!__CLB4_5_2_bool6) {__CLR4_5_279r79rlvl9eiat.R.inc(10044);__CLB4_5_2_bool6=true;}
                __CLR4_5_279r79rlvl9eiat.R.inc(10045);bitrate = 448;
                __CLR4_5_279r79rlvl9eiat.R.inc(10046);break;

            case 12:if (!__CLB4_5_2_bool6) {__CLR4_5_279r79rlvl9eiat.R.inc(10047);__CLB4_5_2_bool6=true;}
                __CLR4_5_279r79rlvl9eiat.R.inc(10048);bitrate = 512;
                __CLR4_5_279r79rlvl9eiat.R.inc(10049);break;

            case 13:if (!__CLB4_5_2_bool6) {__CLR4_5_279r79rlvl9eiat.R.inc(10050);__CLB4_5_2_bool6=true;}
                __CLR4_5_279r79rlvl9eiat.R.inc(10051);bitrate = 576;
                __CLR4_5_279r79rlvl9eiat.R.inc(10052);break;

            case 14:if (!__CLB4_5_2_bool6) {__CLR4_5_279r79rlvl9eiat.R.inc(10053);__CLB4_5_2_bool6=true;}
                __CLR4_5_279r79rlvl9eiat.R.inc(10054);bitrate = 640;
                __CLR4_5_279r79rlvl9eiat.R.inc(10055);break;

            case 15:if (!__CLB4_5_2_bool6) {__CLR4_5_279r79rlvl9eiat.R.inc(10056);__CLB4_5_2_bool6=true;}
                __CLR4_5_279r79rlvl9eiat.R.inc(10057);bitrate = 768;
                __CLR4_5_279r79rlvl9eiat.R.inc(10058);break;

            case 16:if (!__CLB4_5_2_bool6) {__CLR4_5_279r79rlvl9eiat.R.inc(10059);__CLB4_5_2_bool6=true;}
                __CLR4_5_279r79rlvl9eiat.R.inc(10060);bitrate = 960;
                __CLR4_5_279r79rlvl9eiat.R.inc(10061);break;

            case 17:if (!__CLB4_5_2_bool6) {__CLR4_5_279r79rlvl9eiat.R.inc(10062);__CLB4_5_2_bool6=true;}
                __CLR4_5_279r79rlvl9eiat.R.inc(10063);bitrate = 1024;
                __CLR4_5_279r79rlvl9eiat.R.inc(10064);break;

            case 18:if (!__CLB4_5_2_bool6) {__CLR4_5_279r79rlvl9eiat.R.inc(10065);__CLB4_5_2_bool6=true;}
                __CLR4_5_279r79rlvl9eiat.R.inc(10066);bitrate = 1152;
                __CLR4_5_279r79rlvl9eiat.R.inc(10067);break;

            case 19:if (!__CLB4_5_2_bool6) {__CLR4_5_279r79rlvl9eiat.R.inc(10068);__CLB4_5_2_bool6=true;}
                __CLR4_5_279r79rlvl9eiat.R.inc(10069);bitrate = 1280;
                __CLR4_5_279r79rlvl9eiat.R.inc(10070);break;

            case 20:if (!__CLB4_5_2_bool6) {__CLR4_5_279r79rlvl9eiat.R.inc(10071);__CLB4_5_2_bool6=true;}
                __CLR4_5_279r79rlvl9eiat.R.inc(10072);bitrate = 1344;
                __CLR4_5_279r79rlvl9eiat.R.inc(10073);break;

            case 21:if (!__CLB4_5_2_bool6) {__CLR4_5_279r79rlvl9eiat.R.inc(10074);__CLB4_5_2_bool6=true;}
                __CLR4_5_279r79rlvl9eiat.R.inc(10075);bitrate = 1408;
                __CLR4_5_279r79rlvl9eiat.R.inc(10076);break;

            case 22:if (!__CLB4_5_2_bool6) {__CLR4_5_279r79rlvl9eiat.R.inc(10077);__CLB4_5_2_bool6=true;}
                __CLR4_5_279r79rlvl9eiat.R.inc(10078);bitrate = 1411;
                __CLR4_5_279r79rlvl9eiat.R.inc(10079);break;

            case 23:if (!__CLB4_5_2_bool6) {__CLR4_5_279r79rlvl9eiat.R.inc(10080);__CLB4_5_2_bool6=true;}
                __CLR4_5_279r79rlvl9eiat.R.inc(10081);bitrate = 1472;
                __CLR4_5_279r79rlvl9eiat.R.inc(10082);break;

            case 24:if (!__CLB4_5_2_bool6) {__CLR4_5_279r79rlvl9eiat.R.inc(10083);__CLB4_5_2_bool6=true;}
                __CLR4_5_279r79rlvl9eiat.R.inc(10084);bitrate = 1536;
                __CLR4_5_279r79rlvl9eiat.R.inc(10085);break;

            case 25:if (!__CLB4_5_2_bool6) {__CLR4_5_279r79rlvl9eiat.R.inc(10086);__CLB4_5_2_bool6=true;}
                __CLR4_5_279r79rlvl9eiat.R.inc(10087);bitrate = -1; // Open, some other bitrate....
                __CLR4_5_279r79rlvl9eiat.R.inc(10088);break;

            default:if (!__CLB4_5_2_bool6) {__CLR4_5_279r79rlvl9eiat.R.inc(10089);__CLB4_5_2_bool6=true;}
                __CLR4_5_279r79rlvl9eiat.R.inc(10090);throw new IOException("Unknown bitrate value");

        }
        __CLR4_5_279r79rlvl9eiat.R.inc(10091);return bitrate;
    }finally{__CLR4_5_279r79rlvl9eiat.R.flushNeeded();}}

    private int getSampleRate(int sfreq) throws IOException {try{__CLR4_5_279r79rlvl9eiat.R.inc(10092);
        __CLR4_5_279r79rlvl9eiat.R.inc(10093);int samplerate;
        boolean __CLB4_5_2_bool7=false;__CLR4_5_279r79rlvl9eiat.R.inc(10094);switch (sfreq)

        {
            case 1:if (!__CLB4_5_2_bool7) {__CLR4_5_279r79rlvl9eiat.R.inc(10095);__CLB4_5_2_bool7=true;}
                __CLR4_5_279r79rlvl9eiat.R.inc(10096);samplerate = 8000;
                __CLR4_5_279r79rlvl9eiat.R.inc(10097);break;

            case 2:if (!__CLB4_5_2_bool7) {__CLR4_5_279r79rlvl9eiat.R.inc(10098);__CLB4_5_2_bool7=true;}
                __CLR4_5_279r79rlvl9eiat.R.inc(10099);samplerate = 16000;
                __CLR4_5_279r79rlvl9eiat.R.inc(10100);break;

            case 3:if (!__CLB4_5_2_bool7) {__CLR4_5_279r79rlvl9eiat.R.inc(10101);__CLB4_5_2_bool7=true;}
                __CLR4_5_279r79rlvl9eiat.R.inc(10102);samplerate = 32000;
                __CLR4_5_279r79rlvl9eiat.R.inc(10103);break;

            case 6:if (!__CLB4_5_2_bool7) {__CLR4_5_279r79rlvl9eiat.R.inc(10104);__CLB4_5_2_bool7=true;}
                __CLR4_5_279r79rlvl9eiat.R.inc(10105);samplerate = 11025;
                __CLR4_5_279r79rlvl9eiat.R.inc(10106);break;

            case 7:if (!__CLB4_5_2_bool7) {__CLR4_5_279r79rlvl9eiat.R.inc(10107);__CLB4_5_2_bool7=true;}
                __CLR4_5_279r79rlvl9eiat.R.inc(10108);samplerate = 22050;
                __CLR4_5_279r79rlvl9eiat.R.inc(10109);break;

            case 8:if (!__CLB4_5_2_bool7) {__CLR4_5_279r79rlvl9eiat.R.inc(10110);__CLB4_5_2_bool7=true;}
                __CLR4_5_279r79rlvl9eiat.R.inc(10111);samplerate = 44100;
                __CLR4_5_279r79rlvl9eiat.R.inc(10112);break;

            case 11:if (!__CLB4_5_2_bool7) {__CLR4_5_279r79rlvl9eiat.R.inc(10113);__CLB4_5_2_bool7=true;}
                __CLR4_5_279r79rlvl9eiat.R.inc(10114);samplerate = 12000;
                __CLR4_5_279r79rlvl9eiat.R.inc(10115);break;

            case 12:if (!__CLB4_5_2_bool7) {__CLR4_5_279r79rlvl9eiat.R.inc(10116);__CLB4_5_2_bool7=true;}
                __CLR4_5_279r79rlvl9eiat.R.inc(10117);samplerate = 24000;
                __CLR4_5_279r79rlvl9eiat.R.inc(10118);break;

            case 13:if (!__CLB4_5_2_bool7) {__CLR4_5_279r79rlvl9eiat.R.inc(10119);__CLB4_5_2_bool7=true;}
                __CLR4_5_279r79rlvl9eiat.R.inc(10120);samplerate = 48000;
                __CLR4_5_279r79rlvl9eiat.R.inc(10121);break;

            default:if (!__CLB4_5_2_bool7) {__CLR4_5_279r79rlvl9eiat.R.inc(10122);__CLB4_5_2_bool7=true;} // No other base samplerates allowed
                __CLR4_5_279r79rlvl9eiat.R.inc(10123);throw new IOException("Unknown Sample Rate");

        }
        __CLR4_5_279r79rlvl9eiat.R.inc(10124);return samplerate;
    }finally{__CLR4_5_279r79rlvl9eiat.R.flushNeeded();}}



    private static final int BUFFER = 1024 * 1024 * 64;

    class LookAhead {
        private final int corePresent;
        long bufferStartPos;
        int inBufferPos = 0;
        DataSource dataSource;
        long dataEnd;
        ByteBuffer buffer;

        long start;

        LookAhead(DataSource dataSource, long bufferStartPos, long dataSize, int corePresent) throws IOException {try{__CLR4_5_279r79rlvl9eiat.R.inc(10125);
            __CLR4_5_279r79rlvl9eiat.R.inc(10126);this.dataSource = dataSource;
            __CLR4_5_279r79rlvl9eiat.R.inc(10127);this.bufferStartPos = bufferStartPos;
            __CLR4_5_279r79rlvl9eiat.R.inc(10128);this.dataEnd = dataSize + bufferStartPos;
            __CLR4_5_279r79rlvl9eiat.R.inc(10129);this.corePresent = corePresent;
            __CLR4_5_279r79rlvl9eiat.R.inc(10130);fillBuffer();
        }finally{__CLR4_5_279r79rlvl9eiat.R.flushNeeded();}}

        public ByteBuffer findNextStart() throws IOException {try{__CLR4_5_279r79rlvl9eiat.R.inc(10131);
            __CLR4_5_279r79rlvl9eiat.R.inc(10132);try {
                // If core DTS stream is present then sync word is 0x7FFE8001
                // otherwise 0x64582025
                __CLR4_5_279r79rlvl9eiat.R.inc(10133);while (((((((corePresent==1)&&(__CLR4_5_279r79rlvl9eiat.R.iget(10134)!=0|true))||(__CLR4_5_279r79rlvl9eiat.R.iget(10135)==0&false))?!this.nextFourEquals0x7FFE8001():!nextFourEquals0x64582025())&&(__CLR4_5_279r79rlvl9eiat.R.iget(10136)!=0|true))||(__CLR4_5_279r79rlvl9eiat.R.iget(10137)==0&false))) {{
                    __CLR4_5_279r79rlvl9eiat.R.inc(10138);this.discardByte();
                }
                }__CLR4_5_279r79rlvl9eiat.R.inc(10139);this.discardNext4AndMarkStart();

                __CLR4_5_279r79rlvl9eiat.R.inc(10140);while (((((((corePresent==1)&&(__CLR4_5_279r79rlvl9eiat.R.iget(10141)!=0|true))||(__CLR4_5_279r79rlvl9eiat.R.iget(10142)==0&false))?!this.nextFourEquals0x7FFE8001orEof():!nextFourEquals0x64582025orEof())&&(__CLR4_5_279r79rlvl9eiat.R.iget(10143)!=0|true))||(__CLR4_5_279r79rlvl9eiat.R.iget(10144)==0&false))) {{
                    __CLR4_5_279r79rlvl9eiat.R.inc(10145);this.discardQWord();
                }
                }__CLR4_5_279r79rlvl9eiat.R.inc(10146);return this.getSample();
            } catch (EOFException e) {
                __CLR4_5_279r79rlvl9eiat.R.inc(10147);return null;
            }
        }finally{__CLR4_5_279r79rlvl9eiat.R.flushNeeded();}}


        private void fillBuffer() throws IOException {try{__CLR4_5_279r79rlvl9eiat.R.inc(10148);
            __CLR4_5_279r79rlvl9eiat.R.inc(10149);System.err.println("Fill Buffer");
            __CLR4_5_279r79rlvl9eiat.R.inc(10150);buffer = dataSource.map(bufferStartPos, Math.min(dataEnd - bufferStartPos, BUFFER));
        }finally{__CLR4_5_279r79rlvl9eiat.R.flushNeeded();}}

        private boolean nextFourEquals0x64582025() throws IOException {try{__CLR4_5_279r79rlvl9eiat.R.inc(10151);
            __CLR4_5_279r79rlvl9eiat.R.inc(10152);return nextFourEquals((byte) 100, (byte) 88, (byte) 32, (byte) 37);
        }finally{__CLR4_5_279r79rlvl9eiat.R.flushNeeded();}}

        private boolean nextFourEquals0x7FFE8001() throws IOException {try{__CLR4_5_279r79rlvl9eiat.R.inc(10153);
            __CLR4_5_279r79rlvl9eiat.R.inc(10154);return nextFourEquals((byte) 127, (byte) -2, (byte) -128, (byte) 1);
        }finally{__CLR4_5_279r79rlvl9eiat.R.flushNeeded();}}

        private boolean nextFourEquals(byte a, byte b, byte c, byte d) throws IOException {try{__CLR4_5_279r79rlvl9eiat.R.inc(10155);
            __CLR4_5_279r79rlvl9eiat.R.inc(10156);if ((((buffer.limit() - inBufferPos >= 4)&&(__CLR4_5_279r79rlvl9eiat.R.iget(10157)!=0|true))||(__CLR4_5_279r79rlvl9eiat.R.iget(10158)==0&false))) {{
                __CLR4_5_279r79rlvl9eiat.R.inc(10159);return ((buffer.get(inBufferPos) ==  a &&
                        buffer.get(inBufferPos + 1) == b &&
                        buffer.get(inBufferPos + 2) == c &&
                        (buffer.get(inBufferPos + 3) == d)));
            }
            }__CLR4_5_279r79rlvl9eiat.R.inc(10160);if ((((bufferStartPos + inBufferPos + 4 >= dataSource.size())&&(__CLR4_5_279r79rlvl9eiat.R.iget(10161)!=0|true))||(__CLR4_5_279r79rlvl9eiat.R.iget(10162)==0&false))) {{
                __CLR4_5_279r79rlvl9eiat.R.inc(10163);throw new EOFException();
            }
            }__CLR4_5_279r79rlvl9eiat.R.inc(10164);return false;
        }finally{__CLR4_5_279r79rlvl9eiat.R.flushNeeded();}}
        private boolean nextFourEquals0x64582025orEof() throws IOException {try{__CLR4_5_279r79rlvl9eiat.R.inc(10165);
            __CLR4_5_279r79rlvl9eiat.R.inc(10166);return nextFourEqualsOrEof((byte) 100, (byte) 88, (byte) 32, (byte) 37);
        }finally{__CLR4_5_279r79rlvl9eiat.R.flushNeeded();}}


        private boolean nextFourEquals0x7FFE8001orEof() throws IOException {try{__CLR4_5_279r79rlvl9eiat.R.inc(10167);
            __CLR4_5_279r79rlvl9eiat.R.inc(10168);return nextFourEqualsOrEof((byte) 127, (byte) -2, (byte) -128, (byte) 1);
        }finally{__CLR4_5_279r79rlvl9eiat.R.flushNeeded();}}
        private boolean nextFourEqualsOrEof(byte a, byte b, byte c, byte d) throws IOException {try{__CLR4_5_279r79rlvl9eiat.R.inc(10169);
            __CLR4_5_279r79rlvl9eiat.R.inc(10170);if ((((buffer.limit() - inBufferPos >= 4)&&(__CLR4_5_279r79rlvl9eiat.R.iget(10171)!=0|true))||(__CLR4_5_279r79rlvl9eiat.R.iget(10172)==0&false))) {{
                __CLR4_5_279r79rlvl9eiat.R.inc(10173);if ((((((bufferStartPos + inBufferPos) % (1024 * 1024)) == 0)&&(__CLR4_5_279r79rlvl9eiat.R.iget(10174)!=0|true))||(__CLR4_5_279r79rlvl9eiat.R.iget(10175)==0&false))) {{
                    __CLR4_5_279r79rlvl9eiat.R.inc(10176);System.err.println("" + ((bufferStartPos + inBufferPos) / 1024 / 1024));
                }
                }__CLR4_5_279r79rlvl9eiat.R.inc(10177);return ((buffer.get(inBufferPos) ==  a /*0x7F */&&
                        buffer.get(inBufferPos + 1) == b/*0xfe*/ &&
                        buffer.get(inBufferPos + 2) == c /*0x80*/ &&
                        (buffer.get(inBufferPos + 3) == d)));
            } }else {{
                __CLR4_5_279r79rlvl9eiat.R.inc(10178);if ((((bufferStartPos + inBufferPos + 4 > dataEnd)&&(__CLR4_5_279r79rlvl9eiat.R.iget(10179)!=0|true))||(__CLR4_5_279r79rlvl9eiat.R.iget(10180)==0&false))) {{
                    __CLR4_5_279r79rlvl9eiat.R.inc(10181);return bufferStartPos + inBufferPos == dataEnd;
                } }else {{
                    __CLR4_5_279r79rlvl9eiat.R.inc(10182);bufferStartPos = start;
                    __CLR4_5_279r79rlvl9eiat.R.inc(10183);inBufferPos = 0;
                    __CLR4_5_279r79rlvl9eiat.R.inc(10184);fillBuffer();
                    __CLR4_5_279r79rlvl9eiat.R.inc(10185);return nextFourEquals0x7FFE8001();
                }
            }}
        }}finally{__CLR4_5_279r79rlvl9eiat.R.flushNeeded();}}


        private void discardByte() {try{__CLR4_5_279r79rlvl9eiat.R.inc(10186);
            __CLR4_5_279r79rlvl9eiat.R.inc(10187);inBufferPos += 1;
        }finally{__CLR4_5_279r79rlvl9eiat.R.flushNeeded();}}
        private void discardQWord() {try{__CLR4_5_279r79rlvl9eiat.R.inc(10188);
            __CLR4_5_279r79rlvl9eiat.R.inc(10189);inBufferPos += 4;
        }finally{__CLR4_5_279r79rlvl9eiat.R.flushNeeded();}}


        private void discardNext4AndMarkStart() {try{__CLR4_5_279r79rlvl9eiat.R.inc(10190);
            __CLR4_5_279r79rlvl9eiat.R.inc(10191);start = bufferStartPos + inBufferPos;
            __CLR4_5_279r79rlvl9eiat.R.inc(10192);inBufferPos += 4;
        }finally{__CLR4_5_279r79rlvl9eiat.R.flushNeeded();}}

        private ByteBuffer getSample() {try{__CLR4_5_279r79rlvl9eiat.R.inc(10193);
            __CLR4_5_279r79rlvl9eiat.R.inc(10194);if ((((start >= bufferStartPos)&&(__CLR4_5_279r79rlvl9eiat.R.iget(10195)!=0|true))||(__CLR4_5_279r79rlvl9eiat.R.iget(10196)==0&false))) {{
                __CLR4_5_279r79rlvl9eiat.R.inc(10197);buffer.position((int) (start - bufferStartPos));
                __CLR4_5_279r79rlvl9eiat.R.inc(10198);Buffer sample = buffer.slice();
                __CLR4_5_279r79rlvl9eiat.R.inc(10199);sample.limit((int) (inBufferPos - (start - bufferStartPos)));
                __CLR4_5_279r79rlvl9eiat.R.inc(10200);return (ByteBuffer) sample;
            } }else {{
                __CLR4_5_279r79rlvl9eiat.R.inc(10201);throw new RuntimeException("damn! NAL exceeds buffer");
                // this can only happen if NAL is bigger than the buffer
            }

        }}finally{__CLR4_5_279r79rlvl9eiat.R.flushNeeded();}}
    }


}