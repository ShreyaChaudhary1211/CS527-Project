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
package org.semanticweb.owlapi.vocab;

import static org.semanticweb.owlapi.vocab.Namespaces.BuiltIn.*;
import static org.semanticweb.owlapi.vocab.Namespaces.Status.IN_USE;

import java.util.EnumSet;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.model.IRI;

/**
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.0.0
 */
public enum Namespaces {
    //@formatter:off
    // OWL2XML("http://www.w3.org/2006/12/owl2-xml#"),
    /** The OWL 2 namespace. */    OWL2        ("owl2",     "http://www.w3.org/2006/12/owl2#",      Status.LEGACY),
    /** Status.LEGACY. */          OWL11XML    ("owl11xml", "http://www.w3.org/2006/12/owl11-xml#", Status.LEGACY),
    /** The OWL 1.1 namespace. */  OWL11       ("owl11",    "http://www.w3.org/2006/12/owl11#",     Status.LEGACY),
    /**The OWL namespace. */       OWL         ("owl",      "http://www.w3.org/2002/07/owl#", IN_USE),
    /**The RDFS namespace. */      RDFS        ("rdfs",     "http://www.w3.org/2000/01/rdf-schema#", IN_USE),
    /** The RDF namespace. */      RDF         ("rdf",      "http://www.w3.org/1999/02/22-rdf-syntax-ns#", IN_USE),
    /** The XSD namespace. */      XSD         ("xsd",      "http://www.w3.org/2001/XMLSchema#",           IN_USE),
    /** The XML namespace. */      XML         ("xml",      "http://www.w3.org/XML/1998/namespace"),
    /** The SWRL namespace. */     SWRL        ("swrl",     "http://www.w3.org/2003/11/swrl#"),
    /** The SWRLB namespace. */    SWRLB       ("swrlb",    "http://www.w3.org/2003/11/swrlb#"),
    /** The SKOS namespace. */     SKOS        ("skos",     "http://www.w3.org/2004/02/skos/core#"),

    // Further namespaces from the RDFa Core Initial Context
    // http://www.w3.org/2011/rdfa-context/rdfa-1.1
    /** The GRDDL namespace. */    GRDDL       ("grddl",    "http://www.w3.org/2003/g/data-view#"),
    /** The MA namespace. */       MA          ("ma",       "http://www.w3.org/ns/ma-ont#"),
    /** The PROV namespace. */     PROV        ("prov",     "http://www.w3.org/ns/prov#"),
    /** The RDFA namespace. */     RDFA        ("rdfa",     "http://www.w3.org/ns/rdfa#"),
    /** The RIF namespace. */      RIF         ("rif",      "http://www.w3.org/2007/rif#"),
    /** The R2RML namespace. */    R2RML       ("rr",       "http://www.w3.org/ns/r2rml#"),
    /** The SD namespace. */       SD          ("sd",       "http://www.w3.org/ns/sparql-service-description#"),
    /** The SKOSXL namespace. */   SKOSXL      ("skosxl",   "http://www.w3.org/2008/05/skos-xl#"),
    /** The POWDER namespace. */   POWDER      ("wdr",      "http://www.w3.org/2007/05/powder#"),
    /** The VOID namespace. */     VOID        ("void",     "http://rdfs.org/ns/void#"),
    /** The POWDERS namespace. */  POWDERS     ("wdrs",     "http://www.w3.org/2007/05/powder-s#"),
    /** The XHV namespace. */      XHV         ("xhv",      "http://www.w3.org/1999/xhtml/vocab#"),
    /** The ORG namespace. */      ORG         ("org",      "http://www.w3.org/ns/org#"),
    /** The GLDP namespace. */     GLDP        ("gldp",     "http://www.w3.org/ns/people#"),
    /** The CNT namespace. */      CNT         ("cnt",      "http://www.w3.org/2008/content#"),
    /** The DCAT namespace. */     DCAT        ("dcat",     "http://www.w3.org/ns/dcat#"),
    /** The EARL namespace. */     EARL        ("earl",     "http://www.w3.org/ns/earl#"),
    /** The HT namespace. */       HT          ("ht",       "http://www.w3.org/2006/http#"),
    /** The PTR namespace. */      PTR         ("ptr",      "http://www.w3.org/2009/pointers#"),

