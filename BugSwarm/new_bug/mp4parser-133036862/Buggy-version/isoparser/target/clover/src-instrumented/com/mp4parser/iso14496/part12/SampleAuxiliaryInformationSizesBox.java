/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2009 castLabs GmbH, Berlin
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

package com.mp4parser.iso14496.part12;

import com.coremedia.iso.IsoFile;
import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractFullBox;

import java.nio.ByteBuffer;
import java.util.Arrays;

import static com.googlecode.mp4parser.util.CastUtils.l2i;

/**
 * <h1>4cc = "{@value #TYPE}"</h1>
 */
public class SampleAuxiliaryInformationSizesBox extends AbstractFullBox {public static class __CLR4_5_2g3ig3ilvlulnnk{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,20940,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static final String TYPE = "saiz";

    private short defaultSampleInfoSize;
    private short[] sampleInfoSizes = new short[0];
    private int sampleCount;
    private String auxInfoType;
    private String auxInfoTypeParameter;

    public SampleAuxiliaryInformationSizesBox() {
        super(TYPE);__CLR4_5_2g3ig3ilvlulnnk.R.inc(20863);try{__CLR4_5_2g3ig3ilvlulnnk.R.inc(20862);
    }finally{__CLR4_5_2g3ig3ilvlulnnk.R.flushNeeded();}}

    @Override
    protected long getContentSize() {try{__CLR4_5_2g3ig3ilvlulnnk.R.inc(20864);
        __CLR4_5_2g3ig3ilvlulnnk.R.inc(20865);int size = 4;
        __CLR4_5_2g3ig3ilvlulnnk.R.inc(20866);if (((((getFlags() & 1) == 1)&&(__CLR4_5_2g3ig3ilvlulnnk.R.iget(20867)!=0|true))||(__CLR4_5_2g3ig3ilvlulnnk.R.iget(20868)==0&false))) {{
            __CLR4_5_2g3ig3ilvlulnnk.R.inc(20869);size += 8;
        }

        }__CLR4_5_2g3ig3ilvlulnnk.R.inc(20870);size += 5;
        __CLR4_5_2g3ig3ilvlulnnk.R.inc(20871);size += (((defaultSampleInfoSize == 0 )&&(__CLR4_5_2g3ig3ilvlulnnk.R.iget(20872)!=0|true))||(__CLR4_5_2g3ig3ilvlulnnk.R.iget(20873)==0&false))? sampleInfoSizes.length : 0;
        __CLR4_5_2g3ig3ilvlulnnk.R.inc(20874);return size;
    }finally{__CLR4_5_2g3ig3ilvlulnnk.R.flushNeeded();}}

    public short getSize(int index) {try{__CLR4_5_2g3ig3ilvlulnnk.R.inc(20875);
        __CLR4_5_2g3ig3ilvlulnnk.R.inc(20876);if ((((getDefaultSampleInfoSize() == 0)&&(__CLR4_5_2g3ig3ilvlulnnk.R.iget(20877)!=0|true))||(__CLR4_5_2g3ig3ilvlulnnk.R.iget(20878)==0&false))) {{
            __CLR4_5_2g3ig3ilvlulnnk.R.inc(20879);return sampleInfoSizes[index];
        } }else {{
            __CLR4_5_2g3ig3ilvlulnnk.R.inc(20880);return defaultSampleInfoSize;
        }

    }}finally{__CLR4_5_2g3ig3ilvlulnnk.R.flushNeeded();}}

