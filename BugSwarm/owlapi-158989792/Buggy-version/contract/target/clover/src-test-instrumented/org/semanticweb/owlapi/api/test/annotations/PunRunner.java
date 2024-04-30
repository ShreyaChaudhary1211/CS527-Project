/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.semanticweb.owlapi.api.test.annotations;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.Nonnull;

import org.junit.runner.Description;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunNotifier;
import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.formats.FunctionalSyntaxDocumentFormat;
import org.semanticweb.owlapi.formats.ManchesterSyntaxDocumentFormat;
import org.semanticweb.owlapi.formats.PrefixDocumentFormat;
import org.semanticweb.owlapi.formats.RDFXMLDocumentFormat;
import org.semanticweb.owlapi.formats.TurtleDocumentFormat;
import org.semanticweb.owlapi.model.AxiomType;
import org.semanticweb.owlapi.model.OWLAnnotationProperty;
import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.OWLDataFactory;
import org.semanticweb.owlapi.model.OWLEntity;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.OWLOntologyManager;
import org.semanticweb.owlapi.model.OWLOntologyStorageException;
import org.semanticweb.owlapi.util.DefaultPrefixManager;

/**
 * Created by ses on 3/2/15.
 */
public class PunRunner extends org.junit.runner.Runner {public static class __CLR4_5_22p02p0lvicnzyt{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,3572,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final Class<?> testClass;

    public PunRunner(Class<?> testClass) {try{__CLR4_5_22p02p0lvicnzyt.R.inc(3492);
        __CLR4_5_22p02p0lvicnzyt.R.inc(3493);this.testClass = testClass;
    }finally{__CLR4_5_22p02p0lvicnzyt.R.flushNeeded();}}

    class TestSetting {

        OWLEntity[] entities;
        Class<? extends PrefixDocumentFormat> formatClass;

        public TestSetting(Class<? extends PrefixDocumentFormat> formatClass,
                OWLEntity... entities) {try{__CLR4_5_22p02p0lvicnzyt.R.inc(3494);
            __CLR4_5_22p02p0lvicnzyt.R.inc(3495);this.formatClass = formatClass;
            __CLR4_5_22p02p0lvicnzyt.R.inc(3496);this.entities = entities;
        }finally{__CLR4_5_22p02p0lvicnzyt.R.flushNeeded();}}
    }

    private Description suiteDescription;
    private Map<Description, TestSetting> testSettings = new HashMap<>();

    @Override
    public Description getDescription() {try{__CLR4_5_22p02p0lvicnzyt.R.inc(3497);
        __CLR4_5_22p02p0lvicnzyt.R.inc(3498);suiteDescription = Description.createSuiteDescription(testClass);
        __CLR4_5_22p02p0lvicnzyt.R.inc(3499);addAllTests();
        __CLR4_5_22p02p0lvicnzyt.R.inc(3500);return suiteDescription;
    }finally{__CLR4_5_22p02p0lvicnzyt.R.flushNeeded();}}

