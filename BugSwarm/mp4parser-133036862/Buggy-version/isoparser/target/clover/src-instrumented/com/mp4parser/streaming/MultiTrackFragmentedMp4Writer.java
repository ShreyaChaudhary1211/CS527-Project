/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.mp4parser.streaming;

import com.coremedia.iso.IsoFile;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.DataEntryUrlBox;
import com.coremedia.iso.boxes.DataInformationBox;
import com.coremedia.iso.boxes.DataReferenceBox;
import com.coremedia.iso.boxes.FileTypeBox;
import com.coremedia.iso.boxes.HandlerBox;
import com.coremedia.iso.boxes.HintMediaHeaderBox;
import com.coremedia.iso.boxes.MediaBox;
import com.coremedia.iso.boxes.MediaHeaderBox;
import com.coremedia.iso.boxes.MediaInformationBox;
import com.coremedia.iso.boxes.MovieBox;
import com.coremedia.iso.boxes.MovieHeaderBox;
import com.coremedia.iso.boxes.NullMediaHeaderBox;
import com.coremedia.iso.boxes.SampleSizeBox;
import com.coremedia.iso.boxes.SampleTableBox;
import com.coremedia.iso.boxes.SampleToChunkBox;
import com.coremedia.iso.boxes.SoundMediaHeaderBox;
import com.coremedia.iso.boxes.StaticChunkOffsetBox;
import com.coremedia.iso.boxes.SubtitleMediaHeaderBox;
import com.coremedia.iso.boxes.TimeToSampleBox;
import com.coremedia.iso.boxes.TrackBox;
import com.coremedia.iso.boxes.VideoMediaHeaderBox;
import com.coremedia.iso.boxes.fragment.MovieExtendsBox;
import com.coremedia.iso.boxes.fragment.MovieExtendsHeaderBox;
import com.coremedia.iso.boxes.fragment.MovieFragmentBox;
import com.coremedia.iso.boxes.fragment.MovieFragmentHeaderBox;
import com.coremedia.iso.boxes.fragment.SampleFlags;
import com.coremedia.iso.boxes.fragment.TrackExtendsBox;
import com.coremedia.iso.boxes.fragment.TrackFragmentBaseMediaDecodeTimeBox;
import com.coremedia.iso.boxes.fragment.TrackFragmentBox;
import com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox;
import com.coremedia.iso.boxes.fragment.TrackRunBox;
import com.googlecode.mp4parser.util.Mp4Arrays;
import com.mp4parser.streaming.extensions.CencEncryptTrackExtension;
import com.mp4parser.streaming.extensions.CompositionTimeSampleExtension;
import com.mp4parser.streaming.extensions.CompositionTimeTrackExtension;
import com.mp4parser.streaming.extensions.SampleFlagsSampleExtension;
import com.mp4parser.streaming.extensions.SampleFlagsTrackExtension;
import com.mp4parser.streaming.extensions.TrackIdTrackExtension;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static com.googlecode.mp4parser.util.Math.lcm;
import static com.mp4parser.streaming.StreamingSampleHelper.getSampleExtension;

/**
 *
 */
public class MultiTrackFragmentedMp4Writer implements StreamingMp4Writer {public static class __CLR4_5_2h9wh9wlvlulo53{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,22668,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private final OutputStream outputStream;
    StreamingTrack source[];
    CompositionTimeTrackExtension compositionTimeTrackExtension;
    SampleFlagsTrackExtension sampleDependencyTrackExtension;

    Date creationTime;

    Map<StreamingTrack, List<StreamingSample>> fragmentBuffers = new HashMap<StreamingTrack, List<StreamingSample>>();

    private long sequenceNumber = 1;
    private long currentFragmentStartTime = 0;
    private long currentTime = 0;

    public MultiTrackFragmentedMp4Writer(StreamingTrack[] source, OutputStream outputStream) {try{__CLR4_5_2h9wh9wlvlulo53.R.inc(22388);
        __CLR4_5_2h9wh9wlvlulo53.R.inc(22389);this.source = source;
        __CLR4_5_2h9wh9wlvlulo53.R.inc(22390);this.outputStream = outputStream;
        __CLR4_5_2h9wh9wlvlulo53.R.inc(22391);this.creationTime = new Date();
        __CLR4_5_2h9wh9wlvlulo53.R.inc(22392);HashSet<Long> trackIds = new HashSet<Long>();
        __CLR4_5_2h9wh9wlvlulo53.R.inc(22393);for (StreamingTrack streamingTrack : source) {{
            __CLR4_5_2h9wh9wlvlulo53.R.inc(22394);if ((((streamingTrack.getTrackExtension(TrackIdTrackExtension.class) != null)&&(__CLR4_5_2h9wh9wlvlulo53.R.iget(22395)!=0|true))||(__CLR4_5_2h9wh9wlvlulo53.R.iget(22396)==0&false))) {{
                __CLR4_5_2h9wh9wlvlulo53.R.inc(22397);TrackIdTrackExtension trackIdTrackExtension = streamingTrack.getTrackExtension(TrackIdTrackExtension.class);
                assert (((trackIdTrackExtension != null)&&(__CLR4_5_2h9wh9wlvlulo53.R.iget(22398)!=0|true))||(__CLR4_5_2h9wh9wlvlulo53.R.iget(22399)==0&false));
                __CLR4_5_2h9wh9wlvlulo53.R.inc(22400);if ((((trackIds.contains(trackIdTrackExtension.getTrackId()))&&(__CLR4_5_2h9wh9wlvlulo53.R.iget(22401)!=0|true))||(__CLR4_5_2h9wh9wlvlulo53.R.iget(22402)==0&false))) {{
                    __CLR4_5_2h9wh9wlvlulo53.R.inc(22403);throw new RuntimeException("There may not be two tracks with the same trackID within one file");
                }
            }}
        }}
        }__CLR4_5_2h9wh9wlvlulo53.R.inc(22404);for (StreamingTrack streamingTrack : source) {{
            __CLR4_5_2h9wh9wlvlulo53.R.inc(22405);if ((((streamingTrack.getTrackExtension(TrackIdTrackExtension.class) != null)&&(__CLR4_5_2h9wh9wlvlulo53.R.iget(22406)!=0|true))||(__CLR4_5_2h9wh9wlvlulo53.R.iget(22407)==0&false))) {{
                __CLR4_5_2h9wh9wlvlulo53.R.inc(22408);ArrayList<Long> ts = new ArrayList<Long>(trackIds);
                __CLR4_5_2h9wh9wlvlulo53.R.inc(22409);Collections.sort(ts);
                __CLR4_5_2h9wh9wlvlulo53.R.inc(22410);streamingTrack.addTrackExtension(new TrackIdTrackExtension((((ts.size() > 0 )&&(__CLR4_5_2h9wh9wlvlulo53.R.iget(22411)!=0|true))||(__CLR4_5_2h9wh9wlvlulo53.R.iget(22412)==0&false))? (ts.get(ts.size() - 1) + 1) : 1));
            }
        }}

    }}finally{__CLR4_5_2h9wh9wlvlulo53.R.flushNeeded();}}

