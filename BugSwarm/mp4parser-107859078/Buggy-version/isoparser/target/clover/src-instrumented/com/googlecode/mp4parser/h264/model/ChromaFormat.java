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
package com.googlecode.mp4parser.h264.model;

/**
 * Chroma format enum
 *
 * @author Stanislav Vitvitskiy
 */
public class ChromaFormat {public static class __CLR4_5_2emdemdlvl9ekqp{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,18979,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static ChromaFormat MONOCHROME = new ChromaFormat(0, 0, 0);
    public static ChromaFormat YUV_420 = new ChromaFormat(1, 2, 2);
    public static ChromaFormat YUV_422 = new ChromaFormat(2, 2, 1);
    public static ChromaFormat YUV_444 = new ChromaFormat(3, 1, 1);

    private int id;
    private int subWidth;
    private int subHeight;

    public ChromaFormat(int id, int subWidth, int subHeight) {try{__CLR4_5_2emdemdlvl9ekqp.R.inc(18949);
        __CLR4_5_2emdemdlvl9ekqp.R.inc(18950);this.id = id;
        __CLR4_5_2emdemdlvl9ekqp.R.inc(18951);this.subWidth = subWidth;
        __CLR4_5_2emdemdlvl9ekqp.R.inc(18952);this.subHeight = subHeight;
    }finally{__CLR4_5_2emdemdlvl9ekqp.R.flushNeeded();}}

    public static ChromaFormat fromId(int id) {try{__CLR4_5_2emdemdlvl9ekqp.R.inc(18953);
        __CLR4_5_2emdemdlvl9ekqp.R.inc(18954);if ((((id == MONOCHROME.id)&&(__CLR4_5_2emdemdlvl9ekqp.R.iget(18955)!=0|true))||(__CLR4_5_2emdemdlvl9ekqp.R.iget(18956)==0&false))) {{
            __CLR4_5_2emdemdlvl9ekqp.R.inc(18957);return MONOCHROME;
        } }else {__CLR4_5_2emdemdlvl9ekqp.R.inc(18958);if ((((id == YUV_420.id)&&(__CLR4_5_2emdemdlvl9ekqp.R.iget(18959)!=0|true))||(__CLR4_5_2emdemdlvl9ekqp.R.iget(18960)==0&false))) {{
            __CLR4_5_2emdemdlvl9ekqp.R.inc(18961);return YUV_420;
        } }else {__CLR4_5_2emdemdlvl9ekqp.R.inc(18962);if ((((id == YUV_422.id)&&(__CLR4_5_2emdemdlvl9ekqp.R.iget(18963)!=0|true))||(__CLR4_5_2emdemdlvl9ekqp.R.iget(18964)==0&false))) {{
            __CLR4_5_2emdemdlvl9ekqp.R.inc(18965);return YUV_422;
        } }else {__CLR4_5_2emdemdlvl9ekqp.R.inc(18966);if ((((id == YUV_444.id)&&(__CLR4_5_2emdemdlvl9ekqp.R.iget(18967)!=0|true))||(__CLR4_5_2emdemdlvl9ekqp.R.iget(18968)==0&false))) {{
            __CLR4_5_2emdemdlvl9ekqp.R.inc(18969);return YUV_444;
        }
        }}}}__CLR4_5_2emdemdlvl9ekqp.R.inc(18970);return null;
    }finally{__CLR4_5_2emdemdlvl9ekqp.R.flushNeeded();}}

    public int getId() {try{__CLR4_5_2emdemdlvl9ekqp.R.inc(18971);
        __CLR4_5_2emdemdlvl9ekqp.R.inc(18972);return id;
    }finally{__CLR4_5_2emdemdlvl9ekqp.R.flushNeeded();}}

    public int getSubWidth() {try{__CLR4_5_2emdemdlvl9ekqp.R.inc(18973);
        __CLR4_5_2emdemdlvl9ekqp.R.inc(18974);return subWidth;
    }finally{__CLR4_5_2emdemdlvl9ekqp.R.flushNeeded();}}

    public int getSubHeight() {try{__CLR4_5_2emdemdlvl9ekqp.R.inc(18975);
        __CLR4_5_2emdemdlvl9ekqp.R.inc(18976);return subHeight;
    }finally{__CLR4_5_2emdemdlvl9ekqp.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_5_2emdemdlvl9ekqp.R.inc(18977);
        __CLR4_5_2emdemdlvl9ekqp.R.inc(18978);return "ChromaFormat{" + "\n" +
                "id=" + id + ",\n" +
                " subWidth=" + subWidth + ",\n" +
                " subHeight=" + subHeight +
                '}';
    }finally{__CLR4_5_2emdemdlvl9ekqp.R.flushNeeded();}}
}
