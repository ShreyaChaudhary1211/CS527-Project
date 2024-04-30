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

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.model.OWLAnnotationAssertionAxiom;
import org.semanticweb.owlapi.model.OWLAnnotationSubject;
import org.semanticweb.owlapi.model.OWLAsymmetricObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLClassAssertionAxiom;
import org.semanticweb.owlapi.model.OWLClassExpression;
import org.semanticweb.owlapi.model.OWLDataPropertyAssertionAxiom;
import org.semanticweb.owlapi.model.OWLDataPropertyDomainAxiom;
import org.semanticweb.owlapi.model.OWLDataPropertyExpression;
import org.semanticweb.owlapi.model.OWLDataPropertyRangeAxiom;
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
import org.semanticweb.owlapi.model.OWLIndividual;
import org.semanticweb.owlapi.model.OWLInverseFunctionalObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLInverseObjectPropertiesAxiom;
import org.semanticweb.owlapi.model.OWLIrreflexiveObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLNegativeDataPropertyAssertionAxiom;
import org.semanticweb.owlapi.model.OWLNegativeObjectPropertyAssertionAxiom;
import org.semanticweb.owlapi.model.OWLObject;
import org.semanticweb.owlapi.model.OWLObjectPropertyAssertionAxiom;
import org.semanticweb.owlapi.model.OWLObjectPropertyDomainAxiom;
import org.semanticweb.owlapi.model.OWLObjectPropertyExpression;
import org.semanticweb.owlapi.model.OWLObjectPropertyRangeAxiom;
import org.semanticweb.owlapi.model.OWLReflexiveObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLSameIndividualAxiom;
import org.semanticweb.owlapi.model.OWLSubClassOfAxiom;
import org.semanticweb.owlapi.model.OWLSubDataPropertyOfAxiom;
import org.semanticweb.owlapi.model.OWLSubObjectPropertyOfAxiom;
import org.semanticweb.owlapi.model.OWLSymmetricObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLTransitiveObjectPropertyAxiom;
import org.semanticweb.owlapi.util.CollectionFactory;
import org.semanticweb.owlapi.util.OWLAxiomVisitorExAdapter;

/** @author ignazio */
public class InitVisitorFactory {public static class __CLR4_5_2174174lviclf4y{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u006d\u0070\u006c\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237243416L,8589935092L,1671,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private InitVisitorFactory() {try{__CLR4_5_2174174lviclf4y.R.inc(1552);}finally{__CLR4_5_2174174lviclf4y.R.flushNeeded();}}

    /**
     * @author ignazio
     * @param <K>
     *        visitor return type
     */
    @SuppressWarnings("unchecked")
    public static class InitVisitor<K> extends OWLAxiomVisitorExAdapter<K> {

        private final boolean sub;
        private final boolean named;

        /**
         * @param sub
         *        true for subclasses
         * @param named
         *        true for named classes
         */
        @SuppressWarnings("null")
        public InitVisitor(boolean sub, boolean named) {
            super(null);__CLR4_5_2174174lviclf4y.R.inc(1554);try{__CLR4_5_2174174lviclf4y.R.inc(1553);
            __CLR4_5_2174174lviclf4y.R.inc(1555);this.sub = sub;
            __CLR4_5_2174174lviclf4y.R.inc(1556);this.named = named;
        }finally{__CLR4_5_2174174lviclf4y.R.flushNeeded();}}

        @Override
        public K visit(@Nonnull OWLSubClassOfAxiom axiom) {try{__CLR4_5_2174174lviclf4y.R.inc(1557);
            __CLR4_5_2174174lviclf4y.R.inc(1558);OWLClassExpression c = (((sub )&&(__CLR4_5_2174174lviclf4y.R.iget(1559)!=0|true))||(__CLR4_5_2174174lviclf4y.R.iget(1560)==0&false))? axiom.getSubClass() : axiom
                    .getSuperClass();
            __CLR4_5_2174174lviclf4y.R.inc(1561);if ((((named && c.isAnonymous())&&(__CLR4_5_2174174lviclf4y.R.iget(1562)!=0|true))||(__CLR4_5_2174174lviclf4y.R.iget(1563)==0&false))) {{
                __CLR4_5_2174174lviclf4y.R.inc(1564);return doDefault(axiom);
            }
            }__CLR4_5_2174174lviclf4y.R.inc(1565);return (K) c;
        }finally{__CLR4_5_2174174lviclf4y.R.flushNeeded();}}

