/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2012 castLabs, Berlin
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

package com.googlecode.mp4parser.boxes.mp4.samplegrouping;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.util.UUIDConverter;

import java.nio.ByteBuffer;
import java.util.UUID;

/**
 * <h1>4cc = "{@value #TYPE}"</h1>
 * <p>Each sample in a protected track shall be associated with an IsEncrypted flag, IV_Size, and KID.
 * This can be accomplished by (a) relying on the default values in the TrackEncryptionBox
 * (see 8.2), or (b) specifying the parameters by sample group, or (c) using a combination of these two techniques.</p>
 * <p>When specifying the parameters by sample group, the SampleToGroupBox in the sample table or track
 * fragment specifies which samples use which sample group description from the SampleGroupDescriptionBox.</p>
 */
public class CencSampleEncryptionInformationGroupEntry extends GroupEntry {public static class __CLR4_5_2dqqdqqlvlulmn9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,17879,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static final String TYPE = "seig";

    private boolean isEncrypted;
    private byte ivSize;
    private UUID kid;

    @Override
    public String getType() {try{__CLR4_5_2dqqdqqlvlulmn9.R.inc(17810);
        __CLR4_5_2dqqdqqlvlulmn9.R.inc(17811);return TYPE;
    }finally{__CLR4_5_2dqqdqqlvlulmn9.R.flushNeeded();}}

    @Override
    public void parse(ByteBuffer byteBuffer) {try{__CLR4_5_2dqqdqqlvlulmn9.R.inc(17812);
        __CLR4_5_2dqqdqqlvlulmn9.R.inc(17813);isEncrypted = IsoTypeReader.readUInt24(byteBuffer) == 1;
        __CLR4_5_2dqqdqqlvlulmn9.R.inc(17814);ivSize = (byte) IsoTypeReader.readUInt8(byteBuffer);
        __CLR4_5_2dqqdqqlvlulmn9.R.inc(17815);byte[] kid = new byte[16];
        __CLR4_5_2dqqdqqlvlulmn9.R.inc(17816);byteBuffer.get(kid);
        __CLR4_5_2dqqdqqlvlulmn9.R.inc(17817);this.kid = UUIDConverter.convert(kid);

    }finally{__CLR4_5_2dqqdqqlvlulmn9.R.flushNeeded();}}

    @Override
    public ByteBuffer get() {try{__CLR4_5_2dqqdqqlvlulmn9.R.inc(17818);
        __CLR4_5_2dqqdqqlvlulmn9.R.inc(17819);ByteBuffer byteBuffer = ByteBuffer.allocate(20);
        __CLR4_5_2dqqdqqlvlulmn9.R.inc(17820);IsoTypeWriter.writeUInt24(byteBuffer, (((isEncrypted)&&(__CLR4_5_2dqqdqqlvlulmn9.R.iget(17821)!=0|true))||(__CLR4_5_2dqqdqqlvlulmn9.R.iget(17822)==0&false))?1:0);
        __CLR4_5_2dqqdqqlvlulmn9.R.inc(17823);if ((((isEncrypted)&&(__CLR4_5_2dqqdqqlvlulmn9.R.iget(17824)!=0|true))||(__CLR4_5_2dqqdqqlvlulmn9.R.iget(17825)==0&false))) {{
            __CLR4_5_2dqqdqqlvlulmn9.R.inc(17826);IsoTypeWriter.writeUInt8(byteBuffer, ivSize);
            __CLR4_5_2dqqdqqlvlulmn9.R.inc(17827);byteBuffer.put(UUIDConverter.convert(kid));
        } }else {{
            __CLR4_5_2dqqdqqlvlulmn9.R.inc(17828);byteBuffer.put(new byte[17]);
        }
        }__CLR4_5_2dqqdqqlvlulmn9.R.inc(17829);byteBuffer.rewind();
        __CLR4_5_2dqqdqqlvlulmn9.R.inc(17830);return byteBuffer;
    }finally{__CLR4_5_2dqqdqqlvlulmn9.R.flushNeeded();}}

    public boolean isEncrypted() {try{__CLR4_5_2dqqdqqlvlulmn9.R.inc(17831);
        __CLR4_5_2dqqdqqlvlulmn9.R.inc(17832);return isEncrypted;
    }finally{__CLR4_5_2dqqdqqlvlulmn9.R.flushNeeded();}}

    public void setEncrypted(boolean encrypted) {try{__CLR4_5_2dqqdqqlvlulmn9.R.inc(17833);
        __CLR4_5_2dqqdqqlvlulmn9.R.inc(17834);isEncrypted = encrypted;
    }finally{__CLR4_5_2dqqdqqlvlulmn9.R.flushNeeded();}}

    public byte getIvSize() {try{__CLR4_5_2dqqdqqlvlulmn9.R.inc(17835);
        __CLR4_5_2dqqdqqlvlulmn9.R.inc(17836);return ivSize;
    }finally{__CLR4_5_2dqqdqqlvlulmn9.R.flushNeeded();}}

