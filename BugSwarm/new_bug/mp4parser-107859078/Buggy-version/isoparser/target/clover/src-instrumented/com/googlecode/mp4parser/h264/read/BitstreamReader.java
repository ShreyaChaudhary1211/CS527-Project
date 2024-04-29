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
package com.googlecode.mp4parser.h264.read;

import com.googlecode.mp4parser.h264.CharCache;

import java.io.IOException;
import java.io.InputStream;

/**
 * A dummy implementation of H264 RBSP reading
 *
 * @author Stanislav Vitvitskiy
 */
public class BitstreamReader {public static class __CLR4_5_2f82f82lvl9eku6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,19824,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private InputStream is;
    private int curByte;
    private int nextByte;
    int nBit;
    protected static int bitsRead;

    protected CharCache debugBits = new CharCache(50);

    public BitstreamReader(InputStream is) throws IOException {try{__CLR4_5_2f82f82lvl9eku6.R.inc(19730);
        __CLR4_5_2f82f82lvl9eku6.R.inc(19731);this.is = is;
        __CLR4_5_2f82f82lvl9eku6.R.inc(19732);curByte = is.read();
        __CLR4_5_2f82f82lvl9eku6.R.inc(19733);nextByte = is.read();
    }finally{__CLR4_5_2f82f82lvl9eku6.R.flushNeeded();}}

    public boolean readBool() throws IOException {try{__CLR4_5_2f82f82lvl9eku6.R.inc(19734);
        __CLR4_5_2f82f82lvl9eku6.R.inc(19735);return read1Bit() == 1;
    }finally{__CLR4_5_2f82f82lvl9eku6.R.flushNeeded();}}

    /*
      * (non-Javadoc)
      *
      * @see ua.org.jplayer.javcodec.h264.RBSPInputStream#read1Bit()
      */
    public int read1Bit() throws IOException {try{__CLR4_5_2f82f82lvl9eku6.R.inc(19736);
        __CLR4_5_2f82f82lvl9eku6.R.inc(19737);if ((((nBit == 8)&&(__CLR4_5_2f82f82lvl9eku6.R.iget(19738)!=0|true))||(__CLR4_5_2f82f82lvl9eku6.R.iget(19739)==0&false))) {{
            __CLR4_5_2f82f82lvl9eku6.R.inc(19740);advance();
            __CLR4_5_2f82f82lvl9eku6.R.inc(19741);if ((((curByte == -1)&&(__CLR4_5_2f82f82lvl9eku6.R.iget(19742)!=0|true))||(__CLR4_5_2f82f82lvl9eku6.R.iget(19743)==0&false))) {{
                __CLR4_5_2f82f82lvl9eku6.R.inc(19744);return -1;
            }
        }}
        }__CLR4_5_2f82f82lvl9eku6.R.inc(19745);int res = (curByte >> (7 - nBit)) & 1;
        __CLR4_5_2f82f82lvl9eku6.R.inc(19746);nBit++;

        __CLR4_5_2f82f82lvl9eku6.R.inc(19747);debugBits.append((((res == 0 )&&(__CLR4_5_2f82f82lvl9eku6.R.iget(19748)!=0|true))||(__CLR4_5_2f82f82lvl9eku6.R.iget(19749)==0&false))? '0' : '1');
        __CLR4_5_2f82f82lvl9eku6.R.inc(19750);++bitsRead;

        __CLR4_5_2f82f82lvl9eku6.R.inc(19751);return res;
    }finally{__CLR4_5_2f82f82lvl9eku6.R.flushNeeded();}}

    /*
      * (non-Javadoc)
      *
      * @see ua.org.jplayer.javcodec.h264.RBSPInputStream#readNBit(int)
      */
    public long readNBit(int n) throws IOException {try{__CLR4_5_2f82f82lvl9eku6.R.inc(19752);
        __CLR4_5_2f82f82lvl9eku6.R.inc(19753);if ((((n > 64)&&(__CLR4_5_2f82f82lvl9eku6.R.iget(19754)!=0|true))||(__CLR4_5_2f82f82lvl9eku6.R.iget(19755)==0&false)))
            {__CLR4_5_2f82f82lvl9eku6.R.inc(19756);throw new IllegalArgumentException("Can not readByte more then 64 bit");

        }__CLR4_5_2f82f82lvl9eku6.R.inc(19757);long val = 0;

        __CLR4_5_2f82f82lvl9eku6.R.inc(19758);for (int i = 0; (((i < n)&&(__CLR4_5_2f82f82lvl9eku6.R.iget(19759)!=0|true))||(__CLR4_5_2f82f82lvl9eku6.R.iget(19760)==0&false)); i++) {{
            __CLR4_5_2f82f82lvl9eku6.R.inc(19761);val <<= 1;
            __CLR4_5_2f82f82lvl9eku6.R.inc(19762);val |= read1Bit();
        }

        }__CLR4_5_2f82f82lvl9eku6.R.inc(19763);return val;
    }finally{__CLR4_5_2f82f82lvl9eku6.R.flushNeeded();}}

