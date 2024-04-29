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
package org.semanticweb.owlapi.search;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.semanticweb.owlapi.model.*;

/**
 * A collection of static search utilities.
 * 
 * @author ignazio
 */
public final class Searcher {public static class __CLR4_5_24l04l0lvickox6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0061\u0070\u0069\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237201267L,8589935092L,6136,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private Searcher() {try{__CLR4_5_24l04l0lvickox6.R.inc(5940);}finally{__CLR4_5_24l04l0lvickox6.R.flushNeeded();}}

    /**
     * Retrieve literals from a collection of assertions.
     * 
     * @param axioms
     *        axioms
     * @param p
     *        optional property to match. Null means all.
     * @return literals
     */
    @Nonnull
    public static Collection<OWLLiteral> values(@Nonnull Collection<OWLDataPropertyAssertionAxiom> axioms,
        @Nullable OWLDataPropertyExpression p) {try{__CLR4_5_24l04l0lvickox6.R.inc(5941);
        __CLR4_5_24l04l0lvickox6.R.inc(5942);Set<OWLLiteral> literals = new HashSet<>();
        __CLR4_5_24l04l0lvickox6.R.inc(5943);for (OWLDataPropertyAssertionAxiom ax : axioms) {{
            __CLR4_5_24l04l0lvickox6.R.inc(5944);if ((((p == null || ax.getProperty().equals(p))&&(__CLR4_5_24l04l0lvickox6.R.iget(5945)!=0|true))||(__CLR4_5_24l04l0lvickox6.R.iget(5946)==0&false))) {{
                __CLR4_5_24l04l0lvickox6.R.inc(5947);literals.add(ax.getObject());
            }
        }}
        }__CLR4_5_24l04l0lvickox6.R.inc(5948);return literals;
    }finally{__CLR4_5_24l04l0lvickox6.R.flushNeeded();}}

    /**
     * Retrieve objects from a collection of assertions.
     * 
     * @param axioms
     *        axioms
     * @param p
     *        optional property to match. Null means all.
     * @return objects
     */
    @Nonnull
    public static Collection<OWLIndividual> values(@Nonnull Collection<OWLObjectPropertyAssertionAxiom> axioms,
        @Nullable OWLObjectPropertyExpression p) {try{__CLR4_5_24l04l0lvickox6.R.inc(5949);
        __CLR4_5_24l04l0lvickox6.R.inc(5950);Set<OWLIndividual> objects = new HashSet<>();
        __CLR4_5_24l04l0lvickox6.R.inc(5951);for (OWLObjectPropertyAssertionAxiom ax : axioms) {{
            __CLR4_5_24l04l0lvickox6.R.inc(5952);if ((((p == null || ax.getProperty().equals(p))&&(__CLR4_5_24l04l0lvickox6.R.iget(5953)!=0|true))||(__CLR4_5_24l04l0lvickox6.R.iget(5954)==0&false))) {{
                __CLR4_5_24l04l0lvickox6.R.inc(5955);objects.add(ax.getObject());
            }
        }}
        }__CLR4_5_24l04l0lvickox6.R.inc(5956);return objects;
    }finally{__CLR4_5_24l04l0lvickox6.R.flushNeeded();}}

    /**
     * Retrieve literals from a collection of negative assertions.
     * 
     * @param axioms
     *        axioms
     * @param p
     *        optional property to match. Null means all.
     * @return literals
     */
    @Nonnull
    public static Collection<OWLLiteral> negValues(@Nonnull Collection<OWLNegativeDataPropertyAssertionAxiom> axioms,
        @Nullable OWLDataPropertyExpression p) {try{__CLR4_5_24l04l0lvickox6.R.inc(5957);
        __CLR4_5_24l04l0lvickox6.R.inc(5958);Set<OWLLiteral> literals = new HashSet<>();
        __CLR4_5_24l04l0lvickox6.R.inc(5959);for (OWLNegativeDataPropertyAssertionAxiom ax : axioms) {{
            __CLR4_5_24l04l0lvickox6.R.inc(5960);if ((((p == null || ax.getProperty().equals(p))&&(__CLR4_5_24l04l0lvickox6.R.iget(5961)!=0|true))||(__CLR4_5_24l04l0lvickox6.R.iget(5962)==0&false))) {{
                __CLR4_5_24l04l0lvickox6.R.inc(5963);literals.add(ax.getObject());
            }
        }}
        }__CLR4_5_24l04l0lvickox6.R.inc(5964);return literals;
    }finally{__CLR4_5_24l04l0lvickox6.R.flushNeeded();}}

