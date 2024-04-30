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

package com.coremedia.iso.boxes.sampleentry;

import com.coremedia.iso.BoxParser;
import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;

import java.io.IOException;
import java.nio.ByteBuffer;

import com.googlecode.mp4parser.DataSource;

import java.nio.channels.WritableByteChannel;
import java.util.Arrays;

/**
 * <h1>4cc = "{@value #TYPE1}"</h1>
 * Entry type for timed text samples defined in the timed text specification (ISO/IEC 14496-17).
 */
public class TextSampleEntry extends AbstractSampleEntry {public static class __CLR4_5_239h39hlvlulcm0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,4472,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static final String TYPE1 = "tx3g";

    public static final String TYPE_ENCRYPTED = "enct";

/*  class TextSampleEntry() extends AbstractSampleEntry ('tx3g') {
    unsigned int(32)  displayFlags;
    signed int(8)     horizontal-justification;
    signed int(8)     vertical-justification;
    unsigned int(8)   background-color-rgba[4];
    BoxRecord         default-text-box;
    StyleRecord       default-style;
    FontTableBox      font-table;
  }
  */

    private long displayFlags; // 32 bits
    private int horizontalJustification; // 8 bit
    private int verticalJustification;  // 8 bit
    private int[] backgroundColorRgba = new int[4]; // 4 bytes
    private BoxRecord boxRecord = new BoxRecord();
    private StyleRecord styleRecord = new StyleRecord();

    public TextSampleEntry() {
        super(TYPE1);__CLR4_5_239h39hlvlulcm0.R.inc(4230);try{__CLR4_5_239h39hlvlulcm0.R.inc(4229);
    }finally{__CLR4_5_239h39hlvlulcm0.R.flushNeeded();}}

    public TextSampleEntry(String type) {
        super(type);__CLR4_5_239h39hlvlulcm0.R.inc(4232);try{__CLR4_5_239h39hlvlulcm0.R.inc(4231);
    }finally{__CLR4_5_239h39hlvlulcm0.R.flushNeeded();}}

    public void setType(String type) {try{__CLR4_5_239h39hlvlulcm0.R.inc(4233);
        __CLR4_5_239h39hlvlulcm0.R.inc(4234);this.type = type;
    }finally{__CLR4_5_239h39hlvlulcm0.R.flushNeeded();}}

    @Override
    public void parse(DataSource dataSource, ByteBuffer header, long contentSize, BoxParser boxParser) throws IOException {try{__CLR4_5_239h39hlvlulcm0.R.inc(4235);
        __CLR4_5_239h39hlvlulcm0.R.inc(4236);ByteBuffer content = ByteBuffer.allocate(38);
        __CLR4_5_239h39hlvlulcm0.R.inc(4237);dataSource.read(content);
        __CLR4_5_239h39hlvlulcm0.R.inc(4238);content.position(6);
        __CLR4_5_239h39hlvlulcm0.R.inc(4239);dataReferenceIndex = IsoTypeReader.readUInt16(content);
        __CLR4_5_239h39hlvlulcm0.R.inc(4240);displayFlags = IsoTypeReader.readUInt32(content);
        __CLR4_5_239h39hlvlulcm0.R.inc(4241);horizontalJustification = IsoTypeReader.readUInt8(content);
        __CLR4_5_239h39hlvlulcm0.R.inc(4242);verticalJustification = IsoTypeReader.readUInt8(content);
        __CLR4_5_239h39hlvlulcm0.R.inc(4243);backgroundColorRgba = new int[4];
        __CLR4_5_239h39hlvlulcm0.R.inc(4244);backgroundColorRgba[0] = IsoTypeReader.readUInt8(content);
        __CLR4_5_239h39hlvlulcm0.R.inc(4245);backgroundColorRgba[1] = IsoTypeReader.readUInt8(content);
        __CLR4_5_239h39hlvlulcm0.R.inc(4246);backgroundColorRgba[2] = IsoTypeReader.readUInt8(content);
        __CLR4_5_239h39hlvlulcm0.R.inc(4247);backgroundColorRgba[3] = IsoTypeReader.readUInt8(content);
        __CLR4_5_239h39hlvlulcm0.R.inc(4248);boxRecord = new BoxRecord();
        __CLR4_5_239h39hlvlulcm0.R.inc(4249);boxRecord.parse(content);

        __CLR4_5_239h39hlvlulcm0.R.inc(4250);styleRecord = new StyleRecord();
        __CLR4_5_239h39hlvlulcm0.R.inc(4251);styleRecord.parse(content);
        __CLR4_5_239h39hlvlulcm0.R.inc(4252);initContainer(dataSource, contentSize - 38, boxParser);
    }finally{__CLR4_5_239h39hlvlulcm0.R.flushNeeded();}}

