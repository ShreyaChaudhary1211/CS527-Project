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
package org.semanticweb.owlapi.api.test.ontology;

import static org.junit.Assert.*;
import static org.semanticweb.owlapi.apibinding.OWLFunctionalSyntaxFactory.IRI;

import javax.annotation.Nonnull;

import org.junit.Test;
import org.semanticweb.owlapi.api.test.baseclasses.TestBase;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLOntologyID;

@SuppressWarnings("javadoc")
public class OntologyIDTestCase extends TestBase {static class __CLR4_5_27gy7gylvico1gl{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,9729,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Nonnull
    private static final String TEST_ONTOLOGY_IRI_STRING = "http://test.it/check1";

    @Test
    public void shouldFindSameHashCode() {__CLR4_5_27gy7gylvico1gl.R.globalSliceStart(getClass().getName(),9682);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bbcol07gy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_27gy7gylvico1gl.R.rethrow($CLV_t2$);}finally{__CLR4_5_27gy7gylvico1gl.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.ontology.OntologyIDTestCase.shouldFindSameHashCode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),9682,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bbcol07gy(){try{__CLR4_5_27gy7gylvico1gl.R.inc(9682);
        __CLR4_5_27gy7gylvico1gl.R.inc(9683);IRI iri1 = IRI(TEST_ONTOLOGY_IRI_STRING);
        __CLR4_5_27gy7gylvico1gl.R.inc(9684);IRI iri2 = IRI(TEST_ONTOLOGY_IRI_STRING);
        __CLR4_5_27gy7gylvico1gl.R.inc(9685);assertEquals(iri1.hashCode(), iri2.hashCode());
        __CLR4_5_27gy7gylvico1gl.R.inc(9686);assertEquals(iri1, iri2);
    }finally{__CLR4_5_27gy7gylvico1gl.R.flushNeeded();}}

    @Test
    public void shouldFindSameHashCodeForIDs() {__CLR4_5_27gy7gylvico1gl.R.globalSliceStart(getClass().getName(),9687);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2auehc37h3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_27gy7gylvico1gl.R.rethrow($CLV_t2$);}finally{__CLR4_5_27gy7gylvico1gl.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.ontology.OntologyIDTestCase.shouldFindSameHashCodeForIDs",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),9687,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2auehc37h3(){try{__CLR4_5_27gy7gylvico1gl.R.inc(9687);
        __CLR4_5_27gy7gylvico1gl.R.inc(9688);IRI iri1 = IRI(TEST_ONTOLOGY_IRI_STRING);
        __CLR4_5_27gy7gylvico1gl.R.inc(9689);IRI iri2 = IRI(TEST_ONTOLOGY_IRI_STRING);
        __CLR4_5_27gy7gylvico1gl.R.inc(9690);assertEquals(iri1.hashCode(), iri2.hashCode());
        __CLR4_5_27gy7gylvico1gl.R.inc(9691);OWLOntologyID id1 = new OWLOntologyID(of(iri1), absent());
        __CLR4_5_27gy7gylvico1gl.R.inc(9692);OWLOntologyID id2 = new OWLOntologyID(of(iri2), absent());
        __CLR4_5_27gy7gylvico1gl.R.inc(9693);assertEquals(id1.hashCode(), id2.hashCode());
    }finally{__CLR4_5_27gy7gylvico1gl.R.flushNeeded();}}

    @Test
    public void shouldFindSameHashCodeForIDs2() {__CLR4_5_27gy7gylvico1gl.R.globalSliceStart(getClass().getName(),9694);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ntcw597ha();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_27gy7gylvico1gl.R.rethrow($CLV_t2$);}finally{__CLR4_5_27gy7gylvico1gl.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.ontology.OntologyIDTestCase.shouldFindSameHashCodeForIDs2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),9694,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ntcw597ha(){try{__CLR4_5_27gy7gylvico1gl.R.inc(9694);
        __CLR4_5_27gy7gylvico1gl.R.inc(9695);IRI iri1 = IRI(TEST_ONTOLOGY_IRI_STRING);
        __CLR4_5_27gy7gylvico1gl.R.inc(9696);IRI iri2 = IRI(TEST_ONTOLOGY_IRI_STRING);
        __CLR4_5_27gy7gylvico1gl.R.inc(9697);assertEquals(iri1.hashCode(), iri2.hashCode());
        __CLR4_5_27gy7gylvico1gl.R.inc(9698);OWLOntologyID id1 = new OWLOntologyID(of(iri1), absent());
        __CLR4_5_27gy7gylvico1gl.R.inc(9699);OWLOntologyID id2 = new OWLOntologyID(of(iri2), absent());
        __CLR4_5_27gy7gylvico1gl.R.inc(9700);assertEquals(id1.hashCode(), id2.hashCode());
        __CLR4_5_27gy7gylvico1gl.R.inc(9701);assertEquals(id1, id2);
    }finally{__CLR4_5_27gy7gylvico1gl.R.flushNeeded();}}

