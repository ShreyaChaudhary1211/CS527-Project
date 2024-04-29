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
public final class AudioSampleEntry extends AbstractSampleEntry {public static class __CLR4_5_2328328lvl9efnt{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,4146,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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
        super(type);__CLR4_5_2328328lvl9efnt.R.inc(3969);try{__CLR4_5_2328328lvl9efnt.R.inc(3968);
    }finally{__CLR4_5_2328328lvl9efnt.R.flushNeeded();}}

    public void setType(String type) {try{__CLR4_5_2328328lvl9efnt.R.inc(3970);
        __CLR4_5_2328328lvl9efnt.R.inc(3971);this.type = type;
    }finally{__CLR4_5_2328328lvl9efnt.R.flushNeeded();}}

    public int getChannelCount() {try{__CLR4_5_2328328lvl9efnt.R.inc(3972);
        __CLR4_5_2328328lvl9efnt.R.inc(3973);return channelCount;
    }finally{__CLR4_5_2328328lvl9efnt.R.flushNeeded();}}

    public int getSampleSize() {try{__CLR4_5_2328328lvl9efnt.R.inc(3974);
        __CLR4_5_2328328lvl9efnt.R.inc(3975);return sampleSize;
    }finally{__CLR4_5_2328328lvl9efnt.R.flushNeeded();}}

    public long getSampleRate() {try{__CLR4_5_2328328lvl9efnt.R.inc(3976);
        __CLR4_5_2328328lvl9efnt.R.inc(3977);return sampleRate;
    }finally{__CLR4_5_2328328lvl9efnt.R.flushNeeded();}}

    public int getSoundVersion() {try{__CLR4_5_2328328lvl9efnt.R.inc(3978);
        __CLR4_5_2328328lvl9efnt.R.inc(3979);return soundVersion;
    }finally{__CLR4_5_2328328lvl9efnt.R.flushNeeded();}}

    public int getCompressionId() {try{__CLR4_5_2328328lvl9efnt.R.inc(3980);
        __CLR4_5_2328328lvl9efnt.R.inc(3981);return compressionId;
    }finally{__CLR4_5_2328328lvl9efnt.R.flushNeeded();}}

    public int getPacketSize() {try{__CLR4_5_2328328lvl9efnt.R.inc(3982);
        __CLR4_5_2328328lvl9efnt.R.inc(3983);return packetSize;
    }finally{__CLR4_5_2328328lvl9efnt.R.flushNeeded();}}

    public long getSamplesPerPacket() {try{__CLR4_5_2328328lvl9efnt.R.inc(3984);
        __CLR4_5_2328328lvl9efnt.R.inc(3985);return samplesPerPacket;
    }finally{__CLR4_5_2328328lvl9efnt.R.flushNeeded();}}

    public long getBytesPerPacket() {try{__CLR4_5_2328328lvl9efnt.R.inc(3986);
        __CLR4_5_2328328lvl9efnt.R.inc(3987);return bytesPerPacket;
    }finally{__CLR4_5_2328328lvl9efnt.R.flushNeeded();}}

    public long getBytesPerFrame() {try{__CLR4_5_2328328lvl9efnt.R.inc(3988);
        __CLR4_5_2328328lvl9efnt.R.inc(3989);return bytesPerFrame;
    }finally{__CLR4_5_2328328lvl9efnt.R.flushNeeded();}}

    public long getBytesPerSample() {try{__CLR4_5_2328328lvl9efnt.R.inc(3990);
        __CLR4_5_2328328lvl9efnt.R.inc(3991);return bytesPerSample;
    }finally{__CLR4_5_2328328lvl9efnt.R.flushNeeded();}}


    public byte[] getSoundVersion2Data() {try{__CLR4_5_2328328lvl9efnt.R.inc(3992);
        __CLR4_5_2328328lvl9efnt.R.inc(3993);return soundVersion2Data;
    }finally{__CLR4_5_2328328lvl9efnt.R.flushNeeded();}}

    public int getReserved1() {try{__CLR4_5_2328328lvl9efnt.R.inc(3994);
        __CLR4_5_2328328lvl9efnt.R.inc(3995);return reserved1;
    }finally{__CLR4_5_2328328lvl9efnt.R.flushNeeded();}}

