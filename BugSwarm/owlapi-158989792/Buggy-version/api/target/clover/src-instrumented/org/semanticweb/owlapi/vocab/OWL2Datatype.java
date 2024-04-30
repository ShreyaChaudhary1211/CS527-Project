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
import static org.semanticweb.owlapi.vocab.Namespaces.*;
import static org.semanticweb.owlapi.vocab.OWLFacet.*;
import static org.semanticweb.owlapi.vocab.XSDVocabulary.*;

import java.util.*;
import java.util.regex.Pattern;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.util.CollectionFactory;

/**
 * An enumeration of the datatypes in the OWL 2 specification. These are the
 * datatypes in the OWL 2 datatype map.
 * 
 * @author Matthew Horridge, The University Of Manchester, Information
 *         Management Group
 * @since 2.2.0
 */
public enum OWL2Datatype implements HasIRI,HasShortForm,HasPrefixedName {
//@formatter:off
    /** RDF_XML_LITERAL */          RDF_XML_LITERAL          (RDF,  "XMLLiteral",   Category.CAT_STRING_WITHOUT_LANGUAGE_TAG, false, ".*"), 
    /** RDFS_LITERAL */             RDFS_LITERAL             (RDFS, "Literal",      Category.CAT_UNIVERSAL,                   false, ".*"),
    /** RDF_PLAIN_LITERAL */        RDF_PLAIN_LITERAL        (RDF,  "PlainLiteral", Category.CAT_STRING_WITHOUT_LANGUAGE_TAG, false, ".*"),
    /** OWL_REAL */                 OWL_REAL                 (OWL,  "real",         Category.CAT_NUMBER,                      false, ".*"),
    /** OWL_RATIONAL */             OWL_RATIONAL             (OWL,  "rational",     Category.CAT_NUMBER,                      false, "(\\+|-)?([0-9]+)(\\s)*(/)(\\s)*([0-9]+)"),
    /** XSD_STRING */               XSD_STRING               (STRING,               Category.CAT_STRING_WITHOUT_LANGUAGE_TAG, false, ".*"),
    /** XSD_NORMALIZED_STRING */    XSD_NORMALIZED_STRING    (NORMALIZED_STRING,    Category.CAT_STRING_WITHOUT_LANGUAGE_TAG, false, "([^\\r\\n\\t])*"),
    /** XSD_TOKEN */                XSD_TOKEN                (TOKEN,                Category.CAT_STRING_WITHOUT_LANGUAGE_TAG, false, "([^\\s])(\\s([^\\s])|([^\\s]))*"),
    /** XSD_LANGUAGE */             XSD_LANGUAGE             (LANGUAGE,             Category.CAT_STRING_WITHOUT_LANGUAGE_TAG, true,  "[a-zA-Z]{1,8}(-[a-zA-Z0-9]{1,8})*"),
    /** XSD_NAME */                 XSD_NAME                 (NAME,                 Category.CAT_STRING_WITHOUT_LANGUAGE_TAG, false, ":|[A-Z]|_|[a-z]|[\\u00C0-\\u00D6]|[\\u00D8-\\u00F6]|[\\u00F8-\\u02FF]|[\\u0370-\\u037D]|[\\u037F-\\u1FFF]|[\\u200C-\\u200D]|[\\u2070-\\u218F]|[\\u2C00-\\u2FEF]|[\\u3001-\\uD7FF]|[\\uF900-\\uFDCF]|[\\uFDF0-\\uFFFD](:|[A-Z]|_|[a-z]|[\\u00C0-\\u00D6]|[\\u00D8-\\u00F6]|[\\u00F8-\\u02FF]|[\\u0370-\\u037D]|[\\u037F-\\u1FFF]|[\\u200C-\\u200D]|[\\u2070-\\u218F]|[\\u2C00-\\u2FEF]|[\\u3001-\\uD7FF]|[\\uF900-\\uFDCF]|[\\uFDF0-\\uFFFD]|\"-\"|\".\"|[0-9]|\\u00B7|[\\u0300-\\u036F]|[\\u203F-\\u2040])*"),
    /** XSD_NCNAME */               XSD_NCNAME               (NCNAME,               Category.CAT_STRING_WITHOUT_LANGUAGE_TAG, false, "[A-Z]|_|[a-z]|[\\u00C0-\\u00D6]|[\\u00D8-\\u00F6]|[\\u00F8-\\u02FF]|[\\u0370-\\u037D]|[\\u037F-\\u1FFF]|[\\u200C-\\u200D]|[\\u2070-\\u218F]|[\\u2C00-\\u2FEF]|[\\u3001-\\uD7FF]|[\\uF900-\\uFDCF]|[\\uFDF0-\\uFFFD]([A-Z]|_|[a-z]|[\\u00C0-\\u00D6]|[\\u00D8-\\u00F6]|[\\u00F8-\\u02FF]|[\\u0370-\\u037D]|[\\u037F-\\u1FFF]|[\\u200C-\\u200D]|[\\u2070-\\u218F]|[\\u2C00-\\u2FEF]|[\\u3001-\\uD7FF]|[\\uF900-\\uFDCF]|[\\uFDF0-\\uFFFD]|\"-\"|\".\"|[0-9]|\\u00B7|[\\u0300-\\u036F]|[\\u203F-\\u2040])*"),
    /** XSD_NMTOKEN */              XSD_NMTOKEN              (NMTOKEN,              Category.CAT_STRING_WITHOUT_LANGUAGE_TAG, false, ".*"),
    /** XSD_DECIMAL */              XSD_DECIMAL              (DECIMAL,              Category.CAT_NUMBER,  false, "(\\+|-)?([0-9]+(\\.[0-9]*)?|\\.[0-9]+)"),
    /** XSD_INTEGER */              XSD_INTEGER              (INTEGER,              Category.CAT_NUMBER,  false, "(\\+|-)?([0-9]+)"),
    /** XSD_NON_NEGATIVE_INTEGER */ XSD_NON_NEGATIVE_INTEGER (NON_NEGATIVE_INTEGER, Category.CAT_NUMBER,  false, "((\\+)?([0-9]+))|-(0+)"),
    /** XSD_NON_POSITIVE_INTEGER */ XSD_NON_POSITIVE_INTEGER (NON_POSITIVE_INTEGER, Category.CAT_NUMBER,  false, "-([0-9]+)|(\\+(0+))"),
    /** XSD_POSITIVE_INTEGER */     XSD_POSITIVE_INTEGER     (POSITIVE_INTEGER,     Category.CAT_NUMBER,  false, "(\\+)?([0-9]+)"),
    /** XSD_NEGATIVE_INTEGER */     XSD_NEGATIVE_INTEGER     (NEGATIVE_INTEGER,     Category.CAT_NUMBER,  false, "-([0-9]+)"),
    /** XSD_LONG */                 XSD_LONG                 (LONG,                 Category.CAT_NUMBER,  true,  "(\\+|-)?([0-9]+)"),
    /** XSD_INT */                  XSD_INT                  (INT,                  Category.CAT_NUMBER,  true,  "(\\+|-)?([0-9]+)"),
    /** XSD_SHORT */                XSD_SHORT                (SHORT,                Category.CAT_NUMBER,  true,  "(\\+|-)?([0-9]+)"),
    /** XSD_BYTE */                 XSD_BYTE                 (BYTE,                 Category.CAT_NUMBER,  true,  "(\\+|-)?([0-9]+)"),
    /** XSD_UNSIGNED_LONG */        XSD_UNSIGNED_LONG        (UNSIGNED_LONG,        Category.CAT_NUMBER,  true,  "(\\+)?([0-9]+)"),
    /** XSD_UNSIGNED_INT */         XSD_UNSIGNED_INT         (UNSIGNED_INT,         Category.CAT_NUMBER,  true,  "(\\+)?([0-9]+)"),
    /** XSD_UNSIGNED_SHORT */       XSD_UNSIGNED_SHORT       (UNSIGNED_SHORT,       Category.CAT_NUMBER,  true,  "(\\+)?([0-9]+)"),
    /** XSD_UNSIGNED_BYTE */        XSD_UNSIGNED_BYTE        (UNSIGNED_BYTE,        Category.CAT_NUMBER,  true,  "(\\+)?([0-9]+)"),
    /** XSD_DOUBLE */               XSD_DOUBLE               (DOUBLE,               Category.CAT_NUMBER,  true,  "(\\+|-)?([0-9]+(\\.[0-9]*)?|\\.[0-9]+)([Ee](\\+|-)?[0-9]+)?|(\\+|-)?INF|NaN"),
    /** XSD_FLOAT */                XSD_FLOAT                (FLOAT,                Category.CAT_NUMBER,  true,  "(\\+|-)?([0-9]+(\\.[0-9]*)?|\\.[0-9]+)([Ee](\\+|-)?[0-9]+)?|(\\+|-)?INF|NaN"),
    /** XSD_BOOLEAN */              XSD_BOOLEAN              (BOOLEAN,              Category.CAT_BOOLEAN, true,  "true|false|1|0"),
    /** XSD_HEX_BINARY */           XSD_HEX_BINARY           (HEX_BINARY,           Category.CAT_BINARY,  false, "([0-9a-fA-F]{2})*"),
    /** XSD_BASE_ */                XSD_BASE_64_BINARY       (BASE_64_BINARY,       Category.CAT_BINARY,  false, "((([A-Za-z0-9+/] ?){4})*(([A-Za-z0-9+/] ?){3}[A-Za-z0-9+/]|([A-Za-z0-9+/] ?){2}[AEIMQUYcgkosw048] ?=|[A-Za-z0-9+/] ?[AQgw] ?= ?=))?"),
    /** XSD_ANY_URI */              XSD_ANY_URI              (ANY_URI,              Category.CAT_URI,     false, ".*"),
    /** XSD_DATE_TIME */            XSD_DATE_TIME            (DATE_TIME,            Category.CAT_TIME,    false, "-?([1-9][0-9]{3,}|0[0-9]{3})-(0[1-9]|1[0-2])-(0[1-9]|[12][0-9]|3[01])T(([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?|(24:00:00(\\.0+)?))(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00))?"),
    /** XSD_DATE_TIME_STAMP */      XSD_DATE_TIME_STAMP      (DATE_TIME_STAMP,      Category.CAT_TIME,    false, "-?([1-9][0-9]{3,}|0[0-9]{3})-(0[1-9]|1[0-2])-(0[1-9]|[12][0-9]|3[01])T(([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\\\.[0-9]+)?|(24:00:00(\\\\.0+)?))(Z|(\\\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00))");
//@formatter:on
    @Nonnull
    private static final Set<IRI> ALL_IRIS = init();

