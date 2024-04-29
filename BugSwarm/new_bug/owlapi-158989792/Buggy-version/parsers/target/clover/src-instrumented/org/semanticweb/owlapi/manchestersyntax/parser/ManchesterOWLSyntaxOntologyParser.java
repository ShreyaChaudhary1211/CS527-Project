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
package org.semanticweb.owlapi.manchestersyntax.parser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.OWLAPIConfigProvider;
import org.semanticweb.owlapi.formats.ManchesterSyntaxDocumentFormat;
import org.semanticweb.owlapi.formats.ManchesterSyntaxDocumentFormatFactory;
import org.semanticweb.owlapi.io.AbstractOWLParser;
import org.semanticweb.owlapi.io.OWLOntologyDocumentSource;
import org.semanticweb.owlapi.manchestersyntax.renderer.ParserException;
import org.semanticweb.owlapi.model.OWLDocumentFormat;
import org.semanticweb.owlapi.model.OWLDocumentFormatFactory;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration;
import org.semanticweb.owlapi.util.mansyntax.ManchesterOWLSyntaxParser;

/**
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.1.1
 */
public class ManchesterOWLSyntaxOntologyParser extends AbstractOWLParser {public static class __CLR4_5_2hqwhqwlvicmbkq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,23057,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 40000L;
    private static final String COMMENT_START_CHAR = "#";
    private static final String DEFAULT_FILE_ENCODING = "UTF-8";

    @Nonnull
    @Override
    public String getName() {try{__CLR4_5_2hqwhqwlvicmbkq.R.inc(23000);
        __CLR4_5_2hqwhqwlvicmbkq.R.inc(23001);return "ManchesterOWLSyntaxOntologyParser";
    }finally{__CLR4_5_2hqwhqwlvicmbkq.R.flushNeeded();}}

    @Override
    public OWLDocumentFormatFactory getSupportedFormat() {try{__CLR4_5_2hqwhqwlvicmbkq.R.inc(23002);
        __CLR4_5_2hqwhqwlvicmbkq.R.inc(23003);return new ManchesterSyntaxDocumentFormatFactory();
    }finally{__CLR4_5_2hqwhqwlvicmbkq.R.flushNeeded();}}

