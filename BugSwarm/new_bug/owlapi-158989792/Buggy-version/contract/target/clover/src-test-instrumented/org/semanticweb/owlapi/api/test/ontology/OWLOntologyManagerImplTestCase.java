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

import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;

import javax.annotation.Nonnull;

import org.junit.Before;
import org.junit.Test;
import org.semanticweb.owlapi.io.OWLOntologyDocumentSourceBase;
import org.semanticweb.owlapi.model.*;

import uk.ac.manchester.cs.owl.owlapi.OWLDataFactoryImpl;
import uk.ac.manchester.cs.owl.owlapi.OWLOntologyFactoryImpl;
import uk.ac.manchester.cs.owl.owlapi.OWLOntologyImpl;
import uk.ac.manchester.cs.owl.owlapi.OWLOntologyManagerImpl;

/**
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.0.0
 */
@SuppressWarnings({ "javadoc", })
public class OWLOntologyManagerImplTestCase {static class __CLR4_5_277o77olvico1ez{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,9398,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private OWLOntologyManager manager;

    @Before
    public void setUp() {try{__CLR4_5_277o77olvico1ez.R.inc(9348);
        __CLR4_5_277o77olvico1ez.R.inc(9349);manager = new OWLOntologyManagerImpl(new OWLDataFactoryImpl(), new ReentrantReadWriteLock());
        __CLR4_5_277o77olvico1ez.R.inc(9350);OWLOntologyBuilder builder = new OWLOntologyBuilder() {

            @Nonnull
            @Override
            public OWLOntology createOWLOntology(@Nonnull OWLOntologyManager manager,
                @Nonnull OWLOntologyID ontologyID) {try{__CLR4_5_277o77olvico1ez.R.inc(9351);
                __CLR4_5_277o77olvico1ez.R.inc(9352);return new OWLOntologyImpl(manager, ontologyID);
            }finally{__CLR4_5_277o77olvico1ez.R.flushNeeded();}}
        };
        __CLR4_5_277o77olvico1ez.R.inc(9353);manager.getOntologyFactories().add(new OWLOntologyFactoryImpl(builder));
    }finally{__CLR4_5_277o77olvico1ez.R.flushNeeded();}}

    @Test
    public void testContains() throws OWLOntologyCreationException {__CLR4_5_277o77olvico1ez.R.globalSliceStart(getClass().getName(),9354);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2y9zhfs77u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_277o77olvico1ez.R.rethrow($CLV_t2$);}finally{__CLR4_5_277o77olvico1ez.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.ontology.OWLOntologyManagerImplTestCase.testContains",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),9354,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2y9zhfs77u() throws OWLOntologyCreationException{try{__CLR4_5_277o77olvico1ez.R.inc(9354);
        __CLR4_5_277o77olvico1ez.R.inc(9355);OWLOntology ont = manager.createOntology(OWLOntologyDocumentSourceBase.getNextDocumentIRI("urn:testontology"));
        __CLR4_5_277o77olvico1ez.R.inc(9356);assertTrue(manager.contains(ont.getOntologyID()));
        __CLR4_5_277o77olvico1ez.R.inc(9357);assertNotNull("ontology should not be null", manager.getOntology(ont.getOntologyID()));
        __CLR4_5_277o77olvico1ez.R.inc(9358);assertTrue(manager.getOntologies().contains(ont));
        __CLR4_5_277o77olvico1ez.R.inc(9359);assertNotNull("IRI should not be null", manager.getOntologyDocumentIRI(ont));
        __CLR4_5_277o77olvico1ez.R.inc(9360);manager.removeOntology(ont);
        __CLR4_5_277o77olvico1ez.R.inc(9361);assertFalse(manager.contains(ont.getOntologyID()));
    }finally{__CLR4_5_277o77olvico1ez.R.flushNeeded();}}

