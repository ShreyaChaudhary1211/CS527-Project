/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.mp4parser.streaming;

import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.TrackHeaderBox;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public abstract class AbstractStreamingTrack implements StreamingTrack {public static class __CLR4_5_2h6sh6slvl9eld8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,22293,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    protected BlockingQueue<StreamingSample> samples = new ArrayBlockingQueue<StreamingSample>(1000);
    protected TrackHeaderBox tkhd;
    protected SampleDescriptionBox stsd;
    protected HashMap<Class<? extends TrackExtension>, TrackExtension> trackExtensions = new HashMap<Class<? extends TrackExtension>, TrackExtension>();

    public AbstractStreamingTrack() {try{__CLR4_5_2h6sh6slvl9eld8.R.inc(22276);
        __CLR4_5_2h6sh6slvl9eld8.R.inc(22277);tkhd = new TrackHeaderBox();
        __CLR4_5_2h6sh6slvl9eld8.R.inc(22278);tkhd.setTrackId(1);
    }finally{__CLR4_5_2h6sh6slvl9eld8.R.flushNeeded();}}

    public BlockingQueue<StreamingSample> getSamples() {try{__CLR4_5_2h6sh6slvl9eld8.R.inc(22279);
        __CLR4_5_2h6sh6slvl9eld8.R.inc(22280);return samples;
    }finally{__CLR4_5_2h6sh6slvl9eld8.R.flushNeeded();}}

    public boolean hasMoreSamples() {try{__CLR4_5_2h6sh6slvl9eld8.R.inc(22281);
        __CLR4_5_2h6sh6slvl9eld8.R.inc(22282);return false;
    }finally{__CLR4_5_2h6sh6slvl9eld8.R.flushNeeded();}}

    public TrackHeaderBox getTrackHeaderBox() {try{__CLR4_5_2h6sh6slvl9eld8.R.inc(22283);
        __CLR4_5_2h6sh6slvl9eld8.R.inc(22284);return tkhd;
    }finally{__CLR4_5_2h6sh6slvl9eld8.R.flushNeeded();}}

    public SampleDescriptionBox getSampleDescriptionBox() {try{__CLR4_5_2h6sh6slvl9eld8.R.inc(22285);
        __CLR4_5_2h6sh6slvl9eld8.R.inc(22286);return stsd;
    }finally{__CLR4_5_2h6sh6slvl9eld8.R.flushNeeded();}}


    public <T extends TrackExtension> T getTrackExtension(Class<T> clazz) {try{__CLR4_5_2h6sh6slvl9eld8.R.inc(22287);
        __CLR4_5_2h6sh6slvl9eld8.R.inc(22288);return (T) trackExtensions.get(clazz);
    }finally{__CLR4_5_2h6sh6slvl9eld8.R.flushNeeded();}}

    public void addTrackExtension(TrackExtension trackExtension) {try{__CLR4_5_2h6sh6slvl9eld8.R.inc(22289);

        __CLR4_5_2h6sh6slvl9eld8.R.inc(22290);trackExtensions.put(trackExtension.getClass(), trackExtension);
    }finally{__CLR4_5_2h6sh6slvl9eld8.R.flushNeeded();}}

    public void removeTrackExtension(Class<? extends TrackExtension> clazz) {try{__CLR4_5_2h6sh6slvl9eld8.R.inc(22291);
        __CLR4_5_2h6sh6slvl9eld8.R.inc(22292);trackExtensions.remove(clazz);
    }finally{__CLR4_5_2h6sh6slvl9eld8.R.flushNeeded();}}
}
