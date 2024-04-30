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

import org.junit.Test;
import org.semanticweb.owlapi.api.test.baseclasses.TestBase;
import org.semanticweb.owlapi.formats.LatexDocumentFormat;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.OWLOntologyStorageException;

@SuppressWarnings("javadoc")
public class LatexRendererTestCase extends TestBase {static class __CLR4_5_28br8brlvico1mk{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,10800,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void shouldRenderEscapingUnderscores() throws Exception {__CLR4_5_28br8brlvico1mk.R.globalSliceStart(getClass().getName(),10791);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22ee3i18br();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28br8brlvico1mk.R.rethrow($CLV_t2$);}finally{__CLR4_5_28br8brlvico1mk.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.LatexRendererTestCase.shouldRenderEscapingUnderscores",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10791,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22ee3i18br() throws Exception{try{__CLR4_5_28br8brlvico1mk.R.inc(10791);
        __CLR4_5_28br8brlvico1mk.R.inc(10792);String input = "<?xml version=\"1.0\"?>\n"
                + "<rdf:RDF xmlns=\"http://namespace.owl#\"\n"
                + "     xml:base=\"http://namespace.owl\"\n"
                + "     xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"\n"
                + "     xmlns:owl=\"http://www.w3.org/2002/07/owl#\"\n"
                + "     xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\"\n"
                + "     xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\">\n"
                + "    <owl:Ontology rdf:about=\"http://namespace.owl\"/>\n"
                + "    <owl:Class rdf:about=\"http://namespace.owl#C_Test\"/>"
                + "<owl:ObjectProperty rdf:about=\"http://namespace.owl#p\"/>"
                + "</rdf:RDF>";
        __CLR4_5_28br8brlvico1mk.R.inc(10793);OWLOntology o = loadOntologyFromString(input);
        __CLR4_5_28br8brlvico1mk.R.inc(10794);assertTrue(saveOntology(o, new LatexDocumentFormat()).toString()
                .contains("C\\_Test"));
    }finally{__CLR4_5_28br8brlvico1mk.R.flushNeeded();}}
    
    @Test
    public void shouldSaveInverses() throws OWLOntologyCreationException, OWLOntologyStorageException {__CLR4_5_28br8brlvico1mk.R.globalSliceStart(getClass().getName(),10795);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wi12p28bv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28br8brlvico1mk.R.rethrow($CLV_t2$);}finally{__CLR4_5_28br8brlvico1mk.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.LatexRendererTestCase.shouldSaveInverses",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10795,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wi12p28bv() throws OWLOntologyCreationException, OWLOntologyStorageException{try{__CLR4_5_28br8brlvico1mk.R.inc(10795);
        __CLR4_5_28br8brlvico1mk.R.inc(10796);String input = "@prefix : <http://www.semanticweb.org/jslob/ontologies/2014/9/untitled-ontology-61#> .\n" + 
        "@prefix owl: <http://www.w3.org/2002/07/owl#> .\n" + 
        "@prefix rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#> .\n" + 
        "@base <http://www.semanticweb.org/jslob/ontologies/2014/9/untitled-ontology-61> .\n\n" + 
        "<http://www.semanticweb.org/jslob/ontologies/2014/9/untitled-ontology-61> rdf:type owl:Ontology .\n\n" + 
        ":buzz_of rdf:type owl:ObjectProperty ;\n owl:inverseOf :fizzle_of .\n\n :fizzle_of rdf:type owl:ObjectProperty .";
        __CLR4_5_28br8brlvico1mk.R.inc(10797);String expected="\\documentclass{article}\n" + 
            "\\parskip 0pt\n\\parindent 0pt\n\\oddsidemargin 0cm\n\\textwidth 19cm\n\\begin{document}\n\n" + 
            "\\section*{Object properties}\\subsubsection*{buzz\\_of}\n\n" + 
            "buzz\\_of~\\ensuremath{\\equiv}~fizzle\\_of\\ensuremath{^-}\n\n" + 
            "\\subsubsection*{fizzle\\_of}\n\n" + 
            "buzz\\_of~\\ensuremath{\\equiv}~fizzle\\_of\\ensuremath{^-}\n\n" + 
            "\\section*{Data properties}\\section*{Individuals}\\section*{Datatypes}\\end{document}\n";
        __CLR4_5_28br8brlvico1mk.R.inc(10798);OWLOntology o = loadOntologyFromString(input);
        __CLR4_5_28br8brlvico1mk.R.inc(10799);assertEquals(expected, saveOntology(o, new LatexDocumentFormat()).toString());
    }finally{__CLR4_5_28br8brlvico1mk.R.flushNeeded();}}
}
