/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.semanticweb.owlapi.api.test.baseclasses;

import static org.semanticweb.owlapi.util.OWLAPIPreconditions.checkNotNull;

import java.util.Collection;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLAnnotation;
import org.semanticweb.owlapi.model.OWLAnnotationAssertionAxiom;
import org.semanticweb.owlapi.model.OWLAnnotationProperty;
import org.semanticweb.owlapi.model.OWLAnnotationPropertyDomainAxiom;
import org.semanticweb.owlapi.model.OWLAnnotationPropertyRangeAxiom;
import org.semanticweb.owlapi.model.OWLAnonymousIndividual;
import org.semanticweb.owlapi.model.OWLAsymmetricObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLClassAssertionAxiom;
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
import org.semanticweb.owlapi.model.OWLDataPropertyRangeAxiom;
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
import org.semanticweb.owlapi.model.OWLEquivalentClassesAxiom;
import org.semanticweb.owlapi.model.OWLEquivalentDataPropertiesAxiom;
import org.semanticweb.owlapi.model.OWLEquivalentObjectPropertiesAxiom;
import org.semanticweb.owlapi.model.OWLFacetRestriction;
import org.semanticweb.owlapi.model.OWLFunctionalDataPropertyAxiom;
import org.semanticweb.owlapi.model.OWLFunctionalObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLHasKeyAxiom;
import org.semanticweb.owlapi.model.OWLInverseFunctionalObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLInverseObjectPropertiesAxiom;
import org.semanticweb.owlapi.model.OWLIrreflexiveObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLLiteral;
import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLNegativeDataPropertyAssertionAxiom;
import org.semanticweb.owlapi.model.OWLNegativeObjectPropertyAssertionAxiom;
import org.semanticweb.owlapi.model.OWLObject;
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
import org.semanticweb.owlapi.model.OWLObjectPropertyRangeAxiom;
import org.semanticweb.owlapi.model.OWLObjectSomeValuesFrom;
import org.semanticweb.owlapi.model.OWLObjectUnionOf;
import org.semanticweb.owlapi.model.OWLObjectVisitor;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLReflexiveObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLSameIndividualAxiom;
import org.semanticweb.owlapi.model.OWLSubAnnotationPropertyOfAxiom;
import org.semanticweb.owlapi.model.OWLSubClassOfAxiom;
import org.semanticweb.owlapi.model.OWLSubDataPropertyOfAxiom;
import org.semanticweb.owlapi.model.OWLSubObjectPropertyOfAxiom;
import org.semanticweb.owlapi.model.OWLSubPropertyChainOfAxiom;
import org.semanticweb.owlapi.model.OWLSymmetricObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLTransitiveObjectPropertyAxiom;
import org.semanticweb.owlapi.model.SWRLBuiltInAtom;
import org.semanticweb.owlapi.model.SWRLClassAtom;
import org.semanticweb.owlapi.model.SWRLDataPropertyAtom;
import org.semanticweb.owlapi.model.SWRLDataRangeAtom;
import org.semanticweb.owlapi.model.SWRLDifferentIndividualsAtom;
import org.semanticweb.owlapi.model.SWRLIndividualArgument;
import org.semanticweb.owlapi.model.SWRLLiteralArgument;
import org.semanticweb.owlapi.model.SWRLObjectPropertyAtom;
import org.semanticweb.owlapi.model.SWRLObjectVisitor;
import org.semanticweb.owlapi.model.SWRLRule;
import org.semanticweb.owlapi.model.SWRLSameIndividualAtom;
import org.semanticweb.owlapi.model.SWRLVariable;

/**
 * Created by ses on 10/1/14.
 */
class LiteralFoldingHashCoder implements OWLObjectVisitor, SWRLObjectVisitor {public static class __CLR4_5_24jy4jylvico0fo{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,6252,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    protected int hashCode;
    protected static final int MULT = 37;

    public static int hashCode(@Nonnull OWLObject object) {try{__CLR4_5_24jy4jylvico0fo.R.inc(5902);
        __CLR4_5_24jy4jylvico0fo.R.inc(5903);checkNotNull(object, "object cannot be null");
        __CLR4_5_24jy4jylvico0fo.R.inc(5904);LiteralFoldingHashCoder hashCode = new LiteralFoldingHashCoder();
        __CLR4_5_24jy4jylvico0fo.R.inc(5905);object.accept(hashCode);
        __CLR4_5_24jy4jylvico0fo.R.inc(5906);return hashCode.hashCode;
    }finally{__CLR4_5_24jy4jylvico0fo.R.flushNeeded();}}

    /**
     * hash all literals with the same lexical form to the same value
     *
     * @param node
     *        node to check
     */
    @Override
    public void visit(OWLLiteral node) {try{__CLR4_5_24jy4jylvico0fo.R.inc(5907);
        __CLR4_5_24jy4jylvico0fo.R.inc(5908);addValueToHash(node.getLiteral().hashCode());
    }finally{__CLR4_5_24jy4jylvico0fo.R.flushNeeded();}}

    @Override
    public void visit(OWLSubClassOfAxiom axiom) {try{__CLR4_5_24jy4jylvico0fo.R.inc(5909);
        __CLR4_5_24jy4jylvico0fo.R.inc(5910);addValueToHash(139);
        __CLR4_5_24jy4jylvico0fo.R.inc(5911);axiom.getSubClass().accept(this);
        __CLR4_5_24jy4jylvico0fo.R.inc(5912);axiom.getSuperClass().accept(this);
        __CLR4_5_24jy4jylvico0fo.R.inc(5913);visitCollection(axiom.getAnnotations());
    }finally{__CLR4_5_24jy4jylvico0fo.R.flushNeeded();}}

    @Override
    public void visit(OWLOntology ontology) {try{__CLR4_5_24jy4jylvico0fo.R.inc(5914);
        __CLR4_5_24jy4jylvico0fo.R.inc(5915);addValueToHash(ontology.getOntologyID().hashCode());
    }finally{__CLR4_5_24jy4jylvico0fo.R.flushNeeded();}}

    @Override
    public void visit(OWLAsymmetricObjectPropertyAxiom axiom) {try{__CLR4_5_24jy4jylvico0fo.R.inc(5916);
        __CLR4_5_24jy4jylvico0fo.R.inc(5917);addValueToHash(3);
        __CLR4_5_24jy4jylvico0fo.R.inc(5918);axiom.getProperty().accept(this);
        __CLR4_5_24jy4jylvico0fo.R.inc(5919);visitCollection(axiom.getAnnotations());
    }finally{__CLR4_5_24jy4jylvico0fo.R.flushNeeded();}}

