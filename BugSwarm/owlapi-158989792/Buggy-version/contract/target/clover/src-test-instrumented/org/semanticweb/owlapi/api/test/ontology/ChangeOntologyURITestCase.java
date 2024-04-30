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
import org.semanticweb.owlapi.model.AddImport;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.OWLOntologyID;
import org.semanticweb.owlapi.util.OWLOntologyIRIChanger;

/**
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.0.0
 */
@SuppressWarnings({ "javadoc", })
public class ChangeOntologyURITestCase extends TestBase {static class __CLR4_5_26o66o6lvico1b2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,8671,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testChangeURI() throws OWLOntologyCreationException {__CLR4_5_26o66o6lvico1b2.R.globalSliceStart(getClass().getName(),8646);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bfcnnz6o6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_26o66o6lvico1b2.R.rethrow($CLV_t2$);}finally{__CLR4_5_26o66o6lvico1b2.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.ontology.ChangeOntologyURITestCase.testChangeURI",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),8646,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bfcnnz6o6() throws OWLOntologyCreationException{try{__CLR4_5_26o66o6lvico1b2.R.inc(8646);
        __CLR4_5_26o66o6lvico1b2.R.inc(8647);IRI oldIRI = IRI("http://www.semanticweb.org/ontologies/ontA");
        __CLR4_5_26o66o6lvico1b2.R.inc(8648);IRI newIRI = IRI("http://www.semanticweb.org/ontologies/ontB");
        __CLR4_5_26o66o6lvico1b2.R.inc(8649);OWLOntology ont = m.createOntology(oldIRI);
        __CLR4_5_26o66o6lvico1b2.R.inc(8650);OWLOntology importingOnt = m.createOntology(IRI("http://www.semanticweb.org/ontologies/ontC"));
        __CLR4_5_26o66o6lvico1b2.R.inc(8651);m.applyChange(new AddImport(importingOnt, m.getOWLDataFactory().getOWLImportsDeclaration(ont.getOntologyID()
            .getOntologyIRI().get())));
        __CLR4_5_26o66o6lvico1b2.R.inc(8652);assertTrue(m.contains(oldIRI));
        __CLR4_5_26o66o6lvico1b2.R.inc(8653);OWLOntologyIRIChanger changer = new OWLOntologyIRIChanger(m);
        __CLR4_5_26o66o6lvico1b2.R.inc(8654);m.applyChanges(changer.getChanges(ont, newIRI));
        __CLR4_5_26o66o6lvico1b2.R.inc(8655);assertFalse(m.contains(oldIRI));
        __CLR4_5_26o66o6lvico1b2.R.inc(8656);assertTrue(m.contains(newIRI));
        __CLR4_5_26o66o6lvico1b2.R.inc(8657);assertTrue(m.getOntologies().contains(ont));
        __CLR4_5_26o66o6lvico1b2.R.inc(8658);assertTrue(m.getDirectImports(importingOnt).contains(ont));
        __CLR4_5_26o66o6lvico1b2.R.inc(8659);OWLOntology ontology = m.getOntology(newIRI);
        __CLR4_5_26o66o6lvico1b2.R.inc(8660);assertNotNull("ontology should not be null", ontology);
        __CLR4_5_26o66o6lvico1b2.R.inc(8661);assertEquals(ontology, ont);
        __CLR4_5_26o66o6lvico1b2.R.inc(8662);assertEquals(ontology.getOntologyID().getOntologyIRI().get(), newIRI);
        __CLR4_5_26o66o6lvico1b2.R.inc(8663);assertTrue(m.getImportsClosure(importingOnt).contains(ont));
        __CLR4_5_26o66o6lvico1b2.R.inc(8664);assertNotNull("ontology should not be null", m.getOntologyDocumentIRI(ont));
        // Document IRI will still be the same (in this case the old ont URI)
        __CLR4_5_26o66o6lvico1b2.R.inc(8665);assertEquals(m.getOntologyDocumentIRI(ont), oldIRI);
        __CLR4_5_26o66o6lvico1b2.R.inc(8666);assertNotNull("ontology format should not be null", m.getOntologyFormat(ont));
    }finally{__CLR4_5_26o66o6lvico1b2.R.flushNeeded();}}

    @Test
    public void shouldCheckContents() throws OWLOntologyCreationException {__CLR4_5_26o66o6lvico1b2.R.globalSliceStart(getClass().getName(),8667);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mupcqe6or();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_26o66o6lvico1b2.R.rethrow($CLV_t2$);}finally{__CLR4_5_26o66o6lvico1b2.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.ontology.ChangeOntologyURITestCase.shouldCheckContents",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),8667,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mupcqe6or() throws OWLOntologyCreationException{try{__CLR4_5_26o66o6lvico1b2.R.inc(8667);
        __CLR4_5_26o66o6lvico1b2.R.inc(8668);m.createOntology(IRI.create("http://www.test.com/123"));
        __CLR4_5_26o66o6lvico1b2.R.inc(8669);OWLOntologyID anonymousId = m1.createOntology().getOntologyID();
        __CLR4_5_26o66o6lvico1b2.R.inc(8670);m.contains(anonymousId);
    }finally{__CLR4_5_26o66o6lvico1b2.R.flushNeeded();}}
}
