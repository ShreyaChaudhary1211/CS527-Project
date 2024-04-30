/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package uk.ac.manchester.cs.owl.owlapi;

import static org.semanticweb.owlapi.model.parameters.Imports.EXCLUDED;
import static org.semanticweb.owlapi.model.parameters.Navigation.*;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.model.OWLAnnotationAssertionAxiom;
import org.semanticweb.owlapi.model.OWLAnnotationProperty;
import org.semanticweb.owlapi.model.OWLAnnotationPropertyDomainAxiom;
import org.semanticweb.owlapi.model.OWLAnnotationPropertyRangeAxiom;
import org.semanticweb.owlapi.model.OWLAnnotationSubject;
import org.semanticweb.owlapi.model.OWLAsymmetricObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.OWLAxiomIndex;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLClassAssertionAxiom;
import org.semanticweb.owlapi.model.OWLClassExpression;
import org.semanticweb.owlapi.model.OWLDataProperty;
import org.semanticweb.owlapi.model.OWLDataPropertyAssertionAxiom;
import org.semanticweb.owlapi.model.OWLDataPropertyDomainAxiom;
import org.semanticweb.owlapi.model.OWLDataPropertyExpression;
import org.semanticweb.owlapi.model.OWLDataPropertyRangeAxiom;
import org.semanticweb.owlapi.model.OWLDatatype;
import org.semanticweb.owlapi.model.OWLDatatypeDefinitionAxiom;
import org.semanticweb.owlapi.model.OWLDeclarationAxiom;
import org.semanticweb.owlapi.model.OWLDifferentIndividualsAxiom;
import org.semanticweb.owlapi.model.OWLDisjointClassesAxiom;
import org.semanticweb.owlapi.model.OWLDisjointDataPropertiesAxiom;
import org.semanticweb.owlapi.model.OWLDisjointObjectPropertiesAxiom;
import org.semanticweb.owlapi.model.OWLDisjointUnionAxiom;
import org.semanticweb.owlapi.model.OWLEntity;
import org.semanticweb.owlapi.model.OWLEquivalentClassesAxiom;
import org.semanticweb.owlapi.model.OWLEquivalentDataPropertiesAxiom;
import org.semanticweb.owlapi.model.OWLEquivalentObjectPropertiesAxiom;
import org.semanticweb.owlapi.model.OWLFunctionalDataPropertyAxiom;
import org.semanticweb.owlapi.model.OWLFunctionalObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLHasKeyAxiom;
import org.semanticweb.owlapi.model.OWLIndividual;
import org.semanticweb.owlapi.model.OWLInverseFunctionalObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLInverseObjectPropertiesAxiom;
import org.semanticweb.owlapi.model.OWLIrreflexiveObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLNegativeDataPropertyAssertionAxiom;
import org.semanticweb.owlapi.model.OWLNegativeObjectPropertyAssertionAxiom;
import org.semanticweb.owlapi.model.OWLObjectPropertyAssertionAxiom;
import org.semanticweb.owlapi.model.OWLObjectPropertyDomainAxiom;
import org.semanticweb.owlapi.model.OWLObjectPropertyExpression;
import org.semanticweb.owlapi.model.OWLObjectPropertyRangeAxiom;
import org.semanticweb.owlapi.model.OWLReflexiveObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLSameIndividualAxiom;
import org.semanticweb.owlapi.model.OWLSubAnnotationPropertyOfAxiom;
import org.semanticweb.owlapi.model.OWLSubClassOfAxiom;
import org.semanticweb.owlapi.model.OWLSubDataPropertyOfAxiom;
import org.semanticweb.owlapi.model.OWLSubObjectPropertyOfAxiom;
import org.semanticweb.owlapi.model.OWLSymmetricObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLTransitiveObjectPropertyAxiom;
import org.semanticweb.owlapi.search.Filters;

/**
 * @author ignazio
 * @since 4.0.0
 */
