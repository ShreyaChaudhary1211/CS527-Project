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

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/*
class ES_Descriptor extends BaseDescriptor : bit(8) tag=ES_DescrTag {
bit(16) ES_ID;
bit(1) streamDependenceFlag;
bit(1) URL_Flag;
bit(1) OCRstreamFlag;
bit(5) streamPriority;
if (streamDependenceFlag)
bit(16) dependsOn_ES_ID;
if (URL_Flag) {
bit(8) URLlength;
bit(8) URLstring[URLlength];
}
if (OCRstreamFlag)
bit(16) OCR_ES_Id;
DecoderConfigDescriptor decConfigDescr;
if (ODProfileLevelIndication==0x01) //no SL extension.
{
SLConfigDescriptor slConfigDescr;
}
else // SL extension is possible.
{
SLConfigDescriptor slConfigDescr;
}
IPI_DescrPointer ipiPtr[0 .. 1];
IP_IdentificationDataSet ipIDS[0 .. 255];
IPMP_DescriptorPointer ipmpDescrPtr[0 .. 255];
LanguageDescriptor langDescr[0 .. 255];
QoS_Descriptor qosDescr[0 .. 1];
RegistrationDescriptor regDescr[0 .. 1];
ExtensionDescriptor extDescr[0 .. 255];
}
 */
@Descriptor(tags = {0x03})
public class ESDescriptor extends BaseDescriptor {public static class __CLR4_5_2ddhddhlvlulm8x{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,17576,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static Logger log = Logger.getLogger(ESDescriptor.class.getName());
    int esId;
    int streamDependenceFlag;
    int URLFlag;
    int oCRstreamFlag;
    int streamPriority;
    int URLLength = 0;
    String URLString;
    int remoteODFlag;
    int dependsOnEsId;
    int oCREsId;
    DecoderConfigDescriptor decoderConfigDescriptor;
    SLConfigDescriptor slConfigDescriptor;
    List<BaseDescriptor> otherDescriptors = new ArrayList<BaseDescriptor>();
    public ESDescriptor() {try{__CLR4_5_2ddhddhlvlulm8x.R.inc(17333);
        __CLR4_5_2ddhddhlvlulm8x.R.inc(17334);tag = 0x3;
    }finally{__CLR4_5_2ddhddhlvlulm8x.R.flushNeeded();}}

