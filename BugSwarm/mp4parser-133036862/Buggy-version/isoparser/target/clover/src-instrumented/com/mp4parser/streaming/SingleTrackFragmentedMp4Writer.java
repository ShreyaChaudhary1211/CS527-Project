/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.mp4parser.streaming;

import com.coremedia.iso.IsoFile;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.boxes.*;
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
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static com.mp4parser.streaming.StreamingSampleHelper.getSampleExtension;

/**
 *
 */
public class SingleTrackFragmentedMp4Writer implements StreamingMp4Writer {public static class __CLR4_5_2hhohholvlulo82{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,22919,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private final OutputStream outputStream;
    StreamingTrack source;
    CompositionTimeTrackExtension compositionTimeTrackExtension;
    SampleFlagsTrackExtension sampleDependencyTrackExtension;

    Date creationTime;

    List<StreamingSample> fragment = new ArrayList<StreamingSample>();
    private long sequenceNumber;
    private long currentFragmentStartTime = 0;
    private long currentTime = 0;

    public SingleTrackFragmentedMp4Writer(StreamingTrack source, OutputStream outputStream) {try{__CLR4_5_2hhohholvlulo82.R.inc(22668);
        __CLR4_5_2hhohholvlulo82.R.inc(22669);this.source = source;
        __CLR4_5_2hhohholvlulo82.R.inc(22670);this.outputStream = outputStream;
        __CLR4_5_2hhohholvlulo82.R.inc(22671);this.creationTime = new Date();

        __CLR4_5_2hhohholvlulo82.R.inc(22672);compositionTimeTrackExtension = source.getTrackExtension(CompositionTimeTrackExtension.class);
        __CLR4_5_2hhohholvlulo82.R.inc(22673);sampleDependencyTrackExtension = source.getTrackExtension(SampleFlagsTrackExtension.class);
    }finally{__CLR4_5_2hhohholvlulo82.R.flushNeeded();}}

    public void close() {try{__CLR4_5_2hhohholvlulo82.R.inc(22674);

    }finally{__CLR4_5_2hhohholvlulo82.R.flushNeeded();}}


    protected Box createMvhd() {try{__CLR4_5_2hhohholvlulo82.R.inc(22675);
        __CLR4_5_2hhohholvlulo82.R.inc(22676);MovieHeaderBox mvhd = new MovieHeaderBox();
        __CLR4_5_2hhohholvlulo82.R.inc(22677);mvhd.setVersion(1);
        __CLR4_5_2hhohholvlulo82.R.inc(22678);mvhd.setCreationTime(creationTime);
        __CLR4_5_2hhohholvlulo82.R.inc(22679);mvhd.setModificationTime(creationTime);
        __CLR4_5_2hhohholvlulo82.R.inc(22680);mvhd.setDuration(0);//no duration in moov for fragmented movies
        __CLR4_5_2hhohholvlulo82.R.inc(22681);long movieTimeScale = source.getTimescale();
        __CLR4_5_2hhohholvlulo82.R.inc(22682);mvhd.setTimescale(movieTimeScale);
        // find the next available trackId
        __CLR4_5_2hhohholvlulo82.R.inc(22683);mvhd.setNextTrackId(2);
        __CLR4_5_2hhohholvlulo82.R.inc(22684);return mvhd;
    }finally{__CLR4_5_2hhohholvlulo82.R.flushNeeded();}}

    protected Box createMdiaHdlr() {try{__CLR4_5_2hhohholvlulo82.R.inc(22685);
        __CLR4_5_2hhohholvlulo82.R.inc(22686);HandlerBox hdlr = new HandlerBox();
        __CLR4_5_2hhohholvlulo82.R.inc(22687);hdlr.setHandlerType(source.getHandler());
        __CLR4_5_2hhohholvlulo82.R.inc(22688);return hdlr;
    }finally{__CLR4_5_2hhohholvlulo82.R.flushNeeded();}}

