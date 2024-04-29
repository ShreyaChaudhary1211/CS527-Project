/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.semanticweb.owlapi.api.test.syntax;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import javax.annotation.Nonnull;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.expression.OWLEntityChecker;
import org.semanticweb.owlapi.manchestersyntax.parser.ManchesterOWLSyntaxTokenizer;
import org.semanticweb.owlapi.manchestersyntax.renderer.ParserException;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLAnnotationProperty;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLDataFactory;
import org.semanticweb.owlapi.model.OWLDataProperty;
import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLObjectProperty;
import org.semanticweb.owlapi.util.mansyntax.ManchesterOWLSyntaxParser;

import uk.ac.manchester.cs.owl.owlapi.OWLDataFactoryImpl;

/**
 * Some tests that ensure the correct token and token position are returned when
 * errors are encountered.
 * 
 * @author Matthew Horridge, Stanford University, Bio-Medical Informatics
 *         Research Group, Date: 01/04/2014
 */
@SuppressWarnings({ "javadoc", "null" })
@RunWith(MockitoJUnitRunner.class)
public class ManchesterOWLSyntaxParserErrorsTestCase {static class __CLR4_5_28cr8crlvico1n7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,11033,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Mock
    @Nonnull
    protected OWLEntityChecker entityChecker;
    private ParserWrapper parser;

    @Before
    public void setUp() {try{__CLR4_5_28cr8crlvico1n7.R.inc(10827);
        __CLR4_5_28cr8crlvico1n7.R.inc(10828);OWLDataFactory dataFactory = new OWLDataFactoryImpl();
        __CLR4_5_28cr8crlvico1n7.R.inc(10829);OWLClass cls = mock(OWLClass.class);
        __CLR4_5_28cr8crlvico1n7.R.inc(10830);when(cls.getIRI()).thenReturn(mock(IRI.class));
        __CLR4_5_28cr8crlvico1n7.R.inc(10831);when(entityChecker.getOWLClass("C")).thenReturn(cls);
        __CLR4_5_28cr8crlvico1n7.R.inc(10832);OWLClass clsC1 = mock(OWLClass.class);
        __CLR4_5_28cr8crlvico1n7.R.inc(10833);when(clsC1.getIRI()).thenReturn(mock(IRI.class));
        __CLR4_5_28cr8crlvico1n7.R.inc(10834);when(entityChecker.getOWLClass("C1")).thenReturn(clsC1);
        __CLR4_5_28cr8crlvico1n7.R.inc(10835);OWLObjectProperty oP = mock(OWLObjectProperty.class);
        __CLR4_5_28cr8crlvico1n7.R.inc(10836);when(oP.getIRI()).thenReturn(mock(IRI.class));
        __CLR4_5_28cr8crlvico1n7.R.inc(10837);when(oP.asOWLObjectProperty()).thenReturn(oP);
        __CLR4_5_28cr8crlvico1n7.R.inc(10838);when(entityChecker.getOWLObjectProperty("oP")).thenReturn(oP);
        __CLR4_5_28cr8crlvico1n7.R.inc(10839);when(entityChecker.getOWLDataProperty("dP")).thenReturn(
                mock(OWLDataProperty.class));
        __CLR4_5_28cr8crlvico1n7.R.inc(10840);when(entityChecker.getOWLAnnotationProperty("aP")).thenReturn(
                mock(OWLAnnotationProperty.class));
        __CLR4_5_28cr8crlvico1n7.R.inc(10841);when(entityChecker.getOWLAnnotationProperty("rdfs:comment"))
                .thenReturn(dataFactory.getRDFSComment());
        __CLR4_5_28cr8crlvico1n7.R.inc(10842);OWLNamedIndividual ind = mock(OWLNamedIndividual.class);
        __CLR4_5_28cr8crlvico1n7.R.inc(10843);when(entityChecker.getOWLIndividual("ind")).thenReturn(ind);
        __CLR4_5_28cr8crlvico1n7.R.inc(10844);when(ind.asOWLNamedIndividual()).thenReturn(ind);
        __CLR4_5_28cr8crlvico1n7.R.inc(10845);parser = new ParserWrapper();
    }finally{__CLR4_5_28cr8crlvico1n7.R.flushNeeded();}}

