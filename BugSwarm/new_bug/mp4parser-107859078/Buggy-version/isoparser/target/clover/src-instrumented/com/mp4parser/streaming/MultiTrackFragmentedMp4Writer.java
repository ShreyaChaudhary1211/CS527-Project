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
public class MultiTrackFragmentedMp4Writer implements StreamingMp4Writer {public static class __CLR4_5_2h79h79lvl9elfc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,22573,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private final OutputStream outputStream;
    StreamingTrack source[];
    CompositionTimeTrackExtension compositionTimeTrackExtension;
    SampleFlagsTrackExtension sampleDependencyTrackExtension;

    Date creationTime;

    Map<StreamingTrack, List<StreamingSample>> fragmentBuffers = new HashMap<StreamingTrack, List<StreamingSample>>();

    private long sequenceNumber = 1;
    private long currentFragmentStartTime = 0;
    private long currentTime = 0;

    public MultiTrackFragmentedMp4Writer(StreamingTrack[] source, OutputStream outputStream) {try{__CLR4_5_2h79h79lvl9elfc.R.inc(22293);
        __CLR4_5_2h79h79lvl9elfc.R.inc(22294);this.source = source;
        __CLR4_5_2h79h79lvl9elfc.R.inc(22295);this.outputStream = outputStream;
        __CLR4_5_2h79h79lvl9elfc.R.inc(22296);this.creationTime = new Date();
        __CLR4_5_2h79h79lvl9elfc.R.inc(22297);HashSet<Long> trackIds = new HashSet<Long>();
        __CLR4_5_2h79h79lvl9elfc.R.inc(22298);for (StreamingTrack streamingTrack : source) {{
            __CLR4_5_2h79h79lvl9elfc.R.inc(22299);if ((((streamingTrack.getTrackExtension(TrackIdTrackExtension.class) != null)&&(__CLR4_5_2h79h79lvl9elfc.R.iget(22300)!=0|true))||(__CLR4_5_2h79h79lvl9elfc.R.iget(22301)==0&false))) {{
                __CLR4_5_2h79h79lvl9elfc.R.inc(22302);TrackIdTrackExtension trackIdTrackExtension = streamingTrack.getTrackExtension(TrackIdTrackExtension.class);
                assert (((trackIdTrackExtension != null)&&(__CLR4_5_2h79h79lvl9elfc.R.iget(22303)!=0|true))||(__CLR4_5_2h79h79lvl9elfc.R.iget(22304)==0&false));
                __CLR4_5_2h79h79lvl9elfc.R.inc(22305);if ((((trackIds.contains(trackIdTrackExtension.getTrackId()))&&(__CLR4_5_2h79h79lvl9elfc.R.iget(22306)!=0|true))||(__CLR4_5_2h79h79lvl9elfc.R.iget(22307)==0&false))) {{
                    __CLR4_5_2h79h79lvl9elfc.R.inc(22308);throw new RuntimeException("There may not be two tracks with the same trackID within one file");
                }
            }}
        }}
        }__CLR4_5_2h79h79lvl9elfc.R.inc(22309);for (StreamingTrack streamingTrack : source) {{
            __CLR4_5_2h79h79lvl9elfc.R.inc(22310);if ((((streamingTrack.getTrackExtension(TrackIdTrackExtension.class) != null)&&(__CLR4_5_2h79h79lvl9elfc.R.iget(22311)!=0|true))||(__CLR4_5_2h79h79lvl9elfc.R.iget(22312)==0&false))) {{
                __CLR4_5_2h79h79lvl9elfc.R.inc(22313);ArrayList<Long> ts = new ArrayList<Long>(trackIds);
                __CLR4_5_2h79h79lvl9elfc.R.inc(22314);Collections.sort(ts);
                __CLR4_5_2h79h79lvl9elfc.R.inc(22315);streamingTrack.addTrackExtension(new TrackIdTrackExtension((((ts.size() > 0 )&&(__CLR4_5_2h79h79lvl9elfc.R.iget(22316)!=0|true))||(__CLR4_5_2h79h79lvl9elfc.R.iget(22317)==0&false))? (ts.get(ts.size() - 1) + 1) : 1));
            }
        }}

    }}finally{__CLR4_5_2h79h79lvl9elfc.R.flushNeeded();}}

    public void close() {try{__CLR4_5_2h79h79lvl9elfc.R.inc(22318);

    }finally{__CLR4_5_2h79h79lvl9elfc.R.flushNeeded();}}