    @Override
    public void getBox(WritableByteChannel writableByteChannel) throws IOException {try{__CLR4_5_239h39hlvlulcm0.R.inc(4253);
        __CLR4_5_239h39hlvlulcm0.R.inc(4254);writableByteChannel.write(getHeader());
        __CLR4_5_239h39hlvlulcm0.R.inc(4255);ByteBuffer byteBuffer = ByteBuffer.allocate(38);
        __CLR4_5_239h39hlvlulcm0.R.inc(4256);byteBuffer.position(6);
        __CLR4_5_239h39hlvlulcm0.R.inc(4257);IsoTypeWriter.writeUInt16(byteBuffer, dataReferenceIndex);
        __CLR4_5_239h39hlvlulcm0.R.inc(4258);IsoTypeWriter.writeUInt32(byteBuffer, displayFlags);
        __CLR4_5_239h39hlvlulcm0.R.inc(4259);IsoTypeWriter.writeUInt8(byteBuffer, horizontalJustification);
        __CLR4_5_239h39hlvlulcm0.R.inc(4260);IsoTypeWriter.writeUInt8(byteBuffer, verticalJustification);
        __CLR4_5_239h39hlvlulcm0.R.inc(4261);IsoTypeWriter.writeUInt8(byteBuffer, backgroundColorRgba[0]);
        __CLR4_5_239h39hlvlulcm0.R.inc(4262);IsoTypeWriter.writeUInt8(byteBuffer, backgroundColorRgba[1]);
        __CLR4_5_239h39hlvlulcm0.R.inc(4263);IsoTypeWriter.writeUInt8(byteBuffer, backgroundColorRgba[2]);
        __CLR4_5_239h39hlvlulcm0.R.inc(4264);IsoTypeWriter.writeUInt8(byteBuffer, backgroundColorRgba[3]);
        __CLR4_5_239h39hlvlulcm0.R.inc(4265);boxRecord.getContent(byteBuffer);
        __CLR4_5_239h39hlvlulcm0.R.inc(4266);styleRecord.getContent(byteBuffer);
        __CLR4_5_239h39hlvlulcm0.R.inc(4267);writableByteChannel.write((ByteBuffer) byteBuffer.rewind());
        __CLR4_5_239h39hlvlulcm0.R.inc(4268);writeContainer(writableByteChannel);
    }finally{__CLR4_5_239h39hlvlulcm0.R.flushNeeded();}}


    public String toString() {try{__CLR4_5_239h39hlvlulcm0.R.inc(4269);
        __CLR4_5_239h39hlvlulcm0.R.inc(4270);return "TextSampleEntry";
    }finally{__CLR4_5_239h39hlvlulcm0.R.flushNeeded();}}

    public BoxRecord getBoxRecord() {try{__CLR4_5_239h39hlvlulcm0.R.inc(4271);
        __CLR4_5_239h39hlvlulcm0.R.inc(4272);return boxRecord;
    }finally{__CLR4_5_239h39hlvlulcm0.R.flushNeeded();}}

    public void setBoxRecord(BoxRecord boxRecord) {try{__CLR4_5_239h39hlvlulcm0.R.inc(4273);
        __CLR4_5_239h39hlvlulcm0.R.inc(4274);this.boxRecord = boxRecord;
    }finally{__CLR4_5_239h39hlvlulcm0.R.flushNeeded();}}

    public StyleRecord getStyleRecord() {try{__CLR4_5_239h39hlvlulcm0.R.inc(4275);
        __CLR4_5_239h39hlvlulcm0.R.inc(4276);return styleRecord;
    }finally{__CLR4_5_239h39hlvlulcm0.R.flushNeeded();}}

