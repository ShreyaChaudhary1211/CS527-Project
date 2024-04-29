/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.googlecode.mp4parser.stuff;

import com.coremedia.iso.IsoFile;
import com.coremedia.iso.boxes.*;
import com.coremedia.iso.boxes.apple.AppleItemListBox;
import com.googlecode.mp4parser.FileDataSourceImpl;
import com.googlecode.mp4parser.boxes.apple.AppleNameBox;
import com.googlecode.mp4parser.util.Path;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.util.List;

/**
 * Change metadata and make sure chunkoffsets are corrected.
 */
public class MetaDataInsert {public static class __CLR4_5_2w2w2lvl9g0vn{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0065\u0078\u0061\u006d\u0070\u006c\u0065\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413351766L,8589935092L,1287,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;


    public static void main(String[] args) throws IOException {try{__CLR4_5_2w2w2lvl9g0vn.R.inc(1154);
        __CLR4_5_2w2w2lvl9g0vn.R.inc(1155);MetaDataInsert cmd = new MetaDataInsert();
        __CLR4_5_2w2w2lvl9g0vn.R.inc(1156);cmd.writeRandomMetadata("c:\\content\\Mobile_H264 - Kopie.mp4",
                "lore ipsum tralalala");

    }finally{__CLR4_5_2w2w2lvl9g0vn.R.flushNeeded();}}

    public FileChannel splitFileAndInsert(File f, long pos, long length) throws IOException {try{__CLR4_5_2w2w2lvl9g0vn.R.inc(1157);
        __CLR4_5_2w2w2lvl9g0vn.R.inc(1158);FileChannel read = new RandomAccessFile(f, "r").getChannel();
        __CLR4_5_2w2w2lvl9g0vn.R.inc(1159);File tmp = File.createTempFile("ChangeMetaData", "splitFileAndInsert");
        __CLR4_5_2w2w2lvl9g0vn.R.inc(1160);FileChannel tmpWrite = new RandomAccessFile(tmp, "rw").getChannel();
        __CLR4_5_2w2w2lvl9g0vn.R.inc(1161);read.position(pos);
        __CLR4_5_2w2w2lvl9g0vn.R.inc(1162);tmpWrite.transferFrom(read, 0, read.size() - pos);
        __CLR4_5_2w2w2lvl9g0vn.R.inc(1163);read.close();
        __CLR4_5_2w2w2lvl9g0vn.R.inc(1164);FileChannel write = new RandomAccessFile(f, "rw").getChannel();
        __CLR4_5_2w2w2lvl9g0vn.R.inc(1165);write.position(pos + length);
        __CLR4_5_2w2w2lvl9g0vn.R.inc(1166);tmpWrite.position(0);
        __CLR4_5_2w2w2lvl9g0vn.R.inc(1167);long transferred = 0;
        __CLR4_5_2w2w2lvl9g0vn.R.inc(1168);while (((((transferred += tmpWrite.transferTo(0, tmpWrite.size() - transferred, write)) != tmpWrite.size())&&(__CLR4_5_2w2w2lvl9g0vn.R.iget(1169)!=0|true))||(__CLR4_5_2w2w2lvl9g0vn.R.iget(1170)==0&false))) {{
            __CLR4_5_2w2w2lvl9g0vn.R.inc(1171);System.out.println(transferred);
        }
        }__CLR4_5_2w2w2lvl9g0vn.R.inc(1172);System.out.println(transferred);
        __CLR4_5_2w2w2lvl9g0vn.R.inc(1173);tmpWrite.close();
        __CLR4_5_2w2w2lvl9g0vn.R.inc(1174);tmp.delete();
        __CLR4_5_2w2w2lvl9g0vn.R.inc(1175);return write;
    }finally{__CLR4_5_2w2w2lvl9g0vn.R.flushNeeded();}}


    private boolean needsOffsetCorrection(IsoFile isoFile) {try{__CLR4_5_2w2w2lvl9g0vn.R.inc(1176);
        __CLR4_5_2w2w2lvl9g0vn.R.inc(1177);if ((((Path.getPath(isoFile, "/moov[0]/mvex[0]") != null)&&(__CLR4_5_2w2w2lvl9g0vn.R.iget(1178)!=0|true))||(__CLR4_5_2w2w2lvl9g0vn.R.iget(1179)==0&false))) {{
            // Fragmented files don't need a correction
            __CLR4_5_2w2w2lvl9g0vn.R.inc(1180);return false;
        } }else {{
            // no correction needed if mdat is before moov as insert into moov want change the offsets of mdat
            __CLR4_5_2w2w2lvl9g0vn.R.inc(1181);return Path.getPath(isoFile, "/moov[0]").getOffset() < Path.getPath(isoFile, "/mdat[0]").getOffset();
        }
    }}finally{__CLR4_5_2w2w2lvl9g0vn.R.flushNeeded();}}

