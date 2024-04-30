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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

import javax.annotation.Nonnull;

import org.junit.Test;
import org.semanticweb.owlapi.api.test.baseclasses.TestBase;
import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLDataFactory;
import org.semanticweb.owlapi.model.OWLDataProperty;
import org.semanticweb.owlapi.model.OWLDataPropertyRangeAxiom;
import org.semanticweb.owlapi.model.OWLDatatype;
import org.semanticweb.owlapi.model.OWLEntity;
import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLObjectProperty;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.OWLOntologyID;
import org.semanticweb.owlapi.model.SWRLAtom;
import org.semanticweb.owlapi.profiles.OWL2DLProfile;
import org.semanticweb.owlapi.profiles.OWL2ELProfile;
import org.semanticweb.owlapi.profiles.OWL2Profile;
import org.semanticweb.owlapi.profiles.OWL2QLProfile;
import org.semanticweb.owlapi.profiles.OWL2RLProfile;
import org.semanticweb.owlapi.profiles.OWLProfile;
import org.semanticweb.owlapi.profiles.OWLProfileViolation;
import org.semanticweb.owlapi.profiles.OWLProfileViolationVisitorAdapter;
import org.semanticweb.owlapi.profiles.OWLProfileViolationVisitorExAdapter;
import org.semanticweb.owlapi.profiles.violations.*;
import org.semanticweb.owlapi.vocab.OWL2Datatype;
import org.semanticweb.owlapi.vocab.OWLFacet;

import com.google.common.base.Optional;

@SuppressWarnings({ "javadoc", "rawtypes", })
public class OWLProfileTestCase extends TestBase {static class __CLR4_5_29y89y8lvico28i{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,13883,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Nonnull private static final String START = OWLThing().getIRI().getNamespace();
    @Nonnull private static final OWLClass CL = Class(IRI("urn:test#fakeclass"));
    @Nonnull private static final OWLDataProperty DATAP = DataProperty(IRI("urn:datatype#fakedatatypeproperty"));
    @Nonnull private static final OWLDataPropertyRangeAxiom DATA_PROPERTY_RANGE2 = DataPropertyRange(DATAP,
        DatatypeRestriction(Integer(), FacetRestriction(OWLFacet.LANG_RANGE, Literal(1))));
    @Nonnull private static final OWLDataPropertyRangeAxiom DATA_PROPERTY_RANGE = DataPropertyRange(DATAP,
        DatatypeRestriction(Integer(), FacetRestriction(OWLFacet.MAX_EXCLUSIVE, Literal(1))));
    @Nonnull private static final OWLObjectProperty OP = ObjectProperty(IRI("urn:datatype#fakeobjectproperty"));
    @Nonnull private static final OWLDatatype UNKNOWNFAKEDATATYPE = Datatype(IRI(START + "unknownfakedatatype"));
    @Nonnull private static final OWLDatatype FAKEUNDECLAREDDATATYPE = Datatype(IRI(
        "urn:datatype#fakeundeclareddatatype"));
    @Nonnull private static final OWLDatatype FAKEDATATYPE = Datatype(IRI("urn:datatype#fakedatatype"));
    @Nonnull private static final IRI onto = IRI.create("urn:test#ontology");
    @Nonnull private static final OWLDataFactory DF = OWLManager.getOWLDataFactory();
    @Nonnull private static final OWLObjectProperty P = ObjectProperty(IRI("urn:test#objectproperty"));

