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
import static org.semanticweb.owlapi.search.EntitySearcher.getAnnotationObjects;

import java.io.ByteArrayInputStream;
import java.nio.charset.Charset;

import javax.annotation.Nonnull;

import org.junit.Test;
import org.semanticweb.owlapi.api.test.baseclasses.TestBase;
import org.semanticweb.owlapi.formats.FunctionalSyntaxDocumentFormat;
import org.semanticweb.owlapi.formats.RDFXMLDocumentFormat;
import org.semanticweb.owlapi.io.StreamDocumentSource;
import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.owlxml.parser.OWLXMLParser;

@SuppressWarnings("javadoc")
public class Utf8TestCase extends TestBase {static class __CLR4_5_292q92qlvico1s0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,11805,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testUTF8roundTrip() throws Exception {__CLR4_5_292q92qlvico1s0.R.globalSliceStart(getClass().getName(),11762);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cc457b92q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_292q92qlvico1s0.R.rethrow($CLV_t2$);}finally{__CLR4_5_292q92qlvico1s0.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.Utf8TestCase.testUTF8roundTrip",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),11762,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cc457b92q() throws Exception{try{__CLR4_5_292q92qlvico1s0.R.inc(11762);
        __CLR4_5_292q92qlvico1s0.R.inc(11763);String onto = "Ontology(<http://protege.org/UTF8.owl>" + "Declaration(Class(<http://protege.org/UTF8.owl#A>))"
            + "AnnotationAssertion(<http://www.w3.org/2000/01/rdf-schema#label> <http://protege.org/UTF8.owl#A> "
            + "\"Chinese=\u8655\u65b9\"^^<http://www.w3.org/2001/XMLSchema#string>))";
        __CLR4_5_292q92qlvico1s0.R.inc(11764);saveOntology(loadOntologyFromString(onto));
        // ByteArrayInputStream in = new ByteArrayInputStream(onto.getBytes());
        // ByteArrayOutputStream out = new ByteArrayOutputStream();
        // manager.saveOntology(manager.loadOntologyFromOntologyDocument(in),
        // out);
    }finally{__CLR4_5_292q92qlvico1s0.R.flushNeeded();}}

    @Test
    public void testInvalidUTF8roundTripOWLXML() {__CLR4_5_292q92qlvico1s0.R.globalSliceStart(getClass().getName(),11765);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fljz6x92t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_292q92qlvico1s0.R.rethrow($CLV_t2$);}finally{__CLR4_5_292q92qlvico1s0.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.Utf8TestCase.testInvalidUTF8roundTripOWLXML",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),11765,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fljz6x92t(){try{__CLR4_5_292q92qlvico1s0.R.inc(11765);
        // this test checks for the condition described in issue #47
        // Input with character = 0240 (octal) should fail parsing but is read
        // in as an owl/xml file
        __CLR4_5_292q92qlvico1s0.R.inc(11766);String onto = "<!DOCTYPE rdf:RDF [\n" + "<!ENTITY xsd \"http://www.w3.org/2001/XMLSchema#\" >\n" + "]>\n"
            + "<rdf:RDF \n" + "xml:base=\n" + "\"http://www.example.org/ISA14#\" \n"
            + "xmlns:owl =\"http://www.w3.org/2002/07/owl#\" \n"
            + "xmlns:rdf =\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\" \n"
            + "xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\" \n"
            + "xmlns:xsd =\"http://www.w3.org/2001/XMLSchema#\" \n" + "xmlns:ibs =\"http://www.example.org/ISA14#\" >\n"
            + "<owl:Ontology rdf:about=\"#\" />\n" + (char) 0240
            + "<owl:Class rdf:about=\"http://www.example.org/ISA14#Researcher\"/>\n" + "</rdf:RDF>";
        __CLR4_5_292q92qlvico1s0.R.inc(11767);ByteArrayInputStream in = new ByteArrayInputStream(onto.getBytes(Charset.forName("ISO-8859-1")));
        __CLR4_5_292q92qlvico1s0.R.inc(11768);OWLXMLParser parser = new OWLXMLParser();
        __CLR4_5_292q92qlvico1s0.R.inc(11769);try {
            __CLR4_5_292q92qlvico1s0.R.inc(11770);parser.parse(new StreamDocumentSource(in), m.createOntology(), config);
            __CLR4_5_292q92qlvico1s0.R.inc(11771);fail("parsing should have failed, invalid input");
        } catch (Exception ex) {
            // expected to fail, but actual exception depends on the parsers in
            // the classpath
        }
    }finally{__CLR4_5_292q92qlvico1s0.R.flushNeeded();}}

    @Test
    public void testInvalidUTF8roundTrip() throws OWLOntologyCreationException {__CLR4_5_292q92qlvico1s0.R.globalSliceStart(getClass().getName(),11772);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23khwkk930();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_292q92qlvico1s0.R.rethrow($CLV_t2$);}finally{__CLR4_5_292q92qlvico1s0.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.Utf8TestCase.testInvalidUTF8roundTrip",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),11772,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23khwkk930() throws OWLOntologyCreationException{try{__CLR4_5_292q92qlvico1s0.R.inc(11772);
        // this test checks for the condition described in issue #47
        // Input with character = 0240 (octal) should fail parsing but is read
        // in as an owl/xml file
        __CLR4_5_292q92qlvico1s0.R.inc(11773);String onto = "<!DOCTYPE rdf:RDF [\n" + "<!ENTITY xsd \"http://www.w3.org/2001/XMLSchema#\" >\n" + "]>\n"
            + "<rdf:RDF \n" + "xml:base=\n" + "\"http://www.example.org/ISA14#\" \n"
            + "xmlns:owl =\"http://www.w3.org/2002/07/owl#\" \n"
            + "xmlns:rdf =\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\" \n"
            + "xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\" \n"
            + "xmlns:xsd =\"http://www.w3.org/2001/XMLSchema#\" \n" + "xmlns:ibs =\"http://www.example.org/ISA14#\" >\n"
            + "<owl:Ontology rdf:about=\"#\" />\n" + (char) 0240
            + "<owl:Class rdf:about=\"http://www.example.org/ISA14#Researcher\"/>\n" + "</rdf:RDF>";
        __CLR4_5_292q92qlvico1s0.R.inc(11774);ByteArrayInputStream in = new ByteArrayInputStream(onto.getBytes(Charset.forName("ISO-8859-1")));
        __CLR4_5_292q92qlvico1s0.R.inc(11775);OWLOntology o = m.loadOntologyFromOntologyDocument(in);
        __CLR4_5_292q92qlvico1s0.R.inc(11776);assertEquals("RDF/XML", m.getOntologyFormat(o).getKey());
    }finally{__CLR4_5_292q92qlvico1s0.R.flushNeeded();}}

    @Test
    public void testPositiveUTF8roundTrip() throws Exception {__CLR4_5_292q92qlvico1s0.R.globalSliceStart(getClass().getName(),11777);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lva0hu935();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_292q92qlvico1s0.R.rethrow($CLV_t2$);}finally{__CLR4_5_292q92qlvico1s0.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.Utf8TestCase.testPositiveUTF8roundTrip",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),11777,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lva0hu935() throws Exception{try{__CLR4_5_292q92qlvico1s0.R.inc(11777);
        __CLR4_5_292q92qlvico1s0.R.inc(11778);String ns = "http://protege.org/UTF8.owl";
        __CLR4_5_292q92qlvico1s0.R.inc(11779);OWLOntology ontology = m.createOntology(IRI(ns));
        __CLR4_5_292q92qlvico1s0.R.inc(11780);OWLClass a = Class(IRI(ns + "#A"));
        __CLR4_5_292q92qlvico1s0.R.inc(11781);m.addAxiom(ontology, df.getOWLDeclarationAxiom(a));
        __CLR4_5_292q92qlvico1s0.R.inc(11782);OWLAnnotation ann = df.getOWLAnnotation(df.getRDFSLabel(), df.getOWLLiteral("Chinese=\u8655\u65b9"));
        __CLR4_5_292q92qlvico1s0.R.inc(11783);OWLAxiom axiom = df.getOWLAnnotationAssertionAxiom(a.getIRI(), ann);
        __CLR4_5_292q92qlvico1s0.R.inc(11784);m.addAxiom(ontology, axiom);
        __CLR4_5_292q92qlvico1s0.R.inc(11785);ontology = roundTrip(ontology, new FunctionalSyntaxDocumentFormat());
    }finally{__CLR4_5_292q92qlvico1s0.R.flushNeeded();}}

    @Test
    public void testRoundTrip() throws Exception {__CLR4_5_292q92qlvico1s0.R.globalSliceStart(getClass().getName(),11786);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yhw67s93e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_292q92qlvico1s0.R.rethrow($CLV_t2$);}finally{__CLR4_5_292q92qlvico1s0.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.Utf8TestCase.testRoundTrip",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),11786,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yhw67s93e() throws Exception{try{__CLR4_5_292q92qlvico1s0.R.inc(11786);
        __CLR4_5_292q92qlvico1s0.R.inc(11787);String ns = "http://protege.org/ontologies/UTF8RoundTrip.owl";
        __CLR4_5_292q92qlvico1s0.R.inc(11788);OWLClass c = Class(IRI(ns + "#C"));
        /*
         * The two unicode characters entered here are valid and can be found in
         * the code chart http://www.unicode.org/charts/PDF/U4E00.pdf. It has
         * been said that they are chinese and they do look the part. In UTF-8
         * these characters are encoded as \u8655 --> \350\231\225 \u65b9 -->
         * \346\226\271 where the right hand side is in octal. (I chose octal
         * because this is how emacs represents it with find-file-literally).
         */
        __CLR4_5_292q92qlvico1s0.R.inc(11789);String chinese = "Rx\u8655\u65b9";
        __CLR4_5_292q92qlvico1s0.R.inc(11790);System.setProperty("file.encoding", "UTF-8");
        __CLR4_5_292q92qlvico1s0.R.inc(11791);OWLOntology ontology = createOriginalOntology(ns, c, chinese);
        __CLR4_5_292q92qlvico1s0.R.inc(11792);checkOntology(ontology, c, chinese);
        __CLR4_5_292q92qlvico1s0.R.inc(11793);OWLOntology newOntology = roundTrip(ontology, new RDFXMLDocumentFormat());
        __CLR4_5_292q92qlvico1s0.R.inc(11794);checkOntology(newOntology, c, chinese);
    }finally{__CLR4_5_292q92qlvico1s0.R.flushNeeded();}}

    @Nonnull
    private OWLOntology createOriginalOntology(@Nonnull String ns, @Nonnull OWLClass c, @Nonnull String chinese)
        throws OWLOntologyCreationException {try{__CLR4_5_292q92qlvico1s0.R.inc(11795);
        __CLR4_5_292q92qlvico1s0.R.inc(11796);OWLOntology ontology = m.createOntology(IRI(ns));
        __CLR4_5_292q92qlvico1s0.R.inc(11797);OWLAxiom annotationAxiom = AnnotationAssertion(RDFSLabel(), c.getIRI(), Literal(chinese));
        __CLR4_5_292q92qlvico1s0.R.inc(11798);m.addAxiom(ontology, annotationAxiom);
        __CLR4_5_292q92qlvico1s0.R.inc(11799);return ontology;
    }finally{__CLR4_5_292q92qlvico1s0.R.flushNeeded();}}

    private static boolean checkOntology(@Nonnull OWLOntology ontology, @Nonnull OWLClass c, @Nonnull String chinese) {try{__CLR4_5_292q92qlvico1s0.R.inc(11800);
        __CLR4_5_292q92qlvico1s0.R.inc(11801);for (OWLAnnotation annotation : getAnnotationObjects(c, ontology)) {{
            __CLR4_5_292q92qlvico1s0.R.inc(11802);String value = ((OWLLiteral) annotation.getValue()).getLiteral();
            __CLR4_5_292q92qlvico1s0.R.inc(11803);return chinese.equals(value);
        }
        }__CLR4_5_292q92qlvico1s0.R.inc(11804);return false;
    }finally{__CLR4_5_292q92qlvico1s0.R.flushNeeded();}}
}
