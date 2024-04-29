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
import static org.semanticweb.owlapi.apibinding.OWLFunctionalSyntaxFactory.*;

import java.util.Set;
import java.util.TreeSet;

import javax.annotation.Nonnull;

import org.junit.Ignore;
import org.junit.Test;
import org.semanticweb.owlapi.api.test.baseclasses.TestBase;
import org.semanticweb.owlapi.formats.FunctionalSyntaxDocumentFormat;
import org.semanticweb.owlapi.formats.ManchesterSyntaxDocumentFormat;
import org.semanticweb.owlapi.formats.OWLXMLDocumentFormat;
import org.semanticweb.owlapi.formats.RDFXMLDocumentFormat;
import org.semanticweb.owlapi.formats.TurtleDocumentFormat;
import org.semanticweb.owlapi.io.StringDocumentTarget;
import org.semanticweb.owlapi.model.AxiomType;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLAnnotation;
import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLDataProperty;
import org.semanticweb.owlapi.model.OWLDatatypeDefinitionAxiom;
import org.semanticweb.owlapi.model.OWLDocumentFormat;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.OWLSubClassOfAxiom;
import org.semanticweb.owlapi.model.SWRLAtom;
import org.semanticweb.owlapi.model.SWRLRule;
import org.semanticweb.owlapi.model.SWRLVariable;
import org.semanticweb.owlapi.vocab.XSDVocabulary;

@SuppressWarnings("javadoc")
public class SWRLRoundTripTestCase extends TestBase {static class __CLR4_5_27s87s8lvico1jk{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,10205,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Nonnull
    private static final String NS = "urn:test";

    @Test
    public void shouldDoCompleteRoundtrip() throws Exception {__CLR4_5_27s87s8lvico1jk.R.globalSliceStart(getClass().getName(),10088);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24cqfr77s8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_27s87s8lvico1jk.R.rethrow($CLV_t2$);}finally{__CLR4_5_27s87s8lvico1jk.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.ontology.SWRLRoundTripTestCase.shouldDoCompleteRoundtrip",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10088,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24cqfr77s8() throws Exception{try{__CLR4_5_27s87s8lvico1jk.R.inc(10088);
        __CLR4_5_27s87s8lvico1jk.R.inc(10089);OWLClass a = Class(IRI(NS + "#A"));
        __CLR4_5_27s87s8lvico1jk.R.inc(10090);OWLDataProperty p = df.getOWLDataProperty(IRI(NS + "#P"));
        __CLR4_5_27s87s8lvico1jk.R.inc(10091);SWRLVariable x = df.getSWRLVariable(IRI(NS + "#X"));
        __CLR4_5_27s87s8lvico1jk.R.inc(10092);SWRLVariable y = df.getSWRLVariable(IRI(NS + "#Y"));
        __CLR4_5_27s87s8lvico1jk.R.inc(10093);OWLOntology ontology = m.createOntology(IRI(NS));
        __CLR4_5_27s87s8lvico1jk.R.inc(10094);Set<SWRLAtom> body = new TreeSet<>();
        __CLR4_5_27s87s8lvico1jk.R.inc(10095);body.add(df.getSWRLDataPropertyAtom(p, x, y));
        __CLR4_5_27s87s8lvico1jk.R.inc(10096);body.add(df.getSWRLDataRangeAtom(
                df.getOWLDatatype(XSDVocabulary.STRING.getIRI()), y));
        __CLR4_5_27s87s8lvico1jk.R.inc(10097);Set<SWRLAtom> head = new TreeSet<>();
        __CLR4_5_27s87s8lvico1jk.R.inc(10098);head.add(df.getSWRLClassAtom(a, x));
        __CLR4_5_27s87s8lvico1jk.R.inc(10099);SWRLRule rule = df.getSWRLRule(body, head);
        __CLR4_5_27s87s8lvico1jk.R.inc(10100);ontology.getOWLOntologyManager().addAxiom(ontology, rule);
        __CLR4_5_27s87s8lvico1jk.R.inc(10101);ontology = roundTrip(ontology, new OWLXMLDocumentFormat());
        __CLR4_5_27s87s8lvico1jk.R.inc(10102);OWLOntology onto2 = roundTrip(ontology, new OWLXMLDocumentFormat());
        __CLR4_5_27s87s8lvico1jk.R.inc(10103);equal(ontology, onto2);
    }finally{__CLR4_5_27s87s8lvico1jk.R.flushNeeded();}}

