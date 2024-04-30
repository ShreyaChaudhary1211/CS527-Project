/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.semanticweb.owlapi.api.test.annotations;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.semanticweb.owlapi.api.test.baseclasses.AbstractRoundTrippingTestCase;
import org.semanticweb.owlapi.formats.OWLXMLDocumentFormat;
import org.semanticweb.owlapi.formats.RioTurtleDocumentFormat;
import org.semanticweb.owlapi.formats.TurtleDocumentFormat;
import org.semanticweb.owlapi.io.StringDocumentSource;
import org.semanticweb.owlapi.io.StringDocumentTarget;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.OWLOntologyStorageException;
import org.semanticweb.owlapi.model.OWLRuntimeException;

@SuppressWarnings("javadoc")
public class RoundTripOWLXMLToRioTurtleTestCase extends AbstractRoundTrippingTestCase {static class __CLR4_5_22r82r8lvicnzz4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,3602,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

//@formatter:off
    private static final String original = "<?xml version=\"1.0\"?>\n" + 
        "<Ontology xmlns=\"http://www.w3.org/2002/07/owl#\"\n" + 
        "     xml:base=\"http://www.derivo.de/ontologies/examples/nested_annotations\"\n" + 
        "     xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\n" + 
        "     xmlns:xml=\"http://www.w3.org/XML/1998/namespace\"\n" + 
        "     xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\"\n" + 
        "     xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"\n" + 
        "     ontologyIRI=\"http://www.derivo.de/ontologies/examples/nested_annotations\">\n" + 
        "    <Prefix name=\"owl\" IRI=\"http://www.w3.org/2002/07/owl#\"/>\n" + 
        "    <Prefix name=\"rdf\" IRI=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"/>\n" + 
        "    <Prefix name=\"xml\" IRI=\"http://www.w3.org/XML/1998/namespace\"/>\n" + 
        "    <Prefix name=\"xsd\" IRI=\"http://www.w3.org/2001/XMLSchema#\"/>\n" + 
        "    <Prefix name=\"rdfs\" IRI=\"http://www.w3.org/2000/01/rdf-schema#\"/>\n" + 
        "    <Declaration>\n" + 
        "        <NamedIndividual IRI=\"#b\"/>\n" + 
        "    </Declaration>\n" + 
        "    <Declaration>\n" + 
        "        <NamedIndividual IRI=\"#c\"/>\n" + 
        "    </Declaration>\n" + 
        "    <Declaration>\n" + 
        "        <NamedIndividual IRI=\"#a\"/>\n" + 
        "    </Declaration>\n" + 
        "    <Declaration>\n" + 
        "        <ObjectProperty IRI=\"#r\"/>\n" + 
        "    </Declaration>\n" + 
        "    <Declaration>\n" + 
        "        <AnnotationProperty abbreviatedIRI=\"rdfs:commment\"/>\n" + 
        "    </Declaration>\n" + 
        "    <ObjectPropertyAssertion>\n" + 
        "        <Annotation>\n" + 
        "            <Annotation>\n" + 
        "                <AnnotationProperty abbreviatedIRI=\"rdfs:commment\"/>\n" + 
        "                <Literal datatypeIRI=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#PlainLiteral\">comment for one</Literal>\n" + 
        "            </Annotation>\n" + 
        "            <AnnotationProperty abbreviatedIRI=\"rdfs:label\"/>\n" + 
        "            <Literal datatypeIRI=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#PlainLiteral\">one</Literal>\n" + 
        "        </Annotation>\n" + 
        "        <Annotation>\n" + 
        "            <Annotation>\n" + 
        "                <AnnotationProperty abbreviatedIRI=\"rdfs:commment\"/>\n" + 
        "                <Literal datatypeIRI=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#PlainLiteral\">comment for two</Literal>\n" + 
        "            </Annotation>\n" + 
        "            <AnnotationProperty abbreviatedIRI=\"rdfs:label\"/>\n" + 
        "            <Literal datatypeIRI=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#PlainLiteral\">two</Literal>\n" + 
        "        </Annotation>\n" + 
        "        <ObjectProperty IRI=\"#r\"/>\n" + 
        "        <NamedIndividual IRI=\"#a\"/>\n" + 
        "        <NamedIndividual IRI=\"#b\"/>\n" + 
        "    </ObjectPropertyAssertion>\n" + 
        "    <ObjectPropertyAssertion>\n" + 
        "        <Annotation>\n" + 
        "            <Annotation>\n" + 
        "                <AnnotationProperty abbreviatedIRI=\"rdfs:commment\"/>\n" + 
        "                <Literal datatypeIRI=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#PlainLiteral\">comment for three</Literal>\n" + 
        "            </Annotation>\n" + 
        "            <AnnotationProperty abbreviatedIRI=\"rdfs:label\"/>\n" + 
        "            <Literal datatypeIRI=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#PlainLiteral\">three</Literal>\n" + 
        "        </Annotation>\n" + 
        "        <ObjectProperty IRI=\"#r\"/>\n" + 
        "        <NamedIndividual IRI=\"#b\"/>\n" + 
        "        <NamedIndividual IRI=\"#c\"/>\n" + 
        "    </ObjectPropertyAssertion>\n" + 
        "</Ontology>";
//@formatter:on
    @Override
    protected OWLOntology createOntology() {try{__CLR4_5_22r82r8lvicnzz4.R.inc(3572);
        __CLR4_5_22r82r8lvicnzz4.R.inc(3573);try {
            __CLR4_5_22r82r8lvicnzz4.R.inc(3574);return m.loadOntologyFromOntologyDocument(new StringDocumentSource(original));
        } catch (OWLOntologyCreationException e) {
            __CLR4_5_22r82r8lvicnzz4.R.inc(3575);throw new OWLRuntimeException(e);
        }
    }finally{__CLR4_5_22r82r8lvicnzz4.R.flushNeeded();}}

