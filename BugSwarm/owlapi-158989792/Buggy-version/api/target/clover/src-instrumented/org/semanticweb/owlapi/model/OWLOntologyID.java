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

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.base.Optional;

/**
 * An object that identifies an ontology. Since OWL 2, ontologies do not have to
 * have an ontology IRI, or if they have an ontology IRI then they can
 * optionally also have a version IRI. Instances of this OWLOntologyID class
 * bundle identifying information of an ontology together. If an ontology
 * doesn't have an ontology IRI then we say that it is "anonymous".
 * 
 * @author Matthew Horridge, The University of Manchester, Information
 *         Management Group
 * @since 3.0.0
 */
public class OWLOntologyID implements Comparable<OWLOntologyID>, Serializable {public static class __CLR4_5_225c25clvickmrl{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0061\u0070\u0069\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237201267L,8589935092L,2889,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final Logger LOGGER = LoggerFactory.getLogger(OWLOntologyID.class);
    private static final long serialVersionUID = 40000L;
    @Nonnull private static final AtomicInteger COUNTER = new AtomicInteger();
    @Nonnull private static final String ANON_PREFIX = "Anonymous-";
    @Nonnull private Optional<String> internalID = Optional.absent();
    @Nonnull private final Optional<IRI> ontologyIRI;
    @Nonnull private final Optional<IRI> versionIRI;
    private int hashCode;

    /**
     * Constructs an ontology identifier specifiying the ontology IRI and
     * version IRI. Equivalent to OWLOntologyID(Optional
     * 
     * @param iri
     *        The ontology IRI (may be {@code null})
     * @deprecated use the Optional based constructor instead
     */
    @Deprecated
    public OWLOntologyID(IRI iri) {
        this(opt(iri), Optional.<IRI> absent());__CLR4_5_225c25clvickmrl.R.inc(2785);try{__CLR4_5_225c25clvickmrl.R.inc(2784);
    }finally{__CLR4_5_225c25clvickmrl.R.flushNeeded();}}

    /**
     * Constructs an ontology identifier specifiying the ontology IRI and
     * version IRI.
     * 
     * @param iri
     *        The ontology IRI (may be {@code null})
     * @param versionIRI
     *        The version IRI (must be {@code null} if the ontologyIRI is null)
     * @deprecated use the Optional based constructor instead
     */
    @Deprecated
    public OWLOntologyID(IRI iri, IRI versionIRI) {
        this(opt(iri), opt(versionIRI));__CLR4_5_225c25clvickmrl.R.inc(2787);try{__CLR4_5_225c25clvickmrl.R.inc(2786);
    }finally{__CLR4_5_225c25clvickmrl.R.flushNeeded();}}

    @Nonnull
    private static Optional<IRI> opt(@Nullable IRI i) {try{__CLR4_5_225c25clvickmrl.R.inc(2788);
        __CLR4_5_225c25clvickmrl.R.inc(2789);if ((((NodeID.isAnonymousNodeIRI(i) || i == null)&&(__CLR4_5_225c25clvickmrl.R.iget(2790)!=0|true))||(__CLR4_5_225c25clvickmrl.R.iget(2791)==0&false))) {{
            __CLR4_5_225c25clvickmrl.R.inc(2792);return Optional.absent();
        }
        }__CLR4_5_225c25clvickmrl.R.inc(2793);if ((((!i.isAbsolute())&&(__CLR4_5_225c25clvickmrl.R.iget(2794)!=0|true))||(__CLR4_5_225c25clvickmrl.R.iget(2795)==0&false))) {{
            __CLR4_5_225c25clvickmrl.R.inc(2796);LOGGER.error(
                "Ontology IRIs must be absolute; IRI {} is relative and will be made absolute by prefixing urn:absolute: to it",
                i);
            __CLR4_5_225c25clvickmrl.R.inc(2797);return Optional.fromNullable(IRI.create("urn:absolute:" + i));
        }
        }__CLR4_5_225c25clvickmrl.R.inc(2798);return Optional.fromNullable(i);
    }finally{__CLR4_5_225c25clvickmrl.R.flushNeeded();}}

