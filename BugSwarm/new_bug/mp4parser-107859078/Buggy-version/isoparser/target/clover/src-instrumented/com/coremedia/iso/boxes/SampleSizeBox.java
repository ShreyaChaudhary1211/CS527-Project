/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*  
 * Copyright 2008 CoreMedia AG, Hamburg
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

package com.coremedia.iso.boxes;


import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractFullBox;

import java.nio.ByteBuffer;

import static com.googlecode.mp4parser.util.CastUtils.l2i;

/**
 * <h1>4cc = "{@value #TYPE}"</h1>
 * This box containes the sample count and a table giving the size in bytes of each sample.
 * Defined in ISO/IEC 14496-12.
 */
public class SampleSizeBox extends AbstractFullBox {public static class __CLR4_5_21mq1mqlvl9ef5h{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,2164,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private long sampleSize;
    private long[] sampleSizes = new long[0];
    public static final String TYPE = "stsz";
    int sampleCount;

    public SampleSizeBox() {
        super(TYPE);__CLR4_5_21mq1mqlvl9ef5h.R.inc(2115);try{__CLR4_5_21mq1mqlvl9ef5h.R.inc(2114);
    }finally{__CLR4_5_21mq1mqlvl9ef5h.R.flushNeeded();}}

    /**
     * Returns the field sample size.
     * If sampleSize &gt; 0 every sample has the same size.
     * If sampleSize == 0 the samples have different size as stated in the sampleSizes field.
     *
     * @return the sampleSize field
     */
    public long getSampleSize() {try{__CLR4_5_21mq1mqlvl9ef5h.R.inc(2116);
        __CLR4_5_21mq1mqlvl9ef5h.R.inc(2117);return sampleSize;
    }finally{__CLR4_5_21mq1mqlvl9ef5h.R.flushNeeded();}}

    public void setSampleSize(long sampleSize) {try{__CLR4_5_21mq1mqlvl9ef5h.R.inc(2118);
        __CLR4_5_21mq1mqlvl9ef5h.R.inc(2119);this.sampleSize = sampleSize;
    }finally{__CLR4_5_21mq1mqlvl9ef5h.R.flushNeeded();}}


    public long getSampleSizeAtIndex(int index) {try{__CLR4_5_21mq1mqlvl9ef5h.R.inc(2120);
        __CLR4_5_21mq1mqlvl9ef5h.R.inc(2121);if ((((sampleSize > 0)&&(__CLR4_5_21mq1mqlvl9ef5h.R.iget(2122)!=0|true))||(__CLR4_5_21mq1mqlvl9ef5h.R.iget(2123)==0&false))) {{
            __CLR4_5_21mq1mqlvl9ef5h.R.inc(2124);return sampleSize;
        } }else {{
            __CLR4_5_21mq1mqlvl9ef5h.R.inc(2125);return sampleSizes[index];
        }
    }}finally{__CLR4_5_21mq1mqlvl9ef5h.R.flushNeeded();}}

    public long getSampleCount() {try{__CLR4_5_21mq1mqlvl9ef5h.R.inc(2126);
        __CLR4_5_21mq1mqlvl9ef5h.R.inc(2127);if ((((sampleSize > 0)&&(__CLR4_5_21mq1mqlvl9ef5h.R.iget(2128)!=0|true))||(__CLR4_5_21mq1mqlvl9ef5h.R.iget(2129)==0&false))) {{
            __CLR4_5_21mq1mqlvl9ef5h.R.inc(2130);return sampleCount;
        } }else {{
            __CLR4_5_21mq1mqlvl9ef5h.R.inc(2131);return sampleSizes.length;
        }

    }}finally{__CLR4_5_21mq1mqlvl9ef5h.R.flushNeeded();}}

    public long[] getSampleSizes() {try{__CLR4_5_21mq1mqlvl9ef5h.R.inc(2132);
        __CLR4_5_21mq1mqlvl9ef5h.R.inc(2133);return sampleSizes;
    }finally{__CLR4_5_21mq1mqlvl9ef5h.R.flushNeeded();}}

    public void setSampleSizes(long[] sampleSizes) {try{__CLR4_5_21mq1mqlvl9ef5h.R.inc(2134);
        __CLR4_5_21mq1mqlvl9ef5h.R.inc(2135);this.sampleSizes = sampleSizes;
    }finally{__CLR4_5_21mq1mqlvl9ef5h.R.flushNeeded();}}

