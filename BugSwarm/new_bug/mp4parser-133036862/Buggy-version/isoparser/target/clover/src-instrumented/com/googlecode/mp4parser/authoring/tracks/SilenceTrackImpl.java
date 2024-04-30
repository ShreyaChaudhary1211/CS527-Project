/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.boxes.CompositionTimeToSample;
import com.coremedia.iso.boxes.SampleDependencyTypeBox;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import com.googlecode.mp4parser.authoring.*;
import com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import static com.googlecode.mp4parser.util.CastUtils.l2i;

/**
 * This is just a basic idea how things could work but they don't.
 */
public class SilenceTrackImpl implements Track {public static class __CLR4_5_28l78l7lvluli7m{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,11175,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    Track source;

    List<Sample> samples = new LinkedList<Sample>();
    long[] decodingTimes;
    String name;

    public SilenceTrackImpl(Track ofType, long ms) {try{__CLR4_5_28l78l7lvluli7m.R.inc(11131);
        __CLR4_5_28l78l7lvluli7m.R.inc(11132);source = ofType;
        __CLR4_5_28l78l7lvluli7m.R.inc(11133);name = "" + ms + "ms silence";
        __CLR4_5_28l78l7lvluli7m.R.inc(11134);if (((("mp4a".equals(ofType.getSampleDescriptionBox().getSampleEntry().getType()))&&(__CLR4_5_28l78l7lvluli7m.R.iget(11135)!=0|true))||(__CLR4_5_28l78l7lvluli7m.R.iget(11136)==0&false))) {{
            __CLR4_5_28l78l7lvluli7m.R.inc(11137);int numFrames = l2i(getTrackMetaData().getTimescale() * ms / 1000 / 1024);
            __CLR4_5_28l78l7lvluli7m.R.inc(11138);decodingTimes = new long[numFrames];
            __CLR4_5_28l78l7lvluli7m.R.inc(11139);Arrays.fill(decodingTimes, getTrackMetaData().getTimescale() * ms / numFrames / 1000);

            __CLR4_5_28l78l7lvluli7m.R.inc(11140);while ((((numFrames-- > 0)&&(__CLR4_5_28l78l7lvluli7m.R.iget(11141)!=0|true))||(__CLR4_5_28l78l7lvluli7m.R.iget(11142)==0&false))) {{
                __CLR4_5_28l78l7lvluli7m.R.inc(11143);samples.add(new SampleImpl((ByteBuffer) ByteBuffer.wrap(new byte[]{
                        0x21, 0x10, 0x04, 0x60, (byte) 0x8c, 0x1c,
                }).rewind()));
            }

        }} }else {{
            __CLR4_5_28l78l7lvluli7m.R.inc(11144);throw new RuntimeException("Tracks of type " + ofType.getClass().getSimpleName() + " are not supported");
        }
    }}finally{__CLR4_5_28l78l7lvluli7m.R.flushNeeded();}}

    public void close() throws IOException {try{__CLR4_5_28l78l7lvluli7m.R.inc(11145);
        // nothing to close
    }finally{__CLR4_5_28l78l7lvluli7m.R.flushNeeded();}}

    public SampleDescriptionBox getSampleDescriptionBox() {try{__CLR4_5_28l78l7lvluli7m.R.inc(11146);
        __CLR4_5_28l78l7lvluli7m.R.inc(11147);return source.getSampleDescriptionBox();
    }finally{__CLR4_5_28l78l7lvluli7m.R.flushNeeded();}}

    public long[] getSampleDurations() {try{__CLR4_5_28l78l7lvluli7m.R.inc(11148);
        __CLR4_5_28l78l7lvluli7m.R.inc(11149);return decodingTimes;
    }finally{__CLR4_5_28l78l7lvluli7m.R.flushNeeded();}}

    public long getDuration() {try{__CLR4_5_28l78l7lvluli7m.R.inc(11150);
        __CLR4_5_28l78l7lvluli7m.R.inc(11151);long duration = 0;
        __CLR4_5_28l78l7lvluli7m.R.inc(11152);for (long delta : decodingTimes) {{
            __CLR4_5_28l78l7lvluli7m.R.inc(11153);duration += delta;
        }
        }__CLR4_5_28l78l7lvluli7m.R.inc(11154);return duration;
    }finally{__CLR4_5_28l78l7lvluli7m.R.flushNeeded();}}

    public TrackMetaData getTrackMetaData() {try{__CLR4_5_28l78l7lvluli7m.R.inc(11155);
        __CLR4_5_28l78l7lvluli7m.R.inc(11156);return source.getTrackMetaData();
    }finally{__CLR4_5_28l78l7lvluli7m.R.flushNeeded();}}

    public String getHandler() {try{__CLR4_5_28l78l7lvluli7m.R.inc(11157);
        __CLR4_5_28l78l7lvluli7m.R.inc(11158);return source.getHandler();
    }finally{__CLR4_5_28l78l7lvluli7m.R.flushNeeded();}}


    public List<Sample> getSamples() {try{__CLR4_5_28l78l7lvluli7m.R.inc(11159);
        __CLR4_5_28l78l7lvluli7m.R.inc(11160);return samples;
    }finally{__CLR4_5_28l78l7lvluli7m.R.flushNeeded();}}

    public SubSampleInformationBox getSubsampleInformationBox() {try{__CLR4_5_28l78l7lvluli7m.R.inc(11161);
        __CLR4_5_28l78l7lvluli7m.R.inc(11162);return null;
    }finally{__CLR4_5_28l78l7lvluli7m.R.flushNeeded();}}

    public List<CompositionTimeToSample.Entry> getCompositionTimeEntries() {try{__CLR4_5_28l78l7lvluli7m.R.inc(11163);
        __CLR4_5_28l78l7lvluli7m.R.inc(11164);return null;
    }finally{__CLR4_5_28l78l7lvluli7m.R.flushNeeded();}}

    public long[] getSyncSamples() {try{__CLR4_5_28l78l7lvluli7m.R.inc(11165);
        __CLR4_5_28l78l7lvluli7m.R.inc(11166);return null;
    }finally{__CLR4_5_28l78l7lvluli7m.R.flushNeeded();}}

    public List<SampleDependencyTypeBox.Entry> getSampleDependencies() {try{__CLR4_5_28l78l7lvluli7m.R.inc(11167);
        __CLR4_5_28l78l7lvluli7m.R.inc(11168);return null;
    }finally{__CLR4_5_28l78l7lvluli7m.R.flushNeeded();}}

    public String getName() {try{__CLR4_5_28l78l7lvluli7m.R.inc(11169);
        __CLR4_5_28l78l7lvluli7m.R.inc(11170);return name;
    }finally{__CLR4_5_28l78l7lvluli7m.R.flushNeeded();}}

    public List<Edit> getEdits() {try{__CLR4_5_28l78l7lvluli7m.R.inc(11171);
        __CLR4_5_28l78l7lvluli7m.R.inc(11172);return null;
    }finally{__CLR4_5_28l78l7lvluli7m.R.flushNeeded();}}

    public Map<GroupEntry, long[]> getSampleGroups() {try{__CLR4_5_28l78l7lvluli7m.R.inc(11173);
        __CLR4_5_28l78l7lvluli7m.R.inc(11174);return source.getSampleGroups();
    }finally{__CLR4_5_28l78l7lvluli7m.R.flushNeeded();}}
}
