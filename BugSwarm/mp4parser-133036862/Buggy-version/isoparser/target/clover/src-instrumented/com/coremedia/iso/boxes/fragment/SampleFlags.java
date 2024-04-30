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

package com.coremedia.iso.boxes.fragment;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;

import java.nio.ByteBuffer;

/**
 * bit(6) reserved=0;
 * unsigned int(2) sample_depends_on;
 * unsigned int(2) sample_is_depended_on;
 * unsigned int(2) sample_has_redundancy;
 * bit(3) sample_padding_value;
 * bit(1) sample_is_difference_sample;
 * // i.e. when 1 signals a non-key or non-sync sample
 * unsigned int(16) sample_degradation_priority;
 */
public class SampleFlags {public static class __CLR4_5_22fk2fklvlulc8h{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,3265,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private byte reserved;
    private byte isLeading;
    private byte sampleDependsOn;
    private byte sampleIsDependedOn;
    private byte sampleHasRedundancy;
    private byte samplePaddingValue;
    private boolean sampleIsDifferenceSample;
    private int sampleDegradationPriority;

    public SampleFlags() {try{__CLR4_5_22fk2fklvlulc8h.R.inc(3152);

    }finally{__CLR4_5_22fk2fklvlulc8h.R.flushNeeded();}}

    public SampleFlags(ByteBuffer bb) {try{__CLR4_5_22fk2fklvlulc8h.R.inc(3153);
        __CLR4_5_22fk2fklvlulc8h.R.inc(3154);long a = IsoTypeReader.readUInt32(bb);
        __CLR4_5_22fk2fklvlulc8h.R.inc(3155);reserved = (byte) ((a & 0xF0000000) >> 28);
        __CLR4_5_22fk2fklvlulc8h.R.inc(3156);isLeading = (byte) ((a & 0x0C000000) >> 26);
        __CLR4_5_22fk2fklvlulc8h.R.inc(3157);sampleDependsOn = (byte) ((a & 0x03000000) >> 24);
        __CLR4_5_22fk2fklvlulc8h.R.inc(3158);sampleIsDependedOn = (byte) ((a & 0x00C00000) >> 22);
        __CLR4_5_22fk2fklvlulc8h.R.inc(3159);sampleHasRedundancy = (byte) ((a & 0x00300000) >> 20);
        __CLR4_5_22fk2fklvlulc8h.R.inc(3160);samplePaddingValue = (byte) ((a & 0x000e0000) >> 17);
        __CLR4_5_22fk2fklvlulc8h.R.inc(3161);sampleIsDifferenceSample = ((a & 0x00010000) >> 16) > 0;
        __CLR4_5_22fk2fklvlulc8h.R.inc(3162);sampleDegradationPriority = (int) (a & 0x0000ffff);

    }finally{__CLR4_5_22fk2fklvlulc8h.R.flushNeeded();}}


    public void getContent(ByteBuffer os) {try{__CLR4_5_22fk2fklvlulc8h.R.inc(3163);
        __CLR4_5_22fk2fklvlulc8h.R.inc(3164);long a = 0;
        __CLR4_5_22fk2fklvlulc8h.R.inc(3165);a |= reserved << 28;
        __CLR4_5_22fk2fklvlulc8h.R.inc(3166);a |= isLeading << 26;
        __CLR4_5_22fk2fklvlulc8h.R.inc(3167);a |= sampleDependsOn << 24;
        __CLR4_5_22fk2fklvlulc8h.R.inc(3168);a |= sampleIsDependedOn << 22;
        __CLR4_5_22fk2fklvlulc8h.R.inc(3169);a |= sampleHasRedundancy << 20;
        __CLR4_5_22fk2fklvlulc8h.R.inc(3170);a |= samplePaddingValue << 17;
        __CLR4_5_22fk2fklvlulc8h.R.inc(3171);a |= ((((sampleIsDifferenceSample )&&(__CLR4_5_22fk2fklvlulc8h.R.iget(3172)!=0|true))||(__CLR4_5_22fk2fklvlulc8h.R.iget(3173)==0&false))? 1 : 0) << 16;
        __CLR4_5_22fk2fklvlulc8h.R.inc(3174);a |= sampleDegradationPriority;
        __CLR4_5_22fk2fklvlulc8h.R.inc(3175);IsoTypeWriter.writeUInt32(os, a);
    }finally{__CLR4_5_22fk2fklvlulc8h.R.flushNeeded();}}

    public int getReserved() {try{__CLR4_5_22fk2fklvlulc8h.R.inc(3176);
        __CLR4_5_22fk2fklvlulc8h.R.inc(3177);return reserved;
    }finally{__CLR4_5_22fk2fklvlulc8h.R.flushNeeded();}}

