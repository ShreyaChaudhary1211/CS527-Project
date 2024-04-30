/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.googlecode.mp4parser.authoring.builder;

import com.coremedia.iso.boxes.CompositionTimeToSample;
import com.coremedia.iso.boxes.SampleDependencyTypeBox;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import com.googlecode.mp4parser.authoring.Edit;
import com.googlecode.mp4parser.authoring.Sample;
import com.googlecode.mp4parser.authoring.Track;
import com.googlecode.mp4parser.authoring.TrackMetaData;
import com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;


public class BetterFragmenterTest {static class __CLR4_5_2jm3jm3lvlulqpx{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448889527L,8589935092L,25465,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void verify(long additional, long[] in, long[] expectedOut) {try{__CLR4_5_2jm3jm3lvlulqpx.R.inc(25419);
        __CLR4_5_2jm3jm3lvlulqpx.R.inc(25420);Track t = new DummyTrack(additional, in);
        __CLR4_5_2jm3jm3lvlulqpx.R.inc(25421);Fragmenter f = new BetterFragmenter(2.0);
        __CLR4_5_2jm3jm3lvlulqpx.R.inc(25422);long[] segmentStarter = f.sampleNumbers(t);
        __CLR4_5_2jm3jm3lvlulqpx.R.inc(25423);Assert.assertArrayEquals(expectedOut, segmentStarter);
    }finally{__CLR4_5_2jm3jm3lvlulqpx.R.flushNeeded();}}

