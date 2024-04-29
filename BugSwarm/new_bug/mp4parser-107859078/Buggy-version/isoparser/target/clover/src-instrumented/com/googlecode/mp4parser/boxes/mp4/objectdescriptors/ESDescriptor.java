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
public class ESDescriptor extends BaseDescriptor {public static class __CLR4_5_2daudaulvl9ekft{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,17481,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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
    public ESDescriptor() {try{__CLR4_5_2daudaulvl9ekft.R.inc(17238);
        __CLR4_5_2daudaulvl9ekft.R.inc(17239);tag = 0x3;
    }finally{__CLR4_5_2daudaulvl9ekft.R.flushNeeded();}}

    @Override
    public void parseDetail(ByteBuffer bb) throws IOException {try{__CLR4_5_2daudaulvl9ekft.R.inc(17240);
        __CLR4_5_2daudaulvl9ekft.R.inc(17241);esId = IsoTypeReader.readUInt16(bb);

        __CLR4_5_2daudaulvl9ekft.R.inc(17242);int data = IsoTypeReader.readUInt8(bb);
        __CLR4_5_2daudaulvl9ekft.R.inc(17243);streamDependenceFlag = data >>> 7;
        __CLR4_5_2daudaulvl9ekft.R.inc(17244);URLFlag = (data >>> 6) & 0x1;
        __CLR4_5_2daudaulvl9ekft.R.inc(17245);oCRstreamFlag = (data >>> 5) & 0x1;
        __CLR4_5_2daudaulvl9ekft.R.inc(17246);streamPriority = data & 0x1f;

        __CLR4_5_2daudaulvl9ekft.R.inc(17247);if ((((streamDependenceFlag == 1)&&(__CLR4_5_2daudaulvl9ekft.R.iget(17248)!=0|true))||(__CLR4_5_2daudaulvl9ekft.R.iget(17249)==0&false))) {{
            __CLR4_5_2daudaulvl9ekft.R.inc(17250);dependsOnEsId = IsoTypeReader.readUInt16(bb);
        }
        }__CLR4_5_2daudaulvl9ekft.R.inc(17251);if ((((URLFlag == 1)&&(__CLR4_5_2daudaulvl9ekft.R.iget(17252)!=0|true))||(__CLR4_5_2daudaulvl9ekft.R.iget(17253)==0&false))) {{
            __CLR4_5_2daudaulvl9ekft.R.inc(17254);URLLength = IsoTypeReader.readUInt8(bb);
            __CLR4_5_2daudaulvl9ekft.R.inc(17255);URLString = IsoTypeReader.readString(bb, URLLength);
        }
        }__CLR4_5_2daudaulvl9ekft.R.inc(17256);if ((((oCRstreamFlag == 1)&&(__CLR4_5_2daudaulvl9ekft.R.iget(17257)!=0|true))||(__CLR4_5_2daudaulvl9ekft.R.iget(17258)==0&false))) {{
            __CLR4_5_2daudaulvl9ekft.R.inc(17259);oCREsId = IsoTypeReader.readUInt16(bb);
        }

        }__CLR4_5_2daudaulvl9ekft.R.inc(17260);while ((((bb.remaining() > 1)&&(__CLR4_5_2daudaulvl9ekft.R.iget(17261)!=0|true))||(__CLR4_5_2daudaulvl9ekft.R.iget(17262)==0&false))) {{
            __CLR4_5_2daudaulvl9ekft.R.inc(17263);BaseDescriptor descriptor = ObjectDescriptorFactory.createFrom(-1, bb);
            __CLR4_5_2daudaulvl9ekft.R.inc(17264);if ((((descriptor instanceof DecoderConfigDescriptor)&&(__CLR4_5_2daudaulvl9ekft.R.iget(17265)!=0|true))||(__CLR4_5_2daudaulvl9ekft.R.iget(17266)==0&false))) {{
                __CLR4_5_2daudaulvl9ekft.R.inc(17267);decoderConfigDescriptor = (DecoderConfigDescriptor) descriptor;
            } }else {__CLR4_5_2daudaulvl9ekft.R.inc(17268);if ((((descriptor instanceof SLConfigDescriptor)&&(__CLR4_5_2daudaulvl9ekft.R.iget(17269)!=0|true))||(__CLR4_5_2daudaulvl9ekft.R.iget(17270)==0&false))) {{
                __CLR4_5_2daudaulvl9ekft.R.inc(17271);slConfigDescriptor = (SLConfigDescriptor) descriptor;
            } }else {{
                __CLR4_5_2daudaulvl9ekft.R.inc(17272);otherDescriptors.add(descriptor);
            }
        }}}


    }}finally{__CLR4_5_2daudaulvl9ekft.R.flushNeeded();}}