    /**
     * Retrieve objects from a collection of negative assertions.
     * 
     * @param axioms
     *        axioms
     * @param p
     *        optional property to match. Null means all.
     * @return objects
     */
    @Nonnull
    public static Collection<OWLIndividual> negValues(
        @Nonnull Collection<OWLNegativeObjectPropertyAssertionAxiom> axioms, @Nullable OWLObjectPropertyExpression p) {try{__CLR4_5_24l04l0lvickox6.R.inc(5965);
        __CLR4_5_24l04l0lvickox6.R.inc(5966);Set<OWLIndividual> objects = new HashSet<>();
        __CLR4_5_24l04l0lvickox6.R.inc(5967);for (OWLNegativeObjectPropertyAssertionAxiom ax : axioms) {{
            __CLR4_5_24l04l0lvickox6.R.inc(5968);if ((((p == null || ax.getProperty().equals(p))&&(__CLR4_5_24l04l0lvickox6.R.iget(5969)!=0|true))||(__CLR4_5_24l04l0lvickox6.R.iget(5970)==0&false))) {{
                __CLR4_5_24l04l0lvickox6.R.inc(5971);objects.add(ax.getObject());
            }
        }}
        }__CLR4_5_24l04l0lvickox6.R.inc(5972);return objects;
    }finally{__CLR4_5_24l04l0lvickox6.R.flushNeeded();}}

    /**
     * Retrieve classes from class assertions.
     * 
     * @param axioms
     *        axioms
     * @return classes
     */
    @Nonnull
    public static Collection<OWLClassExpression> types(@Nonnull Collection<OWLClassAssertionAxiom> axioms) {try{__CLR4_5_24l04l0lvickox6.R.inc(5973);
        __CLR4_5_24l04l0lvickox6.R.inc(5974);Set<OWLClassExpression> objects = new HashSet<>();
        __CLR4_5_24l04l0lvickox6.R.inc(5975);for (OWLClassAssertionAxiom ax : axioms) {{
            __CLR4_5_24l04l0lvickox6.R.inc(5976);objects.add(ax.getClassExpression());
        }
        }__CLR4_5_24l04l0lvickox6.R.inc(5977);return objects;
    }finally{__CLR4_5_24l04l0lvickox6.R.flushNeeded();}}

    /**
     * Retrieve individuals from class assertions.
     * 
     * @param axioms
     *        axioms
     * @return individuals
     */
    @Nonnull
    public static Collection<OWLIndividual> instances(@Nonnull Collection<OWLClassAssertionAxiom> axioms) {try{__CLR4_5_24l04l0lvickox6.R.inc(5978);
        __CLR4_5_24l04l0lvickox6.R.inc(5979);Set<OWLIndividual> objects = new HashSet<>();
        __CLR4_5_24l04l0lvickox6.R.inc(5980);for (OWLClassAssertionAxiom ax : axioms) {{
            __CLR4_5_24l04l0lvickox6.R.inc(5981);objects.add(ax.getIndividual());
        }
        }__CLR4_5_24l04l0lvickox6.R.inc(5982);return objects;
    }finally{__CLR4_5_24l04l0lvickox6.R.flushNeeded();}}

    /**
     * Retrieve inverses from a collection of inverse axioms.
     * 
     * @param axioms
     *        axioms to check
     * @param p
     *        property to match; not returned in the set
     * @return inverses of p
     */
    @Nonnull
    public static Collection<OWLObjectPropertyExpression> inverse(
        @Nonnull Collection<OWLInverseObjectPropertiesAxiom> axioms, @Nonnull OWLObjectPropertyExpression p) {try{__CLR4_5_24l04l0lvickox6.R.inc(5983);
        __CLR4_5_24l04l0lvickox6.R.inc(5984);List<OWLObjectPropertyExpression> toReturn = new ArrayList<>();
        __CLR4_5_24l04l0lvickox6.R.inc(5985);for (OWLInverseObjectPropertiesAxiom ax : axioms) {{
            __CLR4_5_24l04l0lvickox6.R.inc(5986);if ((((ax.getFirstProperty().equals(p))&&(__CLR4_5_24l04l0lvickox6.R.iget(5987)!=0|true))||(__CLR4_5_24l04l0lvickox6.R.iget(5988)==0&false))) {{
                __CLR4_5_24l04l0lvickox6.R.inc(5989);toReturn.add(ax.getSecondProperty());
            } }else {{
                __CLR4_5_24l04l0lvickox6.R.inc(5990);toReturn.add(ax.getFirstProperty());
            }
        }}
        }__CLR4_5_24l04l0lvickox6.R.inc(5991);return toReturn;
    }finally{__CLR4_5_24l04l0lvickox6.R.flushNeeded();}}

    /**
     * Retrieve annotation values from annotations
     * 
     * @param annotations
     *        annotations
     * @return annotation values
     */
    @Nonnull
    public static Collection<OWLAnnotationValue> values(@Nonnull Collection<OWLAnnotation> annotations) {try{__CLR4_5_24l04l0lvickox6.R.inc(5992);
        __CLR4_5_24l04l0lvickox6.R.inc(5993);return values(annotations, null);
    }finally{__CLR4_5_24l04l0lvickox6.R.flushNeeded();}}

