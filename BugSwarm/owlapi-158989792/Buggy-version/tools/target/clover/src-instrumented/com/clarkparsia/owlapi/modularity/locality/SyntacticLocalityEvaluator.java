/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//* This file is part of the OWL API.
 * The contents of this file are subject to the LGPL License, Version 3.0.
 * Copyright 2011, Clark & Parsia, LLC
 * 
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program.  If not, see http://www.gnu.org/licenses/.
 *
 * Alternatively, the contents of this file may be used under the terms of the Apache License, Version 2.0 in which case, the provisions of the Apache License Version 2.0 are applicable instead of those above.
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */
package com.clarkparsia.owlapi.modularity.locality;

import static org.semanticweb.owlapi.util.OWLAPIPreconditions.*;

import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.model.*;

/** Syntactic locality evaluator. */
@java.lang.SuppressWarnings({"fallthrough"}) public class SyntacticLocalityEvaluator implements LocalityEvaluator {public static class __CLR4_5_2oaoalviclz3r{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u006f\u006f\u006c\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237269396L,8589935092L,1706,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Nonnull
    protected final LocalityClass localityCls;
    @Nonnull
    private final AxiomLocalityVisitor axiomVisitor = new AxiomLocalityVisitor();
    @Nonnull
    private static final EnumSet<LocalityClass> SUPPORTED_LOCALITY_CLASSES = EnumSet.of(LocalityClass.TOP_BOTTOM,
        LocalityClass.BOTTOM_BOTTOM, LocalityClass.TOP_TOP);

    /**
     * Constructs a new locality evaluator for the given locality class.
     * 
     * @param localityClass
     *        the locality class for this evaluator
     */
    public SyntacticLocalityEvaluator(@Nonnull LocalityClass localityClass) {try{__CLR4_5_2oaoalviclz3r.R.inc(874);
        __CLR4_5_2oaoalviclz3r.R.inc(875);localityCls = checkNotNull(localityClass, "localityClass cannot be null");
        __CLR4_5_2oaoalviclz3r.R.inc(876);if ((((!SUPPORTED_LOCALITY_CLASSES.contains(localityClass))&&(__CLR4_5_2oaoalviclz3r.R.iget(877)!=0|true))||(__CLR4_5_2oaoalviclz3r.R.iget(878)==0&false))) {{
            __CLR4_5_2oaoalviclz3r.R.inc(879);throw new OWLRuntimeException("Unsupported locality class: " + localityClass);
        }
    }}finally{__CLR4_5_2oaoalviclz3r.R.flushNeeded();}}

    /**
     * Returns all supported locality classes.
     * 
     * @return a set containing all supported locality classes
     */
    public static Set<LocalityClass> supportedLocalityClasses() {try{__CLR4_5_2oaoalviclz3r.R.inc(880);
        __CLR4_5_2oaoalviclz3r.R.inc(881);return SUPPORTED_LOCALITY_CLASSES;
    }finally{__CLR4_5_2oaoalviclz3r.R.flushNeeded();}}

    /**
     * This is a convenience method for determining whether a given data range
     * expression is the top datatype or a built-in datatype. This is used in
     * the bottom- and top-equivalence evaluators for treating cardinality
     * restrictions.
     * 
     * @param dataRange
     *        a data range expression
     * @return {@code true} if the specified data range expression is the top
     *         datatype or a built-in datatype; {@code false} otherwise
     */
    protected static boolean isTopOrBuiltInDatatype(@Nonnull OWLDataRange dataRange) {try{__CLR4_5_2oaoalviclz3r.R.inc(882);
        __CLR4_5_2oaoalviclz3r.R.inc(883);if ((((dataRange.isDatatype())&&(__CLR4_5_2oaoalviclz3r.R.iget(884)!=0|true))||(__CLR4_5_2oaoalviclz3r.R.iget(885)==0&false))) {{
            __CLR4_5_2oaoalviclz3r.R.inc(886);OWLDatatype dataType = dataRange.asOWLDatatype();
            __CLR4_5_2oaoalviclz3r.R.inc(887);return dataType.isTopDatatype() || dataType.isBuiltIn();
        } }else {{
            __CLR4_5_2oaoalviclz3r.R.inc(888);return false;
        }
    }}finally{__CLR4_5_2oaoalviclz3r.R.flushNeeded();}}

    /**
     * This is a convenience method for determining whether a given data range
     * expression is the top datatype or a built-in infinite datatype. This is
     * used in the bottom- and top-equivalence evaluators for treating
     * cardinality restrictions.
     * 
     * @param dataRange
     *        a data range expression
     * @return {@code true} if the specified data range expression is the top
     *         datatype or a built-in infinite datatype; {@code false} otherwise
     */
    protected static boolean isTopOrBuiltInInfiniteDatatype(@Nonnull OWLDataRange dataRange) {try{__CLR4_5_2oaoalviclz3r.R.inc(889);
        __CLR4_5_2oaoalviclz3r.R.inc(890);if ((((dataRange.isDatatype())&&(__CLR4_5_2oaoalviclz3r.R.iget(891)!=0|true))||(__CLR4_5_2oaoalviclz3r.R.iget(892)==0&false))) {{
            __CLR4_5_2oaoalviclz3r.R.inc(893);OWLDatatype dataType = dataRange.asOWLDatatype();
            __CLR4_5_2oaoalviclz3r.R.inc(894);return dataType.isTopDatatype() || dataType.isBuiltIn() && !dataType.getBuiltInDatatype().isFinite();
        } }else {{
            __CLR4_5_2oaoalviclz3r.R.inc(895);return false;
        }
    }}finally{__CLR4_5_2oaoalviclz3r.R.flushNeeded();}}

    // TODO (TS): only visit logical axioms if possible
    private class AxiomLocalityVisitor implements OWLAxiomVisitor {

        @Nonnull
        private final BottomEquivalenceEvaluator bottomEvaluator = new BottomEquivalenceEvaluator();
        private boolean isLocal;
        private Collection<? extends OWLEntity> signature;
        @Nonnull
        private final TopEquivalenceEvaluator topEvaluator = new TopEquivalenceEvaluator();

        /** Instantiates a new axiom locality visitor. */
        AxiomLocalityVisitor() {try{__CLR4_5_2oaoalviclz3r.R.inc(896);
            __CLR4_5_2oaoalviclz3r.R.inc(897);topEvaluator.setBottomEvaluator(bottomEvaluator);
            __CLR4_5_2oaoalviclz3r.R.inc(898);bottomEvaluator.setTopEvaluator(topEvaluator);
        }finally{__CLR4_5_2oaoalviclz3r.R.flushNeeded();}}

        @Nonnull
        protected Collection<? extends OWLEntity> getSignature() {try{__CLR4_5_2oaoalviclz3r.R.inc(899);
            __CLR4_5_2oaoalviclz3r.R.inc(900);return verifyNotNull(signature);
        }finally{__CLR4_5_2oaoalviclz3r.R.flushNeeded();}}

        /**
         * Checks if is local.
         * 
         * @param axiom
         *        the axiom
         * @param sig
         *        the sig
         * @return true, if is local
         */
        public boolean isLocal(@Nonnull OWLAxiom axiom, @Nonnull Collection<? extends OWLEntity> sig) {try{__CLR4_5_2oaoalviclz3r.R.inc(901);
            __CLR4_5_2oaoalviclz3r.R.inc(902);signature = checkNotNull(sig, "sig cannot be null");
            __CLR4_5_2oaoalviclz3r.R.inc(903);isLocal = false;
            __CLR4_5_2oaoalviclz3r.R.inc(904);checkNotNull(axiom, "axiom cannot be null").accept(this);
            __CLR4_5_2oaoalviclz3r.R.inc(905);return isLocal;
        }finally{__CLR4_5_2oaoalviclz3r.R.flushNeeded();}}

        @Override
        public void visit(OWLDatatypeDefinitionAxiom axiom) {try{__CLR4_5_2oaoalviclz3r.R.inc(906);
            __CLR4_5_2oaoalviclz3r.R.inc(907);isLocal = true;
        }finally{__CLR4_5_2oaoalviclz3r.R.flushNeeded();}}

        // BUGFIX: (TS) Asymm OP axioms are local in the *_BOTTOM case:
        // The empty object property is asymmetric!
        // BUGFIX: (DT) OP in signature makes the axiom non-local
        @Override
        public void visit(OWLAsymmetricObjectPropertyAxiom axiom) {try{__CLR4_5_2oaoalviclz3r.R.inc(908);
            boolean __CLB4_5_2_bool0=false;__CLR4_5_2oaoalviclz3r.R.inc(909);switch (localityCls) {
            case BOTTOM_BOTTOM:if (!__CLB4_5_2_bool0) {__CLR4_5_2oaoalviclz3r.R.inc(910);__CLB4_5_2_bool0=true;}
            case TOP_BOTTOM:if (!__CLB4_5_2_bool0) {__CLR4_5_2oaoalviclz3r.R.inc(911);__CLB4_5_2_bool0=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(912);isLocal = !getSignature().contains(axiom.getProperty().getNamedProperty());
                __CLR4_5_2oaoalviclz3r.R.inc(913);break;
            case TOP_TOP:if (!__CLB4_5_2_bool0) {__CLR4_5_2oaoalviclz3r.R.inc(914);__CLB4_5_2_bool0=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(915);isLocal = false;
                __CLR4_5_2oaoalviclz3r.R.inc(916);break;
            default:if (!__CLB4_5_2_bool0) {__CLR4_5_2oaoalviclz3r.R.inc(917);__CLB4_5_2_bool0=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(918);break;
            }
        }finally{__CLR4_5_2oaoalviclz3r.R.flushNeeded();}}

        @Override
        public void visit(OWLClassAssertionAxiom axiom) {try{__CLR4_5_2oaoalviclz3r.R.inc(919);
            __CLR4_5_2oaoalviclz3r.R.inc(920);isLocal = topEvaluator.isTopEquivalent(axiom.getClassExpression(), getSignature(), localityCls);
        }finally{__CLR4_5_2oaoalviclz3r.R.flushNeeded();}}

        @Override
        public void visit(OWLDataPropertyAssertionAxiom axiom) {try{__CLR4_5_2oaoalviclz3r.R.inc(921);
            boolean __CLB4_5_2_bool1=false;__CLR4_5_2oaoalviclz3r.R.inc(922);switch (localityCls) {
            case BOTTOM_BOTTOM:if (!__CLB4_5_2_bool1) {__CLR4_5_2oaoalviclz3r.R.inc(923);__CLB4_5_2_bool1=true;}
            case TOP_BOTTOM:if (!__CLB4_5_2_bool1) {__CLR4_5_2oaoalviclz3r.R.inc(924);__CLB4_5_2_bool1=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(925);isLocal = false;
                __CLR4_5_2oaoalviclz3r.R.inc(926);break;
            case TOP_TOP:if (!__CLB4_5_2_bool1) {__CLR4_5_2oaoalviclz3r.R.inc(927);__CLB4_5_2_bool1=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(928);isLocal = !getSignature().contains(axiom.getProperty().asOWLDataProperty());
                __CLR4_5_2oaoalviclz3r.R.inc(929);break;
            default:if (!__CLB4_5_2_bool1) {__CLR4_5_2oaoalviclz3r.R.inc(930);__CLB4_5_2_bool1=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(931);break;
            }
        }finally{__CLR4_5_2oaoalviclz3r.R.flushNeeded();}}

        @Override
        public void visit(OWLDataPropertyDomainAxiom axiom) {try{__CLR4_5_2oaoalviclz3r.R.inc(932);
            boolean __CLB4_5_2_bool2=false;__CLR4_5_2oaoalviclz3r.R.inc(933);switch (localityCls) {
            case BOTTOM_BOTTOM:if (!__CLB4_5_2_bool2) {__CLR4_5_2oaoalviclz3r.R.inc(934);__CLB4_5_2_bool2=true;}
            case TOP_BOTTOM:if (!__CLB4_5_2_bool2) {__CLR4_5_2oaoalviclz3r.R.inc(935);__CLB4_5_2_bool2=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(936);isLocal = !getSignature().contains(axiom.getProperty().asOWLDataProperty()) || topEvaluator
                    .isTopEquivalent(axiom.getDomain(), getSignature(), localityCls);
                __CLR4_5_2oaoalviclz3r.R.inc(937);break;
            case TOP_TOP:if (!__CLB4_5_2_bool2) {__CLR4_5_2oaoalviclz3r.R.inc(938);__CLB4_5_2_bool2=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(939);isLocal = topEvaluator.isTopEquivalent(axiom.getDomain(), getSignature(), localityCls);
                __CLR4_5_2oaoalviclz3r.R.inc(940);break;
            default:if (!__CLB4_5_2_bool2) {__CLR4_5_2oaoalviclz3r.R.inc(941);__CLB4_5_2_bool2=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(942);break;
            }
        }finally{__CLR4_5_2oaoalviclz3r.R.flushNeeded();}}

        // BUGFIX: (TS, 2) Added the cases where the filler is top-equiv
        @Override
        public void visit(OWLDataPropertyRangeAxiom axiom) {try{__CLR4_5_2oaoalviclz3r.R.inc(943);
            boolean __CLB4_5_2_bool3=false;__CLR4_5_2oaoalviclz3r.R.inc(944);switch (localityCls) {
            case BOTTOM_BOTTOM:if (!__CLB4_5_2_bool3) {__CLR4_5_2oaoalviclz3r.R.inc(945);__CLB4_5_2_bool3=true;}
            case TOP_BOTTOM:if (!__CLB4_5_2_bool3) {__CLR4_5_2oaoalviclz3r.R.inc(946);__CLB4_5_2_bool3=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(947);isLocal = !getSignature().contains(axiom.getProperty().asOWLDataProperty()) || axiom.getRange()
                    .isTopDatatype();
                __CLR4_5_2oaoalviclz3r.R.inc(948);break;
            case TOP_TOP:if (!__CLB4_5_2_bool3) {__CLR4_5_2oaoalviclz3r.R.inc(949);__CLB4_5_2_bool3=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(950);isLocal = axiom.getRange().isTopDatatype();
                __CLR4_5_2oaoalviclz3r.R.inc(951);break;
            default:if (!__CLB4_5_2_bool3) {__CLR4_5_2oaoalviclz3r.R.inc(952);__CLB4_5_2_bool3=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(953);break;
            }
        }finally{__CLR4_5_2oaoalviclz3r.R.flushNeeded();}}

        @Override
        public void visit(OWLSubDataPropertyOfAxiom axiom) {try{__CLR4_5_2oaoalviclz3r.R.inc(954);
            boolean __CLB4_5_2_bool4=false;__CLR4_5_2oaoalviclz3r.R.inc(955);switch (localityCls) {
            case BOTTOM_BOTTOM:if (!__CLB4_5_2_bool4) {__CLR4_5_2oaoalviclz3r.R.inc(956);__CLB4_5_2_bool4=true;}
            case TOP_BOTTOM:if (!__CLB4_5_2_bool4) {__CLR4_5_2oaoalviclz3r.R.inc(957);__CLB4_5_2_bool4=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(958);isLocal = !getSignature().contains(axiom.getSubProperty().asOWLDataProperty());
                __CLR4_5_2oaoalviclz3r.R.inc(959);break;
            case TOP_TOP:if (!__CLB4_5_2_bool4) {__CLR4_5_2oaoalviclz3r.R.inc(960);__CLB4_5_2_bool4=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(961);isLocal = !getSignature().contains(axiom.getSuperProperty().asOWLDataProperty());
                __CLR4_5_2oaoalviclz3r.R.inc(962);break;
            default:if (!__CLB4_5_2_bool4) {__CLR4_5_2oaoalviclz3r.R.inc(963);__CLB4_5_2_bool4=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(964);break;
            }
        }finally{__CLR4_5_2oaoalviclz3r.R.flushNeeded();}}

        // BUGFIX: (TS) Declaration axioms are local.
        // They need to be added to the module after the locality checks have
        // been performed.
        @Override
        public void visit(OWLDeclarationAxiom axiom) {try{__CLR4_5_2oaoalviclz3r.R.inc(965);
            __CLR4_5_2oaoalviclz3r.R.inc(966);isLocal = true;
        }finally{__CLR4_5_2oaoalviclz3r.R.flushNeeded();}}

        // BUGFIX: (TS) Different individuals axioms are local, too.
        // They need to be added to the module after the locality checks have
        // been performed.
        @Override
        public void visit(OWLDifferentIndividualsAxiom axiom) {try{__CLR4_5_2oaoalviclz3r.R.inc(967);
            __CLR4_5_2oaoalviclz3r.R.inc(968);isLocal = true;
        }finally{__CLR4_5_2oaoalviclz3r.R.flushNeeded();}}

        // BUGFIX: (TS) An n-ary disj classes axiom is local
        // iff at most one of the involved class expressions is not
        // bot-equivalent.
        @Override
        public void visit(OWLDisjointClassesAxiom axiom) {try{__CLR4_5_2oaoalviclz3r.R.inc(969);
            __CLR4_5_2oaoalviclz3r.R.inc(970);Collection<OWLClassExpression> disjs = axiom.getClassExpressions();
            __CLR4_5_2oaoalviclz3r.R.inc(971);int size = disjs.size();
            __CLR4_5_2oaoalviclz3r.R.inc(972);if ((((size == 1)&&(__CLR4_5_2oaoalviclz3r.R.iget(973)!=0|true))||(__CLR4_5_2oaoalviclz3r.R.iget(974)==0&false))) {{
                // XXX actually being here means the axiom is not OWL 2
                // conformant
                __CLR4_5_2oaoalviclz3r.R.inc(975);isLocal = true;
            } }else {{
                __CLR4_5_2oaoalviclz3r.R.inc(976);boolean nonBottomEquivDescFound = false;
                __CLR4_5_2oaoalviclz3r.R.inc(977);for (OWLClassExpression desc : disjs) {{
                    assert (((desc != null)&&(__CLR4_5_2oaoalviclz3r.R.iget(978)!=0|true))||(__CLR4_5_2oaoalviclz3r.R.iget(979)==0&false));
                    __CLR4_5_2oaoalviclz3r.R.inc(980);if ((((!bottomEvaluator.isBottomEquivalent(desc, getSignature(), localityCls))&&(__CLR4_5_2oaoalviclz3r.R.iget(981)!=0|true))||(__CLR4_5_2oaoalviclz3r.R.iget(982)==0&false))) {{
                        __CLR4_5_2oaoalviclz3r.R.inc(983);if ((((nonBottomEquivDescFound)&&(__CLR4_5_2oaoalviclz3r.R.iget(984)!=0|true))||(__CLR4_5_2oaoalviclz3r.R.iget(985)==0&false))) {{
                            __CLR4_5_2oaoalviclz3r.R.inc(986);isLocal = false;
                            __CLR4_5_2oaoalviclz3r.R.inc(987);return;
                        } }else {{
                            __CLR4_5_2oaoalviclz3r.R.inc(988);nonBottomEquivDescFound = true;
                        }
                    }}
                }}
            }}
            }__CLR4_5_2oaoalviclz3r.R.inc(989);isLocal = true;
        }finally{__CLR4_5_2oaoalviclz3r.R.flushNeeded();}}

        // BUGFIX (TS): Added the case where it *is* local
        @Override
        public void visit(OWLDisjointDataPropertiesAxiom axiom) {try{__CLR4_5_2oaoalviclz3r.R.inc(990);
            boolean __CLB4_5_2_bool5=false;__CLR4_5_2oaoalviclz3r.R.inc(991);switch (localityCls) {
            case BOTTOM_BOTTOM:if (!__CLB4_5_2_bool5) {__CLR4_5_2oaoalviclz3r.R.inc(992);__CLB4_5_2_bool5=true;}
            case TOP_BOTTOM:if (!__CLB4_5_2_bool5) {__CLR4_5_2oaoalviclz3r.R.inc(993);__CLB4_5_2_bool5=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(994);Collection<OWLDataPropertyExpression> disjs = axiom.getProperties();
                __CLR4_5_2oaoalviclz3r.R.inc(995);int size = disjs.size();
                __CLR4_5_2oaoalviclz3r.R.inc(996);if ((((size == 1)&&(__CLR4_5_2oaoalviclz3r.R.iget(997)!=0|true))||(__CLR4_5_2oaoalviclz3r.R.iget(998)==0&false))) {{
                    // XXX actually being here means the axiom is not OWL 2
                    // conformant
                    __CLR4_5_2oaoalviclz3r.R.inc(999);isLocal = true;
                } }else {{
                    __CLR4_5_2oaoalviclz3r.R.inc(1000);boolean nonBottomEquivPropFound = false;
                    __CLR4_5_2oaoalviclz3r.R.inc(1001);for (OWLDataPropertyExpression dpe : disjs) {{
                        __CLR4_5_2oaoalviclz3r.R.inc(1002);if ((((getSignature().contains(dpe.asOWLDataProperty()))&&(__CLR4_5_2oaoalviclz3r.R.iget(1003)!=0|true))||(__CLR4_5_2oaoalviclz3r.R.iget(1004)==0&false))) {{
                            __CLR4_5_2oaoalviclz3r.R.inc(1005);if ((((nonBottomEquivPropFound)&&(__CLR4_5_2oaoalviclz3r.R.iget(1006)!=0|true))||(__CLR4_5_2oaoalviclz3r.R.iget(1007)==0&false))) {{
                                __CLR4_5_2oaoalviclz3r.R.inc(1008);isLocal = false;
                                __CLR4_5_2oaoalviclz3r.R.inc(1009);return;
                            } }else {{
                                __CLR4_5_2oaoalviclz3r.R.inc(1010);nonBottomEquivPropFound = true;
                            }
                        }}
                    }}
                }}
                }__CLR4_5_2oaoalviclz3r.R.inc(1011);isLocal = true;
                __CLR4_5_2oaoalviclz3r.R.inc(1012);break;
            case TOP_TOP:if (!__CLB4_5_2_bool5) {__CLR4_5_2oaoalviclz3r.R.inc(1013);__CLB4_5_2_bool5=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1014);isLocal = false;
                __CLR4_5_2oaoalviclz3r.R.inc(1015);break;
            default:if (!__CLB4_5_2_bool5) {__CLR4_5_2oaoalviclz3r.R.inc(1016);__CLB4_5_2_bool5=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1017);break;
            }
        }finally{__CLR4_5_2oaoalviclz3r.R.flushNeeded();}}

        // BUGFIX (TS): Added the case where it *is* local
        @Override
        public void visit(OWLDisjointObjectPropertiesAxiom axiom) {try{__CLR4_5_2oaoalviclz3r.R.inc(1018);
            boolean __CLB4_5_2_bool6=false;__CLR4_5_2oaoalviclz3r.R.inc(1019);switch (localityCls) {
            case BOTTOM_BOTTOM:if (!__CLB4_5_2_bool6) {__CLR4_5_2oaoalviclz3r.R.inc(1020);__CLB4_5_2_bool6=true;}
            case TOP_BOTTOM:if (!__CLB4_5_2_bool6) {__CLR4_5_2oaoalviclz3r.R.inc(1021);__CLB4_5_2_bool6=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1022);Collection<OWLObjectPropertyExpression> disjs = axiom.getProperties();
                __CLR4_5_2oaoalviclz3r.R.inc(1023);int size = disjs.size();
                __CLR4_5_2oaoalviclz3r.R.inc(1024);if ((((size == 1)&&(__CLR4_5_2oaoalviclz3r.R.iget(1025)!=0|true))||(__CLR4_5_2oaoalviclz3r.R.iget(1026)==0&false))) {{
                    // XXX actually being here means the axiom is not OWL 2
                    // conformant
                    __CLR4_5_2oaoalviclz3r.R.inc(1027);isLocal = true;
                } }else {{
                    __CLR4_5_2oaoalviclz3r.R.inc(1028);boolean nonBottomEquivPropFound = false;
                    __CLR4_5_2oaoalviclz3r.R.inc(1029);for (OWLObjectPropertyExpression ope : disjs) {{
                        __CLR4_5_2oaoalviclz3r.R.inc(1030);if ((((getSignature().contains(ope.getNamedProperty()))&&(__CLR4_5_2oaoalviclz3r.R.iget(1031)!=0|true))||(__CLR4_5_2oaoalviclz3r.R.iget(1032)==0&false))) {{
                            __CLR4_5_2oaoalviclz3r.R.inc(1033);if ((((nonBottomEquivPropFound)&&(__CLR4_5_2oaoalviclz3r.R.iget(1034)!=0|true))||(__CLR4_5_2oaoalviclz3r.R.iget(1035)==0&false))) {{
                                __CLR4_5_2oaoalviclz3r.R.inc(1036);isLocal = false;
                                __CLR4_5_2oaoalviclz3r.R.inc(1037);return;
                            } }else {{
                                __CLR4_5_2oaoalviclz3r.R.inc(1038);nonBottomEquivPropFound = true;
                            }
                        }}
                    }}
                }}
                }__CLR4_5_2oaoalviclz3r.R.inc(1039);isLocal = true;
                __CLR4_5_2oaoalviclz3r.R.inc(1040);break;
            case TOP_TOP:if (!__CLB4_5_2_bool6) {__CLR4_5_2oaoalviclz3r.R.inc(1041);__CLB4_5_2_bool6=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1042);isLocal = false;
                __CLR4_5_2oaoalviclz3r.R.inc(1043);break;
            default:if (!__CLB4_5_2_bool6) {__CLR4_5_2oaoalviclz3r.R.inc(1044);__CLB4_5_2_bool6=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1045);break;
            }
        }finally{__CLR4_5_2oaoalviclz3r.R.flushNeeded();}}

        // BUGFIX (TS): added the two cases where a disj union axiom *is* local:
        // - if LHS and all class expr on RHS are bot-equiv
        // - if LHS is top-equiv, one expr on RHS is top-equiv and the others
        // are bot-equiv
        @Override
        public void visit(OWLDisjointUnionAxiom axiom) {try{__CLR4_5_2oaoalviclz3r.R.inc(1046);
            __CLR4_5_2oaoalviclz3r.R.inc(1047);OWLClass lhs = axiom.getOWLClass();
            __CLR4_5_2oaoalviclz3r.R.inc(1048);Collection<OWLClassExpression> rhs = axiom.getClassExpressions();
            __CLR4_5_2oaoalviclz3r.R.inc(1049);if ((((localityCls == LocalityClass.BOTTOM_BOTTOM)&&(__CLR4_5_2oaoalviclz3r.R.iget(1050)!=0|true))||(__CLR4_5_2oaoalviclz3r.R.iget(1051)==0&false))) {{
                // TODO (TS): "!signature.contains(lhs)" is not enough
                // because lhs could be bot
                __CLR4_5_2oaoalviclz3r.R.inc(1052);if ((((!getSignature().contains(lhs))&&(__CLR4_5_2oaoalviclz3r.R.iget(1053)!=0|true))||(__CLR4_5_2oaoalviclz3r.R.iget(1054)==0&false))) {{
                    __CLR4_5_2oaoalviclz3r.R.inc(1055);for (OWLClassExpression desc : rhs) {{
                        assert (((desc != null)&&(__CLR4_5_2oaoalviclz3r.R.iget(1056)!=0|true))||(__CLR4_5_2oaoalviclz3r.R.iget(1057)==0&false));
                        __CLR4_5_2oaoalviclz3r.R.inc(1058);if ((((!bottomEvaluator.isBottomEquivalent(desc, getSignature(), localityCls))&&(__CLR4_5_2oaoalviclz3r.R.iget(1059)!=0|true))||(__CLR4_5_2oaoalviclz3r.R.iget(1060)==0&false))) {{
                            __CLR4_5_2oaoalviclz3r.R.inc(1061);isLocal = false;
                            __CLR4_5_2oaoalviclz3r.R.inc(1062);return;
                        }
                    }}
                    }__CLR4_5_2oaoalviclz3r.R.inc(1063);isLocal = true;
                } }else {{
                    __CLR4_5_2oaoalviclz3r.R.inc(1064);isLocal = false;
                }
            }} }else {{
                // case TOP_BOTTOM:
                // case TOP_TOP:
                // TODO (TS): "!signature.contains(lhs)" is not enough
                // because lhs could be top
                __CLR4_5_2oaoalviclz3r.R.inc(1065);if ((((!getSignature().contains(lhs))&&(__CLR4_5_2oaoalviclz3r.R.iget(1066)!=0|true))||(__CLR4_5_2oaoalviclz3r.R.iget(1067)==0&false))) {{
                    __CLR4_5_2oaoalviclz3r.R.inc(1068);boolean topEquivDescFound = false;
                    __CLR4_5_2oaoalviclz3r.R.inc(1069);for (OWLClassExpression desc : rhs) {{
                        assert (((desc != null)&&(__CLR4_5_2oaoalviclz3r.R.iget(1070)!=0|true))||(__CLR4_5_2oaoalviclz3r.R.iget(1071)==0&false));
                        __CLR4_5_2oaoalviclz3r.R.inc(1072);if ((((!bottomEvaluator.isBottomEquivalent(desc, getSignature(), localityCls))&&(__CLR4_5_2oaoalviclz3r.R.iget(1073)!=0|true))||(__CLR4_5_2oaoalviclz3r.R.iget(1074)==0&false))) {{
                            __CLR4_5_2oaoalviclz3r.R.inc(1075);if ((((topEvaluator.isTopEquivalent(desc, getSignature(), localityCls))&&(__CLR4_5_2oaoalviclz3r.R.iget(1076)!=0|true))||(__CLR4_5_2oaoalviclz3r.R.iget(1077)==0&false))) {{
                                __CLR4_5_2oaoalviclz3r.R.inc(1078);if ((((topEquivDescFound)&&(__CLR4_5_2oaoalviclz3r.R.iget(1079)!=0|true))||(__CLR4_5_2oaoalviclz3r.R.iget(1080)==0&false))) {{
                                    __CLR4_5_2oaoalviclz3r.R.inc(1081);isLocal = false;
                                    __CLR4_5_2oaoalviclz3r.R.inc(1082);return;
                                } }else {{
                                    __CLR4_5_2oaoalviclz3r.R.inc(1083);topEquivDescFound = true;
                                }
                            }} }else {{
                                __CLR4_5_2oaoalviclz3r.R.inc(1084);isLocal = false;
                                __CLR4_5_2oaoalviclz3r.R.inc(1085);return;
                            }
                        }}
                    }}
                    }__CLR4_5_2oaoalviclz3r.R.inc(1086);isLocal = true;
                } }else {{
                    __CLR4_5_2oaoalviclz3r.R.inc(1087);isLocal = false;
                }
            }}
        }}finally{__CLR4_5_2oaoalviclz3r.R.flushNeeded();}}

        @Override
        public void visit(OWLAnnotationAssertionAxiom axiom) {try{__CLR4_5_2oaoalviclz3r.R.inc(1088);
            __CLR4_5_2oaoalviclz3r.R.inc(1089);isLocal = true;
        }finally{__CLR4_5_2oaoalviclz3r.R.flushNeeded();}}

        @Override
        public void visit(OWLEquivalentClassesAxiom axiom) {try{__CLR4_5_2oaoalviclz3r.R.inc(1090);
            __CLR4_5_2oaoalviclz3r.R.inc(1091);isLocal = true;
            __CLR4_5_2oaoalviclz3r.R.inc(1092);Iterator<OWLClassExpression> eqs = axiom.getClassExpressions().iterator();
            __CLR4_5_2oaoalviclz3r.R.inc(1093);OWLClassExpression first = eqs.next();
            assert (((first != null)&&(__CLR4_5_2oaoalviclz3r.R.iget(1094)!=0|true))||(__CLR4_5_2oaoalviclz3r.R.iget(1095)==0&false));
            // axiom is local if it contains a single class expression
            __CLR4_5_2oaoalviclz3r.R.inc(1096);if ((((!eqs.hasNext())&&(__CLR4_5_2oaoalviclz3r.R.iget(1097)!=0|true))||(__CLR4_5_2oaoalviclz3r.R.iget(1098)==0&false))) {{
                __CLR4_5_2oaoalviclz3r.R.inc(1099);return;
            }
            // axiom is local iff either all class expressions evaluate to TOP
            // or all evaluate to BOTTOM
            // check if first class expr. is BOTTOM
            }__CLR4_5_2oaoalviclz3r.R.inc(1100);boolean isBottom = bottomEvaluator.isBottomEquivalent(first, getSignature(), localityCls);
            // if not BOTTOM or not TOP then this axiom is non-local
            __CLR4_5_2oaoalviclz3r.R.inc(1101);if ((((!isBottom && !topEvaluator.isTopEquivalent(first, getSignature(), localityCls))&&(__CLR4_5_2oaoalviclz3r.R.iget(1102)!=0|true))||(__CLR4_5_2oaoalviclz3r.R.iget(1103)==0&false))) {{
                __CLR4_5_2oaoalviclz3r.R.inc(1104);isLocal = false;
            }
            }__CLR4_5_2oaoalviclz3r.R.inc(1105);if ((((isBottom)&&(__CLR4_5_2oaoalviclz3r.R.iget(1106)!=0|true))||(__CLR4_5_2oaoalviclz3r.R.iget(1107)==0&false))) {{
                // unless we find a non-locality, process all the class
                // expressions
                __CLR4_5_2oaoalviclz3r.R.inc(1108);while ((((isLocal && eqs.hasNext())&&(__CLR4_5_2oaoalviclz3r.R.iget(1109)!=0|true))||(__CLR4_5_2oaoalviclz3r.R.iget(1110)==0&false))) {{
                    __CLR4_5_2oaoalviclz3r.R.inc(1111);OWLClassExpression next = eqs.next();
                    assert (((next != null)&&(__CLR4_5_2oaoalviclz3r.R.iget(1112)!=0|true))||(__CLR4_5_2oaoalviclz3r.R.iget(1113)==0&false));
                    // first class expr. was BOTTOM, so this one should be
                    // BOTTOM too
                    __CLR4_5_2oaoalviclz3r.R.inc(1114);if ((((!bottomEvaluator.isBottomEquivalent(next, getSignature(), localityCls))&&(__CLR4_5_2oaoalviclz3r.R.iget(1115)!=0|true))||(__CLR4_5_2oaoalviclz3r.R.iget(1116)==0&false))) {{
                        __CLR4_5_2oaoalviclz3r.R.inc(1117);isLocal = false;
                    }
                }}
            }} }else {{
                // unless we find a non-locality, process all the class
                // expressions
                __CLR4_5_2oaoalviclz3r.R.inc(1118);while ((((isLocal && eqs.hasNext())&&(__CLR4_5_2oaoalviclz3r.R.iget(1119)!=0|true))||(__CLR4_5_2oaoalviclz3r.R.iget(1120)==0&false))) {{
                    __CLR4_5_2oaoalviclz3r.R.inc(1121);OWLClassExpression next = eqs.next();
                    assert (((next != null)&&(__CLR4_5_2oaoalviclz3r.R.iget(1122)!=0|true))||(__CLR4_5_2oaoalviclz3r.R.iget(1123)==0&false));
                    // first class expr. was TOP, so this one should be TOP too
                    __CLR4_5_2oaoalviclz3r.R.inc(1124);if ((((!topEvaluator.isTopEquivalent(next, getSignature(), localityCls))&&(__CLR4_5_2oaoalviclz3r.R.iget(1125)!=0|true))||(__CLR4_5_2oaoalviclz3r.R.iget(1126)==0&false))) {{
                        __CLR4_5_2oaoalviclz3r.R.inc(1127);isLocal = false;
                    }
                }}
            }}
        }}finally{__CLR4_5_2oaoalviclz3r.R.flushNeeded();}}

        @Override
        public void visit(OWLEquivalentDataPropertiesAxiom axiom) {try{__CLR4_5_2oaoalviclz3r.R.inc(1128);
            __CLR4_5_2oaoalviclz3r.R.inc(1129);Collection<OWLDataPropertyExpression> eqs = axiom.getProperties();
            __CLR4_5_2oaoalviclz3r.R.inc(1130);int size = eqs.size();
            __CLR4_5_2oaoalviclz3r.R.inc(1131);if ((((size == 1)&&(__CLR4_5_2oaoalviclz3r.R.iget(1132)!=0|true))||(__CLR4_5_2oaoalviclz3r.R.iget(1133)==0&false))) {{
                __CLR4_5_2oaoalviclz3r.R.inc(1134);isLocal = true;
            } }else {{
                __CLR4_5_2oaoalviclz3r.R.inc(1135);for (OWLDataPropertyExpression p : eqs) {{
                    __CLR4_5_2oaoalviclz3r.R.inc(1136);if ((((getSignature().contains(p.asOWLDataProperty()))&&(__CLR4_5_2oaoalviclz3r.R.iget(1137)!=0|true))||(__CLR4_5_2oaoalviclz3r.R.iget(1138)==0&false))) {{
                        __CLR4_5_2oaoalviclz3r.R.inc(1139);isLocal = false;
                        __CLR4_5_2oaoalviclz3r.R.inc(1140);return;
                    }
                }}
                }__CLR4_5_2oaoalviclz3r.R.inc(1141);isLocal = true;
            }
        }}finally{__CLR4_5_2oaoalviclz3r.R.flushNeeded();}}

        @Override
        public void visit(OWLEquivalentObjectPropertiesAxiom axiom) {try{__CLR4_5_2oaoalviclz3r.R.inc(1142);
            __CLR4_5_2oaoalviclz3r.R.inc(1143);Collection<OWLObjectPropertyExpression> eqs = axiom.getProperties();
            __CLR4_5_2oaoalviclz3r.R.inc(1144);int size = eqs.size();
            __CLR4_5_2oaoalviclz3r.R.inc(1145);if ((((size == 1)&&(__CLR4_5_2oaoalviclz3r.R.iget(1146)!=0|true))||(__CLR4_5_2oaoalviclz3r.R.iget(1147)==0&false))) {{
                __CLR4_5_2oaoalviclz3r.R.inc(1148);isLocal = true;
            } }else {{
                __CLR4_5_2oaoalviclz3r.R.inc(1149);for (OWLObjectPropertyExpression p : eqs) {{
                    __CLR4_5_2oaoalviclz3r.R.inc(1150);if ((((getSignature().contains(p.getNamedProperty()))&&(__CLR4_5_2oaoalviclz3r.R.iget(1151)!=0|true))||(__CLR4_5_2oaoalviclz3r.R.iget(1152)==0&false))) {{
                        __CLR4_5_2oaoalviclz3r.R.inc(1153);isLocal = false;
                        __CLR4_5_2oaoalviclz3r.R.inc(1154);return;
                    }
                }}
                }__CLR4_5_2oaoalviclz3r.R.inc(1155);isLocal = true;
            }
        }}finally{__CLR4_5_2oaoalviclz3r.R.flushNeeded();}}

        @Override
        public void visit(OWLFunctionalDataPropertyAxiom axiom) {try{__CLR4_5_2oaoalviclz3r.R.inc(1156);
            boolean __CLB4_5_2_bool7=false;__CLR4_5_2oaoalviclz3r.R.inc(1157);switch (localityCls) {
            case BOTTOM_BOTTOM:if (!__CLB4_5_2_bool7) {__CLR4_5_2oaoalviclz3r.R.inc(1158);__CLB4_5_2_bool7=true;}
            case TOP_BOTTOM:if (!__CLB4_5_2_bool7) {__CLR4_5_2oaoalviclz3r.R.inc(1159);__CLB4_5_2_bool7=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1160);isLocal = !getSignature().contains(axiom.getProperty().asOWLDataProperty());
                __CLR4_5_2oaoalviclz3r.R.inc(1161);break;
            case TOP_TOP:if (!__CLB4_5_2_bool7) {__CLR4_5_2oaoalviclz3r.R.inc(1162);__CLB4_5_2_bool7=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1163);isLocal = false;
                __CLR4_5_2oaoalviclz3r.R.inc(1164);break;
            default:if (!__CLB4_5_2_bool7) {__CLR4_5_2oaoalviclz3r.R.inc(1165);__CLB4_5_2_bool7=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1166);break;
            }
        }finally{__CLR4_5_2oaoalviclz3r.R.flushNeeded();}}

        // BUGFIX (TS): replaced call to asOWLObjectProperty() with
        // getNamedProperty()
        @Override
        public void visit(OWLFunctionalObjectPropertyAxiom axiom) {try{__CLR4_5_2oaoalviclz3r.R.inc(1167);
            boolean __CLB4_5_2_bool8=false;__CLR4_5_2oaoalviclz3r.R.inc(1168);switch (localityCls) {
            case BOTTOM_BOTTOM:if (!__CLB4_5_2_bool8) {__CLR4_5_2oaoalviclz3r.R.inc(1169);__CLB4_5_2_bool8=true;}
            case TOP_BOTTOM:if (!__CLB4_5_2_bool8) {__CLR4_5_2oaoalviclz3r.R.inc(1170);__CLB4_5_2_bool8=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1171);isLocal = !getSignature().contains(axiom.getProperty().getNamedProperty());
                __CLR4_5_2oaoalviclz3r.R.inc(1172);break;
            case TOP_TOP:if (!__CLB4_5_2_bool8) {__CLR4_5_2oaoalviclz3r.R.inc(1173);__CLB4_5_2_bool8=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1174);isLocal = false;
                __CLR4_5_2oaoalviclz3r.R.inc(1175);break;
            default:if (!__CLB4_5_2_bool8) {__CLR4_5_2oaoalviclz3r.R.inc(1176);__CLB4_5_2_bool8=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1177);break;
            }
        }finally{__CLR4_5_2oaoalviclz3r.R.flushNeeded();}}

        @Override
        public void visit(OWLInverseFunctionalObjectPropertyAxiom axiom) {try{__CLR4_5_2oaoalviclz3r.R.inc(1178);
            boolean __CLB4_5_2_bool9=false;__CLR4_5_2oaoalviclz3r.R.inc(1179);switch (localityCls) {
            case BOTTOM_BOTTOM:if (!__CLB4_5_2_bool9) {__CLR4_5_2oaoalviclz3r.R.inc(1180);__CLB4_5_2_bool9=true;}
            case TOP_BOTTOM:if (!__CLB4_5_2_bool9) {__CLR4_5_2oaoalviclz3r.R.inc(1181);__CLB4_5_2_bool9=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1182);isLocal = !getSignature().contains(axiom.getProperty().getNamedProperty());
                __CLR4_5_2oaoalviclz3r.R.inc(1183);break;
            case TOP_TOP:if (!__CLB4_5_2_bool9) {__CLR4_5_2oaoalviclz3r.R.inc(1184);__CLB4_5_2_bool9=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1185);isLocal = false;
                __CLR4_5_2oaoalviclz3r.R.inc(1186);break;
            default:if (!__CLB4_5_2_bool9) {__CLR4_5_2oaoalviclz3r.R.inc(1187);__CLB4_5_2_bool9=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1188);break;
            }
        }finally{__CLR4_5_2oaoalviclz3r.R.flushNeeded();}}

        @Override
        public void visit(OWLInverseObjectPropertiesAxiom axiom) {try{__CLR4_5_2oaoalviclz3r.R.inc(1189);
            __CLR4_5_2oaoalviclz3r.R.inc(1190);isLocal = !getSignature().contains(axiom.getFirstProperty().getNamedProperty()) && !getSignature().contains(
                axiom.getSecondProperty().getNamedProperty());
        }finally{__CLR4_5_2oaoalviclz3r.R.flushNeeded();}}

        // BUGFIX: (TS) Irreflexive OP axioms are local in the *_BOTTOM case:
        // The empty object property is irreflexive!
        // BUGFIX: (DT) OP in signature makes the axiom non-local
        @Override
        public void visit(OWLIrreflexiveObjectPropertyAxiom axiom) {try{__CLR4_5_2oaoalviclz3r.R.inc(1191);
            boolean __CLB4_5_2_bool10=false;__CLR4_5_2oaoalviclz3r.R.inc(1192);switch (localityCls) {
            case BOTTOM_BOTTOM:if (!__CLB4_5_2_bool10) {__CLR4_5_2oaoalviclz3r.R.inc(1193);__CLB4_5_2_bool10=true;}
            case TOP_BOTTOM:if (!__CLB4_5_2_bool10) {__CLR4_5_2oaoalviclz3r.R.inc(1194);__CLB4_5_2_bool10=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1195);isLocal = !getSignature().contains(axiom.getProperty().getNamedProperty());
                __CLR4_5_2oaoalviclz3r.R.inc(1196);break;
            case TOP_TOP:if (!__CLB4_5_2_bool10) {__CLR4_5_2oaoalviclz3r.R.inc(1197);__CLB4_5_2_bool10=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1198);isLocal = false;
                __CLR4_5_2oaoalviclz3r.R.inc(1199);break;
            default:if (!__CLB4_5_2_bool10) {__CLR4_5_2oaoalviclz3r.R.inc(1200);__CLB4_5_2_bool10=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1201);break;
            }
        }finally{__CLR4_5_2oaoalviclz3r.R.flushNeeded();}}

        // BUGFIX: (TS) Added the case where this is local. (This is dual to the
        // case of a "positive" DP assertion.)
        @Override
        public void visit(OWLNegativeDataPropertyAssertionAxiom axiom) {try{__CLR4_5_2oaoalviclz3r.R.inc(1202);
            boolean __CLB4_5_2_bool11=false;__CLR4_5_2oaoalviclz3r.R.inc(1203);switch (localityCls) {
            case BOTTOM_BOTTOM:if (!__CLB4_5_2_bool11) {__CLR4_5_2oaoalviclz3r.R.inc(1204);__CLB4_5_2_bool11=true;}
            case TOP_BOTTOM:if (!__CLB4_5_2_bool11) {__CLR4_5_2oaoalviclz3r.R.inc(1205);__CLB4_5_2_bool11=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1206);isLocal = !getSignature().contains(axiom.getProperty().asOWLDataProperty());
                __CLR4_5_2oaoalviclz3r.R.inc(1207);break;
            case TOP_TOP:if (!__CLB4_5_2_bool11) {__CLR4_5_2oaoalviclz3r.R.inc(1208);__CLB4_5_2_bool11=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1209);isLocal = false;
                __CLR4_5_2oaoalviclz3r.R.inc(1210);break;
            default:if (!__CLB4_5_2_bool11) {__CLR4_5_2oaoalviclz3r.R.inc(1211);__CLB4_5_2_bool11=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1212);break;
            }
        }finally{__CLR4_5_2oaoalviclz3r.R.flushNeeded();}}

        // BUGFIX: (TS) Added the case where this is local. (This is dual to the
        // case of a "positive" OP assertion.)
        @Override
        public void visit(OWLNegativeObjectPropertyAssertionAxiom axiom) {try{__CLR4_5_2oaoalviclz3r.R.inc(1213);
            boolean __CLB4_5_2_bool12=false;__CLR4_5_2oaoalviclz3r.R.inc(1214);switch (localityCls) {
            case BOTTOM_BOTTOM:if (!__CLB4_5_2_bool12) {__CLR4_5_2oaoalviclz3r.R.inc(1215);__CLB4_5_2_bool12=true;}
            case TOP_BOTTOM:if (!__CLB4_5_2_bool12) {__CLR4_5_2oaoalviclz3r.R.inc(1216);__CLB4_5_2_bool12=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1217);isLocal = !getSignature().contains(axiom.getProperty().getNamedProperty());
                __CLR4_5_2oaoalviclz3r.R.inc(1218);break;
            case TOP_TOP:if (!__CLB4_5_2_bool12) {__CLR4_5_2oaoalviclz3r.R.inc(1219);__CLB4_5_2_bool12=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1220);isLocal = false;
                __CLR4_5_2oaoalviclz3r.R.inc(1221);break;
            default:if (!__CLB4_5_2_bool12) {__CLR4_5_2oaoalviclz3r.R.inc(1222);__CLB4_5_2_bool12=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1223);break;
            }
        }finally{__CLR4_5_2oaoalviclz3r.R.flushNeeded();}}

        @Override
        public void visit(OWLObjectPropertyAssertionAxiom axiom) {try{__CLR4_5_2oaoalviclz3r.R.inc(1224);
            boolean __CLB4_5_2_bool13=false;__CLR4_5_2oaoalviclz3r.R.inc(1225);switch (localityCls) {
            case BOTTOM_BOTTOM:if (!__CLB4_5_2_bool13) {__CLR4_5_2oaoalviclz3r.R.inc(1226);__CLB4_5_2_bool13=true;}
            case TOP_BOTTOM:if (!__CLB4_5_2_bool13) {__CLR4_5_2oaoalviclz3r.R.inc(1227);__CLB4_5_2_bool13=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1228);isLocal = false;
                __CLR4_5_2oaoalviclz3r.R.inc(1229);break;
            case TOP_TOP:if (!__CLB4_5_2_bool13) {__CLR4_5_2oaoalviclz3r.R.inc(1230);__CLB4_5_2_bool13=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1231);isLocal = !getSignature().contains(axiom.getProperty().getNamedProperty());
                __CLR4_5_2oaoalviclz3r.R.inc(1232);break;
            default:if (!__CLB4_5_2_bool13) {__CLR4_5_2oaoalviclz3r.R.inc(1233);__CLB4_5_2_bool13=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1234);break;
            }
        }finally{__CLR4_5_2oaoalviclz3r.R.flushNeeded();}}

        // BUGFIX: (TS) Added the cases where this is local
        @Override
        public void visit(OWLSubPropertyChainOfAxiom axiom) {try{__CLR4_5_2oaoalviclz3r.R.inc(1235);
            boolean __CLB4_5_2_bool14=false;__CLR4_5_2oaoalviclz3r.R.inc(1236);switch (localityCls) {
            case BOTTOM_BOTTOM:if (!__CLB4_5_2_bool14) {__CLR4_5_2oaoalviclz3r.R.inc(1237);__CLB4_5_2_bool14=true;}
            case TOP_BOTTOM:if (!__CLB4_5_2_bool14) {__CLR4_5_2oaoalviclz3r.R.inc(1238);__CLB4_5_2_bool14=true;}
                // Axiom is local iff at least one prop in the chain is
                // bot-equiv
                __CLR4_5_2oaoalviclz3r.R.inc(1239);for (OWLObjectPropertyExpression ope : axiom.getPropertyChain()) {{
                    __CLR4_5_2oaoalviclz3r.R.inc(1240);if ((((!getSignature().contains(ope.getNamedProperty()))&&(__CLR4_5_2oaoalviclz3r.R.iget(1241)!=0|true))||(__CLR4_5_2oaoalviclz3r.R.iget(1242)==0&false))) {{
                        __CLR4_5_2oaoalviclz3r.R.inc(1243);isLocal = true;
                        __CLR4_5_2oaoalviclz3r.R.inc(1244);return;
                    }
                }}
                }__CLR4_5_2oaoalviclz3r.R.inc(1245);isLocal = false;
                __CLR4_5_2oaoalviclz3r.R.inc(1246);break;
            case TOP_TOP:if (!__CLB4_5_2_bool14) {__CLR4_5_2oaoalviclz3r.R.inc(1247);__CLB4_5_2_bool14=true;}
                // Axiom is local iff RHS is top-equiv
                __CLR4_5_2oaoalviclz3r.R.inc(1248);if ((((!getSignature().contains(axiom.getSuperProperty().getNamedProperty()))&&(__CLR4_5_2oaoalviclz3r.R.iget(1249)!=0|true))||(__CLR4_5_2oaoalviclz3r.R.iget(1250)==0&false))) {{
                    __CLR4_5_2oaoalviclz3r.R.inc(1251);isLocal = true;
                } }else {{
                    __CLR4_5_2oaoalviclz3r.R.inc(1252);isLocal = false;
                }
                }__CLR4_5_2oaoalviclz3r.R.inc(1253);break;
            default:if (!__CLB4_5_2_bool14) {__CLR4_5_2oaoalviclz3r.R.inc(1254);__CLB4_5_2_bool14=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1255);break;
            }
        }finally{__CLR4_5_2oaoalviclz3r.R.flushNeeded();}}

        @Override
        public void visit(OWLObjectPropertyDomainAxiom axiom) {try{__CLR4_5_2oaoalviclz3r.R.inc(1256);
            boolean __CLB4_5_2_bool15=false;__CLR4_5_2oaoalviclz3r.R.inc(1257);switch (localityCls) {
            case BOTTOM_BOTTOM:if (!__CLB4_5_2_bool15) {__CLR4_5_2oaoalviclz3r.R.inc(1258);__CLB4_5_2_bool15=true;}
            case TOP_BOTTOM:if (!__CLB4_5_2_bool15) {__CLR4_5_2oaoalviclz3r.R.inc(1259);__CLB4_5_2_bool15=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1260);isLocal = !getSignature().contains(axiom.getProperty().getNamedProperty()) || topEvaluator
                    .isTopEquivalent(axiom.getDomain(), getSignature(), localityCls);
                __CLR4_5_2oaoalviclz3r.R.inc(1261);break;
            case TOP_TOP:if (!__CLB4_5_2_bool15) {__CLR4_5_2oaoalviclz3r.R.inc(1262);__CLB4_5_2_bool15=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1263);isLocal = topEvaluator.isTopEquivalent(axiom.getDomain(), getSignature(), localityCls);
                __CLR4_5_2oaoalviclz3r.R.inc(1264);break;
            default:if (!__CLB4_5_2_bool15) {__CLR4_5_2oaoalviclz3r.R.inc(1265);__CLB4_5_2_bool15=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1266);break;
            }
        }finally{__CLR4_5_2oaoalviclz3r.R.flushNeeded();}}

        @Override
        public void visit(OWLObjectPropertyRangeAxiom axiom) {try{__CLR4_5_2oaoalviclz3r.R.inc(1267);
            boolean __CLB4_5_2_bool16=false;__CLR4_5_2oaoalviclz3r.R.inc(1268);switch (localityCls) {
            case BOTTOM_BOTTOM:if (!__CLB4_5_2_bool16) {__CLR4_5_2oaoalviclz3r.R.inc(1269);__CLB4_5_2_bool16=true;}
            case TOP_BOTTOM:if (!__CLB4_5_2_bool16) {__CLR4_5_2oaoalviclz3r.R.inc(1270);__CLB4_5_2_bool16=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1271);isLocal = !getSignature().contains(axiom.getProperty().getNamedProperty()) || topEvaluator
                    .isTopEquivalent(axiom.getRange(), getSignature(), localityCls);
                __CLR4_5_2oaoalviclz3r.R.inc(1272);break;
            case TOP_TOP:if (!__CLB4_5_2_bool16) {__CLR4_5_2oaoalviclz3r.R.inc(1273);__CLB4_5_2_bool16=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1274);isLocal = topEvaluator.isTopEquivalent(axiom.getRange(), getSignature(), localityCls);
                __CLR4_5_2oaoalviclz3r.R.inc(1275);break;
            default:if (!__CLB4_5_2_bool16) {__CLR4_5_2oaoalviclz3r.R.inc(1276);__CLB4_5_2_bool16=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1277);break;
            }
        }finally{__CLR4_5_2oaoalviclz3r.R.flushNeeded();}}

        @Override
        public void visit(OWLSubObjectPropertyOfAxiom axiom) {try{__CLR4_5_2oaoalviclz3r.R.inc(1278);
            boolean __CLB4_5_2_bool17=false;__CLR4_5_2oaoalviclz3r.R.inc(1279);switch (localityCls) {
            case BOTTOM_BOTTOM:if (!__CLB4_5_2_bool17) {__CLR4_5_2oaoalviclz3r.R.inc(1280);__CLB4_5_2_bool17=true;}
            case TOP_BOTTOM:if (!__CLB4_5_2_bool17) {__CLR4_5_2oaoalviclz3r.R.inc(1281);__CLB4_5_2_bool17=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1282);isLocal = !getSignature().contains(axiom.getSubProperty().getNamedProperty());
                __CLR4_5_2oaoalviclz3r.R.inc(1283);break;
            case TOP_TOP:if (!__CLB4_5_2_bool17) {__CLR4_5_2oaoalviclz3r.R.inc(1284);__CLB4_5_2_bool17=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1285);isLocal = !getSignature().contains(axiom.getSuperProperty().getNamedProperty());
                __CLR4_5_2oaoalviclz3r.R.inc(1286);break;
            default:if (!__CLB4_5_2_bool17) {__CLR4_5_2oaoalviclz3r.R.inc(1287);__CLB4_5_2_bool17=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1288);break;
            }
        }finally{__CLR4_5_2oaoalviclz3r.R.flushNeeded();}}

        // BUGFIX: (DT) Bottom property is not reflexive
        @Override
        public void visit(OWLReflexiveObjectPropertyAxiom axiom) {try{__CLR4_5_2oaoalviclz3r.R.inc(1289);
            boolean __CLB4_5_2_bool18=false;__CLR4_5_2oaoalviclz3r.R.inc(1290);switch (localityCls) {
            case BOTTOM_BOTTOM:if (!__CLB4_5_2_bool18) {__CLR4_5_2oaoalviclz3r.R.inc(1291);__CLB4_5_2_bool18=true;}
            case TOP_BOTTOM:if (!__CLB4_5_2_bool18) {__CLR4_5_2oaoalviclz3r.R.inc(1292);__CLB4_5_2_bool18=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1293);isLocal = false;
                __CLR4_5_2oaoalviclz3r.R.inc(1294);break;
            case TOP_TOP:if (!__CLB4_5_2_bool18) {__CLR4_5_2oaoalviclz3r.R.inc(1295);__CLB4_5_2_bool18=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1296);isLocal = !getSignature().contains(axiom.getProperty().getNamedProperty());
                __CLR4_5_2oaoalviclz3r.R.inc(1297);break;
            default:if (!__CLB4_5_2_bool18) {__CLR4_5_2oaoalviclz3r.R.inc(1298);__CLB4_5_2_bool18=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1299);break;
            }
        }finally{__CLR4_5_2oaoalviclz3r.R.flushNeeded();}}

        // BUGFIX: (TS) Same individuals axioms are local, too.
        // They need to be added to the module after the locality checks have
        // been performed.
        @Override
        public void visit(OWLSameIndividualAxiom axiom) {try{__CLR4_5_2oaoalviclz3r.R.inc(1300);
            __CLR4_5_2oaoalviclz3r.R.inc(1301);isLocal = true;
        }finally{__CLR4_5_2oaoalviclz3r.R.flushNeeded();}}

        @Override
        public void visit(OWLSubClassOfAxiom axiom) {try{__CLR4_5_2oaoalviclz3r.R.inc(1302);
            __CLR4_5_2oaoalviclz3r.R.inc(1303);isLocal = bottomEvaluator.isBottomEquivalent(axiom.getSubClass(), getSignature(), localityCls)
                || topEvaluator.isTopEquivalent(axiom.getSuperClass(), getSignature(), localityCls);
        }finally{__CLR4_5_2oaoalviclz3r.R.flushNeeded();}}

        @Override
        public void visit(OWLSymmetricObjectPropertyAxiom axiom) {try{__CLR4_5_2oaoalviclz3r.R.inc(1304);
            __CLR4_5_2oaoalviclz3r.R.inc(1305);isLocal = !getSignature().contains(axiom.getProperty().getNamedProperty());
        }finally{__CLR4_5_2oaoalviclz3r.R.flushNeeded();}}

        @Override
        public void visit(OWLTransitiveObjectPropertyAxiom axiom) {try{__CLR4_5_2oaoalviclz3r.R.inc(1306);
            __CLR4_5_2oaoalviclz3r.R.inc(1307);isLocal = !getSignature().contains(axiom.getProperty().getNamedProperty());
        }finally{__CLR4_5_2oaoalviclz3r.R.flushNeeded();}}

        // TODO: (TS) Can't we treat this in a more differentiated way?
        @Override
        public void visit(SWRLRule rule) {try{__CLR4_5_2oaoalviclz3r.R.inc(1308);
            __CLR4_5_2oaoalviclz3r.R.inc(1309);isLocal = false;
        }finally{__CLR4_5_2oaoalviclz3r.R.flushNeeded();}}

        @Override
        public void visit(OWLHasKeyAxiom axiom) {try{__CLR4_5_2oaoalviclz3r.R.inc(1310);
            __CLR4_5_2oaoalviclz3r.R.inc(1311);isLocal = true;
        }finally{__CLR4_5_2oaoalviclz3r.R.flushNeeded();}}

        @Override
        public void visit(OWLAnnotationPropertyDomainAxiom axiom) {try{__CLR4_5_2oaoalviclz3r.R.inc(1312);
            __CLR4_5_2oaoalviclz3r.R.inc(1313);isLocal = true;
        }finally{__CLR4_5_2oaoalviclz3r.R.flushNeeded();}}

        @Override
        public void visit(OWLAnnotationPropertyRangeAxiom axiom) {try{__CLR4_5_2oaoalviclz3r.R.inc(1314);
            __CLR4_5_2oaoalviclz3r.R.inc(1315);isLocal = true;
        }finally{__CLR4_5_2oaoalviclz3r.R.flushNeeded();}}

        @Override
        public void visit(OWLSubAnnotationPropertyOfAxiom axiom) {try{__CLR4_5_2oaoalviclz3r.R.inc(1316);
            __CLR4_5_2oaoalviclz3r.R.inc(1317);isLocal = true;
        }finally{__CLR4_5_2oaoalviclz3r.R.flushNeeded();}}
    }

    /**
     * Used to determine if class expressions are equivalent to \bottom using
     * the provided locality class.
     */
    private static class BottomEquivalenceEvaluator implements OWLClassExpressionVisitor {

        private boolean isBottomEquivalent;
        private LocalityClass localityCls;
        private Collection<? extends OWLEntity> signature;
        private TopEquivalenceEvaluator topEvaluator;

        /** Instantiates a new bottom equivalence evaluator. */
        BottomEquivalenceEvaluator() {try{__CLR4_5_2oaoalviclz3r.R.inc(1318);}finally{__CLR4_5_2oaoalviclz3r.R.flushNeeded();}}

        /**
         * Checks if is bottom equivalent.
         * 
         * @param desc
         *        the desc
         * @return true, if is bottom equivalent
         */
        private boolean isBottomEquivalent(@Nonnull OWLClassExpression desc) {try{__CLR4_5_2oaoalviclz3r.R.inc(1319);
            __CLR4_5_2oaoalviclz3r.R.inc(1320);checkNotNull(desc, "desc cannot be null").accept(this);
            __CLR4_5_2oaoalviclz3r.R.inc(1321);return isBottomEquivalent;
        }finally{__CLR4_5_2oaoalviclz3r.R.flushNeeded();}}

        /**
         * Checks if is bottom equivalent.
         * 
         * @param desc
         *        the desc
         * @param sig
         *        the sig
         * @param locality
         *        the locality
         * @return true, if is bottom equivalent
         */
        public boolean isBottomEquivalent(@Nonnull OWLClassExpression desc,
            @Nonnull Collection<? extends OWLEntity> sig, @Nonnull LocalityClass locality) {try{__CLR4_5_2oaoalviclz3r.R.inc(1322);
            __CLR4_5_2oaoalviclz3r.R.inc(1323);localityCls = checkNotNull(locality, "locality cannot be null");
            __CLR4_5_2oaoalviclz3r.R.inc(1324);signature = checkNotNull(sig, "sig cannot be null");
            __CLR4_5_2oaoalviclz3r.R.inc(1325);checkNotNull(desc, "desc cannot be null").accept(this);
            __CLR4_5_2oaoalviclz3r.R.inc(1326);return isBottomEquivalent;
        }finally{__CLR4_5_2oaoalviclz3r.R.flushNeeded();}}

        @Nonnull
        protected Collection<? extends OWLEntity> getSignature() {try{__CLR4_5_2oaoalviclz3r.R.inc(1327);
            __CLR4_5_2oaoalviclz3r.R.inc(1328);return verifyNotNull(signature);
        }finally{__CLR4_5_2oaoalviclz3r.R.flushNeeded();}}

        @Nonnull
        protected LocalityClass getLocality() {try{__CLR4_5_2oaoalviclz3r.R.inc(1329);
            __CLR4_5_2oaoalviclz3r.R.inc(1330);return verifyNotNull(localityCls);
        }finally{__CLR4_5_2oaoalviclz3r.R.flushNeeded();}}

        /**
         * Sets the top evaluator.
         * 
         * @param evaluator
         *        the new top evaluator
         */
        public void setTopEvaluator(@Nonnull TopEquivalenceEvaluator evaluator) {try{__CLR4_5_2oaoalviclz3r.R.inc(1331);
            __CLR4_5_2oaoalviclz3r.R.inc(1332);topEvaluator = checkNotNull(evaluator, "evaluator cannot be null");
        }finally{__CLR4_5_2oaoalviclz3r.R.flushNeeded();}}

        @Override
        public void visit(OWLClass ce) {try{__CLR4_5_2oaoalviclz3r.R.inc(1333);
            boolean __CLB4_5_2_bool19=false;__CLR4_5_2oaoalviclz3r.R.inc(1334);switch (getLocality()) {
            case BOTTOM_BOTTOM:if (!__CLB4_5_2_bool19) {__CLR4_5_2oaoalviclz3r.R.inc(1335);__CLB4_5_2_bool19=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1336);isBottomEquivalent = ce.isOWLNothing() || !ce.isOWLThing() && !getSignature().contains(ce);
                __CLR4_5_2oaoalviclz3r.R.inc(1337);break;
            case TOP_BOTTOM:if (!__CLB4_5_2_bool19) {__CLR4_5_2oaoalviclz3r.R.inc(1338);__CLB4_5_2_bool19=true;}
            case TOP_TOP:if (!__CLB4_5_2_bool19) {__CLR4_5_2oaoalviclz3r.R.inc(1339);__CLB4_5_2_bool19=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1340);isBottomEquivalent = ce.isOWLNothing();
                __CLR4_5_2oaoalviclz3r.R.inc(1341);break;
            default:if (!__CLB4_5_2_bool19) {__CLR4_5_2oaoalviclz3r.R.inc(1342);__CLB4_5_2_bool19=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1343);break;
            }
        }finally{__CLR4_5_2oaoalviclz3r.R.flushNeeded();}}

        // BUGFIX: (TS) Even in the TOP_TOP case, this is not bottom-equiv:
        // "forall top.D" is not necessarily empty
        // BUGFIX: (TS, 3): In the TOP_TOP case, there is a bottom-equiv
        // possibility.
        @Override
        public void visit(OWLDataAllValuesFrom ce) {try{__CLR4_5_2oaoalviclz3r.R.inc(1344);
            boolean __CLB4_5_2_bool20=false;__CLR4_5_2oaoalviclz3r.R.inc(1345);switch (getLocality()) {
            case BOTTOM_BOTTOM:if (!__CLB4_5_2_bool20) {__CLR4_5_2oaoalviclz3r.R.inc(1346);__CLB4_5_2_bool20=true;}
            case TOP_BOTTOM:if (!__CLB4_5_2_bool20) {__CLR4_5_2oaoalviclz3r.R.inc(1347);__CLB4_5_2_bool20=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1348);isBottomEquivalent = false;
                __CLR4_5_2oaoalviclz3r.R.inc(1349);break;
            case TOP_TOP:if (!__CLB4_5_2_bool20) {__CLR4_5_2oaoalviclz3r.R.inc(1350);__CLB4_5_2_bool20=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1351);isBottomEquivalent = !getSignature().contains(ce.getProperty().asOWLDataProperty()) && !ce.getFiller()
                    .isTopDatatype();
                __CLR4_5_2oaoalviclz3r.R.inc(1352);break;
            default:if (!__CLB4_5_2_bool20) {__CLR4_5_2oaoalviclz3r.R.inc(1353);__CLB4_5_2_bool20=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1354);break;
            }
        }finally{__CLR4_5_2oaoalviclz3r.R.flushNeeded();}}

        // BUGFIX: (TS) Corrected both conditions; included case n==0
        // BUGFIX: (TS, 2) Added the cases where the filler is top-equiv
        // BUGFIX: (TS, 3) Repaired the cases where the filler is top-equiv
        @Override
        public void visit(OWLDataExactCardinality ce) {try{__CLR4_5_2oaoalviclz3r.R.inc(1355);
            boolean __CLB4_5_2_bool21=false;__CLR4_5_2oaoalviclz3r.R.inc(1356);switch (getLocality()) {
            case BOTTOM_BOTTOM:if (!__CLB4_5_2_bool21) {__CLR4_5_2oaoalviclz3r.R.inc(1357);__CLB4_5_2_bool21=true;}
            case TOP_BOTTOM:if (!__CLB4_5_2_bool21) {__CLR4_5_2oaoalviclz3r.R.inc(1358);__CLB4_5_2_bool21=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1359);isBottomEquivalent = ce.getCardinality() > 0 && !getSignature().contains(ce.getProperty()
                    .asOWLDataProperty());
                __CLR4_5_2oaoalviclz3r.R.inc(1360);break;
            case TOP_TOP:if (!__CLB4_5_2_bool21) {__CLR4_5_2oaoalviclz3r.R.inc(1361);__CLB4_5_2_bool21=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1362);isBottomEquivalent = ce.getCardinality() == 0 && !getSignature().contains(ce.getProperty()
                    .asOWLDataProperty()) && isTopOrBuiltInDatatype(ce.getFiller()) || ce.getCardinality() > 0
                        && !getSignature().contains(ce.getProperty().asOWLDataProperty())
                        && isTopOrBuiltInInfiniteDatatype(ce.getFiller());
                __CLR4_5_2oaoalviclz3r.R.inc(1363);break;
            default:if (!__CLB4_5_2_bool21) {__CLR4_5_2oaoalviclz3r.R.inc(1364);__CLB4_5_2_bool21=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1365);break;
            }
        }finally{__CLR4_5_2oaoalviclz3r.R.flushNeeded();}}

        // BUGFIX: (TS) A data max card restriction is never bottom-equiv.
        // BUGFIX: (TS, 2) Added the cases where the filler is top-equiv
        // BUGFIX: (TS, 3) Repaired the cases where the filler is top-equiv
        @Override
        public void visit(OWLDataMaxCardinality ce) {try{__CLR4_5_2oaoalviclz3r.R.inc(1366);
            boolean __CLB4_5_2_bool22=false;__CLR4_5_2oaoalviclz3r.R.inc(1367);switch (getLocality()) {
            case BOTTOM_BOTTOM:if (!__CLB4_5_2_bool22) {__CLR4_5_2oaoalviclz3r.R.inc(1368);__CLB4_5_2_bool22=true;}
            case TOP_BOTTOM:if (!__CLB4_5_2_bool22) {__CLR4_5_2oaoalviclz3r.R.inc(1369);__CLB4_5_2_bool22=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1370);isBottomEquivalent = false;
                __CLR4_5_2oaoalviclz3r.R.inc(1371);break;
            case TOP_TOP:if (!__CLB4_5_2_bool22) {__CLR4_5_2oaoalviclz3r.R.inc(1372);__CLB4_5_2_bool22=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1373);isBottomEquivalent = ce.getCardinality() == 0 && !getSignature().contains(ce.getProperty()
                    .asOWLDataProperty()) && isTopOrBuiltInDatatype(ce.getFiller()) || ce.getCardinality() == 1
                        && !getSignature().contains(ce.getProperty().asOWLDataProperty()) && isTopOrBuiltInDatatype(ce
                            .getFiller()) || ce.getCardinality() > 1 && !getSignature().contains(ce.getProperty()
                                .asOWLDataProperty()) && isTopOrBuiltInInfiniteDatatype(ce.getFiller());
                __CLR4_5_2oaoalviclz3r.R.inc(1374);break;
            default:if (!__CLB4_5_2_bool22) {__CLR4_5_2oaoalviclz3r.R.inc(1375);__CLB4_5_2_bool22=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1376);break;
            }
        }finally{__CLR4_5_2oaoalviclz3r.R.flushNeeded();}}

        // BUGFIX: (TS) The *_BOTTOM case only works if n > 0.
        @Override
        public void visit(OWLDataMinCardinality ce) {try{__CLR4_5_2oaoalviclz3r.R.inc(1377);
            boolean __CLB4_5_2_bool23=false;__CLR4_5_2oaoalviclz3r.R.inc(1378);switch (getLocality()) {
            case BOTTOM_BOTTOM:if (!__CLB4_5_2_bool23) {__CLR4_5_2oaoalviclz3r.R.inc(1379);__CLB4_5_2_bool23=true;}
            case TOP_BOTTOM:if (!__CLB4_5_2_bool23) {__CLR4_5_2oaoalviclz3r.R.inc(1380);__CLB4_5_2_bool23=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1381);isBottomEquivalent = ce.getCardinality() > 0 && !getSignature().contains(ce.getProperty()
                    .asOWLDataProperty());
                __CLR4_5_2oaoalviclz3r.R.inc(1382);break;
            case TOP_TOP:if (!__CLB4_5_2_bool23) {__CLR4_5_2oaoalviclz3r.R.inc(1383);__CLB4_5_2_bool23=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1384);isBottomEquivalent = false;
                __CLR4_5_2oaoalviclz3r.R.inc(1385);break;
            default:if (!__CLB4_5_2_bool23) {__CLR4_5_2oaoalviclz3r.R.inc(1386);__CLB4_5_2_bool23=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1387);break;
            }
        }finally{__CLR4_5_2oaoalviclz3r.R.flushNeeded();}}

        @Override
        public void visit(OWLDataSomeValuesFrom ce) {try{__CLR4_5_2oaoalviclz3r.R.inc(1388);
            boolean __CLB4_5_2_bool24=false;__CLR4_5_2oaoalviclz3r.R.inc(1389);switch (getLocality()) {
            case BOTTOM_BOTTOM:if (!__CLB4_5_2_bool24) {__CLR4_5_2oaoalviclz3r.R.inc(1390);__CLB4_5_2_bool24=true;}
            case TOP_BOTTOM:if (!__CLB4_5_2_bool24) {__CLR4_5_2oaoalviclz3r.R.inc(1391);__CLB4_5_2_bool24=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1392);isBottomEquivalent = !getSignature().contains(ce.getProperty().asOWLDataProperty());
                __CLR4_5_2oaoalviclz3r.R.inc(1393);break;
            case TOP_TOP:if (!__CLB4_5_2_bool24) {__CLR4_5_2oaoalviclz3r.R.inc(1394);__CLB4_5_2_bool24=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1395);isBottomEquivalent = false;
                __CLR4_5_2oaoalviclz3r.R.inc(1396);break;
            default:if (!__CLB4_5_2_bool24) {__CLR4_5_2oaoalviclz3r.R.inc(1397);__CLB4_5_2_bool24=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1398);break;
            }
        }finally{__CLR4_5_2oaoalviclz3r.R.flushNeeded();}}

        @Override
        public void visit(OWLDataHasValue ce) {try{__CLR4_5_2oaoalviclz3r.R.inc(1399);
            boolean __CLB4_5_2_bool25=false;__CLR4_5_2oaoalviclz3r.R.inc(1400);switch (getLocality()) {
            case BOTTOM_BOTTOM:if (!__CLB4_5_2_bool25) {__CLR4_5_2oaoalviclz3r.R.inc(1401);__CLB4_5_2_bool25=true;}
            case TOP_BOTTOM:if (!__CLB4_5_2_bool25) {__CLR4_5_2oaoalviclz3r.R.inc(1402);__CLB4_5_2_bool25=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1403);isBottomEquivalent = !getSignature().contains(ce.getProperty().asOWLDataProperty());
                __CLR4_5_2oaoalviclz3r.R.inc(1404);break;
            case TOP_TOP:if (!__CLB4_5_2_bool25) {__CLR4_5_2oaoalviclz3r.R.inc(1405);__CLB4_5_2_bool25=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1406);isBottomEquivalent = false;
                __CLR4_5_2oaoalviclz3r.R.inc(1407);break;
            default:if (!__CLB4_5_2_bool25) {__CLR4_5_2oaoalviclz3r.R.inc(1408);__CLB4_5_2_bool25=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1409);break;
            }
        }finally{__CLR4_5_2oaoalviclz3r.R.flushNeeded();}}

        // BUGFIX (TS): TOP_TOP case was missing the first conjunct
        @Override
        public void visit(OWLObjectAllValuesFrom ce) {try{__CLR4_5_2oaoalviclz3r.R.inc(1410);
            boolean __CLB4_5_2_bool26=false;__CLR4_5_2oaoalviclz3r.R.inc(1411);switch (getLocality()) {
            case BOTTOM_BOTTOM:if (!__CLB4_5_2_bool26) {__CLR4_5_2oaoalviclz3r.R.inc(1412);__CLB4_5_2_bool26=true;}
            case TOP_BOTTOM:if (!__CLB4_5_2_bool26) {__CLR4_5_2oaoalviclz3r.R.inc(1413);__CLB4_5_2_bool26=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1414);isBottomEquivalent = false;
                __CLR4_5_2oaoalviclz3r.R.inc(1415);break;
            case TOP_TOP:if (!__CLB4_5_2_bool26) {__CLR4_5_2oaoalviclz3r.R.inc(1416);__CLB4_5_2_bool26=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1417);isBottomEquivalent = !getSignature().contains(ce.getProperty().getNamedProperty())
                    && isBottomEquivalent(ce.getFiller());
                __CLR4_5_2oaoalviclz3r.R.inc(1418);break;
            default:if (!__CLB4_5_2_bool26) {__CLR4_5_2oaoalviclz3r.R.inc(1419);__CLB4_5_2_bool26=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1420);break;
            }
        }finally{__CLR4_5_2oaoalviclz3r.R.flushNeeded();}}

        @Override
        public void visit(OWLObjectComplementOf ce) {try{__CLR4_5_2oaoalviclz3r.R.inc(1421);
            __CLR4_5_2oaoalviclz3r.R.inc(1422);isBottomEquivalent = topEvaluator.isTopEquivalent(ce.getOperand(), getSignature(), getLocality());
        }finally{__CLR4_5_2oaoalviclz3r.R.flushNeeded();}}

        // BUGFIX: (TS) Since an exact card restriction is a conjunction of a
        // min and a max card restriction,
        // there are cases where it is bottom-local
        @Override
        public void visit(OWLObjectExactCardinality ce) {try{__CLR4_5_2oaoalviclz3r.R.inc(1423);
            boolean __CLB4_5_2_bool27=false;__CLR4_5_2oaoalviclz3r.R.inc(1424);switch (getLocality()) {
            case BOTTOM_BOTTOM:if (!__CLB4_5_2_bool27) {__CLR4_5_2oaoalviclz3r.R.inc(1425);__CLB4_5_2_bool27=true;}
            case TOP_BOTTOM:if (!__CLB4_5_2_bool27) {__CLR4_5_2oaoalviclz3r.R.inc(1426);__CLB4_5_2_bool27=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1427);isBottomEquivalent = ce.getCardinality() > 0 && (!getSignature().contains(ce.getProperty()
                    .getNamedProperty()) || isBottomEquivalent(ce.getFiller()));
                __CLR4_5_2oaoalviclz3r.R.inc(1428);break;
            case TOP_TOP:if (!__CLB4_5_2_bool27) {__CLR4_5_2oaoalviclz3r.R.inc(1429);__CLB4_5_2_bool27=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1430);isBottomEquivalent = ce.getCardinality() > 0 && (isBottomEquivalent(ce.getFiller()) || !getSignature()
                    .contains(ce.getProperty().getNamedProperty()) && topEvaluator.isTopEquivalent(ce.getFiller(),
                        getSignature(), getLocality()));
                __CLR4_5_2oaoalviclz3r.R.inc(1431);break;
            default:if (!__CLB4_5_2_bool27) {__CLR4_5_2oaoalviclz3r.R.inc(1432);__CLB4_5_2_bool27=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1433);break;
            }
        }finally{__CLR4_5_2oaoalviclz3r.R.flushNeeded();}}

        @Override
        public void visit(OWLObjectIntersectionOf ce) {try{__CLR4_5_2oaoalviclz3r.R.inc(1434);
            __CLR4_5_2oaoalviclz3r.R.inc(1435);for (OWLClassExpression conj : ce.getOperands()) {{
                assert (((conj != null)&&(__CLR4_5_2oaoalviclz3r.R.iget(1436)!=0|true))||(__CLR4_5_2oaoalviclz3r.R.iget(1437)==0&false));
                __CLR4_5_2oaoalviclz3r.R.inc(1438);if ((((isBottomEquivalent(conj))&&(__CLR4_5_2oaoalviclz3r.R.iget(1439)!=0|true))||(__CLR4_5_2oaoalviclz3r.R.iget(1440)==0&false))) {{
                    __CLR4_5_2oaoalviclz3r.R.inc(1441);isBottomEquivalent = true;
                    __CLR4_5_2oaoalviclz3r.R.inc(1442);return;
                }
            }}
            }__CLR4_5_2oaoalviclz3r.R.inc(1443);isBottomEquivalent = false;
        }finally{__CLR4_5_2oaoalviclz3r.R.flushNeeded();}}

        // BUGFIX (TS): Corrected all conditions.
        // The n==0 case doesn't affect bottom-equivalence of this type of
        // restriction,
        // but n>0 does!
        @Override
        public void visit(OWLObjectMaxCardinality ce) {try{__CLR4_5_2oaoalviclz3r.R.inc(1444);
            boolean __CLB4_5_2_bool28=false;__CLR4_5_2oaoalviclz3r.R.inc(1445);switch (getLocality()) {
            case BOTTOM_BOTTOM:if (!__CLB4_5_2_bool28) {__CLR4_5_2oaoalviclz3r.R.inc(1446);__CLB4_5_2_bool28=true;}
            case TOP_BOTTOM:if (!__CLB4_5_2_bool28) {__CLR4_5_2oaoalviclz3r.R.inc(1447);__CLB4_5_2_bool28=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1448);isBottomEquivalent = false;
                __CLR4_5_2oaoalviclz3r.R.inc(1449);break;
            case TOP_TOP:if (!__CLB4_5_2_bool28) {__CLR4_5_2oaoalviclz3r.R.inc(1450);__CLB4_5_2_bool28=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1451);isBottomEquivalent = ce.getCardinality() > 0 && !getSignature().contains(ce.getProperty()
                    .getNamedProperty()) && topEvaluator.isTopEquivalent(ce.getFiller(), getSignature(), getLocality());
                __CLR4_5_2oaoalviclz3r.R.inc(1452);break;
            default:if (!__CLB4_5_2_bool28) {__CLR4_5_2oaoalviclz3r.R.inc(1453);__CLB4_5_2_bool28=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1454);break;
            }
        }finally{__CLR4_5_2oaoalviclz3r.R.flushNeeded();}}

        // BUGFIX (TS): Corrected all conditions, considering the case n==0
        @Override
        public void visit(OWLObjectMinCardinality ce) {try{__CLR4_5_2oaoalviclz3r.R.inc(1455);
            boolean __CLB4_5_2_bool29=false;__CLR4_5_2oaoalviclz3r.R.inc(1456);switch (getLocality()) {
            case BOTTOM_BOTTOM:if (!__CLB4_5_2_bool29) {__CLR4_5_2oaoalviclz3r.R.inc(1457);__CLB4_5_2_bool29=true;}
            case TOP_BOTTOM:if (!__CLB4_5_2_bool29) {__CLR4_5_2oaoalviclz3r.R.inc(1458);__CLB4_5_2_bool29=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1459);isBottomEquivalent = ce.getCardinality() > 0 && (!getSignature().contains(ce.getProperty()
                    .getNamedProperty()) || isBottomEquivalent(ce.getFiller()));
                __CLR4_5_2oaoalviclz3r.R.inc(1460);break;
            case TOP_TOP:if (!__CLB4_5_2_bool29) {__CLR4_5_2oaoalviclz3r.R.inc(1461);__CLB4_5_2_bool29=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1462);isBottomEquivalent = ce.getCardinality() > 0 && isBottomEquivalent(ce.getFiller());
                __CLR4_5_2oaoalviclz3r.R.inc(1463);break;
            default:if (!__CLB4_5_2_bool29) {__CLR4_5_2oaoalviclz3r.R.inc(1464);__CLB4_5_2_bool29=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1465);break;
            }
        }finally{__CLR4_5_2oaoalviclz3r.R.flushNeeded();}}

        @Override
        public void visit(OWLObjectOneOf ce) {try{__CLR4_5_2oaoalviclz3r.R.inc(1466);
            __CLR4_5_2oaoalviclz3r.R.inc(1467);isBottomEquivalent = ce.getIndividuals().isEmpty();
        }finally{__CLR4_5_2oaoalviclz3r.R.flushNeeded();}}

        @Override
        public void visit(OWLObjectHasSelf ce) {try{__CLR4_5_2oaoalviclz3r.R.inc(1468);
            boolean __CLB4_5_2_bool30=false;__CLR4_5_2oaoalviclz3r.R.inc(1469);switch (getLocality()) {
            case BOTTOM_BOTTOM:if (!__CLB4_5_2_bool30) {__CLR4_5_2oaoalviclz3r.R.inc(1470);__CLB4_5_2_bool30=true;}
            case TOP_BOTTOM:if (!__CLB4_5_2_bool30) {__CLR4_5_2oaoalviclz3r.R.inc(1471);__CLB4_5_2_bool30=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1472);isBottomEquivalent = !getSignature().contains(ce.getProperty().getNamedProperty());
                __CLR4_5_2oaoalviclz3r.R.inc(1473);break;
            case TOP_TOP:if (!__CLB4_5_2_bool30) {__CLR4_5_2oaoalviclz3r.R.inc(1474);__CLB4_5_2_bool30=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1475);isBottomEquivalent = false;
                __CLR4_5_2oaoalviclz3r.R.inc(1476);break;
            default:if (!__CLB4_5_2_bool30) {__CLR4_5_2oaoalviclz3r.R.inc(1477);__CLB4_5_2_bool30=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1478);break;
            }
        }finally{__CLR4_5_2oaoalviclz3r.R.flushNeeded();}}

        @Override
        public void visit(OWLObjectSomeValuesFrom ce) {try{__CLR4_5_2oaoalviclz3r.R.inc(1479);
            boolean __CLB4_5_2_bool31=false;__CLR4_5_2oaoalviclz3r.R.inc(1480);switch (getLocality()) {
            case BOTTOM_BOTTOM:if (!__CLB4_5_2_bool31) {__CLR4_5_2oaoalviclz3r.R.inc(1481);__CLB4_5_2_bool31=true;}
            case TOP_BOTTOM:if (!__CLB4_5_2_bool31) {__CLR4_5_2oaoalviclz3r.R.inc(1482);__CLB4_5_2_bool31=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1483);isBottomEquivalent = !getSignature().contains(ce.getProperty().getNamedProperty())
                    || isBottomEquivalent(ce.getFiller());
                __CLR4_5_2oaoalviclz3r.R.inc(1484);break;
            case TOP_TOP:if (!__CLB4_5_2_bool31) {__CLR4_5_2oaoalviclz3r.R.inc(1485);__CLB4_5_2_bool31=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1486);isBottomEquivalent = isBottomEquivalent(ce.getFiller());
                __CLR4_5_2oaoalviclz3r.R.inc(1487);break;
            default:if (!__CLB4_5_2_bool31) {__CLR4_5_2oaoalviclz3r.R.inc(1488);__CLB4_5_2_bool31=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1489);break;
            }
        }finally{__CLR4_5_2oaoalviclz3r.R.flushNeeded();}}

        @Override
        public void visit(OWLObjectUnionOf ce) {try{__CLR4_5_2oaoalviclz3r.R.inc(1490);
            __CLR4_5_2oaoalviclz3r.R.inc(1491);for (OWLClassExpression disj : ce.getOperands()) {{
                assert (((disj != null)&&(__CLR4_5_2oaoalviclz3r.R.iget(1492)!=0|true))||(__CLR4_5_2oaoalviclz3r.R.iget(1493)==0&false));
                __CLR4_5_2oaoalviclz3r.R.inc(1494);if ((((!isBottomEquivalent(disj))&&(__CLR4_5_2oaoalviclz3r.R.iget(1495)!=0|true))||(__CLR4_5_2oaoalviclz3r.R.iget(1496)==0&false))) {{
                    __CLR4_5_2oaoalviclz3r.R.inc(1497);isBottomEquivalent = false;
                    __CLR4_5_2oaoalviclz3r.R.inc(1498);return;
                }
            }}
            }__CLR4_5_2oaoalviclz3r.R.inc(1499);isBottomEquivalent = true;
        }finally{__CLR4_5_2oaoalviclz3r.R.flushNeeded();}}

        // BUGFIX (TS): desc.getValue() is an individual and therefore is *not*
        // bot-equiv if not in the signature
        // -> disjunct removed from *_BOTTOM case
        @Override
        public void visit(OWLObjectHasValue ce) {try{__CLR4_5_2oaoalviclz3r.R.inc(1500);
            boolean __CLB4_5_2_bool32=false;__CLR4_5_2oaoalviclz3r.R.inc(1501);switch (getLocality()) {
            case BOTTOM_BOTTOM:if (!__CLB4_5_2_bool32) {__CLR4_5_2oaoalviclz3r.R.inc(1502);__CLB4_5_2_bool32=true;}
            case TOP_BOTTOM:if (!__CLB4_5_2_bool32) {__CLR4_5_2oaoalviclz3r.R.inc(1503);__CLB4_5_2_bool32=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1504);isBottomEquivalent = !getSignature().contains(ce.getProperty().getNamedProperty());
                __CLR4_5_2oaoalviclz3r.R.inc(1505);break;
            case TOP_TOP:if (!__CLB4_5_2_bool32) {__CLR4_5_2oaoalviclz3r.R.inc(1506);__CLB4_5_2_bool32=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1507);isBottomEquivalent = false;
                __CLR4_5_2oaoalviclz3r.R.inc(1508);break;
            default:if (!__CLB4_5_2_bool32) {__CLR4_5_2oaoalviclz3r.R.inc(1509);__CLB4_5_2_bool32=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1510);break;
            }
        }finally{__CLR4_5_2oaoalviclz3r.R.flushNeeded();}}
    }

    /**
     * Used to determine if class expressions are equivalent to \top using the
     * provided locality class.
     */
    private static class TopEquivalenceEvaluator implements OWLClassExpressionVisitor {

        private BottomEquivalenceEvaluator bottomEvaluator;
        private boolean isTopEquivalent;
        private LocalityClass localityCls;
        private Collection<? extends OWLEntity> signature;

        /** Instantiates a new top equivalence evaluator. */
        TopEquivalenceEvaluator() {try{__CLR4_5_2oaoalviclz3r.R.inc(1511);}finally{__CLR4_5_2oaoalviclz3r.R.flushNeeded();}}

        private boolean isTopEquivalent(@Nonnull OWLClassExpression desc) {try{__CLR4_5_2oaoalviclz3r.R.inc(1512);
            __CLR4_5_2oaoalviclz3r.R.inc(1513);checkNotNull(desc, "desc cannot be null").accept(this);
            __CLR4_5_2oaoalviclz3r.R.inc(1514);return isTopEquivalent;
        }finally{__CLR4_5_2oaoalviclz3r.R.flushNeeded();}}

        @Nonnull
        protected Collection<? extends OWLEntity> getSignature() {try{__CLR4_5_2oaoalviclz3r.R.inc(1515);
            __CLR4_5_2oaoalviclz3r.R.inc(1516);return verifyNotNull(signature);
        }finally{__CLR4_5_2oaoalviclz3r.R.flushNeeded();}}

        @Nonnull
        protected LocalityClass getLocality() {try{__CLR4_5_2oaoalviclz3r.R.inc(1517);
            __CLR4_5_2oaoalviclz3r.R.inc(1518);return verifyNotNull(localityCls);
        }finally{__CLR4_5_2oaoalviclz3r.R.flushNeeded();}}

        /**
         * Checks if is top equivalent.
         * 
         * @param desc
         *        the desc
         * @param sig
         *        the sig
         * @param locality
         *        the locality
         * @return true, if is top equivalent
         */
        public boolean isTopEquivalent(@Nonnull OWLClassExpression desc, @Nonnull Collection<? extends OWLEntity> sig,
            @Nonnull LocalityClass locality) {try{__CLR4_5_2oaoalviclz3r.R.inc(1519);
            __CLR4_5_2oaoalviclz3r.R.inc(1520);localityCls = checkNotNull(locality, "locality cannot be null");
            __CLR4_5_2oaoalviclz3r.R.inc(1521);signature = checkNotNull(sig, "sig cannot be null");
            __CLR4_5_2oaoalviclz3r.R.inc(1522);checkNotNull(desc, "desc cannot be null").accept(this);
            __CLR4_5_2oaoalviclz3r.R.inc(1523);return isTopEquivalent;
        }finally{__CLR4_5_2oaoalviclz3r.R.flushNeeded();}}

        /**
         * Sets the bottom evaluator.
         * 
         * @param evaluator
         *        the new bottom evaluator
         */
        public void setBottomEvaluator(@Nonnull BottomEquivalenceEvaluator evaluator) {try{__CLR4_5_2oaoalviclz3r.R.inc(1524);
            __CLR4_5_2oaoalviclz3r.R.inc(1525);bottomEvaluator = checkNotNull(evaluator, "evaluator cannot be null");
        }finally{__CLR4_5_2oaoalviclz3r.R.flushNeeded();}}

        @Override
        public void visit(OWLClass ce) {try{__CLR4_5_2oaoalviclz3r.R.inc(1526);
            boolean __CLB4_5_2_bool33=false;__CLR4_5_2oaoalviclz3r.R.inc(1527);switch (getLocality()) {
            case BOTTOM_BOTTOM:if (!__CLB4_5_2_bool33) {__CLR4_5_2oaoalviclz3r.R.inc(1528);__CLB4_5_2_bool33=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1529);isTopEquivalent = ce.isOWLThing();
                __CLR4_5_2oaoalviclz3r.R.inc(1530);break;
            case TOP_BOTTOM:if (!__CLB4_5_2_bool33) {__CLR4_5_2oaoalviclz3r.R.inc(1531);__CLB4_5_2_bool33=true;}
            case TOP_TOP:if (!__CLB4_5_2_bool33) {__CLR4_5_2oaoalviclz3r.R.inc(1532);__CLB4_5_2_bool33=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1533);isTopEquivalent = ce.isOWLThing() || !ce.isOWLNothing() && !signature.contains(ce);
                __CLR4_5_2oaoalviclz3r.R.inc(1534);break;
            default:if (!__CLB4_5_2_bool33) {__CLR4_5_2oaoalviclz3r.R.inc(1535);__CLB4_5_2_bool33=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1536);break;
            }
        }finally{__CLR4_5_2oaoalviclz3r.R.flushNeeded();}}

        // BUGFIX: (TS, 2) Added the cases where the filler is top-equiv
        @Override
        public void visit(OWLDataAllValuesFrom ce) {try{__CLR4_5_2oaoalviclz3r.R.inc(1537);
            boolean __CLB4_5_2_bool34=false;__CLR4_5_2oaoalviclz3r.R.inc(1538);switch (getLocality()) {
            case BOTTOM_BOTTOM:if (!__CLB4_5_2_bool34) {__CLR4_5_2oaoalviclz3r.R.inc(1539);__CLB4_5_2_bool34=true;}
            case TOP_BOTTOM:if (!__CLB4_5_2_bool34) {__CLR4_5_2oaoalviclz3r.R.inc(1540);__CLB4_5_2_bool34=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1541);isTopEquivalent = !signature.contains(ce.getProperty().asOWLDataProperty()) || ce.getFiller()
                    .isTopDatatype();
                __CLR4_5_2oaoalviclz3r.R.inc(1542);break;
            case TOP_TOP:if (!__CLB4_5_2_bool34) {__CLR4_5_2oaoalviclz3r.R.inc(1543);__CLB4_5_2_bool34=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1544);isTopEquivalent = ce.getFiller().isTopDatatype();
                __CLR4_5_2oaoalviclz3r.R.inc(1545);break;
            default:if (!__CLB4_5_2_bool34) {__CLR4_5_2oaoalviclz3r.R.inc(1546);__CLB4_5_2_bool34=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1547);break;
            }
        }finally{__CLR4_5_2oaoalviclz3r.R.flushNeeded();}}

        // BUGFIX: (TS) Added the case where this is top-equiv (including n==0).
        @Override
        public void visit(OWLDataExactCardinality ce) {try{__CLR4_5_2oaoalviclz3r.R.inc(1548);
            boolean __CLB4_5_2_bool35=false;__CLR4_5_2oaoalviclz3r.R.inc(1549);switch (getLocality()) {
            case BOTTOM_BOTTOM:if (!__CLB4_5_2_bool35) {__CLR4_5_2oaoalviclz3r.R.inc(1550);__CLB4_5_2_bool35=true;}
            case TOP_BOTTOM:if (!__CLB4_5_2_bool35) {__CLR4_5_2oaoalviclz3r.R.inc(1551);__CLB4_5_2_bool35=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1552);isTopEquivalent = ce.getCardinality() == 0 && !signature.contains(ce.getProperty().asOWLDataProperty());
                __CLR4_5_2oaoalviclz3r.R.inc(1553);break;
            case TOP_TOP:if (!__CLB4_5_2_bool35) {__CLR4_5_2oaoalviclz3r.R.inc(1554);__CLB4_5_2_bool35=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1555);isTopEquivalent = false;
                __CLR4_5_2oaoalviclz3r.R.inc(1556);break;
            default:if (!__CLB4_5_2_bool35) {__CLR4_5_2oaoalviclz3r.R.inc(1557);__CLB4_5_2_bool35=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1558);break;
            }
        }finally{__CLR4_5_2oaoalviclz3r.R.flushNeeded();}}

        // (TS) No special handling for n==0 required.
        @Override
        public void visit(OWLDataMaxCardinality ce) {try{__CLR4_5_2oaoalviclz3r.R.inc(1559);
            boolean __CLB4_5_2_bool36=false;__CLR4_5_2oaoalviclz3r.R.inc(1560);switch (getLocality()) {
            case BOTTOM_BOTTOM:if (!__CLB4_5_2_bool36) {__CLR4_5_2oaoalviclz3r.R.inc(1561);__CLB4_5_2_bool36=true;}
            case TOP_BOTTOM:if (!__CLB4_5_2_bool36) {__CLR4_5_2oaoalviclz3r.R.inc(1562);__CLB4_5_2_bool36=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1563);isTopEquivalent = !signature.contains(ce.getProperty().asOWLDataProperty());
                __CLR4_5_2oaoalviclz3r.R.inc(1564);break;
            case TOP_TOP:if (!__CLB4_5_2_bool36) {__CLR4_5_2oaoalviclz3r.R.inc(1565);__CLB4_5_2_bool36=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1566);isTopEquivalent = false;
                __CLR4_5_2oaoalviclz3r.R.inc(1567);break;
            default:if (!__CLB4_5_2_bool36) {__CLR4_5_2oaoalviclz3r.R.inc(1568);__CLB4_5_2_bool36=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1569);break;
            }
        }finally{__CLR4_5_2oaoalviclz3r.R.flushNeeded();}}

        // BUGFIX: (TS) A data min card restriction is top-equiv iff the
        // cardinality is 0.
        // BUGFIX: (TS, 2) Added the cases where the filler is top-equiv
        // BUGFIX: (TS, 2) Left out redundant check cardinality > 0 in TOP_TOP
        // case
        // BUGFIX: (TS, 3) Extended the cases where the filler is top-equiv in
        // TOP_TOP
        @Override
        public void visit(OWLDataMinCardinality ce) {try{__CLR4_5_2oaoalviclz3r.R.inc(1570);
            boolean __CLB4_5_2_bool37=false;__CLR4_5_2oaoalviclz3r.R.inc(1571);switch (getLocality()) {
            case BOTTOM_BOTTOM:if (!__CLB4_5_2_bool37) {__CLR4_5_2oaoalviclz3r.R.inc(1572);__CLB4_5_2_bool37=true;}
            case TOP_BOTTOM:if (!__CLB4_5_2_bool37) {__CLR4_5_2oaoalviclz3r.R.inc(1573);__CLB4_5_2_bool37=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1574);isTopEquivalent = ce.getCardinality() == 0;
                __CLR4_5_2oaoalviclz3r.R.inc(1575);break;
            case TOP_TOP:if (!__CLB4_5_2_bool37) {__CLR4_5_2oaoalviclz3r.R.inc(1576);__CLB4_5_2_bool37=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1577);isTopEquivalent = ce.getCardinality() == 0 || ce.getCardinality() == 1 && !signature.contains(ce
                    .getProperty().asOWLDataProperty()) && isTopOrBuiltInDatatype(ce.getFiller()) || ce
                        .getCardinality() > 1 && !signature.contains(ce.getProperty().asOWLDataProperty())
                        && isTopOrBuiltInInfiniteDatatype(ce.getFiller());
                __CLR4_5_2oaoalviclz3r.R.inc(1578);break;
            default:if (!__CLB4_5_2_bool37) {__CLR4_5_2oaoalviclz3r.R.inc(1579);__CLB4_5_2_bool37=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1580);break;
            }
        }finally{__CLR4_5_2oaoalviclz3r.R.flushNeeded();}}

        // BUGFIX: (TS, 2) Added the cases where the filler is top-equiv
        // BUGFIX: (TS, 3) Extended the cases where the filler is top-equiv
        @Override
        public void visit(OWLDataSomeValuesFrom ce) {try{__CLR4_5_2oaoalviclz3r.R.inc(1581);
            boolean __CLB4_5_2_bool38=false;__CLR4_5_2oaoalviclz3r.R.inc(1582);switch (getLocality()) {
            case BOTTOM_BOTTOM:if (!__CLB4_5_2_bool38) {__CLR4_5_2oaoalviclz3r.R.inc(1583);__CLB4_5_2_bool38=true;}
            case TOP_BOTTOM:if (!__CLB4_5_2_bool38) {__CLR4_5_2oaoalviclz3r.R.inc(1584);__CLB4_5_2_bool38=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1585);isTopEquivalent = false;
                __CLR4_5_2oaoalviclz3r.R.inc(1586);break;
            case TOP_TOP:if (!__CLB4_5_2_bool38) {__CLR4_5_2oaoalviclz3r.R.inc(1587);__CLB4_5_2_bool38=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1588);isTopEquivalent = !signature.contains(ce.getProperty().asOWLDataProperty()) && isTopOrBuiltInDatatype(ce
                    .getFiller());
                __CLR4_5_2oaoalviclz3r.R.inc(1589);break;
            default:if (!__CLB4_5_2_bool38) {__CLR4_5_2oaoalviclz3r.R.inc(1590);__CLB4_5_2_bool38=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1591);break;
            }
        }finally{__CLR4_5_2oaoalviclz3r.R.flushNeeded();}}

        // BUGFIX: (TS, 2) Added the cases where this is top-equiv
        @Override
        public void visit(OWLDataHasValue ce) {try{__CLR4_5_2oaoalviclz3r.R.inc(1592);
            boolean __CLB4_5_2_bool39=false;__CLR4_5_2oaoalviclz3r.R.inc(1593);switch (getLocality()) {
            case BOTTOM_BOTTOM:if (!__CLB4_5_2_bool39) {__CLR4_5_2oaoalviclz3r.R.inc(1594);__CLB4_5_2_bool39=true;}
            case TOP_BOTTOM:if (!__CLB4_5_2_bool39) {__CLR4_5_2oaoalviclz3r.R.inc(1595);__CLB4_5_2_bool39=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1596);isTopEquivalent = false;
                __CLR4_5_2oaoalviclz3r.R.inc(1597);break;
            case TOP_TOP:if (!__CLB4_5_2_bool39) {__CLR4_5_2oaoalviclz3r.R.inc(1598);__CLB4_5_2_bool39=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1599);isTopEquivalent = !signature.contains(ce.getProperty().asOWLDataProperty());
                __CLR4_5_2oaoalviclz3r.R.inc(1600);break;
            default:if (!__CLB4_5_2_bool39) {__CLR4_5_2oaoalviclz3r.R.inc(1601);__CLB4_5_2_bool39=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1602);break;
            }
        }finally{__CLR4_5_2oaoalviclz3r.R.flushNeeded();}}

        @Override
        public void visit(OWLObjectAllValuesFrom ce) {try{__CLR4_5_2oaoalviclz3r.R.inc(1603);
            boolean __CLB4_5_2_bool40=false;__CLR4_5_2oaoalviclz3r.R.inc(1604);switch (getLocality()) {
            case BOTTOM_BOTTOM:if (!__CLB4_5_2_bool40) {__CLR4_5_2oaoalviclz3r.R.inc(1605);__CLB4_5_2_bool40=true;}
            case TOP_BOTTOM:if (!__CLB4_5_2_bool40) {__CLR4_5_2oaoalviclz3r.R.inc(1606);__CLB4_5_2_bool40=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1607);isTopEquivalent = !signature.contains(ce.getProperty().getNamedProperty()) || isTopEquivalent(ce
                    .getFiller());
                __CLR4_5_2oaoalviclz3r.R.inc(1608);break;
            case TOP_TOP:if (!__CLB4_5_2_bool40) {__CLR4_5_2oaoalviclz3r.R.inc(1609);__CLB4_5_2_bool40=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1610);isTopEquivalent = isTopEquivalent(ce.getFiller());
                __CLR4_5_2oaoalviclz3r.R.inc(1611);break;
            default:if (!__CLB4_5_2_bool40) {__CLR4_5_2oaoalviclz3r.R.inc(1612);__CLB4_5_2_bool40=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1613);break;
            }
        }finally{__CLR4_5_2oaoalviclz3r.R.flushNeeded();}}

        @Override
        public void visit(OWLObjectComplementOf ce) {try{__CLR4_5_2oaoalviclz3r.R.inc(1614);
            __CLR4_5_2oaoalviclz3r.R.inc(1615);isTopEquivalent = bottomEvaluator.isBottomEquivalent(ce.getOperand(), getSignature(), getLocality());
        }finally{__CLR4_5_2oaoalviclz3r.R.flushNeeded();}}

        // BUGFIX: (TS) added the cases where this is top-equiv, including n==0
        @Override
        public void visit(OWLObjectExactCardinality ce) {try{__CLR4_5_2oaoalviclz3r.R.inc(1616);
            boolean __CLB4_5_2_bool41=false;__CLR4_5_2oaoalviclz3r.R.inc(1617);switch (getLocality()) {
            case BOTTOM_BOTTOM:if (!__CLB4_5_2_bool41) {__CLR4_5_2oaoalviclz3r.R.inc(1618);__CLB4_5_2_bool41=true;}
            case TOP_BOTTOM:if (!__CLB4_5_2_bool41) {__CLR4_5_2oaoalviclz3r.R.inc(1619);__CLB4_5_2_bool41=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1620);isTopEquivalent = ce.getCardinality() == 0 && (!signature.contains(ce.getProperty().getNamedProperty())
                    || bottomEvaluator.isBottomEquivalent(ce.getFiller(), getSignature(), getLocality()));
                __CLR4_5_2oaoalviclz3r.R.inc(1621);break;
            case TOP_TOP:if (!__CLB4_5_2_bool41) {__CLR4_5_2oaoalviclz3r.R.inc(1622);__CLB4_5_2_bool41=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1623);isTopEquivalent = ce.getCardinality() == 0 && bottomEvaluator.isBottomEquivalent(ce.getFiller(),
                    getSignature(), getLocality());
                __CLR4_5_2oaoalviclz3r.R.inc(1624);break;
            default:if (!__CLB4_5_2_bool41) {__CLR4_5_2oaoalviclz3r.R.inc(1625);__CLB4_5_2_bool41=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1626);break;
            }
        }finally{__CLR4_5_2oaoalviclz3r.R.flushNeeded();}}

        @Override
        public void visit(OWLObjectIntersectionOf ce) {try{__CLR4_5_2oaoalviclz3r.R.inc(1627);
            __CLR4_5_2oaoalviclz3r.R.inc(1628);for (OWLClassExpression conj : ce.getOperands()) {{
                assert (((conj != null)&&(__CLR4_5_2oaoalviclz3r.R.iget(1629)!=0|true))||(__CLR4_5_2oaoalviclz3r.R.iget(1630)==0&false));
                __CLR4_5_2oaoalviclz3r.R.inc(1631);if ((((!isTopEquivalent(conj))&&(__CLR4_5_2oaoalviclz3r.R.iget(1632)!=0|true))||(__CLR4_5_2oaoalviclz3r.R.iget(1633)==0&false))) {{
                    __CLR4_5_2oaoalviclz3r.R.inc(1634);isTopEquivalent = false;
                    __CLR4_5_2oaoalviclz3r.R.inc(1635);return;
                }
            }}
            }__CLR4_5_2oaoalviclz3r.R.inc(1636);isTopEquivalent = true;
        }finally{__CLR4_5_2oaoalviclz3r.R.flushNeeded();}}

        // BUGFIX: (TS) Added the case of a bottom-equivalent filler to both
        // conditions.
        // The n==0 case doesn't affect top-equivalence of this type of
        // restriction.
        @Override
        public void visit(OWLObjectMaxCardinality ce) {try{__CLR4_5_2oaoalviclz3r.R.inc(1637);
            boolean __CLB4_5_2_bool42=false;__CLR4_5_2oaoalviclz3r.R.inc(1638);switch (getLocality()) {
            case BOTTOM_BOTTOM:if (!__CLB4_5_2_bool42) {__CLR4_5_2oaoalviclz3r.R.inc(1639);__CLB4_5_2_bool42=true;}
            case TOP_BOTTOM:if (!__CLB4_5_2_bool42) {__CLR4_5_2oaoalviclz3r.R.inc(1640);__CLB4_5_2_bool42=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1641);isTopEquivalent = !signature.contains(ce.getProperty().getNamedProperty()) || bottomEvaluator
                    .isBottomEquivalent(ce.getFiller(), getSignature(), getLocality());
                __CLR4_5_2oaoalviclz3r.R.inc(1642);break;
            case TOP_TOP:if (!__CLB4_5_2_bool42) {__CLR4_5_2oaoalviclz3r.R.inc(1643);__CLB4_5_2_bool42=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1644);isTopEquivalent = bottomEvaluator.isBottomEquivalent(ce.getFiller(), getSignature(), getLocality());
                __CLR4_5_2oaoalviclz3r.R.inc(1645);break;
            default:if (!__CLB4_5_2_bool42) {__CLR4_5_2oaoalviclz3r.R.inc(1646);__CLB4_5_2_bool42=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1647);break;
            }
        }finally{__CLR4_5_2oaoalviclz3r.R.flushNeeded();}}

        // BUGFIX: (TS) Added the case n==0; repaired TOP_TOP condition
        // BUGFIX: (TS, 2) Left out redundant check cardinality > 0 in TOP_TOP
        // case
        @Override
        public void visit(OWLObjectMinCardinality ce) {try{__CLR4_5_2oaoalviclz3r.R.inc(1648);
            boolean __CLB4_5_2_bool43=false;__CLR4_5_2oaoalviclz3r.R.inc(1649);switch (getLocality()) {
            case BOTTOM_BOTTOM:if (!__CLB4_5_2_bool43) {__CLR4_5_2oaoalviclz3r.R.inc(1650);__CLB4_5_2_bool43=true;}
            case TOP_BOTTOM:if (!__CLB4_5_2_bool43) {__CLR4_5_2oaoalviclz3r.R.inc(1651);__CLB4_5_2_bool43=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1652);isTopEquivalent = ce.getCardinality() == 0;
                __CLR4_5_2oaoalviclz3r.R.inc(1653);break;
            case TOP_TOP:if (!__CLB4_5_2_bool43) {__CLR4_5_2oaoalviclz3r.R.inc(1654);__CLB4_5_2_bool43=true;}
                // isTopEquivalent =
                // !signature.contains(desc.getProperty().getNamedProperty())
                // && (desc.getCardinality() <= 1);
                __CLR4_5_2oaoalviclz3r.R.inc(1655);isTopEquivalent = ce.getCardinality() == 0 || !signature.contains(ce.getProperty().getNamedProperty())
                    && isTopEquivalent(ce.getFiller());
                __CLR4_5_2oaoalviclz3r.R.inc(1656);break;
            default:if (!__CLB4_5_2_bool43) {__CLR4_5_2oaoalviclz3r.R.inc(1657);__CLB4_5_2_bool43=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1658);break;
            }
        }finally{__CLR4_5_2oaoalviclz3r.R.flushNeeded();}}

        @Override
        public void visit(OWLObjectOneOf ce) {try{__CLR4_5_2oaoalviclz3r.R.inc(1659);
            __CLR4_5_2oaoalviclz3r.R.inc(1660);isTopEquivalent = false;
        }finally{__CLR4_5_2oaoalviclz3r.R.flushNeeded();}}

        @Override
        public void visit(OWLObjectHasSelf ce) {try{__CLR4_5_2oaoalviclz3r.R.inc(1661);
            boolean __CLB4_5_2_bool44=false;__CLR4_5_2oaoalviclz3r.R.inc(1662);switch (getLocality()) {
            case BOTTOM_BOTTOM:if (!__CLB4_5_2_bool44) {__CLR4_5_2oaoalviclz3r.R.inc(1663);__CLB4_5_2_bool44=true;}
            case TOP_BOTTOM:if (!__CLB4_5_2_bool44) {__CLR4_5_2oaoalviclz3r.R.inc(1664);__CLB4_5_2_bool44=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1665);isTopEquivalent = false;
                __CLR4_5_2oaoalviclz3r.R.inc(1666);break;
            case TOP_TOP:if (!__CLB4_5_2_bool44) {__CLR4_5_2oaoalviclz3r.R.inc(1667);__CLB4_5_2_bool44=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1668);isTopEquivalent = !signature.contains(ce.getProperty().getNamedProperty());
                __CLR4_5_2oaoalviclz3r.R.inc(1669);break;
            default:if (!__CLB4_5_2_bool44) {__CLR4_5_2oaoalviclz3r.R.inc(1670);__CLB4_5_2_bool44=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1671);break;
            }
        }finally{__CLR4_5_2oaoalviclz3r.R.flushNeeded();}}

        // BUGFIX (TS): added ".getNamedProperty()"
        @Override
        public void visit(OWLObjectSomeValuesFrom ce) {try{__CLR4_5_2oaoalviclz3r.R.inc(1672);
            boolean __CLB4_5_2_bool45=false;__CLR4_5_2oaoalviclz3r.R.inc(1673);switch (getLocality()) {
            case BOTTOM_BOTTOM:if (!__CLB4_5_2_bool45) {__CLR4_5_2oaoalviclz3r.R.inc(1674);__CLB4_5_2_bool45=true;}
            case TOP_BOTTOM:if (!__CLB4_5_2_bool45) {__CLR4_5_2oaoalviclz3r.R.inc(1675);__CLB4_5_2_bool45=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1676);isTopEquivalent = false;
                __CLR4_5_2oaoalviclz3r.R.inc(1677);break;
            case TOP_TOP:if (!__CLB4_5_2_bool45) {__CLR4_5_2oaoalviclz3r.R.inc(1678);__CLB4_5_2_bool45=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1679);isTopEquivalent = !signature.contains(ce.getProperty().getNamedProperty()) && isTopEquivalent(ce
                    .getFiller());
                __CLR4_5_2oaoalviclz3r.R.inc(1680);break;
            default:if (!__CLB4_5_2_bool45) {__CLR4_5_2oaoalviclz3r.R.inc(1681);__CLB4_5_2_bool45=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1682);break;
            }
        }finally{__CLR4_5_2oaoalviclz3r.R.flushNeeded();}}

        @Override
        public void visit(OWLObjectUnionOf ce) {try{__CLR4_5_2oaoalviclz3r.R.inc(1683);
            __CLR4_5_2oaoalviclz3r.R.inc(1684);for (OWLClassExpression conj : ce.getOperands()) {{
                assert (((conj != null)&&(__CLR4_5_2oaoalviclz3r.R.iget(1685)!=0|true))||(__CLR4_5_2oaoalviclz3r.R.iget(1686)==0&false));
                __CLR4_5_2oaoalviclz3r.R.inc(1687);if ((((isTopEquivalent(conj))&&(__CLR4_5_2oaoalviclz3r.R.iget(1688)!=0|true))||(__CLR4_5_2oaoalviclz3r.R.iget(1689)==0&false))) {{
                    __CLR4_5_2oaoalviclz3r.R.inc(1690);isTopEquivalent = true;
                    __CLR4_5_2oaoalviclz3r.R.inc(1691);return;
                }
            }}
            }__CLR4_5_2oaoalviclz3r.R.inc(1692);isTopEquivalent = false;
        }finally{__CLR4_5_2oaoalviclz3r.R.flushNeeded();}}

        @Override
        public void visit(OWLObjectHasValue ce) {try{__CLR4_5_2oaoalviclz3r.R.inc(1693);
            boolean __CLB4_5_2_bool46=false;__CLR4_5_2oaoalviclz3r.R.inc(1694);switch (getLocality()) {
            case BOTTOM_BOTTOM:if (!__CLB4_5_2_bool46) {__CLR4_5_2oaoalviclz3r.R.inc(1695);__CLB4_5_2_bool46=true;}
            case TOP_BOTTOM:if (!__CLB4_5_2_bool46) {__CLR4_5_2oaoalviclz3r.R.inc(1696);__CLB4_5_2_bool46=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1697);isTopEquivalent = false;
                __CLR4_5_2oaoalviclz3r.R.inc(1698);break;
            case TOP_TOP:if (!__CLB4_5_2_bool46) {__CLR4_5_2oaoalviclz3r.R.inc(1699);__CLB4_5_2_bool46=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1700);isTopEquivalent = !signature.contains(ce.getProperty().getNamedProperty());
                __CLR4_5_2oaoalviclz3r.R.inc(1701);break;
            default:if (!__CLB4_5_2_bool46) {__CLR4_5_2oaoalviclz3r.R.inc(1702);__CLB4_5_2_bool46=true;}
                __CLR4_5_2oaoalviclz3r.R.inc(1703);break;
            }
        }finally{__CLR4_5_2oaoalviclz3r.R.flushNeeded();}}
    }

    @Override
    public boolean isLocal(OWLAxiom axiom, Set<? extends OWLEntity> signature) {try{__CLR4_5_2oaoalviclz3r.R.inc(1704);
        __CLR4_5_2oaoalviclz3r.R.inc(1705);return axiomVisitor.isLocal(axiom, signature);
    }finally{__CLR4_5_2oaoalviclz3r.R.flushNeeded();}}
}
