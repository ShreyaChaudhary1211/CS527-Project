/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.mp4parser.iso14496.part12;

import com.coremedia.iso.IsoFile;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

public class SampleAuxiliaryInformationSizesBoxTest {static class __CLR4_5_2kkckkclvlulrcq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448889527L,8589935092L,26682,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @Test
    public void roundTripFlags0() throws IOException {__CLR4_5_2kkckkclvlulrcq.R.globalSliceStart(getClass().getName(),26652);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2r9u3gdkkc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2kkckkclvlulrcq.R.rethrow($CLV_t2$);}finally{__CLR4_5_2kkckkclvlulrcq.R.globalSliceEnd(getClass().getName(),"com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBoxTest.roundTripFlags0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26652,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2r9u3gdkkc() throws IOException{try{__CLR4_5_2kkckkclvlulrcq.R.inc(26652);
        __CLR4_5_2kkckkclvlulrcq.R.inc(26653);SampleAuxiliaryInformationSizesBox saiz1 = new SampleAuxiliaryInformationSizesBox();
        __CLR4_5_2kkckkclvlulrcq.R.inc(26654);short[] ss = new short[]{1, 11, 10, 100};
        __CLR4_5_2kkckkclvlulrcq.R.inc(26655);saiz1.setSampleInfoSizes(ss);
        __CLR4_5_2kkckkclvlulrcq.R.inc(26656);File f = File.createTempFile(this.getClass().getSimpleName(), "");
        __CLR4_5_2kkckkclvlulrcq.R.inc(26657);FileChannel fc = new FileOutputStream(f).getChannel();
        __CLR4_5_2kkckkclvlulrcq.R.inc(26658);saiz1.getBox(fc);
        __CLR4_5_2kkckkclvlulrcq.R.inc(26659);fc.close();

        __CLR4_5_2kkckkclvlulrcq.R.inc(26660);IsoFile isoFile = new IsoFile(f.getAbsolutePath());
        __CLR4_5_2kkckkclvlulrcq.R.inc(26661);SampleAuxiliaryInformationSizesBox saiz2 = (SampleAuxiliaryInformationSizesBox) isoFile.getBoxes().get(0);

        __CLR4_5_2kkckkclvlulrcq.R.inc(26662);Assert.assertEquals(saiz1.getDefaultSampleInfoSize(), saiz2.getDefaultSampleInfoSize());
        __CLR4_5_2kkckkclvlulrcq.R.inc(26663);Assert.assertArrayEquals(saiz1.getSampleInfoSizes(), saiz2.getSampleInfoSizes());


    }finally{__CLR4_5_2kkckkclvlulrcq.R.flushNeeded();}}

    @Test
    public void roundTripFlags1() throws IOException {__CLR4_5_2kkckkclvlulrcq.R.globalSliceStart(getClass().getName(),26664);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2o0u4nwkko();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2kkckkclvlulrcq.R.rethrow($CLV_t2$);}finally{__CLR4_5_2kkckkclvlulrcq.R.globalSliceEnd(getClass().getName(),"com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBoxTest.roundTripFlags1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26664,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2o0u4nwkko() throws IOException{try{__CLR4_5_2kkckkclvlulrcq.R.inc(26664);
        __CLR4_5_2kkckkclvlulrcq.R.inc(26665);SampleAuxiliaryInformationSizesBox saiz1 = new SampleAuxiliaryInformationSizesBox();
        __CLR4_5_2kkckkclvlulrcq.R.inc(26666);saiz1.setFlags(1);
        __CLR4_5_2kkckkclvlulrcq.R.inc(26667);saiz1.setAuxInfoType("piff");
        __CLR4_5_2kkckkclvlulrcq.R.inc(26668);saiz1.setAuxInfoTypeParameter("trak");
        __CLR4_5_2kkckkclvlulrcq.R.inc(26669);short[] ss = new short[]{1, 11, 10, 100};
        __CLR4_5_2kkckkclvlulrcq.R.inc(26670);saiz1.setSampleInfoSizes(ss);
        __CLR4_5_2kkckkclvlulrcq.R.inc(26671);File f = File.createTempFile(this.getClass().getSimpleName(), "");
        __CLR4_5_2kkckkclvlulrcq.R.inc(26672);f.deleteOnExit();
        __CLR4_5_2kkckkclvlulrcq.R.inc(26673);FileChannel fc = new FileOutputStream(f).getChannel();
        __CLR4_5_2kkckkclvlulrcq.R.inc(26674);saiz1.getBox(fc);
        __CLR4_5_2kkckkclvlulrcq.R.inc(26675);fc.close();

        __CLR4_5_2kkckkclvlulrcq.R.inc(26676);IsoFile isoFile = new IsoFile(f.getAbsolutePath());
        __CLR4_5_2kkckkclvlulrcq.R.inc(26677);SampleAuxiliaryInformationSizesBox saiz2 = (SampleAuxiliaryInformationSizesBox) isoFile.getBoxes().get(0);

        __CLR4_5_2kkckkclvlulrcq.R.inc(26678);Assert.assertEquals(saiz1.getDefaultSampleInfoSize(), saiz2.getDefaultSampleInfoSize());
        __CLR4_5_2kkckkclvlulrcq.R.inc(26679);Assert.assertArrayEquals(saiz1.getSampleInfoSizes(), saiz2.getSampleInfoSizes());
        __CLR4_5_2kkckkclvlulrcq.R.inc(26680);Assert.assertEquals(saiz1.getAuxInfoType(), saiz2.getAuxInfoType());
        __CLR4_5_2kkckkclvlulrcq.R.inc(26681);Assert.assertEquals(saiz1.getAuxInfoTypeParameter(), saiz2.getAuxInfoTypeParameter());


    }finally{__CLR4_5_2kkckkclvlulrcq.R.flushNeeded();}}
}