    protected Box createMdhd() {try{__CLR4_5_2hhohholvlulo82.R.inc(22689);
        __CLR4_5_2hhohholvlulo82.R.inc(22690);MediaHeaderBox mdhd = new MediaHeaderBox();
        __CLR4_5_2hhohholvlulo82.R.inc(22691);mdhd.setCreationTime(creationTime);
        __CLR4_5_2hhohholvlulo82.R.inc(22692);mdhd.setModificationTime(creationTime);
        __CLR4_5_2hhohholvlulo82.R.inc(22693);mdhd.setDuration(0);//no duration in moov for fragmented movies
        __CLR4_5_2hhohholvlulo82.R.inc(22694);mdhd.setTimescale(source.getTimescale());
        __CLR4_5_2hhohholvlulo82.R.inc(22695);mdhd.setLanguage(source.getLanguage());
        __CLR4_5_2hhohholvlulo82.R.inc(22696);return mdhd;
    }finally{__CLR4_5_2hhohholvlulo82.R.flushNeeded();}}


    protected Box createMdia() {try{__CLR4_5_2hhohholvlulo82.R.inc(22697);
        __CLR4_5_2hhohholvlulo82.R.inc(22698);MediaBox mdia = new MediaBox();
        __CLR4_5_2hhohholvlulo82.R.inc(22699);mdia.addBox(createMdhd());
        __CLR4_5_2hhohholvlulo82.R.inc(22700);mdia.addBox(createMdiaHdlr());
        __CLR4_5_2hhohholvlulo82.R.inc(22701);mdia.addBox(createMinf());
        __CLR4_5_2hhohholvlulo82.R.inc(22702);return mdia;
    }finally{__CLR4_5_2hhohholvlulo82.R.flushNeeded();}}

    protected Box createMinf() {try{__CLR4_5_2hhohholvlulo82.R.inc(22703);
        __CLR4_5_2hhohholvlulo82.R.inc(22704);MediaInformationBox minf = new MediaInformationBox();
        __CLR4_5_2hhohholvlulo82.R.inc(22705);if ((((source.getHandler().equals("vide"))&&(__CLR4_5_2hhohholvlulo82.R.iget(22706)!=0|true))||(__CLR4_5_2hhohholvlulo82.R.iget(22707)==0&false))) {{
            __CLR4_5_2hhohholvlulo82.R.inc(22708);minf.addBox(new VideoMediaHeaderBox());
        } }else {__CLR4_5_2hhohholvlulo82.R.inc(22709);if ((((source.getHandler().equals("soun"))&&(__CLR4_5_2hhohholvlulo82.R.iget(22710)!=0|true))||(__CLR4_5_2hhohholvlulo82.R.iget(22711)==0&false))) {{
            __CLR4_5_2hhohholvlulo82.R.inc(22712);minf.addBox(new SoundMediaHeaderBox());
        } }else {__CLR4_5_2hhohholvlulo82.R.inc(22713);if ((((source.getHandler().equals("text"))&&(__CLR4_5_2hhohholvlulo82.R.iget(22714)!=0|true))||(__CLR4_5_2hhohholvlulo82.R.iget(22715)==0&false))) {{
            __CLR4_5_2hhohholvlulo82.R.inc(22716);minf.addBox(new NullMediaHeaderBox());
        } }else {__CLR4_5_2hhohholvlulo82.R.inc(22717);if ((((source.getHandler().equals("subt"))&&(__CLR4_5_2hhohholvlulo82.R.iget(22718)!=0|true))||(__CLR4_5_2hhohholvlulo82.R.iget(22719)==0&false))) {{
            __CLR4_5_2hhohholvlulo82.R.inc(22720);minf.addBox(new SubtitleMediaHeaderBox());
        } }else {__CLR4_5_2hhohholvlulo82.R.inc(22721);if ((((source.getHandler().equals("hint"))&&(__CLR4_5_2hhohholvlulo82.R.iget(22722)!=0|true))||(__CLR4_5_2hhohholvlulo82.R.iget(22723)==0&false))) {{
            __CLR4_5_2hhohholvlulo82.R.inc(22724);minf.addBox(new HintMediaHeaderBox());
        } }else {__CLR4_5_2hhohholvlulo82.R.inc(22725);if ((((source.getHandler().equals("sbtl"))&&(__CLR4_5_2hhohholvlulo82.R.iget(22726)!=0|true))||(__CLR4_5_2hhohholvlulo82.R.iget(22727)==0&false))) {{
            __CLR4_5_2hhohholvlulo82.R.inc(22728);minf.addBox(new NullMediaHeaderBox());
        }
        }}}}}}__CLR4_5_2hhohholvlulo82.R.inc(22729);minf.addBox(createDinf());
        __CLR4_5_2hhohholvlulo82.R.inc(22730);minf.addBox(createStbl());
        __CLR4_5_2hhohholvlulo82.R.inc(22731);return minf;
    }finally{__CLR4_5_2hhohholvlulo82.R.flushNeeded();}}

