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

import static org.semanticweb.owlapi.util.StructureWalker.AnnotationWalkingControl.WALK_ONTOLOGY_ANNOTATIONS_ONLY;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.model.*;

/**
 * Structure walker for object walkers.
 * 
 * @param <O>
 *        type to visit
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class StructureWalker<O extends OWLObject> implements OWLObjectVisitor {public static class __CLR4_5_2br1br1lvicksbb{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0061\u0070\u0069\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237201267L,8589935092L,15678,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Control flag for whether to walk annotations
     */
    public static enum AnnotationWalkingControl {
        /**
         * Do not walk any annotations
         */
        DONT_WALK_ANNOTATIONS,
        /**
         * Only walk ontology annotations (previous behaviour)
         */
        WALK_ONTOLOGY_ANNOTATIONS_ONLY,
        /**
         * Walk all annotations
         */
        WALK_ANNOTATIONS
    }

    protected final OWLObjectWalker<O> walkerCallback;
    protected final Set<OWLObject> visited = new HashSet<>();
    protected final AnnotationWalkingControl annotationWalkFlag;

    /**
     * @param owlObjectWalker
     *        object walker
     */
    public StructureWalker(OWLObjectWalker<O> owlObjectWalker) {
        this(owlObjectWalker, WALK_ONTOLOGY_ANNOTATIONS_ONLY);__CLR4_5_2br1br1lvicksbb.R.inc(15230);try{__CLR4_5_2br1br1lvicksbb.R.inc(15229);
    }finally{__CLR4_5_2br1br1lvicksbb.R.flushNeeded();}}

    /**
     * @param owlObjectWalker
     *        callback object walker
     * @param annotationWalkFlag
     *        control flag for annotation walking
     */
    public StructureWalker(OWLObjectWalker<O> owlObjectWalker,
        AnnotationWalkingControl annotationWalkFlag) {try{__CLR4_5_2br1br1lvicksbb.R.inc(15231);
        __CLR4_5_2br1br1lvicksbb.R.inc(15232);this.walkerCallback = owlObjectWalker;
        __CLR4_5_2br1br1lvicksbb.R.inc(15233);this.annotationWalkFlag = annotationWalkFlag;
    }finally{__CLR4_5_2br1br1lvicksbb.R.flushNeeded();}}

    protected void process(@Nonnull OWLObject object) {try{__CLR4_5_2br1br1lvicksbb.R.inc(15234);
        __CLR4_5_2br1br1lvicksbb.R.inc(15235);if ((((object instanceof OWLAxiom)&&(__CLR4_5_2br1br1lvicksbb.R.iget(15236)!=0|true))||(__CLR4_5_2br1br1lvicksbb.R.iget(15237)==0&false))) {{
            __CLR4_5_2br1br1lvicksbb.R.inc(15238);walkerCallback.setAxiom((OWLAxiom) object);
        }
        }__CLR4_5_2br1br1lvicksbb.R.inc(15239);if ((((object instanceof OWLAnnotation)&&(__CLR4_5_2br1br1lvicksbb.R.iget(15240)!=0|true))||(__CLR4_5_2br1br1lvicksbb.R.iget(15241)==0&false))) {{
            __CLR4_5_2br1br1lvicksbb.R.inc(15242);walkerCallback.setAnnotation((OWLAnnotation) object);
        }
        }__CLR4_5_2br1br1lvicksbb.R.inc(15243);if ((((!walkerCallback.visitDuplicates)&&(__CLR4_5_2br1br1lvicksbb.R.iget(15244)!=0|true))||(__CLR4_5_2br1br1lvicksbb.R.iget(15245)==0&false))) {{
            __CLR4_5_2br1br1lvicksbb.R.inc(15246);if ((((!visited.contains(object))&&(__CLR4_5_2br1br1lvicksbb.R.iget(15247)!=0|true))||(__CLR4_5_2br1br1lvicksbb.R.iget(15248)==0&false))) {{
                __CLR4_5_2br1br1lvicksbb.R.inc(15249);visited.add(object);
                __CLR4_5_2br1br1lvicksbb.R.inc(15250);walkerCallback.passToVisitor(object);
            }
        }} }else {{
            __CLR4_5_2br1br1lvicksbb.R.inc(15251);walkerCallback.passToVisitor(object);
        }
        }__CLR4_5_2br1br1lvicksbb.R.inc(15252);if ((((object instanceof HasAnnotations)&&(__CLR4_5_2br1br1lvicksbb.R.iget(15253)!=0|true))||(__CLR4_5_2br1br1lvicksbb.R.iget(15254)==0&false))) {{
            __CLR4_5_2br1br1lvicksbb.R.inc(15255);HasAnnotations hasAnnotations = (HasAnnotations) object;
            boolean __CLB4_5_2_bool0=false;__CLR4_5_2br1br1lvicksbb.R.inc(15256);switch (annotationWalkFlag) {
                case DONT_WALK_ANNOTATIONS:if (!__CLB4_5_2_bool0) {__CLR4_5_2br1br1lvicksbb.R.inc(15257);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2br1br1lvicksbb.R.inc(15258);break;
                case WALK_ONTOLOGY_ANNOTATIONS_ONLY:if (!__CLB4_5_2_bool0) {__CLR4_5_2br1br1lvicksbb.R.inc(15259);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2br1br1lvicksbb.R.inc(15260);if ((((!(object instanceof OWLOntology))&&(__CLR4_5_2br1br1lvicksbb.R.iget(15261)!=0|true))||(__CLR4_5_2br1br1lvicksbb.R.iget(15262)==0&false))) {{
                        __CLR4_5_2br1br1lvicksbb.R.inc(15263);break;
                    }
                    // fall-through
                }case WALK_ANNOTATIONS:if (!__CLB4_5_2_bool0) {__CLR4_5_2br1br1lvicksbb.R.inc(15264);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2br1br1lvicksbb.R.inc(15265);for (OWLAnnotation anno : hasAnnotations.getAnnotations()) {{
                        __CLR4_5_2br1br1lvicksbb.R.inc(15266);anno.accept(this);
                    }
            }}
        }
    }}finally{__CLR4_5_2br1br1lvicksbb.R.flushNeeded();}}

    @Override
    public void visit(IRI iri) {try{__CLR4_5_2br1br1lvicksbb.R.inc(15267);
        __CLR4_5_2br1br1lvicksbb.R.inc(15268);process(iri);
    }finally{__CLR4_5_2br1br1lvicksbb.R.flushNeeded();}}

    @Override
    public void visit(OWLOntology ontology) {try{__CLR4_5_2br1br1lvicksbb.R.inc(15269);
        __CLR4_5_2br1br1lvicksbb.R.inc(15270);walkerCallback.ontology = ontology;
        __CLR4_5_2br1br1lvicksbb.R.inc(15271);walkerCallback.ax = null;
        __CLR4_5_2br1br1lvicksbb.R.inc(15272);process(ontology);
        __CLR4_5_2br1br1lvicksbb.R.inc(15273);for (OWLAxiom a : ontology.getAxioms()) {{
            __CLR4_5_2br1br1lvicksbb.R.inc(15274);a.accept(this);
        }
    }}finally{__CLR4_5_2br1br1lvicksbb.R.flushNeeded();}}

    @Override
    public void visit(OWLAsymmetricObjectPropertyAxiom axiom) {try{__CLR4_5_2br1br1lvicksbb.R.inc(15275);
        __CLR4_5_2br1br1lvicksbb.R.inc(15276);process(axiom);
        __CLR4_5_2br1br1lvicksbb.R.inc(15277);walkerCallback.ax = axiom;
        __CLR4_5_2br1br1lvicksbb.R.inc(15278);axiom.getProperty().accept(this);
    }finally{__CLR4_5_2br1br1lvicksbb.R.flushNeeded();}}

    @Override
    public void visit(OWLClassAssertionAxiom axiom) {try{__CLR4_5_2br1br1lvicksbb.R.inc(15279);
        __CLR4_5_2br1br1lvicksbb.R.inc(15280);process(axiom);
        __CLR4_5_2br1br1lvicksbb.R.inc(15281);walkerCallback.ax = axiom;
        __CLR4_5_2br1br1lvicksbb.R.inc(15282);axiom.getIndividual().accept(this);
        __CLR4_5_2br1br1lvicksbb.R.inc(15283);axiom.getClassExpression().accept(this);
    }finally{__CLR4_5_2br1br1lvicksbb.R.flushNeeded();}}

    @Override
    public void visit(OWLDataPropertyAssertionAxiom axiom) {try{__CLR4_5_2br1br1lvicksbb.R.inc(15284);
        __CLR4_5_2br1br1lvicksbb.R.inc(15285);process(axiom);
        __CLR4_5_2br1br1lvicksbb.R.inc(15286);walkerCallback.ax = axiom;
        __CLR4_5_2br1br1lvicksbb.R.inc(15287);axiom.getSubject().accept(this);
        __CLR4_5_2br1br1lvicksbb.R.inc(15288);axiom.getProperty().accept(this);
        __CLR4_5_2br1br1lvicksbb.R.inc(15289);axiom.getObject().accept(this);
    }finally{__CLR4_5_2br1br1lvicksbb.R.flushNeeded();}}

    @Override
    public void visit(OWLDataPropertyDomainAxiom axiom) {try{__CLR4_5_2br1br1lvicksbb.R.inc(15290);
        __CLR4_5_2br1br1lvicksbb.R.inc(15291);process(axiom);
        __CLR4_5_2br1br1lvicksbb.R.inc(15292);walkerCallback.ax = axiom;
        __CLR4_5_2br1br1lvicksbb.R.inc(15293);axiom.getDomain().accept(this);
        __CLR4_5_2br1br1lvicksbb.R.inc(15294);axiom.getProperty().accept(this);
    }finally{__CLR4_5_2br1br1lvicksbb.R.flushNeeded();}}

    @Override
    public void visit(OWLDataPropertyRangeAxiom axiom) {try{__CLR4_5_2br1br1lvicksbb.R.inc(15295);
        __CLR4_5_2br1br1lvicksbb.R.inc(15296);process(axiom);
        __CLR4_5_2br1br1lvicksbb.R.inc(15297);walkerCallback.ax = axiom;
        __CLR4_5_2br1br1lvicksbb.R.inc(15298);axiom.getRange().accept(this);
        __CLR4_5_2br1br1lvicksbb.R.inc(15299);axiom.getProperty().accept(this);
    }finally{__CLR4_5_2br1br1lvicksbb.R.flushNeeded();}}

    @Override
    public void visit(OWLSubDataPropertyOfAxiom axiom) {try{__CLR4_5_2br1br1lvicksbb.R.inc(15300);
        __CLR4_5_2br1br1lvicksbb.R.inc(15301);process(axiom);
        __CLR4_5_2br1br1lvicksbb.R.inc(15302);walkerCallback.ax = axiom;
        __CLR4_5_2br1br1lvicksbb.R.inc(15303);axiom.getSubProperty().accept(this);
        __CLR4_5_2br1br1lvicksbb.R.inc(15304);axiom.getSuperProperty().accept(this);
    }finally{__CLR4_5_2br1br1lvicksbb.R.flushNeeded();}}

    @Override
    public void visit(OWLDeclarationAxiom axiom) {try{__CLR4_5_2br1br1lvicksbb.R.inc(15305);
        __CLR4_5_2br1br1lvicksbb.R.inc(15306);process(axiom);
        __CLR4_5_2br1br1lvicksbb.R.inc(15307);walkerCallback.ax = axiom;
        __CLR4_5_2br1br1lvicksbb.R.inc(15308);axiom.getEntity().accept(this);
    }finally{__CLR4_5_2br1br1lvicksbb.R.flushNeeded();}}

    @Override
    public void visit(OWLDifferentIndividualsAxiom axiom) {try{__CLR4_5_2br1br1lvicksbb.R.inc(15309);
        __CLR4_5_2br1br1lvicksbb.R.inc(15310);process(axiom);
        __CLR4_5_2br1br1lvicksbb.R.inc(15311);walkerCallback.ax = axiom;
        __CLR4_5_2br1br1lvicksbb.R.inc(15312);for (OWLIndividual ind : axiom.getIndividuals()) {{
            __CLR4_5_2br1br1lvicksbb.R.inc(15313);ind.accept(this);
        }
    }}finally{__CLR4_5_2br1br1lvicksbb.R.flushNeeded();}}

    @Override
    public void visit(OWLDisjointClassesAxiom axiom) {try{__CLR4_5_2br1br1lvicksbb.R.inc(15314);
        __CLR4_5_2br1br1lvicksbb.R.inc(15315);process(axiom);
        __CLR4_5_2br1br1lvicksbb.R.inc(15316);walkerCallback.ax = axiom;
        __CLR4_5_2br1br1lvicksbb.R.inc(15317);for (OWLClassExpression desc : axiom.getClassExpressions()) {{
            __CLR4_5_2br1br1lvicksbb.R.inc(15318);desc.accept(this);
        }
    }}finally{__CLR4_5_2br1br1lvicksbb.R.flushNeeded();}}

    @Override
    public void visit(OWLDisjointDataPropertiesAxiom axiom) {try{__CLR4_5_2br1br1lvicksbb.R.inc(15319);
        __CLR4_5_2br1br1lvicksbb.R.inc(15320);process(axiom);
        __CLR4_5_2br1br1lvicksbb.R.inc(15321);walkerCallback.ax = axiom;
        __CLR4_5_2br1br1lvicksbb.R.inc(15322);for (OWLDataPropertyExpression prop : axiom.getProperties()) {{
            __CLR4_5_2br1br1lvicksbb.R.inc(15323);prop.accept(this);
        }
    }}finally{__CLR4_5_2br1br1lvicksbb.R.flushNeeded();}}

    @Override
    public void visit(OWLDisjointObjectPropertiesAxiom axiom) {try{__CLR4_5_2br1br1lvicksbb.R.inc(15324);
        __CLR4_5_2br1br1lvicksbb.R.inc(15325);process(axiom);
        __CLR4_5_2br1br1lvicksbb.R.inc(15326);walkerCallback.ax = axiom;
        __CLR4_5_2br1br1lvicksbb.R.inc(15327);for (OWLObjectPropertyExpression prop : axiom.getProperties()) {{
            __CLR4_5_2br1br1lvicksbb.R.inc(15328);prop.accept(this);
        }
    }}finally{__CLR4_5_2br1br1lvicksbb.R.flushNeeded();}}

    @Override
    public void visit(OWLDisjointUnionAxiom axiom) {try{__CLR4_5_2br1br1lvicksbb.R.inc(15329);
        __CLR4_5_2br1br1lvicksbb.R.inc(15330);process(axiom);
        __CLR4_5_2br1br1lvicksbb.R.inc(15331);walkerCallback.ax = axiom;
        __CLR4_5_2br1br1lvicksbb.R.inc(15332);axiom.getOWLClass().accept(this);
        __CLR4_5_2br1br1lvicksbb.R.inc(15333);for (OWLClassExpression desc : axiom.getClassExpressions()) {{
            __CLR4_5_2br1br1lvicksbb.R.inc(15334);desc.accept(this);
        }
    }}finally{__CLR4_5_2br1br1lvicksbb.R.flushNeeded();}}

    @Override
    public void visit(OWLAnnotationAssertionAxiom axiom) {try{__CLR4_5_2br1br1lvicksbb.R.inc(15335);
        __CLR4_5_2br1br1lvicksbb.R.inc(15336);process(axiom);
        __CLR4_5_2br1br1lvicksbb.R.inc(15337);walkerCallback.ax = axiom;
        __CLR4_5_2br1br1lvicksbb.R.inc(15338);axiom.getSubject().accept(this);
        __CLR4_5_2br1br1lvicksbb.R.inc(15339);axiom.getAnnotation().accept(this);
    }finally{__CLR4_5_2br1br1lvicksbb.R.flushNeeded();}}

    @Override
    public void visit(OWLAnnotationPropertyDomainAxiom axiom) {try{__CLR4_5_2br1br1lvicksbb.R.inc(15340);
        __CLR4_5_2br1br1lvicksbb.R.inc(15341);process(axiom);
        __CLR4_5_2br1br1lvicksbb.R.inc(15342);walkerCallback.ax = axiom;
        __CLR4_5_2br1br1lvicksbb.R.inc(15343);axiom.getProperty().accept(this);
        __CLR4_5_2br1br1lvicksbb.R.inc(15344);axiom.getDomain().accept(this);
    }finally{__CLR4_5_2br1br1lvicksbb.R.flushNeeded();}}

    @Override
    public void visit(OWLAnnotationPropertyRangeAxiom axiom) {try{__CLR4_5_2br1br1lvicksbb.R.inc(15345);
        __CLR4_5_2br1br1lvicksbb.R.inc(15346);process(axiom);
        __CLR4_5_2br1br1lvicksbb.R.inc(15347);walkerCallback.ax = axiom;
        __CLR4_5_2br1br1lvicksbb.R.inc(15348);axiom.getProperty().accept(this);
        __CLR4_5_2br1br1lvicksbb.R.inc(15349);axiom.getRange().accept(this);
    }finally{__CLR4_5_2br1br1lvicksbb.R.flushNeeded();}}

    @Override
    public void visit(OWLSubAnnotationPropertyOfAxiom axiom) {try{__CLR4_5_2br1br1lvicksbb.R.inc(15350);
        __CLR4_5_2br1br1lvicksbb.R.inc(15351);process(axiom);
        __CLR4_5_2br1br1lvicksbb.R.inc(15352);walkerCallback.ax = axiom;
        __CLR4_5_2br1br1lvicksbb.R.inc(15353);axiom.getSubProperty().accept(this);
        __CLR4_5_2br1br1lvicksbb.R.inc(15354);axiom.getSuperProperty().accept(this);
    }finally{__CLR4_5_2br1br1lvicksbb.R.flushNeeded();}}

    @Override
    public void visit(OWLAnnotation node) {try{__CLR4_5_2br1br1lvicksbb.R.inc(15355);
        __CLR4_5_2br1br1lvicksbb.R.inc(15356);process(node);
        __CLR4_5_2br1br1lvicksbb.R.inc(15357);walkerCallback.setAnnotation(node);
        __CLR4_5_2br1br1lvicksbb.R.inc(15358);node.getProperty().accept(this);
        __CLR4_5_2br1br1lvicksbb.R.inc(15359);node.getValue().accept(this);
    }finally{__CLR4_5_2br1br1lvicksbb.R.flushNeeded();}}

    @Override
    public void visit(OWLEquivalentClassesAxiom axiom) {try{__CLR4_5_2br1br1lvicksbb.R.inc(15360);
        __CLR4_5_2br1br1lvicksbb.R.inc(15361);process(axiom);
        __CLR4_5_2br1br1lvicksbb.R.inc(15362);walkerCallback.ax = axiom;
        __CLR4_5_2br1br1lvicksbb.R.inc(15363);for (OWLClassExpression desc : axiom.getClassExpressions()) {{
            __CLR4_5_2br1br1lvicksbb.R.inc(15364);desc.accept(this);
        }
    }}finally{__CLR4_5_2br1br1lvicksbb.R.flushNeeded();}}

    @Override
    public void visit(OWLEquivalentDataPropertiesAxiom axiom) {try{__CLR4_5_2br1br1lvicksbb.R.inc(15365);
        __CLR4_5_2br1br1lvicksbb.R.inc(15366);process(axiom);
        __CLR4_5_2br1br1lvicksbb.R.inc(15367);walkerCallback.ax = axiom;
        __CLR4_5_2br1br1lvicksbb.R.inc(15368);for (OWLDataPropertyExpression prop : axiom.getProperties()) {{
            __CLR4_5_2br1br1lvicksbb.R.inc(15369);prop.accept(this);
        }
    }}finally{__CLR4_5_2br1br1lvicksbb.R.flushNeeded();}}

    @Override
    public void visit(OWLEquivalentObjectPropertiesAxiom axiom) {try{__CLR4_5_2br1br1lvicksbb.R.inc(15370);
        __CLR4_5_2br1br1lvicksbb.R.inc(15371);process(axiom);
        __CLR4_5_2br1br1lvicksbb.R.inc(15372);walkerCallback.ax = axiom;
        __CLR4_5_2br1br1lvicksbb.R.inc(15373);for (OWLObjectPropertyExpression prop : axiom.getProperties()) {{
            __CLR4_5_2br1br1lvicksbb.R.inc(15374);prop.accept(this);
        }
    }}finally{__CLR4_5_2br1br1lvicksbb.R.flushNeeded();}}

    @Override
    public void visit(OWLFunctionalDataPropertyAxiom axiom) {try{__CLR4_5_2br1br1lvicksbb.R.inc(15375);
        __CLR4_5_2br1br1lvicksbb.R.inc(15376);process(axiom);
        __CLR4_5_2br1br1lvicksbb.R.inc(15377);walkerCallback.ax = axiom;
        __CLR4_5_2br1br1lvicksbb.R.inc(15378);axiom.getProperty().accept(this);
    }finally{__CLR4_5_2br1br1lvicksbb.R.flushNeeded();}}

    @Override
    public void visit(OWLFunctionalObjectPropertyAxiom axiom) {try{__CLR4_5_2br1br1lvicksbb.R.inc(15379);
        __CLR4_5_2br1br1lvicksbb.R.inc(15380);process(axiom);
        __CLR4_5_2br1br1lvicksbb.R.inc(15381);walkerCallback.ax = axiom;
        __CLR4_5_2br1br1lvicksbb.R.inc(15382);axiom.getProperty().accept(this);
    }finally{__CLR4_5_2br1br1lvicksbb.R.flushNeeded();}}

    @Override
    public void visit(OWLInverseFunctionalObjectPropertyAxiom axiom) {try{__CLR4_5_2br1br1lvicksbb.R.inc(15383);
        __CLR4_5_2br1br1lvicksbb.R.inc(15384);process(axiom);
        __CLR4_5_2br1br1lvicksbb.R.inc(15385);walkerCallback.ax = axiom;
        __CLR4_5_2br1br1lvicksbb.R.inc(15386);axiom.getProperty().accept(this);
    }finally{__CLR4_5_2br1br1lvicksbb.R.flushNeeded();}}

    @Override
    public void visit(OWLInverseObjectPropertiesAxiom axiom) {try{__CLR4_5_2br1br1lvicksbb.R.inc(15387);
        __CLR4_5_2br1br1lvicksbb.R.inc(15388);process(axiom);
        __CLR4_5_2br1br1lvicksbb.R.inc(15389);walkerCallback.ax = axiom;
        __CLR4_5_2br1br1lvicksbb.R.inc(15390);axiom.getFirstProperty().accept(this);
        __CLR4_5_2br1br1lvicksbb.R.inc(15391);axiom.getSecondProperty().accept(this);
    }finally{__CLR4_5_2br1br1lvicksbb.R.flushNeeded();}}

    @Override
    public void visit(OWLIrreflexiveObjectPropertyAxiom axiom) {try{__CLR4_5_2br1br1lvicksbb.R.inc(15392);
        __CLR4_5_2br1br1lvicksbb.R.inc(15393);process(axiom);
        __CLR4_5_2br1br1lvicksbb.R.inc(15394);walkerCallback.ax = axiom;
        __CLR4_5_2br1br1lvicksbb.R.inc(15395);axiom.getProperty().accept(this);
    }finally{__CLR4_5_2br1br1lvicksbb.R.flushNeeded();}}

    @Override
    public void visit(OWLNegativeDataPropertyAssertionAxiom axiom) {try{__CLR4_5_2br1br1lvicksbb.R.inc(15396);
        __CLR4_5_2br1br1lvicksbb.R.inc(15397);process(axiom);
        __CLR4_5_2br1br1lvicksbb.R.inc(15398);walkerCallback.ax = axiom;
        __CLR4_5_2br1br1lvicksbb.R.inc(15399);axiom.getSubject().accept(this);
        __CLR4_5_2br1br1lvicksbb.R.inc(15400);axiom.getProperty().accept(this);
        __CLR4_5_2br1br1lvicksbb.R.inc(15401);axiom.getObject().accept(this);
    }finally{__CLR4_5_2br1br1lvicksbb.R.flushNeeded();}}

    @Override
    public void visit(OWLNegativeObjectPropertyAssertionAxiom axiom) {try{__CLR4_5_2br1br1lvicksbb.R.inc(15402);
        __CLR4_5_2br1br1lvicksbb.R.inc(15403);process(axiom);
        __CLR4_5_2br1br1lvicksbb.R.inc(15404);walkerCallback.ax = axiom;
        __CLR4_5_2br1br1lvicksbb.R.inc(15405);axiom.getSubject().accept(this);
        __CLR4_5_2br1br1lvicksbb.R.inc(15406);axiom.getProperty().accept(this);
        __CLR4_5_2br1br1lvicksbb.R.inc(15407);axiom.getObject().accept(this);
    }finally{__CLR4_5_2br1br1lvicksbb.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectPropertyAssertionAxiom axiom) {try{__CLR4_5_2br1br1lvicksbb.R.inc(15408);
        __CLR4_5_2br1br1lvicksbb.R.inc(15409);process(axiom);
        __CLR4_5_2br1br1lvicksbb.R.inc(15410);walkerCallback.ax = axiom;
        __CLR4_5_2br1br1lvicksbb.R.inc(15411);axiom.getSubject().accept(this);
        __CLR4_5_2br1br1lvicksbb.R.inc(15412);axiom.getProperty().accept(this);
        __CLR4_5_2br1br1lvicksbb.R.inc(15413);axiom.getObject().accept(this);
    }finally{__CLR4_5_2br1br1lvicksbb.R.flushNeeded();}}

    @Override
    public void visit(OWLSubPropertyChainOfAxiom axiom) {try{__CLR4_5_2br1br1lvicksbb.R.inc(15414);
        __CLR4_5_2br1br1lvicksbb.R.inc(15415);process(axiom);
        __CLR4_5_2br1br1lvicksbb.R.inc(15416);walkerCallback.ax = axiom;
        __CLR4_5_2br1br1lvicksbb.R.inc(15417);for (OWLObjectPropertyExpression prop : axiom.getPropertyChain()) {{
            __CLR4_5_2br1br1lvicksbb.R.inc(15418);prop.accept(this);
        }
        }__CLR4_5_2br1br1lvicksbb.R.inc(15419);axiom.getSuperProperty().accept(this);
    }finally{__CLR4_5_2br1br1lvicksbb.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectPropertyDomainAxiom axiom) {try{__CLR4_5_2br1br1lvicksbb.R.inc(15420);
        __CLR4_5_2br1br1lvicksbb.R.inc(15421);process(axiom);
        __CLR4_5_2br1br1lvicksbb.R.inc(15422);walkerCallback.ax = axiom;
        __CLR4_5_2br1br1lvicksbb.R.inc(15423);axiom.getDomain().accept(this);
        __CLR4_5_2br1br1lvicksbb.R.inc(15424);axiom.getProperty().accept(this);
    }finally{__CLR4_5_2br1br1lvicksbb.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectPropertyRangeAxiom axiom) {try{__CLR4_5_2br1br1lvicksbb.R.inc(15425);
        __CLR4_5_2br1br1lvicksbb.R.inc(15426);process(axiom);
        __CLR4_5_2br1br1lvicksbb.R.inc(15427);walkerCallback.ax = axiom;
        __CLR4_5_2br1br1lvicksbb.R.inc(15428);axiom.getProperty().accept(this);
        __CLR4_5_2br1br1lvicksbb.R.inc(15429);axiom.getRange().accept(this);
    }finally{__CLR4_5_2br1br1lvicksbb.R.flushNeeded();}}

    @Override
    public void visit(OWLSubObjectPropertyOfAxiom axiom) {try{__CLR4_5_2br1br1lvicksbb.R.inc(15430);
        __CLR4_5_2br1br1lvicksbb.R.inc(15431);process(axiom);
        __CLR4_5_2br1br1lvicksbb.R.inc(15432);walkerCallback.ax = axiom;
        __CLR4_5_2br1br1lvicksbb.R.inc(15433);axiom.getSubProperty().accept(this);
        __CLR4_5_2br1br1lvicksbb.R.inc(15434);axiom.getSuperProperty().accept(this);
    }finally{__CLR4_5_2br1br1lvicksbb.R.flushNeeded();}}

    @Override
    public void visit(OWLReflexiveObjectPropertyAxiom axiom) {try{__CLR4_5_2br1br1lvicksbb.R.inc(15435);
        __CLR4_5_2br1br1lvicksbb.R.inc(15436);process(axiom);
        __CLR4_5_2br1br1lvicksbb.R.inc(15437);walkerCallback.ax = axiom;
        __CLR4_5_2br1br1lvicksbb.R.inc(15438);axiom.getProperty().accept(this);
    }finally{__CLR4_5_2br1br1lvicksbb.R.flushNeeded();}}

    @Override
    public void visit(OWLSameIndividualAxiom axiom) {try{__CLR4_5_2br1br1lvicksbb.R.inc(15439);
        __CLR4_5_2br1br1lvicksbb.R.inc(15440);process(axiom);
        __CLR4_5_2br1br1lvicksbb.R.inc(15441);walkerCallback.ax = axiom;
        __CLR4_5_2br1br1lvicksbb.R.inc(15442);for (OWLIndividual ind : axiom.getIndividuals()) {{
            __CLR4_5_2br1br1lvicksbb.R.inc(15443);ind.accept(this);
        }
    }}finally{__CLR4_5_2br1br1lvicksbb.R.flushNeeded();}}

    @Override
    public void visit(OWLSubClassOfAxiom axiom) {try{__CLR4_5_2br1br1lvicksbb.R.inc(15444);
        __CLR4_5_2br1br1lvicksbb.R.inc(15445);process(axiom);
        __CLR4_5_2br1br1lvicksbb.R.inc(15446);walkerCallback.ax = axiom;
        // -ve polarity
        __CLR4_5_2br1br1lvicksbb.R.inc(15447);axiom.getSubClass().accept(this);
        // +ve polarity
        __CLR4_5_2br1br1lvicksbb.R.inc(15448);axiom.getSuperClass().accept(this);
    }finally{__CLR4_5_2br1br1lvicksbb.R.flushNeeded();}}

    @Override
    public void visit(OWLSymmetricObjectPropertyAxiom axiom) {try{__CLR4_5_2br1br1lvicksbb.R.inc(15449);
        __CLR4_5_2br1br1lvicksbb.R.inc(15450);process(axiom);
        __CLR4_5_2br1br1lvicksbb.R.inc(15451);walkerCallback.ax = axiom;
        __CLR4_5_2br1br1lvicksbb.R.inc(15452);axiom.getProperty().accept(this);
    }finally{__CLR4_5_2br1br1lvicksbb.R.flushNeeded();}}

    @Override
    public void visit(OWLTransitiveObjectPropertyAxiom axiom) {try{__CLR4_5_2br1br1lvicksbb.R.inc(15453);
        __CLR4_5_2br1br1lvicksbb.R.inc(15454);process(axiom);
        __CLR4_5_2br1br1lvicksbb.R.inc(15455);walkerCallback.ax = axiom;
        __CLR4_5_2br1br1lvicksbb.R.inc(15456);axiom.getProperty().accept(this);
    }finally{__CLR4_5_2br1br1lvicksbb.R.flushNeeded();}}

    @Override
    public void visit(SWRLRule rule) {try{__CLR4_5_2br1br1lvicksbb.R.inc(15457);
        __CLR4_5_2br1br1lvicksbb.R.inc(15458);process(rule);
        __CLR4_5_2br1br1lvicksbb.R.inc(15459);walkerCallback.ax = rule;
        __CLR4_5_2br1br1lvicksbb.R.inc(15460);for (SWRLAtom at : rule.getBody()) {{
            __CLR4_5_2br1br1lvicksbb.R.inc(15461);at.accept(this);
        }
        }__CLR4_5_2br1br1lvicksbb.R.inc(15462);for (SWRLAtom at : rule.getHead()) {{
            __CLR4_5_2br1br1lvicksbb.R.inc(15463);at.accept(this);
        }
    }}finally{__CLR4_5_2br1br1lvicksbb.R.flushNeeded();}}

    @Override
    public void visit(OWLHasKeyAxiom axiom) {try{__CLR4_5_2br1br1lvicksbb.R.inc(15464);
        __CLR4_5_2br1br1lvicksbb.R.inc(15465);process(axiom);
        __CLR4_5_2br1br1lvicksbb.R.inc(15466);walkerCallback.ax = axiom;
        __CLR4_5_2br1br1lvicksbb.R.inc(15467);axiom.getClassExpression().accept(this);
        __CLR4_5_2br1br1lvicksbb.R.inc(15468);for (OWLObjectPropertyExpression prop : axiom
            .getObjectPropertyExpressions()) {{
            __CLR4_5_2br1br1lvicksbb.R.inc(15469);prop.accept(this);
        }
        }__CLR4_5_2br1br1lvicksbb.R.inc(15470);for (OWLDataPropertyExpression prop : axiom
            .getDataPropertyExpressions()) {{
            __CLR4_5_2br1br1lvicksbb.R.inc(15471);prop.accept(this);
        }
    }}finally{__CLR4_5_2br1br1lvicksbb.R.flushNeeded();}}

    @Override
    public void visit(OWLClass ce) {try{__CLR4_5_2br1br1lvicksbb.R.inc(15472);
        __CLR4_5_2br1br1lvicksbb.R.inc(15473);walkerCallback.pushClassExpression(ce);
        __CLR4_5_2br1br1lvicksbb.R.inc(15474);process(ce);
        __CLR4_5_2br1br1lvicksbb.R.inc(15475);ce.getIRI().accept(this);
        __CLR4_5_2br1br1lvicksbb.R.inc(15476);walkerCallback.popClassExpression();
    }finally{__CLR4_5_2br1br1lvicksbb.R.flushNeeded();}}

    @Override
    public void visit(OWLDataAllValuesFrom ce) {try{__CLR4_5_2br1br1lvicksbb.R.inc(15477);
        __CLR4_5_2br1br1lvicksbb.R.inc(15478);walkerCallback.pushClassExpression(ce);
        __CLR4_5_2br1br1lvicksbb.R.inc(15479);process(ce);
        __CLR4_5_2br1br1lvicksbb.R.inc(15480);ce.getProperty().accept(this);
        __CLR4_5_2br1br1lvicksbb.R.inc(15481);ce.getFiller().accept(this);
        __CLR4_5_2br1br1lvicksbb.R.inc(15482);walkerCallback.popClassExpression();
    }finally{__CLR4_5_2br1br1lvicksbb.R.flushNeeded();}}

    @Override
    public void visit(OWLDataExactCardinality ce) {try{__CLR4_5_2br1br1lvicksbb.R.inc(15483);
        __CLR4_5_2br1br1lvicksbb.R.inc(15484);walkerCallback.pushClassExpression(ce);
        __CLR4_5_2br1br1lvicksbb.R.inc(15485);process(ce);
        __CLR4_5_2br1br1lvicksbb.R.inc(15486);ce.getProperty().accept(this);
        __CLR4_5_2br1br1lvicksbb.R.inc(15487);ce.getFiller().accept(this);
        __CLR4_5_2br1br1lvicksbb.R.inc(15488);walkerCallback.popClassExpression();
    }finally{__CLR4_5_2br1br1lvicksbb.R.flushNeeded();}}

    @Override
    public void visit(OWLDataMaxCardinality ce) {try{__CLR4_5_2br1br1lvicksbb.R.inc(15489);
        __CLR4_5_2br1br1lvicksbb.R.inc(15490);walkerCallback.pushClassExpression(ce);
        __CLR4_5_2br1br1lvicksbb.R.inc(15491);process(ce);
        __CLR4_5_2br1br1lvicksbb.R.inc(15492);ce.getProperty().accept(this);
        __CLR4_5_2br1br1lvicksbb.R.inc(15493);ce.getFiller().accept(this);
        __CLR4_5_2br1br1lvicksbb.R.inc(15494);walkerCallback.popClassExpression();
    }finally{__CLR4_5_2br1br1lvicksbb.R.flushNeeded();}}

    @Override
    public void visit(OWLDataMinCardinality ce) {try{__CLR4_5_2br1br1lvicksbb.R.inc(15495);
        __CLR4_5_2br1br1lvicksbb.R.inc(15496);walkerCallback.pushClassExpression(ce);
        __CLR4_5_2br1br1lvicksbb.R.inc(15497);process(ce);
        __CLR4_5_2br1br1lvicksbb.R.inc(15498);ce.getProperty().accept(this);
        __CLR4_5_2br1br1lvicksbb.R.inc(15499);ce.getFiller().accept(this);
        __CLR4_5_2br1br1lvicksbb.R.inc(15500);walkerCallback.popClassExpression();
    }finally{__CLR4_5_2br1br1lvicksbb.R.flushNeeded();}}

    @Override
    public void visit(OWLDataSomeValuesFrom ce) {try{__CLR4_5_2br1br1lvicksbb.R.inc(15501);
        __CLR4_5_2br1br1lvicksbb.R.inc(15502);walkerCallback.pushClassExpression(ce);
        __CLR4_5_2br1br1lvicksbb.R.inc(15503);process(ce);
        __CLR4_5_2br1br1lvicksbb.R.inc(15504);ce.getProperty().accept(this);
        __CLR4_5_2br1br1lvicksbb.R.inc(15505);ce.getFiller().accept(this);
        __CLR4_5_2br1br1lvicksbb.R.inc(15506);walkerCallback.popClassExpression();
    }finally{__CLR4_5_2br1br1lvicksbb.R.flushNeeded();}}

    @Override
    public void visit(OWLDataHasValue ce) {try{__CLR4_5_2br1br1lvicksbb.R.inc(15507);
        __CLR4_5_2br1br1lvicksbb.R.inc(15508);walkerCallback.pushClassExpression(ce);
        __CLR4_5_2br1br1lvicksbb.R.inc(15509);process(ce);
        __CLR4_5_2br1br1lvicksbb.R.inc(15510);ce.getProperty().accept(this);
        __CLR4_5_2br1br1lvicksbb.R.inc(15511);ce.getFiller().accept(this);
        __CLR4_5_2br1br1lvicksbb.R.inc(15512);walkerCallback.popClassExpression();
    }finally{__CLR4_5_2br1br1lvicksbb.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectAllValuesFrom ce) {try{__CLR4_5_2br1br1lvicksbb.R.inc(15513);
        __CLR4_5_2br1br1lvicksbb.R.inc(15514);walkerCallback.pushClassExpression(ce);
        __CLR4_5_2br1br1lvicksbb.R.inc(15515);process(ce);
        __CLR4_5_2br1br1lvicksbb.R.inc(15516);ce.getProperty().accept(this);
        __CLR4_5_2br1br1lvicksbb.R.inc(15517);ce.getFiller().accept(this);
        __CLR4_5_2br1br1lvicksbb.R.inc(15518);walkerCallback.popClassExpression();
    }finally{__CLR4_5_2br1br1lvicksbb.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectComplementOf ce) {try{__CLR4_5_2br1br1lvicksbb.R.inc(15519);
        __CLR4_5_2br1br1lvicksbb.R.inc(15520);walkerCallback.pushClassExpression(ce);
        __CLR4_5_2br1br1lvicksbb.R.inc(15521);process(ce);
        __CLR4_5_2br1br1lvicksbb.R.inc(15522);ce.getOperand().accept(this);
        __CLR4_5_2br1br1lvicksbb.R.inc(15523);walkerCallback.popClassExpression();
    }finally{__CLR4_5_2br1br1lvicksbb.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectExactCardinality ce) {try{__CLR4_5_2br1br1lvicksbb.R.inc(15524);
        __CLR4_5_2br1br1lvicksbb.R.inc(15525);walkerCallback.pushClassExpression(ce);
        __CLR4_5_2br1br1lvicksbb.R.inc(15526);process(ce);
        __CLR4_5_2br1br1lvicksbb.R.inc(15527);ce.getProperty().accept(this);
        __CLR4_5_2br1br1lvicksbb.R.inc(15528);ce.getFiller().accept(this);
        __CLR4_5_2br1br1lvicksbb.R.inc(15529);walkerCallback.popClassExpression();
    }finally{__CLR4_5_2br1br1lvicksbb.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectIntersectionOf ce) {try{__CLR4_5_2br1br1lvicksbb.R.inc(15530);
        __CLR4_5_2br1br1lvicksbb.R.inc(15531);walkerCallback.pushClassExpression(ce);
        __CLR4_5_2br1br1lvicksbb.R.inc(15532);process(ce);
        __CLR4_5_2br1br1lvicksbb.R.inc(15533);for (OWLClassExpression op : ce.getOperands()) {{
            __CLR4_5_2br1br1lvicksbb.R.inc(15534);op.accept(this);
        }
        }__CLR4_5_2br1br1lvicksbb.R.inc(15535);walkerCallback.popClassExpression();
    }finally{__CLR4_5_2br1br1lvicksbb.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectMaxCardinality ce) {try{__CLR4_5_2br1br1lvicksbb.R.inc(15536);
        __CLR4_5_2br1br1lvicksbb.R.inc(15537);walkerCallback.pushClassExpression(ce);
        __CLR4_5_2br1br1lvicksbb.R.inc(15538);process(ce);
        __CLR4_5_2br1br1lvicksbb.R.inc(15539);ce.getProperty().accept(this);
        __CLR4_5_2br1br1lvicksbb.R.inc(15540);ce.getFiller().accept(this);
        __CLR4_5_2br1br1lvicksbb.R.inc(15541);walkerCallback.popClassExpression();
    }finally{__CLR4_5_2br1br1lvicksbb.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectMinCardinality ce) {try{__CLR4_5_2br1br1lvicksbb.R.inc(15542);
        __CLR4_5_2br1br1lvicksbb.R.inc(15543);walkerCallback.pushClassExpression(ce);
        __CLR4_5_2br1br1lvicksbb.R.inc(15544);process(ce);
        __CLR4_5_2br1br1lvicksbb.R.inc(15545);ce.getProperty().accept(this);
        __CLR4_5_2br1br1lvicksbb.R.inc(15546);ce.getFiller().accept(this);
        __CLR4_5_2br1br1lvicksbb.R.inc(15547);walkerCallback.popClassExpression();
    }finally{__CLR4_5_2br1br1lvicksbb.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectOneOf ce) {try{__CLR4_5_2br1br1lvicksbb.R.inc(15548);
        __CLR4_5_2br1br1lvicksbb.R.inc(15549);walkerCallback.pushClassExpression(ce);
        __CLR4_5_2br1br1lvicksbb.R.inc(15550);process(ce);
        __CLR4_5_2br1br1lvicksbb.R.inc(15551);for (OWLIndividual ind : ce.getIndividuals()) {{
            __CLR4_5_2br1br1lvicksbb.R.inc(15552);ind.accept(this);
        }
        }__CLR4_5_2br1br1lvicksbb.R.inc(15553);walkerCallback.popClassExpression();
    }finally{__CLR4_5_2br1br1lvicksbb.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectHasSelf ce) {try{__CLR4_5_2br1br1lvicksbb.R.inc(15554);
        __CLR4_5_2br1br1lvicksbb.R.inc(15555);walkerCallback.pushClassExpression(ce);
        __CLR4_5_2br1br1lvicksbb.R.inc(15556);process(ce);
        __CLR4_5_2br1br1lvicksbb.R.inc(15557);ce.getProperty().accept(this);
        __CLR4_5_2br1br1lvicksbb.R.inc(15558);walkerCallback.popClassExpression();
    }finally{__CLR4_5_2br1br1lvicksbb.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectSomeValuesFrom ce) {try{__CLR4_5_2br1br1lvicksbb.R.inc(15559);
        __CLR4_5_2br1br1lvicksbb.R.inc(15560);walkerCallback.pushClassExpression(ce);
        __CLR4_5_2br1br1lvicksbb.R.inc(15561);process(ce);
        __CLR4_5_2br1br1lvicksbb.R.inc(15562);ce.getProperty().accept(this);
        __CLR4_5_2br1br1lvicksbb.R.inc(15563);ce.getFiller().accept(this);
        __CLR4_5_2br1br1lvicksbb.R.inc(15564);walkerCallback.popClassExpression();
    }finally{__CLR4_5_2br1br1lvicksbb.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectUnionOf ce) {try{__CLR4_5_2br1br1lvicksbb.R.inc(15565);
        __CLR4_5_2br1br1lvicksbb.R.inc(15566);walkerCallback.pushClassExpression(ce);
        __CLR4_5_2br1br1lvicksbb.R.inc(15567);process(ce);
        __CLR4_5_2br1br1lvicksbb.R.inc(15568);for (OWLClassExpression op : ce.getOperands()) {{
            __CLR4_5_2br1br1lvicksbb.R.inc(15569);op.accept(this);
        }
        }__CLR4_5_2br1br1lvicksbb.R.inc(15570);walkerCallback.popClassExpression();
    }finally{__CLR4_5_2br1br1lvicksbb.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectHasValue ce) {try{__CLR4_5_2br1br1lvicksbb.R.inc(15571);
        __CLR4_5_2br1br1lvicksbb.R.inc(15572);walkerCallback.pushClassExpression(ce);
        __CLR4_5_2br1br1lvicksbb.R.inc(15573);process(ce);
        __CLR4_5_2br1br1lvicksbb.R.inc(15574);ce.getProperty().accept(this);
        __CLR4_5_2br1br1lvicksbb.R.inc(15575);ce.getFiller().accept(this);
        __CLR4_5_2br1br1lvicksbb.R.inc(15576);walkerCallback.popClassExpression();
    }finally{__CLR4_5_2br1br1lvicksbb.R.flushNeeded();}}

    @Override
    public void visit(OWLDataComplementOf node) {try{__CLR4_5_2br1br1lvicksbb.R.inc(15577);
        __CLR4_5_2br1br1lvicksbb.R.inc(15578);walkerCallback.pushDataRange(node);
        __CLR4_5_2br1br1lvicksbb.R.inc(15579);process(node);
        __CLR4_5_2br1br1lvicksbb.R.inc(15580);node.getDataRange().accept(this);
        __CLR4_5_2br1br1lvicksbb.R.inc(15581);walkerCallback.popDataRange();
    }finally{__CLR4_5_2br1br1lvicksbb.R.flushNeeded();}}

    @Override
    public void visit(OWLDataOneOf node) {try{__CLR4_5_2br1br1lvicksbb.R.inc(15582);
        __CLR4_5_2br1br1lvicksbb.R.inc(15583);walkerCallback.pushDataRange(node);
        __CLR4_5_2br1br1lvicksbb.R.inc(15584);process(node);
        __CLR4_5_2br1br1lvicksbb.R.inc(15585);for (OWLLiteral con : node.getValues()) {{
            __CLR4_5_2br1br1lvicksbb.R.inc(15586);con.accept(this);
        }
        }__CLR4_5_2br1br1lvicksbb.R.inc(15587);walkerCallback.popDataRange();
    }finally{__CLR4_5_2br1br1lvicksbb.R.flushNeeded();}}

    @Override
    public void visit(OWLDataIntersectionOf node) {try{__CLR4_5_2br1br1lvicksbb.R.inc(15588);
        __CLR4_5_2br1br1lvicksbb.R.inc(15589);walkerCallback.pushDataRange(node);
        __CLR4_5_2br1br1lvicksbb.R.inc(15590);process(node);
        __CLR4_5_2br1br1lvicksbb.R.inc(15591);for (OWLDataRange rng : node.getOperands()) {{
            __CLR4_5_2br1br1lvicksbb.R.inc(15592);rng.accept(this);
        }
        }__CLR4_5_2br1br1lvicksbb.R.inc(15593);walkerCallback.popDataRange();
    }finally{__CLR4_5_2br1br1lvicksbb.R.flushNeeded();}}

    @Override
    public void visit(OWLDataUnionOf node) {try{__CLR4_5_2br1br1lvicksbb.R.inc(15594);
        __CLR4_5_2br1br1lvicksbb.R.inc(15595);walkerCallback.pushDataRange(node);
        __CLR4_5_2br1br1lvicksbb.R.inc(15596);process(node);
        __CLR4_5_2br1br1lvicksbb.R.inc(15597);for (OWLDataRange rng : node.getOperands()) {{
            __CLR4_5_2br1br1lvicksbb.R.inc(15598);rng.accept(this);
        }
        }__CLR4_5_2br1br1lvicksbb.R.inc(15599);walkerCallback.popDataRange();
    }finally{__CLR4_5_2br1br1lvicksbb.R.flushNeeded();}}

    @Override
    public void visit(OWLFacetRestriction node) {try{__CLR4_5_2br1br1lvicksbb.R.inc(15600);
        __CLR4_5_2br1br1lvicksbb.R.inc(15601);process(node);
        __CLR4_5_2br1br1lvicksbb.R.inc(15602);node.getFacetValue().accept(this);
    }finally{__CLR4_5_2br1br1lvicksbb.R.flushNeeded();}}

    @Override
    public void visit(OWLDatatypeRestriction node) {try{__CLR4_5_2br1br1lvicksbb.R.inc(15603);
        __CLR4_5_2br1br1lvicksbb.R.inc(15604);walkerCallback.pushDataRange(node);
        __CLR4_5_2br1br1lvicksbb.R.inc(15605);process(node);
        __CLR4_5_2br1br1lvicksbb.R.inc(15606);node.getDatatype().accept(this);
        __CLR4_5_2br1br1lvicksbb.R.inc(15607);for (OWLFacetRestriction fr : node.getFacetRestrictions()) {{
            __CLR4_5_2br1br1lvicksbb.R.inc(15608);fr.accept(this);
        }
        }__CLR4_5_2br1br1lvicksbb.R.inc(15609);walkerCallback.popDataRange();
    }finally{__CLR4_5_2br1br1lvicksbb.R.flushNeeded();}}

    @Override
    public void visit(OWLDatatype node) {try{__CLR4_5_2br1br1lvicksbb.R.inc(15610);
        __CLR4_5_2br1br1lvicksbb.R.inc(15611);walkerCallback.pushDataRange(node);
        __CLR4_5_2br1br1lvicksbb.R.inc(15612);process(node);
        __CLR4_5_2br1br1lvicksbb.R.inc(15613);walkerCallback.popDataRange();
    }finally{__CLR4_5_2br1br1lvicksbb.R.flushNeeded();}}

    @Override
    public void visit(OWLLiteral node) {try{__CLR4_5_2br1br1lvicksbb.R.inc(15614);
        __CLR4_5_2br1br1lvicksbb.R.inc(15615);process(node);
        __CLR4_5_2br1br1lvicksbb.R.inc(15616);node.getDatatype().accept(this);
        __CLR4_5_2br1br1lvicksbb.R.inc(15617);walkerCallback.popDataRange();
    }finally{__CLR4_5_2br1br1lvicksbb.R.flushNeeded();}}

    @Override
    public void visit(OWLAnnotationProperty property) {try{__CLR4_5_2br1br1lvicksbb.R.inc(15618);
        __CLR4_5_2br1br1lvicksbb.R.inc(15619);process(property);
        __CLR4_5_2br1br1lvicksbb.R.inc(15620);property.getIRI().accept(this);
    }finally{__CLR4_5_2br1br1lvicksbb.R.flushNeeded();}}

    @Override
    public void visit(OWLDataProperty property) {try{__CLR4_5_2br1br1lvicksbb.R.inc(15621);
        __CLR4_5_2br1br1lvicksbb.R.inc(15622);process(property);
        __CLR4_5_2br1br1lvicksbb.R.inc(15623);property.getIRI().accept(this);
    }finally{__CLR4_5_2br1br1lvicksbb.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectProperty property) {try{__CLR4_5_2br1br1lvicksbb.R.inc(15624);
        __CLR4_5_2br1br1lvicksbb.R.inc(15625);process(property);
        __CLR4_5_2br1br1lvicksbb.R.inc(15626);property.getIRI().accept(this);
    }finally{__CLR4_5_2br1br1lvicksbb.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectInverseOf property) {try{__CLR4_5_2br1br1lvicksbb.R.inc(15627);
        __CLR4_5_2br1br1lvicksbb.R.inc(15628);process(property);
        __CLR4_5_2br1br1lvicksbb.R.inc(15629);property.getInverse().accept(this);
    }finally{__CLR4_5_2br1br1lvicksbb.R.flushNeeded();}}

    @Override
    public void visit(OWLNamedIndividual individual) {try{__CLR4_5_2br1br1lvicksbb.R.inc(15630);
        __CLR4_5_2br1br1lvicksbb.R.inc(15631);process(individual);
        __CLR4_5_2br1br1lvicksbb.R.inc(15632);individual.getIRI().accept(this);
    }finally{__CLR4_5_2br1br1lvicksbb.R.flushNeeded();}}

    @Override
    public void visit(OWLAnonymousIndividual individual) {try{__CLR4_5_2br1br1lvicksbb.R.inc(15633);
        __CLR4_5_2br1br1lvicksbb.R.inc(15634);process(individual);
    }finally{__CLR4_5_2br1br1lvicksbb.R.flushNeeded();}}

    @Override
    public void visit(SWRLLiteralArgument node) {try{__CLR4_5_2br1br1lvicksbb.R.inc(15635);
        __CLR4_5_2br1br1lvicksbb.R.inc(15636);process(node);
        __CLR4_5_2br1br1lvicksbb.R.inc(15637);node.getLiteral().accept(this);
    }finally{__CLR4_5_2br1br1lvicksbb.R.flushNeeded();}}

    @Override
    public void visit(SWRLVariable node) {try{__CLR4_5_2br1br1lvicksbb.R.inc(15638);
        __CLR4_5_2br1br1lvicksbb.R.inc(15639);process(node);
    }finally{__CLR4_5_2br1br1lvicksbb.R.flushNeeded();}}

    @Override
    public void visit(SWRLIndividualArgument node) {try{__CLR4_5_2br1br1lvicksbb.R.inc(15640);
        __CLR4_5_2br1br1lvicksbb.R.inc(15641);process(node);
        __CLR4_5_2br1br1lvicksbb.R.inc(15642);node.getIndividual().accept(this);
    }finally{__CLR4_5_2br1br1lvicksbb.R.flushNeeded();}}

    @Override
    public void visit(SWRLBuiltInAtom node) {try{__CLR4_5_2br1br1lvicksbb.R.inc(15643);
        __CLR4_5_2br1br1lvicksbb.R.inc(15644);process(node);
        __CLR4_5_2br1br1lvicksbb.R.inc(15645);for (SWRLDArgument at : node.getArguments()) {{
            __CLR4_5_2br1br1lvicksbb.R.inc(15646);at.accept(this);
        }
    }}finally{__CLR4_5_2br1br1lvicksbb.R.flushNeeded();}}

    @Override
    public void visit(SWRLClassAtom node) {try{__CLR4_5_2br1br1lvicksbb.R.inc(15647);
        __CLR4_5_2br1br1lvicksbb.R.inc(15648);process(node);
        __CLR4_5_2br1br1lvicksbb.R.inc(15649);node.getArgument().accept(this);
        __CLR4_5_2br1br1lvicksbb.R.inc(15650);node.getPredicate().accept(this);
    }finally{__CLR4_5_2br1br1lvicksbb.R.flushNeeded();}}

    @Override
    public void visit(SWRLDataRangeAtom node) {try{__CLR4_5_2br1br1lvicksbb.R.inc(15651);
        __CLR4_5_2br1br1lvicksbb.R.inc(15652);process(node);
        __CLR4_5_2br1br1lvicksbb.R.inc(15653);node.getArgument().accept(this);
        __CLR4_5_2br1br1lvicksbb.R.inc(15654);node.getPredicate().accept(this);
    }finally{__CLR4_5_2br1br1lvicksbb.R.flushNeeded();}}

    @Override
    public void visit(SWRLDataPropertyAtom node) {try{__CLR4_5_2br1br1lvicksbb.R.inc(15655);
        __CLR4_5_2br1br1lvicksbb.R.inc(15656);process(node);
        __CLR4_5_2br1br1lvicksbb.R.inc(15657);node.getPredicate().accept(this);
        __CLR4_5_2br1br1lvicksbb.R.inc(15658);node.getFirstArgument().accept(this);
        __CLR4_5_2br1br1lvicksbb.R.inc(15659);node.getSecondArgument().accept(this);
    }finally{__CLR4_5_2br1br1lvicksbb.R.flushNeeded();}}

    @Override
    public void visit(SWRLDifferentIndividualsAtom node) {try{__CLR4_5_2br1br1lvicksbb.R.inc(15660);
        __CLR4_5_2br1br1lvicksbb.R.inc(15661);process(node);
        __CLR4_5_2br1br1lvicksbb.R.inc(15662);node.getFirstArgument().accept(this);
        __CLR4_5_2br1br1lvicksbb.R.inc(15663);node.getSecondArgument().accept(this);
    }finally{__CLR4_5_2br1br1lvicksbb.R.flushNeeded();}}

    @Override
    public void visit(SWRLObjectPropertyAtom node) {try{__CLR4_5_2br1br1lvicksbb.R.inc(15664);
        __CLR4_5_2br1br1lvicksbb.R.inc(15665);process(node);
        __CLR4_5_2br1br1lvicksbb.R.inc(15666);node.getPredicate().accept(this);
        __CLR4_5_2br1br1lvicksbb.R.inc(15667);node.getFirstArgument().accept(this);
        __CLR4_5_2br1br1lvicksbb.R.inc(15668);node.getSecondArgument().accept(this);
    }finally{__CLR4_5_2br1br1lvicksbb.R.flushNeeded();}}

    @Override
    public void visit(SWRLSameIndividualAtom node) {try{__CLR4_5_2br1br1lvicksbb.R.inc(15669);
        __CLR4_5_2br1br1lvicksbb.R.inc(15670);process(node);
        __CLR4_5_2br1br1lvicksbb.R.inc(15671);node.getFirstArgument().accept(this);
        __CLR4_5_2br1br1lvicksbb.R.inc(15672);node.getSecondArgument().accept(this);
    }finally{__CLR4_5_2br1br1lvicksbb.R.flushNeeded();}}

    @Override
    public void visit(OWLDatatypeDefinitionAxiom axiom) {try{__CLR4_5_2br1br1lvicksbb.R.inc(15673);
        __CLR4_5_2br1br1lvicksbb.R.inc(15674);process(axiom);
        __CLR4_5_2br1br1lvicksbb.R.inc(15675);walkerCallback.ax = axiom;
        __CLR4_5_2br1br1lvicksbb.R.inc(15676);axiom.getDatatype().accept(this);
        __CLR4_5_2br1br1lvicksbb.R.inc(15677);axiom.getDataRange().accept(this);
    }finally{__CLR4_5_2br1br1lvicksbb.R.flushNeeded();}}
}
