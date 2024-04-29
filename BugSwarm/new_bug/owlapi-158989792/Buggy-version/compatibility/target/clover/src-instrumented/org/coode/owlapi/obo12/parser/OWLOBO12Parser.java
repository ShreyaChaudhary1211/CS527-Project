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

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.List;

import org.semanticweb.owlapi.io.AbstractOWLParser;
import org.semanticweb.owlapi.io.OWLOntologyDocumentSource;
import org.semanticweb.owlapi.io.OWLParserException;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLDocumentFormat;
import org.semanticweb.owlapi.model.OWLDocumentFormatFactory;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyAlreadyExistsException;
import org.semanticweb.owlapi.model.OWLOntologyChangeException;
import org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration;
import org.semanticweb.owlapi.model.UnloadableImportException;

/**
 * Author: Matthew Horridge<br>
 * The University Of Manchester<br>
 * Bio-Health Informatics Group<br>
 * Date: 10-Jan-2007<br>
 * <br>
 */
class OWLOBO12Parser extends AbstractOWLParser {public static class __CLR4_5_21zz1zzlvicnlh8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006d\u0070\u0061\u0074\u0069\u0062\u0069\u006c\u0069\u0074\u0079\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237345588L,8589935092L,2665,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 40000L;

    @SuppressWarnings("resource")
    @Override
    public OWLDocumentFormat parse(OWLOntologyDocumentSource documentSource,
            OWLOntology ontology, OWLOntologyLoaderConfiguration configuration)
            throws OWLParserException, IOException, OWLOntologyChangeException,
            UnloadableImportException {try{__CLR4_5_21zz1zzlvicnlh8.R.inc(2591);
        __CLR4_5_21zz1zzlvicnlh8.R.inc(2592);OBOParser parser;
        __CLR4_5_21zz1zzlvicnlh8.R.inc(2593);Reader reader = null;
        __CLR4_5_21zz1zzlvicnlh8.R.inc(2594);InputStream is = null;
        __CLR4_5_21zz1zzlvicnlh8.R.inc(2595);if ((((documentSource.isReaderAvailable())&&(__CLR4_5_21zz1zzlvicnlh8.R.iget(2596)!=0|true))||(__CLR4_5_21zz1zzlvicnlh8.R.iget(2597)==0&false))) {{
            __CLR4_5_21zz1zzlvicnlh8.R.inc(2598);reader = documentSource.getReader();
            __CLR4_5_21zz1zzlvicnlh8.R.inc(2599);parser = new OBOParser(reader);
        } }else {__CLR4_5_21zz1zzlvicnlh8.R.inc(2600);if ((((documentSource.isInputStreamAvailable())&&(__CLR4_5_21zz1zzlvicnlh8.R.iget(2601)!=0|true))||(__CLR4_5_21zz1zzlvicnlh8.R.iget(2602)==0&false))) {{
            __CLR4_5_21zz1zzlvicnlh8.R.inc(2603);is = documentSource.getInputStream();
            __CLR4_5_21zz1zzlvicnlh8.R.inc(2604);parser = new OBOParser(is);
        } }else {{
            __CLR4_5_21zz1zzlvicnlh8.R.inc(2605);is = getInputStream(documentSource.getDocumentIRI(), configuration);
            __CLR4_5_21zz1zzlvicnlh8.R.inc(2606);parser = new OBOParser(is);
        }
        }}__CLR4_5_21zz1zzlvicnlh8.R.inc(2607);RawFrameHandler rawFrameHandler = new RawFrameHandler();
        __CLR4_5_21zz1zzlvicnlh8.R.inc(2608);OBOConsumer oboConsumer = new OBOConsumer(ontology, configuration,
                documentSource.getDocumentIRI());
        __CLR4_5_21zz1zzlvicnlh8.R.inc(2609);parser.setHandler(rawFrameHandler);
        __CLR4_5_21zz1zzlvicnlh8.R.inc(2610);try {
            __CLR4_5_21zz1zzlvicnlh8.R.inc(2611);parser.parse();
            __CLR4_5_21zz1zzlvicnlh8.R.inc(2612);parseFrames(rawFrameHandler, oboConsumer);
        } catch (ParseException e) {
            __CLR4_5_21zz1zzlvicnlh8.R.inc(2613);if ((((e.getCause() != null
                    && e.getCause() instanceof OWLOntologyChangeException)&&(__CLR4_5_21zz1zzlvicnlh8.R.iget(2614)!=0|true))||(__CLR4_5_21zz1zzlvicnlh8.R.iget(2615)==0&false))) {{
                __CLR4_5_21zz1zzlvicnlh8.R.inc(2616);throw (OWLOntologyChangeException) e.getCause();
            }
            }__CLR4_5_21zz1zzlvicnlh8.R.inc(2617);if ((((e.getCause() != null
                    && e.getCause() instanceof OWLOntologyAlreadyExistsException)&&(__CLR4_5_21zz1zzlvicnlh8.R.iget(2618)!=0|true))||(__CLR4_5_21zz1zzlvicnlh8.R.iget(2619)==0&false))) {{
                __CLR4_5_21zz1zzlvicnlh8.R.inc(2620);OWLOntologyAlreadyExistsException ex = (OWLOntologyAlreadyExistsException) e
                        .getCause();
                __CLR4_5_21zz1zzlvicnlh8.R.inc(2621);IRI importedOntologyIRI = ex.getOntologyID().getOntologyIRI()
                        .get();
                assert (((importedOntologyIRI != null)&&(__CLR4_5_21zz1zzlvicnlh8.R.iget(2622)!=0|true))||(__CLR4_5_21zz1zzlvicnlh8.R.iget(2623)==0&false));
                __CLR4_5_21zz1zzlvicnlh8.R.inc(2624);throw new UnloadableImportException(ex, ontology
                        .getOWLOntologyManager().getOWLDataFactory()
                        .getOWLImportsDeclaration(importedOntologyIRI));
            }
            }__CLR4_5_21zz1zzlvicnlh8.R.inc(2625);Token currentToken = e.currentToken;
            __CLR4_5_21zz1zzlvicnlh8.R.inc(2626);if ((((currentToken != null)&&(__CLR4_5_21zz1zzlvicnlh8.R.iget(2627)!=0|true))||(__CLR4_5_21zz1zzlvicnlh8.R.iget(2628)==0&false))) {{
                __CLR4_5_21zz1zzlvicnlh8.R.inc(2629);int beginLine = currentToken.beginLine;
                __CLR4_5_21zz1zzlvicnlh8.R.inc(2630);int beginColumn = currentToken.beginColumn;
                __CLR4_5_21zz1zzlvicnlh8.R.inc(2631);throw new OWLParserException(e, beginLine, beginColumn);
            } }else {{
                __CLR4_5_21zz1zzlvicnlh8.R.inc(2632);throw new OWLParserException(e);
            }
        }} catch (TokenMgrError e) {
            __CLR4_5_21zz1zzlvicnlh8.R.inc(2633);throw new OWLParserException(e);
        } finally {
            __CLR4_5_21zz1zzlvicnlh8.R.inc(2634);if ((((is != null)&&(__CLR4_5_21zz1zzlvicnlh8.R.iget(2635)!=0|true))||(__CLR4_5_21zz1zzlvicnlh8.R.iget(2636)==0&false))) {{
                __CLR4_5_21zz1zzlvicnlh8.R.inc(2637);is.close();
            } }else {__CLR4_5_21zz1zzlvicnlh8.R.inc(2638);if ((((reader != null)&&(__CLR4_5_21zz1zzlvicnlh8.R.iget(2639)!=0|true))||(__CLR4_5_21zz1zzlvicnlh8.R.iget(2640)==0&false))) {{
                __CLR4_5_21zz1zzlvicnlh8.R.inc(2641);reader.close();
            }
        }}}
        __CLR4_5_21zz1zzlvicnlh8.R.inc(2642);OBO12DocumentFormat format = new OBO12DocumentFormat();
        __CLR4_5_21zz1zzlvicnlh8.R.inc(2643);format.setIDSpaceManager(oboConsumer.getIdSpaceManager());
        __CLR4_5_21zz1zzlvicnlh8.R.inc(2644);return format;
    }finally{__CLR4_5_21zz1zzlvicnlh8.R.flushNeeded();}}

