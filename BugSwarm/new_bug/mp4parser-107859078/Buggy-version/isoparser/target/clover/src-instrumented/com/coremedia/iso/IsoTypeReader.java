/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2012 Sebastian Annies, Hamburg
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
package com.coremedia.iso;

import com.googlecode.mp4parser.util.IntHashMap;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

public final class IsoTypeReader {public static class __CLR4_5_24d4dlvl9ee6p{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,260,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;


    public static long readUInt32BE(ByteBuffer bb) {try{__CLR4_5_24d4dlvl9ee6p.R.inc(157);
        __CLR4_5_24d4dlvl9ee6p.R.inc(158);long ch1 = readUInt8(bb);
        __CLR4_5_24d4dlvl9ee6p.R.inc(159);long ch2 = readUInt8(bb);
        __CLR4_5_24d4dlvl9ee6p.R.inc(160);long ch3 = readUInt8(bb);
        __CLR4_5_24d4dlvl9ee6p.R.inc(161);long ch4 = readUInt8(bb);
        __CLR4_5_24d4dlvl9ee6p.R.inc(162);return ((ch4 << 24) + (ch3 << 16) + (ch2 << 8) + (ch1 << 0));

    }finally{__CLR4_5_24d4dlvl9ee6p.R.flushNeeded();}}


    public static long readUInt32(ByteBuffer bb) {try{__CLR4_5_24d4dlvl9ee6p.R.inc(163);
        __CLR4_5_24d4dlvl9ee6p.R.inc(164);long i = bb.getInt();
        __CLR4_5_24d4dlvl9ee6p.R.inc(165);if ((((i < 0)&&(__CLR4_5_24d4dlvl9ee6p.R.iget(166)!=0|true))||(__CLR4_5_24d4dlvl9ee6p.R.iget(167)==0&false))) {{
            __CLR4_5_24d4dlvl9ee6p.R.inc(168);i += 1l << 32;
        }
        }__CLR4_5_24d4dlvl9ee6p.R.inc(169);return i;
    }finally{__CLR4_5_24d4dlvl9ee6p.R.flushNeeded();}}

    public static int readUInt24(ByteBuffer bb) {try{__CLR4_5_24d4dlvl9ee6p.R.inc(170);
        __CLR4_5_24d4dlvl9ee6p.R.inc(171);int result = 0;
        __CLR4_5_24d4dlvl9ee6p.R.inc(172);result += readUInt16(bb) << 8;
        __CLR4_5_24d4dlvl9ee6p.R.inc(173);result += byte2int(bb.get());
        __CLR4_5_24d4dlvl9ee6p.R.inc(174);return result;
    }finally{__CLR4_5_24d4dlvl9ee6p.R.flushNeeded();}}


    public static int readUInt16(ByteBuffer bb) {try{__CLR4_5_24d4dlvl9ee6p.R.inc(175);
        __CLR4_5_24d4dlvl9ee6p.R.inc(176);int result = 0;
        __CLR4_5_24d4dlvl9ee6p.R.inc(177);result += byte2int(bb.get()) << 8;
        __CLR4_5_24d4dlvl9ee6p.R.inc(178);result += byte2int(bb.get());
        __CLR4_5_24d4dlvl9ee6p.R.inc(179);return result;
    }finally{__CLR4_5_24d4dlvl9ee6p.R.flushNeeded();}}

    public static int readUInt16BE(ByteBuffer bb) {try{__CLR4_5_24d4dlvl9ee6p.R.inc(180);
        __CLR4_5_24d4dlvl9ee6p.R.inc(181);int result = 0;
        __CLR4_5_24d4dlvl9ee6p.R.inc(182);result += byte2int(bb.get());
        __CLR4_5_24d4dlvl9ee6p.R.inc(183);result += byte2int(bb.get()) << 8;
        __CLR4_5_24d4dlvl9ee6p.R.inc(184);return result;
    }finally{__CLR4_5_24d4dlvl9ee6p.R.flushNeeded();}}

    public static int readUInt8(ByteBuffer bb) {try{__CLR4_5_24d4dlvl9ee6p.R.inc(185);
        __CLR4_5_24d4dlvl9ee6p.R.inc(186);return byte2int(bb.get());
    }finally{__CLR4_5_24d4dlvl9ee6p.R.flushNeeded();}}

    public static int byte2int(byte b) {try{__CLR4_5_24d4dlvl9ee6p.R.inc(187);
        __CLR4_5_24d4dlvl9ee6p.R.inc(188);return (((b < 0 )&&(__CLR4_5_24d4dlvl9ee6p.R.iget(189)!=0|true))||(__CLR4_5_24d4dlvl9ee6p.R.iget(190)==0&false))? b + 256 : b;
    }finally{__CLR4_5_24d4dlvl9ee6p.R.flushNeeded();}}


