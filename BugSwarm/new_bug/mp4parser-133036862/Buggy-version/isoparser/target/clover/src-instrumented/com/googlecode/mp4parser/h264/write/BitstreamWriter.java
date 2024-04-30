/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
Copyright (c) 2011 Stanislav Vitvitskiy

Permission is hereby granted, free of charge, to any person obtaining a copy of this
software and associated documentation files (the "Software"), to deal in the Software
without restriction, including without limitation the rights to use, copy, modify,
merge, publish, distribute, sublicense, and/or sell copies of the Software, and to
permit persons to whom the Software is furnished to do so, subject to the following
conditions:

The above copyright notice and this permission notice shall be included in all copies or
substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED,
INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR
PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE
FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT,
TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE
OR OTHER DEALINGS IN THE SOFTWARE.
*/
package com.googlecode.mp4parser.h264.write;

import com.googlecode.mp4parser.h264.Debug;

import java.io.IOException;
import java.io.OutputStream;

/**
 * A dummy implementation of H264 RBSP output stream
 *
 * @author Stanislav Vitvitskiy
 */
public class BitstreamWriter {public static class __CLR4_5_2fg6fg6lvlulnbq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,20051,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final OutputStream os;
    private int[] curByte = new int[8];
    private int curBit;

    public BitstreamWriter(OutputStream out) {try{__CLR4_5_2fg6fg6lvlulnbq.R.inc(20022);
        __CLR4_5_2fg6fg6lvlulnbq.R.inc(20023);this.os = out;
    }finally{__CLR4_5_2fg6fg6lvlulnbq.R.flushNeeded();}}

    /*
     * (non-Javadoc)
     * 
     * @see ua.org.jplayer.javcodec.h264.H264BitOutputStream#flush()
     */
    public void flush() throws IOException {try{__CLR4_5_2fg6fg6lvlulnbq.R.inc(20024);
        __CLR4_5_2fg6fg6lvlulnbq.R.inc(20025);for (int i = curBit; (((i < 8)&&(__CLR4_5_2fg6fg6lvlulnbq.R.iget(20026)!=0|true))||(__CLR4_5_2fg6fg6lvlulnbq.R.iget(20027)==0&false)); i++) {{
            __CLR4_5_2fg6fg6lvlulnbq.R.inc(20028);curByte[i] = 0;
        }
        }__CLR4_5_2fg6fg6lvlulnbq.R.inc(20029);curBit = 0;
        __CLR4_5_2fg6fg6lvlulnbq.R.inc(20030);writeCurByte();
    }finally{__CLR4_5_2fg6fg6lvlulnbq.R.flushNeeded();}}

    private void writeCurByte() throws IOException {try{__CLR4_5_2fg6fg6lvlulnbq.R.inc(20031);
        __CLR4_5_2fg6fg6lvlulnbq.R.inc(20032);int toWrite = (curByte[0] << 7) | (curByte[1] << 6) | (curByte[2] << 5)
                | (curByte[3] << 4) | (curByte[4] << 3) | (curByte[5] << 2)
                | (curByte[6] << 1) | curByte[7];
        __CLR4_5_2fg6fg6lvlulnbq.R.inc(20033);os.write(toWrite);
    }finally{__CLR4_5_2fg6fg6lvlulnbq.R.flushNeeded();}}

    /*
     * (non-Javadoc)
     * 
     * @see ua.org.jplayer.javcodec.h264.H264BitOutputStream#write1Bit(int)
     */
    public void write1Bit(int value) throws IOException {try{__CLR4_5_2fg6fg6lvlulnbq.R.inc(20034);
        __CLR4_5_2fg6fg6lvlulnbq.R.inc(20035);Debug.print(value);
        __CLR4_5_2fg6fg6lvlulnbq.R.inc(20036);if ((((curBit == 8)&&(__CLR4_5_2fg6fg6lvlulnbq.R.iget(20037)!=0|true))||(__CLR4_5_2fg6fg6lvlulnbq.R.iget(20038)==0&false))) {{
            __CLR4_5_2fg6fg6lvlulnbq.R.inc(20039);curBit = 0;
            __CLR4_5_2fg6fg6lvlulnbq.R.inc(20040);writeCurByte();
        }
        }__CLR4_5_2fg6fg6lvlulnbq.R.inc(20041);curByte[curBit++] = value;
    }finally{__CLR4_5_2fg6fg6lvlulnbq.R.flushNeeded();}}

    /*
     * (non-Javadoc)
     * 
     * @see ua.org.jplayer.javcodec.h264.H264BitOutputStream#writeNBit(long,
     * int)
     */
    public void writeNBit(long value, int n) throws IOException {try{__CLR4_5_2fg6fg6lvlulnbq.R.inc(20042);
        __CLR4_5_2fg6fg6lvlulnbq.R.inc(20043);for (int i = 0; (((i < n)&&(__CLR4_5_2fg6fg6lvlulnbq.R.iget(20044)!=0|true))||(__CLR4_5_2fg6fg6lvlulnbq.R.iget(20045)==0&false)); i++) {{
            __CLR4_5_2fg6fg6lvlulnbq.R.inc(20046);write1Bit((int) (value >> (n - i - 1)) & 0x1);
        }
    }}finally{__CLR4_5_2fg6fg6lvlulnbq.R.flushNeeded();}}

    /*
     * (non-Javadoc)
     * 
     * @see
     * ua.org.jplayer.javcodec.h264.H264BitOutputStream#writeRemainingZero()
     */
    public void writeRemainingZero() throws IOException {try{__CLR4_5_2fg6fg6lvlulnbq.R.inc(20047);
        __CLR4_5_2fg6fg6lvlulnbq.R.inc(20048);writeNBit(0, 8 - curBit);
    }finally{__CLR4_5_2fg6fg6lvlulnbq.R.flushNeeded();}}

    /*
     * (non-Javadoc)
     * 
     * @see ua.org.jplayer.javcodec.h264.H264BitOutputStream#writeByte(int)
     */
    public void writeByte(int b) throws IOException {try{__CLR4_5_2fg6fg6lvlulnbq.R.inc(20049);
        __CLR4_5_2fg6fg6lvlulnbq.R.inc(20050);os.write(b);

    }finally{__CLR4_5_2fg6fg6lvlulnbq.R.flushNeeded();}}
}