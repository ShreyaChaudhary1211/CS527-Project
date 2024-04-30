/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.googlecode.mp4parser;

import com.coremedia.iso.boxes.Container;
import com.googlecode.mp4parser.authoring.Movie;
import com.googlecode.mp4parser.authoring.Track;
import com.googlecode.mp4parser.authoring.builder.DefaultMp4Builder;
import com.googlecode.mp4parser.authoring.builder.FragmentedMp4Builder;
import com.googlecode.mp4parser.authoring.builder.SyncSampleIntersectFinderImpl;
import com.googlecode.mp4parser.authoring.container.mp4.MovieCreator;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Muxes 2 audio tracks with a video track.
 */
public class MuxMp4SourcesExample {public static class __CLR4_5_2dcdclvluo03u{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0065\u0078\u0061\u006d\u0070\u006c\u0065\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448995581L,8589935092L,503,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static void main(String[] args) throws IOException {try{__CLR4_5_2dcdclvluo03u.R.inc(480);

        __CLR4_5_2dcdclvluo03u.R.inc(481);String audioDeutsch = MuxMp4SourcesExample.class.getProtectionDomain().getCodeSource().getLocation().getFile() + "/count-deutsch-audio.mp4";
        __CLR4_5_2dcdclvluo03u.R.inc(482);String audioEnglish = MuxMp4SourcesExample.class.getProtectionDomain().getCodeSource().getLocation().getFile() + "/count-english-audio.mp4";
        __CLR4_5_2dcdclvluo03u.R.inc(483);String video = MuxMp4SourcesExample.class.getProtectionDomain().getCodeSource().getLocation().getFile() + "/count-video.mp4";


        __CLR4_5_2dcdclvluo03u.R.inc(484);Movie countVideo = MovieCreator.build(video);
        __CLR4_5_2dcdclvluo03u.R.inc(485);Movie countAudioDeutsch = MovieCreator.build(audioDeutsch);
        __CLR4_5_2dcdclvluo03u.R.inc(486);Movie countAudioEnglish = MovieCreator.build(audioEnglish);

        __CLR4_5_2dcdclvluo03u.R.inc(487);Track audioTrackDeutsch = countAudioDeutsch.getTracks().get(0);
        __CLR4_5_2dcdclvluo03u.R.inc(488);audioTrackDeutsch.getTrackMetaData().setLanguage("deu");
        __CLR4_5_2dcdclvluo03u.R.inc(489);Track audioTrackEnglish = countAudioEnglish.getTracks().get(0);
        __CLR4_5_2dcdclvluo03u.R.inc(490);audioTrackEnglish.getTrackMetaData().setLanguage("eng");

        __CLR4_5_2dcdclvluo03u.R.inc(491);countVideo.addTrack(audioTrackDeutsch);
        __CLR4_5_2dcdclvluo03u.R.inc(492);countVideo.addTrack(audioTrackEnglish);

        {
            __CLR4_5_2dcdclvluo03u.R.inc(493);Container out = new DefaultMp4Builder().build(countVideo);
            __CLR4_5_2dcdclvluo03u.R.inc(494);FileOutputStream fos = new FileOutputStream(new File("output.mp4"));
            __CLR4_5_2dcdclvluo03u.R.inc(495);out.writeContainer(fos.getChannel());
            __CLR4_5_2dcdclvluo03u.R.inc(496);fos.close();
        }
        {
            __CLR4_5_2dcdclvluo03u.R.inc(497);FragmentedMp4Builder fragmentedMp4Builder = new FragmentedMp4Builder();
            __CLR4_5_2dcdclvluo03u.R.inc(498);fragmentedMp4Builder.setFragmenter(new SyncSampleIntersectFinderImpl(countVideo, null, -1));
            __CLR4_5_2dcdclvluo03u.R.inc(499);Container out = fragmentedMp4Builder.build(countVideo);
            __CLR4_5_2dcdclvluo03u.R.inc(500);FileOutputStream fos = new FileOutputStream(new File("output-frag.mp4"));
            __CLR4_5_2dcdclvluo03u.R.inc(501);out.writeContainer(fos.getChannel());
            __CLR4_5_2dcdclvluo03u.R.inc(502);fos.close();
        }
    }finally{__CLR4_5_2dcdclvluo03u.R.flushNeeded();}}

}
