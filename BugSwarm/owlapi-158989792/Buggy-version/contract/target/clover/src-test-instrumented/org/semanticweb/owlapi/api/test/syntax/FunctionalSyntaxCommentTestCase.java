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

import static org.junit.Assert.assertTrue;
import static org.semanticweb.owlapi.apibinding.OWLFunctionalSyntaxFactory.*;

import org.junit.Test;
import org.semanticweb.owlapi.api.test.baseclasses.TestBase;
import org.semanticweb.owlapi.io.StringDocumentSource;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLDataProperty;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.vocab.OWL2Datatype;

@SuppressWarnings("javadoc")
public class FunctionalSyntaxCommentTestCase extends TestBase {static class __CLR4_5_285q85qlvico1lr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,10589,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void shouldParseCommentAndSkipIt()
            throws OWLOntologyCreationException {__CLR4_5_285q85qlvico1lr.R.globalSliceStart(getClass().getName(),10574);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21hapyv85q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_285q85qlvico1lr.R.rethrow($CLV_t2$);}finally{__CLR4_5_285q85qlvico1lr.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.FunctionalSyntaxCommentTestCase.shouldParseCommentAndSkipIt",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10574,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21hapyv85q() throws OWLOntologyCreationException{try{__CLR4_5_285q85qlvico1lr.R.inc(10574);
        __CLR4_5_285q85qlvico1lr.R.inc(10575);String input = "Prefix(xsd:=<http://www.w3.org/2001/XMLSchema#>)\nPrefix(owl:=<http://www.w3.org/2002/07/owl#>)\nPrefix(xml:=<http://www.w3.org/XML/1998/namespace>)\nPrefix(rdf:=<http://www.w3.org/1999/02/22-rdf-syntax-ns#>)\nPrefix(rdfs:=<http://www.w3.org/2000/01/rdf-schema#>)\nPrefix(skos:=<http://www.w3.org/2004/02/skos/core#>)\n\n"
                + "Ontology(<file:test.owl>\n"
                + "Declaration(Class(<urn:test.owl#ContactInformation>))\n"
                + "#Test comment\n"
                + "Declaration(DataProperty(<urn:test.owl#city>))\n"
                + "SubClassOf(<urn:test.owl#ContactInformation> DataMaxCardinality(1 <urn:test.owl#city> xsd:string))\n"
                + ')';
        __CLR4_5_285q85qlvico1lr.R.inc(10576);OWLOntology o = loadOntologyFromString(input);
        __CLR4_5_285q85qlvico1lr.R.inc(10577);OWLAxiom ax1 = Declaration(DataProperty(IRI("urn:test.owl#city")));
        __CLR4_5_285q85qlvico1lr.R.inc(10578);OWLAxiom ax2 = SubClassOf(
                Class(IRI("urn:test.owl#ContactInformation")),
                DataMaxCardinality(1, DataProperty(IRI("urn:test.owl#city")),
                        Datatype(OWL2Datatype.XSD_STRING.getIRI())));
        __CLR4_5_285q85qlvico1lr.R.inc(10579);OWLAxiom ax3 = Declaration(Class(IRI("urn:test.owl#ContactInformation")));
        __CLR4_5_285q85qlvico1lr.R.inc(10580);assertTrue(o.containsAxiom(ax1));
        __CLR4_5_285q85qlvico1lr.R.inc(10581);assertTrue(o.containsAxiom(ax2));
        __CLR4_5_285q85qlvico1lr.R.inc(10582);assertTrue(o.containsAxiom(ax3));
    }finally{__CLR4_5_285q85qlvico1lr.R.flushNeeded();}}

    @Test
    public void shouldParseCardinalityRestrictionWithMoreThanOneDigitRange()
            throws OWLOntologyCreationException {__CLR4_5_285q85qlvico1lr.R.globalSliceStart(getClass().getName(),10583);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26z0s2r85z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_285q85qlvico1lr.R.rethrow($CLV_t2$);}finally{__CLR4_5_285q85qlvico1lr.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.FunctionalSyntaxCommentTestCase.shouldParseCardinalityRestrictionWithMoreThanOneDigitRange",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10583,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26z0s2r85z() throws OWLOntologyCreationException{try{__CLR4_5_285q85qlvico1lr.R.inc(10583);
        __CLR4_5_285q85qlvico1lr.R.inc(10584);String in = "Prefix(:=<urn:test#>)"
                + "Prefix(a:=<urn:test#>)"
                + "Prefix(rdfs:=<http://www.w3.org/2000/01/rdf-schema#>)"
                + "Prefix(owl2xml:=<http://www.w3.org/2006/12/owl2-xml#>)"
                + "Prefix(test:=<urn:test#>)"
                + "Prefix(owl:=<http://www.w3.org/2002/07/owl#>)"
                + "Prefix(xsd:=<http://www.w3.org/2001/XMLSchema#>)"
                + "Prefix(rdf:=<http://www.w3.org/1999/02/22-rdf-syntax-ns#>)\n"
                + "Ontology(<urn:test>\n"
                + "Declaration(NamedIndividual(test:a)) \n"
                + "    Declaration(Class(test:A)) \n"
                + "    Declaration(DataProperty(test:dp)) \n"
                + "    SubClassOf( test:A DataMinCardinality( 257 test:dp rdfs:Literal ) ) \n"
                + "    SubClassOf( test:A DataAllValuesFrom( test:dp xsd:byte ) ) \n"
                + "    ClassAssertion( test:A test:a ))";
        __CLR4_5_285q85qlvico1lr.R.inc(10585);OWLOntology o = loadOntologyFromString(new StringDocumentSource(in));
        __CLR4_5_285q85qlvico1lr.R.inc(10586);OWLClass a = df.getOWLClass(IRI.create("urn:test#A"));
        __CLR4_5_285q85qlvico1lr.R.inc(10587);OWLDataProperty p = df.getOWLDataProperty(IRI.create("urn:test#dp"));
        __CLR4_5_285q85qlvico1lr.R.inc(10588);assertTrue(o.containsAxiom(df.getOWLSubClassOfAxiom(
                a,
                df.getOWLDataMinCardinality(257, p,
                        OWL2Datatype.RDFS_LITERAL.getDatatype(df)))));
    }finally{__CLR4_5_285q85qlvico1lr.R.flushNeeded();}}
}