    public void setStyleRecord(StyleRecord styleRecord) {try{__CLR4_5_239h39hlvlulcm0.R.inc(4277);
        __CLR4_5_239h39hlvlulcm0.R.inc(4278);this.styleRecord = styleRecord;
    }finally{__CLR4_5_239h39hlvlulcm0.R.flushNeeded();}}

    public boolean isScrollIn() {try{__CLR4_5_239h39hlvlulcm0.R.inc(4279);
        __CLR4_5_239h39hlvlulcm0.R.inc(4280);return (displayFlags & 0x00000020) == 0x00000020;
    }finally{__CLR4_5_239h39hlvlulcm0.R.flushNeeded();}}

    public void setScrollIn(boolean scrollIn) {try{__CLR4_5_239h39hlvlulcm0.R.inc(4281);
        __CLR4_5_239h39hlvlulcm0.R.inc(4282);if ((((scrollIn)&&(__CLR4_5_239h39hlvlulcm0.R.iget(4283)!=0|true))||(__CLR4_5_239h39hlvlulcm0.R.iget(4284)==0&false))) {{
            __CLR4_5_239h39hlvlulcm0.R.inc(4285);displayFlags |= 0x00000020;
        } }else {{
            __CLR4_5_239h39hlvlulcm0.R.inc(4286);displayFlags &= ~0x00000020;
        }
    }}finally{__CLR4_5_239h39hlvlulcm0.R.flushNeeded();}}

    public boolean isScrollOut() {try{__CLR4_5_239h39hlvlulcm0.R.inc(4287);
        __CLR4_5_239h39hlvlulcm0.R.inc(4288);return (displayFlags & 0x00000040) == 0x00000040;
    }finally{__CLR4_5_239h39hlvlulcm0.R.flushNeeded();}}

    public void setScrollOut(boolean scrollOutIn) {try{__CLR4_5_239h39hlvlulcm0.R.inc(4289);
        __CLR4_5_239h39hlvlulcm0.R.inc(4290);if ((((scrollOutIn)&&(__CLR4_5_239h39hlvlulcm0.R.iget(4291)!=0|true))||(__CLR4_5_239h39hlvlulcm0.R.iget(4292)==0&false))) {{
            __CLR4_5_239h39hlvlulcm0.R.inc(4293);displayFlags |= 0x00000040;
        } }else {{
            __CLR4_5_239h39hlvlulcm0.R.inc(4294);displayFlags &= ~0x00000040;
        }
    }}finally{__CLR4_5_239h39hlvlulcm0.R.flushNeeded();}}

    public boolean isScrollDirection() {try{__CLR4_5_239h39hlvlulcm0.R.inc(4295);
        __CLR4_5_239h39hlvlulcm0.R.inc(4296);return (displayFlags & 0x00000180) == 0x00000180;
    }finally{__CLR4_5_239h39hlvlulcm0.R.flushNeeded();}}

    public void setScrollDirection(boolean scrollOutIn) {try{__CLR4_5_239h39hlvlulcm0.R.inc(4297);
        __CLR4_5_239h39hlvlulcm0.R.inc(4298);if ((((scrollOutIn)&&(__CLR4_5_239h39hlvlulcm0.R.iget(4299)!=0|true))||(__CLR4_5_239h39hlvlulcm0.R.iget(4300)==0&false))) {{
            __CLR4_5_239h39hlvlulcm0.R.inc(4301);displayFlags |= 0x00000180;
        } }else {{
            __CLR4_5_239h39hlvlulcm0.R.inc(4302);displayFlags &= ~0x00000180;
        }
    }}finally{__CLR4_5_239h39hlvlulcm0.R.flushNeeded();}}

    public boolean isContinuousKaraoke() {try{__CLR4_5_239h39hlvlulcm0.R.inc(4303);
        __CLR4_5_239h39hlvlulcm0.R.inc(4304);return (displayFlags & 0x00000800) == 0x00000800;
    }finally{__CLR4_5_239h39hlvlulcm0.R.flushNeeded();}}

