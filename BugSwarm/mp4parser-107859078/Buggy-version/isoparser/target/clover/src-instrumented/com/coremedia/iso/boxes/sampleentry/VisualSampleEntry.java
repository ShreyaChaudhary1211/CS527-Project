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
import com.coremedia.iso.Utf8;
import com.coremedia.iso.boxes.Container;
import com.googlecode.mp4parser.DataSource;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

import static com.googlecode.mp4parser.util.CastUtils.l2i;

/**
 * <h1>4cc = "{@value #TYPE1}" || "{@value #TYPE2}" || "{@value #TYPE3}" || "{@value #TYPE4}" || "{@value #TYPE5}"</h1>
 * Contains information common to all visual tracks.
 * <pre>
 * class VisualSampleEntry(codingname) extends AbstractSampleEntry (codingname){
 *  unsigned int(16) pre_defined = 0;
 *  const unsigned int(16) reserved = 0;
 *  unsigned int(32)[3] pre_defined = 0;
 *  unsigned int(16) width;
 *  unsigned int(16) height;
 *  template unsigned int(32) horizresolution = 0x00480000; // 72 dpi
 *  template unsigned int(32) vertresolution = 0x00480000; // 72 dpi
 *  const unsigned int(32) reserved = 0;
 *  template unsigned int(16) frame_count = 1;
 *  string[32] compressorname;
 *  template unsigned int(16) depth = 0x0018;
 *  int(16) pre_defined = -1;
 * }
 * </pre>
 *
 * Format-specific information is appened as boxes after the data described in ISO/IEC 14496-12 chapter 8.16.2.
 */
public final class VisualSampleEntry extends AbstractSampleEntry implements Container {public static class __CLR4_5_23fb3fblvl9efts{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,4574,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static final String TYPE1 = "mp4v";
    public static final String TYPE2 = "s263";
    public static final String TYPE3 = "avc1";
    public static final String TYPE4 = "avc3";
    public static final String TYPE5 = "drmi";
    public static final String TYPE6 = "hvc1";
    public static final String TYPE7 = "hev1";


    /**
     * Identifier for an encrypted video track.
     *
     * @see com.coremedia.iso.boxes.ProtectionSchemeInformationBox
     */
    public static final String TYPE_ENCRYPTED = "encv";


    private int width;
    private int height;
    private double horizresolution = 72;
    private double vertresolution = 72;
    private int frameCount = 1;
    private String compressorname = "";
    private int depth = 24;

    private long[] predefined = new long[3];

    public VisualSampleEntry() {
        super(TYPE3);__CLR4_5_23fb3fblvl9efts.R.inc(4440);try{__CLR4_5_23fb3fblvl9efts.R.inc(4439);
    }finally{__CLR4_5_23fb3fblvl9efts.R.flushNeeded();}}

    public VisualSampleEntry(String type) {
        super(type);__CLR4_5_23fb3fblvl9efts.R.inc(4442);try{__CLR4_5_23fb3fblvl9efts.R.inc(4441);
    }finally{__CLR4_5_23fb3fblvl9efts.R.flushNeeded();}}

    public void setType(String type) {try{__CLR4_5_23fb3fblvl9efts.R.inc(4443);
        __CLR4_5_23fb3fblvl9efts.R.inc(4444);this.type = type;
    }finally{__CLR4_5_23fb3fblvl9efts.R.flushNeeded();}}

    public int getWidth() {try{__CLR4_5_23fb3fblvl9efts.R.inc(4445);
        __CLR4_5_23fb3fblvl9efts.R.inc(4446);return width;
    }finally{__CLR4_5_23fb3fblvl9efts.R.flushNeeded();}}

    public void setWidth(int width) {try{__CLR4_5_23fb3fblvl9efts.R.inc(4447);
        __CLR4_5_23fb3fblvl9efts.R.inc(4448);this.width = width;
    }finally{__CLR4_5_23fb3fblvl9efts.R.flushNeeded();}}

    public int getHeight() {try{__CLR4_5_23fb3fblvl9efts.R.inc(4449);
        __CLR4_5_23fb3fblvl9efts.R.inc(4450);return height;
    }finally{__CLR4_5_23fb3fblvl9efts.R.flushNeeded();}}