    protected Box createStbl() {try{__CLR4_5_2hhohholvlulo82.R.inc(22732);
        __CLR4_5_2hhohholvlulo82.R.inc(22733);SampleTableBox stbl = new SampleTableBox();

        __CLR4_5_2hhohholvlulo82.R.inc(22734);stbl.addBox(source.getSampleDescriptionBox());
        __CLR4_5_2hhohholvlulo82.R.inc(22735);stbl.addBox(new TimeToSampleBox());
        __CLR4_5_2hhohholvlulo82.R.inc(22736);stbl.addBox(new SampleToChunkBox());
        __CLR4_5_2hhohholvlulo82.R.inc(22737);stbl.addBox(new SampleSizeBox());
        __CLR4_5_2hhohholvlulo82.R.inc(22738);stbl.addBox(new StaticChunkOffsetBox());
        __CLR4_5_2hhohholvlulo82.R.inc(22739);return stbl;
    }finally{__CLR4_5_2hhohholvlulo82.R.flushNeeded();}}


    protected DataInformationBox createDinf() {try{__CLR4_5_2hhohholvlulo82.R.inc(22740);
        __CLR4_5_2hhohholvlulo82.R.inc(22741);DataInformationBox dinf = new DataInformationBox();
        __CLR4_5_2hhohholvlulo82.R.inc(22742);DataReferenceBox dref = new DataReferenceBox();
        __CLR4_5_2hhohholvlulo82.R.inc(22743);dinf.addBox(dref);
        __CLR4_5_2hhohholvlulo82.R.inc(22744);DataEntryUrlBox url = new DataEntryUrlBox();
        __CLR4_5_2hhohholvlulo82.R.inc(22745);url.setFlags(1);
        __CLR4_5_2hhohholvlulo82.R.inc(22746);dref.addBox(url);
        __CLR4_5_2hhohholvlulo82.R.inc(22747);return dinf;
    }finally{__CLR4_5_2hhohholvlulo82.R.flushNeeded();}}

    protected Box createTrak() {try{__CLR4_5_2hhohholvlulo82.R.inc(22748);
        __CLR4_5_2hhohholvlulo82.R.inc(22749);TrackBox trackBox = new TrackBox();
        __CLR4_5_2hhohholvlulo82.R.inc(22750);trackBox.addBox(source.getTrackHeaderBox());
        __CLR4_5_2hhohholvlulo82.R.inc(22751);trackBox.addBox(createMdia());
        __CLR4_5_2hhohholvlulo82.R.inc(22752);return trackBox;
    }finally{__CLR4_5_2hhohholvlulo82.R.flushNeeded();}}


    public Box createFtyp() {try{__CLR4_5_2hhohholvlulo82.R.inc(22753);
        __CLR4_5_2hhohholvlulo82.R.inc(22754);List<String> minorBrands = new LinkedList<String>();
        __CLR4_5_2hhohholvlulo82.R.inc(22755);minorBrands.add("isom");
        __CLR4_5_2hhohholvlulo82.R.inc(22756);minorBrands.add("iso6");
        __CLR4_5_2hhohholvlulo82.R.inc(22757);minorBrands.add("avc1");
        __CLR4_5_2hhohholvlulo82.R.inc(22758);return new FileTypeBox("isom", 0, minorBrands);
    }finally{__CLR4_5_2hhohholvlulo82.R.flushNeeded();}}

