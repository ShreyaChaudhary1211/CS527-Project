/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.coremedia.iso;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.nio.ByteBuffer;

/**
 * Test symmetrie of IsoBufferWrapper and Iso
 */
public class IsoTypeReaderTest {static class __CLR4_5_2hughuglvlulpso{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448889527L,8589935092L,23179,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;


    @Test
    public void testInt() throws IOException {__CLR4_5_2hughuglvlulpso.R.globalSliceStart(getClass().getName(),23128);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28s3xd0hug();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2hughuglvlulpso.R.rethrow($CLV_t2$);}finally{__CLR4_5_2hughuglvlulpso.R.globalSliceEnd(getClass().getName(),"com.coremedia.iso.IsoTypeReaderTest.testInt",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23128,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28s3xd0hug() throws IOException{try{__CLR4_5_2hughuglvlulpso.R.inc(23128);
        __CLR4_5_2hughuglvlulpso.R.inc(23129);ByteBuffer bb = ByteBuffer.allocate(20);

        __CLR4_5_2hughuglvlulpso.R.inc(23130);IsoTypeWriter.writeUInt8(bb, 0);
        __CLR4_5_2hughuglvlulpso.R.inc(23131);IsoTypeWriter.writeUInt8(bb, 255);
        __CLR4_5_2hughuglvlulpso.R.inc(23132);IsoTypeWriter.writeUInt16(bb, 0);
        __CLR4_5_2hughuglvlulpso.R.inc(23133);IsoTypeWriter.writeUInt16(bb, (1 << 16) - 1);
        __CLR4_5_2hughuglvlulpso.R.inc(23134);IsoTypeWriter.writeUInt24(bb, 0);
        __CLR4_5_2hughuglvlulpso.R.inc(23135);IsoTypeWriter.writeUInt24(bb, (1 << 24) - 1);
        __CLR4_5_2hughuglvlulpso.R.inc(23136);IsoTypeWriter.writeUInt32(bb, 0);
        __CLR4_5_2hughuglvlulpso.R.inc(23137);IsoTypeWriter.writeUInt32(bb, (1l << 32) - 1);
        __CLR4_5_2hughuglvlulpso.R.inc(23138);bb.rewind();

        __CLR4_5_2hughuglvlulpso.R.inc(23139);Assert.assertEquals(0, IsoTypeReader.readUInt8(bb));
        __CLR4_5_2hughuglvlulpso.R.inc(23140);Assert.assertEquals(255, IsoTypeReader.readUInt8(bb));
        __CLR4_5_2hughuglvlulpso.R.inc(23141);Assert.assertEquals(0, IsoTypeReader.readUInt16(bb));
        __CLR4_5_2hughuglvlulpso.R.inc(23142);Assert.assertEquals((1 << 16) - 1, IsoTypeReader.readUInt16(bb));
        __CLR4_5_2hughuglvlulpso.R.inc(23143);Assert.assertEquals(0, IsoTypeReader.readUInt24(bb));
        __CLR4_5_2hughuglvlulpso.R.inc(23144);Assert.assertEquals((1 << 24) - 1, IsoTypeReader.readUInt24(bb));
        __CLR4_5_2hughuglvlulpso.R.inc(23145);Assert.assertEquals(0, IsoTypeReader.readUInt32(bb));
        __CLR4_5_2hughuglvlulpso.R.inc(23146);Assert.assertEquals((1l << 32) - 1, IsoTypeReader.readUInt32(bb));
    }finally{__CLR4_5_2hughuglvlulpso.R.flushNeeded();}}

    @Test
    public void testFixedPoint1616() throws IOException {__CLR4_5_2hughuglvlulpso.R.globalSliceStart(getClass().getName(),23147);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2peew3lhuz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2hughuglvlulpso.R.rethrow($CLV_t2$);}finally{__CLR4_5_2hughuglvlulpso.R.globalSliceEnd(getClass().getName(),"com.coremedia.iso.IsoTypeReaderTest.testFixedPoint1616",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23147,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2peew3lhuz() throws IOException{try{__CLR4_5_2hughuglvlulpso.R.inc(23147);
        __CLR4_5_2hughuglvlulpso.R.inc(23148);final double fixedPointTest1 = 10.13;
        __CLR4_5_2hughuglvlulpso.R.inc(23149);final double fixedPointTest2 = -10.13;


        __CLR4_5_2hughuglvlulpso.R.inc(23150);ByteBuffer bb = ByteBuffer.allocate(8);

        __CLR4_5_2hughuglvlulpso.R.inc(23151);IsoTypeWriter.writeFixedPoint1616(bb, fixedPointTest1);
        __CLR4_5_2hughuglvlulpso.R.inc(23152);IsoTypeWriter.writeFixedPoint1616(bb, fixedPointTest2);
        __CLR4_5_2hughuglvlulpso.R.inc(23153);bb.rewind();

        __CLR4_5_2hughuglvlulpso.R.inc(23154);Assert.assertEquals("fixedPointTest1", fixedPointTest1, IsoTypeReader.readFixedPoint1616(bb), 1d / 65536);
        __CLR4_5_2hughuglvlulpso.R.inc(23155);Assert.assertEquals("fixedPointTest2", fixedPointTest2, IsoTypeReader.readFixedPoint1616(bb), 1d / 65536);
    }finally{__CLR4_5_2hughuglvlulpso.R.flushNeeded();}}

    @Test
    public void testFixedPoint0230() throws IOException {__CLR4_5_2hughuglvlulpso.R.globalSliceStart(getClass().getName(),23156);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2i818hghv8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2hughuglvlulpso.R.rethrow($CLV_t2$);}finally{__CLR4_5_2hughuglvlulpso.R.globalSliceEnd(getClass().getName(),"com.coremedia.iso.IsoTypeReaderTest.testFixedPoint0230",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23156,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2i818hghv8() throws IOException{try{__CLR4_5_2hughuglvlulpso.R.inc(23156);
        __CLR4_5_2hughuglvlulpso.R.inc(23157);final double fixedPointTest1 = 1.13;
        __CLR4_5_2hughuglvlulpso.R.inc(23158);final double fixedPointTest2 = -1.13;


        __CLR4_5_2hughuglvlulpso.R.inc(23159);ByteBuffer bb = ByteBuffer.allocate(8);

        __CLR4_5_2hughuglvlulpso.R.inc(23160);IsoTypeWriter.writeFixedPoint0230(bb, fixedPointTest1);
        __CLR4_5_2hughuglvlulpso.R.inc(23161);IsoTypeWriter.writeFixedPoint0230(bb, fixedPointTest2);
        __CLR4_5_2hughuglvlulpso.R.inc(23162);bb.rewind();

        __CLR4_5_2hughuglvlulpso.R.inc(23163);Assert.assertEquals("fixedPointTest1", fixedPointTest1, IsoTypeReader.readFixedPoint0230(bb), 1d / 65536);
        __CLR4_5_2hughuglvlulpso.R.inc(23164);Assert.assertEquals("fixedPointTest2", fixedPointTest2, IsoTypeReader.readFixedPoint0230(bb), 1d / 65536);
    }finally{__CLR4_5_2hughuglvlulpso.R.flushNeeded();}}

    @Test
    public void testFixedPoint88() throws IOException {__CLR4_5_2hughuglvlulpso.R.globalSliceStart(getClass().getName(),23165);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2sz0o5nhvh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2hughuglvlulpso.R.rethrow($CLV_t2$);}finally{__CLR4_5_2hughuglvlulpso.R.globalSliceEnd(getClass().getName(),"com.coremedia.iso.IsoTypeReaderTest.testFixedPoint88",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23165,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2sz0o5nhvh() throws IOException{try{__CLR4_5_2hughuglvlulpso.R.inc(23165);
        __CLR4_5_2hughuglvlulpso.R.inc(23166);final double fixedPointTest1 = 10.13;
        __CLR4_5_2hughuglvlulpso.R.inc(23167);final double fixedPointTest2 = -10.13;
        __CLR4_5_2hughuglvlulpso.R.inc(23168);ByteBuffer bb = ByteBuffer.allocate(4);


        __CLR4_5_2hughuglvlulpso.R.inc(23169);IsoTypeWriter.writeFixedPoint88(bb, fixedPointTest1);
        __CLR4_5_2hughuglvlulpso.R.inc(23170);IsoTypeWriter.writeFixedPoint88(bb, fixedPointTest2);
        __CLR4_5_2hughuglvlulpso.R.inc(23171);bb.rewind();

        __CLR4_5_2hughuglvlulpso.R.inc(23172);Assert.assertEquals("fixedPointTest1", fixedPointTest1, IsoTypeReader.readFixedPoint88(bb), 1d / 256);
        __CLR4_5_2hughuglvlulpso.R.inc(23173);Assert.assertEquals("fixedPointTest2", fixedPointTest2, IsoTypeReader.readFixedPoint88(bb), 1d / 256);
    }finally{__CLR4_5_2hughuglvlulpso.R.flushNeeded();}}

    @Test
    public void testRead4cc() throws IOException {__CLR4_5_2hughuglvlulpso.R.globalSliceStart(getClass().getName(),23174);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bxq7mbhvq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2hughuglvlulpso.R.rethrow($CLV_t2$);}finally{__CLR4_5_2hughuglvlulpso.R.globalSliceEnd(getClass().getName(),"com.coremedia.iso.IsoTypeReaderTest.testRead4cc",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23174,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bxq7mbhvq() throws IOException{try{__CLR4_5_2hughuglvlulpso.R.inc(23174);
        __CLR4_5_2hughuglvlulpso.R.inc(23175);ByteBuffer bb = ByteBuffer.wrap("abcd".getBytes());
        __CLR4_5_2hughuglvlulpso.R.inc(23176);String code = IsoTypeReader.read4cc(bb);
        __CLR4_5_2hughuglvlulpso.R.inc(23177);Assert.assertEquals(4, bb.position());
        __CLR4_5_2hughuglvlulpso.R.inc(23178);Assert.assertEquals("abcd", code);

    }finally{__CLR4_5_2hughuglvlulpso.R.flushNeeded();}}

}
