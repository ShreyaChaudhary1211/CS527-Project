/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * This file is part of the OWL API.
 *
 * The contents of this file are subject to the LGPL License, Version 3.0.
 *
 * Copyright (C) 2011, The University of Manchester
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see http://www.gnu.org/licenses/.
 *
 *
 * Alternatively, the contents of this file may be used under the terms of the Apache License, Version 2.0
 * in which case, the provisions of the Apache License Version 2.0 are applicable instead of those above.
 *
 * Copyright 2011, University of Manchester
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.coode.owlapi.obo12.parser;

import java.net.URI;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.util.CollectionFactory;

import com.google.common.base.Optional;

/**
 * Author: Matthew Horridge<br>
 * The University Of Manchester<br>
 * Bio-Health Informatics Group<br>
 * Date: 10-Jan-2007<br>
 * <br>
 */
class OBOConsumer implements OBOParserHandler {public static class __CLR4_5_2pepelvicnleo{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006d\u0070\u0061\u0074\u0069\u0062\u0069\u006c\u0069\u0074\u0079\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237345588L,8589935092L,1208,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final Logger logger = Logger.getLogger(OBOConsumer.class.getName());
    private static final String IMPORT_TAG_NAME = "import";
    @Nonnull
    private OWLOntologyLoaderConfiguration configuration;
    private OWLOntologyManager owlOntologyManager;
    @Nonnull
    private OWLOntology ontology;
    private boolean inHeader;
    private String currentId;
    private Map<String, TagValueHandler> handlerMap;
    // private String defaultNamespace;
    private String defaultNamespaceTagValue = OBOVocabulary.OBO_IRI_BASE;
    private String stanzaType;
    private boolean termType;
    private boolean typedefType;
    private boolean instanceType;
    @Nonnull
    private Set<OWLClassExpression> intersectionOfOperands;
    @Nonnull
    private final Set<OWLClassExpression> unionOfOperands = new HashSet<>();
    private Map<String, IRI> uriCache = new HashMap<>();
    private Map<String, IRI> symbolicIdCache = new HashMap<>();
    private Map<String, IRI> tagIRICache = new HashMap<>();
    private IDSpaceManager idSpaceManager = new IDSpaceManager();
    private String ontologyTagValue = "";
    private String dataVersionTagValue = "";

    public OBOConsumer(@Nonnull OWLOntology ontology, @Nonnull OWLOntologyLoaderConfiguration configuration,
        IRI baseIRI) {try{__CLR4_5_2pepelvicnleo.R.inc(914);
        __CLR4_5_2pepelvicnleo.R.inc(915);this.configuration = configuration;
        __CLR4_5_2pepelvicnleo.R.inc(916);owlOntologyManager = ontology.getOWLOntologyManager();
        __CLR4_5_2pepelvicnleo.R.inc(917);this.ontology = ontology;
        __CLR4_5_2pepelvicnleo.R.inc(918);intersectionOfOperands = new HashSet<>();
        __CLR4_5_2pepelvicnleo.R.inc(919);uriCache = new HashMap<>();
        __CLR4_5_2pepelvicnleo.R.inc(920);for (OBOVocabulary v : OBOVocabulary.values()) {{
            __CLR4_5_2pepelvicnleo.R.inc(921);tagIRICache.put(v.getName(), v.getIRI());
        }
        }__CLR4_5_2pepelvicnleo.R.inc(922);ontologyTagValue = getDefaultOntologyTagValue(baseIRI);
        __CLR4_5_2pepelvicnleo.R.inc(923);loadBuiltinURIs();
        __CLR4_5_2pepelvicnleo.R.inc(924);setupTagHandlers();
    }finally{__CLR4_5_2pepelvicnleo.R.flushNeeded();}}

    private static String getDefaultOntologyTagValue(IRI baseIRI) {try{__CLR4_5_2pepelvicnleo.R.inc(925);
        __CLR4_5_2pepelvicnleo.R.inc(926);URI baseURI = baseIRI.toURI();
        __CLR4_5_2pepelvicnleo.R.inc(927);String baseURIPath = baseURI.getPath();
        __CLR4_5_2pepelvicnleo.R.inc(928);if ((((baseURIPath == null)&&(__CLR4_5_2pepelvicnleo.R.iget(929)!=0|true))||(__CLR4_5_2pepelvicnleo.R.iget(930)==0&false))) {{
            __CLR4_5_2pepelvicnleo.R.inc(931);return baseIRI.toString();
        }
        }__CLR4_5_2pepelvicnleo.R.inc(932);int lastSlashIndex = baseURIPath.lastIndexOf("/");
        __CLR4_5_2pepelvicnleo.R.inc(933);if ((((lastSlashIndex == -1 || lastSlashIndex + 1 == baseURIPath.length())&&(__CLR4_5_2pepelvicnleo.R.iget(934)!=0|true))||(__CLR4_5_2pepelvicnleo.R.iget(935)==0&false))) {{
            __CLR4_5_2pepelvicnleo.R.inc(936);return baseURIPath;
        }
        }__CLR4_5_2pepelvicnleo.R.inc(937);return baseURIPath.substring(lastSlashIndex + 1);
    }finally{__CLR4_5_2pepelvicnleo.R.flushNeeded();}}

    public OWLOntologyManager getOWLOntologyManager() {try{__CLR4_5_2pepelvicnleo.R.inc(938);
        __CLR4_5_2pepelvicnleo.R.inc(939);return owlOntologyManager;
    }finally{__CLR4_5_2pepelvicnleo.R.flushNeeded();}}

