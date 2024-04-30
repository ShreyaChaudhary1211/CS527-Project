/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.obolibrary.obo2owl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.obolibrary.oboformat.parser.OBOFormatConstants.OboFormatTag;
import org.semanticweb.owlapi.model.HasIRI;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLEntity;

/**
 * @author Shahid Manzoor
 */
public class Obo2OWLConstants {public static class __CLR4_5_22mt2mtlvicmt1d{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u006f\u0062\u006f\u0066\u006f\u0072\u006d\u0061\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237308750L,8589935092L,3444,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** default iri */
    @Nonnull
    public static final String DEFAULT_IRI_PREFIX = "http://purl.obolibrary.org/obo/";
    /** OIO vocabulary prefix */
    @Nonnull
    public static final String OIOVOCAB_IRI_PREFIX = "http://www.geneontology.org/formats/oboInOwl#";
    /** IRI for the 'has obsolescence reason' annotation property */
    @Nonnull
    public static final IRI IRI_IAO_0000231 = IRI.create(DEFAULT_IRI_PREFIX + "IAO_0000231");
    /** IRI for the 'terms merged' individual */
    @Nonnull
    public static final IRI IRI_IAO_0000227 = IRI.create(DEFAULT_IRI_PREFIX + "IAO_0000227");

    /**
     * @param d
     *        date to format
     * @return formatted string
     */
    @Nonnull
    public static synchronized String format(@Nonnull Date d) {try{__CLR4_5_22mt2mtlvicmt1d.R.inc(3413);
        __CLR4_5_22mt2mtlvicmt1d.R.inc(3414);return FORMATTER.format(d);
    }finally{__CLR4_5_22mt2mtlvicmt1d.R.flushNeeded();}}

    private static final SimpleDateFormat FORMATTER = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");