    @Nonnull
    static Set<IRI> init() {try{__CLR4_5_2c83c83lvicksel.R.inc(15843);
        __CLR4_5_2c83c83lvicksel.R.inc(15844);List<IRI> iris = new ArrayList<>();
        __CLR4_5_2c83c83lvicksel.R.inc(15845);for (OWL2Datatype v : OWL2Datatype.values()) {{
            __CLR4_5_2c83c83lvicksel.R.inc(15846);iris.add(v.iri);
        }
        }__CLR4_5_2c83c83lvicksel.R.inc(15847);Collections.sort(iris);
        __CLR4_5_2c83c83lvicksel.R.inc(15848);return CollectionFactory.getCopyOnRequestSetFromImmutableCollection(iris);
    }finally{__CLR4_5_2c83c83lvicksel.R.flushNeeded();}}

    /**
     * Gets all of the built in datatype IRIs.
     * 
     * @return A set of IRIs corresponding to the set of IRIs of all built in
     *         {@code OWL2Datatype}s.
     */
    @Nonnull
    public static Set<IRI> getDatatypeIRIs() {try{__CLR4_5_2c83c83lvicksel.R.inc(15849);
        __CLR4_5_2c83c83lvicksel.R.inc(15850);return ALL_IRIS;
    }finally{__CLR4_5_2c83c83lvicksel.R.flushNeeded();}}