    /**
     * Retrieve annotation values from annotations
     * 
     * @param annotations
     *        annotations
     * @param p
     *        optional annotation property to filter. Null means all.
     * @return annotation values
     */
    @Nonnull
    public static Collection<OWLAnnotationValue> values(@Nonnull Collection<OWLAnnotation> annotations,
        @Nullable OWLAnnotationProperty p) {try{__CLR4_5_24l04l0lvickox6.R.inc(5994);
        __CLR4_5_24l04l0lvickox6.R.inc(5995);Set<OWLAnnotationValue> toReturn = new HashSet<>();
        __CLR4_5_24l04l0lvickox6.R.inc(5996);for (OWLAnnotation ax : annotations) {{
            __CLR4_5_24l04l0lvickox6.R.inc(5997);if ((((p == null || ax.getProperty().equals(p))&&(__CLR4_5_24l04l0lvickox6.R.iget(5998)!=0|true))||(__CLR4_5_24l04l0lvickox6.R.iget(5999)==0&false))) {{
                __CLR4_5_24l04l0lvickox6.R.inc(6000);toReturn.add(ax.getValue());
            }
        }}
        }__CLR4_5_24l04l0lvickox6.R.inc(6001);return toReturn;
    }finally{__CLR4_5_24l04l0lvickox6.R.flushNeeded();}}

    /**
     * Retrieve annotations from a collection of axioms. For regular axioms,
     * their annotations are retrieved; for annotation assertion axioms, their
     * asserted annotation is retrieved as well.
     * 
     * @param axioms
     *        axioms
     * @return annotations
     */
    @Nonnull
    public static Collection<OWLAnnotation> annotations(@Nonnull Collection<? extends OWLAxiom> axioms) {try{__CLR4_5_24l04l0lvickox6.R.inc(6002);
        __CLR4_5_24l04l0lvickox6.R.inc(6003);return annotations(axioms, null);
    }finally{__CLR4_5_24l04l0lvickox6.R.flushNeeded();}}

    /**
     * Retrieve annotations from a collection of annotation assertion axioms.
     * 
     * @param axioms
     *        axioms
     * @param p
     *        optional annotation property to filter. Null means all.
     * @return annotations
     */
    @Nonnull
    public static Collection<OWLAnnotation> annotationObjects(@Nonnull Collection<OWLAnnotationAssertionAxiom> axioms,
        @Nullable OWLAnnotationProperty p) {try{__CLR4_5_24l04l0lvickox6.R.inc(6004);
        __CLR4_5_24l04l0lvickox6.R.inc(6005);Set<OWLAnnotation> toReturn = new HashSet<>();
        __CLR4_5_24l04l0lvickox6.R.inc(6006);for (OWLAnnotationAssertionAxiom ax : axioms) {{
            assert (((ax != null)&&(__CLR4_5_24l04l0lvickox6.R.iget(6007)!=0|true))||(__CLR4_5_24l04l0lvickox6.R.iget(6008)==0&false));
            __CLR4_5_24l04l0lvickox6.R.inc(6009);OWLAnnotation c = ax.getAnnotation();
            __CLR4_5_24l04l0lvickox6.R.inc(6010);if ((((p == null || c.getProperty().equals(p))&&(__CLR4_5_24l04l0lvickox6.R.iget(6011)!=0|true))||(__CLR4_5_24l04l0lvickox6.R.iget(6012)==0&false))) {{
                __CLR4_5_24l04l0lvickox6.R.inc(6013);toReturn.add(c);
            }
        }}
        }__CLR4_5_24l04l0lvickox6.R.inc(6014);return toReturn;
    }finally{__CLR4_5_24l04l0lvickox6.R.flushNeeded();}}

    /**
     * Retrieve annotations from a collection of annotation assertion axioms.
     * 
     * @param axioms
     *        axioms
     * @return annotations
     */
    @Nonnull
    public static Collection<OWLAnnotation> annotationObjects(@Nonnull Collection<OWLAnnotationAssertionAxiom> axioms) {try{__CLR4_5_24l04l0lvickox6.R.inc(6015);
        __CLR4_5_24l04l0lvickox6.R.inc(6016);Set<OWLAnnotation> toReturn = new HashSet<>();
        __CLR4_5_24l04l0lvickox6.R.inc(6017);for (OWLAnnotationAssertionAxiom ax : axioms) {{
            assert (((ax != null)&&(__CLR4_5_24l04l0lvickox6.R.iget(6018)!=0|true))||(__CLR4_5_24l04l0lvickox6.R.iget(6019)==0&false));
            __CLR4_5_24l04l0lvickox6.R.inc(6020);toReturn.add(ax.getAnnotation());
        }
        }__CLR4_5_24l04l0lvickox6.R.inc(6021);return toReturn;
    }finally{__CLR4_5_24l04l0lvickox6.R.flushNeeded();}}