    int getContentSize() {try{__CLR4_5_2daudaulvl9ekft.R.inc(17273);
        __CLR4_5_2daudaulvl9ekft.R.inc(17274);int out = 3;
        __CLR4_5_2daudaulvl9ekft.R.inc(17275);if ((((streamDependenceFlag > 0)&&(__CLR4_5_2daudaulvl9ekft.R.iget(17276)!=0|true))||(__CLR4_5_2daudaulvl9ekft.R.iget(17277)==0&false))) {{
            __CLR4_5_2daudaulvl9ekft.R.inc(17278);out += 2;
        }
        }__CLR4_5_2daudaulvl9ekft.R.inc(17279);if ((((URLFlag > 0)&&(__CLR4_5_2daudaulvl9ekft.R.iget(17280)!=0|true))||(__CLR4_5_2daudaulvl9ekft.R.iget(17281)==0&false))) {{
            __CLR4_5_2daudaulvl9ekft.R.inc(17282);out += 1 + URLLength;
        }
        }__CLR4_5_2daudaulvl9ekft.R.inc(17283);if ((((oCRstreamFlag > 0)&&(__CLR4_5_2daudaulvl9ekft.R.iget(17284)!=0|true))||(__CLR4_5_2daudaulvl9ekft.R.iget(17285)==0&false))) {{
            __CLR4_5_2daudaulvl9ekft.R.inc(17286);out += 2;
        }

        }__CLR4_5_2daudaulvl9ekft.R.inc(17287);out += decoderConfigDescriptor.getSize();
        __CLR4_5_2daudaulvl9ekft.R.inc(17288);out += slConfigDescriptor.getSize();

        __CLR4_5_2daudaulvl9ekft.R.inc(17289);if ((((otherDescriptors.size() > 0)&&(__CLR4_5_2daudaulvl9ekft.R.iget(17290)!=0|true))||(__CLR4_5_2daudaulvl9ekft.R.iget(17291)==0&false))) {{
            __CLR4_5_2daudaulvl9ekft.R.inc(17292);throw new RuntimeException(" Doesn't handle other descriptors yet");
        }

        }__CLR4_5_2daudaulvl9ekft.R.inc(17293);return out;
    }finally{__CLR4_5_2daudaulvl9ekft.R.flushNeeded();}}

    public ByteBuffer serialize() {try{__CLR4_5_2daudaulvl9ekft.R.inc(17294);
        __CLR4_5_2daudaulvl9ekft.R.inc(17295);byte[] aaa = new byte[getSize()];
        __CLR4_5_2daudaulvl9ekft.R.inc(17296);ByteBuffer out = ByteBuffer.wrap(aaa); // Usually is around 30 bytes, so 200 should be enough...
        __CLR4_5_2daudaulvl9ekft.R.inc(17297);IsoTypeWriter.writeUInt8(out, 3);
        __CLR4_5_2daudaulvl9ekft.R.inc(17298);writeSize(out, getContentSize());
        __CLR4_5_2daudaulvl9ekft.R.inc(17299);IsoTypeWriter.writeUInt16(out, esId);
        __CLR4_5_2daudaulvl9ekft.R.inc(17300);int flags = (streamDependenceFlag << 7) | (URLFlag << 6) | (oCRstreamFlag << 5) | (streamPriority & 0x1f);
        __CLR4_5_2daudaulvl9ekft.R.inc(17301);IsoTypeWriter.writeUInt8(out, flags);
        __CLR4_5_2daudaulvl9ekft.R.inc(17302);if ((((streamDependenceFlag > 0)&&(__CLR4_5_2daudaulvl9ekft.R.iget(17303)!=0|true))||(__CLR4_5_2daudaulvl9ekft.R.iget(17304)==0&false))) {{
            __CLR4_5_2daudaulvl9ekft.R.inc(17305);IsoTypeWriter.writeUInt16(out, dependsOnEsId);
        }
        }__CLR4_5_2daudaulvl9ekft.R.inc(17306);if ((((URLFlag > 0)&&(__CLR4_5_2daudaulvl9ekft.R.iget(17307)!=0|true))||(__CLR4_5_2daudaulvl9ekft.R.iget(17308)==0&false))) {{
            __CLR4_5_2daudaulvl9ekft.R.inc(17309);IsoTypeWriter.writeUInt8(out, URLLength);
            __CLR4_5_2daudaulvl9ekft.R.inc(17310);IsoTypeWriter.writeUtf8String(out, URLString);
        }
        }__CLR4_5_2daudaulvl9ekft.R.inc(17311);if ((((oCRstreamFlag > 0)&&(__CLR4_5_2daudaulvl9ekft.R.iget(17312)!=0|true))||(__CLR4_5_2daudaulvl9ekft.R.iget(17313)==0&false))) {{
            __CLR4_5_2daudaulvl9ekft.R.inc(17314);IsoTypeWriter.writeUInt16(out, oCREsId);
        }

        }__CLR4_5_2daudaulvl9ekft.R.inc(17315);ByteBuffer dec = decoderConfigDescriptor.serialize();
        __CLR4_5_2daudaulvl9ekft.R.inc(17316);ByteBuffer sl = slConfigDescriptor.serialize();
        __CLR4_5_2daudaulvl9ekft.R.inc(17317);out.put(dec.array());
        __CLR4_5_2daudaulvl9ekft.R.inc(17318);out.put(sl.array());

        // Doesn't handle other descriptors yet

        __CLR4_5_2daudaulvl9ekft.R.inc(17319);return out;
    }finally{__CLR4_5_2daudaulvl9ekft.R.flushNeeded();}}


