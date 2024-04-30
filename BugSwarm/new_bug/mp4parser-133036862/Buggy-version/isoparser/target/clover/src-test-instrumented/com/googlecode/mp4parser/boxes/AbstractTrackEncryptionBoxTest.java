/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.googlecode.mp4parser.boxes;


import com.coremedia.iso.IsoFile;
import com.googlecode.mp4parser.DataSource;
import com.googlecode.mp4parser.util.UUIDConverter;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

public abstract class AbstractTrackEncryptionBoxTest {static class __CLR4_5_2jx0jx0lvlulqz4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448889527L,8589935092L,25828,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    protected AbstractTrackEncryptionBox tenc;

    @Test
    public void testRoundTrip() throws IOException {__CLR4_5_2jx0jx0lvlulqz4.R.globalSliceStart(getClass().getName(),25812);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yhw67sjx0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jx0jx0lvlulqz4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jx0jx0lvlulqz4.R.globalSliceEnd(getClass().getName(),"com.googlecode.mp4parser.boxes.AbstractTrackEncryptionBoxTest.testRoundTrip",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25812,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yhw67sjx0() throws IOException{try{__CLR4_5_2jx0jx0lvlulqz4.R.inc(25812);
        __CLR4_5_2jx0jx0lvlulqz4.R.inc(25813);tenc.setDefault_KID(UUIDConverter.convert(new byte[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2, 3, 4, 5, 6}));
        __CLR4_5_2jx0jx0lvlulqz4.R.inc(25814);tenc.setDefaultAlgorithmId(0x0a0b0c);
        __CLR4_5_2jx0jx0lvlulqz4.R.inc(25815);tenc.setDefaultIvSize(8);


        __CLR4_5_2jx0jx0lvlulqz4.R.inc(25816);File f = File.createTempFile(this.getClass().getSimpleName(), "");
        __CLR4_5_2jx0jx0lvlulqz4.R.inc(25817);f.deleteOnExit();
        __CLR4_5_2jx0jx0lvlulqz4.R.inc(25818);FileChannel fc = new FileOutputStream(f).getChannel();
        __CLR4_5_2jx0jx0lvlulqz4.R.inc(25819);tenc.getBox(fc);
        __CLR4_5_2jx0jx0lvlulqz4.R.inc(25820);fc.close();

        __CLR4_5_2jx0jx0lvlulqz4.R.inc(25821);IsoFile iso = new IsoFile(f.getAbsolutePath());
        __CLR4_5_2jx0jx0lvlulqz4.R.inc(25822);Assert.assertTrue(iso.getBoxes().get(0) instanceof AbstractTrackEncryptionBox);
        __CLR4_5_2jx0jx0lvlulqz4.R.inc(25823);AbstractTrackEncryptionBox tenc2 = (AbstractTrackEncryptionBox) iso.getBoxes().get(0);
        __CLR4_5_2jx0jx0lvlulqz4.R.inc(25824);Assert.assertEquals(0, tenc2.getFlags());
        __CLR4_5_2jx0jx0lvlulqz4.R.inc(25825);Assert.assertTrue(tenc.equals(tenc2));
        __CLR4_5_2jx0jx0lvlulqz4.R.inc(25826);Assert.assertTrue(tenc2.equals(tenc));
        __CLR4_5_2jx0jx0lvlulqz4.R.inc(25827);iso.close();

    }finally{__CLR4_5_2jx0jx0lvlulqz4.R.flushNeeded();}}
}