    @Override
    public void parseDetail(ByteBuffer bb) throws IOException {try{__CLR4_5_2ddhddhlvlulm8x.R.inc(17335);
        __CLR4_5_2ddhddhlvlulm8x.R.inc(17336);esId = IsoTypeReader.readUInt16(bb);

        __CLR4_5_2ddhddhlvlulm8x.R.inc(17337);int data = IsoTypeReader.readUInt8(bb);
        __CLR4_5_2ddhddhlvlulm8x.R.inc(17338);streamDependenceFlag = data >>> 7;
        __CLR4_5_2ddhddhlvlulm8x.R.inc(17339);URLFlag = (data >>> 6) & 0x1;
        __CLR4_5_2ddhddhlvlulm8x.R.inc(17340);oCRstreamFlag = (data >>> 5) & 0x1;
        __CLR4_5_2ddhddhlvlulm8x.R.inc(17341);streamPriority = data & 0x1f;

        __CLR4_5_2ddhddhlvlulm8x.R.inc(17342);if ((((streamDependenceFlag == 1)&&(__CLR4_5_2ddhddhlvlulm8x.R.iget(17343)!=0|true))||(__CLR4_5_2ddhddhlvlulm8x.R.iget(17344)==0&false))) {{
            __CLR4_5_2ddhddhlvlulm8x.R.inc(17345);dependsOnEsId = IsoTypeReader.readUInt16(bb);
        }
        }__CLR4_5_2ddhddhlvlulm8x.R.inc(17346);if ((((URLFlag == 1)&&(__CLR4_5_2ddhddhlvlulm8x.R.iget(17347)!=0|true))||(__CLR4_5_2ddhddhlvlulm8x.R.iget(17348)==0&false))) {{
            __CLR4_5_2ddhddhlvlulm8x.R.inc(17349);URLLength = IsoTypeReader.readUInt8(bb);
            __CLR4_5_2ddhddhlvlulm8x.R.inc(17350);URLString = IsoTypeReader.readString(bb, URLLength);
        }
        }__CLR4_5_2ddhddhlvlulm8x.R.inc(17351);if ((((oCRstreamFlag == 1)&&(__CLR4_5_2ddhddhlvlulm8x.R.iget(17352)!=0|true))||(__CLR4_5_2ddhddhlvlulm8x.R.iget(17353)==0&false))) {{
            __CLR4_5_2ddhddhlvlulm8x.R.inc(17354);oCREsId = IsoTypeReader.readUInt16(bb);
        }

        }__CLR4_5_2ddhddhlvlulm8x.R.inc(17355);while ((((bb.remaining() > 1)&&(__CLR4_5_2ddhddhlvlulm8x.R.iget(17356)!=0|true))||(__CLR4_5_2ddhddhlvlulm8x.R.iget(17357)==0&false))) {{
            __CLR4_5_2ddhddhlvlulm8x.R.inc(17358);BaseDescriptor descriptor = ObjectDescriptorFactory.createFrom(-1, bb);
            __CLR4_5_2ddhddhlvlulm8x.R.inc(17359);if ((((descriptor instanceof DecoderConfigDescriptor)&&(__CLR4_5_2ddhddhlvlulm8x.R.iget(17360)!=0|true))||(__CLR4_5_2ddhddhlvlulm8x.R.iget(17361)==0&false))) {{
                __CLR4_5_2ddhddhlvlulm8x.R.inc(17362);decoderConfigDescriptor = (DecoderConfigDescriptor) descriptor;
            } }else {__CLR4_5_2ddhddhlvlulm8x.R.inc(17363);if ((((descriptor instanceof SLConfigDescriptor)&&(__CLR4_5_2ddhddhlvlulm8x.R.iget(17364)!=0|true))||(__CLR4_5_2ddhddhlvlulm8x.R.iget(17365)==0&false))) {{
                __CLR4_5_2ddhddhlvlulm8x.R.inc(17366);slConfigDescriptor = (SLConfigDescriptor) descriptor;
            } }else {{
                __CLR4_5_2ddhddhlvlulm8x.R.inc(17367);otherDescriptors.add(descriptor);
            }
        }}}


    }}finally{__CLR4_5_2ddhddhlvlulm8x.R.flushNeeded();}}

    int getContentSize() {try{__CLR4_5_2ddhddhlvlulm8x.R.inc(17368);
        __CLR4_5_2ddhddhlvlulm8x.R.inc(17369);int out = 3;
        __CLR4_5_2ddhddhlvlulm8x.R.inc(17370);if ((((streamDependenceFlag > 0)&&(__CLR4_5_2ddhddhlvlulm8x.R.iget(17371)!=0|true))||(__CLR4_5_2ddhddhlvlulm8x.R.iget(17372)==0&false))) {{
            __CLR4_5_2ddhddhlvlulm8x.R.inc(17373);out += 2;
        }
        }__CLR4_5_2ddhddhlvlulm8x.R.inc(17374);if ((((URLFlag > 0)&&(__CLR4_5_2ddhddhlvlulm8x.R.iget(17375)!=0|true))||(__CLR4_5_2ddhddhlvlulm8x.R.iget(17376)==0&false))) {{
            __CLR4_5_2ddhddhlvlulm8x.R.inc(17377);out += 1 + URLLength;
        }
        }__CLR4_5_2ddhddhlvlulm8x.R.inc(17378);if ((((oCRstreamFlag > 0)&&(__CLR4_5_2ddhddhlvlulm8x.R.iget(17379)!=0|true))||(__CLR4_5_2ddhddhlvlulm8x.R.iget(17380)==0&false))) {{
            __CLR4_5_2ddhddhlvlulm8x.R.inc(17381);out += 2;
        }

        }__CLR4_5_2ddhddhlvlulm8x.R.inc(17382);out += decoderConfigDescriptor.getSize();
        __CLR4_5_2ddhddhlvlulm8x.R.inc(17383);out += slConfigDescriptor.getSize();

        __CLR4_5_2ddhddhlvlulm8x.R.inc(17384);if ((((otherDescriptors.size() > 0)&&(__CLR4_5_2ddhddhlvlulm8x.R.iget(17385)!=0|true))||(__CLR4_5_2ddhddhlvlulm8x.R.iget(17386)==0&false))) {{
            __CLR4_5_2ddhddhlvlulm8x.R.inc(17387);throw new RuntimeException(" Doesn't handle other descriptors yet");
        }

        }__CLR4_5_2ddhddhlvlulm8x.R.inc(17388);return out;
    }finally{__CLR4_5_2ddhddhlvlulm8x.R.flushNeeded();}}

