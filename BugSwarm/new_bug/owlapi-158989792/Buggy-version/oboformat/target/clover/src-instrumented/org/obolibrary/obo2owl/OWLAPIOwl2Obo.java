/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.obolibrary.obo2owl;

import static org.semanticweb.owlapi.search.EntitySearcher.getAnnotationObjects;
import static org.semanticweb.owlapi.util.OWLAPIPreconditions.verifyNotNull;

import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.obolibrary.obo2owl.Obo2OWLConstants.Obo2OWLVocabulary;
import org.obolibrary.obo2owl.OwlStringTools.OwlStringException;
import org.obolibrary.oboformat.model.Clause;
import org.obolibrary.oboformat.model.Frame;
import org.obolibrary.oboformat.model.Frame.FrameType;
import org.obolibrary.oboformat.model.OBODoc;
import org.obolibrary.oboformat.model.QualifierValue;
import org.obolibrary.oboformat.model.Xref;
import org.obolibrary.oboformat.parser.OBOFormatConstants;
import org.obolibrary.oboformat.parser.OBOFormatConstants.OboFormatTag;
import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.vocab.Namespaces;
import org.semanticweb.owlapi.vocab.OWL2Datatype;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.base.Optional;
import com.google.common.collect.Sets;

/**
 * The Class OWLAPIOwl2Obo.
 */
public class OWLAPIOwl2Obo {public static class __CLR4_5_21cz1czlvicmt0y{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u006f\u0062\u006f\u0066\u006f\u0072\u006d\u0061\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237308750L,8589935092L,3413,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Nonnull
    private static final String TOP_BOTTOM_NONTRANSLATEABLE = "Assertions using owl:Thing or owl:Nothing are not translateable OBO";
    /**
     * The log.
     */
    private static final Logger LOG = LoggerFactory.getLogger(OWLAPIOwl2Obo.class);
    private static final String IRI_CLASS_SYNONYMTYPEDEF = Obo2OWLConstants.DEFAULT_IRI_PREFIX + "IAO_synonymtypedef";
    private static final String IRI_CLASS_SUBSETDEF = Obo2OWLConstants.DEFAULT_IRI_PREFIX + "IAO_subsetdef";
    /**
     * The absoulte url pattern.
     */
    protected final Pattern absoulteURLPattern = Pattern.compile("<\\s*http.*?>");
    private static final Set<String> SKIPPED_QUALIFIERS = Sets.newHashSet("gci_relation", "gci_filler", "cardinality",
        "minCardinality", "maxCardinality", "all_some", "all_only");
    /**
     * The manager.
     */
    @Nonnull
    protected OWLOntologyManager manager;
    /**
     * The owl ontology.
     */
    protected OWLOntology owlOntology;
    /**
     * The fac.
     */
    protected OWLDataFactory fac;
    /**
     * The obodoc.
     */
    protected OBODoc obodoc;
    /**
     * The untranslatable axioms.
     */
    protected Set<OWLAxiom> untranslatableAxioms;
    /**
     * The id space map.
     */
    protected Map<String, String> idSpaceMap;
    /**
     * The annotation property map.
     */
    @Nonnull
    public static final Map<String, String> ANNOTATIONPROPERTYMAP = initAnnotationPropertyMap();
    /**
     * The ap to declare.
     */
    protected Set<OWLAnnotationProperty> apToDeclare;
    /**
     * The ontology id.
     */
    protected String ontologyId;
    /**
     * The strict conversion.
     */
    protected boolean strictConversion;
    /**
     * The discard untranslatable.
     */
    protected boolean discardUntranslatable = false;
    /**
     * mute untranslatable axiom warnings
     */
    private boolean muteUntranslatableAxioms = false;

    protected final void init() {try{__CLR4_5_21cz1czlvicmt0y.R.inc(1763);
        __CLR4_5_21cz1czlvicmt0y.R.inc(1764);idSpaceMap = new HashMap<>();
        // legacy:
        __CLR4_5_21cz1czlvicmt0y.R.inc(1765);idSpaceMap.put("http://www.obofoundry.org/ro/ro.owl#", "OBO_REL");
        __CLR4_5_21cz1czlvicmt0y.R.inc(1766);untranslatableAxioms = new HashSet<>();
        __CLR4_5_21cz1czlvicmt0y.R.inc(1767);fac = manager.getOWLDataFactory();
        __CLR4_5_21cz1czlvicmt0y.R.inc(1768);apToDeclare = new HashSet<>();
    }finally{__CLR4_5_21cz1czlvicmt0y.R.flushNeeded();}}

    /**
     * Instantiates a new oWLAPI owl2 obo.
     * 
     * @param translationManager
     *        the translation manager
     */
    public OWLAPIOwl2Obo(@Nonnull OWLOntologyManager translationManager) {try{__CLR4_5_21cz1czlvicmt0y.R.inc(1769);
        __CLR4_5_21cz1czlvicmt0y.R.inc(1770);manager = translationManager;
        __CLR4_5_21cz1czlvicmt0y.R.inc(1771);init();
    }finally{__CLR4_5_21cz1czlvicmt0y.R.flushNeeded();}}

    /**
     * Inits the annotation property map.
     * 
     * @return the hash map
     */
    @Nonnull
    protected static Map<String, String> initAnnotationPropertyMap() {try{__CLR4_5_21cz1czlvicmt0y.R.inc(1772);
        __CLR4_5_21cz1czlvicmt0y.R.inc(1773);Map<String, String> map = new HashMap<>();
        __CLR4_5_21cz1czlvicmt0y.R.inc(1774);for (String key : OWLAPIObo2Owl.ANNOTATIONPROPERTYMAP.keySet()) {{
            __CLR4_5_21cz1czlvicmt0y.R.inc(1775);IRI propIRI = OWLAPIObo2Owl.ANNOTATIONPROPERTYMAP.get(key);
            __CLR4_5_21cz1czlvicmt0y.R.inc(1776);map.put(propIRI.toString(), key);
        }
        }__CLR4_5_21cz1czlvicmt0y.R.inc(1777);return map;
    }finally{__CLR4_5_21cz1czlvicmt0y.R.flushNeeded();}}

    /**
     * Sets the strict conversion.
     * 
     * @param b
     *        the new strict conversion
     */
    public void setStrictConversion(boolean b) {try{__CLR4_5_21cz1czlvicmt0y.R.inc(1778);
        __CLR4_5_21cz1czlvicmt0y.R.inc(1779);strictConversion = b;
    }finally{__CLR4_5_21cz1czlvicmt0y.R.flushNeeded();}}

    /**
     * Gets the strict conversion.
     * 
     * @return the strict conversion
     */
    public boolean getStrictConversion() {try{__CLR4_5_21cz1czlvicmt0y.R.inc(1780);
        __CLR4_5_21cz1czlvicmt0y.R.inc(1781);return strictConversion;
    }finally{__CLR4_5_21cz1czlvicmt0y.R.flushNeeded();}}

    /**
     * Checks if is discard untranslatable.
     * 
     * @return the discardUntranslatable
     */
    public boolean isDiscardUntranslatable() {try{__CLR4_5_21cz1czlvicmt0y.R.inc(1782);
        __CLR4_5_21cz1czlvicmt0y.R.inc(1783);return discardUntranslatable;
    }finally{__CLR4_5_21cz1czlvicmt0y.R.flushNeeded();}}

    /**
     * Sets the discard untranslatable.
     * 
     * @param discardUntranslatable
     *        the discardUntranslatable to set
     */
    public void setDiscardUntranslatable(boolean discardUntranslatable) {try{__CLR4_5_21cz1czlvicmt0y.R.inc(1784);
        __CLR4_5_21cz1czlvicmt0y.R.inc(1785);this.discardUntranslatable = discardUntranslatable;
    }finally{__CLR4_5_21cz1czlvicmt0y.R.flushNeeded();}}

    /**
     * Gets the manager.
     * 
     * @return the manager
     */
    public OWLOntologyManager getManager() {try{__CLR4_5_21cz1czlvicmt0y.R.inc(1786);
        __CLR4_5_21cz1czlvicmt0y.R.inc(1787);return manager;
    }finally{__CLR4_5_21cz1czlvicmt0y.R.flushNeeded();}}

    /**
     * Sets the manager.
     * 
     * @param manager
     *        the new manager
     */
    public void setManager(@Nonnull OWLOntologyManager manager) {try{__CLR4_5_21cz1czlvicmt0y.R.inc(1788);
        __CLR4_5_21cz1czlvicmt0y.R.inc(1789);this.manager = manager;
    }finally{__CLR4_5_21cz1czlvicmt0y.R.flushNeeded();}}

    /**
     * Gets the obodoc.
     * 
     * @return the obodoc
     */
    @Nonnull
    public OBODoc getObodoc() {try{__CLR4_5_21cz1czlvicmt0y.R.inc(1790);
        __CLR4_5_21cz1czlvicmt0y.R.inc(1791);return verifyNotNull(obodoc);
    }finally{__CLR4_5_21cz1czlvicmt0y.R.flushNeeded();}}

    /**
     * Sets the obodoc.
     * 
     * @param obodoc
     *        the new obodoc
     */
    public void setObodoc(@Nonnull OBODoc obodoc) {try{__CLR4_5_21cz1czlvicmt0y.R.inc(1792);
        __CLR4_5_21cz1czlvicmt0y.R.inc(1793);this.obodoc = obodoc;
    }finally{__CLR4_5_21cz1czlvicmt0y.R.flushNeeded();}}

    /**
     * Convert.
     * 
     * @param ont
     *        the ont
     * @return the oBO doc
     */
    @Nonnull
    public OBODoc convert(@Nonnull OWLOntology ont) {try{__CLR4_5_21cz1czlvicmt0y.R.inc(1794);
        __CLR4_5_21cz1czlvicmt0y.R.inc(1795);owlOntology = ont;
        __CLR4_5_21cz1czlvicmt0y.R.inc(1796);ontologyId = getOntologyId(ont);
        __CLR4_5_21cz1czlvicmt0y.R.inc(1797);init();
        __CLR4_5_21cz1czlvicmt0y.R.inc(1798);return tr();
    }finally{__CLR4_5_21cz1czlvicmt0y.R.flushNeeded();}}

    @Nonnull
    protected OWLOntology getOWLOntology() {try{__CLR4_5_21cz1czlvicmt0y.R.inc(1799);
        __CLR4_5_21cz1czlvicmt0y.R.inc(1800);return verifyNotNull(owlOntology);
    }finally{__CLR4_5_21cz1czlvicmt0y.R.flushNeeded();}}

    /**
     * Gets the untranslatable axioms.
     * 
     * @return the untranslatableAxioms
     */
    public Collection<OWLAxiom> getUntranslatableAxioms() {try{__CLR4_5_21cz1czlvicmt0y.R.inc(1801);
        __CLR4_5_21cz1czlvicmt0y.R.inc(1802);return untranslatableAxioms;
    }finally{__CLR4_5_21cz1czlvicmt0y.R.flushNeeded();}}