    @Override
    protected void getContent(ByteBuffer byteBuffer) {try{__CLR4_5_2g3ig3ilvlulnnk.R.inc(20881);
        __CLR4_5_2g3ig3ilvlulnnk.R.inc(20882);writeVersionAndFlags(byteBuffer);
        __CLR4_5_2g3ig3ilvlulnnk.R.inc(20883);if (((((getFlags() & 1) == 1)&&(__CLR4_5_2g3ig3ilvlulnnk.R.iget(20884)!=0|true))||(__CLR4_5_2g3ig3ilvlulnnk.R.iget(20885)==0&false))) {{
            __CLR4_5_2g3ig3ilvlulnnk.R.inc(20886);byteBuffer.put(IsoFile.fourCCtoBytes(auxInfoType));
            __CLR4_5_2g3ig3ilvlulnnk.R.inc(20887);byteBuffer.put(IsoFile.fourCCtoBytes(auxInfoTypeParameter));
        }

        }__CLR4_5_2g3ig3ilvlulnnk.R.inc(20888);IsoTypeWriter.writeUInt8(byteBuffer, defaultSampleInfoSize);

        __CLR4_5_2g3ig3ilvlulnnk.R.inc(20889);if ((((defaultSampleInfoSize == 0)&&(__CLR4_5_2g3ig3ilvlulnnk.R.iget(20890)!=0|true))||(__CLR4_5_2g3ig3ilvlulnnk.R.iget(20891)==0&false))) {{
            __CLR4_5_2g3ig3ilvlulnnk.R.inc(20892);IsoTypeWriter.writeUInt32(byteBuffer, sampleInfoSizes.length);
            __CLR4_5_2g3ig3ilvlulnnk.R.inc(20893);for (short sampleInfoSize : sampleInfoSizes) {{
                __CLR4_5_2g3ig3ilvlulnnk.R.inc(20894);IsoTypeWriter.writeUInt8(byteBuffer, sampleInfoSize);
            }
        }} }else {{
            __CLR4_5_2g3ig3ilvlulnnk.R.inc(20895);IsoTypeWriter.writeUInt32(byteBuffer, sampleCount);
        }
    }}finally{__CLR4_5_2g3ig3ilvlulnnk.R.flushNeeded();}}

    @Override
    public void _parseDetails(ByteBuffer content) {try{__CLR4_5_2g3ig3ilvlulnnk.R.inc(20896);
        __CLR4_5_2g3ig3ilvlulnnk.R.inc(20897);parseVersionAndFlags(content);
        __CLR4_5_2g3ig3ilvlulnnk.R.inc(20898);if (((((getFlags() & 1) == 1)&&(__CLR4_5_2g3ig3ilvlulnnk.R.iget(20899)!=0|true))||(__CLR4_5_2g3ig3ilvlulnnk.R.iget(20900)==0&false))) {{
            __CLR4_5_2g3ig3ilvlulnnk.R.inc(20901);auxInfoType = IsoTypeReader.read4cc(content);
            __CLR4_5_2g3ig3ilvlulnnk.R.inc(20902);auxInfoTypeParameter = IsoTypeReader.read4cc(content);
        }

        }__CLR4_5_2g3ig3ilvlulnnk.R.inc(20903);defaultSampleInfoSize = (short) IsoTypeReader.readUInt8(content);
        __CLR4_5_2g3ig3ilvlulnnk.R.inc(20904);sampleCount = l2i(IsoTypeReader.readUInt32(content));


        __CLR4_5_2g3ig3ilvlulnnk.R.inc(20905);if ((((defaultSampleInfoSize == 0)&&(__CLR4_5_2g3ig3ilvlulnnk.R.iget(20906)!=0|true))||(__CLR4_5_2g3ig3ilvlulnnk.R.iget(20907)==0&false))) {{
            __CLR4_5_2g3ig3ilvlulnnk.R.inc(20908);sampleInfoSizes = new short[sampleCount];
            __CLR4_5_2g3ig3ilvlulnnk.R.inc(20909);for (int i = 0; (((i < sampleCount)&&(__CLR4_5_2g3ig3ilvlulnnk.R.iget(20910)!=0|true))||(__CLR4_5_2g3ig3ilvlulnnk.R.iget(20911)==0&false)); i++) {{
                __CLR4_5_2g3ig3ilvlulnnk.R.inc(20912);sampleInfoSizes[i] = (short) IsoTypeReader.readUInt8(content);
            }
        }}
    }}finally{__CLR4_5_2g3ig3ilvlulnnk.R.flushNeeded();}}

    public String getAuxInfoType() {try{__CLR4_5_2g3ig3ilvlulnnk.R.inc(20913);
        __CLR4_5_2g3ig3ilvlulnnk.R.inc(20914);return auxInfoType;
    }finally{__CLR4_5_2g3ig3ilvlulnnk.R.flushNeeded();}}

    public void setAuxInfoType(String auxInfoType) {try{__CLR4_5_2g3ig3ilvlulnnk.R.inc(20915);
        __CLR4_5_2g3ig3ilvlulnnk.R.inc(20916);this.auxInfoType = auxInfoType;
    }finally{__CLR4_5_2g3ig3ilvlulnnk.R.flushNeeded();}}

