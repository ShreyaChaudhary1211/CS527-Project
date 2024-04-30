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
 * Tests the loading of a single ontology multiple times, using a different
 * ontologyIRI in the OWLOntologyID as that used in the actual ontology that is
 * being imported.
 * 
 * @author Peter Ansell p_ansell@yahoo.com
 */
@SuppressWarnings({ "javadoc", })
public class MultipleDistinctOntologyLoadsTest extends TestBase {static class __CLR4_5_2990990lvico1v1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,12073,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    IRI jb = IRI("http://example.purl.org.au/domainontology/JB_000007");
    IRI v1 = IRI("http://test.example.org/ontology/0139/version:1");
    IRI v2 = IRI("http://test.example.org/ontology/0139/version:2");

    @Test(expected = OWLOntologyAlreadyExistsException.class)
    public void testMultipleVersionLoadChangeIRI() throws Exception {__CLR4_5_2990990lvico1v1.R.globalSliceStart(getClass().getName(),11988);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2prpl2z990();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,77,117,108,116,105,112,108,101,86,101,114,115,105,111,110,76,111,97,100,67,104,97,110,103,101,73,82,73,58,32,91,79,87,76,79,110,116,111,108,111,103,121,65,108,114,101,97,100,121,69,120,105,115,116,115,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof OWLOntologyAlreadyExistsException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2990990lvico1v1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2990990lvico1v1.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.rdfxml.MultipleDistinctOntologyLoadsTest.testMultipleVersionLoadChangeIRI",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),11988,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2prpl2z990() throws Exception{try{__CLR4_5_2990990lvico1v1.R.inc(11988);
        __CLR4_5_2990990lvico1v1.R.inc(11989);OWLOntologyDocumentSource initialDocumentSource = getDocument();
        __CLR4_5_2990990lvico1v1.R.inc(11990);OWLOntologyID initialUniqueOWLOntologyID = new OWLOntologyID(Optional.of(jb), Optional.of(v2));
        __CLR4_5_2990990lvico1v1.R.inc(11991);OWLOntology initialOntology = m.createOntology(initialUniqueOWLOntologyID);
        __CLR4_5_2990990lvico1v1.R.inc(11992);OWLParser initialParser = new RDFXMLParser();
        __CLR4_5_2990990lvico1v1.R.inc(11993);initialParser.parse(initialDocumentSource, initialOntology, config);
        __CLR4_5_2990990lvico1v1.R.inc(11994);OWLOntologyID secondUniqueOWLOntologyID = new OWLOntologyID(Optional.of(jb), Optional.of(v2));
        __CLR4_5_2990990lvico1v1.R.inc(11995);try {
            __CLR4_5_2990990lvico1v1.R.inc(11996);m.createOntology(secondUniqueOWLOntologyID);
        } catch (OWLOntologyAlreadyExistsException e) {
            __CLR4_5_2990990lvico1v1.R.inc(11997);assertEquals(new OWLOntologyID(Optional.of(jb), Optional.of(v2)), e.getOntologyID());
            __CLR4_5_2990990lvico1v1.R.inc(11998);throw e;
        }
    }finally{__CLR4_5_2990990lvico1v1.R.flushNeeded();}}

    @Nonnull
    private OWLOntologyDocumentSource getDocument() {try{__CLR4_5_2990990lvico1v1.R.inc(11999);
        __CLR4_5_2990990lvico1v1.R.inc(12000);return new StreamDocumentSource(getClass().getResourceAsStream("/owlapi/multipleOntologyLoadsTest.rdf"));
    }finally{__CLR4_5_2990990lvico1v1.R.flushNeeded();}}

    @Test(expected = OWLOntologyAlreadyExistsException.class)
    public void testMultipleVersionLoadNoChange() throws Exception {__CLR4_5_2990990lvico1v1.R.globalSliceStart(getClass().getName(),12001);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a6vsfg99d();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,77,117,108,116,105,112,108,101,86,101,114,115,105,111,110,76,111,97,100,78,111,67,104,97,110,103,101,58,32,91,79,87,76,79,110,116,111,108,111,103,121,65,108,114,101,97,100,121,69,120,105,115,116,115,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof OWLOntologyAlreadyExistsException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2990990lvico1v1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2990990lvico1v1.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.rdfxml.MultipleDistinctOntologyLoadsTest.testMultipleVersionLoadNoChange",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),12001,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a6vsfg99d() throws Exception{try{__CLR4_5_2990990lvico1v1.R.inc(12001);
        __CLR4_5_2990990lvico1v1.R.inc(12002);OWLOntologyDocumentSource documentSource = getDocument();
        __CLR4_5_2990990lvico1v1.R.inc(12003);OWLOntologyID expected = new OWLOntologyID(Optional.of(jb), Optional.of(v1));
        __CLR4_5_2990990lvico1v1.R.inc(12004);OWLOntologyID initialUniqueOWLOntologyID = new OWLOntologyID(Optional.of(jb), Optional.of(v1));
        __CLR4_5_2990990lvico1v1.R.inc(12005);OWLOntology initialOntology = m.createOntology(initialUniqueOWLOntologyID);
        __CLR4_5_2990990lvico1v1.R.inc(12006);OWLParser parser = new RDFXMLParser();
        __CLR4_5_2990990lvico1v1.R.inc(12007);parser.parse(documentSource, initialOntology, config);
        __CLR4_5_2990990lvico1v1.R.inc(12008);OWLOntologyID secondUniqueOWLOntologyID = new OWLOntologyID(Optional.of(jb), Optional.of(v1));
        __CLR4_5_2990990lvico1v1.R.inc(12009);try {
            __CLR4_5_2990990lvico1v1.R.inc(12010);m.createOntology(secondUniqueOWLOntologyID);
        } catch (OWLOntologyAlreadyExistsException e) {
            __CLR4_5_2990990lvico1v1.R.inc(12011);assertEquals(expected, e.getOntologyID());
            __CLR4_5_2990990lvico1v1.R.inc(12012);throw e;
        }
    }finally{__CLR4_5_2990990lvico1v1.R.flushNeeded();}}

    @Test
    public void testMultipleVersionLoadsExplicitOntologyIDs() throws Exception {__CLR4_5_2990990lvico1v1.R.globalSliceStart(getClass().getName(),12013);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2p6r75x99p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2990990lvico1v1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2990990lvico1v1.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.rdfxml.MultipleDistinctOntologyLoadsTest.testMultipleVersionLoadsExplicitOntologyIDs",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),12013,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2p6r75x99p() throws Exception{try{__CLR4_5_2990990lvico1v1.R.inc(12013);
        __CLR4_5_2990990lvico1v1.R.inc(12014);OWLOntologyDocumentSource documentSource = getDocument();
        __CLR4_5_2990990lvico1v1.R.inc(12015);OWLOntologyID initialUniqueOWLOntologyID = new OWLOntologyID(Optional.of(jb), Optional.of(v1));
        __CLR4_5_2990990lvico1v1.R.inc(12016);OWLOntology initialOntology = m.createOntology(initialUniqueOWLOntologyID);
        __CLR4_5_2990990lvico1v1.R.inc(12017);OWLParser parser = new RDFXMLParser();
        __CLR4_5_2990990lvico1v1.R.inc(12018);parser.parse(documentSource, initialOntology, config);
        __CLR4_5_2990990lvico1v1.R.inc(12019);assertEquals(jb, initialOntology.getOntologyID().getOntologyIRI().get());
        __CLR4_5_2990990lvico1v1.R.inc(12020);assertEquals(v1, initialOntology.getOntologyID().getVersionIRI().get());
        __CLR4_5_2990990lvico1v1.R.inc(12021);OWLOntologyDocumentSource secondDocumentSource = getDocument();
        __CLR4_5_2990990lvico1v1.R.inc(12022);OWLOntologyID secondUniqueOWLOntologyID = new OWLOntologyID(Optional.of(jb), Optional.of(v2));
        __CLR4_5_2990990lvico1v1.R.inc(12023);OWLOntology secondOntology = m.createOntology(secondUniqueOWLOntologyID);
        __CLR4_5_2990990lvico1v1.R.inc(12024);OWLParser secondParser = new RDFXMLParser();
        __CLR4_5_2990990lvico1v1.R.inc(12025);secondParser.parse(secondDocumentSource, secondOntology, config);
        __CLR4_5_2990990lvico1v1.R.inc(12026);assertEquals(jb, secondOntology.getOntologyID().getOntologyIRI().get());
        __CLR4_5_2990990lvico1v1.R.inc(12027);assertEquals(v2, secondOntology.getOntologyID().getVersionIRI().get());
    }finally{__CLR4_5_2990990lvico1v1.R.flushNeeded();}}

    @Test
    public void testMultipleVersionLoadsNoOntologyIDFirstTime() throws Exception {__CLR4_5_2990990lvico1v1.R.globalSliceStart(getClass().getName(),12028);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2w308e69a4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2990990lvico1v1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2990990lvico1v1.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.rdfxml.MultipleDistinctOntologyLoadsTest.testMultipleVersionLoadsNoOntologyIDFirstTime",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),12028,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2w308e69a4() throws Exception{try{__CLR4_5_2990990lvico1v1.R.inc(12028);
        __CLR4_5_2990990lvico1v1.R.inc(12029);OWLOntologyDocumentSource documentSource = getDocument();
        __CLR4_5_2990990lvico1v1.R.inc(12030);OWLOntology initialOntology = m.createOntology();
        __CLR4_5_2990990lvico1v1.R.inc(12031);OWLParser parser = new RDFXMLParser();
        __CLR4_5_2990990lvico1v1.R.inc(12032);parser.parse(documentSource, initialOntology, config);
        __CLR4_5_2990990lvico1v1.R.inc(12033);assertEquals(IRI("http://test.example.org/ontology/0139"), initialOntology.getOntologyID().getOntologyIRI()
            .get());
        __CLR4_5_2990990lvico1v1.R.inc(12034);assertEquals(v1, initialOntology.getOntologyID().getVersionIRI().get());
        __CLR4_5_2990990lvico1v1.R.inc(12035);OWLOntologyDocumentSource secondDocumentSource = getDocument();
        __CLR4_5_2990990lvico1v1.R.inc(12036);OWLOntologyID secondUniqueOWLOntologyID = new OWLOntologyID(Optional.of(jb), Optional.of(v2));
        __CLR4_5_2990990lvico1v1.R.inc(12037);OWLOntology secondOntology = m.createOntology(secondUniqueOWLOntologyID);
        __CLR4_5_2990990lvico1v1.R.inc(12038);OWLParser secondParser = new RDFXMLParser();
        __CLR4_5_2990990lvico1v1.R.inc(12039);secondParser.parse(secondDocumentSource, secondOntology, config);
        __CLR4_5_2990990lvico1v1.R.inc(12040);assertEquals(jb, secondOntology.getOntologyID().getOntologyIRI().get());
        __CLR4_5_2990990lvico1v1.R.inc(12041);assertEquals(v2, secondOntology.getOntologyID().getVersionIRI().get());
    }finally{__CLR4_5_2990990lvico1v1.R.flushNeeded();}}

    @Test
    public void testMultipleVersionLoadsNoOntologyVersionIRIFirstTime() throws Exception {__CLR4_5_2990990lvico1v1.R.globalSliceStart(getClass().getName(),12042);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a3th799ai();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2990990lvico1v1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2990990lvico1v1.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.rdfxml.MultipleDistinctOntologyLoadsTest.testMultipleVersionLoadsNoOntologyVersionIRIFirstTime",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),12042,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a3th799ai() throws Exception{try{__CLR4_5_2990990lvico1v1.R.inc(12042);
        __CLR4_5_2990990lvico1v1.R.inc(12043);OWLOntologyDocumentSource documentSource = getDocument();
        __CLR4_5_2990990lvico1v1.R.inc(12044);OWLOntologyID initialUniqueOWLOntologyID = new OWLOntologyID(Optional.of(jb), Optional.<IRI> absent());
        __CLR4_5_2990990lvico1v1.R.inc(12045);OWLOntology initialOntology = m.createOntology(initialUniqueOWLOntologyID);
        __CLR4_5_2990990lvico1v1.R.inc(12046);OWLParser parser = new RDFXMLParser();
        __CLR4_5_2990990lvico1v1.R.inc(12047);parser.parse(documentSource, initialOntology, config);
        __CLR4_5_2990990lvico1v1.R.inc(12048);assertEquals(jb, initialOntology.getOntologyID().getOntologyIRI().get());
        // FIXME: versionIRI is null for some reason even though it was in the
        // document
        __CLR4_5_2990990lvico1v1.R.inc(12049);assertEquals(v1, initialOntology.getOntologyID().getVersionIRI().get());
        __CLR4_5_2990990lvico1v1.R.inc(12050);OWLOntologyDocumentSource secondDocumentSource = getDocument();
        __CLR4_5_2990990lvico1v1.R.inc(12051);OWLOntologyID secondUniqueOWLOntologyID = new OWLOntologyID(Optional.of(jb), Optional.of(v2));
        __CLR4_5_2990990lvico1v1.R.inc(12052);OWLOntology secondOntology = m.createOntology(secondUniqueOWLOntologyID);
        __CLR4_5_2990990lvico1v1.R.inc(12053);OWLParser secondParser = new RDFXMLParser();
        // NOTE: The following call throws the OWLOntologyRenameException before
        // the patch to TypeOntologyHandler and TPVersionIRIHandler
        __CLR4_5_2990990lvico1v1.R.inc(12054);secondParser.parse(secondDocumentSource, secondOntology, config);
        __CLR4_5_2990990lvico1v1.R.inc(12055);assertEquals(jb, secondOntology.getOntologyID().getOntologyIRI().get());
        __CLR4_5_2990990lvico1v1.R.inc(12056);assertEquals(v2, secondOntology.getOntologyID().getVersionIRI().get());
    }finally{__CLR4_5_2990990lvico1v1.R.flushNeeded();}}

    @Test
    public void testSingleVersionLoadChangeIRI() throws Exception {__CLR4_5_2990990lvico1v1.R.globalSliceStart(getClass().getName(),12057);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26j811p9ax();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2990990lvico1v1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2990990lvico1v1.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.rdfxml.MultipleDistinctOntologyLoadsTest.testSingleVersionLoadChangeIRI",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),12057,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26j811p9ax() throws Exception{try{__CLR4_5_2990990lvico1v1.R.inc(12057);
        __CLR4_5_2990990lvico1v1.R.inc(12058);OWLOntologyDocumentSource secondDocumentSource = getDocument();
        __CLR4_5_2990990lvico1v1.R.inc(12059);OWLOntologyID secondUniqueOWLOntologyID = new OWLOntologyID(Optional.of(jb), Optional.of(v2));
        __CLR4_5_2990990lvico1v1.R.inc(12060);OWLOntology secondOntology = m.createOntology(secondUniqueOWLOntologyID);
        __CLR4_5_2990990lvico1v1.R.inc(12061);OWLParser secondParser = new RDFXMLParser();
        // the following throws the exception
        __CLR4_5_2990990lvico1v1.R.inc(12062);secondParser.parse(secondDocumentSource, secondOntology, config);
        __CLR4_5_2990990lvico1v1.R.inc(12063);assertEquals(jb, secondOntology.getOntologyID().getOntologyIRI().get());
        __CLR4_5_2990990lvico1v1.R.inc(12064);assertEquals(v2, secondOntology.getOntologyID().getVersionIRI().get());
    }finally{__CLR4_5_2990990lvico1v1.R.flushNeeded();}}

    @Test
    public void testSingleVersionLoadNoChange() throws Exception {__CLR4_5_2990990lvico1v1.R.globalSliceStart(getClass().getName(),12065);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_281ggs9b5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2990990lvico1v1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2990990lvico1v1.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.rdfxml.MultipleDistinctOntologyLoadsTest.testSingleVersionLoadNoChange",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),12065,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_281ggs9b5() throws Exception{try{__CLR4_5_2990990lvico1v1.R.inc(12065);
        __CLR4_5_2990990lvico1v1.R.inc(12066);OWLOntologyDocumentSource documentSource = getDocument();
        __CLR4_5_2990990lvico1v1.R.inc(12067);OWLOntologyID initialUniqueOWLOntologyID = new OWLOntologyID(Optional.of(jb), Optional.of(v1));
        __CLR4_5_2990990lvico1v1.R.inc(12068);OWLOntology initialOntology = m.createOntology(initialUniqueOWLOntologyID);
        __CLR4_5_2990990lvico1v1.R.inc(12069);OWLParser parser = new RDFXMLParser();
        __CLR4_5_2990990lvico1v1.R.inc(12070);parser.parse(documentSource, initialOntology, config);
        __CLR4_5_2990990lvico1v1.R.inc(12071);assertEquals(jb, initialOntology.getOntologyID().getOntologyIRI().get());
        __CLR4_5_2990990lvico1v1.R.inc(12072);assertEquals(v1, initialOntology.getOntologyID().getVersionIRI().get());
    }finally{__CLR4_5_2990990lvico1v1.R.flushNeeded();}}
}
