/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package uk.ac.manchester.cs.owl.owlapi.concurrent;

import static org.mockito.Mockito.*;

import java.io.Serializable;
import java.util.Arrays;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InOrder;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.semanticweb.owlapi.model.PriorityCollectionSorting;

/**
 * Matthew Horridge Stanford Center for Biomedical Informatics Research 10/04/15
 */
@SuppressWarnings("javadoc")
@RunWith(MockitoJUnitRunner.class)
public class ConcurrentPriorityCollection_TestCase<T extends Serializable> {static class __CLR4_5_2cnucnulviclhgc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u006d\u0070\u006c\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237246897L,8589935092L,16477,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private ConcurrentPriorityCollection<T> collection;
    @Mock
    private ReadWriteLock readWriteLock;
    @Mock
    private Lock readLock, writeLock;
    @Mock
    private T element;
    private PriorityCollectionSorting hasOntologyLoaderConfiguration = PriorityCollectionSorting.NEVER;
    private Iterable<T> iterable;

    @Before
    public void setUp() {try{__CLR4_5_2cnucnulviclhgc.R.inc(16410);
        __CLR4_5_2cnucnulviclhgc.R.inc(16411);when(readWriteLock.readLock()).thenReturn(readLock);
        __CLR4_5_2cnucnulviclhgc.R.inc(16412);when(readWriteLock.writeLock()).thenReturn(writeLock);
        __CLR4_5_2cnucnulviclhgc.R.inc(16413);iterable = Arrays.asList(element);
        __CLR4_5_2cnucnulviclhgc.R.inc(16414);collection = new ConcurrentPriorityCollection<>(readWriteLock, hasOntologyLoaderConfiguration);
    }finally{__CLR4_5_2cnucnulviclhgc.R.flushNeeded();}}

