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
package org.semanticweb.owlapi.debugging;

import static org.semanticweb.owlapi.util.OWLAPIPreconditions.checkNotNull;

import java.io.Serializable;
import java.util.*;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.util.OWLAxiomVisitorAdapter;
import org.semanticweb.owlapi.util.OWLEntityCollector;

import com.google.common.collect.Multimap;
import com.google.common.collect.MultimapBuilder;

/**
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.0.0
 */
public class JustificationMap {public static class __CLR4_5_21li1lilviclz83{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u006f\u006f\u006c\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237269396L,8589935092L,2248,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Nonnull
    private final Set<OWLAxiom> axioms;
    @Nonnull
    private final Set<OWLAxiom> rootAxioms = new HashSet<>();
    @Nonnull
    private final Set<OWLAxiom> usedAxioms = new HashSet<>();
    @Nonnull
    private final Multimap<OWLAxiom, OWLAxiom> map = MultimapBuilder.hashKeys().arrayListValues().build();
    @Nonnull
    private final Multimap<OWLEntity, OWLAxiom> axiomsByLHS = MultimapBuilder.hashKeys().arrayListValues().build();
    @Nonnull
    private final OWLClassExpression desc;

    /**
     * Instantiates a new justification map.
     * 
     * @param desc
     *        the class expression
     * @param axioms
     *        the axioms
     */
    public JustificationMap(@Nonnull OWLClassExpression desc, @Nonnull Set<OWLAxiom> axioms) {try{__CLR4_5_21li1lilviclz83.R.inc(2070);
        __CLR4_5_21li1lilviclz83.R.inc(2071);this.axioms = checkNotNull(axioms, "axioms cannot be null");
        __CLR4_5_21li1lilviclz83.R.inc(2072);this.desc = checkNotNull(desc, "desc cannot be null");
        __CLR4_5_21li1lilviclz83.R.inc(2073);createMap();
    }finally{__CLR4_5_21li1lilviclz83.R.flushNeeded();}}

    private void createMap() {try{__CLR4_5_21li1lilviclz83.R.inc(2074);
        __CLR4_5_21li1lilviclz83.R.inc(2075);for (OWLAxiom ax : axioms) {{
            __CLR4_5_21li1lilviclz83.R.inc(2076);OWLAxiomPartExtractor extractor = new OWLAxiomPartExtractor();
            __CLR4_5_21li1lilviclz83.R.inc(2077);ax.accept(extractor);
            __CLR4_5_21li1lilviclz83.R.inc(2078);Set<OWLEntity> lhscollected = new HashSet<>();
            __CLR4_5_21li1lilviclz83.R.inc(2079);OWLEntityCollector lhsCollector = new OWLEntityCollector(lhscollected);
            __CLR4_5_21li1lilviclz83.R.inc(2080);for (OWLObject lhsObject : extractor.getLHS()) {{
                __CLR4_5_21li1lilviclz83.R.inc(2081);lhsObject.accept(lhsCollector);
            }
            }__CLR4_5_21li1lilviclz83.R.inc(2082);for (OWLEntity lhsEntity : lhscollected) {{
                __CLR4_5_21li1lilviclz83.R.inc(2083);axiomsByLHS.put(lhsEntity, ax);
            }
        }}
        }__CLR4_5_21li1lilviclz83.R.inc(2084);buildChildren(desc);
    }finally{__CLR4_5_21li1lilviclz83.R.flushNeeded();}}

    /**
     * Gets the axioms by lhs.
     * 
     * @param lhs
     *        the lhs
     * @return the axioms by lhs
     */
    @Nonnull
    private Set<OWLAxiom> getAxiomsByLHS(@Nonnull OWLEntity lhs) {try{__CLR4_5_21li1lilviclz83.R.inc(2085);
        __CLR4_5_21li1lilviclz83.R.inc(2086);Set<OWLAxiom> ts = new TreeSet<>(new OWLAxiomComparator());
        __CLR4_5_21li1lilviclz83.R.inc(2087);ts.addAll(axiomsByLHS.get(lhs));
        __CLR4_5_21li1lilviclz83.R.inc(2088);return ts;
    }finally{__CLR4_5_21li1lilviclz83.R.flushNeeded();}}

