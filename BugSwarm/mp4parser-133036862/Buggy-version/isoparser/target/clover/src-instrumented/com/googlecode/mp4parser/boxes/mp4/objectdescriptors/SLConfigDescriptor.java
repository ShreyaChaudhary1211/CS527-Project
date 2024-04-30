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

package com.googlecode.mp4parser.boxes.mp4.objectdescriptors;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;

import java.io.IOException;
import java.nio.ByteBuffer;

/**
 * class SLConfigDescriptor extends BaseDescriptor : bit(8) tag=SLConfigDescrTag {
 * bit(8) predefined;
 * if (predefined==0) {
 * bit(1) useAccessUnitStartFlag;
 * bit(1) useAccessUnitEndFlag;
 * bit(1) useRandomAccessPointFlag;
 * bit(1) hasRandomAccessUnitsOnlyFlag;
 * bit(1) usePaddingFlag;
 * bit(1) useTimeStampsFlag;
 * bit(1) useIdleFlag;
 * bit(1) durationFlag;
 * bit(32) timeStampResolution;
 * bit(32) OCRResolution;
 * bit(8) timeStampLength; // must be \u2264 64
 * bit(8) OCRLength; // must be \u2264 64
 * bit(8) AU_Length; // must be \u2264 32
 * bit(8) instantBitrateLength;
 * bit(4) degradationPriorityLength;
 * bit(5) AU_seqNumLength; // must be \u2264 16
 * bit(5) packetSeqNumLength; // must be \u2264 16
 * bit(2) reserved=0b11;
 * }
 * if (durationFlag) {
 * bit(32) timeScale;
 * bit(16) accessUnitDuration;
 * bit(16) compositionUnitDuration;
 * }
 * if (!useTimeStampsFlag) {
 * bit(timeStampLength) startDecodingTimeStamp;
 * bit(timeStampLength) startCompositionTimeStamp;
 * }
 * }
 */
@Descriptor(tags = {0x06})
public class SLConfigDescriptor extends BaseDescriptor {public static class __CLR4_5_2dp9dp9lvlulmlk{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,17796,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    int predefined;

    public SLConfigDescriptor() {try{__CLR4_5_2dp9dp9lvlulmlk.R.inc(17757);
        __CLR4_5_2dp9dp9lvlulmlk.R.inc(17758);tag = 0x06;
    }finally{__CLR4_5_2dp9dp9lvlulmlk.R.flushNeeded();}}

    public int getPredefined() {try{__CLR4_5_2dp9dp9lvlulmlk.R.inc(17759);
        __CLR4_5_2dp9dp9lvlulmlk.R.inc(17760);return predefined;
    }finally{__CLR4_5_2dp9dp9lvlulmlk.R.flushNeeded();}}

    public void setPredefined(int predefined) {try{__CLR4_5_2dp9dp9lvlulmlk.R.inc(17761);
        __CLR4_5_2dp9dp9lvlulmlk.R.inc(17762);this.predefined = predefined;
    }finally{__CLR4_5_2dp9dp9lvlulmlk.R.flushNeeded();}}

    @Override
    public void parseDetail(ByteBuffer bb) throws IOException {try{__CLR4_5_2dp9dp9lvlulmlk.R.inc(17763);
        __CLR4_5_2dp9dp9lvlulmlk.R.inc(17764);predefined = IsoTypeReader.readUInt8(bb);
    }finally{__CLR4_5_2dp9dp9lvlulmlk.R.flushNeeded();}}

    int getContentSize() {try{__CLR4_5_2dp9dp9lvlulmlk.R.inc(17765);
        __CLR4_5_2dp9dp9lvlulmlk.R.inc(17766);return 1;
    }finally{__CLR4_5_2dp9dp9lvlulmlk.R.flushNeeded();}}

    public ByteBuffer serialize() {try{__CLR4_5_2dp9dp9lvlulmlk.R.inc(17767);
        __CLR4_5_2dp9dp9lvlulmlk.R.inc(17768);ByteBuffer out = ByteBuffer.allocate(getSize());
        __CLR4_5_2dp9dp9lvlulmlk.R.inc(17769);IsoTypeWriter.writeUInt8(out, 6);
        __CLR4_5_2dp9dp9lvlulmlk.R.inc(17770);writeSize(out, getContentSize());
        __CLR4_5_2dp9dp9lvlulmlk.R.inc(17771);IsoTypeWriter.writeUInt8(out, predefined);
        __CLR4_5_2dp9dp9lvlulmlk.R.inc(17772);return out;
    }finally{__CLR4_5_2dp9dp9lvlulmlk.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_5_2dp9dp9lvlulmlk.R.inc(17773);
        __CLR4_5_2dp9dp9lvlulmlk.R.inc(17774);final StringBuilder sb = new StringBuilder();
        __CLR4_5_2dp9dp9lvlulmlk.R.inc(17775);sb.append("SLConfigDescriptor");
        __CLR4_5_2dp9dp9lvlulmlk.R.inc(17776);sb.append("{predefined=").append(predefined);
        __CLR4_5_2dp9dp9lvlulmlk.R.inc(17777);sb.append('}');
        __CLR4_5_2dp9dp9lvlulmlk.R.inc(17778);return sb.toString();
    }finally{__CLR4_5_2dp9dp9lvlulmlk.R.flushNeeded();}}

    @Override
    public boolean equals(Object o) {try{__CLR4_5_2dp9dp9lvlulmlk.R.inc(17779);
        __CLR4_5_2dp9dp9lvlulmlk.R.inc(17780);if ((((this == o)&&(__CLR4_5_2dp9dp9lvlulmlk.R.iget(17781)!=0|true))||(__CLR4_5_2dp9dp9lvlulmlk.R.iget(17782)==0&false))) {{
            __CLR4_5_2dp9dp9lvlulmlk.R.inc(17783);return true;
        }
        }__CLR4_5_2dp9dp9lvlulmlk.R.inc(17784);if ((((o == null || getClass() != o.getClass())&&(__CLR4_5_2dp9dp9lvlulmlk.R.iget(17785)!=0|true))||(__CLR4_5_2dp9dp9lvlulmlk.R.iget(17786)==0&false))) {{
            __CLR4_5_2dp9dp9lvlulmlk.R.inc(17787);return false;
        }

        }__CLR4_5_2dp9dp9lvlulmlk.R.inc(17788);SLConfigDescriptor that = (SLConfigDescriptor) o;

        __CLR4_5_2dp9dp9lvlulmlk.R.inc(17789);if ((((predefined != that.predefined)&&(__CLR4_5_2dp9dp9lvlulmlk.R.iget(17790)!=0|true))||(__CLR4_5_2dp9dp9lvlulmlk.R.iget(17791)==0&false))) {{
            __CLR4_5_2dp9dp9lvlulmlk.R.inc(17792);return false;
        }

        }__CLR4_5_2dp9dp9lvlulmlk.R.inc(17793);return true;
    }finally{__CLR4_5_2dp9dp9lvlulmlk.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_5_2dp9dp9lvlulmlk.R.inc(17794);
        __CLR4_5_2dp9dp9lvlulmlk.R.inc(17795);return predefined;
    }finally{__CLR4_5_2dp9dp9lvlulmlk.R.flushNeeded();}}
}
