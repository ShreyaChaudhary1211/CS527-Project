/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*  
 * Copyright 2008 CoreMedia AG, Hamburg
 *
 * Licensed under the Apache License, Version 2.0 (the License); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at 
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0 
 * 
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the License is distributed on an AS IS BASIS, 
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and 
 * limitations under the License. 
 */

package com.coremedia.iso.boxes;


import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeReaderVariable;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.IsoTypeWriterVariable;
import com.googlecode.mp4parser.AbstractFullBox;

import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.List;

/**
 * <h1>4cc = "{@value #TYPE}"</h1>
 * <pre>
 * aligned(8) class ItemLocationBox extends FullBox('iloc', version, 0) {
 *  unsigned int(4) offset_size;
 *  unsigned int(4) length_size;
 *  unsigned int(4) base_offset_size;
 *  if (version == 1)
 *   unsigned int(4) index_size;
 *  else
 *   unsigned int(4) reserved;
 *  unsigned int(16) item_count;
 *  for (i=0; i&lt;item_count; i++) {
 *   unsigned int(16) item_ID;
 *   if (version == 1) {
 *    unsigned int(12) reserved = 0;
 *    unsigned int(4) construction_method;
 *   }
 *   unsigned int(16) data_reference_index;
 *   unsigned int(base_offset_size*8) base_offset;
 *   unsigned int(16) extent_count;
 *   for (j=0; j&lt;extent_count; j++) {
 *    if ((version == 1) &amp;&amp; (index_size &gt; 0)) {
 *     unsigned int(index_size*8) extent_index;
 *    }
 *    unsigned int(offset_size*8) extent_offset;
 *    unsigned int(length_size*8) extent_length;
 *   }
 *  }
 * }
 * </pre>
 */
public class ItemLocationBox extends AbstractFullBox {public static class __CLR4_5_2xhxhlvl9eeux{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,1421,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public int offsetSize = 8;
    public int lengthSize = 8;
    public int baseOffsetSize = 8;
    public int indexSize = 0;
    public List<Item> items = new LinkedList<Item>();

    public static final String TYPE = "iloc";

    public ItemLocationBox() {
        super(TYPE);__CLR4_5_2xhxhlvl9eeux.R.inc(1206);try{__CLR4_5_2xhxhlvl9eeux.R.inc(1205);
    }finally{__CLR4_5_2xhxhlvl9eeux.R.flushNeeded();}}

    @Override
    protected long getContentSize() {try{__CLR4_5_2xhxhlvl9eeux.R.inc(1207);
        __CLR4_5_2xhxhlvl9eeux.R.inc(1208);long size = 8;
        __CLR4_5_2xhxhlvl9eeux.R.inc(1209);for (Item item : items) {{
            __CLR4_5_2xhxhlvl9eeux.R.inc(1210);size += item.getSize();
        }
        }__CLR4_5_2xhxhlvl9eeux.R.inc(1211);return size;
    }finally{__CLR4_5_2xhxhlvl9eeux.R.flushNeeded();}}


    @Override
    protected void getContent(ByteBuffer byteBuffer) {try{__CLR4_5_2xhxhlvl9eeux.R.inc(1212);
        __CLR4_5_2xhxhlvl9eeux.R.inc(1213);writeVersionAndFlags(byteBuffer);
        __CLR4_5_2xhxhlvl9eeux.R.inc(1214);IsoTypeWriter.writeUInt8(byteBuffer, ((offsetSize << 4) | lengthSize));
        __CLR4_5_2xhxhlvl9eeux.R.inc(1215);if ((((getVersion() == 1)&&(__CLR4_5_2xhxhlvl9eeux.R.iget(1216)!=0|true))||(__CLR4_5_2xhxhlvl9eeux.R.iget(1217)==0&false))) {{
            __CLR4_5_2xhxhlvl9eeux.R.inc(1218);IsoTypeWriter.writeUInt8(byteBuffer, (baseOffsetSize << 4 | indexSize));
        } }else {{
            __CLR4_5_2xhxhlvl9eeux.R.inc(1219);IsoTypeWriter.writeUInt8(byteBuffer, (baseOffsetSize << 4));
        }
        }__CLR4_5_2xhxhlvl9eeux.R.inc(1220);IsoTypeWriter.writeUInt16(byteBuffer, items.size());
        __CLR4_5_2xhxhlvl9eeux.R.inc(1221);for (Item item : items) {{
            __CLR4_5_2xhxhlvl9eeux.R.inc(1222);item.getContent(byteBuffer);
        }
    }}finally{__CLR4_5_2xhxhlvl9eeux.R.flushNeeded();}}

