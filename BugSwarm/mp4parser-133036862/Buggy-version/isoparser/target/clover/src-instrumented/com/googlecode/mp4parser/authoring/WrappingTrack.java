/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.googlecode.mp4parser.authoring;


import com.coremedia.iso.boxes.CompositionTimeToSample;
import com.coremedia.iso.boxes.SampleDependencyTypeBox;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * A simple track wrapper that delegates all calls to parent track. Override certain methods inline to change result.
 */
public class WrappingTrack implements Track {public static class __CLR4_5_24lp4lplvluldnv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,5995,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    Track parent;

    public WrappingTrack(Track parent) {try{__CLR4_5_24lp4lplvluldnv.R.inc(5965);
        __CLR4_5_24lp4lplvluldnv.R.inc(5966);this.parent = parent;
    }finally{__CLR4_5_24lp4lplvluldnv.R.flushNeeded();}}

    public SampleDescriptionBox getSampleDescriptionBox() {try{__CLR4_5_24lp4lplvluldnv.R.inc(5967);
        __CLR4_5_24lp4lplvluldnv.R.inc(5968);return parent.getSampleDescriptionBox();
    }finally{__CLR4_5_24lp4lplvluldnv.R.flushNeeded();}}

    public long[] getSampleDurations() {try{__CLR4_5_24lp4lplvluldnv.R.inc(5969);
        __CLR4_5_24lp4lplvluldnv.R.inc(5970);return parent.getSampleDurations();
    }finally{__CLR4_5_24lp4lplvluldnv.R.flushNeeded();}}

    public long getDuration() {try{__CLR4_5_24lp4lplvluldnv.R.inc(5971);
        __CLR4_5_24lp4lplvluldnv.R.inc(5972);return parent.getDuration();
    }finally{__CLR4_5_24lp4lplvluldnv.R.flushNeeded();}}

    public List<CompositionTimeToSample.Entry> getCompositionTimeEntries() {try{__CLR4_5_24lp4lplvluldnv.R.inc(5973);
        __CLR4_5_24lp4lplvluldnv.R.inc(5974);return parent.getCompositionTimeEntries();
    }finally{__CLR4_5_24lp4lplvluldnv.R.flushNeeded();}}

    public long[] getSyncSamples() {try{__CLR4_5_24lp4lplvluldnv.R.inc(5975);
        __CLR4_5_24lp4lplvluldnv.R.inc(5976);return parent.getSyncSamples();
    }finally{__CLR4_5_24lp4lplvluldnv.R.flushNeeded();}}

    public List<SampleDependencyTypeBox.Entry> getSampleDependencies() {try{__CLR4_5_24lp4lplvluldnv.R.inc(5977);
        __CLR4_5_24lp4lplvluldnv.R.inc(5978);return parent.getSampleDependencies();
    }finally{__CLR4_5_24lp4lplvluldnv.R.flushNeeded();}}

    public TrackMetaData getTrackMetaData() {try{__CLR4_5_24lp4lplvluldnv.R.inc(5979);
        __CLR4_5_24lp4lplvluldnv.R.inc(5980);return parent.getTrackMetaData();
    }finally{__CLR4_5_24lp4lplvluldnv.R.flushNeeded();}}

    public String getHandler() {try{__CLR4_5_24lp4lplvluldnv.R.inc(5981);
        __CLR4_5_24lp4lplvluldnv.R.inc(5982);return parent.getHandler();
    }finally{__CLR4_5_24lp4lplvluldnv.R.flushNeeded();}}

    public List<Sample> getSamples() {try{__CLR4_5_24lp4lplvluldnv.R.inc(5983);
        __CLR4_5_24lp4lplvluldnv.R.inc(5984);return parent.getSamples();
    }finally{__CLR4_5_24lp4lplvluldnv.R.flushNeeded();}}

    public SubSampleInformationBox getSubsampleInformationBox() {try{__CLR4_5_24lp4lplvluldnv.R.inc(5985);
        __CLR4_5_24lp4lplvluldnv.R.inc(5986);return parent.getSubsampleInformationBox();
    }finally{__CLR4_5_24lp4lplvluldnv.R.flushNeeded();}}

    public String getName() {try{__CLR4_5_24lp4lplvluldnv.R.inc(5987);
        __CLR4_5_24lp4lplvluldnv.R.inc(5988);return parent.getName() + "'";
    }finally{__CLR4_5_24lp4lplvluldnv.R.flushNeeded();}}

    public List<Edit> getEdits() {try{__CLR4_5_24lp4lplvluldnv.R.inc(5989);
        __CLR4_5_24lp4lplvluldnv.R.inc(5990);return parent.getEdits();
    }finally{__CLR4_5_24lp4lplvluldnv.R.flushNeeded();}}

    public void close() throws IOException {try{__CLR4_5_24lp4lplvluldnv.R.inc(5991);
        __CLR4_5_24lp4lplvluldnv.R.inc(5992);parent.close();
    }finally{__CLR4_5_24lp4lplvluldnv.R.flushNeeded();}}

    public Map<GroupEntry, long[]> getSampleGroups() {try{__CLR4_5_24lp4lplvluldnv.R.inc(5993);
        __CLR4_5_24lp4lplvluldnv.R.inc(5994);return parent.getSampleGroups();
    }finally{__CLR4_5_24lp4lplvluldnv.R.flushNeeded();}}
}