    public void close() {try{__CLR4_5_2h9wh9wlvlulo53.R.inc(22413);

    }finally{__CLR4_5_2h9wh9wlvlulo53.R.flushNeeded();}}


    protected Box createMvhd() {try{__CLR4_5_2h9wh9wlvlulo53.R.inc(22414);
        __CLR4_5_2h9wh9wlvlulo53.R.inc(22415);MovieHeaderBox mvhd = new MovieHeaderBox();
        __CLR4_5_2h9wh9wlvlulo53.R.inc(22416);mvhd.setVersion(1);
        __CLR4_5_2h9wh9wlvlulo53.R.inc(22417);mvhd.setCreationTime(creationTime);
        __CLR4_5_2h9wh9wlvlulo53.R.inc(22418);mvhd.setModificationTime(creationTime);
        __CLR4_5_2h9wh9wlvlulo53.R.inc(22419);mvhd.setDuration(0);//no duration in moov for fragmented movies

        __CLR4_5_2h9wh9wlvlulo53.R.inc(22420);long[] timescales = new long[0];
        __CLR4_5_2h9wh9wlvlulo53.R.inc(22421);for (StreamingTrack streamingTrack : source) {{
            __CLR4_5_2h9wh9wlvlulo53.R.inc(22422);Mp4Arrays.copyOfAndAppend(timescales, streamingTrack.getTimescale());
        }
        }__CLR4_5_2h9wh9wlvlulo53.R.inc(22423);mvhd.setTimescale(lcm(timescales));
        // find the next available trackId
        __CLR4_5_2h9wh9wlvlulo53.R.inc(22424);mvhd.setNextTrackId(2);
        __CLR4_5_2h9wh9wlvlulo53.R.inc(22425);return mvhd;
    }finally{__CLR4_5_2h9wh9wlvlulo53.R.flushNeeded();}}

    protected Box createMdiaHdlr(StreamingTrack streamingTrack) {try{__CLR4_5_2h9wh9wlvlulo53.R.inc(22426);
        __CLR4_5_2h9wh9wlvlulo53.R.inc(22427);HandlerBox hdlr = new HandlerBox();
        __CLR4_5_2h9wh9wlvlulo53.R.inc(22428);hdlr.setHandlerType(streamingTrack.getHandler());
        __CLR4_5_2h9wh9wlvlulo53.R.inc(22429);return hdlr;
    }finally{__CLR4_5_2h9wh9wlvlulo53.R.flushNeeded();}}

    protected Box createMdhd(StreamingTrack streamingTrack) {try{__CLR4_5_2h9wh9wlvlulo53.R.inc(22430);
        __CLR4_5_2h9wh9wlvlulo53.R.inc(22431);MediaHeaderBox mdhd = new MediaHeaderBox();
        __CLR4_5_2h9wh9wlvlulo53.R.inc(22432);mdhd.setCreationTime(creationTime);
        __CLR4_5_2h9wh9wlvlulo53.R.inc(22433);mdhd.setModificationTime(creationTime);
        __CLR4_5_2h9wh9wlvlulo53.R.inc(22434);mdhd.setDuration(0);//no duration in moov for fragmented movies
        __CLR4_5_2h9wh9wlvlulo53.R.inc(22435);mdhd.setTimescale(streamingTrack.getTimescale());
        __CLR4_5_2h9wh9wlvlulo53.R.inc(22436);mdhd.setLanguage(streamingTrack.getLanguage());
        __CLR4_5_2h9wh9wlvlulo53.R.inc(22437);return mdhd;
    }finally{__CLR4_5_2h9wh9wlvlulo53.R.flushNeeded();}}


    protected Box createMdia(StreamingTrack streamingTrack) {try{__CLR4_5_2h9wh9wlvlulo53.R.inc(22438);
        __CLR4_5_2h9wh9wlvlulo53.R.inc(22439);MediaBox mdia = new MediaBox();
        __CLR4_5_2h9wh9wlvlulo53.R.inc(22440);mdia.addBox(createMdhd(streamingTrack));
        __CLR4_5_2h9wh9wlvlulo53.R.inc(22441);mdia.addBox(createMdiaHdlr(streamingTrack));
        __CLR4_5_2h9wh9wlvlulo53.R.inc(22442);mdia.addBox(createMinf(streamingTrack));
        __CLR4_5_2h9wh9wlvlulo53.R.inc(22443);return mdia;
    }finally{__CLR4_5_2h9wh9wlvlulo53.R.flushNeeded();}}

