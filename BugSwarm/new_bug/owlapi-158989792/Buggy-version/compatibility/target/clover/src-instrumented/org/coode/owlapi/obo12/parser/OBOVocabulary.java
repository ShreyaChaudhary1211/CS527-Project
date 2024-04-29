/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * This file is part of the OWL API.
 *
 * The contents of this file are subject to the LGPL License, Version 3.0.
 *
 * Copyright (C) 2011, The University of Manchester
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see http://www.gnu.org/licenses/.
 *
 *
 * Alternatively, the contents of this file may be used under the terms of the Apache License, Version 2.0
 * in which case, the provisions of the Apache License Version 2.0 are applicable instead of those above.
 *
 * Copyright 2011, University of Manchester
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.coode.owlapi.obo12.parser;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.vocab.DublinCoreVocabulary;
import org.semanticweb.owlapi.vocab.OWLRDFVocabulary;

/**
 * Author: Matthew Horridge<br>
 * The University Of Manchester<br>
 * Bio-Health Informatics Group<br>
 * Date: 10-Jan-2007<br>
 * <br>
 */
@SuppressWarnings("javadoc")
public enum OBOVocabulary {
    DATA_VERSION("data-version"), VERSION("version"), DATE("date", DublinCoreVocabulary.DATE.getIRI()), SAVED_BY(
        "saved-by"), AUTO_GENERATED_BY("auto-generated-by"), ONTOLOGY("ontology"), SUBSETDEF("subsetdef",
            OBOPrefix.OBO_IN_OWL, "SubsetProperty"), IMPORT("import"), SYNONYM_TYPE_DEF("synonymtypedef",
                OBOPrefix.OBO_IN_OWL, "SynonymTypeProperty"), SYNONYM_TYPE("synonym-type", OBOPrefix.OBO_IN_OWL,
                    "hasSynonymType"), ID_SPACE("id_space"), DEFAULT_RELATIONSHIP_ID_PREFIX(
                        "default-relationship-id-prefix"), ID_MAPPING("id-mapping"), REMARK("remark"), ID("id"), NAME(
                            "name", OWLRDFVocabulary.RDFS_LABEL.getIRI()), FORMAT_VERSION("format-version"), TYPEDEF(
                                "Typedef"), ALT_ID("alt_id", OBOPrefix.OBO_IN_OWL, "hasAlternativeId"), SHORT_HAND(
                                    "shorthand", OBOPrefix.OBO_IN_OWL, "shorthand"), ALT_NAME("alt_name"), NAMESPACE(
                                        "namespace"), DEFAULT_NAMESPACE("default-namespace"), DEF("def"), COMMENT(
                                            "comment", OWLRDFVocabulary.RDFS_COMMENT.getIRI()), SUBSET("subset",
                                                OBOPrefix.OBO_IN_OWL, "inSubset"), SYNONYM("synonym"), HAS_SCOPE(
                                                    "hasScope", OBOPrefix.OBO_IN_OWL), RELATED_SYNONYM("relatedSynonym",
                                                        OBOPrefix.OBO_IN_OWL, "hasRelatedSynonym"), EXACT_SYNONYM(
                                                            "exactSynonym", OBOPrefix.OBO_IN_OWL,
                                                            "hasExactSynonym"), BROAD_SYNONYM("broadSynonym",
                                                                OBOPrefix.OBO_IN_OWL,
                                                                "hasBroadSynonym"), NARROW_SYNONYM("narrowSynonym",
                                                                    OBOPrefix.OBO_IN_OWL, "hasNarrowSynonym"), XREF(
                                                                        "xref", OBOPrefix.OBO_IN_OWL), XREF_ANALOGUE(
                                                                            "xref_analogue"), XREF_UNKNOWN(
                                                                                "xref_unk"), IS_A("is_a"), IS_OBSOLETE(
                                                                                    "is_obsolete",
                                                                                    OWLRDFVocabulary.OWL_DEPRECATED
                                                                                        .getIRI()), PART_OF(
                                                                                            "part_of"), RELATIONSHIP(
                                                                                                "relationship"), REPLACED_BY(
                                                                                                    "replaced_by"), CONSIDER(
                                                                                                        "consider",
                                                                                                        OBOPrefix.OBO_IN_OWL,
                                                                                                        "consider"), USE_TERM(
                                                                                                            "use_term"), DOMAIN(
                                                                                                                "domain"), RANGE(
                                                                                                                    "range"), IS_CYCLIC(
                                                                                                                        "is_cyclic"), IS_TRANSITIVE(
                                                                                                                            "is_transitive"), IS_SYMMETRIC(
                                                                                                                                "is_symmetric"), IS_ASYMMETRIC(
                                                                                                                                    "is_asymmetric"), IS_REFLEXIVE(
                                                                                                                                        "is_reflexive"), INVERSE(
                                                                                                                                            "inverse"), TRANSITIVE_OVER(
                                                                                                                                                "transitive_over"), INTERSECTION_OF(
                                                                                                                                                    "intersection_of"), UNION_OF(
                                                                                                                                                        "union_of"), DISJOINT_FROM(
                                                                                                                                                            "disjoint_from"), TERM(
                                                                                                                                                                "Term"), BUILTIN(
                                                                                                                                                                    "builtin"), IS_METADATA_TAG(
                                                                                                                                                                        "is_metadata_tag"), CARDINALITY(
                                                                                                                                                                            "cardinality"), MAX_CARDINALITY(
                                                                                                                                                                                "maxCardinality"), MIN_CARDINALITY(
                                                                                                                                                                                    "minCardinality"), INSTANCE(
                                                                                                                                                                                        "Instance"), INSTANCE_OF(
                                                                                                                                                                                            "instance_of"), PROPERTY_VALUE(
                                                                                                                                                                                                "property_value"), IS_ANONYMOUS(
                                                                                                                                                                                                    "is_anonymous");

