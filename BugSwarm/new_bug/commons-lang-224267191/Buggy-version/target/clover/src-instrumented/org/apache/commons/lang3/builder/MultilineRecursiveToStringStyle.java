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

package org.apache.commons.lang3.builder;

import org.apache.commons.lang3.ClassUtils;

/**
 * <p>Works with {@link ToStringBuilder} to create a "deep" <code>toString</code>.
 * But instead a single line like the {@link RecursiveToStringStyle} this creates a multiline String 
 * similar to the {@link ToStringStyle#MULTI_LINE_STYLE}.</p>
 * 
 * <p>To use this class write code as follows:</p>
 *
 * <pre>
 * public class Job {
 *   String title;
 *   ...
 * }
 * 
 * public class Person {
 *   String name;
 *   int age;
 *   boolean smoker;
 *   Job job;
 * 
 *   ...
 * 
 *   public String toString() {
 *     return new ReflectionToStringBuilder(this, new MultilineRecursiveToStringStyle()).toString();
 *   }
 * }
 * </pre>
 *
 * <p>
 * This will produce a toString of the format:<br>
 * <code>Person@7f54[ <br>
 * &nbsp; name=Stephen, <br>
 * &nbsp; age=29, <br>
 * &nbsp; smoker=false, <br>
 * &nbsp; job=Job@43cd2[ <br>
 * &nbsp; &nbsp; title=Manager <br>
 * &nbsp;  ] <br>
 * ]
 * </code>
 * </p>
 * 
 * @since 3.4
 */
public class MultilineRecursiveToStringStyle extends RecursiveToStringStyle {public static class __CLR4_5_29im9imlvha7aar{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172755542L,8589935092L,12421,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Required for serialization support.
     * @see java.io.Serializable
     */
    private static final long serialVersionUID = 1L;

    /** Indenting of inner lines. */
    private static final int INDENT = 2;

    /** Current indenting. */
    private int spaces = 2;

    /**
     * Constructor.
     */
    public MultilineRecursiveToStringStyle() {
        super();__CLR4_5_29im9imlvha7aar.R.inc(12335);try{__CLR4_5_29im9imlvha7aar.R.inc(12334);
        __CLR4_5_29im9imlvha7aar.R.inc(12336);resetIndent();
    }finally{__CLR4_5_29im9imlvha7aar.R.flushNeeded();}}

    /**
     * Resets the fields responsible for the line breaks and indenting. 
     * Must be invoked after changing the {@link #spaces} value.
     */
    private void resetIndent() {try{__CLR4_5_29im9imlvha7aar.R.inc(12337);
        __CLR4_5_29im9imlvha7aar.R.inc(12338);setArrayStart("{" + System.lineSeparator() + spacer(spaces));
        __CLR4_5_29im9imlvha7aar.R.inc(12339);setArraySeparator("," + System.lineSeparator() + spacer(spaces));
        __CLR4_5_29im9imlvha7aar.R.inc(12340);setArrayEnd(System.lineSeparator() + spacer(spaces - INDENT) + "}");

        __CLR4_5_29im9imlvha7aar.R.inc(12341);setContentStart("[" + System.lineSeparator() + spacer(spaces));
        __CLR4_5_29im9imlvha7aar.R.inc(12342);setFieldSeparator("," + System.lineSeparator() + spacer(spaces));
        __CLR4_5_29im9imlvha7aar.R.inc(12343);setContentEnd(System.lineSeparator() + spacer(spaces - INDENT) + "]");
    }finally{__CLR4_5_29im9imlvha7aar.R.flushNeeded();}}

    /**
     * Creates a StringBuilder responsible for the indenting.
     * 
     * @param spaces how far to indent
     * @return a StringBuilder with {spaces} leading space characters.
     */
    private StringBuilder spacer(final int spaces) {try{__CLR4_5_29im9imlvha7aar.R.inc(12344);
        __CLR4_5_29im9imlvha7aar.R.inc(12345);final StringBuilder sb = new StringBuilder();
        __CLR4_5_29im9imlvha7aar.R.inc(12346);for (int i = 0; (((i < spaces)&&(__CLR4_5_29im9imlvha7aar.R.iget(12347)!=0|true))||(__CLR4_5_29im9imlvha7aar.R.iget(12348)==0&false)); i++) {{
            __CLR4_5_29im9imlvha7aar.R.inc(12349);sb.append(" ");
        }
        }__CLR4_5_29im9imlvha7aar.R.inc(12350);return sb;
    }finally{__CLR4_5_29im9imlvha7aar.R.flushNeeded();}}

