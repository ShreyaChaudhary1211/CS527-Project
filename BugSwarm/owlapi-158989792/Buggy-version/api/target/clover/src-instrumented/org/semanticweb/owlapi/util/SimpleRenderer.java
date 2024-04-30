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

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.formats.PrefixDocumentFormat;
import org.semanticweb.owlapi.io.OWLObjectRenderer;
import org.semanticweb.owlapi.model.*;

/**
 * A simple renderer that can be used for debugging purposes and provide an
 * implementation of the toString method for different implementations.
 * 
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.0.0
 */
public class SimpleRenderer implements OWLObjectVisitor, OWLObjectRenderer {public static class __CLR4_5_2b1gb1glvickrzx{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0061\u0070\u0069\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237201267L,8589935092L,14895,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private StringBuilder sb;
    private ShortFormProvider shortFormProvider;
    private IRIShortFormProvider iriShortFormProvider;

    /** default constructor */
    public SimpleRenderer() {try{__CLR4_5_2b1gb1glvickrzx.R.inc(14308);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14309);sb = new StringBuilder();
        __CLR4_5_2b1gb1glvickrzx.R.inc(14310);resetShortFormProvider();
    }finally{__CLR4_5_2b1gb1glvickrzx.R.flushNeeded();}}

    /** reset the renderer. */
    public void reset() {try{__CLR4_5_2b1gb1glvickrzx.R.inc(14311);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14312);sb = new StringBuilder();
    }finally{__CLR4_5_2b1gb1glvickrzx.R.flushNeeded();}}

    /**
     * @return true if default is used
     */
    public boolean isUsingDefaultShortFormProvider() {try{__CLR4_5_2b1gb1glvickrzx.R.inc(14313);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14314);return shortFormProvider instanceof DefaultPrefixManager;
    }finally{__CLR4_5_2b1gb1glvickrzx.R.flushNeeded();}}

    /**
     * Resets the short form provider to the default short form provider, which
     * is a PrefixManager with the default set of prefixes.
     */
    public final void resetShortFormProvider() {try{__CLR4_5_2b1gb1glvickrzx.R.inc(14315);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14316);DefaultPrefixManager defaultPrefixManager = new DefaultPrefixManager();
        __CLR4_5_2b1gb1glvickrzx.R.inc(14317);shortFormProvider = defaultPrefixManager;
        __CLR4_5_2b1gb1glvickrzx.R.inc(14318);iriShortFormProvider = defaultPrefixManager;
    }finally{__CLR4_5_2b1gb1glvickrzx.R.flushNeeded();}}

    /**
     * Resets the short form provider and adds prefix name to prefix mappings
     * based on the specified ontology's format (if it is a prefix format) and
     * possibly the ontologies in the imports closure.
     * 
     * @param ontology
     *        The ontology whose format will be used to obtain prefix mappings
     * @param manager
     *        A manager which can be used to obtain the format of the specified
     *        ontology (and possibly ontologies in its imports closure)
     * @param processImportedOntologies
     *        Specifies whether or not the prefix mapping should be obtained
     *        from imported ontologies.
     */
    public void setPrefixesFromOntologyFormat(@Nonnull OWLOntology ontology, @Nonnull OWLOntologyManager manager,
        boolean processImportedOntologies) {try{__CLR4_5_2b1gb1glvickrzx.R.inc(14319);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14320);resetShortFormProvider();
        __CLR4_5_2b1gb1glvickrzx.R.inc(14321);if ((((processImportedOntologies)&&(__CLR4_5_2b1gb1glvickrzx.R.iget(14322)!=0|true))||(__CLR4_5_2b1gb1glvickrzx.R.iget(14323)==0&false))) {{
            __CLR4_5_2b1gb1glvickrzx.R.inc(14324);for (OWLOntology importedOntology : manager.getImportsClosure(ontology)) {{
                __CLR4_5_2b1gb1glvickrzx.R.inc(14325);if ((((!importedOntology.equals(ontology))&&(__CLR4_5_2b1gb1glvickrzx.R.iget(14326)!=0|true))||(__CLR4_5_2b1gb1glvickrzx.R.iget(14327)==0&false))) {{
                    __CLR4_5_2b1gb1glvickrzx.R.inc(14328);copyPrefixes(manager.getOntologyFormat(importedOntology));
                }
            }}
        }}
        }__CLR4_5_2b1gb1glvickrzx.R.inc(14329);OWLDocumentFormat format = manager.getOntologyFormat(ontology);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14330);copyPrefixes(format);
    }finally{__CLR4_5_2b1gb1glvickrzx.R.flushNeeded();}}

    private void copyPrefixes(OWLDocumentFormat ontologyFormat) {try{__CLR4_5_2b1gb1glvickrzx.R.inc(14331);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14332);if ((((!(ontologyFormat instanceof PrefixDocumentFormat))&&(__CLR4_5_2b1gb1glvickrzx.R.iget(14333)!=0|true))||(__CLR4_5_2b1gb1glvickrzx.R.iget(14334)==0&false))) {{
            __CLR4_5_2b1gb1glvickrzx.R.inc(14335);return;
        }
        }__CLR4_5_2b1gb1glvickrzx.R.inc(14336);PrefixDocumentFormat prefixFormat = (PrefixDocumentFormat) ontologyFormat;
        __CLR4_5_2b1gb1glvickrzx.R.inc(14337);for (Map.Entry<String, String> e : prefixFormat.getPrefixName2PrefixMap().entrySet()) {{
            __CLR4_5_2b1gb1glvickrzx.R.inc(14338);setPrefix(e.getKey(), e.getValue());
        }
    }}finally{__CLR4_5_2b1gb1glvickrzx.R.flushNeeded();}}

    /**
     * Sets a prefix name for a given prefix. Note that prefix names MUST end
     * with a colon.
     * 
     * @param prefixName
     *        The prefix name (ending with a colon)
     * @param prefix
     *        The prefix that the prefix name maps to
     */
    public void setPrefix(@Nonnull String prefixName, @Nonnull String prefix) {try{__CLR4_5_2b1gb1glvickrzx.R.inc(14339);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14340);if ((((!isUsingDefaultShortFormProvider())&&(__CLR4_5_2b1gb1glvickrzx.R.iget(14341)!=0|true))||(__CLR4_5_2b1gb1glvickrzx.R.iget(14342)==0&false))) {{
            __CLR4_5_2b1gb1glvickrzx.R.inc(14343);resetShortFormProvider();
        }
        }__CLR4_5_2b1gb1glvickrzx.R.inc(14344);((DefaultPrefixManager) shortFormProvider).setPrefix(prefixName, prefix);
    }finally{__CLR4_5_2b1gb1glvickrzx.R.flushNeeded();}}

    @Override
    public void setShortFormProvider(ShortFormProvider shortFormProvider) {try{__CLR4_5_2b1gb1glvickrzx.R.inc(14345);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14346);this.shortFormProvider = shortFormProvider;
    }finally{__CLR4_5_2b1gb1glvickrzx.R.flushNeeded();}}

    /**
     * @param iri
     *        the iri to shorten
     * @return the short form
     */
    public String getShortForm(@Nonnull IRI iri) {try{__CLR4_5_2b1gb1glvickrzx.R.inc(14347);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14348);return iriShortFormProvider.getShortForm(iri);
    }finally{__CLR4_5_2b1gb1glvickrzx.R.flushNeeded();}}

    @Override
    public String render(OWLObject object) {try{__CLR4_5_2b1gb1glvickrzx.R.inc(14349);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14350);reset();
        __CLR4_5_2b1gb1glvickrzx.R.inc(14351);object.accept(this);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14352);return sb.toString();
    }finally{__CLR4_5_2b1gb1glvickrzx.R.flushNeeded();}}

    protected void render(Set<? extends OWLObject> objects) {try{__CLR4_5_2b1gb1glvickrzx.R.inc(14353);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14354);for (Iterator<? extends OWLObject> it = CollectionFactory.sortOptionally(objects).iterator(); (((it.hasNext())&&(__CLR4_5_2b1gb1glvickrzx.R.iget(14355)!=0|true))||(__CLR4_5_2b1gb1glvickrzx.R.iget(14356)==0&false));) {{
            __CLR4_5_2b1gb1glvickrzx.R.inc(14357);it.next().accept(this);
            __CLR4_5_2b1gb1glvickrzx.R.inc(14358);if ((((it.hasNext())&&(__CLR4_5_2b1gb1glvickrzx.R.iget(14359)!=0|true))||(__CLR4_5_2b1gb1glvickrzx.R.iget(14360)==0&false))) {{
                __CLR4_5_2b1gb1glvickrzx.R.inc(14361);sb.append(' ');
            }
        }}
    }}finally{__CLR4_5_2b1gb1glvickrzx.R.flushNeeded();}}

    @Override
    public void visit(OWLOntology ontology) {try{__CLR4_5_2b1gb1glvickrzx.R.inc(14362);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14363);sb.append("Ontology(").append(ontology.getOntologyID()).append(" [Axioms: ").append(ontology.getAxiomCount())
            .append("] [Logical axioms: ").append(ontology.getLogicalAxiomCount()).append("])");
    }finally{__CLR4_5_2b1gb1glvickrzx.R.flushNeeded();}}

    private void insertSpace() {try{__CLR4_5_2b1gb1glvickrzx.R.inc(14364);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14365);sb.append(' ');
    }finally{__CLR4_5_2b1gb1glvickrzx.R.flushNeeded();}}

    /**
     * @param axiom
     *        the axiom whose annotations should be written
     */
    public void writeAnnotations(OWLAxiom axiom) {try{__CLR4_5_2b1gb1glvickrzx.R.inc(14366);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14367);for (OWLAnnotation anno : axiom.getAnnotations()) {{
            __CLR4_5_2b1gb1glvickrzx.R.inc(14368);anno.accept(this);
            __CLR4_5_2b1gb1glvickrzx.R.inc(14369);insertSpace();
        }
    }}finally{__CLR4_5_2b1gb1glvickrzx.R.flushNeeded();}}

    @Override
    public void visit(OWLSubClassOfAxiom axiom) {try{__CLR4_5_2b1gb1glvickrzx.R.inc(14370);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14371);sb.append("SubClassOf(");
        __CLR4_5_2b1gb1glvickrzx.R.inc(14372);writeAnnotations(axiom);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14373);axiom.getSubClass().accept(this);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14374);insertSpace();
        __CLR4_5_2b1gb1glvickrzx.R.inc(14375);axiom.getSuperClass().accept(this);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14376);sb.append(')');
    }finally{__CLR4_5_2b1gb1glvickrzx.R.flushNeeded();}}

    @Override
    public void visit(OWLNegativeObjectPropertyAssertionAxiom axiom) {try{__CLR4_5_2b1gb1glvickrzx.R.inc(14377);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14378);sb.append("NegativeObjectPropertyAssertion(");
        __CLR4_5_2b1gb1glvickrzx.R.inc(14379);writeAnnotations(axiom);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14380);axiom.getProperty().accept(this);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14381);insertSpace();
        __CLR4_5_2b1gb1glvickrzx.R.inc(14382);axiom.getSubject().accept(this);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14383);insertSpace();
        __CLR4_5_2b1gb1glvickrzx.R.inc(14384);axiom.getObject().accept(this);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14385);sb.append(')');
    }finally{__CLR4_5_2b1gb1glvickrzx.R.flushNeeded();}}

    @Override
    public void visit(OWLAsymmetricObjectPropertyAxiom axiom) {try{__CLR4_5_2b1gb1glvickrzx.R.inc(14386);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14387);sb.append("AsymmetricObjectProperty(");
        __CLR4_5_2b1gb1glvickrzx.R.inc(14388);writeAnnotations(axiom);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14389);axiom.getProperty().accept(this);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14390);sb.append(')');
    }finally{__CLR4_5_2b1gb1glvickrzx.R.flushNeeded();}}

    @Override
    public void visit(OWLReflexiveObjectPropertyAxiom axiom) {try{__CLR4_5_2b1gb1glvickrzx.R.inc(14391);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14392);sb.append("ReflexiveObjectProperty(");
        __CLR4_5_2b1gb1glvickrzx.R.inc(14393);writeAnnotations(axiom);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14394);axiom.getProperty().accept(this);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14395);sb.append(')');
    }finally{__CLR4_5_2b1gb1glvickrzx.R.flushNeeded();}}

    @Override
    public void visit(OWLDisjointClassesAxiom axiom) {try{__CLR4_5_2b1gb1glvickrzx.R.inc(14396);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14397);sb.append("DisjointClasses(");
        __CLR4_5_2b1gb1glvickrzx.R.inc(14398);writeAnnotations(axiom);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14399);render(axiom.getClassExpressions());
        __CLR4_5_2b1gb1glvickrzx.R.inc(14400);sb.append(')');
    }finally{__CLR4_5_2b1gb1glvickrzx.R.flushNeeded();}}

    @Override
    public void visit(OWLDataPropertyDomainAxiom axiom) {try{__CLR4_5_2b1gb1glvickrzx.R.inc(14401);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14402);sb.append("DataPropertyDomain(");
        __CLR4_5_2b1gb1glvickrzx.R.inc(14403);writeAnnotations(axiom);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14404);axiom.getProperty().accept(this);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14405);insertSpace();
        __CLR4_5_2b1gb1glvickrzx.R.inc(14406);axiom.getDomain().accept(this);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14407);sb.append(')');
    }finally{__CLR4_5_2b1gb1glvickrzx.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectPropertyDomainAxiom axiom) {try{__CLR4_5_2b1gb1glvickrzx.R.inc(14408);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14409);sb.append("ObjectPropertyDomain(");
        __CLR4_5_2b1gb1glvickrzx.R.inc(14410);writeAnnotations(axiom);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14411);axiom.getProperty().accept(this);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14412);insertSpace();
        __CLR4_5_2b1gb1glvickrzx.R.inc(14413);axiom.getDomain().accept(this);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14414);sb.append(')');
    }finally{__CLR4_5_2b1gb1glvickrzx.R.flushNeeded();}}

    @Override
    public void visit(OWLEquivalentObjectPropertiesAxiom axiom) {try{__CLR4_5_2b1gb1glvickrzx.R.inc(14415);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14416);sb.append("EquivalentObjectProperties(");
        __CLR4_5_2b1gb1glvickrzx.R.inc(14417);writeAnnotations(axiom);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14418);render(axiom.getProperties());
        __CLR4_5_2b1gb1glvickrzx.R.inc(14419);sb.append(" )");
    }finally{__CLR4_5_2b1gb1glvickrzx.R.flushNeeded();}}

    @Override
    public void visit(OWLNegativeDataPropertyAssertionAxiom axiom) {try{__CLR4_5_2b1gb1glvickrzx.R.inc(14420);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14421);sb.append("NegativeDataPropertyAssertion(");
        __CLR4_5_2b1gb1glvickrzx.R.inc(14422);writeAnnotations(axiom);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14423);axiom.getProperty().accept(this);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14424);insertSpace();
        __CLR4_5_2b1gb1glvickrzx.R.inc(14425);axiom.getSubject().accept(this);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14426);insertSpace();
        __CLR4_5_2b1gb1glvickrzx.R.inc(14427);axiom.getObject().accept(this);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14428);sb.append(')');
    }finally{__CLR4_5_2b1gb1glvickrzx.R.flushNeeded();}}

    @Override
    public void visit(OWLDifferentIndividualsAxiom axiom) {try{__CLR4_5_2b1gb1glvickrzx.R.inc(14429);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14430);sb.append("DifferentIndividuals(");
        __CLR4_5_2b1gb1glvickrzx.R.inc(14431);writeAnnotations(axiom);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14432);render(axiom.getIndividuals());
        __CLR4_5_2b1gb1glvickrzx.R.inc(14433);sb.append(" )");
    }finally{__CLR4_5_2b1gb1glvickrzx.R.flushNeeded();}}

    @Override
    public void visit(OWLDisjointDataPropertiesAxiom axiom) {try{__CLR4_5_2b1gb1glvickrzx.R.inc(14434);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14435);sb.append("DisjointDataProperties(");
        __CLR4_5_2b1gb1glvickrzx.R.inc(14436);writeAnnotations(axiom);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14437);render(axiom.getProperties());
        __CLR4_5_2b1gb1glvickrzx.R.inc(14438);sb.append(" )");
    }finally{__CLR4_5_2b1gb1glvickrzx.R.flushNeeded();}}

    @Override
    public void visit(OWLDisjointObjectPropertiesAxiom axiom) {try{__CLR4_5_2b1gb1glvickrzx.R.inc(14439);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14440);sb.append("DisjointObjectProperties(");
        __CLR4_5_2b1gb1glvickrzx.R.inc(14441);writeAnnotations(axiom);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14442);render(axiom.getProperties());
        __CLR4_5_2b1gb1glvickrzx.R.inc(14443);sb.append(" )");
    }finally{__CLR4_5_2b1gb1glvickrzx.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectPropertyRangeAxiom axiom) {try{__CLR4_5_2b1gb1glvickrzx.R.inc(14444);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14445);sb.append("ObjectPropertyRange(");
        __CLR4_5_2b1gb1glvickrzx.R.inc(14446);writeAnnotations(axiom);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14447);axiom.getProperty().accept(this);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14448);insertSpace();
        __CLR4_5_2b1gb1glvickrzx.R.inc(14449);axiom.getRange().accept(this);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14450);sb.append(')');
    }finally{__CLR4_5_2b1gb1glvickrzx.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectPropertyAssertionAxiom axiom) {try{__CLR4_5_2b1gb1glvickrzx.R.inc(14451);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14452);sb.append("ObjectPropertyAssertion(");
        __CLR4_5_2b1gb1glvickrzx.R.inc(14453);writeAnnotations(axiom);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14454);axiom.getProperty().accept(this);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14455);insertSpace();
        __CLR4_5_2b1gb1glvickrzx.R.inc(14456);axiom.getSubject().accept(this);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14457);insertSpace();
        __CLR4_5_2b1gb1glvickrzx.R.inc(14458);axiom.getObject().accept(this);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14459);sb.append(')');
    }finally{__CLR4_5_2b1gb1glvickrzx.R.flushNeeded();}}

    @Override
    public void visit(OWLFunctionalObjectPropertyAxiom axiom) {try{__CLR4_5_2b1gb1glvickrzx.R.inc(14460);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14461);sb.append("FunctionalObjectProperty(");
        __CLR4_5_2b1gb1glvickrzx.R.inc(14462);writeAnnotations(axiom);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14463);axiom.getProperty().accept(this);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14464);sb.append(')');
    }finally{__CLR4_5_2b1gb1glvickrzx.R.flushNeeded();}}

    @Override
    public void visit(OWLSubObjectPropertyOfAxiom axiom) {try{__CLR4_5_2b1gb1glvickrzx.R.inc(14465);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14466);sb.append("SubObjectPropertyOf(");
        __CLR4_5_2b1gb1glvickrzx.R.inc(14467);writeAnnotations(axiom);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14468);axiom.getSubProperty().accept(this);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14469);insertSpace();
        __CLR4_5_2b1gb1glvickrzx.R.inc(14470);axiom.getSuperProperty().accept(this);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14471);sb.append(')');
    }finally{__CLR4_5_2b1gb1glvickrzx.R.flushNeeded();}}

    @Override
    public void visit(OWLDisjointUnionAxiom axiom) {try{__CLR4_5_2b1gb1glvickrzx.R.inc(14472);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14473);sb.append("DisjointUnion(");
        __CLR4_5_2b1gb1glvickrzx.R.inc(14474);writeAnnotations(axiom);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14475);axiom.getOWLClass().accept(this);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14476);insertSpace();
        __CLR4_5_2b1gb1glvickrzx.R.inc(14477);render(axiom.getClassExpressions());
        __CLR4_5_2b1gb1glvickrzx.R.inc(14478);sb.append(" )");
    }finally{__CLR4_5_2b1gb1glvickrzx.R.flushNeeded();}}

    @Override
    public void visit(OWLDeclarationAxiom axiom) {try{__CLR4_5_2b1gb1glvickrzx.R.inc(14479);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14480);sb.append("Declaration(");
        __CLR4_5_2b1gb1glvickrzx.R.inc(14481);writeAnnotations(axiom);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14482);OWLEntity entity = axiom.getEntity();
        __CLR4_5_2b1gb1glvickrzx.R.inc(14483);if ((((entity.isOWLClass())&&(__CLR4_5_2b1gb1glvickrzx.R.iget(14484)!=0|true))||(__CLR4_5_2b1gb1glvickrzx.R.iget(14485)==0&false))) {{
            __CLR4_5_2b1gb1glvickrzx.R.inc(14486);sb.append("Class(");
        } }else {__CLR4_5_2b1gb1glvickrzx.R.inc(14487);if ((((entity.isOWLObjectProperty())&&(__CLR4_5_2b1gb1glvickrzx.R.iget(14488)!=0|true))||(__CLR4_5_2b1gb1glvickrzx.R.iget(14489)==0&false))) {{
            __CLR4_5_2b1gb1glvickrzx.R.inc(14490);sb.append("ObjectProperty(");
        } }else {__CLR4_5_2b1gb1glvickrzx.R.inc(14491);if ((((entity.isOWLDataProperty())&&(__CLR4_5_2b1gb1glvickrzx.R.iget(14492)!=0|true))||(__CLR4_5_2b1gb1glvickrzx.R.iget(14493)==0&false))) {{
            __CLR4_5_2b1gb1glvickrzx.R.inc(14494);sb.append("DataProperty(");
        } }else {__CLR4_5_2b1gb1glvickrzx.R.inc(14495);if ((((entity.isOWLNamedIndividual())&&(__CLR4_5_2b1gb1glvickrzx.R.iget(14496)!=0|true))||(__CLR4_5_2b1gb1glvickrzx.R.iget(14497)==0&false))) {{
            __CLR4_5_2b1gb1glvickrzx.R.inc(14498);sb.append("NamedIndividual(");
        } }else {__CLR4_5_2b1gb1glvickrzx.R.inc(14499);if ((((entity.isOWLDatatype())&&(__CLR4_5_2b1gb1glvickrzx.R.iget(14500)!=0|true))||(__CLR4_5_2b1gb1glvickrzx.R.iget(14501)==0&false))) {{
            __CLR4_5_2b1gb1glvickrzx.R.inc(14502);sb.append("Datatype(");
        } }else {__CLR4_5_2b1gb1glvickrzx.R.inc(14503);if ((((entity.isOWLAnnotationProperty())&&(__CLR4_5_2b1gb1glvickrzx.R.iget(14504)!=0|true))||(__CLR4_5_2b1gb1glvickrzx.R.iget(14505)==0&false))) {{
            __CLR4_5_2b1gb1glvickrzx.R.inc(14506);sb.append("AnnotationProperty(");
        }
        }}}}}}__CLR4_5_2b1gb1glvickrzx.R.inc(14507);axiom.getEntity().accept(this);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14508);sb.append("))");
    }finally{__CLR4_5_2b1gb1glvickrzx.R.flushNeeded();}}

    @Override
    public void visit(OWLAnnotationAssertionAxiom axiom) {try{__CLR4_5_2b1gb1glvickrzx.R.inc(14509);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14510);sb.append("AnnotationAssertion(");
        __CLR4_5_2b1gb1glvickrzx.R.inc(14511);writeAnnotations(axiom);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14512);axiom.getProperty().accept(this);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14513);insertSpace();
        __CLR4_5_2b1gb1glvickrzx.R.inc(14514);axiom.getSubject().accept(this);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14515);insertSpace();
        __CLR4_5_2b1gb1glvickrzx.R.inc(14516);axiom.getValue().accept(this);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14517);sb.append(')');
    }finally{__CLR4_5_2b1gb1glvickrzx.R.flushNeeded();}}

    @Override
    public void visit(OWLSymmetricObjectPropertyAxiom axiom) {try{__CLR4_5_2b1gb1glvickrzx.R.inc(14518);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14519);sb.append("SymmetricObjectProperty(");
        __CLR4_5_2b1gb1glvickrzx.R.inc(14520);writeAnnotations(axiom);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14521);axiom.getProperty().accept(this);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14522);sb.append(')');
    }finally{__CLR4_5_2b1gb1glvickrzx.R.flushNeeded();}}

    @Override
    public void visit(OWLDataPropertyRangeAxiom axiom) {try{__CLR4_5_2b1gb1glvickrzx.R.inc(14523);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14524);sb.append("DataPropertyRange(");
        __CLR4_5_2b1gb1glvickrzx.R.inc(14525);writeAnnotations(axiom);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14526);axiom.getProperty().accept(this);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14527);insertSpace();
        __CLR4_5_2b1gb1glvickrzx.R.inc(14528);axiom.getRange().accept(this);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14529);sb.append(')');
    }finally{__CLR4_5_2b1gb1glvickrzx.R.flushNeeded();}}

    @Override
    public void visit(OWLFunctionalDataPropertyAxiom axiom) {try{__CLR4_5_2b1gb1glvickrzx.R.inc(14530);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14531);sb.append("FunctionalDataProperty(");
        __CLR4_5_2b1gb1glvickrzx.R.inc(14532);writeAnnotations(axiom);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14533);axiom.getProperty().accept(this);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14534);sb.append(')');
    }finally{__CLR4_5_2b1gb1glvickrzx.R.flushNeeded();}}

    @Override
    public void visit(OWLEquivalentDataPropertiesAxiom axiom) {try{__CLR4_5_2b1gb1glvickrzx.R.inc(14535);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14536);sb.append("EquivalentDataProperties(");
        __CLR4_5_2b1gb1glvickrzx.R.inc(14537);writeAnnotations(axiom);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14538);render(axiom.getProperties());
        __CLR4_5_2b1gb1glvickrzx.R.inc(14539);sb.append(" )");
    }finally{__CLR4_5_2b1gb1glvickrzx.R.flushNeeded();}}

    @Override
    public void visit(OWLClassAssertionAxiom axiom) {try{__CLR4_5_2b1gb1glvickrzx.R.inc(14540);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14541);sb.append("ClassAssertion(");
        __CLR4_5_2b1gb1glvickrzx.R.inc(14542);writeAnnotations(axiom);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14543);axiom.getClassExpression().accept(this);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14544);insertSpace();
        __CLR4_5_2b1gb1glvickrzx.R.inc(14545);axiom.getIndividual().accept(this);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14546);sb.append(')');
    }finally{__CLR4_5_2b1gb1glvickrzx.R.flushNeeded();}}

    @Override
    public void visit(OWLEquivalentClassesAxiom axiom) {try{__CLR4_5_2b1gb1glvickrzx.R.inc(14547);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14548);sb.append("EquivalentClasses(");
        __CLR4_5_2b1gb1glvickrzx.R.inc(14549);writeAnnotations(axiom);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14550);render(axiom.getClassExpressions());
        __CLR4_5_2b1gb1glvickrzx.R.inc(14551);sb.append(" )");
    }finally{__CLR4_5_2b1gb1glvickrzx.R.flushNeeded();}}

    @Override
    public void visit(OWLDataPropertyAssertionAxiom axiom) {try{__CLR4_5_2b1gb1glvickrzx.R.inc(14552);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14553);sb.append("DataPropertyAssertion(");
        __CLR4_5_2b1gb1glvickrzx.R.inc(14554);writeAnnotations(axiom);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14555);axiom.getProperty().accept(this);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14556);insertSpace();
        __CLR4_5_2b1gb1glvickrzx.R.inc(14557);axiom.getSubject().accept(this);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14558);insertSpace();
        __CLR4_5_2b1gb1glvickrzx.R.inc(14559);axiom.getObject().accept(this);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14560);sb.append(')');
    }finally{__CLR4_5_2b1gb1glvickrzx.R.flushNeeded();}}

    @Override
    public void visit(OWLTransitiveObjectPropertyAxiom axiom) {try{__CLR4_5_2b1gb1glvickrzx.R.inc(14561);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14562);sb.append("TransitiveObjectProperty(");
        __CLR4_5_2b1gb1glvickrzx.R.inc(14563);writeAnnotations(axiom);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14564);axiom.getProperty().accept(this);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14565);sb.append(')');
    }finally{__CLR4_5_2b1gb1glvickrzx.R.flushNeeded();}}

    @Override
    public void visit(OWLIrreflexiveObjectPropertyAxiom axiom) {try{__CLR4_5_2b1gb1glvickrzx.R.inc(14566);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14567);sb.append("IrreflexiveObjectProperty(");
        __CLR4_5_2b1gb1glvickrzx.R.inc(14568);writeAnnotations(axiom);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14569);axiom.getProperty().accept(this);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14570);sb.append(')');
    }finally{__CLR4_5_2b1gb1glvickrzx.R.flushNeeded();}}

    @Override
    public void visit(OWLSubDataPropertyOfAxiom axiom) {try{__CLR4_5_2b1gb1glvickrzx.R.inc(14571);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14572);sb.append("SubDataPropertyOf(");
        __CLR4_5_2b1gb1glvickrzx.R.inc(14573);writeAnnotations(axiom);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14574);axiom.getSubProperty().accept(this);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14575);insertSpace();
        __CLR4_5_2b1gb1glvickrzx.R.inc(14576);axiom.getSuperProperty().accept(this);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14577);sb.append(')');
    }finally{__CLR4_5_2b1gb1glvickrzx.R.flushNeeded();}}

    @Override
    public void visit(OWLInverseFunctionalObjectPropertyAxiom axiom) {try{__CLR4_5_2b1gb1glvickrzx.R.inc(14578);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14579);sb.append("InverseFunctionalObjectProperty(");
        __CLR4_5_2b1gb1glvickrzx.R.inc(14580);writeAnnotations(axiom);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14581);axiom.getProperty().accept(this);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14582);sb.append(')');
    }finally{__CLR4_5_2b1gb1glvickrzx.R.flushNeeded();}}

    @Override
    public void visit(OWLSameIndividualAxiom axiom) {try{__CLR4_5_2b1gb1glvickrzx.R.inc(14583);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14584);sb.append("SameIndividual(");
        __CLR4_5_2b1gb1glvickrzx.R.inc(14585);writeAnnotations(axiom);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14586);render(axiom.getIndividuals());
        __CLR4_5_2b1gb1glvickrzx.R.inc(14587);sb.append(" )");
    }finally{__CLR4_5_2b1gb1glvickrzx.R.flushNeeded();}}

    @Override
    public void visit(OWLSubPropertyChainOfAxiom axiom) {try{__CLR4_5_2b1gb1glvickrzx.R.inc(14588);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14589);sb.append("SubObjectPropertyOf(");
        __CLR4_5_2b1gb1glvickrzx.R.inc(14590);writeAnnotations(axiom);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14591);sb.append("ObjectPropertyChain(");
        __CLR4_5_2b1gb1glvickrzx.R.inc(14592);for (OWLObjectPropertyExpression prop : axiom.getPropertyChain()) {{
            __CLR4_5_2b1gb1glvickrzx.R.inc(14593);insertSpace();
            __CLR4_5_2b1gb1glvickrzx.R.inc(14594);prop.accept(this);
        }
        }__CLR4_5_2b1gb1glvickrzx.R.inc(14595);sb.append(" )");
        __CLR4_5_2b1gb1glvickrzx.R.inc(14596);insertSpace();
        __CLR4_5_2b1gb1glvickrzx.R.inc(14597);axiom.getSuperProperty().accept(this);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14598);sb.append(')');
    }finally{__CLR4_5_2b1gb1glvickrzx.R.flushNeeded();}}

    @Override
    public void visit(OWLClass ce) {try{__CLR4_5_2b1gb1glvickrzx.R.inc(14599);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14600);sb.append(shortFormProvider.getShortForm(ce));
    }finally{__CLR4_5_2b1gb1glvickrzx.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectIntersectionOf ce) {try{__CLR4_5_2b1gb1glvickrzx.R.inc(14601);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14602);sb.append("ObjectIntersectionOf(");
        __CLR4_5_2b1gb1glvickrzx.R.inc(14603);render(ce.getOperands());
        __CLR4_5_2b1gb1glvickrzx.R.inc(14604);sb.append(')');
    }finally{__CLR4_5_2b1gb1glvickrzx.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectUnionOf ce) {try{__CLR4_5_2b1gb1glvickrzx.R.inc(14605);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14606);sb.append("ObjectUnionOf(");
        __CLR4_5_2b1gb1glvickrzx.R.inc(14607);render(ce.getOperands());
        __CLR4_5_2b1gb1glvickrzx.R.inc(14608);sb.append(')');
    }finally{__CLR4_5_2b1gb1glvickrzx.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectComplementOf ce) {try{__CLR4_5_2b1gb1glvickrzx.R.inc(14609);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14610);sb.append("ObjectComplementOf(");
        __CLR4_5_2b1gb1glvickrzx.R.inc(14611);ce.getOperand().accept(this);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14612);sb.append(')');
    }finally{__CLR4_5_2b1gb1glvickrzx.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectSomeValuesFrom ce) {try{__CLR4_5_2b1gb1glvickrzx.R.inc(14613);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14614);sb.append("ObjectSomeValuesFrom(");
        __CLR4_5_2b1gb1glvickrzx.R.inc(14615);ce.getProperty().accept(this);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14616);insertSpace();
        __CLR4_5_2b1gb1glvickrzx.R.inc(14617);ce.getFiller().accept(this);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14618);sb.append(')');
    }finally{__CLR4_5_2b1gb1glvickrzx.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectAllValuesFrom ce) {try{__CLR4_5_2b1gb1glvickrzx.R.inc(14619);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14620);sb.append("ObjectAllValuesFrom(");
        __CLR4_5_2b1gb1glvickrzx.R.inc(14621);ce.getProperty().accept(this);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14622);insertSpace();
        __CLR4_5_2b1gb1glvickrzx.R.inc(14623);ce.getFiller().accept(this);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14624);sb.append(')');
    }finally{__CLR4_5_2b1gb1glvickrzx.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectHasValue ce) {try{__CLR4_5_2b1gb1glvickrzx.R.inc(14625);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14626);sb.append("ObjectHasValue(");
        __CLR4_5_2b1gb1glvickrzx.R.inc(14627);ce.getProperty().accept(this);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14628);insertSpace();
        __CLR4_5_2b1gb1glvickrzx.R.inc(14629);ce.getFiller().accept(this);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14630);sb.append(')');
    }finally{__CLR4_5_2b1gb1glvickrzx.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectMinCardinality ce) {try{__CLR4_5_2b1gb1glvickrzx.R.inc(14631);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14632);sb.append("ObjectMinCardinality(");
        __CLR4_5_2b1gb1glvickrzx.R.inc(14633);sb.append(ce.getCardinality());
        __CLR4_5_2b1gb1glvickrzx.R.inc(14634);insertSpace();
        __CLR4_5_2b1gb1glvickrzx.R.inc(14635);ce.getProperty().accept(this);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14636);insertSpace();
        __CLR4_5_2b1gb1glvickrzx.R.inc(14637);ce.getFiller().accept(this);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14638);sb.append(')');
    }finally{__CLR4_5_2b1gb1glvickrzx.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectExactCardinality ce) {try{__CLR4_5_2b1gb1glvickrzx.R.inc(14639);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14640);sb.append("ObjectExactCardinality(");
        __CLR4_5_2b1gb1glvickrzx.R.inc(14641);sb.append(ce.getCardinality());
        __CLR4_5_2b1gb1glvickrzx.R.inc(14642);insertSpace();
        __CLR4_5_2b1gb1glvickrzx.R.inc(14643);ce.getProperty().accept(this);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14644);insertSpace();
        __CLR4_5_2b1gb1glvickrzx.R.inc(14645);ce.getFiller().accept(this);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14646);sb.append(')');
    }finally{__CLR4_5_2b1gb1glvickrzx.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectMaxCardinality ce) {try{__CLR4_5_2b1gb1glvickrzx.R.inc(14647);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14648);sb.append("ObjectMaxCardinality(");
        __CLR4_5_2b1gb1glvickrzx.R.inc(14649);sb.append(ce.getCardinality());
        __CLR4_5_2b1gb1glvickrzx.R.inc(14650);insertSpace();
        __CLR4_5_2b1gb1glvickrzx.R.inc(14651);ce.getProperty().accept(this);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14652);insertSpace();
        __CLR4_5_2b1gb1glvickrzx.R.inc(14653);ce.getFiller().accept(this);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14654);sb.append(')');
    }finally{__CLR4_5_2b1gb1glvickrzx.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectHasSelf ce) {try{__CLR4_5_2b1gb1glvickrzx.R.inc(14655);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14656);sb.append("ObjectHasSelf(");
        __CLR4_5_2b1gb1glvickrzx.R.inc(14657);ce.getProperty().accept(this);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14658);sb.append(')');
    }finally{__CLR4_5_2b1gb1glvickrzx.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectOneOf ce) {try{__CLR4_5_2b1gb1glvickrzx.R.inc(14659);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14660);sb.append("ObjectOneOf(");
        __CLR4_5_2b1gb1glvickrzx.R.inc(14661);render(ce.getIndividuals());
        __CLR4_5_2b1gb1glvickrzx.R.inc(14662);sb.append(')');
    }finally{__CLR4_5_2b1gb1glvickrzx.R.flushNeeded();}}

    @Override
    public void visit(OWLDataSomeValuesFrom ce) {try{__CLR4_5_2b1gb1glvickrzx.R.inc(14663);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14664);sb.append("DataSomeValuesFrom(");
        __CLR4_5_2b1gb1glvickrzx.R.inc(14665);ce.getProperty().accept(this);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14666);insertSpace();
        __CLR4_5_2b1gb1glvickrzx.R.inc(14667);ce.getFiller().accept(this);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14668);sb.append(')');
    }finally{__CLR4_5_2b1gb1glvickrzx.R.flushNeeded();}}

    @Override
    public void visit(OWLDataAllValuesFrom ce) {try{__CLR4_5_2b1gb1glvickrzx.R.inc(14669);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14670);sb.append("DataAllValuesFrom(");
        __CLR4_5_2b1gb1glvickrzx.R.inc(14671);ce.getProperty().accept(this);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14672);insertSpace();
        __CLR4_5_2b1gb1glvickrzx.R.inc(14673);ce.getFiller().accept(this);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14674);sb.append(')');
    }finally{__CLR4_5_2b1gb1glvickrzx.R.flushNeeded();}}

    @Override
    public void visit(OWLDataHasValue ce) {try{__CLR4_5_2b1gb1glvickrzx.R.inc(14675);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14676);sb.append("DataHasValue(");
        __CLR4_5_2b1gb1glvickrzx.R.inc(14677);ce.getProperty().accept(this);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14678);insertSpace();
        __CLR4_5_2b1gb1glvickrzx.R.inc(14679);ce.getFiller().accept(this);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14680);sb.append(')');
    }finally{__CLR4_5_2b1gb1glvickrzx.R.flushNeeded();}}

    @Override
    public void visit(OWLDataMinCardinality ce) {try{__CLR4_5_2b1gb1glvickrzx.R.inc(14681);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14682);sb.append("DataMinCardinality(");
        __CLR4_5_2b1gb1glvickrzx.R.inc(14683);sb.append(ce.getCardinality());
        __CLR4_5_2b1gb1glvickrzx.R.inc(14684);insertSpace();
        __CLR4_5_2b1gb1glvickrzx.R.inc(14685);ce.getProperty().accept(this);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14686);insertSpace();
        __CLR4_5_2b1gb1glvickrzx.R.inc(14687);ce.getFiller().accept(this);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14688);sb.append(')');
    }finally{__CLR4_5_2b1gb1glvickrzx.R.flushNeeded();}}

    @Override
    public void visit(OWLDataExactCardinality ce) {try{__CLR4_5_2b1gb1glvickrzx.R.inc(14689);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14690);sb.append("DataExactCardinality(");
        __CLR4_5_2b1gb1glvickrzx.R.inc(14691);sb.append(ce.getCardinality());
        __CLR4_5_2b1gb1glvickrzx.R.inc(14692);insertSpace();
        __CLR4_5_2b1gb1glvickrzx.R.inc(14693);ce.getProperty().accept(this);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14694);insertSpace();
        __CLR4_5_2b1gb1glvickrzx.R.inc(14695);ce.getFiller().accept(this);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14696);sb.append(')');
    }finally{__CLR4_5_2b1gb1glvickrzx.R.flushNeeded();}}

    @Override
    public void visit(OWLDataMaxCardinality ce) {try{__CLR4_5_2b1gb1glvickrzx.R.inc(14697);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14698);sb.append("DataMaxCardinality(");
        __CLR4_5_2b1gb1glvickrzx.R.inc(14699);sb.append(ce.getCardinality());
        __CLR4_5_2b1gb1glvickrzx.R.inc(14700);insertSpace();
        __CLR4_5_2b1gb1glvickrzx.R.inc(14701);ce.getProperty().accept(this);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14702);insertSpace();
        __CLR4_5_2b1gb1glvickrzx.R.inc(14703);ce.getFiller().accept(this);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14704);sb.append(')');
    }finally{__CLR4_5_2b1gb1glvickrzx.R.flushNeeded();}}

    @Override
    public void visit(OWLDatatype node) {try{__CLR4_5_2b1gb1glvickrzx.R.inc(14705);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14706);sb.append(shortFormProvider.getShortForm(node));
    }finally{__CLR4_5_2b1gb1glvickrzx.R.flushNeeded();}}

    @Override
    public void visit(OWLDataComplementOf node) {try{__CLR4_5_2b1gb1glvickrzx.R.inc(14707);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14708);sb.append("DataComplementOf(");
        __CLR4_5_2b1gb1glvickrzx.R.inc(14709);node.getDataRange().accept(this);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14710);sb.append(')');
    }finally{__CLR4_5_2b1gb1glvickrzx.R.flushNeeded();}}

    @Override
    public void visit(OWLDataOneOf node) {try{__CLR4_5_2b1gb1glvickrzx.R.inc(14711);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14712);sb.append("DataOneOf(");
        __CLR4_5_2b1gb1glvickrzx.R.inc(14713);render(node.getValues());
        __CLR4_5_2b1gb1glvickrzx.R.inc(14714);sb.append(" )");
    }finally{__CLR4_5_2b1gb1glvickrzx.R.flushNeeded();}}

    @Override
    public void visit(OWLDatatypeRestriction node) {try{__CLR4_5_2b1gb1glvickrzx.R.inc(14715);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14716);sb.append("DataRangeRestriction(");
        __CLR4_5_2b1gb1glvickrzx.R.inc(14717);node.getDatatype().accept(this);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14718);for (OWLFacetRestriction restriction : node.getFacetRestrictions()) {{
            __CLR4_5_2b1gb1glvickrzx.R.inc(14719);insertSpace();
            __CLR4_5_2b1gb1glvickrzx.R.inc(14720);restriction.accept(this);
        }
        }__CLR4_5_2b1gb1glvickrzx.R.inc(14721);sb.append(')');
    }finally{__CLR4_5_2b1gb1glvickrzx.R.flushNeeded();}}

    @Override
    public void visit(OWLFacetRestriction node) {try{__CLR4_5_2b1gb1glvickrzx.R.inc(14722);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14723);sb.append("facetRestriction(");
        __CLR4_5_2b1gb1glvickrzx.R.inc(14724);sb.append(node.getFacet());
        __CLR4_5_2b1gb1glvickrzx.R.inc(14725);insertSpace();
        __CLR4_5_2b1gb1glvickrzx.R.inc(14726);node.getFacetValue().accept(this);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14727);sb.append(')');
    }finally{__CLR4_5_2b1gb1glvickrzx.R.flushNeeded();}}

    @Override
    public void visit(OWLLiteral node) {try{__CLR4_5_2b1gb1glvickrzx.R.inc(14728);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14729);String literal = EscapeUtils.escapeString(node.getLiteral());
        __CLR4_5_2b1gb1glvickrzx.R.inc(14730);if ((((node.isRDFPlainLiteral())&&(__CLR4_5_2b1gb1glvickrzx.R.iget(14731)!=0|true))||(__CLR4_5_2b1gb1glvickrzx.R.iget(14732)==0&false))) {{
            // We can use a syntactic shortcut
            __CLR4_5_2b1gb1glvickrzx.R.inc(14733);sb.append('"').append(literal).append('"');
            __CLR4_5_2b1gb1glvickrzx.R.inc(14734);if ((((node.hasLang())&&(__CLR4_5_2b1gb1glvickrzx.R.iget(14735)!=0|true))||(__CLR4_5_2b1gb1glvickrzx.R.iget(14736)==0&false))) {{
                __CLR4_5_2b1gb1glvickrzx.R.inc(14737);sb.append('@').append(node.getLang());
            }
        }} }else {{
            __CLR4_5_2b1gb1glvickrzx.R.inc(14738);sb.append('"').append(literal).append("\"^^");
            __CLR4_5_2b1gb1glvickrzx.R.inc(14739);node.getDatatype().accept(this);
        }
    }}finally{__CLR4_5_2b1gb1glvickrzx.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectProperty property) {try{__CLR4_5_2b1gb1glvickrzx.R.inc(14740);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14741);sb.append(shortFormProvider.getShortForm(property));
    }finally{__CLR4_5_2b1gb1glvickrzx.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectInverseOf property) {try{__CLR4_5_2b1gb1glvickrzx.R.inc(14742);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14743);sb.append("InverseOf(");
        __CLR4_5_2b1gb1glvickrzx.R.inc(14744);property.getInverse().accept(this);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14745);sb.append(')');
    }finally{__CLR4_5_2b1gb1glvickrzx.R.flushNeeded();}}

    @Override
    public void visit(OWLDataProperty property) {try{__CLR4_5_2b1gb1glvickrzx.R.inc(14746);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14747);sb.append(shortFormProvider.getShortForm(property));
    }finally{__CLR4_5_2b1gb1glvickrzx.R.flushNeeded();}}

    @Override
    public void visit(OWLNamedIndividual individual) {try{__CLR4_5_2b1gb1glvickrzx.R.inc(14748);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14749);sb.append(shortFormProvider.getShortForm(individual));
    }finally{__CLR4_5_2b1gb1glvickrzx.R.flushNeeded();}}

    @Override
    public void visit(OWLInverseObjectPropertiesAxiom axiom) {try{__CLR4_5_2b1gb1glvickrzx.R.inc(14750);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14751);sb.append("InverseObjectProperties(");
        __CLR4_5_2b1gb1glvickrzx.R.inc(14752);writeAnnotations(axiom);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14753);axiom.getFirstProperty().accept(this);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14754);sb.append(' ');
        __CLR4_5_2b1gb1glvickrzx.R.inc(14755);axiom.getSecondProperty().accept(this);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14756);sb.append(')');
    }finally{__CLR4_5_2b1gb1glvickrzx.R.flushNeeded();}}

    @Override
    public void visit(OWLHasKeyAxiom axiom) {try{__CLR4_5_2b1gb1glvickrzx.R.inc(14757);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14758);sb.append("HasKey(");
        __CLR4_5_2b1gb1glvickrzx.R.inc(14759);writeAnnotations(axiom);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14760);axiom.getClassExpression().accept(this);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14761);sb.append(" (");
        __CLR4_5_2b1gb1glvickrzx.R.inc(14762);for (OWLObjectPropertyExpression prop : axiom.getObjectPropertyExpressions()) {{
            __CLR4_5_2b1gb1glvickrzx.R.inc(14763);prop.accept(this);
            __CLR4_5_2b1gb1glvickrzx.R.inc(14764);sb.append(' ');
        }
        }__CLR4_5_2b1gb1glvickrzx.R.inc(14765);sb.append(") (");
        __CLR4_5_2b1gb1glvickrzx.R.inc(14766);for (OWLDataPropertyExpression prop : axiom.getDataPropertyExpressions()) {{
            __CLR4_5_2b1gb1glvickrzx.R.inc(14767);prop.accept(this);
            __CLR4_5_2b1gb1glvickrzx.R.inc(14768);sb.append(' ');
        }
        }__CLR4_5_2b1gb1glvickrzx.R.inc(14769);sb.append(')');
        __CLR4_5_2b1gb1glvickrzx.R.inc(14770);sb.append(')');
    }finally{__CLR4_5_2b1gb1glvickrzx.R.flushNeeded();}}

    @Override
    public void visit(OWLDataIntersectionOf node) {try{__CLR4_5_2b1gb1glvickrzx.R.inc(14771);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14772);sb.append("DataIntersectionOf(");
        __CLR4_5_2b1gb1glvickrzx.R.inc(14773);for (OWLDataRange rng : node.getOperands()) {{
            __CLR4_5_2b1gb1glvickrzx.R.inc(14774);rng.accept(this);
            __CLR4_5_2b1gb1glvickrzx.R.inc(14775);sb.append(' ');
        }
        }__CLR4_5_2b1gb1glvickrzx.R.inc(14776);sb.append(')');
    }finally{__CLR4_5_2b1gb1glvickrzx.R.flushNeeded();}}

    @Override
    public void visit(OWLDataUnionOf node) {try{__CLR4_5_2b1gb1glvickrzx.R.inc(14777);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14778);sb.append("DataUnionOf(");
        __CLR4_5_2b1gb1glvickrzx.R.inc(14779);for (OWLDataRange rng : node.getOperands()) {{
            __CLR4_5_2b1gb1glvickrzx.R.inc(14780);rng.accept(this);
            __CLR4_5_2b1gb1glvickrzx.R.inc(14781);sb.append(' ');
        }
        }__CLR4_5_2b1gb1glvickrzx.R.inc(14782);sb.append(')');
    }finally{__CLR4_5_2b1gb1glvickrzx.R.flushNeeded();}}

    @Override
    public void visit(OWLAnnotationProperty property) {try{__CLR4_5_2b1gb1glvickrzx.R.inc(14783);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14784);sb.append(shortFormProvider.getShortForm(property));
    }finally{__CLR4_5_2b1gb1glvickrzx.R.flushNeeded();}}

    @Override
    public void visit(OWLAnnotationPropertyDomainAxiom axiom) {try{__CLR4_5_2b1gb1glvickrzx.R.inc(14785);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14786);sb.append("AnnotationPropertyDomain(");
        __CLR4_5_2b1gb1glvickrzx.R.inc(14787);axiom.getProperty().accept(this);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14788);sb.append(' ');
        __CLR4_5_2b1gb1glvickrzx.R.inc(14789);axiom.getDomain().accept(this);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14790);sb.append(')');
    }finally{__CLR4_5_2b1gb1glvickrzx.R.flushNeeded();}}

    @Override
    public void visit(OWLAnnotationPropertyRangeAxiom axiom) {try{__CLR4_5_2b1gb1glvickrzx.R.inc(14791);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14792);sb.append("AnnotationPropertyRange(");
        __CLR4_5_2b1gb1glvickrzx.R.inc(14793);axiom.getProperty().accept(this);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14794);sb.append(' ');
        __CLR4_5_2b1gb1glvickrzx.R.inc(14795);axiom.getRange().accept(this);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14796);sb.append(')');
    }finally{__CLR4_5_2b1gb1glvickrzx.R.flushNeeded();}}

    @Override
    public void visit(OWLSubAnnotationPropertyOfAxiom axiom) {try{__CLR4_5_2b1gb1glvickrzx.R.inc(14797);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14798);sb.append("SubAnnotationPropertyOf(");
        __CLR4_5_2b1gb1glvickrzx.R.inc(14799);writeAnnotations(axiom);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14800);axiom.getSubProperty().accept(this);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14801);sb.append(' ');
        __CLR4_5_2b1gb1glvickrzx.R.inc(14802);axiom.getSuperProperty().accept(this);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14803);sb.append(')');
    }finally{__CLR4_5_2b1gb1glvickrzx.R.flushNeeded();}}

    @Override
    public void visit(OWLAnonymousIndividual individual) {try{__CLR4_5_2b1gb1glvickrzx.R.inc(14804);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14805);sb.append(individual.getID());
    }finally{__CLR4_5_2b1gb1glvickrzx.R.flushNeeded();}}

    @Override
    public void visit(IRI iri) {try{__CLR4_5_2b1gb1glvickrzx.R.inc(14806);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14807);sb.append('<');
        __CLR4_5_2b1gb1glvickrzx.R.inc(14808);sb.append(iri);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14809);sb.append('>');
    }finally{__CLR4_5_2b1gb1glvickrzx.R.flushNeeded();}}

    @Override
    public void visit(OWLAnnotation node) {try{__CLR4_5_2b1gb1glvickrzx.R.inc(14810);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14811);sb.append("Annotation(");
        __CLR4_5_2b1gb1glvickrzx.R.inc(14812);Set<OWLAnnotation> annos = node.getAnnotations();
        __CLR4_5_2b1gb1glvickrzx.R.inc(14813);for (OWLAnnotation anno : annos) {{
            __CLR4_5_2b1gb1glvickrzx.R.inc(14814);anno.accept(this);
            __CLR4_5_2b1gb1glvickrzx.R.inc(14815);sb.append(' ');
        }
        }__CLR4_5_2b1gb1glvickrzx.R.inc(14816);node.getProperty().accept(this);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14817);sb.append(' ');
        __CLR4_5_2b1gb1glvickrzx.R.inc(14818);node.getValue().accept(this);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14819);sb.append(')');
    }finally{__CLR4_5_2b1gb1glvickrzx.R.flushNeeded();}}

    @Override
    public void visit(SWRLRule rule) {try{__CLR4_5_2b1gb1glvickrzx.R.inc(14820);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14821);sb.append("DLSafeRule(");
        __CLR4_5_2b1gb1glvickrzx.R.inc(14822);writeAnnotations(rule);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14823);sb.append(" Body(");
        __CLR4_5_2b1gb1glvickrzx.R.inc(14824);render(rule.getBody());
        __CLR4_5_2b1gb1glvickrzx.R.inc(14825);sb.append(')');
        __CLR4_5_2b1gb1glvickrzx.R.inc(14826);sb.append(" Head(");
        __CLR4_5_2b1gb1glvickrzx.R.inc(14827);render(rule.getHead());
        __CLR4_5_2b1gb1glvickrzx.R.inc(14828);sb.append(')');
        __CLR4_5_2b1gb1glvickrzx.R.inc(14829);sb.append(" )");
    }finally{__CLR4_5_2b1gb1glvickrzx.R.flushNeeded();}}

    @Override
    public void visit(SWRLClassAtom node) {try{__CLR4_5_2b1gb1glvickrzx.R.inc(14830);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14831);sb.append("ClassAtom(");
        __CLR4_5_2b1gb1glvickrzx.R.inc(14832);node.getPredicate().accept(this);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14833);sb.append(' ');
        __CLR4_5_2b1gb1glvickrzx.R.inc(14834);node.getArgument().accept(this);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14835);sb.append(')');
    }finally{__CLR4_5_2b1gb1glvickrzx.R.flushNeeded();}}

    @Override
    public void visit(SWRLDataRangeAtom node) {try{__CLR4_5_2b1gb1glvickrzx.R.inc(14836);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14837);sb.append("DataRangeAtom(");
        __CLR4_5_2b1gb1glvickrzx.R.inc(14838);node.getPredicate().accept(this);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14839);sb.append(' ');
        __CLR4_5_2b1gb1glvickrzx.R.inc(14840);node.getArgument().accept(this);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14841);sb.append(')');
    }finally{__CLR4_5_2b1gb1glvickrzx.R.flushNeeded();}}

    @Override
    public void visit(SWRLDifferentIndividualsAtom node) {try{__CLR4_5_2b1gb1glvickrzx.R.inc(14842);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14843);sb.append("DifferentFromAtom(");
        __CLR4_5_2b1gb1glvickrzx.R.inc(14844);node.getFirstArgument().accept(this);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14845);sb.append(' ');
        __CLR4_5_2b1gb1glvickrzx.R.inc(14846);node.getSecondArgument().accept(this);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14847);sb.append(')');
    }finally{__CLR4_5_2b1gb1glvickrzx.R.flushNeeded();}}

    @Override
    public void visit(SWRLSameIndividualAtom node) {try{__CLR4_5_2b1gb1glvickrzx.R.inc(14848);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14849);sb.append("SameAsAtom(");
        __CLR4_5_2b1gb1glvickrzx.R.inc(14850);node.getFirstArgument().accept(this);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14851);sb.append(' ');
        __CLR4_5_2b1gb1glvickrzx.R.inc(14852);node.getSecondArgument().accept(this);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14853);sb.append(')');
    }finally{__CLR4_5_2b1gb1glvickrzx.R.flushNeeded();}}

    @Override
    public void visit(SWRLObjectPropertyAtom node) {try{__CLR4_5_2b1gb1glvickrzx.R.inc(14854);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14855);sb.append("ObjectPropertyAtom(");
        __CLR4_5_2b1gb1glvickrzx.R.inc(14856);node.getPredicate().accept(this);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14857);sb.append(' ');
        __CLR4_5_2b1gb1glvickrzx.R.inc(14858);node.getFirstArgument().accept(this);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14859);sb.append(' ');
        __CLR4_5_2b1gb1glvickrzx.R.inc(14860);node.getSecondArgument().accept(this);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14861);sb.append(')');
    }finally{__CLR4_5_2b1gb1glvickrzx.R.flushNeeded();}}

    @Override
    public void visit(SWRLDataPropertyAtom node) {try{__CLR4_5_2b1gb1glvickrzx.R.inc(14862);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14863);sb.append("DataPropertyAtom(");
        __CLR4_5_2b1gb1glvickrzx.R.inc(14864);node.getPredicate().accept(this);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14865);sb.append(' ');
        __CLR4_5_2b1gb1glvickrzx.R.inc(14866);node.getFirstArgument().accept(this);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14867);sb.append(' ');
        __CLR4_5_2b1gb1glvickrzx.R.inc(14868);node.getSecondArgument().accept(this);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14869);sb.append(')');
    }finally{__CLR4_5_2b1gb1glvickrzx.R.flushNeeded();}}

    @Override
    public void visit(SWRLBuiltInAtom node) {try{__CLR4_5_2b1gb1glvickrzx.R.inc(14870);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14871);sb.append("BuiltInAtom(");
        __CLR4_5_2b1gb1glvickrzx.R.inc(14872);sb.append(getShortForm(node.getPredicate()));
        __CLR4_5_2b1gb1glvickrzx.R.inc(14873);sb.append(' ');
        __CLR4_5_2b1gb1glvickrzx.R.inc(14874);for (SWRLArgument arg : node.getArguments()) {{
            __CLR4_5_2b1gb1glvickrzx.R.inc(14875);arg.accept(this);
            __CLR4_5_2b1gb1glvickrzx.R.inc(14876);sb.append(' ');
        }
        }__CLR4_5_2b1gb1glvickrzx.R.inc(14877);sb.append(')');
    }finally{__CLR4_5_2b1gb1glvickrzx.R.flushNeeded();}}

    @Override
    public void visit(OWLDatatypeDefinitionAxiom axiom) {try{__CLR4_5_2b1gb1glvickrzx.R.inc(14878);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14879);sb.append("DatatypeDefinition(");
        __CLR4_5_2b1gb1glvickrzx.R.inc(14880);writeAnnotations(axiom);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14881);axiom.getDatatype().accept(this);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14882);sb.append(' ');
        __CLR4_5_2b1gb1glvickrzx.R.inc(14883);axiom.getDataRange().accept(this);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14884);sb.append(')');
    }finally{__CLR4_5_2b1gb1glvickrzx.R.flushNeeded();}}

    @Override
    public void visit(SWRLVariable node) {try{__CLR4_5_2b1gb1glvickrzx.R.inc(14885);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14886);sb.append("Variable(");
        __CLR4_5_2b1gb1glvickrzx.R.inc(14887);sb.append(getShortForm(node.getIRI()));
        __CLR4_5_2b1gb1glvickrzx.R.inc(14888);sb.append(')');
    }finally{__CLR4_5_2b1gb1glvickrzx.R.flushNeeded();}}

    @Override
    public void visit(SWRLIndividualArgument node) {try{__CLR4_5_2b1gb1glvickrzx.R.inc(14889);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14890);node.getIndividual().accept(this);
    }finally{__CLR4_5_2b1gb1glvickrzx.R.flushNeeded();}}

    @Override
    public void visit(SWRLLiteralArgument node) {try{__CLR4_5_2b1gb1glvickrzx.R.inc(14891);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14892);node.getLiteral().accept(this);
    }finally{__CLR4_5_2b1gb1glvickrzx.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_5_2b1gb1glvickrzx.R.inc(14893);
        __CLR4_5_2b1gb1glvickrzx.R.inc(14894);return sb.toString();
    }finally{__CLR4_5_2b1gb1glvickrzx.R.flushNeeded();}}
}