    public long getReserved2() {try{__CLR4_5_2328328lvl9efnt.R.inc(3996);
        __CLR4_5_2328328lvl9efnt.R.inc(3997);return reserved2;
    }finally{__CLR4_5_2328328lvl9efnt.R.flushNeeded();}}

    public void setChannelCount(int channelCount) {try{__CLR4_5_2328328lvl9efnt.R.inc(3998);
        __CLR4_5_2328328lvl9efnt.R.inc(3999);this.channelCount = channelCount;
    }finally{__CLR4_5_2328328lvl9efnt.R.flushNeeded();}}

    public void setSampleSize(int sampleSize) {try{__CLR4_5_2328328lvl9efnt.R.inc(4000);
        __CLR4_5_2328328lvl9efnt.R.inc(4001);this.sampleSize = sampleSize;
    }finally{__CLR4_5_2328328lvl9efnt.R.flushNeeded();}}

    public void setSampleRate(long sampleRate) {try{__CLR4_5_2328328lvl9efnt.R.inc(4002);
        __CLR4_5_2328328lvl9efnt.R.inc(4003);this.sampleRate = sampleRate;
    }finally{__CLR4_5_2328328lvl9efnt.R.flushNeeded();}}

    public void setSoundVersion(int soundVersion) {try{__CLR4_5_2328328lvl9efnt.R.inc(4004);
        __CLR4_5_2328328lvl9efnt.R.inc(4005);this.soundVersion = soundVersion;
    }finally{__CLR4_5_2328328lvl9efnt.R.flushNeeded();}}

    public void setCompressionId(int compressionId) {try{__CLR4_5_2328328lvl9efnt.R.inc(4006);
        __CLR4_5_2328328lvl9efnt.R.inc(4007);this.compressionId = compressionId;
    }finally{__CLR4_5_2328328lvl9efnt.R.flushNeeded();}}

    public void setPacketSize(int packetSize) {try{__CLR4_5_2328328lvl9efnt.R.inc(4008);
        __CLR4_5_2328328lvl9efnt.R.inc(4009);this.packetSize = packetSize;
    }finally{__CLR4_5_2328328lvl9efnt.R.flushNeeded();}}

    public void setSamplesPerPacket(long samplesPerPacket) {try{__CLR4_5_2328328lvl9efnt.R.inc(4010);
        __CLR4_5_2328328lvl9efnt.R.inc(4011);this.samplesPerPacket = samplesPerPacket;
    }finally{__CLR4_5_2328328lvl9efnt.R.flushNeeded();}}

    public void setBytesPerPacket(long bytesPerPacket) {try{__CLR4_5_2328328lvl9efnt.R.inc(4012);
        __CLR4_5_2328328lvl9efnt.R.inc(4013);this.bytesPerPacket = bytesPerPacket;
    }finally{__CLR4_5_2328328lvl9efnt.R.flushNeeded();}}

    public void setBytesPerFrame(long bytesPerFrame) {try{__CLR4_5_2328328lvl9efnt.R.inc(4014);
        __CLR4_5_2328328lvl9efnt.R.inc(4015);this.bytesPerFrame = bytesPerFrame;
    }finally{__CLR4_5_2328328lvl9efnt.R.flushNeeded();}}

    public void setBytesPerSample(long bytesPerSample) {try{__CLR4_5_2328328lvl9efnt.R.inc(4016);
        __CLR4_5_2328328lvl9efnt.R.inc(4017);this.bytesPerSample = bytesPerSample;
    }finally{__CLR4_5_2328328lvl9efnt.R.flushNeeded();}}

    public void setReserved1(int reserved1) {try{__CLR4_5_2328328lvl9efnt.R.inc(4018);
        __CLR4_5_2328328lvl9efnt.R.inc(4019);this.reserved1 = reserved1;
    }finally{__CLR4_5_2328328lvl9efnt.R.flushNeeded();}}

    public void setReserved2(long reserved2) {try{__CLR4_5_2328328lvl9efnt.R.inc(4020);
        __CLR4_5_2328328lvl9efnt.R.inc(4021);this.reserved2 = reserved2;
    }finally{__CLR4_5_2328328lvl9efnt.R.flushNeeded();}}

