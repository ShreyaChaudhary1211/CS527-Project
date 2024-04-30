/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.coremedia.iso.boxes.fragment;


import com.coremedia.iso.IsoFile;
import com.googlecode.mp4parser.DataSource;
import junit.framework.Assert;
import org.junit.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.LinkedList;
import java.util.List;

public class TrackFragmentRandomAccessBoxTest {static class __CLR4_5_2jfbjfblvlulqhs{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448889527L,8589935092L,25222,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @Test
    public void testRoundtrip() throws IOException {__CLR4_5_2jfbjfblvlulqhs.R.globalSliceStart(getClass().getName(),25175);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2la7nh4jfb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jfbjfblvlulqhs.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jfbjfblvlulqhs.R.globalSliceEnd(getClass().getName(),"com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBoxTest.testRoundtrip",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25175,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2la7nh4jfb() throws IOException{try{__CLR4_5_2jfbjfblvlulqhs.R.inc(25175);
        __CLR4_5_2jfbjfblvlulqhs.R.inc(25176);testRoundtrip(1, 1, 1);
        __CLR4_5_2jfbjfblvlulqhs.R.inc(25177);testRoundtrip(2, 1, 1);
        __CLR4_5_2jfbjfblvlulqhs.R.inc(25178);testRoundtrip(4, 1, 1);
        __CLR4_5_2jfbjfblvlulqhs.R.inc(25179);testRoundtrip(1, 2, 1);
        __CLR4_5_2jfbjfblvlulqhs.R.inc(25180);testRoundtrip(2, 2, 1);
        __CLR4_5_2jfbjfblvlulqhs.R.inc(25181);testRoundtrip(4, 2, 1);
        __CLR4_5_2jfbjfblvlulqhs.R.inc(25182);testRoundtrip(1, 4, 1);
        __CLR4_5_2jfbjfblvlulqhs.R.inc(25183);testRoundtrip(2, 4, 1);
        __CLR4_5_2jfbjfblvlulqhs.R.inc(25184);testRoundtrip(4, 4, 1);

        __CLR4_5_2jfbjfblvlulqhs.R.inc(25185);testRoundtrip(1, 1, 2);
        __CLR4_5_2jfbjfblvlulqhs.R.inc(25186);testRoundtrip(2, 1, 2);
        __CLR4_5_2jfbjfblvlulqhs.R.inc(25187);testRoundtrip(4, 1, 2);
        __CLR4_5_2jfbjfblvlulqhs.R.inc(25188);testRoundtrip(1, 2, 2);
        __CLR4_5_2jfbjfblvlulqhs.R.inc(25189);testRoundtrip(2, 2, 2);
        __CLR4_5_2jfbjfblvlulqhs.R.inc(25190);testRoundtrip(4, 2, 2);
        __CLR4_5_2jfbjfblvlulqhs.R.inc(25191);testRoundtrip(1, 4, 2);
        __CLR4_5_2jfbjfblvlulqhs.R.inc(25192);testRoundtrip(2, 4, 2);
        __CLR4_5_2jfbjfblvlulqhs.R.inc(25193);testRoundtrip(4, 4, 2);

        __CLR4_5_2jfbjfblvlulqhs.R.inc(25194);testRoundtrip(1, 1, 4);
        __CLR4_5_2jfbjfblvlulqhs.R.inc(25195);testRoundtrip(2, 1, 4);
        __CLR4_5_2jfbjfblvlulqhs.R.inc(25196);testRoundtrip(4, 1, 4);
        __CLR4_5_2jfbjfblvlulqhs.R.inc(25197);testRoundtrip(1, 2, 4);
        __CLR4_5_2jfbjfblvlulqhs.R.inc(25198);testRoundtrip(2, 2, 4);
        __CLR4_5_2jfbjfblvlulqhs.R.inc(25199);testRoundtrip(4, 2, 4);
        __CLR4_5_2jfbjfblvlulqhs.R.inc(25200);testRoundtrip(1, 4, 4);
        __CLR4_5_2jfbjfblvlulqhs.R.inc(25201);testRoundtrip(2, 4, 4);
        __CLR4_5_2jfbjfblvlulqhs.R.inc(25202);testRoundtrip(4, 4, 4);
    }finally{__CLR4_5_2jfbjfblvlulqhs.R.flushNeeded();}}

    public void testRoundtrip(int sizeOfSampleNum, int lengthSizeOfTrafNum, int lengthSizeOfTrunNum) throws IOException {try{__CLR4_5_2jfbjfblvlulqhs.R.inc(25203);
        __CLR4_5_2jfbjfblvlulqhs.R.inc(25204);TrackFragmentRandomAccessBox traf = new TrackFragmentRandomAccessBox();
        __CLR4_5_2jfbjfblvlulqhs.R.inc(25205);traf.setLengthSizeOfSampleNum(sizeOfSampleNum);
        __CLR4_5_2jfbjfblvlulqhs.R.inc(25206);traf.setLengthSizeOfTrafNum(lengthSizeOfTrafNum);
        __CLR4_5_2jfbjfblvlulqhs.R.inc(25207);traf.setLengthSizeOfTrunNum(lengthSizeOfTrunNum);
        __CLR4_5_2jfbjfblvlulqhs.R.inc(25208);List<TrackFragmentRandomAccessBox.Entry> entries = new LinkedList<TrackFragmentRandomAccessBox.Entry>();
        __CLR4_5_2jfbjfblvlulqhs.R.inc(25209);entries.add(new TrackFragmentRandomAccessBox.Entry(1, 2, 3, 4, 5));

        __CLR4_5_2jfbjfblvlulqhs.R.inc(25210);traf.setEntries(entries);

        __CLR4_5_2jfbjfblvlulqhs.R.inc(25211);File f = File.createTempFile(this.getClass().getSimpleName(), "");
        __CLR4_5_2jfbjfblvlulqhs.R.inc(25212);f.deleteOnExit();
        __CLR4_5_2jfbjfblvlulqhs.R.inc(25213);FileChannel fc = new FileOutputStream(f).getChannel();
        __CLR4_5_2jfbjfblvlulqhs.R.inc(25214);traf.getBox(fc);
        __CLR4_5_2jfbjfblvlulqhs.R.inc(25215);fc.close();


        __CLR4_5_2jfbjfblvlulqhs.R.inc(25216);IsoFile isoFile = new IsoFile(f.getAbsolutePath());
        __CLR4_5_2jfbjfblvlulqhs.R.inc(25217);TrackFragmentRandomAccessBox traf2 = (TrackFragmentRandomAccessBox) isoFile.getBoxes().get(0);
        __CLR4_5_2jfbjfblvlulqhs.R.inc(25218);Assert.assertEquals(traf.getNumberOfEntries(), traf2.getNumberOfEntries());
        __CLR4_5_2jfbjfblvlulqhs.R.inc(25219);Assert.assertEquals(traf.getReserved(), traf2.getReserved());
        __CLR4_5_2jfbjfblvlulqhs.R.inc(25220);Assert.assertEquals(traf.getTrackId(), traf2.getTrackId());
        //System.err.println("" + sizeOfSampleNum + " " + lengthSizeOfTrafNum + " " + lengthSizeOfTrunNum);
        __CLR4_5_2jfbjfblvlulqhs.R.inc(25221);Assert.assertEquals(traf.getEntries(), traf2.getEntries());

    }finally{__CLR4_5_2jfbjfblvlulqhs.R.flushNeeded();}}

}
