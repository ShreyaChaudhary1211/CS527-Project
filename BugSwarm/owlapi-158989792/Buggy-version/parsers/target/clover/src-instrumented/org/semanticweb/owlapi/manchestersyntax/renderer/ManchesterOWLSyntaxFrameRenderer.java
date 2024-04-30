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
package org.semanticweb.owlapi.manchestersyntax.renderer;

import static org.semanticweb.owlapi.manchestersyntax.parser.ManchesterOWLSyntax.*;
import static org.semanticweb.owlapi.model.parameters.Imports.EXCLUDED;

import java.io.Writer;
import java.util.*;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.semanticweb.owlapi.io.OWLRendererException;
import org.semanticweb.owlapi.manchestersyntax.parser.ManchesterOWLSyntax;
import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.util.CollectionFactory;
import org.semanticweb.owlapi.util.OWLAxiomFilter;
import org.semanticweb.owlapi.util.OWLObjectComparator;
import org.semanticweb.owlapi.util.OntologyIRIShortFormProvider;
import org.semanticweb.owlapi.util.ShortFormProvider;

import com.google.common.base.Optional;

/**
 * The Class ManchesterOWLSyntaxFrameRenderer.
 * 
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.0.0
 */
public class ManchesterOWLSyntaxFrameRenderer extends ManchesterOWLSyntaxObjectRenderer implements OWLEntityVisitor {public static class __CLR4_5_2k0lk0llvicmbvr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,27005,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    class SectionMap<O, V extends OWLAxiom> {

        @Nonnull
        private final Map<O, Collection<V>> object2Axioms = new LinkedHashMap<>();

        /**
         * @return true if empty
         */
        public boolean isNotEmpty() {try{__CLR4_5_2k0lk0llvicmbvr.R.inc(25941);
            __CLR4_5_2k0lk0llvicmbvr.R.inc(25942);return !object2Axioms.isEmpty();
        }finally{__CLR4_5_2k0lk0llvicmbvr.R.flushNeeded();}}

        /**
         * @param o
         *        key
         * @param forAxiom
         *        axiom to add
         */
        public void put(O o, V forAxiom) {try{__CLR4_5_2k0lk0llvicmbvr.R.inc(25943);
            __CLR4_5_2k0lk0llvicmbvr.R.inc(25944);Collection<V> axioms = object2Axioms.get(o);
            __CLR4_5_2k0lk0llvicmbvr.R.inc(25945);if ((((axioms == null)&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(25946)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(25947)==0&false))) {{
                __CLR4_5_2k0lk0llvicmbvr.R.inc(25948);axioms = sortedCollection();
                __CLR4_5_2k0lk0llvicmbvr.R.inc(25949);object2Axioms.put(o, axioms);
            }
            }__CLR4_5_2k0lk0llvicmbvr.R.inc(25950);axioms.add(forAxiom);
        }finally{__CLR4_5_2k0lk0llvicmbvr.R.flushNeeded();}}

        /**
         * @param o
         *        object to remove
         */
        public void remove(O o) {try{__CLR4_5_2k0lk0llvicmbvr.R.inc(25951);
            __CLR4_5_2k0lk0llvicmbvr.R.inc(25952);object2Axioms.remove(o);
        }finally{__CLR4_5_2k0lk0llvicmbvr.R.flushNeeded();}}

        /**
         * @return sections
         */
        @Nonnull
        public Collection<O> getSectionObjects() {try{__CLR4_5_2k0lk0llvicmbvr.R.inc(25953);
            __CLR4_5_2k0lk0llvicmbvr.R.inc(25954);return object2Axioms.keySet();
        }finally{__CLR4_5_2k0lk0llvicmbvr.R.flushNeeded();}}

        /**
         * @param sectionObject
         *        sectionObject
         * @return annotations for objects
         */
        @Nonnull
        public Collection<Collection<OWLAnnotation>> getAnnotationsForSectionObject(Object sectionObject) {try{__CLR4_5_2k0lk0llvicmbvr.R.inc(25955);
            __CLR4_5_2k0lk0llvicmbvr.R.inc(25956);Collection<V> axioms = object2Axioms.get(sectionObject);
            __CLR4_5_2k0lk0llvicmbvr.R.inc(25957);if ((((axioms == null)&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(25958)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(25959)==0&false))) {{
                __CLR4_5_2k0lk0llvicmbvr.R.inc(25960);return sortedSet();
            }
            }__CLR4_5_2k0lk0llvicmbvr.R.inc(25961);Collection<Collection<OWLAnnotation>> annos = new ArrayList<>();
            __CLR4_5_2k0lk0llvicmbvr.R.inc(25962);for (OWLAxiom ax : axioms) {{
                __CLR4_5_2k0lk0llvicmbvr.R.inc(25963);annos.add(sortedCollection(ax.getAnnotations()));
            }
            }__CLR4_5_2k0lk0llvicmbvr.R.inc(25964);return annos;
        }finally{__CLR4_5_2k0lk0llvicmbvr.R.flushNeeded();}}
    }

    /** The ontologies. */
    private final Set<OWLOntology> ontologies;
    /** The short form provider. */
    private OntologyIRIShortFormProvider shortFormProvider = new OntologyIRIShortFormProvider();
    /** The filtered axiom types. */
    @Nonnull
    private final Set<AxiomType> filteredAxiomTypes = filtered();

    private static Set<AxiomType> filtered() {try{__CLR4_5_2k0lk0llvicmbvr.R.inc(25965);
        __CLR4_5_2k0lk0llvicmbvr.R.inc(25966);return Collections.singleton((AxiomType) AxiomType.SWRL_RULE);
    }finally{__CLR4_5_2k0lk0llvicmbvr.R.flushNeeded();}}

    /** The render extensions. */
    private boolean renderExtensions = false;
    /** The listeners. */
    @Nonnull
    private final List<RendererListener> listeners = new ArrayList<>();
    /** The axiom filter. */
    private OWLAxiomFilter axiomFilter = new OWLAxiomFilter() {

        @Override
        public boolean passes(OWLAxiom axiom) {try{__CLR4_5_2k0lk0llvicmbvr.R.inc(25967);
            __CLR4_5_2k0lk0llvicmbvr.R.inc(25968);return true;
        }finally{__CLR4_5_2k0lk0llvicmbvr.R.flushNeeded();}}
    };
    /** The rendering director. */
    private RenderingDirector renderingDirector = new DefaultRenderingDirector();
    @Nonnull
    private final OWLObjectComparator owlObjectComparator;

    /**
     * Instantiates a new manchester owl syntax frame renderer.
     * 
     * @param ontology
     *        the ontology
     * @param writer
     *        the writer
     * @param entityShortFormProvider
     *        the entity short form provider
     */
    public ManchesterOWLSyntaxFrameRenderer(@Nonnull OWLOntology ontology, @Nonnull Writer writer,
        @Nonnull ShortFormProvider entityShortFormProvider) {
        this(CollectionFactory.createSet(ontology), writer, entityShortFormProvider);__CLR4_5_2k0lk0llvicmbvr.R.inc(25970);try{__CLR4_5_2k0lk0llvicmbvr.R.inc(25969);
    }finally{__CLR4_5_2k0lk0llvicmbvr.R.flushNeeded();}}

    /**
     * Instantiates a new manchester owl syntax frame renderer.
     * 
     * @param ontologies
     *        the ontologies
     * @param writer
     *        the writer
     * @param entityShortFormProvider
     *        the entity short form provider
     */
    public ManchesterOWLSyntaxFrameRenderer(@Nonnull Set<OWLOntology> ontologies, Writer writer,
        @Nonnull ShortFormProvider entityShortFormProvider) {
        super(writer, entityShortFormProvider);__CLR4_5_2k0lk0llvicmbvr.R.inc(25972);try{__CLR4_5_2k0lk0llvicmbvr.R.inc(25971);
        __CLR4_5_2k0lk0llvicmbvr.R.inc(25973);this.ontologies = new LinkedHashSet<>(ontologies);
        __CLR4_5_2k0lk0llvicmbvr.R.inc(25974);owlObjectComparator = new OWLObjectComparator(entityShortFormProvider);
    }finally{__CLR4_5_2k0lk0llvicmbvr.R.flushNeeded();}}

    /**
     * Sets the rendering director.
     * 
     * @param renderingDirector
     *        the new rendering director
     */
    public void setRenderingDirector(RenderingDirector renderingDirector) {try{__CLR4_5_2k0lk0llvicmbvr.R.inc(25975);
        __CLR4_5_2k0lk0llvicmbvr.R.inc(25976);this.renderingDirector = renderingDirector;
    }finally{__CLR4_5_2k0lk0llvicmbvr.R.flushNeeded();}}

    /**
     * @param shortFormProvider
     *        short form provider to be used
     */
    public void setOntologyIRIShortFormProvider(OntologyIRIShortFormProvider shortFormProvider) {try{__CLR4_5_2k0lk0llvicmbvr.R.inc(25977);
        __CLR4_5_2k0lk0llvicmbvr.R.inc(25978);this.shortFormProvider = shortFormProvider;
    }finally{__CLR4_5_2k0lk0llvicmbvr.R.flushNeeded();}}

    /**
     * Adds the renderer listener.
     * 
     * @param listener
     *        the listener
     */
    public void addRendererListener(RendererListener listener) {try{__CLR4_5_2k0lk0llvicmbvr.R.inc(25979);
        __CLR4_5_2k0lk0llvicmbvr.R.inc(25980);listeners.add(listener);
    }finally{__CLR4_5_2k0lk0llvicmbvr.R.flushNeeded();}}

    /**
     * Removes the renderer listener.
     * 
     * @param listener
     *        the listener
     */
    public void removeRendererListener(RendererListener listener) {try{__CLR4_5_2k0lk0llvicmbvr.R.inc(25981);
        __CLR4_5_2k0lk0llvicmbvr.R.inc(25982);listeners.remove(listener);
    }finally{__CLR4_5_2k0lk0llvicmbvr.R.flushNeeded();}}

    /**
     * Sets the axiom filter.
     * 
     * @param axiomFilter
     *        the new axiom filter
     */
    public void setAxiomFilter(OWLAxiomFilter axiomFilter) {try{__CLR4_5_2k0lk0llvicmbvr.R.inc(25983);
        __CLR4_5_2k0lk0llvicmbvr.R.inc(25984);this.axiomFilter = axiomFilter;
    }finally{__CLR4_5_2k0lk0llvicmbvr.R.flushNeeded();}}

    /** Clear filtered axiom types. */
    public void clearFilteredAxiomTypes() {try{__CLR4_5_2k0lk0llvicmbvr.R.inc(25985);
        __CLR4_5_2k0lk0llvicmbvr.R.inc(25986);filteredAxiomTypes.clear();
    }finally{__CLR4_5_2k0lk0llvicmbvr.R.flushNeeded();}}

    /**
     * Adds the filtered axiom type.
     * 
     * @param axiomType
     *        the axiom type
     */
    public void addFilteredAxiomType(AxiomType<?> axiomType) {try{__CLR4_5_2k0lk0llvicmbvr.R.inc(25987);
        __CLR4_5_2k0lk0llvicmbvr.R.inc(25988);filteredAxiomTypes.add(axiomType);
    }finally{__CLR4_5_2k0lk0llvicmbvr.R.flushNeeded();}}

    /**
     * Sets the render extensions.
     * 
     * @param renderExtensions
     *        the new render extensions
     */
    public void setRenderExtensions(boolean renderExtensions) {try{__CLR4_5_2k0lk0llvicmbvr.R.inc(25989);
        __CLR4_5_2k0lk0llvicmbvr.R.inc(25990);this.renderExtensions = renderExtensions;
    }finally{__CLR4_5_2k0lk0llvicmbvr.R.flushNeeded();}}