    /**
     * Tr.
     * 
     * @return the oBO doc
     */
    @Nonnull
    protected OBODoc tr() {try{__CLR4_5_21cz1czlvicmt0y.R.inc(1803);
        __CLR4_5_21cz1czlvicmt0y.R.inc(1804);setObodoc(new OBODoc());
        __CLR4_5_21cz1czlvicmt0y.R.inc(1805);preProcess();
        __CLR4_5_21cz1czlvicmt0y.R.inc(1806);tr(getOWLOntology());
        __CLR4_5_21cz1czlvicmt0y.R.inc(1807);for (OWLAxiom ax : getOWLOntology().getAxioms()) {{
            __CLR4_5_21cz1czlvicmt0y.R.inc(1808);if ((((ax instanceof OWLDeclarationAxiom)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(1809)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(1810)==0&false))) {{
                __CLR4_5_21cz1czlvicmt0y.R.inc(1811);tr((OWLDeclarationAxiom) ax);
            } }else {__CLR4_5_21cz1czlvicmt0y.R.inc(1812);if ((((ax instanceof OWLSubClassOfAxiom)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(1813)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(1814)==0&false))) {{
                __CLR4_5_21cz1czlvicmt0y.R.inc(1815);tr((OWLSubClassOfAxiom) ax);
            } }else {__CLR4_5_21cz1czlvicmt0y.R.inc(1816);if ((((ax instanceof OWLDisjointClassesAxiom)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(1817)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(1818)==0&false))) {{
                __CLR4_5_21cz1czlvicmt0y.R.inc(1819);tr((OWLDisjointClassesAxiom) ax);
            } }else {__CLR4_5_21cz1czlvicmt0y.R.inc(1820);if ((((ax instanceof OWLEquivalentClassesAxiom)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(1821)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(1822)==0&false))) {{
                __CLR4_5_21cz1czlvicmt0y.R.inc(1823);tr((OWLEquivalentClassesAxiom) ax);
            } }else {__CLR4_5_21cz1czlvicmt0y.R.inc(1824);if ((((ax instanceof OWLClassAssertionAxiom)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(1825)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(1826)==0&false))) {{
                __CLR4_5_21cz1czlvicmt0y.R.inc(1827);tr((OWLClassAssertionAxiom) ax);
            } }else {__CLR4_5_21cz1czlvicmt0y.R.inc(1828);if ((((ax instanceof OWLEquivalentObjectPropertiesAxiom)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(1829)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(1830)==0&false))) {{
                __CLR4_5_21cz1czlvicmt0y.R.inc(1831);tr((OWLEquivalentObjectPropertiesAxiom) ax);
            } }else {__CLR4_5_21cz1czlvicmt0y.R.inc(1832);if ((((ax instanceof OWLSubAnnotationPropertyOfAxiom)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(1833)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(1834)==0&false))) {{
                __CLR4_5_21cz1czlvicmt0y.R.inc(1835);tr((OWLSubAnnotationPropertyOfAxiom) ax);
            } }else {__CLR4_5_21cz1czlvicmt0y.R.inc(1836);if ((((ax instanceof OWLSubObjectPropertyOfAxiom)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(1837)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(1838)==0&false))) {{
                __CLR4_5_21cz1czlvicmt0y.R.inc(1839);tr((OWLSubObjectPropertyOfAxiom) ax);
            } }else {__CLR4_5_21cz1czlvicmt0y.R.inc(1840);if ((((ax instanceof OWLObjectPropertyRangeAxiom)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(1841)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(1842)==0&false))) {{
                __CLR4_5_21cz1czlvicmt0y.R.inc(1843);tr((OWLObjectPropertyRangeAxiom) ax);
            } }else {__CLR4_5_21cz1czlvicmt0y.R.inc(1844);if ((((ax instanceof OWLFunctionalObjectPropertyAxiom)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(1845)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(1846)==0&false))) {{
                __CLR4_5_21cz1czlvicmt0y.R.inc(1847);tr((OWLFunctionalObjectPropertyAxiom) ax);
            } }else {__CLR4_5_21cz1czlvicmt0y.R.inc(1848);if ((((ax instanceof OWLSymmetricObjectPropertyAxiom)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(1849)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(1850)==0&false))) {{
                __CLR4_5_21cz1czlvicmt0y.R.inc(1851);tr((OWLSymmetricObjectPropertyAxiom) ax);
            } }else {__CLR4_5_21cz1czlvicmt0y.R.inc(1852);if ((((ax instanceof OWLAsymmetricObjectPropertyAxiom)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(1853)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(1854)==0&false))) {{
                __CLR4_5_21cz1czlvicmt0y.R.inc(1855);tr((OWLAsymmetricObjectPropertyAxiom) ax);
            } }else {__CLR4_5_21cz1czlvicmt0y.R.inc(1856);if ((((ax instanceof OWLObjectPropertyDomainAxiom)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(1857)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(1858)==0&false))) {{
                __CLR4_5_21cz1czlvicmt0y.R.inc(1859);tr((OWLObjectPropertyDomainAxiom) ax);
            } }else {__CLR4_5_21cz1czlvicmt0y.R.inc(1860);if ((((ax instanceof OWLInverseFunctionalObjectPropertyAxiom)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(1861)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(1862)==0&false))) {{
                __CLR4_5_21cz1czlvicmt0y.R.inc(1863);tr((OWLInverseFunctionalObjectPropertyAxiom) ax);
            } }else {__CLR4_5_21cz1czlvicmt0y.R.inc(1864);if ((((ax instanceof OWLInverseObjectPropertiesAxiom)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(1865)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(1866)==0&false))) {{
                __CLR4_5_21cz1czlvicmt0y.R.inc(1867);tr((OWLInverseObjectPropertiesAxiom) ax);
            } }else {__CLR4_5_21cz1czlvicmt0y.R.inc(1868);if ((((ax instanceof OWLDisjointObjectPropertiesAxiom)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(1869)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(1870)==0&false))) {{
                __CLR4_5_21cz1czlvicmt0y.R.inc(1871);tr((OWLDisjointObjectPropertiesAxiom) ax);
            } }else {__CLR4_5_21cz1czlvicmt0y.R.inc(1872);if ((((ax instanceof OWLReflexiveObjectPropertyAxiom)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(1873)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(1874)==0&false))) {{
                __CLR4_5_21cz1czlvicmt0y.R.inc(1875);tr((OWLReflexiveObjectPropertyAxiom) ax);
            } }else {__CLR4_5_21cz1czlvicmt0y.R.inc(1876);if ((((ax instanceof OWLTransitiveObjectPropertyAxiom)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(1877)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(1878)==0&false))) {{
                __CLR4_5_21cz1czlvicmt0y.R.inc(1879);tr((OWLTransitiveObjectPropertyAxiom) ax);
            } }else {__CLR4_5_21cz1czlvicmt0y.R.inc(1880);if ((((ax instanceof OWLSubPropertyChainOfAxiom)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(1881)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(1882)==0&false))) {{
                __CLR4_5_21cz1czlvicmt0y.R.inc(1883);tr((OWLSubPropertyChainOfAxiom) ax);
            } }else {{
                __CLR4_5_21cz1czlvicmt0y.R.inc(1884);if ((((!(ax instanceof OWLAnnotationAssertionAxiom))&&(__CLR4_5_21cz1czlvicmt0y.R.iget(1885)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(1886)==0&false))) {{
                    __CLR4_5_21cz1czlvicmt0y.R.inc(1887);error(ax, false);
                } }else {{
                    // we presume this has been processed
                }
            }}
        }}}}}}}}}}}}}}}}}}}}
        }__CLR4_5_21cz1czlvicmt0y.R.inc(1888);if ((((!untranslatableAxioms.isEmpty() && !discardUntranslatable)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(1889)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(1890)==0&false))) {{
            __CLR4_5_21cz1czlvicmt0y.R.inc(1891);try {
                __CLR4_5_21cz1czlvicmt0y.R.inc(1892);String axiomString = OwlStringTools.translate(untranslatableAxioms, manager);
                __CLR4_5_21cz1czlvicmt0y.R.inc(1893);if ((((axiomString != null)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(1894)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(1895)==0&false))) {{
                    __CLR4_5_21cz1czlvicmt0y.R.inc(1896);Frame headerFrame = getObodoc().getHeaderFrame();
                    __CLR4_5_21cz1czlvicmt0y.R.inc(1897);if ((((headerFrame == null)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(1898)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(1899)==0&false))) {{
                        __CLR4_5_21cz1czlvicmt0y.R.inc(1900);headerFrame = new Frame(FrameType.HEADER);
                        __CLR4_5_21cz1czlvicmt0y.R.inc(1901);getObodoc().setHeaderFrame(headerFrame);
                    }
                    }__CLR4_5_21cz1czlvicmt0y.R.inc(1902);headerFrame.addClause(new Clause(OboFormatTag.TAG_OWL_AXIOMS, axiomString));
                }
            }} catch (OwlStringException e) {
                __CLR4_5_21cz1czlvicmt0y.R.inc(1903);throw new OWLRuntimeException(e);
            }
        }
        }__CLR4_5_21cz1czlvicmt0y.R.inc(1904);return getObodoc();
    }finally{__CLR4_5_21cz1czlvicmt0y.R.flushNeeded();}}

    /**
     * Pre process.
     */
    @SuppressWarnings("null")
    protected void preProcess() {try{__CLR4_5_21cz1czlvicmt0y.R.inc(1905);
        // converse of postProcess in obo2owl
        __CLR4_5_21cz1czlvicmt0y.R.inc(1906);String viewRel = null;
        __CLR4_5_21cz1czlvicmt0y.R.inc(1907);for (OWLAnnotation ann : getOWLOntology().getAnnotations()) {{
            __CLR4_5_21cz1czlvicmt0y.R.inc(1908);if ((((ann.getProperty().getIRI().equals(Obo2OWLVocabulary.IRI_OIO_LogicalDefinitionViewRelation.getIRI()))&&(__CLR4_5_21cz1czlvicmt0y.R.iget(1909)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(1910)==0&false))) {{
                __CLR4_5_21cz1czlvicmt0y.R.inc(1911);OWLAnnotationValue v = ann.getValue();
                __CLR4_5_21cz1czlvicmt0y.R.inc(1912);if ((((v instanceof OWLLiteral)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(1913)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(1914)==0&false))) {{
                    __CLR4_5_21cz1czlvicmt0y.R.inc(1915);viewRel = ((OWLLiteral) v).getLiteral();
                } }else {{
                    __CLR4_5_21cz1czlvicmt0y.R.inc(1916);viewRel = getIdentifier((IRI) v);
                }
                }__CLR4_5_21cz1czlvicmt0y.R.inc(1917);break;
            }
        }}
        }__CLR4_5_21cz1czlvicmt0y.R.inc(1918);if ((((viewRel != null)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(1919)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(1920)==0&false))) {{
            // OWLObjectProperty vp = fac.getOWLObjectProperty(pIRI);
            __CLR4_5_21cz1czlvicmt0y.R.inc(1921);Set<OWLAxiom> rmAxioms = new HashSet<>();
            __CLR4_5_21cz1czlvicmt0y.R.inc(1922);Set<OWLAxiom> newAxioms = new HashSet<>();
            __CLR4_5_21cz1czlvicmt0y.R.inc(1923);for (OWLEquivalentClassesAxiom eca : getOWLOntology().getAxioms(AxiomType.EQUIVALENT_CLASSES)) {{
                __CLR4_5_21cz1czlvicmt0y.R.inc(1924);int numNamed = 0;
                __CLR4_5_21cz1czlvicmt0y.R.inc(1925);Set<OWLClassExpression> xs = new HashSet<>();
                __CLR4_5_21cz1czlvicmt0y.R.inc(1926);for (OWLClassExpression x : eca.getClassExpressions()) {{
                    __CLR4_5_21cz1czlvicmt0y.R.inc(1927);if ((((x instanceof OWLClass)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(1928)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(1929)==0&false))) {{
                        __CLR4_5_21cz1czlvicmt0y.R.inc(1930);xs.add(x);
                        __CLR4_5_21cz1czlvicmt0y.R.inc(1931);numNamed++;
                        __CLR4_5_21cz1czlvicmt0y.R.inc(1932);continue;
                    } }else {__CLR4_5_21cz1czlvicmt0y.R.inc(1933);if ((((x instanceof OWLObjectSomeValuesFrom)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(1934)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(1935)==0&false))) {{
                        __CLR4_5_21cz1czlvicmt0y.R.inc(1936);OWLObjectProperty p = (OWLObjectProperty) ((OWLObjectSomeValuesFrom) x).getProperty();
                        __CLR4_5_21cz1czlvicmt0y.R.inc(1937);if ((((!getIdentifier(p).equals(viewRel))&&(__CLR4_5_21cz1czlvicmt0y.R.iget(1938)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(1939)==0&false))) {{
                            __CLR4_5_21cz1czlvicmt0y.R.inc(1940);LOG.error("Expected: {} got: {} in {}", viewRel, p, eca);
                        }
                        }__CLR4_5_21cz1czlvicmt0y.R.inc(1941);xs.add(((OWLObjectSomeValuesFrom) x).getFiller());
                    } }else {{
                        __CLR4_5_21cz1czlvicmt0y.R.inc(1942);LOG.error("Unexpected: {}", eca);
                    }
                }}}
                }__CLR4_5_21cz1czlvicmt0y.R.inc(1943);if ((((numNamed == 1)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(1944)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(1945)==0&false))) {{
                    __CLR4_5_21cz1czlvicmt0y.R.inc(1946);rmAxioms.add(eca);
                    __CLR4_5_21cz1czlvicmt0y.R.inc(1947);newAxioms.add(fac.getOWLEquivalentClassesAxiom(xs));
                } }else {{
                    __CLR4_5_21cz1czlvicmt0y.R.inc(1948);LOG.error("ECA did not fit expected pattern: {}", eca);
                }
            }}
            }__CLR4_5_21cz1czlvicmt0y.R.inc(1949);manager.removeAxioms(getOWLOntology(), rmAxioms);
            __CLR4_5_21cz1czlvicmt0y.R.inc(1950);manager.addAxioms(getOWLOntology(), newAxioms);
        }
    }}finally{__CLR4_5_21cz1czlvicmt0y.R.flushNeeded();}}

    protected void add(@Nullable Frame f) {try{__CLR4_5_21cz1czlvicmt0y.R.inc(1951);
        __CLR4_5_21cz1czlvicmt0y.R.inc(1952);if ((((f != null)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(1953)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(1954)==0&false))) {{
            __CLR4_5_21cz1czlvicmt0y.R.inc(1955);try {
                __CLR4_5_21cz1czlvicmt0y.R.inc(1956);getObodoc().addFrame(f);
            } catch (Exception ex) {
                __CLR4_5_21cz1czlvicmt0y.R.inc(1957);LOG.error(ex.getMessage(), ex);
            }
        }
    }}finally{__CLR4_5_21cz1czlvicmt0y.R.flushNeeded();}}

    /**
     * Tr object property.
     * 
     * @param prop
     *        the prop
     * @param tag
     *        the tag
     * @param value
     *        the value
     * @param annotations
     *        the annotations
     * @return true, if successful
     */
    @SuppressWarnings("null")
    protected boolean trObjectProperty(@Nullable OWLObjectProperty prop, @Nullable String tag, @Nullable String value,
        @Nonnull Set<OWLAnnotation> annotations) {try{__CLR4_5_21cz1czlvicmt0y.R.inc(1958);
        __CLR4_5_21cz1czlvicmt0y.R.inc(1959);if ((((prop == null || value == null)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(1960)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(1961)==0&false))) {{
            __CLR4_5_21cz1czlvicmt0y.R.inc(1962);return false;
        }
        }__CLR4_5_21cz1czlvicmt0y.R.inc(1963);Frame f = getTypedefFrame(prop);
        __CLR4_5_21cz1czlvicmt0y.R.inc(1964);Clause clause;
        __CLR4_5_21cz1czlvicmt0y.R.inc(1965);if ((((OboFormatTag.TAG_ID.getTag().equals(tag))&&(__CLR4_5_21cz1czlvicmt0y.R.iget(1966)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(1967)==0&false))) {{
            __CLR4_5_21cz1czlvicmt0y.R.inc(1968);clause = f.getClause(tag);
            __CLR4_5_21cz1czlvicmt0y.R.inc(1969);if ((((tag != null)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(1970)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(1971)==0&false))) {{
                __CLR4_5_21cz1czlvicmt0y.R.inc(1972);clause.setValue(value);
            } }else {{
                __CLR4_5_21cz1czlvicmt0y.R.inc(1973);clause = new Clause(tag, value);
                __CLR4_5_21cz1czlvicmt0y.R.inc(1974);f.addClause(clause);
            }
        }} }else {{
            __CLR4_5_21cz1czlvicmt0y.R.inc(1975);clause = new Clause(tag, value);
            __CLR4_5_21cz1czlvicmt0y.R.inc(1976);f.addClause(clause);
        }
        }__CLR4_5_21cz1czlvicmt0y.R.inc(1977);addQualifiers(clause, annotations);
        __CLR4_5_21cz1czlvicmt0y.R.inc(1978);return true;
    }finally{__CLR4_5_21cz1czlvicmt0y.R.flushNeeded();}}

    /**
     * Tr object property.
     * 
     * @param prop
     *        the prop
     * @param tag
     *        the tag
     * @param value
     *        the value
     * @param annotations
     *        the annotations
     * @return true, if successful
     */
    protected boolean trObjectProperty(@Nullable OWLObjectProperty prop, String tag, @Nullable Boolean value,
        @Nonnull Set<OWLAnnotation> annotations) {try{__CLR4_5_21cz1czlvicmt0y.R.inc(1979);
        __CLR4_5_21cz1czlvicmt0y.R.inc(1980);if ((((prop == null || value == null)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(1981)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(1982)==0&false))) {{
            __CLR4_5_21cz1czlvicmt0y.R.inc(1983);return false;
        }
        }__CLR4_5_21cz1czlvicmt0y.R.inc(1984);Frame f = getTypedefFrame(prop);
        __CLR4_5_21cz1czlvicmt0y.R.inc(1985);Clause clause = new Clause(tag);
        __CLR4_5_21cz1czlvicmt0y.R.inc(1986);clause.addValue(value);
        __CLR4_5_21cz1czlvicmt0y.R.inc(1987);f.addClause(clause);
        __CLR4_5_21cz1czlvicmt0y.R.inc(1988);addQualifiers(clause, annotations);
        __CLR4_5_21cz1czlvicmt0y.R.inc(1989);return true;
    }finally{__CLR4_5_21cz1czlvicmt0y.R.flushNeeded();}}

    /**
     * Tr nary property axiom.
     * 
     * @param ax
     *        the ax
     * @param tag
     *        the tag
     */
    protected void trNaryPropertyAxiom(@Nonnull OWLNaryPropertyAxiom<OWLObjectPropertyExpression> ax, String tag) {try{__CLR4_5_21cz1czlvicmt0y.R.inc(1990);
        __CLR4_5_21cz1czlvicmt0y.R.inc(1991);Set<OWLObjectPropertyExpression> set = ax.getProperties();
        __CLR4_5_21cz1czlvicmt0y.R.inc(1992);if ((((set.size() > 1)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(1993)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(1994)==0&false))) {{
            __CLR4_5_21cz1czlvicmt0y.R.inc(1995);boolean first = true;
            __CLR4_5_21cz1czlvicmt0y.R.inc(1996);OWLObjectProperty prop = null;
            __CLR4_5_21cz1czlvicmt0y.R.inc(1997);String disjointFrom = null;
            __CLR4_5_21cz1czlvicmt0y.R.inc(1998);for (OWLObjectPropertyExpression ex : set) {{
                __CLR4_5_21cz1czlvicmt0y.R.inc(1999);if ((((ex.isBottomEntity() || ex.isTopEntity())&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2000)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2001)==0&false))) {{
                    __CLR4_5_21cz1czlvicmt0y.R.inc(2002);error(tag + " using Top or Bottom entities are not supported in OBO.", ax, false);
                    __CLR4_5_21cz1czlvicmt0y.R.inc(2003);return;
                }
                }__CLR4_5_21cz1czlvicmt0y.R.inc(2004);if ((((first)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2005)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2006)==0&false))) {{
                    __CLR4_5_21cz1czlvicmt0y.R.inc(2007);first = false;
                    __CLR4_5_21cz1czlvicmt0y.R.inc(2008);if ((((ex instanceof OWLObjectProperty)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2009)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2010)==0&false))) {{
                        __CLR4_5_21cz1czlvicmt0y.R.inc(2011);prop = (OWLObjectProperty) ex;
                    }
                }} }else {{
                    __CLR4_5_21cz1czlvicmt0y.R.inc(2012);disjointFrom = getIdentifier(ex); // getIdentifier(ex);
                }
            }}
            }__CLR4_5_21cz1czlvicmt0y.R.inc(2013);if ((((trObjectProperty(prop, tag, disjointFrom, ax.getAnnotations()))&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2014)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2015)==0&false))) {{
                __CLR4_5_21cz1czlvicmt0y.R.inc(2016);return;
            }
        }}
        }__CLR4_5_21cz1czlvicmt0y.R.inc(2017);error(ax, true);
    }finally{__CLR4_5_21cz1czlvicmt0y.R.flushNeeded();}}

    /**
     * Tr.
     * 
     * @param ax
     *        the ax
     */
    protected void tr(@Nonnull OWLSubPropertyChainOfAxiom ax) {try{__CLR4_5_21cz1czlvicmt0y.R.inc(2018);
        __CLR4_5_21cz1czlvicmt0y.R.inc(2019);OWLObjectPropertyExpression pEx = ax.getSuperProperty();
        __CLR4_5_21cz1czlvicmt0y.R.inc(2020);if ((((pEx.isAnonymous())&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2021)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2022)==0&false))) {{
            __CLR4_5_21cz1czlvicmt0y.R.inc(2023);error(ax, false);
            __CLR4_5_21cz1czlvicmt0y.R.inc(2024);return;
        }
        }__CLR4_5_21cz1czlvicmt0y.R.inc(2025);OWLObjectProperty p = pEx.asOWLObjectProperty();
        __CLR4_5_21cz1czlvicmt0y.R.inc(2026);Frame f = getTypedefFrame(p);
        __CLR4_5_21cz1czlvicmt0y.R.inc(2027);if ((((p.isBottomEntity() || p.isTopEntity())&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2028)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2029)==0&false))) {{
            __CLR4_5_21cz1czlvicmt0y.R.inc(2030);error("Property chains using Top or Bottom entities are not supported in OBO.", ax, false);
            __CLR4_5_21cz1czlvicmt0y.R.inc(2031);return;
        }
        }__CLR4_5_21cz1czlvicmt0y.R.inc(2032);List<OWLObjectPropertyExpression> list = ax.getPropertyChain();
        __CLR4_5_21cz1czlvicmt0y.R.inc(2033);if ((((list.size() != 2)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2034)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2035)==0&false))) {{
            __CLR4_5_21cz1czlvicmt0y.R.inc(2036);error(ax, false);
            __CLR4_5_21cz1czlvicmt0y.R.inc(2037);return;
        }
        }__CLR4_5_21cz1czlvicmt0y.R.inc(2038);OWLObjectPropertyExpression exp1 = list.get(0);
        __CLR4_5_21cz1czlvicmt0y.R.inc(2039);OWLObjectPropertyExpression exp2 = list.get(1);
        __CLR4_5_21cz1czlvicmt0y.R.inc(2040);if ((((exp1.isBottomEntity() || exp1.isTopEntity() || exp2.isBottomEntity() || exp2.isTopEntity())&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2041)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2042)==0&false))) {{
            __CLR4_5_21cz1czlvicmt0y.R.inc(2043);error("Property chains using Top or Bottom entities are not supported in OBO.", ax, false);
            __CLR4_5_21cz1czlvicmt0y.R.inc(2044);return;
        }
        }__CLR4_5_21cz1czlvicmt0y.R.inc(2045);String rel1 = getIdentifier(exp1);
        __CLR4_5_21cz1czlvicmt0y.R.inc(2046);String rel2 = getIdentifier(exp2);
        __CLR4_5_21cz1czlvicmt0y.R.inc(2047);if ((((rel1 == null || rel2 == null)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2048)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2049)==0&false))) {{
            __CLR4_5_21cz1czlvicmt0y.R.inc(2050);error(ax, false);
            __CLR4_5_21cz1czlvicmt0y.R.inc(2051);return;
        }
        }__CLR4_5_21cz1czlvicmt0y.R.inc(2052);Clause clause;
        // set of unprocessed annotations
        __CLR4_5_21cz1czlvicmt0y.R.inc(2053);Set<OWLAnnotation> unprocessedAnnotations = new HashSet<>(ax.getAnnotations());
        __CLR4_5_21cz1czlvicmt0y.R.inc(2054);if ((((rel1.equals(f.getId()))&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2055)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2056)==0&false))) {{
            __CLR4_5_21cz1czlvicmt0y.R.inc(2057);clause = new Clause(OboFormatTag.TAG_TRANSITIVE_OVER, rel2);
        } }else {{
            __CLR4_5_21cz1czlvicmt0y.R.inc(2058);OboFormatTag tag = OboFormatTag.TAG_HOLDS_OVER_CHAIN;
            __CLR4_5_21cz1czlvicmt0y.R.inc(2059);for (OWLAnnotation ann : ax.getAnnotations()) {{
                __CLR4_5_21cz1czlvicmt0y.R.inc(2060);if ((((OWLAPIObo2Owl.IRI_PROP_ISREVERSIBLEPROPERTYCHAIN.equals(ann.getProperty().getIRI().toString()))&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2061)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2062)==0&false))) {{
                    __CLR4_5_21cz1czlvicmt0y.R.inc(2063);tag = OboFormatTag.TAG_EQUIVALENT_TO_CHAIN;
                    // remove annotation from unprocessed set.
                    __CLR4_5_21cz1czlvicmt0y.R.inc(2064);unprocessedAnnotations.remove(ann);
                    __CLR4_5_21cz1czlvicmt0y.R.inc(2065);break;
                }
            }}
            }__CLR4_5_21cz1czlvicmt0y.R.inc(2066);clause = new Clause(tag);
            __CLR4_5_21cz1czlvicmt0y.R.inc(2067);clause.addValue(rel1);
            __CLR4_5_21cz1czlvicmt0y.R.inc(2068);clause.addValue(rel2);
        }
        }__CLR4_5_21cz1czlvicmt0y.R.inc(2069);f.addClause(clause);
        __CLR4_5_21cz1czlvicmt0y.R.inc(2070);addQualifiers(clause, unprocessedAnnotations);
    }finally{__CLR4_5_21cz1czlvicmt0y.R.flushNeeded();}}

    /**
     * Tr.
     * 
     * @param ax
     *        the ax
     */
    protected void tr(@Nonnull OWLEquivalentObjectPropertiesAxiom ax) {try{__CLR4_5_21cz1czlvicmt0y.R.inc(2071);
        __CLR4_5_21cz1czlvicmt0y.R.inc(2072);trNaryPropertyAxiom(ax, OboFormatTag.TAG_EQUIVALENT_TO.getTag());
    }finally{__CLR4_5_21cz1czlvicmt0y.R.flushNeeded();}}

    /**
     * Tr.
     * 
     * @param ax
     *        the ax
     */
    protected void tr(@Nonnull OWLTransitiveObjectPropertyAxiom ax) {try{__CLR4_5_21cz1czlvicmt0y.R.inc(2073);
        __CLR4_5_21cz1czlvicmt0y.R.inc(2074);OWLObjectPropertyExpression prop = ax.getProperty();
        __CLR4_5_21cz1czlvicmt0y.R.inc(2075);if ((((prop instanceof OWLObjectProperty && trObjectProperty((OWLObjectProperty) prop,
            OboFormatTag.TAG_IS_TRANSITIVE.getTag(), Boolean.TRUE, ax.getAnnotations()))&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2076)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2077)==0&false))) {{
            __CLR4_5_21cz1czlvicmt0y.R.inc(2078);return;
        }
        }__CLR4_5_21cz1czlvicmt0y.R.inc(2079);error(ax, true);
    }finally{__CLR4_5_21cz1czlvicmt0y.R.flushNeeded();}}

    /**
     * Tr.
     * 
     * @param ax
     *        the ax
     */
    protected void tr(@Nonnull OWLDisjointObjectPropertiesAxiom ax) {try{__CLR4_5_21cz1czlvicmt0y.R.inc(2080);
        __CLR4_5_21cz1czlvicmt0y.R.inc(2081);trNaryPropertyAxiom(ax, OboFormatTag.TAG_DISJOINT_FROM.getTag());
    }finally{__CLR4_5_21cz1czlvicmt0y.R.flushNeeded();}}

    /**
     * Tr.
     * 
     * @param ax
     *        the ax
     */
    protected void tr(@Nonnull OWLReflexiveObjectPropertyAxiom ax) {try{__CLR4_5_21cz1czlvicmt0y.R.inc(2082);
        __CLR4_5_21cz1czlvicmt0y.R.inc(2083);OWLObjectPropertyExpression prop = ax.getProperty();
        __CLR4_5_21cz1czlvicmt0y.R.inc(2084);if ((((prop instanceof OWLObjectProperty && trObjectProperty((OWLObjectProperty) prop,
            OboFormatTag.TAG_IS_REFLEXIVE.getTag(), Boolean.TRUE, ax.getAnnotations()))&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2085)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2086)==0&false))) {{
            __CLR4_5_21cz1czlvicmt0y.R.inc(2087);return;
        }
        }__CLR4_5_21cz1czlvicmt0y.R.inc(2088);error(ax, true);
    }finally{__CLR4_5_21cz1czlvicmt0y.R.flushNeeded();}}

    /**
     * Tr.
     * 
     * @param ax
     *        the ax
     */
    protected void tr(@Nonnull OWLInverseFunctionalObjectPropertyAxiom ax) {try{__CLR4_5_21cz1czlvicmt0y.R.inc(2089);
        __CLR4_5_21cz1czlvicmt0y.R.inc(2090);OWLObjectPropertyExpression prop = ax.getProperty();
        __CLR4_5_21cz1czlvicmt0y.R.inc(2091);if ((((prop instanceof OWLObjectProperty && trObjectProperty((OWLObjectProperty) prop,
            OboFormatTag.TAG_IS_INVERSE_FUNCTIONAL.getTag(), Boolean.TRUE, ax.getAnnotations()))&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2092)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2093)==0&false))) {{
            __CLR4_5_21cz1czlvicmt0y.R.inc(2094);return;
        }
        }__CLR4_5_21cz1czlvicmt0y.R.inc(2095);error(ax, true);
    }finally{__CLR4_5_21cz1czlvicmt0y.R.flushNeeded();}}

    /**
     * Tr.
     * 
     * @param ax
     *        the ax
     */
    protected void tr(@Nonnull OWLInverseObjectPropertiesAxiom ax) {try{__CLR4_5_21cz1czlvicmt0y.R.inc(2096);
        __CLR4_5_21cz1czlvicmt0y.R.inc(2097);OWLObjectPropertyExpression prop1 = ax.getFirstProperty();
        __CLR4_5_21cz1czlvicmt0y.R.inc(2098);OWLObjectPropertyExpression prop2 = ax.getSecondProperty();
        __CLR4_5_21cz1czlvicmt0y.R.inc(2099);if ((((prop1 instanceof OWLObjectProperty && prop2 instanceof OWLObjectProperty && trObjectProperty(
            (OWLObjectProperty) prop1, OboFormatTag.TAG_INVERSE_OF.getTag(), getIdentifier(prop2), ax
                .getAnnotations()))&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2100)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2101)==0&false))) {{
            __CLR4_5_21cz1czlvicmt0y.R.inc(2102);return;
        }
        }__CLR4_5_21cz1czlvicmt0y.R.inc(2103);error(ax, true);
    }finally{__CLR4_5_21cz1czlvicmt0y.R.flushNeeded();}}

    /**
     * Tr.
     * 
     * @param ax
     *        the ax
     */
    protected void tr(@Nonnull OWLObjectPropertyDomainAxiom ax) {try{__CLR4_5_21cz1czlvicmt0y.R.inc(2104);
        __CLR4_5_21cz1czlvicmt0y.R.inc(2105);OWLClassExpression domain = ax.getDomain();
        __CLR4_5_21cz1czlvicmt0y.R.inc(2106);OWLObjectPropertyExpression propEx = ax.getProperty();
        __CLR4_5_21cz1czlvicmt0y.R.inc(2107);if ((((propEx.isAnonymous())&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2108)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2109)==0&false))) {{
            __CLR4_5_21cz1czlvicmt0y.R.inc(2110);error(ax, true);
            __CLR4_5_21cz1czlvicmt0y.R.inc(2111);return;
        }
        }__CLR4_5_21cz1czlvicmt0y.R.inc(2112);OWLObjectProperty prop = propEx.asOWLObjectProperty();
        __CLR4_5_21cz1czlvicmt0y.R.inc(2113);if ((((domain.isBottomEntity() || domain.isTopEntity())&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2114)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2115)==0&false))) {{
            // at least get the type def frame
            __CLR4_5_21cz1czlvicmt0y.R.inc(2116);getTypedefFrame(prop);
            // now throw the error
            __CLR4_5_21cz1czlvicmt0y.R.inc(2117);error("domains using top or bottom entities are not translatable to OBO.", ax, false);
            __CLR4_5_21cz1czlvicmt0y.R.inc(2118);return;
        }
        }__CLR4_5_21cz1czlvicmt0y.R.inc(2119);String range = getIdentifier(domain);
        __CLR4_5_21cz1czlvicmt0y.R.inc(2120);if ((((range != null)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2121)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2122)==0&false))) {{
            __CLR4_5_21cz1czlvicmt0y.R.inc(2123);if ((((trObjectProperty(prop, OboFormatTag.TAG_DOMAIN.getTag(), range, ax.getAnnotations()))&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2124)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2125)==0&false))) {{
                __CLR4_5_21cz1czlvicmt0y.R.inc(2126);return;
            } }else {{
                __CLR4_5_21cz1czlvicmt0y.R.inc(2127);error("trObjectProperty failed for " + prop, ax, true);
            }
        }} }else {{
            __CLR4_5_21cz1czlvicmt0y.R.inc(2128);error("no range translatable for " + ax, false);
        }
    }}finally{__CLR4_5_21cz1czlvicmt0y.R.flushNeeded();}}

    /**
     * Tr.
     * 
     * @param ax
     *        the ax
     */
    protected void tr(@Nonnull OWLAsymmetricObjectPropertyAxiom ax) {try{__CLR4_5_21cz1czlvicmt0y.R.inc(2129);
        __CLR4_5_21cz1czlvicmt0y.R.inc(2130);OWLObjectPropertyExpression prop = ax.getProperty();
        __CLR4_5_21cz1czlvicmt0y.R.inc(2131);if ((((prop instanceof OWLObjectProperty && trObjectProperty((OWLObjectProperty) prop,
            OboFormatTag.TAG_IS_ASYMMETRIC.getTag(), Boolean.TRUE, ax.getAnnotations()))&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2132)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2133)==0&false))) {{
            __CLR4_5_21cz1czlvicmt0y.R.inc(2134);return;
        }
        }__CLR4_5_21cz1czlvicmt0y.R.inc(2135);error(ax, true);
    }finally{__CLR4_5_21cz1czlvicmt0y.R.flushNeeded();}}

    /**
     * Tr.
     * 
     * @param ax
     *        the ax
     */
    protected void tr(@Nonnull OWLSymmetricObjectPropertyAxiom ax) {try{__CLR4_5_21cz1czlvicmt0y.R.inc(2136);
        __CLR4_5_21cz1czlvicmt0y.R.inc(2137);OWLObjectPropertyExpression prop = ax.getProperty();
        __CLR4_5_21cz1czlvicmt0y.R.inc(2138);if ((((prop instanceof OWLObjectProperty && trObjectProperty((OWLObjectProperty) prop,
            OboFormatTag.TAG_IS_SYMMETRIC.getTag(), Boolean.TRUE, ax.getAnnotations()))&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2139)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2140)==0&false))) {{
            __CLR4_5_21cz1czlvicmt0y.R.inc(2141);return;
        }
        }__CLR4_5_21cz1czlvicmt0y.R.inc(2142);error(ax, true);
    }finally{__CLR4_5_21cz1czlvicmt0y.R.flushNeeded();}}

    /**
     * Tr.
     * 
     * @param ax
     *        the ax
     */
    protected void tr(@Nonnull OWLFunctionalObjectPropertyAxiom ax) {try{__CLR4_5_21cz1czlvicmt0y.R.inc(2143);
        __CLR4_5_21cz1czlvicmt0y.R.inc(2144);OWLObjectPropertyExpression prop = ax.getProperty();
        __CLR4_5_21cz1czlvicmt0y.R.inc(2145);if ((((prop instanceof OWLObjectProperty && trObjectProperty((OWLObjectProperty) prop,
            OboFormatTag.TAG_IS_FUNCTIONAL.getTag(), Boolean.TRUE, ax.getAnnotations()))&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2146)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2147)==0&false))) {{
            __CLR4_5_21cz1czlvicmt0y.R.inc(2148);return;
        }
        }__CLR4_5_21cz1czlvicmt0y.R.inc(2149);error(ax, true);
    }finally{__CLR4_5_21cz1czlvicmt0y.R.flushNeeded();}}

    /**
     * Tr.
     * 
     * @param ax
     *        the ax
     */
    protected void tr(@Nonnull OWLObjectPropertyRangeAxiom ax) {try{__CLR4_5_21cz1czlvicmt0y.R.inc(2150);
        __CLR4_5_21cz1czlvicmt0y.R.inc(2151);OWLClassExpression owlRange = ax.getRange();
        __CLR4_5_21cz1czlvicmt0y.R.inc(2152);OWLObjectPropertyExpression propEx = ax.getProperty();
        __CLR4_5_21cz1czlvicmt0y.R.inc(2153);if ((((propEx.isAnonymous())&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2154)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2155)==0&false))) {{
            __CLR4_5_21cz1czlvicmt0y.R.inc(2156);error(ax, false);
        }
        }__CLR4_5_21cz1czlvicmt0y.R.inc(2157);OWLObjectProperty prop = propEx.asOWLObjectProperty();
        __CLR4_5_21cz1czlvicmt0y.R.inc(2158);if ((((owlRange.isBottomEntity() || owlRange.isTopEntity())&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2159)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2160)==0&false))) {{
            // at least create the property frame
            __CLR4_5_21cz1czlvicmt0y.R.inc(2161);getTypedefFrame(prop);
            // error message
            __CLR4_5_21cz1czlvicmt0y.R.inc(2162);error("ranges using top or bottom entities are not translatable to OBO.", ax, false);
            __CLR4_5_21cz1czlvicmt0y.R.inc(2163);return;
        }
        }__CLR4_5_21cz1czlvicmt0y.R.inc(2164);String range = getIdentifier(owlRange); // getIdentifier(ax.getRange());
        __CLR4_5_21cz1czlvicmt0y.R.inc(2165);if ((((range != null && trObjectProperty(prop, OboFormatTag.TAG_RANGE.getTag(), range, ax.getAnnotations()))&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2166)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2167)==0&false))) {{
            __CLR4_5_21cz1czlvicmt0y.R.inc(2168);return;
        }
        }__CLR4_5_21cz1czlvicmt0y.R.inc(2169);error(ax, false);
    }finally{__CLR4_5_21cz1czlvicmt0y.R.flushNeeded();}}

    @SuppressWarnings("null")
    protected void tr(@Nonnull OWLSubObjectPropertyOfAxiom ax) {try{__CLR4_5_21cz1czlvicmt0y.R.inc(2170);
        __CLR4_5_21cz1czlvicmt0y.R.inc(2171);OWLObjectPropertyExpression sup = ax.getSuperProperty();
        __CLR4_5_21cz1czlvicmt0y.R.inc(2172);OWLObjectPropertyExpression sub = ax.getSubProperty();
        __CLR4_5_21cz1czlvicmt0y.R.inc(2173);if ((((sub.isBottomEntity() || sub.isTopEntity() || sup.isBottomEntity() || sup.isTopEntity())&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2174)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2175)==0&false))) {{
            __CLR4_5_21cz1czlvicmt0y.R.inc(2176);error("SubProperties using Top or Bottom entites are not supported in OBO.", false);
            __CLR4_5_21cz1czlvicmt0y.R.inc(2177);return;
        }
        }__CLR4_5_21cz1czlvicmt0y.R.inc(2178);if ((((sub instanceof OWLObjectProperty && sup instanceof OWLObjectProperty)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2179)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2180)==0&false))) {{
            __CLR4_5_21cz1czlvicmt0y.R.inc(2181);String supId = getIdentifier(sup);
            __CLR4_5_21cz1czlvicmt0y.R.inc(2182);if ((((supId.startsWith("owl:"))&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2183)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2184)==0&false))) {{
                __CLR4_5_21cz1czlvicmt0y.R.inc(2185);return;
            }
            }__CLR4_5_21cz1czlvicmt0y.R.inc(2186);Frame f = getTypedefFrame((OWLObjectProperty) sub);
            __CLR4_5_21cz1czlvicmt0y.R.inc(2187);Clause clause = new Clause(OboFormatTag.TAG_IS_A, supId);
            __CLR4_5_21cz1czlvicmt0y.R.inc(2188);f.addClause(clause);
            __CLR4_5_21cz1czlvicmt0y.R.inc(2189);addQualifiers(clause, ax.getAnnotations());
        } }else {{
            __CLR4_5_21cz1czlvicmt0y.R.inc(2190);error(ax, true);
        }
    }}finally{__CLR4_5_21cz1czlvicmt0y.R.flushNeeded();}}

    @SuppressWarnings("null")
    protected void tr(@Nonnull OWLSubAnnotationPropertyOfAxiom ax) {try{__CLR4_5_21cz1czlvicmt0y.R.inc(2191);
        __CLR4_5_21cz1czlvicmt0y.R.inc(2192);OWLAnnotationProperty sup = ax.getSuperProperty();
        __CLR4_5_21cz1czlvicmt0y.R.inc(2193);OWLAnnotationProperty sub = ax.getSubProperty();
        __CLR4_5_21cz1czlvicmt0y.R.inc(2194);if ((((sub.isBottomEntity() || sub.isTopEntity() || sup.isBottomEntity() || sup.isTopEntity())&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2195)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2196)==0&false))) {{
            __CLR4_5_21cz1czlvicmt0y.R.inc(2197);error("SubAnnotationProperties using Top or Bottom entites are not supported in OBO.", false);
            __CLR4_5_21cz1czlvicmt0y.R.inc(2198);return;
        }
        }__CLR4_5_21cz1czlvicmt0y.R.inc(2199);String tagObject = owlObjectToTag(sup);
        __CLR4_5_21cz1czlvicmt0y.R.inc(2200);if ((((OboFormatTag.TAG_SYNONYMTYPEDEF.getTag().equals(tagObject))&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2201)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2202)==0&false))) {{
            __CLR4_5_21cz1czlvicmt0y.R.inc(2203);String name = "";
            __CLR4_5_21cz1czlvicmt0y.R.inc(2204);String scope = null;
            __CLR4_5_21cz1czlvicmt0y.R.inc(2205);for (OWLAnnotationAssertionAxiom axiom : getOWLOntology().getAnnotationAssertionAxioms(sub.getIRI())) {{
                __CLR4_5_21cz1czlvicmt0y.R.inc(2206);String tg = owlObjectToTag(axiom.getProperty());
                __CLR4_5_21cz1czlvicmt0y.R.inc(2207);if ((((OboFormatTag.TAG_NAME.getTag().equals(tg))&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2208)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2209)==0&false))) {{
                    __CLR4_5_21cz1czlvicmt0y.R.inc(2210);name = ((OWLLiteral) axiom.getValue()).getLiteral();
                } }else {__CLR4_5_21cz1czlvicmt0y.R.inc(2211);if ((((OboFormatTag.TAG_SCOPE.getTag().equals(tg))&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2212)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2213)==0&false))) {{
                    __CLR4_5_21cz1czlvicmt0y.R.inc(2214);scope = owlObjectToTag(axiom.getValue());
                }
            }}}
            }__CLR4_5_21cz1czlvicmt0y.R.inc(2215);Frame hf = getObodoc().getHeaderFrame();
            __CLR4_5_21cz1czlvicmt0y.R.inc(2216);Clause clause = new Clause(OboFormatTag.TAG_SYNONYMTYPEDEF);
            __CLR4_5_21cz1czlvicmt0y.R.inc(2217);clause.addValue(getIdentifier(sub));
            __CLR4_5_21cz1czlvicmt0y.R.inc(2218);clause.addValue(name);
            __CLR4_5_21cz1czlvicmt0y.R.inc(2219);if ((((scope != null)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2220)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2221)==0&false))) {{
                __CLR4_5_21cz1czlvicmt0y.R.inc(2222);clause.addValue(scope);
            }
            }__CLR4_5_21cz1czlvicmt0y.R.inc(2223);addQualifiers(clause, ax.getAnnotations());
            __CLR4_5_21cz1czlvicmt0y.R.inc(2224);if ((((!hf.getClauses().contains(clause))&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2225)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2226)==0&false))) {{
                __CLR4_5_21cz1czlvicmt0y.R.inc(2227);hf.addClause(clause);
            } }else {{
                __CLR4_5_21cz1czlvicmt0y.R.inc(2228);LOG.error("duplicate clause: {} in header", clause);
            }
            }__CLR4_5_21cz1czlvicmt0y.R.inc(2229);return;
        } }else {__CLR4_5_21cz1czlvicmt0y.R.inc(2230);if ((((OboFormatTag.TAG_SUBSETDEF.getTag().equals(tagObject))&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2231)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2232)==0&false))) {{
            __CLR4_5_21cz1czlvicmt0y.R.inc(2233);String comment = "";
            __CLR4_5_21cz1czlvicmt0y.R.inc(2234);for (OWLAnnotationAssertionAxiom axiom : getOWLOntology().getAnnotationAssertionAxioms(sub.getIRI())) {{
                __CLR4_5_21cz1czlvicmt0y.R.inc(2235);String tg = owlObjectToTag(axiom.getProperty());
                __CLR4_5_21cz1czlvicmt0y.R.inc(2236);if ((((OboFormatTag.TAG_COMMENT.getTag().equals(tg))&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2237)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2238)==0&false))) {{
                    __CLR4_5_21cz1czlvicmt0y.R.inc(2239);comment = ((OWLLiteral) axiom.getValue()).getLiteral();
                    __CLR4_5_21cz1czlvicmt0y.R.inc(2240);break;
                }
            }}
            }__CLR4_5_21cz1czlvicmt0y.R.inc(2241);Frame hf = getObodoc().getHeaderFrame();
            __CLR4_5_21cz1czlvicmt0y.R.inc(2242);Clause clause = new Clause(OboFormatTag.TAG_SUBSETDEF);
            __CLR4_5_21cz1czlvicmt0y.R.inc(2243);clause.addValue(getIdentifier(sub));
            __CLR4_5_21cz1czlvicmt0y.R.inc(2244);clause.addValue(comment);
            __CLR4_5_21cz1czlvicmt0y.R.inc(2245);if ((((!hf.getClauses().contains(clause))&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2246)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2247)==0&false))) {{
                __CLR4_5_21cz1czlvicmt0y.R.inc(2248);hf.addClause(clause);
            } }else {{
                __CLR4_5_21cz1czlvicmt0y.R.inc(2249);LOG.error("duplicate clause: {} in header", clause);
            }
            }__CLR4_5_21cz1czlvicmt0y.R.inc(2250);addQualifiers(clause, ax.getAnnotations());
            __CLR4_5_21cz1czlvicmt0y.R.inc(2251);return;
        }
        }}__CLR4_5_21cz1czlvicmt0y.R.inc(2252);if ((((sub instanceof OWLObjectProperty && sup instanceof OWLObjectProperty)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2253)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2254)==0&false))) {{
            __CLR4_5_21cz1czlvicmt0y.R.inc(2255);String supId = getIdentifier(sup); // getIdentifier(sup);
            __CLR4_5_21cz1czlvicmt0y.R.inc(2256);if ((((supId.startsWith("owl:"))&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2257)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2258)==0&false))) {{
                __CLR4_5_21cz1czlvicmt0y.R.inc(2259);return;
            }
            }__CLR4_5_21cz1czlvicmt0y.R.inc(2260);Frame f = getTypedefFrame(sub);
            __CLR4_5_21cz1czlvicmt0y.R.inc(2261);Clause clause = new Clause(OboFormatTag.TAG_IS_A, supId);
            __CLR4_5_21cz1czlvicmt0y.R.inc(2262);f.addClause(clause);
            __CLR4_5_21cz1czlvicmt0y.R.inc(2263);addQualifiers(clause, ax.getAnnotations());
        } }else {{
            __CLR4_5_21cz1czlvicmt0y.R.inc(2264);error(ax, true);
        }
    }}finally{__CLR4_5_21cz1czlvicmt0y.R.flushNeeded();}}

    /**
     * Tr.
     * 
     * @param aanAx
     *        the aan ax
     * @param frame
     *        the frame
     */
    protected void tr(@Nonnull OWLAnnotationAssertionAxiom aanAx, @Nonnull Frame frame) {try{__CLR4_5_21cz1czlvicmt0y.R.inc(2265);
        __CLR4_5_21cz1czlvicmt0y.R.inc(2266);boolean success = tr(aanAx.getProperty(), aanAx.getValue(), aanAx.getAnnotations(), frame);
        __CLR4_5_21cz1czlvicmt0y.R.inc(2267);if ((((!success)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2268)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2269)==0&false))) {{
            __CLR4_5_21cz1czlvicmt0y.R.inc(2270);untranslatableAxioms.add(aanAx);
        }
    }}finally{__CLR4_5_21cz1czlvicmt0y.R.flushNeeded();}}

    /**
     * Tr.
     * 
     * @param prop
     *        the prop
     * @param annVal
     *        the ann val
     * @param qualifiers
     *        the qualifiers
     * @param frame
     *        the frame
     * @return true, if successful
     */
    @SuppressWarnings("null")
    protected boolean tr(OWLAnnotationProperty prop, @Nonnull OWLAnnotationValue annVal,
        @Nonnull Set<OWLAnnotation> qualifiers, @Nonnull Frame frame) {try{__CLR4_5_21cz1czlvicmt0y.R.inc(2271);
        __CLR4_5_21cz1czlvicmt0y.R.inc(2272);String tagString = owlObjectToTag(prop);
        __CLR4_5_21cz1czlvicmt0y.R.inc(2273);OboFormatTag tag = null;
        __CLR4_5_21cz1czlvicmt0y.R.inc(2274);if ((((tagString != null)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2275)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2276)==0&false))) {{
            __CLR4_5_21cz1czlvicmt0y.R.inc(2277);tag = OBOFormatConstants.getTag(tagString);
        }
        }__CLR4_5_21cz1czlvicmt0y.R.inc(2278);if ((((tag == null)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2279)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2280)==0&false))) {{
            __CLR4_5_21cz1czlvicmt0y.R.inc(2281);if ((((annVal instanceof IRI && FrameType.TERM.equals(frame.getType()) && isMetadataTag(prop))&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2282)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2283)==0&false))) {{
                __CLR4_5_21cz1czlvicmt0y.R.inc(2284);String propId = this.getIdentifier(prop);
                __CLR4_5_21cz1czlvicmt0y.R.inc(2285);if ((((propId != null)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2286)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2287)==0&false))) {{
                    __CLR4_5_21cz1czlvicmt0y.R.inc(2288);Clause clause = new Clause(OboFormatTag.TAG_RELATIONSHIP);
                    __CLR4_5_21cz1czlvicmt0y.R.inc(2289);clause.addValue(propId);
                    __CLR4_5_21cz1czlvicmt0y.R.inc(2290);clause.addValue(getIdentifier((IRI) annVal));
                    __CLR4_5_21cz1czlvicmt0y.R.inc(2291);addQualifiers(clause, qualifiers);
                    __CLR4_5_21cz1czlvicmt0y.R.inc(2292);frame.addClause(clause);
                    __CLR4_5_21cz1czlvicmt0y.R.inc(2293);return true;
                }
            }}
            // annotation property does not correspond to a mapping to a tag in
            // the OBO syntax -
            // use the property_value tag
            }__CLR4_5_21cz1czlvicmt0y.R.inc(2294);return trGenericPropertyValue(prop, annVal, qualifiers, frame);
        }
        }__CLR4_5_21cz1czlvicmt0y.R.inc(2295);String value = getValue(annVal, tagString);
        __CLR4_5_21cz1czlvicmt0y.R.inc(2296);if ((((!value.trim().isEmpty())&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2297)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2298)==0&false))) {{
            __CLR4_5_21cz1czlvicmt0y.R.inc(2299);if ((((tag == OboFormatTag.TAG_ID)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2300)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2301)==0&false))) {{
                __CLR4_5_21cz1czlvicmt0y.R.inc(2302);if ((((!frame.getId().equals(value))&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2303)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2304)==0&false))) {{
                    __CLR4_5_21cz1czlvicmt0y.R.inc(2305);warn("Conflicting id definitions: 1) " + frame.getId() + "  2)" + value);
                    __CLR4_5_21cz1czlvicmt0y.R.inc(2306);return false;
                }
                }__CLR4_5_21cz1czlvicmt0y.R.inc(2307);return true;
            }
            }__CLR4_5_21cz1czlvicmt0y.R.inc(2308);Clause clause = new Clause(tag);
            __CLR4_5_21cz1czlvicmt0y.R.inc(2309);if ((((tag == OboFormatTag.TAG_DATE)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2310)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2311)==0&false))) {{
                __CLR4_5_21cz1czlvicmt0y.R.inc(2312);try {
                    __CLR4_5_21cz1czlvicmt0y.R.inc(2313);clause.addValue(OBOFormatConstants.headerDateFormat().parseObject(value));
                } catch (ParseException e) {
                    __CLR4_5_21cz1czlvicmt0y.R.inc(2314);error("Could not parse date string: " + value, true);
                    __CLR4_5_21cz1czlvicmt0y.R.inc(2315);return false;
                }
            } }else {{
                __CLR4_5_21cz1czlvicmt0y.R.inc(2316);clause.addValue(value);
            }
            }__CLR4_5_21cz1czlvicmt0y.R.inc(2317);Set<OWLAnnotation> unprocessedQualifiers = new HashSet<>(qualifiers);
            __CLR4_5_21cz1czlvicmt0y.R.inc(2318);if ((((tag == OboFormatTag.TAG_DEF)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2319)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2320)==0&false))) {{
                __CLR4_5_21cz1czlvicmt0y.R.inc(2321);for (OWLAnnotation aan : qualifiers) {{
                    __CLR4_5_21cz1czlvicmt0y.R.inc(2322);String propId = owlObjectToTag(aan.getProperty());
                    __CLR4_5_21cz1czlvicmt0y.R.inc(2323);if (((("xref".equals(propId))&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2324)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2325)==0&false))) {{
                        __CLR4_5_21cz1czlvicmt0y.R.inc(2326);OWLAnnotationValue v = aan.getValue();
                        __CLR4_5_21cz1czlvicmt0y.R.inc(2327);String xrefValue;
                        __CLR4_5_21cz1czlvicmt0y.R.inc(2328);if ((((v instanceof IRI)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2329)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2330)==0&false))) {{
                            __CLR4_5_21cz1czlvicmt0y.R.inc(2331);xrefValue = v.toString();
                        } }else {{
                            __CLR4_5_21cz1czlvicmt0y.R.inc(2332);xrefValue = ((OWLLiteral) v).getLiteral();
                        }
                        }__CLR4_5_21cz1czlvicmt0y.R.inc(2333);Xref xref = new Xref(xrefValue);
                        __CLR4_5_21cz1czlvicmt0y.R.inc(2334);clause.addXref(xref);
                        __CLR4_5_21cz1czlvicmt0y.R.inc(2335);unprocessedQualifiers.remove(aan);
                    }
                }}
            }} }else {__CLR4_5_21cz1czlvicmt0y.R.inc(2336);if ((((tag == OboFormatTag.TAG_XREF)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2337)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2338)==0&false))) {{
                __CLR4_5_21cz1czlvicmt0y.R.inc(2339);Xref xref = new Xref(value);
                __CLR4_5_21cz1czlvicmt0y.R.inc(2340);for (OWLAnnotation annotation : qualifiers) {{
                    __CLR4_5_21cz1czlvicmt0y.R.inc(2341);if ((((fac.getRDFSLabel().equals(annotation.getProperty()))&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2342)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2343)==0&false))) {{
                        __CLR4_5_21cz1czlvicmt0y.R.inc(2344);OWLAnnotationValue owlAnnotationValue = annotation.getValue();
                        __CLR4_5_21cz1czlvicmt0y.R.inc(2345);if ((((owlAnnotationValue instanceof OWLLiteral)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2346)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2347)==0&false))) {{
                            __CLR4_5_21cz1czlvicmt0y.R.inc(2348);unprocessedQualifiers.remove(annotation);
                            __CLR4_5_21cz1czlvicmt0y.R.inc(2349);String xrefAnnotation = ((OWLLiteral) owlAnnotationValue).getLiteral();
                            __CLR4_5_21cz1czlvicmt0y.R.inc(2350);xrefAnnotation = xrefAnnotation.trim();
                            __CLR4_5_21cz1czlvicmt0y.R.inc(2351);if ((((!xrefAnnotation.isEmpty())&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2352)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2353)==0&false))) {{
                                __CLR4_5_21cz1czlvicmt0y.R.inc(2354);xref.setAnnotation(xrefAnnotation);
                            }
                        }}
                    }}
                }}
                }__CLR4_5_21cz1czlvicmt0y.R.inc(2355);clause.setValue(xref);
            } }else {__CLR4_5_21cz1czlvicmt0y.R.inc(2356);if ((((tag == OboFormatTag.TAG_EXACT || tag == OboFormatTag.TAG_NARROW || tag == OboFormatTag.TAG_BROAD
                || tag == OboFormatTag.TAG_RELATED)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2357)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2358)==0&false))) {{
                __CLR4_5_21cz1czlvicmt0y.R.inc(2359);handleSynonym(qualifiers, tag.getTag(), clause, unprocessedQualifiers);
            } }else {__CLR4_5_21cz1czlvicmt0y.R.inc(2360);if ((((tag == OboFormatTag.TAG_SYNONYM)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2361)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2362)==0&false))) {{
                // This should never happen.
                // All synonyms need to be qualified with a type.
                __CLR4_5_21cz1czlvicmt0y.R.inc(2363);String synonymType = null;
                __CLR4_5_21cz1czlvicmt0y.R.inc(2364);handleSynonym(qualifiers, synonymType, clause, unprocessedQualifiers);
            }
            }}}}__CLR4_5_21cz1czlvicmt0y.R.inc(2365);addQualifiers(clause, unprocessedQualifiers);
            // before adding the clause check for redundant clauses
            __CLR4_5_21cz1czlvicmt0y.R.inc(2366);boolean redundant = false;
            __CLR4_5_21cz1czlvicmt0y.R.inc(2367);for (Clause frameClause : frame.getClauses()) {{
                __CLR4_5_21cz1czlvicmt0y.R.inc(2368);if ((((clause.equals(frameClause))&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2369)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2370)==0&false))) {{
                    __CLR4_5_21cz1czlvicmt0y.R.inc(2371);redundant = handleDuplicateClause(frame, frameClause);
                }
            }}
            }__CLR4_5_21cz1czlvicmt0y.R.inc(2372);if ((((!redundant)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2373)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2374)==0&false))) {{
                __CLR4_5_21cz1czlvicmt0y.R.inc(2375);frame.addClause(clause);
            }
        }} }else {{
            __CLR4_5_21cz1czlvicmt0y.R.inc(2376);return false;
        }
        }__CLR4_5_21cz1czlvicmt0y.R.inc(2377);return true;
    }finally{__CLR4_5_21cz1czlvicmt0y.R.flushNeeded();}}

    private boolean isMetadataTag(OWLAnnotationProperty p) {try{__CLR4_5_21cz1czlvicmt0y.R.inc(2378);
        __CLR4_5_21cz1czlvicmt0y.R.inc(2379);final IRI metadataTagIRI = IRI.create(Obo2OWLConstants.OIOVOCAB_IRI_PREFIX + OboFormatTag.TAG_IS_METADATA_TAG
            .getTag());
        __CLR4_5_21cz1czlvicmt0y.R.inc(2380);Set<OWLAnnotationAssertionAxiom> axioms = owlOntology.getAnnotationAssertionAxioms(p.getIRI());
        __CLR4_5_21cz1czlvicmt0y.R.inc(2381);for (OWLAnnotationAssertionAxiom ax : axioms) {{
            __CLR4_5_21cz1czlvicmt0y.R.inc(2382);if ((((metadataTagIRI.equals(ax.getProperty().getIRI()))&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2383)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2384)==0&false))) {{
                __CLR4_5_21cz1czlvicmt0y.R.inc(2385);return true;
            }
        }}
        }__CLR4_5_21cz1czlvicmt0y.R.inc(2386);return false;
    }finally{__CLR4_5_21cz1czlvicmt0y.R.flushNeeded();}}

    /**
     * Handle synonym.
     * 
     * @param qualifiers
     *        the qualifiers
     * @param scope
     *        the scope
     * @param clause
     *        the clause
     * @param unprocessedQualifiers
     *        the unprocessed qualifiers
     */
    protected void handleSynonym(@Nonnull Set<OWLAnnotation> qualifiers, @Nullable String scope, @Nonnull Clause clause,
        @Nonnull Set<OWLAnnotation> unprocessedQualifiers) {try{__CLR4_5_21cz1czlvicmt0y.R.inc(2387);
        __CLR4_5_21cz1czlvicmt0y.R.inc(2388);clause.setTag(OboFormatTag.TAG_SYNONYM.getTag());
        __CLR4_5_21cz1czlvicmt0y.R.inc(2389);String type = null;
        __CLR4_5_21cz1czlvicmt0y.R.inc(2390);clause.setXrefs(new ArrayList<Xref>());
        __CLR4_5_21cz1czlvicmt0y.R.inc(2391);for (OWLAnnotation aan : qualifiers) {{
            __CLR4_5_21cz1czlvicmt0y.R.inc(2392);String propId = owlObjectToTag(aan.getProperty());
            __CLR4_5_21cz1czlvicmt0y.R.inc(2393);if ((((OboFormatTag.TAG_XREF.getTag().equals(propId))&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2394)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2395)==0&false))) {{
                __CLR4_5_21cz1czlvicmt0y.R.inc(2396);OWLAnnotationValue v = aan.getValue();
                __CLR4_5_21cz1czlvicmt0y.R.inc(2397);String xrefValue;
                __CLR4_5_21cz1czlvicmt0y.R.inc(2398);if ((((v instanceof IRI)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2399)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2400)==0&false))) {{
                    __CLR4_5_21cz1czlvicmt0y.R.inc(2401);xrefValue = v.toString();
                } }else {{
                    __CLR4_5_21cz1czlvicmt0y.R.inc(2402);xrefValue = ((OWLLiteral) v).getLiteral();
                }
                }__CLR4_5_21cz1czlvicmt0y.R.inc(2403);Xref xref = new Xref(xrefValue);
                __CLR4_5_21cz1czlvicmt0y.R.inc(2404);clause.addXref(xref);
                __CLR4_5_21cz1czlvicmt0y.R.inc(2405);unprocessedQualifiers.remove(aan);
            } }else {__CLR4_5_21cz1czlvicmt0y.R.inc(2406);if ((((OboFormatTag.TAG_HAS_SYNONYM_TYPE.getTag().equals(propId))&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2407)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2408)==0&false))) {{
                __CLR4_5_21cz1czlvicmt0y.R.inc(2409);type = getIdentifier(aan.getValue());
                __CLR4_5_21cz1czlvicmt0y.R.inc(2410);unprocessedQualifiers.remove(aan);
            }
        }}}
        }__CLR4_5_21cz1czlvicmt0y.R.inc(2411);if ((((scope != null)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2412)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2413)==0&false))) {{
            __CLR4_5_21cz1czlvicmt0y.R.inc(2414);clause.addValue(scope);
            __CLR4_5_21cz1czlvicmt0y.R.inc(2415);if ((((type != null)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2416)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2417)==0&false))) {{
                __CLR4_5_21cz1czlvicmt0y.R.inc(2418);clause.addValue(type);
            }
        }}
    }}finally{__CLR4_5_21cz1czlvicmt0y.R.flushNeeded();}}

    /**
     * Handle a duplicate clause in a frame during translation.
     * 
     * @param frame
     *        the frame
     * @param clause
     *        the clause
     * @return true if the clause is to be marked as redundant and will not be
     *         added to the
     */
    protected boolean handleDuplicateClause(@Nonnull Frame frame, Clause clause) {try{__CLR4_5_21cz1czlvicmt0y.R.inc(2419);
        // default is to report it via the logger and remove it.
        __CLR4_5_21cz1czlvicmt0y.R.inc(2420);LOG.error("Duplicate clause '{}' generated in frame: {}", clause, frame.getId());
        __CLR4_5_21cz1czlvicmt0y.R.inc(2421);return true;
    }finally{__CLR4_5_21cz1czlvicmt0y.R.flushNeeded();}}

    /**
     * Tr generic property value.
     * 
     * @param prop
     *        the prop
     * @param annVal
     *        the ann val
     * @param qualifiers
     *        the qualifiers
     * @param frame
     *        the frame
     * @return true, if successful
     */
    @SuppressWarnings("null")
    protected boolean trGenericPropertyValue(OWLAnnotationProperty prop, OWLAnnotationValue annVal,
        @Nonnull Set<OWLAnnotation> qualifiers, @Nonnull Frame frame) {try{__CLR4_5_21cz1czlvicmt0y.R.inc(2422);
        // no built-in obo tag for this: use the generic property_value tag
        __CLR4_5_21cz1czlvicmt0y.R.inc(2423);Clause clause = new Clause(OboFormatTag.TAG_PROPERTY_VALUE.getTag());
        __CLR4_5_21cz1czlvicmt0y.R.inc(2424);String propId = getIdentifier(prop);
        __CLR4_5_21cz1czlvicmt0y.R.inc(2425);addQualifiers(clause, qualifiers);
        __CLR4_5_21cz1czlvicmt0y.R.inc(2426);if ((((!propId.equals("shorthand"))&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2427)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2428)==0&false))) {{
            __CLR4_5_21cz1czlvicmt0y.R.inc(2429);clause.addValue(propId);
            __CLR4_5_21cz1czlvicmt0y.R.inc(2430);if ((((annVal instanceof OWLLiteral)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2431)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2432)==0&false))) {{
                __CLR4_5_21cz1czlvicmt0y.R.inc(2433);OWLLiteral owlLiteral = (OWLLiteral) annVal;
                __CLR4_5_21cz1czlvicmt0y.R.inc(2434);clause.addValue(owlLiteral.getLiteral());
                __CLR4_5_21cz1czlvicmt0y.R.inc(2435);OWLDatatype datatype = owlLiteral.getDatatype();
                __CLR4_5_21cz1czlvicmt0y.R.inc(2436);IRI dataTypeIri = datatype.getIRI();
                __CLR4_5_21cz1czlvicmt0y.R.inc(2437);if ((((!OWL2Datatype.isBuiltIn(dataTypeIri))&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2438)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2439)==0&false))) {{
                    __CLR4_5_21cz1czlvicmt0y.R.inc(2440);error("Untranslatable axiom due to unknown data type: " + annVal, true);
                    __CLR4_5_21cz1czlvicmt0y.R.inc(2441);return false;
                }
                }__CLR4_5_21cz1czlvicmt0y.R.inc(2442);if ((((Namespaces.XSD.inNamespace(dataTypeIri))&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2443)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2444)==0&false))) {{
                    __CLR4_5_21cz1czlvicmt0y.R.inc(2445);clause.addValue(dataTypeIri.prefixedBy("xsd:"));
                } }else {__CLR4_5_21cz1czlvicmt0y.R.inc(2446);if ((((dataTypeIri.isPlainLiteral())&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2447)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2448)==0&false))) {{
                    __CLR4_5_21cz1czlvicmt0y.R.inc(2449);clause.addValue("xsd:string");
                } }else {{
                    __CLR4_5_21cz1czlvicmt0y.R.inc(2450);clause.addValue(dataTypeIri.toString());
                }
            }}} }else {__CLR4_5_21cz1czlvicmt0y.R.inc(2451);if ((((annVal instanceof IRI)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2452)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2453)==0&false))) {{
                __CLR4_5_21cz1czlvicmt0y.R.inc(2454);clause.addValue(getIdentifier((IRI) annVal));
            }
            }}__CLR4_5_21cz1czlvicmt0y.R.inc(2455);frame.addClause(clause);
        }
        }__CLR4_5_21cz1czlvicmt0y.R.inc(2456);return true;
    }finally{__CLR4_5_21cz1czlvicmt0y.R.flushNeeded();}}

    /**
     * Gets the value.
     * 
     * @param annVal
     *        the ann val
     * @param tag
     *        the tag
     * @return the value
     */
    @SuppressWarnings("null")
    @Nullable
    protected String getValue(@Nonnull OWLAnnotationValue annVal, String tag) {try{__CLR4_5_21cz1czlvicmt0y.R.inc(2457);
        __CLR4_5_21cz1czlvicmt0y.R.inc(2458);String value = annVal.toString();
        __CLR4_5_21cz1czlvicmt0y.R.inc(2459);if ((((annVal instanceof OWLLiteral)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2460)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2461)==0&false))) {{
            __CLR4_5_21cz1czlvicmt0y.R.inc(2462);value = ((OWLLiteral) annVal).getLiteral();
        } }else {__CLR4_5_21cz1czlvicmt0y.R.inc(2463);if ((((annVal instanceof IRI)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2464)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2465)==0&false))) {{
            __CLR4_5_21cz1czlvicmt0y.R.inc(2466);value = getIdentifier((IRI) annVal);
        }
        }}__CLR4_5_21cz1czlvicmt0y.R.inc(2467);if ((((OboFormatTag.TAG_EXPAND_EXPRESSION_TO.getTag().equals(tag))&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2468)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2469)==0&false))) {{
            __CLR4_5_21cz1czlvicmt0y.R.inc(2470);Matcher matcher = absoulteURLPattern.matcher(value);
            __CLR4_5_21cz1czlvicmt0y.R.inc(2471);while ((((matcher.find())&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2472)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2473)==0&false))) {{
                __CLR4_5_21cz1czlvicmt0y.R.inc(2474);String m = matcher.group();
                __CLR4_5_21cz1czlvicmt0y.R.inc(2475);m = m.replace("<", "");
                __CLR4_5_21cz1czlvicmt0y.R.inc(2476);m = m.replace(">", "");
                __CLR4_5_21cz1czlvicmt0y.R.inc(2477);int i = m.lastIndexOf('/');
                __CLR4_5_21cz1czlvicmt0y.R.inc(2478);m = m.substring(i + 1);
                __CLR4_5_21cz1czlvicmt0y.R.inc(2479);value = value.replace(matcher.group(), m);
            }
        }}
        }__CLR4_5_21cz1czlvicmt0y.R.inc(2480);return value;
    }finally{__CLR4_5_21cz1czlvicmt0y.R.flushNeeded();}}

    /**
     * Adds the qualifiers.
     * 
     * @param c
     *        the c
     * @param qualifiers
     *        the qualifiers
     */
    protected static void addQualifiers(@Nonnull Clause c, @Nonnull Set<OWLAnnotation> qualifiers) {try{__CLR4_5_21cz1czlvicmt0y.R.inc(2481);
        __CLR4_5_21cz1czlvicmt0y.R.inc(2482);for (OWLAnnotation ann : qualifiers) {{
            __CLR4_5_21cz1czlvicmt0y.R.inc(2483);String prop = owlObjectToTag(ann.getProperty());
            __CLR4_5_21cz1czlvicmt0y.R.inc(2484);if ((((prop == null)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2485)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2486)==0&false))) {{
                __CLR4_5_21cz1czlvicmt0y.R.inc(2487);prop = ann.getProperty().getIRI().toString();
            }
            }__CLR4_5_21cz1czlvicmt0y.R.inc(2488);if ((((SKIPPED_QUALIFIERS.contains(prop))&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2489)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2490)==0&false))) {{
                __CLR4_5_21cz1czlvicmt0y.R.inc(2491);continue;
            }
            }__CLR4_5_21cz1czlvicmt0y.R.inc(2492);String value = ann.getValue().toString();
            __CLR4_5_21cz1czlvicmt0y.R.inc(2493);if ((((ann.getValue() instanceof OWLLiteral)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2494)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2495)==0&false))) {{
                __CLR4_5_21cz1czlvicmt0y.R.inc(2496);value = ((OWLLiteral) ann.getValue()).getLiteral();
            } }else {__CLR4_5_21cz1czlvicmt0y.R.inc(2497);if ((((ann.getValue() instanceof IRI)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2498)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2499)==0&false))) {{
                __CLR4_5_21cz1czlvicmt0y.R.inc(2500);value = getIdentifier((IRI) ann.getValue());
            }
            }}assert (((value != null)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2501)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2502)==0&false));
            __CLR4_5_21cz1czlvicmt0y.R.inc(2503);QualifierValue qv = new QualifierValue(prop, value);
            __CLR4_5_21cz1czlvicmt0y.R.inc(2504);c.addQualifierValue(qv);
        }
    }}finally{__CLR4_5_21cz1czlvicmt0y.R.flushNeeded();}}

    /**
     * E.g. http://purl.obolibrary.org/obo/go.owl to "go"<br>
     * if does not match this pattern, then retain original IRI
     * 
     * @param ontology
     *        the ontology
     * @return The OBO ID of the ontology
     */
    public static String getOntologyId(@Nonnull OWLOntology ontology) {try{__CLR4_5_21cz1czlvicmt0y.R.inc(2505);
        __CLR4_5_21cz1czlvicmt0y.R.inc(2506);return getOntologyId(ontology.getOntologyID().getOntologyIRI().get());
    }finally{__CLR4_5_21cz1czlvicmt0y.R.flushNeeded();}}

    /**
     * Gets the ontology id.
     * 
     * @param iriObj
     *        the iri obj
     * @return the ontology id
     */
    public static String getOntologyId(@Nonnull IRI iriObj) {try{__CLR4_5_21cz1czlvicmt0y.R.inc(2507);
        // String id = getIdentifier(ontology.getOntologyID().getOntologyIRI());
        __CLR4_5_21cz1czlvicmt0y.R.inc(2508);String iri = iriObj.toString();
        __CLR4_5_21cz1czlvicmt0y.R.inc(2509);String id;
        __CLR4_5_21cz1czlvicmt0y.R.inc(2510);if ((((iri.startsWith("http://purl.obolibrary.org/obo/"))&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2511)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2512)==0&false))) {{
            __CLR4_5_21cz1czlvicmt0y.R.inc(2513);id = iri.replace("http://purl.obolibrary.org/obo/", "");
            __CLR4_5_21cz1czlvicmt0y.R.inc(2514);if ((((id.endsWith(".owl"))&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2515)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2516)==0&false))) {{
                __CLR4_5_21cz1czlvicmt0y.R.inc(2517);id = id.replaceFirst(".owl$", "");
            }
        }} }else {{
            __CLR4_5_21cz1czlvicmt0y.R.inc(2518);id = iri;
        }
        // int index = iri.lastIndexOf("/");
        // id = iri.substring(index+1);
        // index = id.lastIndexOf(".owl");
        // if(index>0){
        // id = id.substring(0, index);
        // }
        }__CLR4_5_21cz1czlvicmt0y.R.inc(2519);return id;
    }finally{__CLR4_5_21cz1czlvicmt0y.R.flushNeeded();}}

    /**
     * Gets the data version.
     * 
     * @param ontology
     *        the ontology
     * @return the data version
     */
    @Nullable
    public static String getDataVersion(@Nonnull OWLOntology ontology) {try{__CLR4_5_21cz1czlvicmt0y.R.inc(2520);
        __CLR4_5_21cz1czlvicmt0y.R.inc(2521);String oid = getOntologyId(ontology);
        __CLR4_5_21cz1czlvicmt0y.R.inc(2522);Optional<IRI> v = ontology.getOntologyID().getVersionIRI();
        __CLR4_5_21cz1czlvicmt0y.R.inc(2523);if ((((v.isPresent())&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2524)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2525)==0&false))) {{
            __CLR4_5_21cz1czlvicmt0y.R.inc(2526);String vs = v.get().toString().replace("http://purl.obolibrary.org/obo/", "");
            __CLR4_5_21cz1czlvicmt0y.R.inc(2527);vs = vs.replaceFirst(oid + '/', "");
            __CLR4_5_21cz1czlvicmt0y.R.inc(2528);vs = vs.replace('/' + oid + ".owl", "");
            __CLR4_5_21cz1czlvicmt0y.R.inc(2529);return vs;
        }
        }__CLR4_5_21cz1czlvicmt0y.R.inc(2530);return null;
    }finally{__CLR4_5_21cz1czlvicmt0y.R.flushNeeded();}}

    /**
     * Tr.
     * 
     * @param ontology
     *        the ontology
     */
    protected void tr(@Nonnull OWLOntology ontology) {try{__CLR4_5_21cz1czlvicmt0y.R.inc(2531);
        __CLR4_5_21cz1czlvicmt0y.R.inc(2532);Frame f = new Frame(FrameType.HEADER);
        __CLR4_5_21cz1czlvicmt0y.R.inc(2533);getObodoc().setHeaderFrame(f);
        __CLR4_5_21cz1czlvicmt0y.R.inc(2534);for (IRI iri : ontology.getDirectImportsDocuments()) {{
            __CLR4_5_21cz1czlvicmt0y.R.inc(2535);Clause c = new Clause(OboFormatTag.TAG_IMPORT.getTag());
            // c.setValue(getOntologyId(iri));
            __CLR4_5_21cz1czlvicmt0y.R.inc(2536);c.setValue(iri.toString());
            __CLR4_5_21cz1czlvicmt0y.R.inc(2537);f.addClause(c);
        }
        }__CLR4_5_21cz1czlvicmt0y.R.inc(2538);String id = getOntologyId(ontology);
        __CLR4_5_21cz1czlvicmt0y.R.inc(2539);Clause c = new Clause(OboFormatTag.TAG_ONTOLOGY.getTag());
        __CLR4_5_21cz1czlvicmt0y.R.inc(2540);c.setValue(id);
        __CLR4_5_21cz1czlvicmt0y.R.inc(2541);f.addClause(c);
        __CLR4_5_21cz1czlvicmt0y.R.inc(2542);String vid = getDataVersion(ontology);
        __CLR4_5_21cz1czlvicmt0y.R.inc(2543);if ((((vid != null)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2544)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2545)==0&false))) {{
            __CLR4_5_21cz1czlvicmt0y.R.inc(2546);Clause c2 = new Clause(OboFormatTag.TAG_DATA_VERSION.getTag());
            __CLR4_5_21cz1czlvicmt0y.R.inc(2547);c2.setValue(vid);
            __CLR4_5_21cz1czlvicmt0y.R.inc(2548);f.addClause(c2);
        }
        }__CLR4_5_21cz1czlvicmt0y.R.inc(2549);for (OWLAnnotation ann : ontology.getAnnotations()) {{
            __CLR4_5_21cz1czlvicmt0y.R.inc(2550);OWLAnnotationProperty property = ann.getProperty();
            __CLR4_5_21cz1czlvicmt0y.R.inc(2551);String tagString = owlObjectToTag(property);
            __CLR4_5_21cz1czlvicmt0y.R.inc(2552);if ((((OboFormatTag.TAG_COMMENT.getTag().equals(tagString))&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2553)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2554)==0&false))) {{
                __CLR4_5_21cz1czlvicmt0y.R.inc(2555);property = fac.getOWLAnnotationProperty(OWLAPIObo2Owl.trTagToIRI(OboFormatTag.TAG_REMARK.getTag()));
            }
            }__CLR4_5_21cz1czlvicmt0y.R.inc(2556);tr(property, ann.getValue(), ann.getAnnotations(), f);
        }
    }}finally{__CLR4_5_21cz1czlvicmt0y.R.flushNeeded();}}

    /**
     * Tr.
     * 
     * @param ax
     *        the ax
     */
    protected void tr(@Nonnull OWLEquivalentClassesAxiom ax) {try{__CLR4_5_21cz1czlvicmt0y.R.inc(2557);
        /*
         * Assumption: the underlying data structure is a set The order is not
         * guaranteed to be preserved.
         */
        __CLR4_5_21cz1czlvicmt0y.R.inc(2558);Set<OWLClassExpression> expressions = ax.getClassExpressions();
        // handle expression list with size other than two elements as error
        __CLR4_5_21cz1czlvicmt0y.R.inc(2559);if ((((expressions.size() != 2)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2560)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2561)==0&false))) {{
            __CLR4_5_21cz1czlvicmt0y.R.inc(2562);error(ax, false);
            __CLR4_5_21cz1czlvicmt0y.R.inc(2563);return;
        }
        }__CLR4_5_21cz1czlvicmt0y.R.inc(2564);Iterator<OWLClassExpression> it = expressions.iterator();
        __CLR4_5_21cz1czlvicmt0y.R.inc(2565);OWLClassExpression ce1 = it.next();
        __CLR4_5_21cz1czlvicmt0y.R.inc(2566);OWLClassExpression ce2 = it.next();
        __CLR4_5_21cz1czlvicmt0y.R.inc(2567);if ((((ce1.isBottomEntity() || ce1.isTopEntity() || ce2.isBottomEntity() || ce2.isTopEntity())&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2568)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2569)==0&false))) {{
            __CLR4_5_21cz1czlvicmt0y.R.inc(2570);error("Equivalent classes axioms using Top or Bottom entities are not supported in OBO.", ax, false);
            __CLR4_5_21cz1czlvicmt0y.R.inc(2571);return;
        }
        }__CLR4_5_21cz1czlvicmt0y.R.inc(2572);if ((((!(ce1 instanceof OWLClass))&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2573)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2574)==0&false))) {{
            // check whether ce2 is the actual OWLEntity
            __CLR4_5_21cz1czlvicmt0y.R.inc(2575);if ((((ce2 instanceof OWLClass)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2576)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2577)==0&false))) {{
                // three way exchange
                __CLR4_5_21cz1czlvicmt0y.R.inc(2578);OWLClassExpression temp = ce2;
                __CLR4_5_21cz1czlvicmt0y.R.inc(2579);ce2 = ce1;
                __CLR4_5_21cz1czlvicmt0y.R.inc(2580);ce1 = temp;
            } }else {{
                // this might happen for some GCI axioms, which are not
                // expressible in OBO
                __CLR4_5_21cz1czlvicmt0y.R.inc(2581);error("GCI axioms are not expressible in OBO.", ax, false);
                __CLR4_5_21cz1czlvicmt0y.R.inc(2582);return;
            }
        }}
        }__CLR4_5_21cz1czlvicmt0y.R.inc(2583);Frame f = getTermFrame(ce1.asOWLClass());
        __CLR4_5_21cz1czlvicmt0y.R.inc(2584);if ((((f == null)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2585)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2586)==0&false))) {{
            __CLR4_5_21cz1czlvicmt0y.R.inc(2587);error(ax, false);
            __CLR4_5_21cz1czlvicmt0y.R.inc(2588);return;
        }
        }__CLR4_5_21cz1czlvicmt0y.R.inc(2589);boolean isUntranslateable = false;
        __CLR4_5_21cz1czlvicmt0y.R.inc(2590);List<Clause> equivalenceAxiomClauses = new ArrayList<>();
        __CLR4_5_21cz1czlvicmt0y.R.inc(2591);String cls2 = getIdentifier(ce2);
        __CLR4_5_21cz1czlvicmt0y.R.inc(2592);if ((((cls2 != null)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2593)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2594)==0&false))) {{
            __CLR4_5_21cz1czlvicmt0y.R.inc(2595);Clause c = new Clause(OboFormatTag.TAG_EQUIVALENT_TO.getTag());
            __CLR4_5_21cz1czlvicmt0y.R.inc(2596);c.setValue(cls2);
            __CLR4_5_21cz1czlvicmt0y.R.inc(2597);f.addClause(c);
            __CLR4_5_21cz1czlvicmt0y.R.inc(2598);addQualifiers(c, ax.getAnnotations());
        } }else {__CLR4_5_21cz1czlvicmt0y.R.inc(2599);if ((((ce2 instanceof OWLObjectUnionOf)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2600)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2601)==0&false))) {{
            __CLR4_5_21cz1czlvicmt0y.R.inc(2602);List<OWLClassExpression> list2 = ((OWLObjectUnionOf) ce2).getOperandsAsList();
            __CLR4_5_21cz1czlvicmt0y.R.inc(2603);for (OWLClassExpression oce : list2) {{
                __CLR4_5_21cz1czlvicmt0y.R.inc(2604);String id = getIdentifier(oce);
                __CLR4_5_21cz1czlvicmt0y.R.inc(2605);if ((((id == null)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2606)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2607)==0&false))) {{
                    __CLR4_5_21cz1czlvicmt0y.R.inc(2608);isUntranslateable = true;
                    __CLR4_5_21cz1czlvicmt0y.R.inc(2609);error(ax, true);
                    __CLR4_5_21cz1czlvicmt0y.R.inc(2610);return;
                }
                }__CLR4_5_21cz1czlvicmt0y.R.inc(2611);Clause c = new Clause(OboFormatTag.TAG_UNION_OF.getTag());
                __CLR4_5_21cz1czlvicmt0y.R.inc(2612);c.setValue(id);
                __CLR4_5_21cz1czlvicmt0y.R.inc(2613);equivalenceAxiomClauses.add(c);
                __CLR4_5_21cz1czlvicmt0y.R.inc(2614);addQualifiers(c, ax.getAnnotations());
            }
        }} }else {__CLR4_5_21cz1czlvicmt0y.R.inc(2615);if ((((ce2 instanceof OWLObjectIntersectionOf)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2616)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2617)==0&false))) {{
            __CLR4_5_21cz1czlvicmt0y.R.inc(2618);List<OWLClassExpression> list2 = ((OWLObjectIntersectionOf) ce2).getOperandsAsList();
            __CLR4_5_21cz1czlvicmt0y.R.inc(2619);for (OWLClassExpression ce : list2) {{
                __CLR4_5_21cz1czlvicmt0y.R.inc(2620);String r = null;
                __CLR4_5_21cz1czlvicmt0y.R.inc(2621);cls2 = getIdentifier(ce);
                __CLR4_5_21cz1czlvicmt0y.R.inc(2622);Integer exact = null; // cardinality
                __CLR4_5_21cz1czlvicmt0y.R.inc(2623);Integer min = null; // minCardinality
                __CLR4_5_21cz1czlvicmt0y.R.inc(2624);Integer max = null; // maxCardinality
                __CLR4_5_21cz1czlvicmt0y.R.inc(2625);Boolean allSome = null; // all_some
                __CLR4_5_21cz1czlvicmt0y.R.inc(2626);Boolean allOnly = null; // all_only
                __CLR4_5_21cz1czlvicmt0y.R.inc(2627);if ((((ce instanceof OWLObjectSomeValuesFrom)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2628)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2629)==0&false))) {{
                    __CLR4_5_21cz1czlvicmt0y.R.inc(2630);OWLObjectSomeValuesFrom ristriction = (OWLObjectSomeValuesFrom) ce;
                    __CLR4_5_21cz1czlvicmt0y.R.inc(2631);r = getIdentifier(ristriction.getProperty());
                    __CLR4_5_21cz1czlvicmt0y.R.inc(2632);cls2 = getIdentifier(ristriction.getFiller());
                } }else {__CLR4_5_21cz1czlvicmt0y.R.inc(2633);if ((((ce instanceof OWLObjectExactCardinality)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2634)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2635)==0&false))) {{
                    __CLR4_5_21cz1czlvicmt0y.R.inc(2636);OWLObjectExactCardinality card = (OWLObjectExactCardinality) ce;
                    __CLR4_5_21cz1czlvicmt0y.R.inc(2637);r = getIdentifier(card.getProperty());
                    __CLR4_5_21cz1czlvicmt0y.R.inc(2638);cls2 = getIdentifier(card.getFiller());
                    __CLR4_5_21cz1czlvicmt0y.R.inc(2639);exact = card.getCardinality();
                } }else {__CLR4_5_21cz1czlvicmt0y.R.inc(2640);if ((((ce instanceof OWLObjectMinCardinality)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2641)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2642)==0&false))) {{
                    __CLR4_5_21cz1czlvicmt0y.R.inc(2643);OWLObjectMinCardinality card = (OWLObjectMinCardinality) ce;
                    __CLR4_5_21cz1czlvicmt0y.R.inc(2644);r = getIdentifier(card.getProperty());
                    __CLR4_5_21cz1czlvicmt0y.R.inc(2645);cls2 = getIdentifier(card.getFiller());
                    __CLR4_5_21cz1czlvicmt0y.R.inc(2646);min = card.getCardinality();
                } }else {__CLR4_5_21cz1czlvicmt0y.R.inc(2647);if ((((ce instanceof OWLObjectMaxCardinality)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2648)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2649)==0&false))) {{
                    __CLR4_5_21cz1czlvicmt0y.R.inc(2650);OWLObjectMaxCardinality card = (OWLObjectMaxCardinality) ce;
                    __CLR4_5_21cz1czlvicmt0y.R.inc(2651);r = getIdentifier(card.getProperty());
                    __CLR4_5_21cz1czlvicmt0y.R.inc(2652);cls2 = getIdentifier(card.getFiller());
                    __CLR4_5_21cz1czlvicmt0y.R.inc(2653);max = card.getCardinality();
                } }else {__CLR4_5_21cz1czlvicmt0y.R.inc(2654);if ((((ce instanceof OWLObjectAllValuesFrom)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2655)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2656)==0&false))) {{
                    __CLR4_5_21cz1czlvicmt0y.R.inc(2657);OWLObjectAllValuesFrom all = (OWLObjectAllValuesFrom) ce;
                    __CLR4_5_21cz1czlvicmt0y.R.inc(2658);OWLClassExpression filler = all.getFiller();
                    __CLR4_5_21cz1czlvicmt0y.R.inc(2659);if ((((filler instanceof OWLClass)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2660)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2661)==0&false))) {{
                        __CLR4_5_21cz1czlvicmt0y.R.inc(2662);r = getIdentifier(all.getProperty());
                        __CLR4_5_21cz1czlvicmt0y.R.inc(2663);cls2 = getIdentifier(filler);
                        __CLR4_5_21cz1czlvicmt0y.R.inc(2664);allOnly = Boolean.TRUE;
                    } }else {__CLR4_5_21cz1czlvicmt0y.R.inc(2665);if ((((filler instanceof OWLObjectComplementOf)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2666)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2667)==0&false))) {{
                        __CLR4_5_21cz1czlvicmt0y.R.inc(2668);OWLObjectComplementOf restriction = (OWLObjectComplementOf) filler;
                        __CLR4_5_21cz1czlvicmt0y.R.inc(2669);r = getIdentifier(all.getProperty());
                        __CLR4_5_21cz1czlvicmt0y.R.inc(2670);cls2 = getIdentifier(restriction.getOperand());
                        __CLR4_5_21cz1czlvicmt0y.R.inc(2671);exact = 0;
                    }
                }}} }else {__CLR4_5_21cz1czlvicmt0y.R.inc(2672);if ((((ce instanceof OWLObjectIntersectionOf)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2673)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2674)==0&false))) {{
                    // either a min-max or a some-all combination
                    __CLR4_5_21cz1czlvicmt0y.R.inc(2675);Set<OWLClassExpression> operands = ((OWLObjectIntersectionOf) ce).getOperands();
                    __CLR4_5_21cz1czlvicmt0y.R.inc(2676);if ((((operands.size() == 2)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2677)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2678)==0&false))) {{
                        __CLR4_5_21cz1czlvicmt0y.R.inc(2679);for (OWLClassExpression operand : operands) {{
                            __CLR4_5_21cz1czlvicmt0y.R.inc(2680);if ((((operand instanceof OWLObjectMinCardinality)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2681)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2682)==0&false))) {{
                                __CLR4_5_21cz1czlvicmt0y.R.inc(2683);OWLObjectMinCardinality card = (OWLObjectMinCardinality) operand;
                                __CLR4_5_21cz1czlvicmt0y.R.inc(2684);r = getIdentifier(card.getProperty());
                                __CLR4_5_21cz1czlvicmt0y.R.inc(2685);cls2 = getIdentifier(card.getFiller());
                                __CLR4_5_21cz1czlvicmt0y.R.inc(2686);min = card.getCardinality();
                            } }else {__CLR4_5_21cz1czlvicmt0y.R.inc(2687);if ((((operand instanceof OWLObjectMaxCardinality)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2688)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2689)==0&false))) {{
                                __CLR4_5_21cz1czlvicmt0y.R.inc(2690);OWLObjectMaxCardinality card = (OWLObjectMaxCardinality) operand;
                                __CLR4_5_21cz1czlvicmt0y.R.inc(2691);r = getIdentifier(card.getProperty());
                                __CLR4_5_21cz1czlvicmt0y.R.inc(2692);cls2 = getIdentifier(card.getFiller());
                                __CLR4_5_21cz1czlvicmt0y.R.inc(2693);max = card.getCardinality();
                            } }else {__CLR4_5_21cz1czlvicmt0y.R.inc(2694);if ((((operand instanceof OWLObjectAllValuesFrom)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2695)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2696)==0&false))) {{
                                __CLR4_5_21cz1czlvicmt0y.R.inc(2697);OWLObjectAllValuesFrom all = (OWLObjectAllValuesFrom) operand;
                                __CLR4_5_21cz1czlvicmt0y.R.inc(2698);r = getIdentifier(all.getProperty());
                                __CLR4_5_21cz1czlvicmt0y.R.inc(2699);cls2 = getIdentifier(all.getFiller());
                                __CLR4_5_21cz1czlvicmt0y.R.inc(2700);allOnly = Boolean.TRUE;
                            } }else {__CLR4_5_21cz1czlvicmt0y.R.inc(2701);if ((((operand instanceof OWLObjectSomeValuesFrom)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2702)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2703)==0&false))) {{
                                __CLR4_5_21cz1czlvicmt0y.R.inc(2704);OWLObjectSomeValuesFrom all = (OWLObjectSomeValuesFrom) operand;
                                __CLR4_5_21cz1czlvicmt0y.R.inc(2705);r = getIdentifier(all.getProperty());
                                __CLR4_5_21cz1czlvicmt0y.R.inc(2706);cls2 = getIdentifier(all.getFiller());
                                __CLR4_5_21cz1czlvicmt0y.R.inc(2707);allSome = Boolean.TRUE;
                            }
                        }}}}}
                    }}
                }}
                }}}}}}__CLR4_5_21cz1czlvicmt0y.R.inc(2708);if ((((cls2 != null)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2709)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2710)==0&false))) {{
                    __CLR4_5_21cz1czlvicmt0y.R.inc(2711);Clause c = new Clause(OboFormatTag.TAG_INTERSECTION_OF.getTag());
                    __CLR4_5_21cz1czlvicmt0y.R.inc(2712);if ((((r != null)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2713)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2714)==0&false))) {{
                        __CLR4_5_21cz1czlvicmt0y.R.inc(2715);c.addValue(r);
                    }
                    }__CLR4_5_21cz1czlvicmt0y.R.inc(2716);c.addValue(cls2);
                    __CLR4_5_21cz1czlvicmt0y.R.inc(2717);equivalenceAxiomClauses.add(c);
                    __CLR4_5_21cz1czlvicmt0y.R.inc(2718);if ((((exact != null)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2719)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2720)==0&false))) {{
                        __CLR4_5_21cz1czlvicmt0y.R.inc(2721);String string = exact.toString();
                        assert (((string != null)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2722)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2723)==0&false));
                        __CLR4_5_21cz1czlvicmt0y.R.inc(2724);c.addQualifierValue(new QualifierValue("cardinality", string));
                    }
                    }__CLR4_5_21cz1czlvicmt0y.R.inc(2725);if ((((min != null)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2726)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2727)==0&false))) {{
                        __CLR4_5_21cz1czlvicmt0y.R.inc(2728);String string = min.toString();
                        assert (((string != null)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2729)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2730)==0&false));
                        __CLR4_5_21cz1czlvicmt0y.R.inc(2731);c.addQualifierValue(new QualifierValue("minCardinality", string));
                    }
                    }__CLR4_5_21cz1czlvicmt0y.R.inc(2732);if ((((max != null)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2733)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2734)==0&false))) {{
                        __CLR4_5_21cz1czlvicmt0y.R.inc(2735);String string = max.toString();
                        assert (((string != null)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2736)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2737)==0&false));
                        __CLR4_5_21cz1czlvicmt0y.R.inc(2738);c.addQualifierValue(new QualifierValue("maxCardinality", string));
                    }
                    }__CLR4_5_21cz1czlvicmt0y.R.inc(2739);if ((((allSome != null)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2740)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2741)==0&false))) {{
                        __CLR4_5_21cz1czlvicmt0y.R.inc(2742);String string = allSome.toString();
                        assert (((string != null)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2743)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2744)==0&false));
                        __CLR4_5_21cz1czlvicmt0y.R.inc(2745);c.addQualifierValue(new QualifierValue("all_some", string));
                    }
                    }__CLR4_5_21cz1czlvicmt0y.R.inc(2746);if ((((allOnly != null)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2747)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2748)==0&false))) {{
                        __CLR4_5_21cz1czlvicmt0y.R.inc(2749);String string = allOnly.toString();
                        assert (((string != null)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2750)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2751)==0&false));
                        __CLR4_5_21cz1czlvicmt0y.R.inc(2752);c.addQualifierValue(new QualifierValue("all_only", string));
                    }
                    }__CLR4_5_21cz1czlvicmt0y.R.inc(2753);addQualifiers(c, ax.getAnnotations());
                } }else {__CLR4_5_21cz1czlvicmt0y.R.inc(2754);if ((((!f.getClauses(OboFormatTag.TAG_INTERSECTION_OF).isEmpty())&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2755)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2756)==0&false))) {{
                    __CLR4_5_21cz1czlvicmt0y.R.inc(2757);error("The axiom is not translated (maximimum one IntersectionOf EquivalenceAxiom)", ax, false);
                } }else {{
                    __CLR4_5_21cz1czlvicmt0y.R.inc(2758);isUntranslateable = true;
                    __CLR4_5_21cz1czlvicmt0y.R.inc(2759);error(ax, false);
                }
            }}}
        }} }else {{
            __CLR4_5_21cz1czlvicmt0y.R.inc(2760);isUntranslateable = true;
            __CLR4_5_21cz1czlvicmt0y.R.inc(2761);error(ax, false);
        }
        // Only add clauses if the *entire* equivalence axiom can be translated
        }}}__CLR4_5_21cz1czlvicmt0y.R.inc(2762);if ((((!isUntranslateable)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2763)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2764)==0&false))) {{
            __CLR4_5_21cz1czlvicmt0y.R.inc(2765);for (Clause c : equivalenceAxiomClauses) {{
                __CLR4_5_21cz1czlvicmt0y.R.inc(2766);f.addClause(c);
            }
        }}
    }}finally{__CLR4_5_21cz1czlvicmt0y.R.flushNeeded();}}

    /**
     * Tr.
     * 
     * @param ax
     *        the ax
     */
    protected void tr(@Nonnull OWLDisjointClassesAxiom ax) {try{__CLR4_5_21cz1czlvicmt0y.R.inc(2767);
        // use set, the OWL-API does not provide an order
        __CLR4_5_21cz1czlvicmt0y.R.inc(2768);Set<OWLClassExpression> set = ax.getClassExpressions();
        __CLR4_5_21cz1czlvicmt0y.R.inc(2769);if ((((set.size() != 2)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2770)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2771)==0&false))) {{
            __CLR4_5_21cz1czlvicmt0y.R.inc(2772);error("Expected two classes in a disjoin classes axiom.", ax, false);
        }
        }__CLR4_5_21cz1czlvicmt0y.R.inc(2773);Iterator<OWLClassExpression> it = set.iterator();
        __CLR4_5_21cz1czlvicmt0y.R.inc(2774);OWLClassExpression ce1 = it.next();
        __CLR4_5_21cz1czlvicmt0y.R.inc(2775);OWLClassExpression ce2 = it.next();
        __CLR4_5_21cz1czlvicmt0y.R.inc(2776);if ((((ce1.isBottomEntity() || ce1.isTopEntity() || ce2.isBottomEntity() || ce2.isTopEntity())&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2777)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2778)==0&false))) {{
            __CLR4_5_21cz1czlvicmt0y.R.inc(2779);error("Disjoint classes axiom using Top or Bottom entities are not supported.", ax, false);
        }
        }__CLR4_5_21cz1czlvicmt0y.R.inc(2780);String cls2 = getIdentifier(ce2);
        __CLR4_5_21cz1czlvicmt0y.R.inc(2781);if ((((cls2 == null)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2782)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2783)==0&false))) {{
            __CLR4_5_21cz1czlvicmt0y.R.inc(2784);error(ax, true);
            __CLR4_5_21cz1czlvicmt0y.R.inc(2785);return;
        }
        }__CLR4_5_21cz1czlvicmt0y.R.inc(2786);if ((((ce1.isAnonymous())&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2787)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2788)==0&false))) {{
            __CLR4_5_21cz1czlvicmt0y.R.inc(2789);error(ax, false);
            __CLR4_5_21cz1czlvicmt0y.R.inc(2790);return;
        }
        }__CLR4_5_21cz1czlvicmt0y.R.inc(2791);OWLClass cls1 = ce1.asOWLClass();
        __CLR4_5_21cz1czlvicmt0y.R.inc(2792);Frame f = getTermFrame(cls1);
        __CLR4_5_21cz1czlvicmt0y.R.inc(2793);Clause c = new Clause(OboFormatTag.TAG_DISJOINT_FROM.getTag());
        __CLR4_5_21cz1czlvicmt0y.R.inc(2794);c.setValue(cls2);
        __CLR4_5_21cz1czlvicmt0y.R.inc(2795);f.addClause(c);
        __CLR4_5_21cz1czlvicmt0y.R.inc(2796);addQualifiers(c, ax.getAnnotations());
    }finally{__CLR4_5_21cz1czlvicmt0y.R.flushNeeded();}}

    /**
     * Tr.
     * 
     * @param axiom
     *        the axiom
     */
    protected void tr(@Nonnull OWLDeclarationAxiom axiom) {try{__CLR4_5_21cz1czlvicmt0y.R.inc(2797);
        __CLR4_5_21cz1czlvicmt0y.R.inc(2798);OWLEntity entity = axiom.getEntity();
        __CLR4_5_21cz1czlvicmt0y.R.inc(2799);if ((((entity.isBottomEntity() || entity.isTopEntity())&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2800)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2801)==0&false))) {{
            __CLR4_5_21cz1czlvicmt0y.R.inc(2802);return;
        }
        }__CLR4_5_21cz1czlvicmt0y.R.inc(2803);Set<OWLAnnotationAssertionAxiom> set = owlOntology.getAnnotationAssertionAxioms(entity.getIRI());
        __CLR4_5_21cz1czlvicmt0y.R.inc(2804);if ((((set.isEmpty())&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2805)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2806)==0&false))) {{
            __CLR4_5_21cz1czlvicmt0y.R.inc(2807);return;
        }
        }__CLR4_5_21cz1czlvicmt0y.R.inc(2808);boolean isClass = entity.isOWLClass();
        __CLR4_5_21cz1czlvicmt0y.R.inc(2809);boolean isObjectProperty = entity.isOWLObjectProperty();
        __CLR4_5_21cz1czlvicmt0y.R.inc(2810);boolean isAnnotationProperty = entity.isOWLAnnotationProperty();
        // check whether the entity is an alt_id
        __CLR4_5_21cz1czlvicmt0y.R.inc(2811);Optional<OboAltIdCheckResult> altIdOptional = checkForOboAltId(set);
        __CLR4_5_21cz1czlvicmt0y.R.inc(2812);if ((((altIdOptional.isPresent())&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2813)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2814)==0&false))) {{
            // the entity will not be translated
            // instead create the appropriate alt_id in the replaced_by frame
            __CLR4_5_21cz1czlvicmt0y.R.inc(2815);String currentId = getIdentifier(entity.getIRI());
            __CLR4_5_21cz1czlvicmt0y.R.inc(2816);addAltId(altIdOptional.get().replacedBy, currentId, isClass, isObjectProperty);
            // add unrelated annotations to untranslatableAxioms axioms
            __CLR4_5_21cz1czlvicmt0y.R.inc(2817);untranslatableAxioms.addAll(altIdOptional.get().unrelated);
            __CLR4_5_21cz1czlvicmt0y.R.inc(2818);return;
        }
        // translate
        }__CLR4_5_21cz1czlvicmt0y.R.inc(2819);Frame f = null;
        __CLR4_5_21cz1czlvicmt0y.R.inc(2820);if ((((isClass)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2821)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2822)==0&false))) {{
            __CLR4_5_21cz1czlvicmt0y.R.inc(2823);f = getTermFrame(entity.asOWLClass());
        } }else {__CLR4_5_21cz1czlvicmt0y.R.inc(2824);if ((((isObjectProperty)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2825)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2826)==0&false))) {{
            __CLR4_5_21cz1czlvicmt0y.R.inc(2827);f = getTypedefFrame(entity.asOWLObjectProperty());
        } }else {__CLR4_5_21cz1czlvicmt0y.R.inc(2828);if ((((isAnnotationProperty)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2829)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2830)==0&false))) {{
            __CLR4_5_21cz1czlvicmt0y.R.inc(2831);for (OWLAxiom a : set) {{
                __CLR4_5_21cz1czlvicmt0y.R.inc(2832);OWLAnnotationAssertionAxiom ax = (OWLAnnotationAssertionAxiom) a;
                __CLR4_5_21cz1czlvicmt0y.R.inc(2833);OWLAnnotationProperty prop = ax.getProperty();
                __CLR4_5_21cz1czlvicmt0y.R.inc(2834);String tag = owlObjectToTag(prop);
                __CLR4_5_21cz1czlvicmt0y.R.inc(2835);if ((((OboFormatTag.TAG_IS_METADATA_TAG.getTag().equals(tag))&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2836)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2837)==0&false))) {{
                    __CLR4_5_21cz1czlvicmt0y.R.inc(2838);f = getTypedefFrame(entity);
                    __CLR4_5_21cz1czlvicmt0y.R.inc(2839);break;
                }
            }}
        }}
        }}}__CLR4_5_21cz1czlvicmt0y.R.inc(2840);if ((((f != null)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2841)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2842)==0&false))) {{
            __CLR4_5_21cz1czlvicmt0y.R.inc(2843);for (OWLAnnotationAssertionAxiom a : set) {{
                assert (((a != null)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2844)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2845)==0&false));
                __CLR4_5_21cz1czlvicmt0y.R.inc(2846);tr(a, f);
            }
            }__CLR4_5_21cz1czlvicmt0y.R.inc(2847);add(f);
        }
    }}finally{__CLR4_5_21cz1czlvicmt0y.R.flushNeeded();}}

    private void addAltId(@Nonnull String replacedBy, @Nonnull String altId, boolean isClass, boolean isProperty) {try{__CLR4_5_21cz1czlvicmt0y.R.inc(2848);
        __CLR4_5_21cz1czlvicmt0y.R.inc(2849);Frame replacedByFrame = null;
        __CLR4_5_21cz1czlvicmt0y.R.inc(2850);if ((((isClass)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2851)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2852)==0&false))) {{
            __CLR4_5_21cz1czlvicmt0y.R.inc(2853);replacedByFrame = getTermFrame(replacedBy);
        } }else {__CLR4_5_21cz1czlvicmt0y.R.inc(2854);if ((((isProperty)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2855)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2856)==0&false))) {{
            __CLR4_5_21cz1czlvicmt0y.R.inc(2857);replacedByFrame = getTypedefFrame(replacedBy);
        }
        }}__CLR4_5_21cz1czlvicmt0y.R.inc(2858);if ((((replacedByFrame != null)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2859)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2860)==0&false))) {{
            __CLR4_5_21cz1czlvicmt0y.R.inc(2861);boolean addClause = true;
            // check existing alt_ids to avoid duplicate clauses
            __CLR4_5_21cz1czlvicmt0y.R.inc(2862);Collection<Clause> existing = replacedByFrame.getClauses(OboFormatTag.TAG_ALT_ID);
            __CLR4_5_21cz1czlvicmt0y.R.inc(2863);for (Clause clause : existing) {{
                __CLR4_5_21cz1czlvicmt0y.R.inc(2864);if ((((altId.equals(clause.getValue(String.class)))&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2865)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2866)==0&false))) {{
                    __CLR4_5_21cz1czlvicmt0y.R.inc(2867);addClause = false;
                }
            }}
            }__CLR4_5_21cz1czlvicmt0y.R.inc(2868);if ((((addClause)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2869)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2870)==0&false))) {{
                __CLR4_5_21cz1czlvicmt0y.R.inc(2871);replacedByFrame.addClause(new Clause(OboFormatTag.TAG_ALT_ID, altId));
            }
        }}
    }}finally{__CLR4_5_21cz1czlvicmt0y.R.flushNeeded();}}

    /**
     * Helper class: allow to return two values for the alt id check.
     */
    private static class OboAltIdCheckResult {

        final String replacedBy;
        final Set<OWLAnnotationAssertionAxiom> unrelated;

        OboAltIdCheckResult(@Nonnull String replacedBy, @Nonnull Set<OWLAnnotationAssertionAxiom> unrelated) {try{__CLR4_5_21cz1czlvicmt0y.R.inc(2872);
            __CLR4_5_21cz1czlvicmt0y.R.inc(2873);this.replacedBy = replacedBy;
            __CLR4_5_21cz1czlvicmt0y.R.inc(2874);this.unrelated = unrelated;
        }finally{__CLR4_5_21cz1czlvicmt0y.R.flushNeeded();}}
    }

    /**
     * Check the entity annotations for axioms declaring it to be an obsolete
     * entity, with 'obsolescence reason' being 'term merge', and a non-empty
     * 'replaced by' literal. This corresponds to an OBO alternate identifier.
     * Track non related annotations.
     * 
     * @param annotations
     *        set of annotations for the entity @return replaced_by if it is an
     *        alt_id
     * @return optional check result
     */
    @Nonnull
    private static Optional<OboAltIdCheckResult> checkForOboAltId(Set<OWLAnnotationAssertionAxiom> annotations) {try{__CLR4_5_21cz1czlvicmt0y.R.inc(2875);
        __CLR4_5_21cz1czlvicmt0y.R.inc(2876);String replacedBy = null;
        __CLR4_5_21cz1czlvicmt0y.R.inc(2877);boolean isMerged = false;
        __CLR4_5_21cz1czlvicmt0y.R.inc(2878);boolean isDeprecated = false;
        __CLR4_5_21cz1czlvicmt0y.R.inc(2879);final Set<OWLAnnotationAssertionAxiom> unrelatedAxioms = new HashSet<>();
        __CLR4_5_21cz1czlvicmt0y.R.inc(2880);for (OWLAnnotationAssertionAxiom axiom : annotations) {{
            __CLR4_5_21cz1czlvicmt0y.R.inc(2881);OWLAnnotationProperty prop = axiom.getProperty();
            __CLR4_5_21cz1czlvicmt0y.R.inc(2882);if ((((prop.isDeprecated())&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2883)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2884)==0&false))) {{
                __CLR4_5_21cz1czlvicmt0y.R.inc(2885);isDeprecated = true;
            } }else {__CLR4_5_21cz1czlvicmt0y.R.inc(2886);if ((((Obo2OWLConstants.IRI_IAO_0000231.equals(prop.getIRI()))&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2887)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2888)==0&false))) {{
                __CLR4_5_21cz1czlvicmt0y.R.inc(2889);OWLAnnotationValue value = axiom.getValue();
                __CLR4_5_21cz1czlvicmt0y.R.inc(2890);Optional<IRI> asIRI = value.asIRI();
                __CLR4_5_21cz1czlvicmt0y.R.inc(2891);if ((((asIRI.isPresent())&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2892)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2893)==0&false))) {{
                    __CLR4_5_21cz1czlvicmt0y.R.inc(2894);isMerged = Obo2OWLConstants.IRI_IAO_0000227.equals(asIRI.get());
                } }else {{
                    __CLR4_5_21cz1czlvicmt0y.R.inc(2895);unrelatedAxioms.add(axiom);
                }
            }} }else {__CLR4_5_21cz1czlvicmt0y.R.inc(2896);if ((((Obo2OWLVocabulary.IRI_IAO_0100001.iri.equals(prop.getIRI()))&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2897)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2898)==0&false))) {{
                __CLR4_5_21cz1czlvicmt0y.R.inc(2899);OWLAnnotationValue value = axiom.getValue();
                __CLR4_5_21cz1czlvicmt0y.R.inc(2900);Optional<OWLLiteral> asLiteral = value.asLiteral();
                __CLR4_5_21cz1czlvicmt0y.R.inc(2901);if ((((asLiteral.isPresent())&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2902)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2903)==0&false))) {{
                    __CLR4_5_21cz1czlvicmt0y.R.inc(2904);replacedBy = asLiteral.get().getLiteral();
                } }else {{
                    // fallback: also check for an IRI
                    __CLR4_5_21cz1czlvicmt0y.R.inc(2905);Optional<IRI> asIRI = value.asIRI();
                    __CLR4_5_21cz1czlvicmt0y.R.inc(2906);if ((((asIRI.isPresent())&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2907)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2908)==0&false))) {{
                        // translate IRI to OBO style ID
                        __CLR4_5_21cz1czlvicmt0y.R.inc(2909);replacedBy = getIdentifier(asIRI.get());
                    } }else {{
                        __CLR4_5_21cz1czlvicmt0y.R.inc(2910);unrelatedAxioms.add(axiom);
                    }
                }}
            }} }else {{
                __CLR4_5_21cz1czlvicmt0y.R.inc(2911);unrelatedAxioms.add(axiom);
            }
        }}}}
        }__CLR4_5_21cz1czlvicmt0y.R.inc(2912);Optional<OboAltIdCheckResult> result;
        __CLR4_5_21cz1czlvicmt0y.R.inc(2913);if ((((replacedBy != null && isMerged && isDeprecated)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2914)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2915)==0&false))) {{
            __CLR4_5_21cz1czlvicmt0y.R.inc(2916);result = Optional.of(new OboAltIdCheckResult(replacedBy, unrelatedAxioms));
        } }else {{
            __CLR4_5_21cz1czlvicmt0y.R.inc(2917);result = Optional.absent();
        }
        }__CLR4_5_21cz1czlvicmt0y.R.inc(2918);return result;
    }finally{__CLR4_5_21cz1czlvicmt0y.R.flushNeeded();}}

    /**
     * Gets the identifier.
     * 
     * @param obj
     *        the obj
     * @return the identifier
     */
    @Nullable
    public String getIdentifier(OWLObject obj) {try{__CLR4_5_21cz1czlvicmt0y.R.inc(2919);
        __CLR4_5_21cz1czlvicmt0y.R.inc(2920);try {
            __CLR4_5_21cz1czlvicmt0y.R.inc(2921);return getIdentifierFromObject(obj, getOWLOntology());
        } catch (UntranslatableAxiomException e) {
            __CLR4_5_21cz1czlvicmt0y.R.inc(2922);error(e.getMessage(), true);
        }
        __CLR4_5_21cz1czlvicmt0y.R.inc(2923);return null;
    }finally{__CLR4_5_21cz1czlvicmt0y.R.flushNeeded();}}

    /**
     * @return true if untranslatable axioms should not be logged
     */
    public boolean isMuteUntranslatableAxioms() {try{__CLR4_5_21cz1czlvicmt0y.R.inc(2924);
        __CLR4_5_21cz1czlvicmt0y.R.inc(2925);return muteUntranslatableAxioms;
    }finally{__CLR4_5_21cz1czlvicmt0y.R.flushNeeded();}}

    /**
     * @param muteUntranslatableAxioms
     *        true disables logging
     */
    public void setMuteUntranslatableAxioms(boolean muteUntranslatableAxioms) {try{__CLR4_5_21cz1czlvicmt0y.R.inc(2926);
        __CLR4_5_21cz1czlvicmt0y.R.inc(2927);this.muteUntranslatableAxioms = muteUntranslatableAxioms;
    }finally{__CLR4_5_21cz1czlvicmt0y.R.flushNeeded();}}

    /**
     * The Class UntranslatableAxiomException.
     */
    public static class UntranslatableAxiomException extends Exception {

        // generated
        private static final long serialVersionUID = 40000L;

        /**
         * Instantiates a new untranslatable axiom exception.
         * 
         * @param message
         *        the message
         * @param cause
         *        the cause
         */
        public UntranslatableAxiomException(String message, Throwable cause) {
            super(message, cause);__CLR4_5_21cz1czlvicmt0y.R.inc(2929);try{__CLR4_5_21cz1czlvicmt0y.R.inc(2928);
        }finally{__CLR4_5_21cz1czlvicmt0y.R.flushNeeded();}}

        /**
         * Instantiates a new untranslatable axiom exception.
         * 
         * @param message
         *        the message
         */
        public UntranslatableAxiomException(String message) {
            super(message);__CLR4_5_21cz1czlvicmt0y.R.inc(2931);try{__CLR4_5_21cz1czlvicmt0y.R.inc(2930);
        }finally{__CLR4_5_21cz1czlvicmt0y.R.flushNeeded();}}
    }

    /**
     * Retrieve the identifier for a given {@link OWLObject}. This methods uses
     * also shorthand hints to resolve the identifier. Should the translation
     * process encounter a problem or not find an identifier the defaultValue is
     * returned.
     * 
     * @param obj
     *        the {@link OWLObject} to resolve
     * @param ont
     *        the target ontology
     * @param defaultValue
     *        the value to return in case of an error or no id
     * @return identifier or the default value
     */
    @Nonnull
    public static String getIdentifierFromObject(@Nonnull OWLObject obj, @Nonnull OWLOntology ont,
        @Nonnull String defaultValue) {try{__CLR4_5_21cz1czlvicmt0y.R.inc(2932);
        __CLR4_5_21cz1czlvicmt0y.R.inc(2933);String id = defaultValue;
        __CLR4_5_21cz1czlvicmt0y.R.inc(2934);try {
            __CLR4_5_21cz1czlvicmt0y.R.inc(2935);id = getIdentifierFromObject(obj, ont);
            __CLR4_5_21cz1czlvicmt0y.R.inc(2936);if ((((id == null)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2937)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2938)==0&false))) {{
                __CLR4_5_21cz1czlvicmt0y.R.inc(2939);id = defaultValue;
            }
        }} catch (UntranslatableAxiomException e) {
            __CLR4_5_21cz1czlvicmt0y.R.inc(2940);LOG.error(e.getMessage(), e);
        }
        __CLR4_5_21cz1czlvicmt0y.R.inc(2941);return id;
    }finally{__CLR4_5_21cz1czlvicmt0y.R.flushNeeded();}}

    /**
     * Retrieve the identifier for a given {@link OWLObject}. This methods uses
     * also shorthand hints to resolve the identifier. Should the translation
     * process encounter an unexpected axiom an
     * 
     * @param obj
     *        the {@link OWLObject} to resolve
     * @param ont
     *        the target ontology
     * @return identifier or null
     * @throws UntranslatableAxiomException
     *         the untranslatable axiom exception
     *         {@link UntranslatableAxiomException} is thrown.
     */
    @SuppressWarnings("null")
    @Nullable
    public static String getIdentifierFromObject(OWLObject obj, @Nonnull OWLOntology ont)
        throws UntranslatableAxiomException {try{__CLR4_5_21cz1czlvicmt0y.R.inc(2942);
        __CLR4_5_21cz1czlvicmt0y.R.inc(2943);if ((((obj instanceof OWLObjectProperty || obj instanceof OWLAnnotationProperty)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2944)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2945)==0&false))) {{
            __CLR4_5_21cz1czlvicmt0y.R.inc(2946);OWLEntity entity = (OWLEntity) obj;
            __CLR4_5_21cz1czlvicmt0y.R.inc(2947);Set<OWLAnnotationAssertionAxiom> axioms = ont.getAnnotationAssertionAxioms(entity.getIRI());
            __CLR4_5_21cz1czlvicmt0y.R.inc(2948);for (OWLAnnotationAssertionAxiom ax : axioms) {{
                __CLR4_5_21cz1czlvicmt0y.R.inc(2949);String propId = getIdentifierFromObject(ax.getProperty().getIRI(), ont);
                // see BFOROXrefTest
                // 5.9.3. Special Rules for Relations
                __CLR4_5_21cz1czlvicmt0y.R.inc(2950);if ((((propId.equals("shorthand"))&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2951)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2952)==0&false))) {{
                    __CLR4_5_21cz1czlvicmt0y.R.inc(2953);OWLAnnotationValue value = ax.getValue();
                    __CLR4_5_21cz1czlvicmt0y.R.inc(2954);if ((((value instanceof OWLLiteral)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2955)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2956)==0&false))) {{
                        __CLR4_5_21cz1czlvicmt0y.R.inc(2957);return ((OWLLiteral) value).getLiteral();
                    }
                    }__CLR4_5_21cz1czlvicmt0y.R.inc(2958);throw new UntranslatableAxiomException("Untranslatable axiom, expected literal value, but was: "
                        + value + " in axiom: " + ax);
                }
            }}
        }}
        }__CLR4_5_21cz1czlvicmt0y.R.inc(2959);if ((((obj instanceof OWLEntity)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2960)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2961)==0&false))) {{
            __CLR4_5_21cz1czlvicmt0y.R.inc(2962);return getIdentifier(((OWLEntity) obj).getIRI());
        }
        }__CLR4_5_21cz1czlvicmt0y.R.inc(2963);if ((((obj instanceof IRI)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2964)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2965)==0&false))) {{
            __CLR4_5_21cz1czlvicmt0y.R.inc(2966);return getIdentifier((IRI) obj);
        }
        }__CLR4_5_21cz1czlvicmt0y.R.inc(2967);return null;
    }finally{__CLR4_5_21cz1czlvicmt0y.R.flushNeeded();}}

    /**
     * See table 5.9.2. Translation of identifiers
     * 
     * @param iriId
     *        the iri id
     * @return obo identifier or null
     */
    @Nullable
    public static String getIdentifier(@Nullable IRI iriId) {try{__CLR4_5_21cz1czlvicmt0y.R.inc(2968);
        __CLR4_5_21cz1czlvicmt0y.R.inc(2969);if ((((iriId == null)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2970)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2971)==0&false))) {{
            __CLR4_5_21cz1czlvicmt0y.R.inc(2972);return null;
        }
        }__CLR4_5_21cz1czlvicmt0y.R.inc(2973);String iri = iriId.toString();
        // canonical IRIs
        // if (iri.startsWith("http://purl.obolibrary.org/obo/")) {
        // String canonicalId = iri.replace("http://purl.obolibrary.org/obo/",
        // "");
        // }
        __CLR4_5_21cz1czlvicmt0y.R.inc(2974);int indexSlash = iri.lastIndexOf('/');
        __CLR4_5_21cz1czlvicmt0y.R.inc(2975);String id = null;
        __CLR4_5_21cz1czlvicmt0y.R.inc(2976);if ((((indexSlash > -1)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2977)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2978)==0&false))) {{
            __CLR4_5_21cz1czlvicmt0y.R.inc(2979);id = iri.substring(indexSlash + 1);
        } }else {{
            __CLR4_5_21cz1czlvicmt0y.R.inc(2980);id = iri;
        }
        }__CLR4_5_21cz1czlvicmt0y.R.inc(2981);String[] s = id.split("#_");
        // table 5.9.2 row 2 - NonCanonical-Prefixed-ID
        __CLR4_5_21cz1czlvicmt0y.R.inc(2982);if ((((s.length > 1)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2983)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2984)==0&false))) {{
            __CLR4_5_21cz1czlvicmt0y.R.inc(2985);return s[0] + ':' + s[1];
        }
        // row 3 - Unprefixed-ID
        }__CLR4_5_21cz1czlvicmt0y.R.inc(2986);s = id.split("#");
        __CLR4_5_21cz1czlvicmt0y.R.inc(2987);if ((((s.length > 1)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2988)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2989)==0&false))) {{
            // prefixURI = prefixURI + s[0] + "#";
            // if(!(s[1].contains("#") || s[1].contains("_"))){
            __CLR4_5_21cz1czlvicmt0y.R.inc(2990);String prefix = "";
            __CLR4_5_21cz1czlvicmt0y.R.inc(2991);if (((("owl".equals(s[0]) || "rdf".equals(s[0]) || "rdfs".equals(s[0]))&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2992)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2993)==0&false))) {{
                __CLR4_5_21cz1czlvicmt0y.R.inc(2994);prefix = s[0] + ':';
            }
            // TODO: the following implements behavior in current spec, but this
            // leads to undesirable results
            // else if (baseOntology != null) {
            // String oid = getOntologyId(baseOntology); // OBO-style ID
            // if (oid.equals(s[0]))
            // prefix = "";
            // else {
            // return iri;
            // }
            // //prefix = s[0];
            // }
            }__CLR4_5_21cz1czlvicmt0y.R.inc(2995);return prefix + s[1];
        }
        // row 1 - Canonical-Prefixed-ID
        }__CLR4_5_21cz1czlvicmt0y.R.inc(2996);s = id.split("_");
        __CLR4_5_21cz1czlvicmt0y.R.inc(2997);if ((((s.length == 2 && !id.contains("#") && !s[1].contains("_"))&&(__CLR4_5_21cz1czlvicmt0y.R.iget(2998)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(2999)==0&false))) {{
            __CLR4_5_21cz1czlvicmt0y.R.inc(3000);String localId;
            __CLR4_5_21cz1czlvicmt0y.R.inc(3001);try {
                __CLR4_5_21cz1czlvicmt0y.R.inc(3002);localId = java.net.URLDecoder.decode(s[1], "UTF-8");
                __CLR4_5_21cz1czlvicmt0y.R.inc(3003);return s[0] + ':' + localId;
            } catch (UnsupportedEncodingException e) {
                __CLR4_5_21cz1czlvicmt0y.R.inc(3004);throw new OWLRuntimeException("UTF-8 not supported, JRE corrupted?", e);
            }
        }
        }__CLR4_5_21cz1czlvicmt0y.R.inc(3005);if ((((s.length > 2 && !id.contains("#") && s[s.length - 1].replaceAll("[0-9]", "").isEmpty())&&(__CLR4_5_21cz1czlvicmt0y.R.iget(3006)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(3007)==0&false))) {{
            __CLR4_5_21cz1czlvicmt0y.R.inc(3008);StringBuffer sb = new StringBuffer();
            __CLR4_5_21cz1czlvicmt0y.R.inc(3009);for (int i = 0; (((i < s.length)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(3010)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(3011)==0&false)); i++) {{
                __CLR4_5_21cz1czlvicmt0y.R.inc(3012);if ((((i > 0)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(3013)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(3014)==0&false))) {{
                    __CLR4_5_21cz1czlvicmt0y.R.inc(3015);if ((((i == s.length - 1)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(3016)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(3017)==0&false))) {{
                        __CLR4_5_21cz1czlvicmt0y.R.inc(3018);sb.append(':');
                    } }else {{
                        __CLR4_5_21cz1czlvicmt0y.R.inc(3019);sb.append('_');
                    }
                }}
                }__CLR4_5_21cz1czlvicmt0y.R.inc(3020);sb.append(s[i]);
            }
            }__CLR4_5_21cz1czlvicmt0y.R.inc(3021);return sb.toString();
        }
        }__CLR4_5_21cz1czlvicmt0y.R.inc(3022);return iri;
    }finally{__CLR4_5_21cz1czlvicmt0y.R.flushNeeded();}}

    /**
     * Owl object to tag.
     * 
     * @param obj
     *        the obj
     * @return the string
     */
    @Nullable
    public static String owlObjectToTag(OWLObject obj) {try{__CLR4_5_21cz1czlvicmt0y.R.inc(3023);
        __CLR4_5_21cz1czlvicmt0y.R.inc(3024);IRI iriObj = null;
        __CLR4_5_21cz1czlvicmt0y.R.inc(3025);if ((((obj instanceof OWLNamedObject)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(3026)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(3027)==0&false))) {{
            __CLR4_5_21cz1czlvicmt0y.R.inc(3028);iriObj = ((OWLNamedObject) obj).getIRI();
        } }else {__CLR4_5_21cz1czlvicmt0y.R.inc(3029);if ((((obj instanceof IRI)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(3030)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(3031)==0&false))) {{
            __CLR4_5_21cz1czlvicmt0y.R.inc(3032);iriObj = (IRI) obj;
        }
        }}__CLR4_5_21cz1czlvicmt0y.R.inc(3033);if ((((iriObj == null)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(3034)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(3035)==0&false))) {{
            __CLR4_5_21cz1czlvicmt0y.R.inc(3036);return null;
        }
        }__CLR4_5_21cz1czlvicmt0y.R.inc(3037);String iri = iriObj.toString();
        __CLR4_5_21cz1czlvicmt0y.R.inc(3038);String tag = ANNOTATIONPROPERTYMAP.get(iri);
        __CLR4_5_21cz1czlvicmt0y.R.inc(3039);if ((((tag == null)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(3040)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(3041)==0&false))) {{
            // hardcoded values for legacy annotation properties: (TEMPORARY)
            __CLR4_5_21cz1czlvicmt0y.R.inc(3042);if ((((iri.startsWith(Obo2OWLConstants.DEFAULT_IRI_PREFIX + "IAO_"))&&(__CLR4_5_21cz1czlvicmt0y.R.iget(3043)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(3044)==0&false))) {{
                __CLR4_5_21cz1czlvicmt0y.R.inc(3045);String legacyId = iri.replace(Obo2OWLConstants.DEFAULT_IRI_PREFIX, "");
                __CLR4_5_21cz1czlvicmt0y.R.inc(3046);if ((((legacyId.equals("IAO_xref"))&&(__CLR4_5_21cz1czlvicmt0y.R.iget(3047)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(3048)==0&false))) {{
                    __CLR4_5_21cz1czlvicmt0y.R.inc(3049);return OboFormatTag.TAG_XREF.getTag();
                }
                }__CLR4_5_21cz1czlvicmt0y.R.inc(3050);if ((((legacyId.equals("IAO_id"))&&(__CLR4_5_21cz1czlvicmt0y.R.iget(3051)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(3052)==0&false))) {{
                    __CLR4_5_21cz1czlvicmt0y.R.inc(3053);return OboFormatTag.TAG_ID.getTag();
                }
                }__CLR4_5_21cz1czlvicmt0y.R.inc(3054);if ((((legacyId.equals("IAO_namespace"))&&(__CLR4_5_21cz1czlvicmt0y.R.iget(3055)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(3056)==0&false))) {{
                    __CLR4_5_21cz1czlvicmt0y.R.inc(3057);return OboFormatTag.TAG_NAMESPACE.getTag();
                }
            }}
            }__CLR4_5_21cz1czlvicmt0y.R.inc(3058);String prefix = Obo2OWLConstants.OIOVOCAB_IRI_PREFIX;
            __CLR4_5_21cz1czlvicmt0y.R.inc(3059);if ((((iri.startsWith(prefix))&&(__CLR4_5_21cz1czlvicmt0y.R.iget(3060)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(3061)==0&false))) {{
                __CLR4_5_21cz1czlvicmt0y.R.inc(3062);tag = iri.substring(prefix.length());
            }
        }}
        }__CLR4_5_21cz1czlvicmt0y.R.inc(3063);return tag;
    }finally{__CLR4_5_21cz1czlvicmt0y.R.flushNeeded();}}

    /**
     * Gets the term frame.
     * 
     * @param entity
     *        the entity
     * @return the term frame
     */
    protected Frame getTermFrame(@Nonnull OWLClass entity) {try{__CLR4_5_21cz1czlvicmt0y.R.inc(3064);
        __CLR4_5_21cz1czlvicmt0y.R.inc(3065);String id = getIdentifier(entity.getIRI());
        __CLR4_5_21cz1czlvicmt0y.R.inc(3066);return getTermFrame(id);
    }finally{__CLR4_5_21cz1czlvicmt0y.R.flushNeeded();}}

    private Frame getTermFrame(@Nonnull String id) {try{__CLR4_5_21cz1czlvicmt0y.R.inc(3067);
        __CLR4_5_21cz1czlvicmt0y.R.inc(3068);Frame f = getObodoc().getTermFrame(id);
        __CLR4_5_21cz1czlvicmt0y.R.inc(3069);if ((((f == null)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(3070)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(3071)==0&false))) {{
            __CLR4_5_21cz1czlvicmt0y.R.inc(3072);f = new Frame(FrameType.TERM);
            __CLR4_5_21cz1czlvicmt0y.R.inc(3073);f.setId(id);
            __CLR4_5_21cz1czlvicmt0y.R.inc(3074);f.addClause(new Clause(OboFormatTag.TAG_ID, id));
            __CLR4_5_21cz1czlvicmt0y.R.inc(3075);add(f);
        }
        }__CLR4_5_21cz1czlvicmt0y.R.inc(3076);return f;
    }finally{__CLR4_5_21cz1czlvicmt0y.R.flushNeeded();}}

    /**
     * Gets the typedef frame.
     * 
     * @param entity
     *        the entity
     * @return the typedef frame
     */
    protected Frame getTypedefFrame(@Nonnull OWLEntity entity) {try{__CLR4_5_21cz1czlvicmt0y.R.inc(3077);
        __CLR4_5_21cz1czlvicmt0y.R.inc(3078);String id = getIdentifier(entity);
        __CLR4_5_21cz1czlvicmt0y.R.inc(3079);return getTypedefFrame(id);
    }finally{__CLR4_5_21cz1czlvicmt0y.R.flushNeeded();}}

    private Frame getTypedefFrame(@Nonnull String id) {try{__CLR4_5_21cz1czlvicmt0y.R.inc(3080);
        __CLR4_5_21cz1czlvicmt0y.R.inc(3081);Frame f = getObodoc().getTypedefFrame(id);
        __CLR4_5_21cz1czlvicmt0y.R.inc(3082);if ((((f == null)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(3083)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(3084)==0&false))) {{
            __CLR4_5_21cz1czlvicmt0y.R.inc(3085);f = new Frame(FrameType.TYPEDEF);
            __CLR4_5_21cz1czlvicmt0y.R.inc(3086);f.setId(id);
            __CLR4_5_21cz1czlvicmt0y.R.inc(3087);f.addClause(new Clause(OboFormatTag.TAG_ID, id));
            __CLR4_5_21cz1czlvicmt0y.R.inc(3088);add(f);
        }
        }__CLR4_5_21cz1czlvicmt0y.R.inc(3089);return f;
    }finally{__CLR4_5_21cz1czlvicmt0y.R.flushNeeded();}}

    /**
     * Tr.
     * 
     * @param ax
     *        the ax
     */
    @SuppressWarnings("null")
    protected void tr(@Nonnull OWLClassAssertionAxiom ax) {try{__CLR4_5_21cz1czlvicmt0y.R.inc(3090);
        __CLR4_5_21cz1czlvicmt0y.R.inc(3091);OWLObject cls = ax.getClassExpression();
        __CLR4_5_21cz1czlvicmt0y.R.inc(3092);if ((((!(cls instanceof OWLClass))&&(__CLR4_5_21cz1czlvicmt0y.R.iget(3093)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(3094)==0&false))) {{
            __CLR4_5_21cz1czlvicmt0y.R.inc(3095);return;
        }
        }__CLR4_5_21cz1czlvicmt0y.R.inc(3096);String clsIRI = ((OWLClass) cls).getIRI().toString();
        __CLR4_5_21cz1czlvicmt0y.R.inc(3097);OWLAnnotationProperty labelProperty = manager.getOWLDataFactory().getRDFSLabel();
        __CLR4_5_21cz1czlvicmt0y.R.inc(3098);if ((((IRI_CLASS_SYNONYMTYPEDEF.equals(clsIRI))&&(__CLR4_5_21cz1czlvicmt0y.R.iget(3099)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(3100)==0&false))) {{
            __CLR4_5_21cz1czlvicmt0y.R.inc(3101);Frame f = getObodoc().getHeaderFrame();
            __CLR4_5_21cz1czlvicmt0y.R.inc(3102);Clause c = new Clause(OboFormatTag.TAG_SYNONYMTYPEDEF.getTag());
            __CLR4_5_21cz1czlvicmt0y.R.inc(3103);OWLNamedIndividual indv = (OWLNamedIndividual) ax.getIndividual();
            __CLR4_5_21cz1czlvicmt0y.R.inc(3104);String indvId = getIdentifier(indv);
            // TODO: full specify this in the spec document.
            // we may want to allow full IDs for subsets in future.
            // here we would have a convention that an unprefixed
            // subsetdef/synonymtypedef
            // gets placed in a temp ID space, and only this id space is
            // stripped
            __CLR4_5_21cz1czlvicmt0y.R.inc(3105);indvId = indvId.replaceFirst(".*:", "");
            __CLR4_5_21cz1czlvicmt0y.R.inc(3106);c.addValue(indvId);
            __CLR4_5_21cz1czlvicmt0y.R.inc(3107);c.addValue(indvId);
            __CLR4_5_21cz1czlvicmt0y.R.inc(3108);String nameValue = "";
            __CLR4_5_21cz1czlvicmt0y.R.inc(3109);String scopeValue = null;
            __CLR4_5_21cz1czlvicmt0y.R.inc(3110);for (OWLAnnotation ann : getAnnotationObjects(indv, getOWLOntology(), null)) {{
                __CLR4_5_21cz1czlvicmt0y.R.inc(3111);String value = ((OWLLiteral) ann.getValue()).getLiteral();
                __CLR4_5_21cz1czlvicmt0y.R.inc(3112);if ((((ann.getProperty().equals(labelProperty))&&(__CLR4_5_21cz1czlvicmt0y.R.iget(3113)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(3114)==0&false))) {{
                    __CLR4_5_21cz1czlvicmt0y.R.inc(3115);nameValue = '"' + value + '"';
                } }else {{
                    __CLR4_5_21cz1czlvicmt0y.R.inc(3116);scopeValue = value;
                }
            }}
            }__CLR4_5_21cz1czlvicmt0y.R.inc(3117);c.addValue(nameValue);
            __CLR4_5_21cz1czlvicmt0y.R.inc(3118);if ((((scopeValue != null)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(3119)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(3120)==0&false))) {{
                __CLR4_5_21cz1czlvicmt0y.R.inc(3121);c.addValue(scopeValue);
            }
            }__CLR4_5_21cz1czlvicmt0y.R.inc(3122);f.addClause(c);
        } }else {__CLR4_5_21cz1czlvicmt0y.R.inc(3123);if ((((IRI_CLASS_SUBSETDEF.equals(clsIRI))&&(__CLR4_5_21cz1czlvicmt0y.R.iget(3124)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(3125)==0&false))) {{
            __CLR4_5_21cz1czlvicmt0y.R.inc(3126);Frame f = getObodoc().getHeaderFrame();
            __CLR4_5_21cz1czlvicmt0y.R.inc(3127);Clause c = new Clause(OboFormatTag.TAG_SUBSETDEF.getTag());
            __CLR4_5_21cz1czlvicmt0y.R.inc(3128);OWLNamedIndividual indv = (OWLNamedIndividual) ax.getIndividual();
            __CLR4_5_21cz1czlvicmt0y.R.inc(3129);String indvId = getIdentifier(indv);
            // TODO: full specify this in the spec document.
            // we may want to allow full IDs for subsets in future.
            // here we would have a convention that an unprefixed
            // subsetdef/synonymtypedef
            // gets placed in a temp ID space, and only this id space is
            // stripped
            __CLR4_5_21cz1czlvicmt0y.R.inc(3130);indvId = indvId.replaceFirst(".*:", "");
            __CLR4_5_21cz1czlvicmt0y.R.inc(3131);c.addValue(indvId);
            __CLR4_5_21cz1czlvicmt0y.R.inc(3132);String nameValue = "";
            __CLR4_5_21cz1czlvicmt0y.R.inc(3133);for (OWLAnnotation ann : getAnnotationObjects(indv, getOWLOntology(), null)) {{
                __CLR4_5_21cz1czlvicmt0y.R.inc(3134);String value = ((OWLLiteral) ann.getValue()).getLiteral();
                __CLR4_5_21cz1czlvicmt0y.R.inc(3135);if ((((ann.getProperty().equals(labelProperty))&&(__CLR4_5_21cz1czlvicmt0y.R.iget(3136)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(3137)==0&false))) {{
                    __CLR4_5_21cz1czlvicmt0y.R.inc(3138);nameValue = '"' + value + '"';
                }
            }}
            }__CLR4_5_21cz1czlvicmt0y.R.inc(3139);c.addValue(nameValue);
            __CLR4_5_21cz1czlvicmt0y.R.inc(3140);f.addClause(c);
        } }else {{
            // TODO: individual
        }
    }}}finally{__CLR4_5_21cz1czlvicmt0y.R.flushNeeded();}}

    /**
     * Tr.
     * 
     * @param ax
     *        the ax
     */
    @SuppressWarnings("null")
    protected void tr(@Nonnull OWLSubClassOfAxiom ax) {try{__CLR4_5_21cz1czlvicmt0y.R.inc(3141);
        __CLR4_5_21cz1czlvicmt0y.R.inc(3142);OWLClassExpression sub = ax.getSubClass();
        __CLR4_5_21cz1czlvicmt0y.R.inc(3143);OWLClassExpression sup = ax.getSuperClass();
        __CLR4_5_21cz1czlvicmt0y.R.inc(3144);Set<QualifierValue> qvs = new HashSet<>();
        __CLR4_5_21cz1czlvicmt0y.R.inc(3145);if ((((sub.isOWLNothing() || sub.isTopEntity() || sup.isTopEntity() || sup.isOWLNothing())&&(__CLR4_5_21cz1czlvicmt0y.R.iget(3146)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(3147)==0&false))) {{
            __CLR4_5_21cz1czlvicmt0y.R.inc(3148);error(TOP_BOTTOM_NONTRANSLATEABLE, ax, false);
            __CLR4_5_21cz1czlvicmt0y.R.inc(3149);return;
        }
        // 5.2.2
        }__CLR4_5_21cz1czlvicmt0y.R.inc(3150);if ((((sub instanceof OWLObjectIntersectionOf)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(3151)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(3152)==0&false))) {{
            __CLR4_5_21cz1czlvicmt0y.R.inc(3153);Set<OWLClassExpression> xs = ((OWLObjectIntersectionOf) sub).getOperands();
            // obo-format is limited to very restricted GCIs - the LHS of the
            // axiom
            // must correspond to ObjectIntersectionOf(cls
            // ObjectSomeValuesFrom(p filler))
            __CLR4_5_21cz1czlvicmt0y.R.inc(3154);if ((((xs.size() == 2)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(3155)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(3156)==0&false))) {{
                __CLR4_5_21cz1czlvicmt0y.R.inc(3157);OWLClass c = null;
                __CLR4_5_21cz1czlvicmt0y.R.inc(3158);OWLObjectSomeValuesFrom r = null;
                __CLR4_5_21cz1czlvicmt0y.R.inc(3159);OWLObjectProperty p = null;
                __CLR4_5_21cz1czlvicmt0y.R.inc(3160);OWLClass filler = null;
                __CLR4_5_21cz1czlvicmt0y.R.inc(3161);for (OWLClassExpression x : xs) {{
                    __CLR4_5_21cz1czlvicmt0y.R.inc(3162);if ((((x instanceof OWLClass)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(3163)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(3164)==0&false))) {{
                        __CLR4_5_21cz1czlvicmt0y.R.inc(3165);c = (OWLClass) x;
                    }
                    }__CLR4_5_21cz1czlvicmt0y.R.inc(3166);if ((((x instanceof OWLObjectSomeValuesFrom)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(3167)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(3168)==0&false))) {{
                        __CLR4_5_21cz1czlvicmt0y.R.inc(3169);r = (OWLObjectSomeValuesFrom) x;
                        __CLR4_5_21cz1czlvicmt0y.R.inc(3170);if ((((r.getProperty() instanceof OWLObjectProperty && r.getFiller() instanceof OWLClass)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(3171)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(3172)==0&false))) {{
                            __CLR4_5_21cz1czlvicmt0y.R.inc(3173);p = (OWLObjectProperty) r.getProperty();
                            __CLR4_5_21cz1czlvicmt0y.R.inc(3174);filler = (OWLClass) r.getFiller();
                        }
                    }}
                }}
                }__CLR4_5_21cz1czlvicmt0y.R.inc(3175);if ((((c != null && p != null && filler != null)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(3176)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(3177)==0&false))) {{
                    __CLR4_5_21cz1czlvicmt0y.R.inc(3178);sub = c;
                    __CLR4_5_21cz1czlvicmt0y.R.inc(3179);qvs.add(new QualifierValue("gci_relation", getIdentifier(p)));
                    __CLR4_5_21cz1czlvicmt0y.R.inc(3180);qvs.add(new QualifierValue("gci_filler", getIdentifier(filler)));
                }
            }}
        }}
        }__CLR4_5_21cz1czlvicmt0y.R.inc(3181);if ((((sub instanceof OWLClass)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(3182)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(3183)==0&false))) {{
            __CLR4_5_21cz1czlvicmt0y.R.inc(3184);Frame f = getTermFrame((OWLClass) sub);
            __CLR4_5_21cz1czlvicmt0y.R.inc(3185);if ((((sup instanceof OWLClass)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(3186)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(3187)==0&false))) {{
                __CLR4_5_21cz1czlvicmt0y.R.inc(3188);Clause c = new Clause(OboFormatTag.TAG_IS_A.getTag());
                __CLR4_5_21cz1czlvicmt0y.R.inc(3189);c.setValue(getIdentifier(sup));
                __CLR4_5_21cz1czlvicmt0y.R.inc(3190);c.setQualifierValues(qvs);
                __CLR4_5_21cz1czlvicmt0y.R.inc(3191);f.addClause(c);
                __CLR4_5_21cz1czlvicmt0y.R.inc(3192);addQualifiers(c, ax.getAnnotations());
            } }else {__CLR4_5_21cz1czlvicmt0y.R.inc(3193);if ((((sup instanceof OWLObjectCardinalityRestriction)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(3194)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(3195)==0&false))) {{
                // OWLObjectExactCardinality
                // OWLObjectMinCardinality
                // OWLObjectMaxCardinality
                __CLR4_5_21cz1czlvicmt0y.R.inc(3196);OWLObjectCardinalityRestriction cardinality = (OWLObjectCardinalityRestriction) sup;
                __CLR4_5_21cz1czlvicmt0y.R.inc(3197);OWLClassExpression filler = cardinality.getFiller();
                __CLR4_5_21cz1czlvicmt0y.R.inc(3198);if ((((filler.isBottomEntity() || filler.isTopEntity())&&(__CLR4_5_21cz1czlvicmt0y.R.iget(3199)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(3200)==0&false))) {{
                    __CLR4_5_21cz1czlvicmt0y.R.inc(3201);error(TOP_BOTTOM_NONTRANSLATEABLE, ax, false);
                    __CLR4_5_21cz1czlvicmt0y.R.inc(3202);return;
                }
                }__CLR4_5_21cz1czlvicmt0y.R.inc(3203);String fillerId = getIdentifier(filler);
                __CLR4_5_21cz1czlvicmt0y.R.inc(3204);if ((((fillerId == null)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(3205)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(3206)==0&false))) {{
                    __CLR4_5_21cz1czlvicmt0y.R.inc(3207);error(ax, true);
                    __CLR4_5_21cz1czlvicmt0y.R.inc(3208);return;
                }
                }__CLR4_5_21cz1czlvicmt0y.R.inc(3209);f.addClause(createRelationshipClauseWithCardinality(cardinality, fillerId, qvs, ax));
            } }else {__CLR4_5_21cz1czlvicmt0y.R.inc(3210);if ((((sup instanceof OWLQuantifiedObjectRestriction)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(3211)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(3212)==0&false))) {{
                // OWLObjectSomeValuesFrom
                // OWLObjectAllValuesFrom
                __CLR4_5_21cz1czlvicmt0y.R.inc(3213);OWLQuantifiedObjectRestriction r = (OWLQuantifiedObjectRestriction) sup;
                __CLR4_5_21cz1czlvicmt0y.R.inc(3214);OWLClassExpression filler = r.getFiller();
                __CLR4_5_21cz1czlvicmt0y.R.inc(3215);if ((((filler.isBottomEntity() || filler.isTopEntity())&&(__CLR4_5_21cz1czlvicmt0y.R.iget(3216)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(3217)==0&false))) {{
                    __CLR4_5_21cz1czlvicmt0y.R.inc(3218);error(TOP_BOTTOM_NONTRANSLATEABLE, ax, false);
                    __CLR4_5_21cz1czlvicmt0y.R.inc(3219);return;
                }
                }__CLR4_5_21cz1czlvicmt0y.R.inc(3220);String fillerId = getIdentifier(filler);
                __CLR4_5_21cz1czlvicmt0y.R.inc(3221);if ((((fillerId == null)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(3222)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(3223)==0&false))) {{
                    __CLR4_5_21cz1czlvicmt0y.R.inc(3224);error(ax, true);
                    __CLR4_5_21cz1czlvicmt0y.R.inc(3225);return;
                }
                }__CLR4_5_21cz1czlvicmt0y.R.inc(3226);f.addClause(createRelationshipClauseWithRestrictions(r, fillerId, qvs, ax));
            } }else {__CLR4_5_21cz1czlvicmt0y.R.inc(3227);if ((((sup instanceof OWLObjectIntersectionOf)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(3228)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(3229)==0&false))) {{
                __CLR4_5_21cz1czlvicmt0y.R.inc(3230);OWLObjectIntersectionOf i = (OWLObjectIntersectionOf) sup;
                __CLR4_5_21cz1czlvicmt0y.R.inc(3231);List<Clause> clauses = new ArrayList<>();
                __CLR4_5_21cz1czlvicmt0y.R.inc(3232);for (OWLClassExpression operand : i.getOperands()) {{
                    __CLR4_5_21cz1czlvicmt0y.R.inc(3233);if ((((operand instanceof OWLObjectCardinalityRestriction)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(3234)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(3235)==0&false))) {{
                        __CLR4_5_21cz1czlvicmt0y.R.inc(3236);OWLObjectCardinalityRestriction restriction = (OWLObjectCardinalityRestriction) operand;
                        __CLR4_5_21cz1czlvicmt0y.R.inc(3237);OWLClassExpression filler = restriction.getFiller();
                        __CLR4_5_21cz1czlvicmt0y.R.inc(3238);if ((((filler.isBottomEntity() || filler.isTopEntity())&&(__CLR4_5_21cz1czlvicmt0y.R.iget(3239)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(3240)==0&false))) {{
                            __CLR4_5_21cz1czlvicmt0y.R.inc(3241);error(TOP_BOTTOM_NONTRANSLATEABLE, ax, false);
                            __CLR4_5_21cz1czlvicmt0y.R.inc(3242);return;
                        }
                        }__CLR4_5_21cz1czlvicmt0y.R.inc(3243);String fillerId = getIdentifier(filler);
                        __CLR4_5_21cz1czlvicmt0y.R.inc(3244);if ((((fillerId == null)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(3245)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(3246)==0&false))) {{
                            __CLR4_5_21cz1czlvicmt0y.R.inc(3247);error(ax, true);
                            __CLR4_5_21cz1czlvicmt0y.R.inc(3248);return;
                        }
                        }__CLR4_5_21cz1czlvicmt0y.R.inc(3249);clauses.add(createRelationshipClauseWithCardinality(restriction, fillerId, new HashSet<>(qvs),
                            ax));
                    } }else {__CLR4_5_21cz1czlvicmt0y.R.inc(3250);if ((((operand instanceof OWLQuantifiedObjectRestriction)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(3251)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(3252)==0&false))) {{
                        __CLR4_5_21cz1czlvicmt0y.R.inc(3253);OWLQuantifiedObjectRestriction restriction = (OWLQuantifiedObjectRestriction) operand;
                        __CLR4_5_21cz1czlvicmt0y.R.inc(3254);OWLClassExpression filler = restriction.getFiller();
                        __CLR4_5_21cz1czlvicmt0y.R.inc(3255);if ((((filler.isBottomEntity() || filler.isTopEntity())&&(__CLR4_5_21cz1czlvicmt0y.R.iget(3256)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(3257)==0&false))) {{
                            __CLR4_5_21cz1czlvicmt0y.R.inc(3258);error(TOP_BOTTOM_NONTRANSLATEABLE, ax, false);
                            __CLR4_5_21cz1czlvicmt0y.R.inc(3259);return;
                        }
                        }__CLR4_5_21cz1czlvicmt0y.R.inc(3260);String fillerId = getIdentifier(filler);
                        __CLR4_5_21cz1czlvicmt0y.R.inc(3261);if ((((fillerId == null)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(3262)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(3263)==0&false))) {{
                            __CLR4_5_21cz1czlvicmt0y.R.inc(3264);error(ax, true);
                            __CLR4_5_21cz1czlvicmt0y.R.inc(3265);return;
                        }
                        }__CLR4_5_21cz1czlvicmt0y.R.inc(3266);clauses.add(createRelationshipClauseWithRestrictions(restriction, fillerId, new HashSet<>(qvs),
                            ax));
                    } }else {{
                        __CLR4_5_21cz1czlvicmt0y.R.inc(3267);error(ax, true);
                        __CLR4_5_21cz1czlvicmt0y.R.inc(3268);return;
                    }
                }}}
                }__CLR4_5_21cz1czlvicmt0y.R.inc(3269);if ((((clauses.isEmpty())&&(__CLR4_5_21cz1czlvicmt0y.R.iget(3270)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(3271)==0&false))) {{
                    __CLR4_5_21cz1czlvicmt0y.R.inc(3272);error(ax, true);
                    __CLR4_5_21cz1czlvicmt0y.R.inc(3273);return;
                }
                }__CLR4_5_21cz1czlvicmt0y.R.inc(3274);clauses = normalizeRelationshipClauses(clauses);
                __CLR4_5_21cz1czlvicmt0y.R.inc(3275);for (Clause clause : clauses) {{
                    __CLR4_5_21cz1czlvicmt0y.R.inc(3276);f.addClause(clause);
                }
            }} }else {{
                __CLR4_5_21cz1czlvicmt0y.R.inc(3277);error(ax, true);
                __CLR4_5_21cz1czlvicmt0y.R.inc(3278);return;
            }
        }}}}} }else {{
            __CLR4_5_21cz1czlvicmt0y.R.inc(3279);error(ax, true);
            __CLR4_5_21cz1czlvicmt0y.R.inc(3280);return;
        }
    }}finally{__CLR4_5_21cz1czlvicmt0y.R.flushNeeded();}}

    /**
     * Creates the relationship clause with restrictions.
     * 
     * @param r
     *        the r
     * @param fillerId
     *        the filler id
     * @param qvs
     *        the qvs
     * @param ax
     *        the ax
     * @return the clause
     */
    @Nonnull
    protected Clause createRelationshipClauseWithRestrictions(@Nonnull OWLQuantifiedObjectRestriction r,
        String fillerId, @Nonnull Set<QualifierValue> qvs, @Nonnull OWLSubClassOfAxiom ax) {try{__CLR4_5_21cz1czlvicmt0y.R.inc(3281);
        __CLR4_5_21cz1czlvicmt0y.R.inc(3282);Clause c = new Clause(OboFormatTag.TAG_RELATIONSHIP.getTag());
        __CLR4_5_21cz1czlvicmt0y.R.inc(3283);c.addValue(getIdentifier(r.getProperty()));
        __CLR4_5_21cz1czlvicmt0y.R.inc(3284);c.addValue(fillerId);
        __CLR4_5_21cz1czlvicmt0y.R.inc(3285);c.setQualifierValues(qvs);
        __CLR4_5_21cz1czlvicmt0y.R.inc(3286);addQualifiers(c, ax.getAnnotations());
        __CLR4_5_21cz1czlvicmt0y.R.inc(3287);return c;
    }finally{__CLR4_5_21cz1czlvicmt0y.R.flushNeeded();}}

    /**
     * Creates the relationship clause with cardinality.
     * 
     * @param restriction
     *        the restriction
     * @param fillerId
     *        the filler id
     * @param qvs
     *        the qvs
     * @param ax
     *        the ax
     * @return the clause
     */
    @Nonnull
    protected Clause createRelationshipClauseWithCardinality(@Nonnull OWLObjectCardinalityRestriction restriction,
        String fillerId, @Nonnull Set<QualifierValue> qvs, @Nonnull OWLSubClassOfAxiom ax) {try{__CLR4_5_21cz1czlvicmt0y.R.inc(3288);
        __CLR4_5_21cz1czlvicmt0y.R.inc(3289);Clause c = new Clause(OboFormatTag.TAG_RELATIONSHIP.getTag());
        __CLR4_5_21cz1czlvicmt0y.R.inc(3290);c.addValue(getIdentifier(restriction.getProperty()));
        __CLR4_5_21cz1czlvicmt0y.R.inc(3291);c.addValue(fillerId);
        __CLR4_5_21cz1czlvicmt0y.R.inc(3292);c.setQualifierValues(qvs);
        __CLR4_5_21cz1czlvicmt0y.R.inc(3293);String q = "cardinality";
        __CLR4_5_21cz1czlvicmt0y.R.inc(3294);if ((((restriction instanceof OWLObjectMinCardinality)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(3295)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(3296)==0&false))) {{
            __CLR4_5_21cz1czlvicmt0y.R.inc(3297);q = "minCardinality";
        } }else {__CLR4_5_21cz1czlvicmt0y.R.inc(3298);if ((((restriction instanceof OWLObjectMaxCardinality)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(3299)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(3300)==0&false))) {{
            __CLR4_5_21cz1czlvicmt0y.R.inc(3301);q = "maxCardinality";
        }
        }}__CLR4_5_21cz1czlvicmt0y.R.inc(3302);c.addQualifierValue(new QualifierValue(q, Integer.toString(restriction.getCardinality())));
        __CLR4_5_21cz1czlvicmt0y.R.inc(3303);addQualifiers(c, ax.getAnnotations());
        __CLR4_5_21cz1czlvicmt0y.R.inc(3304);return c;
    }finally{__CLR4_5_21cz1czlvicmt0y.R.flushNeeded();}}

    /**
     * Join clauses and its {@link QualifierValue} which have the same
     * relationship type and target. Try to resolve conflicts for multiple
     * statements. E.g., min=2 and min=3 is resolved to min=2, or max=2 and
     * max=4 is resolved to max=4. It will not merge conflicting exact
     * cardinality statements. TODO How to merge "all_some", and "all_only"?
     * 
     * @param clauses
     *        the clauses
     * @return normalized list of {@link Clause}
     */
    @Nonnull
    public static List<Clause> normalizeRelationshipClauses(@Nonnull List<Clause> clauses) {try{__CLR4_5_21cz1czlvicmt0y.R.inc(3305);
        __CLR4_5_21cz1czlvicmt0y.R.inc(3306);List<Clause> normalized = new ArrayList<>();
        __CLR4_5_21cz1czlvicmt0y.R.inc(3307);while ((((!clauses.isEmpty())&&(__CLR4_5_21cz1czlvicmt0y.R.iget(3308)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(3309)==0&false))) {{
            __CLR4_5_21cz1czlvicmt0y.R.inc(3310);Clause target = clauses.remove(0);
            assert (((target != null)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(3311)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(3312)==0&false));
            __CLR4_5_21cz1czlvicmt0y.R.inc(3313);List<Clause> similar = findSimilarClauses(clauses, target);
            __CLR4_5_21cz1czlvicmt0y.R.inc(3314);normalized.add(target);
            __CLR4_5_21cz1czlvicmt0y.R.inc(3315);mergeSimilarIntoTarget(target, similar);
        }
        }__CLR4_5_21cz1czlvicmt0y.R.inc(3316);return normalized;
    }finally{__CLR4_5_21cz1czlvicmt0y.R.flushNeeded();}}

    /**
     * Find similar clauses.
     * 
     * @param clauses
     *        the clauses
     * @param target
     *        the target
     * @return the list
     */
    @SuppressWarnings("null")
    @Nonnull
    static List<Clause> findSimilarClauses(@Nonnull List<Clause> clauses, @Nonnull Clause target) {try{__CLR4_5_21cz1czlvicmt0y.R.inc(3317);
        __CLR4_5_21cz1czlvicmt0y.R.inc(3318);String targetTag = target.getTag();
        __CLR4_5_21cz1czlvicmt0y.R.inc(3319);Object targetValue = target.getValue();
        __CLR4_5_21cz1czlvicmt0y.R.inc(3320);Object targetValue2 = target.getValue2();
        __CLR4_5_21cz1czlvicmt0y.R.inc(3321);List<Clause> similar = new ArrayList<>();
        __CLR4_5_21cz1czlvicmt0y.R.inc(3322);Iterator<Clause> iterator = clauses.iterator();
        __CLR4_5_21cz1czlvicmt0y.R.inc(3323);while ((((iterator.hasNext())&&(__CLR4_5_21cz1czlvicmt0y.R.iget(3324)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(3325)==0&false))) {{
            __CLR4_5_21cz1czlvicmt0y.R.inc(3326);Clause current = iterator.next();
            __CLR4_5_21cz1czlvicmt0y.R.inc(3327);Object currentValue = current.getValue();
            __CLR4_5_21cz1czlvicmt0y.R.inc(3328);Object currentValue2 = current.getValue2();
            __CLR4_5_21cz1czlvicmt0y.R.inc(3329);if ((((targetTag.equals(current.getTag()) && targetValue.equals(currentValue))&&(__CLR4_5_21cz1czlvicmt0y.R.iget(3330)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(3331)==0&false))) {{
                __CLR4_5_21cz1czlvicmt0y.R.inc(3332);if ((((targetValue2 == null)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(3333)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(3334)==0&false))) {{
                    __CLR4_5_21cz1czlvicmt0y.R.inc(3335);if ((((currentValue2 == null)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(3336)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(3337)==0&false))) {{
                        __CLR4_5_21cz1czlvicmt0y.R.inc(3338);similar.add(current);
                        __CLR4_5_21cz1czlvicmt0y.R.inc(3339);iterator.remove();
                    }
                }} }else {__CLR4_5_21cz1czlvicmt0y.R.inc(3340);if ((((targetValue2.equals(currentValue2))&&(__CLR4_5_21cz1czlvicmt0y.R.iget(3341)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(3342)==0&false))) {{
                    __CLR4_5_21cz1czlvicmt0y.R.inc(3343);similar.add(current);
                    __CLR4_5_21cz1czlvicmt0y.R.inc(3344);iterator.remove();
                }
            }}}
        }}
        }__CLR4_5_21cz1czlvicmt0y.R.inc(3345);return similar;
    }finally{__CLR4_5_21cz1czlvicmt0y.R.flushNeeded();}}

    /**
     * Merge similar into target.
     * 
     * @param target
     *        the target
     * @param similar
     *        the similar
     */
    static void mergeSimilarIntoTarget(@Nonnull Clause target, @Nonnull List<Clause> similar) {try{__CLR4_5_21cz1czlvicmt0y.R.inc(3346);
        __CLR4_5_21cz1czlvicmt0y.R.inc(3347);if ((((similar.isEmpty())&&(__CLR4_5_21cz1czlvicmt0y.R.iget(3348)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(3349)==0&false))) {{
            __CLR4_5_21cz1czlvicmt0y.R.inc(3350);return;
        }
        }__CLR4_5_21cz1czlvicmt0y.R.inc(3351);Collection<QualifierValue> targetQVs = target.getQualifierValues();
        __CLR4_5_21cz1czlvicmt0y.R.inc(3352);for (Clause current : similar) {{
            __CLR4_5_21cz1czlvicmt0y.R.inc(3353);Collection<QualifierValue> newQVs = current.getQualifierValues();
            __CLR4_5_21cz1czlvicmt0y.R.inc(3354);for (QualifierValue newQV : newQVs) {{
                __CLR4_5_21cz1czlvicmt0y.R.inc(3355);String newQualifier = newQV.getQualifier();
                // if min or max cardinality check for possible merges
                __CLR4_5_21cz1czlvicmt0y.R.inc(3356);if (((("minCardinality".equals(newQualifier) || "maxCardinality".equals(newQualifier))&&(__CLR4_5_21cz1czlvicmt0y.R.iget(3357)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(3358)==0&false))) {{
                    __CLR4_5_21cz1czlvicmt0y.R.inc(3359);QualifierValue match = findMatchingQualifierValue(newQV, targetQVs);
                    __CLR4_5_21cz1czlvicmt0y.R.inc(3360);if ((((match != null)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(3361)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(3362)==0&false))) {{
                        __CLR4_5_21cz1czlvicmt0y.R.inc(3363);mergeQualifierValues(match, newQV);
                    } }else {{
                        __CLR4_5_21cz1czlvicmt0y.R.inc(3364);target.addQualifierValue(newQV);
                    }
                }} }else {{
                    __CLR4_5_21cz1czlvicmt0y.R.inc(3365);target.addQualifierValue(newQV);
                }
            }}
        }}
    }}finally{__CLR4_5_21cz1czlvicmt0y.R.flushNeeded();}}

    /**
     * Find matching qualifier value.
     * 
     * @param query
     *        the query
     * @param list
     *        the list
     * @return the qualifier value
     */
    @Nullable
    static QualifierValue findMatchingQualifierValue(@Nonnull QualifierValue query,
        @Nonnull Collection<QualifierValue> list) {try{__CLR4_5_21cz1czlvicmt0y.R.inc(3366);
        __CLR4_5_21cz1czlvicmt0y.R.inc(3367);String queryQualifier = query.getQualifier();
        __CLR4_5_21cz1czlvicmt0y.R.inc(3368);for (QualifierValue qv : list) {{
            __CLR4_5_21cz1czlvicmt0y.R.inc(3369);if ((((queryQualifier.equals(qv.getQualifier()))&&(__CLR4_5_21cz1czlvicmt0y.R.iget(3370)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(3371)==0&false))) {{
                __CLR4_5_21cz1czlvicmt0y.R.inc(3372);return qv;
            }
        }}
        }__CLR4_5_21cz1czlvicmt0y.R.inc(3373);return null;
    }finally{__CLR4_5_21cz1czlvicmt0y.R.flushNeeded();}}

    /**
     * Merge qualifier values.
     * 
     * @param target
     *        the target
     * @param newQV
     *        the new qv
     */
    static void mergeQualifierValues(@Nonnull QualifierValue target, @Nonnull QualifierValue newQV) {try{__CLR4_5_21cz1czlvicmt0y.R.inc(3374);
        // do nothing, if they are equal
        __CLR4_5_21cz1czlvicmt0y.R.inc(3375);if ((((!target.getValue().equals(newQV.getValue()))&&(__CLR4_5_21cz1czlvicmt0y.R.iget(3376)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(3377)==0&false))) {{
            __CLR4_5_21cz1czlvicmt0y.R.inc(3378);if (((("minCardinality".equals(target.getQualifier()))&&(__CLR4_5_21cz1czlvicmt0y.R.iget(3379)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(3380)==0&false))) {{
                // try to merge, parse as integers
                __CLR4_5_21cz1czlvicmt0y.R.inc(3381);int currentValue = Integer.parseInt(target.getValue().toString());
                __CLR4_5_21cz1czlvicmt0y.R.inc(3382);int newValue = Integer.parseInt(newQV.getValue().toString());
                __CLR4_5_21cz1czlvicmt0y.R.inc(3383);int mergedValue = Math.min(currentValue, newValue);
                __CLR4_5_21cz1czlvicmt0y.R.inc(3384);target.setValue(Integer.toString(mergedValue));
            } }else {__CLR4_5_21cz1czlvicmt0y.R.inc(3385);if (((("maxCardinality".equals(target.getQualifier()))&&(__CLR4_5_21cz1czlvicmt0y.R.iget(3386)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(3387)==0&false))) {{
                // try to merge, parse as integers
                __CLR4_5_21cz1czlvicmt0y.R.inc(3388);int currentValue = Integer.parseInt(target.getValue().toString());
                __CLR4_5_21cz1czlvicmt0y.R.inc(3389);int newValue = Integer.parseInt(newQV.getValue().toString());
                __CLR4_5_21cz1czlvicmt0y.R.inc(3390);int mergedValue = Math.max(currentValue, newValue);
                __CLR4_5_21cz1czlvicmt0y.R.inc(3391);target.setValue(Integer.toString(mergedValue));
            }
        }}}
    }}finally{__CLR4_5_21cz1czlvicmt0y.R.flushNeeded();}}

    protected void error(String message, OWLAxiom ax, boolean shouldLogComplaint) {try{__CLR4_5_21cz1czlvicmt0y.R.inc(3392);
        __CLR4_5_21cz1czlvicmt0y.R.inc(3393);untranslatableAxioms.add(ax);
        __CLR4_5_21cz1czlvicmt0y.R.inc(3394);error(message + ax, shouldLogComplaint);
    }finally{__CLR4_5_21cz1czlvicmt0y.R.flushNeeded();}}

    protected void error(OWLAxiom ax, boolean shouldLogComplaint) {try{__CLR4_5_21cz1czlvicmt0y.R.inc(3395);
        __CLR4_5_21cz1czlvicmt0y.R.inc(3396);untranslatableAxioms.add(ax);
        __CLR4_5_21cz1czlvicmt0y.R.inc(3397);error("the axiom is not translated : " + ax, shouldLogComplaint);
    }finally{__CLR4_5_21cz1czlvicmt0y.R.flushNeeded();}}

    protected void error(String message, boolean shouldLogComplaint) {try{__CLR4_5_21cz1czlvicmt0y.R.inc(3398);
        __CLR4_5_21cz1czlvicmt0y.R.inc(3399);if ((((strictConversion)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(3400)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(3401)==0&false))) {{
            __CLR4_5_21cz1czlvicmt0y.R.inc(3402);throw new OWLRuntimeException("The conversion is halted: " + message);
        } }else {{
            __CLR4_5_21cz1czlvicmt0y.R.inc(3403);if ((((!muteUntranslatableAxioms && shouldLogComplaint)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(3404)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(3405)==0&false))) {{
                __CLR4_5_21cz1czlvicmt0y.R.inc(3406);LOG.error("MASKING ERROR \u00ab{}\u00bb", message, new Exception());
            }
        }}
    }}finally{__CLR4_5_21cz1czlvicmt0y.R.flushNeeded();}}

    protected void warn(String message) {try{__CLR4_5_21cz1czlvicmt0y.R.inc(3407);
        __CLR4_5_21cz1czlvicmt0y.R.inc(3408);if ((((strictConversion)&&(__CLR4_5_21cz1czlvicmt0y.R.iget(3409)!=0|true))||(__CLR4_5_21cz1czlvicmt0y.R.iget(3410)==0&false))) {{
            __CLR4_5_21cz1czlvicmt0y.R.inc(3411);throw new OWLRuntimeException("The conversion is halted: " + message);
        } }else {{
            __CLR4_5_21cz1czlvicmt0y.R.inc(3412);LOG.warn("MASKING ERROR \u00ab{}\u00bb", message);
        }
    }}finally{__CLR4_5_21cz1czlvicmt0y.R.flushNeeded();}}
}