    private void addAllTests() {try{__CLR4_5_22p02p0lvicnzyt.R.inc(3501);
        __CLR4_5_22p02p0lvicnzyt.R.inc(3502);DefaultPrefixManager pm = new DefaultPrefixManager(null, null,
                "http://localhost#");
        __CLR4_5_22p02p0lvicnzyt.R.inc(3503);OWLDataFactory df = OWLManager.getOWLDataFactory();
        __CLR4_5_22p02p0lvicnzyt.R.inc(3504);List<? extends OWLEntity> entities = Arrays.asList(
                df.getOWLClass("a", pm), df.getOWLDatatype("a", pm),
                df.getOWLAnnotationProperty("a", pm),
                df.getOWLDataProperty("a", pm),
                df.getOWLObjectProperty("a", pm),
                df.getOWLNamedIndividual("a", pm));
        __CLR4_5_22p02p0lvicnzyt.R.inc(3505);List<Class<? extends PrefixDocumentFormat>> formats = new ArrayList<>();
        __CLR4_5_22p02p0lvicnzyt.R.inc(3506);formats.add(RDFXMLDocumentFormat.class);
        __CLR4_5_22p02p0lvicnzyt.R.inc(3507);formats.add(TurtleDocumentFormat.class);
        __CLR4_5_22p02p0lvicnzyt.R.inc(3508);formats.add(FunctionalSyntaxDocumentFormat.class);
        __CLR4_5_22p02p0lvicnzyt.R.inc(3509);formats.add(ManchesterSyntaxDocumentFormat.class);
        __CLR4_5_22p02p0lvicnzyt.R.inc(3510);for (Class<? extends PrefixDocumentFormat> formatClass : formats) {{
            __CLR4_5_22p02p0lvicnzyt.R.inc(3511);for (int i = 0; (((i < entities.size())&&(__CLR4_5_22p02p0lvicnzyt.R.iget(3512)!=0|true))||(__CLR4_5_22p02p0lvicnzyt.R.iget(3513)==0&false)); i++) {{
                __CLR4_5_22p02p0lvicnzyt.R.inc(3514);OWLEntity e1 = entities.get(i);
                __CLR4_5_22p02p0lvicnzyt.R.inc(3515);for (int j = i + 1; (((j < entities.size())&&(__CLR4_5_22p02p0lvicnzyt.R.iget(3516)!=0|true))||(__CLR4_5_22p02p0lvicnzyt.R.iget(3517)==0&false)); j++) {{
                    __CLR4_5_22p02p0lvicnzyt.R.inc(3518);OWLEntity e2 = entities.get(j);
                    __CLR4_5_22p02p0lvicnzyt.R.inc(3519);String formatClassName = formatClass.getName();
                    __CLR4_5_22p02p0lvicnzyt.R.inc(3520);int i1 = formatClassName.lastIndexOf('.');
                    __CLR4_5_22p02p0lvicnzyt.R.inc(3521);if ((((i1 > -1)&&(__CLR4_5_22p02p0lvicnzyt.R.iget(3522)!=0|true))||(__CLR4_5_22p02p0lvicnzyt.R.iget(3523)==0&false))) {{
                        __CLR4_5_22p02p0lvicnzyt.R.inc(3524);formatClassName = formatClassName.substring(i1 + 1);
                    }
                    }__CLR4_5_22p02p0lvicnzyt.R.inc(3525);String name = String.format("%sVs%sFor%s",
                            e1.getEntityType(), e2.getEntityType(),
                            formatClassName);
                    __CLR4_5_22p02p0lvicnzyt.R.inc(3526);Description testDescription = Description
                            .createTestDescription(testClass, name);
                    __CLR4_5_22p02p0lvicnzyt.R.inc(3527);testSettings.put(testDescription, new TestSetting(
                            formatClass, e1, e2));
                    __CLR4_5_22p02p0lvicnzyt.R.inc(3528);suiteDescription.addChild(testDescription);
                }
            }}
            }__CLR4_5_22p02p0lvicnzyt.R.inc(3529);String name = "multiPun for " + formatClass.getName();
            __CLR4_5_22p02p0lvicnzyt.R.inc(3530);Description testDescription = Description.createTestDescription(
                    testClass, name);
            __CLR4_5_22p02p0lvicnzyt.R.inc(3531);suiteDescription.addChild(testDescription);
            __CLR4_5_22p02p0lvicnzyt.R.inc(3532);TestSetting setting = new TestSetting(formatClass, df.getOWLClass(
                    "a", pm), df.getOWLDatatype("a", pm),
                    df.getOWLAnnotationProperty("a", pm),
                    df.getOWLDataProperty("a", pm), df.getOWLObjectProperty(
                            "a", pm), df.getOWLNamedIndividual("a", pm));
            __CLR4_5_22p02p0lvicnzyt.R.inc(3533);testSettings.put(testDescription, setting);
        }
    }}finally{__CLR4_5_22p02p0lvicnzyt.R.flushNeeded();}}

    /**
     * Run the tests for this runner.
     *
     * @param notifier
     *        will be notified of events while tests are being run--tests being
     *        started, finishing, and failing
     */
    @Override
    public void run(RunNotifier notifier) {try{__CLR4_5_22p02p0lvicnzyt.R.inc(3534);
        __CLR4_5_22p02p0lvicnzyt.R.inc(3535);for (Map.Entry<Description, TestSetting> entry : testSettings
                .entrySet()) {{
            __CLR4_5_22p02p0lvicnzyt.R.inc(3536);Description description = entry.getKey();
            __CLR4_5_22p02p0lvicnzyt.R.inc(3537);notifier.fireTestStarted(description);
            __CLR4_5_22p02p0lvicnzyt.R.inc(3538);try {
                __CLR4_5_22p02p0lvicnzyt.R.inc(3539);TestSetting setting = entry.getValue();
                __CLR4_5_22p02p0lvicnzyt.R.inc(3540);runTestForAnnotationsOnPunnedEntitiesForFormat(
                        setting.formatClass, setting.entities);
            } catch (Throwable t) {
                __CLR4_5_22p02p0lvicnzyt.R.inc(3541);notifier.fireTestFailure(new Failure(description, t));
            } finally {
                __CLR4_5_22p02p0lvicnzyt.R.inc(3542);notifier.fireTestFinished(description);
            }
        }
    }}finally{__CLR4_5_22p02p0lvicnzyt.R.flushNeeded();}}

