/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2011 castLabs, Berlin
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

package com.googlecode.mp4parser.boxes.basemediaformat;

import com.mp4parser.iso14496.part15.AvcConfigurationBox;
import com.googlecode.mp4parser.AbstractBox;
import com.mp4parser.iso14496.part15.AvcDecoderConfigurationRecord;

import java.nio.ByteBuffer;
import java.util.List;

/**
 * <h1>4cc = "{@value #TYPE}"</h1>
 * The AVC NAL Unit Storage Box SHALL contain an AVCDecoderConfigurationRecord,
 * as defined in section 5.2.4.1 of the ISO 14496-12.
 */
public class AvcNalUnitStorageBox extends AbstractBox {public static class __CLR4_5_2bmwbmwlvl9ejvi{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,15107,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static final String TYPE = "avcn";
    AvcDecoderConfigurationRecord avcDecoderConfigurationRecord;

    public AvcNalUnitStorageBox() {
        super(TYPE);__CLR4_5_2bmwbmwlvl9ejvi.R.inc(15081);try{__CLR4_5_2bmwbmwlvl9ejvi.R.inc(15080);
    }finally{__CLR4_5_2bmwbmwlvl9ejvi.R.flushNeeded();}}

    public AvcNalUnitStorageBox(AvcConfigurationBox avcConfigurationBox) {
        super(TYPE);__CLR4_5_2bmwbmwlvl9ejvi.R.inc(15083);try{__CLR4_5_2bmwbmwlvl9ejvi.R.inc(15082);
        __CLR4_5_2bmwbmwlvl9ejvi.R.inc(15084);this.avcDecoderConfigurationRecord = avcConfigurationBox.getavcDecoderConfigurationRecord();
    }finally{__CLR4_5_2bmwbmwlvl9ejvi.R.flushNeeded();}}

    public AvcDecoderConfigurationRecord getAvcDecoderConfigurationRecord() {try{__CLR4_5_2bmwbmwlvl9ejvi.R.inc(15085);
        __CLR4_5_2bmwbmwlvl9ejvi.R.inc(15086);return avcDecoderConfigurationRecord;
    }finally{__CLR4_5_2bmwbmwlvl9ejvi.R.flushNeeded();}}

    // just to display sps in isoviewer no practical use
    public int getLengthSizeMinusOne() {try{__CLR4_5_2bmwbmwlvl9ejvi.R.inc(15087);
        __CLR4_5_2bmwbmwlvl9ejvi.R.inc(15088);return avcDecoderConfigurationRecord.lengthSizeMinusOne;
    }finally{__CLR4_5_2bmwbmwlvl9ejvi.R.flushNeeded();}}

    public String[] getSPS() {try{__CLR4_5_2bmwbmwlvl9ejvi.R.inc(15089);
        __CLR4_5_2bmwbmwlvl9ejvi.R.inc(15090);return avcDecoderConfigurationRecord.getSPS();
    }finally{__CLR4_5_2bmwbmwlvl9ejvi.R.flushNeeded();}}

    public String[] getPPS() {try{__CLR4_5_2bmwbmwlvl9ejvi.R.inc(15091);
        __CLR4_5_2bmwbmwlvl9ejvi.R.inc(15092);return avcDecoderConfigurationRecord.getPPS();
    }finally{__CLR4_5_2bmwbmwlvl9ejvi.R.flushNeeded();}}

    public List<String> getSequenceParameterSetsAsStrings() {try{__CLR4_5_2bmwbmwlvl9ejvi.R.inc(15093);
        __CLR4_5_2bmwbmwlvl9ejvi.R.inc(15094);return avcDecoderConfigurationRecord.getSequenceParameterSetsAsStrings();
    }finally{__CLR4_5_2bmwbmwlvl9ejvi.R.flushNeeded();}}

    public List<String> getSequenceParameterSetExtsAsStrings() {try{__CLR4_5_2bmwbmwlvl9ejvi.R.inc(15095);
        __CLR4_5_2bmwbmwlvl9ejvi.R.inc(15096);return avcDecoderConfigurationRecord.getSequenceParameterSetExtsAsStrings();
    }finally{__CLR4_5_2bmwbmwlvl9ejvi.R.flushNeeded();}}

    public List<String> getPictureParameterSetsAsStrings() {try{__CLR4_5_2bmwbmwlvl9ejvi.R.inc(15097);
        __CLR4_5_2bmwbmwlvl9ejvi.R.inc(15098);return avcDecoderConfigurationRecord.getPictureParameterSetsAsStrings();
    }finally{__CLR4_5_2bmwbmwlvl9ejvi.R.flushNeeded();}}

    @Override
    protected long getContentSize() {try{__CLR4_5_2bmwbmwlvl9ejvi.R.inc(15099);
        __CLR4_5_2bmwbmwlvl9ejvi.R.inc(15100);return avcDecoderConfigurationRecord.getContentSize();
    }finally{__CLR4_5_2bmwbmwlvl9ejvi.R.flushNeeded();}}

    @Override
    public void _parseDetails(ByteBuffer content) {try{__CLR4_5_2bmwbmwlvl9ejvi.R.inc(15101);
        __CLR4_5_2bmwbmwlvl9ejvi.R.inc(15102);this.avcDecoderConfigurationRecord = new AvcDecoderConfigurationRecord(content);
    }finally{__CLR4_5_2bmwbmwlvl9ejvi.R.flushNeeded();}}

    @Override
    protected void getContent(ByteBuffer byteBuffer) {try{__CLR4_5_2bmwbmwlvl9ejvi.R.inc(15103);
        __CLR4_5_2bmwbmwlvl9ejvi.R.inc(15104);this.avcDecoderConfigurationRecord.getContent(byteBuffer);
    }finally{__CLR4_5_2bmwbmwlvl9ejvi.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_5_2bmwbmwlvl9ejvi.R.inc(15105);
        __CLR4_5_2bmwbmwlvl9ejvi.R.inc(15106);return "AvcNalUnitStorageBox{" +
                "SPS=" + avcDecoderConfigurationRecord.getSequenceParameterSetsAsStrings() +
                ",PPS=" + avcDecoderConfigurationRecord.getPictureParameterSetsAsStrings() +
                ",lengthSize=" + (avcDecoderConfigurationRecord.lengthSizeMinusOne + 1) +
                '}';
    }finally{__CLR4_5_2bmwbmwlvl9ejvi.R.flushNeeded();}}
}
