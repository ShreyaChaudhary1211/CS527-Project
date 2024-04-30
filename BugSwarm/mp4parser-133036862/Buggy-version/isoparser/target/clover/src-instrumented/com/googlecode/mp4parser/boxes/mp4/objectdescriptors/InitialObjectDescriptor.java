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

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/*
class InitialObjectDescriptor extends ObjectDescriptorBase : bit(8)
tag=InitialObjectDescrTag {
bit(10) ObjectDescriptorID;
bit(1) URL_Flag;
bit(1) includeInlineProfileLevelFlag;
const bit(4) reserved=0b1111;
if (URL_Flag) {
bit(8) URLlength;
bit(8) URLstring[URLlength];
} else {
bit(8) ODProfileLevelIndication;
bit(8) sceneProfileLevelIndication;
bit(8) audioProfileLevelIndication;
bit(8) visualProfileLevelIndication;
bit(8) graphicsProfileLevelIndication;
ES_Descriptor esDescr[1 .. 255];
OCI_Descriptor ociDescr[0 .. 255];
IPMP_DescriptorPointer ipmpDescrPtr[0 .. 255];
IPMP_Descriptor ipmpDescr [0 .. 255];
IPMP_ToolListDescriptor toolListDescr[0 .. 1];
}
ExtensionDescriptor extDescr[0 .. 255];
}
*/
//@Descriptor(tags = {0x02, 0x10})
public abstract class InitialObjectDescriptor extends ObjectDescriptorBase {public static class __CLR4_5_2dljdljlvlulmgn{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,17678,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    int urlFlag;
    int includeInlineProfileLevelFlag;
    int urlLength;
    String urlString;
    int oDProfileLevelIndication;
    int sceneProfileLevelIndication;
    int audioProfileLevelIndication;
    int visualProfileLevelIndication;
    int graphicsProfileLevelIndication;
    List<ESDescriptor> esDescriptors = new ArrayList<ESDescriptor>();
    List<ExtensionDescriptor> extensionDescriptors = new ArrayList<ExtensionDescriptor>();
    List<BaseDescriptor> unknownDescriptors = new ArrayList<BaseDescriptor>();
    private int objectDescriptorId;

