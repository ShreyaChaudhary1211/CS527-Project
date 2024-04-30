/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.obolibrary.obo2owl;

import static org.semanticweb.owlapi.model.parameters.Imports.INCLUDED;

import java.util.*;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.obolibrary.oboformat.model.Frame;
import org.obolibrary.oboformat.parser.OBOFormatConstants.OboFormatTag;
import org.semanticweb.owlapi.model.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Tools for checking and fixing cardinality constrains for OBO ontologies in
 * OWL.
 */
public final class OboInOwlCardinalityTools {public static class __CLR4_5_22no2nolvicmt1q{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u006f\u0062\u006f\u0066\u006f\u0072\u006d\u0061\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237308750L,8589935092L,3588,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    protected static final Logger LOGGER = LoggerFactory.getLogger(OboInOwlCardinalityTools.class);

    private OboInOwlCardinalityTools() {try{__CLR4_5_22no2nolvicmt1q.R.inc(3444);}finally{__CLR4_5_22no2nolvicmt1q.R.flushNeeded();}}

    /**
     * Functor for resolving conflicts for an annotation property and its
     * cardinality constraint.
     */
    public interface AnnotationCardinalityConfictHandler {

        /**
         * Resolve a conflict for a given annotation property and axioms. The
         * result is either a list of resolved axioms or an exception thrown by
         * this method.
         * 
         * @param entity
         *        entity
         * @param property
         *        property
         * @param axioms
         *        axioms
         * @return list of resolved axioms
         * @throws AnnotationCardinalityException
         *         AnnotationCardinalityException
         */
        @Nonnull
        List<OWLAnnotationAssertionAxiom> handleConflict(@Nonnull OWLEntity entity,
            @Nonnull OWLAnnotationProperty property, @Nonnull Collection<OWLAnnotationAssertionAxiom> axioms)
                throws AnnotationCardinalityException;

        /**
         * Resolve a conflict for a given annotation property and ontology
         * annotations. The result is either a list of resolved annotations or
         * an exception thrown by this method.
         * 
         * @param property
         *        property
         * @param ontologyAnnotations
         *        ontologyAnnotations
         * @return list of resolved annotations
         * @throws AnnotationCardinalityException
         *         AnnotationCardinalityException
         */
        @Nonnull
        List<OWLAnnotation> handleConflict(@Nonnull OWLAnnotationProperty property,
            @Nonnull Collection<OWLAnnotation> ontologyAnnotations) throws AnnotationCardinalityException;
    }

    /**
     * Functor for reporting conflicts for an annotation property and its
     * cardinality constraint.
     */
    public interface AnnotationCardinalityReporter {

        /**
         * Report a conflict for a given annotation property and axioms.
         * 
         * @param entity
         *        entity
         * @param property
         *        property
         * @param axioms
         *        axioms
         */
        void reportConflict(@Nonnull OWLEntity entity, @Nonnull OWLAnnotationProperty property,
            @Nonnull Collection<OWLAnnotationAssertionAxiom> axioms);

        /**
         * Report a conflict for a given annotation property and ontology
         * annotations.
         * 
         * @param property
         *        property
         * @param ontologyAnnotations
         *        ontologyAnnotations
         */
        void reportConflict(@Nonnull OWLAnnotationProperty property,
            @Nonnull Collection<OWLAnnotation> ontologyAnnotations);
    }

    /**
     * Exception indication a non-resolvable conflict for an annotation property
     * and its cardinality constraint.
     */
    public static class AnnotationCardinalityException extends Exception {

        // generated
        private static final long serialVersionUID = 40000L;

        /**
         * Create a new Exception.
         * 
         * @param message
         *        message
         * @param cause
         *        cause
         */
        public AnnotationCardinalityException(@Nonnull String message, @Nonnull Throwable cause) {
            super(message, cause);__CLR4_5_22no2nolvicmt1q.R.inc(3446);try{__CLR4_5_22no2nolvicmt1q.R.inc(3445);
        }finally{__CLR4_5_22no2nolvicmt1q.R.flushNeeded();}}

        /**
         * Create a new Exception.
         * 
         * @param message
         *        message
         */
        public AnnotationCardinalityException(@Nonnull String message) {
            super(message);__CLR4_5_22no2nolvicmt1q.R.inc(3448);try{__CLR4_5_22no2nolvicmt1q.R.inc(3447);
        }finally{__CLR4_5_22no2nolvicmt1q.R.flushNeeded();}}
    }