    protected long getContentSize() {try{__CLR4_5_21mq1mqlvl9ef5h.R.inc(2136);
        __CLR4_5_21mq1mqlvl9ef5h.R.inc(2137);return 12 + ((((sampleSize == 0 )&&(__CLR4_5_21mq1mqlvl9ef5h.R.iget(2138)!=0|true))||(__CLR4_5_21mq1mqlvl9ef5h.R.iget(2139)==0&false))? sampleSizes.length * 4 : 0);
    }finally{__CLR4_5_21mq1mqlvl9ef5h.R.flushNeeded();}}

    @Override
    public void _parseDetails(ByteBuffer content) {try{__CLR4_5_21mq1mqlvl9ef5h.R.inc(2140);
        __CLR4_5_21mq1mqlvl9ef5h.R.inc(2141);parseVersionAndFlags(content);
        __CLR4_5_21mq1mqlvl9ef5h.R.inc(2142);sampleSize = IsoTypeReader.readUInt32(content);
        __CLR4_5_21mq1mqlvl9ef5h.R.inc(2143);sampleCount = l2i(IsoTypeReader.readUInt32(content));

        __CLR4_5_21mq1mqlvl9ef5h.R.inc(2144);if ((((sampleSize == 0)&&(__CLR4_5_21mq1mqlvl9ef5h.R.iget(2145)!=0|true))||(__CLR4_5_21mq1mqlvl9ef5h.R.iget(2146)==0&false))) {{
            __CLR4_5_21mq1mqlvl9ef5h.R.inc(2147);sampleSizes = new long[(int) sampleCount];

            __CLR4_5_21mq1mqlvl9ef5h.R.inc(2148);for (int i = 0; (((i < sampleCount)&&(__CLR4_5_21mq1mqlvl9ef5h.R.iget(2149)!=0|true))||(__CLR4_5_21mq1mqlvl9ef5h.R.iget(2150)==0&false)); i++) {{
                __CLR4_5_21mq1mqlvl9ef5h.R.inc(2151);sampleSizes[i] = IsoTypeReader.readUInt32(content);
            }
        }}
    }}finally{__CLR4_5_21mq1mqlvl9ef5h.R.flushNeeded();}}

    @Override
    protected void getContent(ByteBuffer byteBuffer) {try{__CLR4_5_21mq1mqlvl9ef5h.R.inc(2152);
        __CLR4_5_21mq1mqlvl9ef5h.R.inc(2153);writeVersionAndFlags(byteBuffer);
        __CLR4_5_21mq1mqlvl9ef5h.R.inc(2154);IsoTypeWriter.writeUInt32(byteBuffer, sampleSize);

        __CLR4_5_21mq1mqlvl9ef5h.R.inc(2155);if ((((sampleSize == 0)&&(__CLR4_5_21mq1mqlvl9ef5h.R.iget(2156)!=0|true))||(__CLR4_5_21mq1mqlvl9ef5h.R.iget(2157)==0&false))) {{
            __CLR4_5_21mq1mqlvl9ef5h.R.inc(2158);IsoTypeWriter.writeUInt32(byteBuffer, sampleSizes.length);
            __CLR4_5_21mq1mqlvl9ef5h.R.inc(2159);for (long sampleSize1 : sampleSizes) {{
                __CLR4_5_21mq1mqlvl9ef5h.R.inc(2160);IsoTypeWriter.writeUInt32(byteBuffer, sampleSize1);
            }
        }} }else {{
            __CLR4_5_21mq1mqlvl9ef5h.R.inc(2161);IsoTypeWriter.writeUInt32(byteBuffer, sampleCount);
        }

    }}finally{__CLR4_5_21mq1mqlvl9ef5h.R.flushNeeded();}}

    public String toString() {try{__CLR4_5_21mq1mqlvl9ef5h.R.inc(2162);
        __CLR4_5_21mq1mqlvl9ef5h.R.inc(2163);return "SampleSizeBox[sampleSize=" + getSampleSize() + ";sampleCount=" + getSampleCount() + "]";
    }finally{__CLR4_5_21mq1mqlvl9ef5h.R.flushNeeded();}}
}
