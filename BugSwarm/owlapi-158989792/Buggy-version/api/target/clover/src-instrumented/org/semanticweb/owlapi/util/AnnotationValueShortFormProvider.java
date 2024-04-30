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

import java.util.List;
import java.util.Map;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLAnnotationAssertionAxiom;
import org.semanticweb.owlapi.model.OWLAnnotationProperty;
import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.OWLEntity;
import org.semanticweb.owlapi.model.OWLLiteral;
import org.semanticweb.owlapi.model.OWLObject;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologySetProvider;

/**
 * A short form provider that generates short forms based on entity annotation
 * values. A list of preferred annotation URIs and preferred annotation
 * languages is used to determine which annotation value to select if there are
 * multiple annotations for the entity whose short form is being generated. If
 * there are multiple annotations the these annotations are ranked by preferred
 * IRI and then by preferred language.
 * 
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.0.0
 */
public class AnnotationValueShortFormProvider implements ShortFormProvider {public static class __CLR4_5_24sv4svlvickp4k{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0061\u0070\u0069\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237201267L,8589935092L,6287,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Nonnull
    private final OWLOntologySetProvider ontologySetProvider;
    @Nonnull
    private final ShortFormProvider alternateShortFormProvider;
    @Nonnull
    private final IRIShortFormProvider alternateIRIShortFormProvider;
    @Nonnull
    private final List<OWLAnnotationProperty> annotationProperties;
    @Nonnull
    private final Map<OWLAnnotationProperty, List<String>> preferredLanguageMap;
    @Nonnull
    private StringAnnotationVisitor literalRenderer = new StringAnnotationVisitor();

    /**
     * Constructs an annotation value short form provider. Using
     * {@code SimpleShortFormProvider} as the alternate short form provider
     * 
     * @param annotationProperties
     *        A {@code List} of preferred annotation properties. The list is
     *        searched from start to end, so that annotations that have a
     *        property at the start of the list have a higher priority and are
     *        selected over annotations with properties that appear towards or
     *        at the end of the list.
     * @param preferredLanguageMap
     *        A map which maps annotation properties to preferred languages. For
     *        any given annotation property there may be a list of preferred
     *        languages. Languages at the start of the list have a higher
     *        priority over languages at the end of the list. This parameter may
     *        be empty but it must not be {@code null}.
     * @param ontologySetProvider
     *        An {@code OWLOntologySetProvider} which provides a set of ontology
     *        from which candidate annotation axioms should be taken. For a
     *        given entity, all ontologies are examined.
     */
    public AnnotationValueShortFormProvider(
            @Nonnull List<OWLAnnotationProperty> annotationProperties,
            @Nonnull Map<OWLAnnotationProperty, List<String>> preferredLanguageMap,
            @Nonnull OWLOntologySetProvider ontologySetProvider) {
        this(annotationProperties, preferredLanguageMap, ontologySetProvider,
                new SimpleShortFormProvider());__CLR4_5_24sv4svlvickp4k.R.inc(6224);try{__CLR4_5_24sv4svlvickp4k.R.inc(6223);
    }finally{__CLR4_5_24sv4svlvickp4k.R.flushNeeded();}}

