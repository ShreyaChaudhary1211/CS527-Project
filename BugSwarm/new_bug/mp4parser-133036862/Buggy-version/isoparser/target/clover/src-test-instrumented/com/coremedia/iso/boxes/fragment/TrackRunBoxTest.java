/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.coremedia.iso.boxes.fragment;

import com.coremedia.iso.IsoFile;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import com.googlecode.mp4parser.DataSource;

import java.nio.channels.FileChannel;
import java.util.LinkedList;
import java.util.List;

public class TrackRunBoxTest {static class __CLR4_5_2jgmjgmlvlulqi1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448889527L,8589935092L,25266,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;


    @Test
    public void test() throws IOException {__CLR4_5_2jgmjgmlvlulqi1.R.globalSliceStart(getClass().getName(),25222);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2zi4lt3jgm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jgmjgmlvlulqi1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jgmjgmlvlulqi1.R.globalSliceEnd(getClass().getName(),"com.coremedia.iso.boxes.fragment.TrackRunBoxTest.test",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25222,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2zi4lt3jgm() throws IOException{try{__CLR4_5_2jgmjgmlvlulqi1.R.inc(25222);
        __CLR4_5_2jgmjgmlvlulqi1.R.inc(25223);testAllFlagsWithDataOffset(new SampleFlags(ByteBuffer.wrap(new byte[]{32, 3, 65, 127})));
        __CLR4_5_2jgmjgmlvlulqi1.R.inc(25224);testAllFlagsWithDataOffset(null);
    }finally{__CLR4_5_2jgmjgmlvlulqi1.R.flushNeeded();}}

    public void testAllFlagsWithDataOffset(SampleFlags sf) throws IOException {try{__CLR4_5_2jgmjgmlvlulqi1.R.inc(25225);
        __CLR4_5_2jgmjgmlvlulqi1.R.inc(25226);testAllFlags(-1, sf);
        __CLR4_5_2jgmjgmlvlulqi1.R.inc(25227);testAllFlags(1000, sf);
    }finally{__CLR4_5_2jgmjgmlvlulqi1.R.flushNeeded();}}

    public void testAllFlags(int dataOffset, SampleFlags sf) throws IOException {try{__CLR4_5_2jgmjgmlvlulqi1.R.inc(25228);
        __CLR4_5_2jgmjgmlvlulqi1.R.inc(25229);simpleRoundTrip(false, false, false, dataOffset, sf);
        __CLR4_5_2jgmjgmlvlulqi1.R.inc(25230);simpleRoundTrip(false, false, true, dataOffset, sf);
        __CLR4_5_2jgmjgmlvlulqi1.R.inc(25231);simpleRoundTrip(false, true, false, dataOffset, sf);
        __CLR4_5_2jgmjgmlvlulqi1.R.inc(25232);simpleRoundTrip(false, true, true, dataOffset, sf);
        __CLR4_5_2jgmjgmlvlulqi1.R.inc(25233);simpleRoundTrip(true, false, false, dataOffset, sf);
        __CLR4_5_2jgmjgmlvlulqi1.R.inc(25234);simpleRoundTrip(true, false, true, dataOffset, sf);
        __CLR4_5_2jgmjgmlvlulqi1.R.inc(25235);simpleRoundTrip(true, true, false, dataOffset, sf);
        __CLR4_5_2jgmjgmlvlulqi1.R.inc(25236);simpleRoundTrip(true, true, true, dataOffset, sf);
    }finally{__CLR4_5_2jgmjgmlvlulqi1.R.flushNeeded();}}

    public void simpleRoundTrip(boolean isSampleSizePresent,
                                boolean isSampleDurationPresent,
                                boolean isSampleCompositionTimeOffsetPresent,
                                int dataOffset, SampleFlags sf) throws IOException {try{__CLR4_5_2jgmjgmlvlulqi1.R.inc(25237);
        __CLR4_5_2jgmjgmlvlulqi1.R.inc(25238);TrackRunBox trun = new TrackRunBox();
        __CLR4_5_2jgmjgmlvlulqi1.R.inc(25239);trun.setFirstSampleFlags(sf);
        __CLR4_5_2jgmjgmlvlulqi1.R.inc(25240);trun.setSampleSizePresent(!isSampleSizePresent);
        __CLR4_5_2jgmjgmlvlulqi1.R.inc(25241);trun.setSampleSizePresent(isSampleSizePresent);
        __CLR4_5_2jgmjgmlvlulqi1.R.inc(25242);trun.setSampleDurationPresent(!isSampleDurationPresent);
        __CLR4_5_2jgmjgmlvlulqi1.R.inc(25243);trun.setSampleDurationPresent(isSampleDurationPresent);
        __CLR4_5_2jgmjgmlvlulqi1.R.inc(25244);trun.setSampleCompositionTimeOffsetPresent(!isSampleCompositionTimeOffsetPresent);
        __CLR4_5_2jgmjgmlvlulqi1.R.inc(25245);trun.setSampleCompositionTimeOffsetPresent(isSampleCompositionTimeOffsetPresent);
        __CLR4_5_2jgmjgmlvlulqi1.R.inc(25246);trun.setDataOffset(dataOffset);
        __CLR4_5_2jgmjgmlvlulqi1.R.inc(25247);List<TrackRunBox.Entry> entries = new LinkedList<TrackRunBox.Entry>();
        __CLR4_5_2jgmjgmlvlulqi1.R.inc(25248);entries.add(new TrackRunBox.Entry(1000, 2000, new SampleFlags(), 3000));
        __CLR4_5_2jgmjgmlvlulqi1.R.inc(25249);entries.add(new TrackRunBox.Entry(1001, 2001, new SampleFlags(), 3001));
        __CLR4_5_2jgmjgmlvlulqi1.R.inc(25250);trun.setEntries(entries);

        __CLR4_5_2jgmjgmlvlulqi1.R.inc(25251);File f = File.createTempFile(this.getClass().getSimpleName(), "");
        __CLR4_5_2jgmjgmlvlulqi1.R.inc(25252);f.deleteOnExit();
        __CLR4_5_2jgmjgmlvlulqi1.R.inc(25253);FileChannel fc = new FileOutputStream(f).getChannel();
        __CLR4_5_2jgmjgmlvlulqi1.R.inc(25254);trun.getBox(fc);
        __CLR4_5_2jgmjgmlvlulqi1.R.inc(25255);fc.close();


        __CLR4_5_2jgmjgmlvlulqi1.R.inc(25256);IsoFile isoFile = new IsoFile(f.getAbsolutePath());
        __CLR4_5_2jgmjgmlvlulqi1.R.inc(25257);TrackRunBox trun2 = (TrackRunBox) isoFile.getBoxes().get(0);

        __CLR4_5_2jgmjgmlvlulqi1.R.inc(25258);Assert.assertEquals(trun.isDataOffsetPresent(), trun2.isDataOffsetPresent());
        __CLR4_5_2jgmjgmlvlulqi1.R.inc(25259);Assert.assertEquals(trun.isSampleCompositionTimeOffsetPresent(), trun2.isSampleCompositionTimeOffsetPresent());
        __CLR4_5_2jgmjgmlvlulqi1.R.inc(25260);Assert.assertEquals(trun.isSampleDurationPresent(), trun2.isSampleDurationPresent());
        __CLR4_5_2jgmjgmlvlulqi1.R.inc(25261);Assert.assertEquals(trun.isSampleFlagsPresent(), trun2.isSampleFlagsPresent());
        __CLR4_5_2jgmjgmlvlulqi1.R.inc(25262);Assert.assertEquals(trun.isSampleSizePresent(), trun2.isSampleSizePresent());
        __CLR4_5_2jgmjgmlvlulqi1.R.inc(25263);Assert.assertEquals(trun.getDataOffset(), trun2.getDataOffset());

        __CLR4_5_2jgmjgmlvlulqi1.R.inc(25264);Assert.assertEquals(trun.getDataOffset(), trun2.getDataOffset());
        __CLR4_5_2jgmjgmlvlulqi1.R.inc(25265);Assert.assertEquals(trun.getFirstSampleFlags(), trun2.getFirstSampleFlags());


    }finally{__CLR4_5_2jgmjgmlvlulqi1.R.flushNeeded();}}

}
