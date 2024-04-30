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

import static org.semanticweb.owlapi.model.parameters.Imports.EXCLUDED;
import static org.semanticweb.owlapi.util.OWLAPIPreconditions.checkNotNull;

import java.util.Set;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLClassExpression;
import org.semanticweb.owlapi.model.OWLEquivalentClassesAxiom;
import org.semanticweb.owlapi.model.OWLObjectIntersectionOf;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLSubClassOfAxiom;

/**
 * A utility class that can be used to determine is a class is a syntactic
 * direct subclass of owl:Thing. A class is considered NOT to be a syntactic
 * direct subclass of owl:Thing if ANY of the following conditions apply:
 * <ol>
 * <li>It is equal to the left hand side of a subclass axiom, where the right
 * hand side is a named class other than owl:Thing</li>
 * <li>It is an operand in an equivalent class axiom where at least one of the
 * other other operands is an intersection class that has a named operand other
 * than the class in question. For example
 * {@code EquivalentClasses(A,  (B and prop some C))}</li>
 * </ol>
 * This functionality is provided because it is useful for displaying class
 * hierarchies in editors and browsers. In these situations it is needed because
 * not all "orphan" classes are asserted to be subclasses of owl:Thing. For
 * example, if the only referencing axiom of class A was ObjectDomain(propP A)
 * then A is a syntactic subclass of owl:Thing.
 * 
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.0.0
 */
public class SimpleRootClassChecker implements RootClassChecker {public static class __CLR4_5_2bhrbhrlvicks0m{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0061\u0070\u0069\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237201267L,8589935092L,14953,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Nonnull
    private final Set<OWLOntology> ontologies;

    /**
     * Creates a root class checker, which examines axioms contained in
     * ontologies from the specified set in order to determine if a class is a
     * syntactic subclass of owl:Thing.
     * 
     * @param ontologies
     *        The ontologies whose axioms are to be taken into consideration
     *        when determining if a class is a syntactic direct subclass of
     *        owl:Thing
     */
    public SimpleRootClassChecker(@Nonnull Set<OWLOntology> ontologies) {try{__CLR4_5_2bhrbhrlvicks0m.R.inc(14895);
        __CLR4_5_2bhrbhrlvicks0m.R.inc(14896);this.ontologies = checkNotNull(ontologies, "ontologies cannot be null");
    }finally{__CLR4_5_2bhrbhrlvicks0m.R.flushNeeded();}}

    // Rules for determining if a class is a direct subclass of Thing
    // 1) It isn't referenced by ANY subclass axiom or equivalent class axioms
    // 2) It is reference only by subclass axioms, but doesn't appear on the LHS
    // of these axioms
    // 3) It is on the LHS of a subclass axiom where the RHS is Thing
    // 4) It is referenced only by equivalent class axioms, where all other
    // operands in these axioms are named
    // 5) It is not referenced by subclass axioms and is not referenced by any
    // equivalent class axiom where there is
    // at least one operand in the equivalent class axiom which is an
    // intersection containing a named operand i.e.
    // EquivalentClasses(A (B and hasP some C)) would not be a subclass of Thing
    @Nonnull
    private final RootClassCheckerHelper checker = new RootClassCheckerHelper();
    @Nonnull
    private final NamedSuperChecker superChecker = new NamedSuperChecker();

    @Override
    public boolean isRootClass(OWLClass cls) {try{__CLR4_5_2bhrbhrlvicks0m.R.inc(14897);
        __CLR4_5_2bhrbhrlvicks0m.R.inc(14898);for (OWLOntology ont : ontologies) {{
            __CLR4_5_2bhrbhrlvicks0m.R.inc(14899);for (OWLAxiom ax : ont.getReferencingAxioms(cls, EXCLUDED)) {{
                __CLR4_5_2bhrbhrlvicks0m.R.inc(14900);checker.setOWLClass(cls);
                __CLR4_5_2bhrbhrlvicks0m.R.inc(14901);ax.accept(checker);
                __CLR4_5_2bhrbhrlvicks0m.R.inc(14902);if ((((!checker.isRoot())&&(__CLR4_5_2bhrbhrlvicks0m.R.iget(14903)!=0|true))||(__CLR4_5_2bhrbhrlvicks0m.R.iget(14904)==0&false))) {{
                    __CLR4_5_2bhrbhrlvicks0m.R.inc(14905);return false;
                }
            }}
        }}
        }__CLR4_5_2bhrbhrlvicks0m.R.inc(14906);return true;
    }finally{__CLR4_5_2bhrbhrlvicks0m.R.flushNeeded();}}

    private static class NamedSuperChecker extends
            OWLClassExpressionVisitorAdapter {

        protected boolean namedSuper;

        NamedSuperChecker() {try{__CLR4_5_2bhrbhrlvicks0m.R.inc(14907);}finally{__CLR4_5_2bhrbhrlvicks0m.R.flushNeeded();}}

        public void reset() {try{__CLR4_5_2bhrbhrlvicks0m.R.inc(14908);
            __CLR4_5_2bhrbhrlvicks0m.R.inc(14909);namedSuper = false;
        }finally{__CLR4_5_2bhrbhrlvicks0m.R.flushNeeded();}}

        @Override
        public void visit(OWLClass ce) {try{__CLR4_5_2bhrbhrlvicks0m.R.inc(14910);
            __CLR4_5_2bhrbhrlvicks0m.R.inc(14911);namedSuper = true;
        }finally{__CLR4_5_2bhrbhrlvicks0m.R.flushNeeded();}}

        @Override
        public void visit(OWLObjectIntersectionOf ce) {try{__CLR4_5_2bhrbhrlvicks0m.R.inc(14912);
            __CLR4_5_2bhrbhrlvicks0m.R.inc(14913);for (OWLClassExpression op : ce.getOperands()) {{
                __CLR4_5_2bhrbhrlvicks0m.R.inc(14914);op.accept(this);
                __CLR4_5_2bhrbhrlvicks0m.R.inc(14915);if ((((namedSuper)&&(__CLR4_5_2bhrbhrlvicks0m.R.iget(14916)!=0|true))||(__CLR4_5_2bhrbhrlvicks0m.R.iget(14917)==0&false))) {{
                    __CLR4_5_2bhrbhrlvicks0m.R.inc(14918);break;
                }
            }}
        }}finally{__CLR4_5_2bhrbhrlvicks0m.R.flushNeeded();}}
    }

