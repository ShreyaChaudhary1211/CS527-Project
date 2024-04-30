/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.googlecode.mp4parser.boxes.mp4.objectdescriptors;

import com.coremedia.iso.IsoTypeReader;
import org.junit.Assert;
import org.junit.Test;

import java.nio.ByteBuffer;

/**
 * Created by IntelliJ IDEA.
 * User: sannies
 * Date: 2/29/12
 * Time: 6:34 PM
 * To change this template use File | Settings | File Templates.
 */
public class BitWriterBufferTest {static class __CLR4_5_2kawkawlvlulr6y{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448889527L,8589935092L,26390,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @Test
    public void testWriteWithinBuffer() {__CLR4_5_2kawkawlvlulr6y.R.globalSliceStart(getClass().getName(),26312);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xw40tdkaw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2kawkawlvlulr6y.R.rethrow($CLV_t2$);}finally{__CLR4_5_2kawkawlvlulr6y.R.globalSliceEnd(getClass().getName(),"com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitWriterBufferTest.testWriteWithinBuffer",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26312,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xw40tdkaw(){try{__CLR4_5_2kawkawlvlulr6y.R.inc(26312);
        __CLR4_5_2kawkawlvlulr6y.R.inc(26313);ByteBuffer b = ByteBuffer.allocate(2);
        __CLR4_5_2kawkawlvlulr6y.R.inc(26314);b.put((byte) 0);
        __CLR4_5_2kawkawlvlulr6y.R.inc(26315);BitWriterBuffer bwb = new BitWriterBuffer(b);
        __CLR4_5_2kawkawlvlulr6y.R.inc(26316);bwb.writeBits(15, 4);
        __CLR4_5_2kawkawlvlulr6y.R.inc(26317);Assert.assertEquals("0000000011110000", toString(b));

    }finally{__CLR4_5_2kawkawlvlulr6y.R.flushNeeded();}}

    @Test
    public void testSimple() {__CLR4_5_2kawkawlvlulr6y.R.globalSliceStart(getClass().getName(),26318);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27uh9yjkb2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2kawkawlvlulr6y.R.rethrow($CLV_t2$);}finally{__CLR4_5_2kawkawlvlulr6y.R.globalSliceEnd(getClass().getName(),"com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitWriterBufferTest.testSimple",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26318,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27uh9yjkb2(){try{__CLR4_5_2kawkawlvlulr6y.R.inc(26318);
        __CLR4_5_2kawkawlvlulr6y.R.inc(26319);ByteBuffer bb = ByteBuffer.allocate(4);
        __CLR4_5_2kawkawlvlulr6y.R.inc(26320);BitWriterBuffer bitWriterBuffer = new BitWriterBuffer(bb);
        __CLR4_5_2kawkawlvlulr6y.R.inc(26321);bitWriterBuffer.writeBits(15, 4);
        __CLR4_5_2kawkawlvlulr6y.R.inc(26322);bb.rewind();
        __CLR4_5_2kawkawlvlulr6y.R.inc(26323);int test = IsoTypeReader.readUInt8(bb);
        __CLR4_5_2kawkawlvlulr6y.R.inc(26324);Assert.assertEquals(15 << 4, test);
    }finally{__CLR4_5_2kawkawlvlulr6y.R.flushNeeded();}}

    @Test
    public void testSimpleOnByteBorder() {__CLR4_5_2kawkawlvlulr6y.R.globalSliceStart(getClass().getName(),26325);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fpaww2kb9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2kawkawlvlulr6y.R.rethrow($CLV_t2$);}finally{__CLR4_5_2kawkawlvlulr6y.R.globalSliceEnd(getClass().getName(),"com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitWriterBufferTest.testSimpleOnByteBorder",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26325,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fpaww2kb9(){try{__CLR4_5_2kawkawlvlulr6y.R.inc(26325);
        __CLR4_5_2kawkawlvlulr6y.R.inc(26326);ByteBuffer bb = ByteBuffer.allocate(4);
        __CLR4_5_2kawkawlvlulr6y.R.inc(26327);BitWriterBuffer bitWriterBuffer = new BitWriterBuffer(bb);
        __CLR4_5_2kawkawlvlulr6y.R.inc(26328);bitWriterBuffer.writeBits(15, 4);
        __CLR4_5_2kawkawlvlulr6y.R.inc(26329);bitWriterBuffer.writeBits(15, 4);
        __CLR4_5_2kawkawlvlulr6y.R.inc(26330);bitWriterBuffer.writeBits(15, 4);
        __CLR4_5_2kawkawlvlulr6y.R.inc(26331);bb.rewind();
        __CLR4_5_2kawkawlvlulr6y.R.inc(26332);int test = IsoTypeReader.readUInt8(bb);
        __CLR4_5_2kawkawlvlulr6y.R.inc(26333);Assert.assertEquals(255, test);
        __CLR4_5_2kawkawlvlulr6y.R.inc(26334);test = IsoTypeReader.readUInt8(bb);
        __CLR4_5_2kawkawlvlulr6y.R.inc(26335);Assert.assertEquals(15 << 4, test);
    }finally{__CLR4_5_2kawkawlvlulr6y.R.flushNeeded();}}

    @Test
    public void testSimpleCrossByteBorder() {__CLR4_5_2kawkawlvlulr6y.R.globalSliceStart(getClass().getName(),26336);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28xlto7kbk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2kawkawlvlulr6y.R.rethrow($CLV_t2$);}finally{__CLR4_5_2kawkawlvlulr6y.R.globalSliceEnd(getClass().getName(),"com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitWriterBufferTest.testSimpleCrossByteBorder",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26336,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28xlto7kbk(){try{__CLR4_5_2kawkawlvlulr6y.R.inc(26336);
        __CLR4_5_2kawkawlvlulr6y.R.inc(26337);ByteBuffer bb = ByteBuffer.allocate(2);
        __CLR4_5_2kawkawlvlulr6y.R.inc(26338);BitWriterBuffer bitWriterBuffer = new BitWriterBuffer(bb);

        __CLR4_5_2kawkawlvlulr6y.R.inc(26339);bitWriterBuffer.writeBits(1, 4);
        __CLR4_5_2kawkawlvlulr6y.R.inc(26340);bitWriterBuffer.writeBits(1, 5);
        __CLR4_5_2kawkawlvlulr6y.R.inc(26341);bitWriterBuffer.writeBits(1, 3);

        __CLR4_5_2kawkawlvlulr6y.R.inc(26342);Assert.assertEquals("0001000010010000", toString(bb));
    }finally{__CLR4_5_2kawkawlvlulr6y.R.flushNeeded();}}

    @Test
    public void testMultiByte() {__CLR4_5_2kawkawlvlulr6y.R.globalSliceStart(getClass().getName(),26343);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2x1w6cqkbr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2kawkawlvlulr6y.R.rethrow($CLV_t2$);}finally{__CLR4_5_2kawkawlvlulr6y.R.globalSliceEnd(getClass().getName(),"com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitWriterBufferTest.testMultiByte",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26343,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2x1w6cqkbr(){try{__CLR4_5_2kawkawlvlulr6y.R.inc(26343);
        __CLR4_5_2kawkawlvlulr6y.R.inc(26344);ByteBuffer bb = ByteBuffer.allocate(4);
        __CLR4_5_2kawkawlvlulr6y.R.inc(26345);BitWriterBuffer bitWriterBuffer = new BitWriterBuffer(bb);
        __CLR4_5_2kawkawlvlulr6y.R.inc(26346);bitWriterBuffer.writeBits(0, 1);
        __CLR4_5_2kawkawlvlulr6y.R.inc(26347);bitWriterBuffer.writeBits(65535, 16);
        __CLR4_5_2kawkawlvlulr6y.R.inc(26348);bb.rewind();
        __CLR4_5_2kawkawlvlulr6y.R.inc(26349);int test = IsoTypeReader.readUInt8(bb);
        __CLR4_5_2kawkawlvlulr6y.R.inc(26350);Assert.assertEquals(127, test);
        __CLR4_5_2kawkawlvlulr6y.R.inc(26351);test = IsoTypeReader.readUInt8(bb);
        __CLR4_5_2kawkawlvlulr6y.R.inc(26352);Assert.assertEquals(255, test);
        __CLR4_5_2kawkawlvlulr6y.R.inc(26353);test = IsoTypeReader.readUInt8(bb);
        __CLR4_5_2kawkawlvlulr6y.R.inc(26354);Assert.assertEquals(1 << 7, test);
    }finally{__CLR4_5_2kawkawlvlulr6y.R.flushNeeded();}}

    @Test
    public void testPattern() {__CLR4_5_2kawkawlvlulr6y.R.globalSliceStart(getClass().getName(),26355);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2243suzkc3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2kawkawlvlulr6y.R.rethrow($CLV_t2$);}finally{__CLR4_5_2kawkawlvlulr6y.R.globalSliceEnd(getClass().getName(),"com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitWriterBufferTest.testPattern",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26355,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2243suzkc3(){try{__CLR4_5_2kawkawlvlulr6y.R.inc(26355);
        __CLR4_5_2kawkawlvlulr6y.R.inc(26356);ByteBuffer bb = ByteBuffer.allocate(1);
        __CLR4_5_2kawkawlvlulr6y.R.inc(26357);BitWriterBuffer bwb = new BitWriterBuffer(bb);
        __CLR4_5_2kawkawlvlulr6y.R.inc(26358);bwb.writeBits(1, 1);
        __CLR4_5_2kawkawlvlulr6y.R.inc(26359);bwb.writeBits(1, 2);
        __CLR4_5_2kawkawlvlulr6y.R.inc(26360);bwb.writeBits(1, 3);
        __CLR4_5_2kawkawlvlulr6y.R.inc(26361);bwb.writeBits(1, 2);

        __CLR4_5_2kawkawlvlulr6y.R.inc(26362);Assert.assertEquals("10100101", toString(bb));
    }finally{__CLR4_5_2kawkawlvlulr6y.R.flushNeeded();}}

    @Test
    public void testWriterReaderRoundTrip() {__CLR4_5_2kawkawlvlulr6y.R.globalSliceStart(getClass().getName(),26363);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29iwyzykcb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2kawkawlvlulr6y.R.rethrow($CLV_t2$);}finally{__CLR4_5_2kawkawlvlulr6y.R.globalSliceEnd(getClass().getName(),"com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitWriterBufferTest.testWriterReaderRoundTrip",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26363,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29iwyzykcb(){try{__CLR4_5_2kawkawlvlulr6y.R.inc(26363);
        __CLR4_5_2kawkawlvlulr6y.R.inc(26364);ByteBuffer b = ByteBuffer.allocate(3);
        __CLR4_5_2kawkawlvlulr6y.R.inc(26365);BitWriterBuffer bwb = new BitWriterBuffer(b);
        __CLR4_5_2kawkawlvlulr6y.R.inc(26366);bwb.writeBits(1, 1);
        __CLR4_5_2kawkawlvlulr6y.R.inc(26367);bwb.writeBits(1, 2);
        __CLR4_5_2kawkawlvlulr6y.R.inc(26368);bwb.writeBits(1, 3);
        __CLR4_5_2kawkawlvlulr6y.R.inc(26369);bwb.writeBits(1, 4);
        __CLR4_5_2kawkawlvlulr6y.R.inc(26370);bwb.writeBits(1, 5);
        __CLR4_5_2kawkawlvlulr6y.R.inc(26371);bwb.writeBits(7, 6);
        __CLR4_5_2kawkawlvlulr6y.R.inc(26372);b.rewind();

        __CLR4_5_2kawkawlvlulr6y.R.inc(26373);Assert.assertEquals("101001000100001000111000", toString(b));


    }finally{__CLR4_5_2kawkawlvlulr6y.R.flushNeeded();}}


    public static String toString(ByteBuffer bb) {try{__CLR4_5_2kawkawlvlulr6y.R.inc(26374);
        __CLR4_5_2kawkawlvlulr6y.R.inc(26375);StringBuffer sb = new StringBuffer();
        __CLR4_5_2kawkawlvlulr6y.R.inc(26376);for (int i = 0; (((i < bb.limit())&&(__CLR4_5_2kawkawlvlulr6y.R.iget(26377)!=0|true))||(__CLR4_5_2kawkawlvlulr6y.R.iget(26378)==0&false)); i++) {{
            __CLR4_5_2kawkawlvlulr6y.R.inc(26379);int b = bb.get(i);
            __CLR4_5_2kawkawlvlulr6y.R.inc(26380);b = (((b < 0 )&&(__CLR4_5_2kawkawlvlulr6y.R.iget(26381)!=0|true))||(__CLR4_5_2kawkawlvlulr6y.R.iget(26382)==0&false))? b + 256 : b;


            __CLR4_5_2kawkawlvlulr6y.R.inc(26383);for (int j = 7; (((j >= 0)&&(__CLR4_5_2kawkawlvlulr6y.R.iget(26384)!=0|true))||(__CLR4_5_2kawkawlvlulr6y.R.iget(26385)==0&false)); j--) {{
                __CLR4_5_2kawkawlvlulr6y.R.inc(26386);sb.append(((((b >> j & 1) == 1 )&&(__CLR4_5_2kawkawlvlulr6y.R.iget(26387)!=0|true))||(__CLR4_5_2kawkawlvlulr6y.R.iget(26388)==0&false))? "1" : "0");
            }

        }}
        }__CLR4_5_2kawkawlvlulr6y.R.inc(26389);return sb.toString();
    }finally{__CLR4_5_2kawkawlvlulr6y.R.flushNeeded();}}
}