    public void setIvSize(int ivSize) {try{__CLR4_5_2dqqdqqlvlulmn9.R.inc(17837);
        __CLR4_5_2dqqdqqlvlulmn9.R.inc(17838);this.ivSize = (byte) ivSize;
    }finally{__CLR4_5_2dqqdqqlvlulmn9.R.flushNeeded();}}

    public UUID getKid() {try{__CLR4_5_2dqqdqqlvlulmn9.R.inc(17839);
        __CLR4_5_2dqqdqqlvlulmn9.R.inc(17840);return kid;
    }finally{__CLR4_5_2dqqdqqlvlulmn9.R.flushNeeded();}}

    public void setKid(UUID kid) {try{__CLR4_5_2dqqdqqlvlulmn9.R.inc(17841);
        __CLR4_5_2dqqdqqlvlulmn9.R.inc(17842);this.kid = kid;
    }finally{__CLR4_5_2dqqdqqlvlulmn9.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_5_2dqqdqqlvlulmn9.R.inc(17843);
        __CLR4_5_2dqqdqqlvlulmn9.R.inc(17844);return "CencSampleEncryptionInformationGroupEntry{" +
                "isEncrypted=" + isEncrypted +
                ", ivSize=" + ivSize +
                ", kid=" + kid +
                '}';
    }finally{__CLR4_5_2dqqdqqlvlulmn9.R.flushNeeded();}}

    @Override
    public boolean equals(Object o) {try{__CLR4_5_2dqqdqqlvlulmn9.R.inc(17845);
        __CLR4_5_2dqqdqqlvlulmn9.R.inc(17846);if ((((this == o)&&(__CLR4_5_2dqqdqqlvlulmn9.R.iget(17847)!=0|true))||(__CLR4_5_2dqqdqqlvlulmn9.R.iget(17848)==0&false))) {__CLR4_5_2dqqdqqlvlulmn9.R.inc(17849);return true;
        }__CLR4_5_2dqqdqqlvlulmn9.R.inc(17850);if ((((o == null || getClass() != o.getClass())&&(__CLR4_5_2dqqdqqlvlulmn9.R.iget(17851)!=0|true))||(__CLR4_5_2dqqdqqlvlulmn9.R.iget(17852)==0&false))) {__CLR4_5_2dqqdqqlvlulmn9.R.inc(17853);return false;

        }__CLR4_5_2dqqdqqlvlulmn9.R.inc(17854);CencSampleEncryptionInformationGroupEntry that = (CencSampleEncryptionInformationGroupEntry) o;

        __CLR4_5_2dqqdqqlvlulmn9.R.inc(17855);if ((((isEncrypted != that.isEncrypted)&&(__CLR4_5_2dqqdqqlvlulmn9.R.iget(17856)!=0|true))||(__CLR4_5_2dqqdqqlvlulmn9.R.iget(17857)==0&false))) {__CLR4_5_2dqqdqqlvlulmn9.R.inc(17858);return false;
        }__CLR4_5_2dqqdqqlvlulmn9.R.inc(17859);if ((((ivSize != that.ivSize)&&(__CLR4_5_2dqqdqqlvlulmn9.R.iget(17860)!=0|true))||(__CLR4_5_2dqqdqqlvlulmn9.R.iget(17861)==0&false))) {__CLR4_5_2dqqdqqlvlulmn9.R.inc(17862);return false;
        }__CLR4_5_2dqqdqqlvlulmn9.R.inc(17863);if (((((((kid != null )&&(__CLR4_5_2dqqdqqlvlulmn9.R.iget(17864)!=0|true))||(__CLR4_5_2dqqdqqlvlulmn9.R.iget(17865)==0&false))? !kid.equals(that.kid) : that.kid != null)&&(__CLR4_5_2dqqdqqlvlulmn9.R.iget(17866)!=0|true))||(__CLR4_5_2dqqdqqlvlulmn9.R.iget(17867)==0&false))) {__CLR4_5_2dqqdqqlvlulmn9.R.inc(17868);return false;

        }__CLR4_5_2dqqdqqlvlulmn9.R.inc(17869);return true;
    }finally{__CLR4_5_2dqqdqqlvlulmn9.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_5_2dqqdqqlvlulmn9.R.inc(17870);
        __CLR4_5_2dqqdqqlvlulmn9.R.inc(17871);int result = (((isEncrypted)&&(__CLR4_5_2dqqdqqlvlulmn9.R.iget(17872)!=0|true))||(__CLR4_5_2dqqdqqlvlulmn9.R.iget(17873)==0&false))?7:19;
        __CLR4_5_2dqqdqqlvlulmn9.R.inc(17874);result = 31 * result + (int) ivSize;
        __CLR4_5_2dqqdqqlvlulmn9.R.inc(17875);result = 31 * result + ((((kid != null )&&(__CLR4_5_2dqqdqqlvlulmn9.R.iget(17876)!=0|true))||(__CLR4_5_2dqqdqqlvlulmn9.R.iget(17877)==0&false))? kid.hashCode() : 0);
        __CLR4_5_2dqqdqqlvlulmn9.R.inc(17878);return result;
    }finally{__CLR4_5_2dqqdqqlvlulmn9.R.flushNeeded();}}
}
