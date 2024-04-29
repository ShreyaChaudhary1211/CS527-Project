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
package org.semanticweb.owlapi.api.test.literals;

import static org.junit.Assert.*;
import static org.semanticweb.owlapi.apibinding.OWLFunctionalSyntaxFactory.Literal;

import org.junit.Test;
import org.semanticweb.owlapi.api.test.baseclasses.TestBase;
import org.semanticweb.owlapi.formats.FunctionalSyntaxDocumentFormat;
import org.semanticweb.owlapi.formats.RDFXMLDocumentFormat;
import org.semanticweb.owlapi.io.StringDocumentSource;
import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.vocab.OWL2Datatype;

@SuppressWarnings({ "javadoc", })
public class OWLLiteralCorruptionTestCase extends TestBase {static class __CLR4_5_269z69zlvico156{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,8191,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void shouldroundTripLiteral() {__CLR4_5_269z69zlvico156.R.globalSliceStart(getClass().getName(),8135);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2eqfofq69z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_269z69zlvico156.R.rethrow($CLV_t2$);}finally{__CLR4_5_269z69zlvico156.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.literals.OWLLiteralCorruptionTestCase.shouldroundTripLiteral",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),8135,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2eqfofq69z(){try{__CLR4_5_269z69zlvico156.R.inc(8135);
        __CLR4_5_269z69zlvico156.R.inc(8136);String testString;
        __CLR4_5_269z69zlvico156.R.inc(8137);StringBuilder sb = new StringBuilder();
        __CLR4_5_269z69zlvico156.R.inc(8138);int count = 17;
        __CLR4_5_269z69zlvico156.R.inc(8139);while ((((count-- > 0)&&(__CLR4_5_269z69zlvico156.R.iget(8140)!=0|true))||(__CLR4_5_269z69zlvico156.R.iget(8141)==0&false))) {{
            __CLR4_5_269z69zlvico156.R.inc(8142);sb.append("200 \u00b5Liters + character above U+0FFFF = ");
            __CLR4_5_269z69zlvico156.R.inc(8143);sb.appendCodePoint(0x10192); // happens to be "ROMAN SEMUNCIA SIGN"
            __CLR4_5_269z69zlvico156.R.inc(8144);sb.append('\n');
        }
        }__CLR4_5_269z69zlvico156.R.inc(8145);testString = sb.toString();
        __CLR4_5_269z69zlvico156.R.inc(8146);OWLLiteral literal = Literal(testString);
        __CLR4_5_269z69zlvico156.R.inc(8147);assertEquals("Out = in ? false", literal.getLiteral(), testString);
    }finally{__CLR4_5_269z69zlvico156.R.flushNeeded();}}

