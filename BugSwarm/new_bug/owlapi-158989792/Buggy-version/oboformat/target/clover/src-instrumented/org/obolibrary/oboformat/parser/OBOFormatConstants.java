/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.obolibrary.oboformat.parser;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.annotation.Nonnull;

/** oboformat constants */
public class OBOFormatConstants {public static class __CLR4_5_23eu3eulvicmt4s{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u006f\u0062\u006f\u0066\u006f\u0072\u006d\u0061\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237308750L,8589935092L,4439,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** oboformat tags */
    public enum OboFormatTag {
        //@formatter:off
        /**TAG_FORMAT_VERSION*/ TAG_FORMAT_VERSION("format-version"),
        /**TAG_ONTOLOGY*/ TAG_ONTOLOGY( "ontology"),
        /**TAG_DATA_VERSION*/ TAG_DATA_VERSION( "data-version"),
        /**TAG_DATE*/ TAG_DATE( "date"),
        /**TAG_SAVED_BY*/ TAG_SAVED_BY( "saved-by"),
        /**TAG_AUTO_GENERATED_BY*/ TAG_AUTO_GENERATED_BY( "auto-generated-by"),
        /**TAG_IMPORT*/ TAG_IMPORT( "import"),
        /**TAG_SUBSETDEF*/ TAG_SUBSETDEF( "subsetdef"),
        /**TAG_SYNONYMTYPEDEF*/ TAG_SYNONYMTYPEDEF( "synonymtypedef"),
        /**TAG_DEFAULT_NAMESPACE*/ TAG_DEFAULT_NAMESPACE( "default-namespace"),
        /**TAG_IDSPACE*/ TAG_IDSPACE( "idspace"),
        /**TAG_TREAT_XREFS_AS_EQUIVALENT*/ TAG_TREAT_XREFS_AS_EQUIVALENT( "treat-xrefs-as-equivalent"),
        /**TAG_TREAT_XREFS_AS_REVERSE_GENUS_DIFFERENTIA*/ TAG_TREAT_XREFS_AS_REVERSE_GENUS_DIFFERENTIA( "treat-xrefs-as-reverse-genus-differentia"),
        /**TAG_TREAT_XREFS_AS_GENUS_DIFFERENTIA*/ TAG_TREAT_XREFS_AS_GENUS_DIFFERENTIA( "treat-xrefs-as-genus-differentia"),
        /**TAG_TREAT_XREFS_AS_RELATIONSHIP*/ TAG_TREAT_XREFS_AS_RELATIONSHIP( "treat-xrefs-as-relationship"),
        /**TAG_TREAT_XREFS_AS_IS_A*/ TAG_TREAT_XREFS_AS_IS_A( "treat-xrefs-as-is_a"),
        /**TAG_TREAT_XREFS_AS_HAS_SUBCLASS*/ TAG_TREAT_XREFS_AS_HAS_SUBCLASS( "treat-xrefs-as-has-subclass"),
        /**TAG_OWL_AXIOMS*/ TAG_OWL_AXIOMS( "owl-axioms"),
        /**TAG_REMARK*/ TAG_REMARK( "remark"),
        /**TAG_ID*/ TAG_ID( "id"),
        /**TAG_NAME*/ TAG_NAME( "name"),
        /**TAG_NAMESPACE*/ TAG_NAMESPACE( "namespace"),
        /**TAG_ALT_ID*/ TAG_ALT_ID( "alt_id"),
        /**TAG_DEF*/ TAG_DEF( "def"),
        /**TAG_COMMENT*/ TAG_COMMENT( "comment"),
        /**TAG_SUBSET*/ TAG_SUBSET( "subset"),
        /**TAG_SYNONYM*/ TAG_SYNONYM( "synonym"),
        /**TAG_XREF*/ TAG_XREF( "xref"),
        /**TAG_BUILTIN*/ TAG_BUILTIN( "builtin"),
        /**TAG_PROPERTY_VALUE*/ TAG_PROPERTY_VALUE( "property_value"),
        /**TAG_IS_A*/ TAG_IS_A( "is_a"),
        /**TAG_INTERSECTION_OF*/ TAG_INTERSECTION_OF( "intersection_of"),
        /**TAG_UNION_OF*/ TAG_UNION_OF( "union_of"),
        /**TAG_EQUIVALENT_TO*/ TAG_EQUIVALENT_TO( "equivalent_to"),
        /**TAG_DISJOINT_FROM*/ TAG_DISJOINT_FROM( "disjoint_from"),
        /**TAG_RELATIONSHIP*/ TAG_RELATIONSHIP( "relationship"),
        /**TAG_CREATED_BY*/ TAG_CREATED_BY( "created_by"),
        /**TAG_CREATION_DATE*/ TAG_CREATION_DATE( "creation_date"),
        /**TAG_IS_OBSELETE*/ TAG_IS_OBSELETE( "is_obsolete"),
        /**TAG_REPLACED_BY*/ TAG_REPLACED_BY( "replaced_by"),
        /**TAG_IS_ANONYMOUS*/ TAG_IS_ANONYMOUS( "is_anonymous"),
        /**TAG_DOMAIN*/ TAG_DOMAIN( "domain"),
        /**TAG_RANGE*/ TAG_RANGE( "range"),
        /**TAG_IS_ANTI_SYMMETRIC*/ TAG_IS_ANTI_SYMMETRIC( "is_anti_symmetric"),
        /**TAG_IS_CYCLIC*/ TAG_IS_CYCLIC( "is_cyclic"),
        /**TAG_IS_REFLEXIVE*/ TAG_IS_REFLEXIVE( "is_reflexive"),
        /**TAG_IS_SYMMETRIC*/ TAG_IS_SYMMETRIC( "is_symmetric"),
        /**TAG_IS_TRANSITIVE*/ TAG_IS_TRANSITIVE( "is_transitive"),
        /**TAG_IS_FUNCTIONAL*/ TAG_IS_FUNCTIONAL( "is_functional"),
        /**TAG_IS_INVERSE_FUNCTIONAL*/ TAG_IS_INVERSE_FUNCTIONAL( "is_inverse_functional"),
        /**TAG_TRANSITIVE_OVER*/ TAG_TRANSITIVE_OVER( "transitive_over"),
        /**TAG_HOLDS_OVER_CHAIN*/ TAG_HOLDS_OVER_CHAIN( "holds_over_chain"),
        /**TAG_EQUIVALENT_TO_CHAIN*/ TAG_EQUIVALENT_TO_CHAIN( "equivalent_to_chain"),
        /**TAG_DISJOINT_OVER*/ TAG_DISJOINT_OVER( "disjoint_over"),
        /**TAG_EXPAND_ASSERTION_TO*/ TAG_EXPAND_ASSERTION_TO( "expand_assertion_to"),
        /**TAG_EXPAND_EXPRESSION_TO*/ TAG_EXPAND_EXPRESSION_TO( "expand_expression_to"),
        /**TAG_IS_CLASS_LEVEL_TAG*/ TAG_IS_CLASS_LEVEL_TAG( "is_class_level"),
        /**TAG_IS_METADATA_TAG*/ TAG_IS_METADATA_TAG("is_metadata_tag"),
        /**TAG_CONSIDER*/ TAG_CONSIDER("consider"),
        /**TAG_INVERSE_OF*/ TAG_INVERSE_OF("inverse_of"),
        /**TAG_IS_ASYMMETRIC*/ TAG_IS_ASYMMETRIC("is_asymmetric"),
        /**TAG_NAMESPACE_ID_RULE*/ TAG_NAMESPACE_ID_RULE("namespace-id-rule"),
        /**TAG_LOGICAL_DEFINITION_VIEW_RELATION*/ TAG_LOGICAL_DEFINITION_VIEW_RELATION("logical-definition-view-relation"),
        
