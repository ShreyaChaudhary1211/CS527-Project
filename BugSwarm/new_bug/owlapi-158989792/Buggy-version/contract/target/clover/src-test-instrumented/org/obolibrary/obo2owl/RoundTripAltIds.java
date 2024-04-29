/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.obolibrary.obo2owl;

import static org.junit.Assert.*;

import javax.annotation.Nonnull;

import org.junit.Test;
import org.obolibrary.obo2owl.Obo2OWLConstants.Obo2OWLVocabulary;
import org.obolibrary.oboformat.model.OBODoc;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLAnnotationAssertionAxiom;
import org.semanticweb.owlapi.model.OWLAnnotationProperty;
import org.semanticweb.owlapi.model.OWLAnnotationValue;
import org.semanticweb.owlapi.model.OWLOntology;

import com.google.common.base.Optional;

@SuppressWarnings("javadoc")
public class RoundTripAltIds extends RoundTripTest {public static class __CLR4_5_2zzzzlvicnz5m{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,1336,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testAltIds() throws Exception {try{__CLR4_5_2zzzzlvicnz5m.R.inc(1295);
        __CLR4_5_2zzzzlvicnz5m.R.inc(1296);OBODoc input = parseOBOFile("alt_id_test.obo");
        __CLR4_5_2zzzzlvicnz5m.R.inc(1297);OWLOntology owl = convert(input);
        // check round trip
        __CLR4_5_2zzzzlvicnz5m.R.inc(1298);OBODoc output = convert(owl);
        __CLR4_5_2zzzzlvicnz5m.R.inc(1299);String outObo = renderOboToString(output);
        __CLR4_5_2zzzzlvicnz5m.R.inc(1300);assertEquals(readResource("alt_id_test.obo").trim(), outObo.trim());
        // check owl
        // check that both alt_id is declared as deprecated class and has
        // appropriate annotations
        __CLR4_5_2zzzzlvicnz5m.R.inc(1301);IRI alt_id_t1 = IRI.create("http://purl.obolibrary.org/obo/TEST_1000");
        __CLR4_5_2zzzzlvicnz5m.R.inc(1302);IRI alt_id_r1 = IRI
                .create("http://purl.obolibrary.org/obo/TEST_REL_1000");
        __CLR4_5_2zzzzlvicnz5m.R.inc(1303);checkAsAltId(alt_id_t1, owl, "TEST:0001");
        __CLR4_5_2zzzzlvicnz5m.R.inc(1304);checkAsAltId(alt_id_r1, owl, "TEST_REL:0001");
    }finally{__CLR4_5_2zzzzlvicnz5m.R.flushNeeded();}}

    private static void checkAsAltId(@Nonnull IRI iri, OWLOntology ont,
            String replacedBy) {try{__CLR4_5_2zzzzlvicnz5m.R.inc(1305);
        __CLR4_5_2zzzzlvicnz5m.R.inc(1306);String altId = null;
        __CLR4_5_2zzzzlvicnz5m.R.inc(1307);boolean isMerged = false;
        __CLR4_5_2zzzzlvicnz5m.R.inc(1308);boolean isDeprecated = false;
        __CLR4_5_2zzzzlvicnz5m.R.inc(1309);for (OWLAnnotationAssertionAxiom axiom : ont
                .getAnnotationAssertionAxioms(iri)) {{
            __CLR4_5_2zzzzlvicnz5m.R.inc(1310);OWLAnnotationProperty prop = axiom.getProperty();
            __CLR4_5_2zzzzlvicnz5m.R.inc(1311);if ((((prop.isDeprecated())&&(__CLR4_5_2zzzzlvicnz5m.R.iget(1312)!=0|true))||(__CLR4_5_2zzzzlvicnz5m.R.iget(1313)==0&false))) {{
                __CLR4_5_2zzzzlvicnz5m.R.inc(1314);isDeprecated = true;
            } }else {__CLR4_5_2zzzzlvicnz5m.R.inc(1315);if ((((Obo2OWLConstants.IRI_IAO_0000231.equals(prop.getIRI()))&&(__CLR4_5_2zzzzlvicnz5m.R.iget(1316)!=0|true))||(__CLR4_5_2zzzzlvicnz5m.R.iget(1317)==0&false))) {{
                __CLR4_5_2zzzzlvicnz5m.R.inc(1318);OWLAnnotationValue value = axiom.getValue();
                __CLR4_5_2zzzzlvicnz5m.R.inc(1319);Optional<IRI> asIRI = value.asIRI();
                __CLR4_5_2zzzzlvicnz5m.R.inc(1320);if ((((asIRI.isPresent())&&(__CLR4_5_2zzzzlvicnz5m.R.iget(1321)!=0|true))||(__CLR4_5_2zzzzlvicnz5m.R.iget(1322)==0&false))) {{
                    __CLR4_5_2zzzzlvicnz5m.R.inc(1323);isMerged = Obo2OWLConstants.IRI_IAO_0000227.equals(asIRI
                            .get());
                }
            }} }else {__CLR4_5_2zzzzlvicnz5m.R.inc(1324);if ((((Obo2OWLVocabulary.IRI_IAO_0100001.iri.equals(prop
                    .getIRI()))&&(__CLR4_5_2zzzzlvicnz5m.R.iget(1325)!=0|true))||(__CLR4_5_2zzzzlvicnz5m.R.iget(1326)==0&false))) {{
                __CLR4_5_2zzzzlvicnz5m.R.inc(1327);OWLAnnotationValue value = axiom.getValue();
                __CLR4_5_2zzzzlvicnz5m.R.inc(1328);Optional<IRI> asIRI = value.asIRI();
                __CLR4_5_2zzzzlvicnz5m.R.inc(1329);if ((((asIRI.isPresent())&&(__CLR4_5_2zzzzlvicnz5m.R.iget(1330)!=0|true))||(__CLR4_5_2zzzzlvicnz5m.R.iget(1331)==0&false))) {{
                    __CLR4_5_2zzzzlvicnz5m.R.inc(1332);altId = OWLAPIOwl2Obo.getIdentifier(asIRI.get());
                }
            }}
        }}}}
        }__CLR4_5_2zzzzlvicnz5m.R.inc(1333);assertTrue(isMerged);
        __CLR4_5_2zzzzlvicnz5m.R.inc(1334);assertTrue(isDeprecated);
        __CLR4_5_2zzzzlvicnz5m.R.inc(1335);assertEquals(replacedBy, altId);
    }finally{__CLR4_5_2zzzzlvicnz5m.R.flushNeeded();}}
}