    /**
     * Constructs an annotation short form provider.
     * 
     * @param annotationProperties
     *        A {@code List} of preferred annotation properties. The list is
     *        searched from start to end, so that annotations that have a
     *        property at the start of the list have a higher priority and are
     *        selected over annotations with properties that appear towards or
     *        at the end of the list.
     * @param preferredLanguageMap
     *        A map which maps annotation properties to preferred languages. For
     *        any given annotation property there may be a list of preferred
     *        languages. Languages at the start of the list have a higher
     *        priority over languages at the end of the list. This parameter may
     *        be empty but it must not be {@code null}.
     * @param ontologySetProvider
     *        An {@code OWLOntologySetProvider} which provides a set of ontology
     *        from which candidate annotation axioms should be taken. For a
     *        given entity, all ontologies are examined.
     * @param alternateShortFormProvider
     *        A short form provider which will be used to generate the short
     *        form for an entity that does not have any annotations. This
     *        provider will also be used in the case where the value of an
     *        annotation is an {@code OWLIndividual} for providing the short
     *        form of the individual.
     */
    public AnnotationValueShortFormProvider(
            @Nonnull List<OWLAnnotationProperty> annotationProperties,
            @Nonnull Map<OWLAnnotationProperty, List<String>> preferredLanguageMap,
            @Nonnull OWLOntologySetProvider ontologySetProvider,
            @Nonnull ShortFormProvider alternateShortFormProvider) {
        this(ontologySetProvider, alternateShortFormProvider,
                new SimpleIRIShortFormProvider(), annotationProperties,
                preferredLanguageMap);__CLR4_5_24sv4svlvickp4k.R.inc(6226);try{__CLR4_5_24sv4svlvickp4k.R.inc(6225);
    }finally{__CLR4_5_24sv4svlvickp4k.R.flushNeeded();}}

    /**
     * @param ontologySetProvider
     *        ontologies
     * @param alternateShortFormProvider
     *        short form provider
     * @param alternateIRIShortFormProvider
     *        iri short form provider
     * @param annotationProperties
     *        annotation properties
     * @param preferredLanguageMap
     *        preferred language map
     */
    public AnnotationValueShortFormProvider(
            @Nonnull OWLOntologySetProvider ontologySetProvider,
            @Nonnull ShortFormProvider alternateShortFormProvider,
            @Nonnull IRIShortFormProvider alternateIRIShortFormProvider,
            @Nonnull List<OWLAnnotationProperty> annotationProperties,
            @Nonnull Map<OWLAnnotationProperty, List<String>> preferredLanguageMap) {try{__CLR4_5_24sv4svlvickp4k.R.inc(6227);
        __CLR4_5_24sv4svlvickp4k.R.inc(6228);this.ontologySetProvider = checkNotNull(ontologySetProvider,
                "ontologySetProvider cannot be null");
        __CLR4_5_24sv4svlvickp4k.R.inc(6229);this.alternateShortFormProvider = checkNotNull(
                alternateShortFormProvider,
                "alternateShortFormProvider cannot be null");
        __CLR4_5_24sv4svlvickp4k.R.inc(6230);this.alternateIRIShortFormProvider = checkNotNull(
                alternateIRIShortFormProvider,
                "alternateIRIShortFormProvider cannot be null");
        __CLR4_5_24sv4svlvickp4k.R.inc(6231);this.annotationProperties = checkNotNull(annotationProperties,
                "annotationProperties cannot be null");
        __CLR4_5_24sv4svlvickp4k.R.inc(6232);this.preferredLanguageMap = checkNotNull(preferredLanguageMap,
                "preferredLanguageMap cannot be null");
    }finally{__CLR4_5_24sv4svlvickp4k.R.flushNeeded();}}

    @Nonnull
    @Override
    public String getShortForm(@Nonnull OWLEntity entity) {try{__CLR4_5_24sv4svlvickp4k.R.inc(6233);
        __CLR4_5_24sv4svlvickp4k.R.inc(6234);for (OWLAnnotationProperty prop : annotationProperties) {{
            // visit the properties in order of preference
            __CLR4_5_24sv4svlvickp4k.R.inc(6235);AnnotationLanguageFilter checker = new AnnotationLanguageFilter(
                    prop, preferredLanguageMap.get(prop));
            __CLR4_5_24sv4svlvickp4k.R.inc(6236);for (OWLOntology ontology : ontologySetProvider.getOntologies()) {{
                __CLR4_5_24sv4svlvickp4k.R.inc(6237);for (OWLOntology o : ontology.getImportsClosure()) {{
                    __CLR4_5_24sv4svlvickp4k.R.inc(6238);for (OWLAxiom ax : o.getAnnotationAssertionAxioms(entity
                            .getIRI())) {{
                        __CLR4_5_24sv4svlvickp4k.R.inc(6239);ax.accept(checker);
                    }
                }}
            }}
            }__CLR4_5_24sv4svlvickp4k.R.inc(6240);OWLObject match = checker.getMatch();
            __CLR4_5_24sv4svlvickp4k.R.inc(6241);if ((((match != null)&&(__CLR4_5_24sv4svlvickp4k.R.iget(6242)!=0|true))||(__CLR4_5_24sv4svlvickp4k.R.iget(6243)==0&false))) {{
                __CLR4_5_24sv4svlvickp4k.R.inc(6244);return getRendering(match);
            }
        }}
        }__CLR4_5_24sv4svlvickp4k.R.inc(6245);return alternateShortFormProvider.getShortForm(entity);
    }finally{__CLR4_5_24sv4svlvickp4k.R.flushNeeded();}}

