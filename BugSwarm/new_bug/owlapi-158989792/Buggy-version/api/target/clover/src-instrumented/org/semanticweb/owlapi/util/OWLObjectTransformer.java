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
package org.semanticweb.owlapi.util;

import static org.semanticweb.owlapi.util.OWLAPIPreconditions.checkNotNull;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.semanticweb.owlapi.change.AddAxiomData;
import org.semanticweb.owlapi.change.AxiomChangeData;
import org.semanticweb.owlapi.change.RemoveAxiomData;
import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.vocab.OWLFacet;

import com.google.common.base.Function;
import com.google.common.base.Predicate;

/**
 * Transform axioms by rewriting parts of them.
 * 
 * @author Ignazio
 * @since 4.1.4
 * @param <T>
 *        type to transform
 */
public class OWLObjectTransformer<T> {public static class __CLR4_5_29ga9galvickrd5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0061\u0070\u0069\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237201267L,8589935092L,13252,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private Function<T, T> transformer;
    private Predicate<Object> predicate;
    private Class<T> witness;
    private OWLDataFactory df;

    /**
     * @param predicate
     *        the predicate to match the axioms to rebuild
     * @param transformer
     *        the transformer to apply
     * @param df
     *        data factory to use for changes
     * @param witness
     *        witness class for the transformer
     */
    public OWLObjectTransformer(@Nonnull Predicate<Object> predicate, @Nonnull Function<T, T> transformer,
        @Nonnull OWLDataFactory df, @Nonnull Class<T> witness) {try{__CLR4_5_29ga9galvickrd5.R.inc(12250);
        __CLR4_5_29ga9galvickrd5.R.inc(12251);this.predicate = checkNotNull(predicate, "predicate cannot be null");
        __CLR4_5_29ga9galvickrd5.R.inc(12252);this.transformer = checkNotNull(transformer, "transformer cannot be null");
        __CLR4_5_29ga9galvickrd5.R.inc(12253);this.df = checkNotNull(df, "df cannot be null");
        __CLR4_5_29ga9galvickrd5.R.inc(12254);this.witness = checkNotNull(witness, "witness cannot be null");
    }finally{__CLR4_5_29ga9galvickrd5.R.flushNeeded();}}

    /**
     * Create the required changes for this transformation to be applied to the
     * input. Note: these are AxiomChangeData changes, not ontology specific
     * changes. There is no requirement for the input to be an ontology or
     * included in an ontology.
     * 
     * @param o
     *        object to transform. Must be an axiom or an ontology for the
     *        change to be meaningful.
     * @return A list of axiom changes that should be applied.
     */
    @Nonnull
    public List<AxiomChangeData> change(@Nonnull OWLObject o) {try{__CLR4_5_29ga9galvickrd5.R.inc(12255);
        __CLR4_5_29ga9galvickrd5.R.inc(12256);checkNotNull(o, "o cannot be null");
        __CLR4_5_29ga9galvickrd5.R.inc(12257);List<AxiomChangeData> changes = new ArrayList<>();
        // no ontology changes will be collected
        __CLR4_5_29ga9galvickrd5.R.inc(12258);Visitor<T> v = new Visitor<>(new ArrayList<OWLOntologyChange>(), changes, predicate, transformer, df, witness);
        __CLR4_5_29ga9galvickrd5.R.inc(12259);o.accept(v);
        __CLR4_5_29ga9galvickrd5.R.inc(12260);return changes;
    }finally{__CLR4_5_29ga9galvickrd5.R.flushNeeded();}}

    /**
     * Create the required changes for this transformation to be applied to the
     * input. These changes are specific to the input ontology.
     * 
     * @param ontology
     *        ontology to transform.
     * @return A list of changes that should be applied.
     */
    @Nonnull
    public List<OWLOntologyChange> change(@Nonnull OWLOntology ontology) {try{__CLR4_5_29ga9galvickrd5.R.inc(12261);
        __CLR4_5_29ga9galvickrd5.R.inc(12262);checkNotNull(ontology, "ontology cannot be null");
        __CLR4_5_29ga9galvickrd5.R.inc(12263);List<AxiomChangeData> changes = new ArrayList<>();
        __CLR4_5_29ga9galvickrd5.R.inc(12264);List<OWLOntologyChange> ontologyChanges = new ArrayList<>();
        __CLR4_5_29ga9galvickrd5.R.inc(12265);Visitor<T> v = new Visitor<>(ontologyChanges, changes, predicate, transformer, df, witness);
        __CLR4_5_29ga9galvickrd5.R.inc(12266);ontology.accept(v);
        __CLR4_5_29ga9galvickrd5.R.inc(12267);for (AxiomChangeData change : changes) {{
            __CLR4_5_29ga9galvickrd5.R.inc(12268);ontologyChanges.add(change.createOntologyChange(ontology));
        }
        }__CLR4_5_29ga9galvickrd5.R.inc(12269);return ontologyChanges;
    }finally{__CLR4_5_29ga9galvickrd5.R.flushNeeded();}}

    private static class Visitor<T> implements OWLObjectVisitorEx<Object> {

        private List<AxiomChangeData> changes;
        private List<OWLOntologyChange> ontologyChanges;
        private Predicate<Object> predicate;
        private Function<T, T> transformer;
        private Class<T> witness;
        private OWLDataFactory df;

        Visitor(List<OWLOntologyChange> ontologyChanges, List<AxiomChangeData> changes, Predicate<Object> predicate,
            Function<T, T> transformer, OWLDataFactory df, Class<T> witness) {try{__CLR4_5_29ga9galvickrd5.R.inc(12270);
            __CLR4_5_29ga9galvickrd5.R.inc(12271);this.changes = changes;
            __CLR4_5_29ga9galvickrd5.R.inc(12272);this.ontologyChanges = ontologyChanges;
            __CLR4_5_29ga9galvickrd5.R.inc(12273);this.predicate = predicate;
            __CLR4_5_29ga9galvickrd5.R.inc(12274);this.transformer = transformer;
            __CLR4_5_29ga9galvickrd5.R.inc(12275);this.df = df;
            __CLR4_5_29ga9galvickrd5.R.inc(12276);this.witness = witness;
        }finally{__CLR4_5_29ga9galvickrd5.R.flushNeeded();}}

        /**
         * Check and transform an axiom.
         * 
         * @param axiom
         *        axiom to check
         * @return the transformed axiom, or null if the axiom was not
         *         transformed
         */
        @SuppressWarnings({ "unchecked" })
        @Nullable
        protected OWLAxiom checkAxiom(OWLAxiom axiom) {try{__CLR4_5_29ga9galvickrd5.R.inc(12277);
            __CLR4_5_29ga9galvickrd5.R.inc(12278);if ((((witness.isInstance(axiom))&&(__CLR4_5_29ga9galvickrd5.R.iget(12279)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12280)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12281);OWLAxiom transform = ((Function<OWLAxiom, OWLAxiom>) transformer).apply(axiom);
                __CLR4_5_29ga9galvickrd5.R.inc(12282);if ((((update(transform, axiom) != null)&&(__CLR4_5_29ga9galvickrd5.R.iget(12283)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12284)==0&false))) {{
                    __CLR4_5_29ga9galvickrd5.R.inc(12285);return transform;
                }
            }}
            }__CLR4_5_29ga9galvickrd5.R.inc(12286);return null;
        }finally{__CLR4_5_29ga9galvickrd5.R.flushNeeded();}}

        protected OWLAxiom update(OWLAxiom transform, OWLAxiom axiom) {try{__CLR4_5_29ga9galvickrd5.R.inc(12287);
            __CLR4_5_29ga9galvickrd5.R.inc(12288);if ((((!axiom.equals(transform))&&(__CLR4_5_29ga9galvickrd5.R.iget(12289)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12290)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12291);changes.add(new RemoveAxiomData(axiom));
                __CLR4_5_29ga9galvickrd5.R.inc(12292);changes.add(new AddAxiomData(transform));
                __CLR4_5_29ga9galvickrd5.R.inc(12293);return transform;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12294);return null;
        }finally{__CLR4_5_29ga9galvickrd5.R.flushNeeded();}}

        /**
         * Check and transform an object.
         * 
         * @param o
         *        object to check
         * @return the transformed object, or null if the axiom was not
         *         transformed
         */
        @SuppressWarnings({ "unchecked" })
        @Nullable
        protected <Q> Q check(Q o) {try{__CLR4_5_29ga9galvickrd5.R.inc(12295);
            __CLR4_5_29ga9galvickrd5.R.inc(12296);if ((((witness.isInstance(o))&&(__CLR4_5_29ga9galvickrd5.R.iget(12297)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12298)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12299);Q transform = (Q) transformer.apply(witness.cast(o));
                __CLR4_5_29ga9galvickrd5.R.inc(12300);if ((((transform != o)&&(__CLR4_5_29ga9galvickrd5.R.iget(12301)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12302)==0&false))) {{
                    __CLR4_5_29ga9galvickrd5.R.inc(12303);return transform;
                }
            }}
            }__CLR4_5_29ga9galvickrd5.R.inc(12304);return null;
        }finally{__CLR4_5_29ga9galvickrd5.R.flushNeeded();}}

        @SuppressWarnings("unchecked")
        protected <Q extends OWLObject> Q t(Q t) {try{__CLR4_5_29ga9galvickrd5.R.inc(12305);
            __CLR4_5_29ga9galvickrd5.R.inc(12306);return (Q) t.accept(this);
        }finally{__CLR4_5_29ga9galvickrd5.R.flushNeeded();}}

        @SuppressWarnings("unchecked")
        protected OWLFacet t(OWLFacet t) {try{__CLR4_5_29ga9galvickrd5.R.inc(12307);
            __CLR4_5_29ga9galvickrd5.R.inc(12308);return (OWLFacet) transformer.apply((T) t);
        }finally{__CLR4_5_29ga9galvickrd5.R.flushNeeded();}}

        protected <Q extends OWLObject> Set<Q> t(Collection<Q> c) {try{__CLR4_5_29ga9galvickrd5.R.inc(12309);
            __CLR4_5_29ga9galvickrd5.R.inc(12310);Set<Q> list = new HashSet<>();
            __CLR4_5_29ga9galvickrd5.R.inc(12311);for (Q t : c) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12312);list.add(t(t));
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12313);return list;
        }finally{__CLR4_5_29ga9galvickrd5.R.flushNeeded();}}

