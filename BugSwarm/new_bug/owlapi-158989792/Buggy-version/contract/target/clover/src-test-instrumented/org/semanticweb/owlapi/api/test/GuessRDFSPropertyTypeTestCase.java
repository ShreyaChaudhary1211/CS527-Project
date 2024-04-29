/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.semanticweb.owlapi.api.test;

import static org.junit.Assert.*;
import static org.semanticweb.owlapi.model.parameters.Imports.INCLUDED;

import java.io.InputStream;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;

import javax.annotation.Nonnull;

import org.junit.Before;
import org.junit.Test;
import org.semanticweb.owlapi.api.test.baseclasses.TestBase;
import org.semanticweb.owlapi.formats.PrefixDocumentFormat;
import org.semanticweb.owlapi.io.StreamDocumentSource;
import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.search.Filters;
import org.semanticweb.owlapi.search.Searcher;

/**
 * This is a test of the property type guessing for rdf:Property instances of
 * the kind encountered when attempting to parse an rdfs schema.
 * <p/>
 * The CIDOC schema is a good test case, because it every property has a domain
 * and a range specified; some properties have a range of Literal (and hence are
 * data properties), and there are subclass relations specified for both data
 * and object properties.
 * <p/>
 * There should be no Annotation Properties.
 * <p/>
 * See <a href="http://www.cidoc-crm.org/">The CIDOC Web Site</a> for more
 * details.
 */
@SuppressWarnings({ "javadoc", "null" })
public class GuessRDFSPropertyTypeTestCase extends TestBase {static class __CLR4_5_21vx1vxlvicnzf5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,2525,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Nonnull private static final String CIDOC_FILE = "/cidoc_crm_v5.0.4_official_release.rdfs.xml";
    @Nonnull private static final String CIDOC_PREFIX = "http://www.cidoc-crm.org/cidoc-crm/";
    @Nonnull private OWLOntology cidocOntology;
    @Nonnull private PrefixDocumentFormat prefixOWLOntologyFormat;

    @Before
    public void setUp() throws OWLOntologyCreationException {try{__CLR4_5_21vx1vxlvicnzf5.R.inc(2445);
        __CLR4_5_21vx1vxlvicnzf5.R.inc(2446);OWLOntologyLoaderConfiguration config = new OWLOntologyLoaderConfiguration().setStrict(false);
        __CLR4_5_21vx1vxlvicnzf5.R.inc(2447);@SuppressWarnings("resource") InputStream in = getClass().getResourceAsStream(CIDOC_FILE);
        __CLR4_5_21vx1vxlvicnzf5.R.inc(2448);assertNotNull("can't find CIDOC_FILE", in);
        __CLR4_5_21vx1vxlvicnzf5.R.inc(2449);cidocOntology = m.loadOntologyFromOntologyDocument(new StreamDocumentSource(in), config);
        __CLR4_5_21vx1vxlvicnzf5.R.inc(2450);assertNotNull(cidocOntology);
        __CLR4_5_21vx1vxlvicnzf5.R.inc(2451);OWLDocumentFormat format = m.getOntologyFormat(cidocOntology);
        __CLR4_5_21vx1vxlvicnzf5.R.inc(2452);assertNotNull(format);
        __CLR4_5_21vx1vxlvicnzf5.R.inc(2453);assertTrue(format.isPrefixOWLOntologyFormat());
        __CLR4_5_21vx1vxlvicnzf5.R.inc(2454);prefixOWLOntologyFormat = format.asPrefixOWLOntologyFormat();
        __CLR4_5_21vx1vxlvicnzf5.R.inc(2455);prefixOWLOntologyFormat.setDefaultPrefix(CIDOC_PREFIX);
    }finally{__CLR4_5_21vx1vxlvicnzf5.R.flushNeeded();}}

