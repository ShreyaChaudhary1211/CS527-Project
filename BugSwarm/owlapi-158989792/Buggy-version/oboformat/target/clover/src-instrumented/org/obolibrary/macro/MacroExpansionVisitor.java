/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.obolibrary.macro;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.semanticweb.owlapi.io.OWLParserException;
import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.util.OntologyAxiomPair;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author cjm TODO - allow use of prefixes
 */
public class MacroExpansionVisitor {public static class __CLR4_5_2bxbxlvicmsw7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u006f\u0062\u006f\u0066\u006f\u0072\u006d\u0061\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237308750L,8589935092L,571,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    protected static final Logger LOG = LoggerFactory.getLogger(MacroExpansionVisitor.class.getName());
    @Nonnull
    protected final OWLOntology inputOntology;
    protected final OWLOntologyManager manager;
    protected final Visitor visitor;
    protected ManchesterSyntaxTool manchesterSyntaxTool;
    protected boolean shouldTransferAnnotations = false;
    protected final boolean shouldAddExpansionMarker;
    protected Set<OWLAnnotation> extraAnnotations;

    /**
     * @param ontology
     *        ontology to visit
     */
    public MacroExpansionVisitor(@Nonnull OWLOntology ontology) {
        this(ontology, AbstractMacroExpansionVisitor.EMPTY_ANNOTATIONS, false, false);__CLR4_5_2bxbxlvicmsw7.R.inc(430);try{__CLR4_5_2bxbxlvicmsw7.R.inc(429);
    }finally{__CLR4_5_2bxbxlvicmsw7.R.flushNeeded();}}

    /**
     * @param ontology
     *        ontology to visit
     * @param shouldAddExpansionMarker
     *        true if expansion should be added
     */
    public MacroExpansionVisitor(@Nonnull OWLOntology ontology, boolean shouldAddExpansionMarker) {
        this(ontology, AbstractMacroExpansionVisitor.EMPTY_ANNOTATIONS, false, shouldAddExpansionMarker);__CLR4_5_2bxbxlvicmsw7.R.inc(432);try{__CLR4_5_2bxbxlvicmsw7.R.inc(431);
    }finally{__CLR4_5_2bxbxlvicmsw7.R.flushNeeded();}}

    /**
     * @param ontology
     *        ontology to visit
     * @param shouldTransferAnnotations
     *        true if annotations should be transferred
     * @param shouldAddExpansionMarker
     *        true if expansion should be added
     */
    public MacroExpansionVisitor(@Nonnull OWLOntology ontology, boolean shouldTransferAnnotations,
        boolean shouldAddExpansionMarker) {
        this(ontology, AbstractMacroExpansionVisitor.EMPTY_ANNOTATIONS, shouldTransferAnnotations,
            shouldAddExpansionMarker);__CLR4_5_2bxbxlvicmsw7.R.inc(434);try{__CLR4_5_2bxbxlvicmsw7.R.inc(433);
    }finally{__CLR4_5_2bxbxlvicmsw7.R.flushNeeded();}}

    /**
     * @param inputOntology
     *        inputOntology
     * @param extraAnnotations
     *        extra annotations to add
     * @param shouldTransferAnnotations
     *        true if annotations should be transferred
     * @param shouldAddExpansionMarker
     *        true if expansion should be added
     */
    public MacroExpansionVisitor(@Nonnull OWLOntology inputOntology, Set<OWLAnnotation> extraAnnotations,
        boolean shouldTransferAnnotations, boolean shouldAddExpansionMarker) {try{__CLR4_5_2bxbxlvicmsw7.R.inc(435);
        __CLR4_5_2bxbxlvicmsw7.R.inc(436);this.inputOntology = inputOntology;
        __CLR4_5_2bxbxlvicmsw7.R.inc(437);this.extraAnnotations = extraAnnotations;
        __CLR4_5_2bxbxlvicmsw7.R.inc(438);this.shouldTransferAnnotations = shouldTransferAnnotations;
        __CLR4_5_2bxbxlvicmsw7.R.inc(439);this.shouldAddExpansionMarker = shouldAddExpansionMarker;
        __CLR4_5_2bxbxlvicmsw7.R.inc(440);visitor = new Visitor(inputOntology, shouldAddExpansionMarker);
        __CLR4_5_2bxbxlvicmsw7.R.inc(441);manchesterSyntaxTool = new ManchesterSyntaxTool(inputOntology);
        __CLR4_5_2bxbxlvicmsw7.R.inc(442);manager = inputOntology.getOWLOntologyManager();
    }finally{__CLR4_5_2bxbxlvicmsw7.R.flushNeeded();}}

