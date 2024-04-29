/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.IsoFile;
import com.coremedia.iso.boxes.Container;
import com.googlecode.mp4parser.FileDataSourceImpl;
import com.googlecode.mp4parser.authoring.Movie;
import com.googlecode.mp4parser.authoring.Track;
import com.googlecode.mp4parser.authoring.builder.DefaultMp4Builder;
import com.googlecode.mp4parser.authoring.builder.Fragmenter;
import com.googlecode.mp4parser.authoring.builder.StaticFragmentIntersectionFinderImpl;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.nio.channels.Channels;
import java.util.Collections;

public class DTSTrackImplTest {static class __CLR4_5_2j1ij1ilvl9emrf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413286414L,8589935092L,24690,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @Test
    public void checkOutputIsStable() throws Exception {__CLR4_5_2j1ij1ilvl9emrf.R.globalSliceStart(getClass().getName(),24678);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fetpnvj1i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2j1ij1ilvl9emrf.R.rethrow($CLV_t2$);}finally{__CLR4_5_2j1ij1ilvl9emrf.R.globalSliceEnd(getClass().getName(),"com.googlecode.mp4parser.authoring.tracks.DTSTrackImplTest.checkOutputIsStable",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24678,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fetpnvj1i() throws Exception{try{__CLR4_5_2j1ij1ilvl9emrf.R.inc(24678);
        __CLR4_5_2j1ij1ilvl9emrf.R.inc(24679);Movie m = new Movie();
        __CLR4_5_2j1ij1ilvl9emrf.R.inc(24680);DTSTrackImpl dts = new DTSTrackImpl(new FileDataSourceImpl(DTSTrackImplTest.class.getProtectionDomain().getCodeSource().getLocation().getFile() + "/com/googlecode/mp4parser/authoring/tracks/dts-sample.dtshd"));
        __CLR4_5_2j1ij1ilvl9emrf.R.inc(24681);m.addTrack(dts);
        __CLR4_5_2j1ij1ilvl9emrf.R.inc(24682);Fragmenter fif = new StaticFragmentIntersectionFinderImpl(Collections.singletonMap((Track)dts, new long[]{1}));
        __CLR4_5_2j1ij1ilvl9emrf.R.inc(24683);DefaultMp4Builder mp4Builder = new DefaultMp4Builder();
        __CLR4_5_2j1ij1ilvl9emrf.R.inc(24684);mp4Builder.setFragmenter(fif);
        __CLR4_5_2j1ij1ilvl9emrf.R.inc(24685);Container c = mp4Builder.build(m);


        //  c.writeContainer(new FileOutputStream("C:\\dev\\mp4parser\\isoparser\\src\\test\\resources\\com\\googlecode\\mp4parser\\authoring\\tracks\\dts-sample.mp4").getChannel());
        __CLR4_5_2j1ij1ilvl9emrf.R.inc(24686);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_5_2j1ij1ilvl9emrf.R.inc(24687);c.writeContainer(Channels.newChannel(baos));
        __CLR4_5_2j1ij1ilvl9emrf.R.inc(24688);IsoFile ref = new IsoFile(DTSTrackImplTest.class.getProtectionDomain().getCodeSource().getLocation().getFile() + "/com/googlecode/mp4parser/authoring/tracks/dts-sample.mp4");
        __CLR4_5_2j1ij1ilvl9emrf.R.inc(24689);BoxComparator.check(ref, c, "/moov[0]/mvhd[0]", "/moov[0]/trak[0]/tkhd[0]", "/moov[0]/trak[0]/mdia[0]/mdhd[0]");


    }finally{__CLR4_5_2j1ij1ilvl9emrf.R.flushNeeded();}}
}