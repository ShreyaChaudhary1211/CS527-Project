/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.googlecode.mp4parser.authoring.builder;


import com.googlecode.mp4parser.authoring.InTestMovieCreator;
import com.googlecode.mp4parser.authoring.Movie;
import com.googlecode.mp4parser.authoring.Track;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class SyncSampleIntersectFinderImplTest {static class __CLR4_5_2iu1iu1lvl9emo7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413286414L,8589935092L,24450,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;



    @Test
    public void testFindSameFrameRate() throws IOException {__CLR4_5_2iu1iu1lvl9emo7.R.globalSliceStart(getClass().getName(),24409);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qz1sqliu1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2iu1iu1lvl9emo7.R.rethrow($CLV_t2$);}finally{__CLR4_5_2iu1iu1lvl9emo7.R.globalSliceEnd(getClass().getName(),"com.googlecode.mp4parser.authoring.builder.SyncSampleIntersectFinderImplTest.testFindSameFrameRate",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24409,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qz1sqliu1() throws IOException{try{__CLR4_5_2iu1iu1lvl9emo7.R.inc(24409);
        __CLR4_5_2iu1iu1lvl9emo7.R.inc(24410);Movie m = InTestMovieCreator.createMovieOnlyVideo(
                "/BBB_qpfile_10sec/BBB_fixedres_B_180x320_150.mp4",
                "/BBB_qpfile_10sec/BBB_fixedres_B_180x320_200.mp4"
        );

        __CLR4_5_2iu1iu1lvl9emo7.R.inc(24411);SyncSampleIntersectFinderImpl syncSampleIntersectFinder = new SyncSampleIntersectFinderImpl(m, null, -1);
        __CLR4_5_2iu1iu1lvl9emo7.R.inc(24412);long[] fragmentStartSamplesRef = null;
        __CLR4_5_2iu1iu1lvl9emo7.R.inc(24413);Assert.assertTrue(m.getTracks().size() > 1);
        __CLR4_5_2iu1iu1lvl9emo7.R.inc(24414);for (Track track : m.getTracks()) {{
            __CLR4_5_2iu1iu1lvl9emo7.R.inc(24415);long[] fragmentStartSamples = syncSampleIntersectFinder.sampleNumbers(track);
            __CLR4_5_2iu1iu1lvl9emo7.R.inc(24416);Assert.assertNotNull(fragmentStartSamples);
            __CLR4_5_2iu1iu1lvl9emo7.R.inc(24417);if ((((fragmentStartSamplesRef == null)&&(__CLR4_5_2iu1iu1lvl9emo7.R.iget(24418)!=0|true))||(__CLR4_5_2iu1iu1lvl9emo7.R.iget(24419)==0&false))) {{
                __CLR4_5_2iu1iu1lvl9emo7.R.inc(24420);fragmentStartSamplesRef = fragmentStartSamples;
            } }else {{
                __CLR4_5_2iu1iu1lvl9emo7.R.inc(24421);Assert.assertArrayEquals(fragmentStartSamplesRef, fragmentStartSamples);
            }

        }}
    }}finally{__CLR4_5_2iu1iu1lvl9emo7.R.flushNeeded();}}

    @Test
    public void testGetIndicesToBeRemoved() {__CLR4_5_2iu1iu1lvl9emo7.R.globalSliceStart(getClass().getName(),24422);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nwavxiiue();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2iu1iu1lvl9emo7.R.rethrow($CLV_t2$);}finally{__CLR4_5_2iu1iu1lvl9emo7.R.globalSliceEnd(getClass().getName(),"com.googlecode.mp4parser.authoring.builder.SyncSampleIntersectFinderImplTest.testGetIndicesToBeRemoved",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24422,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nwavxiiue(){try{__CLR4_5_2iu1iu1lvl9emo7.R.inc(24422);
        __CLR4_5_2iu1iu1lvl9emo7.R.inc(24423);SyncSampleIntersectFinderImpl syncSampleIntersectFinder = new SyncSampleIntersectFinderImpl(null,null,-1);
        __CLR4_5_2iu1iu1lvl9emo7.R.inc(24424);long[] a_sample = new long[]{20, 40, 48, 60, 80, 82};
        __CLR4_5_2iu1iu1lvl9emo7.R.inc(24425);long[] a_times = new long[]{10, 20, 24, 30, 40, 41};
        __CLR4_5_2iu1iu1lvl9emo7.R.inc(24426);long[] b_1 = new long[]{10, 20, 26, 30, 40};
        __CLR4_5_2iu1iu1lvl9emo7.R.inc(24427);long[] b_2 = new long[]{10, 20, 25, 30, 40};
        __CLR4_5_2iu1iu1lvl9emo7.R.inc(24428);long[] a_2 = syncSampleIntersectFinder.getCommonIndices(a_sample, a_times, 10, b_1, b_2);
//        long[] a_sample = new long[]{20, 40, 48, 60, 80, 82, 100};
//        long[] a_times = new long[]{10, 20, 24, 30, 40, 41, 80, 81};
//        long[] b_1 = new long[]{10, 20, 26, 30, 40, 80};
//        long[] b_2 = new long[]{10, 20, 25, 30, 40, 80};
//        long[] a_2 = SyncSampleIntersectFinderImpl.getCommonIndices(a_sample, a_times, 10, b_1, b_2);
        __CLR4_5_2iu1iu1lvl9emo7.R.inc(24429);Assert.assertArrayEquals(new long[]{20, 40, 60, 80}, a_2);
    }finally{__CLR4_5_2iu1iu1lvl9emo7.R.flushNeeded();}}

    @Test
    public void testGetIndicesToBeRemovedMinTwoSecondsFragments() {__CLR4_5_2iu1iu1lvl9emo7.R.globalSliceStart(getClass().getName(),24430);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hekb6kium();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2iu1iu1lvl9emo7.R.rethrow($CLV_t2$);}finally{__CLR4_5_2iu1iu1lvl9emo7.R.globalSliceEnd(getClass().getName(),"com.googlecode.mp4parser.authoring.builder.SyncSampleIntersectFinderImplTest.testGetIndicesToBeRemovedMinTwoSecondsFragments",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24430,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hekb6kium(){try{__CLR4_5_2iu1iu1lvl9emo7.R.inc(24430);
        __CLR4_5_2iu1iu1lvl9emo7.R.inc(24431);SyncSampleIntersectFinderImpl syncSampleIntersectFinder = new SyncSampleIntersectFinderImpl(null,null,2);
        __CLR4_5_2iu1iu1lvl9emo7.R.inc(24432);long[] a_sample = new long[]{20, 40, 48, 60, 80, 82, 90, 100};
        __CLR4_5_2iu1iu1lvl9emo7.R.inc(24433);long[] a_times = new long[]{10, 20, 24, 30, 60, 61, 80, 81};
        __CLR4_5_2iu1iu1lvl9emo7.R.inc(24434);long[] b_1 = new long[]{10, 20, 26, 30, 40, 80, 81, 100};
        __CLR4_5_2iu1iu1lvl9emo7.R.inc(24435);long[] b_2 = new long[]{10, 20, 25, 30, 40, 80, 90, 100};
        __CLR4_5_2iu1iu1lvl9emo7.R.inc(24436);long[] a_2 = syncSampleIntersectFinder.getCommonIndices(a_sample, a_times, 10, b_1, b_2);
        __CLR4_5_2iu1iu1lvl9emo7.R.inc(24437);Assert.assertArrayEquals(new long[]{20, 60, 90}, a_2);
    }finally{__CLR4_5_2iu1iu1lvl9emo7.R.flushNeeded();}}

    @Test
    public void testFindDifferentFrameRates() throws IOException {__CLR4_5_2iu1iu1lvl9emo7.R.globalSliceStart(getClass().getName(),24438);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26md8x1iuu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2iu1iu1lvl9emo7.R.rethrow($CLV_t2$);}finally{__CLR4_5_2iu1iu1lvl9emo7.R.globalSliceEnd(getClass().getName(),"com.googlecode.mp4parser.authoring.builder.SyncSampleIntersectFinderImplTest.testFindDifferentFrameRates",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24438,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26md8x1iuu() throws IOException{try{__CLR4_5_2iu1iu1lvl9emo7.R.inc(24438);

        /*Movie m = createMovieOnlyVideo(
                "/working_now/FBW_fixedres_B_640x360_200.mp4",
                "/working_now/FBW_fixedres_B_640x360_400.mp4",
                "/working_now/FBW_fixedres_B_640x360_800.mp4",
                "/working_now/FBW_fixedres_B_640x360_1200.mp4",
                "/working_now/FBW_fixedres_B_640x360_2400.mp4"
        );    */
        __CLR4_5_2iu1iu1lvl9emo7.R.inc(24439);Movie m = InTestMovieCreator.createMovieOnlyVideo(
                "/BBB_qpfile_10sec/BBB_fixedres_B_180x320_80.mp4",
                "/BBB_qpfile_10sec/BBB_fixedres_B_180x320_100.mp4",
                "/BBB_qpfile_10sec/BBB_fixedres_B_180x320_120.mp4",
                "/BBB_qpfile_10sec/BBB_fixedres_B_180x320_150.mp4",
                "/BBB_qpfile_10sec/BBB_fixedres_B_180x320_200.mp4"
        );
        __CLR4_5_2iu1iu1lvl9emo7.R.inc(24440);SyncSampleIntersectFinderImpl syncSampleIntersectFinder = new SyncSampleIntersectFinderImpl(m, null, -1);
        __CLR4_5_2iu1iu1lvl9emo7.R.inc(24441);long[] fragmentStartSamplesRef = null;
        __CLR4_5_2iu1iu1lvl9emo7.R.inc(24442);for (Track track : m.getTracks()) {{
            __CLR4_5_2iu1iu1lvl9emo7.R.inc(24443);long[] fragmentStartSamples = syncSampleIntersectFinder.sampleNumbers(track);
            __CLR4_5_2iu1iu1lvl9emo7.R.inc(24444);Assert.assertNotNull(fragmentStartSamples);
            __CLR4_5_2iu1iu1lvl9emo7.R.inc(24445);if ((((fragmentStartSamplesRef == null)&&(__CLR4_5_2iu1iu1lvl9emo7.R.iget(24446)!=0|true))||(__CLR4_5_2iu1iu1lvl9emo7.R.iget(24447)==0&false))) {{
                __CLR4_5_2iu1iu1lvl9emo7.R.inc(24448);fragmentStartSamplesRef = fragmentStartSamples;
            } }else {{
                // this is all I can do here now.
                // we should verify that all samples in the array are at the same times.
                __CLR4_5_2iu1iu1lvl9emo7.R.inc(24449);Assert.assertEquals(fragmentStartSamplesRef.length, fragmentStartSamples.length);
            }

        }}

    }}finally{__CLR4_5_2iu1iu1lvl9emo7.R.flushNeeded();}}
}