    /**
     * Check the annotations for cardinality violations. Try to resolve
     * conflicts with the given handler.
     * 
     * @param ontology
     *        the target ontology
     * @param reporter
     *        reporter
     * @param handler
     *        the conflict handler
     * @throws AnnotationCardinalityException
     *         throws exception in case a conflict cannot be resolved by the
     *         handler
     * @see Frame#check() for implementation in OBO
     */
    public static void checkAnnotationCardinality(@Nonnull OWLOntology ontology,
        @Nullable AnnotationCardinalityReporter reporter, @Nullable AnnotationCardinalityConfictHandler handler)
            throws AnnotationCardinalityException {try{__CLR4_5_22no2nolvicmt1q.R.inc(3449);
        __CLR4_5_22no2nolvicmt1q.R.inc(3450);OWLOntologyManager manager = ontology.getOWLOntologyManager();
        __CLR4_5_22no2nolvicmt1q.R.inc(3451);OWLDataFactory factory = manager.getOWLDataFactory();
        __CLR4_5_22no2nolvicmt1q.R.inc(3452);Set<OWLAnnotationProperty> headerProperties = getProperties(factory, OboFormatTag.TAG_ONTOLOGY,
            OboFormatTag.TAG_FORMAT_VERSION, OboFormatTag.TAG_DATE, OboFormatTag.TAG_DEFAULT_NAMESPACE,
            OboFormatTag.TAG_SAVED_BY, OboFormatTag.TAG_AUTO_GENERATED_BY);
        __CLR4_5_22no2nolvicmt1q.R.inc(3453);checkOntologyAnnotations(headerProperties, ontology, reporter, handler, manager);
        __CLR4_5_22no2nolvicmt1q.R.inc(3454);Set<OWLAnnotationProperty> properties = getProperties(factory, OboFormatTag.TAG_IS_ANONYMOUS,
            OboFormatTag.TAG_NAME, OboFormatTag.TAG_NAMESPACE, OboFormatTag.TAG_DEF, OboFormatTag.TAG_COMMENT,
            OboFormatTag.TAG_DOMAIN, OboFormatTag.TAG_RANGE, OboFormatTag.TAG_IS_ANTI_SYMMETRIC,
            OboFormatTag.TAG_IS_CYCLIC, OboFormatTag.TAG_IS_REFLEXIVE, OboFormatTag.TAG_IS_SYMMETRIC,
            OboFormatTag.TAG_IS_TRANSITIVE, OboFormatTag.TAG_IS_FUNCTIONAL, OboFormatTag.TAG_IS_INVERSE_FUNCTIONAL,
            OboFormatTag.TAG_IS_OBSELETE, OboFormatTag.TAG_CREATED_BY, OboFormatTag.TAG_CREATION_DATE);
        __CLR4_5_22no2nolvicmt1q.R.inc(3455);for (OWLClass owlClass : ontology.getClassesInSignature(INCLUDED)) {{
            assert (((owlClass != null)&&(__CLR4_5_22no2nolvicmt1q.R.iget(3456)!=0|true))||(__CLR4_5_22no2nolvicmt1q.R.iget(3457)==0&false));
            __CLR4_5_22no2nolvicmt1q.R.inc(3458);checkOwlEntity(owlClass, properties, ontology, reporter, handler, manager);
        }
        }__CLR4_5_22no2nolvicmt1q.R.inc(3459);for (OWLObjectProperty owlProperty : ontology.getObjectPropertiesInSignature(INCLUDED)) {{
            assert (((owlProperty != null)&&(__CLR4_5_22no2nolvicmt1q.R.iget(3460)!=0|true))||(__CLR4_5_22no2nolvicmt1q.R.iget(3461)==0&false));
            __CLR4_5_22no2nolvicmt1q.R.inc(3462);checkOwlEntity(owlProperty, properties, ontology, reporter, handler, manager);
        }
    }}finally{__CLR4_5_22no2nolvicmt1q.R.flushNeeded();}}

