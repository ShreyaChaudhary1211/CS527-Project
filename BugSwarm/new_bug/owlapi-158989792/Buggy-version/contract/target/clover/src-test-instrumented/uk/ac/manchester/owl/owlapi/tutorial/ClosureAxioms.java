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
package uk.ac.manchester.owl.owlapi.tutorial;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.model.AddAxiom;
import org.semanticweb.owlapi.model.AxiomType;
import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLClassAxiom;
import org.semanticweb.owlapi.model.OWLClassExpression;
import org.semanticweb.owlapi.model.OWLDataFactory;
import org.semanticweb.owlapi.model.OWLObjectPropertyExpression;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyManager;
import org.semanticweb.owlapi.model.OWLSubClassOfAxiom;

/**
 * This class demonstrates some aspects of the OWL API. Given a class in an
 * ontology, it will determine the subclass axioms that define the class. For
 * each of these, if the superclass is a conjunction of existential
 * restrictions, then an additional subclass axiom will be added to the
 * ontology, "closing" the restrictions.
 * 
 * @author Sean Bechhofer, The University Of Manchester, Information Management
 *         Group
 * @since 2.0.0
 */
@SuppressWarnings("javadoc")
public class ClosureAxioms {public static class __CLR4_5_2bujbujlvico2fc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,15381,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Nonnull
    private final OWLOntologyManager manager;
    @Nonnull
    private final OWLOntology ontology;
    private final OWLDataFactory factory;

    public ClosureAxioms(@Nonnull OWLOntologyManager manager,
            @Nonnull OWLOntology ontology) {try{__CLR4_5_2bujbujlvico2fc.R.inc(15355);
        __CLR4_5_2bujbujlvico2fc.R.inc(15356);this.manager = manager;
        __CLR4_5_2bujbujlvico2fc.R.inc(15357);this.ontology = ontology;
        __CLR4_5_2bujbujlvico2fc.R.inc(15358);factory = manager.getOWLDataFactory();
    }finally{__CLR4_5_2bujbujlvico2fc.R.flushNeeded();}}

    public void addClosureAxioms(@Nonnull OWLClass clazz) {try{__CLR4_5_2bujbujlvico2fc.R.inc(15359);
        /* Get the class axioms */
        __CLR4_5_2bujbujlvico2fc.R.inc(15360);Set<OWLSubClassOfAxiom> axioms = ontology
                .getAxioms(AxiomType.SUBCLASS_OF);
        /* Collect those that assert superclasses of the class */
        __CLR4_5_2bujbujlvico2fc.R.inc(15361);SubClassCollector collector = new SubClassCollector(clazz);
        __CLR4_5_2bujbujlvico2fc.R.inc(15362);for (OWLClassAxiom axiom : axioms) {{
            __CLR4_5_2bujbujlvico2fc.R.inc(15363);axiom.accept(collector);
        }
        }__CLR4_5_2bujbujlvico2fc.R.inc(15364);Map<OWLObjectPropertyExpression, Set<OWLClassExpression>> restrictions = new HashMap<>();
        /* For each axiom.... */
        __CLR4_5_2bujbujlvico2fc.R.inc(15365);for (OWLSubClassOfAxiom axiom : collector.getAxioms()) {{
            /* Get the superclass */
            __CLR4_5_2bujbujlvico2fc.R.inc(15366);OWLClassExpression superClass = axiom.getSuperClass();
            /* Collect any existentials */
            __CLR4_5_2bujbujlvico2fc.R.inc(15367);ExistentialCollector ec = new ExistentialCollector(restrictions);
            __CLR4_5_2bujbujlvico2fc.R.inc(15368);superClass.accept(ec);
        }
        /* For any existentials.... */
        }__CLR4_5_2bujbujlvico2fc.R.inc(15369);for (OWLObjectPropertyExpression prop : restrictions.keySet()) {{
            assert (((prop != null)&&(__CLR4_5_2bujbujlvico2fc.R.iget(15370)!=0|true))||(__CLR4_5_2bujbujlvico2fc.R.iget(15371)==0&false));
            __CLR4_5_2bujbujlvico2fc.R.inc(15372);System.out.println("prop: " + prop);
            __CLR4_5_2bujbujlvico2fc.R.inc(15373);Set<OWLClassExpression> fillers = restrictions.get(prop);
            __CLR4_5_2bujbujlvico2fc.R.inc(15374);for (OWLClassExpression filler : fillers) {{
                __CLR4_5_2bujbujlvico2fc.R.inc(15375);System.out.println("------> " + filler);
            }
            /* Create a union of the fillers */
            }__CLR4_5_2bujbujlvico2fc.R.inc(15376);OWLClassExpression union = factory.getOWLObjectUnionOf(fillers);
            /* Create a universal restriction */
            __CLR4_5_2bujbujlvico2fc.R.inc(15377);OWLClassExpression universal = factory.getOWLObjectAllValuesFrom(
                    prop, union);
            /* Create a new axiom */
            __CLR4_5_2bujbujlvico2fc.R.inc(15378);OWLAxiom newAxiom = factory.getOWLSubClassOfAxiom(clazz, universal);
            /* Now add the axiom to the ontology */
            __CLR4_5_2bujbujlvico2fc.R.inc(15379);AddAxiom addAxiom = new AddAxiom(ontology, newAxiom);
            /* Use the manager to apply the change */
            __CLR4_5_2bujbujlvico2fc.R.inc(15380);manager.applyChange(addAxiom);
        }
    }}finally{__CLR4_5_2bujbujlvico2fc.R.flushNeeded();}}
}