    /**
     * @return macro expansions
     */
    @Nonnull
    public MacroExpansions getMacroExpansions() {try{__CLR4_5_2bxbxlvicmsw7.R.inc(443);
        __CLR4_5_2bxbxlvicmsw7.R.inc(444);return new MacroExpansions();
    }finally{__CLR4_5_2bxbxlvicmsw7.R.flushNeeded();}}

    /**
     * @return ontology with expanded macros
     */
    public OWLOntology expandAll() {try{__CLR4_5_2bxbxlvicmsw7.R.inc(445);
        __CLR4_5_2bxbxlvicmsw7.R.inc(446);MacroExpansions macroExpansions = new MacroExpansions();
        __CLR4_5_2bxbxlvicmsw7.R.inc(447);Set<OWLAxiom> newAxioms = macroExpansions.getNewAxioms();
        __CLR4_5_2bxbxlvicmsw7.R.inc(448);Set<OWLAxiom> rmAxioms = macroExpansions.getRmAxioms();
        __CLR4_5_2bxbxlvicmsw7.R.inc(449);manager.addAxioms(inputOntology, newAxioms);
        __CLR4_5_2bxbxlvicmsw7.R.inc(450);manager.removeAxioms(inputOntology, rmAxioms);
        __CLR4_5_2bxbxlvicmsw7.R.inc(451);return inputOntology;
    }finally{__CLR4_5_2bxbxlvicmsw7.R.flushNeeded();}}

    private class MacroExpansions {

        private Set<OWLAxiom> newAxioms = new HashSet<>();
        private Set<OWLAxiom> rmAxioms = new HashSet<>();

        public MacroExpansions() {try{__CLR4_5_2bxbxlvicmsw7.R.inc(452);
            __CLR4_5_2bxbxlvicmsw7.R.inc(453);for (OWLSubClassOfAxiom axiom : inputOntology.getAxioms(AxiomType.SUBCLASS_OF)) {{
                __CLR4_5_2bxbxlvicmsw7.R.inc(454);OWLAxiom newAxiom = visitor.visit(axiom);
                __CLR4_5_2bxbxlvicmsw7.R.inc(455);replaceIfDifferent(axiom, newAxiom);
            }
            }__CLR4_5_2bxbxlvicmsw7.R.inc(456);for (OWLEquivalentClassesAxiom axiom : inputOntology.getAxioms(AxiomType.EQUIVALENT_CLASSES)) {{
                __CLR4_5_2bxbxlvicmsw7.R.inc(457);OWLAxiom newAxiom = visitor.visit(axiom);
                __CLR4_5_2bxbxlvicmsw7.R.inc(458);replaceIfDifferent(axiom, newAxiom);
            }
            }__CLR4_5_2bxbxlvicmsw7.R.inc(459);for (OWLClassAssertionAxiom axiom : inputOntology.getAxioms(AxiomType.CLASS_ASSERTION)) {{
                __CLR4_5_2bxbxlvicmsw7.R.inc(460);OWLAxiom newAxiom = visitor.visit(axiom);
                __CLR4_5_2bxbxlvicmsw7.R.inc(461);replaceIfDifferent(axiom, newAxiom);
            }
            }__CLR4_5_2bxbxlvicmsw7.R.inc(462);for (OWLAnnotationAssertionAxiom axiom : inputOntology.getAxioms(AxiomType.ANNOTATION_ASSERTION)) {{
                __CLR4_5_2bxbxlvicmsw7.R.inc(463);if ((((expand(axiom))&&(__CLR4_5_2bxbxlvicmsw7.R.iget(464)!=0|true))||(__CLR4_5_2bxbxlvicmsw7.R.iget(465)==0&false))) {{
                    __CLR4_5_2bxbxlvicmsw7.R.inc(466);rmAxioms.add(axiom);
                }
            }}
        }}finally{__CLR4_5_2bxbxlvicmsw7.R.flushNeeded();}}