    @Nonnull
    private static Set<OWLAnnotationProperty> getProperties(@Nonnull OWLDataFactory factory,
        @Nonnull OboFormatTag... tags) {try{__CLR4_5_22no2nolvicmt1q.R.inc(3463);
        __CLR4_5_22no2nolvicmt1q.R.inc(3464);Set<OWLAnnotationProperty> set = new HashSet<>();
        __CLR4_5_22no2nolvicmt1q.R.inc(3465);for (OboFormatTag tag : tags) {{
            __CLR4_5_22no2nolvicmt1q.R.inc(3466);IRI iri = OWLAPIObo2Owl.trTagToIRI(tag.getTag());
            __CLR4_5_22no2nolvicmt1q.R.inc(3467);OWLAnnotationProperty property = factory.getOWLAnnotationProperty(iri);
            __CLR4_5_22no2nolvicmt1q.R.inc(3468);set.add(property);
        }
        }__CLR4_5_22no2nolvicmt1q.R.inc(3469);return set;
    }finally{__CLR4_5_22no2nolvicmt1q.R.flushNeeded();}}

    private static void checkOntologyAnnotations(@Nonnull Set<OWLAnnotationProperty> properties,
        @Nonnull OWLOntology ontology, @Nullable AnnotationCardinalityReporter reporter,
        @Nullable AnnotationCardinalityConfictHandler handler, @Nonnull OWLOntologyManager manager)
            throws AnnotationCardinalityException {try{__CLR4_5_22no2nolvicmt1q.R.inc(3470);
        __CLR4_5_22no2nolvicmt1q.R.inc(3471);Set<OWLAnnotation> annotations = ontology.getAnnotations();
        __CLR4_5_22no2nolvicmt1q.R.inc(3472);Map<OWLAnnotationProperty, Set<OWLAnnotation>> groupedAnnotations = new HashMap<>();
        __CLR4_5_22no2nolvicmt1q.R.inc(3473);for (OWLAnnotation annotation : annotations) {{
            __CLR4_5_22no2nolvicmt1q.R.inc(3474);OWLAnnotationProperty current = annotation.getProperty();
            __CLR4_5_22no2nolvicmt1q.R.inc(3475);if ((((properties.contains(current))&&(__CLR4_5_22no2nolvicmt1q.R.iget(3476)!=0|true))||(__CLR4_5_22no2nolvicmt1q.R.iget(3477)==0&false))) {{
                __CLR4_5_22no2nolvicmt1q.R.inc(3478);Set<OWLAnnotation> set = groupedAnnotations.get(current);
                __CLR4_5_22no2nolvicmt1q.R.inc(3479);if ((((set == null)&&(__CLR4_5_22no2nolvicmt1q.R.iget(3480)!=0|true))||(__CLR4_5_22no2nolvicmt1q.R.iget(3481)==0&false))) {{
                    __CLR4_5_22no2nolvicmt1q.R.inc(3482);groupedAnnotations.put(current, Collections.singleton(annotation));
                } }else {__CLR4_5_22no2nolvicmt1q.R.inc(3483);if ((((set.size() == 1)&&(__CLR4_5_22no2nolvicmt1q.R.iget(3484)!=0|true))||(__CLR4_5_22no2nolvicmt1q.R.iget(3485)==0&false))) {{
                    __CLR4_5_22no2nolvicmt1q.R.inc(3486);set = new HashSet<>(set);
                    __CLR4_5_22no2nolvicmt1q.R.inc(3487);set.add(annotation);
                    __CLR4_5_22no2nolvicmt1q.R.inc(3488);groupedAnnotations.put(current, set);
                } }else {{
                    __CLR4_5_22no2nolvicmt1q.R.inc(3489);set.add(annotation);
                }
            }}}
        }}
        // check cardinality constraint
        }__CLR4_5_22no2nolvicmt1q.R.inc(3490);for (OWLAnnotationProperty property : groupedAnnotations.keySet()) {{
            assert (((property != null)&&(__CLR4_5_22no2nolvicmt1q.R.iget(3491)!=0|true))||(__CLR4_5_22no2nolvicmt1q.R.iget(3492)==0&false));
            __CLR4_5_22no2nolvicmt1q.R.inc(3493);Set<OWLAnnotation> group = groupedAnnotations.get(property);
            __CLR4_5_22no2nolvicmt1q.R.inc(3494);if ((((group.size() > 1)&&(__CLR4_5_22no2nolvicmt1q.R.iget(3495)!=0|true))||(__CLR4_5_22no2nolvicmt1q.R.iget(3496)==0&false))) {{
                __CLR4_5_22no2nolvicmt1q.R.inc(3497);if ((((reporter != null)&&(__CLR4_5_22no2nolvicmt1q.R.iget(3498)!=0|true))||(__CLR4_5_22no2nolvicmt1q.R.iget(3499)==0&false))) {{
                    // report conflict
                    __CLR4_5_22no2nolvicmt1q.R.inc(3500);reporter.reportConflict(property, group);
                }
                }__CLR4_5_22no2nolvicmt1q.R.inc(3501);if ((((handler != null)&&(__CLR4_5_22no2nolvicmt1q.R.iget(3502)!=0|true))||(__CLR4_5_22no2nolvicmt1q.R.iget(3503)==0&false))) {{
                    // handle conflict
                    // if conflict is not resolvable, throws exception
                    __CLR4_5_22no2nolvicmt1q.R.inc(3504);List<OWLAnnotation> changed = handler.handleConflict(property, group);
                    __CLR4_5_22no2nolvicmt1q.R.inc(3505);for (OWLAnnotation annotation : group) {{
                        assert (((annotation != null)&&(__CLR4_5_22no2nolvicmt1q.R.iget(3506)!=0|true))||(__CLR4_5_22no2nolvicmt1q.R.iget(3507)==0&false));
                        __CLR4_5_22no2nolvicmt1q.R.inc(3508);manager.applyChange(new RemoveOntologyAnnotation(ontology, annotation));
                    }
                    }__CLR4_5_22no2nolvicmt1q.R.inc(3509);for (OWLAnnotation annotation : changed) {{
                        assert (((annotation != null)&&(__CLR4_5_22no2nolvicmt1q.R.iget(3510)!=0|true))||(__CLR4_5_22no2nolvicmt1q.R.iget(3511)==0&false));
                        __CLR4_5_22no2nolvicmt1q.R.inc(3512);manager.applyChange(new AddOntologyAnnotation(ontology, annotation));
                    }
                }}
            }}
        }}
    }}finally{__CLR4_5_22no2nolvicmt1q.R.flushNeeded();}}

