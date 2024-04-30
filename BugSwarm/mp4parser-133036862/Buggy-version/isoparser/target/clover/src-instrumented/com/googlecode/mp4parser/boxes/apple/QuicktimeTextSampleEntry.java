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
public class QuicktimeTextSampleEntry extends AbstractSampleEntry {public static class __CLR4_5_2bhlbhllvlulk3h{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,15017,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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
        super(TYPE);__CLR4_5_2bhlbhllvlulk3h.R.inc(14890);try{__CLR4_5_2bhlbhllvlulk3h.R.inc(14889);
    }finally{__CLR4_5_2bhlbhllvlulk3h.R.flushNeeded();}}

    @Override
    public void parse(DataSource dataSource, ByteBuffer header, long contentSize, BoxParser boxParser) throws IOException {try{__CLR4_5_2bhlbhllvlulk3h.R.inc(14891);
        __CLR4_5_2bhlbhllvlulk3h.R.inc(14892);ByteBuffer content = ByteBuffer.allocate(l2i(contentSize));
        __CLR4_5_2bhlbhllvlulk3h.R.inc(14893);dataSource.read(content);
        __CLR4_5_2bhlbhllvlulk3h.R.inc(14894);content.position(6);
        __CLR4_5_2bhlbhllvlulk3h.R.inc(14895);dataReferenceIndex = IsoTypeReader.readUInt16(content);
        __CLR4_5_2bhlbhllvlulk3h.R.inc(14896);displayFlags = content.getInt();
        __CLR4_5_2bhlbhllvlulk3h.R.inc(14897);textJustification = content.getInt();
        __CLR4_5_2bhlbhllvlulk3h.R.inc(14898);backgroundR = IsoTypeReader.readUInt16(content);
        __CLR4_5_2bhlbhllvlulk3h.R.inc(14899);backgroundG = IsoTypeReader.readUInt16(content);
        __CLR4_5_2bhlbhllvlulk3h.R.inc(14900);backgroundB = IsoTypeReader.readUInt16(content);
        __CLR4_5_2bhlbhllvlulk3h.R.inc(14901);defaultTextBox = IsoTypeReader.readUInt64(content);
        __CLR4_5_2bhlbhllvlulk3h.R.inc(14902);reserved1 = IsoTypeReader.readUInt64(content);
        __CLR4_5_2bhlbhllvlulk3h.R.inc(14903);fontNumber = content.getShort();
        __CLR4_5_2bhlbhllvlulk3h.R.inc(14904);fontFace = content.getShort();
        __CLR4_5_2bhlbhllvlulk3h.R.inc(14905);reserved2 = content.get();
        __CLR4_5_2bhlbhllvlulk3h.R.inc(14906);reserved3 = content.getShort();
        __CLR4_5_2bhlbhllvlulk3h.R.inc(14907);foregroundR = IsoTypeReader.readUInt16(content);
        __CLR4_5_2bhlbhllvlulk3h.R.inc(14908);foregroundG = IsoTypeReader.readUInt16(content);
        __CLR4_5_2bhlbhllvlulk3h.R.inc(14909);foregroundB = IsoTypeReader.readUInt16(content);
        __CLR4_5_2bhlbhllvlulk3h.R.inc(14910);if ((((content.remaining() > 0)&&(__CLR4_5_2bhlbhllvlulk3h.R.iget(14911)!=0|true))||(__CLR4_5_2bhlbhllvlulk3h.R.iget(14912)==0&false))) {{
            __CLR4_5_2bhlbhllvlulk3h.R.inc(14913);int length = IsoTypeReader.readUInt8(content);
            __CLR4_5_2bhlbhllvlulk3h.R.inc(14914);byte[] myFontName = new byte[length];
            __CLR4_5_2bhlbhllvlulk3h.R.inc(14915);content.get(myFontName);
            __CLR4_5_2bhlbhllvlulk3h.R.inc(14916);fontName = new String(myFontName);
        } }else {{
            __CLR4_5_2bhlbhllvlulk3h.R.inc(14917);fontName = null;
        }
        // initContainer(); there are no child boxes!?
    }}finally{__CLR4_5_2bhlbhllvlulk3h.R.flushNeeded();}}

