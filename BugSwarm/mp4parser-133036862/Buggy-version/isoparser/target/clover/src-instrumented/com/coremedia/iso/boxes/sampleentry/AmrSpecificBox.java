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

package com.coremedia.iso.boxes.sampleentry;


import com.coremedia.iso.IsoFile;
import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractBox;

import java.nio.ByteBuffer;

/**
 * <h1>4cc = "{@value #TYPE}"</h1>
 * AMR audio format specific subbox of an audio sample entry.
 *
 * @see com.coremedia.iso.boxes.sampleentry.AudioSampleEntry
 */
public class AmrSpecificBox extends AbstractBox {public static class __CLR4_5_2324324lvlulcgl{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,4001,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static final String TYPE = "damr";

    private String vendor;
    private int decoderVersion;
    private int modeSet;
    private int modeChangePeriod;
    private int framesPerSample;

    public AmrSpecificBox() {
        super(TYPE);__CLR4_5_2324324lvlulcgl.R.inc(3965);try{__CLR4_5_2324324lvlulcgl.R.inc(3964);
    }finally{__CLR4_5_2324324lvlulcgl.R.flushNeeded();}}

    public String getVendor() {try{__CLR4_5_2324324lvlulcgl.R.inc(3966);
        __CLR4_5_2324324lvlulcgl.R.inc(3967);return vendor;
    }finally{__CLR4_5_2324324lvlulcgl.R.flushNeeded();}}

    public int getDecoderVersion() {try{__CLR4_5_2324324lvlulcgl.R.inc(3968);
        __CLR4_5_2324324lvlulcgl.R.inc(3969);return decoderVersion;
    }finally{__CLR4_5_2324324lvlulcgl.R.flushNeeded();}}

    public int getModeSet() {try{__CLR4_5_2324324lvlulcgl.R.inc(3970);
        __CLR4_5_2324324lvlulcgl.R.inc(3971);return modeSet;
    }finally{__CLR4_5_2324324lvlulcgl.R.flushNeeded();}}

    public int getModeChangePeriod() {try{__CLR4_5_2324324lvlulcgl.R.inc(3972);
        __CLR4_5_2324324lvlulcgl.R.inc(3973);return modeChangePeriod;
    }finally{__CLR4_5_2324324lvlulcgl.R.flushNeeded();}}

    public int getFramesPerSample() {try{__CLR4_5_2324324lvlulcgl.R.inc(3974);
        __CLR4_5_2324324lvlulcgl.R.inc(3975);return framesPerSample;
    }finally{__CLR4_5_2324324lvlulcgl.R.flushNeeded();}}

    protected long getContentSize() {try{__CLR4_5_2324324lvlulcgl.R.inc(3976);
        __CLR4_5_2324324lvlulcgl.R.inc(3977);return 9;
    }finally{__CLR4_5_2324324lvlulcgl.R.flushNeeded();}}

    @Override
    public void _parseDetails(ByteBuffer content) {try{__CLR4_5_2324324lvlulcgl.R.inc(3978);
        __CLR4_5_2324324lvlulcgl.R.inc(3979);byte[] v = new byte[4];
        __CLR4_5_2324324lvlulcgl.R.inc(3980);content.get(v);
        __CLR4_5_2324324lvlulcgl.R.inc(3981);vendor = IsoFile.bytesToFourCC(v);

        __CLR4_5_2324324lvlulcgl.R.inc(3982);decoderVersion = IsoTypeReader.readUInt8(content);
        __CLR4_5_2324324lvlulcgl.R.inc(3983);modeSet = IsoTypeReader.readUInt16(content);
        __CLR4_5_2324324lvlulcgl.R.inc(3984);modeChangePeriod = IsoTypeReader.readUInt8(content);
        __CLR4_5_2324324lvlulcgl.R.inc(3985);framesPerSample = IsoTypeReader.readUInt8(content);

    }finally{__CLR4_5_2324324lvlulcgl.R.flushNeeded();}}


    public void getContent(ByteBuffer byteBuffer) {try{__CLR4_5_2324324lvlulcgl.R.inc(3986);
        __CLR4_5_2324324lvlulcgl.R.inc(3987);byteBuffer.put(IsoFile.fourCCtoBytes(vendor));
        __CLR4_5_2324324lvlulcgl.R.inc(3988);IsoTypeWriter.writeUInt8(byteBuffer, decoderVersion);
        __CLR4_5_2324324lvlulcgl.R.inc(3989);IsoTypeWriter.writeUInt16(byteBuffer, modeSet);
        __CLR4_5_2324324lvlulcgl.R.inc(3990);IsoTypeWriter.writeUInt8(byteBuffer, modeChangePeriod);
        __CLR4_5_2324324lvlulcgl.R.inc(3991);IsoTypeWriter.writeUInt8(byteBuffer, framesPerSample);
    }finally{__CLR4_5_2324324lvlulcgl.R.flushNeeded();}}

    public String toString() {try{__CLR4_5_2324324lvlulcgl.R.inc(3992);
        __CLR4_5_2324324lvlulcgl.R.inc(3993);StringBuilder buffer = new StringBuilder();
        __CLR4_5_2324324lvlulcgl.R.inc(3994);buffer.append("AmrSpecificBox[vendor=").append(getVendor());
        __CLR4_5_2324324lvlulcgl.R.inc(3995);buffer.append(";decoderVersion=").append(getDecoderVersion());
        __CLR4_5_2324324lvlulcgl.R.inc(3996);buffer.append(";modeSet=").append(getModeSet());
        __CLR4_5_2324324lvlulcgl.R.inc(3997);buffer.append(";modeChangePeriod=").append(getModeChangePeriod());
        __CLR4_5_2324324lvlulcgl.R.inc(3998);buffer.append(";framesPerSample=").append(getFramesPerSample());
        __CLR4_5_2324324lvlulcgl.R.inc(3999);buffer.append("]");
        __CLR4_5_2324324lvlulcgl.R.inc(4000);return buffer.toString();
    }finally{__CLR4_5_2324324lvlulcgl.R.flushNeeded();}}
}
