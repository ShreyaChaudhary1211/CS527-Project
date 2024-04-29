/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.mp4parser.streaming.extensions;

import com.mp4parser.streaming.SampleExtension;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SampleFlagsSampleExtension implements SampleExtension {public static class __CLR4_5_2hn7hn7lvl9elgj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,22918,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static Map<Long, SampleFlagsSampleExtension> pool =
            Collections.synchronizedMap(new HashMap<Long, SampleFlagsSampleExtension>());

    private byte isLeading, sampleDependsOn, sampleIsDependedOn, sampleHasRedundancy, samplePaddingValue;
    private boolean sampleIsNonSyncSample;
    private int sampleDegradationPriority;

    public static SampleFlagsSampleExtension create(
            byte isLeading, byte sampleDependsOn, byte sampleIsDependedOn,
            byte sampleHasRedundancy, byte samplePaddingValue, boolean sampleIsNonSyncSample, int sampleDegradationPriority) {try{__CLR4_5_2hn7hn7lvl9elgj.R.inc(22867);
        __CLR4_5_2hn7hn7lvl9elgj.R.inc(22868);long key = isLeading + (sampleDependsOn << 2) + (sampleIsDependedOn << 4) + (sampleHasRedundancy << 6);
        __CLR4_5_2hn7hn7lvl9elgj.R.inc(22869);key += (samplePaddingValue<<8);
        __CLR4_5_2hn7hn7lvl9elgj.R.inc(22870);key += (sampleDegradationPriority<<11);
        __CLR4_5_2hn7hn7lvl9elgj.R.inc(22871);key += ((((sampleIsNonSyncSample)&&(__CLR4_5_2hn7hn7lvl9elgj.R.iget(22872)!=0|true))||(__CLR4_5_2hn7hn7lvl9elgj.R.iget(22873)==0&false))?1:0)<<27;

        __CLR4_5_2hn7hn7lvl9elgj.R.inc(22874);SampleFlagsSampleExtension c = pool.get(key);
        __CLR4_5_2hn7hn7lvl9elgj.R.inc(22875);if ((((c == null)&&(__CLR4_5_2hn7hn7lvl9elgj.R.iget(22876)!=0|true))||(__CLR4_5_2hn7hn7lvl9elgj.R.iget(22877)==0&false))) {{
            __CLR4_5_2hn7hn7lvl9elgj.R.inc(22878);c = new SampleFlagsSampleExtension();
            __CLR4_5_2hn7hn7lvl9elgj.R.inc(22879);c.isLeading = isLeading;
            __CLR4_5_2hn7hn7lvl9elgj.R.inc(22880);c.sampleDependsOn = sampleDependsOn;
            __CLR4_5_2hn7hn7lvl9elgj.R.inc(22881);c.sampleIsDependedOn = sampleIsDependedOn;
            __CLR4_5_2hn7hn7lvl9elgj.R.inc(22882);c.sampleHasRedundancy = sampleHasRedundancy;
            __CLR4_5_2hn7hn7lvl9elgj.R.inc(22883);c.samplePaddingValue = samplePaddingValue;
            __CLR4_5_2hn7hn7lvl9elgj.R.inc(22884);c.sampleIsNonSyncSample = sampleIsNonSyncSample;
            __CLR4_5_2hn7hn7lvl9elgj.R.inc(22885);c.sampleDegradationPriority = sampleDegradationPriority;
            __CLR4_5_2hn7hn7lvl9elgj.R.inc(22886);pool.put(key, c);
        }
        }__CLR4_5_2hn7hn7lvl9elgj.R.inc(22887);return c;
    }finally{__CLR4_5_2hn7hn7lvl9elgj.R.flushNeeded();}}


    public byte getIsLeading() {try{__CLR4_5_2hn7hn7lvl9elgj.R.inc(22888);
        __CLR4_5_2hn7hn7lvl9elgj.R.inc(22889);return isLeading;
    }finally{__CLR4_5_2hn7hn7lvl9elgj.R.flushNeeded();}}

    public void setIsLeading(byte isLeading) {try{__CLR4_5_2hn7hn7lvl9elgj.R.inc(22890);
        __CLR4_5_2hn7hn7lvl9elgj.R.inc(22891);this.isLeading = isLeading;
    }finally{__CLR4_5_2hn7hn7lvl9elgj.R.flushNeeded();}}

    public byte getSampleDependsOn() {try{__CLR4_5_2hn7hn7lvl9elgj.R.inc(22892);
        __CLR4_5_2hn7hn7lvl9elgj.R.inc(22893);return sampleDependsOn;
    }finally{__CLR4_5_2hn7hn7lvl9elgj.R.flushNeeded();}}

    public void setSampleDependsOn(byte sampleDependsOn) {try{__CLR4_5_2hn7hn7lvl9elgj.R.inc(22894);
        __CLR4_5_2hn7hn7lvl9elgj.R.inc(22895);this.sampleDependsOn = sampleDependsOn;
    }finally{__CLR4_5_2hn7hn7lvl9elgj.R.flushNeeded();}}

    public byte getSampleIsDependedOn() {try{__CLR4_5_2hn7hn7lvl9elgj.R.inc(22896);
        __CLR4_5_2hn7hn7lvl9elgj.R.inc(22897);return sampleIsDependedOn;
    }finally{__CLR4_5_2hn7hn7lvl9elgj.R.flushNeeded();}}

    public void setSampleIsDependedOn(byte sampleIsDependedOn) {try{__CLR4_5_2hn7hn7lvl9elgj.R.inc(22898);
        __CLR4_5_2hn7hn7lvl9elgj.R.inc(22899);this.sampleIsDependedOn = sampleIsDependedOn;
    }finally{__CLR4_5_2hn7hn7lvl9elgj.R.flushNeeded();}}

    public byte getSampleHasRedundancy() {try{__CLR4_5_2hn7hn7lvl9elgj.R.inc(22900);
        __CLR4_5_2hn7hn7lvl9elgj.R.inc(22901);return sampleHasRedundancy;
    }finally{__CLR4_5_2hn7hn7lvl9elgj.R.flushNeeded();}}

    public void setSampleHasRedundancy(byte sampleHasRedundancy) {try{__CLR4_5_2hn7hn7lvl9elgj.R.inc(22902);
        __CLR4_5_2hn7hn7lvl9elgj.R.inc(22903);this.sampleHasRedundancy = sampleHasRedundancy;
    }finally{__CLR4_5_2hn7hn7lvl9elgj.R.flushNeeded();}}

    public byte getSamplePaddingValue() {try{__CLR4_5_2hn7hn7lvl9elgj.R.inc(22904);
        __CLR4_5_2hn7hn7lvl9elgj.R.inc(22905);return samplePaddingValue;
    }finally{__CLR4_5_2hn7hn7lvl9elgj.R.flushNeeded();}}

    public void setSamplePaddingValue(byte samplePaddingValue) {try{__CLR4_5_2hn7hn7lvl9elgj.R.inc(22906);
        __CLR4_5_2hn7hn7lvl9elgj.R.inc(22907);this.samplePaddingValue = samplePaddingValue;
    }finally{__CLR4_5_2hn7hn7lvl9elgj.R.flushNeeded();}}

    public boolean isSampleIsNonSyncSample() {try{__CLR4_5_2hn7hn7lvl9elgj.R.inc(22908);
        __CLR4_5_2hn7hn7lvl9elgj.R.inc(22909);return sampleIsNonSyncSample;
    }finally{__CLR4_5_2hn7hn7lvl9elgj.R.flushNeeded();}}

    public boolean isSyncSample() {try{__CLR4_5_2hn7hn7lvl9elgj.R.inc(22910);
        __CLR4_5_2hn7hn7lvl9elgj.R.inc(22911);return !sampleIsNonSyncSample;
    }finally{__CLR4_5_2hn7hn7lvl9elgj.R.flushNeeded();}}

    public void setSampleIsNonSyncSample(boolean sampleIsNonSyncSample) {try{__CLR4_5_2hn7hn7lvl9elgj.R.inc(22912);
        __CLR4_5_2hn7hn7lvl9elgj.R.inc(22913);this.sampleIsNonSyncSample = sampleIsNonSyncSample;
    }finally{__CLR4_5_2hn7hn7lvl9elgj.R.flushNeeded();}}

    public int getSampleDegradationPriority() {try{__CLR4_5_2hn7hn7lvl9elgj.R.inc(22914);
        __CLR4_5_2hn7hn7lvl9elgj.R.inc(22915);return sampleDegradationPriority;
    }finally{__CLR4_5_2hn7hn7lvl9elgj.R.flushNeeded();}}

    public void setSampleDegradationPriority(int sampleDegradationPriority) {try{__CLR4_5_2hn7hn7lvl9elgj.R.inc(22916);
        __CLR4_5_2hn7hn7lvl9elgj.R.inc(22917);this.sampleDegradationPriority = sampleDegradationPriority;
    }finally{__CLR4_5_2hn7hn7lvl9elgj.R.flushNeeded();}}
}
