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
package org.semanticweb.owlapi.rdf.turtle.parser;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.formats.TurtleDocumentFormat;
import org.semanticweb.owlapi.formats.TurtleDocumentFormatFactory;
import org.semanticweb.owlapi.io.AbstractOWLParser;
import org.semanticweb.owlapi.io.OWLOntologyDocumentSource;
import org.semanticweb.owlapi.model.OWLDocumentFormat;
import org.semanticweb.owlapi.model.OWLDocumentFormatFactory;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration;
import org.semanticweb.owlapi.model.PrefixManager;

/**
 * The Class TurtleOntologyParser.
 * 
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.2.0
 */
public class TurtleOntologyParser extends AbstractOWLParser {public static class __CLR4_5_2sk0sk0lvicmdde{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,37049,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 40000L;

    @Nonnull
    @Override
    public String getName() {try{__CLR4_5_2sk0sk0lvicmdde.R.inc(37008);
        __CLR4_5_2sk0sk0lvicmdde.R.inc(37009);return "TurtleOntologyParser";
    }finally{__CLR4_5_2sk0sk0lvicmdde.R.flushNeeded();}}

    @Override
    public OWLDocumentFormatFactory getSupportedFormat() {try{__CLR4_5_2sk0sk0lvicmdde.R.inc(37010);
        __CLR4_5_2sk0sk0lvicmdde.R.inc(37011);return new TurtleDocumentFormatFactory();
    }finally{__CLR4_5_2sk0sk0lvicmdde.R.flushNeeded();}}

    @SuppressWarnings("null")
    @Override
    public OWLDocumentFormat parse(OWLOntologyDocumentSource documentSource,
            OWLOntology ontology, OWLOntologyLoaderConfiguration configuration)
            throws IOException {try{__CLR4_5_2sk0sk0lvicmdde.R.inc(37012);
        __CLR4_5_2sk0sk0lvicmdde.R.inc(37013);Reader reader = null;
        __CLR4_5_2sk0sk0lvicmdde.R.inc(37014);InputStream is = null;
        __CLR4_5_2sk0sk0lvicmdde.R.inc(37015);try {
            __CLR4_5_2sk0sk0lvicmdde.R.inc(37016);TurtleParser parser;
            __CLR4_5_2sk0sk0lvicmdde.R.inc(37017);if ((((documentSource.isReaderAvailable())&&(__CLR4_5_2sk0sk0lvicmdde.R.iget(37018)!=0|true))||(__CLR4_5_2sk0sk0lvicmdde.R.iget(37019)==0&false))) {{
                __CLR4_5_2sk0sk0lvicmdde.R.inc(37020);reader = documentSource.getReader();
                __CLR4_5_2sk0sk0lvicmdde.R.inc(37021);parser = new TurtleParser(reader, new ConsoleTripleHandler(),
                        documentSource.getDocumentIRI());
            } }else {__CLR4_5_2sk0sk0lvicmdde.R.inc(37022);if ((((documentSource.isInputStreamAvailable())&&(__CLR4_5_2sk0sk0lvicmdde.R.iget(37023)!=0|true))||(__CLR4_5_2sk0sk0lvicmdde.R.iget(37024)==0&false))) {{
                __CLR4_5_2sk0sk0lvicmdde.R.inc(37025);is = documentSource.getInputStream();
                __CLR4_5_2sk0sk0lvicmdde.R.inc(37026);parser = new TurtleParser(is, new ConsoleTripleHandler(),
                        documentSource.getDocumentIRI());
            } }else {{
                __CLR4_5_2sk0sk0lvicmdde.R.inc(37027);is = getInputStream(documentSource.getDocumentIRI(),
                        configuration);
                __CLR4_5_2sk0sk0lvicmdde.R.inc(37028);parser = new TurtleParser(is, new ConsoleTripleHandler(),
                        documentSource.getDocumentIRI());
            }
            }}__CLR4_5_2sk0sk0lvicmdde.R.inc(37029);OWLRDFConsumerAdapter consumer = new OWLRDFConsumerAdapter(
                    ontology, configuration);
            __CLR4_5_2sk0sk0lvicmdde.R.inc(37030);TurtleDocumentFormat format = new TurtleDocumentFormat();
            __CLR4_5_2sk0sk0lvicmdde.R.inc(37031);consumer.setOntologyFormat(format);
            __CLR4_5_2sk0sk0lvicmdde.R.inc(37032);consumer.startModel(documentSource.getDocumentIRI());
            __CLR4_5_2sk0sk0lvicmdde.R.inc(37033);parser.setTripleHandler(consumer);
            __CLR4_5_2sk0sk0lvicmdde.R.inc(37034);parser.parseDocument();
            __CLR4_5_2sk0sk0lvicmdde.R.inc(37035);PrefixManager prefixManager = parser.getPrefixManager();
            __CLR4_5_2sk0sk0lvicmdde.R.inc(37036);for (String prefixName : prefixManager.getPrefixNames()) {{
                __CLR4_5_2sk0sk0lvicmdde.R.inc(37037);format.setPrefix(prefixName,
                        prefixManager.getPrefix(prefixName));
            }
            }__CLR4_5_2sk0sk0lvicmdde.R.inc(37038);return format;
        } catch (ParseException e) {
            __CLR4_5_2sk0sk0lvicmdde.R.inc(37039);throw new TurtleParserException(e);
        } catch (IOException e) {
            __CLR4_5_2sk0sk0lvicmdde.R.inc(37040);throw new TurtleParserException(e);
        } finally {
            __CLR4_5_2sk0sk0lvicmdde.R.inc(37041);if ((((is != null)&&(__CLR4_5_2sk0sk0lvicmdde.R.iget(37042)!=0|true))||(__CLR4_5_2sk0sk0lvicmdde.R.iget(37043)==0&false))) {{
                __CLR4_5_2sk0sk0lvicmdde.R.inc(37044);is.close();
            }
            }__CLR4_5_2sk0sk0lvicmdde.R.inc(37045);if ((((reader != null)&&(__CLR4_5_2sk0sk0lvicmdde.R.iget(37046)!=0|true))||(__CLR4_5_2sk0sk0lvicmdde.R.iget(37047)==0&false))) {{
                __CLR4_5_2sk0sk0lvicmdde.R.inc(37048);reader.close();
            }
        }}
    }finally{__CLR4_5_2sk0sk0lvicmdde.R.flushNeeded();}}
}
