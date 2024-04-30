/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.obolibrary.macro;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.semanticweb.owlapi.io.OWLParserException;
import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.util.OntologyAxiomPair;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** macro expansion gci visitor */
public class MacroExpansionGCIVisitor {public static class __CLR4_5_28787lvicmsvr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u006f\u0062\u006f\u0066\u006f\u0072\u006d\u0061\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237308750L,8589935092L,429,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    protected static final Logger LOG = LoggerFactory.getLogger(MacroExpansionGCIVisitor.class.getName());
    private final OWLOntology inputOntology;
    private final OWLOntologyManager outputManager;
    private final OWLOntology outputOntology;
    protected final ManchesterSyntaxTool manchesterSyntaxTool;
    private final boolean shouldAddExpansionMarker;
    protected boolean preserveAnnotationsWhenExpanding = false;

    /**
     * @param inputOntology
     *        input ontology
     * @param outputManager
     *        manager for output ontology
     * @param preserveAnnotationsWhenExpanding
     *        annotations should be preserved
     */
    public MacroExpansionGCIVisitor(OWLOntology inputOntology, OWLOntologyManager outputManager,
        boolean preserveAnnotationsWhenExpanding) {
        this(outputManager, inputOntology, false);__CLR4_5_28787lvicmsvr.R.inc(296);try{__CLR4_5_28787lvicmsvr.R.inc(295);
        __CLR4_5_28787lvicmsvr.R.inc(297);this.preserveAnnotationsWhenExpanding = preserveAnnotationsWhenExpanding;
    }finally{__CLR4_5_28787lvicmsvr.R.flushNeeded();}}

    /**
     * @param inputOntology
     *        inputOntology
     * @param outputManager
     *        outputManager
     * @param shouldAddExpansionMarker
     *        expansion marker should be added
     */
    public MacroExpansionGCIVisitor(OWLOntologyManager outputManager, OWLOntology inputOntology,
        boolean shouldAddExpansionMarker) {try{__CLR4_5_28787lvicmsvr.R.inc(298);
        __CLR4_5_28787lvicmsvr.R.inc(299);this.inputOntology = inputOntology;
        __CLR4_5_28787lvicmsvr.R.inc(300);this.shouldAddExpansionMarker = shouldAddExpansionMarker;
        __CLR4_5_28787lvicmsvr.R.inc(301);manchesterSyntaxTool = new ManchesterSyntaxTool(inputOntology);
        __CLR4_5_28787lvicmsvr.R.inc(302);this.outputManager = outputManager;
        __CLR4_5_28787lvicmsvr.R.inc(303);try {
            __CLR4_5_28787lvicmsvr.R.inc(304);outputOntology = outputManager.createOntology(inputOntology.getOntologyID());
        } catch (Exception ex) {
            __CLR4_5_28787lvicmsvr.R.inc(305);throw new OWLRuntimeException(ex);
        }
    }finally{__CLR4_5_28787lvicmsvr.R.flushNeeded();}}

    protected void output(OWLAxiom axiom) {try{__CLR4_5_28787lvicmsvr.R.inc(306);
        __CLR4_5_28787lvicmsvr.R.inc(307);if ((((axiom == null)&&(__CLR4_5_28787lvicmsvr.R.iget(308)!=0|true))||(__CLR4_5_28787lvicmsvr.R.iget(309)==0&false))) {{
            __CLR4_5_28787lvicmsvr.R.inc(310);LOG.error("no axiom");
            __CLR4_5_28787lvicmsvr.R.inc(311);return;
        }
        // System.out.println("adding:"+axiom);
        }__CLR4_5_28787lvicmsvr.R.inc(312);AddAxiom addAx = new AddAxiom(outputOntology, axiom);
        __CLR4_5_28787lvicmsvr.R.inc(313);try {
            __CLR4_5_28787lvicmsvr.R.inc(314);outputManager.applyChange(addAx);
        } catch (Exception e) {
            __CLR4_5_28787lvicmsvr.R.inc(315);LOG.error("COULD NOT TRANSLATE AXIOM", e);
        }
    }finally{__CLR4_5_28787lvicmsvr.R.flushNeeded();}}