    private void advance() throws IOException {try{__CLR4_5_2f82f82lvl9eku6.R.inc(19764);
        __CLR4_5_2f82f82lvl9eku6.R.inc(19765);curByte = nextByte;
        __CLR4_5_2f82f82lvl9eku6.R.inc(19766);nextByte = is.read();
        __CLR4_5_2f82f82lvl9eku6.R.inc(19767);nBit = 0;
    }finally{__CLR4_5_2f82f82lvl9eku6.R.flushNeeded();}}

    /*
      * (non-Javadoc)
      *
      * @see ua.org.jplayer.javcodec.h264.RBSPInputStream#readByte()
      */
    public int readByte() throws IOException {try{__CLR4_5_2f82f82lvl9eku6.R.inc(19768);
        __CLR4_5_2f82f82lvl9eku6.R.inc(19769);if ((((nBit > 0)&&(__CLR4_5_2f82f82lvl9eku6.R.iget(19770)!=0|true))||(__CLR4_5_2f82f82lvl9eku6.R.iget(19771)==0&false))) {{
            __CLR4_5_2f82f82lvl9eku6.R.inc(19772);advance();
        }

        }__CLR4_5_2f82f82lvl9eku6.R.inc(19773);int res = curByte;

        __CLR4_5_2f82f82lvl9eku6.R.inc(19774);advance();

        __CLR4_5_2f82f82lvl9eku6.R.inc(19775);return res;
    }finally{__CLR4_5_2f82f82lvl9eku6.R.flushNeeded();}}

    /*
      * (non-Javadoc)
      *
      * @see ua.org.jplayer.javcodec.h264.RBSPInputStream#moreRBSPData()
      */
    public boolean moreRBSPData() throws IOException {try{__CLR4_5_2f82f82lvl9eku6.R.inc(19776);
        __CLR4_5_2f82f82lvl9eku6.R.inc(19777);if ((((nBit == 8)&&(__CLR4_5_2f82f82lvl9eku6.R.iget(19778)!=0|true))||(__CLR4_5_2f82f82lvl9eku6.R.iget(19779)==0&false))) {{
            __CLR4_5_2f82f82lvl9eku6.R.inc(19780);advance();
        }
        }__CLR4_5_2f82f82lvl9eku6.R.inc(19781);int tail = 1 << (8 - nBit - 1);
        __CLR4_5_2f82f82lvl9eku6.R.inc(19782);int mask = ((tail << 1) - 1);
        __CLR4_5_2f82f82lvl9eku6.R.inc(19783);boolean hasTail = (curByte & mask) == tail;

        __CLR4_5_2f82f82lvl9eku6.R.inc(19784);return !(curByte == -1 || (nextByte == -1 && hasTail));
    }finally{__CLR4_5_2f82f82lvl9eku6.R.flushNeeded();}}

    public long getBitPosition() {try{__CLR4_5_2f82f82lvl9eku6.R.inc(19785);
        __CLR4_5_2f82f82lvl9eku6.R.inc(19786);return (bitsRead * 8 + (nBit % 8));
    }finally{__CLR4_5_2f82f82lvl9eku6.R.flushNeeded();}}

    /*
      * (non-Javadoc)
      *
      * @see ua.org.jplayer.javcodec.h264.RBSPInputStream#readRemainingByte()
      */
    public long readRemainingByte() throws IOException {try{__CLR4_5_2f82f82lvl9eku6.R.inc(19787);
        __CLR4_5_2f82f82lvl9eku6.R.inc(19788);return readNBit(8 - nBit);
    }finally{__CLR4_5_2f82f82lvl9eku6.R.flushNeeded();}}

