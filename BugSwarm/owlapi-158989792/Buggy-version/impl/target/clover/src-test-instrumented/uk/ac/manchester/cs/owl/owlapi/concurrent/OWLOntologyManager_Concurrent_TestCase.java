/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package uk.ac.manchester.cs.owl.owlapi.concurrent;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.*;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InOrder;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.runners.MockitoJUnitRunner;
import org.mockito.stubbing.Answer;
import org.semanticweb.owlapi.io.OWLOntologyDocumentSource;
import org.semanticweb.owlapi.io.OWLOntologyDocumentTarget;
import org.semanticweb.owlapi.io.OWLParserFactory;
import org.semanticweb.owlapi.model.*;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.inject.Provider;

import uk.ac.manchester.cs.owl.owlapi.OWLImportsDeclarationImpl;
import uk.ac.manchester.cs.owl.owlapi.OWLOntologyImpl;
import uk.ac.manchester.cs.owl.owlapi.OWLOntologyManagerImpl;

/**
 * Matthew Horridge Stanford Center for Biomedical Informatics Research 13/04/15
 */
@SuppressWarnings("javadoc")
@RunWith(MockitoJUnitRunner.class)
public class OWLOntologyManager_Concurrent_TestCase {static class __CLR4_5_2cq3cq3lviclhi4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u006d\u0070\u006c\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237246897L,8589935092L,16870,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private OWLOntologyManager manager;
    @Mock private Lock readLock, writeLock;
    @Mock private OWLDataFactory dataFactory;
    @Mock private ReadWriteLock readWriteLock;
    private OWLOntology ontology;

