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
package org.semanticweb.owlapi.api.test.baseclasses;

import static org.junit.Assert.*;
import static org.semanticweb.owlapi.apibinding.OWLFunctionalSyntaxFactory.IRI;

import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.*;

import javax.annotation.Nonnull;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.rules.ExpectedException;
import org.junit.rules.TemporaryFolder;
import org.junit.rules.Timeout;
import org.semanticweb.owlapi.api.test.anonymous.AnonymousIndividualsNormaliser;
import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.formats.ManchesterSyntaxDocumentFormat;
import org.semanticweb.owlapi.formats.PrefixDocumentFormat;
import org.semanticweb.owlapi.formats.RDFDocumentFormat;
import org.semanticweb.owlapi.formats.RDFJsonLDDocumentFormat;
import org.semanticweb.owlapi.formats.RDFXMLDocumentFormat;
import org.semanticweb.owlapi.io.IRIDocumentSource;
import org.semanticweb.owlapi.io.OWLOntologyDocumentSourceBase;
import org.semanticweb.owlapi.io.StringDocumentSource;
import org.semanticweb.owlapi.io.StringDocumentTarget;
import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.vocab.OWL2Datatype;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.base.Optional;

import uk.ac.manchester.cs.owl.owlapi.OWLOntologyFactoryImpl;
import uk.ac.manchester.cs.owl.owlapi.OWLOntologyImpl;
import uk.ac.manchester.cs.owl.owlapi.OWLOntologyManagerImpl;
import uk.ac.manchester.cs.owl.owlapi.concurrent.NoOpReadWriteLock;

/**
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.2.0
 */
@SuppressWarnings({ "javadoc", "null" })
public abstract class TestBase {static class __CLR4_5_258l58llvico0iq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,7089,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Nonnull protected static final File RESOURCES = resources();

    private static final File resources() {try{__CLR4_5_258l58llvico0iq.R.inc(6789);
        __CLR4_5_258l58llvico0iq.R.inc(6790);try {
            __CLR4_5_258l58llvico0iq.R.inc(6791);return new File(TestBase.class.getResource("/owlapi.properties").toURI()).getParentFile();
        } catch (URISyntaxException e) {
            __CLR4_5_258l58llvico0iq.R.inc(6792);throw new OWLRuntimeException("NO RESOURCE FOLDER ACCESSIBLE", e);
        }
    }finally{__CLR4_5_258l58llvico0iq.R.flushNeeded();}}

    protected static final Logger logger = LoggerFactory.getLogger(TestBase.class);
    @Nonnull @Rule public TemporaryFolder folder = new TemporaryFolder();
    @Rule public ExpectedException expectedException = ExpectedException.none();
    @Nonnull @Rule public Timeout timeout = new Timeout(1000000);
    @Nonnull protected OWLOntologyLoaderConfiguration config = new OWLOntologyLoaderConfiguration();
    protected static @Nonnull OWLDataFactory df;
    protected static @Nonnull OWLOntologyManager masterManager;
    @Nonnull protected OWLOntologyManager m;
    @Nonnull protected OWLOntologyManager m1;

    @BeforeClass
    public static void setupManagers() {try{__CLR4_5_258l58llvico0iq.R.inc(6793);
        __CLR4_5_258l58llvico0iq.R.inc(6794);masterManager = OWLManager.createOWLOntologyManager();
        __CLR4_5_258l58llvico0iq.R.inc(6795);df = masterManager.getOWLDataFactory();
    }finally{__CLR4_5_258l58llvico0iq.R.flushNeeded();}}

    @Before
    public void setupManagersClean() {try{__CLR4_5_258l58llvico0iq.R.inc(6796);
        __CLR4_5_258l58llvico0iq.R.inc(6797);m = setupManager();
        __CLR4_5_258l58llvico0iq.R.inc(6798);m1 = setupManager();
    }finally{__CLR4_5_258l58llvico0iq.R.flushNeeded();}}

    protected static OWLOntologyManager setupManager() {try{__CLR4_5_258l58llvico0iq.R.inc(6799);
        __CLR4_5_258l58llvico0iq.R.inc(6800);OWLOntologyManager manager = new OWLOntologyManagerImpl(df, new NoOpReadWriteLock());
        __CLR4_5_258l58llvico0iq.R.inc(6801);manager.getOntologyFactories().set(new OWLOntologyFactoryImpl(new OWLOntologyBuilder() {

            @Override
            public OWLOntology createOWLOntology(OWLOntologyManager om, OWLOntologyID id) {try{__CLR4_5_258l58llvico0iq.R.inc(6802);
                __CLR4_5_258l58llvico0iq.R.inc(6803);return new OWLOntologyImpl(om, id);
            }finally{__CLR4_5_258l58llvico0iq.R.flushNeeded();}}
        }));
        __CLR4_5_258l58llvico0iq.R.inc(6804);manager.getOntologyParsers().set(masterManager.getOntologyParsers());
        __CLR4_5_258l58llvico0iq.R.inc(6805);manager.getOntologyStorers().set(masterManager.getOntologyStorers());
        __CLR4_5_258l58llvico0iq.R.inc(6806);manager.getIRIMappers().set(masterManager.getIRIMappers());
        __CLR4_5_258l58llvico0iq.R.inc(6807);return manager;
    }finally{__CLR4_5_258l58llvico0iq.R.flushNeeded();}}

    @Nonnull
    protected <T> Optional<T> of(T t) {try{__CLR4_5_258l58llvico0iq.R.inc(6808);
        __CLR4_5_258l58llvico0iq.R.inc(6809);return Optional.fromNullable(t);
    }finally{__CLR4_5_258l58llvico0iq.R.flushNeeded();}}

    @Nonnull
    protected Optional<IRI> absent() {try{__CLR4_5_258l58llvico0iq.R.inc(6810);
        __CLR4_5_258l58llvico0iq.R.inc(6811);return Optional.absent();
    }finally{__CLR4_5_258l58llvico0iq.R.flushNeeded();}}