    public void setSoundVersion2Data(byte[] soundVersion2Data) {try{__CLR4_5_2328328lvl9efnt.R.inc(4022);
        __CLR4_5_2328328lvl9efnt.R.inc(4023);this.soundVersion2Data = soundVersion2Data;
    }finally{__CLR4_5_2328328lvl9efnt.R.flushNeeded();}}

    @Override
    public void parse(DataSource dataSource, ByteBuffer header, long contentSize, BoxParser boxParser) throws IOException {try{__CLR4_5_2328328lvl9efnt.R.inc(4024);
        __CLR4_5_2328328lvl9efnt.R.inc(4025);ByteBuffer content = ByteBuffer.allocate(28);
        __CLR4_5_2328328lvl9efnt.R.inc(4026);dataSource.read(content);
        __CLR4_5_2328328lvl9efnt.R.inc(4027);content.position(6);
        __CLR4_5_2328328lvl9efnt.R.inc(4028);dataReferenceIndex = IsoTypeReader.readUInt16(content);

        // 8 bytes already parsed
        //reserved bits - used by qt
        __CLR4_5_2328328lvl9efnt.R.inc(4029);soundVersion = IsoTypeReader.readUInt16(content);

        //reserved
        __CLR4_5_2328328lvl9efnt.R.inc(4030);reserved1 = IsoTypeReader.readUInt16(content);
        __CLR4_5_2328328lvl9efnt.R.inc(4031);reserved2 = IsoTypeReader.readUInt32(content);

        __CLR4_5_2328328lvl9efnt.R.inc(4032);channelCount = IsoTypeReader.readUInt16(content);
        __CLR4_5_2328328lvl9efnt.R.inc(4033);sampleSize = IsoTypeReader.readUInt16(content);
        //reserved bits - used by qt
        __CLR4_5_2328328lvl9efnt.R.inc(4034);compressionId = IsoTypeReader.readUInt16(content);
        //reserved bits - used by qt
        __CLR4_5_2328328lvl9efnt.R.inc(4035);packetSize = IsoTypeReader.readUInt16(content);
        //sampleRate = in.readFixedPoint1616();
        __CLR4_5_2328328lvl9efnt.R.inc(4036);sampleRate = IsoTypeReader.readUInt32(content);
        __CLR4_5_2328328lvl9efnt.R.inc(4037);if ((((!type.equals("mlpa"))&&(__CLR4_5_2328328lvl9efnt.R.iget(4038)!=0|true))||(__CLR4_5_2328328lvl9efnt.R.iget(4039)==0&false))) {{
            __CLR4_5_2328328lvl9efnt.R.inc(4040);sampleRate = sampleRate >>> 16;
        }

        //more qt stuff - see http://mp4v2.googlecode.com/svn-history/r388/trunk/src/atom_sound.cpp

        }__CLR4_5_2328328lvl9efnt.R.inc(4041);if ((((soundVersion == 1)&&(__CLR4_5_2328328lvl9efnt.R.iget(4042)!=0|true))||(__CLR4_5_2328328lvl9efnt.R.iget(4043)==0&false))) {{
            __CLR4_5_2328328lvl9efnt.R.inc(4044);ByteBuffer appleStuff = ByteBuffer.allocate(16);
            __CLR4_5_2328328lvl9efnt.R.inc(4045);dataSource.read(appleStuff);
            __CLR4_5_2328328lvl9efnt.R.inc(4046);appleStuff.rewind();
            __CLR4_5_2328328lvl9efnt.R.inc(4047);samplesPerPacket = IsoTypeReader.readUInt32(appleStuff);
            __CLR4_5_2328328lvl9efnt.R.inc(4048);bytesPerPacket = IsoTypeReader.readUInt32(appleStuff);
            __CLR4_5_2328328lvl9efnt.R.inc(4049);bytesPerFrame = IsoTypeReader.readUInt32(appleStuff);
            __CLR4_5_2328328lvl9efnt.R.inc(4050);bytesPerSample = IsoTypeReader.readUInt32(appleStuff);
        }
        }__CLR4_5_2328328lvl9efnt.R.inc(4051);if ((((soundVersion == 2)&&(__CLR4_5_2328328lvl9efnt.R.iget(4052)!=0|true))||(__CLR4_5_2328328lvl9efnt.R.iget(4053)==0&false))) {{
            __CLR4_5_2328328lvl9efnt.R.inc(4054);ByteBuffer appleStuff = ByteBuffer.allocate(36);
            __CLR4_5_2328328lvl9efnt.R.inc(4055);dataSource.read(appleStuff);
            __CLR4_5_2328328lvl9efnt.R.inc(4056);appleStuff.rewind();
            __CLR4_5_2328328lvl9efnt.R.inc(4057);samplesPerPacket = IsoTypeReader.readUInt32(appleStuff);
            __CLR4_5_2328328lvl9efnt.R.inc(4058);bytesPerPacket = IsoTypeReader.readUInt32(appleStuff);
            __CLR4_5_2328328lvl9efnt.R.inc(4059);bytesPerFrame = IsoTypeReader.readUInt32(appleStuff);
            __CLR4_5_2328328lvl9efnt.R.inc(4060);bytesPerSample = IsoTypeReader.readUInt32(appleStuff);
            __CLR4_5_2328328lvl9efnt.R.inc(4061);soundVersion2Data = new byte[20];
            __CLR4_5_2328328lvl9efnt.R.inc(4062);appleStuff.get(soundVersion2Data);
        }

        }__CLR4_5_2328328lvl9efnt.R.inc(4063);if (((("owma".equals(type))&&(__CLR4_5_2328328lvl9efnt.R.iget(4064)!=0|true))||(__CLR4_5_2328328lvl9efnt.R.iget(4065)==0&false))) {{
            __CLR4_5_2328328lvl9efnt.R.inc(4066);System.err.println("owma");
            __CLR4_5_2328328lvl9efnt.R.inc(4067);final long remaining = contentSize - 28
                    - ((((soundVersion == 1 )&&(__CLR4_5_2328328lvl9efnt.R.iget(4068)!=0|true))||(__CLR4_5_2328328lvl9efnt.R.iget(4069)==0&false))? 16 : 0)
                    - ((((soundVersion == 2 )&&(__CLR4_5_2328328lvl9efnt.R.iget(4070)!=0|true))||(__CLR4_5_2328328lvl9efnt.R.iget(4071)==0&false))? 36 : 0);
            __CLR4_5_2328328lvl9efnt.R.inc(4072);final ByteBuffer owmaSpecifics = ByteBuffer.allocate(l2i(remaining));
            __CLR4_5_2328328lvl9efnt.R.inc(4073);dataSource.read(owmaSpecifics);

            __CLR4_5_2328328lvl9efnt.R.inc(4074);addBox(new Box() {
                public Container getParent() {try{__CLR4_5_2328328lvl9efnt.R.inc(4075);
                    __CLR4_5_2328328lvl9efnt.R.inc(4076);return AudioSampleEntry.this;
                }finally{__CLR4_5_2328328lvl9efnt.R.flushNeeded();}}

                public void setParent(Container parent) {try{__CLR4_5_2328328lvl9efnt.R.inc(4077);
                    assert (((parent == AudioSampleEntry.this )&&(__CLR4_5_2328328lvl9efnt.R.iget(4078)!=0|true))||(__CLR4_5_2328328lvl9efnt.R.iget(4079)==0&false)): "you cannot diswown this special box";
                }finally{__CLR4_5_2328328lvl9efnt.R.flushNeeded();}}

                public long getSize() {try{__CLR4_5_2328328lvl9efnt.R.inc(4080);
                    __CLR4_5_2328328lvl9efnt.R.inc(4081);return remaining;
                }finally{__CLR4_5_2328328lvl9efnt.R.flushNeeded();}}

                public long getOffset() {try{__CLR4_5_2328328lvl9efnt.R.inc(4082);
                    __CLR4_5_2328328lvl9efnt.R.inc(4083);return 0;
                }finally{__CLR4_5_2328328lvl9efnt.R.flushNeeded();}}

                public String getType() {try{__CLR4_5_2328328lvl9efnt.R.inc(4084);
                    __CLR4_5_2328328lvl9efnt.R.inc(4085);return "----";
                }finally{__CLR4_5_2328328lvl9efnt.R.flushNeeded();}}

                public void getBox(WritableByteChannel writableByteChannel) throws IOException {try{__CLR4_5_2328328lvl9efnt.R.inc(4086);
                    __CLR4_5_2328328lvl9efnt.R.inc(4087);owmaSpecifics.rewind();
                    __CLR4_5_2328328lvl9efnt.R.inc(4088);writableByteChannel.write(owmaSpecifics);
                }finally{__CLR4_5_2328328lvl9efnt.R.flushNeeded();}}

                public void parse(DataSource dataSource, ByteBuffer header, long contentSize, BoxParser boxParser) throws IOException {try{__CLR4_5_2328328lvl9efnt.R.inc(4089);
                    __CLR4_5_2328328lvl9efnt.R.inc(4090);throw new RuntimeException("NotImplemented");
                }finally{__CLR4_5_2328328lvl9efnt.R.flushNeeded();}}
            });
        } }else {{
            __CLR4_5_2328328lvl9efnt.R.inc(4091);initContainer(dataSource,
                    contentSize - 28
                            - ((((soundVersion == 1 )&&(__CLR4_5_2328328lvl9efnt.R.iget(4092)!=0|true))||(__CLR4_5_2328328lvl9efnt.R.iget(4093)==0&false))? 16 : 0)
                            - ((((soundVersion == 2 )&&(__CLR4_5_2328328lvl9efnt.R.iget(4094)!=0|true))||(__CLR4_5_2328328lvl9efnt.R.iget(4095)==0&false))? 36 : 0), boxParser);
        }
    }}finally{__CLR4_5_2328328lvl9efnt.R.flushNeeded();}}

