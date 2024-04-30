/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.googlecode.mp4parser.stuff;

import com.coremedia.iso.boxes.Container;
import com.googlecode.mp4parser.authoring.Movie;
import com.googlecode.mp4parser.authoring.Track;
import com.googlecode.mp4parser.authoring.builder.DefaultMp4Builder;
import com.googlecode.mp4parser.authoring.container.mp4.MovieCreator;
import com.googlecode.mp4parser.authoring.tracks.AppendTrack;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.LinkedList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: sannies
 * Date: 3/7/12
 * Time: 12:25 AM
 * To change this template use File | Settings | File Templates.
 */
public class DavidAppend {public static class __CLR4_5_2ususlvluo1dg{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0065\u0078\u0061\u006d\u0070\u006c\u0065\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448995581L,8589935092L,1133,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static void main(String[] args) throws IOException {try{__CLR4_5_2ususlvluo1dg.R.inc(1108);

        __CLR4_5_2ususlvluo1dg.R.inc(1109);List<Movie> movies = new LinkedList<Movie>();
        __CLR4_5_2ususlvluo1dg.R.inc(1110);movies.add(MovieCreator.build(DavidAppend.class.getProtectionDomain().getCodeSource().getLocation().getFile() + "/davidappend/v1.mp4"));
        __CLR4_5_2ususlvluo1dg.R.inc(1111);movies.add(MovieCreator.build(DavidAppend.class.getProtectionDomain().getCodeSource().getLocation().getFile() + "/davidappend/v2.mp4"));
        __CLR4_5_2ususlvluo1dg.R.inc(1112);movies.add(MovieCreator.build(DavidAppend.class.getProtectionDomain().getCodeSource().getLocation().getFile() + "/davidappend/v2.mp4"));


        __CLR4_5_2ususlvluo1dg.R.inc(1113);List<Track> videoTracks = new LinkedList<Track>();
        __CLR4_5_2ususlvluo1dg.R.inc(1114);List<Track> audioTracks = new LinkedList<Track>();


        __CLR4_5_2ususlvluo1dg.R.inc(1115);for (Movie m : movies) {{
            __CLR4_5_2ususlvluo1dg.R.inc(1116);for (Track track : m.getTracks()) {{
                __CLR4_5_2ususlvluo1dg.R.inc(1117);if ((((track.getHandler().equals("vide"))&&(__CLR4_5_2ususlvluo1dg.R.iget(1118)!=0|true))||(__CLR4_5_2ususlvluo1dg.R.iget(1119)==0&false))) {{
                    __CLR4_5_2ususlvluo1dg.R.inc(1120);videoTracks.add(track);
                }
                }__CLR4_5_2ususlvluo1dg.R.inc(1121);if ((((track.getHandler().equals("soun"))&&(__CLR4_5_2ususlvluo1dg.R.iget(1122)!=0|true))||(__CLR4_5_2ususlvluo1dg.R.iget(1123)==0&false))) {{
                    __CLR4_5_2ususlvluo1dg.R.inc(1124);audioTracks.add(track);
                }
            }}
        }}

        }__CLR4_5_2ususlvluo1dg.R.inc(1125);Movie concatMovie = new Movie();

        __CLR4_5_2ususlvluo1dg.R.inc(1126);concatMovie.addTrack(new AppendTrack(videoTracks.toArray(new Track[videoTracks.size()])));
        __CLR4_5_2ususlvluo1dg.R.inc(1127);concatMovie.addTrack(new AppendTrack(audioTracks.toArray(new Track[audioTracks.size()])));


        __CLR4_5_2ususlvluo1dg.R.inc(1128);Container out2 = new DefaultMp4Builder().build(concatMovie);
        __CLR4_5_2ususlvluo1dg.R.inc(1129);FileChannel fc = new RandomAccessFile(String.format("output.mp4"), "rw").getChannel();
        __CLR4_5_2ususlvluo1dg.R.inc(1130);fc.position(0);
        __CLR4_5_2ususlvluo1dg.R.inc(1131);out2.writeContainer(fc);
        __CLR4_5_2ususlvluo1dg.R.inc(1132);fc.close();


    }finally{__CLR4_5_2ususlvluo1dg.R.flushNeeded();}}

}
