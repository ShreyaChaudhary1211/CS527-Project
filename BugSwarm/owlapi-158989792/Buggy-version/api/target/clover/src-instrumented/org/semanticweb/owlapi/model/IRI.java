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
package org.semanticweb.owlapi.model;

import static org.semanticweb.owlapi.util.OWLAPIPreconditions.checkNotNull;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicLong;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.semanticweb.owlapi.io.XMLUtils;
import org.semanticweb.owlapi.util.CollectionFactory;
import org.semanticweb.owlapi.vocab.Namespaces;
import org.semanticweb.owlapi.vocab.OWLRDFVocabulary;

import com.google.common.base.Optional;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

/**
 * Represents International Resource Identifiers
 * 
 * @author Matthew Horridge, The University of Manchester, Information
 *         Management Group
 * @since 3.0.0
 */
public class IRI implements OWLAnnotationSubject, OWLAnnotationValue, SWRLPredicate, CharSequence, OWLPrimitive,
    HasShortForm {public static class __CLR4_5_21rv1rvlvicklz9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0061\u0070\u0069\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237201267L,8589935092L,2534,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Obtains this IRI as a URI. Note that Java URIs handle unicode characters,
     * so there is no loss during this translation.
     * 
     * @return The URI
     */
    @Nonnull
    public URI toURI() {try{__CLR4_5_21rv1rvlvicklz9.R.inc(2299);
        __CLR4_5_21rv1rvlvicklz9.R.inc(2300);return URI.create(namespace + remainder);
    }finally{__CLR4_5_21rv1rvlvicklz9.R.flushNeeded();}}

    /**
     * Determines if this IRI is absolute
     * 
     * @return {@code true} if this IRI is absolute or {@code false} if this IRI
     *         is not absolute
     */
    public boolean isAbsolute() {try{__CLR4_5_21rv1rvlvicklz9.R.inc(2301);
        __CLR4_5_21rv1rvlvicklz9.R.inc(2302);int colonIndex = namespace.indexOf(':');
        __CLR4_5_21rv1rvlvicklz9.R.inc(2303);if ((((colonIndex == -1)&&(__CLR4_5_21rv1rvlvicklz9.R.iget(2304)!=0|true))||(__CLR4_5_21rv1rvlvicklz9.R.iget(2305)==0&false))) {{
            __CLR4_5_21rv1rvlvicklz9.R.inc(2306);return false;
        }
        }__CLR4_5_21rv1rvlvicklz9.R.inc(2307);for (int i = 0; (((i < colonIndex)&&(__CLR4_5_21rv1rvlvicklz9.R.iget(2308)!=0|true))||(__CLR4_5_21rv1rvlvicklz9.R.iget(2309)==0&false)); i++) {{
            __CLR4_5_21rv1rvlvicklz9.R.inc(2310);char ch = namespace.charAt(i);
            __CLR4_5_21rv1rvlvicklz9.R.inc(2311);if ((((!Character.isLetter(ch) && !Character.isDigit(ch) && ch != '.' && ch != '+' && ch != '-')&&(__CLR4_5_21rv1rvlvicklz9.R.iget(2312)!=0|true))||(__CLR4_5_21rv1rvlvicklz9.R.iget(2313)==0&false))) {{
                __CLR4_5_21rv1rvlvicklz9.R.inc(2314);return false;
            }
        }}
        }__CLR4_5_21rv1rvlvicklz9.R.inc(2315);return true;
    }finally{__CLR4_5_21rv1rvlvicklz9.R.flushNeeded();}}

    /**
     * @return the IRI scheme, e.g., http, urn
     */
    @Nullable
    public String getScheme() {try{__CLR4_5_21rv1rvlvicklz9.R.inc(2316);
        __CLR4_5_21rv1rvlvicklz9.R.inc(2317);int colonIndex = namespace.indexOf(':');
        __CLR4_5_21rv1rvlvicklz9.R.inc(2318);if ((((colonIndex == -1)&&(__CLR4_5_21rv1rvlvicklz9.R.iget(2319)!=0|true))||(__CLR4_5_21rv1rvlvicklz9.R.iget(2320)==0&false))) {{
            __CLR4_5_21rv1rvlvicklz9.R.inc(2321);return null;
        }
        }__CLR4_5_21rv1rvlvicklz9.R.inc(2322);return namespace.substring(0, colonIndex);
    }finally{__CLR4_5_21rv1rvlvicklz9.R.flushNeeded();}}

    /**
     * @return the prefix
     */
    @Nonnull
    public String getNamespace() {try{__CLR4_5_21rv1rvlvicklz9.R.inc(2323);
        __CLR4_5_21rv1rvlvicklz9.R.inc(2324);return namespace;
    }finally{__CLR4_5_21rv1rvlvicklz9.R.flushNeeded();}}

    /**
     * @param s
     *        the IRI stirng to be resolved
     * @return s resolved against this IRI (with the URI::resolve() method,
     *         unless this IRI is opaque)
     */
    @Nonnull
    public IRI resolve(@Nonnull String s) {try{__CLR4_5_21rv1rvlvicklz9.R.inc(2325);
        // shortcut: checking absolute and opaque here saves the creation of an
        // extra URI object
        __CLR4_5_21rv1rvlvicklz9.R.inc(2326);URI uri = URI.create(s);
        __CLR4_5_21rv1rvlvicklz9.R.inc(2327);if ((((uri.isAbsolute() || uri.isOpaque())&&(__CLR4_5_21rv1rvlvicklz9.R.iget(2328)!=0|true))||(__CLR4_5_21rv1rvlvicklz9.R.iget(2329)==0&false))) {{
            __CLR4_5_21rv1rvlvicklz9.R.inc(2330);return create(uri);
        }
        }__CLR4_5_21rv1rvlvicklz9.R.inc(2331);return create(toURI().resolve(uri));
    }finally{__CLR4_5_21rv1rvlvicklz9.R.flushNeeded();}}

    /**
     * Determines if this IRI is in the reserved vocabulary. An IRI is in the
     * reserved vocabulary if it starts with
     * &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#&gt; or
     * &lt;http://www.w3.org/2000/01/rdf-schema#&gt; or
     * &lt;http://www.w3.org/2001/XMLSchema#&gt; or
     * &lt;http://www.w3.org/2002/07/owl#&gt;
     * 
     * @return {@code true} if the IRI is in the reserved vocabulary, otherwise
     *         {@code false}.
     */
    public boolean isReservedVocabulary() {try{__CLR4_5_21rv1rvlvicklz9.R.inc(2332);
        __CLR4_5_21rv1rvlvicklz9.R.inc(2333);return Namespaces.OWL.inNamespace(namespace) || Namespaces.RDF.inNamespace(namespace) || Namespaces.RDFS
            .inNamespace(namespace) || Namespaces.XSD.inNamespace(namespace);
    }finally{__CLR4_5_21rv1rvlvicklz9.R.flushNeeded();}}

    /**
     * Determines if this IRI is equal to the IRI that {@code owl:Thing} is
     * named with
     * 
     * @return {@code true} if this IRI is equal to
     *         &lt;http://www.w3.org/2002/07/owl#Thing&gt; and otherwise
     *         {@code false}
     */
    public boolean isThing() {try{__CLR4_5_21rv1rvlvicklz9.R.inc(2334);
        __CLR4_5_21rv1rvlvicklz9.R.inc(2335);return equals(OWLRDFVocabulary.OWL_THING.getIRI());
    }finally{__CLR4_5_21rv1rvlvicklz9.R.flushNeeded();}}

    /**
     * Determines if this IRI is equal to the IRI that {@code owl:Nothing} is
     * named with
     * 
     * @return {@code true} if this IRI is equal to
     *         &lt;http://www.w3.org/2002/07/owl#Nothing&gt; and otherwise
     *         {@code false}
     */
    public boolean isNothing() {try{__CLR4_5_21rv1rvlvicklz9.R.inc(2336);
        __CLR4_5_21rv1rvlvicklz9.R.inc(2337);return equals(OWLRDFVocabulary.OWL_NOTHING.getIRI());
    }finally{__CLR4_5_21rv1rvlvicklz9.R.flushNeeded();}}

    /**
     * Determines if this IRI is equal to the IRI that is named
     * {@code rdf:PlainLiteral}
     * 
     * @return {@code true} if this IRI is equal to
     *         &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#PlainLiteral&gt;,
     *         otherwise {@code false}
     */
    public boolean isPlainLiteral() {try{__CLR4_5_21rv1rvlvicklz9.R.inc(2338);
        __CLR4_5_21rv1rvlvicklz9.R.inc(2339);return remainder.equals("PlainLiteral") && Namespaces.RDF.inNamespace(namespace);
    }finally{__CLR4_5_21rv1rvlvicklz9.R.flushNeeded();}}

    /**
     * Gets the fragment of the IRI.
     * 
     * @return The IRI fragment, or empty string if the IRI does not have a
     *         fragment
     * @deprecated use getNCName() - getFragment() does not return a real
     *             fragment. e.g., it does not allow / and () on it
     */
    @Deprecated
    @Nonnull
    public String getFragment() {try{__CLR4_5_21rv1rvlvicklz9.R.inc(2340);
        __CLR4_5_21rv1rvlvicklz9.R.inc(2341);return remainder;
    }finally{__CLR4_5_21rv1rvlvicklz9.R.flushNeeded();}}

    /**
     * @return the remainder (coincident with NCName usually) for this IRI.
     */
    @Nonnull
    public Optional<String> getRemainder() {try{__CLR4_5_21rv1rvlvicklz9.R.inc(2342);
        __CLR4_5_21rv1rvlvicklz9.R.inc(2343);if ((((remainder.isEmpty())&&(__CLR4_5_21rv1rvlvicklz9.R.iget(2344)!=0|true))||(__CLR4_5_21rv1rvlvicklz9.R.iget(2345)==0&false))) {{
            __CLR4_5_21rv1rvlvicklz9.R.inc(2346);return Optional.absent();
        }
        }__CLR4_5_21rv1rvlvicklz9.R.inc(2347);return Optional.of(remainder);
    }finally{__CLR4_5_21rv1rvlvicklz9.R.flushNeeded();}}

    /**
     * Obtained this IRI surrounded by angled brackets
     * 
     * @return This IRI surrounded by &lt; and &gt;
     */
    @Nonnull
    public String toQuotedString() {try{__CLR4_5_21rv1rvlvicklz9.R.inc(2348);
        __CLR4_5_21rv1rvlvicklz9.R.inc(2349);return '<' + namespace + remainder + '>';
    }finally{__CLR4_5_21rv1rvlvicklz9.R.flushNeeded();}}

    /**
     * Creates an IRI from the specified String.
     * 
     * @param str
     *        The String that specifies the IRI
     * @return The IRI that has the specified string representation.
     */
    @Nonnull
    public static IRI create(@Nonnull String str) {try{__CLR4_5_21rv1rvlvicklz9.R.inc(2350);
        __CLR4_5_21rv1rvlvicklz9.R.inc(2351);checkNotNull(str, "str cannot be null");
        __CLR4_5_21rv1rvlvicklz9.R.inc(2352);int index = XMLUtils.getNCNameSuffixIndex(str);
        __CLR4_5_21rv1rvlvicklz9.R.inc(2353);if ((((index < 0)&&(__CLR4_5_21rv1rvlvicklz9.R.iget(2354)!=0|true))||(__CLR4_5_21rv1rvlvicklz9.R.iget(2355)==0&false))) {{
            // no ncname
            __CLR4_5_21rv1rvlvicklz9.R.inc(2356);return new IRI(str, "");
        }
        }__CLR4_5_21rv1rvlvicklz9.R.inc(2357);return new IRI(str.substring(0, index), str.substring(index));
    }finally{__CLR4_5_21rv1rvlvicklz9.R.flushNeeded();}}

    /**
     * Creates an IRI by concatenating two strings. The full IRI is an IRI that
     * contains the characters in prefix + suffix.
     * 
     * @param prefix
     *        The first string
     * @param suffix
     *        The second string
     * @return An IRI whose characters consist of prefix + suffix.
     * @since 3.3
     */
    @Nonnull
    public static IRI create(@Nullable String prefix, @Nullable String suffix) {try{__CLR4_5_21rv1rvlvicklz9.R.inc(2358);
        __CLR4_5_21rv1rvlvicklz9.R.inc(2359);if ((((prefix == null && suffix == null)&&(__CLR4_5_21rv1rvlvicklz9.R.iget(2360)!=0|true))||(__CLR4_5_21rv1rvlvicklz9.R.iget(2361)==0&false))) {{
            __CLR4_5_21rv1rvlvicklz9.R.inc(2362);throw new IllegalArgumentException("prefix and suffix cannot both be null");
        }
        }__CLR4_5_21rv1rvlvicklz9.R.inc(2363);if ((((prefix == null)&&(__CLR4_5_21rv1rvlvicklz9.R.iget(2364)!=0|true))||(__CLR4_5_21rv1rvlvicklz9.R.iget(2365)==0&false))) {{
            assert (((suffix != null)&&(__CLR4_5_21rv1rvlvicklz9.R.iget(2366)!=0|true))||(__CLR4_5_21rv1rvlvicklz9.R.iget(2367)==0&false));
            __CLR4_5_21rv1rvlvicklz9.R.inc(2368);return create(suffix);
        } }else {__CLR4_5_21rv1rvlvicklz9.R.inc(2369);if ((((suffix == null)&&(__CLR4_5_21rv1rvlvicklz9.R.iget(2370)!=0|true))||(__CLR4_5_21rv1rvlvicklz9.R.iget(2371)==0&false))) {{
            // suffix set deliberately to null is used only in blank node
            // management
            // this is not great but blank nodes should be changed to not refer
            // to IRIs at all
            // XXX address blank node issues with iris
            __CLR4_5_21rv1rvlvicklz9.R.inc(2372);return create(prefix);
        } }else {{
            __CLR4_5_21rv1rvlvicklz9.R.inc(2373);int index = XMLUtils.getNCNameSuffixIndex(prefix);
            __CLR4_5_21rv1rvlvicklz9.R.inc(2374);int test = XMLUtils.getNCNameSuffixIndex(suffix);
            __CLR4_5_21rv1rvlvicklz9.R.inc(2375);if ((((index == -1 && test == 0)&&(__CLR4_5_21rv1rvlvicklz9.R.iget(2376)!=0|true))||(__CLR4_5_21rv1rvlvicklz9.R.iget(2377)==0&false))) {{
                // the prefix does not contain an ncname character and there is
                // no illegal character in the suffix
                // the split is therefore correct
                __CLR4_5_21rv1rvlvicklz9.R.inc(2378);return new IRI(prefix, suffix);
            }
            // otherwise the split is wrong; we could obtain the right split by
            // using index and test, but it's just as easy to use the other
            // constructor
            }__CLR4_5_21rv1rvlvicklz9.R.inc(2379);return create(prefix + suffix);
        }
    }}}finally{__CLR4_5_21rv1rvlvicklz9.R.flushNeeded();}}

    /**
     * @param file
     *        the file to create the IRI from
     * @return file.toURI() IRI
     */
    @Nonnull
    public static IRI create(@Nonnull File file) {try{__CLR4_5_21rv1rvlvicklz9.R.inc(2380);
        __CLR4_5_21rv1rvlvicklz9.R.inc(2381);checkNotNull(file, "file cannot be null");
        __CLR4_5_21rv1rvlvicklz9.R.inc(2382);return new IRI(file.toURI());
    }finally{__CLR4_5_21rv1rvlvicklz9.R.flushNeeded();}}

    /**
     * @param uri
     *        the uri to create the IRI from
     * @return the IRI wrapping the uri
     */
    @Nonnull
    public static IRI create(@Nonnull URI uri) {try{__CLR4_5_21rv1rvlvicklz9.R.inc(2383);
        __CLR4_5_21rv1rvlvicklz9.R.inc(2384);checkNotNull(uri, "uri cannot be null");
        __CLR4_5_21rv1rvlvicklz9.R.inc(2385);return new IRI(uri);
    }finally{__CLR4_5_21rv1rvlvicklz9.R.flushNeeded();}}

    /**
     * @param url
     *        the url to create the IRI from
     * @return an IRI wrapping url.toURI()
     * @throws OWLRuntimeException
     *         if the URL is ill formed
     */
    @Nonnull
    public static IRI create(@Nonnull URL url) {try{__CLR4_5_21rv1rvlvicklz9.R.inc(2386);
        __CLR4_5_21rv1rvlvicklz9.R.inc(2387);checkNotNull(url, "url cannot be null");
        __CLR4_5_21rv1rvlvicklz9.R.inc(2388);try {
            __CLR4_5_21rv1rvlvicklz9.R.inc(2389);return new IRI(url.toURI());
        } catch (URISyntaxException e) {
            __CLR4_5_21rv1rvlvicklz9.R.inc(2390);throw new OWLRuntimeException(e);
        }
    }finally{__CLR4_5_21rv1rvlvicklz9.R.flushNeeded();}}

    /**
     * Gets an auto-generated ontology document IRI.
     * 
     * @return An auto-generated ontology document IRI. The IRI has the form
     *         {@code owlapi:ontologyNNNNNNNNNNN}
     */
    @Nonnull
    public static IRI generateDocumentIRI() {try{__CLR4_5_21rv1rvlvicklz9.R.inc(2391);
        __CLR4_5_21rv1rvlvicklz9.R.inc(2392);return create("owlapi:ontology" + COUNTER.incrementAndGet());
    }finally{__CLR4_5_21rv1rvlvicklz9.R.flushNeeded();}}

    private static final AtomicLong COUNTER = new AtomicLong(System.nanoTime());
    // Impl - All constructors are private - factory methods are used for
    // public creation
    private static final long serialVersionUID = 40000L;
    private static final LoadingCache<String, String> PREFIX_CACHE = CacheBuilder.newBuilder().concurrencyLevel(8)
        .maximumSize(1024).build(new CacheLoader<String, String>() {

            @Override
            public String load(String key) {try{__CLR4_5_21rv1rvlvicklz9.R.inc(2393);
                __CLR4_5_21rv1rvlvicklz9.R.inc(2394);return key;
            }finally{__CLR4_5_21rv1rvlvicklz9.R.flushNeeded();}}
        });

    @Nonnull
    private static String cache(@Nonnull String s) {try{__CLR4_5_21rv1rvlvicklz9.R.inc(2395);
        __CLR4_5_21rv1rvlvicklz9.R.inc(2396);try {
            __CLR4_5_21rv1rvlvicklz9.R.inc(2397);return PREFIX_CACHE.get(s);
        } catch (ExecutionException e) {
            __CLR4_5_21rv1rvlvicklz9.R.inc(2398);return s;
        }
    }finally{__CLR4_5_21rv1rvlvicklz9.R.flushNeeded();}}

    @Nonnull
    private final String remainder;
    @Nonnull
    private final String namespace;

    /**
     * Constructs an IRI which is built from the concatenation of the specified
     * prefix and suffix.
     * 
     * @param prefix
     *        The prefix.
     * @param suffix
     *        The suffix.
     */
    protected IRI(@Nonnull String prefix, @Nullable String suffix) {try{__CLR4_5_21rv1rvlvicklz9.R.inc(2399);
        __CLR4_5_21rv1rvlvicklz9.R.inc(2400);namespace = cache(prefix);
        __CLR4_5_21rv1rvlvicklz9.R.inc(2401);remainder = (((suffix == null )&&(__CLR4_5_21rv1rvlvicklz9.R.iget(2402)!=0|true))||(__CLR4_5_21rv1rvlvicklz9.R.iget(2403)==0&false))? "" : suffix;
    }finally{__CLR4_5_21rv1rvlvicklz9.R.flushNeeded();}}

    /**
     * @param suffix
     *        suffix to turn to optional. Empty string is the same as null
     * @return optional value for remainder
     */
    @Nonnull
    protected Optional<String> asOptional(String suffix) {try{__CLR4_5_21rv1rvlvicklz9.R.inc(2404);
        __CLR4_5_21rv1rvlvicklz9.R.inc(2405);if ((((suffix == null)&&(__CLR4_5_21rv1rvlvicklz9.R.iget(2406)!=0|true))||(__CLR4_5_21rv1rvlvicklz9.R.iget(2407)==0&false))) {{
            __CLR4_5_21rv1rvlvicklz9.R.inc(2408);return Optional.absent();
        } }else {__CLR4_5_21rv1rvlvicklz9.R.inc(2409);if ((((suffix.isEmpty())&&(__CLR4_5_21rv1rvlvicklz9.R.iget(2410)!=0|true))||(__CLR4_5_21rv1rvlvicklz9.R.iget(2411)==0&false))) {{
            __CLR4_5_21rv1rvlvicklz9.R.inc(2412);return Optional.absent();
        }
        }}__CLR4_5_21rv1rvlvicklz9.R.inc(2413);return Optional.fromNullable(suffix);
    }finally{__CLR4_5_21rv1rvlvicklz9.R.flushNeeded();}}

    protected IRI(@Nonnull String s) {
        this(XMLUtils.getNCNamePrefix(s), XMLUtils.getNCNameSuffix(s));__CLR4_5_21rv1rvlvicklz9.R.inc(2415);try{__CLR4_5_21rv1rvlvicklz9.R.inc(2414);
    }finally{__CLR4_5_21rv1rvlvicklz9.R.flushNeeded();}}

    protected IRI(@Nonnull URI uri) {
        this(checkNotNull(uri, "uri cannot be null").toString());__CLR4_5_21rv1rvlvicklz9.R.inc(2417);try{__CLR4_5_21rv1rvlvicklz9.R.inc(2416);
    }finally{__CLR4_5_21rv1rvlvicklz9.R.flushNeeded();}}

    @Override
    public int length() {try{__CLR4_5_21rv1rvlvicklz9.R.inc(2418);
        __CLR4_5_21rv1rvlvicklz9.R.inc(2419);return namespace.length() + remainder.length();
    }finally{__CLR4_5_21rv1rvlvicklz9.R.flushNeeded();}}

    @Override
    public char charAt(int index) {try{__CLR4_5_21rv1rvlvicklz9.R.inc(2420);
        __CLR4_5_21rv1rvlvicklz9.R.inc(2421);if ((((index < 0)&&(__CLR4_5_21rv1rvlvicklz9.R.iget(2422)!=0|true))||(__CLR4_5_21rv1rvlvicklz9.R.iget(2423)==0&false))) {{
            __CLR4_5_21rv1rvlvicklz9.R.inc(2424);throw new IndexOutOfBoundsException(Integer.toString(index));
        }
        }__CLR4_5_21rv1rvlvicklz9.R.inc(2425);if ((((index < namespace.length())&&(__CLR4_5_21rv1rvlvicklz9.R.iget(2426)!=0|true))||(__CLR4_5_21rv1rvlvicklz9.R.iget(2427)==0&false))) {{
            __CLR4_5_21rv1rvlvicklz9.R.inc(2428);return namespace.charAt(index);
        }
        }__CLR4_5_21rv1rvlvicklz9.R.inc(2429);return remainder.charAt(index - namespace.length());
    }finally{__CLR4_5_21rv1rvlvicklz9.R.flushNeeded();}}

    @Override
    public CharSequence subSequence(int start, int end) {try{__CLR4_5_21rv1rvlvicklz9.R.inc(2430);
        __CLR4_5_21rv1rvlvicklz9.R.inc(2431);StringBuilder sb = new StringBuilder();
        __CLR4_5_21rv1rvlvicklz9.R.inc(2432);sb.append(namespace);
        __CLR4_5_21rv1rvlvicklz9.R.inc(2433);sb.append(remainder);
        __CLR4_5_21rv1rvlvicklz9.R.inc(2434);return sb.subSequence(start, end);
    }finally{__CLR4_5_21rv1rvlvicklz9.R.flushNeeded();}}

    /**
     * @param prefix
     *        prefix to use for replacing the IRI namespace
     * @return prefix plus IRI ncname
     */
    @Nonnull
    public String prefixedBy(@Nonnull String prefix) {try{__CLR4_5_21rv1rvlvicklz9.R.inc(2435);
        __CLR4_5_21rv1rvlvicklz9.R.inc(2436);checkNotNull(prefix, "prefix cannot be null");
        __CLR4_5_21rv1rvlvicklz9.R.inc(2437);if ((((remainder.isEmpty())&&(__CLR4_5_21rv1rvlvicklz9.R.iget(2438)!=0|true))||(__CLR4_5_21rv1rvlvicklz9.R.iget(2439)==0&false))) {{
            __CLR4_5_21rv1rvlvicklz9.R.inc(2440);return prefix;
        }
        }__CLR4_5_21rv1rvlvicklz9.R.inc(2441);return prefix + remainder;
    }finally{__CLR4_5_21rv1rvlvicklz9.R.flushNeeded();}}

    @Override
    @Nonnull
    public String getShortForm() {try{__CLR4_5_21rv1rvlvicklz9.R.inc(2442);
        __CLR4_5_21rv1rvlvicklz9.R.inc(2443);if ((((!remainder.isEmpty())&&(__CLR4_5_21rv1rvlvicklz9.R.iget(2444)!=0|true))||(__CLR4_5_21rv1rvlvicklz9.R.iget(2445)==0&false))) {{
            __CLR4_5_21rv1rvlvicklz9.R.inc(2446);return remainder;
        }
        }__CLR4_5_21rv1rvlvicklz9.R.inc(2447);int lastSlashIndex = namespace.lastIndexOf('/');
        __CLR4_5_21rv1rvlvicklz9.R.inc(2448);if ((((lastSlashIndex != -1 && lastSlashIndex != namespace.length() - 1)&&(__CLR4_5_21rv1rvlvicklz9.R.iget(2449)!=0|true))||(__CLR4_5_21rv1rvlvicklz9.R.iget(2450)==0&false))) {{
            __CLR4_5_21rv1rvlvicklz9.R.inc(2451);return namespace.substring(lastSlashIndex + 1);
        }
        }__CLR4_5_21rv1rvlvicklz9.R.inc(2452);return toQuotedString();
    }finally{__CLR4_5_21rv1rvlvicklz9.R.flushNeeded();}}

    @Override
    public void accept(@Nonnull OWLObjectVisitor visitor) {try{__CLR4_5_21rv1rvlvicklz9.R.inc(2453);
        __CLR4_5_21rv1rvlvicklz9.R.inc(2454);visitor.visit(this);
    }finally{__CLR4_5_21rv1rvlvicklz9.R.flushNeeded();}}

    @Override
    public <O> O accept(@Nonnull OWLObjectVisitorEx<O> visitor) {try{__CLR4_5_21rv1rvlvicklz9.R.inc(2455);
        __CLR4_5_21rv1rvlvicklz9.R.inc(2456);return visitor.visit(this);
    }finally{__CLR4_5_21rv1rvlvicklz9.R.flushNeeded();}}

    @Override
    public void accept(@Nonnull OWLAnnotationSubjectVisitor visitor) {try{__CLR4_5_21rv1rvlvicklz9.R.inc(2457);
        __CLR4_5_21rv1rvlvicklz9.R.inc(2458);visitor.visit(this);
    }finally{__CLR4_5_21rv1rvlvicklz9.R.flushNeeded();}}

    @Override
    public <E> E accept(@Nonnull OWLAnnotationSubjectVisitorEx<E> visitor) {try{__CLR4_5_21rv1rvlvicklz9.R.inc(2459);
        __CLR4_5_21rv1rvlvicklz9.R.inc(2460);return visitor.visit(this);
    }finally{__CLR4_5_21rv1rvlvicklz9.R.flushNeeded();}}

    @Nonnull
    @Override
    public Set<OWLClass> getClassesInSignature() {try{__CLR4_5_21rv1rvlvicklz9.R.inc(2461);
        __CLR4_5_21rv1rvlvicklz9.R.inc(2462);return CollectionFactory.emptySet();
    }finally{__CLR4_5_21rv1rvlvicklz9.R.flushNeeded();}}

    @Nonnull
    @Override
    public Set<OWLDataProperty> getDataPropertiesInSignature() {try{__CLR4_5_21rv1rvlvicklz9.R.inc(2463);
        __CLR4_5_21rv1rvlvicklz9.R.inc(2464);return CollectionFactory.emptySet();
    }finally{__CLR4_5_21rv1rvlvicklz9.R.flushNeeded();}}

    @Nonnull
    @Override
    public Set<OWLNamedIndividual> getIndividualsInSignature() {try{__CLR4_5_21rv1rvlvicklz9.R.inc(2465);
        __CLR4_5_21rv1rvlvicklz9.R.inc(2466);return CollectionFactory.emptySet();
    }finally{__CLR4_5_21rv1rvlvicklz9.R.flushNeeded();}}

    @Nonnull
    @Override
    public Set<OWLObjectProperty> getObjectPropertiesInSignature() {try{__CLR4_5_21rv1rvlvicklz9.R.inc(2467);
        __CLR4_5_21rv1rvlvicklz9.R.inc(2468);return CollectionFactory.emptySet();
    }finally{__CLR4_5_21rv1rvlvicklz9.R.flushNeeded();}}

    @Nonnull
    @Override
    public Set<OWLEntity> getSignature() {try{__CLR4_5_21rv1rvlvicklz9.R.inc(2469);
        __CLR4_5_21rv1rvlvicklz9.R.inc(2470);return CollectionFactory.emptySet();
    }finally{__CLR4_5_21rv1rvlvicklz9.R.flushNeeded();}}

    @Override
    public boolean containsEntityInSignature(OWLEntity owlEntity) {try{__CLR4_5_21rv1rvlvicklz9.R.inc(2471);
        __CLR4_5_21rv1rvlvicklz9.R.inc(2472);return false;
    }finally{__CLR4_5_21rv1rvlvicklz9.R.flushNeeded();}}

    @Nonnull
    @Override
    public Set<OWLAnonymousIndividual> getAnonymousIndividuals() {try{__CLR4_5_21rv1rvlvicklz9.R.inc(2473);
        __CLR4_5_21rv1rvlvicklz9.R.inc(2474);return CollectionFactory.emptySet();
    }finally{__CLR4_5_21rv1rvlvicklz9.R.flushNeeded();}}

    @Nonnull
    @Override
    public Set<OWLDatatype> getDatatypesInSignature() {try{__CLR4_5_21rv1rvlvicklz9.R.inc(2475);
        __CLR4_5_21rv1rvlvicklz9.R.inc(2476);return CollectionFactory.emptySet();
    }finally{__CLR4_5_21rv1rvlvicklz9.R.flushNeeded();}}

    @Override
    public Set<OWLAnnotationProperty> getAnnotationPropertiesInSignature() {try{__CLR4_5_21rv1rvlvicklz9.R.inc(2477);
        __CLR4_5_21rv1rvlvicklz9.R.inc(2478);return CollectionFactory.emptySet();
    }finally{__CLR4_5_21rv1rvlvicklz9.R.flushNeeded();}}

    @Nonnull
    @Override
    public Set<OWLClassExpression> getNestedClassExpressions() {try{__CLR4_5_21rv1rvlvicklz9.R.inc(2479);
        __CLR4_5_21rv1rvlvicklz9.R.inc(2480);return CollectionFactory.emptySet();
    }finally{__CLR4_5_21rv1rvlvicklz9.R.flushNeeded();}}

    @Override
    public int compareTo(OWLObject o) {try{__CLR4_5_21rv1rvlvicklz9.R.inc(2481);
        __CLR4_5_21rv1rvlvicklz9.R.inc(2482);if ((((o == this || equals(o))&&(__CLR4_5_21rv1rvlvicklz9.R.iget(2483)!=0|true))||(__CLR4_5_21rv1rvlvicklz9.R.iget(2484)==0&false))) {{
            __CLR4_5_21rv1rvlvicklz9.R.inc(2485);return 0;
        }
        }__CLR4_5_21rv1rvlvicklz9.R.inc(2486);if ((((!(o instanceof IRI))&&(__CLR4_5_21rv1rvlvicklz9.R.iget(2487)!=0|true))||(__CLR4_5_21rv1rvlvicklz9.R.iget(2488)==0&false))) {{
            __CLR4_5_21rv1rvlvicklz9.R.inc(2489);return -1;
        }
        }__CLR4_5_21rv1rvlvicklz9.R.inc(2490);IRI other = (IRI) o;
        __CLR4_5_21rv1rvlvicklz9.R.inc(2491);int diff = namespace.compareTo(other.namespace);
        __CLR4_5_21rv1rvlvicklz9.R.inc(2492);if ((((diff != 0)&&(__CLR4_5_21rv1rvlvicklz9.R.iget(2493)!=0|true))||(__CLR4_5_21rv1rvlvicklz9.R.iget(2494)==0&false))) {{
            __CLR4_5_21rv1rvlvicklz9.R.inc(2495);return diff;
        }
        }__CLR4_5_21rv1rvlvicklz9.R.inc(2496);return remainder.compareTo(other.remainder);
    }finally{__CLR4_5_21rv1rvlvicklz9.R.flushNeeded();}}

    @Nonnull
    @Override
    public String toString() {try{__CLR4_5_21rv1rvlvicklz9.R.inc(2497);
        __CLR4_5_21rv1rvlvicklz9.R.inc(2498);if ((((remainder.isEmpty())&&(__CLR4_5_21rv1rvlvicklz9.R.iget(2499)!=0|true))||(__CLR4_5_21rv1rvlvicklz9.R.iget(2500)==0&false))) {{
            __CLR4_5_21rv1rvlvicklz9.R.inc(2501);return namespace;
        }
        }__CLR4_5_21rv1rvlvicklz9.R.inc(2502);return namespace + remainder;
    }finally{__CLR4_5_21rv1rvlvicklz9.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_5_21rv1rvlvicklz9.R.inc(2503);
        __CLR4_5_21rv1rvlvicklz9.R.inc(2504);return namespace.hashCode() + remainder.hashCode();
    }finally{__CLR4_5_21rv1rvlvicklz9.R.flushNeeded();}}

    @Override
    public void accept(@Nonnull OWLAnnotationValueVisitor visitor) {try{__CLR4_5_21rv1rvlvicklz9.R.inc(2505);
        __CLR4_5_21rv1rvlvicklz9.R.inc(2506);visitor.visit(this);
    }finally{__CLR4_5_21rv1rvlvicklz9.R.flushNeeded();}}

    @Override
    public <O> O accept(@Nonnull OWLAnnotationValueVisitorEx<O> visitor) {try{__CLR4_5_21rv1rvlvicklz9.R.inc(2507);
        __CLR4_5_21rv1rvlvicklz9.R.inc(2508);return visitor.visit(this);
    }finally{__CLR4_5_21rv1rvlvicklz9.R.flushNeeded();}}

    @Override
    public Optional<IRI> asIRI() {try{__CLR4_5_21rv1rvlvicklz9.R.inc(2509);
        __CLR4_5_21rv1rvlvicklz9.R.inc(2510);return Optional.of(this);
    }finally{__CLR4_5_21rv1rvlvicklz9.R.flushNeeded();}}

    @Override
    public Optional<OWLAnonymousIndividual> asAnonymousIndividual() {try{__CLR4_5_21rv1rvlvicklz9.R.inc(2511);
        __CLR4_5_21rv1rvlvicklz9.R.inc(2512);return Optional.absent();
    }finally{__CLR4_5_21rv1rvlvicklz9.R.flushNeeded();}}

    @Override
    public Optional<OWLLiteral> asLiteral() {try{__CLR4_5_21rv1rvlvicklz9.R.inc(2513);
        __CLR4_5_21rv1rvlvicklz9.R.inc(2514);return Optional.absent();
    }finally{__CLR4_5_21rv1rvlvicklz9.R.flushNeeded();}}

    @Override
    public boolean isTopEntity() {try{__CLR4_5_21rv1rvlvicklz9.R.inc(2515);
        __CLR4_5_21rv1rvlvicklz9.R.inc(2516);return false;
    }finally{__CLR4_5_21rv1rvlvicklz9.R.flushNeeded();}}

    @Override
    public boolean isBottomEntity() {try{__CLR4_5_21rv1rvlvicklz9.R.inc(2517);
        __CLR4_5_21rv1rvlvicklz9.R.inc(2518);return false;
    }finally{__CLR4_5_21rv1rvlvicklz9.R.flushNeeded();}}

    @Override
    public boolean equals(Object obj) {try{__CLR4_5_21rv1rvlvicklz9.R.inc(2519);
        __CLR4_5_21rv1rvlvicklz9.R.inc(2520);if ((((obj == null)&&(__CLR4_5_21rv1rvlvicklz9.R.iget(2521)!=0|true))||(__CLR4_5_21rv1rvlvicklz9.R.iget(2522)==0&false))) {{
            __CLR4_5_21rv1rvlvicklz9.R.inc(2523);return false;
        }
        }__CLR4_5_21rv1rvlvicklz9.R.inc(2524);if ((((obj == this)&&(__CLR4_5_21rv1rvlvicklz9.R.iget(2525)!=0|true))||(__CLR4_5_21rv1rvlvicklz9.R.iget(2526)==0&false))) {{
            __CLR4_5_21rv1rvlvicklz9.R.inc(2527);return true;
        }
        }__CLR4_5_21rv1rvlvicklz9.R.inc(2528);if ((((!(obj instanceof IRI))&&(__CLR4_5_21rv1rvlvicklz9.R.iget(2529)!=0|true))||(__CLR4_5_21rv1rvlvicklz9.R.iget(2530)==0&false))) {{
            __CLR4_5_21rv1rvlvicklz9.R.inc(2531);return false;
        }
        }__CLR4_5_21rv1rvlvicklz9.R.inc(2532);IRI other = (IRI) obj;
        __CLR4_5_21rv1rvlvicklz9.R.inc(2533);return remainder.equals(other.remainder) && other.namespace.equals(namespace);
    }finally{__CLR4_5_21rv1rvlvicklz9.R.flushNeeded();}}
}
