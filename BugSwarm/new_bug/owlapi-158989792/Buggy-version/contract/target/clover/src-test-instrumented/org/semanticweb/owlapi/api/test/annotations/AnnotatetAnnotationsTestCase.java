/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.semanticweb.owlapi.api.test.annotations;

import static org.junit.Assert.assertEquals;
import static org.semanticweb.owlapi.apibinding.OWLFunctionalSyntaxFactory.*;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;
import org.semanticweb.owlapi.api.test.baseclasses.TestBase;
import org.semanticweb.owlapi.model.*;

import com.google.common.collect.Sets;

@SuppressWarnings("javadoc")
public class AnnotatetAnnotationsTestCase extends TestBase {static class __CLR4_5_22g92g9lvicnzu8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,3203,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void shouldRoundtripMultipleNestedAnnotationsdebug() throws OWLOntologyCreationException,
        OWLOntologyStorageException {__CLR4_5_22g92g9lvicnzu8.R.globalSliceStart(getClass().getName(),3177);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jz07vh2g9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22g92g9lvicnzu8.R.rethrow($CLV_t2$);}finally{__CLR4_5_22g92g9lvicnzu8.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.annotations.AnnotatetAnnotationsTestCase.shouldRoundtripMultipleNestedAnnotationsdebug",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3177,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jz07vh2g9() throws OWLOntologyCreationException, OWLOntologyStorageException{try{__CLR4_5_22g92g9lvicnzu8.R.inc(3177);
        __CLR4_5_22g92g9lvicnzu8.R.inc(3178);String ns = "urn:n:a#";
        __CLR4_5_22g92g9lvicnzu8.R.inc(3179);Set<OWLObjectPropertyAssertionAxiom> axioms = Sets.newHashSet(df.getOWLObjectPropertyAssertionAxiom(df
            .getOWLObjectProperty(IRI.create(ns, "r")),
            df.getOWLNamedIndividual(IRI.create(ns, "a")), df.getOWLNamedIndividual(IRI.create(ns, "b")), Sets
                .newHashSet(
                    df.getOWLAnnotation(df.getRDFSLabel(), df.getOWLLiteral(1), Collections.singleton(df
                        .getOWLAnnotation(df.getRDFSComment(), df
                            .getOWLLiteral(3)))),
                    df.getOWLAnnotation(df.getRDFSLabel(), df.getOWLLiteral(2), Collections.singleton(df
                        .getOWLAnnotation(df.getRDFSComment(), df
                            .getOWLLiteral(4)))))));
        __CLR4_5_22g92g9lvicnzu8.R.inc(3180);String input = "<?xml version=\"1.0\"?>\n" +
            "<rdf:RDF xmlns=\"urn:t:o#\" xml:base=\"urn:t:o\"\n xmlns:ann=\"urn:n:a#\" xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\" xmlns:owl=\"http://www.w3.org/2002/07/owl#\" xmlns:xml=\"http://www.w3.org/XML/1998/namespace\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\" xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\">\n"
            +
            "    <owl:Ontology rdf:about=\"urn:t:o\"/>\n" +
            "    <owl:ObjectProperty rdf:about=\"urn:n:a#r\"/>\n" +
            "    <owl:NamedIndividual rdf:about=\"urn:n:a#a\"><ann:r rdf:resource=\"urn:n:a#b\"/></owl:NamedIndividual>\n"
            +
            "    <owl:Annotation>\n" +
            "        <owl:annotatedSource>\n" +
            "            <owl:Axiom rdf:nodeID=\"_:genid1\">\n" +
            "                <owl:annotatedSource rdf:resource=\"urn:n:a#a\"/><owl:annotatedProperty rdf:resource=\"urn:n:a#r\"/><owl:annotatedTarget rdf:resource=\"urn:n:a#b\"/>\n"
            +
            "                <rdfs:label rdf:datatype=\"http://www.w3.org/2001/XMLSchema#integer\">1</rdfs:label><rdfs:label rdf:datatype=\"http://www.w3.org/2001/XMLSchema#integer\">2</rdfs:label>\n"
            +
            "            </owl:Axiom>\n" +
            "        </owl:annotatedSource>\n" +
            "        <owl:annotatedProperty rdf:resource=\"http://www.w3.org/2000/01/rdf-schema#label\"/><owl:annotatedTarget rdf:datatype=\"http://www.w3.org/2001/XMLSchema#integer\">1</owl:annotatedTarget>\n"
            +
            "        <rdfs:comment rdf:datatype=\"http://www.w3.org/2001/XMLSchema#integer\">3</rdfs:comment></owl:Annotation>\n"
            +
            "    <owl:Annotation>\n" +
            "        <owl:annotatedSource>\n" +
            "            <owl:Axiom rdf:nodeID=\"_:genid1\">\n" +
            "                <owl:annotatedSource rdf:resource=\"urn:n:a#a\"/><owl:annotatedProperty rdf:resource=\"urn:n:a#r\"/><owl:annotatedTarget rdf:resource=\"urn:n:a#b\"/>\n"
            +
            "                <rdfs:label rdf:datatype=\"http://www.w3.org/2001/XMLSchema#integer\">1</rdfs:label><rdfs:label rdf:datatype=\"http://www.w3.org/2001/XMLSchema#integer\">2</rdfs:label>\n"
            +
            "            </owl:Axiom>\n" +
            "        </owl:annotatedSource>\n" +
            "        <owl:annotatedProperty rdf:resource=\"http://www.w3.org/2000/01/rdf-schema#label\"/><owl:annotatedTarget rdf:datatype=\"http://www.w3.org/2001/XMLSchema#integer\">2</owl:annotatedTarget>\n"
            +
            "        <rdfs:comment rdf:datatype=\"http://www.w3.org/2001/XMLSchema#integer\">4</rdfs:comment></owl:Annotation>\n"
            +
            "    <owl:NamedIndividual rdf:about=\"urn:n:a#b\"/></rdf:RDF>";
        __CLR4_5_22g92g9lvicnzu8.R.inc(3181);OWLOntology ont = loadOntologyFromString(input);
        __CLR4_5_22g92g9lvicnzu8.R.inc(3182);assertEquals(axioms, ont.getLogicalAxioms());
    }finally{__CLR4_5_22g92g9lvicnzu8.R.flushNeeded();}}

    @Test
    public void shouldLoadAnnotatedannotationsCorrectly()
        throws OWLOntologyCreationException, OWLOntologyStorageException {__CLR4_5_22g92g9lvicnzu8.R.globalSliceStart(getClass().getName(),3183);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ygjn1j2gf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22g92g9lvicnzu8.R.rethrow($CLV_t2$);}finally{__CLR4_5_22g92g9lvicnzu8.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.annotations.AnnotatetAnnotationsTestCase.shouldLoadAnnotatedannotationsCorrectly",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3183,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ygjn1j2gf() throws OWLOntologyCreationException, OWLOntologyStorageException{try{__CLR4_5_22g92g9lvicnzu8.R.inc(3183);
        __CLR4_5_22g92g9lvicnzu8.R.inc(3184);IRI subject = IRI.create(
            "http://purl.obolibrary.org/obo/UBERON_0000033");
        __CLR4_5_22g92g9lvicnzu8.R.inc(3185);String input = "<?xml version=\"1.0\"?>\n"
            + "<rdf:RDF xmlns=\"http://example.com#\"\n"
            + "     xml:base=\"http://example.com\"\n"
            + "     xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"\n"
            + "     xmlns:owl=\"http://www.w3.org/2002/07/owl#\"\n"
            + "     xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\"\n"
            + "     xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\n"
            + "     xmlns:oboInOwl=\"http://www.geneontology.org/formats/oboInOwl#\">\n"
            + "    <owl:Ontology rdf:about=\"http://example.com\"/>\n" + "\n"
            + "    <owl:AnnotationProperty rdf:about=\"http://www.geneontology.org/formats/oboInOwl#source\"/>\n"
            + "\n"
            + "    <owl:Class rdf:about=\"http://purl.obolibrary.org/obo/UBERON_0000033\">\n"
            + "        <rdfs:label rdf:datatype=\"http://www.w3.org/2001/XMLSchema#string\">head</rdfs:label>\n"
            + "        <oboInOwl:hasDbXref rdf:datatype=\"http://www.w3.org/2001/XMLSchema#string\">UMLS:C0018670</oboInOwl:hasDbXref>\n"
            + "    </owl:Class>\n" + "    <owl:Axiom>\n"
            + "        <oboInOwl:source rdf:datatype=\"http://www.w3.org/2001/XMLSchema#string\">NIFSTD:birnlex_1230</oboInOwl:source>\n"
            + "        <owl:annotatedTarget rdf:datatype=\"http://www.w3.org/2001/XMLSchema#string\">UMLS:C0018670</owl:annotatedTarget>\n"
            + "        <owl:annotatedSource rdf:resource=\"http://purl.obolibrary.org/obo/UBERON_0000033\"/>\n"
            + "        <owl:annotatedProperty rdf:resource=\"http://www.geneontology.org/formats/oboInOwl#hasDbXref\"/>\n"
            + "    </owl:Axiom>\n" + "    <owl:Axiom>\n"
            + "        <owl:annotatedTarget rdf:datatype=\"http://www.w3.org/2001/XMLSchema#string\">UMLS:C0018670</owl:annotatedTarget>\n"
            + "        <oboInOwl:source rdf:datatype=\"http://www.w3.org/2001/XMLSchema#string\">ncithesaurus:Head</oboInOwl:source>\n"
            + "        <owl:annotatedSource rdf:resource=\"http://purl.obolibrary.org/obo/UBERON_0000033\"/>\n"
            + "        <owl:annotatedProperty rdf:resource=\"http://www.geneontology.org/formats/oboInOwl#hasDbXref\"/>\n"
            + "    </owl:Axiom>\n" + "</rdf:RDF>";
        __CLR4_5_22g92g9lvicnzu8.R.inc(3186);OWLOntology testcase = loadOntologyFromString(input);
        __CLR4_5_22g92g9lvicnzu8.R.inc(3187);int before = testcase.getAnnotationAssertionAxioms(subject).size();
        __CLR4_5_22g92g9lvicnzu8.R.inc(3188);OWLOntology result = roundTrip(testcase);
        __CLR4_5_22g92g9lvicnzu8.R.inc(3189);int after = result.getAnnotationAssertionAxioms(subject).size();
        __CLR4_5_22g92g9lvicnzu8.R.inc(3190);assertEquals(before, after);
    }finally{__CLR4_5_22g92g9lvicnzu8.R.flushNeeded();}}

    @Test
    public void
        shouldRecognizeAnnotationsOnAxiomsWithDifferentannotationsAsDistinct() {__CLR4_5_22g92g9lvicnzu8.R.globalSliceStart(getClass().getName(),3191);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2p8udgx2gn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22g92g9lvicnzu8.R.rethrow($CLV_t2$);}finally{__CLR4_5_22g92g9lvicnzu8.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.annotations.AnnotatetAnnotationsTestCase.shouldRecognizeAnnotationsOnAxiomsWithDifferentannotationsAsDistinct",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3191,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2p8udgx2gn(){try{__CLR4_5_22g92g9lvicnzu8.R.inc(3191);
        __CLR4_5_22g92g9lvicnzu8.R.inc(3192);OWLAnnotationProperty p = AnnotationProperty(iri("p"));
        __CLR4_5_22g92g9lvicnzu8.R.inc(3193);OWLAnnotationSubject i = iri("i");
        __CLR4_5_22g92g9lvicnzu8.R.inc(3194);OWLLiteral v = Literal("value");
        __CLR4_5_22g92g9lvicnzu8.R.inc(3195);OWLLiteral ann1 = Literal("value1");
        __CLR4_5_22g92g9lvicnzu8.R.inc(3196);OWLLiteral ann2 = Literal("value2");
        __CLR4_5_22g92g9lvicnzu8.R.inc(3197);OWLAnnotationAssertionAxiom ax1 = df.getOWLAnnotationAssertionAxiom(p,
            i, v, singleton(Annotation(RDFSLabel(), ann1)));
        __CLR4_5_22g92g9lvicnzu8.R.inc(3198);OWLAnnotationAssertionAxiom ax2 = df.getOWLAnnotationAssertionAxiom(p,
            i, v, singleton(Annotation(RDFSLabel(), ann2)));
        __CLR4_5_22g92g9lvicnzu8.R.inc(3199);Set<OWLAnnotationAssertionAxiom> set = new TreeSet<>();
        __CLR4_5_22g92g9lvicnzu8.R.inc(3200);set.add(ax1);
        __CLR4_5_22g92g9lvicnzu8.R.inc(3201);set.add(ax2);
        __CLR4_5_22g92g9lvicnzu8.R.inc(3202);assertEquals(2, set.size());
    }finally{__CLR4_5_22g92g9lvicnzu8.R.flushNeeded();}}
}
