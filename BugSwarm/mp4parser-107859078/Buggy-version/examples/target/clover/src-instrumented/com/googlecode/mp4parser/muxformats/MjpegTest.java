/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.googlecode.mp4parser.muxformats;

import com.coremedia.iso.Hex;
import com.coremedia.iso.IsoFile;
import com.googlecode.mp4parser.authoring.Movie;
import com.googlecode.mp4parser.authoring.Track;
import com.googlecode.mp4parser.authoring.builder.DefaultMp4Builder;
import com.googlecode.mp4parser.authoring.container.mp4.MovieCreator;
import com.googlecode.mp4parser.authoring.tracks.mjpeg.OneJpegPerIframe;
import com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox;
import com.googlecode.mp4parser.util.Path;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Arrays;

/**
 * Created by sannies on 13.02.2015.
 */
public class MjpegTest {static class __CLR4_5_2tgtglvl9g0uo{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0065\u0078\u0061\u006d\u0070\u006c\u0065\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413351766L,8589935092L,1076,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static void main(String[] args) throws IOException {try{__CLR4_5_2tgtglvl9g0uo.R.inc(1060);
        __CLR4_5_2tgtglvl9g0uo.R.inc(1061);IsoFile isofile = new IsoFile("C:\\content\\bbb-small\\output_320x180-mjpeg.mp4");
        __CLR4_5_2tgtglvl9g0uo.R.inc(1062);ESDescriptorBox esDescriptorBox = Path.getPath(isofile, "/moov[0]/trak[0]/mdia[0]/minf[0]/stbl[0]/stsd[0]/mp4v[0]/esds[0]");
        __CLR4_5_2tgtglvl9g0uo.R.inc(1063);byte[] d = new byte[esDescriptorBox.getData().rewind().remaining()];
        __CLR4_5_2tgtglvl9g0uo.R.inc(1064);esDescriptorBox.getData().get(d);
        __CLR4_5_2tgtglvl9g0uo.R.inc(1065);System.err.println(Hex.encodeHex(d));

        __CLR4_5_2tgtglvl9g0uo.R.inc(1066);Movie mRef = MovieCreator.build("C:\\content\\bbb-small\\output_320x180_150.mp4");
        __CLR4_5_2tgtglvl9g0uo.R.inc(1067);Track refTrack = mRef.getTracks().get(0);

        __CLR4_5_2tgtglvl9g0uo.R.inc(1068);File baseDir = new File("C:\\content\\bbb-small");
        __CLR4_5_2tgtglvl9g0uo.R.inc(1069);File[] iFrameJpegs = baseDir.listFiles(new FilenameFilter() {
            public boolean accept(File dir, String name) {try{__CLR4_5_2tgtglvl9g0uo.R.inc(1070);
                __CLR4_5_2tgtglvl9g0uo.R.inc(1071);return name.endsWith(".jpg");
            }finally{__CLR4_5_2tgtglvl9g0uo.R.flushNeeded();}}
        });
        __CLR4_5_2tgtglvl9g0uo.R.inc(1072);Arrays.sort(iFrameJpegs);

        __CLR4_5_2tgtglvl9g0uo.R.inc(1073);Movie mRes = new Movie();
        __CLR4_5_2tgtglvl9g0uo.R.inc(1074);mRes.addTrack(new OneJpegPerIframe("iframes", iFrameJpegs, refTrack));

        __CLR4_5_2tgtglvl9g0uo.R.inc(1075);new DefaultMp4Builder().build(mRes).writeContainer(new FileOutputStream("output-mjpeg.mp4").getChannel());
    }finally{__CLR4_5_2tgtglvl9g0uo.R.flushNeeded();}}
}
