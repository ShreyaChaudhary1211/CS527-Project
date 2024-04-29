/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.obolibrary.macro;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.obolibrary.obo2owl.OWLAPIObo2Owl;
import org.obolibrary.oboformat.model.OBODoc;
import org.semanticweb.owlapi.OWLAPIConfigProvider;
import org.semanticweb.owlapi.expression.OWLEntityChecker;
import org.semanticweb.owlapi.expression.ShortFormEntityChecker;
import org.semanticweb.owlapi.manchestersyntax.parser.ManchesterOWLSyntaxParserImpl;
import org.semanticweb.owlapi.manchestersyntax.renderer.ParserException;
import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.util.BidirectionalShortFormProviderAdapter;
import org.semanticweb.owlapi.util.IRIShortFormProvider;
import org.semanticweb.owlapi.util.OntologyAxiomPair;
import org.semanticweb.owlapi.util.ShortFormProvider;
import org.semanticweb.owlapi.util.SimpleIRIShortFormProvider;
import org.semanticweb.owlapi.util.mansyntax.ManchesterOWLSyntaxParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * wrapper for parsing Manchester Syntax.
 * 
 * @author heiko
 */
public class ManchesterSyntaxTool {public static class __CLR4_5_2fvfvlvicmswr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u006f\u0062\u006f\u0066\u006f\u0072\u006d\u0061\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237308750L,8589935092L,730,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final Logger LOG = LoggerFactory.getLogger(ManchesterSyntaxTool.class);
    @Nonnull
    protected final IRIShortFormProvider iriShortFormProvider = new SimpleIRIShortFormProvider();
    @Nonnull
    private final OWLDataFactory dataFactory;
    @Nonnull
    private final AdvancedEntityChecker entityChecker;
    @Nonnull
    private final ShortFormProvider shortFormProvider = new ShortFormProvider() {

        @Override
        public void dispose() {try{__CLR4_5_2fvfvlvicmswr.R.inc(571);
            // do nothing
        }finally{__CLR4_5_2fvfvlvicmswr.R.flushNeeded();}}

        @Override
        public String getShortForm(@Nonnull OWLEntity entity) {try{__CLR4_5_2fvfvlvicmswr.R.inc(572);
            __CLR4_5_2fvfvlvicmswr.R.inc(573);return iriShortFormProvider.getShortForm(entity.getIRI());
        }finally{__CLR4_5_2fvfvlvicmswr.R.flushNeeded();}}
    };
    private final AtomicBoolean disposed = new AtomicBoolean(false);

    /**
     * Create a new parser instance for the given ontology. By default, this
     * parser will also try to resolve OWLObjects via their identifier or
     * rdfs:label.
     * 
     * @param inputOntology
     *        inputOntology
     */
    public ManchesterSyntaxTool(@Nonnull OWLOntology inputOntology) {
        this(inputOntology, null);__CLR4_5_2fvfvlvicmswr.R.inc(575);try{__CLR4_5_2fvfvlvicmswr.R.inc(574);
    }finally{__CLR4_5_2fvfvlvicmswr.R.flushNeeded();}}