    protected Box createMinf(StreamingTrack streamingTrack) {try{__CLR4_5_2h9wh9wlvlulo53.R.inc(22444);
        __CLR4_5_2h9wh9wlvlulo53.R.inc(22445);MediaInformationBox minf = new MediaInformationBox();
        __CLR4_5_2h9wh9wlvlulo53.R.inc(22446);if ((((streamingTrack.getHandler().equals("vide"))&&(__CLR4_5_2h9wh9wlvlulo53.R.iget(22447)!=0|true))||(__CLR4_5_2h9wh9wlvlulo53.R.iget(22448)==0&false))) {{
            __CLR4_5_2h9wh9wlvlulo53.R.inc(22449);minf.addBox(new VideoMediaHeaderBox());
        } }else {__CLR4_5_2h9wh9wlvlulo53.R.inc(22450);if ((((streamingTrack.getHandler().equals("soun"))&&(__CLR4_5_2h9wh9wlvlulo53.R.iget(22451)!=0|true))||(__CLR4_5_2h9wh9wlvlulo53.R.iget(22452)==0&false))) {{
            __CLR4_5_2h9wh9wlvlulo53.R.inc(22453);minf.addBox(new SoundMediaHeaderBox());
        } }else {__CLR4_5_2h9wh9wlvlulo53.R.inc(22454);if ((((streamingTrack.getHandler().equals("text"))&&(__CLR4_5_2h9wh9wlvlulo53.R.iget(22455)!=0|true))||(__CLR4_5_2h9wh9wlvlulo53.R.iget(22456)==0&false))) {{
            __CLR4_5_2h9wh9wlvlulo53.R.inc(22457);minf.addBox(new NullMediaHeaderBox());
        } }else {__CLR4_5_2h9wh9wlvlulo53.R.inc(22458);if ((((streamingTrack.getHandler().equals("subt"))&&(__CLR4_5_2h9wh9wlvlulo53.R.iget(22459)!=0|true))||(__CLR4_5_2h9wh9wlvlulo53.R.iget(22460)==0&false))) {{
            __CLR4_5_2h9wh9wlvlulo53.R.inc(22461);minf.addBox(new SubtitleMediaHeaderBox());
        } }else {__CLR4_5_2h9wh9wlvlulo53.R.inc(22462);if ((((streamingTrack.getHandler().equals("hint"))&&(__CLR4_5_2h9wh9wlvlulo53.R.iget(22463)!=0|true))||(__CLR4_5_2h9wh9wlvlulo53.R.iget(22464)==0&false))) {{
            __CLR4_5_2h9wh9wlvlulo53.R.inc(22465);minf.addBox(new HintMediaHeaderBox());
        } }else {__CLR4_5_2h9wh9wlvlulo53.R.inc(22466);if ((((streamingTrack.getHandler().equals("sbtl"))&&(__CLR4_5_2h9wh9wlvlulo53.R.iget(22467)!=0|true))||(__CLR4_5_2h9wh9wlvlulo53.R.iget(22468)==0&false))) {{
            __CLR4_5_2h9wh9wlvlulo53.R.inc(22469);minf.addBox(new NullMediaHeaderBox());
        }
        }}}}}}__CLR4_5_2h9wh9wlvlulo53.R.inc(22470);minf.addBox(createDinf());
        __CLR4_5_2h9wh9wlvlulo53.R.inc(22471);minf.addBox(createStbl(streamingTrack));
        __CLR4_5_2h9wh9wlvlulo53.R.inc(22472);return minf;
    }finally{__CLR4_5_2h9wh9wlvlulo53.R.flushNeeded();}}

    protected Box createStbl(StreamingTrack streamingTrack) {try{__CLR4_5_2h9wh9wlvlulo53.R.inc(22473);
        __CLR4_5_2h9wh9wlvlulo53.R.inc(22474);SampleTableBox stbl = new SampleTableBox();

        __CLR4_5_2h9wh9wlvlulo53.R.inc(22475);stbl.addBox(streamingTrack.getSampleDescriptionBox());
        __CLR4_5_2h9wh9wlvlulo53.R.inc(22476);stbl.addBox(new TimeToSampleBox());
        __CLR4_5_2h9wh9wlvlulo53.R.inc(22477);stbl.addBox(new SampleToChunkBox());
        __CLR4_5_2h9wh9wlvlulo53.R.inc(22478);stbl.addBox(new SampleSizeBox());
        __CLR4_5_2h9wh9wlvlulo53.R.inc(22479);stbl.addBox(new StaticChunkOffsetBox());
        __CLR4_5_2h9wh9wlvlulo53.R.inc(22480);return stbl;
    }finally{__CLR4_5_2h9wh9wlvlulo53.R.flushNeeded();}}


    protected DataInformationBox createDinf() {try{__CLR4_5_2h9wh9wlvlulo53.R.inc(22481);
        __CLR4_5_2h9wh9wlvlulo53.R.inc(22482);DataInformationBox dinf = new DataInformationBox();
        __CLR4_5_2h9wh9wlvlulo53.R.inc(22483);DataReferenceBox dref = new DataReferenceBox();
        __CLR4_5_2h9wh9wlvlulo53.R.inc(22484);dinf.addBox(dref);
        __CLR4_5_2h9wh9wlvlulo53.R.inc(22485);DataEntryUrlBox url = new DataEntryUrlBox();
        __CLR4_5_2h9wh9wlvlulo53.R.inc(22486);url.setFlags(1);
        __CLR4_5_2h9wh9wlvlulo53.R.inc(22487);dref.addBox(url);
        __CLR4_5_2h9wh9wlvlulo53.R.inc(22488);return dinf;
    }finally{__CLR4_5_2h9wh9wlvlulo53.R.flushNeeded();}}

