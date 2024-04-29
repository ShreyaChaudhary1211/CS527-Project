/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//* This file is part of the OWL API.
 * The contents of this file are subject to the LGPL License, Version 3.0.
 * Copyright 2014, The University of Manchester
 * 
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program.  If not, see http://www.gnu.org/licenses/.
 *
 * Alternatively, the contents of this file may be used under the terms of the Apache License, Version 2.0 in which case, the provisions of the Apache License Version 2.0 are applicable instead of those above.
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */
package org.semanticweb.owlapi.rdf.model;

import static org.semanticweb.owlapi.util.CollectionFactory.sortOptionally;
import static org.semanticweb.owlapi.util.OWLAPIPreconditions.checkNotNull;
import static org.semanticweb.owlapi.vocab.OWLRDFVocabulary.*;
import static org.semanticweb.owlapi.vocab.SWRLVocabulary.*;

import java.io.Serializable;
import java.util.*;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.model.parameters.Imports;
import org.semanticweb.owlapi.util.IndividualAppearance;
import org.semanticweb.owlapi.vocab.OWLRDFVocabulary;
import org.semanticweb.owlapi.vocab.XSDVocabulary;

import com.google.common.base.Optional;

/**
 * An abstract translator that can produce an RDF graph from an OWLOntology.
 * Subclasses must provide implementations to create concrete representations of
 * resources, triples etc.
 * 
 * @param <N>
 *        the basic node
 * @param <R>
 *        a resource node
 * @param
 *        <P>
 *        a predicate node
 * @param <L>
 *        a literal node
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.0.0
 */
