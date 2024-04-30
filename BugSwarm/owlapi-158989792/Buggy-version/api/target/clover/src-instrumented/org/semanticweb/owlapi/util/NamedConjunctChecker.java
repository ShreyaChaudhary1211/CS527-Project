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

import java.util.HashSet;
import java.util.Set;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLClassExpression;
import org.semanticweb.owlapi.model.OWLObjectIntersectionOf;

/**
 * A utility class which checks if a class expression has a named conjunct or a
 * specific named conjunct.
 * 
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.0.0
 */
public class NamedConjunctChecker {public static class __CLR4_5_26y26y2lvickqfy{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0061\u0070\u0069\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237201267L,8589935092L,9050,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Nullable
    OWLClass conjunct;
    boolean found;
    boolean collect;
    @Nonnull
    final Set<OWLClass> conjuncts = new HashSet<>();
    @Nonnull
    private final NamedConjunctCheckerVisitor visitor = new NamedConjunctCheckerVisitor();

    /**
     * @return true ifa named class is a conjunct in a given class expression.
     *         For class expressions which aren't named classes or object
     *         intersections this method will always return false.
     * @param conj
     *        The conjunct to check for
     * @param classExpression
     *        The expression to be checked
     */
    public boolean isNamedConjunct(@Nonnull OWLClass conj,
            @Nonnull OWLClassExpression classExpression) {try{__CLR4_5_26y26y2lvickqfy.R.inc(9002);
        __CLR4_5_26y26y2lvickqfy.R.inc(9003);checkNotNull(conj, "conj cannot be null");
        __CLR4_5_26y26y2lvickqfy.R.inc(9004);checkNotNull(classExpression, "classExpression cannot be null");
        __CLR4_5_26y26y2lvickqfy.R.inc(9005);reset();
        __CLR4_5_26y26y2lvickqfy.R.inc(9006);conjunct = conj;
        __CLR4_5_26y26y2lvickqfy.R.inc(9007);classExpression.accept(visitor);
        __CLR4_5_26y26y2lvickqfy.R.inc(9008);return found;
    }finally{__CLR4_5_26y26y2lvickqfy.R.flushNeeded();}}

    /**
     * Checks whether the specified expression has a named conjunct. For For
     * class expressions which aren't named classes or object intersections this
     * method will always return false.
     * 
     * @param classExpression
     *        The expression to be checked.
     * @return {@code true} if the expression is in fact a named class (
     *         {@code OWLClass}) or if the expression is an intersection that
     *         has a named operand (included nested intersections), otherwise
     *         {@code false}
     */
    public boolean
            hasNamedConjunct(@Nonnull OWLClassExpression classExpression) {try{__CLR4_5_26y26y2lvickqfy.R.inc(9009);
        __CLR4_5_26y26y2lvickqfy.R.inc(9010);checkNotNull(classExpression, "classExpression cannot be null");
        __CLR4_5_26y26y2lvickqfy.R.inc(9011);reset();
        __CLR4_5_26y26y2lvickqfy.R.inc(9012);conjunct = null;
        __CLR4_5_26y26y2lvickqfy.R.inc(9013);classExpression.accept(visitor);
        __CLR4_5_26y26y2lvickqfy.R.inc(9014);return found;
    }finally{__CLR4_5_26y26y2lvickqfy.R.flushNeeded();}}

    private void reset() {try{__CLR4_5_26y26y2lvickqfy.R.inc(9015);
        __CLR4_5_26y26y2lvickqfy.R.inc(9016);found = false;
        __CLR4_5_26y26y2lvickqfy.R.inc(9017);collect = false;
    }finally{__CLR4_5_26y26y2lvickqfy.R.flushNeeded();}}

