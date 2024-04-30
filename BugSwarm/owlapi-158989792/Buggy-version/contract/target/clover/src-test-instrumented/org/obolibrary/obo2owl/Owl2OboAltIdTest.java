/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.obolibrary.obo2owl;

import static org.junit.Assert.assertEquals;

import java.util.Collection;
import java.util.Set;

import javax.annotation.Nonnull;

import org.junit.Test;
import org.obolibrary.obo2owl.Obo2OWLConstants.Obo2OWLVocabulary;
import org.obolibrary.oboformat.model.Clause;
import org.obolibrary.oboformat.model.Frame;
import org.obolibrary.oboformat.model.OBODoc;
import org.obolibrary.oboformat.parser.OBOFormatConstants.OboFormatTag;
import org.semanticweb.owlapi.model.*;

import com.google.common.base.Optional;

@SuppressWarnings("javadoc")
public class Owl2OboAltIdTest extends OboFormatTestBasics {static class __CLR4_5_2vlvllvicnz3n{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,1219,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testOwl2OboClass() throws Exception {__CLR4_5_2vlvllvicnz3n.R.globalSliceStart(getClass().getName(),1137);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rcnbfnvl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2vlvllvicnz3n.R.rethrow($CLV_t2$);}finally{__CLR4_5_2vlvllvicnz3n.R.globalSliceEnd(getClass().getName(),"org.obolibrary.obo2owl.Owl2OboAltIdTest.testOwl2OboClass",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1137,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rcnbfnvl() throws Exception{try{__CLR4_5_2vlvllvicnz3n.R.inc(1137);
        __CLR4_5_2vlvllvicnz3n.R.inc(1138);OWLOntology simple = m.createOntology(IRI.generateDocumentIRI());
        // add class A
        __CLR4_5_2vlvllvicnz3n.R.inc(1139);OWLClass classA = df.getOWLClass(IRI.create(Obo2OWLConstants.DEFAULT_IRI_PREFIX + "TEST_0001"));
        __CLR4_5_2vlvllvicnz3n.R.inc(1140);m.addAxiom(simple, df.getOWLDeclarationAxiom(classA));
        // add a label and OBO style ID
        __CLR4_5_2vlvllvicnz3n.R.inc(1141);addLabelAndId(classA, "test1", "TEST:0001", simple);
        // add deprecated class B as an alternate ID for A
        __CLR4_5_2vlvllvicnz3n.R.inc(1142);OWLClass classB = df.getOWLClass(IRI.create(Obo2OWLConstants.DEFAULT_IRI_PREFIX + "TEST_0002"));
        __CLR4_5_2vlvllvicnz3n.R.inc(1143);m.addAxiom(simple, df.getOWLDeclarationAxiom(classB));
        __CLR4_5_2vlvllvicnz3n.R.inc(1144);setAltId(classB, simple);
        // add comment to alt_id class, which is not expressible in OBO
        __CLR4_5_2vlvllvicnz3n.R.inc(1145);addAnnotation(classB, df.getRDFSComment(), df.getOWLLiteral("Comment"), simple);
        // translate to OBO
        __CLR4_5_2vlvllvicnz3n.R.inc(1146);OWLAPIOwl2Obo owl2obo = new OWLAPIOwl2Obo(m);
        __CLR4_5_2vlvllvicnz3n.R.inc(1147);OBODoc oboDoc = owl2obo.convert(simple);
        // check result: expect only one term frame for class TEST:0001 with
        // alt_id Test:0002
        __CLR4_5_2vlvllvicnz3n.R.inc(1148);Collection<Frame> termFrames = oboDoc.getTermFrames();
        __CLR4_5_2vlvllvicnz3n.R.inc(1149);assertEquals(1, termFrames.size());
        __CLR4_5_2vlvllvicnz3n.R.inc(1150);Frame frame = termFrames.iterator().next();
        __CLR4_5_2vlvllvicnz3n.R.inc(1151);assertEquals("TEST:0001", frame.getId());
        __CLR4_5_2vlvllvicnz3n.R.inc(1152);Collection<Clause> altIdClauses = frame.getClauses(OboFormatTag.TAG_ALT_ID);
        __CLR4_5_2vlvllvicnz3n.R.inc(1153);assertEquals(1, altIdClauses.size());
        __CLR4_5_2vlvllvicnz3n.R.inc(1154);String altId = altIdClauses.iterator().next().getValue(String.class);
        __CLR4_5_2vlvllvicnz3n.R.inc(1155);assertEquals("TEST:0002", altId);
        // roundtrip back to OWL, check that comment is still there
        __CLR4_5_2vlvllvicnz3n.R.inc(1156);OWLAPIObo2Owl obo2owl = new OWLAPIObo2Owl(m1);
        __CLR4_5_2vlvllvicnz3n.R.inc(1157);OWLOntology roundTripped = obo2owl.convert(oboDoc);
        __CLR4_5_2vlvllvicnz3n.R.inc(1158);Set<OWLAnnotationAssertionAxiom> annotations = roundTripped.getAnnotationAssertionAxioms(classB.getIRI());
        __CLR4_5_2vlvllvicnz3n.R.inc(1159);assertEquals(4, annotations.size()); // three for the alt-id plus one
                                             // for the comment
        __CLR4_5_2vlvllvicnz3n.R.inc(1160);String comment = null;
        __CLR4_5_2vlvllvicnz3n.R.inc(1161);for (OWLAnnotationAssertionAxiom ax : annotations) {{
            __CLR4_5_2vlvllvicnz3n.R.inc(1162);if ((((ax.getProperty().isComment())&&(__CLR4_5_2vlvllvicnz3n.R.iget(1163)!=0|true))||(__CLR4_5_2vlvllvicnz3n.R.iget(1164)==0&false))) {{
                __CLR4_5_2vlvllvicnz3n.R.inc(1165);Optional<OWLLiteral> asLiteral = ax.getValue().asLiteral();
                __CLR4_5_2vlvllvicnz3n.R.inc(1166);if ((((asLiteral.isPresent())&&(__CLR4_5_2vlvllvicnz3n.R.iget(1167)!=0|true))||(__CLR4_5_2vlvllvicnz3n.R.iget(1168)==0&false))) {{
                    __CLR4_5_2vlvllvicnz3n.R.inc(1169);comment = asLiteral.get().getLiteral();
                }
            }}
        }}
        }__CLR4_5_2vlvllvicnz3n.R.inc(1170);assertEquals("Comment", comment);
    }finally{__CLR4_5_2vlvllvicnz3n.R.flushNeeded();}}

    @Test
    public void testOwl2OboProperty() throws Exception {__CLR4_5_2vlvllvicnz3n.R.globalSliceStart(getClass().getName(),1171);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25crca0wj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2vlvllvicnz3n.R.rethrow($CLV_t2$);}finally{__CLR4_5_2vlvllvicnz3n.R.globalSliceEnd(getClass().getName(),"org.obolibrary.obo2owl.Owl2OboAltIdTest.testOwl2OboProperty",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1171,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25crca0wj() throws Exception{try{__CLR4_5_2vlvllvicnz3n.R.inc(1171);
        __CLR4_5_2vlvllvicnz3n.R.inc(1172);OWLOntology simple = m.createOntology(IRI.generateDocumentIRI());
        // add prop1
        __CLR4_5_2vlvllvicnz3n.R.inc(1173);OWLObjectProperty p1 = df.getOWLObjectProperty(IRI.create(Obo2OWLConstants.DEFAULT_IRI_PREFIX + "TEST_0001"));
        __CLR4_5_2vlvllvicnz3n.R.inc(1174);m.addAxiom(simple, df.getOWLDeclarationAxiom(p1));
        // add label and OBO style id for
        __CLR4_5_2vlvllvicnz3n.R.inc(1175);addLabelAndId(p1, "prop1", "TEST:0001", simple);
        // add deprecated prop 2 as an alternate ID for prop 1
        __CLR4_5_2vlvllvicnz3n.R.inc(1176);OWLObjectProperty p2 = df.getOWLObjectProperty(IRI.create(Obo2OWLConstants.DEFAULT_IRI_PREFIX + "TEST_0002"));
        __CLR4_5_2vlvllvicnz3n.R.inc(1177);m.addAxiom(simple, df.getOWLDeclarationAxiom(p2));
        __CLR4_5_2vlvllvicnz3n.R.inc(1178);setAltId(p2, simple);
        // add comment to alt_id class, which is not expressible in OBO
        __CLR4_5_2vlvllvicnz3n.R.inc(1179);addAnnotation(p2, df.getRDFSComment(), df.getOWLLiteral("Comment"), simple);
        // translate to OBO
        __CLR4_5_2vlvllvicnz3n.R.inc(1180);OWLAPIOwl2Obo owl2obo = new OWLAPIOwl2Obo(m);
        __CLR4_5_2vlvllvicnz3n.R.inc(1181);OBODoc oboDoc = owl2obo.convert(simple);
        // check result: expect only one typdef frame for prop TEST:0001 with
        // alt_id Test:0002
        __CLR4_5_2vlvllvicnz3n.R.inc(1182);Collection<Frame> termFrames = oboDoc.getTypedefFrames();
        __CLR4_5_2vlvllvicnz3n.R.inc(1183);assertEquals(1, termFrames.size());
        __CLR4_5_2vlvllvicnz3n.R.inc(1184);Frame frame = termFrames.iterator().next();
        __CLR4_5_2vlvllvicnz3n.R.inc(1185);assertEquals("TEST:0001", frame.getId());
        __CLR4_5_2vlvllvicnz3n.R.inc(1186);Collection<Clause> altIdClauses = frame.getClauses(OboFormatTag.TAG_ALT_ID);
        __CLR4_5_2vlvllvicnz3n.R.inc(1187);assertEquals(1, altIdClauses.size());
        __CLR4_5_2vlvllvicnz3n.R.inc(1188);String altId = altIdClauses.iterator().next().getValue(String.class);
        __CLR4_5_2vlvllvicnz3n.R.inc(1189);assertEquals("TEST:0002", altId);
        // roundtrip back to OWL, check that comment is still there
        __CLR4_5_2vlvllvicnz3n.R.inc(1190);OWLAPIObo2Owl obo2owl = new OWLAPIObo2Owl(m1);
        __CLR4_5_2vlvllvicnz3n.R.inc(1191);OWLOntology roundTripped = obo2owl.convert(oboDoc);
        __CLR4_5_2vlvllvicnz3n.R.inc(1192);Set<OWLAnnotationAssertionAxiom> annotations = roundTripped.getAnnotationAssertionAxioms(p2.getIRI());
        __CLR4_5_2vlvllvicnz3n.R.inc(1193);assertEquals(4, annotations.size()); // three for the alt-id plus one
                                             // for the comment
        __CLR4_5_2vlvllvicnz3n.R.inc(1194);String comment = null;
        __CLR4_5_2vlvllvicnz3n.R.inc(1195);for (OWLAnnotationAssertionAxiom ax : annotations) {{
            __CLR4_5_2vlvllvicnz3n.R.inc(1196);if ((((ax.getProperty().isComment())&&(__CLR4_5_2vlvllvicnz3n.R.iget(1197)!=0|true))||(__CLR4_5_2vlvllvicnz3n.R.iget(1198)==0&false))) {{
                __CLR4_5_2vlvllvicnz3n.R.inc(1199);Optional<OWLLiteral> asLiteral = ax.getValue().asLiteral();
                __CLR4_5_2vlvllvicnz3n.R.inc(1200);if ((((asLiteral.isPresent())&&(__CLR4_5_2vlvllvicnz3n.R.iget(1201)!=0|true))||(__CLR4_5_2vlvllvicnz3n.R.iget(1202)==0&false))) {{
                    __CLR4_5_2vlvllvicnz3n.R.inc(1203);comment = asLiteral.get().getLiteral();
                }
            }}
        }}
        }__CLR4_5_2vlvllvicnz3n.R.inc(1204);assertEquals("Comment", comment);
    }finally{__CLR4_5_2vlvllvicnz3n.R.flushNeeded();}}

    private static void addLabelAndId(OWLNamedObject obj, @Nonnull String label, String id, OWLOntology o) {try{__CLR4_5_2vlvllvicnz3n.R.inc(1205);
        __CLR4_5_2vlvllvicnz3n.R.inc(1206);OWLDataFactory f = o.getOWLOntologyManager().getOWLDataFactory();
        __CLR4_5_2vlvllvicnz3n.R.inc(1207);addAnnotation(obj, f.getRDFSLabel(), f.getOWLLiteral(label), o);
        __CLR4_5_2vlvllvicnz3n.R.inc(1208);OWLAnnotationProperty idProp = f.getOWLAnnotationProperty(OWLAPIObo2Owl.trTagToIRI(OboFormatTag.TAG_ID
            .getTag()));
        __CLR4_5_2vlvllvicnz3n.R.inc(1209);addAnnotation(obj, idProp, f.getOWLLiteral(id), o);
    }finally{__CLR4_5_2vlvllvicnz3n.R.flushNeeded();}}

    private static void setAltId(OWLNamedObject obj, OWLOntology o) {try{__CLR4_5_2vlvllvicnz3n.R.inc(1210);
        __CLR4_5_2vlvllvicnz3n.R.inc(1211);OWLDataFactory f = o.getOWLOntologyManager().getOWLDataFactory();
        __CLR4_5_2vlvllvicnz3n.R.inc(1212);addAnnotation(obj, f.getOWLAnnotationProperty(Obo2OWLVocabulary.IRI_IAO_0100001.iri), f.getOWLLiteral(
            "TEST:0001"), o);
        __CLR4_5_2vlvllvicnz3n.R.inc(1213);addAnnotation(obj, f.getOWLAnnotationProperty(Obo2OWLConstants.IRI_IAO_0000231),
            Obo2OWLConstants.IRI_IAO_0000227, o);
        __CLR4_5_2vlvllvicnz3n.R.inc(1214);addAnnotation(obj, f.getOWLDeprecated(), f.getOWLLiteral(true), o);
    }finally{__CLR4_5_2vlvllvicnz3n.R.flushNeeded();}}

    private static void addAnnotation(OWLNamedObject obj, OWLAnnotationProperty p, OWLAnnotationValue v,
        OWLOntology ont) {try{__CLR4_5_2vlvllvicnz3n.R.inc(1215);
        __CLR4_5_2vlvllvicnz3n.R.inc(1216);OWLOntologyManager m = ont.getOWLOntologyManager();
        __CLR4_5_2vlvllvicnz3n.R.inc(1217);OWLDataFactory f = m.getOWLDataFactory();
        __CLR4_5_2vlvllvicnz3n.R.inc(1218);m.addAxiom(ont, f.getOWLAnnotationAssertionAxiom(obj.getIRI(), f.getOWLAnnotation(p, v)));
    }finally{__CLR4_5_2vlvllvicnz3n.R.flushNeeded();}}
}
