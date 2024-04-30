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

import static org.semanticweb.owlapi.model.parameters.Imports.EXCLUDED;
import static org.semanticweb.owlapi.util.CollectionFactory.sortOptionally;
import static org.semanticweb.owlapi.util.OWLAPIPreconditions.checkNotNull;

import java.io.PrintWriter;
import java.io.Writer;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLDataProperty;
import org.semanticweb.owlapi.model.OWLDocumentFormat;
import org.semanticweb.owlapi.model.OWLEntity;
import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLObjectProperty;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.util.AbstractOWLStorer;

/**
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.2.0
 */
public abstract class DLSyntaxStorerBase extends AbstractOWLStorer {public static class __CLR4_5_23ld3ldlvicm8xp{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,4730,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 40000L;
    private DLSyntaxObjectRenderer ren = new DLSyntaxObjectRenderer();

    @Override
    protected void storeOntology(@Nonnull OWLOntology ontology, Writer writer, OWLDocumentFormat format) {try{__CLR4_5_23ld3ldlvicm8xp.R.inc(4657);
        __CLR4_5_23ld3ldlvicm8xp.R.inc(4658);checkNotNull(ontology, "ontology cannot be null");
        __CLR4_5_23ld3ldlvicm8xp.R.inc(4659);PrintWriter printWriter = new PrintWriter(checkNotNull(writer, "writer cannot be null"));
        __CLR4_5_23ld3ldlvicm8xp.R.inc(4660);beginWritingOntology(ontology, printWriter);
        __CLR4_5_23ld3ldlvicm8xp.R.inc(4661);Set<OWLAxiom> printed = new HashSet<>();
        __CLR4_5_23ld3ldlvicm8xp.R.inc(4662);for (OWLObjectProperty prop : sortOptionally(ontology.getObjectPropertiesInSignature())) {{
            assert (((prop != null)&&(__CLR4_5_23ld3ldlvicm8xp.R.iget(4663)!=0|true))||(__CLR4_5_23ld3ldlvicm8xp.R.iget(4664)==0&false));
            __CLR4_5_23ld3ldlvicm8xp.R.inc(4665);write(ontology, prop, ontology.getAxioms(prop, EXCLUDED), printWriter, printed);
        }
        }__CLR4_5_23ld3ldlvicm8xp.R.inc(4666);for (OWLDataProperty prop : sortOptionally(ontology.getDataPropertiesInSignature())) {{
            assert (((prop != null)&&(__CLR4_5_23ld3ldlvicm8xp.R.iget(4667)!=0|true))||(__CLR4_5_23ld3ldlvicm8xp.R.iget(4668)==0&false));
            __CLR4_5_23ld3ldlvicm8xp.R.inc(4669);write(ontology, prop, ontology.getAxioms(prop, EXCLUDED), printWriter, printed);
        }
        }__CLR4_5_23ld3ldlvicm8xp.R.inc(4670);for (OWLClass cls : sortOptionally(ontology.getClassesInSignature())) {{
            assert (((cls != null)&&(__CLR4_5_23ld3ldlvicm8xp.R.iget(4671)!=0|true))||(__CLR4_5_23ld3ldlvicm8xp.R.iget(4672)==0&false));
            __CLR4_5_23ld3ldlvicm8xp.R.inc(4673);write(ontology, cls, ontology.getAxioms(cls, EXCLUDED), printWriter, printed);
        }
        }__CLR4_5_23ld3ldlvicm8xp.R.inc(4674);for (OWLNamedIndividual ind : sortOptionally(ontology.getIndividualsInSignature())) {{
            assert (((ind != null)&&(__CLR4_5_23ld3ldlvicm8xp.R.iget(4675)!=0|true))||(__CLR4_5_23ld3ldlvicm8xp.R.iget(4676)==0&false));
            __CLR4_5_23ld3ldlvicm8xp.R.inc(4677);write(ontology, ind, ontology.getAxioms(ind, EXCLUDED), printWriter, printed);
        }
        }__CLR4_5_23ld3ldlvicm8xp.R.inc(4678);beginWritingGeneralAxioms(ontology.getGeneralClassAxioms(), printWriter);
        __CLR4_5_23ld3ldlvicm8xp.R.inc(4679);for (OWLAxiom ax : ontology.getGeneralClassAxioms()) {{
            assert (((ax != null)&&(__CLR4_5_23ld3ldlvicm8xp.R.iget(4680)!=0|true))||(__CLR4_5_23ld3ldlvicm8xp.R.iget(4681)==0&false));
            __CLR4_5_23ld3ldlvicm8xp.R.inc(4682);if ((((printed.add(ax))&&(__CLR4_5_23ld3ldlvicm8xp.R.iget(4683)!=0|true))||(__CLR4_5_23ld3ldlvicm8xp.R.iget(4684)==0&false))) {{
                __CLR4_5_23ld3ldlvicm8xp.R.inc(4685);beginWritingAxiom(ax, printWriter);
                __CLR4_5_23ld3ldlvicm8xp.R.inc(4686);writeAxiom(null, ax, printWriter);
                __CLR4_5_23ld3ldlvicm8xp.R.inc(4687);endWritingAxiom(ax, printWriter);
            }
        }}
        }__CLR4_5_23ld3ldlvicm8xp.R.inc(4688);endWritingGeneralAxioms(ontology.getGeneralClassAxioms(), printWriter);
        __CLR4_5_23ld3ldlvicm8xp.R.inc(4689);endWritingOntology(ontology, printWriter);
        __CLR4_5_23ld3ldlvicm8xp.R.inc(4690);printWriter.flush();
    }finally{__CLR4_5_23ld3ldlvicm8xp.R.flushNeeded();}}

