/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.semanticweb.owlapi.profiles.test;

import static org.junit.Assert.*;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.api.test.baseclasses.TestBase;
import org.semanticweb.owlapi.io.StringDocumentSource;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.OWLRuntimeException;
import org.semanticweb.owlapi.profiles.*;

@SuppressWarnings("javadoc")
public class ProfileBase extends TestBase {public static class __CLR4_5_2bflbfllvico2cs{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,14846,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Nonnull protected String example = "<rdf:RDF xml:base=\"http://example.org/\" xmlns=\"http://example.org/\" xmlns:owl=\"http://www.w3.org/2002/07/owl#\" xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\">";
    @Nonnull protected String rdf = "<rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\" xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\" xmlns:owl=\"http://www.w3.org/2002/07/owl#\" ";
    @Nonnull protected String head = "<rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\" xmlns:owl=\"http://www.w3.org/2002/07/owl#\" ";
    @Nonnull protected String head2 = "<rdf:RDF xml:base=\"urn:test\" xmlns:owl=\"http://www.w3.org/2002/07/owl#\" xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\" xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\">";
    @Nonnull protected String head3 = "<rdf:RDF xml:base=\"urn:test\" xmlns=\"urn:test#\" xmlns:owl=\"http://www.w3.org/2002/07/owl#\" xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\" xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\">";

    private static OWLProfileReport el(OWLOntology in) {try{__CLR4_5_2bflbfllvico2cs.R.inc(14817);
        __CLR4_5_2bflbfllvico2cs.R.inc(14818);return new OWL2ELProfile().checkOntology(in);
    }finally{__CLR4_5_2bflbfllvico2cs.R.flushNeeded();}}

    private static OWLProfileReport ql(OWLOntology in) {try{__CLR4_5_2bflbfllvico2cs.R.inc(14819);
        __CLR4_5_2bflbfllvico2cs.R.inc(14820);return new OWL2QLProfile().checkOntology(in);
    }finally{__CLR4_5_2bflbfllvico2cs.R.flushNeeded();}}

    private static OWLProfileReport rl(OWLOntology in) {try{__CLR4_5_2bflbfllvico2cs.R.inc(14821);
        __CLR4_5_2bflbfllvico2cs.R.inc(14822);return new OWL2RLProfile().checkOntology(in);
    }finally{__CLR4_5_2bflbfllvico2cs.R.flushNeeded();}}

    private static OWLProfileReport dl(OWLOntology in) {try{__CLR4_5_2bflbfllvico2cs.R.inc(14823);
        __CLR4_5_2bflbfllvico2cs.R.inc(14824);return new OWL2DLProfile().checkOntology(in);
    }finally{__CLR4_5_2bflbfllvico2cs.R.flushNeeded();}}

    boolean in(@Nonnull OWLProfile p, @Nonnull String in) {try{__CLR4_5_2bflbfllvico2cs.R.inc(14825);
        __CLR4_5_2bflbfllvico2cs.R.inc(14826);return p.checkOntology(o(in)).isInProfile();
    }finally{__CLR4_5_2bflbfllvico2cs.R.flushNeeded();}}

    @Nonnull
        OWLOntology o(@Nonnull String in) {try{__CLR4_5_2bflbfllvico2cs.R.inc(14827);
        __CLR4_5_2bflbfllvico2cs.R.inc(14828);try {
            __CLR4_5_2bflbfllvico2cs.R.inc(14829);return m.loadOntologyFromOntologyDocument(new StringDocumentSource(in));
        } catch (OWLOntologyCreationException e) {
            __CLR4_5_2bflbfllvico2cs.R.inc(14830);throw new OWLRuntimeException(e);
        }
    }finally{__CLR4_5_2bflbfllvico2cs.R.flushNeeded();}}

    void compareOntologies(@Nonnull String in1, @Nonnull String in2) {try{__CLR4_5_2bflbfllvico2cs.R.inc(14831);
        __CLR4_5_2bflbfllvico2cs.R.inc(14832);OWLOntology o1 = o(in1);
        __CLR4_5_2bflbfllvico2cs.R.inc(14833);OWLOntology o2 = o(in2);
        __CLR4_5_2bflbfllvico2cs.R.inc(14834);assertEquals(o1.getAxioms(), o2.getAxioms());
    }finally{__CLR4_5_2bflbfllvico2cs.R.flushNeeded();}}

    protected void test(@Nonnull String in, boolean el, boolean ql, boolean rl, boolean dl) {try{__CLR4_5_2bflbfllvico2cs.R.inc(14835);
        __CLR4_5_2bflbfllvico2cs.R.inc(14836);OWLOntology o = o(in);
        __CLR4_5_2bflbfllvico2cs.R.inc(14837);assertTrue("empty ontology", !o.getAxioms().isEmpty());
        __CLR4_5_2bflbfllvico2cs.R.inc(14838);OWLProfileReport elReport = el(o);
        __CLR4_5_2bflbfllvico2cs.R.inc(14839);assertEquals(elReport.toString(), el, elReport.isInProfile());
        __CLR4_5_2bflbfllvico2cs.R.inc(14840);OWLProfileReport qlReport = ql(o);
        __CLR4_5_2bflbfllvico2cs.R.inc(14841);assertEquals(qlReport.toString(), ql, qlReport.isInProfile());
        __CLR4_5_2bflbfllvico2cs.R.inc(14842);OWLProfileReport rlReport = rl(o);
        __CLR4_5_2bflbfllvico2cs.R.inc(14843);assertEquals(rlReport.toString(), rl, rlReport.isInProfile());
        __CLR4_5_2bflbfllvico2cs.R.inc(14844);OWLProfileReport dlReport = dl(o);
        __CLR4_5_2bflbfllvico2cs.R.inc(14845);assertEquals(dlReport.toString(), dl, dlReport.isInProfile());
    }finally{__CLR4_5_2bflbfllvico2cs.R.flushNeeded();}}
}