    /**
     * Create a new parser instance for the given ontologies. By default, this
     * parser will also try to resolve OWLObjects via their identifier or
     * rdfs:label.
     * 
     * @param inputOntology
     *        inputOntology
     * @param auxiliaryOntologies
     *        set of additional ontologies or null
     */
    public ManchesterSyntaxTool(@Nonnull OWLOntology inputOntology,
        @Nullable Collection<OWLOntology> auxiliaryOntologies) {try{__CLR4_5_2fvfvlvicmswr.R.inc(576);
        __CLR4_5_2fvfvlvicmswr.R.inc(577);OWLOntologyManager manager = inputOntology.getOWLOntologyManager();
        __CLR4_5_2fvfvlvicmswr.R.inc(578);dataFactory = manager.getOWLDataFactory();
        __CLR4_5_2fvfvlvicmswr.R.inc(579);Set<OWLOntology> ontologies = new HashSet<>(inputOntology.getImportsClosure());
        __CLR4_5_2fvfvlvicmswr.R.inc(580);if ((((auxiliaryOntologies != null && !auxiliaryOntologies.isEmpty())&&(__CLR4_5_2fvfvlvicmswr.R.iget(581)!=0|true))||(__CLR4_5_2fvfvlvicmswr.R.iget(582)==0&false))) {{
            __CLR4_5_2fvfvlvicmswr.R.inc(583);for (OWLOntology auxOnt : auxiliaryOntologies) {{
                __CLR4_5_2fvfvlvicmswr.R.inc(584);ontologies.addAll(auxOnt.getImportsClosure());
            }
        }}
        }__CLR4_5_2fvfvlvicmswr.R.inc(585);ShortFormEntityChecker defaultInstance = new ShortFormEntityChecker(new BidirectionalShortFormProviderAdapter(
            manager, ontologies, shortFormProvider));
        __CLR4_5_2fvfvlvicmswr.R.inc(586);entityChecker = new AdvancedEntityChecker(defaultInstance, ontologies, inputOntology.getOWLOntologyManager());
    }finally{__CLR4_5_2fvfvlvicmswr.R.flushNeeded();}}

    /**
     * Parse frame expressions in Manchester syntax.
     * 
     * @param expression
     *        expression
     * @return set of {@link OntologyAxiomPair}
     * @throws ParserException
     *         parser exception
     */
    public Set<OntologyAxiomPair> parseManchesterExpressionFrames(@Nonnull String expression) {try{__CLR4_5_2fvfvlvicmswr.R.inc(587);
        __CLR4_5_2fvfvlvicmswr.R.inc(588);ManchesterOWLSyntaxParser parser = createParser(expression);
        __CLR4_5_2fvfvlvicmswr.R.inc(589);return parser.parseFrames();
    }finally{__CLR4_5_2fvfvlvicmswr.R.flushNeeded();}}

    /**
     * Parse a class expression in Manchester syntax.
     * 
     * @param expression
     *        expression
     * @return {@link OWLClassExpression}
     * @throws ParserException
     *         parser exception
     */
    public OWLClassExpression parseManchesterExpression(@Nonnull String expression) {try{__CLR4_5_2fvfvlvicmswr.R.inc(590);
        __CLR4_5_2fvfvlvicmswr.R.inc(591);ManchesterOWLSyntaxParser parser = createParser(expression);
        __CLR4_5_2fvfvlvicmswr.R.inc(592);return parser.parseClassExpression();
    }finally{__CLR4_5_2fvfvlvicmswr.R.flushNeeded();}}

    @Nonnull
    private ManchesterOWLSyntaxParser createParser(@Nonnull String expression) {try{__CLR4_5_2fvfvlvicmswr.R.inc(593);
        __CLR4_5_2fvfvlvicmswr.R.inc(594);if ((((disposed.get())&&(__CLR4_5_2fvfvlvicmswr.R.iget(595)!=0|true))||(__CLR4_5_2fvfvlvicmswr.R.iget(596)==0&false))) {{
            __CLR4_5_2fvfvlvicmswr.R.inc(597);throw new OWLRuntimeException("Illegal State: Trying to use an disposed instance.");
        }
        }__CLR4_5_2fvfvlvicmswr.R.inc(598);ManchesterOWLSyntaxParser parser = new ManchesterOWLSyntaxParserImpl(new OWLAPIConfigProvider(), dataFactory);
        __CLR4_5_2fvfvlvicmswr.R.inc(599);parser.setStringToParse(expression);
        __CLR4_5_2fvfvlvicmswr.R.inc(600);parser.setOWLEntityChecker(entityChecker);
        __CLR4_5_2fvfvlvicmswr.R.inc(601);LOG.info("parsing: {}", expression);
        __CLR4_5_2fvfvlvicmswr.R.inc(602);return parser;
    }finally{__CLR4_5_2fvfvlvicmswr.R.flushNeeded();}}