    /**
     * Gets the Pattern that specifies the regular expression for the allowed
     * lexical values of a datatype.
     * 
     * @return The Pattern, or {@code null}
     */
    public Pattern getPattern() {try{__CLR4_5_2c83c83lvicksel.R.inc(15851);
        __CLR4_5_2c83c83lvicksel.R.inc(15852);return pattern;
    }finally{__CLR4_5_2c83c83lvicksel.R.flushNeeded();}}

    /**
     * Gets the Pattern string that specifies the regular expression for the
     * allowed lexical values of a datatype.
     * 
     * @return The Pattern string. Not null.
     */
    @Nonnull
    public String getPatternString() {try{__CLR4_5_2c83c83lvicksel.R.inc(15853);
        __CLR4_5_2c83c83lvicksel.R.inc(15854);return regExpression;
    }finally{__CLR4_5_2c83c83lvicksel.R.flushNeeded();}}

    /**
     * Determines if the specified IRI identifies a built in datatype.
     * 
     * @param datatypeIRI
     *        The datatype IRI
     * @return {@code true} if the IRI identifies a built in datatype, or
     *         {@code false} if the IRI does not identify a built in datatype.
     */
    public static boolean isBuiltIn(IRI datatypeIRI) {try{__CLR4_5_2c83c83lvicksel.R.inc(15855);
        __CLR4_5_2c83c83lvicksel.R.inc(15856);return ALL_IRIS.contains(datatypeIRI);
    }finally{__CLR4_5_2c83c83lvicksel.R.flushNeeded();}}

