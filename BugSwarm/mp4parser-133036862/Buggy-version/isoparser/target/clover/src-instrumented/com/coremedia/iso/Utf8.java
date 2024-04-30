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

import java.io.UnsupportedEncodingException;

/**
 * Converts <code>byte[]</code> -&gt; <code>String</code> and vice versa.
 */
public final class Utf8 {public static class __CLR4_5_2dedelvlulawl{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,506,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static byte[] convert(String s) {try{__CLR4_5_2dedelvlulawl.R.inc(482);
        __CLR4_5_2dedelvlulawl.R.inc(483);try {
            __CLR4_5_2dedelvlulawl.R.inc(484);if ((((s != null)&&(__CLR4_5_2dedelvlulawl.R.iget(485)!=0|true))||(__CLR4_5_2dedelvlulawl.R.iget(486)==0&false))) {{
                __CLR4_5_2dedelvlulawl.R.inc(487);return s.getBytes("UTF-8");
            } }else {{
                __CLR4_5_2dedelvlulawl.R.inc(488);return null;
            }
        }} catch (UnsupportedEncodingException e) {
            __CLR4_5_2dedelvlulawl.R.inc(489);throw new Error(e);
        }
    }finally{__CLR4_5_2dedelvlulawl.R.flushNeeded();}}

    public static String convert(byte[] b) {try{__CLR4_5_2dedelvlulawl.R.inc(490);
        __CLR4_5_2dedelvlulawl.R.inc(491);try {
            __CLR4_5_2dedelvlulawl.R.inc(492);if ((((b != null)&&(__CLR4_5_2dedelvlulawl.R.iget(493)!=0|true))||(__CLR4_5_2dedelvlulawl.R.iget(494)==0&false))) {{
                __CLR4_5_2dedelvlulawl.R.inc(495);return new String(b, "UTF-8");
            } }else {{
                __CLR4_5_2dedelvlulawl.R.inc(496);return null;
            }
        }} catch (UnsupportedEncodingException e) {
            __CLR4_5_2dedelvlulawl.R.inc(497);throw new Error(e);
        }
    }finally{__CLR4_5_2dedelvlulawl.R.flushNeeded();}}

    public static int utf8StringLengthInBytes(String utf8) {try{__CLR4_5_2dedelvlulawl.R.inc(498);
        __CLR4_5_2dedelvlulawl.R.inc(499);try {
            __CLR4_5_2dedelvlulawl.R.inc(500);if ((((utf8 != null)&&(__CLR4_5_2dedelvlulawl.R.iget(501)!=0|true))||(__CLR4_5_2dedelvlulawl.R.iget(502)==0&false))) {{
                __CLR4_5_2dedelvlulawl.R.inc(503);return utf8.getBytes("UTF-8").length;
            } }else {{
                __CLR4_5_2dedelvlulawl.R.inc(504);return 0;
            }
        }} catch (UnsupportedEncodingException e) {
            __CLR4_5_2dedelvlulawl.R.inc(505);throw new RuntimeException();
        }
    }finally{__CLR4_5_2dedelvlulawl.R.flushNeeded();}}
}