    public ByteBuffer serialize() {try{__CLR4_5_2ddhddhlvlulm8x.R.inc(17389);
        __CLR4_5_2ddhddhlvlulm8x.R.inc(17390);byte[] aaa = new byte[getSize()];
        __CLR4_5_2ddhddhlvlulm8x.R.inc(17391);ByteBuffer out = ByteBuffer.wrap(aaa); // Usually is around 30 bytes, so 200 should be enough...
        __CLR4_5_2ddhddhlvlulm8x.R.inc(17392);IsoTypeWriter.writeUInt8(out, 3);
        __CLR4_5_2ddhddhlvlulm8x.R.inc(17393);writeSize(out, getContentSize());
        __CLR4_5_2ddhddhlvlulm8x.R.inc(17394);IsoTypeWriter.writeUInt16(out, esId);
        __CLR4_5_2ddhddhlvlulm8x.R.inc(17395);int flags = (streamDependenceFlag << 7) | (URLFlag << 6) | (oCRstreamFlag << 5) | (streamPriority & 0x1f);
        __CLR4_5_2ddhddhlvlulm8x.R.inc(17396);IsoTypeWriter.writeUInt8(out, flags);
        __CLR4_5_2ddhddhlvlulm8x.R.inc(17397);if ((((streamDependenceFlag > 0)&&(__CLR4_5_2ddhddhlvlulm8x.R.iget(17398)!=0|true))||(__CLR4_5_2ddhddhlvlulm8x.R.iget(17399)==0&false))) {{
            __CLR4_5_2ddhddhlvlulm8x.R.inc(17400);IsoTypeWriter.writeUInt16(out, dependsOnEsId);
        }
        }__CLR4_5_2ddhddhlvlulm8x.R.inc(17401);if ((((URLFlag > 0)&&(__CLR4_5_2ddhddhlvlulm8x.R.iget(17402)!=0|true))||(__CLR4_5_2ddhddhlvlulm8x.R.iget(17403)==0&false))) {{
            __CLR4_5_2ddhddhlvlulm8x.R.inc(17404);IsoTypeWriter.writeUInt8(out, URLLength);
            __CLR4_5_2ddhddhlvlulm8x.R.inc(17405);IsoTypeWriter.writeUtf8String(out, URLString);
        }
        }__CLR4_5_2ddhddhlvlulm8x.R.inc(17406);if ((((oCRstreamFlag > 0)&&(__CLR4_5_2ddhddhlvlulm8x.R.iget(17407)!=0|true))||(__CLR4_5_2ddhddhlvlulm8x.R.iget(17408)==0&false))) {{
            __CLR4_5_2ddhddhlvlulm8x.R.inc(17409);IsoTypeWriter.writeUInt16(out, oCREsId);
        }

        }__CLR4_5_2ddhddhlvlulm8x.R.inc(17410);ByteBuffer dec = decoderConfigDescriptor.serialize();
        __CLR4_5_2ddhddhlvlulm8x.R.inc(17411);ByteBuffer sl = slConfigDescriptor.serialize();
        __CLR4_5_2ddhddhlvlulm8x.R.inc(17412);out.put(dec.array());
        __CLR4_5_2ddhddhlvlulm8x.R.inc(17413);out.put(sl.array());

        // Doesn't handle other descriptors yet

        __CLR4_5_2ddhddhlvlulm8x.R.inc(17414);return out;
    }finally{__CLR4_5_2ddhddhlvlulm8x.R.flushNeeded();}}


    public DecoderConfigDescriptor getDecoderConfigDescriptor() {try{__CLR4_5_2ddhddhlvlulm8x.R.inc(17415);
        __CLR4_5_2ddhddhlvlulm8x.R.inc(17416);return decoderConfigDescriptor;
    }finally{__CLR4_5_2ddhddhlvlulm8x.R.flushNeeded();}}

