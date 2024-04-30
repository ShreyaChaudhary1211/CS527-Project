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


import com.googlecode.mp4parser.h264.BTree;

import java.io.IOException;
import java.io.InputStream;

import static com.googlecode.mp4parser.h264.Debug.println;


public class CAVLCReader extends BitstreamReader {public static class __CLR4_5_2fdbfdblvlulnbd{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,20022,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public CAVLCReader(InputStream is) throws IOException {
        super(is);__CLR4_5_2fdbfdblvlulnbd.R.inc(19920);try{__CLR4_5_2fdbfdblvlulnbd.R.inc(19919);
    }finally{__CLR4_5_2fdbfdblvlulnbd.R.flushNeeded();}}

    public long readNBit(int n, String message) throws IOException {try{__CLR4_5_2fdbfdblvlulnbd.R.inc(19921);
        __CLR4_5_2fdbfdblvlulnbd.R.inc(19922);long val = readNBit(n);

        __CLR4_5_2fdbfdblvlulnbd.R.inc(19923);trace(message, String.valueOf(val));

        __CLR4_5_2fdbfdblvlulnbd.R.inc(19924);return val;
    }finally{__CLR4_5_2fdbfdblvlulnbd.R.flushNeeded();}}

    /**
     * Read unsigned exp-golomb code
     *
     * @return
     * @throws java.io.IOException
     * @throws java.io.IOException
     */
    private int readUE() throws IOException {try{__CLR4_5_2fdbfdblvlulnbd.R.inc(19925);
        __CLR4_5_2fdbfdblvlulnbd.R.inc(19926);int cnt = 0;
        __CLR4_5_2fdbfdblvlulnbd.R.inc(19927);while ((((read1Bit() == 0)&&(__CLR4_5_2fdbfdblvlulnbd.R.iget(19928)!=0|true))||(__CLR4_5_2fdbfdblvlulnbd.R.iget(19929)==0&false)))
            {__CLR4_5_2fdbfdblvlulnbd.R.inc(19930);cnt++;

        }__CLR4_5_2fdbfdblvlulnbd.R.inc(19931);int res = 0;
        __CLR4_5_2fdbfdblvlulnbd.R.inc(19932);if ((((cnt > 0)&&(__CLR4_5_2fdbfdblvlulnbd.R.iget(19933)!=0|true))||(__CLR4_5_2fdbfdblvlulnbd.R.iget(19934)==0&false))) {{
            __CLR4_5_2fdbfdblvlulnbd.R.inc(19935);long val = readNBit(cnt);

            __CLR4_5_2fdbfdblvlulnbd.R.inc(19936);res = (int) ((1 << cnt) - 1 + val);
        }

        }__CLR4_5_2fdbfdblvlulnbd.R.inc(19937);return res;
    }finally{__CLR4_5_2fdbfdblvlulnbd.R.flushNeeded();}}

    /*
      * (non-Javadoc)
      *
      * @see
      * ua.org.jplayer.javcodec.h264.H264BitInputStream#readUE(java.lang.String)
      */
    public int readUE(String message) throws IOException {try{__CLR4_5_2fdbfdblvlulnbd.R.inc(19938);
        __CLR4_5_2fdbfdblvlulnbd.R.inc(19939);int res = readUE();

        __CLR4_5_2fdbfdblvlulnbd.R.inc(19940);trace(message, String.valueOf(res));

        __CLR4_5_2fdbfdblvlulnbd.R.inc(19941);return res;
    }finally{__CLR4_5_2fdbfdblvlulnbd.R.flushNeeded();}}

    public int readSE(String message) throws IOException {try{__CLR4_5_2fdbfdblvlulnbd.R.inc(19942);
        __CLR4_5_2fdbfdblvlulnbd.R.inc(19943);int val = readUE();

        __CLR4_5_2fdbfdblvlulnbd.R.inc(19944);int sign = ((val & 0x1) << 1) - 1;
        __CLR4_5_2fdbfdblvlulnbd.R.inc(19945);val = ((val >> 1) + (val & 0x1)) * sign;

        __CLR4_5_2fdbfdblvlulnbd.R.inc(19946);trace(message, String.valueOf(val));

        __CLR4_5_2fdbfdblvlulnbd.R.inc(19947);return val;
    }finally{__CLR4_5_2fdbfdblvlulnbd.R.flushNeeded();}}

