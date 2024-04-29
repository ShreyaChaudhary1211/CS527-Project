/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//* This file is part of the OWL API.
 * The contents of this file are subject to the LGPL License, Version 3.0.
 * Copyright 2014, The University of Manchester
 * 
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program.  If not, see http://www.gnu.org/licenses/.
 *
 * Alternatively, the contents of this file may be used under the terms of the Apache License, Version 2.0 in which case, the provisions of the Apache License Version 2.0 are applicable instead of those above.
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */
package org.semanticweb.owlapi.api.test.syntax;

import static org.junit.Assert.*;
import static org.semanticweb.owlapi.apibinding.OWLFunctionalSyntaxFactory.*;
import static org.semanticweb.owlapi.model.parameters.Imports.EXCLUDED;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.Nonnull;

import org.junit.Test;
import org.semanticweb.owlapi.api.test.baseclasses.TestBase;
import org.semanticweb.owlapi.formats.TurtleDocumentFormat;
import org.semanticweb.owlapi.io.AnonymousIndividualProperties;
import org.semanticweb.owlapi.io.StringDocumentSource;
import org.semanticweb.owlapi.io.StringDocumentTarget;
import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.vocab.OWL2Datatype;

@SuppressWarnings("javadoc")
public class TurtleTestCase extends TestBase {static class __CLR4_5_28y28y2lvico1rl{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,11762,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testLoadingUTF8BOM() throws Exception {__CLR4_5_28y28y2lvico1rl.R.globalSliceStart(getClass().getName(),11594);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2m3is248y2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28y28y2lvico1rl.R.rethrow($CLV_t2$);}finally{__CLR4_5_28y28y2lvico1rl.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.TurtleTestCase.testLoadingUTF8BOM",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),11594,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2m3is248y2() throws Exception{try{__CLR4_5_28y28y2lvico1rl.R.inc(11594);
        __CLR4_5_28y28y2lvico1rl.R.inc(11595);IRI uri = IRI.create(getClass().getResource("/ttl-with-bom.ttl").toURI());
        __CLR4_5_28y28y2lvico1rl.R.inc(11596);m.loadOntologyFromOntologyDocument(uri);
    }finally{__CLR4_5_28y28y2lvico1rl.R.flushNeeded();}}

    @Nonnull private final IRI iri = IRI.create("urn:testliterals");
    @Nonnull private final TurtleDocumentFormat tf = new TurtleDocumentFormat();
    @Nonnull private final IRI s = IRI.create("urn:test#s");

    @Test
    public void shouldParseFixedQuotesLiterals1() throws OWLOntologyCreationException {__CLR4_5_28y28y2lvico1rl.R.globalSliceStart(getClass().getName(),11597);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2egsobt8y5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28y28y2lvico1rl.R.rethrow($CLV_t2$);}finally{__CLR4_5_28y28y2lvico1rl.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.TurtleTestCase.shouldParseFixedQuotesLiterals1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),11597,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2egsobt8y5() throws OWLOntologyCreationException{try{__CLR4_5_28y28y2lvico1rl.R.inc(11597);
        __CLR4_5_28y28y2lvico1rl.R.inc(11598);OWLOntology o = loadOntologyFromString(new StringDocumentSource("<urn:test#s> <urn:test#p> ''' ''\\' ''' .",
            iri, tf, null));
        __CLR4_5_28y28y2lvico1rl.R.inc(11599);for (OWLAnnotationAssertionAxiom ax : o.getAnnotationAssertionAxioms(s)) {{
            __CLR4_5_28y28y2lvico1rl.R.inc(11600);assertEquals(" ''' ", ((OWLLiteral) ax.getValue()).getLiteral());
        }
    }}finally{__CLR4_5_28y28y2lvico1rl.R.flushNeeded();}}

    @Test
    public void shouldParseFixedQuotesLiterals2() throws OWLOntologyCreationException {__CLR4_5_28y28y2lvico1rl.R.globalSliceStart(getClass().getName(),11601);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hpsn4a8y9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28y28y2lvico1rl.R.rethrow($CLV_t2$);}finally{__CLR4_5_28y28y2lvico1rl.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.TurtleTestCase.shouldParseFixedQuotesLiterals2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),11601,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hpsn4a8y9() throws OWLOntologyCreationException{try{__CLR4_5_28y28y2lvico1rl.R.inc(11601);
        __CLR4_5_28y28y2lvico1rl.R.inc(11602);OWLOntology o = loadOntologyFromString(new StringDocumentSource(
            "<urn:test#s> <urn:test#p> \"\"\" \"\"\\\" \"\"\" .", iri, tf, null));
        __CLR4_5_28y28y2lvico1rl.R.inc(11603);for (OWLAnnotationAssertionAxiom ax : o.getAnnotationAssertionAxioms(s)) {{
            __CLR4_5_28y28y2lvico1rl.R.inc(11604);assertEquals(" \"\"\" ", ((OWLLiteral) ax.getValue()).getLiteral());
        }
    }}finally{__CLR4_5_28y28y2lvico1rl.R.flushNeeded();}}

    @Test
    public void shouldParseFixedQuotesLiterals3() throws OWLOntologyCreationException {__CLR4_5_28y28y2lvico1rl.R.globalSliceStart(getClass().getName(),11605);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kyslwr8yd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28y28y2lvico1rl.R.rethrow($CLV_t2$);}finally{__CLR4_5_28y28y2lvico1rl.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.TurtleTestCase.shouldParseFixedQuotesLiterals3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),11605,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kyslwr8yd() throws OWLOntologyCreationException{try{__CLR4_5_28y28y2lvico1rl.R.inc(11605);
        __CLR4_5_28y28y2lvico1rl.R.inc(11606);OWLOntology o = loadOntologyFromString(new StringDocumentSource(
            "<urn:test#s> <urn:test#p> \"\"\" \"\"\\u0061 \"\"\" .", iri, tf, null));
        __CLR4_5_28y28y2lvico1rl.R.inc(11607);for (OWLAnnotationAssertionAxiom ax : o.getAnnotationAssertionAxioms(s)) {{
            __CLR4_5_28y28y2lvico1rl.R.inc(11608);assertEquals(" \"\"a ", ((OWLLiteral) ax.getValue()).getLiteral());
        }
    }}finally{__CLR4_5_28y28y2lvico1rl.R.flushNeeded();}}

