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

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/**
 * The vocabulary that the Manchester OWL Syntax uses.
 * 
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.0.0
 */
public enum ManchesterOWLSyntax {










    //@formatter:off
    
//    public static final String VALUE_PARTITION = "ValuePartition:";
//    public static final String INSTANCES = "Instances:";
    
    /** VALUE_PARTITION             */   VALUE_PARTITION             ("ValuePartition",            false, false, false, false, false),
    /** DASH                        */   DASH                        ("-",                         false, false, false, false, false, "-"),
    /** OPEN                        */   OPEN                        ("(",                         false, false, false, false, false, "("),
    /** CLOSE                       */   CLOSE                       (")",                         false, false, false, false, false, ")"),
    /** OPENBRACE                   */   OPENBRACE                   ("{",                         false, false, false, false, false, "{"),
    /** CLOSEBRACE                  */   CLOSEBRACE                  ("}",                         false, false, false, false, false, "}"),
    /** OPENBRACKET                 */   OPENBRACKET                 ("[",                         false, false, false, false, false, "["),
    /** CLOSEBRACKET                */   CLOSEBRACKET                ("]",                         false, false, false, false, false, "]"),    
    /** ONTOLOGY                    */   ONTOLOGY                    ("Ontology",                  false, false, false, false, false),
    /** IMPORT                      */   IMPORT                      ("Import",                    false, true,  true,  false, false),
    /** PREFIX                      */   PREFIX                      ("Prefix",                    false, false, false, false, false),
    /** CLASS                       */   CLASS                       ("Class",                     true,  true,  false, false, false),
    /** OBJECT_PROPERTY             */   OBJECT_PROPERTY             ("ObjectProperty",            true,  true,  false, false, false),
    /** CHAIN_IMPLY                 */   CHAIN_IMPLY                 ("->",                        true,  true,  false, false, false, "->"),
    /** CHAIN_CONNECT               */   CHAIN_CONNECT               ("o",                         true,  true,  false, false, false, "o"),
    /** DATA_PROPERTY               */   DATA_PROPERTY               ("DataProperty",              true,  true,  false, false, false),
    /** INDIVIDUAL                  */   INDIVIDUAL                  ("Individual",                true,  true,  false, false, false),
    /** DATATYPE                    */   DATATYPE                    ("Datatype",                  true,  true,  false, false, false),
    /** ANNOTATION_PROPERTY         */   ANNOTATION_PROPERTY         ("AnnotationProperty",        true,  true,  false, false, false),
    /** SOME                        */   SOME                        ("some",                      false, false, false, true,  false, "some"),
    /** ONLY                        */   ONLY                        ("only",                      false, false, false, true,  false, "only"),
    /** ONLYSOME                    */   ONLYSOME                    ("onlysome",                  false, false, false, true,  false, "onlysome"),
    /** MIN                         */   MIN                         ("min",                       false, false, false, true,  false, "min"),
    /** MAX                         */   MAX                         ("max",                       false, false, false, true,  false, "max"),
    /** EXACTLY                     */   EXACTLY                     ("exactly",                   false, false, false, true,  false, "exactly"),
    /** VALUE                       */   VALUE                       ("value",                     false, false, false, true,  false, "value"),
    /** AND                         */   AND                         ("and",                       false, false, false, false, true,  "and"),
    /** OR                          */   OR                          ("or",                        false, false, false, false, true,  "or"),
    /** NOT                         */   NOT                         ("not",                       false, false, false, false, true,  "not"),
    /** INVERSE                     */   INVERSE                     ("inverse",                   false, false, true,  false, false, "inverse"),
    /** INV                         */   INV                         ("inv",                       false, false, true,  false, false, "inv"),
    /** SELF                        */   SELF                        ("Self",                      false, false, false, true,  false, "Self"),
    /** THAT                        */   THAT                        ("that",                      false, false, false, false, true, "that"),
    /** FACET_RESTRICTION_SEPARATOR */   FACET_RESTRICTION_SEPARATOR (",",                         false, false, false, false, false),
    /** SUBCLASS_OF                 */   SUBCLASS_OF                 ("SubClassOf",                false, true,  true,  false, false),
    /** SUPERCLASS_OF               */   SUPERCLASS_OF               ("SuperClassOf",              false, true,  true,  false, false),
    /** EQUIVALENT_TO               */   EQUIVALENT_TO               ("EquivalentTo",              false, true,  true,  false, false),
    /** EQUIVALENT_CLASSES          */   EQUIVALENT_CLASSES          ("EquivalentClasses",         false, true,  true,  false, false),
    /** EQUIVALENT_PROPERTIES       */   EQUIVALENT_PROPERTIES       ("EquivalentProperties",      false, true,  true,  false, false),
    /** DISJOINT_WITH               */   DISJOINT_WITH               ("DisjointWith",              false, true,  true,  false, false),
    /** INDIVIDUALS                 */   INDIVIDUALS                 ("Individuals",               false, true,  true,  false, false),
    /** DISJOINT_CLASSES            */   DISJOINT_CLASSES            ("DisjointClasses",           true,  true,  true,  false, false),
    /** DISJOINT_PROPERTIES         */   DISJOINT_PROPERTIES         ("DisjointProperties",        true,  false, true,  false, false),
    /** DISJOINT_UNION_OF           */   DISJOINT_UNION_OF           ("DisjointUnionOf",           false, true,  true,  false, false),
    /** FACTS                       */   FACTS                       ("Facts",                     false, true,  false, false, false),
    /** SAME_AS                     */   SAME_AS                     ("SameAs",                    false, true,  true,  false, false),
    /** SAME_INDIVIDUAL             */   SAME_INDIVIDUAL             ("SameIndividual",            false, true,  true,  false, false),
    /** DIFFERENT_FROM              */   DIFFERENT_FROM              ("DifferentFrom",             false, true,  true,  false, false),
    /** DIFFERENT_INDIVIDUALS       */   DIFFERENT_INDIVIDUALS       ("DifferentIndividuals",      true,  true,  true,  false, false),
    /** MIN_INCLUSIVE_FACET         */   MIN_INCLUSIVE_FACET         (">=",                        false, false, false, false, false),
    /** MAX_INCLUSIVE_FACET         */   MAX_INCLUSIVE_FACET         ("<=",                        false, false, false, false, false),
    /** MIN_EXCLUSIVE_FACET         */   MIN_EXCLUSIVE_FACET         (">",                         false, false, false, false, false),
    /** MAX_EXCLUSIVE_FACET         */   MAX_EXCLUSIVE_FACET         ("<",                         false, false, false, false, false),
    /** ONE_OF_DELIMETER            */   ONE_OF_DELIMETER            (",",                         false, false, false, false, false),
    /** TYPES                       */   TYPES                       ("Types",                     false, true,  true,  false, false),
    /** TYPE                        */   TYPE                        ("Type",                      false, true,  true,  false, false),
    /** ANNOTATIONS                 */   ANNOTATIONS                 ("Annotations",               false, true,  false, false, false),
    /** COMMA                       */   COMMA                       (",",                         false, false, false, false, false, ","),
    /** DOMAIN                      */   DOMAIN                      ("Domain",                    false, true,  true,  false, false),
    /** RANGE                       */   RANGE                       ("Range",                     false, true,  true,  false, false),
    /** CHARACTERISTICS             */   CHARACTERISTICS             ("Characteristics",           false, true,  false, false, false),
    /** FUNCTIONAL                  */   FUNCTIONAL                  ("Functional",                false, false, true,  false, false, "Functional"),
    /** INVERSE_FUNCTIONAL          */   INVERSE_FUNCTIONAL          ("InverseFunctional",         false, false, true,  false, false, "InverseFunctional"),
    /** SYMMETRIC                   */   SYMMETRIC                   ("Symmetric",                 false, false, true,  false, false, "Symmetric"),
    /** TRANSITIVE                  */   TRANSITIVE                  ("Transitive",                false, false, true,  false, false, "Transitive"),
    /** REFLEXIVE                   */   REFLEXIVE                   ("Reflexive",                 false, false, true,  false, false, "Reflexive"),
    /** IRREFLEXIVE                 */   IRREFLEXIVE                 ("Irreflexive",               false, false, true,  false, false, "Irreflexive"),
    /** LITERAL_TRUE                */   LITERAL_TRUE                ("true",                      false, false, false, false, false, "true"),
    /** LITERAL_FALSE               */   LITERAL_FALSE               ("false",                     false, false, false, false, false, "false"),
    /** LITERAL_INTEGER             */   LITERAL_INTEGER             ("$integer$",                 false, false, false, false, false, "$integer$"),
    /** LITERAL_FLOAT               */   LITERAL_FLOAT               ("$float$",                   false, false, false, false, false, "$float$"),
    /** LITERAL_DOUBLE              */   LITERAL_DOUBLE              ("$double$",                  false, false, false, false, false, "$double$"),
    /** LITERAL_LITERAL             */   LITERAL_LITERAL             ("\"$Literal$\"",             false, false, false, false, false, "\"$Literal$\""),
    /** LITERAL_LIT_DATATYPE        */   LITERAL_LIT_DATATYPE        ("\"$Literal$\"^^<datatype>", false, false, false, false, false, "\"$Literal$\"^^<datatype>"),
    /** LITERAL_LIT_LANG            */   LITERAL_LIT_LANG            ("\"$Literal$\"@<lang>",      false, false, false, false, false, "\"$Literal$\"@<lang>"),
    /** For legacy reasons. */                                 
    /**ANTI_SYMMETRIC              */    ANTI_SYMMETRIC              ("AntiSymmetric",             false, false, true,  false, false, "AntiSymmetric"),
    /**ASYMMETRIC                  */    ASYMMETRIC                  ("Asymmetric",                false, false, true,  false, false, "Asymmetric"),
    /**INVERSE_OF                  */    INVERSE_OF                  ("InverseOf",                 false, true,  true,  false, false),
    /**INVERSES                    */    INVERSES                    ("Inverses",                  false, true,  false, false, false),
    /**SUB_PROPERTY_OF             */    SUB_PROPERTY_OF             ("SubPropertyOf",             false, true,  true,  false, false),
    /**SUPER_PROPERTY_OF           */    SUPER_PROPERTY_OF           ("SuperPropertyOf",           false, true,  true,  false, false),
    /**SUB_PROPERTY_CHAIN          */    SUB_PROPERTY_CHAIN          ("SubPropertyChain",          false, true,  true,  false, false),
    /**HAS_KEY                     */    HAS_KEY                     ("HasKey",                    false, true,  false, false, false),
    /**RULE                        */    RULE                        ("Rule",                      true,  true,  false, false, false);