        private void replaceIfDifferent(OWLAxiom ax, OWLAxiom exAx) {try{__CLR4_5_2bxbxlvicmsw7.R.inc(467);
            __CLR4_5_2bxbxlvicmsw7.R.inc(468);if ((((!ax.equals(exAx))&&(__CLR4_5_2bxbxlvicmsw7.R.iget(469)!=0|true))||(__CLR4_5_2bxbxlvicmsw7.R.iget(470)==0&false))) {{
                __CLR4_5_2bxbxlvicmsw7.R.inc(471);newAxioms.add(exAx);
                __CLR4_5_2bxbxlvicmsw7.R.inc(472);rmAxioms.add(ax);
            }
        }}finally{__CLR4_5_2bxbxlvicmsw7.R.flushNeeded();}}

        public Set<OWLAxiom> getNewAxioms() {try{__CLR4_5_2bxbxlvicmsw7.R.inc(473);
            __CLR4_5_2bxbxlvicmsw7.R.inc(474);return newAxioms;
        }finally{__CLR4_5_2bxbxlvicmsw7.R.flushNeeded();}}

        public Set<OWLAxiom> getRmAxioms() {try{__CLR4_5_2bxbxlvicmsw7.R.inc(475);
            __CLR4_5_2bxbxlvicmsw7.R.inc(476);return rmAxioms;
        }finally{__CLR4_5_2bxbxlvicmsw7.R.flushNeeded();}}