    @Nonnull
    public OWLOntology getOntology() {try{__CLR4_5_2pepelvicnleo.R.inc(940);
        __CLR4_5_2pepelvicnleo.R.inc(941);return ontology;
    }finally{__CLR4_5_2pepelvicnleo.R.flushNeeded();}}

    public String getCurrentId() {try{__CLR4_5_2pepelvicnleo.R.inc(942);
        __CLR4_5_2pepelvicnleo.R.inc(943);return currentId;
    }finally{__CLR4_5_2pepelvicnleo.R.flushNeeded();}}

    public void addSymbolicIdMapping(String symbolicName, IRI fullIRI) {try{__CLR4_5_2pepelvicnleo.R.inc(944);
        __CLR4_5_2pepelvicnleo.R.inc(945);symbolicIdCache.put(symbolicName, fullIRI);
    }finally{__CLR4_5_2pepelvicnleo.R.flushNeeded();}}

    /**
     * Sets the value of the default-namespace tag for the current ontology
     * being parsed.
     * 
     * @param defaultNamespaceTagValue
     *        The value of the default-namespace tag.
     */
    public void setDefaultNamespaceTagValue(String defaultNamespaceTagValue) {try{__CLR4_5_2pepelvicnleo.R.inc(946);
        __CLR4_5_2pepelvicnleo.R.inc(947);this.defaultNamespaceTagValue = defaultNamespaceTagValue;
    }finally{__CLR4_5_2pepelvicnleo.R.flushNeeded();}}

    /**
     * Gets the default-namespace tag value for the current ontology. If not
     * default-namespace tag value has been set explicitly then this method
     * returns the default value which is equal to
     * {@link OBOVocabulary#OBO_IRI_BASE}.
     * 
     * @return The default-namespace tag value. Not <code>null</code>.
     */
    public String getDefaultNamespaceTagValue() {try{__CLR4_5_2pepelvicnleo.R.inc(948);
        __CLR4_5_2pepelvicnleo.R.inc(949);return defaultNamespaceTagValue;
    }finally{__CLR4_5_2pepelvicnleo.R.flushNeeded();}}

    /**
     * Sets the value of the ontology tag for the current ontology that is being
     * parsed. This is used to construct an
     * {@link org.semanticweb.owlapi.model.OWLOntologyID} for the current
     * ontology once the ontology header has been parsed in its entirety.
     * 
     * @param ontologyTagValue
     *        The ontology tag value. Ultimately, this will be translated to an
     *        IRI.
     */
    public void setOntologyTagValue(String ontologyTagValue) {try{__CLR4_5_2pepelvicnleo.R.inc(950);
        __CLR4_5_2pepelvicnleo.R.inc(951);this.ontologyTagValue = ontologyTagValue;
    }finally{__CLR4_5_2pepelvicnleo.R.flushNeeded();}}

    /**
     * Sets the value of the data-version tag for the current ontology that is
     * being parsed. This is used to construct an
     * {@link org.semanticweb.owlapi.model.OWLOntologyID} for the current
     * ontology once the ontology header has been parsed in its entirety.
     * 
     * @param dataVersionTagValue
     *        The data-version tag value. Ultimately, this will be translated to
     *        an IRI.
     */
    public void setDataVersionTagValue(String dataVersionTagValue) {try{__CLR4_5_2pepelvicnleo.R.inc(952);
        __CLR4_5_2pepelvicnleo.R.inc(953);this.dataVersionTagValue = dataVersionTagValue;
    }finally{__CLR4_5_2pepelvicnleo.R.flushNeeded();}}

    public void registerIdSpace(String idSpacePrefix, String iriPrefix) {try{__CLR4_5_2pepelvicnleo.R.inc(954);
        __CLR4_5_2pepelvicnleo.R.inc(955);idSpaceManager.setIRIPrefix(idSpacePrefix, iriPrefix);
    }finally{__CLR4_5_2pepelvicnleo.R.flushNeeded();}}

    /**
     * Gets a COPY of the {@link IDSpaceManager} held by this OBOConsumer.
     * 
     * @return A copy of the IDSpaceManager held by this consumer.
     */
    public IDSpaceManager getIdSpaceManager() {try{__CLR4_5_2pepelvicnleo.R.inc(956);
        __CLR4_5_2pepelvicnleo.R.inc(957);return idSpaceManager;
    }finally{__CLR4_5_2pepelvicnleo.R.flushNeeded();}}

    public void setCurrentId(String currentId) {try{__CLR4_5_2pepelvicnleo.R.inc(958);
        __CLR4_5_2pepelvicnleo.R.inc(959);this.currentId = currentId;
    }finally{__CLR4_5_2pepelvicnleo.R.flushNeeded();}}

    public void addUnionOfOperand(OWLClassExpression classExpression) {try{__CLR4_5_2pepelvicnleo.R.inc(960);
        __CLR4_5_2pepelvicnleo.R.inc(961);unionOfOperands.add(classExpression);
    }finally{__CLR4_5_2pepelvicnleo.R.flushNeeded();}}

    public void addIntersectionOfOperand(OWLClassExpression classExpression) {try{__CLR4_5_2pepelvicnleo.R.inc(962);
        __CLR4_5_2pepelvicnleo.R.inc(963);intersectionOfOperands.add(classExpression);
    }finally{__CLR4_5_2pepelvicnleo.R.flushNeeded();}}

