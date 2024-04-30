/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2011 castLabs, Berlin
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

package com.googlecode.mp4parser.boxes.mp4.objectdescriptors;

import com.coremedia.iso.Hex;
import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/**
 * class DecoderConfigDescriptor extends BaseDescriptor : bit(8)
 * tag=DecoderConfigDescrTag {
 * bit(8) objectTypeIndication;
 * bit(6) streamType;
 * bit(1) upStream;
 * const bit(1) reserved=1;
 * bit(24) bufferSizeDB;
 * bit(32) maxBitrate;
 * bit(32) avgBitrate;
 * DecoderSpecificInfo decSpecificInfo[0 .. 1];
 * profileLevelIndicationIndexDescriptor profileLevelIndicationIndexDescr
 * [0..255];
 * }
 */
@Descriptor(tags = {0x04})
public class DecoderConfigDescriptor extends BaseDescriptor {public static class __CLR4_5_2d8td8tlvlulm2r{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,17291,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static Logger log = Logger.getLogger(DecoderConfigDescriptor.class.getName());
    int objectTypeIndication;
    int streamType;
    int upStream;
    int bufferSizeDB;
    long maxBitRate;
    long avgBitRate;
    DecoderSpecificInfo decoderSpecificInfo;
    AudioSpecificConfig audioSpecificInfo;
    List<ProfileLevelIndicationDescriptor> profileLevelIndicationDescriptors = new ArrayList<ProfileLevelIndicationDescriptor>();
    byte[] configDescriptorDeadBytes;
    public DecoderConfigDescriptor() {try{__CLR4_5_2d8td8tlvlulm2r.R.inc(17165);
        __CLR4_5_2d8td8tlvlulm2r.R.inc(17166);tag = 0x04;
    }finally{__CLR4_5_2d8td8tlvlulm2r.R.flushNeeded();}}

    @Override
    public void parseDetail(ByteBuffer bb) throws IOException {try{__CLR4_5_2d8td8tlvlulm2r.R.inc(17167);
        __CLR4_5_2d8td8tlvlulm2r.R.inc(17168);objectTypeIndication = IsoTypeReader.readUInt8(bb);

        __CLR4_5_2d8td8tlvlulm2r.R.inc(17169);int data = IsoTypeReader.readUInt8(bb);
        __CLR4_5_2d8td8tlvlulm2r.R.inc(17170);streamType = data >>> 2;
        __CLR4_5_2d8td8tlvlulm2r.R.inc(17171);upStream = (data >> 1) & 0x1;

        __CLR4_5_2d8td8tlvlulm2r.R.inc(17172);bufferSizeDB = IsoTypeReader.readUInt24(bb);
        __CLR4_5_2d8td8tlvlulm2r.R.inc(17173);maxBitRate = IsoTypeReader.readUInt32(bb);
        __CLR4_5_2d8td8tlvlulm2r.R.inc(17174);avgBitRate = IsoTypeReader.readUInt32(bb);


        __CLR4_5_2d8td8tlvlulm2r.R.inc(17175);BaseDescriptor descriptor;
        __CLR4_5_2d8td8tlvlulm2r.R.inc(17176);while ((((bb.remaining() > 2)&&(__CLR4_5_2d8td8tlvlulm2r.R.iget(17177)!=0|true))||(__CLR4_5_2d8td8tlvlulm2r.R.iget(17178)==0&false))) {{ //1byte tag + at least 1byte size
            __CLR4_5_2d8td8tlvlulm2r.R.inc(17179);final int begin = bb.position();
            __CLR4_5_2d8td8tlvlulm2r.R.inc(17180);descriptor = ObjectDescriptorFactory.createFrom(objectTypeIndication, bb);
            __CLR4_5_2d8td8tlvlulm2r.R.inc(17181);final int read = bb.position() - begin;
            __CLR4_5_2d8td8tlvlulm2r.R.inc(17182);log.finer(descriptor + " - DecoderConfigDescr1 read: " + read + ", size: " + ((((descriptor != null )&&(__CLR4_5_2d8td8tlvlulm2r.R.iget(17183)!=0|true))||(__CLR4_5_2d8td8tlvlulm2r.R.iget(17184)==0&false))? descriptor.getSize() : null));
            __CLR4_5_2d8td8tlvlulm2r.R.inc(17185);if ((((descriptor != null)&&(__CLR4_5_2d8td8tlvlulm2r.R.iget(17186)!=0|true))||(__CLR4_5_2d8td8tlvlulm2r.R.iget(17187)==0&false))) {{
                __CLR4_5_2d8td8tlvlulm2r.R.inc(17188);final int size = descriptor.getSize();
                __CLR4_5_2d8td8tlvlulm2r.R.inc(17189);if ((((read < size)&&(__CLR4_5_2d8td8tlvlulm2r.R.iget(17190)!=0|true))||(__CLR4_5_2d8td8tlvlulm2r.R.iget(17191)==0&false))) {{
                    //skip
                    __CLR4_5_2d8td8tlvlulm2r.R.inc(17192);configDescriptorDeadBytes = new byte[size - read];
                    __CLR4_5_2d8td8tlvlulm2r.R.inc(17193);bb.get(configDescriptorDeadBytes);
                }
            }}
            }__CLR4_5_2d8td8tlvlulm2r.R.inc(17194);if ((((descriptor instanceof DecoderSpecificInfo)&&(__CLR4_5_2d8td8tlvlulm2r.R.iget(17195)!=0|true))||(__CLR4_5_2d8td8tlvlulm2r.R.iget(17196)==0&false))) {{
                __CLR4_5_2d8td8tlvlulm2r.R.inc(17197);decoderSpecificInfo = (DecoderSpecificInfo) descriptor;
            } }else {__CLR4_5_2d8td8tlvlulm2r.R.inc(17198);if ((((descriptor instanceof AudioSpecificConfig)&&(__CLR4_5_2d8td8tlvlulm2r.R.iget(17199)!=0|true))||(__CLR4_5_2d8td8tlvlulm2r.R.iget(17200)==0&false))) {{
                __CLR4_5_2d8td8tlvlulm2r.R.inc(17201);audioSpecificInfo = (AudioSpecificConfig) descriptor;
            } }else {__CLR4_5_2d8td8tlvlulm2r.R.inc(17202);if ((((descriptor instanceof ProfileLevelIndicationDescriptor)&&(__CLR4_5_2d8td8tlvlulm2r.R.iget(17203)!=0|true))||(__CLR4_5_2d8td8tlvlulm2r.R.iget(17204)==0&false))) {{
                __CLR4_5_2d8td8tlvlulm2r.R.inc(17205);profileLevelIndicationDescriptors.add((ProfileLevelIndicationDescriptor) descriptor);
            }

        }}}}

    }}finally{__CLR4_5_2d8td8tlvlulm2r.R.flushNeeded();}}

