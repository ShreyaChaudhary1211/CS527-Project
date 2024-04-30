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
package uk.ac.manchester.cs.owl.owlapi;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.model.OWLAnnotation;
import org.semanticweb.owlapi.model.OWLAnnotationAssertionAxiom;
import org.semanticweb.owlapi.model.OWLAnnotationPropertyDomainAxiom;
import org.semanticweb.owlapi.model.OWLAnnotationPropertyRangeAxiom;
import org.semanticweb.owlapi.model.OWLAsymmetricObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLAxiom;
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
import org.semanticweb.owlapi.model.OWLDataPropertyAssertionAxiom;
import org.semanticweb.owlapi.model.OWLDataPropertyDomainAxiom;
import org.semanticweb.owlapi.model.OWLDataPropertyExpression;
import org.semanticweb.owlapi.model.OWLDataPropertyRangeAxiom;
import org.semanticweb.owlapi.model.OWLDataRange;
import org.semanticweb.owlapi.model.OWLDataSomeValuesFrom;
import org.semanticweb.owlapi.model.OWLDataUnionOf;
import org.semanticweb.owlapi.model.OWLDatatypeDefinitionAxiom;
import org.semanticweb.owlapi.model.OWLDatatypeRestriction;
import org.semanticweb.owlapi.model.OWLDeclarationAxiom;
import org.semanticweb.owlapi.model.OWLDifferentIndividualsAxiom;
import org.semanticweb.owlapi.model.OWLDisjointClassesAxiom;
import org.semanticweb.owlapi.model.OWLDisjointDataPropertiesAxiom;
import org.semanticweb.owlapi.model.OWLDisjointObjectPropertiesAxiom;
import org.semanticweb.owlapi.model.OWLDisjointUnionAxiom;
import org.semanticweb.owlapi.model.OWLEntityVisitor;
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
import org.semanticweb.owlapi.model.OWLObjectPropertyAssertionAxiom;
import org.semanticweb.owlapi.model.OWLObjectPropertyDomainAxiom;
import org.semanticweb.owlapi.model.OWLObjectPropertyExpression;
import org.semanticweb.owlapi.model.OWLObjectPropertyRangeAxiom;
import org.semanticweb.owlapi.model.OWLObjectSomeValuesFrom;
import org.semanticweb.owlapi.model.OWLObjectUnionOf;
import org.semanticweb.owlapi.model.OWLObjectVisitor;
import org.semanticweb.owlapi.model.OWLPropertyExpression;
import org.semanticweb.owlapi.model.OWLReflexiveObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLSameIndividualAxiom;
import org.semanticweb.owlapi.model.OWLSubAnnotationPropertyOfAxiom;
import org.semanticweb.owlapi.model.OWLSubClassOfAxiom;
import org.semanticweb.owlapi.model.OWLSubDataPropertyOfAxiom;
import org.semanticweb.owlapi.model.OWLSubObjectPropertyOfAxiom;
import org.semanticweb.owlapi.model.OWLSubPropertyChainOfAxiom;
import org.semanticweb.owlapi.model.OWLSymmetricObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLTransitiveObjectPropertyAxiom;
import org.semanticweb.owlapi.model.SWRLArgument;
import org.semanticweb.owlapi.model.SWRLAtom;
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
import org.semanticweb.owlapi.util.OWLObjectVisitorAdapter;