    @Override
    public void setBoxes(List<Box> boxes) {try{__CLR4_5_2bhlbhllvlulk3h.R.inc(14918);
        __CLR4_5_2bhlbhllvlulk3h.R.inc(14919);throw new RuntimeException("QuicktimeTextSampleEntries may not have child boxes");
    }finally{__CLR4_5_2bhlbhllvlulk3h.R.flushNeeded();}}

    @Override
    public void addBox(Box box) {try{__CLR4_5_2bhlbhllvlulk3h.R.inc(14920);
        __CLR4_5_2bhlbhllvlulk3h.R.inc(14921);throw new RuntimeException("QuicktimeTextSampleEntries may not have child boxes");
    }finally{__CLR4_5_2bhlbhllvlulk3h.R.flushNeeded();}}

    @Override
    public void getBox(WritableByteChannel writableByteChannel) throws IOException {try{__CLR4_5_2bhlbhllvlulk3h.R.inc(14922);
        __CLR4_5_2bhlbhllvlulk3h.R.inc(14923);writableByteChannel.write(getHeader());

        __CLR4_5_2bhlbhllvlulk3h.R.inc(14924);ByteBuffer byteBuffer = ByteBuffer.allocate(52 + ((((fontName != null )&&(__CLR4_5_2bhlbhllvlulk3h.R.iget(14925)!=0|true))||(__CLR4_5_2bhlbhllvlulk3h.R.iget(14926)==0&false))? fontName.length() : 0));
        __CLR4_5_2bhlbhllvlulk3h.R.inc(14927);byteBuffer.position(6);
        __CLR4_5_2bhlbhllvlulk3h.R.inc(14928);IsoTypeWriter.writeUInt16(byteBuffer, dataReferenceIndex);
        __CLR4_5_2bhlbhllvlulk3h.R.inc(14929);byteBuffer.putInt(displayFlags);
        __CLR4_5_2bhlbhllvlulk3h.R.inc(14930);byteBuffer.putInt(textJustification);
        __CLR4_5_2bhlbhllvlulk3h.R.inc(14931);IsoTypeWriter.writeUInt16(byteBuffer, backgroundR);
        __CLR4_5_2bhlbhllvlulk3h.R.inc(14932);IsoTypeWriter.writeUInt16(byteBuffer, backgroundG);
        __CLR4_5_2bhlbhllvlulk3h.R.inc(14933);IsoTypeWriter.writeUInt16(byteBuffer, backgroundB);
        __CLR4_5_2bhlbhllvlulk3h.R.inc(14934);IsoTypeWriter.writeUInt64(byteBuffer, defaultTextBox);
        __CLR4_5_2bhlbhllvlulk3h.R.inc(14935);IsoTypeWriter.writeUInt64(byteBuffer, reserved1);
        __CLR4_5_2bhlbhllvlulk3h.R.inc(14936);byteBuffer.putShort(fontNumber);
        __CLR4_5_2bhlbhllvlulk3h.R.inc(14937);byteBuffer.putShort(fontFace);
        __CLR4_5_2bhlbhllvlulk3h.R.inc(14938);byteBuffer.put(reserved2);
        __CLR4_5_2bhlbhllvlulk3h.R.inc(14939);byteBuffer.putShort(reserved3);

        __CLR4_5_2bhlbhllvlulk3h.R.inc(14940);IsoTypeWriter.writeUInt16(byteBuffer, foregroundR);
        __CLR4_5_2bhlbhllvlulk3h.R.inc(14941);IsoTypeWriter.writeUInt16(byteBuffer, foregroundG);
        __CLR4_5_2bhlbhllvlulk3h.R.inc(14942);IsoTypeWriter.writeUInt16(byteBuffer, foregroundB);
        __CLR4_5_2bhlbhllvlulk3h.R.inc(14943);if ((((fontName != null)&&(__CLR4_5_2bhlbhllvlulk3h.R.iget(14944)!=0|true))||(__CLR4_5_2bhlbhllvlulk3h.R.iget(14945)==0&false))) {{
            __CLR4_5_2bhlbhllvlulk3h.R.inc(14946);IsoTypeWriter.writeUInt8(byteBuffer, fontName.length());
            __CLR4_5_2bhlbhllvlulk3h.R.inc(14947);byteBuffer.put(fontName.getBytes());
        }
        }__CLR4_5_2bhlbhllvlulk3h.R.inc(14948);writableByteChannel.write((ByteBuffer) byteBuffer.rewind());
        // writeContainer(writableByteChannel); there are no child boxes!?
    }finally{__CLR4_5_2bhlbhllvlulk3h.R.flushNeeded();}}