    @Test
    public void shouldCall_isEmpty_WithReadLock() {__CLR4_5_2cnucnulviclhgc.R.globalSliceStart(getClass().getName(),16415);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2aowt3scnz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2cnucnulviclhgc.R.rethrow($CLV_t2$);}finally{__CLR4_5_2cnucnulviclhgc.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentPriorityCollection_TestCase.shouldCall_isEmpty_WithReadLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16415,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2aowt3scnz(){try{__CLR4_5_2cnucnulviclhgc.R.inc(16415);
        __CLR4_5_2cnucnulviclhgc.R.inc(16416);collection.isEmpty();
        __CLR4_5_2cnucnulviclhgc.R.inc(16417);InOrder inOrder = inOrder(readLock, readLock);
        __CLR4_5_2cnucnulviclhgc.R.inc(16418);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2cnucnulviclhgc.R.inc(16419);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2cnucnulviclhgc.R.inc(16420);verify(writeLock, never()).lock();
        __CLR4_5_2cnucnulviclhgc.R.inc(16421);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2cnucnulviclhgc.R.flushNeeded();}}

    @Test
    public void shouldCall_getByMimeType_WithReadLock() {__CLR4_5_2cnucnulviclhgc.R.globalSliceStart(getClass().getName(),16422);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2owryzkco6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2cnucnulviclhgc.R.rethrow($CLV_t2$);}finally{__CLR4_5_2cnucnulviclhgc.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentPriorityCollection_TestCase.shouldCall_getByMimeType_WithReadLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16422,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2owryzkco6(){try{__CLR4_5_2cnucnulviclhgc.R.inc(16422);
        __CLR4_5_2cnucnulviclhgc.R.inc(16423);collection.getByMIMEType("MT");
        __CLR4_5_2cnucnulviclhgc.R.inc(16424);InOrder inOrder = inOrder(readLock, readLock);
        __CLR4_5_2cnucnulviclhgc.R.inc(16425);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2cnucnulviclhgc.R.inc(16426);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2cnucnulviclhgc.R.inc(16427);verify(writeLock, never()).lock();
        __CLR4_5_2cnucnulviclhgc.R.inc(16428);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2cnucnulviclhgc.R.flushNeeded();}}

    @Test
    public void shouldCall_size_WithReadLock() {__CLR4_5_2cnucnulviclhgc.R.globalSliceStart(getClass().getName(),16429);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2m9hohucod();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2cnucnulviclhgc.R.rethrow($CLV_t2$);}finally{__CLR4_5_2cnucnulviclhgc.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentPriorityCollection_TestCase.shouldCall_size_WithReadLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16429,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2m9hohucod(){try{__CLR4_5_2cnucnulviclhgc.R.inc(16429);
        __CLR4_5_2cnucnulviclhgc.R.inc(16430);collection.size();
        __CLR4_5_2cnucnulviclhgc.R.inc(16431);InOrder inOrder = inOrder(readLock, readLock);
        __CLR4_5_2cnucnulviclhgc.R.inc(16432);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2cnucnulviclhgc.R.inc(16433);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2cnucnulviclhgc.R.inc(16434);verify(writeLock, never()).lock();
        __CLR4_5_2cnucnulviclhgc.R.inc(16435);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2cnucnulviclhgc.R.flushNeeded();}}

    @Test
    public void shouldCall_clear_WithWriteLock() {__CLR4_5_2cnucnulviclhgc.R.globalSliceStart(getClass().getName(),16436);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kzbq5ncok();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2cnucnulviclhgc.R.rethrow($CLV_t2$);}finally{__CLR4_5_2cnucnulviclhgc.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentPriorityCollection_TestCase.shouldCall_clear_WithWriteLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16436,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kzbq5ncok(){try{__CLR4_5_2cnucnulviclhgc.R.inc(16436);
        __CLR4_5_2cnucnulviclhgc.R.inc(16437);collection.clear();
        __CLR4_5_2cnucnulviclhgc.R.inc(16438);InOrder inOrder = inOrder(writeLock, writeLock);
        __CLR4_5_2cnucnulviclhgc.R.inc(16439);inOrder.verify(writeLock, times(1)).lock();
        __CLR4_5_2cnucnulviclhgc.R.inc(16440);inOrder.verify(writeLock, times(1)).unlock();
        __CLR4_5_2cnucnulviclhgc.R.inc(16441);verify(readLock, never()).lock();
        __CLR4_5_2cnucnulviclhgc.R.inc(16442);verify(readLock, never()).unlock();
    }finally{__CLR4_5_2cnucnulviclhgc.R.flushNeeded();}}

    @Test
    public void shouldCall_add_WithWriteLock() {__CLR4_5_2cnucnulviclhgc.R.globalSliceStart(getClass().getName(),16443);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lpi3cxcor();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2cnucnulviclhgc.R.rethrow($CLV_t2$);}finally{__CLR4_5_2cnucnulviclhgc.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentPriorityCollection_TestCase.shouldCall_add_WithWriteLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16443,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lpi3cxcor(){try{__CLR4_5_2cnucnulviclhgc.R.inc(16443);
        __CLR4_5_2cnucnulviclhgc.R.inc(16444);collection.add(element);
        __CLR4_5_2cnucnulviclhgc.R.inc(16445);InOrder inOrder = inOrder(writeLock, writeLock);
        __CLR4_5_2cnucnulviclhgc.R.inc(16446);inOrder.verify(writeLock, times(1)).lock();
        __CLR4_5_2cnucnulviclhgc.R.inc(16447);inOrder.verify(writeLock, times(1)).unlock();
        __CLR4_5_2cnucnulviclhgc.R.inc(16448);verify(readLock, never()).lock();
        __CLR4_5_2cnucnulviclhgc.R.inc(16449);verify(readLock, never()).unlock();
    }finally{__CLR4_5_2cnucnulviclhgc.R.flushNeeded();}}

    @Test
    public void shouldCall_add_iterable_WithWriteLock() {__CLR4_5_2cnucnulviclhgc.R.globalSliceStart(getClass().getName(),16450);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a5madycoy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2cnucnulviclhgc.R.rethrow($CLV_t2$);}finally{__CLR4_5_2cnucnulviclhgc.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentPriorityCollection_TestCase.shouldCall_add_iterable_WithWriteLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16450,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a5madycoy(){try{__CLR4_5_2cnucnulviclhgc.R.inc(16450);
        __CLR4_5_2cnucnulviclhgc.R.inc(16451);collection.add(iterable);
        __CLR4_5_2cnucnulviclhgc.R.inc(16452);InOrder inOrder = inOrder(writeLock, writeLock);
        __CLR4_5_2cnucnulviclhgc.R.inc(16453);inOrder.verify(writeLock, times(1)).lock();
        __CLR4_5_2cnucnulviclhgc.R.inc(16454);inOrder.verify(writeLock, times(1)).unlock();
        __CLR4_5_2cnucnulviclhgc.R.inc(16455);verify(readLock, never()).lock();
        __CLR4_5_2cnucnulviclhgc.R.inc(16456);verify(readLock, never()).unlock();
    }finally{__CLR4_5_2cnucnulviclhgc.R.flushNeeded();}}

    @Test
    public void shouldCall_set_iterable_WithWriteLock() {__CLR4_5_2cnucnulviclhgc.R.globalSliceStart(getClass().getName(),16457);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xz4l3rcp5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2cnucnulviclhgc.R.rethrow($CLV_t2$);}finally{__CLR4_5_2cnucnulviclhgc.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentPriorityCollection_TestCase.shouldCall_set_iterable_WithWriteLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16457,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xz4l3rcp5(){try{__CLR4_5_2cnucnulviclhgc.R.inc(16457);
        __CLR4_5_2cnucnulviclhgc.R.inc(16458);collection.set(iterable);
        __CLR4_5_2cnucnulviclhgc.R.inc(16459);verify(writeLock, atLeastOnce()).lock();
        __CLR4_5_2cnucnulviclhgc.R.inc(16460);verify(writeLock, atLeastOnce()).unlock();
        __CLR4_5_2cnucnulviclhgc.R.inc(16461);verify(readLock, never()).lock();
        __CLR4_5_2cnucnulviclhgc.R.inc(16462);verify(readLock, never()).unlock();
    }finally{__CLR4_5_2cnucnulviclhgc.R.flushNeeded();}}

    @Test
    public void shouldCall_remove_iterable_WithWriteLock() {__CLR4_5_2cnucnulviclhgc.R.globalSliceStart(getClass().getName(),16463);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22lqvh1cpb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2cnucnulviclhgc.R.rethrow($CLV_t2$);}finally{__CLR4_5_2cnucnulviclhgc.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentPriorityCollection_TestCase.shouldCall_remove_iterable_WithWriteLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16463,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22lqvh1cpb(){try{__CLR4_5_2cnucnulviclhgc.R.inc(16463);
        __CLR4_5_2cnucnulviclhgc.R.inc(16464);collection.remove(element);
        __CLR4_5_2cnucnulviclhgc.R.inc(16465);InOrder inOrder = inOrder(writeLock, writeLock);
        __CLR4_5_2cnucnulviclhgc.R.inc(16466);inOrder.verify(writeLock).lock();
        __CLR4_5_2cnucnulviclhgc.R.inc(16467);inOrder.verify(writeLock).unlock();
        __CLR4_5_2cnucnulviclhgc.R.inc(16468);verify(readLock, never()).lock();
        __CLR4_5_2cnucnulviclhgc.R.inc(16469);verify(readLock, never()).unlock();
    }finally{__CLR4_5_2cnucnulviclhgc.R.flushNeeded();}}

    @Test
    public void shouldCall_iterator_WithReadLock() {__CLR4_5_2cnucnulviclhgc.R.globalSliceStart(getClass().getName(),16470);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2k2xqmpcpi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2cnucnulviclhgc.R.rethrow($CLV_t2$);}finally{__CLR4_5_2cnucnulviclhgc.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentPriorityCollection_TestCase.shouldCall_iterator_WithReadLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16470,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2k2xqmpcpi(){try{__CLR4_5_2cnucnulviclhgc.R.inc(16470);
        __CLR4_5_2cnucnulviclhgc.R.inc(16471);collection.iterator();
        __CLR4_5_2cnucnulviclhgc.R.inc(16472);InOrder inOrder = inOrder(readLock, readLock);
        __CLR4_5_2cnucnulviclhgc.R.inc(16473);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2cnucnulviclhgc.R.inc(16474);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2cnucnulviclhgc.R.inc(16475);verify(writeLock, never()).lock();
        __CLR4_5_2cnucnulviclhgc.R.inc(16476);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2cnucnulviclhgc.R.flushNeeded();}}
}
