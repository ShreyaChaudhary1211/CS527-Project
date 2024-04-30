/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.coode.owlapi.obo12;

import static org.junit.Assert.assertEquals;

import org.coode.owlapi.obo12.parser.OBO12DocumentFormat;
import org.junit.Test;
import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.io.OWLOntologyDocumentSource;
import org.semanticweb.owlapi.io.OWLOntologyDocumentSourceBase;
import org.semanticweb.owlapi.io.StreamDocumentSource;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.OWLOntologyManager;

@SuppressWarnings("javadoc")
public class LoadCellTestCase {static class __CLR4_5_2272272lvicnlj4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006d\u0070\u0061\u0074\u0069\u0062\u0069\u006c\u0069\u0074\u0079\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237345981L,8589935092L,2861,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void shouldParse() throws OWLOntologyCreationException {__CLR4_5_2272272lvicnlj4.R.globalSliceStart(getClass().getName(),2846);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2u1wfsp272();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2272272lvicnlj4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2272272lvicnlj4.R.globalSliceEnd(getClass().getName(),"org.coode.owlapi.obo12.LoadCellTestCase.shouldParse",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2846,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2u1wfsp272() throws OWLOntologyCreationException{try{__CLR4_5_2272272lvicnlj4.R.inc(2846);
        __CLR4_5_2272272lvicnlj4.R.inc(2847);OWLOntologyManager m = OWLManager.createOWLOntologyManager();
        __CLR4_5_2272272lvicnlj4.R.inc(2848);assertEquals(19, m.getOntologyParsers().size());
        __CLR4_5_2272272lvicnlj4.R.inc(2849);OWLOntologyDocumentSource source = new StreamDocumentSource(getClass().getResourceAsStream("/celltype.obo"),
            OWLOntologyDocumentSourceBase.getNextDocumentIRI("obo"), new OBO12DocumentFormat(), null);
        __CLR4_5_2272272lvicnlj4.R.inc(2850);m.loadOntologyFromOntologyDocument(source);
    }finally{__CLR4_5_2272272lvicnlj4.R.flushNeeded();}}

    @Test
    public void shouldParseOBO12() throws OWLOntologyCreationException {__CLR4_5_2272272lvicnlj4.R.globalSliceStart(getClass().getName(),2851);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hnbyn0277();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2272272lvicnlj4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2272272lvicnlj4.R.globalSliceEnd(getClass().getName(),"org.coode.owlapi.obo12.LoadCellTestCase.shouldParseOBO12",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2851,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hnbyn0277() throws OWLOntologyCreationException{try{__CLR4_5_2272272lvicnlj4.R.inc(2851);
        __CLR4_5_2272272lvicnlj4.R.inc(2852);OWLOntologyManager m = OWLManager.createOWLOntologyManager();
        __CLR4_5_2272272lvicnlj4.R.inc(2853);assertEquals(19, m.getOntologyParsers().size());
        __CLR4_5_2272272lvicnlj4.R.inc(2854);OWLOntologyDocumentSource source = new StreamDocumentSource(getClass().getResourceAsStream("/behavior.obo"),
            OWLOntologyDocumentSourceBase.getNextDocumentIRI("obo"), new OBO12DocumentFormat(), null);
        __CLR4_5_2272272lvicnlj4.R.inc(2855);m.loadOntologyFromOntologyDocument(source);
    }finally{__CLR4_5_2272272lvicnlj4.R.flushNeeded();}}

    @Test
    public void shouldParseGenericOBO() throws OWLOntologyCreationException {__CLR4_5_2272272lvicnlj4.R.globalSliceStart(getClass().getName(),2856);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21qoul027c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2272272lvicnlj4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2272272lvicnlj4.R.globalSliceEnd(getClass().getName(),"org.coode.owlapi.obo12.LoadCellTestCase.shouldParseGenericOBO",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2856,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21qoul027c() throws OWLOntologyCreationException{try{__CLR4_5_2272272lvicnlj4.R.inc(2856);
        __CLR4_5_2272272lvicnlj4.R.inc(2857);OWLOntologyManager m = OWLManager.createOWLOntologyManager();
        __CLR4_5_2272272lvicnlj4.R.inc(2858);assertEquals(19, m.getOntologyParsers().size());
        __CLR4_5_2272272lvicnlj4.R.inc(2859);OWLOntologyDocumentSource source = new StreamDocumentSource(getClass().getResourceAsStream("/behavior.obo"));
        __CLR4_5_2272272lvicnlj4.R.inc(2860);m.loadOntologyFromOntologyDocument(source);
    }finally{__CLR4_5_2272272lvicnlj4.R.flushNeeded();}}
}