    public void setContinuousKaraoke(boolean continuousKaraoke) {try{__CLR4_5_239h39hlvlulcm0.R.inc(4305);
        __CLR4_5_239h39hlvlulcm0.R.inc(4306);if ((((continuousKaraoke)&&(__CLR4_5_239h39hlvlulcm0.R.iget(4307)!=0|true))||(__CLR4_5_239h39hlvlulcm0.R.iget(4308)==0&false))) {{
            __CLR4_5_239h39hlvlulcm0.R.inc(4309);displayFlags |= 0x00000800;
        } }else {{
            __CLR4_5_239h39hlvlulcm0.R.inc(4310);displayFlags &= ~0x00000800;
        }
    }}finally{__CLR4_5_239h39hlvlulcm0.R.flushNeeded();}}

    public boolean isWriteTextVertically() {try{__CLR4_5_239h39hlvlulcm0.R.inc(4311);
        __CLR4_5_239h39hlvlulcm0.R.inc(4312);return (displayFlags & 0x00020000) == 0x00020000;
    }finally{__CLR4_5_239h39hlvlulcm0.R.flushNeeded();}}

    public void setWriteTextVertically(boolean writeTextVertically) {try{__CLR4_5_239h39hlvlulcm0.R.inc(4313);
        __CLR4_5_239h39hlvlulcm0.R.inc(4314);if ((((writeTextVertically)&&(__CLR4_5_239h39hlvlulcm0.R.iget(4315)!=0|true))||(__CLR4_5_239h39hlvlulcm0.R.iget(4316)==0&false))) {{
            __CLR4_5_239h39hlvlulcm0.R.inc(4317);displayFlags |= 0x00020000;
        } }else {{
            __CLR4_5_239h39hlvlulcm0.R.inc(4318);displayFlags &= ~0x00020000;
        }
    }}finally{__CLR4_5_239h39hlvlulcm0.R.flushNeeded();}}


    public boolean isFillTextRegion() {try{__CLR4_5_239h39hlvlulcm0.R.inc(4319);
        __CLR4_5_239h39hlvlulcm0.R.inc(4320);return (displayFlags & 0x00040000) == 0x00040000;
    }finally{__CLR4_5_239h39hlvlulcm0.R.flushNeeded();}}

    public void setFillTextRegion(boolean fillTextRegion) {try{__CLR4_5_239h39hlvlulcm0.R.inc(4321);
        __CLR4_5_239h39hlvlulcm0.R.inc(4322);if ((((fillTextRegion)&&(__CLR4_5_239h39hlvlulcm0.R.iget(4323)!=0|true))||(__CLR4_5_239h39hlvlulcm0.R.iget(4324)==0&false))) {{
            __CLR4_5_239h39hlvlulcm0.R.inc(4325);displayFlags |= 0x00040000;
        } }else {{
            __CLR4_5_239h39hlvlulcm0.R.inc(4326);displayFlags &= ~0x00040000;
        }
    }}finally{__CLR4_5_239h39hlvlulcm0.R.flushNeeded();}}


    public int getHorizontalJustification() {try{__CLR4_5_239h39hlvlulcm0.R.inc(4327);
        __CLR4_5_239h39hlvlulcm0.R.inc(4328);return horizontalJustification;
    }finally{__CLR4_5_239h39hlvlulcm0.R.flushNeeded();}}

    public void setHorizontalJustification(int horizontalJustification) {try{__CLR4_5_239h39hlvlulcm0.R.inc(4329);
        __CLR4_5_239h39hlvlulcm0.R.inc(4330);this.horizontalJustification = horizontalJustification;
    }finally{__CLR4_5_239h39hlvlulcm0.R.flushNeeded();}}

    public int getVerticalJustification() {try{__CLR4_5_239h39hlvlulcm0.R.inc(4331);
        __CLR4_5_239h39hlvlulcm0.R.inc(4332);return verticalJustification;
    }finally{__CLR4_5_239h39hlvlulcm0.R.flushNeeded();}}

    public void setVerticalJustification(int verticalJustification) {try{__CLR4_5_239h39hlvlulcm0.R.inc(4333);
        __CLR4_5_239h39hlvlulcm0.R.inc(4334);this.verticalJustification = verticalJustification;
    }finally{__CLR4_5_239h39hlvlulcm0.R.flushNeeded();}}

    public int[] getBackgroundColorRgba() {try{__CLR4_5_239h39hlvlulcm0.R.inc(4335);
        __CLR4_5_239h39hlvlulcm0.R.inc(4336);return backgroundColorRgba;
    }finally{__CLR4_5_239h39hlvlulcm0.R.flushNeeded();}}