    private static void checkOwlEntity(@Nonnull OWLEntity owlClass, @Nonnull Set<OWLAnnotationProperty> properties,
        @Nonnull OWLOntology ontology, @Nullable AnnotationCardinalityReporter reporter,
        @Nullable AnnotationCardinalityConfictHandler handler, @Nonnull OWLOntologyManager manager)
            throws AnnotationCardinalityException {try{__CLR4_5_22no2nolvicmt1q.R.inc(3513);
        __CLR4_5_22no2nolvicmt1q.R.inc(3514);Set<OWLAnnotationAssertionAxiom> axioms = ontology.getAnnotationAssertionAxioms(owlClass.getIRI());
        __CLR4_5_22no2nolvicmt1q.R.inc(3515);Map<OWLAnnotationProperty, Set<OWLAnnotationAssertionAxiom>> groupedAxioms = new HashMap<>();
        __CLR4_5_22no2nolvicmt1q.R.inc(3516);for (OWLAnnotationAssertionAxiom axiom : axioms) {{
            __CLR4_5_22no2nolvicmt1q.R.inc(3517);OWLAnnotationProperty current = axiom.getProperty();
            __CLR4_5_22no2nolvicmt1q.R.inc(3518);if ((((properties.contains(current))&&(__CLR4_5_22no2nolvicmt1q.R.iget(3519)!=0|true))||(__CLR4_5_22no2nolvicmt1q.R.iget(3520)==0&false))) {{
                __CLR4_5_22no2nolvicmt1q.R.inc(3521);Set<OWLAnnotationAssertionAxiom> set = groupedAxioms.get(current);
                __CLR4_5_22no2nolvicmt1q.R.inc(3522);if ((((set == null)&&(__CLR4_5_22no2nolvicmt1q.R.iget(3523)!=0|true))||(__CLR4_5_22no2nolvicmt1q.R.iget(3524)==0&false))) {{
                    __CLR4_5_22no2nolvicmt1q.R.inc(3525);groupedAxioms.put(current, Collections.singleton(axiom));
                } }else {__CLR4_5_22no2nolvicmt1q.R.inc(3526);if ((((set.size() == 1)&&(__CLR4_5_22no2nolvicmt1q.R.iget(3527)!=0|true))||(__CLR4_5_22no2nolvicmt1q.R.iget(3528)==0&false))) {{
                    __CLR4_5_22no2nolvicmt1q.R.inc(3529);set = new HashSet<>(set);
                    __CLR4_5_22no2nolvicmt1q.R.inc(3530);set.add(axiom);
                    __CLR4_5_22no2nolvicmt1q.R.inc(3531);groupedAxioms.put(current, set);
                } }else {{
                    __CLR4_5_22no2nolvicmt1q.R.inc(3532);set.add(axiom);
                }
            }}}
        }}
        // check cardinality constraint
        }__CLR4_5_22no2nolvicmt1q.R.inc(3533);for (OWLAnnotationProperty property : groupedAxioms.keySet()) {{
            assert (((property != null)&&(__CLR4_5_22no2nolvicmt1q.R.iget(3534)!=0|true))||(__CLR4_5_22no2nolvicmt1q.R.iget(3535)==0&false));
            __CLR4_5_22no2nolvicmt1q.R.inc(3536);Set<OWLAnnotationAssertionAxiom> group = groupedAxioms.get(property);
            __CLR4_5_22no2nolvicmt1q.R.inc(3537);if ((((group.size() > 1)&&(__CLR4_5_22no2nolvicmt1q.R.iget(3538)!=0|true))||(__CLR4_5_22no2nolvicmt1q.R.iget(3539)==0&false))) {{
                __CLR4_5_22no2nolvicmt1q.R.inc(3540);if ((((reporter != null)&&(__CLR4_5_22no2nolvicmt1q.R.iget(3541)!=0|true))||(__CLR4_5_22no2nolvicmt1q.R.iget(3542)==0&false))) {{
                    // report conflict
                    __CLR4_5_22no2nolvicmt1q.R.inc(3543);reporter.reportConflict(owlClass, property, group);
                }
                }__CLR4_5_22no2nolvicmt1q.R.inc(3544);if ((((handler != null)&&(__CLR4_5_22no2nolvicmt1q.R.iget(3545)!=0|true))||(__CLR4_5_22no2nolvicmt1q.R.iget(3546)==0&false))) {{
                    // handle conflict
                    // if conflict is not resolvable, throws exception
                    __CLR4_5_22no2nolvicmt1q.R.inc(3547);List<OWLAnnotationAssertionAxiom> changed = handler.handleConflict(owlClass, property, group);
                    __CLR4_5_22no2nolvicmt1q.R.inc(3548);for (OWLAnnotationAssertionAxiom axiom : group) {{
                        assert (((axiom != null)&&(__CLR4_5_22no2nolvicmt1q.R.iget(3549)!=0|true))||(__CLR4_5_22no2nolvicmt1q.R.iget(3550)==0&false));
                        __CLR4_5_22no2nolvicmt1q.R.inc(3551);manager.removeAxiom(ontology, axiom);
                    }
                    }__CLR4_5_22no2nolvicmt1q.R.inc(3552);for (OWLAnnotationAssertionAxiom axiom : changed) {{
                        assert (((axiom != null)&&(__CLR4_5_22no2nolvicmt1q.R.iget(3553)!=0|true))||(__CLR4_5_22no2nolvicmt1q.R.iget(3554)==0&false));
                        __CLR4_5_22no2nolvicmt1q.R.inc(3555);manager.addAxiom(ontology, axiom);
                    }
                }}
            }}
        }}
    }}finally{__CLR4_5_22no2nolvicmt1q.R.flushNeeded();}}