    @Test
    public void shouldRoundTripThroughOWLXML() throws OWLOntologyCreationException, OWLOntologyStorageException {__CLR4_5_22r82r8lvicnzz4.R.globalSliceStart(getClass().getName(),3576);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xogsv52rc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22r82r8lvicnzz4.R.rethrow($CLV_t2$);}finally{__CLR4_5_22r82r8lvicnzz4.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.annotations.RoundTripOWLXMLToRioTurtleTestCase.shouldRoundTripThroughOWLXML",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3576,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xogsv52rc() throws OWLOntologyCreationException, OWLOntologyStorageException{try{__CLR4_5_22r82r8lvicnzz4.R.inc(3576);
        __CLR4_5_22r82r8lvicnzz4.R.inc(3577);OWLOntology ontology = loadOntologyFromString(original);
        __CLR4_5_22r82r8lvicnzz4.R.inc(3578);StringDocumentTarget targetOWLXML = new StringDocumentTarget();
        __CLR4_5_22r82r8lvicnzz4.R.inc(3579);ontology.saveOntology(new OWLXMLDocumentFormat(), targetOWLXML);
        __CLR4_5_22r82r8lvicnzz4.R.inc(3580);OWLOntology o1 = loadOntologyFromString(targetOWLXML, new OWLXMLDocumentFormat());
        __CLR4_5_22r82r8lvicnzz4.R.inc(3581);equal(ontology, o1);
    }finally{__CLR4_5_22r82r8lvicnzz4.R.flushNeeded();}}

    @Test
    public void shouldRoundTripThroughOWLXMLOrTurtle() throws OWLOntologyCreationException,
        OWLOntologyStorageException {__CLR4_5_22r82r8lvicnzz4.R.globalSliceStart(getClass().getName(),3582);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22de31e2ri();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22r82r8lvicnzz4.R.rethrow($CLV_t2$);}finally{__CLR4_5_22r82r8lvicnzz4.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.annotations.RoundTripOWLXMLToRioTurtleTestCase.shouldRoundTripThroughOWLXMLOrTurtle",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3582,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22de31e2ri() throws OWLOntologyCreationException, OWLOntologyStorageException{try{__CLR4_5_22r82r8lvicnzz4.R.inc(3582);
        __CLR4_5_22r82r8lvicnzz4.R.inc(3583);OWLOntology ontology = loadOntologyFromString(original);
        __CLR4_5_22r82r8lvicnzz4.R.inc(3584);OWLOntology o1 = roundTrip(ontology, new RioTurtleDocumentFormat());
        __CLR4_5_22r82r8lvicnzz4.R.inc(3585);equal(ontology, o1);
        __CLR4_5_22r82r8lvicnzz4.R.inc(3586);OWLOntology o2 = roundTrip(o1, new OWLXMLDocumentFormat());
        __CLR4_5_22r82r8lvicnzz4.R.inc(3587);equal(o2, o1);
    }finally{__CLR4_5_22r82r8lvicnzz4.R.flushNeeded();}}

    @Test
    public void shouldRoundTripThroughOWLXMLToTurtle() throws OWLOntologyCreationException,
        OWLOntologyStorageException {__CLR4_5_22r82r8lvicnzz4.R.globalSliceStart(getClass().getName(),3588);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22gbuly2ro();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22r82r8lvicnzz4.R.rethrow($CLV_t2$);}finally{__CLR4_5_22r82r8lvicnzz4.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.annotations.RoundTripOWLXMLToRioTurtleTestCase.shouldRoundTripThroughOWLXMLToTurtle",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3588,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22gbuly2ro() throws OWLOntologyCreationException, OWLOntologyStorageException{try{__CLR4_5_22r82r8lvicnzz4.R.inc(3588);
        __CLR4_5_22r82r8lvicnzz4.R.inc(3589);OWLOntology ontology = loadOntologyFromString(original);
        __CLR4_5_22r82r8lvicnzz4.R.inc(3590);StringDocumentTarget targetTTL = new StringDocumentTarget();
        __CLR4_5_22r82r8lvicnzz4.R.inc(3591);ontology.saveOntology(new TurtleDocumentFormat(), targetTTL);
        __CLR4_5_22r82r8lvicnzz4.R.inc(3592);StringDocumentTarget targetTTLFromTTL = new StringDocumentTarget();
        __CLR4_5_22r82r8lvicnzz4.R.inc(3593);ontology.saveOntology(new TurtleDocumentFormat(), targetTTLFromTTL);
        __CLR4_5_22r82r8lvicnzz4.R.inc(3594);assertEquals(targetTTL.toString(), targetTTLFromTTL.toString());
    }finally{__CLR4_5_22r82r8lvicnzz4.R.flushNeeded();}}

    @Test
    public void shouldRoundTripThroughOWLXMLToRioTurtle() throws OWLOntologyCreationException,
        OWLOntologyStorageException {__CLR4_5_22r82r8lvicnzz4.R.globalSliceStart(getClass().getName(),3595);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2108gx42rv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22r82r8lvicnzz4.R.rethrow($CLV_t2$);}finally{__CLR4_5_22r82r8lvicnzz4.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.annotations.RoundTripOWLXMLToRioTurtleTestCase.shouldRoundTripThroughOWLXMLToRioTurtle",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3595,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2108gx42rv() throws OWLOntologyCreationException, OWLOntologyStorageException{try{__CLR4_5_22r82r8lvicnzz4.R.inc(3595);
        __CLR4_5_22r82r8lvicnzz4.R.inc(3596);OWLOntology ontology = loadOntologyFromString(original);
        __CLR4_5_22r82r8lvicnzz4.R.inc(3597);StringDocumentTarget target1 = new StringDocumentTarget();
        __CLR4_5_22r82r8lvicnzz4.R.inc(3598);ontology.saveOntology(new RioTurtleDocumentFormat(), target1);
        __CLR4_5_22r82r8lvicnzz4.R.inc(3599);StringDocumentTarget target2 = new StringDocumentTarget();
        __CLR4_5_22r82r8lvicnzz4.R.inc(3600);ontology.saveOntology(new RioTurtleDocumentFormat(), target2);
        __CLR4_5_22r82r8lvicnzz4.R.inc(3601);assertEquals(target1.toString().replaceAll("_:genid[0-9]+", "_:genid"), target2.toString().replaceAll(
            "_:genid[0-9]+", "_:genid"));
    }finally{__CLR4_5_22r82r8lvicnzz4.R.flushNeeded();}}
}
