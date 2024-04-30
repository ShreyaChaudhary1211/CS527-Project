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

import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.Container;
import com.googlecode.mp4parser.DataSource;

import java.nio.channels.WritableByteChannel;

import static com.googlecode.mp4parser.util.CastUtils.l2i;

/**
 * <h1>4cc = "{@value #TYPE1}" || "{@value #TYPE2} || "{@value #TYPE3} || "{@value #TYPE4} || "{@value #TYPE5} || "{@value #TYPE7} || "{@value #TYPE8} || "{@value #TYPE9} || "{@value #TYPE10} || "{@value #TYPE11} || "{@value #TYPE12} || "{@value #TYPE13}"</h1>
 * Contains basic information about the audio samples in this track. Format-specific information
 * is appened as boxes after the data described in ISO/IEC 14496-12 chapter 8.16.2.
 */
public final class AudioSampleEntry extends AbstractSampleEntry {public static class __CLR4_5_2335335lvlulchm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,4179,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static final String TYPE1 = "samr";
    public static final String TYPE2 = "sawb";
    public static final String TYPE3 = "mp4a";
    public static final String TYPE4 = "drms";
    public static final String TYPE5 = "alac";
    public static final String TYPE7 = "owma";
    public static final String TYPE8 = "ac-3"; /* ETSI TS 102 366 1.2.1 Annex F */
    public static final String TYPE9 = "ec-3"; /* ETSI TS 102 366 1.2.1 Annex F */
    public static final String TYPE10 = "mlpa";
    public static final String TYPE11 = "dtsl";
    public static final String TYPE12 = "dtsh";
    public static final String TYPE13 = "dtse";

    /**
     * Identifier for an encrypted audio track.
     *
     * @see com.coremedia.iso.boxes.ProtectionSchemeInformationBox
     */
    public static final String TYPE_ENCRYPTED = "enca";

    private int channelCount;
    private int sampleSize;
    private long sampleRate;
    private int soundVersion;
    private int compressionId;
    private int packetSize;
    private long samplesPerPacket;
    private long bytesPerPacket;
    private long bytesPerFrame;
    private long bytesPerSample;

    private int reserved1;
    private long reserved2;
    private byte[] soundVersion2Data;


    public AudioSampleEntry(String type) {
        super(type);__CLR4_5_2335335lvlulchm.R.inc(4002);try{__CLR4_5_2335335lvlulchm.R.inc(4001);
    }finally{__CLR4_5_2335335lvlulchm.R.flushNeeded();}}

    public void setType(String type) {try{__CLR4_5_2335335lvlulchm.R.inc(4003);
        __CLR4_5_2335335lvlulchm.R.inc(4004);this.type = type;
    }finally{__CLR4_5_2335335lvlulchm.R.flushNeeded();}}

    public int getChannelCount() {try{__CLR4_5_2335335lvlulchm.R.inc(4005);
        __CLR4_5_2335335lvlulchm.R.inc(4006);return channelCount;
    }finally{__CLR4_5_2335335lvlulchm.R.flushNeeded();}}

    public int getSampleSize() {try{__CLR4_5_2335335lvlulchm.R.inc(4007);
        __CLR4_5_2335335lvlulchm.R.inc(4008);return sampleSize;
    }finally{__CLR4_5_2335335lvlulchm.R.flushNeeded();}}

    public long getSampleRate() {try{__CLR4_5_2335335lvlulchm.R.inc(4009);
        __CLR4_5_2335335lvlulchm.R.inc(4010);return sampleRate;
    }finally{__CLR4_5_2335335lvlulchm.R.flushNeeded();}}

    public int getSoundVersion() {try{__CLR4_5_2335335lvlulchm.R.inc(4011);
        __CLR4_5_2335335lvlulchm.R.inc(4012);return soundVersion;
    }finally{__CLR4_5_2335335lvlulchm.R.flushNeeded();}}

