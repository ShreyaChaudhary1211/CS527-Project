/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.semanticweb.owlapi.api.test.imports;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.semanticweb.owlapi.api.test.baseclasses.TestBase;
import org.semanticweb.owlapi.model.AddImport;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLOntology;

import uk.ac.manchester.cs.owl.owlapi.OWLImportsDeclarationImpl;

/**
 * Matthew Horridge Stanford Center for Biomedical Informatics Research 10 Jul
 * 16
 */
public class ImportsCacheTestCase extends TestBase {static class __CLR4_5_25wu5wulvico0re{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,7677,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private OWLOntology ontA;
    private OWLOntology ontB;
    private IRI ontBDocIri;
    private OWLImportsDeclarationImpl ontBDocumentIriImportsDeclaration;

    @SuppressWarnings("javadoc")
    @Before
    public void setUpOntologies() throws Exception {try{__CLR4_5_25wu5wulvico0re.R.inc(7662);
        __CLR4_5_25wu5wulvico0re.R.inc(7663);ontA = m.createOntology(IRI.create("http://ont.com/ontA"));
        __CLR4_5_25wu5wulvico0re.R.inc(7664);ontB = m.createOntology(IRI.create("http://ont.com/ontB"));
        __CLR4_5_25wu5wulvico0re.R.inc(7665);ontBDocIri = IRI.create("http://docs.ont.com/ontB");
        __CLR4_5_25wu5wulvico0re.R.inc(7666);ontBDocumentIriImportsDeclaration = new OWLImportsDeclarationImpl(ontBDocIri);
    }finally{__CLR4_5_25wu5wulvico0re.R.flushNeeded();}}

    /**
     * Retrieves the imports closure of ontA, where ontA imports ontB via its
     * documentIRI. The document IRI is set BEFORE adding the imports
     * declaration.
     */
    @Test
    public void shouldRetrieveImportsClosureByDocumentIri() {__CLR4_5_25wu5wulvico0re.R.globalSliceStart(getClass().getName(),7667);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kckr2f5wz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_25wu5wulvico0re.R.rethrow($CLV_t2$);}finally{__CLR4_5_25wu5wulvico0re.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.imports.ImportsCacheTestCase.shouldRetrieveImportsClosureByDocumentIri",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),7667,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kckr2f5wz(){try{__CLR4_5_25wu5wulvico0re.R.inc(7667);
        // Update the document IRI for ontB BEFORE we add the import
        __CLR4_5_25wu5wulvico0re.R.inc(7668);m.setOntologyDocumentIRI(ontB, ontBDocIri);
        // OntA imports OntB by a document IRI rather than its ontology IRI
        __CLR4_5_25wu5wulvico0re.R.inc(7669);m.applyChange(new AddImport(ontA, ontBDocumentIriImportsDeclaration));
        __CLR4_5_25wu5wulvico0re.R.inc(7670);assertTrue(ontA.getImportsClosure().contains(ontA));
        __CLR4_5_25wu5wulvico0re.R.inc(7671);assertTrue(ontA.getImportsClosure().contains(ontB));
    }finally{__CLR4_5_25wu5wulvico0re.R.flushNeeded();}}

    /**
     * Retrieves the imports closure of ontA, where ontA imports ontB via its
     * documentIRI. The document IRI is set AFTER adding the imports
     * declaration.
     */
    @Test
    public void shouldRetrieveImportsClosureByDocumentIriAfterDocumentIriChange() {__CLR4_5_25wu5wulvico0re.R.globalSliceStart(getClass().getName(),7672);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21zawr65x4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_25wu5wulvico0re.R.rethrow($CLV_t2$);}finally{__CLR4_5_25wu5wulvico0re.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.imports.ImportsCacheTestCase.shouldRetrieveImportsClosureByDocumentIriAfterDocumentIriChange",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),7672,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21zawr65x4(){try{__CLR4_5_25wu5wulvico0re.R.inc(7672);
        // OntA imports OntB by a document IRI rather than its ontology IRI
        __CLR4_5_25wu5wulvico0re.R.inc(7673);m.applyChange(new AddImport(ontA, ontBDocumentIriImportsDeclaration));
        // Update the document IRI for ontB (AFTER we haved added the import)
        __CLR4_5_25wu5wulvico0re.R.inc(7674);m.setOntologyDocumentIRI(ontB, ontBDocIri);
        __CLR4_5_25wu5wulvico0re.R.inc(7675);assertTrue(ontA.getImportsClosure().contains(ontA));
        __CLR4_5_25wu5wulvico0re.R.inc(7676);assertTrue(ontA.getImportsClosure().contains(ontB));
    }finally{__CLR4_5_25wu5wulvico0re.R.flushNeeded();}}
}
