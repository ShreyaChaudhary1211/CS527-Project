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

import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.model.AxiomType;
import org.semanticweb.owlapi.model.OWLAnnotation;
import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.OWLAxiomVisitor;
import org.semanticweb.owlapi.model.OWLAxiomVisitorEx;
import org.semanticweb.owlapi.model.OWLClassExpression;
import org.semanticweb.owlapi.model.OWLObject;
import org.semanticweb.owlapi.model.OWLObjectVisitor;
import org.semanticweb.owlapi.model.OWLObjectVisitorEx;
import org.semanticweb.owlapi.model.SWRLAtom;
import org.semanticweb.owlapi.model.SWRLBuiltInAtom;
import org.semanticweb.owlapi.model.SWRLClassAtom;
import org.semanticweb.owlapi.model.SWRLDataPropertyAtom;
import org.semanticweb.owlapi.model.SWRLDataRangeAtom;
import org.semanticweb.owlapi.model.SWRLDifferentIndividualsAtom;
import org.semanticweb.owlapi.model.SWRLIndividualArgument;
import org.semanticweb.owlapi.model.SWRLLiteralArgument;
import org.semanticweb.owlapi.model.SWRLObject;
import org.semanticweb.owlapi.model.SWRLObjectPropertyAtom;
import org.semanticweb.owlapi.model.SWRLObjectVisitor;
import org.semanticweb.owlapi.model.SWRLObjectVisitorEx;
import org.semanticweb.owlapi.model.SWRLRule;
import org.semanticweb.owlapi.model.SWRLSameIndividualAtom;
import org.semanticweb.owlapi.model.SWRLVariable;
import org.semanticweb.owlapi.util.CollectionFactory;
import org.semanticweb.owlapi.util.SWRLVariableExtractor;

/**
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.0.0
 */