        @Nonnull
        @Override
        public K visit(@Nonnull OWLNegativeObjectPropertyAssertionAxiom axiom) {try{__CLR4_5_2174174lviclf4y.R.inc(1566);
            __CLR4_5_2174174lviclf4y.R.inc(1567);return (K) axiom.getSubject();
        }finally{__CLR4_5_2174174lviclf4y.R.flushNeeded();}}

        @Nonnull
        @Override
        public K visit(@Nonnull OWLAsymmetricObjectPropertyAxiom axiom) {try{__CLR4_5_2174174lviclf4y.R.inc(1568);
            __CLR4_5_2174174lviclf4y.R.inc(1569);return (K) axiom.getProperty();
        }finally{__CLR4_5_2174174lviclf4y.R.flushNeeded();}}

        @Nonnull
        @Override
        public K visit(@Nonnull OWLReflexiveObjectPropertyAxiom axiom) {try{__CLR4_5_2174174lviclf4y.R.inc(1570);
            __CLR4_5_2174174lviclf4y.R.inc(1571);return (K) axiom.getProperty();
        }finally{__CLR4_5_2174174lviclf4y.R.flushNeeded();}}

        @Nonnull
        @Override
        public K visit(@Nonnull OWLDataPropertyDomainAxiom axiom) {try{__CLR4_5_2174174lviclf4y.R.inc(1572);
            __CLR4_5_2174174lviclf4y.R.inc(1573);return (K) axiom.getProperty();
        }finally{__CLR4_5_2174174lviclf4y.R.flushNeeded();}}

        @Nonnull
        @Override
        public K visit(@Nonnull OWLObjectPropertyDomainAxiom axiom) {try{__CLR4_5_2174174lviclf4y.R.inc(1574);
            __CLR4_5_2174174lviclf4y.R.inc(1575);return (K) axiom.getProperty();
        }finally{__CLR4_5_2174174lviclf4y.R.flushNeeded();}}

        @Nonnull
        @Override
        public K visit(@Nonnull OWLNegativeDataPropertyAssertionAxiom axiom) {try{__CLR4_5_2174174lviclf4y.R.inc(1576);
            __CLR4_5_2174174lviclf4y.R.inc(1577);return (K) axiom.getSubject();
        }finally{__CLR4_5_2174174lviclf4y.R.flushNeeded();}}

        @Nonnull
        @Override
        public K visit(@Nonnull OWLObjectPropertyRangeAxiom axiom) {try{__CLR4_5_2174174lviclf4y.R.inc(1578);
            __CLR4_5_2174174lviclf4y.R.inc(1579);return (K) axiom.getProperty();
        }finally{__CLR4_5_2174174lviclf4y.R.flushNeeded();}}

        @Nonnull
        @Override
        public K visit(@Nonnull OWLObjectPropertyAssertionAxiom axiom) {try{__CLR4_5_2174174lviclf4y.R.inc(1580);
            __CLR4_5_2174174lviclf4y.R.inc(1581);return (K) axiom.getSubject();
        }finally{__CLR4_5_2174174lviclf4y.R.flushNeeded();}}

        @Nonnull
        @Override
        public K visit(@Nonnull OWLFunctionalObjectPropertyAxiom axiom) {try{__CLR4_5_2174174lviclf4y.R.inc(1582);
            __CLR4_5_2174174lviclf4y.R.inc(1583);return (K) axiom.getProperty();
        }finally{__CLR4_5_2174174lviclf4y.R.flushNeeded();}}

