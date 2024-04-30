/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.semanticweb.owlapi.api.test.syntax;

import static org.junit.Assert.*;
import static org.semanticweb.owlapi.apibinding.OWLFunctionalSyntaxFactory.IRI;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.annotation.Nonnull;

import org.junit.Test;
import org.semanticweb.owlapi.api.test.baseclasses.TestBase;
import org.semanticweb.owlapi.formats.FunctionalSyntaxDocumentFormat;
import org.semanticweb.owlapi.formats.TurtleDocumentFormat;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.OWLOntologyStorageException;
import org.semanticweb.owlapi.vocab.Namespaces;
import org.semanticweb.owlapi.vocab.OWLRDFVocabulary;

/**
 * Created by ses on 6/23/14.
 */
@SuppressWarnings("javadoc")
public class IRIShorteningTestCase extends TestBase {static class __CLR4_5_287p87plvico1m5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,10676,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testIriEqualToPrefixNotShortenedInFSS() throws Exception {__CLR4_5_287p87plvico1m5.R.globalSliceStart(getClass().getName(),10645);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2x70jj887p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_287p87plvico1m5.R.rethrow($CLV_t2$);}finally{__CLR4_5_287p87plvico1m5.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.IRIShorteningTestCase.testIriEqualToPrefixNotShortenedInFSS",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10645,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2x70jj887p() throws Exception{try{__CLR4_5_287p87plvico1m5.R.inc(10645);
        __CLR4_5_287p87plvico1m5.R.inc(10646);OWLOntology o = createTestOntology();
        __CLR4_5_287p87plvico1m5.R.inc(10647);String output = saveOntology(o, new FunctionalSyntaxDocumentFormat())
            .toString();
        __CLR4_5_287p87plvico1m5.R.inc(10648);matchExact(output, "NamedIndividual(rdf:)", false);
        __CLR4_5_287p87plvico1m5.R.inc(10649);matchExact(output, "NamedIndividual(rdf:type)", true);
    }finally{__CLR4_5_287p87plvico1m5.R.flushNeeded();}}

    public void matchExact(String output, String text, boolean expected) {try{__CLR4_5_287p87plvico1m5.R.inc(10650);
        __CLR4_5_287p87plvico1m5.R.inc(10651);String message = "should " + ((((expected )&&(__CLR4_5_287p87plvico1m5.R.iget(10652)!=0|true))||(__CLR4_5_287p87plvico1m5.R.iget(10653)==0&false))? "" : "not ") + "contain" + text
            + " - " + output;
        __CLR4_5_287p87plvico1m5.R.inc(10654);assertEquals(message, expected, output.contains(text));
    }finally{__CLR4_5_287p87plvico1m5.R.flushNeeded();}}

    @Test
    public void testIriEqualToPrefixShortenedInTurtle() throws Exception {__CLR4_5_287p87plvico1m5.R.globalSliceStart(getClass().getName(),10655);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lnvpkp87z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_287p87plvico1m5.R.rethrow($CLV_t2$);}finally{__CLR4_5_287p87plvico1m5.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.IRIShorteningTestCase.testIriEqualToPrefixShortenedInTurtle",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10655,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lnvpkp87z() throws Exception{try{__CLR4_5_287p87plvico1m5.R.inc(10655);
        __CLR4_5_287p87plvico1m5.R.inc(10656);OWLOntology o = createTestOntology();
        __CLR4_5_287p87plvico1m5.R.inc(10657);String output = saveOntology(o, new TurtleDocumentFormat()).toString();
        __CLR4_5_287p87plvico1m5.R.inc(10658);matchRegex(output, "rdf:\\s+rdf:type\\s+owl:NamedIndividual");
        __CLR4_5_287p87plvico1m5.R.inc(10659);matchRegex(output, "rdf:type\\s+rdf:type\\s+owl:NamedIndividual");
    }finally{__CLR4_5_287p87plvico1m5.R.flushNeeded();}}

    public void matchRegex(String output, String regex) {try{__CLR4_5_287p87plvico1m5.R.inc(10660);
        __CLR4_5_287p87plvico1m5.R.inc(10661);Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        __CLR4_5_287p87plvico1m5.R.inc(10662);Matcher matcher = pattern.matcher(output);
        __CLR4_5_287p87plvico1m5.R.inc(10663);boolean found = matcher.find();
        __CLR4_5_287p87plvico1m5.R.inc(10664);assertTrue("should  contain " + regex + " - " + output, found);
    }finally{__CLR4_5_287p87plvico1m5.R.flushNeeded();}}

    @Nonnull
    private OWLOntology createTestOntology()
        throws OWLOntologyCreationException {try{__CLR4_5_287p87plvico1m5.R.inc(10665);
        __CLR4_5_287p87plvico1m5.R.inc(10666);OWLOntology o = m.createOntology();
        __CLR4_5_287p87plvico1m5.R.inc(10667);OWLNamedIndividual i = df.getOWLNamedIndividual(IRI(Namespaces.RDF
            .getPrefixIRI()));
        __CLR4_5_287p87plvico1m5.R.inc(10668);m.addAxiom(o, df.getOWLDeclarationAxiom(i));
        __CLR4_5_287p87plvico1m5.R.inc(10669);i = df.getOWLNamedIndividual(OWLRDFVocabulary.RDF_TYPE.getIRI());
        __CLR4_5_287p87plvico1m5.R.inc(10670);m.addAxiom(o, df.getOWLDeclarationAxiom(i));
        __CLR4_5_287p87plvico1m5.R.inc(10671);return o;
    }finally{__CLR4_5_287p87plvico1m5.R.flushNeeded();}}

    @Test
    public void shouldOutputURNsCorrectly() throws OWLOntologyCreationException,
        OWLOntologyStorageException {__CLR4_5_287p87plvico1m5.R.globalSliceStart(getClass().getName(),10672);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_242z92088g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_287p87plvico1m5.R.rethrow($CLV_t2$);}finally{__CLR4_5_287p87plvico1m5.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.IRIShorteningTestCase.shouldOutputURNsCorrectly",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10672,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_242z92088g() throws OWLOntologyCreationException, OWLOntologyStorageException{try{__CLR4_5_287p87plvico1m5.R.inc(10672);
        __CLR4_5_287p87plvico1m5.R.inc(10673);OWLOntology o = m.createOntology(IRI.create("urn:ontology:test"));
        __CLR4_5_287p87plvico1m5.R.inc(10674);m.addAxiom(o, df.getOWLObjectPropertyAssertionAxiom(df
            .getOWLObjectProperty(IRI.create("urn:p")), df
                .getOWLNamedIndividual(IRI.create("urn:test")), df
                    .getOWLNamedIndividual(IRI.create("urn:other:test"))));
        __CLR4_5_287p87plvico1m5.R.inc(10675);equal(o, roundTrip(o));
    }finally{__CLR4_5_287p87plvico1m5.R.flushNeeded();}}
}