public class SWRLRuleImpl extends OWLLogicalAxiomImplWithEntityAndAnonCaching
        implements SWRLRule {public static class __CLR4_5_29bf9bflviclguy{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u006d\u0070\u006c\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237243416L,8589935092L,12217,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 40000L;
    private final LinkedHashSet<SWRLAtom> head;
    private final LinkedHashSet<SWRLAtom> body;
    private final boolean containsAnonymousClassExpressions;
    private transient WeakReference<Set<SWRLVariable>> variables = null;
    private transient WeakReference<Set<OWLClassExpression>> classAtomsPredicates = null;

    private void readObject(java.io.ObjectInputStream stream)
            throws IOException, ClassNotFoundException {try{__CLR4_5_29bf9bflviclguy.R.inc(12075);
        __CLR4_5_29bf9bflviclguy.R.inc(12076);stream.defaultReadObject();
        __CLR4_5_29bf9bflviclguy.R.inc(12077);variables = null;
        __CLR4_5_29bf9bflviclguy.R.inc(12078);classAtomsPredicates = null;
    }finally{__CLR4_5_29bf9bflviclguy.R.flushNeeded();}}

    /**
     * @param body
     *        rule body
     * @param head
     *        rule head
     * @param annotations
     *        annotations on the axiom
     */
    public SWRLRuleImpl(@Nonnull Set<? extends SWRLAtom> body,
            @Nonnull Set<? extends SWRLAtom> head,
            @Nonnull Collection<? extends OWLAnnotation> annotations) {
        super(annotations);__CLR4_5_29bf9bflviclguy.R.inc(12080);try{__CLR4_5_29bf9bflviclguy.R.inc(12079);
        __CLR4_5_29bf9bflviclguy.R.inc(12081);this.head = new LinkedHashSet<>(checkNotNull(head,
                "head cannot be null"));
        __CLR4_5_29bf9bflviclguy.R.inc(12082);this.body = new LinkedHashSet<>(checkNotNull(body,
                "body cannot be null"));
        __CLR4_5_29bf9bflviclguy.R.inc(12083);containsAnonymousClassExpressions = hasAnon();
    }finally{__CLR4_5_29bf9bflviclguy.R.flushNeeded();}}

    @Override
    public SWRLRule getAxiomWithoutAnnotations() {try{__CLR4_5_29bf9bflviclguy.R.inc(12084);
        __CLR4_5_29bf9bflviclguy.R.inc(12085);if ((((!isAnnotated())&&(__CLR4_5_29bf9bflviclguy.R.iget(12086)!=0|true))||(__CLR4_5_29bf9bflviclguy.R.iget(12087)==0&false))) {{
            __CLR4_5_29bf9bflviclguy.R.inc(12088);return this;
        }
        }__CLR4_5_29bf9bflviclguy.R.inc(12089);return new SWRLRuleImpl(getBody(), getHead(), NO_ANNOTATIONS);
    }finally{__CLR4_5_29bf9bflviclguy.R.flushNeeded();}}

    @Override
    public OWLAxiom getAnnotatedAxiom(@Nonnull Set<OWLAnnotation> annotations) {try{__CLR4_5_29bf9bflviclguy.R.inc(12090);
        __CLR4_5_29bf9bflviclguy.R.inc(12091);return new SWRLRuleImpl(getBody(), getHead(), annotations);
    }finally{__CLR4_5_29bf9bflviclguy.R.flushNeeded();}}

    /**
     * @param body
     *        rule body
     * @param head
     *        rule head
     */
    public SWRLRuleImpl(@Nonnull Set<? extends SWRLAtom> body,
            @Nonnull Set<? extends SWRLAtom> head) {
        this(body, head, NO_ANNOTATIONS);__CLR4_5_29bf9bflviclguy.R.inc(12093);try{__CLR4_5_29bf9bflviclguy.R.inc(12092);
    }finally{__CLR4_5_29bf9bflviclguy.R.flushNeeded();}}

    @Nonnull
    @Override
    public Set<SWRLVariable> getVariables() {try{__CLR4_5_29bf9bflviclguy.R.inc(12094);
        __CLR4_5_29bf9bflviclguy.R.inc(12095);Set<SWRLVariable> toReturn = null;
        __CLR4_5_29bf9bflviclguy.R.inc(12096);if ((((variables != null)&&(__CLR4_5_29bf9bflviclguy.R.iget(12097)!=0|true))||(__CLR4_5_29bf9bflviclguy.R.iget(12098)==0&false))) {{
            __CLR4_5_29bf9bflviclguy.R.inc(12099);toReturn = variables.get();
        }
        }__CLR4_5_29bf9bflviclguy.R.inc(12100);if ((((toReturn != null)&&(__CLR4_5_29bf9bflviclguy.R.iget(12101)!=0|true))||(__CLR4_5_29bf9bflviclguy.R.iget(12102)==0&false))) {{
            __CLR4_5_29bf9bflviclguy.R.inc(12103);return toReturn;
        }
        }__CLR4_5_29bf9bflviclguy.R.inc(12104);SWRLVariableExtractor extractor = new SWRLVariableExtractor();
        __CLR4_5_29bf9bflviclguy.R.inc(12105);accept(extractor);
        __CLR4_5_29bf9bflviclguy.R.inc(12106);toReturn = extractor.getVariables();
        __CLR4_5_29bf9bflviclguy.R.inc(12107);variables = new WeakReference<>(toReturn);
        __CLR4_5_29bf9bflviclguy.R.inc(12108);return toReturn;
    }finally{__CLR4_5_29bf9bflviclguy.R.flushNeeded();}}

    private boolean hasAnon() {try{__CLR4_5_29bf9bflviclguy.R.inc(12109);
        __CLR4_5_29bf9bflviclguy.R.inc(12110);for (SWRLAtom atom : head) {{
            __CLR4_5_29bf9bflviclguy.R.inc(12111);if ((((atom instanceof SWRLClassAtom
                    && ((SWRLClassAtom) atom).getPredicate().isAnonymous())&&(__CLR4_5_29bf9bflviclguy.R.iget(12112)!=0|true))||(__CLR4_5_29bf9bflviclguy.R.iget(12113)==0&false))) {{
                __CLR4_5_29bf9bflviclguy.R.inc(12114);return true;
            }
        }}
        }__CLR4_5_29bf9bflviclguy.R.inc(12115);for (SWRLAtom atom : body) {{
            __CLR4_5_29bf9bflviclguy.R.inc(12116);if ((((atom instanceof SWRLClassAtom
                    && ((SWRLClassAtom) atom).getPredicate().isAnonymous())&&(__CLR4_5_29bf9bflviclguy.R.iget(12117)!=0|true))||(__CLR4_5_29bf9bflviclguy.R.iget(12118)==0&false))) {{
                __CLR4_5_29bf9bflviclguy.R.inc(12119);return true;
            }
        }}
        }__CLR4_5_29bf9bflviclguy.R.inc(12120);return false;
    }finally{__CLR4_5_29bf9bflviclguy.R.flushNeeded();}}

    @Override
    public boolean containsAnonymousClassExpressions() {try{__CLR4_5_29bf9bflviclguy.R.inc(12121);
        __CLR4_5_29bf9bflviclguy.R.inc(12122);return containsAnonymousClassExpressions;
    }finally{__CLR4_5_29bf9bflviclguy.R.flushNeeded();}}

    @Override
    public Set<OWLClassExpression> getClassAtomPredicates() {try{__CLR4_5_29bf9bflviclguy.R.inc(12123);
        __CLR4_5_29bf9bflviclguy.R.inc(12124);Set<OWLClassExpression> toReturn = null;
        __CLR4_5_29bf9bflviclguy.R.inc(12125);if ((((classAtomsPredicates != null)&&(__CLR4_5_29bf9bflviclguy.R.iget(12126)!=0|true))||(__CLR4_5_29bf9bflviclguy.R.iget(12127)==0&false))) {{
            __CLR4_5_29bf9bflviclguy.R.inc(12128);toReturn = classAtomsPredicates.get();
        }
        }__CLR4_5_29bf9bflviclguy.R.inc(12129);if ((((toReturn != null)&&(__CLR4_5_29bf9bflviclguy.R.iget(12130)!=0|true))||(__CLR4_5_29bf9bflviclguy.R.iget(12131)==0&false))) {{
            __CLR4_5_29bf9bflviclguy.R.inc(12132);return toReturn;
        }
        }__CLR4_5_29bf9bflviclguy.R.inc(12133);toReturn = new LinkedHashSet<>();
        __CLR4_5_29bf9bflviclguy.R.inc(12134);for (SWRLAtom atom : head) {{
            __CLR4_5_29bf9bflviclguy.R.inc(12135);if ((((atom instanceof SWRLClassAtom)&&(__CLR4_5_29bf9bflviclguy.R.iget(12136)!=0|true))||(__CLR4_5_29bf9bflviclguy.R.iget(12137)==0&false))) {{
                __CLR4_5_29bf9bflviclguy.R.inc(12138);toReturn.add(((SWRLClassAtom) atom).getPredicate());
            }
        }}
        }__CLR4_5_29bf9bflviclguy.R.inc(12139);for (SWRLAtom atom : body) {{
            __CLR4_5_29bf9bflviclguy.R.inc(12140);if ((((atom instanceof SWRLClassAtom)&&(__CLR4_5_29bf9bflviclguy.R.iget(12141)!=0|true))||(__CLR4_5_29bf9bflviclguy.R.iget(12142)==0&false))) {{
                __CLR4_5_29bf9bflviclguy.R.inc(12143);toReturn.add(((SWRLClassAtom) atom).getPredicate());
            }
        }}
        }__CLR4_5_29bf9bflviclguy.R.inc(12144);classAtomsPredicates = new WeakReference<>(toReturn);
        __CLR4_5_29bf9bflviclguy.R.inc(12145);return toReturn;
    }finally{__CLR4_5_29bf9bflviclguy.R.flushNeeded();}}

    @Override
    public void accept(OWLObjectVisitor visitor) {try{__CLR4_5_29bf9bflviclguy.R.inc(12146);
        __CLR4_5_29bf9bflviclguy.R.inc(12147);visitor.visit(this);
    }finally{__CLR4_5_29bf9bflviclguy.R.flushNeeded();}}

    @Override
    public <O> O accept(OWLObjectVisitorEx<O> visitor) {try{__CLR4_5_29bf9bflviclguy.R.inc(12148);
        __CLR4_5_29bf9bflviclguy.R.inc(12149);return visitor.visit(this);
    }finally{__CLR4_5_29bf9bflviclguy.R.flushNeeded();}}

    @Override
    public void accept(SWRLObjectVisitor visitor) {try{__CLR4_5_29bf9bflviclguy.R.inc(12150);
        __CLR4_5_29bf9bflviclguy.R.inc(12151);visitor.visit(this);
    }finally{__CLR4_5_29bf9bflviclguy.R.flushNeeded();}}

    @Override
    public <O> O accept(SWRLObjectVisitorEx<O> visitor) {try{__CLR4_5_29bf9bflviclguy.R.inc(12152);
        __CLR4_5_29bf9bflviclguy.R.inc(12153);return visitor.visit(this);
    }finally{__CLR4_5_29bf9bflviclguy.R.flushNeeded();}}

    @Override
    public Set<SWRLAtom> getBody() {try{__CLR4_5_29bf9bflviclguy.R.inc(12154);
        __CLR4_5_29bf9bflviclguy.R.inc(12155);return CollectionFactory
                .getCopyOnRequestSetFromImmutableCollection(body);
    }finally{__CLR4_5_29bf9bflviclguy.R.flushNeeded();}}

    @Override
    public Set<SWRLAtom> getHead() {try{__CLR4_5_29bf9bflviclguy.R.inc(12156);
        __CLR4_5_29bf9bflviclguy.R.inc(12157);return CollectionFactory
                .getCopyOnRequestSetFromImmutableCollection(head);
    }finally{__CLR4_5_29bf9bflviclguy.R.flushNeeded();}}

    @Override
    public void accept(OWLAxiomVisitor visitor) {try{__CLR4_5_29bf9bflviclguy.R.inc(12158);
        __CLR4_5_29bf9bflviclguy.R.inc(12159);visitor.visit(this);
    }finally{__CLR4_5_29bf9bflviclguy.R.flushNeeded();}}

    @Override
    public <O> O accept(OWLAxiomVisitorEx<O> visitor) {try{__CLR4_5_29bf9bflviclguy.R.inc(12160);
        __CLR4_5_29bf9bflviclguy.R.inc(12161);return visitor.visit(this);
    }finally{__CLR4_5_29bf9bflviclguy.R.flushNeeded();}}

    @Override
    public SWRLRule getSimplified() {try{__CLR4_5_29bf9bflviclguy.R.inc(12162);
        __CLR4_5_29bf9bflviclguy.R.inc(12163);return (SWRLRule) accept(ATOM_SIMPLIFIER);
    }finally{__CLR4_5_29bf9bflviclguy.R.flushNeeded();}}

    @Override
    public boolean equals(Object obj) {try{__CLR4_5_29bf9bflviclguy.R.inc(12164);
        __CLR4_5_29bf9bflviclguy.R.inc(12165);if ((((this == obj)&&(__CLR4_5_29bf9bflviclguy.R.iget(12166)!=0|true))||(__CLR4_5_29bf9bflviclguy.R.iget(12167)==0&false))) {{
            __CLR4_5_29bf9bflviclguy.R.inc(12168);return true;
        }
        }__CLR4_5_29bf9bflviclguy.R.inc(12169);if ((((!super.equals(obj))&&(__CLR4_5_29bf9bflviclguy.R.iget(12170)!=0|true))||(__CLR4_5_29bf9bflviclguy.R.iget(12171)==0&false))) {{
            __CLR4_5_29bf9bflviclguy.R.inc(12172);return false;
        }
        }__CLR4_5_29bf9bflviclguy.R.inc(12173);if ((((!(obj instanceof SWRLRule))&&(__CLR4_5_29bf9bflviclguy.R.iget(12174)!=0|true))||(__CLR4_5_29bf9bflviclguy.R.iget(12175)==0&false))) {{
            __CLR4_5_29bf9bflviclguy.R.inc(12176);return false;
        }
        }__CLR4_5_29bf9bflviclguy.R.inc(12177);SWRLRule other = (SWRLRule) obj;
        __CLR4_5_29bf9bflviclguy.R.inc(12178);return other.getBody().equals(body) && other.getHead().equals(head);
    }finally{__CLR4_5_29bf9bflviclguy.R.flushNeeded();}}

    @Override
    public AxiomType<?> getAxiomType() {try{__CLR4_5_29bf9bflviclguy.R.inc(12179);
        __CLR4_5_29bf9bflviclguy.R.inc(12180);return AxiomType.SWRL_RULE;
    }finally{__CLR4_5_29bf9bflviclguy.R.flushNeeded();}}

    @Override
    protected int compareObjectOfSameType(OWLObject object) {try{__CLR4_5_29bf9bflviclguy.R.inc(12181);
        __CLR4_5_29bf9bflviclguy.R.inc(12182);SWRLRule other = (SWRLRule) object;
        __CLR4_5_29bf9bflviclguy.R.inc(12183);int diff = compareSets(getBody(), other.getBody());
        __CLR4_5_29bf9bflviclguy.R.inc(12184);if ((((diff == 0)&&(__CLR4_5_29bf9bflviclguy.R.iget(12185)!=0|true))||(__CLR4_5_29bf9bflviclguy.R.iget(12186)==0&false))) {{
            __CLR4_5_29bf9bflviclguy.R.inc(12187);diff = compareSets(getHead(), other.getHead());
        }
        }__CLR4_5_29bf9bflviclguy.R.inc(12188);return diff;
    }finally{__CLR4_5_29bf9bflviclguy.R.flushNeeded();}}

    @Nonnull
    protected static final AtomSimplifier ATOM_SIMPLIFIER = new AtomSimplifier();

    protected static class AtomSimplifier implements
            SWRLObjectVisitorEx<SWRLObject> {

        @Override
        public SWRLRule visit(SWRLRule node) {try{__CLR4_5_29bf9bflviclguy.R.inc(12189);
            __CLR4_5_29bf9bflviclguy.R.inc(12190);Set<SWRLAtom> nodebody = new HashSet<>();
            __CLR4_5_29bf9bflviclguy.R.inc(12191);for (SWRLAtom atom : node.getBody()) {{
                __CLR4_5_29bf9bflviclguy.R.inc(12192);nodebody.add((SWRLAtom) atom.accept(this));
            }
            }__CLR4_5_29bf9bflviclguy.R.inc(12193);Set<SWRLAtom> nodehead = new HashSet<>();
            __CLR4_5_29bf9bflviclguy.R.inc(12194);for (SWRLAtom atom : node.getHead()) {{
                __CLR4_5_29bf9bflviclguy.R.inc(12195);nodehead.add((SWRLAtom) atom.accept(this));
            }
            }__CLR4_5_29bf9bflviclguy.R.inc(12196);return new SWRLRuleImpl(nodebody, nodehead, NO_ANNOTATIONS);
        }finally{__CLR4_5_29bf9bflviclguy.R.flushNeeded();}}

        @Override
        public SWRLClassAtom visit(SWRLClassAtom node) {try{__CLR4_5_29bf9bflviclguy.R.inc(12197);
            __CLR4_5_29bf9bflviclguy.R.inc(12198);return node;
        }finally{__CLR4_5_29bf9bflviclguy.R.flushNeeded();}}

        @Override
        public SWRLDataRangeAtom visit(SWRLDataRangeAtom node) {try{__CLR4_5_29bf9bflviclguy.R.inc(12199);
            __CLR4_5_29bf9bflviclguy.R.inc(12200);return node;
        }finally{__CLR4_5_29bf9bflviclguy.R.flushNeeded();}}

        @Override
        public SWRLObjectPropertyAtom visit(SWRLObjectPropertyAtom node) {try{__CLR4_5_29bf9bflviclguy.R.inc(12201);
            __CLR4_5_29bf9bflviclguy.R.inc(12202);return node.getSimplified();
        }finally{__CLR4_5_29bf9bflviclguy.R.flushNeeded();}}

        @Override
        public SWRLDataPropertyAtom visit(SWRLDataPropertyAtom node) {try{__CLR4_5_29bf9bflviclguy.R.inc(12203);
            __CLR4_5_29bf9bflviclguy.R.inc(12204);return node;
        }finally{__CLR4_5_29bf9bflviclguy.R.flushNeeded();}}

        @Override
        public SWRLBuiltInAtom visit(SWRLBuiltInAtom node) {try{__CLR4_5_29bf9bflviclguy.R.inc(12205);
            __CLR4_5_29bf9bflviclguy.R.inc(12206);return node;
        }finally{__CLR4_5_29bf9bflviclguy.R.flushNeeded();}}

        @Override
        public SWRLVariable visit(SWRLVariable node) {try{__CLR4_5_29bf9bflviclguy.R.inc(12207);
            __CLR4_5_29bf9bflviclguy.R.inc(12208);return node;
        }finally{__CLR4_5_29bf9bflviclguy.R.flushNeeded();}}

        @Override
        public SWRLIndividualArgument visit(SWRLIndividualArgument node) {try{__CLR4_5_29bf9bflviclguy.R.inc(12209);
            __CLR4_5_29bf9bflviclguy.R.inc(12210);return node;
        }finally{__CLR4_5_29bf9bflviclguy.R.flushNeeded();}}

        @Override
        public SWRLLiteralArgument visit(SWRLLiteralArgument node) {try{__CLR4_5_29bf9bflviclguy.R.inc(12211);
            __CLR4_5_29bf9bflviclguy.R.inc(12212);return node;
        }finally{__CLR4_5_29bf9bflviclguy.R.flushNeeded();}}

        @Override
        public SWRLSameIndividualAtom visit(SWRLSameIndividualAtom node) {try{__CLR4_5_29bf9bflviclguy.R.inc(12213);
            __CLR4_5_29bf9bflviclguy.R.inc(12214);return node;
        }finally{__CLR4_5_29bf9bflviclguy.R.flushNeeded();}}

        @Override
        public SWRLDifferentIndividualsAtom visit(
                SWRLDifferentIndividualsAtom node) {try{__CLR4_5_29bf9bflviclguy.R.inc(12215);
            __CLR4_5_29bf9bflviclguy.R.inc(12216);return node;
        }finally{__CLR4_5_29bf9bflviclguy.R.flushNeeded();}}
    }
}