    public void setReserved(int reserved) {try{__CLR4_5_22fk2fklvlulc8h.R.inc(3178);
        __CLR4_5_22fk2fklvlulc8h.R.inc(3179);this.reserved = (byte) reserved;
    }finally{__CLR4_5_22fk2fklvlulc8h.R.flushNeeded();}}

    public byte getIsLeading() {try{__CLR4_5_22fk2fklvlulc8h.R.inc(3180);
        __CLR4_5_22fk2fklvlulc8h.R.inc(3181);return isLeading;
    }finally{__CLR4_5_22fk2fklvlulc8h.R.flushNeeded();}}

    public void setIsLeading(byte isLeading) {try{__CLR4_5_22fk2fklvlulc8h.R.inc(3182);
        __CLR4_5_22fk2fklvlulc8h.R.inc(3183);this.isLeading = isLeading;
    }finally{__CLR4_5_22fk2fklvlulc8h.R.flushNeeded();}}

    /**
     * sample_depends_on takes one of the following four values:
     * <pre>
     * 0: the dependency of this sample is unknown;
     * 1: this sample does depend on others (not an I picture);
     * 2: this sample does not depend on others (I picture);
     * 3: reserved
     * </pre>
     *
     * @return current depends_on level
     */
    public int getSampleDependsOn() {try{__CLR4_5_22fk2fklvlulc8h.R.inc(3184);
        __CLR4_5_22fk2fklvlulc8h.R.inc(3185);return sampleDependsOn;
    }finally{__CLR4_5_22fk2fklvlulc8h.R.flushNeeded();}}

    /**
     * sample_depends_on takes one of the following four values:
     * <pre>
     * 0: the dependency of this sample is unknown;
     * 1: this sample does depend on others (not an I picture);
     * 2: this sample does not depend on others (I picture);
     * 3: reserved
     * </pre>
     *
     * @param sampleDependsOn new depends on value
     */
    public void setSampleDependsOn(int sampleDependsOn) {try{__CLR4_5_22fk2fklvlulc8h.R.inc(3186);
        __CLR4_5_22fk2fklvlulc8h.R.inc(3187);this.sampleDependsOn = (byte) sampleDependsOn;
    }finally{__CLR4_5_22fk2fklvlulc8h.R.flushNeeded();}}

    /**
     * sample_is_depended_on takes one of the following four values:
     * <pre>
     * 0: the dependency of other samples on this sample is unknown;
     * 1: other samples may depend on this one (not disposable);
     * 2: no other sample depends on this one (disposable);
     * 3: reserved
     * </pre>
     *
     * @return current is_dependend_on level
     */
    public int getSampleIsDependedOn() {try{__CLR4_5_22fk2fklvlulc8h.R.inc(3188);
        __CLR4_5_22fk2fklvlulc8h.R.inc(3189);return sampleIsDependedOn;
    }finally{__CLR4_5_22fk2fklvlulc8h.R.flushNeeded();}}

    /**
     * sample_is_depended_on takes one of the following four values:
     * <pre>
     * 0: the dependency of other samples on this sample is unknown;
     * 1: other samples may depend on this one (not disposable);
     * 2: no other sample depends on this one (disposable);
     * 3: reserved
     * </pre>
     *
     * @param sampleIsDependedOn new is_depends on value
     */
    public void setSampleIsDependedOn(int sampleIsDependedOn) {try{__CLR4_5_22fk2fklvlulc8h.R.inc(3190);
        __CLR4_5_22fk2fklvlulc8h.R.inc(3191);this.sampleIsDependedOn = (byte) sampleIsDependedOn;
    }finally{__CLR4_5_22fk2fklvlulc8h.R.flushNeeded();}}

    /**
     * sample_has_redundancy takes one of the following four values:
     * <pre>
     * 0: it is unknown whether there is redundant coding in this sample;
     * 1: there is redundant coding in this sample;
     * 2: there is no redundant coding in this sample;
     * 3: reserved
     * </pre>
     *
     * @return current redundancy level
     */
    public int getSampleHasRedundancy() {try{__CLR4_5_22fk2fklvlulc8h.R.inc(3192);
        __CLR4_5_22fk2fklvlulc8h.R.inc(3193);return sampleHasRedundancy;
    }finally{__CLR4_5_22fk2fklvlulc8h.R.flushNeeded();}}

