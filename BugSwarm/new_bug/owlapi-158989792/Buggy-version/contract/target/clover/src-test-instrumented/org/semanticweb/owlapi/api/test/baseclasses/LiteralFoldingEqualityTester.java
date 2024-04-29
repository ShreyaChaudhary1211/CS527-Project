/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.semanticweb.owlapi.api.test.baseclasses;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLAnnotation;
import org.semanticweb.owlapi.model.OWLAnnotationAssertionAxiom;
import org.semanticweb.owlapi.model.OWLAnnotationProperty;
import org.semanticweb.owlapi.model.OWLAnnotationPropertyDomainAxiom;
import org.semanticweb.owlapi.model.OWLAnnotationPropertyRangeAxiom;
import org.semanticweb.owlapi.model.OWLAnnotationSubject;
import org.semanticweb.owlapi.model.OWLAnnotationValue;
import org.semanticweb.owlapi.model.OWLAnonymousIndividual;
import org.semanticweb.owlapi.model.OWLAsymmetricObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLClassAssertionAxiom;
import org.semanticweb.owlapi.model.OWLClassExpression;
import org.semanticweb.owlapi.model.OWLDataAllValuesFrom;
import org.semanticweb.owlapi.model.OWLDataComplementOf;
import org.semanticweb.owlapi.model.OWLDataExactCardinality;
import org.semanticweb.owlapi.model.OWLDataHasValue;
import org.semanticweb.owlapi.model.OWLDataIntersectionOf;
import org.semanticweb.owlapi.model.OWLDataMaxCardinality;
import org.semanticweb.owlapi.model.OWLDataMinCardinality;
import org.semanticweb.owlapi.model.OWLDataOneOf;
import org.semanticweb.owlapi.model.OWLDataProperty;
import org.semanticweb.owlapi.model.OWLDataPropertyAssertionAxiom;
import org.semanticweb.owlapi.model.OWLDataPropertyDomainAxiom;
import org.semanticweb.owlapi.model.OWLDataPropertyExpression;
import org.semanticweb.owlapi.model.OWLDataPropertyRangeAxiom;
import org.semanticweb.owlapi.model.OWLDataRange;
import org.semanticweb.owlapi.model.OWLDataSomeValuesFrom;
import org.semanticweb.owlapi.model.OWLDataUnionOf;
import org.semanticweb.owlapi.model.OWLDatatype;
import org.semanticweb.owlapi.model.OWLDatatypeDefinitionAxiom;
import org.semanticweb.owlapi.model.OWLDatatypeRestriction;
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
import org.semanticweb.owlapi.model.OWLFacetRestriction;
import org.semanticweb.owlapi.model.OWLFunctionalDataPropertyAxiom;
import org.semanticweb.owlapi.model.OWLFunctionalObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLHasKeyAxiom;
import org.semanticweb.owlapi.model.OWLIndividual;
import org.semanticweb.owlapi.model.OWLInverseFunctionalObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLInverseObjectPropertiesAxiom;
import org.semanticweb.owlapi.model.OWLIrreflexiveObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLLiteral;
import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLNegativeDataPropertyAssertionAxiom;
import org.semanticweb.owlapi.model.OWLNegativeObjectPropertyAssertionAxiom;
import org.semanticweb.owlapi.model.OWLObjectAllValuesFrom;
import org.semanticweb.owlapi.model.OWLObjectComplementOf;
import org.semanticweb.owlapi.model.OWLObjectExactCardinality;
import org.semanticweb.owlapi.model.OWLObjectHasSelf;
import org.semanticweb.owlapi.model.OWLObjectHasValue;
import org.semanticweb.owlapi.model.OWLObjectIntersectionOf;
import org.semanticweb.owlapi.model.OWLObjectInverseOf;
import org.semanticweb.owlapi.model.OWLObjectMaxCardinality;
import org.semanticweb.owlapi.model.OWLObjectMinCardinality;
import org.semanticweb.owlapi.model.OWLObjectOneOf;
import org.semanticweb.owlapi.model.OWLObjectProperty;
import org.semanticweb.owlapi.model.OWLObjectPropertyAssertionAxiom;
import org.semanticweb.owlapi.model.OWLObjectPropertyDomainAxiom;
import org.semanticweb.owlapi.model.OWLObjectPropertyExpression;
import org.semanticweb.owlapi.model.OWLObjectPropertyRangeAxiom;
import org.semanticweb.owlapi.model.OWLObjectSomeValuesFrom;
import org.semanticweb.owlapi.model.OWLObjectUnionOf;
import org.semanticweb.owlapi.model.OWLReflexiveObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLSameIndividualAxiom;
import org.semanticweb.owlapi.model.OWLSubAnnotationPropertyOfAxiom;
import org.semanticweb.owlapi.model.OWLSubClassOfAxiom;
import org.semanticweb.owlapi.model.OWLSubDataPropertyOfAxiom;
import org.semanticweb.owlapi.model.OWLSubObjectPropertyOfAxiom;
import org.semanticweb.owlapi.model.OWLSubPropertyChainOfAxiom;
import org.semanticweb.owlapi.model.OWLSymmetricObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLTransitiveObjectPropertyAxiom;
import org.semanticweb.owlapi.model.SWRLRule;
import org.semanticweb.owlapi.vocab.OWLFacet;
import org.semanticweb.owlapi.vocab.OWLRDFVocabulary;