    /**
     * @return ontology for gci
     */
    public OWLOntology createGCIOntology() {try{__CLR4_5_28787lvicmsvr.R.inc(316);
        __CLR4_5_28787lvicmsvr.R.inc(317);MacroExpansions expansions = new MacroExpansions();
        __CLR4_5_28787lvicmsvr.R.inc(318);outputManager.addAxioms(outputOntology, expansions.getNewAxioms());
        __CLR4_5_28787lvicmsvr.R.inc(319);outputManager.removeAxioms(outputOntology, expansions.getRmAxioms());
        __CLR4_5_28787lvicmsvr.R.inc(320);return outputOntology;
    }finally{__CLR4_5_28787lvicmsvr.R.flushNeeded();}}

    private class MacroExpansions {

        private Set<OWLAxiom> newAxioms = new HashSet<>();
        private Set<OWLAxiom> rmAxioms = new HashSet<>();
        GCIVisitor visitor = new GCIVisitor(inputOntology);

        public MacroExpansions() {try{__CLR4_5_28787lvicmsvr.R.inc(321);
            __CLR4_5_28787lvicmsvr.R.inc(322);for (OWLSubClassOfAxiom axiom : inputOntology.getAxioms(AxiomType.SUBCLASS_OF)) {{
                __CLR4_5_28787lvicmsvr.R.inc(323);OWLAxiom newAxiom = visitor.visit(axiom);
                // System.out.println("not adding " + newAxiom);
            }
            }__CLR4_5_28787lvicmsvr.R.inc(324);for (OWLEquivalentClassesAxiom axiom : inputOntology.getAxioms(AxiomType.EQUIVALENT_CLASSES)) {{
                __CLR4_5_28787lvicmsvr.R.inc(325);OWLAxiom newAxiom = visitor.visit(axiom);
                // System.out.println("not adding " + newAxiom);
            }
            }__CLR4_5_28787lvicmsvr.R.inc(326);for (OWLClassAssertionAxiom axiom : inputOntology.getAxioms(AxiomType.CLASS_ASSERTION)) {{
                __CLR4_5_28787lvicmsvr.R.inc(327);OWLAxiom newAxiom = visitor.visit(axiom);
                // System.out.println("not adding " + newAxiom);
            }
            }__CLR4_5_28787lvicmsvr.R.inc(328);for (OWLAnnotationAssertionAxiom axiom : inputOntology.getAxioms(AxiomType.ANNOTATION_ASSERTION)) {{
                __CLR4_5_28787lvicmsvr.R.inc(329);if ((((expand(axiom))&&(__CLR4_5_28787lvicmsvr.R.iget(330)!=0|true))||(__CLR4_5_28787lvicmsvr.R.iget(331)==0&false))) {{
                    // System.out.println("not removing " + axiom);
                }
            }}
        }}finally{__CLR4_5_28787lvicmsvr.R.flushNeeded();}}

        private void replaceIfDifferent(OWLAxiom ax, OWLAxiom exAx) {try{__CLR4_5_28787lvicmsvr.R.inc(332);
            __CLR4_5_28787lvicmsvr.R.inc(333);if ((((!ax.equals(exAx))&&(__CLR4_5_28787lvicmsvr.R.iget(334)!=0|true))||(__CLR4_5_28787lvicmsvr.R.iget(335)==0&false))) {{
                __CLR4_5_28787lvicmsvr.R.inc(336);newAxioms.add(exAx);
                __CLR4_5_28787lvicmsvr.R.inc(337);rmAxioms.add(ax);
            }
        }}finally{__CLR4_5_28787lvicmsvr.R.flushNeeded();}}

        public Set<OWLAxiom> getNewAxioms() {try{__CLR4_5_28787lvicmsvr.R.inc(338);
            __CLR4_5_28787lvicmsvr.R.inc(339);return newAxioms;
        }finally{__CLR4_5_28787lvicmsvr.R.flushNeeded();}}

