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
package org.semanticweb.owlapi.vocab;

import static org.semanticweb.owlapi.util.OWLAPIPreconditions.checkNotNull;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.model.HasIRI;
import org.semanticweb.owlapi.model.HasPrefixedName;
import org.semanticweb.owlapi.model.HasShortForm;
import org.semanticweb.owlapi.model.IRI;

/**
 * Represents the facets that can be used for restricting a datatype.
 * 
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.0.0
 * @see org.semanticweb.owlapi.model.OWLFacetRestriction
 * @see org.semanticweb.owlapi.model.OWLDatatypeRestriction
 */
public enum OWLFacet implements HasShortForm, HasIRI, HasPrefixedName {
//@formatter:off
    /** LENGTH */           LENGTH          (Namespaces.XSD, "length",          "length"), 
    /** MIN_LENGTH */       MIN_LENGTH      (Namespaces.XSD, "minLength",       "minLength"), 
    /** MAX_LENGTH */       MAX_LENGTH      (Namespaces.XSD, "maxLength",       "maxLength"), 
    /** PATTERN */          PATTERN         (Namespaces.XSD, "pattern",         "pattern"), 
    /** MIN_INCLUSIVE */    MIN_INCLUSIVE   (Namespaces.XSD, "minInclusive",    ">="), 
    /** MIN_EXCLUSIVE */    MIN_EXCLUSIVE   (Namespaces.XSD, "minExclusive",    ">"), 
    /** MAX_INCLUSIVE */    MAX_INCLUSIVE   (Namespaces.XSD, "maxInclusive",    "<="), 
    /** MAX_EXCLUSIVE */    MAX_EXCLUSIVE   (Namespaces.XSD, "maxExclusive",    "<"), 
    /** TOTAL_DIGITS */     TOTAL_DIGITS    (Namespaces.XSD, "totalDigits",     "totalDigits"), 
    /** FRACTION_DIGITS */  FRACTION_DIGITS (Namespaces.XSD, "fractionDigits",  "fractionDigits"), 
    /** LANG_RANGE */       LANG_RANGE      (Namespaces.RDF, "langRange",       "langRange");
//@formatter:on
    /** all facet iris */
    public static final Set<IRI> FACET_IRIS;
    static {try{__CLR4_5_2ca5ca5lvicksex.R.inc(15917);
        __CLR4_5_2ca5ca5lvicksex.R.inc(15918);Set<IRI> iris = new HashSet<>();
        __CLR4_5_2ca5ca5lvicksex.R.inc(15919);for (OWLFacet v : values()) {{
            __CLR4_5_2ca5ca5lvicksex.R.inc(15920);iris.add(v.getIRI());
        }
        }__CLR4_5_2ca5ca5lvicksex.R.inc(15921);FACET_IRIS = Collections.unmodifiableSet(iris);
    }finally{__CLR4_5_2ca5ca5lvicksex.R.flushNeeded();}}
    @Nonnull
    private final IRI iri;
    @Nonnull
    private final String shortForm;
    @Nonnull
    private final String symbolicForm;
    @Nonnull
    private final String prefixedName;

    OWLFacet(@Nonnull Namespaces ns, @Nonnull String shortForm,
            @Nonnull String symbolicForm) {try{__CLR4_5_2ca5ca5lvicksex.R.inc(15922);
        __CLR4_5_2ca5ca5lvicksex.R.inc(15923);iri = IRI.create(ns.toString(), shortForm);
        __CLR4_5_2ca5ca5lvicksex.R.inc(15924);this.shortForm = shortForm;
        __CLR4_5_2ca5ca5lvicksex.R.inc(15925);this.symbolicForm = symbolicForm;
        __CLR4_5_2ca5ca5lvicksex.R.inc(15926);prefixedName = ns.getPrefixName() + ':' + shortForm;
    }finally{__CLR4_5_2ca5ca5lvicksex.R.flushNeeded();}}

    @Override
    public String getShortForm() {try{__CLR4_5_2ca5ca5lvicksex.R.inc(15927);
        __CLR4_5_2ca5ca5lvicksex.R.inc(15928);return shortForm;
    }finally{__CLR4_5_2ca5ca5lvicksex.R.flushNeeded();}}

    @Override
    public IRI getIRI() {try{__CLR4_5_2ca5ca5lvicksex.R.inc(15929);
        __CLR4_5_2ca5ca5lvicksex.R.inc(15930);return iri;
    }finally{__CLR4_5_2ca5ca5lvicksex.R.flushNeeded();}}

    /** @return symbolic form */
    public String getSymbolicForm() {try{__CLR4_5_2ca5ca5lvicksex.R.inc(15931);
        __CLR4_5_2ca5ca5lvicksex.R.inc(15932);return symbolicForm;
    }finally{__CLR4_5_2ca5ca5lvicksex.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_5_2ca5ca5lvicksex.R.inc(15933);
        __CLR4_5_2ca5ca5lvicksex.R.inc(15934);return getShortForm();
    }finally{__CLR4_5_2ca5ca5lvicksex.R.flushNeeded();}}