    /**
     * Retrieve the annotation from an annotation assertion axiom.
     * 
     * @param axiom
     *        axiom
     * @param p
     *        optional annotation property to filter. Null means all.
     * @return annotations
     */
    public static OWLAnnotation annotationObject(@Nonnull OWLAnnotationAssertionAxiom axiom,
        @Nullable OWLAnnotationProperty p) {try{__CLR4_5_24l04l0lvickox6.R.inc(6022);
        __CLR4_5_24l04l0lvickox6.R.inc(6023);if ((((p == null || axiom.getProperty().equals(p))&&(__CLR4_5_24l04l0lvickox6.R.iget(6024)!=0|true))||(__CLR4_5_24l04l0lvickox6.R.iget(6025)==0&false))) {{
            __CLR4_5_24l04l0lvickox6.R.inc(6026);return axiom.getAnnotation();
        }
        }__CLR4_5_24l04l0lvickox6.R.inc(6027);return null;
    }finally{__CLR4_5_24l04l0lvickox6.R.flushNeeded();}}

    /**
     * Retrieve annotations from a collection of axioms. For regular axioms,
     * their annotations are retrieved; for annotation assertion axioms, their
     * asserted annotation is retrieved as well.
     * 
     * @param axioms
     *        axioms
     * @param p
     *        optional annotation property to filter. Null means all.
     * @return annotations
     */
    @Nonnull
    public static Collection<OWLAnnotation> annotations(@Nonnull Collection<? extends OWLAxiom> axioms,
        @Nullable OWLAnnotationProperty p) {try{__CLR4_5_24l04l0lvickox6.R.inc(6028);
        __CLR4_5_24l04l0lvickox6.R.inc(6029);Set<OWLAnnotation> toReturn = new HashSet<>();
        __CLR4_5_24l04l0lvickox6.R.inc(6030);for (OWLAxiom ax : axioms) {{
            assert (((ax != null)&&(__CLR4_5_24l04l0lvickox6.R.iget(6031)!=0|true))||(__CLR4_5_24l04l0lvickox6.R.iget(6032)==0&false));
            __CLR4_5_24l04l0lvickox6.R.inc(6033);Set<OWLAnnotation> c = annotations(ax, p);
            __CLR4_5_24l04l0lvickox6.R.inc(6034);toReturn.addAll(c);
        }
        }__CLR4_5_24l04l0lvickox6.R.inc(6035);return toReturn;
    }finally{__CLR4_5_24l04l0lvickox6.R.flushNeeded();}}

    /**
     * Retrieve annotations from an axiom. For regular axioms, their annotations
     * are retrieved; for annotation assertion axioms, their asserted annotation
     * is retrieved as well.
     * 
     * @param axiom
     *        axiom
     * @param p
     *        optional annotation property to filter. Null means all.
     * @return annotations
     */
    @Nonnull
    public static Set<OWLAnnotation> annotations(@Nonnull OWLAxiom axiom, @Nullable OWLAnnotationProperty p) {try{__CLR4_5_24l04l0lvickox6.R.inc(6036);
        __CLR4_5_24l04l0lvickox6.R.inc(6037);Set<OWLAnnotation> set = new HashSet<>();
        __CLR4_5_24l04l0lvickox6.R.inc(6038);if ((((axiom instanceof OWLAnnotationAssertionAxiom)&&(__CLR4_5_24l04l0lvickox6.R.iget(6039)!=0|true))||(__CLR4_5_24l04l0lvickox6.R.iget(6040)==0&false))) {{
            __CLR4_5_24l04l0lvickox6.R.inc(6041);if ((((p == null || ((OWLAnnotationAssertionAxiom) axiom).getProperty().equals(p))&&(__CLR4_5_24l04l0lvickox6.R.iget(6042)!=0|true))||(__CLR4_5_24l04l0lvickox6.R.iget(6043)==0&false))) {{
                __CLR4_5_24l04l0lvickox6.R.inc(6044);set.add(((OWLAnnotationAssertionAxiom) axiom).getAnnotation());
            }
        }}
        }__CLR4_5_24l04l0lvickox6.R.inc(6045);if ((((p != null)&&(__CLR4_5_24l04l0lvickox6.R.iget(6046)!=0|true))||(__CLR4_5_24l04l0lvickox6.R.iget(6047)==0&false))) {{
            __CLR4_5_24l04l0lvickox6.R.inc(6048);set.addAll(axiom.getAnnotations(p));
        } }else {{
            __CLR4_5_24l04l0lvickox6.R.inc(6049);set.addAll(axiom.getAnnotations());
        }
        }__CLR4_5_24l04l0lvickox6.R.inc(6050);return set;
    }finally{__CLR4_5_24l04l0lvickox6.R.flushNeeded();}}