    private void write(@Nonnull OWLOntology ont, @Nonnull OWLEntity entity, @Nonnull Set<? extends OWLAxiom> axioms,
        @Nonnull PrintWriter writer, Set<OWLAxiom> printed) {try{__CLR4_5_23ld3ldlvicm8xp.R.inc(4691);
        __CLR4_5_23ld3ldlvicm8xp.R.inc(4692);beginWritingAxioms(entity, axioms, writer);
        __CLR4_5_23ld3ldlvicm8xp.R.inc(4693);for (OWLAxiom ax : sortOptionally(axioms)) {{
            assert (((ax != null)&&(__CLR4_5_23ld3ldlvicm8xp.R.iget(4694)!=0|true))||(__CLR4_5_23ld3ldlvicm8xp.R.iget(4695)==0&false));
            __CLR4_5_23ld3ldlvicm8xp.R.inc(4696);if ((((printed.add(ax))&&(__CLR4_5_23ld3ldlvicm8xp.R.iget(4697)!=0|true))||(__CLR4_5_23ld3ldlvicm8xp.R.iget(4698)==0&false))) {{
                __CLR4_5_23ld3ldlvicm8xp.R.inc(4699);beginWritingAxiom(ax, writer);
                __CLR4_5_23ld3ldlvicm8xp.R.inc(4700);writeAxiom(entity, ax, writer);
                __CLR4_5_23ld3ldlvicm8xp.R.inc(4701);endWritingAxiom(ax, writer);
            }
        }}
        }__CLR4_5_23ld3ldlvicm8xp.R.inc(4702);Set<OWLAxiom> usages = new TreeSet<>(ont.getReferencingAxioms(entity, EXCLUDED));
        __CLR4_5_23ld3ldlvicm8xp.R.inc(4703);usages.removeAll(axioms);
        __CLR4_5_23ld3ldlvicm8xp.R.inc(4704);beginWritingUsage(entity, usages, writer);
        __CLR4_5_23ld3ldlvicm8xp.R.inc(4705);for (OWLAxiom usage : usages) {{
            assert (((usage != null)&&(__CLR4_5_23ld3ldlvicm8xp.R.iget(4706)!=0|true))||(__CLR4_5_23ld3ldlvicm8xp.R.iget(4707)==0&false));
            __CLR4_5_23ld3ldlvicm8xp.R.inc(4708);if ((((!axioms.contains(usage) && printed.add(usage))&&(__CLR4_5_23ld3ldlvicm8xp.R.iget(4709)!=0|true))||(__CLR4_5_23ld3ldlvicm8xp.R.iget(4710)==0&false))) {{
                __CLR4_5_23ld3ldlvicm8xp.R.inc(4711);beginWritingAxiom(usage, writer);
                __CLR4_5_23ld3ldlvicm8xp.R.inc(4712);writeAxiom(entity, usage, writer);
                __CLR4_5_23ld3ldlvicm8xp.R.inc(4713);endWritingAxiom(usage, writer);
            }
        }}
        }__CLR4_5_23ld3ldlvicm8xp.R.inc(4714);endWritingUsage(entity, usages, writer);
        __CLR4_5_23ld3ldlvicm8xp.R.inc(4715);endWritingAxioms(entity, axioms, writer);
    }finally{__CLR4_5_23ld3ldlvicm8xp.R.flushNeeded();}}