    @Override
    public void _parseDetails(ByteBuffer content) {try{__CLR4_5_2xhxhlvl9eeux.R.inc(1223);
        __CLR4_5_2xhxhlvl9eeux.R.inc(1224);parseVersionAndFlags(content);
        __CLR4_5_2xhxhlvl9eeux.R.inc(1225);int tmp = IsoTypeReader.readUInt8(content);
        __CLR4_5_2xhxhlvl9eeux.R.inc(1226);offsetSize = tmp >>> 4;
        __CLR4_5_2xhxhlvl9eeux.R.inc(1227);lengthSize = tmp & 0xf;
        __CLR4_5_2xhxhlvl9eeux.R.inc(1228);tmp = IsoTypeReader.readUInt8(content);
        __CLR4_5_2xhxhlvl9eeux.R.inc(1229);baseOffsetSize = tmp >>> 4;

        __CLR4_5_2xhxhlvl9eeux.R.inc(1230);if ((((getVersion() == 1)&&(__CLR4_5_2xhxhlvl9eeux.R.iget(1231)!=0|true))||(__CLR4_5_2xhxhlvl9eeux.R.iget(1232)==0&false))) {{
            __CLR4_5_2xhxhlvl9eeux.R.inc(1233);indexSize = tmp & 0xf;
        }
        }__CLR4_5_2xhxhlvl9eeux.R.inc(1234);int itemCount = IsoTypeReader.readUInt16(content);
        __CLR4_5_2xhxhlvl9eeux.R.inc(1235);for (int i = 0; (((i < itemCount)&&(__CLR4_5_2xhxhlvl9eeux.R.iget(1236)!=0|true))||(__CLR4_5_2xhxhlvl9eeux.R.iget(1237)==0&false)); i++) {{
            __CLR4_5_2xhxhlvl9eeux.R.inc(1238);items.add(new Item(content));
        }
    }}finally{__CLR4_5_2xhxhlvl9eeux.R.flushNeeded();}}


    public int getOffsetSize() {try{__CLR4_5_2xhxhlvl9eeux.R.inc(1239);
        __CLR4_5_2xhxhlvl9eeux.R.inc(1240);return offsetSize;
    }finally{__CLR4_5_2xhxhlvl9eeux.R.flushNeeded();}}

    public void setOffsetSize(int offsetSize) {try{__CLR4_5_2xhxhlvl9eeux.R.inc(1241);
        __CLR4_5_2xhxhlvl9eeux.R.inc(1242);this.offsetSize = offsetSize;
    }finally{__CLR4_5_2xhxhlvl9eeux.R.flushNeeded();}}

    public int getLengthSize() {try{__CLR4_5_2xhxhlvl9eeux.R.inc(1243);
        __CLR4_5_2xhxhlvl9eeux.R.inc(1244);return lengthSize;
    }finally{__CLR4_5_2xhxhlvl9eeux.R.flushNeeded();}}

    public void setLengthSize(int lengthSize) {try{__CLR4_5_2xhxhlvl9eeux.R.inc(1245);
        __CLR4_5_2xhxhlvl9eeux.R.inc(1246);this.lengthSize = lengthSize;
    }finally{__CLR4_5_2xhxhlvl9eeux.R.flushNeeded();}}

    public int getBaseOffsetSize() {try{__CLR4_5_2xhxhlvl9eeux.R.inc(1247);
        __CLR4_5_2xhxhlvl9eeux.R.inc(1248);return baseOffsetSize;
    }finally{__CLR4_5_2xhxhlvl9eeux.R.flushNeeded();}}

    public void setBaseOffsetSize(int baseOffsetSize) {try{__CLR4_5_2xhxhlvl9eeux.R.inc(1249);
        __CLR4_5_2xhxhlvl9eeux.R.inc(1250);this.baseOffsetSize = baseOffsetSize;
    }finally{__CLR4_5_2xhxhlvl9eeux.R.flushNeeded();}}