    @Override
    public void visit(OWLClassAssertionAxiom axiom) {try{__CLR4_5_24jy4jylvico0fo.R.inc(5920);
        __CLR4_5_24jy4jylvico0fo.R.inc(5921);addValueToHash(7);
        __CLR4_5_24jy4jylvico0fo.R.inc(5922);axiom.getIndividual().accept(this);
        __CLR4_5_24jy4jylvico0fo.R.inc(5923);axiom.getClassExpression().accept(this);
        __CLR4_5_24jy4jylvico0fo.R.inc(5924);visitCollection(axiom.getAnnotations());
    }finally{__CLR4_5_24jy4jylvico0fo.R.flushNeeded();}}

    @Override
    public void visit(OWLDataPropertyAssertionAxiom axiom) {try{__CLR4_5_24jy4jylvico0fo.R.inc(5925);
        __CLR4_5_24jy4jylvico0fo.R.inc(5926);addValueToHash(11);
        __CLR4_5_24jy4jylvico0fo.R.inc(5927);axiom.getSubject().accept(this);
        __CLR4_5_24jy4jylvico0fo.R.inc(5928);axiom.getProperty().accept(this);
        __CLR4_5_24jy4jylvico0fo.R.inc(5929);axiom.getObject().accept(this);
        __CLR4_5_24jy4jylvico0fo.R.inc(5930);visitCollection(axiom.getAnnotations());
    }finally{__CLR4_5_24jy4jylvico0fo.R.flushNeeded();}}

    @Override
    public void visit(OWLDataPropertyDomainAxiom axiom) {try{__CLR4_5_24jy4jylvico0fo.R.inc(5931);
        __CLR4_5_24jy4jylvico0fo.R.inc(5932);addValueToHash(13);
        __CLR4_5_24jy4jylvico0fo.R.inc(5933);axiom.getProperty().accept(this);
        __CLR4_5_24jy4jylvico0fo.R.inc(5934);axiom.getDomain().accept(this);
        __CLR4_5_24jy4jylvico0fo.R.inc(5935);visitCollection(axiom.getAnnotations());
    }finally{__CLR4_5_24jy4jylvico0fo.R.flushNeeded();}}

    @Override
    public void visit(OWLDataPropertyRangeAxiom axiom) {try{__CLR4_5_24jy4jylvico0fo.R.inc(5936);
        __CLR4_5_24jy4jylvico0fo.R.inc(5937);addValueToHash(17);
        __CLR4_5_24jy4jylvico0fo.R.inc(5938);axiom.getProperty().accept(this);
        __CLR4_5_24jy4jylvico0fo.R.inc(5939);axiom.getRange().accept(this);
        __CLR4_5_24jy4jylvico0fo.R.inc(5940);visitCollection(axiom.getAnnotations());
    }finally{__CLR4_5_24jy4jylvico0fo.R.flushNeeded();}}

    @Override
    public void visit(OWLSubDataPropertyOfAxiom axiom) {try{__CLR4_5_24jy4jylvico0fo.R.inc(5941);
        __CLR4_5_24jy4jylvico0fo.R.inc(5942);addValueToHash(19);
        __CLR4_5_24jy4jylvico0fo.R.inc(5943);axiom.getSubProperty().accept(this);
        __CLR4_5_24jy4jylvico0fo.R.inc(5944);axiom.getSuperProperty().accept(this);
        __CLR4_5_24jy4jylvico0fo.R.inc(5945);visitCollection(axiom.getAnnotations());
    }finally{__CLR4_5_24jy4jylvico0fo.R.flushNeeded();}}

    @Override
    public void visit(OWLDeclarationAxiom axiom) {try{__CLR4_5_24jy4jylvico0fo.R.inc(5946);
        __CLR4_5_24jy4jylvico0fo.R.inc(5947);addValueToHash(23);
        __CLR4_5_24jy4jylvico0fo.R.inc(5948);axiom.getEntity().accept(this);
        __CLR4_5_24jy4jylvico0fo.R.inc(5949);visitCollection(axiom.getAnnotations());
    }finally{__CLR4_5_24jy4jylvico0fo.R.flushNeeded();}}

    @Override
    public void visit(OWLDifferentIndividualsAxiom axiom) {try{__CLR4_5_24jy4jylvico0fo.R.inc(5950);
        __CLR4_5_24jy4jylvico0fo.R.inc(5951);addValueToHash(29);
        __CLR4_5_24jy4jylvico0fo.R.inc(5952);visitCollection(axiom.getIndividuals());
        __CLR4_5_24jy4jylvico0fo.R.inc(5953);visitCollection(axiom.getAnnotations());
    }finally{__CLR4_5_24jy4jylvico0fo.R.flushNeeded();}}

    @Override
    public void visit(OWLDisjointClassesAxiom axiom) {try{__CLR4_5_24jy4jylvico0fo.R.inc(5954);
        __CLR4_5_24jy4jylvico0fo.R.inc(5955);addValueToHash(31);
        __CLR4_5_24jy4jylvico0fo.R.inc(5956);visitCollection(axiom.getClassExpressions());
        __CLR4_5_24jy4jylvico0fo.R.inc(5957);visitCollection(axiom.getAnnotations());
    }finally{__CLR4_5_24jy4jylvico0fo.R.flushNeeded();}}

    @Override
    public void visit(OWLDisjointDataPropertiesAxiom axiom) {try{__CLR4_5_24jy4jylvico0fo.R.inc(5958);
        __CLR4_5_24jy4jylvico0fo.R.inc(5959);addValueToHash(37);
        __CLR4_5_24jy4jylvico0fo.R.inc(5960);visitCollection(axiom.getProperties());
        __CLR4_5_24jy4jylvico0fo.R.inc(5961);visitCollection(axiom.getAnnotations());
    }finally{__CLR4_5_24jy4jylvico0fo.R.flushNeeded();}}

    @Override
    public void visit(OWLDisjointObjectPropertiesAxiom axiom) {try{__CLR4_5_24jy4jylvico0fo.R.inc(5962);
        __CLR4_5_24jy4jylvico0fo.R.inc(5963);addValueToHash(41);
        __CLR4_5_24jy4jylvico0fo.R.inc(5964);visitCollection(axiom.getProperties());
        __CLR4_5_24jy4jylvico0fo.R.inc(5965);visitCollection(axiom.getAnnotations());
    }finally{__CLR4_5_24jy4jylvico0fo.R.flushNeeded();}}

