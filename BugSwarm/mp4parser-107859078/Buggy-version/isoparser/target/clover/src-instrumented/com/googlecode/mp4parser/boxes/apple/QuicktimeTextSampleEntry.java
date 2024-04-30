/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2012 Sebastian Annies, Hamburg
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
package com.googlecode.mp4parser.boxes.apple;

import com.coremedia.iso.BoxParser;
import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry;

import java.io.IOException;
import java.nio.ByteBuffer;
import com.googlecode.mp4parser.DataSource;
import java.nio.channels.WritableByteChannel;
import java.util.List;

import static com.googlecode.mp4parser.util.CastUtils.l2i;

/**
 * <h1>4cc = "{@value #TYPE}"</h1>
 * Entry type for timed text samples defined in the timed text specification (ISO/IEC 14496-17).
 */
public class QuicktimeTextSampleEntry extends AbstractSampleEntry {public static class __CLR4_5_2beybeylvl9ejsv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,14922,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static final String TYPE = "text";

    int displayFlags;
    int textJustification;

    int backgroundR;
    int backgroundG;
    int backgroundB;

    long defaultTextBox;
    long reserved1;

    short fontNumber;
    short fontFace;
    byte reserved2;
    short reserved3;

    int foregroundR = 65535;
    int foregroundG = 65535;
    int foregroundB = 65535;

    String fontName = "";
    int dataReferenceIndex;

    public QuicktimeTextSampleEntry() {
        super(TYPE);__CLR4_5_2beybeylvl9ejsv.R.inc(14795);try{__CLR4_5_2beybeylvl9ejsv.R.inc(14794);
    }finally{__CLR4_5_2beybeylvl9ejsv.R.flushNeeded();}}

    @Override
    public void parse(DataSource dataSource, ByteBuffer header, long contentSize, BoxParser boxParser) throws IOException {try{__CLR4_5_2beybeylvl9ejsv.R.inc(14796);
        __CLR4_5_2beybeylvl9ejsv.R.inc(14797);ByteBuffer content = ByteBuffer.allocate(l2i(contentSize));
        __CLR4_5_2beybeylvl9ejsv.R.inc(14798);dataSource.read(content);
        __CLR4_5_2beybeylvl9ejsv.R.inc(14799);content.position(6);
        __CLR4_5_2beybeylvl9ejsv.R.inc(14800);dataReferenceIndex = IsoTypeReader.readUInt16(content);
        __CLR4_5_2beybeylvl9ejsv.R.inc(14801);displayFlags = content.getInt();
        __CLR4_5_2beybeylvl9ejsv.R.inc(14802);textJustification = content.getInt();
        __CLR4_5_2beybeylvl9ejsv.R.inc(14803);backgroundR = IsoTypeReader.readUInt16(content);
        __CLR4_5_2beybeylvl9ejsv.R.inc(14804);backgroundG = IsoTypeReader.readUInt16(content);
        __CLR4_5_2beybeylvl9ejsv.R.inc(14805);backgroundB = IsoTypeReader.readUInt16(content);
        __CLR4_5_2beybeylvl9ejsv.R.inc(14806);defaultTextBox = IsoTypeReader.readUInt64(content);
        __CLR4_5_2beybeylvl9ejsv.R.inc(14807);reserved1 = IsoTypeReader.readUInt64(content);
        __CLR4_5_2beybeylvl9ejsv.R.inc(14808);fontNumber = content.getShort();
        __CLR4_5_2beybeylvl9ejsv.R.inc(14809);fontFace = content.getShort();
        __CLR4_5_2beybeylvl9ejsv.R.inc(14810);reserved2 = content.get();
        __CLR4_5_2beybeylvl9ejsv.R.inc(14811);reserved3 = content.getShort();
        __CLR4_5_2beybeylvl9ejsv.R.inc(14812);foregroundR = IsoTypeReader.readUInt16(content);
        __CLR4_5_2beybeylvl9ejsv.R.inc(14813);foregroundG = IsoTypeReader.readUInt16(content);
        __CLR4_5_2beybeylvl9ejsv.R.inc(14814);foregroundB = IsoTypeReader.readUInt16(content);
        __CLR4_5_2beybeylvl9ejsv.R.inc(14815);if ((((content.remaining() > 0)&&(__CLR4_5_2beybeylvl9ejsv.R.iget(14816)!=0|true))||(__CLR4_5_2beybeylvl9ejsv.R.iget(14817)==0&false))) {{
            __CLR4_5_2beybeylvl9ejsv.R.inc(14818);int length = IsoTypeReader.readUInt8(content);
            __CLR4_5_2beybeylvl9ejsv.R.inc(14819);byte[] myFontName = new byte[length];
            __CLR4_5_2beybeylvl9ejsv.R.inc(14820);content.get(myFontName);
            __CLR4_5_2beybeylvl9ejsv.R.inc(14821);fontName = new String(myFontName);
        } }else {{
            __CLR4_5_2beybeylvl9ejsv.R.inc(14822);fontName = null;
        }
        // initContainer(); there are no child boxes!?
    }}finally{__CLR4_5_2beybeylvl9ejsv.R.flushNeeded();}}

