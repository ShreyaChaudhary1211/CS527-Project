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

package com.mp4parser.iso14496.part15;

import com.googlecode.mp4parser.AbstractBox;

import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/**
 * <h1>4cc = "{@value #TYPE}"</h1>
 * Defined in ISO/IEC 14496-15:2004.
 * <p>Possible paths</p>
 * <ul>
 * <li>/moov/trak/mdia/minf/stbl/stsd/avc1/avcC</li>
 * <li>/moov/trak/mdia/minf/stbl/stsd/drmi/avcC</li>
 * </ul>
 */
public final class AvcConfigurationBox extends AbstractBox {public static class __CLR4_5_2g64g64lvlulnoh{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,21020,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static final String TYPE = "avcC";

    public AvcDecoderConfigurationRecord avcDecoderConfigurationRecord = new AvcDecoderConfigurationRecord();


    public AvcConfigurationBox() {
        super(TYPE);__CLR4_5_2g64g64lvlulnoh.R.inc(20957);try{__CLR4_5_2g64g64lvlulnoh.R.inc(20956);
    }finally{__CLR4_5_2g64g64lvlulnoh.R.flushNeeded();}}

    public int getConfigurationVersion() {try{__CLR4_5_2g64g64lvlulnoh.R.inc(20958);
        __CLR4_5_2g64g64lvlulnoh.R.inc(20959);return avcDecoderConfigurationRecord.configurationVersion;
    }finally{__CLR4_5_2g64g64lvlulnoh.R.flushNeeded();}}

    public int getAvcProfileIndication() {try{__CLR4_5_2g64g64lvlulnoh.R.inc(20960);
        __CLR4_5_2g64g64lvlulnoh.R.inc(20961);return avcDecoderConfigurationRecord.avcProfileIndication;
    }finally{__CLR4_5_2g64g64lvlulnoh.R.flushNeeded();}}

    public int getProfileCompatibility() {try{__CLR4_5_2g64g64lvlulnoh.R.inc(20962);
        __CLR4_5_2g64g64lvlulnoh.R.inc(20963);return avcDecoderConfigurationRecord.profileCompatibility;
    }finally{__CLR4_5_2g64g64lvlulnoh.R.flushNeeded();}}

    public int getAvcLevelIndication() {try{__CLR4_5_2g64g64lvlulnoh.R.inc(20964);
        __CLR4_5_2g64g64lvlulnoh.R.inc(20965);return avcDecoderConfigurationRecord.avcLevelIndication;
    }finally{__CLR4_5_2g64g64lvlulnoh.R.flushNeeded();}}

    public int getLengthSizeMinusOne() {try{__CLR4_5_2g64g64lvlulnoh.R.inc(20966);
        __CLR4_5_2g64g64lvlulnoh.R.inc(20967);return avcDecoderConfigurationRecord.lengthSizeMinusOne;
    }finally{__CLR4_5_2g64g64lvlulnoh.R.flushNeeded();}}

    public List<byte[]> getSequenceParameterSets() {try{__CLR4_5_2g64g64lvlulnoh.R.inc(20968);
        __CLR4_5_2g64g64lvlulnoh.R.inc(20969);return Collections.unmodifiableList(avcDecoderConfigurationRecord.sequenceParameterSets);
    }finally{__CLR4_5_2g64g64lvlulnoh.R.flushNeeded();}}

    public List<byte[]> getPictureParameterSets() {try{__CLR4_5_2g64g64lvlulnoh.R.inc(20970);
        __CLR4_5_2g64g64lvlulnoh.R.inc(20971);return Collections.unmodifiableList(avcDecoderConfigurationRecord.pictureParameterSets);
    }finally{__CLR4_5_2g64g64lvlulnoh.R.flushNeeded();}}

    public void setConfigurationVersion(int configurationVersion) {try{__CLR4_5_2g64g64lvlulnoh.R.inc(20972);
        __CLR4_5_2g64g64lvlulnoh.R.inc(20973);this.avcDecoderConfigurationRecord.configurationVersion = configurationVersion;
    }finally{__CLR4_5_2g64g64lvlulnoh.R.flushNeeded();}}

    public void setAvcProfileIndication(int avcProfileIndication) {try{__CLR4_5_2g64g64lvlulnoh.R.inc(20974);
        __CLR4_5_2g64g64lvlulnoh.R.inc(20975);this.avcDecoderConfigurationRecord.avcProfileIndication = avcProfileIndication;
    }finally{__CLR4_5_2g64g64lvlulnoh.R.flushNeeded();}}

