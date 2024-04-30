/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package uk.ac.manchester.cs.owl.owlapi.concurrent;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;

/**
 * Matthew Horridge Stanford Center for Biomedical Informatics Research 13/04/15
 */
@SuppressWarnings("javadoc")
public class NoOpLock_TestCase {static class __CLR4_5_2cppcpplviclhgi{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u006d\u0070\u006c\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237246897L,8589935092L,16485,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private NoOpLock lock;

    @Before
    public void setUp() {try{__CLR4_5_2cppcpplviclhgi.R.inc(16477);
        __CLR4_5_2cppcpplviclhgi.R.inc(16478);lock = new NoOpLock();
    }finally{__CLR4_5_2cppcpplviclhgi.R.flushNeeded();}}

    @Test
    public void shouldNotReturnNullCondition() {__CLR4_5_2cppcpplviclhgi.R.globalSliceStart(getClass().getName(),16479);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hausmtcpr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2cppcpplviclhgi.R.rethrow($CLV_t2$);}finally{__CLR4_5_2cppcpplviclhgi.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.NoOpLock_TestCase.shouldNotReturnNullCondition",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16479,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hausmtcpr(){try{__CLR4_5_2cppcpplviclhgi.R.inc(16479);
        __CLR4_5_2cppcpplviclhgi.R.inc(16480);assertThat(lock.newCondition(), is(not(nullValue())));
    }finally{__CLR4_5_2cppcpplviclhgi.R.flushNeeded();}}

    @Test
    public void shouldReturn_true_When_tryLock() {__CLR4_5_2cppcpplviclhgi.R.globalSliceStart(getClass().getName(),16481);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n3noebcpt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2cppcpplviclhgi.R.rethrow($CLV_t2$);}finally{__CLR4_5_2cppcpplviclhgi.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.NoOpLock_TestCase.shouldReturn_true_When_tryLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16481,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n3noebcpt(){try{__CLR4_5_2cppcpplviclhgi.R.inc(16481);
        __CLR4_5_2cppcpplviclhgi.R.inc(16482);assertThat(lock.tryLock(), is(true));
    }finally{__CLR4_5_2cppcpplviclhgi.R.flushNeeded();}}

    @Test
    public void shouldReturn_true_When_tryLockWithTimeOut() throws InterruptedException {__CLR4_5_2cppcpplviclhgi.R.globalSliceStart(getClass().getName(),16483);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2j62r70cpv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2cppcpplviclhgi.R.rethrow($CLV_t2$);}finally{__CLR4_5_2cppcpplviclhgi.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.NoOpLock_TestCase.shouldReturn_true_When_tryLockWithTimeOut",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16483,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2j62r70cpv() throws InterruptedException{try{__CLR4_5_2cppcpplviclhgi.R.inc(16483);
        __CLR4_5_2cppcpplviclhgi.R.inc(16484);assertThat(lock.tryLock(3, mock(TimeUnit.class)), is(true));
    }finally{__CLR4_5_2cppcpplviclhgi.R.flushNeeded();}}
}
