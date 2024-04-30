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
import com.coremedia.iso.IsoTypeWriter;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.logging.Logger;

/**
 * abstract class ExtensionDescriptor extends BaseDescriptor
 * : bit(8) tag = ExtensionProfileLevelDescrTag, ExtDescrTagStartRange ..
 * ExtDescrTagEndRange {
 * // empty. To be filled by classes extending this class.
 * }
 */
@Descriptor(tags = {0x13, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124, 125, 126, 127, 128, 129, 130, 131, 132, 133, 134, 135, 136, 137, 138, 139, 140, 141, 142, 143, 144, 145, 146, 147, 148, 149, 150, 151, 152, 153, 154, 155, 156, 157, 158, 159, 160, 161, 162, 163, 164, 165, 166, 167, 168, 169, 170, 171, 172, 173, 174, 175, 176, 177, 178, 179, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 250, 251, 252, 253})
public class ExtensionDescriptor extends BaseDescriptor {public static class __CLR4_5_2dk8dk8lvlulme1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,17603,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;


    private static Logger log = Logger.getLogger(ExtensionDescriptor.class.getName());

    ByteBuffer data;


    //todo: add this better to the tags list?
    //14496-1:2010 p.20:
    //0x6A-0xBF Reserved for ISO use
    //0xC0-0xFE User private
    //
    //ExtDescrTagStartRange = 0x6A
    //ExtDescrTagEndRange = 0xFE
    static int[] allTags() {try{__CLR4_5_2dk8dk8lvlulme1.R.inc(17576);
        __CLR4_5_2dk8dk8lvlulme1.R.inc(17577);int[] ints = new int[0xFE - 0x6A];

        __CLR4_5_2dk8dk8lvlulme1.R.inc(17578);for (int i = 0x6A; (((i < 0xFE)&&(__CLR4_5_2dk8dk8lvlulme1.R.iget(17579)!=0|true))||(__CLR4_5_2dk8dk8lvlulme1.R.iget(17580)==0&false)); i++) {{
            __CLR4_5_2dk8dk8lvlulme1.R.inc(17581);final int pos = i - 0x6A;
            __CLR4_5_2dk8dk8lvlulme1.R.inc(17582);log.finest("pos:" + pos);
            __CLR4_5_2dk8dk8lvlulme1.R.inc(17583);ints[pos] = i;
        }
        }__CLR4_5_2dk8dk8lvlulme1.R.inc(17584);return ints;
    }finally{__CLR4_5_2dk8dk8lvlulme1.R.flushNeeded();}}

    @Override
    public void parseDetail(ByteBuffer bb) throws IOException {try{__CLR4_5_2dk8dk8lvlulme1.R.inc(17585);
        __CLR4_5_2dk8dk8lvlulme1.R.inc(17586);data = bb.slice();
        __CLR4_5_2dk8dk8lvlulme1.R.inc(17587);bb.position(bb.position() + data.remaining());
    }finally{__CLR4_5_2dk8dk8lvlulme1.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_5_2dk8dk8lvlulme1.R.inc(17588);
        __CLR4_5_2dk8dk8lvlulme1.R.inc(17589);final StringBuilder sb = new StringBuilder();
        __CLR4_5_2dk8dk8lvlulme1.R.inc(17590);sb.append("ExtensionDescriptor");
        __CLR4_5_2dk8dk8lvlulme1.R.inc(17591);sb.append("tag=").append(tag);
        __CLR4_5_2dk8dk8lvlulme1.R.inc(17592);sb.append(",bytes=").append(Hex.encodeHex(data.array()));
        __CLR4_5_2dk8dk8lvlulme1.R.inc(17593);sb.append('}');
        __CLR4_5_2dk8dk8lvlulme1.R.inc(17594);return sb.toString();
    }finally{__CLR4_5_2dk8dk8lvlulme1.R.flushNeeded();}}

    @Override
    public ByteBuffer serialize() {try{__CLR4_5_2dk8dk8lvlulme1.R.inc(17595);
        __CLR4_5_2dk8dk8lvlulme1.R.inc(17596);ByteBuffer out = ByteBuffer.allocate(getSize());
        __CLR4_5_2dk8dk8lvlulme1.R.inc(17597);IsoTypeWriter.writeUInt8(out, tag);
        __CLR4_5_2dk8dk8lvlulme1.R.inc(17598);writeSize(out, getContentSize());
        __CLR4_5_2dk8dk8lvlulme1.R.inc(17599);out.put(data.duplicate());
        __CLR4_5_2dk8dk8lvlulme1.R.inc(17600);return out;
    }finally{__CLR4_5_2dk8dk8lvlulme1.R.flushNeeded();}}

    @Override
    int getContentSize() {try{__CLR4_5_2dk8dk8lvlulme1.R.inc(17601);
        __CLR4_5_2dk8dk8lvlulme1.R.inc(17602);return data.remaining();
    }finally{__CLR4_5_2dk8dk8lvlulme1.R.flushNeeded();}}
}