    protected Box createMvhd() {try{__CLR4_5_2h79h79lvl9elfc.R.inc(22319);
        __CLR4_5_2h79h79lvl9elfc.R.inc(22320);MovieHeaderBox mvhd = new MovieHeaderBox();
        __CLR4_5_2h79h79lvl9elfc.R.inc(22321);mvhd.setVersion(1);
        __CLR4_5_2h79h79lvl9elfc.R.inc(22322);mvhd.setCreationTime(creationTime);
        __CLR4_5_2h79h79lvl9elfc.R.inc(22323);mvhd.setModificationTime(creationTime);
        __CLR4_5_2h79h79lvl9elfc.R.inc(22324);mvhd.setDuration(0);//no duration in moov for fragmented movies

        __CLR4_5_2h79h79lvl9elfc.R.inc(22325);long[] timescales = new long[0];
        __CLR4_5_2h79h79lvl9elfc.R.inc(22326);for (StreamingTrack streamingTrack : source) {{
            __CLR4_5_2h79h79lvl9elfc.R.inc(22327);Mp4Arrays.copyOfAndAppend(timescales, streamingTrack.getTimescale());
        }
        }__CLR4_5_2h79h79lvl9elfc.R.inc(22328);mvhd.setTimescale(lcm(timescales));
        // find the next available trackId
        __CLR4_5_2h79h79lvl9elfc.R.inc(22329);mvhd.setNextTrackId(2);
        __CLR4_5_2h79h79lvl9elfc.R.inc(22330);return mvhd;
    }finally{__CLR4_5_2h79h79lvl9elfc.R.flushNeeded();}}

    protected Box createMdiaHdlr(StreamingTrack streamingTrack) {try{__CLR4_5_2h79h79lvl9elfc.R.inc(22331);
        __CLR4_5_2h79h79lvl9elfc.R.inc(22332);HandlerBox hdlr = new HandlerBox();
        __CLR4_5_2h79h79lvl9elfc.R.inc(22333);hdlr.setHandlerType(streamingTrack.getHandler());
        __CLR4_5_2h79h79lvl9elfc.R.inc(22334);return hdlr;
    }finally{__CLR4_5_2h79h79lvl9elfc.R.flushNeeded();}}

    protected Box createMdhd(StreamingTrack streamingTrack) {try{__CLR4_5_2h79h79lvl9elfc.R.inc(22335);
        __CLR4_5_2h79h79lvl9elfc.R.inc(22336);MediaHeaderBox mdhd = new MediaHeaderBox();
        __CLR4_5_2h79h79lvl9elfc.R.inc(22337);mdhd.setCreationTime(creationTime);
        __CLR4_5_2h79h79lvl9elfc.R.inc(22338);mdhd.setModificationTime(creationTime);
        __CLR4_5_2h79h79lvl9elfc.R.inc(22339);mdhd.setDuration(0);//no duration in moov for fragmented movies
        __CLR4_5_2h79h79lvl9elfc.R.inc(22340);mdhd.setTimescale(streamingTrack.getTimescale());
        __CLR4_5_2h79h79lvl9elfc.R.inc(22341);mdhd.setLanguage(streamingTrack.getLanguage());
        __CLR4_5_2h79h79lvl9elfc.R.inc(22342);return mdhd;
    }finally{__CLR4_5_2h79h79lvl9elfc.R.flushNeeded();}}


    protected Box createMdia(StreamingTrack streamingTrack) {try{__CLR4_5_2h79h79lvl9elfc.R.inc(22343);
        __CLR4_5_2h79h79lvl9elfc.R.inc(22344);MediaBox mdia = new MediaBox();
        __CLR4_5_2h79h79lvl9elfc.R.inc(22345);mdia.addBox(createMdhd(streamingTrack));
        __CLR4_5_2h79h79lvl9elfc.R.inc(22346);mdia.addBox(createMdiaHdlr(streamingTrack));
        __CLR4_5_2h79h79lvl9elfc.R.inc(22347);mdia.addBox(createMinf(streamingTrack));
        __CLR4_5_2h79h79lvl9elfc.R.inc(22348);return mdia;
    }finally{__CLR4_5_2h79h79lvl9elfc.R.flushNeeded();}}