    @Test
    public void testPatterns() throws Exception {__CLR4_5_2jm3jm3lvlulqpx.R.globalSliceStart(getClass().getName(),25424);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ol7ykkjm8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jm3jm3lvlulqpx.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jm3jm3lvlulqpx.R.globalSliceEnd(getClass().getName(),"com.googlecode.mp4parser.authoring.builder.BetterFragmenterTest.testPatterns",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25424,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ol7ykkjm8() throws Exception{try{__CLR4_5_2jm3jm3lvlulqpx.R.inc(25424);
        __CLR4_5_2jm3jm3lvlulqpx.R.inc(25425);verify(5, new long[]{1, 51, 62, 101}, new long[]{1, 51});
        __CLR4_5_2jm3jm3lvlulqpx.R.inc(25426);verify(50, new long[]{1, 6, 52, 101}, new long[]{1, 52, 101});
        __CLR4_5_2jm3jm3lvlulqpx.R.inc(25427);verify(50, new long[]{1, 51, 62, 101}, new long[]{1, 51, 101});
    }finally{__CLR4_5_2jm3jm3lvlulqpx.R.flushNeeded();}}

    class DummyTrack implements Track {

        long[] syncSamples;
        long[] sampleDurations;

        public DummyTrack(long additional, long... syncSamples) {try{__CLR4_5_2jm3jm3lvlulqpx.R.inc(25428);
            __CLR4_5_2jm3jm3lvlulqpx.R.inc(25429);this.syncSamples = syncSamples;
            __CLR4_5_2jm3jm3lvlulqpx.R.inc(25430);int lastSample = (int) (syncSamples[syncSamples.length - 1] + additional);
            __CLR4_5_2jm3jm3lvlulqpx.R.inc(25431);sampleDurations = new long[lastSample];
            __CLR4_5_2jm3jm3lvlulqpx.R.inc(25432);Arrays.fill(sampleDurations, 40);


        }finally{__CLR4_5_2jm3jm3lvlulqpx.R.flushNeeded();}}

        public SampleDescriptionBox getSampleDescriptionBox() {try{__CLR4_5_2jm3jm3lvlulqpx.R.inc(25433);
            __CLR4_5_2jm3jm3lvlulqpx.R.inc(25434);return null;
        }finally{__CLR4_5_2jm3jm3lvlulqpx.R.flushNeeded();}}

        public long[] getSampleDurations() {try{__CLR4_5_2jm3jm3lvlulqpx.R.inc(25435);
            __CLR4_5_2jm3jm3lvlulqpx.R.inc(25436);return sampleDurations;
        }finally{__CLR4_5_2jm3jm3lvlulqpx.R.flushNeeded();}}

        public long getDuration() {try{__CLR4_5_2jm3jm3lvlulqpx.R.inc(25437);
            __CLR4_5_2jm3jm3lvlulqpx.R.inc(25438);long duration = 0;
            __CLR4_5_2jm3jm3lvlulqpx.R.inc(25439);for (long delta : getSampleDurations()) {{
                __CLR4_5_2jm3jm3lvlulqpx.R.inc(25440);duration += delta;
            }
            }__CLR4_5_2jm3jm3lvlulqpx.R.inc(25441);return duration;
        }finally{__CLR4_5_2jm3jm3lvlulqpx.R.flushNeeded();}}

        public List<CompositionTimeToSample.Entry> getCompositionTimeEntries() {try{__CLR4_5_2jm3jm3lvlulqpx.R.inc(25442);
            __CLR4_5_2jm3jm3lvlulqpx.R.inc(25443);return null;
        }finally{__CLR4_5_2jm3jm3lvlulqpx.R.flushNeeded();}}

        public long[] getSyncSamples() {try{__CLR4_5_2jm3jm3lvlulqpx.R.inc(25444);

            __CLR4_5_2jm3jm3lvlulqpx.R.inc(25445);return syncSamples;
        }finally{__CLR4_5_2jm3jm3lvlulqpx.R.flushNeeded();}}


        public List<SampleDependencyTypeBox.Entry> getSampleDependencies() {try{__CLR4_5_2jm3jm3lvlulqpx.R.inc(25446);
            __CLR4_5_2jm3jm3lvlulqpx.R.inc(25447);return null;
        }finally{__CLR4_5_2jm3jm3lvlulqpx.R.flushNeeded();}}


        public TrackMetaData getTrackMetaData() {try{__CLR4_5_2jm3jm3lvlulqpx.R.inc(25448);
            __CLR4_5_2jm3jm3lvlulqpx.R.inc(25449);TrackMetaData tmd = new TrackMetaData();
            __CLR4_5_2jm3jm3lvlulqpx.R.inc(25450);tmd.setTimescale(1000);
            __CLR4_5_2jm3jm3lvlulqpx.R.inc(25451);return tmd;
        }finally{__CLR4_5_2jm3jm3lvlulqpx.R.flushNeeded();}}


        public String getHandler() {try{__CLR4_5_2jm3jm3lvlulqpx.R.inc(25452);
            __CLR4_5_2jm3jm3lvlulqpx.R.inc(25453);return null;
        }finally{__CLR4_5_2jm3jm3lvlulqpx.R.flushNeeded();}}


        public List<Sample> getSamples() {try{__CLR4_5_2jm3jm3lvlulqpx.R.inc(25454);
            __CLR4_5_2jm3jm3lvlulqpx.R.inc(25455);return null;
        }finally{__CLR4_5_2jm3jm3lvlulqpx.R.flushNeeded();}}


        public SubSampleInformationBox getSubsampleInformationBox() {try{__CLR4_5_2jm3jm3lvlulqpx.R.inc(25456);
            __CLR4_5_2jm3jm3lvlulqpx.R.inc(25457);return null;
        }finally{__CLR4_5_2jm3jm3lvlulqpx.R.flushNeeded();}}


        public String getName() {try{__CLR4_5_2jm3jm3lvlulqpx.R.inc(25458);
            __CLR4_5_2jm3jm3lvlulqpx.R.inc(25459);return null;
        }finally{__CLR4_5_2jm3jm3lvlulqpx.R.flushNeeded();}}


        public List<Edit> getEdits() {try{__CLR4_5_2jm3jm3lvlulqpx.R.inc(25460);
            __CLR4_5_2jm3jm3lvlulqpx.R.inc(25461);return null;
        }finally{__CLR4_5_2jm3jm3lvlulqpx.R.flushNeeded();}}


        public Map<GroupEntry, long[]> getSampleGroups() {try{__CLR4_5_2jm3jm3lvlulqpx.R.inc(25462);
            __CLR4_5_2jm3jm3lvlulqpx.R.inc(25463);return null;
        }finally{__CLR4_5_2jm3jm3lvlulqpx.R.flushNeeded();}}


        public void close() throws IOException {try{__CLR4_5_2jm3jm3lvlulqpx.R.inc(25464);

        }finally{__CLR4_5_2jm3jm3lvlulqpx.R.flushNeeded();}}
    }
}