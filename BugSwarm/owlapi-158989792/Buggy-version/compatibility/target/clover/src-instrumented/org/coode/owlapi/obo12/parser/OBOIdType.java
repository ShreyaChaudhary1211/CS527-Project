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
 * Copyright 2011, The University of Manchester
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

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLOntologyID;

/**
 * Author: Matthew Horridge<br>
 * Stanford University<br>
 * Bio-Medical Informatics Research Group<br>
 * Date: 19/04/2012
 * <p>
 * Describes the types of OBO IDs that can be found in OBO Files. Taken from
 * Section 2.5 of the OBO Syntax and Semantics Specification.
 * </p>
 */
@SuppressWarnings("all")
enum OBOIdType {
    /**
     * Any string with an http: or https: prefix.
     */
    URL_AS_ID(Pattern.compile("(http:|https:)[^\\s]*"), new OBOIIdTranslator() {

        @Override
        public IRI getIRIFromOBOId(OWLOntologyID ontologyID,
                IDSpaceManager idSpaceManager, String id) {try{__CLR4_5_2y1y1lvicnlev.R.inc(1225);
            __CLR4_5_2y1y1lvicnlev.R.inc(1226);return IRI.create(id);
        }finally{__CLR4_5_2y1y1lvicnlev.R.flushNeeded();}}
    }),
    /**
     * Any unprefixed ID. Does not contain a colon character. The spec implies
     * the empty string matches this ID.
     */
    UNPREFIXED_ID(Pattern.compile("[^\\s:]*"), new OBOIIdTranslator() {

        @Override
        public IRI getIRIFromOBOId(OWLOntologyID ontologyID,
                IDSpaceManager idSpaceManager, String id) {try{__CLR4_5_2y1y1lvicnlev.R.inc(1227);
            __CLR4_5_2y1y1lvicnlev.R.inc(1228);StringBuilder sb = new StringBuilder();
            __CLR4_5_2y1y1lvicnlev.R.inc(1229);if ((((!ontologyID.isAnonymous())&&(__CLR4_5_2y1y1lvicnlev.R.iget(1230)!=0|true))||(__CLR4_5_2y1y1lvicnlev.R.iget(1231)==0&false))) {{
                __CLR4_5_2y1y1lvicnlev.R.inc(1232);sb.append(ontologyID.getOntologyIRI());
            } }else {{
                __CLR4_5_2y1y1lvicnlev.R.inc(1233);sb.append("anonymous");
            }
            }__CLR4_5_2y1y1lvicnlev.R.inc(1234);sb.append("#");
            __CLR4_5_2y1y1lvicnlev.R.inc(1235);sb.append(id);
            __CLR4_5_2y1y1lvicnlev.R.inc(1236);return IRI.create(sb.toString());
        }finally{__CLR4_5_2y1y1lvicnlev.R.flushNeeded();}}
    }),
    /**
     * Must contain a colon character in the ID. The idspace must only consist
     * of Alpha-Chars and possibly an underscore. The local id must only consist
     * of digits (possibly none).
     */
    CANONICAL_PREFIXED_ID(
            Pattern.compile("([A-Za-z][A-Za-z_]*):([0-9]*)"),
            new OBOIIdTranslator() {

                @Override
                public IRI getIRIFromOBOId(OWLOntologyID ontologyID,
                        IDSpaceManager idSpaceManager, String id) {try{__CLR4_5_2y1y1lvicnlev.R.inc(1237);
                    __CLR4_5_2y1y1lvicnlev.R.inc(1238);Matcher matcher = CANONICAL_PREFIXED_ID.getPattern()
                            .matcher(id);
                    __CLR4_5_2y1y1lvicnlev.R.inc(1239);matcher.matches();
                    __CLR4_5_2y1y1lvicnlev.R.inc(1240);String idspace = matcher.group(1);
                    __CLR4_5_2y1y1lvicnlev.R.inc(1241);String localid = matcher.group(2);
                    __CLR4_5_2y1y1lvicnlev.R.inc(1242);String iriPrefix = idSpaceManager.getIRIPrefix(idspace);
                    __CLR4_5_2y1y1lvicnlev.R.inc(1243);StringBuilder sb = new StringBuilder();
                    __CLR4_5_2y1y1lvicnlev.R.inc(1244);sb.append(iriPrefix);
                    __CLR4_5_2y1y1lvicnlev.R.inc(1245);sb.append(idspace);
                    __CLR4_5_2y1y1lvicnlev.R.inc(1246);sb.append("_");
                    __CLR4_5_2y1y1lvicnlev.R.inc(1247);sb.append(localid);
                    __CLR4_5_2y1y1lvicnlev.R.inc(1248);return IRI.create(sb.toString());
                }finally{__CLR4_5_2y1y1lvicnlev.R.flushNeeded();}}
            }),
    /**
     * Must contain a colon character somewhere in the ID. Any kind of prefix
     * plus a local Id. The prefix doesn't contain a colon character.
     */
    NON_CANONICAL_PREFIXED_ID(
            Pattern.compile("([^\\s:]*):([^\\s]*)"),
            new OBOIIdTranslator() {

                @Override
                public IRI getIRIFromOBOId(OWLOntologyID ontologyID,
                        IDSpaceManager idSpaceManager, String id) {try{__CLR4_5_2y1y1lvicnlev.R.inc(1249);
                    __CLR4_5_2y1y1lvicnlev.R.inc(1250);Matcher matcher = NON_CANONICAL_PREFIXED_ID.getPattern()
                            .matcher(id);
                    __CLR4_5_2y1y1lvicnlev.R.inc(1251);matcher.matches();
                    __CLR4_5_2y1y1lvicnlev.R.inc(1252);String idspace = matcher.group(1);
                    __CLR4_5_2y1y1lvicnlev.R.inc(1253);String localid = matcher.group(2);
                    __CLR4_5_2y1y1lvicnlev.R.inc(1254);String iriPrefix = idSpaceManager.getIRIPrefix(idspace);
                    __CLR4_5_2y1y1lvicnlev.R.inc(1255);StringBuilder sb = new StringBuilder();
                    __CLR4_5_2y1y1lvicnlev.R.inc(1256);sb.append(iriPrefix);
                    __CLR4_5_2y1y1lvicnlev.R.inc(1257);sb.append(idspace);
                    __CLR4_5_2y1y1lvicnlev.R.inc(1258);sb.append("#_");
                    __CLR4_5_2y1y1lvicnlev.R.inc(1259);sb.append(localid);
                    __CLR4_5_2y1y1lvicnlev.R.inc(1260);return IRI.create(sb.toString());
                }finally{__CLR4_5_2y1y1lvicnlev.R.flushNeeded();}}
            });