    @Override
    public void setBoxes(List<Box> boxes) {try{__CLR4_5_2beybeylvl9ejsv.R.inc(14823);
        __CLR4_5_2beybeylvl9ejsv.R.inc(14824);throw new RuntimeException("QuicktimeTextSampleEntries may not have child boxes");
    }finally{__CLR4_5_2beybeylvl9ejsv.R.flushNeeded();}}

    @Override
    public void addBox(Box box) {try{__CLR4_5_2beybeylvl9ejsv.R.inc(14825);
        __CLR4_5_2beybeylvl9ejsv.R.inc(14826);throw new RuntimeException("QuicktimeTextSampleEntries may not have child boxes");
    }finally{__CLR4_5_2beybeylvl9ejsv.R.flushNeeded();}}

    @Override
    public void getBox(WritableByteChannel writableByteChannel) throws IOException {try{__CLR4_5_2beybeylvl9ejsv.R.inc(14827);
        __CLR4_5_2beybeylvl9ejsv.R.inc(14828);writableByteChannel.write(getHeader());

        __CLR4_5_2beybeylvl9ejsv.R.inc(14829);ByteBuffer byteBuffer = ByteBuffer.allocate(52 + ((((fontName != null )&&(__CLR4_5_2beybeylvl9ejsv.R.iget(14830)!=0|true))||(__CLR4_5_2beybeylvl9ejsv.R.iget(14831)==0&false))? fontName.length() : 0));
        __CLR4_5_2beybeylvl9ejsv.R.inc(14832);byteBuffer.position(6);
        __CLR4_5_2beybeylvl9ejsv.R.inc(14833);IsoTypeWriter.writeUInt16(byteBuffer, dataReferenceIndex);
        __CLR4_5_2beybeylvl9ejsv.R.inc(14834);byteBuffer.putInt(displayFlags);
        __CLR4_5_2beybeylvl9ejsv.R.inc(14835);byteBuffer.putInt(textJustification);
        __CLR4_5_2beybeylvl9ejsv.R.inc(14836);IsoTypeWriter.writeUInt16(byteBuffer, backgroundR);
        __CLR4_5_2beybeylvl9ejsv.R.inc(14837);IsoTypeWriter.writeUInt16(byteBuffer, backgroundG);
        __CLR4_5_2beybeylvl9ejsv.R.inc(14838);IsoTypeWriter.writeUInt16(byteBuffer, backgroundB);
        __CLR4_5_2beybeylvl9ejsv.R.inc(14839);IsoTypeWriter.writeUInt64(byteBuffer, defaultTextBox);
        __CLR4_5_2beybeylvl9ejsv.R.inc(14840);IsoTypeWriter.writeUInt64(byteBuffer, reserved1);
        __CLR4_5_2beybeylvl9ejsv.R.inc(14841);byteBuffer.putShort(fontNumber);
        __CLR4_5_2beybeylvl9ejsv.R.inc(14842);byteBuffer.putShort(fontFace);
        __CLR4_5_2beybeylvl9ejsv.R.inc(14843);byteBuffer.put(reserved2);
        __CLR4_5_2beybeylvl9ejsv.R.inc(14844);byteBuffer.putShort(reserved3);

        __CLR4_5_2beybeylvl9ejsv.R.inc(14845);IsoTypeWriter.writeUInt16(byteBuffer, foregroundR);
        __CLR4_5_2beybeylvl9ejsv.R.inc(14846);IsoTypeWriter.writeUInt16(byteBuffer, foregroundG);
        __CLR4_5_2beybeylvl9ejsv.R.inc(14847);IsoTypeWriter.writeUInt16(byteBuffer, foregroundB);
        __CLR4_5_2beybeylvl9ejsv.R.inc(14848);if ((((fontName != null)&&(__CLR4_5_2beybeylvl9ejsv.R.iget(14849)!=0|true))||(__CLR4_5_2beybeylvl9ejsv.R.iget(14850)==0&false))) {{
            __CLR4_5_2beybeylvl9ejsv.R.inc(14851);IsoTypeWriter.writeUInt8(byteBuffer, fontName.length());
            __CLR4_5_2beybeylvl9ejsv.R.inc(14852);byteBuffer.put(fontName.getBytes());
        }
        }__CLR4_5_2beybeylvl9ejsv.R.inc(14853);writableByteChannel.write((ByteBuffer) byteBuffer.rewind());
        // writeContainer(writableByteChannel); there are no child boxes!?
    }finally{__CLR4_5_2beybeylvl9ejsv.R.flushNeeded();}}