    /**
     * Translate the {@link IRI} into the short form as expected by the parser.
     * 
     * @param iri
     *        iri
     * @return short form
     */
    public String getId(@Nonnull IRI iri) {try{__CLR4_5_2fvfvlvicmswr.R.inc(603);
        __CLR4_5_2fvfvlvicmswr.R.inc(604);if ((((disposed.get())&&(__CLR4_5_2fvfvlvicmswr.R.iget(605)!=0|true))||(__CLR4_5_2fvfvlvicmswr.R.iget(606)==0&false))) {{
            __CLR4_5_2fvfvlvicmswr.R.inc(607);throw new OWLRuntimeException("Illegal State: Trying to use an disposed instance.");
        }
        }__CLR4_5_2fvfvlvicmswr.R.inc(608);return iriShortFormProvider.getShortForm(iri);
    }finally{__CLR4_5_2fvfvlvicmswr.R.flushNeeded();}}

    /**
     * Translate the {@link OWLEntity} identifier into the short form as
     * expected by the parser.
     * 
     * @param entity
     *        entity
     * @return short form
     */
    public String getId(@Nonnull OWLEntity entity) {try{__CLR4_5_2fvfvlvicmswr.R.inc(609);
        __CLR4_5_2fvfvlvicmswr.R.inc(610);if ((((disposed.get())&&(__CLR4_5_2fvfvlvicmswr.R.iget(611)!=0|true))||(__CLR4_5_2fvfvlvicmswr.R.iget(612)==0&false))) {{
            __CLR4_5_2fvfvlvicmswr.R.inc(613);throw new OWLRuntimeException("Illegal State: Trying to use an disposed instance.");
        }
        }__CLR4_5_2fvfvlvicmswr.R.inc(614);return shortFormProvider.getShortForm(entity);
    }finally{__CLR4_5_2fvfvlvicmswr.R.flushNeeded();}}

    /**
     * {@link OWLEntityChecker} which additionally checks for corresponding
     * identifiers and labels to retrieve entities. The intended behavior is
     * specified as follows:
     * <ul>
     * <li>If the string is enclosed with matching single quotes, try to resolve
     * as label</li>
     * <li>Otherwise, try to resolve as identifier</li>
     * </ul>
     */
    static class AdvancedEntityChecker implements OWLEntityChecker {

        private final OWLEntityChecker defaultInstance;
        private final Set<OWLOntology> ontologies;
        private final OWLOntologyManager manager;

        /**
         * @param defaultInstance
         *        defaultInstance
         * @param ontologies
         *        ontologies
         * @param manager
         *        manager
         */
        AdvancedEntityChecker(OWLEntityChecker defaultInstance, Set<OWLOntology> ontologies,
            OWLOntologyManager manager) {try{__CLR4_5_2fvfvlvicmswr.R.inc(615);
            __CLR4_5_2fvfvlvicmswr.R.inc(616);this.defaultInstance = defaultInstance;
            __CLR4_5_2fvfvlvicmswr.R.inc(617);this.ontologies = ontologies;
            __CLR4_5_2fvfvlvicmswr.R.inc(618);this.manager = manager;
        }finally{__CLR4_5_2fvfvlvicmswr.R.flushNeeded();}}