    @Override
    public void visit(OWLDisjointUnionAxiom axiom) {try{__CLR4_5_24jy4jylvico0fo.R.inc(5966);
        __CLR4_5_24jy4jylvico0fo.R.inc(5967);addValueToHash(43);
        __CLR4_5_24jy4jylvico0fo.R.inc(5968);axiom.getOWLClass().accept(this);
        __CLR4_5_24jy4jylvico0fo.R.inc(5969);visitCollection(axiom.getClassExpressions());
        __CLR4_5_24jy4jylvico0fo.R.inc(5970);visitCollection(axiom.getAnnotations());
    }finally{__CLR4_5_24jy4jylvico0fo.R.flushNeeded();}}

    @Override
    public void visit(OWLAnnotationAssertionAxiom axiom) {try{__CLR4_5_24jy4jylvico0fo.R.inc(5971);
        __CLR4_5_24jy4jylvico0fo.R.inc(5972);addValueToHash(47);
        __CLR4_5_24jy4jylvico0fo.R.inc(5973);axiom.getSubject().accept(this);
        __CLR4_5_24jy4jylvico0fo.R.inc(5974);axiom.getProperty().accept(this);
        __CLR4_5_24jy4jylvico0fo.R.inc(5975);axiom.getValue().accept(this);
        __CLR4_5_24jy4jylvico0fo.R.inc(5976);visitCollection(axiom.getAnnotations());
    }finally{__CLR4_5_24jy4jylvico0fo.R.flushNeeded();}}

    @Override
    public void visit(OWLEquivalentClassesAxiom axiom) {try{__CLR4_5_24jy4jylvico0fo.R.inc(5977);
        __CLR4_5_24jy4jylvico0fo.R.inc(5978);addValueToHash(53);
        __CLR4_5_24jy4jylvico0fo.R.inc(5979);visitCollection(axiom.getClassExpressions());
        __CLR4_5_24jy4jylvico0fo.R.inc(5980);visitCollection(axiom.getAnnotations());
    }finally{__CLR4_5_24jy4jylvico0fo.R.flushNeeded();}}

    @Override
    public void visit(OWLEquivalentDataPropertiesAxiom axiom) {try{__CLR4_5_24jy4jylvico0fo.R.inc(5981);
        __CLR4_5_24jy4jylvico0fo.R.inc(5982);addValueToHash(59);
        __CLR4_5_24jy4jylvico0fo.R.inc(5983);visitCollection(axiom.getProperties());
        __CLR4_5_24jy4jylvico0fo.R.inc(5984);visitCollection(axiom.getAnnotations());
    }finally{__CLR4_5_24jy4jylvico0fo.R.flushNeeded();}}

    @Override
    public void visit(OWLEquivalentObjectPropertiesAxiom axiom) {try{__CLR4_5_24jy4jylvico0fo.R.inc(5985);
        __CLR4_5_24jy4jylvico0fo.R.inc(5986);addValueToHash(61);
        __CLR4_5_24jy4jylvico0fo.R.inc(5987);visitCollection(axiom.getProperties());
        __CLR4_5_24jy4jylvico0fo.R.inc(5988);visitCollection(axiom.getAnnotations());
    }finally{__CLR4_5_24jy4jylvico0fo.R.flushNeeded();}}

    @Override
    public void visit(OWLFunctionalDataPropertyAxiom axiom) {try{__CLR4_5_24jy4jylvico0fo.R.inc(5989);
        __CLR4_5_24jy4jylvico0fo.R.inc(5990);addValueToHash(67);
        __CLR4_5_24jy4jylvico0fo.R.inc(5991);axiom.getProperty().accept(this);
        __CLR4_5_24jy4jylvico0fo.R.inc(5992);visitCollection(axiom.getAnnotations());
    }finally{__CLR4_5_24jy4jylvico0fo.R.flushNeeded();}}

    @Override
    public void visit(OWLFunctionalObjectPropertyAxiom axiom) {try{__CLR4_5_24jy4jylvico0fo.R.inc(5993);
        __CLR4_5_24jy4jylvico0fo.R.inc(5994);addValueToHash(71);
        __CLR4_5_24jy4jylvico0fo.R.inc(5995);axiom.getProperty().accept(this);
        __CLR4_5_24jy4jylvico0fo.R.inc(5996);visitCollection(axiom.getAnnotations());
    }finally{__CLR4_5_24jy4jylvico0fo.R.flushNeeded();}}

    @Override
    public void visit(OWLInverseFunctionalObjectPropertyAxiom axiom) {try{__CLR4_5_24jy4jylvico0fo.R.inc(5997);
        __CLR4_5_24jy4jylvico0fo.R.inc(5998);addValueToHash(79);
        __CLR4_5_24jy4jylvico0fo.R.inc(5999);axiom.getProperty().accept(this);
        __CLR4_5_24jy4jylvico0fo.R.inc(6000);visitCollection(axiom.getAnnotations());
    }finally{__CLR4_5_24jy4jylvico0fo.R.flushNeeded();}}

    @Override
    public void visit(OWLInverseObjectPropertiesAxiom axiom) {try{__CLR4_5_24jy4jylvico0fo.R.inc(6001);
        __CLR4_5_24jy4jylvico0fo.R.inc(6002);addValueToHash(83);
        __CLR4_5_24jy4jylvico0fo.R.inc(6003);hashCode = hashCode * MULT + axiom.getFirstProperty().hashCode()
                + axiom.getSecondProperty().hashCode();
        __CLR4_5_24jy4jylvico0fo.R.inc(6004);visitCollection(axiom.getAnnotations());
    }finally{__CLR4_5_24jy4jylvico0fo.R.flushNeeded();}}

    @Override
    public void visit(OWLIrreflexiveObjectPropertyAxiom axiom) {try{__CLR4_5_24jy4jylvico0fo.R.inc(6005);
        __CLR4_5_24jy4jylvico0fo.R.inc(6006);addValueToHash(89);
        __CLR4_5_24jy4jylvico0fo.R.inc(6007);axiom.getProperty().accept(this);
        __CLR4_5_24jy4jylvico0fo.R.inc(6008);visitCollection(axiom.getAnnotations());
    }finally{__CLR4_5_24jy4jylvico0fo.R.flushNeeded();}}