    @Override
    public long getSize() {try{__CLR4_5_2beybeylvl9ejsv.R.inc(14854);
        __CLR4_5_2beybeylvl9ejsv.R.inc(14855);long s = getContainerSize() + 52 + ((((fontName != null )&&(__CLR4_5_2beybeylvl9ejsv.R.iget(14856)!=0|true))||(__CLR4_5_2beybeylvl9ejsv.R.iget(14857)==0&false))? fontName.length() : 0);
        __CLR4_5_2beybeylvl9ejsv.R.inc(14858);s += (((((largeBox || (s + 8) >= (1L << 32)) )&&(__CLR4_5_2beybeylvl9ejsv.R.iget(14859)!=0|true))||(__CLR4_5_2beybeylvl9ejsv.R.iget(14860)==0&false))? 16 : 8);
        __CLR4_5_2beybeylvl9ejsv.R.inc(14861);return s;
    }finally{__CLR4_5_2beybeylvl9ejsv.R.flushNeeded();}}

    public int getDisplayFlags() {try{__CLR4_5_2beybeylvl9ejsv.R.inc(14862);
        __CLR4_5_2beybeylvl9ejsv.R.inc(14863);return displayFlags;
    }finally{__CLR4_5_2beybeylvl9ejsv.R.flushNeeded();}}

    public void setDisplayFlags(int displayFlags) {try{__CLR4_5_2beybeylvl9ejsv.R.inc(14864);
        __CLR4_5_2beybeylvl9ejsv.R.inc(14865);this.displayFlags = displayFlags;
    }finally{__CLR4_5_2beybeylvl9ejsv.R.flushNeeded();}}

    public int getTextJustification() {try{__CLR4_5_2beybeylvl9ejsv.R.inc(14866);
        __CLR4_5_2beybeylvl9ejsv.R.inc(14867);return textJustification;
    }finally{__CLR4_5_2beybeylvl9ejsv.R.flushNeeded();}}

    public void setTextJustification(int textJustification) {try{__CLR4_5_2beybeylvl9ejsv.R.inc(14868);
        __CLR4_5_2beybeylvl9ejsv.R.inc(14869);this.textJustification = textJustification;
    }finally{__CLR4_5_2beybeylvl9ejsv.R.flushNeeded();}}