    public void setBackgroundColorRgba(int[] backgroundColorRgba) {try{__CLR4_5_239h39hlvlulcm0.R.inc(4337);
        __CLR4_5_239h39hlvlulcm0.R.inc(4338);this.backgroundColorRgba = backgroundColorRgba;
    }finally{__CLR4_5_239h39hlvlulcm0.R.flushNeeded();}}

    public static class BoxRecord {
        int top;
        int left;
        int bottom;
        int right;

        public BoxRecord() {try{__CLR4_5_239h39hlvlulcm0.R.inc(4339);
        }finally{__CLR4_5_239h39hlvlulcm0.R.flushNeeded();}}

        public BoxRecord(int top, int left, int bottom, int right) {try{__CLR4_5_239h39hlvlulcm0.R.inc(4340);
            __CLR4_5_239h39hlvlulcm0.R.inc(4341);this.top = top;
            __CLR4_5_239h39hlvlulcm0.R.inc(4342);this.left = left;
            __CLR4_5_239h39hlvlulcm0.R.inc(4343);this.bottom = bottom;
            __CLR4_5_239h39hlvlulcm0.R.inc(4344);this.right = right;
        }finally{__CLR4_5_239h39hlvlulcm0.R.flushNeeded();}}

        public void parse(ByteBuffer in) {try{__CLR4_5_239h39hlvlulcm0.R.inc(4345);
            __CLR4_5_239h39hlvlulcm0.R.inc(4346);top = IsoTypeReader.readUInt16(in);
            __CLR4_5_239h39hlvlulcm0.R.inc(4347);left = IsoTypeReader.readUInt16(in);
            __CLR4_5_239h39hlvlulcm0.R.inc(4348);bottom = IsoTypeReader.readUInt16(in);
            __CLR4_5_239h39hlvlulcm0.R.inc(4349);right = IsoTypeReader.readUInt16(in);
        }finally{__CLR4_5_239h39hlvlulcm0.R.flushNeeded();}}

        public void getContent(ByteBuffer bb) {try{__CLR4_5_239h39hlvlulcm0.R.inc(4350);
            __CLR4_5_239h39hlvlulcm0.R.inc(4351);IsoTypeWriter.writeUInt16(bb, top);
            __CLR4_5_239h39hlvlulcm0.R.inc(4352);IsoTypeWriter.writeUInt16(bb, left);
            __CLR4_5_239h39hlvlulcm0.R.inc(4353);IsoTypeWriter.writeUInt16(bb, bottom);
            __CLR4_5_239h39hlvlulcm0.R.inc(4354);IsoTypeWriter.writeUInt16(bb, right);
        }finally{__CLR4_5_239h39hlvlulcm0.R.flushNeeded();}}

        public int getSize() {try{__CLR4_5_239h39hlvlulcm0.R.inc(4355);
            __CLR4_5_239h39hlvlulcm0.R.inc(4356);return 8;
        }finally{__CLR4_5_239h39hlvlulcm0.R.flushNeeded();}}

