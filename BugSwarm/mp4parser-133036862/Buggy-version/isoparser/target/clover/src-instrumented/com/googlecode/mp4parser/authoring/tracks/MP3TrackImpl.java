/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.sampleentry.AudioSampleEntry;
import com.googlecode.mp4parser.DataSource;
import com.googlecode.mp4parser.authoring.AbstractTrack;
import com.googlecode.mp4parser.authoring.Sample;
import com.googlecode.mp4parser.authoring.SampleImpl;
import com.googlecode.mp4parser.authoring.TrackMetaData;
import com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBuffer;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.DecoderConfigDescriptor;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.SLConfigDescriptor;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * MPEG V1 Layer 3 Audio. Does not support IDv3 or any other tags. Only raw stream of MP3 frames.
 * See <a href="http://mpgedit.org/mpgedit/mpeg_format/mpeghdr.htm">http://mpgedit.org/mpgedit/mpeg_format/mpeghdr.htm</a>
 * for stream format description.
 *
 * @author Roman Elizarov
 */
public class MP3TrackImpl extends AbstractTrack {public static class __CLR4_5_28ev8evlvluli6h{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,11048,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final int MPEG_V1 = 0x3; // only support V1
    private static final int MPEG_L3 = 1; // only support L3
    private static final int[] SAMPLE_RATE = {44100, 48000, 32000, 0};
    private static final int[] BIT_RATE = {0, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 0};
    private static final int SAMPLES_PER_FRAME = 1152; // Samples per L3 frame

    private static final int ES_OBJECT_TYPE_INDICATION = 0x6b;
    private static final int ES_STREAM_TYPE = 5;
    private final DataSource dataSource;

    TrackMetaData trackMetaData = new TrackMetaData();
    SampleDescriptionBox sampleDescriptionBox;
    MP3Header firstHeader;

    long maxBitRate;
    long avgBitRate;

    private List<Sample> samples;
    private long[] durations;


    public MP3TrackImpl(DataSource channel) throws IOException {
        this(channel, "eng");__CLR4_5_28ev8evlvluli6h.R.inc(10904);try{__CLR4_5_28ev8evlvluli6h.R.inc(10903);
    }finally{__CLR4_5_28ev8evlvluli6h.R.flushNeeded();}}