    /** @return all facet iris */
    public static Set<IRI> getFacetIRIs() {try{__CLR4_5_2ca5ca5lvicksex.R.inc(15935);
        __CLR4_5_2ca5ca5lvicksex.R.inc(15936);return FACET_IRIS;
    }finally{__CLR4_5_2ca5ca5lvicksex.R.flushNeeded();}}

    /**
     * @param iri
     *        facet IRI
     * @return facet for iri
     */
    @Nonnull
    public static OWLFacet getFacet(@Nonnull IRI iri) {try{__CLR4_5_2ca5ca5lvicksex.R.inc(15937);
        __CLR4_5_2ca5ca5lvicksex.R.inc(15938);checkNotNull(iri, "iri cannot be null");
        __CLR4_5_2ca5ca5lvicksex.R.inc(15939);for (OWLFacet vocabulary : OWLFacet.values()) {{
            __CLR4_5_2ca5ca5lvicksex.R.inc(15940);if ((((vocabulary.getIRI().equals(iri))&&(__CLR4_5_2ca5ca5lvicksex.R.iget(15941)!=0|true))||(__CLR4_5_2ca5ca5lvicksex.R.iget(15942)==0&false))) {{
                __CLR4_5_2ca5ca5lvicksex.R.inc(15943);return vocabulary;
            }
        }}
        }__CLR4_5_2ca5ca5lvicksex.R.inc(15944);throw new IllegalArgumentException("Unknown facet: " + iri);
    }finally{__CLR4_5_2ca5ca5lvicksex.R.flushNeeded();}}

    /**
     * Gets a facet by its short name.
     * 
     * @param shortName
     *        The short name of the facet.
     * @return The facet or {@code null} if not facet by the specified name
     *         exists.
     */
    public static OWLFacet getFacetByShortName(@Nonnull String shortName) {try{__CLR4_5_2ca5ca5lvicksex.R.inc(15945);
        __CLR4_5_2ca5ca5lvicksex.R.inc(15946);checkNotNull(shortName);
        __CLR4_5_2ca5ca5lvicksex.R.inc(15947);for (OWLFacet vocabulary : OWLFacet.values()) {{
            __CLR4_5_2ca5ca5lvicksex.R.inc(15948);if ((((vocabulary.getShortForm().equals(shortName))&&(__CLR4_5_2ca5ca5lvicksex.R.iget(15949)!=0|true))||(__CLR4_5_2ca5ca5lvicksex.R.iget(15950)==0&false))) {{
                __CLR4_5_2ca5ca5lvicksex.R.inc(15951);return vocabulary;
            }
        }}
        }__CLR4_5_2ca5ca5lvicksex.R.inc(15952);return null;
    }finally{__CLR4_5_2ca5ca5lvicksex.R.flushNeeded();}}

    /**
     * @param symbolicName
     *        symbolic name for facet
     * @return facet for name
     */
    public static OWLFacet getFacetBySymbolicName(String symbolicName) {try{__CLR4_5_2ca5ca5lvicksex.R.inc(15953);
        __CLR4_5_2ca5ca5lvicksex.R.inc(15954);for (OWLFacet vocabulary : OWLFacet.values()) {{
            __CLR4_5_2ca5ca5lvicksex.R.inc(15955);if ((((vocabulary.getSymbolicForm().equals(symbolicName))&&(__CLR4_5_2ca5ca5lvicksex.R.iget(15956)!=0|true))||(__CLR4_5_2ca5ca5lvicksex.R.iget(15957)==0&false))) {{
                __CLR4_5_2ca5ca5lvicksex.R.inc(15958);return vocabulary;
            }
        }}
        }__CLR4_5_2ca5ca5lvicksex.R.inc(15959);return null;
    }finally{__CLR4_5_2ca5ca5lvicksex.R.flushNeeded();}}

    /** @return all facets */
    public static Set<String> getFacets() {try{__CLR4_5_2ca5ca5lvicksex.R.inc(15960);
        __CLR4_5_2ca5ca5lvicksex.R.inc(15961);Set<String> result = new HashSet<>();
        __CLR4_5_2ca5ca5lvicksex.R.inc(15962);for (OWLFacet v : values()) {{
            __CLR4_5_2ca5ca5lvicksex.R.inc(15963);result.add(v.getSymbolicForm());
        }
        }__CLR4_5_2ca5ca5lvicksex.R.inc(15964);return result;
    }finally{__CLR4_5_2ca5ca5lvicksex.R.flushNeeded();}}

    @Override
    public String getPrefixedName() {try{__CLR4_5_2ca5ca5lvicksex.R.inc(15965);
        __CLR4_5_2ca5ca5lvicksex.R.inc(15966);return prefixedName;
    }finally{__CLR4_5_2ca5ca5lvicksex.R.flushNeeded();}}
;public static class __CLR4_5_2ca5ca5lvicksex{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0061\u0070\u0069\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237201267L,8589935092L,15967,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;}