    public void setProfileCompatibility(int profileCompatibility) {try{__CLR4_5_2g64g64lvlulnoh.R.inc(20976);
        __CLR4_5_2g64g64lvlulnoh.R.inc(20977);this.avcDecoderConfigurationRecord.profileCompatibility = profileCompatibility;
    }finally{__CLR4_5_2g64g64lvlulnoh.R.flushNeeded();}}

    public void setAvcLevelIndication(int avcLevelIndication) {try{__CLR4_5_2g64g64lvlulnoh.R.inc(20978);
        __CLR4_5_2g64g64lvlulnoh.R.inc(20979);this.avcDecoderConfigurationRecord.avcLevelIndication = avcLevelIndication;
    }finally{__CLR4_5_2g64g64lvlulnoh.R.flushNeeded();}}

    public void setLengthSizeMinusOne(int lengthSizeMinusOne) {try{__CLR4_5_2g64g64lvlulnoh.R.inc(20980);
        __CLR4_5_2g64g64lvlulnoh.R.inc(20981);this.avcDecoderConfigurationRecord.lengthSizeMinusOne = lengthSizeMinusOne;
    }finally{__CLR4_5_2g64g64lvlulnoh.R.flushNeeded();}}

    public void setSequenceParameterSets(List<byte[]> sequenceParameterSets) {try{__CLR4_5_2g64g64lvlulnoh.R.inc(20982);
        __CLR4_5_2g64g64lvlulnoh.R.inc(20983);this.avcDecoderConfigurationRecord.sequenceParameterSets = sequenceParameterSets;
    }finally{__CLR4_5_2g64g64lvlulnoh.R.flushNeeded();}}

    public void setPictureParameterSets(List<byte[]> pictureParameterSets) {try{__CLR4_5_2g64g64lvlulnoh.R.inc(20984);
        __CLR4_5_2g64g64lvlulnoh.R.inc(20985);this.avcDecoderConfigurationRecord.pictureParameterSets = pictureParameterSets;
    }finally{__CLR4_5_2g64g64lvlulnoh.R.flushNeeded();}}

    public int getChromaFormat() {try{__CLR4_5_2g64g64lvlulnoh.R.inc(20986);
        __CLR4_5_2g64g64lvlulnoh.R.inc(20987);return avcDecoderConfigurationRecord.chromaFormat;
    }finally{__CLR4_5_2g64g64lvlulnoh.R.flushNeeded();}}

    public void setChromaFormat(int chromaFormat) {try{__CLR4_5_2g64g64lvlulnoh.R.inc(20988);
        __CLR4_5_2g64g64lvlulnoh.R.inc(20989);this.avcDecoderConfigurationRecord.chromaFormat = chromaFormat;
    }finally{__CLR4_5_2g64g64lvlulnoh.R.flushNeeded();}}

    public int getBitDepthLumaMinus8() {try{__CLR4_5_2g64g64lvlulnoh.R.inc(20990);
        __CLR4_5_2g64g64lvlulnoh.R.inc(20991);return avcDecoderConfigurationRecord.bitDepthLumaMinus8;
    }finally{__CLR4_5_2g64g64lvlulnoh.R.flushNeeded();}}

    public void setBitDepthLumaMinus8(int bitDepthLumaMinus8) {try{__CLR4_5_2g64g64lvlulnoh.R.inc(20992);
        __CLR4_5_2g64g64lvlulnoh.R.inc(20993);this.avcDecoderConfigurationRecord.bitDepthLumaMinus8 = bitDepthLumaMinus8;
    }finally{__CLR4_5_2g64g64lvlulnoh.R.flushNeeded();}}

    public int getBitDepthChromaMinus8() {try{__CLR4_5_2g64g64lvlulnoh.R.inc(20994);
        __CLR4_5_2g64g64lvlulnoh.R.inc(20995);return avcDecoderConfigurationRecord.bitDepthChromaMinus8;
    }finally{__CLR4_5_2g64g64lvlulnoh.R.flushNeeded();}}

