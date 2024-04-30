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
package org.semanticweb.owlapi.api.test.annotations;

import static org.junit.Assert.assertTrue;
import static org.semanticweb.owlapi.apibinding.OWLFunctionalSyntaxFactory.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import javax.annotation.Nonnull;

import org.junit.Before;
import org.junit.Test;
import org.semanticweb.owlapi.api.test.baseclasses.TestBase;
import org.semanticweb.owlapi.formats.RDFXMLDocumentFormat;
import org.semanticweb.owlapi.io.StringDocumentSource;
import org.semanticweb.owlapi.model.AddAxiom;
import org.semanticweb.owlapi.model.AxiomType;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLAnnotation;
import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.SWRLAtom;
import org.semanticweb.owlapi.model.SWRLVariable;

@SuppressWarnings({ "javadoc", "null" })
public class SWRLAnnotationTestCase extends TestBase {static class __CLR4_5_22s22s2lvico009{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,3633,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Nonnull
    private static final String NS = "http://protege.org/ontologies/SWRLAnnotation.owl";
    @Nonnull
    OWLClass a = Class(IRI(NS + "#A"));
    @Nonnull
    OWLClass b = Class(IRI(NS + "#B"));
    @Nonnull
    OWLAxiom axiom;

    @Before
    public void setUp() {try{__CLR4_5_22s22s2lvico009.R.inc(3602);
        __CLR4_5_22s22s2lvico009.R.inc(3603);SWRLVariable x = df.getSWRLVariable(IRI(NS + "#x"));
        __CLR4_5_22s22s2lvico009.R.inc(3604);SWRLAtom atom1 = df.getSWRLClassAtom(a, x);
        __CLR4_5_22s22s2lvico009.R.inc(3605);SWRLAtom atom2 = df.getSWRLClassAtom(b, x);
        __CLR4_5_22s22s2lvico009.R.inc(3606);Set<SWRLAtom> consequent = new TreeSet<>();
        __CLR4_5_22s22s2lvico009.R.inc(3607);consequent.add(atom1);
        __CLR4_5_22s22s2lvico009.R.inc(3608);OWLAnnotation annotation = df.getOWLAnnotation(RDFSComment(),
                Literal("Not a great rule"));
        __CLR4_5_22s22s2lvico009.R.inc(3609);Set<OWLAnnotation> annotations = new TreeSet<>();
        __CLR4_5_22s22s2lvico009.R.inc(3610);annotations.add(annotation);
        __CLR4_5_22s22s2lvico009.R.inc(3611);Set<SWRLAtom> body = new TreeSet<>();
        __CLR4_5_22s22s2lvico009.R.inc(3612);body.add(atom2);
        __CLR4_5_22s22s2lvico009.R.inc(3613);axiom = df.getSWRLRule(body, consequent, annotations);
    }finally{__CLR4_5_22s22s2lvico009.R.flushNeeded();}}

    @Test
    public void shouldRoundTripAnnotation() throws Exception {__CLR4_5_22s22s2lvico009.R.globalSliceStart(getClass().getName(),3614);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wbsxre2se();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22s22s2lvico009.R.rethrow($CLV_t2$);}finally{__CLR4_5_22s22s2lvico009.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.annotations.SWRLAnnotationTestCase.shouldRoundTripAnnotation",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3614,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wbsxre2se() throws Exception{try{__CLR4_5_22s22s2lvico009.R.inc(3614);
        __CLR4_5_22s22s2lvico009.R.inc(3615);OWLOntology ontology = createOntology();
        __CLR4_5_22s22s2lvico009.R.inc(3616);assertTrue(ontology.containsAxiom(axiom));
        __CLR4_5_22s22s2lvico009.R.inc(3617);ontology = loadOntologyFromString(saveOntology(ontology));
        __CLR4_5_22s22s2lvico009.R.inc(3618);assertTrue(ontology.containsAxiom(axiom));
    }finally{__CLR4_5_22s22s2lvico009.R.flushNeeded();}}

    public OWLOntology createOntology() throws OWLOntologyCreationException {try{__CLR4_5_22s22s2lvico009.R.inc(3619);
        __CLR4_5_22s22s2lvico009.R.inc(3620);OWLOntology ontology = m.createOntology(IRI(NS));
        __CLR4_5_22s22s2lvico009.R.inc(3621);List<AddAxiom> changes = new ArrayList<>();
        __CLR4_5_22s22s2lvico009.R.inc(3622);changes.add(new AddAxiom(ontology, axiom));
        __CLR4_5_22s22s2lvico009.R.inc(3623);m.applyChanges(changes);
        __CLR4_5_22s22s2lvico009.R.inc(3624);return ontology;
    }finally{__CLR4_5_22s22s2lvico009.R.flushNeeded();}}