        @Nullable
        @Override
        public OWLClass getOWLClass(@Nonnull String name) {try{__CLR4_5_2fvfvlvicmswr.R.inc(619);
            __CLR4_5_2fvfvlvicmswr.R.inc(620);OWLClass owlClass = defaultInstance.getOWLClass(name);
            __CLR4_5_2fvfvlvicmswr.R.inc(621);if ((((owlClass == null)&&(__CLR4_5_2fvfvlvicmswr.R.iget(622)!=0|true))||(__CLR4_5_2fvfvlvicmswr.R.iget(623)==0&false))) {{
                __CLR4_5_2fvfvlvicmswr.R.inc(624);IRI iri = getIRI(name);
                __CLR4_5_2fvfvlvicmswr.R.inc(625);if ((((iri != null)&&(__CLR4_5_2fvfvlvicmswr.R.iget(626)!=0|true))||(__CLR4_5_2fvfvlvicmswr.R.iget(627)==0&false))) {{
                    __CLR4_5_2fvfvlvicmswr.R.inc(628);owlClass = getOWLClass(iri);
                }
            }}
            }__CLR4_5_2fvfvlvicmswr.R.inc(629);return owlClass;
        }finally{__CLR4_5_2fvfvlvicmswr.R.flushNeeded();}}

        @Nullable
        @Override
        public OWLObjectProperty getOWLObjectProperty(@Nonnull String name) {try{__CLR4_5_2fvfvlvicmswr.R.inc(630);
            __CLR4_5_2fvfvlvicmswr.R.inc(631);OWLObjectProperty owlObjectProperty = defaultInstance.getOWLObjectProperty(name);
            __CLR4_5_2fvfvlvicmswr.R.inc(632);if ((((owlObjectProperty == null)&&(__CLR4_5_2fvfvlvicmswr.R.iget(633)!=0|true))||(__CLR4_5_2fvfvlvicmswr.R.iget(634)==0&false))) {{
                __CLR4_5_2fvfvlvicmswr.R.inc(635);IRI iri = getIRI(name);
                __CLR4_5_2fvfvlvicmswr.R.inc(636);if ((((iri != null)&&(__CLR4_5_2fvfvlvicmswr.R.iget(637)!=0|true))||(__CLR4_5_2fvfvlvicmswr.R.iget(638)==0&false))) {{
                    __CLR4_5_2fvfvlvicmswr.R.inc(639);owlObjectProperty = getOWLObjectProperty(iri);
                }
            }}
            }__CLR4_5_2fvfvlvicmswr.R.inc(640);return owlObjectProperty;
        }finally{__CLR4_5_2fvfvlvicmswr.R.flushNeeded();}}

        @Override
        public OWLDataProperty getOWLDataProperty(String name) {try{__CLR4_5_2fvfvlvicmswr.R.inc(641);
            __CLR4_5_2fvfvlvicmswr.R.inc(642);return defaultInstance.getOWLDataProperty(name);
        }finally{__CLR4_5_2fvfvlvicmswr.R.flushNeeded();}}

        @Nullable
        @Override
        public OWLNamedIndividual getOWLIndividual(@Nonnull String name) {try{__CLR4_5_2fvfvlvicmswr.R.inc(643);
            __CLR4_5_2fvfvlvicmswr.R.inc(644);OWLNamedIndividual owlIndividual = defaultInstance.getOWLIndividual(name);
            __CLR4_5_2fvfvlvicmswr.R.inc(645);if ((((owlIndividual == null)&&(__CLR4_5_2fvfvlvicmswr.R.iget(646)!=0|true))||(__CLR4_5_2fvfvlvicmswr.R.iget(647)==0&false))) {{
                __CLR4_5_2fvfvlvicmswr.R.inc(648);IRI iri = getIRI(name);
                __CLR4_5_2fvfvlvicmswr.R.inc(649);if ((((iri != null)&&(__CLR4_5_2fvfvlvicmswr.R.iget(650)!=0|true))||(__CLR4_5_2fvfvlvicmswr.R.iget(651)==0&false))) {{
                    __CLR4_5_2fvfvlvicmswr.R.inc(652);owlIndividual = getOWLIndividual(iri);
                }
            }}
            }__CLR4_5_2fvfvlvicmswr.R.inc(653);return owlIndividual;
        }finally{__CLR4_5_2fvfvlvicmswr.R.flushNeeded();}}