    protected Box createMinf(StreamingTrack streamingTrack) {try{__CLR4_5_2h79h79lvl9elfc.R.inc(22349);
        __CLR4_5_2h79h79lvl9elfc.R.inc(22350);MediaInformationBox minf = new MediaInformationBox();
        __CLR4_5_2h79h79lvl9elfc.R.inc(22351);if ((((streamingTrack.getHandler().equals("vide"))&&(__CLR4_5_2h79h79lvl9elfc.R.iget(22352)!=0|true))||(__CLR4_5_2h79h79lvl9elfc.R.iget(22353)==0&false))) {{
            __CLR4_5_2h79h79lvl9elfc.R.inc(22354);minf.addBox(new VideoMediaHeaderBox());
        } }else {__CLR4_5_2h79h79lvl9elfc.R.inc(22355);if ((((streamingTrack.getHandler().equals("soun"))&&(__CLR4_5_2h79h79lvl9elfc.R.iget(22356)!=0|true))||(__CLR4_5_2h79h79lvl9elfc.R.iget(22357)==0&false))) {{
            __CLR4_5_2h79h79lvl9elfc.R.inc(22358);minf.addBox(new SoundMediaHeaderBox());
        } }else {__CLR4_5_2h79h79lvl9elfc.R.inc(22359);if ((((streamingTrack.getHandler().equals("text"))&&(__CLR4_5_2h79h79lvl9elfc.R.iget(22360)!=0|true))||(__CLR4_5_2h79h79lvl9elfc.R.iget(22361)==0&false))) {{
            __CLR4_5_2h79h79lvl9elfc.R.inc(22362);minf.addBox(new NullMediaHeaderBox());
        } }else {__CLR4_5_2h79h79lvl9elfc.R.inc(22363);if ((((streamingTrack.getHandler().equals("subt"))&&(__CLR4_5_2h79h79lvl9elfc.R.iget(22364)!=0|true))||(__CLR4_5_2h79h79lvl9elfc.R.iget(22365)==0&false))) {{
            __CLR4_5_2h79h79lvl9elfc.R.inc(22366);minf.addBox(new SubtitleMediaHeaderBox());
        } }else {__CLR4_5_2h79h79lvl9elfc.R.inc(22367);if ((((streamingTrack.getHandler().equals("hint"))&&(__CLR4_5_2h79h79lvl9elfc.R.iget(22368)!=0|true))||(__CLR4_5_2h79h79lvl9elfc.R.iget(22369)==0&false))) {{
            __CLR4_5_2h79h79lvl9elfc.R.inc(22370);minf.addBox(new HintMediaHeaderBox());
        } }else {__CLR4_5_2h79h79lvl9elfc.R.inc(22371);if ((((streamingTrack.getHandler().equals("sbtl"))&&(__CLR4_5_2h79h79lvl9elfc.R.iget(22372)!=0|true))||(__CLR4_5_2h79h79lvl9elfc.R.iget(22373)==0&false))) {{
            __CLR4_5_2h79h79lvl9elfc.R.inc(22374);minf.addBox(new NullMediaHeaderBox());
        }
        }}}}}}__CLR4_5_2h79h79lvl9elfc.R.inc(22375);minf.addBox(createDinf());
        __CLR4_5_2h79h79lvl9elfc.R.inc(22376);minf.addBox(createStbl(streamingTrack));
        __CLR4_5_2h79h79lvl9elfc.R.inc(22377);return minf;
    }finally{__CLR4_5_2h79h79lvl9elfc.R.flushNeeded();}}

    protected Box createStbl(StreamingTrack streamingTrack) {try{__CLR4_5_2h79h79lvl9elfc.R.inc(22378);
        __CLR4_5_2h79h79lvl9elfc.R.inc(22379);SampleTableBox stbl = new SampleTableBox();

        __CLR4_5_2h79h79lvl9elfc.R.inc(22380);stbl.addBox(streamingTrack.getSampleDescriptionBox());
        __CLR4_5_2h79h79lvl9elfc.R.inc(22381);stbl.addBox(new TimeToSampleBox());
        __CLR4_5_2h79h79lvl9elfc.R.inc(22382);stbl.addBox(new SampleToChunkBox());
        __CLR4_5_2h79h79lvl9elfc.R.inc(22383);stbl.addBox(new SampleSizeBox());
        __CLR4_5_2h79h79lvl9elfc.R.inc(22384);stbl.addBox(new StaticChunkOffsetBox());
        __CLR4_5_2h79h79lvl9elfc.R.inc(22385);return stbl;
    }finally{__CLR4_5_2h79h79lvl9elfc.R.flushNeeded();}}


    protected DataInformationBox createDinf() {try{__CLR4_5_2h79h79lvl9elfc.R.inc(22386);
        __CLR4_5_2h79h79lvl9elfc.R.inc(22387);DataInformationBox dinf = new DataInformationBox();
        __CLR4_5_2h79h79lvl9elfc.R.inc(22388);DataReferenceBox dref = new DataReferenceBox();
        __CLR4_5_2h79h79lvl9elfc.R.inc(22389);dinf.addBox(dref);
        __CLR4_5_2h79h79lvl9elfc.R.inc(22390);DataEntryUrlBox url = new DataEntryUrlBox();
        __CLR4_5_2h79h79lvl9elfc.R.inc(22391);url.setFlags(1);
        __CLR4_5_2h79h79lvl9elfc.R.inc(22392);dref.addBox(url);
        __CLR4_5_2h79h79lvl9elfc.R.inc(22393);return dinf;
    }finally{__CLR4_5_2h79h79lvl9elfc.R.flushNeeded();}}

    protected Box createTrak(StreamingTrack streamingTrack) {try{__CLR4_5_2h79h79lvl9elfc.R.inc(22394);
        __CLR4_5_2h79h79lvl9elfc.R.inc(22395);TrackBox trackBox = new TrackBox();
        __CLR4_5_2h79h79lvl9elfc.R.inc(22396);trackBox.addBox(streamingTrack.getTrackHeaderBox());
        __CLR4_5_2h79h79lvl9elfc.R.inc(22397);trackBox.addBox(streamingTrack.getTrackHeaderBox());
        __CLR4_5_2h79h79lvl9elfc.R.inc(22398);trackBox.addBox(createMdia(streamingTrack));
        __CLR4_5_2h79h79lvl9elfc.R.inc(22399);return trackBox;
    }finally{__CLR4_5_2h79h79lvl9elfc.R.flushNeeded();}}


