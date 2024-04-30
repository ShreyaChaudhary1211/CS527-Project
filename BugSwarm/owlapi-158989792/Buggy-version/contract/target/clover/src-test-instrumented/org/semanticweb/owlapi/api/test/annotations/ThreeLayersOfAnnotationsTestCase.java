/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.semanticweb.owlapi.api.test.annotations;

import org.semanticweb.owlapi.api.test.baseclasses.AbstractRoundTrippingTestCase;
import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.vocab.OWL2Datatype;

@SuppressWarnings("javadoc")
public class ThreeLayersOfAnnotationsTestCase extends AbstractRoundTrippingTestCase {static class __CLR4_5_22sx2sxlvico00f{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,3654,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Override
    protected OWLOntology createOntology() {try{__CLR4_5_22sx2sxlvico00f.R.inc(3633);
        __CLR4_5_22sx2sxlvico00f.R.inc(3634);String oboInOwl = "urn:obo:";
        __CLR4_5_22sx2sxlvico00f.R.inc(3635);OWLOntology o;
        __CLR4_5_22sx2sxlvico00f.R.inc(3636);try {
            __CLR4_5_22sx2sxlvico00f.R.inc(3637);o = m.createOntology(IRI.create("urn:nested:ontology"));
        } catch (OWLOntologyCreationException e) {
            __CLR4_5_22sx2sxlvico00f.R.inc(3638);throw new OWLRuntimeException(e);
        }
        __CLR4_5_22sx2sxlvico00f.R.inc(3639);OWLClass dbxref = df.getOWLClass(IRI.create(oboInOwl + "DbXref"));
        __CLR4_5_22sx2sxlvico00f.R.inc(3640);OWLClass definition = df.getOWLClass(IRI.create(oboInOwl + "Definition"));
        __CLR4_5_22sx2sxlvico00f.R.inc(3641);OWLObjectProperty adjacent_to = df.getOWLObjectProperty(IRI.create(oboInOwl + "adjacent_to"));
        __CLR4_5_22sx2sxlvico00f.R.inc(3642);OWLAnnotationProperty hasDefinition = df.getOWLAnnotationProperty(IRI.create(oboInOwl + "hasDefinition"));
        __CLR4_5_22sx2sxlvico00f.R.inc(3643);OWLAnnotationProperty hasdbxref = df.getOWLAnnotationProperty(IRI.create(oboInOwl + "hasDbXref"));
        __CLR4_5_22sx2sxlvico00f.R.inc(3644);OWLDataProperty hasuri = df.getOWLDataProperty(IRI.create(oboInOwl + "hasURI"));
        __CLR4_5_22sx2sxlvico00f.R.inc(3645);OWLAnonymousIndividual ind1 = df.getOWLAnonymousIndividual();
        __CLR4_5_22sx2sxlvico00f.R.inc(3646);m.addAxiom(o, df.getOWLClassAssertionAxiom(dbxref, ind1));
        __CLR4_5_22sx2sxlvico00f.R.inc(3647);m.addAxiom(o, df.getOWLDataPropertyAssertionAxiom(hasuri, ind1, df.getOWLLiteral("urn:SO:SO_ke",
            OWL2Datatype.XSD_ANY_URI)));
        __CLR4_5_22sx2sxlvico00f.R.inc(3648);OWLAnonymousIndividual ind2 = df.getOWLAnonymousIndividual();
        __CLR4_5_22sx2sxlvico00f.R.inc(3649);m.addAxiom(o, df.getOWLClassAssertionAxiom(definition, ind2));
        __CLR4_5_22sx2sxlvico00f.R.inc(3650);m.addAxiom(o, df.getOWLAnnotationAssertionAxiom(hasdbxref, ind2, ind1));
        __CLR4_5_22sx2sxlvico00f.R.inc(3651);m.addAxiom(o, df.getOWLAnnotationAssertionAxiom(hasDefinition, adjacent_to.getIRI(), ind2));
        __CLR4_5_22sx2sxlvico00f.R.inc(3652);return o;
    }finally{__CLR4_5_22sx2sxlvico00f.R.flushNeeded();}}

    @Override
    public void testManchesterOWLSyntax() {__CLR4_5_22sx2sxlvico00f.R.globalSliceStart(getClass().getName(),3653);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vksse02th();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22sx2sxlvico00f.R.rethrow($CLV_t2$);}finally{__CLR4_5_22sx2sxlvico00f.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.annotations.ThreeLayersOfAnnotationsTestCase.testManchesterOWLSyntax",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3653,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vksse02th(){try{__CLR4_5_22sx2sxlvico00f.R.inc(3653);
        // not supported in Manchester syntax
    }finally{__CLR4_5_22sx2sxlvico00f.R.flushNeeded();}}
}
