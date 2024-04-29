/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/*
Extracted from commons-codec
 */
package com.coremedia.iso;

import java.io.ByteArrayOutputStream;

/**
 * Converts hexadecimal Strings.
 */
public class Hex {public static class __CLR4_5_22k2klvl9ee3q{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,117,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final char[] DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static String encodeHex(byte[] data) {try{__CLR4_5_22k2klvl9ee3q.R.inc(92);
        __CLR4_5_22k2klvl9ee3q.R.inc(93);return encodeHex(data, 0);
    }finally{__CLR4_5_22k2klvl9ee3q.R.flushNeeded();}}

    public static String encodeHex(byte[] data, int group) {try{__CLR4_5_22k2klvl9ee3q.R.inc(94);
        __CLR4_5_22k2klvl9ee3q.R.inc(95);int l = data.length;
        __CLR4_5_22k2klvl9ee3q.R.inc(96);char[] out = new char[(l << 1) + ((((group > 0 )&&(__CLR4_5_22k2klvl9ee3q.R.iget(97)!=0|true))||(__CLR4_5_22k2klvl9ee3q.R.iget(98)==0&false))? (l / group) : 0)];
        // two characters form the hex value.
        __CLR4_5_22k2klvl9ee3q.R.inc(99);for (int i = 0, j = 0; (((i < l)&&(__CLR4_5_22k2klvl9ee3q.R.iget(100)!=0|true))||(__CLR4_5_22k2klvl9ee3q.R.iget(101)==0&false)); i++) {{
            __CLR4_5_22k2klvl9ee3q.R.inc(102);if (((((group > 0) && ((i % group) == 0) && j > 0)&&(__CLR4_5_22k2klvl9ee3q.R.iget(103)!=0|true))||(__CLR4_5_22k2klvl9ee3q.R.iget(104)==0&false))) {{
                __CLR4_5_22k2klvl9ee3q.R.inc(105);out[j++] = '-';
            }

            }__CLR4_5_22k2klvl9ee3q.R.inc(106);out[j++] = DIGITS[(0xF0 & data[i]) >>> 4];
            __CLR4_5_22k2klvl9ee3q.R.inc(107);out[j++] = DIGITS[0x0F & data[i]];
        }
        }__CLR4_5_22k2klvl9ee3q.R.inc(108);return new String(out);
    }finally{__CLR4_5_22k2klvl9ee3q.R.flushNeeded();}}

    public static byte[] decodeHex(String hexString) {try{__CLR4_5_22k2klvl9ee3q.R.inc(109);
        __CLR4_5_22k2klvl9ee3q.R.inc(110);ByteArrayOutputStream bas = new ByteArrayOutputStream();
        __CLR4_5_22k2klvl9ee3q.R.inc(111);for (int i = 0; (((i < hexString.length())&&(__CLR4_5_22k2klvl9ee3q.R.iget(112)!=0|true))||(__CLR4_5_22k2klvl9ee3q.R.iget(113)==0&false)); i += 2) {{
            __CLR4_5_22k2klvl9ee3q.R.inc(114);int b = Integer.parseInt(hexString.substring(i, i + 2), 16);
            __CLR4_5_22k2klvl9ee3q.R.inc(115);bas.write(b);
        }
        }__CLR4_5_22k2klvl9ee3q.R.inc(116);return bas.toByteArray();
    }finally{__CLR4_5_22k2klvl9ee3q.R.flushNeeded();}}
}