    // Other widely used Semantic Web prefixes
    /** The CC namespace. */       CC          ("cc",       "http://creativecommons.org/ns#"),
    /** The CTAG namespace. */     CTAG        ("ctag",     "http://commontag.org/ns#"),
    /** The DCTERMS namespace. */  DCTERMS     ("dcterms",  "http://purl.org/dc/terms/"),
    /** The DC namespace. */       DC          ("dc",       "http://purl.org/dc/elements/1.1/"),
    /** The FOAF namespace. */     FOAF        ("foaf",     "http://xmlns.com/foaf/0.1/"),
    /** The GR namespace. */       GR          ("gr",       "http://purl.org/goodrelations/v1#"),
    /** The ICAL namespace. */     ICAL        ("ical",     "http://www.w3.org/2002/12/cal/icaltzd#"),
    /** The OG namespace. */       OG          ("og",       "http://ogp.me/ns#"),
    /** The REV namespace. */      REV         ("rev",      "http://purl.org/stuff/rev#"),
    /** The SIOC namespace. */     SIOC        ("sioc",     "http://rdfs.org/sioc/ns#"),
    /** The VCARD namespace. */    VCARD       ("vcard",    "http://www.w3.org/2006/vcard/ns#"),
    /** The SCHEMA namespace. */   SCHEMA      ("schema",   "http://schema.org/"),
    /** The GEO namespace. */      GEO         ("geo",      "http://www.w3.org/2003/01/geo/wgs84_pos#"),
    /** The SC namespace. */       SC          ("sc",       "http://purl.org/science/owl/sciencecommons/"),
    /** The FB namespace. */       FB          ("fb",       "http://rdf.freebase.com/ns/",                 Status.LEGACY),
    /** The GEONAMES namespace. */ GEONAMES    ("geonames", "http://www.geonames.org/ontology#",           Status.LEGACY),

    // DBpedia
    /** The DBPEDIA namespace. */  DBPEDIA     ("dbpedia", "http://dbpedia.org/resource/"),
    /** The DBP namespace. */      DBP         ("dbp",     "http://dbpedia.org/property/"),
    /** The DBO namespace. */      DBO         ("dbo",     "http://dbpedia.org/ontology/"),
    /** The YAGO namespace. */     YAGO        ("yago",    "http://dbpedia.org/class/yago/");
    //@formatter:on
    @Nonnull
    final String prefix;
    @Nonnull
    final String ns;
    final Status status;
    final BuiltIn builtIn;
    final String hashless;

    Namespaces(@Nonnull String prefix, @Nonnull String ns) {
        this(prefix, ns, IN_USE, NOT_BUILT_IN);__CLR4_5_2c6sc6slvickse0.R.inc(15797);try{__CLR4_5_2c6sc6slvickse0.R.inc(15796);
    }finally{__CLR4_5_2c6sc6slvickse0.R.flushNeeded();}}

    Namespaces(@Nonnull String prefix, @Nonnull String ns, Status status) {
        this(prefix, ns, status, (((status == Status.LEGACY )&&(__CLR4_5_2c6sc6slvickse0.R.iget(15799)!=0|true))||(__CLR4_5_2c6sc6slvickse0.R.iget(15800)==0&false))? NOT_BUILT_IN
                : BUILT_IN);__CLR4_5_2c6sc6slvickse0.R.inc(15801);try{__CLR4_5_2c6sc6slvickse0.R.inc(15798);
    }finally{__CLR4_5_2c6sc6slvickse0.R.flushNeeded();}}

    Namespaces(@Nonnull String prefix, @Nonnull String ns, Status status,
            BuiltIn builtIn) {try{__CLR4_5_2c6sc6slvickse0.R.inc(15802);
        __CLR4_5_2c6sc6slvickse0.R.inc(15803);this.prefix = prefix;
        __CLR4_5_2c6sc6slvickse0.R.inc(15804);this.ns = ns;
        __CLR4_5_2c6sc6slvickse0.R.inc(15805);this.status = status;
        __CLR4_5_2c6sc6slvickse0.R.inc(15806);this.builtIn = builtIn;
        __CLR4_5_2c6sc6slvickse0.R.inc(15807);hashless = hashless(prefix);
    }finally{__CLR4_5_2c6sc6slvickse0.R.flushNeeded();}}

    /**
     * @return A short, human-readable, prefix name that matches, and expands to
     *         the full IRI. Not {@code null}.
     */
    @Nonnull
    public String getPrefixName() {try{__CLR4_5_2c6sc6slvickse0.R.inc(15808);
        __CLR4_5_2c6sc6slvickse0.R.inc(15809);return prefix;
    }finally{__CLR4_5_2c6sc6slvickse0.R.flushNeeded();}}

    /** @return The prefix IRI which matches the prefix name. Not {@code null}. */
    @Nonnull
    public String getPrefixIRI() {try{__CLR4_5_2c6sc6slvickse0.R.inc(15810);
        __CLR4_5_2c6sc6slvickse0.R.inc(15811);return ns;
    }finally{__CLR4_5_2c6sc6slvickse0.R.flushNeeded();}}

    /**
     * @return {@code true} if this namespace is not obsolete and is currently
     *         in active use, otherwise {@code false}.
     */
    public boolean isInUse() {try{__CLR4_5_2c6sc6slvickse0.R.inc(15812);
        __CLR4_5_2c6sc6slvickse0.R.inc(15813);return status == IN_USE;
    }finally{__CLR4_5_2c6sc6slvickse0.R.flushNeeded();}}

    /**
     * @return {@code true} if this namespace is defined as a core part of the
     *         OWL-2 specification, otherwise {@code false}.
     */
    public boolean isBuiltIn() {try{__CLR4_5_2c6sc6slvickse0.R.inc(15814);
        __CLR4_5_2c6sc6slvickse0.R.inc(15815);return builtIn == BUILT_IN;
    }finally{__CLR4_5_2c6sc6slvickse0.R.flushNeeded();}}

