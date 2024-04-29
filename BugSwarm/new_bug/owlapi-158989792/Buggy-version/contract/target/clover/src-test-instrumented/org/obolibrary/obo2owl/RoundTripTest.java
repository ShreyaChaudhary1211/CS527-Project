/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.obolibrary.obo2owl;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.obolibrary.oboformat.diff.Diff;
import org.obolibrary.oboformat.diff.OBODocDiffer;
import org.obolibrary.oboformat.model.OBODoc;
import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;

@SuppressWarnings("javadoc")
public class RoundTripTest extends OboFormatTestBasics {static class __CLR4_5_2172172lvicnz6z{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,1601,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public List<Diff> roundTripOBOURL(String fn, boolean isExpectRoundtrip) throws Exception {try{__CLR4_5_2172172lvicnz6z.R.inc(1550);
        __CLR4_5_2172172lvicnz6z.R.inc(1551);OBODoc obodoc = parseOBOURL(fn);
        __CLR4_5_2172172lvicnz6z.R.inc(1552);return roundTripOBODoc(obodoc, isExpectRoundtrip);
    }finally{__CLR4_5_2172172lvicnz6z.R.flushNeeded();}}

    public List<Diff> roundTripOBOFile(String fn, boolean isExpectRoundtrip) throws Exception {try{__CLR4_5_2172172lvicnz6z.R.inc(1553);
        __CLR4_5_2172172lvicnz6z.R.inc(1554);OBODoc obodoc = parseOBOFile(fn);
        __CLR4_5_2172172lvicnz6z.R.inc(1555);return roundTripOBODoc(obodoc, isExpectRoundtrip);
    }finally{__CLR4_5_2172172lvicnz6z.R.flushNeeded();}}

    public List<Diff> roundTripOBODoc(@Nonnull OBODoc obodoc, boolean isExpectRoundtrip) throws Exception {try{__CLR4_5_2172172lvicnz6z.R.inc(1556);
        __CLR4_5_2172172lvicnz6z.R.inc(1557);OWLOntology oo = convert(obodoc);
        __CLR4_5_2172172lvicnz6z.R.inc(1558);OBODoc obodoc2 = convert(oo);
        __CLR4_5_2172172lvicnz6z.R.inc(1559);obodoc2.check();
        __CLR4_5_2172172lvicnz6z.R.inc(1560);writeOBO(obodoc2);
        __CLR4_5_2172172lvicnz6z.R.inc(1561);List<Diff> diffs = OBODocDiffer.getDiffs(obodoc, obodoc2);
        __CLR4_5_2172172lvicnz6z.R.inc(1562);if ((((isExpectRoundtrip)&&(__CLR4_5_2172172lvicnz6z.R.iget(1563)!=0|true))||(__CLR4_5_2172172lvicnz6z.R.iget(1564)==0&false))) {{
            __CLR4_5_2172172lvicnz6z.R.inc(1565);if ((((diffs.size() > 0)&&(__CLR4_5_2172172lvicnz6z.R.iget(1566)!=0|true))||(__CLR4_5_2172172lvicnz6z.R.iget(1567)==0&false))) {{
                __CLR4_5_2172172lvicnz6z.R.inc(1568);String s1 = writeOBO(obodoc);
                __CLR4_5_2172172lvicnz6z.R.inc(1569);String s2 = writeOBO(obodoc2);
                __CLR4_5_2172172lvicnz6z.R.inc(1570);assertEquals(s1, s2);
            }
            }__CLR4_5_2172172lvicnz6z.R.inc(1571);assertEquals("Expected no diffs but " + diffs, 0, diffs.size());
        }
        }__CLR4_5_2172172lvicnz6z.R.inc(1572);return diffs;
    }finally{__CLR4_5_2172172lvicnz6z.R.flushNeeded();}}

