/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.googlecode.mp4parser.boxes.ultraviolet;

import com.coremedia.iso.IsoFile;
import com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox;
import com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat;
import com.googlecode.mp4parser.boxes.dece.SampleEncryptionBox;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.LinkedList;
import java.util.List;


public class SampleEncryptionBoxTest  {static class __CLR4_5_2khlkhllvlulrbs{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448889527L,8589935092L,26594,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;


    SampleEncryptionBox senc = new SampleEncryptionBox();


    @Test
    public void testRoundTripFlagsZero() throws IOException {__CLR4_5_2khlkhllvlulrbs.R.globalSliceStart(getClass().getName(),26553);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fef1f9khl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2khlkhllvlulrbs.R.rethrow($CLV_t2$);}finally{__CLR4_5_2khlkhllvlulrbs.R.globalSliceEnd(getClass().getName(),"com.googlecode.mp4parser.boxes.ultraviolet.SampleEncryptionBoxTest.testRoundTripFlagsZero",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26553,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fef1f9khl() throws IOException{try{__CLR4_5_2khlkhllvlulrbs.R.inc(26553);
        __CLR4_5_2khlkhllvlulrbs.R.inc(26554);List<CencSampleAuxiliaryDataFormat> entries = new LinkedList<CencSampleAuxiliaryDataFormat>();

        __CLR4_5_2khlkhllvlulrbs.R.inc(26555);CencSampleAuxiliaryDataFormat entry = new CencSampleAuxiliaryDataFormat();
        __CLR4_5_2khlkhllvlulrbs.R.inc(26556);entry.iv = new byte[]{1, 2, 3, 4, 5, 6, 7, 8};
        __CLR4_5_2khlkhllvlulrbs.R.inc(26557);entries.add(entry);

        __CLR4_5_2khlkhllvlulrbs.R.inc(26558);senc.setEntries(entries);

        __CLR4_5_2khlkhllvlulrbs.R.inc(26559);File f = File.createTempFile(this.getClass().getSimpleName(), "");
        __CLR4_5_2khlkhllvlulrbs.R.inc(26560);f.deleteOnExit();
        __CLR4_5_2khlkhllvlulrbs.R.inc(26561);FileChannel fc = new FileOutputStream(f).getChannel();
        __CLR4_5_2khlkhllvlulrbs.R.inc(26562);senc.getBox(fc);
        __CLR4_5_2khlkhllvlulrbs.R.inc(26563);fc.close();
        __CLR4_5_2khlkhllvlulrbs.R.inc(26564);Assert.assertEquals(f.length(), senc.getSize());


        __CLR4_5_2khlkhllvlulrbs.R.inc(26565);IsoFile iso = new IsoFile(f.getAbsolutePath());


        __CLR4_5_2khlkhllvlulrbs.R.inc(26566);Assert.assertTrue(iso.getBoxes().get(0) instanceof AbstractSampleEncryptionBox);
        __CLR4_5_2khlkhllvlulrbs.R.inc(26567);AbstractSampleEncryptionBox senc2 = (AbstractSampleEncryptionBox) iso.getBoxes().get(0);
        __CLR4_5_2khlkhllvlulrbs.R.inc(26568);Assert.assertEquals(0, senc2.getFlags());
        __CLR4_5_2khlkhllvlulrbs.R.inc(26569);Assert.assertTrue(senc.equals(senc2));
        __CLR4_5_2khlkhllvlulrbs.R.inc(26570);Assert.assertTrue(senc2.equals(senc));

    }finally{__CLR4_5_2khlkhllvlulrbs.R.flushNeeded();}}


    @Test
    public void testRoundTripFlagsTwo() throws IOException {__CLR4_5_2khlkhllvlulrbs.R.globalSliceStart(getClass().getName(),26571);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2obssp9ki3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2khlkhllvlulrbs.R.rethrow($CLV_t2$);}finally{__CLR4_5_2khlkhllvlulrbs.R.globalSliceEnd(getClass().getName(),"com.googlecode.mp4parser.boxes.ultraviolet.SampleEncryptionBoxTest.testRoundTripFlagsTwo",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26571,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2obssp9ki3() throws IOException{try{__CLR4_5_2khlkhllvlulrbs.R.inc(26571);
        __CLR4_5_2khlkhllvlulrbs.R.inc(26572);senc.setSubSampleEncryption(true);
        __CLR4_5_2khlkhllvlulrbs.R.inc(26573);List<CencSampleAuxiliaryDataFormat> entries = new LinkedList<CencSampleAuxiliaryDataFormat>();
        __CLR4_5_2khlkhllvlulrbs.R.inc(26574);CencSampleAuxiliaryDataFormat entry = new CencSampleAuxiliaryDataFormat();
        __CLR4_5_2khlkhllvlulrbs.R.inc(26575);entry.iv = new byte[]{1, 2, 3, 4, 5, 6, 7, 8};
        __CLR4_5_2khlkhllvlulrbs.R.inc(26576);entry.pairs = new CencSampleAuxiliaryDataFormat.Pair[5];
        __CLR4_5_2khlkhllvlulrbs.R.inc(26577);entry.pairs[0]=entry.createPair(5, 15);
        __CLR4_5_2khlkhllvlulrbs.R.inc(26578);entry.pairs[1]=entry.createPair(5, 16);
        __CLR4_5_2khlkhllvlulrbs.R.inc(26579);entry.pairs[2]=entry.createPair(5, 17);
        __CLR4_5_2khlkhllvlulrbs.R.inc(26580);entry.pairs[3]=entry.createPair(5, 18);
        __CLR4_5_2khlkhllvlulrbs.R.inc(26581);entry.pairs[4]=entry.createPair(5, 19);
        __CLR4_5_2khlkhllvlulrbs.R.inc(26582);entries.add(entry);


        __CLR4_5_2khlkhllvlulrbs.R.inc(26583);senc.setEntries(entries);

        __CLR4_5_2khlkhllvlulrbs.R.inc(26584);File f = File.createTempFile(this.getClass().getSimpleName(), "");
        __CLR4_5_2khlkhllvlulrbs.R.inc(26585);FileChannel fc = new FileOutputStream(f).getChannel();
        __CLR4_5_2khlkhllvlulrbs.R.inc(26586);senc.getBox(fc);
        __CLR4_5_2khlkhllvlulrbs.R.inc(26587);fc.close();

        __CLR4_5_2khlkhllvlulrbs.R.inc(26588);IsoFile iso = new IsoFile(f.getAbsolutePath());

        __CLR4_5_2khlkhllvlulrbs.R.inc(26589);Assert.assertTrue(iso.getBoxes().get(0) instanceof AbstractSampleEncryptionBox);
        __CLR4_5_2khlkhllvlulrbs.R.inc(26590);AbstractSampleEncryptionBox senc2 = (AbstractSampleEncryptionBox) iso.getBoxes().get(0);
        __CLR4_5_2khlkhllvlulrbs.R.inc(26591);Assert.assertEquals(2, senc2.getFlags());
        __CLR4_5_2khlkhllvlulrbs.R.inc(26592);Assert.assertTrue(senc.equals(senc2));
        __CLR4_5_2khlkhllvlulrbs.R.inc(26593);Assert.assertTrue(senc2.equals(senc));

    }finally{__CLR4_5_2khlkhllvlulrbs.R.flushNeeded();}}


}
