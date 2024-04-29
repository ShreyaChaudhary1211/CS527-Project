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
package org.semanticweb.owlapi.profiles.test;

import static org.junit.Assert.assertEquals;
import static org.semanticweb.owlapi.apibinding.OWLFunctionalSyntaxFactory.*;
import static org.semanticweb.owlapi.search.Searcher.*;

import java.net.URL;
import java.util.Collection;

import javax.annotation.Nonnull;

import org.junit.Test;
import org.semanticweb.owlapi.api.test.baseclasses.TestBase;
import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.profiles.*;
import org.semanticweb.owlapi.vocab.OWL2Datatype;

/**
 * @author Matthew Horridge, The University of Manchester, Information
 *         Management Group
 * @since 3.0.0
 */
@SuppressWarnings("javadoc")
public class ProfileValidationTestCase extends TestBase {static class __CLR4_5_2bgebgelvico2d0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,14929,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testProfiles() throws OWLOntologyCreationException {__CLR4_5_2bgebgelvico2d0.R.globalSliceStart(getClass().getName(),14846);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xd9mxvbge();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2bgebgelvico2d0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2bgebgelvico2d0.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.ProfileValidationTestCase.testProfiles",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14846,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xd9mxvbge() throws OWLOntologyCreationException{try{__CLR4_5_2bgebgelvico2d0.R.inc(14846);
        __CLR4_5_2bgebgelvico2d0.R.inc(14847);String ns = "http://www.w3.org/2007/OWL/testOntology#";
        __CLR4_5_2bgebgelvico2d0.R.inc(14848);IRI profile = IRI(ns + "ProfileIdentificationTest");
        __CLR4_5_2bgebgelvico2d0.R.inc(14849);IRI species = IRI(ns + "species");
        __CLR4_5_2bgebgelvico2d0.R.inc(14850);IRI fullIRI = IRI(ns + "FULL");
        __CLR4_5_2bgebgelvico2d0.R.inc(14851);IRI dlIRI = IRI(ns + "DL");
        __CLR4_5_2bgebgelvico2d0.R.inc(14852);IRI elIRI = IRI(ns + "EL");
        __CLR4_5_2bgebgelvico2d0.R.inc(14853);IRI qlIRI = IRI(ns + "QL");
        __CLR4_5_2bgebgelvico2d0.R.inc(14854);IRI rlIRI = IRI(ns + "RL");
        __CLR4_5_2bgebgelvico2d0.R.inc(14855);IRI premiseIRI = IRI(ns + "rdfXmlPremiseOntology");
        __CLR4_5_2bgebgelvico2d0.R.inc(14856);URL resourceURL = ProfileValidationTestCase.class.getResource("/all.rdf");
        __CLR4_5_2bgebgelvico2d0.R.inc(14857);IRI allTestURI = IRI.create(resourceURL);
        __CLR4_5_2bgebgelvico2d0.R.inc(14858);OWLOntology testCasesOntology = m.loadOntologyFromOntologyDocument(allTestURI);
        __CLR4_5_2bgebgelvico2d0.R.inc(14859);OWLClass profileIdentificationTestClass = Class(profile);
        __CLR4_5_2bgebgelvico2d0.R.inc(14860);OWLNamedIndividual el = df.getOWLNamedIndividual(elIRI);
        __CLR4_5_2bgebgelvico2d0.R.inc(14861);OWLNamedIndividual ql = df.getOWLNamedIndividual(qlIRI);
        __CLR4_5_2bgebgelvico2d0.R.inc(14862);OWLNamedIndividual rl = df.getOWLNamedIndividual(rlIRI);
        __CLR4_5_2bgebgelvico2d0.R.inc(14863);OWLObjectProperty speciesProperty = df.getOWLObjectProperty(species);
        __CLR4_5_2bgebgelvico2d0.R.inc(14864);OWLNamedIndividual full = df.getOWLNamedIndividual(fullIRI);
        __CLR4_5_2bgebgelvico2d0.R.inc(14865);OWLNamedIndividual dl = df.getOWLNamedIndividual(dlIRI);
        __CLR4_5_2bgebgelvico2d0.R.inc(14866);OWLDataProperty rdfXMLPremiseOntologyProperty = df.getOWLDataProperty(premiseIRI);
        __CLR4_5_2bgebgelvico2d0.R.inc(14867);for (OWLClassAssertionAxiom ax : testCasesOntology.getClassAssertionAxioms(profileIdentificationTestClass)) {{
            __CLR4_5_2bgebgelvico2d0.R.inc(14868);OWLIndividual ind = ax.getIndividual();
            __CLR4_5_2bgebgelvico2d0.R.inc(14869);Collection<OWLLiteral> vals = values(testCasesOntology.getDataPropertyAssertionAxioms(ind),
                rdfXMLPremiseOntologyProperty);
            __CLR4_5_2bgebgelvico2d0.R.inc(14870);if ((((vals.size() != 1)&&(__CLR4_5_2bgebgelvico2d0.R.iget(14871)!=0|true))||(__CLR4_5_2bgebgelvico2d0.R.iget(14872)==0&false))) {{
                __CLR4_5_2bgebgelvico2d0.R.inc(14873);continue;
            }
            }__CLR4_5_2bgebgelvico2d0.R.inc(14874);String ontologySerialisation = vals.iterator().next().getLiteral();
            __CLR4_5_2bgebgelvico2d0.R.inc(14875);OWLOntology ontology = loadOntologyFromString(ontologySerialisation);
            // FULL?
            __CLR4_5_2bgebgelvico2d0.R.inc(14876);Collection<OWLIndividual> finder = values(testCasesOntology.getObjectPropertyAssertionAxioms(ind),
                speciesProperty);
            __CLR4_5_2bgebgelvico2d0.R.inc(14877);if ((((finder.contains(full))&&(__CLR4_5_2bgebgelvico2d0.R.iget(14878)!=0|true))||(__CLR4_5_2bgebgelvico2d0.R.iget(14879)==0&false))) {{
                __CLR4_5_2bgebgelvico2d0.R.inc(14880);checkProfile(ontology, new OWL2Profile(), true);
            }
            }__CLR4_5_2bgebgelvico2d0.R.inc(14881);Collection<OWLIndividual> negativeFinder = negValues(testCasesOntology
                .getNegativeObjectPropertyAssertionAxioms(ind), speciesProperty);
            __CLR4_5_2bgebgelvico2d0.R.inc(14882);if ((((negativeFinder.contains(full))&&(__CLR4_5_2bgebgelvico2d0.R.iget(14883)!=0|true))||(__CLR4_5_2bgebgelvico2d0.R.iget(14884)==0&false))) {{
                __CLR4_5_2bgebgelvico2d0.R.inc(14885);checkProfile(ontology, new OWL2Profile(), false);
            }
            // DL?
            }__CLR4_5_2bgebgelvico2d0.R.inc(14886);if ((((finder.contains(dl))&&(__CLR4_5_2bgebgelvico2d0.R.iget(14887)!=0|true))||(__CLR4_5_2bgebgelvico2d0.R.iget(14888)==0&false))) {{
                __CLR4_5_2bgebgelvico2d0.R.inc(14889);checkProfile(ontology, new OWL2DLProfile(), true);
            }
            }__CLR4_5_2bgebgelvico2d0.R.inc(14890);if ((((negativeFinder.contains(dl))&&(__CLR4_5_2bgebgelvico2d0.R.iget(14891)!=0|true))||(__CLR4_5_2bgebgelvico2d0.R.iget(14892)==0&false))) {{
                __CLR4_5_2bgebgelvico2d0.R.inc(14893);checkProfile(ontology, new OWL2DLProfile(), false);
            }
            // EL?
            }__CLR4_5_2bgebgelvico2d0.R.inc(14894);if ((((finder.contains(el))&&(__CLR4_5_2bgebgelvico2d0.R.iget(14895)!=0|true))||(__CLR4_5_2bgebgelvico2d0.R.iget(14896)==0&false))) {{
                __CLR4_5_2bgebgelvico2d0.R.inc(14897);checkProfile(ontology, new OWL2ELProfile(), true);
            }
            }__CLR4_5_2bgebgelvico2d0.R.inc(14898);if ((((negativeFinder.contains(el))&&(__CLR4_5_2bgebgelvico2d0.R.iget(14899)!=0|true))||(__CLR4_5_2bgebgelvico2d0.R.iget(14900)==0&false))) {{
                __CLR4_5_2bgebgelvico2d0.R.inc(14901);checkProfile(ontology, new OWL2ELProfile(), false);
            }
            // QL?
            }__CLR4_5_2bgebgelvico2d0.R.inc(14902);if ((((finder.contains(ql))&&(__CLR4_5_2bgebgelvico2d0.R.iget(14903)!=0|true))||(__CLR4_5_2bgebgelvico2d0.R.iget(14904)==0&false))) {{
                __CLR4_5_2bgebgelvico2d0.R.inc(14905);checkProfile(ontology, new OWL2QLProfile(), true);
            }
            }__CLR4_5_2bgebgelvico2d0.R.inc(14906);if ((((negativeFinder.contains(ql))&&(__CLR4_5_2bgebgelvico2d0.R.iget(14907)!=0|true))||(__CLR4_5_2bgebgelvico2d0.R.iget(14908)==0&false))) {{
                __CLR4_5_2bgebgelvico2d0.R.inc(14909);checkProfile(ontology, new OWL2QLProfile(), false);
            }
            // RL?
            }__CLR4_5_2bgebgelvico2d0.R.inc(14910);if ((((finder.contains(rl))&&(__CLR4_5_2bgebgelvico2d0.R.iget(14911)!=0|true))||(__CLR4_5_2bgebgelvico2d0.R.iget(14912)==0&false))) {{
                __CLR4_5_2bgebgelvico2d0.R.inc(14913);checkProfile(ontology, new OWL2RLProfile(), true);
            }
            }__CLR4_5_2bgebgelvico2d0.R.inc(14914);if ((((negativeFinder.contains(rl))&&(__CLR4_5_2bgebgelvico2d0.R.iget(14915)!=0|true))||(__CLR4_5_2bgebgelvico2d0.R.iget(14916)==0&false))) {{
                __CLR4_5_2bgebgelvico2d0.R.inc(14917);checkProfile(ontology, new OWL2RLProfile(), false);
            }
            }__CLR4_5_2bgebgelvico2d0.R.inc(14918);m.removeOntology(ontology);
        }
    }}finally{__CLR4_5_2bgebgelvico2d0.R.flushNeeded();}}

    private static void checkProfile(OWLOntology ontology, @Nonnull OWLProfile profile, boolean shouldBeInProfile) {try{__CLR4_5_2bgebgelvico2d0.R.inc(14919);
        __CLR4_5_2bgebgelvico2d0.R.inc(14920);OWLProfileReport report = profile.checkOntology(ontology);
        __CLR4_5_2bgebgelvico2d0.R.inc(14921);assertEquals(shouldBeInProfile, report.isInProfile());
    }finally{__CLR4_5_2bgebgelvico2d0.R.flushNeeded();}}

    @Test
    public void shouldNotFailELBecauseOfBoolean() throws OWLOntologyCreationException {__CLR4_5_2bgebgelvico2d0.R.globalSliceStart(getClass().getName(),14922);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tushm1bii();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2bgebgelvico2d0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2bgebgelvico2d0.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.ProfileValidationTestCase.shouldNotFailELBecauseOfBoolean",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14922,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tushm1bii() throws OWLOntologyCreationException{try{__CLR4_5_2bgebgelvico2d0.R.inc(14922);
        __CLR4_5_2bgebgelvico2d0.R.inc(14923);OWLOntology o = m.createOntology();
        __CLR4_5_2bgebgelvico2d0.R.inc(14924);OWLAnnotation ann = df.getOWLAnnotation(df.getRDFSLabel(), df.getOWLLiteral(true));
        __CLR4_5_2bgebgelvico2d0.R.inc(14925);OWLAnnotationAssertionAxiom ax = df.getOWLAnnotationAssertionAxiom(IRI.create("urn:test:ELProfile"), ann);
        __CLR4_5_2bgebgelvico2d0.R.inc(14926);m.addAxiom(o, ax);
        __CLR4_5_2bgebgelvico2d0.R.inc(14927);m.addAxiom(o, Declaration(OWL2Datatype.XSD_BOOLEAN.getDatatype(df)));
        __CLR4_5_2bgebgelvico2d0.R.inc(14928);checkProfile(o, new OWL2ELProfile(), true);
    }finally{__CLR4_5_2bgebgelvico2d0.R.flushNeeded();}}
}
