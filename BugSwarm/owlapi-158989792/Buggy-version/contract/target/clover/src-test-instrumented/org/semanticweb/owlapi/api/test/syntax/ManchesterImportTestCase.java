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
import static org.semanticweb.owlapi.apibinding.OWLFunctionalSyntaxFactory.IRI;

import java.io.File;

import javax.annotation.Nonnull;

import org.junit.Test;
import org.semanticweb.owlapi.api.test.baseclasses.TestBase;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.OWLOntologyManager;
import org.semanticweb.owlapi.util.AutoIRIMapper;

@SuppressWarnings("javadoc")
public class ManchesterImportTestCase extends TestBase {static class __CLR4_5_28c08c0lvico1mo{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,10827,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Nonnull private final String str = "http://owlapitestontologies.com/thesuperont";
    @Nonnull private final String superpath = "/imports/thesuperont.omn";

    @Test
    public void testManualImports() throws OWLOntologyCreationException {__CLR4_5_28c08c0lvico1mo.R.globalSliceStart(getClass().getName(),10800);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2oi3jfn8c0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28c08c0lvico1mo.R.rethrow($CLV_t2$);}finally{__CLR4_5_28c08c0lvico1mo.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.ManchesterImportTestCase.testManualImports",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10800,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2oi3jfn8c0() throws OWLOntologyCreationException{try{__CLR4_5_28c08c0lvico1mo.R.inc(10800);
        __CLR4_5_28c08c0lvico1mo.R.inc(10801);OWLOntologyManager manager = getManager();
        __CLR4_5_28c08c0lvico1mo.R.inc(10802);manager.loadOntologyFromOntologyDocument(new File(RESOURCES, superpath));
        __CLR4_5_28c08c0lvico1mo.R.inc(10803);assertNotNull(manager.getOntology(IRI(str)));
    }finally{__CLR4_5_28c08c0lvico1mo.R.flushNeeded();}}

    private static OWLOntologyManager getManager() {try{__CLR4_5_28c08c0lvico1mo.R.inc(10804);
        __CLR4_5_28c08c0lvico1mo.R.inc(10805);OWLOntologyManager manager = setupManager();
        __CLR4_5_28c08c0lvico1mo.R.inc(10806);AutoIRIMapper mapper = new AutoIRIMapper(new File(RESOURCES, "imports"), true);
        __CLR4_5_28c08c0lvico1mo.R.inc(10807);manager.getIRIMappers().add(mapper);
        __CLR4_5_28c08c0lvico1mo.R.inc(10808);return manager;
    }finally{__CLR4_5_28c08c0lvico1mo.R.flushNeeded();}}

    @Test
    public void testRemoteIsParseable() throws OWLOntologyCreationException {__CLR4_5_28c08c0lvico1mo.R.globalSliceStart(getClass().getName(),10809);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2u4gi4y8c9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28c08c0lvico1mo.R.rethrow($CLV_t2$);}finally{__CLR4_5_28c08c0lvico1mo.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.ManchesterImportTestCase.testRemoteIsParseable",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10809,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2u4gi4y8c9() throws OWLOntologyCreationException{try{__CLR4_5_28c08c0lvico1mo.R.inc(10809);
        __CLR4_5_28c08c0lvico1mo.R.inc(10810);OWLOntologyManager manager = getManager();
        __CLR4_5_28c08c0lvico1mo.R.inc(10811);IRI iri = IRI(str);
        __CLR4_5_28c08c0lvico1mo.R.inc(10812);OWLOntology ontology = manager.loadOntology(iri);
        __CLR4_5_28c08c0lvico1mo.R.inc(10813);assertEquals(1, ontology.getAxioms().size());
        __CLR4_5_28c08c0lvico1mo.R.inc(10814);assertEquals(ontology.getOntologyID().getOntologyIRI().get(), iri);
        __CLR4_5_28c08c0lvico1mo.R.inc(10815);assertNotNull(manager.getOntology(iri));
    }finally{__CLR4_5_28c08c0lvico1mo.R.flushNeeded();}}

    @Test
    public void testEquivalentLoading() throws OWLOntologyCreationException {__CLR4_5_28c08c0lvico1mo.R.globalSliceStart(getClass().getName(),10816);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2g45a9z8cg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28c08c0lvico1mo.R.rethrow($CLV_t2$);}finally{__CLR4_5_28c08c0lvico1mo.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.ManchesterImportTestCase.testEquivalentLoading",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10816,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2g45a9z8cg() throws OWLOntologyCreationException{try{__CLR4_5_28c08c0lvico1mo.R.inc(10816);
        __CLR4_5_28c08c0lvico1mo.R.inc(10817);OWLOntologyManager managerStart = getManager();
        __CLR4_5_28c08c0lvico1mo.R.inc(10818);OWLOntology manualImport = managerStart.loadOntologyFromOntologyDocument(new File(RESOURCES, superpath));
        __CLR4_5_28c08c0lvico1mo.R.inc(10819);OWLOntologyManager managerTest = getManager();
        __CLR4_5_28c08c0lvico1mo.R.inc(10820);OWLOntology iriImport = managerTest.loadOntology(IRI(str));
        __CLR4_5_28c08c0lvico1mo.R.inc(10821);assertEquals(manualImport.getAxioms(), iriImport.getAxioms());
        __CLR4_5_28c08c0lvico1mo.R.inc(10822);assertEquals(manualImport.getOntologyID(), iriImport.getOntologyID());
    }finally{__CLR4_5_28c08c0lvico1mo.R.flushNeeded();}}

    @Test
    public void testImports() throws OWLOntologyCreationException {__CLR4_5_28c08c0lvico1mo.R.globalSliceStart(getClass().getName(),10823);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2f0q18d8cn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28c08c0lvico1mo.R.rethrow($CLV_t2$);}finally{__CLR4_5_28c08c0lvico1mo.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.ManchesterImportTestCase.testImports",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10823,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2f0q18d8cn() throws OWLOntologyCreationException{try{__CLR4_5_28c08c0lvico1mo.R.inc(10823);
        __CLR4_5_28c08c0lvico1mo.R.inc(10824);OWLOntologyManager manager = getManager();
        __CLR4_5_28c08c0lvico1mo.R.inc(10825);String subpath = "/imports/thesubont.omn";
        __CLR4_5_28c08c0lvico1mo.R.inc(10826);manager.loadOntologyFromOntologyDocument(new File(RESOURCES, subpath));
    }finally{__CLR4_5_28c08c0lvico1mo.R.flushNeeded();}}
}