    public int getCompressionId() {try{__CLR4_5_2335335lvlulchm.R.inc(4013);
        __CLR4_5_2335335lvlulchm.R.inc(4014);return compressionId;
    }finally{__CLR4_5_2335335lvlulchm.R.flushNeeded();}}

    public int getPacketSize() {try{__CLR4_5_2335335lvlulchm.R.inc(4015);
        __CLR4_5_2335335lvlulchm.R.inc(4016);return packetSize;
    }finally{__CLR4_5_2335335lvlulchm.R.flushNeeded();}}

    public long getSamplesPerPacket() {try{__CLR4_5_2335335lvlulchm.R.inc(4017);
        __CLR4_5_2335335lvlulchm.R.inc(4018);return samplesPerPacket;
    }finally{__CLR4_5_2335335lvlulchm.R.flushNeeded();}}

    public long getBytesPerPacket() {try{__CLR4_5_2335335lvlulchm.R.inc(4019);
        __CLR4_5_2335335lvlulchm.R.inc(4020);return bytesPerPacket;
    }finally{__CLR4_5_2335335lvlulchm.R.flushNeeded();}}

    public long getBytesPerFrame() {try{__CLR4_5_2335335lvlulchm.R.inc(4021);
        __CLR4_5_2335335lvlulchm.R.inc(4022);return bytesPerFrame;
    }finally{__CLR4_5_2335335lvlulchm.R.flushNeeded();}}

    public long getBytesPerSample() {try{__CLR4_5_2335335lvlulchm.R.inc(4023);
        __CLR4_5_2335335lvlulchm.R.inc(4024);return bytesPerSample;
    }finally{__CLR4_5_2335335lvlulchm.R.flushNeeded();}}


    public byte[] getSoundVersion2Data() {try{__CLR4_5_2335335lvlulchm.R.inc(4025);
        __CLR4_5_2335335lvlulchm.R.inc(4026);return soundVersion2Data;
    }finally{__CLR4_5_2335335lvlulchm.R.flushNeeded();}}

    public int getReserved1() {try{__CLR4_5_2335335lvlulchm.R.inc(4027);
        __CLR4_5_2335335lvlulchm.R.inc(4028);return reserved1;
    }finally{__CLR4_5_2335335lvlulchm.R.flushNeeded();}}

    public long getReserved2() {try{__CLR4_5_2335335lvlulchm.R.inc(4029);
        __CLR4_5_2335335lvlulchm.R.inc(4030);return reserved2;
    }finally{__CLR4_5_2335335lvlulchm.R.flushNeeded();}}

    public void setChannelCount(int channelCount) {try{__CLR4_5_2335335lvlulchm.R.inc(4031);
        __CLR4_5_2335335lvlulchm.R.inc(4032);this.channelCount = channelCount;
    }finally{__CLR4_5_2335335lvlulchm.R.flushNeeded();}}

    public void setSampleSize(int sampleSize) {try{__CLR4_5_2335335lvlulchm.R.inc(4033);
        __CLR4_5_2335335lvlulchm.R.inc(4034);this.sampleSize = sampleSize;
    }finally{__CLR4_5_2335335lvlulchm.R.flushNeeded();}}

    public void setSampleRate(long sampleRate) {try{__CLR4_5_2335335lvlulchm.R.inc(4035);
        __CLR4_5_2335335lvlulchm.R.inc(4036);this.sampleRate = sampleRate;
    }finally{__CLR4_5_2335335lvlulchm.R.flushNeeded();}}

    public void setSoundVersion(int soundVersion) {try{__CLR4_5_2335335lvlulchm.R.inc(4037);
        __CLR4_5_2335335lvlulchm.R.inc(4038);this.soundVersion = soundVersion;
    }finally{__CLR4_5_2335335lvlulchm.R.flushNeeded();}}

