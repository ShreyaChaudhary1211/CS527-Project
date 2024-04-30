/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.googlecode.mp4parser.boxes.piff;

import com.coremedia.iso.IsoFile;
import com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox;
import com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat;
import com.googlecode.mp4parser.util.UUIDConverter;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;


public class PiffSampleEncryptionBoxTest {static class __CLR4_5_2kefkeflvlulray{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448889527L,8589935092L,26533,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    PiffSampleEncryptionBox senc = new PiffSampleEncryptionBox();



    @Test
    public void testRoundTripFlagsZero() throws IOException {__CLR4_5_2kefkeflvlulray.R.globalSliceStart(getClass().getName(),26439);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fef1f9kef();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2kefkeflvlulray.R.rethrow($CLV_t2$);}finally{__CLR4_5_2kefkeflvlulray.R.globalSliceEnd(getClass().getName(),"com.googlecode.mp4parser.boxes.piff.PiffSampleEncryptionBoxTest.testRoundTripFlagsZero",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26439,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fef1f9kef() throws IOException{try{__CLR4_5_2kefkeflvlulray.R.inc(26439);
        __CLR4_5_2kefkeflvlulray.R.inc(26440);List<CencSampleAuxiliaryDataFormat> entries = new LinkedList<CencSampleAuxiliaryDataFormat>();

        __CLR4_5_2kefkeflvlulray.R.inc(26441);CencSampleAuxiliaryDataFormat entry = new CencSampleAuxiliaryDataFormat();
        __CLR4_5_2kefkeflvlulray.R.inc(26442);entry.iv = new byte[]{1, 2, 3, 4, 5, 6, 7, 8};
        __CLR4_5_2kefkeflvlulray.R.inc(26443);entries.add(entry);

        __CLR4_5_2kefkeflvlulray.R.inc(26444);senc.setEntries(entries);

        __CLR4_5_2kefkeflvlulray.R.inc(26445);File f = File.createTempFile(this.getClass().getSimpleName(), "");
        __CLR4_5_2kefkeflvlulray.R.inc(26446);f.deleteOnExit();
        __CLR4_5_2kefkeflvlulray.R.inc(26447);FileChannel fc = new FileOutputStream(f).getChannel();
        __CLR4_5_2kefkeflvlulray.R.inc(26448);senc.getBox(fc);
        __CLR4_5_2kefkeflvlulray.R.inc(26449);fc.close();
        __CLR4_5_2kefkeflvlulray.R.inc(26450);Assert.assertEquals(f.length(), senc.getSize());


        __CLR4_5_2kefkeflvlulray.R.inc(26451);IsoFile iso = new IsoFile(f.getAbsolutePath());


        __CLR4_5_2kefkeflvlulray.R.inc(26452);Assert.assertTrue(iso.getBoxes().get(0) instanceof AbstractSampleEncryptionBox);
        __CLR4_5_2kefkeflvlulray.R.inc(26453);AbstractSampleEncryptionBox senc2 = (AbstractSampleEncryptionBox) iso.getBoxes().get(0);
        __CLR4_5_2kefkeflvlulray.R.inc(26454);Assert.assertEquals(0, senc2.getFlags());
        __CLR4_5_2kefkeflvlulray.R.inc(26455);Assert.assertTrue(senc.equals(senc2));
        __CLR4_5_2kefkeflvlulray.R.inc(26456);Assert.assertTrue(senc2.equals(senc));

    }finally{__CLR4_5_2kefkeflvlulray.R.flushNeeded();}}

    @Test
    public void testRoundTripFlagsOne() throws IOException {__CLR4_5_2kefkeflvlulray.R.globalSliceStart(getClass().getName(),26457);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2j5so4nkex();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2kefkeflvlulray.R.rethrow($CLV_t2$);}finally{__CLR4_5_2kefkeflvlulray.R.globalSliceEnd(getClass().getName(),"com.googlecode.mp4parser.boxes.piff.PiffSampleEncryptionBoxTest.testRoundTripFlagsOne",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26457,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2j5so4nkex() throws IOException{try{__CLR4_5_2kefkeflvlulray.R.inc(26457);
        __CLR4_5_2kefkeflvlulray.R.inc(26458);senc.setOverrideTrackEncryptionBoxParameters(true);
        __CLR4_5_2kefkeflvlulray.R.inc(26459);senc.setAlgorithmId(0x333333);
        __CLR4_5_2kefkeflvlulray.R.inc(26460);senc.setIvSize(8);
        __CLR4_5_2kefkeflvlulray.R.inc(26461);senc.setKid(UUIDConverter.convert(UUID.randomUUID()));

        __CLR4_5_2kefkeflvlulray.R.inc(26462);List<CencSampleAuxiliaryDataFormat> entries = new LinkedList<CencSampleAuxiliaryDataFormat>();
        __CLR4_5_2kefkeflvlulray.R.inc(26463);CencSampleAuxiliaryDataFormat entry = new CencSampleAuxiliaryDataFormat();
        __CLR4_5_2kefkeflvlulray.R.inc(26464);entry.iv = new byte[]{1, 2, 3, 4, 5, 6, 7, 8};
        __CLR4_5_2kefkeflvlulray.R.inc(26465);entries.add(entry);

        __CLR4_5_2kefkeflvlulray.R.inc(26466);senc.setEntries(entries);
        __CLR4_5_2kefkeflvlulray.R.inc(26467);File f = File.createTempFile(this.getClass().getSimpleName(), "");
        __CLR4_5_2kefkeflvlulray.R.inc(26468);f.deleteOnExit();
        __CLR4_5_2kefkeflvlulray.R.inc(26469);FileChannel fc = new FileOutputStream(f).getChannel();
        __CLR4_5_2kefkeflvlulray.R.inc(26470);senc.getBox(fc);
        __CLR4_5_2kefkeflvlulray.R.inc(26471);fc.close();

        __CLR4_5_2kefkeflvlulray.R.inc(26472);IsoFile iso = new IsoFile(f.getAbsolutePath());

        __CLR4_5_2kefkeflvlulray.R.inc(26473);Assert.assertTrue(iso.getBoxes().get(0) instanceof AbstractSampleEncryptionBox);
        __CLR4_5_2kefkeflvlulray.R.inc(26474);AbstractSampleEncryptionBox senc2 = (AbstractSampleEncryptionBox) iso.getBoxes().get(0);
        __CLR4_5_2kefkeflvlulray.R.inc(26475);Assert.assertEquals(1, senc2.getFlags());
        __CLR4_5_2kefkeflvlulray.R.inc(26476);Assert.assertTrue(senc.equals(senc2));
        __CLR4_5_2kefkeflvlulray.R.inc(26477);Assert.assertTrue(senc2.equals(senc));
    }finally{__CLR4_5_2kefkeflvlulray.R.flushNeeded();}}

    @Test
    public void testRoundTripFlagsTwo() throws IOException {__CLR4_5_2kefkeflvlulray.R.globalSliceStart(getClass().getName(),26478);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2obssp9kfi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2kefkeflvlulray.R.rethrow($CLV_t2$);}finally{__CLR4_5_2kefkeflvlulray.R.globalSliceEnd(getClass().getName(),"com.googlecode.mp4parser.boxes.piff.PiffSampleEncryptionBoxTest.testRoundTripFlagsTwo",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26478,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2obssp9kfi() throws IOException{try{__CLR4_5_2kefkeflvlulray.R.inc(26478);
        __CLR4_5_2kefkeflvlulray.R.inc(26479);senc.setSubSampleEncryption(true);
        __CLR4_5_2kefkeflvlulray.R.inc(26480);List<CencSampleAuxiliaryDataFormat> entries = new LinkedList<CencSampleAuxiliaryDataFormat>();
        __CLR4_5_2kefkeflvlulray.R.inc(26481);CencSampleAuxiliaryDataFormat entry = new CencSampleAuxiliaryDataFormat();
        __CLR4_5_2kefkeflvlulray.R.inc(26482);entry.iv = new byte[]{1, 2, 3, 4, 5, 6, 7, 8};
        __CLR4_5_2kefkeflvlulray.R.inc(26483);entry.pairs = new CencSampleAuxiliaryDataFormat.Pair[5];
        __CLR4_5_2kefkeflvlulray.R.inc(26484);entry.pairs[0] = entry.createPair(5, 15);
        __CLR4_5_2kefkeflvlulray.R.inc(26485);entry.pairs[1] = entry.createPair(5, 16);
        __CLR4_5_2kefkeflvlulray.R.inc(26486);entry.pairs[2] = entry.createPair(5, 17);
        __CLR4_5_2kefkeflvlulray.R.inc(26487);entry.pairs[3] = entry.createPair(5, 18);
        __CLR4_5_2kefkeflvlulray.R.inc(26488);entry.pairs[4] = entry.createPair(5, 19);
        __CLR4_5_2kefkeflvlulray.R.inc(26489);entries.add(entry);


        __CLR4_5_2kefkeflvlulray.R.inc(26490);senc.setEntries(entries);

        __CLR4_5_2kefkeflvlulray.R.inc(26491);File f = File.createTempFile(this.getClass().getSimpleName(), "");
        __CLR4_5_2kefkeflvlulray.R.inc(26492);f.deleteOnExit();
        __CLR4_5_2kefkeflvlulray.R.inc(26493);FileChannel fc = new FileOutputStream(f).getChannel();
        __CLR4_5_2kefkeflvlulray.R.inc(26494);senc.getBox(fc);
        __CLR4_5_2kefkeflvlulray.R.inc(26495);fc.close();

        __CLR4_5_2kefkeflvlulray.R.inc(26496);IsoFile iso = new IsoFile(f.getAbsolutePath());

        __CLR4_5_2kefkeflvlulray.R.inc(26497);Assert.assertTrue(iso.getBoxes().get(0) instanceof AbstractSampleEncryptionBox);
        __CLR4_5_2kefkeflvlulray.R.inc(26498);AbstractSampleEncryptionBox senc2 = (AbstractSampleEncryptionBox) iso.getBoxes().get(0);
        __CLR4_5_2kefkeflvlulray.R.inc(26499);Assert.assertEquals(2, senc2.getFlags());
        __CLR4_5_2kefkeflvlulray.R.inc(26500);Assert.assertTrue(senc.equals(senc2));
        __CLR4_5_2kefkeflvlulray.R.inc(26501);Assert.assertTrue(senc2.equals(senc));

    }finally{__CLR4_5_2kefkeflvlulray.R.flushNeeded();}}

    @Test
    public void testRoundTripFlagsThree() throws IOException {__CLR4_5_2kefkeflvlulray.R.globalSliceStart(getClass().getName(),26502);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21zpvs1kg6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2kefkeflvlulray.R.rethrow($CLV_t2$);}finally{__CLR4_5_2kefkeflvlulray.R.globalSliceEnd(getClass().getName(),"com.googlecode.mp4parser.boxes.piff.PiffSampleEncryptionBoxTest.testRoundTripFlagsThree",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26502,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21zpvs1kg6() throws IOException{try{__CLR4_5_2kefkeflvlulray.R.inc(26502);
        __CLR4_5_2kefkeflvlulray.R.inc(26503);senc.setSubSampleEncryption(true);
        __CLR4_5_2kefkeflvlulray.R.inc(26504);senc.setOverrideTrackEncryptionBoxParameters(true);
        __CLR4_5_2kefkeflvlulray.R.inc(26505);senc.setAlgorithmId(0x333333);
        __CLR4_5_2kefkeflvlulray.R.inc(26506);senc.setIvSize(8);
        __CLR4_5_2kefkeflvlulray.R.inc(26507);senc.setKid(UUIDConverter.convert(UUID.randomUUID()));
        __CLR4_5_2kefkeflvlulray.R.inc(26508);List<CencSampleAuxiliaryDataFormat> entries = new LinkedList<CencSampleAuxiliaryDataFormat>();
        __CLR4_5_2kefkeflvlulray.R.inc(26509);CencSampleAuxiliaryDataFormat entry = new CencSampleAuxiliaryDataFormat();
        __CLR4_5_2kefkeflvlulray.R.inc(26510);entry.iv = new byte[]{1, 2, 3, 4, 5, 6, 7, 8};
        __CLR4_5_2kefkeflvlulray.R.inc(26511);entry.pairs = new CencSampleAuxiliaryDataFormat.Pair[5];
        __CLR4_5_2kefkeflvlulray.R.inc(26512);entry.pairs[0] = entry.createPair(5, 15);
        __CLR4_5_2kefkeflvlulray.R.inc(26513);entry.pairs[1] = entry.createPair(5, 16);
        __CLR4_5_2kefkeflvlulray.R.inc(26514);entry.pairs[2] = entry.createPair(5, 17);
        __CLR4_5_2kefkeflvlulray.R.inc(26515);entry.pairs[3] = entry.createPair(5, 18);
        __CLR4_5_2kefkeflvlulray.R.inc(26516);entry.pairs[4] = entry.createPair(5, 19);
        __CLR4_5_2kefkeflvlulray.R.inc(26517);entries.add(entry);
        __CLR4_5_2kefkeflvlulray.R.inc(26518);entries.add(entry);
        __CLR4_5_2kefkeflvlulray.R.inc(26519);entries.add(entry);
        __CLR4_5_2kefkeflvlulray.R.inc(26520);entries.add(entry);

        __CLR4_5_2kefkeflvlulray.R.inc(26521);senc.setEntries(entries);

        __CLR4_5_2kefkeflvlulray.R.inc(26522);File f = File.createTempFile(this.getClass().getSimpleName(), "");
        __CLR4_5_2kefkeflvlulray.R.inc(26523);f.deleteOnExit();
        __CLR4_5_2kefkeflvlulray.R.inc(26524);FileChannel fc = new FileOutputStream(f).getChannel();
        __CLR4_5_2kefkeflvlulray.R.inc(26525);senc.getBox(fc);
        __CLR4_5_2kefkeflvlulray.R.inc(26526);fc.close();

        __CLR4_5_2kefkeflvlulray.R.inc(26527);IsoFile iso = new IsoFile(f.getAbsolutePath());

        __CLR4_5_2kefkeflvlulray.R.inc(26528);Assert.assertTrue(iso.getBoxes().get(0) instanceof AbstractSampleEncryptionBox);
        __CLR4_5_2kefkeflvlulray.R.inc(26529);AbstractSampleEncryptionBox senc2 = (AbstractSampleEncryptionBox) iso.getBoxes().get(0);
        __CLR4_5_2kefkeflvlulray.R.inc(26530);Assert.assertEquals(3, senc2.getFlags());
        __CLR4_5_2kefkeflvlulray.R.inc(26531);Assert.assertTrue(senc.equals(senc2));
        __CLR4_5_2kefkeflvlulray.R.inc(26532);Assert.assertTrue(senc2.equals(senc));
    }finally{__CLR4_5_2kefkeflvlulray.R.flushNeeded();}}
}