    @Test
    public void shouldParseFixedQuotesLiterals4() throws OWLOntologyCreationException {__CLR4_5_28y28y2lvico1rl.R.globalSliceStart(getClass().getName(),11609);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2o7skp88yh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28y28y2lvico1rl.R.rethrow($CLV_t2$);}finally{__CLR4_5_28y28y2lvico1rl.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.TurtleTestCase.shouldParseFixedQuotesLiterals4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),11609,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2o7skp88yh() throws OWLOntologyCreationException{try{__CLR4_5_28y28y2lvico1rl.R.inc(11609);
        __CLR4_5_28y28y2lvico1rl.R.inc(11610);OWLOntology o = loadOntologyFromString(new StringDocumentSource(
            "<urn:test#s> <urn:test#p> \"\"\"\"\"\\\"\"\"\" .", iri, tf, null));
        __CLR4_5_28y28y2lvico1rl.R.inc(11611);for (OWLAnnotationAssertionAxiom ax : o.getAnnotationAssertionAxioms(s)) {{
            __CLR4_5_28y28y2lvico1rl.R.inc(11612);assertEquals("\"\"\"", ((OWLLiteral) ax.getValue()).getLiteral());
        }
    }}finally{__CLR4_5_28y28y2lvico1rl.R.flushNeeded();}}

    @Test
    public void shouldParseFixedQuotesLiterals5() throws OWLOntologyCreationException {__CLR4_5_28y28y2lvico1rl.R.globalSliceStart(getClass().getName(),11613);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rgsjhp8yl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28y28y2lvico1rl.R.rethrow($CLV_t2$);}finally{__CLR4_5_28y28y2lvico1rl.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.TurtleTestCase.shouldParseFixedQuotesLiterals5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),11613,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rgsjhp8yl() throws OWLOntologyCreationException{try{__CLR4_5_28y28y2lvico1rl.R.inc(11613);
        __CLR4_5_28y28y2lvico1rl.R.inc(11614);OWLOntology o = loadOntologyFromString(new StringDocumentSource(
            "<urn:test#s> <urn:test#p> \"\"\"\"\"\\u0061\"\"\" .", iri, tf, null));
        __CLR4_5_28y28y2lvico1rl.R.inc(11615);for (OWLAnnotationAssertionAxiom ax : o.getAnnotationAssertionAxioms(s)) {{
            __CLR4_5_28y28y2lvico1rl.R.inc(11616);assertEquals("\"\"a", ((OWLLiteral) ax.getValue()).getLiteral());
        }
    }}finally{__CLR4_5_28y28y2lvico1rl.R.flushNeeded();}}