    public int getIndexSize() {try{__CLR4_5_2xhxhlvl9eeux.R.inc(1251);
        __CLR4_5_2xhxhlvl9eeux.R.inc(1252);return indexSize;
    }finally{__CLR4_5_2xhxhlvl9eeux.R.flushNeeded();}}

    public void setIndexSize(int indexSize) {try{__CLR4_5_2xhxhlvl9eeux.R.inc(1253);
        __CLR4_5_2xhxhlvl9eeux.R.inc(1254);this.indexSize = indexSize;
    }finally{__CLR4_5_2xhxhlvl9eeux.R.flushNeeded();}}

    public List<Item> getItems() {try{__CLR4_5_2xhxhlvl9eeux.R.inc(1255);
        __CLR4_5_2xhxhlvl9eeux.R.inc(1256);return items;
    }finally{__CLR4_5_2xhxhlvl9eeux.R.flushNeeded();}}

    public void setItems(List<Item> items) {try{__CLR4_5_2xhxhlvl9eeux.R.inc(1257);
        __CLR4_5_2xhxhlvl9eeux.R.inc(1258);this.items = items;
    }finally{__CLR4_5_2xhxhlvl9eeux.R.flushNeeded();}}


    public Item createItem(int itemId, int constructionMethod, int dataReferenceIndex, long baseOffset, List<Extent> extents) {try{__CLR4_5_2xhxhlvl9eeux.R.inc(1259);
        __CLR4_5_2xhxhlvl9eeux.R.inc(1260);return new Item(itemId, constructionMethod, dataReferenceIndex, baseOffset, extents);
    }finally{__CLR4_5_2xhxhlvl9eeux.R.flushNeeded();}}

    Item createItem(ByteBuffer bb) {try{__CLR4_5_2xhxhlvl9eeux.R.inc(1261);
        __CLR4_5_2xhxhlvl9eeux.R.inc(1262);return new Item(bb);
    }finally{__CLR4_5_2xhxhlvl9eeux.R.flushNeeded();}}

    public class Item {
        public int itemId;
        public int constructionMethod;
        public int dataReferenceIndex;
        public long baseOffset;
        public List<Extent> extents = new LinkedList<Extent>();

        public Item(ByteBuffer in) {try{__CLR4_5_2xhxhlvl9eeux.R.inc(1263);
            __CLR4_5_2xhxhlvl9eeux.R.inc(1264);itemId = IsoTypeReader.readUInt16(in);

            __CLR4_5_2xhxhlvl9eeux.R.inc(1265);if ((((getVersion() == 1)&&(__CLR4_5_2xhxhlvl9eeux.R.iget(1266)!=0|true))||(__CLR4_5_2xhxhlvl9eeux.R.iget(1267)==0&false))) {{
                __CLR4_5_2xhxhlvl9eeux.R.inc(1268);int tmp = IsoTypeReader.readUInt16(in);
                __CLR4_5_2xhxhlvl9eeux.R.inc(1269);constructionMethod = tmp & 0xf;
            }

            }__CLR4_5_2xhxhlvl9eeux.R.inc(1270);dataReferenceIndex = IsoTypeReader.readUInt16(in);
            __CLR4_5_2xhxhlvl9eeux.R.inc(1271);if ((((baseOffsetSize > 0)&&(__CLR4_5_2xhxhlvl9eeux.R.iget(1272)!=0|true))||(__CLR4_5_2xhxhlvl9eeux.R.iget(1273)==0&false))) {{
                __CLR4_5_2xhxhlvl9eeux.R.inc(1274);baseOffset = IsoTypeReaderVariable.read(in, baseOffsetSize);
            } }else {{
                __CLR4_5_2xhxhlvl9eeux.R.inc(1275);baseOffset = 0;
            }
            }__CLR4_5_2xhxhlvl9eeux.R.inc(1276);int extentCount = IsoTypeReader.readUInt16(in);


            __CLR4_5_2xhxhlvl9eeux.R.inc(1277);for (int i = 0; (((i < extentCount)&&(__CLR4_5_2xhxhlvl9eeux.R.iget(1278)!=0|true))||(__CLR4_5_2xhxhlvl9eeux.R.iget(1279)==0&false)); i++) {{
                __CLR4_5_2xhxhlvl9eeux.R.inc(1280);extents.add(new Extent(in));
            }
        }}finally{__CLR4_5_2xhxhlvl9eeux.R.flushNeeded();}}