        @Override
        public OWLDatatype getOWLDatatype(String name) {try{__CLR4_5_2fvfvlvicmswr.R.inc(654);
            __CLR4_5_2fvfvlvicmswr.R.inc(655);return defaultInstance.getOWLDatatype(name);
        }finally{__CLR4_5_2fvfvlvicmswr.R.flushNeeded();}}

        @Override
        public OWLAnnotationProperty getOWLAnnotationProperty(String name) {try{__CLR4_5_2fvfvlvicmswr.R.inc(656);
            __CLR4_5_2fvfvlvicmswr.R.inc(657);return defaultInstance.getOWLAnnotationProperty(name);
        }finally{__CLR4_5_2fvfvlvicmswr.R.flushNeeded();}}

        @Nullable
        IRI getIRI(@Nonnull String name) {try{__CLR4_5_2fvfvlvicmswr.R.inc(658);
            __CLR4_5_2fvfvlvicmswr.R.inc(659);if ((((isQuoted(name))&&(__CLR4_5_2fvfvlvicmswr.R.iget(660)!=0|true))||(__CLR4_5_2fvfvlvicmswr.R.iget(661)==0&false))) {{
                // anything in '....' quotes is a label
                __CLR4_5_2fvfvlvicmswr.R.inc(662);return getIRIByLabel(name.substring(1, name.length() - 1));
            }
            }__CLR4_5_2fvfvlvicmswr.R.inc(663);if ((((name.length() > 2 && name.charAt(0) == '<' && name.charAt(name.length() - 1) == '>')&&(__CLR4_5_2fvfvlvicmswr.R.iget(664)!=0|true))||(__CLR4_5_2fvfvlvicmswr.R.iget(665)==0&false))) {{
                // anything between <...> brackets is a complete IRI
                __CLR4_5_2fvfvlvicmswr.R.inc(666);return IRI.create(name.substring(1, name.length() - 1));
            }
            }__CLR4_5_2fvfvlvicmswr.R.inc(667);return getIRIByIdentifier(name);
        }finally{__CLR4_5_2fvfvlvicmswr.R.flushNeeded();}}

        private static boolean isQuoted(@Nonnull String s) {try{__CLR4_5_2fvfvlvicmswr.R.inc(668);
            __CLR4_5_2fvfvlvicmswr.R.inc(669);int length = s.length();
            __CLR4_5_2fvfvlvicmswr.R.inc(670);if ((((length >= 2)&&(__CLR4_5_2fvfvlvicmswr.R.iget(671)!=0|true))||(__CLR4_5_2fvfvlvicmswr.R.iget(672)==0&false))) {{
                __CLR4_5_2fvfvlvicmswr.R.inc(673);return s.charAt(0) == '\'' && s.charAt(length - 1) == '\'';
            }
            }__CLR4_5_2fvfvlvicmswr.R.inc(674);return false;
        }finally{__CLR4_5_2fvfvlvicmswr.R.flushNeeded();}}

        @Nullable
        IRI getIRIByIdentifier(@Nonnull String id) {try{__CLR4_5_2fvfvlvicmswr.R.inc(675);
            __CLR4_5_2fvfvlvicmswr.R.inc(676);OWLAPIObo2Owl b = new OWLAPIObo2Owl(manager);
            __CLR4_5_2fvfvlvicmswr.R.inc(677);b.setObodoc(new OBODoc());
            __CLR4_5_2fvfvlvicmswr.R.inc(678);return b.oboIdToIRI(id);
        }finally{__CLR4_5_2fvfvlvicmswr.R.flushNeeded();}}

