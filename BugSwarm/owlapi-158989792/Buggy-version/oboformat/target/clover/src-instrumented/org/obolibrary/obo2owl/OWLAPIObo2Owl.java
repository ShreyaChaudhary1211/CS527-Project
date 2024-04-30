/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.obolibrary.obo2owl;

import static org.obolibrary.obo2owl.Obo2OWLConstants.DEFAULT_IRI_PREFIX;
import static org.semanticweb.owlapi.util.OWLAPIPreconditions.verifyNotNull;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.util.*;
import java.util.concurrent.ExecutionException;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.obolibrary.obo2owl.Obo2OWLConstants.Obo2OWLVocabulary;
import org.obolibrary.obo2owl.OwlStringTools.OwlStringException;
import org.obolibrary.oboformat.model.Clause;
import org.obolibrary.oboformat.model.Frame;
import org.obolibrary.oboformat.model.OBODoc;
import org.obolibrary.oboformat.model.QualifierValue;
import org.obolibrary.oboformat.model.Xref;
import org.obolibrary.oboformat.parser.OBOFormatConstants;
import org.obolibrary.oboformat.parser.OBOFormatConstants.OboFormatTag;
import org.obolibrary.oboformat.parser.OBOFormatException;
import org.obolibrary.oboformat.parser.OBOFormatParser;
import org.obolibrary.oboformat.parser.OBOFormatParserException;
import org.semanticweb.owlapi.formats.RDFXMLDocumentFormat;
import org.semanticweb.owlapi.io.OWLParserException;
import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.util.CollectionFactory;
import org.semanticweb.owlapi.vocab.Namespaces;
import org.semanticweb.owlapi.vocab.OWL2Datatype;
import org.semanticweb.owlapi.vocab.OWLRDFVocabulary;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.base.Optional;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.collect.Sets;
import com.google.common.util.concurrent.UncheckedExecutionException;

/** The Class OWLAPIObo2Owl. */
public class OWLAPIObo2Owl {public static class __CLR4_5_2l4l4lvicmsy8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u006f\u0062\u006f\u0066\u006f\u0072\u006d\u0061\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237308750L,8589935092L,1763,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** The log. */
    private static final Logger LOG = LoggerFactory.getLogger(OWLAPIObo2Owl.class);
    /** The Constant IRI_PROP_isReversiblePropertyChain. */
    public static final String IRI_PROP_ISREVERSIBLEPROPERTYCHAIN = DEFAULT_IRI_PREFIX
        + "IAO_isReversiblePropertyChain";
    /** The default id space. */
    @Nonnull protected String defaultIDSpace = "";
    /** The manager. */
    protected OWLOntologyManager manager;
    /** The owl ontology. */
    protected OWLOntology owlOntology;
    /** The fac. */
    protected OWLDataFactory fac;
    /** The obodoc. */
    protected OBODoc obodoc;
    /** The id space map. */
    @Nonnull protected final Map<String, String> idSpaceMap;
    /** The annotation property map. */
    @Nonnull public static final Map<String, IRI> ANNOTATIONPROPERTYMAP = initAnnotationPropertyMap();
    /** The ap to declare. */
    @Nonnull protected final Set<OWLAnnotationProperty> apToDeclare;
    /** The cls to declar. */
    @Nonnull protected final Map<String, OWLClass> clsToDeclare;
    /** The typedef to annotation property. */
    @Nonnull protected final Map<String, OWLAnnotationProperty> typedefToAnnotationProperty;
    private static final Set<String> SKIPPED_QUALIFIERS = Sets.newHashSet("gci_relation", "gci_filler", "cardinality",
        "minCardinality", "maxCardinality", "all_some", "all_only");
    /** Cache for the id to IRI conversion. */
    private LoadingCache<String, IRI> idToIRICache = CacheBuilder.newBuilder().maximumSize(1024).build(
        new CacheLoader<String, IRI>() {

            @Override
            public IRI load(String key) {try{__CLR4_5_2l4l4lvicmsy8.R.inc(760);
                __CLR4_5_2l4l4lvicmsy8.R.inc(761);return oboIdToIRI_load(key);
            }finally{__CLR4_5_2l4l4lvicmsy8.R.flushNeeded();}}
        });

    /**
     * Instantiates a new oWLAPI obo2 owl.
     * 
     * @param manager
     *        the manager
     */
    public OWLAPIObo2Owl(OWLOntologyManager manager) {try{__CLR4_5_2l4l4lvicmsy8.R.inc(762);
        __CLR4_5_2l4l4lvicmsy8.R.inc(763);idSpaceMap = new HashMap<>();
        __CLR4_5_2l4l4lvicmsy8.R.inc(764);apToDeclare = new HashSet<>();
        __CLR4_5_2l4l4lvicmsy8.R.inc(765);clsToDeclare = new HashMap<>();
        __CLR4_5_2l4l4lvicmsy8.R.inc(766);typedefToAnnotationProperty = new HashMap<>();
        __CLR4_5_2l4l4lvicmsy8.R.inc(767);init(manager);
    }finally{__CLR4_5_2l4l4lvicmsy8.R.flushNeeded();}}

    /**
     * Init
     * 
     * @param m
     *        the manager
     */
    protected void init(OWLOntologyManager m) {try{__CLR4_5_2l4l4lvicmsy8.R.inc(768);
        // use the given manager and its factory
        __CLR4_5_2l4l4lvicmsy8.R.inc(769);manager = m;
        __CLR4_5_2l4l4lvicmsy8.R.inc(770);fac = manager.getOWLDataFactory();
        // clear all internal maps.
        __CLR4_5_2l4l4lvicmsy8.R.inc(771);idSpaceMap.clear();
        __CLR4_5_2l4l4lvicmsy8.R.inc(772);apToDeclare.clear();
        __CLR4_5_2l4l4lvicmsy8.R.inc(773);clsToDeclare.clear();
        __CLR4_5_2l4l4lvicmsy8.R.inc(774);typedefToAnnotationProperty.clear();
    }finally{__CLR4_5_2l4l4lvicmsy8.R.flushNeeded();}}

    /**
     * Static convenience method which: (1) creates an Obo2Owl bridge object (2)
     * parses an obo file from a URL (3) converts that to an OWL ontology (4)
     * saves the OWL ontology as RDF/XML.
     * 
     * @param iri
     *        the iri
     * @param outFile
     *        the out file
     * @param manager
     *        manager to use
     * @throws IOException
     *         Signals that an I/O exception has occurred.
     * @throws OWLOntologyCreationException
     *         the oWL ontology creation exception
     * @throws OWLOntologyStorageException
     *         the oWL ontology storage exception
     * @throws OBOFormatParserException
     *         the oBO format parser exception
     */
    public static void convertURL(@Nonnull String iri, @Nonnull String outFile, @Nonnull OWLOntologyManager manager)
        throws IOException, OWLOntologyCreationException, OWLOntologyStorageException {try{__CLR4_5_2l4l4lvicmsy8.R.inc(775);
        __CLR4_5_2l4l4lvicmsy8.R.inc(776);OWLAPIObo2Owl bridge = new OWLAPIObo2Owl(manager);
        __CLR4_5_2l4l4lvicmsy8.R.inc(777);OBOFormatParser p = new OBOFormatParser();
        __CLR4_5_2l4l4lvicmsy8.R.inc(778);OBODoc obodoc = p.parse(new URL(iri));
        __CLR4_5_2l4l4lvicmsy8.R.inc(779);OWLOntology ontology = bridge.convert(obodoc);
        __CLR4_5_2l4l4lvicmsy8.R.inc(780);IRI outputStream = IRI.create(outFile);
        __CLR4_5_2l4l4lvicmsy8.R.inc(781);OWLDocumentFormat format = new RDFXMLDocumentFormat();
        __CLR4_5_2l4l4lvicmsy8.R.inc(782);LOG.info("saving to {} fmt={}", outputStream, format);
        __CLR4_5_2l4l4lvicmsy8.R.inc(783);manager.saveOntology(ontology, format, outputStream);
    }finally{__CLR4_5_2l4l4lvicmsy8.R.flushNeeded();}}

    /**
     * See.
     * 
     * @param iri
     *        the iri
     * @param outFile
     *        the out file
     * @param defaultOnt
     *        -- e.g. "go". If the obo file contains no "ontology:" header tag,
     *        this is added
     * @param manager
     *        the manager to be used
     * @throws IOException
     *         Signals that an I/O exception has occurred.
     * @throws OWLOntologyCreationException
     *         the oWL ontology creation exception
     * @throws OWLOntologyStorageException
     *         the oWL ontology storage exception
     * @throws OBOFormatParserException
     *         the oBO format parser exception
     *         {@link #convertURL(String iri, String outFile, OWLOntologyManager manager)}
     */
    public static void convertURL(String iri, @Nonnull String outFile, String defaultOnt,
        @Nonnull OWLOntologyManager manager) throws IOException, OWLOntologyCreationException,
        OWLOntologyStorageException {try{__CLR4_5_2l4l4lvicmsy8.R.inc(784);
        __CLR4_5_2l4l4lvicmsy8.R.inc(785);OWLAPIObo2Owl bridge = new OWLAPIObo2Owl(manager);
        __CLR4_5_2l4l4lvicmsy8.R.inc(786);OBOFormatParser p = new OBOFormatParser();
        __CLR4_5_2l4l4lvicmsy8.R.inc(787);OBODoc obodoc = p.parse(new URL(iri));
        __CLR4_5_2l4l4lvicmsy8.R.inc(788);obodoc.addDefaultOntologyHeader(defaultOnt);
        __CLR4_5_2l4l4lvicmsy8.R.inc(789);OWLOntology ontology = bridge.convert(obodoc);
        __CLR4_5_2l4l4lvicmsy8.R.inc(790);IRI outputStream = IRI.create(outFile);
        __CLR4_5_2l4l4lvicmsy8.R.inc(791);OWLDocumentFormat format = new RDFXMLDocumentFormat();
        __CLR4_5_2l4l4lvicmsy8.R.inc(792);LOG.info("saving to {} fmt={}", outputStream, format);
        __CLR4_5_2l4l4lvicmsy8.R.inc(793);manager.saveOntology(ontology, format, outputStream);
    }finally{__CLR4_5_2l4l4lvicmsy8.R.flushNeeded();}}

    /**
     * Table 5.8 Translation of Annotation Vocabulary.
     * 
     * @return property map
     */
    @Nonnull
    protected static Map<String, IRI> initAnnotationPropertyMap() {try{__CLR4_5_2l4l4lvicmsy8.R.inc(794);
        __CLR4_5_2l4l4lvicmsy8.R.inc(795);Map<String, IRI> map = new HashMap<>();
        __CLR4_5_2l4l4lvicmsy8.R.inc(796);map.put(OboFormatTag.TAG_IS_OBSELETE.getTag(), OWLRDFVocabulary.OWL_DEPRECATED.getIRI());
        __CLR4_5_2l4l4lvicmsy8.R.inc(797);map.put(OboFormatTag.TAG_NAME.getTag(), OWLRDFVocabulary.RDFS_LABEL.getIRI());
        __CLR4_5_2l4l4lvicmsy8.R.inc(798);map.put(OboFormatTag.TAG_COMMENT.getTag(), OWLRDFVocabulary.RDFS_COMMENT.getIRI());
        __CLR4_5_2l4l4lvicmsy8.R.inc(799);for (Obo2OWLVocabulary vac : Obo2OWLVocabulary.values()) {{
            __CLR4_5_2l4l4lvicmsy8.R.inc(800);map.put(vac.getMappedTag(), vac.getIRI());
        }
        }__CLR4_5_2l4l4lvicmsy8.R.inc(801);return map;
    }finally{__CLR4_5_2l4l4lvicmsy8.R.flushNeeded();}}

    /**
     * Gets the manager.
     * 
     * @return the manager
     */
    public OWLOntologyManager getManager() {try{__CLR4_5_2l4l4lvicmsy8.R.inc(802);
        __CLR4_5_2l4l4lvicmsy8.R.inc(803);return manager;
    }finally{__CLR4_5_2l4l4lvicmsy8.R.flushNeeded();}}

    /**
     * Sets the manager.
     * 
     * @param manager
     *        the new manager
     */
    public void setManager(OWLOntologyManager manager) {try{__CLR4_5_2l4l4lvicmsy8.R.inc(804);
        __CLR4_5_2l4l4lvicmsy8.R.inc(805);this.manager = manager;
    }finally{__CLR4_5_2l4l4lvicmsy8.R.flushNeeded();}}

    /**
     * Gets the obodoc.
     * 
     * @return the obodoc
     */
    public OBODoc getObodoc() {try{__CLR4_5_2l4l4lvicmsy8.R.inc(806);
        __CLR4_5_2l4l4lvicmsy8.R.inc(807);return obodoc;
    }finally{__CLR4_5_2l4l4lvicmsy8.R.flushNeeded();}}

    /**
     * Sets the obodoc.
     * 
     * @param obodoc
     *        the new obodoc
     */
    public void setObodoc(OBODoc obodoc) {try{__CLR4_5_2l4l4lvicmsy8.R.inc(808);
        __CLR4_5_2l4l4lvicmsy8.R.inc(809);this.obodoc = obodoc;
    }finally{__CLR4_5_2l4l4lvicmsy8.R.flushNeeded();}}

    /**
     * Gets the owl ontology.
     * 
     * @return the owlOntology
     */
    @Nonnull
    protected OWLOntology getOwlOntology() {try{__CLR4_5_2l4l4lvicmsy8.R.inc(810);
        __CLR4_5_2l4l4lvicmsy8.R.inc(811);return verifyNotNull(owlOntology);
    }finally{__CLR4_5_2l4l4lvicmsy8.R.flushNeeded();}}

    /**
     * Sets the owl ontology.
     * 
     * @param owlOntology
     *        the owlOntology to set
     */
    protected void setOwlOntology(@Nonnull OWLOntology owlOntology) {try{__CLR4_5_2l4l4lvicmsy8.R.inc(812);
        __CLR4_5_2l4l4lvicmsy8.R.inc(813);this.owlOntology = owlOntology;
    }finally{__CLR4_5_2l4l4lvicmsy8.R.flushNeeded();}}

    /**
     * Creates an OBOFormatParser object to parse a file and then converts it
     * using the convert method.
     * 
     * @param oboFile
     *        the obo file
     * @return ontology
     * @throws OWLOntologyCreationException
     *         the oWL ontology creation exception
     */
    public OWLOntology convert(@Nonnull String oboFile) throws OWLOntologyCreationException {try{__CLR4_5_2l4l4lvicmsy8.R.inc(814);
        __CLR4_5_2l4l4lvicmsy8.R.inc(815);try {
            __CLR4_5_2l4l4lvicmsy8.R.inc(816);OBOFormatParser p = new OBOFormatParser();
            __CLR4_5_2l4l4lvicmsy8.R.inc(817);return convert(p.parse(oboFile));
        } catch (IOException ex) {
            __CLR4_5_2l4l4lvicmsy8.R.inc(818);throw new OWLOntologyCreationException("Error Occured while parsing OBO '" + oboFile + '\'', ex);
        } catch (OBOFormatParserException ex) {
            __CLR4_5_2l4l4lvicmsy8.R.inc(819);throw new OWLOntologyCreationException("Syntax error occured while parsing OBO '" + oboFile + '\'', ex);
        }
    }finally{__CLR4_5_2l4l4lvicmsy8.R.flushNeeded();}}

    /**
     * Convert.
     * 
     * @param doc
     *        the obodoc
     * @return ontology
     * @throws OWLOntologyCreationException
     *         the oWL ontology creation exception
     */
    @Nonnull
    public OWLOntology convert(OBODoc doc) throws OWLOntologyCreationException {try{__CLR4_5_2l4l4lvicmsy8.R.inc(820);
        __CLR4_5_2l4l4lvicmsy8.R.inc(821);obodoc = doc;
        __CLR4_5_2l4l4lvicmsy8.R.inc(822);init(manager);
        __CLR4_5_2l4l4lvicmsy8.R.inc(823);return tr(manager.createOntology());
    }finally{__CLR4_5_2l4l4lvicmsy8.R.flushNeeded();}}

    /**
     * Convert.
     * 
     * @param doc
     *        the obodoc
     * @param in
     *        the in
     * @return the oWL ontology
     */
    public OWLOntology convert(OBODoc doc, @Nonnull OWLOntology in) {try{__CLR4_5_2l4l4lvicmsy8.R.inc(824);
        __CLR4_5_2l4l4lvicmsy8.R.inc(825);obodoc = doc;
        __CLR4_5_2l4l4lvicmsy8.R.inc(826);init(in.getOWLOntologyManager());
        __CLR4_5_2l4l4lvicmsy8.R.inc(827);return tr(in);
    }finally{__CLR4_5_2l4l4lvicmsy8.R.flushNeeded();}}

