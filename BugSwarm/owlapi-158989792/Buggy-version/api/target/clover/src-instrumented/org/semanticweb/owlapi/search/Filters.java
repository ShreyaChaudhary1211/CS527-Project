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
package org.semanticweb.owlapi.search;

import java.util.Collection;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.model.AxiomType;
import org.semanticweb.owlapi.model.OWLAnnotationAssertionAxiom;
import org.semanticweb.owlapi.model.OWLAnnotationPropertyDomainAxiom;
import org.semanticweb.owlapi.model.OWLAnnotationPropertyRangeAxiom;
import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.OWLDatatypeDefinitionAxiom;
import org.semanticweb.owlapi.model.OWLSubAnnotationPropertyOfAxiom;
import org.semanticweb.owlapi.model.OWLSubClassOfAxiom;
import org.semanticweb.owlapi.model.OWLSubDataPropertyOfAxiom;
import org.semanticweb.owlapi.model.OWLSubObjectPropertyOfAxiom;
import org.semanticweb.owlapi.util.CollectionFactory;
import org.semanticweb.owlapi.util.OWLAxiomSearchFilter;

/**
 * Collection of filters for use in searching through ontology axioms.
 * 
 * @author ignazio
 * @since 4.0.0
 */
public class Filters {public static class __CLR4_5_24jl4jllvickovh{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0061\u0070\u0069\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237201267L,8589935092L,5932,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private Filters() {try{__CLR4_5_24jl4jllvickovh.R.inc(5889);}finally{__CLR4_5_24jl4jllvickovh.R.flushNeeded();}}

    /**
     * @author ignazio
     * @param <A>
     *        axiom type
     */
    public abstract static class AxiomFilter<A extends OWLAxiom> implements
            OWLAxiomSearchFilter {

        private static final long serialVersionUID = 40000L;
        @Nonnull
        private final Collection<AxiomType<?>> types;

        /**
         * @param type
         *        axiom type to filter on
         */
        public AxiomFilter(AxiomType<?> type) {try{__CLR4_5_24jl4jllvickovh.R.inc(5890);
            __CLR4_5_24jl4jllvickovh.R.inc(5891);types = CollectionFactory.<AxiomType<?>> list(type);
        }finally{__CLR4_5_24jl4jllvickovh.R.flushNeeded();}}

        /**
         * @param types
         *        axiom types to filter on
         */
        public AxiomFilter(@Nonnull Collection<AxiomType<?>> types) {try{__CLR4_5_24jl4jllvickovh.R.inc(5892);
            __CLR4_5_24jl4jllvickovh.R.inc(5893);this.types = types;
        }finally{__CLR4_5_24jl4jllvickovh.R.flushNeeded();}}

        /**
         * @param types
         *        axiom types to filter on
         */
        public AxiomFilter(@Nonnull AxiomType<?>... types) {try{__CLR4_5_24jl4jllvickovh.R.inc(5894);
            __CLR4_5_24jl4jllvickovh.R.inc(5895);this.types = CollectionFactory.list(types);
        }finally{__CLR4_5_24jl4jllvickovh.R.flushNeeded();}}

        @Nonnull
        @Override
        public Iterable<AxiomType<?>> getAxiomTypes() {try{__CLR4_5_24jl4jllvickovh.R.inc(5896);
            __CLR4_5_24jl4jllvickovh.R.inc(5897);return types;
        }finally{__CLR4_5_24jl4jllvickovh.R.flushNeeded();}}

        @SuppressWarnings("unchecked")
        @Override
        public boolean pass(@Nonnull OWLAxiom axiom, @Nonnull Object key) {try{__CLR4_5_24jl4jllvickovh.R.inc(5898);
            __CLR4_5_24jl4jllvickovh.R.inc(5899);return axiomValue((A) axiom).equals(key);
        }finally{__CLR4_5_24jl4jllvickovh.R.flushNeeded();}}

        /**
         * Override this method to select what part of the axiom should be
         * compared with the input key
         * 
         * @param axiom
         *        axiom to check
         * @return Object to compare to the input key
         */
        @Nonnull
        protected abstract Object axiomValue(@Nonnull A axiom);
    }

