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
public class MP3TrackImpl extends AbstractTrack {public static class __CLR4_5_28c88c8lvl9eigc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,10953,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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
        this(channel, "eng");__CLR4_5_28c88c8lvl9eigc.R.inc(10809);try{__CLR4_5_28c88c8lvl9eigc.R.inc(10808);
    }finally{__CLR4_5_28c88c8lvl9eigc.R.flushNeeded();}}

    public MP3TrackImpl(DataSource dataSource, String lang) throws IOException {
        super(dataSource.toString());__CLR4_5_28c88c8lvl9eigc.R.inc(10811);try{__CLR4_5_28c88c8lvl9eigc.R.inc(10810);
        __CLR4_5_28c88c8lvl9eigc.R.inc(10812);this.dataSource = dataSource;
        __CLR4_5_28c88c8lvl9eigc.R.inc(10813);samples = new LinkedList<Sample>();
        __CLR4_5_28c88c8lvl9eigc.R.inc(10814);firstHeader = readSamples(dataSource);

        __CLR4_5_28c88c8lvl9eigc.R.inc(10815);double packetsPerSecond = (double) firstHeader.sampleRate / SAMPLES_PER_FRAME;
        __CLR4_5_28c88c8lvl9eigc.R.inc(10816);double duration = samples.size() / packetsPerSecond;

        __CLR4_5_28c88c8lvl9eigc.R.inc(10817);long dataSize = 0;
        __CLR4_5_28c88c8lvl9eigc.R.inc(10818);LinkedList<Integer> queue = new LinkedList<Integer>();
        __CLR4_5_28c88c8lvl9eigc.R.inc(10819);for (Sample sample : samples) {{
            __CLR4_5_28c88c8lvl9eigc.R.inc(10820);int size = (int) sample.getSize();
            __CLR4_5_28c88c8lvl9eigc.R.inc(10821);dataSize += size;
            __CLR4_5_28c88c8lvl9eigc.R.inc(10822);queue.add(size);
            __CLR4_5_28c88c8lvl9eigc.R.inc(10823);while ((((queue.size() > packetsPerSecond)&&(__CLR4_5_28c88c8lvl9eigc.R.iget(10824)!=0|true))||(__CLR4_5_28c88c8lvl9eigc.R.iget(10825)==0&false))) {{
                __CLR4_5_28c88c8lvl9eigc.R.inc(10826);queue.pop();
            }
            }__CLR4_5_28c88c8lvl9eigc.R.inc(10827);if ((((queue.size() == (int) packetsPerSecond)&&(__CLR4_5_28c88c8lvl9eigc.R.iget(10828)!=0|true))||(__CLR4_5_28c88c8lvl9eigc.R.iget(10829)==0&false))) {{
                __CLR4_5_28c88c8lvl9eigc.R.inc(10830);int currSize = 0;
                __CLR4_5_28c88c8lvl9eigc.R.inc(10831);for (Integer aQueue : queue) {{
                    __CLR4_5_28c88c8lvl9eigc.R.inc(10832);currSize += aQueue;
                }
                }__CLR4_5_28c88c8lvl9eigc.R.inc(10833);double currBitRate = 8.0 * currSize / queue.size() * packetsPerSecond;
                __CLR4_5_28c88c8lvl9eigc.R.inc(10834);if ((((currBitRate > maxBitRate)&&(__CLR4_5_28c88c8lvl9eigc.R.iget(10835)!=0|true))||(__CLR4_5_28c88c8lvl9eigc.R.iget(10836)==0&false))) {{
                    __CLR4_5_28c88c8lvl9eigc.R.inc(10837);maxBitRate = (int) currBitRate;
                }
            }}
        }}

        }__CLR4_5_28c88c8lvl9eigc.R.inc(10838);avgBitRate = (int) (8 * dataSize / duration);

        __CLR4_5_28c88c8lvl9eigc.R.inc(10839);sampleDescriptionBox = new SampleDescriptionBox();
        __CLR4_5_28c88c8lvl9eigc.R.inc(10840);AudioSampleEntry audioSampleEntry = new AudioSampleEntry("mp4a");
        __CLR4_5_28c88c8lvl9eigc.R.inc(10841);audioSampleEntry.setChannelCount(firstHeader.channelCount);
        __CLR4_5_28c88c8lvl9eigc.R.inc(10842);audioSampleEntry.setSampleRate(firstHeader.sampleRate);
        __CLR4_5_28c88c8lvl9eigc.R.inc(10843);audioSampleEntry.setDataReferenceIndex(1);
        __CLR4_5_28c88c8lvl9eigc.R.inc(10844);audioSampleEntry.setSampleSize(16);


        __CLR4_5_28c88c8lvl9eigc.R.inc(10845);ESDescriptorBox esds = new ESDescriptorBox();
        __CLR4_5_28c88c8lvl9eigc.R.inc(10846);ESDescriptor descriptor = new ESDescriptor();
        __CLR4_5_28c88c8lvl9eigc.R.inc(10847);descriptor.setEsId(0);

        __CLR4_5_28c88c8lvl9eigc.R.inc(10848);SLConfigDescriptor slConfigDescriptor = new SLConfigDescriptor();
        __CLR4_5_28c88c8lvl9eigc.R.inc(10849);slConfigDescriptor.setPredefined(2);
        __CLR4_5_28c88c8lvl9eigc.R.inc(10850);descriptor.setSlConfigDescriptor(slConfigDescriptor);

        __CLR4_5_28c88c8lvl9eigc.R.inc(10851);DecoderConfigDescriptor decoderConfigDescriptor = new DecoderConfigDescriptor();
        __CLR4_5_28c88c8lvl9eigc.R.inc(10852);decoderConfigDescriptor.setObjectTypeIndication(ES_OBJECT_TYPE_INDICATION);
        __CLR4_5_28c88c8lvl9eigc.R.inc(10853);decoderConfigDescriptor.setStreamType(ES_STREAM_TYPE);
        __CLR4_5_28c88c8lvl9eigc.R.inc(10854);decoderConfigDescriptor.setMaxBitRate(maxBitRate);
        __CLR4_5_28c88c8lvl9eigc.R.inc(10855);decoderConfigDescriptor.setAvgBitRate(avgBitRate);
        __CLR4_5_28c88c8lvl9eigc.R.inc(10856);descriptor.setDecoderConfigDescriptor(decoderConfigDescriptor);

        __CLR4_5_28c88c8lvl9eigc.R.inc(10857);ByteBuffer data = descriptor.serialize();
        __CLR4_5_28c88c8lvl9eigc.R.inc(10858);esds.setData(data);
        __CLR4_5_28c88c8lvl9eigc.R.inc(10859);audioSampleEntry.addBox(esds);
        __CLR4_5_28c88c8lvl9eigc.R.inc(10860);sampleDescriptionBox.addBox(audioSampleEntry);

        __CLR4_5_28c88c8lvl9eigc.R.inc(10861);trackMetaData.setCreationTime(new Date());
        __CLR4_5_28c88c8lvl9eigc.R.inc(10862);trackMetaData.setModificationTime(new Date());
        __CLR4_5_28c88c8lvl9eigc.R.inc(10863);trackMetaData.setLanguage(lang);
        __CLR4_5_28c88c8lvl9eigc.R.inc(10864);trackMetaData.setVolume(1);
        __CLR4_5_28c88c8lvl9eigc.R.inc(10865);trackMetaData.setTimescale(firstHeader.sampleRate); // Audio tracks always use sampleRate as timescale
        __CLR4_5_28c88c8lvl9eigc.R.inc(10866);durations = new long[samples.size()];
        __CLR4_5_28c88c8lvl9eigc.R.inc(10867);Arrays.fill(durations, SAMPLES_PER_FRAME);
    }finally{__CLR4_5_28c88c8lvl9eigc.R.flushNeeded();}}

    public void close() throws IOException {try{__CLR4_5_28c88c8lvl9eigc.R.inc(10868);
        __CLR4_5_28c88c8lvl9eigc.R.inc(10869);dataSource.close();
    }finally{__CLR4_5_28c88c8lvl9eigc.R.flushNeeded();}}

    public SampleDescriptionBox getSampleDescriptionBox() {try{__CLR4_5_28c88c8lvl9eigc.R.inc(10870);
        __CLR4_5_28c88c8lvl9eigc.R.inc(10871);return sampleDescriptionBox;
    }finally{__CLR4_5_28c88c8lvl9eigc.R.flushNeeded();}}

    public long[] getSampleDurations() {try{__CLR4_5_28c88c8lvl9eigc.R.inc(10872);
        __CLR4_5_28c88c8lvl9eigc.R.inc(10873);return durations;
    }finally{__CLR4_5_28c88c8lvl9eigc.R.flushNeeded();}}

    public TrackMetaData getTrackMetaData() {try{__CLR4_5_28c88c8lvl9eigc.R.inc(10874);
        __CLR4_5_28c88c8lvl9eigc.R.inc(10875);return trackMetaData;
    }finally{__CLR4_5_28c88c8lvl9eigc.R.flushNeeded();}}

    public String getHandler() {try{__CLR4_5_28c88c8lvl9eigc.R.inc(10876);
        __CLR4_5_28c88c8lvl9eigc.R.inc(10877);return "soun";
    }finally{__CLR4_5_28c88c8lvl9eigc.R.flushNeeded();}}

    public List<Sample> getSamples() {try{__CLR4_5_28c88c8lvl9eigc.R.inc(10878);
        __CLR4_5_28c88c8lvl9eigc.R.inc(10879);return samples;
    }finally{__CLR4_5_28c88c8lvl9eigc.R.flushNeeded();}}

    private MP3Header readSamples(DataSource channel) throws IOException {try{__CLR4_5_28c88c8lvl9eigc.R.inc(10880);
        __CLR4_5_28c88c8lvl9eigc.R.inc(10881);MP3Header first = null;
        __CLR4_5_28c88c8lvl9eigc.R.inc(10882);while (true) {{
            __CLR4_5_28c88c8lvl9eigc.R.inc(10883);long pos = channel.position();
            __CLR4_5_28c88c8lvl9eigc.R.inc(10884);MP3Header hdr;
            __CLR4_5_28c88c8lvl9eigc.R.inc(10885);if ((hdr = readMP3Header(channel)) == null)
                {__CLR4_5_28c88c8lvl9eigc.R.inc(10888);break;
            }__CLR4_5_28c88c8lvl9eigc.R.inc(10889);if ((((first == null)&&(__CLR4_5_28c88c8lvl9eigc.R.iget(10890)!=0|true))||(__CLR4_5_28c88c8lvl9eigc.R.iget(10891)==0&false)))
                {__CLR4_5_28c88c8lvl9eigc.R.inc(10892);first = hdr;
            }__CLR4_5_28c88c8lvl9eigc.R.inc(10893);channel.position(pos);
            __CLR4_5_28c88c8lvl9eigc.R.inc(10894);ByteBuffer data = ByteBuffer.allocate(hdr.getFrameLength());
            __CLR4_5_28c88c8lvl9eigc.R.inc(10895);channel.read(data);
            __CLR4_5_28c88c8lvl9eigc.R.inc(10896);data.rewind();
            __CLR4_5_28c88c8lvl9eigc.R.inc(10897);samples.add(new SampleImpl(data));
        }
        }__CLR4_5_28c88c8lvl9eigc.R.inc(10898);return first;
    }finally{__CLR4_5_28c88c8lvl9eigc.R.flushNeeded();}}

    private MP3Header readMP3Header(DataSource channel) throws IOException {try{__CLR4_5_28c88c8lvl9eigc.R.inc(10899);
        __CLR4_5_28c88c8lvl9eigc.R.inc(10900);MP3Header hdr = new MP3Header();
        __CLR4_5_28c88c8lvl9eigc.R.inc(10901);ByteBuffer bb = ByteBuffer.allocate(4);
        __CLR4_5_28c88c8lvl9eigc.R.inc(10902);while ((((bb.position() < 4)&&(__CLR4_5_28c88c8lvl9eigc.R.iget(10903)!=0|true))||(__CLR4_5_28c88c8lvl9eigc.R.iget(10904)==0&false))) {{
            __CLR4_5_28c88c8lvl9eigc.R.inc(10905);if ((((channel.read(bb) == -1)&&(__CLR4_5_28c88c8lvl9eigc.R.iget(10906)!=0|true))||(__CLR4_5_28c88c8lvl9eigc.R.iget(10907)==0&false))) {{
                __CLR4_5_28c88c8lvl9eigc.R.inc(10908);return null;
            }
        }}
        }__CLR4_5_28c88c8lvl9eigc.R.inc(10909);if ((((bb.get(0) == 0x54 && bb.get(1) == 0x41 && bb.get(2) == 0x47)&&(__CLR4_5_28c88c8lvl9eigc.R.iget(10910)!=0|true))||(__CLR4_5_28c88c8lvl9eigc.R.iget(10911)==0&false))) {{
            // encounter id3 tag. That's the end of the file.
            __CLR4_5_28c88c8lvl9eigc.R.inc(10912);return null;
        }

        }__CLR4_5_28c88c8lvl9eigc.R.inc(10913);BitReaderBuffer brb = new BitReaderBuffer((ByteBuffer) bb.rewind());
        __CLR4_5_28c88c8lvl9eigc.R.inc(10914);int sync = brb.readBits(11); // A
        __CLR4_5_28c88c8lvl9eigc.R.inc(10915);if ((((sync != 0x7ff)&&(__CLR4_5_28c88c8lvl9eigc.R.iget(10916)!=0|true))||(__CLR4_5_28c88c8lvl9eigc.R.iget(10917)==0&false)))
            {__CLR4_5_28c88c8lvl9eigc.R.inc(10918);throw new IOException("Expected Start Word 0x7ff");
        }__CLR4_5_28c88c8lvl9eigc.R.inc(10919);hdr.mpegVersion = brb.readBits(2); // B

        __CLR4_5_28c88c8lvl9eigc.R.inc(10920);if ((((hdr.mpegVersion != MPEG_V1)&&(__CLR4_5_28c88c8lvl9eigc.R.iget(10921)!=0|true))||(__CLR4_5_28c88c8lvl9eigc.R.iget(10922)==0&false)))
            {__CLR4_5_28c88c8lvl9eigc.R.inc(10923);throw new IOException("Expected MPEG Version 1 (ISO/IEC 11172-3)");

        }__CLR4_5_28c88c8lvl9eigc.R.inc(10924);hdr.layer = brb.readBits(2); // C

        __CLR4_5_28c88c8lvl9eigc.R.inc(10925);if ((((hdr.layer != MPEG_L3)&&(__CLR4_5_28c88c8lvl9eigc.R.iget(10926)!=0|true))||(__CLR4_5_28c88c8lvl9eigc.R.iget(10927)==0&false)))
            {__CLR4_5_28c88c8lvl9eigc.R.inc(10928);throw new IOException("Expected Layer III");

        }__CLR4_5_28c88c8lvl9eigc.R.inc(10929);hdr.protectionAbsent = brb.readBits(1); // D

        __CLR4_5_28c88c8lvl9eigc.R.inc(10930);hdr.bitRateIndex = brb.readBits(4); // E
        __CLR4_5_28c88c8lvl9eigc.R.inc(10931);hdr.bitRate = BIT_RATE[hdr.bitRateIndex];
        __CLR4_5_28c88c8lvl9eigc.R.inc(10932);if ((((hdr.bitRate == 0)&&(__CLR4_5_28c88c8lvl9eigc.R.iget(10933)!=0|true))||(__CLR4_5_28c88c8lvl9eigc.R.iget(10934)==0&false)))
            {__CLR4_5_28c88c8lvl9eigc.R.inc(10935);throw new IOException("Unexpected (free/bad) bit rate");

        }__CLR4_5_28c88c8lvl9eigc.R.inc(10936);hdr.sampleFrequencyIndex = brb.readBits(2);
        __CLR4_5_28c88c8lvl9eigc.R.inc(10937);hdr.sampleRate = SAMPLE_RATE[hdr.sampleFrequencyIndex]; // F
        __CLR4_5_28c88c8lvl9eigc.R.inc(10938);if ((((hdr.sampleRate == 0)&&(__CLR4_5_28c88c8lvl9eigc.R.iget(10939)!=0|true))||(__CLR4_5_28c88c8lvl9eigc.R.iget(10940)==0&false)))
            {__CLR4_5_28c88c8lvl9eigc.R.inc(10941);throw new IOException("Unexpected (reserved) sample rate frequency");

        }__CLR4_5_28c88c8lvl9eigc.R.inc(10942);hdr.padding = brb.readBits(1); // G padding
        __CLR4_5_28c88c8lvl9eigc.R.inc(10943);brb.readBits(1); // H private

        __CLR4_5_28c88c8lvl9eigc.R.inc(10944);hdr.channelMode = brb.readBits(2); // H
        __CLR4_5_28c88c8lvl9eigc.R.inc(10945);hdr.channelCount = (((hdr.channelMode == 3 )&&(__CLR4_5_28c88c8lvl9eigc.R.iget(10946)!=0|true))||(__CLR4_5_28c88c8lvl9eigc.R.iget(10947)==0&false))? 1 : 2;
        __CLR4_5_28c88c8lvl9eigc.R.inc(10948);return hdr;
    }finally{__CLR4_5_28c88c8lvl9eigc.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_5_28c88c8lvl9eigc.R.inc(10949);
        __CLR4_5_28c88c8lvl9eigc.R.inc(10950);return "MP3TrackImpl";
    }finally{__CLR4_5_28c88c8lvl9eigc.R.flushNeeded();}}

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

        int getFrameLength() {try{__CLR4_5_28c88c8lvl9eigc.R.inc(10951);
            __CLR4_5_28c88c8lvl9eigc.R.inc(10952);return 144 * bitRate / sampleRate + padding;
        }finally{__CLR4_5_28c88c8lvl9eigc.R.flushNeeded();}}
    }
}
