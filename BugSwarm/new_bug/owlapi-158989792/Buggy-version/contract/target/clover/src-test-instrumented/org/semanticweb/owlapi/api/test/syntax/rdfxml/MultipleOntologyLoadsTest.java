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
package org.semanticweb.owlapi.api.test.syntax.rdfxml;

import static org.junit.Assert.assertEquals;
import static org.semanticweb.owlapi.apibinding.OWLFunctionalSyntaxFactory.IRI;

import java.io.IOException;

import javax.annotation.Nonnull;

import org.junit.Test;
import org.semanticweb.owlapi.api.test.baseclasses.TestBase;
import org.semanticweb.owlapi.io.OWLOntologyDocumentSource;
import org.semanticweb.owlapi.io.OWLParser;
import org.semanticweb.owlapi.io.StreamDocumentSource;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyAlreadyExistsException;
import org.semanticweb.owlapi.model.OWLOntologyID;
import org.semanticweb.owlapi.rdf.rdfxml.parser.RDFXMLParser;

import com.google.common.base.Optional;

/**
 * Tests the loading of a single ontology multiple times, using the same
 * ontologyIRI in the {@link OWLOntologyID} as that used in the actual ontology
 * that is being imported.
 * 
 * @author Peter Ansell p_ansell@yahoo.com
 */
@SuppressWarnings({ "javadoc", })
public class MultipleOntologyLoadsTest extends TestBase {static class __CLR4_5_29bd9bdlvico208{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,12152,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final IRI CREATEV1 = IRI("http://test.example.org/ontology/0139/version:1");
    private static final IRI CREATEV2 = IRI("http://test.example.org/ontology/0139/version:2");
    private static final IRI CREATE0139 = IRI("http://test.example.org/ontology/0139");

    @Test(expected = OWLOntologyAlreadyExistsException.class)
    public void testMultipleVersionLoadChangeIRI() throws Exception {__CLR4_5_29bd9bdlvico208.R.globalSliceStart(getClass().getName(),12073);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2prpl2z9bd();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,77,117,108,116,105,112,108,101,86,101,114,115,105,111,110,76,111,97,100,67,104,97,110,103,101,73,82,73,58,32,91,79,87,76,79,110,116,111,108,111,103,121,65,108,114,101,97,100,121,69,120,105,115,116,115,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof OWLOntologyAlreadyExistsException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29bd9bdlvico208.R.rethrow($CLV_t2$);}finally{__CLR4_5_29bd9bdlvico208.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.rdfxml.MultipleOntologyLoadsTest.testMultipleVersionLoadChangeIRI",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),12073,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2prpl2z9bd() throws Exception{try{__CLR4_5_29bd9bdlvico208.R.inc(12073);
        // given
        __CLR4_5_29bd9bdlvico208.R.inc(12074);OWLOntologyDocumentSource initialDocumentSource = getDocumentSource();
        __CLR4_5_29bd9bdlvico208.R.inc(12075);OWLOntologyID expected = new OWLOntologyID(Optional.of(CREATE0139), Optional.of(CREATEV2));
        __CLR4_5_29bd9bdlvico208.R.inc(12076);OWLOntologyID initialUniqueOWLOntologyID = new OWLOntologyID(Optional.of(CREATE0139), Optional.of(CREATEV2));
        __CLR4_5_29bd9bdlvico208.R.inc(12077);OWLOntology initialOntology = m.createOntology(initialUniqueOWLOntologyID);
        __CLR4_5_29bd9bdlvico208.R.inc(12078);parseOnto(initialDocumentSource, initialOntology);
        __CLR4_5_29bd9bdlvico208.R.inc(12079);OWLOntologyID secondUniqueOWLOntologyID = new OWLOntologyID(Optional.of(CREATE0139), Optional.of(CREATEV2));
        // when
        __CLR4_5_29bd9bdlvico208.R.inc(12080);try {
            __CLR4_5_29bd9bdlvico208.R.inc(12081);m.createOntology(secondUniqueOWLOntologyID);
        } catch (OWLOntologyAlreadyExistsException e) {
            // then
            __CLR4_5_29bd9bdlvico208.R.inc(12082);assertEquals(expected, e.getOntologyID());
            __CLR4_5_29bd9bdlvico208.R.inc(12083);throw e;
        }
    }finally{__CLR4_5_29bd9bdlvico208.R.flushNeeded();}}