    protected Box createTrak(StreamingTrack streamingTrack) {try{__CLR4_5_2h9wh9wlvlulo53.R.inc(22489);
        __CLR4_5_2h9wh9wlvlulo53.R.inc(22490);TrackBox trackBox = new TrackBox();
        __CLR4_5_2h9wh9wlvlulo53.R.inc(22491);trackBox.addBox(streamingTrack.getTrackHeaderBox());
        __CLR4_5_2h9wh9wlvlulo53.R.inc(22492);trackBox.addBox(streamingTrack.getTrackHeaderBox());
        __CLR4_5_2h9wh9wlvlulo53.R.inc(22493);trackBox.addBox(createMdia(streamingTrack));
        __CLR4_5_2h9wh9wlvlulo53.R.inc(22494);return trackBox;
    }finally{__CLR4_5_2h9wh9wlvlulo53.R.flushNeeded();}}


    public Box createFtyp() {try{__CLR4_5_2h9wh9wlvlulo53.R.inc(22495);
        __CLR4_5_2h9wh9wlvlulo53.R.inc(22496);List<String> minorBrands = new LinkedList<String>();
        __CLR4_5_2h9wh9wlvlulo53.R.inc(22497);minorBrands.add("isom");
        __CLR4_5_2h9wh9wlvlulo53.R.inc(22498);minorBrands.add("iso6");
        __CLR4_5_2h9wh9wlvlulo53.R.inc(22499);minorBrands.add("avc1");
        __CLR4_5_2h9wh9wlvlulo53.R.inc(22500);return new FileTypeBox("isom", 0, minorBrands);
    }finally{__CLR4_5_2h9wh9wlvlulo53.R.flushNeeded();}}

    protected Box createMvex() {try{__CLR4_5_2h9wh9wlvlulo53.R.inc(22501);
        __CLR4_5_2h9wh9wlvlulo53.R.inc(22502);MovieExtendsBox mvex = new MovieExtendsBox();
        __CLR4_5_2h9wh9wlvlulo53.R.inc(22503);final MovieExtendsHeaderBox mved = new MovieExtendsHeaderBox();
        __CLR4_5_2h9wh9wlvlulo53.R.inc(22504);mved.setVersion(1);

        __CLR4_5_2h9wh9wlvlulo53.R.inc(22505);mved.setFragmentDuration(0);

        __CLR4_5_2h9wh9wlvlulo53.R.inc(22506);mvex.addBox(mved);
        __CLR4_5_2h9wh9wlvlulo53.R.inc(22507);for (StreamingTrack streamingTrack : source) {{
            __CLR4_5_2h9wh9wlvlulo53.R.inc(22508);mvex.addBox(createTrex(streamingTrack));
        }
        }__CLR4_5_2h9wh9wlvlulo53.R.inc(22509);return mvex;
    }finally{__CLR4_5_2h9wh9wlvlulo53.R.flushNeeded();}}

    protected Box createTrex(StreamingTrack streamingTrack) {try{__CLR4_5_2h9wh9wlvlulo53.R.inc(22510);
        __CLR4_5_2h9wh9wlvlulo53.R.inc(22511);TrackExtendsBox trex = new TrackExtendsBox();
        __CLR4_5_2h9wh9wlvlulo53.R.inc(22512);trex.setTrackId(streamingTrack.getTrackHeaderBox().getTrackId());
        __CLR4_5_2h9wh9wlvlulo53.R.inc(22513);trex.setDefaultSampleDescriptionIndex(1);
        __CLR4_5_2h9wh9wlvlulo53.R.inc(22514);trex.setDefaultSampleDuration(0);
        __CLR4_5_2h9wh9wlvlulo53.R.inc(22515);trex.setDefaultSampleSize(0);
        __CLR4_5_2h9wh9wlvlulo53.R.inc(22516);SampleFlags sf = new SampleFlags();
        __CLR4_5_2h9wh9wlvlulo53.R.inc(22517);if (((("soun".equals(streamingTrack.getHandler()) || "subt".equals(streamingTrack.getHandler()))&&(__CLR4_5_2h9wh9wlvlulo53.R.iget(22518)!=0|true))||(__CLR4_5_2h9wh9wlvlulo53.R.iget(22519)==0&false))) {{
            // as far as I know there is no audio encoding
            // where the sample are not self contained.
            // same seems to be true for subtitle tracks
            __CLR4_5_2h9wh9wlvlulo53.R.inc(22520);sf.setSampleDependsOn(2);
            __CLR4_5_2h9wh9wlvlulo53.R.inc(22521);sf.setSampleIsDependedOn(2);
        }
        }__CLR4_5_2h9wh9wlvlulo53.R.inc(22522);trex.setDefaultSampleFlags(sf);
        __CLR4_5_2h9wh9wlvlulo53.R.inc(22523);return trex;
    }finally{__CLR4_5_2h9wh9wlvlulo53.R.flushNeeded();}}


    protected Box createMoov() {try{__CLR4_5_2h9wh9wlvlulo53.R.inc(22524);
        __CLR4_5_2h9wh9wlvlulo53.R.inc(22525);MovieBox movieBox = new MovieBox();

        __CLR4_5_2h9wh9wlvlulo53.R.inc(22526);movieBox.addBox(createMvhd());

        __CLR4_5_2h9wh9wlvlulo53.R.inc(22527);for (StreamingTrack streamingTrack : source) {{
            __CLR4_5_2h9wh9wlvlulo53.R.inc(22528);movieBox.addBox(createTrak(streamingTrack));
            __CLR4_5_2h9wh9wlvlulo53.R.inc(22529);;
        }
        }__CLR4_5_2h9wh9wlvlulo53.R.inc(22530);movieBox.addBox(createMvex());

        // metadata here
        __CLR4_5_2h9wh9wlvlulo53.R.inc(22531);return movieBox;
    }finally{__CLR4_5_2h9wh9wlvlulo53.R.flushNeeded();}}

