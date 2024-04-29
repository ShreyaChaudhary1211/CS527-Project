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
package org.semanticweb.owlapi.io;

import java.util.Collections;
import java.util.Map;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration;

/**
 * A class that describes how ontology parsing failed. This class collects parse
 * errors and the parsers that generated the errors.
 * 
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.2.0
 */
public class UnparsableOntologyException extends OWLOntologyCreationException {public static class __CLR4_5_21a41a4lvicklat{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0061\u0070\u0069\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237201267L,8589935092L,1715,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 40000L;
    private boolean includeStackTraceInMessage = true;
    private final IRI documentIRI;
    private final Map<OWLParser, OWLParserException> exceptions;

    /**
     * @param documentIRI
     *        the document IRI
     * @param exceptions
     *        the map parser-&gt;exceptions
     * @param config
     *        the configuration object
     */
    public UnparsableOntologyException(@Nonnull IRI documentIRI,
            Map<OWLParser, OWLParserException> exceptions,
            OWLOntologyLoaderConfiguration config) {
        super("Could not parse ontology from document IRI: "
                + documentIRI.toQuotedString());__CLR4_5_21a41a4lvicklat.R.inc(1661);try{__CLR4_5_21a41a4lvicklat.R.inc(1660);
        __CLR4_5_21a41a4lvicklat.R.inc(1662);includeStackTraceInMessage = config.isReportStackTrace();
        __CLR4_5_21a41a4lvicklat.R.inc(1663);this.documentIRI = documentIRI;
        __CLR4_5_21a41a4lvicklat.R.inc(1664);this.exceptions = exceptions;
    }finally{__CLR4_5_21a41a4lvicklat.R.flushNeeded();}}