    /**
     * replace an optional with a blank node iri with an absent optional
     * 
     * @param i
     *        Optional to check
     * @return input optional if its iri is not a blank node iri, absent
     *         otherwise
     */
    @Nonnull
    private static Optional<IRI> opt(Optional<IRI> i) {try{__CLR4_5_225c25clvickmrl.R.inc(2799);
        __CLR4_5_225c25clvickmrl.R.inc(2800);if ((((i.isPresent())&&(__CLR4_5_225c25clvickmrl.R.iget(2801)!=0|true))||(__CLR4_5_225c25clvickmrl.R.iget(2802)==0&false))) {{
            __CLR4_5_225c25clvickmrl.R.inc(2803);return opt(i.get());
        }
        }__CLR4_5_225c25clvickmrl.R.inc(2804);return Optional.absent();
    }finally{__CLR4_5_225c25clvickmrl.R.flushNeeded();}}

    @Nonnull
    private static <T> Optional<T> opt(T i) {try{__CLR4_5_225c25clvickmrl.R.inc(2805);
        __CLR4_5_225c25clvickmrl.R.inc(2806);return Optional.fromNullable(i);
    }finally{__CLR4_5_225c25clvickmrl.R.flushNeeded();}}

    /**
     * Constructs an ontology identifier specifiying the ontology IRI and
     * version IRI.
     * 
     * @param iri
     *        The ontology IRI (may be absent)
     * @param version
     *        The version IRI (must be absent if the ontologyIRI is absent)
     */
    public OWLOntologyID(@Nonnull Optional<IRI> iri, @Nonnull Optional<IRI> version) {try{__CLR4_5_225c25clvickmrl.R.inc(2807);
        __CLR4_5_225c25clvickmrl.R.inc(2808);ontologyIRI = opt(iri);
        __CLR4_5_225c25clvickmrl.R.inc(2809);hashCode = 17;
        __CLR4_5_225c25clvickmrl.R.inc(2810);if ((((ontologyIRI.isPresent())&&(__CLR4_5_225c25clvickmrl.R.iget(2811)!=0|true))||(__CLR4_5_225c25clvickmrl.R.iget(2812)==0&false))) {{
            __CLR4_5_225c25clvickmrl.R.inc(2813);hashCode += 37 * ontologyIRI.hashCode();
        } }else {{
            __CLR4_5_225c25clvickmrl.R.inc(2814);internalID = opt(ANON_PREFIX + COUNTER.getAndIncrement());
            __CLR4_5_225c25clvickmrl.R.inc(2815);hashCode += 37 * internalID.hashCode();
        }
        }__CLR4_5_225c25clvickmrl.R.inc(2816);versionIRI = opt(version);
        __CLR4_5_225c25clvickmrl.R.inc(2817);if ((((versionIRI.isPresent())&&(__CLR4_5_225c25clvickmrl.R.iget(2818)!=0|true))||(__CLR4_5_225c25clvickmrl.R.iget(2819)==0&false))) {{
            __CLR4_5_225c25clvickmrl.R.inc(2820);if ((((!ontologyIRI.isPresent())&&(__CLR4_5_225c25clvickmrl.R.iget(2821)!=0|true))||(__CLR4_5_225c25clvickmrl.R.iget(2822)==0&false))) {{
                __CLR4_5_225c25clvickmrl.R.inc(2823);throw new IllegalArgumentException(
                    "If the ontology IRI is null then it is not possible to specify a version IRI");
            }
            }__CLR4_5_225c25clvickmrl.R.inc(2824);hashCode += 37 * versionIRI.hashCode();
        }
    }}finally{__CLR4_5_225c25clvickmrl.R.flushNeeded();}}

    /**
     * Constructs an ontology identifier specifying that the ontology IRI (and
     * hence the version IRI) is not present.
     */
    public OWLOntologyID() {
        this(Optional.<IRI> absent(), Optional.<IRI> absent());__CLR4_5_225c25clvickmrl.R.inc(2826);try{__CLR4_5_225c25clvickmrl.R.inc(2825);
    }finally{__CLR4_5_225c25clvickmrl.R.flushNeeded();}}

    /**
     * Determines if this is a valid OWL 2 DL ontology ID. To be a valid OWL 2
     * DL ID, the ontology IRI and version IRI must not be reserved vocabulary.
     * 
     * @return {@code true} if this is a valid OWL 2 DL ontology ID, otherwise
     *         {@code false}
     * @see org.semanticweb.owlapi.model.IRI#isReservedVocabulary()
     */
    public boolean isOWL2DLOntologyID() {try{__CLR4_5_225c25clvickmrl.R.inc(2827);
        __CLR4_5_225c25clvickmrl.R.inc(2828);return !ontologyIRI.isPresent() || !ontologyIRI.get().isReservedVocabulary() && (!versionIRI.isPresent()
            || !versionIRI.get().isReservedVocabulary());
    }finally{__CLR4_5_225c25clvickmrl.R.flushNeeded();}}