    /**
     * Given an IRI that identifies an {@link OWLDatatype}, this method obtains
     * the corresponding {@code OWL2Datatype}.
     * 
     * @param datatype
     *        The datatype IRI. Not {@code null}.
     * @return The {@code OWL2Datatype} that has the specified {@link IRI}.
     * @throws OWLRuntimeException
     *         if the specified IRI is not a built in datatype IRI.
     */
    @Nonnull
    public static OWL2Datatype getDatatype(IRI datatype) {try{__CLR4_5_2c83c83lvicksel.R.inc(15857);
        __CLR4_5_2c83c83lvicksel.R.inc(15858);if ((((!isBuiltIn(datatype))&&(__CLR4_5_2c83c83lvicksel.R.iget(15859)!=0|true))||(__CLR4_5_2c83c83lvicksel.R.iget(15860)==0&false))) {{
            __CLR4_5_2c83c83lvicksel.R.inc(15861);throw new OWLRuntimeException(datatype + " is not a built in datatype!");
        }
        }__CLR4_5_2c83c83lvicksel.R.inc(15862);for (OWL2Datatype v : values()) {{
            __CLR4_5_2c83c83lvicksel.R.inc(15863);if ((((v.iri.equals(datatype))&&(__CLR4_5_2c83c83lvicksel.R.iget(15864)!=0|true))||(__CLR4_5_2c83c83lvicksel.R.iget(15865)==0&false))) {{
                __CLR4_5_2c83c83lvicksel.R.inc(15866);return v;
            }
        }}
        }__CLR4_5_2c83c83lvicksel.R.inc(15867);throw new OWLRuntimeException(datatype + " is not a built in datatype!");
    }finally{__CLR4_5_2c83c83lvicksel.R.flushNeeded();}}

    @Nonnull
    private final String shortForm;
    @Nonnull
    private final IRI iri;
    @Nonnull
    private final Category category;
    private final boolean finite;
    @Nonnull
    private final Pattern pattern;
    @Nonnull
    private final String regExpression;
    @Nonnull
    private final String prefixedName;

    OWL2Datatype(@Nonnull Namespaces namespace, @Nonnull String shortForm, @Nonnull Category category, boolean finite,
        @Nonnull String regEx) {try{__CLR4_5_2c83c83lvicksel.R.inc(15868);
        __CLR4_5_2c83c83lvicksel.R.inc(15869);iri = IRI.create(namespace.toString(), shortForm);
        __CLR4_5_2c83c83lvicksel.R.inc(15870);this.shortForm = shortForm;
        __CLR4_5_2c83c83lvicksel.R.inc(15871);prefixedName = namespace.getPrefixName() + ':' + shortForm;
        __CLR4_5_2c83c83lvicksel.R.inc(15872);this.category = category;
        __CLR4_5_2c83c83lvicksel.R.inc(15873);this.finite = finite;
        __CLR4_5_2c83c83lvicksel.R.inc(15874);regExpression = regEx;
        __CLR4_5_2c83c83lvicksel.R.inc(15875);pattern = Pattern.compile(regEx, Pattern.DOTALL);
    }finally{__CLR4_5_2c83c83lvicksel.R.flushNeeded();}}

    OWL2Datatype(@Nonnull XSDVocabulary xsd, @Nonnull Category category, boolean finite, @Nonnull String regEx) {try{__CLR4_5_2c83c83lvicksel.R.inc(15876);
        __CLR4_5_2c83c83lvicksel.R.inc(15877);iri = xsd.getIRI();
        __CLR4_5_2c83c83lvicksel.R.inc(15878);shortForm = xsd.getShortForm();
        __CLR4_5_2c83c83lvicksel.R.inc(15879);prefixedName = xsd.getPrefixedName();
        __CLR4_5_2c83c83lvicksel.R.inc(15880);this.category = category;
        __CLR4_5_2c83c83lvicksel.R.inc(15881);this.finite = finite;
        __CLR4_5_2c83c83lvicksel.R.inc(15882);regExpression = regEx;
        __CLR4_5_2c83c83lvicksel.R.inc(15883);pattern = Pattern.compile(regEx, Pattern.DOTALL);
    }finally{__CLR4_5_2c83c83lvicksel.R.flushNeeded();}}

