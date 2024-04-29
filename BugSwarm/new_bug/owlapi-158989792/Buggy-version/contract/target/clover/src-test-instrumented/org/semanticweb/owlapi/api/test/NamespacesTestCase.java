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
package org.semanticweb.owlapi.api.test;

import static org.junit.Assert.*;

import java.util.EnumSet;

import org.junit.Test;
import org.semanticweb.owlapi.api.test.baseclasses.TestBase;
import org.semanticweb.owlapi.formats.FunctionalSyntaxDocumentFormat;
import org.semanticweb.owlapi.io.StringDocumentTarget;
import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.vocab.Namespaces;
import org.semanticweb.owlapi.vocab.OWL2Datatype;
import org.semanticweb.owlapi.vocab.XSDVocabulary;

@SuppressWarnings("javadoc")
public class NamespacesTestCase extends TestBase {static class __CLR4_5_221p21plvicnzpn{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,2685,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void shouldFindInNamespace() {__CLR4_5_221p21plvicnzpn.R.globalSliceStart(getClass().getName(),2653);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23educv21p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_221p21plvicnzpn.R.rethrow($CLV_t2$);}finally{__CLR4_5_221p21plvicnzpn.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.NamespacesTestCase.shouldFindInNamespace",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2653,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23educv21p(){try{__CLR4_5_221p21plvicnzpn.R.inc(2653);
        __CLR4_5_221p21plvicnzpn.R.inc(2654);EnumSet<Namespaces> reserved = EnumSet.of(Namespaces.OWL,
                Namespaces.RDF, Namespaces.RDFS, Namespaces.XSD);
        __CLR4_5_221p21plvicnzpn.R.inc(2655);for (Namespaces n : Namespaces.values()) {{
            __CLR4_5_221p21plvicnzpn.R.inc(2656);IRI iri = IRI.create(n.getPrefixIRI(), "test");
            __CLR4_5_221p21plvicnzpn.R.inc(2657);boolean reservedVocabulary = iri.isReservedVocabulary();
            __CLR4_5_221p21plvicnzpn.R.inc(2658);assertEquals(iri + " reserved? Should be " + reserved.contains(n)
                    + " but is " + reservedVocabulary, reservedVocabulary,
                    reserved.contains(n));
        }
    }}finally{__CLR4_5_221p21plvicnzpn.R.flushNeeded();}}

    @Test
    public void shouldParseXSDSTRING() {__CLR4_5_221p21plvicnzpn.R.globalSliceStart(getClass().getName(),2659);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nzvubl21v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_221p21plvicnzpn.R.rethrow($CLV_t2$);}finally{__CLR4_5_221p21plvicnzpn.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.NamespacesTestCase.shouldParseXSDSTRING",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2659,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nzvubl21v(){try{__CLR4_5_221p21plvicnzpn.R.inc(2659);
        // given
        __CLR4_5_221p21plvicnzpn.R.inc(2660);String s = "xsd:string";
        // when
        __CLR4_5_221p21plvicnzpn.R.inc(2661);XSDVocabulary v = XSDVocabulary.parseShortName(s);
        // then
        __CLR4_5_221p21plvicnzpn.R.inc(2662);assertEquals(XSDVocabulary.STRING, v);
        __CLR4_5_221p21plvicnzpn.R.inc(2663);assertEquals(OWL2Datatype.XSD_STRING.getDatatype(df),
                df.getOWLDatatype(v.getIRI()));
    }finally{__CLR4_5_221p21plvicnzpn.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void shouldFailToParseInvalidString() {__CLR4_5_221p21plvicnzpn.R.globalSliceStart(getClass().getName(),2664);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24ng2d4220();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,115,104,111,117,108,100,70,97,105,108,84,111,80,97,114,115,101,73,110,118,97,108,105,100,83,116,114,105,110,103,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_221p21plvicnzpn.R.rethrow($CLV_t2$);}finally{__CLR4_5_221p21plvicnzpn.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.NamespacesTestCase.shouldFailToParseInvalidString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2664,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24ng2d4220(){try{__CLR4_5_221p21plvicnzpn.R.inc(2664);
        // given
        __CLR4_5_221p21plvicnzpn.R.inc(2665);String s = "xsd:st";
        // when
        __CLR4_5_221p21plvicnzpn.R.inc(2666);XSDVocabulary.parseShortName(s);
        // then
        // an exception should have been thrown
    }finally{__CLR4_5_221p21plvicnzpn.R.flushNeeded();}}

    @Test
    public void shouldSetPrefix() throws OWLOntologyCreationException, OWLOntologyStorageException {__CLR4_5_221p21plvicnzpn.R.globalSliceStart(getClass().getName(),2667);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xpnmbc223();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_221p21plvicnzpn.R.rethrow($CLV_t2$);}finally{__CLR4_5_221p21plvicnzpn.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.NamespacesTestCase.shouldSetPrefix",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2667,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xpnmbc223() throws OWLOntologyCreationException, OWLOntologyStorageException{try{__CLR4_5_221p21plvicnzpn.R.inc(2667);
        __CLR4_5_221p21plvicnzpn.R.inc(2668);OWLClass item = df.getOWLClass(IRI.create("http://test.owl/test#item"));
        __CLR4_5_221p21plvicnzpn.R.inc(2669);OWLDeclarationAxiom declaration = df.getOWLDeclarationAxiom(item);
        __CLR4_5_221p21plvicnzpn.R.inc(2670);OWLOntology o1 = m.createOntology();
        __CLR4_5_221p21plvicnzpn.R.inc(2671);FunctionalSyntaxDocumentFormat pm1 = new FunctionalSyntaxDocumentFormat();
        __CLR4_5_221p21plvicnzpn.R.inc(2672);pm1.setPrefix(":", "http://test.owl/test#");
        __CLR4_5_221p21plvicnzpn.R.inc(2673);m.setOntologyFormat(o1, pm1);
        __CLR4_5_221p21plvicnzpn.R.inc(2674);m.addAxiom(o1, declaration);
        __CLR4_5_221p21plvicnzpn.R.inc(2675);StringDocumentTarget t1 = new StringDocumentTarget();
        __CLR4_5_221p21plvicnzpn.R.inc(2676);m.saveOntology(o1, t1);
        __CLR4_5_221p21plvicnzpn.R.inc(2677);OWLOntology o2 = m1.createOntology();
        __CLR4_5_221p21plvicnzpn.R.inc(2678);FunctionalSyntaxDocumentFormat pm2 = new FunctionalSyntaxDocumentFormat();
        __CLR4_5_221p21plvicnzpn.R.inc(2679);pm2.setPrefix(":", "http://test.owl/test#");
        __CLR4_5_221p21plvicnzpn.R.inc(2680);m1.addAxiom(o2, declaration);
        __CLR4_5_221p21plvicnzpn.R.inc(2681);StringDocumentTarget t2 = new StringDocumentTarget();
        __CLR4_5_221p21plvicnzpn.R.inc(2682);m1.saveOntology(o1, pm2, t2);
        __CLR4_5_221p21plvicnzpn.R.inc(2683);assertTrue(t2.toString().contains("Declaration(Class(:item))"));
        __CLR4_5_221p21plvicnzpn.R.inc(2684);assertEquals(t1.toString(), t2.toString());
    }finally{__CLR4_5_221p21plvicnzpn.R.flushNeeded();}}
}