    private void buildChildren(@Nonnull OWLClassExpression seed) {try{__CLR4_5_21li1lilviclz83.R.inc(2089);
        // Return the axioms that have the entity on the LHS
        __CLR4_5_21li1lilviclz83.R.inc(2090);Set<OWLAxiom> result = new HashSet<>();
        __CLR4_5_21li1lilviclz83.R.inc(2091);for (OWLEntity ent : seed.getSignature()) {{
            assert (((ent != null)&&(__CLR4_5_21li1lilviclz83.R.iget(2092)!=0|true))||(__CLR4_5_21li1lilviclz83.R.iget(2093)==0&false));
            __CLR4_5_21li1lilviclz83.R.inc(2094);Set<OWLAxiom> axs = getAxiomsByLHS(ent);
            __CLR4_5_21li1lilviclz83.R.inc(2095);for (OWLAxiom ax : axs) {{
                __CLR4_5_21li1lilviclz83.R.inc(2096);result.add(ax);
                __CLR4_5_21li1lilviclz83.R.inc(2097);usedAxioms.add(ax);
            }
        }}
        }__CLR4_5_21li1lilviclz83.R.inc(2098);rootAxioms.addAll(result);
        __CLR4_5_21li1lilviclz83.R.inc(2099);buildChildren(result);
    }finally{__CLR4_5_21li1lilviclz83.R.flushNeeded();}}

    private void buildChildren(@Nonnull Set<OWLAxiom> axiomSet) {try{__CLR4_5_21li1lilviclz83.R.inc(2100);
        __CLR4_5_21li1lilviclz83.R.inc(2101);List<Set<OWLAxiom>> axiomChildren = new ArrayList<>();
        __CLR4_5_21li1lilviclz83.R.inc(2102);for (OWLAxiom ax : axiomSet) {{
            assert (((ax != null)&&(__CLR4_5_21li1lilviclz83.R.iget(2103)!=0|true))||(__CLR4_5_21li1lilviclz83.R.iget(2104)==0&false));
            __CLR4_5_21li1lilviclz83.R.inc(2105);Set<OWLAxiom> children = build(ax);
            __CLR4_5_21li1lilviclz83.R.inc(2106);for (OWLAxiom childAx : children) {{
                __CLR4_5_21li1lilviclz83.R.inc(2107);map.put(childAx, ax);
            }
            }__CLR4_5_21li1lilviclz83.R.inc(2108);axiomChildren.add(children);
        }
        }__CLR4_5_21li1lilviclz83.R.inc(2109);for (Set<OWLAxiom> children : axiomChildren) {{
            assert (((children != null)&&(__CLR4_5_21li1lilviclz83.R.iget(2110)!=0|true))||(__CLR4_5_21li1lilviclz83.R.iget(2111)==0&false));
            __CLR4_5_21li1lilviclz83.R.inc(2112);buildChildren(children);
        }
    }}finally{__CLR4_5_21li1lilviclz83.R.flushNeeded();}}