    protected Box createMvex() {try{__CLR4_5_2hhohholvlulo82.R.inc(22759);
        __CLR4_5_2hhohholvlulo82.R.inc(22760);MovieExtendsBox mvex = new MovieExtendsBox();
        __CLR4_5_2hhohholvlulo82.R.inc(22761);final MovieExtendsHeaderBox mved = new MovieExtendsHeaderBox();
        __CLR4_5_2hhohholvlulo82.R.inc(22762);mved.setVersion(1);

        __CLR4_5_2hhohholvlulo82.R.inc(22763);mved.setFragmentDuration(0);

        __CLR4_5_2hhohholvlulo82.R.inc(22764);mvex.addBox(mved);

        __CLR4_5_2hhohholvlulo82.R.inc(22765);mvex.addBox(createTrex());
        __CLR4_5_2hhohholvlulo82.R.inc(22766);return mvex;
    }finally{__CLR4_5_2hhohholvlulo82.R.flushNeeded();}}

    protected Box createTrex() {try{__CLR4_5_2hhohholvlulo82.R.inc(22767);
        __CLR4_5_2hhohholvlulo82.R.inc(22768);TrackExtendsBox trex = new TrackExtendsBox();
        __CLR4_5_2hhohholvlulo82.R.inc(22769);trex.setTrackId(source.getTrackHeaderBox().getTrackId());
        __CLR4_5_2hhohholvlulo82.R.inc(22770);trex.setDefaultSampleDescriptionIndex(1);
        __CLR4_5_2hhohholvlulo82.R.inc(22771);trex.setDefaultSampleDuration(0);
        __CLR4_5_2hhohholvlulo82.R.inc(22772);trex.setDefaultSampleSize(0);
        __CLR4_5_2hhohholvlulo82.R.inc(22773);SampleFlags sf = new SampleFlags();
        __CLR4_5_2hhohholvlulo82.R.inc(22774);if (((("soun".equals(source.getHandler()) || "subt".equals(source.getHandler()))&&(__CLR4_5_2hhohholvlulo82.R.iget(22775)!=0|true))||(__CLR4_5_2hhohholvlulo82.R.iget(22776)==0&false))) {{
            // as far as I know there is no audio encoding
            // where the sample are not self contained.
            // same seems to be true for subtitle tracks
            __CLR4_5_2hhohholvlulo82.R.inc(22777);sf.setSampleDependsOn(2);
            __CLR4_5_2hhohholvlulo82.R.inc(22778);sf.setSampleIsDependedOn(2);
        }
        }__CLR4_5_2hhohholvlulo82.R.inc(22779);trex.setDefaultSampleFlags(sf);
        __CLR4_5_2hhohholvlulo82.R.inc(22780);return trex;
    }finally{__CLR4_5_2hhohholvlulo82.R.flushNeeded();}}


    protected Box createMoov() {try{__CLR4_5_2hhohholvlulo82.R.inc(22781);
        __CLR4_5_2hhohholvlulo82.R.inc(22782);MovieBox movieBox = new MovieBox();

        __CLR4_5_2hhohholvlulo82.R.inc(22783);movieBox.addBox(createMvhd());

        __CLR4_5_2hhohholvlulo82.R.inc(22784);movieBox.addBox(createTrak());
        __CLR4_5_2hhohholvlulo82.R.inc(22785);movieBox.addBox(createMvex());

        // metadata here
        __CLR4_5_2hhohholvlulo82.R.inc(22786);return movieBox;
    }finally{__CLR4_5_2hhohholvlulo82.R.flushNeeded();}}

    public void write() throws IOException {try{__CLR4_5_2hhohholvlulo82.R.inc(22787);
        __CLR4_5_2hhohholvlulo82.R.inc(22788);WritableByteChannel out = Channels.newChannel(outputStream);

        __CLR4_5_2hhohholvlulo82.R.inc(22789);createFtyp().getBox(out);
        __CLR4_5_2hhohholvlulo82.R.inc(22790);createMoov().getBox(out);


        __CLR4_5_2hhohholvlulo82.R.inc(22791);do {{
            __CLR4_5_2hhohholvlulo82.R.inc(22792);try {
                __CLR4_5_2hhohholvlulo82.R.inc(22793);StreamingSample ss;
                __CLR4_5_2hhohholvlulo82.R.inc(22794);while ((ss = source.getSamples().poll(100, TimeUnit.MILLISECONDS)) != null) {{
                    __CLR4_5_2hhohholvlulo82.R.inc(22797);consumeSample(ss, out);
                }

            }} catch (InterruptedException e) {
                __CLR4_5_2hhohholvlulo82.R.inc(22798);e.printStackTrace();
            }
        } }while ((((source.hasMoreSamples())&&(__CLR4_5_2hhohholvlulo82.R.iget(22799)!=0|true))||(__CLR4_5_2hhohholvlulo82.R.iget(22800)==0&false)));
    }finally{__CLR4_5_2hhohholvlulo82.R.flushNeeded();}}