    class ConsumeSamplesCallable implements Callable {

        private StreamingTrack streamingTrack;

        public ConsumeSamplesCallable(StreamingTrack streamingTrack) {try{__CLR4_5_2h9wh9wlvlulo53.R.inc(22532);
            __CLR4_5_2h9wh9wlvlulo53.R.inc(22533);this.streamingTrack = streamingTrack;
        }finally{__CLR4_5_2h9wh9wlvlulo53.R.flushNeeded();}}

        public Object call() throws Exception {try{__CLR4_5_2h9wh9wlvlulo53.R.inc(22534);
            __CLR4_5_2h9wh9wlvlulo53.R.inc(22535);do {{
                __CLR4_5_2h9wh9wlvlulo53.R.inc(22536);try {
                    __CLR4_5_2h9wh9wlvlulo53.R.inc(22537);StreamingSample ss;
                    __CLR4_5_2h9wh9wlvlulo53.R.inc(22538);while ((ss = streamingTrack.getSamples().poll(100, TimeUnit.MILLISECONDS)) != null) {{
                        __CLR4_5_2h9wh9wlvlulo53.R.inc(22541);consumeSample(streamingTrack, ss);
                    }

                }} catch (InterruptedException e) {
                    __CLR4_5_2h9wh9wlvlulo53.R.inc(22542);e.printStackTrace();
                }
            } }while ((((streamingTrack.hasMoreSamples())&&(__CLR4_5_2h9wh9wlvlulo53.R.iget(22543)!=0|true))||(__CLR4_5_2h9wh9wlvlulo53.R.iget(22544)==0&false)));
            __CLR4_5_2h9wh9wlvlulo53.R.inc(22545);return null;
        }finally{__CLR4_5_2h9wh9wlvlulo53.R.flushNeeded();}}
    }

    public void write() throws IOException {try{__CLR4_5_2h9wh9wlvlulo53.R.inc(22546);
        __CLR4_5_2h9wh9wlvlulo53.R.inc(22547);final WritableByteChannel out = Channels.newChannel(outputStream);

        __CLR4_5_2h9wh9wlvlulo53.R.inc(22548);createFtyp().getBox(out);
        __CLR4_5_2h9wh9wlvlulo53.R.inc(22549);createMoov().getBox(out);
        __CLR4_5_2h9wh9wlvlulo53.R.inc(22550);ExecutorService es = Executors.newFixedThreadPool(source.length);
        __CLR4_5_2h9wh9wlvlulo53.R.inc(22551);for (StreamingTrack streamingTrack : source) {{
            __CLR4_5_2h9wh9wlvlulo53.R.inc(22552);es.submit(new ConsumeSamplesCallable(streamingTrack));
        }
    }}finally{__CLR4_5_2h9wh9wlvlulo53.R.flushNeeded();}}


    private synchronized void consumeSample(StreamingTrack streamingTrack, StreamingSample ss) throws IOException {try{__CLR4_5_2h9wh9wlvlulo53.R.inc(22553);
        __CLR4_5_2h9wh9wlvlulo53.R.inc(22554);SampleFlagsSampleExtension sampleDependencySampleExtension = null;
        __CLR4_5_2h9wh9wlvlulo53.R.inc(22555);CompositionTimeSampleExtension compositionTimeSampleExtension = null;
        __CLR4_5_2h9wh9wlvlulo53.R.inc(22556);for (SampleExtension sampleExtension : ss.getExtensions()) {{
            __CLR4_5_2h9wh9wlvlulo53.R.inc(22557);if ((((sampleExtension instanceof SampleFlagsSampleExtension)&&(__CLR4_5_2h9wh9wlvlulo53.R.iget(22558)!=0|true))||(__CLR4_5_2h9wh9wlvlulo53.R.iget(22559)==0&false))) {{
                __CLR4_5_2h9wh9wlvlulo53.R.inc(22560);sampleDependencySampleExtension = (SampleFlagsSampleExtension) sampleExtension;
            } }else {__CLR4_5_2h9wh9wlvlulo53.R.inc(22561);if ((((sampleExtension instanceof CompositionTimeSampleExtension)&&(__CLR4_5_2h9wh9wlvlulo53.R.iget(22562)!=0|true))||(__CLR4_5_2h9wh9wlvlulo53.R.iget(22563)==0&false))) {{
                __CLR4_5_2h9wh9wlvlulo53.R.inc(22564);compositionTimeSampleExtension = (CompositionTimeSampleExtension) sampleExtension;
            }
        }}}
        }__CLR4_5_2h9wh9wlvlulo53.R.inc(22565);currentTime += ss.getDuration();
        // 3 seconds = 3 * source.getTimescale()
        __CLR4_5_2h9wh9wlvlulo53.R.inc(22566);fragmentBuffers.get(streamingTrack).add(ss);
        __CLR4_5_2h9wh9wlvlulo53.R.inc(22567);if ((((currentTime > currentFragmentStartTime + 3 * streamingTrack.getTimescale() &&
                fragmentBuffers.size() > 0 &&
                (sampleDependencyTrackExtension == null ||
                        sampleDependencySampleExtension == null ||
                        sampleDependencySampleExtension.isSyncSample()))&&(__CLR4_5_2h9wh9wlvlulo53.R.iget(22568)!=0|true))||(__CLR4_5_2h9wh9wlvlulo53.R.iget(22569)==0&false))) {{
            __CLR4_5_2h9wh9wlvlulo53.R.inc(22570);WritableByteChannel out = Channels.newChannel(outputStream);
            __CLR4_5_2h9wh9wlvlulo53.R.inc(22571);createMoof(streamingTrack).getBox(out);
            __CLR4_5_2h9wh9wlvlulo53.R.inc(22572);createMdat(streamingTrack).getBox(out);
            __CLR4_5_2h9wh9wlvlulo53.R.inc(22573);currentFragmentStartTime = currentTime;
            __CLR4_5_2h9wh9wlvlulo53.R.inc(22574);fragmentBuffers.clear();
        }
    }}finally{__CLR4_5_2h9wh9wlvlulo53.R.flushNeeded();}}