    private static void parseFrames(RawFrameHandler rawFrameHandler,
            OBOConsumer oboConsumer) {try{__CLR4_5_21zz1zzlvicnlh8.R.inc(2645);
        __CLR4_5_21zz1zzlvicnlh8.R.inc(2646);parseHeaderFrame(rawFrameHandler, oboConsumer);
        __CLR4_5_21zz1zzlvicnlh8.R.inc(2647);parseFrames(oboConsumer, rawFrameHandler.getTypeDefFrames());
        __CLR4_5_21zz1zzlvicnlh8.R.inc(2648);parseFrames(oboConsumer, rawFrameHandler.getNonTypeDefFrames());
    }finally{__CLR4_5_21zz1zzlvicnlh8.R.flushNeeded();}}

    private static void parseHeaderFrame(RawFrameHandler rawFrameHandler,
            OBOConsumer consumer) {try{__CLR4_5_21zz1zzlvicnlh8.R.inc(2649);
        __CLR4_5_21zz1zzlvicnlh8.R.inc(2650);consumer.startHeader();
        __CLR4_5_21zz1zzlvicnlh8.R.inc(2651);parseFrameTagValuePairs(consumer, rawFrameHandler.getHeaderFrame());
        __CLR4_5_21zz1zzlvicnlh8.R.inc(2652);consumer.endHeader();
    }finally{__CLR4_5_21zz1zzlvicnlh8.R.flushNeeded();}}