    @Test
    public void testObjectProperty() {__CLR4_5_21vx1vxlvicnzf5.R.globalSliceStart(getClass().getName(),2456);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2u4usbx1w8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21vx1vxlvicnzf5.R.rethrow($CLV_t2$);}finally{__CLR4_5_21vx1vxlvicnzf5.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.GuessRDFSPropertyTypeTestCase.testObjectProperty",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2456,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2u4usbx1w8(){try{__CLR4_5_21vx1vxlvicnzf5.R.inc(2456);
        __CLR4_5_21vx1vxlvicnzf5.R.inc(2457);testProperty("P11_had_participant", "E5_Event", "E39_Actor", "P12_occurred_in_the_presence_of");
    }finally{__CLR4_5_21vx1vxlvicnzf5.R.flushNeeded();}}

    @Test
    public void testDataProperty() {__CLR4_5_21vx1vxlvicnzf5.R.globalSliceStart(getClass().getName(),2458);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26u6pag1wa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21vx1vxlvicnzf5.R.rethrow($CLV_t2$);}finally{__CLR4_5_21vx1vxlvicnzf5.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.GuessRDFSPropertyTypeTestCase.testDataProperty",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2458,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26u6pag1wa(){try{__CLR4_5_21vx1vxlvicnzf5.R.inc(2458);
        __CLR4_5_21vx1vxlvicnzf5.R.inc(2459);testProperty("P79_beginning_is_qualified_by", "E52_Time-Span", "http://www.w3.org/2000/01/rdf-schema#Literal",
            "P3_has_note");
    }finally{__CLR4_5_21vx1vxlvicnzf5.R.flushNeeded();}}

    public void testProperty(@Nonnull String propertyName, @Nonnull String expectedDomain,
        @Nonnull String expectedRange, @Nonnull String expectedSuperProperty) {try{__CLR4_5_21vx1vxlvicnzf5.R.inc(2460);
        __CLR4_5_21vx1vxlvicnzf5.R.inc(2461);IRI p11IRI = prefixOWLOntologyFormat.getIRI(propertyName);
        __CLR4_5_21vx1vxlvicnzf5.R.inc(2462);Set<OWLEntity> hadParticipant = cidocOntology.getEntitiesInSignature(p11IRI);
        __CLR4_5_21vx1vxlvicnzf5.R.inc(2463);assertEquals("should have found " + propertyName, 1, hadParticipant.size());
        __CLR4_5_21vx1vxlvicnzf5.R.inc(2464);OWLEntity entity = hadParticipant.iterator().next();
        __CLR4_5_21vx1vxlvicnzf5.R.inc(2465);assertTrue("EntityType", OWLProperty.class.isAssignableFrom(entity.getClass()));
        __CLR4_5_21vx1vxlvicnzf5.R.inc(2466);if ((((entity instanceof OWLObjectProperty)&&(__CLR4_5_21vx1vxlvicnzf5.R.iget(2467)!=0|true))||(__CLR4_5_21vx1vxlvicnzf5.R.iget(2468)==0&false))) {{
            __CLR4_5_21vx1vxlvicnzf5.R.inc(2469);testProperty((OWLObjectProperty) entity, expectedDomain, expectedRange, expectedSuperProperty);
        }
        }__CLR4_5_21vx1vxlvicnzf5.R.inc(2470);if ((((entity instanceof OWLDataProperty)&&(__CLR4_5_21vx1vxlvicnzf5.R.iget(2471)!=0|true))||(__CLR4_5_21vx1vxlvicnzf5.R.iget(2472)==0&false))) {{
            __CLR4_5_21vx1vxlvicnzf5.R.inc(2473);testProperty((OWLDataProperty) entity, expectedDomain, expectedRange, expectedSuperProperty);
        }
    }}finally{__CLR4_5_21vx1vxlvicnzf5.R.flushNeeded();}}

    private void testProperty(@Nonnull OWLObjectProperty p11property, @Nonnull String expectedDomain,
        @Nonnull String expectedRange, @Nonnull String expectedSuperProperty) {try{__CLR4_5_21vx1vxlvicnzf5.R.inc(2474);
        __CLR4_5_21vx1vxlvicnzf5.R.inc(2475);Collection<OWLClassExpression> ranges = Searcher.range(cidocOntology.getObjectPropertyRangeAxioms(p11property));
        __CLR4_5_21vx1vxlvicnzf5.R.inc(2476);assertEquals("should have 1 range", 1, ranges.size());
        __CLR4_5_21vx1vxlvicnzf5.R.inc(2477);HasIRI range = (HasIRI) ranges.iterator().next();
        __CLR4_5_21vx1vxlvicnzf5.R.inc(2478);IRI rangeIRI = range.getIRI();
        __CLR4_5_21vx1vxlvicnzf5.R.inc(2479);IRI expectedIRI = IRI.create(expectedRange);
        __CLR4_5_21vx1vxlvicnzf5.R.inc(2480);if ((((!expectedIRI.isAbsolute())&&(__CLR4_5_21vx1vxlvicnzf5.R.iget(2481)!=0|true))||(__CLR4_5_21vx1vxlvicnzf5.R.iget(2482)==0&false))) {{
            __CLR4_5_21vx1vxlvicnzf5.R.inc(2483);expectedIRI = prefixOWLOntologyFormat.getIRI(expectedRange);
        }
        }__CLR4_5_21vx1vxlvicnzf5.R.inc(2484);assertEquals("range", expectedIRI, rangeIRI);
        __CLR4_5_21vx1vxlvicnzf5.R.inc(2485);Collection<OWLClassExpression> domains = Searcher.domain(cidocOntology.getObjectPropertyDomainAxioms(
            p11property));
        // p11_property .getDomains(cidocOntology);
        __CLR4_5_21vx1vxlvicnzf5.R.inc(2486);assertEquals("should have 1 domain", 1, domains.size());
        __CLR4_5_21vx1vxlvicnzf5.R.inc(2487);HasIRI domain = (HasIRI) domains.iterator().next();
        __CLR4_5_21vx1vxlvicnzf5.R.inc(2488);IRI domainIRI = domain.getIRI();
        __CLR4_5_21vx1vxlvicnzf5.R.inc(2489);assertEquals("domain should be E5_Event", prefixOWLOntologyFormat.getIRI(expectedDomain), domainIRI);
        __CLR4_5_21vx1vxlvicnzf5.R.inc(2490);Collection<OWLObjectPropertyExpression> superProperties = Searcher.sup(cidocOntology.filterAxioms(
            Filters.subObjectPropertyWithSub, p11property, INCLUDED));
        // Set<OWLPropertyExpression> superProperties =
        // p11_property.getSuperProperties(cidocOntology);
        __CLR4_5_21vx1vxlvicnzf5.R.inc(2491);assertEquals("should have 1 super Property", 1, superProperties.size());
        __CLR4_5_21vx1vxlvicnzf5.R.inc(2492);HasIRI superProperty = (HasIRI) superProperties.iterator().next();
        __CLR4_5_21vx1vxlvicnzf5.R.inc(2493);IRI superPropertyIRI = superProperty.getIRI();
        __CLR4_5_21vx1vxlvicnzf5.R.inc(2494);assertEquals("super property ", prefixOWLOntologyFormat.getIRI(expectedSuperProperty), superPropertyIRI);
    }finally{__CLR4_5_21vx1vxlvicnzf5.R.flushNeeded();}}

    private void testProperty(@Nonnull OWLDataProperty p11property, @Nonnull String expectedDomain,
        @Nonnull String expectedRange, @Nonnull String expectedSuperProperty) {try{__CLR4_5_21vx1vxlvicnzf5.R.inc(2495);
        __CLR4_5_21vx1vxlvicnzf5.R.inc(2496);Collection<OWLClassExpression> ranges = Searcher.range(cidocOntology.getDataPropertyRangeAxioms(p11property));
        __CLR4_5_21vx1vxlvicnzf5.R.inc(2497);assertEquals("should have 1 range", 1, ranges.size());
        __CLR4_5_21vx1vxlvicnzf5.R.inc(2498);HasIRI range = (HasIRI) ranges.iterator().next();
        __CLR4_5_21vx1vxlvicnzf5.R.inc(2499);IRI rangeIRI = range.getIRI();
        __CLR4_5_21vx1vxlvicnzf5.R.inc(2500);IRI expectedIRI = IRI.create(expectedRange);
        __CLR4_5_21vx1vxlvicnzf5.R.inc(2501);if ((((!expectedIRI.isAbsolute())&&(__CLR4_5_21vx1vxlvicnzf5.R.iget(2502)!=0|true))||(__CLR4_5_21vx1vxlvicnzf5.R.iget(2503)==0&false))) {{
            __CLR4_5_21vx1vxlvicnzf5.R.inc(2504);expectedIRI = prefixOWLOntologyFormat.getIRI(expectedRange);
        }
        }__CLR4_5_21vx1vxlvicnzf5.R.inc(2505);assertEquals("range", expectedIRI, rangeIRI);
        __CLR4_5_21vx1vxlvicnzf5.R.inc(2506);Collection<OWLClassExpression> domains = Searcher.domain(cidocOntology.getDataPropertyDomainAxioms(
            p11property));
        // p11_property .getDomains(cidocOntology);
        __CLR4_5_21vx1vxlvicnzf5.R.inc(2507);assertEquals("should have 1 domain", 1, domains.size());
        __CLR4_5_21vx1vxlvicnzf5.R.inc(2508);HasIRI domain = (HasIRI) domains.iterator().next();
        __CLR4_5_21vx1vxlvicnzf5.R.inc(2509);IRI domainIRI = domain.getIRI();
        __CLR4_5_21vx1vxlvicnzf5.R.inc(2510);assertEquals("domain should be E5_Event", prefixOWLOntologyFormat.getIRI(expectedDomain), domainIRI);
        __CLR4_5_21vx1vxlvicnzf5.R.inc(2511);Collection<OWLObjectPropertyExpression> superProperties = Searcher.sup(cidocOntology.filterAxioms(
            Filters.subDataPropertyWithSub, p11property, INCLUDED));
        // Set<OWLPropertyExpression> superProperties =
        // p11_property.getSuperProperties(cidocOntology);
        __CLR4_5_21vx1vxlvicnzf5.R.inc(2512);assertEquals("should have 1 super Property", 1, superProperties.size());
        __CLR4_5_21vx1vxlvicnzf5.R.inc(2513);HasIRI superProperty = (HasIRI) superProperties.iterator().next();
        __CLR4_5_21vx1vxlvicnzf5.R.inc(2514);IRI superPropertyIRI = superProperty.getIRI();
        __CLR4_5_21vx1vxlvicnzf5.R.inc(2515);assertEquals("super property ", prefixOWLOntologyFormat.getIRI(expectedSuperProperty), superPropertyIRI);
    }finally{__CLR4_5_21vx1vxlvicnzf5.R.flushNeeded();}}

    @Test
    public void testObjectPropertyAndDataPropertySetsNonTriviallyDisjoint() {__CLR4_5_21vx1vxlvicnzf5.R.globalSliceStart(getClass().getName(),2516);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26mymq51xw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21vx1vxlvicnzf5.R.rethrow($CLV_t2$);}finally{__CLR4_5_21vx1vxlvicnzf5.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.GuessRDFSPropertyTypeTestCase.testObjectPropertyAndDataPropertySetsNonTriviallyDisjoint",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2516,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26mymq51xw(){try{__CLR4_5_21vx1vxlvicnzf5.R.inc(2516);
        __CLR4_5_21vx1vxlvicnzf5.R.inc(2517);Set<OWLObjectProperty> objectProperties = cidocOntology.getObjectPropertiesInSignature();
        __CLR4_5_21vx1vxlvicnzf5.R.inc(2518);Set<OWLDataProperty> dataProperties = cidocOntology.getDataPropertiesInSignature();
        __CLR4_5_21vx1vxlvicnzf5.R.inc(2519);assertFalse("should have some object Properties", objectProperties.isEmpty());
        __CLR4_5_21vx1vxlvicnzf5.R.inc(2520);assertFalse("should have some data Properties", dataProperties.isEmpty());
        __CLR4_5_21vx1vxlvicnzf5.R.inc(2521);assertTrue("object properties and data properties should be disjoint", Collections.disjoint(objectProperties,
            dataProperties));
    }finally{__CLR4_5_21vx1vxlvicnzf5.R.flushNeeded();}}

    @Test
    public void testAnnotationPropertyCount() {__CLR4_5_21vx1vxlvicnzf5.R.globalSliceStart(getClass().getName(),2522);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2k67m2o1y2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21vx1vxlvicnzf5.R.rethrow($CLV_t2$);}finally{__CLR4_5_21vx1vxlvicnzf5.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.GuessRDFSPropertyTypeTestCase.testAnnotationPropertyCount",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2522,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2k67m2o1y2(){try{__CLR4_5_21vx1vxlvicnzf5.R.inc(2522);
        __CLR4_5_21vx1vxlvicnzf5.R.inc(2523);Set<OWLAnnotationProperty> annotationProperties = cidocOntology.getAnnotationPropertiesInSignature(INCLUDED);
        __CLR4_5_21vx1vxlvicnzf5.R.inc(2524);assertEquals("should only have 2 rdfs annotation properties", 2, annotationProperties.size());
    }finally{__CLR4_5_21vx1vxlvicnzf5.R.flushNeeded();}}
}
