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
package com.googlecode.mp4parser.h264;

import java.nio.ShortBuffer;

public class Debug {public static class __CLR4_5_2ekcekclvl9ekq5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,18934,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public final static void print8x8(int[] output) {try{__CLR4_5_2ekcekclvl9ekq5.R.inc(18876);
        __CLR4_5_2ekcekclvl9ekq5.R.inc(18877);int i = 0;
        __CLR4_5_2ekcekclvl9ekq5.R.inc(18878);for (int x = 0; (((x < 8)&&(__CLR4_5_2ekcekclvl9ekq5.R.iget(18879)!=0|true))||(__CLR4_5_2ekcekclvl9ekq5.R.iget(18880)==0&false)); x++) {{
            __CLR4_5_2ekcekclvl9ekq5.R.inc(18881);for (int y = 0; (((y < 8)&&(__CLR4_5_2ekcekclvl9ekq5.R.iget(18882)!=0|true))||(__CLR4_5_2ekcekclvl9ekq5.R.iget(18883)==0&false)); y++) {{
                __CLR4_5_2ekcekclvl9ekq5.R.inc(18884);System.out.printf("%3d, ", output[i]);
                __CLR4_5_2ekcekclvl9ekq5.R.inc(18885);i++;
            }
            }__CLR4_5_2ekcekclvl9ekq5.R.inc(18886);System.out.println();
        }
    }}finally{__CLR4_5_2ekcekclvl9ekq5.R.flushNeeded();}}

    public final static void print8x8(short[] output) {try{__CLR4_5_2ekcekclvl9ekq5.R.inc(18887);
        __CLR4_5_2ekcekclvl9ekq5.R.inc(18888);int i = 0;
        __CLR4_5_2ekcekclvl9ekq5.R.inc(18889);for (int x = 0; (((x < 8)&&(__CLR4_5_2ekcekclvl9ekq5.R.iget(18890)!=0|true))||(__CLR4_5_2ekcekclvl9ekq5.R.iget(18891)==0&false)); x++) {{
            __CLR4_5_2ekcekclvl9ekq5.R.inc(18892);for (int y = 0; (((y < 8)&&(__CLR4_5_2ekcekclvl9ekq5.R.iget(18893)!=0|true))||(__CLR4_5_2ekcekclvl9ekq5.R.iget(18894)==0&false)); y++) {{
                __CLR4_5_2ekcekclvl9ekq5.R.inc(18895);System.out.printf("%3d, ", output[i]);
                __CLR4_5_2ekcekclvl9ekq5.R.inc(18896);i++;
            }
            }__CLR4_5_2ekcekclvl9ekq5.R.inc(18897);System.out.println();
        }
    }}finally{__CLR4_5_2ekcekclvl9ekq5.R.flushNeeded();}}

    public final static void print8x8(ShortBuffer output) {try{__CLR4_5_2ekcekclvl9ekq5.R.inc(18898);
        __CLR4_5_2ekcekclvl9ekq5.R.inc(18899);for (int x = 0; (((x < 8)&&(__CLR4_5_2ekcekclvl9ekq5.R.iget(18900)!=0|true))||(__CLR4_5_2ekcekclvl9ekq5.R.iget(18901)==0&false)); x++) {{
            __CLR4_5_2ekcekclvl9ekq5.R.inc(18902);for (int y = 0; (((y < 8)&&(__CLR4_5_2ekcekclvl9ekq5.R.iget(18903)!=0|true))||(__CLR4_5_2ekcekclvl9ekq5.R.iget(18904)==0&false)); y++) {{
                __CLR4_5_2ekcekclvl9ekq5.R.inc(18905);System.out.printf("%3d, ", output.get());
            }
            }__CLR4_5_2ekcekclvl9ekq5.R.inc(18906);System.out.println();
        }
    }}finally{__CLR4_5_2ekcekclvl9ekq5.R.flushNeeded();}}

    public static void print(short[] table) {try{__CLR4_5_2ekcekclvl9ekq5.R.inc(18907);
        __CLR4_5_2ekcekclvl9ekq5.R.inc(18908);int i = 0;
        __CLR4_5_2ekcekclvl9ekq5.R.inc(18909);for (int x = 0; (((x < 8)&&(__CLR4_5_2ekcekclvl9ekq5.R.iget(18910)!=0|true))||(__CLR4_5_2ekcekclvl9ekq5.R.iget(18911)==0&false)); x++) {{
            __CLR4_5_2ekcekclvl9ekq5.R.inc(18912);for (int y = 0; (((y < 8)&&(__CLR4_5_2ekcekclvl9ekq5.R.iget(18913)!=0|true))||(__CLR4_5_2ekcekclvl9ekq5.R.iget(18914)==0&false)); y++) {{
                __CLR4_5_2ekcekclvl9ekq5.R.inc(18915);System.out.printf("%3d, ", table[i]);
                __CLR4_5_2ekcekclvl9ekq5.R.inc(18916);i++;
            }
            }__CLR4_5_2ekcekclvl9ekq5.R.inc(18917);System.out.println();
        }
    }}finally{__CLR4_5_2ekcekclvl9ekq5.R.flushNeeded();}}

    public static void trace(String format, Object... args) {try{__CLR4_5_2ekcekclvl9ekq5.R.inc(18918);
        // System.out.printf("> " + format + "\n", args);
    }finally{__CLR4_5_2ekcekclvl9ekq5.R.flushNeeded();}}

    public final static boolean debug = false;

    public static void print(int i) {try{__CLR4_5_2ekcekclvl9ekq5.R.inc(18919);
        __CLR4_5_2ekcekclvl9ekq5.R.inc(18920);if ((((debug)&&(__CLR4_5_2ekcekclvl9ekq5.R.iget(18921)!=0|true))||(__CLR4_5_2ekcekclvl9ekq5.R.iget(18922)==0&false)))
            {__CLR4_5_2ekcekclvl9ekq5.R.inc(18923);System.out.print(i);
    }}finally{__CLR4_5_2ekcekclvl9ekq5.R.flushNeeded();}}

    public static void print(String string) {try{__CLR4_5_2ekcekclvl9ekq5.R.inc(18924);
        __CLR4_5_2ekcekclvl9ekq5.R.inc(18925);if ((((debug)&&(__CLR4_5_2ekcekclvl9ekq5.R.iget(18926)!=0|true))||(__CLR4_5_2ekcekclvl9ekq5.R.iget(18927)==0&false)))
            {__CLR4_5_2ekcekclvl9ekq5.R.inc(18928);System.out.print(string);
    }}finally{__CLR4_5_2ekcekclvl9ekq5.R.flushNeeded();}}

    public static void println(String string) {try{__CLR4_5_2ekcekclvl9ekq5.R.inc(18929);
        __CLR4_5_2ekcekclvl9ekq5.R.inc(18930);if ((((debug)&&(__CLR4_5_2ekcekclvl9ekq5.R.iget(18931)!=0|true))||(__CLR4_5_2ekcekclvl9ekq5.R.iget(18932)==0&false)))
            {__CLR4_5_2ekcekclvl9ekq5.R.inc(18933);System.out.println(string);
    }}finally{__CLR4_5_2ekcekclvl9ekq5.R.flushNeeded();}}
}