    /**
     * Retrieve equivalent entities from axioms, including individuals from
     * sameAs axioms. A mixture of axiom types can be passed in, as long as the
     * entity type they contain is compatible with the return type for the
     * collection.
     * 
     * @param <C>
     *        returned type
     * @param axioms
     *        axioms
     * @return equivalent entities
     */
    @Nonnull
    @SuppressWarnings("unchecked")
    public static <C extends OWLObject> Collection<C> equivalent(@Nonnull Collection<? extends OWLAxiom> axioms) {try{__CLR4_5_24l04l0lvickox6.R.inc(6051);
        __CLR4_5_24l04l0lvickox6.R.inc(6052);return (Collection<C>) equivalent(axioms, OWLObject.class);
    }finally{__CLR4_5_24l04l0lvickox6.R.flushNeeded();}}

    /**
     * Retrieve equivalent entities from axioms, including individuals from
     * sameAs axioms. A mixture of axiom types can be passed in, as long as the
     * entity type they contain is compatible with the return type for the
     * collection.
     * 
     * @param <C>
     *        returned type
     * @param axioms
     *        axioms
     * @param type
     *        type contained in the returned collection
     * @return equivalent entities
     */
    @Nonnull
    public static <C extends OWLObject> Collection<C> equivalent(@Nonnull Collection<? extends OWLAxiom> axioms,
        @SuppressWarnings("unused") @Nonnull Class<C> type) {try{__CLR4_5_24l04l0lvickox6.R.inc(6053);
        __CLR4_5_24l04l0lvickox6.R.inc(6054);Set<C> toReturn = new HashSet<>();
        __CLR4_5_24l04l0lvickox6.R.inc(6055);for (OWLAxiom ax : axioms) {{
            assert (((ax != null)&&(__CLR4_5_24l04l0lvickox6.R.iget(6056)!=0|true))||(__CLR4_5_24l04l0lvickox6.R.iget(6057)==0&false));
            __CLR4_5_24l04l0lvickox6.R.inc(6058);Set<C> c = equivalent(ax);
            __CLR4_5_24l04l0lvickox6.R.inc(6059);toReturn.addAll(c);
        }
        }__CLR4_5_24l04l0lvickox6.R.inc(6060);return toReturn;
    }finally{__CLR4_5_24l04l0lvickox6.R.flushNeeded();}}

    /**
     * Retrieve equivalent entities from an axiom, including individuals from
     * sameAs axioms.
     * 
     * @param axiom
     *        axiom
     * @param <C>
     *        type contained in the returned collection
     * @return equivalent entities
     */
    @Nonnull
    public static <C extends OWLObject> Set<C> equivalent(@Nonnull OWLAxiom axiom) {try{__CLR4_5_24l04l0lvickox6.R.inc(6061);
        __CLR4_5_24l04l0lvickox6.R.inc(6062);return axiom.accept(new EquivalentVisitor<C>(true));
    }finally{__CLR4_5_24l04l0lvickox6.R.flushNeeded();}}

    /**
     * Retrieve disjoint entities from axioms, including individuals from
     * differentFrom axioms. A mixture of axiom types can be passed in, as long
     * as the entity type they contain is compatible with the return type for
     * the collection.
     * 
     * @param <C>
     *        returned type
     * @param axioms
     *        axioms
     * @return disjoint entities
     */
    @Nonnull
    @SuppressWarnings("unchecked")
    public static <C extends OWLObject> Collection<C> different(@Nonnull Collection<? extends OWLAxiom> axioms) {try{__CLR4_5_24l04l0lvickox6.R.inc(6063);
        __CLR4_5_24l04l0lvickox6.R.inc(6064);return (Collection<C>) different(axioms, OWLObject.class);
    }finally{__CLR4_5_24l04l0lvickox6.R.flushNeeded();}}

    /**
     * Retrieve disjoint entities from axioms, including individuals from
     * differentFrom axioms. A mixture of axiom types can be passed in, as long
     * as the entity type they contain is compatible with the return type for
     * the collection.
     * 
     * @param <C>
     *        returned type
     * @param axioms
     *        axioms
     * @param type
     *        type contained in the returned collection
     * @return disjoint entities
     */
    @Nonnull
    public static <C extends OWLObject> Collection<C> different(@Nonnull Collection<? extends OWLAxiom> axioms,
        @SuppressWarnings("unused") @Nonnull Class<C> type) {try{__CLR4_5_24l04l0lvickox6.R.inc(6065);
        __CLR4_5_24l04l0lvickox6.R.inc(6066);Set<C> toReturn = new HashSet<>();
        __CLR4_5_24l04l0lvickox6.R.inc(6067);for (OWLAxiom ax : axioms) {{
            assert (((ax != null)&&(__CLR4_5_24l04l0lvickox6.R.iget(6068)!=0|true))||(__CLR4_5_24l04l0lvickox6.R.iget(6069)==0&false));
            __CLR4_5_24l04l0lvickox6.R.inc(6070);Set<C> c = different(ax);
            __CLR4_5_24l04l0lvickox6.R.inc(6071);toReturn.addAll(c);
        }
        }__CLR4_5_24l04l0lvickox6.R.inc(6072);return toReturn;
    }finally{__CLR4_5_24l04l0lvickox6.R.flushNeeded();}}