    public Box createFtyp() {try{__CLR4_5_2h79h79lvl9elfc.R.inc(22400);
        __CLR4_5_2h79h79lvl9elfc.R.inc(22401);List<String> minorBrands = new LinkedList<String>();
        __CLR4_5_2h79h79lvl9elfc.R.inc(22402);minorBrands.add("isom");
        __CLR4_5_2h79h79lvl9elfc.R.inc(22403);minorBrands.add("iso6");
        __CLR4_5_2h79h79lvl9elfc.R.inc(22404);minorBrands.add("avc1");
        __CLR4_5_2h79h79lvl9elfc.R.inc(22405);return new FileTypeBox("isom", 0, minorBrands);
    }finally{__CLR4_5_2h79h79lvl9elfc.R.flushNeeded();}}

    protected Box createMvex() {try{__CLR4_5_2h79h79lvl9elfc.R.inc(22406);
        __CLR4_5_2h79h79lvl9elfc.R.inc(22407);MovieExtendsBox mvex = new MovieExtendsBox();
        __CLR4_5_2h79h79lvl9elfc.R.inc(22408);final MovieExtendsHeaderBox mved = new MovieExtendsHeaderBox();
        __CLR4_5_2h79h79lvl9elfc.R.inc(22409);mved.setVersion(1);

        __CLR4_5_2h79h79lvl9elfc.R.inc(22410);mved.setFragmentDuration(0);

        __CLR4_5_2h79h79lvl9elfc.R.inc(22411);mvex.addBox(mved);
        __CLR4_5_2h79h79lvl9elfc.R.inc(22412);for (StreamingTrack streamingTrack : source) {{
            __CLR4_5_2h79h79lvl9elfc.R.inc(22413);mvex.addBox(createTrex(streamingTrack));
        }
        }__CLR4_5_2h79h79lvl9elfc.R.inc(22414);return mvex;
    }finally{__CLR4_5_2h79h79lvl9elfc.R.flushNeeded();}}

    protected Box createTrex(StreamingTrack streamingTrack) {try{__CLR4_5_2h79h79lvl9elfc.R.inc(22415);
        __CLR4_5_2h79h79lvl9elfc.R.inc(22416);TrackExtendsBox trex = new TrackExtendsBox();
        __CLR4_5_2h79h79lvl9elfc.R.inc(22417);trex.setTrackId(streamingTrack.getTrackHeaderBox().getTrackId());
        __CLR4_5_2h79h79lvl9elfc.R.inc(22418);trex.setDefaultSampleDescriptionIndex(1);
        __CLR4_5_2h79h79lvl9elfc.R.inc(22419);trex.setDefaultSampleDuration(0);
        __CLR4_5_2h79h79lvl9elfc.R.inc(22420);trex.setDefaultSampleSize(0);
        __CLR4_5_2h79h79lvl9elfc.R.inc(22421);SampleFlags sf = new SampleFlags();
        __CLR4_5_2h79h79lvl9elfc.R.inc(22422);if (((("soun".equals(streamingTrack.getHandler()) || "subt".equals(streamingTrack.getHandler()))&&(__CLR4_5_2h79h79lvl9elfc.R.iget(22423)!=0|true))||(__CLR4_5_2h79h79lvl9elfc.R.iget(22424)==0&false))) {{
            // as far as I know there is no audio encoding
            // where the sample are not self contained.
            // same seems to be true for subtitle tracks
            __CLR4_5_2h79h79lvl9elfc.R.inc(22425);sf.setSampleDependsOn(2);
            __CLR4_5_2h79h79lvl9elfc.R.inc(22426);sf.setSampleIsDependedOn(2);
        }
        }__CLR4_5_2h79h79lvl9elfc.R.inc(22427);trex.setDefaultSampleFlags(sf);
        __CLR4_5_2h79h79lvl9elfc.R.inc(22428);return trex;
    }finally{__CLR4_5_2h79h79lvl9elfc.R.flushNeeded();}}


    protected Box createMoov() {try{__CLR4_5_2h79h79lvl9elfc.R.inc(22429);
        __CLR4_5_2h79h79lvl9elfc.R.inc(22430);MovieBox movieBox = new MovieBox();

        __CLR4_5_2h79h79lvl9elfc.R.inc(22431);movieBox.addBox(createMvhd());

        __CLR4_5_2h79h79lvl9elfc.R.inc(22432);for (StreamingTrack streamingTrack : source) {{
            __CLR4_5_2h79h79lvl9elfc.R.inc(22433);movieBox.addBox(createTrak(streamingTrack));
            __CLR4_5_2h79h79lvl9elfc.R.inc(22434);;
        }
        }__CLR4_5_2h79h79lvl9elfc.R.inc(22435);movieBox.addBox(createMvex());

        // metadata here
        __CLR4_5_2h79h79lvl9elfc.R.inc(22436);return movieBox;
    }finally{__CLR4_5_2h79h79lvl9elfc.R.flushNeeded();}}

