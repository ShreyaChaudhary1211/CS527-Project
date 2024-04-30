/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.obolibrary.obo2owl;

import static org.junit.Assert.*;

import java.util.Set;

import org.junit.Test;
import org.obolibrary.oboformat.model.OBODoc;
import org.semanticweb.owlapi.model.AxiomType;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLAnnotation;
import org.semanticweb.owlapi.model.OWLAnnotationProperty;
import org.semanticweb.owlapi.model.OWLAnnotationValue;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLClassExpression;
import org.semanticweb.owlapi.model.OWLLiteral;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLSubClassOfAxiom;

@SuppressWarnings("javadoc")
public class RoundTripOboAnnotations extends RoundTripTest {public static class __CLR4_5_215c15clvicnz6o{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,1525,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testIsInferredAnnotation() throws Exception {try{__CLR4_5_215c15clvicnz6o.R.inc(1488);
        __CLR4_5_215c15clvicnz6o.R.inc(1489);OBODoc input = parseOBOFile("is_inferred_annotation.obo");
        __CLR4_5_215c15clvicnz6o.R.inc(1490);OWLOntology owl = convert(input);
        // check round trip
        __CLR4_5_215c15clvicnz6o.R.inc(1491);OBODoc output = convert(owl);
        __CLR4_5_215c15clvicnz6o.R.inc(1492);String outObo = renderOboToString(output);
        __CLR4_5_215c15clvicnz6o.R.inc(1493);assertEquals(readResource("is_inferred_annotation.obo"), outObo);
        // check owl
        __CLR4_5_215c15clvicnz6o.R.inc(1494);IRI t1 = IRI.create("http://purl.obolibrary.org/obo/TEST_0001");
        __CLR4_5_215c15clvicnz6o.R.inc(1495);IRI t3 = IRI.create("http://purl.obolibrary.org/obo/TEST_0003");
        __CLR4_5_215c15clvicnz6o.R.inc(1496);IRI isInferredIRI = IRI.create(Obo2OWLConstants.OIOVOCAB_IRI_PREFIX,
                "is_inferred");
        __CLR4_5_215c15clvicnz6o.R.inc(1497);boolean hasAnnotation = false;
        __CLR4_5_215c15clvicnz6o.R.inc(1498);Set<OWLSubClassOfAxiom> axioms = owl.getAxioms(AxiomType.SUBCLASS_OF);
        __CLR4_5_215c15clvicnz6o.R.inc(1499);for (OWLSubClassOfAxiom axiom : axioms) {{
            __CLR4_5_215c15clvicnz6o.R.inc(1500);OWLClassExpression superClassCE = axiom.getSuperClass();
            __CLR4_5_215c15clvicnz6o.R.inc(1501);OWLClassExpression subClassCE = axiom.getSubClass();
            __CLR4_5_215c15clvicnz6o.R.inc(1502);if ((((!superClassCE.isAnonymous() && !subClassCE.isAnonymous())&&(__CLR4_5_215c15clvicnz6o.R.iget(1503)!=0|true))||(__CLR4_5_215c15clvicnz6o.R.iget(1504)==0&false))) {{
                __CLR4_5_215c15clvicnz6o.R.inc(1505);OWLClass superClass = (OWLClass) superClassCE;
                __CLR4_5_215c15clvicnz6o.R.inc(1506);OWLClass subClass = (OWLClass) subClassCE;
                __CLR4_5_215c15clvicnz6o.R.inc(1507);if ((((superClass.getIRI().equals(t1)
                        && subClass.getIRI().equals(t3))&&(__CLR4_5_215c15clvicnz6o.R.iget(1508)!=0|true))||(__CLR4_5_215c15clvicnz6o.R.iget(1509)==0&false))) {{
                    __CLR4_5_215c15clvicnz6o.R.inc(1510);Set<OWLAnnotation> annotations = axiom.getAnnotations();
                    __CLR4_5_215c15clvicnz6o.R.inc(1511);for (OWLAnnotation owlAnnotation : annotations) {{
                        __CLR4_5_215c15clvicnz6o.R.inc(1512);OWLAnnotationProperty property = owlAnnotation
                                .getProperty();
                        __CLR4_5_215c15clvicnz6o.R.inc(1513);if ((((property.getIRI().equals(isInferredIRI))&&(__CLR4_5_215c15clvicnz6o.R.iget(1514)!=0|true))||(__CLR4_5_215c15clvicnz6o.R.iget(1515)==0&false))) {{
                            __CLR4_5_215c15clvicnz6o.R.inc(1516);OWLAnnotationValue value = owlAnnotation.getValue();
                            __CLR4_5_215c15clvicnz6o.R.inc(1517);if ((((value instanceof OWLLiteral)&&(__CLR4_5_215c15clvicnz6o.R.iget(1518)!=0|true))||(__CLR4_5_215c15clvicnz6o.R.iget(1519)==0&false))) {{
                                __CLR4_5_215c15clvicnz6o.R.inc(1520);OWLLiteral literal = (OWLLiteral) value;
                                __CLR4_5_215c15clvicnz6o.R.inc(1521);assertEquals("true", literal.getLiteral());
                            } }else {{
                                __CLR4_5_215c15clvicnz6o.R.inc(1522);fail("The value is not the expected type, expected OWLiteral but was: "
                                        + value.getClass().getName());
                            }
                            }__CLR4_5_215c15clvicnz6o.R.inc(1523);hasAnnotation = true;
                        }
                    }}
                }}
            }}
        }}
        }__CLR4_5_215c15clvicnz6o.R.inc(1524);assertTrue(
                "The sub class reation between t3 and t1 should have an is_inferred=true annotation",
                hasAnnotation);
    }finally{__CLR4_5_215c15clvicnz6o.R.flushNeeded();}}
}