    /**
     * filter returning subannotation axioms where the super property matches
     * the input key.
     */
    @Nonnull
    public static final OWLAxiomSearchFilter subAnnotationWithSuper = new AxiomFilter<OWLSubAnnotationPropertyOfAxiom>(
            AxiomType.SUB_ANNOTATION_PROPERTY_OF) {

        private static final long serialVersionUID = 40000L;

        @Nonnull
        @Override
        protected Object axiomValue(
                @Nonnull OWLSubAnnotationPropertyOfAxiom axiom) {try{__CLR4_5_24jl4jllvickovh.R.inc(5900);
            __CLR4_5_24jl4jllvickovh.R.inc(5901);return axiom.getSuperProperty();
        }finally{__CLR4_5_24jl4jllvickovh.R.flushNeeded();}}
    };
    /**
     * filter returning subannotation axioms where the sub property matches the
     * input key.
     */
    @Nonnull
    public static final OWLAxiomSearchFilter subAnnotationWithSub = new AxiomFilter<OWLSubAnnotationPropertyOfAxiom>(
            AxiomType.SUB_ANNOTATION_PROPERTY_OF) {

        private static final long serialVersionUID = 40000L;

        @Nonnull
        @Override
        protected Object axiomValue(
                @Nonnull OWLSubAnnotationPropertyOfAxiom axiom) {try{__CLR4_5_24jl4jllvickovh.R.inc(5902);
            __CLR4_5_24jl4jllvickovh.R.inc(5903);return axiom.getSubProperty();
        }finally{__CLR4_5_24jl4jllvickovh.R.flushNeeded();}}
    };
    /**
     * filter returning subclass axioms where the super class matches the input
     * key.
     */
    @Nonnull
    public static final OWLAxiomSearchFilter subClassWithSuper = new AxiomFilter<OWLSubClassOfAxiom>(
            AxiomType.SUBCLASS_OF) {

        private static final long serialVersionUID = 40000L;

        @Nonnull
        @Override
        protected Object axiomValue(@Nonnull OWLSubClassOfAxiom axiom) {try{__CLR4_5_24jl4jllvickovh.R.inc(5904);
            __CLR4_5_24jl4jllvickovh.R.inc(5905);return axiom.getSuperClass();
        }finally{__CLR4_5_24jl4jllvickovh.R.flushNeeded();}}
    };
    /**
     * filter returning subclass axioms where the sub class matches the input
     * key.
     */
    @Nonnull
    public static final OWLAxiomSearchFilter subClassWithSub = new AxiomFilter<OWLSubClassOfAxiom>(
            AxiomType.SUBCLASS_OF) {

        private static final long serialVersionUID = 40000L;

        @Nonnull
        @Override
        protected Object axiomValue(@Nonnull OWLSubClassOfAxiom axiom) {try{__CLR4_5_24jl4jllvickovh.R.inc(5906);
            __CLR4_5_24jl4jllvickovh.R.inc(5907);return axiom.getSubClass();
        }finally{__CLR4_5_24jl4jllvickovh.R.flushNeeded();}}
    };
    /**
     * filter returning sub object property axioms where the super property
     * matches the input key.
     */
    @Nonnull
    public static final OWLAxiomSearchFilter subObjectPropertyWithSuper = new AxiomFilter<OWLSubObjectPropertyOfAxiom>(
            AxiomType.SUB_OBJECT_PROPERTY) {

        private static final long serialVersionUID = 40000L;

        @Nonnull
        @Override
        protected Object axiomValue(@Nonnull OWLSubObjectPropertyOfAxiom axiom) {try{__CLR4_5_24jl4jllvickovh.R.inc(5908);
            __CLR4_5_24jl4jllvickovh.R.inc(5909);return axiom.getSuperProperty();
        }finally{__CLR4_5_24jl4jllvickovh.R.flushNeeded();}}
    };
    /**
     * filter returning sub object property axioms where the sub property
     * matches the input key.
     */
    @Nonnull
    public static final OWLAxiomSearchFilter subObjectPropertyWithSub = new AxiomFilter<OWLSubObjectPropertyOfAxiom>(
            AxiomType.SUB_OBJECT_PROPERTY) {

        private static final long serialVersionUID = 40000L;

        @Nonnull
        @Override
        protected Object axiomValue(@Nonnull OWLSubObjectPropertyOfAxiom axiom) {try{__CLR4_5_24jl4jllvickovh.R.inc(5910);
            __CLR4_5_24jl4jllvickovh.R.inc(5911);return axiom.getSubProperty();
        }finally{__CLR4_5_24jl4jllvickovh.R.flushNeeded();}}
    };
    /**
     * filter returning sub data property axioms where the super property
     * matches the input key.
     */
    @Nonnull
    public static final OWLAxiomSearchFilter subDataPropertyWithSuper = new AxiomFilter<OWLSubDataPropertyOfAxiom>(
            AxiomType.SUB_DATA_PROPERTY) {

        private static final long serialVersionUID = 40000L;

        @Nonnull
        @Override
        protected Object axiomValue(@Nonnull OWLSubDataPropertyOfAxiom axiom) {try{__CLR4_5_24jl4jllvickovh.R.inc(5912);
            __CLR4_5_24jl4jllvickovh.R.inc(5913);return axiom.getSuperProperty();
        }finally{__CLR4_5_24jl4jllvickovh.R.flushNeeded();}}
    };
    /**
     * filter returning sub data property axioms where the sub property matches
     * the input key.
     */
    @Nonnull
    public static final OWLAxiomSearchFilter subDataPropertyWithSub = new AxiomFilter<OWLSubDataPropertyOfAxiom>(
            AxiomType.SUB_DATA_PROPERTY) {

        private static final long serialVersionUID = 40000L;

        @Nonnull
        @Override
        protected Object axiomValue(@Nonnull OWLSubDataPropertyOfAxiom axiom) {try{__CLR4_5_24jl4jllvickovh.R.inc(5914);
            __CLR4_5_24jl4jllvickovh.R.inc(5915);return axiom.getSubProperty();
        }finally{__CLR4_5_24jl4jllvickovh.R.flushNeeded();}}
    };
    /**
     * filter returning datatype definition axioms where the datatype matches
     * the input key.
     */
    @Nonnull
    public static final OWLAxiomSearchFilter datatypeDefFilter = new AxiomFilter<OWLDatatypeDefinitionAxiom>(
            AxiomType.DATATYPE_DEFINITION) {

        private static final long serialVersionUID = 40000L;

        @Nonnull
        @Override
        protected Object axiomValue(@Nonnull OWLDatatypeDefinitionAxiom axiom) {try{__CLR4_5_24jl4jllvickovh.R.inc(5916);
            __CLR4_5_24jl4jllvickovh.R.inc(5917);return axiom.getDatatype();
        }finally{__CLR4_5_24jl4jllvickovh.R.flushNeeded();}}
    };
    /**
     * filter returning annotation property range axioms where the property
     * matches the input key.
     */
    @Nonnull
    public static final OWLAxiomSearchFilter apRangeFilter = new AxiomFilter<OWLAnnotationPropertyRangeAxiom>(
            AxiomType.ANNOTATION_PROPERTY_RANGE) {

        private static final long serialVersionUID = 40000L;

        @Nonnull
        @Override
        protected Object axiomValue(
                @Nonnull OWLAnnotationPropertyRangeAxiom axiom) {try{__CLR4_5_24jl4jllvickovh.R.inc(5918);
            __CLR4_5_24jl4jllvickovh.R.inc(5919);return axiom.getProperty();
        }finally{__CLR4_5_24jl4jllvickovh.R.flushNeeded();}}
    };
    /**
     * filter returning annotation property domain axioms where the property
     * matches the input key.
     */
    @Nonnull
    public static final OWLAxiomSearchFilter apDomainFilter = new AxiomFilter<OWLAnnotationPropertyDomainAxiom>(
            AxiomType.ANNOTATION_PROPERTY_DOMAIN) {

        private static final long serialVersionUID = 40000L;

        @Nonnull
        @Override
        protected Object axiomValue(
                @Nonnull OWLAnnotationPropertyDomainAxiom axiom) {try{__CLR4_5_24jl4jllvickovh.R.inc(5920);
            __CLR4_5_24jl4jllvickovh.R.inc(5921);return axiom.getProperty();
        }finally{__CLR4_5_24jl4jllvickovh.R.flushNeeded();}}
    };
    /**
     * filter returning annotation assertions where the subject matches the
     * input key.
     * 
     * @deprecated use the OWLOntology:getAnnotationAssertionAxioms() in place
     *             of this filter as it is much faster, thanks to indexing.
     */
    @Deprecated
    @Nonnull
    public static final OWLAxiomSearchFilter annotations = new AxiomFilter<OWLAnnotationAssertionAxiom>(
            AxiomType.ANNOTATION_ASSERTION) {

        private static final long serialVersionUID = 40000L;

        @Nonnull
        @Override
        protected Object axiomValue(@Nonnull OWLAnnotationAssertionAxiom axiom) {try{__CLR4_5_24jl4jllvickovh.R.inc(5922);
            __CLR4_5_24jl4jllvickovh.R.inc(5923);return axiom.getSubject();
        }finally{__CLR4_5_24jl4jllvickovh.R.flushNeeded();}}
    };
    /**
     * filter returning all axioms included in TBox or RBox. No assertions,
     * nonlogical axioms or SWRL rules.
     */
    @Nonnull
    public static final OWLAxiomSearchFilter axiomsFromTBoxAndRBox = new AxiomFilter<OWLAxiom>(
            AxiomType.TBoxAndRBoxAxiomTypes) {

        private static final long serialVersionUID = 40000L;

        @Override
        protected Object axiomValue(OWLAxiom axiom) {try{__CLR4_5_24jl4jllvickovh.R.inc(5924);
            __CLR4_5_24jl4jllvickovh.R.inc(5925);return axiom;
        }finally{__CLR4_5_24jl4jllvickovh.R.flushNeeded();}}

        @Override
        public boolean pass(OWLAxiom axiom, Object key) {try{__CLR4_5_24jl4jllvickovh.R.inc(5926);
            // for this filter, accept all axioms
            __CLR4_5_24jl4jllvickovh.R.inc(5927);return true;
        }finally{__CLR4_5_24jl4jllvickovh.R.flushNeeded();}}
    };
    /**
     * filter returning all axioms not in TBox or RBox; therefore, ABox axioms,
     * nonlogical axioms and SWRL rules.
     */
    @Nonnull
    public static final OWLAxiomSearchFilter axiomsNotInTBoxOrRBox = new AxiomFilter<OWLAxiom>(
            AxiomType.AXIOM_TYPES) {

        private static final long serialVersionUID = 40000L;

        @Override
        protected Object axiomValue(OWLAxiom axiom) {try{__CLR4_5_24jl4jllvickovh.R.inc(5928);
            __CLR4_5_24jl4jllvickovh.R.inc(5929);return axiom;
        }finally{__CLR4_5_24jl4jllvickovh.R.flushNeeded();}}

        @Override
        public boolean pass(@Nonnull OWLAxiom axiom, Object key) {try{__CLR4_5_24jl4jllvickovh.R.inc(5930);
            // for this filter, only accept the axioms whose types are not in
            // tbox or rbox
            __CLR4_5_24jl4jllvickovh.R.inc(5931);return !AxiomType.TBoxAndRBoxAxiomTypes.contains(axiom
                    .getAxiomType());
        }finally{__CLR4_5_24jl4jllvickovh.R.flushNeeded();}}
    };
}
