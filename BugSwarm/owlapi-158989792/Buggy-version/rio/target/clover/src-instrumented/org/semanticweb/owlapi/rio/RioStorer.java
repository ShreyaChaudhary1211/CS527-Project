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
package org.semanticweb.owlapi.rio;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.openrdf.OpenRDFUtil;
import org.openrdf.model.Resource;
import org.openrdf.rio.RDFFormat;
import org.openrdf.rio.RDFHandler;
import org.openrdf.rio.RDFWriter;
import org.openrdf.rio.Rio;
import org.openrdf.rio.UnsupportedRDFormatException;
import org.openrdf.rio.helpers.StatementCollector;
import org.semanticweb.owlapi.formats.RioRDFDocumentFormat;
import org.semanticweb.owlapi.formats.RioRDFDocumentFormatFactory;
import org.semanticweb.owlapi.model.OWLDocumentFormat;
import org.semanticweb.owlapi.model.OWLDocumentFormatFactory;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyStorageException;
import org.semanticweb.owlapi.model.OWLStorer;
import org.semanticweb.owlapi.util.AbstractOWLStorer;

/**
 * An implementation of {@link OWLStorer} that writes statements to Sesame
 * {@link RDFHandler}s, including {@link RDFWriter} implementations based on the
 * given {@link RioRDFDocumentFormatFactory}.
 * 
 * @author Peter Ansell p_ansell@yahoo.com
 * @since 4.0.0
 */
public class RioStorer extends AbstractOWLStorer {public static class __CLR4_5_2lklklvicnc6h{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0072\u0069\u006f\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237333555L,8589935092L,844,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 40000L;
    private transient RDFHandler rioHandler;
    private final OWLDocumentFormatFactory ontFormat;
    private final Resource[] contexts;

    /**
     * @param ontologyFormat
     *        format
     * @param rioHandler
     *        rdf handler
     * @param contexts
     *        contexts
     */
    public RioStorer(OWLDocumentFormatFactory ontologyFormat,
            RDFHandler rioHandler, Resource... contexts) {
        this(ontologyFormat, contexts);__CLR4_5_2lklklvicnc6h.R.inc(777);try{__CLR4_5_2lklklvicnc6h.R.inc(776);
        __CLR4_5_2lklklvicnc6h.R.inc(778);this.rioHandler = rioHandler;
    }finally{__CLR4_5_2lklklvicnc6h.R.flushNeeded();}}

    /**
     * @param ontologyFormat
     *        format
     * @param contexts
     *        contexts
     */
    public RioStorer(OWLDocumentFormatFactory ontologyFormat,
            Resource... contexts) {try{__CLR4_5_2lklklvicnc6h.R.inc(779);
        __CLR4_5_2lklklvicnc6h.R.inc(780);OpenRDFUtil.verifyContextNotNull(contexts);
        __CLR4_5_2lklklvicnc6h.R.inc(781);ontFormat = ontologyFormat;
        __CLR4_5_2lklklvicnc6h.R.inc(782);this.contexts = contexts;
    }finally{__CLR4_5_2lklklvicnc6h.R.flushNeeded();}}

    @Override
    public boolean canStoreOntology(OWLDocumentFormat ontologyFormat) {try{__CLR4_5_2lklklvicnc6h.R.inc(783);
        __CLR4_5_2lklklvicnc6h.R.inc(784);return ontFormat.createFormat().equals(ontologyFormat);
    }finally{__CLR4_5_2lklklvicnc6h.R.flushNeeded();}}

    /**
     * If the {@link RDFFormat} is null, then it is acceptable to return an in
     * memory {@link StatementCollector}. This method will only be called from
     * storeOntology if {@link #setRioHandler(RDFHandler)} is not called with a
     * non-null argument.
     * 
     * @param format
     *        The {@link RDFFormat} for the resulting {@link RDFHandler}, if the
     *        writer parameter is not null.
     * @param writer
     *        The {@link Writer} for the resulting RDFHandler, or null to create
     *        an in-memory collection.
     * @return An implementation of the {@link RDFHandler} interface, based on
     *         the parameters given to this method.
     * @throws OWLOntologyStorageException
     *         If the format does not have an {@link RDFWriter} implementation
     *         available on the classpath.
     */
    protected RDFHandler getRDFHandlerForWriter(@Nullable RDFFormat format,
            Writer writer) throws OWLOntologyStorageException {try{__CLR4_5_2lklklvicnc6h.R.inc(785);
        // by default return a StatementCollector if they did not specify a
        // format
        __CLR4_5_2lklklvicnc6h.R.inc(786);if ((((format == null)&&(__CLR4_5_2lklklvicnc6h.R.iget(787)!=0|true))||(__CLR4_5_2lklklvicnc6h.R.iget(788)==0&false))) {{
            __CLR4_5_2lklklvicnc6h.R.inc(789);return new StatementCollector();
        } }else {{
            __CLR4_5_2lklklvicnc6h.R.inc(790);try {
                __CLR4_5_2lklklvicnc6h.R.inc(791);return Rio.createWriter(format, writer);
            } catch (final UnsupportedRDFormatException e) {
                __CLR4_5_2lklklvicnc6h.R.inc(792);throw new OWLOntologyStorageException(e);
            }
        }
    }}finally{__CLR4_5_2lklklvicnc6h.R.flushNeeded();}}