    public MP3TrackImpl(DataSource dataSource, String lang) throws IOException {
        super(dataSource.toString());__CLR4_5_28ev8evlvluli6h.R.inc(10906);try{__CLR4_5_28ev8evlvluli6h.R.inc(10905);
        __CLR4_5_28ev8evlvluli6h.R.inc(10907);this.dataSource = dataSource;
        __CLR4_5_28ev8evlvluli6h.R.inc(10908);samples = new LinkedList<Sample>();
        __CLR4_5_28ev8evlvluli6h.R.inc(10909);firstHeader = readSamples(dataSource);

        __CLR4_5_28ev8evlvluli6h.R.inc(10910);double packetsPerSecond = (double) firstHeader.sampleRate / SAMPLES_PER_FRAME;
        __CLR4_5_28ev8evlvluli6h.R.inc(10911);double duration = samples.size() / packetsPerSecond;

        __CLR4_5_28ev8evlvluli6h.R.inc(10912);long dataSize = 0;
        __CLR4_5_28ev8evlvluli6h.R.inc(10913);LinkedList<Integer> queue = new LinkedList<Integer>();
        __CLR4_5_28ev8evlvluli6h.R.inc(10914);for (Sample sample : samples) {{
            __CLR4_5_28ev8evlvluli6h.R.inc(10915);int size = (int) sample.getSize();
            __CLR4_5_28ev8evlvluli6h.R.inc(10916);dataSize += size;
            __CLR4_5_28ev8evlvluli6h.R.inc(10917);queue.add(size);
            __CLR4_5_28ev8evlvluli6h.R.inc(10918);while ((((queue.size() > packetsPerSecond)&&(__CLR4_5_28ev8evlvluli6h.R.iget(10919)!=0|true))||(__CLR4_5_28ev8evlvluli6h.R.iget(10920)==0&false))) {{
                __CLR4_5_28ev8evlvluli6h.R.inc(10921);queue.pop();
            }
            }__CLR4_5_28ev8evlvluli6h.R.inc(10922);if ((((queue.size() == (int) packetsPerSecond)&&(__CLR4_5_28ev8evlvluli6h.R.iget(10923)!=0|true))||(__CLR4_5_28ev8evlvluli6h.R.iget(10924)==0&false))) {{
                __CLR4_5_28ev8evlvluli6h.R.inc(10925);int currSize = 0;
                __CLR4_5_28ev8evlvluli6h.R.inc(10926);for (Integer aQueue : queue) {{
                    __CLR4_5_28ev8evlvluli6h.R.inc(10927);currSize += aQueue;
                }
                }__CLR4_5_28ev8evlvluli6h.R.inc(10928);double currBitRate = 8.0 * currSize / queue.size() * packetsPerSecond;
                __CLR4_5_28ev8evlvluli6h.R.inc(10929);if ((((currBitRate > maxBitRate)&&(__CLR4_5_28ev8evlvluli6h.R.iget(10930)!=0|true))||(__CLR4_5_28ev8evlvluli6h.R.iget(10931)==0&false))) {{
                    __CLR4_5_28ev8evlvluli6h.R.inc(10932);maxBitRate = (int) currBitRate;
                }
            }}
        }}

        }__CLR4_5_28ev8evlvluli6h.R.inc(10933);avgBitRate = (int) (8 * dataSize / duration);

        __CLR4_5_28ev8evlvluli6h.R.inc(10934);sampleDescriptionBox = new SampleDescriptionBox();
        __CLR4_5_28ev8evlvluli6h.R.inc(10935);AudioSampleEntry audioSampleEntry = new AudioSampleEntry("mp4a");
        __CLR4_5_28ev8evlvluli6h.R.inc(10936);audioSampleEntry.setChannelCount(firstHeader.channelCount);
        __CLR4_5_28ev8evlvluli6h.R.inc(10937);audioSampleEntry.setSampleRate(firstHeader.sampleRate);
        __CLR4_5_28ev8evlvluli6h.R.inc(10938);audioSampleEntry.setDataReferenceIndex(1);
        __CLR4_5_28ev8evlvluli6h.R.inc(10939);audioSampleEntry.setSampleSize(16);


        __CLR4_5_28ev8evlvluli6h.R.inc(10940);ESDescriptorBox esds = new ESDescriptorBox();
        __CLR4_5_28ev8evlvluli6h.R.inc(10941);ESDescriptor descriptor = new ESDescriptor();
        __CLR4_5_28ev8evlvluli6h.R.inc(10942);descriptor.setEsId(0);

        __CLR4_5_28ev8evlvluli6h.R.inc(10943);SLConfigDescriptor slConfigDescriptor = new SLConfigDescriptor();
        __CLR4_5_28ev8evlvluli6h.R.inc(10944);slConfigDescriptor.setPredefined(2);
        __CLR4_5_28ev8evlvluli6h.R.inc(10945);descriptor.setSlConfigDescriptor(slConfigDescriptor);

        __CLR4_5_28ev8evlvluli6h.R.inc(10946);DecoderConfigDescriptor decoderConfigDescriptor = new DecoderConfigDescriptor();
        __CLR4_5_28ev8evlvluli6h.R.inc(10947);decoderConfigDescriptor.setObjectTypeIndication(ES_OBJECT_TYPE_INDICATION);
        __CLR4_5_28ev8evlvluli6h.R.inc(10948);decoderConfigDescriptor.setStreamType(ES_STREAM_TYPE);
        __CLR4_5_28ev8evlvluli6h.R.inc(10949);decoderConfigDescriptor.setMaxBitRate(maxBitRate);
        __CLR4_5_28ev8evlvluli6h.R.inc(10950);decoderConfigDescriptor.setAvgBitRate(avgBitRate);
        __CLR4_5_28ev8evlvluli6h.R.inc(10951);descriptor.setDecoderConfigDescriptor(decoderConfigDescriptor);

        __CLR4_5_28ev8evlvluli6h.R.inc(10952);ByteBuffer data = descriptor.serialize();
        __CLR4_5_28ev8evlvluli6h.R.inc(10953);esds.setData(data);
        __CLR4_5_28ev8evlvluli6h.R.inc(10954);audioSampleEntry.addBox(esds);
        __CLR4_5_28ev8evlvluli6h.R.inc(10955);sampleDescriptionBox.addBox(audioSampleEntry);

        __CLR4_5_28ev8evlvluli6h.R.inc(10956);trackMetaData.setCreationTime(new Date());
        __CLR4_5_28ev8evlvluli6h.R.inc(10957);trackMetaData.setModificationTime(new Date());
        __CLR4_5_28ev8evlvluli6h.R.inc(10958);trackMetaData.setLanguage(lang);
        __CLR4_5_28ev8evlvluli6h.R.inc(10959);trackMetaData.setVolume(1);
        __CLR4_5_28ev8evlvluli6h.R.inc(10960);trackMetaData.setTimescale(firstHeader.sampleRate); // Audio tracks always use sampleRate as timescale
        __CLR4_5_28ev8evlvluli6h.R.inc(10961);durations = new long[samples.size()];
        __CLR4_5_28ev8evlvluli6h.R.inc(10962);Arrays.fill(durations, SAMPLES_PER_FRAME);
    }finally{__CLR4_5_28ev8evlvluli6h.R.flushNeeded();}}