    public String getStanzaType() {try{__CLR4_5_2pepelvicnleo.R.inc(964);
        __CLR4_5_2pepelvicnleo.R.inc(965);return stanzaType;
    }finally{__CLR4_5_2pepelvicnleo.R.flushNeeded();}}

    public boolean isTerm() {try{__CLR4_5_2pepelvicnleo.R.inc(966);
        __CLR4_5_2pepelvicnleo.R.inc(967);return termType;
    }finally{__CLR4_5_2pepelvicnleo.R.flushNeeded();}}

    public boolean isTypedef() {try{__CLR4_5_2pepelvicnleo.R.inc(968);
        __CLR4_5_2pepelvicnleo.R.inc(969);return typedefType;
    }finally{__CLR4_5_2pepelvicnleo.R.flushNeeded();}}

    public boolean isInstanceType() {try{__CLR4_5_2pepelvicnleo.R.inc(970);
        __CLR4_5_2pepelvicnleo.R.inc(971);return instanceType;
    }finally{__CLR4_5_2pepelvicnleo.R.flushNeeded();}}

    private void loadBuiltinURIs() {try{__CLR4_5_2pepelvicnleo.R.inc(972);
        __CLR4_5_2pepelvicnleo.R.inc(973);for (OBOVocabulary v : OBOVocabulary.values()) {{
            __CLR4_5_2pepelvicnleo.R.inc(974);uriCache.put(v.getName(), v.getIRI());
        }
    }}finally{__CLR4_5_2pepelvicnleo.R.flushNeeded();}}

    private void setupTagHandlers() {try{__CLR4_5_2pepelvicnleo.R.inc(975);
        __CLR4_5_2pepelvicnleo.R.inc(976);handlerMap = new HashMap<>();
        __CLR4_5_2pepelvicnleo.R.inc(977);addTagHandler(new OntologyTagValueHandler(this));
        __CLR4_5_2pepelvicnleo.R.inc(978);addTagHandler(new IDTagValueHandler(this));
        __CLR4_5_2pepelvicnleo.R.inc(979);addTagHandler(new NameTagValueHandler(this));
        __CLR4_5_2pepelvicnleo.R.inc(980);addTagHandler(new IsATagValueHandler(this));
        __CLR4_5_2pepelvicnleo.R.inc(981);addTagHandler(new PartOfTagValueHandler(this));
        __CLR4_5_2pepelvicnleo.R.inc(982);addTagHandler(new TransitiveTagValueHandler(this));
        __CLR4_5_2pepelvicnleo.R.inc(983);addTagHandler(new SymmetricTagValueHandler(this));
        __CLR4_5_2pepelvicnleo.R.inc(984);addTagHandler(new RelationshipTagValueHandler(this));
        __CLR4_5_2pepelvicnleo.R.inc(985);addTagHandler(new UnionOfHandler(this));
        __CLR4_5_2pepelvicnleo.R.inc(986);addTagHandler(new IntersectionOfHandler(this));
        __CLR4_5_2pepelvicnleo.R.inc(987);addTagHandler(new DisjointFromHandler(this));
        __CLR4_5_2pepelvicnleo.R.inc(988);addTagHandler(new AsymmetricHandler(this));
        __CLR4_5_2pepelvicnleo.R.inc(989);addTagHandler(new InverseHandler(this));
        __CLR4_5_2pepelvicnleo.R.inc(990);addTagHandler(new ReflexiveHandler(this));
        __CLR4_5_2pepelvicnleo.R.inc(991);addTagHandler(new TransitiveOverHandler(this));
        __CLR4_5_2pepelvicnleo.R.inc(992);addTagHandler(new DefaultNamespaceTagValueHandler(this));
        __CLR4_5_2pepelvicnleo.R.inc(993);addTagHandler(new SynonymTagValueHandler(this));
        __CLR4_5_2pepelvicnleo.R.inc(994);addTagHandler(new XRefTagHandler(this));
        __CLR4_5_2pepelvicnleo.R.inc(995);addTagHandler(new DefTagValueHandler(this));
        __CLR4_5_2pepelvicnleo.R.inc(996);addTagHandler(new IsObsoleteTagValueHandler(this));
        __CLR4_5_2pepelvicnleo.R.inc(997);addTagHandler(new IDSpaceTagValueHandler(this));
        __CLR4_5_2pepelvicnleo.R.inc(998);addTagHandler(new DataVersionTagValueHandler(this));
        __CLR4_5_2pepelvicnleo.R.inc(999);addTagHandler(new SynonymTypeDefTagHandler(this));
        __CLR4_5_2pepelvicnleo.R.inc(1000);addTagHandler(new AltIdTagValueHandler(this));
    }finally{__CLR4_5_2pepelvicnleo.R.flushNeeded();}}

    private void addTagHandler(TagValueHandler handler) {try{__CLR4_5_2pepelvicnleo.R.inc(1001);
        __CLR4_5_2pepelvicnleo.R.inc(1002);handlerMap.put(handler.getTagName(), handler);
    }finally{__CLR4_5_2pepelvicnleo.R.flushNeeded();}}

    @Override
    public void startHeader() {try{__CLR4_5_2pepelvicnleo.R.inc(1003);
        __CLR4_5_2pepelvicnleo.R.inc(1004);inHeader = true;
    }finally{__CLR4_5_2pepelvicnleo.R.flushNeeded();}}