    @Override
    public void appendDetail(final StringBuffer buffer, final String fieldName, final Object value) {try{__CLR4_5_29im9imlvha7aar.R.inc(12351);
        __CLR4_5_29im9imlvha7aar.R.inc(12352);if ((((!ClassUtils.isPrimitiveWrapper(value.getClass()) && !String.class.equals(value.getClass())
                && accept(value.getClass()))&&(__CLR4_5_29im9imlvha7aar.R.iget(12353)!=0|true))||(__CLR4_5_29im9imlvha7aar.R.iget(12354)==0&false))) {{
            __CLR4_5_29im9imlvha7aar.R.inc(12355);spaces += INDENT;
            __CLR4_5_29im9imlvha7aar.R.inc(12356);resetIndent();
            __CLR4_5_29im9imlvha7aar.R.inc(12357);buffer.append(ReflectionToStringBuilder.toString(value, this));
            __CLR4_5_29im9imlvha7aar.R.inc(12358);spaces -= INDENT;
            __CLR4_5_29im9imlvha7aar.R.inc(12359);resetIndent();
        } }else {{
            __CLR4_5_29im9imlvha7aar.R.inc(12360);super.appendDetail(buffer, fieldName, value);
        }
    }}finally{__CLR4_5_29im9imlvha7aar.R.flushNeeded();}}

    @Override
    protected void appendDetail(final StringBuffer buffer, final String fieldName, final Object[] array) {try{__CLR4_5_29im9imlvha7aar.R.inc(12361);
        __CLR4_5_29im9imlvha7aar.R.inc(12362);spaces += INDENT;
        __CLR4_5_29im9imlvha7aar.R.inc(12363);resetIndent();
        __CLR4_5_29im9imlvha7aar.R.inc(12364);super.appendDetail(buffer, fieldName, array);
        __CLR4_5_29im9imlvha7aar.R.inc(12365);spaces -= INDENT;
        __CLR4_5_29im9imlvha7aar.R.inc(12366);resetIndent();
    }finally{__CLR4_5_29im9imlvha7aar.R.flushNeeded();}}

    @Override
    protected void reflectionAppendArrayDetail(final StringBuffer buffer, final String fieldName, final Object array) {try{__CLR4_5_29im9imlvha7aar.R.inc(12367);
        __CLR4_5_29im9imlvha7aar.R.inc(12368);spaces += INDENT;
        __CLR4_5_29im9imlvha7aar.R.inc(12369);resetIndent();
        __CLR4_5_29im9imlvha7aar.R.inc(12370);super.appendDetail(buffer, fieldName, array);
        __CLR4_5_29im9imlvha7aar.R.inc(12371);spaces -= INDENT;
        __CLR4_5_29im9imlvha7aar.R.inc(12372);resetIndent();
    }finally{__CLR4_5_29im9imlvha7aar.R.flushNeeded();}}

    @Override
    protected void appendDetail(final StringBuffer buffer, final String fieldName, final long[] array) {try{__CLR4_5_29im9imlvha7aar.R.inc(12373);
        __CLR4_5_29im9imlvha7aar.R.inc(12374);spaces += INDENT;
        __CLR4_5_29im9imlvha7aar.R.inc(12375);resetIndent();
        __CLR4_5_29im9imlvha7aar.R.inc(12376);super.appendDetail(buffer, fieldName, array);
        __CLR4_5_29im9imlvha7aar.R.inc(12377);spaces -= INDENT;
        __CLR4_5_29im9imlvha7aar.R.inc(12378);resetIndent();
    }finally{__CLR4_5_29im9imlvha7aar.R.flushNeeded();}}

    @Override
    protected void appendDetail(final StringBuffer buffer, final String fieldName, final int[] array) {try{__CLR4_5_29im9imlvha7aar.R.inc(12379);
        __CLR4_5_29im9imlvha7aar.R.inc(12380);spaces += INDENT;
        __CLR4_5_29im9imlvha7aar.R.inc(12381);resetIndent();
        __CLR4_5_29im9imlvha7aar.R.inc(12382);super.appendDetail(buffer, fieldName, array);
        __CLR4_5_29im9imlvha7aar.R.inc(12383);spaces -= INDENT;
        __CLR4_5_29im9imlvha7aar.R.inc(12384);resetIndent();
    }finally{__CLR4_5_29im9imlvha7aar.R.flushNeeded();}}