    public void close() throws IOException {try{__CLR4_5_28ev8evlvluli6h.R.inc(10963);
        __CLR4_5_28ev8evlvluli6h.R.inc(10964);dataSource.close();
    }finally{__CLR4_5_28ev8evlvluli6h.R.flushNeeded();}}

    public SampleDescriptionBox getSampleDescriptionBox() {try{__CLR4_5_28ev8evlvluli6h.R.inc(10965);
        __CLR4_5_28ev8evlvluli6h.R.inc(10966);return sampleDescriptionBox;
    }finally{__CLR4_5_28ev8evlvluli6h.R.flushNeeded();}}

    public long[] getSampleDurations() {try{__CLR4_5_28ev8evlvluli6h.R.inc(10967);
        __CLR4_5_28ev8evlvluli6h.R.inc(10968);return durations;
    }finally{__CLR4_5_28ev8evlvluli6h.R.flushNeeded();}}

    public TrackMetaData getTrackMetaData() {try{__CLR4_5_28ev8evlvluli6h.R.inc(10969);
        __CLR4_5_28ev8evlvluli6h.R.inc(10970);return trackMetaData;
    }finally{__CLR4_5_28ev8evlvluli6h.R.flushNeeded();}}

    public String getHandler() {try{__CLR4_5_28ev8evlvluli6h.R.inc(10971);
        __CLR4_5_28ev8evlvluli6h.R.inc(10972);return "soun";
    }finally{__CLR4_5_28ev8evlvluli6h.R.flushNeeded();}}

    public List<Sample> getSamples() {try{__CLR4_5_28ev8evlvluli6h.R.inc(10973);
        __CLR4_5_28ev8evlvluli6h.R.inc(10974);return samples;
    }finally{__CLR4_5_28ev8evlvluli6h.R.flushNeeded();}}