        public Item(int itemId, int constructionMethod, int dataReferenceIndex, long baseOffset, List<Extent> extents) {try{__CLR4_5_2xhxhlvl9eeux.R.inc(1281);
            __CLR4_5_2xhxhlvl9eeux.R.inc(1282);this.itemId = itemId;
            __CLR4_5_2xhxhlvl9eeux.R.inc(1283);this.constructionMethod = constructionMethod;
            __CLR4_5_2xhxhlvl9eeux.R.inc(1284);this.dataReferenceIndex = dataReferenceIndex;
            __CLR4_5_2xhxhlvl9eeux.R.inc(1285);this.baseOffset = baseOffset;
            __CLR4_5_2xhxhlvl9eeux.R.inc(1286);this.extents = extents;
        }finally{__CLR4_5_2xhxhlvl9eeux.R.flushNeeded();}}

        public int getSize() {try{__CLR4_5_2xhxhlvl9eeux.R.inc(1287);
            __CLR4_5_2xhxhlvl9eeux.R.inc(1288);int size = 2;

            __CLR4_5_2xhxhlvl9eeux.R.inc(1289);if ((((getVersion() == 1)&&(__CLR4_5_2xhxhlvl9eeux.R.iget(1290)!=0|true))||(__CLR4_5_2xhxhlvl9eeux.R.iget(1291)==0&false))) {{
                __CLR4_5_2xhxhlvl9eeux.R.inc(1292);size += 2;
            }

            }__CLR4_5_2xhxhlvl9eeux.R.inc(1293);size += 2;
            __CLR4_5_2xhxhlvl9eeux.R.inc(1294);size += baseOffsetSize;
            __CLR4_5_2xhxhlvl9eeux.R.inc(1295);size += 2;


            __CLR4_5_2xhxhlvl9eeux.R.inc(1296);for (Extent extent : extents) {{
                __CLR4_5_2xhxhlvl9eeux.R.inc(1297);size += extent.getSize();
            }
            }__CLR4_5_2xhxhlvl9eeux.R.inc(1298);return size;
        }finally{__CLR4_5_2xhxhlvl9eeux.R.flushNeeded();}}

        public void setBaseOffset(long baseOffset) {try{__CLR4_5_2xhxhlvl9eeux.R.inc(1299);
            __CLR4_5_2xhxhlvl9eeux.R.inc(1300);this.baseOffset = baseOffset;
        }finally{__CLR4_5_2xhxhlvl9eeux.R.flushNeeded();}}

        public void getContent(ByteBuffer bb) {try{__CLR4_5_2xhxhlvl9eeux.R.inc(1301);
            __CLR4_5_2xhxhlvl9eeux.R.inc(1302);IsoTypeWriter.writeUInt16(bb, itemId);

            __CLR4_5_2xhxhlvl9eeux.R.inc(1303);if ((((getVersion() == 1)&&(__CLR4_5_2xhxhlvl9eeux.R.iget(1304)!=0|true))||(__CLR4_5_2xhxhlvl9eeux.R.iget(1305)==0&false))) {{
                __CLR4_5_2xhxhlvl9eeux.R.inc(1306);IsoTypeWriter.writeUInt16(bb, constructionMethod);
            }


            }__CLR4_5_2xhxhlvl9eeux.R.inc(1307);IsoTypeWriter.writeUInt16(bb, dataReferenceIndex);
            __CLR4_5_2xhxhlvl9eeux.R.inc(1308);if ((((baseOffsetSize > 0)&&(__CLR4_5_2xhxhlvl9eeux.R.iget(1309)!=0|true))||(__CLR4_5_2xhxhlvl9eeux.R.iget(1310)==0&false))) {{
                __CLR4_5_2xhxhlvl9eeux.R.inc(1311);IsoTypeWriterVariable.write(baseOffset, bb, baseOffsetSize);
            }
            }__CLR4_5_2xhxhlvl9eeux.R.inc(1312);IsoTypeWriter.writeUInt16(bb, extents.size());

            __CLR4_5_2xhxhlvl9eeux.R.inc(1313);for (Extent extent : extents) {{
                __CLR4_5_2xhxhlvl9eeux.R.inc(1314);extent.getContent(bb);
            }
        }}finally{__CLR4_5_2xhxhlvl9eeux.R.flushNeeded();}}