    @Override
    public int compareTo(OWLOntologyID o) {try{__CLR4_5_225c25clvickmrl.R.inc(2829);
        __CLR4_5_225c25clvickmrl.R.inc(2830);return toString().compareTo(o.toString());
    }finally{__CLR4_5_225c25clvickmrl.R.flushNeeded();}}

    /**
     * Gets the ontology IRI. If the ontology is anonymous, it will return an
     * absent Optional (i.e., getOntologyIRI().isPresent() will return false.
     * 
     * @return Optional of the ontology IRI, or Optional.absent if there is no
     *         ontology IRI.
     */
    @Nonnull
    public Optional<IRI> getOntologyIRI() {try{__CLR4_5_225c25clvickmrl.R.inc(2831);
        __CLR4_5_225c25clvickmrl.R.inc(2832);return ontologyIRI;
    }finally{__CLR4_5_225c25clvickmrl.R.flushNeeded();}}

    /**
     * Gets the version IRI.
     * 
     * @return an optional of the version IRI, or Optional.absent if there is no
     *         version IRI.
     */
    @Nonnull
    public Optional<IRI> getVersionIRI() {try{__CLR4_5_225c25clvickmrl.R.inc(2833);
        __CLR4_5_225c25clvickmrl.R.inc(2834);return versionIRI;
    }finally{__CLR4_5_225c25clvickmrl.R.flushNeeded();}}

    /**
     * Gets the IRI which is used as a default for the document that contain a
     * representation of an ontology with this ID. This will be the version IRI
     * if there is an ontology IRI and version IRI, else it will be the ontology
     * IRI if there is an ontology IRI but no version IRI, else it will be
     * {@code null} if there is no ontology IRI. See
     * <a href="http://www.w3.org/TR/owl2-syntax/#Ontology_Documents">Ontology
     * Documents</a> in the OWL 2 Structural Specification.
     * 
     * @return An Optional of the IRI that can be used as a default for an
     *         ontology document containing an ontology as identified by this
     *         ontology ID. Returns the default IRI or an Optional.absent.
     */
    @Nonnull
    public Optional<IRI> getDefaultDocumentIRI() {try{__CLR4_5_225c25clvickmrl.R.inc(2835);
        __CLR4_5_225c25clvickmrl.R.inc(2836);if ((((ontologyIRI.isPresent())&&(__CLR4_5_225c25clvickmrl.R.iget(2837)!=0|true))||(__CLR4_5_225c25clvickmrl.R.iget(2838)==0&false))) {{
            __CLR4_5_225c25clvickmrl.R.inc(2839);if ((((versionIRI.isPresent())&&(__CLR4_5_225c25clvickmrl.R.iget(2840)!=0|true))||(__CLR4_5_225c25clvickmrl.R.iget(2841)==0&false))) {{
                __CLR4_5_225c25clvickmrl.R.inc(2842);return versionIRI;
            } }else {{
                __CLR4_5_225c25clvickmrl.R.inc(2843);return ontologyIRI;
            }
        }} }else {{
            __CLR4_5_225c25clvickmrl.R.inc(2844);return Optional.absent();
        }
    }}finally{__CLR4_5_225c25clvickmrl.R.flushNeeded();}}

    /**
     * Determines if this ID names an ontology or whether it is an ID for an
     * ontology without an IRI. If the result of this method is true,
     * getOntologyIRI() will return an Optional.absent.
     * 
     * @return {@code true} if this ID is an ID for an ontology without an IRI,
     *         or {@code false} if this ID is an ID for an ontology with an IRI.
     */
    public boolean isAnonymous() {try{__CLR4_5_225c25clvickmrl.R.inc(2845);
        __CLR4_5_225c25clvickmrl.R.inc(2846);return !ontologyIRI.isPresent();
    }finally{__CLR4_5_225c25clvickmrl.R.flushNeeded();}}