    @Nonnull
    protected <S> Set<S> singleton(S s) {try{__CLR4_5_258l58llvico0iq.R.inc(6812);
        __CLR4_5_258l58llvico0iq.R.inc(6813);return Collections.singleton(s);
    }finally{__CLR4_5_258l58llvico0iq.R.flushNeeded();}}

    protected Set<OWLAxiom> stripSimpleDeclarations(Collection<OWLAxiom> axioms) {try{__CLR4_5_258l58llvico0iq.R.inc(6814);
        __CLR4_5_258l58llvico0iq.R.inc(6815);Set<OWLAxiom> toReturn = new HashSet<>();
        __CLR4_5_258l58llvico0iq.R.inc(6816);for (OWLAxiom ax : axioms) {{
            __CLR4_5_258l58llvico0iq.R.inc(6817);if ((((!isSimpleDeclaration(ax))&&(__CLR4_5_258l58llvico0iq.R.iget(6818)!=0|true))||(__CLR4_5_258l58llvico0iq.R.iget(6819)==0&false))) {{
                __CLR4_5_258l58llvico0iq.R.inc(6820);toReturn.add(ax);
            }
        }}
        }__CLR4_5_258l58llvico0iq.R.inc(6821);return toReturn;
    }finally{__CLR4_5_258l58llvico0iq.R.flushNeeded();}}

    protected boolean isSimpleDeclaration(OWLAxiom ax) {try{__CLR4_5_258l58llvico0iq.R.inc(6822);
        __CLR4_5_258l58llvico0iq.R.inc(6823);return ax.isOfType(AxiomType.DECLARATION) && ax.getAnnotations().isEmpty();
    }finally{__CLR4_5_258l58llvico0iq.R.flushNeeded();}}