    /**
     * If the {@link RDFFormat} is null, then it is acceptable to return an in
     * memory {@link StatementCollector}. This method will only be called from
     * storeOntology if {@link #setRioHandler(RDFHandler)} is not called with a
     * non-null argument.
     * 
     * @param format
     *        The {@link RDFFormat} for the resulting {@link RDFHandler}, if the
     *        writer parameter is not null.
     * @param outputStream
     *        The {@link OutputStream} for the resulting RDFHandler, or null to
     *        create an in-memory collection.
     * @return An implementation of the {@link RDFHandler} interface, based on
     *         the parameters given to this method.
     * @throws OWLOntologyStorageException
     *         If the format does not have an {@link RDFWriter} implementation
     *         available on the classpath.
     */
    protected static RDFHandler getRDFHandlerForOutputStream(
            final RDFFormat format, final OutputStream outputStream)
            throws OWLOntologyStorageException {try{__CLR4_5_2lklklvicnc6h.R.inc(793);
        // by default return a StatementCollector if they did not specify a
        // format
        __CLR4_5_2lklklvicnc6h.R.inc(794);if ((((format == null)&&(__CLR4_5_2lklklvicnc6h.R.iget(795)!=0|true))||(__CLR4_5_2lklklvicnc6h.R.iget(796)==0&false))) {{
            __CLR4_5_2lklklvicnc6h.R.inc(797);return new StatementCollector();
        } }else {{
            __CLR4_5_2lklklvicnc6h.R.inc(798);try {
                __CLR4_5_2lklklvicnc6h.R.inc(799);return Rio.createWriter(format, outputStream);
            } catch (final UnsupportedRDFormatException e) {
                __CLR4_5_2lklklvicnc6h.R.inc(800);throw new OWLOntologyStorageException(e);
            }
        }
    }}finally{__CLR4_5_2lklklvicnc6h.R.flushNeeded();}}

    /**
     * @return the rioHandler
     */
    public RDFHandler getRioHandler() {try{__CLR4_5_2lklklvicnc6h.R.inc(801);
        __CLR4_5_2lklklvicnc6h.R.inc(802);return rioHandler;
    }finally{__CLR4_5_2lklklvicnc6h.R.flushNeeded();}}

    /**
     * @param rioHandler
     *        the rioHandler to set
     */
    public void setRioHandler(final RDFHandler rioHandler) {try{__CLR4_5_2lklklvicnc6h.R.inc(803);
        __CLR4_5_2lklklvicnc6h.R.inc(804);this.rioHandler = rioHandler;
    }finally{__CLR4_5_2lklklvicnc6h.R.flushNeeded();}}

