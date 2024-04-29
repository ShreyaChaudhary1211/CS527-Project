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

package com.coremedia.iso.boxes;


import com.coremedia.iso.IsoFile;
import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.Utf8;
import com.googlecode.mp4parser.AbstractFullBox;

import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * <h1>4cc = "{@value #TYPE}"</h1>
 * This box within a Media Box declares the process by which the media-data in the track is presented,
 * and thus, the nature of the media in a track.
 * This Box when present in a Meta Box, declares the structure or format of the 'meta' box contents.
 * See ISO/IEC 14496-12 for details.
 *
 * @see MetaBox
 * @see MediaBox
 */
public class HandlerBox extends AbstractFullBox {public static class __CLR4_5_2ubublvl9eesz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,1164,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static final String TYPE = "hdlr";
    public static final Map<String, String> readableTypes;

    static {try{__CLR4_5_2ubublvl9eesz.R.inc(1091);
        __CLR4_5_2ubublvl9eesz.R.inc(1092);HashMap<String, String> hm = new HashMap<String, String>();
        __CLR4_5_2ubublvl9eesz.R.inc(1093);hm.put("odsm", "ObjectDescriptorStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        __CLR4_5_2ubublvl9eesz.R.inc(1094);hm.put("crsm", "ClockReferenceStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        __CLR4_5_2ubublvl9eesz.R.inc(1095);hm.put("sdsm", "SceneDescriptionStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        __CLR4_5_2ubublvl9eesz.R.inc(1096);hm.put("m7sm", "MPEG7Stream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        __CLR4_5_2ubublvl9eesz.R.inc(1097);hm.put("ocsm", "ObjectContentInfoStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        __CLR4_5_2ubublvl9eesz.R.inc(1098);hm.put("ipsm", "IPMP Stream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        __CLR4_5_2ubublvl9eesz.R.inc(1099);hm.put("mjsm", "MPEG-J Stream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        __CLR4_5_2ubublvl9eesz.R.inc(1100);hm.put("mdir", "Apple Meta Data iTunes Reader");
        __CLR4_5_2ubublvl9eesz.R.inc(1101);hm.put("mp7b", "MPEG-7 binary XML");
        __CLR4_5_2ubublvl9eesz.R.inc(1102);hm.put("mp7t", "MPEG-7 XML");
        __CLR4_5_2ubublvl9eesz.R.inc(1103);hm.put("vide", "Video Track");
        __CLR4_5_2ubublvl9eesz.R.inc(1104);hm.put("soun", "Sound Track");
        __CLR4_5_2ubublvl9eesz.R.inc(1105);hm.put("hint", "Hint Track");
        __CLR4_5_2ubublvl9eesz.R.inc(1106);hm.put("appl", "Apple specific");
        __CLR4_5_2ubublvl9eesz.R.inc(1107);hm.put("meta", "Timed Metadata track - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");

        __CLR4_5_2ubublvl9eesz.R.inc(1108);readableTypes = Collections.unmodifiableMap(hm);

    }finally{__CLR4_5_2ubublvl9eesz.R.flushNeeded();}}

    private String handlerType;
    private String name = null;
    private long a, b, c;
    private boolean zeroTerm = true;

    private long shouldBeZeroButAppleWritesHereSomeValue;

    public HandlerBox() {
        super(TYPE);__CLR4_5_2ubublvl9eesz.R.inc(1110);try{__CLR4_5_2ubublvl9eesz.R.inc(1109);
    }finally{__CLR4_5_2ubublvl9eesz.R.flushNeeded();}}

    public String getHandlerType() {try{__CLR4_5_2ubublvl9eesz.R.inc(1111);
        __CLR4_5_2ubublvl9eesz.R.inc(1112);return handlerType;
    }finally{__CLR4_5_2ubublvl9eesz.R.flushNeeded();}}

    /**
     * You are required to add a '\0' string termination by yourself.
     *
     * @param name the new human readable name
     */
    public void setName(String name) {try{__CLR4_5_2ubublvl9eesz.R.inc(1113);
        __CLR4_5_2ubublvl9eesz.R.inc(1114);this.name = name;
    }finally{__CLR4_5_2ubublvl9eesz.R.flushNeeded();}}

    public void setHandlerType(String handlerType) {try{__CLR4_5_2ubublvl9eesz.R.inc(1115);
        __CLR4_5_2ubublvl9eesz.R.inc(1116);this.handlerType = handlerType;
    }finally{__CLR4_5_2ubublvl9eesz.R.flushNeeded();}}

    public String getName() {try{__CLR4_5_2ubublvl9eesz.R.inc(1117);
        __CLR4_5_2ubublvl9eesz.R.inc(1118);return name;
    }finally{__CLR4_5_2ubublvl9eesz.R.flushNeeded();}}

    public String getHumanReadableTrackType() {try{__CLR4_5_2ubublvl9eesz.R.inc(1119);
        __CLR4_5_2ubublvl9eesz.R.inc(1120);return (((readableTypes.get(handlerType) != null )&&(__CLR4_5_2ubublvl9eesz.R.iget(1121)!=0|true))||(__CLR4_5_2ubublvl9eesz.R.iget(1122)==0&false))? readableTypes.get(handlerType) : "Unknown Handler Type";
    }finally{__CLR4_5_2ubublvl9eesz.R.flushNeeded();}}

    protected long getContentSize() {try{__CLR4_5_2ubublvl9eesz.R.inc(1123);
        __CLR4_5_2ubublvl9eesz.R.inc(1124);if ((((zeroTerm)&&(__CLR4_5_2ubublvl9eesz.R.iget(1125)!=0|true))||(__CLR4_5_2ubublvl9eesz.R.iget(1126)==0&false))) {{
            __CLR4_5_2ubublvl9eesz.R.inc(1127);return 25 + Utf8.utf8StringLengthInBytes(name);
        } }else {{
            __CLR4_5_2ubublvl9eesz.R.inc(1128);return 24 + Utf8.utf8StringLengthInBytes(name);
        }

    }}finally{__CLR4_5_2ubublvl9eesz.R.flushNeeded();}}

    @Override
    public void _parseDetails(ByteBuffer content) {try{__CLR4_5_2ubublvl9eesz.R.inc(1129);
        __CLR4_5_2ubublvl9eesz.R.inc(1130);parseVersionAndFlags(content);
        __CLR4_5_2ubublvl9eesz.R.inc(1131);shouldBeZeroButAppleWritesHereSomeValue = IsoTypeReader.readUInt32(content);
        __CLR4_5_2ubublvl9eesz.R.inc(1132);handlerType = IsoTypeReader.read4cc(content);
        __CLR4_5_2ubublvl9eesz.R.inc(1133);a = IsoTypeReader.readUInt32(content);
        __CLR4_5_2ubublvl9eesz.R.inc(1134);b = IsoTypeReader.readUInt32(content);
        __CLR4_5_2ubublvl9eesz.R.inc(1135);c = IsoTypeReader.readUInt32(content);
        __CLR4_5_2ubublvl9eesz.R.inc(1136);if ((((content.remaining() > 0)&&(__CLR4_5_2ubublvl9eesz.R.iget(1137)!=0|true))||(__CLR4_5_2ubublvl9eesz.R.iget(1138)==0&false))) {{
            __CLR4_5_2ubublvl9eesz.R.inc(1139);name = IsoTypeReader.readString(content, content.remaining());
            __CLR4_5_2ubublvl9eesz.R.inc(1140);if ((((name.endsWith("\0"))&&(__CLR4_5_2ubublvl9eesz.R.iget(1141)!=0|true))||(__CLR4_5_2ubublvl9eesz.R.iget(1142)==0&false))) {{
                __CLR4_5_2ubublvl9eesz.R.inc(1143);name = name.substring(0, name.length() - 1);
                __CLR4_5_2ubublvl9eesz.R.inc(1144);zeroTerm = true;
            } }else {{
                __CLR4_5_2ubublvl9eesz.R.inc(1145);zeroTerm = false;
            }
        }} }else {{
            __CLR4_5_2ubublvl9eesz.R.inc(1146);zeroTerm = false; //No string at all, not even zero term char
        }
    }}finally{__CLR4_5_2ubublvl9eesz.R.flushNeeded();}}

    @Override
    protected void getContent(ByteBuffer byteBuffer) {try{__CLR4_5_2ubublvl9eesz.R.inc(1147);
        __CLR4_5_2ubublvl9eesz.R.inc(1148);writeVersionAndFlags(byteBuffer);
        __CLR4_5_2ubublvl9eesz.R.inc(1149);IsoTypeWriter.writeUInt32(byteBuffer, shouldBeZeroButAppleWritesHereSomeValue);
        __CLR4_5_2ubublvl9eesz.R.inc(1150);byteBuffer.put(IsoFile.fourCCtoBytes(handlerType));
        __CLR4_5_2ubublvl9eesz.R.inc(1151);IsoTypeWriter.writeUInt32(byteBuffer, a);
        __CLR4_5_2ubublvl9eesz.R.inc(1152);IsoTypeWriter.writeUInt32(byteBuffer, b);
        __CLR4_5_2ubublvl9eesz.R.inc(1153);IsoTypeWriter.writeUInt32(byteBuffer, c);
        __CLR4_5_2ubublvl9eesz.R.inc(1154);if ((((name != null)&&(__CLR4_5_2ubublvl9eesz.R.iget(1155)!=0|true))||(__CLR4_5_2ubublvl9eesz.R.iget(1156)==0&false))) {{
            __CLR4_5_2ubublvl9eesz.R.inc(1157);byteBuffer.put(Utf8.convert(name));
        }
        }__CLR4_5_2ubublvl9eesz.R.inc(1158);if ((((zeroTerm)&&(__CLR4_5_2ubublvl9eesz.R.iget(1159)!=0|true))||(__CLR4_5_2ubublvl9eesz.R.iget(1160)==0&false))) {{
            __CLR4_5_2ubublvl9eesz.R.inc(1161);byteBuffer.put((byte) 0);
        }
    }}finally{__CLR4_5_2ubublvl9eesz.R.flushNeeded();}}

    public String toString() {try{__CLR4_5_2ubublvl9eesz.R.inc(1162);
        __CLR4_5_2ubublvl9eesz.R.inc(1163);return "HandlerBox[handlerType=" + getHandlerType() + ";name=" + getName() + "]";
    }finally{__CLR4_5_2ubublvl9eesz.R.flushNeeded();}}
}