    public boolean equal(@Nonnull OWLOntology ont1, @Nonnull OWLOntology ont2) {try{__CLR4_5_258l58llvico0iq.R.inc(6824);
        __CLR4_5_258l58llvico0iq.R.inc(6825);if ((((!ont1.isAnonymous() && !ont2.isAnonymous())&&(__CLR4_5_258l58llvico0iq.R.iget(6826)!=0|true))||(__CLR4_5_258l58llvico0iq.R.iget(6827)==0&false))) {{
            __CLR4_5_258l58llvico0iq.R.inc(6828);assertEquals("Ontologies supposed to be the same", ont1.getOntologyID(), ont2.getOntologyID());
        }
        }__CLR4_5_258l58llvico0iq.R.inc(6829);assertEquals("Annotations supposed to be the same", ont1.getAnnotations(), ont2.getAnnotations());
        __CLR4_5_258l58llvico0iq.R.inc(6830);Set<OWLAxiom> axioms1;
        __CLR4_5_258l58llvico0iq.R.inc(6831);Set<OWLAxiom> axioms2;
        // This isn't great - we normalise axioms by changing the ids of
        // individuals. This relies on the fact that
        // we iterate over objects in the same order for the same set of axioms!
        __CLR4_5_258l58llvico0iq.R.inc(6832);axioms1 = new AnonymousIndividualsNormaliser(df).getNormalisedAxioms(ont1.getAxioms());
        __CLR4_5_258l58llvico0iq.R.inc(6833);axioms2 = new AnonymousIndividualsNormaliser(df).getNormalisedAxioms(ont2.getAxioms());
        __CLR4_5_258l58llvico0iq.R.inc(6834);OWLDocumentFormat ontologyFormat = ont2.getOWLOntologyManager().getOntologyFormat(ont2);
        __CLR4_5_258l58llvico0iq.R.inc(6835);applyEquivalentsRoundtrip(axioms1, axioms2, ontologyFormat);
        __CLR4_5_258l58llvico0iq.R.inc(6836);if ((((ontologyFormat instanceof ManchesterSyntaxDocumentFormat)&&(__CLR4_5_258l58llvico0iq.R.iget(6837)!=0|true))||(__CLR4_5_258l58llvico0iq.R.iget(6838)==0&false))) {{
            // drop GCIs from the expected axioms, they won't be there
            __CLR4_5_258l58llvico0iq.R.inc(6839);Iterator<OWLAxiom> it = axioms1.iterator();
            __CLR4_5_258l58llvico0iq.R.inc(6840);while ((((it.hasNext())&&(__CLR4_5_258l58llvico0iq.R.iget(6841)!=0|true))||(__CLR4_5_258l58llvico0iq.R.iget(6842)==0&false))) {{
                __CLR4_5_258l58llvico0iq.R.inc(6843);OWLAxiom next = it.next();
                __CLR4_5_258l58llvico0iq.R.inc(6844);if ((((next instanceof OWLSubClassOfAxiom)&&(__CLR4_5_258l58llvico0iq.R.iget(6845)!=0|true))||(__CLR4_5_258l58llvico0iq.R.iget(6846)==0&false))) {{
                    __CLR4_5_258l58llvico0iq.R.inc(6847);if ((((((OWLSubClassOfAxiom) next).getSubClass().isAnonymous() && ((OWLSubClassOfAxiom) next)
                        .getSuperClass().isAnonymous())&&(__CLR4_5_258l58llvico0iq.R.iget(6848)!=0|true))||(__CLR4_5_258l58llvico0iq.R.iget(6849)==0&false))) {{
                        __CLR4_5_258l58llvico0iq.R.inc(6850);it.remove();
                    }
                }}
            }}
        }}
        }__CLR4_5_258l58llvico0iq.R.inc(6851);PlainLiteralTypeFoldingAxiomSet a = new PlainLiteralTypeFoldingAxiomSet(axioms1);
        __CLR4_5_258l58llvico0iq.R.inc(6852);PlainLiteralTypeFoldingAxiomSet b = new PlainLiteralTypeFoldingAxiomSet(axioms2);
        __CLR4_5_258l58llvico0iq.R.inc(6853);if ((((!a.equals(b))&&(__CLR4_5_258l58llvico0iq.R.iget(6854)!=0|true))||(__CLR4_5_258l58llvico0iq.R.iget(6855)==0&false))) {{
            __CLR4_5_258l58llvico0iq.R.inc(6856);int counter = 0;
            __CLR4_5_258l58llvico0iq.R.inc(6857);StringBuilder sb = new StringBuilder();
            __CLR4_5_258l58llvico0iq.R.inc(6858);Set<OWLAxiom> leftOnly = new HashSet<>();
            __CLR4_5_258l58llvico0iq.R.inc(6859);Set<OWLAxiom> rightOnly = new HashSet<>();
            __CLR4_5_258l58llvico0iq.R.inc(6860);for (OWLAxiom ax : a) {{
                __CLR4_5_258l58llvico0iq.R.inc(6861);if ((((!b.contains(ax))&&(__CLR4_5_258l58llvico0iq.R.iget(6862)!=0|true))||(__CLR4_5_258l58llvico0iq.R.iget(6863)==0&false))) {{
                    __CLR4_5_258l58llvico0iq.R.inc(6864);if ((((!isIgnorableAxiom(ax, false))&&(__CLR4_5_258l58llvico0iq.R.iget(6865)!=0|true))||(__CLR4_5_258l58llvico0iq.R.iget(6866)==0&false))) {{
                        __CLR4_5_258l58llvico0iq.R.inc(6867);leftOnly.add(ax);
                        __CLR4_5_258l58llvico0iq.R.inc(6868);sb.append("Rem axiom: ");
                        __CLR4_5_258l58llvico0iq.R.inc(6869);sb.append(ax);
                        __CLR4_5_258l58llvico0iq.R.inc(6870);sb.append('\n');
                        __CLR4_5_258l58llvico0iq.R.inc(6871);counter++;
                    }
                }}
            }}
            }__CLR4_5_258l58llvico0iq.R.inc(6872);for (OWLAxiom ax : b) {{
                __CLR4_5_258l58llvico0iq.R.inc(6873);if ((((!a.contains(ax))&&(__CLR4_5_258l58llvico0iq.R.iget(6874)!=0|true))||(__CLR4_5_258l58llvico0iq.R.iget(6875)==0&false))) {{
                    __CLR4_5_258l58llvico0iq.R.inc(6876);if ((((!isIgnorableAxiom(ax, true))&&(__CLR4_5_258l58llvico0iq.R.iget(6877)!=0|true))||(__CLR4_5_258l58llvico0iq.R.iget(6878)==0&false))) {{
                        __CLR4_5_258l58llvico0iq.R.inc(6879);rightOnly.add(ax);
                        __CLR4_5_258l58llvico0iq.R.inc(6880);sb.append("Add axiom: ");
                        __CLR4_5_258l58llvico0iq.R.inc(6881);sb.append(ax);
                        __CLR4_5_258l58llvico0iq.R.inc(6882);sb.append('\n');
                        __CLR4_5_258l58llvico0iq.R.inc(6883);counter++;
                    }
                }}
            }}
            }__CLR4_5_258l58llvico0iq.R.inc(6884);if ((((counter > 0)&&(__CLR4_5_258l58llvico0iq.R.iget(6885)!=0|true))||(__CLR4_5_258l58llvico0iq.R.iget(6886)==0&false))) {{
                // a test fails on OpenJDK implementations because of ordering
                // testing here if blank node ids are the only difference
                __CLR4_5_258l58llvico0iq.R.inc(6887);boolean fixed = !verifyErrorIsDueToBlankNodesId(leftOnly, rightOnly);
                __CLR4_5_258l58llvico0iq.R.inc(6888);if ((((fixed)&&(__CLR4_5_258l58llvico0iq.R.iget(6889)!=0|true))||(__CLR4_5_258l58llvico0iq.R.iget(6890)==0&false))) {{
                    __CLR4_5_258l58llvico0iq.R.inc(6891);String x = getClass().getSimpleName() + " roundTripOntology() Failing to match axioms: \n" + sb;
                    // System.out.println(x);
                    __CLR4_5_258l58llvico0iq.R.inc(6892);fail(x);
                    __CLR4_5_258l58llvico0iq.R.inc(6893);return false;
                } }else {{
                    __CLR4_5_258l58llvico0iq.R.inc(6894);return true;
                }
            }} }else {{
                __CLR4_5_258l58llvico0iq.R.inc(6895);return true;
            }
        }}
        // assertEquals(axioms1, axioms2);
        }__CLR4_5_258l58llvico0iq.R.inc(6896);return true;
    }finally{__CLR4_5_258l58llvico0iq.R.flushNeeded();}}