    class ConsumeSamplesCallable implements Callable {

        private StreamingTrack streamingTrack;

        public ConsumeSamplesCallable(StreamingTrack streamingTrack) {try{__CLR4_5_2h79h79lvl9elfc.R.inc(22437);
            __CLR4_5_2h79h79lvl9elfc.R.inc(22438);this.streamingTrack = streamingTrack;
        }finally{__CLR4_5_2h79h79lvl9elfc.R.flushNeeded();}}

        public Object call() throws Exception {try{__CLR4_5_2h79h79lvl9elfc.R.inc(22439);
            __CLR4_5_2h79h79lvl9elfc.R.inc(22440);do {{
                __CLR4_5_2h79h79lvl9elfc.R.inc(22441);try {
                    __CLR4_5_2h79h79lvl9elfc.R.inc(22442);StreamingSample ss;
                    __CLR4_5_2h79h79lvl9elfc.R.inc(22443);while ((ss = streamingTrack.getSamples().poll(100, TimeUnit.MILLISECONDS)) != null) {{
                        __CLR4_5_2h79h79lvl9elfc.R.inc(22446);consumeSample(streamingTrack, ss);
                    }

                }} catch (InterruptedException e) {
                    __CLR4_5_2h79h79lvl9elfc.R.inc(22447);e.printStackTrace();
                }
            } }while ((((streamingTrack.hasMoreSamples())&&(__CLR4_5_2h79h79lvl9elfc.R.iget(22448)!=0|true))||(__CLR4_5_2h79h79lvl9elfc.R.iget(22449)==0&false)));
            __CLR4_5_2h79h79lvl9elfc.R.inc(22450);return null;
        }finally{__CLR4_5_2h79h79lvl9elfc.R.flushNeeded();}}
    }

    public void write() throws IOException {try{__CLR4_5_2h79h79lvl9elfc.R.inc(22451);
        __CLR4_5_2h79h79lvl9elfc.R.inc(22452);final WritableByteChannel out = Channels.newChannel(outputStream);

        __CLR4_5_2h79h79lvl9elfc.R.inc(22453);createFtyp().getBox(out);
        __CLR4_5_2h79h79lvl9elfc.R.inc(22454);createMoov().getBox(out);
        __CLR4_5_2h79h79lvl9elfc.R.inc(22455);ExecutorService es = Executors.newFixedThreadPool(source.length);
        __CLR4_5_2h79h79lvl9elfc.R.inc(22456);for (StreamingTrack streamingTrack : source) {{
            __CLR4_5_2h79h79lvl9elfc.R.inc(22457);es.submit(new ConsumeSamplesCallable(streamingTrack));
        }
    }}finally{__CLR4_5_2h79h79lvl9elfc.R.flushNeeded();}}


    private synchronized void consumeSample(StreamingTrack streamingTrack, StreamingSample ss) throws IOException {try{__CLR4_5_2h79h79lvl9elfc.R.inc(22458);
        __CLR4_5_2h79h79lvl9elfc.R.inc(22459);SampleFlagsSampleExtension sampleDependencySampleExtension = null;
        __CLR4_5_2h79h79lvl9elfc.R.inc(22460);CompositionTimeSampleExtension compositionTimeSampleExtension = null;
        __CLR4_5_2h79h79lvl9elfc.R.inc(22461);for (SampleExtension sampleExtension : ss.getExtensions()) {{
            __CLR4_5_2h79h79lvl9elfc.R.inc(22462);if ((((sampleExtension instanceof SampleFlagsSampleExtension)&&(__CLR4_5_2h79h79lvl9elfc.R.iget(22463)!=0|true))||(__CLR4_5_2h79h79lvl9elfc.R.iget(22464)==0&false))) {{
                __CLR4_5_2h79h79lvl9elfc.R.inc(22465);sampleDependencySampleExtension = (SampleFlagsSampleExtension) sampleExtension;
            } }else {__CLR4_5_2h79h79lvl9elfc.R.inc(22466);if ((((sampleExtension instanceof CompositionTimeSampleExtension)&&(__CLR4_5_2h79h79lvl9elfc.R.iget(22467)!=0|true))||(__CLR4_5_2h79h79lvl9elfc.R.iget(22468)==0&false))) {{
                __CLR4_5_2h79h79lvl9elfc.R.inc(22469);compositionTimeSampleExtension = (CompositionTimeSampleExtension) sampleExtension;
            }
        }}}
        }__CLR4_5_2h79h79lvl9elfc.R.inc(22470);currentTime += ss.getDuration();
        // 3 seconds = 3 * source.getTimescale()
        __CLR4_5_2h79h79lvl9elfc.R.inc(22471);fragmentBuffers.get(streamingTrack).add(ss);
        __CLR4_5_2h79h79lvl9elfc.R.inc(22472);if ((((currentTime > currentFragmentStartTime + 3 * streamingTrack.getTimescale() &&
                fragmentBuffers.size() > 0 &&
                (sampleDependencyTrackExtension == null ||
                        sampleDependencySampleExtension == null ||
                        sampleDependencySampleExtension.isSyncSample()))&&(__CLR4_5_2h79h79lvl9elfc.R.iget(22473)!=0|true))||(__CLR4_5_2h79h79lvl9elfc.R.iget(22474)==0&false))) {{
            __CLR4_5_2h79h79lvl9elfc.R.inc(22475);WritableByteChannel out = Channels.newChannel(outputStream);
            __CLR4_5_2h79h79lvl9elfc.R.inc(22476);createMoof(streamingTrack).getBox(out);
            __CLR4_5_2h79h79lvl9elfc.R.inc(22477);createMdat(streamingTrack).getBox(out);
            __CLR4_5_2h79h79lvl9elfc.R.inc(22478);currentFragmentStartTime = currentTime;
            __CLR4_5_2h79h79lvl9elfc.R.inc(22479);fragmentBuffers.clear();
        }
    }}finally{__CLR4_5_2h79h79lvl9elfc.R.flushNeeded();}}