    @Nonnull
    @Override
    public String toString() {try{__CLR4_5_225c25clvickmrl.R.inc(2847);
        __CLR4_5_225c25clvickmrl.R.inc(2848);if ((((ontologyIRI.isPresent())&&(__CLR4_5_225c25clvickmrl.R.iget(2849)!=0|true))||(__CLR4_5_225c25clvickmrl.R.iget(2850)==0&false))) {{
            __CLR4_5_225c25clvickmrl.R.inc(2851);String template = "OntologyID(OntologyIRI(<%s>) VersionIRI(<%s>))";
            __CLR4_5_225c25clvickmrl.R.inc(2852);return String.format(template, ontologyIRI.get(), versionIRI.orNull());
        }
        }__CLR4_5_225c25clvickmrl.R.inc(2853);return "OntologyID(" + internalID.orNull() + ')';
    }finally{__CLR4_5_225c25clvickmrl.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_5_225c25clvickmrl.R.inc(2854);
        __CLR4_5_225c25clvickmrl.R.inc(2855);return hashCode;
    }finally{__CLR4_5_225c25clvickmrl.R.flushNeeded();}}

    @Override
    public boolean equals(Object obj) {try{__CLR4_5_225c25clvickmrl.R.inc(2856);
        __CLR4_5_225c25clvickmrl.R.inc(2857);if ((((obj == null)&&(__CLR4_5_225c25clvickmrl.R.iget(2858)!=0|true))||(__CLR4_5_225c25clvickmrl.R.iget(2859)==0&false))) {{
            __CLR4_5_225c25clvickmrl.R.inc(2860);return false;
        }
        }__CLR4_5_225c25clvickmrl.R.inc(2861);if ((((obj == this)&&(__CLR4_5_225c25clvickmrl.R.iget(2862)!=0|true))||(__CLR4_5_225c25clvickmrl.R.iget(2863)==0&false))) {{
            __CLR4_5_225c25clvickmrl.R.inc(2864);return true;
        }
        }__CLR4_5_225c25clvickmrl.R.inc(2865);if ((((!(obj instanceof OWLOntologyID))&&(__CLR4_5_225c25clvickmrl.R.iget(2866)!=0|true))||(__CLR4_5_225c25clvickmrl.R.iget(2867)==0&false))) {{
            __CLR4_5_225c25clvickmrl.R.inc(2868);return false;
        }
        }__CLR4_5_225c25clvickmrl.R.inc(2869);OWLOntologyID other = (OWLOntologyID) obj;
        __CLR4_5_225c25clvickmrl.R.inc(2870);if ((((isAnonymous() && other.isAnonymous())&&(__CLR4_5_225c25clvickmrl.R.iget(2871)!=0|true))||(__CLR4_5_225c25clvickmrl.R.iget(2872)==0&false))) {{
            // both anonymous: check the anon version
            __CLR4_5_225c25clvickmrl.R.inc(2873);return internalID.equals(other.internalID);
        }
        }__CLR4_5_225c25clvickmrl.R.inc(2874);if ((((isAnonymous() != other.isAnonymous())&&(__CLR4_5_225c25clvickmrl.R.iget(2875)!=0|true))||(__CLR4_5_225c25clvickmrl.R.iget(2876)==0&false))) {{
            // one anonymous, one not: equals is false
            __CLR4_5_225c25clvickmrl.R.inc(2877);return false;
        }
        }__CLR4_5_225c25clvickmrl.R.inc(2878);if ((((!isAnonymous())&&(__CLR4_5_225c25clvickmrl.R.iget(2879)!=0|true))||(__CLR4_5_225c25clvickmrl.R.iget(2880)==0&false))) {{
            __CLR4_5_225c25clvickmrl.R.inc(2881);boolean toReturn = ontologyIRI.equals(other.ontologyIRI);
            __CLR4_5_225c25clvickmrl.R.inc(2882);if ((((!toReturn)&&(__CLR4_5_225c25clvickmrl.R.iget(2883)!=0|true))||(__CLR4_5_225c25clvickmrl.R.iget(2884)==0&false))) {{
                __CLR4_5_225c25clvickmrl.R.inc(2885);return toReturn;
            }
            // if toReturn is true, compare the version iris
            }__CLR4_5_225c25clvickmrl.R.inc(2886);toReturn = versionIRI.equals(other.versionIRI);
            __CLR4_5_225c25clvickmrl.R.inc(2887);return toReturn;
        }
        // else this is anonymous and the other cannot be anonymous, so return
        // false
        }__CLR4_5_225c25clvickmrl.R.inc(2888);return false;
    }finally{__CLR4_5_225c25clvickmrl.R.flushNeeded();}}
}