    private Box createMoof(StreamingTrack streamingTrack) {try{__CLR4_5_2h9wh9wlvlulo53.R.inc(22575);
        __CLR4_5_2h9wh9wlvlulo53.R.inc(22576);MovieFragmentBox moof = new MovieFragmentBox();
        __CLR4_5_2h9wh9wlvlulo53.R.inc(22577);createMfhd(sequenceNumber, moof);
        __CLR4_5_2h9wh9wlvlulo53.R.inc(22578);createTraf(streamingTrack, moof);

        __CLR4_5_2h9wh9wlvlulo53.R.inc(22579);TrackRunBox firstTrun = moof.getTrackRunBoxes().get(0);
        __CLR4_5_2h9wh9wlvlulo53.R.inc(22580);firstTrun.setDataOffset(1); // dummy to make size correct
        __CLR4_5_2h9wh9wlvlulo53.R.inc(22581);firstTrun.setDataOffset((int) (8 + moof.getSize())); // mdat header + moof size

        __CLR4_5_2h9wh9wlvlulo53.R.inc(22582);sequenceNumber++;
        __CLR4_5_2h9wh9wlvlulo53.R.inc(22583);return moof;

    }finally{__CLR4_5_2h9wh9wlvlulo53.R.flushNeeded();}}

    protected void createTfhd(StreamingTrack streamingTrack, TrackFragmentBox parent) {try{__CLR4_5_2h9wh9wlvlulo53.R.inc(22584);
        __CLR4_5_2h9wh9wlvlulo53.R.inc(22585);TrackFragmentHeaderBox tfhd = new TrackFragmentHeaderBox();
        __CLR4_5_2h9wh9wlvlulo53.R.inc(22586);SampleFlags sf = new SampleFlags();

        __CLR4_5_2h9wh9wlvlulo53.R.inc(22587);tfhd.setDefaultSampleFlags(sf);
        __CLR4_5_2h9wh9wlvlulo53.R.inc(22588);tfhd.setBaseDataOffset(-1);
        __CLR4_5_2h9wh9wlvlulo53.R.inc(22589);tfhd.setTrackId(streamingTrack.getTrackExtension(TrackIdTrackExtension.class).getTrackId());
        __CLR4_5_2h9wh9wlvlulo53.R.inc(22590);tfhd.setDefaultBaseIsMoof(true);
        __CLR4_5_2h9wh9wlvlulo53.R.inc(22591);parent.addBox(tfhd);
    }finally{__CLR4_5_2h9wh9wlvlulo53.R.flushNeeded();}}

    protected void createTfdt(TrackFragmentBox parent) {try{__CLR4_5_2h9wh9wlvlulo53.R.inc(22592);
        __CLR4_5_2h9wh9wlvlulo53.R.inc(22593);TrackFragmentBaseMediaDecodeTimeBox tfdt = new TrackFragmentBaseMediaDecodeTimeBox();
        __CLR4_5_2h9wh9wlvlulo53.R.inc(22594);tfdt.setVersion(1);
        __CLR4_5_2h9wh9wlvlulo53.R.inc(22595);tfdt.setBaseMediaDecodeTime(currentFragmentStartTime);
        __CLR4_5_2h9wh9wlvlulo53.R.inc(22596);parent.addBox(tfdt);
    }finally{__CLR4_5_2h9wh9wlvlulo53.R.flushNeeded();}}