    private Box createMoof(StreamingTrack streamingTrack) {try{__CLR4_5_2h79h79lvl9elfc.R.inc(22480);
        __CLR4_5_2h79h79lvl9elfc.R.inc(22481);MovieFragmentBox moof = new MovieFragmentBox();
        __CLR4_5_2h79h79lvl9elfc.R.inc(22482);createMfhd(sequenceNumber, moof);
        __CLR4_5_2h79h79lvl9elfc.R.inc(22483);createTraf(streamingTrack, moof);

        __CLR4_5_2h79h79lvl9elfc.R.inc(22484);TrackRunBox firstTrun = moof.getTrackRunBoxes().get(0);
        __CLR4_5_2h79h79lvl9elfc.R.inc(22485);firstTrun.setDataOffset(1); // dummy to make size correct
        __CLR4_5_2h79h79lvl9elfc.R.inc(22486);firstTrun.setDataOffset((int) (8 + moof.getSize())); // mdat header + moof size

        __CLR4_5_2h79h79lvl9elfc.R.inc(22487);sequenceNumber++;
        __CLR4_5_2h79h79lvl9elfc.R.inc(22488);return moof;

    }finally{__CLR4_5_2h79h79lvl9elfc.R.flushNeeded();}}

    protected void createTfhd(StreamingTrack streamingTrack, TrackFragmentBox parent) {try{__CLR4_5_2h79h79lvl9elfc.R.inc(22489);
        __CLR4_5_2h79h79lvl9elfc.R.inc(22490);TrackFragmentHeaderBox tfhd = new TrackFragmentHeaderBox();
        __CLR4_5_2h79h79lvl9elfc.R.inc(22491);SampleFlags sf = new SampleFlags();

        __CLR4_5_2h79h79lvl9elfc.R.inc(22492);tfhd.setDefaultSampleFlags(sf);
        __CLR4_5_2h79h79lvl9elfc.R.inc(22493);tfhd.setBaseDataOffset(-1);
        __CLR4_5_2h79h79lvl9elfc.R.inc(22494);tfhd.setTrackId(streamingTrack.getTrackExtension(TrackIdTrackExtension.class).getTrackId());
        __CLR4_5_2h79h79lvl9elfc.R.inc(22495);tfhd.setDefaultBaseIsMoof(true);
        __CLR4_5_2h79h79lvl9elfc.R.inc(22496);parent.addBox(tfhd);
    }finally{__CLR4_5_2h79h79lvl9elfc.R.flushNeeded();}}

    protected void createTfdt(TrackFragmentBox parent) {try{__CLR4_5_2h79h79lvl9elfc.R.inc(22497);
        __CLR4_5_2h79h79lvl9elfc.R.inc(22498);TrackFragmentBaseMediaDecodeTimeBox tfdt = new TrackFragmentBaseMediaDecodeTimeBox();
        __CLR4_5_2h79h79lvl9elfc.R.inc(22499);tfdt.setVersion(1);
        __CLR4_5_2h79h79lvl9elfc.R.inc(22500);tfdt.setBaseMediaDecodeTime(currentFragmentStartTime);
        __CLR4_5_2h79h79lvl9elfc.R.inc(22501);parent.addBox(tfdt);
    }finally{__CLR4_5_2h79h79lvl9elfc.R.flushNeeded();}}