    public DecoderConfigDescriptor getDecoderConfigDescriptor() {try{__CLR4_5_2daudaulvl9ekft.R.inc(17320);
        __CLR4_5_2daudaulvl9ekft.R.inc(17321);return decoderConfigDescriptor;
    }finally{__CLR4_5_2daudaulvl9ekft.R.flushNeeded();}}

    public void setDecoderConfigDescriptor(DecoderConfigDescriptor decoderConfigDescriptor) {try{__CLR4_5_2daudaulvl9ekft.R.inc(17322);
        __CLR4_5_2daudaulvl9ekft.R.inc(17323);this.decoderConfigDescriptor = decoderConfigDescriptor;
    }finally{__CLR4_5_2daudaulvl9ekft.R.flushNeeded();}}

    public SLConfigDescriptor getSlConfigDescriptor() {try{__CLR4_5_2daudaulvl9ekft.R.inc(17324);
        __CLR4_5_2daudaulvl9ekft.R.inc(17325);return slConfigDescriptor;
    }finally{__CLR4_5_2daudaulvl9ekft.R.flushNeeded();}}

    public void setSlConfigDescriptor(SLConfigDescriptor slConfigDescriptor) {try{__CLR4_5_2daudaulvl9ekft.R.inc(17326);
        __CLR4_5_2daudaulvl9ekft.R.inc(17327);this.slConfigDescriptor = slConfigDescriptor;
    }finally{__CLR4_5_2daudaulvl9ekft.R.flushNeeded();}}

    public List<BaseDescriptor> getOtherDescriptors() {try{__CLR4_5_2daudaulvl9ekft.R.inc(17328);
        __CLR4_5_2daudaulvl9ekft.R.inc(17329);return otherDescriptors;
    }finally{__CLR4_5_2daudaulvl9ekft.R.flushNeeded();}}

    public int getoCREsId() {try{__CLR4_5_2daudaulvl9ekft.R.inc(17330);
        __CLR4_5_2daudaulvl9ekft.R.inc(17331);return oCREsId;
    }finally{__CLR4_5_2daudaulvl9ekft.R.flushNeeded();}}

    public void setoCREsId(int oCREsId) {try{__CLR4_5_2daudaulvl9ekft.R.inc(17332);
        __CLR4_5_2daudaulvl9ekft.R.inc(17333);this.oCREsId = oCREsId;
    }finally{__CLR4_5_2daudaulvl9ekft.R.flushNeeded();}}

    public int getEsId() {try{__CLR4_5_2daudaulvl9ekft.R.inc(17334);
        __CLR4_5_2daudaulvl9ekft.R.inc(17335);return esId;
    }finally{__CLR4_5_2daudaulvl9ekft.R.flushNeeded();}}