        @Override
        public boolean equals(Object o) {try{__CLR4_5_239h39hlvlulcm0.R.inc(4357);
            __CLR4_5_239h39hlvlulcm0.R.inc(4358);if ((((this == o)&&(__CLR4_5_239h39hlvlulcm0.R.iget(4359)!=0|true))||(__CLR4_5_239h39hlvlulcm0.R.iget(4360)==0&false))) {__CLR4_5_239h39hlvlulcm0.R.inc(4361);return true;
            }__CLR4_5_239h39hlvlulcm0.R.inc(4362);if ((((o == null || getClass() != o.getClass())&&(__CLR4_5_239h39hlvlulcm0.R.iget(4363)!=0|true))||(__CLR4_5_239h39hlvlulcm0.R.iget(4364)==0&false))) {__CLR4_5_239h39hlvlulcm0.R.inc(4365);return false;

            }__CLR4_5_239h39hlvlulcm0.R.inc(4366);BoxRecord boxRecord = (BoxRecord) o;

            __CLR4_5_239h39hlvlulcm0.R.inc(4367);if ((((bottom != boxRecord.bottom)&&(__CLR4_5_239h39hlvlulcm0.R.iget(4368)!=0|true))||(__CLR4_5_239h39hlvlulcm0.R.iget(4369)==0&false))) {__CLR4_5_239h39hlvlulcm0.R.inc(4370);return false;
            }__CLR4_5_239h39hlvlulcm0.R.inc(4371);if ((((left != boxRecord.left)&&(__CLR4_5_239h39hlvlulcm0.R.iget(4372)!=0|true))||(__CLR4_5_239h39hlvlulcm0.R.iget(4373)==0&false))) {__CLR4_5_239h39hlvlulcm0.R.inc(4374);return false;
            }__CLR4_5_239h39hlvlulcm0.R.inc(4375);if ((((right != boxRecord.right)&&(__CLR4_5_239h39hlvlulcm0.R.iget(4376)!=0|true))||(__CLR4_5_239h39hlvlulcm0.R.iget(4377)==0&false))) {__CLR4_5_239h39hlvlulcm0.R.inc(4378);return false;
            }__CLR4_5_239h39hlvlulcm0.R.inc(4379);if ((((top != boxRecord.top)&&(__CLR4_5_239h39hlvlulcm0.R.iget(4380)!=0|true))||(__CLR4_5_239h39hlvlulcm0.R.iget(4381)==0&false))) {__CLR4_5_239h39hlvlulcm0.R.inc(4382);return false;

            }__CLR4_5_239h39hlvlulcm0.R.inc(4383);return true;
        }finally{__CLR4_5_239h39hlvlulcm0.R.flushNeeded();}}

        @Override
        public int hashCode() {try{__CLR4_5_239h39hlvlulcm0.R.inc(4384);
            __CLR4_5_239h39hlvlulcm0.R.inc(4385);int result = top;
            __CLR4_5_239h39hlvlulcm0.R.inc(4386);result = 31 * result + left;
            __CLR4_5_239h39hlvlulcm0.R.inc(4387);result = 31 * result + bottom;
            __CLR4_5_239h39hlvlulcm0.R.inc(4388);result = 31 * result + right;
            __CLR4_5_239h39hlvlulcm0.R.inc(4389);return result;
        }finally{__CLR4_5_239h39hlvlulcm0.R.flushNeeded();}}
    }

    /*
    class FontRecord {
	unsigned int(16) 	font-ID;
	unsigned int(8)	font-name-length;
	unsigned int(8)	font[font-name-length];
}
     */


    /*
   aligned(8) class StyleRecord {
   unsigned int(16) 	startChar;
   unsigned int(16)	endChar;
   unsigned int(16)	font-ID;
   unsigned int(8)	face-style-flags;
   unsigned int(8)	font-size;
   unsigned int(8)	text-color-rgba[4];
}
    */
    public static class StyleRecord {
        int startChar;
        int endChar;
        int fontId;
        int faceStyleFlags;
        int fontSize;
        int[] textColor = new int[]{0xff, 0xff, 0xff, 0xff};

        public StyleRecord() {try{__CLR4_5_239h39hlvlulcm0.R.inc(4390);
        }finally{__CLR4_5_239h39hlvlulcm0.R.flushNeeded();}}

        public StyleRecord(int startChar, int endChar, int fontId, int faceStyleFlags, int fontSize, int[] textColor) {try{__CLR4_5_239h39hlvlulcm0.R.inc(4391);
            __CLR4_5_239h39hlvlulcm0.R.inc(4392);this.startChar = startChar;
            __CLR4_5_239h39hlvlulcm0.R.inc(4393);this.endChar = endChar;
            __CLR4_5_239h39hlvlulcm0.R.inc(4394);this.fontId = fontId;
            __CLR4_5_239h39hlvlulcm0.R.inc(4395);this.faceStyleFlags = faceStyleFlags;
            __CLR4_5_239h39hlvlulcm0.R.inc(4396);this.fontSize = fontSize;
            __CLR4_5_239h39hlvlulcm0.R.inc(4397);this.textColor = textColor;
        }finally{__CLR4_5_239h39hlvlulcm0.R.flushNeeded();}}