    int getContentSize() {try{__CLR4_5_2d8td8tlvlulm2r.R.inc(17206);
        __CLR4_5_2d8td8tlvlulm2r.R.inc(17207);int out = 13 +
                ((((audioSpecificInfo == null )&&(__CLR4_5_2d8td8tlvlulm2r.R.iget(17208)!=0|true))||(__CLR4_5_2d8td8tlvlulm2r.R.iget(17209)==0&false))? 0 : audioSpecificInfo.getSize()) +
                ((((decoderSpecificInfo == null )&&(__CLR4_5_2d8td8tlvlulm2r.R.iget(17210)!=0|true))||(__CLR4_5_2d8td8tlvlulm2r.R.iget(17211)==0&false))? 0 : decoderSpecificInfo.getSize());
        __CLR4_5_2d8td8tlvlulm2r.R.inc(17212);for (ProfileLevelIndicationDescriptor profileLevelIndicationDescriptor : profileLevelIndicationDescriptors) {{
            __CLR4_5_2d8td8tlvlulm2r.R.inc(17213);out += profileLevelIndicationDescriptor.getSize();
        }
        }__CLR4_5_2d8td8tlvlulm2r.R.inc(17214);return out;
    }finally{__CLR4_5_2d8td8tlvlulm2r.R.flushNeeded();}}