    /**
     * equivalent entity axioms with more than two entities are broken up by RDF
     * syntaxes. Ensure they are still recognized as correct roundtripping
     */
    public void applyEquivalentsRoundtrip(Set<OWLAxiom> axioms1, Set<OWLAxiom> axioms2, OWLDocumentFormat destination) {try{__CLR4_5_258l58llvico0iq.R.inc(6897);
        __CLR4_5_258l58llvico0iq.R.inc(6898);if ((((!axioms1.equals(axioms2))&&(__CLR4_5_258l58llvico0iq.R.iget(6899)!=0|true))||(__CLR4_5_258l58llvico0iq.R.iget(6900)==0&false))) {{
            // remove axioms that differ only because of n-ary equivalence
            // axioms
            // http://www.w3.org/TR/owl2-mapping-to-rdf/#Axioms_that_are_Translated_to_Multiple_Triples
            __CLR4_5_258l58llvico0iq.R.inc(6901);for (OWLAxiom ax : new ArrayList<>(axioms1)) {{
                __CLR4_5_258l58llvico0iq.R.inc(6902);if ((((ax instanceof OWLEquivalentClassesAxiom)&&(__CLR4_5_258l58llvico0iq.R.iget(6903)!=0|true))||(__CLR4_5_258l58llvico0iq.R.iget(6904)==0&false))) {{
                    __CLR4_5_258l58llvico0iq.R.inc(6905);OWLEquivalentClassesAxiom ax2 = (OWLEquivalentClassesAxiom) ax;
                    __CLR4_5_258l58llvico0iq.R.inc(6906);if ((((ax2.getClassExpressions().size() > 2)&&(__CLR4_5_258l58llvico0iq.R.iget(6907)!=0|true))||(__CLR4_5_258l58llvico0iq.R.iget(6908)==0&false))) {{
                        __CLR4_5_258l58llvico0iq.R.inc(6909);Set<OWLEquivalentClassesAxiom> pairs = ax2.splitToAnnotatedPairs();
                        __CLR4_5_258l58llvico0iq.R.inc(6910);if ((((removeIfContainsAll(axioms2, pairs, destination))&&(__CLR4_5_258l58llvico0iq.R.iget(6911)!=0|true))||(__CLR4_5_258l58llvico0iq.R.iget(6912)==0&false))) {{
                            __CLR4_5_258l58llvico0iq.R.inc(6913);axioms1.remove(ax);
                            __CLR4_5_258l58llvico0iq.R.inc(6914);axioms2.removeAll(pairs);
                        }
                    }}
                }} }else {__CLR4_5_258l58llvico0iq.R.inc(6915);if ((((ax instanceof OWLEquivalentDataPropertiesAxiom)&&(__CLR4_5_258l58llvico0iq.R.iget(6916)!=0|true))||(__CLR4_5_258l58llvico0iq.R.iget(6917)==0&false))) {{
                    __CLR4_5_258l58llvico0iq.R.inc(6918);OWLEquivalentDataPropertiesAxiom ax2 = (OWLEquivalentDataPropertiesAxiom) ax;
                    __CLR4_5_258l58llvico0iq.R.inc(6919);if ((((ax2.getProperties().size() > 2)&&(__CLR4_5_258l58llvico0iq.R.iget(6920)!=0|true))||(__CLR4_5_258l58llvico0iq.R.iget(6921)==0&false))) {{
                        __CLR4_5_258l58llvico0iq.R.inc(6922);Set<OWLEquivalentDataPropertiesAxiom> pairs = ax2.splitToAnnotatedPairs();
                        __CLR4_5_258l58llvico0iq.R.inc(6923);if ((((removeIfContainsAll(axioms2, pairs, destination))&&(__CLR4_5_258l58llvico0iq.R.iget(6924)!=0|true))||(__CLR4_5_258l58llvico0iq.R.iget(6925)==0&false))) {{
                            __CLR4_5_258l58llvico0iq.R.inc(6926);axioms1.remove(ax);
                            __CLR4_5_258l58llvico0iq.R.inc(6927);axioms2.removeAll(pairs);
                        }
                    }}
                }} }else {__CLR4_5_258l58llvico0iq.R.inc(6928);if ((((ax instanceof OWLEquivalentObjectPropertiesAxiom)&&(__CLR4_5_258l58llvico0iq.R.iget(6929)!=0|true))||(__CLR4_5_258l58llvico0iq.R.iget(6930)==0&false))) {{
                    __CLR4_5_258l58llvico0iq.R.inc(6931);OWLEquivalentObjectPropertiesAxiom ax2 = (OWLEquivalentObjectPropertiesAxiom) ax;
                    __CLR4_5_258l58llvico0iq.R.inc(6932);if ((((ax2.getProperties().size() > 2)&&(__CLR4_5_258l58llvico0iq.R.iget(6933)!=0|true))||(__CLR4_5_258l58llvico0iq.R.iget(6934)==0&false))) {{
                        __CLR4_5_258l58llvico0iq.R.inc(6935);Set<OWLEquivalentObjectPropertiesAxiom> pairs = ax2.splitToAnnotatedPairs();
                        __CLR4_5_258l58llvico0iq.R.inc(6936);if ((((removeIfContainsAll(axioms2, pairs, destination))&&(__CLR4_5_258l58llvico0iq.R.iget(6937)!=0|true))||(__CLR4_5_258l58llvico0iq.R.iget(6938)==0&false))) {{
                            __CLR4_5_258l58llvico0iq.R.inc(6939);axioms1.remove(ax);
                            __CLR4_5_258l58llvico0iq.R.inc(6940);axioms2.removeAll(pairs);
                        }
                    }}
                }}
            }}}}
        }}
    }}finally{__CLR4_5_258l58llvico0iq.R.flushNeeded();}}

    private boolean removeIfContainsAll(Collection<OWLAxiom> axioms, Collection<? extends OWLAxiom> others,
        OWLDocumentFormat destination) {try{__CLR4_5_258l58llvico0iq.R.inc(6941);
        __CLR4_5_258l58llvico0iq.R.inc(6942);if ((((axioms.containsAll(others))&&(__CLR4_5_258l58llvico0iq.R.iget(6943)!=0|true))||(__CLR4_5_258l58llvico0iq.R.iget(6944)==0&false))) {{
            __CLR4_5_258l58llvico0iq.R.inc(6945);axioms.removeAll(others);
            __CLR4_5_258l58llvico0iq.R.inc(6946);return true;
        }
        // some syntaxes attach xsd:string to annotation values that did not
        // have it previously
        }__CLR4_5_258l58llvico0iq.R.inc(6947);if ((((!(destination instanceof RDFJsonLDDocumentFormat))&&(__CLR4_5_258l58llvico0iq.R.iget(6948)!=0|true))||(__CLR4_5_258l58llvico0iq.R.iget(6949)==0&false))) {{
            __CLR4_5_258l58llvico0iq.R.inc(6950);return false;
        }
        }__CLR4_5_258l58llvico0iq.R.inc(6951);Set<OWLAxiom> toRemove = new HashSet<>();
        __CLR4_5_258l58llvico0iq.R.inc(6952);for (OWLAxiom ax : others) {{
            __CLR4_5_258l58llvico0iq.R.inc(6953);OWLAxiom reannotated = ax.getAxiomWithoutAnnotations().getAnnotatedAxiom(reannotate(ax.getAnnotations()));
            __CLR4_5_258l58llvico0iq.R.inc(6954);toRemove.add(reannotated);
        }
        }__CLR4_5_258l58llvico0iq.R.inc(6955);axioms.removeAll(toRemove);
        __CLR4_5_258l58llvico0iq.R.inc(6956);return true;
    }finally{__CLR4_5_258l58llvico0iq.R.flushNeeded();}}