        private boolean expand(OWLAnnotationAssertionAxiom axiom) {try{__CLR4_5_2bxbxlvicmsw7.R.inc(477);
            __CLR4_5_2bxbxlvicmsw7.R.inc(478);OWLAnnotationProperty prop = axiom.getProperty();
            __CLR4_5_2bxbxlvicmsw7.R.inc(479);String expandTo = visitor.expandAssertionToMap.get(prop.getIRI());
            __CLR4_5_2bxbxlvicmsw7.R.inc(480);HashSet<OWLAxiom> declarations = new HashSet<>();
            __CLR4_5_2bxbxlvicmsw7.R.inc(481);boolean expandedSomething = false;
            __CLR4_5_2bxbxlvicmsw7.R.inc(482);try {
                __CLR4_5_2bxbxlvicmsw7.R.inc(483);if ((((expandTo != null)&&(__CLR4_5_2bxbxlvicmsw7.R.iget(484)!=0|true))||(__CLR4_5_2bxbxlvicmsw7.R.iget(485)==0&false))) {{
                    __CLR4_5_2bxbxlvicmsw7.R.inc(486);Set<OWLAnnotation> annotations = new HashSet<>(extraAnnotations);
                    __CLR4_5_2bxbxlvicmsw7.R.inc(487);if ((((shouldAddExpansionMarker)&&(__CLR4_5_2bxbxlvicmsw7.R.iget(488)!=0|true))||(__CLR4_5_2bxbxlvicmsw7.R.iget(489)==0&false))) {{
                        __CLR4_5_2bxbxlvicmsw7.R.inc(490);annotations.add(visitor.getExpansionMarkerAnnotation());
                    }
                    }__CLR4_5_2bxbxlvicmsw7.R.inc(491);if ((((shouldTransferAnnotations())&&(__CLR4_5_2bxbxlvicmsw7.R.iget(492)!=0|true))||(__CLR4_5_2bxbxlvicmsw7.R.iget(493)==0&false))) {{
                        __CLR4_5_2bxbxlvicmsw7.R.inc(494);annotations.addAll(axiom.getAnnotations());
                    }
                    // when expanding assertions, the axiom is an annotation
                    // assertion,
                    // and the value may be not be explicitly declared. If it is
                    // not,
                    // we assume it is a class
                    }__CLR4_5_2bxbxlvicmsw7.R.inc(495);IRI axValIRI = (IRI) axiom.getValue();
                    __CLR4_5_2bxbxlvicmsw7.R.inc(496);OWLClass axValClass = visitor.dataFactory.getOWLClass(axValIRI);
                    __CLR4_5_2bxbxlvicmsw7.R.inc(497);if ((((inputOntology.getDeclarationAxioms(axValClass).isEmpty())&&(__CLR4_5_2bxbxlvicmsw7.R.iget(498)!=0|true))||(__CLR4_5_2bxbxlvicmsw7.R.iget(499)==0&false))) {{
                        __CLR4_5_2bxbxlvicmsw7.R.inc(500);OWLDeclarationAxiom declarationAxiom = visitor.dataFactory.getOWLDeclarationAxiom(axValClass,
                            annotations);
                        __CLR4_5_2bxbxlvicmsw7.R.inc(501);declarations.add(declarationAxiom);
                        __CLR4_5_2bxbxlvicmsw7.R.inc(502);newAxioms.add(declarationAxiom);
                        __CLR4_5_2bxbxlvicmsw7.R.inc(503);manager.addAxiom(inputOntology, declarationAxiom);
                        // we need to sync the MST entity checker with the new
                        // ontology
                        // plus declarations;
                        // we do this by creating a new MST - this is not
                        // particularly
                        // efficient, a better
                        // way might be to first scan the ontology for all
                        // annotation
                        // axioms that will be expanded,
                        // then add the declarations at this point
                        __CLR4_5_2bxbxlvicmsw7.R.inc(504);manchesterSyntaxTool = new ManchesterSyntaxTool(inputOntology);
                    }
                    }__CLR4_5_2bxbxlvicmsw7.R.inc(505);LOG.info("Template to Expand {}", expandTo);
                    __CLR4_5_2bxbxlvicmsw7.R.inc(506);expandTo = expandTo.replaceAll("\\?X", manchesterSyntaxTool.getId((IRI) axiom.getSubject()));
                    __CLR4_5_2bxbxlvicmsw7.R.inc(507);expandTo = expandTo.replaceAll("\\?Y", manchesterSyntaxTool.getId(axValIRI));
                    __CLR4_5_2bxbxlvicmsw7.R.inc(508);LOG.info("Expanding {}", expandTo);
                    __CLR4_5_2bxbxlvicmsw7.R.inc(509);try {
                        __CLR4_5_2bxbxlvicmsw7.R.inc(510);Set<OntologyAxiomPair> setAxp = manchesterSyntaxTool.parseManchesterExpressionFrames(expandTo);
                        __CLR4_5_2bxbxlvicmsw7.R.inc(511);for (OntologyAxiomPair axp : setAxp) {{
                            __CLR4_5_2bxbxlvicmsw7.R.inc(512);OWLAxiom expandedAxiom = axp.getAxiom();
                            __CLR4_5_2bxbxlvicmsw7.R.inc(513);if ((((shouldTransferAnnotations())&&(__CLR4_5_2bxbxlvicmsw7.R.iget(514)!=0|true))||(__CLR4_5_2bxbxlvicmsw7.R.iget(515)==0&false))) {{
                                __CLR4_5_2bxbxlvicmsw7.R.inc(516);expandedAxiom = expandedAxiom.getAnnotatedAxiom(annotations);
                            }
                            }__CLR4_5_2bxbxlvicmsw7.R.inc(517);newAxioms.add(expandedAxiom);
                            __CLR4_5_2bxbxlvicmsw7.R.inc(518);expandedSomething = true;
                        }
                    }} catch (Exception ex) {
                        __CLR4_5_2bxbxlvicmsw7.R.inc(519);LOG.error(ex.getMessage(), ex);
                    }
                    // TODO:
                }
            }} finally {
                __CLR4_5_2bxbxlvicmsw7.R.inc(520);manager.removeAxioms(inputOntology, declarations);
            }
            __CLR4_5_2bxbxlvicmsw7.R.inc(521);return expandedSomething;
        }finally{__CLR4_5_2bxbxlvicmsw7.R.flushNeeded();}}
    }

