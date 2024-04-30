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

import static org.semanticweb.owlapi.util.OWLAPIPreconditions.checkNotNull;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.util.CollectionFactory;

/**
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.0.0
 */
public class OWLDisjointUnionAxiomImpl extends OWLClassAxiomImpl implements
    OWLDisjointUnionAxiom {public static class __CLR4_5_24h64h6lviclfqz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u006d\u0070\u006c\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237243416L,8589935092L,5861,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 40000L;
    @Nonnull
    private final OWLClass owlClass;
    @Nonnull
    private final List<OWLClassExpression> classExpressions;

    /**
     * @param owlClass
     *        union
     * @param classExpressions
     *        disjoint classes
     * @param annotations
     *        annotations
     */
    public OWLDisjointUnionAxiomImpl(@Nonnull OWLClass owlClass,
        @Nonnull Set<? extends OWLClassExpression> classExpressions,
        @Nonnull Set<? extends OWLAnnotation> annotations) {
        super(annotations);__CLR4_5_24h64h6lviclfqz.R.inc(5803);try{__CLR4_5_24h64h6lviclfqz.R.inc(5802);
        __CLR4_5_24h64h6lviclfqz.R.inc(5804);this.owlClass = checkNotNull(owlClass, "owlClass cannot be null");
        __CLR4_5_24h64h6lviclfqz.R.inc(5805);checkNotNull(classExpressions,
            "classExpressions cannot be null");
        __CLR4_5_24h64h6lviclfqz.R.inc(5806);this.classExpressions = CollectionFactory.sortOptionally((Set<OWLClassExpression>) classExpressions);
    }finally{__CLR4_5_24h64h6lviclfqz.R.flushNeeded();}}

    @Override
    public Set<OWLClassExpression> getClassExpressions() {try{__CLR4_5_24h64h6lviclfqz.R.inc(5807);
        __CLR4_5_24h64h6lviclfqz.R.inc(5808);return CollectionFactory
            .getCopyOnRequestSetFromImmutableCollection(classExpressions);
    }finally{__CLR4_5_24h64h6lviclfqz.R.flushNeeded();}}

    @Override
    public OWLDisjointUnionAxiom getAxiomWithoutAnnotations() {try{__CLR4_5_24h64h6lviclfqz.R.inc(5809);
        __CLR4_5_24h64h6lviclfqz.R.inc(5810);if ((((!isAnnotated())&&(__CLR4_5_24h64h6lviclfqz.R.iget(5811)!=0|true))||(__CLR4_5_24h64h6lviclfqz.R.iget(5812)==0&false))) {{
            __CLR4_5_24h64h6lviclfqz.R.inc(5813);return this;
        }
        }__CLR4_5_24h64h6lviclfqz.R.inc(5814);return new OWLDisjointUnionAxiomImpl(getOWLClass(),
            getClassExpressions(), NO_ANNOTATIONS);
    }finally{__CLR4_5_24h64h6lviclfqz.R.flushNeeded();}}

    @Override
    public OWLDisjointUnionAxiom getAnnotatedAxiom(
        Set<OWLAnnotation> annotations) {try{__CLR4_5_24h64h6lviclfqz.R.inc(5815);
        __CLR4_5_24h64h6lviclfqz.R.inc(5816);return new OWLDisjointUnionAxiomImpl(getOWLClass(),
            getClassExpressions(), mergeAnnos(annotations));
    }finally{__CLR4_5_24h64h6lviclfqz.R.flushNeeded();}}

    @Override
    public OWLClass getOWLClass() {try{__CLR4_5_24h64h6lviclfqz.R.inc(5817);
        __CLR4_5_24h64h6lviclfqz.R.inc(5818);return owlClass;
    }finally{__CLR4_5_24h64h6lviclfqz.R.flushNeeded();}}

    @Override
    public boolean equals(Object obj) {try{__CLR4_5_24h64h6lviclfqz.R.inc(5819);
        __CLR4_5_24h64h6lviclfqz.R.inc(5820);if ((((this == obj)&&(__CLR4_5_24h64h6lviclfqz.R.iget(5821)!=0|true))||(__CLR4_5_24h64h6lviclfqz.R.iget(5822)==0&false))) {{
            __CLR4_5_24h64h6lviclfqz.R.inc(5823);return true;
        }
        }__CLR4_5_24h64h6lviclfqz.R.inc(5824);if ((((!super.equals(obj))&&(__CLR4_5_24h64h6lviclfqz.R.iget(5825)!=0|true))||(__CLR4_5_24h64h6lviclfqz.R.iget(5826)==0&false))) {{
            __CLR4_5_24h64h6lviclfqz.R.inc(5827);return false;
        }
        // superclass is responsible for null, identity, owlaxiom type and
        // annotations
        }__CLR4_5_24h64h6lviclfqz.R.inc(5828);if ((((!(obj instanceof OWLDisjointUnionAxiom))&&(__CLR4_5_24h64h6lviclfqz.R.iget(5829)!=0|true))||(__CLR4_5_24h64h6lviclfqz.R.iget(5830)==0&false))) {{
            __CLR4_5_24h64h6lviclfqz.R.inc(5831);return false;
        }
        }__CLR4_5_24h64h6lviclfqz.R.inc(5832);if ((((obj instanceof OWLDisjointUnionAxiomImpl)&&(__CLR4_5_24h64h6lviclfqz.R.iget(5833)!=0|true))||(__CLR4_5_24h64h6lviclfqz.R.iget(5834)==0&false))) {{
            __CLR4_5_24h64h6lviclfqz.R.inc(5835);OWLDisjointUnionAxiomImpl other = (OWLDisjointUnionAxiomImpl) obj;
            __CLR4_5_24h64h6lviclfqz.R.inc(5836);return owlClass.equals(other.owlClass) && classExpressions.equals(other.classExpressions);
        }
        }__CLR4_5_24h64h6lviclfqz.R.inc(5837);OWLDisjointUnionAxiom other = (OWLDisjointUnionAxiom) obj;
        __CLR4_5_24h64h6lviclfqz.R.inc(5838);return other.getOWLClass().equals(owlClass) && other.getClassExpressions().equals(getClassExpressions());
    }finally{__CLR4_5_24h64h6lviclfqz.R.flushNeeded();}}

    @Override
    public void accept(OWLAxiomVisitor visitor) {try{__CLR4_5_24h64h6lviclfqz.R.inc(5839);
        __CLR4_5_24h64h6lviclfqz.R.inc(5840);visitor.visit(this);
    }finally{__CLR4_5_24h64h6lviclfqz.R.flushNeeded();}}

    @Override
    public void accept(OWLObjectVisitor visitor) {try{__CLR4_5_24h64h6lviclfqz.R.inc(5841);
        __CLR4_5_24h64h6lviclfqz.R.inc(5842);visitor.visit(this);
    }finally{__CLR4_5_24h64h6lviclfqz.R.flushNeeded();}}

    @Override
    public <O> O accept(OWLAxiomVisitorEx<O> visitor) {try{__CLR4_5_24h64h6lviclfqz.R.inc(5843);
        __CLR4_5_24h64h6lviclfqz.R.inc(5844);return visitor.visit(this);
    }finally{__CLR4_5_24h64h6lviclfqz.R.flushNeeded();}}

    @Override
    public <O> O accept(OWLObjectVisitorEx<O> visitor) {try{__CLR4_5_24h64h6lviclfqz.R.inc(5845);
        __CLR4_5_24h64h6lviclfqz.R.inc(5846);return visitor.visit(this);
    }finally{__CLR4_5_24h64h6lviclfqz.R.flushNeeded();}}

    @Override
    public AxiomType<?> getAxiomType() {try{__CLR4_5_24h64h6lviclfqz.R.inc(5847);
        __CLR4_5_24h64h6lviclfqz.R.inc(5848);return AxiomType.DISJOINT_UNION;
    }finally{__CLR4_5_24h64h6lviclfqz.R.flushNeeded();}}

    @Override
    public OWLEquivalentClassesAxiom getOWLEquivalentClassesAxiom() {try{__CLR4_5_24h64h6lviclfqz.R.inc(5849);
        __CLR4_5_24h64h6lviclfqz.R.inc(5850);return new OWLEquivalentClassesAxiomImpl(new HashSet<>(Arrays.asList(
            owlClass, new OWLObjectUnionOfImpl(getClassExpressions()))),
            NO_ANNOTATIONS);
    }finally{__CLR4_5_24h64h6lviclfqz.R.flushNeeded();}}

    @Override
    public OWLDisjointClassesAxiom getOWLDisjointClassesAxiom() {try{__CLR4_5_24h64h6lviclfqz.R.inc(5851);
        __CLR4_5_24h64h6lviclfqz.R.inc(5852);return new OWLDisjointClassesAxiomImpl(getClassExpressions(),
            NO_ANNOTATIONS);
    }finally{__CLR4_5_24h64h6lviclfqz.R.flushNeeded();}}

    @Override
    protected int compareObjectOfSameType(OWLObject object) {try{__CLR4_5_24h64h6lviclfqz.R.inc(5853);
        __CLR4_5_24h64h6lviclfqz.R.inc(5854);OWLDisjointUnionAxiom other = (OWLDisjointUnionAxiom) object;
        __CLR4_5_24h64h6lviclfqz.R.inc(5855);int diff = owlClass.compareTo(other.getOWLClass());
        __CLR4_5_24h64h6lviclfqz.R.inc(5856);if ((((diff != 0)&&(__CLR4_5_24h64h6lviclfqz.R.iget(5857)!=0|true))||(__CLR4_5_24h64h6lviclfqz.R.iget(5858)==0&false))) {{
            __CLR4_5_24h64h6lviclfqz.R.inc(5859);return diff;
        }
        }__CLR4_5_24h64h6lviclfqz.R.inc(5860);return compareSets(classExpressions, other.getClassExpressions());
    }finally{__CLR4_5_24h64h6lviclfqz.R.flushNeeded();}}
}