    /*
      * (non-Javadoc)
      *
      * @see ua.org.jplayer.javcodec.h264.RBSPInputStream#next_bits(int)
      */
    public int peakNextBits(int n) throws IOException {try{__CLR4_5_2f82f82lvl9eku6.R.inc(19789);
        __CLR4_5_2f82f82lvl9eku6.R.inc(19790);if ((((n > 8)&&(__CLR4_5_2f82f82lvl9eku6.R.iget(19791)!=0|true))||(__CLR4_5_2f82f82lvl9eku6.R.iget(19792)==0&false)))
            {__CLR4_5_2f82f82lvl9eku6.R.inc(19793);throw new IllegalArgumentException("N should be less then 8");
        }__CLR4_5_2f82f82lvl9eku6.R.inc(19794);if ((((nBit == 8)&&(__CLR4_5_2f82f82lvl9eku6.R.iget(19795)!=0|true))||(__CLR4_5_2f82f82lvl9eku6.R.iget(19796)==0&false))) {{
            __CLR4_5_2f82f82lvl9eku6.R.inc(19797);advance();
            __CLR4_5_2f82f82lvl9eku6.R.inc(19798);if ((((curByte == -1)&&(__CLR4_5_2f82f82lvl9eku6.R.iget(19799)!=0|true))||(__CLR4_5_2f82f82lvl9eku6.R.iget(19800)==0&false))) {{
                __CLR4_5_2f82f82lvl9eku6.R.inc(19801);return -1;
            }
        }}
        }__CLR4_5_2f82f82lvl9eku6.R.inc(19802);int[] bits = new int[16 - nBit];

        __CLR4_5_2f82f82lvl9eku6.R.inc(19803);int cnt = 0;
        __CLR4_5_2f82f82lvl9eku6.R.inc(19804);for (int i = nBit; (((i < 8)&&(__CLR4_5_2f82f82lvl9eku6.R.iget(19805)!=0|true))||(__CLR4_5_2f82f82lvl9eku6.R.iget(19806)==0&false)); i++) {{
            __CLR4_5_2f82f82lvl9eku6.R.inc(19807);bits[cnt++] = (curByte >> (7 - i)) & 0x1;
        }

        }__CLR4_5_2f82f82lvl9eku6.R.inc(19808);for (int i = 0; (((i < 8)&&(__CLR4_5_2f82f82lvl9eku6.R.iget(19809)!=0|true))||(__CLR4_5_2f82f82lvl9eku6.R.iget(19810)==0&false)); i++) {{
            __CLR4_5_2f82f82lvl9eku6.R.inc(19811);bits[cnt++] = (nextByte >> (7 - i)) & 0x1;
        }

        }__CLR4_5_2f82f82lvl9eku6.R.inc(19812);int result = 0;
        __CLR4_5_2f82f82lvl9eku6.R.inc(19813);for (int i = 0; (((i < n)&&(__CLR4_5_2f82f82lvl9eku6.R.iget(19814)!=0|true))||(__CLR4_5_2f82f82lvl9eku6.R.iget(19815)==0&false)); i++) {{
            __CLR4_5_2f82f82lvl9eku6.R.inc(19816);result <<= 1;
            __CLR4_5_2f82f82lvl9eku6.R.inc(19817);result |= bits[i];
        }

        }__CLR4_5_2f82f82lvl9eku6.R.inc(19818);return result;
    }finally{__CLR4_5_2f82f82lvl9eku6.R.flushNeeded();}}

    /*
      * (non-Javadoc)
      *
      * @see ua.org.jplayer.javcodec.h264.RBSPInputStream#byte_aligned()
      */
    public boolean isByteAligned() {try{__CLR4_5_2f82f82lvl9eku6.R.inc(19819);
        __CLR4_5_2f82f82lvl9eku6.R.inc(19820);return (nBit % 8) == 0;
    }finally{__CLR4_5_2f82f82lvl9eku6.R.flushNeeded();}}

    /*
      * (non-Javadoc)
      *
      * @see ua.org.jplayer.javcodec.h264.RBSPInputStream#close()
      */
    public void close() throws IOException {try{__CLR4_5_2f82f82lvl9eku6.R.inc(19821);
    }finally{__CLR4_5_2f82f82lvl9eku6.R.flushNeeded();}}

    public int getCurBit() {try{__CLR4_5_2f82f82lvl9eku6.R.inc(19822);
        __CLR4_5_2f82f82lvl9eku6.R.inc(19823);return nBit;
    }finally{__CLR4_5_2f82f82lvl9eku6.R.flushNeeded();}}
}