    public String getAuxInfoTypeParameter() {try{__CLR4_5_2g3ig3ilvlulnnk.R.inc(20917);
        __CLR4_5_2g3ig3ilvlulnnk.R.inc(20918);return auxInfoTypeParameter;
    }finally{__CLR4_5_2g3ig3ilvlulnnk.R.flushNeeded();}}

    public void setAuxInfoTypeParameter(String auxInfoTypeParameter) {try{__CLR4_5_2g3ig3ilvlulnnk.R.inc(20919);
        __CLR4_5_2g3ig3ilvlulnnk.R.inc(20920);this.auxInfoTypeParameter = auxInfoTypeParameter;
    }finally{__CLR4_5_2g3ig3ilvlulnnk.R.flushNeeded();}}

    public int getDefaultSampleInfoSize() {try{__CLR4_5_2g3ig3ilvlulnnk.R.inc(20921);
        __CLR4_5_2g3ig3ilvlulnnk.R.inc(20922);return defaultSampleInfoSize;
    }finally{__CLR4_5_2g3ig3ilvlulnnk.R.flushNeeded();}}

    public void setDefaultSampleInfoSize(int defaultSampleInfoSize) {try{__CLR4_5_2g3ig3ilvlulnnk.R.inc(20923);
        assert (((defaultSampleInfoSize <= 255)&&(__CLR4_5_2g3ig3ilvlulnnk.R.iget(20924)!=0|true))||(__CLR4_5_2g3ig3ilvlulnnk.R.iget(20925)==0&false));
        __CLR4_5_2g3ig3ilvlulnnk.R.inc(20926);this.defaultSampleInfoSize = (short) defaultSampleInfoSize;
    }finally{__CLR4_5_2g3ig3ilvlulnnk.R.flushNeeded();}}

    public short[] getSampleInfoSizes() {try{__CLR4_5_2g3ig3ilvlulnnk.R.inc(20927);
        __CLR4_5_2g3ig3ilvlulnnk.R.inc(20928);short copy[] = new short[sampleInfoSizes.length];
        __CLR4_5_2g3ig3ilvlulnnk.R.inc(20929);System.arraycopy(sampleInfoSizes, 0, copy, 0, sampleInfoSizes.length);
        __CLR4_5_2g3ig3ilvlulnnk.R.inc(20930);return copy;
    }finally{__CLR4_5_2g3ig3ilvlulnnk.R.flushNeeded();}}

    public void setSampleInfoSizes(short[] sampleInfoSizes) {try{__CLR4_5_2g3ig3ilvlulnnk.R.inc(20931);
        __CLR4_5_2g3ig3ilvlulnnk.R.inc(20932);this.sampleInfoSizes = new short[sampleInfoSizes.length];
        __CLR4_5_2g3ig3ilvlulnnk.R.inc(20933);System.arraycopy(sampleInfoSizes, 0, this.sampleInfoSizes, 0, sampleInfoSizes.length);
    }finally{__CLR4_5_2g3ig3ilvlulnnk.R.flushNeeded();}}

    public int getSampleCount() {try{__CLR4_5_2g3ig3ilvlulnnk.R.inc(20934);
        __CLR4_5_2g3ig3ilvlulnnk.R.inc(20935);return sampleCount;
    }finally{__CLR4_5_2g3ig3ilvlulnnk.R.flushNeeded();}}

    public void setSampleCount(int sampleCount) {try{__CLR4_5_2g3ig3ilvlulnnk.R.inc(20936);
        __CLR4_5_2g3ig3ilvlulnnk.R.inc(20937);this.sampleCount = sampleCount;
    }finally{__CLR4_5_2g3ig3ilvlulnnk.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_5_2g3ig3ilvlulnnk.R.inc(20938);
        __CLR4_5_2g3ig3ilvlulnnk.R.inc(20939);return "SampleAuxiliaryInformationSizesBox{" +
                "defaultSampleInfoSize=" + defaultSampleInfoSize +
                ", sampleCount=" + sampleCount +
                ", auxInfoType='" + auxInfoType + '\'' +
                ", auxInfoTypeParameter='" + auxInfoTypeParameter + '\'' +
                '}';
    }finally{__CLR4_5_2g3ig3ilvlulnnk.R.flushNeeded();}}
}