    /**
     * Builds the.
     * 
     * @param parentAxiom
     *        the parent axiom
     * @return the sets the
     */
    @Nonnull
    private Set<OWLAxiom> build(@Nonnull OWLAxiom parentAxiom) {try{__CLR4_5_21li1lilviclz83.R.inc(2113);
        __CLR4_5_21li1lilviclz83.R.inc(2114);usedAxioms.add(parentAxiom);
        __CLR4_5_21li1lilviclz83.R.inc(2115);OWLAxiomPartExtractor extractor = new OWLAxiomPartExtractor();
        __CLR4_5_21li1lilviclz83.R.inc(2116);parentAxiom.accept(extractor);
        __CLR4_5_21li1lilviclz83.R.inc(2117);Set<OWLAxiom> result = new HashSet<>();
        __CLR4_5_21li1lilviclz83.R.inc(2118);for (OWLObject obj : extractor.getRHS()) {{
            __CLR4_5_21li1lilviclz83.R.inc(2119);for (OWLEntity ent : obj.getSignature()) {{
                assert (((ent != null)&&(__CLR4_5_21li1lilviclz83.R.iget(2120)!=0|true))||(__CLR4_5_21li1lilviclz83.R.iget(2121)==0&false));
                __CLR4_5_21li1lilviclz83.R.inc(2122);Set<OWLAxiom> axs = getAxiomsByLHS(ent);
                __CLR4_5_21li1lilviclz83.R.inc(2123);for (OWLAxiom ax : axs) {{
                    __CLR4_5_21li1lilviclz83.R.inc(2124);if ((((!usedAxioms.contains(ax))&&(__CLR4_5_21li1lilviclz83.R.iget(2125)!=0|true))||(__CLR4_5_21li1lilviclz83.R.iget(2126)==0&false))) {{
                        __CLR4_5_21li1lilviclz83.R.inc(2127);result.add(ax);
                        __CLR4_5_21li1lilviclz83.R.inc(2128);usedAxioms.add(ax);
                    }
                }}
            }}
        }}
        }__CLR4_5_21li1lilviclz83.R.inc(2129);return result;
    }finally{__CLR4_5_21li1lilviclz83.R.flushNeeded();}}

    /**
     * Gets the root axioms.
     * 
     * @return the root axioms
     */
    @Nonnull
    public Set<OWLAxiom> getRootAxioms() {try{__CLR4_5_21li1lilviclz83.R.inc(2130);
        __CLR4_5_21li1lilviclz83.R.inc(2131);return rootAxioms;
    }finally{__CLR4_5_21li1lilviclz83.R.flushNeeded();}}

    /**
     * Gets the child axioms.
     * 
     * @param ax
     *        the axiom whose children are to be retrieved
     * @return children of ax
     */
    @Nonnull
    public Collection<OWLAxiom> getChildAxioms(@Nonnull OWLAxiom ax) {try{__CLR4_5_21li1lilviclz83.R.inc(2132);
        __CLR4_5_21li1lilviclz83.R.inc(2133);return map.get(ax);
    }finally{__CLR4_5_21li1lilviclz83.R.flushNeeded();}}

    /** The Class OWLAxiomPartExtractor. */
    private static class OWLAxiomPartExtractor extends OWLAxiomVisitorAdapter {

        @Nonnull
        private final Set<OWLObject> rhs = new HashSet<>();
        @Nonnull
        private final Set<OWLObject> lhs = new HashSet<>();

        /**
         * Gets the rhs.
         * 
         * @return the rhs
         */
        @Nonnull
        public Set<OWLObject> getRHS() {try{__CLR4_5_21li1lilviclz83.R.inc(2134);
            __CLR4_5_21li1lilviclz83.R.inc(2135);return rhs;
        }finally{__CLR4_5_21li1lilviclz83.R.flushNeeded();}}

        /**
         * Gets the lhs.
         * 
         * @return the lhs
         */
        @Nonnull
        public Set<OWLObject> getLHS() {try{__CLR4_5_21li1lilviclz83.R.inc(2136);
            __CLR4_5_21li1lilviclz83.R.inc(2137);return lhs;
        }finally{__CLR4_5_21li1lilviclz83.R.flushNeeded();}}

        /** Instantiates a new oWL axiom part extractor. */
        OWLAxiomPartExtractor() {try{__CLR4_5_21li1lilviclz83.R.inc(2138);}finally{__CLR4_5_21li1lilviclz83.R.flushNeeded();}}

        @Override
        public void visit(OWLSubClassOfAxiom axiom) {try{__CLR4_5_21li1lilviclz83.R.inc(2139);
            __CLR4_5_21li1lilviclz83.R.inc(2140);rhs.add(axiom.getSuperClass());
            __CLR4_5_21li1lilviclz83.R.inc(2141);lhs.add(axiom.getSubClass());
        }finally{__CLR4_5_21li1lilviclz83.R.flushNeeded();}}

