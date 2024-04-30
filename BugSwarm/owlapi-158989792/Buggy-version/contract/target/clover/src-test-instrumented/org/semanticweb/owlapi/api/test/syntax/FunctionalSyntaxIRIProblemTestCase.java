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

import org.junit.Test;
import org.semanticweb.owlapi.api.test.baseclasses.TestBase;
import org.semanticweb.owlapi.formats.FunctionalSyntaxDocumentFormat;
import org.semanticweb.owlapi.formats.ManchesterSyntaxDocumentFormat;
import org.semanticweb.owlapi.formats.RDFXMLDocumentFormat;
import org.semanticweb.owlapi.io.OWLOntologyDocumentTarget;
import org.semanticweb.owlapi.io.StringDocumentTarget;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLDataFactory;
import org.semanticweb.owlapi.model.OWLDeclarationAxiom;
import org.semanticweb.owlapi.model.OWLObjectProperty;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.OWLOntologyStorageException;
import org.semanticweb.owlapi.model.PrefixManager;
import org.semanticweb.owlapi.util.DefaultPrefixManager;

@SuppressWarnings("javadoc")
public class FunctionalSyntaxIRIProblemTestCase extends TestBase {static class __CLR4_5_2865865lvico1ly{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,10645,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testmain() throws Exception {__CLR4_5_2865865lvico1ly.R.globalSliceStart(getClass().getName(),10589);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2udhx6a865();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2865865lvico1ly.R.rethrow($CLV_t2$);}finally{__CLR4_5_2865865lvico1ly.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.FunctionalSyntaxIRIProblemTestCase.testmain",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10589,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2udhx6a865() throws Exception{try{__CLR4_5_2865865lvico1ly.R.inc(10589);
        __CLR4_5_2865865lvico1ly.R.inc(10590);OWLDataFactory factory = m.getOWLDataFactory();
        __CLR4_5_2865865lvico1ly.R.inc(10591);OWLOntology ontology = m.createOntology(IRI("urn:testontology:o1"));
        __CLR4_5_2865865lvico1ly.R.inc(10592);OWLObjectProperty p = factory.getOWLObjectProperty(IRI("http://example.org/A_#part_of"));
        __CLR4_5_2865865lvico1ly.R.inc(10593);OWLClass a = Class(IRI("http://example.org/A_A"));
        __CLR4_5_2865865lvico1ly.R.inc(10594);OWLClass b = Class(IRI("http://example.org/A_B"));
        __CLR4_5_2865865lvico1ly.R.inc(10595);m.addAxiom(ontology, Declaration(p));
        __CLR4_5_2865865lvico1ly.R.inc(10596);m.addAxiom(ontology, Declaration(a));
        __CLR4_5_2865865lvico1ly.R.inc(10597);m.addAxiom(ontology, Declaration(b));
        __CLR4_5_2865865lvico1ly.R.inc(10598);m.addAxiom(ontology, SubClassOf(b, factory.getOWLObjectSomeValuesFrom(p, a)));
        __CLR4_5_2865865lvico1ly.R.inc(10599);OWLOntology loadOntology = roundTrip(ontology, new RDFXMLDocumentFormat());
        __CLR4_5_2865865lvico1ly.R.inc(10600);FunctionalSyntaxDocumentFormat functionalFormat = new FunctionalSyntaxDocumentFormat();
        __CLR4_5_2865865lvico1ly.R.inc(10601);functionalFormat.asPrefixOWLOntologyFormat().setPrefix("example", "http://example.org/");
        __CLR4_5_2865865lvico1ly.R.inc(10602);OWLOntology loadOntology2 = roundTrip(ontology, functionalFormat);
        // won't reach here if functional syntax fails - comment it out and
        // uncomment this to test Manchester
        __CLR4_5_2865865lvico1ly.R.inc(10603);ManchesterSyntaxDocumentFormat manchesterFormat = new ManchesterSyntaxDocumentFormat();
        __CLR4_5_2865865lvico1ly.R.inc(10604);manchesterFormat.asPrefixOWLOntologyFormat().setPrefix("example", "http://example.org/");
        __CLR4_5_2865865lvico1ly.R.inc(10605);OWLOntology loadOntology3 = roundTrip(ontology, manchesterFormat);
        __CLR4_5_2865865lvico1ly.R.inc(10606);assertEquals(ontology, loadOntology);
        __CLR4_5_2865865lvico1ly.R.inc(10607);assertEquals(ontology, loadOntology2);
        __CLR4_5_2865865lvico1ly.R.inc(10608);assertEquals(ontology, loadOntology3);
        __CLR4_5_2865865lvico1ly.R.inc(10609);assertEquals(ontology.getAxioms(), loadOntology.getAxioms());
        __CLR4_5_2865865lvico1ly.R.inc(10610);assertEquals(ontology.getAxioms(), loadOntology2.getAxioms());
        __CLR4_5_2865865lvico1ly.R.inc(10611);assertEquals(ontology.getAxioms(), loadOntology3.getAxioms());
    }finally{__CLR4_5_2865865lvico1ly.R.flushNeeded();}}