    protected void createTrun(StreamingTrack streamingTrack, TrackFragmentBox parent) {try{__CLR4_5_2h9wh9wlvlulo53.R.inc(22597);
        __CLR4_5_2h9wh9wlvlulo53.R.inc(22598);TrackRunBox trun = new TrackRunBox();
        __CLR4_5_2h9wh9wlvlulo53.R.inc(22599);trun.setVersion(1);

        __CLR4_5_2h9wh9wlvlulo53.R.inc(22600);trun.setSampleDurationPresent(true);
        __CLR4_5_2h9wh9wlvlulo53.R.inc(22601);trun.setSampleSizePresent(true);
        __CLR4_5_2h9wh9wlvlulo53.R.inc(22602);List<TrackRunBox.Entry> entries = new ArrayList<TrackRunBox.Entry>(fragmentBuffers.size());


        __CLR4_5_2h9wh9wlvlulo53.R.inc(22603);trun.setSampleCompositionTimeOffsetPresent(streamingTrack.getTrackExtension(CompositionTimeTrackExtension.class) != null);

        __CLR4_5_2h9wh9wlvlulo53.R.inc(22604);boolean sampleFlagsRequired = streamingTrack.getTrackExtension(SampleFlagsTrackExtension.class) != null;

        __CLR4_5_2h9wh9wlvlulo53.R.inc(22605);trun.setSampleFlagsPresent(sampleFlagsRequired);

        __CLR4_5_2h9wh9wlvlulo53.R.inc(22606);for (StreamingSample streamingSample : fragmentBuffers.get(streamingTrack)) {{
            __CLR4_5_2h9wh9wlvlulo53.R.inc(22607);TrackRunBox.Entry entry = new TrackRunBox.Entry();
            __CLR4_5_2h9wh9wlvlulo53.R.inc(22608);entry.setSampleSize(streamingSample.getContent().remaining());
            __CLR4_5_2h9wh9wlvlulo53.R.inc(22609);if ((((sampleFlagsRequired)&&(__CLR4_5_2h9wh9wlvlulo53.R.iget(22610)!=0|true))||(__CLR4_5_2h9wh9wlvlulo53.R.iget(22611)==0&false))) {{
                __CLR4_5_2h9wh9wlvlulo53.R.inc(22612);SampleFlagsSampleExtension sampleFlagsSampleExtension =
                        getSampleExtension(streamingSample, SampleFlagsSampleExtension.class);
                assert (((sampleFlagsSampleExtension != null )&&(__CLR4_5_2h9wh9wlvlulo53.R.iget(22613)!=0|true))||(__CLR4_5_2h9wh9wlvlulo53.R.iget(22614)==0&false)): "SampleDependencySampleExtension missing even though SampleDependencyTrackExtension was present";
                __CLR4_5_2h9wh9wlvlulo53.R.inc(22615);SampleFlags sflags = new SampleFlags();
                __CLR4_5_2h9wh9wlvlulo53.R.inc(22616);sflags.setIsLeading(sampleFlagsSampleExtension.getIsLeading());
                __CLR4_5_2h9wh9wlvlulo53.R.inc(22617);sflags.setSampleIsDependedOn(sampleFlagsSampleExtension.getSampleIsDependedOn());
                __CLR4_5_2h9wh9wlvlulo53.R.inc(22618);sflags.setSampleDependsOn(sampleFlagsSampleExtension.getSampleDependsOn());
                __CLR4_5_2h9wh9wlvlulo53.R.inc(22619);sflags.setSampleHasRedundancy(sampleFlagsSampleExtension.getSampleHasRedundancy());
                __CLR4_5_2h9wh9wlvlulo53.R.inc(22620);sflags.setSampleIsDifferenceSample(sampleFlagsSampleExtension.isSampleIsNonSyncSample());
                __CLR4_5_2h9wh9wlvlulo53.R.inc(22621);sflags.setSamplePaddingValue(sampleFlagsSampleExtension.getSamplePaddingValue());
                __CLR4_5_2h9wh9wlvlulo53.R.inc(22622);sflags.setSampleDegradationPriority(sampleFlagsSampleExtension.getSampleDegradationPriority());

                __CLR4_5_2h9wh9wlvlulo53.R.inc(22623);entry.setSampleFlags(sflags);

            }

            }__CLR4_5_2h9wh9wlvlulo53.R.inc(22624);entry.setSampleDuration(streamingSample.getDuration());

            __CLR4_5_2h9wh9wlvlulo53.R.inc(22625);if ((((trun.isSampleCompositionTimeOffsetPresent())&&(__CLR4_5_2h9wh9wlvlulo53.R.iget(22626)!=0|true))||(__CLR4_5_2h9wh9wlvlulo53.R.iget(22627)==0&false))) {{
                __CLR4_5_2h9wh9wlvlulo53.R.inc(22628);CompositionTimeSampleExtension compositionTimeSampleExtension =
                        getSampleExtension(streamingSample, CompositionTimeSampleExtension.class);
                assert (((compositionTimeSampleExtension != null )&&(__CLR4_5_2h9wh9wlvlulo53.R.iget(22629)!=0|true))||(__CLR4_5_2h9wh9wlvlulo53.R.iget(22630)==0&false)): "CompositionTimeSampleExtension missing even though CompositionTimeTrackExtension was present";
                __CLR4_5_2h9wh9wlvlulo53.R.inc(22631);entry.setSampleCompositionTimeOffset(compositionTimeSampleExtension.getCompositionTimeOffset());
            }

            }__CLR4_5_2h9wh9wlvlulo53.R.inc(22632);entries.add(entry);
        }

        }__CLR4_5_2h9wh9wlvlulo53.R.inc(22633);trun.setEntries(entries);

        __CLR4_5_2h9wh9wlvlulo53.R.inc(22634);parent.addBox(trun);
    }finally{__CLR4_5_2h9wh9wlvlulo53.R.flushNeeded();}}