        @Override
        public void visit(OWLNegativeObjectPropertyAssertionAxiom axiom) {try{__CLR4_5_21li1lilviclz83.R.inc(2142);
            __CLR4_5_21li1lilviclz83.R.inc(2143);rhs.add(axiom.getObject());
            __CLR4_5_21li1lilviclz83.R.inc(2144);rhs.add(axiom.getProperty());
            __CLR4_5_21li1lilviclz83.R.inc(2145);lhs.add(axiom.getSubject());
        }finally{__CLR4_5_21li1lilviclz83.R.flushNeeded();}}

        @Override
        public void visit(OWLAsymmetricObjectPropertyAxiom axiom) {try{__CLR4_5_21li1lilviclz83.R.inc(2146);
            __CLR4_5_21li1lilviclz83.R.inc(2147);rhs.add(axiom.getProperty());
        }finally{__CLR4_5_21li1lilviclz83.R.flushNeeded();}}

        @Override
        public void visit(OWLReflexiveObjectPropertyAxiom axiom) {try{__CLR4_5_21li1lilviclz83.R.inc(2148);
            __CLR4_5_21li1lilviclz83.R.inc(2149);rhs.add(axiom.getProperty());
        }finally{__CLR4_5_21li1lilviclz83.R.flushNeeded();}}

        @Override
        public void visit(OWLDisjointClassesAxiom axiom) {try{__CLR4_5_21li1lilviclz83.R.inc(2150);
            __CLR4_5_21li1lilviclz83.R.inc(2151);rhs.addAll(axiom.getClassExpressions());
            __CLR4_5_21li1lilviclz83.R.inc(2152);lhs.addAll(axiom.getClassExpressions());
        }finally{__CLR4_5_21li1lilviclz83.R.flushNeeded();}}

        @Override
        public void visit(OWLDataPropertyDomainAxiom axiom) {try{__CLR4_5_21li1lilviclz83.R.inc(2153);
            __CLR4_5_21li1lilviclz83.R.inc(2154);rhs.add(axiom.getDomain());
            __CLR4_5_21li1lilviclz83.R.inc(2155);lhs.add(axiom.getProperty());
        }finally{__CLR4_5_21li1lilviclz83.R.flushNeeded();}}

        @Override
        public void visit(OWLObjectPropertyDomainAxiom axiom) {try{__CLR4_5_21li1lilviclz83.R.inc(2156);
            __CLR4_5_21li1lilviclz83.R.inc(2157);rhs.add(axiom.getDomain());
            __CLR4_5_21li1lilviclz83.R.inc(2158);lhs.add(axiom.getProperty());
        }finally{__CLR4_5_21li1lilviclz83.R.flushNeeded();}}

        @Override
        public void visit(OWLEquivalentObjectPropertiesAxiom axiom) {try{__CLR4_5_21li1lilviclz83.R.inc(2159);
            __CLR4_5_21li1lilviclz83.R.inc(2160);rhs.addAll(axiom.getProperties());
            __CLR4_5_21li1lilviclz83.R.inc(2161);lhs.addAll(axiom.getProperties());
        }finally{__CLR4_5_21li1lilviclz83.R.flushNeeded();}}

        @Override
        public void visit(OWLNegativeDataPropertyAssertionAxiom axiom) {try{__CLR4_5_21li1lilviclz83.R.inc(2162);
            __CLR4_5_21li1lilviclz83.R.inc(2163);rhs.add(axiom.getProperty());
            __CLR4_5_21li1lilviclz83.R.inc(2164);rhs.add(axiom.getObject());
            __CLR4_5_21li1lilviclz83.R.inc(2165);lhs.add(axiom.getSubject());
        }finally{__CLR4_5_21li1lilviclz83.R.flushNeeded();}}

        @Override
        public void visit(OWLDifferentIndividualsAxiom axiom) {try{__CLR4_5_21li1lilviclz83.R.inc(2166);
            __CLR4_5_21li1lilviclz83.R.inc(2167);rhs.addAll(axiom.getIndividuals());
            __CLR4_5_21li1lilviclz83.R.inc(2168);lhs.addAll(axiom.getIndividuals());
        }finally{__CLR4_5_21li1lilviclz83.R.flushNeeded();}}

