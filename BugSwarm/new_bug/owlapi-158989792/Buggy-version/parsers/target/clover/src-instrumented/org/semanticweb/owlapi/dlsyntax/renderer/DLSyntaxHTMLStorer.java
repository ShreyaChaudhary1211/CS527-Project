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
package org.semanticweb.owlapi.dlsyntax.renderer;

import static org.semanticweb.owlapi.util.OWLAPIPreconditions.checkNotNull;

import java.io.PrintWriter;
import java.util.Set;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.semanticweb.owlapi.formats.DLSyntaxHTMLDocumentFormat;
import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.OWLDocumentFormat;
import org.semanticweb.owlapi.model.OWLEntity;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.util.SimpleShortFormProvider;

/**
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.2.0
 */
public class DLSyntaxHTMLStorer extends DLSyntaxStorerBase {public static class __CLR4_5_2361361lvicm8o6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,4160,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 40000L;
    @Nonnull
    protected final SimpleShortFormProvider sfp = new SimpleShortFormProvider();

    @Override
    public boolean canStoreOntology(OWLDocumentFormat ontologyFormat) {try{__CLR4_5_2361361lvicm8o6.R.inc(4105);
        __CLR4_5_2361361lvicm8o6.R.inc(4106);return ontologyFormat instanceof DLSyntaxHTMLDocumentFormat;
    }finally{__CLR4_5_2361361lvicm8o6.R.flushNeeded();}}

    @SuppressWarnings("null")
    @Nonnull
    @Override
    protected String getRendering(@Nullable final OWLEntity subject,
            OWLAxiom axiom) {try{__CLR4_5_2361361lvicm8o6.R.inc(4107);
        __CLR4_5_2361361lvicm8o6.R.inc(4108);checkNotNull(axiom, "axiom cannot be null");
        __CLR4_5_2361361lvicm8o6.R.inc(4109);DLSyntaxObjectRenderer ren = new DLSyntaxObjectRenderer() {

            @Override
            protected String renderEntity(@Nonnull OWLEntity entity) {try{__CLR4_5_2361361lvicm8o6.R.inc(4110);
                __CLR4_5_2361361lvicm8o6.R.inc(4111);String shortForm = sfp.getShortForm(checkNotNull(entity,
                        "entity cannot be null"));
                __CLR4_5_2361361lvicm8o6.R.inc(4112);if ((((!entity.equals(subject))&&(__CLR4_5_2361361lvicm8o6.R.iget(4113)!=0|true))||(__CLR4_5_2361361lvicm8o6.R.iget(4114)==0&false))) {{
                    __CLR4_5_2361361lvicm8o6.R.inc(4115);return "<a href=\"#" + shortForm + "\">" + shortForm
                            + "</a>";
                } }else {{
                    __CLR4_5_2361361lvicm8o6.R.inc(4116);return shortForm;
                }
            }}finally{__CLR4_5_2361361lvicm8o6.R.flushNeeded();}}

            @Override
            protected void write(DLSyntax keyword) {try{__CLR4_5_2361361lvicm8o6.R.inc(4117);
                __CLR4_5_2361361lvicm8o6.R.inc(4118);write(checkNotNull(keyword, "keyword cannot be null").toHTMLString());
            }finally{__CLR4_5_2361361lvicm8o6.R.flushNeeded();}}
        };
        __CLR4_5_2361361lvicm8o6.R.inc(4119);ren.setFocusedObject(subject);
        __CLR4_5_2361361lvicm8o6.R.inc(4120);ren.setShortFormProvider(sfp);
        __CLR4_5_2361361lvicm8o6.R.inc(4121);return ren.render(axiom);
    }finally{__CLR4_5_2361361lvicm8o6.R.flushNeeded();}}

    @Override
    protected void beginWritingOntology(@Nonnull OWLOntology ontology,
            @Nonnull PrintWriter writer) {try{__CLR4_5_2361361lvicm8o6.R.inc(4122);
        __CLR4_5_2361361lvicm8o6.R.inc(4123);checkNotNull(ontology, "ontology cannot be null");
        __CLR4_5_2361361lvicm8o6.R.inc(4124);checkNotNull(writer, "writer cannot be null").println(
                "<html>\n<body>\n<h1>Ontology: ");
        __CLR4_5_2361361lvicm8o6.R.inc(4125);writer.print(ontology.getOntologyID());
        __CLR4_5_2361361lvicm8o6.R.inc(4126);writer.println("</h1>");
    }finally{__CLR4_5_2361361lvicm8o6.R.flushNeeded();}}

    @SuppressWarnings("unused")
    protected void writeEntity(@Nonnull OWLEntity entity,
            @Nonnull PrintWriter writer) {try{__CLR4_5_2361361lvicm8o6.R.inc(4127);}finally{__CLR4_5_2361361lvicm8o6.R.flushNeeded();}}

    @Override
    protected void endWritingOntology(OWLOntology ontology, PrintWriter writer) {try{__CLR4_5_2361361lvicm8o6.R.inc(4128);
        __CLR4_5_2361361lvicm8o6.R.inc(4129);checkNotNull(ontology, "ontology cannot be null");
        __CLR4_5_2361361lvicm8o6.R.inc(4130);checkNotNull(writer, "writer cannot be null").println(
                "</body>\n</html>");
    }finally{__CLR4_5_2361361lvicm8o6.R.flushNeeded();}}