    protected void createTrun(StreamingTrack streamingTrack, TrackFragmentBox parent) {try{__CLR4_5_2h79h79lvl9elfc.R.inc(22502);
        __CLR4_5_2h79h79lvl9elfc.R.inc(22503);TrackRunBox trun = new TrackRunBox();
        __CLR4_5_2h79h79lvl9elfc.R.inc(22504);trun.setVersion(1);

        __CLR4_5_2h79h79lvl9elfc.R.inc(22505);trun.setSampleDurationPresent(true);
        __CLR4_5_2h79h79lvl9elfc.R.inc(22506);trun.setSampleSizePresent(true);
        __CLR4_5_2h79h79lvl9elfc.R.inc(22507);List<TrackRunBox.Entry> entries = new ArrayList<TrackRunBox.Entry>(fragmentBuffers.size());


        __CLR4_5_2h79h79lvl9elfc.R.inc(22508);trun.setSampleCompositionTimeOffsetPresent(streamingTrack.getTrackExtension(CompositionTimeTrackExtension.class) != null);

        __CLR4_5_2h79h79lvl9elfc.R.inc(22509);boolean sampleFlagsRequired = streamingTrack.getTrackExtension(SampleFlagsTrackExtension.class) != null;

        __CLR4_5_2h79h79lvl9elfc.R.inc(22510);trun.setSampleFlagsPresent(sampleFlagsRequired);

        __CLR4_5_2h79h79lvl9elfc.R.inc(22511);for (StreamingSample streamingSample : fragmentBuffers.get(streamingTrack)) {{
            __CLR4_5_2h79h79lvl9elfc.R.inc(22512);TrackRunBox.Entry entry = new TrackRunBox.Entry();
            __CLR4_5_2h79h79lvl9elfc.R.inc(22513);entry.setSampleSize(streamingSample.getContent().remaining());
            __CLR4_5_2h79h79lvl9elfc.R.inc(22514);if ((((sampleFlagsRequired)&&(__CLR4_5_2h79h79lvl9elfc.R.iget(22515)!=0|true))||(__CLR4_5_2h79h79lvl9elfc.R.iget(22516)==0&false))) {{
                __CLR4_5_2h79h79lvl9elfc.R.inc(22517);SampleFlagsSampleExtension sampleFlagsSampleExtension =
                        getSampleExtension(streamingSample, SampleFlagsSampleExtension.class);
                assert (((sampleFlagsSampleExtension != null )&&(__CLR4_5_2h79h79lvl9elfc.R.iget(22518)!=0|true))||(__CLR4_5_2h79h79lvl9elfc.R.iget(22519)==0&false)): "SampleDependencySampleExtension missing even though SampleDependencyTrackExtension was present";
                __CLR4_5_2h79h79lvl9elfc.R.inc(22520);SampleFlags sflags = new SampleFlags();
                __CLR4_5_2h79h79lvl9elfc.R.inc(22521);sflags.setIsLeading(sampleFlagsSampleExtension.getIsLeading());
                __CLR4_5_2h79h79lvl9elfc.R.inc(22522);sflags.setSampleIsDependedOn(sampleFlagsSampleExtension.getSampleIsDependedOn());
                __CLR4_5_2h79h79lvl9elfc.R.inc(22523);sflags.setSampleDependsOn(sampleFlagsSampleExtension.getSampleDependsOn());
                __CLR4_5_2h79h79lvl9elfc.R.inc(22524);sflags.setSampleHasRedundancy(sampleFlagsSampleExtension.getSampleHasRedundancy());
                __CLR4_5_2h79h79lvl9elfc.R.inc(22525);sflags.setSampleIsDifferenceSample(sampleFlagsSampleExtension.isSampleIsNonSyncSample());
                __CLR4_5_2h79h79lvl9elfc.R.inc(22526);sflags.setSamplePaddingValue(sampleFlagsSampleExtension.getSamplePaddingValue());
                __CLR4_5_2h79h79lvl9elfc.R.inc(22527);sflags.setSampleDegradationPriority(sampleFlagsSampleExtension.getSampleDegradationPriority());

                __CLR4_5_2h79h79lvl9elfc.R.inc(22528);entry.setSampleFlags(sflags);

            }

            }__CLR4_5_2h79h79lvl9elfc.R.inc(22529);entry.setSampleDuration(streamingSample.getDuration());

            __CLR4_5_2h79h79lvl9elfc.R.inc(22530);if ((((trun.isSampleCompositionTimeOffsetPresent())&&(__CLR4_5_2h79h79lvl9elfc.R.iget(22531)!=0|true))||(__CLR4_5_2h79h79lvl9elfc.R.iget(22532)==0&false))) {{
                __CLR4_5_2h79h79lvl9elfc.R.inc(22533);CompositionTimeSampleExtension compositionTimeSampleExtension =
                        getSampleExtension(streamingSample, CompositionTimeSampleExtension.class);
                assert (((compositionTimeSampleExtension != null )&&(__CLR4_5_2h79h79lvl9elfc.R.iget(22534)!=0|true))||(__CLR4_5_2h79h79lvl9elfc.R.iget(22535)==0&false)): "CompositionTimeSampleExtension missing even though CompositionTimeTrackExtension was present";
                __CLR4_5_2h79h79lvl9elfc.R.inc(22536);entry.setSampleCompositionTimeOffset(compositionTimeSampleExtension.getCompositionTimeOffset());
            }

            }__CLR4_5_2h79h79lvl9elfc.R.inc(22537);entries.add(entry);
        }

        }__CLR4_5_2h79h79lvl9elfc.R.inc(22538);trun.setEntries(entries);

        __CLR4_5_2h79h79lvl9elfc.R.inc(22539);parent.addBox(trun);
    }finally{__CLR4_5_2h79h79lvl9elfc.R.flushNeeded();}}