    public void setBitDepthChromaMinus8(int bitDepthChromaMinus8) {try{__CLR4_5_2g64g64lvlulnoh.R.inc(20996);
        __CLR4_5_2g64g64lvlulnoh.R.inc(20997);this.avcDecoderConfigurationRecord.bitDepthChromaMinus8 = bitDepthChromaMinus8;
    }finally{__CLR4_5_2g64g64lvlulnoh.R.flushNeeded();}}

    public List<byte[]> getSequenceParameterSetExts() {try{__CLR4_5_2g64g64lvlulnoh.R.inc(20998);
        __CLR4_5_2g64g64lvlulnoh.R.inc(20999);return avcDecoderConfigurationRecord.sequenceParameterSetExts;
    }finally{__CLR4_5_2g64g64lvlulnoh.R.flushNeeded();}}

    public void setSequenceParameterSetExts(List<byte[]> sequenceParameterSetExts) {try{__CLR4_5_2g64g64lvlulnoh.R.inc(21000);
        __CLR4_5_2g64g64lvlulnoh.R.inc(21001);this.avcDecoderConfigurationRecord.sequenceParameterSetExts = sequenceParameterSetExts;
    }finally{__CLR4_5_2g64g64lvlulnoh.R.flushNeeded();}}

    public boolean hasExts() {try{__CLR4_5_2g64g64lvlulnoh.R.inc(21002);
        __CLR4_5_2g64g64lvlulnoh.R.inc(21003);return avcDecoderConfigurationRecord.hasExts;
    }finally{__CLR4_5_2g64g64lvlulnoh.R.flushNeeded();}}

    public void setHasExts(boolean hasExts) {try{__CLR4_5_2g64g64lvlulnoh.R.inc(21004);
        __CLR4_5_2g64g64lvlulnoh.R.inc(21005);this.avcDecoderConfigurationRecord.hasExts = hasExts;
    }finally{__CLR4_5_2g64g64lvlulnoh.R.flushNeeded();}}

    @Override
    public void _parseDetails(ByteBuffer content) {try{__CLR4_5_2g64g64lvlulnoh.R.inc(21006);
        __CLR4_5_2g64g64lvlulnoh.R.inc(21007);avcDecoderConfigurationRecord = new AvcDecoderConfigurationRecord(content);
    }finally{__CLR4_5_2g64g64lvlulnoh.R.flushNeeded();}}


    @Override
    public long getContentSize() {try{__CLR4_5_2g64g64lvlulnoh.R.inc(21008);
        __CLR4_5_2g64g64lvlulnoh.R.inc(21009);return avcDecoderConfigurationRecord.getContentSize();
    }finally{__CLR4_5_2g64g64lvlulnoh.R.flushNeeded();}}


    @Override
    public void getContent(ByteBuffer byteBuffer) {try{__CLR4_5_2g64g64lvlulnoh.R.inc(21010);
        __CLR4_5_2g64g64lvlulnoh.R.inc(21011);avcDecoderConfigurationRecord.getContent(byteBuffer);
    }finally{__CLR4_5_2g64g64lvlulnoh.R.flushNeeded();}}

    // just to display sps in isoviewer no practical use
    public String[] getSPS() {try{__CLR4_5_2g64g64lvlulnoh.R.inc(21012);
        __CLR4_5_2g64g64lvlulnoh.R.inc(21013);return avcDecoderConfigurationRecord.getSPS();
    }finally{__CLR4_5_2g64g64lvlulnoh.R.flushNeeded();}}

    public String[] getPPS() {try{__CLR4_5_2g64g64lvlulnoh.R.inc(21014);
        __CLR4_5_2g64g64lvlulnoh.R.inc(21015);return avcDecoderConfigurationRecord.getPPS();
    }finally{__CLR4_5_2g64g64lvlulnoh.R.flushNeeded();}}


    public AvcDecoderConfigurationRecord getavcDecoderConfigurationRecord() {try{__CLR4_5_2g64g64lvlulnoh.R.inc(21016);
        __CLR4_5_2g64g64lvlulnoh.R.inc(21017);return avcDecoderConfigurationRecord;
    }finally{__CLR4_5_2g64g64lvlulnoh.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_5_2g64g64lvlulnoh.R.inc(21018);
        __CLR4_5_2g64g64lvlulnoh.R.inc(21019);return "AvcConfigurationBox{" +
                "avcDecoderConfigurationRecord=" + avcDecoderConfigurationRecord +
                '}';
    }finally{__CLR4_5_2g64g64lvlulnoh.R.flushNeeded();}}
}

