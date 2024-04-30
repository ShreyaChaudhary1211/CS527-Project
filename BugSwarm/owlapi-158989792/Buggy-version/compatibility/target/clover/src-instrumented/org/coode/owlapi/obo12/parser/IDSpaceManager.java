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

import java.util.HashMap;
import java.util.Map;

/**
 * Author: Matthew Horridge<br>
 * Stanford University<br>
 * Bio-Medical Informatics Research Group<br>
 * Date: 18/04/2012
 * <p>
 * Maps between id prefixes and IRI prefixes. By default an IRI prefix is the
 * value defined by {@link OBOPrefix#getPrefix()}, but this can be overridden
 * using an idspace tag in the ontology header.
 * </p>
 * <p>
 * Note that the terminology used here, i.e. "id prefix" and "IRI prefix" is OBO
 * terminology and is not related to the OWL notion of prefix name and prefix.
 * "id prefix" is the substring before the colon in an OBO id. IRI prefix is the
 * prefix of an IRI that is the result of translating an OBO id to an IRI.
 * </p>
 */
class IDSpaceManager {public static class __CLR4_5_2czczlvicnlc3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006d\u0070\u0061\u0074\u0069\u0062\u0069\u006c\u0069\u0074\u0079\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237345588L,8589935092L,493,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private Map<String, String> idPrefix2IRIPrefixMap = new HashMap<>();

    /**
     * 
     */
    public IDSpaceManager() {try{__CLR4_5_2czczlvicnlc3.R.inc(467);}finally{__CLR4_5_2czczlvicnlc3.R.flushNeeded();}}

    /**
     * Creates an IDSpaceManager and copying the id prefix to IRI prefix
     * mappings contained in some other IDSpaceManager.
     * 
     * @param idSpaceManager
     *        The other IDSpaceManager from where id prefix to IRI prefix
     *        mappings will be copied. Not null.
     * @throws NullPointerException
     *         if idSpaceManager is null.
     */
    public IDSpaceManager(IDSpaceManager idSpaceManager) {try{__CLR4_5_2czczlvicnlc3.R.inc(468);
        __CLR4_5_2czczlvicnlc3.R.inc(469);if ((((idSpaceManager == null)&&(__CLR4_5_2czczlvicnlc3.R.iget(470)!=0|true))||(__CLR4_5_2czczlvicnlc3.R.iget(471)==0&false))) {{
            __CLR4_5_2czczlvicnlc3.R.inc(472);throw new NullPointerException("idSpaceManager must not be null");
        }
        }__CLR4_5_2czczlvicnlc3.R.inc(473);idPrefix2IRIPrefixMap.putAll(idSpaceManager.idPrefix2IRIPrefixMap);
    }finally{__CLR4_5_2czczlvicnlc3.R.flushNeeded();}}

    /**
     * Gets the default IRI prefix (which is returned by the
     * {@link #getIRIPrefix(String)} for unregistered id prefixes.
     * 
     * @return The default prefix. This is actually defined by
     *         {@link OBOPrefix#OBO}.
     */
    public String getDefaultIRIPrefix() {try{__CLR4_5_2czczlvicnlc3.R.inc(474);
        __CLR4_5_2czczlvicnlc3.R.inc(475);return OBOPrefix.OBO.getPrefix();
    }finally{__CLR4_5_2czczlvicnlc3.R.flushNeeded();}}

    /**
     * Gets an IRI prefix from an id prefix.
     * 
     * @param idPrefix
     *        The id prefix. May be null.
     * @return The IRI prefix for the given id prefix. Not null. If the
     *         specified id prefix is not registered/set with this manager, or
     *         it is null, then the default prefix will be returned, which is
     *         defined by {@link OBOPrefix#OBO}.
     */
    public String getIRIPrefix(String idPrefix) {try{__CLR4_5_2czczlvicnlc3.R.inc(476);
        __CLR4_5_2czczlvicnlc3.R.inc(477);String iriPrefix = idPrefix2IRIPrefixMap.get(idPrefix);
        __CLR4_5_2czczlvicnlc3.R.inc(478);if ((((iriPrefix != null)&&(__CLR4_5_2czczlvicnlc3.R.iget(479)!=0|true))||(__CLR4_5_2czczlvicnlc3.R.iget(480)==0&false))) {{
            __CLR4_5_2czczlvicnlc3.R.inc(481);return iriPrefix;
        } }else {{
            __CLR4_5_2czczlvicnlc3.R.inc(482);return getDefaultIRIPrefix();
        }
    }}finally{__CLR4_5_2czczlvicnlc3.R.flushNeeded();}}

    /**
     * Sets the IRI prefix for a given id prefix. This clears any previously set
     * IRI prefix for the given id prefix.
     * 
     * @param idPrefix
     *        The id prefix to set.
     * @param iriPrefix
     *        The IRI prefix that the id prefix maps to.
     */
    public void setIRIPrefix(String idPrefix, String iriPrefix) {try{__CLR4_5_2czczlvicnlc3.R.inc(483);
        __CLR4_5_2czczlvicnlc3.R.inc(484);if ((((idPrefix == null)&&(__CLR4_5_2czczlvicnlc3.R.iget(485)!=0|true))||(__CLR4_5_2czczlvicnlc3.R.iget(486)==0&false))) {{
            __CLR4_5_2czczlvicnlc3.R.inc(487);throw new NullPointerException("idPrefix must not be null");
        }
        }__CLR4_5_2czczlvicnlc3.R.inc(488);if ((((iriPrefix == null)&&(__CLR4_5_2czczlvicnlc3.R.iget(489)!=0|true))||(__CLR4_5_2czczlvicnlc3.R.iget(490)==0&false))) {{
            __CLR4_5_2czczlvicnlc3.R.inc(491);throw new NullPointerException("iriPrefix must not be null");
        }
        }__CLR4_5_2czczlvicnlc3.R.inc(492);idPrefix2IRIPrefixMap.put(idPrefix, iriPrefix);
    }finally{__CLR4_5_2czczlvicnlc3.R.flushNeeded();}}
}
