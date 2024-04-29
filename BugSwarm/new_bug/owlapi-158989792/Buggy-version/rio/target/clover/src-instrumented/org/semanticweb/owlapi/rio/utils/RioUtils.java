/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * This file is part of the OWL API.
 * 
 * The contents of this file are subject to the LGPL License, Version 3.0.
 * 
 * Copyright (C) 2011, The University of Queensland
 * 
 * This program is free software: you can redistribute it and/or modify it under the terms of the
 * GNU General Public License as published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without
 * even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License along with this program. If
 * not, see http://www.gnu.org/licenses/.
 * 
 * 
 * Alternatively, the contents of this file may be used under the terms of the Apache License,
 * Version 2.0 in which case, the provisions of the Apache License Version 2.0 are applicable
 * instead of those above.
 * 
 * Copyright 2011, The University of Queensland
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package org.semanticweb.owlapi.rio.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import javax.annotation.Nullable;

import org.openrdf.OpenRDFUtil;
import org.openrdf.model.Resource;
import org.openrdf.model.Statement;
import org.openrdf.model.URI;
import org.openrdf.model.Value;
import org.openrdf.model.impl.ValueFactoryImpl;
import org.semanticweb.owlapi.io.RDFLiteral;
import org.semanticweb.owlapi.io.RDFResourceIRI;
import org.semanticweb.owlapi.io.RDFTriple;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Utilities for translating between OWLAPI and Sesame Rio.
 * 
 * @author Peter Ansell p_ansell@yahoo.com
 * @since 4.0.0
 */
public final class RioUtils {public static class __CLR4_5_2qhqhlvicnc7e{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0072\u0069\u006f\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237333555L,8589935092L,1013,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final Logger LOGGER = LoggerFactory
            .getLogger(RioUtils.class);

    private RioUtils() {try{__CLR4_5_2qhqhlvicnc7e.R.inc(953);}finally{__CLR4_5_2qhqhlvicnc7e.R.flushNeeded();}}

    /**
     * Create a Statement based on the given RDFTriple, with an empty context.
     * 
     * @param triple
     *        The OWLAPI {@link RDFTriple} to convert.
     * @return An OpenRDF {@link Statement} representing the given RDFTriple.
     */
    @Nullable
    public static Statement tripleAsStatement(final RDFTriple triple) {try{__CLR4_5_2qhqhlvicnc7e.R.inc(954);
        __CLR4_5_2qhqhlvicnc7e.R.inc(955);Collection<Statement> statements = tripleAsStatements(triple);
        __CLR4_5_2qhqhlvicnc7e.R.inc(956);if ((((!statements.isEmpty())&&(__CLR4_5_2qhqhlvicnc7e.R.iget(957)!=0|true))||(__CLR4_5_2qhqhlvicnc7e.R.iget(958)==0&false))) {{
            __CLR4_5_2qhqhlvicnc7e.R.inc(959);return statements.iterator().next();
        } }else {{
            __CLR4_5_2qhqhlvicnc7e.R.inc(960);return null;
        }
    }}finally{__CLR4_5_2qhqhlvicnc7e.R.flushNeeded();}}