    public int getBackgroundR() {try{__CLR4_5_2beybeylvl9ejsv.R.inc(14870);
        __CLR4_5_2beybeylvl9ejsv.R.inc(14871);return backgroundR;
    }finally{__CLR4_5_2beybeylvl9ejsv.R.flushNeeded();}}

    public void setBackgroundR(int backgroundR) {try{__CLR4_5_2beybeylvl9ejsv.R.inc(14872);
        __CLR4_5_2beybeylvl9ejsv.R.inc(14873);this.backgroundR = backgroundR;
    }finally{__CLR4_5_2beybeylvl9ejsv.R.flushNeeded();}}

    public int getBackgroundG() {try{__CLR4_5_2beybeylvl9ejsv.R.inc(14874);
        __CLR4_5_2beybeylvl9ejsv.R.inc(14875);return backgroundG;
    }finally{__CLR4_5_2beybeylvl9ejsv.R.flushNeeded();}}

    public void setBackgroundG(int backgroundG) {try{__CLR4_5_2beybeylvl9ejsv.R.inc(14876);
        __CLR4_5_2beybeylvl9ejsv.R.inc(14877);this.backgroundG = backgroundG;
    }finally{__CLR4_5_2beybeylvl9ejsv.R.flushNeeded();}}

    public int getBackgroundB() {try{__CLR4_5_2beybeylvl9ejsv.R.inc(14878);
        __CLR4_5_2beybeylvl9ejsv.R.inc(14879);return backgroundB;
    }finally{__CLR4_5_2beybeylvl9ejsv.R.flushNeeded();}}

    public void setBackgroundB(int backgroundB) {try{__CLR4_5_2beybeylvl9ejsv.R.inc(14880);
        __CLR4_5_2beybeylvl9ejsv.R.inc(14881);this.backgroundB = backgroundB;
    }finally{__CLR4_5_2beybeylvl9ejsv.R.flushNeeded();}}

    public long getDefaultTextBox() {try{__CLR4_5_2beybeylvl9ejsv.R.inc(14882);
        __CLR4_5_2beybeylvl9ejsv.R.inc(14883);return defaultTextBox;
    }finally{__CLR4_5_2beybeylvl9ejsv.R.flushNeeded();}}

    public void setDefaultTextBox(long defaultTextBox) {try{__CLR4_5_2beybeylvl9ejsv.R.inc(14884);
        __CLR4_5_2beybeylvl9ejsv.R.inc(14885);this.defaultTextBox = defaultTextBox;
    }finally{__CLR4_5_2beybeylvl9ejsv.R.flushNeeded();}}

    public long getReserved1() {try{__CLR4_5_2beybeylvl9ejsv.R.inc(14886);
        __CLR4_5_2beybeylvl9ejsv.R.inc(14887);return reserved1;
    }finally{__CLR4_5_2beybeylvl9ejsv.R.flushNeeded();}}

    public void setReserved1(long reserved1) {try{__CLR4_5_2beybeylvl9ejsv.R.inc(14888);
        __CLR4_5_2beybeylvl9ejsv.R.inc(14889);this.reserved1 = reserved1;
    }finally{__CLR4_5_2beybeylvl9ejsv.R.flushNeeded();}}

    public short getFontNumber() {try{__CLR4_5_2beybeylvl9ejsv.R.inc(14890);
        __CLR4_5_2beybeylvl9ejsv.R.inc(14891);return fontNumber;
    }finally{__CLR4_5_2beybeylvl9ejsv.R.flushNeeded();}}

    public void setFontNumber(short fontNumber) {try{__CLR4_5_2beybeylvl9ejsv.R.inc(14892);
        __CLR4_5_2beybeylvl9ejsv.R.inc(14893);this.fontNumber = fontNumber;
    }finally{__CLR4_5_2beybeylvl9ejsv.R.flushNeeded();}}

    public short getFontFace() {try{__CLR4_5_2beybeylvl9ejsv.R.inc(14894);
        __CLR4_5_2beybeylvl9ejsv.R.inc(14895);return fontFace;
    }finally{__CLR4_5_2beybeylvl9ejsv.R.flushNeeded();}}