    private void consumeSample(StreamingSample ss, WritableByteChannel out) throws IOException {try{__CLR4_5_2hhohholvlulo82.R.inc(22801);
        __CLR4_5_2hhohholvlulo82.R.inc(22802);SampleFlagsSampleExtension sampleDependencySampleExtension = null;
        __CLR4_5_2hhohholvlulo82.R.inc(22803);CompositionTimeSampleExtension compositionTimeSampleExtension = null;
        __CLR4_5_2hhohholvlulo82.R.inc(22804);for (SampleExtension sampleExtension : ss.getExtensions()) {{
            __CLR4_5_2hhohholvlulo82.R.inc(22805);if ((((sampleExtension instanceof SampleFlagsSampleExtension)&&(__CLR4_5_2hhohholvlulo82.R.iget(22806)!=0|true))||(__CLR4_5_2hhohholvlulo82.R.iget(22807)==0&false))) {{
                __CLR4_5_2hhohholvlulo82.R.inc(22808);sampleDependencySampleExtension = (SampleFlagsSampleExtension) sampleExtension;
            } }else {__CLR4_5_2hhohholvlulo82.R.inc(22809);if ((((sampleExtension instanceof CompositionTimeSampleExtension)&&(__CLR4_5_2hhohholvlulo82.R.iget(22810)!=0|true))||(__CLR4_5_2hhohholvlulo82.R.iget(22811)==0&false))) {{
                __CLR4_5_2hhohholvlulo82.R.inc(22812);compositionTimeSampleExtension = (CompositionTimeSampleExtension) sampleExtension;
            }
        }}}
        }__CLR4_5_2hhohholvlulo82.R.inc(22813);currentTime += ss.getDuration();
        // 3 seconds = 3 * source.getTimescale()
        __CLR4_5_2hhohholvlulo82.R.inc(22814);fragment.add(ss);
        __CLR4_5_2hhohholvlulo82.R.inc(22815);if ((((currentTime > currentFragmentStartTime + 3 * source.getTimescale() &&
                fragment.size() > 0 &&
                (sampleDependencyTrackExtension == null ||
                        sampleDependencySampleExtension == null ||
                        sampleDependencySampleExtension.isSyncSample()))&&(__CLR4_5_2hhohholvlulo82.R.iget(22816)!=0|true))||(__CLR4_5_2hhohholvlulo82.R.iget(22817)==0&false))) {{
            __CLR4_5_2hhohholvlulo82.R.inc(22818);createMoof().getBox(out);
            __CLR4_5_2hhohholvlulo82.R.inc(22819);createMdat().getBox(out);
            __CLR4_5_2hhohholvlulo82.R.inc(22820);currentFragmentStartTime = currentTime;
            __CLR4_5_2hhohholvlulo82.R.inc(22821);fragment.clear();
        }
    }}finally{__CLR4_5_2hhohholvlulo82.R.flushNeeded();}}

    private Box createMoof() {try{__CLR4_5_2hhohholvlulo82.R.inc(22822);
        __CLR4_5_2hhohholvlulo82.R.inc(22823);MovieFragmentBox moof = new MovieFragmentBox();
        __CLR4_5_2hhohholvlulo82.R.inc(22824);createMfhd(sequenceNumber, moof);
        __CLR4_5_2hhohholvlulo82.R.inc(22825);createTraf(sequenceNumber, moof);

        __CLR4_5_2hhohholvlulo82.R.inc(22826);TrackRunBox firstTrun = moof.getTrackRunBoxes().get(0);
        __CLR4_5_2hhohholvlulo82.R.inc(22827);firstTrun.setDataOffset(1); // dummy to make size correct
        __CLR4_5_2hhohholvlulo82.R.inc(22828);firstTrun.setDataOffset((int) (8 + moof.getSize())); // mdat header + moof size

        __CLR4_5_2hhohholvlulo82.R.inc(22829);return moof;

    }finally{__CLR4_5_2hhohholvlulo82.R.flushNeeded();}}

