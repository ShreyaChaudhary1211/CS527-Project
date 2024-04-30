/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.obolibrary.obo2owl;

import static org.junit.Assert.assertEquals;
import static org.semanticweb.owlapi.apibinding.OWLFunctionalSyntaxFactory.*;
import static org.semanticweb.owlapi.vocab.OWL2Datatype.XSD_STRING;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;
import org.semanticweb.owlapi.api.test.baseclasses.TestBase;
import org.semanticweb.owlapi.io.StringDocumentSource;
import org.semanticweb.owlapi.model.*;

@SuppressWarnings("javadoc")
public class LoadAnonymousTestCase extends TestBase {static class __CLR4_5_2p5p5lvicnz20{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,942,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void shouldLoad() throws OWLOntologyCreationException {__CLR4_5_2p5p5lvicnz20.R.globalSliceStart(getClass().getName(),905);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hi2aowp5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2p5p5lvicnz20.R.rethrow($CLV_t2$);}finally{__CLR4_5_2p5p5lvicnz20.R.globalSliceEnd(getClass().getName(),"org.obolibrary.obo2owl.LoadAnonymousTestCase.shouldLoad",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),905,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hi2aowp5() throws OWLOntologyCreationException{try{__CLR4_5_2p5p5lvicnz20.R.inc(905);
        __CLR4_5_2p5p5lvicnz20.R.inc(906);String input = "format-version: 1.2\n" + "date: 27:06:2013 17:08\n" + "saved-by: gkoutos\n"
            + "auto-generated-by: OBO-Edit 2.3\n" + "subsetdef: abnormal_slim \"Abnormal/normal slim\"\n"
            + "subsetdef: absent_slim \"Absent/present slim\"\n" + "subsetdef: attribute_slim \"Attribute slim\"\n"
            + "subsetdef: cell_quality \"cell_quality\"\n" + "subsetdef: disposition_slim \"Disposition slim\"\n"
            + "subsetdef: mpath_slim \"Pathology slim\"\n" + "subsetdef: prefix_slim \"prefix slim\"\n"
            + "subsetdef: relational_slim \"Relational slim: types of quality that require an additional entity in order to exist\"\n"
            + "subsetdef: scalar_slim \"Scalar slim\"\n" + "subsetdef: unit_group_slim \"unit group slim\"\n"
            + "subsetdef: unit_slim \"unit slim\"\n" + "subsetdef: value_slim \"Value slim\"\n"
            + "default-namespace: quality\n" + "namespace-id-rule: * UO:$sequence(7,0,9999999)$\n"
            + "remark: Filtered by Ancestor ID equals \"UO:0000000\"\n" + "ontology: uo\n" + "ontology: pato\n"
            + "ontology: pato\n" + "ontology: pato\n" + '\n' + "[Term]\n" + "id: UO:0000000\n" + "name: unit\n"
            + "namespace: unit.ontology\n"
            + "def: \"A unit of measurement is a standardized quantity of a physical quality.\" [Wikipedia:Wikipedia]\n"
            + "created_by: george gkoutos\n" + '\n' + "[Term]\n" + "id: UO:0000001\n" + "name: length unit\n"
            + "namespace: unit.ontology\n"
            + "def: \"A unit which is a standard measure of the distance between two points.\" [Wikipedia:Wikipedia]\n"
            + "subset: unit_group_slim\n" + "is_a: UO:0000000 ! unit\n"
            + "relationship: is_unit_of PATO:0001708 ! 1-D extent\n" + "created_by: george gkoutos";
        __CLR4_5_2p5p5lvicnz20.R.inc(907);StringDocumentSource streamDocumentSource = new StringDocumentSource(input);
        __CLR4_5_2p5p5lvicnz20.R.inc(908);OWLOntologyLoaderConfiguration loaderConfig = new OWLOntologyLoaderConfiguration()
            .setMissingImportHandlingStrategy(MissingImportHandlingStrategy.SILENT);
        __CLR4_5_2p5p5lvicnz20.R.inc(909);OWLOntology ontology = m.loadOntologyFromOntologyDocument(streamDocumentSource, loaderConfig);
        __CLR4_5_2p5p5lvicnz20.R.inc(910);OWLAnnotationProperty date = AnnotationProperty(IRI("http://www.geneontology.org/formats/oboInOwl#date"));
        __CLR4_5_2p5p5lvicnz20.R.inc(911);OWLAnnotationProperty mpathSlim = AnnotationProperty(IRI("http://purl.obolibrary.org/obo/uo#mpath_slim"));
        __CLR4_5_2p5p5lvicnz20.R.inc(912);OWLAnnotationProperty subsetProperty = AnnotationProperty(IRI(
            "http://www.geneontology.org/formats/oboInOwl#SubsetProperty"));
        __CLR4_5_2p5p5lvicnz20.R.inc(913);OWLAnnotationProperty attributeSlim = AnnotationProperty(IRI(
            "http://purl.obolibrary.org/obo/uo#attribute_slim"));
        __CLR4_5_2p5p5lvicnz20.R.inc(914);OWLAnnotationProperty hasOBONamespace = AnnotationProperty(IRI(
            "http://www.geneontology.org/formats/oboInOwl#hasOBONamespace"));
        __CLR4_5_2p5p5lvicnz20.R.inc(915);OWLAnnotationProperty autogeneratedby = AnnotationProperty(IRI(
            "http://www.geneontology.org/formats/oboInOwl#auto-generated-by"));
        __CLR4_5_2p5p5lvicnz20.R.inc(916);OWLAnnotationProperty hasDbXref = AnnotationProperty(IRI(
            "http://www.geneontology.org/formats/oboInOwl#hasDbXref"));
        __CLR4_5_2p5p5lvicnz20.R.inc(917);OWLAnnotationProperty defaultnamespace = AnnotationProperty(IRI(
            "http://www.geneontology.org/formats/oboInOwl#default-namespace"));
        __CLR4_5_2p5p5lvicnz20.R.inc(918);OWLAnnotationProperty hasOBOFormatVersion = AnnotationProperty(IRI(
            "http://www.geneontology.org/formats/oboInOwl#hasOBOFormatVersion"));
        __CLR4_5_2p5p5lvicnz20.R.inc(919);OWLAnnotationProperty iao0000115 = AnnotationProperty(IRI("http://purl.obolibrary.org/obo/IAO_0000115"));
        __CLR4_5_2p5p5lvicnz20.R.inc(920);OWLAnnotationProperty namespaceIdRule = AnnotationProperty(IRI(
            "http://www.geneontology.org/formats/oboInOwl#NamespaceIdRule"));
        __CLR4_5_2p5p5lvicnz20.R.inc(921);OWLAnnotationProperty createdBy = AnnotationProperty(IRI(
            "http://www.geneontology.org/formats/oboInOwl#created_by"));
        __CLR4_5_2p5p5lvicnz20.R.inc(922);OWLAnnotationProperty inSubset = AnnotationProperty(IRI(
            "http://www.geneontology.org/formats/oboInOwl#inSubset"));
        __CLR4_5_2p5p5lvicnz20.R.inc(923);OWLAnnotationProperty savedby = AnnotationProperty(IRI(
            "http://www.geneontology.org/formats/oboInOwl#saved-by"));
        __CLR4_5_2p5p5lvicnz20.R.inc(924);OWLClass pato0001708 = Class(IRI("http://purl.obolibrary.org/obo/PATO_0001708"));
        __CLR4_5_2p5p5lvicnz20.R.inc(925);OWLClass uo0 = Class(IRI("http://purl.obolibrary.org/obo/UO_0000000"));
        __CLR4_5_2p5p5lvicnz20.R.inc(926);OWLClass uo1 = Class(IRI("http://purl.obolibrary.org/obo/UO_0000001"));
        __CLR4_5_2p5p5lvicnz20.R.inc(927);OWLAnnotationProperty id = AnnotationProperty(IRI("http://www.geneontology.org/formats/oboInOwl#id"));
        __CLR4_5_2p5p5lvicnz20.R.inc(928);OWLAnnotationProperty abnormalSlim = AnnotationProperty(IRI("http://purl.obolibrary.org/obo/uo#abnormal_slim"));
        __CLR4_5_2p5p5lvicnz20.R.inc(929);OWLAnnotationProperty scalarSlim = AnnotationProperty(IRI("http://purl.obolibrary.org/obo/uo#scalar_slim"));
        __CLR4_5_2p5p5lvicnz20.R.inc(930);OWLLiteral literal = Literal("Wikipedia:Wikipedia", XSD_STRING);
        __CLR4_5_2p5p5lvicnz20.R.inc(931);OWLAnnotationProperty unitSlim = AnnotationProperty(IRI("http://purl.obolibrary.org/obo/uo#unit_slim"));
        __CLR4_5_2p5p5lvicnz20.R.inc(932);OWLAnnotationProperty absentSlim = AnnotationProperty(IRI("http://purl.obolibrary.org/obo/uo#absent_slim"));
        __CLR4_5_2p5p5lvicnz20.R.inc(933);OWLObjectProperty isUnitOf = ObjectProperty(IRI("http://purl.obolibrary.org/obo/uo#is_unit_of"));
        __CLR4_5_2p5p5lvicnz20.R.inc(934);OWLAnnotationProperty cellQuality = AnnotationProperty(IRI("http://purl.obolibrary.org/obo/uo#cell_quality"));
        __CLR4_5_2p5p5lvicnz20.R.inc(935);OWLAnnotationProperty unitGroupSlim = AnnotationProperty(IRI(
            "http://purl.obolibrary.org/obo/uo#unit_group_slim"));
        __CLR4_5_2p5p5lvicnz20.R.inc(936);OWLAnnotationProperty valueSlim = AnnotationProperty(IRI("http://purl.obolibrary.org/obo/uo#value_slim"));
        __CLR4_5_2p5p5lvicnz20.R.inc(937);OWLAnnotationProperty prefixSlim = AnnotationProperty(IRI("http://purl.obolibrary.org/obo/uo#prefix_slim"));
        __CLR4_5_2p5p5lvicnz20.R.inc(938);OWLAnnotationProperty dispositionSlim = AnnotationProperty(IRI(
            "http://purl.obolibrary.org/obo/uo#disposition_slim"));
        __CLR4_5_2p5p5lvicnz20.R.inc(939);OWLAnnotationProperty relationalSlim = AnnotationProperty(IRI(
            "http://purl.obolibrary.org/obo/uo#relational_slim"));
        __CLR4_5_2p5p5lvicnz20.R.inc(940);Set<OWLAxiom> expected = new HashSet<>(Arrays.asList(Declaration(date), Declaration(autogeneratedby),
            Declaration(hasDbXref), Declaration(defaultnamespace), Declaration(subsetProperty), Declaration(
                hasOBOFormatVersion), Declaration(iao0000115), Declaration(namespaceIdRule), Declaration(createdBy),
            Declaration(inSubset), Declaration(savedby), Declaration(pato0001708), Declaration(uo0), Declaration(
                RDFSComment()), Declaration(RDFSLabel()), Declaration(hasOBONamespace), Declaration(uo1), Declaration(
                    id), SubAnnotationPropertyOf(mpathSlim, subsetProperty), AnnotationAssertion(hasOBONamespace, uo1
                        .getIRI(), Literal("unit.ontology", XSD_STRING)), AnnotationAssertion(RDFSComment(),
                            attributeSlim.getIRI(), Literal("Attribute slim", XSD_STRING)), AnnotationAssertion(
                                RDFSLabel(), iao0000115.getIRI(), Literal("definition", XSD_STRING)),
            AnnotationAssertion(hasOBONamespace, uo0.getIRI(), Literal("unit.ontology", XSD_STRING)),
            SubAnnotationPropertyOf(unitSlim, subsetProperty), AnnotationAssertion(RDFSComment(), valueSlim.getIRI(),
                Literal("Value slim", XSD_STRING)), SubAnnotationPropertyOf(absentSlim, subsetProperty),
            SubAnnotationPropertyOf(abnormalSlim, subsetProperty), AnnotationAssertion(RDFSLabel(), uo1.getIRI(),
                Literal("length unit", XSD_STRING)), AnnotationAssertion(RDFSLabel(), hasOBOFormatVersion.getIRI(),
                    Literal("has_obo_format_version", XSD_STRING)), AnnotationAssertion(RDFSLabel(), namespaceIdRule
                        .getIRI(), Literal("namespace-id-rule", XSD_STRING)), SubClassOf(uo1, ObjectSomeValuesFrom(
                            isUnitOf, pato0001708)), SubAnnotationPropertyOf(cellQuality, subsetProperty),
            AnnotationAssertion(RDFSComment(), relationalSlim.getIRI(), Literal(
                "Relational slim: types of quality that require an additional entity in order to exist", XSD_STRING)),
            SubAnnotationPropertyOf(prefixSlim, subsetProperty), SubAnnotationPropertyOf(scalarSlim, subsetProperty),
            AnnotationAssertion(RDFSComment(), scalarSlim.getIRI(), Literal("Scalar slim", XSD_STRING)),
            AnnotationAssertion(RDFSComment(), abnormalSlim.getIRI(), Literal("Abnormal/normal slim", XSD_STRING)),
            SubAnnotationPropertyOf(attributeSlim, subsetProperty), AnnotationAssertion(RDFSLabel(), uo0.getIRI(),
                Literal("unit", XSD_STRING)), SubAnnotationPropertyOf(dispositionSlim, subsetProperty),
            AnnotationAssertion(RDFSComment(), unitSlim.getIRI(), Literal("unit slim", XSD_STRING)),
            SubAnnotationPropertyOf(relationalSlim, subsetProperty), AnnotationAssertion(id, uo1.getIRI(), Literal(
                "UO:0000001", XSD_STRING)), AnnotationAssertion(RDFSComment(), mpathSlim.getIRI(), Literal(
                    "Pathology slim", XSD_STRING)), AnnotationAssertion(createdBy, uo1.getIRI(), Literal(
                        "george gkoutos", XSD_STRING)), AnnotationAssertion(RDFSLabel(), hasDbXref.getIRI(), Literal(
                            "database_cross_reference", XSD_STRING)), SubClassOf(uo1, uo0), AnnotationAssertion(
                                RDFSLabel(), hasOBONamespace.getIRI(), Literal("has_obo_namespace", XSD_STRING)),
            AnnotationAssertion(id, uo0.getIRI(), Literal("UO:0000000", XSD_STRING)), AnnotationAssertion(createdBy, uo0
                .getIRI(), Literal("george gkoutos", XSD_STRING)), AnnotationAssertion(RDFSComment(), prefixSlim
                    .getIRI(), Literal("prefix slim", XSD_STRING)), AnnotationAssertion(RDFSComment(), cellQuality
                        .getIRI(), Literal("cell_quality", XSD_STRING)), AnnotationAssertion(RDFSComment(), absentSlim
                            .getIRI(), Literal("Absent/present slim", XSD_STRING)), AnnotationAssertion(RDFSLabel(),
                                subsetProperty.getIRI(), Literal("subset_property", XSD_STRING)),
            SubAnnotationPropertyOf(unitGroupSlim, subsetProperty), AnnotationAssertion(RDFSComment(), unitGroupSlim
                .getIRI(), Literal("unit group slim", XSD_STRING)), AnnotationAssertion(RDFSComment(), dispositionSlim
                    .getIRI(), Literal("Disposition slim", XSD_STRING)), AnnotationAssertion(RDFSLabel(), inSubset
                        .getIRI(), Literal("in_subset", XSD_STRING)), SubAnnotationPropertyOf(valueSlim,
                            subsetProperty), AnnotationAssertion(inSubset, uo1.getIRI(), unitGroupSlim.getIRI()), df
                                .getOWLAnnotationAssertionAxiom(iao0000115, uo0.getIRI(), Literal(
                                    "A unit of measurement is a standardized quantity of a physical quality.",
                                    XSD_STRING), singleton(Annotation(hasDbXref, literal))), df
                                        .getOWLAnnotationAssertionAxiom(iao0000115, uo1.getIRI(), Literal(
                                            "A unit which is a standard measure of the distance between two points.",
                                            XSD_STRING), singleton(Annotation(hasDbXref, literal)))));
        __CLR4_5_2p5p5lvicnz20.R.inc(941);assertEquals(expected, ontology.getAxioms());
    }finally{__CLR4_5_2p5p5lvicnz20.R.flushNeeded();}}
}