    public void setCompressionId(int compressionId) {try{__CLR4_5_2335335lvlulchm.R.inc(4039);
        __CLR4_5_2335335lvlulchm.R.inc(4040);this.compressionId = compressionId;
    }finally{__CLR4_5_2335335lvlulchm.R.flushNeeded();}}

    public void setPacketSize(int packetSize) {try{__CLR4_5_2335335lvlulchm.R.inc(4041);
        __CLR4_5_2335335lvlulchm.R.inc(4042);this.packetSize = packetSize;
    }finally{__CLR4_5_2335335lvlulchm.R.flushNeeded();}}

    public void setSamplesPerPacket(long samplesPerPacket) {try{__CLR4_5_2335335lvlulchm.R.inc(4043);
        __CLR4_5_2335335lvlulchm.R.inc(4044);this.samplesPerPacket = samplesPerPacket;
    }finally{__CLR4_5_2335335lvlulchm.R.flushNeeded();}}

    public void setBytesPerPacket(long bytesPerPacket) {try{__CLR4_5_2335335lvlulchm.R.inc(4045);
        __CLR4_5_2335335lvlulchm.R.inc(4046);this.bytesPerPacket = bytesPerPacket;
    }finally{__CLR4_5_2335335lvlulchm.R.flushNeeded();}}

    public void setBytesPerFrame(long bytesPerFrame) {try{__CLR4_5_2335335lvlulchm.R.inc(4047);
        __CLR4_5_2335335lvlulchm.R.inc(4048);this.bytesPerFrame = bytesPerFrame;
    }finally{__CLR4_5_2335335lvlulchm.R.flushNeeded();}}

    public void setBytesPerSample(long bytesPerSample) {try{__CLR4_5_2335335lvlulchm.R.inc(4049);
        __CLR4_5_2335335lvlulchm.R.inc(4050);this.bytesPerSample = bytesPerSample;
    }finally{__CLR4_5_2335335lvlulchm.R.flushNeeded();}}

    public void setReserved1(int reserved1) {try{__CLR4_5_2335335lvlulchm.R.inc(4051);
        __CLR4_5_2335335lvlulchm.R.inc(4052);this.reserved1 = reserved1;
    }finally{__CLR4_5_2335335lvlulchm.R.flushNeeded();}}

    public void setReserved2(long reserved2) {try{__CLR4_5_2335335lvlulchm.R.inc(4053);
        __CLR4_5_2335335lvlulchm.R.inc(4054);this.reserved2 = reserved2;
    }finally{__CLR4_5_2335335lvlulchm.R.flushNeeded();}}

    public void setSoundVersion2Data(byte[] soundVersion2Data) {try{__CLR4_5_2335335lvlulchm.R.inc(4055);
        __CLR4_5_2335335lvlulchm.R.inc(4056);this.soundVersion2Data = soundVersion2Data;
    }finally{__CLR4_5_2335335lvlulchm.R.flushNeeded();}}

