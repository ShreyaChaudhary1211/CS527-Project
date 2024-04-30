/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.boxes.CompositionTimeToSample;
import com.coremedia.iso.boxes.TimeToSampleBox;
import junit.framework.Assert;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: sannies
 * Date: 10/28/12
 * Time: 1:33 PM
 * To change this template use File | Settings | File Templates.
 */
public class CroppedTrackTest {static class __CLR4_5_2jsmjsmlvlulqy3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448889527L,8589935092L,25750,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @Test
    public void testGetDecodingTimeEntries() throws Exception {__CLR4_5_2jsmjsmlvlulqy3.R.globalSliceStart(getClass().getName(),25654);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rqp9phjsm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jsmjsmlvlulqy3.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jsmjsmlvlulqy3.R.globalSliceEnd(getClass().getName(),"com.googlecode.mp4parser.authoring.tracks.CroppedTrackTest.testGetDecodingTimeEntries",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25654,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rqp9phjsm() throws Exception{try{__CLR4_5_2jsmjsmlvlulqy3.R.inc(25654);
        __CLR4_5_2jsmjsmlvlulqy3.R.inc(25655);LinkedList<TimeToSampleBox.Entry> e = new LinkedList<TimeToSampleBox.Entry>();
        __CLR4_5_2jsmjsmlvlulqy3.R.inc(25656);e.add(new TimeToSampleBox.Entry(2, 3));
        __CLR4_5_2jsmjsmlvlulqy3.R.inc(25657);e.add(new TimeToSampleBox.Entry(3, 4));
        __CLR4_5_2jsmjsmlvlulqy3.R.inc(25658);e.add(new TimeToSampleBox.Entry(3, 5));
        __CLR4_5_2jsmjsmlvlulqy3.R.inc(25659);e.add(new TimeToSampleBox.Entry(2, 6));
        __CLR4_5_2jsmjsmlvlulqy3.R.inc(25660);List<TimeToSampleBox.Entry> r = CroppedTrack.getDecodingTimeEntries(e, 0, 1);
        __CLR4_5_2jsmjsmlvlulqy3.R.inc(25661);Assert.assertEquals(1, r.size());
        __CLR4_5_2jsmjsmlvlulqy3.R.inc(25662);Assert.assertEquals(1, r.get(0).getCount());
        __CLR4_5_2jsmjsmlvlulqy3.R.inc(25663);Assert.assertEquals(3, r.get(0).getDelta());
        __CLR4_5_2jsmjsmlvlulqy3.R.inc(25664);r = CroppedTrack.getDecodingTimeEntries(e, 0, 2);
        __CLR4_5_2jsmjsmlvlulqy3.R.inc(25665);Assert.assertEquals(1, r.size());
        __CLR4_5_2jsmjsmlvlulqy3.R.inc(25666);Assert.assertEquals(2, r.get(0).getCount());
        __CLR4_5_2jsmjsmlvlulqy3.R.inc(25667);Assert.assertEquals(3, r.get(0).getDelta());
        __CLR4_5_2jsmjsmlvlulqy3.R.inc(25668);r = CroppedTrack.getDecodingTimeEntries(e, 1, 2);
        __CLR4_5_2jsmjsmlvlulqy3.R.inc(25669);Assert.assertEquals(1, r.size());
        __CLR4_5_2jsmjsmlvlulqy3.R.inc(25670);Assert.assertEquals(1, r.get(0).getCount());
        __CLR4_5_2jsmjsmlvlulqy3.R.inc(25671);Assert.assertEquals(3, r.get(0).getDelta());
        __CLR4_5_2jsmjsmlvlulqy3.R.inc(25672);r = CroppedTrack.getDecodingTimeEntries(e, 1, 3);
        __CLR4_5_2jsmjsmlvlulqy3.R.inc(25673);Assert.assertEquals(2, r.size());
        __CLR4_5_2jsmjsmlvlulqy3.R.inc(25674);Assert.assertEquals(1, r.get(0).getCount());
        __CLR4_5_2jsmjsmlvlulqy3.R.inc(25675);Assert.assertEquals(3, r.get(0).getDelta());
        __CLR4_5_2jsmjsmlvlulqy3.R.inc(25676);Assert.assertEquals(1, r.get(1).getCount());
        __CLR4_5_2jsmjsmlvlulqy3.R.inc(25677);Assert.assertEquals(4, r.get(1).getDelta());
        __CLR4_5_2jsmjsmlvlulqy3.R.inc(25678);r = CroppedTrack.getDecodingTimeEntries(e, 3, 4);
        __CLR4_5_2jsmjsmlvlulqy3.R.inc(25679);Assert.assertEquals(1, r.size());
        __CLR4_5_2jsmjsmlvlulqy3.R.inc(25680);Assert.assertEquals(1, r.get(0).getCount());
        __CLR4_5_2jsmjsmlvlulqy3.R.inc(25681);Assert.assertEquals(4, r.get(0).getDelta());
        __CLR4_5_2jsmjsmlvlulqy3.R.inc(25682);r = CroppedTrack.getDecodingTimeEntries(e, 1, 6);
        __CLR4_5_2jsmjsmlvlulqy3.R.inc(25683);Assert.assertEquals(3, r.size());
        __CLR4_5_2jsmjsmlvlulqy3.R.inc(25684);Assert.assertEquals(1, r.get(0).getCount());
        __CLR4_5_2jsmjsmlvlulqy3.R.inc(25685);Assert.assertEquals(3, r.get(0).getDelta());
        __CLR4_5_2jsmjsmlvlulqy3.R.inc(25686);Assert.assertEquals(3, r.get(1).getCount());
        __CLR4_5_2jsmjsmlvlulqy3.R.inc(25687);Assert.assertEquals(4, r.get(1).getDelta());
        __CLR4_5_2jsmjsmlvlulqy3.R.inc(25688);Assert.assertEquals(1, r.get(2).getCount());
        __CLR4_5_2jsmjsmlvlulqy3.R.inc(25689);Assert.assertEquals(5, r.get(2).getDelta());
        __CLR4_5_2jsmjsmlvlulqy3.R.inc(25690);r = CroppedTrack.getDecodingTimeEntries(e, 2, 6);
        __CLR4_5_2jsmjsmlvlulqy3.R.inc(25691);Assert.assertEquals(2, r.size());
        __CLR4_5_2jsmjsmlvlulqy3.R.inc(25692);Assert.assertEquals(3, r.get(0).getCount());
        __CLR4_5_2jsmjsmlvlulqy3.R.inc(25693);Assert.assertEquals(4, r.get(0).getDelta());
        __CLR4_5_2jsmjsmlvlulqy3.R.inc(25694);Assert.assertEquals(1, r.get(1).getCount());
        __CLR4_5_2jsmjsmlvlulqy3.R.inc(25695);Assert.assertEquals(5, r.get(1).getDelta());
        __CLR4_5_2jsmjsmlvlulqy3.R.inc(25696);r = CroppedTrack.getDecodingTimeEntries(e, 2, 8);
        __CLR4_5_2jsmjsmlvlulqy3.R.inc(25697);Assert.assertEquals(2, r.size());
        __CLR4_5_2jsmjsmlvlulqy3.R.inc(25698);Assert.assertEquals(3, r.get(0).getCount());
        __CLR4_5_2jsmjsmlvlulqy3.R.inc(25699);Assert.assertEquals(4, r.get(0).getDelta());
        __CLR4_5_2jsmjsmlvlulqy3.R.inc(25700);Assert.assertEquals(3, r.get(1).getCount());
        __CLR4_5_2jsmjsmlvlulqy3.R.inc(25701);Assert.assertEquals(5, r.get(1).getDelta());

    }finally{__CLR4_5_2jsmjsmlvlulqy3.R.flushNeeded();}}

    @Test
    public void testGetCompositionTimes() throws Exception {__CLR4_5_2jsmjsmlvlulqy3.R.globalSliceStart(getClass().getName(),25702);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2y3ppixjty();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jsmjsmlvlulqy3.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jsmjsmlvlulqy3.R.globalSliceEnd(getClass().getName(),"com.googlecode.mp4parser.authoring.tracks.CroppedTrackTest.testGetCompositionTimes",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25702,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2y3ppixjty() throws Exception{try{__CLR4_5_2jsmjsmlvlulqy3.R.inc(25702);
        __CLR4_5_2jsmjsmlvlulqy3.R.inc(25703);LinkedList<CompositionTimeToSample.Entry> e = new LinkedList<CompositionTimeToSample.Entry>();
        __CLR4_5_2jsmjsmlvlulqy3.R.inc(25704);e.add(new CompositionTimeToSample.Entry(2, 3));
        __CLR4_5_2jsmjsmlvlulqy3.R.inc(25705);e.add(new CompositionTimeToSample.Entry(3, 4));
        __CLR4_5_2jsmjsmlvlulqy3.R.inc(25706);e.add(new CompositionTimeToSample.Entry(3, 5));
        __CLR4_5_2jsmjsmlvlulqy3.R.inc(25707);e.add(new CompositionTimeToSample.Entry(2, 6));
        __CLR4_5_2jsmjsmlvlulqy3.R.inc(25708);List<CompositionTimeToSample.Entry> r = CroppedTrack.getCompositionTimeEntries(e, 0, 1);
        __CLR4_5_2jsmjsmlvlulqy3.R.inc(25709);Assert.assertEquals(1, r.size());
        __CLR4_5_2jsmjsmlvlulqy3.R.inc(25710);Assert.assertEquals(1, r.get(0).getCount());
        __CLR4_5_2jsmjsmlvlulqy3.R.inc(25711);Assert.assertEquals(3, r.get(0).getOffset());
        __CLR4_5_2jsmjsmlvlulqy3.R.inc(25712);r = CroppedTrack.getCompositionTimeEntries(e, 0, 2);
        __CLR4_5_2jsmjsmlvlulqy3.R.inc(25713);Assert.assertEquals(1, r.size());
        __CLR4_5_2jsmjsmlvlulqy3.R.inc(25714);Assert.assertEquals(2, r.get(0).getCount());
        __CLR4_5_2jsmjsmlvlulqy3.R.inc(25715);Assert.assertEquals(3, r.get(0).getOffset());
        __CLR4_5_2jsmjsmlvlulqy3.R.inc(25716);r = CroppedTrack.getCompositionTimeEntries(e, 1, 2);
        __CLR4_5_2jsmjsmlvlulqy3.R.inc(25717);Assert.assertEquals(1, r.size());
        __CLR4_5_2jsmjsmlvlulqy3.R.inc(25718);Assert.assertEquals(1, r.get(0).getCount());
        __CLR4_5_2jsmjsmlvlulqy3.R.inc(25719);Assert.assertEquals(3, r.get(0).getOffset());
        __CLR4_5_2jsmjsmlvlulqy3.R.inc(25720);r = CroppedTrack.getCompositionTimeEntries(e, 1, 3);
        __CLR4_5_2jsmjsmlvlulqy3.R.inc(25721);Assert.assertEquals(2, r.size());
        __CLR4_5_2jsmjsmlvlulqy3.R.inc(25722);Assert.assertEquals(1, r.get(0).getCount());
        __CLR4_5_2jsmjsmlvlulqy3.R.inc(25723);Assert.assertEquals(3, r.get(0).getOffset());
        __CLR4_5_2jsmjsmlvlulqy3.R.inc(25724);Assert.assertEquals(1, r.get(1).getCount());
        __CLR4_5_2jsmjsmlvlulqy3.R.inc(25725);Assert.assertEquals(4, r.get(1).getOffset());
        __CLR4_5_2jsmjsmlvlulqy3.R.inc(25726);r = CroppedTrack.getCompositionTimeEntries(e, 3, 4);
        __CLR4_5_2jsmjsmlvlulqy3.R.inc(25727);Assert.assertEquals(1, r.size());
        __CLR4_5_2jsmjsmlvlulqy3.R.inc(25728);Assert.assertEquals(1, r.get(0).getCount());
        __CLR4_5_2jsmjsmlvlulqy3.R.inc(25729);Assert.assertEquals(4, r.get(0).getOffset());
        __CLR4_5_2jsmjsmlvlulqy3.R.inc(25730);r = CroppedTrack.getCompositionTimeEntries(e, 1, 6);
        __CLR4_5_2jsmjsmlvlulqy3.R.inc(25731);Assert.assertEquals(3, r.size());
        __CLR4_5_2jsmjsmlvlulqy3.R.inc(25732);Assert.assertEquals(1, r.get(0).getCount());
        __CLR4_5_2jsmjsmlvlulqy3.R.inc(25733);Assert.assertEquals(3, r.get(0).getOffset());
        __CLR4_5_2jsmjsmlvlulqy3.R.inc(25734);Assert.assertEquals(3, r.get(1).getCount());
        __CLR4_5_2jsmjsmlvlulqy3.R.inc(25735);Assert.assertEquals(4, r.get(1).getOffset());
        __CLR4_5_2jsmjsmlvlulqy3.R.inc(25736);Assert.assertEquals(1, r.get(2).getCount());
        __CLR4_5_2jsmjsmlvlulqy3.R.inc(25737);Assert.assertEquals(5, r.get(2).getOffset());
        __CLR4_5_2jsmjsmlvlulqy3.R.inc(25738);r = CroppedTrack.getCompositionTimeEntries(e, 2, 6);
        __CLR4_5_2jsmjsmlvlulqy3.R.inc(25739);Assert.assertEquals(2, r.size());
        __CLR4_5_2jsmjsmlvlulqy3.R.inc(25740);Assert.assertEquals(3, r.get(0).getCount());
        __CLR4_5_2jsmjsmlvlulqy3.R.inc(25741);Assert.assertEquals(4, r.get(0).getOffset());
        __CLR4_5_2jsmjsmlvlulqy3.R.inc(25742);Assert.assertEquals(1, r.get(1).getCount());
        __CLR4_5_2jsmjsmlvlulqy3.R.inc(25743);Assert.assertEquals(5, r.get(1).getOffset());
        __CLR4_5_2jsmjsmlvlulqy3.R.inc(25744);r = CroppedTrack.getCompositionTimeEntries(e, 2, 8);
        __CLR4_5_2jsmjsmlvlulqy3.R.inc(25745);Assert.assertEquals(2, r.size());
        __CLR4_5_2jsmjsmlvlulqy3.R.inc(25746);Assert.assertEquals(3, r.get(0).getCount());
        __CLR4_5_2jsmjsmlvlulqy3.R.inc(25747);Assert.assertEquals(4, r.get(0).getOffset());
        __CLR4_5_2jsmjsmlvlulqy3.R.inc(25748);Assert.assertEquals(3, r.get(1).getCount());
        __CLR4_5_2jsmjsmlvlulqy3.R.inc(25749);Assert.assertEquals(5, r.get(1).getOffset());
    }finally{__CLR4_5_2jsmjsmlvlulqy3.R.flushNeeded();}}
}