    protected boolean check(OWLClassExpression e) {try{__CLR4_5_2bhrbhrlvicks0m.R.inc(14919);
        __CLR4_5_2bhrbhrlvicks0m.R.inc(14920);superChecker.reset();
        __CLR4_5_2bhrbhrlvicks0m.R.inc(14921);e.accept(superChecker);
        __CLR4_5_2bhrbhrlvicks0m.R.inc(14922);return !superChecker.namedSuper;
    }finally{__CLR4_5_2bhrbhrlvicks0m.R.flushNeeded();}}

    /**
     * A utility class that checks if an axiom gives rise to a class being a
     * subclass of Thing.
     */
    private class RootClassCheckerHelper extends OWLAxiomVisitorAdapter {

        private boolean isRoot;
        private OWLClass cls;

        RootClassCheckerHelper() {try{__CLR4_5_2bhrbhrlvicks0m.R.inc(14923);}finally{__CLR4_5_2bhrbhrlvicks0m.R.flushNeeded();}}

        public void setOWLClass(OWLClass cls) {try{__CLR4_5_2bhrbhrlvicks0m.R.inc(14924);
            // Start off with the assumption that the class is
            // a root class. This means if the class isn't referenced
            // by any equivalent class axioms or subclass axioms then
            // we correctly identify it as a root
            __CLR4_5_2bhrbhrlvicks0m.R.inc(14925);isRoot = true;
            __CLR4_5_2bhrbhrlvicks0m.R.inc(14926);this.cls = cls;
        }finally{__CLR4_5_2bhrbhrlvicks0m.R.flushNeeded();}}

        public boolean isRoot() {try{__CLR4_5_2bhrbhrlvicks0m.R.inc(14927);
            __CLR4_5_2bhrbhrlvicks0m.R.inc(14928);return isRoot;
        }finally{__CLR4_5_2bhrbhrlvicks0m.R.flushNeeded();}}

        @Override
        public void visit(OWLSubClassOfAxiom axiom) {try{__CLR4_5_2bhrbhrlvicks0m.R.inc(14929);
            __CLR4_5_2bhrbhrlvicks0m.R.inc(14930);if ((((axiom.getSubClass().equals(cls))&&(__CLR4_5_2bhrbhrlvicks0m.R.iget(14931)!=0|true))||(__CLR4_5_2bhrbhrlvicks0m.R.iget(14932)==0&false))) {{
                __CLR4_5_2bhrbhrlvicks0m.R.inc(14933);isRoot = check(axiom.getSuperClass());
            }
        }}finally{__CLR4_5_2bhrbhrlvicks0m.R.flushNeeded();}}

        @Override
        public void visit(OWLEquivalentClassesAxiom axiom) {try{__CLR4_5_2bhrbhrlvicks0m.R.inc(14934);
            __CLR4_5_2bhrbhrlvicks0m.R.inc(14935);Set<OWLClassExpression> descs = axiom.getClassExpressions();
            __CLR4_5_2bhrbhrlvicks0m.R.inc(14936);if ((((!descs.contains(cls))&&(__CLR4_5_2bhrbhrlvicks0m.R.iget(14937)!=0|true))||(__CLR4_5_2bhrbhrlvicks0m.R.iget(14938)==0&false))) {{
                __CLR4_5_2bhrbhrlvicks0m.R.inc(14939);return;
            }
            }__CLR4_5_2bhrbhrlvicks0m.R.inc(14940);boolean check = false;
            __CLR4_5_2bhrbhrlvicks0m.R.inc(14941);for (OWLClassExpression desc : descs) {{
                __CLR4_5_2bhrbhrlvicks0m.R.inc(14942);if ((((desc.equals(cls))&&(__CLR4_5_2bhrbhrlvicks0m.R.iget(14943)!=0|true))||(__CLR4_5_2bhrbhrlvicks0m.R.iget(14944)==0&false))) {{
                    __CLR4_5_2bhrbhrlvicks0m.R.inc(14945);continue;
                }
                }__CLR4_5_2bhrbhrlvicks0m.R.inc(14946);check = check(desc);
                __CLR4_5_2bhrbhrlvicks0m.R.inc(14947);if ((((check)&&(__CLR4_5_2bhrbhrlvicks0m.R.iget(14948)!=0|true))||(__CLR4_5_2bhrbhrlvicks0m.R.iget(14949)==0&false))) {{
                    __CLR4_5_2bhrbhrlvicks0m.R.inc(14950);isRoot = false;
                    __CLR4_5_2bhrbhrlvicks0m.R.inc(14951);return;
                }
            }}
            }__CLR4_5_2bhrbhrlvicks0m.R.inc(14952);isRoot = check;
        }finally{__CLR4_5_2bhrbhrlvicks0m.R.flushNeeded();}}
    }
}
