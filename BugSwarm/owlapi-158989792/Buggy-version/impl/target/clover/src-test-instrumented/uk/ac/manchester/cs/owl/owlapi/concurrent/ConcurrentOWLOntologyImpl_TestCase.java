/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package uk.ac.manchester.cs.owl.owlapi.concurrent;

import static org.mockito.Mockito.*;

import java.io.OutputStream;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Matthew Horridge
 * Stanford Center for Biomedical Informatics Research
 * 10/04/15
 */

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InOrder;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import org.semanticweb.owlapi.io.OWLOntologyDocumentTarget;
import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.model.parameters.AxiomAnnotations;
import org.semanticweb.owlapi.model.parameters.Imports;
import org.semanticweb.owlapi.model.parameters.Navigation;
import org.semanticweb.owlapi.util.OWLAxiomSearchFilter;

/**
 * Matthew Horridge Stanford Center for Biomedical Informatics Research 03/04/15
 */
@SuppressWarnings("javadoc")
@RunWith(MockitoJUnitRunner.class)
public class ConcurrentOWLOntologyImpl_TestCase {static class __CLR4_5_2be3be3lviclhfo{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u006d\u0070\u006c\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237246897L,8589935092L,16410,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Mock
    private ReentrantReadWriteLock readWriteLock;
    @Mock
    private ReentrantReadWriteLock.ReadLock readLock;
    @Mock
    private ReentrantReadWriteLock.WriteLock writeLock;
    @Mock
    private OWLMutableOntology delegate;
    private ConcurrentOWLOntologyImpl ontology;

