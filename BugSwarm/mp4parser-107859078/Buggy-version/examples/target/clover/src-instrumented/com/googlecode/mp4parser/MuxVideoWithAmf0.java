/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.googlecode.mp4parser;

import com.coremedia.iso.boxes.Container;
import com.googlecode.mp4parser.authoring.Movie;
import com.googlecode.mp4parser.authoring.Track;
import com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl;
import com.googlecode.mp4parser.authoring.builder.FragmentedMp4Builder;
import com.googlecode.mp4parser.authoring.container.mp4.MovieCreator;
import com.googlecode.mp4parser.authoring.tracks.Amf0Track;
import org.apache.commons.codec.binary.Base64;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Properties;

/**
 * Shows a simple use of the AMF0Track
 */
public class MuxVideoWithAmf0 {public static class __CLR4_5_2e0e0lvl9g0p5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0065\u0078\u0061\u006d\u0070\u006c\u0065\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413351766L,8589935092L,522,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static void main(String[] args) throws IOException {try{__CLR4_5_2e0e0lvl9g0p5.R.inc(504);
        __CLR4_5_2e0e0lvl9g0p5.R.inc(505);String videoFile = MuxVideoWithAmf0.class.getProtectionDomain().getCodeSource().getLocation().getFile() + "/example-sans-amf0.mp4";

        __CLR4_5_2e0e0lvl9g0p5.R.inc(506);Movie video = MovieCreator.build(videoFile);

        __CLR4_5_2e0e0lvl9g0p5.R.inc(507);Properties props = new Properties();
        __CLR4_5_2e0e0lvl9g0p5.R.inc(508);props.load(MuxVideoWithAmf0.class.getResourceAsStream("/amf0track.properties"));
        __CLR4_5_2e0e0lvl9g0p5.R.inc(509);HashMap<Long, byte[]> samples = new HashMap<Long, byte[]>();
        __CLR4_5_2e0e0lvl9g0p5.R.inc(510);for (String key : props.stringPropertyNames()) {{
            __CLR4_5_2e0e0lvl9g0p5.R.inc(511);samples.put(Long.parseLong(key), Base64.decodeBase64(props.getProperty(key)));
        }
        }__CLR4_5_2e0e0lvl9g0p5.R.inc(512);Track amf0Track = new Amf0Track(samples);
        __CLR4_5_2e0e0lvl9g0p5.R.inc(513);amf0Track.getTrackMetaData();
        __CLR4_5_2e0e0lvl9g0p5.R.inc(514);video.addTrack(amf0Track);

        __CLR4_5_2e0e0lvl9g0p5.R.inc(515);FragmentedMp4Builder fragmentedMp4Builder = new FragmentedMp4Builder();
        __CLR4_5_2e0e0lvl9g0p5.R.inc(516);fragmentedMp4Builder.setFragmenter(new DefaultFragmenterImpl(2));

        __CLR4_5_2e0e0lvl9g0p5.R.inc(517);Container out = fragmentedMp4Builder.build(video);
        __CLR4_5_2e0e0lvl9g0p5.R.inc(518);FileOutputStream fos = new FileOutputStream(new File(String.format("output.mp4")));

        __CLR4_5_2e0e0lvl9g0p5.R.inc(519);FileChannel fc = fos.getChannel();
        __CLR4_5_2e0e0lvl9g0p5.R.inc(520);out.writeContainer(fc);

        __CLR4_5_2e0e0lvl9g0p5.R.inc(521);fos.close();

    }finally{__CLR4_5_2e0e0lvl9g0p5.R.flushNeeded();}}
}