    @Test
    public void shouldRoundTripXMLLiteral() throws OWLOntologyCreationException, OWLOntologyStorageException {__CLR4_5_269z69zlvico156.R.globalSliceStart(getClass().getName(),8148);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dbrr8h6ac();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_269z69zlvico156.R.rethrow($CLV_t2$);}finally{__CLR4_5_269z69zlvico156.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.literals.OWLLiteralCorruptionTestCase.shouldRoundTripXMLLiteral",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),8148,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dbrr8h6ac() throws OWLOntologyCreationException, OWLOntologyStorageException{try{__CLR4_5_269z69zlvico156.R.inc(8148);
        __CLR4_5_269z69zlvico156.R.inc(8149);String literal = "<div xmlns='http://www.w3.org/1999/xhtml'><h3>[unknown]</h3><p>(describe NameGroup \"[unknown]\")</p></div>";
        __CLR4_5_269z69zlvico156.R.inc(8150);OWLOntology o = m.createOntology();
        __CLR4_5_269z69zlvico156.R.inc(8151);OWLDataProperty p = df.getOWLDataProperty(IRI.create("urn:test#p"));
        __CLR4_5_269z69zlvico156.R.inc(8152);OWLLiteral l = df.getOWLLiteral(literal, OWL2Datatype.RDF_XML_LITERAL);
        __CLR4_5_269z69zlvico156.R.inc(8153);OWLNamedIndividual i = df.getOWLNamedIndividual(IRI.create("urn:test#i"));
        __CLR4_5_269z69zlvico156.R.inc(8154);m.addAxiom(o, df.getOWLDataPropertyAssertionAxiom(p, i, l));
        __CLR4_5_269z69zlvico156.R.inc(8155);String string = saveOntology(o).toString();
        __CLR4_5_269z69zlvico156.R.inc(8156);assertTrue(string.contains(literal));
    }finally{__CLR4_5_269z69zlvico156.R.flushNeeded();}}

    @Test
    public void shouldFailOnMalformedXMLLiteral() throws OWLOntologyCreationException, OWLOntologyStorageException {__CLR4_5_269z69zlvico156.R.globalSliceStart(getClass().getName(),8157);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rpn8zu6al();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_269z69zlvico156.R.rethrow($CLV_t2$);}finally{__CLR4_5_269z69zlvico156.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.literals.OWLLiteralCorruptionTestCase.shouldFailOnMalformedXMLLiteral",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),8157,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rpn8zu6al() throws OWLOntologyCreationException, OWLOntologyStorageException{try{__CLR4_5_269z69zlvico156.R.inc(8157);
        __CLR4_5_269z69zlvico156.R.inc(8158);String literal = "<ncicp:ComplexDefinition><ncicp:def-definition>A form of cancer that begins in melanocytes (cells that make the pigment melanin). It may begin in a mole (skin melanoma), but can also begin in other pigmented tissues, such as in the eye or in the intestines.</ncicp:def-definition><ncicp:def-source>NCI-GLOSS</ncicp:def-source></ncicp:ComplexDefinition>";
        __CLR4_5_269z69zlvico156.R.inc(8159);OWLOntology o = m.createOntology();
        __CLR4_5_269z69zlvico156.R.inc(8160);OWLDataProperty p = df.getOWLDataProperty(IRI.create("urn:test#p"));
        __CLR4_5_269z69zlvico156.R.inc(8161);OWLLiteral l = df.getOWLLiteral(literal, OWL2Datatype.RDF_XML_LITERAL);
        __CLR4_5_269z69zlvico156.R.inc(8162);OWLNamedIndividual i = df.getOWLNamedIndividual(IRI.create("urn:test#i"));
        __CLR4_5_269z69zlvico156.R.inc(8163);m.addAxiom(o, df.getOWLDataPropertyAssertionAxiom(p, i, l));
        __CLR4_5_269z69zlvico156.R.inc(8164);expectedException.expect(OWLOntologyStorageException.class);
        __CLR4_5_269z69zlvico156.R.inc(8165);expectedException.expectMessage(literal);
        __CLR4_5_269z69zlvico156.R.inc(8166);expectedException.expectMessage("XML literal is not self contained");
        __CLR4_5_269z69zlvico156.R.inc(8167);saveOntology(o).toString();
    }finally{__CLR4_5_269z69zlvico156.R.flushNeeded();}}

    @Test
    public void shouldAcceptXMLLiteralWithDatatype() throws OWLOntologyStorageException {__CLR4_5_269z69zlvico156.R.globalSliceStart(getClass().getName(),8168);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2zht7x86aw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_269z69zlvico156.R.rethrow($CLV_t2$);}finally{__CLR4_5_269z69zlvico156.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.literals.OWLLiteralCorruptionTestCase.shouldAcceptXMLLiteralWithDatatype",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),8168,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2zht7x86aw() throws OWLOntologyStorageException{try{__CLR4_5_269z69zlvico156.R.inc(8168);
        // A bug in OWLAPI means some incorrect XMLLiterals might have been
        // produced.
        // They should be understood in input and saved correctly on roundtrip
        __CLR4_5_269z69zlvico156.R.inc(8169);String wrong = "rdf:datatype=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#XMLLiteral\"";
        __CLR4_5_269z69zlvico156.R.inc(8170);String correct = "rdf:parseType=\"Literal\"";
        __CLR4_5_269z69zlvico156.R.inc(8171);String preamble = "<?xml version=\"1.0\"?>\n<rdf:RDF xmlns=\"http://www.w3.org/2002/07/owl#\"\n"
            + "     xml:base=\"http://www.w3.org/2002/07/owl\"\n     xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\n"
            + "     xmlns:owl=\"http://www.w3.org/2002/07/owl#\"\n     xmlns:xml=\"http://www.w3.org/XML/1998/namespace\"\n"
            + "     xmlns:protege=\"http://protege.stanford.edu/\"\n     xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\"\n"
            + "     xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\">\n    <Ontology/>\n"
            + "    <AnnotationProperty rdf:about=\"http://protege.stanford.edu/code\"/>\n"
            + "    <Class rdf:about=\"http://protege.stanford.edu/A\">\n        <rdfs:subClassOf rdf:resource=\"http://www.w3.org/2002/07/owl#Thing\"/>\n"
            + "        <protege:code ";
        __CLR4_5_269z69zlvico156.R.inc(8172);String closure = "><test>xxx</test></protege:code>\n    </Class>\n" + "</rdf:RDF>";
        __CLR4_5_269z69zlvico156.R.inc(8173);String input = preamble + wrong + closure;
        __CLR4_5_269z69zlvico156.R.inc(8174);OWLOntology o = loadOntologyFromString(input, IRI.generateDocumentIRI(), new RDFXMLDocumentFormat());
        __CLR4_5_269z69zlvico156.R.inc(8175);OWLOntology o1 = loadOntologyFromString(preamble + correct + closure, IRI.generateDocumentIRI(),
            new RDFXMLDocumentFormat());
        __CLR4_5_269z69zlvico156.R.inc(8176);equal(o, o1);
        __CLR4_5_269z69zlvico156.R.inc(8177);assertTrue(saveOntology(o, new RDFXMLDocumentFormat()).toString().contains(correct));
    }finally{__CLR4_5_269z69zlvico156.R.flushNeeded();}}

    @Test
    public void shouldRoundtripPaddedLiterals() throws OWLOntologyCreationException, OWLOntologyStorageException {__CLR4_5_269z69zlvico156.R.globalSliceStart(getClass().getName(),8178);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2t3hcp16b6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_269z69zlvico156.R.rethrow($CLV_t2$);}finally{__CLR4_5_269z69zlvico156.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.literals.OWLLiteralCorruptionTestCase.shouldRoundtripPaddedLiterals",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),8178,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2t3hcp16b6() throws OWLOntologyCreationException, OWLOntologyStorageException{try{__CLR4_5_269z69zlvico156.R.inc(8178);
        __CLR4_5_269z69zlvico156.R.inc(8179);String in = "Prefix(:=<urn:test#>)\n" + "Prefix(a:=<urn:test#>)\n"
            + "Prefix(rdfs:=<http://www.w3.org/2000/01/rdf-schema#>)\n"
            + "Prefix(owl2xml:=<http://www.w3.org/2006/12/owl2-xml#>)\n" + "Prefix(test:=<urn:test#>)\n"
            + "Prefix(owl:=<http://www.w3.org/2002/07/owl#>)\n" + "Prefix(xsd:=<http://www.w3.org/2001/XMLSchema#>)\n"
            + "Prefix(rdf:=<http://www.w3.org/1999/02/22-rdf-syntax-ns#>)\n" + "Ontology(<urn:test>\n"
            + "DataPropertyAssertion(:dp :c \"1\"^^xsd:integer) " + "DataPropertyAssertion(:dp :c \"01\"^^xsd:integer) "
            + "DataPropertyAssertion(:dp :c \"1\"^^xsd:short))";
        __CLR4_5_269z69zlvico156.R.inc(8180);OWLOntology o = loadOntologyFromString(new StringDocumentSource(in, IRI.create("urn:test"),
            new FunctionalSyntaxDocumentFormat(), null));
        __CLR4_5_269z69zlvico156.R.inc(8181);OWLOntology o2 = roundTrip(o, new FunctionalSyntaxDocumentFormat());
        __CLR4_5_269z69zlvico156.R.inc(8182);equal(o, o2);
        __CLR4_5_269z69zlvico156.R.inc(8183);OWLDataProperty p = df.getOWLDataProperty(IRI.create("urn:test#dp"));
        __CLR4_5_269z69zlvico156.R.inc(8184);OWLNamedIndividual i = df.getOWLNamedIndividual(IRI.create("urn:test#c"));
        __CLR4_5_269z69zlvico156.R.inc(8185);assertTrue(o.getAxioms().contains(df.getOWLDataPropertyAssertionAxiom(p, i, df.getOWLLiteral("01", df
            .getIntegerOWLDatatype()))));
        __CLR4_5_269z69zlvico156.R.inc(8186);assertTrue(o.getAxioms().contains(df.getOWLDataPropertyAssertionAxiom(p, i, df.getOWLLiteral("1", df
            .getIntegerOWLDatatype()))));
        __CLR4_5_269z69zlvico156.R.inc(8187);assertTrue(o.getAxioms().contains(df.getOWLDataPropertyAssertionAxiom(p, i, df.getOWLLiteral("1",
            OWL2Datatype.XSD_SHORT.getDatatype(df)))));
    }finally{__CLR4_5_269z69zlvico156.R.flushNeeded();}}

    @Test
    public void shouldNotFindPaddedLiteralsEqualToNonPadded() {__CLR4_5_269z69zlvico156.R.globalSliceStart(getClass().getName(),8188);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qt4eoy6bg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_269z69zlvico156.R.rethrow($CLV_t2$);}finally{__CLR4_5_269z69zlvico156.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.literals.OWLLiteralCorruptionTestCase.shouldNotFindPaddedLiteralsEqualToNonPadded",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),8188,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qt4eoy6bg(){try{__CLR4_5_269z69zlvico156.R.inc(8188);
        __CLR4_5_269z69zlvico156.R.inc(8189);assertNotEquals(df.getOWLLiteral("01", df.getIntegerOWLDatatype()), df.getOWLLiteral("1", df
            .getIntegerOWLDatatype()));
        __CLR4_5_269z69zlvico156.R.inc(8190);assertNotEquals(df.getOWLLiteral("1", df.getIntegerOWLDatatype()), df.getOWLLiteral("01", df
            .getIntegerOWLDatatype()));
    }finally{__CLR4_5_269z69zlvico156.R.flushNeeded();}}
}