    /**
     * Write ontology.
     * 
     * @throws OWLRendererException
     *         the oWL renderer exception
     */
    public void writeOntology() throws OWLRendererException {try{__CLR4_5_2k0lk0llvicmbvr.R.inc(25991);
        __CLR4_5_2k0lk0llvicmbvr.R.inc(25992);if ((((ontologies.size() != 1)&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(25993)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(25994)==0&false))) {{
            __CLR4_5_2k0lk0llvicmbvr.R.inc(25995);throw new OWLRuntimeException("Can only render one ontology");
        }
        }__CLR4_5_2k0lk0llvicmbvr.R.inc(25996);OWLOntology ontology = ontologies.iterator().next();
        assert (((ontology != null)&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(25997)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(25998)==0&false));
        __CLR4_5_2k0lk0llvicmbvr.R.inc(25999);writePrefixMap();
        __CLR4_5_2k0lk0llvicmbvr.R.inc(26000);writeNewLine();
        __CLR4_5_2k0lk0llvicmbvr.R.inc(26001);writeOntologyHeader(ontology);
        __CLR4_5_2k0lk0llvicmbvr.R.inc(26002);for (OWLAnnotationProperty prop : sortedCollection(ontology.getAnnotationPropertiesInSignature())) {{
            assert (((prop != null)&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26003)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26004)==0&false));
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26005);write(prop);
        }
        }__CLR4_5_2k0lk0llvicmbvr.R.inc(26006);for (OWLDatatype datatype : sortedCollection(ontology.getDatatypesInSignature())) {{
            assert (((datatype != null)&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26007)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26008)==0&false));
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26009);write(datatype);
        }
        }__CLR4_5_2k0lk0llvicmbvr.R.inc(26010);for (OWLObjectProperty prop : sortedCollection(ontology.getObjectPropertiesInSignature())) {{
            assert (((prop != null)&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26011)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26012)==0&false));
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26013);write(prop);
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26014);OWLObjectPropertyExpression invProp = prop.getInverseProperty();
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26015);if ((((!ontology.getAxioms(invProp, EXCLUDED).isEmpty())&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26016)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26017)==0&false))) {{
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26018);write(invProp);
            }
        }}
        }__CLR4_5_2k0lk0llvicmbvr.R.inc(26019);for (OWLDataProperty prop : sortedCollection(ontology.getDataPropertiesInSignature())) {{
            assert (((prop != null)&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26020)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26021)==0&false));
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26022);write(prop);
        }
        }__CLR4_5_2k0lk0llvicmbvr.R.inc(26023);for (OWLClass cls : sortedCollection(ontology.getClassesInSignature())) {{
            assert (((cls != null)&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26024)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26025)==0&false));
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26026);write(cls);
        }
        }__CLR4_5_2k0lk0llvicmbvr.R.inc(26027);for (OWLNamedIndividual ind : sortedCollection(ontology.getIndividualsInSignature())) {{
            assert (((ind != null)&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26028)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26029)==0&false));
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26030);write(ind);
        }
        }__CLR4_5_2k0lk0llvicmbvr.R.inc(26031);for (OWLAnonymousIndividual ind : sortedCollection(ontology.getReferencedAnonymousIndividuals(EXCLUDED))) {{
            assert (((ind != null)&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26032)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26033)==0&false));
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26034);write(ind);
        }
        // Nary disjoint classes axioms
        }__CLR4_5_2k0lk0llvicmbvr.R.inc(26035);event = new RendererEvent(this, ontology);
        __CLR4_5_2k0lk0llvicmbvr.R.inc(26036);for (OWLDisjointClassesAxiom ax : sortedCollection(ontology.getAxioms(AxiomType.DISJOINT_CLASSES))) {{
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26037);if ((((ax.getClassExpressions().size() > 2)&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26038)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26039)==0&false))) {{
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26040);SectionMap<Object, OWLAxiom> map = new SectionMap<>();
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26041);map.put(ax.getClassExpressions(), ax);
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26042);writeSection(DISJOINT_CLASSES, map, ",", false, ontology);
            }
        }}
        // Nary equivalent classes axioms
        }__CLR4_5_2k0lk0llvicmbvr.R.inc(26043);for (OWLEquivalentClassesAxiom ax : sortedCollection(ontology.getAxioms(AxiomType.EQUIVALENT_CLASSES))) {{
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26044);if ((((ax.getClassExpressions().size() > 2)&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26045)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26046)==0&false))) {{
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26047);SectionMap<Object, OWLAxiom> map = new SectionMap<>();
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26048);map.put(ax.getClassExpressions(), ax);
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26049);writeSection(EQUIVALENT_CLASSES, map, ",", false, ontology);
            }
        }}
        // Nary disjoint properties
        }__CLR4_5_2k0lk0llvicmbvr.R.inc(26050);for (OWLDisjointObjectPropertiesAxiom ax : sortedCollection(ontology.getAxioms(
            AxiomType.DISJOINT_OBJECT_PROPERTIES))) {{
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26051);if ((((ax.getProperties().size() > 2)&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26052)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26053)==0&false))) {{
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26054);SectionMap<Object, OWLAxiom> map = new SectionMap<>();
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26055);map.put(ax.getProperties(), ax);
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26056);writeSection(DISJOINT_PROPERTIES, map, ",", false, ontology);
            }
        }}
        // Nary equivalent properties
        }__CLR4_5_2k0lk0llvicmbvr.R.inc(26057);for (OWLEquivalentObjectPropertiesAxiom ax : sortedCollection(ontology.getAxioms(
            AxiomType.EQUIVALENT_OBJECT_PROPERTIES))) {{
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26058);if ((((ax.getProperties().size() > 2)&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26059)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26060)==0&false))) {{
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26061);SectionMap<Object, OWLAxiom> map = new SectionMap<>();
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26062);map.put(ax.getProperties(), ax);
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26063);writeSection(EQUIVALENT_PROPERTIES, map, ",", false, ontology);
            }
        }}
        // Nary disjoint properties
        }__CLR4_5_2k0lk0llvicmbvr.R.inc(26064);for (OWLDisjointDataPropertiesAxiom ax : sortedCollection(ontology.getAxioms(
            AxiomType.DISJOINT_DATA_PROPERTIES))) {{
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26065);if ((((ax.getProperties().size() > 2)&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26066)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26067)==0&false))) {{
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26068);SectionMap<Object, OWLAxiom> map = new SectionMap<>();
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26069);map.put(ax.getProperties(), ax);
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26070);writeSection(DISJOINT_PROPERTIES, map, ",", false, ontology);
            }
        }}
        // Nary equivalent properties
        }__CLR4_5_2k0lk0llvicmbvr.R.inc(26071);for (OWLEquivalentDataPropertiesAxiom ax : sortedCollection(ontology.getAxioms(
            AxiomType.EQUIVALENT_DATA_PROPERTIES))) {{
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26072);if ((((ax.getProperties().size() > 2)&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26073)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26074)==0&false))) {{
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26075);SectionMap<Object, OWLAxiom> map = new SectionMap<>();
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26076);map.put(ax.getProperties(), ax);
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26077);writeSection(EQUIVALENT_PROPERTIES, map, ",", false, ontology);
            }
        }}
        // Nary different individuals
        }__CLR4_5_2k0lk0llvicmbvr.R.inc(26078);for (OWLDifferentIndividualsAxiom ax : sortedCollection(ontology.getAxioms(AxiomType.DIFFERENT_INDIVIDUALS))) {{
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26079);if ((((ax.getIndividuals().size() > 2)&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26080)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26081)==0&false))) {{
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26082);SectionMap<Object, OWLAxiom> map = new SectionMap<>();
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26083);map.put(ax.getIndividuals(), ax);
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26084);writeSection(DIFFERENT_INDIVIDUALS, map, ",", false, ontology);
            }
        }}
        }__CLR4_5_2k0lk0llvicmbvr.R.inc(26085);for (SWRLRule rule : sortedCollection(ontology.getAxioms(AxiomType.SWRL_RULE))) {{
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26086);@Nonnull
            Set<SWRLRule> singleton = Collections.singleton(rule);
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26087);writeSection(RULE, singleton, ", ", false);
        }
        }__CLR4_5_2k0lk0llvicmbvr.R.inc(26088);flush();
    }finally{__CLR4_5_2k0lk0llvicmbvr.R.flushNeeded();}}

    /**
     * Write ontology header.
     * 
     * @param ontology
     *        the ontology
     */
    public void writeOntologyHeader(@Nonnull OWLOntology ontology) {try{__CLR4_5_2k0lk0llvicmbvr.R.inc(26089);
        __CLR4_5_2k0lk0llvicmbvr.R.inc(26090);event = new RendererEvent(this, ontology);
        __CLR4_5_2k0lk0llvicmbvr.R.inc(26091);fireFrameRenderingPrepared(ONTOLOGY.toString());
        __CLR4_5_2k0lk0llvicmbvr.R.inc(26092);write(ONTOLOGY.toString());
        __CLR4_5_2k0lk0llvicmbvr.R.inc(26093);write(":");
        __CLR4_5_2k0lk0llvicmbvr.R.inc(26094);writeSpace();
        __CLR4_5_2k0lk0llvicmbvr.R.inc(26095);if ((((!ontology.isAnonymous())&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26096)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26097)==0&false))) {{
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26098);int indent = getIndent();
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26099);writeFullURI(ontology.getOntologyID().getOntologyIRI().get().toString());
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26100);writeNewLine();
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26101);pushTab(indent);
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26102);Optional<IRI> versionIRI = ontology.getOntologyID().getVersionIRI();
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26103);if ((((versionIRI.isPresent())&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26104)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26105)==0&false))) {{
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26106);writeFullURI(versionIRI.get().toString());
            }
            }__CLR4_5_2k0lk0llvicmbvr.R.inc(26107);popTab();
        }
        }__CLR4_5_2k0lk0llvicmbvr.R.inc(26108);fireFrameRenderingStarted(ONTOLOGY.toString());
        __CLR4_5_2k0lk0llvicmbvr.R.inc(26109);writeNewLine();
        __CLR4_5_2k0lk0llvicmbvr.R.inc(26110);for (OWLImportsDeclaration decl : sortedSet(ontology.getImportsDeclarations())) {{
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26111);fireSectionItemPrepared(IMPORT.toString());
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26112);write(IMPORT.toString());
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26113);write(":");
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26114);writeSpace();
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26115);fireSectionRenderingStarted(IMPORT.toString());
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26116);writeFullURI(decl.getIRI().toString());
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26117);writeNewLine();
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26118);fireSectionRenderingFinished(IMPORT.toString());
        }
        }__CLR4_5_2k0lk0llvicmbvr.R.inc(26119);writeNewLine();
        __CLR4_5_2k0lk0llvicmbvr.R.inc(26120);writeSection(ANNOTATIONS, sortedCollection(ontology.getAnnotations()), ",", true);
        __CLR4_5_2k0lk0llvicmbvr.R.inc(26121);fireFrameRenderingFinished(ONTOLOGY.toString());
    }finally{__CLR4_5_2k0lk0llvicmbvr.R.flushNeeded();}}

    /** Write prefix map. */
    public void writePrefixMap() {try{__CLR4_5_2k0lk0llvicmbvr.R.inc(26122);
        __CLR4_5_2k0lk0llvicmbvr.R.inc(26123);ShortFormProvider sfp = getShortFormProvider();
        __CLR4_5_2k0lk0llvicmbvr.R.inc(26124);if ((((!(sfp instanceof ManchesterOWLSyntaxPrefixNameShortFormProvider))&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26125)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26126)==0&false))) {{
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26127);return;
        }
        }__CLR4_5_2k0lk0llvicmbvr.R.inc(26128);ManchesterOWLSyntaxPrefixNameShortFormProvider prov = (ManchesterOWLSyntaxPrefixNameShortFormProvider) sfp;
        __CLR4_5_2k0lk0llvicmbvr.R.inc(26129);Map<String, String> prefixMap = prov.getPrefixName2PrefixMap();
        __CLR4_5_2k0lk0llvicmbvr.R.inc(26130);for (Map.Entry<String, String> e : new TreeMap<>(prefixMap).entrySet()) {{
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26131);write(PREFIX.toString());
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26132);write(": ");
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26133);write(e.getKey());
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26134);write(" ");
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26135);writeFullURI(e.getValue());
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26136);writeNewLine();
        }
        }__CLR4_5_2k0lk0llvicmbvr.R.inc(26137);if ((((!prefixMap.isEmpty())&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26138)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26139)==0&false))) {{
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26140);writeNewLine();
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26141);writeNewLine();
        }
    }}finally{__CLR4_5_2k0lk0llvicmbvr.R.flushNeeded();}}

    /**
     * Write full uri.
     * 
     * @param uri
     *        the uri
     */
    public void writeFullURI(String uri) {try{__CLR4_5_2k0lk0llvicmbvr.R.inc(26142);
        __CLR4_5_2k0lk0llvicmbvr.R.inc(26143);write("<");
        __CLR4_5_2k0lk0llvicmbvr.R.inc(26144);write(uri);
        __CLR4_5_2k0lk0llvicmbvr.R.inc(26145);write(">");
    }finally{__CLR4_5_2k0lk0llvicmbvr.R.flushNeeded();}}

    /**
     * Checks if is filtered.
     * 
     * @param axiomType
     *        the axiom type
     * @return true, if is filtered
     */
    public boolean isFiltered(AxiomType<?> axiomType) {try{__CLR4_5_2k0lk0llvicmbvr.R.inc(26146);
        __CLR4_5_2k0lk0llvicmbvr.R.inc(26147);return filteredAxiomTypes.contains(axiomType);
    }finally{__CLR4_5_2k0lk0llvicmbvr.R.flushNeeded();}}

    /**
     * Checks if is displayed.
     * 
     * @param axiom
     *        the axiom
     * @return true, if is displayed
     */
    public boolean isDisplayed(@Nullable OWLAxiom axiom) {try{__CLR4_5_2k0lk0llvicmbvr.R.inc(26148);
        __CLR4_5_2k0lk0llvicmbvr.R.inc(26149);if ((((axiom == null)&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26150)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26151)==0&false))) {{
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26152);return false;
        }
        }__CLR4_5_2k0lk0llvicmbvr.R.inc(26153);return axiomFilter.passes(axiom);
    }finally{__CLR4_5_2k0lk0llvicmbvr.R.flushNeeded();}}

    /**
     * Write frame.
     * 
     * @param entity
     *        the entity
     * @return the sets the
     */
    public Collection<OWLAxiom> writeFrame(@Nonnull OWLEntity entity) {try{__CLR4_5_2k0lk0llvicmbvr.R.inc(26154);
        __CLR4_5_2k0lk0llvicmbvr.R.inc(26155);if ((((entity.isOWLClass())&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26156)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26157)==0&false))) {{
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26158);return write(entity.asOWLClass());
        }
        }__CLR4_5_2k0lk0llvicmbvr.R.inc(26159);if ((((entity.isOWLObjectProperty())&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26160)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26161)==0&false))) {{
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26162);return write(entity.asOWLObjectProperty());
        }
        }__CLR4_5_2k0lk0llvicmbvr.R.inc(26163);if ((((entity.isOWLDataProperty())&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26164)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26165)==0&false))) {{
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26166);return write(entity.asOWLDataProperty());
        }
        }__CLR4_5_2k0lk0llvicmbvr.R.inc(26167);if ((((entity.isOWLNamedIndividual())&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26168)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26169)==0&false))) {{
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26170);return write(entity.asOWLNamedIndividual());
        }
        }__CLR4_5_2k0lk0llvicmbvr.R.inc(26171);if ((((entity.isOWLAnnotationProperty())&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26172)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26173)==0&false))) {{
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26174);return write(entity.asOWLAnnotationProperty());
        }
        }__CLR4_5_2k0lk0llvicmbvr.R.inc(26175);if ((((entity.isOWLDatatype())&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26176)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26177)==0&false))) {{
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26178);return write(entity.asOWLDatatype());
        }
        }__CLR4_5_2k0lk0llvicmbvr.R.inc(26179);return CollectionFactory.emptySet();
    }finally{__CLR4_5_2k0lk0llvicmbvr.R.flushNeeded();}}

    /**
     * @param cls
     *        the cls
     * @return the sets the
     */
    @Nonnull
    public Collection<OWLAxiom> write(@Nonnull OWLClass cls) {try{__CLR4_5_2k0lk0llvicmbvr.R.inc(26180);
        __CLR4_5_2k0lk0llvicmbvr.R.inc(26181);List<OWLAxiom> axioms = new ArrayList<>();
        __CLR4_5_2k0lk0llvicmbvr.R.inc(26182);axioms.addAll(writeEntityStart(CLASS, cls));
        __CLR4_5_2k0lk0llvicmbvr.R.inc(26183);if ((((!isFiltered(AxiomType.EQUIVALENT_CLASSES))&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26184)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26185)==0&false))) {{
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26186);for (OWLOntology ontology : ontologies) {{
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26187);SectionMap<Object, OWLAxiom> equivalentClasses = new SectionMap<>();
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26188);for (OWLEquivalentClassesAxiom ax : sortedCollection(ontology.getEquivalentClassesAxioms(cls))) {{
                    __CLR4_5_2k0lk0llvicmbvr.R.inc(26189);if ((((ax.getClassExpressions().size() == 2 && isDisplayed(ax))&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26190)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26191)==0&false))) {{
                        __CLR4_5_2k0lk0llvicmbvr.R.inc(26192);for (OWLClassExpression equivCls : sortedCollection(ax.getClassExpressionsMinus(cls))) {{
                            __CLR4_5_2k0lk0llvicmbvr.R.inc(26193);equivalentClasses.put(equivCls, ax);
                        }
                        }__CLR4_5_2k0lk0llvicmbvr.R.inc(26194);axioms.add(ax);
                    }
                }}
                }__CLR4_5_2k0lk0llvicmbvr.R.inc(26195);equivalentClasses.remove(cls);
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26196);writeSection(EQUIVALENT_TO, equivalentClasses, ",", true, ontology);
            }
        }}
        }__CLR4_5_2k0lk0llvicmbvr.R.inc(26197);if ((((!isFiltered(AxiomType.SUBCLASS_OF))&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26198)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26199)==0&false))) {{
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26200);for (OWLOntology ontology : ontologies) {{
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26201);SectionMap<Object, OWLAxiom> superclasses = new SectionMap<>();
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26202);for (OWLSubClassOfAxiom ax : sortedCollection(ontology.getSubClassAxiomsForSubClass(cls))) {{
                    __CLR4_5_2k0lk0llvicmbvr.R.inc(26203);if ((((isDisplayed(ax))&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26204)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26205)==0&false))) {{
                        __CLR4_5_2k0lk0llvicmbvr.R.inc(26206);superclasses.put(ax.getSuperClass(), ax);
                        __CLR4_5_2k0lk0llvicmbvr.R.inc(26207);axioms.add(ax);
                    }
                }}
                }__CLR4_5_2k0lk0llvicmbvr.R.inc(26208);writeSection(SUBCLASS_OF, superclasses, ",", true, ontology);
            }
            }__CLR4_5_2k0lk0llvicmbvr.R.inc(26209);if ((((renderExtensions)&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26210)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26211)==0&false))) {{
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26212);for (OWLOntology ont : ontologies) {{
                    __CLR4_5_2k0lk0llvicmbvr.R.inc(26213);SectionMap<Object, OWLAxiom> subClasses = new SectionMap<>();
                    __CLR4_5_2k0lk0llvicmbvr.R.inc(26214);for (OWLSubClassOfAxiom ax : sortedCollection(ont.getSubClassAxiomsForSuperClass(cls))) {{
                        __CLR4_5_2k0lk0llvicmbvr.R.inc(26215);if ((((isDisplayed(ax))&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26216)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26217)==0&false))) {{
                            __CLR4_5_2k0lk0llvicmbvr.R.inc(26218);subClasses.put(ax.getSubClass(), ax);
                            __CLR4_5_2k0lk0llvicmbvr.R.inc(26219);axioms.add(ax);
                        }
                    }}
                    }__CLR4_5_2k0lk0llvicmbvr.R.inc(26220);writeSection(SUPERCLASS_OF, subClasses, ",", true, ont);
                }
            }}
        }}
        }__CLR4_5_2k0lk0llvicmbvr.R.inc(26221);if ((((!isFiltered(AxiomType.DISJOINT_UNION))&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26222)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26223)==0&false))) {{
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26224);for (OWLOntology ontology : ontologies) {{
                // Handling of nary in frame style
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26225);for (OWLDisjointUnionAxiom ax : sortedCollection(ontology.getDisjointUnionAxioms(cls))) {{
                    __CLR4_5_2k0lk0llvicmbvr.R.inc(26226);if ((((isDisplayed(ax))&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26227)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26228)==0&false))) {{
                        __CLR4_5_2k0lk0llvicmbvr.R.inc(26229);Collection<OWLClassExpression> allDisjointClasses = sortedCollection(ax.getClassExpressions());
                        __CLR4_5_2k0lk0llvicmbvr.R.inc(26230);axioms.add(ax);
                        __CLR4_5_2k0lk0llvicmbvr.R.inc(26231);writeSection(DISJOINT_UNION_OF, allDisjointClasses, ", ", false, ontology);
                    }
                }}
            }}
        }}
        }__CLR4_5_2k0lk0llvicmbvr.R.inc(26232);if ((((!isFiltered(AxiomType.DISJOINT_CLASSES))&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26233)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26234)==0&false))) {{
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26235);for (OWLOntology ontology : ontologies) {{
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26236);SectionMap<Object, OWLAxiom> disjointClasses = new SectionMap<>();
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26237);for (OWLDisjointClassesAxiom ax : sortedCollection(ontology.getDisjointClassesAxioms(cls))) {{
                    __CLR4_5_2k0lk0llvicmbvr.R.inc(26238);if ((((isDisplayed(ax))&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26239)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26240)==0&false))) {{
                        __CLR4_5_2k0lk0llvicmbvr.R.inc(26241);if ((((ax.getClassExpressions().size() == 2)&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26242)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26243)==0&false))) {{
                            __CLR4_5_2k0lk0llvicmbvr.R.inc(26244);OWLClassExpression disjointWith = sortedCollection(ax.getClassExpressionsMinus(cls))
                                .iterator().next();
                            __CLR4_5_2k0lk0llvicmbvr.R.inc(26245);disjointClasses.put(disjointWith, ax);
                        }
                        }__CLR4_5_2k0lk0llvicmbvr.R.inc(26246);axioms.add(ax);
                    }
                }}
                }__CLR4_5_2k0lk0llvicmbvr.R.inc(26247);writeSection(DISJOINT_WITH, disjointClasses, ", ", false, ontology);
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26248);if ((((renderExtensions)&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26249)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26250)==0&false))) {{
                    // Handling of nary in frame style
                    __CLR4_5_2k0lk0llvicmbvr.R.inc(26251);for (OWLDisjointClassesAxiom ax : sortedCollection(ontology.getDisjointClassesAxioms(cls))) {{
                        __CLR4_5_2k0lk0llvicmbvr.R.inc(26252);if ((((isDisplayed(ax) && ax.getClassExpressions().size() > 2)&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26253)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26254)==0&false))) {{
                            __CLR4_5_2k0lk0llvicmbvr.R.inc(26255);Collection<OWLClassExpression> allDisjointClasses = sortedCollection(ax
                                .getClassExpressions());
                            __CLR4_5_2k0lk0llvicmbvr.R.inc(26256);axioms.add(ax);
                            __CLR4_5_2k0lk0llvicmbvr.R.inc(26257);writeSection(DISJOINT_CLASSES, allDisjointClasses, ", ", false, ontology);
                        }
                    }}
                }}
            }}
        }}
        }__CLR4_5_2k0lk0llvicmbvr.R.inc(26258);if ((((!isFiltered(AxiomType.HAS_KEY))&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26259)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26260)==0&false))) {{
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26261);for (OWLOntology ontology : ontologies) {{
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26262);for (OWLHasKeyAxiom ax : sortedCollection(ontology.getHasKeyAxioms(cls))) {{
                    __CLR4_5_2k0lk0llvicmbvr.R.inc(26263);if ((((isDisplayed(ax))&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26264)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26265)==0&false))) {{
                        __CLR4_5_2k0lk0llvicmbvr.R.inc(26266);SectionMap<Object, OWLAxiom> map = new SectionMap<>();
                        __CLR4_5_2k0lk0llvicmbvr.R.inc(26267);map.put(ax.getPropertyExpressions(), ax);
                        __CLR4_5_2k0lk0llvicmbvr.R.inc(26268);writeSection(HAS_KEY, map, ", ", true, ontology);
                    }
                }}
            }}
        }}
        }__CLR4_5_2k0lk0llvicmbvr.R.inc(26269);if ((((!isFiltered(AxiomType.CLASS_ASSERTION))&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26270)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26271)==0&false))) {{
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26272);for (OWLOntology ontology : ontologies) {{
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26273);SectionMap<Object, OWLAxiom> individuals = new SectionMap<>();
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26274);for (OWLClassAssertionAxiom ax : sortedCollection(ontology.getClassAssertionAxioms(cls))) {{
                    __CLR4_5_2k0lk0llvicmbvr.R.inc(26275);if ((((isDisplayed(ax) && (renderExtensions || ax.getIndividual().isAnonymous()))&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26276)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26277)==0&false))) {{
                        __CLR4_5_2k0lk0llvicmbvr.R.inc(26278);individuals.put(ax.getIndividual(), ax);
                        __CLR4_5_2k0lk0llvicmbvr.R.inc(26279);axioms.add(ax);
                    }
                }}
                }__CLR4_5_2k0lk0llvicmbvr.R.inc(26280);writeSection(INDIVIDUALS, individuals, ",", true, ontology);
            }
        }}
        }__CLR4_5_2k0lk0llvicmbvr.R.inc(26281);if ((((!isFiltered(AxiomType.SWRL_RULE))&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26282)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26283)==0&false))) {{
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26284);for (OWLOntology ontology : ontologies) {{
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26285);Collection<OWLAxiom> rules = sortedCollection();
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26286);for (SWRLRule rule : sortedCollection(ontology.getAxioms(AxiomType.SWRL_RULE))) {{
                    __CLR4_5_2k0lk0llvicmbvr.R.inc(26287);if ((((isDisplayed(rule))&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26288)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26289)==0&false))) {{
                        __CLR4_5_2k0lk0llvicmbvr.R.inc(26290);for (SWRLAtom atom : rule.getHead()) {{
                            __CLR4_5_2k0lk0llvicmbvr.R.inc(26291);if ((((atom.getPredicate().equals(cls))&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26292)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26293)==0&false))) {{
                                __CLR4_5_2k0lk0llvicmbvr.R.inc(26294);writeSection(RULE, rules, ", ", true, ontology);
                                __CLR4_5_2k0lk0llvicmbvr.R.inc(26295);break;
                            }
                        }}
                    }}
                }}
            }}
        }}
        }__CLR4_5_2k0lk0llvicmbvr.R.inc(26296);writeEntitySectionEnd(CLASS.toString());
        __CLR4_5_2k0lk0llvicmbvr.R.inc(26297);return axioms;
    }finally{__CLR4_5_2k0lk0llvicmbvr.R.flushNeeded();}}

    /**
     * Write entity section end.
     * 
     * @param type
     *        the type
     */
    protected void writeEntitySectionEnd(String type) {try{__CLR4_5_2k0lk0llvicmbvr.R.inc(26298);
        __CLR4_5_2k0lk0llvicmbvr.R.inc(26299);fireFrameRenderingFinished(type);
        __CLR4_5_2k0lk0llvicmbvr.R.inc(26300);popTab();
        __CLR4_5_2k0lk0llvicmbvr.R.inc(26301);writeNewLine();
    }finally{__CLR4_5_2k0lk0llvicmbvr.R.flushNeeded();}}

    /**
     * @param property
     *        the property
     * @return the sets the
     */
    @Nonnull
    public Collection<OWLAxiom> write(@Nonnull OWLObjectPropertyExpression property) {try{__CLR4_5_2k0lk0llvicmbvr.R.inc(26302);
        __CLR4_5_2k0lk0llvicmbvr.R.inc(26303);List<OWLAxiom> axioms = new ArrayList<>();
        __CLR4_5_2k0lk0llvicmbvr.R.inc(26304);axioms.addAll(writeEntityStart(OBJECT_PROPERTY, property));
        __CLR4_5_2k0lk0llvicmbvr.R.inc(26305);if ((((!isFiltered(AxiomType.SUB_OBJECT_PROPERTY))&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26306)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26307)==0&false))) {{
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26308);for (OWLOntology ontology : ontologies) {{
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26309);SectionMap<Object, OWLAxiom> properties = new SectionMap<>();
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26310);for (OWLSubObjectPropertyOfAxiom ax : sortedCollection(ontology
                    .getObjectSubPropertyAxiomsForSubProperty(property))) {{
                    __CLR4_5_2k0lk0llvicmbvr.R.inc(26311);if ((((isDisplayed(ax))&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26312)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26313)==0&false))) {{
                        __CLR4_5_2k0lk0llvicmbvr.R.inc(26314);properties.put(ax.getSuperProperty(), ax);
                        __CLR4_5_2k0lk0llvicmbvr.R.inc(26315);axioms.add(ax);
                    }
                }}
                }__CLR4_5_2k0lk0llvicmbvr.R.inc(26316);writeSection(SUB_PROPERTY_OF, properties, ",", true, ontology);
            }
            }__CLR4_5_2k0lk0llvicmbvr.R.inc(26317);if ((((renderExtensions)&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26318)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26319)==0&false))) {{
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26320);for (OWLOntology ontology : ontologies) {{
                    __CLR4_5_2k0lk0llvicmbvr.R.inc(26321);SectionMap<Object, OWLAxiom> properties = new SectionMap<>();
                    __CLR4_5_2k0lk0llvicmbvr.R.inc(26322);for (OWLSubObjectPropertyOfAxiom ax : sortedCollection(ontology
                        .getObjectSubPropertyAxiomsForSuperProperty(
                            property))) {{
                        __CLR4_5_2k0lk0llvicmbvr.R.inc(26323);if ((((isDisplayed(ax))&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26324)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26325)==0&false))) {{
                            __CLR4_5_2k0lk0llvicmbvr.R.inc(26326);properties.put(ax.getSubProperty(), ax);
                            __CLR4_5_2k0lk0llvicmbvr.R.inc(26327);axioms.add(ax);
                        }
                    }}
                    }__CLR4_5_2k0lk0llvicmbvr.R.inc(26328);writeSection(SUPER_PROPERTY_OF, properties, ",", true, ontology);
                }
            }}
        }}
        }__CLR4_5_2k0lk0llvicmbvr.R.inc(26329);if ((((!isFiltered(AxiomType.EQUIVALENT_OBJECT_PROPERTIES))&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26330)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26331)==0&false))) {{
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26332);for (OWLOntology ontology : ontologies) {{
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26333);SectionMap<Object, OWLAxiom> properties = new SectionMap<>();
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26334);for (OWLEquivalentObjectPropertiesAxiom ax : sortedCollection(ontology
                    .getEquivalentObjectPropertiesAxioms(property))) {{
                    __CLR4_5_2k0lk0llvicmbvr.R.inc(26335);if ((((isDisplayed(ax) && ax.getProperties().size() == 2)&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26336)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26337)==0&false))) {{
                        __CLR4_5_2k0lk0llvicmbvr.R.inc(26338);Collection<OWLObjectPropertyExpression> props = sortedCollection(ax.getPropertiesMinus(
                            property));
                        __CLR4_5_2k0lk0llvicmbvr.R.inc(26339);properties.put(props.iterator().next(), ax);
                        __CLR4_5_2k0lk0llvicmbvr.R.inc(26340);axioms.add(ax);
                    }
                }}
                }__CLR4_5_2k0lk0llvicmbvr.R.inc(26341);writeSection(EQUIVALENT_TO, properties, ",", true, ontology);
            }
        }}
        }__CLR4_5_2k0lk0llvicmbvr.R.inc(26342);if ((((!isFiltered(AxiomType.DISJOINT_OBJECT_PROPERTIES))&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26343)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26344)==0&false))) {{
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26345);for (OWLOntology ontology : ontologies) {{
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26346);SectionMap<Object, OWLAxiom> properties = new SectionMap<>();
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26347);for (OWLDisjointObjectPropertiesAxiom ax : sortedCollection(ontology.getDisjointObjectPropertiesAxioms(
                    property))) {{
                    __CLR4_5_2k0lk0llvicmbvr.R.inc(26348);if ((((ax.getProperties().size() == 2 && isDisplayed(ax))&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26349)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26350)==0&false))) {{
                        __CLR4_5_2k0lk0llvicmbvr.R.inc(26351);Collection<OWLObjectPropertyExpression> props = sortedCollection(ax.getPropertiesMinus(
                            property));
                        __CLR4_5_2k0lk0llvicmbvr.R.inc(26352);properties.put(props.iterator().next(), ax);
                        __CLR4_5_2k0lk0llvicmbvr.R.inc(26353);axioms.add(ax);
                    }
                }}
                }__CLR4_5_2k0lk0llvicmbvr.R.inc(26354);writeSection(DISJOINT_WITH, properties, ",", true, ontology);
            }
        }}
        }__CLR4_5_2k0lk0llvicmbvr.R.inc(26355);if ((((!isFiltered(AxiomType.SUB_PROPERTY_CHAIN_OF))&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26356)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26357)==0&false))) {{
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26358);for (OWLOntology ontology : ontologies) {{
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26359);for (OWLSubPropertyChainOfAxiom ax : sortedCollection(ontology.getAxioms(
                    AxiomType.SUB_PROPERTY_CHAIN_OF))) {{
                    __CLR4_5_2k0lk0llvicmbvr.R.inc(26360);if ((((ax.getSuperProperty().equals(property) && isDisplayed(ax))&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26361)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26362)==0&false))) {{
                        __CLR4_5_2k0lk0llvicmbvr.R.inc(26363);SectionMap<Object, OWLAxiom> map = new SectionMap<>();
                        __CLR4_5_2k0lk0llvicmbvr.R.inc(26364);map.put(ax.getPropertyChain(), ax);
                        __CLR4_5_2k0lk0llvicmbvr.R.inc(26365);writeSection(SUB_PROPERTY_CHAIN, map, " o ", false, ontology);
                        __CLR4_5_2k0lk0llvicmbvr.R.inc(26366);axioms.add(ax);
                    }
                }}
            }}
        }}
        }__CLR4_5_2k0lk0llvicmbvr.R.inc(26367);for (OWLOntology ontology : ontologies) {{
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26368);SectionMap<Object, OWLAxiom> characteristics = new SectionMap<>();
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26369);if ((((!isFiltered(AxiomType.FUNCTIONAL_OBJECT_PROPERTY))&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26370)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26371)==0&false))) {{
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26372);for (OWLFunctionalObjectPropertyAxiom ax : sortedCollection(ontology.getFunctionalObjectPropertyAxioms(
                    property))) {{
                    __CLR4_5_2k0lk0llvicmbvr.R.inc(26373);if ((((isDisplayed(ax))&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26374)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26375)==0&false))) {{
                        __CLR4_5_2k0lk0llvicmbvr.R.inc(26376);characteristics.put(FUNCTIONAL.toString(), ax);
                        __CLR4_5_2k0lk0llvicmbvr.R.inc(26377);axioms.add(ax);
                    }
                }}
            }}
            }__CLR4_5_2k0lk0llvicmbvr.R.inc(26378);if ((((!isFiltered(AxiomType.INVERSE_FUNCTIONAL_OBJECT_PROPERTY))&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26379)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26380)==0&false))) {{
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26381);for (OWLAxiom ax : sortedCollection(ontology.getInverseFunctionalObjectPropertyAxioms(property))) {{
                    __CLR4_5_2k0lk0llvicmbvr.R.inc(26382);if ((((isDisplayed(ax))&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26383)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26384)==0&false))) {{
                        __CLR4_5_2k0lk0llvicmbvr.R.inc(26385);characteristics.put(INVERSE_FUNCTIONAL.toString(), ax);
                        __CLR4_5_2k0lk0llvicmbvr.R.inc(26386);axioms.add(ax);
                    }
                }}
            }}
            }__CLR4_5_2k0lk0llvicmbvr.R.inc(26387);if ((((!isFiltered(AxiomType.SYMMETRIC_OBJECT_PROPERTY))&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26388)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26389)==0&false))) {{
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26390);for (OWLAxiom ax : sortedCollection(ontology.getSymmetricObjectPropertyAxioms(property))) {{
                    __CLR4_5_2k0lk0llvicmbvr.R.inc(26391);if ((((isDisplayed(ax))&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26392)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26393)==0&false))) {{
                        __CLR4_5_2k0lk0llvicmbvr.R.inc(26394);characteristics.put(SYMMETRIC.toString(), ax);
                        __CLR4_5_2k0lk0llvicmbvr.R.inc(26395);axioms.add(ax);
                    }
                }}
            }}
            }__CLR4_5_2k0lk0llvicmbvr.R.inc(26396);if ((((!isFiltered(AxiomType.TRANSITIVE_OBJECT_PROPERTY))&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26397)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26398)==0&false))) {{
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26399);for (OWLAxiom ax : sortedCollection(ontology.getTransitiveObjectPropertyAxioms(property))) {{
                    __CLR4_5_2k0lk0llvicmbvr.R.inc(26400);if ((((isDisplayed(ax))&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26401)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26402)==0&false))) {{
                        __CLR4_5_2k0lk0llvicmbvr.R.inc(26403);characteristics.put(TRANSITIVE.toString(), ax);
                        __CLR4_5_2k0lk0llvicmbvr.R.inc(26404);axioms.add(ax);
                    }
                }}
            }}
            }__CLR4_5_2k0lk0llvicmbvr.R.inc(26405);if ((((!isFiltered(AxiomType.REFLEXIVE_OBJECT_PROPERTY))&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26406)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26407)==0&false))) {{
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26408);for (OWLAxiom ax : sortedCollection(ontology.getReflexiveObjectPropertyAxioms(property))) {{
                    __CLR4_5_2k0lk0llvicmbvr.R.inc(26409);if ((((isDisplayed(ax))&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26410)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26411)==0&false))) {{
                        __CLR4_5_2k0lk0llvicmbvr.R.inc(26412);characteristics.put(REFLEXIVE.toString(), ax);
                        __CLR4_5_2k0lk0llvicmbvr.R.inc(26413);axioms.add(ax);
                    }
                }}
            }}
            }__CLR4_5_2k0lk0llvicmbvr.R.inc(26414);if ((((!isFiltered(AxiomType.IRREFLEXIVE_OBJECT_PROPERTY))&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26415)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26416)==0&false))) {{
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26417);for (OWLAxiom ax : sortedCollection(ontology.getIrreflexiveObjectPropertyAxioms(property))) {{
                    __CLR4_5_2k0lk0llvicmbvr.R.inc(26418);if ((((isDisplayed(ax))&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26419)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26420)==0&false))) {{
                        __CLR4_5_2k0lk0llvicmbvr.R.inc(26421);characteristics.put(IRREFLEXIVE.toString(), ax);
                        __CLR4_5_2k0lk0llvicmbvr.R.inc(26422);axioms.add(ax);
                    }
                }}
            }}
            }__CLR4_5_2k0lk0llvicmbvr.R.inc(26423);if ((((!isFiltered(AxiomType.ASYMMETRIC_OBJECT_PROPERTY))&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26424)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26425)==0&false))) {{
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26426);for (OWLAxiom ax : sortedCollection(ontology.getAsymmetricObjectPropertyAxioms(property))) {{
                    __CLR4_5_2k0lk0llvicmbvr.R.inc(26427);if ((((isDisplayed(ax))&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26428)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26429)==0&false))) {{
                        __CLR4_5_2k0lk0llvicmbvr.R.inc(26430);characteristics.put(ASYMMETRIC.toString(), ax);
                        __CLR4_5_2k0lk0llvicmbvr.R.inc(26431);axioms.add(ax);
                    }
                }}
            }}
            }__CLR4_5_2k0lk0llvicmbvr.R.inc(26432);writeSection(CHARACTERISTICS, characteristics, ",", true, ontology);
        }
        }__CLR4_5_2k0lk0llvicmbvr.R.inc(26433);if ((((!isFiltered(AxiomType.OBJECT_PROPERTY_DOMAIN))&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26434)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26435)==0&false))) {{
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26436);for (OWLOntology ontology : ontologies) {{
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26437);SectionMap<Object, OWLAxiom> expressions = new SectionMap<>();
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26438);for (OWLObjectPropertyDomainAxiom ax : sortedCollection(ontology.getObjectPropertyDomainAxioms(
                    property))) {{
                    __CLR4_5_2k0lk0llvicmbvr.R.inc(26439);if ((((isDisplayed(ax))&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26440)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26441)==0&false))) {{
                        __CLR4_5_2k0lk0llvicmbvr.R.inc(26442);expressions.put(ax.getDomain(), ax);
                        __CLR4_5_2k0lk0llvicmbvr.R.inc(26443);axioms.add(ax);
                    }
                }}
                }__CLR4_5_2k0lk0llvicmbvr.R.inc(26444);writeSection(DOMAIN, expressions, ",", true, ontology);
            }
        }}
        }__CLR4_5_2k0lk0llvicmbvr.R.inc(26445);if ((((!isFiltered(AxiomType.OBJECT_PROPERTY_RANGE))&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26446)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26447)==0&false))) {{
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26448);for (OWLOntology ontology : ontologies) {{
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26449);SectionMap<Object, OWLAxiom> expressions = new SectionMap<>();
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26450);for (OWLObjectPropertyRangeAxiom ax : sortedCollection(ontology.getObjectPropertyRangeAxioms(
                    property))) {{
                    __CLR4_5_2k0lk0llvicmbvr.R.inc(26451);if ((((isDisplayed(ax))&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26452)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26453)==0&false))) {{
                        __CLR4_5_2k0lk0llvicmbvr.R.inc(26454);expressions.put(ax.getRange(), ax);
                        __CLR4_5_2k0lk0llvicmbvr.R.inc(26455);axioms.add(ax);
                    }
                }}
                }__CLR4_5_2k0lk0llvicmbvr.R.inc(26456);writeSection(RANGE, expressions, ",", true, ontology);
            }
        }}
        }__CLR4_5_2k0lk0llvicmbvr.R.inc(26457);if ((((!isFiltered(AxiomType.INVERSE_OBJECT_PROPERTIES))&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26458)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26459)==0&false))) {{
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26460);for (OWLOntology ontology : ontologies) {{
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26461);Collection<OWLObjectPropertyExpression> properties = sortedCollection();
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26462);for (OWLInverseObjectPropertiesAxiom ax : sortedCollection(ontology.getInverseObjectPropertyAxioms(
                    property))) {{
                    __CLR4_5_2k0lk0llvicmbvr.R.inc(26463);if ((((isDisplayed(ax))&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26464)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26465)==0&false))) {{
                        __CLR4_5_2k0lk0llvicmbvr.R.inc(26466);if ((((ax.getFirstProperty().equals(property))&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26467)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26468)==0&false))) {{
                            __CLR4_5_2k0lk0llvicmbvr.R.inc(26469);properties.add(ax.getSecondProperty());
                        } }else {{
                            __CLR4_5_2k0lk0llvicmbvr.R.inc(26470);properties.add(ax.getFirstProperty());
                        }
                        }__CLR4_5_2k0lk0llvicmbvr.R.inc(26471);axioms.add(ax);
                    }
                }}
                }__CLR4_5_2k0lk0llvicmbvr.R.inc(26472);writeSection(INVERSE_OF, properties, ",", true, ontology);
            }
        }}
        }__CLR4_5_2k0lk0llvicmbvr.R.inc(26473);if ((((!isFiltered(AxiomType.SWRL_RULE))&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26474)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26475)==0&false))) {{
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26476);for (OWLOntology ontology : ontologies) {{
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26477);Collection<OWLObject> rules = sortedCollection();
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26478);for (SWRLRule rule : sortedCollection(ontology.getAxioms(AxiomType.SWRL_RULE))) {{
                    __CLR4_5_2k0lk0llvicmbvr.R.inc(26479);if ((((isDisplayed(rule))&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26480)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26481)==0&false))) {{
                        __CLR4_5_2k0lk0llvicmbvr.R.inc(26482);for (SWRLAtom atom : rule.getHead()) {{
                            __CLR4_5_2k0lk0llvicmbvr.R.inc(26483);if ((((atom.getPredicate().equals(property))&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26484)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26485)==0&false))) {{
                                __CLR4_5_2k0lk0llvicmbvr.R.inc(26486);rules.add(rule);
                                __CLR4_5_2k0lk0llvicmbvr.R.inc(26487);writeSection(RULE, rules, ",", true, ontology);
                                __CLR4_5_2k0lk0llvicmbvr.R.inc(26488);break;
                            }
                        }}
                    }}
                }}
            }}
        }}
        }__CLR4_5_2k0lk0llvicmbvr.R.inc(26489);writeEntitySectionEnd(OBJECT_PROPERTY.toString());
        __CLR4_5_2k0lk0llvicmbvr.R.inc(26490);return axioms;
    }finally{__CLR4_5_2k0lk0llvicmbvr.R.flushNeeded();}}

    /**
     * @param property
     *        the property
     * @return the sets the
     */
    @Nonnull
    public Collection<OWLAxiom> write(@Nonnull OWLDataProperty property) {try{__CLR4_5_2k0lk0llvicmbvr.R.inc(26491);
        __CLR4_5_2k0lk0llvicmbvr.R.inc(26492);List<OWLAxiom> axioms = new ArrayList<>();
        __CLR4_5_2k0lk0llvicmbvr.R.inc(26493);axioms.addAll(writeEntityStart(DATA_PROPERTY, property));
        __CLR4_5_2k0lk0llvicmbvr.R.inc(26494);if ((((!isFiltered(AxiomType.FUNCTIONAL_DATA_PROPERTY))&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26495)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26496)==0&false))) {{
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26497);for (OWLOntology ontology : ontologies) {{
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26498);SectionMap<Object, OWLAxiom> characteristics = new SectionMap<>();
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26499);for (OWLAxiom ax : sortedCollection(ontology.getFunctionalDataPropertyAxioms(property))) {{
                    __CLR4_5_2k0lk0llvicmbvr.R.inc(26500);if ((((isDisplayed(ax))&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26501)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26502)==0&false))) {{
                        __CLR4_5_2k0lk0llvicmbvr.R.inc(26503);characteristics.put(FUNCTIONAL.toString(), ax);
                        __CLR4_5_2k0lk0llvicmbvr.R.inc(26504);axioms.add(ax);
                    }
                }}
                }__CLR4_5_2k0lk0llvicmbvr.R.inc(26505);writeSection(CHARACTERISTICS, characteristics, ",", true, ontology);
            }
        }}
        }__CLR4_5_2k0lk0llvicmbvr.R.inc(26506);if ((((!isFiltered(AxiomType.DATA_PROPERTY_DOMAIN))&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26507)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26508)==0&false))) {{
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26509);for (OWLOntology ontology : ontologies) {{
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26510);SectionMap<Object, OWLAxiom> domains = new SectionMap<>();
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26511);for (OWLDataPropertyDomainAxiom ax : sortedCollection(ontology.getDataPropertyDomainAxioms(property))) {{
                    __CLR4_5_2k0lk0llvicmbvr.R.inc(26512);if ((((isDisplayed(ax))&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26513)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26514)==0&false))) {{
                        __CLR4_5_2k0lk0llvicmbvr.R.inc(26515);domains.put(ax.getDomain(), ax);
                        __CLR4_5_2k0lk0llvicmbvr.R.inc(26516);axioms.add(ax);
                    }
                }}
                }__CLR4_5_2k0lk0llvicmbvr.R.inc(26517);writeSection(DOMAIN, domains, ",", true, ontology);
            }
        }}
        }__CLR4_5_2k0lk0llvicmbvr.R.inc(26518);if ((((!isFiltered(AxiomType.DATA_PROPERTY_RANGE))&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26519)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26520)==0&false))) {{
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26521);for (OWLOntology ontology : ontologies) {{
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26522);SectionMap<Object, OWLAxiom> ranges = new SectionMap<>();
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26523);for (OWLDataPropertyRangeAxiom ax : sortedCollection(ontology.getDataPropertyRangeAxioms(property))) {{
                    __CLR4_5_2k0lk0llvicmbvr.R.inc(26524);if ((((isDisplayed(ax))&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26525)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26526)==0&false))) {{
                        __CLR4_5_2k0lk0llvicmbvr.R.inc(26527);ranges.put(ax.getRange(), ax);
                        __CLR4_5_2k0lk0llvicmbvr.R.inc(26528);axioms.add(ax);
                    }
                }}
                }__CLR4_5_2k0lk0llvicmbvr.R.inc(26529);writeSection(RANGE, ranges, ",", true, ontology);
            }
        }}
        }__CLR4_5_2k0lk0llvicmbvr.R.inc(26530);if ((((!isFiltered(AxiomType.SUB_DATA_PROPERTY))&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26531)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26532)==0&false))) {{
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26533);for (OWLOntology ontology : ontologies) {{
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26534);SectionMap<Object, OWLAxiom> supers = new SectionMap<>();
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26535);for (OWLSubDataPropertyOfAxiom ax : sortedCollection(ontology.getDataSubPropertyAxiomsForSubProperty(
                    property))) {{
                    __CLR4_5_2k0lk0llvicmbvr.R.inc(26536);if ((((isDisplayed(ax))&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26537)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26538)==0&false))) {{
                        __CLR4_5_2k0lk0llvicmbvr.R.inc(26539);supers.put(ax.getSuperProperty(), ax);
                        __CLR4_5_2k0lk0llvicmbvr.R.inc(26540);axioms.add(ax);
                    }
                }}
                }__CLR4_5_2k0lk0llvicmbvr.R.inc(26541);writeSection(SUB_PROPERTY_OF, supers, ",", true, ontology);
            }
        }}
        }__CLR4_5_2k0lk0llvicmbvr.R.inc(26542);if ((((!isFiltered(AxiomType.EQUIVALENT_DATA_PROPERTIES))&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26543)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26544)==0&false))) {{
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26545);for (OWLOntology ontology : ontologies) {{
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26546);SectionMap<Object, OWLAxiom> props = new SectionMap<>();
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26547);for (OWLEquivalentDataPropertiesAxiom ax : sortedCollection(ontology.getEquivalentDataPropertiesAxioms(
                    property))) {{
                    __CLR4_5_2k0lk0llvicmbvr.R.inc(26548);if ((((isDisplayed(ax) && ax.getProperties().size() == 2)&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26549)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26550)==0&false))) {{
                        __CLR4_5_2k0lk0llvicmbvr.R.inc(26551);props.put(ax.getPropertiesMinus(property).iterator().next(), ax);
                        __CLR4_5_2k0lk0llvicmbvr.R.inc(26552);axioms.add(ax);
                    }
                }}
                }__CLR4_5_2k0lk0llvicmbvr.R.inc(26553);writeSection(EQUIVALENT_TO, props, ",", true, ontology);
            }
        }}
        }__CLR4_5_2k0lk0llvicmbvr.R.inc(26554);if ((((!isFiltered(AxiomType.DISJOINT_DATA_PROPERTIES))&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26555)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26556)==0&false))) {{
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26557);for (OWLOntology ontology : ontologies) {{
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26558);SectionMap<Object, OWLAxiom> props = new SectionMap<>();
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26559);for (OWLDisjointDataPropertiesAxiom ax : sortedCollection(ontology.getDisjointDataPropertiesAxioms(
                    property))) {{
                    __CLR4_5_2k0lk0llvicmbvr.R.inc(26560);if ((((ax.getProperties().size() == 2 && isDisplayed(ax))&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26561)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26562)==0&false))) {{
                        __CLR4_5_2k0lk0llvicmbvr.R.inc(26563);props.put(ax.getPropertiesMinus(property).iterator().next(), ax);
                        __CLR4_5_2k0lk0llvicmbvr.R.inc(26564);axioms.add(ax);
                    }
                }}
                }__CLR4_5_2k0lk0llvicmbvr.R.inc(26565);props.remove(property);
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26566);writeSection(DISJOINT_WITH, props, ",", true, ontology);
            }
        }}
        }__CLR4_5_2k0lk0llvicmbvr.R.inc(26567);if ((((!isFiltered(AxiomType.SWRL_RULE))&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26568)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26569)==0&false))) {{
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26570);for (OWLOntology ontology : ontologies) {{
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26571);Collection<OWLAxiom> rules = new ArrayList<>();
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26572);for (SWRLRule rule : sortedCollection(ontology.getAxioms(AxiomType.SWRL_RULE))) {{
                    __CLR4_5_2k0lk0llvicmbvr.R.inc(26573);if ((((isDisplayed(rule))&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26574)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26575)==0&false))) {{
                        __CLR4_5_2k0lk0llvicmbvr.R.inc(26576);for (SWRLAtom atom : rule.getHead()) {{
                            __CLR4_5_2k0lk0llvicmbvr.R.inc(26577);if ((((atom.getPredicate().equals(property))&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26578)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26579)==0&false))) {{
                                __CLR4_5_2k0lk0llvicmbvr.R.inc(26580);writeSection(RULE, rules, "", true, ontology);
                                __CLR4_5_2k0lk0llvicmbvr.R.inc(26581);break;
                            }
                        }}
                    }}
                }}
            }}
        }}
        }__CLR4_5_2k0lk0llvicmbvr.R.inc(26582);writeEntitySectionEnd(DATA_PROPERTY.toString());
        __CLR4_5_2k0lk0llvicmbvr.R.inc(26583);return axioms;
    }finally{__CLR4_5_2k0lk0llvicmbvr.R.flushNeeded();}}

    /**
     * @param individual
     *        the individual
     * @return the sets the
     */
    @Nonnull
    public Collection<OWLAxiom> write(@Nonnull OWLIndividual individual) {try{__CLR4_5_2k0lk0llvicmbvr.R.inc(26584);
        __CLR4_5_2k0lk0llvicmbvr.R.inc(26585);List<OWLAxiom> axioms = new ArrayList<>();
        __CLR4_5_2k0lk0llvicmbvr.R.inc(26586);axioms.addAll(writeEntityStart(INDIVIDUAL, individual));
        __CLR4_5_2k0lk0llvicmbvr.R.inc(26587);if ((((!isFiltered(AxiomType.CLASS_ASSERTION))&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26588)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26589)==0&false))) {{
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26590);for (OWLOntology ontology : ontologies) {{
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26591);SectionMap<Object, OWLAxiom> expressions = new SectionMap<>();
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26592);for (OWLClassAssertionAxiom ax : sortedCollection(ontology.getClassAssertionAxioms(individual))) {{
                    __CLR4_5_2k0lk0llvicmbvr.R.inc(26593);if ((((isDisplayed(ax))&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26594)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26595)==0&false))) {{
                        __CLR4_5_2k0lk0llvicmbvr.R.inc(26596);expressions.put(ax.getClassExpression(), ax);
                        __CLR4_5_2k0lk0llvicmbvr.R.inc(26597);axioms.add(ax);
                    }
                }}
                }__CLR4_5_2k0lk0llvicmbvr.R.inc(26598);writeSection(TYPES, expressions, ",", true, ontology);
            }
        }}
        }__CLR4_5_2k0lk0llvicmbvr.R.inc(26599);for (OWLOntology ontology : ontologies) {{
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26600);Collection<OWLPropertyAssertionAxiom<?, ?>> assertions = sortedCollection();
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26601);assertions.addAll(ontology.getObjectPropertyAssertionAxioms(individual));
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26602);assertions.addAll(ontology.getNegativeObjectPropertyAssertionAxioms(individual));
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26603);assertions.addAll(ontology.getDataPropertyAssertionAxioms(individual));
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26604);assertions.addAll(ontology.getNegativeDataPropertyAssertionAxioms(individual));
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26605);if ((((!assertions.isEmpty())&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26606)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26607)==0&false))) {{
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26608);fireSectionRenderingPrepared(FACTS.toString());
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26609);writeSection(FACTS);
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26610);writeSpace();
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26611);writeOntologiesList(ontology);
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26612);incrementTab(1);
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26613);writeNewLine();
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26614);fireSectionRenderingStarted(FACTS.toString());
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26615);for (Iterator<OWLPropertyAssertionAxiom<?, ?>> it = assertions.iterator(); (((it.hasNext())&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26616)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26617)==0&false));) {{
                    __CLR4_5_2k0lk0llvicmbvr.R.inc(26618);OWLPropertyAssertionAxiom<?, ?> ax = it.next();
                    __CLR4_5_2k0lk0llvicmbvr.R.inc(26619);fireSectionItemPrepared(FACTS.toString());
                    __CLR4_5_2k0lk0llvicmbvr.R.inc(26620);Set<OWLAnnotation> annos = ax.getAnnotations();
                    __CLR4_5_2k0lk0llvicmbvr.R.inc(26621);if ((((!annos.isEmpty())&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26622)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26623)==0&false))) {{
                        __CLR4_5_2k0lk0llvicmbvr.R.inc(26624);writeAnnotations(annos);
                        __CLR4_5_2k0lk0llvicmbvr.R.inc(26625);pushTab(getIndent() + 1);
                    }
                    }__CLR4_5_2k0lk0llvicmbvr.R.inc(26626);if ((((ax instanceof OWLNegativeDataPropertyAssertionAxiom
                        || ax instanceof OWLNegativeObjectPropertyAssertionAxiom)&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26627)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26628)==0&false))) {{
                        __CLR4_5_2k0lk0llvicmbvr.R.inc(26629);write(NOT);
                        __CLR4_5_2k0lk0llvicmbvr.R.inc(26630);writeSpace();
                    }
                    }__CLR4_5_2k0lk0llvicmbvr.R.inc(26631);ax.getProperty().accept(this);
                    __CLR4_5_2k0lk0llvicmbvr.R.inc(26632);writeSpace();
                    __CLR4_5_2k0lk0llvicmbvr.R.inc(26633);writeSpace();
                    __CLR4_5_2k0lk0llvicmbvr.R.inc(26634);ax.getObject().accept(this);
                    __CLR4_5_2k0lk0llvicmbvr.R.inc(26635);if ((((!annos.isEmpty())&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26636)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26637)==0&false))) {{
                        __CLR4_5_2k0lk0llvicmbvr.R.inc(26638);popTab();
                    }
                    }__CLR4_5_2k0lk0llvicmbvr.R.inc(26639);fireSectionItemFinished(FACTS.toString());
                    __CLR4_5_2k0lk0llvicmbvr.R.inc(26640);if ((((it.hasNext())&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26641)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26642)==0&false))) {{
                        __CLR4_5_2k0lk0llvicmbvr.R.inc(26643);write(",");
                        __CLR4_5_2k0lk0llvicmbvr.R.inc(26644);writeNewLine();
                    }
                }}
                }__CLR4_5_2k0lk0llvicmbvr.R.inc(26645);popTab();
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26646);writeNewLine();
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26647);writeNewLine();
            }
        }}
        }__CLR4_5_2k0lk0llvicmbvr.R.inc(26648);if ((((!isFiltered(AxiomType.SAME_INDIVIDUAL))&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26649)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26650)==0&false))) {{
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26651);for (OWLOntology ontology : ontologies) {{
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26652);Collection<OWLIndividual> inds = sortedCollection();
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26653);for (OWLSameIndividualAxiom ax : ontology.getSameIndividualAxioms(individual)) {{
                    __CLR4_5_2k0lk0llvicmbvr.R.inc(26654);if ((((isDisplayed(ax))&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26655)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26656)==0&false))) {{
                        __CLR4_5_2k0lk0llvicmbvr.R.inc(26657);inds.addAll(ax.getIndividuals());
                        __CLR4_5_2k0lk0llvicmbvr.R.inc(26658);axioms.add(ax);
                    }
                }}
                }__CLR4_5_2k0lk0llvicmbvr.R.inc(26659);inds.remove(individual);
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26660);writeSection(SAME_AS, inds, ",", true, ontology);
            }
        }}
        }__CLR4_5_2k0lk0llvicmbvr.R.inc(26661);if ((((!isFiltered(AxiomType.DIFFERENT_INDIVIDUALS))&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26662)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26663)==0&false))) {{
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26664);for (OWLOntology ontology : ontologies) {{
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26665);Collection<OWLIndividual> inds = sortedCollection();
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26666);Collection<OWLDifferentIndividualsAxiom> nary = sortedCollection();
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26667);for (OWLDifferentIndividualsAxiom ax : ontology.getDifferentIndividualAxioms(individual)) {{
                    __CLR4_5_2k0lk0llvicmbvr.R.inc(26668);if ((((ax.getIndividuals().size() == 2 && isDisplayed(ax))&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26669)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26670)==0&false))) {{
                        __CLR4_5_2k0lk0llvicmbvr.R.inc(26671);inds.addAll(ax.getIndividuals());
                        __CLR4_5_2k0lk0llvicmbvr.R.inc(26672);axioms.add(ax);
                    } }else {{
                        __CLR4_5_2k0lk0llvicmbvr.R.inc(26673);nary.add(ax);
                    }
                }}
                }__CLR4_5_2k0lk0llvicmbvr.R.inc(26674);inds.remove(individual);
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26675);writeSection(DIFFERENT_FROM, inds, ",", true, ontology);
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26676);if ((((renderExtensions)&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26677)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26678)==0&false))) {{
                    __CLR4_5_2k0lk0llvicmbvr.R.inc(26679);for (OWLDifferentIndividualsAxiom ax : nary) {{
                        __CLR4_5_2k0lk0llvicmbvr.R.inc(26680);writeSection(DIFFERENT_INDIVIDUALS, ax.getIndividuals(), ", ", false, ontology);
                    }
                }}
            }}
        }}
        }__CLR4_5_2k0lk0llvicmbvr.R.inc(26681);writeEntitySectionEnd(INDIVIDUAL.toString());
        __CLR4_5_2k0lk0llvicmbvr.R.inc(26682);return axioms;
    }finally{__CLR4_5_2k0lk0llvicmbvr.R.flushNeeded();}}

    /**
     * @param datatype
     *        the datatype
     * @return the sets the
     */
    @Nonnull
    public Collection<OWLAxiom> write(@Nonnull OWLDatatype datatype) {try{__CLR4_5_2k0lk0llvicmbvr.R.inc(26683);
        __CLR4_5_2k0lk0llvicmbvr.R.inc(26684);List<OWLAxiom> axioms = new ArrayList<>();
        __CLR4_5_2k0lk0llvicmbvr.R.inc(26685);axioms.addAll(writeEntityStart(DATATYPE, datatype));
        __CLR4_5_2k0lk0llvicmbvr.R.inc(26686);if ((((!isFiltered(AxiomType.DATATYPE_DEFINITION))&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26687)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26688)==0&false))) {{
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26689);for (OWLOntology ontology : ontologies) {{
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26690);Collection<OWLDataRange> dataRanges = sortedCollection();
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26691);for (OWLDatatypeDefinitionAxiom ax : ontology.getDatatypeDefinitions(datatype)) {{
                    __CLR4_5_2k0lk0llvicmbvr.R.inc(26692);if ((((isDisplayed(ax))&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26693)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26694)==0&false))) {{
                        __CLR4_5_2k0lk0llvicmbvr.R.inc(26695);axioms.add(ax);
                        __CLR4_5_2k0lk0llvicmbvr.R.inc(26696);dataRanges.add(ax.getDataRange());
                    }
                }}
                }__CLR4_5_2k0lk0llvicmbvr.R.inc(26697);writeSection(EQUIVALENT_TO, dataRanges, ",", true, ontology);
            }
        }}
        }__CLR4_5_2k0lk0llvicmbvr.R.inc(26698);writeEntitySectionEnd(DATATYPE.toString());
        __CLR4_5_2k0lk0llvicmbvr.R.inc(26699);return axioms;
    }finally{__CLR4_5_2k0lk0llvicmbvr.R.flushNeeded();}}

    /**
     * @param rule
     *        the rule
     * @return written axioms
     */
    @Nonnull
    public Collection<OWLAxiom> write(@Nonnull SWRLRule rule) {try{__CLR4_5_2k0lk0llvicmbvr.R.inc(26700);
        __CLR4_5_2k0lk0llvicmbvr.R.inc(26701);List<OWLAxiom> axioms = new ArrayList<>(1);
        __CLR4_5_2k0lk0llvicmbvr.R.inc(26702);for (OWLOntology ontology : ontologies) {{
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26703);if ((((ontology.containsAxiom(rule))&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26704)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26705)==0&false))) {{
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26706);writeSection(RULE, CollectionFactory.createSet(rule), "", true, ontology);
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26707);axioms.add(rule);
            }
        }}
        }__CLR4_5_2k0lk0llvicmbvr.R.inc(26708);return axioms;
    }finally{__CLR4_5_2k0lk0llvicmbvr.R.flushNeeded();}}

    /**
     * @param property
     *        the property
     * @return written axioms
     */
    @Nonnull
    public Collection<OWLAxiom> write(@Nonnull OWLAnnotationProperty property) {try{__CLR4_5_2k0lk0llvicmbvr.R.inc(26709);
        __CLR4_5_2k0lk0llvicmbvr.R.inc(26710);List<OWLAxiom> axioms = new ArrayList<>();
        __CLR4_5_2k0lk0llvicmbvr.R.inc(26711);axioms.addAll(writeEntityStart(ANNOTATION_PROPERTY, property));
        __CLR4_5_2k0lk0llvicmbvr.R.inc(26712);if ((((!isFiltered(AxiomType.SUB_ANNOTATION_PROPERTY_OF))&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26713)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26714)==0&false))) {{
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26715);for (OWLOntology ont : ontologies) {{
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26716);Collection<OWLAnnotationProperty> props = sortedCollection();
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26717);for (OWLSubAnnotationPropertyOfAxiom ax : ont.getSubAnnotationPropertyOfAxioms(property)) {{
                    __CLR4_5_2k0lk0llvicmbvr.R.inc(26718);if ((((isDisplayed(ax))&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26719)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26720)==0&false))) {{
                        __CLR4_5_2k0lk0llvicmbvr.R.inc(26721);props.add(ax.getSuperProperty());
                    }
                }}
                }__CLR4_5_2k0lk0llvicmbvr.R.inc(26722);writeSection(SUB_PROPERTY_OF, props, ",", true, ont);
            }
        }}
        }__CLR4_5_2k0lk0llvicmbvr.R.inc(26723);if ((((!isFiltered(AxiomType.ANNOTATION_PROPERTY_DOMAIN))&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26724)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26725)==0&false))) {{
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26726);for (OWLOntology ont : ontologies) {{
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26727);Collection<IRI> iris = sortedCollection();
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26728);for (OWLAnnotationPropertyDomainAxiom ax : ont.getAnnotationPropertyDomainAxioms(property)) {{
                    __CLR4_5_2k0lk0llvicmbvr.R.inc(26729);if ((((isDisplayed(ax))&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26730)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26731)==0&false))) {{
                        __CLR4_5_2k0lk0llvicmbvr.R.inc(26732);iris.add(ax.getDomain());
                    }
                }}
                }__CLR4_5_2k0lk0llvicmbvr.R.inc(26733);writeSection(DOMAIN, iris, ",", true, ont);
            }
        }}
        }__CLR4_5_2k0lk0llvicmbvr.R.inc(26734);if ((((!isFiltered(AxiomType.ANNOTATION_PROPERTY_RANGE))&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26735)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26736)==0&false))) {{
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26737);for (OWLOntology ont : ontologies) {{
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26738);Collection<IRI> iris = sortedCollection();
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26739);for (OWLAnnotationPropertyRangeAxiom ax : ont.getAnnotationPropertyRangeAxioms(property)) {{
                    __CLR4_5_2k0lk0llvicmbvr.R.inc(26740);if ((((isDisplayed(ax))&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26741)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26742)==0&false))) {{
                        __CLR4_5_2k0lk0llvicmbvr.R.inc(26743);iris.add(ax.getRange());
                    }
                }}
                }__CLR4_5_2k0lk0llvicmbvr.R.inc(26744);writeSection(RANGE, iris, ",", true, ont);
            }
        }}
        }__CLR4_5_2k0lk0llvicmbvr.R.inc(26745);writeEntitySectionEnd(ANNOTATION_PROPERTY.toString());
        __CLR4_5_2k0lk0llvicmbvr.R.inc(26746);return axioms;
    }finally{__CLR4_5_2k0lk0llvicmbvr.R.flushNeeded();}}

    /**
     * Write entity start.
     * 
     * @param keyword
     *        the keyword
     * @param entity
     *        the entity
     * @return written axioms
     */
    private Collection<OWLAnnotationAssertionAxiom> writeEntityStart(@Nonnull ManchesterOWLSyntax keyword,
        @Nonnull OWLObject entity) {try{__CLR4_5_2k0lk0llvicmbvr.R.inc(26747);
        __CLR4_5_2k0lk0llvicmbvr.R.inc(26748);event = new RendererEvent(this, entity);
        __CLR4_5_2k0lk0llvicmbvr.R.inc(26749);String kw = keyword.toString();
        __CLR4_5_2k0lk0llvicmbvr.R.inc(26750);fireFrameRenderingPrepared(kw);
        __CLR4_5_2k0lk0llvicmbvr.R.inc(26751);writeSection(keyword);
        __CLR4_5_2k0lk0llvicmbvr.R.inc(26752);entity.accept(this);
        __CLR4_5_2k0lk0llvicmbvr.R.inc(26753);fireFrameRenderingStarted(kw);
        __CLR4_5_2k0lk0llvicmbvr.R.inc(26754);writeNewLine();
        __CLR4_5_2k0lk0llvicmbvr.R.inc(26755);incrementTab(4);
        __CLR4_5_2k0lk0llvicmbvr.R.inc(26756);writeNewLine();
        __CLR4_5_2k0lk0llvicmbvr.R.inc(26757);if ((((entity instanceof OWLEntity)&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26758)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26759)==0&false))) {{
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26760);return writeAnnotations(((OWLEntity) entity).getIRI());
        } }else {__CLR4_5_2k0lk0llvicmbvr.R.inc(26761);if ((((entity instanceof OWLAnonymousIndividual)&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26762)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26763)==0&false))) {{
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26764);return writeAnnotations((OWLAnonymousIndividual) entity);
        }
        }}__CLR4_5_2k0lk0llvicmbvr.R.inc(26765);return CollectionFactory.emptySet();
    }finally{__CLR4_5_2k0lk0llvicmbvr.R.flushNeeded();}}

    /**
     * Write annotations.
     * 
     * @param subject
     *        the subject
     * @return written axioms
     */
    @Nonnull
    public Collection<OWLAnnotationAssertionAxiom> writeAnnotations(@Nonnull OWLAnnotationSubject subject) {try{__CLR4_5_2k0lk0llvicmbvr.R.inc(26766);
        __CLR4_5_2k0lk0llvicmbvr.R.inc(26767);Collection<OWLAnnotationAssertionAxiom> axioms = sortedCollection();
        __CLR4_5_2k0lk0llvicmbvr.R.inc(26768);if ((((!isFiltered(AxiomType.ANNOTATION_ASSERTION))&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26769)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26770)==0&false))) {{
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26771);for (OWLOntology ontology : ontologies) {{
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26772);SectionMap<Object, OWLAxiom> sectionMap = new SectionMap<>();
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26773);for (OWLAnnotationAssertionAxiom ax : ontology.getAnnotationAssertionAxioms(subject)) {{
                    __CLR4_5_2k0lk0llvicmbvr.R.inc(26774);if ((((isDisplayed(ax))&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26775)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26776)==0&false))) {{
                        __CLR4_5_2k0lk0llvicmbvr.R.inc(26777);axioms.add(ax);
                        __CLR4_5_2k0lk0llvicmbvr.R.inc(26778);sectionMap.put(ax.getAnnotation(), ax);
                    }
                }}
                }__CLR4_5_2k0lk0llvicmbvr.R.inc(26779);writeSection(ANNOTATIONS, sectionMap, ",", true, ontology);
            }
        }}
        }__CLR4_5_2k0lk0llvicmbvr.R.inc(26780);return axioms;
    }finally{__CLR4_5_2k0lk0llvicmbvr.R.flushNeeded();}}

    /**
     * Write section.
     * 
     * @param keyword
     *        the keyword
     */
    public void writeSection(@Nonnull ManchesterOWLSyntax keyword) {try{__CLR4_5_2k0lk0llvicmbvr.R.inc(26781);
        __CLR4_5_2k0lk0llvicmbvr.R.inc(26782);write("", keyword, "");
        __CLR4_5_2k0lk0llvicmbvr.R.inc(26783);write(":");
        __CLR4_5_2k0lk0llvicmbvr.R.inc(26784);writeSpace();
    }finally{__CLR4_5_2k0lk0llvicmbvr.R.flushNeeded();}}

    private void writeSection(@Nonnull ManchesterOWLSyntax keyword, @Nonnull SectionMap<Object, OWLAxiom> content,
        String delimeter, boolean newline, @Nonnull OWLOntology... ontologiesList) {try{__CLR4_5_2k0lk0llvicmbvr.R.inc(26785);
        __CLR4_5_2k0lk0llvicmbvr.R.inc(26786);String sec = keyword.toString();
        __CLR4_5_2k0lk0llvicmbvr.R.inc(26787);if ((((content.isNotEmpty() || renderingDirector.renderEmptyFrameSection(keyword, ontologiesList))&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26788)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26789)==0&false))) {{
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26790);fireSectionRenderingPrepared(sec);
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26791);writeSection(keyword);
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26792);writeOntologiesList(ontologiesList);
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26793);incrementTab(4);
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26794);writeNewLine();
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26795);fireSectionRenderingStarted(sec);
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26796);for (Iterator<Object> it = content.getSectionObjects().iterator(); (((it.hasNext())&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26797)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26798)==0&false));) {{
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26799);Object obj = it.next();
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26800);Collection<Collection<OWLAnnotation>> annotationSets = content.getAnnotationsForSectionObject(obj);
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26801);for (Iterator<Collection<OWLAnnotation>> annosSetIt = annotationSets.iterator(); (((annosSetIt
                    .hasNext())&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26802)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26803)==0&false));) {{
                    __CLR4_5_2k0lk0llvicmbvr.R.inc(26804);Collection<OWLAnnotation> annos = annosSetIt.next();
                    __CLR4_5_2k0lk0llvicmbvr.R.inc(26805);fireSectionItemPrepared(sec);
                    __CLR4_5_2k0lk0llvicmbvr.R.inc(26806);if ((((!annos.isEmpty())&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26807)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26808)==0&false))) {{
                        __CLR4_5_2k0lk0llvicmbvr.R.inc(26809);incrementTab(4);
                        __CLR4_5_2k0lk0llvicmbvr.R.inc(26810);writeNewLine();
                        __CLR4_5_2k0lk0llvicmbvr.R.inc(26811);write(ManchesterOWLSyntax.ANNOTATIONS.toString());
                        __CLR4_5_2k0lk0llvicmbvr.R.inc(26812);write(": ");
                        __CLR4_5_2k0lk0llvicmbvr.R.inc(26813);pushTab(getIndent() + 1);
                        __CLR4_5_2k0lk0llvicmbvr.R.inc(26814);for (Iterator<OWLAnnotation> annoIt = annos.iterator(); (((annoIt.hasNext())&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26815)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26816)==0&false));) {{
                            __CLR4_5_2k0lk0llvicmbvr.R.inc(26817);annoIt.next().accept(this);
                            __CLR4_5_2k0lk0llvicmbvr.R.inc(26818);if ((((annoIt.hasNext())&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26819)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26820)==0&false))) {{
                                __CLR4_5_2k0lk0llvicmbvr.R.inc(26821);write(", ");
                                __CLR4_5_2k0lk0llvicmbvr.R.inc(26822);writeNewLine();
                            }
                        }}
                        }__CLR4_5_2k0lk0llvicmbvr.R.inc(26823);popTab();
                        __CLR4_5_2k0lk0llvicmbvr.R.inc(26824);popTab();
                        __CLR4_5_2k0lk0llvicmbvr.R.inc(26825);writeNewLine();
                    }
                    // Write actual object
                    }__CLR4_5_2k0lk0llvicmbvr.R.inc(26826);if ((((obj instanceof OWLObject)&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26827)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26828)==0&false))) {{
                        __CLR4_5_2k0lk0llvicmbvr.R.inc(26829);((OWLObject) obj).accept(this);
                    } }else {__CLR4_5_2k0lk0llvicmbvr.R.inc(26830);if ((((obj instanceof Collection)&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26831)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26832)==0&false))) {{
                        __CLR4_5_2k0lk0llvicmbvr.R.inc(26833);for (Iterator<?> listIt = ((Collection<?>) obj).iterator(); (((listIt.hasNext())&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26834)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26835)==0&false));) {{
                            __CLR4_5_2k0lk0llvicmbvr.R.inc(26836);Object o = listIt.next();
                            __CLR4_5_2k0lk0llvicmbvr.R.inc(26837);if ((((o instanceof OWLObject)&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26838)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26839)==0&false))) {{
                                __CLR4_5_2k0lk0llvicmbvr.R.inc(26840);((OWLObject) o).accept(this);
                            } }else {{
                                __CLR4_5_2k0lk0llvicmbvr.R.inc(26841);write(o.toString());
                            }
                            }__CLR4_5_2k0lk0llvicmbvr.R.inc(26842);if ((((listIt.hasNext())&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26843)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26844)==0&false))) {{
                                __CLR4_5_2k0lk0llvicmbvr.R.inc(26845);write(delimeter);
                                __CLR4_5_2k0lk0llvicmbvr.R.inc(26846);if ((((newline)&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26847)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26848)==0&false))) {{
                                    __CLR4_5_2k0lk0llvicmbvr.R.inc(26849);writeNewLine();
                                }
                            }}
                        }}
                    }} }else {{
                        __CLR4_5_2k0lk0llvicmbvr.R.inc(26850);write(obj.toString());
                    }
                    }}__CLR4_5_2k0lk0llvicmbvr.R.inc(26851);if ((((annosSetIt.hasNext())&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26852)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26853)==0&false))) {{
                        __CLR4_5_2k0lk0llvicmbvr.R.inc(26854);write(",");
                        __CLR4_5_2k0lk0llvicmbvr.R.inc(26855);writeNewLine();
                    }
                }}
                }__CLR4_5_2k0lk0llvicmbvr.R.inc(26856);if ((((it.hasNext())&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26857)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26858)==0&false))) {{
                    __CLR4_5_2k0lk0llvicmbvr.R.inc(26859);write(delimeter);
                    __CLR4_5_2k0lk0llvicmbvr.R.inc(26860);fireSectionItemFinished(sec);
                    __CLR4_5_2k0lk0llvicmbvr.R.inc(26861);if ((((newline)&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26862)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26863)==0&false))) {{
                        __CLR4_5_2k0lk0llvicmbvr.R.inc(26864);writeNewLine();
                    }
                }} }else {{
                    __CLR4_5_2k0lk0llvicmbvr.R.inc(26865);fireSectionItemFinished(sec);
                }
            }}
            }__CLR4_5_2k0lk0llvicmbvr.R.inc(26866);fireSectionRenderingFinished(sec);
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26867);popTab();
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26868);writeNewLine();
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26869);writeNewLine();
        }
    }}finally{__CLR4_5_2k0lk0llvicmbvr.R.flushNeeded();}}

    /**
     * Write section.
     * 
     * @param keyword
     *        the keyword
     * @param content
     *        the content
     * @param delimiter
     *        the delimiter
     * @param newline
     *        the newline
     * @param ontologiesList
     *        the ontologies list
     */
    public void writeSection(@Nonnull ManchesterOWLSyntax keyword, @Nonnull Collection<?> content, String delimiter,
        boolean newline, @Nonnull OWLOntology... ontologiesList) {try{__CLR4_5_2k0lk0llvicmbvr.R.inc(26870);
        __CLR4_5_2k0lk0llvicmbvr.R.inc(26871);String sec = keyword.toString();
        __CLR4_5_2k0lk0llvicmbvr.R.inc(26872);if ((((!content.isEmpty() || renderingDirector.renderEmptyFrameSection(keyword, ontologiesList))&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26873)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26874)==0&false))) {{
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26875);fireSectionRenderingPrepared(sec);
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26876);writeSection(keyword);
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26877);writeOntologiesList(ontologiesList);
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26878);incrementTab(4);
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26879);writeNewLine();
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26880);fireSectionRenderingStarted(sec);
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26881);for (Iterator<?> it = content.iterator(); (((it.hasNext())&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26882)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26883)==0&false));) {{
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26884);Object obj = it.next();
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26885);fireSectionItemPrepared(sec);
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26886);if ((((obj instanceof OWLObject)&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26887)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26888)==0&false))) {{
                    __CLR4_5_2k0lk0llvicmbvr.R.inc(26889);((OWLObject) obj).accept(this);
                } }else {{
                    __CLR4_5_2k0lk0llvicmbvr.R.inc(26890);write(obj.toString());
                }
                }__CLR4_5_2k0lk0llvicmbvr.R.inc(26891);if ((((it.hasNext())&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26892)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26893)==0&false))) {{
                    __CLR4_5_2k0lk0llvicmbvr.R.inc(26894);write(delimiter);
                    __CLR4_5_2k0lk0llvicmbvr.R.inc(26895);fireSectionItemFinished(sec);
                    __CLR4_5_2k0lk0llvicmbvr.R.inc(26896);if ((((newline)&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26897)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26898)==0&false))) {{
                        __CLR4_5_2k0lk0llvicmbvr.R.inc(26899);writeNewLine();
                    }
                }} }else {{
                    __CLR4_5_2k0lk0llvicmbvr.R.inc(26900);fireSectionItemFinished(sec);
                }
            }}
            }__CLR4_5_2k0lk0llvicmbvr.R.inc(26901);fireSectionRenderingFinished(sec);
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26902);popTab();
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26903);writeNewLine();
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26904);writeNewLine();
        }
    }}finally{__CLR4_5_2k0lk0llvicmbvr.R.flushNeeded();}}

    /**
     * Write comment.
     * 
     * @param comment
     *        the comment
     * @param placeOnNewline
     *        the place on newline
     */
    public void writeComment(String comment, boolean placeOnNewline) {try{__CLR4_5_2k0lk0llvicmbvr.R.inc(26905);
        __CLR4_5_2k0lk0llvicmbvr.R.inc(26906);writeComment("#", comment, placeOnNewline);
    }finally{__CLR4_5_2k0lk0llvicmbvr.R.flushNeeded();}}

    /**
     * @param commentDelim
     *        the comment delim
     * @param comment
     *        the comment
     * @param placeOnNewline
     *        the place on newline
     */
    public void writeComment(String commentDelim, String comment, boolean placeOnNewline) {try{__CLR4_5_2k0lk0llvicmbvr.R.inc(26907);
        __CLR4_5_2k0lk0llvicmbvr.R.inc(26908);if ((((placeOnNewline)&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26909)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26910)==0&false))) {{
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26911);writeNewLine();
        }
        }__CLR4_5_2k0lk0llvicmbvr.R.inc(26912);write(commentDelim);
        __CLR4_5_2k0lk0llvicmbvr.R.inc(26913);write(comment);
        __CLR4_5_2k0lk0llvicmbvr.R.inc(26914);writeNewLine();
    }finally{__CLR4_5_2k0lk0llvicmbvr.R.flushNeeded();}}

    /**
     * Write ontologies list.
     * 
     * @param ontologiesList
     *        the ontologies list
     */
    private void writeOntologiesList(@Nonnull OWLOntology... ontologiesList) {try{__CLR4_5_2k0lk0llvicmbvr.R.inc(26915);
        __CLR4_5_2k0lk0llvicmbvr.R.inc(26916);if ((((!renderExtensions)&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26917)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26918)==0&false))) {{
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26919);return;
        }
        }__CLR4_5_2k0lk0llvicmbvr.R.inc(26920);if ((((ontologiesList.length == 0)&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26921)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26922)==0&false))) {{
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26923);return;
        }
        }__CLR4_5_2k0lk0llvicmbvr.R.inc(26924);write("[in ");
        __CLR4_5_2k0lk0llvicmbvr.R.inc(26925);int count = 0;
        __CLR4_5_2k0lk0llvicmbvr.R.inc(26926);for (OWLOntology ont : ontologiesList) {{
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26927);write(shortFormProvider.getShortForm(ont));
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26928);count++;
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26929);if ((((count < ontologiesList.length)&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26930)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26931)==0&false))) {{
                __CLR4_5_2k0lk0llvicmbvr.R.inc(26932);write(", ");
            }
        }}
        }__CLR4_5_2k0lk0llvicmbvr.R.inc(26933);write("]");
    }finally{__CLR4_5_2k0lk0llvicmbvr.R.flushNeeded();}}

    /** The event. */
    private RendererEvent event;

    /**
     * Fire frame rendering prepared.
     * 
     * @param section
     *        the section
     */
    private void fireFrameRenderingPrepared(String section) {try{__CLR4_5_2k0lk0llvicmbvr.R.inc(26934);
        __CLR4_5_2k0lk0llvicmbvr.R.inc(26935);if ((((listeners.isEmpty())&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26936)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26937)==0&false))) {{
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26938);return;
        }
        }__CLR4_5_2k0lk0llvicmbvr.R.inc(26939);for (RendererListener listener : listeners) {{
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26940);listener.frameRenderingPrepared(section, event);
        }
    }}finally{__CLR4_5_2k0lk0llvicmbvr.R.flushNeeded();}}

    /**
     * Fire frame rendering started.
     * 
     * @param section
     *        the section
     */
    private void fireFrameRenderingStarted(String section) {try{__CLR4_5_2k0lk0llvicmbvr.R.inc(26941);
        __CLR4_5_2k0lk0llvicmbvr.R.inc(26942);if ((((listeners.isEmpty())&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26943)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26944)==0&false))) {{
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26945);return;
        }
        }__CLR4_5_2k0lk0llvicmbvr.R.inc(26946);for (RendererListener listener : listeners) {{
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26947);listener.frameRenderingStarted(section, event);
        }
    }}finally{__CLR4_5_2k0lk0llvicmbvr.R.flushNeeded();}}

    /**
     * Fire frame rendering finished.
     * 
     * @param section
     *        the section
     */
    private void fireFrameRenderingFinished(String section) {try{__CLR4_5_2k0lk0llvicmbvr.R.inc(26948);
        __CLR4_5_2k0lk0llvicmbvr.R.inc(26949);if ((((listeners.isEmpty())&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26950)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26951)==0&false))) {{
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26952);return;
        }
        }__CLR4_5_2k0lk0llvicmbvr.R.inc(26953);for (RendererListener listener : listeners) {{
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26954);listener.frameRenderingFinished(section, event);
        }
    }}finally{__CLR4_5_2k0lk0llvicmbvr.R.flushNeeded();}}

    /**
     * Fire section rendering prepared.
     * 
     * @param section
     *        the section
     */
    private void fireSectionRenderingPrepared(String section) {try{__CLR4_5_2k0lk0llvicmbvr.R.inc(26955);
        __CLR4_5_2k0lk0llvicmbvr.R.inc(26956);if ((((listeners.isEmpty())&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26957)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26958)==0&false))) {{
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26959);return;
        }
        }__CLR4_5_2k0lk0llvicmbvr.R.inc(26960);for (RendererListener listener : listeners) {{
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26961);listener.sectionRenderingPrepared(section, event);
        }
    }}finally{__CLR4_5_2k0lk0llvicmbvr.R.flushNeeded();}}

    /**
     * Fire section rendering started.
     * 
     * @param section
     *        the section
     */
    private void fireSectionRenderingStarted(String section) {try{__CLR4_5_2k0lk0llvicmbvr.R.inc(26962);
        __CLR4_5_2k0lk0llvicmbvr.R.inc(26963);if ((((listeners.isEmpty())&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26964)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26965)==0&false))) {{
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26966);return;
        }
        }__CLR4_5_2k0lk0llvicmbvr.R.inc(26967);for (RendererListener listener : listeners) {{
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26968);listener.sectionRenderingStarted(section, event);
        }
    }}finally{__CLR4_5_2k0lk0llvicmbvr.R.flushNeeded();}}

    /**
     * Fire section rendering finished.
     * 
     * @param section
     *        the section
     */
    private void fireSectionRenderingFinished(String section) {try{__CLR4_5_2k0lk0llvicmbvr.R.inc(26969);
        __CLR4_5_2k0lk0llvicmbvr.R.inc(26970);if ((((listeners.isEmpty())&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26971)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26972)==0&false))) {{
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26973);return;
        }
        }__CLR4_5_2k0lk0llvicmbvr.R.inc(26974);for (RendererListener listener : listeners) {{
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26975);listener.sectionRenderingFinished(section, event);
        }
    }}finally{__CLR4_5_2k0lk0llvicmbvr.R.flushNeeded();}}

    /**
     * Fire section item prepared.
     * 
     * @param section
     *        the section
     */
    private void fireSectionItemPrepared(String section) {try{__CLR4_5_2k0lk0llvicmbvr.R.inc(26976);
        __CLR4_5_2k0lk0llvicmbvr.R.inc(26977);if ((((listeners.isEmpty())&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26978)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26979)==0&false))) {{
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26980);return;
        }
        }__CLR4_5_2k0lk0llvicmbvr.R.inc(26981);for (RendererListener listener : listeners) {{
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26982);listener.sectionItemPrepared(section, event);
        }
    }}finally{__CLR4_5_2k0lk0llvicmbvr.R.flushNeeded();}}

    /**
     * Fire section item finished.
     * 
     * @param section
     *        the section
     */
    private void fireSectionItemFinished(String section) {try{__CLR4_5_2k0lk0llvicmbvr.R.inc(26983);
        __CLR4_5_2k0lk0llvicmbvr.R.inc(26984);if ((((listeners.isEmpty())&&(__CLR4_5_2k0lk0llvicmbvr.R.iget(26985)!=0|true))||(__CLR4_5_2k0lk0llvicmbvr.R.iget(26986)==0&false))) {{
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26987);return;
        }
        }__CLR4_5_2k0lk0llvicmbvr.R.inc(26988);for (RendererListener listener : listeners) {{
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26989);listener.sectionItemFinished(section, event);
        }
    }}finally{__CLR4_5_2k0lk0llvicmbvr.R.flushNeeded();}}

    /** The Class DefaultRenderingDirector. */
    private static class DefaultRenderingDirector implements RenderingDirector {

        /** Instantiates a new default rendering director. */
        DefaultRenderingDirector() {try{__CLR4_5_2k0lk0llvicmbvr.R.inc(26990);}finally{__CLR4_5_2k0lk0llvicmbvr.R.flushNeeded();}}

        @Override
        public boolean renderEmptyFrameSection(ManchesterOWLSyntax frameSectionKeyword, OWLOntology... ontologies) {try{__CLR4_5_2k0lk0llvicmbvr.R.inc(26991);
            __CLR4_5_2k0lk0llvicmbvr.R.inc(26992);return false;
        }finally{__CLR4_5_2k0lk0llvicmbvr.R.flushNeeded();}}
    }

    @Nonnull
    <E extends OWLObject> Collection<E> sortedCollection() {try{__CLR4_5_2k0lk0llvicmbvr.R.inc(26993);
        __CLR4_5_2k0lk0llvicmbvr.R.inc(26994);return new TreeSet<>(owlObjectComparator);
    }finally{__CLR4_5_2k0lk0llvicmbvr.R.flushNeeded();}}

    @Nonnull
    <E> Collection<E> sortedSet() {try{__CLR4_5_2k0lk0llvicmbvr.R.inc(26995);
        __CLR4_5_2k0lk0llvicmbvr.R.inc(26996);return new TreeSet<>();
    }finally{__CLR4_5_2k0lk0llvicmbvr.R.flushNeeded();}}

    @Nonnull
    <E> Collection<E> sortedSet(@Nonnull Collection<E> fromCollection) {try{__CLR4_5_2k0lk0llvicmbvr.R.inc(26997);
        __CLR4_5_2k0lk0llvicmbvr.R.inc(26998);Collection<E> set = sortedSet();
        __CLR4_5_2k0lk0llvicmbvr.R.inc(26999);set.addAll(fromCollection);
        __CLR4_5_2k0lk0llvicmbvr.R.inc(27000);return set;
    }finally{__CLR4_5_2k0lk0llvicmbvr.R.flushNeeded();}}

    @Nonnull
    <E extends OWLObject> Collection<E> sortedCollection(@Nonnull Collection<E> fromCollection) {try{__CLR4_5_2k0lk0llvicmbvr.R.inc(27001);
        __CLR4_5_2k0lk0llvicmbvr.R.inc(27002);Collection<E> set = sortedCollection();
        __CLR4_5_2k0lk0llvicmbvr.R.inc(27003);set.addAll(fromCollection);
        __CLR4_5_2k0lk0llvicmbvr.R.inc(27004);return set;
    }finally{__CLR4_5_2k0lk0llvicmbvr.R.flushNeeded();}}
}