    public void writeRandomMetadata(String videoFilePath, String title) throws IOException {try{__CLR4_5_2w2w2lvl9g0vn.R.inc(1182);

        __CLR4_5_2w2w2lvl9g0vn.R.inc(1183);File videoFile = new File(videoFilePath);
        __CLR4_5_2w2w2lvl9g0vn.R.inc(1184);if ((((!videoFile.exists())&&(__CLR4_5_2w2w2lvl9g0vn.R.iget(1185)!=0|true))||(__CLR4_5_2w2w2lvl9g0vn.R.iget(1186)==0&false))) {{
            __CLR4_5_2w2w2lvl9g0vn.R.inc(1187);throw new FileNotFoundException("File " + videoFilePath + " not exists");
        }

        }__CLR4_5_2w2w2lvl9g0vn.R.inc(1188);if ((((!videoFile.canWrite())&&(__CLR4_5_2w2w2lvl9g0vn.R.iget(1189)!=0|true))||(__CLR4_5_2w2w2lvl9g0vn.R.iget(1190)==0&false))) {{
            __CLR4_5_2w2w2lvl9g0vn.R.inc(1191);throw new IllegalStateException("No write permissions to file " + videoFilePath);
        }
        }__CLR4_5_2w2w2lvl9g0vn.R.inc(1192);IsoFile isoFile = new IsoFile(new FileDataSourceImpl(videoFilePath));

        __CLR4_5_2w2w2lvl9g0vn.R.inc(1193);MovieBox moov = isoFile.getBoxes(MovieBox.class).get(0);
        __CLR4_5_2w2w2lvl9g0vn.R.inc(1194);FreeBox freeBox = findFreeBox(moov);

        __CLR4_5_2w2w2lvl9g0vn.R.inc(1195);boolean correctOffset = needsOffsetCorrection(isoFile);
        __CLR4_5_2w2w2lvl9g0vn.R.inc(1196);long sizeBefore = moov.getSize();
        __CLR4_5_2w2w2lvl9g0vn.R.inc(1197);long offset = moov.getOffset();

        // Create structure or just navigate to Apple List Box.
        __CLR4_5_2w2w2lvl9g0vn.R.inc(1198);UserDataBox userDataBox;
        __CLR4_5_2w2w2lvl9g0vn.R.inc(1199);if ((userDataBox = Path.getPath(moov, "udta")) == null) {{
            __CLR4_5_2w2w2lvl9g0vn.R.inc(1202);userDataBox = new UserDataBox();
            __CLR4_5_2w2w2lvl9g0vn.R.inc(1203);moov.addBox(userDataBox);
        }
        }__CLR4_5_2w2w2lvl9g0vn.R.inc(1204);MetaBox metaBox;
        __CLR4_5_2w2w2lvl9g0vn.R.inc(1205);if ((metaBox = Path.getPath(userDataBox, "meta")) == null) {{
            __CLR4_5_2w2w2lvl9g0vn.R.inc(1208);metaBox = new MetaBox();
            __CLR4_5_2w2w2lvl9g0vn.R.inc(1209);HandlerBox hdlr = new HandlerBox();
            __CLR4_5_2w2w2lvl9g0vn.R.inc(1210);hdlr.setHandlerType("mdir");
            __CLR4_5_2w2w2lvl9g0vn.R.inc(1211);metaBox.addBox(hdlr);
            __CLR4_5_2w2w2lvl9g0vn.R.inc(1212);userDataBox.addBox(metaBox);
        }
        }__CLR4_5_2w2w2lvl9g0vn.R.inc(1213);AppleItemListBox ilst;
        __CLR4_5_2w2w2lvl9g0vn.R.inc(1214);if ((ilst = Path.getPath(metaBox, "ilst")) == null) {{
            __CLR4_5_2w2w2lvl9g0vn.R.inc(1217);ilst = new AppleItemListBox();
            __CLR4_5_2w2w2lvl9g0vn.R.inc(1218);metaBox.addBox(ilst);

        }
        }__CLR4_5_2w2w2lvl9g0vn.R.inc(1219);if ((((freeBox == null)&&(__CLR4_5_2w2w2lvl9g0vn.R.iget(1220)!=0|true))||(__CLR4_5_2w2w2lvl9g0vn.R.iget(1221)==0&false))) {{
            __CLR4_5_2w2w2lvl9g0vn.R.inc(1222);freeBox = new FreeBox(128 * 1024);
            __CLR4_5_2w2w2lvl9g0vn.R.inc(1223);metaBox.addBox(freeBox);
        }
        // Got Apple List Box

        }__CLR4_5_2w2w2lvl9g0vn.R.inc(1224);AppleNameBox nam;
        __CLR4_5_2w2w2lvl9g0vn.R.inc(1225);if ((nam = Path.getPath(ilst, "\u00a9nam")) == null) {{
            __CLR4_5_2w2w2lvl9g0vn.R.inc(1228);nam = new AppleNameBox();
        }
        }__CLR4_5_2w2w2lvl9g0vn.R.inc(1229);nam.setDataCountry(0);
        __CLR4_5_2w2w2lvl9g0vn.R.inc(1230);nam.setDataLanguage(0);
        __CLR4_5_2w2w2lvl9g0vn.R.inc(1231);nam.setValue(title);
        __CLR4_5_2w2w2lvl9g0vn.R.inc(1232);ilst.addBox(nam);

        __CLR4_5_2w2w2lvl9g0vn.R.inc(1233);long sizeAfter = moov.getSize();
        __CLR4_5_2w2w2lvl9g0vn.R.inc(1234);long diff = sizeAfter - sizeBefore;
        // This is the difference of before/after

        // can we compensate by resizing a Free Box we have found?
        __CLR4_5_2w2w2lvl9g0vn.R.inc(1235);if ((((freeBox.getData().limit() > diff)&&(__CLR4_5_2w2w2lvl9g0vn.R.iget(1236)!=0|true))||(__CLR4_5_2w2w2lvl9g0vn.R.iget(1237)==0&false))) {{
            // either shrink or grow!
            __CLR4_5_2w2w2lvl9g0vn.R.inc(1238);freeBox.setData(ByteBuffer.allocate((int) (freeBox.getData().limit() - diff)));
            __CLR4_5_2w2w2lvl9g0vn.R.inc(1239);sizeAfter = moov.getSize();
            __CLR4_5_2w2w2lvl9g0vn.R.inc(1240);diff = sizeAfter - sizeBefore;
        }
        }__CLR4_5_2w2w2lvl9g0vn.R.inc(1241);if ((((correctOffset && diff != 0)&&(__CLR4_5_2w2w2lvl9g0vn.R.iget(1242)!=0|true))||(__CLR4_5_2w2w2lvl9g0vn.R.iget(1243)==0&false))) {{
            __CLR4_5_2w2w2lvl9g0vn.R.inc(1244);correctChunkOffsets(moov, diff);
        }
        }__CLR4_5_2w2w2lvl9g0vn.R.inc(1245);BetterByteArrayOutputStream baos = new BetterByteArrayOutputStream();
        __CLR4_5_2w2w2lvl9g0vn.R.inc(1246);moov.getBox(Channels.newChannel(baos));
        __CLR4_5_2w2w2lvl9g0vn.R.inc(1247);isoFile.close();
        __CLR4_5_2w2w2lvl9g0vn.R.inc(1248);FileChannel fc;
        __CLR4_5_2w2w2lvl9g0vn.R.inc(1249);if ((((diff != 0)&&(__CLR4_5_2w2w2lvl9g0vn.R.iget(1250)!=0|true))||(__CLR4_5_2w2w2lvl9g0vn.R.iget(1251)==0&false))) {{
            // this is not good: We have to insert bytes in the middle of the file
            // and this costs time as it requires re-writing most of the file's data
            __CLR4_5_2w2w2lvl9g0vn.R.inc(1252);fc = splitFileAndInsert(videoFile, offset, sizeAfter - sizeBefore);
        } }else {{
            // simple overwrite of something with the file
            __CLR4_5_2w2w2lvl9g0vn.R.inc(1253);fc = new RandomAccessFile(videoFile, "rw").getChannel();
        }
        }__CLR4_5_2w2w2lvl9g0vn.R.inc(1254);fc.position(offset);
        __CLR4_5_2w2w2lvl9g0vn.R.inc(1255);fc.write(ByteBuffer.wrap(baos.getBuffer(), 0, baos.size()));
        __CLR4_5_2w2w2lvl9g0vn.R.inc(1256);fc.close();
    }finally{__CLR4_5_2w2w2lvl9g0vn.R.flushNeeded();}}