    private Set<OWLAnnotation> reannotate(Set<OWLAnnotation> anns) {try{__CLR4_5_258l58llvico0iq.R.inc(6957);
        __CLR4_5_258l58llvico0iq.R.inc(6958);OWLDatatype stringType = df.getOWLDatatype(OWL2Datatype.XSD_STRING.getIRI());
        __CLR4_5_258l58llvico0iq.R.inc(6959);Set<OWLAnnotation> toReturn = new HashSet<>();
        __CLR4_5_258l58llvico0iq.R.inc(6960);for (OWLAnnotation a : anns) {{
            __CLR4_5_258l58llvico0iq.R.inc(6961);Optional<OWLLiteral> asLiteral = a.getValue().asLiteral();
            __CLR4_5_258l58llvico0iq.R.inc(6962);if ((((asLiteral.isPresent() && asLiteral.get().isRDFPlainLiteral())&&(__CLR4_5_258l58llvico0iq.R.iget(6963)!=0|true))||(__CLR4_5_258l58llvico0iq.R.iget(6964)==0&false))) {{
                __CLR4_5_258l58llvico0iq.R.inc(6965);OWLAnnotation replacement = df.getOWLAnnotation(a.getProperty(), df.getOWLLiteral(asLiteral.get()
                    .getLiteral(), stringType));
                __CLR4_5_258l58llvico0iq.R.inc(6966);toReturn.add(replacement);
            } }else {{
                __CLR4_5_258l58llvico0iq.R.inc(6967);toReturn.add(a);
            }
        }}
        }__CLR4_5_258l58llvico0iq.R.inc(6968);return toReturn;
    }finally{__CLR4_5_258l58llvico0iq.R.flushNeeded();}}

    /**
     * @param leftOnly
     * @param rightOnly
     * @return
     */
    public static boolean verifyErrorIsDueToBlankNodesId(@Nonnull Set<OWLAxiom> leftOnly,
        @Nonnull Set<OWLAxiom> rightOnly) {try{__CLR4_5_258l58llvico0iq.R.inc(6969);
        __CLR4_5_258l58llvico0iq.R.inc(6970);Set<String> leftOnlyStrings = new HashSet<>();
        __CLR4_5_258l58llvico0iq.R.inc(6971);Set<String> rightOnlyStrings = new HashSet<>();
        __CLR4_5_258l58llvico0iq.R.inc(6972);for (OWLAxiom ax : leftOnly) {{
            __CLR4_5_258l58llvico0iq.R.inc(6973);leftOnlyStrings.add(ax.toString().replaceAll("_:anon-ind-[0-9]+", "blank").replaceAll("_:genid[0-9]+",
                "blank"));
        }
        }__CLR4_5_258l58llvico0iq.R.inc(6974);for (OWLAxiom ax : rightOnly) {{
            __CLR4_5_258l58llvico0iq.R.inc(6975);rightOnlyStrings.add(ax.toString().replaceAll("_:anon-ind-[0-9]+", "blank").replaceAll("_:genid[0-9]+",
                "blank"));
        }
        }__CLR4_5_258l58llvico0iq.R.inc(6976);return rightOnlyStrings.equals(leftOnlyStrings);
    }finally{__CLR4_5_258l58llvico0iq.R.flushNeeded();}}

    /**
     * ignore declarations of builtins and of named individuals - named
     * individuals do not /need/ a declaration, but addiong one is not an error.
     * 
     * @param parse
     *        true if the axiom belongs to the parsed ones, false for the input
     * @return true if the axiom can be ignored
     */
    public boolean isIgnorableAxiom(OWLAxiom ax, boolean parse) {try{__CLR4_5_258l58llvico0iq.R.inc(6977);
        __CLR4_5_258l58llvico0iq.R.inc(6978);if ((((ax instanceof OWLDeclarationAxiom)&&(__CLR4_5_258l58llvico0iq.R.iget(6979)!=0|true))||(__CLR4_5_258l58llvico0iq.R.iget(6980)==0&false))) {{
            __CLR4_5_258l58llvico0iq.R.inc(6981);OWLDeclarationAxiom d = (OWLDeclarationAxiom) ax;
            __CLR4_5_258l58llvico0iq.R.inc(6982);if ((((parse)&&(__CLR4_5_258l58llvico0iq.R.iget(6983)!=0|true))||(__CLR4_5_258l58llvico0iq.R.iget(6984)==0&false))) {{
                // all extra declarations in the parsed ontology are fine
                __CLR4_5_258l58llvico0iq.R.inc(6985);return true;
            }
            // declarations of builtin and named individuals can be ignored
            }__CLR4_5_258l58llvico0iq.R.inc(6986);return d.getEntity().isBuiltIn() || d.getEntity().isOWLNamedIndividual();
        }
        }__CLR4_5_258l58llvico0iq.R.inc(6987);return false;
    }finally{__CLR4_5_258l58llvico0iq.R.flushNeeded();}}

    @Nonnull private final String uriBase = "http://www.semanticweb.org/owlapi/test";

