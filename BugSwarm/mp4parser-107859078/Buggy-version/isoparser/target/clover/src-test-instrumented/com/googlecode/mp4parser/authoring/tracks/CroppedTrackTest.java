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
public class CroppedTrackTest {static class __CLR4_5_2iyuiyulvl9emr9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413286414L,8589935092L,24678,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @Test
    public void testGetDecodingTimeEntries() throws Exception {__CLR4_5_2iyuiyulvl9emr9.R.globalSliceStart(getClass().getName(),24582);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rqp9phiyu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2iyuiyulvl9emr9.R.rethrow($CLV_t2$);}finally{__CLR4_5_2iyuiyulvl9emr9.R.globalSliceEnd(getClass().getName(),"com.googlecode.mp4parser.authoring.tracks.CroppedTrackTest.testGetDecodingTimeEntries",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24582,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rqp9phiyu() throws Exception{try{__CLR4_5_2iyuiyulvl9emr9.R.inc(24582);
        __CLR4_5_2iyuiyulvl9emr9.R.inc(24583);LinkedList<TimeToSampleBox.Entry> e = new LinkedList<TimeToSampleBox.Entry>();
        __CLR4_5_2iyuiyulvl9emr9.R.inc(24584);e.add(new TimeToSampleBox.Entry(2, 3));
        __CLR4_5_2iyuiyulvl9emr9.R.inc(24585);e.add(new TimeToSampleBox.Entry(3, 4));
        __CLR4_5_2iyuiyulvl9emr9.R.inc(24586);e.add(new TimeToSampleBox.Entry(3, 5));
        __CLR4_5_2iyuiyulvl9emr9.R.inc(24587);e.add(new TimeToSampleBox.Entry(2, 6));
        __CLR4_5_2iyuiyulvl9emr9.R.inc(24588);List<TimeToSampleBox.Entry> r = CroppedTrack.getDecodingTimeEntries(e, 0, 1);
        __CLR4_5_2iyuiyulvl9emr9.R.inc(24589);Assert.assertEquals(1, r.size());
        __CLR4_5_2iyuiyulvl9emr9.R.inc(24590);Assert.assertEquals(1, r.get(0).getCount());
        __CLR4_5_2iyuiyulvl9emr9.R.inc(24591);Assert.assertEquals(3, r.get(0).getDelta());
        __CLR4_5_2iyuiyulvl9emr9.R.inc(24592);r = CroppedTrack.getDecodingTimeEntries(e, 0, 2);
        __CLR4_5_2iyuiyulvl9emr9.R.inc(24593);Assert.assertEquals(1, r.size());
        __CLR4_5_2iyuiyulvl9emr9.R.inc(24594);Assert.assertEquals(2, r.get(0).getCount());
        __CLR4_5_2iyuiyulvl9emr9.R.inc(24595);Assert.assertEquals(3, r.get(0).getDelta());
        __CLR4_5_2iyuiyulvl9emr9.R.inc(24596);r = CroppedTrack.getDecodingTimeEntries(e, 1, 2);
        __CLR4_5_2iyuiyulvl9emr9.R.inc(24597);Assert.assertEquals(1, r.size());
        __CLR4_5_2iyuiyulvl9emr9.R.inc(24598);Assert.assertEquals(1, r.get(0).getCount());
        __CLR4_5_2iyuiyulvl9emr9.R.inc(24599);Assert.assertEquals(3, r.get(0).getDelta());
        __CLR4_5_2iyuiyulvl9emr9.R.inc(24600);r = CroppedTrack.getDecodingTimeEntries(e, 1, 3);
        __CLR4_5_2iyuiyulvl9emr9.R.inc(24601);Assert.assertEquals(2, r.size());
        __CLR4_5_2iyuiyulvl9emr9.R.inc(24602);Assert.assertEquals(1, r.get(0).getCount());
        __CLR4_5_2iyuiyulvl9emr9.R.inc(24603);Assert.assertEquals(3, r.get(0).getDelta());
        __CLR4_5_2iyuiyulvl9emr9.R.inc(24604);Assert.assertEquals(1, r.get(1).getCount());
        __CLR4_5_2iyuiyulvl9emr9.R.inc(24605);Assert.assertEquals(4, r.get(1).getDelta());
        __CLR4_5_2iyuiyulvl9emr9.R.inc(24606);r = CroppedTrack.getDecodingTimeEntries(e, 3, 4);
        __CLR4_5_2iyuiyulvl9emr9.R.inc(24607);Assert.assertEquals(1, r.size());
        __CLR4_5_2iyuiyulvl9emr9.R.inc(24608);Assert.assertEquals(1, r.get(0).getCount());
        __CLR4_5_2iyuiyulvl9emr9.R.inc(24609);Assert.assertEquals(4, r.get(0).getDelta());
        __CLR4_5_2iyuiyulvl9emr9.R.inc(24610);r = CroppedTrack.getDecodingTimeEntries(e, 1, 6);
        __CLR4_5_2iyuiyulvl9emr9.R.inc(24611);Assert.assertEquals(3, r.size());
        __CLR4_5_2iyuiyulvl9emr9.R.inc(24612);Assert.assertEquals(1, r.get(0).getCount());
        __CLR4_5_2iyuiyulvl9emr9.R.inc(24613);Assert.assertEquals(3, r.get(0).getDelta());
        __CLR4_5_2iyuiyulvl9emr9.R.inc(24614);Assert.assertEquals(3, r.get(1).getCount());
        __CLR4_5_2iyuiyulvl9emr9.R.inc(24615);Assert.assertEquals(4, r.get(1).getDelta());
        __CLR4_5_2iyuiyulvl9emr9.R.inc(24616);Assert.assertEquals(1, r.get(2).getCount());
        __CLR4_5_2iyuiyulvl9emr9.R.inc(24617);Assert.assertEquals(5, r.get(2).getDelta());
        __CLR4_5_2iyuiyulvl9emr9.R.inc(24618);r = CroppedTrack.getDecodingTimeEntries(e, 2, 6);
        __CLR4_5_2iyuiyulvl9emr9.R.inc(24619);Assert.assertEquals(2, r.size());
        __CLR4_5_2iyuiyulvl9emr9.R.inc(24620);Assert.assertEquals(3, r.get(0).getCount());
        __CLR4_5_2iyuiyulvl9emr9.R.inc(24621);Assert.assertEquals(4, r.get(0).getDelta());
        __CLR4_5_2iyuiyulvl9emr9.R.inc(24622);Assert.assertEquals(1, r.get(1).getCount());
        __CLR4_5_2iyuiyulvl9emr9.R.inc(24623);Assert.assertEquals(5, r.get(1).getDelta());
        __CLR4_5_2iyuiyulvl9emr9.R.inc(24624);r = CroppedTrack.getDecodingTimeEntries(e, 2, 8);
        __CLR4_5_2iyuiyulvl9emr9.R.inc(24625);Assert.assertEquals(2, r.size());
        __CLR4_5_2iyuiyulvl9emr9.R.inc(24626);Assert.assertEquals(3, r.get(0).getCount());
        __CLR4_5_2iyuiyulvl9emr9.R.inc(24627);Assert.assertEquals(4, r.get(0).getDelta());
        __CLR4_5_2iyuiyulvl9emr9.R.inc(24628);Assert.assertEquals(3, r.get(1).getCount());
        __CLR4_5_2iyuiyulvl9emr9.R.inc(24629);Assert.assertEquals(5, r.get(1).getDelta());

    }finally{__CLR4_5_2iyuiyulvl9emr9.R.flushNeeded();}}

    @Test
    public void testGetCompositionTimes() throws Exception {__CLR4_5_2iyuiyulvl9emr9.R.globalSliceStart(getClass().getName(),24630);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2y3ppixj06();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2iyuiyulvl9emr9.R.rethrow($CLV_t2$);}finally{__CLR4_5_2iyuiyulvl9emr9.R.globalSliceEnd(getClass().getName(),"com.googlecode.mp4parser.authoring.tracks.CroppedTrackTest.testGetCompositionTimes",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24630,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2y3ppixj06() throws Exception{try{__CLR4_5_2iyuiyulvl9emr9.R.inc(24630);
        __CLR4_5_2iyuiyulvl9emr9.R.inc(24631);LinkedList<CompositionTimeToSample.Entry> e = new LinkedList<CompositionTimeToSample.Entry>();
        __CLR4_5_2iyuiyulvl9emr9.R.inc(24632);e.add(new CompositionTimeToSample.Entry(2, 3));
        __CLR4_5_2iyuiyulvl9emr9.R.inc(24633);e.add(new CompositionTimeToSample.Entry(3, 4));
        __CLR4_5_2iyuiyulvl9emr9.R.inc(24634);e.add(new CompositionTimeToSample.Entry(3, 5));
        __CLR4_5_2iyuiyulvl9emr9.R.inc(24635);e.add(new CompositionTimeToSample.Entry(2, 6));
        __CLR4_5_2iyuiyulvl9emr9.R.inc(24636);List<CompositionTimeToSample.Entry> r = CroppedTrack.getCompositionTimeEntries(e, 0, 1);
        __CLR4_5_2iyuiyulvl9emr9.R.inc(24637);Assert.assertEquals(1, r.size());
        __CLR4_5_2iyuiyulvl9emr9.R.inc(24638);Assert.assertEquals(1, r.get(0).getCount());
        __CLR4_5_2iyuiyulvl9emr9.R.inc(24639);Assert.assertEquals(3, r.get(0).getOffset());
        __CLR4_5_2iyuiyulvl9emr9.R.inc(24640);r = CroppedTrack.getCompositionTimeEntries(e, 0, 2);
        __CLR4_5_2iyuiyulvl9emr9.R.inc(24641);Assert.assertEquals(1, r.size());
        __CLR4_5_2iyuiyulvl9emr9.R.inc(24642);Assert.assertEquals(2, r.get(0).getCount());
        __CLR4_5_2iyuiyulvl9emr9.R.inc(24643);Assert.assertEquals(3, r.get(0).getOffset());
        __CLR4_5_2iyuiyulvl9emr9.R.inc(24644);r = CroppedTrack.getCompositionTimeEntries(e, 1, 2);
        __CLR4_5_2iyuiyulvl9emr9.R.inc(24645);Assert.assertEquals(1, r.size());
        __CLR4_5_2iyuiyulvl9emr9.R.inc(24646);Assert.assertEquals(1, r.get(0).getCount());
        __CLR4_5_2iyuiyulvl9emr9.R.inc(24647);Assert.assertEquals(3, r.get(0).getOffset());
        __CLR4_5_2iyuiyulvl9emr9.R.inc(24648);r = CroppedTrack.getCompositionTimeEntries(e, 1, 3);
        __CLR4_5_2iyuiyulvl9emr9.R.inc(24649);Assert.assertEquals(2, r.size());
        __CLR4_5_2iyuiyulvl9emr9.R.inc(24650);Assert.assertEquals(1, r.get(0).getCount());
        __CLR4_5_2iyuiyulvl9emr9.R.inc(24651);Assert.assertEquals(3, r.get(0).getOffset());
        __CLR4_5_2iyuiyulvl9emr9.R.inc(24652);Assert.assertEquals(1, r.get(1).getCount());
        __CLR4_5_2iyuiyulvl9emr9.R.inc(24653);Assert.assertEquals(4, r.get(1).getOffset());
        __CLR4_5_2iyuiyulvl9emr9.R.inc(24654);r = CroppedTrack.getCompositionTimeEntries(e, 3, 4);
        __CLR4_5_2iyuiyulvl9emr9.R.inc(24655);Assert.assertEquals(1, r.size());
        __CLR4_5_2iyuiyulvl9emr9.R.inc(24656);Assert.assertEquals(1, r.get(0).getCount());
        __CLR4_5_2iyuiyulvl9emr9.R.inc(24657);Assert.assertEquals(4, r.get(0).getOffset());
        __CLR4_5_2iyuiyulvl9emr9.R.inc(24658);r = CroppedTrack.getCompositionTimeEntries(e, 1, 6);
        __CLR4_5_2iyuiyulvl9emr9.R.inc(24659);Assert.assertEquals(3, r.size());
        __CLR4_5_2iyuiyulvl9emr9.R.inc(24660);Assert.assertEquals(1, r.get(0).getCount());
        __CLR4_5_2iyuiyulvl9emr9.R.inc(24661);Assert.assertEquals(3, r.get(0).getOffset());
        __CLR4_5_2iyuiyulvl9emr9.R.inc(24662);Assert.assertEquals(3, r.get(1).getCount());
        __CLR4_5_2iyuiyulvl9emr9.R.inc(24663);Assert.assertEquals(4, r.get(1).getOffset());
        __CLR4_5_2iyuiyulvl9emr9.R.inc(24664);Assert.assertEquals(1, r.get(2).getCount());
        __CLR4_5_2iyuiyulvl9emr9.R.inc(24665);Assert.assertEquals(5, r.get(2).getOffset());
        __CLR4_5_2iyuiyulvl9emr9.R.inc(24666);r = CroppedTrack.getCompositionTimeEntries(e, 2, 6);
        __CLR4_5_2iyuiyulvl9emr9.R.inc(24667);Assert.assertEquals(2, r.size());
        __CLR4_5_2iyuiyulvl9emr9.R.inc(24668);Assert.assertEquals(3, r.get(0).getCount());
        __CLR4_5_2iyuiyulvl9emr9.R.inc(24669);Assert.assertEquals(4, r.get(0).getOffset());
        __CLR4_5_2iyuiyulvl9emr9.R.inc(24670);Assert.assertEquals(1, r.get(1).getCount());
        __CLR4_5_2iyuiyulvl9emr9.R.inc(24671);Assert.assertEquals(5, r.get(1).getOffset());
        __CLR4_5_2iyuiyulvl9emr9.R.inc(24672);r = CroppedTrack.getCompositionTimeEntries(e, 2, 8);
        __CLR4_5_2iyuiyulvl9emr9.R.inc(24673);Assert.assertEquals(2, r.size());
        __CLR4_5_2iyuiyulvl9emr9.R.inc(24674);Assert.assertEquals(3, r.get(0).getCount());
        __CLR4_5_2iyuiyulvl9emr9.R.inc(24675);Assert.assertEquals(4, r.get(0).getOffset());
        __CLR4_5_2iyuiyulvl9emr9.R.inc(24676);Assert.assertEquals(3, r.get(1).getCount());
        __CLR4_5_2iyuiyulvl9emr9.R.inc(24677);Assert.assertEquals(5, r.get(1).getOffset());
    }finally{__CLR4_5_2iyuiyulvl9emr9.R.flushNeeded();}}
}