    /**
     * @param ns
     *        namespace
     * @return this namespace without hash or slash at the end
     */
    private static String hashless(@Nonnull String ns) {try{__CLR4_5_2c6sc6slvickse0.R.inc(15816);
        __CLR4_5_2c6sc6slvickse0.R.inc(15817);int index = ns.length() - 1;
        __CLR4_5_2c6sc6slvickse0.R.inc(15818);if ((((ns.charAt(index) == '/' || ns.charAt(index) == '#')&&(__CLR4_5_2c6sc6slvickse0.R.iget(15819)!=0|true))||(__CLR4_5_2c6sc6slvickse0.R.iget(15820)==0&false))) {{
            __CLR4_5_2c6sc6slvickse0.R.inc(15821);return ns.substring(0, index);
        }
        }__CLR4_5_2c6sc6slvickse0.R.inc(15822);return ns;
    }finally{__CLR4_5_2c6sc6slvickse0.R.flushNeeded();}}

    /** ignored imports */
    public static final EnumSet<Namespaces> defaultIgnoredImports = EnumSet.of(
            OWL, RDF, RDFS, SWRL, SWRLB, XML, XSD);

    /**
     * @param i
     *        the iri to check
     * @return true if the iri is for a namespace ignored by default
     */
    public static boolean isDefaultIgnoredImport(IRI i) {try{__CLR4_5_2c6sc6slvickse0.R.inc(15823);
        __CLR4_5_2c6sc6slvickse0.R.inc(15824);for (Namespaces n : defaultIgnoredImports) {{
            __CLR4_5_2c6sc6slvickse0.R.inc(15825);if ((((n.hashless.equals(i.toString()))&&(__CLR4_5_2c6sc6slvickse0.R.iget(15826)!=0|true))||(__CLR4_5_2c6sc6slvickse0.R.iget(15827)==0&false))) {{
                __CLR4_5_2c6sc6slvickse0.R.inc(15828);return true;
            }
        }}
        }__CLR4_5_2c6sc6slvickse0.R.inc(15829);return false;
    }finally{__CLR4_5_2c6sc6slvickse0.R.flushNeeded();}}

    /**
     * @param i
     *        the stirng to check
     * @return true if the string is for a namespace ignored by default
     */
    public static boolean isDefaultIgnoredImport(String i) {try{__CLR4_5_2c6sc6slvickse0.R.inc(15830);
        __CLR4_5_2c6sc6slvickse0.R.inc(15831);for (Namespaces n : defaultIgnoredImports) {{
            __CLR4_5_2c6sc6slvickse0.R.inc(15832);if ((((n.hashless.equals(i))&&(__CLR4_5_2c6sc6slvickse0.R.iget(15833)!=0|true))||(__CLR4_5_2c6sc6slvickse0.R.iget(15834)==0&false))) {{
                __CLR4_5_2c6sc6slvickse0.R.inc(15835);return true;
            }
        }}
        }__CLR4_5_2c6sc6slvickse0.R.inc(15836);return false;
    }finally{__CLR4_5_2c6sc6slvickse0.R.flushNeeded();}}

    @Nonnull
    @Override
    public String toString() {try{__CLR4_5_2c6sc6slvickse0.R.inc(15837);
        __CLR4_5_2c6sc6slvickse0.R.inc(15838);return ns;
    }finally{__CLR4_5_2c6sc6slvickse0.R.flushNeeded();}}

    /**
     * @param s
     *        string to check
     * @return true if s equals this namespace
     */
    public boolean inNamespace(String s) {try{__CLR4_5_2c6sc6slvickse0.R.inc(15839);
        __CLR4_5_2c6sc6slvickse0.R.inc(15840);return ns.equals(s);
    }finally{__CLR4_5_2c6sc6slvickse0.R.flushNeeded();}}

    /**
     * @param i
     *        iri to check
     * @return true if the namespace for i equals this namespace
     */
    public boolean inNamespace(IRI i) {try{__CLR4_5_2c6sc6slvickse0.R.inc(15841);
        __CLR4_5_2c6sc6slvickse0.R.inc(15842);return ns.equals(i.getNamespace());
    }finally{__CLR4_5_2c6sc6slvickse0.R.flushNeeded();}}

    /**
     * Indicates that a prefix is builtin - i.e. that it is either owl, rdf,
     * rdfs, or xsd
     */
    public enum BuiltIn {
        /** built in flag. */
        BUILT_IN,
        /** not built in flag. */
        NOT_BUILT_IN
    }

    /** Indicates whether a prefix is a legacy prefix or not. */
    public enum Status {
        /** legacy flag. */
        LEGACY,
        /** in use flag. */
        IN_USE
    }
;public static class __CLR4_5_2c6sc6slvickse0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0061\u0070\u0069\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237201267L,8589935092L,15843,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;}