    @Override
    public void endHeader() {try{__CLR4_5_2pepelvicnleo.R.inc(1005);
        __CLR4_5_2pepelvicnleo.R.inc(1006);inHeader = false;
        __CLR4_5_2pepelvicnleo.R.inc(1007);setOntologyId();
    }finally{__CLR4_5_2pepelvicnleo.R.flushNeeded();}}

    /**
     * Sets the {@link org.semanticweb.owlapi.model.OWLOntologyID} of the
     * ontology being parsed from the tag values held by the
     * {@link #ontologyTagValue} and {@link #dataVersionTagValue} field. IRIs
     * for each field are generated and used to construct the
     * {@link org.semanticweb.owlapi.model.OWLOntologyID}.
     */
    private void setOntologyId() {try{__CLR4_5_2pepelvicnleo.R.inc(1008);
        __CLR4_5_2pepelvicnleo.R.inc(1009);IRI ontologyIRI = IRI.create(idSpaceManager.getIRIPrefix(ontologyTagValue) + ontologyTagValue);
        __CLR4_5_2pepelvicnleo.R.inc(1010);IRI versionIRI = null;
        __CLR4_5_2pepelvicnleo.R.inc(1011);if ((((dataVersionTagValue.length() > 0)&&(__CLR4_5_2pepelvicnleo.R.iget(1012)!=0|true))||(__CLR4_5_2pepelvicnleo.R.iget(1013)==0&false))) {{
            __CLR4_5_2pepelvicnleo.R.inc(1014);versionIRI = IRI.create(ontologyIRI.toString() + "/" + dataVersionTagValue);
        }
        }__CLR4_5_2pepelvicnleo.R.inc(1015);OWLOntologyID ontologyID = new OWLOntologyID(Optional.fromNullable(ontologyIRI), Optional.fromNullable(
            versionIRI));
        __CLR4_5_2pepelvicnleo.R.inc(1016);ontology.getOWLOntologyManager().applyChange(new SetOntologyID(ontology, ontologyID));
    }finally{__CLR4_5_2pepelvicnleo.R.flushNeeded();}}

    @Override
    public void startFrame(String name) {try{__CLR4_5_2pepelvicnleo.R.inc(1017);
        __CLR4_5_2pepelvicnleo.R.inc(1018);currentId = null;
        __CLR4_5_2pepelvicnleo.R.inc(1019);defaultNamespaceTagValue = null;
        __CLR4_5_2pepelvicnleo.R.inc(1020);stanzaType = name;
        __CLR4_5_2pepelvicnleo.R.inc(1021);termType = stanzaType.equals(OBOVocabulary.TERM.getName());
        __CLR4_5_2pepelvicnleo.R.inc(1022);typedefType = false;
        __CLR4_5_2pepelvicnleo.R.inc(1023);instanceType = false;
        __CLR4_5_2pepelvicnleo.R.inc(1024);if ((((!termType)&&(__CLR4_5_2pepelvicnleo.R.iget(1025)!=0|true))||(__CLR4_5_2pepelvicnleo.R.iget(1026)==0&false))) {{
            __CLR4_5_2pepelvicnleo.R.inc(1027);typedefType = stanzaType.equals(OBOVocabulary.TYPEDEF.getName());
            __CLR4_5_2pepelvicnleo.R.inc(1028);if ((((!typedefType)&&(__CLR4_5_2pepelvicnleo.R.iget(1029)!=0|true))||(__CLR4_5_2pepelvicnleo.R.iget(1030)==0&false))) {{
                __CLR4_5_2pepelvicnleo.R.inc(1031);instanceType = stanzaType.equals(OBOVocabulary.INSTANCE.getName());
            }
        }}
    }}finally{__CLR4_5_2pepelvicnleo.R.flushNeeded();}}

    @Override
    public void endFrame() {try{__CLR4_5_2pepelvicnleo.R.inc(1032);
        __CLR4_5_2pepelvicnleo.R.inc(1033);if ((((!unionOfOperands.isEmpty())&&(__CLR4_5_2pepelvicnleo.R.iget(1034)!=0|true))||(__CLR4_5_2pepelvicnleo.R.iget(1035)==0&false))) {{
            __CLR4_5_2pepelvicnleo.R.inc(1036);createUnionEquivalentClass();
            __CLR4_5_2pepelvicnleo.R.inc(1037);unionOfOperands.clear();
        }
        }__CLR4_5_2pepelvicnleo.R.inc(1038);if ((((!intersectionOfOperands.isEmpty())&&(__CLR4_5_2pepelvicnleo.R.iget(1039)!=0|true))||(__CLR4_5_2pepelvicnleo.R.iget(1040)==0&false))) {{
            __CLR4_5_2pepelvicnleo.R.inc(1041);createIntersectionEquivalentClass();
            __CLR4_5_2pepelvicnleo.R.inc(1042);intersectionOfOperands.clear();
        }
    }}finally{__CLR4_5_2pepelvicnleo.R.flushNeeded();}}