    public boolean readBool(String message) throws IOException {try{__CLR4_5_2fdbfdblvlulnbd.R.inc(19948);

        __CLR4_5_2fdbfdblvlulnbd.R.inc(19949);boolean res = (((read1Bit() == 0 )&&(__CLR4_5_2fdbfdblvlulnbd.R.iget(19950)!=0|true))||(__CLR4_5_2fdbfdblvlulnbd.R.iget(19951)==0&false))? false : true;

        __CLR4_5_2fdbfdblvlulnbd.R.inc(19952);trace(message, (((res )&&(__CLR4_5_2fdbfdblvlulnbd.R.iget(19953)!=0|true))||(__CLR4_5_2fdbfdblvlulnbd.R.iget(19954)==0&false))? "1" : "0");

        __CLR4_5_2fdbfdblvlulnbd.R.inc(19955);return res;
    }finally{__CLR4_5_2fdbfdblvlulnbd.R.flushNeeded();}}

    public int readU(int i, String string) throws IOException {try{__CLR4_5_2fdbfdblvlulnbd.R.inc(19956);
        __CLR4_5_2fdbfdblvlulnbd.R.inc(19957);return (int) readNBit(i, string);
    }finally{__CLR4_5_2fdbfdblvlulnbd.R.flushNeeded();}}

    public byte[] read(int payloadSize) throws IOException {try{__CLR4_5_2fdbfdblvlulnbd.R.inc(19958);
        __CLR4_5_2fdbfdblvlulnbd.R.inc(19959);byte[] result = new byte[payloadSize];
        __CLR4_5_2fdbfdblvlulnbd.R.inc(19960);for (int i = 0; (((i < payloadSize)&&(__CLR4_5_2fdbfdblvlulnbd.R.iget(19961)!=0|true))||(__CLR4_5_2fdbfdblvlulnbd.R.iget(19962)==0&false)); i++) {{
            __CLR4_5_2fdbfdblvlulnbd.R.inc(19963);result[i] = (byte) readByte();
        }
        }__CLR4_5_2fdbfdblvlulnbd.R.inc(19964);return result;
    }finally{__CLR4_5_2fdbfdblvlulnbd.R.flushNeeded();}}

    public boolean readAE() {try{__CLR4_5_2fdbfdblvlulnbd.R.inc(19965);
        // TODO: do it!!
        __CLR4_5_2fdbfdblvlulnbd.R.inc(19966);throw new UnsupportedOperationException("Stan");
    }finally{__CLR4_5_2fdbfdblvlulnbd.R.flushNeeded();}}

    public int readTE(int max) throws IOException {try{__CLR4_5_2fdbfdblvlulnbd.R.inc(19967);
        __CLR4_5_2fdbfdblvlulnbd.R.inc(19968);if ((((max > 1)&&(__CLR4_5_2fdbfdblvlulnbd.R.iget(19969)!=0|true))||(__CLR4_5_2fdbfdblvlulnbd.R.iget(19970)==0&false)))
            {__CLR4_5_2fdbfdblvlulnbd.R.inc(19971);return readUE();
        }__CLR4_5_2fdbfdblvlulnbd.R.inc(19972);return ~read1Bit() & 0x1;
    }finally{__CLR4_5_2fdbfdblvlulnbd.R.flushNeeded();}}

    public int readAEI() {try{__CLR4_5_2fdbfdblvlulnbd.R.inc(19973);
        // TODO: do it!!
        __CLR4_5_2fdbfdblvlulnbd.R.inc(19974);throw new UnsupportedOperationException("Stan");
    }finally{__CLR4_5_2fdbfdblvlulnbd.R.flushNeeded();}}

    public int readME(String string) throws IOException {try{__CLR4_5_2fdbfdblvlulnbd.R.inc(19975);
        __CLR4_5_2fdbfdblvlulnbd.R.inc(19976);return readUE(string);
    }finally{__CLR4_5_2fdbfdblvlulnbd.R.flushNeeded();}}