    /**
     * Retrieve disjoint entities from an axiom, including individuals from
     * differentFrom axioms.
     * 
     * @param <C>
     *        returned type
     * @param axiom
     *        axiom
     * @return disjoint entities
     */
    @Nonnull
    public static <C extends OWLObject> Set<C> different(@Nonnull OWLAxiom axiom) {try{__CLR4_5_24l04l0lvickox6.R.inc(6073);
        __CLR4_5_24l04l0lvickox6.R.inc(6074);return axiom.accept(new EquivalentVisitor<C>(false));
    }finally{__CLR4_5_24l04l0lvickox6.R.flushNeeded();}}

    /**
     * Retrieve the sub part of axioms, i.e., subclass or subproperty. A mixture
     * of axiom types can be passed in, as long as the entity type they contain
     * is compatible with the return type for the collection.
     * 
     * @param <C>
     *        returned type
     * @param axioms
     *        axioms
     * @return sub expressions
     */
    @Nonnull
    @SuppressWarnings("unchecked")
    public static <C extends OWLObject> Collection<C> sub(@Nonnull Collection<? extends OWLAxiom> axioms) {try{__CLR4_5_24l04l0lvickox6.R.inc(6075);
        __CLR4_5_24l04l0lvickox6.R.inc(6076);return (Collection<C>) sub(axioms, OWLObject.class);
    }finally{__CLR4_5_24l04l0lvickox6.R.flushNeeded();}}

    /**
     * Retrieve the sub part of axioms, i.e., subclass or subproperty. A mixture
     * of axiom types can be passed in, as long as the entity type they contain
     * is compatible with the return type for the collection.
     * 
     * @param <C>
     *        returned type
     * @param axioms
     *        axioms
     * @param type
     *        type contained in the returned collection
     * @return sub expressions
     */
    @Nonnull
    public static <C extends OWLObject> Collection<C> sub(@Nonnull Collection<? extends OWLAxiom> axioms,
        @SuppressWarnings("unused") @Nonnull Class<C> type) {try{__CLR4_5_24l04l0lvickox6.R.inc(6077);
        __CLR4_5_24l04l0lvickox6.R.inc(6078);List<C> toReturn = new ArrayList<>();
        __CLR4_5_24l04l0lvickox6.R.inc(6079);for (OWLAxiom ax : axioms) {{
            assert (((ax != null)&&(__CLR4_5_24l04l0lvickox6.R.iget(6080)!=0|true))||(__CLR4_5_24l04l0lvickox6.R.iget(6081)==0&false));
            __CLR4_5_24l04l0lvickox6.R.inc(6082);C c = sub(ax);
            __CLR4_5_24l04l0lvickox6.R.inc(6083);toReturn.add(c);
        }
        }__CLR4_5_24l04l0lvickox6.R.inc(6084);return toReturn;
    }finally{__CLR4_5_24l04l0lvickox6.R.flushNeeded();}}

    /**
     * Retrieve the sub part of an axiom, i.e., subclass or subproperty. A
     * mixture of axiom types can be passed in, as long as the entity type they
     * contain is compatible with the return type for the collection.
     * 
     * @param <C>
     *        returned type
     * @param axiom
     *        axiom
     * @return sub expressions
     */
    @Nonnull
    public static <C extends OWLObject> C sub(@Nonnull OWLAxiom axiom) {try{__CLR4_5_24l04l0lvickox6.R.inc(6085);
        __CLR4_5_24l04l0lvickox6.R.inc(6086);return axiom.accept(new SupSubVisitor<C>(false));
    }finally{__CLR4_5_24l04l0lvickox6.R.flushNeeded();}}

    /**
     * Retrieve the super part of axioms, i.e., superclass or superproperty. A
     * mixture of axiom types can be passed in, as long as the entity type they
     * contain is compatible with the return type for the collection.
     * 
     * @param <C>
     *        returned type
     * @param axioms
     *        axioms
     * @param type
     *        type contained in the returned collection
     * @return sub expressions
     */
    @Nonnull
    public static <C extends OWLObject> Collection<C> sup(@Nonnull Collection<? extends OWLAxiom> axioms,
        @SuppressWarnings("unused") @Nonnull Class<C> type) {try{__CLR4_5_24l04l0lvickox6.R.inc(6087);
        __CLR4_5_24l04l0lvickox6.R.inc(6088);List<C> toReturn = new ArrayList<>();
        __CLR4_5_24l04l0lvickox6.R.inc(6089);for (OWLAxiom ax : axioms) {{
            assert (((ax != null)&&(__CLR4_5_24l04l0lvickox6.R.iget(6090)!=0|true))||(__CLR4_5_24l04l0lvickox6.R.iget(6091)==0&false));
            __CLR4_5_24l04l0lvickox6.R.inc(6092);C c = sup(ax);
            __CLR4_5_24l04l0lvickox6.R.inc(6093);toReturn.add(c);
        }
        }__CLR4_5_24l04l0lvickox6.R.inc(6094);return toReturn;
    }finally{__CLR4_5_24l04l0lvickox6.R.flushNeeded();}}

