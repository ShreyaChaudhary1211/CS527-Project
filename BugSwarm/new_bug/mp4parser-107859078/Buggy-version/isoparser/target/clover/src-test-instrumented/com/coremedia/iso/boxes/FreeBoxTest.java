/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.coremedia.iso.boxes;

import com.coremedia.iso.IsoFile;
import junit.framework.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;

import com.googlecode.mp4parser.DataSource;

public class FreeBoxTest {static class __CLR4_5_2hu4hu4lvl9em6r{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413286414L,8589935092L,23146,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @Test
    public void testInOutNoChange() throws IOException {__CLR4_5_2hu4hu4lvl9em6r.R.globalSliceStart(getClass().getName(),23116);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uo4dkfhu4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2hu4hu4lvl9em6r.R.rethrow($CLV_t2$);}finally{__CLR4_5_2hu4hu4lvl9em6r.R.globalSliceEnd(getClass().getName(),"com.coremedia.iso.boxes.FreeBoxTest.testInOutNoChange",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23116,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uo4dkfhu4() throws IOException{try{__CLR4_5_2hu4hu4lvl9em6r.R.inc(23116);
        __CLR4_5_2hu4hu4lvl9em6r.R.inc(23117);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_5_2hu4hu4lvl9em6r.R.inc(23118);FreeBox fb = new FreeBox(1000);
        __CLR4_5_2hu4hu4lvl9em6r.R.inc(23119);ByteBuffer data = fb.getData();
        __CLR4_5_2hu4hu4lvl9em6r.R.inc(23120);data.rewind();
        __CLR4_5_2hu4hu4lvl9em6r.R.inc(23121);data.put(new byte[]{1, 2, 3, 4, 5, 6});
        __CLR4_5_2hu4hu4lvl9em6r.R.inc(23122);fb.getBox(Channels.newChannel(baos));
        __CLR4_5_2hu4hu4lvl9em6r.R.inc(23123);Assert.assertEquals(baos.toByteArray()[8], 1);
        __CLR4_5_2hu4hu4lvl9em6r.R.inc(23124);Assert.assertEquals(baos.toByteArray()[9], 2);
        __CLR4_5_2hu4hu4lvl9em6r.R.inc(23125);Assert.assertEquals(baos.toByteArray()[10], 3);
        __CLR4_5_2hu4hu4lvl9em6r.R.inc(23126);Assert.assertEquals(baos.toByteArray()[11], 4);
    }finally{__CLR4_5_2hu4hu4lvl9em6r.R.flushNeeded();}}

    @Test
    public void tesAddAndReplace() throws IOException {__CLR4_5_2hu4hu4lvl9em6r.R.globalSliceStart(getClass().getName(),23127);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gbh9lphuf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2hu4hu4lvl9em6r.R.rethrow($CLV_t2$);}finally{__CLR4_5_2hu4hu4lvl9em6r.R.globalSliceEnd(getClass().getName(),"com.coremedia.iso.boxes.FreeBoxTest.tesAddAndReplace",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23127,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gbh9lphuf() throws IOException{try{__CLR4_5_2hu4hu4lvl9em6r.R.inc(23127);

        __CLR4_5_2hu4hu4lvl9em6r.R.inc(23128);FreeBox fb = new FreeBox(1000);
        __CLR4_5_2hu4hu4lvl9em6r.R.inc(23129);long startSize = fb.getSize();
        __CLR4_5_2hu4hu4lvl9em6r.R.inc(23130);ByteBuffer data = fb.getData();
        __CLR4_5_2hu4hu4lvl9em6r.R.inc(23131);data.position(994);
        __CLR4_5_2hu4hu4lvl9em6r.R.inc(23132);data.put(new byte[]{1, 2, 3, 4, 5, 6});
        __CLR4_5_2hu4hu4lvl9em6r.R.inc(23133);FreeSpaceBox fsb = new FreeSpaceBox();
        __CLR4_5_2hu4hu4lvl9em6r.R.inc(23134);fsb.setData(new byte[100]);
        __CLR4_5_2hu4hu4lvl9em6r.R.inc(23135);fb.addAndReplace(fsb);
        __CLR4_5_2hu4hu4lvl9em6r.R.inc(23136);File f = File.createTempFile(this.getClass().getSimpleName(), "");
        __CLR4_5_2hu4hu4lvl9em6r.R.inc(23137);f.deleteOnExit();
        __CLR4_5_2hu4hu4lvl9em6r.R.inc(23138);FileChannel fc = new FileOutputStream(f).getChannel();
        __CLR4_5_2hu4hu4lvl9em6r.R.inc(23139);fb.getBox(fc);
        __CLR4_5_2hu4hu4lvl9em6r.R.inc(23140);fc.close();

        __CLR4_5_2hu4hu4lvl9em6r.R.inc(23141);IsoFile isoFile = new IsoFile(f.getAbsolutePath());
        __CLR4_5_2hu4hu4lvl9em6r.R.inc(23142);Assert.assertEquals(2, isoFile.getBoxes().size());
        __CLR4_5_2hu4hu4lvl9em6r.R.inc(23143);Assert.assertEquals(FreeSpaceBox.TYPE, isoFile.getBoxes().get(0).getType());
        __CLR4_5_2hu4hu4lvl9em6r.R.inc(23144);Assert.assertEquals(FreeBox.TYPE, isoFile.getBoxes().get(1).getType());
        __CLR4_5_2hu4hu4lvl9em6r.R.inc(23145);Assert.assertEquals(startSize, isoFile.getBoxes().get(0).getSize() + isoFile.getBoxes().get(1).getSize());
    }finally{__CLR4_5_2hu4hu4lvl9em6r.R.flushNeeded();}}
}