        public Set<OWLAxiom> getRmAxioms() {try{__CLR4_5_28787lvicmsvr.R.inc(340);
            __CLR4_5_28787lvicmsvr.R.inc(341);return rmAxioms;
        }finally{__CLR4_5_28787lvicmsvr.R.flushNeeded();}}

        private boolean expand(OWLAnnotationAssertionAxiom ax) {try{__CLR4_5_28787lvicmsvr.R.inc(342);
            __CLR4_5_28787lvicmsvr.R.inc(343);OWLAnnotationProperty prop = ax.getProperty();
            __CLR4_5_28787lvicmsvr.R.inc(344);boolean didExpansion = false;
            __CLR4_5_28787lvicmsvr.R.inc(345);String expandTo = visitor.expandAssertionToMap.get(prop.getIRI());
            __CLR4_5_28787lvicmsvr.R.inc(346);if ((((expandTo != null)&&(__CLR4_5_28787lvicmsvr.R.iget(347)!=0|true))||(__CLR4_5_28787lvicmsvr.R.iget(348)==0&false))) {{
                __CLR4_5_28787lvicmsvr.R.inc(349);LOG.info("Template to Expand {}", expandTo);
                __CLR4_5_28787lvicmsvr.R.inc(350);expandTo = expandTo.replaceAll("\\?X", manchesterSyntaxTool.getId((IRI) ax.getSubject()));
                __CLR4_5_28787lvicmsvr.R.inc(351);expandTo = expandTo.replaceAll("\\?Y", manchesterSyntaxTool.getId((IRI) ax.getValue()));
                __CLR4_5_28787lvicmsvr.R.inc(352);LOG.info("Expanding {}", expandTo);
                __CLR4_5_28787lvicmsvr.R.inc(353);try {
                    __CLR4_5_28787lvicmsvr.R.inc(354);Set<OntologyAxiomPair> setAxp = manchesterSyntaxTool.parseManchesterExpressionFrames(expandTo);
                    __CLR4_5_28787lvicmsvr.R.inc(355);for (OntologyAxiomPair axp : setAxp) {{
                        __CLR4_5_28787lvicmsvr.R.inc(356);OWLAxiom axiom = axp.getAxiom();
                        __CLR4_5_28787lvicmsvr.R.inc(357);if ((((shouldPreserveAnnotationsWhenExpanding())&&(__CLR4_5_28787lvicmsvr.R.iget(358)!=0|true))||(__CLR4_5_28787lvicmsvr.R.iget(359)==0&false))) {{
                            __CLR4_5_28787lvicmsvr.R.inc(360);Set<OWLAnnotation> annotationsWithOptionalExpansionMarker = visitor
                                .getAnnotationsWithOptionalExpansionMarker(ax);
                            __CLR4_5_28787lvicmsvr.R.inc(361);axiom = axiom.getAnnotatedAxiom(annotationsWithOptionalExpansionMarker);
                        }
                        }__CLR4_5_28787lvicmsvr.R.inc(362);newAxioms.add(axiom);
                        __CLR4_5_28787lvicmsvr.R.inc(363);didExpansion = true;
                    }
                }} catch (Exception ex) {
                    __CLR4_5_28787lvicmsvr.R.inc(364);LOG.error(ex.getMessage(), ex);
                }
            }
            }__CLR4_5_28787lvicmsvr.R.inc(365);return didExpansion;
        }finally{__CLR4_5_28787lvicmsvr.R.flushNeeded();}}

        private class GCIVisitor extends AbstractMacroExpansionVisitor {

            final Set<OWLAnnotation> expansionMarkingAnnotations;