    @Override
    protected void storeOntology(@Nonnull OWLOntology ontology, Writer writer,
            OWLDocumentFormat format) throws OWLOntologyStorageException {try{__CLR4_5_2lklklvicnc6h.R.inc(805);
        // This check is performed to allow any Rio RDFHandler to be used to
        // render the output, even if it does not render to a writer. For
        // example, it could store the triples in memory without serialising
        // them to any particular format.
        __CLR4_5_2lklklvicnc6h.R.inc(806);if ((((rioHandler == null)&&(__CLR4_5_2lklklvicnc6h.R.iget(807)!=0|true))||(__CLR4_5_2lklklvicnc6h.R.iget(808)==0&false))) {{
            __CLR4_5_2lklklvicnc6h.R.inc(809);if ((((!(format instanceof RioRDFDocumentFormat))&&(__CLR4_5_2lklklvicnc6h.R.iget(810)!=0|true))||(__CLR4_5_2lklklvicnc6h.R.iget(811)==0&false))) {{
                __CLR4_5_2lklklvicnc6h.R.inc(812);throw new OWLOntologyStorageException(
                        "Unable to use RioOntologyStorer to store this format as it is not recognised as a RioRDFOntologyFormat: "
                                + format);
            }
            }__CLR4_5_2lklklvicnc6h.R.inc(813);final RioRDFDocumentFormat rioFormat = (RioRDFDocumentFormat) format;
            __CLR4_5_2lklklvicnc6h.R.inc(814);if ((((format.isTextual())&&(__CLR4_5_2lklklvicnc6h.R.iget(815)!=0|true))||(__CLR4_5_2lklklvicnc6h.R.iget(816)==0&false))) {{
                __CLR4_5_2lklklvicnc6h.R.inc(817);rioHandler = getRDFHandlerForWriter(rioFormat.getRioFormat(),
                        writer);
            } }else {{
                __CLR4_5_2lklklvicnc6h.R.inc(818);throw new OWLOntologyStorageException(
                        "Unable to use storeOntology with a Writer as the desired format is not textual. Format was "
                                + format);
            }
        }}
        }__CLR4_5_2lklklvicnc6h.R.inc(819);try {
            __CLR4_5_2lklklvicnc6h.R.inc(820);final RioRenderer ren = new RioRenderer(ontology, rioHandler,
                    format, contexts);
            __CLR4_5_2lklklvicnc6h.R.inc(821);ren.render();
        } catch (final IOException e) {
            __CLR4_5_2lklklvicnc6h.R.inc(822);throw new OWLOntologyStorageException(e);
        }
    }finally{__CLR4_5_2lklklvicnc6h.R.flushNeeded();}}

    @Override
    protected void storeOntology(@Nonnull OWLOntology ontology,
            OutputStream outputStream, OWLDocumentFormat format)
            throws OWLOntologyStorageException {try{__CLR4_5_2lklklvicnc6h.R.inc(823);
        // This check is performed to allow any Rio RDFHandler to be used to
        // render the output, even if it does not render to a writer. For
        // example, it could store the triples in memory without serialising
        // them to any particular format.
        __CLR4_5_2lklklvicnc6h.R.inc(824);if ((((rioHandler == null)&&(__CLR4_5_2lklklvicnc6h.R.iget(825)!=0|true))||(__CLR4_5_2lklklvicnc6h.R.iget(826)==0&false))) {{
            __CLR4_5_2lklklvicnc6h.R.inc(827);if ((((!(format instanceof RioRDFDocumentFormat))&&(__CLR4_5_2lklklvicnc6h.R.iget(828)!=0|true))||(__CLR4_5_2lklklvicnc6h.R.iget(829)==0&false))) {{
                __CLR4_5_2lklklvicnc6h.R.inc(830);throw new OWLOntologyStorageException(
                        "Unable to use RioOntologyStorer to store this format as it is not recognised as a RioRDFOntologyFormat: "
                                + format);
            }
            }__CLR4_5_2lklklvicnc6h.R.inc(831);final RioRDFDocumentFormat rioFormat = (RioRDFDocumentFormat) format;
            __CLR4_5_2lklklvicnc6h.R.inc(832);if ((((format.isTextual())&&(__CLR4_5_2lklklvicnc6h.R.iget(833)!=0|true))||(__CLR4_5_2lklklvicnc6h.R.iget(834)==0&false))) {{
                __CLR4_5_2lklklvicnc6h.R.inc(835);try {
                    __CLR4_5_2lklklvicnc6h.R.inc(836);Writer writer = new BufferedWriter(new OutputStreamWriter(
                            outputStream, UTF_8));
                    __CLR4_5_2lklklvicnc6h.R.inc(837);rioHandler = getRDFHandlerForWriter(
                            rioFormat.getRioFormat(), writer);
                } catch (IOException e) {
                    __CLR4_5_2lklklvicnc6h.R.inc(838);throw new OWLOntologyStorageException(e);
                }
            } }else {{
                __CLR4_5_2lklklvicnc6h.R.inc(839);rioHandler = getRDFHandlerForOutputStream(
                        rioFormat.getRioFormat(), outputStream);
            }
        }}
        }__CLR4_5_2lklklvicnc6h.R.inc(840);try {
            __CLR4_5_2lklklvicnc6h.R.inc(841);final RioRenderer ren = new RioRenderer(ontology, rioHandler,
                    format, contexts);
            __CLR4_5_2lklklvicnc6h.R.inc(842);ren.render();
        } catch (final IOException e) {
            __CLR4_5_2lklklvicnc6h.R.inc(843);throw new OWLOntologyStorageException(e);
        }
    }finally{__CLR4_5_2lklklvicnc6h.R.flushNeeded();}}
}