    /**
     * @deprecated Use {@link #OBO_IRI_BASE}
     */
    @Deprecated
    public static final String ONTOLOGY_URI_BASE = "http://purl.org/obo/owl";
    /**
     * @deprecated Use {@link #OBO_IRI_BASE}
     */
    @Deprecated
    public static final String ANNOTATION_URI_BASE = OBOPrefix.OBO_IN_OWL.getPrefix();
    public static final String OBO_IRI_BASE = OBOPrefix.OBO.getPrefix();
    public static final String LEGACY_OBO_IRI_BASE = "http://purl.org/obo/owl/";//
    /**
     * The pattern for OBO IDs. Specified at
     * <a href="http://www.obofoundry.org/id-policy.shtml" >http://www.
     * obofoundry.org/id-policy.shtml</a>
     */
    public static final Pattern OBO_ID_PATTERN = Pattern.compile("(([^:]+):)?(.+)");
    private static final String bases = Pattern.quote(OBO_IRI_BASE) + "|" + Pattern.quote(ONTOLOGY_URI_BASE + "/") + "|"
        + Pattern.quote(LEGACY_OBO_IRI_BASE) + "|" + Pattern.quote(ANNOTATION_URI_BASE);
    public static final Pattern OBO_IRI_PATTERN = Pattern.compile("(" + bases + ")"
        + "(([^\\_]*)\\_)?([A-Za-z0-9\\_\\-]*)");
    private static final IDSpaceManager DEFAULT_ID_SPACE_MANAGER = new IDSpaceManager() {

        @Override
        public void setIRIPrefix(String idPrefix, String iriPrefix) {try{__CLR4_5_21y51y5lvicnlh2.R.inc(2525);
            __CLR4_5_21y51y5lvicnlh2.R.inc(2526);throw new RuntimeException("The default id space manager must not be used for custom prefixes.");
        }finally{__CLR4_5_21y51y5lvicnlh2.R.flushNeeded();}}
    };

