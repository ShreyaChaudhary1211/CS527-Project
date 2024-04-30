/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.googlecode.mp4parser.boxes.mp4.objectdescriptors;

import org.junit.Assert;
import org.junit.Test;

import java.nio.ByteBuffer;

public class BitReaderBufferTest {static class __CLR4_5_2jgajgalvl9emxz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413286414L,8589935092L,25240,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    ByteBuffer testSequence = ByteBuffer.wrap(new byte[]{-1, 0, -1, 0});

    @Test
    public void readFromTheMiddle() {__CLR4_5_2jgajgalvl9emxz.R.globalSliceStart(getClass().getName(),25210);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23ktpiljga();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jgajgalvl9emxz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jgajgalvl9emxz.R.globalSliceEnd(getClass().getName(),"com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBufferTest.readFromTheMiddle",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25210,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23ktpiljga(){try{__CLR4_5_2jgajgalvl9emxz.R.inc(25210);
        __CLR4_5_2jgajgalvl9emxz.R.inc(25211);ByteBuffer b = ByteBuffer.wrap(new byte[]{0, -1});
        __CLR4_5_2jgajgalvl9emxz.R.inc(25212);b.get();
        __CLR4_5_2jgajgalvl9emxz.R.inc(25213);BitReaderBuffer brb = new BitReaderBuffer(b);
        __CLR4_5_2jgajgalvl9emxz.R.inc(25214);Assert.assertEquals(15, brb.readBits(4));
        __CLR4_5_2jgajgalvl9emxz.R.inc(25215);Assert.assertEquals(15, brb.readBits(4));

    }finally{__CLR4_5_2jgajgalvl9emxz.R.flushNeeded();}}

    @Test
    public void testRead_8() {__CLR4_5_2jgajgalvl9emxz.R.globalSliceStart(getClass().getName(),25216);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22dul9kjgg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jgajgalvl9emxz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jgajgalvl9emxz.R.globalSliceEnd(getClass().getName(),"com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBufferTest.testRead_8",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25216,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22dul9kjgg(){try{__CLR4_5_2jgajgalvl9emxz.R.inc(25216);
        __CLR4_5_2jgajgalvl9emxz.R.inc(25217);BitReaderBuffer bitReaderBuffer = new BitReaderBuffer(testSequence);
        __CLR4_5_2jgajgalvl9emxz.R.inc(25218);Assert.assertEquals(15, bitReaderBuffer.readBits(4));
        __CLR4_5_2jgajgalvl9emxz.R.inc(25219);Assert.assertEquals(15, bitReaderBuffer.readBits(4));
        __CLR4_5_2jgajgalvl9emxz.R.inc(25220);Assert.assertEquals(0, bitReaderBuffer.readBits(4));
        __CLR4_5_2jgajgalvl9emxz.R.inc(25221);Assert.assertEquals(0, bitReaderBuffer.readBits(4));
    }finally{__CLR4_5_2jgajgalvl9emxz.R.flushNeeded();}}

    @Test
    public void testReadCrossByte() {__CLR4_5_2jgajgalvl9emxz.R.globalSliceStart(getClass().getName(),25222);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gone4njgm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jgajgalvl9emxz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jgajgalvl9emxz.R.globalSliceEnd(getClass().getName(),"com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBufferTest.testReadCrossByte",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25222,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gone4njgm(){try{__CLR4_5_2jgajgalvl9emxz.R.inc(25222);
        __CLR4_5_2jgajgalvl9emxz.R.inc(25223);BitReaderBuffer bitReaderBuffer = new BitReaderBuffer(testSequence);
        __CLR4_5_2jgajgalvl9emxz.R.inc(25224);Assert.assertEquals(31, bitReaderBuffer.readBits(5));
        __CLR4_5_2jgajgalvl9emxz.R.inc(25225);Assert.assertEquals(14, bitReaderBuffer.readBits(4));
        __CLR4_5_2jgajgalvl9emxz.R.inc(25226);Assert.assertEquals(0, bitReaderBuffer.readBits(3));
        __CLR4_5_2jgajgalvl9emxz.R.inc(25227);Assert.assertEquals(0, bitReaderBuffer.readBits(4));
    }finally{__CLR4_5_2jgajgalvl9emxz.R.flushNeeded();}}

    @Test
    public void testReadMultiByte() {__CLR4_5_2jgajgalvl9emxz.R.globalSliceStart(getClass().getName(),25228);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jfm5i8jgs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jgajgalvl9emxz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jgajgalvl9emxz.R.globalSliceEnd(getClass().getName(),"com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBufferTest.testReadMultiByte",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25228,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jfm5i8jgs(){try{__CLR4_5_2jgajgalvl9emxz.R.inc(25228);
        __CLR4_5_2jgajgalvl9emxz.R.inc(25229);BitReaderBuffer bitReaderBuffer = new BitReaderBuffer(testSequence);
        __CLR4_5_2jgajgalvl9emxz.R.inc(25230);Assert.assertEquals(510, bitReaderBuffer.readBits(9));
    }finally{__CLR4_5_2jgajgalvl9emxz.R.flushNeeded();}}

    @Test
    public void testReadMultiByte2() {__CLR4_5_2jgajgalvl9emxz.R.globalSliceStart(getClass().getName(),25231);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28l9xq8jgv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jgajgalvl9emxz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jgajgalvl9emxz.R.globalSliceEnd(getClass().getName(),"com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBufferTest.testReadMultiByte2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25231,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28l9xq8jgv(){try{__CLR4_5_2jgajgalvl9emxz.R.inc(25231);
        __CLR4_5_2jgajgalvl9emxz.R.inc(25232);BitReaderBuffer bitReaderBuffer = new BitReaderBuffer(testSequence);
        __CLR4_5_2jgajgalvl9emxz.R.inc(25233);Assert.assertEquals(0x1fe01, bitReaderBuffer.readBits(17));
    }finally{__CLR4_5_2jgajgalvl9emxz.R.flushNeeded();}}


    @Test
    public void testRemainingBits() {__CLR4_5_2jgajgalvl9emxz.R.globalSliceStart(getClass().getName(),25234);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qzlpovjgy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jgajgalvl9emxz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jgajgalvl9emxz.R.globalSliceEnd(getClass().getName(),"com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBufferTest.testRemainingBits",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25234,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qzlpovjgy(){try{__CLR4_5_2jgajgalvl9emxz.R.inc(25234);
        __CLR4_5_2jgajgalvl9emxz.R.inc(25235);BitReaderBuffer bitReaderBuffer = new BitReaderBuffer(testSequence);
        __CLR4_5_2jgajgalvl9emxz.R.inc(25236);Assert.assertEquals(32, bitReaderBuffer.remainingBits());
        __CLR4_5_2jgajgalvl9emxz.R.inc(25237);int six = 6;
        __CLR4_5_2jgajgalvl9emxz.R.inc(25238);bitReaderBuffer.readBits(six);
        __CLR4_5_2jgajgalvl9emxz.R.inc(25239);Assert.assertEquals(32 - six, bitReaderBuffer.remainingBits());
    }finally{__CLR4_5_2jgajgalvl9emxz.R.flushNeeded();}}
}
