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
package org.semanticweb.owlapi.util;

import static org.semanticweb.owlapi.util.OWLAPIPreconditions.checkNotNull;

import java.util.Set;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.model.OWLAnnotationAssertionAxiom;
import org.semanticweb.owlapi.model.OWLAnnotationPropertyDomainAxiom;
import org.semanticweb.owlapi.model.OWLAnnotationPropertyRangeAxiom;
import org.semanticweb.owlapi.model.OWLAsymmetricObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.OWLAxiomVisitor;
import org.semanticweb.owlapi.model.OWLClassAssertionAxiom;
import org.semanticweb.owlapi.model.OWLClassExpression;
import org.semanticweb.owlapi.model.OWLDataPropertyAssertionAxiom;
import org.semanticweb.owlapi.model.OWLDataPropertyDomainAxiom;
import org.semanticweb.owlapi.model.OWLDataPropertyRangeAxiom;
import org.semanticweb.owlapi.model.OWLDatatypeDefinitionAxiom;
import org.semanticweb.owlapi.model.OWLDeclarationAxiom;
import org.semanticweb.owlapi.model.OWLDifferentIndividualsAxiom;
import org.semanticweb.owlapi.model.OWLDisjointClassesAxiom;
import org.semanticweb.owlapi.model.OWLDisjointDataPropertiesAxiom;
import org.semanticweb.owlapi.model.OWLDisjointObjectPropertiesAxiom;
import org.semanticweb.owlapi.model.OWLDisjointUnionAxiom;
import org.semanticweb.owlapi.model.OWLEquivalentClassesAxiom;
import org.semanticweb.owlapi.model.OWLEquivalentDataPropertiesAxiom;
import org.semanticweb.owlapi.model.OWLEquivalentObjectPropertiesAxiom;
import org.semanticweb.owlapi.model.OWLFunctionalDataPropertyAxiom;
import org.semanticweb.owlapi.model.OWLFunctionalObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLHasKeyAxiom;
import org.semanticweb.owlapi.model.OWLInverseFunctionalObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLInverseObjectPropertiesAxiom;
import org.semanticweb.owlapi.model.OWLIrreflexiveObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLNegativeDataPropertyAssertionAxiom;
import org.semanticweb.owlapi.model.OWLNegativeObjectPropertyAssertionAxiom;
import org.semanticweb.owlapi.model.OWLObject;
import org.semanticweb.owlapi.model.OWLObjectPropertyAssertionAxiom;
import org.semanticweb.owlapi.model.OWLObjectPropertyDomainAxiom;
import org.semanticweb.owlapi.model.OWLObjectPropertyRangeAxiom;
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

/**
 * Provides the object that is the subject of an axiom.
 * 
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.2.0
 */
public class AxiomSubjectProvider implements OWLAxiomVisitor {public static class __CLR4_5_24zy4zylvickp8e{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0061\u0070\u0069\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237201267L,8589935092L,6567,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private OWLObject subject;

    /**
     * @param axiom
     *        the axiom to visit
     * @return the subject
     */
    public OWLObject getSubject(@Nonnull OWLAxiom axiom) {try{__CLR4_5_24zy4zylvickp8e.R.inc(6478);
        __CLR4_5_24zy4zylvickp8e.R.inc(6479);checkNotNull(axiom, "axiom cannot be null");
        __CLR4_5_24zy4zylvickp8e.R.inc(6480);axiom.accept(this);
        __CLR4_5_24zy4zylvickp8e.R.inc(6481);return subject;
    }finally{__CLR4_5_24zy4zylvickp8e.R.flushNeeded();}}

    @Override
    public void visit(OWLSubClassOfAxiom axiom) {try{__CLR4_5_24zy4zylvickp8e.R.inc(6482);
        __CLR4_5_24zy4zylvickp8e.R.inc(6483);subject = axiom.getSubClass();
    }finally{__CLR4_5_24zy4zylvickp8e.R.flushNeeded();}}

    @Override
    public void visit(OWLNegativeObjectPropertyAssertionAxiom axiom) {try{__CLR4_5_24zy4zylvickp8e.R.inc(6484);
        __CLR4_5_24zy4zylvickp8e.R.inc(6485);subject = axiom.getSubject();
    }finally{__CLR4_5_24zy4zylvickp8e.R.flushNeeded();}}

    @Override
    public void visit(OWLAsymmetricObjectPropertyAxiom axiom) {try{__CLR4_5_24zy4zylvickp8e.R.inc(6486);
        __CLR4_5_24zy4zylvickp8e.R.inc(6487);subject = axiom.getProperty();
    }finally{__CLR4_5_24zy4zylvickp8e.R.flushNeeded();}}

