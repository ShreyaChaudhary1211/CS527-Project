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

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.util.OWLObjectTypeIndexProvider;
import org.semanticweb.owlapi.vocab.SWRLBuiltInsVocabulary;

/**
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.0.0
 */
public class SWRLBuiltInAtomImpl extends SWRLAtomImpl implements SWRLBuiltInAtom {public static class __CLR4_5_293y93ylviclgu0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u006d\u0070\u006c\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237243416L,8589935092L,11863,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 40000L;
    @Nonnull
    private final List<SWRLDArgument> args;

    @Override
    protected int index() {try{__CLR4_5_293y93ylviclgu0.R.inc(11806);
        __CLR4_5_293y93ylviclgu0.R.inc(11807);return OWLObjectTypeIndexProvider.RULE_OBJECT_TYPE_INDEX_BASE + 5;
    }finally{__CLR4_5_293y93ylviclgu0.R.flushNeeded();}}

    /**
     * @param predicate
     *        predicate
     * @param args
     *        builtin argument
     */
    public SWRLBuiltInAtomImpl(@Nonnull IRI predicate, @Nonnull List<SWRLDArgument> args) {
        super(predicate);__CLR4_5_293y93ylviclgu0.R.inc(11809);try{__CLR4_5_293y93ylviclgu0.R.inc(11808);
        __CLR4_5_293y93ylviclgu0.R.inc(11810);this.args = new ArrayList<>(checkNotNull(args, "args cannot be null"));
    }finally{__CLR4_5_293y93ylviclgu0.R.flushNeeded();}}

    @Override
    public void addSignatureEntitiesToSet(Set<OWLEntity> entities) {try{__CLR4_5_293y93ylviclgu0.R.inc(11811);
        __CLR4_5_293y93ylviclgu0.R.inc(11812);for (SWRLDArgument arg : args) {{
            __CLR4_5_293y93ylviclgu0.R.inc(11813);addSignatureEntitiesToSetForValue(entities, arg);
        }
    }}finally{__CLR4_5_293y93ylviclgu0.R.flushNeeded();}}

    @Override
    public void addAnonymousIndividualsToSet(Set<OWLAnonymousIndividual> anons) {try{__CLR4_5_293y93ylviclgu0.R.inc(11814);
        __CLR4_5_293y93ylviclgu0.R.inc(11815);for (SWRLDArgument arg : args) {{
            __CLR4_5_293y93ylviclgu0.R.inc(11816);addAnonymousIndividualsToSetForValue(anons, arg);
        }
    }}finally{__CLR4_5_293y93ylviclgu0.R.flushNeeded();}}

    @Override
    public IRI getPredicate() {try{__CLR4_5_293y93ylviclgu0.R.inc(11817);
        __CLR4_5_293y93ylviclgu0.R.inc(11818);return (IRI) super.getPredicate();
    }finally{__CLR4_5_293y93ylviclgu0.R.flushNeeded();}}

    @Override
    public boolean isCoreBuiltIn() {try{__CLR4_5_293y93ylviclgu0.R.inc(11819);
        __CLR4_5_293y93ylviclgu0.R.inc(11820);return SWRLBuiltInsVocabulary.getBuiltIn(getPredicate()) != null;
    }finally{__CLR4_5_293y93ylviclgu0.R.flushNeeded();}}

    @Override
    public List<SWRLDArgument> getArguments() {try{__CLR4_5_293y93ylviclgu0.R.inc(11821);
        __CLR4_5_293y93ylviclgu0.R.inc(11822);return new ArrayList<>(args);
    }finally{__CLR4_5_293y93ylviclgu0.R.flushNeeded();}}

    @Override
    public Collection<SWRLArgument> getAllArguments() {try{__CLR4_5_293y93ylviclgu0.R.inc(11823);
        __CLR4_5_293y93ylviclgu0.R.inc(11824);return new ArrayList<SWRLArgument>(args);
    }finally{__CLR4_5_293y93ylviclgu0.R.flushNeeded();}}

    @Override
    public void accept(OWLObjectVisitor visitor) {try{__CLR4_5_293y93ylviclgu0.R.inc(11825);
        __CLR4_5_293y93ylviclgu0.R.inc(11826);visitor.visit(this);
    }finally{__CLR4_5_293y93ylviclgu0.R.flushNeeded();}}