    /** obo to owl vocabulary */
    public enum Obo2OWLVocabulary implements HasIRI {
        //@formatter:off
        /**IRI_IAO_0000424*/    IRI_IAO_0000424(DEFAULT_IRI_PREFIX, "IAO_0000424", "expand expression to", OboFormatTag.TAG_EXPAND_EXPRESSION_TO.getTag()),
        /**IRI_IAO_0000425*/    IRI_IAO_0000425(DEFAULT_IRI_PREFIX, "IAO_0000425", "expand assertion to", OboFormatTag.TAG_EXPAND_ASSERTION_TO.getTag()),
        /**IRI_IAO_0000115*/    IRI_IAO_0000115(DEFAULT_IRI_PREFIX, "IAO_0000115", "definition", OboFormatTag.TAG_DEF.getTag()),
        //                      IRI_IAO_0000118(DEFAULT_IRI_PREFIX, "IAO_0000118", "alternative term", OboFormatTag.TAG_SYNONYM.getTag()),
        /**IRI_IAO_0000427*/    IRI_IAO_0000427(DEFAULT_IRI_PREFIX, "IAO_0000427", "antisymmetric property", OboFormatTag.TAG_IS_ANTI_SYMMETRIC.getTag()),
        /**IRI_IAO_0100001*/    IRI_IAO_0100001(DEFAULT_IRI_PREFIX, "IAO_0100001", "term replaced by", OboFormatTag.TAG_REPLACED_BY.getTag()),
        /**IRI_OIO_shorthand*/  IRI_OIO_shorthand(OIOVOCAB_IRI_PREFIX, "shorthand", "shorthand", "shorthand"),
        /**IRI_OIO_consider*/   IRI_OIO_consider(OIOVOCAB_IRI_PREFIX, "consider", "consider", OboFormatTag.TAG_CONSIDER.getTag()),
        /**IRI_OIO_hasOBOFormatVersion*/        IRI_OIO_hasOBOFormatVersion(OIOVOCAB_IRI_PREFIX, "hasOBOFormatVersion", "has_obo_format_version", OboFormatTag.TAG_FORMAT_VERSION.getTag()),
        /**IRI_OIO_treatXrefsAsIsA*/            IRI_OIO_treatXrefsAsIsA(OIOVOCAB_IRI_PREFIX, "treat-xrefs-as-is_a", "treat-xrefs-as-is_a", OboFormatTag.TAG_TREAT_XREFS_AS_IS_A.getTag()),
        /**IRI_OIO_treatXrefsAsHasSubClass*/    IRI_OIO_treatXrefsAsHasSubClass(OIOVOCAB_IRI_PREFIX, "treat-xrefs-as-has-subclass", "treat-xrefs-as-has-subclass", OboFormatTag.TAG_TREAT_XREFS_AS_HAS_SUBCLASS.getTag()),
        /**IRI_OIO_treatXrefsAsRelationship*/   IRI_OIO_treatXrefsAsRelationship(OIOVOCAB_IRI_PREFIX, "treat-xrefs-as-relationship", "treat-xrefs-as-relationship", OboFormatTag.TAG_TREAT_XREFS_AS_RELATIONSHIP.getTag()),
        /**IRI_OIO_treatXrefsAsGenusDifferentia*/           IRI_OIO_treatXrefsAsGenusDifferentia(OIOVOCAB_IRI_PREFIX, "treat-xrefs-as-genus-differentia", "treat-xrefs-as-genus-differentia", OboFormatTag.TAG_TREAT_XREFS_AS_GENUS_DIFFERENTIA.getTag()),
        /**IRI_OIO_treatXrefsAsReverseGenusDifferentia*/    IRI_OIO_treatXrefsAsReverseGenusDifferentia(OIOVOCAB_IRI_PREFIX, "treat-xrefs-as-reverse-genus-differentia", "treat-xrefs-as-reverse-genus-differentia", OboFormatTag.TAG_TREAT_XREFS_AS_REVERSE_GENUS_DIFFERENTIA.getTag()),
        /**IRI_OIO_treatXrefsAsEquivalent*/                 IRI_OIO_treatXrefsAsEquivalent(OIOVOCAB_IRI_PREFIX, "treat-xrefs-as-equivalent", "treat-xrefs-as-equivalent", OboFormatTag.TAG_TREAT_XREFS_AS_EQUIVALENT.getTag()),
        /**IRI_OIO_hasOboNamespace*/    IRI_OIO_hasOboNamespace(OIOVOCAB_IRI_PREFIX, "hasOBONamespace", "has_obo_namespace", OboFormatTag.TAG_NAMESPACE.getTag()),
        /**IRI_OIO_hasDbXref*/          IRI_OIO_hasDbXref(OIOVOCAB_IRI_PREFIX, "hasDbXref", "database_cross_reference", OboFormatTag.TAG_XREF.getTag()),
        /**hasAlternativeId*/           hasAlternativeId(OIOVOCAB_IRI_PREFIX, "hasAlternativeId", "has_alternative_id", OboFormatTag.TAG_ALT_ID.getTag()),
        /**IRI_OIO_inSubset*/           IRI_OIO_inSubset(OIOVOCAB_IRI_PREFIX, "inSubset", "in_subset", OboFormatTag.TAG_SUBSET.getTag()),
        /**IRI_OIO_hasScope*/           IRI_OIO_hasScope(OIOVOCAB_IRI_PREFIX, "hasScope", "has_scope", OboFormatTag.TAG_SCOPE.getTag()),
        /**IRI_OIO_hasBroadSynonym*/    IRI_OIO_hasBroadSynonym(OIOVOCAB_IRI_PREFIX, "hasBroadSynonym", "has_broad_synonym", OboFormatTag.TAG_BROAD.getTag()),
        /**IRI_OIO_hasNarrowSynonym*/   IRI_OIO_hasNarrowSynonym(OIOVOCAB_IRI_PREFIX, "hasNarrowSynonym", "has_narrow_synonym", OboFormatTag.TAG_NARROW.getTag()),
        /**IRI_OIO_hasExactSynonym*/    IRI_OIO_hasExactSynonym(OIOVOCAB_IRI_PREFIX, "hasExactSynonym", "has_exact_synonym", OboFormatTag.TAG_EXACT.getTag()),
        /**IRI_OIO_hasRelatedSynonym*/  IRI_OIO_hasRelatedSynonym(OIOVOCAB_IRI_PREFIX, "hasRelatedSynonym", "has_related_synonym", OboFormatTag.TAG_RELATED.getTag()),
        /**hasSynonymType*/             hasSynonymType(OIOVOCAB_IRI_PREFIX, "hasSynonymType", "has_synonym_type", OboFormatTag.TAG_HAS_SYNONYM_TYPE.getTag()),
        /**IRI_OIO_Subset*/             IRI_OIO_Subset(OIOVOCAB_IRI_PREFIX, "SubsetProperty", "subset_property", OboFormatTag.TAG_SUBSETDEF.getTag()),
        /**IRI_OIO_SynonymType*/        IRI_OIO_SynonymType(OIOVOCAB_IRI_PREFIX, "SynonymTypeProperty", "synonym_type_property", OboFormatTag.TAG_SYNONYMTYPEDEF.getTag()),
        /**IRI_OIO_NamespaceIdRule*/    IRI_OIO_NamespaceIdRule(OIOVOCAB_IRI_PREFIX, "NamespaceIdRule", "namespace-id-rule", OboFormatTag.TAG_NAMESPACE_ID_RULE.getTag()),
        /**IRI_OIO_LogicalDefinitionViewRelation*/          IRI_OIO_LogicalDefinitionViewRelation(OIOVOCAB_IRI_PREFIX, "logical-definition-view-relation", "logical-definition-view-relation", OboFormatTag.TAG_LOGICAL_DEFINITION_VIEW_RELATION.getTag());
        //@formatter:on
        @Nonnull
        final IRI iri;
        @Nonnull
        final String namespace;
        @Nonnull
        final String shortName;
        @Nonnull
        final String label;
        @Nonnull
        final String mappedTag;