        @Nonnull
        @Override
        public K visit(@Nonnull OWLSubObjectPropertyOfAxiom axiom) {try{__CLR4_5_2174174lviclf4y.R.inc(1584);
            __CLR4_5_2174174lviclf4y.R.inc(1585);if ((((sub)&&(__CLR4_5_2174174lviclf4y.R.iget(1586)!=0|true))||(__CLR4_5_2174174lviclf4y.R.iget(1587)==0&false))) {{
                __CLR4_5_2174174lviclf4y.R.inc(1588);return (K) axiom.getSubProperty();
            } }else {{
                __CLR4_5_2174174lviclf4y.R.inc(1589);return (K) axiom.getSuperProperty();
            }
        }}finally{__CLR4_5_2174174lviclf4y.R.flushNeeded();}}

        @Nonnull
        @Override
        public K visit(@Nonnull OWLAnnotationAssertionAxiom axiom) {try{__CLR4_5_2174174lviclf4y.R.inc(1590);
            __CLR4_5_2174174lviclf4y.R.inc(1591);return (K) axiom.getSubject();
        }finally{__CLR4_5_2174174lviclf4y.R.flushNeeded();}}

        @Nonnull
        @Override
        public K visit(@Nonnull OWLSymmetricObjectPropertyAxiom axiom) {try{__CLR4_5_2174174lviclf4y.R.inc(1592);
            __CLR4_5_2174174lviclf4y.R.inc(1593);return (K) axiom.getProperty();
        }finally{__CLR4_5_2174174lviclf4y.R.flushNeeded();}}

        @Nonnull
        @Override
        public K visit(@Nonnull OWLDataPropertyRangeAxiom axiom) {try{__CLR4_5_2174174lviclf4y.R.inc(1594);
            __CLR4_5_2174174lviclf4y.R.inc(1595);return (K) axiom.getProperty();
        }finally{__CLR4_5_2174174lviclf4y.R.flushNeeded();}}

        @Nonnull
        @Override
        public K visit(@Nonnull OWLFunctionalDataPropertyAxiom axiom) {try{__CLR4_5_2174174lviclf4y.R.inc(1596);
            __CLR4_5_2174174lviclf4y.R.inc(1597);return (K) axiom.getProperty();
        }finally{__CLR4_5_2174174lviclf4y.R.flushNeeded();}}

        @Override
        public K visit(@Nonnull OWLClassAssertionAxiom axiom) {try{__CLR4_5_2174174lviclf4y.R.inc(1598);
            __CLR4_5_2174174lviclf4y.R.inc(1599);OWLClassExpression c = axiom.getClassExpression();
            __CLR4_5_2174174lviclf4y.R.inc(1600);if ((((named && c.isAnonymous())&&(__CLR4_5_2174174lviclf4y.R.iget(1601)!=0|true))||(__CLR4_5_2174174lviclf4y.R.iget(1602)==0&false))) {{
                __CLR4_5_2174174lviclf4y.R.inc(1603);return doDefault(axiom);
            }
            }__CLR4_5_2174174lviclf4y.R.inc(1604);return (K) c;
        }finally{__CLR4_5_2174174lviclf4y.R.flushNeeded();}}

        @Nonnull
        @Override
        public K visit(@Nonnull OWLDataPropertyAssertionAxiom axiom) {try{__CLR4_5_2174174lviclf4y.R.inc(1605);
            __CLR4_5_2174174lviclf4y.R.inc(1606);return (K) axiom.getSubject();
        }finally{__CLR4_5_2174174lviclf4y.R.flushNeeded();}}

        @Nonnull
        @Override
        public K visit(@Nonnull OWLTransitiveObjectPropertyAxiom axiom) {try{__CLR4_5_2174174lviclf4y.R.inc(1607);
            __CLR4_5_2174174lviclf4y.R.inc(1608);return (K) axiom.getProperty();
        }finally{__CLR4_5_2174174lviclf4y.R.flushNeeded();}}