    @Override
    protected void beginWritingAxiom(OWLAxiom axiom, PrintWriter writer) {try{__CLR4_5_2361361lvicm8o6.R.inc(4131);
        __CLR4_5_2361361lvicm8o6.R.inc(4132);checkNotNull(axiom, "axiom cannot be null");
        __CLR4_5_2361361lvicm8o6.R.inc(4133);checkNotNull(writer, "writer cannot be null").println(
                "<div class=\"axiombox\"> ");
    }finally{__CLR4_5_2361361lvicm8o6.R.flushNeeded();}}

    @Override
    protected void endWritingAxiom(OWLAxiom axiom, PrintWriter writer) {try{__CLR4_5_2361361lvicm8o6.R.inc(4134);
        __CLR4_5_2361361lvicm8o6.R.inc(4135);checkNotNull(axiom, "axiom cannot be null");
        __CLR4_5_2361361lvicm8o6.R.inc(4136);checkNotNull(writer, "writer cannot be null").println(" </div>");
    }finally{__CLR4_5_2361361lvicm8o6.R.flushNeeded();}}

    @Override
    protected void beginWritingAxioms(@Nonnull OWLEntity subject,
            Set<? extends OWLAxiom> axioms, @Nonnull PrintWriter writer) {try{__CLR4_5_2361361lvicm8o6.R.inc(4137);
        __CLR4_5_2361361lvicm8o6.R.inc(4138);checkNotNull(subject, "subject cannot be null");
        __CLR4_5_2361361lvicm8o6.R.inc(4139);checkNotNull(axioms, "axioms cannot be null");
        __CLR4_5_2361361lvicm8o6.R.inc(4140);checkNotNull(writer, "writer cannot be null").print("<h2><a name=\"");
        __CLR4_5_2361361lvicm8o6.R.inc(4141);writer.print(sfp.getShortForm(subject));
        __CLR4_5_2361361lvicm8o6.R.inc(4142);writer.print("\">");
        __CLR4_5_2361361lvicm8o6.R.inc(4143);writer.print(subject.getIRI());
        __CLR4_5_2361361lvicm8o6.R.inc(4144);writer.println("</a></h2>\n<div class=\"entitybox\">");
    }finally{__CLR4_5_2361361lvicm8o6.R.flushNeeded();}}

    @Override
    protected void endWritingAxioms(OWLEntity subject,
            Set<? extends OWLAxiom> axioms, @Nonnull PrintWriter writer) {try{__CLR4_5_2361361lvicm8o6.R.inc(4145);
        __CLR4_5_2361361lvicm8o6.R.inc(4146);writer.println("</div>");
    }finally{__CLR4_5_2361361lvicm8o6.R.flushNeeded();}}

    @Override
    protected void beginWritingGeneralAxioms(Set<? extends OWLAxiom> axioms,
            PrintWriter writer) {try{__CLR4_5_2361361lvicm8o6.R.inc(4147);
        __CLR4_5_2361361lvicm8o6.R.inc(4148);checkNotNull(writer, "writer cannot be null").println("<div>");
    }finally{__CLR4_5_2361361lvicm8o6.R.flushNeeded();}}

    @Override
    protected void endWritingGeneralAxioms(Set<? extends OWLAxiom> axioms,
            PrintWriter writer) {try{__CLR4_5_2361361lvicm8o6.R.inc(4149);
        __CLR4_5_2361361lvicm8o6.R.inc(4150);checkNotNull(axioms, "axioms cannot be null");
        __CLR4_5_2361361lvicm8o6.R.inc(4151);checkNotNull(writer, "writer cannot be null").println("</div>");
    }finally{__CLR4_5_2361361lvicm8o6.R.flushNeeded();}}

    @Override
    protected void beginWritingUsage(OWLEntity subject,
            @Nonnull Set<? extends OWLAxiom> axioms, PrintWriter writer) {try{__CLR4_5_2361361lvicm8o6.R.inc(4152);
        __CLR4_5_2361361lvicm8o6.R.inc(4153);checkNotNull(subject, "subject cannot be null");
        __CLR4_5_2361361lvicm8o6.R.inc(4154);checkNotNull(axioms, "axioms cannot be null");
        __CLR4_5_2361361lvicm8o6.R.inc(4155);checkNotNull(writer, "writer cannot be null").println(
                "<div class=\"usage\" style=\"margin-left: 60px; size: tiny\">\n<h3>Usages ("
                        + axioms.size() + ")</h3>");
    }finally{__CLR4_5_2361361lvicm8o6.R.flushNeeded();}}

    @Override
    protected void endWritingUsage(OWLEntity subject,
            Set<? extends OWLAxiom> axioms, PrintWriter writer) {try{__CLR4_5_2361361lvicm8o6.R.inc(4156);
        __CLR4_5_2361361lvicm8o6.R.inc(4157);checkNotNull(subject, "subject cannot be null");
        __CLR4_5_2361361lvicm8o6.R.inc(4158);checkNotNull(axioms, "axioms cannot be null");
        __CLR4_5_2361361lvicm8o6.R.inc(4159);checkNotNull(writer, "writer cannot be null").println("</div>");
    }finally{__CLR4_5_2361361lvicm8o6.R.flushNeeded();}}
}