    @Override
    public void accept(SWRLObjectVisitor visitor) {try{__CLR4_5_293y93ylviclgu0.R.inc(11827);
        __CLR4_5_293y93ylviclgu0.R.inc(11828);visitor.visit(this);
    }finally{__CLR4_5_293y93ylviclgu0.R.flushNeeded();}}

    @Override
    public <O> O accept(SWRLObjectVisitorEx<O> visitor) {try{__CLR4_5_293y93ylviclgu0.R.inc(11829);
        __CLR4_5_293y93ylviclgu0.R.inc(11830);return visitor.visit(this);
    }finally{__CLR4_5_293y93ylviclgu0.R.flushNeeded();}}

    @Override
    public <O> O accept(OWLObjectVisitorEx<O> visitor) {try{__CLR4_5_293y93ylviclgu0.R.inc(11831);
        __CLR4_5_293y93ylviclgu0.R.inc(11832);return visitor.visit(this);
    }finally{__CLR4_5_293y93ylviclgu0.R.flushNeeded();}}

    @Override
    public boolean equals(Object obj) {try{__CLR4_5_293y93ylviclgu0.R.inc(11833);
        __CLR4_5_293y93ylviclgu0.R.inc(11834);if ((((obj == this)&&(__CLR4_5_293y93ylviclgu0.R.iget(11835)!=0|true))||(__CLR4_5_293y93ylviclgu0.R.iget(11836)==0&false))) {{
            __CLR4_5_293y93ylviclgu0.R.inc(11837);return true;
        }
        }__CLR4_5_293y93ylviclgu0.R.inc(11838);if ((((!(obj instanceof SWRLBuiltInAtom))&&(__CLR4_5_293y93ylviclgu0.R.iget(11839)!=0|true))||(__CLR4_5_293y93ylviclgu0.R.iget(11840)==0&false))) {{
            __CLR4_5_293y93ylviclgu0.R.inc(11841);return false;
        }
        }__CLR4_5_293y93ylviclgu0.R.inc(11842);SWRLBuiltInAtom other = (SWRLBuiltInAtom) obj;
        __CLR4_5_293y93ylviclgu0.R.inc(11843);return other.getPredicate().equals(getPredicate()) && other.getArguments().equals(getArguments());
    }finally{__CLR4_5_293y93ylviclgu0.R.flushNeeded();}}

    @Override
    protected int compareObjectOfSameType(OWLObject object) {try{__CLR4_5_293y93ylviclgu0.R.inc(11844);
        __CLR4_5_293y93ylviclgu0.R.inc(11845);SWRLBuiltInAtom other = (SWRLBuiltInAtom) object;
        __CLR4_5_293y93ylviclgu0.R.inc(11846);int diff = getPredicate().compareTo(other.getPredicate());
        __CLR4_5_293y93ylviclgu0.R.inc(11847);if ((((diff != 0)&&(__CLR4_5_293y93ylviclgu0.R.iget(11848)!=0|true))||(__CLR4_5_293y93ylviclgu0.R.iget(11849)==0&false))) {{
            __CLR4_5_293y93ylviclgu0.R.inc(11850);return diff;
        }
        }__CLR4_5_293y93ylviclgu0.R.inc(11851);List<SWRLDArgument> otherArgs = other.getArguments();
        __CLR4_5_293y93ylviclgu0.R.inc(11852);int i = 0;
        __CLR4_5_293y93ylviclgu0.R.inc(11853);while ((((i < args.size() && i < otherArgs.size())&&(__CLR4_5_293y93ylviclgu0.R.iget(11854)!=0|true))||(__CLR4_5_293y93ylviclgu0.R.iget(11855)==0&false))) {{
            __CLR4_5_293y93ylviclgu0.R.inc(11856);diff = args.get(i).compareTo(otherArgs.get(i));
            __CLR4_5_293y93ylviclgu0.R.inc(11857);if ((((diff != 0)&&(__CLR4_5_293y93ylviclgu0.R.iget(11858)!=0|true))||(__CLR4_5_293y93ylviclgu0.R.iget(11859)==0&false))) {{
                __CLR4_5_293y93ylviclgu0.R.inc(11860);return diff;
            }
            }__CLR4_5_293y93ylviclgu0.R.inc(11861);i++;
        }
        }__CLR4_5_293y93ylviclgu0.R.inc(11862);return args.size() - otherArgs.size();
    }finally{__CLR4_5_293y93ylviclgu0.R.flushNeeded();}}
}
