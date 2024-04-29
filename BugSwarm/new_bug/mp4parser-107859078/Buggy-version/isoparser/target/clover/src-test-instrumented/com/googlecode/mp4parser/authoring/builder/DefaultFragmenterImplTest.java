/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.googlecode.mp4parser.authoring.builder;

import com.googlecode.mp4parser.authoring.Movie;
import com.googlecode.mp4parser.authoring.container.mp4.MovieCreator;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;

public class DefaultFragmenterImplTest {static class __CLR4_5_2i94i94lvl9emfl{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413286414L,8589935092L,23662,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * This test indicated that you changed the output. Do you expect that?
     */
    @Test
    public void stabilize() throws IOException, NoSuchAlgorithmException {__CLR4_5_2i94i94lvl9emfl.R.globalSliceStart(getClass().getName(),23656);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kcfbyii94();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2i94i94lvl9emfl.R.rethrow($CLV_t2$);}finally{__CLR4_5_2i94i94lvl9emfl.R.globalSliceEnd(getClass().getName(),"com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImplTest.stabilize",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23656,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kcfbyii94() throws IOException, NoSuchAlgorithmException{try{__CLR4_5_2i94i94lvl9emfl.R.inc(23656);
        __CLR4_5_2i94i94lvl9emfl.R.inc(23657);Movie movie = MovieCreator.build(this.getClass().getProtectionDomain().getCodeSource().getLocation().getFile() +
                "/Beethoven - Bagatelle op.119 no.11 i.m4a");

        __CLR4_5_2i94i94lvl9emfl.R.inc(23658);long[] segments = new DefaultFragmenterImpl(2).sampleNumbers(movie.getTracks().get(0));
        __CLR4_5_2i94i94lvl9emfl.R.inc(23659);Assert.assertArrayEquals(new
                        long[]{1, 87, 174, 261, 348, 435, 522, 609, 696, 783, 870, 957, 1044, 1131, 1218, 1305, 1392, 1479, 1566, 1653, 1740, 1827, 1914, 2001, 2088, 2175, 2262, 2349, 2436, 2523, 2610, 2697, 2784, 2871, 2958, 3045, 3132, 3219, 3306, 3393, 3480, 3567, 3654, 3741, 3828, 3915, 4002, 4089, 4176, 4263, 4350, 4437, 4524, 4611, 4698},
                segments
        );
        __CLR4_5_2i94i94lvl9emfl.R.inc(23660);long[] segments2 = new DefaultFragmenterImpl(4).sampleNumbers(movie.getTracks().get(0));
        __CLR4_5_2i94i94lvl9emfl.R.inc(23661);Assert.assertArrayEquals(new
                        long[]{1, 173, 346, 519, 692, 865, 1038, 1211, 1384, 1557, 1730, 1903, 2076, 2249, 2422, 2595, 2768, 2941, 3114, 3287, 3460, 3633, 3806, 3979, 4152, 4325, 4498, 4671,},
                segments2
        );

    }finally{__CLR4_5_2i94i94lvl9emfl.R.flushNeeded();}}

}
