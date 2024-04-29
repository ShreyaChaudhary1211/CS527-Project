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
package org.semanticweb.owlapi.api.test.literals;

import static org.junit.Assert.*;
import static org.semanticweb.owlapi.apibinding.OWLFunctionalSyntaxFactory.*;

import java.util.*;

import javax.annotation.Nonnull;

import org.junit.Test;
import org.semanticweb.owlapi.api.test.baseclasses.AbstractAxiomsRoundTrippingTestCase;
import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.util.OWLLiteralReplacer;
import org.semanticweb.owlapi.util.OWLObjectTransformer;

import com.google.common.base.Function;
import com.google.common.base.Predicate;

/**
 * @author Matthew Horridge, The University of Manchester, Information
 *         Management Group
 * @since 3.0.0
 */
@SuppressWarnings("javadoc")
public class TypedLiteralsTestCase extends AbstractAxiomsRoundTrippingTestCase {static class __CLR4_5_26el6ellvico16e{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,8344,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    OWLDataProperty prop = DataProperty(iri("p"));
    OWLNamedIndividual ind = NamedIndividual(iri("i"));

    @Nonnull
    @Override
    protected Set<? extends OWLAxiom> createAxioms() {try{__CLR4_5_26el6ellvico16e.R.inc(8301);
        __CLR4_5_26el6ellvico16e.R.inc(8302);Set<OWLAxiom> axioms = new HashSet<>();
        __CLR4_5_26el6ellvico16e.R.inc(8303);addAxiomForLiteral(Literal(3), axioms);
        __CLR4_5_26el6ellvico16e.R.inc(8304);addAxiomForLiteral(Literal(33.3), axioms);
        __CLR4_5_26el6ellvico16e.R.inc(8305);addAxiomForLiteral(Literal(true), axioms);
        __CLR4_5_26el6ellvico16e.R.inc(8306);addAxiomForLiteral(Literal(33.3f), axioms);
        __CLR4_5_26el6ellvico16e.R.inc(8307);addAxiomForLiteral(Literal("33.3"), axioms);
        __CLR4_5_26el6ellvico16e.R.inc(8308);return axioms;
    }finally{__CLR4_5_26el6ellvico16e.R.flushNeeded();}}

    private void addAxiomForLiteral(@Nonnull OWLLiteral lit, @Nonnull Set<OWLAxiom> axioms) {try{__CLR4_5_26el6ellvico16e.R.inc(8309);
        __CLR4_5_26el6ellvico16e.R.inc(8310);axioms.add(DataPropertyAssertion(prop, ind, lit));
    }finally{__CLR4_5_26el6ellvico16e.R.flushNeeded();}}

    @Test
    public void shouldReplaceLiterals() {__CLR4_5_26el6ellvico16e.R.globalSliceStart(getClass().getName(),8311);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_264hdkc6ev();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_26el6ellvico16e.R.rethrow($CLV_t2$);}finally{__CLR4_5_26el6ellvico16e.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.literals.TypedLiteralsTestCase.shouldReplaceLiterals",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),8311,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_264hdkc6ev(){try{__CLR4_5_26el6ellvico16e.R.inc(8311);
        __CLR4_5_26el6ellvico16e.R.inc(8312);OWLOntology o = getOnt();
        __CLR4_5_26el6ellvico16e.R.inc(8313);OWLLiteralReplacer replacer = new OWLLiteralReplacer(o.getOWLOntologyManager(), Collections.singleton(o));
        __CLR4_5_26el6ellvico16e.R.inc(8314);Map<OWLLiteral, OWLLiteral> replacements = new HashMap<>();
        __CLR4_5_26el6ellvico16e.R.inc(8315);replacements.put(Literal(true), Literal(false));
        __CLR4_5_26el6ellvico16e.R.inc(8316);replacements.put(Literal(3), Literal(4));
        __CLR4_5_26el6ellvico16e.R.inc(8317);List<OWLOntologyChange> results = replacer.changeLiterals(replacements);
        __CLR4_5_26el6ellvico16e.R.inc(8318);assertTrue(results.contains(new AddAxiom(o, DataPropertyAssertion(prop, ind, Literal(4)))));
        __CLR4_5_26el6ellvico16e.R.inc(8319);assertTrue(results.contains(new AddAxiom(o, DataPropertyAssertion(prop, ind, Literal(false)))));
        __CLR4_5_26el6ellvico16e.R.inc(8320);assertTrue(results.contains(new RemoveAxiom(o, DataPropertyAssertion(prop, ind, Literal(3)))));
        __CLR4_5_26el6ellvico16e.R.inc(8321);assertTrue(results.contains(new RemoveAxiom(o, DataPropertyAssertion(prop, ind, Literal(true)))));
        __CLR4_5_26el6ellvico16e.R.inc(8322);assertEquals(4, results.size());
    }finally{__CLR4_5_26el6ellvico16e.R.flushNeeded();}}

