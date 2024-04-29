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

public class ItemLocationBoxTest {static class __CLR4_5_2huyhuylvl9em73{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413286414L,8589935092L,23282,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    int[] v = new int[]{1, 2, 4, 8};

    @Test
    public void testSimpleRoundTrip() throws IOException {__CLR4_5_2huyhuylvl9em73.R.globalSliceStart(getClass().getName(),23146);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2v3rm46huy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2huyhuylvl9em73.R.rethrow($CLV_t2$);}finally{__CLR4_5_2huyhuylvl9em73.R.globalSliceEnd(getClass().getName(),"com.coremedia.iso.boxes.ItemLocationBoxTest.testSimpleRoundTrip",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23146,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2v3rm46huy() throws IOException{try{__CLR4_5_2huyhuylvl9em73.R.inc(23146);
        __CLR4_5_2huyhuylvl9em73.R.inc(23147);for (int i : v) {{
            __CLR4_5_2huyhuylvl9em73.R.inc(23148);for (int i1 : v) {{
                __CLR4_5_2huyhuylvl9em73.R.inc(23149);for (int i2 : v) {{
                    __CLR4_5_2huyhuylvl9em73.R.inc(23150);for (int i3 : v) {{
                        __CLR4_5_2huyhuylvl9em73.R.inc(23151);testSimpleRoundTrip(i, i1, i2, i3);
                    }
                }}
            }}
        }}

    }}finally{__CLR4_5_2huyhuylvl9em73.R.flushNeeded();}}

    public void testSimpleRoundTrip(int baseOffsetSize, int indexSize, int lengthSize, int offsetSize) throws IOException {try{__CLR4_5_2huyhuylvl9em73.R.inc(23152);
        __CLR4_5_2huyhuylvl9em73.R.inc(23153);ItemLocationBox ilocOrig = new ItemLocationBox();
        __CLR4_5_2huyhuylvl9em73.R.inc(23154);ilocOrig.setVersion(1);
        __CLR4_5_2huyhuylvl9em73.R.inc(23155);ilocOrig.setBaseOffsetSize(baseOffsetSize);
        __CLR4_5_2huyhuylvl9em73.R.inc(23156);ilocOrig.setIndexSize(indexSize);
        __CLR4_5_2huyhuylvl9em73.R.inc(23157);ilocOrig.setLengthSize(lengthSize);
        __CLR4_5_2huyhuylvl9em73.R.inc(23158);ilocOrig.setOffsetSize(offsetSize);

        __CLR4_5_2huyhuylvl9em73.R.inc(23159);ByteArrayOutputStream baos = new ByteArrayOutputStream();


        __CLR4_5_2huyhuylvl9em73.R.inc(23160);ilocOrig.getBox(Channels.newChannel(baos));



        __CLR4_5_2huyhuylvl9em73.R.inc(23161);IsoFile isoFile = new IsoFile(new MemoryDataSourceImpl(baos.toByteArray()));

        __CLR4_5_2huyhuylvl9em73.R.inc(23162);ItemLocationBox iloc = (ItemLocationBox) isoFile.getBoxes().get(0);

        __CLR4_5_2huyhuylvl9em73.R.inc(23163);Assert.assertEquals(ilocOrig.getBaseOffsetSize(), iloc.getBaseOffsetSize());
        __CLR4_5_2huyhuylvl9em73.R.inc(23164);Assert.assertEquals(ilocOrig.getContentSize(), iloc.getContentSize());
        __CLR4_5_2huyhuylvl9em73.R.inc(23165);Assert.assertEquals(ilocOrig.getIndexSize(), iloc.getIndexSize());
        __CLR4_5_2huyhuylvl9em73.R.inc(23166);Assert.assertEquals(ilocOrig.getLengthSize(), iloc.getLengthSize());
        __CLR4_5_2huyhuylvl9em73.R.inc(23167);Assert.assertEquals(ilocOrig.getOffsetSize(), iloc.getOffsetSize());
        __CLR4_5_2huyhuylvl9em73.R.inc(23168);Assert.assertEquals(ilocOrig.getItems(), iloc.getItems());


    }finally{__CLR4_5_2huyhuylvl9em73.R.flushNeeded();}}


    @Test
    public void testSimpleRoundWithEntriesTrip() throws IOException {__CLR4_5_2huyhuylvl9em73.R.globalSliceStart(getClass().getName(),23169);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ic2fschvl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2huyhuylvl9em73.R.rethrow($CLV_t2$);}finally{__CLR4_5_2huyhuylvl9em73.R.globalSliceEnd(getClass().getName(),"com.coremedia.iso.boxes.ItemLocationBoxTest.testSimpleRoundWithEntriesTrip",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23169,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ic2fschvl() throws IOException{try{__CLR4_5_2huyhuylvl9em73.R.inc(23169);
        __CLR4_5_2huyhuylvl9em73.R.inc(23170);for (int i : v) {{
            __CLR4_5_2huyhuylvl9em73.R.inc(23171);for (int i1 : v) {{
                __CLR4_5_2huyhuylvl9em73.R.inc(23172);for (int i2 : v) {{
                    __CLR4_5_2huyhuylvl9em73.R.inc(23173);for (int i3 : v) {{
                        __CLR4_5_2huyhuylvl9em73.R.inc(23174);testSimpleRoundWithEntriesTrip(i, i1, i2, i3);
                    }
                }}
            }}
        }}
    }}finally{__CLR4_5_2huyhuylvl9em73.R.flushNeeded();}}

    public void testSimpleRoundWithEntriesTrip(int baseOffsetSize, int indexSize, int lengthSize, int offsetSize) throws IOException {try{__CLR4_5_2huyhuylvl9em73.R.inc(23175);
        __CLR4_5_2huyhuylvl9em73.R.inc(23176);ItemLocationBox ilocOrig = new ItemLocationBox();
        __CLR4_5_2huyhuylvl9em73.R.inc(23177);ilocOrig.setVersion(1);
        __CLR4_5_2huyhuylvl9em73.R.inc(23178);ilocOrig.setBaseOffsetSize(baseOffsetSize);
        __CLR4_5_2huyhuylvl9em73.R.inc(23179);ilocOrig.setIndexSize(indexSize);
        __CLR4_5_2huyhuylvl9em73.R.inc(23180);ilocOrig.setLengthSize(lengthSize);
        __CLR4_5_2huyhuylvl9em73.R.inc(23181);ilocOrig.setOffsetSize(offsetSize);
        __CLR4_5_2huyhuylvl9em73.R.inc(23182);ItemLocationBox.Item item = ilocOrig.createItem(12, 0, 13, 123, Collections.<ItemLocationBox.Extent>emptyList());
        __CLR4_5_2huyhuylvl9em73.R.inc(23183);ilocOrig.setItems(Collections.singletonList(item));
        __CLR4_5_2huyhuylvl9em73.R.inc(23184);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_5_2huyhuylvl9em73.R.inc(23185);ilocOrig.getBox(Channels.newChannel(baos));

        __CLR4_5_2huyhuylvl9em73.R.inc(23186);IsoFile isoFile = new IsoFile(new MemoryDataSourceImpl(baos.toByteArray()));

        __CLR4_5_2huyhuylvl9em73.R.inc(23187);ItemLocationBox iloc = (ItemLocationBox) isoFile.getBoxes().get(0);

        __CLR4_5_2huyhuylvl9em73.R.inc(23188);Assert.assertEquals(ilocOrig.getBaseOffsetSize(), iloc.getBaseOffsetSize());
        __CLR4_5_2huyhuylvl9em73.R.inc(23189);Assert.assertEquals(ilocOrig.getContentSize(), iloc.getContentSize());
        __CLR4_5_2huyhuylvl9em73.R.inc(23190);Assert.assertEquals(ilocOrig.getIndexSize(), iloc.getIndexSize());
        __CLR4_5_2huyhuylvl9em73.R.inc(23191);Assert.assertEquals(ilocOrig.getLengthSize(), iloc.getLengthSize());
        __CLR4_5_2huyhuylvl9em73.R.inc(23192);Assert.assertEquals(ilocOrig.getOffsetSize(), iloc.getOffsetSize());
        __CLR4_5_2huyhuylvl9em73.R.inc(23193);Assert.assertEquals(ilocOrig.getItems(), iloc.getItems());


    }finally{__CLR4_5_2huyhuylvl9em73.R.flushNeeded();}}

    @Test
    public void testSimpleRoundWithEntriesAndExtentsTrip() throws IOException {__CLR4_5_2huyhuylvl9em73.R.globalSliceStart(getClass().getName(),23194);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2anxipqhwa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2huyhuylvl9em73.R.rethrow($CLV_t2$);}finally{__CLR4_5_2huyhuylvl9em73.R.globalSliceEnd(getClass().getName(),"com.coremedia.iso.boxes.ItemLocationBoxTest.testSimpleRoundWithEntriesAndExtentsTrip",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23194,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2anxipqhwa() throws IOException{try{__CLR4_5_2huyhuylvl9em73.R.inc(23194);
        __CLR4_5_2huyhuylvl9em73.R.inc(23195);for (int i : v) {{
            __CLR4_5_2huyhuylvl9em73.R.inc(23196);for (int i1 : v) {{
                __CLR4_5_2huyhuylvl9em73.R.inc(23197);for (int i2 : v) {{
                    __CLR4_5_2huyhuylvl9em73.R.inc(23198);for (int i3 : v) {{
                        __CLR4_5_2huyhuylvl9em73.R.inc(23199);testSimpleRoundWithEntriesAndExtentsTrip(i, i1, i2, i3);
                    }
                }}
            }}
        }}
    }}finally{__CLR4_5_2huyhuylvl9em73.R.flushNeeded();}}

    public void testSimpleRoundWithEntriesAndExtentsTrip(int baseOffsetSize, int indexSize, int lengthSize, int offsetSize) throws IOException {try{__CLR4_5_2huyhuylvl9em73.R.inc(23200);
        __CLR4_5_2huyhuylvl9em73.R.inc(23201);ItemLocationBox ilocOrig = new ItemLocationBox();
        __CLR4_5_2huyhuylvl9em73.R.inc(23202);ilocOrig.setVersion(1);
        __CLR4_5_2huyhuylvl9em73.R.inc(23203);ilocOrig.setBaseOffsetSize(baseOffsetSize);
        __CLR4_5_2huyhuylvl9em73.R.inc(23204);ilocOrig.setIndexSize(indexSize);
        __CLR4_5_2huyhuylvl9em73.R.inc(23205);ilocOrig.setLengthSize(lengthSize);
        __CLR4_5_2huyhuylvl9em73.R.inc(23206);ilocOrig.setOffsetSize(offsetSize);
        __CLR4_5_2huyhuylvl9em73.R.inc(23207);List<ItemLocationBox.Extent> extents = new LinkedList<ItemLocationBox.Extent>();
        __CLR4_5_2huyhuylvl9em73.R.inc(23208);ItemLocationBox.Extent extent = ilocOrig.createExtent(12, 13, 1);
        __CLR4_5_2huyhuylvl9em73.R.inc(23209);extents.add(extent);
        __CLR4_5_2huyhuylvl9em73.R.inc(23210);ItemLocationBox.Item item = ilocOrig.createItem(12, 0, 13, 123, extents);
        __CLR4_5_2huyhuylvl9em73.R.inc(23211);ilocOrig.setItems(Collections.singletonList(item));
        __CLR4_5_2huyhuylvl9em73.R.inc(23212);File f = File.createTempFile(this.getClass().getSimpleName(), "");
        __CLR4_5_2huyhuylvl9em73.R.inc(23213);f.deleteOnExit();
        __CLR4_5_2huyhuylvl9em73.R.inc(23214);FileChannel fc = new FileOutputStream(f).getChannel();
        __CLR4_5_2huyhuylvl9em73.R.inc(23215);ilocOrig.getBox(fc);
        __CLR4_5_2huyhuylvl9em73.R.inc(23216);fc.close();


        __CLR4_5_2huyhuylvl9em73.R.inc(23217);IsoFile isoFile = new IsoFile(f.getAbsolutePath());

        __CLR4_5_2huyhuylvl9em73.R.inc(23218);ItemLocationBox iloc = (ItemLocationBox) isoFile.getBoxes().get(0);

        __CLR4_5_2huyhuylvl9em73.R.inc(23219);Assert.assertEquals(ilocOrig.getBaseOffsetSize(), iloc.getBaseOffsetSize());
        __CLR4_5_2huyhuylvl9em73.R.inc(23220);Assert.assertEquals(ilocOrig.getContentSize(), iloc.getContentSize());
        __CLR4_5_2huyhuylvl9em73.R.inc(23221);Assert.assertEquals(ilocOrig.getIndexSize(), iloc.getIndexSize());
        __CLR4_5_2huyhuylvl9em73.R.inc(23222);Assert.assertEquals(ilocOrig.getLengthSize(), iloc.getLengthSize());
        __CLR4_5_2huyhuylvl9em73.R.inc(23223);Assert.assertEquals(ilocOrig.getOffsetSize(), iloc.getOffsetSize());
        __CLR4_5_2huyhuylvl9em73.R.inc(23224);Assert.assertEquals(ilocOrig.getItems(), iloc.getItems());


    }finally{__CLR4_5_2huyhuylvl9em73.R.flushNeeded();}}

    @Test
    public void testExtent() throws IOException {__CLR4_5_2huyhuylvl9em73.R.globalSliceStart(getClass().getName(),23225);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28o39ybhx5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2huyhuylvl9em73.R.rethrow($CLV_t2$);}finally{__CLR4_5_2huyhuylvl9em73.R.globalSliceEnd(getClass().getName(),"com.coremedia.iso.boxes.ItemLocationBoxTest.testExtent",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23225,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28o39ybhx5() throws IOException{try{__CLR4_5_2huyhuylvl9em73.R.inc(23225);
        __CLR4_5_2huyhuylvl9em73.R.inc(23226);testExtent(1, 2, 4, 8);
        __CLR4_5_2huyhuylvl9em73.R.inc(23227);testExtent(2, 4, 8, 1);
        __CLR4_5_2huyhuylvl9em73.R.inc(23228);testExtent(4, 8, 1, 2);
        __CLR4_5_2huyhuylvl9em73.R.inc(23229);testExtent(8, 1, 2, 4);
    }finally{__CLR4_5_2huyhuylvl9em73.R.flushNeeded();}}

    public void testExtent(int a, int b, int c, int d) throws IOException {try{__CLR4_5_2huyhuylvl9em73.R.inc(23230);
        __CLR4_5_2huyhuylvl9em73.R.inc(23231);ItemLocationBox iloc = new ItemLocationBox();
        __CLR4_5_2huyhuylvl9em73.R.inc(23232);iloc.setVersion(1);
        __CLR4_5_2huyhuylvl9em73.R.inc(23233);iloc.setBaseOffsetSize(a);
        __CLR4_5_2huyhuylvl9em73.R.inc(23234);iloc.setIndexSize(b);
        __CLR4_5_2huyhuylvl9em73.R.inc(23235);iloc.setLengthSize(c);
        __CLR4_5_2huyhuylvl9em73.R.inc(23236);iloc.setOffsetSize(d);
        __CLR4_5_2huyhuylvl9em73.R.inc(23237);ItemLocationBox.Extent e1 = iloc.createExtent(123, 124, 125);
        __CLR4_5_2huyhuylvl9em73.R.inc(23238);ByteBuffer bb = ByteBuffer.allocate(e1.getSize());
        __CLR4_5_2huyhuylvl9em73.R.inc(23239);e1.getContent(bb);
        __CLR4_5_2huyhuylvl9em73.R.inc(23240);Assert.assertTrue(bb.remaining() == 0);
        __CLR4_5_2huyhuylvl9em73.R.inc(23241);bb.rewind();
        __CLR4_5_2huyhuylvl9em73.R.inc(23242);ItemLocationBox.Extent e2 = iloc.createExtent(bb);

        __CLR4_5_2huyhuylvl9em73.R.inc(23243);Assert.assertEquals(e1, e2);


    }finally{__CLR4_5_2huyhuylvl9em73.R.flushNeeded();}}

    @Test
    public void testItem() throws IOException {__CLR4_5_2huyhuylvl9em73.R.globalSliceStart(getClass().getName(),23244);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mvbrtghxo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2huyhuylvl9em73.R.rethrow($CLV_t2$);}finally{__CLR4_5_2huyhuylvl9em73.R.globalSliceEnd(getClass().getName(),"com.coremedia.iso.boxes.ItemLocationBoxTest.testItem",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23244,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mvbrtghxo() throws IOException{try{__CLR4_5_2huyhuylvl9em73.R.inc(23244);
        __CLR4_5_2huyhuylvl9em73.R.inc(23245);testItem(1, 2, 4, 8);
        __CLR4_5_2huyhuylvl9em73.R.inc(23246);testItem(2, 4, 8, 1);
        __CLR4_5_2huyhuylvl9em73.R.inc(23247);testItem(4, 8, 1, 2);
        __CLR4_5_2huyhuylvl9em73.R.inc(23248);testItem(8, 1, 2, 4);
    }finally{__CLR4_5_2huyhuylvl9em73.R.flushNeeded();}}

    public void testItem(int a, int b, int c, int d) throws IOException {try{__CLR4_5_2huyhuylvl9em73.R.inc(23249);
        __CLR4_5_2huyhuylvl9em73.R.inc(23250);ItemLocationBox iloc = new ItemLocationBox();
        __CLR4_5_2huyhuylvl9em73.R.inc(23251);iloc.setVersion(1);
        __CLR4_5_2huyhuylvl9em73.R.inc(23252);iloc.setBaseOffsetSize(a);
        __CLR4_5_2huyhuylvl9em73.R.inc(23253);iloc.setIndexSize(b);
        __CLR4_5_2huyhuylvl9em73.R.inc(23254);iloc.setLengthSize(c);
        __CLR4_5_2huyhuylvl9em73.R.inc(23255);iloc.setOffsetSize(d);
        __CLR4_5_2huyhuylvl9em73.R.inc(23256);ItemLocationBox.Item e1 = iloc.createItem(65, 1, 0, 66, Collections.<ItemLocationBox.Extent>emptyList());
        __CLR4_5_2huyhuylvl9em73.R.inc(23257);ByteBuffer bb = ByteBuffer.allocate(e1.getSize());
        __CLR4_5_2huyhuylvl9em73.R.inc(23258);e1.getContent(bb);
        __CLR4_5_2huyhuylvl9em73.R.inc(23259);Assert.assertTrue(bb.remaining() == 0);
        __CLR4_5_2huyhuylvl9em73.R.inc(23260);bb.rewind();
        __CLR4_5_2huyhuylvl9em73.R.inc(23261);ItemLocationBox.Item e2 = iloc.createItem(bb);

        __CLR4_5_2huyhuylvl9em73.R.inc(23262);Assert.assertEquals(e1, e2);


    }finally{__CLR4_5_2huyhuylvl9em73.R.flushNeeded();}}

    @Test
    public void testItemVersionZero() throws IOException {__CLR4_5_2huyhuylvl9em73.R.globalSliceStart(getClass().getName(),23263);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2v83edehy7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2huyhuylvl9em73.R.rethrow($CLV_t2$);}finally{__CLR4_5_2huyhuylvl9em73.R.globalSliceEnd(getClass().getName(),"com.coremedia.iso.boxes.ItemLocationBoxTest.testItemVersionZero",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23263,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2v83edehy7() throws IOException{try{__CLR4_5_2huyhuylvl9em73.R.inc(23263);
        __CLR4_5_2huyhuylvl9em73.R.inc(23264);testItemVersionZero(1, 2, 4, 8);
        __CLR4_5_2huyhuylvl9em73.R.inc(23265);testItemVersionZero(2, 4, 8, 1);
        __CLR4_5_2huyhuylvl9em73.R.inc(23266);testItemVersionZero(4, 8, 1, 2);
        __CLR4_5_2huyhuylvl9em73.R.inc(23267);testItemVersionZero(8, 1, 2, 4);
    }finally{__CLR4_5_2huyhuylvl9em73.R.flushNeeded();}}

    public void testItemVersionZero(int a, int b, int c, int d) throws IOException {try{__CLR4_5_2huyhuylvl9em73.R.inc(23268);
        __CLR4_5_2huyhuylvl9em73.R.inc(23269);ItemLocationBox iloc = new ItemLocationBox();
        __CLR4_5_2huyhuylvl9em73.R.inc(23270);iloc.setVersion(0);
        __CLR4_5_2huyhuylvl9em73.R.inc(23271);iloc.setBaseOffsetSize(a);
        __CLR4_5_2huyhuylvl9em73.R.inc(23272);iloc.setIndexSize(b);
        __CLR4_5_2huyhuylvl9em73.R.inc(23273);iloc.setLengthSize(c);
        __CLR4_5_2huyhuylvl9em73.R.inc(23274);iloc.setOffsetSize(d);
        __CLR4_5_2huyhuylvl9em73.R.inc(23275);ItemLocationBox.Item e1 = iloc.createItem(65, 0, 1, 66, Collections.<ItemLocationBox.Extent>emptyList());
        __CLR4_5_2huyhuylvl9em73.R.inc(23276);ByteBuffer bb = ByteBuffer.allocate(e1.getSize());
        __CLR4_5_2huyhuylvl9em73.R.inc(23277);e1.getContent(bb);
        __CLR4_5_2huyhuylvl9em73.R.inc(23278);Assert.assertTrue(bb.remaining() == 0);
        __CLR4_5_2huyhuylvl9em73.R.inc(23279);bb.rewind();
        __CLR4_5_2huyhuylvl9em73.R.inc(23280);ItemLocationBox.Item e2 = iloc.createItem(bb);

        __CLR4_5_2huyhuylvl9em73.R.inc(23281);Assert.assertEquals(e1, e2);


    }finally{__CLR4_5_2huyhuylvl9em73.R.flushNeeded();}}
}