    //@formatter:on
    private final boolean frameKeyword;
    private final boolean sectionKeyword;
    private final boolean axiomKeyword;
    private final boolean classExpressionQuantiferKeyword;
    private final boolean classExpressionConnectiveKeyword;
    @Nonnull
    private final String rendering;
    @Nonnull
    private final String keyword;

    ManchesterOWLSyntax(@Nonnull String rendering, boolean frameKeyword,
            boolean sectionKeyword, boolean axiomKeyword,
            boolean classExpressionQuantifierKeyword,
            boolean classExpressionConnectiveKeyword, @Nonnull String keyword) {try{__CLR4_5_2hobhoblvicmbjz.R.inc(22907);
        __CLR4_5_2hobhoblvicmbjz.R.inc(22908);this.rendering = rendering;
        __CLR4_5_2hobhoblvicmbjz.R.inc(22909);this.frameKeyword = frameKeyword;
        __CLR4_5_2hobhoblvicmbjz.R.inc(22910);this.sectionKeyword = sectionKeyword;
        __CLR4_5_2hobhoblvicmbjz.R.inc(22911);this.axiomKeyword = axiomKeyword;
        __CLR4_5_2hobhoblvicmbjz.R.inc(22912);this.classExpressionConnectiveKeyword = classExpressionConnectiveKeyword;
        __CLR4_5_2hobhoblvicmbjz.R.inc(22913);classExpressionQuantiferKeyword = classExpressionQuantifierKeyword;
        __CLR4_5_2hobhoblvicmbjz.R.inc(22914);this.keyword = keyword;
    }finally{__CLR4_5_2hobhoblvicmbjz.R.flushNeeded();}}