    @Override
    public void parse(DataSource dataSource, ByteBuffer header, long contentSize, BoxParser boxParser) throws IOException {try{__CLR4_5_2335335lvlulchm.R.inc(4057);
        __CLR4_5_2335335lvlulchm.R.inc(4058);ByteBuffer content = ByteBuffer.allocate(28);
        __CLR4_5_2335335lvlulchm.R.inc(4059);dataSource.read(content);
        __CLR4_5_2335335lvlulchm.R.inc(4060);content.position(6);
        __CLR4_5_2335335lvlulchm.R.inc(4061);dataReferenceIndex = IsoTypeReader.readUInt16(content);

        // 8 bytes already parsed
        //reserved bits - used by qt
        __CLR4_5_2335335lvlulchm.R.inc(4062);soundVersion = IsoTypeReader.readUInt16(content);

        //reserved
        __CLR4_5_2335335lvlulchm.R.inc(4063);reserved1 = IsoTypeReader.readUInt16(content);
        __CLR4_5_2335335lvlulchm.R.inc(4064);reserved2 = IsoTypeReader.readUInt32(content);

        __CLR4_5_2335335lvlulchm.R.inc(4065);channelCount = IsoTypeReader.readUInt16(content);
        __CLR4_5_2335335lvlulchm.R.inc(4066);sampleSize = IsoTypeReader.readUInt16(content);
        //reserved bits - used by qt
        __CLR4_5_2335335lvlulchm.R.inc(4067);compressionId = IsoTypeReader.readUInt16(content);
        //reserved bits - used by qt
        __CLR4_5_2335335lvlulchm.R.inc(4068);packetSize = IsoTypeReader.readUInt16(content);
        //sampleRate = in.readFixedPoint1616();
        __CLR4_5_2335335lvlulchm.R.inc(4069);sampleRate = IsoTypeReader.readUInt32(content);
        __CLR4_5_2335335lvlulchm.R.inc(4070);if ((((!type.equals("mlpa"))&&(__CLR4_5_2335335lvlulchm.R.iget(4071)!=0|true))||(__CLR4_5_2335335lvlulchm.R.iget(4072)==0&false))) {{
            __CLR4_5_2335335lvlulchm.R.inc(4073);sampleRate = sampleRate >>> 16;
        }

        //more qt stuff - see http://mp4v2.googlecode.com/svn-history/r388/trunk/src/atom_sound.cpp

        }__CLR4_5_2335335lvlulchm.R.inc(4074);if ((((soundVersion == 1)&&(__CLR4_5_2335335lvlulchm.R.iget(4075)!=0|true))||(__CLR4_5_2335335lvlulchm.R.iget(4076)==0&false))) {{
            __CLR4_5_2335335lvlulchm.R.inc(4077);ByteBuffer appleStuff = ByteBuffer.allocate(16);
            __CLR4_5_2335335lvlulchm.R.inc(4078);dataSource.read(appleStuff);
            __CLR4_5_2335335lvlulchm.R.inc(4079);appleStuff.rewind();
            __CLR4_5_2335335lvlulchm.R.inc(4080);samplesPerPacket = IsoTypeReader.readUInt32(appleStuff);
            __CLR4_5_2335335lvlulchm.R.inc(4081);bytesPerPacket = IsoTypeReader.readUInt32(appleStuff);
            __CLR4_5_2335335lvlulchm.R.inc(4082);bytesPerFrame = IsoTypeReader.readUInt32(appleStuff);
            __CLR4_5_2335335lvlulchm.R.inc(4083);bytesPerSample = IsoTypeReader.readUInt32(appleStuff);
        }
        }__CLR4_5_2335335lvlulchm.R.inc(4084);if ((((soundVersion == 2)&&(__CLR4_5_2335335lvlulchm.R.iget(4085)!=0|true))||(__CLR4_5_2335335lvlulchm.R.iget(4086)==0&false))) {{
            __CLR4_5_2335335lvlulchm.R.inc(4087);ByteBuffer appleStuff = ByteBuffer.allocate(36);
            __CLR4_5_2335335lvlulchm.R.inc(4088);dataSource.read(appleStuff);
            __CLR4_5_2335335lvlulchm.R.inc(4089);appleStuff.rewind();
            __CLR4_5_2335335lvlulchm.R.inc(4090);samplesPerPacket = IsoTypeReader.readUInt32(appleStuff);
            __CLR4_5_2335335lvlulchm.R.inc(4091);bytesPerPacket = IsoTypeReader.readUInt32(appleStuff);
            __CLR4_5_2335335lvlulchm.R.inc(4092);bytesPerFrame = IsoTypeReader.readUInt32(appleStuff);
            __CLR4_5_2335335lvlulchm.R.inc(4093);bytesPerSample = IsoTypeReader.readUInt32(appleStuff);
            __CLR4_5_2335335lvlulchm.R.inc(4094);soundVersion2Data = new byte[20];
            __CLR4_5_2335335lvlulchm.R.inc(4095);appleStuff.get(soundVersion2Data);
        }

        }__CLR4_5_2335335lvlulchm.R.inc(4096);if (((("owma".equals(type))&&(__CLR4_5_2335335lvlulchm.R.iget(4097)!=0|true))||(__CLR4_5_2335335lvlulchm.R.iget(4098)==0&false))) {{
            __CLR4_5_2335335lvlulchm.R.inc(4099);System.err.println("owma");
            __CLR4_5_2335335lvlulchm.R.inc(4100);final long remaining = contentSize - 28
                    - ((((soundVersion == 1 )&&(__CLR4_5_2335335lvlulchm.R.iget(4101)!=0|true))||(__CLR4_5_2335335lvlulchm.R.iget(4102)==0&false))? 16 : 0)
                    - ((((soundVersion == 2 )&&(__CLR4_5_2335335lvlulchm.R.iget(4103)!=0|true))||(__CLR4_5_2335335lvlulchm.R.iget(4104)==0&false))? 36 : 0);
            __CLR4_5_2335335lvlulchm.R.inc(4105);final ByteBuffer owmaSpecifics = ByteBuffer.allocate(l2i(remaining));
            __CLR4_5_2335335lvlulchm.R.inc(4106);dataSource.read(owmaSpecifics);

            __CLR4_5_2335335lvlulchm.R.inc(4107);addBox(new Box() {
                public Container getParent() {try{__CLR4_5_2335335lvlulchm.R.inc(4108);
                    __CLR4_5_2335335lvlulchm.R.inc(4109);return AudioSampleEntry.this;
                }finally{__CLR4_5_2335335lvlulchm.R.flushNeeded();}}

                public void setParent(Container parent) {try{__CLR4_5_2335335lvlulchm.R.inc(4110);
                    assert (((parent == AudioSampleEntry.this )&&(__CLR4_5_2335335lvlulchm.R.iget(4111)!=0|true))||(__CLR4_5_2335335lvlulchm.R.iget(4112)==0&false)): "you cannot diswown this special box";
                }finally{__CLR4_5_2335335lvlulchm.R.flushNeeded();}}

                public long getSize() {try{__CLR4_5_2335335lvlulchm.R.inc(4113);
                    __CLR4_5_2335335lvlulchm.R.inc(4114);return remaining;
                }finally{__CLR4_5_2335335lvlulchm.R.flushNeeded();}}

                public long getOffset() {try{__CLR4_5_2335335lvlulchm.R.inc(4115);
                    __CLR4_5_2335335lvlulchm.R.inc(4116);return 0;
                }finally{__CLR4_5_2335335lvlulchm.R.flushNeeded();}}

                public String getType() {try{__CLR4_5_2335335lvlulchm.R.inc(4117);
                    __CLR4_5_2335335lvlulchm.R.inc(4118);return "----";
                }finally{__CLR4_5_2335335lvlulchm.R.flushNeeded();}}

                public void getBox(WritableByteChannel writableByteChannel) throws IOException {try{__CLR4_5_2335335lvlulchm.R.inc(4119);
                    __CLR4_5_2335335lvlulchm.R.inc(4120);owmaSpecifics.rewind();
                    __CLR4_5_2335335lvlulchm.R.inc(4121);writableByteChannel.write(owmaSpecifics);
                }finally{__CLR4_5_2335335lvlulchm.R.flushNeeded();}}

                public void parse(DataSource dataSource, ByteBuffer header, long contentSize, BoxParser boxParser) throws IOException {try{__CLR4_5_2335335lvlulchm.R.inc(4122);
                    __CLR4_5_2335335lvlulchm.R.inc(4123);throw new RuntimeException("NotImplemented");
                }finally{__CLR4_5_2335335lvlulchm.R.flushNeeded();}}
            });
        } }else {{
            __CLR4_5_2335335lvlulchm.R.inc(4124);initContainer(dataSource,
                    contentSize - 28
                            - ((((soundVersion == 1 )&&(__CLR4_5_2335335lvlulchm.R.iget(4125)!=0|true))||(__CLR4_5_2335335lvlulchm.R.iget(4126)==0&false))? 16 : 0)
                            - ((((soundVersion == 2 )&&(__CLR4_5_2335335lvlulchm.R.iget(4127)!=0|true))||(__CLR4_5_2335335lvlulchm.R.iget(4128)==0&false))? 36 : 0), boxParser);
        }
    }}finally{__CLR4_5_2335335lvlulchm.R.flushNeeded();}}

