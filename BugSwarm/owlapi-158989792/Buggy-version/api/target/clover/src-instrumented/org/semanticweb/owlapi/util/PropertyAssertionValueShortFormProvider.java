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

import org.semanticweb.owlapi.model.OWLDataPropertyAssertionAxiom;
import org.semanticweb.owlapi.model.OWLDataPropertyExpression;
import org.semanticweb.owlapi.model.OWLEntity;
import org.semanticweb.owlapi.model.OWLIndividual;
import org.semanticweb.owlapi.model.OWLLiteral;
import org.semanticweb.owlapi.model.OWLObject;
import org.semanticweb.owlapi.model.OWLObjectPropertyAssertionAxiom;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologySetProvider;
import org.semanticweb.owlapi.model.OWLPropertyExpression;

/**
 * A short form provider that generates short forms from the values of object
 * property assertions or data property assertions if the entity is an
 * individual. If the entity whose short form is not being generated is not an
 * individual (i.e. it is a class, property etc.) then an alternate short form
 * provider is used. (As a side note, the use case for this particular short
 * form provider came from the SKOS community, which have individuals that have
 * preferredLabel property assertions).
 * 
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.0.0
 */
public class PropertyAssertionValueShortFormProvider implements
        ShortFormProvider {public static class __CLR4_5_2avwavwlvickrul{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0061\u0070\u0069\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237201267L,8589935092L,14181,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Nonnull
    private final List<OWLPropertyExpression> properties;
    private final Map<OWLDataPropertyExpression, List<String>> preferredLanguageMap;
    private final OWLOntologySetProvider ontologySetProvider;
    private final ShortFormProvider alternateShortFormProvider;

    /**
     * Constructs a property value short form provider. Using
     * {@code SimpleShortFormProvider} as the alternate short form provider (see
     * other constructor for details).
     * 
     * @param properties
     *        set of properties
     * @param preferredLanguageMap
     *        language map
     * @param ontologySetProvider
     *        the ontology container
     */
    public PropertyAssertionValueShortFormProvider(
            @Nonnull List<OWLPropertyExpression> properties,
            @Nonnull Map<OWLDataPropertyExpression, List<String>> preferredLanguageMap,
            @Nonnull OWLOntologySetProvider ontologySetProvider) {
        this(properties, preferredLanguageMap, ontologySetProvider,
                new SimpleShortFormProvider());__CLR4_5_2avwavwlvickrul.R.inc(14109);try{__CLR4_5_2avwavwlvickrul.R.inc(14108);
    }finally{__CLR4_5_2avwavwlvickrul.R.flushNeeded();}}

    /**
     * Constructs a property value short form provider.
     * 
     * @param properties
     *        A {@code List} of preferred properties. The list is searched from
     *        start to end, so that property assertions whose property is at the
     *        start of the list have a higher priority and are selected over
     *        properties that appear towards or at the end of the list.
     * @param preferredLanguageMap
     *        A map which maps data properties to preferred languages. For any
     *        given data property there may be a list of preferred languages for
     *        the values of that property Languages at the start of the list
     *        have a higher priority over languages at the end of the list. This
     *        parameter may be empty but it must not be {@code null}.
     * @param ontologySetProvider
     *        An {@code OWLOntologySetProvider} which provides a set of ontology
     *        from which candidate annotation axioms should be taken. For a
     *        given entity, all ontologies are examined.
     * @param alternateShortFormProvider
     *        A short form provider which will be used to generate the short
     *        form for an entity that does not have any property values (e.g.
     *        class, property). This provider will also be used in the case
     *        where the value of an annotation is an {@code OWLIndividual} for
     *        providing the short form of the individual.
     */
    public PropertyAssertionValueShortFormProvider(
            @Nonnull List<OWLPropertyExpression> properties,
            @Nonnull Map<OWLDataPropertyExpression, List<String>> preferredLanguageMap,
            @Nonnull OWLOntologySetProvider ontologySetProvider,
            @Nonnull ShortFormProvider alternateShortFormProvider) {try{__CLR4_5_2avwavwlvickrul.R.inc(14110);
        __CLR4_5_2avwavwlvickrul.R.inc(14111);this.properties = checkNotNull(properties, "properties cannot be null");
        __CLR4_5_2avwavwlvickrul.R.inc(14112);this.preferredLanguageMap = checkNotNull(preferredLanguageMap,
                "preferredLanguageMap cannot be null");
        __CLR4_5_2avwavwlvickrul.R.inc(14113);this.ontologySetProvider = checkNotNull(ontologySetProvider,
                "ontologySetProvider cannot be null");
        __CLR4_5_2avwavwlvickrul.R.inc(14114);this.alternateShortFormProvider = checkNotNull(
                alternateShortFormProvider,
                "alternateShortFormProvider cannot be null");
    }finally{__CLR4_5_2avwavwlvickrul.R.flushNeeded();}}

    @Override
    public String getShortForm(OWLEntity entity) {try{__CLR4_5_2avwavwlvickrul.R.inc(14115);
        __CLR4_5_2avwavwlvickrul.R.inc(14116);checkNotNull(entity, "entity cannot be null");
        __CLR4_5_2avwavwlvickrul.R.inc(14117);if ((((!(entity instanceof OWLIndividual))&&(__CLR4_5_2avwavwlvickrul.R.iget(14118)!=0|true))||(__CLR4_5_2avwavwlvickrul.R.iget(14119)==0&false))) {{
            __CLR4_5_2avwavwlvickrul.R.inc(14120);return alternateShortFormProvider.getShortForm(entity);
        }
        }__CLR4_5_2avwavwlvickrul.R.inc(14121);OWLIndividual individual = (OWLIndividual) entity;
        // The candidate value to be rendered, we select this based on
        // ranking of annotation URI and ranking of lang (if present)
        __CLR4_5_2avwavwlvickrul.R.inc(14122);OWLObject candidateValue = null;
        __CLR4_5_2avwavwlvickrul.R.inc(14123);int lastURIMatchIndex = Integer.MAX_VALUE;
        __CLR4_5_2avwavwlvickrul.R.inc(14124);int lastLangMatchIndex = Integer.MAX_VALUE;
        __CLR4_5_2avwavwlvickrul.R.inc(14125);for (OWLOntology ontology : ontologySetProvider.getOntologies()) {{
            __CLR4_5_2avwavwlvickrul.R.inc(14126);for (OWLObjectPropertyAssertionAxiom ax : ontology
                    .getObjectPropertyAssertionAxioms(individual)) {{
                __CLR4_5_2avwavwlvickrul.R.inc(14127);int index = properties.indexOf(ax.getProperty());
                __CLR4_5_2avwavwlvickrul.R.inc(14128);if ((((index == -1)&&(__CLR4_5_2avwavwlvickrul.R.iget(14129)!=0|true))||(__CLR4_5_2avwavwlvickrul.R.iget(14130)==0&false))) {{
                    __CLR4_5_2avwavwlvickrul.R.inc(14131);continue;
                }
                }__CLR4_5_2avwavwlvickrul.R.inc(14132);if ((((index < lastURIMatchIndex)&&(__CLR4_5_2avwavwlvickrul.R.iget(14133)!=0|true))||(__CLR4_5_2avwavwlvickrul.R.iget(14134)==0&false))) {{
                    __CLR4_5_2avwavwlvickrul.R.inc(14135);candidateValue = ax.getObject();
                }
            }}
            }__CLR4_5_2avwavwlvickrul.R.inc(14136);for (OWLDataPropertyAssertionAxiom ax : ontology
                    .getDataPropertyAssertionAxioms(individual)) {{
                __CLR4_5_2avwavwlvickrul.R.inc(14137);int index = properties.indexOf(ax.getProperty());
                __CLR4_5_2avwavwlvickrul.R.inc(14138);if ((((index == -1)&&(__CLR4_5_2avwavwlvickrul.R.iget(14139)!=0|true))||(__CLR4_5_2avwavwlvickrul.R.iget(14140)==0&false))) {{
                    __CLR4_5_2avwavwlvickrul.R.inc(14141);continue;
                }
                }__CLR4_5_2avwavwlvickrul.R.inc(14142);if ((((index == lastURIMatchIndex)&&(__CLR4_5_2avwavwlvickrul.R.iget(14143)!=0|true))||(__CLR4_5_2avwavwlvickrul.R.iget(14144)==0&false))) {{
                    // Different property value but same prop, as previous
                    // candidate - look at lang tag for that URI
                    // and see if we take priority over the previous one
                    __CLR4_5_2avwavwlvickrul.R.inc(14145);OWLObject obj = ax.getObject();
                    __CLR4_5_2avwavwlvickrul.R.inc(14146);if ((((obj instanceof OWLLiteral)&&(__CLR4_5_2avwavwlvickrul.R.iget(14147)!=0|true))||(__CLR4_5_2avwavwlvickrul.R.iget(14148)==0&false))) {{
                        __CLR4_5_2avwavwlvickrul.R.inc(14149);List<String> langList = preferredLanguageMap.get(ax
                                .getProperty());
                        __CLR4_5_2avwavwlvickrul.R.inc(14150);if ((((langList != null)&&(__CLR4_5_2avwavwlvickrul.R.iget(14151)!=0|true))||(__CLR4_5_2avwavwlvickrul.R.iget(14152)==0&false))) {{
                            // There is no need to check if lang is null. It may
                            // well be that no
                            // lang is preferred over any other lang.
                            __CLR4_5_2avwavwlvickrul.R.inc(14153);OWLLiteral lit = (OWLLiteral) obj;
                            __CLR4_5_2avwavwlvickrul.R.inc(14154);int langIndex = langList.indexOf(lit.getLang());
                            __CLR4_5_2avwavwlvickrul.R.inc(14155);if ((((langIndex != -1
                                    && langIndex < lastLangMatchIndex)&&(__CLR4_5_2avwavwlvickrul.R.iget(14156)!=0|true))||(__CLR4_5_2avwavwlvickrul.R.iget(14157)==0&false))) {{
                                __CLR4_5_2avwavwlvickrul.R.inc(14158);lastLangMatchIndex = langIndex;
                                __CLR4_5_2avwavwlvickrul.R.inc(14159);candidateValue = ax.getObject();
                            }
                        }}
                    }}
                }} }else {__CLR4_5_2avwavwlvickrul.R.inc(14160);if ((((index < lastURIMatchIndex)&&(__CLR4_5_2avwavwlvickrul.R.iget(14161)!=0|true))||(__CLR4_5_2avwavwlvickrul.R.iget(14162)==0&false))) {{
                    // Better match than previous URI - wipe out previous match!
                    __CLR4_5_2avwavwlvickrul.R.inc(14163);lastURIMatchIndex = index;
                    __CLR4_5_2avwavwlvickrul.R.inc(14164);candidateValue = ax.getObject();
                }
            }}}
        }}
        }__CLR4_5_2avwavwlvickrul.R.inc(14165);if ((((candidateValue != null)&&(__CLR4_5_2avwavwlvickrul.R.iget(14166)!=0|true))||(__CLR4_5_2avwavwlvickrul.R.iget(14167)==0&false))) {{
            __CLR4_5_2avwavwlvickrul.R.inc(14168);return getRendering(candidateValue);
        } }else {{
            __CLR4_5_2avwavwlvickrul.R.inc(14169);return alternateShortFormProvider.getShortForm(entity);
        }
    }}finally{__CLR4_5_2avwavwlvickrul.R.flushNeeded();}}

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
    private String getRendering(@Nonnull OWLObject object) {try{__CLR4_5_2avwavwlvickrul.R.inc(14170);
        // We return the literal value of constants or use the alternate
        // short form provider to render individuals.
        __CLR4_5_2avwavwlvickrul.R.inc(14171);if ((((object instanceof OWLLiteral)&&(__CLR4_5_2avwavwlvickrul.R.iget(14172)!=0|true))||(__CLR4_5_2avwavwlvickrul.R.iget(14173)==0&false))) {{
            __CLR4_5_2avwavwlvickrul.R.inc(14174);return ((OWLLiteral) object).getLiteral();
        } }else {{
            __CLR4_5_2avwavwlvickrul.R.inc(14175);return alternateShortFormProvider.getShortForm((OWLEntity) object);
        }
    }}finally{__CLR4_5_2avwavwlvickrul.R.flushNeeded();}}

    /** @return the properties */
    public List<OWLPropertyExpression> getProperties() {try{__CLR4_5_2avwavwlvickrul.R.inc(14176);
        __CLR4_5_2avwavwlvickrul.R.inc(14177);return properties;
    }finally{__CLR4_5_2avwavwlvickrul.R.flushNeeded();}}

    /** @return the language map */
    public Map<OWLDataPropertyExpression, List<String>>
            getPreferredLanguageMap() {try{__CLR4_5_2avwavwlvickrul.R.inc(14178);
        __CLR4_5_2avwavwlvickrul.R.inc(14179);return preferredLanguageMap;
    }finally{__CLR4_5_2avwavwlvickrul.R.flushNeeded();}}

    @Override
    public void dispose() {try{__CLR4_5_2avwavwlvickrul.R.inc(14180);}finally{__CLR4_5_2avwavwlvickrul.R.flushNeeded();}}
}
