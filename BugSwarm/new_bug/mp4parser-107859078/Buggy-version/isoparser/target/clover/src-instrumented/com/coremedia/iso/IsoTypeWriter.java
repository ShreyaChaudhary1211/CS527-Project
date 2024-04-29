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

import java.nio.ByteBuffer;

public final class IsoTypeWriter {public static class __CLR4_5_27m7mlvl9ee8v{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,346,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static void writeUInt64(ByteBuffer bb, long u) {try{__CLR4_5_27m7mlvl9ee8v.R.inc(274);
        assert (((u >= 0 )&&(__CLR4_5_27m7mlvl9ee8v.R.iget(275)!=0|true))||(__CLR4_5_27m7mlvl9ee8v.R.iget(276)==0&false)): "The given long is negative";
        __CLR4_5_27m7mlvl9ee8v.R.inc(277);bb.putLong(u);
    }finally{__CLR4_5_27m7mlvl9ee8v.R.flushNeeded();}}

    public static void writeUInt32(ByteBuffer bb, long u) {try{__CLR4_5_27m7mlvl9ee8v.R.inc(278);
        assert (((u >= 0 && u <= 1L << 32 )&&(__CLR4_5_27m7mlvl9ee8v.R.iget(279)!=0|true))||(__CLR4_5_27m7mlvl9ee8v.R.iget(280)==0&false)): "The given long is not in the range of uint32 (" + u + ")";
        __CLR4_5_27m7mlvl9ee8v.R.inc(281);bb.putInt((int) u);

    }finally{__CLR4_5_27m7mlvl9ee8v.R.flushNeeded();}}

    public static void writeUInt32BE(ByteBuffer bb, long u) {try{__CLR4_5_27m7mlvl9ee8v.R.inc(282);
        assert (((u >= 0 && u <= 1L << 32 )&&(__CLR4_5_27m7mlvl9ee8v.R.iget(283)!=0|true))||(__CLR4_5_27m7mlvl9ee8v.R.iget(284)==0&false)): "The given long is not in the range of uint32 (" + u + ")";
        __CLR4_5_27m7mlvl9ee8v.R.inc(285);writeUInt16BE(bb, (int) u & 0xFFFF);
        __CLR4_5_27m7mlvl9ee8v.R.inc(286);writeUInt16BE(bb, (int) ((u >> 16) & 0xFFFF));

    }finally{__CLR4_5_27m7mlvl9ee8v.R.flushNeeded();}}


    public static void writeUInt24(ByteBuffer bb, int i) {try{__CLR4_5_27m7mlvl9ee8v.R.inc(287);
        __CLR4_5_27m7mlvl9ee8v.R.inc(288);i = i & 0xFFFFFF;
        __CLR4_5_27m7mlvl9ee8v.R.inc(289);writeUInt16(bb, i >> 8);
        __CLR4_5_27m7mlvl9ee8v.R.inc(290);writeUInt8(bb, i);

    }finally{__CLR4_5_27m7mlvl9ee8v.R.flushNeeded();}}

    public static void writeUInt48(ByteBuffer bb, long l) {try{__CLR4_5_27m7mlvl9ee8v.R.inc(291);
        __CLR4_5_27m7mlvl9ee8v.R.inc(292);l = l & 0xFFFFFFFFFFFFl;
        __CLR4_5_27m7mlvl9ee8v.R.inc(293);writeUInt16(bb, (int) (l >> 32));
        __CLR4_5_27m7mlvl9ee8v.R.inc(294);writeUInt32(bb, l & 0xFFFFFFFFl);

    }finally{__CLR4_5_27m7mlvl9ee8v.R.flushNeeded();}}


    public static void writeUInt16(ByteBuffer bb, int i) {try{__CLR4_5_27m7mlvl9ee8v.R.inc(295);
        __CLR4_5_27m7mlvl9ee8v.R.inc(296);i = i & 0xFFFF;
        __CLR4_5_27m7mlvl9ee8v.R.inc(297);writeUInt8(bb, i >> 8);
        __CLR4_5_27m7mlvl9ee8v.R.inc(298);writeUInt8(bb, i & 0xFF);
    }finally{__CLR4_5_27m7mlvl9ee8v.R.flushNeeded();}}

    public static void writeUInt16BE(ByteBuffer bb, int i) {try{__CLR4_5_27m7mlvl9ee8v.R.inc(299);
        __CLR4_5_27m7mlvl9ee8v.R.inc(300);i = i & 0xFFFF;
        __CLR4_5_27m7mlvl9ee8v.R.inc(301);writeUInt8(bb, i & 0xFF);
        __CLR4_5_27m7mlvl9ee8v.R.inc(302);writeUInt8(bb, i >> 8);
    }finally{__CLR4_5_27m7mlvl9ee8v.R.flushNeeded();}}

    public static void writeUInt8(ByteBuffer bb, int i) {try{__CLR4_5_27m7mlvl9ee8v.R.inc(303);
        __CLR4_5_27m7mlvl9ee8v.R.inc(304);i = i & 0xFF;
        __CLR4_5_27m7mlvl9ee8v.R.inc(305);bb.put((byte) i);
    }finally{__CLR4_5_27m7mlvl9ee8v.R.flushNeeded();}}


