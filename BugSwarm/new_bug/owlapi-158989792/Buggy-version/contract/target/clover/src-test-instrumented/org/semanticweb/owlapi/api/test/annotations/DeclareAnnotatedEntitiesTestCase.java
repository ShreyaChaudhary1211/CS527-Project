/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.semanticweb.owlapi.api.test.annotations;

import static org.junit.Assert.assertEquals;

import java.util.Set;

import org.junit.Test;
import org.semanticweb.owlapi.api.test.baseclasses.TestBase;
import org.semanticweb.owlapi.formats.RDFXMLDocumentFormat;
import org.semanticweb.owlapi.model.AxiomType;
import org.semanticweb.owlapi.model.OWLAnnotationAssertionAxiom;
import org.semanticweb.owlapi.model.OWLDeclarationAxiom;
import org.semanticweb.owlapi.model.OWLOntology;

/**
 * Created by vincent on 20.08.15.
 */
public class DeclareAnnotatedEntitiesTestCase extends TestBase {static class __CLR4_5_22mu2mulvicnzwv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,3424,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void shouldDeclareAllDatatypes() throws Exception {__CLR4_5_22mu2mulvicnzwv.R.globalSliceStart(getClass().getName(),3414);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2j6wgdo2mu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22mu2mulvicnzwv.R.rethrow($CLV_t2$);}finally{__CLR4_5_22mu2mulvicnzwv.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.annotations.DeclareAnnotatedEntitiesTestCase.shouldDeclareAllDatatypes",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3414,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2j6wgdo2mu() throws Exception{try{__CLR4_5_22mu2mulvicnzwv.R.inc(3414);
        __CLR4_5_22mu2mulvicnzwv.R.inc(3415);String in = "<?xml version=\"1.0\"?>\n" + "<!DOCTYPE Ontology [\n"
            + "    <!ENTITY xsd \"http://www.w3.org/2001/XMLSchema#\" >\n    <!ENTITY xml \"http://www.w3.org/XML/1998/namespace\" >\n    <!ENTITY rdfs \"http://www.w3.org/2000/01/rdf-schema#\" >\n    <!ENTITY rdf \"http://www.w3.org/1999/02/22-rdf-syntax-ns#\" >\n]>\n"
            + "<Ontology xmlns=\"http://www.w3.org/2002/07/owl#\"\n"
            + "     xml:base=\"http://www.semanticweb.org/owlapi-datatypes\"\n"
            + "     xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"\n"
            + "     xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\"\n"
            + "     xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\n"
            + "     xmlns:xml=\"http://www.w3.org/XML/1998/namespace\"\n"
            + "     ontologyIRI=\"http://www.semanticweb.org/owlapi-datatypes\">\n"
            + "    <Prefix name=\"rdf\" IRI=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"/>\n"
            + "    <Prefix name=\"rdfs\" IRI=\"http://www.w3.org/2000/01/rdf-schema#\"/>\n"
            + "    <Prefix name=\"xsd\" IRI=\"http://www.w3.org/2001/XMLSchema#\"/>\n"
            + "    <Prefix name=\"owl\" IRI=\"http://www.w3.org/2002/07/owl#\"/>\n"
            + "    <Declaration>\n        <Datatype IRI=\"#myDatatype\"/>\n    </Declaration>\n"
            + "    <Declaration>\n        <Datatype IRI=\"#myDatatype2\"/>\n    </Declaration>\n"
            + "    <AnnotationAssertion>\n" + "        <AnnotationProperty abbreviatedIRI=\"rdfs:comment\"/>\n"
            + "        <IRI>#myDatatype2</IRI>\n"
            + "        <Literal datatypeIRI=\"&rdf;PlainLiteral\">myDatatype2 has a comment. It causes the all serializers except the OWLXML serializer to omit the declaration of myDatatype2 when saving a new ontology created from the annotation axioms. Interesting is that they do not omit the declaration of myDatatype that has no comment.</Literal>\n"
            + "    </AnnotationAssertion>\n" + "    <AnnotationAssertion>\n"
            + "        <AnnotationProperty abbreviatedIRI=\"rdfs:comment\"/>\n"
            + "        <AbbreviatedIRI>owl:Thing</AbbreviatedIRI>\n"
            + "        <Literal datatypeIRI=\"http://www.semanticweb.org/owlapi-datatypes#myDatatype\">comment with datatype myDatatype</Literal>\n"
            + "    </AnnotationAssertion>\n" + "    <AnnotationAssertion>\n"
            + "        <AnnotationProperty abbreviatedIRI=\"rdfs:comment\"/>\n"
            + "        <AbbreviatedIRI>owl:Thing</AbbreviatedIRI>\n"
            + "        <Literal datatypeIRI=\"http://www.semanticweb.org/owlapi-datatypes#myDatatype2\">comment with datatype myDatatype2</Literal>\n"
            + "    </AnnotationAssertion>\n</Ontology>";
        __CLR4_5_22mu2mulvicnzwv.R.inc(3416);OWLOntology ontology = loadOntologyFromString(in);
        __CLR4_5_22mu2mulvicnzwv.R.inc(3417);Set<OWLDeclarationAxiom> declarations = ontology.getAxioms(AxiomType.DECLARATION);
        __CLR4_5_22mu2mulvicnzwv.R.inc(3418);Set<OWLAnnotationAssertionAxiom> annotationAssertionAxioms = ontology.getAxioms(AxiomType.ANNOTATION_ASSERTION);
        __CLR4_5_22mu2mulvicnzwv.R.inc(3419);OWLOntology ontology2 = m1.createOntology();
        __CLR4_5_22mu2mulvicnzwv.R.inc(3420);ontology2.getOWLOntologyManager().addAxioms(ontology2, annotationAssertionAxioms);
        __CLR4_5_22mu2mulvicnzwv.R.inc(3421);OWLOntology o3 = roundTrip(ontology2, new RDFXMLDocumentFormat());
        __CLR4_5_22mu2mulvicnzwv.R.inc(3422);Set<OWLDeclarationAxiom> reloadedDeclarations = o3.getAxioms(AxiomType.DECLARATION);
        __CLR4_5_22mu2mulvicnzwv.R.inc(3423);assertEquals(declarations.toString(), reloadedDeclarations.toString());
    }finally{__CLR4_5_22mu2mulvicnzwv.R.flushNeeded();}}
}
