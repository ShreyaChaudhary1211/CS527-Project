/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.semanticweb.owlapi.rdf;

import static org.junit.Assert.*;

import java.util.Set;

import javax.annotation.Nonnull;

import org.junit.Test;
import org.semanticweb.owlapi.api.test.baseclasses.TestBase;
import org.semanticweb.owlapi.formats.RDFXMLDocumentFormat;
import org.semanticweb.owlapi.model.*;

/**
 * Created by ses on 3/10/14.
 */
@SuppressWarnings("javadoc")
public class TestUndeclaredAnnotation extends TestBase {static class __CLR4_5_2blyblylvico2dv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,15086,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testRDFXMLUsingUndeclaredAnnotationProperty() throws OWLOntologyCreationException {__CLR4_5_2blyblylvico2dv.R.globalSliceStart(getClass().getName(),15046);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2x7hvebbly();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2blyblylvico2dv.R.rethrow($CLV_t2$);}finally{__CLR4_5_2blyblylvico2dv.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.rdf.TestUndeclaredAnnotation.testRDFXMLUsingUndeclaredAnnotationProperty",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15046,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2x7hvebbly() throws OWLOntologyCreationException{try{__CLR4_5_2blyblylvico2dv.R.inc(15046);
        __CLR4_5_2blyblylvico2dv.R.inc(15047);String input = "<?xml version=\"1.0\"?>\n"
            + "<!DOCTYPE rdf:RDF [\n <!ENTITY ns \"http://example.com/ns#\" >\n <!ENTITY owl \"http://www.w3.org/2002/07/owl#\" >\n <!ENTITY xsd \"http://www.w3.org/2001/XMLSchema#\" >\n <!ENTITY xml \"http://www.w3.org/XML/1998/namespace\" >\n <!ENTITY rdfs \"http://www.w3.org/2000/01/rdf-schema#\" >\n <!ENTITY rdf \"http://www.w3.org/1999/02/22-rdf-syntax-ns#\" >\n ]>\n"
            + "<rdf:RDF xmlns=\"http://www.org/\" xml:base=\"http://www.org/\" xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\" xmlns:ns=\"http://example.com/ns#\" xmlns:owl=\"http://www.w3.org/2002/07/owl#\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\" xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\" xmlns:xml=\"http://www.w3.org/XML/1998/namespace\">\n"
            + "    <owl:Ontology rdf:about=\"http://www.org/\"/>\n"
            + "    <rdf:Description rdf:about=\"&ns;test\"><ns:rel><rdf:Description ns:pred =\"Not visible\"/></ns:rel></rdf:Description>\n"
            + "</rdf:RDF>";
        __CLR4_5_2blyblylvico2dv.R.inc(15048);OWLOntology oo = loadOntologyFromString(input);
        __CLR4_5_2blyblylvico2dv.R.inc(15049);@SuppressWarnings("null")
        @Nonnull
        RDFXMLDocumentFormat format = (RDFXMLDocumentFormat) oo.getOWLOntologyManager().getOntologyFormat(oo);
        __CLR4_5_2blyblylvico2dv.R.inc(15050);assertEquals("Should have no unparsed triples", 0, format.getOntologyLoaderMetaData().getUnparsedTriples()
            .size());
        __CLR4_5_2blyblylvico2dv.R.inc(15051);Set<OWLAnnotationAssertionAxiom> annotationAxioms = oo.getAxioms(AxiomType.ANNOTATION_ASSERTION);
        __CLR4_5_2blyblylvico2dv.R.inc(15052);assertEquals("annotation axiom count should be 2", 2, annotationAxioms.size());
        __CLR4_5_2blyblylvico2dv.R.inc(15053);OWLAnnotationProperty relProperty = df.getOWLAnnotationProperty(IRI.create("http://example.com/ns#rel"));
        __CLR4_5_2blyblylvico2dv.R.inc(15054);OWLAnnotationProperty predProperty = df.getOWLAnnotationProperty(IRI.create("http://example.com/ns#pred"));
        __CLR4_5_2blyblylvico2dv.R.inc(15055);Set<OWLAnonymousIndividual> anonymousIndividualSet = oo.getAnonymousIndividuals();
        __CLR4_5_2blyblylvico2dv.R.inc(15056);assertEquals("should be one anonymous individual", 1, anonymousIndividualSet.size());
        __CLR4_5_2blyblylvico2dv.R.inc(15057);@Nonnull
        OWLAnonymousIndividual anonymousIndividual = anonymousIndividualSet.iterator().next();
        __CLR4_5_2blyblylvico2dv.R.inc(15058);OWLAnnotationAssertionAxiom relAx = df.getOWLAnnotationAssertionAxiom(relProperty, IRI.create(
            "http://example.com/ns#test"), anonymousIndividual);
        __CLR4_5_2blyblylvico2dv.R.inc(15059);OWLLiteral notVisible = df.getOWLLiteral("Not visible", "");
        __CLR4_5_2blyblylvico2dv.R.inc(15060);OWLAnnotationAssertionAxiom predAx = df.getOWLAnnotationAssertionAxiom(predProperty, anonymousIndividual,
            notVisible);
        __CLR4_5_2blyblylvico2dv.R.inc(15061);assertTrue("should contain relax", annotationAxioms.contains(relAx));
        __CLR4_5_2blyblylvico2dv.R.inc(15062);assertTrue("should contain predax", annotationAxioms.contains(predAx));
    }finally{__CLR4_5_2blyblylvico2dv.R.flushNeeded();}}

    @Test
    public void testTurtleUsingUndeclaredAnnotationProperty() throws OWLOntologyCreationException {__CLR4_5_2blyblylvico2dv.R.globalSliceStart(getClass().getName(),15063);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2d9fj1obmf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2blyblylvico2dv.R.rethrow($CLV_t2$);}finally{__CLR4_5_2blyblylvico2dv.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.rdf.TestUndeclaredAnnotation.testTurtleUsingUndeclaredAnnotationProperty",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15063,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2d9fj1obmf() throws OWLOntologyCreationException{try{__CLR4_5_2blyblylvico2dv.R.inc(15063);
        __CLR4_5_2blyblylvico2dv.R.inc(15064);String input = "@prefix rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#> .\n"
            + "        @prefix rdfs: <http://www.w3.org/2000/01/rdf-schema#> .\n"
            + "        @prefix owl: <http://www.w3.org/2002/07/owl#> .\n"
            + "        @prefix ex: <http://www.example.org/> .\n" + "        [] rdfs:label \"Visible\" ;\n"
            + "           ex:pred ex:Visible ;\n" + "           ex:pred \"Not visible\" .\n"
            + "        ex:subj rdfs:label \"Visible\" .\n" + "        ex:subj ex:pred \"Visible\" .";
        __CLR4_5_2blyblylvico2dv.R.inc(15065);OWLOntology oo = loadOntologyFromString(input);
        __CLR4_5_2blyblylvico2dv.R.inc(15066);OWLAnnotationProperty pred = df.getOWLAnnotationProperty(IRI.create("http://www.example.org/pred"));
        __CLR4_5_2blyblylvico2dv.R.inc(15067);int countLabels = 0;
        __CLR4_5_2blyblylvico2dv.R.inc(15068);int countPreds = 0;
        __CLR4_5_2blyblylvico2dv.R.inc(15069);int countBNodeAnnotations = 0;
        __CLR4_5_2blyblylvico2dv.R.inc(15070);for (OWLAnnotationAssertionAxiom oa : oo.getAxioms(AxiomType.ANNOTATION_ASSERTION)) {{
            __CLR4_5_2blyblylvico2dv.R.inc(15071);if ((((oa.getProperty().equals(df.getRDFSLabel()))&&(__CLR4_5_2blyblylvico2dv.R.iget(15072)!=0|true))||(__CLR4_5_2blyblylvico2dv.R.iget(15073)==0&false))) {{
                __CLR4_5_2blyblylvico2dv.R.inc(15074);countLabels++;
            }
            }__CLR4_5_2blyblylvico2dv.R.inc(15075);if ((((oa.getProperty().equals(pred))&&(__CLR4_5_2blyblylvico2dv.R.iget(15076)!=0|true))||(__CLR4_5_2blyblylvico2dv.R.iget(15077)==0&false))) {{
                __CLR4_5_2blyblylvico2dv.R.inc(15078);countPreds++;
            }
            }__CLR4_5_2blyblylvico2dv.R.inc(15079);if ((((oa.getSubject() instanceof OWLAnonymousIndividual)&&(__CLR4_5_2blyblylvico2dv.R.iget(15080)!=0|true))||(__CLR4_5_2blyblylvico2dv.R.iget(15081)==0&false))) {{
                __CLR4_5_2blyblylvico2dv.R.inc(15082);countBNodeAnnotations++;
            }
        }}
        }__CLR4_5_2blyblylvico2dv.R.inc(15083);assertEquals(3, countPreds);
        __CLR4_5_2blyblylvico2dv.R.inc(15084);assertEquals(2, countLabels);
        __CLR4_5_2blyblylvico2dv.R.inc(15085);assertEquals(3, countBNodeAnnotations);
    }finally{__CLR4_5_2blyblylvico2dv.R.flushNeeded();}}
}
