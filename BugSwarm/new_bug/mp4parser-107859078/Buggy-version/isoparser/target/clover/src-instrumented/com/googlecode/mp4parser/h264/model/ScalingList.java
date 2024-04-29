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

import com.googlecode.mp4parser.h264.read.CAVLCReader;
import com.googlecode.mp4parser.h264.write.CAVLCWriter;

import java.io.IOException;

/**
 * Scaling list entity
 * <p>
 * capable to serialize / deserialize with CAVLC bitstream</p>
 *
 * @author Stanislav Vitvitskiy
 */
public class ScalingList {public static class __CLR4_5_2ewuewulvl9eksm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,19364,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public int[] scalingList;
    public boolean useDefaultScalingMatrixFlag;

    public void write(CAVLCWriter out) throws IOException {try{__CLR4_5_2ewuewulvl9eksm.R.inc(19326);
        __CLR4_5_2ewuewulvl9eksm.R.inc(19327);if ((((useDefaultScalingMatrixFlag)&&(__CLR4_5_2ewuewulvl9eksm.R.iget(19328)!=0|true))||(__CLR4_5_2ewuewulvl9eksm.R.iget(19329)==0&false))) {{
            __CLR4_5_2ewuewulvl9eksm.R.inc(19330);out.writeSE(0, "SPS: ");
            __CLR4_5_2ewuewulvl9eksm.R.inc(19331);return;
        }

        }__CLR4_5_2ewuewulvl9eksm.R.inc(19332);int lastScale = 8;
        __CLR4_5_2ewuewulvl9eksm.R.inc(19333);int nextScale = 8;
        __CLR4_5_2ewuewulvl9eksm.R.inc(19334);for (int j = 0; (((j < scalingList.length)&&(__CLR4_5_2ewuewulvl9eksm.R.iget(19335)!=0|true))||(__CLR4_5_2ewuewulvl9eksm.R.iget(19336)==0&false)); j++) {{
            __CLR4_5_2ewuewulvl9eksm.R.inc(19337);if ((((nextScale != 0)&&(__CLR4_5_2ewuewulvl9eksm.R.iget(19338)!=0|true))||(__CLR4_5_2ewuewulvl9eksm.R.iget(19339)==0&false))) {{
                __CLR4_5_2ewuewulvl9eksm.R.inc(19340);int deltaScale = scalingList[j] - lastScale - 256;
                __CLR4_5_2ewuewulvl9eksm.R.inc(19341);out.writeSE(deltaScale, "SPS: ");
            }
            }__CLR4_5_2ewuewulvl9eksm.R.inc(19342);lastScale = scalingList[j];
        }
    }}finally{__CLR4_5_2ewuewulvl9eksm.R.flushNeeded();}}

    public static ScalingList read(CAVLCReader is, int sizeOfScalingList)
            throws IOException {try{__CLR4_5_2ewuewulvl9eksm.R.inc(19343);

        __CLR4_5_2ewuewulvl9eksm.R.inc(19344);ScalingList sl = new ScalingList();
        __CLR4_5_2ewuewulvl9eksm.R.inc(19345);sl.scalingList = new int[sizeOfScalingList];
        __CLR4_5_2ewuewulvl9eksm.R.inc(19346);int lastScale = 8;
        __CLR4_5_2ewuewulvl9eksm.R.inc(19347);int nextScale = 8;
        __CLR4_5_2ewuewulvl9eksm.R.inc(19348);for (int j = 0; (((j < sizeOfScalingList)&&(__CLR4_5_2ewuewulvl9eksm.R.iget(19349)!=0|true))||(__CLR4_5_2ewuewulvl9eksm.R.iget(19350)==0&false)); j++) {{
            __CLR4_5_2ewuewulvl9eksm.R.inc(19351);if ((((nextScale != 0)&&(__CLR4_5_2ewuewulvl9eksm.R.iget(19352)!=0|true))||(__CLR4_5_2ewuewulvl9eksm.R.iget(19353)==0&false))) {{
                __CLR4_5_2ewuewulvl9eksm.R.inc(19354);int deltaScale = is.readSE("deltaScale");
                __CLR4_5_2ewuewulvl9eksm.R.inc(19355);nextScale = (lastScale + deltaScale + 256) % 256;
                __CLR4_5_2ewuewulvl9eksm.R.inc(19356);sl.useDefaultScalingMatrixFlag = (j == 0 && nextScale == 0);
            }
            }__CLR4_5_2ewuewulvl9eksm.R.inc(19357);sl.scalingList[j] = (((nextScale == 0 )&&(__CLR4_5_2ewuewulvl9eksm.R.iget(19358)!=0|true))||(__CLR4_5_2ewuewulvl9eksm.R.iget(19359)==0&false))? lastScale : nextScale;
            __CLR4_5_2ewuewulvl9eksm.R.inc(19360);lastScale = sl.scalingList[j];
        }
        }__CLR4_5_2ewuewulvl9eksm.R.inc(19361);return sl;
    }finally{__CLR4_5_2ewuewulvl9eksm.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_5_2ewuewulvl9eksm.R.inc(19362);
        __CLR4_5_2ewuewulvl9eksm.R.inc(19363);return "ScalingList{" +
                "scalingList=" + scalingList +
                ", useDefaultScalingMatrixFlag=" + useDefaultScalingMatrixFlag +
                '}';
    }finally{__CLR4_5_2ewuewulvl9eksm.R.flushNeeded();}}
}