    public void setDecoderConfigDescriptor(DecoderConfigDescriptor decoderConfigDescriptor) {try{__CLR4_5_2ddhddhlvlulm8x.R.inc(17417);
        __CLR4_5_2ddhddhlvlulm8x.R.inc(17418);this.decoderConfigDescriptor = decoderConfigDescriptor;
    }finally{__CLR4_5_2ddhddhlvlulm8x.R.flushNeeded();}}

    public SLConfigDescriptor getSlConfigDescriptor() {try{__CLR4_5_2ddhddhlvlulm8x.R.inc(17419);
        __CLR4_5_2ddhddhlvlulm8x.R.inc(17420);return slConfigDescriptor;
    }finally{__CLR4_5_2ddhddhlvlulm8x.R.flushNeeded();}}

    public void setSlConfigDescriptor(SLConfigDescriptor slConfigDescriptor) {try{__CLR4_5_2ddhddhlvlulm8x.R.inc(17421);
        __CLR4_5_2ddhddhlvlulm8x.R.inc(17422);this.slConfigDescriptor = slConfigDescriptor;
    }finally{__CLR4_5_2ddhddhlvlulm8x.R.flushNeeded();}}

    public List<BaseDescriptor> getOtherDescriptors() {try{__CLR4_5_2ddhddhlvlulm8x.R.inc(17423);
        __CLR4_5_2ddhddhlvlulm8x.R.inc(17424);return otherDescriptors;
    }finally{__CLR4_5_2ddhddhlvlulm8x.R.flushNeeded();}}

    public int getoCREsId() {try{__CLR4_5_2ddhddhlvlulm8x.R.inc(17425);
        __CLR4_5_2ddhddhlvlulm8x.R.inc(17426);return oCREsId;
    }finally{__CLR4_5_2ddhddhlvlulm8x.R.flushNeeded();}}

    public void setoCREsId(int oCREsId) {try{__CLR4_5_2ddhddhlvlulm8x.R.inc(17427);
        __CLR4_5_2ddhddhlvlulm8x.R.inc(17428);this.oCREsId = oCREsId;
    }finally{__CLR4_5_2ddhddhlvlulm8x.R.flushNeeded();}}

    public int getEsId() {try{__CLR4_5_2ddhddhlvlulm8x.R.inc(17429);
        __CLR4_5_2ddhddhlvlulm8x.R.inc(17430);return esId;
    }finally{__CLR4_5_2ddhddhlvlulm8x.R.flushNeeded();}}

    public void setEsId(int esId) {try{__CLR4_5_2ddhddhlvlulm8x.R.inc(17431);
        __CLR4_5_2ddhddhlvlulm8x.R.inc(17432);this.esId = esId;
    }finally{__CLR4_5_2ddhddhlvlulm8x.R.flushNeeded();}}

    public int getStreamDependenceFlag() {try{__CLR4_5_2ddhddhlvlulm8x.R.inc(17433);
        __CLR4_5_2ddhddhlvlulm8x.R.inc(17434);return streamDependenceFlag;
    }finally{__CLR4_5_2ddhddhlvlulm8x.R.flushNeeded();}}

    public void setStreamDependenceFlag(int streamDependenceFlag) {try{__CLR4_5_2ddhddhlvlulm8x.R.inc(17435);
        __CLR4_5_2ddhddhlvlulm8x.R.inc(17436);this.streamDependenceFlag = streamDependenceFlag;
    }finally{__CLR4_5_2ddhddhlvlulm8x.R.flushNeeded();}}

    public int getURLFlag() {try{__CLR4_5_2ddhddhlvlulm8x.R.inc(17437);
        __CLR4_5_2ddhddhlvlulm8x.R.inc(17438);return URLFlag;
    }finally{__CLR4_5_2ddhddhlvlulm8x.R.flushNeeded();}}

    public void setURLFlag(int URLFlag) {try{__CLR4_5_2ddhddhlvlulm8x.R.inc(17439);
        __CLR4_5_2ddhddhlvlulm8x.R.inc(17440);this.URLFlag = URLFlag;
    }finally{__CLR4_5_2ddhddhlvlulm8x.R.flushNeeded();}}