    @Test
    public void unknownClassNameShouldCauseException() {__CLR4_5_28cr8crlvico1n7.R.globalSliceStart(getClass().getName(),10846);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2csdotj8da();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28cr8crlvico1n7.R.rethrow($CLV_t2$);}finally{__CLR4_5_28cr8crlvico1n7.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.ManchesterOWLSyntaxParserErrorsTestCase.unknownClassNameShouldCauseException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10846,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2csdotj8da(){try{__CLR4_5_28cr8crlvico1n7.R.inc(10846);
        __CLR4_5_28cr8crlvico1n7.R.inc(10847);checkForExceptionAt("Class: X", 7, "X");
    }finally{__CLR4_5_28cr8crlvico1n7.R.flushNeeded();}}

    @Test
    public void unknownObjectPropertyNameShouldCauseException() {__CLR4_5_28cr8crlvico1n7.R.globalSliceStart(getClass().getName(),10848);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n1z0nr8dc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28cr8crlvico1n7.R.rethrow($CLV_t2$);}finally{__CLR4_5_28cr8crlvico1n7.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.ManchesterOWLSyntaxParserErrorsTestCase.unknownObjectPropertyNameShouldCauseException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10848,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n1z0nr8dc(){try{__CLR4_5_28cr8crlvico1n7.R.inc(10848);
        __CLR4_5_28cr8crlvico1n7.R.inc(10849);checkForExceptionAt("ObjectProperty: P", 16, "P");
    }finally{__CLR4_5_28cr8crlvico1n7.R.flushNeeded();}}

    @Test
    public void unknownDataPropertyNameShouldCauseException() {__CLR4_5_28cr8crlvico1n7.R.globalSliceStart(getClass().getName(),10850);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lwqu7o8de();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28cr8crlvico1n7.R.rethrow($CLV_t2$);}finally{__CLR4_5_28cr8crlvico1n7.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.ManchesterOWLSyntaxParserErrorsTestCase.unknownDataPropertyNameShouldCauseException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10850,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lwqu7o8de(){try{__CLR4_5_28cr8crlvico1n7.R.inc(10850);
        __CLR4_5_28cr8crlvico1n7.R.inc(10851);checkForExceptionAt("DataProperty: D", 14, "D");
    }finally{__CLR4_5_28cr8crlvico1n7.R.flushNeeded();}}

    @Test
    public void unknownAnnotationPropertyNameShouldCauseException() {__CLR4_5_28cr8crlvico1n7.R.globalSliceStart(getClass().getName(),10852);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qjffaf8dg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28cr8crlvico1n7.R.rethrow($CLV_t2$);}finally{__CLR4_5_28cr8crlvico1n7.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.ManchesterOWLSyntaxParserErrorsTestCase.unknownAnnotationPropertyNameShouldCauseException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10852,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qjffaf8dg(){try{__CLR4_5_28cr8crlvico1n7.R.inc(10852);
        __CLR4_5_28cr8crlvico1n7.R.inc(10853);checkForExceptionAt("AnnotationProperty: A", 20, "A");
    }finally{__CLR4_5_28cr8crlvico1n7.R.flushNeeded();}}

    @Test
    public void unknownNamedIndividualShouldCauseException() {__CLR4_5_28cr8crlvico1n7.R.globalSliceStart(getClass().getName(),10854);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gle1mw8di();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28cr8crlvico1n7.R.rethrow($CLV_t2$);}finally{__CLR4_5_28cr8crlvico1n7.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.ManchesterOWLSyntaxParserErrorsTestCase.unknownNamedIndividualShouldCauseException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10854,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gle1mw8di(){try{__CLR4_5_28cr8crlvico1n7.R.inc(10854);
        __CLR4_5_28cr8crlvico1n7.R.inc(10855);checkForExceptionAt("Individual: I", 12, "I");
    }finally{__CLR4_5_28cr8crlvico1n7.R.flushNeeded();}}

    @Test
    public void unknownDatatypeNameShouldCauseException() {__CLR4_5_28cr8crlvico1n7.R.globalSliceStart(getClass().getName(),10856);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2b4tzq18dk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28cr8crlvico1n7.R.rethrow($CLV_t2$);}finally{__CLR4_5_28cr8crlvico1n7.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.ManchesterOWLSyntaxParserErrorsTestCase.unknownDatatypeNameShouldCauseException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10856,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2b4tzq18dk(){try{__CLR4_5_28cr8crlvico1n7.R.inc(10856);
        __CLR4_5_28cr8crlvico1n7.R.inc(10857);checkForExceptionAt("Datatype: D", 10, "D");
    }finally{__CLR4_5_28cr8crlvico1n7.R.flushNeeded();}}

    @Test
    public void missingLiteralTypeShouldCauseException() {__CLR4_5_28cr8crlvico1n7.R.globalSliceStart(getClass().getName(),10858);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2egpwj8dm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28cr8crlvico1n7.R.rethrow($CLV_t2$);}finally{__CLR4_5_28cr8crlvico1n7.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.ManchesterOWLSyntaxParserErrorsTestCase.missingLiteralTypeShouldCauseException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10858,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2egpwj8dm(){try{__CLR4_5_28cr8crlvico1n7.R.inc(10858);
        __CLR4_5_28cr8crlvico1n7.R.inc(10859);String input = "Class: C Annotations: rdfs:comment \"comment\"^^";
        __CLR4_5_28cr8crlvico1n7.R.inc(10860);checkForExceptionAtEOF(input);
    }finally{__CLR4_5_28cr8crlvico1n7.R.flushNeeded();}}

    @Test
    public void prematureEOFInDeclarationShouldCauseParseException() {__CLR4_5_28cr8crlvico1n7.R.globalSliceStart(getClass().getName(),10861);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uuept78dp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28cr8crlvico1n7.R.rethrow($CLV_t2$);}finally{__CLR4_5_28cr8crlvico1n7.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.ManchesterOWLSyntaxParserErrorsTestCase.prematureEOFInDeclarationShouldCauseParseException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10861,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uuept78dp(){try{__CLR4_5_28cr8crlvico1n7.R.inc(10861);
        __CLR4_5_28cr8crlvico1n7.R.inc(10862);checkForExceptionAtEOF("Class: ");
    }finally{__CLR4_5_28cr8crlvico1n7.R.flushNeeded();}}

    @Test
    public void prematureEOFAfterClassAnnotationsShouldCauseParseException() {__CLR4_5_28cr8crlvico1n7.R.globalSliceStart(getClass().getName(),10863);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dbqy1q8dr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28cr8crlvico1n7.R.rethrow($CLV_t2$);}finally{__CLR4_5_28cr8crlvico1n7.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.ManchesterOWLSyntaxParserErrorsTestCase.prematureEOFAfterClassAnnotationsShouldCauseParseException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10863,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dbqy1q8dr(){try{__CLR4_5_28cr8crlvico1n7.R.inc(10863);
        __CLR4_5_28cr8crlvico1n7.R.inc(10864);checkForExceptionAtEOF("Class: C Annotations: ");
    }finally{__CLR4_5_28cr8crlvico1n7.R.flushNeeded();}}

    @Test
    public void prematureEOFAfterSubClassOfShouldCauseParseException() {__CLR4_5_28cr8crlvico1n7.R.globalSliceStart(getClass().getName(),10865);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uxr00x8dt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28cr8crlvico1n7.R.rethrow($CLV_t2$);}finally{__CLR4_5_28cr8crlvico1n7.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.ManchesterOWLSyntaxParserErrorsTestCase.prematureEOFAfterSubClassOfShouldCauseParseException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10865,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uxr00x8dt(){try{__CLR4_5_28cr8crlvico1n7.R.inc(10865);
        __CLR4_5_28cr8crlvico1n7.R.inc(10866);String input = "Class: C SubClassOf: ";
        __CLR4_5_28cr8crlvico1n7.R.inc(10867);checkForExceptionAtEOF(input);
    }finally{__CLR4_5_28cr8crlvico1n7.R.flushNeeded();}}

    @Test
    public void prematureEOFAfterEquivalentToShouldCauseParseException() {__CLR4_5_28cr8crlvico1n7.R.globalSliceStart(getClass().getName(),10868);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2be4h078dw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28cr8crlvico1n7.R.rethrow($CLV_t2$);}finally{__CLR4_5_28cr8crlvico1n7.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.ManchesterOWLSyntaxParserErrorsTestCase.prematureEOFAfterEquivalentToShouldCauseParseException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10868,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2be4h078dw(){try{__CLR4_5_28cr8crlvico1n7.R.inc(10868);
        __CLR4_5_28cr8crlvico1n7.R.inc(10869);String input = "Class: C EquivalentTo: ";
        __CLR4_5_28cr8crlvico1n7.R.inc(10870);checkForExceptionAtEOF(input);
    }finally{__CLR4_5_28cr8crlvico1n7.R.flushNeeded();}}

    @Test
    public void prematureEOFAfterDisjointWithShouldCauseParseException() {__CLR4_5_28cr8crlvico1n7.R.globalSliceStart(getClass().getName(),10871);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2h8tq188dz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28cr8crlvico1n7.R.rethrow($CLV_t2$);}finally{__CLR4_5_28cr8crlvico1n7.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.ManchesterOWLSyntaxParserErrorsTestCase.prematureEOFAfterDisjointWithShouldCauseParseException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10871,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2h8tq188dz(){try{__CLR4_5_28cr8crlvico1n7.R.inc(10871);
        __CLR4_5_28cr8crlvico1n7.R.inc(10872);String input = "Class: C DisjointWith: ";
        __CLR4_5_28cr8crlvico1n7.R.inc(10873);checkForExceptionAtEOF(input);
    }finally{__CLR4_5_28cr8crlvico1n7.R.flushNeeded();}}

    @Test
    public void prematureEOFAfterDisjointUnionOfShouldCauseParseException() {__CLR4_5_28cr8crlvico1n7.R.globalSliceStart(getClass().getName(),10874);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_265mjeu8e2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28cr8crlvico1n7.R.rethrow($CLV_t2$);}finally{__CLR4_5_28cr8crlvico1n7.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.ManchesterOWLSyntaxParserErrorsTestCase.prematureEOFAfterDisjointUnionOfShouldCauseParseException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10874,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_265mjeu8e2(){try{__CLR4_5_28cr8crlvico1n7.R.inc(10874);
        __CLR4_5_28cr8crlvico1n7.R.inc(10875);checkForExceptionAtEOF("Class: C DisjointUnionOf: ");
    }finally{__CLR4_5_28cr8crlvico1n7.R.flushNeeded();}}

    @Test
    public void prematureEOFAfterHasKeyShouldCauseParseException() {__CLR4_5_28cr8crlvico1n7.R.globalSliceStart(getClass().getName(),10876);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mgdccp8e4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28cr8crlvico1n7.R.rethrow($CLV_t2$);}finally{__CLR4_5_28cr8crlvico1n7.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.ManchesterOWLSyntaxParserErrorsTestCase.prematureEOFAfterHasKeyShouldCauseParseException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10876,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mgdccp8e4(){try{__CLR4_5_28cr8crlvico1n7.R.inc(10876);
        __CLR4_5_28cr8crlvico1n7.R.inc(10877);String input = "Class: C HasKey: ";
        __CLR4_5_28cr8crlvico1n7.R.inc(10878);checkForExceptionAtEOF(input);
    }finally{__CLR4_5_28cr8crlvico1n7.R.flushNeeded();}}

    @Test
    public
            void
            prematureEOFAfterClassSubClassOfAxiomAnnotationsShouldCauseParseException() {__CLR4_5_28cr8crlvico1n7.R.globalSliceStart(getClass().getName(),10879);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25n703b8e7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28cr8crlvico1n7.R.rethrow($CLV_t2$);}finally{__CLR4_5_28cr8crlvico1n7.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.ManchesterOWLSyntaxParserErrorsTestCase.prematureEOFAfterClassSubClassOfAxiomAnnotationsShouldCauseParseException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10879,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25n703b8e7(){try{__CLR4_5_28cr8crlvico1n7.R.inc(10879);
        __CLR4_5_28cr8crlvico1n7.R.inc(10880);checkForExceptionAtEOF("Class: C SubClassOf: Annotations: ");
    }finally{__CLR4_5_28cr8crlvico1n7.R.flushNeeded();}}

    @Test
    public void prematureEOFAfterClassSubClassOfListShouldCauseParseException() {__CLR4_5_28cr8crlvico1n7.R.globalSliceStart(getClass().getName(),10881);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rsdtj58e9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28cr8crlvico1n7.R.rethrow($CLV_t2$);}finally{__CLR4_5_28cr8crlvico1n7.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.ManchesterOWLSyntaxParserErrorsTestCase.prematureEOFAfterClassSubClassOfListShouldCauseParseException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10881,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rsdtj58e9(){try{__CLR4_5_28cr8crlvico1n7.R.inc(10881);
        __CLR4_5_28cr8crlvico1n7.R.inc(10882);checkForExceptionAtEOF("Class: C SubClassOf: C1, ");
    }finally{__CLR4_5_28cr8crlvico1n7.R.flushNeeded();}}

    @Test
    public
            void
            prematureEOFAfterClassEquivalentToAxiomAnnotationsShouldCauseParseException() {__CLR4_5_28cr8crlvico1n7.R.globalSliceStart(getClass().getName(),10883);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2y8szcd8eb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28cr8crlvico1n7.R.rethrow($CLV_t2$);}finally{__CLR4_5_28cr8crlvico1n7.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.ManchesterOWLSyntaxParserErrorsTestCase.prematureEOFAfterClassEquivalentToAxiomAnnotationsShouldCauseParseException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10883,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2y8szcd8eb(){try{__CLR4_5_28cr8crlvico1n7.R.inc(10883);
        __CLR4_5_28cr8crlvico1n7.R.inc(10884);checkForExceptionAtEOF("Class: C EquivalentTo: Annotations: ");
    }finally{__CLR4_5_28cr8crlvico1n7.R.flushNeeded();}}

    @Test
    public void
            prematureEOFAfterClassEquivalentToListShouldCauseParseException() {__CLR4_5_28cr8crlvico1n7.R.globalSliceStart(getClass().getName(),10885);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2c9uzxz8ed();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28cr8crlvico1n7.R.rethrow($CLV_t2$);}finally{__CLR4_5_28cr8crlvico1n7.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.ManchesterOWLSyntaxParserErrorsTestCase.prematureEOFAfterClassEquivalentToListShouldCauseParseException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10885,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2c9uzxz8ed(){try{__CLR4_5_28cr8crlvico1n7.R.inc(10885);
        __CLR4_5_28cr8crlvico1n7.R.inc(10886);checkForExceptionAtEOF("Class: C EquivalentTo: C1, ");
    }finally{__CLR4_5_28cr8crlvico1n7.R.flushNeeded();}}

    @Test
    public
            void
            prematureEOFAfterClassDisjointWithAxiomAnnotationsShouldCauseParseException() {__CLR4_5_28cr8crlvico1n7.R.globalSliceStart(getClass().getName(),10887);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mgru8a8ef();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28cr8crlvico1n7.R.rethrow($CLV_t2$);}finally{__CLR4_5_28cr8crlvico1n7.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.ManchesterOWLSyntaxParserErrorsTestCase.prematureEOFAfterClassDisjointWithAxiomAnnotationsShouldCauseParseException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10887,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mgru8a8ef(){try{__CLR4_5_28cr8crlvico1n7.R.inc(10887);
        __CLR4_5_28cr8crlvico1n7.R.inc(10888);checkForExceptionAtEOF("Class: C DisjointWith: Annotations: ");
    }finally{__CLR4_5_28cr8crlvico1n7.R.flushNeeded();}}

    @Test
    public void
            prematureEOFAfterClassDisjointWithListShouldCauseParseException() {__CLR4_5_28cr8crlvico1n7.R.globalSliceStart(getClass().getName(),10889);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2olk4rw8eh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28cr8crlvico1n7.R.rethrow($CLV_t2$);}finally{__CLR4_5_28cr8crlvico1n7.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.ManchesterOWLSyntaxParserErrorsTestCase.prematureEOFAfterClassDisjointWithListShouldCauseParseException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10889,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2olk4rw8eh(){try{__CLR4_5_28cr8crlvico1n7.R.inc(10889);
        __CLR4_5_28cr8crlvico1n7.R.inc(10890);checkForExceptionAtEOF("Class: C DisjointWith: C1, ");
    }finally{__CLR4_5_28cr8crlvico1n7.R.flushNeeded();}}

    @Test
    public
            void
            prematureEOFAfterClassDisjointUnionOfAxiomAnnotationsShouldCauseParseException() {__CLR4_5_28cr8crlvico1n7.R.globalSliceStart(getClass().getName(),10891);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22atfko8ej();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28cr8crlvico1n7.R.rethrow($CLV_t2$);}finally{__CLR4_5_28cr8crlvico1n7.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.ManchesterOWLSyntaxParserErrorsTestCase.prematureEOFAfterClassDisjointUnionOfAxiomAnnotationsShouldCauseParseException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10891,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22atfko8ej(){try{__CLR4_5_28cr8crlvico1n7.R.inc(10891);
        __CLR4_5_28cr8crlvico1n7.R.inc(10892);checkForExceptionAtEOF("Class: C DisjointUnionOf: Annotations: ");
    }finally{__CLR4_5_28cr8crlvico1n7.R.flushNeeded();}}

    @Test
    public
            void
            prematureEOFAfterClassDisjointUnionOfListShouldCauseParseException() {__CLR4_5_28cr8crlvico1n7.R.globalSliceStart(getClass().getName(),10893);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e8jvoi8el();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28cr8crlvico1n7.R.rethrow($CLV_t2$);}finally{__CLR4_5_28cr8crlvico1n7.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.ManchesterOWLSyntaxParserErrorsTestCase.prematureEOFAfterClassDisjointUnionOfListShouldCauseParseException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10893,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e8jvoi8el(){try{__CLR4_5_28cr8crlvico1n7.R.inc(10893);
        __CLR4_5_28cr8crlvico1n7.R.inc(10894);checkForExceptionAtEOF("Class: C DisjointUnionOf: C1, ");
    }finally{__CLR4_5_28cr8crlvico1n7.R.flushNeeded();}}

    @Test
    public
            void
            prematureEOFAfterClassHasKeyAxiomAnnotationsShouldCauseParseException() {__CLR4_5_28cr8crlvico1n7.R.globalSliceStart(getClass().getName(),10895);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ze0dbn8en();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28cr8crlvico1n7.R.rethrow($CLV_t2$);}finally{__CLR4_5_28cr8crlvico1n7.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.ManchesterOWLSyntaxParserErrorsTestCase.prematureEOFAfterClassHasKeyAxiomAnnotationsShouldCauseParseException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10895,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ze0dbn8en(){try{__CLR4_5_28cr8crlvico1n7.R.inc(10895);
        __CLR4_5_28cr8crlvico1n7.R.inc(10896);checkForExceptionAtEOF("Class: C HasKey: Annotations: ");
    }finally{__CLR4_5_28cr8crlvico1n7.R.flushNeeded();}}

    @Test
    public void prematureEOFAfterObjectPropertyShouldCauseParseException() {__CLR4_5_28cr8crlvico1n7.R.globalSliceStart(getClass().getName(),10897);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n33kna8ep();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28cr8crlvico1n7.R.rethrow($CLV_t2$);}finally{__CLR4_5_28cr8crlvico1n7.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.ManchesterOWLSyntaxParserErrorsTestCase.prematureEOFAfterObjectPropertyShouldCauseParseException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10897,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n33kna8ep(){try{__CLR4_5_28cr8crlvico1n7.R.inc(10897);
        __CLR4_5_28cr8crlvico1n7.R.inc(10898);checkForExceptionAtEOF("ObjectProperty: ");
    }finally{__CLR4_5_28cr8crlvico1n7.R.flushNeeded();}}

    @Test
    public
            void
            prematureEOFAfterObjectPropertyAnnotationsShouldCauseParseException() {__CLR4_5_28cr8crlvico1n7.R.globalSliceStart(getClass().getName(),10899);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mne8us8er();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28cr8crlvico1n7.R.rethrow($CLV_t2$);}finally{__CLR4_5_28cr8crlvico1n7.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.ManchesterOWLSyntaxParserErrorsTestCase.prematureEOFAfterObjectPropertyAnnotationsShouldCauseParseException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10899,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mne8us8er(){try{__CLR4_5_28cr8crlvico1n7.R.inc(10899);
        __CLR4_5_28cr8crlvico1n7.R.inc(10900);checkForExceptionAtEOF("ObjectProperty: oP Annotations: ");
    }finally{__CLR4_5_28cr8crlvico1n7.R.flushNeeded();}}

    @Test
    public void
            prematureEOFAfterObjectPropertyDomainShouldCauseParseException() {__CLR4_5_28cr8crlvico1n7.R.globalSliceStart(getClass().getName(),10901);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hve1au8et();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28cr8crlvico1n7.R.rethrow($CLV_t2$);}finally{__CLR4_5_28cr8crlvico1n7.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.ManchesterOWLSyntaxParserErrorsTestCase.prematureEOFAfterObjectPropertyDomainShouldCauseParseException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10901,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hve1au8et(){try{__CLR4_5_28cr8crlvico1n7.R.inc(10901);
        __CLR4_5_28cr8crlvico1n7.R.inc(10902);checkForExceptionAtEOF("ObjectProperty: oP Domain: ");
    }finally{__CLR4_5_28cr8crlvico1n7.R.flushNeeded();}}

    @Test
    public
            void
            unrecognizedClassAfterObjectPropertyDomainShouldCauseParseException() {__CLR4_5_28cr8crlvico1n7.R.globalSliceStart(getClass().getName(),10903);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tgulou8ev();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28cr8crlvico1n7.R.rethrow($CLV_t2$);}finally{__CLR4_5_28cr8crlvico1n7.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.ManchesterOWLSyntaxParserErrorsTestCase.unrecognizedClassAfterObjectPropertyDomainShouldCauseParseException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10903,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tgulou8ev(){try{__CLR4_5_28cr8crlvico1n7.R.inc(10903);
        __CLR4_5_28cr8crlvico1n7.R.inc(10904);checkForExceptionAt("ObjectProperty: oP Domain: X", 27, "X");
    }finally{__CLR4_5_28cr8crlvico1n7.R.flushNeeded();}}

    @Test
    public void prematureEOFAfterObjectPropertyRangeShouldCauseParseException() {__CLR4_5_28cr8crlvico1n7.R.globalSliceStart(getClass().getName(),10905);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mz36ij8ex();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28cr8crlvico1n7.R.rethrow($CLV_t2$);}finally{__CLR4_5_28cr8crlvico1n7.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.ManchesterOWLSyntaxParserErrorsTestCase.prematureEOFAfterObjectPropertyRangeShouldCauseParseException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10905,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mz36ij8ex(){try{__CLR4_5_28cr8crlvico1n7.R.inc(10905);
        __CLR4_5_28cr8crlvico1n7.R.inc(10906);checkForExceptionAtEOF("ObjectProperty: oP Range: ");
    }finally{__CLR4_5_28cr8crlvico1n7.R.flushNeeded();}}

    @Test
    public
            void
            unrecognizedClassAfterObjectPropertyRangeShouldCauseParseException() {__CLR4_5_28cr8crlvico1n7.R.globalSliceStart(getClass().getName(),10907);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22q60sj8ez();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28cr8crlvico1n7.R.rethrow($CLV_t2$);}finally{__CLR4_5_28cr8crlvico1n7.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.ManchesterOWLSyntaxParserErrorsTestCase.unrecognizedClassAfterObjectPropertyRangeShouldCauseParseException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10907,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22q60sj8ez(){try{__CLR4_5_28cr8crlvico1n7.R.inc(10907);
        __CLR4_5_28cr8crlvico1n7.R.inc(10908);checkForExceptionAt("ObjectProperty: oP Range: X", 26, "X");
    }finally{__CLR4_5_28cr8crlvico1n7.R.flushNeeded();}}

    @Test
    public
            void
            prematureEOFAfterObjectPropertySubPropertyOfShouldCauseParseException() {__CLR4_5_28cr8crlvico1n7.R.globalSliceStart(getClass().getName(),10909);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dmn3n88f1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28cr8crlvico1n7.R.rethrow($CLV_t2$);}finally{__CLR4_5_28cr8crlvico1n7.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.ManchesterOWLSyntaxParserErrorsTestCase.prematureEOFAfterObjectPropertySubPropertyOfShouldCauseParseException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10909,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dmn3n88f1(){try{__CLR4_5_28cr8crlvico1n7.R.inc(10909);
        __CLR4_5_28cr8crlvico1n7.R.inc(10910);checkForExceptionAtEOF("ObjectProperty: oP SubPropertyOf: ");
    }finally{__CLR4_5_28cr8crlvico1n7.R.flushNeeded();}}

    @Test
    public
            void
            unrecognizedPropertyAfterObjectPropertySubPropertyOfShouldCauseParseException() {__CLR4_5_28cr8crlvico1n7.R.globalSliceStart(getClass().getName(),10911);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a0jbuv8f3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28cr8crlvico1n7.R.rethrow($CLV_t2$);}finally{__CLR4_5_28cr8crlvico1n7.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.ManchesterOWLSyntaxParserErrorsTestCase.unrecognizedPropertyAfterObjectPropertySubPropertyOfShouldCauseParseException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10911,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a0jbuv8f3(){try{__CLR4_5_28cr8crlvico1n7.R.inc(10911);
        __CLR4_5_28cr8crlvico1n7.R.inc(10912);checkForExceptionAt("ObjectProperty: oP SubPropertyOf: Q", 34, "Q");
    }finally{__CLR4_5_28cr8crlvico1n7.R.flushNeeded();}}

    @Test
    public
            void
            prematureEOFAfterObjectPropertyEquivalentToShouldCauseParseException() {__CLR4_5_28cr8crlvico1n7.R.globalSliceStart(getClass().getName(),10913);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23bbrh18f5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28cr8crlvico1n7.R.rethrow($CLV_t2$);}finally{__CLR4_5_28cr8crlvico1n7.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.ManchesterOWLSyntaxParserErrorsTestCase.prematureEOFAfterObjectPropertyEquivalentToShouldCauseParseException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10913,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23bbrh18f5(){try{__CLR4_5_28cr8crlvico1n7.R.inc(10913);
        __CLR4_5_28cr8crlvico1n7.R.inc(10914);checkForExceptionAtEOF("ObjectProperty: oP EquivalentTo: ");
    }finally{__CLR4_5_28cr8crlvico1n7.R.flushNeeded();}}

    @Test
    public
            void
            unrecognizedPropertyAfterObjectPropertyEquivalentToShouldCauseParseException() {__CLR4_5_28cr8crlvico1n7.R.globalSliceStart(getClass().getName(),10915);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2abeg548f7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28cr8crlvico1n7.R.rethrow($CLV_t2$);}finally{__CLR4_5_28cr8crlvico1n7.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.ManchesterOWLSyntaxParserErrorsTestCase.unrecognizedPropertyAfterObjectPropertyEquivalentToShouldCauseParseException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10915,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2abeg548f7(){try{__CLR4_5_28cr8crlvico1n7.R.inc(10915);
        __CLR4_5_28cr8crlvico1n7.R.inc(10916);checkForExceptionAt("ObjectProperty: oP EquivalentTo: Q", 33, "Q");
    }finally{__CLR4_5_28cr8crlvico1n7.R.flushNeeded();}}

    @Test
    public
            void
            prematureEOFAfterObjectPropertyDisjointWithShouldCauseParseException() {__CLR4_5_28cr8crlvico1n7.R.globalSliceStart(getClass().getName(),10917);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vy9yig8f9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28cr8crlvico1n7.R.rethrow($CLV_t2$);}finally{__CLR4_5_28cr8crlvico1n7.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.ManchesterOWLSyntaxParserErrorsTestCase.prematureEOFAfterObjectPropertyDisjointWithShouldCauseParseException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10917,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vy9yig8f9(){try{__CLR4_5_28cr8crlvico1n7.R.inc(10917);
        __CLR4_5_28cr8crlvico1n7.R.inc(10918);checkForExceptionAtEOF("ObjectProperty: oP DisjointWith: ");
    }finally{__CLR4_5_28cr8crlvico1n7.R.flushNeeded();}}

    @Test
    public
            void
            unrecognizedPropertyAfterObjectPropertyDisjointWithToShouldCauseParseException() {__CLR4_5_28cr8crlvico1n7.R.globalSliceStart(getClass().getName(),10919);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_215ocj48fb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28cr8crlvico1n7.R.rethrow($CLV_t2$);}finally{__CLR4_5_28cr8crlvico1n7.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.ManchesterOWLSyntaxParserErrorsTestCase.unrecognizedPropertyAfterObjectPropertyDisjointWithToShouldCauseParseException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10919,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_215ocj48fb(){try{__CLR4_5_28cr8crlvico1n7.R.inc(10919);
        __CLR4_5_28cr8crlvico1n7.R.inc(10920);checkForExceptionAt("ObjectProperty: oP DisjointWith: Q", 33, "Q");
    }finally{__CLR4_5_28cr8crlvico1n7.R.flushNeeded();}}

    @Test
    public
            void
            prematureEOFAfterObjectPropertyCharacteristicsShouldCauseParseException() {__CLR4_5_28cr8crlvico1n7.R.globalSliceStart(getClass().getName(),10921);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21go3408fd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28cr8crlvico1n7.R.rethrow($CLV_t2$);}finally{__CLR4_5_28cr8crlvico1n7.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.ManchesterOWLSyntaxParserErrorsTestCase.prematureEOFAfterObjectPropertyCharacteristicsShouldCauseParseException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10921,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21go3408fd(){try{__CLR4_5_28cr8crlvico1n7.R.inc(10921);
        __CLR4_5_28cr8crlvico1n7.R.inc(10922);checkForExceptionAtEOF("ObjectProperty: oP Characteristics: ");
    }finally{__CLR4_5_28cr8crlvico1n7.R.flushNeeded();}}

    @Test
    public
            void
            unrecognizedCharacteristicAfterObjectPropertyCharacteristicsShouldCauseParseException() {__CLR4_5_28cr8crlvico1n7.R.globalSliceStart(getClass().getName(),10923);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lhawyv8ff();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28cr8crlvico1n7.R.rethrow($CLV_t2$);}finally{__CLR4_5_28cr8crlvico1n7.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.ManchesterOWLSyntaxParserErrorsTestCase.unrecognizedCharacteristicAfterObjectPropertyCharacteristicsShouldCauseParseException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10923,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lhawyv8ff(){try{__CLR4_5_28cr8crlvico1n7.R.inc(10923);
        __CLR4_5_28cr8crlvico1n7.R.inc(10924);checkForExceptionAt("ObjectProperty: oP Characteristics: Q", 36, "Q");
    }finally{__CLR4_5_28cr8crlvico1n7.R.flushNeeded();}}

    @Test
    public void
            prematureEOFAfterObjectPropertyInverseOfShouldCauseParseException() {__CLR4_5_28cr8crlvico1n7.R.globalSliceStart(getClass().getName(),10925);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rnsp8x8fh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28cr8crlvico1n7.R.rethrow($CLV_t2$);}finally{__CLR4_5_28cr8crlvico1n7.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.ManchesterOWLSyntaxParserErrorsTestCase.prematureEOFAfterObjectPropertyInverseOfShouldCauseParseException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10925,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rnsp8x8fh(){try{__CLR4_5_28cr8crlvico1n7.R.inc(10925);
        __CLR4_5_28cr8crlvico1n7.R.inc(10926);checkForExceptionAtEOF("ObjectProperty: oP InverseOf: ");
    }finally{__CLR4_5_28cr8crlvico1n7.R.flushNeeded();}}

    @Test
    public
            void
            unrecognizedPropertyAfterObjectPropertyInverseOfShouldCauseParseException() {__CLR4_5_28cr8crlvico1n7.R.globalSliceStart(getClass().getName(),10927);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dz024e8fj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28cr8crlvico1n7.R.rethrow($CLV_t2$);}finally{__CLR4_5_28cr8crlvico1n7.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.ManchesterOWLSyntaxParserErrorsTestCase.unrecognizedPropertyAfterObjectPropertyInverseOfShouldCauseParseException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10927,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dz024e8fj(){try{__CLR4_5_28cr8crlvico1n7.R.inc(10927);
        __CLR4_5_28cr8crlvico1n7.R.inc(10928);checkForExceptionAt("ObjectProperty: oP InverseOf: Q", 30, "Q");
    }finally{__CLR4_5_28cr8crlvico1n7.R.flushNeeded();}}

    @Test
    public
            void
            prematureEOFAfterObjectPropertySubPropertyChainShouldCauseParseException() {__CLR4_5_28cr8crlvico1n7.R.globalSliceStart(getClass().getName(),10929);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lw8gsu8fl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28cr8crlvico1n7.R.rethrow($CLV_t2$);}finally{__CLR4_5_28cr8crlvico1n7.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.ManchesterOWLSyntaxParserErrorsTestCase.prematureEOFAfterObjectPropertySubPropertyChainShouldCauseParseException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10929,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lw8gsu8fl(){try{__CLR4_5_28cr8crlvico1n7.R.inc(10929);
        __CLR4_5_28cr8crlvico1n7.R.inc(10930);checkForExceptionAtEOF("ObjectProperty: oP SubPropertyChain: ");
    }finally{__CLR4_5_28cr8crlvico1n7.R.flushNeeded();}}

    @Test
    public
            void
            unrecognizedPropertyAfterObjectPropertySubPropertyChainOfShouldCauseParseException() {__CLR4_5_28cr8crlvico1n7.R.globalSliceStart(getClass().getName(),10931);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24i0v5i8fn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28cr8crlvico1n7.R.rethrow($CLV_t2$);}finally{__CLR4_5_28cr8crlvico1n7.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.ManchesterOWLSyntaxParserErrorsTestCase.unrecognizedPropertyAfterObjectPropertySubPropertyChainOfShouldCauseParseException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10931,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24i0v5i8fn(){try{__CLR4_5_28cr8crlvico1n7.R.inc(10931);
        __CLR4_5_28cr8crlvico1n7.R.inc(10932);checkForExceptionAt("ObjectProperty: oP SubPropertyChain: Q", 37, "Q");
    }finally{__CLR4_5_28cr8crlvico1n7.R.flushNeeded();}}

    @Test
    public void prematureEOFAfterDataPropertyShouldCauseParseException() {__CLR4_5_28cr8crlvico1n7.R.globalSliceStart(getClass().getName(),10933);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2k1txlb8fp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28cr8crlvico1n7.R.rethrow($CLV_t2$);}finally{__CLR4_5_28cr8crlvico1n7.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.ManchesterOWLSyntaxParserErrorsTestCase.prematureEOFAfterDataPropertyShouldCauseParseException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10933,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2k1txlb8fp(){try{__CLR4_5_28cr8crlvico1n7.R.inc(10933);
        __CLR4_5_28cr8crlvico1n7.R.inc(10934);checkForExceptionAtEOF("DataProperty: ");
    }finally{__CLR4_5_28cr8crlvico1n7.R.flushNeeded();}}

    @Test
    public void
            prematureEOFAfterDataPropertyAnnotationsShouldCauseParseException() {__CLR4_5_28cr8crlvico1n7.R.globalSliceStart(getClass().getName(),10935);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2upa7oh8fr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28cr8crlvico1n7.R.rethrow($CLV_t2$);}finally{__CLR4_5_28cr8crlvico1n7.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.ManchesterOWLSyntaxParserErrorsTestCase.prematureEOFAfterDataPropertyAnnotationsShouldCauseParseException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10935,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2upa7oh8fr(){try{__CLR4_5_28cr8crlvico1n7.R.inc(10935);
        __CLR4_5_28cr8crlvico1n7.R.inc(10936);checkForExceptionAtEOF("DataProperty: dP Annotations: ");
    }finally{__CLR4_5_28cr8crlvico1n7.R.flushNeeded();}}

    @Test
    public
            void
            unrecognisedAnnotationPropertyAfterDataPropertyAnnotationsShouldCauseParseException() {__CLR4_5_28cr8crlvico1n7.R.globalSliceStart(getClass().getName(),10937);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ftvbes8ft();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28cr8crlvico1n7.R.rethrow($CLV_t2$);}finally{__CLR4_5_28cr8crlvico1n7.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.ManchesterOWLSyntaxParserErrorsTestCase.unrecognisedAnnotationPropertyAfterDataPropertyAnnotationsShouldCauseParseException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10937,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ftvbes8ft(){try{__CLR4_5_28cr8crlvico1n7.R.inc(10937);
        __CLR4_5_28cr8crlvico1n7.R.inc(10938);checkForExceptionAt("DataProperty: dP Annotations: X", 30, "X");
    }finally{__CLR4_5_28cr8crlvico1n7.R.flushNeeded();}}

    @Test
    public void prematureEOFAfterDataPropertyDomainShouldCauseParseException() {__CLR4_5_28cr8crlvico1n7.R.globalSliceStart(getClass().getName(),10939);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rescff8fv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28cr8crlvico1n7.R.rethrow($CLV_t2$);}finally{__CLR4_5_28cr8crlvico1n7.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.ManchesterOWLSyntaxParserErrorsTestCase.prematureEOFAfterDataPropertyDomainShouldCauseParseException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10939,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rescff8fv(){try{__CLR4_5_28cr8crlvico1n7.R.inc(10939);
        __CLR4_5_28cr8crlvico1n7.R.inc(10940);checkForExceptionAtEOF("DataProperty: dP Domain: ");
    }finally{__CLR4_5_28cr8crlvico1n7.R.flushNeeded();}}

    @Test
    public void
            unrecognizedClassAfterDataPropertyDomainShouldCauseParseException() {__CLR4_5_28cr8crlvico1n7.R.globalSliceStart(getClass().getName(),10941);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23uecrn8fx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28cr8crlvico1n7.R.rethrow($CLV_t2$);}finally{__CLR4_5_28cr8crlvico1n7.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.ManchesterOWLSyntaxParserErrorsTestCase.unrecognizedClassAfterDataPropertyDomainShouldCauseParseException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10941,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23uecrn8fx(){try{__CLR4_5_28cr8crlvico1n7.R.inc(10941);
        __CLR4_5_28cr8crlvico1n7.R.inc(10942);checkForExceptionAt("DataProperty: dP Domain: X", 25, "X");
    }finally{__CLR4_5_28cr8crlvico1n7.R.flushNeeded();}}

    @Test
    public void prematureEOFAfterDataPropertyRangeShouldCauseParseException() {__CLR4_5_28cr8crlvico1n7.R.globalSliceStart(getClass().getName(),10943);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tf1osa8fz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28cr8crlvico1n7.R.rethrow($CLV_t2$);}finally{__CLR4_5_28cr8crlvico1n7.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.ManchesterOWLSyntaxParserErrorsTestCase.prematureEOFAfterDataPropertyRangeShouldCauseParseException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10943,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tf1osa8fz(){try{__CLR4_5_28cr8crlvico1n7.R.inc(10943);
        __CLR4_5_28cr8crlvico1n7.R.inc(10944);checkForExceptionAtEOF("DataProperty: dP Range: ");
    }finally{__CLR4_5_28cr8crlvico1n7.R.flushNeeded();}}

    @Test
    public void
            unrecognizedClassAfterDataPropertyRangeShouldCauseParseException() {__CLR4_5_28cr8crlvico1n7.R.globalSliceStart(getClass().getName(),10945);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2buiigi8g1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28cr8crlvico1n7.R.rethrow($CLV_t2$);}finally{__CLR4_5_28cr8crlvico1n7.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.ManchesterOWLSyntaxParserErrorsTestCase.unrecognizedClassAfterDataPropertyRangeShouldCauseParseException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10945,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2buiigi8g1(){try{__CLR4_5_28cr8crlvico1n7.R.inc(10945);
        __CLR4_5_28cr8crlvico1n7.R.inc(10946);checkForExceptionAt("DataProperty: dP Range: X", 24, "X");
    }finally{__CLR4_5_28cr8crlvico1n7.R.flushNeeded();}}

    @Test
    public
            void
            prematureEOFAfterDataPropertySubPropertyOfShouldCauseParseException() {__CLR4_5_28cr8crlvico1n7.R.globalSliceStart(getClass().getName(),10947);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s8vc98g3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28cr8crlvico1n7.R.rethrow($CLV_t2$);}finally{__CLR4_5_28cr8crlvico1n7.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.ManchesterOWLSyntaxParserErrorsTestCase.prematureEOFAfterDataPropertySubPropertyOfShouldCauseParseException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10947,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s8vc98g3(){try{__CLR4_5_28cr8crlvico1n7.R.inc(10947);
        __CLR4_5_28cr8crlvico1n7.R.inc(10948);checkForExceptionAtEOF("DataProperty: dP SubPropertyOf: ");
    }finally{__CLR4_5_28cr8crlvico1n7.R.flushNeeded();}}

    @Test
    public
            void
            unrecognizedPropertyAfterDataPropertySubPropertyOfShouldCauseParseException() {__CLR4_5_28cr8crlvico1n7.R.globalSliceStart(getClass().getName(),10949);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ez01rw8g5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28cr8crlvico1n7.R.rethrow($CLV_t2$);}finally{__CLR4_5_28cr8crlvico1n7.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.ManchesterOWLSyntaxParserErrorsTestCase.unrecognizedPropertyAfterDataPropertySubPropertyOfShouldCauseParseException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10949,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ez01rw8g5(){try{__CLR4_5_28cr8crlvico1n7.R.inc(10949);
        __CLR4_5_28cr8crlvico1n7.R.inc(10950);checkForExceptionAt("DataProperty: dP SubPropertyOf: Q", 32, "Q");
    }finally{__CLR4_5_28cr8crlvico1n7.R.flushNeeded();}}

    @Test
    public
            void
            prematureEOFAfterDataPropertyEquivalentToShouldCauseParseException() {__CLR4_5_28cr8crlvico1n7.R.globalSliceStart(getClass().getName(),10951);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gw57o68g7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28cr8crlvico1n7.R.rethrow($CLV_t2$);}finally{__CLR4_5_28cr8crlvico1n7.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.ManchesterOWLSyntaxParserErrorsTestCase.prematureEOFAfterDataPropertyEquivalentToShouldCauseParseException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10951,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gw57o68g7(){try{__CLR4_5_28cr8crlvico1n7.R.inc(10951);
        __CLR4_5_28cr8crlvico1n7.R.inc(10952);checkForExceptionAtEOF("DataProperty: dP EquivalentTo: ");
    }finally{__CLR4_5_28cr8crlvico1n7.R.flushNeeded();}}

    @Test
    public
            void
            unrecognizedPropertyAfterDataPropertyEquivalentToShouldCauseParseException() {__CLR4_5_28cr8crlvico1n7.R.globalSliceStart(getClass().getName(),10953);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2f24spv8g9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28cr8crlvico1n7.R.rethrow($CLV_t2$);}finally{__CLR4_5_28cr8crlvico1n7.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.ManchesterOWLSyntaxParserErrorsTestCase.unrecognizedPropertyAfterDataPropertyEquivalentToShouldCauseParseException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10953,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2f24spv8g9(){try{__CLR4_5_28cr8crlvico1n7.R.inc(10953);
        __CLR4_5_28cr8crlvico1n7.R.inc(10954);checkForExceptionAt("DataProperty: dP EquivalentTo: Q", 31, "Q");
    }finally{__CLR4_5_28cr8crlvico1n7.R.flushNeeded();}}

    @Test
    public
            void
            prematureEOFAfterDataPropertyDisjointWithShouldCauseParseException() {__CLR4_5_28cr8crlvico1n7.R.globalSliceStart(getClass().getName(),10955);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bqszd98gb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28cr8crlvico1n7.R.rethrow($CLV_t2$);}finally{__CLR4_5_28cr8crlvico1n7.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.ManchesterOWLSyntaxParserErrorsTestCase.prematureEOFAfterDataPropertyDisjointWithShouldCauseParseException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10955,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bqszd98gb(){try{__CLR4_5_28cr8crlvico1n7.R.inc(10955);
        __CLR4_5_28cr8crlvico1n7.R.inc(10956);checkForExceptionAtEOF("DataProperty: dP DisjointWith: ");
    }finally{__CLR4_5_28cr8crlvico1n7.R.flushNeeded();}}

    @Test
    public
            void
            unrecognizedPropertyAfterDataPropertyDisjointWithToShouldCauseParseException() {__CLR4_5_28cr8crlvico1n7.R.globalSliceStart(getClass().getName(),10957);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cruk0r8gd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28cr8crlvico1n7.R.rethrow($CLV_t2$);}finally{__CLR4_5_28cr8crlvico1n7.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.ManchesterOWLSyntaxParserErrorsTestCase.unrecognizedPropertyAfterDataPropertyDisjointWithToShouldCauseParseException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10957,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cruk0r8gd(){try{__CLR4_5_28cr8crlvico1n7.R.inc(10957);
        __CLR4_5_28cr8crlvico1n7.R.inc(10958);checkForExceptionAt("DataProperty: dP DisjointWith: Q", 31, "Q");
    }finally{__CLR4_5_28cr8crlvico1n7.R.flushNeeded();}}

    @Test
    public
            void
            prematureEOFAfterDataPropertyCharacteristicsShouldCauseParseException() {__CLR4_5_28cr8crlvico1n7.R.globalSliceStart(getClass().getName(),10959);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ej1rp18gf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28cr8crlvico1n7.R.rethrow($CLV_t2$);}finally{__CLR4_5_28cr8crlvico1n7.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.ManchesterOWLSyntaxParserErrorsTestCase.prematureEOFAfterDataPropertyCharacteristicsShouldCauseParseException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10959,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ej1rp18gf(){try{__CLR4_5_28cr8crlvico1n7.R.inc(10959);
        __CLR4_5_28cr8crlvico1n7.R.inc(10960);checkForExceptionAtEOF("DataProperty: dP Characteristics: ");
    }finally{__CLR4_5_28cr8crlvico1n7.R.flushNeeded();}}

    @Test
    public
            void
            unrecognizedCharacteristicAfterDataPropertyCharacteristicsShouldCauseParseException() {__CLR4_5_28cr8crlvico1n7.R.globalSliceStart(getClass().getName(),10961);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ioft2q8gh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28cr8crlvico1n7.R.rethrow($CLV_t2$);}finally{__CLR4_5_28cr8crlvico1n7.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.ManchesterOWLSyntaxParserErrorsTestCase.unrecognizedCharacteristicAfterDataPropertyCharacteristicsShouldCauseParseException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10961,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ioft2q8gh(){try{__CLR4_5_28cr8crlvico1n7.R.inc(10961);
        __CLR4_5_28cr8crlvico1n7.R.inc(10962);checkForExceptionAt("DataProperty: dP Characteristics: Q", 34, "Q");
    }finally{__CLR4_5_28cr8crlvico1n7.R.flushNeeded();}}

    @Test
    public void prematureEOFAfterAnnotationPropertyShouldCauseParseException() {__CLR4_5_28cr8crlvico1n7.R.globalSliceStart(getClass().getName(),10963);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fl0toq8gj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28cr8crlvico1n7.R.rethrow($CLV_t2$);}finally{__CLR4_5_28cr8crlvico1n7.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.ManchesterOWLSyntaxParserErrorsTestCase.prematureEOFAfterAnnotationPropertyShouldCauseParseException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10963,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fl0toq8gj(){try{__CLR4_5_28cr8crlvico1n7.R.inc(10963);
        __CLR4_5_28cr8crlvico1n7.R.inc(10964);checkForExceptionAtEOF("AnnotationProperty: ");
    }finally{__CLR4_5_28cr8crlvico1n7.R.flushNeeded();}}

    @Test
    public
            void
            prematureEOFAfterAnnotationPropertyAnnotationsShouldCauseParseException() {__CLR4_5_28cr8crlvico1n7.R.globalSliceStart(getClass().getName(),10965);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uhony48gl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28cr8crlvico1n7.R.rethrow($CLV_t2$);}finally{__CLR4_5_28cr8crlvico1n7.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.ManchesterOWLSyntaxParserErrorsTestCase.prematureEOFAfterAnnotationPropertyAnnotationsShouldCauseParseException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10965,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uhony48gl(){try{__CLR4_5_28cr8crlvico1n7.R.inc(10965);
        __CLR4_5_28cr8crlvico1n7.R.inc(10966);checkForExceptionAtEOF("AnnotationProperty: aP Annotations: ");
    }finally{__CLR4_5_28cr8crlvico1n7.R.flushNeeded();}}

    @Test
    public
            void
            unrecognisedAnnotationPropertyAfterAnnotationPropertyAnnotationsShouldCauseParseException() {__CLR4_5_28cr8crlvico1n7.R.globalSliceStart(getClass().getName(),10967);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27bse1j8gn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28cr8crlvico1n7.R.rethrow($CLV_t2$);}finally{__CLR4_5_28cr8crlvico1n7.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.ManchesterOWLSyntaxParserErrorsTestCase.unrecognisedAnnotationPropertyAfterAnnotationPropertyAnnotationsShouldCauseParseException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10967,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27bse1j8gn(){try{__CLR4_5_28cr8crlvico1n7.R.inc(10967);
        __CLR4_5_28cr8crlvico1n7.R.inc(10968);checkForExceptionAt("AnnotationProperty: aP Annotations: X", 36, "X");
    }finally{__CLR4_5_28cr8crlvico1n7.R.flushNeeded();}}

    @Test
    public
            void
            prematureEOFAfterAnnotationPropertyDomainShouldCauseParseException() {__CLR4_5_28cr8crlvico1n7.R.globalSliceStart(getClass().getName(),10969);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wu4fqe8gp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28cr8crlvico1n7.R.rethrow($CLV_t2$);}finally{__CLR4_5_28cr8crlvico1n7.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.ManchesterOWLSyntaxParserErrorsTestCase.prematureEOFAfterAnnotationPropertyDomainShouldCauseParseException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10969,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wu4fqe8gp(){try{__CLR4_5_28cr8crlvico1n7.R.inc(10969);
        __CLR4_5_28cr8crlvico1n7.R.inc(10970);checkForExceptionAtEOF("AnnotationProperty: aP Domain: ");
    }finally{__CLR4_5_28cr8crlvico1n7.R.flushNeeded();}}

    @Test
    public
            void
            unrecognizedClassAfterAnnotationPropertyDomainShouldCauseParseException() {__CLR4_5_28cr8crlvico1n7.R.globalSliceStart(getClass().getName(),10971);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uqzbha8gr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28cr8crlvico1n7.R.rethrow($CLV_t2$);}finally{__CLR4_5_28cr8crlvico1n7.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.ManchesterOWLSyntaxParserErrorsTestCase.unrecognizedClassAfterAnnotationPropertyDomainShouldCauseParseException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10971,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uqzbha8gr(){try{__CLR4_5_28cr8crlvico1n7.R.inc(10971);
        __CLR4_5_28cr8crlvico1n7.R.inc(10972);checkForExceptionAt("AnnotationProperty: aP Domain: X", 31, "X");
    }finally{__CLR4_5_28cr8crlvico1n7.R.flushNeeded();}}

    @Test
    public void
            prematureEOFAfterAnnotationPropertyRangeShouldCauseParseException() {__CLR4_5_28cr8crlvico1n7.R.globalSliceStart(getClass().getName(),10973);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2t8quhh8gt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28cr8crlvico1n7.R.rethrow($CLV_t2$);}finally{__CLR4_5_28cr8crlvico1n7.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.ManchesterOWLSyntaxParserErrorsTestCase.prematureEOFAfterAnnotationPropertyRangeShouldCauseParseException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10973,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2t8quhh8gt(){try{__CLR4_5_28cr8crlvico1n7.R.inc(10973);
        __CLR4_5_28cr8crlvico1n7.R.inc(10974);checkForExceptionAtEOF("AnnotationProperty: aP Range: ");
    }finally{__CLR4_5_28cr8crlvico1n7.R.flushNeeded();}}

    @Test
    public
            void
            unrecognizedClassAfterAnnotationPropertyRangeShouldCauseParseException() {__CLR4_5_28cr8crlvico1n7.R.globalSliceStart(getClass().getName(),10975);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27cmoz78gv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28cr8crlvico1n7.R.rethrow($CLV_t2$);}finally{__CLR4_5_28cr8crlvico1n7.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.ManchesterOWLSyntaxParserErrorsTestCase.unrecognizedClassAfterAnnotationPropertyRangeShouldCauseParseException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10975,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27cmoz78gv(){try{__CLR4_5_28cr8crlvico1n7.R.inc(10975);
        __CLR4_5_28cr8crlvico1n7.R.inc(10976);checkForExceptionAt("AnnotationProperty: aP Range: X", 30, "X");
    }finally{__CLR4_5_28cr8crlvico1n7.R.flushNeeded();}}

    @Test
    public
            void
            prematureEOFAfterAnnotationPropertySubPropertyOfShouldCauseParseException() {__CLR4_5_28cr8crlvico1n7.R.globalSliceStart(getClass().getName(),10977);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2b1dakk8gx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28cr8crlvico1n7.R.rethrow($CLV_t2$);}finally{__CLR4_5_28cr8crlvico1n7.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.ManchesterOWLSyntaxParserErrorsTestCase.prematureEOFAfterAnnotationPropertySubPropertyOfShouldCauseParseException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10977,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2b1dakk8gx(){try{__CLR4_5_28cr8crlvico1n7.R.inc(10977);
        __CLR4_5_28cr8crlvico1n7.R.inc(10978);checkForExceptionAtEOF("AnnotationProperty: aP SubPropertyOf: ");
    }finally{__CLR4_5_28cr8crlvico1n7.R.flushNeeded();}}

    @Test
    public
            void
            unrecognizedPropertyAfterAnnotationPropertySubPropertyOfShouldCauseParseException() {__CLR4_5_28cr8crlvico1n7.R.globalSliceStart(getClass().getName(),10979);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dhm6g98gz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28cr8crlvico1n7.R.rethrow($CLV_t2$);}finally{__CLR4_5_28cr8crlvico1n7.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.ManchesterOWLSyntaxParserErrorsTestCase.unrecognizedPropertyAfterAnnotationPropertySubPropertyOfShouldCauseParseException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10979,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dhm6g98gz(){try{__CLR4_5_28cr8crlvico1n7.R.inc(10979);
        __CLR4_5_28cr8crlvico1n7.R.inc(10980);checkForExceptionAt("AnnotationProperty: aP SubPropertyOf: Q", 38, "Q");
    }finally{__CLR4_5_28cr8crlvico1n7.R.flushNeeded();}}

    @Test
    public void
            prematureEOFAfterIndividualAnnotationsShouldCauseParseException() {__CLR4_5_28cr8crlvico1n7.R.globalSliceStart(getClass().getName(),10981);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ws12558h1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28cr8crlvico1n7.R.rethrow($CLV_t2$);}finally{__CLR4_5_28cr8crlvico1n7.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.ManchesterOWLSyntaxParserErrorsTestCase.prematureEOFAfterIndividualAnnotationsShouldCauseParseException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10981,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ws12558h1(){try{__CLR4_5_28cr8crlvico1n7.R.inc(10981);
        __CLR4_5_28cr8crlvico1n7.R.inc(10982);checkForExceptionAtEOF("Individual: ind Annotations: ");
    }finally{__CLR4_5_28cr8crlvico1n7.R.flushNeeded();}}

    @Test
    public
            void
            unrecognizedAnnotationPropertyAfterIndividualAnnotationsShouldCauseParseException() {__CLR4_5_28cr8crlvico1n7.R.globalSliceStart(getClass().getName(),10983);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22zn0eh8h3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28cr8crlvico1n7.R.rethrow($CLV_t2$);}finally{__CLR4_5_28cr8crlvico1n7.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.ManchesterOWLSyntaxParserErrorsTestCase.unrecognizedAnnotationPropertyAfterIndividualAnnotationsShouldCauseParseException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10983,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22zn0eh8h3(){try{__CLR4_5_28cr8crlvico1n7.R.inc(10983);
        __CLR4_5_28cr8crlvico1n7.R.inc(10984);checkForExceptionAt("Individual: ind Annotations: Q", 29, "Q");
    }finally{__CLR4_5_28cr8crlvico1n7.R.flushNeeded();}}

    @Test
    public void prematureEOFAfterIndividualTypesShouldCauseParseException() {__CLR4_5_28cr8crlvico1n7.R.globalSliceStart(getClass().getName(),10985);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yuqx308h5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28cr8crlvico1n7.R.rethrow($CLV_t2$);}finally{__CLR4_5_28cr8crlvico1n7.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.ManchesterOWLSyntaxParserErrorsTestCase.prematureEOFAfterIndividualTypesShouldCauseParseException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10985,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yuqx308h5(){try{__CLR4_5_28cr8crlvico1n7.R.inc(10985);
        __CLR4_5_28cr8crlvico1n7.R.inc(10986);checkForExceptionAtEOF("Individual: ind Types: ");
    }finally{__CLR4_5_28cr8crlvico1n7.R.flushNeeded();}}

    @Test
    public void
            unrecognizedClassAfterIndividualTypesShouldCauseParseException() {__CLR4_5_28cr8crlvico1n7.R.globalSliceStart(getClass().getName(),10987);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jz91kk8h7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28cr8crlvico1n7.R.rethrow($CLV_t2$);}finally{__CLR4_5_28cr8crlvico1n7.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.ManchesterOWLSyntaxParserErrorsTestCase.unrecognizedClassAfterIndividualTypesShouldCauseParseException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10987,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jz91kk8h7(){try{__CLR4_5_28cr8crlvico1n7.R.inc(10987);
        __CLR4_5_28cr8crlvico1n7.R.inc(10988);checkForExceptionAt("Individual: ind Types: X", 23, "X");
    }finally{__CLR4_5_28cr8crlvico1n7.R.flushNeeded();}}

    @Test
    public void prematureEOFAfterIndividualFactsShouldCauseParseException() {__CLR4_5_28cr8crlvico1n7.R.globalSliceStart(getClass().getName(),10989);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dbgqyy8h9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28cr8crlvico1n7.R.rethrow($CLV_t2$);}finally{__CLR4_5_28cr8crlvico1n7.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.ManchesterOWLSyntaxParserErrorsTestCase.prematureEOFAfterIndividualFactsShouldCauseParseException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10989,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dbgqyy8h9(){try{__CLR4_5_28cr8crlvico1n7.R.inc(10989);
        __CLR4_5_28cr8crlvico1n7.R.inc(10990);checkForExceptionAtEOF("Individual: ind Facts: ");
    }finally{__CLR4_5_28cr8crlvico1n7.R.flushNeeded();}}

    @Test
    public void prematureEOFAfterIndividualFactsNotShouldCauseParseException() {__CLR4_5_28cr8crlvico1n7.R.globalSliceStart(getClass().getName(),10991);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cp0rvt8hb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28cr8crlvico1n7.R.rethrow($CLV_t2$);}finally{__CLR4_5_28cr8crlvico1n7.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.ManchesterOWLSyntaxParserErrorsTestCase.prematureEOFAfterIndividualFactsNotShouldCauseParseException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10991,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cp0rvt8hb(){try{__CLR4_5_28cr8crlvico1n7.R.inc(10991);
        __CLR4_5_28cr8crlvico1n7.R.inc(10992);checkForExceptionAtEOF("Individual: ind Facts: not ");
    }finally{__CLR4_5_28cr8crlvico1n7.R.flushNeeded();}}

    @Test
    public void
            unrecognizedPropertyAfterIndividualFactsShouldCauseParseException() {__CLR4_5_28cr8crlvico1n7.R.globalSliceStart(getClass().getName(),10993);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2aydaoz8hd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28cr8crlvico1n7.R.rethrow($CLV_t2$);}finally{__CLR4_5_28cr8crlvico1n7.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.ManchesterOWLSyntaxParserErrorsTestCase.unrecognizedPropertyAfterIndividualFactsShouldCauseParseException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10993,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2aydaoz8hd(){try{__CLR4_5_28cr8crlvico1n7.R.inc(10993);
        __CLR4_5_28cr8crlvico1n7.R.inc(10994);checkForExceptionAt("Individual: ind Facts: Q", 23, "Q");
    }finally{__CLR4_5_28cr8crlvico1n7.R.flushNeeded();}}

    @Test
    public
            void
            unrecognizedPropertyAfterIndividualFactsNotShouldCauseParseException() {__CLR4_5_28cr8crlvico1n7.R.globalSliceStart(getClass().getName(),10995);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ujmk108hf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28cr8crlvico1n7.R.rethrow($CLV_t2$);}finally{__CLR4_5_28cr8crlvico1n7.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.ManchesterOWLSyntaxParserErrorsTestCase.unrecognizedPropertyAfterIndividualFactsNotShouldCauseParseException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10995,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ujmk108hf(){try{__CLR4_5_28cr8crlvico1n7.R.inc(10995);
        __CLR4_5_28cr8crlvico1n7.R.inc(10996);checkForExceptionAt("Individual: ind Facts: not Q", 27, "Q");
    }finally{__CLR4_5_28cr8crlvico1n7.R.flushNeeded();}}

    @Test
    public void prematureEOFAfterIndividualSameAsShouldCauseParseException() {__CLR4_5_28cr8crlvico1n7.R.globalSliceStart(getClass().getName(),10997);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gw0blp8hh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28cr8crlvico1n7.R.rethrow($CLV_t2$);}finally{__CLR4_5_28cr8crlvico1n7.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.ManchesterOWLSyntaxParserErrorsTestCase.prematureEOFAfterIndividualSameAsShouldCauseParseException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10997,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gw0blp8hh(){try{__CLR4_5_28cr8crlvico1n7.R.inc(10997);
        __CLR4_5_28cr8crlvico1n7.R.inc(10998);checkForExceptionAtEOF("Individual: ind SameAs: ");
    }finally{__CLR4_5_28cr8crlvico1n7.R.flushNeeded();}}

    @Test
    public
            void
            unrecognizedIndividualAfterIndividualSameAsShouldCauseParseException() {__CLR4_5_28cr8crlvico1n7.R.globalSliceStart(getClass().getName(),10999);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2j020vo8hj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28cr8crlvico1n7.R.rethrow($CLV_t2$);}finally{__CLR4_5_28cr8crlvico1n7.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.ManchesterOWLSyntaxParserErrorsTestCase.unrecognizedIndividualAfterIndividualSameAsShouldCauseParseException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10999,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2j020vo8hj(){try{__CLR4_5_28cr8crlvico1n7.R.inc(10999);
        __CLR4_5_28cr8crlvico1n7.R.inc(11000);checkForExceptionAt("Individual: ind SameAs: Q", 24, "Q");
    }finally{__CLR4_5_28cr8crlvico1n7.R.flushNeeded();}}

    @Test
    public void
            prematureEOFAfterIndividualDifferentFromShouldCauseParseException() {__CLR4_5_28cr8crlvico1n7.R.globalSliceStart(getClass().getName(),11001);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_275a9om8hl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28cr8crlvico1n7.R.rethrow($CLV_t2$);}finally{__CLR4_5_28cr8crlvico1n7.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.ManchesterOWLSyntaxParserErrorsTestCase.prematureEOFAfterIndividualDifferentFromShouldCauseParseException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),11001,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_275a9om8hl(){try{__CLR4_5_28cr8crlvico1n7.R.inc(11001);
        __CLR4_5_28cr8crlvico1n7.R.inc(11002);checkForExceptionAtEOF("Individual: ind DifferentFrom: ");
    }finally{__CLR4_5_28cr8crlvico1n7.R.flushNeeded();}}

    @Test
    public
            void
            unrecognizedIndividualAfterIndividualDifferentFromShouldCauseParseException() {__CLR4_5_28cr8crlvico1n7.R.globalSliceStart(getClass().getName(),11003);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2sxi2l98hn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28cr8crlvico1n7.R.rethrow($CLV_t2$);}finally{__CLR4_5_28cr8crlvico1n7.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.ManchesterOWLSyntaxParserErrorsTestCase.unrecognizedIndividualAfterIndividualDifferentFromShouldCauseParseException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),11003,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2sxi2l98hn(){try{__CLR4_5_28cr8crlvico1n7.R.inc(11003);
        __CLR4_5_28cr8crlvico1n7.R.inc(11004);checkForExceptionAt("Individual: ind DifferentFrom: Q", 31, "Q");
    }finally{__CLR4_5_28cr8crlvico1n7.R.flushNeeded();}}

    @Test
    public void unclosedLiteralShouldCauseParseException() {__CLR4_5_28cr8crlvico1n7.R.globalSliceStart(getClass().getName(),11005);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uae6r38hp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28cr8crlvico1n7.R.rethrow($CLV_t2$);}finally{__CLR4_5_28cr8crlvico1n7.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.ManchesterOWLSyntaxParserErrorsTestCase.unclosedLiteralShouldCauseParseException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),11005,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uae6r38hp(){try{__CLR4_5_28cr8crlvico1n7.R.inc(11005);
        __CLR4_5_28cr8crlvico1n7.R.inc(11006);checkForExceptionAtEOF("Class: C Annotations: rdfs:comment \"XYZ");
    }finally{__CLR4_5_28cr8crlvico1n7.R.flushNeeded();}}

    @Test
    public void prematureEOFAfterRuleShouldCauseParseException() {__CLR4_5_28cr8crlvico1n7.R.globalSliceStart(getClass().getName(),11007);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pjbpki8hr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28cr8crlvico1n7.R.rethrow($CLV_t2$);}finally{__CLR4_5_28cr8crlvico1n7.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.ManchesterOWLSyntaxParserErrorsTestCase.prematureEOFAfterRuleShouldCauseParseException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),11007,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pjbpki8hr(){try{__CLR4_5_28cr8crlvico1n7.R.inc(11007);
        __CLR4_5_28cr8crlvico1n7.R.inc(11008);checkForExceptionAtEOF("Class: C Rule: ");
    }finally{__CLR4_5_28cr8crlvico1n7.R.flushNeeded();}}

    @Test
    public void prematureEOFAfterRuleAtomShouldCauseParseException() {__CLR4_5_28cr8crlvico1n7.R.globalSliceStart(getClass().getName(),11009);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fixi0x8ht();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28cr8crlvico1n7.R.rethrow($CLV_t2$);}finally{__CLR4_5_28cr8crlvico1n7.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.ManchesterOWLSyntaxParserErrorsTestCase.prematureEOFAfterRuleAtomShouldCauseParseException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),11009,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fixi0x8ht(){try{__CLR4_5_28cr8crlvico1n7.R.inc(11009);
        __CLR4_5_28cr8crlvico1n7.R.inc(11010);checkForExceptionAtEOF("Class: C Rule: oP(?x, ?y) ");
    }finally{__CLR4_5_28cr8crlvico1n7.R.flushNeeded();}}

    @Test
    public void unrecognisedPropertyAfterRuleShouldCauseParseException() {__CLR4_5_28cr8crlvico1n7.R.globalSliceStart(getClass().getName(),11011);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2sqi2ta8hv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28cr8crlvico1n7.R.rethrow($CLV_t2$);}finally{__CLR4_5_28cr8crlvico1n7.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.ManchesterOWLSyntaxParserErrorsTestCase.unrecognisedPropertyAfterRuleShouldCauseParseException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),11011,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2sqi2ta8hv(){try{__CLR4_5_28cr8crlvico1n7.R.inc(11011);
        __CLR4_5_28cr8crlvico1n7.R.inc(11012);checkForExceptionAt("Class: C Rule: X(?x, ?y) ", 15, "X");
    }finally{__CLR4_5_28cr8crlvico1n7.R.flushNeeded();}}

    @Test
    public void unmarkedVariableInRuleAtomShouldCauseParseException() {__CLR4_5_28cr8crlvico1n7.R.globalSliceStart(getClass().getName(),11013);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fv8g2u8hx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28cr8crlvico1n7.R.rethrow($CLV_t2$);}finally{__CLR4_5_28cr8crlvico1n7.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.ManchesterOWLSyntaxParserErrorsTestCase.unmarkedVariableInRuleAtomShouldCauseParseException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),11013,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fv8g2u8hx(){try{__CLR4_5_28cr8crlvico1n7.R.inc(11013);
        __CLR4_5_28cr8crlvico1n7.R.inc(11014);checkForExceptionAt("Class: C Rule: oP(x, ?y)", 18, "x");
    }finally{__CLR4_5_28cr8crlvico1n7.R.flushNeeded();}}

    private void checkForExceptionAt(@Nonnull String input, int index,
            String currentToken) {try{__CLR4_5_28cr8crlvico1n7.R.inc(11015);
        __CLR4_5_28cr8crlvico1n7.R.inc(11016);try {
            __CLR4_5_28cr8crlvico1n7.R.inc(11017);parser.parse(input);
            __CLR4_5_28cr8crlvico1n7.R.inc(11018);fail();
        } catch (ParserException e) {
            __CLR4_5_28cr8crlvico1n7.R.inc(11019);assertEquals(index, e.getStartPos());
            __CLR4_5_28cr8crlvico1n7.R.inc(11020);assertEquals(currentToken, e.getCurrentToken());
            __CLR4_5_28cr8crlvico1n7.R.inc(11021);assertTrue(!e.getTokenSequence().isEmpty());
            __CLR4_5_28cr8crlvico1n7.R.inc(11022);assertEquals(currentToken, e.getTokenSequence().get(0));
        }
    }finally{__CLR4_5_28cr8crlvico1n7.R.flushNeeded();}}

    private void checkForExceptionAtEOF(@Nonnull String input) {try{__CLR4_5_28cr8crlvico1n7.R.inc(11023);
        __CLR4_5_28cr8crlvico1n7.R.inc(11024);checkForExceptionAt(input, input.length(),
                ManchesterOWLSyntaxTokenizer.EOF);
        __CLR4_5_28cr8crlvico1n7.R.inc(11025);String trimmedInput = input.trim();
        __CLR4_5_28cr8crlvico1n7.R.inc(11026);checkForExceptionAt(trimmedInput, trimmedInput.length(),
                ManchesterOWLSyntaxTokenizer.EOF);
    }finally{__CLR4_5_28cr8crlvico1n7.R.flushNeeded();}}

    private class ParserWrapper {

        ParserWrapper() {try{__CLR4_5_28cr8crlvico1n7.R.inc(11027);}finally{__CLR4_5_28cr8crlvico1n7.R.flushNeeded();}}

        public void parse(@Nonnull String input) {try{__CLR4_5_28cr8crlvico1n7.R.inc(11028);
            __CLR4_5_28cr8crlvico1n7.R.inc(11029);ManchesterOWLSyntaxParser actualParser = OWLManager
                    .createManchesterParser();
            __CLR4_5_28cr8crlvico1n7.R.inc(11030);actualParser.setOWLEntityChecker(entityChecker);
            __CLR4_5_28cr8crlvico1n7.R.inc(11031);actualParser.setStringToParse(input);
            __CLR4_5_28cr8crlvico1n7.R.inc(11032);actualParser.parseFrames();
        }finally{__CLR4_5_28cr8crlvico1n7.R.flushNeeded();}}
    }
}