    public ByteBuffer serialize() {try{__CLR4_5_2d8td8tlvlulm2r.R.inc(17215);
        __CLR4_5_2d8td8tlvlulm2r.R.inc(17216);ByteBuffer out = ByteBuffer.allocate(getSize());
        __CLR4_5_2d8td8tlvlulm2r.R.inc(17217);IsoTypeWriter.writeUInt8(out, tag);
        __CLR4_5_2d8td8tlvlulm2r.R.inc(17218);writeSize(out, getContentSize());
        __CLR4_5_2d8td8tlvlulm2r.R.inc(17219);IsoTypeWriter.writeUInt8(out, objectTypeIndication);
        __CLR4_5_2d8td8tlvlulm2r.R.inc(17220);int flags = (streamType << 2) | (upStream << 1) | 1;
        __CLR4_5_2d8td8tlvlulm2r.R.inc(17221);IsoTypeWriter.writeUInt8(out, flags);
        __CLR4_5_2d8td8tlvlulm2r.R.inc(17222);IsoTypeWriter.writeUInt24(out, bufferSizeDB);
        __CLR4_5_2d8td8tlvlulm2r.R.inc(17223);IsoTypeWriter.writeUInt32(out, maxBitRate);
        __CLR4_5_2d8td8tlvlulm2r.R.inc(17224);IsoTypeWriter.writeUInt32(out, avgBitRate);
        __CLR4_5_2d8td8tlvlulm2r.R.inc(17225);if ((((decoderSpecificInfo != null)&&(__CLR4_5_2d8td8tlvlulm2r.R.iget(17226)!=0|true))||(__CLR4_5_2d8td8tlvlulm2r.R.iget(17227)==0&false))) {{
            __CLR4_5_2d8td8tlvlulm2r.R.inc(17228);ByteBuffer bb = decoderSpecificInfo.serialize();
            __CLR4_5_2d8td8tlvlulm2r.R.inc(17229);out.put(bb);
        }
        }__CLR4_5_2d8td8tlvlulm2r.R.inc(17230);if ((((audioSpecificInfo != null)&&(__CLR4_5_2d8td8tlvlulm2r.R.iget(17231)!=0|true))||(__CLR4_5_2d8td8tlvlulm2r.R.iget(17232)==0&false))) {{
            __CLR4_5_2d8td8tlvlulm2r.R.inc(17233);ByteBuffer bb = audioSpecificInfo.serialize();
            __CLR4_5_2d8td8tlvlulm2r.R.inc(17234);out.put(bb);
        }
        }__CLR4_5_2d8td8tlvlulm2r.R.inc(17235);for (ProfileLevelIndicationDescriptor profileLevelIndicationDescriptor : profileLevelIndicationDescriptors) {{
            __CLR4_5_2d8td8tlvlulm2r.R.inc(17236);out.put(profileLevelIndicationDescriptor.serialize());
        }
        }__CLR4_5_2d8td8tlvlulm2r.R.inc(17237);return (ByteBuffer) out.rewind();
    }finally{__CLR4_5_2d8td8tlvlulm2r.R.flushNeeded();}}

    public DecoderSpecificInfo getDecoderSpecificInfo() {try{__CLR4_5_2d8td8tlvlulm2r.R.inc(17238);
        __CLR4_5_2d8td8tlvlulm2r.R.inc(17239);return decoderSpecificInfo;
    }finally{__CLR4_5_2d8td8tlvlulm2r.R.flushNeeded();}}

    public void setDecoderSpecificInfo(DecoderSpecificInfo decoderSpecificInfo) {try{__CLR4_5_2d8td8tlvlulm2r.R.inc(17240);
        __CLR4_5_2d8td8tlvlulm2r.R.inc(17241);this.decoderSpecificInfo = decoderSpecificInfo;
    }finally{__CLR4_5_2d8td8tlvlulm2r.R.flushNeeded();}}

    public AudioSpecificConfig getAudioSpecificInfo() {try{__CLR4_5_2d8td8tlvlulm2r.R.inc(17242);
        __CLR4_5_2d8td8tlvlulm2r.R.inc(17243);return audioSpecificInfo;
    }finally{__CLR4_5_2d8td8tlvlulm2r.R.flushNeeded();}}

    public void setAudioSpecificInfo(AudioSpecificConfig audioSpecificInfo) {try{__CLR4_5_2d8td8tlvlulm2r.R.inc(17244);
        __CLR4_5_2d8td8tlvlulm2r.R.inc(17245);this.audioSpecificInfo = audioSpecificInfo;
    }finally{__CLR4_5_2d8td8tlvlulm2r.R.flushNeeded();}}

    public List<ProfileLevelIndicationDescriptor> getProfileLevelIndicationDescriptors() {try{__CLR4_5_2d8td8tlvlulm2r.R.inc(17246);
        __CLR4_5_2d8td8tlvlulm2r.R.inc(17247);return profileLevelIndicationDescriptors;
    }finally{__CLR4_5_2d8td8tlvlulm2r.R.flushNeeded();}}

    public int getObjectTypeIndication() {try{__CLR4_5_2d8td8tlvlulm2r.R.inc(17248);
        __CLR4_5_2d8td8tlvlulm2r.R.inc(17249);return objectTypeIndication;
    }finally{__CLR4_5_2d8td8tlvlulm2r.R.flushNeeded();}}

