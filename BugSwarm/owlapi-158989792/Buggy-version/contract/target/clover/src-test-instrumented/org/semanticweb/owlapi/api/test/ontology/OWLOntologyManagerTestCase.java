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

import org.junit.Test;
import org.semanticweb.owlapi.api.test.baseclasses.TestBase;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyAlreadyExistsException;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.OWLOntologyDocumentAlreadyExistsException;
import org.semanticweb.owlapi.model.OWLOntologyID;
import org.semanticweb.owlapi.util.SimpleIRIMapper;

/**
 * @author Matthew Horridge, The University of Manchester, Information
 *         Management Group
 * @since 3.0.0
 */
@SuppressWarnings("javadoc")
public class OWLOntologyManagerTestCase extends TestBase {static class __CLR4_5_2796796lvico1fe{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,9471,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testCreateAnonymousOntology()
            throws OWLOntologyCreationException {__CLR4_5_2796796lvico1fe.R.globalSliceStart(getClass().getName(),9402);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22xwd2j796();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2796796lvico1fe.R.rethrow($CLV_t2$);}finally{__CLR4_5_2796796lvico1fe.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.ontology.OWLOntologyManagerTestCase.testCreateAnonymousOntology",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),9402,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22xwd2j796() throws OWLOntologyCreationException{try{__CLR4_5_2796796lvico1fe.R.inc(9402);
        __CLR4_5_2796796lvico1fe.R.inc(9403);OWLOntology ontology = m.createOntology();
        __CLR4_5_2796796lvico1fe.R.inc(9404);assertNotNull("ontology should not be null", ontology);
        __CLR4_5_2796796lvico1fe.R.inc(9405);assertNotNull("ontology id should not be null",
                ontology.getOntologyID());
        __CLR4_5_2796796lvico1fe.R.inc(9406);assertFalse(ontology.getOntologyID().getDefaultDocumentIRI()
                .isPresent());
        __CLR4_5_2796796lvico1fe.R.inc(9407);assertFalse(ontology.getOntologyID().getOntologyIRI().isPresent());
        __CLR4_5_2796796lvico1fe.R.inc(9408);assertFalse(ontology.getOntologyID().getVersionIRI().isPresent());
        __CLR4_5_2796796lvico1fe.R.inc(9409);assertNotNull("iri should not be null",
                m.getOntologyDocumentIRI(ontology));
    }finally{__CLR4_5_2796796lvico1fe.R.flushNeeded();}}