        /**
         * Retrieve an {@link IRI} by rdfs:label.
         * 
         * @param label
         *        label
         * @return {@link IRI} or null
         */
        @Nullable
        IRI getIRIByLabel(@Nonnull String label) {try{__CLR4_5_2fvfvlvicmswr.R.inc(679);
            __CLR4_5_2fvfvlvicmswr.R.inc(680);for (OWLOntology o : ontologies) {{
                __CLR4_5_2fvfvlvicmswr.R.inc(681);Set<OWLAnnotationAssertionAxiom> aas = o.getAxioms(AxiomType.ANNOTATION_ASSERTION);
                __CLR4_5_2fvfvlvicmswr.R.inc(682);for (OWLAnnotationAssertionAxiom aa : aas) {{
                    __CLR4_5_2fvfvlvicmswr.R.inc(683);OWLAnnotationValue v = aa.getValue();
                    __CLR4_5_2fvfvlvicmswr.R.inc(684);OWLAnnotationProperty property = aa.getProperty();
                    __CLR4_5_2fvfvlvicmswr.R.inc(685);if ((((isMatchingLabel(label, v, property))&&(__CLR4_5_2fvfvlvicmswr.R.iget(686)!=0|true))||(__CLR4_5_2fvfvlvicmswr.R.iget(687)==0&false))) {{
                        __CLR4_5_2fvfvlvicmswr.R.inc(688);OWLAnnotationSubject obj = aa.getSubject();
                        __CLR4_5_2fvfvlvicmswr.R.inc(689);if ((((obj instanceof IRI)&&(__CLR4_5_2fvfvlvicmswr.R.iget(690)!=0|true))||(__CLR4_5_2fvfvlvicmswr.R.iget(691)==0&false))) {{
                            __CLR4_5_2fvfvlvicmswr.R.inc(692);return (IRI) obj;
                        }
                    }}
                }}
            }}
            }__CLR4_5_2fvfvlvicmswr.R.inc(693);return null;
        }finally{__CLR4_5_2fvfvlvicmswr.R.flushNeeded();}}

        /**
         * @param label
         *        label to match
         * @param v
         *        annotation value
         * @param property
         *        property to check
         * @return true if property is a label, v is a literal and v matches
         *         label
         */
        protected boolean isMatchingLabel(String label, OWLAnnotationValue v, OWLAnnotationProperty property) {try{__CLR4_5_2fvfvlvicmswr.R.inc(694);
            __CLR4_5_2fvfvlvicmswr.R.inc(695);return property.isLabel() && v instanceof OWLLiteral && label.equals(((OWLLiteral) v).getLiteral());
        }finally{__CLR4_5_2fvfvlvicmswr.R.flushNeeded();}}

        /**
         * Retrieve the {@link OWLClass} for a given {@link IRI}, if it has at
         * least one {@link OWLDeclarationAxiom}.
         * 
         * @param iri
         *        iri
         * @return {@link OWLClass} or null
         */
        @Nullable
        OWLClass getOWLClass(@Nonnull IRI iri) {try{__CLR4_5_2fvfvlvicmswr.R.inc(696);
            __CLR4_5_2fvfvlvicmswr.R.inc(697);for (OWLOntology o : ontologies) {{
                __CLR4_5_2fvfvlvicmswr.R.inc(698);OWLClass c = o.getOWLOntologyManager().getOWLDataFactory().getOWLClass(iri);
                __CLR4_5_2fvfvlvicmswr.R.inc(699);if ((((!o.getDeclarationAxioms(c).isEmpty())&&(__CLR4_5_2fvfvlvicmswr.R.iget(700)!=0|true))||(__CLR4_5_2fvfvlvicmswr.R.iget(701)==0&false))) {{
                    __CLR4_5_2fvfvlvicmswr.R.inc(702);return c;
                }
                }__CLR4_5_2fvfvlvicmswr.R.inc(703);if ((((o.getOWLOntologyManager().getOWLDataFactory().getOWLNothing().equals(c))&&(__CLR4_5_2fvfvlvicmswr.R.iget(704)!=0|true))||(__CLR4_5_2fvfvlvicmswr.R.iget(705)==0&false))) {{
                    __CLR4_5_2fvfvlvicmswr.R.inc(706);return c;
                }
            }}
            }__CLR4_5_2fvfvlvicmswr.R.inc(707);return null;
        }finally{__CLR4_5_2fvfvlvicmswr.R.flushNeeded();}}