    ManchesterOWLSyntax(@Nonnull String rendering, boolean frameKeyword,
            boolean sectionKeyword, boolean axiomKeyword,
            boolean classExpressionQuantifierKeyword,
            boolean classExpressionConnectiveKeyword) {
        this(rendering, frameKeyword, sectionKeyword, axiomKeyword,
                classExpressionQuantifierKeyword,
                classExpressionConnectiveKeyword, rendering + ':');__CLR4_5_2hobhoblvicmbjz.R.inc(22916);try{__CLR4_5_2hobhoblvicmbjz.R.inc(22915);
    }finally{__CLR4_5_2hobhoblvicmbjz.R.flushNeeded();}}

    /** @return frame keyword */
    public boolean isFrameKeyword() {try{__CLR4_5_2hobhoblvicmbjz.R.inc(22917);
        __CLR4_5_2hobhoblvicmbjz.R.inc(22918);return frameKeyword;
    }finally{__CLR4_5_2hobhoblvicmbjz.R.flushNeeded();}}

    /** @return section keyword */
    public boolean isSectionKeyword() {try{__CLR4_5_2hobhoblvicmbjz.R.inc(22919);
        __CLR4_5_2hobhoblvicmbjz.R.inc(22920);return sectionKeyword;
    }finally{__CLR4_5_2hobhoblvicmbjz.R.flushNeeded();}}

