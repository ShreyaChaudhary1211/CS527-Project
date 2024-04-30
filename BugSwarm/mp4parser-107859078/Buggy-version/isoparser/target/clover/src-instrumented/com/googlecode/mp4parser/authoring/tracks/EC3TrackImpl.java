/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.boxes.*;
import com.coremedia.iso.boxes.sampleentry.AudioSampleEntry;
import com.googlecode.mp4parser.DataSource;
import com.googlecode.mp4parser.authoring.AbstractTrack;
import com.googlecode.mp4parser.authoring.Sample;
import com.googlecode.mp4parser.authoring.SampleImpl;
import com.googlecode.mp4parser.authoring.TrackMetaData;
import com.googlecode.mp4parser.boxes.EC3SpecificBox;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBuffer;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.*;

import static com.googlecode.mp4parser.util.CastUtils.l2i;

/**
 * Created by IntelliJ IDEA.
 * User: magnus
 * Date: 2012-03-14
 * Time: 10:39
 * To change this template use File | Settings | File Templates.
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class EC3TrackImpl extends AbstractTrack {public static class __CLR4_5_27wv7wvlvl9eidd{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,10607,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final long MAX_FRAMES_PER_MMAP = 20;
    private final DataSource dataSource;
    TrackMetaData trackMetaData = new TrackMetaData();
    SampleDescriptionBox sampleDescriptionBox;

    private int bitrate;
    private int frameSize;

    private List<BitStreamInfo> bitStreamInfos = new LinkedList<BitStreamInfo>();
    private List<Sample> samples;
    private long[] decodingTimes;

    public EC3TrackImpl(DataSource dataSource) throws IOException {
        super(dataSource.toString());__CLR4_5_27wv7wvlvl9eidd.R.inc(10256);try{__CLR4_5_27wv7wvlvl9eidd.R.inc(10255);
        __CLR4_5_27wv7wvlvl9eidd.R.inc(10257);this.dataSource = dataSource;

        __CLR4_5_27wv7wvlvl9eidd.R.inc(10258);boolean done = false;

        __CLR4_5_27wv7wvlvl9eidd.R.inc(10259);while ((((!done)&&(__CLR4_5_27wv7wvlvl9eidd.R.iget(10260)!=0|true))||(__CLR4_5_27wv7wvlvl9eidd.R.iget(10261)==0&false))) {{
            __CLR4_5_27wv7wvlvl9eidd.R.inc(10262);BitStreamInfo bsi = readVariables();
            __CLR4_5_27wv7wvlvl9eidd.R.inc(10263);if ((((bsi == null)&&(__CLR4_5_27wv7wvlvl9eidd.R.iget(10264)!=0|true))||(__CLR4_5_27wv7wvlvl9eidd.R.iget(10265)==0&false))) {{
                __CLR4_5_27wv7wvlvl9eidd.R.inc(10266);throw new IOException();
            }
            }__CLR4_5_27wv7wvlvl9eidd.R.inc(10267);for (BitStreamInfo entry : bitStreamInfos) {{
                __CLR4_5_27wv7wvlvl9eidd.R.inc(10268);if ((((bsi.strmtyp != 1 && entry.substreamid == bsi.substreamid)&&(__CLR4_5_27wv7wvlvl9eidd.R.iget(10269)!=0|true))||(__CLR4_5_27wv7wvlvl9eidd.R.iget(10270)==0&false))) {{
                    __CLR4_5_27wv7wvlvl9eidd.R.inc(10271);done = true;
                }
            }}
            }__CLR4_5_27wv7wvlvl9eidd.R.inc(10272);if ((((!done)&&(__CLR4_5_27wv7wvlvl9eidd.R.iget(10273)!=0|true))||(__CLR4_5_27wv7wvlvl9eidd.R.iget(10274)==0&false))) {{
                __CLR4_5_27wv7wvlvl9eidd.R.inc(10275);bitStreamInfos.add(bsi);
            }
        }}


        }__CLR4_5_27wv7wvlvl9eidd.R.inc(10276);if ((((bitStreamInfos.size() == 0)&&(__CLR4_5_27wv7wvlvl9eidd.R.iget(10277)!=0|true))||(__CLR4_5_27wv7wvlvl9eidd.R.iget(10278)==0&false))) {{
            __CLR4_5_27wv7wvlvl9eidd.R.inc(10279);throw new IOException();
        }
        }__CLR4_5_27wv7wvlvl9eidd.R.inc(10280);int samplerate = bitStreamInfos.get(0).samplerate;

        __CLR4_5_27wv7wvlvl9eidd.R.inc(10281);sampleDescriptionBox = new SampleDescriptionBox();
        __CLR4_5_27wv7wvlvl9eidd.R.inc(10282);AudioSampleEntry audioSampleEntry = new AudioSampleEntry("ec-3");
        __CLR4_5_27wv7wvlvl9eidd.R.inc(10283);audioSampleEntry.setChannelCount(2);  // According to  ETSI TS 102 366 Annex F
        __CLR4_5_27wv7wvlvl9eidd.R.inc(10284);audioSampleEntry.setSampleRate(samplerate);
        __CLR4_5_27wv7wvlvl9eidd.R.inc(10285);audioSampleEntry.setDataReferenceIndex(1);
        __CLR4_5_27wv7wvlvl9eidd.R.inc(10286);audioSampleEntry.setSampleSize(16);

        __CLR4_5_27wv7wvlvl9eidd.R.inc(10287);EC3SpecificBox ec3 = new EC3SpecificBox();
        __CLR4_5_27wv7wvlvl9eidd.R.inc(10288);int[] deps = new int[bitStreamInfos.size()];
        __CLR4_5_27wv7wvlvl9eidd.R.inc(10289);int[] chan_locs = new int[bitStreamInfos.size()];
        __CLR4_5_27wv7wvlvl9eidd.R.inc(10290);for (BitStreamInfo bsi : bitStreamInfos) {{
            __CLR4_5_27wv7wvlvl9eidd.R.inc(10291);if ((((bsi.strmtyp == 1)&&(__CLR4_5_27wv7wvlvl9eidd.R.iget(10292)!=0|true))||(__CLR4_5_27wv7wvlvl9eidd.R.iget(10293)==0&false))) {{
                __CLR4_5_27wv7wvlvl9eidd.R.inc(10294);deps[bsi.substreamid]++;
                __CLR4_5_27wv7wvlvl9eidd.R.inc(10295);chan_locs[bsi.substreamid] = ((bsi.chanmap >> 6) & 0x100) | ((bsi.chanmap >> 5) & 0xff);
            }
        }}
        }__CLR4_5_27wv7wvlvl9eidd.R.inc(10296);for (BitStreamInfo bsi : bitStreamInfos) {{
            __CLR4_5_27wv7wvlvl9eidd.R.inc(10297);if ((((bsi.strmtyp != 1)&&(__CLR4_5_27wv7wvlvl9eidd.R.iget(10298)!=0|true))||(__CLR4_5_27wv7wvlvl9eidd.R.iget(10299)==0&false))) {{
                __CLR4_5_27wv7wvlvl9eidd.R.inc(10300);EC3SpecificBox.Entry e = new EC3SpecificBox.Entry();
                __CLR4_5_27wv7wvlvl9eidd.R.inc(10301);e.fscod = bsi.fscod;
                __CLR4_5_27wv7wvlvl9eidd.R.inc(10302);e.bsid = bsi.bsid;
                __CLR4_5_27wv7wvlvl9eidd.R.inc(10303);e.bsmod = bsi.bsmod;
                __CLR4_5_27wv7wvlvl9eidd.R.inc(10304);e.acmod = bsi.acmod;
                __CLR4_5_27wv7wvlvl9eidd.R.inc(10305);e.lfeon = bsi.lfeon;
                __CLR4_5_27wv7wvlvl9eidd.R.inc(10306);e.reserved = 0;
                __CLR4_5_27wv7wvlvl9eidd.R.inc(10307);e.num_dep_sub = deps[bsi.substreamid];
                __CLR4_5_27wv7wvlvl9eidd.R.inc(10308);e.chan_loc = chan_locs[bsi.substreamid];
                __CLR4_5_27wv7wvlvl9eidd.R.inc(10309);e.reserved2 = 0;
                __CLR4_5_27wv7wvlvl9eidd.R.inc(10310);ec3.addEntry(e);
            }
            }__CLR4_5_27wv7wvlvl9eidd.R.inc(10311);bitrate += bsi.bitrate;
            __CLR4_5_27wv7wvlvl9eidd.R.inc(10312);frameSize += bsi.frameSize;
        }

        }__CLR4_5_27wv7wvlvl9eidd.R.inc(10313);ec3.setDataRate(bitrate / 1000);
        __CLR4_5_27wv7wvlvl9eidd.R.inc(10314);audioSampleEntry.addBox(ec3);
        __CLR4_5_27wv7wvlvl9eidd.R.inc(10315);sampleDescriptionBox.addBox(audioSampleEntry);

        __CLR4_5_27wv7wvlvl9eidd.R.inc(10316);trackMetaData.setCreationTime(new Date());
        __CLR4_5_27wv7wvlvl9eidd.R.inc(10317);trackMetaData.setModificationTime(new Date());

        __CLR4_5_27wv7wvlvl9eidd.R.inc(10318);trackMetaData.setTimescale(samplerate); // Audio tracks always use samplerate as timescale
        __CLR4_5_27wv7wvlvl9eidd.R.inc(10319);trackMetaData.setVolume(1);

        __CLR4_5_27wv7wvlvl9eidd.R.inc(10320);dataSource.position(0);
        __CLR4_5_27wv7wvlvl9eidd.R.inc(10321);samples = readSamples();
        __CLR4_5_27wv7wvlvl9eidd.R.inc(10322);this.decodingTimes = new long[samples.size()];
        __CLR4_5_27wv7wvlvl9eidd.R.inc(10323);Arrays.fill(decodingTimes, 1536);
    }finally{__CLR4_5_27wv7wvlvl9eidd.R.flushNeeded();}}

    public void close() throws IOException {try{__CLR4_5_27wv7wvlvl9eidd.R.inc(10324);
        __CLR4_5_27wv7wvlvl9eidd.R.inc(10325);dataSource.close();
    }finally{__CLR4_5_27wv7wvlvl9eidd.R.flushNeeded();}}

    public List<Sample> getSamples() {try{__CLR4_5_27wv7wvlvl9eidd.R.inc(10326);

        __CLR4_5_27wv7wvlvl9eidd.R.inc(10327);return samples;
    }finally{__CLR4_5_27wv7wvlvl9eidd.R.flushNeeded();}}

    public SampleDescriptionBox getSampleDescriptionBox() {try{__CLR4_5_27wv7wvlvl9eidd.R.inc(10328);
        __CLR4_5_27wv7wvlvl9eidd.R.inc(10329);return sampleDescriptionBox;
    }finally{__CLR4_5_27wv7wvlvl9eidd.R.flushNeeded();}}

    public List<CompositionTimeToSample.Entry> getCompositionTimeEntries() {try{__CLR4_5_27wv7wvlvl9eidd.R.inc(10330);
        __CLR4_5_27wv7wvlvl9eidd.R.inc(10331);return null;
    }finally{__CLR4_5_27wv7wvlvl9eidd.R.flushNeeded();}}

    public long[] getSyncSamples() {try{__CLR4_5_27wv7wvlvl9eidd.R.inc(10332);
        __CLR4_5_27wv7wvlvl9eidd.R.inc(10333);return null;
    }finally{__CLR4_5_27wv7wvlvl9eidd.R.flushNeeded();}}

    public long[] getSampleDurations() {try{__CLR4_5_27wv7wvlvl9eidd.R.inc(10334);
        __CLR4_5_27wv7wvlvl9eidd.R.inc(10335);return decodingTimes;
    }finally{__CLR4_5_27wv7wvlvl9eidd.R.flushNeeded();}}

    public List<SampleDependencyTypeBox.Entry> getSampleDependencies() {try{__CLR4_5_27wv7wvlvl9eidd.R.inc(10336);
        __CLR4_5_27wv7wvlvl9eidd.R.inc(10337);return null;
    }finally{__CLR4_5_27wv7wvlvl9eidd.R.flushNeeded();}}

    public TrackMetaData getTrackMetaData() {try{__CLR4_5_27wv7wvlvl9eidd.R.inc(10338);
        __CLR4_5_27wv7wvlvl9eidd.R.inc(10339);return trackMetaData;
    }finally{__CLR4_5_27wv7wvlvl9eidd.R.flushNeeded();}}

    public String getHandler() {try{__CLR4_5_27wv7wvlvl9eidd.R.inc(10340);
        __CLR4_5_27wv7wvlvl9eidd.R.inc(10341);return "soun";
    }finally{__CLR4_5_27wv7wvlvl9eidd.R.flushNeeded();}}

    public SubSampleInformationBox getSubsampleInformationBox() {try{__CLR4_5_27wv7wvlvl9eidd.R.inc(10342);
        __CLR4_5_27wv7wvlvl9eidd.R.inc(10343);return null;
    }finally{__CLR4_5_27wv7wvlvl9eidd.R.flushNeeded();}}

    private BitStreamInfo readVariables() throws IOException {try{__CLR4_5_27wv7wvlvl9eidd.R.inc(10344);
        __CLR4_5_27wv7wvlvl9eidd.R.inc(10345);long startPosition = dataSource.position();
        __CLR4_5_27wv7wvlvl9eidd.R.inc(10346);ByteBuffer bb = ByteBuffer.allocate(200);
        __CLR4_5_27wv7wvlvl9eidd.R.inc(10347);dataSource.read(bb);
        __CLR4_5_27wv7wvlvl9eidd.R.inc(10348);bb.rewind();

        __CLR4_5_27wv7wvlvl9eidd.R.inc(10349);BitReaderBuffer brb = new BitReaderBuffer(bb);
        __CLR4_5_27wv7wvlvl9eidd.R.inc(10350);int syncword = brb.readBits(16);
        __CLR4_5_27wv7wvlvl9eidd.R.inc(10351);if ((((syncword != 0xb77)&&(__CLR4_5_27wv7wvlvl9eidd.R.iget(10352)!=0|true))||(__CLR4_5_27wv7wvlvl9eidd.R.iget(10353)==0&false))) {{
            __CLR4_5_27wv7wvlvl9eidd.R.inc(10354);return null;
        }

        }__CLR4_5_27wv7wvlvl9eidd.R.inc(10355);BitStreamInfo entry = new BitStreamInfo();

        __CLR4_5_27wv7wvlvl9eidd.R.inc(10356);entry.strmtyp = brb.readBits(2);
        __CLR4_5_27wv7wvlvl9eidd.R.inc(10357);entry.substreamid = brb.readBits(3);
        __CLR4_5_27wv7wvlvl9eidd.R.inc(10358);int frmsiz = brb.readBits(11);
        __CLR4_5_27wv7wvlvl9eidd.R.inc(10359);entry.frameSize = 2 * (frmsiz + 1);

        __CLR4_5_27wv7wvlvl9eidd.R.inc(10360);entry.fscod = brb.readBits(2);
        __CLR4_5_27wv7wvlvl9eidd.R.inc(10361);int fscod2 = -1;
        __CLR4_5_27wv7wvlvl9eidd.R.inc(10362);int numblkscod;
        __CLR4_5_27wv7wvlvl9eidd.R.inc(10363);if ((((entry.fscod == 3)&&(__CLR4_5_27wv7wvlvl9eidd.R.iget(10364)!=0|true))||(__CLR4_5_27wv7wvlvl9eidd.R.iget(10365)==0&false))) {{
            __CLR4_5_27wv7wvlvl9eidd.R.inc(10366);fscod2 = brb.readBits(2);
            __CLR4_5_27wv7wvlvl9eidd.R.inc(10367);numblkscod = 3;
        } }else {{
            __CLR4_5_27wv7wvlvl9eidd.R.inc(10368);numblkscod = brb.readBits(2);
        }
        }__CLR4_5_27wv7wvlvl9eidd.R.inc(10369);int numberOfBlocksPerSyncFrame = 0;
        boolean __CLB4_5_2_bool0=false;__CLR4_5_27wv7wvlvl9eidd.R.inc(10370);switch (numblkscod) {
            case 0:if (!__CLB4_5_2_bool0) {__CLR4_5_27wv7wvlvl9eidd.R.inc(10371);__CLB4_5_2_bool0=true;}
                __CLR4_5_27wv7wvlvl9eidd.R.inc(10372);numberOfBlocksPerSyncFrame = 1;
                __CLR4_5_27wv7wvlvl9eidd.R.inc(10373);break;

            case 1:if (!__CLB4_5_2_bool0) {__CLR4_5_27wv7wvlvl9eidd.R.inc(10374);__CLB4_5_2_bool0=true;}
                __CLR4_5_27wv7wvlvl9eidd.R.inc(10375);numberOfBlocksPerSyncFrame = 2;
                __CLR4_5_27wv7wvlvl9eidd.R.inc(10376);break;

            case 2:if (!__CLB4_5_2_bool0) {__CLR4_5_27wv7wvlvl9eidd.R.inc(10377);__CLB4_5_2_bool0=true;}
                __CLR4_5_27wv7wvlvl9eidd.R.inc(10378);numberOfBlocksPerSyncFrame = 3;
                __CLR4_5_27wv7wvlvl9eidd.R.inc(10379);break;

            case 3:if (!__CLB4_5_2_bool0) {__CLR4_5_27wv7wvlvl9eidd.R.inc(10380);__CLB4_5_2_bool0=true;}
                __CLR4_5_27wv7wvlvl9eidd.R.inc(10381);numberOfBlocksPerSyncFrame = 6;
                __CLR4_5_27wv7wvlvl9eidd.R.inc(10382);break;

        }
        __CLR4_5_27wv7wvlvl9eidd.R.inc(10383);entry.frameSize *= (6 / numberOfBlocksPerSyncFrame);

        __CLR4_5_27wv7wvlvl9eidd.R.inc(10384);entry.acmod = brb.readBits(3);
        __CLR4_5_27wv7wvlvl9eidd.R.inc(10385);entry.lfeon = brb.readBits(1);
        __CLR4_5_27wv7wvlvl9eidd.R.inc(10386);entry.bsid = brb.readBits(5);
        __CLR4_5_27wv7wvlvl9eidd.R.inc(10387);brb.readBits(5);
        __CLR4_5_27wv7wvlvl9eidd.R.inc(10388);if ((((1 == brb.readBits(1))&&(__CLR4_5_27wv7wvlvl9eidd.R.iget(10389)!=0|true))||(__CLR4_5_27wv7wvlvl9eidd.R.iget(10390)==0&false))) {{
            __CLR4_5_27wv7wvlvl9eidd.R.inc(10391);brb.readBits(8); // compr
        }
        }__CLR4_5_27wv7wvlvl9eidd.R.inc(10392);if ((((0 == entry.acmod)&&(__CLR4_5_27wv7wvlvl9eidd.R.iget(10393)!=0|true))||(__CLR4_5_27wv7wvlvl9eidd.R.iget(10394)==0&false))) {{
            __CLR4_5_27wv7wvlvl9eidd.R.inc(10395);brb.readBits(5);
            __CLR4_5_27wv7wvlvl9eidd.R.inc(10396);if ((((1 == brb.readBits(1))&&(__CLR4_5_27wv7wvlvl9eidd.R.iget(10397)!=0|true))||(__CLR4_5_27wv7wvlvl9eidd.R.iget(10398)==0&false))) {{
                __CLR4_5_27wv7wvlvl9eidd.R.inc(10399);brb.readBits(8);
            }
        }}
        }__CLR4_5_27wv7wvlvl9eidd.R.inc(10400);if ((((1 == entry.strmtyp)&&(__CLR4_5_27wv7wvlvl9eidd.R.iget(10401)!=0|true))||(__CLR4_5_27wv7wvlvl9eidd.R.iget(10402)==0&false))) {{
            __CLR4_5_27wv7wvlvl9eidd.R.inc(10403);if ((((1 == brb.readBits(1))&&(__CLR4_5_27wv7wvlvl9eidd.R.iget(10404)!=0|true))||(__CLR4_5_27wv7wvlvl9eidd.R.iget(10405)==0&false))) {{
                __CLR4_5_27wv7wvlvl9eidd.R.inc(10406);entry.chanmap = brb.readBits(16);
            }
        }}
        }__CLR4_5_27wv7wvlvl9eidd.R.inc(10407);if ((((1 == brb.readBits(1))&&(__CLR4_5_27wv7wvlvl9eidd.R.iget(10408)!=0|true))||(__CLR4_5_27wv7wvlvl9eidd.R.iget(10409)==0&false))) {{     // mixing metadata
            __CLR4_5_27wv7wvlvl9eidd.R.inc(10410);if ((((entry.acmod > 2)&&(__CLR4_5_27wv7wvlvl9eidd.R.iget(10411)!=0|true))||(__CLR4_5_27wv7wvlvl9eidd.R.iget(10412)==0&false))) {{
                __CLR4_5_27wv7wvlvl9eidd.R.inc(10413);brb.readBits(2);
            }
            }__CLR4_5_27wv7wvlvl9eidd.R.inc(10414);if ((((1 == (entry.acmod & 1) && entry.acmod > 2)&&(__CLR4_5_27wv7wvlvl9eidd.R.iget(10415)!=0|true))||(__CLR4_5_27wv7wvlvl9eidd.R.iget(10416)==0&false))) {{
                __CLR4_5_27wv7wvlvl9eidd.R.inc(10417);brb.readBits(3);
                __CLR4_5_27wv7wvlvl9eidd.R.inc(10418);brb.readBits(3);
            }
            }__CLR4_5_27wv7wvlvl9eidd.R.inc(10419);if ((((0 < (entry.acmod & 4))&&(__CLR4_5_27wv7wvlvl9eidd.R.iget(10420)!=0|true))||(__CLR4_5_27wv7wvlvl9eidd.R.iget(10421)==0&false))) {{
                __CLR4_5_27wv7wvlvl9eidd.R.inc(10422);brb.readBits(3);
                __CLR4_5_27wv7wvlvl9eidd.R.inc(10423);brb.readBits(3);
            }
            }__CLR4_5_27wv7wvlvl9eidd.R.inc(10424);if ((((1 == entry.lfeon)&&(__CLR4_5_27wv7wvlvl9eidd.R.iget(10425)!=0|true))||(__CLR4_5_27wv7wvlvl9eidd.R.iget(10426)==0&false))) {{
                __CLR4_5_27wv7wvlvl9eidd.R.inc(10427);if ((((1 == brb.readBits(1))&&(__CLR4_5_27wv7wvlvl9eidd.R.iget(10428)!=0|true))||(__CLR4_5_27wv7wvlvl9eidd.R.iget(10429)==0&false))) {{
                    __CLR4_5_27wv7wvlvl9eidd.R.inc(10430);brb.readBits(5);
                }
            }}
            }__CLR4_5_27wv7wvlvl9eidd.R.inc(10431);if ((((0 == entry.strmtyp)&&(__CLR4_5_27wv7wvlvl9eidd.R.iget(10432)!=0|true))||(__CLR4_5_27wv7wvlvl9eidd.R.iget(10433)==0&false))) {{
                __CLR4_5_27wv7wvlvl9eidd.R.inc(10434);if ((((1 == brb.readBits(1))&&(__CLR4_5_27wv7wvlvl9eidd.R.iget(10435)!=0|true))||(__CLR4_5_27wv7wvlvl9eidd.R.iget(10436)==0&false))) {{
                    __CLR4_5_27wv7wvlvl9eidd.R.inc(10437);brb.readBits(6);
                }
                }__CLR4_5_27wv7wvlvl9eidd.R.inc(10438);if ((((0 == entry.acmod)&&(__CLR4_5_27wv7wvlvl9eidd.R.iget(10439)!=0|true))||(__CLR4_5_27wv7wvlvl9eidd.R.iget(10440)==0&false))) {{
                    __CLR4_5_27wv7wvlvl9eidd.R.inc(10441);if ((((1 == brb.readBits(1))&&(__CLR4_5_27wv7wvlvl9eidd.R.iget(10442)!=0|true))||(__CLR4_5_27wv7wvlvl9eidd.R.iget(10443)==0&false))) {{
                        __CLR4_5_27wv7wvlvl9eidd.R.inc(10444);brb.readBits(6);
                    }
                }}
                }__CLR4_5_27wv7wvlvl9eidd.R.inc(10445);if ((((1 == brb.readBits(1))&&(__CLR4_5_27wv7wvlvl9eidd.R.iget(10446)!=0|true))||(__CLR4_5_27wv7wvlvl9eidd.R.iget(10447)==0&false))) {{
                    __CLR4_5_27wv7wvlvl9eidd.R.inc(10448);brb.readBits(6);
                }
                }__CLR4_5_27wv7wvlvl9eidd.R.inc(10449);int mixdef = brb.readBits(2);
                __CLR4_5_27wv7wvlvl9eidd.R.inc(10450);if ((((1 == mixdef)&&(__CLR4_5_27wv7wvlvl9eidd.R.iget(10451)!=0|true))||(__CLR4_5_27wv7wvlvl9eidd.R.iget(10452)==0&false))) {{
                    __CLR4_5_27wv7wvlvl9eidd.R.inc(10453);brb.readBits(5);
                } }else {__CLR4_5_27wv7wvlvl9eidd.R.inc(10454);if ((((2 == mixdef)&&(__CLR4_5_27wv7wvlvl9eidd.R.iget(10455)!=0|true))||(__CLR4_5_27wv7wvlvl9eidd.R.iget(10456)==0&false))) {{
                    __CLR4_5_27wv7wvlvl9eidd.R.inc(10457);brb.readBits(12);
                } }else {__CLR4_5_27wv7wvlvl9eidd.R.inc(10458);if ((((3 == mixdef)&&(__CLR4_5_27wv7wvlvl9eidd.R.iget(10459)!=0|true))||(__CLR4_5_27wv7wvlvl9eidd.R.iget(10460)==0&false))) {{
                    __CLR4_5_27wv7wvlvl9eidd.R.inc(10461);int mixdeflen = brb.readBits(5);
                    __CLR4_5_27wv7wvlvl9eidd.R.inc(10462);if ((((1 == brb.readBits(1))&&(__CLR4_5_27wv7wvlvl9eidd.R.iget(10463)!=0|true))||(__CLR4_5_27wv7wvlvl9eidd.R.iget(10464)==0&false))) {{
                        __CLR4_5_27wv7wvlvl9eidd.R.inc(10465);brb.readBits(5);
                        __CLR4_5_27wv7wvlvl9eidd.R.inc(10466);if ((((1 == brb.readBits(1))&&(__CLR4_5_27wv7wvlvl9eidd.R.iget(10467)!=0|true))||(__CLR4_5_27wv7wvlvl9eidd.R.iget(10468)==0&false))) {{
                            __CLR4_5_27wv7wvlvl9eidd.R.inc(10469);brb.readBits(4);
                        }
                        }__CLR4_5_27wv7wvlvl9eidd.R.inc(10470);if ((((1 == brb.readBits(1))&&(__CLR4_5_27wv7wvlvl9eidd.R.iget(10471)!=0|true))||(__CLR4_5_27wv7wvlvl9eidd.R.iget(10472)==0&false))) {{
                            __CLR4_5_27wv7wvlvl9eidd.R.inc(10473);brb.readBits(4);
                        }
                        }__CLR4_5_27wv7wvlvl9eidd.R.inc(10474);if ((((1 == brb.readBits(1))&&(__CLR4_5_27wv7wvlvl9eidd.R.iget(10475)!=0|true))||(__CLR4_5_27wv7wvlvl9eidd.R.iget(10476)==0&false))) {{
                            __CLR4_5_27wv7wvlvl9eidd.R.inc(10477);brb.readBits(4);
                        }
                        }__CLR4_5_27wv7wvlvl9eidd.R.inc(10478);if ((((1 == brb.readBits(1))&&(__CLR4_5_27wv7wvlvl9eidd.R.iget(10479)!=0|true))||(__CLR4_5_27wv7wvlvl9eidd.R.iget(10480)==0&false))) {{
                            __CLR4_5_27wv7wvlvl9eidd.R.inc(10481);brb.readBits(4);
                        }
                        }__CLR4_5_27wv7wvlvl9eidd.R.inc(10482);if ((((1 == brb.readBits(1))&&(__CLR4_5_27wv7wvlvl9eidd.R.iget(10483)!=0|true))||(__CLR4_5_27wv7wvlvl9eidd.R.iget(10484)==0&false))) {{
                            __CLR4_5_27wv7wvlvl9eidd.R.inc(10485);brb.readBits(4);
                        }
                        }__CLR4_5_27wv7wvlvl9eidd.R.inc(10486);if ((((1 == brb.readBits(1))&&(__CLR4_5_27wv7wvlvl9eidd.R.iget(10487)!=0|true))||(__CLR4_5_27wv7wvlvl9eidd.R.iget(10488)==0&false))) {{
                            __CLR4_5_27wv7wvlvl9eidd.R.inc(10489);brb.readBits(4);
                        }
                        }__CLR4_5_27wv7wvlvl9eidd.R.inc(10490);if ((((1 == brb.readBits(1))&&(__CLR4_5_27wv7wvlvl9eidd.R.iget(10491)!=0|true))||(__CLR4_5_27wv7wvlvl9eidd.R.iget(10492)==0&false))) {{
                            __CLR4_5_27wv7wvlvl9eidd.R.inc(10493);brb.readBits(4);
                        }
                        }__CLR4_5_27wv7wvlvl9eidd.R.inc(10494);if ((((1 == brb.readBits(1))&&(__CLR4_5_27wv7wvlvl9eidd.R.iget(10495)!=0|true))||(__CLR4_5_27wv7wvlvl9eidd.R.iget(10496)==0&false))) {{
                            __CLR4_5_27wv7wvlvl9eidd.R.inc(10497);if ((((1 == brb.readBits(1))&&(__CLR4_5_27wv7wvlvl9eidd.R.iget(10498)!=0|true))||(__CLR4_5_27wv7wvlvl9eidd.R.iget(10499)==0&false))) {{
                                __CLR4_5_27wv7wvlvl9eidd.R.inc(10500);brb.readBits(4);
                            }
                            }__CLR4_5_27wv7wvlvl9eidd.R.inc(10501);if ((((1 == brb.readBits(1))&&(__CLR4_5_27wv7wvlvl9eidd.R.iget(10502)!=0|true))||(__CLR4_5_27wv7wvlvl9eidd.R.iget(10503)==0&false))) {{
                                __CLR4_5_27wv7wvlvl9eidd.R.inc(10504);brb.readBits(4);
                            }
                        }}
                    }}
                    }__CLR4_5_27wv7wvlvl9eidd.R.inc(10505);if ((((1 == brb.readBits(1))&&(__CLR4_5_27wv7wvlvl9eidd.R.iget(10506)!=0|true))||(__CLR4_5_27wv7wvlvl9eidd.R.iget(10507)==0&false))) {{
                        __CLR4_5_27wv7wvlvl9eidd.R.inc(10508);brb.readBits(5);
                        __CLR4_5_27wv7wvlvl9eidd.R.inc(10509);if ((((1 == brb.readBits(1))&&(__CLR4_5_27wv7wvlvl9eidd.R.iget(10510)!=0|true))||(__CLR4_5_27wv7wvlvl9eidd.R.iget(10511)==0&false))) {{
                            __CLR4_5_27wv7wvlvl9eidd.R.inc(10512);brb.readBits(7);
                            __CLR4_5_27wv7wvlvl9eidd.R.inc(10513);if ((((1 == brb.readBits(1))&&(__CLR4_5_27wv7wvlvl9eidd.R.iget(10514)!=0|true))||(__CLR4_5_27wv7wvlvl9eidd.R.iget(10515)==0&false))) {{
                                __CLR4_5_27wv7wvlvl9eidd.R.inc(10516);brb.readBits(8);
                            }
                        }}
                    }}
                    }__CLR4_5_27wv7wvlvl9eidd.R.inc(10517);for (int i = 0; (((i < (mixdeflen + 2))&&(__CLR4_5_27wv7wvlvl9eidd.R.iget(10518)!=0|true))||(__CLR4_5_27wv7wvlvl9eidd.R.iget(10519)==0&false)); i++) {{
                        __CLR4_5_27wv7wvlvl9eidd.R.inc(10520);brb.readBits(8);
                    }
                    }__CLR4_5_27wv7wvlvl9eidd.R.inc(10521);brb.byteSync();
                }
                }}}__CLR4_5_27wv7wvlvl9eidd.R.inc(10522);if ((((entry.acmod < 2)&&(__CLR4_5_27wv7wvlvl9eidd.R.iget(10523)!=0|true))||(__CLR4_5_27wv7wvlvl9eidd.R.iget(10524)==0&false))) {{
                    __CLR4_5_27wv7wvlvl9eidd.R.inc(10525);if ((((1 == brb.readBits(1))&&(__CLR4_5_27wv7wvlvl9eidd.R.iget(10526)!=0|true))||(__CLR4_5_27wv7wvlvl9eidd.R.iget(10527)==0&false))) {{
                        __CLR4_5_27wv7wvlvl9eidd.R.inc(10528);brb.readBits(14);
                    }
                    }__CLR4_5_27wv7wvlvl9eidd.R.inc(10529);if ((((0 == entry.acmod)&&(__CLR4_5_27wv7wvlvl9eidd.R.iget(10530)!=0|true))||(__CLR4_5_27wv7wvlvl9eidd.R.iget(10531)==0&false))) {{
                        __CLR4_5_27wv7wvlvl9eidd.R.inc(10532);if ((((1 == brb.readBits(1))&&(__CLR4_5_27wv7wvlvl9eidd.R.iget(10533)!=0|true))||(__CLR4_5_27wv7wvlvl9eidd.R.iget(10534)==0&false))) {{
                            __CLR4_5_27wv7wvlvl9eidd.R.inc(10535);brb.readBits(14);
                        }
                    }}
                    }__CLR4_5_27wv7wvlvl9eidd.R.inc(10536);if ((((1 == brb.readBits(1))&&(__CLR4_5_27wv7wvlvl9eidd.R.iget(10537)!=0|true))||(__CLR4_5_27wv7wvlvl9eidd.R.iget(10538)==0&false))) {{
                        __CLR4_5_27wv7wvlvl9eidd.R.inc(10539);if ((((numblkscod == 0)&&(__CLR4_5_27wv7wvlvl9eidd.R.iget(10540)!=0|true))||(__CLR4_5_27wv7wvlvl9eidd.R.iget(10541)==0&false))) {{
                            __CLR4_5_27wv7wvlvl9eidd.R.inc(10542);brb.readBits(5);
                        } }else {{
                            __CLR4_5_27wv7wvlvl9eidd.R.inc(10543);for (int i = 0; (((i < numberOfBlocksPerSyncFrame)&&(__CLR4_5_27wv7wvlvl9eidd.R.iget(10544)!=0|true))||(__CLR4_5_27wv7wvlvl9eidd.R.iget(10545)==0&false)); i++) {{
                                __CLR4_5_27wv7wvlvl9eidd.R.inc(10546);if ((((1 == brb.readBits(1))&&(__CLR4_5_27wv7wvlvl9eidd.R.iget(10547)!=0|true))||(__CLR4_5_27wv7wvlvl9eidd.R.iget(10548)==0&false))) {{
                                    __CLR4_5_27wv7wvlvl9eidd.R.inc(10549);brb.readBits(5);
                                }
                            }}
                        }}

                    }}
                }}
            }}
        }}
        }__CLR4_5_27wv7wvlvl9eidd.R.inc(10550);if ((((1 == brb.readBits(1))&&(__CLR4_5_27wv7wvlvl9eidd.R.iget(10551)!=0|true))||(__CLR4_5_27wv7wvlvl9eidd.R.iget(10552)==0&false))) {{ // infomdate
            __CLR4_5_27wv7wvlvl9eidd.R.inc(10553);entry.bsmod = brb.readBits(3);
        }

        }boolean __CLB4_5_2_bool1=false;__CLR4_5_27wv7wvlvl9eidd.R.inc(10554);switch (entry.fscod) {
            case 0:if (!__CLB4_5_2_bool1) {__CLR4_5_27wv7wvlvl9eidd.R.inc(10555);__CLB4_5_2_bool1=true;}
                __CLR4_5_27wv7wvlvl9eidd.R.inc(10556);entry.samplerate = 48000;
                __CLR4_5_27wv7wvlvl9eidd.R.inc(10557);break;

            case 1:if (!__CLB4_5_2_bool1) {__CLR4_5_27wv7wvlvl9eidd.R.inc(10558);__CLB4_5_2_bool1=true;}
                __CLR4_5_27wv7wvlvl9eidd.R.inc(10559);entry.samplerate = 44100;
                __CLR4_5_27wv7wvlvl9eidd.R.inc(10560);break;

            case 2:if (!__CLB4_5_2_bool1) {__CLR4_5_27wv7wvlvl9eidd.R.inc(10561);__CLB4_5_2_bool1=true;}
                __CLR4_5_27wv7wvlvl9eidd.R.inc(10562);entry.samplerate = 32000;
                __CLR4_5_27wv7wvlvl9eidd.R.inc(10563);break;

            case 3:if (!__CLB4_5_2_bool1) {__CLR4_5_27wv7wvlvl9eidd.R.inc(10564);__CLB4_5_2_bool1=true;} {
                boolean __CLB4_5_2_bool2=false;__CLR4_5_27wv7wvlvl9eidd.R.inc(10565);switch (fscod2) {
                    case 0:if (!__CLB4_5_2_bool2) {__CLR4_5_27wv7wvlvl9eidd.R.inc(10566);__CLB4_5_2_bool2=true;}
                        __CLR4_5_27wv7wvlvl9eidd.R.inc(10567);entry.samplerate = 24000;
                        __CLR4_5_27wv7wvlvl9eidd.R.inc(10568);break;

                    case 1:if (!__CLB4_5_2_bool2) {__CLR4_5_27wv7wvlvl9eidd.R.inc(10569);__CLB4_5_2_bool2=true;}
                        __CLR4_5_27wv7wvlvl9eidd.R.inc(10570);entry.samplerate = 22050;
                        __CLR4_5_27wv7wvlvl9eidd.R.inc(10571);break;

                    case 2:if (!__CLB4_5_2_bool2) {__CLR4_5_27wv7wvlvl9eidd.R.inc(10572);__CLB4_5_2_bool2=true;}
                        __CLR4_5_27wv7wvlvl9eidd.R.inc(10573);entry.samplerate = 16000;
                        __CLR4_5_27wv7wvlvl9eidd.R.inc(10574);break;

                    case 3:if (!__CLB4_5_2_bool2) {__CLR4_5_27wv7wvlvl9eidd.R.inc(10575);__CLB4_5_2_bool2=true;}
                        __CLR4_5_27wv7wvlvl9eidd.R.inc(10576);entry.samplerate = 0;
                        __CLR4_5_27wv7wvlvl9eidd.R.inc(10577);break;
                }
                __CLR4_5_27wv7wvlvl9eidd.R.inc(10578);break;
            }

        }
        __CLR4_5_27wv7wvlvl9eidd.R.inc(10579);if ((((entry.samplerate == 0)&&(__CLR4_5_27wv7wvlvl9eidd.R.iget(10580)!=0|true))||(__CLR4_5_27wv7wvlvl9eidd.R.iget(10581)==0&false))) {{
            __CLR4_5_27wv7wvlvl9eidd.R.inc(10582);return null;
        }

        }__CLR4_5_27wv7wvlvl9eidd.R.inc(10583);entry.bitrate = (int) (((double) entry.samplerate) / 1536.0 * entry.frameSize * 8);

        __CLR4_5_27wv7wvlvl9eidd.R.inc(10584);dataSource.position(startPosition + entry.frameSize);
        __CLR4_5_27wv7wvlvl9eidd.R.inc(10585);return entry;
    }finally{__CLR4_5_27wv7wvlvl9eidd.R.flushNeeded();}}

    private List<Sample> readSamples() throws IOException {try{__CLR4_5_27wv7wvlvl9eidd.R.inc(10586);
        __CLR4_5_27wv7wvlvl9eidd.R.inc(10587);final int framesLeft = l2i((dataSource.size() - dataSource.position()) / frameSize);
        __CLR4_5_27wv7wvlvl9eidd.R.inc(10588);List<Sample> mySamples = new ArrayList<Sample>(framesLeft);
        __CLR4_5_27wv7wvlvl9eidd.R.inc(10589);for (int i = 0; (((i < framesLeft)&&(__CLR4_5_27wv7wvlvl9eidd.R.iget(10590)!=0|true))||(__CLR4_5_27wv7wvlvl9eidd.R.iget(10591)==0&false)); i++) {{
            __CLR4_5_27wv7wvlvl9eidd.R.inc(10592);final int start = i * frameSize;
            __CLR4_5_27wv7wvlvl9eidd.R.inc(10593);mySamples.add(new Sample() {
                public void writeTo(WritableByteChannel channel) throws IOException {try{__CLR4_5_27wv7wvlvl9eidd.R.inc(10594);
                    __CLR4_5_27wv7wvlvl9eidd.R.inc(10595);dataSource.transferTo(start, frameSize, channel);
                }finally{__CLR4_5_27wv7wvlvl9eidd.R.flushNeeded();}}

                public long getSize() {try{__CLR4_5_27wv7wvlvl9eidd.R.inc(10596);
                    __CLR4_5_27wv7wvlvl9eidd.R.inc(10597);return frameSize;
                }finally{__CLR4_5_27wv7wvlvl9eidd.R.flushNeeded();}}

                public ByteBuffer asByteBuffer() {try{__CLR4_5_27wv7wvlvl9eidd.R.inc(10598);
                    __CLR4_5_27wv7wvlvl9eidd.R.inc(10599);try {
                        __CLR4_5_27wv7wvlvl9eidd.R.inc(10600);return dataSource.map(start, frameSize);
                    } catch (IOException e) {
                        __CLR4_5_27wv7wvlvl9eidd.R.inc(10601);throw new RuntimeException(e);
                    }
                }finally{__CLR4_5_27wv7wvlvl9eidd.R.flushNeeded();}}
            });
        }

        }__CLR4_5_27wv7wvlvl9eidd.R.inc(10602);return mySamples;
    }finally{__CLR4_5_27wv7wvlvl9eidd.R.flushNeeded();}}

    public static class BitStreamInfo extends EC3SpecificBox.Entry {
        public int frameSize;
        public int substreamid;
        public int bitrate;
        public int samplerate;
        public int strmtyp;
        public int chanmap;

        @Override
        public String toString() {try{__CLR4_5_27wv7wvlvl9eidd.R.inc(10603);
            __CLR4_5_27wv7wvlvl9eidd.R.inc(10604);return "BitStreamInfo{" +
                    "frameSize=" + frameSize +
                    ", substreamid=" + substreamid +
                    ", bitrate=" + bitrate +
                    ", samplerate=" + samplerate +
                    ", strmtyp=" + strmtyp +
                    ", chanmap=" + chanmap +
                    '}';
        }finally{__CLR4_5_27wv7wvlvl9eidd.R.flushNeeded();}}
    }

    @Override
    public String toString() {try{__CLR4_5_27wv7wvlvl9eidd.R.inc(10605);
        __CLR4_5_27wv7wvlvl9eidd.R.inc(10606);return "EC3TrackImpl{" +
                "bitrate=" + bitrate +
                ", bitStreamInfos=" + bitStreamInfos +
                '}';
    }finally{__CLR4_5_27wv7wvlvl9eidd.R.flushNeeded();}}
}