    @Override
    public void getBox(WritableByteChannel writableByteChannel) throws IOException {try{__CLR4_5_2328328lvl9efnt.R.inc(4096);
        __CLR4_5_2328328lvl9efnt.R.inc(4097);writableByteChannel.write(getHeader());
        __CLR4_5_2328328lvl9efnt.R.inc(4098);ByteBuffer byteBuffer = ByteBuffer.allocate(28
                + ((((soundVersion == 1 )&&(__CLR4_5_2328328lvl9efnt.R.iget(4099)!=0|true))||(__CLR4_5_2328328lvl9efnt.R.iget(4100)==0&false))? 16 : 0)
                + ((((soundVersion == 2 )&&(__CLR4_5_2328328lvl9efnt.R.iget(4101)!=0|true))||(__CLR4_5_2328328lvl9efnt.R.iget(4102)==0&false))? 36 : 0));
        __CLR4_5_2328328lvl9efnt.R.inc(4103);byteBuffer.position(6);
        __CLR4_5_2328328lvl9efnt.R.inc(4104);IsoTypeWriter.writeUInt16(byteBuffer, dataReferenceIndex);
        __CLR4_5_2328328lvl9efnt.R.inc(4105);IsoTypeWriter.writeUInt16(byteBuffer, soundVersion);
        __CLR4_5_2328328lvl9efnt.R.inc(4106);IsoTypeWriter.writeUInt16(byteBuffer, reserved1);
        __CLR4_5_2328328lvl9efnt.R.inc(4107);IsoTypeWriter.writeUInt32(byteBuffer, reserved2);
        __CLR4_5_2328328lvl9efnt.R.inc(4108);IsoTypeWriter.writeUInt16(byteBuffer, channelCount);
        __CLR4_5_2328328lvl9efnt.R.inc(4109);IsoTypeWriter.writeUInt16(byteBuffer, sampleSize);
        __CLR4_5_2328328lvl9efnt.R.inc(4110);IsoTypeWriter.writeUInt16(byteBuffer, compressionId);
        __CLR4_5_2328328lvl9efnt.R.inc(4111);IsoTypeWriter.writeUInt16(byteBuffer, packetSize);
        //isos.writeFixedPoint1616(getSampleRate());
        __CLR4_5_2328328lvl9efnt.R.inc(4112);if ((((type.equals("mlpa"))&&(__CLR4_5_2328328lvl9efnt.R.iget(4113)!=0|true))||(__CLR4_5_2328328lvl9efnt.R.iget(4114)==0&false))) {{
            __CLR4_5_2328328lvl9efnt.R.inc(4115);IsoTypeWriter.writeUInt32(byteBuffer, getSampleRate());
        } }else {{
            __CLR4_5_2328328lvl9efnt.R.inc(4116);IsoTypeWriter.writeUInt32(byteBuffer, getSampleRate() << 16);
        }

        }__CLR4_5_2328328lvl9efnt.R.inc(4117);if ((((soundVersion == 1)&&(__CLR4_5_2328328lvl9efnt.R.iget(4118)!=0|true))||(__CLR4_5_2328328lvl9efnt.R.iget(4119)==0&false))) {{
            __CLR4_5_2328328lvl9efnt.R.inc(4120);IsoTypeWriter.writeUInt32(byteBuffer, samplesPerPacket);
            __CLR4_5_2328328lvl9efnt.R.inc(4121);IsoTypeWriter.writeUInt32(byteBuffer, bytesPerPacket);
            __CLR4_5_2328328lvl9efnt.R.inc(4122);IsoTypeWriter.writeUInt32(byteBuffer, bytesPerFrame);
            __CLR4_5_2328328lvl9efnt.R.inc(4123);IsoTypeWriter.writeUInt32(byteBuffer, bytesPerSample);
        }

        }__CLR4_5_2328328lvl9efnt.R.inc(4124);if ((((soundVersion == 2)&&(__CLR4_5_2328328lvl9efnt.R.iget(4125)!=0|true))||(__CLR4_5_2328328lvl9efnt.R.iget(4126)==0&false))) {{
            __CLR4_5_2328328lvl9efnt.R.inc(4127);IsoTypeWriter.writeUInt32(byteBuffer, samplesPerPacket);
            __CLR4_5_2328328lvl9efnt.R.inc(4128);IsoTypeWriter.writeUInt32(byteBuffer, bytesPerPacket);
            __CLR4_5_2328328lvl9efnt.R.inc(4129);IsoTypeWriter.writeUInt32(byteBuffer, bytesPerFrame);
            __CLR4_5_2328328lvl9efnt.R.inc(4130);IsoTypeWriter.writeUInt32(byteBuffer, bytesPerSample);
            __CLR4_5_2328328lvl9efnt.R.inc(4131);byteBuffer.put(soundVersion2Data);
        }
        }__CLR4_5_2328328lvl9efnt.R.inc(4132);writableByteChannel.write((ByteBuffer) byteBuffer.rewind());
        __CLR4_5_2328328lvl9efnt.R.inc(4133);writeContainer(writableByteChannel);
    }finally{__CLR4_5_2328328lvl9efnt.R.flushNeeded();}}