    /**
     * Check the annotations for cardinality violations. Try to resolve
     * conflicts with the default handler.
     * 
     * @param ontology
     *        the target ontology
     * @throws AnnotationCardinalityException
     *         throws exception in case a conflict cannot be resolved by the
     *         handler
     * @see #DEFAULT_HANDLER
     */
    public static void checkAnnotationCardinality(@Nonnull OWLOntology ontology) throws AnnotationCardinalityException {try{__CLR4_5_22no2nolvicmt1q.R.inc(3556);
        __CLR4_5_22no2nolvicmt1q.R.inc(3557);checkAnnotationCardinality(ontology, null, DEFAULT_HANDLER);
    }finally{__CLR4_5_22no2nolvicmt1q.R.flushNeeded();}}

    /**
     * Check the annotations for cardinality violations. Only report violations
     * via the given reporter
     * 
     * @param ontology
     *        the target ontology
     * @param reporter
     *        used to report violations
     */
    public static void checkAnnotationCardinality(@Nonnull OWLOntology ontology,
        AnnotationCardinalityReporter reporter) {try{__CLR4_5_22no2nolvicmt1q.R.inc(3558);
        __CLR4_5_22no2nolvicmt1q.R.inc(3559);try {
            __CLR4_5_22no2nolvicmt1q.R.inc(3560);checkAnnotationCardinality(ontology, reporter, null);
        } catch (AnnotationCardinalityException e) {
            // this will not happen as no handler is registered
            __CLR4_5_22no2nolvicmt1q.R.inc(3561);LOGGER.error("Cardinality exception during report: This isn't supposed to happen.", e);
        }
    }finally{__CLR4_5_22no2nolvicmt1q.R.flushNeeded();}}