class LiteralFoldingEqualityTester {static class __CLR4_5_23a23a2lvico0bp{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,5902,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static boolean equalAxiom(OWLAxiom a, OWLAxiom b) {try{__CLR4_5_23a23a2lvico0bp.R.inc(4250);
        __CLR4_5_23a23a2lvico0bp.R.inc(4251);if ((((a == b)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4252)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4253)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4254);return true;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(4255);if ((((a == null || b == null)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4256)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4257)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4258);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(4259);if ((((a instanceof OWLAsymmetricObjectPropertyAxiom
                && b instanceof OWLAsymmetricObjectPropertyAxiom)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4260)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4261)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4262);return equals((OWLAsymmetricObjectPropertyAxiom) a,
                    (OWLAsymmetricObjectPropertyAxiom) b);
        } }else {__CLR4_5_23a23a2lvico0bp.R.inc(4263);if ((((a instanceof OWLClassAssertionAxiom
                && b instanceof OWLClassAssertionAxiom)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4264)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4265)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4266);return equals((OWLClassAssertionAxiom) a,
                    (OWLClassAssertionAxiom) b);
        } }else {__CLR4_5_23a23a2lvico0bp.R.inc(4267);if ((((a instanceof OWLDataPropertyAssertionAxiom
                && b instanceof OWLDataPropertyAssertionAxiom)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4268)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4269)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4270);return equals((OWLDataPropertyAssertionAxiom) a,
                    (OWLDataPropertyAssertionAxiom) b);
        } }else {__CLR4_5_23a23a2lvico0bp.R.inc(4271);if ((((a instanceof OWLDataPropertyDomainAxiom
                && b instanceof OWLDataPropertyDomainAxiom)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4272)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4273)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4274);return equals((OWLDataPropertyDomainAxiom) a,
                    (OWLDataPropertyDomainAxiom) b);
        } }else {__CLR4_5_23a23a2lvico0bp.R.inc(4275);if ((((a instanceof OWLDataPropertyRangeAxiom
                && b instanceof OWLDataPropertyRangeAxiom)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4276)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4277)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4278);return equals((OWLDataPropertyRangeAxiom) a,
                    (OWLDataPropertyRangeAxiom) b);
        } }else {__CLR4_5_23a23a2lvico0bp.R.inc(4279);if ((((a instanceof OWLDeclarationAxiom
                && b instanceof OWLDeclarationAxiom)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4280)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4281)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4282);return equals((OWLDeclarationAxiom) a, (OWLDeclarationAxiom) b);
        } }else {__CLR4_5_23a23a2lvico0bp.R.inc(4283);if ((((a instanceof OWLDifferentIndividualsAxiom
                && b instanceof OWLDifferentIndividualsAxiom)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4284)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4285)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4286);return equals((OWLDifferentIndividualsAxiom) a,
                    (OWLDifferentIndividualsAxiom) b);
        } }else {__CLR4_5_23a23a2lvico0bp.R.inc(4287);if ((((a instanceof OWLDisjointClassesAxiom
                && b instanceof OWLDisjointClassesAxiom)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4288)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4289)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4290);return equals((OWLDisjointClassesAxiom) a,
                    (OWLDisjointClassesAxiom) b);
        } }else {__CLR4_5_23a23a2lvico0bp.R.inc(4291);if ((((a instanceof OWLDisjointDataPropertiesAxiom
                && b instanceof OWLDisjointDataPropertiesAxiom)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4292)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4293)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4294);return equals((OWLDisjointDataPropertiesAxiom) a,
                    (OWLDisjointDataPropertiesAxiom) b);
        } }else {__CLR4_5_23a23a2lvico0bp.R.inc(4295);if ((((a instanceof OWLDisjointObjectPropertiesAxiom
                && b instanceof OWLDisjointObjectPropertiesAxiom)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4296)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4297)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4298);return equals((OWLDisjointObjectPropertiesAxiom) a,
                    (OWLDisjointObjectPropertiesAxiom) b);
        } }else {__CLR4_5_23a23a2lvico0bp.R.inc(4299);if ((((a instanceof OWLDisjointUnionAxiom
                && b instanceof OWLDisjointUnionAxiom)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4300)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4301)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4302);return equals((OWLDisjointUnionAxiom) a, (OWLDisjointUnionAxiom) b);
        } }else {__CLR4_5_23a23a2lvico0bp.R.inc(4303);if ((((a instanceof OWLEquivalentClassesAxiom
                && b instanceof OWLEquivalentClassesAxiom)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4304)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4305)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4306);return equals((OWLEquivalentClassesAxiom) a,
                    (OWLEquivalentClassesAxiom) b);
        } }else {__CLR4_5_23a23a2lvico0bp.R.inc(4307);if ((((a instanceof OWLEquivalentDataPropertiesAxiom
                && b instanceof OWLEquivalentDataPropertiesAxiom)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4308)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4309)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4310);return equals((OWLEquivalentDataPropertiesAxiom) a,
                    (OWLEquivalentDataPropertiesAxiom) b);
        } }else {__CLR4_5_23a23a2lvico0bp.R.inc(4311);if ((((a instanceof OWLEquivalentObjectPropertiesAxiom
                && b instanceof OWLEquivalentObjectPropertiesAxiom)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4312)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4313)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4314);return equals((OWLEquivalentObjectPropertiesAxiom) a,
                    (OWLEquivalentObjectPropertiesAxiom) b);
        } }else {__CLR4_5_23a23a2lvico0bp.R.inc(4315);if ((((a instanceof OWLFunctionalDataPropertyAxiom
                && b instanceof OWLFunctionalDataPropertyAxiom)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4316)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4317)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4318);return equals((OWLFunctionalDataPropertyAxiom) a,
                    (OWLFunctionalDataPropertyAxiom) b);
        } }else {__CLR4_5_23a23a2lvico0bp.R.inc(4319);if ((((a instanceof OWLFunctionalObjectPropertyAxiom
                && b instanceof OWLFunctionalObjectPropertyAxiom)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4320)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4321)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4322);return equals((OWLFunctionalObjectPropertyAxiom) a,
                    (OWLFunctionalObjectPropertyAxiom) b);
        } }else {__CLR4_5_23a23a2lvico0bp.R.inc(4323);if ((((a instanceof OWLHasKeyAxiom && b instanceof OWLHasKeyAxiom)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4324)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4325)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4326);return equals((OWLHasKeyAxiom) a, (OWLHasKeyAxiom) b);
        } }else {__CLR4_5_23a23a2lvico0bp.R.inc(4327);if ((((a instanceof OWLInverseFunctionalObjectPropertyAxiom
                && b instanceof OWLInverseFunctionalObjectPropertyAxiom)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4328)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4329)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4330);return equals((OWLInverseFunctionalObjectPropertyAxiom) a,
                    (OWLInverseFunctionalObjectPropertyAxiom) b);
        } }else {__CLR4_5_23a23a2lvico0bp.R.inc(4331);if ((((a instanceof OWLInverseObjectPropertiesAxiom
                && b instanceof OWLInverseObjectPropertiesAxiom)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4332)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4333)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4334);return equals((OWLInverseObjectPropertiesAxiom) a,
                    (OWLInverseObjectPropertiesAxiom) b);
        } }else {__CLR4_5_23a23a2lvico0bp.R.inc(4335);if ((((a instanceof OWLIrreflexiveObjectPropertyAxiom
                && b instanceof OWLIrreflexiveObjectPropertyAxiom)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4336)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4337)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4338);return equals((OWLIrreflexiveObjectPropertyAxiom) a,
                    (OWLIrreflexiveObjectPropertyAxiom) b);
        } }else {__CLR4_5_23a23a2lvico0bp.R.inc(4339);if ((((a instanceof OWLNegativeDataPropertyAssertionAxiom
                && b instanceof OWLNegativeDataPropertyAssertionAxiom)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4340)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4341)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4342);return equals((OWLNegativeDataPropertyAssertionAxiom) a,
                    (OWLNegativeDataPropertyAssertionAxiom) b);
        } }else {__CLR4_5_23a23a2lvico0bp.R.inc(4343);if ((((a instanceof OWLNegativeObjectPropertyAssertionAxiom
                && b instanceof OWLNegativeObjectPropertyAssertionAxiom)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4344)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4345)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4346);return equals((OWLNegativeObjectPropertyAssertionAxiom) a,
                    (OWLNegativeObjectPropertyAssertionAxiom) b);
        } }else {__CLR4_5_23a23a2lvico0bp.R.inc(4347);if ((((a instanceof OWLObjectPropertyAssertionAxiom
                && b instanceof OWLObjectPropertyAssertionAxiom)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4348)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4349)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4350);return equals((OWLObjectPropertyAssertionAxiom) a,
                    (OWLObjectPropertyAssertionAxiom) b);
        } }else {__CLR4_5_23a23a2lvico0bp.R.inc(4351);if ((((a instanceof OWLSubPropertyChainOfAxiom
                && b instanceof OWLSubPropertyChainOfAxiom)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4352)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4353)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4354);return equals((OWLSubPropertyChainOfAxiom) a,
                    (OWLSubPropertyChainOfAxiom) b);
        } }else {__CLR4_5_23a23a2lvico0bp.R.inc(4355);if ((((a instanceof OWLObjectPropertyDomainAxiom
                && b instanceof OWLObjectPropertyDomainAxiom)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4356)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4357)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4358);return equals((OWLObjectPropertyDomainAxiom) a,
                    (OWLObjectPropertyDomainAxiom) b);
        } }else {__CLR4_5_23a23a2lvico0bp.R.inc(4359);if ((((a instanceof OWLObjectPropertyRangeAxiom
                && b instanceof OWLObjectPropertyRangeAxiom)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4360)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4361)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4362);return equals((OWLObjectPropertyRangeAxiom) a,
                    (OWLObjectPropertyRangeAxiom) b);
        } }else {__CLR4_5_23a23a2lvico0bp.R.inc(4363);if ((((a instanceof OWLReflexiveObjectPropertyAxiom
                && b instanceof OWLReflexiveObjectPropertyAxiom)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4364)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4365)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4366);return equals((OWLReflexiveObjectPropertyAxiom) a,
                    (OWLReflexiveObjectPropertyAxiom) b);
        } }else {__CLR4_5_23a23a2lvico0bp.R.inc(4367);if ((((a instanceof OWLSameIndividualAxiom
                && b instanceof OWLSameIndividualAxiom)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4368)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4369)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4370);return equals((OWLSameIndividualAxiom) a,
                    (OWLSameIndividualAxiom) b);
        } }else {__CLR4_5_23a23a2lvico0bp.R.inc(4371);if ((((a instanceof OWLSubClassOfAxiom
                && b instanceof OWLSubClassOfAxiom)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4372)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4373)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4374);return equals((OWLSubClassOfAxiom) a, (OWLSubClassOfAxiom) b);
        } }else {__CLR4_5_23a23a2lvico0bp.R.inc(4375);if ((((a instanceof OWLSubDataPropertyOfAxiom
                && b instanceof OWLSubDataPropertyOfAxiom)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4376)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4377)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4378);return equals((OWLSubDataPropertyOfAxiom) a,
                    (OWLSubDataPropertyOfAxiom) b);
        } }else {__CLR4_5_23a23a2lvico0bp.R.inc(4379);if ((((a instanceof OWLSubObjectPropertyOfAxiom
                && b instanceof OWLSubObjectPropertyOfAxiom)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4380)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4381)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4382);return equals((OWLSubObjectPropertyOfAxiom) a,
                    (OWLSubObjectPropertyOfAxiom) b);
        } }else {__CLR4_5_23a23a2lvico0bp.R.inc(4383);if ((((a instanceof OWLSymmetricObjectPropertyAxiom
                && b instanceof OWLSymmetricObjectPropertyAxiom)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4384)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4385)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4386);return equals((OWLSymmetricObjectPropertyAxiom) a,
                    (OWLSymmetricObjectPropertyAxiom) b);
        } }else {__CLR4_5_23a23a2lvico0bp.R.inc(4387);if ((((a instanceof OWLTransitiveObjectPropertyAxiom
                && b instanceof OWLTransitiveObjectPropertyAxiom)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4388)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4389)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4390);return equals((OWLTransitiveObjectPropertyAxiom) a,
                    (OWLTransitiveObjectPropertyAxiom) b);
        } }else {__CLR4_5_23a23a2lvico0bp.R.inc(4391);if ((((a instanceof OWLAnnotationAssertionAxiom
                && b instanceof OWLAnnotationAssertionAxiom)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4392)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4393)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4394);return equals((OWLAnnotationAssertionAxiom) a,
                    (OWLAnnotationAssertionAxiom) b);
        } }else {__CLR4_5_23a23a2lvico0bp.R.inc(4395);if ((((a instanceof OWLAnnotationPropertyDomainAxiom
                && b instanceof OWLAnnotationPropertyDomainAxiom)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4396)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4397)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4398);return equals((OWLAnnotationPropertyDomainAxiom) a,
                    (OWLAnnotationPropertyDomainAxiom) b);
        } }else {__CLR4_5_23a23a2lvico0bp.R.inc(4399);if ((((a instanceof OWLAnnotationPropertyRangeAxiom
                && b instanceof OWLAnnotationPropertyRangeAxiom)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4400)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4401)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4402);return equals((OWLAnnotationPropertyRangeAxiom) a,
                    (OWLAnnotationPropertyRangeAxiom) b);
        } }else {__CLR4_5_23a23a2lvico0bp.R.inc(4403);if ((((a instanceof OWLSubAnnotationPropertyOfAxiom
                && b instanceof OWLSubAnnotationPropertyOfAxiom)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4404)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4405)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4406);return equals((OWLSubAnnotationPropertyOfAxiom) a,
                    (OWLSubAnnotationPropertyOfAxiom) b);
        } }else {__CLR4_5_23a23a2lvico0bp.R.inc(4407);if ((((a instanceof OWLDatatypeDefinitionAxiom
                && b instanceof OWLDatatypeDefinitionAxiom)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4408)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4409)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4410);return equals((OWLDatatypeDefinitionAxiom) a,
                    (OWLDatatypeDefinitionAxiom) b);
        } }else {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4411);return false;
        }
    }}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}finally{__CLR4_5_23a23a2lvico0bp.R.flushNeeded();}}

    public static boolean equals(IRI a, IRI b) {try{__CLR4_5_23a23a2lvico0bp.R.inc(4412);
        __CLR4_5_23a23a2lvico0bp.R.inc(4413);if ((((a == b)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4414)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4415)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4416);return true;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(4417);if ((((a == null || b == null)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4418)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4419)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4420);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(4421);return a.equals(b);
    }finally{__CLR4_5_23a23a2lvico0bp.R.flushNeeded();}}

    public static boolean equals(OWLLiteral a, OWLLiteral b) {try{__CLR4_5_23a23a2lvico0bp.R.inc(4422);
        __CLR4_5_23a23a2lvico0bp.R.inc(4423);if ((((a == b)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4424)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4425)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4426);return true;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(4427);if ((((a == null || b == null)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4428)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4429)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4430);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(4431);if ((((!a.getLiteral().equals(b.getLiteral()))&&(__CLR4_5_23a23a2lvico0bp.R.iget(4432)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4433)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4434);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(4435);if ((((!a.getLang().equals(b.getLang()))&&(__CLR4_5_23a23a2lvico0bp.R.iget(4436)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4437)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4438);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(4439);if ((((a.getDatatype().equals(b.getDatatype()))&&(__CLR4_5_23a23a2lvico0bp.R.iget(4440)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4441)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4442);return true;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(4443);if ((((a.getDatatype().isRDFPlainLiteral())&&(__CLR4_5_23a23a2lvico0bp.R.iget(4444)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4445)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4446);if ((((b.getDatatype().isString() && a.getLang().equals(""))&&(__CLR4_5_23a23a2lvico0bp.R.iget(4447)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4448)==0&false))) {{
                __CLR4_5_23a23a2lvico0bp.R.inc(4449);return true;
            }
            }__CLR4_5_23a23a2lvico0bp.R.inc(4450);if ((((b.getDatatype().getIRI()
                    .equals(OWLRDFVocabulary.RDF_LANG_STRING.getIRI())
                    && !a.getLang().equals(""))&&(__CLR4_5_23a23a2lvico0bp.R.iget(4451)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4452)==0&false))) {{
                __CLR4_5_23a23a2lvico0bp.R.inc(4453);return true;
            }
        }}
        }__CLR4_5_23a23a2lvico0bp.R.inc(4454);if ((((b.getDatatype().isRDFPlainLiteral())&&(__CLR4_5_23a23a2lvico0bp.R.iget(4455)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4456)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4457);if ((((a.getDatatype().isString() && b.getLang().equals(""))&&(__CLR4_5_23a23a2lvico0bp.R.iget(4458)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4459)==0&false))) {{
                __CLR4_5_23a23a2lvico0bp.R.inc(4460);return true;
            }
            }__CLR4_5_23a23a2lvico0bp.R.inc(4461);if ((((a.getDatatype().getIRI()
                    .equals(OWLRDFVocabulary.RDF_LANG_STRING.getIRI())
                    && !b.getLang().equals(""))&&(__CLR4_5_23a23a2lvico0bp.R.iget(4462)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4463)==0&false))) {{
                __CLR4_5_23a23a2lvico0bp.R.inc(4464);return true;
            }
        }}
        }__CLR4_5_23a23a2lvico0bp.R.inc(4465);return false;
    }finally{__CLR4_5_23a23a2lvico0bp.R.flushNeeded();}}

    public static boolean equalLiterals(Set<OWLLiteral> a, Set<OWLLiteral> b) {try{__CLR4_5_23a23a2lvico0bp.R.inc(4466);
        __CLR4_5_23a23a2lvico0bp.R.inc(4467);if ((((a.size() != b.size())&&(__CLR4_5_23a23a2lvico0bp.R.iget(4468)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4469)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4470);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(4471);Iterator<OWLLiteral> ai = a.iterator();
        __CLR4_5_23a23a2lvico0bp.R.inc(4472);Iterator<OWLLiteral> bi = b.iterator();
        __CLR4_5_23a23a2lvico0bp.R.inc(4473);while ((((ai.hasNext())&&(__CLR4_5_23a23a2lvico0bp.R.iget(4474)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4475)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4476);if ((((!equals(ai.next(), bi.next()))&&(__CLR4_5_23a23a2lvico0bp.R.iget(4477)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4478)==0&false))) {{
                __CLR4_5_23a23a2lvico0bp.R.inc(4479);return false;
            }
        }}
        }__CLR4_5_23a23a2lvico0bp.R.inc(4480);return true;
    }finally{__CLR4_5_23a23a2lvico0bp.R.flushNeeded();}}

    /*
     * Entity like things
     */
    private static boolean equals(OWLEntity a, OWLEntity b) {try{__CLR4_5_23a23a2lvico0bp.R.inc(4481);
        __CLR4_5_23a23a2lvico0bp.R.inc(4482);if ((((a == b)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4483)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4484)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4485);return true;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(4486);if ((((a == null || b == null)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4487)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4488)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4489);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(4490);if ((((a instanceof OWLClass && b instanceof OWLClass)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4491)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4492)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4493);return equals((OWLClass) a, (OWLClass) b);
        } }else {__CLR4_5_23a23a2lvico0bp.R.inc(4494);if ((((a instanceof OWLAnnotationProperty
                && b instanceof OWLAnnotationProperty)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4495)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4496)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4497);return equals((OWLAnnotationProperty) a, (OWLAnnotationProperty) b);
        } }else {__CLR4_5_23a23a2lvico0bp.R.inc(4498);if ((((a instanceof OWLDatatype && b instanceof OWLDatatype)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4499)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4500)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4501);return equals((OWLDatatype) a, (OWLDatatype) b);
        } }else {__CLR4_5_23a23a2lvico0bp.R.inc(4502);if ((((a instanceof OWLObjectProperty
                && b instanceof OWLObjectProperty)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4503)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4504)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4505);return equals((OWLObjectProperty) a, (OWLObjectProperty) b);
        } }else {__CLR4_5_23a23a2lvico0bp.R.inc(4506);if ((((a instanceof OWLDataProperty && b instanceof OWLDataProperty)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4507)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4508)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4509);return equals((OWLDataProperty) a, (OWLDataProperty) b);
        } }else {__CLR4_5_23a23a2lvico0bp.R.inc(4510);if ((((a instanceof OWLNamedIndividual
                && b instanceof OWLNamedIndividual)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4511)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4512)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4513);return equals((OWLNamedIndividual) a, (OWLNamedIndividual) b);
        } }else {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4514);return false;
        }
    }}}}}}}finally{__CLR4_5_23a23a2lvico0bp.R.flushNeeded();}}

    private static boolean equals(OWLIndividual a, OWLIndividual b) {try{__CLR4_5_23a23a2lvico0bp.R.inc(4515);
        __CLR4_5_23a23a2lvico0bp.R.inc(4516);if ((((a == b)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4517)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4518)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4519);return true;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(4520);if ((((a == null || b == null)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4521)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4522)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4523);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(4524);if ((((a instanceof OWLAnonymousIndividual
                && b instanceof OWLAnonymousIndividual)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4525)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4526)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4527);return equals((OWLAnonymousIndividual) a,
                    (OWLAnonymousIndividual) b);
        } }else {__CLR4_5_23a23a2lvico0bp.R.inc(4528);if ((((a instanceof OWLNamedIndividual
                && b instanceof OWLNamedIndividual)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4529)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4530)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4531);return equals((OWLNamedIndividual) a, (OWLNamedIndividual) b);
        } }else {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4532);return false;
        }
    }}}finally{__CLR4_5_23a23a2lvico0bp.R.flushNeeded();}}

    private static boolean equalIndividuals(Set<OWLIndividual> a,
            Set<OWLIndividual> b) {try{__CLR4_5_23a23a2lvico0bp.R.inc(4533);
        __CLR4_5_23a23a2lvico0bp.R.inc(4534);if ((((a.size() != b.size())&&(__CLR4_5_23a23a2lvico0bp.R.iget(4535)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4536)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4537);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(4538);Iterator<OWLIndividual> ai = a.iterator();
        __CLR4_5_23a23a2lvico0bp.R.inc(4539);Iterator<OWLIndividual> bi = b.iterator();
        __CLR4_5_23a23a2lvico0bp.R.inc(4540);while ((((ai.hasNext())&&(__CLR4_5_23a23a2lvico0bp.R.iget(4541)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4542)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4543);if ((((!equals(ai.next(), bi.next()))&&(__CLR4_5_23a23a2lvico0bp.R.iget(4544)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4545)==0&false))) {{
                __CLR4_5_23a23a2lvico0bp.R.inc(4546);return false;
            }
        }}
        }__CLR4_5_23a23a2lvico0bp.R.inc(4547);return true;
    }finally{__CLR4_5_23a23a2lvico0bp.R.flushNeeded();}}

    public static boolean equals(OWLAnonymousIndividual a,
            OWLAnonymousIndividual b) {try{__CLR4_5_23a23a2lvico0bp.R.inc(4548);
        __CLR4_5_23a23a2lvico0bp.R.inc(4549);if ((((a == b)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4550)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4551)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4552);return true;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(4553);if ((((a == null || b == null)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4554)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4555)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4556);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(4557);return a.equals(b);
    }finally{__CLR4_5_23a23a2lvico0bp.R.flushNeeded();}}

    public static boolean equals(OWLNamedIndividual a, OWLNamedIndividual b) {try{__CLR4_5_23a23a2lvico0bp.R.inc(4558);
        __CLR4_5_23a23a2lvico0bp.R.inc(4559);if ((((a == b)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4560)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4561)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4562);return true;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(4563);if ((((a == null || b == null)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4564)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4565)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4566);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(4567);return a.equals(b);
    }finally{__CLR4_5_23a23a2lvico0bp.R.flushNeeded();}}

    public static boolean equals(OWLClass a, OWLClass b) {try{__CLR4_5_23a23a2lvico0bp.R.inc(4568);
        __CLR4_5_23a23a2lvico0bp.R.inc(4569);if ((((a == b)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4570)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4571)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4572);return true;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(4573);if ((((a == null || b == null)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4574)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4575)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4576);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(4577);return a.equals(b);
    }finally{__CLR4_5_23a23a2lvico0bp.R.flushNeeded();}}

    public static boolean equals(OWLDatatype a, OWLDatatype b) {try{__CLR4_5_23a23a2lvico0bp.R.inc(4578);
        __CLR4_5_23a23a2lvico0bp.R.inc(4579);if ((((a == b)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4580)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4581)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4582);return true;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(4583);if ((((a == null || b == null)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4584)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4585)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4586);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(4587);return a.equals(b);
    }finally{__CLR4_5_23a23a2lvico0bp.R.flushNeeded();}}

    public static boolean equals(OWLObjectProperty a, OWLObjectProperty b) {try{__CLR4_5_23a23a2lvico0bp.R.inc(4588);
        __CLR4_5_23a23a2lvico0bp.R.inc(4589);if ((((a == b)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4590)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4591)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4592);return true;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(4593);if ((((a == null || b == null)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4594)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4595)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4596);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(4597);return a.equals(b);
    }finally{__CLR4_5_23a23a2lvico0bp.R.flushNeeded();}}

    public static boolean equals(OWLObjectInverseOf a, OWLObjectInverseOf b) {try{__CLR4_5_23a23a2lvico0bp.R.inc(4598);
        __CLR4_5_23a23a2lvico0bp.R.inc(4599);if ((((a == b)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4600)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4601)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4602);return true;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(4603);if ((((a == null || b == null)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4604)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4605)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4606);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(4607);return a.equals(b);
    }finally{__CLR4_5_23a23a2lvico0bp.R.flushNeeded();}}

    private static boolean equals(OWLObjectPropertyExpression a,
            OWLObjectPropertyExpression b) {try{__CLR4_5_23a23a2lvico0bp.R.inc(4608);
        __CLR4_5_23a23a2lvico0bp.R.inc(4609);if ((((a == b)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4610)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4611)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4612);return true;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(4613);if ((((a == null || b == null)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4614)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4615)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4616);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(4617);if ((((a instanceof OWLObjectProperty && b instanceof OWLObjectProperty)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4618)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4619)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4620);return equals((OWLObjectProperty) a, (OWLObjectProperty) b);
        } }else {__CLR4_5_23a23a2lvico0bp.R.inc(4621);if ((((a instanceof OWLObjectInverseOf
                && b instanceof OWLObjectInverseOf)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4622)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4623)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4624);return equals((OWLObjectInverseOf) a, (OWLObjectInverseOf) b);
        } }else {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4625);return false;
        }
    }}}finally{__CLR4_5_23a23a2lvico0bp.R.flushNeeded();}}

    private static boolean equalObjectPropertyExpressions(
            Collection<OWLObjectPropertyExpression> a,
            Collection<OWLObjectPropertyExpression> b) {try{__CLR4_5_23a23a2lvico0bp.R.inc(4626);
        __CLR4_5_23a23a2lvico0bp.R.inc(4627);if ((((a.size() != b.size())&&(__CLR4_5_23a23a2lvico0bp.R.iget(4628)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4629)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4630);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(4631);Iterator<OWLObjectPropertyExpression> ai = a.iterator();
        __CLR4_5_23a23a2lvico0bp.R.inc(4632);Iterator<OWLObjectPropertyExpression> bi = b.iterator();
        __CLR4_5_23a23a2lvico0bp.R.inc(4633);while ((((ai.hasNext())&&(__CLR4_5_23a23a2lvico0bp.R.iget(4634)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4635)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4636);if ((((!equals(ai.next(), bi.next()))&&(__CLR4_5_23a23a2lvico0bp.R.iget(4637)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4638)==0&false))) {{
                __CLR4_5_23a23a2lvico0bp.R.inc(4639);return false;
            }
        }}
        }__CLR4_5_23a23a2lvico0bp.R.inc(4640);return true;
    }finally{__CLR4_5_23a23a2lvico0bp.R.flushNeeded();}}

    public static boolean equals(OWLDataProperty a, OWLDataProperty b) {try{__CLR4_5_23a23a2lvico0bp.R.inc(4641);
        __CLR4_5_23a23a2lvico0bp.R.inc(4642);if ((((a == b)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4643)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4644)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4645);return true;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(4646);if ((((a == null || b == null)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4647)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4648)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4649);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(4650);return a.equals(b);
    }finally{__CLR4_5_23a23a2lvico0bp.R.flushNeeded();}}

    private static boolean equals(OWLDataPropertyExpression a,
            OWLDataPropertyExpression b) {try{__CLR4_5_23a23a2lvico0bp.R.inc(4651);
        __CLR4_5_23a23a2lvico0bp.R.inc(4652);return equals(a.asOWLDataProperty(), b.asOWLDataProperty());
    }finally{__CLR4_5_23a23a2lvico0bp.R.flushNeeded();}}

    private static boolean equalDataPropertyExpressions(
            Set<OWLDataPropertyExpression> a, Set<OWLDataPropertyExpression> b) {try{__CLR4_5_23a23a2lvico0bp.R.inc(4653);
        __CLR4_5_23a23a2lvico0bp.R.inc(4654);if ((((a.size() != b.size())&&(__CLR4_5_23a23a2lvico0bp.R.iget(4655)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4656)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4657);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(4658);Iterator<OWLDataPropertyExpression> ai = a.iterator();
        __CLR4_5_23a23a2lvico0bp.R.inc(4659);Iterator<OWLDataPropertyExpression> bi = b.iterator();
        __CLR4_5_23a23a2lvico0bp.R.inc(4660);while ((((ai.hasNext())&&(__CLR4_5_23a23a2lvico0bp.R.iget(4661)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4662)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4663);if ((((!equals(ai.next(), bi.next()))&&(__CLR4_5_23a23a2lvico0bp.R.iget(4664)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4665)==0&false))) {{
                __CLR4_5_23a23a2lvico0bp.R.inc(4666);return false;
            }
        }}
        }__CLR4_5_23a23a2lvico0bp.R.inc(4667);return true;
    }finally{__CLR4_5_23a23a2lvico0bp.R.flushNeeded();}}

    public static boolean equals(OWLAnnotationProperty a,
            OWLAnnotationProperty b) {try{__CLR4_5_23a23a2lvico0bp.R.inc(4668);
        __CLR4_5_23a23a2lvico0bp.R.inc(4669);if ((((a == b)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4670)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4671)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4672);return true;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(4673);if ((((a == null || b == null)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4674)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4675)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4676);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(4677);return a.equals(b);
    }finally{__CLR4_5_23a23a2lvico0bp.R.flushNeeded();}}

    /*
    * Data Ranges
    */
    private static boolean equals(OWLDataRange a, OWLDataRange b) {try{__CLR4_5_23a23a2lvico0bp.R.inc(4678);
        __CLR4_5_23a23a2lvico0bp.R.inc(4679);if ((((a == b)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4680)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4681)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4682);return true;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(4683);if ((((a == null || b == null)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4684)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4685)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4686);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(4687);if ((((a instanceof OWLDataComplementOf
                && b instanceof OWLDataComplementOf)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4688)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4689)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4690);return equals((OWLDataComplementOf) a, (OWLDataComplementOf) b);
        } }else {__CLR4_5_23a23a2lvico0bp.R.inc(4691);if ((((a instanceof OWLDataIntersectionOf
                && b instanceof OWLDataIntersectionOf)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4692)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4693)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4694);return equals((OWLDataIntersectionOf) a, (OWLDataIntersectionOf) b);
        } }else {__CLR4_5_23a23a2lvico0bp.R.inc(4695);if ((((a instanceof OWLDataOneOf && b instanceof OWLDataOneOf)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4696)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4697)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4698);return equals((OWLDataOneOf) a, (OWLDataOneOf) b);
        } }else {__CLR4_5_23a23a2lvico0bp.R.inc(4699);if ((((a instanceof OWLDatatype && b instanceof OWLDatatype)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4700)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4701)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4702);return equals((OWLDatatype) a, (OWLDatatype) b);
        } }else {__CLR4_5_23a23a2lvico0bp.R.inc(4703);if ((((a instanceof OWLDatatypeRestriction
                && b instanceof OWLDatatypeRestriction)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4704)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4705)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4706);return equals((OWLDatatypeRestriction) a,
                    (OWLDatatypeRestriction) b);
        } }else {__CLR4_5_23a23a2lvico0bp.R.inc(4707);if ((((a instanceof OWLDataUnionOf && b instanceof OWLDataUnionOf)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4708)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4709)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4710);return equals((OWLDataUnionOf) a, (OWLDataUnionOf) b);
        } }else {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4711);return false;
        }
    }}}}}}}finally{__CLR4_5_23a23a2lvico0bp.R.flushNeeded();}}

    private static boolean equalDataRanges(Set<OWLDataRange> aaa,
            Set<OWLDataRange> bbb) {try{__CLR4_5_23a23a2lvico0bp.R.inc(4712);
        __CLR4_5_23a23a2lvico0bp.R.inc(4713);if ((((aaa.size() != bbb.size())&&(__CLR4_5_23a23a2lvico0bp.R.iget(4714)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4715)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4716);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(4717);Iterator<OWLDataRange> ai = aaa.iterator();
        __CLR4_5_23a23a2lvico0bp.R.inc(4718);Iterator<OWLDataRange> bi = bbb.iterator();
        __CLR4_5_23a23a2lvico0bp.R.inc(4719);while ((((ai.hasNext())&&(__CLR4_5_23a23a2lvico0bp.R.iget(4720)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4721)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4722);if ((((!equals(ai.next(), bi.next()))&&(__CLR4_5_23a23a2lvico0bp.R.iget(4723)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4724)==0&false))) {{
                __CLR4_5_23a23a2lvico0bp.R.inc(4725);return false;
            }
        }}
        }__CLR4_5_23a23a2lvico0bp.R.inc(4726);return true;
    }finally{__CLR4_5_23a23a2lvico0bp.R.flushNeeded();}}

    public static boolean equals(OWLDataComplementOf a, OWLDataComplementOf b) {try{__CLR4_5_23a23a2lvico0bp.R.inc(4727);
        __CLR4_5_23a23a2lvico0bp.R.inc(4728);if ((((a == b)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4729)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4730)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4731);return true;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(4732);if ((((a == null || b == null)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4733)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4734)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4735);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(4736);return equals(a.getDataRange(), b.getDataRange());
    }finally{__CLR4_5_23a23a2lvico0bp.R.flushNeeded();}}

    public static boolean equals(OWLDataOneOf a, OWLDataOneOf b) {try{__CLR4_5_23a23a2lvico0bp.R.inc(4737);
        __CLR4_5_23a23a2lvico0bp.R.inc(4738);if ((((a == b)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4739)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4740)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4741);return true;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(4742);if ((((a == null || b == null)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4743)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4744)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4745);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(4746);return equalLiterals(a.getValues(), b.getValues());
    }finally{__CLR4_5_23a23a2lvico0bp.R.flushNeeded();}}

    public static boolean equals(OWLDataUnionOf a, OWLDataUnionOf b) {try{__CLR4_5_23a23a2lvico0bp.R.inc(4747);
        __CLR4_5_23a23a2lvico0bp.R.inc(4748);if ((((a == b)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4749)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4750)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4751);return true;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(4752);if ((((a == null || b == null)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4753)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4754)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4755);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(4756);return equalDataRanges(a.getOperands(), b.getOperands());
    }finally{__CLR4_5_23a23a2lvico0bp.R.flushNeeded();}}

    private static boolean equals(OWLDataIntersectionOf a,
            OWLDataIntersectionOf b) {try{__CLR4_5_23a23a2lvico0bp.R.inc(4757);
        __CLR4_5_23a23a2lvico0bp.R.inc(4758);if ((((a == b)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4759)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4760)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4761);return true;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(4762);if ((((a == null || b == null)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4763)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4764)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4765);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(4766);return equalDataRanges(a.getOperands(), b.getOperands());
    }finally{__CLR4_5_23a23a2lvico0bp.R.flushNeeded();}}

    public static boolean equals(OWLDatatypeRestriction a,
            OWLDatatypeRestriction b) {try{__CLR4_5_23a23a2lvico0bp.R.inc(4767);
        __CLR4_5_23a23a2lvico0bp.R.inc(4768);if ((((a == b)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4769)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4770)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4771);return true;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(4772);if ((((a == null || b == null)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4773)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4774)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4775);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(4776);if ((((!equals(a.getDatatype(), b.getDatatype()))&&(__CLR4_5_23a23a2lvico0bp.R.iget(4777)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4778)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4779);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(4780);return equalFacetRestrictions(a.getFacetRestrictions(),
                b.getFacetRestrictions());
    }finally{__CLR4_5_23a23a2lvico0bp.R.flushNeeded();}}

    public static boolean equals(OWLFacetRestriction a, OWLFacetRestriction b) {try{__CLR4_5_23a23a2lvico0bp.R.inc(4781);
        __CLR4_5_23a23a2lvico0bp.R.inc(4782);if ((((a == b)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4783)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4784)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4785);return true;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(4786);if ((((a == null || b == null)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4787)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4788)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4789);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(4790);if ((((!equals(a.getFacetValue(), b.getFacetValue()))&&(__CLR4_5_23a23a2lvico0bp.R.iget(4791)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4792)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4793);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(4794);if ((((!equals(a.getFacet(), b.getFacet()))&&(__CLR4_5_23a23a2lvico0bp.R.iget(4795)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4796)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4797);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(4798);return true;
    }finally{__CLR4_5_23a23a2lvico0bp.R.flushNeeded();}}

    public static boolean equalFacetRestrictions(Set<OWLFacetRestriction> a,
            Set<OWLFacetRestriction> b) {try{__CLR4_5_23a23a2lvico0bp.R.inc(4799);
        __CLR4_5_23a23a2lvico0bp.R.inc(4800);if ((((a.size() != b.size())&&(__CLR4_5_23a23a2lvico0bp.R.iget(4801)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4802)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4803);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(4804);Iterator<OWLFacetRestriction> ai = a.iterator();
        __CLR4_5_23a23a2lvico0bp.R.inc(4805);Iterator<OWLFacetRestriction> bi = b.iterator();
        __CLR4_5_23a23a2lvico0bp.R.inc(4806);while ((((ai.hasNext())&&(__CLR4_5_23a23a2lvico0bp.R.iget(4807)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4808)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4809);if ((((!equals(ai.next(), bi.next()))&&(__CLR4_5_23a23a2lvico0bp.R.iget(4810)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4811)==0&false))) {{
                __CLR4_5_23a23a2lvico0bp.R.inc(4812);return false;
            }
        }}
        }__CLR4_5_23a23a2lvico0bp.R.inc(4813);return true;
    }finally{__CLR4_5_23a23a2lvico0bp.R.flushNeeded();}}

    private static boolean equals(OWLFacet a, OWLFacet b) {try{__CLR4_5_23a23a2lvico0bp.R.inc(4814);
        __CLR4_5_23a23a2lvico0bp.R.inc(4815);if ((((a == b)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4816)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4817)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4818);return true;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(4819);if ((((a == null || b == null)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4820)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4821)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4822);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(4823);return a.equals(b);
    }finally{__CLR4_5_23a23a2lvico0bp.R.flushNeeded();}}

    /*
     *  Annotation related types
     */
    public static boolean equals(OWLAnnotation a, OWLAnnotation b) {try{__CLR4_5_23a23a2lvico0bp.R.inc(4824);
        __CLR4_5_23a23a2lvico0bp.R.inc(4825);if ((((a == b)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4826)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4827)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4828);return true;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(4829);if ((((a == null || b == null)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4830)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4831)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4832);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(4833);if ((((!equals(a.getProperty(), b.getProperty()))&&(__CLR4_5_23a23a2lvico0bp.R.iget(4834)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4835)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4836);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(4837);if ((((!equals(a.getValue(), b.getValue()))&&(__CLR4_5_23a23a2lvico0bp.R.iget(4838)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4839)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4840);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(4841);return equalAnnotations(a.getAnnotations(), b.getAnnotations());
    }finally{__CLR4_5_23a23a2lvico0bp.R.flushNeeded();}}

    public static boolean equalAnnotations(Set<OWLAnnotation> a,
            Set<OWLAnnotation> b) {try{__CLR4_5_23a23a2lvico0bp.R.inc(4842);
        __CLR4_5_23a23a2lvico0bp.R.inc(4843);if ((((a == b)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4844)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4845)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4846);return true;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(4847);if ((((a == null || b == null)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4848)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4849)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4850);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(4851);Iterator<OWLAnnotation> ai, bi;
        __CLR4_5_23a23a2lvico0bp.R.inc(4852);if ((((a.size() != b.size())&&(__CLR4_5_23a23a2lvico0bp.R.iget(4853)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4854)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4855);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(4856);ai = a.iterator();
        __CLR4_5_23a23a2lvico0bp.R.inc(4857);bi = b.iterator();
        __CLR4_5_23a23a2lvico0bp.R.inc(4858);while ((((ai.hasNext())&&(__CLR4_5_23a23a2lvico0bp.R.iget(4859)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4860)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4861);if ((((!equals(ai.next(), bi.next()))&&(__CLR4_5_23a23a2lvico0bp.R.iget(4862)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4863)==0&false))) {{
                __CLR4_5_23a23a2lvico0bp.R.inc(4864);return false;
            }
        }}
        }__CLR4_5_23a23a2lvico0bp.R.inc(4865);return true;
    }finally{__CLR4_5_23a23a2lvico0bp.R.flushNeeded();}}

    private static boolean
            equals(OWLAnnotationSubject a, OWLAnnotationSubject b) {try{__CLR4_5_23a23a2lvico0bp.R.inc(4866);
        __CLR4_5_23a23a2lvico0bp.R.inc(4867);if ((((a == b)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4868)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4869)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4870);return true;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(4871);if ((((a == null || b == null)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4872)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4873)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4874);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(4875);if ((((a instanceof IRI && b instanceof IRI)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4876)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4877)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4878);return equals((IRI) a, (IRI) b);
        } }else {__CLR4_5_23a23a2lvico0bp.R.inc(4879);if ((((a instanceof OWLAnonymousIndividual
                && b instanceof OWLAnonymousIndividual)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4880)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4881)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4882);return equals((OWLAnonymousIndividual) a,
                    (OWLAnonymousIndividual) b);
        } }else {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4883);return false;
        }
    }}}finally{__CLR4_5_23a23a2lvico0bp.R.flushNeeded();}}

    public static boolean equals(OWLAnnotationValue a, OWLAnnotationValue b) {try{__CLR4_5_23a23a2lvico0bp.R.inc(4884);
        __CLR4_5_23a23a2lvico0bp.R.inc(4885);if ((((a == b)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4886)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4887)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4888);return true;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(4889);if ((((a == null || b == null)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4890)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4891)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4892);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(4893);if ((((a.asAnonymousIndividual().isPresent() || a.asIRI().isPresent())&&(__CLR4_5_23a23a2lvico0bp.R.iget(4894)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4895)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4896);return a.equals(b);
        } }else {__CLR4_5_23a23a2lvico0bp.R.inc(4897);if ((((a.asLiteral().isPresent() && b.asLiteral().isPresent())&&(__CLR4_5_23a23a2lvico0bp.R.iget(4898)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4899)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4900);return equals(a.asLiteral().get(), b.asLiteral().get());
        } }else {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4901);return false;
        }
    }}}finally{__CLR4_5_23a23a2lvico0bp.R.flushNeeded();}}

    /* 
     * Axioms
     */
    /* 
     *  Annotation related axioms
     */
    public static boolean equals(OWLAnnotationAssertionAxiom a,
            OWLAnnotationAssertionAxiom b) {try{__CLR4_5_23a23a2lvico0bp.R.inc(4902);
        __CLR4_5_23a23a2lvico0bp.R.inc(4903);if ((((a == b)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4904)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4905)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4906);return true;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(4907);if ((((a == null || b == null)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4908)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4909)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4910);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(4911);if ((((!equals(a.getProperty(), b.getProperty()))&&(__CLR4_5_23a23a2lvico0bp.R.iget(4912)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4913)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4914);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(4915);if ((((!equals(a.getSubject(), b.getSubject()))&&(__CLR4_5_23a23a2lvico0bp.R.iget(4916)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4917)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4918);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(4919);if ((((!equals(a.getValue(), b.getValue()))&&(__CLR4_5_23a23a2lvico0bp.R.iget(4920)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4921)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4922);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(4923);return equalAnnotations(a.getAnnotations(), b.getAnnotations());
    }finally{__CLR4_5_23a23a2lvico0bp.R.flushNeeded();}}

    public static boolean equals(OWLSubAnnotationPropertyOfAxiom a,
            OWLSubAnnotationPropertyOfAxiom b) {try{__CLR4_5_23a23a2lvico0bp.R.inc(4924);
        __CLR4_5_23a23a2lvico0bp.R.inc(4925);if ((((a == b)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4926)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4927)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4928);return true;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(4929);if ((((a == null || b == null)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4930)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4931)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4932);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(4933);return a.equals(b);
    }finally{__CLR4_5_23a23a2lvico0bp.R.flushNeeded();}}

    public static boolean equals(OWLAnnotationPropertyDomainAxiom a,
            OWLAnnotationPropertyDomainAxiom b) {try{__CLR4_5_23a23a2lvico0bp.R.inc(4934);
        __CLR4_5_23a23a2lvico0bp.R.inc(4935);if ((((a == b)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4936)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4937)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4938);return true;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(4939);if ((((a == null || b == null)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4940)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4941)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4942);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(4943);if ((((!a.getProperty().equals(b.getProperty()))&&(__CLR4_5_23a23a2lvico0bp.R.iget(4944)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4945)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4946);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(4947);if ((((!equals(a.getDomain(), b.getDomain()))&&(__CLR4_5_23a23a2lvico0bp.R.iget(4948)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4949)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4950);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(4951);return equalAnnotations(a.getAnnotations(), b.getAnnotations());
    }finally{__CLR4_5_23a23a2lvico0bp.R.flushNeeded();}}

    public static boolean equals(OWLAnnotationPropertyRangeAxiom a,
            OWLAnnotationPropertyRangeAxiom b) {try{__CLR4_5_23a23a2lvico0bp.R.inc(4952);
        __CLR4_5_23a23a2lvico0bp.R.inc(4953);if ((((a == b)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4954)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4955)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4956);return true;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(4957);if ((((a == null || b == null)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4958)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4959)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4960);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(4961);if ((((!a.getProperty().equals(b.getProperty()))&&(__CLR4_5_23a23a2lvico0bp.R.iget(4962)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4963)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4964);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(4965);if ((((!equals(a.getRange(), b.getRange()))&&(__CLR4_5_23a23a2lvico0bp.R.iget(4966)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4967)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4968);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(4969);return equalAnnotations(a.getAnnotations(), b.getAnnotations());
    }finally{__CLR4_5_23a23a2lvico0bp.R.flushNeeded();}}

    // Declaration Axiom
    public static boolean equals(OWLDeclarationAxiom a, OWLDeclarationAxiom b) {try{__CLR4_5_23a23a2lvico0bp.R.inc(4970);
        __CLR4_5_23a23a2lvico0bp.R.inc(4971);if ((((a == b)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4972)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4973)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4974);return true;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(4975);if ((((a == null || b == null)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4976)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4977)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4978);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(4979);if ((((!equals(a.getEntity(), b.getEntity()))&&(__CLR4_5_23a23a2lvico0bp.R.iget(4980)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4981)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4982);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(4983);return equalAnnotations(a.getAnnotations(), b.getAnnotations());
    }finally{__CLR4_5_23a23a2lvico0bp.R.flushNeeded();}}

    // Datatype Definition axiom
    public static boolean equals(OWLDatatypeDefinitionAxiom a,
            OWLDatatypeDefinitionAxiom b) {try{__CLR4_5_23a23a2lvico0bp.R.inc(4984);
        __CLR4_5_23a23a2lvico0bp.R.inc(4985);if ((((a == b)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4986)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4987)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4988);return true;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(4989);if ((((a == null || b == null)&&(__CLR4_5_23a23a2lvico0bp.R.iget(4990)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4991)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4992);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(4993);if ((((!equals(a.getDatatype(), b.getDatatype()))&&(__CLR4_5_23a23a2lvico0bp.R.iget(4994)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4995)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(4996);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(4997);if ((((!equals(a.getDataRange(), b.getDataRange()))&&(__CLR4_5_23a23a2lvico0bp.R.iget(4998)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(4999)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5000);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5001);return equalAnnotations(a.getAnnotations(), b.getAnnotations());
    }finally{__CLR4_5_23a23a2lvico0bp.R.flushNeeded();}}

    // Individual related Axioms
    public static boolean equals(OWLObjectPropertyAssertionAxiom a,
            OWLObjectPropertyAssertionAxiom b) {try{__CLR4_5_23a23a2lvico0bp.R.inc(5002);
        __CLR4_5_23a23a2lvico0bp.R.inc(5003);if ((((a == b)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5004)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5005)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5006);return true;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5007);if ((((a == null || b == null)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5008)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5009)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5010);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5011);if ((((!equals(a.getProperty(), b.getProperty()))&&(__CLR4_5_23a23a2lvico0bp.R.iget(5012)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5013)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5014);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5015);if ((((!equals(a.getSubject(), b.getSubject()))&&(__CLR4_5_23a23a2lvico0bp.R.iget(5016)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5017)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5018);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5019);if ((((!equals(a.getObject(), b.getObject()))&&(__CLR4_5_23a23a2lvico0bp.R.iget(5020)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5021)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5022);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5023);return equalAnnotations(a.getAnnotations(), b.getAnnotations());
    }finally{__CLR4_5_23a23a2lvico0bp.R.flushNeeded();}}

    public static boolean equals(OWLNegativeObjectPropertyAssertionAxiom a,
            OWLNegativeObjectPropertyAssertionAxiom b) {try{__CLR4_5_23a23a2lvico0bp.R.inc(5024);
        __CLR4_5_23a23a2lvico0bp.R.inc(5025);if ((((a == b)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5026)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5027)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5028);return true;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5029);if ((((a == null || b == null)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5030)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5031)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5032);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5033);if ((((!equals(a.getProperty(), b.getProperty()))&&(__CLR4_5_23a23a2lvico0bp.R.iget(5034)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5035)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5036);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5037);if ((((!equals(a.getSubject(), b.getSubject()))&&(__CLR4_5_23a23a2lvico0bp.R.iget(5038)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5039)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5040);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5041);if ((((!equals(a.getObject(), b.getObject()))&&(__CLR4_5_23a23a2lvico0bp.R.iget(5042)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5043)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5044);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5045);return equalAnnotations(a.getAnnotations(), b.getAnnotations());
    }finally{__CLR4_5_23a23a2lvico0bp.R.flushNeeded();}}

    public static boolean equals(OWLDataPropertyAssertionAxiom a,
            OWLDataPropertyAssertionAxiom b) {try{__CLR4_5_23a23a2lvico0bp.R.inc(5046);
        __CLR4_5_23a23a2lvico0bp.R.inc(5047);if ((((a == b)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5048)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5049)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5050);return true;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5051);if ((((a == null || b == null)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5052)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5053)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5054);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5055);if ((((!equals(a.getSubject(), b.getSubject()))&&(__CLR4_5_23a23a2lvico0bp.R.iget(5056)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5057)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5058);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5059);if ((((!equals(a.getProperty(), b.getProperty()))&&(__CLR4_5_23a23a2lvico0bp.R.iget(5060)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5061)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5062);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5063);if ((((!equals(a.getObject(), b.getObject()))&&(__CLR4_5_23a23a2lvico0bp.R.iget(5064)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5065)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5066);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5067);return equalAnnotations(a.getAnnotations(), b.getAnnotations());
    }finally{__CLR4_5_23a23a2lvico0bp.R.flushNeeded();}}

    public static boolean equals(OWLNegativeDataPropertyAssertionAxiom a,
            OWLNegativeDataPropertyAssertionAxiom b) {try{__CLR4_5_23a23a2lvico0bp.R.inc(5068);
        __CLR4_5_23a23a2lvico0bp.R.inc(5069);if ((((a == b)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5070)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5071)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5072);return true;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5073);if ((((a == null || b == null)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5074)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5075)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5076);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5077);if ((((!equals(a.getSubject(), b.getSubject()))&&(__CLR4_5_23a23a2lvico0bp.R.iget(5078)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5079)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5080);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5081);if ((((!equals(a.getProperty(), b.getProperty()))&&(__CLR4_5_23a23a2lvico0bp.R.iget(5082)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5083)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5084);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5085);if ((((!equals(a.getObject(), b.getObject()))&&(__CLR4_5_23a23a2lvico0bp.R.iget(5086)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5087)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5088);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5089);return equalAnnotations(a.getAnnotations(), b.getAnnotations());
    }finally{__CLR4_5_23a23a2lvico0bp.R.flushNeeded();}}

    public static boolean equals(OWLClassAssertionAxiom a,
            OWLClassAssertionAxiom b) {try{__CLR4_5_23a23a2lvico0bp.R.inc(5090);
        __CLR4_5_23a23a2lvico0bp.R.inc(5091);if ((((a == b)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5092)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5093)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5094);return true;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5095);if ((((a == null || b == null)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5096)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5097)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5098);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5099);if ((((!equals(a.getIndividual(), b.getIndividual()))&&(__CLR4_5_23a23a2lvico0bp.R.iget(5100)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5101)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5102);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5103);if ((((!equals(a.getClassExpression(), b.getClassExpression()))&&(__CLR4_5_23a23a2lvico0bp.R.iget(5104)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5105)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5106);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5107);return equalAnnotations(a.getAnnotations(), b.getAnnotations());
    }finally{__CLR4_5_23a23a2lvico0bp.R.flushNeeded();}}

    public static boolean equals(OWLSameIndividualAxiom a,
            OWLSameIndividualAxiom b) {try{__CLR4_5_23a23a2lvico0bp.R.inc(5108);
        __CLR4_5_23a23a2lvico0bp.R.inc(5109);if ((((a == b)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5110)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5111)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5112);return true;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5113);if ((((a == null || b == null)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5114)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5115)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5116);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5117);Set<OWLIndividual> aaa = a.getIndividuals();
        __CLR4_5_23a23a2lvico0bp.R.inc(5118);Set<OWLIndividual> bbb = b.getIndividuals();
        __CLR4_5_23a23a2lvico0bp.R.inc(5119);if ((((aaa.size() != bbb.size())&&(__CLR4_5_23a23a2lvico0bp.R.iget(5120)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5121)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5122);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5123);Iterator<OWLIndividual> ai = aaa.iterator();
        __CLR4_5_23a23a2lvico0bp.R.inc(5124);Iterator<OWLIndividual> bi = bbb.iterator();
        __CLR4_5_23a23a2lvico0bp.R.inc(5125);while ((((ai.hasNext())&&(__CLR4_5_23a23a2lvico0bp.R.iget(5126)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5127)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5128);if ((((!equals(ai.next(), bi.next()))&&(__CLR4_5_23a23a2lvico0bp.R.iget(5129)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5130)==0&false))) {{
                __CLR4_5_23a23a2lvico0bp.R.inc(5131);return false;
            }
        }}
        }__CLR4_5_23a23a2lvico0bp.R.inc(5132);return equalAnnotations(a.getAnnotations(), b.getAnnotations());
    }finally{__CLR4_5_23a23a2lvico0bp.R.flushNeeded();}}

    public static boolean equals(OWLDifferentIndividualsAxiom a,
            OWLDifferentIndividualsAxiom b) {try{__CLR4_5_23a23a2lvico0bp.R.inc(5133);
        __CLR4_5_23a23a2lvico0bp.R.inc(5134);if ((((a == b)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5135)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5136)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5137);return true;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5138);if ((((a == null || b == null)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5139)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5140)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5141);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5142);Set<OWLIndividual> aaa = a.getIndividuals();
        __CLR4_5_23a23a2lvico0bp.R.inc(5143);Set<OWLIndividual> bbb = b.getIndividuals();
        __CLR4_5_23a23a2lvico0bp.R.inc(5144);if ((((aaa.size() != bbb.size())&&(__CLR4_5_23a23a2lvico0bp.R.iget(5145)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5146)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5147);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5148);Iterator<OWLIndividual> ai = aaa.iterator();
        __CLR4_5_23a23a2lvico0bp.R.inc(5149);Iterator<OWLIndividual> bi = bbb.iterator();
        __CLR4_5_23a23a2lvico0bp.R.inc(5150);while ((((ai.hasNext())&&(__CLR4_5_23a23a2lvico0bp.R.iget(5151)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5152)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5153);if ((((!equals(ai.next(), bi.next()))&&(__CLR4_5_23a23a2lvico0bp.R.iget(5154)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5155)==0&false))) {{
                __CLR4_5_23a23a2lvico0bp.R.inc(5156);return false;
            }
        }}
        }__CLR4_5_23a23a2lvico0bp.R.inc(5157);return equalAnnotations(a.getAnnotations(), b.getAnnotations());
    }finally{__CLR4_5_23a23a2lvico0bp.R.flushNeeded();}}

    // Class Axioms
    public static boolean equals(OWLSubClassOfAxiom a, OWLSubClassOfAxiom b) {try{__CLR4_5_23a23a2lvico0bp.R.inc(5158);
        __CLR4_5_23a23a2lvico0bp.R.inc(5159);if ((((a == b)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5160)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5161)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5162);return true;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5163);if ((((a == null || b == null)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5164)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5165)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5166);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5167);if ((((!equals(a.getSubClass(), b.getSubClass()))&&(__CLR4_5_23a23a2lvico0bp.R.iget(5168)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5169)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5170);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5171);if ((((!equals(a.getSuperClass(), b.getSuperClass()))&&(__CLR4_5_23a23a2lvico0bp.R.iget(5172)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5173)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5174);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5175);return equalAnnotations(a.getAnnotations(), b.getAnnotations());
    }finally{__CLR4_5_23a23a2lvico0bp.R.flushNeeded();}}

    public static boolean equals(OWLEquivalentClassesAxiom a,
            OWLEquivalentClassesAxiom b) {try{__CLR4_5_23a23a2lvico0bp.R.inc(5176);
        __CLR4_5_23a23a2lvico0bp.R.inc(5177);if ((((a == b)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5178)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5179)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5180);return true;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5181);if ((((a == null || b == null)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5182)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5183)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5184);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5185);if ((((!equalClassExpressions(a.getClassExpressions(),
                b.getClassExpressions()))&&(__CLR4_5_23a23a2lvico0bp.R.iget(5186)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5187)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5188);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5189);return equalAnnotations(a.getAnnotations(), b.getAnnotations());
    }finally{__CLR4_5_23a23a2lvico0bp.R.flushNeeded();}}

    public static boolean equals(OWLDisjointClassesAxiom a,
            OWLDisjointClassesAxiom b) {try{__CLR4_5_23a23a2lvico0bp.R.inc(5190);
        __CLR4_5_23a23a2lvico0bp.R.inc(5191);if ((((a == b)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5192)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5193)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5194);return true;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5195);if ((((a == null || b == null)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5196)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5197)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5198);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5199);if ((((!equalClassExpressions(a.getClassExpressions(),
                b.getClassExpressions()))&&(__CLR4_5_23a23a2lvico0bp.R.iget(5200)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5201)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5202);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5203);return equalAnnotations(a.getAnnotations(), b.getAnnotations());
    }finally{__CLR4_5_23a23a2lvico0bp.R.flushNeeded();}}

    public static boolean equals(OWLDisjointUnionAxiom a,
            OWLDisjointUnionAxiom b) {try{__CLR4_5_23a23a2lvico0bp.R.inc(5204);
        __CLR4_5_23a23a2lvico0bp.R.inc(5205);if ((((a == b)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5206)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5207)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5208);return true;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5209);if ((((a == null || b == null)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5210)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5211)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5212);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5213);if ((((!equalClassExpressions(a.getClassExpressions(),
                b.getClassExpressions()))&&(__CLR4_5_23a23a2lvico0bp.R.iget(5214)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5215)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5216);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5217);return equalAnnotations(a.getAnnotations(), b.getAnnotations());
    }finally{__CLR4_5_23a23a2lvico0bp.R.flushNeeded();}}

    // Property Axioms
    // Property characteristics
    public static boolean equals(OWLAsymmetricObjectPropertyAxiom a,
            OWLAsymmetricObjectPropertyAxiom b) {try{__CLR4_5_23a23a2lvico0bp.R.inc(5218);
        __CLR4_5_23a23a2lvico0bp.R.inc(5219);if ((((a == b)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5220)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5221)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5222);return true;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5223);if ((((a == null || b == null)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5224)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5225)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5226);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5227);if ((((!equals(a.getProperty(), b.getProperty()))&&(__CLR4_5_23a23a2lvico0bp.R.iget(5228)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5229)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5230);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5231);return equalAnnotations(a.getAnnotations(), b.getAnnotations());
    }finally{__CLR4_5_23a23a2lvico0bp.R.flushNeeded();}}

    public static boolean equals(OWLReflexiveObjectPropertyAxiom a,
            OWLReflexiveObjectPropertyAxiom b) {try{__CLR4_5_23a23a2lvico0bp.R.inc(5232);
        __CLR4_5_23a23a2lvico0bp.R.inc(5233);if ((((a == b)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5234)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5235)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5236);return true;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5237);if ((((a == null || b == null)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5238)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5239)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5240);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5241);if ((((!equals(a.getProperty(), b.getProperty()))&&(__CLR4_5_23a23a2lvico0bp.R.iget(5242)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5243)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5244);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5245);return equalAnnotations(a.getAnnotations(), b.getAnnotations());
    }finally{__CLR4_5_23a23a2lvico0bp.R.flushNeeded();}}

    public static boolean equals(OWLIrreflexiveObjectPropertyAxiom a,
            OWLIrreflexiveObjectPropertyAxiom b) {try{__CLR4_5_23a23a2lvico0bp.R.inc(5246);
        __CLR4_5_23a23a2lvico0bp.R.inc(5247);if ((((a == b)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5248)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5249)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5250);return true;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5251);if ((((a == null || b == null)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5252)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5253)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5254);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5255);if ((((!equals(a.getProperty(), b.getProperty()))&&(__CLR4_5_23a23a2lvico0bp.R.iget(5256)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5257)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5258);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5259);return equalAnnotations(a.getAnnotations(), b.getAnnotations());
    }finally{__CLR4_5_23a23a2lvico0bp.R.flushNeeded();}}

    public static boolean equals(OWLFunctionalObjectPropertyAxiom a,
            OWLFunctionalObjectPropertyAxiom b) {try{__CLR4_5_23a23a2lvico0bp.R.inc(5260);
        __CLR4_5_23a23a2lvico0bp.R.inc(5261);if ((((a == b)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5262)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5263)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5264);return true;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5265);if ((((a == null || b == null)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5266)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5267)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5268);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5269);if ((((!equals(a.getProperty(), b.getProperty()))&&(__CLR4_5_23a23a2lvico0bp.R.iget(5270)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5271)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5272);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5273);return equalAnnotations(a.getAnnotations(), b.getAnnotations());
    }finally{__CLR4_5_23a23a2lvico0bp.R.flushNeeded();}}

    public static boolean equals(OWLInverseFunctionalObjectPropertyAxiom a,
            OWLInverseFunctionalObjectPropertyAxiom b) {try{__CLR4_5_23a23a2lvico0bp.R.inc(5274);
        __CLR4_5_23a23a2lvico0bp.R.inc(5275);if ((((a == b)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5276)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5277)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5278);return true;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5279);if ((((a == null || b == null)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5280)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5281)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5282);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5283);if ((((!equals(a.getProperty(), b.getProperty()))&&(__CLR4_5_23a23a2lvico0bp.R.iget(5284)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5285)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5286);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5287);return equalAnnotations(a.getAnnotations(), b.getAnnotations());
    }finally{__CLR4_5_23a23a2lvico0bp.R.flushNeeded();}}

    public static boolean equals(OWLSymmetricObjectPropertyAxiom a,
            OWLSymmetricObjectPropertyAxiom b) {try{__CLR4_5_23a23a2lvico0bp.R.inc(5288);
        __CLR4_5_23a23a2lvico0bp.R.inc(5289);if ((((a == b)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5290)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5291)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5292);return true;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5293);if ((((a == null || b == null)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5294)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5295)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5296);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5297);if ((((!equals(a.getProperty(), b.getProperty()))&&(__CLR4_5_23a23a2lvico0bp.R.iget(5298)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5299)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5300);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5301);return equalAnnotations(a.getAnnotations(), b.getAnnotations());
    }finally{__CLR4_5_23a23a2lvico0bp.R.flushNeeded();}}

    public static boolean equals(OWLTransitiveObjectPropertyAxiom a,
            OWLTransitiveObjectPropertyAxiom b) {try{__CLR4_5_23a23a2lvico0bp.R.inc(5302);
        __CLR4_5_23a23a2lvico0bp.R.inc(5303);if ((((a == b)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5304)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5305)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5306);return true;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5307);if ((((a == null || b == null)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5308)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5309)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5310);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5311);if ((((!equals(a.getProperty(), b.getProperty()))&&(__CLR4_5_23a23a2lvico0bp.R.iget(5312)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5313)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5314);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5315);return equalAnnotations(a.getAnnotations(), b.getAnnotations());
    }finally{__CLR4_5_23a23a2lvico0bp.R.flushNeeded();}}

    public static boolean equals(OWLFunctionalDataPropertyAxiom a,
            OWLFunctionalDataPropertyAxiom b) {try{__CLR4_5_23a23a2lvico0bp.R.inc(5316);
        __CLR4_5_23a23a2lvico0bp.R.inc(5317);if ((((a == b)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5318)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5319)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5320);return true;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5321);if ((((a == null || b == null)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5322)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5323)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5324);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5325);if ((((!equals(a.getProperty(), b.getProperty()))&&(__CLR4_5_23a23a2lvico0bp.R.iget(5326)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5327)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5328);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5329);return equalAnnotations(a.getAnnotations(), b.getAnnotations());
    }finally{__CLR4_5_23a23a2lvico0bp.R.flushNeeded();}}

    // Object Property Axioms
    public static boolean equals(OWLObjectPropertyDomainAxiom a,
            OWLObjectPropertyDomainAxiom b) {try{__CLR4_5_23a23a2lvico0bp.R.inc(5330);
        __CLR4_5_23a23a2lvico0bp.R.inc(5331);if ((((a == b)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5332)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5333)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5334);return true;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5335);if ((((a == null || b == null)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5336)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5337)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5338);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5339);if ((((!equals(a.getProperty(), b.getProperty()))&&(__CLR4_5_23a23a2lvico0bp.R.iget(5340)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5341)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5342);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5343);if ((((!equals(a.getDomain(), b.getDomain()))&&(__CLR4_5_23a23a2lvico0bp.R.iget(5344)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5345)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5346);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5347);return equalAnnotations(a.getAnnotations(), b.getAnnotations());
    }finally{__CLR4_5_23a23a2lvico0bp.R.flushNeeded();}}

    public static boolean equals(OWLObjectPropertyRangeAxiom a,
            OWLObjectPropertyRangeAxiom b) {try{__CLR4_5_23a23a2lvico0bp.R.inc(5348);
        __CLR4_5_23a23a2lvico0bp.R.inc(5349);if ((((a == b)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5350)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5351)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5352);return true;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5353);if ((((a == null || b == null)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5354)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5355)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5356);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5357);if ((((!equals(a.getProperty(), b.getProperty()))&&(__CLR4_5_23a23a2lvico0bp.R.iget(5358)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5359)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5360);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5361);if ((((!equals(a.getRange(), b.getRange()))&&(__CLR4_5_23a23a2lvico0bp.R.iget(5362)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5363)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5364);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5365);return equalAnnotations(a.getAnnotations(), b.getAnnotations());
    }finally{__CLR4_5_23a23a2lvico0bp.R.flushNeeded();}}

    public static boolean equals(OWLEquivalentObjectPropertiesAxiom a,
            OWLEquivalentObjectPropertiesAxiom b) {try{__CLR4_5_23a23a2lvico0bp.R.inc(5366);
        __CLR4_5_23a23a2lvico0bp.R.inc(5367);if ((((a == b)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5368)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5369)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5370);return true;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5371);if ((((a == null || b == null)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5372)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5373)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5374);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5375);if ((((!equalObjectPropertyExpressions(a.getProperties(),
                b.getProperties()))&&(__CLR4_5_23a23a2lvico0bp.R.iget(5376)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5377)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5378);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5379);return equalAnnotations(a.getAnnotations(), b.getAnnotations());
    }finally{__CLR4_5_23a23a2lvico0bp.R.flushNeeded();}}

    public static boolean equals(OWLDisjointObjectPropertiesAxiom a,
            OWLDisjointObjectPropertiesAxiom b) {try{__CLR4_5_23a23a2lvico0bp.R.inc(5380);
        __CLR4_5_23a23a2lvico0bp.R.inc(5381);if ((((a == b)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5382)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5383)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5384);return true;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5385);if ((((a == null || b == null)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5386)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5387)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5388);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5389);if ((((!equalObjectPropertyExpressions(a.getProperties(),
                b.getProperties()))&&(__CLR4_5_23a23a2lvico0bp.R.iget(5390)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5391)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5392);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5393);return equalAnnotations(a.getAnnotations(), b.getAnnotations());
    }finally{__CLR4_5_23a23a2lvico0bp.R.flushNeeded();}}

    public static boolean equals(OWLSubObjectPropertyOfAxiom a,
            OWLSubObjectPropertyOfAxiom b) {try{__CLR4_5_23a23a2lvico0bp.R.inc(5394);
        __CLR4_5_23a23a2lvico0bp.R.inc(5395);if ((((a == b)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5396)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5397)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5398);return true;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5399);if ((((a == null || b == null)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5400)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5401)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5402);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5403);if ((((!equals(a.getSubProperty(), b.getSubProperty()))&&(__CLR4_5_23a23a2lvico0bp.R.iget(5404)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5405)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5406);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5407);if ((((!equals(a.getSuperProperty(), b.getSuperProperty()))&&(__CLR4_5_23a23a2lvico0bp.R.iget(5408)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5409)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5410);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5411);return equalAnnotations(a.getAnnotations(), b.getAnnotations());
    }finally{__CLR4_5_23a23a2lvico0bp.R.flushNeeded();}}

    public static boolean equals(OWLSubPropertyChainOfAxiom a,
            OWLSubPropertyChainOfAxiom b) {try{__CLR4_5_23a23a2lvico0bp.R.inc(5412);
        __CLR4_5_23a23a2lvico0bp.R.inc(5413);if ((((a == b)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5414)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5415)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5416);return true;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5417);if ((((a == null || b == null)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5418)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5419)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5420);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5421);if ((((!equals(a.getSuperProperty(), b.getSuperProperty()))&&(__CLR4_5_23a23a2lvico0bp.R.iget(5422)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5423)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5424);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5425);if ((((!equalObjectPropertyExpressions(a.getPropertyChain(),
                b.getPropertyChain()))&&(__CLR4_5_23a23a2lvico0bp.R.iget(5426)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5427)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5428);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5429);return equalAnnotations(a.getAnnotations(), b.getAnnotations());
    }finally{__CLR4_5_23a23a2lvico0bp.R.flushNeeded();}}

    public static boolean equals(OWLInverseObjectPropertiesAxiom a,
            OWLInverseObjectPropertiesAxiom b) {try{__CLR4_5_23a23a2lvico0bp.R.inc(5430);
        __CLR4_5_23a23a2lvico0bp.R.inc(5431);if ((((a == b)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5432)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5433)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5434);return true;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5435);if ((((a == null || b == null)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5436)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5437)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5438);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5439);return a.equals(b);
    }finally{__CLR4_5_23a23a2lvico0bp.R.flushNeeded();}}

    // Data Property Axioms
    public static boolean equals(OWLDataPropertyDomainAxiom a,
            OWLDataPropertyDomainAxiom b) {try{__CLR4_5_23a23a2lvico0bp.R.inc(5440);
        __CLR4_5_23a23a2lvico0bp.R.inc(5441);if ((((a == b)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5442)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5443)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5444);return true;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5445);if ((((a == null || b == null)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5446)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5447)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5448);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5449);if ((((!equals(a.getProperty(), b.getProperty()))&&(__CLR4_5_23a23a2lvico0bp.R.iget(5450)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5451)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5452);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5453);if ((((!equals(a.getDomain(), b.getDomain()))&&(__CLR4_5_23a23a2lvico0bp.R.iget(5454)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5455)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5456);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5457);return equalAnnotations(a.getAnnotations(), b.getAnnotations());
    }finally{__CLR4_5_23a23a2lvico0bp.R.flushNeeded();}}

    public static boolean equals(OWLDataPropertyRangeAxiom a,
            OWLDataPropertyRangeAxiom b) {try{__CLR4_5_23a23a2lvico0bp.R.inc(5458);
        __CLR4_5_23a23a2lvico0bp.R.inc(5459);if ((((a == b)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5460)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5461)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5462);return true;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5463);if ((((a == null || b == null)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5464)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5465)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5466);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5467);if ((((!equals(a.getProperty(), b.getProperty()))&&(__CLR4_5_23a23a2lvico0bp.R.iget(5468)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5469)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5470);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5471);if ((((!equals(a.getRange(), b.getRange()))&&(__CLR4_5_23a23a2lvico0bp.R.iget(5472)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5473)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5474);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5475);return equalAnnotations(a.getAnnotations(), b.getAnnotations());
    }finally{__CLR4_5_23a23a2lvico0bp.R.flushNeeded();}}

    public static boolean equals(OWLDisjointDataPropertiesAxiom a,
            OWLDisjointDataPropertiesAxiom b) {try{__CLR4_5_23a23a2lvico0bp.R.inc(5476);
        __CLR4_5_23a23a2lvico0bp.R.inc(5477);if ((((a == b)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5478)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5479)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5480);return true;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5481);if ((((a == null || b == null)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5482)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5483)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5484);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5485);if ((((!equalDataPropertyExpressions(a.getProperties(), b.getProperties()))&&(__CLR4_5_23a23a2lvico0bp.R.iget(5486)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5487)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5488);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5489);return equalAnnotations(a.getAnnotations(), b.getAnnotations());
    }finally{__CLR4_5_23a23a2lvico0bp.R.flushNeeded();}}

    public static boolean equals(OWLEquivalentDataPropertiesAxiom a,
            OWLEquivalentDataPropertiesAxiom b) {try{__CLR4_5_23a23a2lvico0bp.R.inc(5490);
        __CLR4_5_23a23a2lvico0bp.R.inc(5491);if ((((a == b)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5492)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5493)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5494);return true;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5495);if ((((a == null || b == null)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5496)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5497)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5498);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5499);if ((((!equalDataPropertyExpressions(a.getProperties(), b.getProperties()))&&(__CLR4_5_23a23a2lvico0bp.R.iget(5500)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5501)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5502);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5503);return equalAnnotations(a.getAnnotations(), b.getAnnotations());
    }finally{__CLR4_5_23a23a2lvico0bp.R.flushNeeded();}}

    public static boolean equals(OWLSubDataPropertyOfAxiom a,
            OWLSubDataPropertyOfAxiom b) {try{__CLR4_5_23a23a2lvico0bp.R.inc(5504);
        __CLR4_5_23a23a2lvico0bp.R.inc(5505);if ((((a == b)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5506)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5507)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5508);return true;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5509);if ((((a == null || b == null)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5510)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5511)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5512);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5513);if ((((!equals(a.getSubProperty(), b.getSubProperty()))&&(__CLR4_5_23a23a2lvico0bp.R.iget(5514)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5515)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5516);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5517);if ((((!equals(a.getSuperProperty(), b.getSuperProperty()))&&(__CLR4_5_23a23a2lvico0bp.R.iget(5518)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5519)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5520);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5521);return equalAnnotations(a.getAnnotations(), b.getAnnotations());
    }finally{__CLR4_5_23a23a2lvico0bp.R.flushNeeded();}}

    // Has Key Axiom
    public static boolean equals(OWLHasKeyAxiom a, OWLHasKeyAxiom b) {try{__CLR4_5_23a23a2lvico0bp.R.inc(5522);
        __CLR4_5_23a23a2lvico0bp.R.inc(5523);if ((((a == b)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5524)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5525)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5526);return true;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5527);if ((((a == null || b == null)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5528)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5529)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5530);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5531);if ((((!equalDataPropertyExpressions(a.getDataPropertyExpressions(),
                b.getDataPropertyExpressions()))&&(__CLR4_5_23a23a2lvico0bp.R.iget(5532)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5533)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5534);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5535);if ((((!equalObjectPropertyExpressions(a.getObjectPropertyExpressions(),
                b.getObjectPropertyExpressions()))&&(__CLR4_5_23a23a2lvico0bp.R.iget(5536)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5537)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5538);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5539);return equalAnnotations(a.getAnnotations(), b.getAnnotations());
    }finally{__CLR4_5_23a23a2lvico0bp.R.flushNeeded();}}

    /*
     *  Class Expressions
     */
    private static boolean equals(OWLClassExpression a, OWLClassExpression b) {try{__CLR4_5_23a23a2lvico0bp.R.inc(5540);
        __CLR4_5_23a23a2lvico0bp.R.inc(5541);if ((((a == b)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5542)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5543)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5544);return true;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5545);if ((((a == null || b == null)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5546)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5547)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5548);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5549);if ((((a instanceof OWLClass && b instanceof OWLClass)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5550)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5551)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5552);return equals((OWLClass) a, (OWLClass) b);
        } }else {__CLR4_5_23a23a2lvico0bp.R.inc(5553);if ((((a instanceof OWLObjectIntersectionOf
                && b instanceof OWLObjectIntersectionOf)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5554)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5555)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5556);return equals((OWLObjectIntersectionOf) a,
                    (OWLObjectIntersectionOf) b);
        } }else {__CLR4_5_23a23a2lvico0bp.R.inc(5557);if ((((a instanceof OWLObjectUnionOf
                && b instanceof OWLObjectUnionOf)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5558)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5559)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5560);return equals((OWLObjectUnionOf) a, (OWLObjectUnionOf) b);
        } }else {__CLR4_5_23a23a2lvico0bp.R.inc(5561);if ((((a instanceof OWLObjectComplementOf
                && b instanceof OWLObjectComplementOf)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5562)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5563)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5564);return equals((OWLObjectComplementOf) a, (OWLObjectComplementOf) b);
        } }else {__CLR4_5_23a23a2lvico0bp.R.inc(5565);if ((((a instanceof OWLObjectSomeValuesFrom
                && b instanceof OWLObjectSomeValuesFrom)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5566)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5567)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5568);return equals((OWLObjectSomeValuesFrom) a,
                    (OWLObjectSomeValuesFrom) b);
        } }else {__CLR4_5_23a23a2lvico0bp.R.inc(5569);if ((((a instanceof OWLObjectAllValuesFrom
                && b instanceof OWLObjectAllValuesFrom)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5570)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5571)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5572);return equals((OWLObjectAllValuesFrom) a,
                    (OWLObjectAllValuesFrom) b);
        } }else {__CLR4_5_23a23a2lvico0bp.R.inc(5573);if ((((a instanceof OWLObjectHasValue
                && b instanceof OWLObjectHasValue)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5574)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5575)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5576);return equals((OWLObjectHasValue) a, (OWLObjectHasValue) b);
        } }else {__CLR4_5_23a23a2lvico0bp.R.inc(5577);if ((((a instanceof OWLObjectMinCardinality
                && b instanceof OWLObjectMinCardinality)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5578)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5579)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5580);return equals((OWLObjectMinCardinality) a,
                    (OWLObjectMinCardinality) b);
        } }else {__CLR4_5_23a23a2lvico0bp.R.inc(5581);if ((((a instanceof OWLObjectExactCardinality
                && b instanceof OWLObjectExactCardinality)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5582)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5583)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5584);return equals((OWLObjectExactCardinality) a,
                    (OWLObjectExactCardinality) b);
        } }else {__CLR4_5_23a23a2lvico0bp.R.inc(5585);if ((((a instanceof OWLObjectMaxCardinality
                && b instanceof OWLObjectMaxCardinality)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5586)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5587)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5588);return equals((OWLObjectMaxCardinality) a,
                    (OWLObjectMaxCardinality) b);
        } }else {__CLR4_5_23a23a2lvico0bp.R.inc(5589);if ((((a instanceof OWLObjectHasSelf
                && b instanceof OWLObjectHasSelf)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5590)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5591)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5592);return equals((OWLObjectHasSelf) a, (OWLObjectHasSelf) b);
        } }else {__CLR4_5_23a23a2lvico0bp.R.inc(5593);if ((((a instanceof OWLObjectOneOf && b instanceof OWLObjectOneOf)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5594)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5595)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5596);return equals((OWLObjectOneOf) a, (OWLObjectOneOf) b);
        } }else {__CLR4_5_23a23a2lvico0bp.R.inc(5597);if ((((a instanceof OWLDataSomeValuesFrom
                && b instanceof OWLDataSomeValuesFrom)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5598)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5599)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5600);return equals((OWLDataSomeValuesFrom) a, (OWLDataSomeValuesFrom) b);
        } }else {__CLR4_5_23a23a2lvico0bp.R.inc(5601);if ((((a instanceof OWLDataAllValuesFrom
                && b instanceof OWLDataAllValuesFrom)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5602)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5603)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5604);return equals((OWLDataAllValuesFrom) a, (OWLDataAllValuesFrom) b);
        } }else {__CLR4_5_23a23a2lvico0bp.R.inc(5605);if ((((a instanceof OWLDataHasValue && b instanceof OWLDataHasValue)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5606)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5607)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5608);return equals((OWLDataHasValue) a, (OWLDataHasValue) b);
        } }else {__CLR4_5_23a23a2lvico0bp.R.inc(5609);if ((((a instanceof OWLDataMinCardinality
                && b instanceof OWLDataMinCardinality)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5610)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5611)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5612);return equals((OWLDataMinCardinality) a, (OWLDataMinCardinality) b);
        } }else {__CLR4_5_23a23a2lvico0bp.R.inc(5613);if ((((a instanceof OWLDataExactCardinality
                && b instanceof OWLDataExactCardinality)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5614)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5615)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5616);return equals((OWLDataExactCardinality) a,
                    (OWLDataExactCardinality) b);
        } }else {__CLR4_5_23a23a2lvico0bp.R.inc(5617);if ((((a instanceof OWLDataMaxCardinality
                && b instanceof OWLDataMaxCardinality)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5618)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5619)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5620);return equals((OWLDataMaxCardinality) a, (OWLDataMaxCardinality) b);
        } }else {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5621);return false;
        }
    }}}}}}}}}}}}}}}}}}}finally{__CLR4_5_23a23a2lvico0bp.R.flushNeeded();}}

    private static boolean equalClassExpressions(Set<OWLClassExpression> a,
            Set<OWLClassExpression> b) {try{__CLR4_5_23a23a2lvico0bp.R.inc(5622);
        __CLR4_5_23a23a2lvico0bp.R.inc(5623);if ((((a == b)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5624)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5625)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5626);return true;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5627);if ((((a == null || b == null)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5628)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5629)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5630);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5631);if ((((a.size() != b.size())&&(__CLR4_5_23a23a2lvico0bp.R.iget(5632)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5633)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5634);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5635);Iterator<OWLClassExpression> ai = a.iterator();
        __CLR4_5_23a23a2lvico0bp.R.inc(5636);Iterator<OWLClassExpression> bi = b.iterator();
        __CLR4_5_23a23a2lvico0bp.R.inc(5637);while ((((ai.hasNext())&&(__CLR4_5_23a23a2lvico0bp.R.iget(5638)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5639)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5640);if ((((!equals(ai.next(), bi.next()))&&(__CLR4_5_23a23a2lvico0bp.R.iget(5641)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5642)==0&false))) {{
                __CLR4_5_23a23a2lvico0bp.R.inc(5643);return false;
            }
        }}
        }__CLR4_5_23a23a2lvico0bp.R.inc(5644);return true;
    }finally{__CLR4_5_23a23a2lvico0bp.R.flushNeeded();}}

    public static boolean equals(OWLObjectIntersectionOf a,
            OWLObjectIntersectionOf b) {try{__CLR4_5_23a23a2lvico0bp.R.inc(5645);
        __CLR4_5_23a23a2lvico0bp.R.inc(5646);if ((((a == b)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5647)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5648)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5649);return true;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5650);if ((((a == null || b == null)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5651)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5652)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5653);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5654);return equalClassExpressions(a.getOperands(), b.getOperands());
    }finally{__CLR4_5_23a23a2lvico0bp.R.flushNeeded();}}

    public static boolean equals(OWLObjectUnionOf a, OWLObjectUnionOf b) {try{__CLR4_5_23a23a2lvico0bp.R.inc(5655);
        __CLR4_5_23a23a2lvico0bp.R.inc(5656);if ((((a == b)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5657)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5658)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5659);return true;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5660);if ((((a == null || b == null)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5661)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5662)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5663);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5664);return equalClassExpressions(a.getOperands(), b.getOperands());
    }finally{__CLR4_5_23a23a2lvico0bp.R.flushNeeded();}}

    public static boolean equals(OWLObjectComplementOf a,
            OWLObjectComplementOf b) {try{__CLR4_5_23a23a2lvico0bp.R.inc(5665);
        __CLR4_5_23a23a2lvico0bp.R.inc(5666);if ((((a == b)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5667)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5668)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5669);return true;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5670);if ((((a == null || b == null)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5671)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5672)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5673);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5674);return equals(a.getOperand(), b.getOperand());
    }finally{__CLR4_5_23a23a2lvico0bp.R.flushNeeded();}}

    public static boolean equals(OWLObjectSomeValuesFrom a,
            OWLObjectSomeValuesFrom b) {try{__CLR4_5_23a23a2lvico0bp.R.inc(5675);
        __CLR4_5_23a23a2lvico0bp.R.inc(5676);if ((((a == b)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5677)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5678)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5679);return true;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5680);if ((((a == null || b == null)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5681)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5682)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5683);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5684);if ((((!equals(a.getProperty(), b.getProperty()))&&(__CLR4_5_23a23a2lvico0bp.R.iget(5685)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5686)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5687);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5688);return equals(a.getFiller(), b.getFiller());
    }finally{__CLR4_5_23a23a2lvico0bp.R.flushNeeded();}}

    public static boolean equals(OWLObjectAllValuesFrom a,
            OWLObjectAllValuesFrom b) {try{__CLR4_5_23a23a2lvico0bp.R.inc(5689);
        __CLR4_5_23a23a2lvico0bp.R.inc(5690);if ((((a == b)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5691)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5692)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5693);return true;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5694);if ((((a == null || b == null)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5695)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5696)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5697);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5698);if ((((!equals(a.getProperty(), b.getProperty()))&&(__CLR4_5_23a23a2lvico0bp.R.iget(5699)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5700)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5701);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5702);return equals(a.getFiller(), b.getFiller());
    }finally{__CLR4_5_23a23a2lvico0bp.R.flushNeeded();}}

    public static boolean equals(OWLObjectHasValue a, OWLObjectHasValue b) {try{__CLR4_5_23a23a2lvico0bp.R.inc(5703);
        __CLR4_5_23a23a2lvico0bp.R.inc(5704);if ((((a == b)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5705)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5706)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5707);return true;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5708);if ((((a == null || b == null)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5709)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5710)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5711);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5712);if ((((!equals(a.getProperty(), b.getProperty()))&&(__CLR4_5_23a23a2lvico0bp.R.iget(5713)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5714)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5715);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5716);return equals(a.getFiller(), b.getFiller());
    }finally{__CLR4_5_23a23a2lvico0bp.R.flushNeeded();}}

    public static boolean equals(OWLObjectMinCardinality a,
            OWLObjectMinCardinality b) {try{__CLR4_5_23a23a2lvico0bp.R.inc(5717);
        __CLR4_5_23a23a2lvico0bp.R.inc(5718);if ((((a == b)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5719)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5720)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5721);return true;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5722);if ((((a == null || b == null)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5723)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5724)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5725);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5726);if ((((!equals(a.getProperty(), b.getProperty()))&&(__CLR4_5_23a23a2lvico0bp.R.iget(5727)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5728)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5729);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5730);if ((((a.getCardinality() != b.getCardinality())&&(__CLR4_5_23a23a2lvico0bp.R.iget(5731)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5732)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5733);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5734);return equals(a.getFiller(), b.getFiller());
    }finally{__CLR4_5_23a23a2lvico0bp.R.flushNeeded();}}

    public static boolean equals(OWLObjectExactCardinality a,
            OWLObjectExactCardinality b) {try{__CLR4_5_23a23a2lvico0bp.R.inc(5735);
        __CLR4_5_23a23a2lvico0bp.R.inc(5736);if ((((a == b)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5737)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5738)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5739);return true;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5740);if ((((a == null || b == null)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5741)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5742)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5743);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5744);if ((((!equals(a.getProperty(), b.getProperty()))&&(__CLR4_5_23a23a2lvico0bp.R.iget(5745)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5746)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5747);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5748);if ((((a.getCardinality() != b.getCardinality())&&(__CLR4_5_23a23a2lvico0bp.R.iget(5749)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5750)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5751);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5752);return equals(a.getFiller(), b.getFiller());
    }finally{__CLR4_5_23a23a2lvico0bp.R.flushNeeded();}}

    public static boolean equals(OWLObjectMaxCardinality a,
            OWLObjectMaxCardinality b) {try{__CLR4_5_23a23a2lvico0bp.R.inc(5753);
        __CLR4_5_23a23a2lvico0bp.R.inc(5754);if ((((a == b)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5755)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5756)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5757);return true;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5758);if ((((a == null || b == null)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5759)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5760)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5761);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5762);if ((((!equals(a.getProperty(), b.getProperty()))&&(__CLR4_5_23a23a2lvico0bp.R.iget(5763)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5764)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5765);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5766);if ((((a.getCardinality() != b.getCardinality())&&(__CLR4_5_23a23a2lvico0bp.R.iget(5767)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5768)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5769);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5770);return equals(a.getFiller(), b.getFiller());
    }finally{__CLR4_5_23a23a2lvico0bp.R.flushNeeded();}}

    public static boolean equals(OWLObjectHasSelf a, OWLObjectHasSelf b) {try{__CLR4_5_23a23a2lvico0bp.R.inc(5771);
        __CLR4_5_23a23a2lvico0bp.R.inc(5772);if ((((a == b)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5773)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5774)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5775);return true;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5776);if ((((a == null || b == null)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5777)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5778)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5779);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5780);if ((((!equals(a.getProperty(), b.getProperty()))&&(__CLR4_5_23a23a2lvico0bp.R.iget(5781)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5782)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5783);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5784);return true;
    }finally{__CLR4_5_23a23a2lvico0bp.R.flushNeeded();}}

    public static boolean equals(OWLObjectOneOf a, OWLObjectOneOf b) {try{__CLR4_5_23a23a2lvico0bp.R.inc(5785);
        __CLR4_5_23a23a2lvico0bp.R.inc(5786);if ((((a == b)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5787)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5788)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5789);return true;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5790);if ((((a == null || b == null)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5791)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5792)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5793);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5794);return equalIndividuals(a.getIndividuals(), b.getIndividuals());
    }finally{__CLR4_5_23a23a2lvico0bp.R.flushNeeded();}}

    public static boolean equals(OWLDataSomeValuesFrom a,
            OWLDataSomeValuesFrom b) {try{__CLR4_5_23a23a2lvico0bp.R.inc(5795);
        __CLR4_5_23a23a2lvico0bp.R.inc(5796);if ((((a == b)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5797)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5798)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5799);return true;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5800);if ((((a == null || b == null)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5801)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5802)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5803);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5804);if ((((!equals(a.getProperty(), b.getProperty()))&&(__CLR4_5_23a23a2lvico0bp.R.iget(5805)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5806)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5807);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5808);return equals(a.getFiller(), b.getFiller());
    }finally{__CLR4_5_23a23a2lvico0bp.R.flushNeeded();}}

    public static boolean
            equals(OWLDataAllValuesFrom a, OWLDataAllValuesFrom b) {try{__CLR4_5_23a23a2lvico0bp.R.inc(5809);
        __CLR4_5_23a23a2lvico0bp.R.inc(5810);if ((((a == b)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5811)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5812)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5813);return true;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5814);if ((((a == null || b == null)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5815)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5816)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5817);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5818);if ((((!equals(a.getProperty(), b.getProperty()))&&(__CLR4_5_23a23a2lvico0bp.R.iget(5819)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5820)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5821);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5822);return equals(a.getFiller(), b.getFiller());
    }finally{__CLR4_5_23a23a2lvico0bp.R.flushNeeded();}}

    public static boolean equals(OWLDataHasValue a, OWLDataHasValue b) {try{__CLR4_5_23a23a2lvico0bp.R.inc(5823);
        __CLR4_5_23a23a2lvico0bp.R.inc(5824);if ((((a == b)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5825)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5826)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5827);return true;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5828);if ((((a == null || b == null)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5829)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5830)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5831);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5832);if ((((!equals(a.getProperty(), b.getProperty()))&&(__CLR4_5_23a23a2lvico0bp.R.iget(5833)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5834)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5835);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5836);return equals(a.getFiller(), b.getFiller());
    }finally{__CLR4_5_23a23a2lvico0bp.R.flushNeeded();}}

    public static boolean equals(OWLDataMinCardinality a,
            OWLDataMinCardinality b) {try{__CLR4_5_23a23a2lvico0bp.R.inc(5837);
        __CLR4_5_23a23a2lvico0bp.R.inc(5838);if ((((a == b)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5839)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5840)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5841);return true;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5842);if ((((a == null || b == null)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5843)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5844)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5845);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5846);if ((((!equals(a.getProperty(), b.getProperty()))&&(__CLR4_5_23a23a2lvico0bp.R.iget(5847)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5848)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5849);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5850);if ((((a.getCardinality() != b.getCardinality())&&(__CLR4_5_23a23a2lvico0bp.R.iget(5851)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5852)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5853);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5854);return equals(a.getFiller(), b.getFiller());
    }finally{__CLR4_5_23a23a2lvico0bp.R.flushNeeded();}}

    public static boolean equals(OWLDataExactCardinality a,
            OWLDataExactCardinality b) {try{__CLR4_5_23a23a2lvico0bp.R.inc(5855);
        __CLR4_5_23a23a2lvico0bp.R.inc(5856);if ((((a == b)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5857)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5858)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5859);return true;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5860);if ((((a == null || b == null)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5861)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5862)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5863);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5864);if ((((!equals(a.getProperty(), b.getProperty()))&&(__CLR4_5_23a23a2lvico0bp.R.iget(5865)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5866)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5867);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5868);if ((((a.getCardinality() != b.getCardinality())&&(__CLR4_5_23a23a2lvico0bp.R.iget(5869)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5870)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5871);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5872);return equals(a.getFiller(), b.getFiller());
    }finally{__CLR4_5_23a23a2lvico0bp.R.flushNeeded();}}

    public static boolean equals(OWLDataMaxCardinality a,
            OWLDataMaxCardinality b) {try{__CLR4_5_23a23a2lvico0bp.R.inc(5873);
        __CLR4_5_23a23a2lvico0bp.R.inc(5874);if ((((a == b)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5875)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5876)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5877);return true;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5878);if ((((a == null || b == null)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5879)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5880)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5881);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5882);if ((((!equals(a.getProperty(), b.getProperty()))&&(__CLR4_5_23a23a2lvico0bp.R.iget(5883)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5884)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5885);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5886);if ((((a.getCardinality() != b.getCardinality())&&(__CLR4_5_23a23a2lvico0bp.R.iget(5887)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5888)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5889);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5890);return equals(a.getFiller(), b.getFiller());
    }finally{__CLR4_5_23a23a2lvico0bp.R.flushNeeded();}}

    /*
     *  SWRL 
     */
    public static boolean equals(SWRLRule a, SWRLRule b) {try{__CLR4_5_23a23a2lvico0bp.R.inc(5891);
        __CLR4_5_23a23a2lvico0bp.R.inc(5892);System.err.println("SWRL Rule literal-folding-equality-not-done");
        __CLR4_5_23a23a2lvico0bp.R.inc(5893);if ((((a == b)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5894)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5895)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5896);return true;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5897);if ((((a == null || b == null)&&(__CLR4_5_23a23a2lvico0bp.R.iget(5898)!=0|true))||(__CLR4_5_23a23a2lvico0bp.R.iget(5899)==0&false))) {{
            __CLR4_5_23a23a2lvico0bp.R.inc(5900);return false;
        }
        }__CLR4_5_23a23a2lvico0bp.R.inc(5901);return a.equals(b);
    }finally{__CLR4_5_23a23a2lvico0bp.R.flushNeeded();}}
}
