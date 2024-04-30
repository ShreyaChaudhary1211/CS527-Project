/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.coremedia.iso.boxes.sampleentry;

import com.coremedia.iso.boxes.FreeBox;
import com.googlecode.mp4parser.boxes.BoxWriteReadBase;
import org.junit.Assert;
import org.junit.Test;

import java.util.Collections;
import java.util.Map;

public class TextSampleEntryTest extends BoxWriteReadBase<TextSampleEntry> {static class __CLR4_5_2jiojiolvlulqjd{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448889527L,8589935092L,25318,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testBitSetters() {__CLR4_5_2jiojiolvlulqjd.R.globalSliceStart(getClass().getName(),25296);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2smac2ojio();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jiojiolvlulqjd.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jiojiolvlulqjd.R.globalSliceEnd(getClass().getName(),"com.coremedia.iso.boxes.sampleentry.TextSampleEntryTest.testBitSetters",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25296,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2smac2ojio(){try{__CLR4_5_2jiojiolvlulqjd.R.inc(25296);
        __CLR4_5_2jiojiolvlulqjd.R.inc(25297);TextSampleEntry tx3g = new TextSampleEntry();
        __CLR4_5_2jiojiolvlulqjd.R.inc(25298);tx3g.setContinuousKaraoke(true);
        __CLR4_5_2jiojiolvlulqjd.R.inc(25299);Assert.assertTrue(tx3g.isContinuousKaraoke());
        __CLR4_5_2jiojiolvlulqjd.R.inc(25300);tx3g.setContinuousKaraoke(false);
        __CLR4_5_2jiojiolvlulqjd.R.inc(25301);Assert.assertFalse(tx3g.isContinuousKaraoke());
    }finally{__CLR4_5_2jiojiolvlulqjd.R.flushNeeded();}}

    @Override
    public Class<TextSampleEntry> getBoxUnderTest() {try{__CLR4_5_2jiojiolvlulqjd.R.inc(25302);
        __CLR4_5_2jiojiolvlulqjd.R.inc(25303);return TextSampleEntry.class;
    }finally{__CLR4_5_2jiojiolvlulqjd.R.flushNeeded();}}

    @Override
    public void setupProperties(Map<String, Object> addPropsHere, TextSampleEntry box) {try{__CLR4_5_2jiojiolvlulqjd.R.inc(25304);
        __CLR4_5_2jiojiolvlulqjd.R.inc(25305);addPropsHere.put("backgroundColorRgba", new int[]{1, 2, 3, 4});
        __CLR4_5_2jiojiolvlulqjd.R.inc(25306);addPropsHere.put("boxRecord", new TextSampleEntry.BoxRecord(31, 41, 51, 61));
        __CLR4_5_2jiojiolvlulqjd.R.inc(25307);addPropsHere.put("boxes", Collections.singletonList(new FreeBox(100)));
        __CLR4_5_2jiojiolvlulqjd.R.inc(25308);addPropsHere.put("continuousKaraoke", true);
        __CLR4_5_2jiojiolvlulqjd.R.inc(25309);addPropsHere.put("dataReferenceIndex", 4);
        __CLR4_5_2jiojiolvlulqjd.R.inc(25310);addPropsHere.put("fillTextRegion", true);
        __CLR4_5_2jiojiolvlulqjd.R.inc(25311);addPropsHere.put("horizontalJustification", 20);
        __CLR4_5_2jiojiolvlulqjd.R.inc(25312);addPropsHere.put("scrollDirection", false);
        __CLR4_5_2jiojiolvlulqjd.R.inc(25313);addPropsHere.put("scrollIn", false);
        __CLR4_5_2jiojiolvlulqjd.R.inc(25314);addPropsHere.put("scrollOut", true);
        __CLR4_5_2jiojiolvlulqjd.R.inc(25315);addPropsHere.put("styleRecord", new TextSampleEntry.StyleRecord(7, 8, 9, 10, 11, new int[]{0xfe, 0xfd, 0xfc, 0xfb}));
        __CLR4_5_2jiojiolvlulqjd.R.inc(25316);addPropsHere.put("verticalJustification", 43);
        __CLR4_5_2jiojiolvlulqjd.R.inc(25317);addPropsHere.put("writeTextVertically", true);
    }finally{__CLR4_5_2jiojiolvlulqjd.R.flushNeeded();}}
}