    /**
     * Converts OBO Ids to IRIs. The conversion is defined at
     * <a href="http://www.obofoundry.org/id-policy.shtml" >http://www.
     * obofoundry.org/id-policy.shtml</a>
     * 
     * @param oboId
     *        The Id to convert
     * @return The IRI of the converted Id
     */
    public static IRI ID2IRI(@Nonnull String oboId) {try{__CLR4_5_21y51y5lvicnlh2.R.inc(2527);
        __CLR4_5_21y51y5lvicnlh2.R.inc(2528);return ID2IRI(oboId, DEFAULT_ID_SPACE_MANAGER);
    }finally{__CLR4_5_21y51y5lvicnlh2.R.flushNeeded();}}

    /**
     * Converts OBO Ids to IRIs. The conversion is defined at
     * <a href="http://www.obofoundry.org/id-policy.shtml" >http://www.
     * obofoundry.org/id-policy.shtml</a>.
     * 
     * @param oboId
     *        The OBO Id to convert.
     * @param idSpaceManager
     *        An {@link IDSpaceManager} which can be used to customise the IRI
     *        prefixes used in the conversion.
     * @return The IRI of the converted Id.
     */
    public static IRI ID2IRI(@Nonnull String oboId, IDSpaceManager idSpaceManager) {try{__CLR4_5_21y51y5lvicnlh2.R.inc(2529);
        __CLR4_5_21y51y5lvicnlh2.R.inc(2530);Matcher matcher = OBO_ID_PATTERN.matcher(oboId);
        __CLR4_5_21y51y5lvicnlh2.R.inc(2531);if ((((matcher.matches())&&(__CLR4_5_21y51y5lvicnlh2.R.iget(2532)!=0|true))||(__CLR4_5_21y51y5lvicnlh2.R.iget(2533)==0&false))) {{
            __CLR4_5_21y51y5lvicnlh2.R.inc(2534);String idSpace = matcher.group(2);
            __CLR4_5_21y51y5lvicnlh2.R.inc(2535);String localId = matcher.group(3);
            __CLR4_5_21y51y5lvicnlh2.R.inc(2536);StringBuilder sb = new StringBuilder();
            __CLR4_5_21y51y5lvicnlh2.R.inc(2537);String iriPrefix = idSpaceManager.getIRIPrefix(idSpace);
            __CLR4_5_21y51y5lvicnlh2.R.inc(2538);sb.append(iriPrefix);
            __CLR4_5_21y51y5lvicnlh2.R.inc(2539);if ((((idSpace != null)&&(__CLR4_5_21y51y5lvicnlh2.R.iget(2540)!=0|true))||(__CLR4_5_21y51y5lvicnlh2.R.iget(2541)==0&false))) {{
                __CLR4_5_21y51y5lvicnlh2.R.inc(2542);sb.append(idSpace);
                __CLR4_5_21y51y5lvicnlh2.R.inc(2543);sb.append("_");
            }
            }__CLR4_5_21y51y5lvicnlh2.R.inc(2544);sb.append(localId);
            __CLR4_5_21y51y5lvicnlh2.R.inc(2545);return IRI.create(sb.toString());
        } }else {{
            __CLR4_5_21y51y5lvicnlh2.R.inc(2546);return IRI.create(oboId);
        }
    }}finally{__CLR4_5_21y51y5lvicnlh2.R.flushNeeded();}}