    @Nonnull
    public OWLOntology getOWLOntology(String name) {try{__CLR4_5_258l58llvico0iq.R.inc(6988);
        __CLR4_5_258l58llvico0iq.R.inc(6989);try {
            __CLR4_5_258l58llvico0iq.R.inc(6990);IRI iri = IRI(uriBase + '/' + name);
            __CLR4_5_258l58llvico0iq.R.inc(6991);if ((((m.contains(iri))&&(__CLR4_5_258l58llvico0iq.R.iget(6992)!=0|true))||(__CLR4_5_258l58llvico0iq.R.iget(6993)==0&false))) {{
                __CLR4_5_258l58llvico0iq.R.inc(6994);return m.getOntology(iri);
            } }else {{
                __CLR4_5_258l58llvico0iq.R.inc(6995);return m.createOntology(iri);
            }
        }} catch (OWLOntologyCreationException e) {
            __CLR4_5_258l58llvico0iq.R.inc(6996);throw new RuntimeException(e);
        }
    }finally{__CLR4_5_258l58llvico0iq.R.flushNeeded();}}

    public OWLOntology loadOntology(String fileName) {try{__CLR4_5_258l58llvico0iq.R.inc(6997);
        __CLR4_5_258l58llvico0iq.R.inc(6998);try {
            __CLR4_5_258l58llvico0iq.R.inc(6999);URL url = getClass().getResource('/' + fileName);
            __CLR4_5_258l58llvico0iq.R.inc(7000);return m.loadOntologyFromOntologyDocument(new IRIDocumentSource(IRI.create(url), null, null),
                new OWLOntologyLoaderConfiguration().setReportStackTraces(true));
        } catch (OWLOntologyCreationException e) {
            __CLR4_5_258l58llvico0iq.R.inc(7001);fail(e.getMessage());
            __CLR4_5_258l58llvico0iq.R.inc(7002);throw new OWLRuntimeException(e);
        }
    }finally{__CLR4_5_258l58llvico0iq.R.flushNeeded();}}

    @Nonnull
    public IRI iri(String name) {try{__CLR4_5_258l58llvico0iq.R.inc(7003);
        __CLR4_5_258l58llvico0iq.R.inc(7004);return IRI(uriBase + '#' + name);
    }finally{__CLR4_5_258l58llvico0iq.R.flushNeeded();}}

    public void addAxiom(@Nonnull OWLOntology ont, @Nonnull OWLAxiom ax) {try{__CLR4_5_258l58llvico0iq.R.inc(7005);
        __CLR4_5_258l58llvico0iq.R.inc(7006);m.addAxiom(ont, ax);
    }finally{__CLR4_5_258l58llvico0iq.R.flushNeeded();}}

    public void roundTripOntology(@Nonnull OWLOntology ont) throws OWLOntologyStorageException,
        OWLOntologyCreationException {try{__CLR4_5_258l58llvico0iq.R.inc(7007);
        __CLR4_5_258l58llvico0iq.R.inc(7008);roundTripOntology(ont, new RDFXMLDocumentFormat());
    }finally{__CLR4_5_258l58llvico0iq.R.flushNeeded();}}

    /**
     * Saves the specified ontology in the specified format and reloads it.
     * Calling this method from a test will cause the test to fail if the
     * ontology could not be stored, could not be reloaded, or was reloaded and
     * the reloaded version is not equal (in terms of ontology URI and axioms)
     * with the original.
     * 
     * @param ont
     *        The ontology to be round tripped.
     * @param format
     *        The format to use when doing the round trip.
     */
    public OWLOntology roundTripOntology(@Nonnull OWLOntology ont, @Nonnull OWLDocumentFormat format)
        throws OWLOntologyStorageException, OWLOntologyCreationException {try{__CLR4_5_258l58llvico0iq.R.inc(7009);
        __CLR4_5_258l58llvico0iq.R.inc(7010);StringDocumentTarget target = new StringDocumentTarget();
        __CLR4_5_258l58llvico0iq.R.inc(7011);OWLDocumentFormat fromFormat = m.getOntologyFormat(ont);
        __CLR4_5_258l58llvico0iq.R.inc(7012);if ((((fromFormat.isPrefixOWLOntologyFormat() && format.isPrefixOWLOntologyFormat())&&(__CLR4_5_258l58llvico0iq.R.iget(7013)!=0|true))||(__CLR4_5_258l58llvico0iq.R.iget(7014)==0&false))) {{
            __CLR4_5_258l58llvico0iq.R.inc(7015);PrefixDocumentFormat fromPrefixFormat = fromFormat.asPrefixOWLOntologyFormat();
            __CLR4_5_258l58llvico0iq.R.inc(7016);PrefixDocumentFormat toPrefixFormat = format.asPrefixOWLOntologyFormat();
            __CLR4_5_258l58llvico0iq.R.inc(7017);toPrefixFormat.copyPrefixesFrom(fromPrefixFormat);
            __CLR4_5_258l58llvico0iq.R.inc(7018);toPrefixFormat.setDefaultPrefix(null);
        }
        }__CLR4_5_258l58llvico0iq.R.inc(7019);boolean addMissingTypes = true;
        __CLR4_5_258l58llvico0iq.R.inc(7020);if ((((format instanceof RDFDocumentFormat)&&(__CLR4_5_258l58llvico0iq.R.iget(7021)!=0|true))||(__CLR4_5_258l58llvico0iq.R.iget(7022)==0&false))) {{
            __CLR4_5_258l58llvico0iq.R.inc(7023);format.setAddMissingTypes(addMissingTypes);
        }
        }__CLR4_5_258l58llvico0iq.R.inc(7024);if ((((logger.isTraceEnabled())&&(__CLR4_5_258l58llvico0iq.R.iget(7025)!=0|true))||(__CLR4_5_258l58llvico0iq.R.iget(7026)==0&false))) {{
            __CLR4_5_258l58llvico0iq.R.inc(7027);StringDocumentTarget targetForDebug = new StringDocumentTarget();
            __CLR4_5_258l58llvico0iq.R.inc(7028);m.saveOntology(ont, format, targetForDebug);
            __CLR4_5_258l58llvico0iq.R.inc(7029);logger.trace(targetForDebug.toString());
        }
        }__CLR4_5_258l58llvico0iq.R.inc(7030);m.saveOntology(ont, format, target);
        __CLR4_5_258l58llvico0iq.R.inc(7031);handleSaved(target, format);
        __CLR4_5_258l58llvico0iq.R.inc(7032);OWLOntology ont2 = setupManager().loadOntologyFromOntologyDocument(new StringDocumentSource(target.toString(),
            OWLOntologyDocumentSourceBase.getNextDocumentIRI("string:ontology"), format, null),
            new OWLOntologyLoaderConfiguration().setReportStackTraces(true));
        __CLR4_5_258l58llvico0iq.R.inc(7033);if ((((logger.isTraceEnabled())&&(__CLR4_5_258l58llvico0iq.R.iget(7034)!=0|true))||(__CLR4_5_258l58llvico0iq.R.iget(7035)==0&false))) {{
            __CLR4_5_258l58llvico0iq.R.inc(7036);logger.trace("TestBase.roundTripOntology() ontology parsed");
            __CLR4_5_258l58llvico0iq.R.inc(7037);Set<OWLAxiom> axioms = ont2.getAxioms();
            __CLR4_5_258l58llvico0iq.R.inc(7038);for (OWLAxiom ax : axioms) {{
                __CLR4_5_258l58llvico0iq.R.inc(7039);logger.trace(ax.toString());
            }
        }}
        }__CLR4_5_258l58llvico0iq.R.inc(7040);equal(ont, ont2);
        __CLR4_5_258l58llvico0iq.R.inc(7041);return ont2;
    }finally{__CLR4_5_258l58llvico0iq.R.flushNeeded();}}

