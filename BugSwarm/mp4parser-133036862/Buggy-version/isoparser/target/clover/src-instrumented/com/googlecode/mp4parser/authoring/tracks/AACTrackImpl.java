/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2012 castLabs GmbH, Berlin
 *
 * Licensed under the Apache License, Version 2.0 (the License);
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an AS IS BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.googlecode.mp4parser.authoring.tracks;

import com.googlecode.mp4parser.DataSource;
import com.coremedia.iso.boxes.*;
import com.coremedia.iso.boxes.sampleentry.AudioSampleEntry;
import com.googlecode.mp4parser.authoring.AbstractTrack;
import com.googlecode.mp4parser.authoring.Sample;
import com.googlecode.mp4parser.authoring.SampleImpl;
import com.googlecode.mp4parser.authoring.TrackMetaData;
import com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.*;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.*;

/**
 */
public class AACTrackImpl extends AbstractTrack {public static class __CLR4_5_25yw5ywlvlulgfi{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,7967,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    static Map<Integer, String> audioObjectTypes = new HashMap<Integer, String>();

    static {try{__CLR4_5_25yw5ywlvlulgfi.R.inc(7736);
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7737);audioObjectTypes.put(1, "AAC Main");
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7738);audioObjectTypes.put(2, "AAC LC (Low Complexity)");
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7739);audioObjectTypes.put(3, "AAC SSR (Scalable Sample Rate)");
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7740);audioObjectTypes.put(4, "AAC LTP (Long Term Prediction)");
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7741);audioObjectTypes.put(5, "SBR (Spectral Band Replication)");
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7742);audioObjectTypes.put(6, "AAC Scalable");
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7743);audioObjectTypes.put(7, "TwinVQ");
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7744);audioObjectTypes.put(8, "CELP (Code Excited Linear Prediction)");
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7745);audioObjectTypes.put(9, "HXVC (Harmonic Vector eXcitation Coding)");
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7746);audioObjectTypes.put(10, "Reserved");
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7747);audioObjectTypes.put(11, "Reserved");
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7748);audioObjectTypes.put(12, "TTSI (Text-To-Speech Interface)");
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7749);audioObjectTypes.put(13, "Main Synthesis");
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7750);audioObjectTypes.put(14, "Wavetable Synthesis");
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7751);audioObjectTypes.put(15, "General MIDI");
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7752);audioObjectTypes.put(16, "Algorithmic Synthesis and Audio Effects");
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7753);audioObjectTypes.put(17, "ER (Error Resilient) AAC LC");
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7754);audioObjectTypes.put(18, "Reserved");
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7755);audioObjectTypes.put(19, "ER AAC LTP");
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7756);audioObjectTypes.put(20, "ER AAC Scalable");
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7757);audioObjectTypes.put(21, "ER TwinVQ");
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7758);audioObjectTypes.put(22, "ER BSAC (Bit-Sliced Arithmetic Coding)");
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7759);audioObjectTypes.put(23, "ER AAC LD (Low Delay)");
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7760);audioObjectTypes.put(24, "ER CELP");
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7761);audioObjectTypes.put(25, "ER HVXC");
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7762);audioObjectTypes.put(26, "ER HILN (Harmonic and Individual Lines plus Noise)");
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7763);audioObjectTypes.put(27, "ER Parametric");
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7764);audioObjectTypes.put(28, "SSC (SinuSoidal Coding)");
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7765);audioObjectTypes.put(29, "PS (Parametric Stereo)");
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7766);audioObjectTypes.put(30, "MPEG Surround");
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7767);audioObjectTypes.put(31, "(Escape value)");
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7768);audioObjectTypes.put(32, "Layer-1");
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7769);audioObjectTypes.put(33, "Layer-2");
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7770);audioObjectTypes.put(34, "Layer-3");
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7771);audioObjectTypes.put(35, "DST (Direct Stream Transfer)");
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7772);audioObjectTypes.put(36, "ALS (Audio Lossless)");
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7773);audioObjectTypes.put(37, "SLS (Scalable LosslesS)");
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7774);audioObjectTypes.put(38, "SLS non-core");
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7775);audioObjectTypes.put(39, "ER AAC ELD (Enhanced Low Delay)");
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7776);audioObjectTypes.put(40, "SMR (Symbolic Music Representation) Simple");
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7777);audioObjectTypes.put(41, "SMR Main");
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7778);audioObjectTypes.put(42, "USAC (Unified Speech and Audio Coding) (no SBR)");
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7779);audioObjectTypes.put(43, "SAOC (Spatial Audio Object Coding)");
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7780);audioObjectTypes.put(44, "LD MPEG Surround");
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7781);audioObjectTypes.put(45, "USAC");
    }finally{__CLR4_5_25yw5ywlvlulgfi.R.flushNeeded();}}

    public static Map<Integer, Integer> samplingFrequencyIndexMap = new HashMap<Integer, Integer>();

    static {try{__CLR4_5_25yw5ywlvlulgfi.R.inc(7782);
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7783);samplingFrequencyIndexMap.put(96000, 0);
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7784);samplingFrequencyIndexMap.put(88200, 1);
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7785);samplingFrequencyIndexMap.put(64000, 2);
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7786);samplingFrequencyIndexMap.put(48000, 3);
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7787);samplingFrequencyIndexMap.put(44100, 4);
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7788);samplingFrequencyIndexMap.put(32000, 5);
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7789);samplingFrequencyIndexMap.put(24000, 6);
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7790);samplingFrequencyIndexMap.put(22050, 7);
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7791);samplingFrequencyIndexMap.put(16000, 8);
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7792);samplingFrequencyIndexMap.put(12000, 9);
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7793);samplingFrequencyIndexMap.put(11025, 10);
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7794);samplingFrequencyIndexMap.put(8000, 11);
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7795);samplingFrequencyIndexMap.put(0x0, 96000);
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7796);samplingFrequencyIndexMap.put(0x1, 88200);
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7797);samplingFrequencyIndexMap.put(0x2, 64000);
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7798);samplingFrequencyIndexMap.put(0x3, 48000);
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7799);samplingFrequencyIndexMap.put(0x4, 44100);
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7800);samplingFrequencyIndexMap.put(0x5, 32000);
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7801);samplingFrequencyIndexMap.put(0x6, 24000);
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7802);samplingFrequencyIndexMap.put(0x7, 22050);
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7803);samplingFrequencyIndexMap.put(0x8, 16000);
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7804);samplingFrequencyIndexMap.put(0x9, 12000);
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7805);samplingFrequencyIndexMap.put(0xa, 11025);
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7806);samplingFrequencyIndexMap.put(0xb, 8000);
    }finally{__CLR4_5_25yw5ywlvlulgfi.R.flushNeeded();}}

    TrackMetaData trackMetaData = new TrackMetaData();
    SampleDescriptionBox sampleDescriptionBox;
    long[] decTimes;
    AdtsHeader firstHeader;

    int bufferSizeDB;
    long maxBitRate;
    long avgBitRate;

    private DataSource dataSource;
    private List<Sample> samples;
    private String lang = "eng";

    public void close() throws IOException {try{__CLR4_5_25yw5ywlvlulgfi.R.inc(7807);
        // doing everything to get rid of references to memory mapped things
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7808);dataSource.close();
    }finally{__CLR4_5_25yw5ywlvlulgfi.R.flushNeeded();}}

    public AACTrackImpl(DataSource dataSource) throws IOException {
        this(dataSource, "eng");__CLR4_5_25yw5ywlvlulgfi.R.inc(7810);try{__CLR4_5_25yw5ywlvlulgfi.R.inc(7809);
    }finally{__CLR4_5_25yw5ywlvlulgfi.R.flushNeeded();}}
    public AACTrackImpl(DataSource dataSource, String lang) throws IOException {
        super(dataSource.toString());__CLR4_5_25yw5ywlvlulgfi.R.inc(7812);try{__CLR4_5_25yw5ywlvlulgfi.R.inc(7811);
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7813);this.lang = lang;
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7814);this.dataSource = dataSource;
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7815);samples = new ArrayList<Sample>();
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7816);firstHeader = readSamples(dataSource);

        __CLR4_5_25yw5ywlvlulgfi.R.inc(7817);double packetsPerSecond = (double) firstHeader.sampleRate / 1024.0;
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7818);double duration = samples.size() / packetsPerSecond;

        __CLR4_5_25yw5ywlvlulgfi.R.inc(7819);long dataSize = 0;
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7820);LinkedList<Integer> queue = new LinkedList<Integer>();
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7821);for (Sample sample : samples) {{
            __CLR4_5_25yw5ywlvlulgfi.R.inc(7822);int size = (int) sample.getSize();
            __CLR4_5_25yw5ywlvlulgfi.R.inc(7823);dataSize += size;
            __CLR4_5_25yw5ywlvlulgfi.R.inc(7824);queue.add(size);
            __CLR4_5_25yw5ywlvlulgfi.R.inc(7825);while ((((queue.size() > packetsPerSecond)&&(__CLR4_5_25yw5ywlvlulgfi.R.iget(7826)!=0|true))||(__CLR4_5_25yw5ywlvlulgfi.R.iget(7827)==0&false))) {{
                __CLR4_5_25yw5ywlvlulgfi.R.inc(7828);queue.pop();
            }
            }__CLR4_5_25yw5ywlvlulgfi.R.inc(7829);if ((((queue.size() == (int) packetsPerSecond)&&(__CLR4_5_25yw5ywlvlulgfi.R.iget(7830)!=0|true))||(__CLR4_5_25yw5ywlvlulgfi.R.iget(7831)==0&false))) {{
                __CLR4_5_25yw5ywlvlulgfi.R.inc(7832);int currSize = 0;
                __CLR4_5_25yw5ywlvlulgfi.R.inc(7833);for (Integer aQueue : queue) {{
                    __CLR4_5_25yw5ywlvlulgfi.R.inc(7834);currSize += aQueue;
                }
                }__CLR4_5_25yw5ywlvlulgfi.R.inc(7835);double currBitrate = 8.0 * currSize / queue.size() * packetsPerSecond;
                __CLR4_5_25yw5ywlvlulgfi.R.inc(7836);if ((((currBitrate > maxBitRate)&&(__CLR4_5_25yw5ywlvlulgfi.R.iget(7837)!=0|true))||(__CLR4_5_25yw5ywlvlulgfi.R.iget(7838)==0&false))) {{
                    __CLR4_5_25yw5ywlvlulgfi.R.inc(7839);maxBitRate = (int) currBitrate;
                }
            }}
        }}

        }__CLR4_5_25yw5ywlvlulgfi.R.inc(7840);avgBitRate = (int) (8 * dataSize / duration);

        __CLR4_5_25yw5ywlvlulgfi.R.inc(7841);bufferSizeDB = 1536; /* TODO: Calcultate this somehow! */

        __CLR4_5_25yw5ywlvlulgfi.R.inc(7842);sampleDescriptionBox = new SampleDescriptionBox();
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7843);AudioSampleEntry audioSampleEntry = new AudioSampleEntry("mp4a");
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7844);if ((((firstHeader.channelconfig == 7)&&(__CLR4_5_25yw5ywlvlulgfi.R.iget(7845)!=0|true))||(__CLR4_5_25yw5ywlvlulgfi.R.iget(7846)==0&false))) {{
            __CLR4_5_25yw5ywlvlulgfi.R.inc(7847);audioSampleEntry.setChannelCount(8);
        } }else {{
            __CLR4_5_25yw5ywlvlulgfi.R.inc(7848);audioSampleEntry.setChannelCount(firstHeader.channelconfig);
        }
        }__CLR4_5_25yw5ywlvlulgfi.R.inc(7849);audioSampleEntry.setSampleRate(firstHeader.sampleRate);
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7850);audioSampleEntry.setDataReferenceIndex(1);
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7851);audioSampleEntry.setSampleSize(16);


        __CLR4_5_25yw5ywlvlulgfi.R.inc(7852);ESDescriptorBox esds = new ESDescriptorBox();
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7853);ESDescriptor descriptor = new ESDescriptor();
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7854);descriptor.setEsId(0);

        __CLR4_5_25yw5ywlvlulgfi.R.inc(7855);SLConfigDescriptor slConfigDescriptor = new SLConfigDescriptor();
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7856);slConfigDescriptor.setPredefined(2);
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7857);descriptor.setSlConfigDescriptor(slConfigDescriptor);

        __CLR4_5_25yw5ywlvlulgfi.R.inc(7858);DecoderConfigDescriptor decoderConfigDescriptor = new DecoderConfigDescriptor();
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7859);decoderConfigDescriptor.setObjectTypeIndication(0x40);
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7860);decoderConfigDescriptor.setStreamType(5);
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7861);decoderConfigDescriptor.setBufferSizeDB(bufferSizeDB);
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7862);decoderConfigDescriptor.setMaxBitRate(maxBitRate);
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7863);decoderConfigDescriptor.setAvgBitRate(avgBitRate);

        __CLR4_5_25yw5ywlvlulgfi.R.inc(7864);AudioSpecificConfig audioSpecificConfig = new AudioSpecificConfig();
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7865);audioSpecificConfig.setOriginalAudioObjectType(2); // AAC LC
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7866);audioSpecificConfig.setSamplingFrequencyIndex(firstHeader.sampleFrequencyIndex);
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7867);audioSpecificConfig.setChannelConfiguration(firstHeader.channelconfig);
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7868);decoderConfigDescriptor.setAudioSpecificInfo(audioSpecificConfig);

        __CLR4_5_25yw5ywlvlulgfi.R.inc(7869);descriptor.setDecoderConfigDescriptor(decoderConfigDescriptor);

        __CLR4_5_25yw5ywlvlulgfi.R.inc(7870);esds.setEsDescriptor(descriptor);
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7871);audioSampleEntry.addBox(esds);
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7872);sampleDescriptionBox.addBox(audioSampleEntry);

        __CLR4_5_25yw5ywlvlulgfi.R.inc(7873);trackMetaData.setCreationTime(new Date());
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7874);trackMetaData.setModificationTime(new Date());
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7875);trackMetaData.setLanguage(lang);
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7876);trackMetaData.setVolume(1);
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7877);trackMetaData.setTimescale(firstHeader.sampleRate); // Audio tracks always use sampleRate as timescale
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7878);decTimes = new long[samples.size()];
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7879);Arrays.fill(decTimes, 1024);
    }finally{__CLR4_5_25yw5ywlvlulgfi.R.flushNeeded();}}

    public SampleDescriptionBox getSampleDescriptionBox() {try{__CLR4_5_25yw5ywlvlulgfi.R.inc(7880);
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7881);return sampleDescriptionBox;
    }finally{__CLR4_5_25yw5ywlvlulgfi.R.flushNeeded();}}

    public long[] getSampleDurations() {try{__CLR4_5_25yw5ywlvlulgfi.R.inc(7882);
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7883);return decTimes;
    }finally{__CLR4_5_25yw5ywlvlulgfi.R.flushNeeded();}}

    public List<CompositionTimeToSample.Entry> getCompositionTimeEntries() {try{__CLR4_5_25yw5ywlvlulgfi.R.inc(7884);
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7885);return null;
    }finally{__CLR4_5_25yw5ywlvlulgfi.R.flushNeeded();}}

    public long[] getSyncSamples() {try{__CLR4_5_25yw5ywlvlulgfi.R.inc(7886);
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7887);return null;
    }finally{__CLR4_5_25yw5ywlvlulgfi.R.flushNeeded();}}

    public List<SampleDependencyTypeBox.Entry> getSampleDependencies() {try{__CLR4_5_25yw5ywlvlulgfi.R.inc(7888);
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7889);return null;
    }finally{__CLR4_5_25yw5ywlvlulgfi.R.flushNeeded();}}

    public TrackMetaData getTrackMetaData() {try{__CLR4_5_25yw5ywlvlulgfi.R.inc(7890);
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7891);return trackMetaData;
    }finally{__CLR4_5_25yw5ywlvlulgfi.R.flushNeeded();}}

    public String getHandler() {try{__CLR4_5_25yw5ywlvlulgfi.R.inc(7892);
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7893);return "soun";
    }finally{__CLR4_5_25yw5ywlvlulgfi.R.flushNeeded();}}

    public List<Sample> getSamples() {try{__CLR4_5_25yw5ywlvlulgfi.R.inc(7894);
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7895);return samples;
    }finally{__CLR4_5_25yw5ywlvlulgfi.R.flushNeeded();}}

    public SubSampleInformationBox getSubsampleInformationBox() {try{__CLR4_5_25yw5ywlvlulgfi.R.inc(7896);
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7897);return null;
    }finally{__CLR4_5_25yw5ywlvlulgfi.R.flushNeeded();}}

    class AdtsHeader {
        int getSize() {try{__CLR4_5_25yw5ywlvlulgfi.R.inc(7898);
            __CLR4_5_25yw5ywlvlulgfi.R.inc(7899);return 7 + ((((protectionAbsent == 0 )&&(__CLR4_5_25yw5ywlvlulgfi.R.iget(7900)!=0|true))||(__CLR4_5_25yw5ywlvlulgfi.R.iget(7901)==0&false))? 2 : 0);
        }finally{__CLR4_5_25yw5ywlvlulgfi.R.flushNeeded();}}

        int sampleFrequencyIndex;

        int mpegVersion;
        int layer;
        int protectionAbsent;
        int profile;
        int sampleRate;

        int channelconfig;
        int original;
        int home;
        int copyrightedStream;
        int copyrightStart;
        int frameLength;
        int bufferFullness;
        int numAacFramesPerAdtsFrame;
    }

    private AdtsHeader readADTSHeader(DataSource channel) throws IOException {try{__CLR4_5_25yw5ywlvlulgfi.R.inc(7902);
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7903);AdtsHeader hdr = new AdtsHeader();
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7904);ByteBuffer bb = ByteBuffer.allocate(7);
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7905);while ((((bb.position() < 7)&&(__CLR4_5_25yw5ywlvlulgfi.R.iget(7906)!=0|true))||(__CLR4_5_25yw5ywlvlulgfi.R.iget(7907)==0&false))) {{
            __CLR4_5_25yw5ywlvlulgfi.R.inc(7908);if ((((channel.read(bb) == -1)&&(__CLR4_5_25yw5ywlvlulgfi.R.iget(7909)!=0|true))||(__CLR4_5_25yw5ywlvlulgfi.R.iget(7910)==0&false))) {{
                __CLR4_5_25yw5ywlvlulgfi.R.inc(7911);return null;
            }
        }}

        }__CLR4_5_25yw5ywlvlulgfi.R.inc(7912);BitReaderBuffer brb = new BitReaderBuffer((ByteBuffer) bb.rewind());
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7913);int syncword = brb.readBits(12); // A
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7914);if ((((syncword != 0xfff)&&(__CLR4_5_25yw5ywlvlulgfi.R.iget(7915)!=0|true))||(__CLR4_5_25yw5ywlvlulgfi.R.iget(7916)==0&false))) {{
            __CLR4_5_25yw5ywlvlulgfi.R.inc(7917);throw new IOException("Expected Start Word 0xfff");
        }
        }__CLR4_5_25yw5ywlvlulgfi.R.inc(7918);hdr.mpegVersion = brb.readBits(1); // B
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7919);hdr.layer = brb.readBits(2); // C
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7920);hdr.protectionAbsent = brb.readBits(1); // D
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7921);hdr.profile = brb.readBits(2) + 1;  // E
        //System.err.println(String.format("Profile %s", audioObjectTypes.get(hdr.profile)));
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7922);hdr.sampleFrequencyIndex = brb.readBits(4);
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7923);hdr.sampleRate = samplingFrequencyIndexMap.get(hdr.sampleFrequencyIndex); // F
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7924);brb.readBits(1); // G
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7925);hdr.channelconfig = brb.readBits(3); // H
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7926);hdr.original = brb.readBits(1); // I
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7927);hdr.home = brb.readBits(1); // J
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7928);hdr.copyrightedStream = brb.readBits(1); // K
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7929);hdr.copyrightStart = brb.readBits(1); // L
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7930);hdr.frameLength = brb.readBits(13); // M
        //System.err.println(hdr.frameLength);
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7931);hdr.bufferFullness = brb.readBits(11); // 54
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7932);hdr.numAacFramesPerAdtsFrame = brb.readBits(2) + 1; // 56
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7933);if ((((hdr.numAacFramesPerAdtsFrame != 1)&&(__CLR4_5_25yw5ywlvlulgfi.R.iget(7934)!=0|true))||(__CLR4_5_25yw5ywlvlulgfi.R.iget(7935)==0&false))) {{
            __CLR4_5_25yw5ywlvlulgfi.R.inc(7936);throw new IOException("This muxer can only work with 1 AAC frame per ADTS frame");
        }
        }__CLR4_5_25yw5ywlvlulgfi.R.inc(7937);if ((((hdr.protectionAbsent == 0)&&(__CLR4_5_25yw5ywlvlulgfi.R.iget(7938)!=0|true))||(__CLR4_5_25yw5ywlvlulgfi.R.iget(7939)==0&false))) {{
            __CLR4_5_25yw5ywlvlulgfi.R.inc(7940);channel.read(ByteBuffer.allocate(2));
        }
        }__CLR4_5_25yw5ywlvlulgfi.R.inc(7941);return hdr;
    }finally{__CLR4_5_25yw5ywlvlulgfi.R.flushNeeded();}}

    private AdtsHeader readSamples(DataSource channel) throws IOException {try{__CLR4_5_25yw5ywlvlulgfi.R.inc(7942);
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7943);AdtsHeader first = null;
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7944);AdtsHeader hdr;

        __CLR4_5_25yw5ywlvlulgfi.R.inc(7945);while ((hdr = readADTSHeader(channel)) != null) {{
            __CLR4_5_25yw5ywlvlulgfi.R.inc(7948);if ((((first == null)&&(__CLR4_5_25yw5ywlvlulgfi.R.iget(7949)!=0|true))||(__CLR4_5_25yw5ywlvlulgfi.R.iget(7950)==0&false))) {{
                __CLR4_5_25yw5ywlvlulgfi.R.inc(7951);first = hdr;
            }

            }__CLR4_5_25yw5ywlvlulgfi.R.inc(7952);final long currentPosition = channel.position();
            __CLR4_5_25yw5ywlvlulgfi.R.inc(7953);final long frameSize = hdr.frameLength - hdr.getSize();
            __CLR4_5_25yw5ywlvlulgfi.R.inc(7954);samples.add(new Sample() {
                public void writeTo(WritableByteChannel channel) throws IOException {try{__CLR4_5_25yw5ywlvlulgfi.R.inc(7955);
                    __CLR4_5_25yw5ywlvlulgfi.R.inc(7956);dataSource.transferTo(currentPosition, frameSize, channel);
                }finally{__CLR4_5_25yw5ywlvlulgfi.R.flushNeeded();}}

                public long getSize() {try{__CLR4_5_25yw5ywlvlulgfi.R.inc(7957);
                    __CLR4_5_25yw5ywlvlulgfi.R.inc(7958);return frameSize;
                }finally{__CLR4_5_25yw5ywlvlulgfi.R.flushNeeded();}}

                public ByteBuffer asByteBuffer() {try{__CLR4_5_25yw5ywlvlulgfi.R.inc(7959);
                    __CLR4_5_25yw5ywlvlulgfi.R.inc(7960);try {
                        __CLR4_5_25yw5ywlvlulgfi.R.inc(7961);return dataSource.map(currentPosition, frameSize);
                    } catch (IOException e) {
                        __CLR4_5_25yw5ywlvlulgfi.R.inc(7962);throw new RuntimeException(e);
                    }
                }finally{__CLR4_5_25yw5ywlvlulgfi.R.flushNeeded();}}
            });
            __CLR4_5_25yw5ywlvlulgfi.R.inc(7963);channel.position(channel.position() + hdr.frameLength - hdr.getSize());
        }
        }__CLR4_5_25yw5ywlvlulgfi.R.inc(7964);return first;
    }finally{__CLR4_5_25yw5ywlvlulgfi.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_5_25yw5ywlvlulgfi.R.inc(7965);
        __CLR4_5_25yw5ywlvlulgfi.R.inc(7966);return "AACTrackImpl{" +
                "sampleRate=" + firstHeader.sampleRate +
                ", channelconfig=" + firstHeader.channelconfig +
                '}';
    }finally{__CLR4_5_25yw5ywlvlulgfi.R.flushNeeded();}}
}

