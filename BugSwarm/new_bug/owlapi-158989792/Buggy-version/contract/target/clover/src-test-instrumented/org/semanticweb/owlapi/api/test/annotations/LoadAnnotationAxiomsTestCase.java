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
package org.semanticweb.owlapi.api.test.annotations;

import static org.junit.Assert.*;
import static org.semanticweb.owlapi.apibinding.OWLFunctionalSyntaxFactory.*;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.Nonnull;

import org.junit.Test;
import org.semanticweb.owlapi.api.test.baseclasses.TestBase;
import org.semanticweb.owlapi.formats.FunctionalSyntaxDocumentFormat;
import org.semanticweb.owlapi.formats.OWLXMLDocumentFormat;
import org.semanticweb.owlapi.formats.RDFXMLDocumentFormat;
import org.semanticweb.owlapi.formats.TurtleDocumentFormat;
import org.semanticweb.owlapi.model.AxiomType;
import org.semanticweb.owlapi.model.OWLAnnotationAssertionAxiom;
import org.semanticweb.owlapi.model.OWLAnnotationProperty;
import org.semanticweb.owlapi.model.OWLAnnotationPropertyDomainAxiom;
import org.semanticweb.owlapi.model.OWLAnnotationPropertyRangeAxiom;
import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLDeclarationAxiom;
import org.semanticweb.owlapi.model.OWLDocumentFormat;
import org.semanticweb.owlapi.model.OWLLiteral;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration;
import org.semanticweb.owlapi.model.OWLOntologyStorageException;
import org.semanticweb.owlapi.model.OWLSubAnnotationPropertyOfAxiom;
import org.semanticweb.owlapi.model.OWLSubClassOfAxiom;

/**
 * @author Matthew Horridge, The University of Manchester, Bio-Health
 *         Informatics Group
 * @since 3.1.0
 */