    protected void createTfhd(TrackFragmentBox parent) {try{__CLR4_5_2hhohholvlulo82.R.inc(22830);
        __CLR4_5_2hhohholvlulo82.R.inc(22831);TrackFragmentHeaderBox tfhd = new TrackFragmentHeaderBox();
        __CLR4_5_2hhohholvlulo82.R.inc(22832);SampleFlags sf = new SampleFlags();

        __CLR4_5_2hhohholvlulo82.R.inc(22833);tfhd.setDefaultSampleFlags(sf);
        __CLR4_5_2hhohholvlulo82.R.inc(22834);tfhd.setBaseDataOffset(-1);
        __CLR4_5_2hhohholvlulo82.R.inc(22835);TrackIdTrackExtension trackIdTrackExtension =  source.getTrackExtension(TrackIdTrackExtension.class);
        __CLR4_5_2hhohholvlulo82.R.inc(22836);if ((((trackIdTrackExtension != null)&&(__CLR4_5_2hhohholvlulo82.R.iget(22837)!=0|true))||(__CLR4_5_2hhohholvlulo82.R.iget(22838)==0&false))) {{
            __CLR4_5_2hhohholvlulo82.R.inc(22839);tfhd.setTrackId(trackIdTrackExtension.getTrackId());
        } }else {{
            __CLR4_5_2hhohholvlulo82.R.inc(22840);tfhd.setTrackId(1);
        }
        }__CLR4_5_2hhohholvlulo82.R.inc(22841);tfhd.setDefaultBaseIsMoof(true);
        __CLR4_5_2hhohholvlulo82.R.inc(22842);parent.addBox(tfhd);
    }finally{__CLR4_5_2hhohholvlulo82.R.flushNeeded();}}

    protected void createTfdt(TrackFragmentBox parent) {try{__CLR4_5_2hhohholvlulo82.R.inc(22843);
        __CLR4_5_2hhohholvlulo82.R.inc(22844);TrackFragmentBaseMediaDecodeTimeBox tfdt = new TrackFragmentBaseMediaDecodeTimeBox();
        __CLR4_5_2hhohholvlulo82.R.inc(22845);tfdt.setVersion(1);
        __CLR4_5_2hhohholvlulo82.R.inc(22846);tfdt.setBaseMediaDecodeTime(currentFragmentStartTime);
        __CLR4_5_2hhohholvlulo82.R.inc(22847);parent.addBox(tfdt);
    }finally{__CLR4_5_2hhohholvlulo82.R.flushNeeded();}}

