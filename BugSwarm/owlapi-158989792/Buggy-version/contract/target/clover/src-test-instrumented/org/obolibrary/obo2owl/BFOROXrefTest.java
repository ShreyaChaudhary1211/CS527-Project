/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.obolibrary.obo2owl;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import javax.annotation.Nonnull;

import org.junit.Test;
import org.obolibrary.oboformat.model.Clause;
import org.obolibrary.oboformat.model.Frame;
import org.obolibrary.oboformat.model.OBODoc;
import org.obolibrary.oboformat.model.Xref;
import org.obolibrary.oboformat.parser.OBOFormatConstants.OboFormatTag;
import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.*;

@SuppressWarnings({ "javadoc", "null" })
public class BFOROXrefTest extends OboFormatTestBasics {static class __CLR4_5_2h8h8lvicnyxm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,680,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static final OWLAnnotationProperty OBO_ID = OWLManager.getOWLDataFactory().getOWLAnnotationProperty(IRI
        .create("http://www.geneontology.org/formats/oboInOwl#id"));
    @Nonnull private final OWLOntology owlOnt = convertOBOFile("rel_xref_test.obo");

    @Test
    public void testCorrectIdAnnotationCount() {__CLR4_5_2h8h8lvicnyxm.R.globalSliceStart(getClass().getName(),620);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2421ymsh8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2h8h8lvicnyxm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2h8h8lvicnyxm.R.globalSliceEnd(getClass().getName(),"org.obolibrary.obo2owl.BFOROXrefTest.testCorrectIdAnnotationCount",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),620,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2421ymsh8(){try{__CLR4_5_2h8h8lvicnyxm.R.inc(620);
        __CLR4_5_2h8h8lvicnyxm.R.inc(621);Set<OWLObjectProperty> ops = owlOnt.getObjectPropertiesInSignature();
        __CLR4_5_2h8h8lvicnyxm.R.inc(622);assertEquals(4, ops.size());
        // Check ID Property Count Exactly 1
        __CLR4_5_2h8h8lvicnyxm.R.inc(623);assertAnnotationPropertyCountEquals(owlOnt, IRI.create("http://purl.obolibrary.org/obo/BAR_0000001"), OBO_ID,
            1);
        __CLR4_5_2h8h8lvicnyxm.R.inc(624);assertAnnotationPropertyCountEquals(owlOnt, IRI.create("http://purl.obolibrary.org/obo/RO_0002111"), OBO_ID, 1);
        __CLR4_5_2h8h8lvicnyxm.R.inc(625);assertAnnotationPropertyCountEquals(owlOnt, IRI.create("http://purl.obolibrary.org/obo/BFO_0000050"), OBO_ID,
            1);
        __CLR4_5_2h8h8lvicnyxm.R.inc(626);assertAnnotationPropertyCountEquals(owlOnt, IRI.create("http://purl.obolibrary.org/obo/BFO_0000051"), OBO_ID,
            2);
    }finally{__CLR4_5_2h8h8lvicnyxm.R.flushNeeded();}}

    @Test
    public void testRelationXrefConversion() {__CLR4_5_2h8h8lvicnyxm.R.globalSliceStart(getClass().getName(),627);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22yb7euhf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2h8h8lvicnyxm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2h8h8lvicnyxm.R.globalSliceEnd(getClass().getName(),"org.obolibrary.obo2owl.BFOROXrefTest.testRelationXrefConversion",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),627,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22yb7euhf(){try{__CLR4_5_2h8h8lvicnyxm.R.inc(627);
        // test initial conversion
        __CLR4_5_2h8h8lvicnyxm.R.inc(628);Set<OWLObjectProperty> ops = owlOnt.getObjectPropertiesInSignature();
        __CLR4_5_2h8h8lvicnyxm.R.inc(629);assertEquals(4, ops.size());
        __CLR4_5_2h8h8lvicnyxm.R.inc(630);Set<OWLAnnotationAssertionAxiom> aaas = owlOnt.getAnnotationAssertionAxioms(IRI.create(
            "http://purl.obolibrary.org/obo/BFO_0000051"));
        __CLR4_5_2h8h8lvicnyxm.R.inc(631);boolean ok = false;
        __CLR4_5_2h8h8lvicnyxm.R.inc(632);for (OWLAnnotationAssertionAxiom a : aaas) {{
            __CLR4_5_2h8h8lvicnyxm.R.inc(633);if ((((a.getProperty().getIRI().toString().equals("http://www.geneontology.org/formats/oboInOwl#shorthand"))&&(__CLR4_5_2h8h8lvicnyxm.R.iget(634)!=0|true))||(__CLR4_5_2h8h8lvicnyxm.R.iget(635)==0&false))) {{
                __CLR4_5_2h8h8lvicnyxm.R.inc(636);OWLLiteral v = (OWLLiteral) a.getValue();
                __CLR4_5_2h8h8lvicnyxm.R.inc(637);if ((((v.getLiteral().equals("has_part"))&&(__CLR4_5_2h8h8lvicnyxm.R.iget(638)!=0|true))||(__CLR4_5_2h8h8lvicnyxm.R.iget(639)==0&false))) {{
                    __CLR4_5_2h8h8lvicnyxm.R.inc(640);ok = true;
                }
            }}
        }}
        }__CLR4_5_2h8h8lvicnyxm.R.inc(641);assertTrue(!aaas.isEmpty());
        __CLR4_5_2h8h8lvicnyxm.R.inc(642);assertTrue(ok);
        __CLR4_5_2h8h8lvicnyxm.R.inc(643);aaas = owlOnt.getAnnotationAssertionAxioms(IRI.create("http://purl.obolibrary.org/obo/BFO_0000050"));
        __CLR4_5_2h8h8lvicnyxm.R.inc(644);assertTrue(!aaas.isEmpty());
        __CLR4_5_2h8h8lvicnyxm.R.inc(645);aaas = owlOnt.getAnnotationAssertionAxioms(IRI.create("http://purl.obolibrary.org/obo/RO_0002111"));
        __CLR4_5_2h8h8lvicnyxm.R.inc(646);assertTrue(!aaas.isEmpty());
        __CLR4_5_2h8h8lvicnyxm.R.inc(647);aaas = owlOnt.getAnnotationAssertionAxioms(IRI.create("http://purl.obolibrary.org/obo/BAR_0000001"));
        __CLR4_5_2h8h8lvicnyxm.R.inc(648);assertTrue(!aaas.isEmpty());
        __CLR4_5_2h8h8lvicnyxm.R.inc(649);OWLAPIOwl2Obo revbridge = new OWLAPIOwl2Obo(m);
        __CLR4_5_2h8h8lvicnyxm.R.inc(650);OBODoc d2 = revbridge.convert(owlOnt);
        __CLR4_5_2h8h8lvicnyxm.R.inc(651);Frame partOf = d2.getTypedefFrame("part_of");
        __CLR4_5_2h8h8lvicnyxm.R.inc(652);Collection<Clause> xrcs = partOf.getClauses(OboFormatTag.TAG_XREF);
        __CLR4_5_2h8h8lvicnyxm.R.inc(653);boolean okBfo = false;
        __CLR4_5_2h8h8lvicnyxm.R.inc(654);boolean okOboRel = false;
        __CLR4_5_2h8h8lvicnyxm.R.inc(655);for (Clause c : xrcs) {{
            __CLR4_5_2h8h8lvicnyxm.R.inc(656);Xref value = c.getValue(Xref.class);
            __CLR4_5_2h8h8lvicnyxm.R.inc(657);if ((((value.getIdref().equals("BFO:0000050"))&&(__CLR4_5_2h8h8lvicnyxm.R.iget(658)!=0|true))||(__CLR4_5_2h8h8lvicnyxm.R.iget(659)==0&false))) {{
                __CLR4_5_2h8h8lvicnyxm.R.inc(660);okBfo = true;
            }
            }__CLR4_5_2h8h8lvicnyxm.R.inc(661);if ((((value.getIdref().equals("OBO_REL:part_of"))&&(__CLR4_5_2h8h8lvicnyxm.R.iget(662)!=0|true))||(__CLR4_5_2h8h8lvicnyxm.R.iget(663)==0&false))) {{
                __CLR4_5_2h8h8lvicnyxm.R.inc(664);okOboRel = true;
            }
        }}
        }__CLR4_5_2h8h8lvicnyxm.R.inc(665);assertTrue(okBfo);
        __CLR4_5_2h8h8lvicnyxm.R.inc(666);assertTrue(okOboRel);
        __CLR4_5_2h8h8lvicnyxm.R.inc(667);Frame a = d2.getTermFrame("TEST:a");
        __CLR4_5_2h8h8lvicnyxm.R.inc(668);Clause rc = a.getClause(OboFormatTag.TAG_RELATIONSHIP);
        __CLR4_5_2h8h8lvicnyxm.R.inc(669);assertEquals("part_of", rc.getValue());
        __CLR4_5_2h8h8lvicnyxm.R.inc(670);assertEquals("TEST:b", rc.getValue2());
    }finally{__CLR4_5_2h8h8lvicnyxm.R.flushNeeded();}}

    private static void assertAnnotationPropertyCountEquals(@Nonnull OWLOntology owlOnt, @Nonnull IRI subjectIRI,
        OWLAnnotationProperty property, int expected) {try{__CLR4_5_2h8h8lvicnyxm.R.inc(671);
        __CLR4_5_2h8h8lvicnyxm.R.inc(672);Set<OWLAnnotationAssertionAxiom> aaas = owlOnt.getAnnotationAssertionAxioms(subjectIRI);
        __CLR4_5_2h8h8lvicnyxm.R.inc(673);List<OWLAnnotationAssertionAxiom> matches = new ArrayList<>();
        __CLR4_5_2h8h8lvicnyxm.R.inc(674);for (OWLAnnotationAssertionAxiom annotationAssertionAxiom : aaas) {{
            __CLR4_5_2h8h8lvicnyxm.R.inc(675);if ((((annotationAssertionAxiom.getProperty().equals(property))&&(__CLR4_5_2h8h8lvicnyxm.R.iget(676)!=0|true))||(__CLR4_5_2h8h8lvicnyxm.R.iget(677)==0&false))) {{
                __CLR4_5_2h8h8lvicnyxm.R.inc(678);matches.add(annotationAssertionAxiom);
            }
        }}
        }__CLR4_5_2h8h8lvicnyxm.R.inc(679);assertEquals(subjectIRI + " has too many annotations of type " + property + ":\n\t" + matches, expected, matches
            .size());
    }finally{__CLR4_5_2h8h8lvicnyxm.R.flushNeeded();}}
}