    // Format of Foundry-compliant URIs
    // FOUNDRY_OBO_URI ::= "http://purl.obolibrary.org/obo/" IDSPACE "_" LOCALID
    // Format of OBO legacy URIs
    // Those are found in documents that were natively authored using the OBO
    // format and which were converted using the NCBOoboInOwl script before this
    // policy was put in place.
    // LEGACY_OBO_URI ::= "http://purl.org/obo/owl/" IDSPACE "#" IDSPACE "_"
    // LOCALID
    public static String IRI2ID(IRI oboIRI) {try{__CLR4_5_21y51y5lvicnlh2.R.inc(2547);
        __CLR4_5_21y51y5lvicnlh2.R.inc(2548);Matcher matcher = OBO_IRI_PATTERN.matcher(oboIRI.toString());
        __CLR4_5_21y51y5lvicnlh2.R.inc(2549);if ((((matcher.matches())&&(__CLR4_5_21y51y5lvicnlh2.R.iget(2550)!=0|true))||(__CLR4_5_21y51y5lvicnlh2.R.iget(2551)==0&false))) {{
            __CLR4_5_21y51y5lvicnlh2.R.inc(2552);String idSpace = matcher.group(3);
            __CLR4_5_21y51y5lvicnlh2.R.inc(2553);String localId = matcher.group(4);
            __CLR4_5_21y51y5lvicnlh2.R.inc(2554);StringBuilder sb = new StringBuilder();
            __CLR4_5_21y51y5lvicnlh2.R.inc(2555);if ((((idSpace != null)&&(__CLR4_5_21y51y5lvicnlh2.R.iget(2556)!=0|true))||(__CLR4_5_21y51y5lvicnlh2.R.iget(2557)==0&false))) {{
                __CLR4_5_21y51y5lvicnlh2.R.inc(2558);sb.append(idSpace);
                __CLR4_5_21y51y5lvicnlh2.R.inc(2559);sb.append(":");
            }
            }__CLR4_5_21y51y5lvicnlh2.R.inc(2560);sb.append(localId);
            __CLR4_5_21y51y5lvicnlh2.R.inc(2561);return sb.toString();
        } }else {{
            __CLR4_5_21y51y5lvicnlh2.R.inc(2562);throw new RuntimeException("Not an OBO IRI");
        }
    }}finally{__CLR4_5_21y51y5lvicnlh2.R.flushNeeded();}}

    public static boolean isOBOIRI(IRI oboIRI) {try{__CLR4_5_21y51y5lvicnlh2.R.inc(2563);
        __CLR4_5_21y51y5lvicnlh2.R.inc(2564);return OBO_ID_PATTERN.matcher(oboIRI.toString()).matches();
    }finally{__CLR4_5_21y51y5lvicnlh2.R.flushNeeded();}}

    private static final List<OBOVocabulary> headerTags = Arrays.asList(FORMAT_VERSION, DATA_VERSION, DATE, SAVED_BY,
        AUTO_GENERATED_BY, SUBSETDEF, IMPORT, SYNONYM_TYPE_DEF, ID_SPACE, DEFAULT_RELATIONSHIP_ID_PREFIX, ID_MAPPING,
        REMARK);
    private static final List<OBOVocabulary> termStanzaTags = Arrays.asList(ID, NAME, NAMESPACE, ALT_ID, DEF, COMMENT,
        SUBSET, SYNONYM, XREF, IS_A, INTERSECTION_OF, UNION_OF, DISJOINT_FROM, RELATIONSHIP, IS_OBSOLETE, REPLACED_BY,
        CONSIDER);
    private static final List<OBOVocabulary> typeDefStanzaTags = Arrays.asList(ID, NAME, NAMESPACE, ALT_ID, DEF,
        COMMENT, SUBSET, SYNONYM, XREF, DOMAIN, RANGE, IS_ASYMMETRIC, IS_CYCLIC, IS_REFLEXIVE, IS_SYMMETRIC,
        IS_TRANSITIVE, IS_A, INVERSE, TRANSITIVE_OVER, RELATIONSHIP, IS_METADATA_TAG, IS_OBSOLETE, REPLACED_BY,
        CONSIDER);
    private static final List<OBOVocabulary> instanceStanzaTags = Arrays.asList(ID, NAME, NAMESPACE, ALT_ID, DEF,
        COMMENT, SYNONYM, XREF, INSTANCE_OF, PROPERTY_VALUE, IS_OBSOLETE, REPLACED_BY, CONSIDER);

    OBOVocabulary(@Nonnull String name) {try{__CLR4_5_21y51y5lvicnlh2.R.inc(2565);
        __CLR4_5_21y51y5lvicnlh2.R.inc(2566);this.name = name;
        __CLR4_5_21y51y5lvicnlh2.R.inc(2567);iri = IRI.create(OBOPrefix.OBO.getPrefix() + name);
    }finally{__CLR4_5_21y51y5lvicnlh2.R.flushNeeded();}}