    @Override
    public String getShortForm() {try{__CLR4_5_2c83c83lvicksel.R.inc(15884);
        __CLR4_5_2c83c83lvicksel.R.inc(15885);return shortForm;
    }finally{__CLR4_5_2c83c83lvicksel.R.flushNeeded();}}

    @Nonnull
    @Override
    public IRI getIRI() {try{__CLR4_5_2c83c83lvicksel.R.inc(15886);
        __CLR4_5_2c83c83lvicksel.R.inc(15887);return iri;
    }finally{__CLR4_5_2c83c83lvicksel.R.flushNeeded();}}

    /**
     * Gets the category for this datatype.
     * 
     * @return The category
     */
    public Category getCategory() {try{__CLR4_5_2c83c83lvicksel.R.inc(15888);
        __CLR4_5_2c83c83lvicksel.R.inc(15889);return category;
    }finally{__CLR4_5_2c83c83lvicksel.R.flushNeeded();}}

    /**
     * Determines if this datatype is a numeric datatype.
     * 
     * @return {@code true} if this datatype is a numeric datatype
     */
    public boolean isNumeric() {try{__CLR4_5_2c83c83lvicksel.R.inc(15890);
        __CLR4_5_2c83c83lvicksel.R.inc(15891);return category.equals(Category.CAT_NUMBER);
    }finally{__CLR4_5_2c83c83lvicksel.R.flushNeeded();}}

    /**
     * Determines whether or not this datatype is finite.
     * 
     * @return {@code true} if this datatype is finite, or {@code false} if this
     *         datatype is infinite.
     */
    public boolean isFinite() {try{__CLR4_5_2c83c83lvicksel.R.inc(15892);
        __CLR4_5_2c83c83lvicksel.R.inc(15893);return finite;
    }finally{__CLR4_5_2c83c83lvicksel.R.flushNeeded();}}

    /**
     * Gets the facets that are allowed for facet restrictions of this datatype.
     * 
     * @return The allowed facets
     */
    public Collection<OWLFacet> getFacets() {try{__CLR4_5_2c83c83lvicksel.R.inc(15894);
        __CLR4_5_2c83c83lvicksel.R.inc(15895);return category.getFacets();
    }finally{__CLR4_5_2c83c83lvicksel.R.flushNeeded();}}

    /**
     * Gets the equivalent OWLDatatype from the given factory.
     * 
     * @param factory
     *        the OWLDataFactory. Not {@code null}.
     * @return An {@link OWLDatatype} that has the same IRI as this
     *         {@code OWL2Datatype}. Not {@code null}.
     */
    @Nonnull
    public OWLDatatype getDatatype(@Nonnull OWLDataFactory factory) {try{__CLR4_5_2c83c83lvicksel.R.inc(15896);
        __CLR4_5_2c83c83lvicksel.R.inc(15897);checkNotNull(factory, "factory cannot be null");
        __CLR4_5_2c83c83lvicksel.R.inc(15898);return factory.getOWLDatatype(getIRI());
    }finally{__CLR4_5_2c83c83lvicksel.R.flushNeeded();}}

    /**
     * Determines if the specified string is the lexical space of this datatype.
     * 
     * @param s
     *        The string to test
     * @return {@code true} if the string is in the lexical space, otherwise
     *         {@code false}
     */
    public boolean isInLexicalSpace(@Nonnull String s) {try{__CLR4_5_2c83c83lvicksel.R.inc(15899);
        __CLR4_5_2c83c83lvicksel.R.inc(15900);return pattern.matcher(s).matches();
    }finally{__CLR4_5_2c83c83lvicksel.R.flushNeeded();}}

    @Override
    public String getPrefixedName() {try{__CLR4_5_2c83c83lvicksel.R.inc(15901);
        __CLR4_5_2c83c83lvicksel.R.inc(15902);return prefixedName;
    }finally{__CLR4_5_2c83c83lvicksel.R.flushNeeded();}}

