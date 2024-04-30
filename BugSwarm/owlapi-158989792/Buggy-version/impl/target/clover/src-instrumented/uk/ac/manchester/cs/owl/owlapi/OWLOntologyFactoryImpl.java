/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package uk.ac.manchester.cs.owl.owlapi;

import static org.semanticweb.owlapi.util.OWLAPIPreconditions.verifyNotNull;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import javax.annotation.Nonnull;
import javax.inject.Inject;

import org.semanticweb.owlapi.formats.RDFXMLDocumentFormat;
import org.semanticweb.owlapi.io.*;
import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.util.PriorityCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.collect.Sets;

/**
 * Matthew Horridge Stanford Center for Biomedical Informatics Research 10/04/15
 */
public class OWLOntologyFactoryImpl implements OWLOntologyFactory {public static class __CLR4_5_27ly7lylviclgfz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u006d\u0070\u006c\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237243416L,8589935092L,9971,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 40000L;
    private static final Logger LOGGER = LoggerFactory.getLogger(OWLOntologyFactoryImpl.class);
    private final Set<String> parsableSchemes = new HashSet<>(Arrays.asList("http", "https", "file", "ftp"));
    private final OWLOntologyBuilder ontologyBuilder;

    @Inject
    public OWLOntologyFactoryImpl(OWLOntologyBuilder ontologyBuilder) {try{__CLR4_5_27ly7lylviclgfz.R.inc(9862);
        __CLR4_5_27ly7lylviclgfz.R.inc(9863);this.ontologyBuilder = verifyNotNull(ontologyBuilder);
    }finally{__CLR4_5_27ly7lylviclgfz.R.flushNeeded();}}