        // these are keywords, not tags, but we keep them here for convenience
        /**scope*/ 
        TAG_SCOPE("scope"), 
        /** implicit, in synonymtypedef*/
        TAG_HAS_SYNONYM_TYPE("has_synonym_type"),
        /** implicit, in synonym*/
        /**broad*/
        TAG_BROAD("BROAD"), 
        /**narrow*/
        TAG_NARROW("NARROW"),
        /**exact*/
        TAG_EXACT("EXACT"),
        /**related*/
        TAG_RELATED("RELATED");
        @Nonnull
        private final  String tag;

        OboFormatTag(@Nonnull String tag) {try{__CLR4_5_23eu3eulvicmt4s.R.inc(4422);
            __CLR4_5_23eu3eulvicmt4s.R.inc(4423);this.tag = tag;
        }finally{__CLR4_5_23eu3eulvicmt4s.R.flushNeeded();}}

        /** @return tag */@Nonnull 
        public String getTag() {try{__CLR4_5_23eu3eulvicmt4s.R.inc(4424);
            __CLR4_5_23eu3eulvicmt4s.R.inc(4425);return tag;
        }finally{__CLR4_5_23eu3eulvicmt4s.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_5_23eu3eulvicmt4s.R.inc(4426);
            __CLR4_5_23eu3eulvicmt4s.R.inc(4427);return tag;
        }finally{__CLR4_5_23eu3eulvicmt4s.R.flushNeeded();}}
    }

    
    private static final Map<String, OboFormatTag> TAGSTABLE=initTagsTable();
    static Map<String, OboFormatTag> initTagsTable(){try{__CLR4_5_23eu3eulvicmt4s.R.inc(4428);
        __CLR4_5_23eu3eulvicmt4s.R.inc(4429);Map<String, OboFormatTag> tags = new HashMap<>();
        __CLR4_5_23eu3eulvicmt4s.R.inc(4430);for (OboFormatTag tag : OboFormatTag.values()) {{
            __CLR4_5_23eu3eulvicmt4s.R.inc(4431);tags.put(tag.getTag(), tag);
        }
        }__CLR4_5_23eu3eulvicmt4s.R.inc(4432);return tags;
    }finally{__CLR4_5_23eu3eulvicmt4s.R.flushNeeded();}}
    /** tags */@Nonnull
    public static final Set<String> TAGS=TAGSTABLE.keySet();