    private MP3Header readSamples(DataSource channel) throws IOException {try{__CLR4_5_28ev8evlvluli6h.R.inc(10975);
        __CLR4_5_28ev8evlvluli6h.R.inc(10976);MP3Header first = null;
        __CLR4_5_28ev8evlvluli6h.R.inc(10977);while (true) {{
            __CLR4_5_28ev8evlvluli6h.R.inc(10978);long pos = channel.position();
            __CLR4_5_28ev8evlvluli6h.R.inc(10979);MP3Header hdr;
            __CLR4_5_28ev8evlvluli6h.R.inc(10980);if ((hdr = readMP3Header(channel)) == null)
                {__CLR4_5_28ev8evlvluli6h.R.inc(10983);break;
            }__CLR4_5_28ev8evlvluli6h.R.inc(10984);if ((((first == null)&&(__CLR4_5_28ev8evlvluli6h.R.iget(10985)!=0|true))||(__CLR4_5_28ev8evlvluli6h.R.iget(10986)==0&false)))
                {__CLR4_5_28ev8evlvluli6h.R.inc(10987);first = hdr;
            }__CLR4_5_28ev8evlvluli6h.R.inc(10988);channel.position(pos);
            __CLR4_5_28ev8evlvluli6h.R.inc(10989);ByteBuffer data = ByteBuffer.allocate(hdr.getFrameLength());
            __CLR4_5_28ev8evlvluli6h.R.inc(10990);channel.read(data);
            __CLR4_5_28ev8evlvluli6h.R.inc(10991);data.rewind();
            __CLR4_5_28ev8evlvluli6h.R.inc(10992);samples.add(new SampleImpl(data));
        }
        }__CLR4_5_28ev8evlvluli6h.R.inc(10993);return first;
    }finally{__CLR4_5_28ev8evlvluli6h.R.flushNeeded();}}