    @Test
    public void testImports() throws OWLOntologyCreationException {__CLR4_5_277o77olvico1ez.R.globalSliceStart(getClass().getName(),9362);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2f0q18d782();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_277o77olvico1ez.R.rethrow($CLV_t2$);}finally{__CLR4_5_277o77olvico1ez.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.ontology.OWLOntologyManagerImplTestCase.testImports",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),9362,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2f0q18d782() throws OWLOntologyCreationException{try{__CLR4_5_277o77olvico1ez.R.inc(9362);
        __CLR4_5_277o77olvico1ez.R.inc(9363);OWLOntology ontA = manager.createOntology(OWLOntologyDocumentSourceBase.getNextDocumentIRI("urn:testontology"));
        __CLR4_5_277o77olvico1ez.R.inc(9364);OWLOntology ontB = manager.createOntology(OWLOntologyDocumentSourceBase.getNextDocumentIRI("urn:testontology"));
        __CLR4_5_277o77olvico1ez.R.inc(9365);OWLImportsDeclaration decl = manager.getOWLDataFactory().getOWLImportsDeclaration(ontB.getOntologyID()
            .getOntologyIRI().get());
        __CLR4_5_277o77olvico1ez.R.inc(9366);manager.applyChange(new AddImport(ontA, decl));
        __CLR4_5_277o77olvico1ez.R.inc(9367);assertTrue(manager.getDirectImports(ontA).contains(ontB));
        __CLR4_5_277o77olvico1ez.R.inc(9368);manager.removeOntology(ontB);
        __CLR4_5_277o77olvico1ez.R.inc(9369);assertFalse(manager.getDirectImports(ontA).contains(ontB));
    }finally{__CLR4_5_277o77olvico1ez.R.flushNeeded();}}

    @Test
    public void testImportsClosure() throws OWLException {__CLR4_5_277o77olvico1ez.R.globalSliceStart(getClass().getName(),9370);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2u2tuh278a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_277o77olvico1ez.R.rethrow($CLV_t2$);}finally{__CLR4_5_277o77olvico1ez.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.ontology.OWLOntologyManagerImplTestCase.testImportsClosure",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),9370,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2u2tuh278a() throws OWLException{try{__CLR4_5_277o77olvico1ez.R.inc(9370);
        // OntA -> OntB -> OntC (-> means imports)
        __CLR4_5_277o77olvico1ez.R.inc(9371);OWLOntology ontA = manager.createOntology(OWLOntologyDocumentSourceBase.getNextDocumentIRI("urn:testontology"));
        __CLR4_5_277o77olvico1ez.R.inc(9372);OWLOntology ontB = manager.createOntology(OWLOntologyDocumentSourceBase.getNextDocumentIRI("urn:testontology"));
        __CLR4_5_277o77olvico1ez.R.inc(9373);OWLOntology ontC = manager.createOntology(OWLOntologyDocumentSourceBase.getNextDocumentIRI("urn:testontology"));
        __CLR4_5_277o77olvico1ez.R.inc(9374);OWLImportsDeclaration declA = manager.getOWLDataFactory().getOWLImportsDeclaration(ontB.getOntologyID()
            .getOntologyIRI().get());
        __CLR4_5_277o77olvico1ez.R.inc(9375);OWLImportsDeclaration declB = manager.getOWLDataFactory().getOWLImportsDeclaration(ontC.getOntologyID()
            .getOntologyIRI().get());
        __CLR4_5_277o77olvico1ez.R.inc(9376);manager.applyChange(new AddImport(ontA, declA));
        __CLR4_5_277o77olvico1ez.R.inc(9377);manager.applyChange(new AddImport(ontB, declB));
        __CLR4_5_277o77olvico1ez.R.inc(9378);assertTrue(manager.getImportsClosure(ontA).contains(ontA));
        __CLR4_5_277o77olvico1ez.R.inc(9379);assertTrue(manager.getImportsClosure(ontA).contains(ontB));
        __CLR4_5_277o77olvico1ez.R.inc(9380);assertTrue(manager.getImportsClosure(ontA).contains(ontC));
        __CLR4_5_277o77olvico1ez.R.inc(9381);assertTrue(manager.getImportsClosure(ontB).contains(ontB));
        __CLR4_5_277o77olvico1ez.R.inc(9382);assertTrue(manager.getImportsClosure(ontB).contains(ontC));
    }finally{__CLR4_5_277o77olvico1ez.R.flushNeeded();}}

    @Test
    public void testImportsLoad() throws OWLException {__CLR4_5_277o77olvico1ez.R.globalSliceStart(getClass().getName(),9383);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2r0zb7t78n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_277o77olvico1ez.R.rethrow($CLV_t2$);}finally{__CLR4_5_277o77olvico1ez.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.ontology.OWLOntologyManagerImplTestCase.testImportsLoad",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),9383,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2r0zb7t78n() throws OWLException{try{__CLR4_5_277o77olvico1ez.R.inc(9383);
        __CLR4_5_277o77olvico1ez.R.inc(9384);OWLOntology ontA = manager.createOntology(IRI.create("a"));
        __CLR4_5_277o77olvico1ez.R.inc(9385);assertTrue(ontA.getDirectImports().size() == 0);
        __CLR4_5_277o77olvico1ez.R.inc(9386);IRI b = IRI.create("b");
        __CLR4_5_277o77olvico1ez.R.inc(9387);OWLImportsDeclaration declB = manager.getOWLDataFactory().getOWLImportsDeclaration(b);
        __CLR4_5_277o77olvico1ez.R.inc(9388);manager.applyChange(new AddImport(ontA, declB));
        __CLR4_5_277o77olvico1ez.R.inc(9389);Set<IRI> directImportsDocuments = ontA.getDirectImportsDocuments();
        __CLR4_5_277o77olvico1ez.R.inc(9390);assertEquals(1, directImportsDocuments.size());
        __CLR4_5_277o77olvico1ez.R.inc(9391);assertTrue(directImportsDocuments.contains(b));
        __CLR4_5_277o77olvico1ez.R.inc(9392);OWLOntology ontB = manager.createOntology(b);
        __CLR4_5_277o77olvico1ez.R.inc(9393);directImportsDocuments = ontA.getDirectImportsDocuments();
        __CLR4_5_277o77olvico1ez.R.inc(9394);assertEquals(1, directImportsDocuments.size());
        __CLR4_5_277o77olvico1ez.R.inc(9395);assertTrue(directImportsDocuments.contains(b));
        __CLR4_5_277o77olvico1ez.R.inc(9396);assertEquals(1, ontA.getDirectImports().size());
        __CLR4_5_277o77olvico1ez.R.inc(9397);assertTrue(ontA.getDirectImports().contains(ontB));
    }finally{__CLR4_5_277o77olvico1ez.R.flushNeeded();}}
}
