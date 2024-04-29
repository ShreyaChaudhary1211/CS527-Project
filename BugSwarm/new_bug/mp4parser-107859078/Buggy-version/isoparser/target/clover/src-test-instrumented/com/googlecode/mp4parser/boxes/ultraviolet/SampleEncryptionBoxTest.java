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


public class SampleEncryptionBoxTest  {static class __CLR4_5_2jntjntlvl9emzk{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413286414L,8589935092L,25522,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;


    SampleEncryptionBox senc = new SampleEncryptionBox();


    @Test
    public void testRoundTripFlagsZero() throws IOException {__CLR4_5_2jntjntlvl9emzk.R.globalSliceStart(getClass().getName(),25481);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fef1f9jnt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jntjntlvl9emzk.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jntjntlvl9emzk.R.globalSliceEnd(getClass().getName(),"com.googlecode.mp4parser.boxes.ultraviolet.SampleEncryptionBoxTest.testRoundTripFlagsZero",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25481,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fef1f9jnt() throws IOException{try{__CLR4_5_2jntjntlvl9emzk.R.inc(25481);
        __CLR4_5_2jntjntlvl9emzk.R.inc(25482);List<CencSampleAuxiliaryDataFormat> entries = new LinkedList<CencSampleAuxiliaryDataFormat>();

        __CLR4_5_2jntjntlvl9emzk.R.inc(25483);CencSampleAuxiliaryDataFormat entry = new CencSampleAuxiliaryDataFormat();
        __CLR4_5_2jntjntlvl9emzk.R.inc(25484);entry.iv = new byte[]{1, 2, 3, 4, 5, 6, 7, 8};
        __CLR4_5_2jntjntlvl9emzk.R.inc(25485);entries.add(entry);

        __CLR4_5_2jntjntlvl9emzk.R.inc(25486);senc.setEntries(entries);

        __CLR4_5_2jntjntlvl9emzk.R.inc(25487);File f = File.createTempFile(this.getClass().getSimpleName(), "");
        __CLR4_5_2jntjntlvl9emzk.R.inc(25488);f.deleteOnExit();
        __CLR4_5_2jntjntlvl9emzk.R.inc(25489);FileChannel fc = new FileOutputStream(f).getChannel();
        __CLR4_5_2jntjntlvl9emzk.R.inc(25490);senc.getBox(fc);
        __CLR4_5_2jntjntlvl9emzk.R.inc(25491);fc.close();
        __CLR4_5_2jntjntlvl9emzk.R.inc(25492);Assert.assertEquals(f.length(), senc.getSize());


        __CLR4_5_2jntjntlvl9emzk.R.inc(25493);IsoFile iso = new IsoFile(f.getAbsolutePath());


        __CLR4_5_2jntjntlvl9emzk.R.inc(25494);Assert.assertTrue(iso.getBoxes().get(0) instanceof AbstractSampleEncryptionBox);
        __CLR4_5_2jntjntlvl9emzk.R.inc(25495);AbstractSampleEncryptionBox senc2 = (AbstractSampleEncryptionBox) iso.getBoxes().get(0);
        __CLR4_5_2jntjntlvl9emzk.R.inc(25496);Assert.assertEquals(0, senc2.getFlags());
        __CLR4_5_2jntjntlvl9emzk.R.inc(25497);Assert.assertTrue(senc.equals(senc2));
        __CLR4_5_2jntjntlvl9emzk.R.inc(25498);Assert.assertTrue(senc2.equals(senc));

    }finally{__CLR4_5_2jntjntlvl9emzk.R.flushNeeded();}}


    @Test
    public void testRoundTripFlagsTwo() throws IOException {__CLR4_5_2jntjntlvl9emzk.R.globalSliceStart(getClass().getName(),25499);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2obssp9job();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jntjntlvl9emzk.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jntjntlvl9emzk.R.globalSliceEnd(getClass().getName(),"com.googlecode.mp4parser.boxes.ultraviolet.SampleEncryptionBoxTest.testRoundTripFlagsTwo",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25499,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2obssp9job() throws IOException{try{__CLR4_5_2jntjntlvl9emzk.R.inc(25499);
        __CLR4_5_2jntjntlvl9emzk.R.inc(25500);senc.setSubSampleEncryption(true);
        __CLR4_5_2jntjntlvl9emzk.R.inc(25501);List<CencSampleAuxiliaryDataFormat> entries = new LinkedList<CencSampleAuxiliaryDataFormat>();
        __CLR4_5_2jntjntlvl9emzk.R.inc(25502);CencSampleAuxiliaryDataFormat entry = new CencSampleAuxiliaryDataFormat();
        __CLR4_5_2jntjntlvl9emzk.R.inc(25503);entry.iv = new byte[]{1, 2, 3, 4, 5, 6, 7, 8};
        __CLR4_5_2jntjntlvl9emzk.R.inc(25504);entry.pairs = new CencSampleAuxiliaryDataFormat.Pair[5];
        __CLR4_5_2jntjntlvl9emzk.R.inc(25505);entry.pairs[0]=entry.createPair(5, 15);
        __CLR4_5_2jntjntlvl9emzk.R.inc(25506);entry.pairs[1]=entry.createPair(5, 16);
        __CLR4_5_2jntjntlvl9emzk.R.inc(25507);entry.pairs[2]=entry.createPair(5, 17);
        __CLR4_5_2jntjntlvl9emzk.R.inc(25508);entry.pairs[3]=entry.createPair(5, 18);
        __CLR4_5_2jntjntlvl9emzk.R.inc(25509);entry.pairs[4]=entry.createPair(5, 19);
        __CLR4_5_2jntjntlvl9emzk.R.inc(25510);entries.add(entry);


        __CLR4_5_2jntjntlvl9emzk.R.inc(25511);senc.setEntries(entries);

        __CLR4_5_2jntjntlvl9emzk.R.inc(25512);File f = File.createTempFile(this.getClass().getSimpleName(), "");
        __CLR4_5_2jntjntlvl9emzk.R.inc(25513);FileChannel fc = new FileOutputStream(f).getChannel();
        __CLR4_5_2jntjntlvl9emzk.R.inc(25514);senc.getBox(fc);
        __CLR4_5_2jntjntlvl9emzk.R.inc(25515);fc.close();

        __CLR4_5_2jntjntlvl9emzk.R.inc(25516);IsoFile iso = new IsoFile(f.getAbsolutePath());

        __CLR4_5_2jntjntlvl9emzk.R.inc(25517);Assert.assertTrue(iso.getBoxes().get(0) instanceof AbstractSampleEncryptionBox);
        __CLR4_5_2jntjntlvl9emzk.R.inc(25518);AbstractSampleEncryptionBox senc2 = (AbstractSampleEncryptionBox) iso.getBoxes().get(0);
        __CLR4_5_2jntjntlvl9emzk.R.inc(25519);Assert.assertEquals(2, senc2.getFlags());
        __CLR4_5_2jntjntlvl9emzk.R.inc(25520);Assert.assertTrue(senc.equals(senc2));
        __CLR4_5_2jntjntlvl9emzk.R.inc(25521);Assert.assertTrue(senc2.equals(senc));

    }finally{__CLR4_5_2jntjntlvl9emzk.R.flushNeeded();}}


}