    public void setHeight(int height) {try{__CLR4_5_23fb3fblvl9efts.R.inc(4451);
        __CLR4_5_23fb3fblvl9efts.R.inc(4452);this.height = height;
    }finally{__CLR4_5_23fb3fblvl9efts.R.flushNeeded();}}

    public double getHorizresolution() {try{__CLR4_5_23fb3fblvl9efts.R.inc(4453);
        __CLR4_5_23fb3fblvl9efts.R.inc(4454);return horizresolution;
    }finally{__CLR4_5_23fb3fblvl9efts.R.flushNeeded();}}

    public void setHorizresolution(double horizresolution) {try{__CLR4_5_23fb3fblvl9efts.R.inc(4455);
        __CLR4_5_23fb3fblvl9efts.R.inc(4456);this.horizresolution = horizresolution;
    }finally{__CLR4_5_23fb3fblvl9efts.R.flushNeeded();}}

    public double getVertresolution() {try{__CLR4_5_23fb3fblvl9efts.R.inc(4457);
        __CLR4_5_23fb3fblvl9efts.R.inc(4458);return vertresolution;
    }finally{__CLR4_5_23fb3fblvl9efts.R.flushNeeded();}}

    public void setVertresolution(double vertresolution) {try{__CLR4_5_23fb3fblvl9efts.R.inc(4459);
        __CLR4_5_23fb3fblvl9efts.R.inc(4460);this.vertresolution = vertresolution;
    }finally{__CLR4_5_23fb3fblvl9efts.R.flushNeeded();}}

    public int getFrameCount() {try{__CLR4_5_23fb3fblvl9efts.R.inc(4461);
        __CLR4_5_23fb3fblvl9efts.R.inc(4462);return frameCount;
    }finally{__CLR4_5_23fb3fblvl9efts.R.flushNeeded();}}

    public void setFrameCount(int frameCount) {try{__CLR4_5_23fb3fblvl9efts.R.inc(4463);
        __CLR4_5_23fb3fblvl9efts.R.inc(4464);this.frameCount = frameCount;
    }finally{__CLR4_5_23fb3fblvl9efts.R.flushNeeded();}}

    public String getCompressorname() {try{__CLR4_5_23fb3fblvl9efts.R.inc(4465);
        __CLR4_5_23fb3fblvl9efts.R.inc(4466);return compressorname;
    }finally{__CLR4_5_23fb3fblvl9efts.R.flushNeeded();}}

    public void setCompressorname(String compressorname) {try{__CLR4_5_23fb3fblvl9efts.R.inc(4467);
        __CLR4_5_23fb3fblvl9efts.R.inc(4468);this.compressorname = compressorname;
    }finally{__CLR4_5_23fb3fblvl9efts.R.flushNeeded();}}

    public int getDepth() {try{__CLR4_5_23fb3fblvl9efts.R.inc(4469);
        __CLR4_5_23fb3fblvl9efts.R.inc(4470);return depth;
    }finally{__CLR4_5_23fb3fblvl9efts.R.flushNeeded();}}

    public void setDepth(int depth) {try{__CLR4_5_23fb3fblvl9efts.R.inc(4471);
        __CLR4_5_23fb3fblvl9efts.R.inc(4472);this.depth = depth;
    }finally{__CLR4_5_23fb3fblvl9efts.R.flushNeeded();}}