        @Override
        public void visit(OWLDisjointDataPropertiesAxiom axiom) {try{__CLR4_5_21li1lilviclz83.R.inc(2169);
            __CLR4_5_21li1lilviclz83.R.inc(2170);rhs.addAll(axiom.getProperties());
            __CLR4_5_21li1lilviclz83.R.inc(2171);lhs.addAll(axiom.getProperties());
        }finally{__CLR4_5_21li1lilviclz83.R.flushNeeded();}}

        @Override
        public void visit(OWLDisjointObjectPropertiesAxiom axiom) {try{__CLR4_5_21li1lilviclz83.R.inc(2172);
            __CLR4_5_21li1lilviclz83.R.inc(2173);rhs.addAll(axiom.getProperties());
            __CLR4_5_21li1lilviclz83.R.inc(2174);lhs.addAll(axiom.getProperties());
        }finally{__CLR4_5_21li1lilviclz83.R.flushNeeded();}}

        @Override
        public void visit(OWLObjectPropertyRangeAxiom axiom) {try{__CLR4_5_21li1lilviclz83.R.inc(2175);
            __CLR4_5_21li1lilviclz83.R.inc(2176);rhs.add(axiom.getRange());
            __CLR4_5_21li1lilviclz83.R.inc(2177);lhs.add(axiom.getProperty());
        }finally{__CLR4_5_21li1lilviclz83.R.flushNeeded();}}

        @Override
        public void visit(OWLObjectPropertyAssertionAxiom axiom) {try{__CLR4_5_21li1lilviclz83.R.inc(2178);
            __CLR4_5_21li1lilviclz83.R.inc(2179);rhs.add(axiom.getProperty());
            __CLR4_5_21li1lilviclz83.R.inc(2180);rhs.add(axiom.getObject());
            __CLR4_5_21li1lilviclz83.R.inc(2181);lhs.add(axiom.getSubject());
        }finally{__CLR4_5_21li1lilviclz83.R.flushNeeded();}}

        @Override
        public void visit(OWLFunctionalObjectPropertyAxiom axiom) {try{__CLR4_5_21li1lilviclz83.R.inc(2182);
            __CLR4_5_21li1lilviclz83.R.inc(2183);rhs.add(axiom.getProperty());
        }finally{__CLR4_5_21li1lilviclz83.R.flushNeeded();}}

        @Override
        public void visit(OWLSubObjectPropertyOfAxiom axiom) {try{__CLR4_5_21li1lilviclz83.R.inc(2184);
            __CLR4_5_21li1lilviclz83.R.inc(2185);rhs.add(axiom.getSuperProperty());
            __CLR4_5_21li1lilviclz83.R.inc(2186);lhs.add(axiom.getSubProperty());
        }finally{__CLR4_5_21li1lilviclz83.R.flushNeeded();}}

        @Override
        public void visit(OWLDisjointUnionAxiom axiom) {try{__CLR4_5_21li1lilviclz83.R.inc(2187);
            __CLR4_5_21li1lilviclz83.R.inc(2188);rhs.addAll(axiom.getClassExpressions());
            __CLR4_5_21li1lilviclz83.R.inc(2189);rhs.add(axiom.getOWLClass());
            __CLR4_5_21li1lilviclz83.R.inc(2190);lhs.add(axiom.getOWLClass());
            __CLR4_5_21li1lilviclz83.R.inc(2191);lhs.addAll(axiom.getClassExpressions());
        }finally{__CLR4_5_21li1lilviclz83.R.flushNeeded();}}

        @Override
        public void visit(OWLSymmetricObjectPropertyAxiom axiom) {try{__CLR4_5_21li1lilviclz83.R.inc(2192);
            __CLR4_5_21li1lilviclz83.R.inc(2193);rhs.add(axiom.getProperty());
        }finally{__CLR4_5_21li1lilviclz83.R.flushNeeded();}}

        @Override
        public void visit(OWLDataPropertyRangeAxiom axiom) {try{__CLR4_5_21li1lilviclz83.R.inc(2194);
            __CLR4_5_21li1lilviclz83.R.inc(2195);rhs.add(axiom.getRange());
            __CLR4_5_21li1lilviclz83.R.inc(2196);lhs.add(axiom.getProperty());
        }finally{__CLR4_5_21li1lilviclz83.R.flushNeeded();}}