    public void setObjectTypeIndication(int objectTypeIndication) {try{__CLR4_5_2d8td8tlvlulm2r.R.inc(17250);
        __CLR4_5_2d8td8tlvlulm2r.R.inc(17251);this.objectTypeIndication = objectTypeIndication;
    }finally{__CLR4_5_2d8td8tlvlulm2r.R.flushNeeded();}}

    public int getStreamType() {try{__CLR4_5_2d8td8tlvlulm2r.R.inc(17252);
        __CLR4_5_2d8td8tlvlulm2r.R.inc(17253);return streamType;
    }finally{__CLR4_5_2d8td8tlvlulm2r.R.flushNeeded();}}

    public void setStreamType(int streamType) {try{__CLR4_5_2d8td8tlvlulm2r.R.inc(17254);
        __CLR4_5_2d8td8tlvlulm2r.R.inc(17255);this.streamType = streamType;
    }finally{__CLR4_5_2d8td8tlvlulm2r.R.flushNeeded();}}

    public int getUpStream() {try{__CLR4_5_2d8td8tlvlulm2r.R.inc(17256);
        __CLR4_5_2d8td8tlvlulm2r.R.inc(17257);return upStream;
    }finally{__CLR4_5_2d8td8tlvlulm2r.R.flushNeeded();}}

    public void setUpStream(int upStream) {try{__CLR4_5_2d8td8tlvlulm2r.R.inc(17258);
        __CLR4_5_2d8td8tlvlulm2r.R.inc(17259);this.upStream = upStream;
    }finally{__CLR4_5_2d8td8tlvlulm2r.R.flushNeeded();}}

    public int getBufferSizeDB() {try{__CLR4_5_2d8td8tlvlulm2r.R.inc(17260);
        __CLR4_5_2d8td8tlvlulm2r.R.inc(17261);return bufferSizeDB;
    }finally{__CLR4_5_2d8td8tlvlulm2r.R.flushNeeded();}}

    public void setBufferSizeDB(int bufferSizeDB) {try{__CLR4_5_2d8td8tlvlulm2r.R.inc(17262);
        __CLR4_5_2d8td8tlvlulm2r.R.inc(17263);this.bufferSizeDB = bufferSizeDB;
    }finally{__CLR4_5_2d8td8tlvlulm2r.R.flushNeeded();}}

    public long getMaxBitRate() {try{__CLR4_5_2d8td8tlvlulm2r.R.inc(17264);
        __CLR4_5_2d8td8tlvlulm2r.R.inc(17265);return maxBitRate;
    }finally{__CLR4_5_2d8td8tlvlulm2r.R.flushNeeded();}}

    public void setMaxBitRate(long maxBitRate) {try{__CLR4_5_2d8td8tlvlulm2r.R.inc(17266);
        __CLR4_5_2d8td8tlvlulm2r.R.inc(17267);this.maxBitRate = maxBitRate;
    }finally{__CLR4_5_2d8td8tlvlulm2r.R.flushNeeded();}}

    public long getAvgBitRate() {try{__CLR4_5_2d8td8tlvlulm2r.R.inc(17268);
        __CLR4_5_2d8td8tlvlulm2r.R.inc(17269);return avgBitRate;
    }finally{__CLR4_5_2d8td8tlvlulm2r.R.flushNeeded();}}