    /**
     * Tr.
     * 
     * @param in
     *        the in
     * @return the oWL ontology
     */
    @SuppressWarnings("null")
    @Nonnull
    protected OWLOntology tr(@Nonnull OWLOntology in) {try{__CLR4_5_2l4l4lvicmsy8.R.inc(828);
        __CLR4_5_2l4l4lvicmsy8.R.inc(829);setOwlOntology(in);
        __CLR4_5_2l4l4lvicmsy8.R.inc(830);Frame hf = obodoc.getHeaderFrame();
        __CLR4_5_2l4l4lvicmsy8.R.inc(831);Clause ontClause = hf.getClause(OboFormatTag.TAG_ONTOLOGY);
        __CLR4_5_2l4l4lvicmsy8.R.inc(832);if ((((ontClause != null)&&(__CLR4_5_2l4l4lvicmsy8.R.iget(833)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(834)==0&false))) {{
            __CLR4_5_2l4l4lvicmsy8.R.inc(835);String ontOboId = (String) ontClause.getValue();
            __CLR4_5_2l4l4lvicmsy8.R.inc(836);defaultIDSpace = ontOboId;
            __CLR4_5_2l4l4lvicmsy8.R.inc(837);IRI ontIRI;
            __CLR4_5_2l4l4lvicmsy8.R.inc(838);if ((((ontOboId.contains(":"))&&(__CLR4_5_2l4l4lvicmsy8.R.iget(839)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(840)==0&false))) {{
                __CLR4_5_2l4l4lvicmsy8.R.inc(841);ontIRI = IRI.create(ontOboId);
            } }else {{
                __CLR4_5_2l4l4lvicmsy8.R.inc(842);ontIRI = IRI.create(DEFAULT_IRI_PREFIX + ontOboId + ".owl");
            }
            }__CLR4_5_2l4l4lvicmsy8.R.inc(843);Clause dvclause = hf.getClause(OboFormatTag.TAG_DATA_VERSION);
            __CLR4_5_2l4l4lvicmsy8.R.inc(844);if ((((dvclause != null)&&(__CLR4_5_2l4l4lvicmsy8.R.iget(845)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(846)==0&false))) {{
                __CLR4_5_2l4l4lvicmsy8.R.inc(847);String dv = dvclause.getValue().toString();
                __CLR4_5_2l4l4lvicmsy8.R.inc(848);IRI vIRI = IRI.create(DEFAULT_IRI_PREFIX + ontOboId + '/' + dv + '/' + ontOboId + ".owl");
                __CLR4_5_2l4l4lvicmsy8.R.inc(849);OWLOntologyID oid = new OWLOntologyID(Optional.of(ontIRI), Optional.of(vIRI));
                // if the ontology being read has a differet id from the one
                // that was passed in, update it
                // when parsing, the original ontology is likely an anonymous,
                // empty one
                __CLR4_5_2l4l4lvicmsy8.R.inc(850);if ((((!oid.equals(in.getOntologyID()))&&(__CLR4_5_2l4l4lvicmsy8.R.iget(851)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(852)==0&false))) {{
                    __CLR4_5_2l4l4lvicmsy8.R.inc(853);manager.applyChange(new SetOntologyID(in, oid));
                }
            }} }else {{
                // if the ontology being read has a differet id from the one
                // that was passed in, update it
                // when parsing, the original ontology is likely an anonymous,
                // empty one
                __CLR4_5_2l4l4lvicmsy8.R.inc(854);if ((((!ontIRI.equals(in.getOntologyID().getOntologyIRI().orNull()))&&(__CLR4_5_2l4l4lvicmsy8.R.iget(855)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(856)==0&false))) {{
                    __CLR4_5_2l4l4lvicmsy8.R.inc(857);manager.applyChange(new SetOntologyID(in, new OWLOntologyID(Optional.of(ontIRI), Optional
                        .<IRI> absent())));
                }
            }}
        }} }else {{
            __CLR4_5_2l4l4lvicmsy8.R.inc(858);defaultIDSpace = "TEMP";
            __CLR4_5_2l4l4lvicmsy8.R.inc(859);manager.applyChange(new SetOntologyID(in, new OWLOntologyID(Optional.of(IRI.create(DEFAULT_IRI_PREFIX
                + defaultIDSpace)), Optional.<IRI> absent())));
            // TODO - warn
        }
        }__CLR4_5_2l4l4lvicmsy8.R.inc(860);trHeaderFrame(hf);
        __CLR4_5_2l4l4lvicmsy8.R.inc(861);for (Frame f : obodoc.getTypedefFrames()) {{
            __CLR4_5_2l4l4lvicmsy8.R.inc(862);trTypedefToAnnotationProperty(f);
        }
        }__CLR4_5_2l4l4lvicmsy8.R.inc(863);for (Frame f : obodoc.getTypedefFrames()) {{
            __CLR4_5_2l4l4lvicmsy8.R.inc(864);trTypedefFrame(f);
        }
        }__CLR4_5_2l4l4lvicmsy8.R.inc(865);for (Frame f : obodoc.getTermFrames()) {{
            __CLR4_5_2l4l4lvicmsy8.R.inc(866);trTermFrame(f);
        }
        // TODO - individuals
        }__CLR4_5_2l4l4lvicmsy8.R.inc(867);for (Clause cl : hf.getClauses(OboFormatTag.TAG_IMPORT)) {{
            __CLR4_5_2l4l4lvicmsy8.R.inc(868);String path = getURI(cl.getValue().toString());
            __CLR4_5_2l4l4lvicmsy8.R.inc(869);IRI importIRI = IRI.create(path);
            __CLR4_5_2l4l4lvicmsy8.R.inc(870);OWLImportsDeclaration owlImportsDeclaration = fac.getOWLImportsDeclaration(importIRI);
            __CLR4_5_2l4l4lvicmsy8.R.inc(871);manager.makeLoadImportRequest(owlImportsDeclaration, new OWLOntologyLoaderConfiguration());
            __CLR4_5_2l4l4lvicmsy8.R.inc(872);AddImport ai = new AddImport(in, owlImportsDeclaration);
            __CLR4_5_2l4l4lvicmsy8.R.inc(873);manager.applyChange(ai);
        }
        }__CLR4_5_2l4l4lvicmsy8.R.inc(874);postProcess(in);
        __CLR4_5_2l4l4lvicmsy8.R.inc(875);return in;
    }finally{__CLR4_5_2l4l4lvicmsy8.R.flushNeeded();}}

    /**
     * perform any necessary post-processing. currently this only includes the
     * experimental logical-definitions-view-property
     * 
     * @param ontology
     *        the ontology
     */
    protected void postProcess(@Nonnull OWLOntology ontology) {try{__CLR4_5_2l4l4lvicmsy8.R.inc(876);
        __CLR4_5_2l4l4lvicmsy8.R.inc(877);IRI pIRI = null;
        __CLR4_5_2l4l4lvicmsy8.R.inc(878);for (OWLAnnotation ann : ontology.getAnnotations()) {{
            __CLR4_5_2l4l4lvicmsy8.R.inc(879);if ((((Obo2OWLVocabulary.IRI_OIO_LogicalDefinitionViewRelation.sameIRI(ann.getProperty()))&&(__CLR4_5_2l4l4lvicmsy8.R.iget(880)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(881)==0&false))) {{
                __CLR4_5_2l4l4lvicmsy8.R.inc(882);OWLAnnotationValue v = ann.getValue();
                __CLR4_5_2l4l4lvicmsy8.R.inc(883);if ((((v instanceof OWLLiteral)&&(__CLR4_5_2l4l4lvicmsy8.R.iget(884)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(885)==0&false))) {{
                    __CLR4_5_2l4l4lvicmsy8.R.inc(886);String rel = ((OWLLiteral) v).getLiteral();
                    __CLR4_5_2l4l4lvicmsy8.R.inc(887);pIRI = oboIdToIRI(rel);
                } }else {{
                    __CLR4_5_2l4l4lvicmsy8.R.inc(888);pIRI = (IRI) v;
                }
                }__CLR4_5_2l4l4lvicmsy8.R.inc(889);break;
            }
        }}
        }__CLR4_5_2l4l4lvicmsy8.R.inc(890);if ((((pIRI != null)&&(__CLR4_5_2l4l4lvicmsy8.R.iget(891)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(892)==0&false))) {{
            __CLR4_5_2l4l4lvicmsy8.R.inc(893);OWLObjectProperty vp = fac.getOWLObjectProperty(pIRI);
            __CLR4_5_2l4l4lvicmsy8.R.inc(894);Set<OWLAxiom> rmAxioms = new HashSet<>();
            __CLR4_5_2l4l4lvicmsy8.R.inc(895);Set<OWLAxiom> newAxioms = new HashSet<>();
            __CLR4_5_2l4l4lvicmsy8.R.inc(896);for (OWLEquivalentClassesAxiom eca : ontology.getAxioms(AxiomType.EQUIVALENT_CLASSES)) {{
                __CLR4_5_2l4l4lvicmsy8.R.inc(897);int numNamed = 0;
                __CLR4_5_2l4l4lvicmsy8.R.inc(898);Set<OWLClassExpression> xs = new HashSet<>();
                __CLR4_5_2l4l4lvicmsy8.R.inc(899);for (OWLClassExpression x : eca.getClassExpressions()) {{
                    assert (((x != null)&&(__CLR4_5_2l4l4lvicmsy8.R.iget(900)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(901)==0&false));
                    __CLR4_5_2l4l4lvicmsy8.R.inc(902);if ((((x instanceof OWLClass)&&(__CLR4_5_2l4l4lvicmsy8.R.iget(903)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(904)==0&false))) {{
                        __CLR4_5_2l4l4lvicmsy8.R.inc(905);xs.add(x);
                        __CLR4_5_2l4l4lvicmsy8.R.inc(906);numNamed++;
                        __CLR4_5_2l4l4lvicmsy8.R.inc(907);continue;
                    }
                    // anonymous class expressions are 'prefixed' with view
                    // property
                    }__CLR4_5_2l4l4lvicmsy8.R.inc(908);xs.add(fac.getOWLObjectSomeValuesFrom(vp, x));
                }
                }__CLR4_5_2l4l4lvicmsy8.R.inc(909);if ((((numNamed == 1)&&(__CLR4_5_2l4l4lvicmsy8.R.iget(910)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(911)==0&false))) {{
                    __CLR4_5_2l4l4lvicmsy8.R.inc(912);rmAxioms.add(eca);
                    __CLR4_5_2l4l4lvicmsy8.R.inc(913);newAxioms.add(fac.getOWLEquivalentClassesAxiom(xs));
                }
            }}
            }__CLR4_5_2l4l4lvicmsy8.R.inc(914);manager.removeAxioms(ontology, rmAxioms);
            __CLR4_5_2l4l4lvicmsy8.R.inc(915);manager.addAxioms(ontology, newAxioms);
        }
    }}finally{__CLR4_5_2l4l4lvicmsy8.R.flushNeeded();}}

    /**
     * Gets the uri.
     * 
     * @param path
     *        the path
     * @return the uri
     */
    protected static String getURI(@Nonnull String path) {try{__CLR4_5_2l4l4lvicmsy8.R.inc(916);
        __CLR4_5_2l4l4lvicmsy8.R.inc(917);if ((((path.startsWith("http://") || path.startsWith("https://") || path.startsWith("file:"))&&(__CLR4_5_2l4l4lvicmsy8.R.iget(918)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(919)==0&false))) {{
            __CLR4_5_2l4l4lvicmsy8.R.inc(920);return path;
        }
        }__CLR4_5_2l4l4lvicmsy8.R.inc(921);File f = new File(path);
        __CLR4_5_2l4l4lvicmsy8.R.inc(922);return f.toURI().toString();
    }finally{__CLR4_5_2l4l4lvicmsy8.R.flushNeeded();}}

    /**
     * Tr header frame.
     * 
     * @param headerFrame
     *        the header frame
     */
    @SuppressWarnings("null")
    public void trHeaderFrame(@Nonnull Frame headerFrame) {try{__CLR4_5_2l4l4lvicmsy8.R.inc(923);
        __CLR4_5_2l4l4lvicmsy8.R.inc(924);for (String t : headerFrame.getTags()) {{
            __CLR4_5_2l4l4lvicmsy8.R.inc(925);OboFormatTag tag = OBOFormatConstants.getTag(t);
            __CLR4_5_2l4l4lvicmsy8.R.inc(926);if ((((tag == OboFormatTag.TAG_ONTOLOGY)&&(__CLR4_5_2l4l4lvicmsy8.R.iget(927)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(928)==0&false))) {{
                // already processed
            } }else {__CLR4_5_2l4l4lvicmsy8.R.inc(929);if ((((tag == OboFormatTag.TAG_IMPORT)&&(__CLR4_5_2l4l4lvicmsy8.R.iget(930)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(931)==0&false))) {{
                // TODO
                // fac.getOWLImportsDeclaration(importedOntologyIRI);
                // manager.applyChange(new AddImport(baseOnt,
                // manager.getOWLDataFactory()
                // .getOWLImportsDeclaration(importedIRI)));
            } }else {__CLR4_5_2l4l4lvicmsy8.R.inc(932);if ((((tag == OboFormatTag.TAG_SUBSETDEF)&&(__CLR4_5_2l4l4lvicmsy8.R.iget(933)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(934)==0&false))) {{
                __CLR4_5_2l4l4lvicmsy8.R.inc(935);OWLAnnotationProperty parentAnnotProp = trTagToAnnotationProp(t);
                /*
                 * OWLClass cls = clsToDeclar.get(t); if(cls == null){ cls =
                 * trClass(trTagToIRI(t).toString());
                 * add(fac.getOWLDeclarationAxiom(cls)); clsToDeclar.put(t,
                 * cls); }
                 */
                __CLR4_5_2l4l4lvicmsy8.R.inc(936);for (Clause clause : headerFrame.getClauses(t)) {{
                    __CLR4_5_2l4l4lvicmsy8.R.inc(937);OWLAnnotationProperty childAnnotProp = trAnnotationProp(clause.getValue(String.class));
                    __CLR4_5_2l4l4lvicmsy8.R.inc(938);Set<OWLAnnotation> annotations = trAnnotations(clause);
                    __CLR4_5_2l4l4lvicmsy8.R.inc(939);add(fac.getOWLSubAnnotationPropertyOfAxiom(childAnnotProp, parentAnnotProp, annotations));
                    // OWLIndividual indv= trIndividual(
                    // clause.getValue().toString() );
                    // add (fac.getOWLClassAssertionAxiom(cls, indv) );
                    __CLR4_5_2l4l4lvicmsy8.R.inc(940);OWLAnnotationProperty ap = trTagToAnnotationProp(OboFormatTag.TAG_COMMENT.getTag());
                    __CLR4_5_2l4l4lvicmsy8.R.inc(941);add(fac.getOWLAnnotationAssertionAxiom(ap, childAnnotProp.getIRI(), trLiteral(clause.getValue2())));
                }
            }} }else {__CLR4_5_2l4l4lvicmsy8.R.inc(942);if ((((tag == OboFormatTag.TAG_SYNONYMTYPEDEF)&&(__CLR4_5_2l4l4lvicmsy8.R.iget(943)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(944)==0&false))) {{
                __CLR4_5_2l4l4lvicmsy8.R.inc(945);OWLAnnotationProperty parentAnnotProp = trTagToAnnotationProp(t);
                __CLR4_5_2l4l4lvicmsy8.R.inc(946);for (Clause clause : headerFrame.getClauses(t)) {{
                    __CLR4_5_2l4l4lvicmsy8.R.inc(947);Object[] values = clause.getValues().toArray();
                    __CLR4_5_2l4l4lvicmsy8.R.inc(948);OWLAnnotationProperty childAnnotProp = trAnnotationProp(values[0].toString());
                    __CLR4_5_2l4l4lvicmsy8.R.inc(949);IRI childIRI = childAnnotProp.getIRI();
                    __CLR4_5_2l4l4lvicmsy8.R.inc(950);Set<OWLAnnotation> annotations = trAnnotations(clause);
                    __CLR4_5_2l4l4lvicmsy8.R.inc(951);add(fac.getOWLSubAnnotationPropertyOfAxiom(childAnnotProp, parentAnnotProp, annotations));
                    __CLR4_5_2l4l4lvicmsy8.R.inc(952);OWLAnnotationProperty ap = trTagToAnnotationProp(OboFormatTag.TAG_NAME.getTag());
                    __CLR4_5_2l4l4lvicmsy8.R.inc(953);add(fac.getOWLAnnotationAssertionAxiom(ap, childIRI, trLiteral(values[1])));
                    __CLR4_5_2l4l4lvicmsy8.R.inc(954);if ((((values.length > 2 && !values[2].toString().isEmpty())&&(__CLR4_5_2l4l4lvicmsy8.R.iget(955)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(956)==0&false))) {{
                        __CLR4_5_2l4l4lvicmsy8.R.inc(957);ap = trTagToAnnotationProp(OboFormatTag.TAG_SCOPE.getTag());
                        __CLR4_5_2l4l4lvicmsy8.R.inc(958);add(fac.getOWLAnnotationAssertionAxiom(ap, childIRI, trTagToAnnotationProp(values[2].toString())
                            .getIRI()));
                    }
                }}
            }} }else {__CLR4_5_2l4l4lvicmsy8.R.inc(959);if ((((tag == OboFormatTag.TAG_DATE)&&(__CLR4_5_2l4l4lvicmsy8.R.iget(960)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(961)==0&false))) {{
                __CLR4_5_2l4l4lvicmsy8.R.inc(962);Clause clause = headerFrame.getClause(tag);
                __CLR4_5_2l4l4lvicmsy8.R.inc(963);Object value = clause.getValue();
                __CLR4_5_2l4l4lvicmsy8.R.inc(964);String dateString = null;
                __CLR4_5_2l4l4lvicmsy8.R.inc(965);if ((((value instanceof Date)&&(__CLR4_5_2l4l4lvicmsy8.R.iget(966)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(967)==0&false))) {{
                    __CLR4_5_2l4l4lvicmsy8.R.inc(968);dateString = OBOFormatConstants.headerDateFormat().format((Date) value);
                } }else {__CLR4_5_2l4l4lvicmsy8.R.inc(969);if ((((value instanceof String)&&(__CLR4_5_2l4l4lvicmsy8.R.iget(970)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(971)==0&false))) {{
                    __CLR4_5_2l4l4lvicmsy8.R.inc(972);dateString = (String) value;
                }
                }}__CLR4_5_2l4l4lvicmsy8.R.inc(973);if ((((dateString != null)&&(__CLR4_5_2l4l4lvicmsy8.R.iget(974)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(975)==0&false))) {{
                    __CLR4_5_2l4l4lvicmsy8.R.inc(976);addOntologyAnnotation(trTagToAnnotationProp(t), trLiteral(dateString), trAnnotations(clause));
                } }else {{
                    // TODO: Throw Exceptions
                    __CLR4_5_2l4l4lvicmsy8.R.inc(977);OBOFormatException e = new OBOFormatException("Cannot translate clause \u00ab" + clause + '\u00bb');
                    __CLR4_5_2l4l4lvicmsy8.R.inc(978);LOG.error("Cannot translate: {}", clause, e);
                }
            }} }else {__CLR4_5_2l4l4lvicmsy8.R.inc(979);if ((((tag == OboFormatTag.TAG_PROPERTY_VALUE)&&(__CLR4_5_2l4l4lvicmsy8.R.iget(980)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(981)==0&false))) {{
                __CLR4_5_2l4l4lvicmsy8.R.inc(982);addPropertyValueHeaders(headerFrame.getClauses(OboFormatTag.TAG_PROPERTY_VALUE));
            } }else {__CLR4_5_2l4l4lvicmsy8.R.inc(983);if ((((tag == OboFormatTag.TAG_DATA_VERSION)&&(__CLR4_5_2l4l4lvicmsy8.R.iget(984)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(985)==0&false))) {{
                /*
                 * Clause clause = headerFrame.getClause(tag); String dv =
                 * clause.getValue().toString(); String ontOboId =
                 * headerFrame.getClause
                 * (OboFormatTag.TAG_ONTOLOGY).getValue().toString(); IRI vIRI =
                 * IRI
                 * .create(Obo2OWLConstants.DEFAULT_IRI_PREFIX+ontOboId+"/"+dv
                 * +"/"+ontOboId+".owl");
                 * System.out.println("Adding versionIRI "+vIRI);
                 * addOntologyAnnotation(fac.getOWLVersionInfo(),
                 * fac.getOWLLiteral(vIRI.toString(),
                 * OWL2Datatype.XSD_ANY_URI));
                 */
            } }else {__CLR4_5_2l4l4lvicmsy8.R.inc(986);if ((((tag == OboFormatTag.TAG_REMARK)&&(__CLR4_5_2l4l4lvicmsy8.R.iget(987)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(988)==0&false))) {{
                // translate remark as rdfs:comment
                __CLR4_5_2l4l4lvicmsy8.R.inc(989);Collection<Clause> clauses = headerFrame.getClauses(t);
                __CLR4_5_2l4l4lvicmsy8.R.inc(990);for (Clause clause : clauses) {{
                    __CLR4_5_2l4l4lvicmsy8.R.inc(991);addOntologyAnnotation(fac.getRDFSComment(), trLiteral(clause.getValue()), trAnnotations(clause));
                }
            }} }else {__CLR4_5_2l4l4lvicmsy8.R.inc(992);if ((((tag == OboFormatTag.TAG_IDSPACE)&&(__CLR4_5_2l4l4lvicmsy8.R.iget(993)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(994)==0&false))) {{
                // do not translate, as they are just directives? TODO ask Chris
            } }else {__CLR4_5_2l4l4lvicmsy8.R.inc(995);if ((((tag == OboFormatTag.TAG_OWL_AXIOMS)&&(__CLR4_5_2l4l4lvicmsy8.R.iget(996)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(997)==0&false))) {{
                // in theory, there should only be one tag
                // but we can silently collapse multiple tags
                __CLR4_5_2l4l4lvicmsy8.R.inc(998);Collection<String> axiomStrings = headerFrame.getTagValues(tag, String.class);
                __CLR4_5_2l4l4lvicmsy8.R.inc(999);try {
                    __CLR4_5_2l4l4lvicmsy8.R.inc(1000);for (String axiomString : axiomStrings) {{
                        __CLR4_5_2l4l4lvicmsy8.R.inc(1001);Set<OWLAxiom> axioms = OwlStringTools.translate(axiomString, manager);
                        __CLR4_5_2l4l4lvicmsy8.R.inc(1002);if ((((axioms != null)&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1003)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1004)==0&false))) {{
                            __CLR4_5_2l4l4lvicmsy8.R.inc(1005);manager.addAxioms(getOwlOntology(), axioms);
                        }
                    }}
                }} catch (OwlStringException e) {
                    __CLR4_5_2l4l4lvicmsy8.R.inc(1006);throw new RuntimeException(e);
                }
            } }else {{
                __CLR4_5_2l4l4lvicmsy8.R.inc(1007);Collection<Clause> clauses = headerFrame.getClauses(t);
                __CLR4_5_2l4l4lvicmsy8.R.inc(1008);for (Clause clause : clauses) {{
                    __CLR4_5_2l4l4lvicmsy8.R.inc(1009);addOntologyAnnotation(trTagToAnnotationProp(t), trLiteral(clause.getValue()), trAnnotations(
                        clause));
                }
            }}
        }}}}}}}}}}}
    }}finally{__CLR4_5_2l4l4lvicmsy8.R.flushNeeded();}}

    /**
     * Adds the property value headers.
     * 
     * @param clauses
     *        the clauses
     */
    @SuppressWarnings("null")
    protected void addPropertyValueHeaders(@Nonnull Collection<Clause> clauses) {try{__CLR4_5_2l4l4lvicmsy8.R.inc(1010);
        __CLR4_5_2l4l4lvicmsy8.R.inc(1011);for (Clause clause : clauses) {{
            __CLR4_5_2l4l4lvicmsy8.R.inc(1012);Set<OWLAnnotation> annotations = trAnnotations(clause);
            __CLR4_5_2l4l4lvicmsy8.R.inc(1013);Collection<Object> values = clause.getValues();
            __CLR4_5_2l4l4lvicmsy8.R.inc(1014);Object v = clause.getValue();
            __CLR4_5_2l4l4lvicmsy8.R.inc(1015);Object v2 = clause.getValue2();
            __CLR4_5_2l4l4lvicmsy8.R.inc(1016);if ((((v == null)&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1017)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1018)==0&false))) {{
                // TODO: Throw Exceptions
                __CLR4_5_2l4l4lvicmsy8.R.inc(1019);LOG.error("Cannot translate: {}", clause);
            } }else {__CLR4_5_2l4l4lvicmsy8.R.inc(1020);if ((((values.size() == 2)&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1021)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1022)==0&false))) {{
                // property_value(Rel-ID Entity-ID Qualifiers)
                __CLR4_5_2l4l4lvicmsy8.R.inc(1023);OWLAnnotationProperty prop = trAnnotationProp((String) v);
                __CLR4_5_2l4l4lvicmsy8.R.inc(1024);OWLAnnotationValue value = trAnnotationProp(v2.toString()).getIRI();
                __CLR4_5_2l4l4lvicmsy8.R.inc(1025);OWLAnnotation ontAnn = fac.getOWLAnnotation(prop, value, annotations);
                __CLR4_5_2l4l4lvicmsy8.R.inc(1026);AddOntologyAnnotation addAnn = new AddOntologyAnnotation(getOwlOntology(), ontAnn);
                __CLR4_5_2l4l4lvicmsy8.R.inc(1027);apply(addAnn);
            } }else {__CLR4_5_2l4l4lvicmsy8.R.inc(1028);if ((((values.size() == 3)&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1029)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1030)==0&false))) {{
                // property_value(Rel-ID Value XSD-Type Qualifiers)
                __CLR4_5_2l4l4lvicmsy8.R.inc(1031);Iterator<Object> it = clause.getValues().iterator();
                __CLR4_5_2l4l4lvicmsy8.R.inc(1032);it.next();
                __CLR4_5_2l4l4lvicmsy8.R.inc(1033);it.next();
                __CLR4_5_2l4l4lvicmsy8.R.inc(1034);String v3String = (String) it.next();
                __CLR4_5_2l4l4lvicmsy8.R.inc(1035);IRI valueIRI;
                __CLR4_5_2l4l4lvicmsy8.R.inc(1036);if ((((v3String.startsWith("xsd:"))&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1037)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1038)==0&false))) {{
                    __CLR4_5_2l4l4lvicmsy8.R.inc(1039);valueIRI = IRI.create(Namespaces.XSD + v3String.substring(4));
                } }else {{
                    __CLR4_5_2l4l4lvicmsy8.R.inc(1040);valueIRI = IRI.create(v3String);
                }
                }__CLR4_5_2l4l4lvicmsy8.R.inc(1041);OWLAnnotationValue value = fac.getOWLLiteral((String) v2, OWL2Datatype.getDatatype(valueIRI));
                __CLR4_5_2l4l4lvicmsy8.R.inc(1042);OWLAnnotationProperty prop = trAnnotationProp((String) v);
                __CLR4_5_2l4l4lvicmsy8.R.inc(1043);OWLAnnotation ontAnn = fac.getOWLAnnotation(prop, value, annotations);
                __CLR4_5_2l4l4lvicmsy8.R.inc(1044);AddOntologyAnnotation addAnn = new AddOntologyAnnotation(getOwlOntology(), ontAnn);
                __CLR4_5_2l4l4lvicmsy8.R.inc(1045);apply(addAnn);
            } }else {{
                __CLR4_5_2l4l4lvicmsy8.R.inc(1046);LOG.error("Cannot translate: {}", clause);
                // TODO
            }
        }}}}
    }}finally{__CLR4_5_2l4l4lvicmsy8.R.flushNeeded();}}

    /**
     * Adds the ontology annotation.
     * 
     * @param ap
     *        the ap
     * @param v
     *        the v
     * @param annotations
     *        the annotations
     */
    protected void addOntologyAnnotation(@Nonnull OWLAnnotationProperty ap, @Nonnull OWLAnnotationValue v,
        @Nonnull Set<OWLAnnotation> annotations) {try{__CLR4_5_2l4l4lvicmsy8.R.inc(1047);
        __CLR4_5_2l4l4lvicmsy8.R.inc(1048);OWLAnnotation ontAnn = fac.getOWLAnnotation(ap, v, annotations);
        __CLR4_5_2l4l4lvicmsy8.R.inc(1049);AddOntologyAnnotation addAnn = new AddOntologyAnnotation(getOwlOntology(), ontAnn);
        __CLR4_5_2l4l4lvicmsy8.R.inc(1050);apply(addAnn);
    }finally{__CLR4_5_2l4l4lvicmsy8.R.flushNeeded();}}

    /**
     * Tr term frame.
     * 
     * @param termFrame
     *        the term frame
     * @return the oWL class expression
     */
    public OWLClassExpression trTermFrame(@Nonnull Frame termFrame) {try{__CLR4_5_2l4l4lvicmsy8.R.inc(1051);
        __CLR4_5_2l4l4lvicmsy8.R.inc(1052);OWLClass cls = trClass(termFrame.getId());
        __CLR4_5_2l4l4lvicmsy8.R.inc(1053);add(fac.getOWLDeclarationAxiom(cls));
        __CLR4_5_2l4l4lvicmsy8.R.inc(1054);for (String t : termFrame.getTags()) {{
            // System.out.println("tag:"+tag);
            __CLR4_5_2l4l4lvicmsy8.R.inc(1055);Collection<Clause> clauses = termFrame.getClauses(t);
            __CLR4_5_2l4l4lvicmsy8.R.inc(1056);if ((((OboFormatTag.TAG_ALT_ID.getTag().equals(t))&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1057)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1058)==0&false))) {{
                // Generate deprecated and replaced_by details for alternate
                // identifier
                __CLR4_5_2l4l4lvicmsy8.R.inc(1059);Set<OWLAxiom> axioms = translateAltIds(clauses, cls.getIRI(), true);
                __CLR4_5_2l4l4lvicmsy8.R.inc(1060);if ((((!axioms.isEmpty())&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1061)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1062)==0&false))) {{
                    __CLR4_5_2l4l4lvicmsy8.R.inc(1063);add(axioms);
                }
            }}
            }__CLR4_5_2l4l4lvicmsy8.R.inc(1064);Set<OWLAxiom> axioms = trTermFrameClauses(cls, clauses, t);
            __CLR4_5_2l4l4lvicmsy8.R.inc(1065);if ((((!axioms.isEmpty())&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1066)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1067)==0&false))) {{
                __CLR4_5_2l4l4lvicmsy8.R.inc(1068);add(axioms);
            }
        }}
        }__CLR4_5_2l4l4lvicmsy8.R.inc(1069);return cls;
    }finally{__CLR4_5_2l4l4lvicmsy8.R.flushNeeded();}}

    /**
     * Generate axioms for the alternate identifiers of an {@link OWLClass} or
     * {@link OWLObjectProperty}.
     * 
     * @param clauses
     *        collection of alt_id clauses
     * @param replacedBy
     *        IRI of the entity
     * @param isClass
     *        set to true if the alt_id is represents a class, false in case of
     *        an property
     * @return set of axioms generated for the alt_id clauses
     */
    @Nonnull
    protected Set<OWLAxiom> translateAltIds(@Nonnull Collection<Clause> clauses, @Nonnull IRI replacedBy,
        boolean isClass) {try{__CLR4_5_2l4l4lvicmsy8.R.inc(1070);
        __CLR4_5_2l4l4lvicmsy8.R.inc(1071);Set<OWLAxiom> axioms = new HashSet<>();
        __CLR4_5_2l4l4lvicmsy8.R.inc(1072);for (Clause clause : clauses) {{
            __CLR4_5_2l4l4lvicmsy8.R.inc(1073);final String altId = clause.getValue(String.class);
            __CLR4_5_2l4l4lvicmsy8.R.inc(1074);if ((((altId != null)&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1075)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1076)==0&false))) {{
                __CLR4_5_2l4l4lvicmsy8.R.inc(1077);final OWLEntity altIdEntity;
                __CLR4_5_2l4l4lvicmsy8.R.inc(1078);if ((((isClass)&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1079)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1080)==0&false))) {{
                    __CLR4_5_2l4l4lvicmsy8.R.inc(1081);altIdEntity = trClass(altId);
                } }else {{
                    __CLR4_5_2l4l4lvicmsy8.R.inc(1082);IRI altIdIRI = oboIdToIRI(altId);
                    __CLR4_5_2l4l4lvicmsy8.R.inc(1083);altIdEntity = fac.getOWLObjectProperty(altIdIRI);
                }
                // entity declaration axiom
                }__CLR4_5_2l4l4lvicmsy8.R.inc(1084);axioms.add(fac.getOWLDeclarationAxiom(altIdEntity));
                // annotate as deprecated
                __CLR4_5_2l4l4lvicmsy8.R.inc(1085);axioms.add(fac.getOWLAnnotationAssertionAxiom(altIdEntity.getIRI(), fac.getOWLAnnotation(fac
                    .getOWLDeprecated(), fac.getOWLLiteral(true))));
                // annotate with replaced_by (IAO_0100001)
                __CLR4_5_2l4l4lvicmsy8.R.inc(1086);axioms.add(fac.getOWLAnnotationAssertionAxiom(altIdEntity.getIRI(), fac.getOWLAnnotation(fac
                    .getOWLAnnotationProperty(Obo2OWLVocabulary.IRI_IAO_0100001.iri), replacedBy)));
                // annotate with obo:IAO_0000231=obo:IAO_0000227
                // 'has obsolescence reason' 'terms merged'
                __CLR4_5_2l4l4lvicmsy8.R.inc(1087);axioms.add(fac.getOWLAnnotationAssertionAxiom(altIdEntity.getIRI(), fac.getOWLAnnotation(fac
                    .getOWLAnnotationProperty(Obo2OWLConstants.IRI_IAO_0000231), Obo2OWLConstants.IRI_IAO_0000227)));
            }
        }}
        }__CLR4_5_2l4l4lvicmsy8.R.inc(1088);return axioms;
    }finally{__CLR4_5_2l4l4lvicmsy8.R.flushNeeded();}}

    /**
     * Tr term frame clauses.
     * 
     * @param cls
     *        the cls
     * @param clauses
     *        the clauses
     * @param t
     *        the t
     * @return the sets the
     */
    @Nonnull
    public Set<OWLAxiom> trTermFrameClauses(@Nonnull OWLClass cls, @Nonnull Collection<Clause> clauses, String t) {try{__CLR4_5_2l4l4lvicmsy8.R.inc(1089);
        __CLR4_5_2l4l4lvicmsy8.R.inc(1090);OboFormatTag tag = OBOFormatConstants.getTag(t);
        __CLR4_5_2l4l4lvicmsy8.R.inc(1091);Set<OWLAxiom> axioms = new HashSet<>();
        __CLR4_5_2l4l4lvicmsy8.R.inc(1092);if ((((tag == OboFormatTag.TAG_INTERSECTION_OF)&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1093)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1094)==0&false))) {{
            __CLR4_5_2l4l4lvicmsy8.R.inc(1095);axioms.add(trIntersectionOf(cls, clauses));
        } }else {__CLR4_5_2l4l4lvicmsy8.R.inc(1096);if ((((tag == OboFormatTag.TAG_UNION_OF)&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1097)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1098)==0&false))) {{
            __CLR4_5_2l4l4lvicmsy8.R.inc(1099);axioms.add(trUnionOf(cls, clauses));
        } }else {{
            __CLR4_5_2l4l4lvicmsy8.R.inc(1100);for (Clause clause : clauses) {{
                assert (((clause != null)&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1101)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1102)==0&false));
                __CLR4_5_2l4l4lvicmsy8.R.inc(1103);axioms.add(trTermClause(cls, t, clause));
            }
        }}
        }}__CLR4_5_2l4l4lvicmsy8.R.inc(1104);return axioms;
    }finally{__CLR4_5_2l4l4lvicmsy8.R.flushNeeded();}}