    private void createUnionEquivalentClass() {try{__CLR4_5_2pepelvicnleo.R.inc(1043);
        __CLR4_5_2pepelvicnleo.R.inc(1044);OWLClassExpression equivalentClass;
        __CLR4_5_2pepelvicnleo.R.inc(1045);if ((((unionOfOperands.size() == 1)&&(__CLR4_5_2pepelvicnleo.R.iget(1046)!=0|true))||(__CLR4_5_2pepelvicnleo.R.iget(1047)==0&false))) {{
            __CLR4_5_2pepelvicnleo.R.inc(1048);equivalentClass = unionOfOperands.iterator().next();
        } }else {{
            __CLR4_5_2pepelvicnleo.R.inc(1049);equivalentClass = getDataFactory().getOWLObjectUnionOf(unionOfOperands);
        }
        }__CLR4_5_2pepelvicnleo.R.inc(1050);createEquivalentClass(equivalentClass);
    }finally{__CLR4_5_2pepelvicnleo.R.flushNeeded();}}

    private void createIntersectionEquivalentClass() {try{__CLR4_5_2pepelvicnleo.R.inc(1051);
        __CLR4_5_2pepelvicnleo.R.inc(1052);OWLClassExpression equivalentClass;
        __CLR4_5_2pepelvicnleo.R.inc(1053);if ((((intersectionOfOperands.size() == 1)&&(__CLR4_5_2pepelvicnleo.R.iget(1054)!=0|true))||(__CLR4_5_2pepelvicnleo.R.iget(1055)==0&false))) {{
            __CLR4_5_2pepelvicnleo.R.inc(1056);equivalentClass = intersectionOfOperands.iterator().next();
        } }else {{
            __CLR4_5_2pepelvicnleo.R.inc(1057);equivalentClass = getDataFactory().getOWLObjectIntersectionOf(intersectionOfOperands);
        }
        }__CLR4_5_2pepelvicnleo.R.inc(1058);createEquivalentClass(equivalentClass);
    }finally{__CLR4_5_2pepelvicnleo.R.flushNeeded();}}

    private void createEquivalentClass(OWLClassExpression classExpression) {try{__CLR4_5_2pepelvicnleo.R.inc(1059);
        __CLR4_5_2pepelvicnleo.R.inc(1060);OWLAxiom ax = getDataFactory().getOWLEquivalentClassesAxiom(CollectionFactory.createSet(getCurrentClass(),
            classExpression));
        __CLR4_5_2pepelvicnleo.R.inc(1061);getOWLOntologyManager().applyChange(new AddAxiom(ontology, ax));
    }finally{__CLR4_5_2pepelvicnleo.R.flushNeeded();}}

    @Override
    public void handleTagValue(String tag, String value, String qualifierBlock, String comment) {try{__CLR4_5_2pepelvicnleo.R.inc(1062);
        __CLR4_5_2pepelvicnleo.R.inc(1063);try {
            __CLR4_5_2pepelvicnleo.R.inc(1064);TagValueHandler handler = handlerMap.get(tag);
            __CLR4_5_2pepelvicnleo.R.inc(1065);if ((((handler != null)&&(__CLR4_5_2pepelvicnleo.R.iget(1066)!=0|true))||(__CLR4_5_2pepelvicnleo.R.iget(1067)==0&false))) {{
                __CLR4_5_2pepelvicnleo.R.inc(1068);handler.handle(currentId, value, qualifierBlock, comment);
            } }else {__CLR4_5_2pepelvicnleo.R.inc(1069);if ((((inHeader)&&(__CLR4_5_2pepelvicnleo.R.iget(1070)!=0|true))||(__CLR4_5_2pepelvicnleo.R.iget(1071)==0&false))) {{
                __CLR4_5_2pepelvicnleo.R.inc(1072);if ((((tag.equals(IMPORT_TAG_NAME))&&(__CLR4_5_2pepelvicnleo.R.iget(1073)!=0|true))||(__CLR4_5_2pepelvicnleo.R.iget(1074)==0&false))) {{
                    __CLR4_5_2pepelvicnleo.R.inc(1075);String trim = value.trim();
                    assert (((trim != null)&&(__CLR4_5_2pepelvicnleo.R.iget(1076)!=0|true))||(__CLR4_5_2pepelvicnleo.R.iget(1077)==0&false));
                    __CLR4_5_2pepelvicnleo.R.inc(1078);IRI uri = IRI.create(trim);
                    __CLR4_5_2pepelvicnleo.R.inc(1079);OWLImportsDeclaration decl = owlOntologyManager.getOWLDataFactory().getOWLImportsDeclaration(uri);
                    __CLR4_5_2pepelvicnleo.R.inc(1080);owlOntologyManager.makeLoadImportRequest(decl, configuration);
                    __CLR4_5_2pepelvicnleo.R.inc(1081);owlOntologyManager.applyChange(new AddImport(ontology, decl));
                } }else {{
                    // Ontology annotations
                    __CLR4_5_2pepelvicnleo.R.inc(1082);OWLLiteral con = getDataFactory().getOWLLiteral(unescapeTagValue(value));
                    __CLR4_5_2pepelvicnleo.R.inc(1083);OWLAnnotationProperty property = getDataFactory().getOWLAnnotationProperty(getIRIFromTagName(tag));
                    __CLR4_5_2pepelvicnleo.R.inc(1084);OWLAnnotation anno = getDataFactory().getOWLAnnotation(property, con);
                    __CLR4_5_2pepelvicnleo.R.inc(1085);owlOntologyManager.applyChange(new AddOntologyAnnotation(ontology, anno));
                }
            }} }else {__CLR4_5_2pepelvicnleo.R.inc(1086);if ((((currentId != null)&&(__CLR4_5_2pepelvicnleo.R.iget(1087)!=0|true))||(__CLR4_5_2pepelvicnleo.R.iget(1088)==0&false))) {{
                // Add as annotation
                __CLR4_5_2pepelvicnleo.R.inc(1089);if ((((configuration.isLoadAnnotationAxioms())&&(__CLR4_5_2pepelvicnleo.R.iget(1090)!=0|true))||(__CLR4_5_2pepelvicnleo.R.iget(1091)==0&false))) {{
                    __CLR4_5_2pepelvicnleo.R.inc(1092);IRI subject = getIRI(currentId);
                    __CLR4_5_2pepelvicnleo.R.inc(1093);OWLLiteral con = getDataFactory().getOWLLiteral(unescapeTagValue(value));
                    __CLR4_5_2pepelvicnleo.R.inc(1094);IRI annotationPropertyIRI = getIRIFromTagName(tag);
                    __CLR4_5_2pepelvicnleo.R.inc(1095);OWLAnnotationProperty property = getDataFactory().getOWLAnnotationProperty(annotationPropertyIRI);
                    __CLR4_5_2pepelvicnleo.R.inc(1096);OWLAnnotation anno = getDataFactory().getOWLAnnotation(property, con);
                    __CLR4_5_2pepelvicnleo.R.inc(1097);OWLAnnotationAssertionAxiom ax = getDataFactory().getOWLAnnotationAssertionAxiom(subject, anno);
                    __CLR4_5_2pepelvicnleo.R.inc(1098);owlOntologyManager.addAxiom(ontology, ax);
                    __CLR4_5_2pepelvicnleo.R.inc(1099);OWLDeclarationAxiom annotationPropertyDeclaration = getDataFactory().getOWLDeclarationAxiom(
                        property);
                    __CLR4_5_2pepelvicnleo.R.inc(1100);owlOntologyManager.addAxiom(ontology, annotationPropertyDeclaration);
                }
            }}
        }}}} catch (UnloadableImportException e) {
            __CLR4_5_2pepelvicnleo.R.inc(1101);logger.severe(e.getMessage());
        }
    }finally{__CLR4_5_2pepelvicnleo.R.flushNeeded();}}