    private static void parseFrames(OBOConsumer oboConsumer,
            List<OBOFrame> frames) {try{__CLR4_5_21zz1zzlvicnlh8.R.inc(2653);
        __CLR4_5_21zz1zzlvicnlh8.R.inc(2654);for (OBOFrame frame : frames) {{
            __CLR4_5_21zz1zzlvicnlh8.R.inc(2655);parseFrame(oboConsumer, frame);
        }
    }}finally{__CLR4_5_21zz1zzlvicnlh8.R.flushNeeded();}}

    private static void parseFrame(OBOConsumer oboConsumer, OBOFrame frame) {try{__CLR4_5_21zz1zzlvicnlh8.R.inc(2656);
        __CLR4_5_21zz1zzlvicnlh8.R.inc(2657);oboConsumer.startFrame(frame.getFrameType());
        __CLR4_5_21zz1zzlvicnlh8.R.inc(2658);parseFrameTagValuePairs(oboConsumer, frame);
        __CLR4_5_21zz1zzlvicnlh8.R.inc(2659);oboConsumer.endFrame();
    }finally{__CLR4_5_21zz1zzlvicnlh8.R.flushNeeded();}}

    private static void parseFrameTagValuePairs(OBOConsumer oboConsumer,
            OBOFrame frame) {try{__CLR4_5_21zz1zzlvicnlh8.R.inc(2660);
        __CLR4_5_21zz1zzlvicnlh8.R.inc(2661);for (OBOTagValuePair tagValuePair : frame.getTagValuePairs()) {{
            __CLR4_5_21zz1zzlvicnlh8.R.inc(2662);oboConsumer.handleTagValue(tagValuePair.getTagName(),
                    tagValuePair.getValue(), tagValuePair.getQualifier(),
                    tagValuePair.getComment());
        }
    }}finally{__CLR4_5_21zz1zzlvicnlh8.R.flushNeeded();}}

    @Override
    public OWLDocumentFormatFactory getSupportedFormat() {try{__CLR4_5_21zz1zzlvicnlh8.R.inc(2663);
        __CLR4_5_21zz1zzlvicnlh8.R.inc(2664);return new OBO12DocumentFormatFactory();
    }finally{__CLR4_5_21zz1zzlvicnlh8.R.flushNeeded();}}
}