    public void setFontFace(short fontFace) {try{__CLR4_5_2beybeylvl9ejsv.R.inc(14896);
        __CLR4_5_2beybeylvl9ejsv.R.inc(14897);this.fontFace = fontFace;
    }finally{__CLR4_5_2beybeylvl9ejsv.R.flushNeeded();}}

    public byte getReserved2() {try{__CLR4_5_2beybeylvl9ejsv.R.inc(14898);
        __CLR4_5_2beybeylvl9ejsv.R.inc(14899);return reserved2;
    }finally{__CLR4_5_2beybeylvl9ejsv.R.flushNeeded();}}

    public void setReserved2(byte reserved2) {try{__CLR4_5_2beybeylvl9ejsv.R.inc(14900);
        __CLR4_5_2beybeylvl9ejsv.R.inc(14901);this.reserved2 = reserved2;
    }finally{__CLR4_5_2beybeylvl9ejsv.R.flushNeeded();}}

    public short getReserved3() {try{__CLR4_5_2beybeylvl9ejsv.R.inc(14902);
        __CLR4_5_2beybeylvl9ejsv.R.inc(14903);return reserved3;
    }finally{__CLR4_5_2beybeylvl9ejsv.R.flushNeeded();}}

    public void setReserved3(short reserved3) {try{__CLR4_5_2beybeylvl9ejsv.R.inc(14904);
        __CLR4_5_2beybeylvl9ejsv.R.inc(14905);this.reserved3 = reserved3;
    }finally{__CLR4_5_2beybeylvl9ejsv.R.flushNeeded();}}

    public int getForegroundR() {try{__CLR4_5_2beybeylvl9ejsv.R.inc(14906);
        __CLR4_5_2beybeylvl9ejsv.R.inc(14907);return foregroundR;
    }finally{__CLR4_5_2beybeylvl9ejsv.R.flushNeeded();}}

    public void setForegroundR(int foregroundR) {try{__CLR4_5_2beybeylvl9ejsv.R.inc(14908);
        __CLR4_5_2beybeylvl9ejsv.R.inc(14909);this.foregroundR = foregroundR;
    }finally{__CLR4_5_2beybeylvl9ejsv.R.flushNeeded();}}

    public int getForegroundG() {try{__CLR4_5_2beybeylvl9ejsv.R.inc(14910);
        __CLR4_5_2beybeylvl9ejsv.R.inc(14911);return foregroundG;
    }finally{__CLR4_5_2beybeylvl9ejsv.R.flushNeeded();}}

    public void setForegroundG(int foregroundG) {try{__CLR4_5_2beybeylvl9ejsv.R.inc(14912);
        __CLR4_5_2beybeylvl9ejsv.R.inc(14913);this.foregroundG = foregroundG;
    }finally{__CLR4_5_2beybeylvl9ejsv.R.flushNeeded();}}

    public int getForegroundB() {try{__CLR4_5_2beybeylvl9ejsv.R.inc(14914);
        __CLR4_5_2beybeylvl9ejsv.R.inc(14915);return foregroundB;
    }finally{__CLR4_5_2beybeylvl9ejsv.R.flushNeeded();}}

    public void setForegroundB(int foregroundB) {try{__CLR4_5_2beybeylvl9ejsv.R.inc(14916);
        __CLR4_5_2beybeylvl9ejsv.R.inc(14917);this.foregroundB = foregroundB;
    }finally{__CLR4_5_2beybeylvl9ejsv.R.flushNeeded();}}

    public String getFontName() {try{__CLR4_5_2beybeylvl9ejsv.R.inc(14918);
        __CLR4_5_2beybeylvl9ejsv.R.inc(14919);return fontName;
    }finally{__CLR4_5_2beybeylvl9ejsv.R.flushNeeded();}}

    public void setFontName(String fontName) {try{__CLR4_5_2beybeylvl9ejsv.R.inc(14920);
        __CLR4_5_2beybeylvl9ejsv.R.inc(14921);this.fontName = fontName;
    }finally{__CLR4_5_2beybeylvl9ejsv.R.flushNeeded();}}


}