    private MP3Header readMP3Header(DataSource channel) throws IOException {try{__CLR4_5_28ev8evlvluli6h.R.inc(10994);
        __CLR4_5_28ev8evlvluli6h.R.inc(10995);MP3Header hdr = new MP3Header();
        __CLR4_5_28ev8evlvluli6h.R.inc(10996);ByteBuffer bb = ByteBuffer.allocate(4);
        __CLR4_5_28ev8evlvluli6h.R.inc(10997);while ((((bb.position() < 4)&&(__CLR4_5_28ev8evlvluli6h.R.iget(10998)!=0|true))||(__CLR4_5_28ev8evlvluli6h.R.iget(10999)==0&false))) {{
            __CLR4_5_28ev8evlvluli6h.R.inc(11000);if ((((channel.read(bb) == -1)&&(__CLR4_5_28ev8evlvluli6h.R.iget(11001)!=0|true))||(__CLR4_5_28ev8evlvluli6h.R.iget(11002)==0&false))) {{
                __CLR4_5_28ev8evlvluli6h.R.inc(11003);return null;
            }
        }}
        }__CLR4_5_28ev8evlvluli6h.R.inc(11004);if ((((bb.get(0) == 0x54 && bb.get(1) == 0x41 && bb.get(2) == 0x47)&&(__CLR4_5_28ev8evlvluli6h.R.iget(11005)!=0|true))||(__CLR4_5_28ev8evlvluli6h.R.iget(11006)==0&false))) {{
            // encounter id3 tag. That's the end of the file.
            __CLR4_5_28ev8evlvluli6h.R.inc(11007);return null;
        }

        }__CLR4_5_28ev8evlvluli6h.R.inc(11008);BitReaderBuffer brb = new BitReaderBuffer((ByteBuffer) bb.rewind());
        __CLR4_5_28ev8evlvluli6h.R.inc(11009);int sync = brb.readBits(11); // A
        __CLR4_5_28ev8evlvluli6h.R.inc(11010);if ((((sync != 0x7ff)&&(__CLR4_5_28ev8evlvluli6h.R.iget(11011)!=0|true))||(__CLR4_5_28ev8evlvluli6h.R.iget(11012)==0&false)))
            {__CLR4_5_28ev8evlvluli6h.R.inc(11013);throw new IOException("Expected Start Word 0x7ff");
        }__CLR4_5_28ev8evlvluli6h.R.inc(11014);hdr.mpegVersion = brb.readBits(2); // B

        __CLR4_5_28ev8evlvluli6h.R.inc(11015);if ((((hdr.mpegVersion != MPEG_V1)&&(__CLR4_5_28ev8evlvluli6h.R.iget(11016)!=0|true))||(__CLR4_5_28ev8evlvluli6h.R.iget(11017)==0&false)))
            {__CLR4_5_28ev8evlvluli6h.R.inc(11018);throw new IOException("Expected MPEG Version 1 (ISO/IEC 11172-3)");

        }__CLR4_5_28ev8evlvluli6h.R.inc(11019);hdr.layer = brb.readBits(2); // C

        __CLR4_5_28ev8evlvluli6h.R.inc(11020);if ((((hdr.layer != MPEG_L3)&&(__CLR4_5_28ev8evlvluli6h.R.iget(11021)!=0|true))||(__CLR4_5_28ev8evlvluli6h.R.iget(11022)==0&false)))
            {__CLR4_5_28ev8evlvluli6h.R.inc(11023);throw new IOException("Expected Layer III");

        }__CLR4_5_28ev8evlvluli6h.R.inc(11024);hdr.protectionAbsent = brb.readBits(1); // D

        __CLR4_5_28ev8evlvluli6h.R.inc(11025);hdr.bitRateIndex = brb.readBits(4); // E
        __CLR4_5_28ev8evlvluli6h.R.inc(11026);hdr.bitRate = BIT_RATE[hdr.bitRateIndex];
        __CLR4_5_28ev8evlvluli6h.R.inc(11027);if ((((hdr.bitRate == 0)&&(__CLR4_5_28ev8evlvluli6h.R.iget(11028)!=0|true))||(__CLR4_5_28ev8evlvluli6h.R.iget(11029)==0&false)))
            {__CLR4_5_28ev8evlvluli6h.R.inc(11030);throw new IOException("Unexpected (free/bad) bit rate");

        }__CLR4_5_28ev8evlvluli6h.R.inc(11031);hdr.sampleFrequencyIndex = brb.readBits(2);
        __CLR4_5_28ev8evlvluli6h.R.inc(11032);hdr.sampleRate = SAMPLE_RATE[hdr.sampleFrequencyIndex]; // F
        __CLR4_5_28ev8evlvluli6h.R.inc(11033);if ((((hdr.sampleRate == 0)&&(__CLR4_5_28ev8evlvluli6h.R.iget(11034)!=0|true))||(__CLR4_5_28ev8evlvluli6h.R.iget(11035)==0&false)))
            {__CLR4_5_28ev8evlvluli6h.R.inc(11036);throw new IOException("Unexpected (reserved) sample rate frequency");

        }__CLR4_5_28ev8evlvluli6h.R.inc(11037);hdr.padding = brb.readBits(1); // G padding
        __CLR4_5_28ev8evlvluli6h.R.inc(11038);brb.readBits(1); // H private

        __CLR4_5_28ev8evlvluli6h.R.inc(11039);hdr.channelMode = brb.readBits(2); // H
        __CLR4_5_28ev8evlvluli6h.R.inc(11040);hdr.channelCount = (((hdr.channelMode == 3 )&&(__CLR4_5_28ev8evlvluli6h.R.iget(11041)!=0|true))||(__CLR4_5_28ev8evlvluli6h.R.iget(11042)==0&false))? 1 : 2;
        __CLR4_5_28ev8evlvluli6h.R.inc(11043);return hdr;
    }finally{__CLR4_5_28ev8evlvluli6h.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_5_28ev8evlvluli6h.R.inc(11044);
        __CLR4_5_28ev8evlvluli6h.R.inc(11045);return "MP3TrackImpl";
    }finally{__CLR4_5_28ev8evlvluli6h.R.flushNeeded();}}

    class MP3Header {
        int mpegVersion;
        int layer;
        int protectionAbsent;

        int bitRateIndex;
        int bitRate;

        int sampleFrequencyIndex;
        int sampleRate;

        int padding;

        int channelMode;
        int channelCount;

        int getFrameLength() {try{__CLR4_5_28ev8evlvluli6h.R.inc(11046);
            __CLR4_5_28ev8evlvluli6h.R.inc(11047);return 144 * bitRate / sampleRate + padding;
        }finally{__CLR4_5_28ev8evlvluli6h.R.flushNeeded();}}
    }
}