    /**
     * Create a collection of Statements with the given contexts.
     * 
     * @param triple
     *        The OWLAPI {@link RDFTriple} to convert.
     * @param contexts
     *        If context is not null, it is used to create a context statement
     * @return A collection of OpenRDF {@link Statement}s representing the given
     *         RDFTriple in each of the given contexts.
     */
    public static Collection<Statement> tripleAsStatements(
            final RDFTriple triple, final Resource... contexts) {try{__CLR4_5_2qhqhlvicnc7e.R.inc(961);
        __CLR4_5_2qhqhlvicnc7e.R.inc(962);OpenRDFUtil.verifyContextNotNull(contexts);
        __CLR4_5_2qhqhlvicnc7e.R.inc(963);final ValueFactoryImpl vf = ValueFactoryImpl.getInstance();
        __CLR4_5_2qhqhlvicnc7e.R.inc(964);Resource subject;
        __CLR4_5_2qhqhlvicnc7e.R.inc(965);URI predicate;
        __CLR4_5_2qhqhlvicnc7e.R.inc(966);Value object;
        __CLR4_5_2qhqhlvicnc7e.R.inc(967);if ((((triple.getSubject() instanceof RDFResourceIRI)&&(__CLR4_5_2qhqhlvicnc7e.R.iget(968)!=0|true))||(__CLR4_5_2qhqhlvicnc7e.R.iget(969)==0&false))) {{
            __CLR4_5_2qhqhlvicnc7e.R.inc(970);try {
                __CLR4_5_2qhqhlvicnc7e.R.inc(971);subject = vf.createURI(triple.getSubject().getIRI().toString());
            } catch (IllegalArgumentException iae) {
                __CLR4_5_2qhqhlvicnc7e.R.inc(972);LOGGER.error("Subject URI was invalid: {}", triple);
                __CLR4_5_2qhqhlvicnc7e.R.inc(973);return Collections.emptyList();
            }
        } }else {{
            // FIXME: When blank nodes are no longer represented as IRIs
            // internally, need to fix
            // this
            __CLR4_5_2qhqhlvicnc7e.R.inc(974);if ((((triple.getSubject().getIRI().toString().startsWith("_:"))&&(__CLR4_5_2qhqhlvicnc7e.R.iget(975)!=0|true))||(__CLR4_5_2qhqhlvicnc7e.R.iget(976)==0&false))) {{
                __CLR4_5_2qhqhlvicnc7e.R.inc(977);subject = vf.createBNode(triple.getSubject().getIRI()
                        .toString().substring(2));
            } }else {{
                __CLR4_5_2qhqhlvicnc7e.R.inc(978);subject = vf.createBNode(triple.getSubject().getIRI()
                        .toString());
            }
        }}
        }__CLR4_5_2qhqhlvicnc7e.R.inc(979);predicate = vf.createURI(triple.getPredicate().getIRI().toString());
        __CLR4_5_2qhqhlvicnc7e.R.inc(980);if ((((triple.getObject() instanceof RDFResourceIRI)&&(__CLR4_5_2qhqhlvicnc7e.R.iget(981)!=0|true))||(__CLR4_5_2qhqhlvicnc7e.R.iget(982)==0&false))) {{
            __CLR4_5_2qhqhlvicnc7e.R.inc(983);try {
                __CLR4_5_2qhqhlvicnc7e.R.inc(984);object = vf.createURI(triple.getObject().getIRI().toString());
            } catch (IllegalArgumentException iae) {
                __CLR4_5_2qhqhlvicnc7e.R.inc(985);LOGGER.error("Object URI was invalid: {}", triple);
                __CLR4_5_2qhqhlvicnc7e.R.inc(986);return Collections.emptyList();
            }
        } }else {__CLR4_5_2qhqhlvicnc7e.R.inc(987);if ((((triple.getObject() instanceof RDFLiteral)&&(__CLR4_5_2qhqhlvicnc7e.R.iget(988)!=0|true))||(__CLR4_5_2qhqhlvicnc7e.R.iget(989)==0&false))) {{
            __CLR4_5_2qhqhlvicnc7e.R.inc(990);final RDFLiteral literalObject = (RDFLiteral) triple.getObject();
            // TODO: When updating to Sesame-2.8 the following may need to be
            // rewritten
            __CLR4_5_2qhqhlvicnc7e.R.inc(991);if ((((literalObject.isPlainLiteral())&&(__CLR4_5_2qhqhlvicnc7e.R.iget(992)!=0|true))||(__CLR4_5_2qhqhlvicnc7e.R.iget(993)==0&false))) {{
                __CLR4_5_2qhqhlvicnc7e.R.inc(994);if ((((literalObject.hasLang())&&(__CLR4_5_2qhqhlvicnc7e.R.iget(995)!=0|true))||(__CLR4_5_2qhqhlvicnc7e.R.iget(996)==0&false))) {{
                    __CLR4_5_2qhqhlvicnc7e.R.inc(997);object = vf.createLiteral(literalObject.getLexicalValue(),
                            literalObject.getLang());
                } }else {{
                    __CLR4_5_2qhqhlvicnc7e.R.inc(998);object = vf.createLiteral(literalObject.getLexicalValue());
                }
            }} }else {{
                __CLR4_5_2qhqhlvicnc7e.R.inc(999);object = vf.createLiteral(literalObject.getLexicalValue(),
                        vf.createURI(literalObject.getDatatype().toString()));
            }
        }} }else {{
            // FIXME: When blank nodes are no longer represented as IRIs
            // internally, need to fix
            // this
            __CLR4_5_2qhqhlvicnc7e.R.inc(1000);if ((((triple.getObject().getIRI().toString().startsWith("_:"))&&(__CLR4_5_2qhqhlvicnc7e.R.iget(1001)!=0|true))||(__CLR4_5_2qhqhlvicnc7e.R.iget(1002)==0&false))) {{
                __CLR4_5_2qhqhlvicnc7e.R.inc(1003);object = vf.createBNode(triple.getObject().getIRI().toString()
                        .substring(2));
            } }else {{
                __CLR4_5_2qhqhlvicnc7e.R.inc(1004);object = vf.createBNode(triple.getObject().getIRI().toString());
            }
        }}
        }}__CLR4_5_2qhqhlvicnc7e.R.inc(1005);if ((((contexts == null || contexts.length == 0)&&(__CLR4_5_2qhqhlvicnc7e.R.iget(1006)!=0|true))||(__CLR4_5_2qhqhlvicnc7e.R.iget(1007)==0&false))) {{
            __CLR4_5_2qhqhlvicnc7e.R.inc(1008);return Collections.singletonList(vf.createStatement(subject,
                    predicate, object));
        } }else {{
            __CLR4_5_2qhqhlvicnc7e.R.inc(1009);final ArrayList<Statement> results = new ArrayList<>(
                    contexts.length);
            __CLR4_5_2qhqhlvicnc7e.R.inc(1010);for (final Resource nextContext : contexts) {{
                __CLR4_5_2qhqhlvicnc7e.R.inc(1011);results.add(vf.createStatement(subject, predicate, object,
                        nextContext));
            }
            }__CLR4_5_2qhqhlvicnc7e.R.inc(1012);return results;
        }
    }}finally{__CLR4_5_2qhqhlvicnc7e.R.flushNeeded();}}
}
