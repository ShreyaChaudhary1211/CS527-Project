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

import com.coremedia.iso.IsoFile;
import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.Utf8;
import com.googlecode.mp4parser.AbstractFullBox;

import java.nio.ByteBuffer;

/**
 * <h1>4cc = "{@value #TYPE}"</h1>
 * Classification of the media according to 3GPP 26.244.
 */
public class ClassificationBox extends AbstractFullBox {public static class __CLR4_5_2gqgqlvlulazf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,645,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static final String TYPE = "clsf";


    private String classificationEntity;
    private int classificationTableIndex;
    private String language;
    private String classificationInfo;

    public ClassificationBox() {
        super(TYPE);__CLR4_5_2gqgqlvlulazf.R.inc(603);try{__CLR4_5_2gqgqlvlulazf.R.inc(602);
    }finally{__CLR4_5_2gqgqlvlulazf.R.flushNeeded();}}

    public String getLanguage() {try{__CLR4_5_2gqgqlvlulazf.R.inc(604);
        __CLR4_5_2gqgqlvlulazf.R.inc(605);return language;
    }finally{__CLR4_5_2gqgqlvlulazf.R.flushNeeded();}}

    public String getClassificationEntity() {try{__CLR4_5_2gqgqlvlulazf.R.inc(606);
        __CLR4_5_2gqgqlvlulazf.R.inc(607);return classificationEntity;
    }finally{__CLR4_5_2gqgqlvlulazf.R.flushNeeded();}}

    public int getClassificationTableIndex() {try{__CLR4_5_2gqgqlvlulazf.R.inc(608);
        __CLR4_5_2gqgqlvlulazf.R.inc(609);return classificationTableIndex;
    }finally{__CLR4_5_2gqgqlvlulazf.R.flushNeeded();}}

    public String getClassificationInfo() {try{__CLR4_5_2gqgqlvlulazf.R.inc(610);
        __CLR4_5_2gqgqlvlulazf.R.inc(611);return classificationInfo;
    }finally{__CLR4_5_2gqgqlvlulazf.R.flushNeeded();}}

    public void setClassificationEntity(String classificationEntity) {try{__CLR4_5_2gqgqlvlulazf.R.inc(612);
        __CLR4_5_2gqgqlvlulazf.R.inc(613);this.classificationEntity = classificationEntity;
    }finally{__CLR4_5_2gqgqlvlulazf.R.flushNeeded();}}

    public void setClassificationTableIndex(int classificationTableIndex) {try{__CLR4_5_2gqgqlvlulazf.R.inc(614);
        __CLR4_5_2gqgqlvlulazf.R.inc(615);this.classificationTableIndex = classificationTableIndex;
    }finally{__CLR4_5_2gqgqlvlulazf.R.flushNeeded();}}

    public void setLanguage(String language) {try{__CLR4_5_2gqgqlvlulazf.R.inc(616);
        __CLR4_5_2gqgqlvlulazf.R.inc(617);this.language = language;
    }finally{__CLR4_5_2gqgqlvlulazf.R.flushNeeded();}}

    public void setClassificationInfo(String classificationInfo) {try{__CLR4_5_2gqgqlvlulazf.R.inc(618);
        __CLR4_5_2gqgqlvlulazf.R.inc(619);this.classificationInfo = classificationInfo;
    }finally{__CLR4_5_2gqgqlvlulazf.R.flushNeeded();}}

    protected long getContentSize() {try{__CLR4_5_2gqgqlvlulazf.R.inc(620);
        __CLR4_5_2gqgqlvlulazf.R.inc(621);return 4 + 2 + 2 + Utf8.utf8StringLengthInBytes(classificationInfo) + 1;
    }finally{__CLR4_5_2gqgqlvlulazf.R.flushNeeded();}}

    @Override
    public void _parseDetails(ByteBuffer content) {try{__CLR4_5_2gqgqlvlulazf.R.inc(622);
        __CLR4_5_2gqgqlvlulazf.R.inc(623);parseVersionAndFlags(content);
        __CLR4_5_2gqgqlvlulazf.R.inc(624);byte[] cE = new byte[4];
        __CLR4_5_2gqgqlvlulazf.R.inc(625);content.get(cE);
        __CLR4_5_2gqgqlvlulazf.R.inc(626);classificationEntity = IsoFile.bytesToFourCC(cE);
        __CLR4_5_2gqgqlvlulazf.R.inc(627);classificationTableIndex = IsoTypeReader.readUInt16(content);
        __CLR4_5_2gqgqlvlulazf.R.inc(628);language = IsoTypeReader.readIso639(content);
        __CLR4_5_2gqgqlvlulazf.R.inc(629);classificationInfo = IsoTypeReader.readString(content);
    }finally{__CLR4_5_2gqgqlvlulazf.R.flushNeeded();}}

    @Override
    protected void getContent(ByteBuffer byteBuffer) {try{__CLR4_5_2gqgqlvlulazf.R.inc(630);
        __CLR4_5_2gqgqlvlulazf.R.inc(631);byteBuffer.put(IsoFile.fourCCtoBytes(classificationEntity));
        __CLR4_5_2gqgqlvlulazf.R.inc(632);IsoTypeWriter.writeUInt16(byteBuffer, classificationTableIndex);
        __CLR4_5_2gqgqlvlulazf.R.inc(633);IsoTypeWriter.writeIso639(byteBuffer, language);
        __CLR4_5_2gqgqlvlulazf.R.inc(634);byteBuffer.put(Utf8.convert(classificationInfo));
        __CLR4_5_2gqgqlvlulazf.R.inc(635);byteBuffer.put((byte) 0);
    }finally{__CLR4_5_2gqgqlvlulazf.R.flushNeeded();}}


    public String toString() {try{__CLR4_5_2gqgqlvlulazf.R.inc(636);
        __CLR4_5_2gqgqlvlulazf.R.inc(637);StringBuilder buffer = new StringBuilder();
        __CLR4_5_2gqgqlvlulazf.R.inc(638);buffer.append("ClassificationBox[language=").append(getLanguage());
        __CLR4_5_2gqgqlvlulazf.R.inc(639);buffer.append("classificationEntity=").append(getClassificationEntity());
        __CLR4_5_2gqgqlvlulazf.R.inc(640);buffer.append(";classificationTableIndex=").append(getClassificationTableIndex());
        __CLR4_5_2gqgqlvlulazf.R.inc(641);buffer.append(";language=").append(getLanguage());
        __CLR4_5_2gqgqlvlulazf.R.inc(642);buffer.append(";classificationInfo=").append(getClassificationInfo());
        __CLR4_5_2gqgqlvlulazf.R.inc(643);buffer.append("]");
        __CLR4_5_2gqgqlvlulazf.R.inc(644);return buffer.toString();
    }finally{__CLR4_5_2gqgqlvlulazf.R.flushNeeded();}}
}