        @Override
        public boolean equals(Object o) {try{__CLR4_5_2xhxhlvl9eeux.R.inc(1315);
            __CLR4_5_2xhxhlvl9eeux.R.inc(1316);if ((((this == o)&&(__CLR4_5_2xhxhlvl9eeux.R.iget(1317)!=0|true))||(__CLR4_5_2xhxhlvl9eeux.R.iget(1318)==0&false))) {__CLR4_5_2xhxhlvl9eeux.R.inc(1319);return true;
            }__CLR4_5_2xhxhlvl9eeux.R.inc(1320);if ((((o == null || getClass() != o.getClass())&&(__CLR4_5_2xhxhlvl9eeux.R.iget(1321)!=0|true))||(__CLR4_5_2xhxhlvl9eeux.R.iget(1322)==0&false))) {__CLR4_5_2xhxhlvl9eeux.R.inc(1323);return false;

            }__CLR4_5_2xhxhlvl9eeux.R.inc(1324);Item item = (Item) o;

            __CLR4_5_2xhxhlvl9eeux.R.inc(1325);if ((((baseOffset != item.baseOffset)&&(__CLR4_5_2xhxhlvl9eeux.R.iget(1326)!=0|true))||(__CLR4_5_2xhxhlvl9eeux.R.iget(1327)==0&false))) {__CLR4_5_2xhxhlvl9eeux.R.inc(1328);return false;
            }__CLR4_5_2xhxhlvl9eeux.R.inc(1329);if ((((constructionMethod != item.constructionMethod)&&(__CLR4_5_2xhxhlvl9eeux.R.iget(1330)!=0|true))||(__CLR4_5_2xhxhlvl9eeux.R.iget(1331)==0&false))) {__CLR4_5_2xhxhlvl9eeux.R.inc(1332);return false;
            }__CLR4_5_2xhxhlvl9eeux.R.inc(1333);if ((((dataReferenceIndex != item.dataReferenceIndex)&&(__CLR4_5_2xhxhlvl9eeux.R.iget(1334)!=0|true))||(__CLR4_5_2xhxhlvl9eeux.R.iget(1335)==0&false))) {__CLR4_5_2xhxhlvl9eeux.R.inc(1336);return false;
            }__CLR4_5_2xhxhlvl9eeux.R.inc(1337);if ((((itemId != item.itemId)&&(__CLR4_5_2xhxhlvl9eeux.R.iget(1338)!=0|true))||(__CLR4_5_2xhxhlvl9eeux.R.iget(1339)==0&false))) {__CLR4_5_2xhxhlvl9eeux.R.inc(1340);return false;
            }__CLR4_5_2xhxhlvl9eeux.R.inc(1341);if (((((((extents != null )&&(__CLR4_5_2xhxhlvl9eeux.R.iget(1342)!=0|true))||(__CLR4_5_2xhxhlvl9eeux.R.iget(1343)==0&false))? !extents.equals(item.extents) : item.extents != null)&&(__CLR4_5_2xhxhlvl9eeux.R.iget(1344)!=0|true))||(__CLR4_5_2xhxhlvl9eeux.R.iget(1345)==0&false))) {__CLR4_5_2xhxhlvl9eeux.R.inc(1346);return false;

            }__CLR4_5_2xhxhlvl9eeux.R.inc(1347);return true;
        }finally{__CLR4_5_2xhxhlvl9eeux.R.flushNeeded();}}

        @Override
        public int hashCode() {try{__CLR4_5_2xhxhlvl9eeux.R.inc(1348);
            __CLR4_5_2xhxhlvl9eeux.R.inc(1349);int result = itemId;
            __CLR4_5_2xhxhlvl9eeux.R.inc(1350);result = 31 * result + constructionMethod;
            __CLR4_5_2xhxhlvl9eeux.R.inc(1351);result = 31 * result + dataReferenceIndex;
            __CLR4_5_2xhxhlvl9eeux.R.inc(1352);result = 31 * result + (int) (baseOffset ^ (baseOffset >>> 32));
            __CLR4_5_2xhxhlvl9eeux.R.inc(1353);result = 31 * result + ((((extents != null )&&(__CLR4_5_2xhxhlvl9eeux.R.iget(1354)!=0|true))||(__CLR4_5_2xhxhlvl9eeux.R.iget(1355)==0&false))? extents.hashCode() : 0);
            __CLR4_5_2xhxhlvl9eeux.R.inc(1356);return result;
        }finally{__CLR4_5_2xhxhlvl9eeux.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_5_2xhxhlvl9eeux.R.inc(1357);
            __CLR4_5_2xhxhlvl9eeux.R.inc(1358);return "Item{" +
                    "baseOffset=" + baseOffset +
                    ", itemId=" + itemId +
                    ", constructionMethod=" + constructionMethod +
                    ", dataReferenceIndex=" + dataReferenceIndex +
                    ", extents=" + extents +
                    '}';
        }finally{__CLR4_5_2xhxhlvl9eeux.R.flushNeeded();}}
    }