    @Before
    public void setUp() throws OWLOntologyCreationException {try{__CLR4_5_2cq3cq3lviclhi4.R.inc(16491);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16492);when(readWriteLock.readLock()).thenReturn(readLock);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16493);when(readWriteLock.writeLock()).thenReturn(writeLock);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16494);manager = new OWLOntologyManagerImpl(dataFactory, readWriteLock);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16495);mockAndAddOntologyFactory();
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16496);mockAndAddOntologyStorer();
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16497);IRI iri = IRI.create("http://owlapi/ont");
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16498);ontology = manager.createOntology(iri);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16499);manager.setOntologyDocumentIRI(ontology, iri);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16500);reset(readLock, writeLock, readWriteLock);
    }finally{__CLR4_5_2cq3cq3lviclhi4.R.flushNeeded();}}

    private void mockAndAddOntologyFactory() throws OWLOntologyCreationException {try{__CLR4_5_2cq3cq3lviclhi4.R.inc(16501);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16502);OWLOntologyFactory ontologyFactory = mock(OWLOntologyFactory.class);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16503);when(ontologyFactory.canCreateFromDocumentIRI(any(IRI.class))).thenReturn(true);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16504);when(ontologyFactory.canLoad(any(OWLOntologyDocumentSource.class))).thenReturn(true);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16505);final OWLOntology owlOntology = new OWLOntologyImpl(manager, new OWLOntologyID());
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16506);when(ontologyFactory.createOWLOntology(any(OWLOntologyManager.class), any(OWLOntologyID.class), any(IRI.class),
            any(OWLOntologyFactory.OWLOntologyCreationHandler.class))).thenAnswer(new Answer<OWLOntology>() {

                @Override
                public OWLOntology answer(InvocationOnMock invocation) throws Throwable {try{__CLR4_5_2cq3cq3lviclhi4.R.inc(16507);
                    __CLR4_5_2cq3cq3lviclhi4.R.inc(16508);((OWLOntologyFactory.OWLOntologyCreationHandler) invocation.getArguments()[3]).ontologyCreated(
                        owlOntology);
                    __CLR4_5_2cq3cq3lviclhi4.R.inc(16509);return owlOntology;
                }finally{__CLR4_5_2cq3cq3lviclhi4.R.flushNeeded();}}
            });
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16510);when(ontologyFactory.loadOWLOntology(any(OWLOntologyManager.class), any(OWLOntologyDocumentSource.class), any(
            OWLOntologyFactory.OWLOntologyCreationHandler.class), any(OWLOntologyLoaderConfiguration.class)))
                .thenAnswer(new Answer<OWLOntology>() {

                    @Override
                    public OWLOntology answer(InvocationOnMock invocation) throws Throwable {try{__CLR4_5_2cq3cq3lviclhi4.R.inc(16511);
                        __CLR4_5_2cq3cq3lviclhi4.R.inc(16512);((OWLOntologyFactory.OWLOntologyCreationHandler) invocation.getArguments()[2]).ontologyCreated(
                            owlOntology);
                        __CLR4_5_2cq3cq3lviclhi4.R.inc(16513);return owlOntology;
                    }finally{__CLR4_5_2cq3cq3lviclhi4.R.flushNeeded();}}
                });
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16514);manager.setOntologyFactories(Collections.singleton(ontologyFactory));
    }finally{__CLR4_5_2cq3cq3lviclhi4.R.flushNeeded();}}

    private void mockAndAddOntologyStorer() {try{__CLR4_5_2cq3cq3lviclhi4.R.inc(16515);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16516);OWLStorer storer = mock(OWLStorer.class);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16517);when(storer.canStoreOntology(any(OWLDocumentFormat.class))).thenReturn(true);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16518);OWLStorerFactory storerFactory = mock(OWLStorerFactory.class);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16519);when(storerFactory.createStorer()).thenReturn(storer);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16520);when(storerFactory.getFormatFactory()).thenReturn(mock(OWLDocumentFormatFactory.class));
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16521);manager.setOntologyStorers(Collections.singleton(storerFactory));
    }finally{__CLR4_5_2cq3cq3lviclhi4.R.flushNeeded();}}

    @Test
    public void shouldCall_contains_with_readLock() {__CLR4_5_2cq3cq3lviclhi4.R.globalSliceStart(getClass().getName(),16522);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28al57zcqy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2cq3cq3lviclhi4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2cq3cq3lviclhi4.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.OWLOntologyManager_Concurrent_TestCase.shouldCall_contains_with_readLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16522,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28al57zcqy(){try{__CLR4_5_2cq3cq3lviclhi4.R.inc(16522);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16523);IRI arg0 = mockIRI();
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16524);manager.contains(arg0);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16525);verifyReadLock_LockUnlock();
    }finally{__CLR4_5_2cq3cq3lviclhi4.R.flushNeeded();}}

    @Test
    public void shouldCall_contains_with_readLock_2() {__CLR4_5_2cq3cq3lviclhi4.R.globalSliceStart(getClass().getName(),16526);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mlmhoicr2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2cq3cq3lviclhi4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2cq3cq3lviclhi4.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.OWLOntologyManager_Concurrent_TestCase.shouldCall_contains_with_readLock_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16526,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mlmhoicr2(){try{__CLR4_5_2cq3cq3lviclhi4.R.inc(16526);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16527);OWLOntologyID arg0 = new OWLOntologyID();
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16528);manager.contains(arg0);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16529);verifyReadLock_LockUnlock();
    }finally{__CLR4_5_2cq3cq3lviclhi4.R.flushNeeded();}}

    @Test
    public void shouldCall_contains_with_readLock_3() {__CLR4_5_2cq3cq3lviclhi4.R.globalSliceStart(getClass().getName(),16530);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pumggzcr6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2cq3cq3lviclhi4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2cq3cq3lviclhi4.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.OWLOntologyManager_Concurrent_TestCase.shouldCall_contains_with_readLock_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16530,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pumggzcr6(){try{__CLR4_5_2cq3cq3lviclhi4.R.inc(16530);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16531);manager.contains(ontology);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16532);verifyReadLock_LockUnlock();
    }finally{__CLR4_5_2cq3cq3lviclhi4.R.flushNeeded();}}

    @Test
    public void shouldCall_getOntologies_with_readLock() {__CLR4_5_2cq3cq3lviclhi4.R.globalSliceStart(getClass().getName(),16533);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xprb2vcr9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2cq3cq3lviclhi4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2cq3cq3lviclhi4.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.OWLOntologyManager_Concurrent_TestCase.shouldCall_getOntologies_with_readLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16533,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xprb2vcr9(){try{__CLR4_5_2cq3cq3lviclhi4.R.inc(16533);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16534);OWLAxiom arg0 = mock(OWLAxiom.class);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16535);manager.getOntologies(arg0);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16536);verifyReadLock_LockUnlock();
    }finally{__CLR4_5_2cq3cq3lviclhi4.R.flushNeeded();}}

    @Test
    public void shouldCall_containsVersion_with_readLock() {__CLR4_5_2cq3cq3lviclhi4.R.globalSliceStart(getClass().getName(),16537);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rzgzalcrd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2cq3cq3lviclhi4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2cq3cq3lviclhi4.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.OWLOntologyManager_Concurrent_TestCase.shouldCall_containsVersion_with_readLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16537,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rzgzalcrd(){try{__CLR4_5_2cq3cq3lviclhi4.R.inc(16537);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16538);IRI arg0 = mockIRI();
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16539);manager.containsVersion(arg0);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16540);verifyReadLock_LockUnlock();
    }finally{__CLR4_5_2cq3cq3lviclhi4.R.flushNeeded();}}

    @Test
    public void shouldCall_getVersions_with_readLock() {__CLR4_5_2cq3cq3lviclhi4.R.globalSliceStart(getClass().getName(),16541);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2u4wohncrh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2cq3cq3lviclhi4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2cq3cq3lviclhi4.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.OWLOntologyManager_Concurrent_TestCase.shouldCall_getVersions_with_readLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16541,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2u4wohncrh(){try{__CLR4_5_2cq3cq3lviclhi4.R.inc(16541);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16542);IRI arg0 = mockIRI();
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16543);manager.getVersions(arg0);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16544);verifyReadLock_LockUnlock();
    }finally{__CLR4_5_2cq3cq3lviclhi4.R.flushNeeded();}}

    @Test
    public void shouldCall_getOntologyIDsByVersion_with_readLock() {__CLR4_5_2cq3cq3lviclhi4.R.globalSliceStart(getClass().getName(),16545);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2v3a2kecrl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2cq3cq3lviclhi4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2cq3cq3lviclhi4.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.OWLOntologyManager_Concurrent_TestCase.shouldCall_getOntologyIDsByVersion_with_readLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16545,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2v3a2kecrl(){try{__CLR4_5_2cq3cq3lviclhi4.R.inc(16545);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16546);IRI arg0 = mockIRI();
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16547);manager.getOntologyIDsByVersion(arg0);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16548);verifyReadLock_LockUnlock();
    }finally{__CLR4_5_2cq3cq3lviclhi4.R.flushNeeded();}}

    @Test
    public void shouldCall_getOntology_with_readLock() {__CLR4_5_2cq3cq3lviclhi4.R.globalSliceStart(getClass().getName(),16549);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2se9q6fcrp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2cq3cq3lviclhi4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2cq3cq3lviclhi4.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.OWLOntologyManager_Concurrent_TestCase.shouldCall_getOntology_with_readLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16549,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2se9q6fcrp(){try{__CLR4_5_2cq3cq3lviclhi4.R.inc(16549);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16550);OWLOntologyID arg0 = new OWLOntologyID();
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16551);manager.getOntology(arg0);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16552);verifyReadLock_LockUnlock();
    }finally{__CLR4_5_2cq3cq3lviclhi4.R.flushNeeded();}}

    @Test
    public void shouldCall_getOntology_with_readLock_2() {__CLR4_5_2cq3cq3lviclhi4.R.globalSliceStart(getClass().getName(),16553);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25mmho4crt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2cq3cq3lviclhi4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2cq3cq3lviclhi4.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.OWLOntologyManager_Concurrent_TestCase.shouldCall_getOntology_with_readLock_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16553,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25mmho4crt(){try{__CLR4_5_2cq3cq3lviclhi4.R.inc(16553);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16554);IRI arg0 = mockIRI();
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16555);manager.getOntology(arg0);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16556);verifyReadLock_LockUnlock();
    }finally{__CLR4_5_2cq3cq3lviclhi4.R.flushNeeded();}}

    private IRI mockIRI() {try{__CLR4_5_2cq3cq3lviclhi4.R.inc(16557);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16558);return IRI.create("http://owlapi.sourceforge.net/stuff");
    }finally{__CLR4_5_2cq3cq3lviclhi4.R.flushNeeded();}}

    @Test
    public void shouldCall_getImportedOntology_with_readLock() {__CLR4_5_2cq3cq3lviclhi4.R.globalSliceStart(getClass().getName(),16559);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2w82rdvcrz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2cq3cq3lviclhi4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2cq3cq3lviclhi4.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.OWLOntologyManager_Concurrent_TestCase.shouldCall_getImportedOntology_with_readLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16559,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2w82rdvcrz(){try{__CLR4_5_2cq3cq3lviclhi4.R.inc(16559);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16560);OWLImportsDeclaration arg0 = new OWLImportsDeclarationImpl(IRI.create("http://owlapi/ont"));
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16561);manager.getImportedOntology(arg0);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16562);verifyReadLock_LockUnlock();
    }finally{__CLR4_5_2cq3cq3lviclhi4.R.flushNeeded();}}

    @Test
    public void shouldCall_getDirectImports_with_readLock() {__CLR4_5_2cq3cq3lviclhi4.R.globalSliceStart(getClass().getName(),16563);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27gw1r5cs3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2cq3cq3lviclhi4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2cq3cq3lviclhi4.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.OWLOntologyManager_Concurrent_TestCase.shouldCall_getDirectImports_with_readLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16563,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27gw1r5cs3(){try{__CLR4_5_2cq3cq3lviclhi4.R.inc(16563);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16564);manager.getDirectImports(ontology);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16565);verifyReadLock_LockUnlock();
    }finally{__CLR4_5_2cq3cq3lviclhi4.R.flushNeeded();}}

    @Test
    public void shouldCall_getImports_with_readLock() {__CLR4_5_2cq3cq3lviclhi4.R.globalSliceStart(getClass().getName(),16566);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hr06egcs6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2cq3cq3lviclhi4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2cq3cq3lviclhi4.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.OWLOntologyManager_Concurrent_TestCase.shouldCall_getImports_with_readLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16566,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hr06egcs6(){try{__CLR4_5_2cq3cq3lviclhi4.R.inc(16566);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16567);manager.getImports(ontology);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16568);verifyReadLock_LockUnlock();
    }finally{__CLR4_5_2cq3cq3lviclhi4.R.flushNeeded();}}

    @Test
    public void shouldCall_getImportsClosure_with_readLock() {__CLR4_5_2cq3cq3lviclhi4.R.globalSliceStart(getClass().getName(),16569);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2l3npnbcs9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2cq3cq3lviclhi4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2cq3cq3lviclhi4.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.OWLOntologyManager_Concurrent_TestCase.shouldCall_getImportsClosure_with_readLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16569,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2l3npnbcs9(){try{__CLR4_5_2cq3cq3lviclhi4.R.inc(16569);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16570);manager.getImportsClosure(ontology);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16571);verifyReadLock_LockUnlock();
    }finally{__CLR4_5_2cq3cq3lviclhi4.R.flushNeeded();}}

    @Test
    public void shouldCall_getSortedImportsClosure_with_readLock() {__CLR4_5_2cq3cq3lviclhi4.R.globalSliceStart(getClass().getName(),16572);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dogod0csc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2cq3cq3lviclhi4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2cq3cq3lviclhi4.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.OWLOntologyManager_Concurrent_TestCase.shouldCall_getSortedImportsClosure_with_readLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16572,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dogod0csc(){try{__CLR4_5_2cq3cq3lviclhi4.R.inc(16572);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16573);manager.getSortedImportsClosure(ontology);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16574);verifyReadLock_LockUnlock();
    }finally{__CLR4_5_2cq3cq3lviclhi4.R.flushNeeded();}}

    @Test
    public void shouldCall_createOntology_with_writeLock() throws OWLOntologyCreationException {__CLR4_5_2cq3cq3lviclhi4.R.globalSliceStart(getClass().getName(),16575);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28kfvhacsf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2cq3cq3lviclhi4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2cq3cq3lviclhi4.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.OWLOntologyManager_Concurrent_TestCase.shouldCall_createOntology_with_writeLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16575,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28kfvhacsf() throws OWLOntologyCreationException{try{__CLR4_5_2cq3cq3lviclhi4.R.inc(16575);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16576);IRI arg0 = mockIRI();
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16577);manager.createOntology(arg0);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16578);verifyWriteLock_LockUnlock();
    }finally{__CLR4_5_2cq3cq3lviclhi4.R.flushNeeded();}}

    @Test
    public void shouldCall_createOntology_with_writeLock_2() throws OWLOntologyCreationException {__CLR4_5_2cq3cq3lviclhi4.R.globalSliceStart(getClass().getName(),16579);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21ih86pcsj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2cq3cq3lviclhi4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2cq3cq3lviclhi4.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.OWLOntologyManager_Concurrent_TestCase.shouldCall_createOntology_with_writeLock_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16579,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21ih86pcsj() throws OWLOntologyCreationException{try{__CLR4_5_2cq3cq3lviclhi4.R.inc(16579);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16580);OWLOntologyID arg0 = new OWLOntologyID();
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16581);manager.createOntology(arg0);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16582);verifyWriteLock_LockUnlock();
    }finally{__CLR4_5_2cq3cq3lviclhi4.R.flushNeeded();}}

    @Test
    public void shouldCall_createOntology_with_writeLock_3() throws OWLOntologyCreationException {__CLR4_5_2cq3cq3lviclhi4.R.globalSliceStart(getClass().getName(),16583);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24rh6z6csn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2cq3cq3lviclhi4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2cq3cq3lviclhi4.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.OWLOntologyManager_Concurrent_TestCase.shouldCall_createOntology_with_writeLock_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16583,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24rh6z6csn() throws OWLOntologyCreationException{try{__CLR4_5_2cq3cq3lviclhi4.R.inc(16583);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16584);IRI arg0 = mockIRI();
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16585);Set<OWLOntology> arg1 = Collections.emptySet();
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16586);boolean arg2 = true;
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16587);manager.createOntology(arg0, arg1, arg2);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16588);verifyWriteLock_LockUnlock();
    }finally{__CLR4_5_2cq3cq3lviclhi4.R.flushNeeded();}}

    @Test
    public void shouldCall_createOntology_with_writeLock_4() throws OWLOntologyCreationException {__CLR4_5_2cq3cq3lviclhi4.R.globalSliceStart(getClass().getName(),16589);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_280h5rncst();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2cq3cq3lviclhi4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2cq3cq3lviclhi4.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.OWLOntologyManager_Concurrent_TestCase.shouldCall_createOntology_with_writeLock_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16589,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_280h5rncst() throws OWLOntologyCreationException{try{__CLR4_5_2cq3cq3lviclhi4.R.inc(16589);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16590);IRI arg0 = mockIRI();
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16591);Set<OWLOntology> arg1 = Sets.newConcurrentHashSet();
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16592);manager.createOntology(arg0, arg1);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16593);verifyWriteLock_LockUnlock();
    }finally{__CLR4_5_2cq3cq3lviclhi4.R.flushNeeded();}}

    @Test
    public void shouldCall_createOntology_with_writeLock_5() throws OWLOntologyCreationException {__CLR4_5_2cq3cq3lviclhi4.R.globalSliceStart(getClass().getName(),16594);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2b9h4k4csy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2cq3cq3lviclhi4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2cq3cq3lviclhi4.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.OWLOntologyManager_Concurrent_TestCase.shouldCall_createOntology_with_writeLock_5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16594,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2b9h4k4csy() throws OWLOntologyCreationException{try{__CLR4_5_2cq3cq3lviclhi4.R.inc(16594);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16595);manager.createOntology();
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16596);verifyWriteLock_LockUnlock();
    }finally{__CLR4_5_2cq3cq3lviclhi4.R.flushNeeded();}}

    @Test
    public void shouldCall_createOntology_with_writeLock_6() throws OWLOntologyCreationException {__CLR4_5_2cq3cq3lviclhi4.R.globalSliceStart(getClass().getName(),16597);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2eih3clct1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2cq3cq3lviclhi4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2cq3cq3lviclhi4.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.OWLOntologyManager_Concurrent_TestCase.shouldCall_createOntology_with_writeLock_6",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16597,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2eih3clct1() throws OWLOntologyCreationException{try{__CLR4_5_2cq3cq3lviclhi4.R.inc(16597);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16598);Set<OWLAxiom> arg0 = Collections.singleton(mock(OWLAxiom.class));
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16599);manager.createOntology(arg0);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16600);verifyWriteLock_LockUnlock();
    }finally{__CLR4_5_2cq3cq3lviclhi4.R.flushNeeded();}}

    @Test
    public void shouldCall_createOntology_with_writeLock_7() throws OWLOntologyCreationException {__CLR4_5_2cq3cq3lviclhi4.R.globalSliceStart(getClass().getName(),16601);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hrh252ct5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2cq3cq3lviclhi4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2cq3cq3lviclhi4.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.OWLOntologyManager_Concurrent_TestCase.shouldCall_createOntology_with_writeLock_7",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16601,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hrh252ct5() throws OWLOntologyCreationException{try{__CLR4_5_2cq3cq3lviclhi4.R.inc(16601);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16602);Set<OWLAxiom> arg0 = Collections.emptySet();
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16603);IRI arg1 = mockIRI();
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16604);manager.createOntology(arg0, arg1);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16605);verifyWriteLock_LockUnlock();
    }finally{__CLR4_5_2cq3cq3lviclhi4.R.flushNeeded();}}

    @Test
    public void shouldCall_loadOntology_with_writeLock() throws OWLOntologyCreationException {__CLR4_5_2cq3cq3lviclhi4.R.globalSliceStart(getClass().getName(),16606);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ivdydocta();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2cq3cq3lviclhi4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2cq3cq3lviclhi4.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.OWLOntologyManager_Concurrent_TestCase.shouldCall_loadOntology_with_writeLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16606,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ivdydocta() throws OWLOntologyCreationException{try{__CLR4_5_2cq3cq3lviclhi4.R.inc(16606);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16607);IRI arg0 = mockIRI();
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16608);manager.loadOntology(arg0);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16609);verifyWriteLock_LockUnlock();
    }finally{__CLR4_5_2cq3cq3lviclhi4.R.flushNeeded();}}

    @Test
    public void shouldCall_loadOntologyFromOntologyDocument_with_writeLock() throws OWLOntologyCreationException {__CLR4_5_2cq3cq3lviclhi4.R.globalSliceStart(getClass().getName(),16610);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qle3i8cte();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2cq3cq3lviclhi4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2cq3cq3lviclhi4.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.OWLOntologyManager_Concurrent_TestCase.shouldCall_loadOntologyFromOntologyDocument_with_writeLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16610,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qle3i8cte() throws OWLOntologyCreationException{try{__CLR4_5_2cq3cq3lviclhi4.R.inc(16610);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16611);OWLOntologyDocumentSource arg0 = mock(OWLOntologyDocumentSource.class);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16612);when(arg0.getDocumentIRI()).thenReturn(IRI.create("http://owlapi/ontdoc"));
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16613);OWLOntologyLoaderConfiguration arg1 = mock(OWLOntologyLoaderConfiguration.class);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16614);manager.loadOntologyFromOntologyDocument(arg0, arg1);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16615);verifyWriteLock_LockUnlock();
    }finally{__CLR4_5_2cq3cq3lviclhi4.R.flushNeeded();}}

    @Test
    public void shouldCall_loadOntologyFromOntologyDocument_with_writeLock_2() throws OWLOntologyCreationException {__CLR4_5_2cq3cq3lviclhi4.R.globalSliceStart(getClass().getName(),16616);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lj0es3ctk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2cq3cq3lviclhi4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2cq3cq3lviclhi4.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.OWLOntologyManager_Concurrent_TestCase.shouldCall_loadOntologyFromOntologyDocument_with_writeLock_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16616,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lj0es3ctk() throws OWLOntologyCreationException{try{__CLR4_5_2cq3cq3lviclhi4.R.inc(16616);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16617);OWLOntologyDocumentSource arg0 = mock(OWLOntologyDocumentSource.class);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16618);when(arg0.getDocumentIRI()).thenReturn(IRI.create("http://owlapi/ontdoc"));
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16619);manager.loadOntologyFromOntologyDocument(arg0);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16620);verifyWriteLock_LockUnlock();
    }finally{__CLR4_5_2cq3cq3lviclhi4.R.flushNeeded();}}

    @Test
    public void shouldCall_loadOntologyFromOntologyDocument_with_writeLock_3() throws OWLOntologyCreationException {__CLR4_5_2cq3cq3lviclhi4.R.globalSliceStart(getClass().getName(),16621);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2os0dkkctp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2cq3cq3lviclhi4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2cq3cq3lviclhi4.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.OWLOntologyManager_Concurrent_TestCase.shouldCall_loadOntologyFromOntologyDocument_with_writeLock_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16621,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2os0dkkctp() throws OWLOntologyCreationException{try{__CLR4_5_2cq3cq3lviclhi4.R.inc(16621);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16622);InputStream arg0 = mock(InputStream.class);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16623);manager.loadOntologyFromOntologyDocument(arg0);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16624);verifyWriteLock_LockUnlock();
    }finally{__CLR4_5_2cq3cq3lviclhi4.R.flushNeeded();}}

    @Test
    public void shouldCall_loadOntologyFromOntologyDocument_with_writeLock_4() throws OWLOntologyCreationException {__CLR4_5_2cq3cq3lviclhi4.R.globalSliceStart(getClass().getName(),16625);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s10cd1ctt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2cq3cq3lviclhi4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2cq3cq3lviclhi4.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.OWLOntologyManager_Concurrent_TestCase.shouldCall_loadOntologyFromOntologyDocument_with_writeLock_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16625,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s10cd1ctt() throws OWLOntologyCreationException{try{__CLR4_5_2cq3cq3lviclhi4.R.inc(16625);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16626);OWLOntologyDocumentSource source = mock(OWLOntologyDocumentSource.class);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16627);when(source.getDocumentIRI()).thenReturn(IRI.create("http://owlapi/ontdoc"));
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16628);manager.loadOntologyFromOntologyDocument(source);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16629);verifyWriteLock_LockUnlock();
    }finally{__CLR4_5_2cq3cq3lviclhi4.R.flushNeeded();}}

    private void verifyWriteLock_LockUnlock() {try{__CLR4_5_2cq3cq3lviclhi4.R.inc(16630);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16631);InOrder inOrder = Mockito.inOrder(writeLock, writeLock);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16632);inOrder.verify(writeLock, atLeastOnce()).lock();
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16633);inOrder.verify(writeLock, atLeastOnce()).unlock();
    }finally{__CLR4_5_2cq3cq3lviclhi4.R.flushNeeded();}}

    @Test
    public void shouldCall_loadOntologyFromOntologyDocument_with_writeLock_5() throws OWLOntologyCreationException {__CLR4_5_2cq3cq3lviclhi4.R.globalSliceStart(getClass().getName(),16634);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2va0b5icu2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2cq3cq3lviclhi4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2cq3cq3lviclhi4.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.OWLOntologyManager_Concurrent_TestCase.shouldCall_loadOntologyFromOntologyDocument_with_writeLock_5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16634,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2va0b5icu2() throws OWLOntologyCreationException{try{__CLR4_5_2cq3cq3lviclhi4.R.inc(16634);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16635);IRI arg0 = mockIRI();
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16636);manager.loadOntologyFromOntologyDocument(arg0);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16637);verifyWriteLock_LockUnlock();
    }finally{__CLR4_5_2cq3cq3lviclhi4.R.flushNeeded();}}

    @Test
    public void shouldCall_removeOntology_with_writeLock() {__CLR4_5_2cq3cq3lviclhi4.R.globalSliceStart(getClass().getName(),16638);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mm8tpmcu6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2cq3cq3lviclhi4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2cq3cq3lviclhi4.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.OWLOntologyManager_Concurrent_TestCase.shouldCall_removeOntology_with_writeLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16638,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mm8tpmcu6(){try{__CLR4_5_2cq3cq3lviclhi4.R.inc(16638);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16639);OWLOntologyID arg0 = mock(OWLOntologyID.class);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16640);manager.removeOntology(arg0);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16641);verifyWriteLock_LockUnlock();
    }finally{__CLR4_5_2cq3cq3lviclhi4.R.flushNeeded();}}

    @Test
    public void shouldCall_removeOntology_with_writeLock_2() {__CLR4_5_2cq3cq3lviclhi4.R.globalSliceStart(getClass().getName(),16642);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_272nwvdcua();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2cq3cq3lviclhi4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2cq3cq3lviclhi4.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.OWLOntologyManager_Concurrent_TestCase.shouldCall_removeOntology_with_writeLock_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16642,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_272nwvdcua(){try{__CLR4_5_2cq3cq3lviclhi4.R.inc(16642);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16643);manager.removeOntology(ontology);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16644);verifyWriteLock_LockUnlock();
    }finally{__CLR4_5_2cq3cq3lviclhi4.R.flushNeeded();}}

    @Test
    public void shouldCall_getOntologyDocumentIRI_with_readLock() {__CLR4_5_2cq3cq3lviclhi4.R.globalSliceStart(getClass().getName(),16645);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2q5109ccud();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2cq3cq3lviclhi4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2cq3cq3lviclhi4.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.OWLOntologyManager_Concurrent_TestCase.shouldCall_getOntologyDocumentIRI_with_readLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16645,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2q5109ccud(){try{__CLR4_5_2cq3cq3lviclhi4.R.inc(16645);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16646);manager.getOntologyDocumentIRI(ontology);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16647);verifyReadLock_LockUnlock();
    }finally{__CLR4_5_2cq3cq3lviclhi4.R.flushNeeded();}}

    @Test
    public void shouldCall_setOntologyDocumentIRI_with_writeLock() {__CLR4_5_2cq3cq3lviclhi4.R.globalSliceStart(getClass().getName(),16648);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2p02qqdcug();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2cq3cq3lviclhi4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2cq3cq3lviclhi4.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.OWLOntologyManager_Concurrent_TestCase.shouldCall_setOntologyDocumentIRI_with_writeLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16648,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2p02qqdcug(){try{__CLR4_5_2cq3cq3lviclhi4.R.inc(16648);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16649);IRI arg1 = mockIRI();
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16650);manager.setOntologyDocumentIRI(ontology, arg1);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16651);verifyWriteLock_LockUnlock();
    }finally{__CLR4_5_2cq3cq3lviclhi4.R.flushNeeded();}}

    @Test
    public void shouldCall_getOntologyFormat_with_readLock() {__CLR4_5_2cq3cq3lviclhi4.R.globalSliceStart(getClass().getName(),16652);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2oyfhu8cuk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2cq3cq3lviclhi4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2cq3cq3lviclhi4.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.OWLOntologyManager_Concurrent_TestCase.shouldCall_getOntologyFormat_with_readLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16652,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2oyfhu8cuk(){try{__CLR4_5_2cq3cq3lviclhi4.R.inc(16652);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16653);manager.getOntologyFormat(ontology);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16654);verifyReadLock_LockUnlock();
    }finally{__CLR4_5_2cq3cq3lviclhi4.R.flushNeeded();}}

    @Test
    public void shouldCall_setOntologyFormat_with_writeLock() {__CLR4_5_2cq3cq3lviclhi4.R.globalSliceStart(getClass().getName(),16655);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_223uf5vcun();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2cq3cq3lviclhi4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2cq3cq3lviclhi4.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.OWLOntologyManager_Concurrent_TestCase.shouldCall_setOntologyFormat_with_writeLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16655,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_223uf5vcun(){try{__CLR4_5_2cq3cq3lviclhi4.R.inc(16655);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16656);OWLDocumentFormat arg1 = mock(OWLDocumentFormat.class);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16657);manager.setOntologyFormat(ontology, arg1);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16658);verifyWriteLock_LockUnlock();
    }finally{__CLR4_5_2cq3cq3lviclhi4.R.flushNeeded();}}

    @Test
    public void shouldCall_saveOntology_with_writeLock() throws OWLOntologyStorageException {__CLR4_5_2cq3cq3lviclhi4.R.globalSliceStart(getClass().getName(),16659);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n4ga1vcur();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2cq3cq3lviclhi4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2cq3cq3lviclhi4.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.OWLOntologyManager_Concurrent_TestCase.shouldCall_saveOntology_with_writeLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16659,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n4ga1vcur() throws OWLOntologyStorageException{try{__CLR4_5_2cq3cq3lviclhi4.R.inc(16659);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16660);OWLDocumentFormat arg1 = mock(OWLDocumentFormat.class);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16661);IRI arg2 = mockIRI();
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16662);manager.saveOntology(ontology, arg1, arg2);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16663);verifyReadLock_LockUnlock();
    }finally{__CLR4_5_2cq3cq3lviclhi4.R.flushNeeded();}}

    @Test
    public void shouldCall_saveOntology_with_readLock_2() throws OWLOntologyStorageException {__CLR4_5_2cq3cq3lviclhi4.R.globalSliceStart(getClass().getName(),16664);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2431d5dcuw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2cq3cq3lviclhi4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2cq3cq3lviclhi4.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.OWLOntologyManager_Concurrent_TestCase.shouldCall_saveOntology_with_readLock_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16664,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2431d5dcuw() throws OWLOntologyStorageException{try{__CLR4_5_2cq3cq3lviclhi4.R.inc(16664);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16665);OWLDocumentFormat arg1 = mock(OWLDocumentFormat.class);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16666);OutputStream arg2 = mock(OutputStream.class);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16667);manager.saveOntology(ontology, arg1, arg2);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16668);verifyReadLock_LockUnlock();
    }finally{__CLR4_5_2cq3cq3lviclhi4.R.flushNeeded();}}

    @Test
    public void shouldCall_saveOntology_with_readLock_3() throws OWLOntologyStorageException {__CLR4_5_2cq3cq3lviclhi4.R.globalSliceStart(getClass().getName(),16669);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2u1ecwcv1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2cq3cq3lviclhi4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2cq3cq3lviclhi4.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.OWLOntologyManager_Concurrent_TestCase.shouldCall_saveOntology_with_readLock_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16669,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2u1ecwcv1() throws OWLOntologyStorageException{try{__CLR4_5_2cq3cq3lviclhi4.R.inc(16669);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16670);OWLOntologyDocumentTarget arg1 = mock(OWLOntologyDocumentTarget.class);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16671);manager.saveOntology(ontology, arg1);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16672);verifyReadLock_LockUnlock();
    }finally{__CLR4_5_2cq3cq3lviclhi4.R.flushNeeded();}}

    @Test
    public void shouldCall_saveOntology_with_readLock_4() throws OWLOntologyStorageException {__CLR4_5_2cq3cq3lviclhi4.R.globalSliceStart(getClass().getName(),16673);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22eykflcv5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2cq3cq3lviclhi4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2cq3cq3lviclhi4.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.OWLOntologyManager_Concurrent_TestCase.shouldCall_saveOntology_with_readLock_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16673,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22eykflcv5() throws OWLOntologyStorageException{try{__CLR4_5_2cq3cq3lviclhi4.R.inc(16673);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16674);OWLDocumentFormat arg1 = mock(OWLDocumentFormat.class);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16675);OWLOntologyDocumentTarget arg2 = mock(OWLOntologyDocumentTarget.class);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16676);manager.saveOntology(ontology, arg1, arg2);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16677);verifyReadLock_LockUnlock();
    }finally{__CLR4_5_2cq3cq3lviclhi4.R.flushNeeded();}}

    @Test
    public void shouldCall_saveOntology_with_readLock_5() throws OWLOntologyStorageException {__CLR4_5_2cq3cq3lviclhi4.R.globalSliceStart(getClass().getName(),16678);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25nyj82cva();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2cq3cq3lviclhi4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2cq3cq3lviclhi4.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.OWLOntologyManager_Concurrent_TestCase.shouldCall_saveOntology_with_readLock_5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16678,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25nyj82cva() throws OWLOntologyStorageException{try{__CLR4_5_2cq3cq3lviclhi4.R.inc(16678);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16679);manager.saveOntology(ontology);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16680);verifyReadLock_LockUnlock();
    }finally{__CLR4_5_2cq3cq3lviclhi4.R.flushNeeded();}}

    @Test
    public void shouldCall_saveOntology_with_readLock_6() throws OWLOntologyStorageException {__CLR4_5_2cq3cq3lviclhi4.R.globalSliceStart(getClass().getName(),16681);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28wyi0jcvd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2cq3cq3lviclhi4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2cq3cq3lviclhi4.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.OWLOntologyManager_Concurrent_TestCase.shouldCall_saveOntology_with_readLock_6",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16681,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28wyi0jcvd() throws OWLOntologyStorageException{try{__CLR4_5_2cq3cq3lviclhi4.R.inc(16681);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16682);IRI arg1 = mockIRI();
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16683);manager.saveOntology(ontology, arg1);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16684);verifyReadLock_LockUnlock();
    }finally{__CLR4_5_2cq3cq3lviclhi4.R.flushNeeded();}}

    @Test
    public void shouldCall_saveOntology_with_readLock_7() throws OWLOntologyStorageException {__CLR4_5_2cq3cq3lviclhi4.R.globalSliceStart(getClass().getName(),16685);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2c5ygt0cvh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2cq3cq3lviclhi4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2cq3cq3lviclhi4.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.OWLOntologyManager_Concurrent_TestCase.shouldCall_saveOntology_with_readLock_7",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16685,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2c5ygt0cvh() throws OWLOntologyStorageException{try{__CLR4_5_2cq3cq3lviclhi4.R.inc(16685);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16686);OutputStream arg1 = mock(OutputStream.class);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16687);manager.saveOntology(ontology, arg1);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16688);verifyReadLock_LockUnlock();
    }finally{__CLR4_5_2cq3cq3lviclhi4.R.flushNeeded();}}

    @Test
    public void shouldCall_saveOntology_with_readLock_8() throws OWLOntologyStorageException {__CLR4_5_2cq3cq3lviclhi4.R.globalSliceStart(getClass().getName(),16689);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2feyflhcvl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2cq3cq3lviclhi4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2cq3cq3lviclhi4.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.OWLOntologyManager_Concurrent_TestCase.shouldCall_saveOntology_with_readLock_8",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16689,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2feyflhcvl() throws OWLOntologyStorageException{try{__CLR4_5_2cq3cq3lviclhi4.R.inc(16689);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16690);OWLDocumentFormat arg1 = mock(OWLDocumentFormat.class);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16691);manager.saveOntology(ontology, arg1);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16692);verifyReadLock_LockUnlock();
    }finally{__CLR4_5_2cq3cq3lviclhi4.R.flushNeeded();}}

    @Test
    public void shouldCall_addIRIMapper_with_writeLock() {__CLR4_5_2cq3cq3lviclhi4.R.globalSliceStart(getClass().getName(),16693);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29lge09cvp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2cq3cq3lviclhi4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2cq3cq3lviclhi4.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.OWLOntologyManager_Concurrent_TestCase.shouldCall_addIRIMapper_with_writeLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16693,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29lge09cvp(){try{__CLR4_5_2cq3cq3lviclhi4.R.inc(16693);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16694);OWLOntologyIRIMapper arg0 = mock(OWLOntologyIRIMapper.class);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16695);manager.addIRIMapper(arg0);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16696);verifyWriteLock_LockUnlock();
    }finally{__CLR4_5_2cq3cq3lviclhi4.R.flushNeeded();}}

    @Test
    public void shouldCall_removeIRIMapper_with_writeLock() {__CLR4_5_2cq3cq3lviclhi4.R.globalSliceStart(getClass().getName(),16697);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2um62fccvt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2cq3cq3lviclhi4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2cq3cq3lviclhi4.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.OWLOntologyManager_Concurrent_TestCase.shouldCall_removeIRIMapper_with_writeLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16697,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2um62fccvt(){try{__CLR4_5_2cq3cq3lviclhi4.R.inc(16697);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16698);OWLOntologyIRIMapper arg0 = mock(OWLOntologyIRIMapper.class);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16699);manager.removeIRIMapper(arg0);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16700);verifyWriteLock_LockUnlock();
    }finally{__CLR4_5_2cq3cq3lviclhi4.R.flushNeeded();}}

    @Test
    public void shouldCall_clearIRIMappers_with_writeLock() {__CLR4_5_2cq3cq3lviclhi4.R.globalSliceStart(getClass().getName(),16701);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2g5zfxicvx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2cq3cq3lviclhi4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2cq3cq3lviclhi4.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.OWLOntologyManager_Concurrent_TestCase.shouldCall_clearIRIMappers_with_writeLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16701,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2g5zfxicvx(){try{__CLR4_5_2cq3cq3lviclhi4.R.inc(16701);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16702);manager.clearIRIMappers();
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16703);verifyWriteLock_LockUnlock();
    }finally{__CLR4_5_2cq3cq3lviclhi4.R.flushNeeded();}}

    @Test
    public void shouldCall_addOntologyStorer_with_writeLock() {__CLR4_5_2cq3cq3lviclhi4.R.globalSliceStart(getClass().getName(),16704);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qj9ptocw0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2cq3cq3lviclhi4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2cq3cq3lviclhi4.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.OWLOntologyManager_Concurrent_TestCase.shouldCall_addOntologyStorer_with_writeLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16704,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qj9ptocw0(){try{__CLR4_5_2cq3cq3lviclhi4.R.inc(16704);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16705);OWLStorerFactory arg0 = mock(OWLStorerFactory.class);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16706);manager.addOntologyStorer(arg0);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16707);verifyWriteLock_LockUnlock();
    }finally{__CLR4_5_2cq3cq3lviclhi4.R.flushNeeded();}}

    @Test
    public void shouldCall_removeOntologyStorer_with_writeLock() {__CLR4_5_2cq3cq3lviclhi4.R.globalSliceStart(getClass().getName(),16708);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27rqhdxcw4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2cq3cq3lviclhi4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2cq3cq3lviclhi4.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.OWLOntologyManager_Concurrent_TestCase.shouldCall_removeOntologyStorer_with_writeLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16708,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27rqhdxcw4(){try{__CLR4_5_2cq3cq3lviclhi4.R.inc(16708);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16709);OWLStorerFactory arg0 = mock(OWLStorerFactory.class);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16710);manager.removeOntologyStorer(arg0);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16711);verifyWriteLock_LockUnlock();
    }finally{__CLR4_5_2cq3cq3lviclhi4.R.flushNeeded();}}

    @Test
    public void shouldCall_clearOntologyStorers_with_writeLock() {__CLR4_5_2cq3cq3lviclhi4.R.globalSliceStart(getClass().getName(),16712);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nfrstcw8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2cq3cq3lviclhi4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2cq3cq3lviclhi4.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.OWLOntologyManager_Concurrent_TestCase.shouldCall_clearOntologyStorers_with_writeLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16712,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nfrstcw8(){try{__CLR4_5_2cq3cq3lviclhi4.R.inc(16712);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16713);manager.clearOntologyStorers();
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16714);verifyWriteLock_LockUnlock();
    }finally{__CLR4_5_2cq3cq3lviclhi4.R.flushNeeded();}}

    @Test
    public void shouldCall_setIRIMappers_with_writeLock() {__CLR4_5_2cq3cq3lviclhi4.R.globalSliceStart(getClass().getName(),16715);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2l8wx01cwb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2cq3cq3lviclhi4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2cq3cq3lviclhi4.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.OWLOntologyManager_Concurrent_TestCase.shouldCall_setIRIMappers_with_writeLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16715,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2l8wx01cwb(){try{__CLR4_5_2cq3cq3lviclhi4.R.inc(16715);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16716);Set<OWLOntologyIRIMapper> arg0 = Sets.newHashSet();
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16717);manager.setIRIMappers(arg0);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16718);verifyWriteLock_LockUnlock();
    }finally{__CLR4_5_2cq3cq3lviclhi4.R.flushNeeded();}}

    @Test
    public void shouldCall_getIRIMappers_with_readLock() {__CLR4_5_2cq3cq3lviclhi4.R.globalSliceStart(getClass().getName(),16719);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_241q0pocwf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2cq3cq3lviclhi4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2cq3cq3lviclhi4.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.OWLOntologyManager_Concurrent_TestCase.shouldCall_getIRIMappers_with_readLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16719,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_241q0pocwf(){try{__CLR4_5_2cq3cq3lviclhi4.R.inc(16719);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16720);manager.getIRIMappers().iterator();
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16721);verifyReadLock_LockUnlock();
    }finally{__CLR4_5_2cq3cq3lviclhi4.R.flushNeeded();}}

    @Test
    public void shouldAddIRIMapper_with_writeLock() {__CLR4_5_2cq3cq3lviclhi4.R.globalSliceStart(getClass().getName(),16722);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2o2gyakcwi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2cq3cq3lviclhi4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2cq3cq3lviclhi4.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.OWLOntologyManager_Concurrent_TestCase.shouldAddIRIMapper_with_writeLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16722,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2o2gyakcwi(){try{__CLR4_5_2cq3cq3lviclhi4.R.inc(16722);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16723);manager.getIRIMappers().add(mock(OWLOntologyIRIMapper.class));
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16724);verifyWriteLock_LockUnlock();
    }finally{__CLR4_5_2cq3cq3lviclhi4.R.flushNeeded();}}

    @Test
    public void shouldRemoveIRIMapper_with_writeLock() {__CLR4_5_2cq3cq3lviclhi4.R.globalSliceStart(getClass().getName(),16725);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dfb1wtcwl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2cq3cq3lviclhi4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2cq3cq3lviclhi4.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.OWLOntologyManager_Concurrent_TestCase.shouldRemoveIRIMapper_with_writeLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16725,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dfb1wtcwl(){try{__CLR4_5_2cq3cq3lviclhi4.R.inc(16725);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16726);manager.getIRIMappers().remove(mock(OWLOntologyIRIMapper.class));
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16727);verifyWriteLock_LockUnlock();
    }finally{__CLR4_5_2cq3cq3lviclhi4.R.flushNeeded();}}

    @Test
    public void shouldCall_setOntologyParsers_with_writeLock() {__CLR4_5_2cq3cq3lviclhi4.R.globalSliceStart(getClass().getName(),16728);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ap1pbacwo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2cq3cq3lviclhi4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2cq3cq3lviclhi4.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.OWLOntologyManager_Concurrent_TestCase.shouldCall_setOntologyParsers_with_writeLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16728,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ap1pbacwo(){try{__CLR4_5_2cq3cq3lviclhi4.R.inc(16728);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16729);Set<OWLParserFactory> arg0 = Sets.newHashSet();
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16730);manager.setOntologyParsers(arg0);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16731);verifyWriteLock_LockUnlock();
    }finally{__CLR4_5_2cq3cq3lviclhi4.R.flushNeeded();}}

    @Test
    public void shouldCall_getOntologyParsers_with_readLock() {__CLR4_5_2cq3cq3lviclhi4.R.globalSliceStart(getClass().getName(),16732);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n0g8n3cws();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2cq3cq3lviclhi4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2cq3cq3lviclhi4.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.OWLOntologyManager_Concurrent_TestCase.shouldCall_getOntologyParsers_with_readLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16732,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n0g8n3cws(){try{__CLR4_5_2cq3cq3lviclhi4.R.inc(16732);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16733);manager.getOntologyParsers().iterator();
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16734);verifyReadLock_LockUnlock();
    }finally{__CLR4_5_2cq3cq3lviclhi4.R.flushNeeded();}}

    @Test
    public void shouldAddOntologyParser_with_writeLock() {__CLR4_5_2cq3cq3lviclhi4.R.globalSliceStart(getClass().getName(),16735);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25hunlncwv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2cq3cq3lviclhi4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2cq3cq3lviclhi4.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.OWLOntologyManager_Concurrent_TestCase.shouldAddOntologyParser_with_writeLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16735,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25hunlncwv(){try{__CLR4_5_2cq3cq3lviclhi4.R.inc(16735);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16736);manager.getOntologyParsers().add(mock(OWLParserFactory.class));
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16737);verifyWriteLock_LockUnlock();
    }finally{__CLR4_5_2cq3cq3lviclhi4.R.flushNeeded();}}

    @Test
    public void shouldRemoveOntologyParser_with_writeLock() {__CLR4_5_2cq3cq3lviclhi4.R.globalSliceStart(getClass().getName(),16738);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23608z2cwy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2cq3cq3lviclhi4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2cq3cq3lviclhi4.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.OWLOntologyManager_Concurrent_TestCase.shouldRemoveOntologyParser_with_writeLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16738,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23608z2cwy(){try{__CLR4_5_2cq3cq3lviclhi4.R.inc(16738);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16739);manager.getOntologyParsers().remove(mock(OWLParserFactory.class));
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16740);verifyWriteLock_LockUnlock();
    }finally{__CLR4_5_2cq3cq3lviclhi4.R.flushNeeded();}}

    @Test
    public void shouldCall_setOntologyFactories_with_writeLock() {__CLR4_5_2cq3cq3lviclhi4.R.globalSliceStart(getClass().getName(),16741);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2u0tzdacx1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2cq3cq3lviclhi4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2cq3cq3lviclhi4.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.OWLOntologyManager_Concurrent_TestCase.shouldCall_setOntologyFactories_with_writeLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16741,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2u0tzdacx1(){try{__CLR4_5_2cq3cq3lviclhi4.R.inc(16741);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16742);Set<OWLOntologyFactory> arg0 = Sets.newHashSet();
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16743);manager.setOntologyFactories(arg0);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16744);verifyWriteLock_LockUnlock();
    }finally{__CLR4_5_2cq3cq3lviclhi4.R.flushNeeded();}}

    @Test
    public void shouldCall_getOntologyFactories_with_readLock() {__CLR4_5_2cq3cq3lviclhi4.R.globalSliceStart(getClass().getName(),16745);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hqewb1cx5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2cq3cq3lviclhi4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2cq3cq3lviclhi4.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.OWLOntologyManager_Concurrent_TestCase.shouldCall_getOntologyFactories_with_readLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16745,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hqewb1cx5(){try{__CLR4_5_2cq3cq3lviclhi4.R.inc(16745);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16746);manager.getOntologyFactories().iterator();
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16747);verifyReadLock_LockUnlock();
    }finally{__CLR4_5_2cq3cq3lviclhi4.R.flushNeeded();}}

    @Test
    public void shouldCall_setOntologyStorers_with_writeLock() {__CLR4_5_2cq3cq3lviclhi4.R.globalSliceStart(getClass().getName(),16748);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jwrmigcx8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2cq3cq3lviclhi4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2cq3cq3lviclhi4.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.OWLOntologyManager_Concurrent_TestCase.shouldCall_setOntologyStorers_with_writeLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16748,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jwrmigcx8(){try{__CLR4_5_2cq3cq3lviclhi4.R.inc(16748);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16749);Set<OWLStorerFactory> arg0 = Sets.newHashSet();
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16750);manager.setOntologyStorers(arg0);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16751);verifyWriteLock_LockUnlock();
    }finally{__CLR4_5_2cq3cq3lviclhi4.R.flushNeeded();}}

    @Test
    public void shouldCall_getOntologyStorers_with_readLock() {__CLR4_5_2cq3cq3lviclhi4.R.globalSliceStart(getClass().getName(),16752);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2l0nwvhcxc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2cq3cq3lviclhi4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2cq3cq3lviclhi4.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.OWLOntologyManager_Concurrent_TestCase.shouldCall_getOntologyStorers_with_readLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16752,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2l0nwvhcxc(){try{__CLR4_5_2cq3cq3lviclhi4.R.inc(16752);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16753);manager.getOntologyStorers().iterator();
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16754);verifyReadLock_LockUnlock();
    }finally{__CLR4_5_2cq3cq3lviclhi4.R.flushNeeded();}}

    @Test
    public void shouldCall_addOntologyChangeListener_with_writeLock() {__CLR4_5_2cq3cq3lviclhi4.R.globalSliceStart(getClass().getName(),16755);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25kwf1tcxf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2cq3cq3lviclhi4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2cq3cq3lviclhi4.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.OWLOntologyManager_Concurrent_TestCase.shouldCall_addOntologyChangeListener_with_writeLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16755,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25kwf1tcxf(){try{__CLR4_5_2cq3cq3lviclhi4.R.inc(16755);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16756);OWLOntologyChangeListener arg0 = mock(OWLOntologyChangeListener.class);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16757);OWLOntologyChangeBroadcastStrategy arg1 = mock(OWLOntologyChangeBroadcastStrategy.class);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16758);manager.addOntologyChangeListener(arg0, arg1);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16759);verifyWriteLock_LockUnlock();
    }finally{__CLR4_5_2cq3cq3lviclhi4.R.flushNeeded();}}

    @Test
    public void shouldCall_addImpendingOntologyChangeListener_with_writeLock() {__CLR4_5_2cq3cq3lviclhi4.R.globalSliceStart(getClass().getName(),16760);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2i6k1ekcxk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2cq3cq3lviclhi4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2cq3cq3lviclhi4.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.OWLOntologyManager_Concurrent_TestCase.shouldCall_addImpendingOntologyChangeListener_with_writeLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16760,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2i6k1ekcxk(){try{__CLR4_5_2cq3cq3lviclhi4.R.inc(16760);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16761);ImpendingOWLOntologyChangeListener arg0 = mock(ImpendingOWLOntologyChangeListener.class);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16762);manager.addImpendingOntologyChangeListener(arg0);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16763);verifyWriteLock_LockUnlock();
    }finally{__CLR4_5_2cq3cq3lviclhi4.R.flushNeeded();}}

    @Test
    public void shouldCall_removeImpendingOntologyChangeListener_with_writeLock() {__CLR4_5_2cq3cq3lviclhi4.R.globalSliceStart(getClass().getName(),16764);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2d7q8hvcxo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2cq3cq3lviclhi4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2cq3cq3lviclhi4.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.OWLOntologyManager_Concurrent_TestCase.shouldCall_removeImpendingOntologyChangeListener_with_writeLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16764,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2d7q8hvcxo(){try{__CLR4_5_2cq3cq3lviclhi4.R.inc(16764);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16765);ImpendingOWLOntologyChangeListener arg0 = mock(ImpendingOWLOntologyChangeListener.class);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16766);manager.removeImpendingOntologyChangeListener(arg0);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16767);verifyWriteLock_LockUnlock();
    }finally{__CLR4_5_2cq3cq3lviclhi4.R.flushNeeded();}}

    @Test
    public void shouldCall_addOntologyChangesVetoedListener_with_writeLock() {__CLR4_5_2cq3cq3lviclhi4.R.globalSliceStart(getClass().getName(),16768);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ure7g9cxs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2cq3cq3lviclhi4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2cq3cq3lviclhi4.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.OWLOntologyManager_Concurrent_TestCase.shouldCall_addOntologyChangesVetoedListener_with_writeLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16768,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ure7g9cxs(){try{__CLR4_5_2cq3cq3lviclhi4.R.inc(16768);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16769);OWLOntologyChangesVetoedListener arg0 = mock(OWLOntologyChangesVetoedListener.class);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16770);manager.addOntologyChangesVetoedListener(arg0);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16771);verifyWriteLock_LockUnlock();
    }finally{__CLR4_5_2cq3cq3lviclhi4.R.flushNeeded();}}

    @Test
    public void shouldCall_removeOntologyChangesVetoedListener_with_writeLock() {__CLR4_5_2cq3cq3lviclhi4.R.globalSliceStart(getClass().getName(),16772);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21avkbccxw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2cq3cq3lviclhi4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2cq3cq3lviclhi4.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.OWLOntologyManager_Concurrent_TestCase.shouldCall_removeOntologyChangesVetoedListener_with_writeLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16772,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21avkbccxw(){try{__CLR4_5_2cq3cq3lviclhi4.R.inc(16772);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16773);OWLOntologyChangesVetoedListener arg0 = mock(OWLOntologyChangesVetoedListener.class);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16774);manager.removeOntologyChangesVetoedListener(arg0);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16775);verifyWriteLock_LockUnlock();
    }finally{__CLR4_5_2cq3cq3lviclhi4.R.flushNeeded();}}

    @Test
    public void shouldCall_setDefaultChangeBroadcastStrategy_with_writeLock() {__CLR4_5_2cq3cq3lviclhi4.R.globalSliceStart(getClass().getName(),16776);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2behmu8cy0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2cq3cq3lviclhi4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2cq3cq3lviclhi4.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.OWLOntologyManager_Concurrent_TestCase.shouldCall_setDefaultChangeBroadcastStrategy_with_writeLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16776,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2behmu8cy0(){try{__CLR4_5_2cq3cq3lviclhi4.R.inc(16776);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16777);OWLOntologyChangeBroadcastStrategy arg0 = mock(OWLOntologyChangeBroadcastStrategy.class);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16778);manager.setDefaultChangeBroadcastStrategy(arg0);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16779);verifyWriteLock_LockUnlock();
    }finally{__CLR4_5_2cq3cq3lviclhi4.R.flushNeeded();}}

    @Test
    public void shouldCall_makeLoadImportRequest_with_writeLock() {__CLR4_5_2cq3cq3lviclhi4.R.globalSliceStart(getClass().getName(),16780);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vg3ycxcy4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2cq3cq3lviclhi4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2cq3cq3lviclhi4.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.OWLOntologyManager_Concurrent_TestCase.shouldCall_makeLoadImportRequest_with_writeLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16780,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vg3ycxcy4(){try{__CLR4_5_2cq3cq3lviclhi4.R.inc(16780);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16781);OWLImportsDeclaration arg0 = mock(OWLImportsDeclaration.class);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16782);when(arg0.getIRI()).thenReturn(IRI.create("http://owlapi/other"));
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16783);OWLOntologyLoaderConfiguration arg1 = mock(OWLOntologyLoaderConfiguration.class);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16784);manager.makeLoadImportRequest(arg0, arg1);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16785);verifyWriteLock_LockUnlock();
    }finally{__CLR4_5_2cq3cq3lviclhi4.R.flushNeeded();}}

    @Test
    public void shouldCall_makeLoadImportRequest_with_writeLock_2() {__CLR4_5_2cq3cq3lviclhi4.R.globalSliceStart(getClass().getName(),16786);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pgwm72cya();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2cq3cq3lviclhi4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2cq3cq3lviclhi4.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.OWLOntologyManager_Concurrent_TestCase.shouldCall_makeLoadImportRequest_with_writeLock_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16786,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pgwm72cya(){try{__CLR4_5_2cq3cq3lviclhi4.R.inc(16786);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16787);OWLImportsDeclaration arg0 = new OWLImportsDeclarationImpl(IRI.create("http://owlapi/otheront"));
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16788);manager.makeLoadImportRequest(arg0);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16789);verifyWriteLock_LockUnlock();
    }finally{__CLR4_5_2cq3cq3lviclhi4.R.flushNeeded();}}

    @Test
    public void shouldCall_addMissingImportListener_with_writeLock() {__CLR4_5_2cq3cq3lviclhi4.R.globalSliceStart(getClass().getName(),16790);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2zcm757cye();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2cq3cq3lviclhi4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2cq3cq3lviclhi4.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.OWLOntologyManager_Concurrent_TestCase.shouldCall_addMissingImportListener_with_writeLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16790,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2zcm757cye(){try{__CLR4_5_2cq3cq3lviclhi4.R.inc(16790);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16791);MissingImportListener arg0 = mock(MissingImportListener.class);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16792);manager.addMissingImportListener(arg0);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16793);verifyWriteLock_LockUnlock();
    }finally{__CLR4_5_2cq3cq3lviclhi4.R.flushNeeded();}}

    @Test
    public void shouldCall_removeMissingImportListener_with_writeLock() {__CLR4_5_2cq3cq3lviclhi4.R.globalSliceStart(getClass().getName(),16794);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nflat2cyi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2cq3cq3lviclhi4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2cq3cq3lviclhi4.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.OWLOntologyManager_Concurrent_TestCase.shouldCall_removeMissingImportListener_with_writeLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16794,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nflat2cyi(){try{__CLR4_5_2cq3cq3lviclhi4.R.inc(16794);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16795);MissingImportListener arg0 = mock(MissingImportListener.class);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16796);manager.removeMissingImportListener(arg0);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16797);verifyWriteLock_LockUnlock();
    }finally{__CLR4_5_2cq3cq3lviclhi4.R.flushNeeded();}}

    @Test
    public void shouldCall_addOntologyLoaderListener_with_writeLock() {__CLR4_5_2cq3cq3lviclhi4.R.globalSliceStart(getClass().getName(),16798);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fx568ecym();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2cq3cq3lviclhi4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2cq3cq3lviclhi4.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.OWLOntologyManager_Concurrent_TestCase.shouldCall_addOntologyLoaderListener_with_writeLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16798,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fx568ecym(){try{__CLR4_5_2cq3cq3lviclhi4.R.inc(16798);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16799);OWLOntologyLoaderListener arg0 = mock(OWLOntologyLoaderListener.class);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16800);manager.addOntologyLoaderListener(arg0);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16801);verifyWriteLock_LockUnlock();
    }finally{__CLR4_5_2cq3cq3lviclhi4.R.flushNeeded();}}

    @Test
    public void shouldCall_removeOntologyLoaderListener_with_writeLock() {__CLR4_5_2cq3cq3lviclhi4.R.globalSliceStart(getClass().getName(),16802);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ulhwvlcyq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2cq3cq3lviclhi4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2cq3cq3lviclhi4.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.OWLOntologyManager_Concurrent_TestCase.shouldCall_removeOntologyLoaderListener_with_writeLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16802,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ulhwvlcyq(){try{__CLR4_5_2cq3cq3lviclhi4.R.inc(16802);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16803);OWLOntologyLoaderListener arg0 = mock(OWLOntologyLoaderListener.class);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16804);manager.removeOntologyLoaderListener(arg0);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16805);verifyWriteLock_LockUnlock();
    }finally{__CLR4_5_2cq3cq3lviclhi4.R.flushNeeded();}}

    @Test
    public void shouldCall_addOntologyChangeProgessListener_with_writeLock() {__CLR4_5_2cq3cq3lviclhi4.R.globalSliceStart(getClass().getName(),16806);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kw3tticyu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2cq3cq3lviclhi4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2cq3cq3lviclhi4.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.OWLOntologyManager_Concurrent_TestCase.shouldCall_addOntologyChangeProgessListener_with_writeLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16806,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kw3tticyu(){try{__CLR4_5_2cq3cq3lviclhi4.R.inc(16806);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16807);OWLOntologyChangeProgressListener arg0 = mock(OWLOntologyChangeProgressListener.class);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16808);manager.addOntologyChangeProgessListener(arg0);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16809);verifyWriteLock_LockUnlock();
    }finally{__CLR4_5_2cq3cq3lviclhi4.R.flushNeeded();}}

    @Test
    public void shouldCall_removeOntologyChangeProgessListener_with_writeLock() {__CLR4_5_2cq3cq3lviclhi4.R.globalSliceStart(getClass().getName(),16810);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kohl0pcyy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2cq3cq3lviclhi4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2cq3cq3lviclhi4.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.OWLOntologyManager_Concurrent_TestCase.shouldCall_removeOntologyChangeProgessListener_with_writeLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16810,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kohl0pcyy(){try{__CLR4_5_2cq3cq3lviclhi4.R.inc(16810);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16811);OWLOntologyChangeProgressListener arg0 = mock(OWLOntologyChangeProgressListener.class);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16812);manager.removeOntologyChangeProgessListener(arg0);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16813);verifyWriteLock_LockUnlock();
    }finally{__CLR4_5_2cq3cq3lviclhi4.R.flushNeeded();}}

    @Test
    public void shouldCall_getOntologies_with_readLock_2() {__CLR4_5_2cq3cq3lviclhi4.R.globalSliceStart(getClass().getName(),16814);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hydzqicz2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2cq3cq3lviclhi4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2cq3cq3lviclhi4.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.OWLOntologyManager_Concurrent_TestCase.shouldCall_getOntologies_with_readLock_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16814,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hydzqicz2(){try{__CLR4_5_2cq3cq3lviclhi4.R.inc(16814);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16815);manager.getOntologies();
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16816);verifyReadLock_LockUnlock();
    }finally{__CLR4_5_2cq3cq3lviclhi4.R.flushNeeded();}}

    @Test
    public void shouldCall_applyChanges_with_writeLock() {__CLR4_5_2cq3cq3lviclhi4.R.globalSliceStart(getClass().getName(),16817);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kzfn9wcz5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2cq3cq3lviclhi4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2cq3cq3lviclhi4.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.OWLOntologyManager_Concurrent_TestCase.shouldCall_applyChanges_with_writeLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16817,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kzfn9wcz5(){try{__CLR4_5_2cq3cq3lviclhi4.R.inc(16817);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16818);List<OWLOntologyChange> arg0 = Lists.newArrayList();
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16819);manager.applyChanges(arg0);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16820);verifyWriteLock_LockUnlock();
    }finally{__CLR4_5_2cq3cq3lviclhi4.R.flushNeeded();}}

    @Test
    public void shouldCall_applyChange_with_writeLock() {__CLR4_5_2cq3cq3lviclhi4.R.globalSliceStart(getClass().getName(),16821);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pdxy6xcz9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2cq3cq3lviclhi4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2cq3cq3lviclhi4.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.OWLOntologyManager_Concurrent_TestCase.shouldCall_applyChange_with_writeLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16821,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pdxy6xcz9(){try{__CLR4_5_2cq3cq3lviclhi4.R.inc(16821);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16822);OWLAxiom ax = mock(OWLAxiom.class);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16823);OWLOntologyChange arg0 = new AddAxiom(ontology, ax);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16824);manager.applyChange(arg0);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16825);verifyWriteLock_LockUnlock();
    }finally{__CLR4_5_2cq3cq3lviclhi4.R.flushNeeded();}}

    @Test
    public void shouldCall_addAxioms_with_writeLock() {__CLR4_5_2cq3cq3lviclhi4.R.globalSliceStart(getClass().getName(),16826);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vr3tpbcze();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2cq3cq3lviclhi4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2cq3cq3lviclhi4.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.OWLOntologyManager_Concurrent_TestCase.shouldCall_addAxioms_with_writeLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16826,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vr3tpbcze(){try{__CLR4_5_2cq3cq3lviclhi4.R.inc(16826);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16827);OWLOntology arg0 = mock(OWLMutableOntology.class);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16828);Set<OWLAxiom> axioms = Sets.newHashSet(mock(OWLAxiom.class));
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16829);manager.addAxioms(arg0, axioms);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16830);verifyWriteLock_LockUnlock();
    }finally{__CLR4_5_2cq3cq3lviclhi4.R.flushNeeded();}}

    @Test
    public void shouldCall_addAxiom_with_writeLock() {__CLR4_5_2cq3cq3lviclhi4.R.globalSliceStart(getClass().getName(),16831);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hx8i86czj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2cq3cq3lviclhi4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2cq3cq3lviclhi4.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.OWLOntologyManager_Concurrent_TestCase.shouldCall_addAxiom_with_writeLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16831,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hx8i86czj(){try{__CLR4_5_2cq3cq3lviclhi4.R.inc(16831);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16832);OWLOntology arg0 = mock(OWLMutableOntology.class);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16833);OWLAxiom arg1 = mock(OWLAxiom.class);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16834);manager.addAxiom(arg0, arg1);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16835);verifyWriteLock_LockUnlock();
    }finally{__CLR4_5_2cq3cq3lviclhi4.R.flushNeeded();}}

    @Test
    public void shouldCall_removeAxioms_with_writeLock() {__CLR4_5_2cq3cq3lviclhi4.R.globalSliceStart(getClass().getName(),16836);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lecrj6czo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2cq3cq3lviclhi4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2cq3cq3lviclhi4.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.OWLOntologyManager_Concurrent_TestCase.shouldCall_removeAxioms_with_writeLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16836,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lecrj6czo(){try{__CLR4_5_2cq3cq3lviclhi4.R.inc(16836);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16837);Set<OWLAxiom> arg1 = Sets.newHashSet();
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16838);manager.removeAxioms(ontology, arg1);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16839);verifyWriteLock_LockUnlock();
    }finally{__CLR4_5_2cq3cq3lviclhi4.R.flushNeeded();}}

    @Test
    public void shouldCall_removeAxiom_with_writeLock() {__CLR4_5_2cq3cq3lviclhi4.R.globalSliceStart(getClass().getName(),16840);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24evj15czs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2cq3cq3lviclhi4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2cq3cq3lviclhi4.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.OWLOntologyManager_Concurrent_TestCase.shouldCall_removeAxiom_with_writeLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16840,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24evj15czs(){try{__CLR4_5_2cq3cq3lviclhi4.R.inc(16840);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16841);OWLOntology arg0 = mock(OWLMutableOntology.class);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16842);OWLAxiom arg1 = mock(OWLAxiom.class);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16843);manager.removeAxiom(arg0, arg1);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16844);verifyWriteLock_LockUnlock();
    }finally{__CLR4_5_2cq3cq3lviclhi4.R.flushNeeded();}}

    @Test
    public void shouldCall_addOntologyChangeListener_with_writeLock_2() {__CLR4_5_2cq3cq3lviclhi4.R.globalSliceStart(getClass().getName(),16845);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rze5toczx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2cq3cq3lviclhi4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2cq3cq3lviclhi4.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.OWLOntologyManager_Concurrent_TestCase.shouldCall_addOntologyChangeListener_with_writeLock_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16845,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rze5toczx(){try{__CLR4_5_2cq3cq3lviclhi4.R.inc(16845);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16846);OWLOntologyChangeListener arg0 = mock(OWLOntologyChangeListener.class);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16847);manager.addOntologyChangeListener(arg0);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16848);verifyWriteLock_LockUnlock();
    }finally{__CLR4_5_2cq3cq3lviclhi4.R.flushNeeded();}}

    @Test
    public void shouldCall_removeOntologyChangeListener_with_writeLock() {__CLR4_5_2cq3cq3lviclhi4.R.globalSliceStart(getClass().getName(),16849);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2u3ddwyd01();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2cq3cq3lviclhi4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2cq3cq3lviclhi4.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.OWLOntologyManager_Concurrent_TestCase.shouldCall_removeOntologyChangeListener_with_writeLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16849,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2u3ddwyd01(){try{__CLR4_5_2cq3cq3lviclhi4.R.inc(16849);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16850);OWLOntologyChangeListener arg0 = mock(OWLOntologyChangeListener.class);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16851);manager.removeOntologyChangeListener(arg0);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16852);verifyWriteLock_LockUnlock();
    }finally{__CLR4_5_2cq3cq3lviclhi4.R.flushNeeded();}}

    @Test
    public void shouldCall_setOntologyLoaderConfigurationProvider_with_writeLock() {__CLR4_5_2cq3cq3lviclhi4.R.globalSliceStart(getClass().getName(),16853);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qzbjiyd05();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2cq3cq3lviclhi4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2cq3cq3lviclhi4.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.OWLOntologyManager_Concurrent_TestCase.shouldCall_setOntologyLoaderConfigurationProvider_with_writeLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16853,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qzbjiyd05(){try{__CLR4_5_2cq3cq3lviclhi4.R.inc(16853);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16854);Provider<OWLOntologyLoaderConfiguration> arg0 = mock(Provider.class);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16855);manager.setOntologyLoaderConfigurationProvider(arg0);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16856);verifyWriteLock_LockUnlock();
    }finally{__CLR4_5_2cq3cq3lviclhi4.R.flushNeeded();}}

    @Test
    public void shouldCall_setOntologyLoaderConfiguration_with_writeLock() {__CLR4_5_2cq3cq3lviclhi4.R.globalSliceStart(getClass().getName(),16857);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hf0kndd09();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2cq3cq3lviclhi4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2cq3cq3lviclhi4.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.OWLOntologyManager_Concurrent_TestCase.shouldCall_setOntologyLoaderConfiguration_with_writeLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16857,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hf0kndd09(){try{__CLR4_5_2cq3cq3lviclhi4.R.inc(16857);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16858);OWLOntologyLoaderConfiguration arg0 = mock(OWLOntologyLoaderConfiguration.class);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16859);manager.setOntologyLoaderConfiguration(arg0);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16860);verifyWriteLock_LockUnlock();
    }finally{__CLR4_5_2cq3cq3lviclhi4.R.flushNeeded();}}

    @Test
    public void shouldCall_getOntologyLoaderConfiguration_with_readLock() {__CLR4_5_2cq3cq3lviclhi4.R.globalSliceStart(getClass().getName(),16861);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2x614z6d0d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2cq3cq3lviclhi4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2cq3cq3lviclhi4.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.concurrent.OWLOntologyManager_Concurrent_TestCase.shouldCall_getOntologyLoaderConfiguration_with_readLock",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16861,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2x614z6d0d(){try{__CLR4_5_2cq3cq3lviclhi4.R.inc(16861);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16862);manager.getOntologyLoaderConfiguration();
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16863);verifyReadLock_LockUnlock();
    }finally{__CLR4_5_2cq3cq3lviclhi4.R.flushNeeded();}}

    private void verifyReadLock_LockUnlock() {try{__CLR4_5_2cq3cq3lviclhi4.R.inc(16864);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16865);InOrder inOrder = Mockito.inOrder(readLock, readLock);
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16866);inOrder.verify(readLock, atLeastOnce()).lock();
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16867);inOrder.verify(readLock, atLeastOnce()).unlock();
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16868);verify(writeLock, never()).lock();
        __CLR4_5_2cq3cq3lviclhi4.R.inc(16869);verify(writeLock, never()).unlock();
    }finally{__CLR4_5_2cq3cq3lviclhi4.R.flushNeeded();}}
}