    public void declare(@Nonnull OWLOntology o, @Nonnull OWLEntity... entities) {try{__CLR4_5_29y89y8lvico28i.R.inc(12896);
        __CLR4_5_29y89y8lvico28i.R.inc(12897);for (OWLEntity e : entities) {{
            assert (((e != null)&&(__CLR4_5_29y89y8lvico28i.R.iget(12898)!=0|true))||(__CLR4_5_29y89y8lvico28i.R.iget(12899)==0&false));
            __CLR4_5_29y89y8lvico28i.R.inc(12900);m.addAxiom(o, Declaration(e));
        }
    }}finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Nonnull Comparator<Class> comp = new Comparator<Class>() {

        @Override
        public int compare(Class o1, Class o2) {try{__CLR4_5_29y89y8lvico28i.R.inc(12901);
            __CLR4_5_29y89y8lvico28i.R.inc(12902);return o1.getSimpleName().compareTo(o2.getSimpleName());
        }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}
    };

    public void checkInCollection(@Nonnull List<OWLProfileViolation> violations, Class[] inputList) {try{__CLR4_5_29y89y8lvico28i.R.inc(12903);
        __CLR4_5_29y89y8lvico28i.R.inc(12904);List<Class> list = new ArrayList<>(Arrays.asList(inputList));
        __CLR4_5_29y89y8lvico28i.R.inc(12905);List<Class> list1 = new ArrayList<>();
        __CLR4_5_29y89y8lvico28i.R.inc(12906);for (OWLProfileViolation v : violations) {{
            __CLR4_5_29y89y8lvico28i.R.inc(12907);list1.add(v.getClass());
        }
        }__CLR4_5_29y89y8lvico28i.R.inc(12908);Collections.sort(list, comp);
        __CLR4_5_29y89y8lvico28i.R.inc(12909);Collections.sort(list1, comp);
        __CLR4_5_29y89y8lvico28i.R.inc(12910);assertEquals(list1.toString(), list, list1);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    public void runAssert(@Nonnull OWLOntology o, @Nonnull OWLProfile profile, int expected,
        Class[] expectedViolations) {try{__CLR4_5_29y89y8lvico28i.R.inc(12911);
        __CLR4_5_29y89y8lvico28i.R.inc(12912);List<OWLProfileViolation> violations = profile.checkOntology(o).getViolations();
        __CLR4_5_29y89y8lvico28i.R.inc(12913);assertEquals(expected, violations.size());
        __CLR4_5_29y89y8lvico28i.R.inc(12914);checkInCollection(violations, expectedViolations);
        __CLR4_5_29y89y8lvico28i.R.inc(12915);for (OWLProfileViolation violation : violations) {{
            __CLR4_5_29y89y8lvico28i.R.inc(12916);o.getOWLOntologyManager().applyChanges(violation.repair());
            __CLR4_5_29y89y8lvico28i.R.inc(12917);violation.accept(new OWLProfileViolationVisitorAdapter());
            __CLR4_5_29y89y8lvico28i.R.inc(12918);violation.accept(new OWLProfileViolationVisitorExAdapter<String>() {

                @Override
                protected String doDefault(@Nonnull OWLProfileViolation object) {try{__CLR4_5_29y89y8lvico28i.R.inc(12919);
                    __CLR4_5_29y89y8lvico28i.R.inc(12920);return object.toString();
                }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}
            });
        }
        }__CLR4_5_29y89y8lvico28i.R.inc(12921);violations = profile.checkOntology(o).getViolations();
        __CLR4_5_29y89y8lvico28i.R.inc(12922);assertEquals(0, violations.size());
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(OWLDatatype datatype)")
    public void shouldCreateViolationForOWLDatatypeInOWL2DLProfile() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),12923);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wsz9i89yz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForOWLDatatypeInOWL2DLProfile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),12923,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wsz9i89yz() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(12923);
        __CLR4_5_29y89y8lvico28i.R.inc(12924);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(12925);declare(o, UNKNOWNFAKEDATATYPE, FAKEDATATYPE, Class(FAKEDATATYPE.getIRI()), DATAP);
        __CLR4_5_29y89y8lvico28i.R.inc(12926);m.addAxiom(o, DataPropertyRange(DATAP, FAKEUNDECLAREDDATATYPE));
        __CLR4_5_29y89y8lvico28i.R.inc(12927);OWL2DLProfile profile = new OWL2DLProfile();
        __CLR4_5_29y89y8lvico28i.R.inc(12928);int expected = 1;
        __CLR4_5_29y89y8lvico28i.R.inc(12929);Class[] expectedViolations = { UseOfUndeclaredDatatype.class };
        __CLR4_5_29y89y8lvico28i.R.inc(12930);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(OWLDatatypeDefinitionAxiom axiom)")
    public void shouldCreateViolationForOWLDatatypeDefinitionAxiomInOWL2DLProfile() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),12931);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n1pact9z7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForOWLDatatypeDefinitionAxiomInOWL2DLProfile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),12931,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n1pact9z7() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(12931);
        __CLR4_5_29y89y8lvico28i.R.inc(12932);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(12933);declare(o, Integer(), Boolean(), FAKEDATATYPE);
        __CLR4_5_29y89y8lvico28i.R.inc(12934);m.addAxiom(o, DatatypeDefinition(Boolean(), Integer()));
        __CLR4_5_29y89y8lvico28i.R.inc(12935);m.addAxiom(o, DatatypeDefinition(FAKEDATATYPE, Integer()));
        __CLR4_5_29y89y8lvico28i.R.inc(12936);m.addAxiom(o, DatatypeDefinition(Integer(), FAKEDATATYPE));
        __CLR4_5_29y89y8lvico28i.R.inc(12937);OWL2DLProfile profile = new OWL2DLProfile();
        __CLR4_5_29y89y8lvico28i.R.inc(12938);int expected = 4;
        __CLR4_5_29y89y8lvico28i.R.inc(12939);Class[] expectedViolations = { CycleInDatatypeDefinition.class, CycleInDatatypeDefinition.class,
            UseOfBuiltInDatatypeInDatatypeDefinition.class, UseOfBuiltInDatatypeInDatatypeDefinition.class };
        __CLR4_5_29y89y8lvico28i.R.inc(12940);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(OWLDatatypeDefinitionAxiom axiom)")
    public void shouldCreateViolationForOWLDatatypeDefinitionAxiomInOWL2DLProfileCycles() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),12941);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2oaocue9zh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForOWLDatatypeDefinitionAxiomInOWL2DLProfileCycles",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),12941,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2oaocue9zh() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(12941);
        __CLR4_5_29y89y8lvico28i.R.inc(12942);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(12943);OWL2DLProfile profile = new OWL2DLProfile();
        __CLR4_5_29y89y8lvico28i.R.inc(12944);OWLDatatype d = Datatype(IRI(START + "test"));
        __CLR4_5_29y89y8lvico28i.R.inc(12945);declare(o, d, Integer(), Boolean(), FAKEDATATYPE);
        __CLR4_5_29y89y8lvico28i.R.inc(12946);m.addAxiom(o, DatatypeDefinition(d, Boolean()));
        __CLR4_5_29y89y8lvico28i.R.inc(12947);m.addAxiom(o, DatatypeDefinition(Boolean(), d));
        __CLR4_5_29y89y8lvico28i.R.inc(12948);m.addAxiom(o, DatatypeDefinition(FAKEDATATYPE, Integer()));
        __CLR4_5_29y89y8lvico28i.R.inc(12949);m.addAxiom(o, DatatypeDefinition(Integer(), FAKEDATATYPE));
        __CLR4_5_29y89y8lvico28i.R.inc(12950);int expected = 9;
        __CLR4_5_29y89y8lvico28i.R.inc(12951);Class[] expectedViolations = { CycleInDatatypeDefinition.class, CycleInDatatypeDefinition.class,
            CycleInDatatypeDefinition.class, CycleInDatatypeDefinition.class,
            UseOfBuiltInDatatypeInDatatypeDefinition.class, UseOfBuiltInDatatypeInDatatypeDefinition.class,
            UseOfBuiltInDatatypeInDatatypeDefinition.class, UseOfUnknownDatatype.class, UseOfUnknownDatatype.class };
        __CLR4_5_29y89y8lvico28i.R.inc(12952);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(OWLObjectProperty property)")
    public void shouldCreateViolationForOWLObjectPropertyInOWL2DLProfile() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),12953);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ul0lsg9zt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForOWLObjectPropertyInOWL2DLProfile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),12953,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ul0lsg9zt() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(12953);
        __CLR4_5_29y89y8lvico28i.R.inc(12954);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(12955);IRI iri = IRI(START + "test");
        __CLR4_5_29y89y8lvico28i.R.inc(12956);declare(o, ObjectProperty(iri), DataProperty(iri), AnnotationProperty(iri));
        __CLR4_5_29y89y8lvico28i.R.inc(12957);m.addAxiom(o, SubObjectPropertyOf(OP, ObjectProperty(iri)));
        __CLR4_5_29y89y8lvico28i.R.inc(12958);OWL2DLProfile profile = new OWL2DLProfile();
        __CLR4_5_29y89y8lvico28i.R.inc(12959);int expected = 4;
        __CLR4_5_29y89y8lvico28i.R.inc(12960);Class[] expectedViolations = { UseOfReservedVocabularyForObjectPropertyIRI.class,
            UseOfUndeclaredObjectProperty.class, IllegalPunning.class, IllegalPunning.class };
        __CLR4_5_29y89y8lvico28i.R.inc(12961);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(OWLDataProperty property)")
    public void shouldCreateViolationForOWLDataPropertyInOWL2DLProfile1() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),12962);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cvc1fqa02();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForOWLDataPropertyInOWL2DLProfile1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),12962,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cvc1fqa02() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(12962);
        __CLR4_5_29y89y8lvico28i.R.inc(12963);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(12964);declare(o, DataProperty(IRI(START + "fail")));
        __CLR4_5_29y89y8lvico28i.R.inc(12965);OWL2DLProfile profile = new OWL2DLProfile();
        __CLR4_5_29y89y8lvico28i.R.inc(12966);int expected = 0;
        __CLR4_5_29y89y8lvico28i.R.inc(12967);Class[] expectedViolations = {};
        __CLR4_5_29y89y8lvico28i.R.inc(12968);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(OWLDataProperty property)")
    public void shouldCreateViolationForOWLDataPropertyInOWL2DLProfile2() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),12969);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29mc2n9a09();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForOWLDataPropertyInOWL2DLProfile2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),12969,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29mc2n9a09() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(12969);
        __CLR4_5_29y89y8lvico28i.R.inc(12970);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(12971);m.addAxiom(o, FunctionalDataProperty(DATAP));
        __CLR4_5_29y89y8lvico28i.R.inc(12972);OWL2DLProfile profile = new OWL2DLProfile();
        __CLR4_5_29y89y8lvico28i.R.inc(12973);int expected = 1;
        __CLR4_5_29y89y8lvico28i.R.inc(12974);Class[] expectedViolations = { UseOfUndeclaredDataProperty.class };
        __CLR4_5_29y89y8lvico28i.R.inc(12975);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(OWLDataProperty property)")
    public void shouldCreateViolationForOWLDataPropertyInOWL2DLProfile3() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),12976);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26dc3usa0g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForOWLDataPropertyInOWL2DLProfile3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),12976,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26dc3usa0g() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(12976);
        __CLR4_5_29y89y8lvico28i.R.inc(12977);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(12978);declare(o, DATAP, AnnotationProperty(DATAP.getIRI()));
        __CLR4_5_29y89y8lvico28i.R.inc(12979);OWL2DLProfile profile = new OWL2DLProfile();
        __CLR4_5_29y89y8lvico28i.R.inc(12980);int expected = 0;
        __CLR4_5_29y89y8lvico28i.R.inc(12981);Class[] expectedViolations = {};
        __CLR4_5_29y89y8lvico28i.R.inc(12982);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(OWLDataProperty property)")
    public void shouldCreateViolationForOWLDataPropertyInOWL2DLProfile4() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),12983);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_234c52ba0n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForOWLDataPropertyInOWL2DLProfile4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),12983,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_234c52ba0n() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(12983);
        __CLR4_5_29y89y8lvico28i.R.inc(12984);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(12985);declare(o, DATAP, ObjectProperty(DATAP.getIRI()));
        __CLR4_5_29y89y8lvico28i.R.inc(12986);OWL2DLProfile profile = new OWL2DLProfile();
        __CLR4_5_29y89y8lvico28i.R.inc(12987);int expected = 0;
        __CLR4_5_29y89y8lvico28i.R.inc(12988);Class[] expectedViolations = {};
        __CLR4_5_29y89y8lvico28i.R.inc(12989);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(OWLAnnotationProperty property)")
    public void shouldCreateViolationForOWLAnnotationPropertyInOWL2DLProfile() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),12990);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26auk80a0u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForOWLAnnotationPropertyInOWL2DLProfile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),12990,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26auk80a0u() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(12990);
        __CLR4_5_29y89y8lvico28i.R.inc(12991);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(12992);IRI iri = IRI(START + "test");
        __CLR4_5_29y89y8lvico28i.R.inc(12993);declare(o, ObjectProperty(iri), DataProperty(iri), AnnotationProperty(iri));
        __CLR4_5_29y89y8lvico28i.R.inc(12994);m.addAxiom(o, SubAnnotationPropertyOf(AnnotationProperty(IRI("urn:test#t")), AnnotationProperty(iri)));
        __CLR4_5_29y89y8lvico28i.R.inc(12995);OWL2DLProfile profile = new OWL2DLProfile();
        __CLR4_5_29y89y8lvico28i.R.inc(12996);int expected = 4;
        __CLR4_5_29y89y8lvico28i.R.inc(12997);Class[] expectedViolations = { UseOfReservedVocabularyForAnnotationPropertyIRI.class,
            UseOfUndeclaredAnnotationProperty.class, IllegalPunning.class, IllegalPunning.class };
        __CLR4_5_29y89y8lvico28i.R.inc(12998);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(OWLOntology ontology)")
    public void shouldCreateViolationForOWLOntologyInOWL2DLProfile() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),12999);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2eu27bfa13();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForOWLOntologyInOWL2DLProfile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),12999,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2eu27bfa13() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(12999);
        __CLR4_5_29y89y8lvico28i.R.inc(13000);OWLOntology o = m.createOntology(new OWLOntologyID(Optional.of(IRI(START + "test")), Optional.of(IRI(START
            + "test1"))));
        __CLR4_5_29y89y8lvico28i.R.inc(13001);OWL2DLProfile profile = new OWL2DLProfile();
        __CLR4_5_29y89y8lvico28i.R.inc(13002);int expected = 2;
        __CLR4_5_29y89y8lvico28i.R.inc(13003);Class[] expectedViolations = { UseOfReservedVocabularyForOntologyIRI.class,
            UseOfReservedVocabularyForVersionIRI.class };
        __CLR4_5_29y89y8lvico28i.R.inc(13004);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(OWLClass desc)")
    public void shouldCreateViolationForOWLClassInOWL2DLProfile() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),13005);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vqyc6qa19();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForOWLClassInOWL2DLProfile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13005,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vqyc6qa19() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(13005);
        __CLR4_5_29y89y8lvico28i.R.inc(13006);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(13007);declare(o, Class(IRI(START + "test")), FAKEDATATYPE);
        __CLR4_5_29y89y8lvico28i.R.inc(13008);m.addAxiom(o, ClassAssertion(Class(FAKEDATATYPE.getIRI()), AnonymousIndividual()));
        __CLR4_5_29y89y8lvico28i.R.inc(13009);OWL2DLProfile profile = new OWL2DLProfile();
        __CLR4_5_29y89y8lvico28i.R.inc(13010);int expected = 2;
        __CLR4_5_29y89y8lvico28i.R.inc(13011);Class[] expectedViolations = { UseOfUndeclaredClass.class, DatatypeIRIAlsoUsedAsClassIRI.class };
        __CLR4_5_29y89y8lvico28i.R.inc(13012);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(OWLDataOneOf node)")
    public void shouldCreateViolationForOWLDataOneOfInOWL2DLProfile() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),13013);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2v1zr03a1h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForOWLDataOneOfInOWL2DLProfile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13013,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2v1zr03a1h() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(13013);
        __CLR4_5_29y89y8lvico28i.R.inc(13014);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(13015);declare(o, DATAP);
        __CLR4_5_29y89y8lvico28i.R.inc(13016);m.addAxiom(o, DataPropertyRange(DATAP, DataOneOf()));
        __CLR4_5_29y89y8lvico28i.R.inc(13017);OWL2DLProfile profile = new OWL2DLProfile();
        __CLR4_5_29y89y8lvico28i.R.inc(13018);int expected = 1;
        __CLR4_5_29y89y8lvico28i.R.inc(13019);Class[] expectedViolations = { EmptyOneOfAxiom.class };
        __CLR4_5_29y89y8lvico28i.R.inc(13020);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(OWLDataUnionOf node)")
    public void shouldCreateViolationForOWLDataUnionOfInOWL2DLProfile() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),13021);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23t9wnea1p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForOWLDataUnionOfInOWL2DLProfile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13021,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23t9wnea1p() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(13021);
        __CLR4_5_29y89y8lvico28i.R.inc(13022);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(13023);declare(o, DATAP);
        __CLR4_5_29y89y8lvico28i.R.inc(13024);m.addAxiom(o, DataPropertyRange(DATAP, DataUnionOf()));
        __CLR4_5_29y89y8lvico28i.R.inc(13025);OWL2DLProfile profile = new OWL2DLProfile();
        __CLR4_5_29y89y8lvico28i.R.inc(13026);int expected = 1;
        __CLR4_5_29y89y8lvico28i.R.inc(13027);Class[] expectedViolations = { InsufficientOperands.class };
        __CLR4_5_29y89y8lvico28i.R.inc(13028);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(OWLDataIntersectionOf node)")
    public void shouldCreateViolationForOWLDataIntersectionOfInOWL2DLProfile() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),13029);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rjc9zaa1x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForOWLDataIntersectionOfInOWL2DLProfile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13029,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rjc9zaa1x() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(13029);
        __CLR4_5_29y89y8lvico28i.R.inc(13030);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(13031);declare(o, DATAP);
        __CLR4_5_29y89y8lvico28i.R.inc(13032);m.addAxiom(o, DataPropertyRange(DATAP, DataIntersectionOf()));
        __CLR4_5_29y89y8lvico28i.R.inc(13033);OWL2DLProfile profile = new OWL2DLProfile();
        __CLR4_5_29y89y8lvico28i.R.inc(13034);int expected = 1;
        __CLR4_5_29y89y8lvico28i.R.inc(13035);Class[] expectedViolations = { InsufficientOperands.class };
        __CLR4_5_29y89y8lvico28i.R.inc(13036);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(OWLObjectIntersectionOf node)")
    public void shouldCreateViolationForOWLObjectIntersectionOfInOWL2DLProfile() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),13037);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2sd81r9a25();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForOWLObjectIntersectionOfInOWL2DLProfile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13037,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2sd81r9a25() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(13037);
        __CLR4_5_29y89y8lvico28i.R.inc(13038);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(13039);declare(o, OP);
        __CLR4_5_29y89y8lvico28i.R.inc(13040);m.addAxiom(o, ObjectPropertyRange(OP, ObjectIntersectionOf()));
        __CLR4_5_29y89y8lvico28i.R.inc(13041);OWL2DLProfile profile = new OWL2DLProfile();
        __CLR4_5_29y89y8lvico28i.R.inc(13042);int expected = 1;
        __CLR4_5_29y89y8lvico28i.R.inc(13043);Class[] expectedViolations = { InsufficientOperands.class };
        __CLR4_5_29y89y8lvico28i.R.inc(13044);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(OWLObjectOneOf node)")
    public void shouldCreateViolationForOWLObjectOneOfInOWL2DLProfile() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),13045);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2chb9uwa2d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForOWLObjectOneOfInOWL2DLProfile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13045,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2chb9uwa2d() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(13045);
        __CLR4_5_29y89y8lvico28i.R.inc(13046);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(13047);declare(o, OP);
        __CLR4_5_29y89y8lvico28i.R.inc(13048);m.addAxiom(o, ObjectPropertyRange(OP, ObjectOneOf()));
        __CLR4_5_29y89y8lvico28i.R.inc(13049);OWL2DLProfile profile = new OWL2DLProfile();
        __CLR4_5_29y89y8lvico28i.R.inc(13050);int expected = 1;
        __CLR4_5_29y89y8lvico28i.R.inc(13051);Class[] expectedViolations = { EmptyOneOfAxiom.class };
        __CLR4_5_29y89y8lvico28i.R.inc(13052);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(OWLObjectUnionOf node)")
    public void shouldCreateViolationForOWLObjectUnionOfInOWL2DLProfile() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),13053);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hgtz7la2l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForOWLObjectUnionOfInOWL2DLProfile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13053,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hgtz7la2l() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(13053);
        __CLR4_5_29y89y8lvico28i.R.inc(13054);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(13055);declare(o, OP);
        __CLR4_5_29y89y8lvico28i.R.inc(13056);m.addAxiom(o, ObjectPropertyRange(OP, ObjectUnionOf()));
        __CLR4_5_29y89y8lvico28i.R.inc(13057);OWL2DLProfile profile = new OWL2DLProfile();
        __CLR4_5_29y89y8lvico28i.R.inc(13058);int expected = 1;
        __CLR4_5_29y89y8lvico28i.R.inc(13059);Class[] expectedViolations = { InsufficientOperands.class };
        __CLR4_5_29y89y8lvico28i.R.inc(13060);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(OWLEquivalentClassesAxiom node)")
    public void shouldCreateViolationForOWLEquivalentClassesAxiomInOWL2DLProfile() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),13061);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rafrioa2t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForOWLEquivalentClassesAxiomInOWL2DLProfile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13061,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rafrioa2t() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(13061);
        __CLR4_5_29y89y8lvico28i.R.inc(13062);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(13063);declare(o, OP);
        __CLR4_5_29y89y8lvico28i.R.inc(13064);m.addAxiom(o, EquivalentClasses());
        __CLR4_5_29y89y8lvico28i.R.inc(13065);OWL2DLProfile profile = new OWL2DLProfile();
        __CLR4_5_29y89y8lvico28i.R.inc(13066);int expected = 1;
        __CLR4_5_29y89y8lvico28i.R.inc(13067);Class[] expectedViolations = { InsufficientOperands.class };
        __CLR4_5_29y89y8lvico28i.R.inc(13068);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(OWLDisjointClassesAxiom node)")
    public void shouldCreateViolationForOWLDisjointClassesAxiomInOWL2DLProfile() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),13069);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mww8eaa31();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForOWLDisjointClassesAxiomInOWL2DLProfile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13069,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mww8eaa31() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(13069);
        __CLR4_5_29y89y8lvico28i.R.inc(13070);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(13071);declare(o, OP);
        __CLR4_5_29y89y8lvico28i.R.inc(13072);m.addAxiom(o, DisjointClasses());
        __CLR4_5_29y89y8lvico28i.R.inc(13073);OWL2DLProfile profile = new OWL2DLProfile();
        __CLR4_5_29y89y8lvico28i.R.inc(13074);int expected = 1;
        __CLR4_5_29y89y8lvico28i.R.inc(13075);Class[] expectedViolations = { InsufficientOperands.class };
        __CLR4_5_29y89y8lvico28i.R.inc(13076);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(OWLDisjointUnionAxiom node)")
    public void shouldCreateViolationForOWLDisjointUnionAxiomInOWL2DLProfile() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),13077);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mqjh6ha39();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForOWLDisjointUnionAxiomInOWL2DLProfile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13077,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mqjh6ha39() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(13077);
        __CLR4_5_29y89y8lvico28i.R.inc(13078);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(13079);declare(o, OP);
        __CLR4_5_29y89y8lvico28i.R.inc(13080);OWLClass otherfakeclass = Class(IRI("urn:test#otherfakeclass"));
        __CLR4_5_29y89y8lvico28i.R.inc(13081);declare(o, CL);
        __CLR4_5_29y89y8lvico28i.R.inc(13082);declare(o, otherfakeclass);
        __CLR4_5_29y89y8lvico28i.R.inc(13083);m.addAxiom(o, DisjointUnion(CL, otherfakeclass));
        __CLR4_5_29y89y8lvico28i.R.inc(13084);OWL2DLProfile profile = new OWL2DLProfile();
        __CLR4_5_29y89y8lvico28i.R.inc(13085);int expected = 1;
        __CLR4_5_29y89y8lvico28i.R.inc(13086);Class[] expectedViolations = { InsufficientOperands.class };
        __CLR4_5_29y89y8lvico28i.R.inc(13087);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(OWLEquivalentObjectPropertiesAxiom node)")
    public void shouldCreateViolationForOWLEquivalentObjectPropertiesAxiomInOWL2DLProfile() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),13088);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_281qrn2a3k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForOWLEquivalentObjectPropertiesAxiomInOWL2DLProfile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13088,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_281qrn2a3k() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(13088);
        __CLR4_5_29y89y8lvico28i.R.inc(13089);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(13090);m.addAxiom(o, EquivalentObjectProperties());
        __CLR4_5_29y89y8lvico28i.R.inc(13091);OWL2DLProfile profile = new OWL2DLProfile();
        __CLR4_5_29y89y8lvico28i.R.inc(13092);int expected = 1;
        __CLR4_5_29y89y8lvico28i.R.inc(13093);Class[] expectedViolations = { InsufficientPropertyExpressions.class };
        __CLR4_5_29y89y8lvico28i.R.inc(13094);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(OWLDisjointDataPropertiesAxiom node)")
    public void shouldCreateViolationForOWLDisjointDataPropertiesAxiomInOWL2DLProfile() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),13095);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2oh7ci9a3r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForOWLDisjointDataPropertiesAxiomInOWL2DLProfile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13095,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2oh7ci9a3r() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(13095);
        __CLR4_5_29y89y8lvico28i.R.inc(13096);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(13097);m.addAxiom(o, DisjointDataProperties());
        __CLR4_5_29y89y8lvico28i.R.inc(13098);OWL2DLProfile profile = new OWL2DLProfile();
        __CLR4_5_29y89y8lvico28i.R.inc(13099);int expected = 1;
        __CLR4_5_29y89y8lvico28i.R.inc(13100);Class[] expectedViolations = { InsufficientPropertyExpressions.class };
        __CLR4_5_29y89y8lvico28i.R.inc(13101);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(OWLEquivalentDataPropertiesAxiom node)")
    public void shouldCreateViolationForOWLEquivalentDataPropertiesAxiomInOWL2DLProfile() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),13102);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s0i2n7a3y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForOWLEquivalentDataPropertiesAxiomInOWL2DLProfile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13102,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s0i2n7a3y() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(13102);
        __CLR4_5_29y89y8lvico28i.R.inc(13103);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(13104);m.addAxiom(o, EquivalentDataProperties());
        __CLR4_5_29y89y8lvico28i.R.inc(13105);OWL2DLProfile profile = new OWL2DLProfile();
        __CLR4_5_29y89y8lvico28i.R.inc(13106);int expected = 1;
        __CLR4_5_29y89y8lvico28i.R.inc(13107);Class[] expectedViolations = { InsufficientPropertyExpressions.class };
        __CLR4_5_29y89y8lvico28i.R.inc(13108);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(OWLHasKeyAxiom node)")
    public void shouldCreateViolationForOWLHasKeyAxiomInOWL2DLProfile() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),13109);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2umo1ola45();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForOWLHasKeyAxiomInOWL2DLProfile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13109,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2umo1ola45() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(13109);
        __CLR4_5_29y89y8lvico28i.R.inc(13110);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(13111);declare(o, CL);
        __CLR4_5_29y89y8lvico28i.R.inc(13112);m.addAxiom(o, HasKey(CL));
        __CLR4_5_29y89y8lvico28i.R.inc(13113);OWL2DLProfile profile = new OWL2DLProfile();
        __CLR4_5_29y89y8lvico28i.R.inc(13114);int expected = 1;
        __CLR4_5_29y89y8lvico28i.R.inc(13115);Class[] expectedViolations = { InsufficientPropertyExpressions.class };
        __CLR4_5_29y89y8lvico28i.R.inc(13116);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(OWLSameIndividualAxiom node)")
    public void shouldCreateViolationForOWLSameIndividualAxiomInOWL2DLProfile() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),13117);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2r2mhyta4d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForOWLSameIndividualAxiomInOWL2DLProfile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13117,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2r2mhyta4d() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(13117);
        __CLR4_5_29y89y8lvico28i.R.inc(13118);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(13119);m.addAxiom(o, SameIndividual());
        __CLR4_5_29y89y8lvico28i.R.inc(13120);OWL2DLProfile profile = new OWL2DLProfile();
        __CLR4_5_29y89y8lvico28i.R.inc(13121);int expected = 1;
        __CLR4_5_29y89y8lvico28i.R.inc(13122);Class[] expectedViolations = { InsufficientIndividuals.class };
        __CLR4_5_29y89y8lvico28i.R.inc(13123);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(OWLDifferentIndividualsAxiom node)")
    public void shouldCreateViolationForOWLDifferentIndividualsAxiomInOWL2DLProfile() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),13124);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26uadp3a4k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForOWLDifferentIndividualsAxiomInOWL2DLProfile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13124,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26uadp3a4k() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(13124);
        __CLR4_5_29y89y8lvico28i.R.inc(13125);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(13126);m.addAxiom(o, DifferentIndividuals());
        __CLR4_5_29y89y8lvico28i.R.inc(13127);OWL2DLProfile profile = new OWL2DLProfile();
        __CLR4_5_29y89y8lvico28i.R.inc(13128);int expected = 1;
        __CLR4_5_29y89y8lvico28i.R.inc(13129);Class[] expectedViolations = { InsufficientIndividuals.class };
        __CLR4_5_29y89y8lvico28i.R.inc(13130);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(OWLNamedIndividual individual)")
    public void shouldCreateViolationForOWLNamedIndividualInOWL2DLProfile() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),13131);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28nop7wa4r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForOWLNamedIndividualInOWL2DLProfile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13131,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28nop7wa4r() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(13131);
        __CLR4_5_29y89y8lvico28i.R.inc(13132);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(13133);m.addAxiom(o, ClassAssertion(OWLThing(), NamedIndividual(IRI(START + 'i'))));
        __CLR4_5_29y89y8lvico28i.R.inc(13134);OWL2DLProfile profile = new OWL2DLProfile();
        __CLR4_5_29y89y8lvico28i.R.inc(13135);int expected = 1;
        __CLR4_5_29y89y8lvico28i.R.inc(13136);Class[] expectedViolations = { UseOfReservedVocabularyForIndividualIRI.class };
        __CLR4_5_29y89y8lvico28i.R.inc(13137);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(OWLSubDataPropertyOfAxiom axiom)")
    public void shouldCreateViolationForOWLSubDataPropertyOfAxiomInOWL2DLProfile() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),13138);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2b9c4h6a4y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForOWLSubDataPropertyOfAxiomInOWL2DLProfile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13138,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2b9c4h6a4y() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(13138);
        __CLR4_5_29y89y8lvico28i.R.inc(13139);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(13140);m.addAxiom(o, SubDataPropertyOf(DF.getOWLTopDataProperty(), DF.getOWLTopDataProperty()));
        __CLR4_5_29y89y8lvico28i.R.inc(13141);OWL2DLProfile profile = new OWL2DLProfile();
        __CLR4_5_29y89y8lvico28i.R.inc(13142);int expected = 1;
        __CLR4_5_29y89y8lvico28i.R.inc(13143);Class[] expectedViolations = { UseOfTopDataPropertyAsSubPropertyInSubPropertyAxiom.class };
        __CLR4_5_29y89y8lvico28i.R.inc(13144);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(OWLObjectMinCardinality desc)")
    public void shouldCreateViolationForOWLObjectMinCardinalityInOWL2DLProfile() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),13145);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2t2ey4pa55();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForOWLObjectMinCardinalityInOWL2DLProfile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13145,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2t2ey4pa55() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(13145);
        __CLR4_5_29y89y8lvico28i.R.inc(13146);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(13147);declare(o, OP, CL);
        __CLR4_5_29y89y8lvico28i.R.inc(13148);m.addAxiom(o, TransitiveObjectProperty(OP));
        __CLR4_5_29y89y8lvico28i.R.inc(13149);m.addAxiom(o, SubClassOf(CL, ObjectMinCardinality(1, OP, OWLThing())));
        __CLR4_5_29y89y8lvico28i.R.inc(13150);OWL2DLProfile profile = new OWL2DLProfile();
        __CLR4_5_29y89y8lvico28i.R.inc(13151);int expected = 1;
        __CLR4_5_29y89y8lvico28i.R.inc(13152);Class[] expectedViolations = { UseOfNonSimplePropertyInCardinalityRestriction.class };
        __CLR4_5_29y89y8lvico28i.R.inc(13153);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(OWLObjectMaxCardinality desc)")
    public void shouldCreateViolationForOWLObjectMaxCardinalityInOWL2DLProfile() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),13154);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2y9yc2ja5e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForOWLObjectMaxCardinalityInOWL2DLProfile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13154,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2y9yc2ja5e() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(13154);
        __CLR4_5_29y89y8lvico28i.R.inc(13155);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(13156);declare(o, OP, CL);
        __CLR4_5_29y89y8lvico28i.R.inc(13157);m.addAxiom(o, TransitiveObjectProperty(OP));
        __CLR4_5_29y89y8lvico28i.R.inc(13158);m.addAxiom(o, SubClassOf(CL, ObjectMaxCardinality(1, OP, OWLThing())));
        __CLR4_5_29y89y8lvico28i.R.inc(13159);OWL2DLProfile profile = new OWL2DLProfile();
        __CLR4_5_29y89y8lvico28i.R.inc(13160);int expected = 1;
        __CLR4_5_29y89y8lvico28i.R.inc(13161);Class[] expectedViolations = { UseOfNonSimplePropertyInCardinalityRestriction.class };
        __CLR4_5_29y89y8lvico28i.R.inc(13162);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(OWLObjectExactCardinality desc)")
    public void shouldCreateViolationForOWLObjectExactCardinalityInOWL2DLProfile() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),13163);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a06q6ua5n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForOWLObjectExactCardinalityInOWL2DLProfile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13163,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a06q6ua5n() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(13163);
        __CLR4_5_29y89y8lvico28i.R.inc(13164);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(13165);declare(o, OP, CL);
        __CLR4_5_29y89y8lvico28i.R.inc(13166);m.addAxiom(o, TransitiveObjectProperty(OP));
        __CLR4_5_29y89y8lvico28i.R.inc(13167);m.addAxiom(o, SubClassOf(CL, ObjectExactCardinality(1, OP, OWLThing())));
        __CLR4_5_29y89y8lvico28i.R.inc(13168);OWL2DLProfile profile = new OWL2DLProfile();
        __CLR4_5_29y89y8lvico28i.R.inc(13169);int expected = 1;
        __CLR4_5_29y89y8lvico28i.R.inc(13170);Class[] expectedViolations = { UseOfNonSimplePropertyInCardinalityRestriction.class };
        __CLR4_5_29y89y8lvico28i.R.inc(13171);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(OWLObjectHasSelf desc)")
    public void shouldCreateViolationForOWLObjectHasSelfInOWL2DLProfile() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),13172);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2r2z8n3a5w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForOWLObjectHasSelfInOWL2DLProfile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13172,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2r2z8n3a5w() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(13172);
        __CLR4_5_29y89y8lvico28i.R.inc(13173);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(13174);declare(o, OP);
        __CLR4_5_29y89y8lvico28i.R.inc(13175);m.addAxiom(o, TransitiveObjectProperty(OP));
        __CLR4_5_29y89y8lvico28i.R.inc(13176);m.addAxiom(o, ObjectPropertyRange(OP, ObjectHasSelf(OP)));
        __CLR4_5_29y89y8lvico28i.R.inc(13177);OWL2DLProfile profile = new OWL2DLProfile();
        __CLR4_5_29y89y8lvico28i.R.inc(13178);int expected = 1;
        __CLR4_5_29y89y8lvico28i.R.inc(13179);Class[] expectedViolations = { UseOfNonSimplePropertyInObjectHasSelf.class };
        __CLR4_5_29y89y8lvico28i.R.inc(13180);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(OWLFunctionalObjectPropertyAxiom axiom)")
    public void shouldCreateViolationForOWLFunctionalObjectPropertyAxiomInOWL2DLProfile() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),13181);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24jv6mra65();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForOWLFunctionalObjectPropertyAxiomInOWL2DLProfile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13181,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24jv6mra65() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(13181);
        __CLR4_5_29y89y8lvico28i.R.inc(13182);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(13183);declare(o, OP);
        __CLR4_5_29y89y8lvico28i.R.inc(13184);m.addAxiom(o, TransitiveObjectProperty(OP));
        __CLR4_5_29y89y8lvico28i.R.inc(13185);m.addAxiom(o, FunctionalObjectProperty(OP));
        __CLR4_5_29y89y8lvico28i.R.inc(13186);OWL2DLProfile profile = new OWL2DLProfile();
        __CLR4_5_29y89y8lvico28i.R.inc(13187);int expected = 1;
        __CLR4_5_29y89y8lvico28i.R.inc(13188);Class[] expectedViolations = { UseOfNonSimplePropertyInFunctionalPropertyAxiom.class };
        __CLR4_5_29y89y8lvico28i.R.inc(13189);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(OWLInverseFunctionalObjectPropertyAxiom axiom)")
    public void shouldCreateViolationForOWLInverseFunctionalObjectPropertyAxiomInOWL2DLProfile() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),13190);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_244efaza6e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForOWLInverseFunctionalObjectPropertyAxiomInOWL2DLProfile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13190,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_244efaza6e() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(13190);
        __CLR4_5_29y89y8lvico28i.R.inc(13191);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(13192);declare(o, OP);
        __CLR4_5_29y89y8lvico28i.R.inc(13193);m.addAxiom(o, TransitiveObjectProperty(OP));
        __CLR4_5_29y89y8lvico28i.R.inc(13194);m.addAxiom(o, InverseFunctionalObjectProperty(OP));
        __CLR4_5_29y89y8lvico28i.R.inc(13195);OWL2DLProfile profile = new OWL2DLProfile();
        __CLR4_5_29y89y8lvico28i.R.inc(13196);int expected = 1;
        __CLR4_5_29y89y8lvico28i.R.inc(13197);Class[] expectedViolations = { UseOfNonSimplePropertyInInverseFunctionalObjectPropertyAxiom.class };
        __CLR4_5_29y89y8lvico28i.R.inc(13198);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(OWLIrreflexiveObjectPropertyAxiom axiom)")
    public void shouldCreateViolationForOWLIrreflexiveObjectPropertyAxiomInOWL2DLProfile() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),13199);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lcb91na6n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForOWLIrreflexiveObjectPropertyAxiomInOWL2DLProfile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13199,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lcb91na6n() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(13199);
        __CLR4_5_29y89y8lvico28i.R.inc(13200);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(13201);declare(o, OP);
        __CLR4_5_29y89y8lvico28i.R.inc(13202);m.addAxiom(o, TransitiveObjectProperty(OP));
        __CLR4_5_29y89y8lvico28i.R.inc(13203);m.addAxiom(o, IrreflexiveObjectProperty(OP));
        __CLR4_5_29y89y8lvico28i.R.inc(13204);OWL2DLProfile profile = new OWL2DLProfile();
        __CLR4_5_29y89y8lvico28i.R.inc(13205);int expected = 1;
        __CLR4_5_29y89y8lvico28i.R.inc(13206);Class[] expectedViolations = { UseOfNonSimplePropertyInIrreflexivePropertyAxiom.class };
        __CLR4_5_29y89y8lvico28i.R.inc(13207);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(OWLAsymmetricObjectPropertyAxiom axiom)")
    public void shouldCreateViolationForOWLAsymmetricObjectPropertyAxiomInOWL2DLProfile() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),13208);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ugobr4a6w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForOWLAsymmetricObjectPropertyAxiomInOWL2DLProfile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13208,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ugobr4a6w() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(13208);
        __CLR4_5_29y89y8lvico28i.R.inc(13209);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(13210);declare(o, OP);
        __CLR4_5_29y89y8lvico28i.R.inc(13211);m.addAxiom(o, TransitiveObjectProperty(OP));
        __CLR4_5_29y89y8lvico28i.R.inc(13212);m.addAxiom(o, AsymmetricObjectProperty(OP));
        __CLR4_5_29y89y8lvico28i.R.inc(13213);OWL2DLProfile profile = new OWL2DLProfile();
        __CLR4_5_29y89y8lvico28i.R.inc(13214);int expected = 1;
        __CLR4_5_29y89y8lvico28i.R.inc(13215);Class[] expectedViolations = { UseOfNonSimplePropertyInAsymmetricObjectPropertyAxiom.class };
        __CLR4_5_29y89y8lvico28i.R.inc(13216);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(OWLDisjointObjectPropertiesAxiom axiom)")
    public void shouldCreateViolationForOWLDisjointObjectPropertiesAxiomInOWL2DLProfile() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),13217);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jdtogsa75();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForOWLDisjointObjectPropertiesAxiomInOWL2DLProfile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13217,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jdtogsa75() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(13217);
        __CLR4_5_29y89y8lvico28i.R.inc(13218);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(13219);declare(o, OP);
        __CLR4_5_29y89y8lvico28i.R.inc(13220);m.addAxiom(o, TransitiveObjectProperty(OP));
        __CLR4_5_29y89y8lvico28i.R.inc(13221);m.addAxiom(o, DisjointObjectProperties(OP));
        __CLR4_5_29y89y8lvico28i.R.inc(13222);OWL2DLProfile profile = new OWL2DLProfile();
        __CLR4_5_29y89y8lvico28i.R.inc(13223);int expected = 2;
        __CLR4_5_29y89y8lvico28i.R.inc(13224);Class[] expectedViolations = { InsufficientPropertyExpressions.class,
            UseOfNonSimplePropertyInDisjointPropertiesAxiom.class };
        __CLR4_5_29y89y8lvico28i.R.inc(13225);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(OWLSubPropertyChainOfAxiom axiom)")
    public void shouldCreateViolationForOWLSubPropertyChainOfAxiomInOWL2DLProfile() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),13226);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xm7mw7a7e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForOWLSubPropertyChainOfAxiomInOWL2DLProfile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13226,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xm7mw7a7e() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(13226);
        __CLR4_5_29y89y8lvico28i.R.inc(13227);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(13228);OWLObjectProperty op1 = ObjectProperty(IRI("urn:test#op"));
        __CLR4_5_29y89y8lvico28i.R.inc(13229);declare(o, OP, op1);
        __CLR4_5_29y89y8lvico28i.R.inc(13230);m.addAxiom(o, SubPropertyChainOf(Arrays.asList(op1), OP));
        __CLR4_5_29y89y8lvico28i.R.inc(13231);m.addAxiom(o, SubPropertyChainOf(Arrays.asList(OP, op1, OP), OP));
        __CLR4_5_29y89y8lvico28i.R.inc(13232);m.addAxiom(o, SubPropertyChainOf(Arrays.asList(OP, op1), OP));
        __CLR4_5_29y89y8lvico28i.R.inc(13233);m.addAxiom(o, SubPropertyChainOf(Arrays.asList(op1, OP, op1, OP), OP));
        __CLR4_5_29y89y8lvico28i.R.inc(13234);OWL2DLProfile profile = new OWL2DLProfile();
        __CLR4_5_29y89y8lvico28i.R.inc(13235);int expected = 4;
        __CLR4_5_29y89y8lvico28i.R.inc(13236);Class[] expectedViolations = { InsufficientPropertyExpressions.class, UseOfPropertyInChainCausesCycle.class,
            UseOfPropertyInChainCausesCycle.class, UseOfPropertyInChainCausesCycle.class };
        __CLR4_5_29y89y8lvico28i.R.inc(13237);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    // With the change in OWLOntologyID to stop use of relative IRIs, this test is no longer applicable. A warning will be logged.
    // @Test
    @Tests(method = "public Object visit(OWLOntology ont)")
    public void shouldCreateViolationForOWLOntologyInOWL2Profile() throws Exception {try{__CLR4_5_29y89y8lvico28i.R.inc(13238);
        __CLR4_5_29y89y8lvico28i.R.inc(13239);OWLOntology o = m.createOntology(new OWLOntologyID(Optional.of(IRI("test")), Optional.of(IRI("test1"))));
        __CLR4_5_29y89y8lvico28i.R.inc(13240);OWL2Profile profile = new OWL2Profile();
        __CLR4_5_29y89y8lvico28i.R.inc(13241);int expected = 2;
        __CLR4_5_29y89y8lvico28i.R.inc(13242);Class[] expectedViolations = { OntologyIRINotAbsolute.class, OntologyVersionIRINotAbsolute.class };
        __CLR4_5_29y89y8lvico28i.R.inc(13243);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(IRI iri)")
    public void shouldCreateViolationForIRIInOWL2Profile() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),13244);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2j35v8wa7w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForIRIInOWL2Profile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13244,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2j35v8wa7w() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(13244);
        __CLR4_5_29y89y8lvico28i.R.inc(13245);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(13246);declare(o, Class(IRI("test")));
        __CLR4_5_29y89y8lvico28i.R.inc(13247);OWL2Profile profile = new OWL2Profile();
        __CLR4_5_29y89y8lvico28i.R.inc(13248);int expected = 1;
        __CLR4_5_29y89y8lvico28i.R.inc(13249);Class[] expectedViolations = { UseOfNonAbsoluteIRI.class };
        __CLR4_5_29y89y8lvico28i.R.inc(13250);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(OWLLiteral node)")
    public void shouldCreateViolationForOWLLiteralInOWL2Profile() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),13251);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_294ukbla83();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForOWLLiteralInOWL2Profile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13251,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_294ukbla83() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(13251);
        __CLR4_5_29y89y8lvico28i.R.inc(13252);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(13253);declare(o, DATAP);
        __CLR4_5_29y89y8lvico28i.R.inc(13254);m.addAxiom(o, DataPropertyAssertion(DATAP, AnonymousIndividual(), Literal("wrong", OWL2Datatype.XSD_INTEGER)));
        __CLR4_5_29y89y8lvico28i.R.inc(13255);OWL2Profile profile = new OWL2Profile();
        __CLR4_5_29y89y8lvico28i.R.inc(13256);int expected = 1;
        __CLR4_5_29y89y8lvico28i.R.inc(13257);Class[] expectedViolations = { LexicalNotInLexicalSpace.class };
        __CLR4_5_29y89y8lvico28i.R.inc(13258);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(OWLDatatypeRestriction node)")
    public void shouldCreateViolationForOWLDatatypeRestrictionInOWL2Profile() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),13259);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27wfebqa8b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForOWLDatatypeRestrictionInOWL2Profile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13259,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27wfebqa8b() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(13259);
        __CLR4_5_29y89y8lvico28i.R.inc(13260);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(13261);declare(o, DATAP);
        __CLR4_5_29y89y8lvico28i.R.inc(13262);m.addAxiom(o, DatatypeDefinition(Integer(), Boolean()));
        __CLR4_5_29y89y8lvico28i.R.inc(13263);m.addAxiom(o, DATA_PROPERTY_RANGE2);
        __CLR4_5_29y89y8lvico28i.R.inc(13264);OWL2Profile profile = new OWL2Profile();
        __CLR4_5_29y89y8lvico28i.R.inc(13265);int expected = 3;
        __CLR4_5_29y89y8lvico28i.R.inc(13266);Class[] expectedViolations = { UseOfDefinedDatatypeInDatatypeRestriction.class,
            UseOfIllegalFacetRestriction.class, UseOfUndeclaredDatatype.class };
        __CLR4_5_29y89y8lvico28i.R.inc(13267);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(OWLDatatypeDefinitionAxiom axiom)")
    public void shouldCreateViolationForOWLDatatypeDefinitionAxiomInOWL2Profile() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),13268);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29gjhita8k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForOWLDatatypeDefinitionAxiomInOWL2Profile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13268,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29gjhita8k() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(13268);
        __CLR4_5_29y89y8lvico28i.R.inc(13269);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(13270);m.addAxiom(o, DatatypeDefinition(FAKEDATATYPE, Boolean()));
        __CLR4_5_29y89y8lvico28i.R.inc(13271);OWL2Profile profile = new OWL2Profile();
        __CLR4_5_29y89y8lvico28i.R.inc(13272);int expected = 1;
        __CLR4_5_29y89y8lvico28i.R.inc(13273);Class[] expectedViolations = { UseOfUndeclaredDatatype.class };
        __CLR4_5_29y89y8lvico28i.R.inc(13274);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(OWLDatatype node)")
    public void shouldCreateViolationForOWLDatatypeInOWL2ELProfile() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),13275);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lqi2ina8r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForOWLDatatypeInOWL2ELProfile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13275,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lqi2ina8r() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(13275);
        __CLR4_5_29y89y8lvico28i.R.inc(13276);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(13277);declare(o, Boolean());
        __CLR4_5_29y89y8lvico28i.R.inc(13278);OWL2ELProfile profile = new OWL2ELProfile();
        __CLR4_5_29y89y8lvico28i.R.inc(13279);int expected = 0;
        __CLR4_5_29y89y8lvico28i.R.inc(13280);Class[] expectedViolations = {};
        __CLR4_5_29y89y8lvico28i.R.inc(13281);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(OWLAnonymousIndividual individual)")
    public void shouldCreateViolationForOWLAnonymousIndividualInOWL2ELProfile() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),13282);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cmnblta8y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForOWLAnonymousIndividualInOWL2ELProfile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13282,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cmnblta8y() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(13282);
        __CLR4_5_29y89y8lvico28i.R.inc(13283);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(13284);m.addAxiom(o, ClassAssertion(OWLThing(), DF.getOWLAnonymousIndividual()));
        __CLR4_5_29y89y8lvico28i.R.inc(13285);OWL2ELProfile profile = new OWL2ELProfile();
        __CLR4_5_29y89y8lvico28i.R.inc(13286);int expected = 1;
        __CLR4_5_29y89y8lvico28i.R.inc(13287);Class[] expectedViolations = { UseOfAnonymousIndividual.class };
        __CLR4_5_29y89y8lvico28i.R.inc(13288);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(OWLObjectInverseOf property)")
    public void shouldCreateViolationForOWLObjectInverseOfInOWL2ELProfile() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),13289);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2t28cvza95();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForOWLObjectInverseOfInOWL2ELProfile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13289,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2t28cvza95() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(13289);
        __CLR4_5_29y89y8lvico28i.R.inc(13290);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(13291);declare(o, OP);
        __CLR4_5_29y89y8lvico28i.R.inc(13292);m.addAxiom(o, SubObjectPropertyOf(OP, ObjectInverseOf(OP)));
        __CLR4_5_29y89y8lvico28i.R.inc(13293);OWL2ELProfile profile = new OWL2ELProfile();
        __CLR4_5_29y89y8lvico28i.R.inc(13294);int expected = 1;
        __CLR4_5_29y89y8lvico28i.R.inc(13295);Class[] expectedViolations = { UseOfObjectPropertyInverse.class };
        __CLR4_5_29y89y8lvico28i.R.inc(13296);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(OWLDataAllValuesFrom desc)")
    public void shouldCreateViolationForOWLDataAllValuesFromInOWL2ELProfile() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),13297);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jxand0a9d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForOWLDataAllValuesFromInOWL2ELProfile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13297,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jxand0a9d() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(13297);
        __CLR4_5_29y89y8lvico28i.R.inc(13298);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(13299);declare(o, DATAP, CL);
        __CLR4_5_29y89y8lvico28i.R.inc(13300);m.addAxiom(o, SubClassOf(CL, DataAllValuesFrom(DATAP, Integer())));
        __CLR4_5_29y89y8lvico28i.R.inc(13301);OWL2ELProfile profile = new OWL2ELProfile();
        __CLR4_5_29y89y8lvico28i.R.inc(13302);int expected = 1;
        __CLR4_5_29y89y8lvico28i.R.inc(13303);Class[] expectedViolations = { UseOfIllegalClassExpression.class };
        __CLR4_5_29y89y8lvico28i.R.inc(13304);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(OWLDataExactCardinality desc)")
    public void shouldCreateViolationForOWLDataExactCardinalityInOWL2ELProfile() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),13305);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21kdmbwa9l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForOWLDataExactCardinalityInOWL2ELProfile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13305,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21kdmbwa9l() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(13305);
        __CLR4_5_29y89y8lvico28i.R.inc(13306);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(13307);declare(o, DATAP, CL, Integer());
        __CLR4_5_29y89y8lvico28i.R.inc(13308);m.addAxiom(o, SubClassOf(CL, DataExactCardinality(1, DATAP, Integer())));
        __CLR4_5_29y89y8lvico28i.R.inc(13309);OWL2ELProfile profile = new OWL2ELProfile();
        __CLR4_5_29y89y8lvico28i.R.inc(13310);int expected = 1;
        __CLR4_5_29y89y8lvico28i.R.inc(13311);Class[] expectedViolations = { UseOfIllegalClassExpression.class };
        __CLR4_5_29y89y8lvico28i.R.inc(13312);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(OWLDataMaxCardinality desc)")
    public void shouldCreateViolationForOWLDataMaxCardinalityInOWL2ELProfile() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),13313);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_254z9pra9t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForOWLDataMaxCardinalityInOWL2ELProfile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13313,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_254z9pra9t() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(13313);
        __CLR4_5_29y89y8lvico28i.R.inc(13314);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(13315);declare(o, DATAP, CL, Integer());
        __CLR4_5_29y89y8lvico28i.R.inc(13316);m.addAxiom(o, SubClassOf(CL, DataMaxCardinality(1, DATAP, Integer())));
        __CLR4_5_29y89y8lvico28i.R.inc(13317);OWL2ELProfile profile = new OWL2ELProfile();
        __CLR4_5_29y89y8lvico28i.R.inc(13318);int expected = 1;
        __CLR4_5_29y89y8lvico28i.R.inc(13319);Class[] expectedViolations = { UseOfIllegalClassExpression.class };
        __CLR4_5_29y89y8lvico28i.R.inc(13320);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(OWLDataMinCardinality desc)")
    public void shouldCreateViolationForOWLDataMinCardinalityInOWL2ELProfile() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),13321);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2acinnlaa1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForOWLDataMinCardinalityInOWL2ELProfile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13321,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2acinnlaa1() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(13321);
        __CLR4_5_29y89y8lvico28i.R.inc(13322);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(13323);declare(o, DATAP, CL, Integer());
        __CLR4_5_29y89y8lvico28i.R.inc(13324);m.addAxiom(o, SubClassOf(CL, DataMinCardinality(1, DATAP, Integer())));
        __CLR4_5_29y89y8lvico28i.R.inc(13325);OWL2ELProfile profile = new OWL2ELProfile();
        __CLR4_5_29y89y8lvico28i.R.inc(13326);int expected = 1;
        __CLR4_5_29y89y8lvico28i.R.inc(13327);Class[] expectedViolations = { UseOfIllegalClassExpression.class };
        __CLR4_5_29y89y8lvico28i.R.inc(13328);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(OWLObjectAllValuesFrom desc)")
    public void shouldCreateViolationForOWLObjectAllValuesFromInOWL2ELProfile() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),13329);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2soia6faa9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForOWLObjectAllValuesFromInOWL2ELProfile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13329,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2soia6faa9() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(13329);
        __CLR4_5_29y89y8lvico28i.R.inc(13330);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(13331);declare(o, OP, CL);
        __CLR4_5_29y89y8lvico28i.R.inc(13332);m.addAxiom(o, SubClassOf(CL, ObjectAllValuesFrom(OP, OWLThing())));
        __CLR4_5_29y89y8lvico28i.R.inc(13333);OWL2ELProfile profile = new OWL2ELProfile();
        __CLR4_5_29y89y8lvico28i.R.inc(13334);int expected = 1;
        __CLR4_5_29y89y8lvico28i.R.inc(13335);Class[] expectedViolations = { UseOfIllegalClassExpression.class };
        __CLR4_5_29y89y8lvico28i.R.inc(13336);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(OWLObjectComplementOf desc)")
    public void shouldCreateViolationForOWLObjectComplementOfInOWL2ELProfile() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),13337);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2c380o9aah();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForOWLObjectComplementOfInOWL2ELProfile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13337,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2c380o9aah() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(13337);
        __CLR4_5_29y89y8lvico28i.R.inc(13338);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(13339);declare(o, OP);
        __CLR4_5_29y89y8lvico28i.R.inc(13340);m.addAxiom(o, ObjectPropertyRange(OP, ObjectComplementOf(OWLNothing())));
        __CLR4_5_29y89y8lvico28i.R.inc(13341);OWL2ELProfile profile = new OWL2ELProfile();
        __CLR4_5_29y89y8lvico28i.R.inc(13342);int expected = 1;
        __CLR4_5_29y89y8lvico28i.R.inc(13343);Class[] expectedViolations = { UseOfIllegalClassExpression.class };
        __CLR4_5_29y89y8lvico28i.R.inc(13344);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(OWLObjectExactCardinality desc)")
    public void shouldCreateViolationForOWLObjectExactCardinalityInOWL2ELProfile() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),13345);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qhtg53aap();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForOWLObjectExactCardinalityInOWL2ELProfile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13345,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qhtg53aap() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(13345);
        __CLR4_5_29y89y8lvico28i.R.inc(13346);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(13347);declare(o, OP, CL);
        __CLR4_5_29y89y8lvico28i.R.inc(13348);m.addAxiom(o, SubClassOf(CL, ObjectExactCardinality(1, OP, OWLThing())));
        __CLR4_5_29y89y8lvico28i.R.inc(13349);OWL2ELProfile profile = new OWL2ELProfile();
        __CLR4_5_29y89y8lvico28i.R.inc(13350);int expected = 1;
        __CLR4_5_29y89y8lvico28i.R.inc(13351);Class[] expectedViolations = { UseOfIllegalClassExpression.class };
        __CLR4_5_29y89y8lvico28i.R.inc(13352);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(OWLObjectMaxCardinality desc)")
    public void shouldCreateViolationForOWLObjectMaxCardinalityInOWL2ELProfile() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),13353);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2k9izycaax();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForOWLObjectMaxCardinalityInOWL2ELProfile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13353,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2k9izycaax() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(13353);
        __CLR4_5_29y89y8lvico28i.R.inc(13354);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(13355);declare(o, OP, CL);
        __CLR4_5_29y89y8lvico28i.R.inc(13356);m.addAxiom(o, SubClassOf(CL, ObjectMaxCardinality(1, OP, OWLThing())));
        __CLR4_5_29y89y8lvico28i.R.inc(13357);OWL2ELProfile profile = new OWL2ELProfile();
        __CLR4_5_29y89y8lvico28i.R.inc(13358);int expected = 1;
        __CLR4_5_29y89y8lvico28i.R.inc(13359);Class[] expectedViolations = { UseOfIllegalClassExpression.class };
        __CLR4_5_29y89y8lvico28i.R.inc(13360);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(OWLObjectMinCardinality desc)")
    public void shouldCreateViolationForOWLObjectMinCardinalityInOWL2ELProfile() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),13361);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ph2dw6ab5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForOWLObjectMinCardinalityInOWL2ELProfile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13361,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ph2dw6ab5() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(13361);
        __CLR4_5_29y89y8lvico28i.R.inc(13362);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(13363);declare(o, OP, CL);
        __CLR4_5_29y89y8lvico28i.R.inc(13364);m.addAxiom(o, SubClassOf(CL, ObjectMinCardinality(1, OP, OWLThing())));
        __CLR4_5_29y89y8lvico28i.R.inc(13365);OWL2ELProfile profile = new OWL2ELProfile();
        __CLR4_5_29y89y8lvico28i.R.inc(13366);int expected = 1;
        __CLR4_5_29y89y8lvico28i.R.inc(13367);Class[] expectedViolations = { UseOfIllegalClassExpression.class };
        __CLR4_5_29y89y8lvico28i.R.inc(13368);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(OWLObjectOneOf desc)")
    public void shouldCreateViolationForOWLObjectOneOfInOWL2ELProfile() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),13369);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2syxzt5abd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForOWLObjectOneOfInOWL2ELProfile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13369,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2syxzt5abd() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(13369);
        __CLR4_5_29y89y8lvico28i.R.inc(13370);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(13371);declare(o, OP);
        __CLR4_5_29y89y8lvico28i.R.inc(13372);m.addAxiom(o, ObjectPropertyRange(OP, ObjectOneOf(NamedIndividual(IRI("urn:test#i1")), NamedIndividual(IRI(
            "urn:test#i2")))));
        __CLR4_5_29y89y8lvico28i.R.inc(13373);OWL2ELProfile profile = new OWL2ELProfile();
        __CLR4_5_29y89y8lvico28i.R.inc(13374);int expected = 1;
        __CLR4_5_29y89y8lvico28i.R.inc(13375);Class[] expectedViolations = { UseOfObjectOneOfWithMultipleIndividuals.class };
        __CLR4_5_29y89y8lvico28i.R.inc(13376);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(OWLObjectUnionOf desc)")
    public void shouldCreateViolationForOWLObjectUnionOfInOWL2ELProfile() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),13377);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2z799cabl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForOWLObjectUnionOfInOWL2ELProfile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13377,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2z799cabl() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(13377);
        __CLR4_5_29y89y8lvico28i.R.inc(13378);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(13379);declare(o, OP);
        __CLR4_5_29y89y8lvico28i.R.inc(13380);m.addAxiom(o, ObjectPropertyRange(OP, ObjectUnionOf(OWLThing(), OWLNothing())));
        __CLR4_5_29y89y8lvico28i.R.inc(13381);OWL2ELProfile profile = new OWL2ELProfile();
        __CLR4_5_29y89y8lvico28i.R.inc(13382);int expected = 1;
        __CLR4_5_29y89y8lvico28i.R.inc(13383);Class[] expectedViolations = { UseOfIllegalClassExpression.class };
        __CLR4_5_29y89y8lvico28i.R.inc(13384);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(OWLDataComplementOf node)")
    public void shouldCreateViolationForOWLDataComplementOfInOWL2ELProfile() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),13385);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26ypwhuabt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForOWLDataComplementOfInOWL2ELProfile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13385,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26ypwhuabt() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(13385);
        __CLR4_5_29y89y8lvico28i.R.inc(13386);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(13387);declare(o, DATAP);
        __CLR4_5_29y89y8lvico28i.R.inc(13388);m.addAxiom(o, DataPropertyRange(DATAP, DataComplementOf(Double())));
        __CLR4_5_29y89y8lvico28i.R.inc(13389);OWL2ELProfile profile = new OWL2ELProfile();
        __CLR4_5_29y89y8lvico28i.R.inc(13390);int expected = 2;
        __CLR4_5_29y89y8lvico28i.R.inc(13391);Class[] expectedViolations = { UseOfIllegalDataRange.class, UseOfIllegalDataRange.class };
        __CLR4_5_29y89y8lvico28i.R.inc(13392);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(OWLDataOneOf node)")
    public void shouldCreateViolationForOWLDataOneOfInOWL2ELProfile() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),13393);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nhhl0sac1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForOWLDataOneOfInOWL2ELProfile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13393,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nhhl0sac1() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(13393);
        __CLR4_5_29y89y8lvico28i.R.inc(13394);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(13395);declare(o, DATAP);
        __CLR4_5_29y89y8lvico28i.R.inc(13396);m.addAxiom(o, DataPropertyRange(DATAP, DataOneOf(Literal(1), Literal(2))));
        __CLR4_5_29y89y8lvico28i.R.inc(13397);OWL2ELProfile profile = new OWL2ELProfile();
        __CLR4_5_29y89y8lvico28i.R.inc(13398);int expected = 1;
        __CLR4_5_29y89y8lvico28i.R.inc(13399);Class[] expectedViolations = { UseOfDataOneOfWithMultipleLiterals.class };
        __CLR4_5_29y89y8lvico28i.R.inc(13400);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(OWLDatatypeRestriction node)")
    public void shouldCreateViolationForOWLDatatypeRestrictionInOWL2ELProfile() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),13401);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2x9jtpbac9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForOWLDatatypeRestrictionInOWL2ELProfile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13401,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2x9jtpbac9() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(13401);
        __CLR4_5_29y89y8lvico28i.R.inc(13402);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(13403);declare(o, DATAP);
        __CLR4_5_29y89y8lvico28i.R.inc(13404);m.addAxiom(o, DATA_PROPERTY_RANGE);
        __CLR4_5_29y89y8lvico28i.R.inc(13405);OWL2ELProfile profile = new OWL2ELProfile();
        __CLR4_5_29y89y8lvico28i.R.inc(13406);int expected = 1;
        __CLR4_5_29y89y8lvico28i.R.inc(13407);Class[] expectedViolations = { UseOfIllegalDataRange.class };
        __CLR4_5_29y89y8lvico28i.R.inc(13408);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(OWLDataUnionOf node)")
    public void shouldCreateViolationForOWLDataUnionOfInOWL2ELProfile() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),13409);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kawmlnach();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForOWLDataUnionOfInOWL2ELProfile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13409,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kawmlnach() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(13409);
        __CLR4_5_29y89y8lvico28i.R.inc(13410);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(13411);declare(o, DATAP);
        __CLR4_5_29y89y8lvico28i.R.inc(13412);m.addAxiom(o, DataPropertyRange(DATAP, DataUnionOf(Double(), Integer())));
        __CLR4_5_29y89y8lvico28i.R.inc(13413);OWL2ELProfile profile = new OWL2ELProfile();
        __CLR4_5_29y89y8lvico28i.R.inc(13414);int expected = 2;
        __CLR4_5_29y89y8lvico28i.R.inc(13415);Class[] expectedViolations = { UseOfIllegalDataRange.class, UseOfIllegalDataRange.class };
        __CLR4_5_29y89y8lvico28i.R.inc(13416);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(OWLAsymmetricObjectPropertyAxiom axiom)")
    public void shouldCreateViolationForOWLAsymmetricObjectPropertyAxiomInOWL2ELProfile() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),13417);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2o2t09racp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForOWLAsymmetricObjectPropertyAxiomInOWL2ELProfile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13417,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2o2t09racp() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(13417);
        __CLR4_5_29y89y8lvico28i.R.inc(13418);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(13419);declare(o, OP);
        __CLR4_5_29y89y8lvico28i.R.inc(13420);m.addAxiom(o, AsymmetricObjectProperty(OP));
        __CLR4_5_29y89y8lvico28i.R.inc(13421);OWL2ELProfile profile = new OWL2ELProfile();
        __CLR4_5_29y89y8lvico28i.R.inc(13422);int expected = 1;
        __CLR4_5_29y89y8lvico28i.R.inc(13423);Class[] expectedViolations = { UseOfIllegalAxiom.class };
        __CLR4_5_29y89y8lvico28i.R.inc(13424);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(OWLDisjointDataPropertiesAxiom axiom)")
    public void shouldCreateViolationForOWLDisjointDataPropertiesAxiomInOWL2ELProfile() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),13425);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27zkmk0acx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForOWLDisjointDataPropertiesAxiomInOWL2ELProfile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13425,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27zkmk0acx() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(13425);
        __CLR4_5_29y89y8lvico28i.R.inc(13426);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(13427);OWLDataProperty dp = DataProperty(IRI("urn:test#other"));
        __CLR4_5_29y89y8lvico28i.R.inc(13428);declare(o, DATAP, dp);
        __CLR4_5_29y89y8lvico28i.R.inc(13429);m.addAxiom(o, DisjointDataProperties(DATAP, dp));
        __CLR4_5_29y89y8lvico28i.R.inc(13430);OWL2ELProfile profile = new OWL2ELProfile();
        __CLR4_5_29y89y8lvico28i.R.inc(13431);int expected = 1;
        __CLR4_5_29y89y8lvico28i.R.inc(13432);Class[] expectedViolations = { UseOfIllegalAxiom.class };
        __CLR4_5_29y89y8lvico28i.R.inc(13433);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(OWLDisjointObjectPropertiesAxiom axiom)")
    public void shouldCreateViolationForOWLDisjointObjectPropertiesAxiomInOWL2ELProfile() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),13434);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22w6yijad6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForOWLDisjointObjectPropertiesAxiomInOWL2ELProfile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13434,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22w6yijad6() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(13434);
        __CLR4_5_29y89y8lvico28i.R.inc(13435);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(13436);OWLObjectProperty op1 = ObjectProperty(IRI("urn:test#test"));
        __CLR4_5_29y89y8lvico28i.R.inc(13437);declare(o, OP, op1);
        __CLR4_5_29y89y8lvico28i.R.inc(13438);m.addAxiom(o, DisjointObjectProperties(op1, OP));
        __CLR4_5_29y89y8lvico28i.R.inc(13439);OWL2ELProfile profile = new OWL2ELProfile();
        __CLR4_5_29y89y8lvico28i.R.inc(13440);int expected = 1;
        __CLR4_5_29y89y8lvico28i.R.inc(13441);Class[] expectedViolations = { UseOfIllegalAxiom.class };
        __CLR4_5_29y89y8lvico28i.R.inc(13442);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(OWLDisjointUnionAxiom axiom)")
    public void shouldCreateViolationForOWLDisjointUnionAxiomInOWL2ELProfile() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),13443);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_268wr88adf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForOWLDisjointUnionAxiomInOWL2ELProfile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13443,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_268wr88adf() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(13443);
        __CLR4_5_29y89y8lvico28i.R.inc(13444);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(13445);declare(o, CL);
        __CLR4_5_29y89y8lvico28i.R.inc(13446);m.addAxiom(o, DisjointUnion(CL, OWLThing(), OWLNothing()));
        __CLR4_5_29y89y8lvico28i.R.inc(13447);OWL2ELProfile profile = new OWL2ELProfile();
        __CLR4_5_29y89y8lvico28i.R.inc(13448);int expected = 1;
        __CLR4_5_29y89y8lvico28i.R.inc(13449);Class[] expectedViolations = { UseOfIllegalAxiom.class };
        __CLR4_5_29y89y8lvico28i.R.inc(13450);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(OWLFunctionalObjectPropertyAxiom axiom)")
    public void shouldCreateViolationForOWLFunctionalObjectPropertyAxiomInOWL2ELProfile() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),13451);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bxrjbiadn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForOWLFunctionalObjectPropertyAxiomInOWL2ELProfile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13451,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bxrjbiadn() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(13451);
        __CLR4_5_29y89y8lvico28i.R.inc(13452);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(13453);declare(o, OP);
        __CLR4_5_29y89y8lvico28i.R.inc(13454);m.addAxiom(o, FunctionalObjectProperty(OP));
        __CLR4_5_29y89y8lvico28i.R.inc(13455);OWL2ELProfile profile = new OWL2ELProfile();
        __CLR4_5_29y89y8lvico28i.R.inc(13456);int expected = 1;
        __CLR4_5_29y89y8lvico28i.R.inc(13457);Class[] expectedViolations = { UseOfIllegalAxiom.class };
        __CLR4_5_29y89y8lvico28i.R.inc(13458);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(OWLHasKeyAxiom axiom)")
    public void shouldCreateViolationForOWLHasKeyAxiomInOWL2ELProfile() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),13459);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e51bqcadv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForOWLHasKeyAxiomInOWL2ELProfile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13459,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e51bqcadv() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(13459);
        __CLR4_5_29y89y8lvico28i.R.inc(13460);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(13461);declare(o, CL, OP);
        __CLR4_5_29y89y8lvico28i.R.inc(13462);m.addAxiom(o, HasKey(CL, OP));
        __CLR4_5_29y89y8lvico28i.R.inc(13463);OWL2ELProfile profile = new OWL2ELProfile();
        __CLR4_5_29y89y8lvico28i.R.inc(13464);int expected = 0;
        __CLR4_5_29y89y8lvico28i.R.inc(13465);Class[] expectedViolations = {};
        __CLR4_5_29y89y8lvico28i.R.inc(13466);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(OWLInverseFunctionalObjectPropertyAxiom axiom)")
    public void shouldCreateViolationForOWLInverseFunctionalObjectPropertyAxiomInOWL2ELProfile() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),13467);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2km1598ae3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForOWLInverseFunctionalObjectPropertyAxiomInOWL2ELProfile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13467,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2km1598ae3() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(13467);
        __CLR4_5_29y89y8lvico28i.R.inc(13468);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(13469);declare(o, P);
        __CLR4_5_29y89y8lvico28i.R.inc(13470);m.addAxiom(o, InverseFunctionalObjectProperty(P));
        __CLR4_5_29y89y8lvico28i.R.inc(13471);OWL2ELProfile profile = new OWL2ELProfile();
        __CLR4_5_29y89y8lvico28i.R.inc(13472);int expected = 1;
        __CLR4_5_29y89y8lvico28i.R.inc(13473);Class[] expectedViolations = { UseOfIllegalAxiom.class };
        __CLR4_5_29y89y8lvico28i.R.inc(13474);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(OWLInverseObjectPropertiesAxiom axiom)")
    public void shouldCreateViolationForOWLInverseObjectPropertiesAxiomInOWL2ELProfile() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),13475);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ho2ma1aeb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForOWLInverseObjectPropertiesAxiomInOWL2ELProfile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13475,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ho2ma1aeb() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(13475);
        __CLR4_5_29y89y8lvico28i.R.inc(13476);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(13477);declare(o, P);
        __CLR4_5_29y89y8lvico28i.R.inc(13478);OWLObjectProperty p1 = ObjectProperty(IRI("urn:test#objectproperty"));
        __CLR4_5_29y89y8lvico28i.R.inc(13479);declare(o, p1);
        __CLR4_5_29y89y8lvico28i.R.inc(13480);m.addAxiom(o, InverseObjectProperties(P, p1));
        __CLR4_5_29y89y8lvico28i.R.inc(13481);OWL2ELProfile profile = new OWL2ELProfile();
        __CLR4_5_29y89y8lvico28i.R.inc(13482);int expected = 1;
        __CLR4_5_29y89y8lvico28i.R.inc(13483);Class[] expectedViolations = { UseOfIllegalAxiom.class };
        __CLR4_5_29y89y8lvico28i.R.inc(13484);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(OWLIrreflexiveObjectPropertyAxiom axiom)")
    public void shouldCreateViolationForOWLIrreflexiveObjectPropertyAxiomInOWL2ELProfile() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),13485);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2x762z8ael();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForOWLIrreflexiveObjectPropertyAxiomInOWL2ELProfile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13485,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2x762z8ael() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(13485);
        __CLR4_5_29y89y8lvico28i.R.inc(13486);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(13487);declare(o, P);
        __CLR4_5_29y89y8lvico28i.R.inc(13488);m.addAxiom(o, IrreflexiveObjectProperty(P));
        __CLR4_5_29y89y8lvico28i.R.inc(13489);OWL2ELProfile profile = new OWL2ELProfile();
        __CLR4_5_29y89y8lvico28i.R.inc(13490);int expected = 1;
        __CLR4_5_29y89y8lvico28i.R.inc(13491);Class[] expectedViolations = { UseOfIllegalAxiom.class };
        __CLR4_5_29y89y8lvico28i.R.inc(13492);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(OWLSymmetricObjectPropertyAxiom axiom)")
    public void shouldCreateViolationForOWLSymmetricObjectPropertyAxiomInOWL2ELProfile() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),13493);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2k5olz4aet();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForOWLSymmetricObjectPropertyAxiomInOWL2ELProfile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13493,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2k5olz4aet() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(13493);
        __CLR4_5_29y89y8lvico28i.R.inc(13494);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(13495);declare(o, P);
        __CLR4_5_29y89y8lvico28i.R.inc(13496);m.addAxiom(o, SymmetricObjectProperty(P));
        __CLR4_5_29y89y8lvico28i.R.inc(13497);OWL2ELProfile profile = new OWL2ELProfile();
        __CLR4_5_29y89y8lvico28i.R.inc(13498);int expected = 1;
        __CLR4_5_29y89y8lvico28i.R.inc(13499);Class[] expectedViolations = { UseOfIllegalAxiom.class };
        __CLR4_5_29y89y8lvico28i.R.inc(13500);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(SWRLRule rule)")
    public void shouldCreateViolationForSWRLRuleInOWL2ELProfile() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),13501);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vvgtihaf1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForSWRLRuleInOWL2ELProfile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13501,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vvgtihaf1() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(13501);
        __CLR4_5_29y89y8lvico28i.R.inc(13502);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(13503);m.addAxiom(o, DF.getSWRLRule(new HashSet<SWRLAtom>(), new HashSet<SWRLAtom>()));
        __CLR4_5_29y89y8lvico28i.R.inc(13504);OWL2ELProfile profile = new OWL2ELProfile();
        __CLR4_5_29y89y8lvico28i.R.inc(13505);int expected = 1;
        __CLR4_5_29y89y8lvico28i.R.inc(13506);Class[] expectedViolations = { UseOfIllegalAxiom.class };
        __CLR4_5_29y89y8lvico28i.R.inc(13507);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(OWLSubPropertyChainOfAxiom axiom)")
    public void shouldCreateViolationForOWLSubPropertyChainOfAxiomInOWL2ELProfile() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),13508);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2h4kwxyaf8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForOWLSubPropertyChainOfAxiomInOWL2ELProfile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13508,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2h4kwxyaf8() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(13508);
        __CLR4_5_29y89y8lvico28i.R.inc(13509);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(13510);OWL2ELProfile profile = new OWL2ELProfile();
        __CLR4_5_29y89y8lvico28i.R.inc(13511);OWLObjectProperty op1 = ObjectProperty(IRI("urn:test#op1"));
        __CLR4_5_29y89y8lvico28i.R.inc(13512);OWLObjectProperty op2 = ObjectProperty(IRI("urn:test#op"));
        __CLR4_5_29y89y8lvico28i.R.inc(13513);declare(o, op1, OP, op2, CL);
        __CLR4_5_29y89y8lvico28i.R.inc(13514);m.addAxiom(o, ObjectPropertyRange(OP, CL));
        __CLR4_5_29y89y8lvico28i.R.inc(13515);List<OWLObjectProperty> asList = Arrays.asList(op2, op1);
        assert (((asList != null)&&(__CLR4_5_29y89y8lvico28i.R.iget(13516)!=0|true))||(__CLR4_5_29y89y8lvico28i.R.iget(13517)==0&false));
        __CLR4_5_29y89y8lvico28i.R.inc(13518);m.addAxiom(o, SubPropertyChainOf(asList, OP));
        __CLR4_5_29y89y8lvico28i.R.inc(13519);int expected = 1;
        __CLR4_5_29y89y8lvico28i.R.inc(13520);Class[] expectedViolations = { LastPropertyInChainNotInImposedRange.class };
        __CLR4_5_29y89y8lvico28i.R.inc(13521);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(OWLDatatype node)")
    public void shouldCreateViolationForOWLDatatypeInOWL2QLProfile() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),13522);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2y2ugy5afm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForOWLDatatypeInOWL2QLProfile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13522,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2y2ugy5afm() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(13522);
        __CLR4_5_29y89y8lvico28i.R.inc(13523);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(13524);declare(o, FAKEDATATYPE);
        __CLR4_5_29y89y8lvico28i.R.inc(13525);OWL2QLProfile profile = new OWL2QLProfile();
        __CLR4_5_29y89y8lvico28i.R.inc(13526);int expected = 0;
        __CLR4_5_29y89y8lvico28i.R.inc(13527);Class[] expectedViolations = {};
        __CLR4_5_29y89y8lvico28i.R.inc(13528);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(OWLAnonymousIndividual individual)")
    public void shouldCreateViolationForOWLAnonymousIndividualInOWL2QLProfile() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),13529);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22l46wjaft();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForOWLAnonymousIndividualInOWL2QLProfile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13529,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22l46wjaft() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(13529);
        __CLR4_5_29y89y8lvico28i.R.inc(13530);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(13531);OWL2QLProfile profile = new OWL2QLProfile();
        __CLR4_5_29y89y8lvico28i.R.inc(13532);m.addAxiom(o, ClassAssertion(OWLThing(), DF.getOWLAnonymousIndividual()));
        __CLR4_5_29y89y8lvico28i.R.inc(13533);int expected = 1;
        __CLR4_5_29y89y8lvico28i.R.inc(13534);Class[] expectedViolations = { UseOfAnonymousIndividual.class };
        __CLR4_5_29y89y8lvico28i.R.inc(13535);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(OWLHasKeyAxiom axiom)")
    public void shouldCreateViolationForOWLHasKeyAxiomInOWL2QLProfile() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),13536);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tcsu8oag0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForOWLHasKeyAxiomInOWL2QLProfile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13536,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tcsu8oag0() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(13536);
        __CLR4_5_29y89y8lvico28i.R.inc(13537);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(13538);declare(o, CL, OP);
        __CLR4_5_29y89y8lvico28i.R.inc(13539);m.addAxiom(o, HasKey(CL, OP));
        __CLR4_5_29y89y8lvico28i.R.inc(13540);OWL2QLProfile profile = new OWL2QLProfile();
        __CLR4_5_29y89y8lvico28i.R.inc(13541);int expected = 1;
        __CLR4_5_29y89y8lvico28i.R.inc(13542);Class[] expectedViolations = { UseOfIllegalAxiom.class };
        __CLR4_5_29y89y8lvico28i.R.inc(13543);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(OWLSubClassOfAxiom axiom)")
    public void shouldCreateViolationForOWLSubClassOfAxiomInOWL2QLProfile() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),13544);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2aa0p1uag8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForOWLSubClassOfAxiomInOWL2QLProfile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13544,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2aa0p1uag8() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(13544);
        __CLR4_5_29y89y8lvico28i.R.inc(13545);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(13546);declare(o, OP);
        __CLR4_5_29y89y8lvico28i.R.inc(13547);m.addAxiom(o, SubClassOf(ObjectComplementOf(OWLNothing()), ObjectUnionOf(OWLThing(), OWLNothing())));
        __CLR4_5_29y89y8lvico28i.R.inc(13548);OWL2QLProfile profile = new OWL2QLProfile();
        __CLR4_5_29y89y8lvico28i.R.inc(13549);int expected = 2;
        __CLR4_5_29y89y8lvico28i.R.inc(13550);Class[] expectedViolations = { UseOfNonSubClassExpression.class, UseOfNonSuperClassExpression.class };
        __CLR4_5_29y89y8lvico28i.R.inc(13551);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(OWLEquivalentClassesAxiom axiom)")
    public void shouldCreateViolationForOWLEquivalentClassesAxiomInOWL2QLProfile() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),13552);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2skayylagg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForOWLEquivalentClassesAxiomInOWL2QLProfile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13552,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2skayylagg() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(13552);
        __CLR4_5_29y89y8lvico28i.R.inc(13553);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(13554);m.addAxiom(o, EquivalentClasses(ObjectUnionOf(OWLNothing(), OWLThing()), OWLNothing()));
        __CLR4_5_29y89y8lvico28i.R.inc(13555);OWL2QLProfile profile = new OWL2QLProfile();
        __CLR4_5_29y89y8lvico28i.R.inc(13556);int expected = 1;
        __CLR4_5_29y89y8lvico28i.R.inc(13557);Class[] expectedViolations = { UseOfNonSubClassExpression.class };
        __CLR4_5_29y89y8lvico28i.R.inc(13558);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(OWLDisjointClassesAxiom axiom)")
    public void shouldCreateViolationForOWLDisjointClassesAxiomInOWL2QLProfile() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),13559);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ln10ydagn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForOWLDisjointClassesAxiomInOWL2QLProfile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13559,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ln10ydagn() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(13559);
        __CLR4_5_29y89y8lvico28i.R.inc(13560);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(13561);OWL2QLProfile profile = new OWL2QLProfile();
        __CLR4_5_29y89y8lvico28i.R.inc(13562);m.addAxiom(o, DisjointClasses(ObjectComplementOf(OWLThing()), OWLThing()));
        __CLR4_5_29y89y8lvico28i.R.inc(13563);int expected = 1;
        __CLR4_5_29y89y8lvico28i.R.inc(13564);Class[] expectedViolations = { UseOfNonSubClassExpression.class };
        __CLR4_5_29y89y8lvico28i.R.inc(13565);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(OWLObjectPropertyDomainAxiom axiom)")
    public void shouldCreateViolationForOWLObjectPropertyDomainAxiomInOWL2QLProfile() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),13566);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tufu2jagu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForOWLObjectPropertyDomainAxiomInOWL2QLProfile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13566,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tufu2jagu() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(13566);
        __CLR4_5_29y89y8lvico28i.R.inc(13567);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(13568);declare(o, OP);
        __CLR4_5_29y89y8lvico28i.R.inc(13569);m.addAxiom(o, ObjectPropertyDomain(OP, ObjectUnionOf(OWLNothing(), OWLThing())));
        __CLR4_5_29y89y8lvico28i.R.inc(13570);OWL2QLProfile profile = new OWL2QLProfile();
        __CLR4_5_29y89y8lvico28i.R.inc(13571);int expected = 1;
        __CLR4_5_29y89y8lvico28i.R.inc(13572);Class[] expectedViolations = { UseOfNonSuperClassExpression.class };
        __CLR4_5_29y89y8lvico28i.R.inc(13573);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(OWLObjectPropertyRangeAxiom axiom)")
    public void shouldCreateViolationForOWLObjectPropertyRangeAxiomInOWL2QLProfile() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),13574);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ay6ox6ah2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForOWLObjectPropertyRangeAxiomInOWL2QLProfile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13574,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ay6ox6ah2() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(13574);
        __CLR4_5_29y89y8lvico28i.R.inc(13575);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(13576);declare(o, OP);
        __CLR4_5_29y89y8lvico28i.R.inc(13577);m.addAxiom(o, ObjectPropertyRange(OP, ObjectUnionOf(OWLNothing(), OWLThing())));
        __CLR4_5_29y89y8lvico28i.R.inc(13578);OWL2QLProfile profile = new OWL2QLProfile();
        __CLR4_5_29y89y8lvico28i.R.inc(13579);int expected = 1;
        __CLR4_5_29y89y8lvico28i.R.inc(13580);Class[] expectedViolations = { UseOfNonSuperClassExpression.class };
        __CLR4_5_29y89y8lvico28i.R.inc(13581);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(OWLSubPropertyChainOfAxiom axiom)")
    public void shouldCreateViolationForOWLSubPropertyChainOfAxiomInOWL2QLProfile() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),13582);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wccfgaaha();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForOWLSubPropertyChainOfAxiomInOWL2QLProfile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13582,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wccfgaaha() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(13582);
        __CLR4_5_29y89y8lvico28i.R.inc(13583);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(13584);OWLObjectProperty op1 = ObjectProperty(IRI("urn:test#op"));
        __CLR4_5_29y89y8lvico28i.R.inc(13585);declare(o, OP, op1);
        __CLR4_5_29y89y8lvico28i.R.inc(13586);m.addAxiom(o, SubPropertyChainOf(Arrays.asList(OP, op1), OP));
        __CLR4_5_29y89y8lvico28i.R.inc(13587);OWL2QLProfile profile = new OWL2QLProfile();
        __CLR4_5_29y89y8lvico28i.R.inc(13588);int expected = 1;
        __CLR4_5_29y89y8lvico28i.R.inc(13589);Class[] expectedViolations = { UseOfIllegalAxiom.class };
        __CLR4_5_29y89y8lvico28i.R.inc(13590);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(OWLFunctionalObjectPropertyAxiom axiom)")
    public void shouldCreateViolationForOWLFunctionalObjectPropertyAxiomInOWL2QLProfile() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),13591);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_239zz6uahj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForOWLFunctionalObjectPropertyAxiomInOWL2QLProfile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13591,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_239zz6uahj() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(13591);
        __CLR4_5_29y89y8lvico28i.R.inc(13592);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(13593);declare(o, OP);
        __CLR4_5_29y89y8lvico28i.R.inc(13594);m.addAxiom(o, FunctionalObjectProperty(OP));
        __CLR4_5_29y89y8lvico28i.R.inc(13595);OWL2QLProfile profile = new OWL2QLProfile();
        __CLR4_5_29y89y8lvico28i.R.inc(13596);int expected = 1;
        __CLR4_5_29y89y8lvico28i.R.inc(13597);Class[] expectedViolations = { UseOfIllegalAxiom.class };
        __CLR4_5_29y89y8lvico28i.R.inc(13598);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(OWLInverseFunctionalObjectPropertyAxiom axiom)")
    public void shouldCreateViolationForOWLInverseFunctionalObjectPropertyAxiomInOWL2QLProfile() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),13599);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25e9mqwahr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForOWLInverseFunctionalObjectPropertyAxiomInOWL2QLProfile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13599,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25e9mqwahr() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(13599);
        __CLR4_5_29y89y8lvico28i.R.inc(13600);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(13601);declare(o, OP);
        __CLR4_5_29y89y8lvico28i.R.inc(13602);m.addAxiom(o, InverseFunctionalObjectProperty(OP));
        __CLR4_5_29y89y8lvico28i.R.inc(13603);OWL2QLProfile profile = new OWL2QLProfile();
        __CLR4_5_29y89y8lvico28i.R.inc(13604);int expected = 1;
        __CLR4_5_29y89y8lvico28i.R.inc(13605);Class[] expectedViolations = { UseOfIllegalAxiom.class };
        __CLR4_5_29y89y8lvico28i.R.inc(13606);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(OWLTransitiveObjectPropertyAxiom axiom)")
    public void shouldCreateViolationForOWLTransitiveObjectPropertyAxiomInOWL2QLProfile() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),13607);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2f8u8w4ahz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForOWLTransitiveObjectPropertyAxiomInOWL2QLProfile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13607,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2f8u8w4ahz() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(13607);
        __CLR4_5_29y89y8lvico28i.R.inc(13608);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(13609);declare(o, OP);
        __CLR4_5_29y89y8lvico28i.R.inc(13610);m.addAxiom(o, TransitiveObjectProperty(OP));
        __CLR4_5_29y89y8lvico28i.R.inc(13611);OWL2QLProfile profile = new OWL2QLProfile();
        __CLR4_5_29y89y8lvico28i.R.inc(13612);int expected = 1;
        __CLR4_5_29y89y8lvico28i.R.inc(13613);Class[] expectedViolations = { UseOfIllegalAxiom.class };
        __CLR4_5_29y89y8lvico28i.R.inc(13614);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(OWLFunctionalDataPropertyAxiom axiom)")
    public void shouldCreateViolationForOWLFunctionalDataPropertyAxiomInOWL2QLProfile() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),13615);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rl3xwbai7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForOWLFunctionalDataPropertyAxiomInOWL2QLProfile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13615,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rl3xwbai7() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(13615);
        __CLR4_5_29y89y8lvico28i.R.inc(13616);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(13617);declare(o, DATAP);
        __CLR4_5_29y89y8lvico28i.R.inc(13618);m.addAxiom(o, FunctionalDataProperty(DATAP));
        __CLR4_5_29y89y8lvico28i.R.inc(13619);OWL2QLProfile profile = new OWL2QLProfile();
        __CLR4_5_29y89y8lvico28i.R.inc(13620);int expected = 1;
        __CLR4_5_29y89y8lvico28i.R.inc(13621);Class[] expectedViolations = { UseOfIllegalAxiom.class };
        __CLR4_5_29y89y8lvico28i.R.inc(13622);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(OWLDataPropertyDomainAxiom axiom)")
    public void shouldCreateViolationForOWLDataPropertyDomainAxiomInOWL2QLProfile() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),13623);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21pv3piaif();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForOWLDataPropertyDomainAxiomInOWL2QLProfile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13623,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21pv3piaif() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(13623);
        __CLR4_5_29y89y8lvico28i.R.inc(13624);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(13625);declare(o, DATAP, OP);
        __CLR4_5_29y89y8lvico28i.R.inc(13626);m.addAxiom(o, DataPropertyDomain(DATAP, ObjectMaxCardinality(1, OP, OWLNothing())));
        __CLR4_5_29y89y8lvico28i.R.inc(13627);OWL2QLProfile profile = new OWL2QLProfile();
        __CLR4_5_29y89y8lvico28i.R.inc(13628);int expected = 1;
        __CLR4_5_29y89y8lvico28i.R.inc(13629);Class[] expectedViolations = { UseOfNonSuperClassExpression.class };
        __CLR4_5_29y89y8lvico28i.R.inc(13630);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(OWLClassAssertionAxiom axiom)")
    public void shouldCreateViolationForOWLClassAssertionAxiomInOWL2QLProfile() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),13631);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jh3dirain();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForOWLClassAssertionAxiomInOWL2QLProfile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13631,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jh3dirain() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(13631);
        __CLR4_5_29y89y8lvico28i.R.inc(13632);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(13633);OWLNamedIndividual i = NamedIndividual(IRI("urn:test#i"));
        __CLR4_5_29y89y8lvico28i.R.inc(13634);declare(o, OP, i);
        __CLR4_5_29y89y8lvico28i.R.inc(13635);m.addAxiom(o, ClassAssertion(ObjectSomeValuesFrom(OP, OWLThing()), i));
        __CLR4_5_29y89y8lvico28i.R.inc(13636);OWL2QLProfile profile = new OWL2QLProfile();
        __CLR4_5_29y89y8lvico28i.R.inc(13637);int expected = 1;
        __CLR4_5_29y89y8lvico28i.R.inc(13638);Class[] expectedViolations = { UseOfNonAtomicClassExpression.class };
        __CLR4_5_29y89y8lvico28i.R.inc(13639);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(OWLSameIndividualAxiom axiom)")
    public void shouldCreateViolationForOWLSameIndividualAxiomInOWL2QLProfile() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),13640);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2schpeqaiw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForOWLSameIndividualAxiomInOWL2QLProfile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13640,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2schpeqaiw() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(13640);
        __CLR4_5_29y89y8lvico28i.R.inc(13641);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(13642);m.addAxiom(o, SameIndividual(NamedIndividual(IRI("urn:test#individual1")), NamedIndividual(IRI(
            "urn:test#individual2"))));
        __CLR4_5_29y89y8lvico28i.R.inc(13643);OWL2QLProfile profile = new OWL2QLProfile();
        __CLR4_5_29y89y8lvico28i.R.inc(13644);int expected = 1;
        __CLR4_5_29y89y8lvico28i.R.inc(13645);Class[] expectedViolations = { UseOfIllegalAxiom.class };
        __CLR4_5_29y89y8lvico28i.R.inc(13646);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(OWLNegativeObjectPropertyAssertionAxiom axiom)")
    public void shouldCreateViolationForOWLNegativeObjectPropertyAssertionAxiomInOWL2QLProfile() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),13647);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22i5czqaj3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForOWLNegativeObjectPropertyAssertionAxiomInOWL2QLProfile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13647,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22i5czqaj3() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(13647);
        __CLR4_5_29y89y8lvico28i.R.inc(13648);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(13649);declare(o, OP);
        __CLR4_5_29y89y8lvico28i.R.inc(13650);OWLNamedIndividual i = NamedIndividual(IRI("urn:test#i"));
        __CLR4_5_29y89y8lvico28i.R.inc(13651);OWLNamedIndividual i1 = NamedIndividual(IRI("urn:test#i"));
        __CLR4_5_29y89y8lvico28i.R.inc(13652);declare(o, i, i1);
        __CLR4_5_29y89y8lvico28i.R.inc(13653);m.addAxiom(o, NegativeObjectPropertyAssertion(OP, i, i1));
        __CLR4_5_29y89y8lvico28i.R.inc(13654);OWL2QLProfile profile = new OWL2QLProfile();
        __CLR4_5_29y89y8lvico28i.R.inc(13655);int expected = 1;
        __CLR4_5_29y89y8lvico28i.R.inc(13656);Class[] expectedViolations = { UseOfIllegalAxiom.class };
        __CLR4_5_29y89y8lvico28i.R.inc(13657);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(OWLNegativeDataPropertyAssertionAxiom axiom)")
    public void shouldCreateViolationForOWLNegativeDataPropertyAssertionAxiomInOWL2QLProfile() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),13658);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lhn7f3aje();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForOWLNegativeDataPropertyAssertionAxiomInOWL2QLProfile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13658,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lhn7f3aje() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(13658);
        __CLR4_5_29y89y8lvico28i.R.inc(13659);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(13660);declare(o, DATAP);
        __CLR4_5_29y89y8lvico28i.R.inc(13661);OWLNamedIndividual i = NamedIndividual(IRI("urn:test#i"));
        __CLR4_5_29y89y8lvico28i.R.inc(13662);declare(o, i);
        __CLR4_5_29y89y8lvico28i.R.inc(13663);m.addAxiom(o, NegativeDataPropertyAssertion(DATAP, i, Literal(1)));
        __CLR4_5_29y89y8lvico28i.R.inc(13664);OWL2QLProfile profile = new OWL2QLProfile();
        __CLR4_5_29y89y8lvico28i.R.inc(13665);int expected = 1;
        __CLR4_5_29y89y8lvico28i.R.inc(13666);Class[] expectedViolations = { UseOfIllegalAxiom.class };
        __CLR4_5_29y89y8lvico28i.R.inc(13667);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(OWLDisjointUnionAxiom axiom)")
    public void shouldCreateViolationForOWLDisjointUnionAxiomInOWL2QLProfile() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),13668);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lgo9qkajo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForOWLDisjointUnionAxiomInOWL2QLProfile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13668,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lgo9qkajo() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(13668);
        __CLR4_5_29y89y8lvico28i.R.inc(13669);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(13670);declare(o, CL);
        __CLR4_5_29y89y8lvico28i.R.inc(13671);m.addAxiom(o, DisjointUnion(CL, OWLThing(), OWLNothing()));
        __CLR4_5_29y89y8lvico28i.R.inc(13672);OWL2QLProfile profile = new OWL2QLProfile();
        __CLR4_5_29y89y8lvico28i.R.inc(13673);int expected = 1;
        __CLR4_5_29y89y8lvico28i.R.inc(13674);Class[] expectedViolations = { UseOfIllegalAxiom.class };
        __CLR4_5_29y89y8lvico28i.R.inc(13675);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(OWLIrreflexiveObjectPropertyAxiom axiom)")
    public void shouldNotCreateViolationForOWLIrreflexiveObjectPropertyAxiomInOWL2QLProfile() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),13676);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vlmphhajw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldNotCreateViolationForOWLIrreflexiveObjectPropertyAxiomInOWL2QLProfile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13676,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vlmphhajw() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(13676);
        __CLR4_5_29y89y8lvico28i.R.inc(13677);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(13678);declare(o, OP);
        __CLR4_5_29y89y8lvico28i.R.inc(13679);m.addAxiom(o, IrreflexiveObjectProperty(OP));
        __CLR4_5_29y89y8lvico28i.R.inc(13680);OWL2QLProfile profile = new OWL2QLProfile();
        __CLR4_5_29y89y8lvico28i.R.inc(13681);int expected = 0;
        __CLR4_5_29y89y8lvico28i.R.inc(13682);Class[] expectedViolations = {};
        __CLR4_5_29y89y8lvico28i.R.inc(13683);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(SWRLRule rule)")
    public void shouldCreateViolationForSWRLRuleInOWL2QLProfile() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),13684);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gnpb05ak4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForSWRLRuleInOWL2QLProfile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13684,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gnpb05ak4() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(13684);
        __CLR4_5_29y89y8lvico28i.R.inc(13685);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(13686);m.addAxiom(o, DF.getSWRLRule(new HashSet<SWRLAtom>(), new HashSet<SWRLAtom>()));
        __CLR4_5_29y89y8lvico28i.R.inc(13687);OWL2QLProfile profile = new OWL2QLProfile();
        __CLR4_5_29y89y8lvico28i.R.inc(13688);int expected = 1;
        __CLR4_5_29y89y8lvico28i.R.inc(13689);Class[] expectedViolations = { UseOfIllegalAxiom.class };
        __CLR4_5_29y89y8lvico28i.R.inc(13690);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(OWLDataComplementOf node)")
    public void shouldCreateViolationForOWLDataComplementOfInOWL2QLProfile() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),13691);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2m6hf06akb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForOWLDataComplementOfInOWL2QLProfile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13691,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2m6hf06akb() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(13691);
        __CLR4_5_29y89y8lvico28i.R.inc(13692);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(13693);declare(o, DATAP);
        __CLR4_5_29y89y8lvico28i.R.inc(13694);m.addAxiom(o, DataPropertyRange(DATAP, DataComplementOf(Integer())));
        __CLR4_5_29y89y8lvico28i.R.inc(13695);OWL2QLProfile profile = new OWL2QLProfile();
        __CLR4_5_29y89y8lvico28i.R.inc(13696);int expected = 1;
        __CLR4_5_29y89y8lvico28i.R.inc(13697);Class[] expectedViolations = { UseOfIllegalDataRange.class };
        __CLR4_5_29y89y8lvico28i.R.inc(13698);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(OWLDataOneOf node)")
    public void shouldCreateViolationForOWLDataOneOfInOWL2QLProfile() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),13699);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wbuyg0akj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForOWLDataOneOfInOWL2QLProfile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13699,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wbuyg0akj() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(13699);
        __CLR4_5_29y89y8lvico28i.R.inc(13700);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(13701);declare(o, DATAP);
        __CLR4_5_29y89y8lvico28i.R.inc(13702);m.addAxiom(o, DataPropertyRange(DATAP, DataOneOf(Literal(1), Literal(2))));
        __CLR4_5_29y89y8lvico28i.R.inc(13703);OWL2QLProfile profile = new OWL2QLProfile();
        __CLR4_5_29y89y8lvico28i.R.inc(13704);int expected = 1;
        __CLR4_5_29y89y8lvico28i.R.inc(13705);Class[] expectedViolations = { UseOfIllegalDataRange.class };
        __CLR4_5_29y89y8lvico28i.R.inc(13706);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(OWLDatatypeRestriction node)")
    public void shouldCreateViolationForOWLDatatypeRestrictionInOWL2QLProfile() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),13707);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2i1sb6zakr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForOWLDatatypeRestrictionInOWL2QLProfile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13707,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2i1sb6zakr() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(13707);
        __CLR4_5_29y89y8lvico28i.R.inc(13708);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(13709);declare(o, DATAP);
        __CLR4_5_29y89y8lvico28i.R.inc(13710);m.addAxiom(o, DATA_PROPERTY_RANGE);
        __CLR4_5_29y89y8lvico28i.R.inc(13711);OWL2QLProfile profile = new OWL2QLProfile();
        __CLR4_5_29y89y8lvico28i.R.inc(13712);int expected = 1;
        __CLR4_5_29y89y8lvico28i.R.inc(13713);Class[] expectedViolations = { UseOfIllegalDataRange.class };
        __CLR4_5_29y89y8lvico28i.R.inc(13714);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(OWLDataUnionOf node)")
    public void shouldCreateViolationForOWLDataUnionOfInOWL2QLProfile() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),13715);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_253543bakz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForOWLDataUnionOfInOWL2QLProfile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13715,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_253543bakz() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(13715);
        __CLR4_5_29y89y8lvico28i.R.inc(13716);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(13717);declare(o, DATAP);
        __CLR4_5_29y89y8lvico28i.R.inc(13718);m.addAxiom(o, DataPropertyRange(DATAP, DataUnionOf(Integer(), Boolean())));
        __CLR4_5_29y89y8lvico28i.R.inc(13719);OWL2QLProfile profile = new OWL2QLProfile();
        __CLR4_5_29y89y8lvico28i.R.inc(13720);int expected = 2;
        __CLR4_5_29y89y8lvico28i.R.inc(13721);Class[] expectedViolations = { UseOfIllegalDataRange.class, UseOfIllegalDataRange.class };
        __CLR4_5_29y89y8lvico28i.R.inc(13722);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(OWLClassAssertionAxiom axiom)")
    public void shouldCreateViolationForOWLClassAssertionAxiomInOWL2RLProfile() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),13723);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22zgnkial7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForOWLClassAssertionAxiomInOWL2RLProfile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13723,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22zgnkial7() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(13723);
        __CLR4_5_29y89y8lvico28i.R.inc(13724);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(13725);declare(o, OP);
        __CLR4_5_29y89y8lvico28i.R.inc(13726);m.addAxiom(o, ClassAssertion(ObjectMinCardinality(1, OP, OWLThing()), NamedIndividual(IRI("urn:test#i"))));
        __CLR4_5_29y89y8lvico28i.R.inc(13727);OWL2RLProfile profile = new OWL2RLProfile();
        __CLR4_5_29y89y8lvico28i.R.inc(13728);int expected = 1;
        __CLR4_5_29y89y8lvico28i.R.inc(13729);Class[] expectedViolations = { UseOfNonSuperClassExpression.class };
        __CLR4_5_29y89y8lvico28i.R.inc(13730);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(OWLDataPropertyDomainAxiom axiom)")
    public void shouldCreateViolationForOWLDataPropertyDomainAxiomInOWL2RLProfile() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),13731);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2i7htnralf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForOWLDataPropertyDomainAxiomInOWL2RLProfile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13731,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2i7htnralf() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(13731);
        __CLR4_5_29y89y8lvico28i.R.inc(13732);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(13733);declare(o, DATAP, OP);
        __CLR4_5_29y89y8lvico28i.R.inc(13734);m.addAxiom(o, DataPropertyDomain(DATAP, ObjectMinCardinality(1, OP, OWLThing())));
        __CLR4_5_29y89y8lvico28i.R.inc(13735);OWL2RLProfile profile = new OWL2RLProfile();
        __CLR4_5_29y89y8lvico28i.R.inc(13736);int expected = 1;
        __CLR4_5_29y89y8lvico28i.R.inc(13737);Class[] expectedViolations = { UseOfNonSuperClassExpression.class };
        __CLR4_5_29y89y8lvico28i.R.inc(13738);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(OWLDisjointClassesAxiom axiom)")
    public void shouldCreateViolationForOWLDisjointClassesAxiomInOWL2RLProfile() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),13739);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_255eb04aln();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForOWLDisjointClassesAxiomInOWL2RLProfile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13739,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_255eb04aln() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(13739);
        __CLR4_5_29y89y8lvico28i.R.inc(13740);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(13741);m.addAxiom(o, DisjointClasses(ObjectComplementOf(OWLThing()), OWLThing()));
        __CLR4_5_29y89y8lvico28i.R.inc(13742);OWL2RLProfile profile = new OWL2RLProfile();
        __CLR4_5_29y89y8lvico28i.R.inc(13743);int expected = 2;
        __CLR4_5_29y89y8lvico28i.R.inc(13744);Class[] expectedViolations = { UseOfNonSubClassExpression.class, UseOfNonSubClassExpression.class };
        __CLR4_5_29y89y8lvico28i.R.inc(13745);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(OWLDisjointDataPropertiesAxiom axiom)")
    public void shouldCreateViolationForOWLDisjointDataPropertiesAxiomInOWL2RLProfile() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),13746);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26ppf43alu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForOWLDisjointDataPropertiesAxiomInOWL2RLProfile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13746,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26ppf43alu() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(13746);
        __CLR4_5_29y89y8lvico28i.R.inc(13747);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(13748);OWLDataProperty dp = DataProperty(IRI("urn:test#dproperty"));
        __CLR4_5_29y89y8lvico28i.R.inc(13749);declare(o, DATAP, dp);
        __CLR4_5_29y89y8lvico28i.R.inc(13750);m.addAxiom(o, DisjointDataProperties(DATAP, dp));
        __CLR4_5_29y89y8lvico28i.R.inc(13751);OWL2RLProfile profile = new OWL2RLProfile();
        __CLR4_5_29y89y8lvico28i.R.inc(13752);int expected = 0;
        __CLR4_5_29y89y8lvico28i.R.inc(13753);Class[] expectedViolations = {};
        __CLR4_5_29y89y8lvico28i.R.inc(13754);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(OWLDisjointUnionAxiom axiom)")
    public void shouldCreateViolationForOWLDisjointUnionAxiomInOWL2RLProfile() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),13755);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24z1jsbam3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForOWLDisjointUnionAxiomInOWL2RLProfile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13755,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24z1jsbam3() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(13755);
        __CLR4_5_29y89y8lvico28i.R.inc(13756);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(13757);declare(o, CL);
        __CLR4_5_29y89y8lvico28i.R.inc(13758);m.addAxiom(o, DisjointUnion(CL, OWLThing(), OWLNothing()));
        __CLR4_5_29y89y8lvico28i.R.inc(13759);OWL2RLProfile profile = new OWL2RLProfile();
        __CLR4_5_29y89y8lvico28i.R.inc(13760);int expected = 1;
        __CLR4_5_29y89y8lvico28i.R.inc(13761);Class[] expectedViolations = { UseOfIllegalAxiom.class };
        __CLR4_5_29y89y8lvico28i.R.inc(13762);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(OWLEquivalentClassesAxiom axiom)")
    public void shouldCreateViolationForOWLEquivalentClassesAxiomInOWL2RLProfile() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),13763);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pz6d2aamb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForOWLEquivalentClassesAxiomInOWL2RLProfile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13763,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pz6d2aamb() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(13763);
        __CLR4_5_29y89y8lvico28i.R.inc(13764);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(13765);m.addAxiom(o, EquivalentClasses(ObjectComplementOf(OWLThing()), OWLNothing()));
        __CLR4_5_29y89y8lvico28i.R.inc(13766);OWL2RLProfile profile = new OWL2RLProfile();
        __CLR4_5_29y89y8lvico28i.R.inc(13767);int expected = 1;
        __CLR4_5_29y89y8lvico28i.R.inc(13768);Class[] expectedViolations = { UseOfNonEquivalentClassExpression.class };
        __CLR4_5_29y89y8lvico28i.R.inc(13769);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(OWLEquivalentDataPropertiesAxiom axiom)")
    public void shouldNotCreateViolationForOWLEquivalentDataPropertiesAxiomInOWL2RLProfile() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),13770);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nphtqaami();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldNotCreateViolationForOWLEquivalentDataPropertiesAxiomInOWL2RLProfile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13770,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nphtqaami() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(13770);
        __CLR4_5_29y89y8lvico28i.R.inc(13771);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(13772);OWLDataProperty dp = DataProperty(IRI("urn:test#test"));
        __CLR4_5_29y89y8lvico28i.R.inc(13773);declare(o, DATAP, dp);
        __CLR4_5_29y89y8lvico28i.R.inc(13774);m.addAxiom(o, EquivalentDataProperties(DATAP, dp));
        __CLR4_5_29y89y8lvico28i.R.inc(13775);OWL2RLProfile profile = new OWL2RLProfile();
        __CLR4_5_29y89y8lvico28i.R.inc(13776);int expected = 0;
        __CLR4_5_29y89y8lvico28i.R.inc(13777);Class[] expectedViolations = {};
        __CLR4_5_29y89y8lvico28i.R.inc(13778);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(OWLFunctionalDataPropertyAxiom axiom)")
    public void shouldCreateViolationForOWLFunctionalDataPropertyAxiomInOWL2RLProfile() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),13779);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2b3h7y2amr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForOWLFunctionalDataPropertyAxiomInOWL2RLProfile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13779,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2b3h7y2amr() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(13779);
        __CLR4_5_29y89y8lvico28i.R.inc(13780);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(13781);declare(o, DATAP);
        __CLR4_5_29y89y8lvico28i.R.inc(13782);m.addAxiom(o, FunctionalDataProperty(DATAP));
        __CLR4_5_29y89y8lvico28i.R.inc(13783);OWL2RLProfile profile = new OWL2RLProfile();
        __CLR4_5_29y89y8lvico28i.R.inc(13784);int expected = 0;
        __CLR4_5_29y89y8lvico28i.R.inc(13785);Class[] expectedViolations = {};
        __CLR4_5_29y89y8lvico28i.R.inc(13786);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(OWLHasKeyAxiom axiom)")
    public void shouldCreateViolationForOWLHasKeyAxiomInOWL2RLProfile() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),13787);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cv64afamz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForOWLHasKeyAxiomInOWL2RLProfile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13787,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cv64afamz() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(13787);
        __CLR4_5_29y89y8lvico28i.R.inc(13788);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(13789);declare(o, CL, OP);
        __CLR4_5_29y89y8lvico28i.R.inc(13790);m.addAxiom(o, HasKey(ObjectComplementOf(CL), OP));
        __CLR4_5_29y89y8lvico28i.R.inc(13791);OWL2RLProfile profile = new OWL2RLProfile();
        __CLR4_5_29y89y8lvico28i.R.inc(13792);int expected = 1;
        __CLR4_5_29y89y8lvico28i.R.inc(13793);Class[] expectedViolations = { UseOfNonSubClassExpression.class };
        __CLR4_5_29y89y8lvico28i.R.inc(13794);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(OWLObjectPropertyDomainAxiom axiom)")
    public void shouldCreateViolationForOWLObjectPropertyDomainAxiomInOWL2RLProfile() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),13795);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2op1hycan7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForOWLObjectPropertyDomainAxiomInOWL2RLProfile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13795,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2op1hycan7() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(13795);
        __CLR4_5_29y89y8lvico28i.R.inc(13796);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(13797);declare(o, OP, OP);
        __CLR4_5_29y89y8lvico28i.R.inc(13798);m.addAxiom(o, ObjectPropertyDomain(OP, ObjectMinCardinality(1, OP, OWLThing())));
        __CLR4_5_29y89y8lvico28i.R.inc(13799);OWL2RLProfile profile = new OWL2RLProfile();
        __CLR4_5_29y89y8lvico28i.R.inc(13800);int expected = 1;
        __CLR4_5_29y89y8lvico28i.R.inc(13801);Class[] expectedViolations = { UseOfNonSuperClassExpression.class };
        __CLR4_5_29y89y8lvico28i.R.inc(13802);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(OWLObjectPropertyRangeAxiom axiom)")
    public void shouldCreateViolationForOWLObjectPropertyRangeAxiomInOWL2RLProfile() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),13803);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rftevfanf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForOWLObjectPropertyRangeAxiomInOWL2RLProfile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13803,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rftevfanf() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(13803);
        __CLR4_5_29y89y8lvico28i.R.inc(13804);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(13805);declare(o, OP);
        __CLR4_5_29y89y8lvico28i.R.inc(13806);m.addAxiom(o, ObjectPropertyRange(OP, ObjectMinCardinality(1, OP, OWLThing())));
        __CLR4_5_29y89y8lvico28i.R.inc(13807);OWL2RLProfile profile = new OWL2RLProfile();
        __CLR4_5_29y89y8lvico28i.R.inc(13808);int expected = 1;
        __CLR4_5_29y89y8lvico28i.R.inc(13809);Class[] expectedViolations = { UseOfNonSuperClassExpression.class };
        __CLR4_5_29y89y8lvico28i.R.inc(13810);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(OWLSubClassOfAxiom axiom)")
    public void shouldCreateViolationForOWLSubClassOfAxiomInOWL2RLProfile() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),13811);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qrnf03ann();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForOWLSubClassOfAxiomInOWL2RLProfile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13811,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qrnf03ann() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(13811);
        __CLR4_5_29y89y8lvico28i.R.inc(13812);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(13813);m.addAxiom(o, SubClassOf(ObjectComplementOf(OWLThing()), ObjectOneOf(NamedIndividual(IRI("urn:test#test")))));
        __CLR4_5_29y89y8lvico28i.R.inc(13814);OWL2RLProfile profile = new OWL2RLProfile();
        __CLR4_5_29y89y8lvico28i.R.inc(13815);int expected = 2;
        __CLR4_5_29y89y8lvico28i.R.inc(13816);Class[] expectedViolations = { UseOfNonSubClassExpression.class, UseOfNonSuperClassExpression.class };
        __CLR4_5_29y89y8lvico28i.R.inc(13817);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(SWRLRule rule)")
    public void shouldCreateViolationForSWRLRuleInOWL2RLProfile() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),13818);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2x5c0yeanu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForSWRLRuleInOWL2RLProfile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13818,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2x5c0yeanu() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(13818);
        __CLR4_5_29y89y8lvico28i.R.inc(13819);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(13820);m.addAxiom(o, DF.getSWRLRule(new HashSet<SWRLAtom>(), new HashSet<SWRLAtom>()));
        __CLR4_5_29y89y8lvico28i.R.inc(13821);OWL2RLProfile profile = new OWL2RLProfile();
        __CLR4_5_29y89y8lvico28i.R.inc(13822);int expected = 1;
        __CLR4_5_29y89y8lvico28i.R.inc(13823);Class[] expectedViolations = { UseOfIllegalAxiom.class };
        __CLR4_5_29y89y8lvico28i.R.inc(13824);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(OWLDataComplementOf node)")
    public void shouldCreateViolationForOWLDataComplementOfInOWL2RLProfile() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),13825);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25oup1xao1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForOWLDataComplementOfInOWL2RLProfile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13825,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25oup1xao1() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(13825);
        __CLR4_5_29y89y8lvico28i.R.inc(13826);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(13827);declare(o, DATAP);
        __CLR4_5_29y89y8lvico28i.R.inc(13828);m.addAxiom(o, DataPropertyRange(DATAP, DataComplementOf(Integer())));
        __CLR4_5_29y89y8lvico28i.R.inc(13829);OWL2RLProfile profile = new OWL2RLProfile();
        __CLR4_5_29y89y8lvico28i.R.inc(13830);int expected = 1;
        __CLR4_5_29y89y8lvico28i.R.inc(13831);Class[] expectedViolations = { UseOfIllegalDataRange.class };
        __CLR4_5_29y89y8lvico28i.R.inc(13832);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(OWLDataIntersectionOf node)")
    public void shouldNotCreateViolationForOWLDataIntersectionOfInOWL2RLProfile() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),13833);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29oxvl7ao9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldNotCreateViolationForOWLDataIntersectionOfInOWL2RLProfile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13833,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29oxvl7ao9() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(13833);
        __CLR4_5_29y89y8lvico28i.R.inc(13834);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(13835);declare(o, DATAP);
        __CLR4_5_29y89y8lvico28i.R.inc(13836);m.addAxiom(o, DataPropertyRange(DATAP, DataIntersectionOf(Integer(), Boolean())));
        __CLR4_5_29y89y8lvico28i.R.inc(13837);OWL2RLProfile profile = new OWL2RLProfile();
        __CLR4_5_29y89y8lvico28i.R.inc(13838);int expected = 0;
        __CLR4_5_29y89y8lvico28i.R.inc(13839);Class[] expectedViolations = {};
        __CLR4_5_29y89y8lvico28i.R.inc(13840);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(OWLDataOneOf node)")
    public void shouldCreateViolationForOWLDataOneOfInOWL2RLProfile() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),13841);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2m7mdkvaoh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForOWLDataOneOfInOWL2RLProfile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13841,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2m7mdkvaoh() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(13841);
        __CLR4_5_29y89y8lvico28i.R.inc(13842);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(13843);declare(o, DATAP);
        __CLR4_5_29y89y8lvico28i.R.inc(13844);m.addAxiom(o, DataPropertyRange(DATAP, DataOneOf(Literal(1), Literal(2))));
        __CLR4_5_29y89y8lvico28i.R.inc(13845);OWL2RLProfile profile = new OWL2RLProfile();
        __CLR4_5_29y89y8lvico28i.R.inc(13846);int expected = 1;
        __CLR4_5_29y89y8lvico28i.R.inc(13847);Class[] expectedViolations = { UseOfIllegalDataRange.class };
        __CLR4_5_29y89y8lvico28i.R.inc(13848);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(OWLDatatype node)")
    public void shouldCreateViolationForOWLDatatypeInOWL2RLProfile() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),13849);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kgmv2qaop();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForOWLDatatypeInOWL2RLProfile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13849,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kgmv2qaop() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(13849);
        __CLR4_5_29y89y8lvico28i.R.inc(13850);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(13851);declare(o, Datatype(IRI("urn:test#test")));
        __CLR4_5_29y89y8lvico28i.R.inc(13852);OWL2RLProfile profile = new OWL2RLProfile();
        __CLR4_5_29y89y8lvico28i.R.inc(13853);int expected = 0;
        __CLR4_5_29y89y8lvico28i.R.inc(13854);Class[] expectedViolations = {};
        __CLR4_5_29y89y8lvico28i.R.inc(13855);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(OWLDatatypeRestriction node)")
    public void shouldCreateViolationForOWLDatatypeRestrictionInOWL2RLProfile() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),13856);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yjf158aow();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForOWLDatatypeRestrictionInOWL2RLProfile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13856,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yjf158aow() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(13856);
        __CLR4_5_29y89y8lvico28i.R.inc(13857);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(13858);declare(o, DATAP);
        __CLR4_5_29y89y8lvico28i.R.inc(13859);m.addAxiom(o, DATA_PROPERTY_RANGE);
        __CLR4_5_29y89y8lvico28i.R.inc(13860);OWL2RLProfile profile = new OWL2RLProfile();
        __CLR4_5_29y89y8lvico28i.R.inc(13861);int expected = 1;
        __CLR4_5_29y89y8lvico28i.R.inc(13862);Class[] expectedViolations = { UseOfIllegalDataRange.class };
        __CLR4_5_29y89y8lvico28i.R.inc(13863);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(OWLDataUnionOf node)")
    public void shouldCreateViolationForOWLDataUnionOfInOWL2RLProfile() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),13864);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lkru1kap4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForOWLDataUnionOfInOWL2RLProfile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13864,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lkru1kap4() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(13864);
        __CLR4_5_29y89y8lvico28i.R.inc(13865);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(13866);declare(o, DATAP);
        __CLR4_5_29y89y8lvico28i.R.inc(13867);m.addAxiom(o, DataPropertyRange(DATAP, DataUnionOf(Double(), Integer())));
        __CLR4_5_29y89y8lvico28i.R.inc(13868);OWL2RLProfile profile = new OWL2RLProfile();
        __CLR4_5_29y89y8lvico28i.R.inc(13869);int expected = 1;
        __CLR4_5_29y89y8lvico28i.R.inc(13870);Class[] expectedViolations = { UseOfIllegalDataRange.class };
        __CLR4_5_29y89y8lvico28i.R.inc(13871);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Test
    @Tests(method = "public Object visit(OWLDatatypeDefinitionAxiom axiom)")
    public void shouldCreateViolationForOWLDatatypeDefinitionAxiomInOWL2RLProfile() throws Exception {__CLR4_5_29y89y8lvico28i.R.globalSliceStart(getClass().getName(),13872);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2u7wu85apc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29y89y8lvico28i.R.rethrow($CLV_t2$);}finally{__CLR4_5_29y89y8lvico28i.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.shouldCreateViolationForOWLDatatypeDefinitionAxiomInOWL2RLProfile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13872,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2u7wu85apc() throws Exception{try{__CLR4_5_29y89y8lvico28i.R.inc(13872);
        __CLR4_5_29y89y8lvico28i.R.inc(13873);OWLOntology o = createOnto();
        __CLR4_5_29y89y8lvico28i.R.inc(13874);OWLDatatype datatype = Datatype(IRI("urn:test#datatype"));
        __CLR4_5_29y89y8lvico28i.R.inc(13875);declare(o, datatype);
        __CLR4_5_29y89y8lvico28i.R.inc(13876);m.addAxiom(o, DatatypeDefinition(datatype, Boolean()));
        __CLR4_5_29y89y8lvico28i.R.inc(13877);OWL2RLProfile profile = new OWL2RLProfile();
        __CLR4_5_29y89y8lvico28i.R.inc(13878);int expected = 2;
        __CLR4_5_29y89y8lvico28i.R.inc(13879);Class[] expectedViolations = { UseOfIllegalAxiom.class, UseOfIllegalDataRange.class };
        __CLR4_5_29y89y8lvico28i.R.inc(13880);runAssert(o, profile, expected, expectedViolations);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}

    @Nonnull
    private OWLOntology createOnto() throws OWLOntologyCreationException {try{__CLR4_5_29y89y8lvico28i.R.inc(13881);
        __CLR4_5_29y89y8lvico28i.R.inc(13882);return m.createOntology(onto);
    }finally{__CLR4_5_29y89y8lvico28i.R.flushNeeded();}}
}