    private class Visitor extends AbstractMacroExpansionVisitor {

        Visitor(OWLOntology inputOntology, boolean shouldAddExpansionMarker) {
            super(inputOntology, shouldAddExpansionMarker);__CLR4_5_2bxbxlvicmsw7.R.inc(523);try{__CLR4_5_2bxbxlvicmsw7.R.inc(522);
        }finally{__CLR4_5_2bxbxlvicmsw7.R.flushNeeded();}}

        @Override
        protected OWLClassExpression expandOWLObjSomeVal(OWLClassExpression filler, OWLObjectPropertyExpression p) {try{__CLR4_5_2bxbxlvicmsw7.R.inc(524);
            __CLR4_5_2bxbxlvicmsw7.R.inc(525);return expandObject(filler, p);
        }finally{__CLR4_5_2bxbxlvicmsw7.R.flushNeeded();}}

        @Override
        protected OWLClassExpression expandOWLObjHasVal(OWLObjectHasValue desc, OWLIndividual filler,
            OWLObjectPropertyExpression p) {try{__CLR4_5_2bxbxlvicmsw7.R.inc(526);
            __CLR4_5_2bxbxlvicmsw7.R.inc(527);OWLClassExpression result = expandObject(filler, p);
            __CLR4_5_2bxbxlvicmsw7.R.inc(528);if ((((result != null)&&(__CLR4_5_2bxbxlvicmsw7.R.iget(529)!=0|true))||(__CLR4_5_2bxbxlvicmsw7.R.iget(530)==0&false))) {{
                __CLR4_5_2bxbxlvicmsw7.R.inc(531);result = dataFactory.getOWLObjectSomeValuesFrom(desc.getProperty(), result);
            }
            }__CLR4_5_2bxbxlvicmsw7.R.inc(532);return result;
        }finally{__CLR4_5_2bxbxlvicmsw7.R.flushNeeded();}}