        @Nonnull
        @Override
        public K visit(@Nonnull OWLIrreflexiveObjectPropertyAxiom axiom) {try{__CLR4_5_2174174lviclf4y.R.inc(1609);
            __CLR4_5_2174174lviclf4y.R.inc(1610);return (K) axiom.getProperty();
        }finally{__CLR4_5_2174174lviclf4y.R.flushNeeded();}}

        @Nonnull
        @Override
        public K visit(@Nonnull OWLSubDataPropertyOfAxiom axiom) {try{__CLR4_5_2174174lviclf4y.R.inc(1611);
            __CLR4_5_2174174lviclf4y.R.inc(1612);if ((((sub)&&(__CLR4_5_2174174lviclf4y.R.iget(1613)!=0|true))||(__CLR4_5_2174174lviclf4y.R.iget(1614)==0&false))) {{
                __CLR4_5_2174174lviclf4y.R.inc(1615);return (K) axiom.getSubProperty();
            } }else {{
                __CLR4_5_2174174lviclf4y.R.inc(1616);return (K) axiom.getSuperProperty();
            }
        }}finally{__CLR4_5_2174174lviclf4y.R.flushNeeded();}}

        @Nonnull
        @Override
        public K visit(@Nonnull OWLInverseFunctionalObjectPropertyAxiom axiom) {try{__CLR4_5_2174174lviclf4y.R.inc(1617);
            __CLR4_5_2174174lviclf4y.R.inc(1618);return (K) axiom.getProperty();
        }finally{__CLR4_5_2174174lviclf4y.R.flushNeeded();}}

        @Override
        public K visit(@Nonnull OWLHasKeyAxiom axiom) {try{__CLR4_5_2174174lviclf4y.R.inc(1619);
            __CLR4_5_2174174lviclf4y.R.inc(1620);if ((((named && axiom.getClassExpression().isAnonymous())&&(__CLR4_5_2174174lviclf4y.R.iget(1621)!=0|true))||(__CLR4_5_2174174lviclf4y.R.iget(1622)==0&false))) {{
                __CLR4_5_2174174lviclf4y.R.inc(1623);return doDefault(axiom);
            }
            }__CLR4_5_2174174lviclf4y.R.inc(1624);return (K) axiom.getClassExpression().asOWLClass();
        }finally{__CLR4_5_2174174lviclf4y.R.flushNeeded();}}
    }

    /**
     * @author ignazio
     * @param <K>
     *        visitor return type
     */
    @SuppressWarnings("unchecked")
    public static class InitIndividualVisitor<K extends OWLObject> extends
            InitVisitor<K> {

        /**
         * @param sub
         *        true for subclasses
         * @param named
         *        true for named classes
         */
        public InitIndividualVisitor(boolean sub, boolean named) {
            super(sub, named);__CLR4_5_2174174lviclf4y.R.inc(1626);try{__CLR4_5_2174174lviclf4y.R.inc(1625);
        }finally{__CLR4_5_2174174lviclf4y.R.flushNeeded();}}

        @Nonnull
        @Override
        public K visit(@Nonnull OWLClassAssertionAxiom axiom) {try{__CLR4_5_2174174lviclf4y.R.inc(1627);
            __CLR4_5_2174174lviclf4y.R.inc(1628);return (K) axiom.getIndividual();
        }finally{__CLR4_5_2174174lviclf4y.R.flushNeeded();}}
    }

