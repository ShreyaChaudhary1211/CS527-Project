/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.googlecode.mp4parser.authoring.tracks;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
* Removes NAL Unit emulation_prevention_three_byte.
*/
public class CleanInputStream extends FilterInputStream {public static class __CLR4_5_275g75glvl9ei8r{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,9314,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    int prevprev = -1;
    int prev = -1;

    public CleanInputStream(InputStream in) {
        super(in);__CLR4_5_275g75glvl9ei8r.R.inc(9269);try{__CLR4_5_275g75glvl9ei8r.R.inc(9268);
    }finally{__CLR4_5_275g75glvl9ei8r.R.flushNeeded();}}

    public boolean markSupported() {try{__CLR4_5_275g75glvl9ei8r.R.inc(9270);
        __CLR4_5_275g75glvl9ei8r.R.inc(9271);return false;
    }finally{__CLR4_5_275g75glvl9ei8r.R.flushNeeded();}}

    public int read() throws IOException {try{__CLR4_5_275g75glvl9ei8r.R.inc(9272);
        __CLR4_5_275g75glvl9ei8r.R.inc(9273);int c = super.read();
        __CLR4_5_275g75glvl9ei8r.R.inc(9274);if ((((c == 3 && prevprev == 0 && prev == 0)&&(__CLR4_5_275g75glvl9ei8r.R.iget(9275)!=0|true))||(__CLR4_5_275g75glvl9ei8r.R.iget(9276)==0&false))) {{
            // discard this character
            __CLR4_5_275g75glvl9ei8r.R.inc(9277);prevprev = -1;
            __CLR4_5_275g75glvl9ei8r.R.inc(9278);prev = -1;
            __CLR4_5_275g75glvl9ei8r.R.inc(9279);c = super.read();
        }
        }__CLR4_5_275g75glvl9ei8r.R.inc(9280);prevprev = prev;
        __CLR4_5_275g75glvl9ei8r.R.inc(9281);prev = c;
        __CLR4_5_275g75glvl9ei8r.R.inc(9282);return c;
    }finally{__CLR4_5_275g75glvl9ei8r.R.flushNeeded();}}

    /**
     * Copy of InputStream.read(b, off, len)
     *
     * @see java.io.InputStream#read()
     */
    public int read(byte b[], int off, int len) throws IOException {try{__CLR4_5_275g75glvl9ei8r.R.inc(9283);
        __CLR4_5_275g75glvl9ei8r.R.inc(9284);if ((((b == null)&&(__CLR4_5_275g75glvl9ei8r.R.iget(9285)!=0|true))||(__CLR4_5_275g75glvl9ei8r.R.iget(9286)==0&false))) {{
            __CLR4_5_275g75glvl9ei8r.R.inc(9287);throw new NullPointerException();
        } }else {__CLR4_5_275g75glvl9ei8r.R.inc(9288);if ((((off < 0 || len < 0 || len > b.length - off)&&(__CLR4_5_275g75glvl9ei8r.R.iget(9289)!=0|true))||(__CLR4_5_275g75glvl9ei8r.R.iget(9290)==0&false))) {{
            __CLR4_5_275g75glvl9ei8r.R.inc(9291);throw new IndexOutOfBoundsException();
        } }else {__CLR4_5_275g75glvl9ei8r.R.inc(9292);if ((((len == 0)&&(__CLR4_5_275g75glvl9ei8r.R.iget(9293)!=0|true))||(__CLR4_5_275g75glvl9ei8r.R.iget(9294)==0&false))) {{
            __CLR4_5_275g75glvl9ei8r.R.inc(9295);return 0;
        }

        }}}__CLR4_5_275g75glvl9ei8r.R.inc(9296);int c = read();
        __CLR4_5_275g75glvl9ei8r.R.inc(9297);if ((((c == -1)&&(__CLR4_5_275g75glvl9ei8r.R.iget(9298)!=0|true))||(__CLR4_5_275g75glvl9ei8r.R.iget(9299)==0&false))) {{
            __CLR4_5_275g75glvl9ei8r.R.inc(9300);return -1;
        }
        }__CLR4_5_275g75glvl9ei8r.R.inc(9301);b[off] = (byte) c;

        __CLR4_5_275g75glvl9ei8r.R.inc(9302);int i = 1;
        __CLR4_5_275g75glvl9ei8r.R.inc(9303);try {
            __CLR4_5_275g75glvl9ei8r.R.inc(9304);for (; (((i < len)&&(__CLR4_5_275g75glvl9ei8r.R.iget(9305)!=0|true))||(__CLR4_5_275g75glvl9ei8r.R.iget(9306)==0&false)); i++) {{
                __CLR4_5_275g75glvl9ei8r.R.inc(9307);c = read();
                __CLR4_5_275g75glvl9ei8r.R.inc(9308);if ((((c == -1)&&(__CLR4_5_275g75glvl9ei8r.R.iget(9309)!=0|true))||(__CLR4_5_275g75glvl9ei8r.R.iget(9310)==0&false))) {{
                    __CLR4_5_275g75glvl9ei8r.R.inc(9311);break;
                }
                }__CLR4_5_275g75glvl9ei8r.R.inc(9312);b[off + i] = (byte) c;
            }
        }} catch (IOException ee) {
        }
        __CLR4_5_275g75glvl9ei8r.R.inc(9313);return i;
    }finally{__CLR4_5_275g75glvl9ei8r.R.flushNeeded();}}

}