    /** Category enum. */
    public enum Category {
        //@formatter:off
        /** NUMBER                      */ CAT_NUMBER                     ("Number",                        MIN_INCLUSIVE, MAX_INCLUSIVE, MIN_EXCLUSIVE, MAX_EXCLUSIVE), 
        /** STRING_WITH_LANGUAGE_TAG    */ CAT_STRING_WITH_LANGUAGE_TAG   ("String with a language tag",    MIN_LENGTH,    MAX_LENGTH,    LENGTH,        PATTERN,      LANG_RANGE), 
        /** STRING_WITHOUT_LANGUAGE_TAG */ CAT_STRING_WITHOUT_LANGUAGE_TAG("String without a language tag", MIN_LENGTH,    MAX_LENGTH,    LENGTH,        PATTERN), 
        /** BINARY                      */ CAT_BINARY                     ("Binary data",                   MIN_LENGTH,    MAX_LENGTH,    LENGTH), 
        /** URI                         */ CAT_URI                        ("URI",                           MIN_LENGTH,    MAX_LENGTH,    PATTERN), 
        /** TIME                        */ CAT_TIME                       ("Time instant",                  MIN_INCLUSIVE, MAX_INCLUSIVE, MIN_EXCLUSIVE, MAX_EXCLUSIVE),
        /** BOOLEAN                     */ CAT_BOOLEAN                    ("Boolean value"), 
        /** UNIVERSAL                   */ CAT_UNIVERSAL                  ("Universal literal");
        //@formatter:on
        private final String name;
        private final Set<OWLFacet> facets;

        Category(String name, OWLFacet... facets) {try{__CLR4_5_2c83c83lvicksel.R.inc(15903);
            __CLR4_5_2c83c83lvicksel.R.inc(15904);this.name = name;
            __CLR4_5_2c83c83lvicksel.R.inc(15905);Set<OWLFacet> f = new HashSet<>(Arrays.asList(facets));
            __CLR4_5_2c83c83lvicksel.R.inc(15906);this.facets = Collections.unmodifiableSet(f);
        }finally{__CLR4_5_2c83c83lvicksel.R.flushNeeded();}}

        /**
         * @return name
         */
        public String getName() {try{__CLR4_5_2c83c83lvicksel.R.inc(15907);
            __CLR4_5_2c83c83lvicksel.R.inc(15908);return name;
        }finally{__CLR4_5_2c83c83lvicksel.R.flushNeeded();}}

        /**
         * @return facets
         */
        public Set<OWLFacet> getFacets() {try{__CLR4_5_2c83c83lvicksel.R.inc(15909);
            __CLR4_5_2c83c83lvicksel.R.inc(15910);return facets;
        }finally{__CLR4_5_2c83c83lvicksel.R.flushNeeded();}}
    }

    /** Normalization enum. */
    public enum WhiteSpaceNormalisation {
        /**
         * No normalization is done, the value is not changed (this is the
         * behavior required by [XML] for element content).
         */
        PRESERVE {

            @Override
            public String getNormalisedString(@Nonnull String s) {try{__CLR4_5_2c83c83lvicksel.R.inc(15911);
                __CLR4_5_2c83c83lvicksel.R.inc(15912);return s;
            }finally{__CLR4_5_2c83c83lvicksel.R.flushNeeded();}}
        },
        /**
         * All occurrences of #x9 (tab), #xA (line feed) and #xD (carriage
         * return) are replaced with #x20 (space).
         */
        REPLACE {

            @Override
            public String getNormalisedString(@Nonnull String s) {try{__CLR4_5_2c83c83lvicksel.R.inc(15913);
                __CLR4_5_2c83c83lvicksel.R.inc(15914);return s.replaceAll("\\t|\\n|\\r", " ");
            }finally{__CLR4_5_2c83c83lvicksel.R.flushNeeded();}}
        },
        /**
         * After the processing implied by replace, contiguous sequences of
         * #x20's are collapsed to a single #x20, and any #x20 at the start or
         * end of the string is then removed.
         */
        COLLAPSE {

            @Override
            public String getNormalisedString(@Nonnull String s) {try{__CLR4_5_2c83c83lvicksel.R.inc(15915);
                __CLR4_5_2c83c83lvicksel.R.inc(15916);return REPLACE.getNormalisedString(s).replaceAll("\\s+", " ").trim();
            }finally{__CLR4_5_2c83c83lvicksel.R.flushNeeded();}}
        };

        /**
         * Gets the normalised version of a string.
         * 
         * @param s
         *        The string to normalise
         * @return The normalised string
         */
        public abstract String getNormalisedString(@Nonnull String s);
    }
;public static class __CLR4_5_2c83c83lvicksel{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0061\u0070\u0069\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237201267L,8589935092L,15917,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;}
