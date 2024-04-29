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
public class BitWriterBufferTest {static class __CLR4_5_2jh4jh4lvl9emy6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413286414L,8589935092L,25318,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @Test
    public void testWriteWithinBuffer() {__CLR4_5_2jh4jh4lvl9emy6.R.globalSliceStart(getClass().getName(),25240);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xw40tdjh4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jh4jh4lvl9emy6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jh4jh4lvl9emy6.R.globalSliceEnd(getClass().getName(),"com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitWriterBufferTest.testWriteWithinBuffer",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25240,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xw40tdjh4(){try{__CLR4_5_2jh4jh4lvl9emy6.R.inc(25240);
        __CLR4_5_2jh4jh4lvl9emy6.R.inc(25241);ByteBuffer b = ByteBuffer.allocate(2);
        __CLR4_5_2jh4jh4lvl9emy6.R.inc(25242);b.put((byte) 0);
        __CLR4_5_2jh4jh4lvl9emy6.R.inc(25243);BitWriterBuffer bwb = new BitWriterBuffer(b);
        __CLR4_5_2jh4jh4lvl9emy6.R.inc(25244);bwb.writeBits(15, 4);
        __CLR4_5_2jh4jh4lvl9emy6.R.inc(25245);Assert.assertEquals("0000000011110000", toString(b));

    }finally{__CLR4_5_2jh4jh4lvl9emy6.R.flushNeeded();}}

    @Test
    public void testSimple() {__CLR4_5_2jh4jh4lvl9emy6.R.globalSliceStart(getClass().getName(),25246);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27uh9yjjha();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jh4jh4lvl9emy6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jh4jh4lvl9emy6.R.globalSliceEnd(getClass().getName(),"com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitWriterBufferTest.testSimple",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25246,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27uh9yjjha(){try{__CLR4_5_2jh4jh4lvl9emy6.R.inc(25246);
        __CLR4_5_2jh4jh4lvl9emy6.R.inc(25247);ByteBuffer bb = ByteBuffer.allocate(4);
        __CLR4_5_2jh4jh4lvl9emy6.R.inc(25248);BitWriterBuffer bitWriterBuffer = new BitWriterBuffer(bb);
        __CLR4_5_2jh4jh4lvl9emy6.R.inc(25249);bitWriterBuffer.writeBits(15, 4);
        __CLR4_5_2jh4jh4lvl9emy6.R.inc(25250);bb.rewind();
        __CLR4_5_2jh4jh4lvl9emy6.R.inc(25251);int test = IsoTypeReader.readUInt8(bb);
        __CLR4_5_2jh4jh4lvl9emy6.R.inc(25252);Assert.assertEquals(15 << 4, test);
    }finally{__CLR4_5_2jh4jh4lvl9emy6.R.flushNeeded();}}

    @Test
    public void testSimpleOnByteBorder() {__CLR4_5_2jh4jh4lvl9emy6.R.globalSliceStart(getClass().getName(),25253);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fpaww2jhh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jh4jh4lvl9emy6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jh4jh4lvl9emy6.R.globalSliceEnd(getClass().getName(),"com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitWriterBufferTest.testSimpleOnByteBorder",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25253,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fpaww2jhh(){try{__CLR4_5_2jh4jh4lvl9emy6.R.inc(25253);
        __CLR4_5_2jh4jh4lvl9emy6.R.inc(25254);ByteBuffer bb = ByteBuffer.allocate(4);
        __CLR4_5_2jh4jh4lvl9emy6.R.inc(25255);BitWriterBuffer bitWriterBuffer = new BitWriterBuffer(bb);
        __CLR4_5_2jh4jh4lvl9emy6.R.inc(25256);bitWriterBuffer.writeBits(15, 4);
        __CLR4_5_2jh4jh4lvl9emy6.R.inc(25257);bitWriterBuffer.writeBits(15, 4);
        __CLR4_5_2jh4jh4lvl9emy6.R.inc(25258);bitWriterBuffer.writeBits(15, 4);
        __CLR4_5_2jh4jh4lvl9emy6.R.inc(25259);bb.rewind();
        __CLR4_5_2jh4jh4lvl9emy6.R.inc(25260);int test = IsoTypeReader.readUInt8(bb);
        __CLR4_5_2jh4jh4lvl9emy6.R.inc(25261);Assert.assertEquals(255, test);
        __CLR4_5_2jh4jh4lvl9emy6.R.inc(25262);test = IsoTypeReader.readUInt8(bb);
        __CLR4_5_2jh4jh4lvl9emy6.R.inc(25263);Assert.assertEquals(15 << 4, test);
    }finally{__CLR4_5_2jh4jh4lvl9emy6.R.flushNeeded();}}

    @Test
    public void testSimpleCrossByteBorder() {__CLR4_5_2jh4jh4lvl9emy6.R.globalSliceStart(getClass().getName(),25264);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28xlto7jhs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jh4jh4lvl9emy6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jh4jh4lvl9emy6.R.globalSliceEnd(getClass().getName(),"com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitWriterBufferTest.testSimpleCrossByteBorder",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25264,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28xlto7jhs(){try{__CLR4_5_2jh4jh4lvl9emy6.R.inc(25264);
        __CLR4_5_2jh4jh4lvl9emy6.R.inc(25265);ByteBuffer bb = ByteBuffer.allocate(2);
        __CLR4_5_2jh4jh4lvl9emy6.R.inc(25266);BitWriterBuffer bitWriterBuffer = new BitWriterBuffer(bb);

        __CLR4_5_2jh4jh4lvl9emy6.R.inc(25267);bitWriterBuffer.writeBits(1, 4);
        __CLR4_5_2jh4jh4lvl9emy6.R.inc(25268);bitWriterBuffer.writeBits(1, 5);
        __CLR4_5_2jh4jh4lvl9emy6.R.inc(25269);bitWriterBuffer.writeBits(1, 3);

        __CLR4_5_2jh4jh4lvl9emy6.R.inc(25270);Assert.assertEquals("0001000010010000", toString(bb));
    }finally{__CLR4_5_2jh4jh4lvl9emy6.R.flushNeeded();}}

    @Test
    public void testMultiByte() {__CLR4_5_2jh4jh4lvl9emy6.R.globalSliceStart(getClass().getName(),25271);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2x1w6cqjhz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jh4jh4lvl9emy6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jh4jh4lvl9emy6.R.globalSliceEnd(getClass().getName(),"com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitWriterBufferTest.testMultiByte",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25271,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2x1w6cqjhz(){try{__CLR4_5_2jh4jh4lvl9emy6.R.inc(25271);
        __CLR4_5_2jh4jh4lvl9emy6.R.inc(25272);ByteBuffer bb = ByteBuffer.allocate(4);
        __CLR4_5_2jh4jh4lvl9emy6.R.inc(25273);BitWriterBuffer bitWriterBuffer = new BitWriterBuffer(bb);
        __CLR4_5_2jh4jh4lvl9emy6.R.inc(25274);bitWriterBuffer.writeBits(0, 1);
        __CLR4_5_2jh4jh4lvl9emy6.R.inc(25275);bitWriterBuffer.writeBits(65535, 16);
        __CLR4_5_2jh4jh4lvl9emy6.R.inc(25276);bb.rewind();
        __CLR4_5_2jh4jh4lvl9emy6.R.inc(25277);int test = IsoTypeReader.readUInt8(bb);
        __CLR4_5_2jh4jh4lvl9emy6.R.inc(25278);Assert.assertEquals(127, test);
        __CLR4_5_2jh4jh4lvl9emy6.R.inc(25279);test = IsoTypeReader.readUInt8(bb);
        __CLR4_5_2jh4jh4lvl9emy6.R.inc(25280);Assert.assertEquals(255, test);
        __CLR4_5_2jh4jh4lvl9emy6.R.inc(25281);test = IsoTypeReader.readUInt8(bb);
        __CLR4_5_2jh4jh4lvl9emy6.R.inc(25282);Assert.assertEquals(1 << 7, test);
    }finally{__CLR4_5_2jh4jh4lvl9emy6.R.flushNeeded();}}

    @Test
    public void testPattern() {__CLR4_5_2jh4jh4lvl9emy6.R.globalSliceStart(getClass().getName(),25283);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2243suzjib();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jh4jh4lvl9emy6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jh4jh4lvl9emy6.R.globalSliceEnd(getClass().getName(),"com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitWriterBufferTest.testPattern",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25283,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2243suzjib(){try{__CLR4_5_2jh4jh4lvl9emy6.R.inc(25283);
        __CLR4_5_2jh4jh4lvl9emy6.R.inc(25284);ByteBuffer bb = ByteBuffer.allocate(1);
        __CLR4_5_2jh4jh4lvl9emy6.R.inc(25285);BitWriterBuffer bwb = new BitWriterBuffer(bb);
        __CLR4_5_2jh4jh4lvl9emy6.R.inc(25286);bwb.writeBits(1, 1);
        __CLR4_5_2jh4jh4lvl9emy6.R.inc(25287);bwb.writeBits(1, 2);
        __CLR4_5_2jh4jh4lvl9emy6.R.inc(25288);bwb.writeBits(1, 3);
        __CLR4_5_2jh4jh4lvl9emy6.R.inc(25289);bwb.writeBits(1, 2);

        __CLR4_5_2jh4jh4lvl9emy6.R.inc(25290);Assert.assertEquals("10100101", toString(bb));
    }finally{__CLR4_5_2jh4jh4lvl9emy6.R.flushNeeded();}}

    @Test
    public void testWriterReaderRoundTrip() {__CLR4_5_2jh4jh4lvl9emy6.R.globalSliceStart(getClass().getName(),25291);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29iwyzyjij();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jh4jh4lvl9emy6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jh4jh4lvl9emy6.R.globalSliceEnd(getClass().getName(),"com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitWriterBufferTest.testWriterReaderRoundTrip",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25291,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29iwyzyjij(){try{__CLR4_5_2jh4jh4lvl9emy6.R.inc(25291);
        __CLR4_5_2jh4jh4lvl9emy6.R.inc(25292);ByteBuffer b = ByteBuffer.allocate(3);
        __CLR4_5_2jh4jh4lvl9emy6.R.inc(25293);BitWriterBuffer bwb = new BitWriterBuffer(b);
        __CLR4_5_2jh4jh4lvl9emy6.R.inc(25294);bwb.writeBits(1, 1);
        __CLR4_5_2jh4jh4lvl9emy6.R.inc(25295);bwb.writeBits(1, 2);
        __CLR4_5_2jh4jh4lvl9emy6.R.inc(25296);bwb.writeBits(1, 3);
        __CLR4_5_2jh4jh4lvl9emy6.R.inc(25297);bwb.writeBits(1, 4);
        __CLR4_5_2jh4jh4lvl9emy6.R.inc(25298);bwb.writeBits(1, 5);
        __CLR4_5_2jh4jh4lvl9emy6.R.inc(25299);bwb.writeBits(7, 6);
        __CLR4_5_2jh4jh4lvl9emy6.R.inc(25300);b.rewind();

        __CLR4_5_2jh4jh4lvl9emy6.R.inc(25301);Assert.assertEquals("101001000100001000111000", toString(b));


    }finally{__CLR4_5_2jh4jh4lvl9emy6.R.flushNeeded();}}


    public static String toString(ByteBuffer bb) {try{__CLR4_5_2jh4jh4lvl9emy6.R.inc(25302);
        __CLR4_5_2jh4jh4lvl9emy6.R.inc(25303);StringBuffer sb = new StringBuffer();
        __CLR4_5_2jh4jh4lvl9emy6.R.inc(25304);for (int i = 0; (((i < bb.limit())&&(__CLR4_5_2jh4jh4lvl9emy6.R.iget(25305)!=0|true))||(__CLR4_5_2jh4jh4lvl9emy6.R.iget(25306)==0&false)); i++) {{
            __CLR4_5_2jh4jh4lvl9emy6.R.inc(25307);int b = bb.get(i);
            __CLR4_5_2jh4jh4lvl9emy6.R.inc(25308);b = (((b < 0 )&&(__CLR4_5_2jh4jh4lvl9emy6.R.iget(25309)!=0|true))||(__CLR4_5_2jh4jh4lvl9emy6.R.iget(25310)==0&false))? b + 256 : b;


            __CLR4_5_2jh4jh4lvl9emy6.R.inc(25311);for (int j = 7; (((j >= 0)&&(__CLR4_5_2jh4jh4lvl9emy6.R.iget(25312)!=0|true))||(__CLR4_5_2jh4jh4lvl9emy6.R.iget(25313)==0&false)); j--) {{
                __CLR4_5_2jh4jh4lvl9emy6.R.inc(25314);sb.append(((((b >> j & 1) == 1 )&&(__CLR4_5_2jh4jh4lvl9emy6.R.iget(25315)!=0|true))||(__CLR4_5_2jh4jh4lvl9emy6.R.iget(25316)==0&false))? "1" : "0");
            }

        }}
        }__CLR4_5_2jh4jh4lvl9emy6.R.inc(25317);return sb.toString();
    }finally{__CLR4_5_2jh4jh4lvl9emy6.R.flushNeeded();}}
}