    public void setEsId(int esId) {try{__CLR4_5_2daudaulvl9ekft.R.inc(17336);
        __CLR4_5_2daudaulvl9ekft.R.inc(17337);this.esId = esId;
    }finally{__CLR4_5_2daudaulvl9ekft.R.flushNeeded();}}

    public int getStreamDependenceFlag() {try{__CLR4_5_2daudaulvl9ekft.R.inc(17338);
        __CLR4_5_2daudaulvl9ekft.R.inc(17339);return streamDependenceFlag;
    }finally{__CLR4_5_2daudaulvl9ekft.R.flushNeeded();}}

    public void setStreamDependenceFlag(int streamDependenceFlag) {try{__CLR4_5_2daudaulvl9ekft.R.inc(17340);
        __CLR4_5_2daudaulvl9ekft.R.inc(17341);this.streamDependenceFlag = streamDependenceFlag;
    }finally{__CLR4_5_2daudaulvl9ekft.R.flushNeeded();}}

    public int getURLFlag() {try{__CLR4_5_2daudaulvl9ekft.R.inc(17342);
        __CLR4_5_2daudaulvl9ekft.R.inc(17343);return URLFlag;
    }finally{__CLR4_5_2daudaulvl9ekft.R.flushNeeded();}}

    public void setURLFlag(int URLFlag) {try{__CLR4_5_2daudaulvl9ekft.R.inc(17344);
        __CLR4_5_2daudaulvl9ekft.R.inc(17345);this.URLFlag = URLFlag;
    }finally{__CLR4_5_2daudaulvl9ekft.R.flushNeeded();}}

    public int getoCRstreamFlag() {try{__CLR4_5_2daudaulvl9ekft.R.inc(17346);
        __CLR4_5_2daudaulvl9ekft.R.inc(17347);return oCRstreamFlag;
    }finally{__CLR4_5_2daudaulvl9ekft.R.flushNeeded();}}

    public void setoCRstreamFlag(int oCRstreamFlag) {try{__CLR4_5_2daudaulvl9ekft.R.inc(17348);
        __CLR4_5_2daudaulvl9ekft.R.inc(17349);this.oCRstreamFlag = oCRstreamFlag;
    }finally{__CLR4_5_2daudaulvl9ekft.R.flushNeeded();}}

    public int getStreamPriority() {try{__CLR4_5_2daudaulvl9ekft.R.inc(17350);
        __CLR4_5_2daudaulvl9ekft.R.inc(17351);return streamPriority;
    }finally{__CLR4_5_2daudaulvl9ekft.R.flushNeeded();}}

    public void setStreamPriority(int streamPriority) {try{__CLR4_5_2daudaulvl9ekft.R.inc(17352);
        __CLR4_5_2daudaulvl9ekft.R.inc(17353);this.streamPriority = streamPriority;
    }finally{__CLR4_5_2daudaulvl9ekft.R.flushNeeded();}}

    public int getURLLength() {try{__CLR4_5_2daudaulvl9ekft.R.inc(17354);
        __CLR4_5_2daudaulvl9ekft.R.inc(17355);return URLLength;
    }finally{__CLR4_5_2daudaulvl9ekft.R.flushNeeded();}}

    public void setURLLength(int URLLength) {try{__CLR4_5_2daudaulvl9ekft.R.inc(17356);
        __CLR4_5_2daudaulvl9ekft.R.inc(17357);this.URLLength = URLLength;
    }finally{__CLR4_5_2daudaulvl9ekft.R.flushNeeded();}}

    public String getURLString() {try{__CLR4_5_2daudaulvl9ekft.R.inc(17358);
        __CLR4_5_2daudaulvl9ekft.R.inc(17359);return URLString;
    }finally{__CLR4_5_2daudaulvl9ekft.R.flushNeeded();}}

    public void setURLString(String URLString) {try{__CLR4_5_2daudaulvl9ekft.R.inc(17360);
        __CLR4_5_2daudaulvl9ekft.R.inc(17361);this.URLString = URLString;
    }finally{__CLR4_5_2daudaulvl9ekft.R.flushNeeded();}}

    public int getRemoteODFlag() {try{__CLR4_5_2daudaulvl9ekft.R.inc(17362);
        __CLR4_5_2daudaulvl9ekft.R.inc(17363);return remoteODFlag;
    }finally{__CLR4_5_2daudaulvl9ekft.R.flushNeeded();}}