    @Test
    public void shouldRespectDefaultPrefix() throws OWLOntologyCreationException, OWLOntologyStorageException {__CLR4_5_2865865lvico1ly.R.globalSliceStart(getClass().getName(),10612);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2by790986s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2865865lvico1ly.R.rethrow($CLV_t2$);}finally{__CLR4_5_2865865lvico1ly.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.FunctionalSyntaxIRIProblemTestCase.shouldRespectDefaultPrefix",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10612,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2by790986s() throws OWLOntologyCreationException, OWLOntologyStorageException{try{__CLR4_5_2865865lvico1ly.R.inc(10612);
        __CLR4_5_2865865lvico1ly.R.inc(10613);OWLOntology ontology = m.createOntology(IRI.create("http://www.dis.uniroma1.it/example/"));
        __CLR4_5_2865865lvico1ly.R.inc(10614);PrefixManager pm = new DefaultPrefixManager();
        __CLR4_5_2865865lvico1ly.R.inc(10615);pm.setPrefix("example", "http://www.dis.uniroma1.it/example/");
        __CLR4_5_2865865lvico1ly.R.inc(10616);OWLClass pizza = df.getOWLClass("example:pizza", pm);
        __CLR4_5_2865865lvico1ly.R.inc(10617);OWLDeclarationAxiom declarationAxiom = df.getOWLDeclarationAxiom(pizza);
        __CLR4_5_2865865lvico1ly.R.inc(10618);m.addAxiom(ontology, declarationAxiom);
        __CLR4_5_2865865lvico1ly.R.inc(10619);FunctionalSyntaxDocumentFormat ontoFormat = new FunctionalSyntaxDocumentFormat();
        __CLR4_5_2865865lvico1ly.R.inc(10620);ontoFormat.copyPrefixesFrom(pm);
        __CLR4_5_2865865lvico1ly.R.inc(10621);m.setOntologyFormat(ontology, ontoFormat);
        __CLR4_5_2865865lvico1ly.R.inc(10622);StringDocumentTarget documentTarget = new StringDocumentTarget();
        __CLR4_5_2865865lvico1ly.R.inc(10623);m.saveOntology(ontology, documentTarget);
        __CLR4_5_2865865lvico1ly.R.inc(10624);assertTrue(documentTarget.toString().contains("example:pizza"));
    }finally{__CLR4_5_2865865lvico1ly.R.flushNeeded();}}

    @Test
    public void shouldConvertToFunctionalCorrectly() throws OWLOntologyCreationException, OWLOntologyStorageException {__CLR4_5_2865865lvico1ly.R.globalSliceStart(getClass().getName(),10625);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_258l2kg875();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2865865lvico1ly.R.rethrow($CLV_t2$);}finally{__CLR4_5_2865865lvico1ly.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.FunctionalSyntaxIRIProblemTestCase.shouldConvertToFunctionalCorrectly",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10625,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_258l2kg875() throws OWLOntologyCreationException, OWLOntologyStorageException{try{__CLR4_5_2865865lvico1ly.R.inc(10625);
        __CLR4_5_2865865lvico1ly.R.inc(10626);String in = "Prefix: : <http://purl.obolibrary.org/obo/>\n" + "Ontology: <http://example.org/>\n"
            + "Class: :FOO_0000001";
        __CLR4_5_2865865lvico1ly.R.inc(10627);OWLOntology o = loadOntologyFromString(in);
        __CLR4_5_2865865lvico1ly.R.inc(10628);OWLOntology o1 = loadOntologyFromString(saveOntology(o, new FunctionalSyntaxDocumentFormat()));
        __CLR4_5_2865865lvico1ly.R.inc(10629);equal(o, o1);
    }finally{__CLR4_5_2865865lvico1ly.R.flushNeeded();}}

    @Test
    public void shouldPreservePrefix() throws OWLOntologyCreationException, OWLOntologyStorageException {__CLR4_5_2865865lvico1ly.R.globalSliceStart(getClass().getName(),10630);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xtsb4887a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2865865lvico1ly.R.rethrow($CLV_t2$);}finally{__CLR4_5_2865865lvico1ly.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.FunctionalSyntaxIRIProblemTestCase.shouldPreservePrefix",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10630,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xtsb4887a() throws OWLOntologyCreationException, OWLOntologyStorageException{try{__CLR4_5_2865865lvico1ly.R.inc(10630);
        __CLR4_5_2865865lvico1ly.R.inc(10631);String prefix = "http://www.dis.uniroma1.it/pizza";
        __CLR4_5_2865865lvico1ly.R.inc(10632);OWLOntology ontology = m.createOntology(IRI.create(prefix));
        __CLR4_5_2865865lvico1ly.R.inc(10633);PrefixManager pm = new DefaultPrefixManager();
        __CLR4_5_2865865lvico1ly.R.inc(10634);pm.setPrefix("pizza", prefix);
        __CLR4_5_2865865lvico1ly.R.inc(10635);OWLClass pizza = df.getOWLClass("pizza:PizzaBase", pm);
        __CLR4_5_2865865lvico1ly.R.inc(10636);assertEquals(prefix + "PizzaBase", pizza.getIRI().toString());
        __CLR4_5_2865865lvico1ly.R.inc(10637);OWLDeclarationAxiom declarationAxiom = df.getOWLDeclarationAxiom(pizza);
        __CLR4_5_2865865lvico1ly.R.inc(10638);m.addAxiom(ontology, declarationAxiom);
        __CLR4_5_2865865lvico1ly.R.inc(10639);FunctionalSyntaxDocumentFormat ontoFormat = new FunctionalSyntaxDocumentFormat();
        __CLR4_5_2865865lvico1ly.R.inc(10640);ontoFormat.setPrefix("pizza", prefix);
        __CLR4_5_2865865lvico1ly.R.inc(10641);m.setOntologyFormat(ontology, ontoFormat);
        __CLR4_5_2865865lvico1ly.R.inc(10642);OWLOntologyDocumentTarget stream = new StringDocumentTarget();
        __CLR4_5_2865865lvico1ly.R.inc(10643);m.saveOntology(ontology, stream);
        __CLR4_5_2865865lvico1ly.R.inc(10644);assertTrue(stream.toString().contains("pizza:PizzaBase"));
    }finally{__CLR4_5_2865865lvico1ly.R.flushNeeded();}}
}