    public Extent createExtent(long extentOffset, long extentLength, long extentIndex) {try{__CLR4_5_2xhxhlvl9eeux.R.inc(1359);
        __CLR4_5_2xhxhlvl9eeux.R.inc(1360);return new Extent(extentOffset, extentLength, extentIndex);
    }finally{__CLR4_5_2xhxhlvl9eeux.R.flushNeeded();}}

    Extent createExtent(ByteBuffer bb) {try{__CLR4_5_2xhxhlvl9eeux.R.inc(1361);
        __CLR4_5_2xhxhlvl9eeux.R.inc(1362);return new Extent(bb);
    }finally{__CLR4_5_2xhxhlvl9eeux.R.flushNeeded();}}


    public class Extent {
        public long extentOffset;
        public long extentLength;
        public long extentIndex;

        public Extent(long extentOffset, long extentLength, long extentIndex) {try{__CLR4_5_2xhxhlvl9eeux.R.inc(1363);
            __CLR4_5_2xhxhlvl9eeux.R.inc(1364);this.extentOffset = extentOffset;
            __CLR4_5_2xhxhlvl9eeux.R.inc(1365);this.extentLength = extentLength;
            __CLR4_5_2xhxhlvl9eeux.R.inc(1366);this.extentIndex = extentIndex;
        }finally{__CLR4_5_2xhxhlvl9eeux.R.flushNeeded();}}


        public Extent(ByteBuffer in) {try{__CLR4_5_2xhxhlvl9eeux.R.inc(1367);
            __CLR4_5_2xhxhlvl9eeux.R.inc(1368);if (((((getVersion() == 1) && indexSize > 0)&&(__CLR4_5_2xhxhlvl9eeux.R.iget(1369)!=0|true))||(__CLR4_5_2xhxhlvl9eeux.R.iget(1370)==0&false))) {{
                __CLR4_5_2xhxhlvl9eeux.R.inc(1371);extentIndex = IsoTypeReaderVariable.read(in, indexSize);
            }
            }__CLR4_5_2xhxhlvl9eeux.R.inc(1372);extentOffset = IsoTypeReaderVariable.read(in, offsetSize);
            __CLR4_5_2xhxhlvl9eeux.R.inc(1373);extentLength = IsoTypeReaderVariable.read(in, lengthSize);
        }finally{__CLR4_5_2xhxhlvl9eeux.R.flushNeeded();}}

        public void getContent(ByteBuffer os) {try{__CLR4_5_2xhxhlvl9eeux.R.inc(1374);
            __CLR4_5_2xhxhlvl9eeux.R.inc(1375);if (((((getVersion() == 1) && indexSize > 0)&&(__CLR4_5_2xhxhlvl9eeux.R.iget(1376)!=0|true))||(__CLR4_5_2xhxhlvl9eeux.R.iget(1377)==0&false))) {{
                __CLR4_5_2xhxhlvl9eeux.R.inc(1378);IsoTypeWriterVariable.write(extentIndex, os, indexSize);
            }
            }__CLR4_5_2xhxhlvl9eeux.R.inc(1379);IsoTypeWriterVariable.write(extentOffset, os, offsetSize);
            __CLR4_5_2xhxhlvl9eeux.R.inc(1380);IsoTypeWriterVariable.write(extentLength, os, lengthSize);
        }finally{__CLR4_5_2xhxhlvl9eeux.R.flushNeeded();}}

        public int getSize() {try{__CLR4_5_2xhxhlvl9eeux.R.inc(1381);
            __CLR4_5_2xhxhlvl9eeux.R.inc(1382);return ((((indexSize > 0 )&&(__CLR4_5_2xhxhlvl9eeux.R.iget(1383)!=0|true))||(__CLR4_5_2xhxhlvl9eeux.R.iget(1384)==0&false))? indexSize : 0) + offsetSize + lengthSize;
        }finally{__CLR4_5_2xhxhlvl9eeux.R.flushNeeded();}}