    OBOVocabulary(@Nonnull String name, @Nonnull OBOPrefix prefix) {try{__CLR4_5_21y51y5lvicnlh2.R.inc(2568);
        __CLR4_5_21y51y5lvicnlh2.R.inc(2569);this.name = name;
        __CLR4_5_21y51y5lvicnlh2.R.inc(2570);iri = IRI.create(prefix.getPrefix() + name);
    }finally{__CLR4_5_21y51y5lvicnlh2.R.flushNeeded();}}

    OBOVocabulary(@Nonnull String name, OBOPrefix prefix, String localName) {try{__CLR4_5_21y51y5lvicnlh2.R.inc(2571);
        __CLR4_5_21y51y5lvicnlh2.R.inc(2572);this.name = name;
        __CLR4_5_21y51y5lvicnlh2.R.inc(2573);iri = IRI.create(prefix.getPrefix() + localName);
    }finally{__CLR4_5_21y51y5lvicnlh2.R.flushNeeded();}}

    OBOVocabulary(@Nonnull String name, @Nonnull IRI iri) {try{__CLR4_5_21y51y5lvicnlh2.R.inc(2574);
        __CLR4_5_21y51y5lvicnlh2.R.inc(2575);this.name = name;
        __CLR4_5_21y51y5lvicnlh2.R.inc(2576);this.iri = iri;
    }finally{__CLR4_5_21y51y5lvicnlh2.R.flushNeeded();}}

    @Nonnull
    private String name;
    @Nonnull
    private IRI iri;

    @Nonnull
    public String getName() {try{__CLR4_5_21y51y5lvicnlh2.R.inc(2577);
        __CLR4_5_21y51y5lvicnlh2.R.inc(2578);return name;
    }finally{__CLR4_5_21y51y5lvicnlh2.R.flushNeeded();}}

    @Nonnull
    public IRI getIRI() {try{__CLR4_5_21y51y5lvicnlh2.R.inc(2579);
        __CLR4_5_21y51y5lvicnlh2.R.inc(2580);return iri;
    }finally{__CLR4_5_21y51y5lvicnlh2.R.flushNeeded();}}

    @Override
    @Nonnull
    public String toString() {try{__CLR4_5_21y51y5lvicnlh2.R.inc(2581);
        __CLR4_5_21y51y5lvicnlh2.R.inc(2582);return name;
    }finally{__CLR4_5_21y51y5lvicnlh2.R.flushNeeded();}}

    public static List<OBOVocabulary> getHeaderTags() {try{__CLR4_5_21y51y5lvicnlh2.R.inc(2583);
        __CLR4_5_21y51y5lvicnlh2.R.inc(2584);return new ArrayList<>(headerTags);
    }finally{__CLR4_5_21y51y5lvicnlh2.R.flushNeeded();}}

    public static List<OBOVocabulary> getTermStanzaTags() {try{__CLR4_5_21y51y5lvicnlh2.R.inc(2585);
        __CLR4_5_21y51y5lvicnlh2.R.inc(2586);return new ArrayList<>(termStanzaTags);
    }finally{__CLR4_5_21y51y5lvicnlh2.R.flushNeeded();}}

    public static List<OBOVocabulary> getTypeDefStanzaTags() {try{__CLR4_5_21y51y5lvicnlh2.R.inc(2587);
        __CLR4_5_21y51y5lvicnlh2.R.inc(2588);return new ArrayList<>(typeDefStanzaTags);
    }finally{__CLR4_5_21y51y5lvicnlh2.R.flushNeeded();}}

    public static List<OBOVocabulary> getInstanceStanzaTags() {try{__CLR4_5_21y51y5lvicnlh2.R.inc(2589);
        __CLR4_5_21y51y5lvicnlh2.R.inc(2590);return new ArrayList<>(instanceStanzaTags);
    }finally{__CLR4_5_21y51y5lvicnlh2.R.flushNeeded();}}
;public static class __CLR4_5_21y51y5lvicnlh2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006d\u0070\u0061\u0074\u0069\u0062\u0069\u006c\u0069\u0074\u0079\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237345588L,8589935092L,2591,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;}
