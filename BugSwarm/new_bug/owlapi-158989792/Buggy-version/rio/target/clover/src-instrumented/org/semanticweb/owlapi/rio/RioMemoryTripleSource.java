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

import static org.semanticweb.owlapi.util.OWLAPIPreconditions.checkNotNull;

import java.io.InputStream;
import java.io.Reader;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

import javax.annotation.Nonnull;

import org.openrdf.OpenRDFException;
import org.openrdf.model.Model;
import org.openrdf.model.Namespace;
import org.openrdf.model.Statement;
import org.openrdf.model.util.Namespaces;
import org.semanticweb.owlapi.io.OWLOntologyDocumentSource;
import org.semanticweb.owlapi.io.OWLOntologyDocumentSourceBase;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLDocumentFormat;
import org.semanticweb.owlapi.model.OWLRuntimeException;

import info.aduna.iteration.CloseableIteration;

/**
 * An implementation of the OWLOntologyDocumentSource interface that does not
 * implement any of the InputStream, Reader, or IRI source retrieval methods.
 * Instead it holds a reference to an iterator that will generate bare triples
 * to be interpreted by a Sesame Rio based OWLParser implementation.
 * 
 * @author Peter Ansell p_ansell@yahoo.com
 * @since 4.0.0
 */
public class RioMemoryTripleSource implements OWLOntologyDocumentSource {public static class __CLR4_5_29k9klvicnc3r{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0072\u0069\u006f\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237333555L,8589935092L,421,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final Map<String, String> namespaces = new LinkedHashMap<>();
    @Nonnull
    private final Iterator<Statement> statementIterator;
    @Nonnull
    private final IRI documentIRI;

    /**
     * Creates a RioMemoryTripleSource using an {@link Iterable} of
     * {@link Statement} objects.
     * 
     * @param statements
     *        An {@link Iterator} of {@link Statement} objects that make up this
     *        source.
     */
    public RioMemoryTripleSource(@Nonnull Iterator<Statement> statements) {try{__CLR4_5_29k9klvicnc3r.R.inc(344);
        __CLR4_5_29k9klvicnc3r.R.inc(345);documentIRI = OWLOntologyDocumentSourceBase.getNextDocumentIRI("rio-memory-triples:");
        __CLR4_5_29k9klvicnc3r.R.inc(346);statementIterator = checkNotNull(statements, "statements cannot be null");
    }finally{__CLR4_5_29k9klvicnc3r.R.flushNeeded();}}

    /**
     * Creates a RioMemoryTripleSource using an {@link Iterable} of
     * {@link Statement} objects.
     * 
     * @param statements
     *        An {@link Iterator} of {@link Statement} objects that make up this
     *        source.
     * @param namespaces
     *        A Map of namespaces from prefix to full URI which are to be used
     *        by this source.
     */
    public RioMemoryTripleSource(@Nonnull Iterator<Statement> statements, @Nonnull Map<String, String> namespaces) {
        this(statements);__CLR4_5_29k9klvicnc3r.R.inc(348);try{__CLR4_5_29k9klvicnc3r.R.inc(347);
        __CLR4_5_29k9klvicnc3r.R.inc(349);this.namespaces.putAll(namespaces);
    }finally{__CLR4_5_29k9klvicnc3r.R.flushNeeded();}}

    /**
     * Creates a RioMemoryTripleSource using an {@link Iterable} of
     * {@link Statement} objects. <br>
     * If the Iterable is an instance of {@link Model}, the namespaces from the
     * model are also used.
     * 
     * @param statements
     *        A {@link CloseableIteration} of {@link Statement} objects that
     *        make up this source.
     */
    public RioMemoryTripleSource(@Nonnull Iterable<Statement> statements) {try{__CLR4_5_29k9klvicnc3r.R.inc(350);
        __CLR4_5_29k9klvicnc3r.R.inc(351);documentIRI = OWLOntologyDocumentSourceBase.getNextDocumentIRI("rio-memory-triples:");
        __CLR4_5_29k9klvicnc3r.R.inc(352);statementIterator = statements.iterator();
        __CLR4_5_29k9klvicnc3r.R.inc(353);if ((((statements instanceof Model)&&(__CLR4_5_29k9klvicnc3r.R.iget(354)!=0|true))||(__CLR4_5_29k9klvicnc3r.R.iget(355)==0&false))) {{
            __CLR4_5_29k9klvicnc3r.R.inc(356);namespaces.putAll(Namespaces.asMap(((Model) statements).getNamespaces()));
        }
    }}finally{__CLR4_5_29k9klvicnc3r.R.flushNeeded();}}