    public void setAvgBitRate(long avgBitRate) {try{__CLR4_5_2d8td8tlvlulm2r.R.inc(17270);
        __CLR4_5_2d8td8tlvlulm2r.R.inc(17271);this.avgBitRate = avgBitRate;
    }finally{__CLR4_5_2d8td8tlvlulm2r.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_5_2d8td8tlvlulm2r.R.inc(17272);
        __CLR4_5_2d8td8tlvlulm2r.R.inc(17273);final StringBuilder sb = new StringBuilder();
        __CLR4_5_2d8td8tlvlulm2r.R.inc(17274);sb.append("DecoderConfigDescriptor");
        __CLR4_5_2d8td8tlvlulm2r.R.inc(17275);sb.append("{objectTypeIndication=").append(objectTypeIndication);
        __CLR4_5_2d8td8tlvlulm2r.R.inc(17276);sb.append(", streamType=").append(streamType);
        __CLR4_5_2d8td8tlvlulm2r.R.inc(17277);sb.append(", upStream=").append(upStream);
        __CLR4_5_2d8td8tlvlulm2r.R.inc(17278);sb.append(", bufferSizeDB=").append(bufferSizeDB);
        __CLR4_5_2d8td8tlvlulm2r.R.inc(17279);sb.append(", maxBitRate=").append(maxBitRate);
        __CLR4_5_2d8td8tlvlulm2r.R.inc(17280);sb.append(", avgBitRate=").append(avgBitRate);
        __CLR4_5_2d8td8tlvlulm2r.R.inc(17281);sb.append(", decoderSpecificInfo=").append(decoderSpecificInfo);
        __CLR4_5_2d8td8tlvlulm2r.R.inc(17282);sb.append(", audioSpecificInfo=").append(audioSpecificInfo);
        __CLR4_5_2d8td8tlvlulm2r.R.inc(17283);sb.append(", configDescriptorDeadBytes=").append(Hex.encodeHex((((configDescriptorDeadBytes != null )&&(__CLR4_5_2d8td8tlvlulm2r.R.iget(17284)!=0|true))||(__CLR4_5_2d8td8tlvlulm2r.R.iget(17285)==0&false))? configDescriptorDeadBytes : new byte[]{}));
        __CLR4_5_2d8td8tlvlulm2r.R.inc(17286);sb.append(", profileLevelIndicationDescriptors=").append((((profileLevelIndicationDescriptors == null )&&(__CLR4_5_2d8td8tlvlulm2r.R.iget(17287)!=0|true))||(__CLR4_5_2d8td8tlvlulm2r.R.iget(17288)==0&false))? "null" : Arrays.asList(profileLevelIndicationDescriptors).toString());
        __CLR4_5_2d8td8tlvlulm2r.R.inc(17289);sb.append('}');
        __CLR4_5_2d8td8tlvlulm2r.R.inc(17290);return sb.toString();
    }finally{__CLR4_5_2d8td8tlvlulm2r.R.flushNeeded();}}
    /*objectTypeIndication values
      0x00 Forbidden
    0x01 Systems ISO/IEC 14496-1 a
    0x02 Systems ISO/IEC 14496-1 b
    0x03 Interaction Stream
    0x04 Systems ISO/IEC 14496-1 Extended BIFS Configuration c
    0x05 Systems ISO/IEC 14496-1 AFX d
    0x06 Font Data Stream
    0x07 Synthesized Texture Stream
    0x08 Streaming Text Stream
    0x09-0x1F reserved for ISO use
    0x20 Visual ISO/IEC 14496-2 e
    0x21 Visual ITU-T Recommendation H.264 | ISO/IEC 14496-10 f
    0x22 Parameter Sets for ITU-T Recommendation H.264 | ISO/IEC 14496-10 f
    0x23-0x3F reserved for ISO use
    0x40 Audio ISO/IEC 14496-3 g
    0x41-0x5F reserved for ISO use
    0x60 Visual ISO/IEC 13818-2 Simple Profile
    0x61 Visual ISO/IEC 13818-2 Main Profile
    0x62 Visual ISO/IEC 13818-2 SNR Profile
    0x63 Visual ISO/IEC 13818-2 Spatial Profile
    0x64 Visual ISO/IEC 13818-2 High Profile
    0x65 Visual ISO/IEC 13818-2 422 Profile
    0x66 Audio ISO/IEC 13818-7 Main Profile
    0x67 Audio ISO/IEC 13818-7 LowComplexity Profile
    0x68 Audio ISO/IEC 13818-7 Scaleable Sampling Rate Profile
    0x69 Audio ISO/IEC 13818-3
    0x6A Visual ISO/IEC 11172-2
    0x6B Audio ISO/IEC 11172-3
    0x6C Visual ISO/IEC 10918-1
    0x6D reserved for registration authority i
    0x6E Visual ISO/IEC 15444-1
    0x6F - 0x9F reserved for ISO use
    0xA0 - 0xBF reserved for registration authority i
    0xC0 - 0xE0 user private
    0xE1 reserved for registration authority i
    0xE2 - 0xFE user private
    0xFF no object type specified h
    */
    /* streamType values
      0x00 Forbidden
    0x01 ObjectDescriptorStream (see 7.2.5)
    0x02 ClockReferenceStream (see 7.3.2.5)
    0x03 SceneDescriptionStream (see ISO/IEC 14496-11)
    0x04 VisualStream
    0x05 AudioStream
    0x06 MPEG7Stream
    0x07 IPMPStream (see 7.2.3.2)
    0x08 ObjectContentInfoStream (see 7.2.4.2)
    0x09 MPEGJStream
    0x0A Interaction Stream
    0x0B IPMPToolStream (see [ISO/IEC 14496-13])
    0x0C - 0x1F reserved for ISO use
    0x20 - 0x3F user private
    */
}