    protected void createTrun( TrackFragmentBox parent) {try{__CLR4_5_2hhohholvlulo82.R.inc(22848);
        __CLR4_5_2hhohholvlulo82.R.inc(22849);TrackRunBox trun = new TrackRunBox();
        __CLR4_5_2hhohholvlulo82.R.inc(22850);trun.setVersion(1);

        __CLR4_5_2hhohholvlulo82.R.inc(22851);trun.setSampleDurationPresent(true);
        __CLR4_5_2hhohholvlulo82.R.inc(22852);trun.setSampleSizePresent(true);
        __CLR4_5_2hhohholvlulo82.R.inc(22853);List<TrackRunBox.Entry> entries = new ArrayList<TrackRunBox.Entry>(fragment.size());




        __CLR4_5_2hhohholvlulo82.R.inc(22854);trun.setSampleCompositionTimeOffsetPresent(source.getTrackExtension(CompositionTimeTrackExtension.class) != null);

        __CLR4_5_2hhohholvlulo82.R.inc(22855);boolean sampleFlagsRequired = source.getTrackExtension(SampleFlagsTrackExtension.class) != null;

        __CLR4_5_2hhohholvlulo82.R.inc(22856);trun.setSampleFlagsPresent(sampleFlagsRequired);

        __CLR4_5_2hhohholvlulo82.R.inc(22857);for (StreamingSample streamingSample: fragment) {{
            __CLR4_5_2hhohholvlulo82.R.inc(22858);TrackRunBox.Entry entry = new TrackRunBox.Entry();
            __CLR4_5_2hhohholvlulo82.R.inc(22859);entry.setSampleSize(streamingSample.getContent().remaining());
            __CLR4_5_2hhohholvlulo82.R.inc(22860);if ((((sampleFlagsRequired)&&(__CLR4_5_2hhohholvlulo82.R.iget(22861)!=0|true))||(__CLR4_5_2hhohholvlulo82.R.iget(22862)==0&false))) {{
                __CLR4_5_2hhohholvlulo82.R.inc(22863);SampleFlagsSampleExtension sampleFlagsSampleExtension =
                        getSampleExtension(streamingSample, SampleFlagsSampleExtension.class);
                assert (((sampleFlagsSampleExtension != null)&&(__CLR4_5_2hhohholvlulo82.R.iget(22864)!=0|true))||(__CLR4_5_2hhohholvlulo82.R.iget(22865)==0&false)):"SampleDependencySampleExtension missing even though SampleDependencyTrackExtension was present";
                __CLR4_5_2hhohholvlulo82.R.inc(22866);SampleFlags sflags = new SampleFlags();
                __CLR4_5_2hhohholvlulo82.R.inc(22867);sflags.setIsLeading(sampleFlagsSampleExtension.getIsLeading());
                __CLR4_5_2hhohholvlulo82.R.inc(22868);sflags.setSampleIsDependedOn(sampleFlagsSampleExtension.getSampleIsDependedOn());
                __CLR4_5_2hhohholvlulo82.R.inc(22869);sflags.setSampleDependsOn(sampleFlagsSampleExtension.getSampleDependsOn());
                __CLR4_5_2hhohholvlulo82.R.inc(22870);sflags.setSampleHasRedundancy(sampleFlagsSampleExtension.getSampleHasRedundancy());
                __CLR4_5_2hhohholvlulo82.R.inc(22871);sflags.setSampleIsDifferenceSample(sampleFlagsSampleExtension.isSampleIsNonSyncSample());
                __CLR4_5_2hhohholvlulo82.R.inc(22872);sflags.setSamplePaddingValue(sampleFlagsSampleExtension.getSamplePaddingValue());
                __CLR4_5_2hhohholvlulo82.R.inc(22873);sflags.setSampleDegradationPriority(sampleFlagsSampleExtension.getSampleDegradationPriority());

                __CLR4_5_2hhohholvlulo82.R.inc(22874);entry.setSampleFlags(sflags);

            }

            }__CLR4_5_2hhohholvlulo82.R.inc(22875);entry.setSampleDuration(streamingSample.getDuration());

            __CLR4_5_2hhohholvlulo82.R.inc(22876);if ((((trun.isSampleCompositionTimeOffsetPresent())&&(__CLR4_5_2hhohholvlulo82.R.iget(22877)!=0|true))||(__CLR4_5_2hhohholvlulo82.R.iget(22878)==0&false))) {{
                __CLR4_5_2hhohholvlulo82.R.inc(22879);CompositionTimeSampleExtension compositionTimeSampleExtension =
                        getSampleExtension(streamingSample, CompositionTimeSampleExtension.class);
                assert (((compositionTimeSampleExtension != null)&&(__CLR4_5_2hhohholvlulo82.R.iget(22880)!=0|true))||(__CLR4_5_2hhohholvlulo82.R.iget(22881)==0&false)):"CompositionTimeSampleExtension missing even though CompositionTimeTrackExtension was present";
                __CLR4_5_2hhohholvlulo82.R.inc(22882);entry.setSampleCompositionTimeOffset(compositionTimeSampleExtension.getCompositionTimeOffset());
            }

            }__CLR4_5_2hhohholvlulo82.R.inc(22883);entries.add(entry);
        }

        }__CLR4_5_2hhohholvlulo82.R.inc(22884);trun.setEntries(entries);

        __CLR4_5_2hhohholvlulo82.R.inc(22885);parent.addBox(trun);
    }finally{__CLR4_5_2hhohholvlulo82.R.flushNeeded();}}