    @Override
    public void parseDetail(ByteBuffer bb) throws IOException {try{__CLR4_5_2dljdljlvlulmgn.R.inc(17623);
        __CLR4_5_2dljdljlvlulmgn.R.inc(17624);int data = IsoTypeReader.readUInt16(bb);
        __CLR4_5_2dljdljlvlulmgn.R.inc(17625);objectDescriptorId = (data & 0xFFC0) >> 6;

        __CLR4_5_2dljdljlvlulmgn.R.inc(17626);urlFlag = (data & 0x3F) >> 5;
        __CLR4_5_2dljdljlvlulmgn.R.inc(17627);includeInlineProfileLevelFlag = (data & 0x1F) >> 4;

        __CLR4_5_2dljdljlvlulmgn.R.inc(17628);int sizeLeft = getSize() - 2;
        __CLR4_5_2dljdljlvlulmgn.R.inc(17629);if ((((urlFlag == 1)&&(__CLR4_5_2dljdljlvlulmgn.R.iget(17630)!=0|true))||(__CLR4_5_2dljdljlvlulmgn.R.iget(17631)==0&false))) {{
            __CLR4_5_2dljdljlvlulmgn.R.inc(17632);urlLength = IsoTypeReader.readUInt8(bb);
            __CLR4_5_2dljdljlvlulmgn.R.inc(17633);urlString = IsoTypeReader.readString(bb, urlLength);
            __CLR4_5_2dljdljlvlulmgn.R.inc(17634);sizeLeft = sizeLeft - (1 + urlLength);
        } }else {{
            __CLR4_5_2dljdljlvlulmgn.R.inc(17635);oDProfileLevelIndication = IsoTypeReader.readUInt8(bb);
            __CLR4_5_2dljdljlvlulmgn.R.inc(17636);sceneProfileLevelIndication = IsoTypeReader.readUInt8(bb);
            __CLR4_5_2dljdljlvlulmgn.R.inc(17637);audioProfileLevelIndication = IsoTypeReader.readUInt8(bb);
            __CLR4_5_2dljdljlvlulmgn.R.inc(17638);visualProfileLevelIndication = IsoTypeReader.readUInt8(bb);
            __CLR4_5_2dljdljlvlulmgn.R.inc(17639);graphicsProfileLevelIndication = IsoTypeReader.readUInt8(bb);

            __CLR4_5_2dljdljlvlulmgn.R.inc(17640);sizeLeft = sizeLeft - 5;

            __CLR4_5_2dljdljlvlulmgn.R.inc(17641);if ((((sizeLeft > 2)&&(__CLR4_5_2dljdljlvlulmgn.R.iget(17642)!=0|true))||(__CLR4_5_2dljdljlvlulmgn.R.iget(17643)==0&false))) {{
                __CLR4_5_2dljdljlvlulmgn.R.inc(17644);final BaseDescriptor descriptor = ObjectDescriptorFactory.createFrom(-1, bb);
                __CLR4_5_2dljdljlvlulmgn.R.inc(17645);sizeLeft = sizeLeft - descriptor.getSize();
                __CLR4_5_2dljdljlvlulmgn.R.inc(17646);if ((((descriptor instanceof ESDescriptor)&&(__CLR4_5_2dljdljlvlulmgn.R.iget(17647)!=0|true))||(__CLR4_5_2dljdljlvlulmgn.R.iget(17648)==0&false))) {{
                    __CLR4_5_2dljdljlvlulmgn.R.inc(17649);esDescriptors.add((ESDescriptor) descriptor);
                } }else {{
                    __CLR4_5_2dljdljlvlulmgn.R.inc(17650);unknownDescriptors.add(descriptor);
                }
            }}
        }}

        }__CLR4_5_2dljdljlvlulmgn.R.inc(17651);if ((((sizeLeft > 2)&&(__CLR4_5_2dljdljlvlulmgn.R.iget(17652)!=0|true))||(__CLR4_5_2dljdljlvlulmgn.R.iget(17653)==0&false))) {{
            __CLR4_5_2dljdljlvlulmgn.R.inc(17654);final BaseDescriptor descriptor = ObjectDescriptorFactory.createFrom(-1, bb);
            __CLR4_5_2dljdljlvlulmgn.R.inc(17655);if ((((descriptor instanceof ExtensionDescriptor)&&(__CLR4_5_2dljdljlvlulmgn.R.iget(17656)!=0|true))||(__CLR4_5_2dljdljlvlulmgn.R.iget(17657)==0&false))) {{
                __CLR4_5_2dljdljlvlulmgn.R.inc(17658);extensionDescriptors.add((ExtensionDescriptor) descriptor);
            } }else {{
                __CLR4_5_2dljdljlvlulmgn.R.inc(17659);unknownDescriptors.add(descriptor);
            }
        }}
    }}finally{__CLR4_5_2dljdljlvlulmgn.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_5_2dljdljlvlulmgn.R.inc(17660);
        __CLR4_5_2dljdljlvlulmgn.R.inc(17661);final StringBuilder sb = new StringBuilder();
        __CLR4_5_2dljdljlvlulmgn.R.inc(17662);sb.append("InitialObjectDescriptor");
        __CLR4_5_2dljdljlvlulmgn.R.inc(17663);sb.append("{objectDescriptorId=").append(objectDescriptorId);
        __CLR4_5_2dljdljlvlulmgn.R.inc(17664);sb.append(", urlFlag=").append(urlFlag);
        __CLR4_5_2dljdljlvlulmgn.R.inc(17665);sb.append(", includeInlineProfileLevelFlag=").append(includeInlineProfileLevelFlag);
        __CLR4_5_2dljdljlvlulmgn.R.inc(17666);sb.append(", urlLength=").append(urlLength);
        __CLR4_5_2dljdljlvlulmgn.R.inc(17667);sb.append(", urlString='").append(urlString).append('\'');
        __CLR4_5_2dljdljlvlulmgn.R.inc(17668);sb.append(", oDProfileLevelIndication=").append(oDProfileLevelIndication);
        __CLR4_5_2dljdljlvlulmgn.R.inc(17669);sb.append(", sceneProfileLevelIndication=").append(sceneProfileLevelIndication);
        __CLR4_5_2dljdljlvlulmgn.R.inc(17670);sb.append(", audioProfileLevelIndication=").append(audioProfileLevelIndication);
        __CLR4_5_2dljdljlvlulmgn.R.inc(17671);sb.append(", visualProfileLevelIndication=").append(visualProfileLevelIndication);
        __CLR4_5_2dljdljlvlulmgn.R.inc(17672);sb.append(", graphicsProfileLevelIndication=").append(graphicsProfileLevelIndication);
        __CLR4_5_2dljdljlvlulmgn.R.inc(17673);sb.append(", esDescriptors=").append(esDescriptors);
        __CLR4_5_2dljdljlvlulmgn.R.inc(17674);sb.append(", extensionDescriptors=").append(extensionDescriptors);
        __CLR4_5_2dljdljlvlulmgn.R.inc(17675);sb.append(", unknownDescriptors=").append(unknownDescriptors);
        __CLR4_5_2dljdljlvlulmgn.R.inc(17676);sb.append('}');
        __CLR4_5_2dljdljlvlulmgn.R.inc(17677);return sb.toString();
    }finally{__CLR4_5_2dljdljlvlulmgn.R.flushNeeded();}}
}