    @Override
    public void visit(OWLReflexiveObjectPropertyAxiom axiom) {try{__CLR4_5_24zy4zylvickp8e.R.inc(6488);
        __CLR4_5_24zy4zylvickp8e.R.inc(6489);subject = axiom.getProperty();
    }finally{__CLR4_5_24zy4zylvickp8e.R.flushNeeded();}}

    private static OWLClassExpression selectClassExpression(
            Set<OWLClassExpression> descs) {try{__CLR4_5_24zy4zylvickp8e.R.inc(6490);
        __CLR4_5_24zy4zylvickp8e.R.inc(6491);for (OWLClassExpression desc : descs) {{
            __CLR4_5_24zy4zylvickp8e.R.inc(6492);if ((((!desc.isAnonymous())&&(__CLR4_5_24zy4zylvickp8e.R.iget(6493)!=0|true))||(__CLR4_5_24zy4zylvickp8e.R.iget(6494)==0&false))) {{
                __CLR4_5_24zy4zylvickp8e.R.inc(6495);return desc;
            }
        }}
        }__CLR4_5_24zy4zylvickp8e.R.inc(6496);return descs.iterator().next();
    }finally{__CLR4_5_24zy4zylvickp8e.R.flushNeeded();}}

    @Override
    public void visit(OWLDisjointClassesAxiom axiom) {try{__CLR4_5_24zy4zylvickp8e.R.inc(6497);
        __CLR4_5_24zy4zylvickp8e.R.inc(6498);subject = selectClassExpression(axiom.getClassExpressions());
    }finally{__CLR4_5_24zy4zylvickp8e.R.flushNeeded();}}

