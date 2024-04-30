/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package uk.ac.manchester.cs.owl.owlapi.concurrent;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.*;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyBuilder;
import org.semanticweb.owlapi.model.OWLOntologyID;
import org.semanticweb.owlapi.model.OWLOntologyManager;

/**
 * Matthew Horridge Stanford Center for Biomedical Informatics Research 10/04/15
 */
@SuppressWarnings("javadoc")
@RunWith(MockitoJUnitRunner.class)
public class ConcurrentOWLOntologyBuilder_TestCase {static class __CLR4_5_2bdrbdrlviclhc3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u006d\u0070\u006c\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237246897L,8589935092L,14763,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private ConcurrentOWLOntologyBuilder builder;
    @Mock
    private OWLOntologyBuilder delegateBuilder;
    @Mock
    private ReadWriteLock readWriteLock;
    @Mock
    private Lock readLock, writeLock;
    @Mock
    private OWLOntologyManager manager;
    @Mock
    private OWLOntologyID ontologyId;
    @Mock
    private OWLOntology ontology;

    @Before
    public void setUp() {try{__CLR4_5_2bdrbdrlviclhc3.R.inc(14751);
        __CLR4_5_2bdrbdrlviclhc3.R.inc(14752);when(delegateBuilder.createOWLOntology(manager, ontologyId)).thenReturn(ontology);
        __CLR4_5_2bdrbdrlviclhc3.R.inc(14753);when(ontology.getOntologyID()).thenReturn(ontologyId);
        __CLR4_5_2bdrbdrlviclhc3.R.inc(14754);when(readWriteLock.readLock()).thenReturn(readLock);
        __CLR4_5_2bdrbdrlviclhc3.R.inc(14755);when(readWriteLock.writeLock()).thenReturn(writeLock);
        __CLR4_5_2bdrbdrlviclhc3.R.inc(14756);builder = new ConcurrentOWLOntologyBuilder(delegateBuilder, readWriteLock);
    }finally{__CLR4_5_2bdrbdrlviclhc3.R.flushNeeded();}}

    @Test
    public void shouldCallDelegate() {__CLR4_5_2bdrbdrlviclhc3.R.globalSliceStart(getClass().getName(),14757);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uh7kkdbdx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2bdrbdrlviclhc3.R.rethrow($CLV_t2$);}finally{__CLR4_5_2bdrbdrlviclhc3.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyBuilder_TestCase.shouldCallDelegate",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14757,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uh7kkdbdx(){try{__CLR4_5_2bdrbdrlviclhc3.R.inc(14757);
        __CLR4_5_2bdrbdrlviclhc3.R.inc(14758);builder.createOWLOntology(manager, ontologyId);
        __CLR4_5_2bdrbdrlviclhc3.R.inc(14759);verify(delegateBuilder, times(1)).createOWLOntology(manager, ontologyId);
    }finally{__CLR4_5_2bdrbdrlviclhc3.R.flushNeeded();}}

    @Test
    public void shouldCreateWrappedOntology() {__CLR4_5_2bdrbdrlviclhc3.R.globalSliceStart(getClass().getName(),14760);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_227rwngbe0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2bdrbdrlviclhc3.R.rethrow($CLV_t2$);}finally{__CLR4_5_2bdrbdrlviclhc3.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentOWLOntologyBuilder_TestCase.shouldCreateWrappedOntology",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14760,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_227rwngbe0(){try{__CLR4_5_2bdrbdrlviclhc3.R.inc(14760);
        __CLR4_5_2bdrbdrlviclhc3.R.inc(14761);OWLOntology concurrentOntology = builder.createOWLOntology(manager, ontologyId);
        __CLR4_5_2bdrbdrlviclhc3.R.inc(14762);assertThat(concurrentOntology, is(equalTo(ontology)));
    }finally{__CLR4_5_2bdrbdrlviclhc3.R.flushNeeded();}}
}