    public Object readCE(BTree bt, String message) throws IOException {try{__CLR4_5_2fdbfdblvlulnbd.R.inc(19977);
        __CLR4_5_2fdbfdblvlulnbd.R.inc(19978);while (true) {{
            __CLR4_5_2fdbfdblvlulnbd.R.inc(19979);int bit = read1Bit();
            __CLR4_5_2fdbfdblvlulnbd.R.inc(19980);bt = bt.down(bit);
            __CLR4_5_2fdbfdblvlulnbd.R.inc(19981);if ((((bt == null)&&(__CLR4_5_2fdbfdblvlulnbd.R.iget(19982)!=0|true))||(__CLR4_5_2fdbfdblvlulnbd.R.iget(19983)==0&false))) {{
                __CLR4_5_2fdbfdblvlulnbd.R.inc(19984);throw new RuntimeException("Illegal code");
            }
            }__CLR4_5_2fdbfdblvlulnbd.R.inc(19985);Object i = bt.getValue();
            __CLR4_5_2fdbfdblvlulnbd.R.inc(19986);if ((((i != null)&&(__CLR4_5_2fdbfdblvlulnbd.R.iget(19987)!=0|true))||(__CLR4_5_2fdbfdblvlulnbd.R.iget(19988)==0&false))) {{
                __CLR4_5_2fdbfdblvlulnbd.R.inc(19989);trace(message, i.toString());
                __CLR4_5_2fdbfdblvlulnbd.R.inc(19990);return i;
            }
        }}
    }}finally{__CLR4_5_2fdbfdblvlulnbd.R.flushNeeded();}}

    public int readZeroBitCount(String message) throws IOException {try{__CLR4_5_2fdbfdblvlulnbd.R.inc(19991);
        __CLR4_5_2fdbfdblvlulnbd.R.inc(19992);int count = 0;
        __CLR4_5_2fdbfdblvlulnbd.R.inc(19993);while ((((read1Bit() == 0)&&(__CLR4_5_2fdbfdblvlulnbd.R.iget(19994)!=0|true))||(__CLR4_5_2fdbfdblvlulnbd.R.iget(19995)==0&false)))
            {__CLR4_5_2fdbfdblvlulnbd.R.inc(19996);count++;

        }__CLR4_5_2fdbfdblvlulnbd.R.inc(19997);trace(message, String.valueOf(count));

        __CLR4_5_2fdbfdblvlulnbd.R.inc(19998);return count;
    }finally{__CLR4_5_2fdbfdblvlulnbd.R.flushNeeded();}}

    public void readTrailingBits() throws IOException {try{__CLR4_5_2fdbfdblvlulnbd.R.inc(19999);
        __CLR4_5_2fdbfdblvlulnbd.R.inc(20000);read1Bit();
        __CLR4_5_2fdbfdblvlulnbd.R.inc(20001);readRemainingByte();
    }finally{__CLR4_5_2fdbfdblvlulnbd.R.flushNeeded();}}

    private void trace(String message, String val) {try{__CLR4_5_2fdbfdblvlulnbd.R.inc(20002);
        __CLR4_5_2fdbfdblvlulnbd.R.inc(20003);StringBuilder traceBuilder = new StringBuilder();
        __CLR4_5_2fdbfdblvlulnbd.R.inc(20004);int spaces;
        __CLR4_5_2fdbfdblvlulnbd.R.inc(20005);String pos = String.valueOf(bitsRead - debugBits.length());
        __CLR4_5_2fdbfdblvlulnbd.R.inc(20006);spaces = 8 - pos.length();

        __CLR4_5_2fdbfdblvlulnbd.R.inc(20007);traceBuilder.append("@" + pos);

        __CLR4_5_2fdbfdblvlulnbd.R.inc(20008);for (int i = 0; (((i < spaces)&&(__CLR4_5_2fdbfdblvlulnbd.R.iget(20009)!=0|true))||(__CLR4_5_2fdbfdblvlulnbd.R.iget(20010)==0&false)); i++)
            {__CLR4_5_2fdbfdblvlulnbd.R.inc(20011);traceBuilder.append(' ');

        }__CLR4_5_2fdbfdblvlulnbd.R.inc(20012);traceBuilder.append(message);
        __CLR4_5_2fdbfdblvlulnbd.R.inc(20013);spaces = 100 - traceBuilder.length() - debugBits.length();
        __CLR4_5_2fdbfdblvlulnbd.R.inc(20014);for (int i = 0; (((i < spaces)&&(__CLR4_5_2fdbfdblvlulnbd.R.iget(20015)!=0|true))||(__CLR4_5_2fdbfdblvlulnbd.R.iget(20016)==0&false)); i++)
            {__CLR4_5_2fdbfdblvlulnbd.R.inc(20017);traceBuilder.append(' ');
        }__CLR4_5_2fdbfdblvlulnbd.R.inc(20018);traceBuilder.append(debugBits);
        __CLR4_5_2fdbfdblvlulnbd.R.inc(20019);traceBuilder.append(" (" + val + ")");
        __CLR4_5_2fdbfdblvlulnbd.R.inc(20020);debugBits.clear();

        __CLR4_5_2fdbfdblvlulnbd.R.inc(20021);println(traceBuilder.toString());
    }finally{__CLR4_5_2fdbfdblvlulnbd.R.flushNeeded();}}
}