    /** @param tag
     *            tag
     * @return oboformat tag */
    public static OboFormatTag getTag(String tag) {try{__CLR4_5_23eu3eulvicmt4s.R.inc(4433);
        __CLR4_5_23eu3eulvicmt4s.R.inc(4434);return TAGSTABLE.get(tag);
    }finally{__CLR4_5_23eu3eulvicmt4s.R.flushNeeded();}}

    /** Date format for OboFormatTag.TAG_DATE Use Thread local to ensure thread
     * safety, as {@link SimpleDateFormat} is not thread safe. 
     * @deprecated use headerDateFormat() - ThreadLocal do not work nicely with web applications*/
    @Deprecated
    public static final ThreadLocal<DateFormat> headerDateFormat = new ThreadLocal<DateFormat>() {
        @Nonnull
        @Override
        protected DateFormat initialValue() {try{__CLR4_5_23eu3eulvicmt4s.R.inc(4435);
            __CLR4_5_23eu3eulvicmt4s.R.inc(4436);return new SimpleDateFormat("dd:MM:yyyy HH:mm");
        }finally{__CLR4_5_23eu3eulvicmt4s.R.flushNeeded();}}
    };
    /** @return Date format for OboFormatTag.TAG_DATE*/
    public static final DateFormat headerDateFormat() {try{__CLR4_5_23eu3eulvicmt4s.R.inc(4437);
            __CLR4_5_23eu3eulvicmt4s.R.inc(4438);return new SimpleDateFormat("dd:MM:yyyy HH:mm");
        }finally{__CLR4_5_23eu3eulvicmt4s.R.flushNeeded();}}
    
    /** UTF-8 default encoding */
    public static final String DEFAULT_CHARACTER_ENCODING = "UTF-8";
}