    private void createTraf(StreamingTrack streamingTrack, MovieFragmentBox moof) {try{__CLR4_5_2h79h79lvl9elfc.R.inc(22540);
        __CLR4_5_2h79h79lvl9elfc.R.inc(22541);TrackFragmentBox traf = new TrackFragmentBox();
        __CLR4_5_2h79h79lvl9elfc.R.inc(22542);moof.addBox(traf);
        __CLR4_5_2h79h79lvl9elfc.R.inc(22543);createTfhd(streamingTrack, traf);
        __CLR4_5_2h79h79lvl9elfc.R.inc(22544);createTfdt(traf);
        __CLR4_5_2h79h79lvl9elfc.R.inc(22545);createTrun(streamingTrack, traf);

        __CLR4_5_2h79h79lvl9elfc.R.inc(22546);if ((((streamingTrack.getTrackExtension(CencEncryptTrackExtension.class) != null)&&(__CLR4_5_2h79h79lvl9elfc.R.iget(22547)!=0|true))||(__CLR4_5_2h79h79lvl9elfc.R.iget(22548)==0&false))) {{
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

    }}finally{__CLR4_5_2h79h79lvl9elfc.R.flushNeeded();}}

    private void createMfhd(long sequenceNumber, MovieFragmentBox moof) {try{__CLR4_5_2h79h79lvl9elfc.R.inc(22549);
        __CLR4_5_2h79h79lvl9elfc.R.inc(22550);MovieFragmentHeaderBox mfhd = new MovieFragmentHeaderBox();
        __CLR4_5_2h79h79lvl9elfc.R.inc(22551);mfhd.setSequenceNumber(sequenceNumber);
        __CLR4_5_2h79h79lvl9elfc.R.inc(22552);moof.addBox(mfhd);
    }finally{__CLR4_5_2h79h79lvl9elfc.R.flushNeeded();}}

    private Box createMdat(final StreamingTrack streamingTrack) {try{__CLR4_5_2h79h79lvl9elfc.R.inc(22553);
        __CLR4_5_2h79h79lvl9elfc.R.inc(22554);return new WriteOnlyBox("mdat") {
            public long getSize() {try{__CLR4_5_2h79h79lvl9elfc.R.inc(22555);
                __CLR4_5_2h79h79lvl9elfc.R.inc(22556);long l = 8;
                __CLR4_5_2h79h79lvl9elfc.R.inc(22557);for (StreamingSample streamingSample : fragmentBuffers.get(streamingTrack)) {{
                    __CLR4_5_2h79h79lvl9elfc.R.inc(22558);l += streamingSample.getContent().remaining();
                }
                }__CLR4_5_2h79h79lvl9elfc.R.inc(22559);return l;
            }finally{__CLR4_5_2h79h79lvl9elfc.R.flushNeeded();}}

            public void getBox(WritableByteChannel writableByteChannel) throws IOException {try{__CLR4_5_2h79h79lvl9elfc.R.inc(22560);
                __CLR4_5_2h79h79lvl9elfc.R.inc(22561);ArrayList<ByteBuffer> sampleContents = new ArrayList<ByteBuffer>();
                __CLR4_5_2h79h79lvl9elfc.R.inc(22562);long l = 8;
                __CLR4_5_2h79h79lvl9elfc.R.inc(22563);for (StreamingSample streamingSample : fragmentBuffers.get(streamingTrack)) {{
                    __CLR4_5_2h79h79lvl9elfc.R.inc(22564);ByteBuffer sampleContent = streamingSample.getContent();
                    __CLR4_5_2h79h79lvl9elfc.R.inc(22565);sampleContents.add(sampleContent);
                    __CLR4_5_2h79h79lvl9elfc.R.inc(22566);l += sampleContent.remaining();
                }
                }__CLR4_5_2h79h79lvl9elfc.R.inc(22567);ByteBuffer bb = ByteBuffer.allocate(8);
                __CLR4_5_2h79h79lvl9elfc.R.inc(22568);IsoTypeWriter.writeUInt32(bb, l);
                __CLR4_5_2h79h79lvl9elfc.R.inc(22569);bb.put(IsoFile.fourCCtoBytes(getType()));
                __CLR4_5_2h79h79lvl9elfc.R.inc(22570);writableByteChannel.write((ByteBuffer) bb.rewind());

                __CLR4_5_2h79h79lvl9elfc.R.inc(22571);for (ByteBuffer sampleContent : sampleContents) {{
                    __CLR4_5_2h79h79lvl9elfc.R.inc(22572);writableByteChannel.write(sampleContent);
                }
            }}finally{__CLR4_5_2h79h79lvl9elfc.R.flushNeeded();}}

        };
    }finally{__CLR4_5_2h79h79lvl9elfc.R.flushNeeded();}}
}
