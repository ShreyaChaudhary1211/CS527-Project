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
package org.semanticweb.owlapi.functional.renderer;

import static org.semanticweb.owlapi.model.parameters.Imports.*;
import static org.semanticweb.owlapi.util.CollectionFactory.sortOptionally;
import static org.semanticweb.owlapi.vocab.OWLRDFVocabulary.RDFS_LABEL;
import static org.semanticweb.owlapi.vocab.OWLXMLVocabulary.*;

import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.formats.PrefixDocumentFormat;
import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.model.parameters.Imports;
import org.semanticweb.owlapi.util.AnnotationValueShortFormProvider;
import org.semanticweb.owlapi.util.CollectionFactory;
import org.semanticweb.owlapi.util.DefaultPrefixManager;
import org.semanticweb.owlapi.util.EscapeUtils;
import org.semanticweb.owlapi.vocab.OWLXMLVocabulary;

import com.google.common.base.Optional;

/**
 * The Class OWLObjectRenderer.
 * 
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.0.0
 */
public class FunctionalSyntaxObjectRenderer implements OWLObjectVisitor {public static class __CLR4_5_28p08p0lvicma88{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,12169,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Nonnull
    private DefaultPrefixManager defaultPrefixManager = new DefaultPrefixManager();
    private PrefixManager prefixManager;
    protected final OWLOntology ont;
    private final Writer writer;
    private boolean writeEntitiesAsURIs = true;
    private OWLObject focusedObject;
    private boolean addMissingDeclarations = true;
    protected AnnotationValueShortFormProvider labelMaker = null;