    public boolean roundTripOWLFile(String fn, boolean isExpectRoundtrip) throws IOException,
        OWLOntologyCreationException {try{__CLR4_5_2172172lvicnz6z.R.inc(1573);
        __CLR4_5_2172172lvicnz6z.R.inc(1574);OWLOntology oo = parseOWLFile(fn);
        __CLR4_5_2172172lvicnz6z.R.inc(1575);return roundTripOWLOOntology(oo, isExpectRoundtrip);
    }finally{__CLR4_5_2172172lvicnz6z.R.flushNeeded();}}

    public boolean roundTripOWLOOntology(@Nonnull OWLOntology oo, boolean isExpectRoundtrip) throws IOException {try{__CLR4_5_2172172lvicnz6z.R.inc(1576);
        __CLR4_5_2172172lvicnz6z.R.inc(1577);OWLAPIOwl2Obo bridge = new OWLAPIOwl2Obo(m);
        __CLR4_5_2172172lvicnz6z.R.inc(1578);OBODoc obodoc = bridge.convert(oo);
        __CLR4_5_2172172lvicnz6z.R.inc(1579);writeOBO(obodoc);
        __CLR4_5_2172172lvicnz6z.R.inc(1580);obodoc.check();
        __CLR4_5_2172172lvicnz6z.R.inc(1581);OWLOntology oo2 = convert(obodoc);
        __CLR4_5_2172172lvicnz6z.R.inc(1582);writeOWL(oo2);
        __CLR4_5_2172172lvicnz6z.R.inc(1583);boolean ok = compareOWLOntologiesPartial(oo, oo2, isExpectRoundtrip, bridge.getUntranslatableAxioms());
        __CLR4_5_2172172lvicnz6z.R.inc(1584);return ok || !isExpectRoundtrip;
    }finally{__CLR4_5_2172172lvicnz6z.R.flushNeeded();}}

    private static boolean compareOWLOntologiesPartial(@Nonnull OWLOntology oo, @Nonnull OWLOntology oo2,
        boolean isExpectRoundtrip, @Nullable Collection<OWLAxiom> untranslatableAxioms) {try{__CLR4_5_2172172lvicnz6z.R.inc(1585);
        __CLR4_5_2172172lvicnz6z.R.inc(1586);if ((((isExpectRoundtrip)&&(__CLR4_5_2172172lvicnz6z.R.iget(1587)!=0|true))||(__CLR4_5_2172172lvicnz6z.R.iget(1588)==0&false))) {{
            __CLR4_5_2172172lvicnz6z.R.inc(1589);int untranslatedSize = 0;
            __CLR4_5_2172172lvicnz6z.R.inc(1590);if ((((untranslatableAxioms != null)&&(__CLR4_5_2172172lvicnz6z.R.iget(1591)!=0|true))||(__CLR4_5_2172172lvicnz6z.R.iget(1592)==0&false))) {{
                __CLR4_5_2172172lvicnz6z.R.inc(1593);untranslatedSize = untranslatableAxioms.size();
            }
            }__CLR4_5_2172172lvicnz6z.R.inc(1594);Set<OWLAxiom> expectedAxioms = oo.getAxioms();
            __CLR4_5_2172172lvicnz6z.R.inc(1595);Set<OWLAxiom> foundAxioms = oo2.getAxioms();
            __CLR4_5_2172172lvicnz6z.R.inc(1596);int expectedSize = expectedAxioms.size();
            __CLR4_5_2172172lvicnz6z.R.inc(1597);int foundSize = foundAxioms.size();
            __CLR4_5_2172172lvicnz6z.R.inc(1598);assertEquals("Expected same number of axioms", expectedSize, foundSize + untranslatedSize);
            __CLR4_5_2172172lvicnz6z.R.inc(1599);return false;
        }
        }__CLR4_5_2172172lvicnz6z.R.inc(1600);return true;
    }finally{__CLR4_5_2172172lvicnz6z.R.flushNeeded();}}
}
