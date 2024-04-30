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
@java.lang.SuppressWarnings({"fallthrough"}) public class EC3TrackImpl extends AbstractTrack {public static class __CLR4_5_27zi7zilvluli4c{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,10702,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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
        super(dataSource.toString());__CLR4_5_27zi7zilvluli4c.R.inc(10351);try{__CLR4_5_27zi7zilvluli4c.R.inc(10350);
        __CLR4_5_27zi7zilvluli4c.R.inc(10352);this.dataSource = dataSource;

        __CLR4_5_27zi7zilvluli4c.R.inc(10353);boolean done = false;

        __CLR4_5_27zi7zilvluli4c.R.inc(10354);while ((((!done)&&(__CLR4_5_27zi7zilvluli4c.R.iget(10355)!=0|true))||(__CLR4_5_27zi7zilvluli4c.R.iget(10356)==0&false))) {{
            __CLR4_5_27zi7zilvluli4c.R.inc(10357);BitStreamInfo bsi = readVariables();
            __CLR4_5_27zi7zilvluli4c.R.inc(10358);if ((((bsi == null)&&(__CLR4_5_27zi7zilvluli4c.R.iget(10359)!=0|true))||(__CLR4_5_27zi7zilvluli4c.R.iget(10360)==0&false))) {{
                __CLR4_5_27zi7zilvluli4c.R.inc(10361);throw new IOException();
            }
            }__CLR4_5_27zi7zilvluli4c.R.inc(10362);for (BitStreamInfo entry : bitStreamInfos) {{
                __CLR4_5_27zi7zilvluli4c.R.inc(10363);if ((((bsi.strmtyp != 1 && entry.substreamid == bsi.substreamid)&&(__CLR4_5_27zi7zilvluli4c.R.iget(10364)!=0|true))||(__CLR4_5_27zi7zilvluli4c.R.iget(10365)==0&false))) {{
                    __CLR4_5_27zi7zilvluli4c.R.inc(10366);done = true;
                }
            }}
            }__CLR4_5_27zi7zilvluli4c.R.inc(10367);if ((((!done)&&(__CLR4_5_27zi7zilvluli4c.R.iget(10368)!=0|true))||(__CLR4_5_27zi7zilvluli4c.R.iget(10369)==0&false))) {{
                __CLR4_5_27zi7zilvluli4c.R.inc(10370);bitStreamInfos.add(bsi);
            }
        }}


        }__CLR4_5_27zi7zilvluli4c.R.inc(10371);if ((((bitStreamInfos.size() == 0)&&(__CLR4_5_27zi7zilvluli4c.R.iget(10372)!=0|true))||(__CLR4_5_27zi7zilvluli4c.R.iget(10373)==0&false))) {{
            __CLR4_5_27zi7zilvluli4c.R.inc(10374);throw new IOException();
        }
        }__CLR4_5_27zi7zilvluli4c.R.inc(10375);int samplerate = bitStreamInfos.get(0).samplerate;

        __CLR4_5_27zi7zilvluli4c.R.inc(10376);sampleDescriptionBox = new SampleDescriptionBox();
        __CLR4_5_27zi7zilvluli4c.R.inc(10377);AudioSampleEntry audioSampleEntry = new AudioSampleEntry("ec-3");
        __CLR4_5_27zi7zilvluli4c.R.inc(10378);audioSampleEntry.setChannelCount(2);  // According to  ETSI TS 102 366 Annex F
        __CLR4_5_27zi7zilvluli4c.R.inc(10379);audioSampleEntry.setSampleRate(samplerate);
        __CLR4_5_27zi7zilvluli4c.R.inc(10380);audioSampleEntry.setDataReferenceIndex(1);
        __CLR4_5_27zi7zilvluli4c.R.inc(10381);audioSampleEntry.setSampleSize(16);

        __CLR4_5_27zi7zilvluli4c.R.inc(10382);EC3SpecificBox ec3 = new EC3SpecificBox();
        __CLR4_5_27zi7zilvluli4c.R.inc(10383);int[] deps = new int[bitStreamInfos.size()];
        __CLR4_5_27zi7zilvluli4c.R.inc(10384);int[] chan_locs = new int[bitStreamInfos.size()];
        __CLR4_5_27zi7zilvluli4c.R.inc(10385);for (BitStreamInfo bsi : bitStreamInfos) {{
            __CLR4_5_27zi7zilvluli4c.R.inc(10386);if ((((bsi.strmtyp == 1)&&(__CLR4_5_27zi7zilvluli4c.R.iget(10387)!=0|true))||(__CLR4_5_27zi7zilvluli4c.R.iget(10388)==0&false))) {{
                __CLR4_5_27zi7zilvluli4c.R.inc(10389);deps[bsi.substreamid]++;
                __CLR4_5_27zi7zilvluli4c.R.inc(10390);chan_locs[bsi.substreamid] = ((bsi.chanmap >> 6) & 0x100) | ((bsi.chanmap >> 5) & 0xff);
            }
        }}
        }__CLR4_5_27zi7zilvluli4c.R.inc(10391);for (BitStreamInfo bsi : bitStreamInfos) {{
            __CLR4_5_27zi7zilvluli4c.R.inc(10392);if ((((bsi.strmtyp != 1)&&(__CLR4_5_27zi7zilvluli4c.R.iget(10393)!=0|true))||(__CLR4_5_27zi7zilvluli4c.R.iget(10394)==0&false))) {{
                __CLR4_5_27zi7zilvluli4c.R.inc(10395);EC3SpecificBox.Entry e = new EC3SpecificBox.Entry();
                __CLR4_5_27zi7zilvluli4c.R.inc(10396);e.fscod = bsi.fscod;
                __CLR4_5_27zi7zilvluli4c.R.inc(10397);e.bsid = bsi.bsid;
                __CLR4_5_27zi7zilvluli4c.R.inc(10398);e.bsmod = bsi.bsmod;
                __CLR4_5_27zi7zilvluli4c.R.inc(10399);e.acmod = bsi.acmod;
                __CLR4_5_27zi7zilvluli4c.R.inc(10400);e.lfeon = bsi.lfeon;
                __CLR4_5_27zi7zilvluli4c.R.inc(10401);e.reserved = 0;
                __CLR4_5_27zi7zilvluli4c.R.inc(10402);e.num_dep_sub = deps[bsi.substreamid];
                __CLR4_5_27zi7zilvluli4c.R.inc(10403);e.chan_loc = chan_locs[bsi.substreamid];
                __CLR4_5_27zi7zilvluli4c.R.inc(10404);e.reserved2 = 0;
                __CLR4_5_27zi7zilvluli4c.R.inc(10405);ec3.addEntry(e);
            }
            }__CLR4_5_27zi7zilvluli4c.R.inc(10406);bitrate += bsi.bitrate;
            __CLR4_5_27zi7zilvluli4c.R.inc(10407);frameSize += bsi.frameSize;
        }

        }__CLR4_5_27zi7zilvluli4c.R.inc(10408);ec3.setDataRate(bitrate / 1000);
        __CLR4_5_27zi7zilvluli4c.R.inc(10409);audioSampleEntry.addBox(ec3);
        __CLR4_5_27zi7zilvluli4c.R.inc(10410);sampleDescriptionBox.addBox(audioSampleEntry);

        __CLR4_5_27zi7zilvluli4c.R.inc(10411);trackMetaData.setCreationTime(new Date());
        __CLR4_5_27zi7zilvluli4c.R.inc(10412);trackMetaData.setModificationTime(new Date());

        __CLR4_5_27zi7zilvluli4c.R.inc(10413);trackMetaData.setTimescale(samplerate); // Audio tracks always use samplerate as timescale
        __CLR4_5_27zi7zilvluli4c.R.inc(10414);trackMetaData.setVolume(1);

        __CLR4_5_27zi7zilvluli4c.R.inc(10415);dataSource.position(0);
        __CLR4_5_27zi7zilvluli4c.R.inc(10416);samples = readSamples();
        __CLR4_5_27zi7zilvluli4c.R.inc(10417);this.decodingTimes = new long[samples.size()];
        __CLR4_5_27zi7zilvluli4c.R.inc(10418);Arrays.fill(decodingTimes, 1536);
    }finally{__CLR4_5_27zi7zilvluli4c.R.flushNeeded();}}

    public void close() throws IOException {try{__CLR4_5_27zi7zilvluli4c.R.inc(10419);
        __CLR4_5_27zi7zilvluli4c.R.inc(10420);dataSource.close();
    }finally{__CLR4_5_27zi7zilvluli4c.R.flushNeeded();}}

    public List<Sample> getSamples() {try{__CLR4_5_27zi7zilvluli4c.R.inc(10421);

        __CLR4_5_27zi7zilvluli4c.R.inc(10422);return samples;
    }finally{__CLR4_5_27zi7zilvluli4c.R.flushNeeded();}}

    public SampleDescriptionBox getSampleDescriptionBox() {try{__CLR4_5_27zi7zilvluli4c.R.inc(10423);
        __CLR4_5_27zi7zilvluli4c.R.inc(10424);return sampleDescriptionBox;
    }finally{__CLR4_5_27zi7zilvluli4c.R.flushNeeded();}}

    public List<CompositionTimeToSample.Entry> getCompositionTimeEntries() {try{__CLR4_5_27zi7zilvluli4c.R.inc(10425);
        __CLR4_5_27zi7zilvluli4c.R.inc(10426);return null;
    }finally{__CLR4_5_27zi7zilvluli4c.R.flushNeeded();}}

    public long[] getSyncSamples() {try{__CLR4_5_27zi7zilvluli4c.R.inc(10427);
        __CLR4_5_27zi7zilvluli4c.R.inc(10428);return null;
    }finally{__CLR4_5_27zi7zilvluli4c.R.flushNeeded();}}

    public long[] getSampleDurations() {try{__CLR4_5_27zi7zilvluli4c.R.inc(10429);
        __CLR4_5_27zi7zilvluli4c.R.inc(10430);return decodingTimes;
    }finally{__CLR4_5_27zi7zilvluli4c.R.flushNeeded();}}

    public List<SampleDependencyTypeBox.Entry> getSampleDependencies() {try{__CLR4_5_27zi7zilvluli4c.R.inc(10431);
        __CLR4_5_27zi7zilvluli4c.R.inc(10432);return null;
    }finally{__CLR4_5_27zi7zilvluli4c.R.flushNeeded();}}

    public TrackMetaData getTrackMetaData() {try{__CLR4_5_27zi7zilvluli4c.R.inc(10433);
        __CLR4_5_27zi7zilvluli4c.R.inc(10434);return trackMetaData;
    }finally{__CLR4_5_27zi7zilvluli4c.R.flushNeeded();}}

    public String getHandler() {try{__CLR4_5_27zi7zilvluli4c.R.inc(10435);
        __CLR4_5_27zi7zilvluli4c.R.inc(10436);return "soun";
    }finally{__CLR4_5_27zi7zilvluli4c.R.flushNeeded();}}

    public SubSampleInformationBox getSubsampleInformationBox() {try{__CLR4_5_27zi7zilvluli4c.R.inc(10437);
        __CLR4_5_27zi7zilvluli4c.R.inc(10438);return null;
    }finally{__CLR4_5_27zi7zilvluli4c.R.flushNeeded();}}

    private BitStreamInfo readVariables() throws IOException {try{__CLR4_5_27zi7zilvluli4c.R.inc(10439);
        __CLR4_5_27zi7zilvluli4c.R.inc(10440);long startPosition = dataSource.position();
        __CLR4_5_27zi7zilvluli4c.R.inc(10441);ByteBuffer bb = ByteBuffer.allocate(200);
        __CLR4_5_27zi7zilvluli4c.R.inc(10442);dataSource.read(bb);
        __CLR4_5_27zi7zilvluli4c.R.inc(10443);bb.rewind();

        __CLR4_5_27zi7zilvluli4c.R.inc(10444);BitReaderBuffer brb = new BitReaderBuffer(bb);
        __CLR4_5_27zi7zilvluli4c.R.inc(10445);int syncword = brb.readBits(16);
        __CLR4_5_27zi7zilvluli4c.R.inc(10446);if ((((syncword != 0xb77)&&(__CLR4_5_27zi7zilvluli4c.R.iget(10447)!=0|true))||(__CLR4_5_27zi7zilvluli4c.R.iget(10448)==0&false))) {{
            __CLR4_5_27zi7zilvluli4c.R.inc(10449);return null;
        }

        }__CLR4_5_27zi7zilvluli4c.R.inc(10450);BitStreamInfo entry = new BitStreamInfo();

        __CLR4_5_27zi7zilvluli4c.R.inc(10451);entry.strmtyp = brb.readBits(2);
        __CLR4_5_27zi7zilvluli4c.R.inc(10452);entry.substreamid = brb.readBits(3);
        __CLR4_5_27zi7zilvluli4c.R.inc(10453);int frmsiz = brb.readBits(11);
        __CLR4_5_27zi7zilvluli4c.R.inc(10454);entry.frameSize = 2 * (frmsiz + 1);

        __CLR4_5_27zi7zilvluli4c.R.inc(10455);entry.fscod = brb.readBits(2);
        __CLR4_5_27zi7zilvluli4c.R.inc(10456);int fscod2 = -1;
        __CLR4_5_27zi7zilvluli4c.R.inc(10457);int numblkscod;
        __CLR4_5_27zi7zilvluli4c.R.inc(10458);if ((((entry.fscod == 3)&&(__CLR4_5_27zi7zilvluli4c.R.iget(10459)!=0|true))||(__CLR4_5_27zi7zilvluli4c.R.iget(10460)==0&false))) {{
            __CLR4_5_27zi7zilvluli4c.R.inc(10461);fscod2 = brb.readBits(2);
            __CLR4_5_27zi7zilvluli4c.R.inc(10462);numblkscod = 3;
        } }else {{
            __CLR4_5_27zi7zilvluli4c.R.inc(10463);numblkscod = brb.readBits(2);
        }
        }__CLR4_5_27zi7zilvluli4c.R.inc(10464);int numberOfBlocksPerSyncFrame = 0;
        boolean __CLB4_5_2_bool0=false;__CLR4_5_27zi7zilvluli4c.R.inc(10465);switch (numblkscod) {
            case 0:if (!__CLB4_5_2_bool0) {__CLR4_5_27zi7zilvluli4c.R.inc(10466);__CLB4_5_2_bool0=true;}
                __CLR4_5_27zi7zilvluli4c.R.inc(10467);numberOfBlocksPerSyncFrame = 1;
                __CLR4_5_27zi7zilvluli4c.R.inc(10468);break;

            case 1:if (!__CLB4_5_2_bool0) {__CLR4_5_27zi7zilvluli4c.R.inc(10469);__CLB4_5_2_bool0=true;}
                __CLR4_5_27zi7zilvluli4c.R.inc(10470);numberOfBlocksPerSyncFrame = 2;
                __CLR4_5_27zi7zilvluli4c.R.inc(10471);break;

            case 2:if (!__CLB4_5_2_bool0) {__CLR4_5_27zi7zilvluli4c.R.inc(10472);__CLB4_5_2_bool0=true;}
                __CLR4_5_27zi7zilvluli4c.R.inc(10473);numberOfBlocksPerSyncFrame = 3;
                __CLR4_5_27zi7zilvluli4c.R.inc(10474);break;

            case 3:if (!__CLB4_5_2_bool0) {__CLR4_5_27zi7zilvluli4c.R.inc(10475);__CLB4_5_2_bool0=true;}
                __CLR4_5_27zi7zilvluli4c.R.inc(10476);numberOfBlocksPerSyncFrame = 6;
                __CLR4_5_27zi7zilvluli4c.R.inc(10477);break;

        }
        __CLR4_5_27zi7zilvluli4c.R.inc(10478);entry.frameSize *= (6 / numberOfBlocksPerSyncFrame);

        __CLR4_5_27zi7zilvluli4c.R.inc(10479);entry.acmod = brb.readBits(3);
        __CLR4_5_27zi7zilvluli4c.R.inc(10480);entry.lfeon = brb.readBits(1);
        __CLR4_5_27zi7zilvluli4c.R.inc(10481);entry.bsid = brb.readBits(5);
        __CLR4_5_27zi7zilvluli4c.R.inc(10482);brb.readBits(5);
        __CLR4_5_27zi7zilvluli4c.R.inc(10483);if ((((1 == brb.readBits(1))&&(__CLR4_5_27zi7zilvluli4c.R.iget(10484)!=0|true))||(__CLR4_5_27zi7zilvluli4c.R.iget(10485)==0&false))) {{
            __CLR4_5_27zi7zilvluli4c.R.inc(10486);brb.readBits(8); // compr
        }
        }__CLR4_5_27zi7zilvluli4c.R.inc(10487);if ((((0 == entry.acmod)&&(__CLR4_5_27zi7zilvluli4c.R.iget(10488)!=0|true))||(__CLR4_5_27zi7zilvluli4c.R.iget(10489)==0&false))) {{
            __CLR4_5_27zi7zilvluli4c.R.inc(10490);brb.readBits(5);
            __CLR4_5_27zi7zilvluli4c.R.inc(10491);if ((((1 == brb.readBits(1))&&(__CLR4_5_27zi7zilvluli4c.R.iget(10492)!=0|true))||(__CLR4_5_27zi7zilvluli4c.R.iget(10493)==0&false))) {{
                __CLR4_5_27zi7zilvluli4c.R.inc(10494);brb.readBits(8);
            }
        }}
        }__CLR4_5_27zi7zilvluli4c.R.inc(10495);if ((((1 == entry.strmtyp)&&(__CLR4_5_27zi7zilvluli4c.R.iget(10496)!=0|true))||(__CLR4_5_27zi7zilvluli4c.R.iget(10497)==0&false))) {{
            __CLR4_5_27zi7zilvluli4c.R.inc(10498);if ((((1 == brb.readBits(1))&&(__CLR4_5_27zi7zilvluli4c.R.iget(10499)!=0|true))||(__CLR4_5_27zi7zilvluli4c.R.iget(10500)==0&false))) {{
                __CLR4_5_27zi7zilvluli4c.R.inc(10501);entry.chanmap = brb.readBits(16);
            }
        }}
        }__CLR4_5_27zi7zilvluli4c.R.inc(10502);if ((((1 == brb.readBits(1))&&(__CLR4_5_27zi7zilvluli4c.R.iget(10503)!=0|true))||(__CLR4_5_27zi7zilvluli4c.R.iget(10504)==0&false))) {{     // mixing metadata
            __CLR4_5_27zi7zilvluli4c.R.inc(10505);if ((((entry.acmod > 2)&&(__CLR4_5_27zi7zilvluli4c.R.iget(10506)!=0|true))||(__CLR4_5_27zi7zilvluli4c.R.iget(10507)==0&false))) {{
                __CLR4_5_27zi7zilvluli4c.R.inc(10508);brb.readBits(2);
            }
            }__CLR4_5_27zi7zilvluli4c.R.inc(10509);if ((((1 == (entry.acmod & 1) && entry.acmod > 2)&&(__CLR4_5_27zi7zilvluli4c.R.iget(10510)!=0|true))||(__CLR4_5_27zi7zilvluli4c.R.iget(10511)==0&false))) {{
                __CLR4_5_27zi7zilvluli4c.R.inc(10512);brb.readBits(3);
                __CLR4_5_27zi7zilvluli4c.R.inc(10513);brb.readBits(3);
            }
            }__CLR4_5_27zi7zilvluli4c.R.inc(10514);if ((((0 < (entry.acmod & 4))&&(__CLR4_5_27zi7zilvluli4c.R.iget(10515)!=0|true))||(__CLR4_5_27zi7zilvluli4c.R.iget(10516)==0&false))) {{
                __CLR4_5_27zi7zilvluli4c.R.inc(10517);brb.readBits(3);
                __CLR4_5_27zi7zilvluli4c.R.inc(10518);brb.readBits(3);
            }
            }__CLR4_5_27zi7zilvluli4c.R.inc(10519);if ((((1 == entry.lfeon)&&(__CLR4_5_27zi7zilvluli4c.R.iget(10520)!=0|true))||(__CLR4_5_27zi7zilvluli4c.R.iget(10521)==0&false))) {{
                __CLR4_5_27zi7zilvluli4c.R.inc(10522);if ((((1 == brb.readBits(1))&&(__CLR4_5_27zi7zilvluli4c.R.iget(10523)!=0|true))||(__CLR4_5_27zi7zilvluli4c.R.iget(10524)==0&false))) {{
                    __CLR4_5_27zi7zilvluli4c.R.inc(10525);brb.readBits(5);
                }
            }}
            }__CLR4_5_27zi7zilvluli4c.R.inc(10526);if ((((0 == entry.strmtyp)&&(__CLR4_5_27zi7zilvluli4c.R.iget(10527)!=0|true))||(__CLR4_5_27zi7zilvluli4c.R.iget(10528)==0&false))) {{
                __CLR4_5_27zi7zilvluli4c.R.inc(10529);if ((((1 == brb.readBits(1))&&(__CLR4_5_27zi7zilvluli4c.R.iget(10530)!=0|true))||(__CLR4_5_27zi7zilvluli4c.R.iget(10531)==0&false))) {{
                    __CLR4_5_27zi7zilvluli4c.R.inc(10532);brb.readBits(6);
                }
                }__CLR4_5_27zi7zilvluli4c.R.inc(10533);if ((((0 == entry.acmod)&&(__CLR4_5_27zi7zilvluli4c.R.iget(10534)!=0|true))||(__CLR4_5_27zi7zilvluli4c.R.iget(10535)==0&false))) {{
                    __CLR4_5_27zi7zilvluli4c.R.inc(10536);if ((((1 == brb.readBits(1))&&(__CLR4_5_27zi7zilvluli4c.R.iget(10537)!=0|true))||(__CLR4_5_27zi7zilvluli4c.R.iget(10538)==0&false))) {{
                        __CLR4_5_27zi7zilvluli4c.R.inc(10539);brb.readBits(6);
                    }
                }}
                }__CLR4_5_27zi7zilvluli4c.R.inc(10540);if ((((1 == brb.readBits(1))&&(__CLR4_5_27zi7zilvluli4c.R.iget(10541)!=0|true))||(__CLR4_5_27zi7zilvluli4c.R.iget(10542)==0&false))) {{
                    __CLR4_5_27zi7zilvluli4c.R.inc(10543);brb.readBits(6);
                }
                }__CLR4_5_27zi7zilvluli4c.R.inc(10544);int mixdef = brb.readBits(2);
                __CLR4_5_27zi7zilvluli4c.R.inc(10545);if ((((1 == mixdef)&&(__CLR4_5_27zi7zilvluli4c.R.iget(10546)!=0|true))||(__CLR4_5_27zi7zilvluli4c.R.iget(10547)==0&false))) {{
                    __CLR4_5_27zi7zilvluli4c.R.inc(10548);brb.readBits(5);
                } }else {__CLR4_5_27zi7zilvluli4c.R.inc(10549);if ((((2 == mixdef)&&(__CLR4_5_27zi7zilvluli4c.R.iget(10550)!=0|true))||(__CLR4_5_27zi7zilvluli4c.R.iget(10551)==0&false))) {{
                    __CLR4_5_27zi7zilvluli4c.R.inc(10552);brb.readBits(12);
                } }else {__CLR4_5_27zi7zilvluli4c.R.inc(10553);if ((((3 == mixdef)&&(__CLR4_5_27zi7zilvluli4c.R.iget(10554)!=0|true))||(__CLR4_5_27zi7zilvluli4c.R.iget(10555)==0&false))) {{
                    __CLR4_5_27zi7zilvluli4c.R.inc(10556);int mixdeflen = brb.readBits(5);
                    __CLR4_5_27zi7zilvluli4c.R.inc(10557);if ((((1 == brb.readBits(1))&&(__CLR4_5_27zi7zilvluli4c.R.iget(10558)!=0|true))||(__CLR4_5_27zi7zilvluli4c.R.iget(10559)==0&false))) {{
                        __CLR4_5_27zi7zilvluli4c.R.inc(10560);brb.readBits(5);
                        __CLR4_5_27zi7zilvluli4c.R.inc(10561);if ((((1 == brb.readBits(1))&&(__CLR4_5_27zi7zilvluli4c.R.iget(10562)!=0|true))||(__CLR4_5_27zi7zilvluli4c.R.iget(10563)==0&false))) {{
                            __CLR4_5_27zi7zilvluli4c.R.inc(10564);brb.readBits(4);
                        }
                        }__CLR4_5_27zi7zilvluli4c.R.inc(10565);if ((((1 == brb.readBits(1))&&(__CLR4_5_27zi7zilvluli4c.R.iget(10566)!=0|true))||(__CLR4_5_27zi7zilvluli4c.R.iget(10567)==0&false))) {{
                            __CLR4_5_27zi7zilvluli4c.R.inc(10568);brb.readBits(4);
                        }
                        }__CLR4_5_27zi7zilvluli4c.R.inc(10569);if ((((1 == brb.readBits(1))&&(__CLR4_5_27zi7zilvluli4c.R.iget(10570)!=0|true))||(__CLR4_5_27zi7zilvluli4c.R.iget(10571)==0&false))) {{
                            __CLR4_5_27zi7zilvluli4c.R.inc(10572);brb.readBits(4);
                        }
                        }__CLR4_5_27zi7zilvluli4c.R.inc(10573);if ((((1 == brb.readBits(1))&&(__CLR4_5_27zi7zilvluli4c.R.iget(10574)!=0|true))||(__CLR4_5_27zi7zilvluli4c.R.iget(10575)==0&false))) {{
                            __CLR4_5_27zi7zilvluli4c.R.inc(10576);brb.readBits(4);
                        }
                        }__CLR4_5_27zi7zilvluli4c.R.inc(10577);if ((((1 == brb.readBits(1))&&(__CLR4_5_27zi7zilvluli4c.R.iget(10578)!=0|true))||(__CLR4_5_27zi7zilvluli4c.R.iget(10579)==0&false))) {{
                            __CLR4_5_27zi7zilvluli4c.R.inc(10580);brb.readBits(4);
                        }
                        }__CLR4_5_27zi7zilvluli4c.R.inc(10581);if ((((1 == brb.readBits(1))&&(__CLR4_5_27zi7zilvluli4c.R.iget(10582)!=0|true))||(__CLR4_5_27zi7zilvluli4c.R.iget(10583)==0&false))) {{
                            __CLR4_5_27zi7zilvluli4c.R.inc(10584);brb.readBits(4);
                        }
                        }__CLR4_5_27zi7zilvluli4c.R.inc(10585);if ((((1 == brb.readBits(1))&&(__CLR4_5_27zi7zilvluli4c.R.iget(10586)!=0|true))||(__CLR4_5_27zi7zilvluli4c.R.iget(10587)==0&false))) {{
                            __CLR4_5_27zi7zilvluli4c.R.inc(10588);brb.readBits(4);
                        }
                        }__CLR4_5_27zi7zilvluli4c.R.inc(10589);if ((((1 == brb.readBits(1))&&(__CLR4_5_27zi7zilvluli4c.R.iget(10590)!=0|true))||(__CLR4_5_27zi7zilvluli4c.R.iget(10591)==0&false))) {{
                            __CLR4_5_27zi7zilvluli4c.R.inc(10592);if ((((1 == brb.readBits(1))&&(__CLR4_5_27zi7zilvluli4c.R.iget(10593)!=0|true))||(__CLR4_5_27zi7zilvluli4c.R.iget(10594)==0&false))) {{
                                __CLR4_5_27zi7zilvluli4c.R.inc(10595);brb.readBits(4);
                            }
                            }__CLR4_5_27zi7zilvluli4c.R.inc(10596);if ((((1 == brb.readBits(1))&&(__CLR4_5_27zi7zilvluli4c.R.iget(10597)!=0|true))||(__CLR4_5_27zi7zilvluli4c.R.iget(10598)==0&false))) {{
                                __CLR4_5_27zi7zilvluli4c.R.inc(10599);brb.readBits(4);
                            }
                        }}
                    }}
                    }__CLR4_5_27zi7zilvluli4c.R.inc(10600);if ((((1 == brb.readBits(1))&&(__CLR4_5_27zi7zilvluli4c.R.iget(10601)!=0|true))||(__CLR4_5_27zi7zilvluli4c.R.iget(10602)==0&false))) {{
                        __CLR4_5_27zi7zilvluli4c.R.inc(10603);brb.readBits(5);
                        __CLR4_5_27zi7zilvluli4c.R.inc(10604);if ((((1 == brb.readBits(1))&&(__CLR4_5_27zi7zilvluli4c.R.iget(10605)!=0|true))||(__CLR4_5_27zi7zilvluli4c.R.iget(10606)==0&false))) {{
                            __CLR4_5_27zi7zilvluli4c.R.inc(10607);brb.readBits(7);
                            __CLR4_5_27zi7zilvluli4c.R.inc(10608);if ((((1 == brb.readBits(1))&&(__CLR4_5_27zi7zilvluli4c.R.iget(10609)!=0|true))||(__CLR4_5_27zi7zilvluli4c.R.iget(10610)==0&false))) {{
                                __CLR4_5_27zi7zilvluli4c.R.inc(10611);brb.readBits(8);
                            }
                        }}
                    }}
                    }__CLR4_5_27zi7zilvluli4c.R.inc(10612);for (int i = 0; (((i < (mixdeflen + 2))&&(__CLR4_5_27zi7zilvluli4c.R.iget(10613)!=0|true))||(__CLR4_5_27zi7zilvluli4c.R.iget(10614)==0&false)); i++) {{
                        __CLR4_5_27zi7zilvluli4c.R.inc(10615);brb.readBits(8);
                    }
                    }__CLR4_5_27zi7zilvluli4c.R.inc(10616);brb.byteSync();
                }
                }}}__CLR4_5_27zi7zilvluli4c.R.inc(10617);if ((((entry.acmod < 2)&&(__CLR4_5_27zi7zilvluli4c.R.iget(10618)!=0|true))||(__CLR4_5_27zi7zilvluli4c.R.iget(10619)==0&false))) {{
                    __CLR4_5_27zi7zilvluli4c.R.inc(10620);if ((((1 == brb.readBits(1))&&(__CLR4_5_27zi7zilvluli4c.R.iget(10621)!=0|true))||(__CLR4_5_27zi7zilvluli4c.R.iget(10622)==0&false))) {{
                        __CLR4_5_27zi7zilvluli4c.R.inc(10623);brb.readBits(14);
                    }
                    }__CLR4_5_27zi7zilvluli4c.R.inc(10624);if ((((0 == entry.acmod)&&(__CLR4_5_27zi7zilvluli4c.R.iget(10625)!=0|true))||(__CLR4_5_27zi7zilvluli4c.R.iget(10626)==0&false))) {{
                        __CLR4_5_27zi7zilvluli4c.R.inc(10627);if ((((1 == brb.readBits(1))&&(__CLR4_5_27zi7zilvluli4c.R.iget(10628)!=0|true))||(__CLR4_5_27zi7zilvluli4c.R.iget(10629)==0&false))) {{
                            __CLR4_5_27zi7zilvluli4c.R.inc(10630);brb.readBits(14);
                        }
                    }}
                    }__CLR4_5_27zi7zilvluli4c.R.inc(10631);if ((((1 == brb.readBits(1))&&(__CLR4_5_27zi7zilvluli4c.R.iget(10632)!=0|true))||(__CLR4_5_27zi7zilvluli4c.R.iget(10633)==0&false))) {{
                        __CLR4_5_27zi7zilvluli4c.R.inc(10634);if ((((numblkscod == 0)&&(__CLR4_5_27zi7zilvluli4c.R.iget(10635)!=0|true))||(__CLR4_5_27zi7zilvluli4c.R.iget(10636)==0&false))) {{
                            __CLR4_5_27zi7zilvluli4c.R.inc(10637);brb.readBits(5);
                        } }else {{
                            __CLR4_5_27zi7zilvluli4c.R.inc(10638);for (int i = 0; (((i < numberOfBlocksPerSyncFrame)&&(__CLR4_5_27zi7zilvluli4c.R.iget(10639)!=0|true))||(__CLR4_5_27zi7zilvluli4c.R.iget(10640)==0&false)); i++) {{
                                __CLR4_5_27zi7zilvluli4c.R.inc(10641);if ((((1 == brb.readBits(1))&&(__CLR4_5_27zi7zilvluli4c.R.iget(10642)!=0|true))||(__CLR4_5_27zi7zilvluli4c.R.iget(10643)==0&false))) {{
                                    __CLR4_5_27zi7zilvluli4c.R.inc(10644);brb.readBits(5);
                                }
                            }}
                        }}

                    }}
                }}
            }}
        }}
        }__CLR4_5_27zi7zilvluli4c.R.inc(10645);if ((((1 == brb.readBits(1))&&(__CLR4_5_27zi7zilvluli4c.R.iget(10646)!=0|true))||(__CLR4_5_27zi7zilvluli4c.R.iget(10647)==0&false))) {{ // infomdate
            __CLR4_5_27zi7zilvluli4c.R.inc(10648);entry.bsmod = brb.readBits(3);
        }

        }boolean __CLB4_5_2_bool1=false;__CLR4_5_27zi7zilvluli4c.R.inc(10649);switch (entry.fscod) {
            case 0:if (!__CLB4_5_2_bool1) {__CLR4_5_27zi7zilvluli4c.R.inc(10650);__CLB4_5_2_bool1=true;}
                __CLR4_5_27zi7zilvluli4c.R.inc(10651);entry.samplerate = 48000;
                __CLR4_5_27zi7zilvluli4c.R.inc(10652);break;

            case 1:if (!__CLB4_5_2_bool1) {__CLR4_5_27zi7zilvluli4c.R.inc(10653);__CLB4_5_2_bool1=true;}
                __CLR4_5_27zi7zilvluli4c.R.inc(10654);entry.samplerate = 44100;
                __CLR4_5_27zi7zilvluli4c.R.inc(10655);break;

            case 2:if (!__CLB4_5_2_bool1) {__CLR4_5_27zi7zilvluli4c.R.inc(10656);__CLB4_5_2_bool1=true;}
                __CLR4_5_27zi7zilvluli4c.R.inc(10657);entry.samplerate = 32000;
                __CLR4_5_27zi7zilvluli4c.R.inc(10658);break;

            case 3:if (!__CLB4_5_2_bool1) {__CLR4_5_27zi7zilvluli4c.R.inc(10659);__CLB4_5_2_bool1=true;} {
                boolean __CLB4_5_2_bool2=false;__CLR4_5_27zi7zilvluli4c.R.inc(10660);switch (fscod2) {
                    case 0:if (!__CLB4_5_2_bool2) {__CLR4_5_27zi7zilvluli4c.R.inc(10661);__CLB4_5_2_bool2=true;}
                        __CLR4_5_27zi7zilvluli4c.R.inc(10662);entry.samplerate = 24000;
                        __CLR4_5_27zi7zilvluli4c.R.inc(10663);break;

                    case 1:if (!__CLB4_5_2_bool2) {__CLR4_5_27zi7zilvluli4c.R.inc(10664);__CLB4_5_2_bool2=true;}
                        __CLR4_5_27zi7zilvluli4c.R.inc(10665);entry.samplerate = 22050;
                        __CLR4_5_27zi7zilvluli4c.R.inc(10666);break;

                    case 2:if (!__CLB4_5_2_bool2) {__CLR4_5_27zi7zilvluli4c.R.inc(10667);__CLB4_5_2_bool2=true;}
                        __CLR4_5_27zi7zilvluli4c.R.inc(10668);entry.samplerate = 16000;
                        __CLR4_5_27zi7zilvluli4c.R.inc(10669);break;

                    case 3:if (!__CLB4_5_2_bool2) {__CLR4_5_27zi7zilvluli4c.R.inc(10670);__CLB4_5_2_bool2=true;}
                        __CLR4_5_27zi7zilvluli4c.R.inc(10671);entry.samplerate = 0;
                        __CLR4_5_27zi7zilvluli4c.R.inc(10672);break;
                }
                __CLR4_5_27zi7zilvluli4c.R.inc(10673);break;
            }

        }
        __CLR4_5_27zi7zilvluli4c.R.inc(10674);if ((((entry.samplerate == 0)&&(__CLR4_5_27zi7zilvluli4c.R.iget(10675)!=0|true))||(__CLR4_5_27zi7zilvluli4c.R.iget(10676)==0&false))) {{
            __CLR4_5_27zi7zilvluli4c.R.inc(10677);return null;
        }

        }__CLR4_5_27zi7zilvluli4c.R.inc(10678);entry.bitrate = (int) (((double) entry.samplerate) / 1536.0 * entry.frameSize * 8);

        __CLR4_5_27zi7zilvluli4c.R.inc(10679);dataSource.position(startPosition + entry.frameSize);
        __CLR4_5_27zi7zilvluli4c.R.inc(10680);return entry;
    }finally{__CLR4_5_27zi7zilvluli4c.R.flushNeeded();}}

    private List<Sample> readSamples() throws IOException {try{__CLR4_5_27zi7zilvluli4c.R.inc(10681);
        __CLR4_5_27zi7zilvluli4c.R.inc(10682);final int framesLeft = l2i((dataSource.size() - dataSource.position()) / frameSize);
        __CLR4_5_27zi7zilvluli4c.R.inc(10683);List<Sample> mySamples = new ArrayList<Sample>(framesLeft);
        __CLR4_5_27zi7zilvluli4c.R.inc(10684);for (int i = 0; (((i < framesLeft)&&(__CLR4_5_27zi7zilvluli4c.R.iget(10685)!=0|true))||(__CLR4_5_27zi7zilvluli4c.R.iget(10686)==0&false)); i++) {{
            __CLR4_5_27zi7zilvluli4c.R.inc(10687);final int start = i * frameSize;
            __CLR4_5_27zi7zilvluli4c.R.inc(10688);mySamples.add(new Sample() {
                public void writeTo(WritableByteChannel channel) throws IOException {try{__CLR4_5_27zi7zilvluli4c.R.inc(10689);
                    __CLR4_5_27zi7zilvluli4c.R.inc(10690);dataSource.transferTo(start, frameSize, channel);
                }finally{__CLR4_5_27zi7zilvluli4c.R.flushNeeded();}}

                public long getSize() {try{__CLR4_5_27zi7zilvluli4c.R.inc(10691);
                    __CLR4_5_27zi7zilvluli4c.R.inc(10692);return frameSize;
                }finally{__CLR4_5_27zi7zilvluli4c.R.flushNeeded();}}

                public ByteBuffer asByteBuffer() {try{__CLR4_5_27zi7zilvluli4c.R.inc(10693);
                    __CLR4_5_27zi7zilvluli4c.R.inc(10694);try {
                        __CLR4_5_27zi7zilvluli4c.R.inc(10695);return dataSource.map(start, frameSize);
                    } catch (IOException e) {
                        __CLR4_5_27zi7zilvluli4c.R.inc(10696);throw new RuntimeException(e);
                    }
                }finally{__CLR4_5_27zi7zilvluli4c.R.flushNeeded();}}
            });
        }

        }__CLR4_5_27zi7zilvluli4c.R.inc(10697);return mySamples;
    }finally{__CLR4_5_27zi7zilvluli4c.R.flushNeeded();}}

    public static class BitStreamInfo extends EC3SpecificBox.Entry {
        public int frameSize;
        public int substreamid;
        public int bitrate;
        public int samplerate;
        public int strmtyp;
        public int chanmap;

        @Override
        public String toString() {try{__CLR4_5_27zi7zilvluli4c.R.inc(10698);
            __CLR4_5_27zi7zilvluli4c.R.inc(10699);return "BitStreamInfo{" +
                    "frameSize=" + frameSize +
                    ", substreamid=" + substreamid +
                    ", bitrate=" + bitrate +
                    ", samplerate=" + samplerate +
                    ", strmtyp=" + strmtyp +
                    ", chanmap=" + chanmap +
                    '}';
        }finally{__CLR4_5_27zi7zilvluli4c.R.flushNeeded();}}
    }

    @Override
    public String toString() {try{__CLR4_5_27zi7zilvluli4c.R.inc(10700);
        __CLR4_5_27zi7zilvluli4c.R.inc(10701);return "EC3TrackImpl{" +
                "bitrate=" + bitrate +
                ", bitStreamInfos=" + bitStreamInfos +
                '}';
    }finally{__CLR4_5_27zi7zilvluli4c.R.flushNeeded();}}
}