    @Test
    public void testUnequalIdsUnequal() {__CLR4_5_27gy7gylvico1gl.R.globalSliceStart(getClass().getName(),9702);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2md0o5v7hi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_27gy7gylvico1gl.R.rethrow($CLV_t2$);}finally{__CLR4_5_27gy7gylvico1gl.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.ontology.OntologyIDTestCase.testUnequalIdsUnequal",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),9702,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2md0o5v7hi(){try{__CLR4_5_27gy7gylvico1gl.R.inc(9702);
        __CLR4_5_27gy7gylvico1gl.R.inc(9703);OWLOntologyID id1 = new OWLOntologyID(of(IRI("http://www.w3.org/foo")),
                absent());
        __CLR4_5_27gy7gylvico1gl.R.inc(9704);OWLOntologyID id2 = new OWLOntologyID(of(IRI("http://www.w3.org/bar")),
                absent());
        __CLR4_5_27gy7gylvico1gl.R.inc(9705);assertNotEquals(id1.hashCode(), id2.hashCode());
        __CLR4_5_27gy7gylvico1gl.R.inc(9706);assertNotEquals(id1, id2);
    }finally{__CLR4_5_27gy7gylvico1gl.R.flushNeeded();}}

    // this is an experiment, if the manager were to keep all versions of an
    // ontology together in a multimap or something
    @Test
    public void testVersionedIDComparisons() {__CLR4_5_27gy7gylvico1gl.R.globalSliceStart(getClass().getName(),9707);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22me2dt7hn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_27gy7gylvico1gl.R.rethrow($CLV_t2$);}finally{__CLR4_5_27gy7gylvico1gl.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.ontology.OntologyIDTestCase.testVersionedIDComparisons",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),9707,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22me2dt7hn(){try{__CLR4_5_27gy7gylvico1gl.R.inc(9707);
        __CLR4_5_27gy7gylvico1gl.R.inc(9708);IRI iri1 = IRI(TEST_ONTOLOGY_IRI_STRING);
        __CLR4_5_27gy7gylvico1gl.R.inc(9709);IRI iri2 = IRI(TEST_ONTOLOGY_IRI_STRING);
        __CLR4_5_27gy7gylvico1gl.R.inc(9710);assertEquals(iri1.hashCode(), iri2.hashCode());
        __CLR4_5_27gy7gylvico1gl.R.inc(9711);assertEquals(iri1, iri2);
        __CLR4_5_27gy7gylvico1gl.R.inc(9712);OWLOntologyID unversionedID = new OWLOntologyID(of(iri1), absent());
        __CLR4_5_27gy7gylvico1gl.R.inc(9713);String version1IRIString = TEST_ONTOLOGY_IRI_STRING + "/version1";
        __CLR4_5_27gy7gylvico1gl.R.inc(9714);IRI version1IRI = IRI(version1IRIString);
        __CLR4_5_27gy7gylvico1gl.R.inc(9715);OWLOntologyID version1ID = new OWLOntologyID(of(iri2), of(version1IRI));
        __CLR4_5_27gy7gylvico1gl.R.inc(9716);assertEquals("null vs v1 base IRIs", unversionedID.getOntologyIRI(),
                version1ID.getOntologyIRI());
        __CLR4_5_27gy7gylvico1gl.R.inc(9717);assertNotEquals(unversionedID.getVersionIRI(),
                version1ID.getVersionIRI());
        __CLR4_5_27gy7gylvico1gl.R.inc(9718);assertNotEquals("null version vs version1", unversionedID.hashCode(),
                version1ID.hashCode());
        __CLR4_5_27gy7gylvico1gl.R.inc(9719);assertNotEquals("null version vs version1", unversionedID, version1ID);
        __CLR4_5_27gy7gylvico1gl.R.inc(9720);OWLOntologyID duplicateVersion1ID = new OWLOntologyID(
                of(IRI(TEST_ONTOLOGY_IRI_STRING)), of(IRI(version1IRIString)));
        __CLR4_5_27gy7gylvico1gl.R.inc(9721);assertEquals(" two version1 ids", version1ID, duplicateVersion1ID);
        __CLR4_5_27gy7gylvico1gl.R.inc(9722);OWLOntologyID differentBasedVersion1ID = new OWLOntologyID(
                of(IRI(TEST_ONTOLOGY_IRI_STRING + "-of-doom")),
                of(IRI(version1IRIString)));
        __CLR4_5_27gy7gylvico1gl.R.inc(9723);assertNotEquals("version1 of two base IRIs", version1ID,
                differentBasedVersion1ID);
        __CLR4_5_27gy7gylvico1gl.R.inc(9724);IRI version2IRI = IRI(TEST_ONTOLOGY_IRI_STRING + "/version2");
        __CLR4_5_27gy7gylvico1gl.R.inc(9725);IRI iri3 = IRI(TEST_ONTOLOGY_IRI_STRING);
        __CLR4_5_27gy7gylvico1gl.R.inc(9726);OWLOntologyID version2ID = new OWLOntologyID(of(iri3), of(version2IRI));
        __CLR4_5_27gy7gylvico1gl.R.inc(9727);assertNotEquals("version1 vs version2", version1ID.hashCode(),
                version2ID.hashCode());
        __CLR4_5_27gy7gylvico1gl.R.inc(9728);assertNotEquals("version1 vs version2", version1ID, version2ID);
    }finally{__CLR4_5_27gy7gylvico1gl.R.flushNeeded();}}
}