/** base for entity registration manager */
public abstract class AbstractEntityRegistrationManager extends
        OWLObjectVisitorAdapter implements OWLObjectVisitor, SWRLObjectVisitor {public static class __CLR4_5_2z0z0lviclf25{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u006d\u0070\u006c\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237243416L,8589935092L,1527,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    // Axiom Visitor stuff
    @Nonnull
    private final CollectionContainerVisitor<OWLAnnotation> annotationVisitor = new CollectionContainerVisitor<OWLAnnotation>() {

        @Override
        public void visit(CollectionContainer<OWLAnnotation> c) {try{__CLR4_5_2z0z0lviclf25.R.inc(1260);}finally{__CLR4_5_2z0z0lviclf25.R.flushNeeded();}}

        @Override
        public void visitItem(@Nonnull OWLAnnotation c) {try{__CLR4_5_2z0z0lviclf25.R.inc(1261);
            __CLR4_5_2z0z0lviclf25.R.inc(1262);c.accept(AbstractEntityRegistrationManager.this);
        }finally{__CLR4_5_2z0z0lviclf25.R.flushNeeded();}}
    };

    @SuppressWarnings("unchecked")
    protected void processAxiomAnnotations(@Nonnull OWLAxiom ax) {try{__CLR4_5_2z0z0lviclf25.R.inc(1263);
        // an OWLAxiomImpl will implement this interface with <OWLAnnotation >
        // parameter; this will avoid creating a defensive copy of the
        // annotation set
        __CLR4_5_2z0z0lviclf25.R.inc(1264);if ((((ax instanceof CollectionContainer)&&(__CLR4_5_2z0z0lviclf25.R.iget(1265)!=0|true))||(__CLR4_5_2z0z0lviclf25.R.iget(1266)==0&false))) {{
            __CLR4_5_2z0z0lviclf25.R.inc(1267);((CollectionContainer<OWLAnnotation>) ax).accept(annotationVisitor);
        } }else {{
            // default behavior: iterate over the annotations outside the axiom
            __CLR4_5_2z0z0lviclf25.R.inc(1268);for (OWLAnnotation anno : ax.getAnnotations()) {{
                __CLR4_5_2z0z0lviclf25.R.inc(1269);anno.accept(this);
            }
        }}
    }}finally{__CLR4_5_2z0z0lviclf25.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLSubClassOfAxiom axiom) {try{__CLR4_5_2z0z0lviclf25.R.inc(1270);
        __CLR4_5_2z0z0lviclf25.R.inc(1271);axiom.getSubClass().accept(this);
        __CLR4_5_2z0z0lviclf25.R.inc(1272);axiom.getSuperClass().accept(this);
        __CLR4_5_2z0z0lviclf25.R.inc(1273);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_2z0z0lviclf25.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLNegativeObjectPropertyAssertionAxiom axiom) {try{__CLR4_5_2z0z0lviclf25.R.inc(1274);
        __CLR4_5_2z0z0lviclf25.R.inc(1275);axiom.getSubject().accept(this);
        __CLR4_5_2z0z0lviclf25.R.inc(1276);axiom.getProperty().accept(this);
        __CLR4_5_2z0z0lviclf25.R.inc(1277);axiom.getObject().accept(this);
        __CLR4_5_2z0z0lviclf25.R.inc(1278);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_2z0z0lviclf25.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLAsymmetricObjectPropertyAxiom axiom) {try{__CLR4_5_2z0z0lviclf25.R.inc(1279);
        __CLR4_5_2z0z0lviclf25.R.inc(1280);axiom.getProperty().accept(this);
        __CLR4_5_2z0z0lviclf25.R.inc(1281);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_2z0z0lviclf25.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLReflexiveObjectPropertyAxiom axiom) {try{__CLR4_5_2z0z0lviclf25.R.inc(1282);
        __CLR4_5_2z0z0lviclf25.R.inc(1283);axiom.getProperty().accept(this);
        __CLR4_5_2z0z0lviclf25.R.inc(1284);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_2z0z0lviclf25.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDisjointClassesAxiom axiom) {try{__CLR4_5_2z0z0lviclf25.R.inc(1285);
        __CLR4_5_2z0z0lviclf25.R.inc(1286);for (OWLClassExpression desc : axiom.getClassExpressions()) {{
            __CLR4_5_2z0z0lviclf25.R.inc(1287);desc.accept(this);
        }
        }__CLR4_5_2z0z0lviclf25.R.inc(1288);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_2z0z0lviclf25.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDataPropertyDomainAxiom axiom) {try{__CLR4_5_2z0z0lviclf25.R.inc(1289);
        __CLR4_5_2z0z0lviclf25.R.inc(1290);axiom.getDomain().accept(this);
        __CLR4_5_2z0z0lviclf25.R.inc(1291);axiom.getProperty().accept(this);
        __CLR4_5_2z0z0lviclf25.R.inc(1292);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_2z0z0lviclf25.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLObjectPropertyDomainAxiom axiom) {try{__CLR4_5_2z0z0lviclf25.R.inc(1293);
        __CLR4_5_2z0z0lviclf25.R.inc(1294);axiom.getDomain().accept(this);
        __CLR4_5_2z0z0lviclf25.R.inc(1295);axiom.getProperty().accept(this);
        __CLR4_5_2z0z0lviclf25.R.inc(1296);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_2z0z0lviclf25.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLEquivalentObjectPropertiesAxiom axiom) {try{__CLR4_5_2z0z0lviclf25.R.inc(1297);
        __CLR4_5_2z0z0lviclf25.R.inc(1298);for (OWLObjectPropertyExpression prop : axiom.getProperties()) {{
            __CLR4_5_2z0z0lviclf25.R.inc(1299);prop.accept(this);
        }
        }__CLR4_5_2z0z0lviclf25.R.inc(1300);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_2z0z0lviclf25.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLNegativeDataPropertyAssertionAxiom axiom) {try{__CLR4_5_2z0z0lviclf25.R.inc(1301);
        __CLR4_5_2z0z0lviclf25.R.inc(1302);axiom.getSubject().accept(this);
        __CLR4_5_2z0z0lviclf25.R.inc(1303);axiom.getProperty().accept(this);
        __CLR4_5_2z0z0lviclf25.R.inc(1304);axiom.getObject().accept(this);
        __CLR4_5_2z0z0lviclf25.R.inc(1305);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_2z0z0lviclf25.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDifferentIndividualsAxiom axiom) {try{__CLR4_5_2z0z0lviclf25.R.inc(1306);
        __CLR4_5_2z0z0lviclf25.R.inc(1307);for (OWLIndividual ind : axiom.getIndividuals()) {{
            __CLR4_5_2z0z0lviclf25.R.inc(1308);ind.accept(this);
        }
        }__CLR4_5_2z0z0lviclf25.R.inc(1309);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_2z0z0lviclf25.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDisjointDataPropertiesAxiom axiom) {try{__CLR4_5_2z0z0lviclf25.R.inc(1310);
        __CLR4_5_2z0z0lviclf25.R.inc(1311);for (OWLDataPropertyExpression prop : axiom.getProperties()) {{
            __CLR4_5_2z0z0lviclf25.R.inc(1312);prop.accept(this);
        }
        }__CLR4_5_2z0z0lviclf25.R.inc(1313);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_2z0z0lviclf25.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDisjointObjectPropertiesAxiom axiom) {try{__CLR4_5_2z0z0lviclf25.R.inc(1314);
        __CLR4_5_2z0z0lviclf25.R.inc(1315);for (OWLObjectPropertyExpression prop : axiom.getProperties()) {{
            __CLR4_5_2z0z0lviclf25.R.inc(1316);prop.accept(this);
        }
        }__CLR4_5_2z0z0lviclf25.R.inc(1317);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_2z0z0lviclf25.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLObjectPropertyRangeAxiom axiom) {try{__CLR4_5_2z0z0lviclf25.R.inc(1318);
        __CLR4_5_2z0z0lviclf25.R.inc(1319);axiom.getRange().accept(this);
        __CLR4_5_2z0z0lviclf25.R.inc(1320);axiom.getProperty().accept(this);
        __CLR4_5_2z0z0lviclf25.R.inc(1321);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_2z0z0lviclf25.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLObjectPropertyAssertionAxiom axiom) {try{__CLR4_5_2z0z0lviclf25.R.inc(1322);
        __CLR4_5_2z0z0lviclf25.R.inc(1323);axiom.getSubject().accept(this);
        __CLR4_5_2z0z0lviclf25.R.inc(1324);axiom.getProperty().accept(this);
        __CLR4_5_2z0z0lviclf25.R.inc(1325);axiom.getObject().accept(this);
        __CLR4_5_2z0z0lviclf25.R.inc(1326);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_2z0z0lviclf25.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLFunctionalObjectPropertyAxiom axiom) {try{__CLR4_5_2z0z0lviclf25.R.inc(1327);
        __CLR4_5_2z0z0lviclf25.R.inc(1328);axiom.getProperty().accept(this);
        __CLR4_5_2z0z0lviclf25.R.inc(1329);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_2z0z0lviclf25.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLSubObjectPropertyOfAxiom axiom) {try{__CLR4_5_2z0z0lviclf25.R.inc(1330);
        __CLR4_5_2z0z0lviclf25.R.inc(1331);axiom.getSubProperty().accept(this);
        __CLR4_5_2z0z0lviclf25.R.inc(1332);axiom.getSuperProperty().accept(this);
        __CLR4_5_2z0z0lviclf25.R.inc(1333);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_2z0z0lviclf25.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDisjointUnionAxiom axiom) {try{__CLR4_5_2z0z0lviclf25.R.inc(1334);
        __CLR4_5_2z0z0lviclf25.R.inc(1335);axiom.getOWLClass().accept((OWLEntityVisitor) this);
        __CLR4_5_2z0z0lviclf25.R.inc(1336);for (OWLClassExpression desc : axiom.getClassExpressions()) {{
            __CLR4_5_2z0z0lviclf25.R.inc(1337);desc.accept(this);
        }
        }__CLR4_5_2z0z0lviclf25.R.inc(1338);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_2z0z0lviclf25.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDeclarationAxiom axiom) {try{__CLR4_5_2z0z0lviclf25.R.inc(1339);
        __CLR4_5_2z0z0lviclf25.R.inc(1340);axiom.getEntity().accept(this);
        __CLR4_5_2z0z0lviclf25.R.inc(1341);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_2z0z0lviclf25.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLSymmetricObjectPropertyAxiom axiom) {try{__CLR4_5_2z0z0lviclf25.R.inc(1342);
        __CLR4_5_2z0z0lviclf25.R.inc(1343);axiom.getProperty().accept(this);
        __CLR4_5_2z0z0lviclf25.R.inc(1344);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_2z0z0lviclf25.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDataPropertyRangeAxiom axiom) {try{__CLR4_5_2z0z0lviclf25.R.inc(1345);
        __CLR4_5_2z0z0lviclf25.R.inc(1346);axiom.getProperty().accept(this);
        __CLR4_5_2z0z0lviclf25.R.inc(1347);axiom.getRange().accept(this);
        __CLR4_5_2z0z0lviclf25.R.inc(1348);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_2z0z0lviclf25.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLFunctionalDataPropertyAxiom axiom) {try{__CLR4_5_2z0z0lviclf25.R.inc(1349);
        __CLR4_5_2z0z0lviclf25.R.inc(1350);axiom.getProperty().accept(this);
        __CLR4_5_2z0z0lviclf25.R.inc(1351);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_2z0z0lviclf25.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLEquivalentDataPropertiesAxiom axiom) {try{__CLR4_5_2z0z0lviclf25.R.inc(1352);
        __CLR4_5_2z0z0lviclf25.R.inc(1353);for (OWLDataPropertyExpression prop : axiom.getProperties()) {{
            __CLR4_5_2z0z0lviclf25.R.inc(1354);prop.accept(this);
        }
        }__CLR4_5_2z0z0lviclf25.R.inc(1355);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_2z0z0lviclf25.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLClassAssertionAxiom axiom) {try{__CLR4_5_2z0z0lviclf25.R.inc(1356);
        __CLR4_5_2z0z0lviclf25.R.inc(1357);axiom.getClassExpression().accept(this);
        __CLR4_5_2z0z0lviclf25.R.inc(1358);axiom.getIndividual().accept(this);
        __CLR4_5_2z0z0lviclf25.R.inc(1359);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_2z0z0lviclf25.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLEquivalentClassesAxiom axiom) {try{__CLR4_5_2z0z0lviclf25.R.inc(1360);
        __CLR4_5_2z0z0lviclf25.R.inc(1361);for (OWLClassExpression desc : axiom.getClassExpressions()) {{
            __CLR4_5_2z0z0lviclf25.R.inc(1362);desc.accept(this);
        }
        }__CLR4_5_2z0z0lviclf25.R.inc(1363);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_2z0z0lviclf25.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDataPropertyAssertionAxiom axiom) {try{__CLR4_5_2z0z0lviclf25.R.inc(1364);
        __CLR4_5_2z0z0lviclf25.R.inc(1365);axiom.getSubject().accept(this);
        __CLR4_5_2z0z0lviclf25.R.inc(1366);axiom.getProperty().accept(this);
        __CLR4_5_2z0z0lviclf25.R.inc(1367);axiom.getObject().accept(this);
        __CLR4_5_2z0z0lviclf25.R.inc(1368);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_2z0z0lviclf25.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLTransitiveObjectPropertyAxiom axiom) {try{__CLR4_5_2z0z0lviclf25.R.inc(1369);
        __CLR4_5_2z0z0lviclf25.R.inc(1370);axiom.getProperty().accept(this);
        __CLR4_5_2z0z0lviclf25.R.inc(1371);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_2z0z0lviclf25.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLIrreflexiveObjectPropertyAxiom axiom) {try{__CLR4_5_2z0z0lviclf25.R.inc(1372);
        __CLR4_5_2z0z0lviclf25.R.inc(1373);axiom.getProperty().accept(this);
        __CLR4_5_2z0z0lviclf25.R.inc(1374);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_2z0z0lviclf25.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLSubDataPropertyOfAxiom axiom) {try{__CLR4_5_2z0z0lviclf25.R.inc(1375);
        __CLR4_5_2z0z0lviclf25.R.inc(1376);axiom.getSubProperty().accept(this);
        __CLR4_5_2z0z0lviclf25.R.inc(1377);axiom.getSuperProperty().accept(this);
        __CLR4_5_2z0z0lviclf25.R.inc(1378);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_2z0z0lviclf25.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLInverseFunctionalObjectPropertyAxiom axiom) {try{__CLR4_5_2z0z0lviclf25.R.inc(1379);
        __CLR4_5_2z0z0lviclf25.R.inc(1380);axiom.getProperty().accept(this);
        __CLR4_5_2z0z0lviclf25.R.inc(1381);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_2z0z0lviclf25.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLSameIndividualAxiom axiom) {try{__CLR4_5_2z0z0lviclf25.R.inc(1382);
        __CLR4_5_2z0z0lviclf25.R.inc(1383);for (OWLIndividual ind : axiom.getIndividuals()) {{
            __CLR4_5_2z0z0lviclf25.R.inc(1384);ind.accept(this);
        }
        }__CLR4_5_2z0z0lviclf25.R.inc(1385);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_2z0z0lviclf25.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLSubPropertyChainOfAxiom axiom) {try{__CLR4_5_2z0z0lviclf25.R.inc(1386);
        __CLR4_5_2z0z0lviclf25.R.inc(1387);for (OWLObjectPropertyExpression prop : axiom.getPropertyChain()) {{
            __CLR4_5_2z0z0lviclf25.R.inc(1388);prop.accept(this);
        }
        }__CLR4_5_2z0z0lviclf25.R.inc(1389);axiom.getSuperProperty().accept(this);
        __CLR4_5_2z0z0lviclf25.R.inc(1390);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_2z0z0lviclf25.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLInverseObjectPropertiesAxiom axiom) {try{__CLR4_5_2z0z0lviclf25.R.inc(1391);
        __CLR4_5_2z0z0lviclf25.R.inc(1392);axiom.getFirstProperty().accept(this);
        __CLR4_5_2z0z0lviclf25.R.inc(1393);axiom.getSecondProperty().accept(this);
        __CLR4_5_2z0z0lviclf25.R.inc(1394);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_2z0z0lviclf25.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLHasKeyAxiom axiom) {try{__CLR4_5_2z0z0lviclf25.R.inc(1395);
        __CLR4_5_2z0z0lviclf25.R.inc(1396);axiom.getClassExpression().accept(this);
        __CLR4_5_2z0z0lviclf25.R.inc(1397);for (OWLPropertyExpression prop : axiom.getPropertyExpressions()) {{
            __CLR4_5_2z0z0lviclf25.R.inc(1398);prop.accept(this);
        }
        }__CLR4_5_2z0z0lviclf25.R.inc(1399);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_2z0z0lviclf25.R.flushNeeded();}}

    // OWLClassExpressionVisitor
    @Override
    public void visit(@Nonnull OWLObjectIntersectionOf ce) {try{__CLR4_5_2z0z0lviclf25.R.inc(1400);
        __CLR4_5_2z0z0lviclf25.R.inc(1401);for (OWLClassExpression operand : ce.getOperands()) {{
            __CLR4_5_2z0z0lviclf25.R.inc(1402);operand.accept(this);
        }
    }}finally{__CLR4_5_2z0z0lviclf25.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLObjectUnionOf ce) {try{__CLR4_5_2z0z0lviclf25.R.inc(1403);
        __CLR4_5_2z0z0lviclf25.R.inc(1404);for (OWLClassExpression operand : ce.getOperands()) {{
            __CLR4_5_2z0z0lviclf25.R.inc(1405);operand.accept(this);
        }
    }}finally{__CLR4_5_2z0z0lviclf25.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLObjectComplementOf ce) {try{__CLR4_5_2z0z0lviclf25.R.inc(1406);
        __CLR4_5_2z0z0lviclf25.R.inc(1407);ce.getOperand().accept(this);
    }finally{__CLR4_5_2z0z0lviclf25.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLObjectSomeValuesFrom ce) {try{__CLR4_5_2z0z0lviclf25.R.inc(1408);
        __CLR4_5_2z0z0lviclf25.R.inc(1409);ce.getProperty().accept(this);
        __CLR4_5_2z0z0lviclf25.R.inc(1410);ce.getFiller().accept(this);
    }finally{__CLR4_5_2z0z0lviclf25.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLObjectAllValuesFrom ce) {try{__CLR4_5_2z0z0lviclf25.R.inc(1411);
        __CLR4_5_2z0z0lviclf25.R.inc(1412);ce.getProperty().accept(this);
        __CLR4_5_2z0z0lviclf25.R.inc(1413);ce.getFiller().accept(this);
    }finally{__CLR4_5_2z0z0lviclf25.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLObjectHasValue ce) {try{__CLR4_5_2z0z0lviclf25.R.inc(1414);
        __CLR4_5_2z0z0lviclf25.R.inc(1415);ce.getProperty().accept(this);
        __CLR4_5_2z0z0lviclf25.R.inc(1416);ce.getFiller().accept(this);
    }finally{__CLR4_5_2z0z0lviclf25.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLObjectMinCardinality ce) {try{__CLR4_5_2z0z0lviclf25.R.inc(1417);
        __CLR4_5_2z0z0lviclf25.R.inc(1418);ce.getProperty().accept(this);
        __CLR4_5_2z0z0lviclf25.R.inc(1419);ce.getFiller().accept(this);
    }finally{__CLR4_5_2z0z0lviclf25.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLObjectExactCardinality ce) {try{__CLR4_5_2z0z0lviclf25.R.inc(1420);
        __CLR4_5_2z0z0lviclf25.R.inc(1421);ce.getProperty().accept(this);
        __CLR4_5_2z0z0lviclf25.R.inc(1422);ce.getFiller().accept(this);
    }finally{__CLR4_5_2z0z0lviclf25.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLObjectMaxCardinality ce) {try{__CLR4_5_2z0z0lviclf25.R.inc(1423);
        __CLR4_5_2z0z0lviclf25.R.inc(1424);ce.getProperty().accept(this);
        __CLR4_5_2z0z0lviclf25.R.inc(1425);ce.getFiller().accept(this);
    }finally{__CLR4_5_2z0z0lviclf25.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLObjectHasSelf ce) {try{__CLR4_5_2z0z0lviclf25.R.inc(1426);
        __CLR4_5_2z0z0lviclf25.R.inc(1427);ce.getProperty().accept(this);
    }finally{__CLR4_5_2z0z0lviclf25.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLObjectOneOf ce) {try{__CLR4_5_2z0z0lviclf25.R.inc(1428);
        __CLR4_5_2z0z0lviclf25.R.inc(1429);for (OWLIndividual ind : ce.getIndividuals()) {{
            __CLR4_5_2z0z0lviclf25.R.inc(1430);ind.accept(this);
        }
    }}finally{__CLR4_5_2z0z0lviclf25.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDataSomeValuesFrom ce) {try{__CLR4_5_2z0z0lviclf25.R.inc(1431);
        __CLR4_5_2z0z0lviclf25.R.inc(1432);ce.getProperty().accept(this);
        __CLR4_5_2z0z0lviclf25.R.inc(1433);ce.getFiller().accept(this);
    }finally{__CLR4_5_2z0z0lviclf25.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDataAllValuesFrom ce) {try{__CLR4_5_2z0z0lviclf25.R.inc(1434);
        __CLR4_5_2z0z0lviclf25.R.inc(1435);ce.getProperty().accept(this);
        __CLR4_5_2z0z0lviclf25.R.inc(1436);ce.getFiller().accept(this);
    }finally{__CLR4_5_2z0z0lviclf25.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDataHasValue ce) {try{__CLR4_5_2z0z0lviclf25.R.inc(1437);
        __CLR4_5_2z0z0lviclf25.R.inc(1438);ce.getProperty().accept(this);
        __CLR4_5_2z0z0lviclf25.R.inc(1439);ce.getFiller().accept(this);
    }finally{__CLR4_5_2z0z0lviclf25.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDataMinCardinality ce) {try{__CLR4_5_2z0z0lviclf25.R.inc(1440);
        __CLR4_5_2z0z0lviclf25.R.inc(1441);ce.getProperty().accept(this);
        __CLR4_5_2z0z0lviclf25.R.inc(1442);ce.getFiller().accept(this);
    }finally{__CLR4_5_2z0z0lviclf25.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDataExactCardinality ce) {try{__CLR4_5_2z0z0lviclf25.R.inc(1443);
        __CLR4_5_2z0z0lviclf25.R.inc(1444);ce.getProperty().accept(this);
        __CLR4_5_2z0z0lviclf25.R.inc(1445);ce.getFiller().accept(this);
    }finally{__CLR4_5_2z0z0lviclf25.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDataMaxCardinality ce) {try{__CLR4_5_2z0z0lviclf25.R.inc(1446);
        __CLR4_5_2z0z0lviclf25.R.inc(1447);ce.getProperty().accept(this);
        __CLR4_5_2z0z0lviclf25.R.inc(1448);ce.getFiller().accept(this);
    }finally{__CLR4_5_2z0z0lviclf25.R.flushNeeded();}}

    // Data visitor
    @Override
    public void visit(@Nonnull OWLDataComplementOf node) {try{__CLR4_5_2z0z0lviclf25.R.inc(1449);
        __CLR4_5_2z0z0lviclf25.R.inc(1450);node.getDataRange().accept(this);
    }finally{__CLR4_5_2z0z0lviclf25.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDataOneOf node) {try{__CLR4_5_2z0z0lviclf25.R.inc(1451);
        __CLR4_5_2z0z0lviclf25.R.inc(1452);for (OWLLiteral val : node.getValues()) {{
            __CLR4_5_2z0z0lviclf25.R.inc(1453);val.accept(this);
        }
    }}finally{__CLR4_5_2z0z0lviclf25.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDataIntersectionOf node) {try{__CLR4_5_2z0z0lviclf25.R.inc(1454);
        __CLR4_5_2z0z0lviclf25.R.inc(1455);for (OWLDataRange dr : node.getOperands()) {{
            __CLR4_5_2z0z0lviclf25.R.inc(1456);dr.accept(this);
        }
    }}finally{__CLR4_5_2z0z0lviclf25.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDataUnionOf node) {try{__CLR4_5_2z0z0lviclf25.R.inc(1457);
        __CLR4_5_2z0z0lviclf25.R.inc(1458);for (OWLDataRange dr : node.getOperands()) {{
            __CLR4_5_2z0z0lviclf25.R.inc(1459);dr.accept(this);
        }
    }}finally{__CLR4_5_2z0z0lviclf25.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDatatypeRestriction node) {try{__CLR4_5_2z0z0lviclf25.R.inc(1460);
        __CLR4_5_2z0z0lviclf25.R.inc(1461);node.getDatatype().accept(this);
        __CLR4_5_2z0z0lviclf25.R.inc(1462);for (OWLFacetRestriction facetRestriction : node.getFacetRestrictions()) {{
            __CLR4_5_2z0z0lviclf25.R.inc(1463);facetRestriction.accept(this);
        }
    }}finally{__CLR4_5_2z0z0lviclf25.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLFacetRestriction node) {try{__CLR4_5_2z0z0lviclf25.R.inc(1464);
        __CLR4_5_2z0z0lviclf25.R.inc(1465);node.getFacetValue().accept(this);
    }finally{__CLR4_5_2z0z0lviclf25.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLLiteral node) {try{__CLR4_5_2z0z0lviclf25.R.inc(1466);
        __CLR4_5_2z0z0lviclf25.R.inc(1467);node.getDatatype().accept(this);
    }finally{__CLR4_5_2z0z0lviclf25.R.flushNeeded();}}

    // Property expression visitor
    @Override
    public void visit(@Nonnull OWLObjectInverseOf property) {try{__CLR4_5_2z0z0lviclf25.R.inc(1468);
        __CLR4_5_2z0z0lviclf25.R.inc(1469);property.getInverse().accept(this);
    }finally{__CLR4_5_2z0z0lviclf25.R.flushNeeded();}}

    // Entity visitor
    @Override
    public void visit(@Nonnull OWLAnnotation node) {try{__CLR4_5_2z0z0lviclf25.R.inc(1470);
        __CLR4_5_2z0z0lviclf25.R.inc(1471);node.getProperty().accept(this);
        __CLR4_5_2z0z0lviclf25.R.inc(1472);node.getValue().accept(this);
        __CLR4_5_2z0z0lviclf25.R.inc(1473);for (OWLAnnotation anno : node.getAnnotations()) {{
            __CLR4_5_2z0z0lviclf25.R.inc(1474);anno.accept(this);
        }
    }}finally{__CLR4_5_2z0z0lviclf25.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLAnnotationAssertionAxiom axiom) {try{__CLR4_5_2z0z0lviclf25.R.inc(1475);
        __CLR4_5_2z0z0lviclf25.R.inc(1476);axiom.getSubject().accept(this);
        __CLR4_5_2z0z0lviclf25.R.inc(1477);axiom.getProperty().accept(this);
        __CLR4_5_2z0z0lviclf25.R.inc(1478);axiom.getValue().accept(this);
        __CLR4_5_2z0z0lviclf25.R.inc(1479);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_2z0z0lviclf25.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLAnnotationPropertyDomainAxiom axiom) {try{__CLR4_5_2z0z0lviclf25.R.inc(1480);
        __CLR4_5_2z0z0lviclf25.R.inc(1481);axiom.getProperty().accept(this);
        __CLR4_5_2z0z0lviclf25.R.inc(1482);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_2z0z0lviclf25.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLAnnotationPropertyRangeAxiom axiom) {try{__CLR4_5_2z0z0lviclf25.R.inc(1483);
        __CLR4_5_2z0z0lviclf25.R.inc(1484);axiom.getProperty().accept(this);
        __CLR4_5_2z0z0lviclf25.R.inc(1485);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_2z0z0lviclf25.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLSubAnnotationPropertyOfAxiom axiom) {try{__CLR4_5_2z0z0lviclf25.R.inc(1486);
        __CLR4_5_2z0z0lviclf25.R.inc(1487);axiom.getSubProperty().accept(this);
        __CLR4_5_2z0z0lviclf25.R.inc(1488);axiom.getSuperProperty().accept(this);
        __CLR4_5_2z0z0lviclf25.R.inc(1489);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_2z0z0lviclf25.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDatatypeDefinitionAxiom axiom) {try{__CLR4_5_2z0z0lviclf25.R.inc(1490);
        __CLR4_5_2z0z0lviclf25.R.inc(1491);axiom.getDatatype().accept(this);
        __CLR4_5_2z0z0lviclf25.R.inc(1492);axiom.getDataRange().accept(this);
        __CLR4_5_2z0z0lviclf25.R.inc(1493);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_2z0z0lviclf25.R.flushNeeded();}}

    // SWRL Object Visitor
    @Override
    public void visit(@Nonnull SWRLRule rule) {try{__CLR4_5_2z0z0lviclf25.R.inc(1494);
        __CLR4_5_2z0z0lviclf25.R.inc(1495);for (SWRLAtom atom : rule.getBody()) {{
            __CLR4_5_2z0z0lviclf25.R.inc(1496);atom.accept(this);
        }
        }__CLR4_5_2z0z0lviclf25.R.inc(1497);for (SWRLAtom atom : rule.getHead()) {{
            __CLR4_5_2z0z0lviclf25.R.inc(1498);atom.accept(this);
        }
        }__CLR4_5_2z0z0lviclf25.R.inc(1499);processAxiomAnnotations(rule);
    }finally{__CLR4_5_2z0z0lviclf25.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull SWRLClassAtom node) {try{__CLR4_5_2z0z0lviclf25.R.inc(1500);
        __CLR4_5_2z0z0lviclf25.R.inc(1501);node.getArgument().accept(this);
        __CLR4_5_2z0z0lviclf25.R.inc(1502);node.getPredicate().accept(this);
    }finally{__CLR4_5_2z0z0lviclf25.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull SWRLDataRangeAtom node) {try{__CLR4_5_2z0z0lviclf25.R.inc(1503);
        __CLR4_5_2z0z0lviclf25.R.inc(1504);node.getArgument().accept(this);
        __CLR4_5_2z0z0lviclf25.R.inc(1505);node.getPredicate().accept(this);
    }finally{__CLR4_5_2z0z0lviclf25.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull SWRLObjectPropertyAtom node) {try{__CLR4_5_2z0z0lviclf25.R.inc(1506);
        __CLR4_5_2z0z0lviclf25.R.inc(1507);node.getPredicate().accept(this);
        __CLR4_5_2z0z0lviclf25.R.inc(1508);node.getFirstArgument().accept(this);
        __CLR4_5_2z0z0lviclf25.R.inc(1509);node.getSecondArgument().accept(this);
    }finally{__CLR4_5_2z0z0lviclf25.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull SWRLDataPropertyAtom node) {try{__CLR4_5_2z0z0lviclf25.R.inc(1510);
        __CLR4_5_2z0z0lviclf25.R.inc(1511);node.getPredicate().accept(this);
        __CLR4_5_2z0z0lviclf25.R.inc(1512);node.getFirstArgument().accept(this);
        __CLR4_5_2z0z0lviclf25.R.inc(1513);node.getSecondArgument().accept(this);
    }finally{__CLR4_5_2z0z0lviclf25.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull SWRLBuiltInAtom node) {try{__CLR4_5_2z0z0lviclf25.R.inc(1514);
        __CLR4_5_2z0z0lviclf25.R.inc(1515);for (SWRLArgument obj : node.getAllArguments()) {{
            __CLR4_5_2z0z0lviclf25.R.inc(1516);obj.accept(this);
        }
    }}finally{__CLR4_5_2z0z0lviclf25.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull SWRLIndividualArgument node) {try{__CLR4_5_2z0z0lviclf25.R.inc(1517);
        __CLR4_5_2z0z0lviclf25.R.inc(1518);node.getIndividual().accept(this);
    }finally{__CLR4_5_2z0z0lviclf25.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull SWRLLiteralArgument node) {try{__CLR4_5_2z0z0lviclf25.R.inc(1519);
        __CLR4_5_2z0z0lviclf25.R.inc(1520);node.getLiteral().accept(this);
    }finally{__CLR4_5_2z0z0lviclf25.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull SWRLDifferentIndividualsAtom node) {try{__CLR4_5_2z0z0lviclf25.R.inc(1521);
        __CLR4_5_2z0z0lviclf25.R.inc(1522);node.getFirstArgument().accept(this);
        __CLR4_5_2z0z0lviclf25.R.inc(1523);node.getSecondArgument().accept(this);
    }finally{__CLR4_5_2z0z0lviclf25.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull SWRLSameIndividualAtom node) {try{__CLR4_5_2z0z0lviclf25.R.inc(1524);
        __CLR4_5_2z0z0lviclf25.R.inc(1525);node.getFirstArgument().accept(this);
        __CLR4_5_2z0z0lviclf25.R.inc(1526);node.getSecondArgument().accept(this);
    }finally{__CLR4_5_2z0z0lviclf25.R.flushNeeded();}}
}
