/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.semanticweb.owlapi.api.test.syntax;

import static org.junit.Assert.*;
import static org.semanticweb.owlapi.apibinding.OWLFunctionalSyntaxFactory.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;
import org.semanticweb.owlapi.api.test.baseclasses.TestBase;
import org.semanticweb.owlapi.formats.FunctionalSyntaxDocumentFormat;
import org.semanticweb.owlapi.formats.RDFXMLDocumentFormat;
import org.semanticweb.owlapi.io.AnonymousIndividualProperties;
import org.semanticweb.owlapi.io.StringDocumentTarget;
import org.semanticweb.owlapi.model.*;

/**
 * test for 3294629 - currently disabled. Not clear whether structure sharing is
 * allowed or disallowed. Data is equivalent, ontology annotations are not
 */
@SuppressWarnings("javadoc")
public class SharedBlankNodeTestCase extends TestBase {static class __CLR4_5_28tf8tflvico1q3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,11551,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void shouldSaveOneIndividual() throws Exception {__CLR4_5_28tf8tflvico1q3.R.globalSliceStart(getClass().getName(),11427);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ucxxpm8tf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28tf8tflvico1q3.R.rethrow($CLV_t2$);}finally{__CLR4_5_28tf8tflvico1q3.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.SharedBlankNodeTestCase.shouldSaveOneIndividual",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),11427,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ucxxpm8tf() throws Exception{try{__CLR4_5_28tf8tflvico1q3.R.inc(11427);
        __CLR4_5_28tf8tflvico1q3.R.inc(11428);OWLOntology ontology = createOntology();
        __CLR4_5_28tf8tflvico1q3.R.inc(11429);StringDocumentTarget s = saveOntology(ontology, new RDFXMLDocumentFormat());
        __CLR4_5_28tf8tflvico1q3.R.inc(11430);StringDocumentTarget functionalSyntax = saveOntology(ontology, new FunctionalSyntaxDocumentFormat());
        __CLR4_5_28tf8tflvico1q3.R.inc(11431);testAnnotation(loadOntologyFromString(functionalSyntax));
        __CLR4_5_28tf8tflvico1q3.R.inc(11432);testAnnotation(loadOntologyFromString(s));
    }finally{__CLR4_5_28tf8tflvico1q3.R.flushNeeded();}}

    public OWLOntology createOntology()
        throws OWLOntologyCreationException {try{__CLR4_5_28tf8tflvico1q3.R.inc(11433);
        __CLR4_5_28tf8tflvico1q3.R.inc(11434);String NS = "urn:test";
        __CLR4_5_28tf8tflvico1q3.R.inc(11435);OWLDataProperty P = DataProperty(IRI(NS + "#p"));
        __CLR4_5_28tf8tflvico1q3.R.inc(11436);OWLObjectProperty P1 = ObjectProperty(IRI(NS + "#p1"));
        __CLR4_5_28tf8tflvico1q3.R.inc(11437);OWLObjectProperty P2 = ObjectProperty(IRI(NS + "#p2"));
        __CLR4_5_28tf8tflvico1q3.R.inc(11438);OWLAnnotationProperty ann = AnnotationProperty(IRI(NS + "#ann"));
        __CLR4_5_28tf8tflvico1q3.R.inc(11439);OWLOntology ontology = m.createOntology(IRI(NS));
        __CLR4_5_28tf8tflvico1q3.R.inc(11440);OWLAnonymousIndividual i = AnonymousIndividual();
        __CLR4_5_28tf8tflvico1q3.R.inc(11441);m.addAxiom(ontology, Declaration(P));
        __CLR4_5_28tf8tflvico1q3.R.inc(11442);m.addAxiom(ontology, Declaration(P1));
        __CLR4_5_28tf8tflvico1q3.R.inc(11443);m.addAxiom(ontology, Declaration(P2));
        __CLR4_5_28tf8tflvico1q3.R.inc(11444);m.addAxiom(ontology, Declaration(ann));
        __CLR4_5_28tf8tflvico1q3.R.inc(11445);m.applyChange(new AddOntologyAnnotation(ontology, Annotation(ann,
            i)));
        __CLR4_5_28tf8tflvico1q3.R.inc(11446);OWLAxiom ass = DataPropertyAssertion(P, i, Literal("hello world"));
        __CLR4_5_28tf8tflvico1q3.R.inc(11447);OWLNamedIndividual ind = NamedIndividual(IRI(NS + "#test"));
        __CLR4_5_28tf8tflvico1q3.R.inc(11448);OWLAxiom ax1 = ObjectPropertyAssertion(P1, ind, i);
        __CLR4_5_28tf8tflvico1q3.R.inc(11449);OWLAxiom ax2 = ObjectPropertyAssertion(P2, ind, i);
        __CLR4_5_28tf8tflvico1q3.R.inc(11450);m.addAxiom(ontology, ass);
        __CLR4_5_28tf8tflvico1q3.R.inc(11451);m.addAxiom(ontology, ax1);
        __CLR4_5_28tf8tflvico1q3.R.inc(11452);m.addAxiom(ontology, ax2);
        __CLR4_5_28tf8tflvico1q3.R.inc(11453);return ontology;
    }finally{__CLR4_5_28tf8tflvico1q3.R.flushNeeded();}}

    public static void testAnnotation(OWLOntology ontology) {try{__CLR4_5_28tf8tflvico1q3.R.inc(11454);
        __CLR4_5_28tf8tflvico1q3.R.inc(11455);for (OWLIndividual i : ontology.getIndividualsInSignature()) {{
            __CLR4_5_28tf8tflvico1q3.R.inc(11456);assertEquals(2, ontology.getObjectPropertyAssertionAxioms(i).size());
        }
        }__CLR4_5_28tf8tflvico1q3.R.inc(11457);for (OWLAnnotation annotation : ontology.getAnnotations()) {{
            __CLR4_5_28tf8tflvico1q3.R.inc(11458);OWLIndividual i = (OWLIndividual) annotation.getValue();
            __CLR4_5_28tf8tflvico1q3.R.inc(11459);assertEquals(1, ontology.getDataPropertyAssertionAxioms(i).size());
        }
    }}finally{__CLR4_5_28tf8tflvico1q3.R.flushNeeded();}}

    @Test
    public void shouldRoundtripBlankNodeAnnotations() throws OWLOntologyCreationException, OWLOntologyStorageException {__CLR4_5_28tf8tflvico1q3.R.globalSliceStart(getClass().getName(),11460);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jier7v8uc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28tf8tflvico1q3.R.rethrow($CLV_t2$);}finally{__CLR4_5_28tf8tflvico1q3.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.SharedBlankNodeTestCase.shouldRoundtripBlankNodeAnnotations",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),11460,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jier7v8uc() throws OWLOntologyCreationException, OWLOntologyStorageException{try{__CLR4_5_28tf8tflvico1q3.R.inc(11460);
        __CLR4_5_28tf8tflvico1q3.R.inc(11461);String input = "<?xml version=\"1.0\"?>\r\n<rdf:RDF xmlns:owl=\"http://www.w3.org/2002/07/owl#\" xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\" xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"><owl:Class rdf:about=\"http://E\"><rdfs:comment><rdf:Description><rdfs:comment>E</rdfs:comment></rdf:Description></rdfs:comment></owl:Class></rdf:RDF>";
        __CLR4_5_28tf8tflvico1q3.R.inc(11462);OWLOntology o = loadOntologyFromString(input);
        __CLR4_5_28tf8tflvico1q3.R.inc(11463);OWLOntology o1 = loadOntologyFromString(saveOntology(o, new FunctionalSyntaxDocumentFormat()));
        __CLR4_5_28tf8tflvico1q3.R.inc(11464);OWLOntology o2 = loadOntologyFromString(saveOntology(o1, new RDFXMLDocumentFormat()));
        __CLR4_5_28tf8tflvico1q3.R.inc(11465);Set<OWLAnnotationAssertionAxiom> annotationAssertionAxioms = o2.getAnnotationAssertionAxioms(IRI("http://E"));
        __CLR4_5_28tf8tflvico1q3.R.inc(11466);assertEquals(1, annotationAssertionAxioms.size());
        __CLR4_5_28tf8tflvico1q3.R.inc(11467);OWLAnnotationAssertionAxiom next = annotationAssertionAxioms.iterator().next();
        __CLR4_5_28tf8tflvico1q3.R.inc(11468);assertEquals(1, o2.getAnnotationAssertionAxioms((OWLAnnotationSubject) next.getValue()).size());
    }finally{__CLR4_5_28tf8tflvico1q3.R.flushNeeded();}}

    @Test
    public void shouldRemapUponReading() throws OWLOntologyCreationException {__CLR4_5_28tf8tflvico1q3.R.globalSliceStart(getClass().getName(),11469);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2atua6b8ul();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28tf8tflvico1q3.R.rethrow($CLV_t2$);}finally{__CLR4_5_28tf8tflvico1q3.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.SharedBlankNodeTestCase.shouldRemapUponReading",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),11469,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2atua6b8ul() throws OWLOntologyCreationException{try{__CLR4_5_28tf8tflvico1q3.R.inc(11469);
        __CLR4_5_28tf8tflvico1q3.R.inc(11470);String input = "Prefix(rdf:=<http://www.w3.org/1999/02/22-rdf-syntax-ns#>)\r\n" +
            "Prefix(xml:=<http://www.w3.org/XML/1998/namespace>)\r\n" +
            "Prefix(xsd:=<http://www.w3.org/2001/XMLSchema#>)\r\n" +
            "Prefix(rdfs:=<http://www.w3.org/2000/01/rdf-schema#>)\r\n" +
            "Ontology(\r\n" +
            "Declaration(Class(<http://E>))\r\n" +
            "AnnotationAssertion(rdfs:comment <http://E> _:genid1)\r\n" +
            "AnnotationAssertion(rdfs:comment _:genid1 \"E\"))";
        __CLR4_5_28tf8tflvico1q3.R.inc(11471);OWLOntology o1 = loadOntologyFromString(input);
        __CLR4_5_28tf8tflvico1q3.R.inc(11472);OWLOntology o2 = loadOntologyFromString(input);
        __CLR4_5_28tf8tflvico1q3.R.inc(11473);Set<OWLAnnotationValue> values1 = new HashSet<>();
        __CLR4_5_28tf8tflvico1q3.R.inc(11474);Set<OWLAnnotationValue> values2 = new HashSet<>();
        __CLR4_5_28tf8tflvico1q3.R.inc(11475);for (OWLAnnotationAssertionAxiom a : o1.getAxioms(AxiomType.ANNOTATION_ASSERTION)) {{
            __CLR4_5_28tf8tflvico1q3.R.inc(11476);OWLAnnotationValue value = a.getValue();
            __CLR4_5_28tf8tflvico1q3.R.inc(11477);if ((((value instanceof OWLAnonymousIndividual)&&(__CLR4_5_28tf8tflvico1q3.R.iget(11478)!=0|true))||(__CLR4_5_28tf8tflvico1q3.R.iget(11479)==0&false))) {{
                __CLR4_5_28tf8tflvico1q3.R.inc(11480);values1.add(value);
            }
        }}
        }__CLR4_5_28tf8tflvico1q3.R.inc(11481);for (OWLAnnotationAssertionAxiom a : o2.getAxioms(AxiomType.ANNOTATION_ASSERTION)) {{
            __CLR4_5_28tf8tflvico1q3.R.inc(11482);OWLAnnotationValue value = a.getValue();
            __CLR4_5_28tf8tflvico1q3.R.inc(11483);if ((((value instanceof OWLAnonymousIndividual)&&(__CLR4_5_28tf8tflvico1q3.R.iget(11484)!=0|true))||(__CLR4_5_28tf8tflvico1q3.R.iget(11485)==0&false))) {{
                __CLR4_5_28tf8tflvico1q3.R.inc(11486);values2.add(value);
            }
        }}
        }__CLR4_5_28tf8tflvico1q3.R.inc(11487);assertEquals(values1.toString(), values1.size(), 1);
        __CLR4_5_28tf8tflvico1q3.R.inc(11488);assertEquals(values1.toString(), values2.size(), 1);
        __CLR4_5_28tf8tflvico1q3.R.inc(11489);assertNotEquals(values1, values2);
    }finally{__CLR4_5_28tf8tflvico1q3.R.flushNeeded();}}

    @Test
    public void shouldHaveOnlyOneAnonIndividual() throws OWLOntologyCreationException {__CLR4_5_28tf8tflvico1q3.R.globalSliceStart(getClass().getName(),11490);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2natfcl8v6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28tf8tflvico1q3.R.rethrow($CLV_t2$);}finally{__CLR4_5_28tf8tflvico1q3.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.SharedBlankNodeTestCase.shouldHaveOnlyOneAnonIndividual",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),11490,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2natfcl8v6() throws OWLOntologyCreationException{try{__CLR4_5_28tf8tflvico1q3.R.inc(11490);
        __CLR4_5_28tf8tflvico1q3.R.inc(11491);String input = "<?xml version=\"1.0\"?>\r\n<rdf:RDF xmlns:owl=\"http://www.w3.org/2002/07/owl#\" xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\" xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"><owl:Class rdf:about=\"http://E\"><rdfs:comment><rdf:Description><rdfs:comment>E</rdfs:comment></rdf:Description></rdfs:comment></owl:Class></rdf:RDF>";
        __CLR4_5_28tf8tflvico1q3.R.inc(11492);OWLOntology o1 = loadOntologyFromString(input);
        __CLR4_5_28tf8tflvico1q3.R.inc(11493);OWLOntology o2 = loadOntologyFromString(input);
        __CLR4_5_28tf8tflvico1q3.R.inc(11494);Set<OWLAnnotationValue> values1 = new HashSet<>();
        __CLR4_5_28tf8tflvico1q3.R.inc(11495);Set<OWLAnnotationValue> values2 = new HashSet<>();
        __CLR4_5_28tf8tflvico1q3.R.inc(11496);for (OWLAnnotationAssertionAxiom a : o1.getAxioms(AxiomType.ANNOTATION_ASSERTION)) {{
            __CLR4_5_28tf8tflvico1q3.R.inc(11497);OWLAnnotationValue value = a.getValue();
            __CLR4_5_28tf8tflvico1q3.R.inc(11498);if ((((value instanceof OWLAnonymousIndividual)&&(__CLR4_5_28tf8tflvico1q3.R.iget(11499)!=0|true))||(__CLR4_5_28tf8tflvico1q3.R.iget(11500)==0&false))) {{
                __CLR4_5_28tf8tflvico1q3.R.inc(11501);values1.add(value);
            }
        }}
        }__CLR4_5_28tf8tflvico1q3.R.inc(11502);for (OWLAnnotationAssertionAxiom a : o2.getAxioms(AxiomType.ANNOTATION_ASSERTION)) {{
            __CLR4_5_28tf8tflvico1q3.R.inc(11503);OWLAnnotationValue value = a.getValue();
            __CLR4_5_28tf8tflvico1q3.R.inc(11504);if ((((value instanceof OWLAnonymousIndividual)&&(__CLR4_5_28tf8tflvico1q3.R.iget(11505)!=0|true))||(__CLR4_5_28tf8tflvico1q3.R.iget(11506)==0&false))) {{
                __CLR4_5_28tf8tflvico1q3.R.inc(11507);values2.add(value);
            }
        }}
        }__CLR4_5_28tf8tflvico1q3.R.inc(11508);assertEquals(values1.toString(), values1.size(), 1);
        __CLR4_5_28tf8tflvico1q3.R.inc(11509);assertEquals(values1.toString(), values2.size(), 1);
        __CLR4_5_28tf8tflvico1q3.R.inc(11510);assertNotEquals(values1, values2);
    }finally{__CLR4_5_28tf8tflvico1q3.R.flushNeeded();}}

    @Test
    public void shouldNotRemapUponReloading() throws OWLOntologyCreationException {__CLR4_5_28tf8tflvico1q3.R.globalSliceStart(getClass().getName(),11511);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25baghf8vr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28tf8tflvico1q3.R.rethrow($CLV_t2$);}finally{__CLR4_5_28tf8tflvico1q3.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.SharedBlankNodeTestCase.shouldNotRemapUponReloading",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),11511,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25baghf8vr() throws OWLOntologyCreationException{try{__CLR4_5_28tf8tflvico1q3.R.inc(11511);
        __CLR4_5_28tf8tflvico1q3.R.inc(11512);AnonymousIndividualProperties.setRemapAllAnonymousIndividualsIds(false);
        __CLR4_5_28tf8tflvico1q3.R.inc(11513);String input = "<?xml version=\"1.0\"?>\r\n" +
            "<rdf:RDF xmlns=\"http://www.w3.org/2002/07/owl#\"\r\n" +
            "     xml:base=\"http://www.w3.org/2002/07/owl\"\r\n" +
            "     xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\r\n" +
            "     xmlns:owl=\"http://www.w3.org/2002/07/owl#\"\r\n" +
            "     xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\"\r\n" +
            "     xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\">\r\n" +
            "    <Ontology/>\r\n" +
            "    <Class rdf:about=\"http://E\">\r\n" +
            "        <rdfs:comment>\r\n" +
            "            <rdf:Description rdf:nodeID=\"1058025095\">\r\n" +
            "                <rdfs:comment>E</rdfs:comment>\r\n" +
            "            </rdf:Description>\r\n" +
            "        </rdfs:comment>\r\n" +
            "    </Class>\r\n" +
            "</rdf:RDF>";
        __CLR4_5_28tf8tflvico1q3.R.inc(11514);try {
            __CLR4_5_28tf8tflvico1q3.R.inc(11515);Set<OWLAnnotationValue> values1 = new HashSet<>();
            __CLR4_5_28tf8tflvico1q3.R.inc(11516);values1.add(m.getOWLDataFactory().getOWLAnonymousIndividual("_:genid-nodeid-1058025095"));
            __CLR4_5_28tf8tflvico1q3.R.inc(11517);OWLOntology o1 = loadOntologyFromString(input);
            __CLR4_5_28tf8tflvico1q3.R.inc(11518);for (OWLAnnotationAssertionAxiom a : o1.getAxioms(AxiomType.ANNOTATION_ASSERTION)) {{
                __CLR4_5_28tf8tflvico1q3.R.inc(11519);OWLAnnotationValue value = a.getValue();
                __CLR4_5_28tf8tflvico1q3.R.inc(11520);if ((((value instanceof OWLAnonymousIndividual)&&(__CLR4_5_28tf8tflvico1q3.R.iget(11521)!=0|true))||(__CLR4_5_28tf8tflvico1q3.R.iget(11522)==0&false))) {{
                    __CLR4_5_28tf8tflvico1q3.R.inc(11523);values1.add(value);
                }
            }}
            }__CLR4_5_28tf8tflvico1q3.R.inc(11524);o1 = loadOntologyFromString(input);
            __CLR4_5_28tf8tflvico1q3.R.inc(11525);for (OWLAnnotationAssertionAxiom a : o1.getAxioms(AxiomType.ANNOTATION_ASSERTION)) {{
                __CLR4_5_28tf8tflvico1q3.R.inc(11526);OWLAnnotationValue value = a.getValue();
                __CLR4_5_28tf8tflvico1q3.R.inc(11527);if ((((value instanceof OWLAnonymousIndividual)&&(__CLR4_5_28tf8tflvico1q3.R.iget(11528)!=0|true))||(__CLR4_5_28tf8tflvico1q3.R.iget(11529)==0&false))) {{
                    __CLR4_5_28tf8tflvico1q3.R.inc(11530);values1.add(value);
                }
            }}
            }__CLR4_5_28tf8tflvico1q3.R.inc(11531);assertEquals(values1.toString(), values1.size(), 1);
        } finally {
            // make sure config is restored
            __CLR4_5_28tf8tflvico1q3.R.inc(11532);AnonymousIndividualProperties.resetToDefault();
        }
    }finally{__CLR4_5_28tf8tflvico1q3.R.flushNeeded();}}

    @Test
    public void shouldNotOutputNodeIdWhenNotNeeded() throws OWLOntologyCreationException, OWLOntologyStorageException {__CLR4_5_28tf8tflvico1q3.R.globalSliceStart(getClass().getName(),11533);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22xuiw98wd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28tf8tflvico1q3.R.rethrow($CLV_t2$);}finally{__CLR4_5_28tf8tflvico1q3.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.SharedBlankNodeTestCase.shouldNotOutputNodeIdWhenNotNeeded",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),11533,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22xuiw98wd() throws OWLOntologyCreationException, OWLOntologyStorageException{try{__CLR4_5_28tf8tflvico1q3.R.inc(11533);
        __CLR4_5_28tf8tflvico1q3.R.inc(11534);String input = "<?xml version=\"1.0\"?>\r\n" +
            "<rdf:RDF xmlns=\"http://www.w3.org/2002/07/owl#\"\r\n" +
            "     xml:base=\"http://www.w3.org/2002/07/owl\"\r\n" +
            "     xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\r\n" +
            "     xmlns:owl=\"http://www.w3.org/2002/07/owl#\"\r\n" +
            "     xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\"\r\n" +
            "     xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\">\r\n" +
            "    <Ontology/>\r\n" +
            "    <Class rdf:about=\"http://E\">\r\n" +
            "        <rdfs:comment>\r\n" +
            "            <rdf:Description rdf:nodeID=\"1058025095\">\r\n" +
            "                <rdfs:comment>E</rdfs:comment>\r\n" +
            "            </rdf:Description>\r\n" +
            "        </rdfs:comment>\r\n" +
            "    </Class>\r\n" +
            "</rdf:RDF>";
        __CLR4_5_28tf8tflvico1q3.R.inc(11535);OWLOntology o1 = loadOntologyFromString(input);
        __CLR4_5_28tf8tflvico1q3.R.inc(11536);StringDocumentTarget result = saveOntology(o1, new RDFXMLDocumentFormat());
        __CLR4_5_28tf8tflvico1q3.R.inc(11537);assertFalse(result.toString().contains("rdf:nodeID"));
    }finally{__CLR4_5_28tf8tflvico1q3.R.flushNeeded();}}

    @Test
    public void shouldOutputNodeIdEvenIfNotNeeded() throws OWLOntologyCreationException, OWLOntologyStorageException {__CLR4_5_28tf8tflvico1q3.R.globalSliceStart(getClass().getName(),11538);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ryzzfd8wi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28tf8tflvico1q3.R.rethrow($CLV_t2$);}finally{__CLR4_5_28tf8tflvico1q3.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.SharedBlankNodeTestCase.shouldOutputNodeIdEvenIfNotNeeded",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),11538,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ryzzfd8wi() throws OWLOntologyCreationException, OWLOntologyStorageException{try{__CLR4_5_28tf8tflvico1q3.R.inc(11538);
        __CLR4_5_28tf8tflvico1q3.R.inc(11539);String input = "<?xml version=\"1.0\"?>\r\n" +
            "<rdf:RDF xmlns=\"http://www.w3.org/2002/07/owl#\"\r\n" +
            "     xml:base=\"http://www.w3.org/2002/07/owl\"\r\n" +
            "     xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\r\n" +
            "     xmlns:owl=\"http://www.w3.org/2002/07/owl#\"\r\n" +
            "     xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\"\r\n" +
            "     xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\">\r\n" +
            "    <Ontology/>\r\n" +
            "    <Class rdf:about=\"http://E\">\r\n" +
            "        <rdfs:comment>\r\n" +
            "            <rdf:Description>\r\n" +
            "                <rdfs:comment>E</rdfs:comment>\r\n" +
            "            </rdf:Description>\r\n" +
            "        </rdfs:comment>\r\n" +
            "    </Class>\r\n" +
            "</rdf:RDF>";
        __CLR4_5_28tf8tflvico1q3.R.inc(11540);OWLOntology o1 = loadOntologyFromString(input);
        __CLR4_5_28tf8tflvico1q3.R.inc(11541);AnonymousIndividualProperties.setSaveIdsForAllAnonymousIndividuals(true);
        __CLR4_5_28tf8tflvico1q3.R.inc(11542);try {
            __CLR4_5_28tf8tflvico1q3.R.inc(11543);StringDocumentTarget result = saveOntology(o1, new RDFXMLDocumentFormat());
            __CLR4_5_28tf8tflvico1q3.R.inc(11544);assertTrue(result.toString().contains("rdf:nodeID"));
        } finally {
            // make sure the static variable is reset after the test
            __CLR4_5_28tf8tflvico1q3.R.inc(11545);AnonymousIndividualProperties.resetToDefault();
        }
    }finally{__CLR4_5_28tf8tflvico1q3.R.flushNeeded();}}

    @Test
    public void shouldOutputNodeIdWhenNeeded() throws OWLOntologyCreationException, OWLOntologyStorageException {__CLR4_5_28tf8tflvico1q3.R.globalSliceStart(getClass().getName(),11546);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ysvr2x8wq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28tf8tflvico1q3.R.rethrow($CLV_t2$);}finally{__CLR4_5_28tf8tflvico1q3.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.SharedBlankNodeTestCase.shouldOutputNodeIdWhenNeeded",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),11546,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ysvr2x8wq() throws OWLOntologyCreationException, OWLOntologyStorageException{try{__CLR4_5_28tf8tflvico1q3.R.inc(11546);
        __CLR4_5_28tf8tflvico1q3.R.inc(11547);String input = "<?xml version=\"1.0\"?>\r\n" +
            "<rdf:RDF xmlns=\"http://www.w3.org/2002/07/owl#\"\r\n" +
            "     xml:base=\"http://www.w3.org/2002/07/owl\"\r\n" +
            "     xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\r\n" +
            "     xmlns:owl=\"http://www.w3.org/2002/07/owl#\"\r\n" +
            "     xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\"\r\n" +
            "     xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\">\r\n" +
            "    <Ontology/>\r\n" +
            "    <Class rdf:about=\"http://E\">\r\n" +
            "        <rdfs:comment>\r\n" +
            "            <rdf:Description rdf:nodeID=\"1058025095\">\r\n" +
            "                <rdfs:comment>E</rdfs:comment>\r\n" +
            "            </rdf:Description>\r\n" +
            "        </rdfs:comment>\r\n" +
            "    </Class>\r\n" +
            "    <Class rdf:about=\"http://F\">\r\n" +
            "        <rdfs:comment>\r\n" +
            "            <rdf:Description rdf:nodeID=\"1058025095\">\r\n" +
            "                <rdfs:comment>E</rdfs:comment>\r\n" +
            "            </rdf:Description>\r\n" +
            "        </rdfs:comment>\r\n" +
            "    </Class>\r\n" +
            "</rdf:RDF>";
        __CLR4_5_28tf8tflvico1q3.R.inc(11548);OWLOntology o1 = loadOntologyFromString(input);
        __CLR4_5_28tf8tflvico1q3.R.inc(11549);StringDocumentTarget result = saveOntology(o1, new RDFXMLDocumentFormat());
        __CLR4_5_28tf8tflvico1q3.R.inc(11550);assertTrue(result.toString().contains("rdf:nodeID"));
    }finally{__CLR4_5_28tf8tflvico1q3.R.flushNeeded();}}
}