    private void createTraf(long sequenceNumber, MovieFragmentBox moof) {try{__CLR4_5_2hhohholvlulo82.R.inc(22886);
        __CLR4_5_2hhohholvlulo82.R.inc(22887);TrackFragmentBox traf = new TrackFragmentBox();
        __CLR4_5_2hhohholvlulo82.R.inc(22888);moof.addBox(traf);
        __CLR4_5_2hhohholvlulo82.R.inc(22889);createTfhd(traf);
        __CLR4_5_2hhohholvlulo82.R.inc(22890);createTfdt(traf);
        __CLR4_5_2hhohholvlulo82.R.inc(22891);createTrun( traf);

        __CLR4_5_2hhohholvlulo82.R.inc(22892);if ((((source.getTrackExtension(CencEncryptTrackExtension.class) != null)&&(__CLR4_5_2hhohholvlulo82.R.iget(22893)!=0|true))||(__CLR4_5_2hhohholvlulo82.R.iget(22894)==0&false))) {{
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

    }}finally{__CLR4_5_2hhohholvlulo82.R.flushNeeded();}}

    private void createMfhd(long sequenceNumber, MovieFragmentBox moof) {try{__CLR4_5_2hhohholvlulo82.R.inc(22895);
        __CLR4_5_2hhohholvlulo82.R.inc(22896);MovieFragmentHeaderBox mfhd = new MovieFragmentHeaderBox();
        __CLR4_5_2hhohholvlulo82.R.inc(22897);mfhd.setSequenceNumber(sequenceNumber);
        __CLR4_5_2hhohholvlulo82.R.inc(22898);moof.addBox(mfhd);
    }finally{__CLR4_5_2hhohholvlulo82.R.flushNeeded();}}

    private Box createMdat() {try{__CLR4_5_2hhohholvlulo82.R.inc(22899);
        __CLR4_5_2hhohholvlulo82.R.inc(22900);return new WriteOnlyBox("mdat") {
            public long getSize() {try{__CLR4_5_2hhohholvlulo82.R.inc(22901);
                __CLR4_5_2hhohholvlulo82.R.inc(22902);long l = 8;
                __CLR4_5_2hhohholvlulo82.R.inc(22903);for (StreamingSample streamingSample : fragment) {{
                    __CLR4_5_2hhohholvlulo82.R.inc(22904);l += streamingSample.getContent().remaining();
                }
                }__CLR4_5_2hhohholvlulo82.R.inc(22905);return l;
            }finally{__CLR4_5_2hhohholvlulo82.R.flushNeeded();}}

            public void getBox(WritableByteChannel writableByteChannel) throws IOException {try{__CLR4_5_2hhohholvlulo82.R.inc(22906);
                __CLR4_5_2hhohholvlulo82.R.inc(22907);ArrayList<ByteBuffer> sampleContents = new ArrayList<ByteBuffer>();
                __CLR4_5_2hhohholvlulo82.R.inc(22908);long l = 8;
                __CLR4_5_2hhohholvlulo82.R.inc(22909);for (StreamingSample streamingSample : fragment) {{
                    __CLR4_5_2hhohholvlulo82.R.inc(22910);ByteBuffer sampleContent = streamingSample.getContent();
                    __CLR4_5_2hhohholvlulo82.R.inc(22911);sampleContents.add(sampleContent);
                    __CLR4_5_2hhohholvlulo82.R.inc(22912);l += sampleContent.remaining();
                }
                }__CLR4_5_2hhohholvlulo82.R.inc(22913);ByteBuffer bb = ByteBuffer.allocate(8);
                __CLR4_5_2hhohholvlulo82.R.inc(22914);IsoTypeWriter.writeUInt32(bb, l);
                __CLR4_5_2hhohholvlulo82.R.inc(22915);bb.put(IsoFile.fourCCtoBytes(getType()));
                __CLR4_5_2hhohholvlulo82.R.inc(22916);writableByteChannel.write((ByteBuffer) bb.rewind());

                __CLR4_5_2hhohholvlulo82.R.inc(22917);for (ByteBuffer sampleContent : sampleContents) {{
                    __CLR4_5_2hhohholvlulo82.R.inc(22918);writableByteChannel.write(sampleContent);
                }
            }}finally{__CLR4_5_2hhohholvlulo82.R.flushNeeded();}}

        };
    }finally{__CLR4_5_2hhohholvlulo82.R.flushNeeded();}}
}