    @Override
    public boolean canCreateFromDocumentIRI(@Nonnull IRI documentIRI) {try{__CLR4_5_27ly7lylviclgfz.R.inc(9864);
        __CLR4_5_27ly7lylviclgfz.R.inc(9865);return true;
    }finally{__CLR4_5_27ly7lylviclgfz.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLOntology createOWLOntology(@Nonnull OWLOntologyManager manager, @Nonnull OWLOntologyID ontologyID,
        @Nonnull IRI documentIRI, @Nonnull OWLOntologyCreationHandler handler) throws OWLOntologyCreationException {try{__CLR4_5_27ly7lylviclgfz.R.inc(9866);
        __CLR4_5_27ly7lylviclgfz.R.inc(9867);OWLOntology ont = ontologyBuilder.createOWLOntology(manager, ontologyID);
        __CLR4_5_27ly7lylviclgfz.R.inc(9868);handler.ontologyCreated(ont);
        __CLR4_5_27ly7lylviclgfz.R.inc(9869);handler.setOntologyFormat(ont, new RDFXMLDocumentFormat());
        __CLR4_5_27ly7lylviclgfz.R.inc(9870);return ont;
    }finally{__CLR4_5_27ly7lylviclgfz.R.flushNeeded();}}

    /**
     * Select parsers by MIME type and format of the input source, if known. If
     * format and MIME type are not known or not matched by any parser, return
     * all known parsers.
     * 
     * @param documentSource
     *        document source
     * @param parsers
     *        parsers
     * @return selected parsers
     */
    private static PriorityCollection<OWLParserFactory> getParsers(OWLOntologyDocumentSource documentSource,
        PriorityCollection<OWLParserFactory> parsers) {try{__CLR4_5_27ly7lylviclgfz.R.inc(9871);
        __CLR4_5_27ly7lylviclgfz.R.inc(9872);if ((((parsers.isEmpty())&&(__CLR4_5_27ly7lylviclgfz.R.iget(9873)!=0|true))||(__CLR4_5_27ly7lylviclgfz.R.iget(9874)==0&false))) {{
            __CLR4_5_27ly7lylviclgfz.R.inc(9875);return parsers;
        }
        }__CLR4_5_27ly7lylviclgfz.R.inc(9876);if ((((!documentSource.isFormatKnown() && !documentSource.isMIMETypeKnown())&&(__CLR4_5_27ly7lylviclgfz.R.iget(9877)!=0|true))||(__CLR4_5_27ly7lylviclgfz.R.iget(9878)==0&false))) {{
            __CLR4_5_27ly7lylviclgfz.R.inc(9879);return parsers;
        }
        }__CLR4_5_27ly7lylviclgfz.R.inc(9880);PriorityCollection<OWLParserFactory> candidateParsers = parsers;
        __CLR4_5_27ly7lylviclgfz.R.inc(9881);if ((((documentSource.isFormatKnown())&&(__CLR4_5_27ly7lylviclgfz.R.iget(9882)!=0|true))||(__CLR4_5_27ly7lylviclgfz.R.iget(9883)==0&false))) {{
            __CLR4_5_27ly7lylviclgfz.R.inc(9884);OWLDocumentFormat format = documentSource.getFormat();
            assert (((format != null)&&(__CLR4_5_27ly7lylviclgfz.R.iget(9885)!=0|true))||(__CLR4_5_27ly7lylviclgfz.R.iget(9886)==0&false));
            __CLR4_5_27ly7lylviclgfz.R.inc(9887);candidateParsers = getParsersByFormat(format, parsers);
        }
        }__CLR4_5_27ly7lylviclgfz.R.inc(9888);if ((((candidateParsers.isEmpty() && documentSource.isMIMETypeKnown())&&(__CLR4_5_27ly7lylviclgfz.R.iget(9889)!=0|true))||(__CLR4_5_27ly7lylviclgfz.R.iget(9890)==0&false))) {{
            __CLR4_5_27ly7lylviclgfz.R.inc(9891);String mimeType = documentSource.getMIMEType();
            assert (((mimeType != null)&&(__CLR4_5_27ly7lylviclgfz.R.iget(9892)!=0|true))||(__CLR4_5_27ly7lylviclgfz.R.iget(9893)==0&false));
            __CLR4_5_27ly7lylviclgfz.R.inc(9894);candidateParsers = getParserCandidatesByMIME(mimeType, parsers);
        }
        }__CLR4_5_27ly7lylviclgfz.R.inc(9895);if ((((candidateParsers.isEmpty())&&(__CLR4_5_27ly7lylviclgfz.R.iget(9896)!=0|true))||(__CLR4_5_27ly7lylviclgfz.R.iget(9897)==0&false))) {{
            __CLR4_5_27ly7lylviclgfz.R.inc(9898);return parsers;
        }
        }__CLR4_5_27ly7lylviclgfz.R.inc(9899);return candidateParsers;
    }finally{__CLR4_5_27ly7lylviclgfz.R.flushNeeded();}}

    /**
     * Use the format to select a sublist of parsers.
     * 
     * @param format
     *        document format
     * @param parsers
     *        parsers
     * @return candidate parsers
     */
    private static PriorityCollection<OWLParserFactory> getParsersByFormat(@Nonnull OWLDocumentFormat format,
        PriorityCollection<OWLParserFactory> parsers) {try{__CLR4_5_27ly7lylviclgfz.R.inc(9900);
        __CLR4_5_27ly7lylviclgfz.R.inc(9901);PriorityCollection<OWLParserFactory> candidateParsers = new PriorityCollection<>(
            PriorityCollectionSorting.NEVER);
        __CLR4_5_27ly7lylviclgfz.R.inc(9902);for (OWLParserFactory parser : parsers) {{
            __CLR4_5_27ly7lylviclgfz.R.inc(9903);if ((((parser.getSupportedFormat().getKey().equals(format.getKey()))&&(__CLR4_5_27ly7lylviclgfz.R.iget(9904)!=0|true))||(__CLR4_5_27ly7lylviclgfz.R.iget(9905)==0&false))) {{
                __CLR4_5_27ly7lylviclgfz.R.inc(9906);candidateParsers.add(parser);
            }
        }}
        }__CLR4_5_27ly7lylviclgfz.R.inc(9907);return candidateParsers;
    }finally{__CLR4_5_27ly7lylviclgfz.R.flushNeeded();}}

    /**
     * Use the MIME type it to select a sublist of parsers.
     * 
     * @param mimeType
     *        MIME type
     * @param parsers
     *        parsers
     * @return candidate parsers
     */
    private static PriorityCollection<OWLParserFactory> getParserCandidatesByMIME(@Nonnull String mimeType,
        PriorityCollection<OWLParserFactory> parsers) {try{__CLR4_5_27ly7lylviclgfz.R.inc(9908);
        __CLR4_5_27ly7lylviclgfz.R.inc(9909);return parsers.getByMIMEType(mimeType);
    }finally{__CLR4_5_27ly7lylviclgfz.R.flushNeeded();}}

    @Override
    public boolean canLoad(@Nonnull OWLOntologyDocumentSource documentSource) {try{__CLR4_5_27ly7lylviclgfz.R.inc(9910);
        __CLR4_5_27ly7lylviclgfz.R.inc(9911);if ((((documentSource.isReaderAvailable())&&(__CLR4_5_27ly7lylviclgfz.R.iget(9912)!=0|true))||(__CLR4_5_27ly7lylviclgfz.R.iget(9913)==0&false))) {{
            __CLR4_5_27ly7lylviclgfz.R.inc(9914);return true;
        }
        }__CLR4_5_27ly7lylviclgfz.R.inc(9915);if ((((documentSource.isInputStreamAvailable())&&(__CLR4_5_27ly7lylviclgfz.R.iget(9916)!=0|true))||(__CLR4_5_27ly7lylviclgfz.R.iget(9917)==0&false))) {{
            __CLR4_5_27ly7lylviclgfz.R.inc(9918);return true;
        }
        }__CLR4_5_27ly7lylviclgfz.R.inc(9919);if ((((parsableSchemes.contains(documentSource.getDocumentIRI().getScheme()))&&(__CLR4_5_27ly7lylviclgfz.R.iget(9920)!=0|true))||(__CLR4_5_27ly7lylviclgfz.R.iget(9921)==0&false))) {{
            __CLR4_5_27ly7lylviclgfz.R.inc(9922);return true;
        }
        // If we can open an input stream then we can attempt to parse the
        // ontology
        // TODO: Take into consideration the request type!
        }__CLR4_5_27ly7lylviclgfz.R.inc(9923);try {
            __CLR4_5_27ly7lylviclgfz.R.inc(9924);documentSource.getDocumentIRI().toURI().toURL().openConnection();
            __CLR4_5_27ly7lylviclgfz.R.inc(9925);return true;
        } catch (IllegalArgumentException e) {
            __CLR4_5_27ly7lylviclgfz.R.inc(9926);LOGGER.info("Illegal argument: {}", documentSource.getDocumentIRI(), e);
        } catch (UnknownHostException e) {
            __CLR4_5_27ly7lylviclgfz.R.inc(9927);LOGGER.info("Unknown host: {}", e.getMessage(), e);
        } catch (MalformedURLException e) {
            __CLR4_5_27ly7lylviclgfz.R.inc(9928);LOGGER.info("Malformed URL: {}", e.getMessage(), e);
        } catch (FileNotFoundException e) {
            __CLR4_5_27ly7lylviclgfz.R.inc(9929);LOGGER.info("File not found: {}", e.getMessage(), e);
        } catch (IOException e) {
            __CLR4_5_27ly7lylviclgfz.R.inc(9930);LOGGER.info("IO Exception: {}", e.getMessage(), e);
        }
        __CLR4_5_27ly7lylviclgfz.R.inc(9931);return false;
    }finally{__CLR4_5_27ly7lylviclgfz.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLOntology loadOWLOntology(@Nonnull OWLOntologyManager manager,
        @Nonnull OWLOntologyDocumentSource documentSource, @Nonnull OWLOntologyCreationHandler handler,
        @Nonnull OWLOntologyLoaderConfiguration configuration) throws OWLOntologyCreationException {try{__CLR4_5_27ly7lylviclgfz.R.inc(9932);
        // Attempt to parse the ontology by looping through the parsers. If the
        // ontology is parsed successfully then we break out and return the
        // ontology.
        // I think that this is more reliable than selecting a parser based on a
        // file extension
        // for example (perhaps the parser list could be ordered based on most
        // likely parser, which
        // could be determined by file extension).
        __CLR4_5_27ly7lylviclgfz.R.inc(9933);Map<OWLParser, OWLParserException> exceptions = new LinkedHashMap<>();
        // Call the super method to create the ontology - this is needed,
        // because
        // we throw an exception if someone tries to create an ontology directly
        __CLR4_5_27ly7lylviclgfz.R.inc(9934);OWLOntology existingOntology = null;
        __CLR4_5_27ly7lylviclgfz.R.inc(9935);IRI iri = documentSource.getDocumentIRI();
        __CLR4_5_27ly7lylviclgfz.R.inc(9936);if ((((manager.contains(iri))&&(__CLR4_5_27ly7lylviclgfz.R.iget(9937)!=0|true))||(__CLR4_5_27ly7lylviclgfz.R.iget(9938)==0&false))) {{
            __CLR4_5_27ly7lylviclgfz.R.inc(9939);existingOntology = manager.getOntology(iri);
        }
        }__CLR4_5_27ly7lylviclgfz.R.inc(9940);OWLOntologyID ontologyID = new OWLOntologyID();
        __CLR4_5_27ly7lylviclgfz.R.inc(9941);OWLOntology ont = createOWLOntology(manager, ontologyID, documentSource.getDocumentIRI(), handler);
        // Now parse the input into the empty ontology that we created
        // select a parser if the input source has format information and MIME
        // information
        __CLR4_5_27ly7lylviclgfz.R.inc(9942);Set<String> bannedParsers = Sets.newHashSet(configuration.getBannedParsers().split(" "));
        __CLR4_5_27ly7lylviclgfz.R.inc(9943);PriorityCollection<OWLParserFactory> parsers = getParsers(documentSource, manager.getOntologyParsers());
        __CLR4_5_27ly7lylviclgfz.R.inc(9944);for (OWLParserFactory parserFactory : parsers) {{
            __CLR4_5_27ly7lylviclgfz.R.inc(9945);if ((((!bannedParsers.contains(parserFactory.getClass().getName()))&&(__CLR4_5_27ly7lylviclgfz.R.iget(9946)!=0|true))||(__CLR4_5_27ly7lylviclgfz.R.iget(9947)==0&false))) {{
                __CLR4_5_27ly7lylviclgfz.R.inc(9948);OWLParser parser = parserFactory.createParser();
                __CLR4_5_27ly7lylviclgfz.R.inc(9949);try {
                    __CLR4_5_27ly7lylviclgfz.R.inc(9950);if ((((existingOntology == null && !ont.isEmpty())&&(__CLR4_5_27ly7lylviclgfz.R.iget(9951)!=0|true))||(__CLR4_5_27ly7lylviclgfz.R.iget(9952)==0&false))) {{
                        // Junk from a previous parse. We should clear the ont
                        __CLR4_5_27ly7lylviclgfz.R.inc(9953);manager.removeOntology(ont);
                        __CLR4_5_27ly7lylviclgfz.R.inc(9954);ont = createOWLOntology(manager, ontologyID, documentSource.getDocumentIRI(), handler);
                    }
                    }__CLR4_5_27ly7lylviclgfz.R.inc(9955);OWLDocumentFormat format = parser.parse(documentSource, ont, configuration);
                    __CLR4_5_27ly7lylviclgfz.R.inc(9956);handler.setOntologyFormat(ont, format);
                    __CLR4_5_27ly7lylviclgfz.R.inc(9957);return ont;
                } catch (IOException e) {
                    // For input/output exceptions, we assume that it means the
                    // source cannot be read regardless of the parsers, so we
                    // stop
                    // early
                    // First clean up
                    __CLR4_5_27ly7lylviclgfz.R.inc(9958);manager.removeOntology(ont);
                    __CLR4_5_27ly7lylviclgfz.R.inc(9959);throw new OWLOntologyCreationIOException(e);
                } catch (UnloadableImportException e) {
                    // If an import cannot be located, all parsers will fail.
                    // Again,
                    // terminate early
                    // First clean up
                    __CLR4_5_27ly7lylviclgfz.R.inc(9960);manager.removeOntology(ont);
                    __CLR4_5_27ly7lylviclgfz.R.inc(9961);throw e;
                } catch (OWLParserException e) {
                    // Record this attempts and continue trying to parse.
                    __CLR4_5_27ly7lylviclgfz.R.inc(9962);exceptions.put(parser, e);
                } catch (RuntimeException e) {
                    // Clean up and rethrow
                    __CLR4_5_27ly7lylviclgfz.R.inc(9963);exceptions.put(parser, new OWLParserException(e));
                    __CLR4_5_27ly7lylviclgfz.R.inc(9964);manager.removeOntology(ont);
                    __CLR4_5_27ly7lylviclgfz.R.inc(9965);throw e;
                }
            }
        }}
        }__CLR4_5_27ly7lylviclgfz.R.inc(9966);if ((((existingOntology == null)&&(__CLR4_5_27ly7lylviclgfz.R.iget(9967)!=0|true))||(__CLR4_5_27ly7lylviclgfz.R.iget(9968)==0&false))) {{
            __CLR4_5_27ly7lylviclgfz.R.inc(9969);manager.removeOntology(ont);
        }
        // We haven't found a parser that could parse the ontology properly.
        // Throw an
        // exception whose message contains the stack traces from all of the
        // parsers
        // that we have tried.
        }__CLR4_5_27ly7lylviclgfz.R.inc(9970);throw new UnparsableOntologyException(documentSource.getDocumentIRI(), exceptions, configuration);
    }finally{__CLR4_5_27ly7lylviclgfz.R.flushNeeded();}}
}
