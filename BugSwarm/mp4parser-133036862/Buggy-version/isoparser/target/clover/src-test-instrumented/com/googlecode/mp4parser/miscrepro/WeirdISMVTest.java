/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.googlecode.mp4parser.miscrepro;

import com.coremedia.iso.Hex;
import com.coremedia.iso.IsoFile;
import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.Container;
import com.coremedia.iso.boxes.sampleentry.AudioSampleEntry;
import com.googlecode.mp4parser.MemoryDataSourceImpl;
import com.googlecode.mp4parser.util.Path;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.channels.Channels;
import java.util.List;

/**
 * Created by sannies on 1/4/14.
 */
public class WeirdISMVTest {static class __CLR4_5_2kitkitlvlulrc3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448889527L,8589935092L,26607,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @Test
    public void checkMikesStream() throws IOException {__CLR4_5_2kitkitlvlulrc3.R.globalSliceStart(getClass().getName(),26597);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pttvmskit();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2kitkitlvlulrc3.R.rethrow($CLV_t2$);}finally{__CLR4_5_2kitkitlvlulrc3.R.globalSliceEnd(getClass().getName(),"com.googlecode.mp4parser.miscrepro.WeirdISMVTest.checkMikesStream",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26597,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pttvmskit() throws IOException{try{__CLR4_5_2kitkitlvlulrc3.R.inc(26597);
        __CLR4_5_2kitkitlvlulrc3.R.inc(26598);String hex = "000002346d6f6f760000006c6d76686400000000ceec8b72ceec8b7200989680000000000001000001000000000000000000000000010000000000000000000000000000000100000000000000000000000000004000000000000000000000000000000000000000000000000000000000000002000001987472616b0000005c746b686400000007ceec8b72ceec8b72000000010000000000000000000000000000000000000000010000000001000000000000000000000000000000010000000000000000000000000000400000000000000000000000000001346d646961000000206d64686400000000ceec8b72ceec8b720098968000000000000000000000003468646c720000000000000000736f756e000000000000000000000000536f756e64204d656469612048616e646c657200000000d86d696e6600000010736d686400000000000000000000002464696e660000001c6472656600000000000000010000000c75726c20000000010000009c7374626c00000050737473640000000000000001000000406f776d61000000000000000100000000000000000002000000000000bb8000006101020080bb0000c31e0000f00310000a00008800001f00000000000000001073747473000000000000000000000010737473630000000000000000000000147374737a000000000000000000000000000000107374636f0000000000000000000000286d7665780000002074726578000000000000000100000001000000000000000000000000";
        __CLR4_5_2kitkitlvlulrc3.R.inc(26599);byte[] data = Hex.decodeHex(hex);
        __CLR4_5_2kitkitlvlulrc3.R.inc(26600);MemoryDataSourceImpl dataSource = new MemoryDataSourceImpl(data);
        __CLR4_5_2kitkitlvlulrc3.R.inc(26601);IsoFile isoFile = new IsoFile(dataSource);
        __CLR4_5_2kitkitlvlulrc3.R.inc(26602);AudioSampleEntry owma = (AudioSampleEntry) Path.getPath(isoFile, "/moov[0]/trak[0]/mdia[0]/minf[0]/stbl[0]/stsd[0]/owma");
        __CLR4_5_2kitkitlvlulrc3.R.inc(26603);System.err.println(owma);
        __CLR4_5_2kitkitlvlulrc3.R.inc(26604);ByteArrayOutputStream baos = new ByteArrayOutputStream();

        __CLR4_5_2kitkitlvlulrc3.R.inc(26605);isoFile.getBox(Channels.newChannel(baos));
        __CLR4_5_2kitkitlvlulrc3.R.inc(26606);Assert.assertArrayEquals(data, baos.toByteArray());
       // List<Box> b = ((Container)isoFile.getMovieBox().getBoxes().get(1)).getBoxes().get(1).getBoxes().get(2).getBoxes().get(2).getBoxes().get(0).getBoxes();

    }finally{__CLR4_5_2kitkitlvlulrc3.R.flushNeeded();}}
}
