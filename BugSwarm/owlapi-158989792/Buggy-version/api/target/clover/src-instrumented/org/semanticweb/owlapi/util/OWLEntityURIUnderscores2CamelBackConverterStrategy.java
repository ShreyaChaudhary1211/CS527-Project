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

import static org.semanticweb.owlapi.util.OWLAPIPreconditions.checkNotNull;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLEntity;

import com.google.common.base.Optional;

/**
 * Converts the entity URI fragment or last path element if the fragment is not
 * present to Camel Case. For example, if the URI is
 * http://another.com/pathA/pathB#has_part then this will be converted to
 * http://another.com/pathA/pathB#hasPart
 * 
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.2.0
 */
public class OWLEntityURIUnderscores2CamelBackConverterStrategy implements OWLEntityURIConverterStrategy {public static class __CLR4_5_28iy8iylvickr48{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0061\u0070\u0069\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237201267L,8589935092L,11098,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final Map<IRI, IRI> iriMap = new HashMap<>();

    @Override
    public IRI getConvertedIRI(@Nonnull OWLEntity entity) {try{__CLR4_5_28iy8iylvickr48.R.inc(11050);
        __CLR4_5_28iy8iylvickr48.R.inc(11051);IRI convIRI = iriMap.get(entity.getIRI());
        __CLR4_5_28iy8iylvickr48.R.inc(11052);if ((((convIRI == null)&&(__CLR4_5_28iy8iylvickr48.R.iget(11053)!=0|true))||(__CLR4_5_28iy8iylvickr48.R.iget(11054)==0&false))) {{
            __CLR4_5_28iy8iylvickr48.R.inc(11055);convIRI = convert(entity.getIRI());
            __CLR4_5_28iy8iylvickr48.R.inc(11056);iriMap.put(entity.getIRI(), convIRI);
        }
        }__CLR4_5_28iy8iylvickr48.R.inc(11057);return convIRI;
    }finally{__CLR4_5_28iy8iylvickr48.R.flushNeeded();}}

    @Nonnull
    private static IRI convert(@Nonnull IRI iri) {try{__CLR4_5_28iy8iylvickr48.R.inc(11058);
        __CLR4_5_28iy8iylvickr48.R.inc(11059);checkNotNull(iri, "iri cannot be null");
        __CLR4_5_28iy8iylvickr48.R.inc(11060);Optional<String> fragment = iri.getRemainder();
        __CLR4_5_28iy8iylvickr48.R.inc(11061);if ((((fragment.isPresent())&&(__CLR4_5_28iy8iylvickr48.R.iget(11062)!=0|true))||(__CLR4_5_28iy8iylvickr48.R.iget(11063)==0&false))) {{
            __CLR4_5_28iy8iylvickr48.R.inc(11064);String base = iri.getNamespace();
            __CLR4_5_28iy8iylvickr48.R.inc(11065);String camelCaseFragment = toCamelCase(fragment.get());
            __CLR4_5_28iy8iylvickr48.R.inc(11066);return IRI.create(base, camelCaseFragment);
        }
        // for an IRI without fragment, the part to modify is the previous
        // fragment of the path.
        }__CLR4_5_28iy8iylvickr48.R.inc(11067);String path = iri.toURI().getPath();
        __CLR4_5_28iy8iylvickr48.R.inc(11068);if ((((!path.isEmpty())&&(__CLR4_5_28iy8iylvickr48.R.iget(11069)!=0|true))||(__CLR4_5_28iy8iylvickr48.R.iget(11070)==0&false))) {{
            __CLR4_5_28iy8iylvickr48.R.inc(11071);int index = path.lastIndexOf('/');
            __CLR4_5_28iy8iylvickr48.R.inc(11072);String lastPathElement = path.substring(index + 1, path.length());
            assert (((lastPathElement != null)&&(__CLR4_5_28iy8iylvickr48.R.iget(11073)!=0|true))||(__CLR4_5_28iy8iylvickr48.R.iget(11074)==0&false));
            __CLR4_5_28iy8iylvickr48.R.inc(11075);String camelCaseElement = toCamelCase(lastPathElement);
            __CLR4_5_28iy8iylvickr48.R.inc(11076);String iriString = iri.toString();
            __CLR4_5_28iy8iylvickr48.R.inc(11077);String base = iriString.substring(0, iriString.lastIndexOf('/') + 1);
            __CLR4_5_28iy8iylvickr48.R.inc(11078);return IRI.create(base, camelCaseElement);
        }
        }__CLR4_5_28iy8iylvickr48.R.inc(11079);return iri;
    }finally{__CLR4_5_28iy8iylvickr48.R.flushNeeded();}}

    private static String toCamelCase(@Nonnull String s) {try{__CLR4_5_28iy8iylvickr48.R.inc(11080);
        __CLR4_5_28iy8iylvickr48.R.inc(11081);StringBuilder sb = new StringBuilder(s.length());
        __CLR4_5_28iy8iylvickr48.R.inc(11082);boolean nextIsUpperCase = false;
        __CLR4_5_28iy8iylvickr48.R.inc(11083);for (int i = 0; (((i < s.length())&&(__CLR4_5_28iy8iylvickr48.R.iget(11084)!=0|true))||(__CLR4_5_28iy8iylvickr48.R.iget(11085)==0&false)); i++) {{
            __CLR4_5_28iy8iylvickr48.R.inc(11086);char ch = s.charAt(i);
            __CLR4_5_28iy8iylvickr48.R.inc(11087);if ((((ch == '_')&&(__CLR4_5_28iy8iylvickr48.R.iget(11088)!=0|true))||(__CLR4_5_28iy8iylvickr48.R.iget(11089)==0&false))) {{
                __CLR4_5_28iy8iylvickr48.R.inc(11090);nextIsUpperCase = true;
            } }else {{
                __CLR4_5_28iy8iylvickr48.R.inc(11091);if ((((nextIsUpperCase)&&(__CLR4_5_28iy8iylvickr48.R.iget(11092)!=0|true))||(__CLR4_5_28iy8iylvickr48.R.iget(11093)==0&false))) {{
                    __CLR4_5_28iy8iylvickr48.R.inc(11094);sb.append(Character.toUpperCase(ch));
                    __CLR4_5_28iy8iylvickr48.R.inc(11095);nextIsUpperCase = false;
                } }else {{
                    __CLR4_5_28iy8iylvickr48.R.inc(11096);sb.append(ch);
                }
            }}
        }}
        }__CLR4_5_28iy8iylvickr48.R.inc(11097);return sb.toString();
    }finally{__CLR4_5_28iy8iylvickr48.R.flushNeeded();}}
}