    // @Test
    public void checkVerify() {try{__CLR4_5_258l58llvico0iq.R.inc(7042);
        __CLR4_5_258l58llvico0iq.R.inc(7043);OWLDataProperty t = df.getOWLDataProperty(IRI.create("urn:test#t"));
        __CLR4_5_258l58llvico0iq.R.inc(7044);Set<OWLAxiom> ax1 = new HashSet<>();
        __CLR4_5_258l58llvico0iq.R.inc(7045);ax1.add(df.getOWLDataPropertyAssertionAxiom(t, df.getOWLAnonymousIndividual(), df.getOWLLiteral("test1")));
        __CLR4_5_258l58llvico0iq.R.inc(7046);ax1.add(df.getOWLDataPropertyAssertionAxiom(t, df.getOWLAnonymousIndividual(), df.getOWLLiteral("test2")));
        __CLR4_5_258l58llvico0iq.R.inc(7047);Set<OWLAxiom> ax2 = new HashSet<>();
        __CLR4_5_258l58llvico0iq.R.inc(7048);ax2.add(df.getOWLDataPropertyAssertionAxiom(t, df.getOWLAnonymousIndividual(), df.getOWLLiteral("test1")));
        __CLR4_5_258l58llvico0iq.R.inc(7049);ax2.add(df.getOWLDataPropertyAssertionAxiom(t, df.getOWLAnonymousIndividual(), df.getOWLLiteral("test2")));
        __CLR4_5_258l58llvico0iq.R.inc(7050);assertFalse(ax1.equals(ax2));
        __CLR4_5_258l58llvico0iq.R.inc(7051);assertTrue(verifyErrorIsDueToBlankNodesId(ax1, ax2));
    }finally{__CLR4_5_258l58llvico0iq.R.flushNeeded();}}

    @SuppressWarnings("unused")
    protected boolean isIgnoreDeclarationAxioms(OWLDocumentFormat format) {try{__CLR4_5_258l58llvico0iq.R.inc(7052);
        __CLR4_5_258l58llvico0iq.R.inc(7053);return true;
    }finally{__CLR4_5_258l58llvico0iq.R.flushNeeded();}}

    @SuppressWarnings("unused")
    protected void handleSaved(StringDocumentTarget target, OWLDocumentFormat format) {try{__CLR4_5_258l58llvico0iq.R.inc(7054);
        // System.out.println(target.toString());
    }finally{__CLR4_5_258l58llvico0iq.R.flushNeeded();}}

    @Nonnull
    protected OWLOntology loadOntologyFromString(@Nonnull String input) throws OWLOntologyCreationException {try{__CLR4_5_258l58llvico0iq.R.inc(7055);
        __CLR4_5_258l58llvico0iq.R.inc(7056);return setupManager().loadOntologyFromOntologyDocument(new StringDocumentSource(input));
    }finally{__CLR4_5_258l58llvico0iq.R.flushNeeded();}}

    @Nonnull
    protected OWLOntology loadOntologyFromString(@Nonnull String input, @Nonnull IRI i, @Nonnull OWLDocumentFormat f) {try{__CLR4_5_258l58llvico0iq.R.inc(7057);
        __CLR4_5_258l58llvico0iq.R.inc(7058);StringDocumentSource documentSource = new StringDocumentSource(input, i, f, null);
        __CLR4_5_258l58llvico0iq.R.inc(7059);try {
            __CLR4_5_258l58llvico0iq.R.inc(7060);return setupManager().loadOntologyFromOntologyDocument(documentSource);
        } catch (OWLOntologyCreationException e) {
            __CLR4_5_258l58llvico0iq.R.inc(7061);throw new OWLRuntimeException(e);
        }
    }finally{__CLR4_5_258l58llvico0iq.R.flushNeeded();}}
    @Nonnull
    protected OWLOntology loadOntologyFromString(@Nonnull String input, @Nonnull OWLDocumentFormat f) {try{__CLR4_5_258l58llvico0iq.R.inc(7062);
        __CLR4_5_258l58llvico0iq.R.inc(7063);StringDocumentSource documentSource = new StringDocumentSource(input, IRI.generateDocumentIRI(), f, null);
        __CLR4_5_258l58llvico0iq.R.inc(7064);try {
            __CLR4_5_258l58llvico0iq.R.inc(7065);return setupManager().loadOntologyFromOntologyDocument(documentSource);
        } catch (OWLOntologyCreationException e) {
            __CLR4_5_258l58llvico0iq.R.inc(7066);throw new OWLRuntimeException(e);
        }
    }finally{__CLR4_5_258l58llvico0iq.R.flushNeeded();}}