    /**
     * @param formatClass
     *        format class
     * @param entities
     *        entities
     * @throws OWLOntologyCreationException
     *         ontology cannot be created
     * @throws OWLOntologyStorageException
     *         ontology cannot be stored
     * @throws IllegalAccessException
     *         class cannot be accessed
     * @throws InstantiationException
     *         class cannot be instantiated
     */
    public void runTestForAnnotationsOnPunnedEntitiesForFormat(
            Class<? extends PrefixDocumentFormat> formatClass,
            OWLEntity... entities) throws OWLOntologyCreationException,
            OWLOntologyStorageException, IllegalAccessException,
            InstantiationException {try{__CLR4_5_22p02p0lvicnzyt.R.inc(3543);
        __CLR4_5_22p02p0lvicnzyt.R.inc(3544);OWLOntologyManager ontologyManager;
        __CLR4_5_22p02p0lvicnzyt.R.inc(3545);OWLDataFactory df;
        __CLR4_5_22p02p0lvicnzyt.R.inc(3546);synchronized (OWLManager.class) {
            __CLR4_5_22p02p0lvicnzyt.R.inc(3547);ontologyManager = OWLManager.createOWLOntologyManager();
            __CLR4_5_22p02p0lvicnzyt.R.inc(3548);df = ontologyManager.getOWLDataFactory();
        }
        __CLR4_5_22p02p0lvicnzyt.R.inc(3549);OWLAnnotationProperty annotationProperty = df.getOWLAnnotationProperty(
                ":ap",
                new DefaultPrefixManager(null, null, "http://localhost#"));
        __CLR4_5_22p02p0lvicnzyt.R.inc(3550);OWLOntology o = makeOwlOntologyWithDeclarationsAndAnnotationAssertions(
                annotationProperty, ontologyManager, entities);
        __CLR4_5_22p02p0lvicnzyt.R.inc(3551);for (int i = 0; (((i < 10)&&(__CLR4_5_22p02p0lvicnzyt.R.iget(3552)!=0|true))||(__CLR4_5_22p02p0lvicnzyt.R.iget(3553)==0&false)); i++) {{
            __CLR4_5_22p02p0lvicnzyt.R.inc(3554);PrefixDocumentFormat format = formatClass.newInstance();
            __CLR4_5_22p02p0lvicnzyt.R.inc(3555);format.setPrefixManager(new DefaultPrefixManager(null, null,
                    "http://localhost#"));
            __CLR4_5_22p02p0lvicnzyt.R.inc(3556);ByteArrayInputStream in = saveForRereading(o, format,
                    ontologyManager);
            __CLR4_5_22p02p0lvicnzyt.R.inc(3557);ontologyManager.removeOntology(o);
            __CLR4_5_22p02p0lvicnzyt.R.inc(3558);o = ontologyManager.loadOntologyFromOntologyDocument(in);
        }
        }__CLR4_5_22p02p0lvicnzyt.R.inc(3559);assertEquals("annotationCount", entities.length,
                o.getAxioms(AxiomType.ANNOTATION_ASSERTION).size());
    }finally{__CLR4_5_22p02p0lvicnzyt.R.flushNeeded();}}

    /**
     * @param annotationProperty
     *        annotation property
     * @param manager
     *        manager
     * @param entities
     *        entities
     * @return new ontology
     * @throws OWLOntologyCreationException
     *         if the ontology cannot be created
     */
    @Nonnull
    public static OWLOntology
            makeOwlOntologyWithDeclarationsAndAnnotationAssertions(
                    @Nonnull OWLAnnotationProperty annotationProperty,
                    OWLOntologyManager manager, OWLEntity... entities)
                    throws OWLOntologyCreationException {try{__CLR4_5_22p02p0lvicnzyt.R.inc(3560);
        __CLR4_5_22p02p0lvicnzyt.R.inc(3561);Set<OWLAxiom> axioms = new HashSet<>();
        __CLR4_5_22p02p0lvicnzyt.R.inc(3562);OWLDataFactory dataFactory = manager.getOWLDataFactory();
        __CLR4_5_22p02p0lvicnzyt.R.inc(3563);axioms.add(dataFactory.getOWLDeclarationAxiom(annotationProperty));
        __CLR4_5_22p02p0lvicnzyt.R.inc(3564);for (OWLEntity entity : entities) {{
            __CLR4_5_22p02p0lvicnzyt.R.inc(3565);axioms.add(dataFactory.getOWLAnnotationAssertionAxiom(
                    annotationProperty, entity.getIRI(),
                    dataFactory.getOWLAnonymousIndividual()));
            __CLR4_5_22p02p0lvicnzyt.R.inc(3566);axioms.add(dataFactory.getOWLDeclarationAxiom(entity));
        }
        }__CLR4_5_22p02p0lvicnzyt.R.inc(3567);return manager.createOntology(axioms);
    }finally{__CLR4_5_22p02p0lvicnzyt.R.flushNeeded();}}

    /**
     * @param o
     *        ontology to save
     * @param format
     *        format to use
     * @param manager
     *        manager
     * @return input stream with the saved ontology
     * @throws OWLOntologyStorageException
     *         if the ontology cannot be saved
     */
    @Nonnull
    public static ByteArrayInputStream saveForRereading(@Nonnull OWLOntology o,
            @Nonnull PrefixDocumentFormat format, OWLOntologyManager manager)
            throws OWLOntologyStorageException {try{__CLR4_5_22p02p0lvicnzyt.R.inc(3568);
        __CLR4_5_22p02p0lvicnzyt.R.inc(3569);ByteArrayOutputStream out = new ByteArrayOutputStream();
        __CLR4_5_22p02p0lvicnzyt.R.inc(3570);manager.saveOntology(o, format, out);
        __CLR4_5_22p02p0lvicnzyt.R.inc(3571);return new ByteArrayInputStream(out.toByteArray());
    }finally{__CLR4_5_22p02p0lvicnzyt.R.flushNeeded();}}
}
