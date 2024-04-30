/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.googlecode.mp4parser.authoring.tracks;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
* Removes NAL Unit emulation_prevention_three_byte.
*/
public class CleanInputStream extends FilterInputStream {public static class __CLR4_5_2783783lvlulhqf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,9409,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    int prevprev = -1;
    int prev = -1;

    public CleanInputStream(InputStream in) {
        super(in);__CLR4_5_2783783lvlulhqf.R.inc(9364);try{__CLR4_5_2783783lvlulhqf.R.inc(9363);
    }finally{__CLR4_5_2783783lvlulhqf.R.flushNeeded();}}

    public boolean markSupported() {try{__CLR4_5_2783783lvlulhqf.R.inc(9365);
        __CLR4_5_2783783lvlulhqf.R.inc(9366);return false;
    }finally{__CLR4_5_2783783lvlulhqf.R.flushNeeded();}}

    public int read() throws IOException {try{__CLR4_5_2783783lvlulhqf.R.inc(9367);
        __CLR4_5_2783783lvlulhqf.R.inc(9368);int c = super.read();
        __CLR4_5_2783783lvlulhqf.R.inc(9369);if ((((c == 3 && prevprev == 0 && prev == 0)&&(__CLR4_5_2783783lvlulhqf.R.iget(9370)!=0|true))||(__CLR4_5_2783783lvlulhqf.R.iget(9371)==0&false))) {{
            // discard this character
            __CLR4_5_2783783lvlulhqf.R.inc(9372);prevprev = -1;
            __CLR4_5_2783783lvlulhqf.R.inc(9373);prev = -1;
            __CLR4_5_2783783lvlulhqf.R.inc(9374);c = super.read();
        }
        }__CLR4_5_2783783lvlulhqf.R.inc(9375);prevprev = prev;
        __CLR4_5_2783783lvlulhqf.R.inc(9376);prev = c;
        __CLR4_5_2783783lvlulhqf.R.inc(9377);return c;
    }finally{__CLR4_5_2783783lvlulhqf.R.flushNeeded();}}

    /**
     * Copy of InputStream.read(b, off, len)
     *
     * @see java.io.InputStream#read()
     */
    public int read(byte b[], int off, int len) throws IOException {try{__CLR4_5_2783783lvlulhqf.R.inc(9378);
        __CLR4_5_2783783lvlulhqf.R.inc(9379);if ((((b == null)&&(__CLR4_5_2783783lvlulhqf.R.iget(9380)!=0|true))||(__CLR4_5_2783783lvlulhqf.R.iget(9381)==0&false))) {{
            __CLR4_5_2783783lvlulhqf.R.inc(9382);throw new NullPointerException();
        } }else {__CLR4_5_2783783lvlulhqf.R.inc(9383);if ((((off < 0 || len < 0 || len > b.length - off)&&(__CLR4_5_2783783lvlulhqf.R.iget(9384)!=0|true))||(__CLR4_5_2783783lvlulhqf.R.iget(9385)==0&false))) {{
            __CLR4_5_2783783lvlulhqf.R.inc(9386);throw new IndexOutOfBoundsException();
        } }else {__CLR4_5_2783783lvlulhqf.R.inc(9387);if ((((len == 0)&&(__CLR4_5_2783783lvlulhqf.R.iget(9388)!=0|true))||(__CLR4_5_2783783lvlulhqf.R.iget(9389)==0&false))) {{
            __CLR4_5_2783783lvlulhqf.R.inc(9390);return 0;
        }

        }}}__CLR4_5_2783783lvlulhqf.R.inc(9391);int c = read();
        __CLR4_5_2783783lvlulhqf.R.inc(9392);if ((((c == -1)&&(__CLR4_5_2783783lvlulhqf.R.iget(9393)!=0|true))||(__CLR4_5_2783783lvlulhqf.R.iget(9394)==0&false))) {{
            __CLR4_5_2783783lvlulhqf.R.inc(9395);return -1;
        }
        }__CLR4_5_2783783lvlulhqf.R.inc(9396);b[off] = (byte) c;

        __CLR4_5_2783783lvlulhqf.R.inc(9397);int i = 1;
        __CLR4_5_2783783lvlulhqf.R.inc(9398);try {
            __CLR4_5_2783783lvlulhqf.R.inc(9399);for (; (((i < len)&&(__CLR4_5_2783783lvlulhqf.R.iget(9400)!=0|true))||(__CLR4_5_2783783lvlulhqf.R.iget(9401)==0&false)); i++) {{
                __CLR4_5_2783783lvlulhqf.R.inc(9402);c = read();
                __CLR4_5_2783783lvlulhqf.R.inc(9403);if ((((c == -1)&&(__CLR4_5_2783783lvlulhqf.R.iget(9404)!=0|true))||(__CLR4_5_2783783lvlulhqf.R.iget(9405)==0&false))) {{
                    __CLR4_5_2783783lvlulhqf.R.inc(9406);break;
                }
                }__CLR4_5_2783783lvlulhqf.R.inc(9407);b[off + i] = (byte) c;
            }
        }} catch (IOException ee) {
        }
        __CLR4_5_2783783lvlulhqf.R.inc(9408);return i;
    }finally{__CLR4_5_2783783lvlulhqf.R.flushNeeded();}}

}