    @Nonnull
    public String unescapeTagValue(String value) {try{__CLR4_5_2pepelvicnleo.R.inc(1102);
        __CLR4_5_2pepelvicnleo.R.inc(1103);String unquoted;
        __CLR4_5_2pepelvicnleo.R.inc(1104);if ((((value.startsWith("\"") && value.endsWith("\""))&&(__CLR4_5_2pepelvicnleo.R.iget(1105)!=0|true))||(__CLR4_5_2pepelvicnleo.R.iget(1106)==0&false))) {{
            __CLR4_5_2pepelvicnleo.R.inc(1107);unquoted = value.substring(1, value.length() - 1);
        } }else {{
            __CLR4_5_2pepelvicnleo.R.inc(1108);unquoted = value;
        }
        }__CLR4_5_2pepelvicnleo.R.inc(1109);StringBuilder sb = new StringBuilder();
        __CLR4_5_2pepelvicnleo.R.inc(1110);for (int i = 0; (((i < unquoted.length())&&(__CLR4_5_2pepelvicnleo.R.iget(1111)!=0|true))||(__CLR4_5_2pepelvicnleo.R.iget(1112)==0&false)); i++) {{
            __CLR4_5_2pepelvicnleo.R.inc(1113);char ch = unquoted.charAt(i);
            __CLR4_5_2pepelvicnleo.R.inc(1114);if ((((ch != '\\')&&(__CLR4_5_2pepelvicnleo.R.iget(1115)!=0|true))||(__CLR4_5_2pepelvicnleo.R.iget(1116)==0&false))) {{
                __CLR4_5_2pepelvicnleo.R.inc(1117);sb.append(ch);
            }
        }}
        }__CLR4_5_2pepelvicnleo.R.inc(1118);return sb.toString();
    }finally{__CLR4_5_2pepelvicnleo.R.flushNeeded();}}

    private OWLDataFactory getDataFactory() {try{__CLR4_5_2pepelvicnleo.R.inc(1119);
        __CLR4_5_2pepelvicnleo.R.inc(1120);return getOWLOntologyManager().getOWLDataFactory();
    }finally{__CLR4_5_2pepelvicnleo.R.flushNeeded();}}

    public OWLClass getCurrentClass() {try{__CLR4_5_2pepelvicnleo.R.inc(1121);
        __CLR4_5_2pepelvicnleo.R.inc(1122);return getDataFactory().getOWLClass(getIRI(currentId));
    }finally{__CLR4_5_2pepelvicnleo.R.flushNeeded();}}

    public OWLEntity getCurrentEntity() {try{__CLR4_5_2pepelvicnleo.R.inc(1123);
        __CLR4_5_2pepelvicnleo.R.inc(1124);if ((((isTerm())&&(__CLR4_5_2pepelvicnleo.R.iget(1125)!=0|true))||(__CLR4_5_2pepelvicnleo.R.iget(1126)==0&false))) {{
            __CLR4_5_2pepelvicnleo.R.inc(1127);return getCurrentClass();
        } }else {__CLR4_5_2pepelvicnleo.R.inc(1128);if ((((isTypedef())&&(__CLR4_5_2pepelvicnleo.R.iget(1129)!=0|true))||(__CLR4_5_2pepelvicnleo.R.iget(1130)==0&false))) {{
            // Sometimes, we can have symbolic names e.g. has_part. It's not
            // really clear how to tell the difference
            __CLR4_5_2pepelvicnleo.R.inc(1131);IRI propertyIRI = getRelationIRIFromSymbolicIdOrOBOId(currentId);
            __CLR4_5_2pepelvicnleo.R.inc(1132);return getDataFactory().getOWLObjectProperty(propertyIRI);
        } }else {{
            __CLR4_5_2pepelvicnleo.R.inc(1133);return getDataFactory().getOWLNamedIndividual(getIRI(currentId));
        }
    }}}finally{__CLR4_5_2pepelvicnleo.R.flushNeeded();}}