    /**
     * Creates a RioMemoryTripleSource using a closeable iteration. Internally
     * this wraps the statements as an Iterator, and hence all statements must
     * be read for the iterator to be closed automatically.
     * 
     * @param statements
     *        A {@link CloseableIteration} of {@link Statement} objects that
     *        make up this source.
     */
    public RioMemoryTripleSource(final CloseableIteration<Statement, ? extends OpenRDFException> statements) {try{__CLR4_5_29k9klvicnc3r.R.inc(357);
        __CLR4_5_29k9klvicnc3r.R.inc(358);documentIRI = OWLOntologyDocumentSourceBase.getNextDocumentIRI("rio-memory-triples:");
        __CLR4_5_29k9klvicnc3r.R.inc(359);statementIterator = new Iterator<Statement>() {

            @Override
            public void remove() {try{__CLR4_5_29k9klvicnc3r.R.inc(360);
                __CLR4_5_29k9klvicnc3r.R.inc(361);throw new UnsupportedOperationException("Cannot remove statements using this iterator");
            }finally{__CLR4_5_29k9klvicnc3r.R.flushNeeded();}}

            @Override
            public Statement next() {try{__CLR4_5_29k9klvicnc3r.R.inc(362);
                __CLR4_5_29k9klvicnc3r.R.inc(363);Statement nextStatement = null;
                __CLR4_5_29k9klvicnc3r.R.inc(364);try {
                    __CLR4_5_29k9klvicnc3r.R.inc(365);nextStatement = statements.next();
                    __CLR4_5_29k9klvicnc3r.R.inc(366);if ((((nextStatement != null)&&(__CLR4_5_29k9klvicnc3r.R.iget(367)!=0|true))||(__CLR4_5_29k9klvicnc3r.R.iget(368)==0&false))) {{
                        __CLR4_5_29k9klvicnc3r.R.inc(369);return nextStatement;
                    } }else {{
                        __CLR4_5_29k9klvicnc3r.R.inc(370);throw new NoSuchElementException("No more statements in this iterator");
                    }
                }} catch (OpenRDFException e) {
                    __CLR4_5_29k9klvicnc3r.R.inc(371);throw new OWLRuntimeException("Found exception while iterating", e);
                } finally {
                    __CLR4_5_29k9klvicnc3r.R.inc(372);if ((((nextStatement == null)&&(__CLR4_5_29k9klvicnc3r.R.iget(373)!=0|true))||(__CLR4_5_29k9klvicnc3r.R.iget(374)==0&false))) {{
                        __CLR4_5_29k9klvicnc3r.R.inc(375);try {
                            __CLR4_5_29k9klvicnc3r.R.inc(376);statements.close();
                        } catch (OpenRDFException e) {
                            __CLR4_5_29k9klvicnc3r.R.inc(377);throw new OWLRuntimeException(e);
                        }
                    }
                }}
            }finally{__CLR4_5_29k9klvicnc3r.R.flushNeeded();}}

            @Override
            public boolean hasNext() {try{__CLR4_5_29k9klvicnc3r.R.inc(378);
                __CLR4_5_29k9klvicnc3r.R.inc(379);boolean result = false;
                __CLR4_5_29k9klvicnc3r.R.inc(380);try {
                    __CLR4_5_29k9klvicnc3r.R.inc(381);result = statements.hasNext();
                    __CLR4_5_29k9klvicnc3r.R.inc(382);return result;
                } catch (OpenRDFException e) {
                    __CLR4_5_29k9klvicnc3r.R.inc(383);throw new OWLRuntimeException("Found exception while iterating", e);
                } finally {
                    __CLR4_5_29k9klvicnc3r.R.inc(384);if ((((!result)&&(__CLR4_5_29k9klvicnc3r.R.iget(385)!=0|true))||(__CLR4_5_29k9klvicnc3r.R.iget(386)==0&false))) {{
                        __CLR4_5_29k9klvicnc3r.R.inc(387);try {
                            __CLR4_5_29k9klvicnc3r.R.inc(388);statements.close();
                        } catch (OpenRDFException e) {
                            __CLR4_5_29k9klvicnc3r.R.inc(389);throw new OWLRuntimeException(e);
                        }
                    }
                }}
            }finally{__CLR4_5_29k9klvicnc3r.R.flushNeeded();}}
        };
    }finally{__CLR4_5_29k9klvicnc3r.R.flushNeeded();}}

    /**
     * Creates a RioMemoryTripleSource using a closeable iteration. Internally
     * this wraps the statements as an Iterator, and hence all statements must
     * be read for the iterator to be closed automatically.
     * 
     * @param statements
     *        A {@link CloseableIteration} of {@link Statement} objects that
     *        make up this source.
     * @param namespaces
     *        A Map of namespaces from prefix to full URI which are to be used
     *        by this source.
     */
    public RioMemoryTripleSource(final CloseableIteration<Statement, ? extends OpenRDFException> statements,
        final Map<String, String> namespaces) {
        this(statements);__CLR4_5_29k9klvicnc3r.R.inc(391);try{__CLR4_5_29k9klvicnc3r.R.inc(390);
        __CLR4_5_29k9klvicnc3r.R.inc(392);this.namespaces.putAll(namespaces);
    }finally{__CLR4_5_29k9klvicnc3r.R.flushNeeded();}}