    /** @return axiom keyword */
    public boolean isAxiomKeyword() {try{__CLR4_5_2hobhoblvicmbjz.R.inc(22921);
        __CLR4_5_2hobhoblvicmbjz.R.inc(22922);return axiomKeyword;
    }finally{__CLR4_5_2hobhoblvicmbjz.R.flushNeeded();}}

    /** @return class conective */
    public boolean isClassExpressionConnectiveKeyword() {try{__CLR4_5_2hobhoblvicmbjz.R.inc(22923);
        __CLR4_5_2hobhoblvicmbjz.R.inc(22924);return classExpressionConnectiveKeyword;
    }finally{__CLR4_5_2hobhoblvicmbjz.R.flushNeeded();}}

    /** @return class quantifier */
    public boolean isClassExpressionQuantiferKeyword() {try{__CLR4_5_2hobhoblvicmbjz.R.inc(22925);
        __CLR4_5_2hobhoblvicmbjz.R.inc(22926);return classExpressionQuantiferKeyword;
    }finally{__CLR4_5_2hobhoblvicmbjz.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_5_2hobhoblvicmbjz.R.inc(22927);
        __CLR4_5_2hobhoblvicmbjz.R.inc(22928);return rendering;
    }finally{__CLR4_5_2hobhoblvicmbjz.R.flushNeeded();}}

    /** @return keyword */
    public String keyword() {try{__CLR4_5_2hobhoblvicmbjz.R.inc(22929);
        __CLR4_5_2hobhoblvicmbjz.R.inc(22930);return keyword;
    }finally{__CLR4_5_2hobhoblvicmbjz.R.flushNeeded();}}

    /**
     * @param s
     *        s
     * @return true if matches keyword
     */
    public boolean matches(String s) {try{__CLR4_5_2hobhoblvicmbjz.R.inc(22931);
        __CLR4_5_2hobhoblvicmbjz.R.inc(22932);return keyword.equalsIgnoreCase(s);
    }finally{__CLR4_5_2hobhoblvicmbjz.R.flushNeeded();}}

    /**
     * @param s
     *        s
     * @return true if either form matches
     */
    public boolean matchesEitherForm(String s) {try{__CLR4_5_2hobhoblvicmbjz.R.inc(22933);
        __CLR4_5_2hobhoblvicmbjz.R.inc(22934);return keyword.equalsIgnoreCase(s) || rendering.equalsIgnoreCase(s);
    }finally{__CLR4_5_2hobhoblvicmbjz.R.flushNeeded();}}

    /**
     * for keywords which match two tokens.
     * 
     * @param s
     *        s
     * @param v
     *        v
     * @return true if matches
     */
    public boolean matches(@Nonnull String s, @Nonnull String v) {try{__CLR4_5_2hobhoblvicmbjz.R.inc(22935);
        __CLR4_5_2hobhoblvicmbjz.R.inc(22936);return rendering.length() == s.length() + v.length()
                && rendering.startsWith(s) && rendering.endsWith(v);
    }finally{__CLR4_5_2hobhoblvicmbjz.R.flushNeeded();}}

    /**
     * @param rendering
     *        rendering
     * @return manchester owl syntax object
     */
    @Nullable
    public static ManchesterOWLSyntax parse(String rendering) {try{__CLR4_5_2hobhoblvicmbjz.R.inc(22937);
        __CLR4_5_2hobhoblvicmbjz.R.inc(22938);for (ManchesterOWLSyntax m : values()) {{
            __CLR4_5_2hobhoblvicmbjz.R.inc(22939);if ((((m.matches(rendering))&&(__CLR4_5_2hobhoblvicmbjz.R.iget(22940)!=0|true))||(__CLR4_5_2hobhoblvicmbjz.R.iget(22941)==0&false))) {{
                __CLR4_5_2hobhoblvicmbjz.R.inc(22942);return m;
            }
        }}
        }__CLR4_5_2hobhoblvicmbjz.R.inc(22943);return null;
    }finally{__CLR4_5_2hobhoblvicmbjz.R.flushNeeded();}}
;public static class __CLR4_5_2hobhoblvicmbjz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,22944,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;}