    public int getoCRstreamFlag() {try{__CLR4_5_2ddhddhlvlulm8x.R.inc(17441);
        __CLR4_5_2ddhddhlvlulm8x.R.inc(17442);return oCRstreamFlag;
    }finally{__CLR4_5_2ddhddhlvlulm8x.R.flushNeeded();}}

    public void setoCRstreamFlag(int oCRstreamFlag) {try{__CLR4_5_2ddhddhlvlulm8x.R.inc(17443);
        __CLR4_5_2ddhddhlvlulm8x.R.inc(17444);this.oCRstreamFlag = oCRstreamFlag;
    }finally{__CLR4_5_2ddhddhlvlulm8x.R.flushNeeded();}}

    public int getStreamPriority() {try{__CLR4_5_2ddhddhlvlulm8x.R.inc(17445);
        __CLR4_5_2ddhddhlvlulm8x.R.inc(17446);return streamPriority;
    }finally{__CLR4_5_2ddhddhlvlulm8x.R.flushNeeded();}}

    public void setStreamPriority(int streamPriority) {try{__CLR4_5_2ddhddhlvlulm8x.R.inc(17447);
        __CLR4_5_2ddhddhlvlulm8x.R.inc(17448);this.streamPriority = streamPriority;
    }finally{__CLR4_5_2ddhddhlvlulm8x.R.flushNeeded();}}

    public int getURLLength() {try{__CLR4_5_2ddhddhlvlulm8x.R.inc(17449);
        __CLR4_5_2ddhddhlvlulm8x.R.inc(17450);return URLLength;
    }finally{__CLR4_5_2ddhddhlvlulm8x.R.flushNeeded();}}

    public void setURLLength(int URLLength) {try{__CLR4_5_2ddhddhlvlulm8x.R.inc(17451);
        __CLR4_5_2ddhddhlvlulm8x.R.inc(17452);this.URLLength = URLLength;
    }finally{__CLR4_5_2ddhddhlvlulm8x.R.flushNeeded();}}

    public String getURLString() {try{__CLR4_5_2ddhddhlvlulm8x.R.inc(17453);
        __CLR4_5_2ddhddhlvlulm8x.R.inc(17454);return URLString;
    }finally{__CLR4_5_2ddhddhlvlulm8x.R.flushNeeded();}}

    public void setURLString(String URLString) {try{__CLR4_5_2ddhddhlvlulm8x.R.inc(17455);
        __CLR4_5_2ddhddhlvlulm8x.R.inc(17456);this.URLString = URLString;
    }finally{__CLR4_5_2ddhddhlvlulm8x.R.flushNeeded();}}

    public int getRemoteODFlag() {try{__CLR4_5_2ddhddhlvlulm8x.R.inc(17457);
        __CLR4_5_2ddhddhlvlulm8x.R.inc(17458);return remoteODFlag;
    }finally{__CLR4_5_2ddhddhlvlulm8x.R.flushNeeded();}}

    public void setRemoteODFlag(int remoteODFlag) {try{__CLR4_5_2ddhddhlvlulm8x.R.inc(17459);
        __CLR4_5_2ddhddhlvlulm8x.R.inc(17460);this.remoteODFlag = remoteODFlag;
    }finally{__CLR4_5_2ddhddhlvlulm8x.R.flushNeeded();}}

    public int getDependsOnEsId() {try{__CLR4_5_2ddhddhlvlulm8x.R.inc(17461);
        __CLR4_5_2ddhddhlvlulm8x.R.inc(17462);return dependsOnEsId;
    }finally{__CLR4_5_2ddhddhlvlulm8x.R.flushNeeded();}}