    /**
     * Gets an IRI from a tag name.
     * 
     * @param tagName
     *        The tag name.
     * @return The IRI for the tag name. For built in tags this is obtained from
     *         the {@link OBOVocabulary} enum. Not <code>null</code>.
     * @throws NullPointerException
     *         if tagName is null.
     */
    @Nonnull
    public IRI getIRIFromTagName(String tagName) {try{__CLR4_5_2pepelvicnleo.R.inc(1134);
        __CLR4_5_2pepelvicnleo.R.inc(1135);if ((((tagName == null)&&(__CLR4_5_2pepelvicnleo.R.iget(1136)!=0|true))||(__CLR4_5_2pepelvicnleo.R.iget(1137)==0&false))) {{
            __CLR4_5_2pepelvicnleo.R.inc(1138);throw new NullPointerException("tagName must not be null");
        }
        }__CLR4_5_2pepelvicnleo.R.inc(1139);IRI tagIRI = tagIRICache.get(tagName);
        __CLR4_5_2pepelvicnleo.R.inc(1140);if ((((tagIRI != null)&&(__CLR4_5_2pepelvicnleo.R.iget(1141)!=0|true))||(__CLR4_5_2pepelvicnleo.R.iget(1142)==0&false))) {{
            __CLR4_5_2pepelvicnleo.R.inc(1143);return tagIRI;
        } }else {{
            __CLR4_5_2pepelvicnleo.R.inc(1144);IRI freshTagIRI = IRI.create(OBOVocabulary.OBO_IRI_BASE + tagName);
            __CLR4_5_2pepelvicnleo.R.inc(1145);tagIRICache.put(tagName, freshTagIRI);
            __CLR4_5_2pepelvicnleo.R.inc(1146);return freshTagIRI;
        }
    }}finally{__CLR4_5_2pepelvicnleo.R.flushNeeded();}}

    /**
     * Gets an IRI from an OBO ID. The OBO ID may be a canonical OBO ID of the
     * form idspace:sequence or it may be a non-canonical ID.
     * 
     * @param oboId
     *        The OBO ID
     * @return An IRI obtained from the translation of the OBO ID.
     */
    @Nonnull
    public IRI getIRIFromOBOId(String oboId) {try{__CLR4_5_2pepelvicnleo.R.inc(1147);
        __CLR4_5_2pepelvicnleo.R.inc(1148);if ((((oboId == null)&&(__CLR4_5_2pepelvicnleo.R.iget(1149)!=0|true))||(__CLR4_5_2pepelvicnleo.R.iget(1150)==0&false))) {{
            __CLR4_5_2pepelvicnleo.R.inc(1151);throw new NullPointerException("oboId must not be null.");
        }
        }__CLR4_5_2pepelvicnleo.R.inc(1152);return getIRI(oboId);
    }finally{__CLR4_5_2pepelvicnleo.R.flushNeeded();}}

    @Nonnull
    public IRI getRelationIRIFromSymbolicIdOrOBOId(String symbolicIdOrOBOId) {try{__CLR4_5_2pepelvicnleo.R.inc(1153);
        __CLR4_5_2pepelvicnleo.R.inc(1154);IRI fullIRI = symbolicIdCache.get(symbolicIdOrOBOId);
        __CLR4_5_2pepelvicnleo.R.inc(1155);if ((((fullIRI != null)&&(__CLR4_5_2pepelvicnleo.R.iget(1156)!=0|true))||(__CLR4_5_2pepelvicnleo.R.iget(1157)==0&false))) {{
            __CLR4_5_2pepelvicnleo.R.inc(1158);return fullIRI;
        }
        }__CLR4_5_2pepelvicnleo.R.inc(1159);OBOIdType idType = OBOIdType.getIdType(symbolicIdOrOBOId);
        __CLR4_5_2pepelvicnleo.R.inc(1160);if ((((idType == null)&&(__CLR4_5_2pepelvicnleo.R.iget(1161)!=0|true))||(__CLR4_5_2pepelvicnleo.R.iget(1162)==0&false))) {{
            __CLR4_5_2pepelvicnleo.R.inc(1163);throw new OWLRuntimeException("Invalid ID: " + symbolicIdOrOBOId + " in frame " + currentId);
        } }else {{
            __CLR4_5_2pepelvicnleo.R.inc(1164);return idType.getIRIFromOBOId(ontology.getOntologyID(), idSpaceManager, symbolicIdOrOBOId);
        }
    }}finally{__CLR4_5_2pepelvicnleo.R.flushNeeded();}}