    @Override
    public long getSize() {try{__CLR4_5_2bhlbhllvlulk3h.R.inc(14949);
        __CLR4_5_2bhlbhllvlulk3h.R.inc(14950);long s = getContainerSize() + 52 + ((((fontName != null )&&(__CLR4_5_2bhlbhllvlulk3h.R.iget(14951)!=0|true))||(__CLR4_5_2bhlbhllvlulk3h.R.iget(14952)==0&false))? fontName.length() : 0);
        __CLR4_5_2bhlbhllvlulk3h.R.inc(14953);s += (((((largeBox || (s + 8) >= (1L << 32)) )&&(__CLR4_5_2bhlbhllvlulk3h.R.iget(14954)!=0|true))||(__CLR4_5_2bhlbhllvlulk3h.R.iget(14955)==0&false))? 16 : 8);
        __CLR4_5_2bhlbhllvlulk3h.R.inc(14956);return s;
    }finally{__CLR4_5_2bhlbhllvlulk3h.R.flushNeeded();}}

    public int getDisplayFlags() {try{__CLR4_5_2bhlbhllvlulk3h.R.inc(14957);
        __CLR4_5_2bhlbhllvlulk3h.R.inc(14958);return displayFlags;
    }finally{__CLR4_5_2bhlbhllvlulk3h.R.flushNeeded();}}

    public void setDisplayFlags(int displayFlags) {try{__CLR4_5_2bhlbhllvlulk3h.R.inc(14959);
        __CLR4_5_2bhlbhllvlulk3h.R.inc(14960);this.displayFlags = displayFlags;
    }finally{__CLR4_5_2bhlbhllvlulk3h.R.flushNeeded();}}

    public int getTextJustification() {try{__CLR4_5_2bhlbhllvlulk3h.R.inc(14961);
        __CLR4_5_2bhlbhllvlulk3h.R.inc(14962);return textJustification;
    }finally{__CLR4_5_2bhlbhllvlulk3h.R.flushNeeded();}}

    public void setTextJustification(int textJustification) {try{__CLR4_5_2bhlbhllvlulk3h.R.inc(14963);
        __CLR4_5_2bhlbhllvlulk3h.R.inc(14964);this.textJustification = textJustification;
    }finally{__CLR4_5_2bhlbhllvlulk3h.R.flushNeeded();}}

    public int getBackgroundR() {try{__CLR4_5_2bhlbhllvlulk3h.R.inc(14965);
        __CLR4_5_2bhlbhllvlulk3h.R.inc(14966);return backgroundR;
    }finally{__CLR4_5_2bhlbhllvlulk3h.R.flushNeeded();}}

    public void setBackgroundR(int backgroundR) {try{__CLR4_5_2bhlbhllvlulk3h.R.inc(14967);
        __CLR4_5_2bhlbhllvlulk3h.R.inc(14968);this.backgroundR = backgroundR;
    }finally{__CLR4_5_2bhlbhllvlulk3h.R.flushNeeded();}}