    public void setDependsOnEsId(int dependsOnEsId) {try{__CLR4_5_2ddhddhlvlulm8x.R.inc(17463);
        __CLR4_5_2ddhddhlvlulm8x.R.inc(17464);this.dependsOnEsId = dependsOnEsId;
    }finally{__CLR4_5_2ddhddhlvlulm8x.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_5_2ddhddhlvlulm8x.R.inc(17465);
        __CLR4_5_2ddhddhlvlulm8x.R.inc(17466);final StringBuilder sb = new StringBuilder();
        __CLR4_5_2ddhddhlvlulm8x.R.inc(17467);sb.append("ESDescriptor");
        __CLR4_5_2ddhddhlvlulm8x.R.inc(17468);sb.append("{esId=").append(esId);
        __CLR4_5_2ddhddhlvlulm8x.R.inc(17469);sb.append(", streamDependenceFlag=").append(streamDependenceFlag);
        __CLR4_5_2ddhddhlvlulm8x.R.inc(17470);sb.append(", URLFlag=").append(URLFlag);
        __CLR4_5_2ddhddhlvlulm8x.R.inc(17471);sb.append(", oCRstreamFlag=").append(oCRstreamFlag);
        __CLR4_5_2ddhddhlvlulm8x.R.inc(17472);sb.append(", streamPriority=").append(streamPriority);
        __CLR4_5_2ddhddhlvlulm8x.R.inc(17473);sb.append(", URLLength=").append(URLLength);
        __CLR4_5_2ddhddhlvlulm8x.R.inc(17474);sb.append(", URLString='").append(URLString).append('\'');
        __CLR4_5_2ddhddhlvlulm8x.R.inc(17475);sb.append(", remoteODFlag=").append(remoteODFlag);
        __CLR4_5_2ddhddhlvlulm8x.R.inc(17476);sb.append(", dependsOnEsId=").append(dependsOnEsId);
        __CLR4_5_2ddhddhlvlulm8x.R.inc(17477);sb.append(", oCREsId=").append(oCREsId);
        __CLR4_5_2ddhddhlvlulm8x.R.inc(17478);sb.append(", decoderConfigDescriptor=").append(decoderConfigDescriptor);
        __CLR4_5_2ddhddhlvlulm8x.R.inc(17479);sb.append(", slConfigDescriptor=").append(slConfigDescriptor);
        __CLR4_5_2ddhddhlvlulm8x.R.inc(17480);sb.append('}');
        __CLR4_5_2ddhddhlvlulm8x.R.inc(17481);return sb.toString();
    }finally{__CLR4_5_2ddhddhlvlulm8x.R.flushNeeded();}}