    @Test
    public void shouldReplaceLiteralsWithTransformer() {__CLR4_5_26el6ellvico16e.R.globalSliceStart(getClass().getName(),8323);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22a188l6f7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_26el6ellvico16e.R.rethrow($CLV_t2$);}finally{__CLR4_5_26el6ellvico16e.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.literals.TypedLiteralsTestCase.shouldReplaceLiteralsWithTransformer",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),8323,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22a188l6f7(){try{__CLR4_5_26el6ellvico16e.R.inc(8323);
        __CLR4_5_26el6ellvico16e.R.inc(8324);OWLOntology o = getOnt();
        __CLR4_5_26el6ellvico16e.R.inc(8325);final Map<OWLLiteral, OWLLiteral> replacements = new HashMap<>();
        __CLR4_5_26el6ellvico16e.R.inc(8326);replacements.put(Literal(true), Literal(false));
        __CLR4_5_26el6ellvico16e.R.inc(8327);replacements.put(Literal(3), Literal(4));
        __CLR4_5_26el6ellvico16e.R.inc(8328);OWLObjectTransformer<OWLLiteral> replacer = new OWLObjectTransformer<>(new Predicate<Object>() {

            @Override
            public boolean apply(Object input) {try{__CLR4_5_26el6ellvico16e.R.inc(8329);
                __CLR4_5_26el6ellvico16e.R.inc(8330);return true;
            }finally{__CLR4_5_26el6ellvico16e.R.flushNeeded();}}
        }, new Function<OWLLiteral, OWLLiteral>() {

            @Override
            public OWLLiteral apply(OWLLiteral input) {try{__CLR4_5_26el6ellvico16e.R.inc(8331);
                __CLR4_5_26el6ellvico16e.R.inc(8332);OWLLiteral l = replacements.get(input);
                __CLR4_5_26el6ellvico16e.R.inc(8333);if ((((l == null)&&(__CLR4_5_26el6ellvico16e.R.iget(8334)!=0|true))||(__CLR4_5_26el6ellvico16e.R.iget(8335)==0&false))) {{
                    __CLR4_5_26el6ellvico16e.R.inc(8336);return input;
                }
                }__CLR4_5_26el6ellvico16e.R.inc(8337);return l;
            }finally{__CLR4_5_26el6ellvico16e.R.flushNeeded();}}
        }, df, OWLLiteral.class);
        __CLR4_5_26el6ellvico16e.R.inc(8338);List<OWLOntologyChange> results = replacer.change(o);
        __CLR4_5_26el6ellvico16e.R.inc(8339);assertTrue(results.contains(new AddAxiom(o, DataPropertyAssertion(prop, ind, Literal(4)))));
        __CLR4_5_26el6ellvico16e.R.inc(8340);assertTrue(results.contains(new AddAxiom(o, DataPropertyAssertion(prop, ind, Literal(false)))));
        __CLR4_5_26el6ellvico16e.R.inc(8341);assertTrue(results.contains(new RemoveAxiom(o, DataPropertyAssertion(prop, ind, Literal(3)))));
        __CLR4_5_26el6ellvico16e.R.inc(8342);assertTrue(results.contains(new RemoveAxiom(o, DataPropertyAssertion(prop, ind, Literal(true)))));
        __CLR4_5_26el6ellvico16e.R.inc(8343);assertEquals(4, results.size());
    }finally{__CLR4_5_26el6ellvico16e.R.flushNeeded();}}
}