@SuppressWarnings("javadoc")
public class LoadAnnotationAxiomsTestCase extends TestBase {static class __CLR4_5_22nf2nflvicnzx7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,3479,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testIgnoreAnnotations() throws Exception {__CLR4_5_22nf2nflvicnzx7.R.globalSliceStart(getClass().getName(),3435);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kbm11j2nf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22nf2nflvicnzx7.R.rethrow($CLV_t2$);}finally{__CLR4_5_22nf2nflvicnzx7.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.annotations.LoadAnnotationAxiomsTestCase.testIgnoreAnnotations",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3435,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kbm11j2nf() throws Exception{try{__CLR4_5_22nf2nflvicnzx7.R.inc(3435);
        __CLR4_5_22nf2nflvicnzx7.R.inc(3436);OWLOntology ont = m.createOntology();
        __CLR4_5_22nf2nflvicnzx7.R.inc(3437);OWLClass clsA = Class(IRI("http://ont.com#A"));
        __CLR4_5_22nf2nflvicnzx7.R.inc(3438);OWLClass clsB = Class(IRI("http://ont.com#B"));
        __CLR4_5_22nf2nflvicnzx7.R.inc(3439);OWLSubClassOfAxiom sca = SubClassOf(clsA, clsB);
        __CLR4_5_22nf2nflvicnzx7.R.inc(3440);m.addAxiom(ont, sca);
        __CLR4_5_22nf2nflvicnzx7.R.inc(3441);OWLAnnotationProperty rdfsComment = RDFSComment();
        __CLR4_5_22nf2nflvicnzx7.R.inc(3442);OWLLiteral lit = Literal("Hello world");
        __CLR4_5_22nf2nflvicnzx7.R.inc(3443);OWLAnnotationAssertionAxiom annoAx1 = AnnotationAssertion(rdfsComment,
                clsA.getIRI(), lit);
        __CLR4_5_22nf2nflvicnzx7.R.inc(3444);m.addAxiom(ont, annoAx1);
        __CLR4_5_22nf2nflvicnzx7.R.inc(3445);OWLAnnotationPropertyDomainAxiom annoAx2 = df
                .getOWLAnnotationPropertyDomainAxiom(rdfsComment, clsA.getIRI());
        __CLR4_5_22nf2nflvicnzx7.R.inc(3446);m.addAxiom(ont, annoAx2);
        __CLR4_5_22nf2nflvicnzx7.R.inc(3447);OWLAnnotationPropertyRangeAxiom annoAx3 = df
                .getOWLAnnotationPropertyRangeAxiom(rdfsComment, clsB.getIRI());
        __CLR4_5_22nf2nflvicnzx7.R.inc(3448);m.addAxiom(ont, annoAx3);
        __CLR4_5_22nf2nflvicnzx7.R.inc(3449);OWLAnnotationProperty myComment = AnnotationProperty(IRI("http://ont.com#myComment"));
        __CLR4_5_22nf2nflvicnzx7.R.inc(3450);OWLSubAnnotationPropertyOfAxiom annoAx4 = df
                .getOWLSubAnnotationPropertyOfAxiom(myComment, rdfsComment);
        __CLR4_5_22nf2nflvicnzx7.R.inc(3451);m.addAxiom(ont, annoAx4);
        __CLR4_5_22nf2nflvicnzx7.R.inc(3452);reload(ont, new RDFXMLDocumentFormat());
        __CLR4_5_22nf2nflvicnzx7.R.inc(3453);reload(ont, new OWLXMLDocumentFormat());
        __CLR4_5_22nf2nflvicnzx7.R.inc(3454);reload(ont, new TurtleDocumentFormat());
        __CLR4_5_22nf2nflvicnzx7.R.inc(3455);reload(ont, new FunctionalSyntaxDocumentFormat());
    }finally{__CLR4_5_22nf2nflvicnzx7.R.flushNeeded();}}

    private void reload(@Nonnull OWLOntology ontology,
            @Nonnull OWLDocumentFormat format)
            throws OWLOntologyStorageException, OWLOntologyCreationException {try{__CLR4_5_22nf2nflvicnzx7.R.inc(3456);
        __CLR4_5_22nf2nflvicnzx7.R.inc(3457);Set<OWLAxiom> annotationAxioms = new HashSet<>();
        __CLR4_5_22nf2nflvicnzx7.R.inc(3458);Set<OWLAxiom> axioms = ontology.getAxioms();
        __CLR4_5_22nf2nflvicnzx7.R.inc(3459);for (OWLAxiom ax : axioms) {{
            __CLR4_5_22nf2nflvicnzx7.R.inc(3460);if ((((ax.isAnnotationAxiom())&&(__CLR4_5_22nf2nflvicnzx7.R.iget(3461)!=0|true))||(__CLR4_5_22nf2nflvicnzx7.R.iget(3462)==0&false))) {{
                __CLR4_5_22nf2nflvicnzx7.R.inc(3463);annotationAxioms.add(ax);
            }
        }}
        }__CLR4_5_22nf2nflvicnzx7.R.inc(3464);OWLOntologyLoaderConfiguration withAnnosConfig = new OWLOntologyLoaderConfiguration();
        __CLR4_5_22nf2nflvicnzx7.R.inc(3465);OWLOntology reloadedWithAnnoAxioms = reload(ontology, format,
                withAnnosConfig);
        __CLR4_5_22nf2nflvicnzx7.R.inc(3466);Set<OWLAxiom> axioms2 = reloadedWithAnnoAxioms.getAxioms();
        __CLR4_5_22nf2nflvicnzx7.R.inc(3467);assertEquals(axioms, axioms2);
        __CLR4_5_22nf2nflvicnzx7.R.inc(3468);OWLOntologyLoaderConfiguration withoutAnnosConfig = new OWLOntologyLoaderConfiguration()
                .setLoadAnnotationAxioms(false);
        __CLR4_5_22nf2nflvicnzx7.R.inc(3469);OWLOntology reloadedWithoutAnnoAxioms = reload(ontology, format,
                withoutAnnosConfig);
        __CLR4_5_22nf2nflvicnzx7.R.inc(3470);assertFalse(axioms.equals(reloadedWithoutAnnoAxioms.getAxioms()));
        __CLR4_5_22nf2nflvicnzx7.R.inc(3471);Set<OWLAxiom> axiomsMinusAnnotationAxioms = new HashSet<>(axioms);
        __CLR4_5_22nf2nflvicnzx7.R.inc(3472);axiomsMinusAnnotationAxioms.removeAll(annotationAxioms);
        __CLR4_5_22nf2nflvicnzx7.R.inc(3473);assertEquals(axiomsMinusAnnotationAxioms,
                reloadedWithoutAnnoAxioms.getAxioms());
    }finally{__CLR4_5_22nf2nflvicnzx7.R.flushNeeded();}}

    private OWLOntology reload(@Nonnull OWLOntology ontology,
            @Nonnull OWLDocumentFormat format,
            @Nonnull OWLOntologyLoaderConfiguration configuration)
            throws OWLOntologyStorageException, OWLOntologyCreationException {try{__CLR4_5_22nf2nflvicnzx7.R.inc(3474);
        __CLR4_5_22nf2nflvicnzx7.R.inc(3475);OWLOntology reloaded = loadOntologyWithConfig(
                saveOntology(ontology, format), configuration);
        __CLR4_5_22nf2nflvicnzx7.R.inc(3476);HashSet<OWLDeclarationAxiom> declarations = new HashSet<>(
                reloaded.getAxioms(AxiomType.DECLARATION));
        __CLR4_5_22nf2nflvicnzx7.R.inc(3477);reloaded.getOWLOntologyManager().removeAxioms(reloaded, declarations);
        __CLR4_5_22nf2nflvicnzx7.R.inc(3478);return reloaded;
    }finally{__CLR4_5_22nf2nflvicnzx7.R.flushNeeded();}}
}