    /**
     * Obtains the rendering of the specified object. If the object is a
     * constant then the rendering is equal to the literal value, if the object
     * is an individual then the rendering is equal to the rendering of the
     * individual as provided by the alternate short form provider
     * 
     * @param object
     *        The object to the rendered
     * @return The rendering of the object.
     */
    @Nonnull
    private String getRendering(@Nonnull OWLObject object) {try{__CLR4_5_24sv4svlvickp4k.R.inc(6246);
        // We return the literal value of constants or use the alternate
        // short form provider to render individuals.
        __CLR4_5_24sv4svlvickp4k.R.inc(6247);if ((((object instanceof OWLLiteral)&&(__CLR4_5_24sv4svlvickp4k.R.iget(6248)!=0|true))||(__CLR4_5_24sv4svlvickp4k.R.iget(6249)==0&false))) {{
            // TODO refactor this method to use the annotation value visitor
            __CLR4_5_24sv4svlvickp4k.R.inc(6250);return literalRenderer.visit((OWLLiteral) object);
        } }else {__CLR4_5_24sv4svlvickp4k.R.inc(6251);if ((((object instanceof IRI)&&(__CLR4_5_24sv4svlvickp4k.R.iget(6252)!=0|true))||(__CLR4_5_24sv4svlvickp4k.R.iget(6253)==0&false))) {{
            __CLR4_5_24sv4svlvickp4k.R.inc(6254);return alternateIRIShortFormProvider.getShortForm((IRI) object);
        } }else {{
            __CLR4_5_24sv4svlvickp4k.R.inc(6255);return alternateShortFormProvider.getShortForm((OWLEntity) object);
        }
    }}}finally{__CLR4_5_24sv4svlvickp4k.R.flushNeeded();}}

    /** @return the annotation URIs that this short form provider uses. */
    @Nonnull
    public List<OWLAnnotationProperty> getAnnotationProperties() {try{__CLR4_5_24sv4svlvickp4k.R.inc(6256);
        __CLR4_5_24sv4svlvickp4k.R.inc(6257);return annotationProperties;
    }finally{__CLR4_5_24sv4svlvickp4k.R.flushNeeded();}}

    /** @return the preferred language map */
    @Nonnull
    public Map<OWLAnnotationProperty, List<String>> getPreferredLanguageMap() {try{__CLR4_5_24sv4svlvickp4k.R.inc(6258);
        __CLR4_5_24sv4svlvickp4k.R.inc(6259);return preferredLanguageMap;
    }finally{__CLR4_5_24sv4svlvickp4k.R.flushNeeded();}}

    @Override
    public void dispose() {try{__CLR4_5_24sv4svlvickp4k.R.inc(6260);}finally{__CLR4_5_24sv4svlvickp4k.R.flushNeeded();}}

