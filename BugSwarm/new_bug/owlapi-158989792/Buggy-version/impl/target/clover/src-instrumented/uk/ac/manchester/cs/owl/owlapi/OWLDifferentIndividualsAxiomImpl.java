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
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.model.AxiomType;
import org.semanticweb.owlapi.model.OWLAnnotation;
import org.semanticweb.owlapi.model.OWLAxiomVisitor;
import org.semanticweb.owlapi.model.OWLAxiomVisitorEx;
import org.semanticweb.owlapi.model.OWLClassExpression;
import org.semanticweb.owlapi.model.OWLDifferentIndividualsAxiom;
import org.semanticweb.owlapi.model.OWLIndividual;
import org.semanticweb.owlapi.model.OWLObjectVisitor;
import org.semanticweb.owlapi.model.OWLObjectVisitorEx;
import org.semanticweb.owlapi.model.OWLSubClassOfAxiom;
import org.semanticweb.owlapi.util.CollectionFactory;

/**
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.0.0
 */
public class OWLDifferentIndividualsAxiomImpl extends
        OWLNaryIndividualAxiomImpl implements OWLDifferentIndividualsAxiom {public static class __CLR4_5_249x49xlviclfq0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u006d\u0070\u006c\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237243416L,8589935092L,5626,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 40000L;

    /**
     * @param individuals
     *        individuals
     * @param annotations
     *        annotations on the axiom
     */
    public OWLDifferentIndividualsAxiomImpl(
            @Nonnull Set<? extends OWLIndividual> individuals,
            @Nonnull Set<? extends OWLAnnotation> annotations) {
        super(individuals, annotations);__CLR4_5_249x49xlviclfq0.R.inc(5542);try{__CLR4_5_249x49xlviclfq0.R.inc(5541);
    }finally{__CLR4_5_249x49xlviclfq0.R.flushNeeded();}}

    @Override
    public OWLDifferentIndividualsAxiom getAxiomWithoutAnnotations() {try{__CLR4_5_249x49xlviclfq0.R.inc(5543);
        __CLR4_5_249x49xlviclfq0.R.inc(5544);if ((((!isAnnotated())&&(__CLR4_5_249x49xlviclfq0.R.iget(5545)!=0|true))||(__CLR4_5_249x49xlviclfq0.R.iget(5546)==0&false))) {{
            __CLR4_5_249x49xlviclfq0.R.inc(5547);return this;
        }
        }__CLR4_5_249x49xlviclfq0.R.inc(5548);return new OWLDifferentIndividualsAxiomImpl(getIndividuals(),
                NO_ANNOTATIONS);
    }finally{__CLR4_5_249x49xlviclfq0.R.flushNeeded();}}

    @Override
    public OWLDifferentIndividualsAxiom getAnnotatedAxiom(
            Set<OWLAnnotation> annotations) {try{__CLR4_5_249x49xlviclfq0.R.inc(5549);
        __CLR4_5_249x49xlviclfq0.R.inc(5550);return new OWLDifferentIndividualsAxiomImpl(getIndividuals(),
                mergeAnnos(annotations));
    }finally{__CLR4_5_249x49xlviclfq0.R.flushNeeded();}}

    @Override
    public Set<OWLDifferentIndividualsAxiom> asPairwiseAxioms() {try{__CLR4_5_249x49xlviclfq0.R.inc(5551);
        __CLR4_5_249x49xlviclfq0.R.inc(5552);List<OWLIndividual> individuals = getIndividualsAsList();
        __CLR4_5_249x49xlviclfq0.R.inc(5553);Set<OWLDifferentIndividualsAxiom> result = new HashSet<>();
        __CLR4_5_249x49xlviclfq0.R.inc(5554);for (int i = 0; (((i < individuals.size() - 1)&&(__CLR4_5_249x49xlviclfq0.R.iget(5555)!=0|true))||(__CLR4_5_249x49xlviclfq0.R.iget(5556)==0&false)); i++) {{
            __CLR4_5_249x49xlviclfq0.R.inc(5557);for (int j = i + 1; (((j < individuals.size())&&(__CLR4_5_249x49xlviclfq0.R.iget(5558)!=0|true))||(__CLR4_5_249x49xlviclfq0.R.iget(5559)==0&false)); j++) {{
                __CLR4_5_249x49xlviclfq0.R.inc(5560);OWLIndividual indI = individuals.get(i);
                __CLR4_5_249x49xlviclfq0.R.inc(5561);OWLIndividual indJ = individuals.get(j);
                __CLR4_5_249x49xlviclfq0.R.inc(5562);result.add(new OWLDifferentIndividualsAxiomImpl(new HashSet<>(
                        Arrays.asList(indI, indJ)), NO_ANNOTATIONS));
            }
        }}
        }__CLR4_5_249x49xlviclfq0.R.inc(5563);return result;
    }finally{__CLR4_5_249x49xlviclfq0.R.flushNeeded();}}

    @Override
    public Set<OWLDifferentIndividualsAxiom> splitToAnnotatedPairs() {try{__CLR4_5_249x49xlviclfq0.R.inc(5564);
        __CLR4_5_249x49xlviclfq0.R.inc(5565);List<OWLIndividual> individuals = getIndividualsAsList();
        __CLR4_5_249x49xlviclfq0.R.inc(5566);if ((((individuals.size() == 2)&&(__CLR4_5_249x49xlviclfq0.R.iget(5567)!=0|true))||(__CLR4_5_249x49xlviclfq0.R.iget(5568)==0&false))) {{
            __CLR4_5_249x49xlviclfq0.R.inc(5569);return Collections.<OWLDifferentIndividualsAxiom> singleton(this);
        }
        }__CLR4_5_249x49xlviclfq0.R.inc(5570);Set<OWLDifferentIndividualsAxiom> result = new HashSet<>();
        __CLR4_5_249x49xlviclfq0.R.inc(5571);for (int i = 0; (((i < individuals.size() - 1)&&(__CLR4_5_249x49xlviclfq0.R.iget(5572)!=0|true))||(__CLR4_5_249x49xlviclfq0.R.iget(5573)==0&false)); i++) {{
            __CLR4_5_249x49xlviclfq0.R.inc(5574);OWLIndividual indI = individuals.get(i);
            __CLR4_5_249x49xlviclfq0.R.inc(5575);OWLIndividual indJ = individuals.get(i + 1);
            __CLR4_5_249x49xlviclfq0.R.inc(5576);result.add(new OWLDifferentIndividualsAxiomImpl(new HashSet<>(
                    Arrays.asList(indI, indJ)), getAnnotations()));
        }
        }__CLR4_5_249x49xlviclfq0.R.inc(5577);return result;
    }finally{__CLR4_5_249x49xlviclfq0.R.flushNeeded();}}

    @Override
    public boolean containsAnonymousIndividuals() {try{__CLR4_5_249x49xlviclfq0.R.inc(5578);
        __CLR4_5_249x49xlviclfq0.R.inc(5579);for (OWLIndividual ind : getIndividuals()) {{
            __CLR4_5_249x49xlviclfq0.R.inc(5580);if ((((ind.isAnonymous())&&(__CLR4_5_249x49xlviclfq0.R.iget(5581)!=0|true))||(__CLR4_5_249x49xlviclfq0.R.iget(5582)==0&false))) {{
                __CLR4_5_249x49xlviclfq0.R.inc(5583);return true;
            }
        }}
        }__CLR4_5_249x49xlviclfq0.R.inc(5584);return false;
    }finally{__CLR4_5_249x49xlviclfq0.R.flushNeeded();}}

    @Override
    public boolean equals(Object obj) {try{__CLR4_5_249x49xlviclfq0.R.inc(5585);
        __CLR4_5_249x49xlviclfq0.R.inc(5586);if ((((this == obj)&&(__CLR4_5_249x49xlviclfq0.R.iget(5587)!=0|true))||(__CLR4_5_249x49xlviclfq0.R.iget(5588)==0&false))) {{
            __CLR4_5_249x49xlviclfq0.R.inc(5589);return true;
        }
        }__CLR4_5_249x49xlviclfq0.R.inc(5590);if ((((!super.equals(obj))&&(__CLR4_5_249x49xlviclfq0.R.iget(5591)!=0|true))||(__CLR4_5_249x49xlviclfq0.R.iget(5592)==0&false))) {{
            __CLR4_5_249x49xlviclfq0.R.inc(5593);return false;
        }
        }__CLR4_5_249x49xlviclfq0.R.inc(5594);return obj instanceof OWLDifferentIndividualsAxiom;
    }finally{__CLR4_5_249x49xlviclfq0.R.flushNeeded();}}

    @Override
    public Set<OWLSubClassOfAxiom> asOWLSubClassOfAxioms() {try{__CLR4_5_249x49xlviclfq0.R.inc(5595);
        __CLR4_5_249x49xlviclfq0.R.inc(5596);List<OWLClassExpression> nominalsList = new ArrayList<>();
        __CLR4_5_249x49xlviclfq0.R.inc(5597);for (OWLIndividual individual : getIndividuals()) {{
            assert (((individual != null)&&(__CLR4_5_249x49xlviclfq0.R.iget(5598)!=0|true))||(__CLR4_5_249x49xlviclfq0.R.iget(5599)==0&false));
            __CLR4_5_249x49xlviclfq0.R.inc(5600);nominalsList.add(new OWLObjectOneOfImpl(CollectionFactory
                    .createSet(individual)));
        }
        }__CLR4_5_249x49xlviclfq0.R.inc(5601);Set<OWLSubClassOfAxiom> result = new HashSet<>();
        __CLR4_5_249x49xlviclfq0.R.inc(5602);for (int i = 0; (((i < nominalsList.size() - 1)&&(__CLR4_5_249x49xlviclfq0.R.iget(5603)!=0|true))||(__CLR4_5_249x49xlviclfq0.R.iget(5604)==0&false)); i++) {{
            __CLR4_5_249x49xlviclfq0.R.inc(5605);for (int j = i + 1; (((j < nominalsList.size())&&(__CLR4_5_249x49xlviclfq0.R.iget(5606)!=0|true))||(__CLR4_5_249x49xlviclfq0.R.iget(5607)==0&false)); j++) {{
                __CLR4_5_249x49xlviclfq0.R.inc(5608);OWLClassExpression ceI = nominalsList.get(i);
                __CLR4_5_249x49xlviclfq0.R.inc(5609);OWLClassExpression ceJ = nominalsList.get(j)
                        .getObjectComplementOf();
                assert (((ceI != null)&&(__CLR4_5_249x49xlviclfq0.R.iget(5610)!=0|true))||(__CLR4_5_249x49xlviclfq0.R.iget(5611)==0&false));
                assert (((ceJ != null)&&(__CLR4_5_249x49xlviclfq0.R.iget(5612)!=0|true))||(__CLR4_5_249x49xlviclfq0.R.iget(5613)==0&false));
                __CLR4_5_249x49xlviclfq0.R.inc(5614);result.add(new OWLSubClassOfAxiomImpl(ceI, ceJ, NO_ANNOTATIONS));
            }
        }}
        }__CLR4_5_249x49xlviclfq0.R.inc(5615);return result;
    }finally{__CLR4_5_249x49xlviclfq0.R.flushNeeded();}}

    @Override
    public void accept(OWLAxiomVisitor visitor) {try{__CLR4_5_249x49xlviclfq0.R.inc(5616);
        __CLR4_5_249x49xlviclfq0.R.inc(5617);visitor.visit(this);
    }finally{__CLR4_5_249x49xlviclfq0.R.flushNeeded();}}

    @Override
    public void accept(OWLObjectVisitor visitor) {try{__CLR4_5_249x49xlviclfq0.R.inc(5618);
        __CLR4_5_249x49xlviclfq0.R.inc(5619);visitor.visit(this);
    }finally{__CLR4_5_249x49xlviclfq0.R.flushNeeded();}}

    @Override
    public <O> O accept(OWLAxiomVisitorEx<O> visitor) {try{__CLR4_5_249x49xlviclfq0.R.inc(5620);
        __CLR4_5_249x49xlviclfq0.R.inc(5621);return visitor.visit(this);
    }finally{__CLR4_5_249x49xlviclfq0.R.flushNeeded();}}

    @Override
    public <O> O accept(OWLObjectVisitorEx<O> visitor) {try{__CLR4_5_249x49xlviclfq0.R.inc(5622);
        __CLR4_5_249x49xlviclfq0.R.inc(5623);return visitor.visit(this);
    }finally{__CLR4_5_249x49xlviclfq0.R.flushNeeded();}}

    @Override
    public AxiomType<?> getAxiomType() {try{__CLR4_5_249x49xlviclfq0.R.inc(5624);
        __CLR4_5_249x49xlviclfq0.R.inc(5625);return AxiomType.DIFFERENT_INDIVIDUALS;
    }finally{__CLR4_5_249x49xlviclfq0.R.flushNeeded();}}
}