    /**
     * Tr typedef to annotation property.
     * 
     * @param typedefFrame
     *        the typedef frame
     * @return the oWL named object
     */
    @Nullable
    protected OWLNamedObject trTypedefToAnnotationProperty(@Nonnull Frame typedefFrame) {try{__CLR4_5_2l4l4lvicmsy8.R.inc(1105);
        __CLR4_5_2l4l4lvicmsy8.R.inc(1106);Object tagValue = typedefFrame.getTagValue(OboFormatTag.TAG_IS_METADATA_TAG);
        __CLR4_5_2l4l4lvicmsy8.R.inc(1107);if ((((Boolean.TRUE.equals(tagValue))&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1108)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1109)==0&false))) {{
            __CLR4_5_2l4l4lvicmsy8.R.inc(1110);String id = typedefFrame.getId();
            __CLR4_5_2l4l4lvicmsy8.R.inc(1111);OWLAnnotationProperty p = trAnnotationProp(id);
            __CLR4_5_2l4l4lvicmsy8.R.inc(1112);add(fac.getOWLDeclarationAxiom(p));
            // handle xrefs also for meta data tags
            __CLR4_5_2l4l4lvicmsy8.R.inc(1113);String xid = translateShorthandIdToExpandedId(id);
            __CLR4_5_2l4l4lvicmsy8.R.inc(1114);if ((((!id.equals(xid))&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1115)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1116)==0&false))) {{
                __CLR4_5_2l4l4lvicmsy8.R.inc(1117);OWLAxiom ax = fac.getOWLAnnotationAssertionAxiom(trTagToAnnotationProp("shorthand"), p.getIRI(),
                    trLiteral(id), new HashSet<OWLAnnotation>());
                __CLR4_5_2l4l4lvicmsy8.R.inc(1118);add(ax);
            }
            }__CLR4_5_2l4l4lvicmsy8.R.inc(1119);typedefToAnnotationProperty.put(p.getIRI().toString(), p);
            __CLR4_5_2l4l4lvicmsy8.R.inc(1120);for (String tag : typedefFrame.getTags()) {{
                __CLR4_5_2l4l4lvicmsy8.R.inc(1121);OboFormatTag tagConstant = OBOFormatConstants.getTag(tag);
                __CLR4_5_2l4l4lvicmsy8.R.inc(1122);if ((((tagConstant == OboFormatTag.TAG_IS_A)&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1123)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1124)==0&false))) {{
                    // todo - subAnnotationProperty
                    /*
                     * OWLAxiom ax = fac.getOWLSubAnnotationPropertyOfAxiom( p,
                     * trObjectProp((String)typedefFrame.getC), annotations);
                     */
                } }else {{
                    __CLR4_5_2l4l4lvicmsy8.R.inc(1125);for (Clause clause : typedefFrame.getClauses(tag)) {{
                        // System.out.println(p+" p "+tag+" t "+clause);
                        __CLR4_5_2l4l4lvicmsy8.R.inc(1126);add(trGenericClause(p, tag, clause));
                    }
                }}
            }}
            }__CLR4_5_2l4l4lvicmsy8.R.inc(1127);return p;
        }
        }__CLR4_5_2l4l4lvicmsy8.R.inc(1128);return null;
    }finally{__CLR4_5_2l4l4lvicmsy8.R.flushNeeded();}}

    /**
     * Tr typedef frame.
     * 
     * @param typedefFrame
     *        the typedef frame
     * @return the oWL named object
     */
    @Nullable
    public OWLNamedObject trTypedefFrame(@Nonnull Frame typedefFrame) {try{__CLR4_5_2l4l4lvicmsy8.R.inc(1129);
        // TODO - annotation props
        __CLR4_5_2l4l4lvicmsy8.R.inc(1130);Object tagValue = typedefFrame.getTagValue(OboFormatTag.TAG_IS_METADATA_TAG);
        __CLR4_5_2l4l4lvicmsy8.R.inc(1131);if ((((Boolean.TRUE.equals(tagValue))&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1132)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1133)==0&false))) {{
            // already handled
            // see: trTypedefToAnnotationProperty(Frame typedefFrame)
            __CLR4_5_2l4l4lvicmsy8.R.inc(1134);return null;
        } }else {{
            __CLR4_5_2l4l4lvicmsy8.R.inc(1135);String id = typedefFrame.getId();
            __CLR4_5_2l4l4lvicmsy8.R.inc(1136);OWLObjectProperty p = trObjectProp(id);
            __CLR4_5_2l4l4lvicmsy8.R.inc(1137);add(fac.getOWLDeclarationAxiom(p));
            __CLR4_5_2l4l4lvicmsy8.R.inc(1138);String xid = translateShorthandIdToExpandedId(id);
            __CLR4_5_2l4l4lvicmsy8.R.inc(1139);if ((((!xid.equals(id))&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1140)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1141)==0&false))) {{
                __CLR4_5_2l4l4lvicmsy8.R.inc(1142);OWLAxiom ax = fac.getOWLAnnotationAssertionAxiom(trTagToAnnotationProp("shorthand"), p.getIRI(),
                    trLiteral(id), new HashSet<OWLAnnotation>());
                __CLR4_5_2l4l4lvicmsy8.R.inc(1143);add(ax);
            }
            /*
             * // See 5.9.3 Special Rules for Relations Collection<Xref> xrefs =
             * typedefFrame.getTagValues(OboFormatTag.TAG_XREF, Xref.class);
             * String xrefStr = null; for (Xref xref: xrefs) { if (xref != null)
             * { String xid = xref.getIdref(); if ((xid.startsWith("RO") ||
             * xid.startsWith("BFO")) && !xid.equals(id)) { // RO and BFO have
             * special status. // avoid cycles (in case of self-xref) //
             * fac.getOWLAnnotationAssertionAxiom(prop, p.getIRI(),
             * trLiteral(id), new HashSet<>()); OWLAxiom ax =
             * fac.getOWLAnnotationAssertionAxiom(
             * trTagToAnnotationProp("shorthand"), p.getIRI(), trLiteral(id),
             * new HashSet<>()); add(ax); // return
             * oboIdToIRI(xid); } } }
             */
            }__CLR4_5_2l4l4lvicmsy8.R.inc(1144);for (String tag : typedefFrame.getTags()) {{
                __CLR4_5_2l4l4lvicmsy8.R.inc(1145);Collection<Clause> clauses = typedefFrame.getClauses(tag);
                __CLR4_5_2l4l4lvicmsy8.R.inc(1146);OboFormatTag tagConstant = OBOFormatConstants.getTag(tag);
                __CLR4_5_2l4l4lvicmsy8.R.inc(1147);if ((((tagConstant == OboFormatTag.TAG_INTERSECTION_OF)&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1148)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1149)==0&false))) {{
                    __CLR4_5_2l4l4lvicmsy8.R.inc(1150);OWLAxiom axiom = trRelationIntersectionOf(id, p, clauses);
                    __CLR4_5_2l4l4lvicmsy8.R.inc(1151);if ((((axiom != null)&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1152)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1153)==0&false))) {{
                        __CLR4_5_2l4l4lvicmsy8.R.inc(1154);add(axiom);
                    }
                }} }else {__CLR4_5_2l4l4lvicmsy8.R.inc(1155);if ((((tagConstant == OboFormatTag.TAG_UNION_OF)&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1156)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1157)==0&false))) {{
                    __CLR4_5_2l4l4lvicmsy8.R.inc(1158);OWLAxiom axiom = trRelationUnionOf(id, p, clauses);
                    __CLR4_5_2l4l4lvicmsy8.R.inc(1159);if ((((axiom != null)&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1160)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1161)==0&false))) {{
                        __CLR4_5_2l4l4lvicmsy8.R.inc(1162);add(axiom);
                    }
                }} }else {__CLR4_5_2l4l4lvicmsy8.R.inc(1163);if ((((tagConstant == OboFormatTag.TAG_ALT_ID)&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1164)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1165)==0&false))) {{
                    __CLR4_5_2l4l4lvicmsy8.R.inc(1166);add(translateAltIds(clauses, p.getIRI(), false));
                } }else {{
                    __CLR4_5_2l4l4lvicmsy8.R.inc(1167);for (Clause clause : clauses) {{
                        __CLR4_5_2l4l4lvicmsy8.R.inc(1168);add(trTypedefClause(p, tag, clause));
                    }
                }}
            }}}}
            }__CLR4_5_2l4l4lvicmsy8.R.inc(1169);return p;
        }
    }}finally{__CLR4_5_2l4l4lvicmsy8.R.flushNeeded();}}

    /**
     * Tr relation union of.
     * 
     * @param id
     *        the id
     * @param p
     *        the p
     * @param clauses
     *        the clauses
     * @return the oWL axiom
     */
    @Nullable
    @SuppressWarnings("unused")
    protected static OWLAxiom trRelationUnionOf(String id, OWLProperty p, Collection<Clause> clauses) {try{__CLR4_5_2l4l4lvicmsy8.R.inc(1170);
        // TODO not expressible in OWL - use APs. SWRL?
        __CLR4_5_2l4l4lvicmsy8.R.inc(1171);LOG.error("The relation union_of for {} is currently non-translatable to OWL. Ignoring clauses: {}", id,
            clauses);
        __CLR4_5_2l4l4lvicmsy8.R.inc(1172);return null;
    }finally{__CLR4_5_2l4l4lvicmsy8.R.flushNeeded();}}

    /**
     * Tr relation intersection of.
     * 
     * @param id
     *        the id
     * @param p
     *        the p
     * @param clauses
     *        the clauses
     * @return the oWL axiom
     */
    @Nullable
    @SuppressWarnings("unused")
    protected static OWLAxiom trRelationIntersectionOf(String id, OWLProperty p, Collection<Clause> clauses) {try{__CLR4_5_2l4l4lvicmsy8.R.inc(1173);
        // TODO not expressible in OWL - use APs. SWRL?
        __CLR4_5_2l4l4lvicmsy8.R.inc(1174);LOG.error("The relation intersection_of for {} is currently non-translatable to OWL. Ignoring clauses: {}", id,
            clauses);
        __CLR4_5_2l4l4lvicmsy8.R.inc(1175);return null;
    }finally{__CLR4_5_2l4l4lvicmsy8.R.flushNeeded();}}

    /**
     * Tr union of.
     * 
     * @param cls
     *        the cls
     * @param clauses
     *        the clauses
     * @return the oWL axiom
     */
    @SuppressWarnings("null")
    @Nonnull
    protected OWLAxiom trUnionOf(OWLClass cls, @Nonnull Collection<Clause> clauses) {try{__CLR4_5_2l4l4lvicmsy8.R.inc(1176);
        __CLR4_5_2l4l4lvicmsy8.R.inc(1177);Set<? extends OWLAnnotation> annotations = trAnnotations(clauses);
        __CLR4_5_2l4l4lvicmsy8.R.inc(1178);Set<OWLClassExpression> eSet = new HashSet<>();
        __CLR4_5_2l4l4lvicmsy8.R.inc(1179);eSet.add(cls);
        __CLR4_5_2l4l4lvicmsy8.R.inc(1180);Set<OWLClassExpression> iSet = new HashSet<>();
        __CLR4_5_2l4l4lvicmsy8.R.inc(1181);for (Clause clause : clauses) {{
            __CLR4_5_2l4l4lvicmsy8.R.inc(1182);Collection<QualifierValue> qvs = clause.getQualifierValues();
            // TODO - quals
            __CLR4_5_2l4l4lvicmsy8.R.inc(1183);if ((((clause.getValues().size() == 1)&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1184)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1185)==0&false))) {{
                __CLR4_5_2l4l4lvicmsy8.R.inc(1186);iSet.add(trClass(clause.getValue()));
            } }else {{
                __CLR4_5_2l4l4lvicmsy8.R.inc(1187);LOG.error("union_of n-ary slots not is standard - converting anyway");
                // System.err.println("union_of n-ary slots not is standard -
                // converting anyway");
                __CLR4_5_2l4l4lvicmsy8.R.inc(1188);iSet.add(trRel((String) clause.getValue(), (String) clause.getValue2(), qvs));
            }
        }}
        // out.println(cls+" CL:"+clauses+" I:"+iSet+" E:"+eSet);
        }__CLR4_5_2l4l4lvicmsy8.R.inc(1189);eSet.add(fac.getOWLObjectUnionOf(iSet));
        // TODO - fix this
        __CLR4_5_2l4l4lvicmsy8.R.inc(1190);if ((((annotations.isEmpty())&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1191)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1192)==0&false))) {{
            __CLR4_5_2l4l4lvicmsy8.R.inc(1193);return fac.getOWLEquivalentClassesAxiom(eSet);
        } }else {{
            __CLR4_5_2l4l4lvicmsy8.R.inc(1194);return fac.getOWLEquivalentClassesAxiom(eSet, annotations);
        }
    }}finally{__CLR4_5_2l4l4lvicmsy8.R.flushNeeded();}}

    /**
     * Tr intersection of.
     * 
     * @param cls
     *        the cls
     * @param clauses
     *        the clauses
     * @return the oWL axiom
     */
    @SuppressWarnings("null")
    protected OWLAxiom trIntersectionOf(OWLClass cls, @Nonnull Collection<Clause> clauses) {try{__CLR4_5_2l4l4lvicmsy8.R.inc(1195);
        __CLR4_5_2l4l4lvicmsy8.R.inc(1196);Set<? extends OWLAnnotation> annotations = trAnnotations(clauses);
        __CLR4_5_2l4l4lvicmsy8.R.inc(1197);Set<OWLClassExpression> eSet = new HashSet<>();
        __CLR4_5_2l4l4lvicmsy8.R.inc(1198);eSet.add(cls);
        __CLR4_5_2l4l4lvicmsy8.R.inc(1199);Set<OWLClassExpression> iSet = new HashSet<>();
        __CLR4_5_2l4l4lvicmsy8.R.inc(1200);for (Clause clause : clauses) {{
            __CLR4_5_2l4l4lvicmsy8.R.inc(1201);Collection<QualifierValue> qvs = clause.getQualifierValues();
            __CLR4_5_2l4l4lvicmsy8.R.inc(1202);if ((((clause.getValues().size() == 1)&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1203)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1204)==0&false))) {{
                __CLR4_5_2l4l4lvicmsy8.R.inc(1205);iSet.add(trClass(clause.getValue()));
            } }else {{
                __CLR4_5_2l4l4lvicmsy8.R.inc(1206);iSet.add(trRel((String) clause.getValue(), (String) clause.getValue2(), qvs));
            }
        }}
        // out.println(cls+" CL:"+clauses+" I:"+iSet+" E:"+eSet);
        }__CLR4_5_2l4l4lvicmsy8.R.inc(1207);eSet.add(fac.getOWLObjectIntersectionOf(iSet));
        // TODO - fix this
        __CLR4_5_2l4l4lvicmsy8.R.inc(1208);if ((((annotations.isEmpty())&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1209)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1210)==0&false))) {{
            __CLR4_5_2l4l4lvicmsy8.R.inc(1211);return fac.getOWLEquivalentClassesAxiom(eSet);
        } }else {{
            __CLR4_5_2l4l4lvicmsy8.R.inc(1212);return fac.getOWLEquivalentClassesAxiom(eSet, annotations);
        }
    }}finally{__CLR4_5_2l4l4lvicmsy8.R.flushNeeded();}}

    /**
     * Adds the.
     * 
     * @param axiom
     *        the axiom
     */
    protected void add(@Nullable OWLAxiom axiom) {try{__CLR4_5_2l4l4lvicmsy8.R.inc(1213);
        __CLR4_5_2l4l4lvicmsy8.R.inc(1214);if ((((axiom == null)&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1215)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1216)==0&false))) {{
            __CLR4_5_2l4l4lvicmsy8.R.inc(1217);LOG.error("no axiom");
            __CLR4_5_2l4l4lvicmsy8.R.inc(1218);return;
        }
        }__CLR4_5_2l4l4lvicmsy8.R.inc(1219);add(Collections.singleton(axiom));
    }finally{__CLR4_5_2l4l4lvicmsy8.R.flushNeeded();}}

    /**
     * Adds the.
     * 
     * @param axioms
     *        the axioms
     */
    protected void add(@Nullable Set<OWLAxiom> axioms) {try{__CLR4_5_2l4l4lvicmsy8.R.inc(1220);
        __CLR4_5_2l4l4lvicmsy8.R.inc(1221);if ((((axioms == null || axioms.isEmpty())&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1222)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1223)==0&false))) {{
            __CLR4_5_2l4l4lvicmsy8.R.inc(1224);LOG.error("no axiom");
            __CLR4_5_2l4l4lvicmsy8.R.inc(1225);return;
        }
        }__CLR4_5_2l4l4lvicmsy8.R.inc(1226);manager.addAxioms(getOwlOntology(), axioms);
    }finally{__CLR4_5_2l4l4lvicmsy8.R.flushNeeded();}}

    /**
     * Apply the change.
     * 
     * @param change
     *        the change
     */
    protected void apply(OWLOntologyChange change) {try{__CLR4_5_2l4l4lvicmsy8.R.inc(1227);
        __CLR4_5_2l4l4lvicmsy8.R.inc(1228);apply(CollectionFactory.list(change));
    }finally{__CLR4_5_2l4l4lvicmsy8.R.flushNeeded();}}

    /**
     * Apply the changes.
     * 
     * @param changes
     *        the changes
     */
    protected void apply(@Nonnull List<OWLOntologyChange> changes) {try{__CLR4_5_2l4l4lvicmsy8.R.inc(1229);
        __CLR4_5_2l4l4lvicmsy8.R.inc(1230);try {
            __CLR4_5_2l4l4lvicmsy8.R.inc(1231);manager.applyChanges(changes);
        } catch (Exception e) {
            __CLR4_5_2l4l4lvicmsy8.R.inc(1232);LOG.error("COULD NOT TRANSLATE AXIOM", e);
        }
    }finally{__CLR4_5_2l4l4lvicmsy8.R.flushNeeded();}}

    /**
     * #5.2
     * 
     * @param cls
     *        the cls
     * @param tag
     *        the tag
     * @param clause
     *        the clause
     * @return axiom
     */
    @SuppressWarnings("null")
    protected OWLAxiom trTermClause(@Nonnull OWLClass cls, String tag, @Nonnull Clause clause) {try{__CLR4_5_2l4l4lvicmsy8.R.inc(1233);
        __CLR4_5_2l4l4lvicmsy8.R.inc(1234);Collection<QualifierValue> qvs = clause.getQualifierValues();
        __CLR4_5_2l4l4lvicmsy8.R.inc(1235);Set<? extends OWLAnnotation> annotations = trAnnotations(clause);
        __CLR4_5_2l4l4lvicmsy8.R.inc(1236);OboFormatTag tagConstant = OBOFormatConstants.getTag(tag);
        // 5.2.2
        // The gci_relation qualifier translate cls to a class expression
        __CLR4_5_2l4l4lvicmsy8.R.inc(1237);OWLClassExpression clsx = cls;
        __CLR4_5_2l4l4lvicmsy8.R.inc(1238);String gciRel = getQVString("gci_relation", qvs);
        __CLR4_5_2l4l4lvicmsy8.R.inc(1239);if ((((gciRel != null && !gciRel.isEmpty())&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1240)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1241)==0&false))) {{
            __CLR4_5_2l4l4lvicmsy8.R.inc(1242);String gciFiller = getQVString("gci_filler", qvs);
            __CLR4_5_2l4l4lvicmsy8.R.inc(1243);OWLClassExpression r = trRel(gciRel, gciFiller, new HashSet<QualifierValue>());
            __CLR4_5_2l4l4lvicmsy8.R.inc(1244);clsx = fac.getOWLObjectIntersectionOf(cls, r);
        }
        }__CLR4_5_2l4l4lvicmsy8.R.inc(1245);OWLAxiom ax;
        __CLR4_5_2l4l4lvicmsy8.R.inc(1246);if ((((tagConstant == OboFormatTag.TAG_IS_A)&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1247)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1248)==0&false))) {{
            __CLR4_5_2l4l4lvicmsy8.R.inc(1249);ax = fac.getOWLSubClassOfAxiom(clsx, trClass((String) clause.getValue()), annotations);
        } }else {__CLR4_5_2l4l4lvicmsy8.R.inc(1250);if ((((tagConstant == OboFormatTag.TAG_RELATIONSHIP)&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1251)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1252)==0&false))) {{
            // TODO
            __CLR4_5_2l4l4lvicmsy8.R.inc(1253);IRI relId = oboIdToIRI((String) clause.getValue());
            __CLR4_5_2l4l4lvicmsy8.R.inc(1254);OWLAnnotationProperty prop = typedefToAnnotationProperty.get(relId.toString());
            __CLR4_5_2l4l4lvicmsy8.R.inc(1255);if ((((prop != null)&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1256)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1257)==0&false))) {{
                __CLR4_5_2l4l4lvicmsy8.R.inc(1258);ax = fac.getOWLAnnotationAssertionAxiom(prop, cls.getIRI(), oboIdToIRI((String) clause.getValue2()),
                    annotations);
            } }else {{
                __CLR4_5_2l4l4lvicmsy8.R.inc(1259);ax = fac.getOWLSubClassOfAxiom(clsx, trRel((String) clause.getValue(), (String) clause.getValue2(),
                    qvs), annotations);
            }
        }} }else {__CLR4_5_2l4l4lvicmsy8.R.inc(1260);if ((((tagConstant == OboFormatTag.TAG_DISJOINT_FROM)&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1261)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1262)==0&false))) {{
            __CLR4_5_2l4l4lvicmsy8.R.inc(1263);Set<OWLClassExpression> cSet = new HashSet<>();
            __CLR4_5_2l4l4lvicmsy8.R.inc(1264);cSet.add(clsx);
            __CLR4_5_2l4l4lvicmsy8.R.inc(1265);cSet.add(trClass((String) clause.getValue()));
            __CLR4_5_2l4l4lvicmsy8.R.inc(1266);ax = fac.getOWLDisjointClassesAxiom(cSet, annotations);
        } }else {__CLR4_5_2l4l4lvicmsy8.R.inc(1267);if ((((tagConstant == OboFormatTag.TAG_EQUIVALENT_TO)&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1268)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1269)==0&false))) {{
            __CLR4_5_2l4l4lvicmsy8.R.inc(1270);Set<OWLClassExpression> cSet = new HashSet<>();
            __CLR4_5_2l4l4lvicmsy8.R.inc(1271);cSet.add(clsx);
            __CLR4_5_2l4l4lvicmsy8.R.inc(1272);cSet.add(trClass((String) clause.getValue()));
            __CLR4_5_2l4l4lvicmsy8.R.inc(1273);ax = fac.getOWLEquivalentClassesAxiom(cSet, annotations);
        } }else {{
            __CLR4_5_2l4l4lvicmsy8.R.inc(1274);return trGenericClause(cls, tag, clause);
        }
        }}}}__CLR4_5_2l4l4lvicmsy8.R.inc(1275);return ax;
    }finally{__CLR4_5_2l4l4lvicmsy8.R.flushNeeded();}}

    // no data properties in obo
    /**
     * Tr typedef clause.
     * 
     * @param p
     *        the p
     * @param tag
     *        the tag
     * @param clause
     *        the clause
     * @return the oWL axiom
     */
    @SuppressWarnings("null")
    @Nullable
    protected OWLAxiom trTypedefClause(@Nonnull OWLObjectProperty p, String tag, @Nonnull Clause clause) {try{__CLR4_5_2l4l4lvicmsy8.R.inc(1276);
        __CLR4_5_2l4l4lvicmsy8.R.inc(1277);OWLAxiom ax = null;
        __CLR4_5_2l4l4lvicmsy8.R.inc(1278);Object v = clause.getValue();
        __CLR4_5_2l4l4lvicmsy8.R.inc(1279);Set<OWLAnnotation> annotations = trAnnotations(clause);
        __CLR4_5_2l4l4lvicmsy8.R.inc(1280);OboFormatTag tagConstant = OBOFormatConstants.getTag(tag);
        __CLR4_5_2l4l4lvicmsy8.R.inc(1281);if ((((tagConstant == OboFormatTag.TAG_IS_A)&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1282)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1283)==0&false))) {{
            __CLR4_5_2l4l4lvicmsy8.R.inc(1284);ax = fac.getOWLSubObjectPropertyOfAxiom(p, trObjectProp((String) v), annotations);
        } }else {__CLR4_5_2l4l4lvicmsy8.R.inc(1285);if ((((tagConstant == OboFormatTag.TAG_RELATIONSHIP)&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1286)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1287)==0&false))) {{
            __CLR4_5_2l4l4lvicmsy8.R.inc(1288);IRI relId = oboIdToIRI((String) clause.getValue());
            __CLR4_5_2l4l4lvicmsy8.R.inc(1289);OWLAnnotationProperty metaProp = typedefToAnnotationProperty.get(relId.toString());
            __CLR4_5_2l4l4lvicmsy8.R.inc(1290);if ((((metaProp != null)&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1291)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1292)==0&false))) {{
                __CLR4_5_2l4l4lvicmsy8.R.inc(1293);ax = fac.getOWLAnnotationAssertionAxiom(metaProp, p.getIRI(), oboIdToIRI((String) clause.getValue2()),
                    annotations);
            } }else {{
                // System.err.println("no annotation prop:"+relId);
                // ax = null; // TODO
            }
        }} }else {__CLR4_5_2l4l4lvicmsy8.R.inc(1294);if ((((tagConstant == OboFormatTag.TAG_DISJOINT_FROM)&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1295)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1296)==0&false))) {{
            __CLR4_5_2l4l4lvicmsy8.R.inc(1297);Set<OWLObjectPropertyExpression> cSet = new HashSet<>();
            __CLR4_5_2l4l4lvicmsy8.R.inc(1298);cSet.add(p);
            __CLR4_5_2l4l4lvicmsy8.R.inc(1299);cSet.add(trObjectProp((String) v));
            __CLR4_5_2l4l4lvicmsy8.R.inc(1300);ax = fac.getOWLDisjointObjectPropertiesAxiom(cSet, annotations);
        } }else {__CLR4_5_2l4l4lvicmsy8.R.inc(1301);if ((((tagConstant == OboFormatTag.TAG_INVERSE_OF)&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1302)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1303)==0&false))) {{
            __CLR4_5_2l4l4lvicmsy8.R.inc(1304);ax = fac.getOWLInverseObjectPropertiesAxiom(p, trObjectProp((String) v), annotations);
        } }else {__CLR4_5_2l4l4lvicmsy8.R.inc(1305);if ((((tagConstant == OboFormatTag.TAG_EQUIVALENT_TO)&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1306)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1307)==0&false))) {{
            __CLR4_5_2l4l4lvicmsy8.R.inc(1308);Set<OWLObjectPropertyExpression> cSet = new HashSet<>();
            __CLR4_5_2l4l4lvicmsy8.R.inc(1309);cSet.add(p);
            __CLR4_5_2l4l4lvicmsy8.R.inc(1310);cSet.add(trObjectProp((String) v));
            __CLR4_5_2l4l4lvicmsy8.R.inc(1311);ax = fac.getOWLEquivalentObjectPropertiesAxiom(cSet, annotations);
        } }else {__CLR4_5_2l4l4lvicmsy8.R.inc(1312);if ((((tagConstant == OboFormatTag.TAG_DOMAIN)&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1313)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1314)==0&false))) {{
            __CLR4_5_2l4l4lvicmsy8.R.inc(1315);ax = fac.getOWLObjectPropertyDomainAxiom(p, trClass(v), annotations);
        } }else {__CLR4_5_2l4l4lvicmsy8.R.inc(1316);if ((((tagConstant == OboFormatTag.TAG_RANGE)&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1317)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1318)==0&false))) {{
            __CLR4_5_2l4l4lvicmsy8.R.inc(1319);ax = fac.getOWLObjectPropertyRangeAxiom(p, trClass(v), annotations);
        } }else {__CLR4_5_2l4l4lvicmsy8.R.inc(1320);if ((((tagConstant == OboFormatTag.TAG_TRANSITIVE_OVER)&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1321)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1322)==0&false))) {{
            __CLR4_5_2l4l4lvicmsy8.R.inc(1323);List<OWLObjectPropertyExpression> chain = new ArrayList<>(2);
            __CLR4_5_2l4l4lvicmsy8.R.inc(1324);chain.add(p);
            __CLR4_5_2l4l4lvicmsy8.R.inc(1325);chain.add(trObjectProp(v));
            __CLR4_5_2l4l4lvicmsy8.R.inc(1326);ax = fac.getOWLSubPropertyChainOfAxiom(chain, p, annotations);
        } }else {__CLR4_5_2l4l4lvicmsy8.R.inc(1327);if ((((tagConstant == OboFormatTag.TAG_HOLDS_OVER_CHAIN
            || tagConstant == OboFormatTag.TAG_EQUIVALENT_TO_CHAIN)&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1328)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1329)==0&false))) {{
            __CLR4_5_2l4l4lvicmsy8.R.inc(1330);if ((((tagConstant == OboFormatTag.TAG_EQUIVALENT_TO_CHAIN)&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1331)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1332)==0&false))) {{
                __CLR4_5_2l4l4lvicmsy8.R.inc(1333);OWLAnnotation ann = fac.getOWLAnnotation(trAnnotationProp(IRI_PROP_ISREVERSIBLEPROPERTYCHAIN),
                    trLiteral("true"));
                __CLR4_5_2l4l4lvicmsy8.R.inc(1334);annotations.add(ann);
                // isReversiblePropertyChain
            }
            }__CLR4_5_2l4l4lvicmsy8.R.inc(1335);List<OWLObjectPropertyExpression> chain = new ArrayList<>();
            __CLR4_5_2l4l4lvicmsy8.R.inc(1336);chain.add(trObjectProp(v));
            __CLR4_5_2l4l4lvicmsy8.R.inc(1337);chain.add(trObjectProp(clause.getValue2()));
            __CLR4_5_2l4l4lvicmsy8.R.inc(1338);ax = fac.getOWLSubPropertyChainOfAxiom(chain, p, annotations);
            // System.out.println("chain:"+ax);
            // TODO - annotations for equivalent to
        } }else {__CLR4_5_2l4l4lvicmsy8.R.inc(1339);if ((((tagConstant == OboFormatTag.TAG_IS_TRANSITIVE && "true".equals(clause.getValue().toString()))&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1340)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1341)==0&false))) {{
            __CLR4_5_2l4l4lvicmsy8.R.inc(1342);ax = fac.getOWLTransitiveObjectPropertyAxiom(p, annotations);
        } }else {__CLR4_5_2l4l4lvicmsy8.R.inc(1343);if ((((tagConstant == OboFormatTag.TAG_IS_REFLEXIVE && "true".equals(clause.getValue().toString()))&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1344)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1345)==0&false))) {{
            __CLR4_5_2l4l4lvicmsy8.R.inc(1346);ax = fac.getOWLReflexiveObjectPropertyAxiom(p, annotations);
        } }else {__CLR4_5_2l4l4lvicmsy8.R.inc(1347);if ((((tagConstant == OboFormatTag.TAG_IS_SYMMETRIC && "true".equals(clause.getValue().toString()))&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1348)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1349)==0&false))) {{
            __CLR4_5_2l4l4lvicmsy8.R.inc(1350);ax = fac.getOWLSymmetricObjectPropertyAxiom(p, annotations);
        } }else {__CLR4_5_2l4l4lvicmsy8.R.inc(1351);if ((((tagConstant == OboFormatTag.TAG_IS_ASYMMETRIC && "true".equals(clause.getValue().toString()))&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1352)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1353)==0&false))) {{
            __CLR4_5_2l4l4lvicmsy8.R.inc(1354);ax = fac.getOWLAsymmetricObjectPropertyAxiom(p, annotations);
        } }else {__CLR4_5_2l4l4lvicmsy8.R.inc(1355);if ((((tagConstant == OboFormatTag.TAG_IS_FUNCTIONAL && "true".equals(clause.getValue().toString()))&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1356)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1357)==0&false))) {{
            __CLR4_5_2l4l4lvicmsy8.R.inc(1358);ax = fac.getOWLFunctionalObjectPropertyAxiom(p, annotations);
        } }else {__CLR4_5_2l4l4lvicmsy8.R.inc(1359);if ((((tagConstant == OboFormatTag.TAG_IS_INVERSE_FUNCTIONAL && "true".equals(clause.getValue()
            .toString()))&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1360)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1361)==0&false))) {{
            __CLR4_5_2l4l4lvicmsy8.R.inc(1362);ax = fac.getOWLInverseFunctionalObjectPropertyAxiom(p, annotations);
        } }else {{
            __CLR4_5_2l4l4lvicmsy8.R.inc(1363);return trGenericClause(p, tag, clause);
        }
        // TODO - disjointOver
        }}}}}}}}}}}}}}}__CLR4_5_2l4l4lvicmsy8.R.inc(1364);return ax;
    }finally{__CLR4_5_2l4l4lvicmsy8.R.flushNeeded();}}

    /**
     * Tr generic clause.
     * 
     * @param e
     *        the e
     * @param tag
     *        the tag
     * @param clause
     *        the clause
     * @return the oWL axiom
     */
    protected OWLAxiom trGenericClause(@Nonnull OWLNamedObject e, @Nonnull String tag, @Nonnull Clause clause) {try{__CLR4_5_2l4l4lvicmsy8.R.inc(1365);
        /*
         * Collection<QualifierValue> qvs = clause.getQualifierValues(); Set<?
         * extends OWLAnnotation> annotations = trAnnotations(clause);
         * OWLAnnotationSubject sub = (OWLAnnotationSubject) e.getIRI();
         * //System.out.println(e+" ==> "+sub); if (clause.getValue() == null) {
         * System.err.println("Problem:"+clause); } OWLAxiom ax = null; if
         * (tag.equals("name")) { ax = fac.getOWLAnnotationAssertionAxiom(
         * trTagToAnnotationProp(tag), sub, trLiteral(clause.getValue()),
         * annotations); } else if (tag.equals("def")) { // TODO ax =
         * fac.getOWLAnnotationAssertionAxiom( trTagToAnnotationProp(tag), sub,
         * trLiteral(clause.getValue()), annotations); } else { // generic
         * //System.out.println("generic clause:"+clause); ax =
         * fac.getOWLAnnotationAssertionAxiom( trTagToAnnotationProp(tag), sub,
         * trLiteral(clause.getValue()), annotations); } // TODO synonyms return
         * ax;
         */
        __CLR4_5_2l4l4lvicmsy8.R.inc(1366);return trGenericClause(e.getIRI(), tag, clause);
    }finally{__CLR4_5_2l4l4lvicmsy8.R.flushNeeded();}}

    /**
     * Tr generic clause.
     * 
     * @param sub
     *        the sub
     * @param tag
     *        the tag
     * @param clause
     *        the clause
     * @return the oWL axiom
     */
    @SuppressWarnings("null")
    @Nullable
    protected OWLAxiom trGenericClause(@Nonnull OWLAnnotationSubject sub, @Nonnull String tag, @Nonnull Clause clause) {try{__CLR4_5_2l4l4lvicmsy8.R.inc(1367);
        __CLR4_5_2l4l4lvicmsy8.R.inc(1368);Set<OWLAnnotation> annotations = trAnnotations(clause);
        __CLR4_5_2l4l4lvicmsy8.R.inc(1369);if ((((clause.getValue() == null)&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1370)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1371)==0&false))) {{
            __CLR4_5_2l4l4lvicmsy8.R.inc(1372);LOG.error("Problem: {}", clause);
        }
        }__CLR4_5_2l4l4lvicmsy8.R.inc(1373);OWLAxiom ax = null;
        __CLR4_5_2l4l4lvicmsy8.R.inc(1374);OboFormatTag tagConstant = OBOFormatConstants.getTag(tag);
        // System.out.println("CLAUSE: "+clause+" // TAG="+_tag);
        __CLR4_5_2l4l4lvicmsy8.R.inc(1375);if ((((tagConstant == OboFormatTag.TAG_NAME)&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1376)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1377)==0&false))) {{
            __CLR4_5_2l4l4lvicmsy8.R.inc(1378);ax = fac.getOWLAnnotationAssertionAxiom(trTagToAnnotationProp(tag), sub, trLiteral(clause.getValue()),
                annotations);
        } }else {__CLR4_5_2l4l4lvicmsy8.R.inc(1379);if ((((tagConstant == OboFormatTag.TAG_DEF)&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1380)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1381)==0&false))) {{
            __CLR4_5_2l4l4lvicmsy8.R.inc(1382);ax = fac.getOWLAnnotationAssertionAxiom(trTagToAnnotationProp(tag), sub, trLiteral(clause.getValue()),
                annotations);
        } }else {__CLR4_5_2l4l4lvicmsy8.R.inc(1383);if ((((tagConstant == OboFormatTag.TAG_SUBSET)&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1384)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1385)==0&false))) {{
            __CLR4_5_2l4l4lvicmsy8.R.inc(1386);Object v = clause.getValue();
            __CLR4_5_2l4l4lvicmsy8.R.inc(1387);if ((((v == null)&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1388)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1389)==0&false))) {{
                // TODO: Throw Exceptions
                __CLR4_5_2l4l4lvicmsy8.R.inc(1390);LOG.error("Cannot translate: {}", clause);
            } }else {{
                __CLR4_5_2l4l4lvicmsy8.R.inc(1391);ax = fac.getOWLAnnotationAssertionAxiom(trTagToAnnotationProp(tag), sub, trAnnotationProp(v.toString())
                    .getIRI(), annotations);
            }
        }} }else {__CLR4_5_2l4l4lvicmsy8.R.inc(1392);if ((((tagConstant == OboFormatTag.TAG_PROPERTY_VALUE)&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1393)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1394)==0&false))) {{
            __CLR4_5_2l4l4lvicmsy8.R.inc(1395);Collection<Object> values = clause.getValues();
            __CLR4_5_2l4l4lvicmsy8.R.inc(1396);Object v = clause.getValue();
            __CLR4_5_2l4l4lvicmsy8.R.inc(1397);Object v2 = clause.getValue2();
            __CLR4_5_2l4l4lvicmsy8.R.inc(1398);if ((((v == null)&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1399)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1400)==0&false))) {{
                // TODO: Throw Exceptions
                __CLR4_5_2l4l4lvicmsy8.R.inc(1401);LOG.error("Cannot translate: {}", clause);
            } }else {__CLR4_5_2l4l4lvicmsy8.R.inc(1402);if ((((values.size() == 2)&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1403)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1404)==0&false))) {{
                // property_value(Rel-ID Entity-ID Qualifiers)
                __CLR4_5_2l4l4lvicmsy8.R.inc(1405);ax = fac.getOWLAnnotationAssertionAxiom(trAnnotationProp((String) v), sub, trAnnotationProp(v2
                    .toString()).getIRI(), annotations);
            } }else {__CLR4_5_2l4l4lvicmsy8.R.inc(1406);if ((((values.size() == 3)&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1407)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1408)==0&false))) {{
                // property_value(Rel-ID Value XSD-Type Qualifiers)
                __CLR4_5_2l4l4lvicmsy8.R.inc(1409);Iterator<Object> it = clause.getValues().iterator();
                __CLR4_5_2l4l4lvicmsy8.R.inc(1410);it.next();
                __CLR4_5_2l4l4lvicmsy8.R.inc(1411);it.next();
                __CLR4_5_2l4l4lvicmsy8.R.inc(1412);String v3String = (String) it.next();
                __CLR4_5_2l4l4lvicmsy8.R.inc(1413);IRI valueIRI;
                __CLR4_5_2l4l4lvicmsy8.R.inc(1414);if ((((v3String.startsWith("xsd:"))&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1415)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1416)==0&false))) {{
                    __CLR4_5_2l4l4lvicmsy8.R.inc(1417);valueIRI = IRI.create(Namespaces.XSD + v3String.substring(4));
                } }else {{
                    __CLR4_5_2l4l4lvicmsy8.R.inc(1418);valueIRI = IRI.create(v3String);
                }
                }__CLR4_5_2l4l4lvicmsy8.R.inc(1419);OWLAnnotationValue value = fac.getOWLLiteral((String) v2, OWL2Datatype.getDatatype(valueIRI));
                __CLR4_5_2l4l4lvicmsy8.R.inc(1420);ax = fac.getOWLAnnotationAssertionAxiom(trAnnotationProp((String) v), sub, value, annotations);
            } }else {{
                __CLR4_5_2l4l4lvicmsy8.R.inc(1421);LOG.error("Cannot translate: {}", clause);
                // TODO
            }
        }}}} }else {__CLR4_5_2l4l4lvicmsy8.R.inc(1422);if ((((tagConstant == OboFormatTag.TAG_SYNONYM)&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1423)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1424)==0&false))) {{
            __CLR4_5_2l4l4lvicmsy8.R.inc(1425);Object[] values = clause.getValues().toArray();
            __CLR4_5_2l4l4lvicmsy8.R.inc(1426);String synType;
            __CLR4_5_2l4l4lvicmsy8.R.inc(1427);if ((((values.length > 1)&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1428)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1429)==0&false))) {{
                __CLR4_5_2l4l4lvicmsy8.R.inc(1430);synType = values[1].toString();
                __CLR4_5_2l4l4lvicmsy8.R.inc(1431);if ((((values.length > 2)&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1432)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1433)==0&false))) {{
                    __CLR4_5_2l4l4lvicmsy8.R.inc(1434);OWLAnnotation ann = fac.getOWLAnnotation(trTagToAnnotationProp(OboFormatTag.TAG_HAS_SYNONYM_TYPE
                        .getTag()), trAnnotationProp(values[2].toString()).getIRI());
                    __CLR4_5_2l4l4lvicmsy8.R.inc(1435);annotations.add(ann);
                }
            }} }else {{
                __CLR4_5_2l4l4lvicmsy8.R.inc(1436);LOG.warn("Assume 'RELATED'for missing scope in synonym clause: {}", clause);
                // we make allowances for obof1.0, where the synonym scope is
                // optional
                __CLR4_5_2l4l4lvicmsy8.R.inc(1437);synType = OboFormatTag.TAG_RELATED.getTag();
            }
            }__CLR4_5_2l4l4lvicmsy8.R.inc(1438);ax = fac.getOWLAnnotationAssertionAxiom(trSynonymType(synType), sub, trLiteral(clause.getValue()),
                annotations);
        } }else {__CLR4_5_2l4l4lvicmsy8.R.inc(1439);if ((((tagConstant == OboFormatTag.TAG_XREF)&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1440)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1441)==0&false))) {{
            __CLR4_5_2l4l4lvicmsy8.R.inc(1442);Xref xref = (Xref) clause.getValue();
            __CLR4_5_2l4l4lvicmsy8.R.inc(1443);String xrefAnnotation = xref.getAnnotation();
            __CLR4_5_2l4l4lvicmsy8.R.inc(1444);if ((((xrefAnnotation != null)&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1445)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1446)==0&false))) {{
                __CLR4_5_2l4l4lvicmsy8.R.inc(1447);OWLAnnotation owlAnnotation = fac.getOWLAnnotation(fac.getRDFSLabel(), fac.getOWLLiteral(
                    xrefAnnotation));
                __CLR4_5_2l4l4lvicmsy8.R.inc(1448);annotations.add(owlAnnotation);
            }
            }__CLR4_5_2l4l4lvicmsy8.R.inc(1449);ax = fac.getOWLAnnotationAssertionAxiom(trTagToAnnotationProp(tag), sub, trLiteral(clause.getValue()),
                annotations);
        } }else {{
            // generic
            // System.out.println("generic clause:"+clause);
            __CLR4_5_2l4l4lvicmsy8.R.inc(1450);ax = fac.getOWLAnnotationAssertionAxiom(trTagToAnnotationProp(tag), sub, trLiteral(clause.getValue()),
                annotations);
        }
        }}}}}}__CLR4_5_2l4l4lvicmsy8.R.inc(1451);return ax;
    }finally{__CLR4_5_2l4l4lvicmsy8.R.flushNeeded();}}

    /**
     * Tr synonym type.
     * 
     * @param type
     *        the type
     * @return the oWL annotation property
     */
    protected OWLAnnotationProperty trSynonymType(@Nonnull String type) {try{__CLR4_5_2l4l4lvicmsy8.R.inc(1452);
        __CLR4_5_2l4l4lvicmsy8.R.inc(1453);if ((((type.equals(OboFormatTag.TAG_RELATED.getTag()) || type.equals(OboFormatTag.TAG_EXACT.getTag()) || type
            .equals(OboFormatTag.TAG_NARROW.getTag()) || type.equals(OboFormatTag.TAG_BROAD.getTag()))&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1454)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1455)==0&false))) {{
            __CLR4_5_2l4l4lvicmsy8.R.inc(1456);return trTagToAnnotationProp(type);
        }
        }__CLR4_5_2l4l4lvicmsy8.R.inc(1457);return trAnnotationProp(type);
    }finally{__CLR4_5_2l4l4lvicmsy8.R.flushNeeded();}}

    /**
     * Tr annotations.
     * 
     * @param clause
     *        the clause
     * @return the sets the
     */
    @Nonnull
    protected Set<OWLAnnotation> trAnnotations(@Nonnull Clause clause) {try{__CLR4_5_2l4l4lvicmsy8.R.inc(1458);
        __CLR4_5_2l4l4lvicmsy8.R.inc(1459);if ((((clause.hasNoAnnotations())&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1460)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1461)==0&false))) {{
            __CLR4_5_2l4l4lvicmsy8.R.inc(1462);return CollectionFactory.createSet();
        }
        }__CLR4_5_2l4l4lvicmsy8.R.inc(1463);Set<OWLAnnotation> anns = new HashSet<>();
        __CLR4_5_2l4l4lvicmsy8.R.inc(1464);trAnnotations(clause, anns);
        __CLR4_5_2l4l4lvicmsy8.R.inc(1465);return anns;
    }finally{__CLR4_5_2l4l4lvicmsy8.R.flushNeeded();}}

    /**
     * Tr annotations.
     * 
     * @param clause
     *        the clause
     * @param anns
     *        the anns
     */
    @SuppressWarnings("null")
    protected void trAnnotations(@Nonnull Clause clause, @Nonnull Set<OWLAnnotation> anns) {try{__CLR4_5_2l4l4lvicmsy8.R.inc(1466);
        __CLR4_5_2l4l4lvicmsy8.R.inc(1467);Collection<Xref> xrefs = clause.getXrefs();
        __CLR4_5_2l4l4lvicmsy8.R.inc(1468);for (Xref x : xrefs) {{
            __CLR4_5_2l4l4lvicmsy8.R.inc(1469);if ((((x.getIdref() != null && !x.getIdref().isEmpty())&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1470)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1471)==0&false))) {{
                __CLR4_5_2l4l4lvicmsy8.R.inc(1472);OWLAnnotationProperty ap = trTagToAnnotationProp(OboFormatTag.TAG_XREF.getTag());
                __CLR4_5_2l4l4lvicmsy8.R.inc(1473);OWLAnnotation ann = fac.getOWLAnnotation(ap, trLiteral(x));
                __CLR4_5_2l4l4lvicmsy8.R.inc(1474);anns.add(ann);
            }
        }}
        }__CLR4_5_2l4l4lvicmsy8.R.inc(1475);Collection<QualifierValue> qvs = clause.getQualifierValues();
        __CLR4_5_2l4l4lvicmsy8.R.inc(1476);for (QualifierValue qv : qvs) {{
            __CLR4_5_2l4l4lvicmsy8.R.inc(1477);String qTag = qv.getQualifier();
            __CLR4_5_2l4l4lvicmsy8.R.inc(1478);if ((((SKIPPED_QUALIFIERS.contains(qTag))&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1479)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1480)==0&false))) {{
                __CLR4_5_2l4l4lvicmsy8.R.inc(1481);continue;
            }
            }__CLR4_5_2l4l4lvicmsy8.R.inc(1482);OWLAnnotationProperty ap = trTagToAnnotationProp(qTag);
            __CLR4_5_2l4l4lvicmsy8.R.inc(1483);OWLAnnotation ann = fac.getOWLAnnotation(ap, trLiteral(qv.getValue()));
            __CLR4_5_2l4l4lvicmsy8.R.inc(1484);anns.add(ann);
        }
    }}finally{__CLR4_5_2l4l4lvicmsy8.R.flushNeeded();}}

    /**
     * Tr annotations.
     * 
     * @param clauses
     *        the clauses
     * @return the set of annotations
     */
    @Nullable
    protected Set<? extends OWLAnnotation> trAnnotations(@Nonnull Collection<Clause> clauses) {try{__CLR4_5_2l4l4lvicmsy8.R.inc(1485);
        __CLR4_5_2l4l4lvicmsy8.R.inc(1486);Set<OWLAnnotation> anns = new HashSet<>();
        __CLR4_5_2l4l4lvicmsy8.R.inc(1487);for (Clause clause : clauses) {{
            assert (((clause != null)&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1488)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1489)==0&false));
            __CLR4_5_2l4l4lvicmsy8.R.inc(1490);trAnnotations(clause, anns);
        }
        }__CLR4_5_2l4l4lvicmsy8.R.inc(1491);return anns;
    }finally{__CLR4_5_2l4l4lvicmsy8.R.flushNeeded();}}

    /**
     * Tr rel.
     * 
     * @param relId
     *        the rel id
     * @param classId
     *        the class id
     * @param quals
     *        the quals
     * @return the oWL class expression
     */
    public OWLClassExpression trRel(@Nonnull String relId, @Nonnull String classId,
        @Nonnull Collection<QualifierValue> quals) {try{__CLR4_5_2l4l4lvicmsy8.R.inc(1492);
        __CLR4_5_2l4l4lvicmsy8.R.inc(1493);Frame relFrame = obodoc.getTypedefFrame(relId);
        __CLR4_5_2l4l4lvicmsy8.R.inc(1494);OWLObjectPropertyExpression pe = trObjectProp(relId);
        __CLR4_5_2l4l4lvicmsy8.R.inc(1495);OWLClassExpression ce = trClass(classId);
        assert (((pe != null)&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1496)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1497)==0&false));
        assert (((ce != null)&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1498)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1499)==0&false));
        __CLR4_5_2l4l4lvicmsy8.R.inc(1500);Integer exact = getQVInt("cardinality", quals);
        __CLR4_5_2l4l4lvicmsy8.R.inc(1501);Integer min = getQVInt("minCardinality", quals);
        __CLR4_5_2l4l4lvicmsy8.R.inc(1502);Integer max = getQVInt("maxCardinality", quals);
        __CLR4_5_2l4l4lvicmsy8.R.inc(1503);boolean allSome = getQVBoolean("all_some", quals);
        __CLR4_5_2l4l4lvicmsy8.R.inc(1504);boolean allOnly = getQVBoolean("all_only", quals);
        // obo-format allows dangling references to classes in class
        // expressions;
        // create an explicit class declaration to be sure
        __CLR4_5_2l4l4lvicmsy8.R.inc(1505);if ((((ce instanceof OWLClass)&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1506)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1507)==0&false))) {{
            __CLR4_5_2l4l4lvicmsy8.R.inc(1508);add(fac.getOWLDeclarationAxiom((OWLClass) ce));
        }
        }__CLR4_5_2l4l4lvicmsy8.R.inc(1509);OWLClassExpression ex;
        __CLR4_5_2l4l4lvicmsy8.R.inc(1510);if ((((exact != null && exact > 0)&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1511)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1512)==0&false))) {{
            __CLR4_5_2l4l4lvicmsy8.R.inc(1513);ex = fac.getOWLObjectExactCardinality(exact, pe, ce);
        } }else {__CLR4_5_2l4l4lvicmsy8.R.inc(1514);if ((((exact != null && exact == 0 || max != null && max == 0)&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1515)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1516)==0&false))) {{
            __CLR4_5_2l4l4lvicmsy8.R.inc(1517);OWLObjectComplementOf ceCompl = fac.getOWLObjectComplementOf(ce);
            __CLR4_5_2l4l4lvicmsy8.R.inc(1518);ex = fac.getOWLObjectAllValuesFrom(pe, ceCompl);
        } }else {__CLR4_5_2l4l4lvicmsy8.R.inc(1519);if ((((max != null && min != null)&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1520)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1521)==0&false))) {{
            __CLR4_5_2l4l4lvicmsy8.R.inc(1522);ex = fac.getOWLObjectIntersectionOf(fac.getOWLObjectMinCardinality(min, pe, ce), fac
                .getOWLObjectMaxCardinality(max, pe, ce));
        } }else {__CLR4_5_2l4l4lvicmsy8.R.inc(1523);if ((((min != null)&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1524)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1525)==0&false))) {{
            __CLR4_5_2l4l4lvicmsy8.R.inc(1526);ex = fac.getOWLObjectMinCardinality(min, pe, ce);
        } }else {__CLR4_5_2l4l4lvicmsy8.R.inc(1527);if ((((max != null)&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1528)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1529)==0&false))) {{
            __CLR4_5_2l4l4lvicmsy8.R.inc(1530);ex = fac.getOWLObjectMaxCardinality(max, pe, ce);
        } }else {__CLR4_5_2l4l4lvicmsy8.R.inc(1531);if ((((allSome && allOnly)&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1532)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1533)==0&false))) {{
            __CLR4_5_2l4l4lvicmsy8.R.inc(1534);ex = fac.getOWLObjectIntersectionOf(fac.getOWLObjectSomeValuesFrom(pe, ce), fac.getOWLObjectAllValuesFrom(
                pe, ce));
        } }else {__CLR4_5_2l4l4lvicmsy8.R.inc(1535);if ((((allOnly)&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1536)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1537)==0&false))) {{
            __CLR4_5_2l4l4lvicmsy8.R.inc(1538);ex = fac.getOWLObjectAllValuesFrom(pe, ce);
        } }else {__CLR4_5_2l4l4lvicmsy8.R.inc(1539);if ((((relFrame != null && Boolean.TRUE.equals(relFrame.getTagValue(OboFormatTag.TAG_IS_CLASS_LEVEL_TAG)))&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1540)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1541)==0&false))) {{
            // pun
            __CLR4_5_2l4l4lvicmsy8.R.inc(1542);ex = fac.getOWLObjectHasValue(pe, trIndividual(classId));
        } }else {{
            // default
            __CLR4_5_2l4l4lvicmsy8.R.inc(1543);ex = fac.getOWLObjectSomeValuesFrom(pe, ce);
        }
        }}}}}}}}__CLR4_5_2l4l4lvicmsy8.R.inc(1544);return ex;
    }finally{__CLR4_5_2l4l4lvicmsy8.R.flushNeeded();}}

    /**
     * Gets the qV string.
     * 
     * @param q
     *        the q
     * @param quals
     *        the quals
     * @return the qV string
     */
    @Nullable
    protected static String getQVString(String q, @Nonnull Collection<QualifierValue> quals) {try{__CLR4_5_2l4l4lvicmsy8.R.inc(1545);
        __CLR4_5_2l4l4lvicmsy8.R.inc(1546);for (QualifierValue qv : quals) {{
            __CLR4_5_2l4l4lvicmsy8.R.inc(1547);if ((((qv.getQualifier().equals(q))&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1548)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1549)==0&false))) {{
                __CLR4_5_2l4l4lvicmsy8.R.inc(1550);return qv.getValue();
            }
        }}
        }__CLR4_5_2l4l4lvicmsy8.R.inc(1551);return null;
    }finally{__CLR4_5_2l4l4lvicmsy8.R.flushNeeded();}}

    /**
     * Gets the qV boolean.
     * 
     * @param q
     *        the q
     * @param quals
     *        the quals
     * @return the qV boolean
     */
    protected static boolean getQVBoolean(String q, @Nonnull Collection<QualifierValue> quals) {try{__CLR4_5_2l4l4lvicmsy8.R.inc(1552);
        __CLR4_5_2l4l4lvicmsy8.R.inc(1553);for (QualifierValue qv : quals) {{
            __CLR4_5_2l4l4lvicmsy8.R.inc(1554);if ((((qv.getQualifier().equals(q))&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1555)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1556)==0&false))) {{
                __CLR4_5_2l4l4lvicmsy8.R.inc(1557);Object v = qv.getValue();
                __CLR4_5_2l4l4lvicmsy8.R.inc(1558);return Boolean.parseBoolean((String) v);
            }
        }}
        }__CLR4_5_2l4l4lvicmsy8.R.inc(1559);return false;
    }finally{__CLR4_5_2l4l4lvicmsy8.R.flushNeeded();}}

    /**
     * Gets the qV int.
     * 
     * @param q
     *        the q
     * @param quals
     *        the quals
     * @return the qV int
     */
    @Nullable
    protected static Integer getQVInt(String q, @Nonnull Collection<QualifierValue> quals) {try{__CLR4_5_2l4l4lvicmsy8.R.inc(1560);
        __CLR4_5_2l4l4lvicmsy8.R.inc(1561);for (QualifierValue qv : quals) {{
            __CLR4_5_2l4l4lvicmsy8.R.inc(1562);if ((((qv.getQualifier().equals(q))&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1563)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1564)==0&false))) {{
                __CLR4_5_2l4l4lvicmsy8.R.inc(1565);Object v = qv.getValue();
                __CLR4_5_2l4l4lvicmsy8.R.inc(1566);return Integer.valueOf((String) v);
            }
        }}
        }__CLR4_5_2l4l4lvicmsy8.R.inc(1567);return null;
    }finally{__CLR4_5_2l4l4lvicmsy8.R.flushNeeded();}}

    /**
     * Tr class.
     * 
     * @param classId
     *        the class id
     * @return the oWL class
     */
    protected OWLClass trClass(@Nonnull String classId) {try{__CLR4_5_2l4l4lvicmsy8.R.inc(1568);
        __CLR4_5_2l4l4lvicmsy8.R.inc(1569);IRI iri = oboIdToIRI(classId);
        __CLR4_5_2l4l4lvicmsy8.R.inc(1570);return fac.getOWLClass(iri);
    }finally{__CLR4_5_2l4l4lvicmsy8.R.flushNeeded();}}

    /**
     * Tr class.
     * 
     * @param v
     *        the v
     * @return the oWL class expression
     */
    protected OWLClassExpression trClass(@Nonnull Object v) {try{__CLR4_5_2l4l4lvicmsy8.R.inc(1571);
        __CLR4_5_2l4l4lvicmsy8.R.inc(1572);return trClass((String) v);
    }finally{__CLR4_5_2l4l4lvicmsy8.R.flushNeeded();}}

    /**
     * See section "header macros" and treat-xrefs-as-equivalent.
     * 
     * @param id
     *        the id
     * @return mapped id
     */
    @Nonnull
    protected String mapPropId(@Nonnull String id) {try{__CLR4_5_2l4l4lvicmsy8.R.inc(1573);
        __CLR4_5_2l4l4lvicmsy8.R.inc(1574);Frame f = obodoc.getTypedefFrame(id);
        __CLR4_5_2l4l4lvicmsy8.R.inc(1575);if ((((f != null)&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1576)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1577)==0&false))) {{
            __CLR4_5_2l4l4lvicmsy8.R.inc(1578);Collection<Xref> xrefs = f.getTagValues(OboFormatTag.TAG_XREF, Xref.class);
            __CLR4_5_2l4l4lvicmsy8.R.inc(1579);for (Xref x : xrefs) {{
                __CLR4_5_2l4l4lvicmsy8.R.inc(1580);String xid = x.getIdref();
                __CLR4_5_2l4l4lvicmsy8.R.inc(1581);if ((((OBODoc.isTreatXrefsAsEquivalent(getIdPrefix(xid)))&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1582)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1583)==0&false))) {{
                    __CLR4_5_2l4l4lvicmsy8.R.inc(1584);return xid;
                }
            }}
        }}
        }__CLR4_5_2l4l4lvicmsy8.R.inc(1585);return id;
    }finally{__CLR4_5_2l4l4lvicmsy8.R.flushNeeded();}}

    /**
     * Gets the id prefix.
     * 
     * @param x
     *        the x
     * @return the id prefix
     */
    protected static String getIdPrefix(@Nonnull String x) {try{__CLR4_5_2l4l4lvicmsy8.R.inc(1586);
        __CLR4_5_2l4l4lvicmsy8.R.inc(1587);String[] parts = x.split(":", 2);
        __CLR4_5_2l4l4lvicmsy8.R.inc(1588);return parts[0];
    }finally{__CLR4_5_2l4l4lvicmsy8.R.flushNeeded();}}

    /**
     * Tr individual.
     * 
     * @param instId
     *        the inst id
     * @return the oWL individual
     */
    @Nonnull
    protected OWLIndividual trIndividual(@Nonnull String instId) {try{__CLR4_5_2l4l4lvicmsy8.R.inc(1589);
        __CLR4_5_2l4l4lvicmsy8.R.inc(1590);IRI iri = oboIdToIRI(instId);
        __CLR4_5_2l4l4lvicmsy8.R.inc(1591);return fac.getOWLNamedIndividual(iri);
    }finally{__CLR4_5_2l4l4lvicmsy8.R.flushNeeded();}}

    /**
     * Tr tag to iri.
     * 
     * @param tag
     *        the tag
     * @return the iri
     */
    @Nonnull
    public static IRI trTagToIRI(String tag) {try{__CLR4_5_2l4l4lvicmsy8.R.inc(1592);
        __CLR4_5_2l4l4lvicmsy8.R.inc(1593);IRI iri = ANNOTATIONPROPERTYMAP.get(tag);
        __CLR4_5_2l4l4lvicmsy8.R.inc(1594);if ((((iri == null)&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1595)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1596)==0&false))) {{
            __CLR4_5_2l4l4lvicmsy8.R.inc(1597);iri = IRI.create(Obo2OWLConstants.OIOVOCAB_IRI_PREFIX + tag);
        }
        }__CLR4_5_2l4l4lvicmsy8.R.inc(1598);return iri;
    }finally{__CLR4_5_2l4l4lvicmsy8.R.flushNeeded();}}

    /**
     * Tr tag to annotation prop.
     * 
     * @param tag
     *        the tag
     * @return the oWL annotation property
     */
    @Nonnull
    protected OWLAnnotationProperty trTagToAnnotationProp(@Nonnull String tag) {try{__CLR4_5_2l4l4lvicmsy8.R.inc(1599);
        __CLR4_5_2l4l4lvicmsy8.R.inc(1600);IRI iri = trTagToIRI(tag);
        __CLR4_5_2l4l4lvicmsy8.R.inc(1601);OWLAnnotationProperty ap = fac.getOWLAnnotationProperty(iri);
        __CLR4_5_2l4l4lvicmsy8.R.inc(1602);if ((((!apToDeclare.contains(ap))&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1603)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1604)==0&false))) {{
            __CLR4_5_2l4l4lvicmsy8.R.inc(1605);apToDeclare.add(ap);
            __CLR4_5_2l4l4lvicmsy8.R.inc(1606);add(fac.getOWLDeclarationAxiom(ap));
            __CLR4_5_2l4l4lvicmsy8.R.inc(1607);Obo2OWLVocabulary vocab = Obo2OWLConstants.getVocabularyObj(tag);
            __CLR4_5_2l4l4lvicmsy8.R.inc(1608);if ((((vocab != null)&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1609)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1610)==0&false))) {{
                __CLR4_5_2l4l4lvicmsy8.R.inc(1611);add(fac.getOWLAnnotationAssertionAxiom(fac.getRDFSLabel(), iri, trLiteral(vocab.getLabel())));
            }
        }}
        }__CLR4_5_2l4l4lvicmsy8.R.inc(1612);return ap;
    }finally{__CLR4_5_2l4l4lvicmsy8.R.flushNeeded();}}

    /**
     * Adds the declared annotation properties.
     * 
     * @param declaredProperties
     *        the declared properties
     */
    protected void addDeclaredAnnotationProperties(@Nullable Collection<OWLAnnotationProperty> declaredProperties) {try{__CLR4_5_2l4l4lvicmsy8.R.inc(1613);
        __CLR4_5_2l4l4lvicmsy8.R.inc(1614);if ((((declaredProperties != null)&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1615)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1616)==0&false))) {{
            __CLR4_5_2l4l4lvicmsy8.R.inc(1617);apToDeclare.addAll(declaredProperties);
        }
    }}finally{__CLR4_5_2l4l4lvicmsy8.R.flushNeeded();}}

    /**
     * Tr annotation prop.
     * 
     * @param relId
     *        the rel id
     * @return the oWL annotation property
     */
    @Nonnull
    protected OWLAnnotationProperty trAnnotationProp(@Nonnull String relId) {try{__CLR4_5_2l4l4lvicmsy8.R.inc(1618);
        __CLR4_5_2l4l4lvicmsy8.R.inc(1619);IRI iri = oboIdToIRI(mapPropId(relId));
        __CLR4_5_2l4l4lvicmsy8.R.inc(1620);return fac.getOWLAnnotationProperty(iri);
    }finally{__CLR4_5_2l4l4lvicmsy8.R.flushNeeded();}}

    /**
     * Tr object prop.
     * 
     * @param relId
     *        the rel id
     * @return the oWL object property
     */
    @Nonnull
    protected OWLObjectProperty trObjectProp(@Nonnull String relId) {try{__CLR4_5_2l4l4lvicmsy8.R.inc(1621);
        __CLR4_5_2l4l4lvicmsy8.R.inc(1622);IRI iri = oboIdToIRI(mapPropId(relId));
        __CLR4_5_2l4l4lvicmsy8.R.inc(1623);return fac.getOWLObjectProperty(iri);
    }finally{__CLR4_5_2l4l4lvicmsy8.R.flushNeeded();}}

    /**
     * Tr object prop.
     * 
     * @param v
     *        the v
     * @return the oWL object property expression
     */
    @Nonnull
    protected OWLObjectPropertyExpression trObjectProp(@Nonnull Object v) {try{__CLR4_5_2l4l4lvicmsy8.R.inc(1624);
        __CLR4_5_2l4l4lvicmsy8.R.inc(1625);IRI iri = oboIdToIRI(mapPropId((String) v));
        __CLR4_5_2l4l4lvicmsy8.R.inc(1626);return fac.getOWLObjectProperty(iri);
    }finally{__CLR4_5_2l4l4lvicmsy8.R.flushNeeded();}}

    /**
     * Tr literal.
     * 
     * @param inputValue
     *        the value
     * @return the oWL annotation value
     */
    @Nonnull
    protected OWLAnnotationValue trLiteral(@Nonnull Object inputValue) {try{__CLR4_5_2l4l4lvicmsy8.R.inc(1627);
        __CLR4_5_2l4l4lvicmsy8.R.inc(1628);Object value = inputValue;
        __CLR4_5_2l4l4lvicmsy8.R.inc(1629);if ((((value instanceof Xref)&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1630)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1631)==0&false))) {{
            __CLR4_5_2l4l4lvicmsy8.R.inc(1632);value = ((Xref) value).getIdref();
        } }else {__CLR4_5_2l4l4lvicmsy8.R.inc(1633);if ((((value instanceof Date)&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1634)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1635)==0&false))) {{
            // use proper OWL2 data type, write lexical value as ISO 8601 date
            // string
            __CLR4_5_2l4l4lvicmsy8.R.inc(1636);String lexicalValue = Obo2OWLConstants.format((Date) value);
            __CLR4_5_2l4l4lvicmsy8.R.inc(1637);return fac.getOWLLiteral(lexicalValue, OWL2Datatype.XSD_DATE_TIME);
        } }else {__CLR4_5_2l4l4lvicmsy8.R.inc(1638);if ((((value instanceof Boolean)&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1639)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1640)==0&false))) {{
            __CLR4_5_2l4l4lvicmsy8.R.inc(1641);return fac.getOWLLiteral((Boolean) value);
        } }else {__CLR4_5_2l4l4lvicmsy8.R.inc(1642);if ((((!(value instanceof String))&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1643)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1644)==0&false))) {{
            // TODO
            // e.g. boolean
            __CLR4_5_2l4l4lvicmsy8.R.inc(1645);value = value.toString();
        }
        }}}}__CLR4_5_2l4l4lvicmsy8.R.inc(1646);String value2 = (String) value;
        assert (((value2 != null)&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1647)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1648)==0&false));
        __CLR4_5_2l4l4lvicmsy8.R.inc(1649);return fac.getOWLLiteral(value2);// TODO
    }finally{__CLR4_5_2l4l4lvicmsy8.R.flushNeeded();}}

    /**
     * Obo id to iri.
     * 
     * @param id
     *        the id
     * @return the iri
     */
    @Nonnull
    public IRI oboIdToIRI(@Nonnull String id) {try{__CLR4_5_2l4l4lvicmsy8.R.inc(1650);
        __CLR4_5_2l4l4lvicmsy8.R.inc(1651);try {
            __CLR4_5_2l4l4lvicmsy8.R.inc(1652);return idToIRICache.get(id);
        } catch (ExecutionException | UncheckedExecutionException e) {
            __CLR4_5_2l4l4lvicmsy8.R.inc(1653);if ((((e.getCause() instanceof OWLParserException)&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1654)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1655)==0&false))) {{
                __CLR4_5_2l4l4lvicmsy8.R.inc(1656);throw (OWLParserException) e.getCause();
            }
            }__CLR4_5_2l4l4lvicmsy8.R.inc(1657);LOG.error("error executing obo id to IRI", e);
            __CLR4_5_2l4l4lvicmsy8.R.inc(1658);return oboIdToIRI_load(id);
        }
    }finally{__CLR4_5_2l4l4lvicmsy8.R.flushNeeded();}}

    /**
     * Obo id to iri.
     * 
     * @param id
     *        the id
     * @return the iri
     */
    @Nonnull
    public IRI oboIdToIRI_load(@Nonnull String id) {try{__CLR4_5_2l4l4lvicmsy8.R.inc(1659);
        __CLR4_5_2l4l4lvicmsy8.R.inc(1660);if ((((id.contains(" "))&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1661)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1662)==0&false))) {{
            __CLR4_5_2l4l4lvicmsy8.R.inc(1663);LOG.error("id contains space: \"{}\"", id);
            __CLR4_5_2l4l4lvicmsy8.R.inc(1664);throw new OWLParserException("spaces not allowed: '" + id + '\'');
        }
        // No conversion is required if this is already an IRI (ID-as-URI rule)
        }__CLR4_5_2l4l4lvicmsy8.R.inc(1665);if ((((id.startsWith("http:"))&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1666)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1667)==0&false))) {{
            // TODO - roundtrip from other schemes
            __CLR4_5_2l4l4lvicmsy8.R.inc(1668);return IRI.create(id);
        } }else {__CLR4_5_2l4l4lvicmsy8.R.inc(1669);if ((((id.startsWith("https:"))&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1670)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1671)==0&false))) {{
            // TODO - roundtrip from other schemes
            __CLR4_5_2l4l4lvicmsy8.R.inc(1672);return IRI.create(id);
        } }else {__CLR4_5_2l4l4lvicmsy8.R.inc(1673);if ((((id.startsWith("ftp:"))&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1674)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1675)==0&false))) {{
            // TODO - roundtrip from other schemes
            __CLR4_5_2l4l4lvicmsy8.R.inc(1676);return IRI.create(id);
        } }else {__CLR4_5_2l4l4lvicmsy8.R.inc(1677);if ((((id.startsWith("urn:"))&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1678)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1679)==0&false))) {{
            // TODO - roundtrip from other schemes
            __CLR4_5_2l4l4lvicmsy8.R.inc(1680);return IRI.create(id);
        }
        // TODO - treat_xrefs_as_equivalent
        // special case rule for relation xrefs:
        // 5.9.3. Special Rules for Relations
        }}}}__CLR4_5_2l4l4lvicmsy8.R.inc(1681);if ((((!id.contains(":"))&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1682)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1683)==0&false))) {{
            __CLR4_5_2l4l4lvicmsy8.R.inc(1684);String xid = translateShorthandIdToExpandedId(id);
            __CLR4_5_2l4l4lvicmsy8.R.inc(1685);if ((((!xid.equals(id))&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1686)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1687)==0&false))) {{
                __CLR4_5_2l4l4lvicmsy8.R.inc(1688);return oboIdToIRI(xid);
            }
        }}
        }__CLR4_5_2l4l4lvicmsy8.R.inc(1689);String[] idParts = id.split(":", 2);
        __CLR4_5_2l4l4lvicmsy8.R.inc(1690);String db;
        __CLR4_5_2l4l4lvicmsy8.R.inc(1691);String localId;
        __CLR4_5_2l4l4lvicmsy8.R.inc(1692);if ((((idParts.length > 1)&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1693)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1694)==0&false))) {{
            __CLR4_5_2l4l4lvicmsy8.R.inc(1695);db = idParts[0];
            __CLR4_5_2l4l4lvicmsy8.R.inc(1696);localId = idParts[1];
            __CLR4_5_2l4l4lvicmsy8.R.inc(1697);if ((((localId.contains("_"))&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1698)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1699)==0&false))) {{
                __CLR4_5_2l4l4lvicmsy8.R.inc(1700);db += "#_";// NonCanonical-Prefixed-ID
            } }else {{
                __CLR4_5_2l4l4lvicmsy8.R.inc(1701);db += "_";
            }
        }} }else {__CLR4_5_2l4l4lvicmsy8.R.inc(1702);if ((((idParts.length == 0)&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1703)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1704)==0&false))) {{
            __CLR4_5_2l4l4lvicmsy8.R.inc(1705);db = getDefaultIDSpace() + '#';
            __CLR4_5_2l4l4lvicmsy8.R.inc(1706);localId = id;
        } }else {{// == 1
                // todo use owlOntology IRI
            __CLR4_5_2l4l4lvicmsy8.R.inc(1707);db = getDefaultIDSpace() + '#';
            // if(id.contains("_"))
            // db += "_";
            __CLR4_5_2l4l4lvicmsy8.R.inc(1708);localId = idParts[0];// Unprefixed-ID
        }
        }}__CLR4_5_2l4l4lvicmsy8.R.inc(1709);String uriPrefix = DEFAULT_IRI_PREFIX + db;
        __CLR4_5_2l4l4lvicmsy8.R.inc(1710);if ((((idSpaceMap.containsKey(db))&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1711)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1712)==0&false))) {{
            __CLR4_5_2l4l4lvicmsy8.R.inc(1713);uriPrefix = idSpaceMap.get(db);
        }
        }__CLR4_5_2l4l4lvicmsy8.R.inc(1714);String safeId;
        __CLR4_5_2l4l4lvicmsy8.R.inc(1715);try {
            __CLR4_5_2l4l4lvicmsy8.R.inc(1716);safeId = java.net.URLEncoder.encode(localId, "US-ASCII");
        } catch (UnsupportedEncodingException e1) {
            __CLR4_5_2l4l4lvicmsy8.R.inc(1717);throw new OWLRuntimeException(e1);
        }
        __CLR4_5_2l4l4lvicmsy8.R.inc(1718);if ((((safeId.contains(" "))&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1719)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1720)==0&false))) {{
            __CLR4_5_2l4l4lvicmsy8.R.inc(1721);safeId = safeId.replace(" ", "_");
        }
        }__CLR4_5_2l4l4lvicmsy8.R.inc(1722);IRI iri = null;
        __CLR4_5_2l4l4lvicmsy8.R.inc(1723);try {
            __CLR4_5_2l4l4lvicmsy8.R.inc(1724);iri = IRI.create(uriPrefix + safeId);
        } catch (IllegalArgumentException e) {
            __CLR4_5_2l4l4lvicmsy8.R.inc(1725);throw new OWLRuntimeException(e);
        }
        __CLR4_5_2l4l4lvicmsy8.R.inc(1726);return iri;
    }finally{__CLR4_5_2l4l4lvicmsy8.R.flushNeeded();}}

    // 5.9.3. Special Rules for Relations
    /**
     * Translate shorthand id to expanded id.
     * 
     * @param id
     *        the id
     * @return the string
     */
    @Nonnull
    protected String translateShorthandIdToExpandedId(@Nonnull String id) {try{__CLR4_5_2l4l4lvicmsy8.R.inc(1727);
        __CLR4_5_2l4l4lvicmsy8.R.inc(1728);if ((((id.contains(":"))&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1729)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1730)==0&false))) {{
            __CLR4_5_2l4l4lvicmsy8.R.inc(1731);return id;
        }
        }__CLR4_5_2l4l4lvicmsy8.R.inc(1732);Frame tdf = obodoc.getTypedefFrame(id);
        __CLR4_5_2l4l4lvicmsy8.R.inc(1733);if ((((tdf == null)&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1734)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1735)==0&false))) {{
            __CLR4_5_2l4l4lvicmsy8.R.inc(1736);return id;
        }
        }__CLR4_5_2l4l4lvicmsy8.R.inc(1737);Collection<Xref> xrefs = tdf.getTagValues(OboFormatTag.TAG_XREF, Xref.class);
        __CLR4_5_2l4l4lvicmsy8.R.inc(1738);String matchingExpandedId = null;
        __CLR4_5_2l4l4lvicmsy8.R.inc(1739);for (Xref xref : xrefs) {{
            // System.err.println("ID:"+id+" xref:"+xref);
            __CLR4_5_2l4l4lvicmsy8.R.inc(1740);if ((((xref != null)&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1741)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1742)==0&false))) {{
                __CLR4_5_2l4l4lvicmsy8.R.inc(1743);String xid = xref.getIdref();
                // System.err.println(" ID:"+id+" xid:"+xid);
                __CLR4_5_2l4l4lvicmsy8.R.inc(1744);if ((((xid.equals(id))&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1745)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1746)==0&false))) {{
                    __CLR4_5_2l4l4lvicmsy8.R.inc(1747);continue;
                }
                }__CLR4_5_2l4l4lvicmsy8.R.inc(1748);if ((((matchingExpandedId == null)&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1749)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1750)==0&false))) {{
                    __CLR4_5_2l4l4lvicmsy8.R.inc(1751);matchingExpandedId = xid;
                } }else {{
                    // RO and BFO take precedence over others
                    __CLR4_5_2l4l4lvicmsy8.R.inc(1752);if ((((xid.startsWith("RO") || xid.startsWith("BFO"))&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1753)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1754)==0&false))) {{
                        __CLR4_5_2l4l4lvicmsy8.R.inc(1755);matchingExpandedId = xid;
                    }
                }}
            }}
        }}
        }__CLR4_5_2l4l4lvicmsy8.R.inc(1756);if ((((matchingExpandedId == null)&&(__CLR4_5_2l4l4lvicmsy8.R.iget(1757)!=0|true))||(__CLR4_5_2l4l4lvicmsy8.R.iget(1758)==0&false))) {{
            __CLR4_5_2l4l4lvicmsy8.R.inc(1759);return id;
        }
        // System.err.println(" ID:"+id+" matching:"+matchingExpandedId);
        }__CLR4_5_2l4l4lvicmsy8.R.inc(1760);return matchingExpandedId;
    }finally{__CLR4_5_2l4l4lvicmsy8.R.flushNeeded();}}

    /**
     * Gets the default id space.
     * 
     * @return the default id space
     */
    @Nonnull
    protected String getDefaultIDSpace() {try{__CLR4_5_2l4l4lvicmsy8.R.inc(1761);
        __CLR4_5_2l4l4lvicmsy8.R.inc(1762);return defaultIDSpace;
    }finally{__CLR4_5_2l4l4lvicmsy8.R.flushNeeded();}}
}