    @Override
    public void getBox(WritableByteChannel writableByteChannel) throws IOException {try{__CLR4_5_2335335lvlulchm.R.inc(4129);
        __CLR4_5_2335335lvlulchm.R.inc(4130);writableByteChannel.write(getHeader());
        __CLR4_5_2335335lvlulchm.R.inc(4131);ByteBuffer byteBuffer = ByteBuffer.allocate(28
                + ((((soundVersion == 1 )&&(__CLR4_5_2335335lvlulchm.R.iget(4132)!=0|true))||(__CLR4_5_2335335lvlulchm.R.iget(4133)==0&false))? 16 : 0)
                + ((((soundVersion == 2 )&&(__CLR4_5_2335335lvlulchm.R.iget(4134)!=0|true))||(__CLR4_5_2335335lvlulchm.R.iget(4135)==0&false))? 36 : 0));
        __CLR4_5_2335335lvlulchm.R.inc(4136);byteBuffer.position(6);
        __CLR4_5_2335335lvlulchm.R.inc(4137);IsoTypeWriter.writeUInt16(byteBuffer, dataReferenceIndex);
        __CLR4_5_2335335lvlulchm.R.inc(4138);IsoTypeWriter.writeUInt16(byteBuffer, soundVersion);
        __CLR4_5_2335335lvlulchm.R.inc(4139);IsoTypeWriter.writeUInt16(byteBuffer, reserved1);
        __CLR4_5_2335335lvlulchm.R.inc(4140);IsoTypeWriter.writeUInt32(byteBuffer, reserved2);
        __CLR4_5_2335335lvlulchm.R.inc(4141);IsoTypeWriter.writeUInt16(byteBuffer, channelCount);
        __CLR4_5_2335335lvlulchm.R.inc(4142);IsoTypeWriter.writeUInt16(byteBuffer, sampleSize);
        __CLR4_5_2335335lvlulchm.R.inc(4143);IsoTypeWriter.writeUInt16(byteBuffer, compressionId);
        __CLR4_5_2335335lvlulchm.R.inc(4144);IsoTypeWriter.writeUInt16(byteBuffer, packetSize);
        //isos.writeFixedPoint1616(getSampleRate());
        __CLR4_5_2335335lvlulchm.R.inc(4145);if ((((type.equals("mlpa"))&&(__CLR4_5_2335335lvlulchm.R.iget(4146)!=0|true))||(__CLR4_5_2335335lvlulchm.R.iget(4147)==0&false))) {{
            __CLR4_5_2335335lvlulchm.R.inc(4148);IsoTypeWriter.writeUInt32(byteBuffer, getSampleRate());
        } }else {{
            __CLR4_5_2335335lvlulchm.R.inc(4149);IsoTypeWriter.writeUInt32(byteBuffer, getSampleRate() << 16);
        }

        }__CLR4_5_2335335lvlulchm.R.inc(4150);if ((((soundVersion == 1)&&(__CLR4_5_2335335lvlulchm.R.iget(4151)!=0|true))||(__CLR4_5_2335335lvlulchm.R.iget(4152)==0&false))) {{
            __CLR4_5_2335335lvlulchm.R.inc(4153);IsoTypeWriter.writeUInt32(byteBuffer, samplesPerPacket);
            __CLR4_5_2335335lvlulchm.R.inc(4154);IsoTypeWriter.writeUInt32(byteBuffer, bytesPerPacket);
            __CLR4_5_2335335lvlulchm.R.inc(4155);IsoTypeWriter.writeUInt32(byteBuffer, bytesPerFrame);
            __CLR4_5_2335335lvlulchm.R.inc(4156);IsoTypeWriter.writeUInt32(byteBuffer, bytesPerSample);
        }

        }__CLR4_5_2335335lvlulchm.R.inc(4157);if ((((soundVersion == 2)&&(__CLR4_5_2335335lvlulchm.R.iget(4158)!=0|true))||(__CLR4_5_2335335lvlulchm.R.iget(4159)==0&false))) {{
            __CLR4_5_2335335lvlulchm.R.inc(4160);IsoTypeWriter.writeUInt32(byteBuffer, samplesPerPacket);
            __CLR4_5_2335335lvlulchm.R.inc(4161);IsoTypeWriter.writeUInt32(byteBuffer, bytesPerPacket);
            __CLR4_5_2335335lvlulchm.R.inc(4162);IsoTypeWriter.writeUInt32(byteBuffer, bytesPerFrame);
            __CLR4_5_2335335lvlulchm.R.inc(4163);IsoTypeWriter.writeUInt32(byteBuffer, bytesPerSample);
            __CLR4_5_2335335lvlulchm.R.inc(4164);byteBuffer.put(soundVersion2Data);
        }
        }__CLR4_5_2335335lvlulchm.R.inc(4165);writableByteChannel.write((ByteBuffer) byteBuffer.rewind());
        __CLR4_5_2335335lvlulchm.R.inc(4166);writeContainer(writableByteChannel);
    }finally{__CLR4_5_2335335lvlulchm.R.flushNeeded();}}