        Obo2OWLVocabulary(@Nonnull String namespce, @Nonnull String shortName, @Nonnull String label,
            @Nonnull String mappedTag) {try{__CLR4_5_22mt2mtlvicmt1d.R.inc(3415);
            __CLR4_5_22mt2mtlvicmt1d.R.inc(3416);iri = IRI.create(namespce + shortName);
            __CLR4_5_22mt2mtlvicmt1d.R.inc(3417);this.shortName = shortName;
            __CLR4_5_22mt2mtlvicmt1d.R.inc(3418);namespace = namespce;
            __CLR4_5_22mt2mtlvicmt1d.R.inc(3419);this.label = label;
            __CLR4_5_22mt2mtlvicmt1d.R.inc(3420);this.mappedTag = mappedTag;
        }finally{__CLR4_5_22mt2mtlvicmt1d.R.flushNeeded();}}

        /**
         * @return short name
         */
        @Nonnull
        public String getShortName() {try{__CLR4_5_22mt2mtlvicmt1d.R.inc(3421);
            __CLR4_5_22mt2mtlvicmt1d.R.inc(3422);return shortName;
        }finally{__CLR4_5_22mt2mtlvicmt1d.R.flushNeeded();}}

        /**
         * @return namespace
         */
        @Nonnull
        public String getNamespace() {try{__CLR4_5_22mt2mtlvicmt1d.R.inc(3423);
            __CLR4_5_22mt2mtlvicmt1d.R.inc(3424);return namespace;
        }finally{__CLR4_5_22mt2mtlvicmt1d.R.flushNeeded();}}

        @Override
        public IRI getIRI() {try{__CLR4_5_22mt2mtlvicmt1d.R.inc(3425);
            __CLR4_5_22mt2mtlvicmt1d.R.inc(3426);return iri;
        }finally{__CLR4_5_22mt2mtlvicmt1d.R.flushNeeded();}}

        /**
         * @return label
         */
        @Nonnull
        public String getLabel() {try{__CLR4_5_22mt2mtlvicmt1d.R.inc(3427);
            __CLR4_5_22mt2mtlvicmt1d.R.inc(3428);return label;
        }finally{__CLR4_5_22mt2mtlvicmt1d.R.flushNeeded();}}

        /**
         * @return mapped tag
         */
        @Nonnull
        public String getMappedTag() {try{__CLR4_5_22mt2mtlvicmt1d.R.inc(3429);
            __CLR4_5_22mt2mtlvicmt1d.R.inc(3430);return mappedTag;
        }finally{__CLR4_5_22mt2mtlvicmt1d.R.flushNeeded();}}

        /**
         * @param e
         *        entity to check
         * @return true if e has the same iri as the enum value, false if e is
         *         null or has a different iri
         */
        public boolean sameIRI(@Nullable OWLEntity e) {try{__CLR4_5_22mt2mtlvicmt1d.R.inc(3431);
            // if a null value is passed in, then no match
            __CLR4_5_22mt2mtlvicmt1d.R.inc(3432);if ((((e == null)&&(__CLR4_5_22mt2mtlvicmt1d.R.iget(3433)!=0|true))||(__CLR4_5_22mt2mtlvicmt1d.R.iget(3434)==0&false))) {{
                __CLR4_5_22mt2mtlvicmt1d.R.inc(3435);return false;
            }
            }__CLR4_5_22mt2mtlvicmt1d.R.inc(3436);return iri.equals(e.getIRI());
        }finally{__CLR4_5_22mt2mtlvicmt1d.R.flushNeeded();}}
    }

    private static final Map<String, Obo2OWLVocabulary> TAGSTOVOCAB = initTagsToVocab();

    static Map<String, Obo2OWLVocabulary> initTagsToVocab() {try{__CLR4_5_22mt2mtlvicmt1d.R.inc(3437);
        __CLR4_5_22mt2mtlvicmt1d.R.inc(3438);Map<String, Obo2OWLVocabulary> tags = new HashMap<>();
        __CLR4_5_22mt2mtlvicmt1d.R.inc(3439);for (Obo2OWLVocabulary vocab : Obo2OWLVocabulary.values()) {{
            __CLR4_5_22mt2mtlvicmt1d.R.inc(3440);tags.put(vocab.mappedTag, vocab);
        }
        }__CLR4_5_22mt2mtlvicmt1d.R.inc(3441);return tags;
    }finally{__CLR4_5_22mt2mtlvicmt1d.R.flushNeeded();}}

    /**
     * @param tag
     *        tag
     * @return obj for tag
     */
    public static Obo2OWLVocabulary getVocabularyObj(String tag) {try{__CLR4_5_22mt2mtlvicmt1d.R.inc(3442);
        __CLR4_5_22mt2mtlvicmt1d.R.inc(3443);return TAGSTOVOCAB.get(tag);
    }finally{__CLR4_5_22mt2mtlvicmt1d.R.flushNeeded();}}
}