    public void setRemoteODFlag(int remoteODFlag) {try{__CLR4_5_2daudaulvl9ekft.R.inc(17364);
        __CLR4_5_2daudaulvl9ekft.R.inc(17365);this.remoteODFlag = remoteODFlag;
    }finally{__CLR4_5_2daudaulvl9ekft.R.flushNeeded();}}

    public int getDependsOnEsId() {try{__CLR4_5_2daudaulvl9ekft.R.inc(17366);
        __CLR4_5_2daudaulvl9ekft.R.inc(17367);return dependsOnEsId;
    }finally{__CLR4_5_2daudaulvl9ekft.R.flushNeeded();}}

    public void setDependsOnEsId(int dependsOnEsId) {try{__CLR4_5_2daudaulvl9ekft.R.inc(17368);
        __CLR4_5_2daudaulvl9ekft.R.inc(17369);this.dependsOnEsId = dependsOnEsId;
    }finally{__CLR4_5_2daudaulvl9ekft.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_5_2daudaulvl9ekft.R.inc(17370);
        __CLR4_5_2daudaulvl9ekft.R.inc(17371);final StringBuilder sb = new StringBuilder();
        __CLR4_5_2daudaulvl9ekft.R.inc(17372);sb.append("ESDescriptor");
        __CLR4_5_2daudaulvl9ekft.R.inc(17373);sb.append("{esId=").append(esId);
        __CLR4_5_2daudaulvl9ekft.R.inc(17374);sb.append(", streamDependenceFlag=").append(streamDependenceFlag);
        __CLR4_5_2daudaulvl9ekft.R.inc(17375);sb.append(", URLFlag=").append(URLFlag);
        __CLR4_5_2daudaulvl9ekft.R.inc(17376);sb.append(", oCRstreamFlag=").append(oCRstreamFlag);
        __CLR4_5_2daudaulvl9ekft.R.inc(17377);sb.append(", streamPriority=").append(streamPriority);
        __CLR4_5_2daudaulvl9ekft.R.inc(17378);sb.append(", URLLength=").append(URLLength);
        __CLR4_5_2daudaulvl9ekft.R.inc(17379);sb.append(", URLString='").append(URLString).append('\'');
        __CLR4_5_2daudaulvl9ekft.R.inc(17380);sb.append(", remoteODFlag=").append(remoteODFlag);
        __CLR4_5_2daudaulvl9ekft.R.inc(17381);sb.append(", dependsOnEsId=").append(dependsOnEsId);
        __CLR4_5_2daudaulvl9ekft.R.inc(17382);sb.append(", oCREsId=").append(oCREsId);
        __CLR4_5_2daudaulvl9ekft.R.inc(17383);sb.append(", decoderConfigDescriptor=").append(decoderConfigDescriptor);
        __CLR4_5_2daudaulvl9ekft.R.inc(17384);sb.append(", slConfigDescriptor=").append(slConfigDescriptor);
        __CLR4_5_2daudaulvl9ekft.R.inc(17385);sb.append('}');
        __CLR4_5_2daudaulvl9ekft.R.inc(17386);return sb.toString();
    }finally{__CLR4_5_2daudaulvl9ekft.R.flushNeeded();}}