    @Nonnull
    protected OWLOntology loadOntologyFromString(@Nonnull StringDocumentSource input)
        throws OWLOntologyCreationException {try{__CLR4_5_258l58llvico0iq.R.inc(7067);
        __CLR4_5_258l58llvico0iq.R.inc(7068);return setupManager().loadOntologyFromOntologyDocument(input);
    }finally{__CLR4_5_258l58llvico0iq.R.flushNeeded();}}

    @Nonnull
    protected OWLOntology loadOntologyFromString(@Nonnull StringDocumentTarget input)
        throws OWLOntologyCreationException {try{__CLR4_5_258l58llvico0iq.R.inc(7069);
        __CLR4_5_258l58llvico0iq.R.inc(7070);return setupManager().loadOntologyFromOntologyDocument(new StringDocumentSource(input));
    }finally{__CLR4_5_258l58llvico0iq.R.flushNeeded();}}

    @Nonnull
    protected OWLOntology loadOntologyFromString(@Nonnull StringDocumentTarget input, OWLDocumentFormat f)
        throws OWLOntologyCreationException {try{__CLR4_5_258l58llvico0iq.R.inc(7071);
        __CLR4_5_258l58llvico0iq.R.inc(7072);return setupManager().loadOntologyFromOntologyDocument(new StringDocumentSource(input.toString(),
            OWLOntologyDocumentSourceBase.getNextDocumentIRI("string:ontology"), f, null));
    }finally{__CLR4_5_258l58llvico0iq.R.flushNeeded();}}

    @Nonnull
    protected OWLOntology loadOntologyStrict(@Nonnull StringDocumentTarget o) throws OWLOntologyCreationException {try{__CLR4_5_258l58llvico0iq.R.inc(7073);
        __CLR4_5_258l58llvico0iq.R.inc(7074);return loadOntologyWithConfig(o, new OWLOntologyLoaderConfiguration().setStrict(true));
    }finally{__CLR4_5_258l58llvico0iq.R.flushNeeded();}}

    @Nonnull
    protected OWLOntology loadOntologyWithConfig(@Nonnull StringDocumentTarget o,
        @Nonnull OWLOntologyLoaderConfiguration c) throws OWLOntologyCreationException {try{__CLR4_5_258l58llvico0iq.R.inc(7075);
        __CLR4_5_258l58llvico0iq.R.inc(7076);return setupManager().loadOntologyFromOntologyDocument(new StringDocumentSource(o), c);
    }finally{__CLR4_5_258l58llvico0iq.R.flushNeeded();}}

    @Nonnull
    protected StringDocumentTarget saveOntology(@Nonnull OWLOntology o) throws OWLOntologyStorageException {try{__CLR4_5_258l58llvico0iq.R.inc(7077);
        __CLR4_5_258l58llvico0iq.R.inc(7078);return saveOntology(o, o.getOWLOntologyManager().getOntologyFormat(o));
    }finally{__CLR4_5_258l58llvico0iq.R.flushNeeded();}}

    @Nonnull
    protected StringDocumentTarget saveOntology(@Nonnull OWLOntology o, @Nonnull OWLDocumentFormat format)
        throws OWLOntologyStorageException {try{__CLR4_5_258l58llvico0iq.R.inc(7079);
        __CLR4_5_258l58llvico0iq.R.inc(7080);StringDocumentTarget t = new StringDocumentTarget();
        __CLR4_5_258l58llvico0iq.R.inc(7081);o.getOWLOntologyManager().saveOntology(o, format, t);
        __CLR4_5_258l58llvico0iq.R.inc(7082);return t;
    }finally{__CLR4_5_258l58llvico0iq.R.flushNeeded();}}

    @Nonnull
    protected OWLOntology roundTrip(@Nonnull OWLOntology o, @Nonnull OWLDocumentFormat format)
        throws OWLOntologyCreationException, OWLOntologyStorageException {try{__CLR4_5_258l58llvico0iq.R.inc(7083);
        __CLR4_5_258l58llvico0iq.R.inc(7084);return loadOntologyFromString(saveOntology(o, format), format);
    }finally{__CLR4_5_258l58llvico0iq.R.flushNeeded();}}

    @Nonnull
    protected OWLOntology roundTrip(@Nonnull OWLOntology o, @Nonnull OWLDocumentFormat format,
        @Nonnull OWLOntologyLoaderConfiguration c) throws OWLOntologyCreationException, OWLOntologyStorageException {try{__CLR4_5_258l58llvico0iq.R.inc(7085);
        __CLR4_5_258l58llvico0iq.R.inc(7086);return loadOntologyWithConfig(saveOntology(o, format), c);
    }finally{__CLR4_5_258l58llvico0iq.R.flushNeeded();}}

    @Nonnull
    protected OWLOntology roundTrip(@Nonnull OWLOntology o) throws OWLOntologyCreationException,
        OWLOntologyStorageException {try{__CLR4_5_258l58llvico0iq.R.inc(7087);
        __CLR4_5_258l58llvico0iq.R.inc(7088);return loadOntologyFromString(saveOntology(o));
    }finally{__CLR4_5_258l58llvico0iq.R.flushNeeded();}}
}