        public void parse(ByteBuffer in) {try{__CLR4_5_239h39hlvlulcm0.R.inc(4398);
            __CLR4_5_239h39hlvlulcm0.R.inc(4399);startChar = IsoTypeReader.readUInt16(in);
            __CLR4_5_239h39hlvlulcm0.R.inc(4400);endChar = IsoTypeReader.readUInt16(in);
            __CLR4_5_239h39hlvlulcm0.R.inc(4401);fontId = IsoTypeReader.readUInt16(in);
            __CLR4_5_239h39hlvlulcm0.R.inc(4402);faceStyleFlags = IsoTypeReader.readUInt8(in);
            __CLR4_5_239h39hlvlulcm0.R.inc(4403);fontSize = IsoTypeReader.readUInt8(in);
            __CLR4_5_239h39hlvlulcm0.R.inc(4404);textColor = new int[4];
            __CLR4_5_239h39hlvlulcm0.R.inc(4405);textColor[0] = IsoTypeReader.readUInt8(in);
            __CLR4_5_239h39hlvlulcm0.R.inc(4406);textColor[1] = IsoTypeReader.readUInt8(in);
            __CLR4_5_239h39hlvlulcm0.R.inc(4407);textColor[2] = IsoTypeReader.readUInt8(in);
            __CLR4_5_239h39hlvlulcm0.R.inc(4408);textColor[3] = IsoTypeReader.readUInt8(in);
        }finally{__CLR4_5_239h39hlvlulcm0.R.flushNeeded();}}


        public void getContent(ByteBuffer bb) {try{__CLR4_5_239h39hlvlulcm0.R.inc(4409);
            __CLR4_5_239h39hlvlulcm0.R.inc(4410);IsoTypeWriter.writeUInt16(bb, startChar);
            __CLR4_5_239h39hlvlulcm0.R.inc(4411);IsoTypeWriter.writeUInt16(bb, endChar);
            __CLR4_5_239h39hlvlulcm0.R.inc(4412);IsoTypeWriter.writeUInt16(bb, fontId);
            __CLR4_5_239h39hlvlulcm0.R.inc(4413);IsoTypeWriter.writeUInt8(bb, faceStyleFlags);
            __CLR4_5_239h39hlvlulcm0.R.inc(4414);IsoTypeWriter.writeUInt8(bb, fontSize);
            __CLR4_5_239h39hlvlulcm0.R.inc(4415);IsoTypeWriter.writeUInt8(bb, textColor[0]);
            __CLR4_5_239h39hlvlulcm0.R.inc(4416);IsoTypeWriter.writeUInt8(bb, textColor[1]);
            __CLR4_5_239h39hlvlulcm0.R.inc(4417);IsoTypeWriter.writeUInt8(bb, textColor[2]);
            __CLR4_5_239h39hlvlulcm0.R.inc(4418);IsoTypeWriter.writeUInt8(bb, textColor[3]);
        }finally{__CLR4_5_239h39hlvlulcm0.R.flushNeeded();}}