    private Pattern pattern;
    private OBOIIdTranslator translator;

    private OBOIdType(Pattern pattern, OBOIIdTranslator translator) {try{__CLR4_5_2y1y1lvicnlev.R.inc(1261);
        __CLR4_5_2y1y1lvicnlev.R.inc(1262);this.pattern = pattern;
        __CLR4_5_2y1y1lvicnlev.R.inc(1263);this.translator = translator;
    }finally{__CLR4_5_2y1y1lvicnlev.R.flushNeeded();}}

    /** @return the pattern */
    public Pattern getPattern() {try{__CLR4_5_2y1y1lvicnlev.R.inc(1264);
        __CLR4_5_2y1y1lvicnlev.R.inc(1265);return pattern;
    }finally{__CLR4_5_2y1y1lvicnlev.R.flushNeeded();}}

    /**
     * @param ontologyID
     * @param idSpaceManager
     * @param oboId
     * @return the translated iri
     */
    @Nonnull
    public IRI getIRIFromOBOId(OWLOntologyID ontologyID,
            IDSpaceManager idSpaceManager, String oboId) {try{__CLR4_5_2y1y1lvicnlev.R.inc(1266);
        __CLR4_5_2y1y1lvicnlev.R.inc(1267);return translator.getIRIFromOBOId(ontologyID, idSpaceManager, oboId);
    }finally{__CLR4_5_2y1y1lvicnlev.R.flushNeeded();}}

    /**
     * Gets the OBOIdType for a given OBO ID.
     * 
     * @param oboId
     *        The OBO ID. Must not be null.
     * @return The OBOIdType for the specified oboId, or <code>null</code> if
     *         the specified oboId does not conform to any OBO Id type.
     */
    public static OBOIdType getIdType(String oboId) {try{__CLR4_5_2y1y1lvicnlev.R.inc(1268);
        __CLR4_5_2y1y1lvicnlev.R.inc(1269);if ((((oboId == null)&&(__CLR4_5_2y1y1lvicnlev.R.iget(1270)!=0|true))||(__CLR4_5_2y1y1lvicnlev.R.iget(1271)==0&false))) {{
            __CLR4_5_2y1y1lvicnlev.R.inc(1272);throw new NullPointerException("oboId must not be null");
        }
        }__CLR4_5_2y1y1lvicnlev.R.inc(1273);for (OBOIdType idType : values()) {{
            __CLR4_5_2y1y1lvicnlev.R.inc(1274);Pattern pattern = idType.getPattern();
            __CLR4_5_2y1y1lvicnlev.R.inc(1275);Matcher matcher = pattern.matcher(oboId);
            __CLR4_5_2y1y1lvicnlev.R.inc(1276);if ((((matcher.matches())&&(__CLR4_5_2y1y1lvicnlev.R.iget(1277)!=0|true))||(__CLR4_5_2y1y1lvicnlev.R.iget(1278)==0&false))) {{
                __CLR4_5_2y1y1lvicnlev.R.inc(1279);return idType;
            }
        }}
        }__CLR4_5_2y1y1lvicnlev.R.inc(1280);return null;
    }finally{__CLR4_5_2y1y1lvicnlev.R.flushNeeded();}}

    private static interface OBOIIdTranslator {

        IRI getIRIFromOBOId(OWLOntologyID ontologyID,
                IDSpaceManager idSpaceManager, String id);
    }
;public static class __CLR4_5_2y1y1lvicnlev{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006d\u0070\u0061\u0074\u0069\u0062\u0069\u006c\u0069\u0074\u0079\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237345588L,8589935092L,1281,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;}