    FreeBox findFreeBox(Container c) {try{__CLR4_5_2w2w2lvl9g0vn.R.inc(1257);
        __CLR4_5_2w2w2lvl9g0vn.R.inc(1258);for (Box box : c.getBoxes()) {{
            __CLR4_5_2w2w2lvl9g0vn.R.inc(1259);System.err.println(box.getType());
            __CLR4_5_2w2w2lvl9g0vn.R.inc(1260);if ((((box instanceof FreeBox)&&(__CLR4_5_2w2w2lvl9g0vn.R.iget(1261)!=0|true))||(__CLR4_5_2w2w2lvl9g0vn.R.iget(1262)==0&false))) {{
                __CLR4_5_2w2w2lvl9g0vn.R.inc(1263);return (FreeBox) box;
            }
            }__CLR4_5_2w2w2lvl9g0vn.R.inc(1264);if ((((box instanceof Container)&&(__CLR4_5_2w2w2lvl9g0vn.R.iget(1265)!=0|true))||(__CLR4_5_2w2w2lvl9g0vn.R.iget(1266)==0&false))) {{
                __CLR4_5_2w2w2lvl9g0vn.R.inc(1267);FreeBox freeBox = findFreeBox((Container) box);
                __CLR4_5_2w2w2lvl9g0vn.R.inc(1268);if ((((freeBox != null)&&(__CLR4_5_2w2w2lvl9g0vn.R.iget(1269)!=0|true))||(__CLR4_5_2w2w2lvl9g0vn.R.iget(1270)==0&false))) {{
                    __CLR4_5_2w2w2lvl9g0vn.R.inc(1271);return freeBox;
                }
            }}
        }}
        }__CLR4_5_2w2w2lvl9g0vn.R.inc(1272);return null;
    }finally{__CLR4_5_2w2w2lvl9g0vn.R.flushNeeded();}}