        @Override
        public boolean equals(Object o) {try{__CLR4_5_239h39hlvlulcm0.R.inc(4419);
            __CLR4_5_239h39hlvlulcm0.R.inc(4420);if ((((this == o)&&(__CLR4_5_239h39hlvlulcm0.R.iget(4421)!=0|true))||(__CLR4_5_239h39hlvlulcm0.R.iget(4422)==0&false))) {__CLR4_5_239h39hlvlulcm0.R.inc(4423);return true;
            }__CLR4_5_239h39hlvlulcm0.R.inc(4424);if ((((o == null || getClass() != o.getClass())&&(__CLR4_5_239h39hlvlulcm0.R.iget(4425)!=0|true))||(__CLR4_5_239h39hlvlulcm0.R.iget(4426)==0&false))) {__CLR4_5_239h39hlvlulcm0.R.inc(4427);return false;

            }__CLR4_5_239h39hlvlulcm0.R.inc(4428);StyleRecord that = (StyleRecord) o;

            __CLR4_5_239h39hlvlulcm0.R.inc(4429);if ((((endChar != that.endChar)&&(__CLR4_5_239h39hlvlulcm0.R.iget(4430)!=0|true))||(__CLR4_5_239h39hlvlulcm0.R.iget(4431)==0&false))) {__CLR4_5_239h39hlvlulcm0.R.inc(4432);return false;
            }__CLR4_5_239h39hlvlulcm0.R.inc(4433);if ((((faceStyleFlags != that.faceStyleFlags)&&(__CLR4_5_239h39hlvlulcm0.R.iget(4434)!=0|true))||(__CLR4_5_239h39hlvlulcm0.R.iget(4435)==0&false))) {__CLR4_5_239h39hlvlulcm0.R.inc(4436);return false;
            }__CLR4_5_239h39hlvlulcm0.R.inc(4437);if ((((fontId != that.fontId)&&(__CLR4_5_239h39hlvlulcm0.R.iget(4438)!=0|true))||(__CLR4_5_239h39hlvlulcm0.R.iget(4439)==0&false))) {__CLR4_5_239h39hlvlulcm0.R.inc(4440);return false;
            }__CLR4_5_239h39hlvlulcm0.R.inc(4441);if ((((fontSize != that.fontSize)&&(__CLR4_5_239h39hlvlulcm0.R.iget(4442)!=0|true))||(__CLR4_5_239h39hlvlulcm0.R.iget(4443)==0&false))) {__CLR4_5_239h39hlvlulcm0.R.inc(4444);return false;
            }__CLR4_5_239h39hlvlulcm0.R.inc(4445);if ((((startChar != that.startChar)&&(__CLR4_5_239h39hlvlulcm0.R.iget(4446)!=0|true))||(__CLR4_5_239h39hlvlulcm0.R.iget(4447)==0&false))) {__CLR4_5_239h39hlvlulcm0.R.inc(4448);return false;
            }__CLR4_5_239h39hlvlulcm0.R.inc(4449);if ((((!Arrays.equals(textColor, that.textColor))&&(__CLR4_5_239h39hlvlulcm0.R.iget(4450)!=0|true))||(__CLR4_5_239h39hlvlulcm0.R.iget(4451)==0&false))) {__CLR4_5_239h39hlvlulcm0.R.inc(4452);return false;

            }__CLR4_5_239h39hlvlulcm0.R.inc(4453);return true;
        }finally{__CLR4_5_239h39hlvlulcm0.R.flushNeeded();}}

        @Override
        public int hashCode() {try{__CLR4_5_239h39hlvlulcm0.R.inc(4454);
            __CLR4_5_239h39hlvlulcm0.R.inc(4455);int result = startChar;
            __CLR4_5_239h39hlvlulcm0.R.inc(4456);result = 31 * result + endChar;
            __CLR4_5_239h39hlvlulcm0.R.inc(4457);result = 31 * result + fontId;
            __CLR4_5_239h39hlvlulcm0.R.inc(4458);result = 31 * result + faceStyleFlags;
            __CLR4_5_239h39hlvlulcm0.R.inc(4459);result = 31 * result + fontSize;
            __CLR4_5_239h39hlvlulcm0.R.inc(4460);result = 31 * result + ((((textColor != null )&&(__CLR4_5_239h39hlvlulcm0.R.iget(4461)!=0|true))||(__CLR4_5_239h39hlvlulcm0.R.iget(4462)==0&false))? Arrays.hashCode(textColor) : 0);
            __CLR4_5_239h39hlvlulcm0.R.inc(4463);return result;
        }finally{__CLR4_5_239h39hlvlulcm0.R.flushNeeded();}}

        public int getSize() {try{__CLR4_5_239h39hlvlulcm0.R.inc(4464);
            __CLR4_5_239h39hlvlulcm0.R.inc(4465);return 12;
        }finally{__CLR4_5_239h39hlvlulcm0.R.flushNeeded();}}
    }

    @Override
    public long getSize() {try{__CLR4_5_239h39hlvlulcm0.R.inc(4466);
        __CLR4_5_239h39hlvlulcm0.R.inc(4467);long s = getContainerSize();
        __CLR4_5_239h39hlvlulcm0.R.inc(4468);long t = 38; // bytes to container start
        __CLR4_5_239h39hlvlulcm0.R.inc(4469);return s + t + (((((largeBox || (s + t) >= (1L << 32)) )&&(__CLR4_5_239h39hlvlulcm0.R.iget(4470)!=0|true))||(__CLR4_5_239h39hlvlulcm0.R.iget(4471)==0&false))? 16 : 8);

    }finally{__CLR4_5_239h39hlvlulcm0.R.flushNeeded();}}


}