        @Override
        public boolean equals(Object o) {try{__CLR4_5_2xhxhlvl9eeux.R.inc(1385);
            __CLR4_5_2xhxhlvl9eeux.R.inc(1386);if ((((this == o)&&(__CLR4_5_2xhxhlvl9eeux.R.iget(1387)!=0|true))||(__CLR4_5_2xhxhlvl9eeux.R.iget(1388)==0&false))) {__CLR4_5_2xhxhlvl9eeux.R.inc(1389);return true;
            }__CLR4_5_2xhxhlvl9eeux.R.inc(1390);if ((((o == null || getClass() != o.getClass())&&(__CLR4_5_2xhxhlvl9eeux.R.iget(1391)!=0|true))||(__CLR4_5_2xhxhlvl9eeux.R.iget(1392)==0&false))) {__CLR4_5_2xhxhlvl9eeux.R.inc(1393);return false;

            }__CLR4_5_2xhxhlvl9eeux.R.inc(1394);Extent extent = (Extent) o;

            __CLR4_5_2xhxhlvl9eeux.R.inc(1395);if ((((extentIndex != extent.extentIndex)&&(__CLR4_5_2xhxhlvl9eeux.R.iget(1396)!=0|true))||(__CLR4_5_2xhxhlvl9eeux.R.iget(1397)==0&false))) {__CLR4_5_2xhxhlvl9eeux.R.inc(1398);return false;
            }__CLR4_5_2xhxhlvl9eeux.R.inc(1399);if ((((extentLength != extent.extentLength)&&(__CLR4_5_2xhxhlvl9eeux.R.iget(1400)!=0|true))||(__CLR4_5_2xhxhlvl9eeux.R.iget(1401)==0&false))) {__CLR4_5_2xhxhlvl9eeux.R.inc(1402);return false;
            }__CLR4_5_2xhxhlvl9eeux.R.inc(1403);if ((((extentOffset != extent.extentOffset)&&(__CLR4_5_2xhxhlvl9eeux.R.iget(1404)!=0|true))||(__CLR4_5_2xhxhlvl9eeux.R.iget(1405)==0&false))) {__CLR4_5_2xhxhlvl9eeux.R.inc(1406);return false;

            }__CLR4_5_2xhxhlvl9eeux.R.inc(1407);return true;
        }finally{__CLR4_5_2xhxhlvl9eeux.R.flushNeeded();}}

        @Override
        public int hashCode() {try{__CLR4_5_2xhxhlvl9eeux.R.inc(1408);
            __CLR4_5_2xhxhlvl9eeux.R.inc(1409);int result = (int) (extentOffset ^ (extentOffset >>> 32));
            __CLR4_5_2xhxhlvl9eeux.R.inc(1410);result = 31 * result + (int) (extentLength ^ (extentLength >>> 32));
            __CLR4_5_2xhxhlvl9eeux.R.inc(1411);result = 31 * result + (int) (extentIndex ^ (extentIndex >>> 32));
            __CLR4_5_2xhxhlvl9eeux.R.inc(1412);return result;
        }finally{__CLR4_5_2xhxhlvl9eeux.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_5_2xhxhlvl9eeux.R.inc(1413);
            __CLR4_5_2xhxhlvl9eeux.R.inc(1414);final StringBuilder sb = new StringBuilder();
            __CLR4_5_2xhxhlvl9eeux.R.inc(1415);sb.append("Extent");
            __CLR4_5_2xhxhlvl9eeux.R.inc(1416);sb.append("{extentOffset=").append(extentOffset);
            __CLR4_5_2xhxhlvl9eeux.R.inc(1417);sb.append(", extentLength=").append(extentLength);
            __CLR4_5_2xhxhlvl9eeux.R.inc(1418);sb.append(", extentIndex=").append(extentIndex);
            __CLR4_5_2xhxhlvl9eeux.R.inc(1419);sb.append('}');
            __CLR4_5_2xhxhlvl9eeux.R.inc(1420);return sb.toString();
        }finally{__CLR4_5_2xhxhlvl9eeux.R.flushNeeded();}}
    }


}