    public static void writeFixedPoint1616(ByteBuffer bb, double v) {try{__CLR4_5_27m7mlvl9ee8v.R.inc(306);
        __CLR4_5_27m7mlvl9ee8v.R.inc(307);int result = (int) (v * 65536);
        __CLR4_5_27m7mlvl9ee8v.R.inc(308);bb.put((byte) ((result & 0xFF000000) >> 24));
        __CLR4_5_27m7mlvl9ee8v.R.inc(309);bb.put((byte) ((result & 0x00FF0000) >> 16));
        __CLR4_5_27m7mlvl9ee8v.R.inc(310);bb.put((byte) ((result & 0x0000FF00) >> 8));
        __CLR4_5_27m7mlvl9ee8v.R.inc(311);bb.put((byte) ((result & 0x000000FF)));
    }finally{__CLR4_5_27m7mlvl9ee8v.R.flushNeeded();}}

    public static void writeFixedPoint0230(ByteBuffer bb, double v) {try{__CLR4_5_27m7mlvl9ee8v.R.inc(312);
        __CLR4_5_27m7mlvl9ee8v.R.inc(313);int result = (int) (v * (1 << 30));
        __CLR4_5_27m7mlvl9ee8v.R.inc(314);bb.put((byte) ((result & 0xFF000000) >> 24));
        __CLR4_5_27m7mlvl9ee8v.R.inc(315);bb.put((byte) ((result & 0x00FF0000) >> 16));
        __CLR4_5_27m7mlvl9ee8v.R.inc(316);bb.put((byte) ((result & 0x0000FF00) >> 8));
        __CLR4_5_27m7mlvl9ee8v.R.inc(317);bb.put((byte) ((result & 0x000000FF)));
    }finally{__CLR4_5_27m7mlvl9ee8v.R.flushNeeded();}}

    public static void writeFixedPoint88(ByteBuffer bb, double v) {try{__CLR4_5_27m7mlvl9ee8v.R.inc(318);
        __CLR4_5_27m7mlvl9ee8v.R.inc(319);short result = (short) (v * 256);
        __CLR4_5_27m7mlvl9ee8v.R.inc(320);bb.put((byte) ((result & 0xFF00) >> 8));
        __CLR4_5_27m7mlvl9ee8v.R.inc(321);bb.put((byte) ((result & 0x00FF)));
    }finally{__CLR4_5_27m7mlvl9ee8v.R.flushNeeded();}}

    public static void writeIso639(ByteBuffer bb, String language) {try{__CLR4_5_27m7mlvl9ee8v.R.inc(322);
        __CLR4_5_27m7mlvl9ee8v.R.inc(323);if ((((language.getBytes().length != 3)&&(__CLR4_5_27m7mlvl9ee8v.R.iget(324)!=0|true))||(__CLR4_5_27m7mlvl9ee8v.R.iget(325)==0&false))) {{
            __CLR4_5_27m7mlvl9ee8v.R.inc(326);throw new IllegalArgumentException("\"" + language + "\" language string isn't exactly 3 characters long!");
        }
        }__CLR4_5_27m7mlvl9ee8v.R.inc(327);int bits = 0;
        __CLR4_5_27m7mlvl9ee8v.R.inc(328);for (int i = 0; (((i < 3)&&(__CLR4_5_27m7mlvl9ee8v.R.iget(329)!=0|true))||(__CLR4_5_27m7mlvl9ee8v.R.iget(330)==0&false)); i++) {{
            __CLR4_5_27m7mlvl9ee8v.R.inc(331);bits += (language.getBytes()[i] - 0x60) << (2 - i) * 5;
        }
        }__CLR4_5_27m7mlvl9ee8v.R.inc(332);writeUInt16(bb, bits);
    }finally{__CLR4_5_27m7mlvl9ee8v.R.flushNeeded();}}

    public static void writePascalUtfString(ByteBuffer bb, String string) {try{__CLR4_5_27m7mlvl9ee8v.R.inc(333);
        __CLR4_5_27m7mlvl9ee8v.R.inc(334);byte[] b = Utf8.convert(string);
        assert (((b.length < 255)&&(__CLR4_5_27m7mlvl9ee8v.R.iget(335)!=0|true))||(__CLR4_5_27m7mlvl9ee8v.R.iget(336)==0&false));
        __CLR4_5_27m7mlvl9ee8v.R.inc(337);writeUInt8(bb, b.length);
        __CLR4_5_27m7mlvl9ee8v.R.inc(338);bb.put(b);
    }finally{__CLR4_5_27m7mlvl9ee8v.R.flushNeeded();}}

    public static void writeZeroTermUtf8String(ByteBuffer bb, String string) {try{__CLR4_5_27m7mlvl9ee8v.R.inc(339);
        __CLR4_5_27m7mlvl9ee8v.R.inc(340);byte[] b = Utf8.convert(string);
        __CLR4_5_27m7mlvl9ee8v.R.inc(341);bb.put(b);
        __CLR4_5_27m7mlvl9ee8v.R.inc(342);writeUInt8(bb, 0);
    }finally{__CLR4_5_27m7mlvl9ee8v.R.flushNeeded();}}

    public static void writeUtf8String(ByteBuffer bb, String string) {try{__CLR4_5_27m7mlvl9ee8v.R.inc(343);

        __CLR4_5_27m7mlvl9ee8v.R.inc(344);bb.put(Utf8.convert(string));
        __CLR4_5_27m7mlvl9ee8v.R.inc(345);writeUInt8(bb, 0);
    }finally{__CLR4_5_27m7mlvl9ee8v.R.flushNeeded();}}
}