    private void correctChunkOffsets(MovieBox movieBox, long correction) {try{__CLR4_5_2w2w2lvl9g0vn.R.inc(1273);
        __CLR4_5_2w2w2lvl9g0vn.R.inc(1274);List<ChunkOffsetBox> chunkOffsetBoxes = Path.getPaths((Box) movieBox, "trak/mdia[0]/minf[0]/stbl[0]/stco[0]");
        __CLR4_5_2w2w2lvl9g0vn.R.inc(1275);if ((((chunkOffsetBoxes.size() == 0)&&(__CLR4_5_2w2w2lvl9g0vn.R.iget(1276)!=0|true))||(__CLR4_5_2w2w2lvl9g0vn.R.iget(1277)==0&false))) {{
            __CLR4_5_2w2w2lvl9g0vn.R.inc(1278);chunkOffsetBoxes = Path.getPaths((Box) movieBox, "trak/mdia[0]/minf[0]/stbl[0]/st64[0]");
        }
        }__CLR4_5_2w2w2lvl9g0vn.R.inc(1279);for (ChunkOffsetBox chunkOffsetBox : chunkOffsetBoxes) {{
            __CLR4_5_2w2w2lvl9g0vn.R.inc(1280);long[] cOffsets = chunkOffsetBox.getChunkOffsets();
            __CLR4_5_2w2w2lvl9g0vn.R.inc(1281);for (int i = 0; (((i < cOffsets.length)&&(__CLR4_5_2w2w2lvl9g0vn.R.iget(1282)!=0|true))||(__CLR4_5_2w2w2lvl9g0vn.R.iget(1283)==0&false)); i++) {{
                __CLR4_5_2w2w2lvl9g0vn.R.inc(1284);cOffsets[i] += correction;
            }
        }}
    }}finally{__CLR4_5_2w2w2lvl9g0vn.R.flushNeeded();}}

    private static class BetterByteArrayOutputStream extends ByteArrayOutputStream {
        byte[] getBuffer() {try{__CLR4_5_2w2w2lvl9g0vn.R.inc(1285);
            __CLR4_5_2w2w2lvl9g0vn.R.inc(1286);return buf;
        }finally{__CLR4_5_2w2w2lvl9g0vn.R.flushNeeded();}}
    }


}