    /**
     * sample_has_redundancy takes one of the following four values:
     * <pre>
     * 0: it is unknown whether there is redundant coding in this sample;
     * 1: there is redundant coding in this sample;
     * 2: there is no redundant coding in this sample;
     * 3: reserved
     * </pre>
     *
     * @param sampleHasRedundancy new redundancy level
     */
    public void setSampleHasRedundancy(int sampleHasRedundancy) {try{__CLR4_5_22fk2fklvlulc8h.R.inc(3194);
        __CLR4_5_22fk2fklvlulc8h.R.inc(3195);this.sampleHasRedundancy = (byte) sampleHasRedundancy;
    }finally{__CLR4_5_22fk2fklvlulc8h.R.flushNeeded();}}

    public int getSamplePaddingValue() {try{__CLR4_5_22fk2fklvlulc8h.R.inc(3196);
        __CLR4_5_22fk2fklvlulc8h.R.inc(3197);return samplePaddingValue;
    }finally{__CLR4_5_22fk2fklvlulc8h.R.flushNeeded();}}

    public void setSamplePaddingValue(int samplePaddingValue) {try{__CLR4_5_22fk2fklvlulc8h.R.inc(3198);
        __CLR4_5_22fk2fklvlulc8h.R.inc(3199);this.samplePaddingValue = (byte) samplePaddingValue;
    }finally{__CLR4_5_22fk2fklvlulc8h.R.flushNeeded();}}

    public boolean isSampleIsDifferenceSample() {try{__CLR4_5_22fk2fklvlulc8h.R.inc(3200);
        __CLR4_5_22fk2fklvlulc8h.R.inc(3201);return sampleIsDifferenceSample;
    }finally{__CLR4_5_22fk2fklvlulc8h.R.flushNeeded();}}


    public void setSampleIsDifferenceSample(boolean sampleIsDifferenceSample) {try{__CLR4_5_22fk2fklvlulc8h.R.inc(3202);
        __CLR4_5_22fk2fklvlulc8h.R.inc(3203);this.sampleIsDifferenceSample = sampleIsDifferenceSample;
    }finally{__CLR4_5_22fk2fklvlulc8h.R.flushNeeded();}}

    public int getSampleDegradationPriority() {try{__CLR4_5_22fk2fklvlulc8h.R.inc(3204);
        __CLR4_5_22fk2fklvlulc8h.R.inc(3205);return sampleDegradationPriority;
    }finally{__CLR4_5_22fk2fklvlulc8h.R.flushNeeded();}}

    public void setSampleDegradationPriority(int sampleDegradationPriority) {try{__CLR4_5_22fk2fklvlulc8h.R.inc(3206);
        __CLR4_5_22fk2fklvlulc8h.R.inc(3207);this.sampleDegradationPriority = sampleDegradationPriority;
    }finally{__CLR4_5_22fk2fklvlulc8h.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_5_22fk2fklvlulc8h.R.inc(3208);
        __CLR4_5_22fk2fklvlulc8h.R.inc(3209);return "SampleFlags{" +
                "reserved=" + reserved +
                ", isLeading=" + isLeading +
                ", depOn=" + sampleDependsOn +
                ", isDepOn=" + sampleIsDependedOn +
                ", hasRedundancy=" + sampleHasRedundancy +
                ", padValue=" + samplePaddingValue +
                ", isDiffSample=" + sampleIsDifferenceSample +
                ", degradPrio=" + sampleDegradationPriority +
                '}';
    }finally{__CLR4_5_22fk2fklvlulc8h.R.flushNeeded();}}