    @Test(expected = OWLOntologyAlreadyExistsException.class)
    public void testMultipleVersionLoadNoChange() throws Exception {__CLR4_5_29bd9bdlvico208.R.globalSliceStart(getClass().getName(),12084);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a6vsfg9bo();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,77,117,108,116,105,112,108,101,86,101,114,115,105,111,110,76,111,97,100,78,111,67,104,97,110,103,101,58,32,91,79,87,76,79,110,116,111,108,111,103,121,65,108,114,101,97,100,121,69,120,105,115,116,115,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof OWLOntologyAlreadyExistsException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29bd9bdlvico208.R.rethrow($CLV_t2$);}finally{__CLR4_5_29bd9bdlvico208.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.rdfxml.MultipleOntologyLoadsTest.testMultipleVersionLoadNoChange",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),12084,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a6vsfg9bo() throws Exception{try{__CLR4_5_29bd9bdlvico208.R.inc(12084);
        // given
        __CLR4_5_29bd9bdlvico208.R.inc(12085);OWLOntologyDocumentSource documentSource = getDocumentSource();
        __CLR4_5_29bd9bdlvico208.R.inc(12086);OWLOntologyID expected = new OWLOntologyID(Optional.of(CREATE0139), Optional.of(CREATEV1));
        __CLR4_5_29bd9bdlvico208.R.inc(12087);OWLOntologyID initialUniqueOWLOntologyID = new OWLOntologyID(Optional.of(CREATE0139), Optional.of(CREATEV1));
        __CLR4_5_29bd9bdlvico208.R.inc(12088);OWLOntology initialOntology = m.createOntology(initialUniqueOWLOntologyID);
        __CLR4_5_29bd9bdlvico208.R.inc(12089);parseOnto(documentSource, initialOntology);
        __CLR4_5_29bd9bdlvico208.R.inc(12090);OWLOntologyID secondUniqueOWLOntologyID = new OWLOntologyID(Optional.of(CREATE0139), Optional.of(CREATEV1));
        // when
        __CLR4_5_29bd9bdlvico208.R.inc(12091);try {
            __CLR4_5_29bd9bdlvico208.R.inc(12092);m.createOntology(secondUniqueOWLOntologyID);
        } catch (OWLOntologyAlreadyExistsException e) {
            // then
            __CLR4_5_29bd9bdlvico208.R.inc(12093);assertEquals(expected, e.getOntologyID());
            __CLR4_5_29bd9bdlvico208.R.inc(12094);throw e;
        }
    }finally{__CLR4_5_29bd9bdlvico208.R.flushNeeded();}}

    @Test
    public void testMultipleVersionLoadsExplicitOntologyIDs() throws Exception {__CLR4_5_29bd9bdlvico208.R.globalSliceStart(getClass().getName(),12095);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2p6r75x9bz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29bd9bdlvico208.R.rethrow($CLV_t2$);}finally{__CLR4_5_29bd9bdlvico208.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.rdfxml.MultipleOntologyLoadsTest.testMultipleVersionLoadsExplicitOntologyIDs",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),12095,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2p6r75x9bz() throws Exception{try{__CLR4_5_29bd9bdlvico208.R.inc(12095);
        // given
        __CLR4_5_29bd9bdlvico208.R.inc(12096);OWLOntologyDocumentSource documentSource = getDocumentSource();
        __CLR4_5_29bd9bdlvico208.R.inc(12097);OWLOntologyID initialUniqueOWLOntologyID = new OWLOntologyID(Optional.of(CREATE0139), Optional.of(CREATEV1));
        __CLR4_5_29bd9bdlvico208.R.inc(12098);OWLOntologyDocumentSource secondDocumentSource = getDocumentSource();
        __CLR4_5_29bd9bdlvico208.R.inc(12099);OWLOntologyID secondUniqueOWLOntologyID = new OWLOntologyID(Optional.of(CREATE0139), Optional.of(CREATEV2));
        // when
        __CLR4_5_29bd9bdlvico208.R.inc(12100);OWLOntology initialOntology = m.createOntology(initialUniqueOWLOntologyID);
        __CLR4_5_29bd9bdlvico208.R.inc(12101);parseOnto(documentSource, initialOntology);
        __CLR4_5_29bd9bdlvico208.R.inc(12102);OWLOntology secondOntology = m.createOntology(secondUniqueOWLOntologyID);
        __CLR4_5_29bd9bdlvico208.R.inc(12103);parseOnto(secondDocumentSource, secondOntology);
        // then
        __CLR4_5_29bd9bdlvico208.R.inc(12104);assertEquals(CREATE0139, initialOntology.getOntologyID().getOntologyIRI().get());
        __CLR4_5_29bd9bdlvico208.R.inc(12105);assertEquals(CREATEV1, initialOntology.getOntologyID().getVersionIRI().get());
        __CLR4_5_29bd9bdlvico208.R.inc(12106);assertEquals(CREATE0139, secondOntology.getOntologyID().getOntologyIRI().get());
        __CLR4_5_29bd9bdlvico208.R.inc(12107);assertEquals(CREATEV2, secondOntology.getOntologyID().getVersionIRI().get());
    }finally{__CLR4_5_29bd9bdlvico208.R.flushNeeded();}}

    @Test
    public void testMultipleVersionLoadsNoOntologyIDFirstTime() throws Exception {__CLR4_5_29bd9bdlvico208.R.globalSliceStart(getClass().getName(),12108);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2w308e69cc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29bd9bdlvico208.R.rethrow($CLV_t2$);}finally{__CLR4_5_29bd9bdlvico208.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.rdfxml.MultipleOntologyLoadsTest.testMultipleVersionLoadsNoOntologyIDFirstTime",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),12108,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2w308e69cc() throws Exception{try{__CLR4_5_29bd9bdlvico208.R.inc(12108);
        // given
        __CLR4_5_29bd9bdlvico208.R.inc(12109);OWLOntologyDocumentSource documentSource = getDocumentSource();
        __CLR4_5_29bd9bdlvico208.R.inc(12110);OWLOntologyDocumentSource secondDocumentSource = getDocumentSource();
        __CLR4_5_29bd9bdlvico208.R.inc(12111);OWLOntologyID secondUniqueOWLOntologyID = new OWLOntologyID(Optional.of(CREATE0139), Optional.of(CREATEV2));
        // when
        __CLR4_5_29bd9bdlvico208.R.inc(12112);OWLOntology initialOntology = m.createOntology();
        __CLR4_5_29bd9bdlvico208.R.inc(12113);parseOnto(documentSource, initialOntology);
        __CLR4_5_29bd9bdlvico208.R.inc(12114);OWLOntology secondOntology = m.createOntology(secondUniqueOWLOntologyID);
        __CLR4_5_29bd9bdlvico208.R.inc(12115);parseOnto(secondDocumentSource, secondOntology);
        // then
        __CLR4_5_29bd9bdlvico208.R.inc(12116);assertEquals(CREATE0139, initialOntology.getOntologyID().getOntologyIRI().get());
        __CLR4_5_29bd9bdlvico208.R.inc(12117);assertEquals(CREATEV1, initialOntology.getOntologyID().getVersionIRI().get());
        __CLR4_5_29bd9bdlvico208.R.inc(12118);assertEquals(CREATE0139, secondOntology.getOntologyID().getOntologyIRI().get());
        __CLR4_5_29bd9bdlvico208.R.inc(12119);assertEquals(CREATEV2, secondOntology.getOntologyID().getVersionIRI().get());
    }finally{__CLR4_5_29bd9bdlvico208.R.flushNeeded();}}

    @Test
    public void testMultipleVersionLoadsNoOntologyVersionIRIFirstTime() throws Exception {__CLR4_5_29bd9bdlvico208.R.globalSliceStart(getClass().getName(),12120);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a3th799co();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29bd9bdlvico208.R.rethrow($CLV_t2$);}finally{__CLR4_5_29bd9bdlvico208.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.rdfxml.MultipleOntologyLoadsTest.testMultipleVersionLoadsNoOntologyVersionIRIFirstTime",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),12120,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a3th799co() throws Exception{try{__CLR4_5_29bd9bdlvico208.R.inc(12120);
        // given
        __CLR4_5_29bd9bdlvico208.R.inc(12121);OWLOntologyDocumentSource documentSource = getDocumentSource();
        __CLR4_5_29bd9bdlvico208.R.inc(12122);OWLOntologyID initialUniqueOWLOntologyID = new OWLOntologyID(Optional.of(CREATE0139), Optional.<IRI> absent());
        __CLR4_5_29bd9bdlvico208.R.inc(12123);OWLOntologyDocumentSource secondDocumentSource = getDocumentSource();
        __CLR4_5_29bd9bdlvico208.R.inc(12124);OWLOntologyID secondUniqueOWLOntologyID = new OWLOntologyID(Optional.of(CREATE0139), Optional.of(CREATEV2));
        // when
        __CLR4_5_29bd9bdlvico208.R.inc(12125);OWLOntology initialOntology = m.createOntology(initialUniqueOWLOntologyID);
        __CLR4_5_29bd9bdlvico208.R.inc(12126);parseOnto(documentSource, initialOntology);
        __CLR4_5_29bd9bdlvico208.R.inc(12127);OWLOntology secondOntology = m.createOntology(secondUniqueOWLOntologyID);
        __CLR4_5_29bd9bdlvico208.R.inc(12128);parseOnto(secondDocumentSource, secondOntology);
        // then
        __CLR4_5_29bd9bdlvico208.R.inc(12129);assertEquals(CREATE0139, initialOntology.getOntologyID().getOntologyIRI().get());
        __CLR4_5_29bd9bdlvico208.R.inc(12130);assertEquals(CREATEV1, initialOntology.getOntologyID().getVersionIRI().get());
        __CLR4_5_29bd9bdlvico208.R.inc(12131);assertEquals(CREATE0139, secondOntology.getOntologyID().getOntologyIRI().get());
        __CLR4_5_29bd9bdlvico208.R.inc(12132);assertEquals(CREATEV2, secondOntology.getOntologyID().getVersionIRI().get());
    }finally{__CLR4_5_29bd9bdlvico208.R.flushNeeded();}}

    @Test
    public void testSingleVersionLoadChangeIRI() throws Exception {__CLR4_5_29bd9bdlvico208.R.globalSliceStart(getClass().getName(),12133);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26j811p9d1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29bd9bdlvico208.R.rethrow($CLV_t2$);}finally{__CLR4_5_29bd9bdlvico208.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.rdfxml.MultipleOntologyLoadsTest.testSingleVersionLoadChangeIRI",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),12133,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26j811p9d1() throws Exception{try{__CLR4_5_29bd9bdlvico208.R.inc(12133);
        // given
        __CLR4_5_29bd9bdlvico208.R.inc(12134);OWLOntologyDocumentSource secondDocumentSource = getDocumentSource();
        __CLR4_5_29bd9bdlvico208.R.inc(12135);OWLOntologyID secondUniqueOWLOntologyID = new OWLOntologyID(Optional.of(CREATE0139), Optional.of(CREATEV2));
        // when
        __CLR4_5_29bd9bdlvico208.R.inc(12136);OWLOntology secondOntology = m.createOntology(secondUniqueOWLOntologyID);
        __CLR4_5_29bd9bdlvico208.R.inc(12137);parseOnto(secondDocumentSource, secondOntology);
        // then
        __CLR4_5_29bd9bdlvico208.R.inc(12138);assertEquals(CREATE0139, secondOntology.getOntologyID().getOntologyIRI().get());
        __CLR4_5_29bd9bdlvico208.R.inc(12139);assertEquals(CREATEV2, secondOntology.getOntologyID().getVersionIRI().get());
    }finally{__CLR4_5_29bd9bdlvico208.R.flushNeeded();}}

    @Test
    public void testSingleVersionLoadNoChange() throws Exception {__CLR4_5_29bd9bdlvico208.R.globalSliceStart(getClass().getName(),12140);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_281ggs9d8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29bd9bdlvico208.R.rethrow($CLV_t2$);}finally{__CLR4_5_29bd9bdlvico208.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.rdfxml.MultipleOntologyLoadsTest.testSingleVersionLoadNoChange",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),12140,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_281ggs9d8() throws Exception{try{__CLR4_5_29bd9bdlvico208.R.inc(12140);
        // given
        __CLR4_5_29bd9bdlvico208.R.inc(12141);OWLOntologyDocumentSource documentSource = getDocumentSource();
        __CLR4_5_29bd9bdlvico208.R.inc(12142);OWLOntologyID initialUniqueOWLOntologyID = new OWLOntologyID(Optional.of(CREATE0139), Optional.of(CREATEV1));
        // when
        __CLR4_5_29bd9bdlvico208.R.inc(12143);OWLOntology initialOntology = m.createOntology(initialUniqueOWLOntologyID);
        __CLR4_5_29bd9bdlvico208.R.inc(12144);parseOnto(documentSource, initialOntology);
        // then
        __CLR4_5_29bd9bdlvico208.R.inc(12145);assertEquals(CREATE0139, initialOntology.getOntologyID().getOntologyIRI().get());
        __CLR4_5_29bd9bdlvico208.R.inc(12146);assertEquals(CREATEV1, initialOntology.getOntologyID().getVersionIRI().get());
    }finally{__CLR4_5_29bd9bdlvico208.R.flushNeeded();}}

    private void parseOnto(@Nonnull OWLOntologyDocumentSource initialDocumentSource,
        @Nonnull OWLOntology initialOntology) throws IOException {try{__CLR4_5_29bd9bdlvico208.R.inc(12147);
        __CLR4_5_29bd9bdlvico208.R.inc(12148);OWLParser initialParser = new RDFXMLParser();
        __CLR4_5_29bd9bdlvico208.R.inc(12149);initialParser.parse(initialDocumentSource, initialOntology, config);
    }finally{__CLR4_5_29bd9bdlvico208.R.flushNeeded();}}

    @Nonnull
    private OWLOntologyDocumentSource getDocumentSource() {try{__CLR4_5_29bd9bdlvico208.R.inc(12150);
        __CLR4_5_29bd9bdlvico208.R.inc(12151);return new StreamDocumentSource(getClass().getResourceAsStream("/owlapi/multipleOntologyLoadsTest.rdf"));
    }finally{__CLR4_5_29bd9bdlvico208.R.flushNeeded();}}
}