    @Override
    public boolean isReaderAvailable() {try{__CLR4_5_29k9klvicnc3r.R.inc(393);
        __CLR4_5_29k9klvicnc3r.R.inc(394);return false;
    }finally{__CLR4_5_29k9klvicnc3r.R.flushNeeded();}}

    @Override
    public Reader getReader() {try{__CLR4_5_29k9klvicnc3r.R.inc(395);
        __CLR4_5_29k9klvicnc3r.R.inc(396);throw new UnsupportedOperationException(
            "No reader available for RioMemoryTripleSource, use isReaderAvailable() to check");
    }finally{__CLR4_5_29k9klvicnc3r.R.flushNeeded();}}

    @Override
    public boolean isInputStreamAvailable() {try{__CLR4_5_29k9klvicnc3r.R.inc(397);
        __CLR4_5_29k9klvicnc3r.R.inc(398);return false;
    }finally{__CLR4_5_29k9klvicnc3r.R.flushNeeded();}}

    @Override
    public InputStream getInputStream() {try{__CLR4_5_29k9klvicnc3r.R.inc(399);
        __CLR4_5_29k9klvicnc3r.R.inc(400);throw new UnsupportedOperationException(
            "No input stream available for RioMemoryTripleSource, use isInputStreamAvailable() to check");
    }finally{__CLR4_5_29k9klvicnc3r.R.flushNeeded();}}

    @Override
    public IRI getDocumentIRI() {try{__CLR4_5_29k9klvicnc3r.R.inc(401);
        __CLR4_5_29k9klvicnc3r.R.inc(402);return documentIRI;
    }finally{__CLR4_5_29k9klvicnc3r.R.flushNeeded();}}

    @Override
    public boolean isFormatKnown() {try{__CLR4_5_29k9klvicnc3r.R.inc(403);
        __CLR4_5_29k9klvicnc3r.R.inc(404);return false;
    }finally{__CLR4_5_29k9klvicnc3r.R.flushNeeded();}}

    @Override
    public OWLDocumentFormat getFormat() {try{__CLR4_5_29k9klvicnc3r.R.inc(405);
        __CLR4_5_29k9klvicnc3r.R.inc(406);return null;
    }finally{__CLR4_5_29k9klvicnc3r.R.flushNeeded();}}

    /**
     * @return namespace map
     */
    public Map<String, String> getNamespaces() {try{__CLR4_5_29k9klvicnc3r.R.inc(407);
        __CLR4_5_29k9klvicnc3r.R.inc(408);return namespaces;
    }finally{__CLR4_5_29k9klvicnc3r.R.flushNeeded();}}

    /**
     * @return statements
     */
    public Iterator<Statement> getStatementIterator() {try{__CLR4_5_29k9klvicnc3r.R.inc(409);
        __CLR4_5_29k9klvicnc3r.R.inc(410);return statementIterator;
    }finally{__CLR4_5_29k9klvicnc3r.R.flushNeeded();}}

    /**
     * @param nextNamespaces
     *        set of namespaces to set
     */
    public void setNamespaces(Set<Namespace> nextNamespaces) {try{__CLR4_5_29k9klvicnc3r.R.inc(411);
        __CLR4_5_29k9klvicnc3r.R.inc(412);namespaces.clear();
        __CLR4_5_29k9klvicnc3r.R.inc(413);namespaces.putAll(Namespaces.asMap(nextNamespaces));
    }finally{__CLR4_5_29k9klvicnc3r.R.flushNeeded();}}

    /**
     * @param nextNamespaces
     *        map of namespaces to set
     */
    public void setNamespaces(Map<String, String> nextNamespaces) {try{__CLR4_5_29k9klvicnc3r.R.inc(414);
        __CLR4_5_29k9klvicnc3r.R.inc(415);namespaces.clear();
        __CLR4_5_29k9klvicnc3r.R.inc(416);namespaces.putAll(nextNamespaces);
    }finally{__CLR4_5_29k9klvicnc3r.R.flushNeeded();}}

    @Override
    public String getMIMEType() {try{__CLR4_5_29k9klvicnc3r.R.inc(417);
        __CLR4_5_29k9klvicnc3r.R.inc(418);return null;
    }finally{__CLR4_5_29k9klvicnc3r.R.flushNeeded();}}

    @Override
    public boolean isMIMETypeKnown() {try{__CLR4_5_29k9klvicnc3r.R.inc(419);
        __CLR4_5_29k9klvicnc3r.R.inc(420);return false;
    }finally{__CLR4_5_29k9klvicnc3r.R.flushNeeded();}}
}