    /**
     * Reads a zero terminated UTF-8 string.
     *
     * @param byteBuffer the data source
     * @return the string readByte
     * @throws Error in case of an error in the underlying stream
     */
    public static String readString(ByteBuffer byteBuffer) {try{__CLR4_5_24d4dlvl9ee6p.R.inc(191);

        __CLR4_5_24d4dlvl9ee6p.R.inc(192);ByteArrayOutputStream out = new ByteArrayOutputStream();
        __CLR4_5_24d4dlvl9ee6p.R.inc(193);int read;
        __CLR4_5_24d4dlvl9ee6p.R.inc(194);while ((read = byteBuffer.get()) != 0) {{
            __CLR4_5_24d4dlvl9ee6p.R.inc(197);out.write(read);
        }
        }__CLR4_5_24d4dlvl9ee6p.R.inc(198);return Utf8.convert(out.toByteArray());
    }finally{__CLR4_5_24d4dlvl9ee6p.R.flushNeeded();}}

    public static String readString(ByteBuffer byteBuffer, int length) {try{__CLR4_5_24d4dlvl9ee6p.R.inc(199);
        __CLR4_5_24d4dlvl9ee6p.R.inc(200);byte[] buffer = new byte[length];
        __CLR4_5_24d4dlvl9ee6p.R.inc(201);byteBuffer.get(buffer);
        __CLR4_5_24d4dlvl9ee6p.R.inc(202);return Utf8.convert(buffer);

    }finally{__CLR4_5_24d4dlvl9ee6p.R.flushNeeded();}}

    public static long readUInt64(ByteBuffer byteBuffer) {try{__CLR4_5_24d4dlvl9ee6p.R.inc(203);
        __CLR4_5_24d4dlvl9ee6p.R.inc(204);long result = 0;
        // thanks to Erik Nicolas for finding a bug! Cast to long is definitivly needed
        __CLR4_5_24d4dlvl9ee6p.R.inc(205);result += readUInt32(byteBuffer) << 32;
        __CLR4_5_24d4dlvl9ee6p.R.inc(206);if ((((result < 0)&&(__CLR4_5_24d4dlvl9ee6p.R.iget(207)!=0|true))||(__CLR4_5_24d4dlvl9ee6p.R.iget(208)==0&false))) {{
            __CLR4_5_24d4dlvl9ee6p.R.inc(209);throw new RuntimeException("I don't know how to deal with UInt64! long is not sufficient and I don't want to use BigInt");
        }
        }__CLR4_5_24d4dlvl9ee6p.R.inc(210);result += readUInt32(byteBuffer);

        __CLR4_5_24d4dlvl9ee6p.R.inc(211);return result;
    }finally{__CLR4_5_24d4dlvl9ee6p.R.flushNeeded();}}

    public static double readFixedPoint1616(ByteBuffer bb) {try{__CLR4_5_24d4dlvl9ee6p.R.inc(212);
        __CLR4_5_24d4dlvl9ee6p.R.inc(213);byte[] bytes = new byte[4];
        __CLR4_5_24d4dlvl9ee6p.R.inc(214);bb.get(bytes);

        __CLR4_5_24d4dlvl9ee6p.R.inc(215);int result = 0;
        __CLR4_5_24d4dlvl9ee6p.R.inc(216);result |= ((bytes[0] << 24) & 0xFF000000);
        __CLR4_5_24d4dlvl9ee6p.R.inc(217);result |= ((bytes[1] << 16) & 0xFF0000);
        __CLR4_5_24d4dlvl9ee6p.R.inc(218);result |= ((bytes[2] << 8) & 0xFF00);
        __CLR4_5_24d4dlvl9ee6p.R.inc(219);result |= ((bytes[3]) & 0xFF);
        __CLR4_5_24d4dlvl9ee6p.R.inc(220);return ((double) result) / 65536;

    }finally{__CLR4_5_24d4dlvl9ee6p.R.flushNeeded();}}