    @Nonnull
    private IRI getIRI(String s) {try{__CLR4_5_2pepelvicnleo.R.inc(1165);
        __CLR4_5_2pepelvicnleo.R.inc(1166);String trimmed = s.trim();
        __CLR4_5_2pepelvicnleo.R.inc(1167);IRI iri = uriCache.get(trimmed);
        __CLR4_5_2pepelvicnleo.R.inc(1168);if ((((iri != null)&&(__CLR4_5_2pepelvicnleo.R.iget(1169)!=0|true))||(__CLR4_5_2pepelvicnleo.R.iget(1170)==0&false))) {{
            __CLR4_5_2pepelvicnleo.R.inc(1171);return iri;
        }
        }__CLR4_5_2pepelvicnleo.R.inc(1172);OWLOntologyID ontologyID = getOntology().getOntologyID();
        __CLR4_5_2pepelvicnleo.R.inc(1173);OBOIdType type = OBOIdType.getIdType(trimmed);
        __CLR4_5_2pepelvicnleo.R.inc(1174);if ((((type == null)&&(__CLR4_5_2pepelvicnleo.R.iget(1175)!=0|true))||(__CLR4_5_2pepelvicnleo.R.iget(1176)==0&false))) {{
            __CLR4_5_2pepelvicnleo.R.inc(1177);throw new OWLRuntimeException("Not a valid OBO ID: " + s);
        }
        }__CLR4_5_2pepelvicnleo.R.inc(1178);IRI freshIRI = type.getIRIFromOBOId(ontologyID, idSpaceManager, trimmed);
        __CLR4_5_2pepelvicnleo.R.inc(1179);uriCache.put(trimmed, freshIRI);
        __CLR4_5_2pepelvicnleo.R.inc(1180);return freshIRI;
    }finally{__CLR4_5_2pepelvicnleo.R.flushNeeded();}}

    private static final Pattern XREF_PATTERN = Pattern.compile("([^\"]*)\\s*(\"((\\\"|[^\"])*)\")?");
    private static final int XREF_ID_GROUP = 1;
    private static final int XREF_QUOTED_STRING_GROUP = 3;

    public OWLAnnotation parseXRef(@Nonnull String xref) {try{__CLR4_5_2pepelvicnleo.R.inc(1181);
        __CLR4_5_2pepelvicnleo.R.inc(1182);Matcher matcher = XREF_PATTERN.matcher(xref);
        __CLR4_5_2pepelvicnleo.R.inc(1183);if ((((matcher.matches())&&(__CLR4_5_2pepelvicnleo.R.iget(1184)!=0|true))||(__CLR4_5_2pepelvicnleo.R.iget(1185)==0&false))) {{
            __CLR4_5_2pepelvicnleo.R.inc(1186);OWLDataFactory df = getDataFactory();
            __CLR4_5_2pepelvicnleo.R.inc(1187);String xrefQuotedString = matcher.group(XREF_QUOTED_STRING_GROUP);
            // the quoted string is a description of the xref. I can't find
            // anywhere to put this.
            // Just add as a comment for now
            __CLR4_5_2pepelvicnleo.R.inc(1188);@Nonnull
            Set<OWLAnnotation> xrefDescriptions = new HashSet<>();
            __CLR4_5_2pepelvicnleo.R.inc(1189);if ((((xrefQuotedString != null)&&(__CLR4_5_2pepelvicnleo.R.iget(1190)!=0|true))||(__CLR4_5_2pepelvicnleo.R.iget(1191)==0&false))) {{
                __CLR4_5_2pepelvicnleo.R.inc(1192);xrefDescriptions.add(df.getOWLAnnotation(df.getRDFSComment(), df.getOWLLiteral(xrefQuotedString)));
            }
            }__CLR4_5_2pepelvicnleo.R.inc(1193);String xrefId = matcher.group(XREF_ID_GROUP).trim();
            assert (((xrefId != null)&&(__CLR4_5_2pepelvicnleo.R.iget(1194)!=0|true))||(__CLR4_5_2pepelvicnleo.R.iget(1195)==0&false));
            __CLR4_5_2pepelvicnleo.R.inc(1196);OBOIdType idType = OBOIdType.getIdType(xrefId);
            __CLR4_5_2pepelvicnleo.R.inc(1197);OWLAnnotationValue annotationValue;
            __CLR4_5_2pepelvicnleo.R.inc(1198);if ((((idType != null)&&(__CLR4_5_2pepelvicnleo.R.iget(1199)!=0|true))||(__CLR4_5_2pepelvicnleo.R.iget(1200)==0&false))) {{
                __CLR4_5_2pepelvicnleo.R.inc(1201);annotationValue = getIRIFromOBOId(xrefId);
            } }else {{
                __CLR4_5_2pepelvicnleo.R.inc(1202);annotationValue = getDataFactory().getOWLLiteral(xrefId);
            }
            }__CLR4_5_2pepelvicnleo.R.inc(1203);OWLAnnotationProperty xrefProperty = df.getOWLAnnotationProperty(OBOVocabulary.XREF.getIRI());
            __CLR4_5_2pepelvicnleo.R.inc(1204);return df.getOWLAnnotation(xrefProperty, annotationValue, xrefDescriptions);
        } }else {{
            __CLR4_5_2pepelvicnleo.R.inc(1205);OWLDataFactory df = getDataFactory();
            __CLR4_5_2pepelvicnleo.R.inc(1206);OWLAnnotationProperty xrefProperty = df.getOWLAnnotationProperty(OBOVocabulary.XREF.getIRI());
            __CLR4_5_2pepelvicnleo.R.inc(1207);return df.getOWLAnnotation(xrefProperty, df.getOWLLiteral(xref));
        }
    }}finally{__CLR4_5_2pepelvicnleo.R.flushNeeded();}}
}
