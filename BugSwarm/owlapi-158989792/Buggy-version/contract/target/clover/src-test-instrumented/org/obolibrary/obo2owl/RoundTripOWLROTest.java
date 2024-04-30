/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.obolibrary.obo2owl;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.StringReader;
import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.obolibrary.oboformat.diff.Diff;
import org.obolibrary.oboformat.diff.OBODocDiffer;
import org.obolibrary.oboformat.model.Clause;
import org.obolibrary.oboformat.model.Frame;
import org.obolibrary.oboformat.model.OBODoc;
import org.obolibrary.oboformat.model.QualifierValue;
import org.obolibrary.oboformat.parser.OBOFormatConstants.OboFormatTag;
import org.obolibrary.oboformat.parser.OBOFormatParser;
import org.semanticweb.owlapi.model.OWLOntology;

/** Test for reading and converting the Relationship ontology. */
@SuppressWarnings("javadoc")
public class RoundTripOWLROTest extends RoundTripTest {static class __CLR4_5_214p14plvicnz6j{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,1488,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Test that the converted RO from OWL to OBO can be written and parsed back
     * into OBO, and also round-trip back into OWL.
     */
    @Test
    public void testRoundTrip() throws Exception {__CLR4_5_214p14plvicnz6j.R.globalSliceStart(getClass().getName(),1465);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yhw67s14p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214p14plvicnz6j.R.rethrow($CLV_t2$);}finally{__CLR4_5_214p14plvicnz6j.R.globalSliceEnd(getClass().getName(),"org.obolibrary.obo2owl.RoundTripOWLROTest.testRoundTrip",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1465,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yhw67s14p() throws Exception{try{__CLR4_5_214p14plvicnz6j.R.inc(1465);
        __CLR4_5_214p14plvicnz6j.R.inc(1466);OWLOntology oo1 = parseOWLFile("ro.owl");
        __CLR4_5_214p14plvicnz6j.R.inc(1467);OBODoc oboDoc1 = convert(oo1);
        // write OBO
        __CLR4_5_214p14plvicnz6j.R.inc(1468);String oboString = renderOboToString(oboDoc1);
        // parse OBO
        __CLR4_5_214p14plvicnz6j.R.inc(1469);OBOFormatParser p = new OBOFormatParser();
        __CLR4_5_214p14plvicnz6j.R.inc(1470);OBODoc oboDoc2 = p
                .parse(new BufferedReader(new StringReader(oboString)));
        // check that the annotations are pre-served on the property values
        __CLR4_5_214p14plvicnz6j.R.inc(1471);Frame typedefFrame = oboDoc2.getTypedefFrame("RO:0002224");
        __CLR4_5_214p14plvicnz6j.R.inc(1472);@SuppressWarnings("null")
        Collection<Clause> propertyValues = typedefFrame
                .getClauses(OboFormatTag.TAG_PROPERTY_VALUE);
        __CLR4_5_214p14plvicnz6j.R.inc(1473);boolean found = false;
        __CLR4_5_214p14plvicnz6j.R.inc(1474);for (Clause clause : propertyValues) {{
            __CLR4_5_214p14plvicnz6j.R.inc(1475);if (((("IAO:0000118".equals(clause.getValue())
                    && "started by".equals(clause.getValue2()))&&(__CLR4_5_214p14plvicnz6j.R.iget(1476)!=0|true))||(__CLR4_5_214p14plvicnz6j.R.iget(1477)==0&false))) {{
                __CLR4_5_214p14plvicnz6j.R.inc(1478);Collection<QualifierValue> values = clause.getQualifierValues();
                __CLR4_5_214p14plvicnz6j.R.inc(1479);assertEquals(1, values.size());
                __CLR4_5_214p14plvicnz6j.R.inc(1480);QualifierValue value = values.iterator().next();
                __CLR4_5_214p14plvicnz6j.R.inc(1481);assertEquals("http://purl.obolibrary.org/obo/IAO_0000116",
                        value.getQualifier());
                __CLR4_5_214p14plvicnz6j.R.inc(1482);assertEquals("From Allen terminology", value.getValue());
                __CLR4_5_214p14plvicnz6j.R.inc(1483);found = true;
            }
        }}
        }__CLR4_5_214p14plvicnz6j.R.inc(1484);assertTrue(
                "The expected annotations on the property value are missing.",
                found);
        // convert back into OWL
        __CLR4_5_214p14plvicnz6j.R.inc(1485);convert(oboDoc2);
        // check that the two oboDocs are equal
        __CLR4_5_214p14plvicnz6j.R.inc(1486);List<Diff> diffs = OBODocDiffer.getDiffs(oboDoc1, oboDoc2);
        // the input uses version 1.4, but the output is hardcoded to be 1.2
        __CLR4_5_214p14plvicnz6j.R.inc(1487);assertEquals(1, diffs.size());
    }finally{__CLR4_5_214p14plvicnz6j.R.flushNeeded();}}
}
