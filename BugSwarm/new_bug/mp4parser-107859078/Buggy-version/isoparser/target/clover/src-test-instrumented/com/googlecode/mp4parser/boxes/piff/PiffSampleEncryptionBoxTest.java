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


public class PiffSampleEncryptionBoxTest {static class __CLR4_5_2jknjknlvl9emz6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413286414L,8589935092L,25461,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    PiffSampleEncryptionBox senc = new PiffSampleEncryptionBox();



    @Test
    public void testRoundTripFlagsZero() throws IOException {__CLR4_5_2jknjknlvl9emz6.R.globalSliceStart(getClass().getName(),25367);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fef1f9jkn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jknjknlvl9emz6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jknjknlvl9emz6.R.globalSliceEnd(getClass().getName(),"com.googlecode.mp4parser.boxes.piff.PiffSampleEncryptionBoxTest.testRoundTripFlagsZero",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25367,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fef1f9jkn() throws IOException{try{__CLR4_5_2jknjknlvl9emz6.R.inc(25367);
        __CLR4_5_2jknjknlvl9emz6.R.inc(25368);List<CencSampleAuxiliaryDataFormat> entries = new LinkedList<CencSampleAuxiliaryDataFormat>();

        __CLR4_5_2jknjknlvl9emz6.R.inc(25369);CencSampleAuxiliaryDataFormat entry = new CencSampleAuxiliaryDataFormat();
        __CLR4_5_2jknjknlvl9emz6.R.inc(25370);entry.iv = new byte[]{1, 2, 3, 4, 5, 6, 7, 8};
        __CLR4_5_2jknjknlvl9emz6.R.inc(25371);entries.add(entry);

        __CLR4_5_2jknjknlvl9emz6.R.inc(25372);senc.setEntries(entries);

        __CLR4_5_2jknjknlvl9emz6.R.inc(25373);File f = File.createTempFile(this.getClass().getSimpleName(), "");
        __CLR4_5_2jknjknlvl9emz6.R.inc(25374);f.deleteOnExit();
        __CLR4_5_2jknjknlvl9emz6.R.inc(25375);FileChannel fc = new FileOutputStream(f).getChannel();
        __CLR4_5_2jknjknlvl9emz6.R.inc(25376);senc.getBox(fc);
        __CLR4_5_2jknjknlvl9emz6.R.inc(25377);fc.close();
        __CLR4_5_2jknjknlvl9emz6.R.inc(25378);Assert.assertEquals(f.length(), senc.getSize());


        __CLR4_5_2jknjknlvl9emz6.R.inc(25379);IsoFile iso = new IsoFile(f.getAbsolutePath());


        __CLR4_5_2jknjknlvl9emz6.R.inc(25380);Assert.assertTrue(iso.getBoxes().get(0) instanceof AbstractSampleEncryptionBox);
        __CLR4_5_2jknjknlvl9emz6.R.inc(25381);AbstractSampleEncryptionBox senc2 = (AbstractSampleEncryptionBox) iso.getBoxes().get(0);
        __CLR4_5_2jknjknlvl9emz6.R.inc(25382);Assert.assertEquals(0, senc2.getFlags());
        __CLR4_5_2jknjknlvl9emz6.R.inc(25383);Assert.assertTrue(senc.equals(senc2));
        __CLR4_5_2jknjknlvl9emz6.R.inc(25384);Assert.assertTrue(senc2.equals(senc));

    }finally{__CLR4_5_2jknjknlvl9emz6.R.flushNeeded();}}

    @Test
    public void testRoundTripFlagsOne() throws IOException {__CLR4_5_2jknjknlvl9emz6.R.globalSliceStart(getClass().getName(),25385);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2j5so4njl5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jknjknlvl9emz6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jknjknlvl9emz6.R.globalSliceEnd(getClass().getName(),"com.googlecode.mp4parser.boxes.piff.PiffSampleEncryptionBoxTest.testRoundTripFlagsOne",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25385,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2j5so4njl5() throws IOException{try{__CLR4_5_2jknjknlvl9emz6.R.inc(25385);
        __CLR4_5_2jknjknlvl9emz6.R.inc(25386);senc.setOverrideTrackEncryptionBoxParameters(true);
        __CLR4_5_2jknjknlvl9emz6.R.inc(25387);senc.setAlgorithmId(0x333333);
        __CLR4_5_2jknjknlvl9emz6.R.inc(25388);senc.setIvSize(8);
        __CLR4_5_2jknjknlvl9emz6.R.inc(25389);senc.setKid(UUIDConverter.convert(UUID.randomUUID()));

        __CLR4_5_2jknjknlvl9emz6.R.inc(25390);List<CencSampleAuxiliaryDataFormat> entries = new LinkedList<CencSampleAuxiliaryDataFormat>();
        __CLR4_5_2jknjknlvl9emz6.R.inc(25391);CencSampleAuxiliaryDataFormat entry = new CencSampleAuxiliaryDataFormat();
        __CLR4_5_2jknjknlvl9emz6.R.inc(25392);entry.iv = new byte[]{1, 2, 3, 4, 5, 6, 7, 8};
        __CLR4_5_2jknjknlvl9emz6.R.inc(25393);entries.add(entry);

        __CLR4_5_2jknjknlvl9emz6.R.inc(25394);senc.setEntries(entries);
        __CLR4_5_2jknjknlvl9emz6.R.inc(25395);File f = File.createTempFile(this.getClass().getSimpleName(), "");
        __CLR4_5_2jknjknlvl9emz6.R.inc(25396);f.deleteOnExit();
        __CLR4_5_2jknjknlvl9emz6.R.inc(25397);FileChannel fc = new FileOutputStream(f).getChannel();
        __CLR4_5_2jknjknlvl9emz6.R.inc(25398);senc.getBox(fc);
        __CLR4_5_2jknjknlvl9emz6.R.inc(25399);fc.close();

        __CLR4_5_2jknjknlvl9emz6.R.inc(25400);IsoFile iso = new IsoFile(f.getAbsolutePath());

        __CLR4_5_2jknjknlvl9emz6.R.inc(25401);Assert.assertTrue(iso.getBoxes().get(0) instanceof AbstractSampleEncryptionBox);
        __CLR4_5_2jknjknlvl9emz6.R.inc(25402);AbstractSampleEncryptionBox senc2 = (AbstractSampleEncryptionBox) iso.getBoxes().get(0);
        __CLR4_5_2jknjknlvl9emz6.R.inc(25403);Assert.assertEquals(1, senc2.getFlags());
        __CLR4_5_2jknjknlvl9emz6.R.inc(25404);Assert.assertTrue(senc.equals(senc2));
        __CLR4_5_2jknjknlvl9emz6.R.inc(25405);Assert.assertTrue(senc2.equals(senc));
    }finally{__CLR4_5_2jknjknlvl9emz6.R.flushNeeded();}}

    @Test
    public void testRoundTripFlagsTwo() throws IOException {__CLR4_5_2jknjknlvl9emz6.R.globalSliceStart(getClass().getName(),25406);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2obssp9jlq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jknjknlvl9emz6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jknjknlvl9emz6.R.globalSliceEnd(getClass().getName(),"com.googlecode.mp4parser.boxes.piff.PiffSampleEncryptionBoxTest.testRoundTripFlagsTwo",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25406,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2obssp9jlq() throws IOException{try{__CLR4_5_2jknjknlvl9emz6.R.inc(25406);
        __CLR4_5_2jknjknlvl9emz6.R.inc(25407);senc.setSubSampleEncryption(true);
        __CLR4_5_2jknjknlvl9emz6.R.inc(25408);List<CencSampleAuxiliaryDataFormat> entries = new LinkedList<CencSampleAuxiliaryDataFormat>();
        __CLR4_5_2jknjknlvl9emz6.R.inc(25409);CencSampleAuxiliaryDataFormat entry = new CencSampleAuxiliaryDataFormat();
        __CLR4_5_2jknjknlvl9emz6.R.inc(25410);entry.iv = new byte[]{1, 2, 3, 4, 5, 6, 7, 8};
        __CLR4_5_2jknjknlvl9emz6.R.inc(25411);entry.pairs = new CencSampleAuxiliaryDataFormat.Pair[5];
        __CLR4_5_2jknjknlvl9emz6.R.inc(25412);entry.pairs[0] = entry.createPair(5, 15);
        __CLR4_5_2jknjknlvl9emz6.R.inc(25413);entry.pairs[1] = entry.createPair(5, 16);
        __CLR4_5_2jknjknlvl9emz6.R.inc(25414);entry.pairs[2] = entry.createPair(5, 17);
        __CLR4_5_2jknjknlvl9emz6.R.inc(25415);entry.pairs[3] = entry.createPair(5, 18);
        __CLR4_5_2jknjknlvl9emz6.R.inc(25416);entry.pairs[4] = entry.createPair(5, 19);
        __CLR4_5_2jknjknlvl9emz6.R.inc(25417);entries.add(entry);


        __CLR4_5_2jknjknlvl9emz6.R.inc(25418);senc.setEntries(entries);

        __CLR4_5_2jknjknlvl9emz6.R.inc(25419);File f = File.createTempFile(this.getClass().getSimpleName(), "");
        __CLR4_5_2jknjknlvl9emz6.R.inc(25420);f.deleteOnExit();
        __CLR4_5_2jknjknlvl9emz6.R.inc(25421);FileChannel fc = new FileOutputStream(f).getChannel();
        __CLR4_5_2jknjknlvl9emz6.R.inc(25422);senc.getBox(fc);
        __CLR4_5_2jknjknlvl9emz6.R.inc(25423);fc.close();

        __CLR4_5_2jknjknlvl9emz6.R.inc(25424);IsoFile iso = new IsoFile(f.getAbsolutePath());

        __CLR4_5_2jknjknlvl9emz6.R.inc(25425);Assert.assertTrue(iso.getBoxes().get(0) instanceof AbstractSampleEncryptionBox);
        __CLR4_5_2jknjknlvl9emz6.R.inc(25426);AbstractSampleEncryptionBox senc2 = (AbstractSampleEncryptionBox) iso.getBoxes().get(0);
        __CLR4_5_2jknjknlvl9emz6.R.inc(25427);Assert.assertEquals(2, senc2.getFlags());
        __CLR4_5_2jknjknlvl9emz6.R.inc(25428);Assert.assertTrue(senc.equals(senc2));
        __CLR4_5_2jknjknlvl9emz6.R.inc(25429);Assert.assertTrue(senc2.equals(senc));

    }finally{__CLR4_5_2jknjknlvl9emz6.R.flushNeeded();}}

    @Test
    public void testRoundTripFlagsThree() throws IOException {__CLR4_5_2jknjknlvl9emz6.R.globalSliceStart(getClass().getName(),25430);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21zpvs1jme();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jknjknlvl9emz6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jknjknlvl9emz6.R.globalSliceEnd(getClass().getName(),"com.googlecode.mp4parser.boxes.piff.PiffSampleEncryptionBoxTest.testRoundTripFlagsThree",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25430,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21zpvs1jme() throws IOException{try{__CLR4_5_2jknjknlvl9emz6.R.inc(25430);
        __CLR4_5_2jknjknlvl9emz6.R.inc(25431);senc.setSubSampleEncryption(true);
        __CLR4_5_2jknjknlvl9emz6.R.inc(25432);senc.setOverrideTrackEncryptionBoxParameters(true);
        __CLR4_5_2jknjknlvl9emz6.R.inc(25433);senc.setAlgorithmId(0x333333);
        __CLR4_5_2jknjknlvl9emz6.R.inc(25434);senc.setIvSize(8);
        __CLR4_5_2jknjknlvl9emz6.R.inc(25435);senc.setKid(UUIDConverter.convert(UUID.randomUUID()));
        __CLR4_5_2jknjknlvl9emz6.R.inc(25436);List<CencSampleAuxiliaryDataFormat> entries = new LinkedList<CencSampleAuxiliaryDataFormat>();
        __CLR4_5_2jknjknlvl9emz6.R.inc(25437);CencSampleAuxiliaryDataFormat entry = new CencSampleAuxiliaryDataFormat();
        __CLR4_5_2jknjknlvl9emz6.R.inc(25438);entry.iv = new byte[]{1, 2, 3, 4, 5, 6, 7, 8};
        __CLR4_5_2jknjknlvl9emz6.R.inc(25439);entry.pairs = new CencSampleAuxiliaryDataFormat.Pair[5];
        __CLR4_5_2jknjknlvl9emz6.R.inc(25440);entry.pairs[0] = entry.createPair(5, 15);
        __CLR4_5_2jknjknlvl9emz6.R.inc(25441);entry.pairs[1] = entry.createPair(5, 16);
        __CLR4_5_2jknjknlvl9emz6.R.inc(25442);entry.pairs[2] = entry.createPair(5, 17);
        __CLR4_5_2jknjknlvl9emz6.R.inc(25443);entry.pairs[3] = entry.createPair(5, 18);
        __CLR4_5_2jknjknlvl9emz6.R.inc(25444);entry.pairs[4] = entry.createPair(5, 19);
        __CLR4_5_2jknjknlvl9emz6.R.inc(25445);entries.add(entry);
        __CLR4_5_2jknjknlvl9emz6.R.inc(25446);entries.add(entry);
        __CLR4_5_2jknjknlvl9emz6.R.inc(25447);entries.add(entry);
        __CLR4_5_2jknjknlvl9emz6.R.inc(25448);entries.add(entry);

        __CLR4_5_2jknjknlvl9emz6.R.inc(25449);senc.setEntries(entries);

        __CLR4_5_2jknjknlvl9emz6.R.inc(25450);File f = File.createTempFile(this.getClass().getSimpleName(), "");
        __CLR4_5_2jknjknlvl9emz6.R.inc(25451);f.deleteOnExit();
        __CLR4_5_2jknjknlvl9emz6.R.inc(25452);FileChannel fc = new FileOutputStream(f).getChannel();
        __CLR4_5_2jknjknlvl9emz6.R.inc(25453);senc.getBox(fc);
        __CLR4_5_2jknjknlvl9emz6.R.inc(25454);fc.close();

        __CLR4_5_2jknjknlvl9emz6.R.inc(25455);IsoFile iso = new IsoFile(f.getAbsolutePath());

        __CLR4_5_2jknjknlvl9emz6.R.inc(25456);Assert.assertTrue(iso.getBoxes().get(0) instanceof AbstractSampleEncryptionBox);
        __CLR4_5_2jknjknlvl9emz6.R.inc(25457);AbstractSampleEncryptionBox senc2 = (AbstractSampleEncryptionBox) iso.getBoxes().get(0);
        __CLR4_5_2jknjknlvl9emz6.R.inc(25458);Assert.assertEquals(3, senc2.getFlags());
        __CLR4_5_2jknjknlvl9emz6.R.inc(25459);Assert.assertTrue(senc.equals(senc2));
        __CLR4_5_2jknjknlvl9emz6.R.inc(25460);Assert.assertTrue(senc2.equals(senc));
    }finally{__CLR4_5_2jknjknlvl9emz6.R.flushNeeded();}}
}