    @Test
    public void testCreateOntologyWithIRI() throws OWLOntologyCreationException {__CLR4_5_2796796lvico1fe.R.globalSliceStart(getClass().getName(),9410);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2u2iww479e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2796796lvico1fe.R.rethrow($CLV_t2$);}finally{__CLR4_5_2796796lvico1fe.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.ontology.OWLOntologyManagerTestCase.testCreateOntologyWithIRI",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),9410,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2u2iww479e() throws OWLOntologyCreationException{try{__CLR4_5_2796796lvico1fe.R.inc(9410);
        __CLR4_5_2796796lvico1fe.R.inc(9411);IRI ontologyIRI = IRI("http://www.semanticweb.org/ontologies/ontology");
        __CLR4_5_2796796lvico1fe.R.inc(9412);OWLOntology ontology = m.createOntology(ontologyIRI);
        __CLR4_5_2796796lvico1fe.R.inc(9413);assertNotNull("ontology should not be null", ontology);
        __CLR4_5_2796796lvico1fe.R.inc(9414);assertNotNull("ontology id should not be null",
                ontology.getOntologyID());
        __CLR4_5_2796796lvico1fe.R.inc(9415);assertEquals(ontologyIRI, ontology.getOntologyID()
                .getDefaultDocumentIRI().get());
        __CLR4_5_2796796lvico1fe.R.inc(9416);assertEquals(ontologyIRI, ontology.getOntologyID().getOntologyIRI()
                .get());
        __CLR4_5_2796796lvico1fe.R.inc(9417);assertFalse(ontology.getOntologyID().getVersionIRI().isPresent());
        __CLR4_5_2796796lvico1fe.R.inc(9418);assertEquals(ontologyIRI, m.getOntologyDocumentIRI(ontology));
    }finally{__CLR4_5_2796796lvico1fe.R.flushNeeded();}}

    @Test
    public void testCreateOntologyWithIRIAndVersionIRI()
            throws OWLOntologyCreationException {__CLR4_5_2796796lvico1fe.R.globalSliceStart(getClass().getName(),9419);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_293424779n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2796796lvico1fe.R.rethrow($CLV_t2$);}finally{__CLR4_5_2796796lvico1fe.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.ontology.OWLOntologyManagerTestCase.testCreateOntologyWithIRIAndVersionIRI",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),9419,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_293424779n() throws OWLOntologyCreationException{try{__CLR4_5_2796796lvico1fe.R.inc(9419);
        __CLR4_5_2796796lvico1fe.R.inc(9420);IRI ontologyIRI = IRI("http://www.semanticweb.org/ontologies/ontology");
        __CLR4_5_2796796lvico1fe.R.inc(9421);IRI versionIRI = IRI("http://www.semanticweb.org/ontologies/ontology/version");
        __CLR4_5_2796796lvico1fe.R.inc(9422);OWLOntology ontology = m.createOntology(new OWLOntologyID(
                of(ontologyIRI), of(versionIRI)));
        __CLR4_5_2796796lvico1fe.R.inc(9423);assertNotNull("ontology should not be null", ontology);
        __CLR4_5_2796796lvico1fe.R.inc(9424);assertNotNull("ontology id should not be null",
                ontology.getOntologyID());
        __CLR4_5_2796796lvico1fe.R.inc(9425);assertEquals(versionIRI, ontology.getOntologyID()
                .getDefaultDocumentIRI().get());
        __CLR4_5_2796796lvico1fe.R.inc(9426);assertEquals(ontologyIRI, ontology.getOntologyID().getOntologyIRI()
                .get());
        __CLR4_5_2796796lvico1fe.R.inc(9427);assertEquals(versionIRI, ontology.getOntologyID().getVersionIRI().get());
        __CLR4_5_2796796lvico1fe.R.inc(9428);assertEquals(versionIRI, m.getOntologyDocumentIRI(ontology));
    }finally{__CLR4_5_2796796lvico1fe.R.flushNeeded();}}

    @Test
    public void testCreateOntologyWithIRIWithMapper()
            throws OWLOntologyCreationException {__CLR4_5_2796796lvico1fe.R.globalSliceStart(getClass().getName(),9429);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27i8bx179x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2796796lvico1fe.R.rethrow($CLV_t2$);}finally{__CLR4_5_2796796lvico1fe.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.ontology.OWLOntologyManagerTestCase.testCreateOntologyWithIRIWithMapper",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),9429,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27i8bx179x() throws OWLOntologyCreationException{try{__CLR4_5_2796796lvico1fe.R.inc(9429);
        __CLR4_5_2796796lvico1fe.R.inc(9430);IRI ontologyIRI = IRI("http://www.semanticweb.org/ontologies/ontology");
        __CLR4_5_2796796lvico1fe.R.inc(9431);IRI documentIRI = IRI("file:documentIRI");
        __CLR4_5_2796796lvico1fe.R.inc(9432);SimpleIRIMapper mapper = new SimpleIRIMapper(ontologyIRI, documentIRI);
        __CLR4_5_2796796lvico1fe.R.inc(9433);m.getIRIMappers().add(mapper);
        __CLR4_5_2796796lvico1fe.R.inc(9434);OWLOntology ontology = m.createOntology(ontologyIRI);
        __CLR4_5_2796796lvico1fe.R.inc(9435);assertNotNull("ontology should not be null", ontology);
        __CLR4_5_2796796lvico1fe.R.inc(9436);assertNotNull("ontology id should not be null",
                ontology.getOntologyID());
        __CLR4_5_2796796lvico1fe.R.inc(9437);assertEquals(ontologyIRI, ontology.getOntologyID()
                .getDefaultDocumentIRI().get());
        __CLR4_5_2796796lvico1fe.R.inc(9438);assertEquals(ontologyIRI, ontology.getOntologyID().getOntologyIRI()
                .get());
        __CLR4_5_2796796lvico1fe.R.inc(9439);assertFalse(ontology.getOntologyID().getVersionIRI().isPresent());
        __CLR4_5_2796796lvico1fe.R.inc(9440);assertEquals(documentIRI, m.getOntologyDocumentIRI(ontology));
    }finally{__CLR4_5_2796796lvico1fe.R.flushNeeded();}}

    @Test
    public void testCreateOntologyWithIRIAndVersionIRIWithMapper()
            throws OWLOntologyCreationException {__CLR4_5_2796796lvico1fe.R.globalSliceStart(getClass().getName(),9441);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ljg8fk7a9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2796796lvico1fe.R.rethrow($CLV_t2$);}finally{__CLR4_5_2796796lvico1fe.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.ontology.OWLOntologyManagerTestCase.testCreateOntologyWithIRIAndVersionIRIWithMapper",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),9441,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ljg8fk7a9() throws OWLOntologyCreationException{try{__CLR4_5_2796796lvico1fe.R.inc(9441);
        __CLR4_5_2796796lvico1fe.R.inc(9442);IRI ontologyIRI = IRI("http://www.semanticweb.org/ontologies/ontology");
        __CLR4_5_2796796lvico1fe.R.inc(9443);IRI versionIRI = IRI("http://www.semanticweb.org/ontologies/ontology/version");
        __CLR4_5_2796796lvico1fe.R.inc(9444);IRI documentIRI = IRI("file:documentIRI");
        __CLR4_5_2796796lvico1fe.R.inc(9445);SimpleIRIMapper mapper = new SimpleIRIMapper(versionIRI, documentIRI);
        __CLR4_5_2796796lvico1fe.R.inc(9446);m.getIRIMappers().add(mapper);
        __CLR4_5_2796796lvico1fe.R.inc(9447);OWLOntology ontology = m.createOntology(new OWLOntologyID(
                of(ontologyIRI), of(versionIRI)));
        __CLR4_5_2796796lvico1fe.R.inc(9448);assertNotNull("ontology should not be null", ontology);
        __CLR4_5_2796796lvico1fe.R.inc(9449);assertNotNull("ontology id should not be null",
                ontology.getOntologyID());
        __CLR4_5_2796796lvico1fe.R.inc(9450);assertEquals(versionIRI, ontology.getOntologyID()
                .getDefaultDocumentIRI().get());
        __CLR4_5_2796796lvico1fe.R.inc(9451);assertEquals(ontologyIRI, ontology.getOntologyID().getOntologyIRI()
                .get());
        __CLR4_5_2796796lvico1fe.R.inc(9452);assertEquals(versionIRI, ontology.getOntologyID().getVersionIRI().get());
        __CLR4_5_2796796lvico1fe.R.inc(9453);assertEquals(documentIRI, m.getOntologyDocumentIRI(ontology));
    }finally{__CLR4_5_2796796lvico1fe.R.flushNeeded();}}

    @Test(expected = OWLOntologyAlreadyExistsException.class)
    public void testCreateDuplicateOntologyWithIRI()
            throws OWLOntologyCreationException {__CLR4_5_2796796lvico1fe.R.globalSliceStart(getClass().getName(),9454);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25o0s3v7am();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,114,101,97,116,101,68,117,112,108,105,99,97,116,101,79,110,116,111,108,111,103,121,87,105,116,104,73,82,73,58,32,91,79,87,76,79,110,116,111,108,111,103,121,65,108,114,101,97,100,121,69,120,105,115,116,115,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof OWLOntologyAlreadyExistsException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2796796lvico1fe.R.rethrow($CLV_t2$);}finally{__CLR4_5_2796796lvico1fe.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.ontology.OWLOntologyManagerTestCase.testCreateDuplicateOntologyWithIRI",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),9454,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25o0s3v7am() throws OWLOntologyCreationException{try{__CLR4_5_2796796lvico1fe.R.inc(9454);
        __CLR4_5_2796796lvico1fe.R.inc(9455);IRI ontologyIRI = IRI("http://www.semanticweb.org/ontologies/ontology");
        __CLR4_5_2796796lvico1fe.R.inc(9456);m.createOntology(ontologyIRI);
        __CLR4_5_2796796lvico1fe.R.inc(9457);m.createOntology(ontologyIRI);
    }finally{__CLR4_5_2796796lvico1fe.R.flushNeeded();}}

    @Test(expected = OWLOntologyAlreadyExistsException.class)
    public void testCreateDuplicateOntologyWithIRIAndVersionIRI()
            throws OWLOntologyCreationException {__CLR4_5_2796796lvico1fe.R.globalSliceStart(getClass().getName(),9458);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29hvvw87aq();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,114,101,97,116,101,68,117,112,108,105,99,97,116,101,79,110,116,111,108,111,103,121,87,105,116,104,73,82,73,65,110,100,86,101,114,115,105,111,110,73,82,73,58,32,91,79,87,76,79,110,116,111,108,111,103,121,65,108,114,101,97,100,121,69,120,105,115,116,115,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof OWLOntologyAlreadyExistsException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2796796lvico1fe.R.rethrow($CLV_t2$);}finally{__CLR4_5_2796796lvico1fe.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.ontology.OWLOntologyManagerTestCase.testCreateDuplicateOntologyWithIRIAndVersionIRI",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),9458,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29hvvw87aq() throws OWLOntologyCreationException{try{__CLR4_5_2796796lvico1fe.R.inc(9458);
        __CLR4_5_2796796lvico1fe.R.inc(9459);IRI ontologyIRI = IRI("http://www.semanticweb.org/ontologies/ontology");
        __CLR4_5_2796796lvico1fe.R.inc(9460);IRI versionIRI = IRI("http://www.semanticweb.org/ontologies/ontology");
        __CLR4_5_2796796lvico1fe.R.inc(9461);m.createOntology(new OWLOntologyID(of(ontologyIRI), of(versionIRI)));
        __CLR4_5_2796796lvico1fe.R.inc(9462);m.createOntology(new OWLOntologyID(of(ontologyIRI), of(versionIRI)));
    }finally{__CLR4_5_2796796lvico1fe.R.flushNeeded();}}

    @Test(expected = OWLOntologyDocumentAlreadyExistsException.class)
    public void testCreateDuplicatedDocumentIRI()
            throws OWLOntologyCreationException {__CLR4_5_2796796lvico1fe.R.globalSliceStart(getClass().getName(),9463);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xsy0n97av();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,114,101,97,116,101,68,117,112,108,105,99,97,116,101,100,68,111,99,117,109,101,110,116,73,82,73,58,32,91,79,87,76,79,110,116,111,108,111,103,121,68,111,99,117,109,101,110,116,65,108,114,101,97,100,121,69,120,105,115,116,115,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof OWLOntologyDocumentAlreadyExistsException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2796796lvico1fe.R.rethrow($CLV_t2$);}finally{__CLR4_5_2796796lvico1fe.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.ontology.OWLOntologyManagerTestCase.testCreateDuplicatedDocumentIRI",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),9463,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xsy0n97av() throws OWLOntologyCreationException{try{__CLR4_5_2796796lvico1fe.R.inc(9463);
        __CLR4_5_2796796lvico1fe.R.inc(9464);IRI ontologyIRI = IRI("http://www.semanticweb.org/ontologies/ontology");
        __CLR4_5_2796796lvico1fe.R.inc(9465);IRI ontologyIRI2 = IRI("http://www.semanticweb.org/ontologies/ontology2");
        __CLR4_5_2796796lvico1fe.R.inc(9466);IRI documentIRI = IRI("file:documentIRI");
        __CLR4_5_2796796lvico1fe.R.inc(9467);m.getIRIMappers().add(new SimpleIRIMapper(ontologyIRI, documentIRI));
        __CLR4_5_2796796lvico1fe.R.inc(9468);m.getIRIMappers().add(new SimpleIRIMapper(ontologyIRI2, documentIRI));
        __CLR4_5_2796796lvico1fe.R.inc(9469);m.createOntology(new OWLOntologyID(of(ontologyIRI), of((IRI) null)));
        __CLR4_5_2796796lvico1fe.R.inc(9470);m.createOntology(new OWLOntologyID(of(ontologyIRI2), of((IRI) null)));
    }finally{__CLR4_5_2796796lvico1fe.R.flushNeeded();}}
}