    @Override
    public boolean equals(Object o) {try{__CLR4_5_2ddhddhlvlulm8x.R.inc(17482);
        __CLR4_5_2ddhddhlvlulm8x.R.inc(17483);if ((((this == o)&&(__CLR4_5_2ddhddhlvlulm8x.R.iget(17484)!=0|true))||(__CLR4_5_2ddhddhlvlulm8x.R.iget(17485)==0&false))) {__CLR4_5_2ddhddhlvlulm8x.R.inc(17486);return true;
        }__CLR4_5_2ddhddhlvlulm8x.R.inc(17487);if ((((o == null || getClass() != o.getClass())&&(__CLR4_5_2ddhddhlvlulm8x.R.iget(17488)!=0|true))||(__CLR4_5_2ddhddhlvlulm8x.R.iget(17489)==0&false))) {__CLR4_5_2ddhddhlvlulm8x.R.inc(17490);return false;

        }__CLR4_5_2ddhddhlvlulm8x.R.inc(17491);ESDescriptor that = (ESDescriptor) o;

        __CLR4_5_2ddhddhlvlulm8x.R.inc(17492);if ((((URLFlag != that.URLFlag)&&(__CLR4_5_2ddhddhlvlulm8x.R.iget(17493)!=0|true))||(__CLR4_5_2ddhddhlvlulm8x.R.iget(17494)==0&false))) {__CLR4_5_2ddhddhlvlulm8x.R.inc(17495);return false;
        }__CLR4_5_2ddhddhlvlulm8x.R.inc(17496);if ((((URLLength != that.URLLength)&&(__CLR4_5_2ddhddhlvlulm8x.R.iget(17497)!=0|true))||(__CLR4_5_2ddhddhlvlulm8x.R.iget(17498)==0&false))) {__CLR4_5_2ddhddhlvlulm8x.R.inc(17499);return false;
        }__CLR4_5_2ddhddhlvlulm8x.R.inc(17500);if ((((dependsOnEsId != that.dependsOnEsId)&&(__CLR4_5_2ddhddhlvlulm8x.R.iget(17501)!=0|true))||(__CLR4_5_2ddhddhlvlulm8x.R.iget(17502)==0&false))) {__CLR4_5_2ddhddhlvlulm8x.R.inc(17503);return false;
        }__CLR4_5_2ddhddhlvlulm8x.R.inc(17504);if ((((esId != that.esId)&&(__CLR4_5_2ddhddhlvlulm8x.R.iget(17505)!=0|true))||(__CLR4_5_2ddhddhlvlulm8x.R.iget(17506)==0&false))) {__CLR4_5_2ddhddhlvlulm8x.R.inc(17507);return false;
        }__CLR4_5_2ddhddhlvlulm8x.R.inc(17508);if ((((oCREsId != that.oCREsId)&&(__CLR4_5_2ddhddhlvlulm8x.R.iget(17509)!=0|true))||(__CLR4_5_2ddhddhlvlulm8x.R.iget(17510)==0&false))) {__CLR4_5_2ddhddhlvlulm8x.R.inc(17511);return false;
        }__CLR4_5_2ddhddhlvlulm8x.R.inc(17512);if ((((oCRstreamFlag != that.oCRstreamFlag)&&(__CLR4_5_2ddhddhlvlulm8x.R.iget(17513)!=0|true))||(__CLR4_5_2ddhddhlvlulm8x.R.iget(17514)==0&false))) {__CLR4_5_2ddhddhlvlulm8x.R.inc(17515);return false;
        }__CLR4_5_2ddhddhlvlulm8x.R.inc(17516);if ((((remoteODFlag != that.remoteODFlag)&&(__CLR4_5_2ddhddhlvlulm8x.R.iget(17517)!=0|true))||(__CLR4_5_2ddhddhlvlulm8x.R.iget(17518)==0&false))) {__CLR4_5_2ddhddhlvlulm8x.R.inc(17519);return false;
        }__CLR4_5_2ddhddhlvlulm8x.R.inc(17520);if ((((streamDependenceFlag != that.streamDependenceFlag)&&(__CLR4_5_2ddhddhlvlulm8x.R.iget(17521)!=0|true))||(__CLR4_5_2ddhddhlvlulm8x.R.iget(17522)==0&false))) {__CLR4_5_2ddhddhlvlulm8x.R.inc(17523);return false;
        }__CLR4_5_2ddhddhlvlulm8x.R.inc(17524);if ((((streamPriority != that.streamPriority)&&(__CLR4_5_2ddhddhlvlulm8x.R.iget(17525)!=0|true))||(__CLR4_5_2ddhddhlvlulm8x.R.iget(17526)==0&false))) {__CLR4_5_2ddhddhlvlulm8x.R.inc(17527);return false;
        }__CLR4_5_2ddhddhlvlulm8x.R.inc(17528);if (((((((URLString != null )&&(__CLR4_5_2ddhddhlvlulm8x.R.iget(17529)!=0|true))||(__CLR4_5_2ddhddhlvlulm8x.R.iget(17530)==0&false))? !URLString.equals(that.URLString) : that.URLString != null)&&(__CLR4_5_2ddhddhlvlulm8x.R.iget(17531)!=0|true))||(__CLR4_5_2ddhddhlvlulm8x.R.iget(17532)==0&false))) {__CLR4_5_2ddhddhlvlulm8x.R.inc(17533);return false;
        }__CLR4_5_2ddhddhlvlulm8x.R.inc(17534);if (((((((decoderConfigDescriptor != null )&&(__CLR4_5_2ddhddhlvlulm8x.R.iget(17535)!=0|true))||(__CLR4_5_2ddhddhlvlulm8x.R.iget(17536)==0&false))? !decoderConfigDescriptor.equals(that.decoderConfigDescriptor) : that.decoderConfigDescriptor != null)&&(__CLR4_5_2ddhddhlvlulm8x.R.iget(17537)!=0|true))||(__CLR4_5_2ddhddhlvlulm8x.R.iget(17538)==0&false)))
            {__CLR4_5_2ddhddhlvlulm8x.R.inc(17539);return false;
        }__CLR4_5_2ddhddhlvlulm8x.R.inc(17540);if (((((((otherDescriptors != null )&&(__CLR4_5_2ddhddhlvlulm8x.R.iget(17541)!=0|true))||(__CLR4_5_2ddhddhlvlulm8x.R.iget(17542)==0&false))? !otherDescriptors.equals(that.otherDescriptors) : that.otherDescriptors != null)&&(__CLR4_5_2ddhddhlvlulm8x.R.iget(17543)!=0|true))||(__CLR4_5_2ddhddhlvlulm8x.R.iget(17544)==0&false)))
            {__CLR4_5_2ddhddhlvlulm8x.R.inc(17545);return false;
        }__CLR4_5_2ddhddhlvlulm8x.R.inc(17546);if (((((((slConfigDescriptor != null )&&(__CLR4_5_2ddhddhlvlulm8x.R.iget(17547)!=0|true))||(__CLR4_5_2ddhddhlvlulm8x.R.iget(17548)==0&false))? !slConfigDescriptor.equals(that.slConfigDescriptor) : that.slConfigDescriptor != null)&&(__CLR4_5_2ddhddhlvlulm8x.R.iget(17549)!=0|true))||(__CLR4_5_2ddhddhlvlulm8x.R.iget(17550)==0&false)))
            {__CLR4_5_2ddhddhlvlulm8x.R.inc(17551);return false;

        }__CLR4_5_2ddhddhlvlulm8x.R.inc(17552);return true;
    }finally{__CLR4_5_2ddhddhlvlulm8x.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_5_2ddhddhlvlulm8x.R.inc(17553);
        __CLR4_5_2ddhddhlvlulm8x.R.inc(17554);int result = esId;
        __CLR4_5_2ddhddhlvlulm8x.R.inc(17555);result = 31 * result + streamDependenceFlag;
        __CLR4_5_2ddhddhlvlulm8x.R.inc(17556);result = 31 * result + URLFlag;
        __CLR4_5_2ddhddhlvlulm8x.R.inc(17557);result = 31 * result + oCRstreamFlag;
        __CLR4_5_2ddhddhlvlulm8x.R.inc(17558);result = 31 * result + streamPriority;
        __CLR4_5_2ddhddhlvlulm8x.R.inc(17559);result = 31 * result + URLLength;
        __CLR4_5_2ddhddhlvlulm8x.R.inc(17560);result = 31 * result + ((((URLString != null )&&(__CLR4_5_2ddhddhlvlulm8x.R.iget(17561)!=0|true))||(__CLR4_5_2ddhddhlvlulm8x.R.iget(17562)==0&false))? URLString.hashCode() : 0);
        __CLR4_5_2ddhddhlvlulm8x.R.inc(17563);result = 31 * result + remoteODFlag;
        __CLR4_5_2ddhddhlvlulm8x.R.inc(17564);result = 31 * result + dependsOnEsId;
        __CLR4_5_2ddhddhlvlulm8x.R.inc(17565);result = 31 * result + oCREsId;
        __CLR4_5_2ddhddhlvlulm8x.R.inc(17566);result = 31 * result + ((((decoderConfigDescriptor != null )&&(__CLR4_5_2ddhddhlvlulm8x.R.iget(17567)!=0|true))||(__CLR4_5_2ddhddhlvlulm8x.R.iget(17568)==0&false))? decoderConfigDescriptor.hashCode() : 0);
        __CLR4_5_2ddhddhlvlulm8x.R.inc(17569);result = 31 * result + ((((slConfigDescriptor != null )&&(__CLR4_5_2ddhddhlvlulm8x.R.iget(17570)!=0|true))||(__CLR4_5_2ddhddhlvlulm8x.R.iget(17571)==0&false))? slConfigDescriptor.hashCode() : 0);
        __CLR4_5_2ddhddhlvlulm8x.R.inc(17572);result = 31 * result + ((((otherDescriptors != null )&&(__CLR4_5_2ddhddhlvlulm8x.R.iget(17573)!=0|true))||(__CLR4_5_2ddhddhlvlulm8x.R.iget(17574)==0&false))? otherDescriptors.hashCode() : 0);
        __CLR4_5_2ddhddhlvlulm8x.R.inc(17575);return result;
    }finally{__CLR4_5_2ddhddhlvlulm8x.R.flushNeeded();}}
}