    /**
     * @param ontology
     *        the ontology
     * @param writer
     *        the writer
     */
    public FunctionalSyntaxObjectRenderer(@Nonnull OWLOntology ontology, Writer writer) {try{__CLR4_5_28p08p0lvicma88.R.inc(11268);
        __CLR4_5_28p08p0lvicma88.R.inc(11269);ont = ontology;
        __CLR4_5_28p08p0lvicma88.R.inc(11270);this.writer = writer;
        __CLR4_5_28p08p0lvicma88.R.inc(11271);prefixManager = defaultPrefixManager;
        __CLR4_5_28p08p0lvicma88.R.inc(11272);OWLDocumentFormat ontologyFormat = ontology.getOWLOntologyManager().getOntologyFormat(ontology);
        // reuse the setting on the existing format, if there is one
        __CLR4_5_28p08p0lvicma88.R.inc(11273);if ((((ontologyFormat != null)&&(__CLR4_5_28p08p0lvicma88.R.iget(11274)!=0|true))||(__CLR4_5_28p08p0lvicma88.R.iget(11275)==0&false))) {{
            __CLR4_5_28p08p0lvicma88.R.inc(11276);addMissingDeclarations = ontologyFormat.isAddMissingTypes();
        }
        }__CLR4_5_28p08p0lvicma88.R.inc(11277);if ((((ontologyFormat instanceof PrefixDocumentFormat)&&(__CLR4_5_28p08p0lvicma88.R.iget(11278)!=0|true))||(__CLR4_5_28p08p0lvicma88.R.iget(11279)==0&false))) {{
            __CLR4_5_28p08p0lvicma88.R.inc(11280);prefixManager.copyPrefixesFrom((PrefixDocumentFormat) ontologyFormat);
            __CLR4_5_28p08p0lvicma88.R.inc(11281);prefixManager.setPrefixComparator(((PrefixDocumentFormat) ontologyFormat).getPrefixComparator());
        }
        }__CLR4_5_28p08p0lvicma88.R.inc(11282);if ((((!ontology.isAnonymous() && prefixManager.getDefaultPrefix()==null)&&(__CLR4_5_28p08p0lvicma88.R.iget(11283)!=0|true))||(__CLR4_5_28p08p0lvicma88.R.iget(11284)==0&false))) {{
            __CLR4_5_28p08p0lvicma88.R.inc(11285);String existingDefault = prefixManager.getDefaultPrefix();
            __CLR4_5_28p08p0lvicma88.R.inc(11286);String ontologyIRIString = ontology.getOntologyID().getOntologyIRI().get().toString();
            __CLR4_5_28p08p0lvicma88.R.inc(11287);if ((((existingDefault == null || !existingDefault.startsWith(ontologyIRIString))&&(__CLR4_5_28p08p0lvicma88.R.iget(11288)!=0|true))||(__CLR4_5_28p08p0lvicma88.R.iget(11289)==0&false))) {{
                __CLR4_5_28p08p0lvicma88.R.inc(11290);String defaultPrefix = ontologyIRIString;
                __CLR4_5_28p08p0lvicma88.R.inc(11291);if ((((!ontologyIRIString.endsWith("/"))&&(__CLR4_5_28p08p0lvicma88.R.iget(11292)!=0|true))||(__CLR4_5_28p08p0lvicma88.R.iget(11293)==0&false))) {{
                    __CLR4_5_28p08p0lvicma88.R.inc(11294);defaultPrefix = ontologyIRIString + '#';
                }
                }__CLR4_5_28p08p0lvicma88.R.inc(11295);prefixManager.setDefaultPrefix(defaultPrefix);
            }
        }}
        }__CLR4_5_28p08p0lvicma88.R.inc(11296);Map<OWLAnnotationProperty, List<String>> prefLangMap = new HashMap<>();
        __CLR4_5_28p08p0lvicma88.R.inc(11297);OWLOntologyManager manager = ontology.getOWLOntologyManager();
        __CLR4_5_28p08p0lvicma88.R.inc(11298);OWLDataFactory df = manager.getOWLDataFactory();
        __CLR4_5_28p08p0lvicma88.R.inc(11299);OWLAnnotationProperty labelProp = df.getOWLAnnotationProperty(RDFS_LABEL.getIRI());
        __CLR4_5_28p08p0lvicma88.R.inc(11300);labelMaker = new AnnotationValueShortFormProvider(Collections.singletonList(labelProp), prefLangMap, manager,
            defaultPrefixManager);
        __CLR4_5_28p08p0lvicma88.R.inc(11301);focusedObject = ontology.getOWLOntologyManager().getOWLDataFactory().getOWLThing();
    }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    /**
     * Set the add missing declaration flag.
     * 
     * @param flag
     *        new value
     */
    public void setAddMissingDeclarations(boolean flag) {try{__CLR4_5_28p08p0lvicma88.R.inc(11302);
        __CLR4_5_28p08p0lvicma88.R.inc(11303);addMissingDeclarations = flag;
    }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    /**
     * @param prefixManager
     *        the new prefix manager
     */
    public void setPrefixManager(PrefixManager prefixManager) {try{__CLR4_5_28p08p0lvicma88.R.inc(11304);
        __CLR4_5_28p08p0lvicma88.R.inc(11305);this.prefixManager = prefixManager;
        __CLR4_5_28p08p0lvicma88.R.inc(11306);if ((((prefixManager instanceof DefaultPrefixManager)&&(__CLR4_5_28p08p0lvicma88.R.iget(11307)!=0|true))||(__CLR4_5_28p08p0lvicma88.R.iget(11308)==0&false))) {{
            __CLR4_5_28p08p0lvicma88.R.inc(11309);defaultPrefixManager = (DefaultPrefixManager) prefixManager;
        }
    }}finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    /**
     * @param focusedObject
     *        the new focused object
     */
    protected void setFocusedObject(OWLObject focusedObject) {try{__CLR4_5_28p08p0lvicma88.R.inc(11310);
        __CLR4_5_28p08p0lvicma88.R.inc(11311);this.focusedObject = focusedObject;
    }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    protected void writePrefix(@Nonnull String prefix, @Nonnull String namespace) {try{__CLR4_5_28p08p0lvicma88.R.inc(11312);
        __CLR4_5_28p08p0lvicma88.R.inc(11313);write("Prefix");
        __CLR4_5_28p08p0lvicma88.R.inc(11314);writeOpenBracket();
        __CLR4_5_28p08p0lvicma88.R.inc(11315);write(prefix);
        __CLR4_5_28p08p0lvicma88.R.inc(11316);write("=");
        __CLR4_5_28p08p0lvicma88.R.inc(11317);write("<");
        __CLR4_5_28p08p0lvicma88.R.inc(11318);write(namespace);
        __CLR4_5_28p08p0lvicma88.R.inc(11319);write(">");
        __CLR4_5_28p08p0lvicma88.R.inc(11320);writeCloseBracket();
        __CLR4_5_28p08p0lvicma88.R.inc(11321);writeReturn();
    }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    protected void writePrefixes() {try{__CLR4_5_28p08p0lvicma88.R.inc(11322);
        __CLR4_5_28p08p0lvicma88.R.inc(11323);for (Map.Entry<String, String> e : prefixManager.getPrefixName2PrefixMap().entrySet()) {{
            __CLR4_5_28p08p0lvicma88.R.inc(11324);writePrefix(e.getKey(), e.getValue());
        }
    }}finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    private void write(@Nonnull OWLXMLVocabulary v) {try{__CLR4_5_28p08p0lvicma88.R.inc(11325);
        __CLR4_5_28p08p0lvicma88.R.inc(11326);write(v.getShortForm());
    }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    private void write(@Nonnull String s) {try{__CLR4_5_28p08p0lvicma88.R.inc(11327);
        __CLR4_5_28p08p0lvicma88.R.inc(11328);try {
            __CLR4_5_28p08p0lvicma88.R.inc(11329);writer.write(s);
        } catch (IOException e) {
            __CLR4_5_28p08p0lvicma88.R.inc(11330);throw new OWLRuntimeException(e);
        }
    }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    private void flush() {try{__CLR4_5_28p08p0lvicma88.R.inc(11331);
        __CLR4_5_28p08p0lvicma88.R.inc(11332);try {
            __CLR4_5_28p08p0lvicma88.R.inc(11333);writer.flush();
        } catch (IOException e) {
            __CLR4_5_28p08p0lvicma88.R.inc(11334);throw new OWLRuntimeException(e);
        }
    }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    private void write(@Nonnull IRI iri) {try{__CLR4_5_28p08p0lvicma88.R.inc(11335);
        __CLR4_5_28p08p0lvicma88.R.inc(11336);String qname = prefixManager.getPrefixIRI(iri);
        __CLR4_5_28p08p0lvicma88.R.inc(11337);if ((((qname != null)&&(__CLR4_5_28p08p0lvicma88.R.iget(11338)!=0|true))||(__CLR4_5_28p08p0lvicma88.R.iget(11339)==0&false))) {{
            __CLR4_5_28p08p0lvicma88.R.inc(11340);boolean lastCharIsColon = qname.charAt(qname.length() - 1) == ':';
            __CLR4_5_28p08p0lvicma88.R.inc(11341);if ((((!lastCharIsColon)&&(__CLR4_5_28p08p0lvicma88.R.iget(11342)!=0|true))||(__CLR4_5_28p08p0lvicma88.R.iget(11343)==0&false))) {{
                __CLR4_5_28p08p0lvicma88.R.inc(11344);write(qname);
                __CLR4_5_28p08p0lvicma88.R.inc(11345);return;
            }
        }}
        }__CLR4_5_28p08p0lvicma88.R.inc(11346);writeFullIRI(iri);
    }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    private void writeFullIRI(@Nonnull IRI iri) {try{__CLR4_5_28p08p0lvicma88.R.inc(11347);
        __CLR4_5_28p08p0lvicma88.R.inc(11348);write("<");
        __CLR4_5_28p08p0lvicma88.R.inc(11349);write(iri.toString());
        __CLR4_5_28p08p0lvicma88.R.inc(11350);write(">");
    }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLOntology ontology) {try{__CLR4_5_28p08p0lvicma88.R.inc(11351);
        __CLR4_5_28p08p0lvicma88.R.inc(11352);writePrefixes();
        __CLR4_5_28p08p0lvicma88.R.inc(11353);writeReturn();
        __CLR4_5_28p08p0lvicma88.R.inc(11354);writeReturn();
        __CLR4_5_28p08p0lvicma88.R.inc(11355);write(ONTOLOGY);
        __CLR4_5_28p08p0lvicma88.R.inc(11356);writeOpenBracket();
        __CLR4_5_28p08p0lvicma88.R.inc(11357);if ((((!ontology.isAnonymous())&&(__CLR4_5_28p08p0lvicma88.R.iget(11358)!=0|true))||(__CLR4_5_28p08p0lvicma88.R.iget(11359)==0&false))) {{
            __CLR4_5_28p08p0lvicma88.R.inc(11360);writeFullIRI(ontology.getOntologyID().getOntologyIRI().get());
            __CLR4_5_28p08p0lvicma88.R.inc(11361);Optional<IRI> versionIRI = ontology.getOntologyID().getVersionIRI();
            __CLR4_5_28p08p0lvicma88.R.inc(11362);if ((((versionIRI.isPresent())&&(__CLR4_5_28p08p0lvicma88.R.iget(11363)!=0|true))||(__CLR4_5_28p08p0lvicma88.R.iget(11364)==0&false))) {{
                __CLR4_5_28p08p0lvicma88.R.inc(11365);writeReturn();
                __CLR4_5_28p08p0lvicma88.R.inc(11366);writeFullIRI(versionIRI.get());
            }
            }__CLR4_5_28p08p0lvicma88.R.inc(11367);writeReturn();
        }
        }__CLR4_5_28p08p0lvicma88.R.inc(11368);for (OWLImportsDeclaration decl : ontology.getImportsDeclarations()) {{
            __CLR4_5_28p08p0lvicma88.R.inc(11369);write(IMPORT);
            __CLR4_5_28p08p0lvicma88.R.inc(11370);writeOpenBracket();
            __CLR4_5_28p08p0lvicma88.R.inc(11371);writeFullIRI(decl.getIRI());
            __CLR4_5_28p08p0lvicma88.R.inc(11372);writeCloseBracket();
            __CLR4_5_28p08p0lvicma88.R.inc(11373);writeReturn();
        }
        }__CLR4_5_28p08p0lvicma88.R.inc(11374);for (OWLAnnotation ontologyAnnotation : getSortedAnnotations(ontology)) {{
            __CLR4_5_28p08p0lvicma88.R.inc(11375);ontologyAnnotation.accept(this);
            __CLR4_5_28p08p0lvicma88.R.inc(11376);writeReturn();
        }
        }__CLR4_5_28p08p0lvicma88.R.inc(11377);writeReturn();
        __CLR4_5_28p08p0lvicma88.R.inc(11378);Set<OWLAxiom> writtenAxioms = new HashSet<>();
        __CLR4_5_28p08p0lvicma88.R.inc(11379);Collection<IRI> illegals = OWLDocumentFormatImpl.determineIllegalPunnings(addMissingDeclarations, ontology
            .getSignature(), ont.getPunnedIRIs(INCLUDED));
        __CLR4_5_28p08p0lvicma88.R.inc(11380);for (OWLEntity ent : sortOptionally(ontology.getSignature())) {{
            __CLR4_5_28p08p0lvicma88.R.inc(11381);writeDeclarations(ent, writtenAxioms, illegals);
        }
        // writeEntities(sortedSignature, writtenAxioms);
        }__CLR4_5_28p08p0lvicma88.R.inc(11382);writeSortedEntities("Annotation Properties", "Annotation Property", ontology.getAnnotationPropertiesInSignature(
            EXCLUDED), writtenAxioms);
        __CLR4_5_28p08p0lvicma88.R.inc(11383);writeSortedEntities("Object Properties", "Object Property", ontology.getObjectPropertiesInSignature(),
            writtenAxioms);
        __CLR4_5_28p08p0lvicma88.R.inc(11384);writeSortedEntities("Data Properties", "Data Property", ontology.getDataPropertiesInSignature(), writtenAxioms);
        __CLR4_5_28p08p0lvicma88.R.inc(11385);writeSortedEntities("Datatypes", "Datatype", ontology.getDatatypesInSignature(), writtenAxioms);
        __CLR4_5_28p08p0lvicma88.R.inc(11386);writeSortedEntities("Classes", "Class", ontology.getClassesInSignature(), writtenAxioms);
        __CLR4_5_28p08p0lvicma88.R.inc(11387);writeSortedEntities("Named Individuals", "Individual", ontology.getIndividualsInSignature(), writtenAxioms);
        __CLR4_5_28p08p0lvicma88.R.inc(11388);Set<OWLAxiom> otherAxioms = ontology.getAxioms();
        __CLR4_5_28p08p0lvicma88.R.inc(11389);otherAxioms.removeAll(writtenAxioms);
        __CLR4_5_28p08p0lvicma88.R.inc(11390);for (OWLAxiom ax : sortOptionally(otherAxioms)) {{
            __CLR4_5_28p08p0lvicma88.R.inc(11391);ax.accept(this);
            __CLR4_5_28p08p0lvicma88.R.inc(11392);writeReturn();
        }
        }__CLR4_5_28p08p0lvicma88.R.inc(11393);writeCloseBracket();
        __CLR4_5_28p08p0lvicma88.R.inc(11394);flush();
    }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    private void writeSortedEntities(String bannerComment, String entityTypeName, Set<? extends OWLEntity> entities,
        Set<OWLAxiom> writtenAxioms) {try{__CLR4_5_28p08p0lvicma88.R.inc(11395);
        __CLR4_5_28p08p0lvicma88.R.inc(11396);if ((((entities.size() > 0)&&(__CLR4_5_28p08p0lvicma88.R.iget(11397)!=0|true))||(__CLR4_5_28p08p0lvicma88.R.iget(11398)==0&false))) {{
            __CLR4_5_28p08p0lvicma88.R.inc(11399);writeEntities(bannerComment, entityTypeName, sortOptionally(entities), writtenAxioms);
            __CLR4_5_28p08p0lvicma88.R.inc(11400);writeln();
        }
    }}finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    private void writeln() {try{__CLR4_5_28p08p0lvicma88.R.inc(11401);
        __CLR4_5_28p08p0lvicma88.R.inc(11402);writeReturn();
    }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    private void writeln(@Nonnull String s) {try{__CLR4_5_28p08p0lvicma88.R.inc(11403);
        __CLR4_5_28p08p0lvicma88.R.inc(11404);write(s);
        __CLR4_5_28p08p0lvicma88.R.inc(11405);writeReturn();
    }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    private void writeEntities(String comment, String entityTypeName, List<? extends OWLEntity> entities,
        @Nonnull Set<OWLAxiom> writtenAxioms) {try{__CLR4_5_28p08p0lvicma88.R.inc(11406);
        __CLR4_5_28p08p0lvicma88.R.inc(11407);boolean haveWrittenBanner = false;
        __CLR4_5_28p08p0lvicma88.R.inc(11408);for (OWLEntity owlEntity : entities) {{
            __CLR4_5_28p08p0lvicma88.R.inc(11409);Set<? extends OWLAxiom> axiomsForEntity = getUnsortedAxiomsForEntity(owlEntity);
            __CLR4_5_28p08p0lvicma88.R.inc(11410);for (Iterator<? extends OWLAxiom> iterator = axiomsForEntity.iterator(); (((iterator.hasNext())&&(__CLR4_5_28p08p0lvicma88.R.iget(11411)!=0|true))||(__CLR4_5_28p08p0lvicma88.R.iget(11412)==0&false));) {{
                __CLR4_5_28p08p0lvicma88.R.inc(11413);OWLAxiom axiom = iterator.next();
                __CLR4_5_28p08p0lvicma88.R.inc(11414);if ((((writtenAxioms.contains(axiom))&&(__CLR4_5_28p08p0lvicma88.R.iget(11415)!=0|true))||(__CLR4_5_28p08p0lvicma88.R.iget(11416)==0&false))) {{
                    __CLR4_5_28p08p0lvicma88.R.inc(11417);iterator.remove();
                }
            }}
            }__CLR4_5_28p08p0lvicma88.R.inc(11418);Set<OWLAnnotationAssertionAxiom> annotationAssertionAxioms = ont.getAnnotationAssertionAxioms(owlEntity
                .getIRI());
            __CLR4_5_28p08p0lvicma88.R.inc(11419);for (Iterator<OWLAnnotationAssertionAxiom> iterator = annotationAssertionAxioms.iterator(); (((iterator
                .hasNext())&&(__CLR4_5_28p08p0lvicma88.R.iget(11420)!=0|true))||(__CLR4_5_28p08p0lvicma88.R.iget(11421)==0&false));) {{
                __CLR4_5_28p08p0lvicma88.R.inc(11422);OWLAnnotationAssertionAxiom axiom = iterator.next();
                __CLR4_5_28p08p0lvicma88.R.inc(11423);if ((((writtenAxioms.contains(axiom))&&(__CLR4_5_28p08p0lvicma88.R.iget(11424)!=0|true))||(__CLR4_5_28p08p0lvicma88.R.iget(11425)==0&false))) {{
                    __CLR4_5_28p08p0lvicma88.R.inc(11426);iterator.remove();
                }
            }}
            }__CLR4_5_28p08p0lvicma88.R.inc(11427);if ((((axiomsForEntity.size() == 0 && annotationAssertionAxioms.size() == 0)&&(__CLR4_5_28p08p0lvicma88.R.iget(11428)!=0|true))||(__CLR4_5_28p08p0lvicma88.R.iget(11429)==0&false))) {{
                __CLR4_5_28p08p0lvicma88.R.inc(11430);continue;
            }
            }__CLR4_5_28p08p0lvicma88.R.inc(11431);if ((((!haveWrittenBanner)&&(__CLR4_5_28p08p0lvicma88.R.iget(11432)!=0|true))||(__CLR4_5_28p08p0lvicma88.R.iget(11433)==0&false))) {{
                __CLR4_5_28p08p0lvicma88.R.inc(11434);writeln("############################");
                __CLR4_5_28p08p0lvicma88.R.inc(11435);writeln("#   " + comment);
                __CLR4_5_28p08p0lvicma88.R.inc(11436);writeln("############################");
                __CLR4_5_28p08p0lvicma88.R.inc(11437);writeln();
                __CLR4_5_28p08p0lvicma88.R.inc(11438);haveWrittenBanner = true;
            }
            }__CLR4_5_28p08p0lvicma88.R.inc(11439);writeEntity2(owlEntity, entityTypeName, sortAxioms(axiomsForEntity), sortOptionally(
                annotationAssertionAxioms), writtenAxioms);
        }
    }}finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    @Nonnull
    private static List<OWLAnnotation> getSortedAnnotations(HasAnnotations annotationBearer) {try{__CLR4_5_28p08p0lvicma88.R.inc(11440);
        __CLR4_5_28p08p0lvicma88.R.inc(11441);return CollectionFactory.sortOptionally(annotationBearer.getAnnotations());
    }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    /**
     * Writes out the axioms that define the specified entity.
     * 
     * @param entity
     *        The entity
     * @return The set of axioms that was written out
     */
    @Nonnull
    protected Set<OWLAxiom> writeEntity(@Nonnull OWLEntity entity) {try{__CLR4_5_28p08p0lvicma88.R.inc(11442);
        __CLR4_5_28p08p0lvicma88.R.inc(11443);Set<OWLAxiom> writtenAxioms = new HashSet<>();
        __CLR4_5_28p08p0lvicma88.R.inc(11444);writeEntity(entity, writtenAxioms);
        __CLR4_5_28p08p0lvicma88.R.inc(11445);return writtenAxioms;
    }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    protected void writeEntity(@Nonnull OWLEntity entity, @Nonnull Set<OWLAxiom> alreadyWrittenAxioms) {try{__CLR4_5_28p08p0lvicma88.R.inc(11446);
        __CLR4_5_28p08p0lvicma88.R.inc(11447);writeEntity2(entity, "", sortAxioms(getUnsortedAxiomsForEntity(entity)), sortOptionally(ont
            .getAnnotationAssertionAxioms(entity.getIRI())), alreadyWrittenAxioms);
    }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    protected void writeEntity2(@Nonnull OWLEntity entity, String entityTypeName,
        @Nonnull List<? extends OWLAxiom> axiomsForEntity,
        @Nonnull List<OWLAnnotationAssertionAxiom> annotationAssertionAxioms,
        @Nonnull Set<OWLAxiom> alreadyWrittenAxioms) {try{__CLR4_5_28p08p0lvicma88.R.inc(11448);
        __CLR4_5_28p08p0lvicma88.R.inc(11449);writeln("# " + entityTypeName + ": " + getIRIString(entity) + " (" + getEntityLabel(entity) + ")");
        __CLR4_5_28p08p0lvicma88.R.inc(11450);writeln();
        __CLR4_5_28p08p0lvicma88.R.inc(11451);setFocusedObject(entity);
        __CLR4_5_28p08p0lvicma88.R.inc(11452);writeAnnotations2(entity, alreadyWrittenAxioms, annotationAssertionAxioms);
        __CLR4_5_28p08p0lvicma88.R.inc(11453);List<? extends OWLAxiom> axs = axiomsForEntity;
        __CLR4_5_28p08p0lvicma88.R.inc(11454);for (OWLAxiom ax : axs) {{
            __CLR4_5_28p08p0lvicma88.R.inc(11455);if ((((ax.getAxiomType().equals(AxiomType.DIFFERENT_INDIVIDUALS))&&(__CLR4_5_28p08p0lvicma88.R.iget(11456)!=0|true))||(__CLR4_5_28p08p0lvicma88.R.iget(11457)==0&false))) {{
                __CLR4_5_28p08p0lvicma88.R.inc(11458);continue;
            }
            }__CLR4_5_28p08p0lvicma88.R.inc(11459);if ((((ax.getAxiomType().equals(AxiomType.DISJOINT_CLASSES) && ((OWLDisjointClassesAxiom) ax)
                .getClassExpressions().size() > 2)&&(__CLR4_5_28p08p0lvicma88.R.iget(11460)!=0|true))||(__CLR4_5_28p08p0lvicma88.R.iget(11461)==0&false))) {{
                __CLR4_5_28p08p0lvicma88.R.inc(11462);continue;
            }
            }__CLR4_5_28p08p0lvicma88.R.inc(11463);ax.accept(this);
            __CLR4_5_28p08p0lvicma88.R.inc(11464);alreadyWrittenAxioms.add(ax);
            __CLR4_5_28p08p0lvicma88.R.inc(11465);writeReturn();
        }
        }__CLR4_5_28p08p0lvicma88.R.inc(11466);writeln();
    }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    @Nonnull
    private Set<? extends OWLAxiom> getUnsortedAxiomsForEntity(@Nonnull OWLEntity entity) {try{__CLR4_5_28p08p0lvicma88.R.inc(11467);
        __CLR4_5_28p08p0lvicma88.R.inc(11468);return entity.accept(new OWLEntityVisitorEx<Set<? extends OWLAxiom>>() {

            @Nonnull
            @Override
            public Set<? extends OWLAxiom> visit(@Nonnull OWLClass cls) {try{__CLR4_5_28p08p0lvicma88.R.inc(11469);
                __CLR4_5_28p08p0lvicma88.R.inc(11470);return ont.getAxioms(cls, EXCLUDED);
            }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

            @Nonnull
            @Override
            public Set<? extends OWLAxiom> visit(@Nonnull OWLObjectProperty property) {try{__CLR4_5_28p08p0lvicma88.R.inc(11471);
                __CLR4_5_28p08p0lvicma88.R.inc(11472);return ont.getAxioms(property, EXCLUDED);
            }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

            @Nonnull
            @Override
            public Set<? extends OWLAxiom> visit(@Nonnull OWLDataProperty property) {try{__CLR4_5_28p08p0lvicma88.R.inc(11473);
                __CLR4_5_28p08p0lvicma88.R.inc(11474);return ont.getAxioms(property, EXCLUDED);
            }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

            @Nonnull
            @Override
            public Set<? extends OWLAxiom> visit(@Nonnull OWLNamedIndividual individual) {try{__CLR4_5_28p08p0lvicma88.R.inc(11475);
                __CLR4_5_28p08p0lvicma88.R.inc(11476);return ont.getAxioms(individual, EXCLUDED);
            }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

            @Nonnull
            @Override
            public Set<? extends OWLAxiom> visit(@Nonnull OWLDatatype datatype) {try{__CLR4_5_28p08p0lvicma88.R.inc(11477);
                __CLR4_5_28p08p0lvicma88.R.inc(11478);return ont.getAxioms(datatype, EXCLUDED);
            }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

            @Nonnull
            @Override
            public Set<? extends OWLAxiom> visit(@Nonnull OWLAnnotationProperty property) {try{__CLR4_5_28p08p0lvicma88.R.inc(11479);
                __CLR4_5_28p08p0lvicma88.R.inc(11480);return ont.getAxioms(property, EXCLUDED);
            }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}
        });
    }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    @Nonnull
    protected List<? extends OWLAxiom> sortAxioms(@Nonnull Set<? extends OWLAxiom> axioms) {try{__CLR4_5_28p08p0lvicma88.R.inc(11481);
        __CLR4_5_28p08p0lvicma88.R.inc(11482);return sortOptionally(axioms);
    }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    @Nonnull
    private String getIRIString(@Nonnull OWLEntity entity) {try{__CLR4_5_28p08p0lvicma88.R.inc(11483);
        __CLR4_5_28p08p0lvicma88.R.inc(11484);return defaultPrefixManager.getShortForm(entity);
    }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    private String getEntityLabel(@Nonnull OWLEntity entity) {try{__CLR4_5_28p08p0lvicma88.R.inc(11485);
        __CLR4_5_28p08p0lvicma88.R.inc(11486);return labelMaker.getShortForm(entity);
    }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    /**
     * Writes out the declaration axioms for the specified entity.
     * 
     * @param entity
     *        The entity
     * @return The axioms that were written out
     */
    @Nonnull
    protected Set<OWLAxiom> writeDeclarations(@Nonnull OWLEntity entity) {try{__CLR4_5_28p08p0lvicma88.R.inc(11487);
        __CLR4_5_28p08p0lvicma88.R.inc(11488);Set<OWLAxiom> axioms = new HashSet<>();
        __CLR4_5_28p08p0lvicma88.R.inc(11489);Set<OWLDeclarationAxiom> declarationAxioms = ont.getDeclarationAxioms(entity);
        __CLR4_5_28p08p0lvicma88.R.inc(11490);for (OWLAxiom ax : sortOptionally(declarationAxioms)) {{
            __CLR4_5_28p08p0lvicma88.R.inc(11491);ax.accept(this);
            __CLR4_5_28p08p0lvicma88.R.inc(11492);axioms.add(ax);
            __CLR4_5_28p08p0lvicma88.R.inc(11493);writeReturn();
        }
        }__CLR4_5_28p08p0lvicma88.R.inc(11494);return axioms;
    }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    private void writeDeclarations(@Nonnull OWLEntity entity, @Nonnull Set<OWLAxiom> alreadyWrittenAxioms,
        Collection<IRI> illegals) {try{__CLR4_5_28p08p0lvicma88.R.inc(11495);
        __CLR4_5_28p08p0lvicma88.R.inc(11496);Collection<OWLDeclarationAxiom> axioms = ont.getDeclarationAxioms(entity);
        __CLR4_5_28p08p0lvicma88.R.inc(11497);for (OWLDeclarationAxiom ax : sortOptionally(axioms)) {{
            __CLR4_5_28p08p0lvicma88.R.inc(11498);if ((((!alreadyWrittenAxioms.contains(ax))&&(__CLR4_5_28p08p0lvicma88.R.iget(11499)!=0|true))||(__CLR4_5_28p08p0lvicma88.R.iget(11500)==0&false))) {{
                __CLR4_5_28p08p0lvicma88.R.inc(11501);ax.accept(this);
                __CLR4_5_28p08p0lvicma88.R.inc(11502);writeReturn();
            }
        }}
        // if multiple illegal declarations already exist, they have already
        // been outputted
        // the renderer cannot take responsibility for removing them
        // It should not add declarations for illegally punned entities here,
        // though
        }__CLR4_5_28p08p0lvicma88.R.inc(11503);if ((((addMissingDeclarations && axioms.isEmpty())&&(__CLR4_5_28p08p0lvicma88.R.iget(11504)!=0|true))||(__CLR4_5_28p08p0lvicma88.R.iget(11505)==0&false))) {{
            // if declarations should be added, check if the IRI is illegally
            // punned
            __CLR4_5_28p08p0lvicma88.R.inc(11506);if ((((!entity.isBuiltIn() && !illegals.contains(entity.getIRI()) && !ont.isDeclared(entity,
                Imports.INCLUDED))&&(__CLR4_5_28p08p0lvicma88.R.iget(11507)!=0|true))||(__CLR4_5_28p08p0lvicma88.R.iget(11508)==0&false))) {{
                __CLR4_5_28p08p0lvicma88.R.inc(11509);OWLDeclarationAxiom declaration = ont.getOWLOntologyManager().getOWLDataFactory()
                    .getOWLDeclarationAxiom(entity);
                __CLR4_5_28p08p0lvicma88.R.inc(11510);declaration.accept(this);
                __CLR4_5_28p08p0lvicma88.R.inc(11511);writeReturn();
            }
        }}
        }__CLR4_5_28p08p0lvicma88.R.inc(11512);alreadyWrittenAxioms.addAll(axioms);
    }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    /**
     * Writes of the annotation for the specified entity.
     * 
     * @param entity
     *        The entity
     * @param alreadyWrittenAxioms
     *        already written axioms, to be updated with the newly written
     *        axioms
     */
    protected void writeAnnotations(@Nonnull OWLEntity entity, @Nonnull Set<OWLAxiom> alreadyWrittenAxioms) {try{__CLR4_5_28p08p0lvicma88.R.inc(11513);
        __CLR4_5_28p08p0lvicma88.R.inc(11514);List<OWLAnnotationAssertionAxiom> annotationAssertionAxioms = sortOptionally(ont.getAnnotationAssertionAxioms(
            entity.getIRI()));
        __CLR4_5_28p08p0lvicma88.R.inc(11515);writeAnnotations2(entity, alreadyWrittenAxioms, annotationAssertionAxioms);
    }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    protected void writeAnnotations2(@SuppressWarnings("unused") @Nonnull OWLEntity entity,
        @Nonnull Set<OWLAxiom> alreadyWrittenAxioms, List<OWLAnnotationAssertionAxiom> annotationAssertionAxioms) {try{__CLR4_5_28p08p0lvicma88.R.inc(11516);
        __CLR4_5_28p08p0lvicma88.R.inc(11517);for (OWLAnnotationAxiom ax : annotationAssertionAxioms) {{
            __CLR4_5_28p08p0lvicma88.R.inc(11518);ax.accept(this);
            __CLR4_5_28p08p0lvicma88.R.inc(11519);writeReturn();
        }
        }__CLR4_5_28p08p0lvicma88.R.inc(11520);alreadyWrittenAxioms.addAll(annotationAssertionAxioms);
    }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    /**
     * Write.
     * 
     * @param v
     *        the v
     * @param o
     *        the o
     */
    protected void write(@Nonnull OWLXMLVocabulary v, @Nonnull OWLObject o) {try{__CLR4_5_28p08p0lvicma88.R.inc(11521);
        __CLR4_5_28p08p0lvicma88.R.inc(11522);write(v);
        __CLR4_5_28p08p0lvicma88.R.inc(11523);writeOpenBracket();
        __CLR4_5_28p08p0lvicma88.R.inc(11524);o.accept(this);
        __CLR4_5_28p08p0lvicma88.R.inc(11525);writeCloseBracket();
    }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    private void write(@Nonnull Collection<? extends OWLObject> objects) {try{__CLR4_5_28p08p0lvicma88.R.inc(11526);
        __CLR4_5_28p08p0lvicma88.R.inc(11527);if ((((objects.size() > 2)&&(__CLR4_5_28p08p0lvicma88.R.iget(11528)!=0|true))||(__CLR4_5_28p08p0lvicma88.R.iget(11529)==0&false))) {{
            __CLR4_5_28p08p0lvicma88.R.inc(11530);for (Iterator<? extends OWLObject> it = objects.iterator(); (((it.hasNext())&&(__CLR4_5_28p08p0lvicma88.R.iget(11531)!=0|true))||(__CLR4_5_28p08p0lvicma88.R.iget(11532)==0&false));) {{
                __CLR4_5_28p08p0lvicma88.R.inc(11533);it.next().accept(this);
                __CLR4_5_28p08p0lvicma88.R.inc(11534);if ((((it.hasNext())&&(__CLR4_5_28p08p0lvicma88.R.iget(11535)!=0|true))||(__CLR4_5_28p08p0lvicma88.R.iget(11536)==0&false))) {{
                    __CLR4_5_28p08p0lvicma88.R.inc(11537);writeSpace();
                }
            }}
        }} }else {__CLR4_5_28p08p0lvicma88.R.inc(11538);if ((((objects.size() == 2)&&(__CLR4_5_28p08p0lvicma88.R.iget(11539)!=0|true))||(__CLR4_5_28p08p0lvicma88.R.iget(11540)==0&false))) {{
            __CLR4_5_28p08p0lvicma88.R.inc(11541);Iterator<? extends OWLObject> it = objects.iterator();
            __CLR4_5_28p08p0lvicma88.R.inc(11542);OWLObject objA = it.next();
            __CLR4_5_28p08p0lvicma88.R.inc(11543);OWLObject objB = it.next();
            __CLR4_5_28p08p0lvicma88.R.inc(11544);OWLObject lhs;
            __CLR4_5_28p08p0lvicma88.R.inc(11545);OWLObject rhs;
            __CLR4_5_28p08p0lvicma88.R.inc(11546);if ((((objA.equals(focusedObject))&&(__CLR4_5_28p08p0lvicma88.R.iget(11547)!=0|true))||(__CLR4_5_28p08p0lvicma88.R.iget(11548)==0&false))) {{
                __CLR4_5_28p08p0lvicma88.R.inc(11549);lhs = objA;
                __CLR4_5_28p08p0lvicma88.R.inc(11550);rhs = objB;
            } }else {{
                __CLR4_5_28p08p0lvicma88.R.inc(11551);lhs = objB;
                __CLR4_5_28p08p0lvicma88.R.inc(11552);rhs = objA;
            }
            }__CLR4_5_28p08p0lvicma88.R.inc(11553);lhs.accept(this);
            __CLR4_5_28p08p0lvicma88.R.inc(11554);writeSpace();
            __CLR4_5_28p08p0lvicma88.R.inc(11555);rhs.accept(this);
        } }else {__CLR4_5_28p08p0lvicma88.R.inc(11556);if ((((objects.size() == 1)&&(__CLR4_5_28p08p0lvicma88.R.iget(11557)!=0|true))||(__CLR4_5_28p08p0lvicma88.R.iget(11558)==0&false))) {{
            __CLR4_5_28p08p0lvicma88.R.inc(11559);objects.iterator().next().accept(this);
        }
    }}}}finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    private void write(@Nonnull List<? extends OWLObject> objects) {try{__CLR4_5_28p08p0lvicma88.R.inc(11560);
        __CLR4_5_28p08p0lvicma88.R.inc(11561);if ((((objects.size() > 1)&&(__CLR4_5_28p08p0lvicma88.R.iget(11562)!=0|true))||(__CLR4_5_28p08p0lvicma88.R.iget(11563)==0&false))) {{
            __CLR4_5_28p08p0lvicma88.R.inc(11564);for (Iterator<? extends OWLObject> it = objects.iterator(); (((it.hasNext())&&(__CLR4_5_28p08p0lvicma88.R.iget(11565)!=0|true))||(__CLR4_5_28p08p0lvicma88.R.iget(11566)==0&false));) {{
                __CLR4_5_28p08p0lvicma88.R.inc(11567);it.next().accept(this);
                __CLR4_5_28p08p0lvicma88.R.inc(11568);if ((((it.hasNext())&&(__CLR4_5_28p08p0lvicma88.R.iget(11569)!=0|true))||(__CLR4_5_28p08p0lvicma88.R.iget(11570)==0&false))) {{
                    __CLR4_5_28p08p0lvicma88.R.inc(11571);writeSpace();
                }
            }}
        }} }else {__CLR4_5_28p08p0lvicma88.R.inc(11572);if ((((objects.size() == 1)&&(__CLR4_5_28p08p0lvicma88.R.iget(11573)!=0|true))||(__CLR4_5_28p08p0lvicma88.R.iget(11574)==0&false))) {{
            __CLR4_5_28p08p0lvicma88.R.inc(11575);objects.iterator().next().accept(this);
        }
    }}}finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    protected void writeOpenBracket() {try{__CLR4_5_28p08p0lvicma88.R.inc(11576);
        __CLR4_5_28p08p0lvicma88.R.inc(11577);write("(");
    }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    protected void writeCloseBracket() {try{__CLR4_5_28p08p0lvicma88.R.inc(11578);
        __CLR4_5_28p08p0lvicma88.R.inc(11579);write(")");
    }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    protected void writeSpace() {try{__CLR4_5_28p08p0lvicma88.R.inc(11580);
        __CLR4_5_28p08p0lvicma88.R.inc(11581);write(" ");
    }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    protected void writeReturn() {try{__CLR4_5_28p08p0lvicma88.R.inc(11582);
        __CLR4_5_28p08p0lvicma88.R.inc(11583);write("\n");
    }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    protected void writeAnnotations(@Nonnull OWLAxiom ax) {try{__CLR4_5_28p08p0lvicma88.R.inc(11584);
        __CLR4_5_28p08p0lvicma88.R.inc(11585);for (OWLAnnotation anno : getSortedAnnotations(ax)) {{
            __CLR4_5_28p08p0lvicma88.R.inc(11586);anno.accept(this);
            __CLR4_5_28p08p0lvicma88.R.inc(11587);writeSpace();
        }
    }}finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    protected void writeAxiomStart(@Nonnull OWLXMLVocabulary v, @Nonnull OWLAxiom axiom) {try{__CLR4_5_28p08p0lvicma88.R.inc(11588);
        __CLR4_5_28p08p0lvicma88.R.inc(11589);write(v);
        __CLR4_5_28p08p0lvicma88.R.inc(11590);writeOpenBracket();
        __CLR4_5_28p08p0lvicma88.R.inc(11591);writeAnnotations(axiom);
    }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    protected void writeAxiomEnd() {try{__CLR4_5_28p08p0lvicma88.R.inc(11592);
        __CLR4_5_28p08p0lvicma88.R.inc(11593);writeCloseBracket();
    }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    protected void writePropertyCharacteristic(@Nonnull OWLXMLVocabulary v, @Nonnull OWLAxiom ax,
        @Nonnull OWLPropertyExpression prop) {try{__CLR4_5_28p08p0lvicma88.R.inc(11594);
        __CLR4_5_28p08p0lvicma88.R.inc(11595);writeAxiomStart(v, ax);
        __CLR4_5_28p08p0lvicma88.R.inc(11596);prop.accept(this);
        __CLR4_5_28p08p0lvicma88.R.inc(11597);writeAxiomEnd();
    }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLAsymmetricObjectPropertyAxiom axiom) {try{__CLR4_5_28p08p0lvicma88.R.inc(11598);
        __CLR4_5_28p08p0lvicma88.R.inc(11599);writePropertyCharacteristic(ASYMMETRIC_OBJECT_PROPERTY, axiom, axiom.getProperty());
    }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLClassAssertionAxiom axiom) {try{__CLR4_5_28p08p0lvicma88.R.inc(11600);
        __CLR4_5_28p08p0lvicma88.R.inc(11601);writeAxiomStart(CLASS_ASSERTION, axiom);
        __CLR4_5_28p08p0lvicma88.R.inc(11602);axiom.getClassExpression().accept(this);
        __CLR4_5_28p08p0lvicma88.R.inc(11603);writeSpace();
        __CLR4_5_28p08p0lvicma88.R.inc(11604);axiom.getIndividual().accept(this);
        __CLR4_5_28p08p0lvicma88.R.inc(11605);writeAxiomEnd();
    }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDataPropertyAssertionAxiom axiom) {try{__CLR4_5_28p08p0lvicma88.R.inc(11606);
        __CLR4_5_28p08p0lvicma88.R.inc(11607);writeAxiomStart(DATA_PROPERTY_ASSERTION, axiom);
        __CLR4_5_28p08p0lvicma88.R.inc(11608);axiom.getProperty().accept(this);
        __CLR4_5_28p08p0lvicma88.R.inc(11609);writeSpace();
        __CLR4_5_28p08p0lvicma88.R.inc(11610);axiom.getSubject().accept(this);
        __CLR4_5_28p08p0lvicma88.R.inc(11611);writeSpace();
        __CLR4_5_28p08p0lvicma88.R.inc(11612);axiom.getObject().accept(this);
        __CLR4_5_28p08p0lvicma88.R.inc(11613);writeAxiomEnd();
    }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDataPropertyDomainAxiom axiom) {try{__CLR4_5_28p08p0lvicma88.R.inc(11614);
        __CLR4_5_28p08p0lvicma88.R.inc(11615);writeAxiomStart(DATA_PROPERTY_DOMAIN, axiom);
        __CLR4_5_28p08p0lvicma88.R.inc(11616);axiom.getProperty().accept(this);
        __CLR4_5_28p08p0lvicma88.R.inc(11617);writeSpace();
        __CLR4_5_28p08p0lvicma88.R.inc(11618);axiom.getDomain().accept(this);
        __CLR4_5_28p08p0lvicma88.R.inc(11619);writeAxiomEnd();
    }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDataPropertyRangeAxiom axiom) {try{__CLR4_5_28p08p0lvicma88.R.inc(11620);
        __CLR4_5_28p08p0lvicma88.R.inc(11621);writeAxiomStart(DATA_PROPERTY_RANGE, axiom);
        __CLR4_5_28p08p0lvicma88.R.inc(11622);axiom.getProperty().accept(this);
        __CLR4_5_28p08p0lvicma88.R.inc(11623);writeSpace();
        __CLR4_5_28p08p0lvicma88.R.inc(11624);axiom.getRange().accept(this);
        __CLR4_5_28p08p0lvicma88.R.inc(11625);writeAxiomEnd();
    }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLSubDataPropertyOfAxiom axiom) {try{__CLR4_5_28p08p0lvicma88.R.inc(11626);
        __CLR4_5_28p08p0lvicma88.R.inc(11627);writeAxiomStart(SUB_DATA_PROPERTY_OF, axiom);
        __CLR4_5_28p08p0lvicma88.R.inc(11628);axiom.getSubProperty().accept(this);
        __CLR4_5_28p08p0lvicma88.R.inc(11629);writeSpace();
        __CLR4_5_28p08p0lvicma88.R.inc(11630);axiom.getSuperProperty().accept(this);
        __CLR4_5_28p08p0lvicma88.R.inc(11631);writeAxiomEnd();
    }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDeclarationAxiom axiom) {try{__CLR4_5_28p08p0lvicma88.R.inc(11632);
        __CLR4_5_28p08p0lvicma88.R.inc(11633);writeAxiomStart(DECLARATION, axiom);
        __CLR4_5_28p08p0lvicma88.R.inc(11634);writeEntitiesAsURIs = false;
        __CLR4_5_28p08p0lvicma88.R.inc(11635);axiom.getEntity().accept(this);
        __CLR4_5_28p08p0lvicma88.R.inc(11636);writeEntitiesAsURIs = true;
        __CLR4_5_28p08p0lvicma88.R.inc(11637);writeAxiomEnd();
    }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDifferentIndividualsAxiom axiom) {try{__CLR4_5_28p08p0lvicma88.R.inc(11638);
        __CLR4_5_28p08p0lvicma88.R.inc(11639);Set<OWLIndividual> individuals = axiom.getIndividuals();
        __CLR4_5_28p08p0lvicma88.R.inc(11640);if ((((individuals.size() < 2)&&(__CLR4_5_28p08p0lvicma88.R.iget(11641)!=0|true))||(__CLR4_5_28p08p0lvicma88.R.iget(11642)==0&false))) {{
            // TODO log
            __CLR4_5_28p08p0lvicma88.R.inc(11643);return;
        }
        }__CLR4_5_28p08p0lvicma88.R.inc(11644);writeAxiomStart(DIFFERENT_INDIVIDUALS, axiom);
        __CLR4_5_28p08p0lvicma88.R.inc(11645);write(sortOptionally(individuals));
        __CLR4_5_28p08p0lvicma88.R.inc(11646);writeAxiomEnd();
    }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDisjointClassesAxiom axiom) {try{__CLR4_5_28p08p0lvicma88.R.inc(11647);
        __CLR4_5_28p08p0lvicma88.R.inc(11648);Set<OWLClassExpression> classExpressions = axiom.getClassExpressions();
        __CLR4_5_28p08p0lvicma88.R.inc(11649);if ((((classExpressions.size() < 2)&&(__CLR4_5_28p08p0lvicma88.R.iget(11650)!=0|true))||(__CLR4_5_28p08p0lvicma88.R.iget(11651)==0&false))) {{
            // TODO log
            __CLR4_5_28p08p0lvicma88.R.inc(11652);return;
        }
        }__CLR4_5_28p08p0lvicma88.R.inc(11653);writeAxiomStart(DISJOINT_CLASSES, axiom);
        __CLR4_5_28p08p0lvicma88.R.inc(11654);write(sortOptionally(classExpressions));
        __CLR4_5_28p08p0lvicma88.R.inc(11655);writeAxiomEnd();
    }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDisjointDataPropertiesAxiom axiom) {try{__CLR4_5_28p08p0lvicma88.R.inc(11656);
        __CLR4_5_28p08p0lvicma88.R.inc(11657);Set<OWLDataPropertyExpression> properties = axiom.getProperties();
        __CLR4_5_28p08p0lvicma88.R.inc(11658);if ((((properties.size() < 2)&&(__CLR4_5_28p08p0lvicma88.R.iget(11659)!=0|true))||(__CLR4_5_28p08p0lvicma88.R.iget(11660)==0&false))) {{
            // TODO log
            __CLR4_5_28p08p0lvicma88.R.inc(11661);return;
        }
        }__CLR4_5_28p08p0lvicma88.R.inc(11662);writeAxiomStart(DISJOINT_DATA_PROPERTIES, axiom);
        __CLR4_5_28p08p0lvicma88.R.inc(11663);write(sortOptionally(properties));
        __CLR4_5_28p08p0lvicma88.R.inc(11664);writeAxiomEnd();
    }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDisjointObjectPropertiesAxiom axiom) {try{__CLR4_5_28p08p0lvicma88.R.inc(11665);
        __CLR4_5_28p08p0lvicma88.R.inc(11666);Set<OWLObjectPropertyExpression> properties = axiom.getProperties();
        __CLR4_5_28p08p0lvicma88.R.inc(11667);if ((((properties.size() < 2)&&(__CLR4_5_28p08p0lvicma88.R.iget(11668)!=0|true))||(__CLR4_5_28p08p0lvicma88.R.iget(11669)==0&false))) {{
            // TODO log
            __CLR4_5_28p08p0lvicma88.R.inc(11670);return;
        }
        }__CLR4_5_28p08p0lvicma88.R.inc(11671);writeAxiomStart(DISJOINT_OBJECT_PROPERTIES, axiom);
        __CLR4_5_28p08p0lvicma88.R.inc(11672);write(sortOptionally(properties));
        __CLR4_5_28p08p0lvicma88.R.inc(11673);writeAxiomEnd();
    }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDisjointUnionAxiom axiom) {try{__CLR4_5_28p08p0lvicma88.R.inc(11674);
        __CLR4_5_28p08p0lvicma88.R.inc(11675);writeAxiomStart(DISJOINT_UNION, axiom);
        __CLR4_5_28p08p0lvicma88.R.inc(11676);axiom.getOWLClass().accept(this);
        __CLR4_5_28p08p0lvicma88.R.inc(11677);writeSpace();
        __CLR4_5_28p08p0lvicma88.R.inc(11678);Set<OWLClassExpression> classExpressions = axiom.getClassExpressions();
        __CLR4_5_28p08p0lvicma88.R.inc(11679);List<OWLClassExpression> expressionList = sortOptionally(classExpressions);
        __CLR4_5_28p08p0lvicma88.R.inc(11680);write(expressionList);
        __CLR4_5_28p08p0lvicma88.R.inc(11681);writeAxiomEnd();
    }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLAnnotationAssertionAxiom axiom) {try{__CLR4_5_28p08p0lvicma88.R.inc(11682);
        __CLR4_5_28p08p0lvicma88.R.inc(11683);writeAxiomStart(ANNOTATION_ASSERTION, axiom);
        __CLR4_5_28p08p0lvicma88.R.inc(11684);axiom.getProperty().accept(this);
        __CLR4_5_28p08p0lvicma88.R.inc(11685);writeSpace();
        __CLR4_5_28p08p0lvicma88.R.inc(11686);axiom.getSubject().accept(this);
        __CLR4_5_28p08p0lvicma88.R.inc(11687);writeSpace();
        __CLR4_5_28p08p0lvicma88.R.inc(11688);axiom.getValue().accept(this);
        __CLR4_5_28p08p0lvicma88.R.inc(11689);writeAxiomEnd();
    }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLEquivalentClassesAxiom axiom) {try{__CLR4_5_28p08p0lvicma88.R.inc(11690);
        __CLR4_5_28p08p0lvicma88.R.inc(11691);Set<OWLClassExpression> classExpressions = axiom.getClassExpressions();
        __CLR4_5_28p08p0lvicma88.R.inc(11692);if ((((classExpressions.size() < 2)&&(__CLR4_5_28p08p0lvicma88.R.iget(11693)!=0|true))||(__CLR4_5_28p08p0lvicma88.R.iget(11694)==0&false))) {{
            // TODO log
            __CLR4_5_28p08p0lvicma88.R.inc(11695);return;
        }
        }__CLR4_5_28p08p0lvicma88.R.inc(11696);writeAxiomStart(EQUIVALENT_CLASSES, axiom);
        __CLR4_5_28p08p0lvicma88.R.inc(11697);List<OWLClassExpression> expressionList = sortOptionally(classExpressions);
        __CLR4_5_28p08p0lvicma88.R.inc(11698);write(expressionList);
        __CLR4_5_28p08p0lvicma88.R.inc(11699);writeAxiomEnd();
    }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLEquivalentDataPropertiesAxiom axiom) {try{__CLR4_5_28p08p0lvicma88.R.inc(11700);
        __CLR4_5_28p08p0lvicma88.R.inc(11701);Set<OWLDataPropertyExpression> properties = axiom.getProperties();
        __CLR4_5_28p08p0lvicma88.R.inc(11702);if ((((properties.size() < 2)&&(__CLR4_5_28p08p0lvicma88.R.iget(11703)!=0|true))||(__CLR4_5_28p08p0lvicma88.R.iget(11704)==0&false))) {{
            // TODO log
            __CLR4_5_28p08p0lvicma88.R.inc(11705);return;
        }
        }__CLR4_5_28p08p0lvicma88.R.inc(11706);writeAxiomStart(EQUIVALENT_DATA_PROPERTIES, axiom);
        __CLR4_5_28p08p0lvicma88.R.inc(11707);List<OWLDataPropertyExpression> expressionList = sortOptionally(properties);
        __CLR4_5_28p08p0lvicma88.R.inc(11708);write(expressionList);
        __CLR4_5_28p08p0lvicma88.R.inc(11709);writeAxiomEnd();
    }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLEquivalentObjectPropertiesAxiom axiom) {try{__CLR4_5_28p08p0lvicma88.R.inc(11710);
        __CLR4_5_28p08p0lvicma88.R.inc(11711);Set<OWLObjectPropertyExpression> properties = axiom.getProperties();
        __CLR4_5_28p08p0lvicma88.R.inc(11712);if ((((properties.size() < 2)&&(__CLR4_5_28p08p0lvicma88.R.iget(11713)!=0|true))||(__CLR4_5_28p08p0lvicma88.R.iget(11714)==0&false))) {{
            // TODO log
            __CLR4_5_28p08p0lvicma88.R.inc(11715);return;
        }
        }__CLR4_5_28p08p0lvicma88.R.inc(11716);writeAxiomStart(EQUIVALENT_OBJECT_PROPERTIES, axiom);
        __CLR4_5_28p08p0lvicma88.R.inc(11717);List<OWLObjectPropertyExpression> expressionList = sortOptionally(properties);
        __CLR4_5_28p08p0lvicma88.R.inc(11718);write(expressionList);
        __CLR4_5_28p08p0lvicma88.R.inc(11719);writeAxiomEnd();
    }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLFunctionalDataPropertyAxiom axiom) {try{__CLR4_5_28p08p0lvicma88.R.inc(11720);
        __CLR4_5_28p08p0lvicma88.R.inc(11721);writePropertyCharacteristic(FUNCTIONAL_DATA_PROPERTY, axiom, axiom.getProperty());
    }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLFunctionalObjectPropertyAxiom axiom) {try{__CLR4_5_28p08p0lvicma88.R.inc(11722);
        __CLR4_5_28p08p0lvicma88.R.inc(11723);writePropertyCharacteristic(FUNCTIONAL_OBJECT_PROPERTY, axiom, axiom.getProperty());
    }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLInverseFunctionalObjectPropertyAxiom axiom) {try{__CLR4_5_28p08p0lvicma88.R.inc(11724);
        __CLR4_5_28p08p0lvicma88.R.inc(11725);writePropertyCharacteristic(INVERSE_FUNCTIONAL_OBJECT_PROPERTY, axiom, axiom.getProperty());
    }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLInverseObjectPropertiesAxiom axiom) {try{__CLR4_5_28p08p0lvicma88.R.inc(11726);
        __CLR4_5_28p08p0lvicma88.R.inc(11727);writeAxiomStart(INVERSE_OBJECT_PROPERTIES, axiom);
        __CLR4_5_28p08p0lvicma88.R.inc(11728);axiom.getFirstProperty().accept(this);
        __CLR4_5_28p08p0lvicma88.R.inc(11729);writeSpace();
        __CLR4_5_28p08p0lvicma88.R.inc(11730);axiom.getSecondProperty().accept(this);
        __CLR4_5_28p08p0lvicma88.R.inc(11731);writeAxiomEnd();
    }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLIrreflexiveObjectPropertyAxiom axiom) {try{__CLR4_5_28p08p0lvicma88.R.inc(11732);
        __CLR4_5_28p08p0lvicma88.R.inc(11733);writePropertyCharacteristic(IRREFLEXIVE_OBJECT_PROPERTY, axiom, axiom.getProperty());
    }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLNegativeDataPropertyAssertionAxiom axiom) {try{__CLR4_5_28p08p0lvicma88.R.inc(11734);
        __CLR4_5_28p08p0lvicma88.R.inc(11735);writeAxiomStart(NEGATIVE_DATA_PROPERTY_ASSERTION, axiom);
        __CLR4_5_28p08p0lvicma88.R.inc(11736);axiom.getProperty().accept(this);
        __CLR4_5_28p08p0lvicma88.R.inc(11737);writeSpace();
        __CLR4_5_28p08p0lvicma88.R.inc(11738);axiom.getSubject().accept(this);
        __CLR4_5_28p08p0lvicma88.R.inc(11739);writeSpace();
        __CLR4_5_28p08p0lvicma88.R.inc(11740);axiom.getObject().accept(this);
        __CLR4_5_28p08p0lvicma88.R.inc(11741);writeAxiomEnd();
    }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLNegativeObjectPropertyAssertionAxiom axiom) {try{__CLR4_5_28p08p0lvicma88.R.inc(11742);
        __CLR4_5_28p08p0lvicma88.R.inc(11743);writeAxiomStart(NEGATIVE_OBJECT_PROPERTY_ASSERTION, axiom);
        __CLR4_5_28p08p0lvicma88.R.inc(11744);axiom.getProperty().accept(this);
        __CLR4_5_28p08p0lvicma88.R.inc(11745);writeSpace();
        __CLR4_5_28p08p0lvicma88.R.inc(11746);axiom.getSubject().accept(this);
        __CLR4_5_28p08p0lvicma88.R.inc(11747);writeSpace();
        __CLR4_5_28p08p0lvicma88.R.inc(11748);axiom.getObject().accept(this);
        __CLR4_5_28p08p0lvicma88.R.inc(11749);writeAxiomEnd();
    }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLObjectPropertyAssertionAxiom axiom) {try{__CLR4_5_28p08p0lvicma88.R.inc(11750);
        __CLR4_5_28p08p0lvicma88.R.inc(11751);writeAxiomStart(OBJECT_PROPERTY_ASSERTION, axiom);
        __CLR4_5_28p08p0lvicma88.R.inc(11752);axiom.getProperty().accept(this);
        __CLR4_5_28p08p0lvicma88.R.inc(11753);writeSpace();
        __CLR4_5_28p08p0lvicma88.R.inc(11754);axiom.getSubject().accept(this);
        __CLR4_5_28p08p0lvicma88.R.inc(11755);writeSpace();
        __CLR4_5_28p08p0lvicma88.R.inc(11756);axiom.getObject().accept(this);
        __CLR4_5_28p08p0lvicma88.R.inc(11757);writeAxiomEnd();
    }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLSubPropertyChainOfAxiom axiom) {try{__CLR4_5_28p08p0lvicma88.R.inc(11758);
        __CLR4_5_28p08p0lvicma88.R.inc(11759);writeAxiomStart(SUB_OBJECT_PROPERTY_OF, axiom);
        __CLR4_5_28p08p0lvicma88.R.inc(11760);write(OBJECT_PROPERTY_CHAIN);
        __CLR4_5_28p08p0lvicma88.R.inc(11761);writeOpenBracket();
        __CLR4_5_28p08p0lvicma88.R.inc(11762);for (Iterator<OWLObjectPropertyExpression> it = axiom.getPropertyChain().iterator(); (((it.hasNext())&&(__CLR4_5_28p08p0lvicma88.R.iget(11763)!=0|true))||(__CLR4_5_28p08p0lvicma88.R.iget(11764)==0&false));) {{
            __CLR4_5_28p08p0lvicma88.R.inc(11765);it.next().accept(this);
            __CLR4_5_28p08p0lvicma88.R.inc(11766);if ((((it.hasNext())&&(__CLR4_5_28p08p0lvicma88.R.iget(11767)!=0|true))||(__CLR4_5_28p08p0lvicma88.R.iget(11768)==0&false))) {{
                __CLR4_5_28p08p0lvicma88.R.inc(11769);writeSpace();
            }
        }}
        }__CLR4_5_28p08p0lvicma88.R.inc(11770);writeCloseBracket();
        __CLR4_5_28p08p0lvicma88.R.inc(11771);writeSpace();
        __CLR4_5_28p08p0lvicma88.R.inc(11772);axiom.getSuperProperty().accept(this);
        __CLR4_5_28p08p0lvicma88.R.inc(11773);writeAxiomEnd();
    }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLObjectPropertyDomainAxiom axiom) {try{__CLR4_5_28p08p0lvicma88.R.inc(11774);
        __CLR4_5_28p08p0lvicma88.R.inc(11775);writeAxiomStart(OBJECT_PROPERTY_DOMAIN, axiom);
        __CLR4_5_28p08p0lvicma88.R.inc(11776);axiom.getProperty().accept(this);
        __CLR4_5_28p08p0lvicma88.R.inc(11777);writeSpace();
        __CLR4_5_28p08p0lvicma88.R.inc(11778);axiom.getDomain().accept(this);
        __CLR4_5_28p08p0lvicma88.R.inc(11779);writeAxiomEnd();
    }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLObjectPropertyRangeAxiom axiom) {try{__CLR4_5_28p08p0lvicma88.R.inc(11780);
        __CLR4_5_28p08p0lvicma88.R.inc(11781);writeAxiomStart(OBJECT_PROPERTY_RANGE, axiom);
        __CLR4_5_28p08p0lvicma88.R.inc(11782);axiom.getProperty().accept(this);
        __CLR4_5_28p08p0lvicma88.R.inc(11783);writeSpace();
        __CLR4_5_28p08p0lvicma88.R.inc(11784);axiom.getRange().accept(this);
        __CLR4_5_28p08p0lvicma88.R.inc(11785);writeAxiomEnd();
    }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLSubObjectPropertyOfAxiom axiom) {try{__CLR4_5_28p08p0lvicma88.R.inc(11786);
        __CLR4_5_28p08p0lvicma88.R.inc(11787);writeAxiomStart(SUB_OBJECT_PROPERTY_OF, axiom);
        __CLR4_5_28p08p0lvicma88.R.inc(11788);axiom.getSubProperty().accept(this);
        __CLR4_5_28p08p0lvicma88.R.inc(11789);writeSpace();
        __CLR4_5_28p08p0lvicma88.R.inc(11790);axiom.getSuperProperty().accept(this);
        __CLR4_5_28p08p0lvicma88.R.inc(11791);writeAxiomEnd();
    }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLReflexiveObjectPropertyAxiom axiom) {try{__CLR4_5_28p08p0lvicma88.R.inc(11792);
        __CLR4_5_28p08p0lvicma88.R.inc(11793);writePropertyCharacteristic(REFLEXIVE_OBJECT_PROPERTY, axiom, axiom.getProperty());
    }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLSameIndividualAxiom axiom) {try{__CLR4_5_28p08p0lvicma88.R.inc(11794);
        __CLR4_5_28p08p0lvicma88.R.inc(11795);Set<OWLIndividual> individuals = axiom.getIndividuals();
        __CLR4_5_28p08p0lvicma88.R.inc(11796);if ((((individuals.size() < 2)&&(__CLR4_5_28p08p0lvicma88.R.iget(11797)!=0|true))||(__CLR4_5_28p08p0lvicma88.R.iget(11798)==0&false))) {{
            // TODO log
            __CLR4_5_28p08p0lvicma88.R.inc(11799);return;
        }
        }__CLR4_5_28p08p0lvicma88.R.inc(11800);writeAxiomStart(SAME_INDIVIDUAL, axiom);
        __CLR4_5_28p08p0lvicma88.R.inc(11801);write(individuals);
        __CLR4_5_28p08p0lvicma88.R.inc(11802);writeAxiomEnd();
    }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLSubClassOfAxiom axiom) {try{__CLR4_5_28p08p0lvicma88.R.inc(11803);
        __CLR4_5_28p08p0lvicma88.R.inc(11804);writeAxiomStart(SUB_CLASS_OF, axiom);
        __CLR4_5_28p08p0lvicma88.R.inc(11805);axiom.getSubClass().accept(this);
        __CLR4_5_28p08p0lvicma88.R.inc(11806);writeSpace();
        __CLR4_5_28p08p0lvicma88.R.inc(11807);axiom.getSuperClass().accept(this);
        __CLR4_5_28p08p0lvicma88.R.inc(11808);writeAxiomEnd();
    }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLSymmetricObjectPropertyAxiom axiom) {try{__CLR4_5_28p08p0lvicma88.R.inc(11809);
        __CLR4_5_28p08p0lvicma88.R.inc(11810);writePropertyCharacteristic(SYMMETRIC_OBJECT_PROPERTY, axiom, axiom.getProperty());
    }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLTransitiveObjectPropertyAxiom axiom) {try{__CLR4_5_28p08p0lvicma88.R.inc(11811);
        __CLR4_5_28p08p0lvicma88.R.inc(11812);writePropertyCharacteristic(TRANSITIVE_OBJECT_PROPERTY, axiom, axiom.getProperty());
    }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLClass ce) {try{__CLR4_5_28p08p0lvicma88.R.inc(11813);
        __CLR4_5_28p08p0lvicma88.R.inc(11814);if ((((!writeEntitiesAsURIs)&&(__CLR4_5_28p08p0lvicma88.R.iget(11815)!=0|true))||(__CLR4_5_28p08p0lvicma88.R.iget(11816)==0&false))) {{
            __CLR4_5_28p08p0lvicma88.R.inc(11817);write(CLASS);
            __CLR4_5_28p08p0lvicma88.R.inc(11818);writeOpenBracket();
        }
        }__CLR4_5_28p08p0lvicma88.R.inc(11819);ce.getIRI().accept(this);
        __CLR4_5_28p08p0lvicma88.R.inc(11820);if ((((!writeEntitiesAsURIs)&&(__CLR4_5_28p08p0lvicma88.R.iget(11821)!=0|true))||(__CLR4_5_28p08p0lvicma88.R.iget(11822)==0&false))) {{
            __CLR4_5_28p08p0lvicma88.R.inc(11823);writeCloseBracket();
        }
    }}finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    private <F extends OWLPropertyRange> void writeRestriction(@Nonnull OWLXMLVocabulary v,
        @Nonnull OWLCardinalityRestriction<F> restriction, @Nonnull OWLPropertyExpression p) {try{__CLR4_5_28p08p0lvicma88.R.inc(11824);
        __CLR4_5_28p08p0lvicma88.R.inc(11825);write(v);
        __CLR4_5_28p08p0lvicma88.R.inc(11826);writeOpenBracket();
        __CLR4_5_28p08p0lvicma88.R.inc(11827);write(Integer.toString(restriction.getCardinality()));
        __CLR4_5_28p08p0lvicma88.R.inc(11828);writeSpace();
        __CLR4_5_28p08p0lvicma88.R.inc(11829);p.accept(this);
        __CLR4_5_28p08p0lvicma88.R.inc(11830);if ((((restriction.isQualified())&&(__CLR4_5_28p08p0lvicma88.R.iget(11831)!=0|true))||(__CLR4_5_28p08p0lvicma88.R.iget(11832)==0&false))) {{
            __CLR4_5_28p08p0lvicma88.R.inc(11833);writeSpace();
            __CLR4_5_28p08p0lvicma88.R.inc(11834);restriction.getFiller().accept(this);
        }
        }__CLR4_5_28p08p0lvicma88.R.inc(11835);writeCloseBracket();
    }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    private void writeRestriction(@Nonnull OWLXMLVocabulary v, @Nonnull OWLQuantifiedDataRestriction restriction) {try{__CLR4_5_28p08p0lvicma88.R.inc(11836);
        __CLR4_5_28p08p0lvicma88.R.inc(11837);writeRestriction(v, restriction.getProperty(), restriction.getFiller());
    }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    private void writeRestriction(@Nonnull OWLXMLVocabulary v, @Nonnull OWLQuantifiedObjectRestriction restriction) {try{__CLR4_5_28p08p0lvicma88.R.inc(11838);
        __CLR4_5_28p08p0lvicma88.R.inc(11839);writeRestriction(v, restriction.getProperty(), restriction.getFiller());
    }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    private void writeRestriction(@Nonnull OWLXMLVocabulary v, @Nonnull OWLPropertyExpression prop,
        @Nonnull OWLObject filler) {try{__CLR4_5_28p08p0lvicma88.R.inc(11840);
        __CLR4_5_28p08p0lvicma88.R.inc(11841);write(v);
        __CLR4_5_28p08p0lvicma88.R.inc(11842);writeOpenBracket();
        __CLR4_5_28p08p0lvicma88.R.inc(11843);prop.accept(this);
        __CLR4_5_28p08p0lvicma88.R.inc(11844);writeSpace();
        __CLR4_5_28p08p0lvicma88.R.inc(11845);filler.accept(this);
        __CLR4_5_28p08p0lvicma88.R.inc(11846);writeCloseBracket();
    }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    @Override
    public void visit(OWLDataAllValuesFrom ce) {try{__CLR4_5_28p08p0lvicma88.R.inc(11847);
        __CLR4_5_28p08p0lvicma88.R.inc(11848);writeRestriction(DATA_ALL_VALUES_FROM, ce);
    }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDataExactCardinality ce) {try{__CLR4_5_28p08p0lvicma88.R.inc(11849);
        __CLR4_5_28p08p0lvicma88.R.inc(11850);writeRestriction(DATA_EXACT_CARDINALITY, ce, ce.getProperty());
    }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDataMaxCardinality ce) {try{__CLR4_5_28p08p0lvicma88.R.inc(11851);
        __CLR4_5_28p08p0lvicma88.R.inc(11852);writeRestriction(DATA_MAX_CARDINALITY, ce, ce.getProperty());
    }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDataMinCardinality ce) {try{__CLR4_5_28p08p0lvicma88.R.inc(11853);
        __CLR4_5_28p08p0lvicma88.R.inc(11854);writeRestriction(DATA_MIN_CARDINALITY, ce, ce.getProperty());
    }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    @Override
    public void visit(OWLDataSomeValuesFrom ce) {try{__CLR4_5_28p08p0lvicma88.R.inc(11855);
        __CLR4_5_28p08p0lvicma88.R.inc(11856);writeRestriction(DATA_SOME_VALUES_FROM, ce);
    }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDataHasValue ce) {try{__CLR4_5_28p08p0lvicma88.R.inc(11857);
        __CLR4_5_28p08p0lvicma88.R.inc(11858);writeRestriction(DATA_HAS_VALUE, ce.getProperty(), ce.getFiller());
    }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectAllValuesFrom ce) {try{__CLR4_5_28p08p0lvicma88.R.inc(11859);
        __CLR4_5_28p08p0lvicma88.R.inc(11860);writeRestriction(OBJECT_ALL_VALUES_FROM, ce);
    }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLObjectComplementOf ce) {try{__CLR4_5_28p08p0lvicma88.R.inc(11861);
        __CLR4_5_28p08p0lvicma88.R.inc(11862);write(OBJECT_COMPLEMENT_OF, ce.getOperand());
    }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLObjectExactCardinality ce) {try{__CLR4_5_28p08p0lvicma88.R.inc(11863);
        __CLR4_5_28p08p0lvicma88.R.inc(11864);writeRestriction(OBJECT_EXACT_CARDINALITY, ce, ce.getProperty());
    }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLObjectIntersectionOf ce) {try{__CLR4_5_28p08p0lvicma88.R.inc(11865);
        __CLR4_5_28p08p0lvicma88.R.inc(11866);if ((((ce.getOperands().size() == 1)&&(__CLR4_5_28p08p0lvicma88.R.iget(11867)!=0|true))||(__CLR4_5_28p08p0lvicma88.R.iget(11868)==0&false))) {{
            __CLR4_5_28p08p0lvicma88.R.inc(11869);ce.getOperands().iterator().next().accept(this);
            __CLR4_5_28p08p0lvicma88.R.inc(11870);return;
        }
        }__CLR4_5_28p08p0lvicma88.R.inc(11871);write(OBJECT_INTERSECTION_OF);
        __CLR4_5_28p08p0lvicma88.R.inc(11872);writeOpenBracket();
        __CLR4_5_28p08p0lvicma88.R.inc(11873);Set<OWLClassExpression> operands = ce.getOperands();
        __CLR4_5_28p08p0lvicma88.R.inc(11874);List<OWLClassExpression> objects = sortOptionally(operands);
        __CLR4_5_28p08p0lvicma88.R.inc(11875);write(objects);
        __CLR4_5_28p08p0lvicma88.R.inc(11876);writeCloseBracket();
    }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLObjectMaxCardinality ce) {try{__CLR4_5_28p08p0lvicma88.R.inc(11877);
        __CLR4_5_28p08p0lvicma88.R.inc(11878);writeRestriction(OBJECT_MAX_CARDINALITY, ce, ce.getProperty());
    }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLObjectMinCardinality ce) {try{__CLR4_5_28p08p0lvicma88.R.inc(11879);
        __CLR4_5_28p08p0lvicma88.R.inc(11880);writeRestriction(OBJECT_MIN_CARDINALITY, ce, ce.getProperty());
    }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLObjectOneOf ce) {try{__CLR4_5_28p08p0lvicma88.R.inc(11881);
        __CLR4_5_28p08p0lvicma88.R.inc(11882);write(OBJECT_ONE_OF);
        __CLR4_5_28p08p0lvicma88.R.inc(11883);writeOpenBracket();
        __CLR4_5_28p08p0lvicma88.R.inc(11884);Set<OWLIndividual> individuals = ce.getIndividuals();
        __CLR4_5_28p08p0lvicma88.R.inc(11885);List<OWLIndividual> objects = sortOptionally(individuals);
        __CLR4_5_28p08p0lvicma88.R.inc(11886);write(objects);
        __CLR4_5_28p08p0lvicma88.R.inc(11887);writeCloseBracket();
    }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLObjectHasSelf ce) {try{__CLR4_5_28p08p0lvicma88.R.inc(11888);
        __CLR4_5_28p08p0lvicma88.R.inc(11889);write(OBJECT_HAS_SELF, ce.getProperty());
    }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectSomeValuesFrom ce) {try{__CLR4_5_28p08p0lvicma88.R.inc(11890);
        __CLR4_5_28p08p0lvicma88.R.inc(11891);writeRestriction(OBJECT_SOME_VALUES_FROM, ce);
    }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLObjectUnionOf ce) {try{__CLR4_5_28p08p0lvicma88.R.inc(11892);
        __CLR4_5_28p08p0lvicma88.R.inc(11893);if ((((ce.getOperands().size() == 1)&&(__CLR4_5_28p08p0lvicma88.R.iget(11894)!=0|true))||(__CLR4_5_28p08p0lvicma88.R.iget(11895)==0&false))) {{
            __CLR4_5_28p08p0lvicma88.R.inc(11896);ce.getOperands().iterator().next().accept(this);
            __CLR4_5_28p08p0lvicma88.R.inc(11897);return;
        }
        }__CLR4_5_28p08p0lvicma88.R.inc(11898);write(OBJECT_UNION_OF);
        __CLR4_5_28p08p0lvicma88.R.inc(11899);writeOpenBracket();
        __CLR4_5_28p08p0lvicma88.R.inc(11900);Set<OWLClassExpression> operands = ce.getOperands();
        __CLR4_5_28p08p0lvicma88.R.inc(11901);List<OWLClassExpression> objects = sortOptionally(operands);
        __CLR4_5_28p08p0lvicma88.R.inc(11902);write(objects);
        __CLR4_5_28p08p0lvicma88.R.inc(11903);writeCloseBracket();
    }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLObjectHasValue ce) {try{__CLR4_5_28p08p0lvicma88.R.inc(11904);
        __CLR4_5_28p08p0lvicma88.R.inc(11905);writeRestriction(OBJECT_HAS_VALUE, ce.getProperty(), ce.getFiller());
    }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDataComplementOf node) {try{__CLR4_5_28p08p0lvicma88.R.inc(11906);
        __CLR4_5_28p08p0lvicma88.R.inc(11907);write(DATA_COMPLEMENT_OF, node.getDataRange());
    }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDataOneOf node) {try{__CLR4_5_28p08p0lvicma88.R.inc(11908);
        __CLR4_5_28p08p0lvicma88.R.inc(11909);write(DATA_ONE_OF);
        __CLR4_5_28p08p0lvicma88.R.inc(11910);writeOpenBracket();
        __CLR4_5_28p08p0lvicma88.R.inc(11911);Set<OWLLiteral> values = node.getValues();
        __CLR4_5_28p08p0lvicma88.R.inc(11912);write(sortOptionally(values));
        __CLR4_5_28p08p0lvicma88.R.inc(11913);writeCloseBracket();
    }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDatatype node) {try{__CLR4_5_28p08p0lvicma88.R.inc(11914);
        __CLR4_5_28p08p0lvicma88.R.inc(11915);if ((((!writeEntitiesAsURIs)&&(__CLR4_5_28p08p0lvicma88.R.iget(11916)!=0|true))||(__CLR4_5_28p08p0lvicma88.R.iget(11917)==0&false))) {{
            __CLR4_5_28p08p0lvicma88.R.inc(11918);write(DATATYPE);
            __CLR4_5_28p08p0lvicma88.R.inc(11919);writeOpenBracket();
        }
        }__CLR4_5_28p08p0lvicma88.R.inc(11920);node.getIRI().accept(this);
        __CLR4_5_28p08p0lvicma88.R.inc(11921);if ((((!writeEntitiesAsURIs)&&(__CLR4_5_28p08p0lvicma88.R.iget(11922)!=0|true))||(__CLR4_5_28p08p0lvicma88.R.iget(11923)==0&false))) {{
            __CLR4_5_28p08p0lvicma88.R.inc(11924);writeCloseBracket();
        }
    }}finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDatatypeRestriction node) {try{__CLR4_5_28p08p0lvicma88.R.inc(11925);
        __CLR4_5_28p08p0lvicma88.R.inc(11926);write(DATATYPE_RESTRICTION);
        __CLR4_5_28p08p0lvicma88.R.inc(11927);writeOpenBracket();
        __CLR4_5_28p08p0lvicma88.R.inc(11928);node.getDatatype().accept(this);
        __CLR4_5_28p08p0lvicma88.R.inc(11929);Set<OWLFacetRestriction> facetRestrictions = node.getFacetRestrictions();
        __CLR4_5_28p08p0lvicma88.R.inc(11930);List<OWLFacetRestriction> restrictionList = sortOptionally(facetRestrictions);
        __CLR4_5_28p08p0lvicma88.R.inc(11931);for (OWLFacetRestriction restriction : restrictionList) {{
            __CLR4_5_28p08p0lvicma88.R.inc(11932);writeSpace();
            __CLR4_5_28p08p0lvicma88.R.inc(11933);restriction.accept(this);
        }
        }__CLR4_5_28p08p0lvicma88.R.inc(11934);writeCloseBracket();
    }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLFacetRestriction node) {try{__CLR4_5_28p08p0lvicma88.R.inc(11935);
        __CLR4_5_28p08p0lvicma88.R.inc(11936);write(node.getFacet().getIRI());
        __CLR4_5_28p08p0lvicma88.R.inc(11937);writeSpace();
        __CLR4_5_28p08p0lvicma88.R.inc(11938);node.getFacetValue().accept(this);
    }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLLiteral node) {try{__CLR4_5_28p08p0lvicma88.R.inc(11939);
        __CLR4_5_28p08p0lvicma88.R.inc(11940);write("\"");
        __CLR4_5_28p08p0lvicma88.R.inc(11941);write(EscapeUtils.escapeString(node.getLiteral()));
        __CLR4_5_28p08p0lvicma88.R.inc(11942);write("\"");
        __CLR4_5_28p08p0lvicma88.R.inc(11943);if ((((node.hasLang())&&(__CLR4_5_28p08p0lvicma88.R.iget(11944)!=0|true))||(__CLR4_5_28p08p0lvicma88.R.iget(11945)==0&false))) {{
            __CLR4_5_28p08p0lvicma88.R.inc(11946);write("@");
            __CLR4_5_28p08p0lvicma88.R.inc(11947);write(node.getLang());
        } }else {__CLR4_5_28p08p0lvicma88.R.inc(11948);if ((((!node.isRDFPlainLiteral())&&(__CLR4_5_28p08p0lvicma88.R.iget(11949)!=0|true))||(__CLR4_5_28p08p0lvicma88.R.iget(11950)==0&false))) {{
            __CLR4_5_28p08p0lvicma88.R.inc(11951);write("^^");
            __CLR4_5_28p08p0lvicma88.R.inc(11952);write(node.getDatatype().getIRI());
        }
    }}}finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDataProperty property) {try{__CLR4_5_28p08p0lvicma88.R.inc(11953);
        __CLR4_5_28p08p0lvicma88.R.inc(11954);if ((((!writeEntitiesAsURIs)&&(__CLR4_5_28p08p0lvicma88.R.iget(11955)!=0|true))||(__CLR4_5_28p08p0lvicma88.R.iget(11956)==0&false))) {{
            __CLR4_5_28p08p0lvicma88.R.inc(11957);write(DATA_PROPERTY);
            __CLR4_5_28p08p0lvicma88.R.inc(11958);writeOpenBracket();
        }
        }__CLR4_5_28p08p0lvicma88.R.inc(11959);property.getIRI().accept(this);
        __CLR4_5_28p08p0lvicma88.R.inc(11960);if ((((!writeEntitiesAsURIs)&&(__CLR4_5_28p08p0lvicma88.R.iget(11961)!=0|true))||(__CLR4_5_28p08p0lvicma88.R.iget(11962)==0&false))) {{
            __CLR4_5_28p08p0lvicma88.R.inc(11963);writeCloseBracket();
        }
    }}finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLObjectProperty property) {try{__CLR4_5_28p08p0lvicma88.R.inc(11964);
        __CLR4_5_28p08p0lvicma88.R.inc(11965);if ((((!writeEntitiesAsURIs)&&(__CLR4_5_28p08p0lvicma88.R.iget(11966)!=0|true))||(__CLR4_5_28p08p0lvicma88.R.iget(11967)==0&false))) {{
            __CLR4_5_28p08p0lvicma88.R.inc(11968);write(OBJECT_PROPERTY);
            __CLR4_5_28p08p0lvicma88.R.inc(11969);writeOpenBracket();
        }
        }__CLR4_5_28p08p0lvicma88.R.inc(11970);property.getIRI().accept(this);
        __CLR4_5_28p08p0lvicma88.R.inc(11971);if ((((!writeEntitiesAsURIs)&&(__CLR4_5_28p08p0lvicma88.R.iget(11972)!=0|true))||(__CLR4_5_28p08p0lvicma88.R.iget(11973)==0&false))) {{
            __CLR4_5_28p08p0lvicma88.R.inc(11974);writeCloseBracket();
        }
    }}finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLObjectInverseOf property) {try{__CLR4_5_28p08p0lvicma88.R.inc(11975);
        __CLR4_5_28p08p0lvicma88.R.inc(11976);write(OBJECT_INVERSE_OF);
        __CLR4_5_28p08p0lvicma88.R.inc(11977);writeOpenBracket();
        __CLR4_5_28p08p0lvicma88.R.inc(11978);property.getInverse().accept(this);
        __CLR4_5_28p08p0lvicma88.R.inc(11979);writeCloseBracket();
    }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLNamedIndividual individual) {try{__CLR4_5_28p08p0lvicma88.R.inc(11980);
        __CLR4_5_28p08p0lvicma88.R.inc(11981);if ((((!writeEntitiesAsURIs)&&(__CLR4_5_28p08p0lvicma88.R.iget(11982)!=0|true))||(__CLR4_5_28p08p0lvicma88.R.iget(11983)==0&false))) {{
            __CLR4_5_28p08p0lvicma88.R.inc(11984);write(NAMED_INDIVIDUAL);
            __CLR4_5_28p08p0lvicma88.R.inc(11985);writeOpenBracket();
        }
        }__CLR4_5_28p08p0lvicma88.R.inc(11986);individual.getIRI().accept(this);
        __CLR4_5_28p08p0lvicma88.R.inc(11987);if ((((!writeEntitiesAsURIs)&&(__CLR4_5_28p08p0lvicma88.R.iget(11988)!=0|true))||(__CLR4_5_28p08p0lvicma88.R.iget(11989)==0&false))) {{
            __CLR4_5_28p08p0lvicma88.R.inc(11990);writeCloseBracket();
        }
    }}finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLHasKeyAxiom axiom) {try{__CLR4_5_28p08p0lvicma88.R.inc(11991);
        __CLR4_5_28p08p0lvicma88.R.inc(11992);writeAxiomStart(HAS_KEY, axiom);
        __CLR4_5_28p08p0lvicma88.R.inc(11993);axiom.getClassExpression().accept(this);
        __CLR4_5_28p08p0lvicma88.R.inc(11994);writeSpace();
        __CLR4_5_28p08p0lvicma88.R.inc(11995);writeOpenBracket();
        __CLR4_5_28p08p0lvicma88.R.inc(11996);Set<OWLObjectPropertyExpression> objectPropertyExpressions = axiom.getObjectPropertyExpressions();
        __CLR4_5_28p08p0lvicma88.R.inc(11997);List<OWLObjectPropertyExpression> expressions = sortOptionally(objectPropertyExpressions);
        __CLR4_5_28p08p0lvicma88.R.inc(11998);for (Iterator<? extends OWLPropertyExpression> it = expressions.iterator(); (((it.hasNext())&&(__CLR4_5_28p08p0lvicma88.R.iget(11999)!=0|true))||(__CLR4_5_28p08p0lvicma88.R.iget(12000)==0&false));) {{
            __CLR4_5_28p08p0lvicma88.R.inc(12001);OWLPropertyExpression prop = it.next();
            __CLR4_5_28p08p0lvicma88.R.inc(12002);prop.accept(this);
            __CLR4_5_28p08p0lvicma88.R.inc(12003);if ((((it.hasNext())&&(__CLR4_5_28p08p0lvicma88.R.iget(12004)!=0|true))||(__CLR4_5_28p08p0lvicma88.R.iget(12005)==0&false))) {{
                __CLR4_5_28p08p0lvicma88.R.inc(12006);writeSpace();
            }
        }}
        }__CLR4_5_28p08p0lvicma88.R.inc(12007);writeCloseBracket();
        __CLR4_5_28p08p0lvicma88.R.inc(12008);writeSpace();
        __CLR4_5_28p08p0lvicma88.R.inc(12009);writeOpenBracket();
        __CLR4_5_28p08p0lvicma88.R.inc(12010);Set<OWLDataPropertyExpression> dataPropertyExpressions = axiom.getDataPropertyExpressions();
        __CLR4_5_28p08p0lvicma88.R.inc(12011);List<OWLDataPropertyExpression> expressionList = sortOptionally(dataPropertyExpressions);
        __CLR4_5_28p08p0lvicma88.R.inc(12012);for (Iterator<? extends OWLPropertyExpression> it = expressionList.iterator(); (((it.hasNext())&&(__CLR4_5_28p08p0lvicma88.R.iget(12013)!=0|true))||(__CLR4_5_28p08p0lvicma88.R.iget(12014)==0&false));) {{
            __CLR4_5_28p08p0lvicma88.R.inc(12015);OWLPropertyExpression prop = it.next();
            __CLR4_5_28p08p0lvicma88.R.inc(12016);prop.accept(this);
            __CLR4_5_28p08p0lvicma88.R.inc(12017);if ((((it.hasNext())&&(__CLR4_5_28p08p0lvicma88.R.iget(12018)!=0|true))||(__CLR4_5_28p08p0lvicma88.R.iget(12019)==0&false))) {{
                __CLR4_5_28p08p0lvicma88.R.inc(12020);writeSpace();
            }
        }}
        }__CLR4_5_28p08p0lvicma88.R.inc(12021);writeCloseBracket();
        __CLR4_5_28p08p0lvicma88.R.inc(12022);writeAxiomEnd();
    }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLAnnotationPropertyDomainAxiom axiom) {try{__CLR4_5_28p08p0lvicma88.R.inc(12023);
        __CLR4_5_28p08p0lvicma88.R.inc(12024);writeAxiomStart(ANNOTATION_PROPERTY_DOMAIN, axiom);
        __CLR4_5_28p08p0lvicma88.R.inc(12025);axiom.getProperty().accept(this);
        __CLR4_5_28p08p0lvicma88.R.inc(12026);writeSpace();
        __CLR4_5_28p08p0lvicma88.R.inc(12027);axiom.getDomain().accept(this);
        __CLR4_5_28p08p0lvicma88.R.inc(12028);writeAxiomEnd();
    }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLAnnotationPropertyRangeAxiom axiom) {try{__CLR4_5_28p08p0lvicma88.R.inc(12029);
        __CLR4_5_28p08p0lvicma88.R.inc(12030);writeAxiomStart(ANNOTATION_PROPERTY_RANGE, axiom);
        __CLR4_5_28p08p0lvicma88.R.inc(12031);axiom.getProperty().accept(this);
        __CLR4_5_28p08p0lvicma88.R.inc(12032);writeSpace();
        __CLR4_5_28p08p0lvicma88.R.inc(12033);axiom.getRange().accept(this);
        __CLR4_5_28p08p0lvicma88.R.inc(12034);writeAxiomEnd();
    }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLSubAnnotationPropertyOfAxiom axiom) {try{__CLR4_5_28p08p0lvicma88.R.inc(12035);
        __CLR4_5_28p08p0lvicma88.R.inc(12036);writeAxiomStart(SUB_ANNOTATION_PROPERTY_OF, axiom);
        __CLR4_5_28p08p0lvicma88.R.inc(12037);axiom.getSubProperty().accept(this);
        __CLR4_5_28p08p0lvicma88.R.inc(12038);writeSpace();
        __CLR4_5_28p08p0lvicma88.R.inc(12039);axiom.getSuperProperty().accept(this);
        __CLR4_5_28p08p0lvicma88.R.inc(12040);writeAxiomEnd();
    }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDataIntersectionOf node) {try{__CLR4_5_28p08p0lvicma88.R.inc(12041);
        __CLR4_5_28p08p0lvicma88.R.inc(12042);if ((((node.getOperands().size() == 1)&&(__CLR4_5_28p08p0lvicma88.R.iget(12043)!=0|true))||(__CLR4_5_28p08p0lvicma88.R.iget(12044)==0&false))) {{
            __CLR4_5_28p08p0lvicma88.R.inc(12045);node.getOperands().iterator().next().accept(this);
            __CLR4_5_28p08p0lvicma88.R.inc(12046);return;
        }
        }__CLR4_5_28p08p0lvicma88.R.inc(12047);write(DATA_INTERSECTION_OF);
        __CLR4_5_28p08p0lvicma88.R.inc(12048);writeOpenBracket();
        __CLR4_5_28p08p0lvicma88.R.inc(12049);Set<OWLDataRange> operands = node.getOperands();
        __CLR4_5_28p08p0lvicma88.R.inc(12050);List<OWLDataRange> objects = sortOptionally(operands);
        __CLR4_5_28p08p0lvicma88.R.inc(12051);write(objects);
        __CLR4_5_28p08p0lvicma88.R.inc(12052);writeCloseBracket();
    }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDataUnionOf node) {try{__CLR4_5_28p08p0lvicma88.R.inc(12053);
        __CLR4_5_28p08p0lvicma88.R.inc(12054);if ((((node.getOperands().size() == 1)&&(__CLR4_5_28p08p0lvicma88.R.iget(12055)!=0|true))||(__CLR4_5_28p08p0lvicma88.R.iget(12056)==0&false))) {{
            __CLR4_5_28p08p0lvicma88.R.inc(12057);node.getOperands().iterator().next().accept(this);
            __CLR4_5_28p08p0lvicma88.R.inc(12058);return;
        }
        }__CLR4_5_28p08p0lvicma88.R.inc(12059);write(DATA_UNION_OF);
        __CLR4_5_28p08p0lvicma88.R.inc(12060);writeOpenBracket();
        __CLR4_5_28p08p0lvicma88.R.inc(12061);Set<OWLDataRange> operands = node.getOperands();
        __CLR4_5_28p08p0lvicma88.R.inc(12062);List<OWLDataRange> objects = sortOptionally(operands);
        __CLR4_5_28p08p0lvicma88.R.inc(12063);write(objects);
        __CLR4_5_28p08p0lvicma88.R.inc(12064);writeCloseBracket();
    }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLAnnotationProperty property) {try{__CLR4_5_28p08p0lvicma88.R.inc(12065);
        __CLR4_5_28p08p0lvicma88.R.inc(12066);if ((((!writeEntitiesAsURIs)&&(__CLR4_5_28p08p0lvicma88.R.iget(12067)!=0|true))||(__CLR4_5_28p08p0lvicma88.R.iget(12068)==0&false))) {{
            __CLR4_5_28p08p0lvicma88.R.inc(12069);write(ANNOTATION_PROPERTY);
            __CLR4_5_28p08p0lvicma88.R.inc(12070);writeOpenBracket();
        }
        }__CLR4_5_28p08p0lvicma88.R.inc(12071);property.getIRI().accept(this);
        __CLR4_5_28p08p0lvicma88.R.inc(12072);if ((((!writeEntitiesAsURIs)&&(__CLR4_5_28p08p0lvicma88.R.iget(12073)!=0|true))||(__CLR4_5_28p08p0lvicma88.R.iget(12074)==0&false))) {{
            __CLR4_5_28p08p0lvicma88.R.inc(12075);writeCloseBracket();
        }
    }}finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLAnonymousIndividual individual) {try{__CLR4_5_28p08p0lvicma88.R.inc(12076);
        __CLR4_5_28p08p0lvicma88.R.inc(12077);write(individual.getID().toString());
    }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull IRI iri) {try{__CLR4_5_28p08p0lvicma88.R.inc(12078);
        __CLR4_5_28p08p0lvicma88.R.inc(12079);write(iri);
    }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLAnnotation node) {try{__CLR4_5_28p08p0lvicma88.R.inc(12080);
        __CLR4_5_28p08p0lvicma88.R.inc(12081);write(ANNOTATION);
        __CLR4_5_28p08p0lvicma88.R.inc(12082);writeOpenBracket();
        __CLR4_5_28p08p0lvicma88.R.inc(12083);for (OWLAnnotation anno : getSortedAnnotations(node)) {{
            __CLR4_5_28p08p0lvicma88.R.inc(12084);anno.accept(this);
            __CLR4_5_28p08p0lvicma88.R.inc(12085);writeSpace();
        }
        }__CLR4_5_28p08p0lvicma88.R.inc(12086);node.getProperty().accept(this);
        __CLR4_5_28p08p0lvicma88.R.inc(12087);writeSpace();
        __CLR4_5_28p08p0lvicma88.R.inc(12088);node.getValue().accept(this);
        __CLR4_5_28p08p0lvicma88.R.inc(12089);writeCloseBracket();
    }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDatatypeDefinitionAxiom axiom) {try{__CLR4_5_28p08p0lvicma88.R.inc(12090);
        __CLR4_5_28p08p0lvicma88.R.inc(12091);writeAxiomStart(DATATYPE_DEFINITION, axiom);
        __CLR4_5_28p08p0lvicma88.R.inc(12092);axiom.getDatatype().accept(this);
        __CLR4_5_28p08p0lvicma88.R.inc(12093);writeSpace();
        __CLR4_5_28p08p0lvicma88.R.inc(12094);axiom.getDataRange().accept(this);
        __CLR4_5_28p08p0lvicma88.R.inc(12095);writeAxiomEnd();
    }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull SWRLRule rule) {try{__CLR4_5_28p08p0lvicma88.R.inc(12096);
        __CLR4_5_28p08p0lvicma88.R.inc(12097);writeAxiomStart(DL_SAFE_RULE, rule);
        __CLR4_5_28p08p0lvicma88.R.inc(12098);write(BODY);
        __CLR4_5_28p08p0lvicma88.R.inc(12099);writeOpenBracket();
        __CLR4_5_28p08p0lvicma88.R.inc(12100);write(rule.getBody());
        __CLR4_5_28p08p0lvicma88.R.inc(12101);writeCloseBracket();
        __CLR4_5_28p08p0lvicma88.R.inc(12102);write(HEAD);
        __CLR4_5_28p08p0lvicma88.R.inc(12103);writeOpenBracket();
        __CLR4_5_28p08p0lvicma88.R.inc(12104);write(rule.getHead());
        __CLR4_5_28p08p0lvicma88.R.inc(12105);writeCloseBracket();
        __CLR4_5_28p08p0lvicma88.R.inc(12106);writeAxiomEnd();
    }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull SWRLIndividualArgument node) {try{__CLR4_5_28p08p0lvicma88.R.inc(12107);
        __CLR4_5_28p08p0lvicma88.R.inc(12108);node.getIndividual().accept(this);
    }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull SWRLClassAtom node) {try{__CLR4_5_28p08p0lvicma88.R.inc(12109);
        __CLR4_5_28p08p0lvicma88.R.inc(12110);write(CLASS_ATOM);
        __CLR4_5_28p08p0lvicma88.R.inc(12111);writeOpenBracket();
        __CLR4_5_28p08p0lvicma88.R.inc(12112);node.getPredicate().accept(this);
        __CLR4_5_28p08p0lvicma88.R.inc(12113);writeSpace();
        __CLR4_5_28p08p0lvicma88.R.inc(12114);node.getArgument().accept(this);
        __CLR4_5_28p08p0lvicma88.R.inc(12115);writeCloseBracket();
    }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull SWRLDataRangeAtom node) {try{__CLR4_5_28p08p0lvicma88.R.inc(12116);
        __CLR4_5_28p08p0lvicma88.R.inc(12117);write(DATA_RANGE_ATOM);
        __CLR4_5_28p08p0lvicma88.R.inc(12118);writeOpenBracket();
        __CLR4_5_28p08p0lvicma88.R.inc(12119);node.getPredicate().accept(this);
        __CLR4_5_28p08p0lvicma88.R.inc(12120);writeSpace();
        __CLR4_5_28p08p0lvicma88.R.inc(12121);node.getArgument().accept(this);
        __CLR4_5_28p08p0lvicma88.R.inc(12122);writeCloseBracket();
    }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull SWRLObjectPropertyAtom node) {try{__CLR4_5_28p08p0lvicma88.R.inc(12123);
        __CLR4_5_28p08p0lvicma88.R.inc(12124);write(OBJECT_PROPERTY_ATOM);
        __CLR4_5_28p08p0lvicma88.R.inc(12125);writeOpenBracket();
        __CLR4_5_28p08p0lvicma88.R.inc(12126);node.getPredicate().accept(this);
        __CLR4_5_28p08p0lvicma88.R.inc(12127);writeSpace();
        __CLR4_5_28p08p0lvicma88.R.inc(12128);node.getFirstArgument().accept(this);
        __CLR4_5_28p08p0lvicma88.R.inc(12129);writeSpace();
        __CLR4_5_28p08p0lvicma88.R.inc(12130);node.getSecondArgument().accept(this);
        __CLR4_5_28p08p0lvicma88.R.inc(12131);writeCloseBracket();
    }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull SWRLDataPropertyAtom node) {try{__CLR4_5_28p08p0lvicma88.R.inc(12132);
        __CLR4_5_28p08p0lvicma88.R.inc(12133);write(DATA_PROPERTY_ATOM);
        __CLR4_5_28p08p0lvicma88.R.inc(12134);writeOpenBracket();
        __CLR4_5_28p08p0lvicma88.R.inc(12135);node.getPredicate().accept(this);
        __CLR4_5_28p08p0lvicma88.R.inc(12136);writeSpace();
        __CLR4_5_28p08p0lvicma88.R.inc(12137);node.getFirstArgument().accept(this);
        __CLR4_5_28p08p0lvicma88.R.inc(12138);writeSpace();
        __CLR4_5_28p08p0lvicma88.R.inc(12139);node.getSecondArgument().accept(this);
        __CLR4_5_28p08p0lvicma88.R.inc(12140);writeCloseBracket();
    }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull SWRLBuiltInAtom node) {try{__CLR4_5_28p08p0lvicma88.R.inc(12141);
        __CLR4_5_28p08p0lvicma88.R.inc(12142);write(BUILT_IN_ATOM);
        __CLR4_5_28p08p0lvicma88.R.inc(12143);writeOpenBracket();
        __CLR4_5_28p08p0lvicma88.R.inc(12144);node.getPredicate().accept(this);
        __CLR4_5_28p08p0lvicma88.R.inc(12145);writeSpace();
        __CLR4_5_28p08p0lvicma88.R.inc(12146);write(node.getArguments());
        __CLR4_5_28p08p0lvicma88.R.inc(12147);writeCloseBracket();
    }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull SWRLVariable node) {try{__CLR4_5_28p08p0lvicma88.R.inc(12148);
        __CLR4_5_28p08p0lvicma88.R.inc(12149);write(VARIABLE);
        __CLR4_5_28p08p0lvicma88.R.inc(12150);writeOpenBracket();
        __CLR4_5_28p08p0lvicma88.R.inc(12151);node.getIRI().accept(this);
        __CLR4_5_28p08p0lvicma88.R.inc(12152);writeCloseBracket();
    }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull SWRLLiteralArgument node) {try{__CLR4_5_28p08p0lvicma88.R.inc(12153);
        __CLR4_5_28p08p0lvicma88.R.inc(12154);node.getLiteral().accept(this);
    }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull SWRLDifferentIndividualsAtom node) {try{__CLR4_5_28p08p0lvicma88.R.inc(12155);
        __CLR4_5_28p08p0lvicma88.R.inc(12156);write(DIFFERENT_INDIVIDUALS_ATOM);
        __CLR4_5_28p08p0lvicma88.R.inc(12157);writeOpenBracket();
        __CLR4_5_28p08p0lvicma88.R.inc(12158);node.getFirstArgument().accept(this);
        __CLR4_5_28p08p0lvicma88.R.inc(12159);writeSpace();
        __CLR4_5_28p08p0lvicma88.R.inc(12160);node.getSecondArgument().accept(this);
        __CLR4_5_28p08p0lvicma88.R.inc(12161);writeCloseBracket();
    }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull SWRLSameIndividualAtom node) {try{__CLR4_5_28p08p0lvicma88.R.inc(12162);
        __CLR4_5_28p08p0lvicma88.R.inc(12163);write(SAME_INDIVIDUAL_ATOM);
        __CLR4_5_28p08p0lvicma88.R.inc(12164);writeOpenBracket();
        __CLR4_5_28p08p0lvicma88.R.inc(12165);node.getFirstArgument().accept(this);
        __CLR4_5_28p08p0lvicma88.R.inc(12166);writeSpace();
        __CLR4_5_28p08p0lvicma88.R.inc(12167);node.getSecondArgument().accept(this);
        __CLR4_5_28p08p0lvicma88.R.inc(12168);writeCloseBracket();
    }finally{__CLR4_5_28p08p0lvicma88.R.flushNeeded();}}
}