    @Override
    public long getSize() {try{__CLR4_5_2328328lvl9efnt.R.inc(4134);
        __CLR4_5_2328328lvl9efnt.R.inc(4135);long s = 28
                + ((((soundVersion == 1 )&&(__CLR4_5_2328328lvl9efnt.R.iget(4136)!=0|true))||(__CLR4_5_2328328lvl9efnt.R.iget(4137)==0&false))? 16 : 0)
                + ((((soundVersion == 2 )&&(__CLR4_5_2328328lvl9efnt.R.iget(4138)!=0|true))||(__CLR4_5_2328328lvl9efnt.R.iget(4139)==0&false))? 36 : 0) + getContainerSize();
        __CLR4_5_2328328lvl9efnt.R.inc(4140);s += (((((this.largeBox || (s + 8) >= (1L << 32)) )&&(__CLR4_5_2328328lvl9efnt.R.iget(4141)!=0|true))||(__CLR4_5_2328328lvl9efnt.R.iget(4142)==0&false))? 16 : 8);
        __CLR4_5_2328328lvl9efnt.R.inc(4143);return s;

    }finally{__CLR4_5_2328328lvl9efnt.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_5_2328328lvl9efnt.R.inc(4144);
        __CLR4_5_2328328lvl9efnt.R.inc(4145);return "AudioSampleEntry{" +
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
    }finally{__CLR4_5_2328328lvl9efnt.R.flushNeeded();}}

}