    public int getBackgroundG() {try{__CLR4_5_2bhlbhllvlulk3h.R.inc(14969);
        __CLR4_5_2bhlbhllvlulk3h.R.inc(14970);return backgroundG;
    }finally{__CLR4_5_2bhlbhllvlulk3h.R.flushNeeded();}}

    public void setBackgroundG(int backgroundG) {try{__CLR4_5_2bhlbhllvlulk3h.R.inc(14971);
        __CLR4_5_2bhlbhllvlulk3h.R.inc(14972);this.backgroundG = backgroundG;
    }finally{__CLR4_5_2bhlbhllvlulk3h.R.flushNeeded();}}

    public int getBackgroundB() {try{__CLR4_5_2bhlbhllvlulk3h.R.inc(14973);
        __CLR4_5_2bhlbhllvlulk3h.R.inc(14974);return backgroundB;
    }finally{__CLR4_5_2bhlbhllvlulk3h.R.flushNeeded();}}

    public void setBackgroundB(int backgroundB) {try{__CLR4_5_2bhlbhllvlulk3h.R.inc(14975);
        __CLR4_5_2bhlbhllvlulk3h.R.inc(14976);this.backgroundB = backgroundB;
    }finally{__CLR4_5_2bhlbhllvlulk3h.R.flushNeeded();}}

    public long getDefaultTextBox() {try{__CLR4_5_2bhlbhllvlulk3h.R.inc(14977);
        __CLR4_5_2bhlbhllvlulk3h.R.inc(14978);return defaultTextBox;
    }finally{__CLR4_5_2bhlbhllvlulk3h.R.flushNeeded();}}

    public void setDefaultTextBox(long defaultTextBox) {try{__CLR4_5_2bhlbhllvlulk3h.R.inc(14979);
        __CLR4_5_2bhlbhllvlulk3h.R.inc(14980);this.defaultTextBox = defaultTextBox;
    }finally{__CLR4_5_2bhlbhllvlulk3h.R.flushNeeded();}}

    public long getReserved1() {try{__CLR4_5_2bhlbhllvlulk3h.R.inc(14981);
        __CLR4_5_2bhlbhllvlulk3h.R.inc(14982);return reserved1;
    }finally{__CLR4_5_2bhlbhllvlulk3h.R.flushNeeded();}}

    public void setReserved1(long reserved1) {try{__CLR4_5_2bhlbhllvlulk3h.R.inc(14983);
        __CLR4_5_2bhlbhllvlulk3h.R.inc(14984);this.reserved1 = reserved1;
    }finally{__CLR4_5_2bhlbhllvlulk3h.R.flushNeeded();}}

    public short getFontNumber() {try{__CLR4_5_2bhlbhllvlulk3h.R.inc(14985);
        __CLR4_5_2bhlbhllvlulk3h.R.inc(14986);return fontNumber;
    }finally{__CLR4_5_2bhlbhllvlulk3h.R.flushNeeded();}}

    public void setFontNumber(short fontNumber) {try{__CLR4_5_2bhlbhllvlulk3h.R.inc(14987);
        __CLR4_5_2bhlbhllvlulk3h.R.inc(14988);this.fontNumber = fontNumber;
    }finally{__CLR4_5_2bhlbhllvlulk3h.R.flushNeeded();}}

    public short getFontFace() {try{__CLR4_5_2bhlbhllvlulk3h.R.inc(14989);
        __CLR4_5_2bhlbhllvlulk3h.R.inc(14990);return fontFace;
    }finally{__CLR4_5_2bhlbhllvlulk3h.R.flushNeeded();}}

    public void setFontFace(short fontFace) {try{__CLR4_5_2bhlbhllvlulk3h.R.inc(14991);
        __CLR4_5_2bhlbhllvlulk3h.R.inc(14992);this.fontFace = fontFace;
    }finally{__CLR4_5_2bhlbhllvlulk3h.R.flushNeeded();}}