    @Override
    public OWLDocumentFormat parse(OWLOntologyDocumentSource documentSource,
            OWLOntology ontology, OWLOntologyLoaderConfiguration configuration)
            throws IOException {try{__CLR4_5_2hqwhqwlvicmbkq.R.inc(23004);
        __CLR4_5_2hqwhqwlvicmbkq.R.inc(23005);try {
            __CLR4_5_2hqwhqwlvicmbkq.R.inc(23006);BufferedReader br = null;
            __CLR4_5_2hqwhqwlvicmbkq.R.inc(23007);ManchesterSyntaxDocumentFormat format = new ManchesterSyntaxDocumentFormat();
            __CLR4_5_2hqwhqwlvicmbkq.R.inc(23008);try {
                __CLR4_5_2hqwhqwlvicmbkq.R.inc(23009);if ((((documentSource.isReaderAvailable())&&(__CLR4_5_2hqwhqwlvicmbkq.R.iget(23010)!=0|true))||(__CLR4_5_2hqwhqwlvicmbkq.R.iget(23011)==0&false))) {{
                    __CLR4_5_2hqwhqwlvicmbkq.R.inc(23012);br = new BufferedReader(documentSource.getReader());
                } }else {__CLR4_5_2hqwhqwlvicmbkq.R.inc(23013);if ((((documentSource.isInputStreamAvailable())&&(__CLR4_5_2hqwhqwlvicmbkq.R.iget(23014)!=0|true))||(__CLR4_5_2hqwhqwlvicmbkq.R.iget(23015)==0&false))) {{
                    __CLR4_5_2hqwhqwlvicmbkq.R.inc(23016);br = new BufferedReader(new InputStreamReader(
                            documentSource.getInputStream(),
                            DEFAULT_FILE_ENCODING));
                } }else {{
                    __CLR4_5_2hqwhqwlvicmbkq.R.inc(23017);br = new BufferedReader(new InputStreamReader(
                            getInputStream(documentSource.getDocumentIRI(),
                                    configuration), DEFAULT_FILE_ENCODING));
                }
                }}__CLR4_5_2hqwhqwlvicmbkq.R.inc(23018);StringBuilder sb = new StringBuilder();
                __CLR4_5_2hqwhqwlvicmbkq.R.inc(23019);String line;
                __CLR4_5_2hqwhqwlvicmbkq.R.inc(23020);int lineCount = 1;
                // Try to find the "magic number" (Prefix: or Ontology:)
                __CLR4_5_2hqwhqwlvicmbkq.R.inc(23021);boolean foundMagicNumber = false;
                __CLR4_5_2hqwhqwlvicmbkq.R.inc(23022);while ((line = br.readLine()) != null) {{
                    __CLR4_5_2hqwhqwlvicmbkq.R.inc(23025);sb.append(line);
                    __CLR4_5_2hqwhqwlvicmbkq.R.inc(23026);sb.append('\n');
                    __CLR4_5_2hqwhqwlvicmbkq.R.inc(23027);if ((((!foundMagicNumber)&&(__CLR4_5_2hqwhqwlvicmbkq.R.iget(23028)!=0|true))||(__CLR4_5_2hqwhqwlvicmbkq.R.iget(23029)==0&false))) {{
                        __CLR4_5_2hqwhqwlvicmbkq.R.inc(23030);String trimmedLine = line.trim();
                        __CLR4_5_2hqwhqwlvicmbkq.R.inc(23031);if ((((!trimmedLine.isEmpty()
                                && !trimmedLine.startsWith(COMMENT_START_CHAR))&&(__CLR4_5_2hqwhqwlvicmbkq.R.iget(23032)!=0|true))||(__CLR4_5_2hqwhqwlvicmbkq.R.iget(23033)==0&false))) {{
                            // Non-empty line, that is not a comment. The
                            // trimmed line MUST start with our magic
                            // number if we are going to parse the rest of
                            // it.
                            __CLR4_5_2hqwhqwlvicmbkq.R.inc(23034);if ((((startsWithMagicNumber(line))&&(__CLR4_5_2hqwhqwlvicmbkq.R.iget(23035)!=0|true))||(__CLR4_5_2hqwhqwlvicmbkq.R.iget(23036)==0&false))) {{
                                __CLR4_5_2hqwhqwlvicmbkq.R.inc(23037);foundMagicNumber = true;
                                // We have set the found flag - we never end
                                // up here again
                            } }else {{
                                // Non-empty line that is NOT a comment. We
                                // cannot possibly parse this.
                                __CLR4_5_2hqwhqwlvicmbkq.R.inc(23038);int startCol = line.indexOf(trimmedLine) + 1;
                                __CLR4_5_2hqwhqwlvicmbkq.R.inc(23039);String msg = String
                                        .format("Encountered '%s' at line %s column %s.  Expected either 'Ontology:' or 'Prefix:'",
                                                trimmedLine, lineCount,
                                                startCol);
                                __CLR4_5_2hqwhqwlvicmbkq.R.inc(23040);throw new ManchesterOWLSyntaxParserException(
                                        msg, lineCount, startCol);
                            }
                        }}
                    }}
                    }__CLR4_5_2hqwhqwlvicmbkq.R.inc(23041);lineCount++;
                }
                }__CLR4_5_2hqwhqwlvicmbkq.R.inc(23042);String s = sb.toString();
                assert (((s != null)&&(__CLR4_5_2hqwhqwlvicmbkq.R.iget(23043)!=0|true))||(__CLR4_5_2hqwhqwlvicmbkq.R.iget(23044)==0&false));
                __CLR4_5_2hqwhqwlvicmbkq.R.inc(23045);ManchesterOWLSyntaxParser parser = new ManchesterOWLSyntaxParserImpl(
                        new OWLAPIConfigProvider(), ontology
                                .getOWLOntologyManager().getOWLDataFactory());
                __CLR4_5_2hqwhqwlvicmbkq.R.inc(23046);parser.setOntologyLoaderConfiguration(configuration);
                __CLR4_5_2hqwhqwlvicmbkq.R.inc(23047);parser.setStringToParse(s);
                __CLR4_5_2hqwhqwlvicmbkq.R.inc(23048);format = parser.parseOntology(ontology);
            } finally {
                __CLR4_5_2hqwhqwlvicmbkq.R.inc(23049);if ((((br != null)&&(__CLR4_5_2hqwhqwlvicmbkq.R.iget(23050)!=0|true))||(__CLR4_5_2hqwhqwlvicmbkq.R.iget(23051)==0&false))) {{
                    __CLR4_5_2hqwhqwlvicmbkq.R.inc(23052);br.close();
                }
            }}
            __CLR4_5_2hqwhqwlvicmbkq.R.inc(23053);return format;
        } catch (ParserException e) {
            __CLR4_5_2hqwhqwlvicmbkq.R.inc(23054);throw new ManchesterOWLSyntaxParserException(e.getMessage(), e,
                    e.getLineNumber(), e.getColumnNumber());
        }
    }finally{__CLR4_5_2hqwhqwlvicmbkq.R.flushNeeded();}}

    private static boolean startsWithMagicNumber(String line) {try{__CLR4_5_2hqwhqwlvicmbkq.R.inc(23055);
        __CLR4_5_2hqwhqwlvicmbkq.R.inc(23056);return line.indexOf(ManchesterOWLSyntax.PREFIX.toString()) != -1
                || line.indexOf(ManchesterOWLSyntax.ONTOLOGY.toString()) != -1;
    }finally{__CLR4_5_2hqwhqwlvicmbkq.R.flushNeeded();}}
}