            GCIVisitor(OWLOntology inputOntology) {
                super(inputOntology, shouldAddExpansionMarker);__CLR4_5_28787lvicmsvr.R.inc(367);try{__CLR4_5_28787lvicmsvr.R.inc(366);
                __CLR4_5_28787lvicmsvr.R.inc(368);if ((((shouldAddExpansionMarker)&&(__CLR4_5_28787lvicmsvr.R.iget(369)!=0|true))||(__CLR4_5_28787lvicmsvr.R.iget(370)==0&false))) {{
                    __CLR4_5_28787lvicmsvr.R.inc(371);expansionMarkingAnnotations = Collections.singleton(expansionMarkerAnnotation);
                } }else {{
                    __CLR4_5_28787lvicmsvr.R.inc(372);expansionMarkingAnnotations = EMPTY_ANNOTATIONS;
                }
            }}finally{__CLR4_5_28787lvicmsvr.R.flushNeeded();}}

            @Override
            protected OWLClassExpression expandOWLObjSomeVal(OWLClassExpression filler, OWLObjectPropertyExpression p) {try{__CLR4_5_28787lvicmsvr.R.inc(373);
                __CLR4_5_28787lvicmsvr.R.inc(374);OWLClassExpression gciRHS = expandObject(filler, p);
                __CLR4_5_28787lvicmsvr.R.inc(375);if ((((gciRHS != null)&&(__CLR4_5_28787lvicmsvr.R.iget(376)!=0|true))||(__CLR4_5_28787lvicmsvr.R.iget(377)==0&false))) {{
                    __CLR4_5_28787lvicmsvr.R.inc(378);OWLClassExpression gciLHS = dataFactory.getOWLObjectSomeValuesFrom(p, filler);
                    __CLR4_5_28787lvicmsvr.R.inc(379);OWLEquivalentClassesAxiom ax = dataFactory.getOWLEquivalentClassesAxiom(gciLHS, gciRHS,
                        expansionMarkingAnnotations);
                    __CLR4_5_28787lvicmsvr.R.inc(380);newAxioms.add(ax);
                }
                }__CLR4_5_28787lvicmsvr.R.inc(381);return gciRHS;
            }finally{__CLR4_5_28787lvicmsvr.R.flushNeeded();}}

            @Override
            protected OWLClassExpression expandOWLObjHasVal(OWLObjectHasValue desc, OWLIndividual filler,
                OWLObjectPropertyExpression p) {try{__CLR4_5_28787lvicmsvr.R.inc(382);
                __CLR4_5_28787lvicmsvr.R.inc(383);OWLClassExpression gciRHS = expandObject(filler, p);
                __CLR4_5_28787lvicmsvr.R.inc(384);if ((((gciRHS != null)&&(__CLR4_5_28787lvicmsvr.R.iget(385)!=0|true))||(__CLR4_5_28787lvicmsvr.R.iget(386)==0&false))) {{
                    __CLR4_5_28787lvicmsvr.R.inc(387);OWLClassExpression gciLHS = dataFactory.getOWLObjectHasValue(p, filler);
                    __CLR4_5_28787lvicmsvr.R.inc(388);OWLEquivalentClassesAxiom ax = dataFactory.getOWLEquivalentClassesAxiom(gciLHS, gciRHS,
                        expansionMarkingAnnotations);
                    __CLR4_5_28787lvicmsvr.R.inc(389);newAxioms.add(ax);
                }
                }__CLR4_5_28787lvicmsvr.R.inc(390);return gciRHS;
            }finally{__CLR4_5_28787lvicmsvr.R.flushNeeded();}}