    @Override
    public void parse(final DataSource dataSource, ByteBuffer header, long contentSize, BoxParser boxParser) throws IOException {try{__CLR4_5_23fb3fblvl9efts.R.inc(4473);
        __CLR4_5_23fb3fblvl9efts.R.inc(4474);final long endPosition = dataSource.position() + contentSize;
        __CLR4_5_23fb3fblvl9efts.R.inc(4475);ByteBuffer content = ByteBuffer.allocate(78);
        __CLR4_5_23fb3fblvl9efts.R.inc(4476);dataSource.read(content);
        __CLR4_5_23fb3fblvl9efts.R.inc(4477);content.position(6);
        __CLR4_5_23fb3fblvl9efts.R.inc(4478);dataReferenceIndex = IsoTypeReader.readUInt16(content);

        __CLR4_5_23fb3fblvl9efts.R.inc(4479);long tmp = IsoTypeReader.readUInt16(content);
        assert (((0 == tmp )&&(__CLR4_5_23fb3fblvl9efts.R.iget(4480)!=0|true))||(__CLR4_5_23fb3fblvl9efts.R.iget(4481)==0&false)): "reserved byte not 0";
        __CLR4_5_23fb3fblvl9efts.R.inc(4482);tmp = IsoTypeReader.readUInt16(content);
        assert (((0 == tmp )&&(__CLR4_5_23fb3fblvl9efts.R.iget(4483)!=0|true))||(__CLR4_5_23fb3fblvl9efts.R.iget(4484)==0&false)): "reserved byte not 0";
        __CLR4_5_23fb3fblvl9efts.R.inc(4485);predefined[0] = IsoTypeReader.readUInt32(content);     // should be zero
        __CLR4_5_23fb3fblvl9efts.R.inc(4486);predefined[1] = IsoTypeReader.readUInt32(content);     // should be zero
        __CLR4_5_23fb3fblvl9efts.R.inc(4487);predefined[2] = IsoTypeReader.readUInt32(content);     // should be zero
        __CLR4_5_23fb3fblvl9efts.R.inc(4488);width = IsoTypeReader.readUInt16(content);
        __CLR4_5_23fb3fblvl9efts.R.inc(4489);height = IsoTypeReader.readUInt16(content);
        __CLR4_5_23fb3fblvl9efts.R.inc(4490);horizresolution = IsoTypeReader.readFixedPoint1616(content);
        __CLR4_5_23fb3fblvl9efts.R.inc(4491);vertresolution = IsoTypeReader.readFixedPoint1616(content);
        __CLR4_5_23fb3fblvl9efts.R.inc(4492);tmp = IsoTypeReader.readUInt32(content);
        assert (((0 == tmp )&&(__CLR4_5_23fb3fblvl9efts.R.iget(4493)!=0|true))||(__CLR4_5_23fb3fblvl9efts.R.iget(4494)==0&false)): "reserved byte not 0";
        __CLR4_5_23fb3fblvl9efts.R.inc(4495);frameCount = IsoTypeReader.readUInt16(content);
        __CLR4_5_23fb3fblvl9efts.R.inc(4496);int compressornameDisplayAbleData = IsoTypeReader.readUInt8(content);
        __CLR4_5_23fb3fblvl9efts.R.inc(4497);if ((((compressornameDisplayAbleData > 31)&&(__CLR4_5_23fb3fblvl9efts.R.iget(4498)!=0|true))||(__CLR4_5_23fb3fblvl9efts.R.iget(4499)==0&false))) {{
            //System.out.println("invalid compressor name displayable data: " + compressornameDisplayAbleData);
            __CLR4_5_23fb3fblvl9efts.R.inc(4500);compressornameDisplayAbleData = 31;
        }
        }__CLR4_5_23fb3fblvl9efts.R.inc(4501);byte[] bytes = new byte[compressornameDisplayAbleData];
        __CLR4_5_23fb3fblvl9efts.R.inc(4502);content.get(bytes);
        __CLR4_5_23fb3fblvl9efts.R.inc(4503);compressorname = Utf8.convert(bytes);
        __CLR4_5_23fb3fblvl9efts.R.inc(4504);if ((((compressornameDisplayAbleData < 31)&&(__CLR4_5_23fb3fblvl9efts.R.iget(4505)!=0|true))||(__CLR4_5_23fb3fblvl9efts.R.iget(4506)==0&false))) {{
            __CLR4_5_23fb3fblvl9efts.R.inc(4507);byte[] zeros = new byte[31 - compressornameDisplayAbleData];
            __CLR4_5_23fb3fblvl9efts.R.inc(4508);content.get(zeros);
            //assert Mp4Arrays.equals(zeros, new byte[zeros.length]) : "The compressor name length was not filled up with zeros";
        }
        }__CLR4_5_23fb3fblvl9efts.R.inc(4509);depth = IsoTypeReader.readUInt16(content);
        __CLR4_5_23fb3fblvl9efts.R.inc(4510);tmp = IsoTypeReader.readUInt16(content);
        assert (((0xFFFF == tmp)&&(__CLR4_5_23fb3fblvl9efts.R.iget(4511)!=0|true))||(__CLR4_5_23fb3fblvl9efts.R.iget(4512)==0&false));


        __CLR4_5_23fb3fblvl9efts.R.inc(4513);final DataSource dsLimited = new DataSource() {

            public int read(ByteBuffer byteBuffer) throws IOException {try{__CLR4_5_23fb3fblvl9efts.R.inc(4514);
                __CLR4_5_23fb3fblvl9efts.R.inc(4515);if ((((endPosition == dataSource.position())&&(__CLR4_5_23fb3fblvl9efts.R.iget(4516)!=0|true))||(__CLR4_5_23fb3fblvl9efts.R.iget(4517)==0&false))) {{
                    __CLR4_5_23fb3fblvl9efts.R.inc(4518);return -1;
                } }else {__CLR4_5_23fb3fblvl9efts.R.inc(4519);if ((((byteBuffer.remaining() > endPosition - dataSource.position())&&(__CLR4_5_23fb3fblvl9efts.R.iget(4520)!=0|true))||(__CLR4_5_23fb3fblvl9efts.R.iget(4521)==0&false))) {{
                    __CLR4_5_23fb3fblvl9efts.R.inc(4522);ByteBuffer bb = ByteBuffer.allocate(l2i(endPosition - dataSource.position()));
                    __CLR4_5_23fb3fblvl9efts.R.inc(4523);dataSource.read(bb);
                    __CLR4_5_23fb3fblvl9efts.R.inc(4524);byteBuffer.put((ByteBuffer) bb.rewind());
                    __CLR4_5_23fb3fblvl9efts.R.inc(4525);return bb.capacity();
                } }else {{
                    __CLR4_5_23fb3fblvl9efts.R.inc(4526);return dataSource.read(byteBuffer);
                }
            }}}finally{__CLR4_5_23fb3fblvl9efts.R.flushNeeded();}}

            public long size() throws IOException {try{__CLR4_5_23fb3fblvl9efts.R.inc(4527);
                __CLR4_5_23fb3fblvl9efts.R.inc(4528);return endPosition;
            }finally{__CLR4_5_23fb3fblvl9efts.R.flushNeeded();}}

            public long position() throws IOException {try{__CLR4_5_23fb3fblvl9efts.R.inc(4529);
                __CLR4_5_23fb3fblvl9efts.R.inc(4530);return dataSource.position();
            }finally{__CLR4_5_23fb3fblvl9efts.R.flushNeeded();}}

            public void position(long nuPos) throws IOException {try{__CLR4_5_23fb3fblvl9efts.R.inc(4531);
                __CLR4_5_23fb3fblvl9efts.R.inc(4532);dataSource.position(nuPos);
            }finally{__CLR4_5_23fb3fblvl9efts.R.flushNeeded();}}

            public long transferTo(long position, long count, WritableByteChannel target) throws IOException {try{__CLR4_5_23fb3fblvl9efts.R.inc(4533);
                __CLR4_5_23fb3fblvl9efts.R.inc(4534);return dataSource.transferTo(position, count, target);
            }finally{__CLR4_5_23fb3fblvl9efts.R.flushNeeded();}}

            public ByteBuffer map(long startPosition, long size) throws IOException {try{__CLR4_5_23fb3fblvl9efts.R.inc(4535);
                __CLR4_5_23fb3fblvl9efts.R.inc(4536);return dataSource.map(startPosition, size);
            }finally{__CLR4_5_23fb3fblvl9efts.R.flushNeeded();}}

            public void close() throws IOException {try{__CLR4_5_23fb3fblvl9efts.R.inc(4537);
                __CLR4_5_23fb3fblvl9efts.R.inc(4538);dataSource.close();
            }finally{__CLR4_5_23fb3fblvl9efts.R.flushNeeded();}}
        };
        __CLR4_5_23fb3fblvl9efts.R.inc(4539);initContainer(dsLimited, contentSize - 78, boxParser);

    }finally{__CLR4_5_23fb3fblvl9efts.R.flushNeeded();}}