    /** default handler */
    @Nonnull
    public static final AnnotationCardinalityConfictHandler DEFAULT_HANDLER = new AnnotationCardinalityConfictHandler() {

        @Nonnull
        @Override
        public List<OWLAnnotationAssertionAxiom> handleConflict(@Nonnull OWLEntity entity,
            @Nonnull OWLAnnotationProperty property, @Nonnull Collection<OWLAnnotationAssertionAxiom> axioms)
                throws AnnotationCardinalityException {try{__CLR4_5_22no2nolvicmt1q.R.inc(3562);
            __CLR4_5_22no2nolvicmt1q.R.inc(3563);if ((((axioms.size() > 1)&&(__CLR4_5_22no2nolvicmt1q.R.iget(3564)!=0|true))||(__CLR4_5_22no2nolvicmt1q.R.iget(3565)==0&false))) {{
                __CLR4_5_22no2nolvicmt1q.R.inc(3566);String tag = OWLAPIOwl2Obo.owlObjectToTag(property);
                __CLR4_5_22no2nolvicmt1q.R.inc(3567);if ((((tag == null)&&(__CLR4_5_22no2nolvicmt1q.R.iget(3568)!=0|true))||(__CLR4_5_22no2nolvicmt1q.R.iget(3569)==0&false))) {{
                    __CLR4_5_22no2nolvicmt1q.R.inc(3570);tag = property.getIRI().toString();
                }
                // take the first one in the collection
                // (may be random)
                }__CLR4_5_22no2nolvicmt1q.R.inc(3571);LOGGER.info("Fixing multiple {} tags for entity: {}", tag, entity.getIRI());
                __CLR4_5_22no2nolvicmt1q.R.inc(3572);return listOfFirst(axioms);
            }
            }__CLR4_5_22no2nolvicmt1q.R.inc(3573);throw new AnnotationCardinalityException("Could not resolve conflict for property: " + property);
        }finally{__CLR4_5_22no2nolvicmt1q.R.flushNeeded();}}

        @Nonnull
        @Override
        public List<OWLAnnotation> handleConflict(@Nonnull OWLAnnotationProperty property,
            @Nonnull Collection<OWLAnnotation> ontologyAnnotations) throws AnnotationCardinalityException {try{__CLR4_5_22no2nolvicmt1q.R.inc(3574);
            __CLR4_5_22no2nolvicmt1q.R.inc(3575);if ((((ontologyAnnotations.size() > 1)&&(__CLR4_5_22no2nolvicmt1q.R.iget(3576)!=0|true))||(__CLR4_5_22no2nolvicmt1q.R.iget(3577)==0&false))) {{
                __CLR4_5_22no2nolvicmt1q.R.inc(3578);String tag = OWLAPIOwl2Obo.owlObjectToTag(property);
                __CLR4_5_22no2nolvicmt1q.R.inc(3579);if ((((tag == null)&&(__CLR4_5_22no2nolvicmt1q.R.iget(3580)!=0|true))||(__CLR4_5_22no2nolvicmt1q.R.iget(3581)==0&false))) {{
                    __CLR4_5_22no2nolvicmt1q.R.inc(3582);tag = property.getIRI().toString();
                }
                // take the first one in the collection
                // (may be random)
                }__CLR4_5_22no2nolvicmt1q.R.inc(3583);LOGGER.info("Fixing multiple ontolgy annotations with, tag: {}", tag);
                __CLR4_5_22no2nolvicmt1q.R.inc(3584);return listOfFirst(ontologyAnnotations);
            }
            }__CLR4_5_22no2nolvicmt1q.R.inc(3585);throw new AnnotationCardinalityException("Could not resolve conflict for property: " + property);
        }finally{__CLR4_5_22no2nolvicmt1q.R.flushNeeded();}}
    };

    @Nonnull
    static <T> List<T> listOfFirst(Collection<T> t) {try{__CLR4_5_22no2nolvicmt1q.R.inc(3586);
        __CLR4_5_22no2nolvicmt1q.R.inc(3587);return Collections.singletonList(t.iterator().next());
    }finally{__CLR4_5_22no2nolvicmt1q.R.flushNeeded();}}
}
