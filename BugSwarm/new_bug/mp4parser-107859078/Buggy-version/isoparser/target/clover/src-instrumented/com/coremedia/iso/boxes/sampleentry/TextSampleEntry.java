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
public class TextSampleEntry extends AbstractSampleEntry {public static class __CLR4_5_238k38klvl9efq6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,4439,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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
        super(TYPE1);__CLR4_5_238k38klvl9efq6.R.inc(4197);try{__CLR4_5_238k38klvl9efq6.R.inc(4196);
    }finally{__CLR4_5_238k38klvl9efq6.R.flushNeeded();}}

    public TextSampleEntry(String type) {
        super(type);__CLR4_5_238k38klvl9efq6.R.inc(4199);try{__CLR4_5_238k38klvl9efq6.R.inc(4198);
    }finally{__CLR4_5_238k38klvl9efq6.R.flushNeeded();}}

    public void setType(String type) {try{__CLR4_5_238k38klvl9efq6.R.inc(4200);
        __CLR4_5_238k38klvl9efq6.R.inc(4201);this.type = type;
    }finally{__CLR4_5_238k38klvl9efq6.R.flushNeeded();}}

    @Override
    public void parse(DataSource dataSource, ByteBuffer header, long contentSize, BoxParser boxParser) throws IOException {try{__CLR4_5_238k38klvl9efq6.R.inc(4202);
        __CLR4_5_238k38klvl9efq6.R.inc(4203);ByteBuffer content = ByteBuffer.allocate(38);
        __CLR4_5_238k38klvl9efq6.R.inc(4204);dataSource.read(content);
        __CLR4_5_238k38klvl9efq6.R.inc(4205);content.position(6);
        __CLR4_5_238k38klvl9efq6.R.inc(4206);dataReferenceIndex = IsoTypeReader.readUInt16(content);
        __CLR4_5_238k38klvl9efq6.R.inc(4207);displayFlags = IsoTypeReader.readUInt32(content);
        __CLR4_5_238k38klvl9efq6.R.inc(4208);horizontalJustification = IsoTypeReader.readUInt8(content);
        __CLR4_5_238k38klvl9efq6.R.inc(4209);verticalJustification = IsoTypeReader.readUInt8(content);
        __CLR4_5_238k38klvl9efq6.R.inc(4210);backgroundColorRgba = new int[4];
        __CLR4_5_238k38klvl9efq6.R.inc(4211);backgroundColorRgba[0] = IsoTypeReader.readUInt8(content);
        __CLR4_5_238k38klvl9efq6.R.inc(4212);backgroundColorRgba[1] = IsoTypeReader.readUInt8(content);
        __CLR4_5_238k38klvl9efq6.R.inc(4213);backgroundColorRgba[2] = IsoTypeReader.readUInt8(content);
        __CLR4_5_238k38klvl9efq6.R.inc(4214);backgroundColorRgba[3] = IsoTypeReader.readUInt8(content);
        __CLR4_5_238k38klvl9efq6.R.inc(4215);boxRecord = new BoxRecord();
        __CLR4_5_238k38klvl9efq6.R.inc(4216);boxRecord.parse(content);

        __CLR4_5_238k38klvl9efq6.R.inc(4217);styleRecord = new StyleRecord();
        __CLR4_5_238k38klvl9efq6.R.inc(4218);styleRecord.parse(content);
        __CLR4_5_238k38klvl9efq6.R.inc(4219);initContainer(dataSource, contentSize - 38, boxParser);
    }finally{__CLR4_5_238k38klvl9efq6.R.flushNeeded();}}

    @Override
    public void getBox(WritableByteChannel writableByteChannel) throws IOException {try{__CLR4_5_238k38klvl9efq6.R.inc(4220);
        __CLR4_5_238k38klvl9efq6.R.inc(4221);writableByteChannel.write(getHeader());
        __CLR4_5_238k38klvl9efq6.R.inc(4222);ByteBuffer byteBuffer = ByteBuffer.allocate(38);
        __CLR4_5_238k38klvl9efq6.R.inc(4223);byteBuffer.position(6);
        __CLR4_5_238k38klvl9efq6.R.inc(4224);IsoTypeWriter.writeUInt16(byteBuffer, dataReferenceIndex);
        __CLR4_5_238k38klvl9efq6.R.inc(4225);IsoTypeWriter.writeUInt32(byteBuffer, displayFlags);
        __CLR4_5_238k38klvl9efq6.R.inc(4226);IsoTypeWriter.writeUInt8(byteBuffer, horizontalJustification);
        __CLR4_5_238k38klvl9efq6.R.inc(4227);IsoTypeWriter.writeUInt8(byteBuffer, verticalJustification);
        __CLR4_5_238k38klvl9efq6.R.inc(4228);IsoTypeWriter.writeUInt8(byteBuffer, backgroundColorRgba[0]);
        __CLR4_5_238k38klvl9efq6.R.inc(4229);IsoTypeWriter.writeUInt8(byteBuffer, backgroundColorRgba[1]);
        __CLR4_5_238k38klvl9efq6.R.inc(4230);IsoTypeWriter.writeUInt8(byteBuffer, backgroundColorRgba[2]);
        __CLR4_5_238k38klvl9efq6.R.inc(4231);IsoTypeWriter.writeUInt8(byteBuffer, backgroundColorRgba[3]);
        __CLR4_5_238k38klvl9efq6.R.inc(4232);boxRecord.getContent(byteBuffer);
        __CLR4_5_238k38klvl9efq6.R.inc(4233);styleRecord.getContent(byteBuffer);
        __CLR4_5_238k38klvl9efq6.R.inc(4234);writableByteChannel.write((ByteBuffer) byteBuffer.rewind());
        __CLR4_5_238k38klvl9efq6.R.inc(4235);writeContainer(writableByteChannel);
    }finally{__CLR4_5_238k38klvl9efq6.R.flushNeeded();}}


    public String toString() {try{__CLR4_5_238k38klvl9efq6.R.inc(4236);
        __CLR4_5_238k38klvl9efq6.R.inc(4237);return "TextSampleEntry";
    }finally{__CLR4_5_238k38klvl9efq6.R.flushNeeded();}}

    public BoxRecord getBoxRecord() {try{__CLR4_5_238k38klvl9efq6.R.inc(4238);
        __CLR4_5_238k38klvl9efq6.R.inc(4239);return boxRecord;
    }finally{__CLR4_5_238k38klvl9efq6.R.flushNeeded();}}

    public void setBoxRecord(BoxRecord boxRecord) {try{__CLR4_5_238k38klvl9efq6.R.inc(4240);
        __CLR4_5_238k38klvl9efq6.R.inc(4241);this.boxRecord = boxRecord;
    }finally{__CLR4_5_238k38klvl9efq6.R.flushNeeded();}}

    public StyleRecord getStyleRecord() {try{__CLR4_5_238k38klvl9efq6.R.inc(4242);
        __CLR4_5_238k38klvl9efq6.R.inc(4243);return styleRecord;
    }finally{__CLR4_5_238k38klvl9efq6.R.flushNeeded();}}

    public void setStyleRecord(StyleRecord styleRecord) {try{__CLR4_5_238k38klvl9efq6.R.inc(4244);
        __CLR4_5_238k38klvl9efq6.R.inc(4245);this.styleRecord = styleRecord;
    }finally{__CLR4_5_238k38klvl9efq6.R.flushNeeded();}}

    public boolean isScrollIn() {try{__CLR4_5_238k38klvl9efq6.R.inc(4246);
        __CLR4_5_238k38klvl9efq6.R.inc(4247);return (displayFlags & 0x00000020) == 0x00000020;
    }finally{__CLR4_5_238k38klvl9efq6.R.flushNeeded();}}

    public void setScrollIn(boolean scrollIn) {try{__CLR4_5_238k38klvl9efq6.R.inc(4248);
        __CLR4_5_238k38klvl9efq6.R.inc(4249);if ((((scrollIn)&&(__CLR4_5_238k38klvl9efq6.R.iget(4250)!=0|true))||(__CLR4_5_238k38klvl9efq6.R.iget(4251)==0&false))) {{
            __CLR4_5_238k38klvl9efq6.R.inc(4252);displayFlags |= 0x00000020;
        } }else {{
            __CLR4_5_238k38klvl9efq6.R.inc(4253);displayFlags &= ~0x00000020;
        }
    }}finally{__CLR4_5_238k38klvl9efq6.R.flushNeeded();}}

    public boolean isScrollOut() {try{__CLR4_5_238k38klvl9efq6.R.inc(4254);
        __CLR4_5_238k38klvl9efq6.R.inc(4255);return (displayFlags & 0x00000040) == 0x00000040;
    }finally{__CLR4_5_238k38klvl9efq6.R.flushNeeded();}}

    public void setScrollOut(boolean scrollOutIn) {try{__CLR4_5_238k38klvl9efq6.R.inc(4256);
        __CLR4_5_238k38klvl9efq6.R.inc(4257);if ((((scrollOutIn)&&(__CLR4_5_238k38klvl9efq6.R.iget(4258)!=0|true))||(__CLR4_5_238k38klvl9efq6.R.iget(4259)==0&false))) {{
            __CLR4_5_238k38klvl9efq6.R.inc(4260);displayFlags |= 0x00000040;
        } }else {{
            __CLR4_5_238k38klvl9efq6.R.inc(4261);displayFlags &= ~0x00000040;
        }
    }}finally{__CLR4_5_238k38klvl9efq6.R.flushNeeded();}}

    public boolean isScrollDirection() {try{__CLR4_5_238k38klvl9efq6.R.inc(4262);
        __CLR4_5_238k38klvl9efq6.R.inc(4263);return (displayFlags & 0x00000180) == 0x00000180;
    }finally{__CLR4_5_238k38klvl9efq6.R.flushNeeded();}}

    public void setScrollDirection(boolean scrollOutIn) {try{__CLR4_5_238k38klvl9efq6.R.inc(4264);
        __CLR4_5_238k38klvl9efq6.R.inc(4265);if ((((scrollOutIn)&&(__CLR4_5_238k38klvl9efq6.R.iget(4266)!=0|true))||(__CLR4_5_238k38klvl9efq6.R.iget(4267)==0&false))) {{
            __CLR4_5_238k38klvl9efq6.R.inc(4268);displayFlags |= 0x00000180;
        } }else {{
            __CLR4_5_238k38klvl9efq6.R.inc(4269);displayFlags &= ~0x00000180;
        }
    }}finally{__CLR4_5_238k38klvl9efq6.R.flushNeeded();}}

    public boolean isContinuousKaraoke() {try{__CLR4_5_238k38klvl9efq6.R.inc(4270);
        __CLR4_5_238k38klvl9efq6.R.inc(4271);return (displayFlags & 0x00000800) == 0x00000800;
    }finally{__CLR4_5_238k38klvl9efq6.R.flushNeeded();}}

    public void setContinuousKaraoke(boolean continuousKaraoke) {try{__CLR4_5_238k38klvl9efq6.R.inc(4272);
        __CLR4_5_238k38klvl9efq6.R.inc(4273);if ((((continuousKaraoke)&&(__CLR4_5_238k38klvl9efq6.R.iget(4274)!=0|true))||(__CLR4_5_238k38klvl9efq6.R.iget(4275)==0&false))) {{
            __CLR4_5_238k38klvl9efq6.R.inc(4276);displayFlags |= 0x00000800;
        } }else {{
            __CLR4_5_238k38klvl9efq6.R.inc(4277);displayFlags &= ~0x00000800;
        }
    }}finally{__CLR4_5_238k38klvl9efq6.R.flushNeeded();}}

    public boolean isWriteTextVertically() {try{__CLR4_5_238k38klvl9efq6.R.inc(4278);
        __CLR4_5_238k38klvl9efq6.R.inc(4279);return (displayFlags & 0x00020000) == 0x00020000;
    }finally{__CLR4_5_238k38klvl9efq6.R.flushNeeded();}}

    public void setWriteTextVertically(boolean writeTextVertically) {try{__CLR4_5_238k38klvl9efq6.R.inc(4280);
        __CLR4_5_238k38klvl9efq6.R.inc(4281);if ((((writeTextVertically)&&(__CLR4_5_238k38klvl9efq6.R.iget(4282)!=0|true))||(__CLR4_5_238k38klvl9efq6.R.iget(4283)==0&false))) {{
            __CLR4_5_238k38klvl9efq6.R.inc(4284);displayFlags |= 0x00020000;
        } }else {{
            __CLR4_5_238k38klvl9efq6.R.inc(4285);displayFlags &= ~0x00020000;
        }
    }}finally{__CLR4_5_238k38klvl9efq6.R.flushNeeded();}}


    public boolean isFillTextRegion() {try{__CLR4_5_238k38klvl9efq6.R.inc(4286);
        __CLR4_5_238k38klvl9efq6.R.inc(4287);return (displayFlags & 0x00040000) == 0x00040000;
    }finally{__CLR4_5_238k38klvl9efq6.R.flushNeeded();}}

    public void setFillTextRegion(boolean fillTextRegion) {try{__CLR4_5_238k38klvl9efq6.R.inc(4288);
        __CLR4_5_238k38klvl9efq6.R.inc(4289);if ((((fillTextRegion)&&(__CLR4_5_238k38klvl9efq6.R.iget(4290)!=0|true))||(__CLR4_5_238k38klvl9efq6.R.iget(4291)==0&false))) {{
            __CLR4_5_238k38klvl9efq6.R.inc(4292);displayFlags |= 0x00040000;
        } }else {{
            __CLR4_5_238k38klvl9efq6.R.inc(4293);displayFlags &= ~0x00040000;
        }
    }}finally{__CLR4_5_238k38klvl9efq6.R.flushNeeded();}}


    public int getHorizontalJustification() {try{__CLR4_5_238k38klvl9efq6.R.inc(4294);
        __CLR4_5_238k38klvl9efq6.R.inc(4295);return horizontalJustification;
    }finally{__CLR4_5_238k38klvl9efq6.R.flushNeeded();}}

    public void setHorizontalJustification(int horizontalJustification) {try{__CLR4_5_238k38klvl9efq6.R.inc(4296);
        __CLR4_5_238k38klvl9efq6.R.inc(4297);this.horizontalJustification = horizontalJustification;
    }finally{__CLR4_5_238k38klvl9efq6.R.flushNeeded();}}

    public int getVerticalJustification() {try{__CLR4_5_238k38klvl9efq6.R.inc(4298);
        __CLR4_5_238k38klvl9efq6.R.inc(4299);return verticalJustification;
    }finally{__CLR4_5_238k38klvl9efq6.R.flushNeeded();}}

    public void setVerticalJustification(int verticalJustification) {try{__CLR4_5_238k38klvl9efq6.R.inc(4300);
        __CLR4_5_238k38klvl9efq6.R.inc(4301);this.verticalJustification = verticalJustification;
    }finally{__CLR4_5_238k38klvl9efq6.R.flushNeeded();}}

    public int[] getBackgroundColorRgba() {try{__CLR4_5_238k38klvl9efq6.R.inc(4302);
        __CLR4_5_238k38klvl9efq6.R.inc(4303);return backgroundColorRgba;
    }finally{__CLR4_5_238k38klvl9efq6.R.flushNeeded();}}

    public void setBackgroundColorRgba(int[] backgroundColorRgba) {try{__CLR4_5_238k38klvl9efq6.R.inc(4304);
        __CLR4_5_238k38klvl9efq6.R.inc(4305);this.backgroundColorRgba = backgroundColorRgba;
    }finally{__CLR4_5_238k38klvl9efq6.R.flushNeeded();}}

    public static class BoxRecord {
        int top;
        int left;
        int bottom;
        int right;

        public BoxRecord() {try{__CLR4_5_238k38klvl9efq6.R.inc(4306);
        }finally{__CLR4_5_238k38klvl9efq6.R.flushNeeded();}}

        public BoxRecord(int top, int left, int bottom, int right) {try{__CLR4_5_238k38klvl9efq6.R.inc(4307);
            __CLR4_5_238k38klvl9efq6.R.inc(4308);this.top = top;
            __CLR4_5_238k38klvl9efq6.R.inc(4309);this.left = left;
            __CLR4_5_238k38klvl9efq6.R.inc(4310);this.bottom = bottom;
            __CLR4_5_238k38klvl9efq6.R.inc(4311);this.right = right;
        }finally{__CLR4_5_238k38klvl9efq6.R.flushNeeded();}}

        public void parse(ByteBuffer in) {try{__CLR4_5_238k38klvl9efq6.R.inc(4312);
            __CLR4_5_238k38klvl9efq6.R.inc(4313);top = IsoTypeReader.readUInt16(in);
            __CLR4_5_238k38klvl9efq6.R.inc(4314);left = IsoTypeReader.readUInt16(in);
            __CLR4_5_238k38klvl9efq6.R.inc(4315);bottom = IsoTypeReader.readUInt16(in);
            __CLR4_5_238k38klvl9efq6.R.inc(4316);right = IsoTypeReader.readUInt16(in);
        }finally{__CLR4_5_238k38klvl9efq6.R.flushNeeded();}}

        public void getContent(ByteBuffer bb) {try{__CLR4_5_238k38klvl9efq6.R.inc(4317);
            __CLR4_5_238k38klvl9efq6.R.inc(4318);IsoTypeWriter.writeUInt16(bb, top);
            __CLR4_5_238k38klvl9efq6.R.inc(4319);IsoTypeWriter.writeUInt16(bb, left);
            __CLR4_5_238k38klvl9efq6.R.inc(4320);IsoTypeWriter.writeUInt16(bb, bottom);
            __CLR4_5_238k38klvl9efq6.R.inc(4321);IsoTypeWriter.writeUInt16(bb, right);
        }finally{__CLR4_5_238k38klvl9efq6.R.flushNeeded();}}

        public int getSize() {try{__CLR4_5_238k38klvl9efq6.R.inc(4322);
            __CLR4_5_238k38klvl9efq6.R.inc(4323);return 8;
        }finally{__CLR4_5_238k38klvl9efq6.R.flushNeeded();}}

        @Override
        public boolean equals(Object o) {try{__CLR4_5_238k38klvl9efq6.R.inc(4324);
            __CLR4_5_238k38klvl9efq6.R.inc(4325);if ((((this == o)&&(__CLR4_5_238k38klvl9efq6.R.iget(4326)!=0|true))||(__CLR4_5_238k38klvl9efq6.R.iget(4327)==0&false))) {__CLR4_5_238k38klvl9efq6.R.inc(4328);return true;
            }__CLR4_5_238k38klvl9efq6.R.inc(4329);if ((((o == null || getClass() != o.getClass())&&(__CLR4_5_238k38klvl9efq6.R.iget(4330)!=0|true))||(__CLR4_5_238k38klvl9efq6.R.iget(4331)==0&false))) {__CLR4_5_238k38klvl9efq6.R.inc(4332);return false;

            }__CLR4_5_238k38klvl9efq6.R.inc(4333);BoxRecord boxRecord = (BoxRecord) o;

            __CLR4_5_238k38klvl9efq6.R.inc(4334);if ((((bottom != boxRecord.bottom)&&(__CLR4_5_238k38klvl9efq6.R.iget(4335)!=0|true))||(__CLR4_5_238k38klvl9efq6.R.iget(4336)==0&false))) {__CLR4_5_238k38klvl9efq6.R.inc(4337);return false;
            }__CLR4_5_238k38klvl9efq6.R.inc(4338);if ((((left != boxRecord.left)&&(__CLR4_5_238k38klvl9efq6.R.iget(4339)!=0|true))||(__CLR4_5_238k38klvl9efq6.R.iget(4340)==0&false))) {__CLR4_5_238k38klvl9efq6.R.inc(4341);return false;
            }__CLR4_5_238k38klvl9efq6.R.inc(4342);if ((((right != boxRecord.right)&&(__CLR4_5_238k38klvl9efq6.R.iget(4343)!=0|true))||(__CLR4_5_238k38klvl9efq6.R.iget(4344)==0&false))) {__CLR4_5_238k38klvl9efq6.R.inc(4345);return false;
            }__CLR4_5_238k38klvl9efq6.R.inc(4346);if ((((top != boxRecord.top)&&(__CLR4_5_238k38klvl9efq6.R.iget(4347)!=0|true))||(__CLR4_5_238k38klvl9efq6.R.iget(4348)==0&false))) {__CLR4_5_238k38klvl9efq6.R.inc(4349);return false;

            }__CLR4_5_238k38klvl9efq6.R.inc(4350);return true;
        }finally{__CLR4_5_238k38klvl9efq6.R.flushNeeded();}}

        @Override
        public int hashCode() {try{__CLR4_5_238k38klvl9efq6.R.inc(4351);
            __CLR4_5_238k38klvl9efq6.R.inc(4352);int result = top;
            __CLR4_5_238k38klvl9efq6.R.inc(4353);result = 31 * result + left;
            __CLR4_5_238k38klvl9efq6.R.inc(4354);result = 31 * result + bottom;
            __CLR4_5_238k38klvl9efq6.R.inc(4355);result = 31 * result + right;
            __CLR4_5_238k38klvl9efq6.R.inc(4356);return result;
        }finally{__CLR4_5_238k38klvl9efq6.R.flushNeeded();}}
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

        public StyleRecord() {try{__CLR4_5_238k38klvl9efq6.R.inc(4357);
        }finally{__CLR4_5_238k38klvl9efq6.R.flushNeeded();}}

        public StyleRecord(int startChar, int endChar, int fontId, int faceStyleFlags, int fontSize, int[] textColor) {try{__CLR4_5_238k38klvl9efq6.R.inc(4358);
            __CLR4_5_238k38klvl9efq6.R.inc(4359);this.startChar = startChar;
            __CLR4_5_238k38klvl9efq6.R.inc(4360);this.endChar = endChar;
            __CLR4_5_238k38klvl9efq6.R.inc(4361);this.fontId = fontId;
            __CLR4_5_238k38klvl9efq6.R.inc(4362);this.faceStyleFlags = faceStyleFlags;
            __CLR4_5_238k38klvl9efq6.R.inc(4363);this.fontSize = fontSize;
            __CLR4_5_238k38klvl9efq6.R.inc(4364);this.textColor = textColor;
        }finally{__CLR4_5_238k38klvl9efq6.R.flushNeeded();}}

        public void parse(ByteBuffer in) {try{__CLR4_5_238k38klvl9efq6.R.inc(4365);
            __CLR4_5_238k38klvl9efq6.R.inc(4366);startChar = IsoTypeReader.readUInt16(in);
            __CLR4_5_238k38klvl9efq6.R.inc(4367);endChar = IsoTypeReader.readUInt16(in);
            __CLR4_5_238k38klvl9efq6.R.inc(4368);fontId = IsoTypeReader.readUInt16(in);
            __CLR4_5_238k38klvl9efq6.R.inc(4369);faceStyleFlags = IsoTypeReader.readUInt8(in);
            __CLR4_5_238k38klvl9efq6.R.inc(4370);fontSize = IsoTypeReader.readUInt8(in);
            __CLR4_5_238k38klvl9efq6.R.inc(4371);textColor = new int[4];
            __CLR4_5_238k38klvl9efq6.R.inc(4372);textColor[0] = IsoTypeReader.readUInt8(in);
            __CLR4_5_238k38klvl9efq6.R.inc(4373);textColor[1] = IsoTypeReader.readUInt8(in);
            __CLR4_5_238k38klvl9efq6.R.inc(4374);textColor[2] = IsoTypeReader.readUInt8(in);
            __CLR4_5_238k38klvl9efq6.R.inc(4375);textColor[3] = IsoTypeReader.readUInt8(in);
        }finally{__CLR4_5_238k38klvl9efq6.R.flushNeeded();}}


        public void getContent(ByteBuffer bb) {try{__CLR4_5_238k38klvl9efq6.R.inc(4376);
            __CLR4_5_238k38klvl9efq6.R.inc(4377);IsoTypeWriter.writeUInt16(bb, startChar);
            __CLR4_5_238k38klvl9efq6.R.inc(4378);IsoTypeWriter.writeUInt16(bb, endChar);
            __CLR4_5_238k38klvl9efq6.R.inc(4379);IsoTypeWriter.writeUInt16(bb, fontId);
            __CLR4_5_238k38klvl9efq6.R.inc(4380);IsoTypeWriter.writeUInt8(bb, faceStyleFlags);
            __CLR4_5_238k38klvl9efq6.R.inc(4381);IsoTypeWriter.writeUInt8(bb, fontSize);
            __CLR4_5_238k38klvl9efq6.R.inc(4382);IsoTypeWriter.writeUInt8(bb, textColor[0]);
            __CLR4_5_238k38klvl9efq6.R.inc(4383);IsoTypeWriter.writeUInt8(bb, textColor[1]);
            __CLR4_5_238k38klvl9efq6.R.inc(4384);IsoTypeWriter.writeUInt8(bb, textColor[2]);
            __CLR4_5_238k38klvl9efq6.R.inc(4385);IsoTypeWriter.writeUInt8(bb, textColor[3]);
        }finally{__CLR4_5_238k38klvl9efq6.R.flushNeeded();}}

        @Override
        public boolean equals(Object o) {try{__CLR4_5_238k38klvl9efq6.R.inc(4386);
            __CLR4_5_238k38klvl9efq6.R.inc(4387);if ((((this == o)&&(__CLR4_5_238k38klvl9efq6.R.iget(4388)!=0|true))||(__CLR4_5_238k38klvl9efq6.R.iget(4389)==0&false))) {__CLR4_5_238k38klvl9efq6.R.inc(4390);return true;
            }__CLR4_5_238k38klvl9efq6.R.inc(4391);if ((((o == null || getClass() != o.getClass())&&(__CLR4_5_238k38klvl9efq6.R.iget(4392)!=0|true))||(__CLR4_5_238k38klvl9efq6.R.iget(4393)==0&false))) {__CLR4_5_238k38klvl9efq6.R.inc(4394);return false;

            }__CLR4_5_238k38klvl9efq6.R.inc(4395);StyleRecord that = (StyleRecord) o;

            __CLR4_5_238k38klvl9efq6.R.inc(4396);if ((((endChar != that.endChar)&&(__CLR4_5_238k38klvl9efq6.R.iget(4397)!=0|true))||(__CLR4_5_238k38klvl9efq6.R.iget(4398)==0&false))) {__CLR4_5_238k38klvl9efq6.R.inc(4399);return false;
            }__CLR4_5_238k38klvl9efq6.R.inc(4400);if ((((faceStyleFlags != that.faceStyleFlags)&&(__CLR4_5_238k38klvl9efq6.R.iget(4401)!=0|true))||(__CLR4_5_238k38klvl9efq6.R.iget(4402)==0&false))) {__CLR4_5_238k38klvl9efq6.R.inc(4403);return false;
            }__CLR4_5_238k38klvl9efq6.R.inc(4404);if ((((fontId != that.fontId)&&(__CLR4_5_238k38klvl9efq6.R.iget(4405)!=0|true))||(__CLR4_5_238k38klvl9efq6.R.iget(4406)==0&false))) {__CLR4_5_238k38klvl9efq6.R.inc(4407);return false;
            }__CLR4_5_238k38klvl9efq6.R.inc(4408);if ((((fontSize != that.fontSize)&&(__CLR4_5_238k38klvl9efq6.R.iget(4409)!=0|true))||(__CLR4_5_238k38klvl9efq6.R.iget(4410)==0&false))) {__CLR4_5_238k38klvl9efq6.R.inc(4411);return false;
            }__CLR4_5_238k38klvl9efq6.R.inc(4412);if ((((startChar != that.startChar)&&(__CLR4_5_238k38klvl9efq6.R.iget(4413)!=0|true))||(__CLR4_5_238k38klvl9efq6.R.iget(4414)==0&false))) {__CLR4_5_238k38klvl9efq6.R.inc(4415);return false;
            }__CLR4_5_238k38klvl9efq6.R.inc(4416);if ((((!Arrays.equals(textColor, that.textColor))&&(__CLR4_5_238k38klvl9efq6.R.iget(4417)!=0|true))||(__CLR4_5_238k38klvl9efq6.R.iget(4418)==0&false))) {__CLR4_5_238k38klvl9efq6.R.inc(4419);return false;

            }__CLR4_5_238k38klvl9efq6.R.inc(4420);return true;
        }finally{__CLR4_5_238k38klvl9efq6.R.flushNeeded();}}

        @Override
        public int hashCode() {try{__CLR4_5_238k38klvl9efq6.R.inc(4421);
            __CLR4_5_238k38klvl9efq6.R.inc(4422);int result = startChar;
            __CLR4_5_238k38klvl9efq6.R.inc(4423);result = 31 * result + endChar;
            __CLR4_5_238k38klvl9efq6.R.inc(4424);result = 31 * result + fontId;
            __CLR4_5_238k38klvl9efq6.R.inc(4425);result = 31 * result + faceStyleFlags;
            __CLR4_5_238k38klvl9efq6.R.inc(4426);result = 31 * result + fontSize;
            __CLR4_5_238k38klvl9efq6.R.inc(4427);result = 31 * result + ((((textColor != null )&&(__CLR4_5_238k38klvl9efq6.R.iget(4428)!=0|true))||(__CLR4_5_238k38klvl9efq6.R.iget(4429)==0&false))? Arrays.hashCode(textColor) : 0);
            __CLR4_5_238k38klvl9efq6.R.inc(4430);return result;
        }finally{__CLR4_5_238k38klvl9efq6.R.flushNeeded();}}

        public int getSize() {try{__CLR4_5_238k38klvl9efq6.R.inc(4431);
            __CLR4_5_238k38klvl9efq6.R.inc(4432);return 12;
        }finally{__CLR4_5_238k38klvl9efq6.R.flushNeeded();}}
    }

    @Override
    public long getSize() {try{__CLR4_5_238k38klvl9efq6.R.inc(4433);
        __CLR4_5_238k38klvl9efq6.R.inc(4434);long s = getContainerSize();
        __CLR4_5_238k38klvl9efq6.R.inc(4435);long t = 38; // bytes to container start
        __CLR4_5_238k38klvl9efq6.R.inc(4436);return s + t + (((((largeBox || (s + t) >= (1L << 32)) )&&(__CLR4_5_238k38klvl9efq6.R.iget(4437)!=0|true))||(__CLR4_5_238k38klvl9efq6.R.iget(4438)==0&false))? 16 : 8);

    }finally{__CLR4_5_238k38klvl9efq6.R.flushNeeded();}}


}