    @Override
    public void getBox(WritableByteChannel writableByteChannel) throws IOException {try{__CLR4_5_23fb3fblvl9efts.R.inc(4540);
        __CLR4_5_23fb3fblvl9efts.R.inc(4541);writableByteChannel.write(getHeader());
        __CLR4_5_23fb3fblvl9efts.R.inc(4542);ByteBuffer byteBuffer = ByteBuffer.allocate(78);
        __CLR4_5_23fb3fblvl9efts.R.inc(4543);byteBuffer.position(6);
        __CLR4_5_23fb3fblvl9efts.R.inc(4544);IsoTypeWriter.writeUInt16(byteBuffer, dataReferenceIndex);
        __CLR4_5_23fb3fblvl9efts.R.inc(4545);IsoTypeWriter.writeUInt16(byteBuffer, 0);
        __CLR4_5_23fb3fblvl9efts.R.inc(4546);IsoTypeWriter.writeUInt16(byteBuffer, 0);
        __CLR4_5_23fb3fblvl9efts.R.inc(4547);IsoTypeWriter.writeUInt32(byteBuffer, predefined[0]);
        __CLR4_5_23fb3fblvl9efts.R.inc(4548);IsoTypeWriter.writeUInt32(byteBuffer, predefined[1]);
        __CLR4_5_23fb3fblvl9efts.R.inc(4549);IsoTypeWriter.writeUInt32(byteBuffer, predefined[2]);

        __CLR4_5_23fb3fblvl9efts.R.inc(4550);IsoTypeWriter.writeUInt16(byteBuffer, getWidth());
        __CLR4_5_23fb3fblvl9efts.R.inc(4551);IsoTypeWriter.writeUInt16(byteBuffer, getHeight());

        __CLR4_5_23fb3fblvl9efts.R.inc(4552);IsoTypeWriter.writeFixedPoint1616(byteBuffer, getHorizresolution());
        __CLR4_5_23fb3fblvl9efts.R.inc(4553);IsoTypeWriter.writeFixedPoint1616(byteBuffer, getVertresolution());


        __CLR4_5_23fb3fblvl9efts.R.inc(4554);IsoTypeWriter.writeUInt32(byteBuffer, 0);
        __CLR4_5_23fb3fblvl9efts.R.inc(4555);IsoTypeWriter.writeUInt16(byteBuffer, getFrameCount());
        __CLR4_5_23fb3fblvl9efts.R.inc(4556);IsoTypeWriter.writeUInt8(byteBuffer, Utf8.utf8StringLengthInBytes(getCompressorname()));
        __CLR4_5_23fb3fblvl9efts.R.inc(4557);byteBuffer.put(Utf8.convert(getCompressorname()));
        __CLR4_5_23fb3fblvl9efts.R.inc(4558);int a = Utf8.utf8StringLengthInBytes(getCompressorname());
        __CLR4_5_23fb3fblvl9efts.R.inc(4559);while ((((a < 31)&&(__CLR4_5_23fb3fblvl9efts.R.iget(4560)!=0|true))||(__CLR4_5_23fb3fblvl9efts.R.iget(4561)==0&false))) {{
            __CLR4_5_23fb3fblvl9efts.R.inc(4562);a++;
            __CLR4_5_23fb3fblvl9efts.R.inc(4563);byteBuffer.put((byte) 0);
        }
        }__CLR4_5_23fb3fblvl9efts.R.inc(4564);IsoTypeWriter.writeUInt16(byteBuffer, getDepth());
        __CLR4_5_23fb3fblvl9efts.R.inc(4565);IsoTypeWriter.writeUInt16(byteBuffer, 0xFFFF);

        __CLR4_5_23fb3fblvl9efts.R.inc(4566);writableByteChannel.write((ByteBuffer) byteBuffer.rewind());

        __CLR4_5_23fb3fblvl9efts.R.inc(4567);writeContainer(writableByteChannel);

    }finally{__CLR4_5_23fb3fblvl9efts.R.flushNeeded();}}


    @Override
    public long getSize() {try{__CLR4_5_23fb3fblvl9efts.R.inc(4568);
        __CLR4_5_23fb3fblvl9efts.R.inc(4569);long s = getContainerSize();
        __CLR4_5_23fb3fblvl9efts.R.inc(4570);long t = 78;
        __CLR4_5_23fb3fblvl9efts.R.inc(4571);return s + t + (((((largeBox || (s + t + 8) >= (1L << 32)) )&&(__CLR4_5_23fb3fblvl9efts.R.iget(4572)!=0|true))||(__CLR4_5_23fb3fblvl9efts.R.iget(4573)==0&false))? 16 : 8);
    }finally{__CLR4_5_23fb3fblvl9efts.R.flushNeeded();}}



}