        protected <Q extends OWLObject> List<Q> t(List<Q> c) {try{__CLR4_5_29ga9galvickrd5.R.inc(12314);
            __CLR4_5_29ga9galvickrd5.R.inc(12315);List<Q> list = new ArrayList<>();
            __CLR4_5_29ga9galvickrd5.R.inc(12316);for (Q t : c) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12317);list.add(t(t));
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12318);return list;
        }finally{__CLR4_5_29ga9galvickrd5.R.flushNeeded();}}

        @Override
        public Object visit(OWLDeclarationAxiom axiom) {try{__CLR4_5_29ga9galvickrd5.R.inc(12319);
            __CLR4_5_29ga9galvickrd5.R.inc(12320);OWLAxiom transform = checkAxiom(axiom);
            __CLR4_5_29ga9galvickrd5.R.inc(12321);if ((((transform != null)&&(__CLR4_5_29ga9galvickrd5.R.iget(12322)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12323)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12324);return transform;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12325);if ((((!predicate.apply(axiom))&&(__CLR4_5_29ga9galvickrd5.R.iget(12326)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12327)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12328);return axiom;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12329);return update(df.getOWLDeclarationAxiom(t(axiom.getEntity()), t(axiom.getAnnotations())), axiom);
        }finally{__CLR4_5_29ga9galvickrd5.R.flushNeeded();}}

        @Override
        public Object visit(OWLDatatypeDefinitionAxiom axiom) {try{__CLR4_5_29ga9galvickrd5.R.inc(12330);
            __CLR4_5_29ga9galvickrd5.R.inc(12331);OWLAxiom transform = checkAxiom(axiom);
            __CLR4_5_29ga9galvickrd5.R.inc(12332);if ((((transform != null)&&(__CLR4_5_29ga9galvickrd5.R.iget(12333)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12334)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12335);return transform;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12336);if ((((!predicate.apply(axiom))&&(__CLR4_5_29ga9galvickrd5.R.iget(12337)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12338)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12339);return axiom;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12340);return update(df.getOWLDatatypeDefinitionAxiom(t(axiom.getDatatype()), t(axiom.getDataRange()), t(axiom
                .getAnnotations())), axiom);
        }finally{__CLR4_5_29ga9galvickrd5.R.flushNeeded();}}

        @Override
        public Object visit(OWLAnnotationAssertionAxiom axiom) {try{__CLR4_5_29ga9galvickrd5.R.inc(12341);
            __CLR4_5_29ga9galvickrd5.R.inc(12342);OWLAxiom transform = checkAxiom(axiom);
            __CLR4_5_29ga9galvickrd5.R.inc(12343);if ((((transform != null)&&(__CLR4_5_29ga9galvickrd5.R.iget(12344)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12345)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12346);return transform;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12347);if ((((!predicate.apply(axiom))&&(__CLR4_5_29ga9galvickrd5.R.iget(12348)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12349)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12350);return axiom;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12351);return update(df.getOWLAnnotationAssertionAxiom(t(axiom.getSubject()), t(axiom.getAnnotation()), t(axiom
                .getAnnotations())), axiom);
        }finally{__CLR4_5_29ga9galvickrd5.R.flushNeeded();}}

        @Override
        public Object visit(OWLSubAnnotationPropertyOfAxiom axiom) {try{__CLR4_5_29ga9galvickrd5.R.inc(12352);
            __CLR4_5_29ga9galvickrd5.R.inc(12353);OWLAxiom transform = checkAxiom(axiom);
            __CLR4_5_29ga9galvickrd5.R.inc(12354);if ((((transform != null)&&(__CLR4_5_29ga9galvickrd5.R.iget(12355)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12356)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12357);return transform;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12358);if ((((!predicate.apply(axiom))&&(__CLR4_5_29ga9galvickrd5.R.iget(12359)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12360)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12361);return axiom;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12362);return update(df.getOWLSubAnnotationPropertyOfAxiom(t(axiom.getSubProperty()), t(axiom.getSuperProperty()),
                t(axiom.getAnnotations())), axiom);
        }finally{__CLR4_5_29ga9galvickrd5.R.flushNeeded();}}

        @Override
        public Object visit(OWLAnnotationPropertyDomainAxiom axiom) {try{__CLR4_5_29ga9galvickrd5.R.inc(12363);
            __CLR4_5_29ga9galvickrd5.R.inc(12364);OWLAxiom transform = checkAxiom(axiom);
            __CLR4_5_29ga9galvickrd5.R.inc(12365);if ((((transform != null)&&(__CLR4_5_29ga9galvickrd5.R.iget(12366)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12367)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12368);return transform;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12369);if ((((!predicate.apply(axiom))&&(__CLR4_5_29ga9galvickrd5.R.iget(12370)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12371)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12372);return axiom;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12373);return update(df.getOWLAnnotationPropertyDomainAxiom(t(axiom.getProperty()), t(axiom.getDomain()), t(axiom
                .getAnnotations())), axiom);
        }finally{__CLR4_5_29ga9galvickrd5.R.flushNeeded();}}

        @Override
        public Object visit(OWLAnnotationPropertyRangeAxiom axiom) {try{__CLR4_5_29ga9galvickrd5.R.inc(12374);
            __CLR4_5_29ga9galvickrd5.R.inc(12375);OWLAxiom transform = checkAxiom(axiom);
            __CLR4_5_29ga9galvickrd5.R.inc(12376);if ((((transform != null)&&(__CLR4_5_29ga9galvickrd5.R.iget(12377)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12378)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12379);return transform;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12380);if ((((!predicate.apply(axiom))&&(__CLR4_5_29ga9galvickrd5.R.iget(12381)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12382)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12383);return axiom;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12384);return update(df.getOWLAnnotationPropertyRangeAxiom(t(axiom.getProperty()), t(axiom.getRange()), t(axiom
                .getAnnotations())), axiom);
        }finally{__CLR4_5_29ga9galvickrd5.R.flushNeeded();}}

        @Override
        public Object visit(OWLSubClassOfAxiom axiom) {try{__CLR4_5_29ga9galvickrd5.R.inc(12385);
            __CLR4_5_29ga9galvickrd5.R.inc(12386);OWLAxiom transform = checkAxiom(axiom);
            __CLR4_5_29ga9galvickrd5.R.inc(12387);if ((((transform != null)&&(__CLR4_5_29ga9galvickrd5.R.iget(12388)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12389)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12390);return transform;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12391);if ((((!predicate.apply(axiom))&&(__CLR4_5_29ga9galvickrd5.R.iget(12392)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12393)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12394);return axiom;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12395);return update(df.getOWLSubClassOfAxiom(t(axiom.getSubClass()), t(axiom.getSuperClass()), t(axiom
                .getAnnotations())), axiom);
        }finally{__CLR4_5_29ga9galvickrd5.R.flushNeeded();}}

        @Override
        public Object visit(OWLNegativeObjectPropertyAssertionAxiom axiom) {try{__CLR4_5_29ga9galvickrd5.R.inc(12396);
            __CLR4_5_29ga9galvickrd5.R.inc(12397);OWLAxiom transform = checkAxiom(axiom);
            __CLR4_5_29ga9galvickrd5.R.inc(12398);if ((((transform != null)&&(__CLR4_5_29ga9galvickrd5.R.iget(12399)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12400)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12401);return transform;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12402);if ((((!predicate.apply(axiom))&&(__CLR4_5_29ga9galvickrd5.R.iget(12403)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12404)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12405);return axiom;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12406);return update(df.getOWLNegativeObjectPropertyAssertionAxiom(t(axiom.getProperty()), t(axiom.getSubject()),
                t(axiom.getObject()), t(axiom.getAnnotations())), axiom);
        }finally{__CLR4_5_29ga9galvickrd5.R.flushNeeded();}}

        @Override
        public Object visit(OWLAsymmetricObjectPropertyAxiom axiom) {try{__CLR4_5_29ga9galvickrd5.R.inc(12407);
            __CLR4_5_29ga9galvickrd5.R.inc(12408);OWLAxiom transform = checkAxiom(axiom);
            __CLR4_5_29ga9galvickrd5.R.inc(12409);if ((((transform != null)&&(__CLR4_5_29ga9galvickrd5.R.iget(12410)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12411)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12412);return transform;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12413);if ((((!predicate.apply(axiom))&&(__CLR4_5_29ga9galvickrd5.R.iget(12414)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12415)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12416);return axiom;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12417);return update(df.getOWLAsymmetricObjectPropertyAxiom(t(axiom.getProperty()), t(axiom.getAnnotations())),
                axiom);
        }finally{__CLR4_5_29ga9galvickrd5.R.flushNeeded();}}

        @Override
        public Object visit(OWLReflexiveObjectPropertyAxiom axiom) {try{__CLR4_5_29ga9galvickrd5.R.inc(12418);
            __CLR4_5_29ga9galvickrd5.R.inc(12419);OWLAxiom transform = checkAxiom(axiom);
            __CLR4_5_29ga9galvickrd5.R.inc(12420);if ((((transform != null)&&(__CLR4_5_29ga9galvickrd5.R.iget(12421)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12422)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12423);return transform;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12424);if ((((!predicate.apply(axiom))&&(__CLR4_5_29ga9galvickrd5.R.iget(12425)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12426)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12427);return axiom;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12428);return update(df.getOWLReflexiveObjectPropertyAxiom(t(axiom.getProperty()), t(axiom.getAnnotations())),
                axiom);
        }finally{__CLR4_5_29ga9galvickrd5.R.flushNeeded();}}

        @Override
        public Object visit(OWLDisjointClassesAxiom axiom) {try{__CLR4_5_29ga9galvickrd5.R.inc(12429);
            __CLR4_5_29ga9galvickrd5.R.inc(12430);OWLAxiom transform = checkAxiom(axiom);
            __CLR4_5_29ga9galvickrd5.R.inc(12431);if ((((transform != null)&&(__CLR4_5_29ga9galvickrd5.R.iget(12432)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12433)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12434);return transform;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12435);if ((((!predicate.apply(axiom))&&(__CLR4_5_29ga9galvickrd5.R.iget(12436)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12437)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12438);return axiom;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12439);return update(df.getOWLDisjointClassesAxiom(t(axiom.getClassExpressions()), t(axiom.getAnnotations())),
                axiom);
        }finally{__CLR4_5_29ga9galvickrd5.R.flushNeeded();}}

        @Override
        public Object visit(OWLDataPropertyDomainAxiom axiom) {try{__CLR4_5_29ga9galvickrd5.R.inc(12440);
            __CLR4_5_29ga9galvickrd5.R.inc(12441);OWLAxiom transform = checkAxiom(axiom);
            __CLR4_5_29ga9galvickrd5.R.inc(12442);if ((((transform != null)&&(__CLR4_5_29ga9galvickrd5.R.iget(12443)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12444)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12445);return transform;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12446);if ((((!predicate.apply(axiom))&&(__CLR4_5_29ga9galvickrd5.R.iget(12447)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12448)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12449);return axiom;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12450);return update(df.getOWLDataPropertyDomainAxiom(t(axiom.getProperty()), t(axiom.getDomain()), t(axiom
                .getAnnotations())), axiom);
        }finally{__CLR4_5_29ga9galvickrd5.R.flushNeeded();}}

        @Override
        public Object visit(OWLObjectPropertyDomainAxiom axiom) {try{__CLR4_5_29ga9galvickrd5.R.inc(12451);
            __CLR4_5_29ga9galvickrd5.R.inc(12452);OWLAxiom transform = checkAxiom(axiom);
            __CLR4_5_29ga9galvickrd5.R.inc(12453);if ((((transform != null)&&(__CLR4_5_29ga9galvickrd5.R.iget(12454)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12455)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12456);return transform;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12457);if ((((!predicate.apply(axiom))&&(__CLR4_5_29ga9galvickrd5.R.iget(12458)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12459)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12460);return axiom;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12461);return update(df.getOWLObjectPropertyDomainAxiom(t(axiom.getProperty()), t(axiom.getDomain()), t(axiom
                .getAnnotations())), axiom);
        }finally{__CLR4_5_29ga9galvickrd5.R.flushNeeded();}}

        @Override
        public Object visit(OWLEquivalentObjectPropertiesAxiom axiom) {try{__CLR4_5_29ga9galvickrd5.R.inc(12462);
            __CLR4_5_29ga9galvickrd5.R.inc(12463);OWLAxiom transform = checkAxiom(axiom);
            __CLR4_5_29ga9galvickrd5.R.inc(12464);if ((((transform != null)&&(__CLR4_5_29ga9galvickrd5.R.iget(12465)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12466)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12467);return transform;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12468);if ((((!predicate.apply(axiom))&&(__CLR4_5_29ga9galvickrd5.R.iget(12469)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12470)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12471);return axiom;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12472);return update(df.getOWLEquivalentObjectPropertiesAxiom(t(axiom.getProperties()), t(axiom.getAnnotations())),
                axiom);
        }finally{__CLR4_5_29ga9galvickrd5.R.flushNeeded();}}

        @Override
        public Object visit(OWLNegativeDataPropertyAssertionAxiom axiom) {try{__CLR4_5_29ga9galvickrd5.R.inc(12473);
            __CLR4_5_29ga9galvickrd5.R.inc(12474);OWLAxiom transform = checkAxiom(axiom);
            __CLR4_5_29ga9galvickrd5.R.inc(12475);if ((((transform != null)&&(__CLR4_5_29ga9galvickrd5.R.iget(12476)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12477)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12478);return transform;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12479);if ((((!predicate.apply(axiom))&&(__CLR4_5_29ga9galvickrd5.R.iget(12480)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12481)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12482);return axiom;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12483);return update(df.getOWLNegativeDataPropertyAssertionAxiom(t(axiom.getProperty()), t(axiom.getSubject()), t(
                axiom.getObject()), t(axiom.getAnnotations())), axiom);
        }finally{__CLR4_5_29ga9galvickrd5.R.flushNeeded();}}

        @Override
        public Object visit(OWLDifferentIndividualsAxiom axiom) {try{__CLR4_5_29ga9galvickrd5.R.inc(12484);
            __CLR4_5_29ga9galvickrd5.R.inc(12485);OWLAxiom transform = checkAxiom(axiom);
            __CLR4_5_29ga9galvickrd5.R.inc(12486);if ((((transform != null)&&(__CLR4_5_29ga9galvickrd5.R.iget(12487)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12488)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12489);return transform;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12490);if ((((!predicate.apply(axiom))&&(__CLR4_5_29ga9galvickrd5.R.iget(12491)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12492)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12493);return axiom;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12494);return update(df.getOWLDifferentIndividualsAxiom(t(axiom.getIndividuals()), t(axiom.getAnnotations())),
                axiom);
        }finally{__CLR4_5_29ga9galvickrd5.R.flushNeeded();}}

        @Override
        public Object visit(OWLDisjointDataPropertiesAxiom axiom) {try{__CLR4_5_29ga9galvickrd5.R.inc(12495);
            __CLR4_5_29ga9galvickrd5.R.inc(12496);OWLAxiom transform = checkAxiom(axiom);
            __CLR4_5_29ga9galvickrd5.R.inc(12497);if ((((transform != null)&&(__CLR4_5_29ga9galvickrd5.R.iget(12498)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12499)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12500);return transform;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12501);if ((((!predicate.apply(axiom))&&(__CLR4_5_29ga9galvickrd5.R.iget(12502)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12503)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12504);return axiom;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12505);return update(df.getOWLDisjointDataPropertiesAxiom(t(axiom.getProperties()), t(axiom.getAnnotations())),
                axiom);
        }finally{__CLR4_5_29ga9galvickrd5.R.flushNeeded();}}

        @Override
        public Object visit(OWLDisjointObjectPropertiesAxiom axiom) {try{__CLR4_5_29ga9galvickrd5.R.inc(12506);
            __CLR4_5_29ga9galvickrd5.R.inc(12507);OWLAxiom transform = checkAxiom(axiom);
            __CLR4_5_29ga9galvickrd5.R.inc(12508);if ((((transform != null)&&(__CLR4_5_29ga9galvickrd5.R.iget(12509)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12510)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12511);return transform;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12512);if ((((!predicate.apply(axiom))&&(__CLR4_5_29ga9galvickrd5.R.iget(12513)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12514)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12515);return axiom;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12516);return update(df.getOWLDisjointObjectPropertiesAxiom(t(axiom.getProperties()), t(axiom.getAnnotations())),
                axiom);
        }finally{__CLR4_5_29ga9galvickrd5.R.flushNeeded();}}

        @Override
        public Object visit(OWLObjectPropertyRangeAxiom axiom) {try{__CLR4_5_29ga9galvickrd5.R.inc(12517);
            __CLR4_5_29ga9galvickrd5.R.inc(12518);OWLAxiom transform = checkAxiom(axiom);
            __CLR4_5_29ga9galvickrd5.R.inc(12519);if ((((transform != null)&&(__CLR4_5_29ga9galvickrd5.R.iget(12520)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12521)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12522);return transform;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12523);if ((((!predicate.apply(axiom))&&(__CLR4_5_29ga9galvickrd5.R.iget(12524)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12525)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12526);return axiom;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12527);return update(df.getOWLObjectPropertyRangeAxiom(t(axiom.getProperty()), t(axiom.getRange()), t(axiom
                .getAnnotations())), axiom);
        }finally{__CLR4_5_29ga9galvickrd5.R.flushNeeded();}}

        @Override
        public Object visit(OWLObjectPropertyAssertionAxiom axiom) {try{__CLR4_5_29ga9galvickrd5.R.inc(12528);
            __CLR4_5_29ga9galvickrd5.R.inc(12529);OWLAxiom transform = checkAxiom(axiom);
            __CLR4_5_29ga9galvickrd5.R.inc(12530);if ((((transform != null)&&(__CLR4_5_29ga9galvickrd5.R.iget(12531)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12532)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12533);return transform;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12534);if ((((!predicate.apply(axiom))&&(__CLR4_5_29ga9galvickrd5.R.iget(12535)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12536)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12537);return axiom;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12538);return update(df.getOWLObjectPropertyAssertionAxiom(t(axiom.getProperty()), t(axiom.getSubject()), t(axiom
                .getObject()), t(axiom.getAnnotations())), axiom);
        }finally{__CLR4_5_29ga9galvickrd5.R.flushNeeded();}}

        @Override
        public Object visit(OWLFunctionalObjectPropertyAxiom axiom) {try{__CLR4_5_29ga9galvickrd5.R.inc(12539);
            __CLR4_5_29ga9galvickrd5.R.inc(12540);OWLAxiom transform = checkAxiom(axiom);
            __CLR4_5_29ga9galvickrd5.R.inc(12541);if ((((transform != null)&&(__CLR4_5_29ga9galvickrd5.R.iget(12542)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12543)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12544);return transform;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12545);if ((((!predicate.apply(axiom))&&(__CLR4_5_29ga9galvickrd5.R.iget(12546)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12547)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12548);return axiom;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12549);return update(df.getOWLFunctionalObjectPropertyAxiom(t(axiom.getProperty()), t(axiom.getAnnotations())),
                axiom);
        }finally{__CLR4_5_29ga9galvickrd5.R.flushNeeded();}}

        @Override
        public Object visit(OWLSubObjectPropertyOfAxiom axiom) {try{__CLR4_5_29ga9galvickrd5.R.inc(12550);
            __CLR4_5_29ga9galvickrd5.R.inc(12551);OWLAxiom transform = checkAxiom(axiom);
            __CLR4_5_29ga9galvickrd5.R.inc(12552);if ((((transform != null)&&(__CLR4_5_29ga9galvickrd5.R.iget(12553)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12554)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12555);return transform;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12556);if ((((!predicate.apply(axiom))&&(__CLR4_5_29ga9galvickrd5.R.iget(12557)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12558)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12559);return axiom;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12560);return update(df.getOWLSubObjectPropertyOfAxiom(t(axiom.getSubProperty()), t(axiom.getSuperProperty()), t(
                axiom.getAnnotations())), axiom);
        }finally{__CLR4_5_29ga9galvickrd5.R.flushNeeded();}}

        @Override
        public Object visit(OWLDisjointUnionAxiom axiom) {try{__CLR4_5_29ga9galvickrd5.R.inc(12561);
            __CLR4_5_29ga9galvickrd5.R.inc(12562);OWLAxiom transform = checkAxiom(axiom);
            __CLR4_5_29ga9galvickrd5.R.inc(12563);if ((((transform != null)&&(__CLR4_5_29ga9galvickrd5.R.iget(12564)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12565)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12566);return transform;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12567);if ((((!predicate.apply(axiom))&&(__CLR4_5_29ga9galvickrd5.R.iget(12568)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12569)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12570);return axiom;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12571);return update(df.getOWLDisjointUnionAxiom(t(axiom.getOWLClass()), t(axiom.getClassExpressions()), t(axiom
                .getAnnotations())), axiom);
        }finally{__CLR4_5_29ga9galvickrd5.R.flushNeeded();}}

        @Override
        public Object visit(OWLSymmetricObjectPropertyAxiom axiom) {try{__CLR4_5_29ga9galvickrd5.R.inc(12572);
            __CLR4_5_29ga9galvickrd5.R.inc(12573);OWLAxiom transform = checkAxiom(axiom);
            __CLR4_5_29ga9galvickrd5.R.inc(12574);if ((((transform != null)&&(__CLR4_5_29ga9galvickrd5.R.iget(12575)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12576)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12577);return transform;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12578);if ((((!predicate.apply(axiom))&&(__CLR4_5_29ga9galvickrd5.R.iget(12579)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12580)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12581);return axiom;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12582);return update(df.getOWLSymmetricObjectPropertyAxiom(t(axiom.getProperty()), t(axiom.getAnnotations())),
                axiom);
        }finally{__CLR4_5_29ga9galvickrd5.R.flushNeeded();}}

        @Override
        public Object visit(OWLDataPropertyRangeAxiom axiom) {try{__CLR4_5_29ga9galvickrd5.R.inc(12583);
            __CLR4_5_29ga9galvickrd5.R.inc(12584);OWLAxiom transform = checkAxiom(axiom);
            __CLR4_5_29ga9galvickrd5.R.inc(12585);if ((((transform != null)&&(__CLR4_5_29ga9galvickrd5.R.iget(12586)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12587)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12588);return transform;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12589);if ((((!predicate.apply(axiom))&&(__CLR4_5_29ga9galvickrd5.R.iget(12590)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12591)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12592);return axiom;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12593);return update(df.getOWLDataPropertyRangeAxiom(t(axiom.getProperty()), t(axiom.getRange()), t(axiom
                .getAnnotations())), axiom);
        }finally{__CLR4_5_29ga9galvickrd5.R.flushNeeded();}}

        @Override
        public Object visit(OWLFunctionalDataPropertyAxiom axiom) {try{__CLR4_5_29ga9galvickrd5.R.inc(12594);
            __CLR4_5_29ga9galvickrd5.R.inc(12595);OWLAxiom transform = checkAxiom(axiom);
            __CLR4_5_29ga9galvickrd5.R.inc(12596);if ((((transform != null)&&(__CLR4_5_29ga9galvickrd5.R.iget(12597)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12598)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12599);return transform;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12600);if ((((!predicate.apply(axiom))&&(__CLR4_5_29ga9galvickrd5.R.iget(12601)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12602)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12603);return axiom;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12604);return update(df.getOWLFunctionalDataPropertyAxiom(t(axiom.getProperty()), t(axiom.getAnnotations())),
                axiom);
        }finally{__CLR4_5_29ga9galvickrd5.R.flushNeeded();}}

        @Override
        public Object visit(OWLEquivalentDataPropertiesAxiom axiom) {try{__CLR4_5_29ga9galvickrd5.R.inc(12605);
            __CLR4_5_29ga9galvickrd5.R.inc(12606);OWLAxiom transform = checkAxiom(axiom);
            __CLR4_5_29ga9galvickrd5.R.inc(12607);if ((((transform != null)&&(__CLR4_5_29ga9galvickrd5.R.iget(12608)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12609)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12610);return transform;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12611);if ((((!predicate.apply(axiom))&&(__CLR4_5_29ga9galvickrd5.R.iget(12612)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12613)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12614);return axiom;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12615);return update(df.getOWLEquivalentDataPropertiesAxiom(t(axiom.getProperties()), t(axiom.getAnnotations())),
                axiom);
        }finally{__CLR4_5_29ga9galvickrd5.R.flushNeeded();}}

        @Override
        public Object visit(OWLClassAssertionAxiom axiom) {try{__CLR4_5_29ga9galvickrd5.R.inc(12616);
            __CLR4_5_29ga9galvickrd5.R.inc(12617);OWLAxiom transform = checkAxiom(axiom);
            __CLR4_5_29ga9galvickrd5.R.inc(12618);if ((((transform != null)&&(__CLR4_5_29ga9galvickrd5.R.iget(12619)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12620)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12621);return transform;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12622);if ((((!predicate.apply(axiom))&&(__CLR4_5_29ga9galvickrd5.R.iget(12623)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12624)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12625);return axiom;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12626);return update(df.getOWLClassAssertionAxiom(t(axiom.getClassExpression()), t(axiom.getIndividual()), t(axiom
                .getAnnotations())), axiom);
        }finally{__CLR4_5_29ga9galvickrd5.R.flushNeeded();}}

        @Override
        public Object visit(OWLEquivalentClassesAxiom axiom) {try{__CLR4_5_29ga9galvickrd5.R.inc(12627);
            __CLR4_5_29ga9galvickrd5.R.inc(12628);OWLAxiom transform = checkAxiom(axiom);
            __CLR4_5_29ga9galvickrd5.R.inc(12629);if ((((transform != null)&&(__CLR4_5_29ga9galvickrd5.R.iget(12630)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12631)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12632);return transform;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12633);if ((((!predicate.apply(axiom))&&(__CLR4_5_29ga9galvickrd5.R.iget(12634)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12635)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12636);return axiom;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12637);return update(df.getOWLEquivalentClassesAxiom(t(axiom.getClassExpressions()), t(axiom.getAnnotations())),
                axiom);
        }finally{__CLR4_5_29ga9galvickrd5.R.flushNeeded();}}

        @Override
        public Object visit(OWLDataPropertyAssertionAxiom axiom) {try{__CLR4_5_29ga9galvickrd5.R.inc(12638);
            __CLR4_5_29ga9galvickrd5.R.inc(12639);OWLAxiom transform = checkAxiom(axiom);
            __CLR4_5_29ga9galvickrd5.R.inc(12640);if ((((transform != null)&&(__CLR4_5_29ga9galvickrd5.R.iget(12641)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12642)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12643);return transform;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12644);if ((((!predicate.apply(axiom))&&(__CLR4_5_29ga9galvickrd5.R.iget(12645)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12646)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12647);return axiom;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12648);return update(df.getOWLDataPropertyAssertionAxiom(t(axiom.getProperty()), t(axiom.getSubject()), t(axiom
                .getObject()), t(axiom.getAnnotations())), axiom);
        }finally{__CLR4_5_29ga9galvickrd5.R.flushNeeded();}}

        @Override
        public Object visit(OWLTransitiveObjectPropertyAxiom axiom) {try{__CLR4_5_29ga9galvickrd5.R.inc(12649);
            __CLR4_5_29ga9galvickrd5.R.inc(12650);OWLAxiom transform = checkAxiom(axiom);
            __CLR4_5_29ga9galvickrd5.R.inc(12651);if ((((transform != null)&&(__CLR4_5_29ga9galvickrd5.R.iget(12652)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12653)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12654);return transform;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12655);if ((((!predicate.apply(axiom))&&(__CLR4_5_29ga9galvickrd5.R.iget(12656)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12657)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12658);return axiom;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12659);return update(df.getOWLTransitiveObjectPropertyAxiom(t(axiom.getProperty()), t(axiom.getAnnotations())),
                axiom);
        }finally{__CLR4_5_29ga9galvickrd5.R.flushNeeded();}}

        @Override
        public Object visit(OWLIrreflexiveObjectPropertyAxiom axiom) {try{__CLR4_5_29ga9galvickrd5.R.inc(12660);
            __CLR4_5_29ga9galvickrd5.R.inc(12661);OWLAxiom transform = checkAxiom(axiom);
            __CLR4_5_29ga9galvickrd5.R.inc(12662);if ((((transform != null)&&(__CLR4_5_29ga9galvickrd5.R.iget(12663)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12664)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12665);return transform;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12666);if ((((!predicate.apply(axiom))&&(__CLR4_5_29ga9galvickrd5.R.iget(12667)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12668)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12669);return axiom;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12670);return update(df.getOWLIrreflexiveObjectPropertyAxiom(t(axiom.getProperty()), t(axiom.getAnnotations())),
                axiom);
        }finally{__CLR4_5_29ga9galvickrd5.R.flushNeeded();}}

        @Override
        public Object visit(OWLSubDataPropertyOfAxiom axiom) {try{__CLR4_5_29ga9galvickrd5.R.inc(12671);
            __CLR4_5_29ga9galvickrd5.R.inc(12672);OWLAxiom transform = checkAxiom(axiom);
            __CLR4_5_29ga9galvickrd5.R.inc(12673);if ((((transform != null)&&(__CLR4_5_29ga9galvickrd5.R.iget(12674)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12675)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12676);return transform;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12677);if ((((!predicate.apply(axiom))&&(__CLR4_5_29ga9galvickrd5.R.iget(12678)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12679)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12680);return axiom;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12681);return update(df.getOWLSubDataPropertyOfAxiom(t(axiom.getSubProperty()), t(axiom.getSuperProperty()), t(
                axiom.getAnnotations())), axiom);
        }finally{__CLR4_5_29ga9galvickrd5.R.flushNeeded();}}

        @Override
        public Object visit(OWLInverseFunctionalObjectPropertyAxiom axiom) {try{__CLR4_5_29ga9galvickrd5.R.inc(12682);
            __CLR4_5_29ga9galvickrd5.R.inc(12683);OWLAxiom transform = checkAxiom(axiom);
            __CLR4_5_29ga9galvickrd5.R.inc(12684);if ((((transform != null)&&(__CLR4_5_29ga9galvickrd5.R.iget(12685)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12686)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12687);return transform;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12688);if ((((!predicate.apply(axiom))&&(__CLR4_5_29ga9galvickrd5.R.iget(12689)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12690)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12691);return axiom;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12692);return update(df.getOWLInverseFunctionalObjectPropertyAxiom(t(axiom.getProperty()), t(axiom
                .getAnnotations())), axiom);
        }finally{__CLR4_5_29ga9galvickrd5.R.flushNeeded();}}

        @Override
        public Object visit(OWLSameIndividualAxiom axiom) {try{__CLR4_5_29ga9galvickrd5.R.inc(12693);
            __CLR4_5_29ga9galvickrd5.R.inc(12694);OWLAxiom transform = checkAxiom(axiom);
            __CLR4_5_29ga9galvickrd5.R.inc(12695);if ((((transform != null)&&(__CLR4_5_29ga9galvickrd5.R.iget(12696)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12697)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12698);return transform;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12699);if ((((!predicate.apply(axiom))&&(__CLR4_5_29ga9galvickrd5.R.iget(12700)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12701)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12702);return axiom;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12703);return update(df.getOWLSameIndividualAxiom(t(axiom.getIndividuals()), t(axiom.getAnnotations())), axiom);
        }finally{__CLR4_5_29ga9galvickrd5.R.flushNeeded();}}

        @Override
        public Object visit(OWLSubPropertyChainOfAxiom axiom) {try{__CLR4_5_29ga9galvickrd5.R.inc(12704);
            __CLR4_5_29ga9galvickrd5.R.inc(12705);OWLAxiom transform = checkAxiom(axiom);
            __CLR4_5_29ga9galvickrd5.R.inc(12706);if ((((transform != null)&&(__CLR4_5_29ga9galvickrd5.R.iget(12707)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12708)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12709);return transform;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12710);if ((((!predicate.apply(axiom))&&(__CLR4_5_29ga9galvickrd5.R.iget(12711)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12712)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12713);return axiom;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12714);return update(df.getOWLSubPropertyChainOfAxiom(t(axiom.getPropertyChain()), t(axiom.getSuperProperty()), t(
                axiom.getAnnotations())), axiom);
        }finally{__CLR4_5_29ga9galvickrd5.R.flushNeeded();}}

        @Override
        public Object visit(OWLInverseObjectPropertiesAxiom axiom) {try{__CLR4_5_29ga9galvickrd5.R.inc(12715);
            __CLR4_5_29ga9galvickrd5.R.inc(12716);OWLAxiom transform = checkAxiom(axiom);
            __CLR4_5_29ga9galvickrd5.R.inc(12717);if ((((transform != null)&&(__CLR4_5_29ga9galvickrd5.R.iget(12718)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12719)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12720);return transform;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12721);if ((((!predicate.apply(axiom))&&(__CLR4_5_29ga9galvickrd5.R.iget(12722)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12723)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12724);return axiom;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12725);return update(df.getOWLInverseObjectPropertiesAxiom(t(axiom.getFirstProperty()), t(axiom
                .getSecondProperty()), t(axiom.getAnnotations())), axiom);
        }finally{__CLR4_5_29ga9galvickrd5.R.flushNeeded();}}

        @Override
        public Object visit(OWLHasKeyAxiom axiom) {try{__CLR4_5_29ga9galvickrd5.R.inc(12726);
            __CLR4_5_29ga9galvickrd5.R.inc(12727);OWLAxiom transform = checkAxiom(axiom);
            __CLR4_5_29ga9galvickrd5.R.inc(12728);if ((((transform != null)&&(__CLR4_5_29ga9galvickrd5.R.iget(12729)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12730)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12731);return transform;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12732);if ((((!predicate.apply(axiom))&&(__CLR4_5_29ga9galvickrd5.R.iget(12733)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12734)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12735);return axiom;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12736);return update(df.getOWLHasKeyAxiom(t(axiom.getClassExpression()), t(axiom.getPropertyExpressions()), t(axiom
                .getAnnotations())), axiom);
        }finally{__CLR4_5_29ga9galvickrd5.R.flushNeeded();}}

        @Override
        public Object visit(SWRLRule rule) {try{__CLR4_5_29ga9galvickrd5.R.inc(12737);
            __CLR4_5_29ga9galvickrd5.R.inc(12738);OWLAxiom transform = checkAxiom(rule);
            __CLR4_5_29ga9galvickrd5.R.inc(12739);if ((((transform != null)&&(__CLR4_5_29ga9galvickrd5.R.iget(12740)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12741)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12742);return transform;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12743);if ((((!predicate.apply(rule))&&(__CLR4_5_29ga9galvickrd5.R.iget(12744)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12745)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12746);return rule;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12747);return update(df.getSWRLRule(t(rule.getBody()), t(rule.getHead()), t(rule.getAnnotations())), rule);
        }finally{__CLR4_5_29ga9galvickrd5.R.flushNeeded();}}

        @Override
        public Object visit(OWLClass ce) {try{__CLR4_5_29ga9galvickrd5.R.inc(12748);
            __CLR4_5_29ga9galvickrd5.R.inc(12749);OWLObject transform = check(ce);
            __CLR4_5_29ga9galvickrd5.R.inc(12750);if ((((transform != null)&&(__CLR4_5_29ga9galvickrd5.R.iget(12751)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12752)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12753);return transform;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12754);if ((((!predicate.apply(ce))&&(__CLR4_5_29ga9galvickrd5.R.iget(12755)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12756)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12757);return ce;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12758);return df.getOWLClass(t(ce.getIRI()));
        }finally{__CLR4_5_29ga9galvickrd5.R.flushNeeded();}}

        @Override
        public Object visit(OWLObjectIntersectionOf ce) {try{__CLR4_5_29ga9galvickrd5.R.inc(12759);
            __CLR4_5_29ga9galvickrd5.R.inc(12760);OWLObject transform = check(ce);
            __CLR4_5_29ga9galvickrd5.R.inc(12761);if ((((transform != null)&&(__CLR4_5_29ga9galvickrd5.R.iget(12762)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12763)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12764);return transform;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12765);if ((((!predicate.apply(ce))&&(__CLR4_5_29ga9galvickrd5.R.iget(12766)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12767)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12768);return ce;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12769);return df.getOWLObjectIntersectionOf(t(ce.getOperands()));
        }finally{__CLR4_5_29ga9galvickrd5.R.flushNeeded();}}

        @Override
        public Object visit(OWLObjectUnionOf ce) {try{__CLR4_5_29ga9galvickrd5.R.inc(12770);
            __CLR4_5_29ga9galvickrd5.R.inc(12771);OWLObject transform = check(ce);
            __CLR4_5_29ga9galvickrd5.R.inc(12772);if ((((transform != null)&&(__CLR4_5_29ga9galvickrd5.R.iget(12773)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12774)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12775);return transform;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12776);if ((((!predicate.apply(ce))&&(__CLR4_5_29ga9galvickrd5.R.iget(12777)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12778)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12779);return ce;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12780);return df.getOWLObjectUnionOf(t(ce.getOperands()));
        }finally{__CLR4_5_29ga9galvickrd5.R.flushNeeded();}}

        @Override
        public Object visit(OWLObjectComplementOf ce) {try{__CLR4_5_29ga9galvickrd5.R.inc(12781);
            __CLR4_5_29ga9galvickrd5.R.inc(12782);OWLObject transform = check(ce);
            __CLR4_5_29ga9galvickrd5.R.inc(12783);if ((((transform != null)&&(__CLR4_5_29ga9galvickrd5.R.iget(12784)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12785)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12786);return transform;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12787);if ((((!predicate.apply(ce))&&(__CLR4_5_29ga9galvickrd5.R.iget(12788)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12789)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12790);return ce;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12791);return df.getOWLObjectComplementOf(t(ce.getOperand()));
        }finally{__CLR4_5_29ga9galvickrd5.R.flushNeeded();}}

        @Override
        public Object visit(OWLObjectSomeValuesFrom ce) {try{__CLR4_5_29ga9galvickrd5.R.inc(12792);
            __CLR4_5_29ga9galvickrd5.R.inc(12793);OWLObject transform = check(ce);
            __CLR4_5_29ga9galvickrd5.R.inc(12794);if ((((transform != null)&&(__CLR4_5_29ga9galvickrd5.R.iget(12795)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12796)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12797);return transform;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12798);if ((((!predicate.apply(ce))&&(__CLR4_5_29ga9galvickrd5.R.iget(12799)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12800)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12801);return ce;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12802);return df.getOWLObjectSomeValuesFrom(t(ce.getProperty()), t(ce.getFiller()));
        }finally{__CLR4_5_29ga9galvickrd5.R.flushNeeded();}}

        @Override
        public Object visit(OWLObjectAllValuesFrom ce) {try{__CLR4_5_29ga9galvickrd5.R.inc(12803);
            __CLR4_5_29ga9galvickrd5.R.inc(12804);OWLObject transform = check(ce);
            __CLR4_5_29ga9galvickrd5.R.inc(12805);if ((((transform != null)&&(__CLR4_5_29ga9galvickrd5.R.iget(12806)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12807)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12808);return transform;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12809);if ((((!predicate.apply(ce))&&(__CLR4_5_29ga9galvickrd5.R.iget(12810)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12811)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12812);return ce;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12813);return df.getOWLObjectAllValuesFrom(t(ce.getProperty()), t(ce.getFiller()));
        }finally{__CLR4_5_29ga9galvickrd5.R.flushNeeded();}}

        @Override
        public Object visit(OWLObjectHasValue ce) {try{__CLR4_5_29ga9galvickrd5.R.inc(12814);
            __CLR4_5_29ga9galvickrd5.R.inc(12815);OWLObject transform = check(ce);
            __CLR4_5_29ga9galvickrd5.R.inc(12816);if ((((transform != null)&&(__CLR4_5_29ga9galvickrd5.R.iget(12817)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12818)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12819);return transform;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12820);if ((((!predicate.apply(ce))&&(__CLR4_5_29ga9galvickrd5.R.iget(12821)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12822)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12823);return ce;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12824);return df.getOWLObjectHasValue(t(ce.getProperty()), t(ce.getFiller()));
        }finally{__CLR4_5_29ga9galvickrd5.R.flushNeeded();}}

        @Override
        public Object visit(OWLObjectMinCardinality ce) {try{__CLR4_5_29ga9galvickrd5.R.inc(12825);
            __CLR4_5_29ga9galvickrd5.R.inc(12826);OWLObject transform = check(ce);
            __CLR4_5_29ga9galvickrd5.R.inc(12827);if ((((transform != null)&&(__CLR4_5_29ga9galvickrd5.R.iget(12828)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12829)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12830);return transform;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12831);if ((((!predicate.apply(ce))&&(__CLR4_5_29ga9galvickrd5.R.iget(12832)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12833)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12834);return ce;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12835);return df.getOWLObjectMinCardinality(ce.getCardinality(), t(ce.getProperty()), t(ce.getFiller()));
        }finally{__CLR4_5_29ga9galvickrd5.R.flushNeeded();}}

        @Override
        public Object visit(OWLObjectExactCardinality ce) {try{__CLR4_5_29ga9galvickrd5.R.inc(12836);
            __CLR4_5_29ga9galvickrd5.R.inc(12837);OWLObject transform = check(ce);
            __CLR4_5_29ga9galvickrd5.R.inc(12838);if ((((transform != null)&&(__CLR4_5_29ga9galvickrd5.R.iget(12839)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12840)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12841);return transform;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12842);if ((((!predicate.apply(ce))&&(__CLR4_5_29ga9galvickrd5.R.iget(12843)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12844)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12845);return ce;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12846);return df.getOWLObjectExactCardinality(ce.getCardinality(), t(ce.getProperty()), t(ce.getFiller()));
        }finally{__CLR4_5_29ga9galvickrd5.R.flushNeeded();}}

        @Override
        public Object visit(OWLObjectMaxCardinality ce) {try{__CLR4_5_29ga9galvickrd5.R.inc(12847);
            __CLR4_5_29ga9galvickrd5.R.inc(12848);OWLObject transform = check(ce);
            __CLR4_5_29ga9galvickrd5.R.inc(12849);if ((((transform != null)&&(__CLR4_5_29ga9galvickrd5.R.iget(12850)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12851)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12852);return transform;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12853);if ((((!predicate.apply(ce))&&(__CLR4_5_29ga9galvickrd5.R.iget(12854)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12855)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12856);return ce;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12857);return df.getOWLObjectMaxCardinality(ce.getCardinality(), t(ce.getProperty()), t(ce.getFiller()));
        }finally{__CLR4_5_29ga9galvickrd5.R.flushNeeded();}}

        @Override
        public Object visit(OWLObjectHasSelf ce) {try{__CLR4_5_29ga9galvickrd5.R.inc(12858);
            __CLR4_5_29ga9galvickrd5.R.inc(12859);OWLObject transform = check(ce);
            __CLR4_5_29ga9galvickrd5.R.inc(12860);if ((((transform != null)&&(__CLR4_5_29ga9galvickrd5.R.iget(12861)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12862)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12863);return transform;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12864);if ((((!predicate.apply(ce))&&(__CLR4_5_29ga9galvickrd5.R.iget(12865)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12866)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12867);return ce;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12868);return df.getOWLObjectHasSelf(t(ce.getProperty()));
        }finally{__CLR4_5_29ga9galvickrd5.R.flushNeeded();}}

        @Override
        public Object visit(OWLObjectOneOf ce) {try{__CLR4_5_29ga9galvickrd5.R.inc(12869);
            __CLR4_5_29ga9galvickrd5.R.inc(12870);OWLObject transform = check(ce);
            __CLR4_5_29ga9galvickrd5.R.inc(12871);if ((((transform != null)&&(__CLR4_5_29ga9galvickrd5.R.iget(12872)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12873)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12874);return transform;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12875);if ((((!predicate.apply(ce))&&(__CLR4_5_29ga9galvickrd5.R.iget(12876)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12877)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12878);return ce;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12879);return df.getOWLObjectOneOf(t(ce.getIndividuals()));
        }finally{__CLR4_5_29ga9galvickrd5.R.flushNeeded();}}

        @Override
        public Object visit(OWLDataSomeValuesFrom ce) {try{__CLR4_5_29ga9galvickrd5.R.inc(12880);
            __CLR4_5_29ga9galvickrd5.R.inc(12881);OWLObject transform = check(ce);
            __CLR4_5_29ga9galvickrd5.R.inc(12882);if ((((transform != null)&&(__CLR4_5_29ga9galvickrd5.R.iget(12883)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12884)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12885);return transform;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12886);if ((((!predicate.apply(ce))&&(__CLR4_5_29ga9galvickrd5.R.iget(12887)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12888)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12889);return ce;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12890);return df.getOWLDataSomeValuesFrom(t(ce.getProperty()), t(ce.getFiller()));
        }finally{__CLR4_5_29ga9galvickrd5.R.flushNeeded();}}

        @Override
        public Object visit(OWLDataAllValuesFrom ce) {try{__CLR4_5_29ga9galvickrd5.R.inc(12891);
            __CLR4_5_29ga9galvickrd5.R.inc(12892);OWLObject transform = check(ce);
            __CLR4_5_29ga9galvickrd5.R.inc(12893);if ((((transform != null)&&(__CLR4_5_29ga9galvickrd5.R.iget(12894)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12895)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12896);return transform;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12897);if ((((!predicate.apply(ce))&&(__CLR4_5_29ga9galvickrd5.R.iget(12898)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12899)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12900);return ce;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12901);return df.getOWLDataAllValuesFrom(t(ce.getProperty()), t(ce.getFiller()));
        }finally{__CLR4_5_29ga9galvickrd5.R.flushNeeded();}}

        @Override
        public Object visit(OWLDataHasValue ce) {try{__CLR4_5_29ga9galvickrd5.R.inc(12902);
            __CLR4_5_29ga9galvickrd5.R.inc(12903);OWLObject transform = check(ce);
            __CLR4_5_29ga9galvickrd5.R.inc(12904);if ((((transform != null)&&(__CLR4_5_29ga9galvickrd5.R.iget(12905)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12906)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12907);return transform;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12908);if ((((!predicate.apply(ce))&&(__CLR4_5_29ga9galvickrd5.R.iget(12909)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12910)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12911);return ce;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12912);return df.getOWLDataHasValue(t(ce.getProperty()), t(ce.getFiller()));
        }finally{__CLR4_5_29ga9galvickrd5.R.flushNeeded();}}

        @Override
        public Object visit(OWLDataMinCardinality ce) {try{__CLR4_5_29ga9galvickrd5.R.inc(12913);
            __CLR4_5_29ga9galvickrd5.R.inc(12914);OWLObject transform = check(ce);
            __CLR4_5_29ga9galvickrd5.R.inc(12915);if ((((transform != null)&&(__CLR4_5_29ga9galvickrd5.R.iget(12916)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12917)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12918);return transform;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12919);if ((((!predicate.apply(ce))&&(__CLR4_5_29ga9galvickrd5.R.iget(12920)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12921)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12922);return ce;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12923);return df.getOWLDataMinCardinality(ce.getCardinality(), t(ce.getProperty()), t(ce.getFiller()));
        }finally{__CLR4_5_29ga9galvickrd5.R.flushNeeded();}}

        @Override
        public Object visit(OWLDataExactCardinality ce) {try{__CLR4_5_29ga9galvickrd5.R.inc(12924);
            __CLR4_5_29ga9galvickrd5.R.inc(12925);OWLObject transform = check(ce);
            __CLR4_5_29ga9galvickrd5.R.inc(12926);if ((((transform != null)&&(__CLR4_5_29ga9galvickrd5.R.iget(12927)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12928)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12929);return transform;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12930);if ((((!predicate.apply(ce))&&(__CLR4_5_29ga9galvickrd5.R.iget(12931)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12932)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12933);return ce;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12934);return df.getOWLDataExactCardinality(ce.getCardinality(), t(ce.getProperty()), t(ce.getFiller()));
        }finally{__CLR4_5_29ga9galvickrd5.R.flushNeeded();}}

        @Override
        public Object visit(OWLDataMaxCardinality ce) {try{__CLR4_5_29ga9galvickrd5.R.inc(12935);
            __CLR4_5_29ga9galvickrd5.R.inc(12936);OWLObject transform = check(ce);
            __CLR4_5_29ga9galvickrd5.R.inc(12937);if ((((transform != null)&&(__CLR4_5_29ga9galvickrd5.R.iget(12938)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12939)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12940);return transform;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12941);if ((((!predicate.apply(ce))&&(__CLR4_5_29ga9galvickrd5.R.iget(12942)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12943)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12944);return ce;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12945);return df.getOWLDataMaxCardinality(ce.getCardinality(), t(ce.getProperty()), t(ce.getFiller()));
        }finally{__CLR4_5_29ga9galvickrd5.R.flushNeeded();}}

        @Override
        public Object visit(OWLDatatype node) {try{__CLR4_5_29ga9galvickrd5.R.inc(12946);
            __CLR4_5_29ga9galvickrd5.R.inc(12947);OWLObject transform = check(node);
            __CLR4_5_29ga9galvickrd5.R.inc(12948);if ((((transform != null)&&(__CLR4_5_29ga9galvickrd5.R.iget(12949)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12950)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12951);return transform;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12952);if ((((!predicate.apply(node))&&(__CLR4_5_29ga9galvickrd5.R.iget(12953)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12954)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12955);return node;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12956);return df.getOWLDatatype(t(node.getIRI()));
        }finally{__CLR4_5_29ga9galvickrd5.R.flushNeeded();}}

        @Override
        public Object visit(OWLDataComplementOf node) {try{__CLR4_5_29ga9galvickrd5.R.inc(12957);
            __CLR4_5_29ga9galvickrd5.R.inc(12958);OWLObject transform = check(node);
            __CLR4_5_29ga9galvickrd5.R.inc(12959);if ((((transform != null)&&(__CLR4_5_29ga9galvickrd5.R.iget(12960)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12961)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12962);return transform;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12963);if ((((!predicate.apply(node))&&(__CLR4_5_29ga9galvickrd5.R.iget(12964)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12965)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12966);return node;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12967);return df.getOWLDataComplementOf(t(node.getDataRange()));
        }finally{__CLR4_5_29ga9galvickrd5.R.flushNeeded();}}

        @Override
        public Object visit(OWLDataOneOf node) {try{__CLR4_5_29ga9galvickrd5.R.inc(12968);
            __CLR4_5_29ga9galvickrd5.R.inc(12969);OWLObject transform = check(node);
            __CLR4_5_29ga9galvickrd5.R.inc(12970);if ((((transform != null)&&(__CLR4_5_29ga9galvickrd5.R.iget(12971)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12972)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12973);return transform;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12974);if ((((!predicate.apply(node))&&(__CLR4_5_29ga9galvickrd5.R.iget(12975)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12976)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12977);return node;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12978);return df.getOWLDataOneOf(t(node.getValues()));
        }finally{__CLR4_5_29ga9galvickrd5.R.flushNeeded();}}

        @Override
        public Object visit(OWLDataIntersectionOf node) {try{__CLR4_5_29ga9galvickrd5.R.inc(12979);
            __CLR4_5_29ga9galvickrd5.R.inc(12980);OWLObject transform = check(node);
            __CLR4_5_29ga9galvickrd5.R.inc(12981);if ((((transform != null)&&(__CLR4_5_29ga9galvickrd5.R.iget(12982)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12983)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12984);return transform;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12985);if ((((!predicate.apply(node))&&(__CLR4_5_29ga9galvickrd5.R.iget(12986)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12987)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12988);return node;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12989);return df.getOWLDataIntersectionOf(t(node.getOperands()));
        }finally{__CLR4_5_29ga9galvickrd5.R.flushNeeded();}}

        @Override
        public Object visit(OWLDataUnionOf node) {try{__CLR4_5_29ga9galvickrd5.R.inc(12990);
            __CLR4_5_29ga9galvickrd5.R.inc(12991);OWLObject transform = check(node);
            __CLR4_5_29ga9galvickrd5.R.inc(12992);if ((((transform != null)&&(__CLR4_5_29ga9galvickrd5.R.iget(12993)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12994)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12995);return transform;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(12996);if ((((!predicate.apply(node))&&(__CLR4_5_29ga9galvickrd5.R.iget(12997)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(12998)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(12999);return node;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(13000);return df.getOWLDataUnionOf(t(node.getOperands()));
        }finally{__CLR4_5_29ga9galvickrd5.R.flushNeeded();}}

        @Override
        public Object visit(OWLDatatypeRestriction node) {try{__CLR4_5_29ga9galvickrd5.R.inc(13001);
            __CLR4_5_29ga9galvickrd5.R.inc(13002);OWLObject transform = check(node);
            __CLR4_5_29ga9galvickrd5.R.inc(13003);if ((((transform != null)&&(__CLR4_5_29ga9galvickrd5.R.iget(13004)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(13005)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(13006);return transform;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(13007);if ((((!predicate.apply(node))&&(__CLR4_5_29ga9galvickrd5.R.iget(13008)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(13009)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(13010);return node;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(13011);return df.getOWLDatatypeRestriction(t(node.getDatatype()), t(node.getFacetRestrictions()));
        }finally{__CLR4_5_29ga9galvickrd5.R.flushNeeded();}}

        @Override
        public Object visit(OWLLiteral node) {try{__CLR4_5_29ga9galvickrd5.R.inc(13012);
            __CLR4_5_29ga9galvickrd5.R.inc(13013);OWLObject transform = check(node);
            __CLR4_5_29ga9galvickrd5.R.inc(13014);if ((((transform != null)&&(__CLR4_5_29ga9galvickrd5.R.iget(13015)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(13016)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(13017);return transform;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(13018);if ((((!predicate.apply(node))&&(__CLR4_5_29ga9galvickrd5.R.iget(13019)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(13020)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(13021);return node;
            }
            // plain literal is a terminal; if the transform did not make a
            // change, then no change is required
            }__CLR4_5_29ga9galvickrd5.R.inc(13022);if ((((node.isRDFPlainLiteral())&&(__CLR4_5_29ga9galvickrd5.R.iget(13023)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(13024)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(13025);return node;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(13026);return df.getOWLLiteral(node.getLiteral(), t(node.getDatatype()));
        }finally{__CLR4_5_29ga9galvickrd5.R.flushNeeded();}}

        @Override
        public Object visit(OWLFacetRestriction node) {try{__CLR4_5_29ga9galvickrd5.R.inc(13027);
            __CLR4_5_29ga9galvickrd5.R.inc(13028);OWLObject transform = check(node);
            __CLR4_5_29ga9galvickrd5.R.inc(13029);if ((((transform != null)&&(__CLR4_5_29ga9galvickrd5.R.iget(13030)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(13031)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(13032);return transform;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(13033);if ((((!predicate.apply(node))&&(__CLR4_5_29ga9galvickrd5.R.iget(13034)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(13035)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(13036);return node;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(13037);return df.getOWLFacetRestriction(t(node.getFacet()), t(node.getFacetValue()));
        }finally{__CLR4_5_29ga9galvickrd5.R.flushNeeded();}}

        @Override
        public Object visit(OWLObjectProperty property) {try{__CLR4_5_29ga9galvickrd5.R.inc(13038);
            __CLR4_5_29ga9galvickrd5.R.inc(13039);OWLObject transform = check(property);
            __CLR4_5_29ga9galvickrd5.R.inc(13040);if ((((transform != null)&&(__CLR4_5_29ga9galvickrd5.R.iget(13041)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(13042)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(13043);return transform;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(13044);if ((((!predicate.apply(property))&&(__CLR4_5_29ga9galvickrd5.R.iget(13045)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(13046)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(13047);return property;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(13048);return df.getOWLObjectProperty(t(property.getIRI()));
        }finally{__CLR4_5_29ga9galvickrd5.R.flushNeeded();}}

        @Override
        public Object visit(OWLObjectInverseOf property) {try{__CLR4_5_29ga9galvickrd5.R.inc(13049);
            __CLR4_5_29ga9galvickrd5.R.inc(13050);OWLObject transform = check(property);
            __CLR4_5_29ga9galvickrd5.R.inc(13051);if ((((transform != null)&&(__CLR4_5_29ga9galvickrd5.R.iget(13052)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(13053)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(13054);return transform;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(13055);if ((((!predicate.apply(property))&&(__CLR4_5_29ga9galvickrd5.R.iget(13056)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(13057)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(13058);return property;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(13059);return df.getOWLObjectInverseOf(t(property.getNamedProperty()));
        }finally{__CLR4_5_29ga9galvickrd5.R.flushNeeded();}}

        @Override
        public Object visit(OWLDataProperty property) {try{__CLR4_5_29ga9galvickrd5.R.inc(13060);
            __CLR4_5_29ga9galvickrd5.R.inc(13061);OWLObject transform = check(property);
            __CLR4_5_29ga9galvickrd5.R.inc(13062);if ((((transform != null)&&(__CLR4_5_29ga9galvickrd5.R.iget(13063)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(13064)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(13065);return transform;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(13066);if ((((!predicate.apply(property))&&(__CLR4_5_29ga9galvickrd5.R.iget(13067)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(13068)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(13069);return property;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(13070);return df.getOWLDataProperty(t(property.getIRI()));
        }finally{__CLR4_5_29ga9galvickrd5.R.flushNeeded();}}

        @Override
        public Object visit(OWLAnnotationProperty property) {try{__CLR4_5_29ga9galvickrd5.R.inc(13071);
            __CLR4_5_29ga9galvickrd5.R.inc(13072);OWLObject transform = check(property);
            __CLR4_5_29ga9galvickrd5.R.inc(13073);if ((((transform != null)&&(__CLR4_5_29ga9galvickrd5.R.iget(13074)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(13075)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(13076);return transform;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(13077);if ((((!predicate.apply(property))&&(__CLR4_5_29ga9galvickrd5.R.iget(13078)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(13079)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(13080);return property;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(13081);return df.getOWLAnnotationProperty(t(property.getIRI()));
        }finally{__CLR4_5_29ga9galvickrd5.R.flushNeeded();}}

        @Override
        public Object visit(OWLNamedIndividual individual) {try{__CLR4_5_29ga9galvickrd5.R.inc(13082);
            __CLR4_5_29ga9galvickrd5.R.inc(13083);OWLObject transform = check(individual);
            __CLR4_5_29ga9galvickrd5.R.inc(13084);if ((((transform != null)&&(__CLR4_5_29ga9galvickrd5.R.iget(13085)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(13086)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(13087);return transform;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(13088);if ((((!predicate.apply(individual))&&(__CLR4_5_29ga9galvickrd5.R.iget(13089)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(13090)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(13091);return individual;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(13092);return df.getOWLNamedIndividual(t(individual.getIRI()));
        }finally{__CLR4_5_29ga9galvickrd5.R.flushNeeded();}}

        @Override
        public Object visit(OWLAnnotation node) {try{__CLR4_5_29ga9galvickrd5.R.inc(13093);
            __CLR4_5_29ga9galvickrd5.R.inc(13094);OWLObject transform = check(node);
            __CLR4_5_29ga9galvickrd5.R.inc(13095);if ((((transform != null)&&(__CLR4_5_29ga9galvickrd5.R.iget(13096)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(13097)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(13098);return transform;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(13099);if ((((!predicate.apply(node))&&(__CLR4_5_29ga9galvickrd5.R.iget(13100)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(13101)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(13102);return node;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(13103);return df.getOWLAnnotation(t(node.getProperty()), t(node.getValue()), t(node.getAnnotations()));
        }finally{__CLR4_5_29ga9galvickrd5.R.flushNeeded();}}

        @Override
        public Object visit(IRI iri) {try{__CLR4_5_29ga9galvickrd5.R.inc(13104);
            __CLR4_5_29ga9galvickrd5.R.inc(13105);OWLObject transform = check(iri);
            __CLR4_5_29ga9galvickrd5.R.inc(13106);if ((((transform != null)&&(__CLR4_5_29ga9galvickrd5.R.iget(13107)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(13108)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(13109);return transform;
            }
            // IRI is a terminal; if the transform did not make a change, then
            // no change is required
            }__CLR4_5_29ga9galvickrd5.R.inc(13110);return iri;
        }finally{__CLR4_5_29ga9galvickrd5.R.flushNeeded();}}

        @Override
        public Object visit(OWLAnonymousIndividual individual) {try{__CLR4_5_29ga9galvickrd5.R.inc(13111);
            __CLR4_5_29ga9galvickrd5.R.inc(13112);OWLObject transform = check(individual);
            __CLR4_5_29ga9galvickrd5.R.inc(13113);if ((((transform != null)&&(__CLR4_5_29ga9galvickrd5.R.iget(13114)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(13115)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(13116);return transform;
            }
            // OWLAnonymousIndividual is a terminal; if the transform did not
            // make a change, then no change is required
            }__CLR4_5_29ga9galvickrd5.R.inc(13117);return individual;
        }finally{__CLR4_5_29ga9galvickrd5.R.flushNeeded();}}

        @Override
        public Object visit(SWRLClassAtom node) {try{__CLR4_5_29ga9galvickrd5.R.inc(13118);
            __CLR4_5_29ga9galvickrd5.R.inc(13119);OWLObject transform = check(node);
            __CLR4_5_29ga9galvickrd5.R.inc(13120);if ((((transform != null)&&(__CLR4_5_29ga9galvickrd5.R.iget(13121)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(13122)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(13123);return transform;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(13124);if ((((!predicate.apply(node))&&(__CLR4_5_29ga9galvickrd5.R.iget(13125)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(13126)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(13127);return node;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(13128);return df.getSWRLClassAtom(t(node.getPredicate()), t(node.getArgument()));
        }finally{__CLR4_5_29ga9galvickrd5.R.flushNeeded();}}

        @Override
        public Object visit(SWRLDataRangeAtom node) {try{__CLR4_5_29ga9galvickrd5.R.inc(13129);
            __CLR4_5_29ga9galvickrd5.R.inc(13130);OWLObject transform = check(node);
            __CLR4_5_29ga9galvickrd5.R.inc(13131);if ((((transform != null)&&(__CLR4_5_29ga9galvickrd5.R.iget(13132)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(13133)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(13134);return transform;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(13135);if ((((!predicate.apply(node))&&(__CLR4_5_29ga9galvickrd5.R.iget(13136)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(13137)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(13138);return node;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(13139);return df.getSWRLDataRangeAtom(t(node.getPredicate()), t(node.getArgument()));
        }finally{__CLR4_5_29ga9galvickrd5.R.flushNeeded();}}

        @Override
        public Object visit(SWRLObjectPropertyAtom node) {try{__CLR4_5_29ga9galvickrd5.R.inc(13140);
            __CLR4_5_29ga9galvickrd5.R.inc(13141);OWLObject transform = check(node);
            __CLR4_5_29ga9galvickrd5.R.inc(13142);if ((((transform != null)&&(__CLR4_5_29ga9galvickrd5.R.iget(13143)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(13144)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(13145);return transform;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(13146);if ((((!predicate.apply(node))&&(__CLR4_5_29ga9galvickrd5.R.iget(13147)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(13148)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(13149);return node;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(13150);return df.getSWRLObjectPropertyAtom(t(node.getPredicate()), t(node.getFirstArgument()), t(node
                .getSecondArgument()));
        }finally{__CLR4_5_29ga9galvickrd5.R.flushNeeded();}}

        @Override
        public Object visit(SWRLDataPropertyAtom node) {try{__CLR4_5_29ga9galvickrd5.R.inc(13151);
            __CLR4_5_29ga9galvickrd5.R.inc(13152);OWLObject transform = check(node);
            __CLR4_5_29ga9galvickrd5.R.inc(13153);if ((((transform != null)&&(__CLR4_5_29ga9galvickrd5.R.iget(13154)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(13155)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(13156);return transform;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(13157);if ((((!predicate.apply(node))&&(__CLR4_5_29ga9galvickrd5.R.iget(13158)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(13159)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(13160);return node;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(13161);return df.getSWRLDataPropertyAtom(t(node.getPredicate()), t(node.getFirstArgument()), t(node
                .getSecondArgument()));
        }finally{__CLR4_5_29ga9galvickrd5.R.flushNeeded();}}

        @Override
        public Object visit(SWRLBuiltInAtom node) {try{__CLR4_5_29ga9galvickrd5.R.inc(13162);
            __CLR4_5_29ga9galvickrd5.R.inc(13163);OWLObject transform = check(node);
            __CLR4_5_29ga9galvickrd5.R.inc(13164);if ((((transform != null)&&(__CLR4_5_29ga9galvickrd5.R.iget(13165)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(13166)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(13167);return transform;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(13168);if ((((!predicate.apply(node))&&(__CLR4_5_29ga9galvickrd5.R.iget(13169)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(13170)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(13171);return node;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(13172);return df.getSWRLBuiltInAtom(t(node.getPredicate()), t(node.getArguments()));
        }finally{__CLR4_5_29ga9galvickrd5.R.flushNeeded();}}

        @Override
        public Object visit(SWRLVariable node) {try{__CLR4_5_29ga9galvickrd5.R.inc(13173);
            __CLR4_5_29ga9galvickrd5.R.inc(13174);OWLObject transform = check(node);
            __CLR4_5_29ga9galvickrd5.R.inc(13175);if ((((transform != null)&&(__CLR4_5_29ga9galvickrd5.R.iget(13176)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(13177)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(13178);return transform;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(13179);if ((((!predicate.apply(node))&&(__CLR4_5_29ga9galvickrd5.R.iget(13180)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(13181)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(13182);return node;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(13183);return df.getSWRLVariable(t(node.getIRI()));
        }finally{__CLR4_5_29ga9galvickrd5.R.flushNeeded();}}

        @Override
        public Object visit(SWRLIndividualArgument node) {try{__CLR4_5_29ga9galvickrd5.R.inc(13184);
            __CLR4_5_29ga9galvickrd5.R.inc(13185);OWLObject transform = check(node);
            __CLR4_5_29ga9galvickrd5.R.inc(13186);if ((((transform != null)&&(__CLR4_5_29ga9galvickrd5.R.iget(13187)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(13188)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(13189);return transform;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(13190);if ((((!predicate.apply(node))&&(__CLR4_5_29ga9galvickrd5.R.iget(13191)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(13192)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(13193);return node;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(13194);return df.getSWRLIndividualArgument(t(node.getIndividual()));
        }finally{__CLR4_5_29ga9galvickrd5.R.flushNeeded();}}

        @Override
        public Object visit(SWRLLiteralArgument node) {try{__CLR4_5_29ga9galvickrd5.R.inc(13195);
            __CLR4_5_29ga9galvickrd5.R.inc(13196);OWLObject transform = check(node);
            __CLR4_5_29ga9galvickrd5.R.inc(13197);if ((((transform != null)&&(__CLR4_5_29ga9galvickrd5.R.iget(13198)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(13199)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(13200);return transform;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(13201);if ((((!predicate.apply(node))&&(__CLR4_5_29ga9galvickrd5.R.iget(13202)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(13203)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(13204);return node;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(13205);return df.getSWRLLiteralArgument(t(node.getLiteral()));
        }finally{__CLR4_5_29ga9galvickrd5.R.flushNeeded();}}

        @Override
        public Object visit(SWRLSameIndividualAtom node) {try{__CLR4_5_29ga9galvickrd5.R.inc(13206);
            __CLR4_5_29ga9galvickrd5.R.inc(13207);OWLObject transform = check(node);
            __CLR4_5_29ga9galvickrd5.R.inc(13208);if ((((transform != null)&&(__CLR4_5_29ga9galvickrd5.R.iget(13209)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(13210)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(13211);return transform;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(13212);if ((((!predicate.apply(node))&&(__CLR4_5_29ga9galvickrd5.R.iget(13213)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(13214)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(13215);return node;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(13216);return df.getSWRLSameIndividualAtom(t(node.getFirstArgument()), t(node.getSecondArgument()));
        }finally{__CLR4_5_29ga9galvickrd5.R.flushNeeded();}}

        @Override
        public Object visit(SWRLDifferentIndividualsAtom node) {try{__CLR4_5_29ga9galvickrd5.R.inc(13217);
            __CLR4_5_29ga9galvickrd5.R.inc(13218);OWLObject transform = check(node);
            __CLR4_5_29ga9galvickrd5.R.inc(13219);if ((((transform != null)&&(__CLR4_5_29ga9galvickrd5.R.iget(13220)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(13221)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(13222);return transform;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(13223);if ((((!predicate.apply(node))&&(__CLR4_5_29ga9galvickrd5.R.iget(13224)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(13225)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(13226);return node;
            }
            }__CLR4_5_29ga9galvickrd5.R.inc(13227);return df.getSWRLDifferentIndividualsAtom(t(node.getFirstArgument()), t(node.getSecondArgument()));
        }finally{__CLR4_5_29ga9galvickrd5.R.flushNeeded();}}

        @Override
        public Object visit(OWLOntology ontology) {try{__CLR4_5_29ga9galvickrd5.R.inc(13228);
            __CLR4_5_29ga9galvickrd5.R.inc(13229);for (AxiomType<?> t : AxiomType.AXIOM_TYPES) {{
                __CLR4_5_29ga9galvickrd5.R.inc(13230);for (OWLAxiom ax : ontology.getAxioms(t)) {{
                    __CLR4_5_29ga9galvickrd5.R.inc(13231);ax.accept(this);
                }
            }}
            }__CLR4_5_29ga9galvickrd5.R.inc(13232);for (OWLAnnotation a : ontology.getAnnotations()) {{
                __CLR4_5_29ga9galvickrd5.R.inc(13233);OWLAnnotation transform = t(a);
                __CLR4_5_29ga9galvickrd5.R.inc(13234);if ((((transform != a)&&(__CLR4_5_29ga9galvickrd5.R.iget(13235)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(13236)==0&false))) {{
                    __CLR4_5_29ga9galvickrd5.R.inc(13237);ontologyChanges.add(new RemoveOntologyAnnotation(ontology, a));
                    __CLR4_5_29ga9galvickrd5.R.inc(13238);ontologyChanges.add(new AddOntologyAnnotation(ontology, transform));
                }
            }}
            }__CLR4_5_29ga9galvickrd5.R.inc(13239);for (OWLImportsDeclaration id : ontology.getImportsDeclarations()) {{
                __CLR4_5_29ga9galvickrd5.R.inc(13240);OWLImportsDeclaration transform = check(id);
                __CLR4_5_29ga9galvickrd5.R.inc(13241);if ((((transform != null)&&(__CLR4_5_29ga9galvickrd5.R.iget(13242)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(13243)==0&false))) {{
                    __CLR4_5_29ga9galvickrd5.R.inc(13244);ontologyChanges.add(new RemoveImport(ontology, id));
                    __CLR4_5_29ga9galvickrd5.R.inc(13245);ontologyChanges.add(new AddImport(ontology, transform));
                }
            }}
            }__CLR4_5_29ga9galvickrd5.R.inc(13246);OWLOntologyID transform = check(ontology.getOntologyID());
            __CLR4_5_29ga9galvickrd5.R.inc(13247);if ((((transform != null)&&(__CLR4_5_29ga9galvickrd5.R.iget(13248)!=0|true))||(__CLR4_5_29ga9galvickrd5.R.iget(13249)==0&false))) {{
                __CLR4_5_29ga9galvickrd5.R.inc(13250);ontologyChanges.add(new SetOntologyID(ontology, transform));
            }
            // the ontology object is never modified
            }__CLR4_5_29ga9galvickrd5.R.inc(13251);return ontology;
        }finally{__CLR4_5_29ga9galvickrd5.R.flushNeeded();}}
    }
}
