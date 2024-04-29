/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.googlecode.mp4parser.boxes.apple;

import com.coremedia.iso.IsoFile;
import com.googlecode.mp4parser.boxes.BoxWriteReadBase;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Hex;
import org.junit.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;


public class TimeCodeBoxTest extends BoxWriteReadBase<TimeCodeBox> {static class __CLR4_5_2japjaplvl9emvy{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413286414L,8589935092L,25029,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    String tcmd = "00000026746D6364000000000000" +
            "0001000000000000000000005DC00000" +
            "03E918B200000000";

    @Test
    public void checkRealLifeBox() throws IOException, DecoderException {__CLR4_5_2japjaplvl9emvy.R.globalSliceStart(getClass().getName(),25009);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mjhltcjap();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2japjaplvl9emvy.R.rethrow($CLV_t2$);}finally{__CLR4_5_2japjaplvl9emvy.R.globalSliceEnd(getClass().getName(),"com.googlecode.mp4parser.boxes.apple.TimeCodeBoxTest.checkRealLifeBox",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25009,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mjhltcjap() throws IOException, DecoderException{try{__CLR4_5_2japjaplvl9emvy.R.inc(25009);
        __CLR4_5_2japjaplvl9emvy.R.inc(25010);File f = File.createTempFile("TimeCodeBoxTest", "checkRealLifeBox");
        __CLR4_5_2japjaplvl9emvy.R.inc(25011);FileOutputStream fos = new FileOutputStream(f);
        __CLR4_5_2japjaplvl9emvy.R.inc(25012);fos.write(Hex.decodeHex(tcmd.toCharArray()));
        __CLR4_5_2japjaplvl9emvy.R.inc(25013);fos.close();

        __CLR4_5_2japjaplvl9emvy.R.inc(25014);IsoFile isoFile = new IsoFile(f.getAbsolutePath());
        __CLR4_5_2japjaplvl9emvy.R.inc(25015);TimeCodeBox tcmd = (TimeCodeBox) isoFile.getBoxes().get(0);
        __CLR4_5_2japjaplvl9emvy.R.inc(25016);System.err.println(tcmd);
        __CLR4_5_2japjaplvl9emvy.R.inc(25017);isoFile.close();
        __CLR4_5_2japjaplvl9emvy.R.inc(25018);f.delete();
    }finally{__CLR4_5_2japjaplvl9emvy.R.flushNeeded();}}


    @Override
    public Class<TimeCodeBox> getBoxUnderTest() {try{__CLR4_5_2japjaplvl9emvy.R.inc(25019);
        __CLR4_5_2japjaplvl9emvy.R.inc(25020);return TimeCodeBox.class;
    }finally{__CLR4_5_2japjaplvl9emvy.R.flushNeeded();}}

    @Override
    public void setupProperties(Map<String, Object> addPropsHere, TimeCodeBox box) {try{__CLR4_5_2japjaplvl9emvy.R.inc(25021);
        __CLR4_5_2japjaplvl9emvy.R.inc(25022);addPropsHere.put("dataReferenceIndex", 666);
        __CLR4_5_2japjaplvl9emvy.R.inc(25023);addPropsHere.put("frameDuration", (int) 1001);
        __CLR4_5_2japjaplvl9emvy.R.inc(25024);addPropsHere.put("numberOfFrames", (int) 24);
        __CLR4_5_2japjaplvl9emvy.R.inc(25025);addPropsHere.put("reserved1", (int) 0);
        __CLR4_5_2japjaplvl9emvy.R.inc(25026);addPropsHere.put("reserved2", (int) 0);
        __CLR4_5_2japjaplvl9emvy.R.inc(25027);addPropsHere.put("timeScale", (int) 24000);
        __CLR4_5_2japjaplvl9emvy.R.inc(25028);addPropsHere.put("rest", new byte[]{4, 5});
    }finally{__CLR4_5_2japjaplvl9emvy.R.flushNeeded();}}

}