    @Test
    public void shouldDoCompleteRoundtripManchesterOWLSyntax() throws Exception {__CLR4_5_27s87s8lvico1jk.R.globalSliceStart(getClass().getName(),10104);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2g7450e7so();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_27s87s8lvico1jk.R.rethrow($CLV_t2$);}finally{__CLR4_5_27s87s8lvico1jk.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.ontology.SWRLRoundTripTestCase.shouldDoCompleteRoundtripManchesterOWLSyntax",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10104,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2g7450e7so() throws Exception{try{__CLR4_5_27s87s8lvico1jk.R.inc(10104);
        __CLR4_5_27s87s8lvico1jk.R.inc(10105);OWLClass a = Class(IRI(NS + "#A"));
        __CLR4_5_27s87s8lvico1jk.R.inc(10106);OWLDataProperty p = df.getOWLDataProperty(IRI(NS + "#P"));
        __CLR4_5_27s87s8lvico1jk.R.inc(10107);SWRLVariable x = df.getSWRLVariable(IRI(NS + "#X"));
        __CLR4_5_27s87s8lvico1jk.R.inc(10108);SWRLVariable y = df.getSWRLVariable(IRI(NS + "#Y"));
        __CLR4_5_27s87s8lvico1jk.R.inc(10109);OWLOntology ontology = m.createOntology(IRI(NS));
        __CLR4_5_27s87s8lvico1jk.R.inc(10110);Set<SWRLAtom> body = new TreeSet<>();
        __CLR4_5_27s87s8lvico1jk.R.inc(10111);body.add(df.getSWRLDataPropertyAtom(p, x, y));
        __CLR4_5_27s87s8lvico1jk.R.inc(10112);body.add(df.getSWRLDataRangeAtom(
                df.getOWLDatatype(XSDVocabulary.STRING.getIRI()), y));
        __CLR4_5_27s87s8lvico1jk.R.inc(10113);Set<SWRLAtom> head = new TreeSet<>();
        __CLR4_5_27s87s8lvico1jk.R.inc(10114);head.add(df.getSWRLClassAtom(a, x));
        __CLR4_5_27s87s8lvico1jk.R.inc(10115);SWRLRule rule = df.getSWRLRule(body, head);
        __CLR4_5_27s87s8lvico1jk.R.inc(10116);ontology.getOWLOntologyManager().addAxiom(ontology, rule);
        __CLR4_5_27s87s8lvico1jk.R.inc(10117);ontology = roundTrip(ontology, new ManchesterSyntaxDocumentFormat());
        __CLR4_5_27s87s8lvico1jk.R.inc(10118);OWLOntology onto2 = roundTrip(ontology,
                new ManchesterSyntaxDocumentFormat());
        __CLR4_5_27s87s8lvico1jk.R.inc(10119);equal(ontology, onto2);
    }finally{__CLR4_5_27s87s8lvico1jk.R.flushNeeded();}}

    @Test
    public void shouldDoCompleteRoundtripWithAnnotationsOWLXML()
            throws Exception {__CLR4_5_27s87s8lvico1jk.R.globalSliceStart(getClass().getName(),10120);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2i2asmc7t4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_27s87s8lvico1jk.R.rethrow($CLV_t2$);}finally{__CLR4_5_27s87s8lvico1jk.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.ontology.SWRLRoundTripTestCase.shouldDoCompleteRoundtripWithAnnotationsOWLXML",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10120,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2i2asmc7t4() throws Exception{try{__CLR4_5_27s87s8lvico1jk.R.inc(10120);
        __CLR4_5_27s87s8lvico1jk.R.inc(10121);OWLOntology ontology = prepareOntology();
        __CLR4_5_27s87s8lvico1jk.R.inc(10122);OWLXMLDocumentFormat f = new OWLXMLDocumentFormat();
        __CLR4_5_27s87s8lvico1jk.R.inc(10123);OWLOntology ontology2 = loadOntologyFromString(saveOntology(ontology, f));
        __CLR4_5_27s87s8lvico1jk.R.inc(10124);equal(ontology, ontology2);
        __CLR4_5_27s87s8lvico1jk.R.inc(10125);for (OWLAxiom r : ontology2.getAxioms(AxiomType.SWRL_RULE)) {{
            __CLR4_5_27s87s8lvico1jk.R.inc(10126);assertFalse(r.getAnnotations(df.getRDFSLabel()).isEmpty());
        }
        }__CLR4_5_27s87s8lvico1jk.R.inc(10127);for (OWLAxiom r : ontology2.getAxioms(AxiomType.DATATYPE_DEFINITION)) {{
            __CLR4_5_27s87s8lvico1jk.R.inc(10128);assertFalse(r.getAnnotations(df.getRDFSLabel()).isEmpty());
        }
    }}finally{__CLR4_5_27s87s8lvico1jk.R.flushNeeded();}}

    @Test
    public void shouldDoCompleteRoundtripWithAnnotationsTurtle()
            throws Exception {__CLR4_5_27s87s8lvico1jk.R.globalSliceStart(getClass().getName(),10129);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rpmk057td();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_27s87s8lvico1jk.R.rethrow($CLV_t2$);}finally{__CLR4_5_27s87s8lvico1jk.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.ontology.SWRLRoundTripTestCase.shouldDoCompleteRoundtripWithAnnotationsTurtle",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10129,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rpmk057td() throws Exception{try{__CLR4_5_27s87s8lvico1jk.R.inc(10129);
        __CLR4_5_27s87s8lvico1jk.R.inc(10130);OWLOntology ontology = prepareOntology();
        __CLR4_5_27s87s8lvico1jk.R.inc(10131);OWLDocumentFormat f = new TurtleDocumentFormat();
        __CLR4_5_27s87s8lvico1jk.R.inc(10132);OWLOntology ontology2 = loadOntologyFromString(saveOntology(ontology, f));
        __CLR4_5_27s87s8lvico1jk.R.inc(10133);equal(ontology, ontology2);
        __CLR4_5_27s87s8lvico1jk.R.inc(10134);for (OWLAxiom r : ontology2.getAxioms(AxiomType.SWRL_RULE)) {{
            __CLR4_5_27s87s8lvico1jk.R.inc(10135);assertFalse(r.getAnnotations(df.getRDFSLabel()).isEmpty());
        }
        }__CLR4_5_27s87s8lvico1jk.R.inc(10136);for (OWLAxiom r : ontology2.getAxioms(AxiomType.DATATYPE_DEFINITION)) {{
            __CLR4_5_27s87s8lvico1jk.R.inc(10137);assertFalse(r.getAnnotations(df.getRDFSLabel()).isEmpty());
        }
    }}finally{__CLR4_5_27s87s8lvico1jk.R.flushNeeded();}}

    @Test
    public void shouldDoCompleteRoundtripWithAnnotationsFunctional()
            throws Exception {__CLR4_5_27s87s8lvico1jk.R.globalSliceStart(getClass().getName(),10138);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2f4qcvg7tm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_27s87s8lvico1jk.R.rethrow($CLV_t2$);}finally{__CLR4_5_27s87s8lvico1jk.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.ontology.SWRLRoundTripTestCase.shouldDoCompleteRoundtripWithAnnotationsFunctional",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10138,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2f4qcvg7tm() throws Exception{try{__CLR4_5_27s87s8lvico1jk.R.inc(10138);
        __CLR4_5_27s87s8lvico1jk.R.inc(10139);OWLOntology ontology = prepareOntology();
        __CLR4_5_27s87s8lvico1jk.R.inc(10140);OWLDocumentFormat f = new FunctionalSyntaxDocumentFormat();
        __CLR4_5_27s87s8lvico1jk.R.inc(10141);OWLOntology ontology2 = loadOntologyFromString(saveOntology(ontology, f));
        __CLR4_5_27s87s8lvico1jk.R.inc(10142);equal(ontology, ontology2);
        __CLR4_5_27s87s8lvico1jk.R.inc(10143);for (OWLAxiom r : ontology2.getAxioms(AxiomType.SWRL_RULE)) {{
            __CLR4_5_27s87s8lvico1jk.R.inc(10144);assertFalse(r.getAnnotations(df.getRDFSLabel()).isEmpty());
        }
        }__CLR4_5_27s87s8lvico1jk.R.inc(10145);for (OWLAxiom r : ontology2.getAxioms(AxiomType.DATATYPE_DEFINITION)) {{
            __CLR4_5_27s87s8lvico1jk.R.inc(10146);assertFalse(r.getAnnotations(df.getRDFSLabel()).isEmpty());
        }
    }}finally{__CLR4_5_27s87s8lvico1jk.R.flushNeeded();}}

    @Test
    public void shouldDoCompleteRoundtripWithAnnotationsRDFXML()
            throws Exception {__CLR4_5_27s87s8lvico1jk.R.globalSliceStart(getClass().getName(),10147);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23afpnw7tv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_27s87s8lvico1jk.R.rethrow($CLV_t2$);}finally{__CLR4_5_27s87s8lvico1jk.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.ontology.SWRLRoundTripTestCase.shouldDoCompleteRoundtripWithAnnotationsRDFXML",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10147,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23afpnw7tv() throws Exception{try{__CLR4_5_27s87s8lvico1jk.R.inc(10147);
        __CLR4_5_27s87s8lvico1jk.R.inc(10148);OWLOntology ontology = prepareOntology();
        __CLR4_5_27s87s8lvico1jk.R.inc(10149);OWLDocumentFormat f = new RDFXMLDocumentFormat();
        __CLR4_5_27s87s8lvico1jk.R.inc(10150);OWLOntology ontology2 = loadOntologyFromString(saveOntology(ontology, f));
        __CLR4_5_27s87s8lvico1jk.R.inc(10151);equal(ontology, ontology2);
        __CLR4_5_27s87s8lvico1jk.R.inc(10152);for (OWLAxiom r : ontology2.getAxioms(AxiomType.SWRL_RULE)) {{
            __CLR4_5_27s87s8lvico1jk.R.inc(10153);assertFalse(r.getAnnotations(df.getRDFSLabel()).isEmpty());
        }
        }__CLR4_5_27s87s8lvico1jk.R.inc(10154);for (OWLAxiom r : ontology2.getAxioms(AxiomType.DATATYPE_DEFINITION)) {{
            __CLR4_5_27s87s8lvico1jk.R.inc(10155);assertFalse(r.getAnnotations(df.getRDFSLabel()).isEmpty());
        }
    }}finally{__CLR4_5_27s87s8lvico1jk.R.flushNeeded();}}

    @Test
    public void shouldDoCompleteRoundtripWithAnnotationsDatatypeRDFXML()
            throws Exception {__CLR4_5_27s87s8lvico1jk.R.globalSliceStart(getClass().getName(),10156);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2j7ocvk7u4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_27s87s8lvico1jk.R.rethrow($CLV_t2$);}finally{__CLR4_5_27s87s8lvico1jk.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.ontology.SWRLRoundTripTestCase.shouldDoCompleteRoundtripWithAnnotationsDatatypeRDFXML",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10156,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2j7ocvk7u4() throws Exception{try{__CLR4_5_27s87s8lvico1jk.R.inc(10156);
        __CLR4_5_27s87s8lvico1jk.R.inc(10157);OWLOntology ontology = prepareOntology1();
        __CLR4_5_27s87s8lvico1jk.R.inc(10158);OWLDocumentFormat f = new RDFXMLDocumentFormat();
        __CLR4_5_27s87s8lvico1jk.R.inc(10159);OWLOntology ontology2 = loadOntologyFromString(saveOntology(ontology, f));
        __CLR4_5_27s87s8lvico1jk.R.inc(10160);equal(ontology, ontology2);
        __CLR4_5_27s87s8lvico1jk.R.inc(10161);for (OWLAxiom r : ontology2.getAxioms(AxiomType.DATATYPE_DEFINITION)) {{
            __CLR4_5_27s87s8lvico1jk.R.inc(10162);assertFalse(r.getAnnotations(df.getRDFSLabel()).isEmpty());
        }
    }}finally{__CLR4_5_27s87s8lvico1jk.R.flushNeeded();}}

    @Ignore("man syntax does not like annotations")
    @Test
    public void shouldDoCompleteRoundtripWithAnnotationsMan() throws Exception {try{__CLR4_5_27s87s8lvico1jk.R.inc(10163);
        __CLR4_5_27s87s8lvico1jk.R.inc(10164);OWLOntology ontology = prepareOntology();
        __CLR4_5_27s87s8lvico1jk.R.inc(10165);OWLDocumentFormat f = new ManchesterSyntaxDocumentFormat();
        __CLR4_5_27s87s8lvico1jk.R.inc(10166);StringDocumentTarget save = saveOntology(ontology, f);
        __CLR4_5_27s87s8lvico1jk.R.inc(10167);OWLOntology ontology2 = loadOntologyFromString(save);
        __CLR4_5_27s87s8lvico1jk.R.inc(10168);equal(ontology, ontology2);
        __CLR4_5_27s87s8lvico1jk.R.inc(10169);for (OWLAxiom r : ontology2.getAxioms(AxiomType.SWRL_RULE)) {{
            __CLR4_5_27s87s8lvico1jk.R.inc(10170);assertFalse(r.getAnnotations(df.getRDFSLabel()).isEmpty());
        }
        }__CLR4_5_27s87s8lvico1jk.R.inc(10171);for (OWLAxiom r : ontology2.getAxioms(AxiomType.DATATYPE_DEFINITION)) {{
            __CLR4_5_27s87s8lvico1jk.R.inc(10172);assertFalse(r.getAnnotations(df.getRDFSLabel()).isEmpty());
        }
    }}finally{__CLR4_5_27s87s8lvico1jk.R.flushNeeded();}}

    /**
     * @return
     * @throws OWLOntologyCreationException
     */
    @Nonnull
    OWLOntology prepareOntology() throws OWLOntologyCreationException {try{__CLR4_5_27s87s8lvico1jk.R.inc(10173);
        __CLR4_5_27s87s8lvico1jk.R.inc(10174);OWLClass a = Class(IRI(NS + "#A"));
        __CLR4_5_27s87s8lvico1jk.R.inc(10175);OWLDataProperty p = df.getOWLDataProperty(IRI(NS + "#P"));
        __CLR4_5_27s87s8lvico1jk.R.inc(10176);SWRLVariable x = df.getSWRLVariable(IRI(NS + "#X"));
        __CLR4_5_27s87s8lvico1jk.R.inc(10177);SWRLVariable y = df.getSWRLVariable(IRI(NS + "#Y"));
        __CLR4_5_27s87s8lvico1jk.R.inc(10178);OWLOntology ontology = m.createOntology(IRI(NS));
        __CLR4_5_27s87s8lvico1jk.R.inc(10179);Set<SWRLAtom> body = new TreeSet<>();
        __CLR4_5_27s87s8lvico1jk.R.inc(10180);body.add(df.getSWRLDataPropertyAtom(p, x, y));
        __CLR4_5_27s87s8lvico1jk.R.inc(10181);body.add(df.getSWRLDataRangeAtom(
                df.getOWLDatatype(XSDVocabulary.STRING.getIRI()), y));
        __CLR4_5_27s87s8lvico1jk.R.inc(10182);Set<SWRLAtom> head = new TreeSet<>();
        __CLR4_5_27s87s8lvico1jk.R.inc(10183);head.add(df.getSWRLClassAtom(a, x));
        __CLR4_5_27s87s8lvico1jk.R.inc(10184);OWLAnnotation ann = df.getOWLAnnotation(df.getRDFSLabel(),
                df.getOWLLiteral("test", ""));
        __CLR4_5_27s87s8lvico1jk.R.inc(10185);SWRLRule rule = df.getSWRLRule(body, head, singleton(ann));
        __CLR4_5_27s87s8lvico1jk.R.inc(10186);ontology.getOWLOntologyManager().addAxiom(ontology, rule);
        __CLR4_5_27s87s8lvico1jk.R.inc(10187);OWLDatatypeDefinitionAxiom def = df.getOWLDatatypeDefinitionAxiom(
                df.getOWLDatatype(IRI.create("urn:mydatatype")),
                df.getOWLDatatypeMaxExclusiveRestriction(200D),
                singleton(df.getOWLAnnotation(df.getRDFSLabel(),
                        df.getOWLLiteral("datatype definition"))));
        __CLR4_5_27s87s8lvico1jk.R.inc(10188);ontology.getOWLOntologyManager().addAxiom(ontology, def);
        __CLR4_5_27s87s8lvico1jk.R.inc(10189);return ontology;
    }finally{__CLR4_5_27s87s8lvico1jk.R.flushNeeded();}}

    @Nonnull
    OWLOntology prepareOntology1() throws OWLOntologyCreationException {try{__CLR4_5_27s87s8lvico1jk.R.inc(10190);
        __CLR4_5_27s87s8lvico1jk.R.inc(10191);OWLOntology ontology = m.createOntology(IRI(NS));
        __CLR4_5_27s87s8lvico1jk.R.inc(10192);OWLDatatypeDefinitionAxiom def = df.getOWLDatatypeDefinitionAxiom(
                df.getOWLDatatype(IRI.create("urn:mydatatype")),
                df.getOWLDatatypeMaxExclusiveRestriction(200D),
                singleton(df.getOWLAnnotation(df.getRDFSLabel(),
                        df.getOWLLiteral("datatype definition"))));
        __CLR4_5_27s87s8lvico1jk.R.inc(10193);ontology.getOWLOntologyManager().addAxiom(ontology, def);
        __CLR4_5_27s87s8lvico1jk.R.inc(10194);return ontology;
    }finally{__CLR4_5_27s87s8lvico1jk.R.flushNeeded();}}

    @Test
    public void shouldParse() throws OWLOntologyCreationException {__CLR4_5_27s87s8lvico1jk.R.globalSliceStart(getClass().getName(),10195);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2u1wfsp7v7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_27s87s8lvico1jk.R.rethrow($CLV_t2$);}finally{__CLR4_5_27s87s8lvico1jk.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.ontology.SWRLRoundTripTestCase.shouldParse",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10195,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2u1wfsp7v7() throws OWLOntologyCreationException{try{__CLR4_5_27s87s8lvico1jk.R.inc(10195);
        __CLR4_5_27s87s8lvico1jk.R.inc(10196);String s = "<?xml version=\"1.0\"?>\n"
                + "<rdf:RDF xmlns=\"urn:test#\"\n"
                + "     xml:base=\"urn:test\"\n"
                + "     xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"\n"
                + "     xmlns:swrl=\"http://www.w3.org/2003/11/swrl#\"\n"
                + "     xmlns:swrlb=\"http://www.w3.org/2003/11/swrlb#\"\n"
                + "     xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\"\n"
                + "     xmlns:owl=\"http://www.w3.org/2002/07/owl#\"\n"
                + "     xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\">\n"
                + "    <owl:Ontology rdf:about=\"urn:test\"/>\n"
                + "    <rdfs:Datatype rdf:about=\"urn:mydatatype\">\n"
                + "        <owl:equivalentClass>\n"
                + "            <rdfs:Datatype rdf:about=\"http://www.w3.org/2001/XMLSchema#double\"/>\n"
                + "        </owl:equivalentClass>\n"
                + "    </rdfs:Datatype>\n"
                + "    <owl:Axiom>\n"
                + "        <rdfs:label >datatype definition</rdfs:label>\n"
                + "        <owl:annotatedProperty rdf:resource=\"http://www.w3.org/2002/07/owl#equivalentClass\"/>\n"
                + "        <owl:annotatedSource rdf:resource=\"urn:mydatatype\"/>\n"
                + "        <owl:annotatedTarget>\n"
                + "            <rdfs:Datatype rdf:about=\"http://www.w3.org/2001/XMLSchema#double\"/>\n"
                + "        </owl:annotatedTarget>\n"
                + "    </owl:Axiom></rdf:RDF>";
        __CLR4_5_27s87s8lvico1jk.R.inc(10197);OWLOntology o = loadOntologyFromString(s);
        __CLR4_5_27s87s8lvico1jk.R.inc(10198);OWLDatatypeDefinitionAxiom def = df.getOWLDatatypeDefinitionAxiom(
                df.getOWLDatatype(IRI.create("urn:mydatatype")),
                df.getDoubleOWLDatatype(),
                singleton(df.getOWLAnnotation(df.getRDFSLabel(),
                        df.getOWLLiteral("datatype definition", ""))));
        __CLR4_5_27s87s8lvico1jk.R.inc(10199);assertTrue(o.getAxioms().contains(def));
    }finally{__CLR4_5_27s87s8lvico1jk.R.flushNeeded();}}

    @Test
    public void shouldParse2() throws OWLOntologyCreationException {__CLR4_5_27s87s8lvico1jk.R.globalSliceStart(getClass().getName(),10200);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yjzcl57vc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_27s87s8lvico1jk.R.rethrow($CLV_t2$);}finally{__CLR4_5_27s87s8lvico1jk.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.ontology.SWRLRoundTripTestCase.shouldParse2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10200,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yjzcl57vc() throws OWLOntologyCreationException{try{__CLR4_5_27s87s8lvico1jk.R.inc(10200);
        __CLR4_5_27s87s8lvico1jk.R.inc(10201);String s = "<?xml version=\"1.0\"?>\n"
                + "<rdf:RDF xmlns=\"http://www.w3.org/2002/07/owl#\"\n"
                + "     xml:base=\"http://www.w3.org/2002/07/owl\"\n"
                + "     xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"\n"
                + "     xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\"\n"
                + "     xmlns:owl=\"http://www.w3.org/2002/07/owl#\"\n"
                + "     xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\">\n"
                + "    <Class rdf:about=\"urn:myClass\">\n"
                + "        <rdfs:subClassOf rdf:resource=\"urn:test\"/>\n"
                + "    </Class>\n"
                + "    <Axiom>\n"
                + "        <rdfs:label>datatype definition</rdfs:label>\n"
                + "        <annotatedProperty rdf:resource=\"http://www.w3.org/2000/01/rdf-schema#subClassOf\"/>\n"
                + "        <annotatedSource rdf:resource=\"urn:myClass\"/>\n"
                + "        <annotatedTarget rdf:resource=\"urn:test\"/>\n"
                + "    </Axiom>\n" + "    <Class rdf:about=\"urn:test\"/>\n"
                + "</rdf:RDF>\n" + "";
        __CLR4_5_27s87s8lvico1jk.R.inc(10202);OWLOntology o = loadOntologyFromString(s);
        __CLR4_5_27s87s8lvico1jk.R.inc(10203);OWLSubClassOfAxiom def = df.getOWLSubClassOfAxiom(
                df.getOWLClass(IRI.create("urn:myClass")),
                df.getOWLClass(IRI.create("urn:test")),
                singleton(df.getOWLAnnotation(df.getRDFSLabel(),
                        df.getOWLLiteral("datatype definition", ""))));
        __CLR4_5_27s87s8lvico1jk.R.inc(10204);assertTrue(o.getAxioms().contains(def));
    }finally{__CLR4_5_27s87s8lvico1jk.R.flushNeeded();}}
}