public abstract class AbstractTranslator<N extends Serializable, R extends N, P extends N, L extends N> implements
    OWLObjectVisitor, SWRLObjectVisitor {public static class __CLR4_5_2njlnjllvicmcf0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,31139,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final OWLOntologyManager manager;
    private final OWLOntology ont;
    private final boolean useStrongTyping;
    protected final IndividualAppearance multipleOccurrences;

    /**
     * @param manager
     *        the manager
     * @param ontology
     *        the ontology
     * @param useStrongTyping
     *        true if strong typing should be used
     */
    public AbstractTranslator(@Nonnull OWLOntologyManager manager, @Nonnull OWLOntology ontology,
        boolean useStrongTyping, IndividualAppearance multiple) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(30513);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30514);this.ont = checkNotNull(ontology, "ontology cannot be null");
        __CLR4_5_2njlnjllvicmcf0.R.inc(30515);this.manager = checkNotNull(manager, "manager cannot be null");
        __CLR4_5_2njlnjllvicmcf0.R.inc(30516);this.useStrongTyping = useStrongTyping;
        __CLR4_5_2njlnjllvicmcf0.R.inc(30517);multipleOccurrences = multiple;
    }finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDeclarationAxiom axiom) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(30518);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30519);addSingleTripleAxiom(axiom, axiom.getEntity(), RDF_TYPE.getIRI(), axiom.getEntity().accept(
            OWLEntityTypeProvider.INSTANCE));
    }finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLObjectInverseOf property) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(30520);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30521);translateAnonymousNode(property);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30522);addTriple(property, OWL_INVERSE_OF.getIRI(), property.getInverse());
    }finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDataIntersectionOf node) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(30523);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30524);translateAnonymousNode(node);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30525);addTriple(node, RDF_TYPE.getIRI(), RDFS_DATATYPE.getIRI());
        __CLR4_5_2njlnjllvicmcf0.R.inc(30526);addListTriples(node, OWL_INTERSECTION_OF.getIRI(), node.getOperands());
    }finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDataUnionOf node) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(30527);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30528);translateAnonymousNode(node);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30529);addTriple(node, RDF_TYPE.getIRI(), RDFS_DATATYPE.getIRI());
        __CLR4_5_2njlnjllvicmcf0.R.inc(30530);addListTriples(node, OWL_UNION_OF.getIRI(), node.getOperands());
    }finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDataComplementOf node) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(30531);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30532);translateAnonymousNode(node);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30533);addTriple(node, RDF_TYPE.getIRI(), RDFS_DATATYPE.getIRI());
        __CLR4_5_2njlnjllvicmcf0.R.inc(30534);addTriple(node, OWL_DATATYPE_COMPLEMENT_OF.getIRI(), node.getDataRange());
    }finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDataOneOf node) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(30535);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30536);translateAnonymousNode(node);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30537);addTriple(node, RDF_TYPE.getIRI(), RDFS_DATATYPE.getIRI());
        __CLR4_5_2njlnjllvicmcf0.R.inc(30538);addListTriples(node, OWL_ONE_OF.getIRI(), node.getValues());
    }finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDatatypeRestriction node) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(30539);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30540);translateAnonymousNode(node);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30541);addTriple(node, RDF_TYPE.getIRI(), RDFS_DATATYPE.getIRI());
        __CLR4_5_2njlnjllvicmcf0.R.inc(30542);addTriple(node, OWL_ON_DATA_TYPE.getIRI(), node.getDatatype());
        __CLR4_5_2njlnjllvicmcf0.R.inc(30543);addListTriples(node, OWL_WITH_RESTRICTIONS.getIRI(), node.getFacetRestrictions());
    }finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLObjectIntersectionOf ce) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(30544);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30545);translateAnonymousNode(ce);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30546);addListTriples(ce, OWL_INTERSECTION_OF.getIRI(), ce.getOperands());
        __CLR4_5_2njlnjllvicmcf0.R.inc(30547);addTriple(ce, RDF_TYPE.getIRI(), OWL_CLASS.getIRI());
    }finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLObjectUnionOf ce) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(30548);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30549);translateAnonymousNode(ce);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30550);addTriple(ce, RDF_TYPE.getIRI(), OWL_CLASS.getIRI());
        __CLR4_5_2njlnjllvicmcf0.R.inc(30551);addListTriples(ce, OWL_UNION_OF.getIRI(), ce.getOperands());
    }finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLObjectComplementOf ce) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(30552);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30553);translateAnonymousNode(ce);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30554);addTriple(ce, RDF_TYPE.getIRI(), OWL_CLASS.getIRI());
        __CLR4_5_2njlnjllvicmcf0.R.inc(30555);addTriple(ce, OWL_COMPLEMENT_OF.getIRI(), ce.getOperand());
    }finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLObjectOneOf ce) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(30556);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30557);translateAnonymousNode(ce);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30558);addTriple(ce, RDF_TYPE.getIRI(), OWL_CLASS.getIRI());
        __CLR4_5_2njlnjllvicmcf0.R.inc(30559);addListTriples(ce, OWL_ONE_OF.getIRI(), ce.getIndividuals());
        __CLR4_5_2njlnjllvicmcf0.R.inc(30560);processIfAnonymous(ce.getIndividuals(), null);
    }finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    // Translation of restrictions
    /**
     * Add type triples and the owl:onProperty triples for an OWLRestriction.
     * 
     * @param desc
     *        The restriction
     * @param property
     *        property
     */
    private void addRestrictionCommonTriplePropertyRange(@Nonnull OWLRestriction desc,
        @Nonnull OWLPropertyExpression property) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(30561);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30562);translateAnonymousNode(desc);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30563);addTriple(desc, RDF_TYPE.getIRI(), OWL_RESTRICTION.getIRI());
        __CLR4_5_2njlnjllvicmcf0.R.inc(30564);addTriple(desc, OWL_ON_PROPERTY.getIRI(), property);
    }finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    private void addRestrictionCommonTriplePropertyExpression(@Nonnull OWLRestriction desc,
        @Nonnull OWLPropertyExpression property) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(30565);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30566);translateAnonymousNode(desc);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30567);addTriple(desc, RDF_TYPE.getIRI(), OWL_RESTRICTION.getIRI());
        __CLR4_5_2njlnjllvicmcf0.R.inc(30568);addTriple(desc, OWL_ON_PROPERTY.getIRI(), property);
    }finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    private void addObjectCardinalityRestrictionTriples(@Nonnull OWLCardinalityRestriction<OWLClassExpression> ce,
        @Nonnull OWLPropertyExpression p, @Nonnull OWLRDFVocabulary cardiPredicate) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(30569);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30570);addRestrictionCommonTriplePropertyRange(ce, p);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30571);addTriple(ce, cardiPredicate.getIRI(), toTypedConstant(ce.getCardinality()));
        __CLR4_5_2njlnjllvicmcf0.R.inc(30572);if ((((ce.isQualified())&&(__CLR4_5_2njlnjllvicmcf0.R.iget(30573)!=0|true))||(__CLR4_5_2njlnjllvicmcf0.R.iget(30574)==0&false))) {{
            __CLR4_5_2njlnjllvicmcf0.R.inc(30575);if ((((ce.isObjectRestriction())&&(__CLR4_5_2njlnjllvicmcf0.R.iget(30576)!=0|true))||(__CLR4_5_2njlnjllvicmcf0.R.iget(30577)==0&false))) {{
                __CLR4_5_2njlnjllvicmcf0.R.inc(30578);addTriple(ce, OWL_ON_CLASS.getIRI(), ce.getFiller());
            } }else {{
                __CLR4_5_2njlnjllvicmcf0.R.inc(30579);addTriple(ce, OWL_ON_DATA_RANGE.getIRI(), ce.getFiller());
            }
        }}
    }}finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    private void addDataCardinalityRestrictionTriples(@Nonnull OWLCardinalityRestriction<OWLDataRange> ce,
        @Nonnull OWLPropertyExpression p, @Nonnull OWLRDFVocabulary cardiPredicate) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(30580);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30581);addRestrictionCommonTriplePropertyRange(ce, p);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30582);addTriple(ce, cardiPredicate.getIRI(), toTypedConstant(ce.getCardinality()));
        __CLR4_5_2njlnjllvicmcf0.R.inc(30583);if ((((ce.isQualified())&&(__CLR4_5_2njlnjllvicmcf0.R.iget(30584)!=0|true))||(__CLR4_5_2njlnjllvicmcf0.R.iget(30585)==0&false))) {{
            __CLR4_5_2njlnjllvicmcf0.R.inc(30586);if ((((ce.isObjectRestriction())&&(__CLR4_5_2njlnjllvicmcf0.R.iget(30587)!=0|true))||(__CLR4_5_2njlnjllvicmcf0.R.iget(30588)==0&false))) {{
                __CLR4_5_2njlnjllvicmcf0.R.inc(30589);addTriple(ce, OWL_ON_CLASS.getIRI(), ce.getFiller());
            } }else {{
                __CLR4_5_2njlnjllvicmcf0.R.inc(30590);addTriple(ce, OWL_ON_DATA_RANGE.getIRI(), ce.getFiller());
            }
        }}
    }}finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLObjectSomeValuesFrom ce) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(30591);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30592);addRestrictionCommonTriplePropertyRange(ce, ce.getProperty());
        __CLR4_5_2njlnjllvicmcf0.R.inc(30593);addTriple(ce, OWL_SOME_VALUES_FROM.getIRI(), ce.getFiller());
    }finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLObjectAllValuesFrom ce) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(30594);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30595);addRestrictionCommonTriplePropertyRange(ce, ce.getProperty());
        __CLR4_5_2njlnjllvicmcf0.R.inc(30596);addTriple(ce, OWL_ALL_VALUES_FROM.getIRI(), ce.getFiller());
    }finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLObjectHasValue ce) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(30597);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30598);addRestrictionCommonTriplePropertyExpression(ce, ce.getProperty());
        __CLR4_5_2njlnjllvicmcf0.R.inc(30599);addTriple(ce, OWL_HAS_VALUE.getIRI(), ce.getFiller());
        __CLR4_5_2njlnjllvicmcf0.R.inc(30600);processIfAnonymous(ce.getFiller(), null);
    }finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLObjectHasSelf ce) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(30601);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30602);translateAnonymousNode(ce);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30603);addTriple(ce, RDF_TYPE.getIRI(), OWL_RESTRICTION.getIRI());
        __CLR4_5_2njlnjllvicmcf0.R.inc(30604);addTriple(ce, OWL_ON_PROPERTY.getIRI(), ce.getProperty());
        __CLR4_5_2njlnjllvicmcf0.R.inc(30605);addTriple(ce, OWL_HAS_SELF.getIRI(), manager.getOWLDataFactory().getOWLLiteral(true));
    }finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLObjectMinCardinality ce) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(30606);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30607);if ((((ce.isQualified())&&(__CLR4_5_2njlnjllvicmcf0.R.iget(30608)!=0|true))||(__CLR4_5_2njlnjllvicmcf0.R.iget(30609)==0&false))) {{
            __CLR4_5_2njlnjllvicmcf0.R.inc(30610);addObjectCardinalityRestrictionTriples(ce, ce.getProperty(), OWL_MIN_QUALIFIED_CARDINALITY);
        } }else {{
            __CLR4_5_2njlnjllvicmcf0.R.inc(30611);addObjectCardinalityRestrictionTriples(ce, ce.getProperty(), OWL_MIN_CARDINALITY);
        }
    }}finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLObjectMaxCardinality ce) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(30612);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30613);if ((((ce.isQualified())&&(__CLR4_5_2njlnjllvicmcf0.R.iget(30614)!=0|true))||(__CLR4_5_2njlnjllvicmcf0.R.iget(30615)==0&false))) {{
            __CLR4_5_2njlnjllvicmcf0.R.inc(30616);addObjectCardinalityRestrictionTriples(ce, ce.getProperty(), OWL_MAX_QUALIFIED_CARDINALITY);
        } }else {{
            __CLR4_5_2njlnjllvicmcf0.R.inc(30617);addObjectCardinalityRestrictionTriples(ce, ce.getProperty(), OWL_MAX_CARDINALITY);
        }
    }}finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLObjectExactCardinality ce) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(30618);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30619);if ((((ce.isQualified())&&(__CLR4_5_2njlnjllvicmcf0.R.iget(30620)!=0|true))||(__CLR4_5_2njlnjllvicmcf0.R.iget(30621)==0&false))) {{
            __CLR4_5_2njlnjllvicmcf0.R.inc(30622);addObjectCardinalityRestrictionTriples(ce, ce.getProperty(), OWL_QUALIFIED_CARDINALITY);
        } }else {{
            __CLR4_5_2njlnjllvicmcf0.R.inc(30623);addObjectCardinalityRestrictionTriples(ce, ce.getProperty(), OWL_CARDINALITY);
        }
    }}finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDataSomeValuesFrom ce) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(30624);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30625);addRestrictionCommonTriplePropertyRange(ce, ce.getProperty());
        __CLR4_5_2njlnjllvicmcf0.R.inc(30626);addTriple(ce, OWL_SOME_VALUES_FROM.getIRI(), ce.getFiller());
    }finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDataAllValuesFrom ce) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(30627);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30628);addRestrictionCommonTriplePropertyRange(ce, ce.getProperty());
        __CLR4_5_2njlnjllvicmcf0.R.inc(30629);addTriple(ce, OWL_ALL_VALUES_FROM.getIRI(), ce.getFiller());
    }finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDataHasValue ce) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(30630);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30631);addRestrictionCommonTriplePropertyExpression(ce, ce.getProperty());
        __CLR4_5_2njlnjllvicmcf0.R.inc(30632);addTriple(ce, OWL_HAS_VALUE.getIRI(), ce.getFiller());
    }finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDataMinCardinality ce) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(30633);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30634);if ((((ce.isQualified())&&(__CLR4_5_2njlnjllvicmcf0.R.iget(30635)!=0|true))||(__CLR4_5_2njlnjllvicmcf0.R.iget(30636)==0&false))) {{
            __CLR4_5_2njlnjllvicmcf0.R.inc(30637);addDataCardinalityRestrictionTriples(ce, ce.getProperty(), OWL_MIN_QUALIFIED_CARDINALITY);
        } }else {{
            __CLR4_5_2njlnjllvicmcf0.R.inc(30638);addDataCardinalityRestrictionTriples(ce, ce.getProperty(), OWL_MIN_CARDINALITY);
        }
    }}finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDataMaxCardinality ce) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(30639);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30640);if ((((ce.isQualified())&&(__CLR4_5_2njlnjllvicmcf0.R.iget(30641)!=0|true))||(__CLR4_5_2njlnjllvicmcf0.R.iget(30642)==0&false))) {{
            __CLR4_5_2njlnjllvicmcf0.R.inc(30643);addDataCardinalityRestrictionTriples(ce, ce.getProperty(), OWL_MAX_QUALIFIED_CARDINALITY);
        } }else {{
            __CLR4_5_2njlnjllvicmcf0.R.inc(30644);addDataCardinalityRestrictionTriples(ce, ce.getProperty(), OWL_MAX_CARDINALITY);
        }
    }}finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDataExactCardinality ce) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(30645);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30646);if ((((ce.isQualified())&&(__CLR4_5_2njlnjllvicmcf0.R.iget(30647)!=0|true))||(__CLR4_5_2njlnjllvicmcf0.R.iget(30648)==0&false))) {{
            __CLR4_5_2njlnjllvicmcf0.R.inc(30649);addDataCardinalityRestrictionTriples(ce, ce.getProperty(), OWL_QUALIFIED_CARDINALITY);
        } }else {{
            __CLR4_5_2njlnjllvicmcf0.R.inc(30650);addDataCardinalityRestrictionTriples(ce, ce.getProperty(), OWL_CARDINALITY);
        }
    }}finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    // Axioms
    @Override
    public void visit(@Nonnull OWLSubClassOfAxiom axiom) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(30651);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30652);addSingleTripleAxiom(axiom, axiom.getSubClass(), RDFS_SUBCLASS_OF.getIRI(), axiom.getSuperClass());
    }finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLEquivalentClassesAxiom axiom) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(30653);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30654);if ((((axiom.getClassExpressions().size() == 2)&&(__CLR4_5_2njlnjllvicmcf0.R.iget(30655)!=0|true))||(__CLR4_5_2njlnjllvicmcf0.R.iget(30656)==0&false))) {{
            __CLR4_5_2njlnjllvicmcf0.R.inc(30657);addPairwise(axiom, axiom.getClassExpressions(), OWL_EQUIVALENT_CLASS.getIRI());
        } }else {{
            __CLR4_5_2njlnjllvicmcf0.R.inc(30658);for (OWLEquivalentClassesAxiom ax : sort(axiom.splitToAnnotatedPairs())) {{
                __CLR4_5_2njlnjllvicmcf0.R.inc(30659);ax.accept(this);
            }
        }}
    }}finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDisjointClassesAxiom axiom) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(30660);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30661);if ((((axiom.getClassExpressions().size() == 2)&&(__CLR4_5_2njlnjllvicmcf0.R.iget(30662)!=0|true))||(__CLR4_5_2njlnjllvicmcf0.R.iget(30663)==0&false))) {{
            __CLR4_5_2njlnjllvicmcf0.R.inc(30664);addPairwiseClassExpressions(axiom, axiom.getClassExpressions(), OWL_DISJOINT_WITH.getIRI());
        } }else {{
            __CLR4_5_2njlnjllvicmcf0.R.inc(30665);translateAnonymousNode(axiom);
            __CLR4_5_2njlnjllvicmcf0.R.inc(30666);addTriple(axiom, RDF_TYPE.getIRI(), OWL_ALL_DISJOINT_CLASSES.getIRI());
            __CLR4_5_2njlnjllvicmcf0.R.inc(30667);addListTriples(axiom, OWL_MEMBERS.getIRI(), axiom.getClassExpressions());
            __CLR4_5_2njlnjllvicmcf0.R.inc(30668);translateAnnotations(axiom);
        }
    }}finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDisjointUnionAxiom axiom) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(30669);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30670);Set<OWLClassExpression> classExpressions = axiom.getClassExpressions();
        __CLR4_5_2njlnjllvicmcf0.R.inc(30671);List<OWLClassExpression> list = new ArrayList<>(classExpressions);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30672);Collections.sort(list);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30673);addSingleTripleAxiom(axiom, axiom.getOWLClass(), OWL_DISJOINT_UNION_OF.getIRI(), list);
    }finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLSubObjectPropertyOfAxiom axiom) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(30674);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30675);addSingleTripleAxiom(axiom, axiom.getSubProperty(), RDFS_SUB_PROPERTY_OF.getIRI(), axiom.getSuperProperty());
    }finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLSubPropertyChainOfAxiom axiom) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(30676);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30677);addSingleTripleAxiom(axiom, axiom.getSuperProperty(), OWL_PROPERTY_CHAIN_AXIOM.getIRI(), axiom
            .getPropertyChain());
    }finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLEquivalentObjectPropertiesAxiom axiom) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(30678);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30679);if ((((axiom.getProperties().size() == 2)&&(__CLR4_5_2njlnjllvicmcf0.R.iget(30680)!=0|true))||(__CLR4_5_2njlnjllvicmcf0.R.iget(30681)==0&false))) {{
            __CLR4_5_2njlnjllvicmcf0.R.inc(30682);addPairwise(axiom, axiom.getProperties(), OWL_EQUIVALENT_PROPERTY.getIRI());
        } }else {{
            __CLR4_5_2njlnjllvicmcf0.R.inc(30683);for (OWLEquivalentObjectPropertiesAxiom ax : sort(axiom.splitToAnnotatedPairs())) {{
                __CLR4_5_2njlnjllvicmcf0.R.inc(30684);ax.accept(this);
            }
        }}
    }}finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDisjointObjectPropertiesAxiom axiom) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(30685);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30686);if ((((axiom.getProperties().size() == 2)&&(__CLR4_5_2njlnjllvicmcf0.R.iget(30687)!=0|true))||(__CLR4_5_2njlnjllvicmcf0.R.iget(30688)==0&false))) {{
            __CLR4_5_2njlnjllvicmcf0.R.inc(30689);addPairwise(axiom, axiom.getProperties(), OWL_PROPERTY_DISJOINT_WITH.getIRI());
        } }else {{
            __CLR4_5_2njlnjllvicmcf0.R.inc(30690);translateAnonymousNode(axiom);
            __CLR4_5_2njlnjllvicmcf0.R.inc(30691);translateAnnotations(axiom);
            __CLR4_5_2njlnjllvicmcf0.R.inc(30692);addTriple(axiom, RDF_TYPE.getIRI(), OWL_ALL_DISJOINT_PROPERTIES.getIRI());
            __CLR4_5_2njlnjllvicmcf0.R.inc(30693);addListTriples(axiom, OWL_MEMBERS.getIRI(), axiom.getProperties());
        }
    }}finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLObjectPropertyDomainAxiom axiom) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(30694);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30695);addSingleTripleAxiom(axiom, axiom.getProperty(), RDFS_DOMAIN.getIRI(), axiom.getDomain());
    }finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLObjectPropertyRangeAxiom axiom) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(30696);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30697);addSingleTripleAxiom(axiom, axiom.getProperty(), RDFS_RANGE.getIRI(), axiom.getRange());
    }finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLInverseObjectPropertiesAxiom axiom) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(30698);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30699);addSingleTripleAxiom(axiom, axiom.getFirstProperty(), OWL_INVERSE_OF.getIRI(), axiom.getSecondProperty());
    }finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLFunctionalObjectPropertyAxiom axiom) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(30700);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30701);addSingleTripleAxiom(axiom, axiom.getProperty(), RDF_TYPE.getIRI(), OWL_FUNCTIONAL_PROPERTY.getIRI());
    }finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLInverseFunctionalObjectPropertyAxiom axiom) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(30702);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30703);addSingleTripleAxiom(axiom, axiom.getProperty(), RDF_TYPE.getIRI(), OWL_INVERSE_FUNCTIONAL_PROPERTY.getIRI());
    }finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLReflexiveObjectPropertyAxiom axiom) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(30704);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30705);addSingleTripleAxiom(axiom, axiom.getProperty(), RDF_TYPE.getIRI(), OWL_REFLEXIVE_PROPERTY.getIRI());
    }finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLIrreflexiveObjectPropertyAxiom axiom) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(30706);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30707);addSingleTripleAxiom(axiom, axiom.getProperty(), RDF_TYPE.getIRI(), OWL_IRREFLEXIVE_PROPERTY.getIRI());
    }finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLSymmetricObjectPropertyAxiom axiom) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(30708);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30709);addSingleTripleAxiom(axiom, axiom.getProperty(), RDF_TYPE.getIRI(), OWL_SYMMETRIC_PROPERTY.getIRI());
    }finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLAsymmetricObjectPropertyAxiom axiom) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(30710);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30711);addSingleTripleAxiom(axiom, axiom.getProperty(), RDF_TYPE.getIRI(), OWL_ASYMMETRIC_PROPERTY.getIRI());
    }finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLTransitiveObjectPropertyAxiom axiom) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(30712);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30713);addSingleTripleAxiom(axiom, axiom.getProperty(), RDF_TYPE.getIRI(), OWL_TRANSITIVE_PROPERTY.getIRI());
    }finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLSubDataPropertyOfAxiom axiom) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(30714);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30715);addSingleTripleAxiom(axiom, axiom.getSubProperty(), RDFS_SUB_PROPERTY_OF.getIRI(), axiom.getSuperProperty());
    }finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLEquivalentDataPropertiesAxiom axiom) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(30716);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30717);if ((((axiom.getProperties().size() == 2)&&(__CLR4_5_2njlnjllvicmcf0.R.iget(30718)!=0|true))||(__CLR4_5_2njlnjllvicmcf0.R.iget(30719)==0&false))) {{
            __CLR4_5_2njlnjllvicmcf0.R.inc(30720);addPairwise(axiom, axiom.getProperties(), OWL_EQUIVALENT_PROPERTY.getIRI());
        } }else {{
            __CLR4_5_2njlnjllvicmcf0.R.inc(30721);for (OWLEquivalentDataPropertiesAxiom ax : axiom.splitToAnnotatedPairs()) {{
                __CLR4_5_2njlnjllvicmcf0.R.inc(30722);ax.accept(this);
            }
        }}
    }}finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDisjointDataPropertiesAxiom axiom) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(30723);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30724);if ((((axiom.getProperties().size() == 2)&&(__CLR4_5_2njlnjllvicmcf0.R.iget(30725)!=0|true))||(__CLR4_5_2njlnjllvicmcf0.R.iget(30726)==0&false))) {{
            __CLR4_5_2njlnjllvicmcf0.R.inc(30727);addPairwise(axiom, axiom.getProperties(), OWL_PROPERTY_DISJOINT_WITH.getIRI());
        } }else {{
            __CLR4_5_2njlnjllvicmcf0.R.inc(30728);translateAnonymousNode(axiom);
            __CLR4_5_2njlnjllvicmcf0.R.inc(30729);translateAnnotations(axiom);
            __CLR4_5_2njlnjllvicmcf0.R.inc(30730);addTriple(axiom, RDF_TYPE.getIRI(), OWL_ALL_DISJOINT_PROPERTIES.getIRI());
            __CLR4_5_2njlnjllvicmcf0.R.inc(30731);addListTriples(axiom, OWL_MEMBERS.getIRI(), axiom.getProperties());
        }
    }}finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDataPropertyDomainAxiom axiom) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(30732);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30733);addSingleTripleAxiom(axiom, axiom.getProperty(), RDFS_DOMAIN.getIRI(), axiom.getDomain());
    }finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDataPropertyRangeAxiom axiom) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(30734);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30735);addSingleTripleAxiom(axiom, axiom.getProperty(), RDFS_RANGE.getIRI(), axiom.getRange());
    }finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLFunctionalDataPropertyAxiom axiom) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(30736);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30737);addSingleTripleAxiom(axiom, axiom.getProperty(), RDF_TYPE.getIRI(), OWL_FUNCTIONAL_PROPERTY.getIRI());
    }finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDatatypeDefinitionAxiom axiom) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(30738);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30739);addSingleTripleAxiom(axiom, axiom.getDatatype(), OWL_EQUIVALENT_CLASS.getIRI(), axiom.getDataRange());
    }finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLHasKeyAxiom axiom) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(30740);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30741);Set<OWLPropertyExpression> propertyExpressions = axiom.getPropertyExpressions();
        __CLR4_5_2njlnjllvicmcf0.R.inc(30742);List<OWLPropertyExpression> list = new ArrayList<>(propertyExpressions);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30743);Collections.sort(list);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30744);addSingleTripleAxiom(axiom, axiom.getClassExpression(), OWL_HAS_KEY.getIRI(), list);
    }finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLSameIndividualAxiom axiom) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(30745);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30746);addPairwise(axiom, axiom.getIndividuals(), OWL_SAME_AS.getIRI());
        __CLR4_5_2njlnjllvicmcf0.R.inc(30747);processIfAnonymous(axiom.getIndividuals(), axiom);
    }finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDifferentIndividualsAxiom axiom) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(30748);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30749);translateAnonymousNode(axiom);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30750);addTriple(axiom, RDF_TYPE.getIRI(), OWL_ALL_DIFFERENT.getIRI());
        __CLR4_5_2njlnjllvicmcf0.R.inc(30751);addListTriples(axiom, OWL_DISTINCT_MEMBERS.getIRI(), axiom.getIndividuals());
        __CLR4_5_2njlnjllvicmcf0.R.inc(30752);processIfAnonymous(axiom.getIndividuals(), axiom);
    }finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLClassAssertionAxiom axiom) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(30753);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30754);axiom.getIndividual().accept(this);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30755);addSingleTripleAxiom(axiom, axiom.getIndividual(), RDF_TYPE.getIRI(), axiom.getClassExpression());
        __CLR4_5_2njlnjllvicmcf0.R.inc(30756);processIfAnonymous(axiom.getIndividual(), axiom);
    }finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLObjectPropertyAssertionAxiom axiom) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(30757);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30758);OWLObjectPropertyAssertionAxiom simplified = axiom.getSimplified();
        __CLR4_5_2njlnjllvicmcf0.R.inc(30759);addSingleTripleAxiom(simplified, simplified.getSubject(), simplified.getProperty(), simplified.getObject());
        __CLR4_5_2njlnjllvicmcf0.R.inc(30760);processIfAnonymous(simplified.getObject(), axiom);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30761);processIfAnonymous(simplified.getSubject(), axiom);
    }finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLNegativeObjectPropertyAssertionAxiom axiom) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(30762);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30763);translateAnonymousNode(axiom);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30764);addTriple(axiom, RDF_TYPE.getIRI(), OWL_NEGATIVE_PROPERTY_ASSERTION.getIRI());
        __CLR4_5_2njlnjllvicmcf0.R.inc(30765);addTriple(axiom, OWL_SOURCE_INDIVIDUAL.getIRI(), axiom.getSubject());
        __CLR4_5_2njlnjllvicmcf0.R.inc(30766);addTriple(axiom, OWL_ASSERTION_PROPERTY.getIRI(), axiom.getProperty());
        __CLR4_5_2njlnjllvicmcf0.R.inc(30767);addTriple(axiom, OWL_TARGET_INDIVIDUAL.getIRI(), axiom.getObject());
        __CLR4_5_2njlnjllvicmcf0.R.inc(30768);translateAnnotations(axiom);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30769);processIfAnonymous(axiom.getSubject(), axiom);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30770);processIfAnonymous(axiom.getObject(), axiom);
    }finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDataPropertyAssertionAxiom axiom) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(30771);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30772);addSingleTripleAxiom(axiom, axiom.getSubject(), axiom.getProperty(), axiom.getObject());
    }finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLNegativeDataPropertyAssertionAxiom axiom) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(30773);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30774);translateAnonymousNode(axiom);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30775);addTriple(axiom, RDF_TYPE.getIRI(), OWL_NEGATIVE_PROPERTY_ASSERTION.getIRI());
        __CLR4_5_2njlnjllvicmcf0.R.inc(30776);addTriple(axiom, OWL_SOURCE_INDIVIDUAL.getIRI(), axiom.getSubject());
        __CLR4_5_2njlnjllvicmcf0.R.inc(30777);addTriple(axiom, OWL_ASSERTION_PROPERTY.getIRI(), axiom.getProperty());
        __CLR4_5_2njlnjllvicmcf0.R.inc(30778);addTriple(axiom, OWL_TARGET_VALUE.getIRI(), axiom.getObject());
        __CLR4_5_2njlnjllvicmcf0.R.inc(30779);translateAnnotations(axiom);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30780);processIfAnonymous(axiom.getSubject(), axiom);
    }finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLAnnotationAssertionAxiom axiom) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(30781);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30782);addSingleTripleAxiom(axiom, axiom.getSubject(), axiom.getProperty(), axiom.getValue());
        __CLR4_5_2njlnjllvicmcf0.R.inc(30783);if ((((axiom.getValue() instanceof OWLAnonymousIndividual)&&(__CLR4_5_2njlnjllvicmcf0.R.iget(30784)!=0|true))||(__CLR4_5_2njlnjllvicmcf0.R.iget(30785)==0&false))) {{
            __CLR4_5_2njlnjllvicmcf0.R.inc(30786);processIfAnonymous((OWLAnonymousIndividual) axiom.getValue(), axiom);
        }
    }}finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLSubAnnotationPropertyOfAxiom axiom) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(30787);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30788);addSingleTripleAxiom(axiom, axiom.getSubProperty(), RDFS_SUB_PROPERTY_OF.getIRI(), axiom.getSuperProperty());
    }finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLAnnotationPropertyDomainAxiom axiom) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(30789);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30790);addSingleTripleAxiom(axiom, axiom.getProperty(), RDFS_DOMAIN.getIRI(), axiom.getDomain());
    }finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLAnnotationPropertyRangeAxiom axiom) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(30791);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30792);addSingleTripleAxiom(axiom, axiom.getProperty(), RDFS_RANGE.getIRI(), axiom.getRange());
    }finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLClass ce) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(30793);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30794);if ((((!nodeMap.containsKey(ce))&&(__CLR4_5_2njlnjllvicmcf0.R.iget(30795)!=0|true))||(__CLR4_5_2njlnjllvicmcf0.R.iget(30796)==0&false))) {{
            __CLR4_5_2njlnjllvicmcf0.R.inc(30797);nodeMap.put(ce, getResourceNode(ce.getIRI()));
        }
        }__CLR4_5_2njlnjllvicmcf0.R.inc(30798);addStrongTyping(ce);
    }finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDatatype node) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(30799);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30800);if ((((!nodeMap.containsKey(node))&&(__CLR4_5_2njlnjllvicmcf0.R.iget(30801)!=0|true))||(__CLR4_5_2njlnjllvicmcf0.R.iget(30802)==0&false))) {{
            __CLR4_5_2njlnjllvicmcf0.R.inc(30803);nodeMap.put(node, getResourceNode(node.getIRI()));
        }
        }__CLR4_5_2njlnjllvicmcf0.R.inc(30804);addStrongTyping(node);
    }finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLFacetRestriction node) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(30805);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30806);translateAnonymousNode(node);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30807);addTriple(node, node.getFacet().getIRI(), node.getFacetValue());
    }finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    @Override
    public void visit(IRI iri) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(30808);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30809);if ((((!nodeMap.containsKey(iri))&&(__CLR4_5_2njlnjllvicmcf0.R.iget(30810)!=0|true))||(__CLR4_5_2njlnjllvicmcf0.R.iget(30811)==0&false))) {{
            __CLR4_5_2njlnjllvicmcf0.R.inc(30812);nodeMap.put(iri, getResourceNode(iri));
        }
    }}finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    @Override
    public void visit(OWLLiteral node) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(30813);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30814);if ((((!nodeMap.containsKey(node))&&(__CLR4_5_2njlnjllvicmcf0.R.iget(30815)!=0|true))||(__CLR4_5_2njlnjllvicmcf0.R.iget(30816)==0&false))) {{
            __CLR4_5_2njlnjllvicmcf0.R.inc(30817);nodeMap.put(node, getLiteralNode(node));
        }
    }}finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDataProperty property) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(30818);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30819);if ((((!nodeMap.containsKey(property))&&(__CLR4_5_2njlnjllvicmcf0.R.iget(30820)!=0|true))||(__CLR4_5_2njlnjllvicmcf0.R.iget(30821)==0&false))) {{
            __CLR4_5_2njlnjllvicmcf0.R.inc(30822);nodeMap.put(property, getPredicateNode(property.getIRI()));
        }
        }__CLR4_5_2njlnjllvicmcf0.R.inc(30823);addStrongTyping(property);
    }finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLObjectProperty property) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(30824);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30825);if ((((!nodeMap.containsKey(property))&&(__CLR4_5_2njlnjllvicmcf0.R.iget(30826)!=0|true))||(__CLR4_5_2njlnjllvicmcf0.R.iget(30827)==0&false))) {{
            __CLR4_5_2njlnjllvicmcf0.R.inc(30828);nodeMap.put(property, getPredicateNode(property.getIRI()));
        }
        }__CLR4_5_2njlnjllvicmcf0.R.inc(30829);addStrongTyping(property);
    }finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLAnnotationProperty property) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(30830);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30831);if ((((!nodeMap.containsKey(property))&&(__CLR4_5_2njlnjllvicmcf0.R.iget(30832)!=0|true))||(__CLR4_5_2njlnjllvicmcf0.R.iget(30833)==0&false))) {{
            __CLR4_5_2njlnjllvicmcf0.R.inc(30834);nodeMap.put(property, getPredicateNode(property.getIRI()));
        }
        }__CLR4_5_2njlnjllvicmcf0.R.inc(30835);addStrongTyping(property);
    }finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLNamedIndividual individual) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(30836);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30837);if ((((!nodeMap.containsKey(individual))&&(__CLR4_5_2njlnjllvicmcf0.R.iget(30838)!=0|true))||(__CLR4_5_2njlnjllvicmcf0.R.iget(30839)==0&false))) {{
            __CLR4_5_2njlnjllvicmcf0.R.inc(30840);nodeMap.put(individual, getResourceNode(individual.getIRI()));
        }
        }__CLR4_5_2njlnjllvicmcf0.R.inc(30841);addStrongTyping(individual);
    }finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    @Override
    public void visit(OWLAnonymousIndividual individual) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(30842);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30843);translateAnonymousNode(individual);
    }finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLOntology ontology) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(30844);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30845);Optional<IRI> ontologyIRI = ontology.getOntologyID().getOntologyIRI();
        __CLR4_5_2njlnjllvicmcf0.R.inc(30846);if ((((ontologyIRI.isPresent())&&(__CLR4_5_2njlnjllvicmcf0.R.iget(30847)!=0|true))||(__CLR4_5_2njlnjllvicmcf0.R.iget(30848)==0&false))) {{
            __CLR4_5_2njlnjllvicmcf0.R.inc(30849);if ((((!nodeMap.containsKey(ontology))&&(__CLR4_5_2njlnjllvicmcf0.R.iget(30850)!=0|true))||(__CLR4_5_2njlnjllvicmcf0.R.iget(30851)==0&false))) {{
                __CLR4_5_2njlnjllvicmcf0.R.inc(30852);nodeMap.put(ontology, getResourceNode(ontologyIRI.get()));
            }
        }} }else {{
            __CLR4_5_2njlnjllvicmcf0.R.inc(30853);translateAnonymousNode(ontology);
        }
        }__CLR4_5_2njlnjllvicmcf0.R.inc(30854);addTriple(ontology, RDF_TYPE.getIRI(), OWL_ONTOLOGY.getIRI());
    }finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull SWRLRule rule) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(30855);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30856);translateAnonymousNode(rule);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30857);translateAnnotations(rule);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30858);addTriple(rule, RDF_TYPE.getIRI(), IMP.getIRI());
        __CLR4_5_2njlnjllvicmcf0.R.inc(30859);Set<SWRLAtom> antecedent = rule.getBody();
        __CLR4_5_2njlnjllvicmcf0.R.inc(30860);addTriple(rule, BODY.getIRI(), antecedent, ATOM_LIST.getIRI());
        __CLR4_5_2njlnjllvicmcf0.R.inc(30861);Set<SWRLAtom> consequent = rule.getHead();
        __CLR4_5_2njlnjllvicmcf0.R.inc(30862);addTriple(rule, HEAD.getIRI(), consequent, ATOM_LIST.getIRI());
    }finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull SWRLClassAtom node) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(30863);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30864);translateAnonymousNode(node);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30865);addTriple(node, RDF_TYPE.getIRI(), CLASS_ATOM.getIRI());
        __CLR4_5_2njlnjllvicmcf0.R.inc(30866);node.getPredicate().accept(this);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30867);addTriple(node, CLASS_PREDICATE.getIRI(), node.getPredicate());
        __CLR4_5_2njlnjllvicmcf0.R.inc(30868);node.getArgument().accept((SWRLObjectVisitor) this);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30869);addTriple(node, ARGUMENT_1.getIRI(), node.getArgument());
    }finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull SWRLDataRangeAtom node) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(30870);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30871);translateAnonymousNode(node);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30872);addTriple(node, RDF_TYPE.getIRI(), DATA_RANGE_ATOM.getIRI());
        __CLR4_5_2njlnjllvicmcf0.R.inc(30873);node.getPredicate().accept(this);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30874);addTriple(node, DATA_RANGE.getIRI(), node.getPredicate());
        __CLR4_5_2njlnjllvicmcf0.R.inc(30875);node.getArgument().accept((SWRLObjectVisitor) this);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30876);addTriple(node, ARGUMENT_1.getIRI(), node.getArgument());
    }finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull SWRLObjectPropertyAtom node) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(30877);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30878);translateAnonymousNode(node);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30879);addTriple(node, RDF_TYPE.getIRI(), INDIVIDUAL_PROPERTY_ATOM.getIRI());
        __CLR4_5_2njlnjllvicmcf0.R.inc(30880);node.getPredicate().accept(this);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30881);addTriple(node, PROPERTY_PREDICATE.getIRI(), node.getPredicate());
        __CLR4_5_2njlnjllvicmcf0.R.inc(30882);node.getFirstArgument().accept((SWRLObjectVisitor) this);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30883);addTriple(node, ARGUMENT_1.getIRI(), node.getFirstArgument());
        __CLR4_5_2njlnjllvicmcf0.R.inc(30884);node.getSecondArgument().accept((SWRLObjectVisitor) this);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30885);addTriple(node, ARGUMENT_2.getIRI(), node.getSecondArgument());
    }finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull SWRLDataPropertyAtom node) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(30886);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30887);translateAnonymousNode(node);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30888);addTriple(node, RDF_TYPE.getIRI(), DATAVALUED_PROPERTY_ATOM.getIRI());
        __CLR4_5_2njlnjllvicmcf0.R.inc(30889);node.getPredicate().accept(this);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30890);addTriple(node, PROPERTY_PREDICATE.getIRI(), node.getPredicate());
        __CLR4_5_2njlnjllvicmcf0.R.inc(30891);node.getFirstArgument().accept((SWRLObjectVisitor) this);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30892);addTriple(node, ARGUMENT_1.getIRI(), node.getFirstArgument());
        __CLR4_5_2njlnjllvicmcf0.R.inc(30893);node.getSecondArgument().accept((SWRLObjectVisitor) this);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30894);addTriple(node, ARGUMENT_2.getIRI(), node.getSecondArgument());
    }finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull SWRLBuiltInAtom node) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(30895);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30896);translateAnonymousNode(node);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30897);addTriple(node, RDF_TYPE.getIRI(), BUILT_IN_ATOM.getIRI());
        __CLR4_5_2njlnjllvicmcf0.R.inc(30898);addTriple(node, BUILT_IN.getIRI(), node.getPredicate());
        __CLR4_5_2njlnjllvicmcf0.R.inc(30899);addTriple(getResourceNode(node.getPredicate()), getPredicateNode(RDF_TYPE.getIRI()), getResourceNode(
            BUILT_IN_CLASS.getIRI()));
        __CLR4_5_2njlnjllvicmcf0.R.inc(30900);addTriple(getResourceNode(node), getPredicateNode(ARGUMENTS.getIRI()), translateList(new ArrayList<>(node
            .getArguments())));
    }finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull SWRLDifferentIndividualsAtom node) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(30901);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30902);translateAnonymousNode(node);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30903);addTriple(node, RDF_TYPE.getIRI(), DIFFERENT_INDIVIDUALS_ATOM.getIRI());
        __CLR4_5_2njlnjllvicmcf0.R.inc(30904);node.getFirstArgument().accept((SWRLObjectVisitor) this);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30905);addTriple(node, ARGUMENT_1.getIRI(), node.getFirstArgument());
        __CLR4_5_2njlnjllvicmcf0.R.inc(30906);node.getSecondArgument().accept((SWRLObjectVisitor) this);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30907);addTriple(node, ARGUMENT_2.getIRI(), node.getSecondArgument());
    }finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull SWRLSameIndividualAtom node) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(30908);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30909);translateAnonymousNode(node);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30910);addTriple(node, RDF_TYPE.getIRI(), SAME_INDIVIDUAL_ATOM.getIRI());
        __CLR4_5_2njlnjllvicmcf0.R.inc(30911);node.getFirstArgument().accept((SWRLObjectVisitor) this);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30912);addTriple(node, ARGUMENT_1.getIRI(), node.getFirstArgument());
        __CLR4_5_2njlnjllvicmcf0.R.inc(30913);node.getSecondArgument().accept((SWRLObjectVisitor) this);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30914);addTriple(node, ARGUMENT_2.getIRI(), node.getSecondArgument());
    }finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull SWRLVariable node) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(30915);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30916);if ((((!nodeMap.containsKey(node))&&(__CLR4_5_2njlnjllvicmcf0.R.iget(30917)!=0|true))||(__CLR4_5_2njlnjllvicmcf0.R.iget(30918)==0&false))) {{
            __CLR4_5_2njlnjllvicmcf0.R.inc(30919);nodeMap.put(node, getResourceNode(node.getIRI()));
        }
        }__CLR4_5_2njlnjllvicmcf0.R.inc(30920);if ((((!ont.containsIndividualInSignature(node.getIRI()))&&(__CLR4_5_2njlnjllvicmcf0.R.iget(30921)!=0|true))||(__CLR4_5_2njlnjllvicmcf0.R.iget(30922)==0&false))) {{
            __CLR4_5_2njlnjllvicmcf0.R.inc(30923);addTriple(node, RDF_TYPE.getIRI(), VARIABLE.getIRI());
        }
    }}finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull SWRLIndividualArgument node) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(30924);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30925);node.getIndividual().accept(this);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30926);if ((((!nodeMap.containsKey(node))&&(__CLR4_5_2njlnjllvicmcf0.R.iget(30927)!=0|true))||(__CLR4_5_2njlnjllvicmcf0.R.iget(30928)==0&false))) {{
            __CLR4_5_2njlnjllvicmcf0.R.inc(30929);nodeMap.put(node, nodeMap.get(node.getIndividual()));
        }
    }}finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull SWRLLiteralArgument node) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(30930);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30931);node.getLiteral().accept(this);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30932);if ((((!nodeMap.containsKey(node))&&(__CLR4_5_2njlnjllvicmcf0.R.iget(30933)!=0|true))||(__CLR4_5_2njlnjllvicmcf0.R.iget(30934)==0&false))) {{
            __CLR4_5_2njlnjllvicmcf0.R.inc(30935);nodeMap.put(node, nodeMap.get(node.getLiteral()));
        }
    }}finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    // Methods to add triples
    /** Maps Objects to nodes. */
    @Nonnull private final Map<OWLObject, N> nodeMap = new HashMap<>();

    private void addSingleTripleAxiom(@Nonnull OWLAxiom ax, @Nonnull OWLObject subject, @Nonnull IRI pred,
        @Nonnull OWLObject obj) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(30936);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30937);addSingleTripleAxiom(ax, getResourceNode(subject), getPredicateNode(pred), getNode(obj));
    }finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    private void addSingleTripleAxiom(@Nonnull OWLAxiom ax, @Nonnull OWLObject subject, @Nonnull IRI pred,
        @Nonnull IRI obj) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(30938);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30939);addSingleTripleAxiom(ax, getResourceNode(subject), getPredicateNode(pred), getResourceNode(obj));
    }finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    private void addSingleTripleAxiom(@Nonnull OWLAxiom ax, @Nonnull OWLObject subj, @Nonnull IRI pred,
        @Nonnull List<? extends OWLObject> obj) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(30940);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30941);addSingleTripleAxiom(ax, getResourceNode(subj), getPredicateNode(pred), translateList(obj));
    }finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    private void addSingleTripleAxiom(@Nonnull OWLAxiom ax, @Nonnull OWLObject subj, @Nonnull OWLObject pred,
        @Nonnull OWLObject obj) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(30942);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30943);addSingleTripleAxiom(ax, getResourceNode(subj), getPredicateNode(pred), getNode(obj));
    }finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    /**
     * Adds the representation of an axiom to the RDF graph where the axiom has
     * a SINGLE MAIN TRIPLE (specified by the subject, predicate, object
     * parameters). The triple specified by the subject, predicate and object
     * parameters will be added to the graph. If the axiom has any annotations
     * on it then extra triples will be added. These will consist of three
     * triples, that "reify" (not in the RDF sense) the specified triple using
     * the OWL 2 annotation vocabulary: owl:annotatedSource,
     * owl:annotatedProperty, owl:annotatedTarget, and other triples to encode
     * the annotations.
     * 
     * @param ax
     *        The axiom that the triple specified as subject, pred, obj
     *        represents.
     * @param subject
     *        The subject of the triple representing the axiom
     * @param predicate
     *        The predicate of the triple representing the axiom
     * @param object
     *        The object of the triple representing the axiom
     */
    private void addSingleTripleAxiom(@Nonnull OWLAxiom ax, @Nonnull R subject, @Nonnull P predicate,
        @Nonnull N object) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(30944);
        // Base triple
        __CLR4_5_2njlnjllvicmcf0.R.inc(30945);addTriple(subject, predicate, object);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30946);if ((((ax.getAnnotations().isEmpty())&&(__CLR4_5_2njlnjllvicmcf0.R.iget(30947)!=0|true))||(__CLR4_5_2njlnjllvicmcf0.R.iget(30948)==0&false))) {{
            __CLR4_5_2njlnjllvicmcf0.R.inc(30949);return;
        }
        // The axiom has annotations and we therefore need to reify the axiom in
        // order to add the annotations
        }__CLR4_5_2njlnjllvicmcf0.R.inc(30950);translateAnonymousNode(ax);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30951);addTriple(getResourceNode(ax), getPredicateNode(RDF_TYPE.getIRI()), getResourceNode(OWL_AXIOM.getIRI()));
        __CLR4_5_2njlnjllvicmcf0.R.inc(30952);addTriple(getResourceNode(ax), getPredicateNode(OWL_ANNOTATED_SOURCE.getIRI()), subject);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30953);addTriple(getResourceNode(ax), getPredicateNode(OWL_ANNOTATED_PROPERTY.getIRI()), predicate);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30954);addTriple(getResourceNode(ax), getPredicateNode(OWL_ANNOTATED_TARGET.getIRI()), object);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30955);translateAnnotations(ax);
    }finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    private void translateAnnotations(@Nonnull OWLAxiom ax) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(30956);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30957);translateAnonymousNode(ax);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30958);for (OWLAnnotation anno : sort(ax.getAnnotations())) {{
            assert (((anno != null)&&(__CLR4_5_2njlnjllvicmcf0.R.iget(30959)!=0|true))||(__CLR4_5_2njlnjllvicmcf0.R.iget(30960)==0&false));
            __CLR4_5_2njlnjllvicmcf0.R.inc(30961);translateAnnotation(ax, anno);
        }
    }}finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    /**
     * Translates an annotation on a given subject. This method implements the
     * TANN(ann, y) translation in the spec
     * 
     * @param subject
     *        The subject of the annotation
     * @param annotation
     *        The annotation
     */
    private void translateAnnotation(@Nonnull OWLObject subject, @Nonnull OWLAnnotation annotation) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(30962);
        // We first add the base triple
        __CLR4_5_2njlnjllvicmcf0.R.inc(30963);addTriple(subject, annotation.getProperty().getIRI(), annotation.getValue());
        // if the annotation has a blank node as subject, add the triples here
        __CLR4_5_2njlnjllvicmcf0.R.inc(30964);if ((((annotation.getValue() instanceof OWLAnonymousIndividual)&&(__CLR4_5_2njlnjllvicmcf0.R.iget(30965)!=0|true))||(__CLR4_5_2njlnjllvicmcf0.R.iget(30966)==0&false))) {{
            __CLR4_5_2njlnjllvicmcf0.R.inc(30967);OWLAnonymousIndividual ind = (OWLAnonymousIndividual) annotation.getValue();
            __CLR4_5_2njlnjllvicmcf0.R.inc(30968);translateAnonymousNode(ind);
            __CLR4_5_2njlnjllvicmcf0.R.inc(30969);processIfAnonymous(ind);
        }
        // If the annotation doesn't have annotations on it then we're done
        }__CLR4_5_2njlnjllvicmcf0.R.inc(30970);Collection<OWLAnnotation> annotations = annotation.getAnnotations();
        __CLR4_5_2njlnjllvicmcf0.R.inc(30971);if ((((annotations.isEmpty())&&(__CLR4_5_2njlnjllvicmcf0.R.iget(30972)!=0|true))||(__CLR4_5_2njlnjllvicmcf0.R.iget(30973)==0&false))) {{
            __CLR4_5_2njlnjllvicmcf0.R.inc(30974);return;
        }
        // The annotation has annotations on it so we need to reify the
        // annotation
        // The main node is the annotation, it is typed as an annotation
        }__CLR4_5_2njlnjllvicmcf0.R.inc(30975);translateAnonymousNode(annotation);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30976);addTriple(annotation, RDF_TYPE.getIRI(), OWL_ANNOTATION.getIRI());
        __CLR4_5_2njlnjllvicmcf0.R.inc(30977);addTriple(annotation, OWL_ANNOTATED_SOURCE.getIRI(), subject);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30978);addTriple(annotation, OWL_ANNOTATED_PROPERTY.getIRI(), annotation.getProperty().getIRI());
        __CLR4_5_2njlnjllvicmcf0.R.inc(30979);addTriple(annotation, OWL_ANNOTATED_TARGET.getIRI(), annotation.getValue());
        __CLR4_5_2njlnjllvicmcf0.R.inc(30980);for (OWLAnnotation anno : sort(annotations)) {{
            assert (((anno != null)&&(__CLR4_5_2njlnjllvicmcf0.R.iget(30981)!=0|true))||(__CLR4_5_2njlnjllvicmcf0.R.iget(30982)==0&false));
            __CLR4_5_2njlnjllvicmcf0.R.inc(30983);translateAnnotation(annotation, anno);
        }
    }}finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    @Override
    public void visit(OWLAnnotation node) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(30984);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30985);throw new OWLRuntimeException(
            "The translator should not be used directly on instances of OWLAnnotation because an annotation cannot be translated without a subject.");
    }finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    private void translateAnonymousNode(@Nonnull OWLObject object) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(30986);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30987);nodeMap.put(object, getAnonymousNode(object));
    }finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    /**
     * @param object
     *        that has already been mapped
     * @param <T>
     *        type needed
     * @return mapped node, or null if the node is absent
     */
    public <T extends N> T getMappedNode(OWLObject object) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(30988);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30989);return (T) nodeMap.get(object);
    }finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    public void addTriple(R subject, IRI pred, IRI object) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(30990);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30991);addTriple(subject, getPredicateNode(pred), getResourceNode(object));
    }finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    public void addTriple(R subject, IRI pred, OWLObject object) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(30992);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30993);addTriple(subject, getPredicateNode(pred), getNode(object));
    }finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    /**
     * Gets a resource that has a IRI.
     * 
     * @param iri
     *        The IRI of the resource
     * @return The resource with the specified IRI
     */
    @Nonnull
    protected abstract R getResourceNode(@Nonnull IRI iri);

    @Nonnull
    protected abstract P getPredicateNode(@Nonnull IRI iri);

    /**
     * Gets an anonymous resource.
     * 
     * @param key
     *        A key for the resource. For a given key identity, the resources
     *        that are returned should be equal and have the same hashcode.
     * @return The resource
     */
    @Nonnull
    protected abstract R getAnonymousNode(@Nonnull Object key);

    /**
     * Gets a fresh anonymous resource.
     * 
     * @param key
     *        A key for the resource. Each call will create a new node; nodes
     *        cannot clash.
     * @return The resource
     */
    @Nonnull
    protected abstract R getAnonymousNodeForExpressions(@Nonnull Object key);

    @Nonnull
    protected abstract L getLiteralNode(@Nonnull OWLLiteral literal);

    protected abstract void addTriple(@Nonnull R subject, @Nonnull P pred, @Nonnull N object);

    @Nonnull
    @SuppressWarnings("unchecked")
    private R getResourceNode(@Nonnull OWLObject object) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(30994);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30995);R r = (R) nodeMap.get(object);
        __CLR4_5_2njlnjllvicmcf0.R.inc(30996);if ((((r == null)&&(__CLR4_5_2njlnjllvicmcf0.R.iget(30997)!=0|true))||(__CLR4_5_2njlnjllvicmcf0.R.iget(30998)==0&false))) {{
            __CLR4_5_2njlnjllvicmcf0.R.inc(30999);object.accept(this);
            __CLR4_5_2njlnjllvicmcf0.R.inc(31000);r = (R) nodeMap.get(object);
            __CLR4_5_2njlnjllvicmcf0.R.inc(31001);if ((((r == null)&&(__CLR4_5_2njlnjllvicmcf0.R.iget(31002)!=0|true))||(__CLR4_5_2njlnjllvicmcf0.R.iget(31003)==0&false))) {{
                __CLR4_5_2njlnjllvicmcf0.R.inc(31004);throw new IllegalStateException("Node is null!");
            }
        }}
        }__CLR4_5_2njlnjllvicmcf0.R.inc(31005);return r;
    }finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    @Nonnull
    @SuppressWarnings("unchecked")
    private P getPredicateNode(@Nonnull OWLObject object) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(31006);
        __CLR4_5_2njlnjllvicmcf0.R.inc(31007);P p = (P) nodeMap.get(object);
        __CLR4_5_2njlnjllvicmcf0.R.inc(31008);if ((((p == null)&&(__CLR4_5_2njlnjllvicmcf0.R.iget(31009)!=0|true))||(__CLR4_5_2njlnjllvicmcf0.R.iget(31010)==0&false))) {{
            __CLR4_5_2njlnjllvicmcf0.R.inc(31011);object.accept(this);
            __CLR4_5_2njlnjllvicmcf0.R.inc(31012);p = (P) nodeMap.get(object);
            __CLR4_5_2njlnjllvicmcf0.R.inc(31013);if ((((p == null)&&(__CLR4_5_2njlnjllvicmcf0.R.iget(31014)!=0|true))||(__CLR4_5_2njlnjllvicmcf0.R.iget(31015)==0&false))) {{
                __CLR4_5_2njlnjllvicmcf0.R.inc(31016);throw new IllegalStateException("Node is null!");
            }
        }}
        }__CLR4_5_2njlnjllvicmcf0.R.inc(31017);return p;
    }finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    @Nonnull
    private N getNode(@Nonnull OWLObject obj) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(31018);
        __CLR4_5_2njlnjllvicmcf0.R.inc(31019);N node = nodeMap.get(obj);
        __CLR4_5_2njlnjllvicmcf0.R.inc(31020);if ((((node == null)&&(__CLR4_5_2njlnjllvicmcf0.R.iget(31021)!=0|true))||(__CLR4_5_2njlnjllvicmcf0.R.iget(31022)==0&false))) {{
            __CLR4_5_2njlnjllvicmcf0.R.inc(31023);obj.accept(this);
            __CLR4_5_2njlnjllvicmcf0.R.inc(31024);node = nodeMap.get(obj);
            __CLR4_5_2njlnjllvicmcf0.R.inc(31025);if ((((node == null)&&(__CLR4_5_2njlnjllvicmcf0.R.iget(31026)!=0|true))||(__CLR4_5_2njlnjllvicmcf0.R.iget(31027)==0&false))) {{
                __CLR4_5_2njlnjllvicmcf0.R.inc(31028);throw new IllegalStateException("Node is null. Attempting to get node for " + obj);
            }
        }}
        }__CLR4_5_2njlnjllvicmcf0.R.inc(31029);return node;
    }finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    @Nonnull
    private R translateList(@Nonnull List<? extends OWLObject> list) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(31030);
        __CLR4_5_2njlnjllvicmcf0.R.inc(31031);return translateList(list, RDF_LIST.getIRI());
    }finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    @Nonnull
    private R translateList(@Nonnull List<? extends OWLObject> list, @Nonnull IRI listType) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(31032);
        __CLR4_5_2njlnjllvicmcf0.R.inc(31033);if ((((list.isEmpty())&&(__CLR4_5_2njlnjllvicmcf0.R.iget(31034)!=0|true))||(__CLR4_5_2njlnjllvicmcf0.R.iget(31035)==0&false))) {{
            __CLR4_5_2njlnjllvicmcf0.R.inc(31036);return getResourceNode(RDF_NIL.getIRI());
        }
        }__CLR4_5_2njlnjllvicmcf0.R.inc(31037);R main = getResourceNode(RDF_NIL.getIRI());
        __CLR4_5_2njlnjllvicmcf0.R.inc(31038);int listSize = list.size() - 1;
        __CLR4_5_2njlnjllvicmcf0.R.inc(31039);for (int i = listSize; (((i >= 0)&&(__CLR4_5_2njlnjllvicmcf0.R.iget(31040)!=0|true))||(__CLR4_5_2njlnjllvicmcf0.R.iget(31041)==0&false)); i--) {{
            __CLR4_5_2njlnjllvicmcf0.R.inc(31042);R anonNode = getAnonymousNode(list.subList(i, listSize));
            __CLR4_5_2njlnjllvicmcf0.R.inc(31043);addTriple(anonNode, getPredicateNode(RDF_TYPE.getIRI()), getResourceNode(listType));
            __CLR4_5_2njlnjllvicmcf0.R.inc(31044);@Nonnull OWLObject obj = list.get(i);
            __CLR4_5_2njlnjllvicmcf0.R.inc(31045);addTriple(anonNode, getPredicateNode(RDF_FIRST.getIRI()), getNode(obj));
            __CLR4_5_2njlnjllvicmcf0.R.inc(31046);addTriple(anonNode, getPredicateNode(RDF_REST.getIRI()), main);
            __CLR4_5_2njlnjllvicmcf0.R.inc(31047);main = anonNode;
        }
        }__CLR4_5_2njlnjllvicmcf0.R.inc(31048);return main;
    }finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    private void addTriple(@Nonnull OWLObject subject, @Nonnull IRI pred, @Nonnull IRI object) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(31049);
        __CLR4_5_2njlnjllvicmcf0.R.inc(31050);addTriple(getResourceNode(subject), getPredicateNode(pred), getResourceNode(object));
    }finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    private void addTriple(@Nonnull OWLObject subject, @Nonnull IRI pred, @Nonnull OWLObject object) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(31051);
        __CLR4_5_2njlnjllvicmcf0.R.inc(31052);addTriple(getResourceNode(subject), getPredicateNode(pred), getNode(object));
    }finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    private void addListTriples(@Nonnull OWLObject subject, @Nonnull IRI pred,
        @Nonnull Set<? extends OWLObject> objects) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(31053);
        __CLR4_5_2njlnjllvicmcf0.R.inc(31054);ArrayList<OWLObject> list = new ArrayList<>(objects);
        __CLR4_5_2njlnjllvicmcf0.R.inc(31055);Collections.sort(list);
        __CLR4_5_2njlnjllvicmcf0.R.inc(31056);addTriple(getResourceNode(subject), getPredicateNode(pred), translateList(list));
    }finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    private void addTriple(@Nonnull OWLObject subject, @Nonnull IRI pred, @Nonnull Set<? extends OWLObject> objects,
        @Nonnull IRI listType) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(31057);
        __CLR4_5_2njlnjllvicmcf0.R.inc(31058);addTriple(getResourceNode(subject), getPredicateNode(pred), translateList(new ArrayList<>(objects), listType));
    }finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    @Nonnull
    private OWLLiteral toTypedConstant(int i) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(31059);
        __CLR4_5_2njlnjllvicmcf0.R.inc(31060);return manager.getOWLDataFactory().getOWLLiteral(Integer.toString(i), manager.getOWLDataFactory()
            .getOWLDatatype(XSDVocabulary.NON_NEGATIVE_INTEGER.getIRI()));
    }finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    private void processIfAnonymous(@Nonnull Set<OWLIndividual> inds, OWLAxiom root) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(31061);
        __CLR4_5_2njlnjllvicmcf0.R.inc(31062);for (OWLIndividual ind : sortOptionally(inds)) {{
            assert (((ind != null)&&(__CLR4_5_2njlnjllvicmcf0.R.iget(31063)!=0|true))||(__CLR4_5_2njlnjllvicmcf0.R.iget(31064)==0&false));
            __CLR4_5_2njlnjllvicmcf0.R.inc(31065);processIfAnonymous(ind, root);
        }
    }}finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    @Nonnull private final Set<OWLIndividual> currentIndividuals = new HashSet<>();

    private void processIfAnonymous(@Nonnull OWLIndividual ind, @Nullable OWLAxiom root) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(31066);
        __CLR4_5_2njlnjllvicmcf0.R.inc(31067);if ((((!currentIndividuals.contains(ind))&&(__CLR4_5_2njlnjllvicmcf0.R.iget(31068)!=0|true))||(__CLR4_5_2njlnjllvicmcf0.R.iget(31069)==0&false))) {{
            __CLR4_5_2njlnjllvicmcf0.R.inc(31070);currentIndividuals.add(ind);
            __CLR4_5_2njlnjllvicmcf0.R.inc(31071);if ((((ind.isAnonymous())&&(__CLR4_5_2njlnjllvicmcf0.R.iget(31072)!=0|true))||(__CLR4_5_2njlnjllvicmcf0.R.iget(31073)==0&false))) {{
                __CLR4_5_2njlnjllvicmcf0.R.inc(31074);for (OWLAxiom ax : getSortedIndividualAxioms(ind)) {{
                    __CLR4_5_2njlnjllvicmcf0.R.inc(31075);if ((((root == null || !root.equals(ax))&&(__CLR4_5_2njlnjllvicmcf0.R.iget(31076)!=0|true))||(__CLR4_5_2njlnjllvicmcf0.R.iget(31077)==0&false))) {{
                        __CLR4_5_2njlnjllvicmcf0.R.inc(31078);ax.accept(this);
                    }
                }}
                }__CLR4_5_2njlnjllvicmcf0.R.inc(31079);for (OWLAnnotationAssertionAxiom ax : sort(getAnnotationAssertionsForAnonymous(ind))) {{
                    __CLR4_5_2njlnjllvicmcf0.R.inc(31080);ax.accept(this);
                }
            }}
            }__CLR4_5_2njlnjllvicmcf0.R.inc(31081);currentIndividuals.remove(ind);
        }
    }}finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    private void processIfAnonymous(@Nonnull OWLIndividual ind) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(31082);
        __CLR4_5_2njlnjllvicmcf0.R.inc(31083);if ((((!currentIndividuals.contains(ind))&&(__CLR4_5_2njlnjllvicmcf0.R.iget(31084)!=0|true))||(__CLR4_5_2njlnjllvicmcf0.R.iget(31085)==0&false))) {{
            __CLR4_5_2njlnjllvicmcf0.R.inc(31086);currentIndividuals.add(ind);
            __CLR4_5_2njlnjllvicmcf0.R.inc(31087);if ((((ind.isAnonymous())&&(__CLR4_5_2njlnjllvicmcf0.R.iget(31088)!=0|true))||(__CLR4_5_2njlnjllvicmcf0.R.iget(31089)==0&false))) {{
                __CLR4_5_2njlnjllvicmcf0.R.inc(31090);for (OWLAxiom ax : getSortedIndividualAxioms(ind)) {{
                    __CLR4_5_2njlnjllvicmcf0.R.inc(31091);ax.accept(this);
                }
                }__CLR4_5_2njlnjllvicmcf0.R.inc(31092);for (OWLAnnotationAssertionAxiom ax : sort(getAnnotationAssertionsForAnonymous(ind))) {{
                    __CLR4_5_2njlnjllvicmcf0.R.inc(31093);ax.accept(this);
                }
            }}
            }__CLR4_5_2njlnjllvicmcf0.R.inc(31094);currentIndividuals.remove(ind);
        }
    }}finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    @Nonnull
    private static <T extends OWLObject> List<T> sort(Collection<T> axioms) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(31095);
        __CLR4_5_2njlnjllvicmcf0.R.inc(31096);return sortOptionally(axioms);
    }finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    @Nonnull
    private Set<OWLAnnotationAssertionAxiom> getAnnotationAssertionsForAnonymous(@Nonnull OWLIndividual ind) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(31097);
        __CLR4_5_2njlnjllvicmcf0.R.inc(31098);OWLAnonymousIndividual owlAnonymousIndividual = ind.asOWLAnonymousIndividual();
        __CLR4_5_2njlnjllvicmcf0.R.inc(31099);return ont.getAnnotationAssertionAxioms(owlAnonymousIndividual);
    }finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    @Nonnull
    private List<OWLIndividualAxiom> getSortedIndividualAxioms(@Nonnull OWLIndividual ind) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(31100);
        __CLR4_5_2njlnjllvicmcf0.R.inc(31101);return sort(ont.getAxioms(ind, Imports.EXCLUDED));
    }finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    private void addPairwise(@Nonnull OWLAxiom axiom, @Nonnull Collection<? extends OWLObject> objects,
        @Nonnull IRI iri) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(31102);
        __CLR4_5_2njlnjllvicmcf0.R.inc(31103);List<? extends OWLObject> objectList = new ArrayList<>(objects);
        __CLR4_5_2njlnjllvicmcf0.R.inc(31104);Collections.sort(objectList);
        __CLR4_5_2njlnjllvicmcf0.R.inc(31105);for (int i = 0; (((i < objectList.size())&&(__CLR4_5_2njlnjllvicmcf0.R.iget(31106)!=0|true))||(__CLR4_5_2njlnjllvicmcf0.R.iget(31107)==0&false)); i++) {{
            __CLR4_5_2njlnjllvicmcf0.R.inc(31108);for (int j = i; (((j < objectList.size())&&(__CLR4_5_2njlnjllvicmcf0.R.iget(31109)!=0|true))||(__CLR4_5_2njlnjllvicmcf0.R.iget(31110)==0&false)); j++) {{
                __CLR4_5_2njlnjllvicmcf0.R.inc(31111);if ((((i != j)&&(__CLR4_5_2njlnjllvicmcf0.R.iget(31112)!=0|true))||(__CLR4_5_2njlnjllvicmcf0.R.iget(31113)==0&false))) {{
                    __CLR4_5_2njlnjllvicmcf0.R.inc(31114);addSingleTripleAxiom(axiom, objectList.get(i), iri, objectList.get(j));
                }
            }}
        }}
    }}finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    /**
     * Renders a set of class expressions in a pairwise manner using the
     * specified IRI. It is assumed that the relationship described by the IRI
     * (e.g. disjointWith) is symmetric. The method delegates to the
     * {@code addPairwise} method after sorting the class expressions so that
     * named classes appear first.
     * 
     * @param axiom
     *        The axiom which will dictate which axiom annotation get rendered
     * @param classExpressions
     *        The set of class expressions to be rendered.
     * @param iri
     *        The IRI which describes the relationship between pairs of class
     *        expressions.
     */
    private void addPairwiseClassExpressions(@Nonnull OWLAxiom axiom, @Nonnull Set<OWLClassExpression> classExpressions,
        @Nonnull IRI iri) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(31115);
        __CLR4_5_2njlnjllvicmcf0.R.inc(31116);addPairwise(axiom, classExpressions, iri);
    }finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    /**
     * Adds triples to strong type an entity. Triples are only added if the
     * useStrongTyping flag is set to {@code true} and the entity is not a built
     * in entity.
     * 
     * @param entity
     *        The entity for which strong typing triples should be added.
     */
    private void addStrongTyping(@Nonnull OWLEntity entity) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(31117);
        __CLR4_5_2njlnjllvicmcf0.R.inc(31118);if ((((!useStrongTyping)&&(__CLR4_5_2njlnjllvicmcf0.R.iget(31119)!=0|true))||(__CLR4_5_2njlnjllvicmcf0.R.iget(31120)==0&false))) {{
            __CLR4_5_2njlnjllvicmcf0.R.inc(31121);return;
        }
        }__CLR4_5_2njlnjllvicmcf0.R.inc(31122);if ((((!OWLDocumentFormatImpl.isMissingType(entity, ont))&&(__CLR4_5_2njlnjllvicmcf0.R.iget(31123)!=0|true))||(__CLR4_5_2njlnjllvicmcf0.R.iget(31124)==0&false))) {{
            __CLR4_5_2njlnjllvicmcf0.R.inc(31125);return;
        }
        }__CLR4_5_2njlnjllvicmcf0.R.inc(31126);addTriple(entity, RDF_TYPE.getIRI(), entity.accept(OWLEntityTypeProvider.INSTANCE));
    }finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

    /** Visits entities and returns their RDF type. */
    private static class OWLEntityTypeProvider implements OWLEntityVisitorEx<IRI> {

        @Nonnull public static final OWLEntityTypeProvider INSTANCE = new OWLEntityTypeProvider();

        @Override
        public IRI visit(OWLClass cls) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(31127);
            __CLR4_5_2njlnjllvicmcf0.R.inc(31128);return OWL_CLASS.getIRI();
        }finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

        @Override
        public IRI visit(OWLObjectProperty property) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(31129);
            __CLR4_5_2njlnjllvicmcf0.R.inc(31130);return OWL_OBJECT_PROPERTY.getIRI();
        }finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

        @Override
        public IRI visit(OWLDataProperty property) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(31131);
            __CLR4_5_2njlnjllvicmcf0.R.inc(31132);return OWL_DATA_PROPERTY.getIRI();
        }finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

        @Override
        public IRI visit(OWLNamedIndividual individual) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(31133);
            __CLR4_5_2njlnjllvicmcf0.R.inc(31134);return OWL_NAMED_INDIVIDUAL.getIRI();
        }finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

        @Override
        public IRI visit(OWLDatatype datatype) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(31135);
            __CLR4_5_2njlnjllvicmcf0.R.inc(31136);return RDFS_DATATYPE.getIRI();
        }finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}

        @Override
        public IRI visit(OWLAnnotationProperty property) {try{__CLR4_5_2njlnjllvicmcf0.R.inc(31137);
            __CLR4_5_2njlnjllvicmcf0.R.inc(31138);return OWL_ANNOTATION_PROPERTY.getIRI();
        }finally{__CLR4_5_2njlnjllvicmcf0.R.flushNeeded();}}
    }
}