    @Override
    public long getSize() {try{__CLR4_5_2335335lvlulchm.R.inc(4167);
        __CLR4_5_2335335lvlulchm.R.inc(4168);long s = 28
                + ((((soundVersion == 1 )&&(__CLR4_5_2335335lvlulchm.R.iget(4169)!=0|true))||(__CLR4_5_2335335lvlulchm.R.iget(4170)==0&false))? 16 : 0)
                + ((((soundVersion == 2 )&&(__CLR4_5_2335335lvlulchm.R.iget(4171)!=0|true))||(__CLR4_5_2335335lvlulchm.R.iget(4172)==0&false))? 36 : 0) + getContainerSize();
        __CLR4_5_2335335lvlulchm.R.inc(4173);s += (((((this.largeBox || (s + 8) >= (1L << 32)) )&&(__CLR4_5_2335335lvlulchm.R.iget(4174)!=0|true))||(__CLR4_5_2335335lvlulchm.R.iget(4175)==0&false))? 16 : 8);
        __CLR4_5_2335335lvlulchm.R.inc(4176);return s;

    }finally{__CLR4_5_2335335lvlulchm.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_5_2335335lvlulchm.R.inc(4177);
        __CLR4_5_2335335lvlulchm.R.inc(4178);return "AudioSampleEntry{" +
                "bytesPerSample=" + bytesPerSample +
                ", bytesPerFrame=" + bytesPerFrame +
                ", bytesPerPacket=" + bytesPerPacket +
                ", samplesPerPacket=" + samplesPerPacket +
                ", packetSize=" + packetSize +
                ", compressionId=" + compressionId +
                ", soundVersion=" + soundVersion +
                ", sampleRate=" + sampleRate +
                ", sampleSize=" + sampleSize +
                ", channelCount=" + channelCount +
                ", boxes=" + getBoxes() +
                '}';
    }finally{__CLR4_5_2335335lvlulchm.R.flushNeeded();}}

}