        /**
         * Retrieve the {@link OWLNamedIndividual} for a given {@link IRI}, if
         * it has at least one corresponding {@link OWLDeclarationAxiom}.
         * 
         * @param iri
         *        iri
         * @return {@link OWLNamedIndividual} or null
         */
        @Nullable
        OWLNamedIndividual getOWLIndividual(@Nonnull IRI iri) {try{__CLR4_5_2fvfvlvicmswr.R.inc(708);
            __CLR4_5_2fvfvlvicmswr.R.inc(709);for (OWLOntology o : ontologies) {{
                __CLR4_5_2fvfvlvicmswr.R.inc(710);OWLNamedIndividual c = o.getOWLOntologyManager().getOWLDataFactory().getOWLNamedIndividual(iri);
                __CLR4_5_2fvfvlvicmswr.R.inc(711);for (OWLDeclarationAxiom da : o.getDeclarationAxioms(c)) {{
                    __CLR4_5_2fvfvlvicmswr.R.inc(712);if ((((da.getEntity() instanceof OWLNamedIndividual)&&(__CLR4_5_2fvfvlvicmswr.R.iget(713)!=0|true))||(__CLR4_5_2fvfvlvicmswr.R.iget(714)==0&false))) {{
                        __CLR4_5_2fvfvlvicmswr.R.inc(715);return (OWLNamedIndividual) da.getEntity();
                    }
                }}
            }}
            }__CLR4_5_2fvfvlvicmswr.R.inc(716);return null;
        }finally{__CLR4_5_2fvfvlvicmswr.R.flushNeeded();}}

        /**
         * Retrieve the {@link OWLObjectProperty} for a given {@link IRI}, if it
         * has at least one {@link OWLDeclarationAxiom}.
         * 
         * @param iri
         *        iri
         * @return {@link OWLObjectProperty} or null
         */
        @Nullable
        OWLObjectProperty getOWLObjectProperty(@Nonnull IRI iri) {try{__CLR4_5_2fvfvlvicmswr.R.inc(717);
            __CLR4_5_2fvfvlvicmswr.R.inc(718);for (OWLOntology o : ontologies) {{
                __CLR4_5_2fvfvlvicmswr.R.inc(719);OWLObjectProperty p = o.getOWLOntologyManager().getOWLDataFactory().getOWLObjectProperty(iri);
                __CLR4_5_2fvfvlvicmswr.R.inc(720);if ((((!o.getDeclarationAxioms(p).isEmpty())&&(__CLR4_5_2fvfvlvicmswr.R.iget(721)!=0|true))||(__CLR4_5_2fvfvlvicmswr.R.iget(722)==0&false))) {{
                    __CLR4_5_2fvfvlvicmswr.R.inc(723);return p;
                }
            }}
            }__CLR4_5_2fvfvlvicmswr.R.inc(724);return null;
        }finally{__CLR4_5_2fvfvlvicmswr.R.flushNeeded();}}
    }

    /**
     * Call this method to dispose the internal data structures. This will
     * remove also the listeners registered with the ontology manager.
     */
    public void dispose() {try{__CLR4_5_2fvfvlvicmswr.R.inc(725);
        __CLR4_5_2fvfvlvicmswr.R.inc(726);if ((((!disposed.getAndSet(true))&&(__CLR4_5_2fvfvlvicmswr.R.iget(727)!=0|true))||(__CLR4_5_2fvfvlvicmswr.R.iget(728)==0&false))) {{
            __CLR4_5_2fvfvlvicmswr.R.inc(729);shortFormProvider.dispose();
        }
    }}finally{__CLR4_5_2fvfvlvicmswr.R.flushNeeded();}}
}