    @Override
    public boolean equals(Object o) {try{__CLR4_5_22fk2fklvlulc8h.R.inc(3210);
        __CLR4_5_22fk2fklvlulc8h.R.inc(3211);if ((((this == o)&&(__CLR4_5_22fk2fklvlulc8h.R.iget(3212)!=0|true))||(__CLR4_5_22fk2fklvlulc8h.R.iget(3213)==0&false))) {__CLR4_5_22fk2fklvlulc8h.R.inc(3214);return true;
        }__CLR4_5_22fk2fklvlulc8h.R.inc(3215);if ((((o == null || getClass() != o.getClass())&&(__CLR4_5_22fk2fklvlulc8h.R.iget(3216)!=0|true))||(__CLR4_5_22fk2fklvlulc8h.R.iget(3217)==0&false))) {__CLR4_5_22fk2fklvlulc8h.R.inc(3218);return false;

        }__CLR4_5_22fk2fklvlulc8h.R.inc(3219);SampleFlags that = (SampleFlags) o;

        __CLR4_5_22fk2fklvlulc8h.R.inc(3220);if ((((isLeading != that.isLeading)&&(__CLR4_5_22fk2fklvlulc8h.R.iget(3221)!=0|true))||(__CLR4_5_22fk2fklvlulc8h.R.iget(3222)==0&false))) {__CLR4_5_22fk2fklvlulc8h.R.inc(3223);return false;
        }__CLR4_5_22fk2fklvlulc8h.R.inc(3224);if ((((reserved != that.reserved)&&(__CLR4_5_22fk2fklvlulc8h.R.iget(3225)!=0|true))||(__CLR4_5_22fk2fklvlulc8h.R.iget(3226)==0&false))) {__CLR4_5_22fk2fklvlulc8h.R.inc(3227);return false;
        }__CLR4_5_22fk2fklvlulc8h.R.inc(3228);if ((((sampleDegradationPriority != that.sampleDegradationPriority)&&(__CLR4_5_22fk2fklvlulc8h.R.iget(3229)!=0|true))||(__CLR4_5_22fk2fklvlulc8h.R.iget(3230)==0&false))) {__CLR4_5_22fk2fklvlulc8h.R.inc(3231);return false;
        }__CLR4_5_22fk2fklvlulc8h.R.inc(3232);if ((((sampleDependsOn != that.sampleDependsOn)&&(__CLR4_5_22fk2fklvlulc8h.R.iget(3233)!=0|true))||(__CLR4_5_22fk2fklvlulc8h.R.iget(3234)==0&false))) {__CLR4_5_22fk2fklvlulc8h.R.inc(3235);return false;
        }__CLR4_5_22fk2fklvlulc8h.R.inc(3236);if ((((sampleHasRedundancy != that.sampleHasRedundancy)&&(__CLR4_5_22fk2fklvlulc8h.R.iget(3237)!=0|true))||(__CLR4_5_22fk2fklvlulc8h.R.iget(3238)==0&false))) {__CLR4_5_22fk2fklvlulc8h.R.inc(3239);return false;
        }__CLR4_5_22fk2fklvlulc8h.R.inc(3240);if ((((sampleIsDependedOn != that.sampleIsDependedOn)&&(__CLR4_5_22fk2fklvlulc8h.R.iget(3241)!=0|true))||(__CLR4_5_22fk2fklvlulc8h.R.iget(3242)==0&false))) {__CLR4_5_22fk2fklvlulc8h.R.inc(3243);return false;
        }__CLR4_5_22fk2fklvlulc8h.R.inc(3244);if ((((sampleIsDifferenceSample != that.sampleIsDifferenceSample)&&(__CLR4_5_22fk2fklvlulc8h.R.iget(3245)!=0|true))||(__CLR4_5_22fk2fklvlulc8h.R.iget(3246)==0&false))) {__CLR4_5_22fk2fklvlulc8h.R.inc(3247);return false;
        }__CLR4_5_22fk2fklvlulc8h.R.inc(3248);if ((((samplePaddingValue != that.samplePaddingValue)&&(__CLR4_5_22fk2fklvlulc8h.R.iget(3249)!=0|true))||(__CLR4_5_22fk2fklvlulc8h.R.iget(3250)==0&false))) {__CLR4_5_22fk2fklvlulc8h.R.inc(3251);return false;

        }__CLR4_5_22fk2fklvlulc8h.R.inc(3252);return true;
    }finally{__CLR4_5_22fk2fklvlulc8h.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_5_22fk2fklvlulc8h.R.inc(3253);
        __CLR4_5_22fk2fklvlulc8h.R.inc(3254);int result = (int) reserved;
        __CLR4_5_22fk2fklvlulc8h.R.inc(3255);result = 31 * result + (int) isLeading;
        __CLR4_5_22fk2fklvlulc8h.R.inc(3256);result = 31 * result + (int) sampleDependsOn;
        __CLR4_5_22fk2fklvlulc8h.R.inc(3257);result = 31 * result + (int) sampleIsDependedOn;
        __CLR4_5_22fk2fklvlulc8h.R.inc(3258);result = 31 * result + (int) sampleHasRedundancy;
        __CLR4_5_22fk2fklvlulc8h.R.inc(3259);result = 31 * result + (int) samplePaddingValue;
        __CLR4_5_22fk2fklvlulc8h.R.inc(3260);result = 31 * result + ((((sampleIsDifferenceSample )&&(__CLR4_5_22fk2fklvlulc8h.R.iget(3261)!=0|true))||(__CLR4_5_22fk2fklvlulc8h.R.iget(3262)==0&false))? 1 : 0);
        __CLR4_5_22fk2fklvlulc8h.R.inc(3263);result = 31 * result + sampleDegradationPriority;
        __CLR4_5_22fk2fklvlulc8h.R.inc(3264);return result;
    }finally{__CLR4_5_22fk2fklvlulc8h.R.flushNeeded();}}
}