    public byte getReserved2() {try{__CLR4_5_2bhlbhllvlulk3h.R.inc(14993);
        __CLR4_5_2bhlbhllvlulk3h.R.inc(14994);return reserved2;
    }finally{__CLR4_5_2bhlbhllvlulk3h.R.flushNeeded();}}

    public void setReserved2(byte reserved2) {try{__CLR4_5_2bhlbhllvlulk3h.R.inc(14995);
        __CLR4_5_2bhlbhllvlulk3h.R.inc(14996);this.reserved2 = reserved2;
    }finally{__CLR4_5_2bhlbhllvlulk3h.R.flushNeeded();}}

    public short getReserved3() {try{__CLR4_5_2bhlbhllvlulk3h.R.inc(14997);
        __CLR4_5_2bhlbhllvlulk3h.R.inc(14998);return reserved3;
    }finally{__CLR4_5_2bhlbhllvlulk3h.R.flushNeeded();}}

    public void setReserved3(short reserved3) {try{__CLR4_5_2bhlbhllvlulk3h.R.inc(14999);
        __CLR4_5_2bhlbhllvlulk3h.R.inc(15000);this.reserved3 = reserved3;
    }finally{__CLR4_5_2bhlbhllvlulk3h.R.flushNeeded();}}

    public int getForegroundR() {try{__CLR4_5_2bhlbhllvlulk3h.R.inc(15001);
        __CLR4_5_2bhlbhllvlulk3h.R.inc(15002);return foregroundR;
    }finally{__CLR4_5_2bhlbhllvlulk3h.R.flushNeeded();}}

    public void setForegroundR(int foregroundR) {try{__CLR4_5_2bhlbhllvlulk3h.R.inc(15003);
        __CLR4_5_2bhlbhllvlulk3h.R.inc(15004);this.foregroundR = foregroundR;
    }finally{__CLR4_5_2bhlbhllvlulk3h.R.flushNeeded();}}

    public int getForegroundG() {try{__CLR4_5_2bhlbhllvlulk3h.R.inc(15005);
        __CLR4_5_2bhlbhllvlulk3h.R.inc(15006);return foregroundG;
    }finally{__CLR4_5_2bhlbhllvlulk3h.R.flushNeeded();}}

    public void setForegroundG(int foregroundG) {try{__CLR4_5_2bhlbhllvlulk3h.R.inc(15007);
        __CLR4_5_2bhlbhllvlulk3h.R.inc(15008);this.foregroundG = foregroundG;
    }finally{__CLR4_5_2bhlbhllvlulk3h.R.flushNeeded();}}

    public int getForegroundB() {try{__CLR4_5_2bhlbhllvlulk3h.R.inc(15009);
        __CLR4_5_2bhlbhllvlulk3h.R.inc(15010);return foregroundB;
    }finally{__CLR4_5_2bhlbhllvlulk3h.R.flushNeeded();}}

    public void setForegroundB(int foregroundB) {try{__CLR4_5_2bhlbhllvlulk3h.R.inc(15011);
        __CLR4_5_2bhlbhllvlulk3h.R.inc(15012);this.foregroundB = foregroundB;
    }finally{__CLR4_5_2bhlbhllvlulk3h.R.flushNeeded();}}

    public String getFontName() {try{__CLR4_5_2bhlbhllvlulk3h.R.inc(15013);
        __CLR4_5_2bhlbhllvlulk3h.R.inc(15014);return fontName;
    }finally{__CLR4_5_2bhlbhllvlulk3h.R.flushNeeded();}}

    public void setFontName(String fontName) {try{__CLR4_5_2bhlbhllvlulk3h.R.inc(15015);
        __CLR4_5_2bhlbhllvlulk3h.R.inc(15016);this.fontName = fontName;
    }finally{__CLR4_5_2bhlbhllvlulk3h.R.flushNeeded();}}


}