    public static double readFixedPoint0230(ByteBuffer bb) {try{__CLR4_5_24d4dlvl9ee6p.R.inc(221);
        __CLR4_5_24d4dlvl9ee6p.R.inc(222);byte[] bytes = new byte[4];
        __CLR4_5_24d4dlvl9ee6p.R.inc(223);bb.get(bytes);

        __CLR4_5_24d4dlvl9ee6p.R.inc(224);int result = 0;
        __CLR4_5_24d4dlvl9ee6p.R.inc(225);result |= ((bytes[0] << 24) & 0xFF000000);
        __CLR4_5_24d4dlvl9ee6p.R.inc(226);result |= ((bytes[1] << 16) & 0xFF0000);
        __CLR4_5_24d4dlvl9ee6p.R.inc(227);result |= ((bytes[2] << 8) & 0xFF00);
        __CLR4_5_24d4dlvl9ee6p.R.inc(228);result |= ((bytes[3]) & 0xFF);
        __CLR4_5_24d4dlvl9ee6p.R.inc(229);return ((double) result) / (1 << 30);

    }finally{__CLR4_5_24d4dlvl9ee6p.R.flushNeeded();}}

    public static float readFixedPoint88(ByteBuffer bb) {try{__CLR4_5_24d4dlvl9ee6p.R.inc(230);
        __CLR4_5_24d4dlvl9ee6p.R.inc(231);byte[] bytes = new byte[2];
        __CLR4_5_24d4dlvl9ee6p.R.inc(232);bb.get(bytes);
        __CLR4_5_24d4dlvl9ee6p.R.inc(233);short result = 0;
        __CLR4_5_24d4dlvl9ee6p.R.inc(234);result |= ((bytes[0] << 8) & 0xFF00);
        __CLR4_5_24d4dlvl9ee6p.R.inc(235);result |= ((bytes[1]) & 0xFF);
        __CLR4_5_24d4dlvl9ee6p.R.inc(236);return ((float) result) / 256;
    }finally{__CLR4_5_24d4dlvl9ee6p.R.flushNeeded();}}

    public static String readIso639(ByteBuffer bb) {try{__CLR4_5_24d4dlvl9ee6p.R.inc(237);
        __CLR4_5_24d4dlvl9ee6p.R.inc(238);int bits = readUInt16(bb);
        __CLR4_5_24d4dlvl9ee6p.R.inc(239);StringBuilder result = new StringBuilder();
        __CLR4_5_24d4dlvl9ee6p.R.inc(240);for (int i = 0; (((i < 3)&&(__CLR4_5_24d4dlvl9ee6p.R.iget(241)!=0|true))||(__CLR4_5_24d4dlvl9ee6p.R.iget(242)==0&false)); i++) {{
            __CLR4_5_24d4dlvl9ee6p.R.inc(243);int c = (bits >> (2 - i) * 5) & 0x1f;
            __CLR4_5_24d4dlvl9ee6p.R.inc(244);result.append((char) (c + 0x60));
        }
        }__CLR4_5_24d4dlvl9ee6p.R.inc(245);return result.toString();
    }finally{__CLR4_5_24d4dlvl9ee6p.R.flushNeeded();}}


    public static String read4cc(ByteBuffer bb) {try{__CLR4_5_24d4dlvl9ee6p.R.inc(246);
        __CLR4_5_24d4dlvl9ee6p.R.inc(247);byte[] codeBytes = new byte[4];
        __CLR4_5_24d4dlvl9ee6p.R.inc(248);bb.get(codeBytes);

        __CLR4_5_24d4dlvl9ee6p.R.inc(249);try {
            __CLR4_5_24d4dlvl9ee6p.R.inc(250);return new String(codeBytes, "ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            __CLR4_5_24d4dlvl9ee6p.R.inc(251);throw new RuntimeException(e);
        }


    }finally{__CLR4_5_24d4dlvl9ee6p.R.flushNeeded();}}

    public static long readUInt48(ByteBuffer byteBuffer) {try{__CLR4_5_24d4dlvl9ee6p.R.inc(252);
        __CLR4_5_24d4dlvl9ee6p.R.inc(253);long result = (long) readUInt16(byteBuffer) << 32;
        __CLR4_5_24d4dlvl9ee6p.R.inc(254);if ((((result < 0)&&(__CLR4_5_24d4dlvl9ee6p.R.iget(255)!=0|true))||(__CLR4_5_24d4dlvl9ee6p.R.iget(256)==0&false))) {{
            __CLR4_5_24d4dlvl9ee6p.R.inc(257);throw new RuntimeException("I don't know how to deal with UInt64! long is not sufficient and I don't want to use BigInt");
        }
        }__CLR4_5_24d4dlvl9ee6p.R.inc(258);result += readUInt32(byteBuffer);

        __CLR4_5_24d4dlvl9ee6p.R.inc(259);return result;
    }finally{__CLR4_5_24d4dlvl9ee6p.R.flushNeeded();}}
}