    @Override
    public boolean equals(Object o) {try{__CLR4_5_2daudaulvl9ekft.R.inc(17387);
        __CLR4_5_2daudaulvl9ekft.R.inc(17388);if ((((this == o)&&(__CLR4_5_2daudaulvl9ekft.R.iget(17389)!=0|true))||(__CLR4_5_2daudaulvl9ekft.R.iget(17390)==0&false))) {__CLR4_5_2daudaulvl9ekft.R.inc(17391);return true;
        }__CLR4_5_2daudaulvl9ekft.R.inc(17392);if ((((o == null || getClass() != o.getClass())&&(__CLR4_5_2daudaulvl9ekft.R.iget(17393)!=0|true))||(__CLR4_5_2daudaulvl9ekft.R.iget(17394)==0&false))) {__CLR4_5_2daudaulvl9ekft.R.inc(17395);return false;

        }__CLR4_5_2daudaulvl9ekft.R.inc(17396);ESDescriptor that = (ESDescriptor) o;

        __CLR4_5_2daudaulvl9ekft.R.inc(17397);if ((((URLFlag != that.URLFlag)&&(__CLR4_5_2daudaulvl9ekft.R.iget(17398)!=0|true))||(__CLR4_5_2daudaulvl9ekft.R.iget(17399)==0&false))) {__CLR4_5_2daudaulvl9ekft.R.inc(17400);return false;
        }__CLR4_5_2daudaulvl9ekft.R.inc(17401);if ((((URLLength != that.URLLength)&&(__CLR4_5_2daudaulvl9ekft.R.iget(17402)!=0|true))||(__CLR4_5_2daudaulvl9ekft.R.iget(17403)==0&false))) {__CLR4_5_2daudaulvl9ekft.R.inc(17404);return false;
        }__CLR4_5_2daudaulvl9ekft.R.inc(17405);if ((((dependsOnEsId != that.dependsOnEsId)&&(__CLR4_5_2daudaulvl9ekft.R.iget(17406)!=0|true))||(__CLR4_5_2daudaulvl9ekft.R.iget(17407)==0&false))) {__CLR4_5_2daudaulvl9ekft.R.inc(17408);return false;
        }__CLR4_5_2daudaulvl9ekft.R.inc(17409);if ((((esId != that.esId)&&(__CLR4_5_2daudaulvl9ekft.R.iget(17410)!=0|true))||(__CLR4_5_2daudaulvl9ekft.R.iget(17411)==0&false))) {__CLR4_5_2daudaulvl9ekft.R.inc(17412);return false;
        }__CLR4_5_2daudaulvl9ekft.R.inc(17413);if ((((oCREsId != that.oCREsId)&&(__CLR4_5_2daudaulvl9ekft.R.iget(17414)!=0|true))||(__CLR4_5_2daudaulvl9ekft.R.iget(17415)==0&false))) {__CLR4_5_2daudaulvl9ekft.R.inc(17416);return false;
        }__CLR4_5_2daudaulvl9ekft.R.inc(17417);if ((((oCRstreamFlag != that.oCRstreamFlag)&&(__CLR4_5_2daudaulvl9ekft.R.iget(17418)!=0|true))||(__CLR4_5_2daudaulvl9ekft.R.iget(17419)==0&false))) {__CLR4_5_2daudaulvl9ekft.R.inc(17420);return false;
        }__CLR4_5_2daudaulvl9ekft.R.inc(17421);if ((((remoteODFlag != that.remoteODFlag)&&(__CLR4_5_2daudaulvl9ekft.R.iget(17422)!=0|true))||(__CLR4_5_2daudaulvl9ekft.R.iget(17423)==0&false))) {__CLR4_5_2daudaulvl9ekft.R.inc(17424);return false;
        }__CLR4_5_2daudaulvl9ekft.R.inc(17425);if ((((streamDependenceFlag != that.streamDependenceFlag)&&(__CLR4_5_2daudaulvl9ekft.R.iget(17426)!=0|true))||(__CLR4_5_2daudaulvl9ekft.R.iget(17427)==0&false))) {__CLR4_5_2daudaulvl9ekft.R.inc(17428);return false;
        }__CLR4_5_2daudaulvl9ekft.R.inc(17429);if ((((streamPriority != that.streamPriority)&&(__CLR4_5_2daudaulvl9ekft.R.iget(17430)!=0|true))||(__CLR4_5_2daudaulvl9ekft.R.iget(17431)==0&false))) {__CLR4_5_2daudaulvl9ekft.R.inc(17432);return false;
        }__CLR4_5_2daudaulvl9ekft.R.inc(17433);if (((((((URLString != null )&&(__CLR4_5_2daudaulvl9ekft.R.iget(17434)!=0|true))||(__CLR4_5_2daudaulvl9ekft.R.iget(17435)==0&false))? !URLString.equals(that.URLString) : that.URLString != null)&&(__CLR4_5_2daudaulvl9ekft.R.iget(17436)!=0|true))||(__CLR4_5_2daudaulvl9ekft.R.iget(17437)==0&false))) {__CLR4_5_2daudaulvl9ekft.R.inc(17438);return false;
        }__CLR4_5_2daudaulvl9ekft.R.inc(17439);if (((((((decoderConfigDescriptor != null )&&(__CLR4_5_2daudaulvl9ekft.R.iget(17440)!=0|true))||(__CLR4_5_2daudaulvl9ekft.R.iget(17441)==0&false))? !decoderConfigDescriptor.equals(that.decoderConfigDescriptor) : that.decoderConfigDescriptor != null)&&(__CLR4_5_2daudaulvl9ekft.R.iget(17442)!=0|true))||(__CLR4_5_2daudaulvl9ekft.R.iget(17443)==0&false)))
            {__CLR4_5_2daudaulvl9ekft.R.inc(17444);return false;
        }__CLR4_5_2daudaulvl9ekft.R.inc(17445);if (((((((otherDescriptors != null )&&(__CLR4_5_2daudaulvl9ekft.R.iget(17446)!=0|true))||(__CLR4_5_2daudaulvl9ekft.R.iget(17447)==0&false))? !otherDescriptors.equals(that.otherDescriptors) : that.otherDescriptors != null)&&(__CLR4_5_2daudaulvl9ekft.R.iget(17448)!=0|true))||(__CLR4_5_2daudaulvl9ekft.R.iget(17449)==0&false)))
            {__CLR4_5_2daudaulvl9ekft.R.inc(17450);return false;
        }__CLR4_5_2daudaulvl9ekft.R.inc(17451);if (((((((slConfigDescriptor != null )&&(__CLR4_5_2daudaulvl9ekft.R.iget(17452)!=0|true))||(__CLR4_5_2daudaulvl9ekft.R.iget(17453)==0&false))? !slConfigDescriptor.equals(that.slConfigDescriptor) : that.slConfigDescriptor != null)&&(__CLR4_5_2daudaulvl9ekft.R.iget(17454)!=0|true))||(__CLR4_5_2daudaulvl9ekft.R.iget(17455)==0&false)))
            {__CLR4_5_2daudaulvl9ekft.R.inc(17456);return false;

        }__CLR4_5_2daudaulvl9ekft.R.inc(17457);return true;
    }finally{__CLR4_5_2daudaulvl9ekft.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_5_2daudaulvl9ekft.R.inc(17458);
        __CLR4_5_2daudaulvl9ekft.R.inc(17459);int result = esId;
        __CLR4_5_2daudaulvl9ekft.R.inc(17460);result = 31 * result + streamDependenceFlag;
        __CLR4_5_2daudaulvl9ekft.R.inc(17461);result = 31 * result + URLFlag;
        __CLR4_5_2daudaulvl9ekft.R.inc(17462);result = 31 * result + oCRstreamFlag;
        __CLR4_5_2daudaulvl9ekft.R.inc(17463);result = 31 * result + streamPriority;
        __CLR4_5_2daudaulvl9ekft.R.inc(17464);result = 31 * result + URLLength;
        __CLR4_5_2daudaulvl9ekft.R.inc(17465);result = 31 * result + ((((URLString != null )&&(__CLR4_5_2daudaulvl9ekft.R.iget(17466)!=0|true))||(__CLR4_5_2daudaulvl9ekft.R.iget(17467)==0&false))? URLString.hashCode() : 0);
        __CLR4_5_2daudaulvl9ekft.R.inc(17468);result = 31 * result + remoteODFlag;
        __CLR4_5_2daudaulvl9ekft.R.inc(17469);result = 31 * result + dependsOnEsId;
        __CLR4_5_2daudaulvl9ekft.R.inc(17470);result = 31 * result + oCREsId;
        __CLR4_5_2daudaulvl9ekft.R.inc(17471);result = 31 * result + ((((decoderConfigDescriptor != null )&&(__CLR4_5_2daudaulvl9ekft.R.iget(17472)!=0|true))||(__CLR4_5_2daudaulvl9ekft.R.iget(17473)==0&false))? decoderConfigDescriptor.hashCode() : 0);
        __CLR4_5_2daudaulvl9ekft.R.inc(17474);result = 31 * result + ((((slConfigDescriptor != null )&&(__CLR4_5_2daudaulvl9ekft.R.iget(17475)!=0|true))||(__CLR4_5_2daudaulvl9ekft.R.iget(17476)==0&false))? slConfigDescriptor.hashCode() : 0);
        __CLR4_5_2daudaulvl9ekft.R.inc(17477);result = 31 * result + ((((otherDescriptors != null )&&(__CLR4_5_2daudaulvl9ekft.R.iget(17478)!=0|true))||(__CLR4_5_2daudaulvl9ekft.R.iget(17479)==0&false))? otherDescriptors.hashCode() : 0);
        __CLR4_5_2daudaulvl9ekft.R.inc(17480);return result;
    }finally{__CLR4_5_2daudaulvl9ekft.R.flushNeeded();}}
}