    private static class AnnotationLanguageFilter extends
            OWLObjectVisitorAdapter {

        private final OWLAnnotationProperty prop;
        private final List<String> preferredLanguages;
        @Nullable
        OWLObject candidateValue = null;
        int lastLangMatchIndex = Integer.MAX_VALUE;

        AnnotationLanguageFilter(OWLAnnotationProperty prop,
                List<String> preferredLanguages) {try{__CLR4_5_24sv4svlvickp4k.R.inc(6261);
            __CLR4_5_24sv4svlvickp4k.R.inc(6262);this.prop = prop;
            __CLR4_5_24sv4svlvickp4k.R.inc(6263);this.preferredLanguages = preferredLanguages;
        }finally{__CLR4_5_24sv4svlvickp4k.R.flushNeeded();}}

        @Nullable
        public OWLObject getMatch() {try{__CLR4_5_24sv4svlvickp4k.R.inc(6264);
            __CLR4_5_24sv4svlvickp4k.R.inc(6265);return candidateValue;
        }finally{__CLR4_5_24sv4svlvickp4k.R.flushNeeded();}}

        @Override
        public void visit(@Nonnull OWLAnnotationAssertionAxiom axiom) {try{__CLR4_5_24sv4svlvickp4k.R.inc(6266);
            __CLR4_5_24sv4svlvickp4k.R.inc(6267);if ((((lastLangMatchIndex > 0 && axiom.getProperty().equals(prop))&&(__CLR4_5_24sv4svlvickp4k.R.iget(6268)!=0|true))||(__CLR4_5_24sv4svlvickp4k.R.iget(6269)==0&false))) {{
                // a perfect match - no need to carry on search
                __CLR4_5_24sv4svlvickp4k.R.inc(6270);axiom.getValue().accept(this);
            }
        }}finally{__CLR4_5_24sv4svlvickp4k.R.flushNeeded();}}

        @Override
        public void visit(@Nonnull OWLLiteral node) {try{__CLR4_5_24sv4svlvickp4k.R.inc(6271);
            __CLR4_5_24sv4svlvickp4k.R.inc(6272);if ((((preferredLanguages == null || preferredLanguages.isEmpty())&&(__CLR4_5_24sv4svlvickp4k.R.iget(6273)!=0|true))||(__CLR4_5_24sv4svlvickp4k.R.iget(6274)==0&false))) {{
                // if there are no languages just match the first thing
                __CLR4_5_24sv4svlvickp4k.R.inc(6275);lastLangMatchIndex = 0;
                __CLR4_5_24sv4svlvickp4k.R.inc(6276);candidateValue = node;
            } }else {{
                __CLR4_5_24sv4svlvickp4k.R.inc(6277);int index = preferredLanguages.indexOf(node.getLang());
                __CLR4_5_24sv4svlvickp4k.R.inc(6278);if ((((index >= 0 && index < lastLangMatchIndex)&&(__CLR4_5_24sv4svlvickp4k.R.iget(6279)!=0|true))||(__CLR4_5_24sv4svlvickp4k.R.iget(6280)==0&false))) {{
                    __CLR4_5_24sv4svlvickp4k.R.inc(6281);lastLangMatchIndex = index;
                    __CLR4_5_24sv4svlvickp4k.R.inc(6282);candidateValue = node;
                }
            }}
        }}finally{__CLR4_5_24sv4svlvickp4k.R.flushNeeded();}}

        @Override
        public void visit(IRI iri) {try{__CLR4_5_24sv4svlvickp4k.R.inc(6283);
            // No language
            __CLR4_5_24sv4svlvickp4k.R.inc(6284);candidateValue = iri;
        }finally{__CLR4_5_24sv4svlvickp4k.R.flushNeeded();}}
    }

    /**
     * @param literalRenderer
     *        the literalRenderer to set
     */
    public void setLiteralRenderer(
            @Nonnull StringAnnotationVisitor literalRenderer) {try{__CLR4_5_24sv4svlvickp4k.R.inc(6285);
        __CLR4_5_24sv4svlvickp4k.R.inc(6286);this.literalRenderer = checkNotNull(literalRenderer);
    }finally{__CLR4_5_24sv4svlvickp4k.R.flushNeeded();}}
}
