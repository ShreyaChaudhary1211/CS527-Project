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
package org.apache.commons.lang3.text.translate;

import java.io.IOException;
import java.io.Writer;

/**
 * Translate escaped octal Strings back to their octal values.
 *
 * For example, "\45" should go back to being the specific value (a %).
 *
 * Note that this currently only supports the viable range of octal for Java; namely 
 * 1 to 377. This is because parsing Java is the main use case.
 * 
 * @since 3.0
 * @deprecated as of 3.6, use commons-text
 * <a href="https://commons.apache.org/proper/commons-text/javadocs/api-release/org/apache/commons/text/translate/OctalUnescaper.html">
 * OctalUnescaper</a> instead
 */
@Deprecated
public class OctalUnescaper extends CharSequenceTranslator {public static class __CLR4_5_2gisgislvha7c7q{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172755542L,8589935092L,21437,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * {@inheritDoc}
     */
    @Override
    public int translate(final CharSequence input, final int index, final Writer out) throws IOException {try{__CLR4_5_2gisgislvha7c7q.R.inc(21412);
        __CLR4_5_2gisgislvha7c7q.R.inc(21413);final int remaining = input.length() - index - 1; // how many characters left, ignoring the first \
        __CLR4_5_2gisgislvha7c7q.R.inc(21414);final StringBuilder builder = new StringBuilder();
        __CLR4_5_2gisgislvha7c7q.R.inc(21415);if((((input.charAt(index) == '\\' && remaining > 0 && isOctalDigit(input.charAt(index + 1)) )&&(__CLR4_5_2gisgislvha7c7q.R.iget(21416)!=0|true))||(__CLR4_5_2gisgislvha7c7q.R.iget(21417)==0&false))) {{
            __CLR4_5_2gisgislvha7c7q.R.inc(21418);final int next = index + 1;
            __CLR4_5_2gisgislvha7c7q.R.inc(21419);final int next2 = index + 2;
            __CLR4_5_2gisgislvha7c7q.R.inc(21420);final int next3 = index + 3;

            // we know this is good as we checked it in the if block above
            __CLR4_5_2gisgislvha7c7q.R.inc(21421);builder.append(input.charAt(next));

            __CLR4_5_2gisgislvha7c7q.R.inc(21422);if((((remaining > 1 && isOctalDigit(input.charAt(next2)))&&(__CLR4_5_2gisgislvha7c7q.R.iget(21423)!=0|true))||(__CLR4_5_2gisgislvha7c7q.R.iget(21424)==0&false))) {{
                __CLR4_5_2gisgislvha7c7q.R.inc(21425);builder.append(input.charAt(next2));
                __CLR4_5_2gisgislvha7c7q.R.inc(21426);if((((remaining > 2 && isZeroToThree(input.charAt(next)) && isOctalDigit(input.charAt(next3)))&&(__CLR4_5_2gisgislvha7c7q.R.iget(21427)!=0|true))||(__CLR4_5_2gisgislvha7c7q.R.iget(21428)==0&false))) {{
                    __CLR4_5_2gisgislvha7c7q.R.inc(21429);builder.append(input.charAt(next3));
                }
            }}

            }__CLR4_5_2gisgislvha7c7q.R.inc(21430);out.write( Integer.parseInt(builder.toString(), 8) );
            __CLR4_5_2gisgislvha7c7q.R.inc(21431);return 1 + builder.length();
        }
        }__CLR4_5_2gisgislvha7c7q.R.inc(21432);return 0;
    }finally{__CLR4_5_2gisgislvha7c7q.R.flushNeeded();}}

    /**
     * Checks if the given char is an octal digit. Octal digits are the character representations of the digits 0 to 7.
     * @param ch the char to check
     * @return true if the given char is the character representation of one of the digits from 0 to 7
     */
    private boolean isOctalDigit(final char ch) {try{__CLR4_5_2gisgislvha7c7q.R.inc(21433);
        __CLR4_5_2gisgislvha7c7q.R.inc(21434);return ch >= '0' && ch <= '7';
    }finally{__CLR4_5_2gisgislvha7c7q.R.flushNeeded();}}

    /**
     * Checks if the given char is the character representation of one of the digit from 0 to 3.
     * @param ch the char to check
     * @return true if the given char is the character representation of one of the digits from 0 to 3
     */
    private boolean isZeroToThree(final char ch) {try{__CLR4_5_2gisgislvha7c7q.R.inc(21435);
        __CLR4_5_2gisgislvha7c7q.R.inc(21436);return ch >= '0' && ch <= '3';
    }finally{__CLR4_5_2gisgislvha7c7q.R.flushNeeded();}}
}