    @Test
    public void shouldParseOntologyThatworked() throws OWLOntologyCreationException {__CLR4_5_28y28y2lvico1rl.R.globalSliceStart(getClass().getName(),11617);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wna3v78yp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28y28y2lvico1rl.R.rethrow($CLV_t2$);}finally{__CLR4_5_28y28y2lvico1rl.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.TurtleTestCase.shouldParseOntologyThatworked",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),11617,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wna3v78yp() throws OWLOntologyCreationException{try{__CLR4_5_28y28y2lvico1rl.R.inc(11617);
        // given
        __CLR4_5_28y28y2lvico1rl.R.inc(11618);String working = "@prefix rdfs:    <http://www.w3.org/2000/01/rdf-schema#> .\n @prefix foaf:    <http://xmlns.com/foaf/0.1/> .\n foaf:fundedBy rdfs:isDefinedBy <http://xmlns.com/foaf/0.1/> .";
        __CLR4_5_28y28y2lvico1rl.R.inc(11619);OWLAxiom expected = AnnotationAssertion(df.getRDFSIsDefinedBy(), IRI("http://xmlns.com/foaf/0.1/fundedBy"), IRI(
            "http://xmlns.com/foaf/0.1/"));
        // when
        __CLR4_5_28y28y2lvico1rl.R.inc(11620);OWLOntology o = loadOntologyFromString(working);
        // then
        __CLR4_5_28y28y2lvico1rl.R.inc(11621);assertTrue(o.getAxioms().contains(expected));
    }finally{__CLR4_5_28y28y2lvico1rl.R.flushNeeded();}}

    @Test
    public void shouldParseQuotedTripleQuotes() throws OWLOntologyCreationException {__CLR4_5_28y28y2lvico1rl.R.globalSliceStart(getClass().getName(),11622);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2g72lj08yu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28y28y2lvico1rl.R.rethrow($CLV_t2$);}finally{__CLR4_5_28y28y2lvico1rl.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.TurtleTestCase.shouldParseQuotedTripleQuotes",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),11622,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2g72lj08yu() throws OWLOntologyCreationException{try{__CLR4_5_28y28y2lvico1rl.R.inc(11622);
        // given
        __CLR4_5_28y28y2lvico1rl.R.inc(11623);String literal = "Diadenosine 5',5'''-P1,P4-tetraphosphate phosphorylase";
        __CLR4_5_28y28y2lvico1rl.R.inc(11624);String working = "@prefix rdfs:    <http://www.w3.org/2000/01/rdf-schema#> .\n "
            + "@prefix foaf:    <http://xmlns.com/foaf/0.1/> .\n foaf:fundedBy " + "rdfs:label \"\"\"" + literal
            + "\"\"\"@en .";
        __CLR4_5_28y28y2lvico1rl.R.inc(11625);OWLAxiom expected = AnnotationAssertion(df.getRDFSLabel(), IRI("http://xmlns.com/foaf/0.1/fundedBy"), Literal(
            literal, "en"));
        // when
        __CLR4_5_28y28y2lvico1rl.R.inc(11626);OWLOntology o = loadOntologyFromString(working);
        // then
        __CLR4_5_28y28y2lvico1rl.R.inc(11627);assertEquals(expected, o.getAxioms().iterator().next());
    }finally{__CLR4_5_28y28y2lvico1rl.R.flushNeeded();}}

    @Test
    public void shouldParseOntologyThatBroke() throws OWLOntologyCreationException {__CLR4_5_28y28y2lvico1rl.R.globalSliceStart(getClass().getName(),11628);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a32ytm8z0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28y28y2lvico1rl.R.rethrow($CLV_t2$);}finally{__CLR4_5_28y28y2lvico1rl.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.TurtleTestCase.shouldParseOntologyThatBroke",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),11628,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a32ytm8z0() throws OWLOntologyCreationException{try{__CLR4_5_28y28y2lvico1rl.R.inc(11628);
        // given
        __CLR4_5_28y28y2lvico1rl.R.inc(11629);String input = "@prefix f:    <urn:test/> . f:r f:p f: .";
        __CLR4_5_28y28y2lvico1rl.R.inc(11630);OWLAxiom expected = df.getOWLAnnotationAssertionAxiom(df.getOWLAnnotationProperty(IRI("urn:test/p")), IRI(
            "urn:test/r"), IRI("urn:test/"));
        // when
        __CLR4_5_28y28y2lvico1rl.R.inc(11631);OWLOntology o = loadOntologyFromString(input);
        // then
        __CLR4_5_28y28y2lvico1rl.R.inc(11632);assertTrue(o.getAxioms().contains(expected));
    }finally{__CLR4_5_28y28y2lvico1rl.R.flushNeeded();}}

    @Test
    public void shouldResolveAgainstBase() throws OWLOntologyCreationException {__CLR4_5_28y28y2lvico1rl.R.globalSliceStart(getClass().getName(),11633);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qnw0w8z5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28y28y2lvico1rl.R.rethrow($CLV_t2$);}finally{__CLR4_5_28y28y2lvico1rl.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.TurtleTestCase.shouldResolveAgainstBase",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),11633,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qnw0w8z5() throws OWLOntologyCreationException{try{__CLR4_5_28y28y2lvico1rl.R.inc(11633);
        // given
        __CLR4_5_28y28y2lvico1rl.R.inc(11634);String input = "@base <http://test.org/path#> .\n <a1> <b1> <c1> .";
        // when
        __CLR4_5_28y28y2lvico1rl.R.inc(11635);OWLOntology o = loadOntologyFromString(input);
        // then
        __CLR4_5_28y28y2lvico1rl.R.inc(11636);String axioms = o.getAxioms().toString();
        __CLR4_5_28y28y2lvico1rl.R.inc(11637);assertTrue(axioms.contains("http://test.org/a1"));
        __CLR4_5_28y28y2lvico1rl.R.inc(11638);assertTrue(axioms.contains("http://test.org/b1"));
        __CLR4_5_28y28y2lvico1rl.R.inc(11639);assertTrue(axioms.contains("http://test.org/c1"));
    }finally{__CLR4_5_28y28y2lvico1rl.R.flushNeeded();}}

    // test for 3543488
    @Test
    public void shouldRoundTripTurtleWithsharedBnodes() throws Exception {__CLR4_5_28y28y2lvico1rl.R.globalSliceStart(getClass().getName(),11640);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jruhdv8zc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28y28y2lvico1rl.R.rethrow($CLV_t2$);}finally{__CLR4_5_28y28y2lvico1rl.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.TurtleTestCase.shouldRoundTripTurtleWithsharedBnodes",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),11640,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jruhdv8zc() throws Exception{try{__CLR4_5_28y28y2lvico1rl.R.inc(11640);
        __CLR4_5_28y28y2lvico1rl.R.inc(11641);AnonymousIndividualProperties.setRemapAllAnonymousIndividualsIds(false);
        __CLR4_5_28y28y2lvico1rl.R.inc(11642);try {
            __CLR4_5_28y28y2lvico1rl.R.inc(11643);String input = "@prefix ex: <http://example.com/test> .\n ex:ex1 a ex:Something ; ex:prop1 _:a .\n _:a a ex:Something1 ; ex:prop2 _:b .\n _:b a ex:Something ; ex:prop3 _:a .";
            __CLR4_5_28y28y2lvico1rl.R.inc(11644);OWLOntology ontology = loadOntologyFromString(input);
            __CLR4_5_28y28y2lvico1rl.R.inc(11645);OWLOntology onto2 = roundTrip(ontology, new TurtleDocumentFormat());
            __CLR4_5_28y28y2lvico1rl.R.inc(11646);equal(ontology, onto2);
        } finally {
            __CLR4_5_28y28y2lvico1rl.R.inc(11647);AnonymousIndividualProperties.resetToDefault();
        }
    }finally{__CLR4_5_28y28y2lvico1rl.R.flushNeeded();}}

    // test for 335
    @Test
    public void shouldParseScientificNotation() throws OWLOntologyCreationException {__CLR4_5_28y28y2lvico1rl.R.globalSliceStart(getClass().getName(),11648);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2iloxri8zk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28y28y2lvico1rl.R.rethrow($CLV_t2$);}finally{__CLR4_5_28y28y2lvico1rl.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.TurtleTestCase.shouldParseScientificNotation",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),11648,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2iloxri8zk() throws OWLOntologyCreationException{try{__CLR4_5_28y28y2lvico1rl.R.inc(11648);
        __CLR4_5_28y28y2lvico1rl.R.inc(11649);String input = "<http://dbpedia.org/resource/South_Africa> <http://dbpedia.org/ontology/areaTotal> 1e+07 .";
        __CLR4_5_28y28y2lvico1rl.R.inc(11650);OWLOntology ontology = loadOntologyFromString(input);
        __CLR4_5_28y28y2lvico1rl.R.inc(11651);OWLAnnotationProperty p = AnnotationProperty(IRI("http://dbpedia.org/ontology/areaTotal"));
        __CLR4_5_28y28y2lvico1rl.R.inc(11652);assertTrue(ontology.getAnnotationPropertiesInSignature(EXCLUDED).contains(p));
        __CLR4_5_28y28y2lvico1rl.R.inc(11653);IRI i = IRI("http://dbpedia.org/resource/South_Africa");
        __CLR4_5_28y28y2lvico1rl.R.inc(11654);assertTrue(ontology.containsAxiom(AnnotationAssertion(p, i, Literal("1.0E7", OWL2Datatype.XSD_DOUBLE))));
    }finally{__CLR4_5_28y28y2lvico1rl.R.flushNeeded();}}

    @Test
    public void shouldParseScientificNotationWithMinus() throws OWLOntologyCreationException {__CLR4_5_28y28y2lvico1rl.R.globalSliceStart(getClass().getName(),11655);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21t8jei8zr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28y28y2lvico1rl.R.rethrow($CLV_t2$);}finally{__CLR4_5_28y28y2lvico1rl.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.TurtleTestCase.shouldParseScientificNotationWithMinus",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),11655,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21t8jei8zr() throws OWLOntologyCreationException{try{__CLR4_5_28y28y2lvico1rl.R.inc(11655);
        __CLR4_5_28y28y2lvico1rl.R.inc(11656);String input = "<http://dbpedia.org/resource/South_Africa> <http://dbpedia.org/ontology/areaTotal> 1e-07 .";
        __CLR4_5_28y28y2lvico1rl.R.inc(11657);OWLOntology ontology = loadOntologyFromString(input);
        __CLR4_5_28y28y2lvico1rl.R.inc(11658);OWLAnnotationProperty p = AnnotationProperty(IRI("http://dbpedia.org/ontology/areaTotal"));
        __CLR4_5_28y28y2lvico1rl.R.inc(11659);assertTrue(ontology.getAnnotationPropertiesInSignature(EXCLUDED).contains(p));
        __CLR4_5_28y28y2lvico1rl.R.inc(11660);IRI i = IRI("http://dbpedia.org/resource/South_Africa");
        __CLR4_5_28y28y2lvico1rl.R.inc(11661);assertTrue(ontology.containsAxiom(AnnotationAssertion(p, i, Literal("1.0E-7", OWL2Datatype.XSD_DOUBLE))));
    }finally{__CLR4_5_28y28y2lvico1rl.R.flushNeeded();}}

    @Test
    public void shouldParseScientificNotationWithMinusFromBug() throws OWLOntologyCreationException {__CLR4_5_28y28y2lvico1rl.R.globalSliceStart(getClass().getName(),11662);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2u51dla8zy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28y28y2lvico1rl.R.rethrow($CLV_t2$);}finally{__CLR4_5_28y28y2lvico1rl.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.TurtleTestCase.shouldParseScientificNotationWithMinusFromBug",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),11662,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2u51dla8zy() throws OWLOntologyCreationException{try{__CLR4_5_28y28y2lvico1rl.R.inc(11662);
        __CLR4_5_28y28y2lvico1rl.R.inc(11663);String input = "<http://www.example.com/ontologies/2014/6/medicine#m.0hycptl> <http://www.example.com/ontologies/2014/6/medicine#medicine.drug_strength.strength_value> 8e-05 . \n"
            + "    <http://www.example.com/ontologies/2014/6/medicine#m.0hyckjg> <http://www.example.com/ontologies/2014/6/medicine#medicine.drug_strength.strength_value> 0.03 . \n"
            + "    <http://www.example.com/ontologies/2014/6/medicine#m.0hyckjg> <http://www.example.com/ontologies/2014/6/medicine#medicine.drug_strength.strength_value> 20.0 . \n"
            + "    <http://www.example.com/ontologies/2014/6/medicine#m.0hyckjg> <http://www.example.com/ontologies/2014/6/medicine#medicine.drug_strength.strength_value> 30.0 . \n"
            + "    <http://www.example.com/ontologies/2014/6/medicine#m.0hyckjg> <http://www.example.com/ontologies/2014/6/medicine#medicine.drug_strength.strength_value> 3.5 . ";
        __CLR4_5_28y28y2lvico1rl.R.inc(11664);loadOntologyFromString(input);
    }finally{__CLR4_5_28y28y2lvico1rl.R.flushNeeded();}}

    @Test
    public void shouldParseTwo() throws OWLOntologyCreationException {__CLR4_5_28y28y2lvico1rl.R.globalSliceStart(getClass().getName(),11665);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ty154j901();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28y28y2lvico1rl.R.rethrow($CLV_t2$);}finally{__CLR4_5_28y28y2lvico1rl.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.TurtleTestCase.shouldParseTwo",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),11665,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ty154j901() throws OWLOntologyCreationException{try{__CLR4_5_28y28y2lvico1rl.R.inc(11665);
        __CLR4_5_28y28y2lvico1rl.R.inc(11666);String input = "<http://dbpedia.org/resource/South_Africa> <http://dbpedia.org/ontology/areaTotal> 1 .";
        __CLR4_5_28y28y2lvico1rl.R.inc(11667);OWLOntology ontology = loadOntologyFromString(input);
        __CLR4_5_28y28y2lvico1rl.R.inc(11668);OWLAnnotationProperty p = AnnotationProperty(IRI("http://dbpedia.org/ontology/areaTotal"));
        __CLR4_5_28y28y2lvico1rl.R.inc(11669);assertTrue(ontology.getAnnotationPropertiesInSignature(EXCLUDED).contains(p));
        __CLR4_5_28y28y2lvico1rl.R.inc(11670);IRI i = IRI("http://dbpedia.org/resource/South_Africa");
        __CLR4_5_28y28y2lvico1rl.R.inc(11671);assertTrue(ontology.containsAxiom(AnnotationAssertion(p, i, Literal(1))));
    }finally{__CLR4_5_28y28y2lvico1rl.R.flushNeeded();}}

    @Test
    public void shouldParseOne() throws OWLOntologyCreationException {__CLR4_5_28y28y2lvico1rl.R.globalSliceStart(getClass().getName(),11672);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2os10jx908();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28y28y2lvico1rl.R.rethrow($CLV_t2$);}finally{__CLR4_5_28y28y2lvico1rl.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.TurtleTestCase.shouldParseOne",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),11672,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2os10jx908() throws OWLOntologyCreationException{try{__CLR4_5_28y28y2lvico1rl.R.inc(11672);
        __CLR4_5_28y28y2lvico1rl.R.inc(11673);String input = "<http://dbpedia.org/resource/South_Africa> <http://dbpedia.org/ontology/areaTotal> 1.0.";
        __CLR4_5_28y28y2lvico1rl.R.inc(11674);OWLOntology ontology = loadOntologyFromString(input);
        __CLR4_5_28y28y2lvico1rl.R.inc(11675);OWLAnnotationProperty p = AnnotationProperty(IRI("http://dbpedia.org/ontology/areaTotal"));
        __CLR4_5_28y28y2lvico1rl.R.inc(11676);assertTrue(ontology.getAnnotationPropertiesInSignature(EXCLUDED).contains(p));
        __CLR4_5_28y28y2lvico1rl.R.inc(11677);IRI i = IRI("http://dbpedia.org/resource/South_Africa");
        __CLR4_5_28y28y2lvico1rl.R.inc(11678);assertTrue(ontology.containsAxiom(AnnotationAssertion(p, i, Literal("1.0", OWL2Datatype.XSD_DECIMAL))));
    }finally{__CLR4_5_28y28y2lvico1rl.R.flushNeeded();}}

    @Test
    public void shouldParseEmptySpaceInBnode() throws OWLOntologyCreationException {__CLR4_5_28y28y2lvico1rl.R.globalSliceStart(getClass().getName(),11679);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2r5k7hp90f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28y28y2lvico1rl.R.rethrow($CLV_t2$);}finally{__CLR4_5_28y28y2lvico1rl.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.TurtleTestCase.shouldParseEmptySpaceInBnode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),11679,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2r5k7hp90f() throws OWLOntologyCreationException{try{__CLR4_5_28y28y2lvico1rl.R.inc(11679);
        __CLR4_5_28y28y2lvico1rl.R.inc(11680);String input = "<http://taxonomy.wolterskluwer.de/practicearea/10112>\n a <http://schema.wolterskluwer.de/TaxonomyTerm> , <http://www.w3.org/2004/02/skos/core#Concept> ;\n"
            + "      <http://www.w3.org/2004/02/skos/core#broader>\n [] ;\n"
            + "      <http://www.w3.org/2004/02/skos/core#broader>\n [] .";
        __CLR4_5_28y28y2lvico1rl.R.inc(11681);OWLOntology ontology = loadOntologyFromString(input);
        __CLR4_5_28y28y2lvico1rl.R.inc(11682);OWLIndividual i = NamedIndividual(IRI("http://taxonomy.wolterskluwer.de/practicearea/10112"));
        __CLR4_5_28y28y2lvico1rl.R.inc(11683);OWLAnnotationProperty ap = AnnotationProperty(IRI("http://www.w3.org/2004/02/skos/core#broader"));
        __CLR4_5_28y28y2lvico1rl.R.inc(11684);OWLClass c = Class(IRI("http://www.w3.org/2004/02/skos/core#Concept"));
        __CLR4_5_28y28y2lvico1rl.R.inc(11685);OWLClass term = Class(IRI("http://schema.wolterskluwer.de/TaxonomyTerm"));
        __CLR4_5_28y28y2lvico1rl.R.inc(11686);assertTrue(ontology.containsAxiom(ClassAssertion(c, i)));
        __CLR4_5_28y28y2lvico1rl.R.inc(11687);assertTrue(ontology.containsAxiom(ClassAssertion(term, i)));
        __CLR4_5_28y28y2lvico1rl.R.inc(11688);assertTrue(ontology.containsEntityInSignature(ap));
    }finally{__CLR4_5_28y28y2lvico1rl.R.flushNeeded();}}

    @Test
    public void shouldRoundTripAxiomAnnotation() throws Exception {__CLR4_5_28y28y2lvico1rl.R.globalSliceStart(getClass().getName(),11689);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2iw13dm90p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28y28y2lvico1rl.R.rethrow($CLV_t2$);}finally{__CLR4_5_28y28y2lvico1rl.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.TurtleTestCase.shouldRoundTripAxiomAnnotation",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),11689,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2iw13dm90p() throws Exception{try{__CLR4_5_28y28y2lvico1rl.R.inc(11689);
        __CLR4_5_28y28y2lvico1rl.R.inc(11690);String input = "@prefix : <urn:fm2#> .\n" + "@prefix fm:    <urn:fm2#> .\n"
            + "@prefix owl: <http://www.w3.org/2002/07/owl#> .\n"
            + "@prefix rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#> .\n"
            + "@prefix xml: <http://www.w3.org/XML/1998/namespace> .\n"
            + "@prefix xsd: <http://www.w3.org/2001/XMLSchema#> .\n" + "@prefix prov: <urn:prov#> .\n"
            + "@prefix rdfs: <http://www.w3.org/2000/01/rdf-schema#> .\n" + "@base <urn:fm2> .\n\n"
            + "<http://www.ida.org/fm2.owl> rdf:type owl:Ontology.\n" + ":prov rdf:type owl:AnnotationProperty .\n\n"
            + ":Manage rdf:type owl:Class ; rdfs:subClassOf :ManagementType .\n" + "[ rdf:type owl:Axiom ;\n"
            + "  owl:annotatedSource :Manage ;\n" + "  owl:annotatedTarget :ManagementType ;\n"
            + "  owl:annotatedProperty rdfs:subClassOf ;\n"
            + "  :prov [\n prov:gen :FMDomain ;\n prov:att :DM .\n ]\n ] .\n" + ":ManagementType rdf:type owl:Class .\n"
            + ":DM rdf:type owl:NamedIndividual , prov:Person .\n"
            + ":FMDomain rdf:type owl:NamedIndividual , prov:Activity ; prov:ass :DM .";
        __CLR4_5_28y28y2lvico1rl.R.inc(11691);OWLOntology ontology = loadOntologyFromString(input);
        __CLR4_5_28y28y2lvico1rl.R.inc(11692);OWLOntology o = roundTrip(ontology, new TurtleDocumentFormat());
        __CLR4_5_28y28y2lvico1rl.R.inc(11693);Set<OWLSubClassOfAxiom> axioms = o.getAxioms(AxiomType.SUBCLASS_OF);
        __CLR4_5_28y28y2lvico1rl.R.inc(11694);assertEquals(1, axioms.size());
        __CLR4_5_28y28y2lvico1rl.R.inc(11695);OWLAnnotation next = axioms.iterator().next().getAnnotations().iterator().next();
        __CLR4_5_28y28y2lvico1rl.R.inc(11696);assertTrue(next.getValue() instanceof OWLAnonymousIndividual);
        __CLR4_5_28y28y2lvico1rl.R.inc(11697);OWLAnonymousIndividual ind = (OWLAnonymousIndividual) next.getValue();
        __CLR4_5_28y28y2lvico1rl.R.inc(11698);Set<OWLAxiom> anns = new HashSet<>();
        __CLR4_5_28y28y2lvico1rl.R.inc(11699);for (OWLAxiom ax : o.getAxioms()) {{
            __CLR4_5_28y28y2lvico1rl.R.inc(11700);if ((((ax.getAnonymousIndividuals().contains(ind))&&(__CLR4_5_28y28y2lvico1rl.R.iget(11701)!=0|true))||(__CLR4_5_28y28y2lvico1rl.R.iget(11702)==0&false))) {{
                __CLR4_5_28y28y2lvico1rl.R.inc(11703);anns.add(ax);
            }
        }}
        }__CLR4_5_28y28y2lvico1rl.R.inc(11704);assertEquals(1, anns.size());
    }finally{__CLR4_5_28y28y2lvico1rl.R.flushNeeded();}}

    @Test
    public void shouldRoundTripAxiomAnnotationWithSlashOntologyIRI() throws Exception {__CLR4_5_28y28y2lvico1rl.R.globalSliceStart(getClass().getName(),11705);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25pjuo915();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28y28y2lvico1rl.R.rethrow($CLV_t2$);}finally{__CLR4_5_28y28y2lvico1rl.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.TurtleTestCase.shouldRoundTripAxiomAnnotationWithSlashOntologyIRI",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),11705,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25pjuo915() throws Exception{try{__CLR4_5_28y28y2lvico1rl.R.inc(11705);
        __CLR4_5_28y28y2lvico1rl.R.inc(11706);String input = "@prefix : <urn:test#test.owl/> .\n" + "@prefix owl: <http://www.w3.org/2002/07/owl#> .\n"
            + "@prefix rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#> .\n"
            + "@prefix xml: <http://www.w3.org/XML/1998/namespace> .\n"
            + "@prefix xsd: <http://www.w3.org/2001/XMLSchema#> .\n"
            + "@prefix rdfs: <http://www.w3.org/2000/01/rdf-schema#> .\n" + "@base <urn:test#test.owl/> .\n"
            + "<urn:test#test.owl/> rdf:type owl:Ontology .\n" + ":q rdf:type owl:Class .\n"
            + ":t rdf:type owl:Class ; rdfs:subClassOf :q .";
        __CLR4_5_28y28y2lvico1rl.R.inc(11707);OWLOntology in = loadOntologyFromString(input);
        __CLR4_5_28y28y2lvico1rl.R.inc(11708);String string = "urn:test#test.owl/";
        __CLR4_5_28y28y2lvico1rl.R.inc(11709);OWLOntology ontology = m.createOntology(IRI.create(string));
        __CLR4_5_28y28y2lvico1rl.R.inc(11710);m.addAxiom(ontology, df.getOWLSubClassOfAxiom(df.getOWLClass(IRI.create(string + 't')), df.getOWLClass(IRI
            .create(string + 'q'))));
        __CLR4_5_28y28y2lvico1rl.R.inc(11711);OWLOntology o = roundTrip(ontology, new TurtleDocumentFormat());
        __CLR4_5_28y28y2lvico1rl.R.inc(11712);equal(o, in);
    }finally{__CLR4_5_28y28y2lvico1rl.R.flushNeeded();}}

    @Test
    public void presentDeclaration() throws OWLOntologyCreationException {__CLR4_5_28y28y2lvico1rl.R.globalSliceStart(getClass().getName(),11713);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rrnzkq91d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28y28y2lvico1rl.R.rethrow($CLV_t2$);}finally{__CLR4_5_28y28y2lvico1rl.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.TurtleTestCase.presentDeclaration",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),11713,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rrnzkq91d() throws OWLOntologyCreationException{try{__CLR4_5_28y28y2lvico1rl.R.inc(11713);
        // given
        __CLR4_5_28y28y2lvico1rl.R.inc(11714);String input = "<urn:test#Settlement> rdf:type owl:Class.\n <urn:test#fm2.owl> rdf:type owl:Ontology.\n <urn:test#numberOfPads> rdf:type owl:ObjectProperty ;\n rdfs:domain <urn:test#Settlement> .";
        // when
        __CLR4_5_28y28y2lvico1rl.R.inc(11715);OWLOntology o = loadOntologyFromString(input);
        // then
        __CLR4_5_28y28y2lvico1rl.R.inc(11716);for (OWLLogicalAxiom ax : o.getLogicalAxioms()) {{
            __CLR4_5_28y28y2lvico1rl.R.inc(11717);assertTrue(ax instanceof OWLObjectPropertyDomainAxiom);
        }
    }}finally{__CLR4_5_28y28y2lvico1rl.R.flushNeeded();}}

    @Test
    public void whenMissingClassDeclarationCausesIllegalPunningAssertionsShouldBeFixedAfterParsing()
        throws OWLOntologyCreationException {__CLR4_5_28y28y2lvico1rl.R.globalSliceStart(getClass().getName(),11718);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26bnd5591i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28y28y2lvico1rl.R.rethrow($CLV_t2$);}finally{__CLR4_5_28y28y2lvico1rl.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.TurtleTestCase.whenMissingClassDeclarationCausesIllegalPunningAssertionsShouldBeFixedAfterParsing",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),11718,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26bnd5591i() throws OWLOntologyCreationException{try{__CLR4_5_28y28y2lvico1rl.R.inc(11718);
        // given
        __CLR4_5_28y28y2lvico1rl.R.inc(11719);String input = "<urn:test#fm2.owl> rdf:type owl:Ontology.\n <urn:test#numberOfPads> rdf:type owl:ObjectProperty ;\n rdfs:domain <urn:test#Settlement> .";
        // when
        __CLR4_5_28y28y2lvico1rl.R.inc(11720);OWLOntology o = loadOntologyFromString(input);
        // then
        // Parsed as annotation domain, fixed in post parsing to object property
        // domain
        __CLR4_5_28y28y2lvico1rl.R.inc(11721);for (OWLLogicalAxiom ax : o.getLogicalAxioms()) {{
            __CLR4_5_28y28y2lvico1rl.R.inc(11722);assertTrue(ax instanceof OWLObjectPropertyDomainAxiom);
        }
    }}finally{__CLR4_5_28y28y2lvico1rl.R.flushNeeded();}}

    @Test
    public void shouldReloadSamePrefixAbbreviations() throws OWLOntologyCreationException, OWLOntologyStorageException {__CLR4_5_28y28y2lvico1rl.R.globalSliceStart(getClass().getName(),11723);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28n2ufc91n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28y28y2lvico1rl.R.rethrow($CLV_t2$);}finally{__CLR4_5_28y28y2lvico1rl.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.TurtleTestCase.shouldReloadSamePrefixAbbreviations",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),11723,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28n2ufc91n() throws OWLOntologyCreationException, OWLOntologyStorageException{try{__CLR4_5_28y28y2lvico1rl.R.inc(11723);
        __CLR4_5_28y28y2lvico1rl.R.inc(11724);String input = "@prefix : <http://www.hbp.FIXME.org/hbp_abam_ontology/> .\n"
            + "@prefix owl: <http://www.w3.org/2002/07/owl#> .\n"
            + "@prefix rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#> .\n"
            + "@prefix xml: <http://www.w3.org/XML/1998/namespace> .\n"
            + "@prefix xsd: <http://www.w3.org/2001/XMLSchema#> .\n"
            + "@prefix rdfs: <http://www.w3.org/2000/01/rdf-schema#> .\n"
            + "@prefix nsu: <http://www.FIXME.org/nsupper#> .\n"
            + "@prefix ABA: <http://api.brain-map.org/api/v2/data/Structure/> .\n"
            + "@base <http://www.hbp.FIXME.org/hbp_abam_ontology> .\n"
            + "<http://www.hbp.FIXME.org/hbp_abam_ontology> rdf:type owl:Ontology .\n" + "ABA:1 rdf:type owl:Class ;\n"
            + "      rdfs:subClassOf [ rdf:type owl:Restriction ; owl:onProperty nsu:part_of ; owl:someValuesFrom ABA:10 ] .\n"
            + "ABA:10 rdf:type owl:Class ;\n"
            + "       rdfs:subClassOf [ rdf:type owl:Restriction ; owl:onProperty nsu:part_of ; owl:someValuesFrom owl:Thing ] .\n";
        __CLR4_5_28y28y2lvico1rl.R.inc(11725);OWLOntology o = loadOntologyFromString(input);
        __CLR4_5_28y28y2lvico1rl.R.inc(11726);StringDocumentTarget t = saveOntology(o);
        __CLR4_5_28y28y2lvico1rl.R.inc(11727);assertTrue(t.toString().contains("ABA:10"));
    }finally{__CLR4_5_28y28y2lvico1rl.R.flushNeeded();}}

    @Test
    public void shouldFindExpectedAxiomsForBlankNodes() throws OWLOntologyCreationException,
        OWLOntologyStorageException {__CLR4_5_28y28y2lvico1rl.R.globalSliceStart(getClass().getName(),11728);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pb29yy91s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28y28y2lvico1rl.R.rethrow($CLV_t2$);}finally{__CLR4_5_28y28y2lvico1rl.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.TurtleTestCase.shouldFindExpectedAxiomsForBlankNodes",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),11728,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pb29yy91s() throws OWLOntologyCreationException, OWLOntologyStorageException{try{__CLR4_5_28y28y2lvico1rl.R.inc(11728);
        __CLR4_5_28y28y2lvico1rl.R.inc(11729);OWLObjectProperty r = ObjectProperty(IRI.create(
            "http://www.derivo.de/ontologies/examples/anonymous-individuals#", "r"));
        __CLR4_5_28y28y2lvico1rl.R.inc(11730);String input = "@prefix : <http://www.derivo.de/ontologies/examples/anonymous-individuals#> .\n"
            + "@prefix owl: <http://www.w3.org/2002/07/owl#> .\n"
            + "@prefix rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#> .\n"
            + "@prefix xml: <http://www.w3.org/XML/1998/namespace> .\n"
            + "@prefix xsd: <http://www.w3.org/2001/XMLSchema#> .\n"
            + "@prefix rdfs: <http://www.w3.org/2000/01/rdf-schema#> .\n"
            + "<http://www.derivo.de/ontologies/examples/anonymous-individuals> a owl:Ontology .\n"
            + ":r a owl:ObjectProperty .\n" + ":C a owl:Class .\n" + "_:genid1 a :C ; :r _:genid1 .";
        __CLR4_5_28y28y2lvico1rl.R.inc(11731);OWLOntology o = loadOntologyFromString(input);
        // assertEquals(input, saveOntology(o, new
        // TurtleDocumentFormat()).toString().replaceAll("\\#.*\\n", ""));
        __CLR4_5_28y28y2lvico1rl.R.inc(11732);for (OWLClassAssertionAxiom ax : o.getAxioms(AxiomType.CLASS_ASSERTION)) {{
            __CLR4_5_28y28y2lvico1rl.R.inc(11733);OWLAxiom expected = df.getOWLObjectPropertyAssertionAxiom(r, ax.getIndividual(), ax.getIndividual());
            __CLR4_5_28y28y2lvico1rl.R.inc(11734);assertTrue(expected + " not found", o.containsAxiom(expected));
        }
        }__CLR4_5_28y28y2lvico1rl.R.inc(11735);OWLOntology test = roundTrip(o, new TurtleDocumentFormat());
        __CLR4_5_28y28y2lvico1rl.R.inc(11736);equal(o, test);
    }finally{__CLR4_5_28y28y2lvico1rl.R.flushNeeded();}}

    @Test
    public void shouldAllowMultipleDotsInIRIs() throws OWLOntologyCreationException, OWLOntologyStorageException {__CLR4_5_28y28y2lvico1rl.R.globalSliceStart(getClass().getName(),11737);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xqoe27921();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28y28y2lvico1rl.R.rethrow($CLV_t2$);}finally{__CLR4_5_28y28y2lvico1rl.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.TurtleTestCase.shouldAllowMultipleDotsInIRIs",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),11737,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xqoe27921() throws OWLOntologyCreationException, OWLOntologyStorageException{try{__CLR4_5_28y28y2lvico1rl.R.inc(11737);
        __CLR4_5_28y28y2lvico1rl.R.inc(11738);IRI test1 = IRI.create("http://www.semanticweb.org/ontology#A...");
        __CLR4_5_28y28y2lvico1rl.R.inc(11739);IRI test2 = IRI.create("http://www.semanticweb.org/ontology#A...B");
        __CLR4_5_28y28y2lvico1rl.R.inc(11740);OWLOntology o = m.createOntology(IRI.create("http://www.semanticweb.org/ontology"));
        __CLR4_5_28y28y2lvico1rl.R.inc(11741);m.addAxiom(o, df.getOWLDeclarationAxiom(df.getOWLClass(test1)));
        __CLR4_5_28y28y2lvico1rl.R.inc(11742);m.addAxiom(o, df.getOWLDeclarationAxiom(df.getOWLClass(test2)));
        __CLR4_5_28y28y2lvico1rl.R.inc(11743);TurtleDocumentFormat format = new TurtleDocumentFormat();
        __CLR4_5_28y28y2lvico1rl.R.inc(11744);format.setDefaultPrefix("http://www.semanticweb.org/ontology#");
        __CLR4_5_28y28y2lvico1rl.R.inc(11745);roundTrip(o, format);
    }finally{__CLR4_5_28y28y2lvico1rl.R.flushNeeded();}}

    @Test
    public void shouldSaveWithCorrectPrefixes() throws OWLOntologyCreationException, OWLOntologyStorageException {__CLR4_5_28y28y2lvico1rl.R.globalSliceStart(getClass().getName(),11746);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26cnedh92a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28y28y2lvico1rl.R.rethrow($CLV_t2$);}finally{__CLR4_5_28y28y2lvico1rl.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.TurtleTestCase.shouldSaveWithCorrectPrefixes",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),11746,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26cnedh92a() throws OWLOntologyCreationException, OWLOntologyStorageException{try{__CLR4_5_28y28y2lvico1rl.R.inc(11746);
        __CLR4_5_28y28y2lvico1rl.R.inc(11747);String in="@prefix OBO: <http://purl.obolibrary.org/obo/> .\n" + 
            "@prefix owl: <http://www.w3.org/2002/07/owl#> .\n" + 
            "@prefix rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#> .\n" + 
            "@prefix xml: <http://www.w3.org/XML/1998/namespace> .\n" + 
            "@prefix xsd: <http://www.w3.org/2001/XMLSchema#> .\n" + 
            "@prefix rdfs: <http://www.w3.org/2000/01/rdf-schema#> .\n\n" + 
            "<http://purl.obolibrary.org/obo/test.owl> rdf:type owl:Ontology .\n\n" + 
            "<http://purl.obolibrary.org/obo/test#foo> rdf:type owl:ObjectProperty .\n\n" + 
            "OBO:TEST_1 rdf:type owl:Class ;\n    rdfs:label \"foo\"@en .";
        __CLR4_5_28y28y2lvico1rl.R.inc(11748);OWLOntology ont = loadOntologyFromString(in);
        __CLR4_5_28y28y2lvico1rl.R.inc(11749);OWLDocumentFormat ofmt = new TurtleDocumentFormat();
        __CLR4_5_28y28y2lvico1rl.R.inc(11750);ofmt.asPrefixOWLOntologyFormat().setPrefix("OBO", "http://purl.obolibrary.org/obo/");
        __CLR4_5_28y28y2lvico1rl.R.inc(11751);StringDocumentTarget result = saveOntology(ont, ofmt);
        __CLR4_5_28y28y2lvico1rl.R.inc(11752);OWLOntology o1 = loadOntologyFromString(result);
        __CLR4_5_28y28y2lvico1rl.R.inc(11753);equal(ont, o1);
    }finally{__CLR4_5_28y28y2lvico1rl.R.flushNeeded();}}
    @Test
    public void shouldSaveWithCorrectSlashPrefixes() throws OWLOntologyCreationException, OWLOntologyStorageException {__CLR4_5_28y28y2lvico1rl.R.globalSliceStart(getClass().getName(),11754);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2y5rpww92i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28y28y2lvico1rl.R.rethrow($CLV_t2$);}finally{__CLR4_5_28y28y2lvico1rl.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.TurtleTestCase.shouldSaveWithCorrectSlashPrefixes",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),11754,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2y5rpww92i() throws OWLOntologyCreationException, OWLOntologyStorageException{try{__CLR4_5_28y28y2lvico1rl.R.inc(11754);
        __CLR4_5_28y28y2lvico1rl.R.inc(11755);String in="@prefix OBO: <http://purl.obolibrary.org/obo/> .\n" + 
            "@prefix owl: <http://www.w3.org/2002/07/owl#> .\n" + 
            "@prefix rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#> .\n" + 
            "@prefix xml: <http://www.w3.org/XML/1998/namespace> .\n" + 
            "@prefix xsd: <http://www.w3.org/2001/XMLSchema#> .\n" + 
            "@prefix rdfs: <http://www.w3.org/2000/01/rdf-schema#> .\n\n" + 
            "<http://purl.obolibrary.org/obo/test.owl> rdf:type owl:Ontology .\n\n" + 
            "<http://purl.obolibrary.org/obo/test/foo> rdf:type owl:ObjectProperty .\n\n" + 
            "OBO:TEST_1 rdf:type owl:Class ;\n    rdfs:label \"foo\"@en .";
        __CLR4_5_28y28y2lvico1rl.R.inc(11756);OWLOntology ont = loadOntologyFromString(in);
        __CLR4_5_28y28y2lvico1rl.R.inc(11757);OWLDocumentFormat ofmt = new TurtleDocumentFormat();
        __CLR4_5_28y28y2lvico1rl.R.inc(11758);ofmt.asPrefixOWLOntologyFormat().setPrefix("OBO", "http://purl.obolibrary.org/obo/");
        __CLR4_5_28y28y2lvico1rl.R.inc(11759);StringDocumentTarget result = saveOntology(ont, ofmt);
        __CLR4_5_28y28y2lvico1rl.R.inc(11760);OWLOntology o1 = loadOntologyFromString(result);
        __CLR4_5_28y28y2lvico1rl.R.inc(11761);equal(ont, o1);
    }finally{__CLR4_5_28y28y2lvico1rl.R.flushNeeded();}}
}
