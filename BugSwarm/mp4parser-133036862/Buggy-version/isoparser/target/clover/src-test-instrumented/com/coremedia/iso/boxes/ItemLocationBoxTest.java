/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.coremedia.iso.boxes;

import com.coremedia.iso.IsoFile;
import com.googlecode.mp4parser.MemoryDataSourceImpl;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ItemLocationBoxTest {static class __CLR4_5_2hxlhxllvlulpvx{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448889527L,8589935092L,23377,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    int[] v = new int[]{1, 2, 4, 8};

    @Test
    public void testSimpleRoundTrip() throws IOException {__CLR4_5_2hxlhxllvlulpvx.R.globalSliceStart(getClass().getName(),23241);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2v3rm46hxl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2hxlhxllvlulpvx.R.rethrow($CLV_t2$);}finally{__CLR4_5_2hxlhxllvlulpvx.R.globalSliceEnd(getClass().getName(),"com.coremedia.iso.boxes.ItemLocationBoxTest.testSimpleRoundTrip",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23241,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2v3rm46hxl() throws IOException{try{__CLR4_5_2hxlhxllvlulpvx.R.inc(23241);
        __CLR4_5_2hxlhxllvlulpvx.R.inc(23242);for (int i : v) {{
            __CLR4_5_2hxlhxllvlulpvx.R.inc(23243);for (int i1 : v) {{
                __CLR4_5_2hxlhxllvlulpvx.R.inc(23244);for (int i2 : v) {{
                    __CLR4_5_2hxlhxllvlulpvx.R.inc(23245);for (int i3 : v) {{
                        __CLR4_5_2hxlhxllvlulpvx.R.inc(23246);testSimpleRoundTrip(i, i1, i2, i3);
                    }
                }}
            }}
        }}

    }}finally{__CLR4_5_2hxlhxllvlulpvx.R.flushNeeded();}}

    public void testSimpleRoundTrip(int baseOffsetSize, int indexSize, int lengthSize, int offsetSize) throws IOException {try{__CLR4_5_2hxlhxllvlulpvx.R.inc(23247);
        __CLR4_5_2hxlhxllvlulpvx.R.inc(23248);ItemLocationBox ilocOrig = new ItemLocationBox();
        __CLR4_5_2hxlhxllvlulpvx.R.inc(23249);ilocOrig.setVersion(1);
        __CLR4_5_2hxlhxllvlulpvx.R.inc(23250);ilocOrig.setBaseOffsetSize(baseOffsetSize);
        __CLR4_5_2hxlhxllvlulpvx.R.inc(23251);ilocOrig.setIndexSize(indexSize);
        __CLR4_5_2hxlhxllvlulpvx.R.inc(23252);ilocOrig.setLengthSize(lengthSize);
        __CLR4_5_2hxlhxllvlulpvx.R.inc(23253);ilocOrig.setOffsetSize(offsetSize);

        __CLR4_5_2hxlhxllvlulpvx.R.inc(23254);ByteArrayOutputStream baos = new ByteArrayOutputStream();


        __CLR4_5_2hxlhxllvlulpvx.R.inc(23255);ilocOrig.getBox(Channels.newChannel(baos));



        __CLR4_5_2hxlhxllvlulpvx.R.inc(23256);IsoFile isoFile = new IsoFile(new MemoryDataSourceImpl(baos.toByteArray()));

        __CLR4_5_2hxlhxllvlulpvx.R.inc(23257);ItemLocationBox iloc = (ItemLocationBox) isoFile.getBoxes().get(0);

        __CLR4_5_2hxlhxllvlulpvx.R.inc(23258);Assert.assertEquals(ilocOrig.getBaseOffsetSize(), iloc.getBaseOffsetSize());
        __CLR4_5_2hxlhxllvlulpvx.R.inc(23259);Assert.assertEquals(ilocOrig.getContentSize(), iloc.getContentSize());
        __CLR4_5_2hxlhxllvlulpvx.R.inc(23260);Assert.assertEquals(ilocOrig.getIndexSize(), iloc.getIndexSize());
        __CLR4_5_2hxlhxllvlulpvx.R.inc(23261);Assert.assertEquals(ilocOrig.getLengthSize(), iloc.getLengthSize());
        __CLR4_5_2hxlhxllvlulpvx.R.inc(23262);Assert.assertEquals(ilocOrig.getOffsetSize(), iloc.getOffsetSize());
        __CLR4_5_2hxlhxllvlulpvx.R.inc(23263);Assert.assertEquals(ilocOrig.getItems(), iloc.getItems());


    }finally{__CLR4_5_2hxlhxllvlulpvx.R.flushNeeded();}}


    @Test
    public void testSimpleRoundWithEntriesTrip() throws IOException {__CLR4_5_2hxlhxllvlulpvx.R.globalSliceStart(getClass().getName(),23264);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ic2fschy8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2hxlhxllvlulpvx.R.rethrow($CLV_t2$);}finally{__CLR4_5_2hxlhxllvlulpvx.R.globalSliceEnd(getClass().getName(),"com.coremedia.iso.boxes.ItemLocationBoxTest.testSimpleRoundWithEntriesTrip",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23264,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ic2fschy8() throws IOException{try{__CLR4_5_2hxlhxllvlulpvx.R.inc(23264);
        __CLR4_5_2hxlhxllvlulpvx.R.inc(23265);for (int i : v) {{
            __CLR4_5_2hxlhxllvlulpvx.R.inc(23266);for (int i1 : v) {{
                __CLR4_5_2hxlhxllvlulpvx.R.inc(23267);for (int i2 : v) {{
                    __CLR4_5_2hxlhxllvlulpvx.R.inc(23268);for (int i3 : v) {{
                        __CLR4_5_2hxlhxllvlulpvx.R.inc(23269);testSimpleRoundWithEntriesTrip(i, i1, i2, i3);
                    }
                }}
            }}
        }}
    }}finally{__CLR4_5_2hxlhxllvlulpvx.R.flushNeeded();}}

    public void testSimpleRoundWithEntriesTrip(int baseOffsetSize, int indexSize, int lengthSize, int offsetSize) throws IOException {try{__CLR4_5_2hxlhxllvlulpvx.R.inc(23270);
        __CLR4_5_2hxlhxllvlulpvx.R.inc(23271);ItemLocationBox ilocOrig = new ItemLocationBox();
        __CLR4_5_2hxlhxllvlulpvx.R.inc(23272);ilocOrig.setVersion(1);
        __CLR4_5_2hxlhxllvlulpvx.R.inc(23273);ilocOrig.setBaseOffsetSize(baseOffsetSize);
        __CLR4_5_2hxlhxllvlulpvx.R.inc(23274);ilocOrig.setIndexSize(indexSize);
        __CLR4_5_2hxlhxllvlulpvx.R.inc(23275);ilocOrig.setLengthSize(lengthSize);
        __CLR4_5_2hxlhxllvlulpvx.R.inc(23276);ilocOrig.setOffsetSize(offsetSize);
        __CLR4_5_2hxlhxllvlulpvx.R.inc(23277);ItemLocationBox.Item item = ilocOrig.createItem(12, 0, 13, 123, Collections.<ItemLocationBox.Extent>emptyList());
        __CLR4_5_2hxlhxllvlulpvx.R.inc(23278);ilocOrig.setItems(Collections.singletonList(item));
        __CLR4_5_2hxlhxllvlulpvx.R.inc(23279);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_5_2hxlhxllvlulpvx.R.inc(23280);ilocOrig.getBox(Channels.newChannel(baos));

        __CLR4_5_2hxlhxllvlulpvx.R.inc(23281);IsoFile isoFile = new IsoFile(new MemoryDataSourceImpl(baos.toByteArray()));

        __CLR4_5_2hxlhxllvlulpvx.R.inc(23282);ItemLocationBox iloc = (ItemLocationBox) isoFile.getBoxes().get(0);

        __CLR4_5_2hxlhxllvlulpvx.R.inc(23283);Assert.assertEquals(ilocOrig.getBaseOffsetSize(), iloc.getBaseOffsetSize());
        __CLR4_5_2hxlhxllvlulpvx.R.inc(23284);Assert.assertEquals(ilocOrig.getContentSize(), iloc.getContentSize());
        __CLR4_5_2hxlhxllvlulpvx.R.inc(23285);Assert.assertEquals(ilocOrig.getIndexSize(), iloc.getIndexSize());
        __CLR4_5_2hxlhxllvlulpvx.R.inc(23286);Assert.assertEquals(ilocOrig.getLengthSize(), iloc.getLengthSize());
        __CLR4_5_2hxlhxllvlulpvx.R.inc(23287);Assert.assertEquals(ilocOrig.getOffsetSize(), iloc.getOffsetSize());
        __CLR4_5_2hxlhxllvlulpvx.R.inc(23288);Assert.assertEquals(ilocOrig.getItems(), iloc.getItems());


    }finally{__CLR4_5_2hxlhxllvlulpvx.R.flushNeeded();}}

    @Test
    public void testSimpleRoundWithEntriesAndExtentsTrip() throws IOException {__CLR4_5_2hxlhxllvlulpvx.R.globalSliceStart(getClass().getName(),23289);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2anxipqhyx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2hxlhxllvlulpvx.R.rethrow($CLV_t2$);}finally{__CLR4_5_2hxlhxllvlulpvx.R.globalSliceEnd(getClass().getName(),"com.coremedia.iso.boxes.ItemLocationBoxTest.testSimpleRoundWithEntriesAndExtentsTrip",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23289,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2anxipqhyx() throws IOException{try{__CLR4_5_2hxlhxllvlulpvx.R.inc(23289);
        __CLR4_5_2hxlhxllvlulpvx.R.inc(23290);for (int i : v) {{
            __CLR4_5_2hxlhxllvlulpvx.R.inc(23291);for (int i1 : v) {{
                __CLR4_5_2hxlhxllvlulpvx.R.inc(23292);for (int i2 : v) {{
                    __CLR4_5_2hxlhxllvlulpvx.R.inc(23293);for (int i3 : v) {{
                        __CLR4_5_2hxlhxllvlulpvx.R.inc(23294);testSimpleRoundWithEntriesAndExtentsTrip(i, i1, i2, i3);
                    }
                }}
            }}
        }}
    }}finally{__CLR4_5_2hxlhxllvlulpvx.R.flushNeeded();}}

    public void testSimpleRoundWithEntriesAndExtentsTrip(int baseOffsetSize, int indexSize, int lengthSize, int offsetSize) throws IOException {try{__CLR4_5_2hxlhxllvlulpvx.R.inc(23295);
        __CLR4_5_2hxlhxllvlulpvx.R.inc(23296);ItemLocationBox ilocOrig = new ItemLocationBox();
        __CLR4_5_2hxlhxllvlulpvx.R.inc(23297);ilocOrig.setVersion(1);
        __CLR4_5_2hxlhxllvlulpvx.R.inc(23298);ilocOrig.setBaseOffsetSize(baseOffsetSize);
        __CLR4_5_2hxlhxllvlulpvx.R.inc(23299);ilocOrig.setIndexSize(indexSize);
        __CLR4_5_2hxlhxllvlulpvx.R.inc(23300);ilocOrig.setLengthSize(lengthSize);
        __CLR4_5_2hxlhxllvlulpvx.R.inc(23301);ilocOrig.setOffsetSize(offsetSize);
        __CLR4_5_2hxlhxllvlulpvx.R.inc(23302);List<ItemLocationBox.Extent> extents = new LinkedList<ItemLocationBox.Extent>();
        __CLR4_5_2hxlhxllvlulpvx.R.inc(23303);ItemLocationBox.Extent extent = ilocOrig.createExtent(12, 13, 1);
        __CLR4_5_2hxlhxllvlulpvx.R.inc(23304);extents.add(extent);
        __CLR4_5_2hxlhxllvlulpvx.R.inc(23305);ItemLocationBox.Item item = ilocOrig.createItem(12, 0, 13, 123, extents);
        __CLR4_5_2hxlhxllvlulpvx.R.inc(23306);ilocOrig.setItems(Collections.singletonList(item));
        __CLR4_5_2hxlhxllvlulpvx.R.inc(23307);File f = File.createTempFile(this.getClass().getSimpleName(), "");
        __CLR4_5_2hxlhxllvlulpvx.R.inc(23308);f.deleteOnExit();
        __CLR4_5_2hxlhxllvlulpvx.R.inc(23309);FileChannel fc = new FileOutputStream(f).getChannel();
        __CLR4_5_2hxlhxllvlulpvx.R.inc(23310);ilocOrig.getBox(fc);
        __CLR4_5_2hxlhxllvlulpvx.R.inc(23311);fc.close();


        __CLR4_5_2hxlhxllvlulpvx.R.inc(23312);IsoFile isoFile = new IsoFile(f.getAbsolutePath());

        __CLR4_5_2hxlhxllvlulpvx.R.inc(23313);ItemLocationBox iloc = (ItemLocationBox) isoFile.getBoxes().get(0);

        __CLR4_5_2hxlhxllvlulpvx.R.inc(23314);Assert.assertEquals(ilocOrig.getBaseOffsetSize(), iloc.getBaseOffsetSize());
        __CLR4_5_2hxlhxllvlulpvx.R.inc(23315);Assert.assertEquals(ilocOrig.getContentSize(), iloc.getContentSize());
        __CLR4_5_2hxlhxllvlulpvx.R.inc(23316);Assert.assertEquals(ilocOrig.getIndexSize(), iloc.getIndexSize());
        __CLR4_5_2hxlhxllvlulpvx.R.inc(23317);Assert.assertEquals(ilocOrig.getLengthSize(), iloc.getLengthSize());
        __CLR4_5_2hxlhxllvlulpvx.R.inc(23318);Assert.assertEquals(ilocOrig.getOffsetSize(), iloc.getOffsetSize());
        __CLR4_5_2hxlhxllvlulpvx.R.inc(23319);Assert.assertEquals(ilocOrig.getItems(), iloc.getItems());


    }finally{__CLR4_5_2hxlhxllvlulpvx.R.flushNeeded();}}

    @Test
    public void testExtent() throws IOException {__CLR4_5_2hxlhxllvlulpvx.R.globalSliceStart(getClass().getName(),23320);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28o39ybhzs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2hxlhxllvlulpvx.R.rethrow($CLV_t2$);}finally{__CLR4_5_2hxlhxllvlulpvx.R.globalSliceEnd(getClass().getName(),"com.coremedia.iso.boxes.ItemLocationBoxTest.testExtent",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23320,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28o39ybhzs() throws IOException{try{__CLR4_5_2hxlhxllvlulpvx.R.inc(23320);
        __CLR4_5_2hxlhxllvlulpvx.R.inc(23321);testExtent(1, 2, 4, 8);
        __CLR4_5_2hxlhxllvlulpvx.R.inc(23322);testExtent(2, 4, 8, 1);
        __CLR4_5_2hxlhxllvlulpvx.R.inc(23323);testExtent(4, 8, 1, 2);
        __CLR4_5_2hxlhxllvlulpvx.R.inc(23324);testExtent(8, 1, 2, 4);
    }finally{__CLR4_5_2hxlhxllvlulpvx.R.flushNeeded();}}

    public void testExtent(int a, int b, int c, int d) throws IOException {try{__CLR4_5_2hxlhxllvlulpvx.R.inc(23325);
        __CLR4_5_2hxlhxllvlulpvx.R.inc(23326);ItemLocationBox iloc = new ItemLocationBox();
        __CLR4_5_2hxlhxllvlulpvx.R.inc(23327);iloc.setVersion(1);
        __CLR4_5_2hxlhxllvlulpvx.R.inc(23328);iloc.setBaseOffsetSize(a);
        __CLR4_5_2hxlhxllvlulpvx.R.inc(23329);iloc.setIndexSize(b);
        __CLR4_5_2hxlhxllvlulpvx.R.inc(23330);iloc.setLengthSize(c);
        __CLR4_5_2hxlhxllvlulpvx.R.inc(23331);iloc.setOffsetSize(d);
        __CLR4_5_2hxlhxllvlulpvx.R.inc(23332);ItemLocationBox.Extent e1 = iloc.createExtent(123, 124, 125);
        __CLR4_5_2hxlhxllvlulpvx.R.inc(23333);ByteBuffer bb = ByteBuffer.allocate(e1.getSize());
        __CLR4_5_2hxlhxllvlulpvx.R.inc(23334);e1.getContent(bb);
        __CLR4_5_2hxlhxllvlulpvx.R.inc(23335);Assert.assertTrue(bb.remaining() == 0);
        __CLR4_5_2hxlhxllvlulpvx.R.inc(23336);bb.rewind();
        __CLR4_5_2hxlhxllvlulpvx.R.inc(23337);ItemLocationBox.Extent e2 = iloc.createExtent(bb);

        __CLR4_5_2hxlhxllvlulpvx.R.inc(23338);Assert.assertEquals(e1, e2);


    }finally{__CLR4_5_2hxlhxllvlulpvx.R.flushNeeded();}}

    @Test
    public void testItem() throws IOException {__CLR4_5_2hxlhxllvlulpvx.R.globalSliceStart(getClass().getName(),23339);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mvbrtgi0b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2hxlhxllvlulpvx.R.rethrow($CLV_t2$);}finally{__CLR4_5_2hxlhxllvlulpvx.R.globalSliceEnd(getClass().getName(),"com.coremedia.iso.boxes.ItemLocationBoxTest.testItem",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23339,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mvbrtgi0b() throws IOException{try{__CLR4_5_2hxlhxllvlulpvx.R.inc(23339);
        __CLR4_5_2hxlhxllvlulpvx.R.inc(23340);testItem(1, 2, 4, 8);
        __CLR4_5_2hxlhxllvlulpvx.R.inc(23341);testItem(2, 4, 8, 1);
        __CLR4_5_2hxlhxllvlulpvx.R.inc(23342);testItem(4, 8, 1, 2);
        __CLR4_5_2hxlhxllvlulpvx.R.inc(23343);testItem(8, 1, 2, 4);
    }finally{__CLR4_5_2hxlhxllvlulpvx.R.flushNeeded();}}

    public void testItem(int a, int b, int c, int d) throws IOException {try{__CLR4_5_2hxlhxllvlulpvx.R.inc(23344);
        __CLR4_5_2hxlhxllvlulpvx.R.inc(23345);ItemLocationBox iloc = new ItemLocationBox();
        __CLR4_5_2hxlhxllvlulpvx.R.inc(23346);iloc.setVersion(1);
        __CLR4_5_2hxlhxllvlulpvx.R.inc(23347);iloc.setBaseOffsetSize(a);
        __CLR4_5_2hxlhxllvlulpvx.R.inc(23348);iloc.setIndexSize(b);
        __CLR4_5_2hxlhxllvlulpvx.R.inc(23349);iloc.setLengthSize(c);
        __CLR4_5_2hxlhxllvlulpvx.R.inc(23350);iloc.setOffsetSize(d);
        __CLR4_5_2hxlhxllvlulpvx.R.inc(23351);ItemLocationBox.Item e1 = iloc.createItem(65, 1, 0, 66, Collections.<ItemLocationBox.Extent>emptyList());
        __CLR4_5_2hxlhxllvlulpvx.R.inc(23352);ByteBuffer bb = ByteBuffer.allocate(e1.getSize());
        __CLR4_5_2hxlhxllvlulpvx.R.inc(23353);e1.getContent(bb);
        __CLR4_5_2hxlhxllvlulpvx.R.inc(23354);Assert.assertTrue(bb.remaining() == 0);
        __CLR4_5_2hxlhxllvlulpvx.R.inc(23355);bb.rewind();
        __CLR4_5_2hxlhxllvlulpvx.R.inc(23356);ItemLocationBox.Item e2 = iloc.createItem(bb);

        __CLR4_5_2hxlhxllvlulpvx.R.inc(23357);Assert.assertEquals(e1, e2);


    }finally{__CLR4_5_2hxlhxllvlulpvx.R.flushNeeded();}}

    @Test
    public void testItemVersionZero() throws IOException {__CLR4_5_2hxlhxllvlulpvx.R.globalSliceStart(getClass().getName(),23358);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2v83edei0u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2hxlhxllvlulpvx.R.rethrow($CLV_t2$);}finally{__CLR4_5_2hxlhxllvlulpvx.R.globalSliceEnd(getClass().getName(),"com.coremedia.iso.boxes.ItemLocationBoxTest.testItemVersionZero",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23358,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2v83edei0u() throws IOException{try{__CLR4_5_2hxlhxllvlulpvx.R.inc(23358);
        __CLR4_5_2hxlhxllvlulpvx.R.inc(23359);testItemVersionZero(1, 2, 4, 8);
        __CLR4_5_2hxlhxllvlulpvx.R.inc(23360);testItemVersionZero(2, 4, 8, 1);
        __CLR4_5_2hxlhxllvlulpvx.R.inc(23361);testItemVersionZero(4, 8, 1, 2);
        __CLR4_5_2hxlhxllvlulpvx.R.inc(23362);testItemVersionZero(8, 1, 2, 4);
    }finally{__CLR4_5_2hxlhxllvlulpvx.R.flushNeeded();}}

    public void testItemVersionZero(int a, int b, int c, int d) throws IOException {try{__CLR4_5_2hxlhxllvlulpvx.R.inc(23363);
        __CLR4_5_2hxlhxllvlulpvx.R.inc(23364);ItemLocationBox iloc = new ItemLocationBox();
        __CLR4_5_2hxlhxllvlulpvx.R.inc(23365);iloc.setVersion(0);
        __CLR4_5_2hxlhxllvlulpvx.R.inc(23366);iloc.setBaseOffsetSize(a);
        __CLR4_5_2hxlhxllvlulpvx.R.inc(23367);iloc.setIndexSize(b);
        __CLR4_5_2hxlhxllvlulpvx.R.inc(23368);iloc.setLengthSize(c);
        __CLR4_5_2hxlhxllvlulpvx.R.inc(23369);iloc.setOffsetSize(d);
        __CLR4_5_2hxlhxllvlulpvx.R.inc(23370);ItemLocationBox.Item e1 = iloc.createItem(65, 0, 1, 66, Collections.<ItemLocationBox.Extent>emptyList());
        __CLR4_5_2hxlhxllvlulpvx.R.inc(23371);ByteBuffer bb = ByteBuffer.allocate(e1.getSize());
        __CLR4_5_2hxlhxllvlulpvx.R.inc(23372);e1.getContent(bb);
        __CLR4_5_2hxlhxllvlulpvx.R.inc(23373);Assert.assertTrue(bb.remaining() == 0);
        __CLR4_5_2hxlhxllvlulpvx.R.inc(23374);bb.rewind();
        __CLR4_5_2hxlhxllvlulpvx.R.inc(23375);ItemLocationBox.Item e2 = iloc.createItem(bb);

        __CLR4_5_2hxlhxllvlulpvx.R.inc(23376);Assert.assertEquals(e1, e2);


    }finally{__CLR4_5_2hxlhxllvlulpvx.R.flushNeeded();}}
}