    private void createTraf(StreamingTrack streamingTrack, MovieFragmentBox moof) {try{__CLR4_5_2h9wh9wlvlulo53.R.inc(22635);
        __CLR4_5_2h9wh9wlvlulo53.R.inc(22636);TrackFragmentBox traf = new TrackFragmentBox();
        __CLR4_5_2h9wh9wlvlulo53.R.inc(22637);moof.addBox(traf);
        __CLR4_5_2h9wh9wlvlulo53.R.inc(22638);createTfhd(streamingTrack, traf);
        __CLR4_5_2h9wh9wlvlulo53.R.inc(22639);createTfdt(traf);
        __CLR4_5_2h9wh9wlvlulo53.R.inc(22640);createTrun(streamingTrack, traf);

        __CLR4_5_2h9wh9wlvlulo53.R.inc(22641);if ((((streamingTrack.getTrackExtension(CencEncryptTrackExtension.class) != null)&&(__CLR4_5_2h9wh9wlvlulo53.R.iget(22642)!=0|true))||(__CLR4_5_2h9wh9wlvlulo53.R.iget(22643)==0&false))) {{
            //     createSaiz(getTrackExtension(source, CencEncryptTrackExtension.class), sequenceNumber, traf);
            //     createSenc(getTrackExtension(source, CencEncryptTrackExtension.class), sequenceNumber, traf);
            //     createSaio(getTrackExtension(source, CencEncryptTrackExtension.class), sequenceNumber, traf);
        }


  /*      Map<String, List<GroupEntry>> groupEntryFamilies = new HashMap<String, List<GroupEntry>>();
        for (Map.Entry<GroupEntry, long[]> sg : track.getSampleGroups().entrySet()) {
            String type = sg.getKey().getType();
            List<GroupEntry> groupEntries = groupEntryFamilies.get(type);
            if (groupEntries == null) {
                groupEntries = new ArrayList<GroupEntry>();
                groupEntryFamilies.put(type, groupEntries);
            }
            groupEntries.add(sg.getKey());
        }


        for (Map.Entry<String, List<GroupEntry>> sg : groupEntryFamilies.entrySet()) {
            SampleGroupDescriptionBox sgpd = new SampleGroupDescriptionBox();
            String type = sg.getKey();
            sgpd.setGroupEntries(sg.getValue());
            SampleToGroupBox sbgp = new SampleToGroupBox();
            sbgp.setGroupingType(type);
            SampleToGroupBox.Entry last = null;
            for (int i = l2i(startSample - 1); i < l2i(endSample - 1); i++) {
                int index = 0;
                for (int j = 0; j < sg.getValue().size(); j++) {
                    GroupEntry groupEntry = sg.getValue().get(j);
                    long[] sampleNums = track.getSampleGroups().get(groupEntry);
                    if (Arrays.binarySearch(sampleNums, i) >= 0) {
                        index = j + 1;
                    }
                }
                if (last == null || last.getGroupDescriptionIndex() != index) {
                    last = new SampleToGroupBox.Entry(1, index);
                    sbgp.getEntries().add(last);
                } else {
                    last.setSampleCount(last.getSampleCount() + 1);
                }
            }
            traf.addBox(sgpd);
            traf.addBox(sbgp);
        }*/

    }}finally{__CLR4_5_2h9wh9wlvlulo53.R.flushNeeded();}}

    private void createMfhd(long sequenceNumber, MovieFragmentBox moof) {try{__CLR4_5_2h9wh9wlvlulo53.R.inc(22644);
        __CLR4_5_2h9wh9wlvlulo53.R.inc(22645);MovieFragmentHeaderBox mfhd = new MovieFragmentHeaderBox();
        __CLR4_5_2h9wh9wlvlulo53.R.inc(22646);mfhd.setSequenceNumber(sequenceNumber);
        __CLR4_5_2h9wh9wlvlulo53.R.inc(22647);moof.addBox(mfhd);
    }finally{__CLR4_5_2h9wh9wlvlulo53.R.flushNeeded();}}

    private Box createMdat(final StreamingTrack streamingTrack) {try{__CLR4_5_2h9wh9wlvlulo53.R.inc(22648);
        __CLR4_5_2h9wh9wlvlulo53.R.inc(22649);return new WriteOnlyBox("mdat") {
            public long getSize() {try{__CLR4_5_2h9wh9wlvlulo53.R.inc(22650);
                __CLR4_5_2h9wh9wlvlulo53.R.inc(22651);long l = 8;
                __CLR4_5_2h9wh9wlvlulo53.R.inc(22652);for (StreamingSample streamingSample : fragmentBuffers.get(streamingTrack)) {{
                    __CLR4_5_2h9wh9wlvlulo53.R.inc(22653);l += streamingSample.getContent().remaining();
                }
                }__CLR4_5_2h9wh9wlvlulo53.R.inc(22654);return l;
            }finally{__CLR4_5_2h9wh9wlvlulo53.R.flushNeeded();}}

            public void getBox(WritableByteChannel writableByteChannel) throws IOException {try{__CLR4_5_2h9wh9wlvlulo53.R.inc(22655);
                __CLR4_5_2h9wh9wlvlulo53.R.inc(22656);ArrayList<ByteBuffer> sampleContents = new ArrayList<ByteBuffer>();
                __CLR4_5_2h9wh9wlvlulo53.R.inc(22657);long l = 8;
                __CLR4_5_2h9wh9wlvlulo53.R.inc(22658);for (StreamingSample streamingSample : fragmentBuffers.get(streamingTrack)) {{
                    __CLR4_5_2h9wh9wlvlulo53.R.inc(22659);ByteBuffer sampleContent = streamingSample.getContent();
                    __CLR4_5_2h9wh9wlvlulo53.R.inc(22660);sampleContents.add(sampleContent);
                    __CLR4_5_2h9wh9wlvlulo53.R.inc(22661);l += sampleContent.remaining();
                }
                }__CLR4_5_2h9wh9wlvlulo53.R.inc(22662);ByteBuffer bb = ByteBuffer.allocate(8);
                __CLR4_5_2h9wh9wlvlulo53.R.inc(22663);IsoTypeWriter.writeUInt32(bb, l);
                __CLR4_5_2h9wh9wlvlulo53.R.inc(22664);bb.put(IsoFile.fourCCtoBytes(getType()));
                __CLR4_5_2h9wh9wlvlulo53.R.inc(22665);writableByteChannel.write((ByteBuffer) bb.rewind());

                __CLR4_5_2h9wh9wlvlulo53.R.inc(22666);for (ByteBuffer sampleContent : sampleContents) {{
                    __CLR4_5_2h9wh9wlvlulo53.R.inc(22667);writableByteChannel.write(sampleContent);
                }
            }}finally{__CLR4_5_2h9wh9wlvlulo53.R.flushNeeded();}}

        };
    }finally{__CLR4_5_2h9wh9wlvlulo53.R.flushNeeded();}}
}