    /**
     * Retrieve the super part of axioms, i.e., superclass or superproperty. A
     * mixture of axiom types can be passed in, as long as the entity type they
     * contain is compatible with the return type for the collection.
     * 
     * @param <C>
     *        returned type
     * @param axioms
     *        axioms
     * @return sub expressions
     */
    @Nonnull
    @SuppressWarnings("unchecked")
    public static <C extends OWLObject> Collection<C> sup(@Nonnull Collection<? extends OWLAxiom> axioms) {try{__CLR4_5_24l04l0lvickox6.R.inc(6095);
        __CLR4_5_24l04l0lvickox6.R.inc(6096);return (Collection<C>) sup(axioms, OWLObject.class);
    }finally{__CLR4_5_24l04l0lvickox6.R.flushNeeded();}}

    /**
     * Retrieve the super part of an axiom, i.e., superclass or superproperty. A
     * mixture of axiom types can be passed in, as long as the entity type they
     * contain is compatible with the return type for the collection.
     * 
     * @param <C>
     *        returned type
     * @param axiom
     *        axiom
     * @return sub expressions
     */
    @Nonnull
    public static <C extends OWLObject> C sup(@Nonnull OWLAxiom axiom) {try{__CLR4_5_24l04l0lvickox6.R.inc(6097);
        __CLR4_5_24l04l0lvickox6.R.inc(6098);return axiom.accept(new SupSubVisitor<C>(true));
    }finally{__CLR4_5_24l04l0lvickox6.R.flushNeeded();}}

    /**
     * Retrieve the domains from domain axioms. A mixture of axiom types can be
     * passed in.
     * 
     * @param <C>
     *        returned type
     * @param axioms
     *        axioms
     * @return sub expressions
     */
    @Nonnull
    @SuppressWarnings("unchecked")
    public static <C extends OWLObject> Collection<C> domain(@Nonnull Collection<? extends OWLAxiom> axioms) {try{__CLR4_5_24l04l0lvickox6.R.inc(6099);
        __CLR4_5_24l04l0lvickox6.R.inc(6100);return (Collection<C>) domain(axioms, OWLObject.class);
    }finally{__CLR4_5_24l04l0lvickox6.R.flushNeeded();}}

    /**
     * Retrieve the domains from domain axioms. A mixture of axiom types can be
     * passed in.
     * 
     * @param <C>
     *        returned type
     * @param axioms
     *        axioms
     * @param type
     *        type contained in the returned collection
     * @return sub expressions
     */
    @Nonnull
    public static <C extends OWLObject> Collection<C> domain(@Nonnull Collection<? extends OWLAxiom> axioms,
        @SuppressWarnings("unused") @Nonnull Class<C> type) {try{__CLR4_5_24l04l0lvickox6.R.inc(6101);
        __CLR4_5_24l04l0lvickox6.R.inc(6102);List<C> toReturn = new ArrayList<>();
        __CLR4_5_24l04l0lvickox6.R.inc(6103);for (OWLAxiom ax : axioms) {{
            assert (((ax != null)&&(__CLR4_5_24l04l0lvickox6.R.iget(6104)!=0|true))||(__CLR4_5_24l04l0lvickox6.R.iget(6105)==0&false));
            __CLR4_5_24l04l0lvickox6.R.inc(6106);C c = domain(ax);
            __CLR4_5_24l04l0lvickox6.R.inc(6107);toReturn.add(c);
        }
        }__CLR4_5_24l04l0lvickox6.R.inc(6108);return toReturn;
    }finally{__CLR4_5_24l04l0lvickox6.R.flushNeeded();}}

    /**
     * Retrieve the domains from domain axioms. A mixture of axiom types can be
     * passed in.
     * 
     * @param <C>
     *        returned type
     * @param axiom
     *        axiom
     * @return sub expressions
     */
    @Nonnull
    public static <C extends OWLObject> C domain(@Nonnull OWLAxiom axiom) {try{__CLR4_5_24l04l0lvickox6.R.inc(6109);
        __CLR4_5_24l04l0lvickox6.R.inc(6110);return axiom.accept(new DomainVisitor<C>());
    }finally{__CLR4_5_24l04l0lvickox6.R.flushNeeded();}}