    @Before
    public void setUp() {try{__CLR4_5_2be3be3lviclhfo.R.inc(14763);
        __CLR4_5_2be3be3lviclhfo.R.inc(14764);when(readWriteLock.readLock()).thenReturn(readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(14765);when(readWriteLock.writeLock()).thenReturn(writeLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(14766);ontology = spy(new ConcurrentOWLOntologyImpl(delegate, readWriteLock));
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_isEmpty_withReadLock() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),14767);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ahoqd2be7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_isEmpty_withReadLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14767,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ahoqd2be7(){try{__CLR4_5_2be3be3lviclhfo.R.inc(14767);
        __CLR4_5_2be3be3lviclhfo.R.inc(14768);ontology.isEmpty();
        __CLR4_5_2be3be3lviclhfo.R.inc(14769);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(14770);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(14771);inOrder.verify(delegate, times(1)).isEmpty();
        __CLR4_5_2be3be3lviclhfo.R.inc(14772);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(14773);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(14774);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getAnnotations_withReadLock() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),14775);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2j8yjgtbef();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getAnnotations_withReadLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14775,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2j8yjgtbef(){try{__CLR4_5_2be3be3lviclhfo.R.inc(14775);
        __CLR4_5_2be3be3lviclhfo.R.inc(14776);ontology.getAnnotations();
        __CLR4_5_2be3be3lviclhfo.R.inc(14777);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(14778);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(14779);inOrder.verify(delegate, times(1)).getAnnotations();
        __CLR4_5_2be3be3lviclhfo.R.inc(14780);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(14781);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(14782);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getSignature_withReadLock() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),14783);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tt7wf3ben();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getSignature_withReadLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14783,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tt7wf3ben(){try{__CLR4_5_2be3be3lviclhfo.R.inc(14783);
        __CLR4_5_2be3be3lviclhfo.R.inc(14784);Imports arg0 = Imports.INCLUDED;
        __CLR4_5_2be3be3lviclhfo.R.inc(14785);ontology.getSignature(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(14786);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(14787);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(14788);inOrder.verify(delegate, times(1)).getSignature(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(14789);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(14790);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(14791);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getSignature_withReadLock_2() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),14792);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uzajoybew();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getSignature_withReadLock_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14792,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uzajoybew(){try{__CLR4_5_2be3be3lviclhfo.R.inc(14792);
        __CLR4_5_2be3be3lviclhfo.R.inc(14793);ontology.getSignature();
        __CLR4_5_2be3be3lviclhfo.R.inc(14794);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(14795);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(14796);inOrder.verify(delegate, times(1)).getSignature();
        __CLR4_5_2be3be3lviclhfo.R.inc(14797);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(14798);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(14799);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_setOWLOntologyManager_withReadLock() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),14800);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2c5ca4dbf4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_setOWLOntologyManager_withReadLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14800,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2c5ca4dbf4(){try{__CLR4_5_2be3be3lviclhfo.R.inc(14800);
        __CLR4_5_2be3be3lviclhfo.R.inc(14801);OWLOntologyManager arg0 = mock(OWLOntologyManager.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(14802);ontology.setOWLOntologyManager(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(14803);InOrder inOrder = Mockito.inOrder(writeLock, delegate, writeLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(14804);inOrder.verify(writeLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(14805);inOrder.verify(delegate, times(1)).setOWLOntologyManager(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(14806);inOrder.verify(writeLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(14807);verify(readLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(14808);verify(readLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getOntologyID_withReadLock() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),14809);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21qisyvbfd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getOntologyID_withReadLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14809,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21qisyvbfd(){try{__CLR4_5_2be3be3lviclhfo.R.inc(14809);
        __CLR4_5_2be3be3lviclhfo.R.inc(14810);ontology.getOntologyID();
        __CLR4_5_2be3be3lviclhfo.R.inc(14811);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(14812);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(14813);inOrder.verify(delegate, times(1)).getOntologyID();
        __CLR4_5_2be3be3lviclhfo.R.inc(14814);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(14815);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(14816);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_isAnonymous_withReadLock() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),14817);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29m7kiybfl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_isAnonymous_withReadLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14817,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29m7kiybfl(){try{__CLR4_5_2be3be3lviclhfo.R.inc(14817);
        __CLR4_5_2be3be3lviclhfo.R.inc(14818);ontology.isAnonymous();
        __CLR4_5_2be3be3lviclhfo.R.inc(14819);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(14820);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(14821);inOrder.verify(delegate, times(1)).isAnonymous();
        __CLR4_5_2be3be3lviclhfo.R.inc(14822);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(14823);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(14824);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getDirectImportsDocuments_withReadLock() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),14825);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26y735cbft();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getDirectImportsDocuments_withReadLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14825,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26y735cbft(){try{__CLR4_5_2be3be3lviclhfo.R.inc(14825);
        __CLR4_5_2be3be3lviclhfo.R.inc(14826);ontology.getDirectImportsDocuments();
        __CLR4_5_2be3be3lviclhfo.R.inc(14827);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(14828);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(14829);inOrder.verify(delegate, times(1)).getDirectImportsDocuments();
        __CLR4_5_2be3be3lviclhfo.R.inc(14830);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(14831);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(14832);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getDirectImports_withReadLock() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),14833);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nxv20ebg1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getDirectImports_withReadLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14833,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nxv20ebg1(){try{__CLR4_5_2be3be3lviclhfo.R.inc(14833);
        __CLR4_5_2be3be3lviclhfo.R.inc(14834);ontology.getDirectImports();
        __CLR4_5_2be3be3lviclhfo.R.inc(14835);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(14836);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(14837);inOrder.verify(delegate, times(1)).getDirectImports();
        __CLR4_5_2be3be3lviclhfo.R.inc(14838);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(14839);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(14840);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getImports_withReadLock() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),14841);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2c1yjahbg9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getImports_withReadLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14841,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2c1yjahbg9(){try{__CLR4_5_2be3be3lviclhfo.R.inc(14841);
        __CLR4_5_2be3be3lviclhfo.R.inc(14842);ontology.getImports();
        __CLR4_5_2be3be3lviclhfo.R.inc(14843);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(14844);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(14845);inOrder.verify(delegate, times(1)).getImports();
        __CLR4_5_2be3be3lviclhfo.R.inc(14846);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(14847);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(14848);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getImportsClosure_withReadLock() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),14849);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ectyvqbgh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getImportsClosure_withReadLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14849,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ectyvqbgh(){try{__CLR4_5_2be3be3lviclhfo.R.inc(14849);
        __CLR4_5_2be3be3lviclhfo.R.inc(14850);ontology.getImportsClosure();
        __CLR4_5_2be3be3lviclhfo.R.inc(14851);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(14852);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(14853);inOrder.verify(delegate, times(1)).getImportsClosure();
        __CLR4_5_2be3be3lviclhfo.R.inc(14854);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(14855);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(14856);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getImportsDeclarations_withReadLock() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),14857);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2z5snm8bgp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getImportsDeclarations_withReadLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14857,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2z5snm8bgp(){try{__CLR4_5_2be3be3lviclhfo.R.inc(14857);
        __CLR4_5_2be3be3lviclhfo.R.inc(14858);ontology.getImportsDeclarations();
        __CLR4_5_2be3be3lviclhfo.R.inc(14859);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(14860);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(14861);inOrder.verify(delegate, times(1)).getImportsDeclarations();
        __CLR4_5_2be3be3lviclhfo.R.inc(14862);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(14863);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(14864);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getTBoxAxioms_withReadLock() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),14865);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2f0y6vbgx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getTBoxAxioms_withReadLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14865,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2f0y6vbgx(){try{__CLR4_5_2be3be3lviclhfo.R.inc(14865);
        __CLR4_5_2be3be3lviclhfo.R.inc(14866);Imports arg0 = Imports.INCLUDED;
        __CLR4_5_2be3be3lviclhfo.R.inc(14867);ontology.getTBoxAxioms(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(14868);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(14869);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(14870);inOrder.verify(delegate, times(1)).getTBoxAxioms(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(14871);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(14872);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(14873);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getABoxAxioms_withReadLock() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),14874);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_278h0mubh6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getABoxAxioms_withReadLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14874,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_278h0mubh6(){try{__CLR4_5_2be3be3lviclhfo.R.inc(14874);
        __CLR4_5_2be3be3lviclhfo.R.inc(14875);Imports arg0 = Imports.INCLUDED;
        __CLR4_5_2be3be3lviclhfo.R.inc(14876);ontology.getABoxAxioms(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(14877);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(14878);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(14879);inOrder.verify(delegate, times(1)).getABoxAxioms(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(14880);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(14881);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(14882);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getRBoxAxioms_withReadLock() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),14883);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_244k3onbhf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getRBoxAxioms_withReadLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14883,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_244k3onbhf(){try{__CLR4_5_2be3be3lviclhfo.R.inc(14883);
        __CLR4_5_2be3be3lviclhfo.R.inc(14884);Imports arg0 = Imports.INCLUDED;
        __CLR4_5_2be3be3lviclhfo.R.inc(14885);ontology.getRBoxAxioms(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(14886);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(14887);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(14888);inOrder.verify(delegate, times(1)).getRBoxAxioms(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(14889);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(14890);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(14891);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getGeneralClassAxioms_withReadLock() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),14892);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e5bhyobho();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getGeneralClassAxioms_withReadLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14892,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e5bhyobho(){try{__CLR4_5_2be3be3lviclhfo.R.inc(14892);
        __CLR4_5_2be3be3lviclhfo.R.inc(14893);ontology.getGeneralClassAxioms();
        __CLR4_5_2be3be3lviclhfo.R.inc(14894);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(14895);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(14896);inOrder.verify(delegate, times(1)).getGeneralClassAxioms();
        __CLR4_5_2be3be3lviclhfo.R.inc(14897);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(14898);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(14899);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_isDeclared_withReadLock() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),14900);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_266n4rhbhw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_isDeclared_withReadLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14900,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_266n4rhbhw(){try{__CLR4_5_2be3be3lviclhfo.R.inc(14900);
        __CLR4_5_2be3be3lviclhfo.R.inc(14901);OWLEntity arg0 = mock(OWLEntity.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(14902);Imports arg1 = Imports.INCLUDED;
        __CLR4_5_2be3be3lviclhfo.R.inc(14903);ontology.isDeclared(arg0, arg1);
        __CLR4_5_2be3be3lviclhfo.R.inc(14904);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(14905);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(14906);inOrder.verify(delegate, times(1)).isDeclared(arg0, arg1);
        __CLR4_5_2be3be3lviclhfo.R.inc(14907);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(14908);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(14909);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_isDeclared_withReadLock_2() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),14910);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fu67gwbi6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_isDeclared_withReadLock_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14910,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fu67gwbi6(){try{__CLR4_5_2be3be3lviclhfo.R.inc(14910);
        __CLR4_5_2be3be3lviclhfo.R.inc(14911);OWLEntity arg0 = mock(OWLEntity.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(14912);ontology.isDeclared(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(14913);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(14914);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(14915);inOrder.verify(delegate, times(1)).isDeclared(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(14916);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(14917);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(14918);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_saveOntology_withReadLock() throws OWLOntologyStorageException {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),14919);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ns6wz9bif();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_saveOntology_withReadLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14919,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ns6wz9bif() throws OWLOntologyStorageException{try{__CLR4_5_2be3be3lviclhfo.R.inc(14919);
        __CLR4_5_2be3be3lviclhfo.R.inc(14920);OWLDocumentFormat arg0 = mock(OWLDocumentFormat.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(14921);IRI arg1 = mock(IRI.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(14922);ontology.saveOntology(arg0, arg1);
        __CLR4_5_2be3be3lviclhfo.R.inc(14923);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(14924);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(14925);inOrder.verify(delegate, times(1)).saveOntology(arg0, arg1);
        __CLR4_5_2be3be3lviclhfo.R.inc(14926);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(14927);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(14928);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_saveOntology_withReadLock_2() throws OWLOntologyStorageException {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),14929);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28xv1ywbip();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_saveOntology_withReadLock_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14929,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28xv1ywbip() throws OWLOntologyStorageException{try{__CLR4_5_2be3be3lviclhfo.R.inc(14929);
        __CLR4_5_2be3be3lviclhfo.R.inc(14930);OWLDocumentFormat arg0 = mock(OWLDocumentFormat.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(14931);OutputStream arg1 = mock(OutputStream.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(14932);ontology.saveOntology(arg0, arg1);
        __CLR4_5_2be3be3lviclhfo.R.inc(14933);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(14934);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(14935);inOrder.verify(delegate, times(1)).saveOntology(arg0, arg1);
        __CLR4_5_2be3be3lviclhfo.R.inc(14936);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(14937);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(14938);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_saveOntology_withReadLock_3() throws OWLOntologyStorageException {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),14939);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25ov36fbiz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_saveOntology_withReadLock_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14939,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25ov36fbiz() throws OWLOntologyStorageException{try{__CLR4_5_2be3be3lviclhfo.R.inc(14939);
        __CLR4_5_2be3be3lviclhfo.R.inc(14940);OWLOntologyDocumentTarget arg0 = mock(OWLOntologyDocumentTarget.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(14941);ontology.saveOntology(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(14942);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(14943);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(14944);inOrder.verify(delegate, times(1)).saveOntology(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(14945);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(14946);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(14947);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_saveOntology_withReadLock_4() throws OWLOntologyStorageException {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),14948);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22fv4dybj8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_saveOntology_withReadLock_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14948,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22fv4dybj8() throws OWLOntologyStorageException{try{__CLR4_5_2be3be3lviclhfo.R.inc(14948);
        __CLR4_5_2be3be3lviclhfo.R.inc(14949);OWLDocumentFormat arg0 = mock(OWLDocumentFormat.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(14950);OWLOntologyDocumentTarget arg1 = mock(OWLOntologyDocumentTarget.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(14951);ontology.saveOntology(arg0, arg1);
        __CLR4_5_2be3be3lviclhfo.R.inc(14952);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(14953);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(14954);inOrder.verify(delegate, times(1)).saveOntology(arg0, arg1);
        __CLR4_5_2be3be3lviclhfo.R.inc(14955);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(14956);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(14957);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_saveOntology_withReadLock_5() throws OWLOntologyStorageException {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),14958);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2t4uejbji();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_saveOntology_withReadLock_5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14958,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2t4uejbji() throws OWLOntologyStorageException{try{__CLR4_5_2be3be3lviclhfo.R.inc(14958);
        __CLR4_5_2be3be3lviclhfo.R.inc(14959);ontology.saveOntology();
        __CLR4_5_2be3be3lviclhfo.R.inc(14960);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(14961);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(14962);inOrder.verify(delegate, times(1)).saveOntology();
        __CLR4_5_2be3be3lviclhfo.R.inc(14963);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(14964);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(14965);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_saveOntology_withReadLock_6() throws OWLOntologyStorageException {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),14966);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2424t70bjq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_saveOntology_withReadLock_6",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14966,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2424t70bjq() throws OWLOntologyStorageException{try{__CLR4_5_2be3be3lviclhfo.R.inc(14966);
        __CLR4_5_2be3be3lviclhfo.R.inc(14967);IRI arg0 = mock(IRI.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(14968);ontology.saveOntology(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(14969);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(14970);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(14971);inOrder.verify(delegate, times(1)).saveOntology(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(14972);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(14973);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(14974);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_saveOntology_withReadLock_7() throws OWLOntologyStorageException {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),14975);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27b4rzhbjz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_saveOntology_withReadLock_7",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14975,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27b4rzhbjz() throws OWLOntologyStorageException{try{__CLR4_5_2be3be3lviclhfo.R.inc(14975);
        __CLR4_5_2be3be3lviclhfo.R.inc(14976);OutputStream arg0 = mock(OutputStream.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(14977);ontology.saveOntology(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(14978);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(14979);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(14980);inOrder.verify(delegate, times(1)).saveOntology(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(14981);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(14982);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(14983);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_saveOntology_withReadLock_8() throws OWLOntologyStorageException {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),14984);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ak4qrybk8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_saveOntology_withReadLock_8",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14984,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ak4qrybk8() throws OWLOntologyStorageException{try{__CLR4_5_2be3be3lviclhfo.R.inc(14984);
        __CLR4_5_2be3be3lviclhfo.R.inc(14985);OWLDocumentFormat arg0 = mock(OWLDocumentFormat.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(14986);ontology.saveOntology(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(14987);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(14988);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(14989);inOrder.verify(delegate, times(1)).saveOntology(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(14990);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(14991);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(14992);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getNestedClassExpressions_withReadLock() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),14993);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2g0zqjtbkh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getNestedClassExpressions_withReadLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14993,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2g0zqjtbkh(){try{__CLR4_5_2be3be3lviclhfo.R.inc(14993);
        __CLR4_5_2be3be3lviclhfo.R.inc(14994);ontology.getNestedClassExpressions();
        __CLR4_5_2be3be3lviclhfo.R.inc(14995);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(14996);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(14997);inOrder.verify(delegate, times(1)).getNestedClassExpressions();
        __CLR4_5_2be3be3lviclhfo.R.inc(14998);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(14999);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15000);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_isTopEntity_withReadLock() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),15001);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xlc4mjbkp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_isTopEntity_withReadLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15001,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xlc4mjbkp(){try{__CLR4_5_2be3be3lviclhfo.R.inc(15001);
        __CLR4_5_2be3be3lviclhfo.R.inc(15002);ontology.isTopEntity();
        __CLR4_5_2be3be3lviclhfo.R.inc(15003);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(15004);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15005);inOrder.verify(delegate, times(1)).isTopEntity();
        __CLR4_5_2be3be3lviclhfo.R.inc(15006);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15007);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15008);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_isBottomEntity_withReadLock() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),15009);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21unns9bkx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_isBottomEntity_withReadLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15009,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21unns9bkx(){try{__CLR4_5_2be3be3lviclhfo.R.inc(15009);
        __CLR4_5_2be3be3lviclhfo.R.inc(15010);ontology.isBottomEntity();
        __CLR4_5_2be3be3lviclhfo.R.inc(15011);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(15012);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15013);inOrder.verify(delegate, times(1)).isBottomEntity();
        __CLR4_5_2be3be3lviclhfo.R.inc(15014);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15015);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15016);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_containsEntityInSignature_withReadLock() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),15017);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25ogp08bl5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_containsEntityInSignature_withReadLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15017,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25ogp08bl5(){try{__CLR4_5_2be3be3lviclhfo.R.inc(15017);
        __CLR4_5_2be3be3lviclhfo.R.inc(15018);OWLEntity arg0 = mock(OWLEntity.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(15019);ontology.containsEntityInSignature(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(15020);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(15021);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15022);inOrder.verify(delegate, times(1)).containsEntityInSignature(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(15023);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15024);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15025);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getAnonymousIndividuals_withReadLock() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),15026);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23n46buble();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getAnonymousIndividuals_withReadLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15026,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23n46buble(){try{__CLR4_5_2be3be3lviclhfo.R.inc(15026);
        __CLR4_5_2be3be3lviclhfo.R.inc(15027);ontology.getAnonymousIndividuals();
        __CLR4_5_2be3be3lviclhfo.R.inc(15028);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(15029);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15030);inOrder.verify(delegate, times(1)).getAnonymousIndividuals();
        __CLR4_5_2be3be3lviclhfo.R.inc(15031);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15032);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15033);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getClassesInSignature_withReadLock() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),15034);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24un9o6blm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getClassesInSignature_withReadLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15034,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24un9o6blm(){try{__CLR4_5_2be3be3lviclhfo.R.inc(15034);
        __CLR4_5_2be3be3lviclhfo.R.inc(15035);ontology.getClassesInSignature();
        __CLR4_5_2be3be3lviclhfo.R.inc(15036);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(15037);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15038);inOrder.verify(delegate, times(1)).getClassesInSignature();
        __CLR4_5_2be3be3lviclhfo.R.inc(15039);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15040);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15041);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getObjectPropertiesInSignature_withReadLock() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),15042);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xcrxu2blu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getObjectPropertiesInSignature_withReadLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15042,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xcrxu2blu(){try{__CLR4_5_2be3be3lviclhfo.R.inc(15042);
        __CLR4_5_2be3be3lviclhfo.R.inc(15043);ontology.getObjectPropertiesInSignature();
        __CLR4_5_2be3be3lviclhfo.R.inc(15044);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(15045);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15046);inOrder.verify(delegate, times(1)).getObjectPropertiesInSignature();
        __CLR4_5_2be3be3lviclhfo.R.inc(15047);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15048);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15049);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getDataPropertiesInSignature_withReadLock() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),15050);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23mnc8xbm2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getDataPropertiesInSignature_withReadLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15050,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23mnc8xbm2(){try{__CLR4_5_2be3be3lviclhfo.R.inc(15050);
        __CLR4_5_2be3be3lviclhfo.R.inc(15051);ontology.getDataPropertiesInSignature();
        __CLR4_5_2be3be3lviclhfo.R.inc(15052);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(15053);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15054);inOrder.verify(delegate, times(1)).getDataPropertiesInSignature();
        __CLR4_5_2be3be3lviclhfo.R.inc(15055);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15056);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15057);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getIndividualsInSignature_withReadLock() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),15058);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tar5e2bma();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getIndividualsInSignature_withReadLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15058,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tar5e2bma(){try{__CLR4_5_2be3be3lviclhfo.R.inc(15058);
        __CLR4_5_2be3be3lviclhfo.R.inc(15059);ontology.getIndividualsInSignature();
        __CLR4_5_2be3be3lviclhfo.R.inc(15060);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(15061);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15062);inOrder.verify(delegate, times(1)).getIndividualsInSignature();
        __CLR4_5_2be3be3lviclhfo.R.inc(15063);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15064);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15065);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getDatatypesInSignature_withReadLock() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),15066);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_250p24fbmi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getDatatypesInSignature_withReadLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15066,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_250p24fbmi(){try{__CLR4_5_2be3be3lviclhfo.R.inc(15066);
        __CLR4_5_2be3be3lviclhfo.R.inc(15067);ontology.getDatatypesInSignature();
        __CLR4_5_2be3be3lviclhfo.R.inc(15068);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(15069);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15070);inOrder.verify(delegate, times(1)).getDatatypesInSignature();
        __CLR4_5_2be3be3lviclhfo.R.inc(15071);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15072);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15073);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getAnnotationPropertiesInSignature_withReadLock() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),15074);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26yet46bmq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getAnnotationPropertiesInSignature_withReadLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15074,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26yet46bmq(){try{__CLR4_5_2be3be3lviclhfo.R.inc(15074);
        __CLR4_5_2be3be3lviclhfo.R.inc(15075);ontology.getAnnotationPropertiesInSignature();
        __CLR4_5_2be3be3lviclhfo.R.inc(15076);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(15077);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15078);inOrder.verify(delegate, times(1)).getAnnotationPropertiesInSignature();
        __CLR4_5_2be3be3lviclhfo.R.inc(15079);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15080);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15081);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getAxioms_withReadLock() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),15082);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2glxnpcbmy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getAxioms_withReadLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15082,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2glxnpcbmy(){try{__CLR4_5_2be3be3lviclhfo.R.inc(15082);
        __CLR4_5_2be3be3lviclhfo.R.inc(15083);OWLDatatype arg0 = mock(OWLDatatype.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(15084);Imports arg1 = Imports.INCLUDED;
        __CLR4_5_2be3be3lviclhfo.R.inc(15085);ontology.getAxioms(arg0, arg1);
        __CLR4_5_2be3be3lviclhfo.R.inc(15086);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(15087);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15088);inOrder.verify(delegate, times(1)).getAxioms(arg0, arg1);
        __CLR4_5_2be3be3lviclhfo.R.inc(15089);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15090);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15091);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getAxioms_withReadLock_2() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),15092);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cz2c31bn8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getAxioms_withReadLock_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15092,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cz2c31bn8(){try{__CLR4_5_2be3be3lviclhfo.R.inc(15092);
        __CLR4_5_2be3be3lviclhfo.R.inc(15093);OWLClass arg0 = mock(OWLClass.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(15094);Imports arg1 = Imports.INCLUDED;
        __CLR4_5_2be3be3lviclhfo.R.inc(15095);ontology.getAxioms(arg0, arg1);
        __CLR4_5_2be3be3lviclhfo.R.inc(15096);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(15097);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15098);inOrder.verify(delegate, times(1)).getAxioms(arg0, arg1);
        __CLR4_5_2be3be3lviclhfo.R.inc(15099);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15100);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15101);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getAxioms_withReadLock_3() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),15102);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29q2dakbni();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getAxioms_withReadLock_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15102,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29q2dakbni(){try{__CLR4_5_2be3be3lviclhfo.R.inc(15102);
        __CLR4_5_2be3be3lviclhfo.R.inc(15103);OWLObjectPropertyExpression arg0 = mock(OWLObjectPropertyExpression.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(15104);Imports arg1 = Imports.INCLUDED;
        __CLR4_5_2be3be3lviclhfo.R.inc(15105);ontology.getAxioms(arg0, arg1);
        __CLR4_5_2be3be3lviclhfo.R.inc(15106);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(15107);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15108);inOrder.verify(delegate, times(1)).getAxioms(arg0, arg1);
        __CLR4_5_2be3be3lviclhfo.R.inc(15109);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15110);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15111);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getAxioms_withReadLock_4() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),15112);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26h2ei3bns();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getAxioms_withReadLock_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15112,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26h2ei3bns(){try{__CLR4_5_2be3be3lviclhfo.R.inc(15112);
        __CLR4_5_2be3be3lviclhfo.R.inc(15113);OWLDataProperty arg0 = mock(OWLDataProperty.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(15114);Imports arg1 = Imports.INCLUDED;
        __CLR4_5_2be3be3lviclhfo.R.inc(15115);ontology.getAxioms(arg0, arg1);
        __CLR4_5_2be3be3lviclhfo.R.inc(15116);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(15117);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15118);inOrder.verify(delegate, times(1)).getAxioms(arg0, arg1);
        __CLR4_5_2be3be3lviclhfo.R.inc(15119);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15120);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15121);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getAxioms_withReadLock_5() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),15122);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2382fpmbo2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getAxioms_withReadLock_5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15122,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2382fpmbo2(){try{__CLR4_5_2be3be3lviclhfo.R.inc(15122);
        __CLR4_5_2be3be3lviclhfo.R.inc(15123);OWLIndividual arg0 = mock(OWLIndividual.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(15124);Imports arg1 = Imports.INCLUDED;
        __CLR4_5_2be3be3lviclhfo.R.inc(15125);ontology.getAxioms(arg0, arg1);
        __CLR4_5_2be3be3lviclhfo.R.inc(15126);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(15127);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15128);inOrder.verify(delegate, times(1)).getAxioms(arg0, arg1);
        __CLR4_5_2be3be3lviclhfo.R.inc(15129);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15130);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15131);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getAxioms_withReadLock_6() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),15132);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xj2vboc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getAxioms_withReadLock_6",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15132,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xj2vboc(){try{__CLR4_5_2be3be3lviclhfo.R.inc(15132);
        __CLR4_5_2be3be3lviclhfo.R.inc(15133);OWLAnnotationProperty arg0 = mock(OWLAnnotationProperty.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(15134);Imports arg1 = Imports.INCLUDED;
        __CLR4_5_2be3be3lviclhfo.R.inc(15135);ontology.getAxioms(arg0, arg1);
        __CLR4_5_2be3be3lviclhfo.R.inc(15136);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(15137);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15138);inOrder.verify(delegate, times(1)).getAxioms(arg0, arg1);
        __CLR4_5_2be3be3lviclhfo.R.inc(15139);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15140);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15141);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getAxioms_withReadLock_7() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),15142);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_239xhvcbom();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getAxioms_withReadLock_7",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15142,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_239xhvcbom(){try{__CLR4_5_2be3be3lviclhfo.R.inc(15142);
        __CLR4_5_2be3be3lviclhfo.R.inc(15143);Imports arg0 = Imports.INCLUDED;
        __CLR4_5_2be3be3lviclhfo.R.inc(15144);ontology.getAxioms(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(15145);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(15146);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15147);inOrder.verify(delegate, times(1)).getAxioms(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(15148);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15149);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15150);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getAxioms_withReadLock_8() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),15151);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26ixgntbov();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getAxioms_withReadLock_8",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15151,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26ixgntbov(){try{__CLR4_5_2be3be3lviclhfo.R.inc(15151);
        __CLR4_5_2be3be3lviclhfo.R.inc(15152);AxiomType arg0 = AxiomType.SUBCLASS_OF;
        __CLR4_5_2be3be3lviclhfo.R.inc(15153);Imports arg1 = Imports.INCLUDED;
        __CLR4_5_2be3be3lviclhfo.R.inc(15154);ontology.getAxioms(arg0, arg1);
        __CLR4_5_2be3be3lviclhfo.R.inc(15155);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(15156);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15157);inOrder.verify(delegate, times(1)).getAxioms(arg0, arg1);
        __CLR4_5_2be3be3lviclhfo.R.inc(15158);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15159);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15160);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getAxiomCount_withReadLock() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),15161);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2flz078bp5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getAxiomCount_withReadLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15161,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2flz078bp5(){try{__CLR4_5_2be3be3lviclhfo.R.inc(15161);
        __CLR4_5_2be3be3lviclhfo.R.inc(15162);AxiomType arg0 = AxiomType.SUBCLASS_OF;
        __CLR4_5_2be3be3lviclhfo.R.inc(15163);Imports arg1 = Imports.INCLUDED;
        __CLR4_5_2be3be3lviclhfo.R.inc(15164);ontology.getAxiomCount(arg0, arg1);
        __CLR4_5_2be3be3lviclhfo.R.inc(15165);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(15166);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15167);inOrder.verify(delegate, times(1)).getAxiomCount(arg0, arg1);
        __CLR4_5_2be3be3lviclhfo.R.inc(15168);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15169);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15170);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getAxiomCount_withReadLock_2() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),15171);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lgh13rbpf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getAxiomCount_withReadLock_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15171,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lgh13rbpf(){try{__CLR4_5_2be3be3lviclhfo.R.inc(15171);
        __CLR4_5_2be3be3lviclhfo.R.inc(15172);Imports arg0 = Imports.INCLUDED;
        __CLR4_5_2be3be3lviclhfo.R.inc(15173);ontology.getAxiomCount(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(15174);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(15175);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15176);inOrder.verify(delegate, times(1)).getAxiomCount(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(15177);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15178);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15179);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getLogicalAxioms_withReadLock() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),15180);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fmc639bpo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getLogicalAxioms_withReadLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15180,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fmc639bpo(){try{__CLR4_5_2be3be3lviclhfo.R.inc(15180);
        __CLR4_5_2be3be3lviclhfo.R.inc(15181);Imports arg0 = Imports.INCLUDED;
        __CLR4_5_2be3be3lviclhfo.R.inc(15182);ontology.getLogicalAxioms(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(15183);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(15184);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15185);inOrder.verify(delegate, times(1)).getLogicalAxioms(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(15186);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15187);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15188);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getLogicalAxiomCount_withReadLock() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),15189);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2o9h429bpx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getLogicalAxiomCount_withReadLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15189,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2o9h429bpx(){try{__CLR4_5_2be3be3lviclhfo.R.inc(15189);
        __CLR4_5_2be3be3lviclhfo.R.inc(15190);Imports arg0 = Imports.INCLUDED;
        __CLR4_5_2be3be3lviclhfo.R.inc(15191);ontology.getLogicalAxiomCount(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(15192);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(15193);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15194);inOrder.verify(delegate, times(1)).getLogicalAxiomCount(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(15195);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15196);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15197);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_containsAxiom_withReadLock() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),15198);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jn1sq0bq6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_containsAxiom_withReadLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15198,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jn1sq0bq6(){try{__CLR4_5_2be3be3lviclhfo.R.inc(15198);
        __CLR4_5_2be3be3lviclhfo.R.inc(15199);OWLAxiom arg0 = mock(OWLAxiom.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(15200);Imports arg1 = Imports.INCLUDED;
        __CLR4_5_2be3be3lviclhfo.R.inc(15201);AxiomAnnotations arg2 = AxiomAnnotations.IGNORE_AXIOM_ANNOTATIONS;
        __CLR4_5_2be3be3lviclhfo.R.inc(15202);ontology.containsAxiom(arg0, arg1, arg2);
        __CLR4_5_2be3be3lviclhfo.R.inc(15203);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(15204);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15205);inOrder.verify(delegate, times(1)).containsAxiom(arg0, arg1, arg2);
        __CLR4_5_2be3be3lviclhfo.R.inc(15206);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15207);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15208);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getAxiomsIgnoreAnnotations_withReadLock() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),15209);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26omllkbqh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getAxiomsIgnoreAnnotations_withReadLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15209,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26omllkbqh(){try{__CLR4_5_2be3be3lviclhfo.R.inc(15209);
        __CLR4_5_2be3be3lviclhfo.R.inc(15210);OWLAxiom arg0 = mock(OWLAxiom.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(15211);Imports arg1 = Imports.INCLUDED;
        __CLR4_5_2be3be3lviclhfo.R.inc(15212);ontology.getAxiomsIgnoreAnnotations(arg0, arg1);
        __CLR4_5_2be3be3lviclhfo.R.inc(15213);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(15214);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15215);inOrder.verify(delegate, times(1)).getAxiomsIgnoreAnnotations(arg0, arg1);
        __CLR4_5_2be3be3lviclhfo.R.inc(15216);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15217);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15218);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getReferencingAxioms_withReadLock() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),15219);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22ccl7wbqr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getReferencingAxioms_withReadLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15219,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22ccl7wbqr(){try{__CLR4_5_2be3be3lviclhfo.R.inc(15219);
        __CLR4_5_2be3be3lviclhfo.R.inc(15220);OWLPrimitive arg0 = mock(OWLPrimitive.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(15221);Imports arg1 = Imports.INCLUDED;
        __CLR4_5_2be3be3lviclhfo.R.inc(15222);ontology.getReferencingAxioms(arg0, arg1);
        __CLR4_5_2be3be3lviclhfo.R.inc(15223);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(15224);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15225);inOrder.verify(delegate, times(1)).getReferencingAxioms(arg0, arg1);
        __CLR4_5_2be3be3lviclhfo.R.inc(15226);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15227);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15228);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getAxioms_withReadLock_9() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),15229);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29rxfgabr1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getAxioms_withReadLock_9",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15229,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29rxfgabr1(){try{__CLR4_5_2be3be3lviclhfo.R.inc(15229);
        __CLR4_5_2be3be3lviclhfo.R.inc(15230);ontology.getAxioms();
        __CLR4_5_2be3be3lviclhfo.R.inc(15231);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(15232);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15233);inOrder.verify(delegate, times(1)).getAxioms();
        __CLR4_5_2be3be3lviclhfo.R.inc(15234);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15235);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15236);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getLogicalAxioms_withReadLock_2() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),15237);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gcaqv6br9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getLogicalAxioms_withReadLock_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15237,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gcaqv6br9(){try{__CLR4_5_2be3be3lviclhfo.R.inc(15237);
        __CLR4_5_2be3be3lviclhfo.R.inc(15238);ontology.getLogicalAxioms();
        __CLR4_5_2be3be3lviclhfo.R.inc(15239);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(15240);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15241);inOrder.verify(delegate, times(1)).getLogicalAxioms();
        __CLR4_5_2be3be3lviclhfo.R.inc(15242);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15243);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15244);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getAxioms_withReadLock_10() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),15245);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uk9bqkbrh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getAxioms_withReadLock_10",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15245,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uk9bqkbrh(){try{__CLR4_5_2be3be3lviclhfo.R.inc(15245);
        __CLR4_5_2be3be3lviclhfo.R.inc(15246);AxiomType arg0 = AxiomType.SUBCLASS_OF;
        __CLR4_5_2be3be3lviclhfo.R.inc(15247);ontology.getAxioms(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(15248);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(15249);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15250);inOrder.verify(delegate, times(1)).getAxioms(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(15251);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15252);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15253);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_containsAxiom_withReadLock_2() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),15254);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ch6m9xbrq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_containsAxiom_withReadLock_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15254,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ch6m9xbrq(){try{__CLR4_5_2be3be3lviclhfo.R.inc(15254);
        __CLR4_5_2be3be3lviclhfo.R.inc(15255);OWLAxiom arg0 = mock(OWLAxiom.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(15256);ontology.containsAxiom(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(15257);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(15258);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15259);inOrder.verify(delegate, times(1)).containsAxiom(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(15260);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15261);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15262);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getAxioms_withReadLock_11() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),15263);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xt9aj1brz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getAxioms_withReadLock_11",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15263,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xt9aj1brz(){try{__CLR4_5_2be3be3lviclhfo.R.inc(15263);
        __CLR4_5_2be3be3lviclhfo.R.inc(15264);OWLDatatype arg0 = mock(OWLDatatype.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(15265);boolean arg1 = true;
        __CLR4_5_2be3be3lviclhfo.R.inc(15266);ontology.getAxioms(arg0, arg1);
        __CLR4_5_2be3be3lviclhfo.R.inc(15267);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(15268);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15269);inOrder.verify(delegate, times(1)).getAxioms(arg0, arg1);
        __CLR4_5_2be3be3lviclhfo.R.inc(15270);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15271);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15272);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getAxioms_withReadLock_12() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),15273);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xyusnmbs9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getAxioms_withReadLock_12",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15273,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xyusnmbs9(){try{__CLR4_5_2be3be3lviclhfo.R.inc(15273);
        __CLR4_5_2be3be3lviclhfo.R.inc(15274);OWLClass arg0 = mock(OWLClass.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(15275);boolean arg1 = true;
        __CLR4_5_2be3be3lviclhfo.R.inc(15276);ontology.getAxioms(arg0, arg1);
        __CLR4_5_2be3be3lviclhfo.R.inc(15277);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(15278);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15279);inOrder.verify(delegate, times(1)).getAxioms(arg0, arg1);
        __CLR4_5_2be3be3lviclhfo.R.inc(15280);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15281);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15282);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getAxioms_withReadLock_13() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),15283);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uputv5bsj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getAxioms_withReadLock_13",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15283,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uputv5bsj(){try{__CLR4_5_2be3be3lviclhfo.R.inc(15283);
        __CLR4_5_2be3be3lviclhfo.R.inc(15284);OWLObjectPropertyExpression arg0 = mock(OWLObjectPropertyExpression.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(15285);boolean arg1 = true;
        __CLR4_5_2be3be3lviclhfo.R.inc(15286);ontology.getAxioms(arg0, arg1);
        __CLR4_5_2be3be3lviclhfo.R.inc(15287);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(15288);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15289);inOrder.verify(delegate, times(1)).getAxioms(arg0, arg1);
        __CLR4_5_2be3be3lviclhfo.R.inc(15290);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15291);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15292);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getAxioms_withReadLock_14() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),15293);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rguv2obst();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getAxioms_withReadLock_14",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15293,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rguv2obst(){try{__CLR4_5_2be3be3lviclhfo.R.inc(15293);
        __CLR4_5_2be3be3lviclhfo.R.inc(15294);OWLDataProperty arg0 = mock(OWLDataProperty.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(15295);boolean arg1 = true;
        __CLR4_5_2be3be3lviclhfo.R.inc(15296);ontology.getAxioms(arg0, arg1);
        __CLR4_5_2be3be3lviclhfo.R.inc(15297);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(15298);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15299);inOrder.verify(delegate, times(1)).getAxioms(arg0, arg1);
        __CLR4_5_2be3be3lviclhfo.R.inc(15300);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15301);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15302);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getAxioms_withReadLock_15() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),15303);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2o7uwa7bt3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getAxioms_withReadLock_15",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15303,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2o7uwa7bt3(){try{__CLR4_5_2be3be3lviclhfo.R.inc(15303);
        __CLR4_5_2be3be3lviclhfo.R.inc(15304);OWLIndividual arg0 = mock(OWLIndividual.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(15305);boolean arg1 = true;
        __CLR4_5_2be3be3lviclhfo.R.inc(15306);ontology.getAxioms(arg0, arg1);
        __CLR4_5_2be3be3lviclhfo.R.inc(15307);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(15308);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15309);inOrder.verify(delegate, times(1)).getAxioms(arg0, arg1);
        __CLR4_5_2be3be3lviclhfo.R.inc(15310);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15311);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15312);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getAxioms_withReadLock_16() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),15313);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kyuxhqbtd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getAxioms_withReadLock_16",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15313,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kyuxhqbtd(){try{__CLR4_5_2be3be3lviclhfo.R.inc(15313);
        __CLR4_5_2be3be3lviclhfo.R.inc(15314);OWLAnnotationProperty arg0 = mock(OWLAnnotationProperty.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(15315);boolean arg1 = true;
        __CLR4_5_2be3be3lviclhfo.R.inc(15316);ontology.getAxioms(arg0, arg1);
        __CLR4_5_2be3be3lviclhfo.R.inc(15317);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(15318);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15319);inOrder.verify(delegate, times(1)).getAxioms(arg0, arg1);
        __CLR4_5_2be3be3lviclhfo.R.inc(15320);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15321);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15322);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getAxioms_withReadLock_17() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),15323);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hpuyp9btn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getAxioms_withReadLock_17",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15323,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hpuyp9btn(){try{__CLR4_5_2be3be3lviclhfo.R.inc(15323);
        __CLR4_5_2be3be3lviclhfo.R.inc(15324);AxiomType arg0 = AxiomType.SUBCLASS_OF;
        __CLR4_5_2be3be3lviclhfo.R.inc(15325);boolean arg1 = true;
        __CLR4_5_2be3be3lviclhfo.R.inc(15326);ontology.getAxioms(arg0, arg1);
        __CLR4_5_2be3be3lviclhfo.R.inc(15327);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(15328);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15329);inOrder.verify(delegate, times(1)).getAxioms(arg0, arg1);
        __CLR4_5_2be3be3lviclhfo.R.inc(15330);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15331);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15332);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getAxioms_withReadLock_18() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),15333);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2eguzwsbtx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getAxioms_withReadLock_18",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15333,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2eguzwsbtx(){try{__CLR4_5_2be3be3lviclhfo.R.inc(15333);
        __CLR4_5_2be3be3lviclhfo.R.inc(15334);boolean arg0 = true;
        __CLR4_5_2be3be3lviclhfo.R.inc(15335);ontology.getAxioms(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(15336);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(15337);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15338);inOrder.verify(delegate, times(1)).getAxioms(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(15339);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15340);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15341);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getAxiomCount_withReadLock_3() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),15342);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2opgzw8bu6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getAxiomCount_withReadLock_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15342,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2opgzw8bu6(){try{__CLR4_5_2be3be3lviclhfo.R.inc(15342);
        __CLR4_5_2be3be3lviclhfo.R.inc(15343);boolean arg0 = true;
        __CLR4_5_2be3be3lviclhfo.R.inc(15344);ontology.getAxiomCount(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(15345);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(15346);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15347);inOrder.verify(delegate, times(1)).getAxiomCount(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(15348);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15349);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15350);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getAxiomCount_withReadLock_4() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),15351);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rygyopbuf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getAxiomCount_withReadLock_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15351,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rygyopbuf(){try{__CLR4_5_2be3be3lviclhfo.R.inc(15351);
        __CLR4_5_2be3be3lviclhfo.R.inc(15352);AxiomType arg0 = AxiomType.SUBCLASS_OF;
        __CLR4_5_2be3be3lviclhfo.R.inc(15353);boolean arg1 = true;
        __CLR4_5_2be3be3lviclhfo.R.inc(15354);ontology.getAxiomCount(arg0, arg1);
        __CLR4_5_2be3be3lviclhfo.R.inc(15355);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(15356);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15357);inOrder.verify(delegate, times(1)).getAxiomCount(arg0, arg1);
        __CLR4_5_2be3be3lviclhfo.R.inc(15358);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15359);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15360);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getLogicalAxioms_withReadLock_3() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),15361);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2d3as2pbup();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getLogicalAxioms_withReadLock_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15361,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2d3as2pbup(){try{__CLR4_5_2be3be3lviclhfo.R.inc(15361);
        __CLR4_5_2be3be3lviclhfo.R.inc(15362);boolean arg0 = true;
        __CLR4_5_2be3be3lviclhfo.R.inc(15363);ontology.getLogicalAxioms(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(15364);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(15365);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15366);inOrder.verify(delegate, times(1)).getLogicalAxioms(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(15367);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15368);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15369);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getLogicalAxiomCount_withReadLock_2() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),15370);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bd3726buy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getLogicalAxiomCount_withReadLock_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15370,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bd3726buy(){try{__CLR4_5_2be3be3lviclhfo.R.inc(15370);
        __CLR4_5_2be3be3lviclhfo.R.inc(15371);boolean arg0 = true;
        __CLR4_5_2be3be3lviclhfo.R.inc(15372);ontology.getLogicalAxiomCount(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(15373);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(15374);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15375);inOrder.verify(delegate, times(1)).getLogicalAxiomCount(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(15376);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15377);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15378);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_containsAxiom_withReadLock_3() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),15379);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2986nhgbv7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_containsAxiom_withReadLock_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15379,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2986nhgbv7(){try{__CLR4_5_2be3be3lviclhfo.R.inc(15379);
        __CLR4_5_2be3be3lviclhfo.R.inc(15380);OWLAxiom arg0 = mock(OWLAxiom.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(15381);boolean arg1 = true;
        __CLR4_5_2be3be3lviclhfo.R.inc(15382);ontology.containsAxiom(arg0, arg1);
        __CLR4_5_2be3be3lviclhfo.R.inc(15383);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(15384);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15385);inOrder.verify(delegate, times(1)).containsAxiom(arg0, arg1);
        __CLR4_5_2be3be3lviclhfo.R.inc(15386);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15387);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15388);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getAxiomsIgnoreAnnotations_withReadLock_2() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),15389);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n7ddj9bvh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getAxiomsIgnoreAnnotations_withReadLock_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15389,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n7ddj9bvh(){try{__CLR4_5_2be3be3lviclhfo.R.inc(15389);
        __CLR4_5_2be3be3lviclhfo.R.inc(15390);OWLAxiom arg0 = mock(OWLAxiom.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(15391);boolean arg1 = true;
        __CLR4_5_2be3be3lviclhfo.R.inc(15392);ontology.getAxiomsIgnoreAnnotations(arg0, arg1);
        __CLR4_5_2be3be3lviclhfo.R.inc(15393);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(15394);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15395);inOrder.verify(delegate, times(1)).getAxiomsIgnoreAnnotations(arg0, arg1);
        __CLR4_5_2be3be3lviclhfo.R.inc(15396);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15397);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15398);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getReferencingAxioms_withReadLock_2() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),15399);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dvr2ipbvr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getReferencingAxioms_withReadLock_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15399,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dvr2ipbvr(){try{__CLR4_5_2be3be3lviclhfo.R.inc(15399);
        __CLR4_5_2be3be3lviclhfo.R.inc(15400);OWLPrimitive arg0 = mock(OWLPrimitive.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(15401);boolean arg1 = true;
        __CLR4_5_2be3be3lviclhfo.R.inc(15402);ontology.getReferencingAxioms(arg0, arg1);
        __CLR4_5_2be3be3lviclhfo.R.inc(15403);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(15404);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15405);inOrder.verify(delegate, times(1)).getReferencingAxioms(arg0, arg1);
        __CLR4_5_2be3be3lviclhfo.R.inc(15406);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15407);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15408);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_containsAxiomIgnoreAnnotations_withReadLock() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),15409);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e649xcbw1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_containsAxiomIgnoreAnnotations_withReadLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15409,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e649xcbw1(){try{__CLR4_5_2be3be3lviclhfo.R.inc(15409);
        __CLR4_5_2be3be3lviclhfo.R.inc(15410);OWLAxiom arg0 = mock(OWLAxiom.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(15411);boolean arg1 = true;
        __CLR4_5_2be3be3lviclhfo.R.inc(15412);ontology.containsAxiomIgnoreAnnotations(arg0, arg1);
        __CLR4_5_2be3be3lviclhfo.R.inc(15413);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(15414);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15415);inOrder.verify(delegate, times(1)).containsAxiomIgnoreAnnotations(arg0, arg1);
        __CLR4_5_2be3be3lviclhfo.R.inc(15416);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15417);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15418);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getAxioms_withReadLock_19() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),15419);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2b7v14bbwb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getAxioms_withReadLock_19",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15419,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2b7v14bbwb(){try{__CLR4_5_2be3be3lviclhfo.R.inc(15419);
        __CLR4_5_2be3be3lviclhfo.R.inc(15420);OWLDatatype arg0 = mock(OWLDatatype.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(15421);ontology.getAxioms(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(15422);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(15423);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15424);inOrder.verify(delegate, times(1)).getAxioms(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(15425);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15426);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15427);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getAxioms_withReadLock_20() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),15428);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2aqztp1bwk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getAxioms_withReadLock_20",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15428,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2aqztp1bwk(){try{__CLR4_5_2be3be3lviclhfo.R.inc(15428);
        __CLR4_5_2be3be3lviclhfo.R.inc(15429);OWLObjectPropertyExpression arg0 = mock(OWLObjectPropertyExpression.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(15430);ontology.getAxioms(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(15431);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(15432);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15433);inOrder.verify(delegate, times(1)).getAxioms(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(15434);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15435);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15436);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getAxioms_withReadLock_21() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),15437);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27hzuwkbwt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getAxioms_withReadLock_21",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15437,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27hzuwkbwt(){try{__CLR4_5_2be3be3lviclhfo.R.inc(15437);
        __CLR4_5_2be3be3lviclhfo.R.inc(15438);OWLDataProperty arg0 = mock(OWLDataProperty.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(15439);ontology.getAxioms(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(15440);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(15441);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15442);inOrder.verify(delegate, times(1)).getAxioms(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(15443);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15444);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15445);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getAxioms_withReadLock_22() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),15446);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_248zw43bx2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getAxioms_withReadLock_22",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15446,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_248zw43bx2(){try{__CLR4_5_2be3be3lviclhfo.R.inc(15446);
        __CLR4_5_2be3be3lviclhfo.R.inc(15447);OWLIndividual arg0 = mock(OWLIndividual.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(15448);ontology.getAxioms(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(15449);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(15450);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15451);inOrder.verify(delegate, times(1)).getAxioms(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(15452);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15453);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15454);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getAxioms_withReadLock_23() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),15455);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2zzxbmbxb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getAxioms_withReadLock_23",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15455,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2zzxbmbxb(){try{__CLR4_5_2be3be3lviclhfo.R.inc(15455);
        __CLR4_5_2be3be3lviclhfo.R.inc(15456);OWLAnnotationProperty arg0 = mock(OWLAnnotationProperty.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(15457);ontology.getAxioms(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(15458);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(15459);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15460);inOrder.verify(delegate, times(1)).getAxioms(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(15461);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15462);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15463);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getAxioms_withReadLock_24() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),15464);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22901gvbxk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getAxioms_withReadLock_24",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15464,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22901gvbxk(){try{__CLR4_5_2be3be3lviclhfo.R.inc(15464);
        __CLR4_5_2be3be3lviclhfo.R.inc(15465);OWLClass arg0 = mock(OWLClass.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(15466);ontology.getAxioms(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(15467);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(15468);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15469);inOrder.verify(delegate, times(1)).getAxioms(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(15470);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15471);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15472);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getAxiomCount_withReadLock_5() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),15473);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2v7gxh6bxt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getAxiomCount_withReadLock_5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15473,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2v7gxh6bxt(){try{__CLR4_5_2be3be3lviclhfo.R.inc(15473);
        __CLR4_5_2be3be3lviclhfo.R.inc(15474);ontology.getAxiomCount();
        __CLR4_5_2be3be3lviclhfo.R.inc(15475);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(15476);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15477);inOrder.verify(delegate, times(1)).getAxiomCount();
        __CLR4_5_2be3be3lviclhfo.R.inc(15478);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15479);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15480);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getAxiomCount_withReadLock_6() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),15481);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yggw9nby1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getAxiomCount_withReadLock_6",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15481,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yggw9nby1(){try{__CLR4_5_2be3be3lviclhfo.R.inc(15481);
        __CLR4_5_2be3be3lviclhfo.R.inc(15482);AxiomType arg0 = AxiomType.SUBCLASS_OF;
        __CLR4_5_2be3be3lviclhfo.R.inc(15483);ontology.getAxiomCount(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(15484);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(15485);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15486);inOrder.verify(delegate, times(1)).getAxiomCount(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(15487);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15488);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15489);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getLogicalAxiomCount_withReadLock_3() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),15490);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_284389pbya();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getLogicalAxiomCount_withReadLock_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15490,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_284389pbya(){try{__CLR4_5_2be3be3lviclhfo.R.inc(15490);
        __CLR4_5_2be3be3lviclhfo.R.inc(15491);ontology.getLogicalAxiomCount();
        __CLR4_5_2be3be3lviclhfo.R.inc(15492);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(15493);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15494);inOrder.verify(delegate, times(1)).getLogicalAxiomCount();
        __CLR4_5_2be3be3lviclhfo.R.inc(15495);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15496);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15497);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getAxiomsIgnoreAnnotations_withReadLock_3() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),15498);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jydeqsbyi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getAxiomsIgnoreAnnotations_withReadLock_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15498,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jydeqsbyi(){try{__CLR4_5_2be3be3lviclhfo.R.inc(15498);
        __CLR4_5_2be3be3lviclhfo.R.inc(15499);OWLAxiom arg0 = mock(OWLAxiom.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(15500);ontology.getAxiomsIgnoreAnnotations(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(15501);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(15502);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15503);inOrder.verify(delegate, times(1)).getAxiomsIgnoreAnnotations(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(15504);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15505);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15506);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getReferencingAxioms_withReadLock_3() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),15507);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2amr3q8byr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getReferencingAxioms_withReadLock_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15507,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2amr3q8byr(){try{__CLR4_5_2be3be3lviclhfo.R.inc(15507);
        __CLR4_5_2be3be3lviclhfo.R.inc(15508);OWLPrimitive arg0 = mock(OWLPrimitive.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(15509);ontology.getReferencingAxioms(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(15510);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(15511);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15512);inOrder.verify(delegate, times(1)).getReferencingAxioms(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(15513);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15514);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15515);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_containsAxiomIgnoreAnnotations_withReadLock_2() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),15516);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s19tjnbz0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_containsAxiomIgnoreAnnotations_withReadLock_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15516,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s19tjnbz0(){try{__CLR4_5_2be3be3lviclhfo.R.inc(15516);
        __CLR4_5_2be3be3lviclhfo.R.inc(15517);OWLAxiom arg0 = mock(OWLAxiom.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(15518);ontology.containsAxiomIgnoreAnnotations(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(15519);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(15520);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15521);inOrder.verify(delegate, times(1)).containsAxiomIgnoreAnnotations(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(15522);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15523);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15524);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getAnnotationPropertiesInSignature_withReadLock_2() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),15525);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2f4ibndbz9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getAnnotationPropertiesInSignature_withReadLock_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15525,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2f4ibndbz9(){try{__CLR4_5_2be3be3lviclhfo.R.inc(15525);
        __CLR4_5_2be3be3lviclhfo.R.inc(15526);Imports arg0 = Imports.INCLUDED;
        __CLR4_5_2be3be3lviclhfo.R.inc(15527);ontology.getAnnotationPropertiesInSignature(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(15528);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(15529);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15530);inOrder.verify(delegate, times(1)).getAnnotationPropertiesInSignature(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(15531);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15532);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15533);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getIndividualsInSignature_withReadLock_2() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),15534);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2z9xf31bzi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getIndividualsInSignature_withReadLock_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15534,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2z9xf31bzi(){try{__CLR4_5_2be3be3lviclhfo.R.inc(15534);
        __CLR4_5_2be3be3lviclhfo.R.inc(15535);Imports arg0 = Imports.INCLUDED;
        __CLR4_5_2be3be3lviclhfo.R.inc(15536);ontology.getIndividualsInSignature(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(15537);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(15538);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15539);inOrder.verify(delegate, times(1)).getIndividualsInSignature(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(15540);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15541);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15542);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getDatatypesInSignature_withReadLock_2() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),15543);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2x26oibzr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getDatatypesInSignature_withReadLock_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15543,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2x26oibzr(){try{__CLR4_5_2be3be3lviclhfo.R.inc(15543);
        __CLR4_5_2be3be3lviclhfo.R.inc(15544);Imports arg0 = Imports.INCLUDED;
        __CLR4_5_2be3be3lviclhfo.R.inc(15545);ontology.getDatatypesInSignature(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(15546);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(15547);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15548);inOrder.verify(delegate, times(1)).getDatatypesInSignature(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(15549);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15550);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15551);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getClassesInSignature_withReadLock_2() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),15552);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2iii75jc00();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getClassesInSignature_withReadLock_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15552,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2iii75jc00(){try{__CLR4_5_2be3be3lviclhfo.R.inc(15552);
        __CLR4_5_2be3be3lviclhfo.R.inc(15553);Imports arg0 = Imports.INCLUDED;
        __CLR4_5_2be3be3lviclhfo.R.inc(15554);ontology.getClassesInSignature(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(15555);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(15556);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15557);inOrder.verify(delegate, times(1)).getClassesInSignature(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(15558);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15559);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15560);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_containsEntityInSignature_withReadLock_2() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),15561);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2irsy9nc09();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_containsEntityInSignature_withReadLock_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15561,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2irsy9nc09(){try{__CLR4_5_2be3be3lviclhfo.R.inc(15561);
        __CLR4_5_2be3be3lviclhfo.R.inc(15562);IRI arg0 = mock(IRI.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(15563);Imports arg1 = Imports.INCLUDED;
        __CLR4_5_2be3be3lviclhfo.R.inc(15564);ontology.containsEntityInSignature(arg0, arg1);
        __CLR4_5_2be3be3lviclhfo.R.inc(15565);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(15566);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15567);inOrder.verify(delegate, times(1)).containsEntityInSignature(arg0, arg1);
        __CLR4_5_2be3be3lviclhfo.R.inc(15568);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15569);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15570);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_containsEntityInSignature_withReadLock_3() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),15571);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2m0sx24c0j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_containsEntityInSignature_withReadLock_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15571,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2m0sx24c0j(){try{__CLR4_5_2be3be3lviclhfo.R.inc(15571);
        __CLR4_5_2be3be3lviclhfo.R.inc(15572);IRI arg0 = mock(IRI.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(15573);ontology.containsEntityInSignature(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(15574);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(15575);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15576);inOrder.verify(delegate, times(1)).containsEntityInSignature(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(15577);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15578);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15579);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_containsEntityInSignature_withReadLock_4() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),15580);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2p9svulc0s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_containsEntityInSignature_withReadLock_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15580,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2p9svulc0s(){try{__CLR4_5_2be3be3lviclhfo.R.inc(15580);
        __CLR4_5_2be3be3lviclhfo.R.inc(15581);OWLEntity arg0 = mock(OWLEntity.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(15582);Imports arg1 = Imports.INCLUDED;
        __CLR4_5_2be3be3lviclhfo.R.inc(15583);ontology.containsEntityInSignature(arg0, arg1);
        __CLR4_5_2be3be3lviclhfo.R.inc(15584);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(15585);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15586);inOrder.verify(delegate, times(1)).containsEntityInSignature(arg0, arg1);
        __CLR4_5_2be3be3lviclhfo.R.inc(15587);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15588);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15589);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getObjectPropertiesInSignature_withReadLock_2() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),15590);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bo97cnc12();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getObjectPropertiesInSignature_withReadLock_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15590,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bo97cnc12(){try{__CLR4_5_2be3be3lviclhfo.R.inc(15590);
        __CLR4_5_2be3be3lviclhfo.R.inc(15591);Imports arg0 = Imports.INCLUDED;
        __CLR4_5_2be3be3lviclhfo.R.inc(15592);ontology.getObjectPropertiesInSignature(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(15593);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(15594);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15595);inOrder.verify(delegate, times(1)).getObjectPropertiesInSignature(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(15596);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15597);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15598);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getDataPropertiesInSignature_withReadLock_2() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),15599);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2eibic4c1b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getDataPropertiesInSignature_withReadLock_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15599,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2eibic4c1b(){try{__CLR4_5_2be3be3lviclhfo.R.inc(15599);
        __CLR4_5_2be3be3lviclhfo.R.inc(15600);Imports arg0 = Imports.INCLUDED;
        __CLR4_5_2be3be3lviclhfo.R.inc(15601);ontology.getDataPropertiesInSignature(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(15602);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(15603);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15604);inOrder.verify(delegate, times(1)).getDataPropertiesInSignature(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(15605);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15606);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15607);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getReferencedAnonymousIndividuals_withReadLock() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),15608);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gdi3vhc1k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getReferencedAnonymousIndividuals_withReadLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15608,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gdi3vhc1k(){try{__CLR4_5_2be3be3lviclhfo.R.inc(15608);
        __CLR4_5_2be3be3lviclhfo.R.inc(15609);Imports arg0 = Imports.INCLUDED;
        __CLR4_5_2be3be3lviclhfo.R.inc(15610);ontology.getReferencedAnonymousIndividuals(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(15611);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(15612);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15613);inOrder.verify(delegate, times(1)).getReferencedAnonymousIndividuals(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(15614);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15615);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15616);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_containsClassInSignature_withReadLock() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),15617);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2aetwyvc1t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_containsClassInSignature_withReadLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15617,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2aetwyvc1t(){try{__CLR4_5_2be3be3lviclhfo.R.inc(15617);
        __CLR4_5_2be3be3lviclhfo.R.inc(15618);IRI arg0 = mock(IRI.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(15619);ontology.containsClassInSignature(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(15620);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(15621);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15622);inOrder.verify(delegate, times(1)).containsClassInSignature(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(15623);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15624);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15625);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_containsClassInSignature_withReadLock_2() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),15626);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_220ietic22();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_containsClassInSignature_withReadLock_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15626,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_220ietic22(){try{__CLR4_5_2be3be3lviclhfo.R.inc(15626);
        __CLR4_5_2be3be3lviclhfo.R.inc(15627);IRI arg0 = mock(IRI.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(15628);Imports arg1 = Imports.INCLUDED;
        __CLR4_5_2be3be3lviclhfo.R.inc(15629);ontology.containsClassInSignature(arg0, arg1);
        __CLR4_5_2be3be3lviclhfo.R.inc(15630);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(15631);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15632);inOrder.verify(delegate, times(1)).containsClassInSignature(arg0, arg1);
        __CLR4_5_2be3be3lviclhfo.R.inc(15633);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15634);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15635);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_containsObjectPropertyInSignature_withReadLock() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),15636);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xe1zc2c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_containsObjectPropertyInSignature_withReadLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15636,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xe1zc2c(){try{__CLR4_5_2be3be3lviclhfo.R.inc(15636);
        __CLR4_5_2be3be3lviclhfo.R.inc(15637);IRI arg0 = mock(IRI.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(15638);ontology.containsObjectPropertyInSignature(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(15639);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(15640);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15641);inOrder.verify(delegate, times(1)).containsObjectPropertyInSignature(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(15642);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15643);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15644);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_containsObjectPropertyInSignature_withReadLock_2() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),15645);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hbjxjoc2l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_containsObjectPropertyInSignature_withReadLock_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15645,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hbjxjoc2l(){try{__CLR4_5_2be3be3lviclhfo.R.inc(15645);
        __CLR4_5_2be3be3lviclhfo.R.inc(15646);IRI arg0 = mock(IRI.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(15647);Imports arg1 = Imports.INCLUDED;
        __CLR4_5_2be3be3lviclhfo.R.inc(15648);ontology.containsObjectPropertyInSignature(arg0, arg1);
        __CLR4_5_2be3be3lviclhfo.R.inc(15649);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(15650);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15651);inOrder.verify(delegate, times(1)).containsObjectPropertyInSignature(arg0, arg1);
        __CLR4_5_2be3be3lviclhfo.R.inc(15652);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15653);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15654);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_containsDataPropertyInSignature_withReadLock() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),15655);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2io3rmkc2v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_containsDataPropertyInSignature_withReadLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15655,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2io3rmkc2v(){try{__CLR4_5_2be3be3lviclhfo.R.inc(15655);
        __CLR4_5_2be3be3lviclhfo.R.inc(15656);IRI arg0 = mock(IRI.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(15657);Imports arg1 = Imports.INCLUDED;
        __CLR4_5_2be3be3lviclhfo.R.inc(15658);ontology.containsDataPropertyInSignature(arg0, arg1);
        __CLR4_5_2be3be3lviclhfo.R.inc(15659);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(15660);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15661);inOrder.verify(delegate, times(1)).containsDataPropertyInSignature(arg0, arg1);
        __CLR4_5_2be3be3lviclhfo.R.inc(15662);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15663);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15664);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_containsDataPropertyInSignature_withReadLock_2() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),15665);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2y8ee89c35();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_containsDataPropertyInSignature_withReadLock_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15665,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2y8ee89c35(){try{__CLR4_5_2be3be3lviclhfo.R.inc(15665);
        __CLR4_5_2be3be3lviclhfo.R.inc(15666);IRI arg0 = mock(IRI.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(15667);ontology.containsDataPropertyInSignature(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(15668);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(15669);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15670);inOrder.verify(delegate, times(1)).containsDataPropertyInSignature(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(15671);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15672);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15673);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_containsAnnotationPropertyInSignature_withReadLock() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),15674);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_230p6gnc3e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_containsAnnotationPropertyInSignature_withReadLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15674,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_230p6gnc3e(){try{__CLR4_5_2be3be3lviclhfo.R.inc(15674);
        __CLR4_5_2be3be3lviclhfo.R.inc(15675);IRI arg0 = mock(IRI.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(15676);ontology.containsAnnotationPropertyInSignature(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(15677);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(15678);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15679);inOrder.verify(delegate, times(1)).containsAnnotationPropertyInSignature(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(15680);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15681);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15682);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_containsAnnotationPropertyInSignature_withReadLock_2() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),15683);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2i18zx8c3n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_containsAnnotationPropertyInSignature_withReadLock_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15683,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2i18zx8c3n(){try{__CLR4_5_2be3be3lviclhfo.R.inc(15683);
        __CLR4_5_2be3be3lviclhfo.R.inc(15684);IRI arg0 = mock(IRI.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(15685);Imports arg1 = Imports.INCLUDED;
        __CLR4_5_2be3be3lviclhfo.R.inc(15686);ontology.containsAnnotationPropertyInSignature(arg0, arg1);
        __CLR4_5_2be3be3lviclhfo.R.inc(15687);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(15688);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15689);inOrder.verify(delegate, times(1)).containsAnnotationPropertyInSignature(arg0, arg1);
        __CLR4_5_2be3be3lviclhfo.R.inc(15690);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15691);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15692);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_containsDatatypeInSignature_withReadLock() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),15693);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2suo9l5c3x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_containsDatatypeInSignature_withReadLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15693,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2suo9l5c3x(){try{__CLR4_5_2be3be3lviclhfo.R.inc(15693);
        __CLR4_5_2be3be3lviclhfo.R.inc(15694);IRI arg0 = mock(IRI.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(15695);Imports arg1 = Imports.INCLUDED;
        __CLR4_5_2be3be3lviclhfo.R.inc(15696);ontology.containsDatatypeInSignature(arg0, arg1);
        __CLR4_5_2be3be3lviclhfo.R.inc(15697);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(15698);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15699);inOrder.verify(delegate, times(1)).containsDatatypeInSignature(arg0, arg1);
        __CLR4_5_2be3be3lviclhfo.R.inc(15700);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15701);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15702);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_containsDatatypeInSignature_withReadLock_2() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),15703);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2w7ms0sc47();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_containsDatatypeInSignature_withReadLock_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15703,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2w7ms0sc47(){try{__CLR4_5_2be3be3lviclhfo.R.inc(15703);
        __CLR4_5_2be3be3lviclhfo.R.inc(15704);IRI arg0 = mock(IRI.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(15705);ontology.containsDatatypeInSignature(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(15706);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(15707);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15708);inOrder.verify(delegate, times(1)).containsDatatypeInSignature(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(15709);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15710);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15711);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_containsIndividualInSignature_withReadLock() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),15712);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mjmp5qc4g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_containsIndividualInSignature_withReadLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15712,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mjmp5qc4g(){try{__CLR4_5_2be3be3lviclhfo.R.inc(15712);
        __CLR4_5_2be3be3lviclhfo.R.inc(15713);IRI arg0 = mock(IRI.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(15714);ontology.containsIndividualInSignature(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(15715);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(15716);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15717);inOrder.verify(delegate, times(1)).containsIndividualInSignature(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(15718);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15719);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15720);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_containsIndividualInSignature_withReadLock_2() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),15721);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_291d4dtc4p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_containsIndividualInSignature_withReadLock_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15721,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_291d4dtc4p(){try{__CLR4_5_2be3be3lviclhfo.R.inc(15721);
        __CLR4_5_2be3be3lviclhfo.R.inc(15722);IRI arg0 = mock(IRI.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(15723);Imports arg1 = Imports.INCLUDED;
        __CLR4_5_2be3be3lviclhfo.R.inc(15724);ontology.containsIndividualInSignature(arg0, arg1);
        __CLR4_5_2be3be3lviclhfo.R.inc(15725);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(15726);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15727);inOrder.verify(delegate, times(1)).containsIndividualInSignature(arg0, arg1);
        __CLR4_5_2be3be3lviclhfo.R.inc(15728);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15729);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15730);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getEntitiesInSignature_withReadLock() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),15731);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2t8hq11c4z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getEntitiesInSignature_withReadLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15731,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2t8hq11c4z(){try{__CLR4_5_2be3be3lviclhfo.R.inc(15731);
        __CLR4_5_2be3be3lviclhfo.R.inc(15732);IRI arg0 = mock(IRI.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(15733);Imports arg1 = Imports.INCLUDED;
        __CLR4_5_2be3be3lviclhfo.R.inc(15734);ontology.getEntitiesInSignature(arg0, arg1);
        __CLR4_5_2be3be3lviclhfo.R.inc(15735);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(15736);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15737);inOrder.verify(delegate, times(1)).getEntitiesInSignature(arg0, arg1);
        __CLR4_5_2be3be3lviclhfo.R.inc(15738);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15739);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15740);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getPunnedIRIs_withReadLock() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),15741);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2c2uvv8c59();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getPunnedIRIs_withReadLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15741,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2c2uvv8c59(){try{__CLR4_5_2be3be3lviclhfo.R.inc(15741);
        __CLR4_5_2be3be3lviclhfo.R.inc(15742);Imports arg0 = Imports.INCLUDED;
        __CLR4_5_2be3be3lviclhfo.R.inc(15743);ontology.getPunnedIRIs(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(15744);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(15745);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15746);inOrder.verify(delegate, times(1)).getPunnedIRIs(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(15747);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15748);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15749);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_containsReference_withReadLock() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),15750);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2youn4dc5i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_containsReference_withReadLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15750,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2youn4dc5i(){try{__CLR4_5_2be3be3lviclhfo.R.inc(15750);
        __CLR4_5_2be3be3lviclhfo.R.inc(15751);OWLEntity arg0 = mock(OWLEntity.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(15752);Imports arg1 = Imports.INCLUDED;
        __CLR4_5_2be3be3lviclhfo.R.inc(15753);ontology.containsReference(arg0, arg1);
        __CLR4_5_2be3be3lviclhfo.R.inc(15754);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(15755);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15756);inOrder.verify(delegate, times(1)).containsReference(arg0, arg1);
        __CLR4_5_2be3be3lviclhfo.R.inc(15757);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15758);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15759);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_containsReference_withReadLock_2() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),15760);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vbxq3kc5s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_containsReference_withReadLock_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15760,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vbxq3kc5s(){try{__CLR4_5_2be3be3lviclhfo.R.inc(15760);
        __CLR4_5_2be3be3lviclhfo.R.inc(15761);OWLEntity arg0 = mock(OWLEntity.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(15762);ontology.containsReference(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(15763);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(15764);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15765);inOrder.verify(delegate, times(1)).containsReference(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(15766);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15767);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15768);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getEntitiesInSignature_withReadLock_2() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),15769);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2p3pnooc61();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getEntitiesInSignature_withReadLock_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15769,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2p3pnooc61(){try{__CLR4_5_2be3be3lviclhfo.R.inc(15769);
        __CLR4_5_2be3be3lviclhfo.R.inc(15770);IRI arg0 = mock(IRI.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(15771);ontology.getEntitiesInSignature(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(15772);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(15773);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15774);inOrder.verify(delegate, times(1)).getEntitiesInSignature(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(15775);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15776);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15777);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getAnnotationPropertiesInSignature_withReadLock_3() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),15778);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2idiafuc6a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getAnnotationPropertiesInSignature_withReadLock_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15778,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2idiafuc6a(){try{__CLR4_5_2be3be3lviclhfo.R.inc(15778);
        __CLR4_5_2be3be3lviclhfo.R.inc(15779);boolean arg0 = true;
        __CLR4_5_2be3be3lviclhfo.R.inc(15780);ontology.getAnnotationPropertiesInSignature(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(15781);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(15782);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15783);inOrder.verify(delegate, times(1)).getAnnotationPropertiesInSignature(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(15784);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15785);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15786);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getIndividualsInSignature_withReadLock_3() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),15787);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wi6o3mc6j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getIndividualsInSignature_withReadLock_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15787,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wi6o3mc6j(){try{__CLR4_5_2be3be3lviclhfo.R.inc(15787);
        __CLR4_5_2be3be3lviclhfo.R.inc(15788);boolean arg0 = true;
        __CLR4_5_2be3be3lviclhfo.R.inc(15789);ontology.getIndividualsInSignature(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(15790);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(15791);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15792);inOrder.verify(delegate, times(1)).getIndividualsInSignature(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(15793);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15794);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15795);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getDatatypesInSignature_withReadLock_3() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),15796);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24625gzc6s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getDatatypesInSignature_withReadLock_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15796,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24625gzc6s(){try{__CLR4_5_2be3be3lviclhfo.R.inc(15796);
        __CLR4_5_2be3be3lviclhfo.R.inc(15797);boolean arg0 = true;
        __CLR4_5_2be3be3lviclhfo.R.inc(15798);ontology.getDatatypesInSignature(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(15799);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(15800);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15801);inOrder.verify(delegate, times(1)).getDatatypesInSignature(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(15802);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15803);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15804);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getClassesInSignature_withReadLock_3() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),15805);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2f9i8d2c71();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getClassesInSignature_withReadLock_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15805,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2f9i8d2c71(){try{__CLR4_5_2be3be3lviclhfo.R.inc(15805);
        __CLR4_5_2be3be3lviclhfo.R.inc(15806);boolean arg0 = true;
        __CLR4_5_2be3be3lviclhfo.R.inc(15807);ontology.getClassesInSignature(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(15808);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(15809);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15810);inOrder.verify(delegate, times(1)).getClassesInSignature(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(15811);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15812);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15813);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_containsEntityInSignature_withReadLock_5() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),15814);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2sisun2c7a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_containsEntityInSignature_withReadLock_5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15814,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2sisun2c7a(){try{__CLR4_5_2be3be3lviclhfo.R.inc(15814);
        __CLR4_5_2be3be3lviclhfo.R.inc(15815);IRI arg0 = mock(IRI.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(15816);boolean arg1 = true;
        __CLR4_5_2be3be3lviclhfo.R.inc(15817);ontology.containsEntityInSignature(arg0, arg1);
        __CLR4_5_2be3be3lviclhfo.R.inc(15818);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(15819);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15820);inOrder.verify(delegate, times(1)).containsEntityInSignature(arg0, arg1);
        __CLR4_5_2be3be3lviclhfo.R.inc(15821);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15822);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15823);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_containsEntityInSignature_withReadLock_6() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),15824);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vrstfjc7k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_containsEntityInSignature_withReadLock_6",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15824,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vrstfjc7k(){try{__CLR4_5_2be3be3lviclhfo.R.inc(15824);
        __CLR4_5_2be3be3lviclhfo.R.inc(15825);OWLEntity arg0 = mock(OWLEntity.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(15826);boolean arg1 = true;
        __CLR4_5_2be3be3lviclhfo.R.inc(15827);ontology.containsEntityInSignature(arg0, arg1);
        __CLR4_5_2be3be3lviclhfo.R.inc(15828);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(15829);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15830);inOrder.verify(delegate, times(1)).containsEntityInSignature(arg0, arg1);
        __CLR4_5_2be3be3lviclhfo.R.inc(15831);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15832);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15833);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getObjectPropertiesInSignature_withReadLock_3() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),15834);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28f98k6c7u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getObjectPropertiesInSignature_withReadLock_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15834,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28f98k6c7u(){try{__CLR4_5_2be3be3lviclhfo.R.inc(15834);
        __CLR4_5_2be3be3lviclhfo.R.inc(15835);boolean arg0 = true;
        __CLR4_5_2be3be3lviclhfo.R.inc(15836);ontology.getObjectPropertiesInSignature(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(15837);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(15838);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15839);inOrder.verify(delegate, times(1)).getObjectPropertiesInSignature(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(15840);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15841);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15842);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getDataPropertiesInSignature_withReadLock_3() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),15843);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hrbh4lc83();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getDataPropertiesInSignature_withReadLock_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15843,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hrbh4lc83(){try{__CLR4_5_2be3be3lviclhfo.R.inc(15843);
        __CLR4_5_2be3be3lviclhfo.R.inc(15844);boolean arg0 = true;
        __CLR4_5_2be3be3lviclhfo.R.inc(15845);ontology.getDataPropertiesInSignature(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(15846);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(15847);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15848);inOrder.verify(delegate, times(1)).getDataPropertiesInSignature(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(15849);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15850);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15851);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getReferencedAnonymousIndividuals_withReadLock_2() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),15852);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2oyuia8c8c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getReferencedAnonymousIndividuals_withReadLock_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15852,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2oyuia8c8c(){try{__CLR4_5_2be3be3lviclhfo.R.inc(15852);
        __CLR4_5_2be3be3lviclhfo.R.inc(15853);boolean arg0 = true;
        __CLR4_5_2be3be3lviclhfo.R.inc(15854);ontology.getReferencedAnonymousIndividuals(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(15855);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(15856);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15857);inOrder.verify(delegate, times(1)).getReferencedAnonymousIndividuals(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(15858);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15859);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15860);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_containsClassInSignature_withReadLock_3() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),15861);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_218hjyzc8l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_containsClassInSignature_withReadLock_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15861,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_218hjyzc8l(){try{__CLR4_5_2be3be3lviclhfo.R.inc(15861);
        __CLR4_5_2be3be3lviclhfo.R.inc(15862);IRI arg0 = mock(IRI.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(15863);boolean arg1 = true;
        __CLR4_5_2be3be3lviclhfo.R.inc(15864);ontology.containsClassInSignature(arg0, arg1);
        __CLR4_5_2be3be3lviclhfo.R.inc(15865);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(15866);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15867);inOrder.verify(delegate, times(1)).containsClassInSignature(arg0, arg1);
        __CLR4_5_2be3be3lviclhfo.R.inc(15868);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15869);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15870);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_containsObjectPropertyInSignature_withReadLock_3() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),15871);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e2jyr7c8v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_containsObjectPropertyInSignature_withReadLock_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15871,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e2jyr7c8v(){try{__CLR4_5_2be3be3lviclhfo.R.inc(15871);
        __CLR4_5_2be3be3lviclhfo.R.inc(15872);IRI arg0 = mock(IRI.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(15873);boolean arg1 = true;
        __CLR4_5_2be3be3lviclhfo.R.inc(15874);ontology.containsObjectPropertyInSignature(arg0, arg1);
        __CLR4_5_2be3be3lviclhfo.R.inc(15875);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(15876);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15877);inOrder.verify(delegate, times(1)).containsObjectPropertyInSignature(arg0, arg1);
        __CLR4_5_2be3be3lviclhfo.R.inc(15878);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15879);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15880);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_containsDataPropertyInSignature_withReadLock_3() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),15881);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uzeffsc95();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_containsDataPropertyInSignature_withReadLock_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15881,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uzeffsc95(){try{__CLR4_5_2be3be3lviclhfo.R.inc(15881);
        __CLR4_5_2be3be3lviclhfo.R.inc(15882);IRI arg0 = mock(IRI.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(15883);boolean arg1 = true;
        __CLR4_5_2be3be3lviclhfo.R.inc(15884);ontology.containsDataPropertyInSignature(arg0, arg1);
        __CLR4_5_2be3be3lviclhfo.R.inc(15885);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(15886);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15887);inOrder.verify(delegate, times(1)).containsDataPropertyInSignature(arg0, arg1);
        __CLR4_5_2be3be3lviclhfo.R.inc(15888);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15889);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15890);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_containsAnnotationPropertyInSignature_withReadLock_3() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),15891);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2la8yppc9f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_containsAnnotationPropertyInSignature_withReadLock_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15891,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2la8yppc9f(){try{__CLR4_5_2be3be3lviclhfo.R.inc(15891);
        __CLR4_5_2be3be3lviclhfo.R.inc(15892);IRI arg0 = mock(IRI.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(15893);boolean arg1 = true;
        __CLR4_5_2be3be3lviclhfo.R.inc(15894);ontology.containsAnnotationPropertyInSignature(arg0, arg1);
        __CLR4_5_2be3be3lviclhfo.R.inc(15895);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(15896);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15897);inOrder.verify(delegate, times(1)).containsAnnotationPropertyInSignature(arg0, arg1);
        __CLR4_5_2be3be3lviclhfo.R.inc(15898);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15899);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15900);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_containsDatatypeInSignature_withReadLock_3() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),15901);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2zgmqt9c9p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_containsDatatypeInSignature_withReadLock_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15901,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2zgmqt9c9p(){try{__CLR4_5_2be3be3lviclhfo.R.inc(15901);
        __CLR4_5_2be3be3lviclhfo.R.inc(15902);IRI arg0 = mock(IRI.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(15903);boolean arg1 = true;
        __CLR4_5_2be3be3lviclhfo.R.inc(15904);ontology.containsDatatypeInSignature(arg0, arg1);
        __CLR4_5_2be3be3lviclhfo.R.inc(15905);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(15906);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15907);inOrder.verify(delegate, times(1)).containsDatatypeInSignature(arg0, arg1);
        __CLR4_5_2be3be3lviclhfo.R.inc(15908);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15909);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15910);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_containsIndividualInSignature_withReadLock_3() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),15911);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cad36ac9z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_containsIndividualInSignature_withReadLock_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15911,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cad36ac9z(){try{__CLR4_5_2be3be3lviclhfo.R.inc(15911);
        __CLR4_5_2be3be3lviclhfo.R.inc(15912);IRI arg0 = mock(IRI.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(15913);boolean arg1 = true;
        __CLR4_5_2be3be3lviclhfo.R.inc(15914);ontology.containsIndividualInSignature(arg0, arg1);
        __CLR4_5_2be3be3lviclhfo.R.inc(15915);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(15916);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15917);inOrder.verify(delegate, times(1)).containsIndividualInSignature(arg0, arg1);
        __CLR4_5_2be3be3lviclhfo.R.inc(15918);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15919);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15920);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getEntitiesInSignature_withReadLock_3() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),15921);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lupow7ca9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getEntitiesInSignature_withReadLock_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15921,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lupow7ca9(){try{__CLR4_5_2be3be3lviclhfo.R.inc(15921);
        __CLR4_5_2be3be3lviclhfo.R.inc(15922);IRI arg0 = mock(IRI.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(15923);boolean arg1 = true;
        __CLR4_5_2be3be3lviclhfo.R.inc(15924);ontology.getEntitiesInSignature(arg0, arg1);
        __CLR4_5_2be3be3lviclhfo.R.inc(15925);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(15926);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15927);inOrder.verify(delegate, times(1)).getEntitiesInSignature(arg0, arg1);
        __CLR4_5_2be3be3lviclhfo.R.inc(15928);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15929);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15930);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_containsReference_withReadLock_3() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),15931);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ykxow1caj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_containsReference_withReadLock_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15931,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ykxow1caj(){try{__CLR4_5_2be3be3lviclhfo.R.inc(15931);
        __CLR4_5_2be3be3lviclhfo.R.inc(15932);OWLEntity arg0 = mock(OWLEntity.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(15933);boolean arg1 = true;
        __CLR4_5_2be3be3lviclhfo.R.inc(15934);ontology.containsReference(arg0, arg1);
        __CLR4_5_2be3be3lviclhfo.R.inc(15935);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(15936);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15937);inOrder.verify(delegate, times(1)).containsReference(arg0, arg1);
        __CLR4_5_2be3be3lviclhfo.R.inc(15938);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15939);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15940);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_contains_withReadLock() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),15941);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jyjr0ecat();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_contains_withReadLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15941,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jyjr0ecat(){try{__CLR4_5_2be3be3lviclhfo.R.inc(15941);
        __CLR4_5_2be3be3lviclhfo.R.inc(15942);OWLAxiomSearchFilter arg0 = mock(OWLAxiomSearchFilter.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(15943);Object arg1 = mock(Object.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(15944);Imports arg2 = Imports.INCLUDED;
        __CLR4_5_2be3be3lviclhfo.R.inc(15945);ontology.contains(arg0, arg1, arg2);
        __CLR4_5_2be3be3lviclhfo.R.inc(15946);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(15947);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15948);inOrder.verify(delegate, times(1)).contains(arg0, arg1, arg2);
        __CLR4_5_2be3be3lviclhfo.R.inc(15949);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15950);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15951);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getAxioms_withReadLock_25() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),15952);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25i009ccb4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getAxioms_withReadLock_25",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15952,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25i009ccb4(){try{__CLR4_5_2be3be3lviclhfo.R.inc(15952);
        __CLR4_5_2be3be3lviclhfo.R.inc(15953);Class arg0 = OWLClass.class;
        __CLR4_5_2be3be3lviclhfo.R.inc(15954);Class arg1 = OWLClass.class;
        __CLR4_5_2be3be3lviclhfo.R.inc(15955);OWLObject arg2 = mock(OWLObject.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(15956);Imports arg3 = Imports.INCLUDED;
        __CLR4_5_2be3be3lviclhfo.R.inc(15957);Navigation arg4 = Navigation.IN_SUB_POSITION;
        __CLR4_5_2be3be3lviclhfo.R.inc(15958);ontology.getAxioms(arg0, arg1, arg2, arg3, arg4);
        __CLR4_5_2be3be3lviclhfo.R.inc(15959);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(15960);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15961);inOrder.verify(delegate, times(1)).getAxioms(arg0, arg1, arg2, arg3, arg4);
        __CLR4_5_2be3be3lviclhfo.R.inc(15962);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15963);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15964);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getAxioms_withReadLock_26() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),15965);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28qzz1tcbh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getAxioms_withReadLock_26",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15965,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28qzz1tcbh(){try{__CLR4_5_2be3be3lviclhfo.R.inc(15965);
        __CLR4_5_2be3be3lviclhfo.R.inc(15966);Class arg0 = OWLClass.class;
        __CLR4_5_2be3be3lviclhfo.R.inc(15967);OWLObject arg1 = mock(OWLObject.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(15968);Imports arg2 = Imports.INCLUDED;
        __CLR4_5_2be3be3lviclhfo.R.inc(15969);Navigation arg3 = Navigation.IN_SUB_POSITION;
        __CLR4_5_2be3be3lviclhfo.R.inc(15970);ontology.getAxioms(arg0, arg1, arg2, arg3);
        __CLR4_5_2be3be3lviclhfo.R.inc(15971);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(15972);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15973);inOrder.verify(delegate, times(1)).getAxioms(arg0, arg1, arg2, arg3);
        __CLR4_5_2be3be3lviclhfo.R.inc(15974);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15975);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15976);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_filterAxioms_withReadLock() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),15977);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kh296icbt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_filterAxioms_withReadLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15977,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kh296icbt(){try{__CLR4_5_2be3be3lviclhfo.R.inc(15977);
        __CLR4_5_2be3be3lviclhfo.R.inc(15978);OWLAxiomSearchFilter arg0 = mock(OWLAxiomSearchFilter.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(15979);Object arg1 = mock(Object.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(15980);Imports arg2 = Imports.INCLUDED;
        __CLR4_5_2be3be3lviclhfo.R.inc(15981);ontology.filterAxioms(arg0, arg1, arg2);
        __CLR4_5_2be3be3lviclhfo.R.inc(15982);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(15983);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15984);inOrder.verify(delegate, times(1)).filterAxioms(arg0, arg1, arg2);
        __CLR4_5_2be3be3lviclhfo.R.inc(15985);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15986);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15987);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getSubAnnotationPropertyOfAxioms_withReadLock() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),15988);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tpdxvdcc4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getSubAnnotationPropertyOfAxioms_withReadLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15988,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tpdxvdcc4(){try{__CLR4_5_2be3be3lviclhfo.R.inc(15988);
        __CLR4_5_2be3be3lviclhfo.R.inc(15989);OWLAnnotationProperty arg0 = mock(OWLAnnotationProperty.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(15990);ontology.getSubAnnotationPropertyOfAxioms(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(15991);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(15992);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15993);inOrder.verify(delegate, times(1)).getSubAnnotationPropertyOfAxioms(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(15994);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15995);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(15996);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getAnnotationPropertyDomainAxioms_withReadLock() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),15997);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_213xrzcccd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getAnnotationPropertyDomainAxioms_withReadLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15997,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_213xrzcccd(){try{__CLR4_5_2be3be3lviclhfo.R.inc(15997);
        __CLR4_5_2be3be3lviclhfo.R.inc(15998);OWLAnnotationProperty arg0 = mock(OWLAnnotationProperty.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(15999);ontology.getAnnotationPropertyDomainAxioms(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(16000);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(16001);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16002);inOrder.verify(delegate, times(1)).getAnnotationPropertyDomainAxioms(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(16003);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16004);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16005);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getAnnotationPropertyRangeAxioms_withReadLock() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),16006);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25rw18lccm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getAnnotationPropertyRangeAxioms_withReadLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16006,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25rw18lccm(){try{__CLR4_5_2be3be3lviclhfo.R.inc(16006);
        __CLR4_5_2be3be3lviclhfo.R.inc(16007);OWLAnnotationProperty arg0 = mock(OWLAnnotationProperty.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(16008);ontology.getAnnotationPropertyRangeAxioms(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(16009);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(16010);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16011);inOrder.verify(delegate, times(1)).getAnnotationPropertyRangeAxioms(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(16012);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16013);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16014);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getDeclarationAxioms_withReadLock() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),16015);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21811dmccv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getDeclarationAxioms_withReadLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16015,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21811dmccv(){try{__CLR4_5_2be3be3lviclhfo.R.inc(16015);
        __CLR4_5_2be3be3lviclhfo.R.inc(16016);OWLEntity arg0 = mock(OWLEntity.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(16017);ontology.getDeclarationAxioms(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(16018);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(16019);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16020);inOrder.verify(delegate, times(1)).getDeclarationAxioms(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(16021);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16022);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16023);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getAnnotationAssertionAxioms_withReadLock() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),16024);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vdit0fcd4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getAnnotationAssertionAxioms_withReadLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16024,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vdit0fcd4(){try{__CLR4_5_2be3be3lviclhfo.R.inc(16024);
        __CLR4_5_2be3be3lviclhfo.R.inc(16025);OWLAnnotationSubject arg0 = mock(OWLAnnotationSubject.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(16026);ontology.getAnnotationAssertionAxioms(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(16027);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(16028);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16029);inOrder.verify(delegate, times(1)).getAnnotationAssertionAxioms(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(16030);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16031);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16032);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getSubClassAxiomsForSubClass_withReadLock() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),16033);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22u3rddcdd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getSubClassAxiomsForSubClass_withReadLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16033,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22u3rddcdd(){try{__CLR4_5_2be3be3lviclhfo.R.inc(16033);
        __CLR4_5_2be3be3lviclhfo.R.inc(16034);OWLClass arg0 = mock(OWLClass.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(16035);ontology.getSubClassAxiomsForSubClass(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(16036);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(16037);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16038);inOrder.verify(delegate, times(1)).getSubClassAxiomsForSubClass(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(16039);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16040);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16041);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getSubClassAxiomsForSuperClass_withReadLock() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),16042);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dwjhbgcdm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getSubClassAxiomsForSuperClass_withReadLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16042,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dwjhbgcdm(){try{__CLR4_5_2be3be3lviclhfo.R.inc(16042);
        __CLR4_5_2be3be3lviclhfo.R.inc(16043);OWLClass arg0 = mock(OWLClass.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(16044);ontology.getSubClassAxiomsForSuperClass(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(16045);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(16046);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16047);inOrder.verify(delegate, times(1)).getSubClassAxiomsForSuperClass(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(16048);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16049);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16050);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getEquivalentClassesAxioms_withReadLock() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),16051);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2g6hoewcdv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getEquivalentClassesAxioms_withReadLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16051,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2g6hoewcdv(){try{__CLR4_5_2be3be3lviclhfo.R.inc(16051);
        __CLR4_5_2be3be3lviclhfo.R.inc(16052);OWLClass arg0 = mock(OWLClass.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(16053);ontology.getEquivalentClassesAxioms(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(16054);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(16055);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16056);inOrder.verify(delegate, times(1)).getEquivalentClassesAxioms(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(16057);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16058);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16059);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getDisjointClassesAxioms_withReadLock() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),16060);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2v1tazuce4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getDisjointClassesAxioms_withReadLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16060,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2v1tazuce4(){try{__CLR4_5_2be3be3lviclhfo.R.inc(16060);
        __CLR4_5_2be3be3lviclhfo.R.inc(16061);OWLClass arg0 = mock(OWLClass.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(16062);ontology.getDisjointClassesAxioms(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(16063);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(16064);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16065);inOrder.verify(delegate, times(1)).getDisjointClassesAxioms(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(16066);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16067);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16068);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getDisjointUnionAxioms_withReadLock() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),16069);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21h0fjzced();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getDisjointUnionAxioms_withReadLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16069,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21h0fjzced(){try{__CLR4_5_2be3be3lviclhfo.R.inc(16069);
        __CLR4_5_2be3be3lviclhfo.R.inc(16070);OWLClass arg0 = mock(OWLClass.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(16071);ontology.getDisjointUnionAxioms(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(16072);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(16073);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16074);inOrder.verify(delegate, times(1)).getDisjointUnionAxioms(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(16075);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16076);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16077);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getHasKeyAxioms_withReadLock() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),16078);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2d9pglhcem();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getHasKeyAxioms_withReadLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16078,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2d9pglhcem(){try{__CLR4_5_2be3be3lviclhfo.R.inc(16078);
        __CLR4_5_2be3be3lviclhfo.R.inc(16079);OWLClass arg0 = mock(OWLClass.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(16080);ontology.getHasKeyAxioms(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(16081);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(16082);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16083);inOrder.verify(delegate, times(1)).getHasKeyAxioms(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(16084);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16085);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16086);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getObjectSubPropertyAxiomsForSubProperty_withReadLock() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),16087);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2h0p61acev();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getObjectSubPropertyAxiomsForSubProperty_withReadLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16087,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2h0p61acev(){try{__CLR4_5_2be3be3lviclhfo.R.inc(16087);
        __CLR4_5_2be3be3lviclhfo.R.inc(16088);OWLObjectPropertyExpression arg0 = mock(OWLObjectPropertyExpression.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(16089);ontology.getObjectSubPropertyAxiomsForSubProperty(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(16090);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(16091);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16092);inOrder.verify(delegate, times(1)).getObjectSubPropertyAxiomsForSubProperty(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(16093);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16094);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16095);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getObjectSubPropertyAxiomsForSuperProperty_withReadLock() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),16096);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2te122fcf4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getObjectSubPropertyAxiomsForSuperProperty_withReadLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16096,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2te122fcf4(){try{__CLR4_5_2be3be3lviclhfo.R.inc(16096);
        __CLR4_5_2be3be3lviclhfo.R.inc(16097);OWLObjectPropertyExpression arg0 = mock(OWLObjectPropertyExpression.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(16098);ontology.getObjectSubPropertyAxiomsForSuperProperty(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(16099);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(16100);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16101);inOrder.verify(delegate, times(1)).getObjectSubPropertyAxiomsForSuperProperty(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(16102);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16103);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16104);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getObjectPropertyDomainAxioms_withReadLock() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),16105);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vyk83scfd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getObjectPropertyDomainAxioms_withReadLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16105,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vyk83scfd(){try{__CLR4_5_2be3be3lviclhfo.R.inc(16105);
        __CLR4_5_2be3be3lviclhfo.R.inc(16106);OWLObjectPropertyExpression arg0 = mock(OWLObjectPropertyExpression.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(16107);ontology.getObjectPropertyDomainAxioms(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(16108);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(16109);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16110);inOrder.verify(delegate, times(1)).getObjectPropertyDomainAxioms(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(16111);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16112);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16113);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getObjectPropertyRangeAxioms_withReadLock() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),16114);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26zz2glcfm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getObjectPropertyRangeAxioms_withReadLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16114,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26zz2glcfm(){try{__CLR4_5_2be3be3lviclhfo.R.inc(16114);
        __CLR4_5_2be3be3lviclhfo.R.inc(16115);OWLObjectPropertyExpression arg0 = mock(OWLObjectPropertyExpression.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(16116);ontology.getObjectPropertyRangeAxioms(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(16117);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(16118);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16119);inOrder.verify(delegate, times(1)).getObjectPropertyRangeAxioms(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(16120);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16121);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16122);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getInverseObjectPropertyAxioms_withReadLock() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),16123);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vn6btccfv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getInverseObjectPropertyAxioms_withReadLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16123,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vn6btccfv(){try{__CLR4_5_2be3be3lviclhfo.R.inc(16123);
        __CLR4_5_2be3be3lviclhfo.R.inc(16124);OWLObjectPropertyExpression arg0 = mock(OWLObjectPropertyExpression.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(16125);ontology.getInverseObjectPropertyAxioms(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(16126);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(16127);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16128);inOrder.verify(delegate, times(1)).getInverseObjectPropertyAxioms(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(16129);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16130);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16131);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getEquivalentObjectPropertiesAxioms_withReadLock() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),16132);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2b9ikhwcg4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getEquivalentObjectPropertiesAxioms_withReadLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16132,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2b9ikhwcg4(){try{__CLR4_5_2be3be3lviclhfo.R.inc(16132);
        __CLR4_5_2be3be3lviclhfo.R.inc(16133);OWLObjectPropertyExpression arg0 = mock(OWLObjectPropertyExpression.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(16134);ontology.getEquivalentObjectPropertiesAxioms(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(16135);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(16136);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16137);inOrder.verify(delegate, times(1)).getEquivalentObjectPropertiesAxioms(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(16138);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16139);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16140);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getDisjointObjectPropertiesAxioms_withReadLock() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),16141);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_213x4lqcgd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getDisjointObjectPropertiesAxioms_withReadLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16141,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_213x4lqcgd(){try{__CLR4_5_2be3be3lviclhfo.R.inc(16141);
        __CLR4_5_2be3be3lviclhfo.R.inc(16142);OWLObjectPropertyExpression arg0 = mock(OWLObjectPropertyExpression.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(16143);ontology.getDisjointObjectPropertiesAxioms(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(16144);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(16145);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16146);inOrder.verify(delegate, times(1)).getDisjointObjectPropertiesAxioms(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(16147);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16148);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16149);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getFunctionalObjectPropertyAxioms_withReadLock() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),16150);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2c34sqfcgm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getFunctionalObjectPropertyAxioms_withReadLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16150,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2c34sqfcgm(){try{__CLR4_5_2be3be3lviclhfo.R.inc(16150);
        __CLR4_5_2be3be3lviclhfo.R.inc(16151);OWLObjectPropertyExpression arg0 = mock(OWLObjectPropertyExpression.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(16152);ontology.getFunctionalObjectPropertyAxioms(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(16153);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(16154);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16155);inOrder.verify(delegate, times(1)).getFunctionalObjectPropertyAxioms(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(16156);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16157);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16158);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getInverseFunctionalObjectPropertyAxioms_withReadLock() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),16159);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e25txpcgv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getInverseFunctionalObjectPropertyAxioms_withReadLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16159,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e25txpcgv(){try{__CLR4_5_2be3be3lviclhfo.R.inc(16159);
        __CLR4_5_2be3be3lviclhfo.R.inc(16160);OWLObjectPropertyExpression arg0 = mock(OWLObjectPropertyExpression.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(16161);ontology.getInverseFunctionalObjectPropertyAxioms(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(16162);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(16163);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16164);inOrder.verify(delegate, times(1)).getInverseFunctionalObjectPropertyAxioms(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(16165);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16166);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16167);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getSymmetricObjectPropertyAxioms_withReadLock() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),16168);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2avcjrrch4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getSymmetricObjectPropertyAxioms_withReadLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16168,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2avcjrrch4(){try{__CLR4_5_2be3be3lviclhfo.R.inc(16168);
        __CLR4_5_2be3be3lviclhfo.R.inc(16169);OWLObjectPropertyExpression arg0 = mock(OWLObjectPropertyExpression.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(16170);ontology.getSymmetricObjectPropertyAxioms(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(16171);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(16172);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16173);inOrder.verify(delegate, times(1)).getSymmetricObjectPropertyAxioms(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(16174);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16175);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16176);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getAsymmetricObjectPropertyAxioms_withReadLock() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),16177);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gjdnpychd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getAsymmetricObjectPropertyAxioms_withReadLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16177,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gjdnpychd(){try{__CLR4_5_2be3be3lviclhfo.R.inc(16177);
        __CLR4_5_2be3be3lviclhfo.R.inc(16178);OWLObjectPropertyExpression arg0 = mock(OWLObjectPropertyExpression.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(16179);ontology.getAsymmetricObjectPropertyAxioms(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(16180);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(16181);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16182);inOrder.verify(delegate, times(1)).getAsymmetricObjectPropertyAxioms(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(16183);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16184);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16185);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getReflexiveObjectPropertyAxioms_withReadLock() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),16186);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23q8recchm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getReflexiveObjectPropertyAxioms_withReadLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16186,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23q8recchm(){try{__CLR4_5_2be3be3lviclhfo.R.inc(16186);
        __CLR4_5_2be3be3lviclhfo.R.inc(16187);OWLObjectPropertyExpression arg0 = mock(OWLObjectPropertyExpression.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(16188);ontology.getReflexiveObjectPropertyAxioms(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(16189);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(16190);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16191);inOrder.verify(delegate, times(1)).getReflexiveObjectPropertyAxioms(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(16192);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16193);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16194);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getIrreflexiveObjectPropertyAxioms_withReadLock() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),16195);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_242o3ybchv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getIrreflexiveObjectPropertyAxioms_withReadLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16195,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_242o3ybchv(){try{__CLR4_5_2be3be3lviclhfo.R.inc(16195);
        __CLR4_5_2be3be3lviclhfo.R.inc(16196);OWLObjectPropertyExpression arg0 = mock(OWLObjectPropertyExpression.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(16197);ontology.getIrreflexiveObjectPropertyAxioms(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(16198);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(16199);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16200);inOrder.verify(delegate, times(1)).getIrreflexiveObjectPropertyAxioms(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(16201);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16202);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16203);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getTransitiveObjectPropertyAxioms_withReadLock() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),16204);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lwa4fbci4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getTransitiveObjectPropertyAxioms_withReadLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16204,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lwa4fbci4(){try{__CLR4_5_2be3be3lviclhfo.R.inc(16204);
        __CLR4_5_2be3be3lviclhfo.R.inc(16205);OWLObjectPropertyExpression arg0 = mock(OWLObjectPropertyExpression.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(16206);ontology.getTransitiveObjectPropertyAxioms(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(16207);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(16208);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16209);inOrder.verify(delegate, times(1)).getTransitiveObjectPropertyAxioms(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(16210);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16211);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16212);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getDataSubPropertyAxiomsForSubProperty_withReadLock() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),16213);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2aet0arcid();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getDataSubPropertyAxiomsForSubProperty_withReadLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16213,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2aet0arcid(){try{__CLR4_5_2be3be3lviclhfo.R.inc(16213);
        __CLR4_5_2be3be3lviclhfo.R.inc(16214);OWLDataProperty arg0 = mock(OWLDataProperty.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(16215);ontology.getDataSubPropertyAxiomsForSubProperty(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(16216);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(16217);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16218);inOrder.verify(delegate, times(1)).getDataSubPropertyAxiomsForSubProperty(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(16219);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16220);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16221);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getDataSubPropertyAxiomsForSuperProperty_withReadLock() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),16222);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cymqkecim();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getDataSubPropertyAxiomsForSuperProperty_withReadLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16222,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cymqkecim(){try{__CLR4_5_2be3be3lviclhfo.R.inc(16222);
        __CLR4_5_2be3be3lviclhfo.R.inc(16223);OWLDataPropertyExpression arg0 = mock(OWLDataPropertyExpression.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(16224);ontology.getDataSubPropertyAxiomsForSuperProperty(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(16225);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(16226);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16227);inOrder.verify(delegate, times(1)).getDataSubPropertyAxiomsForSuperProperty(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(16228);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16229);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16230);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getDataPropertyDomainAxioms_withReadLock() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),16231);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23d68rhciv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getDataPropertyDomainAxioms_withReadLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16231,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23d68rhciv(){try{__CLR4_5_2be3be3lviclhfo.R.inc(16231);
        __CLR4_5_2be3be3lviclhfo.R.inc(16232);OWLDataProperty arg0 = mock(OWLDataProperty.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(16233);ontology.getDataPropertyDomainAxioms(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(16234);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(16235);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16236);inOrder.verify(delegate, times(1)).getDataPropertyDomainAxioms(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(16237);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16238);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16239);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getDataPropertyRangeAxioms_withReadLock() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),16240);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2848d3qcj4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getDataPropertyRangeAxioms_withReadLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16240,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2848d3qcj4(){try{__CLR4_5_2be3be3lviclhfo.R.inc(16240);
        __CLR4_5_2be3be3lviclhfo.R.inc(16241);OWLDataProperty arg0 = mock(OWLDataProperty.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(16242);ontology.getDataPropertyRangeAxioms(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(16243);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(16244);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16245);inOrder.verify(delegate, times(1)).getDataPropertyRangeAxioms(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(16246);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16247);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16248);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getEquivalentDataPropertiesAxioms_withReadLock() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),16249);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27s0aahcjd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getEquivalentDataPropertiesAxioms_withReadLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16249,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27s0aahcjd(){try{__CLR4_5_2be3be3lviclhfo.R.inc(16249);
        __CLR4_5_2be3be3lviclhfo.R.inc(16250);OWLDataProperty arg0 = mock(OWLDataProperty.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(16251);ontology.getEquivalentDataPropertiesAxioms(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(16252);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(16253);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16254);inOrder.verify(delegate, times(1)).getEquivalentDataPropertiesAxioms(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(16255);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16256);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16257);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getDisjointDataPropertiesAxioms_withReadLock() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),16258);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2c4jbnrcjm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getDisjointDataPropertiesAxioms_withReadLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16258,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2c4jbnrcjm(){try{__CLR4_5_2be3be3lviclhfo.R.inc(16258);
        __CLR4_5_2be3be3lviclhfo.R.inc(16259);OWLDataProperty arg0 = mock(OWLDataProperty.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(16260);ontology.getDisjointDataPropertiesAxioms(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(16261);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(16262);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16263);inOrder.verify(delegate, times(1)).getDisjointDataPropertiesAxioms(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(16264);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16265);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16266);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getFunctionalDataPropertyAxioms_withReadLock() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),16267);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2d7wy3mcjv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getFunctionalDataPropertyAxioms_withReadLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16267,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2d7wy3mcjv(){try{__CLR4_5_2be3be3lviclhfo.R.inc(16267);
        __CLR4_5_2be3be3lviclhfo.R.inc(16268);OWLDataPropertyExpression arg0 = mock(OWLDataPropertyExpression.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(16269);ontology.getFunctionalDataPropertyAxioms(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(16270);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(16271);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16272);inOrder.verify(delegate, times(1)).getFunctionalDataPropertyAxioms(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(16273);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16274);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16275);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getClassAssertionAxioms_withReadLock() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),16276);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pllxrqck4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getClassAssertionAxioms_withReadLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16276,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pllxrqck4(){try{__CLR4_5_2be3be3lviclhfo.R.inc(16276);
        __CLR4_5_2be3be3lviclhfo.R.inc(16277);OWLClassExpression arg0 = mock(OWLClassExpression.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(16278);ontology.getClassAssertionAxioms(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(16279);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(16280);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16281);inOrder.verify(delegate, times(1)).getClassAssertionAxioms(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(16282);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16283);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16284);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getClassAssertionAxioms_withReadLock_2() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),16285);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wlfqo9ckd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getClassAssertionAxioms_withReadLock_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16285,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wlfqo9ckd(){try{__CLR4_5_2be3be3lviclhfo.R.inc(16285);
        __CLR4_5_2be3be3lviclhfo.R.inc(16286);OWLIndividual arg0 = mock(OWLIndividual.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(16287);ontology.getClassAssertionAxioms(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(16288);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(16289);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16290);inOrder.verify(delegate, times(1)).getClassAssertionAxioms(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(16291);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16292);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16293);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getDataPropertyAssertionAxioms_withReadLock() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),16294);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ia2kxbckm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getDataPropertyAssertionAxioms_withReadLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16294,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ia2kxbckm(){try{__CLR4_5_2be3be3lviclhfo.R.inc(16294);
        __CLR4_5_2be3be3lviclhfo.R.inc(16295);OWLIndividual arg0 = mock(OWLIndividual.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(16296);ontology.getDataPropertyAssertionAxioms(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(16297);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(16298);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16299);inOrder.verify(delegate, times(1)).getDataPropertyAssertionAxioms(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(16300);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16301);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16302);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getObjectPropertyAssertionAxioms_withReadLock() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),16303);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qkgrd2ckv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getObjectPropertyAssertionAxioms_withReadLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16303,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qkgrd2ckv(){try{__CLR4_5_2be3be3lviclhfo.R.inc(16303);
        __CLR4_5_2be3be3lviclhfo.R.inc(16304);OWLIndividual arg0 = mock(OWLIndividual.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(16305);ontology.getObjectPropertyAssertionAxioms(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(16306);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(16307);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16308);inOrder.verify(delegate, times(1)).getObjectPropertyAssertionAxioms(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(16309);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16310);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16311);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getNegativeObjectPropertyAssertionAxioms_withReadLock() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),16312);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kog6wrcl4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getNegativeObjectPropertyAssertionAxioms_withReadLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16312,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kog6wrcl4(){try{__CLR4_5_2be3be3lviclhfo.R.inc(16312);
        __CLR4_5_2be3be3lviclhfo.R.inc(16313);OWLIndividual arg0 = mock(OWLIndividual.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(16314);ontology.getNegativeObjectPropertyAssertionAxioms(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(16315);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(16316);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16317);inOrder.verify(delegate, times(1)).getNegativeObjectPropertyAssertionAxioms(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(16318);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16319);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16320);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getNegativeDataPropertyAssertionAxioms_withReadLock() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),16321);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2djzu7ucld();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getNegativeDataPropertyAssertionAxioms_withReadLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16321,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2djzu7ucld(){try{__CLR4_5_2be3be3lviclhfo.R.inc(16321);
        __CLR4_5_2be3be3lviclhfo.R.inc(16322);OWLIndividual arg0 = mock(OWLIndividual.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(16323);ontology.getNegativeDataPropertyAssertionAxioms(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(16324);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(16325);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16326);inOrder.verify(delegate, times(1)).getNegativeDataPropertyAssertionAxioms(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(16327);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16328);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16329);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getSameIndividualAxioms_withReadLock() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),16330);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vq4arlclm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getSameIndividualAxioms_withReadLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16330,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vq4arlclm(){try{__CLR4_5_2be3be3lviclhfo.R.inc(16330);
        __CLR4_5_2be3be3lviclhfo.R.inc(16331);OWLIndividual arg0 = mock(OWLIndividual.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(16332);ontology.getSameIndividualAxioms(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(16333);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(16334);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16335);inOrder.verify(delegate, times(1)).getSameIndividualAxioms(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(16336);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16337);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16338);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getDifferentIndividualAxioms_withReadLock() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),16339);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ii5hq6clv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getDifferentIndividualAxioms_withReadLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16339,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ii5hq6clv(){try{__CLR4_5_2be3be3lviclhfo.R.inc(16339);
        __CLR4_5_2be3be3lviclhfo.R.inc(16340);OWLIndividual arg0 = mock(OWLIndividual.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(16341);ontology.getDifferentIndividualAxioms(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(16342);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(16343);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16344);inOrder.verify(delegate, times(1)).getDifferentIndividualAxioms(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(16345);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16346);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16347);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getDatatypeDefinitions_withReadLock() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),16348);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2b276l7cm4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getDatatypeDefinitions_withReadLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16348,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2b276l7cm4(){try{__CLR4_5_2be3be3lviclhfo.R.inc(16348);
        __CLR4_5_2be3be3lviclhfo.R.inc(16349);OWLDatatype arg0 = mock(OWLDatatype.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(16350);ontology.getDatatypeDefinitions(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(16351);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(16352);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16353);inOrder.verify(delegate, times(1)).getDatatypeDefinitions(arg0);
        __CLR4_5_2be3be3lviclhfo.R.inc(16354);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16355);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16356);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getOWLOntologyManager_withReadLock() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),16357);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25v96evcmd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getOWLOntologyManager_withReadLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16357,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25v96evcmd(){try{__CLR4_5_2be3be3lviclhfo.R.inc(16357);
        __CLR4_5_2be3be3lviclhfo.R.inc(16358);ontology.getOWLOntologyManager();
        __CLR4_5_2be3be3lviclhfo.R.inc(16359);InOrder inOrder = Mockito.inOrder(readLock, delegate, readLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(16360);inOrder.verify(readLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16361);inOrder.verify(delegate, times(1)).getOWLOntologyManager();
        __CLR4_5_2be3be3lviclhfo.R.inc(16362);inOrder.verify(readLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16363);verify(writeLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16364);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_getOWLOntologyManager_withWriteLock() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),16365);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27m1raocml();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_getOWLOntologyManager_withWriteLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16365,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27m1raocml(){try{__CLR4_5_2be3be3lviclhfo.R.inc(16365);
        __CLR4_5_2be3be3lviclhfo.R.inc(16366);OWLOntologyManager arg = mock(OWLOntologyManager.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(16367);ontology.setOWLOntologyManager(arg);
        __CLR4_5_2be3be3lviclhfo.R.inc(16368);InOrder inOrder = Mockito.inOrder(writeLock, delegate, writeLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(16369);inOrder.verify(writeLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16370);inOrder.verify(delegate, times(1)).setOWLOntologyManager(arg);
        __CLR4_5_2be3be3lviclhfo.R.inc(16371);inOrder.verify(writeLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16372);verify(readLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16373);verify(readLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_applyChange_withWriteLock() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),16374);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2t68ijicmu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_applyChange_withWriteLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16374,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2t68ijicmu(){try{__CLR4_5_2be3be3lviclhfo.R.inc(16374);
        __CLR4_5_2be3be3lviclhfo.R.inc(16375);OWLOntologyChange arg = mock(OWLOntologyChange.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(16376);ontology.applyChange(arg);
        __CLR4_5_2be3be3lviclhfo.R.inc(16377);InOrder inOrder = Mockito.inOrder(writeLock, delegate, writeLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(16378);inOrder.verify(writeLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16379);inOrder.verify(delegate, times(1)).applyChange(arg);
        __CLR4_5_2be3be3lviclhfo.R.inc(16380);inOrder.verify(writeLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16381);verify(readLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16382);verify(readLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_applyChanges_withWriteLock() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),16383);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23chqx9cn3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_applyChanges_withWriteLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16383,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23chqx9cn3(){try{__CLR4_5_2be3be3lviclhfo.R.inc(16383);
        __CLR4_5_2be3be3lviclhfo.R.inc(16384);List<OWLOntologyChange> arg = Mockito.mock(List.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(16385);ontology.applyChanges(arg);
        __CLR4_5_2be3be3lviclhfo.R.inc(16386);InOrder inOrder = Mockito.inOrder(writeLock, delegate, writeLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(16387);inOrder.verify(writeLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16388);inOrder.verify(delegate, times(1)).applyChanges(arg);
        __CLR4_5_2be3be3lviclhfo.R.inc(16389);inOrder.verify(writeLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16390);verify(readLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16391);verify(readLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_addAxioms_withWriteLock() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),16392);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21b4cf8cnc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_addAxioms_withWriteLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16392,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21b4cf8cnc(){try{__CLR4_5_2be3be3lviclhfo.R.inc(16392);
        __CLR4_5_2be3be3lviclhfo.R.inc(16393);Set<OWLAxiom> arg = Mockito.mock(Set.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(16394);ontology.addAxioms(arg);
        __CLR4_5_2be3be3lviclhfo.R.inc(16395);InOrder inOrder = Mockito.inOrder(writeLock, delegate, writeLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(16396);inOrder.verify(writeLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16397);inOrder.verify(delegate, times(1)).addAxioms(arg);
        __CLR4_5_2be3be3lviclhfo.R.inc(16398);inOrder.verify(writeLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16399);verify(readLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16400);verify(readLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}

    @Test
    public void shouldDelegateTo_addAxiom_withWriteLock() {__CLR4_5_2be3be3lviclhfo.R.globalSliceStart(getClass().getName(),16401);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gpvp09cnl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2be3be3lviclhfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2be3be3lviclhfo.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyImpl_TestCase.shouldDelegateTo_addAxiom_withWriteLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16401,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gpvp09cnl(){try{__CLR4_5_2be3be3lviclhfo.R.inc(16401);
        __CLR4_5_2be3be3lviclhfo.R.inc(16402);OWLAxiom arg = Mockito.mock(OWLAxiom.class);
        __CLR4_5_2be3be3lviclhfo.R.inc(16403);ontology.addAxiom(arg);
        __CLR4_5_2be3be3lviclhfo.R.inc(16404);InOrder inOrder = Mockito.inOrder(writeLock, delegate, writeLock);
        __CLR4_5_2be3be3lviclhfo.R.inc(16405);inOrder.verify(writeLock, times(1)).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16406);inOrder.verify(delegate, times(1)).addAxiom(arg);
        __CLR4_5_2be3be3lviclhfo.R.inc(16407);inOrder.verify(writeLock, times(1)).unlock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16408);verify(readLock, never()).lock();
        __CLR4_5_2be3be3lviclhfo.R.inc(16409);verify(readLock, never()).unlock();
    }finally{__CLR4_5_2be3be3lviclhfo.R.flushNeeded();}}
}