    /**
     * @author ignazio
     * @param <K>
     *        collection type
     */
    @SuppressWarnings("unchecked")
    public static class InitCollectionVisitor<K> extends
            OWLAxiomVisitorExAdapter<Collection<K>> {

        private final boolean named;

        /**
         * @param named
         *        true for named classes
         */
        public InitCollectionVisitor(boolean named) {
            super(CollectionFactory.<K> emptySet());__CLR4_5_2174174lviclf4y.R.inc(1630);try{__CLR4_5_2174174lviclf4y.R.inc(1629);
            __CLR4_5_2174174lviclf4y.R.inc(1631);this.named = named;
        }finally{__CLR4_5_2174174lviclf4y.R.flushNeeded();}}

        @Nonnull
        @Override
        public Collection<K> visit(@Nonnull OWLDisjointClassesAxiom axiom) {try{__CLR4_5_2174174lviclf4y.R.inc(1632);
            __CLR4_5_2174174lviclf4y.R.inc(1633);List<OWLClassExpression> list = new ArrayList<>(
                    axiom.getClassExpressions());
            __CLR4_5_2174174lviclf4y.R.inc(1634);if ((((named)&&(__CLR4_5_2174174lviclf4y.R.iget(1635)!=0|true))||(__CLR4_5_2174174lviclf4y.R.iget(1636)==0&false))) {{
                __CLR4_5_2174174lviclf4y.R.inc(1637);deleteAnonymousClasses(list);
            }
            }__CLR4_5_2174174lviclf4y.R.inc(1638);return (Collection<K>) list;
        }finally{__CLR4_5_2174174lviclf4y.R.flushNeeded();}}

        private static void deleteAnonymousClasses(
                @Nonnull List<OWLClassExpression> list) {try{__CLR4_5_2174174lviclf4y.R.inc(1639);
            __CLR4_5_2174174lviclf4y.R.inc(1640);for (int i = 0; (((i < list.size())&&(__CLR4_5_2174174lviclf4y.R.iget(1641)!=0|true))||(__CLR4_5_2174174lviclf4y.R.iget(1642)==0&false));) {{
                __CLR4_5_2174174lviclf4y.R.inc(1643);if ((((list.get(i).isAnonymous())&&(__CLR4_5_2174174lviclf4y.R.iget(1644)!=0|true))||(__CLR4_5_2174174lviclf4y.R.iget(1645)==0&false))) {{
                    __CLR4_5_2174174lviclf4y.R.inc(1646);list.remove(i);
                } }else {{
                    __CLR4_5_2174174lviclf4y.R.inc(1647);i++;
                }
            }}
        }}finally{__CLR4_5_2174174lviclf4y.R.flushNeeded();}}

        @Nonnull
        @Override
        public Collection<K> visit(
                @Nonnull OWLEquivalentObjectPropertiesAxiom axiom) {try{__CLR4_5_2174174lviclf4y.R.inc(1648);
            __CLR4_5_2174174lviclf4y.R.inc(1649);return (Collection<K>) axiom.getProperties();
        }finally{__CLR4_5_2174174lviclf4y.R.flushNeeded();}}

        @Nonnull
        @Override
        public Collection<K> visit(@Nonnull OWLDifferentIndividualsAxiom axiom) {try{__CLR4_5_2174174lviclf4y.R.inc(1650);
            __CLR4_5_2174174lviclf4y.R.inc(1651);return (Collection<K>) axiom.getIndividuals();
        }finally{__CLR4_5_2174174lviclf4y.R.flushNeeded();}}

        @Nonnull
        @Override
        public Collection<K>
                visit(@Nonnull OWLDisjointDataPropertiesAxiom axiom) {try{__CLR4_5_2174174lviclf4y.R.inc(1652);
            __CLR4_5_2174174lviclf4y.R.inc(1653);return (Collection<K>) axiom.getProperties();
        }finally{__CLR4_5_2174174lviclf4y.R.flushNeeded();}}

        @Nonnull
        @Override
        public Collection<K> visit(
                @Nonnull OWLDisjointObjectPropertiesAxiom axiom) {try{__CLR4_5_2174174lviclf4y.R.inc(1654);
            __CLR4_5_2174174lviclf4y.R.inc(1655);return (Collection<K>) axiom.getProperties();
        }finally{__CLR4_5_2174174lviclf4y.R.flushNeeded();}}

        @Nonnull
        @Override
        public Collection<K> visit(@Nonnull OWLDisjointUnionAxiom axiom) {try{__CLR4_5_2174174lviclf4y.R.inc(1656);
            __CLR4_5_2174174lviclf4y.R.inc(1657);return CollectionFactory.createSet((K) axiom.getOWLClass());
        }finally{__CLR4_5_2174174lviclf4y.R.flushNeeded();}}

        @Nonnull
        @Override
        public Collection<K> visit(
                @Nonnull OWLEquivalentDataPropertiesAxiom axiom) {try{__CLR4_5_2174174lviclf4y.R.inc(1658);
            __CLR4_5_2174174lviclf4y.R.inc(1659);return (Collection<K>) axiom.getProperties();
        }finally{__CLR4_5_2174174lviclf4y.R.flushNeeded();}}

        @Nonnull
        @Override
        public Collection<K> visit(@Nonnull OWLEquivalentClassesAxiom axiom) {try{__CLR4_5_2174174lviclf4y.R.inc(1660);
            __CLR4_5_2174174lviclf4y.R.inc(1661);List<OWLClassExpression> list = new ArrayList<>(
                    axiom.getClassExpressions());
            __CLR4_5_2174174lviclf4y.R.inc(1662);if ((((named)&&(__CLR4_5_2174174lviclf4y.R.iget(1663)!=0|true))||(__CLR4_5_2174174lviclf4y.R.iget(1664)==0&false))) {{
                __CLR4_5_2174174lviclf4y.R.inc(1665);deleteAnonymousClasses(list);
            }
            }__CLR4_5_2174174lviclf4y.R.inc(1666);return (Collection<K>) list;
        }finally{__CLR4_5_2174174lviclf4y.R.flushNeeded();}}

        @Nonnull
        @Override
        public Collection<K> visit(@Nonnull OWLSameIndividualAxiom axiom) {try{__CLR4_5_2174174lviclf4y.R.inc(1667);
            __CLR4_5_2174174lviclf4y.R.inc(1668);return (Collection<K>) axiom.getIndividuals();
        }finally{__CLR4_5_2174174lviclf4y.R.flushNeeded();}}

        @Nonnull
        @Override
        public Collection<K> visit(
                @Nonnull OWLInverseObjectPropertiesAxiom axiom) {try{__CLR4_5_2174174lviclf4y.R.inc(1669);
            __CLR4_5_2174174lviclf4y.R.inc(1670);return (Collection<K>) axiom.getProperties();
        }finally{__CLR4_5_2174174lviclf4y.R.flushNeeded();}}
    }

//@formatter:off
    static final InitVisitor<OWLClass>                              CLASSSUBNAMED      = new InitVisitor<>          (true,  true);
    static final InitVisitor<OWLClassExpression>                    CLASSEXPRESSIONS   = new InitVisitor<>          (true,  true);
    static final InitVisitor<OWLClass>                              CLASSSUPERNAMED    = new InitVisitor<>          (false, true);
    static final InitCollectionVisitor<OWLClass>                    CLASSCOLLECTIONS   = new InitCollectionVisitor<>(true);
    static final InitCollectionVisitor<OWLObjectPropertyExpression> OPCOLLECTIONS      = new InitCollectionVisitor<>(true);
    static final InitCollectionVisitor<OWLDataPropertyExpression>   DPCOLLECTIONS      = new InitCollectionVisitor<>(true);
    static final InitCollectionVisitor<OWLIndividual>               ICOLLECTIONS       = new InitCollectionVisitor<>(true);
    static final InitVisitor<OWLObjectPropertyExpression>           OPSUBNAMED         = new InitVisitor<>          (true,  true);
    static final InitVisitor<OWLObjectPropertyExpression>           OPSUPERNAMED       = new InitVisitor<>          (false, true);
    static final InitVisitor<OWLDataPropertyExpression>             DPSUBNAMED         = new InitVisitor<>          (true,  true);
    static final InitVisitor<OWLDataPropertyExpression>             DPSUPERNAMED       = new InitVisitor<>          (false, true);
    static final InitVisitor<OWLIndividual>                         INDIVIDUALSUBNAMED = new InitIndividualVisitor<>(true,  true);
    static final InitVisitor<OWLAnnotationSubject>                  ANNOTSUPERNAMED    = new InitVisitor<>          (true,  true);
  //@formatter:on
}