        @Nullable
        OWLClassExpression expandObject(Object filler, OWLObjectPropertyExpression p) {try{__CLR4_5_2bxbxlvicmsw7.R.inc(533);
            __CLR4_5_2bxbxlvicmsw7.R.inc(534);OWLClassExpression result = null;
            __CLR4_5_2bxbxlvicmsw7.R.inc(535);IRI iri = ((OWLObjectProperty) p).getIRI();
            __CLR4_5_2bxbxlvicmsw7.R.inc(536);IRI templateVal = null;
            __CLR4_5_2bxbxlvicmsw7.R.inc(537);if ((((expandExpressionMap.containsKey(iri))&&(__CLR4_5_2bxbxlvicmsw7.R.iget(538)!=0|true))||(__CLR4_5_2bxbxlvicmsw7.R.iget(539)==0&false))) {{
                __CLR4_5_2bxbxlvicmsw7.R.inc(540);if ((((filler instanceof OWLObjectOneOf)&&(__CLR4_5_2bxbxlvicmsw7.R.iget(541)!=0|true))||(__CLR4_5_2bxbxlvicmsw7.R.iget(542)==0&false))) {{
                    __CLR4_5_2bxbxlvicmsw7.R.inc(543);Set<OWLIndividual> inds = ((OWLObjectOneOf) filler).getIndividuals();
                    __CLR4_5_2bxbxlvicmsw7.R.inc(544);if ((((inds.size() == 1)&&(__CLR4_5_2bxbxlvicmsw7.R.iget(545)!=0|true))||(__CLR4_5_2bxbxlvicmsw7.R.iget(546)==0&false))) {{
                        __CLR4_5_2bxbxlvicmsw7.R.inc(547);OWLIndividual ind = inds.iterator().next();
                        __CLR4_5_2bxbxlvicmsw7.R.inc(548);if ((((ind instanceof OWLNamedIndividual)&&(__CLR4_5_2bxbxlvicmsw7.R.iget(549)!=0|true))||(__CLR4_5_2bxbxlvicmsw7.R.iget(550)==0&false))) {{
                            __CLR4_5_2bxbxlvicmsw7.R.inc(551);templateVal = ((OWLNamedObject) ind).getIRI();
                        }
                    }}
                }}
                }__CLR4_5_2bxbxlvicmsw7.R.inc(552);if ((((filler instanceof OWLNamedObject)&&(__CLR4_5_2bxbxlvicmsw7.R.iget(553)!=0|true))||(__CLR4_5_2bxbxlvicmsw7.R.iget(554)==0&false))) {{
                    __CLR4_5_2bxbxlvicmsw7.R.inc(555);templateVal = ((OWLNamedObject) filler).getIRI();
                }
                }__CLR4_5_2bxbxlvicmsw7.R.inc(556);if ((((templateVal != null)&&(__CLR4_5_2bxbxlvicmsw7.R.iget(557)!=0|true))||(__CLR4_5_2bxbxlvicmsw7.R.iget(558)==0&false))) {{
                    __CLR4_5_2bxbxlvicmsw7.R.inc(559);String tStr = expandExpressionMap.get(iri);
                    __CLR4_5_2bxbxlvicmsw7.R.inc(560);String exStr = tStr.replaceAll("\\?Y", manchesterSyntaxTool.getId(templateVal));
                    __CLR4_5_2bxbxlvicmsw7.R.inc(561);try {
                        __CLR4_5_2bxbxlvicmsw7.R.inc(562);result = manchesterSyntaxTool.parseManchesterExpression(exStr);
                    } catch (OWLParserException e) {
                        __CLR4_5_2bxbxlvicmsw7.R.inc(563);LOG.error(e.getMessage(), e);
                    }
                }
            }}
            }__CLR4_5_2bxbxlvicmsw7.R.inc(564);return result;
        }finally{__CLR4_5_2bxbxlvicmsw7.R.flushNeeded();}}
    }

    /**
     * @return true if annotations should be transferred
     */
    public boolean shouldTransferAnnotations() {try{__CLR4_5_2bxbxlvicmsw7.R.inc(565);
        __CLR4_5_2bxbxlvicmsw7.R.inc(566);return shouldTransferAnnotations;
    }finally{__CLR4_5_2bxbxlvicmsw7.R.flushNeeded();}}

    /**
     * @param shouldTransferAnnotations
     *        new value
     */
    public void setShouldTransferAnnotations(boolean shouldTransferAnnotations) {try{__CLR4_5_2bxbxlvicmsw7.R.inc(567);
        __CLR4_5_2bxbxlvicmsw7.R.inc(568);this.shouldTransferAnnotations = shouldTransferAnnotations;
    }finally{__CLR4_5_2bxbxlvicmsw7.R.flushNeeded();}}

    /** Call this method to clear internal references. */
    public void dispose() {try{__CLR4_5_2bxbxlvicmsw7.R.inc(569);
        __CLR4_5_2bxbxlvicmsw7.R.inc(570);manchesterSyntaxTool.dispose();
    }finally{__CLR4_5_2bxbxlvicmsw7.R.flushNeeded();}}
}