    @Override
    protected void appendDetail(final StringBuffer buffer, final String fieldName, final short[] array) {try{__CLR4_5_29im9imlvha7aar.R.inc(12385);
        __CLR4_5_29im9imlvha7aar.R.inc(12386);spaces += INDENT;
        __CLR4_5_29im9imlvha7aar.R.inc(12387);resetIndent();
        __CLR4_5_29im9imlvha7aar.R.inc(12388);super.appendDetail(buffer, fieldName, array);
        __CLR4_5_29im9imlvha7aar.R.inc(12389);spaces -= INDENT;
        __CLR4_5_29im9imlvha7aar.R.inc(12390);resetIndent();
    }finally{__CLR4_5_29im9imlvha7aar.R.flushNeeded();}}

    @Override
    protected void appendDetail(final StringBuffer buffer, final String fieldName, final byte[] array) {try{__CLR4_5_29im9imlvha7aar.R.inc(12391);
        __CLR4_5_29im9imlvha7aar.R.inc(12392);spaces += INDENT;
        __CLR4_5_29im9imlvha7aar.R.inc(12393);resetIndent();
        __CLR4_5_29im9imlvha7aar.R.inc(12394);super.appendDetail(buffer, fieldName, array);
        __CLR4_5_29im9imlvha7aar.R.inc(12395);spaces -= INDENT;
        __CLR4_5_29im9imlvha7aar.R.inc(12396);resetIndent();
    }finally{__CLR4_5_29im9imlvha7aar.R.flushNeeded();}}

    @Override
    protected void appendDetail(final StringBuffer buffer, final String fieldName, final char[] array) {try{__CLR4_5_29im9imlvha7aar.R.inc(12397);
        __CLR4_5_29im9imlvha7aar.R.inc(12398);spaces += INDENT;
        __CLR4_5_29im9imlvha7aar.R.inc(12399);resetIndent();
        __CLR4_5_29im9imlvha7aar.R.inc(12400);super.appendDetail(buffer, fieldName, array);
        __CLR4_5_29im9imlvha7aar.R.inc(12401);spaces -= INDENT;
        __CLR4_5_29im9imlvha7aar.R.inc(12402);resetIndent();
    }finally{__CLR4_5_29im9imlvha7aar.R.flushNeeded();}}

    @Override
    protected void appendDetail(final StringBuffer buffer, final String fieldName, final double[] array) {try{__CLR4_5_29im9imlvha7aar.R.inc(12403);
        __CLR4_5_29im9imlvha7aar.R.inc(12404);spaces += INDENT;
        __CLR4_5_29im9imlvha7aar.R.inc(12405);resetIndent();
        __CLR4_5_29im9imlvha7aar.R.inc(12406);super.appendDetail(buffer, fieldName, array);
        __CLR4_5_29im9imlvha7aar.R.inc(12407);spaces -= INDENT;
        __CLR4_5_29im9imlvha7aar.R.inc(12408);resetIndent();
    }finally{__CLR4_5_29im9imlvha7aar.R.flushNeeded();}}

    @Override
    protected void appendDetail(final StringBuffer buffer, final String fieldName, final float[] array) {try{__CLR4_5_29im9imlvha7aar.R.inc(12409);
        __CLR4_5_29im9imlvha7aar.R.inc(12410);spaces += INDENT;
        __CLR4_5_29im9imlvha7aar.R.inc(12411);resetIndent();
        __CLR4_5_29im9imlvha7aar.R.inc(12412);super.appendDetail(buffer, fieldName, array);
        __CLR4_5_29im9imlvha7aar.R.inc(12413);spaces -= INDENT;
        __CLR4_5_29im9imlvha7aar.R.inc(12414);resetIndent();
    }finally{__CLR4_5_29im9imlvha7aar.R.flushNeeded();}}

    @Override
    protected void appendDetail(final StringBuffer buffer, final String fieldName, final boolean[] array) {try{__CLR4_5_29im9imlvha7aar.R.inc(12415);
        __CLR4_5_29im9imlvha7aar.R.inc(12416);spaces += INDENT;
        __CLR4_5_29im9imlvha7aar.R.inc(12417);resetIndent();
        __CLR4_5_29im9imlvha7aar.R.inc(12418);super.appendDetail(buffer, fieldName, array);
        __CLR4_5_29im9imlvha7aar.R.inc(12419);spaces -= INDENT;
        __CLR4_5_29im9imlvha7aar.R.inc(12420);resetIndent();
    }finally{__CLR4_5_29im9imlvha7aar.R.flushNeeded();}}

}