    @Test
    public void replicateFailure() throws Exception {__CLR4_5_22s22s2lvico009.R.globalSliceStart(getClass().getName(),3625);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24ptwhk2sp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22s22s2lvico009.R.rethrow($CLV_t2$);}finally{__CLR4_5_22s22s2lvico009.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.annotations.SWRLAnnotationTestCase.replicateFailure",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3625,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24ptwhk2sp() throws Exception{try{__CLR4_5_22s22s2lvico009.R.inc(3625);
        __CLR4_5_22s22s2lvico009.R.inc(3626);String input = "<?xml version=\"1.0\"?>\n"
                + "<rdf:RDF\n"
                + "    xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\n"
                + "    xmlns:protege=\"http://protege.stanford.edu/plugins/owl/protege#\"\n"
                + "    xmlns=\"urn:test#\"\n"
                + "    xmlns:xsp=\"http://www.owl-ontologies.com/2005/08/07/xsp.owl#\"\n"
                + "    xmlns:owl=\"http://www.w3.org/2002/07/owl#\"\n"
                + "    xmlns:sqwrl=\"http://sqwrl.stanford.edu/ontologies/built-ins/3.4/sqwrl.owl#\"\n"
                + "    xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\"\n"
                + "    xmlns:swrl=\"http://www.w3.org/2003/11/swrl#\"\n"
                + "    xmlns:swrlb=\"http://www.w3.org/2003/11/swrlb#\"\n"
                + "    xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"\n"
                + "    xmlns:swrla=\"http://swrl.stanford.edu/ontologies/3.3/swrla.owl#\"\n"
                + "  xml:base=\"urn:test\">\n"
                + "  <owl:Ontology rdf:about=\"\">\n"
                + "  </owl:Ontology>\n"
                + "  <owl:AnnotationProperty rdf:about=\"http://swrl.stanford.edu/ontologies/3.3/swrla.owl#isRuleEnabled\"/>\n"
                + "  <owl:ObjectProperty rdf:ID=\"hasDriver\">\n"
                + "    <owl:inverseOf>\n"
                + "      <owl:ObjectProperty rdf:ID=\"drives\"/>\n"
                + "    </owl:inverseOf>\n"
                + "  </owl:ObjectProperty>\n"
                + "  <owl:ObjectProperty rdf:about=\"#drives\">\n"
                + "    <owl:inverseOf rdf:resource=\"#hasDriver\"/>\n"
                + "  </owl:ObjectProperty>\n"
                + "  <swrl:Imp rdf:ID=\"test-table5-prp-inv2-rule\">\n"
                + "    <swrl:body>\n"
                + "      <swrl:AtomList/>\n"
                + "    </swrl:body>\n"
                + "    <swrl:head>\n"
                + "      <swrl:AtomList>\n"
                + "        <rdf:rest rdf:resource=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#nil\"/>\n"
                + "        <rdf:first>\n"
                + "          <swrl:IndividualPropertyAtom>\n"
                + "            <swrl:argument2>\n"
                + "              <Person rdf:ID=\"i62\"/>\n"
                + "            </swrl:argument2>\n"
                + "            <swrl:argument1>\n"
                + "              <Person rdf:ID=\"i61\"/>\n"
                + "            </swrl:argument1>\n"
                + "            <swrl:propertyPredicate rdf:resource=\"#drives\"/>\n"
                + "          </swrl:IndividualPropertyAtom>\n"
                + "        </rdf:first>\n"
                + "      </swrl:AtomList>\n"
                + "    </swrl:head>\n"
                + "    <swrla:isRuleEnabled rdf:datatype=\"http://www.w3.org/2001/XMLSchema#boolean\"\n"
                + "    >true</swrla:isRuleEnabled>\n"
                + "    <rdfs:comment rdf:datatype=\"http://www.w3.org/2001/XMLSchema#string\"\n"
                + "    >:i62, :i61</rdfs:comment>\n" + "  </swrl:Imp>\n"
                + "</rdf:RDF>";
        __CLR4_5_22s22s2lvico009.R.inc(3627);OWLOntology ontology = loadOntologyFromString(new StringDocumentSource(
                input, IRI.create("test"), new RDFXMLDocumentFormat(), null));
        __CLR4_5_22s22s2lvico009.R.inc(3628);assertTrue(ontology
                .getAxioms(AxiomType.SWRL_RULE)
                .toString()
                .contains(
                        "DLSafeRule(Annotation(<http://swrl.stanford.edu/ontologies/3.3/swrla.owl#isRuleEnabled> \"true\"^^xsd:boolean) Annotation(rdfs:comment \":i62, :i61\"^^xsd:string)  Body() Head(ObjectPropertyAtom(<#drives> <#i61> <#i62>)) )"));
    }finally{__CLR4_5_22s22s2lvico009.R.flushNeeded();}}

    @Test
    public void replicateSuccess() throws Exception {__CLR4_5_22s22s2lvico009.R.globalSliceStart(getClass().getName(),3629);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mwlsnz2st();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22s22s2lvico009.R.rethrow($CLV_t2$);}finally{__CLR4_5_22s22s2lvico009.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.annotations.SWRLAnnotationTestCase.replicateSuccess",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3629,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mwlsnz2st() throws Exception{try{__CLR4_5_22s22s2lvico009.R.inc(3629);
        __CLR4_5_22s22s2lvico009.R.inc(3630);String input = "<?xml version=\"1.0\"?>\n"
                + "<rdf:RDF\n"
                + "    xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\n"
                + "    xmlns:protege=\"http://protege.stanford.edu/plugins/owl/protege#\"\n"
                + "    xmlns=\"urn:test#\"\n"
                + "    xmlns:xsp=\"http://www.owl-ontologies.com/2005/08/07/xsp.owl#\"\n"
                + "    xmlns:owl=\"http://www.w3.org/2002/07/owl#\"\n"
                + "    xmlns:sqwrl=\"http://sqwrl.stanford.edu/ontologies/built-ins/3.4/sqwrl.owl#\"\n"
                + "    xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\"\n"
                + "    xmlns:swrl=\"http://www.w3.org/2003/11/swrl#\"\n"
                + "    xmlns:swrlb=\"http://www.w3.org/2003/11/swrlb#\"\n"
                + "    xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"\n"
                + "    xmlns:swrla=\"http://swrl.stanford.edu/ontologies/3.3/swrla.owl#\"\n"
                + "  xml:base=\"urn:test\">\n"
                + "  <owl:Ontology rdf:about=\"\">\n"
                + "  </owl:Ontology>\n"
                + "  <owl:AnnotationProperty rdf:about=\"http://swrl.stanford.edu/ontologies/3.3/swrla.owl#isRuleEnabled\"/>\n"
                + "  <owl:ObjectProperty rdf:ID=\"hasDriver\">\n"
                + "    <owl:inverseOf>\n"
                + "      <owl:ObjectProperty rdf:ID=\"drives\"/>\n"
                + "    </owl:inverseOf>\n"
                + "  </owl:ObjectProperty>\n"
                + "  <owl:ObjectProperty rdf:about=\"#drives\">\n"
                + "    <owl:inverseOf rdf:resource=\"#hasDriver\"/>\n"
                + "  </owl:ObjectProperty>\n"
                + "  <swrl:Imp>\n"
                + "    <swrl:body>\n"
                + "      <swrl:AtomList/>\n"
                + "    </swrl:body>\n"
                + "    <swrl:head>\n"
                + "      <swrl:AtomList>\n"
                + "        <rdf:rest rdf:resource=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#nil\"/>\n"
                + "        <rdf:first>\n"
                + "          <swrl:IndividualPropertyAtom>\n"
                + "            <swrl:argument2>\n"
                + "              <Person rdf:ID=\"i62\"/>\n"
                + "            </swrl:argument2>\n"
                + "            <swrl:argument1>\n"
                + "              <Person rdf:ID=\"i61\"/>\n"
                + "            </swrl:argument1>\n"
                + "            <swrl:propertyPredicate rdf:resource=\"#drives\"/>\n"
                + "          </swrl:IndividualPropertyAtom>\n"
                + "        </rdf:first>\n"
                + "      </swrl:AtomList>\n"
                + "    </swrl:head>\n"
                + "    <swrla:isRuleEnabled rdf:datatype=\"http://www.w3.org/2001/XMLSchema#boolean\">true</swrla:isRuleEnabled>\n"
                + "    <rdfs:comment rdf:datatype=\"http://www.w3.org/2001/XMLSchema#string\">:i62, :i61</rdfs:comment>\n"
                + "  </swrl:Imp>\n" + "</rdf:RDF>";
        __CLR4_5_22s22s2lvico009.R.inc(3631);OWLOntology ontology = loadOntologyFromString(new StringDocumentSource(
                input, IRI.create("test"), new RDFXMLDocumentFormat(), null));
        __CLR4_5_22s22s2lvico009.R.inc(3632);assertTrue(ontology
                .getAxioms(AxiomType.SWRL_RULE)
                .toString()
                .contains(
                        "DLSafeRule(Annotation(<http://swrl.stanford.edu/ontologies/3.3/swrla.owl#isRuleEnabled> \"true\"^^xsd:boolean) Annotation(rdfs:comment \":i62, :i61\"^^xsd:string)  Body() Head(ObjectPropertyAtom(<#drives> <#i61> <#i62>)) )"));
    }finally{__CLR4_5_22s22s2lvico009.R.flushNeeded();}}
}