    protected void writeAxiom(@Nullable OWLEntity subject, @Nonnull OWLAxiom axiom, @Nonnull PrintWriter writer) {try{__CLR4_5_23ld3ldlvicm8xp.R.inc(4716);
        __CLR4_5_23ld3ldlvicm8xp.R.inc(4717);writer.write(getRendering(subject, axiom));
    }finally{__CLR4_5_23ld3ldlvicm8xp.R.flushNeeded();}}

    @SuppressWarnings("unused")
    @Nonnull
    protected String getRendering(@Nullable OWLEntity subject, @Nonnull OWLAxiom axiom) {try{__CLR4_5_23ld3ldlvicm8xp.R.inc(4718);
        __CLR4_5_23ld3ldlvicm8xp.R.inc(4719);return ren.render(axiom);
    }finally{__CLR4_5_23ld3ldlvicm8xp.R.flushNeeded();}}

    @SuppressWarnings("unused")
    protected void beginWritingOntology(@Nonnull OWLOntology ontology, @Nonnull PrintWriter writer) {try{__CLR4_5_23ld3ldlvicm8xp.R.inc(4720);}finally{__CLR4_5_23ld3ldlvicm8xp.R.flushNeeded();}}

    @SuppressWarnings("unused")
    protected void endWritingOntology(@Nonnull OWLOntology ontology, @Nonnull PrintWriter writer) {try{__CLR4_5_23ld3ldlvicm8xp.R.inc(4721);}finally{__CLR4_5_23ld3ldlvicm8xp.R.flushNeeded();}}

    @SuppressWarnings("unused")
    protected void beginWritingAxiom(@Nonnull OWLAxiom axiom, @Nonnull PrintWriter writer) {try{__CLR4_5_23ld3ldlvicm8xp.R.inc(4722);}finally{__CLR4_5_23ld3ldlvicm8xp.R.flushNeeded();}}

    @SuppressWarnings("unused")
    protected void endWritingAxiom(@Nonnull OWLAxiom axiom, @Nonnull PrintWriter writer) {try{__CLR4_5_23ld3ldlvicm8xp.R.inc(4723);}finally{__CLR4_5_23ld3ldlvicm8xp.R.flushNeeded();}}

    @SuppressWarnings("unused")
    protected void beginWritingAxioms(@Nonnull OWLEntity subject, @Nonnull Set<? extends OWLAxiom> axioms,
        @Nonnull PrintWriter writer) {try{__CLR4_5_23ld3ldlvicm8xp.R.inc(4724);}finally{__CLR4_5_23ld3ldlvicm8xp.R.flushNeeded();}}

    @SuppressWarnings("unused")
    protected void endWritingAxioms(@Nonnull OWLEntity subject, @Nonnull Set<? extends OWLAxiom> axioms,
        @Nonnull PrintWriter writer) {try{__CLR4_5_23ld3ldlvicm8xp.R.inc(4725);}finally{__CLR4_5_23ld3ldlvicm8xp.R.flushNeeded();}}

    @SuppressWarnings("unused")
    protected void beginWritingUsage(@Nonnull OWLEntity subject, @Nonnull Set<? extends OWLAxiom> axioms,
        @Nonnull PrintWriter writer) {try{__CLR4_5_23ld3ldlvicm8xp.R.inc(4726);}finally{__CLR4_5_23ld3ldlvicm8xp.R.flushNeeded();}}

    @SuppressWarnings("unused")
    protected void endWritingUsage(@Nonnull OWLEntity subject, @Nonnull Set<? extends OWLAxiom> axioms,
        @Nonnull PrintWriter writer) {try{__CLR4_5_23ld3ldlvicm8xp.R.inc(4727);}finally{__CLR4_5_23ld3ldlvicm8xp.R.flushNeeded();}}

    @SuppressWarnings("unused")
    protected void beginWritingGeneralAxioms(@Nonnull Set<? extends OWLAxiom> axioms, @Nonnull PrintWriter writer) {try{__CLR4_5_23ld3ldlvicm8xp.R.inc(4728);}finally{__CLR4_5_23ld3ldlvicm8xp.R.flushNeeded();}}

    @SuppressWarnings("unused")
    protected void endWritingGeneralAxioms(@Nonnull Set<? extends OWLAxiom> axioms, @Nonnull PrintWriter writer) {try{__CLR4_5_23ld3ldlvicm8xp.R.inc(4729);}finally{__CLR4_5_23ld3ldlvicm8xp.R.flushNeeded();}}
}