    /**
     * Gets the named conjuncts for the specified expression.
     * 
     * @param classExpression
     *        The expression whose conjuncts are to be retrieved.
     * @return A set containing the named conjuncts of the specified expression.
     *         If the expression is not a named class or an intersection then
     *         the set will definitely be empty.
     */
    @Nonnull
    public Set<OWLClass> getNamedConjuncts(
            @Nonnull OWLClassExpression classExpression) {try{__CLR4_5_26y26y2lvickqfy.R.inc(9018);
        __CLR4_5_26y26y2lvickqfy.R.inc(9019);checkNotNull(classExpression, "classExpression cannot be null");
        __CLR4_5_26y26y2lvickqfy.R.inc(9020);conjuncts.clear();
        __CLR4_5_26y26y2lvickqfy.R.inc(9021);reset();
        __CLR4_5_26y26y2lvickqfy.R.inc(9022);collect = true;
        __CLR4_5_26y26y2lvickqfy.R.inc(9023);classExpression.accept(visitor);
        __CLR4_5_26y26y2lvickqfy.R.inc(9024);return conjuncts;
    }finally{__CLR4_5_26y26y2lvickqfy.R.flushNeeded();}}

    private class NamedConjunctCheckerVisitor extends
            OWLClassExpressionVisitorAdapter {

        NamedConjunctCheckerVisitor() {try{__CLR4_5_26y26y2lvickqfy.R.inc(9025);}finally{__CLR4_5_26y26y2lvickqfy.R.flushNeeded();}}

        @Override
        public void visit(OWLClass ce) {try{__CLR4_5_26y26y2lvickqfy.R.inc(9026);
            __CLR4_5_26y26y2lvickqfy.R.inc(9027);if ((((conjunct == null)&&(__CLR4_5_26y26y2lvickqfy.R.iget(9028)!=0|true))||(__CLR4_5_26y26y2lvickqfy.R.iget(9029)==0&false))) {{
                __CLR4_5_26y26y2lvickqfy.R.inc(9030);found = true;
                __CLR4_5_26y26y2lvickqfy.R.inc(9031);if ((((collect)&&(__CLR4_5_26y26y2lvickqfy.R.iget(9032)!=0|true))||(__CLR4_5_26y26y2lvickqfy.R.iget(9033)==0&false))) {{
                    __CLR4_5_26y26y2lvickqfy.R.inc(9034);conjuncts.add(ce);
                }
            }} }else {__CLR4_5_26y26y2lvickqfy.R.inc(9035);if ((((ce.equals(conjunct))&&(__CLR4_5_26y26y2lvickqfy.R.iget(9036)!=0|true))||(__CLR4_5_26y26y2lvickqfy.R.iget(9037)==0&false))) {{
                __CLR4_5_26y26y2lvickqfy.R.inc(9038);found = true;
                __CLR4_5_26y26y2lvickqfy.R.inc(9039);if ((((collect)&&(__CLR4_5_26y26y2lvickqfy.R.iget(9040)!=0|true))||(__CLR4_5_26y26y2lvickqfy.R.iget(9041)==0&false))) {{
                    __CLR4_5_26y26y2lvickqfy.R.inc(9042);conjuncts.add(ce);
                }
            }}
        }}}finally{__CLR4_5_26y26y2lvickqfy.R.flushNeeded();}}

        @Override
        public void visit(OWLObjectIntersectionOf ce) {try{__CLR4_5_26y26y2lvickqfy.R.inc(9043);
            __CLR4_5_26y26y2lvickqfy.R.inc(9044);for (OWLClassExpression op : ce.getOperands()) {{
                __CLR4_5_26y26y2lvickqfy.R.inc(9045);op.accept(this);
                // Early termination if we have found a named conjunct
                // and we don't need to collect
                __CLR4_5_26y26y2lvickqfy.R.inc(9046);if ((((found && !collect)&&(__CLR4_5_26y26y2lvickqfy.R.iget(9047)!=0|true))||(__CLR4_5_26y26y2lvickqfy.R.iget(9048)==0&false))) {{
                    __CLR4_5_26y26y2lvickqfy.R.inc(9049);break;
                }
            }}
        }}finally{__CLR4_5_26y26y2lvickqfy.R.flushNeeded();}}
    }
}