            private OWLClassExpression expandObject(Object filler, OWLObjectPropertyExpression p) {try{__CLR4_5_28787lvicmsvr.R.inc(391);
                __CLR4_5_28787lvicmsvr.R.inc(392);OWLClassExpression result = null;
                __CLR4_5_28787lvicmsvr.R.inc(393);IRI iri = ((OWLObjectProperty) p).getIRI();
                __CLR4_5_28787lvicmsvr.R.inc(394);IRI templateVal = null;
                __CLR4_5_28787lvicmsvr.R.inc(395);if ((((expandExpressionMap.containsKey(iri))&&(__CLR4_5_28787lvicmsvr.R.iget(396)!=0|true))||(__CLR4_5_28787lvicmsvr.R.iget(397)==0&false))) {{
                    __CLR4_5_28787lvicmsvr.R.inc(398);if ((((filler instanceof OWLObjectOneOf)&&(__CLR4_5_28787lvicmsvr.R.iget(399)!=0|true))||(__CLR4_5_28787lvicmsvr.R.iget(400)==0&false))) {{
                        __CLR4_5_28787lvicmsvr.R.inc(401);Set<OWLIndividual> inds = ((OWLObjectOneOf) filler).getIndividuals();
                        __CLR4_5_28787lvicmsvr.R.inc(402);if ((((inds.size() == 1)&&(__CLR4_5_28787lvicmsvr.R.iget(403)!=0|true))||(__CLR4_5_28787lvicmsvr.R.iget(404)==0&false))) {{
                            __CLR4_5_28787lvicmsvr.R.inc(405);OWLIndividual ind = inds.iterator().next();
                            __CLR4_5_28787lvicmsvr.R.inc(406);if ((((ind instanceof OWLNamedIndividual)&&(__CLR4_5_28787lvicmsvr.R.iget(407)!=0|true))||(__CLR4_5_28787lvicmsvr.R.iget(408)==0&false))) {{
                                __CLR4_5_28787lvicmsvr.R.inc(409);templateVal = ((OWLNamedObject) ind).getIRI();
                            }
                        }}
                    }}
                    }__CLR4_5_28787lvicmsvr.R.inc(410);if ((((filler instanceof OWLNamedObject)&&(__CLR4_5_28787lvicmsvr.R.iget(411)!=0|true))||(__CLR4_5_28787lvicmsvr.R.iget(412)==0&false))) {{
                        __CLR4_5_28787lvicmsvr.R.inc(413);templateVal = ((OWLNamedObject) filler).getIRI();
                    }
                    }__CLR4_5_28787lvicmsvr.R.inc(414);if ((((templateVal != null)&&(__CLR4_5_28787lvicmsvr.R.iget(415)!=0|true))||(__CLR4_5_28787lvicmsvr.R.iget(416)==0&false))) {{
                        __CLR4_5_28787lvicmsvr.R.inc(417);String tStr = expandExpressionMap.get(iri);
                        __CLR4_5_28787lvicmsvr.R.inc(418);String exStr = tStr.replaceAll("\\?Y", manchesterSyntaxTool.getId(templateVal));
                        __CLR4_5_28787lvicmsvr.R.inc(419);try {
                            __CLR4_5_28787lvicmsvr.R.inc(420);result = manchesterSyntaxTool.parseManchesterExpression(exStr);
                        } catch (OWLParserException e) {
                            __CLR4_5_28787lvicmsvr.R.inc(421);LOG.error(e.getMessage(), e);
                        }
                    }
                }}
                }__CLR4_5_28787lvicmsvr.R.inc(422);return result;
            }finally{__CLR4_5_28787lvicmsvr.R.flushNeeded();}}
        }
    }

    public boolean shouldPreserveAnnotationsWhenExpanding() {try{__CLR4_5_28787lvicmsvr.R.inc(423);
        __CLR4_5_28787lvicmsvr.R.inc(424);return preserveAnnotationsWhenExpanding;
    }finally{__CLR4_5_28787lvicmsvr.R.flushNeeded();}}

    public void setPreserveAnnotationsWhenExpanding(boolean preserveAnnotationsWhenExpanding) {try{__CLR4_5_28787lvicmsvr.R.inc(425);
        __CLR4_5_28787lvicmsvr.R.inc(426);this.preserveAnnotationsWhenExpanding = preserveAnnotationsWhenExpanding;
    }finally{__CLR4_5_28787lvicmsvr.R.flushNeeded();}}

    /** Call this method to clear internal references. */
    public void dispose() {try{__CLR4_5_28787lvicmsvr.R.inc(427);
        __CLR4_5_28787lvicmsvr.R.inc(428);manchesterSyntaxTool.dispose();
    }finally{__CLR4_5_28787lvicmsvr.R.flushNeeded();}}
}