    /**
     * Retrieve the ranges from range axioms. A mixture of axiom types can be
     * passed in.
     * 
     * @param <C>
     *        returned type
     * @param axioms
     *        axioms
     * @return sub expressions
     */
    @Nonnull
    @SuppressWarnings("unchecked")
    public static <C extends OWLObject> Collection<C> range(@Nonnull Collection<? extends OWLAxiom> axioms) {try{__CLR4_5_24l04l0lvickox6.R.inc(6111);
        __CLR4_5_24l04l0lvickox6.R.inc(6112);return (Collection<C>) range(axioms, OWLObject.class);
    }finally{__CLR4_5_24l04l0lvickox6.R.flushNeeded();}}

    /**
     * Retrieve the ranges from range axioms. A mixture of axiom types can be
     * passed in.
     * 
     * @param <C>
     *        returned type
     * @param axioms
     *        axioms
     * @param type
     *        type contained in the returned collection
     * @return sub expressions
     */
    @Nonnull
    public static <C extends OWLObject> Collection<C> range(@Nonnull Collection<? extends OWLAxiom> axioms,
        @SuppressWarnings("unused") @Nonnull Class<C> type) {try{__CLR4_5_24l04l0lvickox6.R.inc(6113);
        __CLR4_5_24l04l0lvickox6.R.inc(6114);List<C> toReturn = new ArrayList<>();
        __CLR4_5_24l04l0lvickox6.R.inc(6115);for (OWLAxiom ax : axioms) {{
            assert (((ax != null)&&(__CLR4_5_24l04l0lvickox6.R.iget(6116)!=0|true))||(__CLR4_5_24l04l0lvickox6.R.iget(6117)==0&false));
            __CLR4_5_24l04l0lvickox6.R.inc(6118);C c = range(ax);
            __CLR4_5_24l04l0lvickox6.R.inc(6119);toReturn.add(c);
        }
        }__CLR4_5_24l04l0lvickox6.R.inc(6120);return toReturn;
    }finally{__CLR4_5_24l04l0lvickox6.R.flushNeeded();}}

    /**
     * Retrieve the ranges from a range axiom. A mixture of axiom types can be
     * passed in.
     * 
     * @param <C>
     *        returned type
     * @param axiom
     *        axiom
     * @return sub expressions
     */
    @Nonnull
    public static <C extends OWLObject> C range(@Nonnull OWLAxiom axiom) {try{__CLR4_5_24l04l0lvickox6.R.inc(6121);
        __CLR4_5_24l04l0lvickox6.R.inc(6122);return axiom.accept(new RangeVisitor<C>());
    }finally{__CLR4_5_24l04l0lvickox6.R.flushNeeded();}}

    /**
     * Transform a collection of ontologies to a collection of IRIs of those
     * ontologies. Anonymous ontologies are skipped.
     * 
     * @param ontologies
     *        ontologies to transform
     * @return collection of IRIs for the ontologies.
     */
    @Nonnull
    public static Collection<IRI> ontologyIRIs(Iterable<OWLOntology> ontologies) {try{__CLR4_5_24l04l0lvickox6.R.inc(6123);
        __CLR4_5_24l04l0lvickox6.R.inc(6124);Collection<OWLOntologyID> list = new ArrayList<>();
        __CLR4_5_24l04l0lvickox6.R.inc(6125);for (OWLOntology o : ontologies) {{
            __CLR4_5_24l04l0lvickox6.R.inc(6126);list.add(o.getOntologyID());
        }
        }__CLR4_5_24l04l0lvickox6.R.inc(6127);return ontologyIRIs(list);
    }finally{__CLR4_5_24l04l0lvickox6.R.flushNeeded();}}

    /**
     * Transform a collection of ontology ids to a collection of IRIs of those
     * ontology ids. Anonymous ontology ids are skipped.
     * 
     * @param ids
     *        ontology ids to transform
     * @return collection of IRIs for the ontology ids.
     */
    @Nonnull
    public static Collection<IRI> ontologyIRIs(Collection<OWLOntologyID> ids) {try{__CLR4_5_24l04l0lvickox6.R.inc(6128);
        __CLR4_5_24l04l0lvickox6.R.inc(6129);Collection<IRI> list = new ArrayList<>();
        __CLR4_5_24l04l0lvickox6.R.inc(6130);for (OWLOntologyID id : ids) {{
            __CLR4_5_24l04l0lvickox6.R.inc(6131);if ((((id.getOntologyIRI().isPresent())&&(__CLR4_5_24l04l0lvickox6.R.iget(6132)!=0|true))||(__CLR4_5_24l04l0lvickox6.R.iget(6133)==0&false))) {{
                __CLR4_5_24l04l0lvickox6.R.inc(6134);list.add(id.getOntologyIRI().get());
            }
        }}
        }__CLR4_5_24l04l0lvickox6.R.inc(6135);return list;
    }finally{__CLR4_5_24l04l0lvickox6.R.flushNeeded();}}
}