    @Override
    public void visit(OWLDataPropertyDomainAxiom axiom) {try{__CLR4_5_24zy4zylvickp8e.R.inc(6499);
        __CLR4_5_24zy4zylvickp8e.R.inc(6500);subject = axiom.getProperty();
    }finally{__CLR4_5_24zy4zylvickp8e.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectPropertyDomainAxiom axiom) {try{__CLR4_5_24zy4zylvickp8e.R.inc(6501);
        __CLR4_5_24zy4zylvickp8e.R.inc(6502);subject = axiom.getProperty();
    }finally{__CLR4_5_24zy4zylvickp8e.R.flushNeeded();}}

    @Override
    public void visit(OWLEquivalentObjectPropertiesAxiom axiom) {try{__CLR4_5_24zy4zylvickp8e.R.inc(6503);
        __CLR4_5_24zy4zylvickp8e.R.inc(6504);subject = axiom.getProperties().iterator().next();
    }finally{__CLR4_5_24zy4zylvickp8e.R.flushNeeded();}}

    @Override
    public void visit(OWLNegativeDataPropertyAssertionAxiom axiom) {try{__CLR4_5_24zy4zylvickp8e.R.inc(6505);
        __CLR4_5_24zy4zylvickp8e.R.inc(6506);subject = axiom.getSubject();
    }finally{__CLR4_5_24zy4zylvickp8e.R.flushNeeded();}}

    @Override
    public void visit(OWLDifferentIndividualsAxiom axiom) {try{__CLR4_5_24zy4zylvickp8e.R.inc(6507);
        __CLR4_5_24zy4zylvickp8e.R.inc(6508);subject = axiom.getIndividuals().iterator().next();
    }finally{__CLR4_5_24zy4zylvickp8e.R.flushNeeded();}}

    @Override
    public void visit(OWLDisjointDataPropertiesAxiom axiom) {try{__CLR4_5_24zy4zylvickp8e.R.inc(6509);
        __CLR4_5_24zy4zylvickp8e.R.inc(6510);subject = axiom.getProperties().iterator().next();
    }finally{__CLR4_5_24zy4zylvickp8e.R.flushNeeded();}}

    @Override
    public void visit(OWLDisjointObjectPropertiesAxiom axiom) {try{__CLR4_5_24zy4zylvickp8e.R.inc(6511);
        __CLR4_5_24zy4zylvickp8e.R.inc(6512);subject = axiom.getProperties().iterator().next();
    }finally{__CLR4_5_24zy4zylvickp8e.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectPropertyRangeAxiom axiom) {try{__CLR4_5_24zy4zylvickp8e.R.inc(6513);
        __CLR4_5_24zy4zylvickp8e.R.inc(6514);subject = axiom.getProperty();
    }finally{__CLR4_5_24zy4zylvickp8e.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectPropertyAssertionAxiom axiom) {try{__CLR4_5_24zy4zylvickp8e.R.inc(6515);
        __CLR4_5_24zy4zylvickp8e.R.inc(6516);subject = axiom.getSubject();
    }finally{__CLR4_5_24zy4zylvickp8e.R.flushNeeded();}}

    @Override
    public void visit(OWLFunctionalObjectPropertyAxiom axiom) {try{__CLR4_5_24zy4zylvickp8e.R.inc(6517);
        __CLR4_5_24zy4zylvickp8e.R.inc(6518);subject = axiom.getProperty();
    }finally{__CLR4_5_24zy4zylvickp8e.R.flushNeeded();}}

    @Override
    public void visit(OWLSubObjectPropertyOfAxiom axiom) {try{__CLR4_5_24zy4zylvickp8e.R.inc(6519);
        __CLR4_5_24zy4zylvickp8e.R.inc(6520);subject = axiom.getSubProperty();
    }finally{__CLR4_5_24zy4zylvickp8e.R.flushNeeded();}}

    @Override
    public void visit(OWLDisjointUnionAxiom axiom) {try{__CLR4_5_24zy4zylvickp8e.R.inc(6521);
        __CLR4_5_24zy4zylvickp8e.R.inc(6522);subject = axiom.getOWLClass();
    }finally{__CLR4_5_24zy4zylvickp8e.R.flushNeeded();}}

    @Override
    public void visit(OWLDeclarationAxiom axiom) {try{__CLR4_5_24zy4zylvickp8e.R.inc(6523);
        __CLR4_5_24zy4zylvickp8e.R.inc(6524);subject = axiom.getEntity();
    }finally{__CLR4_5_24zy4zylvickp8e.R.flushNeeded();}}

    @Override
    public void visit(OWLAnnotationAssertionAxiom axiom) {try{__CLR4_5_24zy4zylvickp8e.R.inc(6525);
        __CLR4_5_24zy4zylvickp8e.R.inc(6526);subject = axiom.getSubject();
    }finally{__CLR4_5_24zy4zylvickp8e.R.flushNeeded();}}

    @Override
    public void visit(OWLSymmetricObjectPropertyAxiom axiom) {try{__CLR4_5_24zy4zylvickp8e.R.inc(6527);
        __CLR4_5_24zy4zylvickp8e.R.inc(6528);subject = axiom.getProperty();
    }finally{__CLR4_5_24zy4zylvickp8e.R.flushNeeded();}}

    @Override
    public void visit(OWLDataPropertyRangeAxiom axiom) {try{__CLR4_5_24zy4zylvickp8e.R.inc(6529);
        __CLR4_5_24zy4zylvickp8e.R.inc(6530);subject = axiom.getProperty();
    }finally{__CLR4_5_24zy4zylvickp8e.R.flushNeeded();}}

    @Override
    public void visit(OWLFunctionalDataPropertyAxiom axiom) {try{__CLR4_5_24zy4zylvickp8e.R.inc(6531);
        __CLR4_5_24zy4zylvickp8e.R.inc(6532);subject = axiom.getProperty();
    }finally{__CLR4_5_24zy4zylvickp8e.R.flushNeeded();}}

    @Override
    public void visit(OWLEquivalentDataPropertiesAxiom axiom) {try{__CLR4_5_24zy4zylvickp8e.R.inc(6533);
        __CLR4_5_24zy4zylvickp8e.R.inc(6534);subject = axiom.getProperties().iterator().next();
    }finally{__CLR4_5_24zy4zylvickp8e.R.flushNeeded();}}

    @Override
    public void visit(OWLClassAssertionAxiom axiom) {try{__CLR4_5_24zy4zylvickp8e.R.inc(6535);
        __CLR4_5_24zy4zylvickp8e.R.inc(6536);subject = axiom.getIndividual();
    }finally{__CLR4_5_24zy4zylvickp8e.R.flushNeeded();}}

    @Override
    public void visit(OWLEquivalentClassesAxiom axiom) {try{__CLR4_5_24zy4zylvickp8e.R.inc(6537);
        __CLR4_5_24zy4zylvickp8e.R.inc(6538);subject = selectClassExpression(axiom.getClassExpressions());
    }finally{__CLR4_5_24zy4zylvickp8e.R.flushNeeded();}}

    @Override
    public void visit(OWLDataPropertyAssertionAxiom axiom) {try{__CLR4_5_24zy4zylvickp8e.R.inc(6539);
        __CLR4_5_24zy4zylvickp8e.R.inc(6540);subject = axiom.getSubject();
    }finally{__CLR4_5_24zy4zylvickp8e.R.flushNeeded();}}

    @Override
    public void visit(OWLTransitiveObjectPropertyAxiom axiom) {try{__CLR4_5_24zy4zylvickp8e.R.inc(6541);
        __CLR4_5_24zy4zylvickp8e.R.inc(6542);subject = axiom.getProperty();
    }finally{__CLR4_5_24zy4zylvickp8e.R.flushNeeded();}}

    @Override
    public void visit(OWLIrreflexiveObjectPropertyAxiom axiom) {try{__CLR4_5_24zy4zylvickp8e.R.inc(6543);
        __CLR4_5_24zy4zylvickp8e.R.inc(6544);subject = axiom.getProperty();
    }finally{__CLR4_5_24zy4zylvickp8e.R.flushNeeded();}}

    @Override
    public void visit(OWLSubDataPropertyOfAxiom axiom) {try{__CLR4_5_24zy4zylvickp8e.R.inc(6545);
        __CLR4_5_24zy4zylvickp8e.R.inc(6546);subject = axiom.getSubProperty();
    }finally{__CLR4_5_24zy4zylvickp8e.R.flushNeeded();}}

    @Override
    public void visit(OWLInverseFunctionalObjectPropertyAxiom axiom) {try{__CLR4_5_24zy4zylvickp8e.R.inc(6547);
        __CLR4_5_24zy4zylvickp8e.R.inc(6548);subject = axiom.getProperty();
    }finally{__CLR4_5_24zy4zylvickp8e.R.flushNeeded();}}

    @Override
    public void visit(OWLSameIndividualAxiom axiom) {try{__CLR4_5_24zy4zylvickp8e.R.inc(6549);
        __CLR4_5_24zy4zylvickp8e.R.inc(6550);subject = axiom.getIndividuals().iterator().next();
    }finally{__CLR4_5_24zy4zylvickp8e.R.flushNeeded();}}

    @Override
    public void visit(OWLSubPropertyChainOfAxiom axiom) {try{__CLR4_5_24zy4zylvickp8e.R.inc(6551);
        __CLR4_5_24zy4zylvickp8e.R.inc(6552);subject = axiom.getSuperProperty();
    }finally{__CLR4_5_24zy4zylvickp8e.R.flushNeeded();}}

    @Override
    public void visit(OWLInverseObjectPropertiesAxiom axiom) {try{__CLR4_5_24zy4zylvickp8e.R.inc(6553);
        __CLR4_5_24zy4zylvickp8e.R.inc(6554);subject = axiom.getFirstProperty();
    }finally{__CLR4_5_24zy4zylvickp8e.R.flushNeeded();}}

    @Override
    public void visit(SWRLRule rule) {try{__CLR4_5_24zy4zylvickp8e.R.inc(6555);
        __CLR4_5_24zy4zylvickp8e.R.inc(6556);subject = checkNotNull(rule, "rule cannot be null").getHead()
                .iterator().next();
    }finally{__CLR4_5_24zy4zylvickp8e.R.flushNeeded();}}

    @Override
    public void visit(OWLHasKeyAxiom axiom) {try{__CLR4_5_24zy4zylvickp8e.R.inc(6557);
        __CLR4_5_24zy4zylvickp8e.R.inc(6558);subject = axiom.getClassExpression();
    }finally{__CLR4_5_24zy4zylvickp8e.R.flushNeeded();}}

    @Override
    public void visit(OWLAnnotationPropertyDomainAxiom axiom) {try{__CLR4_5_24zy4zylvickp8e.R.inc(6559);
        __CLR4_5_24zy4zylvickp8e.R.inc(6560);subject = axiom.getProperty();
    }finally{__CLR4_5_24zy4zylvickp8e.R.flushNeeded();}}

    @Override
    public void visit(OWLAnnotationPropertyRangeAxiom axiom) {try{__CLR4_5_24zy4zylvickp8e.R.inc(6561);
        __CLR4_5_24zy4zylvickp8e.R.inc(6562);subject = axiom.getProperty();
    }finally{__CLR4_5_24zy4zylvickp8e.R.flushNeeded();}}

    @Override
    public void visit(OWLSubAnnotationPropertyOfAxiom axiom) {try{__CLR4_5_24zy4zylvickp8e.R.inc(6563);
        __CLR4_5_24zy4zylvickp8e.R.inc(6564);subject = axiom.getSubProperty();
    }finally{__CLR4_5_24zy4zylvickp8e.R.flushNeeded();}}

    @Override
    public void visit(OWLDatatypeDefinitionAxiom axiom) {try{__CLR4_5_24zy4zylvickp8e.R.inc(6565);
        __CLR4_5_24zy4zylvickp8e.R.inc(6566);subject = axiom.getDataRange();
    }finally{__CLR4_5_24zy4zylvickp8e.R.flushNeeded();}}
}