    @Override
    public void visit(OWLNegativeDataPropertyAssertionAxiom axiom) {try{__CLR4_5_24jy4jylvico0fo.R.inc(6009);
        __CLR4_5_24jy4jylvico0fo.R.inc(6010);addValueToHash(97);
        __CLR4_5_24jy4jylvico0fo.R.inc(6011);axiom.getSubject().accept(this);
        __CLR4_5_24jy4jylvico0fo.R.inc(6012);axiom.getProperty().accept(this);
        __CLR4_5_24jy4jylvico0fo.R.inc(6013);axiom.getObject().accept(this);
        __CLR4_5_24jy4jylvico0fo.R.inc(6014);visitCollection(axiom.getAnnotations());
    }finally{__CLR4_5_24jy4jylvico0fo.R.flushNeeded();}}

    @Override
    public void visit(OWLNegativeObjectPropertyAssertionAxiom axiom) {try{__CLR4_5_24jy4jylvico0fo.R.inc(6015);
        __CLR4_5_24jy4jylvico0fo.R.inc(6016);addValueToHash(101);
        __CLR4_5_24jy4jylvico0fo.R.inc(6017);axiom.getSubject().accept(this);
        __CLR4_5_24jy4jylvico0fo.R.inc(6018);axiom.getProperty().accept(this);
        __CLR4_5_24jy4jylvico0fo.R.inc(6019);axiom.getObject().accept(this);
        __CLR4_5_24jy4jylvico0fo.R.inc(6020);visitCollection(axiom.getAnnotations());
    }finally{__CLR4_5_24jy4jylvico0fo.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectPropertyAssertionAxiom axiom) {try{__CLR4_5_24jy4jylvico0fo.R.inc(6021);
        __CLR4_5_24jy4jylvico0fo.R.inc(6022);addValueToHash(103);
        __CLR4_5_24jy4jylvico0fo.R.inc(6023);axiom.getSubject().accept(this);
        __CLR4_5_24jy4jylvico0fo.R.inc(6024);axiom.getProperty().accept(this);
        __CLR4_5_24jy4jylvico0fo.R.inc(6025);axiom.getObject().accept(this);
        __CLR4_5_24jy4jylvico0fo.R.inc(6026);visitCollection(axiom.getAnnotations());
    }finally{__CLR4_5_24jy4jylvico0fo.R.flushNeeded();}}

    @Override
    public void visit(OWLSubPropertyChainOfAxiom axiom) {try{__CLR4_5_24jy4jylvico0fo.R.inc(6027);
        __CLR4_5_24jy4jylvico0fo.R.inc(6028);addValueToHash(107);
        __CLR4_5_24jy4jylvico0fo.R.inc(6029);visitCollection(axiom.getPropertyChain());
        __CLR4_5_24jy4jylvico0fo.R.inc(6030);axiom.getSuperProperty().accept(this);
        __CLR4_5_24jy4jylvico0fo.R.inc(6031);visitCollection(axiom.getAnnotations());
    }finally{__CLR4_5_24jy4jylvico0fo.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectPropertyDomainAxiom axiom) {try{__CLR4_5_24jy4jylvico0fo.R.inc(6032);
        __CLR4_5_24jy4jylvico0fo.R.inc(6033);addValueToHash(109);
        __CLR4_5_24jy4jylvico0fo.R.inc(6034);axiom.getProperty().accept(this);
        __CLR4_5_24jy4jylvico0fo.R.inc(6035);axiom.getDomain().accept(this);
        __CLR4_5_24jy4jylvico0fo.R.inc(6036);visitCollection(axiom.getAnnotations());
    }finally{__CLR4_5_24jy4jylvico0fo.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectPropertyRangeAxiom axiom) {try{__CLR4_5_24jy4jylvico0fo.R.inc(6037);
        __CLR4_5_24jy4jylvico0fo.R.inc(6038);addValueToHash(113);
        __CLR4_5_24jy4jylvico0fo.R.inc(6039);axiom.getProperty().accept(this);
        __CLR4_5_24jy4jylvico0fo.R.inc(6040);axiom.getRange().accept(this);
        __CLR4_5_24jy4jylvico0fo.R.inc(6041);visitCollection(axiom.getAnnotations());
    }finally{__CLR4_5_24jy4jylvico0fo.R.flushNeeded();}}

    @Override
    public void visit(OWLSubObjectPropertyOfAxiom axiom) {try{__CLR4_5_24jy4jylvico0fo.R.inc(6042);
        __CLR4_5_24jy4jylvico0fo.R.inc(6043);addValueToHash(127);
        __CLR4_5_24jy4jylvico0fo.R.inc(6044);axiom.getSubProperty().accept(this);
        __CLR4_5_24jy4jylvico0fo.R.inc(6045);axiom.getSuperProperty().accept(this);
        __CLR4_5_24jy4jylvico0fo.R.inc(6046);visitCollection(axiom.getAnnotations());
    }finally{__CLR4_5_24jy4jylvico0fo.R.flushNeeded();}}

    @Override
    public void visit(OWLReflexiveObjectPropertyAxiom axiom) {try{__CLR4_5_24jy4jylvico0fo.R.inc(6047);
        __CLR4_5_24jy4jylvico0fo.R.inc(6048);addValueToHash(131);
        __CLR4_5_24jy4jylvico0fo.R.inc(6049);axiom.getProperty().accept(this);
        __CLR4_5_24jy4jylvico0fo.R.inc(6050);visitCollection(axiom.getAnnotations());
    }finally{__CLR4_5_24jy4jylvico0fo.R.flushNeeded();}}

    @Override
    public void visit(OWLSameIndividualAxiom axiom) {try{__CLR4_5_24jy4jylvico0fo.R.inc(6051);
        __CLR4_5_24jy4jylvico0fo.R.inc(6052);addValueToHash(137);
        __CLR4_5_24jy4jylvico0fo.R.inc(6053);visitCollection(axiom.getIndividuals());
        __CLR4_5_24jy4jylvico0fo.R.inc(6054);visitCollection(axiom.getAnnotations());
    }finally{__CLR4_5_24jy4jylvico0fo.R.flushNeeded();}}

    @Override
    public void visit(OWLSymmetricObjectPropertyAxiom axiom) {try{__CLR4_5_24jy4jylvico0fo.R.inc(6055);
        __CLR4_5_24jy4jylvico0fo.R.inc(6056);addValueToHash(149);
        __CLR4_5_24jy4jylvico0fo.R.inc(6057);axiom.getProperty().accept(this);
        __CLR4_5_24jy4jylvico0fo.R.inc(6058);visitCollection(axiom.getAnnotations());
    }finally{__CLR4_5_24jy4jylvico0fo.R.flushNeeded();}}

    @Override
    public void visit(OWLTransitiveObjectPropertyAxiom axiom) {try{__CLR4_5_24jy4jylvico0fo.R.inc(6059);
        __CLR4_5_24jy4jylvico0fo.R.inc(6060);addValueToHash(151);
        __CLR4_5_24jy4jylvico0fo.R.inc(6061);axiom.getProperty().accept(this);
        __CLR4_5_24jy4jylvico0fo.R.inc(6062);visitCollection(axiom.getAnnotations());
    }finally{__CLR4_5_24jy4jylvico0fo.R.flushNeeded();}}

    @Override
    public void visit(OWLClass ce) {try{__CLR4_5_24jy4jylvico0fo.R.inc(6063);
        __CLR4_5_24jy4jylvico0fo.R.inc(6064);addValueToHash(157);
        __CLR4_5_24jy4jylvico0fo.R.inc(6065);ce.getIRI().accept(this);
    }finally{__CLR4_5_24jy4jylvico0fo.R.flushNeeded();}}

    @Override
    public void visit(OWLDataAllValuesFrom ce) {try{__CLR4_5_24jy4jylvico0fo.R.inc(6066);
        __CLR4_5_24jy4jylvico0fo.R.inc(6067);addValueToHash(163);
        __CLR4_5_24jy4jylvico0fo.R.inc(6068);ce.getProperty().accept(this);
        __CLR4_5_24jy4jylvico0fo.R.inc(6069);ce.getFiller().accept(this);
    }finally{__CLR4_5_24jy4jylvico0fo.R.flushNeeded();}}

    @Override
    public void visit(OWLDataExactCardinality ce) {try{__CLR4_5_24jy4jylvico0fo.R.inc(6070);
        __CLR4_5_24jy4jylvico0fo.R.inc(6071);addValueToHash(167);
        __CLR4_5_24jy4jylvico0fo.R.inc(6072);ce.getProperty().accept(this);
        __CLR4_5_24jy4jylvico0fo.R.inc(6073);addValueToHash(ce.getCardinality());
        __CLR4_5_24jy4jylvico0fo.R.inc(6074);ce.getFiller().accept(this);
    }finally{__CLR4_5_24jy4jylvico0fo.R.flushNeeded();}}

    @Override
    public void visit(OWLDataMaxCardinality ce) {try{__CLR4_5_24jy4jylvico0fo.R.inc(6075);
        __CLR4_5_24jy4jylvico0fo.R.inc(6076);addValueToHash(173);
        __CLR4_5_24jy4jylvico0fo.R.inc(6077);ce.getProperty().accept(this);
        __CLR4_5_24jy4jylvico0fo.R.inc(6078);addValueToHash(ce.getCardinality());
        __CLR4_5_24jy4jylvico0fo.R.inc(6079);ce.getFiller().accept(this);
    }finally{__CLR4_5_24jy4jylvico0fo.R.flushNeeded();}}

    @Override
    public void visit(OWLDataMinCardinality ce) {try{__CLR4_5_24jy4jylvico0fo.R.inc(6080);
        __CLR4_5_24jy4jylvico0fo.R.inc(6081);addValueToHash(179);
        __CLR4_5_24jy4jylvico0fo.R.inc(6082);ce.getProperty().accept(this);
        __CLR4_5_24jy4jylvico0fo.R.inc(6083);addValueToHash(ce.getCardinality());
        __CLR4_5_24jy4jylvico0fo.R.inc(6084);ce.getFiller().accept(this);
    }finally{__CLR4_5_24jy4jylvico0fo.R.flushNeeded();}}

    @Override
    public void visit(OWLDataSomeValuesFrom ce) {try{__CLR4_5_24jy4jylvico0fo.R.inc(6085);
        __CLR4_5_24jy4jylvico0fo.R.inc(6086);addValueToHash(181);
        __CLR4_5_24jy4jylvico0fo.R.inc(6087);ce.getProperty().accept(this);
        __CLR4_5_24jy4jylvico0fo.R.inc(6088);ce.getFiller().accept(this);
    }finally{__CLR4_5_24jy4jylvico0fo.R.flushNeeded();}}

    @Override
    public void visit(OWLDataHasValue ce) {try{__CLR4_5_24jy4jylvico0fo.R.inc(6089);
        __CLR4_5_24jy4jylvico0fo.R.inc(6090);addValueToHash(191);
        __CLR4_5_24jy4jylvico0fo.R.inc(6091);addValueToHash(hashCode(ce.getProperty()));
        __CLR4_5_24jy4jylvico0fo.R.inc(6092);addValueToHash(hashCode(ce.getFiller()));
    }finally{__CLR4_5_24jy4jylvico0fo.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectAllValuesFrom ce) {try{__CLR4_5_24jy4jylvico0fo.R.inc(6093);
        __CLR4_5_24jy4jylvico0fo.R.inc(6094);addValueToHash(193);
        __CLR4_5_24jy4jylvico0fo.R.inc(6095);ce.getProperty().accept(this);
        __CLR4_5_24jy4jylvico0fo.R.inc(6096);ce.getFiller().accept(this);
    }finally{__CLR4_5_24jy4jylvico0fo.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectComplementOf ce) {try{__CLR4_5_24jy4jylvico0fo.R.inc(6097);
        __CLR4_5_24jy4jylvico0fo.R.inc(6098);addValueToHash(197);
        __CLR4_5_24jy4jylvico0fo.R.inc(6099);ce.getOperand().accept(this);
    }finally{__CLR4_5_24jy4jylvico0fo.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectExactCardinality ce) {try{__CLR4_5_24jy4jylvico0fo.R.inc(6100);
        __CLR4_5_24jy4jylvico0fo.R.inc(6101);addValueToHash(199);
        __CLR4_5_24jy4jylvico0fo.R.inc(6102);ce.getProperty().accept(this);
        __CLR4_5_24jy4jylvico0fo.R.inc(6103);addValueToHash(ce.getCardinality());
        __CLR4_5_24jy4jylvico0fo.R.inc(6104);ce.getFiller().accept(this);
    }finally{__CLR4_5_24jy4jylvico0fo.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectIntersectionOf ce) {try{__CLR4_5_24jy4jylvico0fo.R.inc(6105);
        __CLR4_5_24jy4jylvico0fo.R.inc(6106);addValueToHash(211);
        __CLR4_5_24jy4jylvico0fo.R.inc(6107);visitCollection(ce.getOperands());
    }finally{__CLR4_5_24jy4jylvico0fo.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectMaxCardinality ce) {try{__CLR4_5_24jy4jylvico0fo.R.inc(6108);
        __CLR4_5_24jy4jylvico0fo.R.inc(6109);addValueToHash(223);
        __CLR4_5_24jy4jylvico0fo.R.inc(6110);ce.getProperty().accept(this);
        __CLR4_5_24jy4jylvico0fo.R.inc(6111);addValueToHash(ce.getCardinality());
        __CLR4_5_24jy4jylvico0fo.R.inc(6112);ce.getFiller().accept(this);
    }finally{__CLR4_5_24jy4jylvico0fo.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectMinCardinality ce) {try{__CLR4_5_24jy4jylvico0fo.R.inc(6113);
        __CLR4_5_24jy4jylvico0fo.R.inc(6114);addValueToHash(227);
        __CLR4_5_24jy4jylvico0fo.R.inc(6115);ce.getProperty().accept(this);
        __CLR4_5_24jy4jylvico0fo.R.inc(6116);addValueToHash(ce.getCardinality());
        __CLR4_5_24jy4jylvico0fo.R.inc(6117);ce.getFiller().accept(this);
    }finally{__CLR4_5_24jy4jylvico0fo.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectOneOf ce) {try{__CLR4_5_24jy4jylvico0fo.R.inc(6118);
        __CLR4_5_24jy4jylvico0fo.R.inc(6119);addValueToHash(229);
        __CLR4_5_24jy4jylvico0fo.R.inc(6120);visitCollection(ce.getIndividuals());
    }finally{__CLR4_5_24jy4jylvico0fo.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectHasSelf ce) {try{__CLR4_5_24jy4jylvico0fo.R.inc(6121);
        __CLR4_5_24jy4jylvico0fo.R.inc(6122);addValueToHash(233);
        __CLR4_5_24jy4jylvico0fo.R.inc(6123);ce.getProperty().accept(this);
    }finally{__CLR4_5_24jy4jylvico0fo.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectSomeValuesFrom ce) {try{__CLR4_5_24jy4jylvico0fo.R.inc(6124);
        __CLR4_5_24jy4jylvico0fo.R.inc(6125);addValueToHash(239);
        __CLR4_5_24jy4jylvico0fo.R.inc(6126);ce.getProperty().accept(this);
        __CLR4_5_24jy4jylvico0fo.R.inc(6127);ce.getFiller().accept(this);
    }finally{__CLR4_5_24jy4jylvico0fo.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectUnionOf ce) {try{__CLR4_5_24jy4jylvico0fo.R.inc(6128);
        __CLR4_5_24jy4jylvico0fo.R.inc(6129);addValueToHash(241);
        __CLR4_5_24jy4jylvico0fo.R.inc(6130);visitCollection(ce.getOperands());
    }finally{__CLR4_5_24jy4jylvico0fo.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectHasValue ce) {try{__CLR4_5_24jy4jylvico0fo.R.inc(6131);
        __CLR4_5_24jy4jylvico0fo.R.inc(6132);addValueToHash(251);
        __CLR4_5_24jy4jylvico0fo.R.inc(6133);ce.getProperty().accept(this);
        __CLR4_5_24jy4jylvico0fo.R.inc(6134);ce.getFiller().accept(this);
    }finally{__CLR4_5_24jy4jylvico0fo.R.flushNeeded();}}

    @Override
    public void visit(OWLDataComplementOf node) {try{__CLR4_5_24jy4jylvico0fo.R.inc(6135);
        __CLR4_5_24jy4jylvico0fo.R.inc(6136);addValueToHash(257);
        __CLR4_5_24jy4jylvico0fo.R.inc(6137);node.getDataRange().accept(this);
    }finally{__CLR4_5_24jy4jylvico0fo.R.flushNeeded();}}

    @Override
    public void visit(OWLDataOneOf node) {try{__CLR4_5_24jy4jylvico0fo.R.inc(6138);
        __CLR4_5_24jy4jylvico0fo.R.inc(6139);addValueToHash(263);
        __CLR4_5_24jy4jylvico0fo.R.inc(6140);visitCollection(node.getValues());
    }finally{__CLR4_5_24jy4jylvico0fo.R.flushNeeded();}}

    @Override
    public void visit(OWLDatatype node) {try{__CLR4_5_24jy4jylvico0fo.R.inc(6141);
        __CLR4_5_24jy4jylvico0fo.R.inc(6142);addValueToHash(269);
        __CLR4_5_24jy4jylvico0fo.R.inc(6143);node.getIRI().accept(this);
    }finally{__CLR4_5_24jy4jylvico0fo.R.flushNeeded();}}

    @Override
    public void visit(OWLDatatypeRestriction node) {try{__CLR4_5_24jy4jylvico0fo.R.inc(6144);
        __CLR4_5_24jy4jylvico0fo.R.inc(6145);addValueToHash(271);
        __CLR4_5_24jy4jylvico0fo.R.inc(6146);node.getDatatype().accept(this);
        __CLR4_5_24jy4jylvico0fo.R.inc(6147);visitCollection(node.getFacetRestrictions());
    }finally{__CLR4_5_24jy4jylvico0fo.R.flushNeeded();}}

    @Override
    public void visit(OWLFacetRestriction node) {try{__CLR4_5_24jy4jylvico0fo.R.inc(6148);
        __CLR4_5_24jy4jylvico0fo.R.inc(6149);addValueToHash(563);
        __CLR4_5_24jy4jylvico0fo.R.inc(6150);addValueToHash(node.getFacet().hashCode());
        __CLR4_5_24jy4jylvico0fo.R.inc(6151);node.getFacetValue().accept(this);
    }finally{__CLR4_5_24jy4jylvico0fo.R.flushNeeded();}}

    @Override
    public void visit(OWLDataProperty property) {try{__CLR4_5_24jy4jylvico0fo.R.inc(6152);
        __CLR4_5_24jy4jylvico0fo.R.inc(6153);addValueToHash(283);
        __CLR4_5_24jy4jylvico0fo.R.inc(6154);property.getIRI().accept(this);
    }finally{__CLR4_5_24jy4jylvico0fo.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectProperty property) {try{__CLR4_5_24jy4jylvico0fo.R.inc(6155);
        __CLR4_5_24jy4jylvico0fo.R.inc(6156);addValueToHash(293);
        __CLR4_5_24jy4jylvico0fo.R.inc(6157);property.getIRI().accept(this);
    }finally{__CLR4_5_24jy4jylvico0fo.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectInverseOf property) {try{__CLR4_5_24jy4jylvico0fo.R.inc(6158);
        __CLR4_5_24jy4jylvico0fo.R.inc(6159);addValueToHash(307);
        __CLR4_5_24jy4jylvico0fo.R.inc(6160);property.getInverse().accept(this);
    }finally{__CLR4_5_24jy4jylvico0fo.R.flushNeeded();}}

    @Override
    public void visit(OWLNamedIndividual individual) {try{__CLR4_5_24jy4jylvico0fo.R.inc(6161);
        __CLR4_5_24jy4jylvico0fo.R.inc(6162);addValueToHash(311);
        __CLR4_5_24jy4jylvico0fo.R.inc(6163);individual.getIRI().accept(this);
    }finally{__CLR4_5_24jy4jylvico0fo.R.flushNeeded();}}

    @Override
    public void visit(SWRLRule rule) {try{__CLR4_5_24jy4jylvico0fo.R.inc(6164);
        __CLR4_5_24jy4jylvico0fo.R.inc(6165);addValueToHash(631);
        __CLR4_5_24jy4jylvico0fo.R.inc(6166);visitCollection(rule.getBody());
        __CLR4_5_24jy4jylvico0fo.R.inc(6167);visitCollection(rule.getHead());
    }finally{__CLR4_5_24jy4jylvico0fo.R.flushNeeded();}}

    @Override
    public void visit(SWRLClassAtom node) {try{__CLR4_5_24jy4jylvico0fo.R.inc(6168);
        __CLR4_5_24jy4jylvico0fo.R.inc(6169);addValueToHash(641);
        __CLR4_5_24jy4jylvico0fo.R.inc(6170);node.getArgument().accept(this);
        __CLR4_5_24jy4jylvico0fo.R.inc(6171);node.getPredicate().accept(this);
    }finally{__CLR4_5_24jy4jylvico0fo.R.flushNeeded();}}

    @Override
    public void visit(SWRLDataRangeAtom node) {try{__CLR4_5_24jy4jylvico0fo.R.inc(6172);
        __CLR4_5_24jy4jylvico0fo.R.inc(6173);addValueToHash(643);
        __CLR4_5_24jy4jylvico0fo.R.inc(6174);node.getArgument().accept(this);
        __CLR4_5_24jy4jylvico0fo.R.inc(6175);node.getPredicate().accept(this);
    }finally{__CLR4_5_24jy4jylvico0fo.R.flushNeeded();}}

    @Override
    public void visit(SWRLObjectPropertyAtom node) {try{__CLR4_5_24jy4jylvico0fo.R.inc(6176);
        __CLR4_5_24jy4jylvico0fo.R.inc(6177);addValueToHash(647);
        __CLR4_5_24jy4jylvico0fo.R.inc(6178);node.getFirstArgument().accept(this);
        __CLR4_5_24jy4jylvico0fo.R.inc(6179);node.getSecondArgument().accept(this);
        __CLR4_5_24jy4jylvico0fo.R.inc(6180);node.getPredicate().accept(this);
    }finally{__CLR4_5_24jy4jylvico0fo.R.flushNeeded();}}

    @Override
    public void visit(SWRLDataPropertyAtom node) {try{__CLR4_5_24jy4jylvico0fo.R.inc(6181);
        __CLR4_5_24jy4jylvico0fo.R.inc(6182);addValueToHash(653);
        __CLR4_5_24jy4jylvico0fo.R.inc(6183);node.getFirstArgument().accept(this);
        __CLR4_5_24jy4jylvico0fo.R.inc(6184);node.getSecondArgument().accept(this);
        __CLR4_5_24jy4jylvico0fo.R.inc(6185);node.getPredicate().accept(this);
    }finally{__CLR4_5_24jy4jylvico0fo.R.flushNeeded();}}

    @Override
    public void visit(SWRLBuiltInAtom node) {try{__CLR4_5_24jy4jylvico0fo.R.inc(6186);
        __CLR4_5_24jy4jylvico0fo.R.inc(6187);addValueToHash(659);
        __CLR4_5_24jy4jylvico0fo.R.inc(6188);visitCollection(node.getAllArguments());
        __CLR4_5_24jy4jylvico0fo.R.inc(6189);node.getPredicate().accept(this);
    }finally{__CLR4_5_24jy4jylvico0fo.R.flushNeeded();}}

    @Override
    public void visit(SWRLVariable node) {try{__CLR4_5_24jy4jylvico0fo.R.inc(6190);
        __CLR4_5_24jy4jylvico0fo.R.inc(6191);addValueToHash(661);
        __CLR4_5_24jy4jylvico0fo.R.inc(6192);node.getIRI().accept(this);
    }finally{__CLR4_5_24jy4jylvico0fo.R.flushNeeded();}}

    @Override
    public void visit(SWRLIndividualArgument node) {try{__CLR4_5_24jy4jylvico0fo.R.inc(6193);
        __CLR4_5_24jy4jylvico0fo.R.inc(6194);addValueToHash(677);
        __CLR4_5_24jy4jylvico0fo.R.inc(6195);node.getIndividual().accept(this);
    }finally{__CLR4_5_24jy4jylvico0fo.R.flushNeeded();}}

    @Override
    public void visit(SWRLLiteralArgument node) {try{__CLR4_5_24jy4jylvico0fo.R.inc(6196);
        __CLR4_5_24jy4jylvico0fo.R.inc(6197);addValueToHash(683);
        __CLR4_5_24jy4jylvico0fo.R.inc(6198);node.getLiteral().accept(this);
    }finally{__CLR4_5_24jy4jylvico0fo.R.flushNeeded();}}

    @Override
    public void visit(SWRLDifferentIndividualsAtom node) {try{__CLR4_5_24jy4jylvico0fo.R.inc(6199);
        __CLR4_5_24jy4jylvico0fo.R.inc(6200);addValueToHash(797);
        __CLR4_5_24jy4jylvico0fo.R.inc(6201);node.getFirstArgument().accept(this);
        __CLR4_5_24jy4jylvico0fo.R.inc(6202);node.getSecondArgument().accept(this);
    }finally{__CLR4_5_24jy4jylvico0fo.R.flushNeeded();}}

    @Override
    public void visit(SWRLSameIndividualAtom node) {try{__CLR4_5_24jy4jylvico0fo.R.inc(6203);
        __CLR4_5_24jy4jylvico0fo.R.inc(6204);addValueToHash(811);
        __CLR4_5_24jy4jylvico0fo.R.inc(6205);int i = node.getFirstArgument().hashCode();
        __CLR4_5_24jy4jylvico0fo.R.inc(6206);addValueToHash(i);
        __CLR4_5_24jy4jylvico0fo.R.inc(6207);node.getSecondArgument().accept(this);
    }finally{__CLR4_5_24jy4jylvico0fo.R.flushNeeded();}}

    public void addValueToHash(int i) {try{__CLR4_5_24jy4jylvico0fo.R.inc(6208);
        __CLR4_5_24jy4jylvico0fo.R.inc(6209);hashCode = hashCode * MULT + i;
    }finally{__CLR4_5_24jy4jylvico0fo.R.flushNeeded();}}

    @Override
    public void visit(OWLHasKeyAxiom axiom) {try{__CLR4_5_24jy4jylvico0fo.R.inc(6210);
        __CLR4_5_24jy4jylvico0fo.R.inc(6211);addValueToHash(821);
        __CLR4_5_24jy4jylvico0fo.R.inc(6212);axiom.getClassExpression().accept(this);
        __CLR4_5_24jy4jylvico0fo.R.inc(6213);visitCollection(axiom.getPropertyExpressions());
    }finally{__CLR4_5_24jy4jylvico0fo.R.flushNeeded();}}

    @Override
    public void visit(OWLAnnotationPropertyDomainAxiom axiom) {try{__CLR4_5_24jy4jylvico0fo.R.inc(6214);
        __CLR4_5_24jy4jylvico0fo.R.inc(6215);addValueToHash(823);
        __CLR4_5_24jy4jylvico0fo.R.inc(6216);axiom.getProperty().accept(this);
        __CLR4_5_24jy4jylvico0fo.R.inc(6217);axiom.getDomain().accept(this);
    }finally{__CLR4_5_24jy4jylvico0fo.R.flushNeeded();}}

    @Override
    public void visit(OWLAnnotationPropertyRangeAxiom axiom) {try{__CLR4_5_24jy4jylvico0fo.R.inc(6218);
        __CLR4_5_24jy4jylvico0fo.R.inc(6219);addValueToHash(827);
        __CLR4_5_24jy4jylvico0fo.R.inc(6220);axiom.getProperty().accept(this);
        __CLR4_5_24jy4jylvico0fo.R.inc(6221);axiom.getRange().accept(this);
    }finally{__CLR4_5_24jy4jylvico0fo.R.flushNeeded();}}

    @Override
    public void visit(OWLSubAnnotationPropertyOfAxiom axiom) {try{__CLR4_5_24jy4jylvico0fo.R.inc(6222);
        __CLR4_5_24jy4jylvico0fo.R.inc(6223);addValueToHash(829);
        __CLR4_5_24jy4jylvico0fo.R.inc(6224);axiom.getSubProperty().accept(this);
        __CLR4_5_24jy4jylvico0fo.R.inc(6225);axiom.getSuperProperty().accept(this);
    }finally{__CLR4_5_24jy4jylvico0fo.R.flushNeeded();}}

    @Override
    public void visit(OWLDataIntersectionOf node) {try{__CLR4_5_24jy4jylvico0fo.R.inc(6226);
        __CLR4_5_24jy4jylvico0fo.R.inc(6227);addValueToHash(839);
        __CLR4_5_24jy4jylvico0fo.R.inc(6228);visitCollection(node.getOperands());
    }finally{__CLR4_5_24jy4jylvico0fo.R.flushNeeded();}}

    @Override
    public void visit(OWLDataUnionOf node) {try{__CLR4_5_24jy4jylvico0fo.R.inc(6229);
        __CLR4_5_24jy4jylvico0fo.R.inc(6230);addValueToHash(853);
        __CLR4_5_24jy4jylvico0fo.R.inc(6231);visitCollection(node.getOperands());
    }finally{__CLR4_5_24jy4jylvico0fo.R.flushNeeded();}}

    @Override
    public void visit(OWLAnnotationProperty property) {try{__CLR4_5_24jy4jylvico0fo.R.inc(6232);
        __CLR4_5_24jy4jylvico0fo.R.inc(6233);addValueToHash(857);
        __CLR4_5_24jy4jylvico0fo.R.inc(6234);property.getIRI().accept(this);
    }finally{__CLR4_5_24jy4jylvico0fo.R.flushNeeded();}}

    @Override
    public void visit(OWLAnonymousIndividual individual) {try{__CLR4_5_24jy4jylvico0fo.R.inc(6235);
        __CLR4_5_24jy4jylvico0fo.R.inc(6236);addValueToHash(859);
        __CLR4_5_24jy4jylvico0fo.R.inc(6237);addValueToHash(individual.getID().hashCode());
    }finally{__CLR4_5_24jy4jylvico0fo.R.flushNeeded();}}

    @Override
    public void visit(IRI iri) {try{__CLR4_5_24jy4jylvico0fo.R.inc(6238);
        __CLR4_5_24jy4jylvico0fo.R.inc(6239);addValueToHash(863);
        __CLR4_5_24jy4jylvico0fo.R.inc(6240);addValueToHash(iri.toURI().hashCode());
    }finally{__CLR4_5_24jy4jylvico0fo.R.flushNeeded();}}

    @Override
    public void visit(OWLAnnotation node) {try{__CLR4_5_24jy4jylvico0fo.R.inc(6241);
        __CLR4_5_24jy4jylvico0fo.R.inc(6242);addValueToHash(877);
        __CLR4_5_24jy4jylvico0fo.R.inc(6243);node.getProperty().accept(this);
        __CLR4_5_24jy4jylvico0fo.R.inc(6244);node.getValue().accept(this);
    }finally{__CLR4_5_24jy4jylvico0fo.R.flushNeeded();}}

    @Override
    public void visit(OWLDatatypeDefinitionAxiom axiom) {try{__CLR4_5_24jy4jylvico0fo.R.inc(6245);
        __CLR4_5_24jy4jylvico0fo.R.inc(6246);addValueToHash(897);
        __CLR4_5_24jy4jylvico0fo.R.inc(6247);axiom.getDatatype().accept(this);
        __CLR4_5_24jy4jylvico0fo.R.inc(6248);axiom.getDataRange().accept(this);
    }finally{__CLR4_5_24jy4jylvico0fo.R.flushNeeded();}}

    private void visitCollection(Collection<? extends OWLObject> collection) {try{__CLR4_5_24jy4jylvico0fo.R.inc(6249);
        __CLR4_5_24jy4jylvico0fo.R.inc(6250);for (OWLObject object : collection) {{
            __CLR4_5_24jy4jylvico0fo.R.inc(6251);object.accept(this);
        }
    }}finally{__CLR4_5_24jy4jylvico0fo.R.flushNeeded();}}
}