    @Override
    public String getMessage() {try{__CLR4_5_21a41a4lvicklat.R.inc(1665);
        __CLR4_5_21a41a4lvicklat.R.inc(1666);StringBuilder msg = new StringBuilder();
        __CLR4_5_21a41a4lvicklat.R.inc(1667);msg.append("Problem parsing ");
        __CLR4_5_21a41a4lvicklat.R.inc(1668);msg.append(documentIRI);
        __CLR4_5_21a41a4lvicklat.R.inc(1669);msg.append("\nCould not parse ontology.  Either a suitable parser could not be found, or parsing failed.  See parser logs below for explanation.\nThe following parsers were tried:\n");
        __CLR4_5_21a41a4lvicklat.R.inc(1670);int counter = 1;
        __CLR4_5_21a41a4lvicklat.R.inc(1671);for (OWLParser parser : exceptions.keySet()) {{
            __CLR4_5_21a41a4lvicklat.R.inc(1672);msg.append(counter);
            __CLR4_5_21a41a4lvicklat.R.inc(1673);msg.append(") ");
            __CLR4_5_21a41a4lvicklat.R.inc(1674);msg.append(parser.toString());
            __CLR4_5_21a41a4lvicklat.R.inc(1675);msg.append('\n');
            __CLR4_5_21a41a4lvicklat.R.inc(1676);counter++;
        }
        }__CLR4_5_21a41a4lvicklat.R.inc(1677);msg.append("\n\nDetailed logs:\n");
        __CLR4_5_21a41a4lvicklat.R.inc(1678);for (Map.Entry<OWLParser, OWLParserException> nextException : exceptions
                .entrySet()) {{
            __CLR4_5_21a41a4lvicklat.R.inc(1679);Throwable exception = nextException.getValue();
            __CLR4_5_21a41a4lvicklat.R.inc(1680);msg.append("--------------------------------------------------------------------------------\n");
            __CLR4_5_21a41a4lvicklat.R.inc(1681);msg.append("Parser: ");
            __CLR4_5_21a41a4lvicklat.R.inc(1682);msg.append(nextException.getKey().toString());
            __CLR4_5_21a41a4lvicklat.R.inc(1683);msg.append('\n');
            __CLR4_5_21a41a4lvicklat.R.inc(1684);if ((((!includeStackTraceInMessage)&&(__CLR4_5_21a41a4lvicklat.R.iget(1685)!=0|true))||(__CLR4_5_21a41a4lvicklat.R.iget(1686)==0&false))) {{
                __CLR4_5_21a41a4lvicklat.R.inc(1687);msg.append(exception.getMessage());
                __CLR4_5_21a41a4lvicklat.R.inc(1688);msg.append("\n\n");
            } }else {{
                __CLR4_5_21a41a4lvicklat.R.inc(1689);msg.append("    Stack trace:\n");
                __CLR4_5_21a41a4lvicklat.R.inc(1690);Throwable current = exception;
                // print up to five nested causes
                __CLR4_5_21a41a4lvicklat.R.inc(1691);boolean moreStackTraces = true;
                __CLR4_5_21a41a4lvicklat.R.inc(1692);for (int i = 0; (((i < 5 && moreStackTraces)&&(__CLR4_5_21a41a4lvicklat.R.iget(1693)!=0|true))||(__CLR4_5_21a41a4lvicklat.R.iget(1694)==0&false)); i++) {{
                    __CLR4_5_21a41a4lvicklat.R.inc(1695);msg.append(current.getMessage());
                    __CLR4_5_21a41a4lvicklat.R.inc(1696);StackTraceElement[] stackTrace = current.getStackTrace();
                    __CLR4_5_21a41a4lvicklat.R.inc(1697);for (int stackDepth = 0; (((stackDepth < 10
                            && stackDepth < stackTrace.length)&&(__CLR4_5_21a41a4lvicklat.R.iget(1698)!=0|true))||(__CLR4_5_21a41a4lvicklat.R.iget(1699)==0&false)); stackDepth++) {{
                        __CLR4_5_21a41a4lvicklat.R.inc(1700);StackTraceElement element = stackTrace[stackDepth];
                        __CLR4_5_21a41a4lvicklat.R.inc(1701);msg.append("        ");
                        __CLR4_5_21a41a4lvicklat.R.inc(1702);msg.append(element);
                        __CLR4_5_21a41a4lvicklat.R.inc(1703);msg.append('\n');
                    }
                    }__CLR4_5_21a41a4lvicklat.R.inc(1704);if ((((current.getCause() != null
                            && current.getCause() != current)&&(__CLR4_5_21a41a4lvicklat.R.iget(1705)!=0|true))||(__CLR4_5_21a41a4lvicklat.R.iget(1706)==0&false))) {{
                        __CLR4_5_21a41a4lvicklat.R.inc(1707);current = current.getCause();
                    } }else {{
                        __CLR4_5_21a41a4lvicklat.R.inc(1708);moreStackTraces = false;
                    }
                }}
                }__CLR4_5_21a41a4lvicklat.R.inc(1709);msg.append("\n\n");
            }
        }}
        }__CLR4_5_21a41a4lvicklat.R.inc(1710);return msg.toString();
    }finally{__CLR4_5_21a41a4lvicklat.R.flushNeeded();}}

    /**
     * Gets the ontology document IRI from which there was an attempt to parse
     * an ontology.
     * 
     * @return The ontology document IRI
     */
    public IRI getDocumentIRI() {try{__CLR4_5_21a41a4lvicklat.R.inc(1711);
        __CLR4_5_21a41a4lvicklat.R.inc(1712);return documentIRI;
    }finally{__CLR4_5_21a41a4lvicklat.R.flushNeeded();}}

    /**
     * Gets a map that lists the parsers (that were used to parse an ontology)
     * and the errors that they generated.
     * 
     * @return The map of parsers and their errors.
     */
    public Map<OWLParser, OWLParserException> getExceptions() {try{__CLR4_5_21a41a4lvicklat.R.inc(1713);
        __CLR4_5_21a41a4lvicklat.R.inc(1714);return Collections.unmodifiableMap(exceptions);
    }finally{__CLR4_5_21a41a4lvicklat.R.flushNeeded();}}
}