        @Override
        public void visit(OWLFunctionalDataPropertyAxiom axiom) {try{__CLR4_5_21li1lilviclz83.R.inc(2197);
            __CLR4_5_21li1lilviclz83.R.inc(2198);rhs.add(axiom.getProperty());
        }finally{__CLR4_5_21li1lilviclz83.R.flushNeeded();}}

        @Override
        public void visit(OWLEquivalentDataPropertiesAxiom axiom) {try{__CLR4_5_21li1lilviclz83.R.inc(2199);
            __CLR4_5_21li1lilviclz83.R.inc(2200);rhs.addAll(axiom.getProperties());
            __CLR4_5_21li1lilviclz83.R.inc(2201);lhs.addAll(axiom.getProperties());
        }finally{__CLR4_5_21li1lilviclz83.R.flushNeeded();}}

        @Override
        public void visit(OWLClassAssertionAxiom axiom) {try{__CLR4_5_21li1lilviclz83.R.inc(2202);
            __CLR4_5_21li1lilviclz83.R.inc(2203);rhs.add(axiom.getClassExpression());
            __CLR4_5_21li1lilviclz83.R.inc(2204);lhs.add(axiom.getIndividual());
        }finally{__CLR4_5_21li1lilviclz83.R.flushNeeded();}}

        @Override
        public void visit(OWLEquivalentClassesAxiom axiom) {try{__CLR4_5_21li1lilviclz83.R.inc(2205);
            __CLR4_5_21li1lilviclz83.R.inc(2206);rhs.addAll(axiom.getClassExpressions());
            __CLR4_5_21li1lilviclz83.R.inc(2207);lhs.addAll(axiom.getClassExpressions());
        }finally{__CLR4_5_21li1lilviclz83.R.flushNeeded();}}

        @Override
        public void visit(OWLDataPropertyAssertionAxiom axiom) {try{__CLR4_5_21li1lilviclz83.R.inc(2208);
            __CLR4_5_21li1lilviclz83.R.inc(2209);rhs.add(axiom.getProperty());
            __CLR4_5_21li1lilviclz83.R.inc(2210);lhs.add(axiom.getSubject());
        }finally{__CLR4_5_21li1lilviclz83.R.flushNeeded();}}

        @Override
        public void visit(OWLTransitiveObjectPropertyAxiom axiom) {try{__CLR4_5_21li1lilviclz83.R.inc(2211);
            __CLR4_5_21li1lilviclz83.R.inc(2212);rhs.add(axiom.getProperty());
        }finally{__CLR4_5_21li1lilviclz83.R.flushNeeded();}}

        @Override
        public void visit(OWLIrreflexiveObjectPropertyAxiom axiom) {try{__CLR4_5_21li1lilviclz83.R.inc(2213);
            __CLR4_5_21li1lilviclz83.R.inc(2214);rhs.add(axiom.getProperty());
        }finally{__CLR4_5_21li1lilviclz83.R.flushNeeded();}}

        @Override
        public void visit(OWLSubDataPropertyOfAxiom axiom) {try{__CLR4_5_21li1lilviclz83.R.inc(2215);
            __CLR4_5_21li1lilviclz83.R.inc(2216);rhs.add(axiom.getSuperProperty());
        }finally{__CLR4_5_21li1lilviclz83.R.flushNeeded();}}

        @Override
        public void visit(OWLInverseFunctionalObjectPropertyAxiom axiom) {try{__CLR4_5_21li1lilviclz83.R.inc(2217);
            __CLR4_5_21li1lilviclz83.R.inc(2218);rhs.add(axiom.getProperty());
        }finally{__CLR4_5_21li1lilviclz83.R.flushNeeded();}}

        @Override
        public void visit(OWLSameIndividualAxiom axiom) {try{__CLR4_5_21li1lilviclz83.R.inc(2219);
            __CLR4_5_21li1lilviclz83.R.inc(2220);rhs.addAll(axiom.getIndividuals());
            __CLR4_5_21li1lilviclz83.R.inc(2221);lhs.addAll(axiom.getIndividuals());
        }finally{__CLR4_5_21li1lilviclz83.R.flushNeeded();}}