public abstract class OWLAxiomIndexImpl extends
        OWLObjectImplWithEntityAndAnonCaching implements OWLAxiomIndex,
        HasTrimToSize {public static class __CLR4_5_22np2nplviclfg2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u006d\u0070\u006c\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237243416L,8589935092L,3541,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 40000L;
    @Nonnull
    protected final Internals ints = new Internals();

    @Override
    public void trimToSize() {try{__CLR4_5_22np2nplviclfg2.R.inc(3445);
        __CLR4_5_22np2nplviclfg2.R.inc(3446);ints.trimToSize();
    }finally{__CLR4_5_22np2nplviclfg2.R.flushNeeded();}}

    @Override
    public Set<OWLDeclarationAxiom> getDeclarationAxioms(OWLEntity subject) {try{__CLR4_5_22np2nplviclfg2.R.inc(3447);
        __CLR4_5_22np2nplviclfg2.R.inc(3448);return getAxioms(OWLDeclarationAxiom.class, subject, EXCLUDED,
                IN_SUB_POSITION);
    }finally{__CLR4_5_22np2nplviclfg2.R.flushNeeded();}}

    @Override
    public Set<OWLAnnotationAssertionAxiom> getAnnotationAssertionAxioms(
            OWLAnnotationSubject entity) {try{__CLR4_5_22np2nplviclfg2.R.inc(3449);
        __CLR4_5_22np2nplviclfg2.R.inc(3450);return getAxioms(OWLAnnotationAssertionAxiom.class,
                OWLAnnotationSubject.class, entity, EXCLUDED, IN_SUB_POSITION);
    }finally{__CLR4_5_22np2nplviclfg2.R.flushNeeded();}}

    @Override
    public Set<OWLDatatypeDefinitionAxiom> getDatatypeDefinitions(
            OWLDatatype datatype) {try{__CLR4_5_22np2nplviclfg2.R.inc(3451);
        __CLR4_5_22np2nplviclfg2.R.inc(3452);Set<OWLDatatypeDefinitionAxiom> toReturn = new HashSet<>();
        __CLR4_5_22np2nplviclfg2.R.inc(3453);for (OWLAxiom ax : ints.filterAxioms(Filters.datatypeDefFilter,
                datatype)) {{
            __CLR4_5_22np2nplviclfg2.R.inc(3454);toReturn.add((OWLDatatypeDefinitionAxiom) ax);
        }
        }__CLR4_5_22np2nplviclfg2.R.inc(3455);return toReturn;
    }finally{__CLR4_5_22np2nplviclfg2.R.flushNeeded();}}

    @Override
    public Set<OWLSubAnnotationPropertyOfAxiom>
            getSubAnnotationPropertyOfAxioms(OWLAnnotationProperty subProperty) {try{__CLR4_5_22np2nplviclfg2.R.inc(3456);
        __CLR4_5_22np2nplviclfg2.R.inc(3457);Set<OWLSubAnnotationPropertyOfAxiom> toReturn = new HashSet<>();
        __CLR4_5_22np2nplviclfg2.R.inc(3458);for (OWLAxiom ax : ints.filterAxioms(Filters.subAnnotationWithSub,
                subProperty)) {{
            __CLR4_5_22np2nplviclfg2.R.inc(3459);toReturn.add((OWLSubAnnotationPropertyOfAxiom) ax);
        }
        }__CLR4_5_22np2nplviclfg2.R.inc(3460);return toReturn;
    }finally{__CLR4_5_22np2nplviclfg2.R.flushNeeded();}}

    @Override
    public Set<OWLAnnotationPropertyDomainAxiom>
            getAnnotationPropertyDomainAxioms(OWLAnnotationProperty property) {try{__CLR4_5_22np2nplviclfg2.R.inc(3461);
        __CLR4_5_22np2nplviclfg2.R.inc(3462);Set<OWLAnnotationPropertyDomainAxiom> toReturn = new HashSet<>();
        __CLR4_5_22np2nplviclfg2.R.inc(3463);for (OWLAxiom ax : ints.filterAxioms(Filters.apDomainFilter, property)) {{
            __CLR4_5_22np2nplviclfg2.R.inc(3464);toReturn.add((OWLAnnotationPropertyDomainAxiom) ax);
        }
        }__CLR4_5_22np2nplviclfg2.R.inc(3465);return toReturn;
    }finally{__CLR4_5_22np2nplviclfg2.R.flushNeeded();}}

    @Override
    public Set<OWLAnnotationPropertyRangeAxiom>
            getAnnotationPropertyRangeAxioms(OWLAnnotationProperty property) {try{__CLR4_5_22np2nplviclfg2.R.inc(3466);
        __CLR4_5_22np2nplviclfg2.R.inc(3467);Set<OWLAnnotationPropertyRangeAxiom> toReturn = new HashSet<>();
        __CLR4_5_22np2nplviclfg2.R.inc(3468);for (OWLAxiom ax : ints.filterAxioms(Filters.apRangeFilter, property)) {{
            __CLR4_5_22np2nplviclfg2.R.inc(3469);toReturn.add((OWLAnnotationPropertyRangeAxiom) ax);
        }
        }__CLR4_5_22np2nplviclfg2.R.inc(3470);return toReturn;
    }finally{__CLR4_5_22np2nplviclfg2.R.flushNeeded();}}

    @Override
    public Set<OWLSubClassOfAxiom> getSubClassAxiomsForSubClass(OWLClass cls) {try{__CLR4_5_22np2nplviclfg2.R.inc(3471);
        __CLR4_5_22np2nplviclfg2.R.inc(3472);return getAxioms(OWLSubClassOfAxiom.class, OWLClass.class, cls,
                EXCLUDED, IN_SUB_POSITION);
    }finally{__CLR4_5_22np2nplviclfg2.R.flushNeeded();}}

    @Override
    public Set<OWLSubClassOfAxiom> getSubClassAxiomsForSuperClass(OWLClass cls) {try{__CLR4_5_22np2nplviclfg2.R.inc(3473);
        __CLR4_5_22np2nplviclfg2.R.inc(3474);return getAxioms(OWLSubClassOfAxiom.class, OWLClass.class, cls,
                EXCLUDED, IN_SUPER_POSITION);
    }finally{__CLR4_5_22np2nplviclfg2.R.flushNeeded();}}

    @Override
    public Set<OWLEquivalentClassesAxiom> getEquivalentClassesAxioms(
            OWLClass cls) {try{__CLR4_5_22np2nplviclfg2.R.inc(3475);
        __CLR4_5_22np2nplviclfg2.R.inc(3476);return getAxioms(OWLEquivalentClassesAxiom.class, OWLClass.class, cls,
                EXCLUDED, IN_SUB_POSITION);
    }finally{__CLR4_5_22np2nplviclfg2.R.flushNeeded();}}

    @Override
    public Set<OWLDisjointClassesAxiom> getDisjointClassesAxioms(OWLClass cls) {try{__CLR4_5_22np2nplviclfg2.R.inc(3477);
        __CLR4_5_22np2nplviclfg2.R.inc(3478);return getAxioms(OWLDisjointClassesAxiom.class, OWLClass.class, cls,
                EXCLUDED, IN_SUB_POSITION);
    }finally{__CLR4_5_22np2nplviclfg2.R.flushNeeded();}}

    @Override
    public Set<OWLDisjointUnionAxiom> getDisjointUnionAxioms(OWLClass owlClass) {try{__CLR4_5_22np2nplviclfg2.R.inc(3479);
        __CLR4_5_22np2nplviclfg2.R.inc(3480);return getAxioms(OWLDisjointUnionAxiom.class, OWLClass.class, owlClass,
                EXCLUDED, IN_SUB_POSITION);
    }finally{__CLR4_5_22np2nplviclfg2.R.flushNeeded();}}

    @Override
    public Set<OWLHasKeyAxiom> getHasKeyAxioms(OWLClass cls) {try{__CLR4_5_22np2nplviclfg2.R.inc(3481);
        __CLR4_5_22np2nplviclfg2.R.inc(3482);return getAxioms(OWLHasKeyAxiom.class, OWLClass.class, cls, EXCLUDED,
                IN_SUB_POSITION);
    }finally{__CLR4_5_22np2nplviclfg2.R.flushNeeded();}}

    // Object properties
    @Override
    public Set<OWLSubObjectPropertyOfAxiom>
            getObjectSubPropertyAxiomsForSubProperty(
                    OWLObjectPropertyExpression subProperty) {try{__CLR4_5_22np2nplviclfg2.R.inc(3483);
        __CLR4_5_22np2nplviclfg2.R.inc(3484);return getAxioms(OWLSubObjectPropertyOfAxiom.class,
                OWLObjectPropertyExpression.class, subProperty, EXCLUDED,
                IN_SUB_POSITION);
    }finally{__CLR4_5_22np2nplviclfg2.R.flushNeeded();}}

    @Override
    public Set<OWLSubObjectPropertyOfAxiom>
            getObjectSubPropertyAxiomsForSuperProperty(
                    OWLObjectPropertyExpression superProperty) {try{__CLR4_5_22np2nplviclfg2.R.inc(3485);
        __CLR4_5_22np2nplviclfg2.R.inc(3486);return getAxioms(OWLSubObjectPropertyOfAxiom.class,
                OWLObjectPropertyExpression.class, superProperty, EXCLUDED,
                IN_SUPER_POSITION);
    }finally{__CLR4_5_22np2nplviclfg2.R.flushNeeded();}}

    @Override
    public Set<OWLObjectPropertyDomainAxiom> getObjectPropertyDomainAxioms(
            OWLObjectPropertyExpression property) {try{__CLR4_5_22np2nplviclfg2.R.inc(3487);
        __CLR4_5_22np2nplviclfg2.R.inc(3488);return getAxioms(OWLObjectPropertyDomainAxiom.class,
                OWLObjectPropertyExpression.class, property, EXCLUDED,
                IN_SUB_POSITION);
    }finally{__CLR4_5_22np2nplviclfg2.R.flushNeeded();}}

    @Override
    public Set<OWLObjectPropertyRangeAxiom> getObjectPropertyRangeAxioms(
            OWLObjectPropertyExpression property) {try{__CLR4_5_22np2nplviclfg2.R.inc(3489);
        __CLR4_5_22np2nplviclfg2.R.inc(3490);return getAxioms(OWLObjectPropertyRangeAxiom.class,
                OWLObjectPropertyExpression.class, property, EXCLUDED,
                IN_SUB_POSITION);
    }finally{__CLR4_5_22np2nplviclfg2.R.flushNeeded();}}

    @Override
    public Set<OWLInverseObjectPropertiesAxiom> getInverseObjectPropertyAxioms(
            OWLObjectPropertyExpression property) {try{__CLR4_5_22np2nplviclfg2.R.inc(3491);
        __CLR4_5_22np2nplviclfg2.R.inc(3492);return getAxioms(OWLInverseObjectPropertiesAxiom.class,
                OWLObjectPropertyExpression.class, property, EXCLUDED,
                IN_SUB_POSITION);
    }finally{__CLR4_5_22np2nplviclfg2.R.flushNeeded();}}

    @Override
    public Set<OWLEquivalentObjectPropertiesAxiom>getEquivalentObjectPropertiesAxioms(
                    OWLObjectPropertyExpression property) {try{__CLR4_5_22np2nplviclfg2.R.inc(3493);
        __CLR4_5_22np2nplviclfg2.R.inc(3494);return getAxioms(OWLEquivalentObjectPropertiesAxiom.class,
                OWLObjectPropertyExpression.class, property, EXCLUDED,
                IN_SUB_POSITION);
    }finally{__CLR4_5_22np2nplviclfg2.R.flushNeeded();}}

    @Override
    public Set<OWLDisjointObjectPropertiesAxiom>
            getDisjointObjectPropertiesAxioms(
                    OWLObjectPropertyExpression property) {try{__CLR4_5_22np2nplviclfg2.R.inc(3495);
        __CLR4_5_22np2nplviclfg2.R.inc(3496);return getAxioms(OWLDisjointObjectPropertiesAxiom.class,
                OWLObjectPropertyExpression.class, property, EXCLUDED,
                IN_SUB_POSITION);
    }finally{__CLR4_5_22np2nplviclfg2.R.flushNeeded();}}

    @Override
    public Set<OWLFunctionalObjectPropertyAxiom>
            getFunctionalObjectPropertyAxioms(
                    OWLObjectPropertyExpression property) {try{__CLR4_5_22np2nplviclfg2.R.inc(3497);
        __CLR4_5_22np2nplviclfg2.R.inc(3498);return getAxioms(OWLFunctionalObjectPropertyAxiom.class,
                OWLObjectPropertyExpression.class, property, EXCLUDED,
                IN_SUB_POSITION);
    }finally{__CLR4_5_22np2nplviclfg2.R.flushNeeded();}}

    @Override
    public Set<OWLInverseFunctionalObjectPropertyAxiom>
            getInverseFunctionalObjectPropertyAxioms(
                    OWLObjectPropertyExpression property) {try{__CLR4_5_22np2nplviclfg2.R.inc(3499);
        __CLR4_5_22np2nplviclfg2.R.inc(3500);return getAxioms(OWLInverseFunctionalObjectPropertyAxiom.class,
                OWLObjectPropertyExpression.class, property, EXCLUDED,
                IN_SUB_POSITION);
    }finally{__CLR4_5_22np2nplviclfg2.R.flushNeeded();}}

    @Override
    public Set<OWLSymmetricObjectPropertyAxiom>
            getSymmetricObjectPropertyAxioms(
                    OWLObjectPropertyExpression property) {try{__CLR4_5_22np2nplviclfg2.R.inc(3501);
        __CLR4_5_22np2nplviclfg2.R.inc(3502);return getAxioms(OWLSymmetricObjectPropertyAxiom.class,
                OWLObjectPropertyExpression.class, property, EXCLUDED,
                IN_SUB_POSITION);
    }finally{__CLR4_5_22np2nplviclfg2.R.flushNeeded();}}

    @Override
    public Set<OWLAsymmetricObjectPropertyAxiom>
            getAsymmetricObjectPropertyAxioms(
                    OWLObjectPropertyExpression property) {try{__CLR4_5_22np2nplviclfg2.R.inc(3503);
        __CLR4_5_22np2nplviclfg2.R.inc(3504);return getAxioms(OWLAsymmetricObjectPropertyAxiom.class,
                OWLObjectPropertyExpression.class, property, EXCLUDED,
                IN_SUB_POSITION);
    }finally{__CLR4_5_22np2nplviclfg2.R.flushNeeded();}}

    @Override
    public Set<OWLReflexiveObjectPropertyAxiom>
            getReflexiveObjectPropertyAxioms(
                    OWLObjectPropertyExpression property) {try{__CLR4_5_22np2nplviclfg2.R.inc(3505);
        __CLR4_5_22np2nplviclfg2.R.inc(3506);return getAxioms(OWLReflexiveObjectPropertyAxiom.class,
                OWLObjectPropertyExpression.class, property, EXCLUDED,
                IN_SUB_POSITION);
    }finally{__CLR4_5_22np2nplviclfg2.R.flushNeeded();}}

    @Override
    public Set<OWLIrreflexiveObjectPropertyAxiom>
            getIrreflexiveObjectPropertyAxioms(
                    OWLObjectPropertyExpression property) {try{__CLR4_5_22np2nplviclfg2.R.inc(3507);
        __CLR4_5_22np2nplviclfg2.R.inc(3508);return getAxioms(OWLIrreflexiveObjectPropertyAxiom.class,
                OWLObjectPropertyExpression.class, property, EXCLUDED,
                IN_SUB_POSITION);
    }finally{__CLR4_5_22np2nplviclfg2.R.flushNeeded();}}

    @Override
    public Set<OWLTransitiveObjectPropertyAxiom>
            getTransitiveObjectPropertyAxioms(
                    OWLObjectPropertyExpression property) {try{__CLR4_5_22np2nplviclfg2.R.inc(3509);
        __CLR4_5_22np2nplviclfg2.R.inc(3510);return getAxioms(OWLTransitiveObjectPropertyAxiom.class,
                OWLObjectPropertyExpression.class, property, EXCLUDED,
                IN_SUB_POSITION);
    }finally{__CLR4_5_22np2nplviclfg2.R.flushNeeded();}}

    @Override
    public Set<OWLFunctionalDataPropertyAxiom> getFunctionalDataPropertyAxioms(
            OWLDataPropertyExpression property) {try{__CLR4_5_22np2nplviclfg2.R.inc(3511);
        __CLR4_5_22np2nplviclfg2.R.inc(3512);return getAxioms(OWLFunctionalDataPropertyAxiom.class,
                OWLDataPropertyExpression.class, property, EXCLUDED,
                IN_SUB_POSITION);
    }finally{__CLR4_5_22np2nplviclfg2.R.flushNeeded();}}

    @Override
    public Set<OWLSubDataPropertyOfAxiom>
            getDataSubPropertyAxiomsForSubProperty(OWLDataProperty subProperty) {try{__CLR4_5_22np2nplviclfg2.R.inc(3513);
        __CLR4_5_22np2nplviclfg2.R.inc(3514);return getAxioms(OWLSubDataPropertyOfAxiom.class,
                OWLDataPropertyExpression.class, subProperty, EXCLUDED,
                IN_SUB_POSITION);
    }finally{__CLR4_5_22np2nplviclfg2.R.flushNeeded();}}

    @Override
    public Set<OWLSubDataPropertyOfAxiom>
            getDataSubPropertyAxiomsForSuperProperty(
                    OWLDataPropertyExpression superProperty) {try{__CLR4_5_22np2nplviclfg2.R.inc(3515);
        __CLR4_5_22np2nplviclfg2.R.inc(3516);return getAxioms(OWLSubDataPropertyOfAxiom.class,
                OWLDataPropertyExpression.class, superProperty, EXCLUDED,
                IN_SUPER_POSITION);
    }finally{__CLR4_5_22np2nplviclfg2.R.flushNeeded();}}

    @Override
    public Set<OWLDataPropertyDomainAxiom> getDataPropertyDomainAxioms(
            OWLDataProperty property) {try{__CLR4_5_22np2nplviclfg2.R.inc(3517);
        __CLR4_5_22np2nplviclfg2.R.inc(3518);return getAxioms(OWLDataPropertyDomainAxiom.class,
                OWLDataPropertyExpression.class, property, EXCLUDED,
                IN_SUB_POSITION);
    }finally{__CLR4_5_22np2nplviclfg2.R.flushNeeded();}}

    @Override
    public Set<OWLDataPropertyRangeAxiom> getDataPropertyRangeAxioms(
            OWLDataProperty property) {try{__CLR4_5_22np2nplviclfg2.R.inc(3519);
        __CLR4_5_22np2nplviclfg2.R.inc(3520);return getAxioms(OWLDataPropertyRangeAxiom.class,
                OWLDataPropertyExpression.class, property, EXCLUDED,
                IN_SUB_POSITION);
    }finally{__CLR4_5_22np2nplviclfg2.R.flushNeeded();}}

    @Override
    public Set<OWLEquivalentDataPropertiesAxiom>
            getEquivalentDataPropertiesAxioms(OWLDataProperty property) {try{__CLR4_5_22np2nplviclfg2.R.inc(3521);
        __CLR4_5_22np2nplviclfg2.R.inc(3522);return getAxioms(OWLEquivalentDataPropertiesAxiom.class,
                OWLDataPropertyExpression.class, property, EXCLUDED,
                IN_SUB_POSITION);
    }finally{__CLR4_5_22np2nplviclfg2.R.flushNeeded();}}

    @Override
    public Set<OWLDisjointDataPropertiesAxiom> getDisjointDataPropertiesAxioms(
            OWLDataProperty property) {try{__CLR4_5_22np2nplviclfg2.R.inc(3523);
        __CLR4_5_22np2nplviclfg2.R.inc(3524);return getAxioms(OWLDisjointDataPropertiesAxiom.class,
                OWLDataPropertyExpression.class, property, EXCLUDED,
                IN_SUB_POSITION);
    }finally{__CLR4_5_22np2nplviclfg2.R.flushNeeded();}}

    @Override
    public Set<OWLClassAssertionAxiom> getClassAssertionAxioms(
            OWLIndividual individual) {try{__CLR4_5_22np2nplviclfg2.R.inc(3525);
        __CLR4_5_22np2nplviclfg2.R.inc(3526);return getAxioms(OWLClassAssertionAxiom.class, OWLIndividual.class,
                individual, EXCLUDED, IN_SUB_POSITION);
    }finally{__CLR4_5_22np2nplviclfg2.R.flushNeeded();}}

    @Override
    public Set<OWLClassAssertionAxiom> getClassAssertionAxioms(
            OWLClassExpression ce) {try{__CLR4_5_22np2nplviclfg2.R.inc(3527);
        __CLR4_5_22np2nplviclfg2.R.inc(3528);return getAxioms(OWLClassAssertionAxiom.class,
                OWLClassExpression.class, ce, EXCLUDED, IN_SUB_POSITION);
    }finally{__CLR4_5_22np2nplviclfg2.R.flushNeeded();}}

    @Override
    public Set<OWLDataPropertyAssertionAxiom> getDataPropertyAssertionAxioms(
            OWLIndividual individual) {try{__CLR4_5_22np2nplviclfg2.R.inc(3529);
        __CLR4_5_22np2nplviclfg2.R.inc(3530);return getAxioms(OWLDataPropertyAssertionAxiom.class,
                OWLIndividual.class, individual, EXCLUDED, IN_SUB_POSITION);
    }finally{__CLR4_5_22np2nplviclfg2.R.flushNeeded();}}

    @Override
    public Set<OWLObjectPropertyAssertionAxiom>
            getObjectPropertyAssertionAxioms(OWLIndividual individual) {try{__CLR4_5_22np2nplviclfg2.R.inc(3531);
        __CLR4_5_22np2nplviclfg2.R.inc(3532);return getAxioms(OWLObjectPropertyAssertionAxiom.class,
                OWLIndividual.class, individual, EXCLUDED, IN_SUB_POSITION);
    }finally{__CLR4_5_22np2nplviclfg2.R.flushNeeded();}}

    @Override
    public Set<OWLNegativeObjectPropertyAssertionAxiom>
            getNegativeObjectPropertyAssertionAxioms(OWLIndividual individual) {try{__CLR4_5_22np2nplviclfg2.R.inc(3533);
        __CLR4_5_22np2nplviclfg2.R.inc(3534);return getAxioms(OWLNegativeObjectPropertyAssertionAxiom.class,
                OWLIndividual.class, individual, EXCLUDED, IN_SUB_POSITION);
    }finally{__CLR4_5_22np2nplviclfg2.R.flushNeeded();}}

    @Override
    public Set<OWLNegativeDataPropertyAssertionAxiom>
            getNegativeDataPropertyAssertionAxioms(OWLIndividual individual) {try{__CLR4_5_22np2nplviclfg2.R.inc(3535);
        __CLR4_5_22np2nplviclfg2.R.inc(3536);return getAxioms(OWLNegativeDataPropertyAssertionAxiom.class,
                OWLIndividual.class, individual, EXCLUDED, IN_SUB_POSITION);
    }finally{__CLR4_5_22np2nplviclfg2.R.flushNeeded();}}

    @Override
    public Set<OWLSameIndividualAxiom> getSameIndividualAxioms(
            OWLIndividual individual) {try{__CLR4_5_22np2nplviclfg2.R.inc(3537);
        __CLR4_5_22np2nplviclfg2.R.inc(3538);return getAxioms(OWLSameIndividualAxiom.class, OWLIndividual.class,
                individual, EXCLUDED, IN_SUB_POSITION);
    }finally{__CLR4_5_22np2nplviclfg2.R.flushNeeded();}}

    @Override
    public Set<OWLDifferentIndividualsAxiom> getDifferentIndividualAxioms(
            OWLIndividual individual) {try{__CLR4_5_22np2nplviclfg2.R.inc(3539);
        __CLR4_5_22np2nplviclfg2.R.inc(3540);return getAxioms(OWLDifferentIndividualsAxiom.class,
                OWLIndividual.class, individual, EXCLUDED, IN_SUB_POSITION);
    }finally{__CLR4_5_22np2nplviclfg2.R.flushNeeded();}}
}
