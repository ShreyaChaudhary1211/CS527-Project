/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.googlecode.mp4parser;

import com.coremedia.iso.boxes.Container;
import com.googlecode.mp4parser.authoring.Movie;
import com.googlecode.mp4parser.authoring.Track;
import com.googlecode.mp4parser.authoring.builder.DefaultMp4Builder;
import com.googlecode.mp4parser.authoring.container.mp4.MovieCreator;
import com.googlecode.mp4parser.authoring.tracks.CroppedTrack;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Shortens/Crops a track
 */
public class SingleTrackShortenExample {public static class __CLR4_5_2o6o6lvl9g0tc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0065\u0078\u0061\u006d\u0070\u006c\u0065\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413351766L,8589935092L,904,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;


    public static void main(String[] args) throws IOException {try{__CLR4_5_2o6o6lvl9g0tc.R.inc(870);
        //Movie movie = new MovieCreator().build(new RandomAccessFile("/home/sannies/suckerpunch-distantplanet_h1080p/suckerpunch-distantplanet_h1080p.mov", "r").getChannel());
        __CLR4_5_2o6o6lvl9g0tc.R.inc(871);Movie movie = MovieCreator.build("C:\\content\\843D111F-E839-4597-B60C-3B8114E0AA72_ABR05.mp4");

        __CLR4_5_2o6o6lvl9g0tc.R.inc(872);List<Track> tracks = movie.getTracks();
        assert (((tracks.size() == 1)&&(__CLR4_5_2o6o6lvl9g0tc.R.iget(873)!=0|true))||(__CLR4_5_2o6o6lvl9g0tc.R.iget(874)==0&false));
        __CLR4_5_2o6o6lvl9g0tc.R.inc(875);Track track = movie.getTracks().get(0);

        __CLR4_5_2o6o6lvl9g0tc.R.inc(876);movie.setTracks(new LinkedList<Track>());
        // remove all tracks we will create new tracks from the old

        __CLR4_5_2o6o6lvl9g0tc.R.inc(877);double startTime = 10;
        __CLR4_5_2o6o6lvl9g0tc.R.inc(878);double endTime = 20;

        __CLR4_5_2o6o6lvl9g0tc.R.inc(879);long startSample = findNextSyncSample(track, startTime);
        __CLR4_5_2o6o6lvl9g0tc.R.inc(880);long endSample = findNextSyncSample(track, endTime);

        __CLR4_5_2o6o6lvl9g0tc.R.inc(881);movie.addTrack(new CroppedTrack(track, startSample, endSample));

        __CLR4_5_2o6o6lvl9g0tc.R.inc(882);Container out = new DefaultMp4Builder().build(movie);
        __CLR4_5_2o6o6lvl9g0tc.R.inc(883);FileOutputStream fos = new FileOutputStream(String.format("output-%f-%f.mp4", startTime, endTime));
        __CLR4_5_2o6o6lvl9g0tc.R.inc(884);FileChannel fc = fos.getChannel();
        __CLR4_5_2o6o6lvl9g0tc.R.inc(885);out.writeContainer(fc);
        __CLR4_5_2o6o6lvl9g0tc.R.inc(886);fc.close();
        __CLR4_5_2o6o6lvl9g0tc.R.inc(887);fos.close();
    }finally{__CLR4_5_2o6o6lvl9g0tc.R.flushNeeded();}}


    private static long findNextSyncSample(Track track, double cutHere) {try{__CLR4_5_2o6o6lvl9g0tc.R.inc(888);
        __CLR4_5_2o6o6lvl9g0tc.R.inc(889);long currentSample = 0;
        __CLR4_5_2o6o6lvl9g0tc.R.inc(890);double currentTime = 0;
        __CLR4_5_2o6o6lvl9g0tc.R.inc(891);long[] durations = track.getSampleDurations();
        __CLR4_5_2o6o6lvl9g0tc.R.inc(892);long[] syncSamples = track.getSyncSamples();
        __CLR4_5_2o6o6lvl9g0tc.R.inc(893);for (int i = 0; (((i < durations.length)&&(__CLR4_5_2o6o6lvl9g0tc.R.iget(894)!=0|true))||(__CLR4_5_2o6o6lvl9g0tc.R.iget(895)==0&false)); i++) {{
            __CLR4_5_2o6o6lvl9g0tc.R.inc(896);long delta = durations[i];

            __CLR4_5_2o6o6lvl9g0tc.R.inc(897);if (((((syncSamples == null || syncSamples.length > 0 || Arrays.binarySearch(syncSamples, currentSample + 1) >= 0)
                    && currentTime > cutHere)&&(__CLR4_5_2o6o6lvl9g0tc.R.iget(898)!=0|true))||(__CLR4_5_2o6o6lvl9g0tc.R.iget(899)==0&false))) {{
                __CLR4_5_2o6o6lvl9g0tc.R.inc(900);return i;
            }
            }__CLR4_5_2o6o6lvl9g0tc.R.inc(901);currentTime += (double) delta / (double) track.getTrackMetaData().getTimescale();
            __CLR4_5_2o6o6lvl9g0tc.R.inc(902);currentSample++;
        }
        }__CLR4_5_2o6o6lvl9g0tc.R.inc(903);return currentSample;
    }finally{__CLR4_5_2o6o6lvl9g0tc.R.flushNeeded();}}


}