        @Override
        public void visit(OWLSubPropertyChainOfAxiom axiom) {try{__CLR4_5_21li1lilviclz83.R.inc(2222);
            __CLR4_5_21li1lilviclz83.R.inc(2223);rhs.add(axiom.getSuperProperty());
            __CLR4_5_21li1lilviclz83.R.inc(2224);lhs.addAll(axiom.getPropertyChain());
        }finally{__CLR4_5_21li1lilviclz83.R.flushNeeded();}}

        @Override
        public void visit(OWLInverseObjectPropertiesAxiom axiom) {try{__CLR4_5_21li1lilviclz83.R.inc(2225);
            __CLR4_5_21li1lilviclz83.R.inc(2226);rhs.addAll(axiom.getProperties());
            __CLR4_5_21li1lilviclz83.R.inc(2227);lhs.addAll(axiom.getProperties());
        }finally{__CLR4_5_21li1lilviclz83.R.flushNeeded();}}

        @Override
        public void visit(SWRLRule rule) {try{__CLR4_5_21li1lilviclz83.R.inc(2228);}finally{__CLR4_5_21li1lilviclz83.R.flushNeeded();}}
    }

    /** The Class OWLAxiomComparator. */
    private static class OWLAxiomComparator extends OWLAxiomVisitorAdapter implements Comparator<OWLAxiom>,
        Serializable {

        private static final long serialVersionUID = 40000L;
        private int result;

        /** Instantiates a new oWL axiom comparator. */
        OWLAxiomComparator() {try{__CLR4_5_21li1lilviclz83.R.inc(2229);}finally{__CLR4_5_21li1lilviclz83.R.flushNeeded();}}

        @Override
        public void visit(OWLSubClassOfAxiom axiom) {try{__CLR4_5_21li1lilviclz83.R.inc(2230);
            __CLR4_5_21li1lilviclz83.R.inc(2231);result = 0;
        }finally{__CLR4_5_21li1lilviclz83.R.flushNeeded();}}

        @Override
        public void visit(OWLEquivalentClassesAxiom axiom) {try{__CLR4_5_21li1lilviclz83.R.inc(2232);
            __CLR4_5_21li1lilviclz83.R.inc(2233);result = 1;
        }finally{__CLR4_5_21li1lilviclz83.R.flushNeeded();}}

        @Override
        public void visit(OWLDisjointClassesAxiom axiom) {try{__CLR4_5_21li1lilviclz83.R.inc(2234);
            __CLR4_5_21li1lilviclz83.R.inc(2235);result = 2;
        }finally{__CLR4_5_21li1lilviclz83.R.flushNeeded();}}

        @Override
        public int compare(OWLAxiom o1, OWLAxiom o2) {try{__CLR4_5_21li1lilviclz83.R.inc(2236);
            __CLR4_5_21li1lilviclz83.R.inc(2237);result = 0;
            __CLR4_5_21li1lilviclz83.R.inc(2238);o1.accept(this);
            __CLR4_5_21li1lilviclz83.R.inc(2239);int result1 = result;
            __CLR4_5_21li1lilviclz83.R.inc(2240);o2.accept(this);
            __CLR4_5_21li1lilviclz83.R.inc(2241);int result2 = result;
            __CLR4_5_21li1lilviclz83.R.inc(2242);int diff = result2 - result1;
            __CLR4_5_21li1lilviclz83.R.inc(2243);if ((((diff != 0)&&(__CLR4_5_21li1lilviclz83.R.iget(2244)!=0|true))||(__CLR4_5_21li1lilviclz83.R.iget(2245)==0&false))) {{
                __CLR4_5_21li1lilviclz83.R.inc(2246);return diff;
            } }else {{
                __CLR4_5_21li1lilviclz83.R.inc(2247);return -1;
            }
        }}finally{__CLR4_5_21li1lilviclz83.R.flushNeeded();}}
    }
}
