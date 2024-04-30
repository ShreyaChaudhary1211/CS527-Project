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
package org.coode.owlapi.manchesterowlsyntax;

import javax.annotation.Nonnull;

/**
 * The vocabulary that the Manchester OWL Syntax uses.
 * 
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group, Date: 25-Apr-2007
 * @deprecated use
 *             {@link org.semanticweb.owlapi.manchestersyntax.parser.ManchesterOWLSyntax}
 */
@Deprecated
public enum ManchesterOWLSyntax {






    //@formatter:off
    
//    public static final String VALUE_PARTITION = "ValuePartition:";
//    public static final String INSTANCES = "Instances:";
    
    /** VALUE_PARTITION             */   VALUE_PARTITION             (org.semanticweb.owlapi.manchestersyntax.parser.ManchesterOWLSyntax.VALUE_PARTITION             ),
    /** DASH                        */   DASH                        (org.semanticweb.owlapi.manchestersyntax.parser.ManchesterOWLSyntax.DASH                        ),
    /** OPEN                        */   OPEN                        (org.semanticweb.owlapi.manchestersyntax.parser.ManchesterOWLSyntax.OPEN                        ),
    /** CLOSE                       */   CLOSE                       (org.semanticweb.owlapi.manchestersyntax.parser.ManchesterOWLSyntax.CLOSE                       ),
    /** OPENBRACE                   */   OPENBRACE                   (org.semanticweb.owlapi.manchestersyntax.parser.ManchesterOWLSyntax.OPENBRACE                   ),
    /** CLOSEBRACE                  */   CLOSEBRACE                  (org.semanticweb.owlapi.manchestersyntax.parser.ManchesterOWLSyntax.CLOSEBRACE                  ),
    /** OPENBRACKET                 */   OPENBRACKET                 (org.semanticweb.owlapi.manchestersyntax.parser.ManchesterOWLSyntax.OPENBRACKET                 ),
    /** CLOSEBRACKET                */   CLOSEBRACKET                (org.semanticweb.owlapi.manchestersyntax.parser.ManchesterOWLSyntax.CLOSEBRACKET                ),
    /** ONTOLOGY                    */   ONTOLOGY                    (org.semanticweb.owlapi.manchestersyntax.parser.ManchesterOWLSyntax.ONTOLOGY                    ),
    /** IMPORT                      */   IMPORT                      (org.semanticweb.owlapi.manchestersyntax.parser.ManchesterOWLSyntax.IMPORT                      ),
    /** PREFIX                      */   PREFIX                      (org.semanticweb.owlapi.manchestersyntax.parser.ManchesterOWLSyntax.PREFIX                      ),
    /** CLASS                       */   CLASS                       (org.semanticweb.owlapi.manchestersyntax.parser.ManchesterOWLSyntax.CLASS                       ),
    /** OBJECT_PROPERTY             */   OBJECT_PROPERTY             (org.semanticweb.owlapi.manchestersyntax.parser.ManchesterOWLSyntax.OBJECT_PROPERTY             ),
    /** CHAIN_IMPLY                 */   CHAIN_IMPLY                 (org.semanticweb.owlapi.manchestersyntax.parser.ManchesterOWLSyntax.CHAIN_IMPLY                 ),
    /** CHAIN_CONNECT               */   CHAIN_CONNECT               (org.semanticweb.owlapi.manchestersyntax.parser.ManchesterOWLSyntax.CHAIN_CONNECT               ),
    /** DATA_PROPERTY               */   DATA_PROPERTY               (org.semanticweb.owlapi.manchestersyntax.parser.ManchesterOWLSyntax.DATA_PROPERTY               ),
    /** INDIVIDUAL                  */   INDIVIDUAL                  (org.semanticweb.owlapi.manchestersyntax.parser.ManchesterOWLSyntax.INDIVIDUAL                  ),
    /** DATATYPE                    */   DATATYPE                    (org.semanticweb.owlapi.manchestersyntax.parser.ManchesterOWLSyntax.DATATYPE                    ),
    /** ANNOTATION_PROPERTY         */   ANNOTATION_PROPERTY         (org.semanticweb.owlapi.manchestersyntax.parser.ManchesterOWLSyntax.ANNOTATION_PROPERTY         ),
    /** SOME                        */   SOME                        (org.semanticweb.owlapi.manchestersyntax.parser.ManchesterOWLSyntax.SOME                        ),
    /** ONLY                        */   ONLY                        (org.semanticweb.owlapi.manchestersyntax.parser.ManchesterOWLSyntax.ONLY                        ),
    /** ONLYSOME                    */   ONLYSOME                    (org.semanticweb.owlapi.manchestersyntax.parser.ManchesterOWLSyntax.ONLYSOME                    ),
    /** MIN                         */   MIN                         (org.semanticweb.owlapi.manchestersyntax.parser.ManchesterOWLSyntax.MIN                         ),
    /** MAX                         */   MAX                         (org.semanticweb.owlapi.manchestersyntax.parser.ManchesterOWLSyntax.MAX                         ),
    /** EXACTLY                     */   EXACTLY                     (org.semanticweb.owlapi.manchestersyntax.parser.ManchesterOWLSyntax.EXACTLY                     ),
    /** VALUE                       */   VALUE                       (org.semanticweb.owlapi.manchestersyntax.parser.ManchesterOWLSyntax.VALUE                       ),
    /** AND                         */   AND                         (org.semanticweb.owlapi.manchestersyntax.parser.ManchesterOWLSyntax.AND                         ),
    /** OR                          */   OR                          (org.semanticweb.owlapi.manchestersyntax.parser.ManchesterOWLSyntax.OR                          ),
    /** NOT                         */   NOT                         (org.semanticweb.owlapi.manchestersyntax.parser.ManchesterOWLSyntax.NOT                         ),
    /** INVERSE                     */   INVERSE                     (org.semanticweb.owlapi.manchestersyntax.parser.ManchesterOWLSyntax.INVERSE                     ),
    /** INV                         */   INV                         (org.semanticweb.owlapi.manchestersyntax.parser.ManchesterOWLSyntax.INV                         ),
    /** SELF                        */   SELF                        (org.semanticweb.owlapi.manchestersyntax.parser.ManchesterOWLSyntax.SELF                        ),
    /** THAT                        */   THAT                        (org.semanticweb.owlapi.manchestersyntax.parser.ManchesterOWLSyntax.THAT                        ),
    /** FACET_RESTRICTION_SEPARATOR */   FACET_RESTRICTION_SEPARATOR (org.semanticweb.owlapi.manchestersyntax.parser.ManchesterOWLSyntax.FACET_RESTRICTION_SEPARATOR ),
    /** SUBCLASS_OF                 */   SUBCLASS_OF                 (org.semanticweb.owlapi.manchestersyntax.parser.ManchesterOWLSyntax.SUBCLASS_OF          ),
    /** SUPERCLASS_OF               */   SUPERCLASS_OF               (org.semanticweb.owlapi.manchestersyntax.parser.ManchesterOWLSyntax.SUPERCLASS_OF        ),
    /** EQUIVALENT_TO               */   EQUIVALENT_TO               (org.semanticweb.owlapi.manchestersyntax.parser.ManchesterOWLSyntax.EQUIVALENT_TO        ),
    /** EQUIVALENT_CLASSES          */   EQUIVALENT_CLASSES          (org.semanticweb.owlapi.manchestersyntax.parser.ManchesterOWLSyntax.EQUIVALENT_CLASSES   ),
    /** EQUIVALENT_PROPERTIES       */   EQUIVALENT_PROPERTIES       (org.semanticweb.owlapi.manchestersyntax.parser.ManchesterOWLSyntax.EQUIVALENT_PROPERTIES),
    /** DISJOINT_WITH               */   DISJOINT_WITH               (org.semanticweb.owlapi.manchestersyntax.parser.ManchesterOWLSyntax.DISJOINT_WITH        ),
    /** INDIVIDUALS                 */   INDIVIDUALS                 (org.semanticweb.owlapi.manchestersyntax.parser.ManchesterOWLSyntax.INDIVIDUALS          ),
    /** DISJOINT_CLASSES            */   DISJOINT_CLASSES            (org.semanticweb.owlapi.manchestersyntax.parser.ManchesterOWLSyntax.DISJOINT_CLASSES     ),
    /** DISJOINT_PROPERTIES         */   DISJOINT_PROPERTIES         (org.semanticweb.owlapi.manchestersyntax.parser.ManchesterOWLSyntax.DISJOINT_PROPERTIES  ),
    /** DISJOINT_UNION_OF           */   DISJOINT_UNION_OF           (org.semanticweb.owlapi.manchestersyntax.parser.ManchesterOWLSyntax.DISJOINT_UNION_OF    ),
    /** FACTS                       */   FACTS                       (org.semanticweb.owlapi.manchestersyntax.parser.ManchesterOWLSyntax.FACTS                ),
    /** SAME_AS                     */   SAME_AS                     (org.semanticweb.owlapi.manchestersyntax.parser.ManchesterOWLSyntax.SAME_AS              ),
    /** SAME_INDIVIDUAL             */   SAME_INDIVIDUAL             (org.semanticweb.owlapi.manchestersyntax.parser.ManchesterOWLSyntax.SAME_INDIVIDUAL      ),
    /** DIFFERENT_FROM              */   DIFFERENT_FROM              (org.semanticweb.owlapi.manchestersyntax.parser.ManchesterOWLSyntax.DIFFERENT_FROM       ),
    /** DIFFERENT_INDIVIDUALS       */   DIFFERENT_INDIVIDUALS       (org.semanticweb.owlapi.manchestersyntax.parser.ManchesterOWLSyntax.DIFFERENT_INDIVIDUALS),
    /** MIN_INCLUSIVE_FACET         */   MIN_INCLUSIVE_FACET         (org.semanticweb.owlapi.manchestersyntax.parser.ManchesterOWLSyntax.MIN_INCLUSIVE_FACET  ),
    /** MAX_INCLUSIVE_FACET         */   MAX_INCLUSIVE_FACET         (org.semanticweb.owlapi.manchestersyntax.parser.ManchesterOWLSyntax.MAX_INCLUSIVE_FACET  ),
    /** MIN_EXCLUSIVE_FACET         */   MIN_EXCLUSIVE_FACET         (org.semanticweb.owlapi.manchestersyntax.parser.ManchesterOWLSyntax.MIN_EXCLUSIVE_FACET  ),
    /** MAX_EXCLUSIVE_FACET         */   MAX_EXCLUSIVE_FACET         (org.semanticweb.owlapi.manchestersyntax.parser.ManchesterOWLSyntax.MAX_EXCLUSIVE_FACET  ),
    /** ONE_OF_DELIMETER            */   ONE_OF_DELIMETER            (org.semanticweb.owlapi.manchestersyntax.parser.ManchesterOWLSyntax.ONE_OF_DELIMETER     ),
    /** TYPES                       */   TYPES                       (org.semanticweb.owlapi.manchestersyntax.parser.ManchesterOWLSyntax.TYPES                ),
    /** TYPE                        */   TYPE                        (org.semanticweb.owlapi.manchestersyntax.parser.ManchesterOWLSyntax.TYPE                 ),
    /** ANNOTATIONS                 */   ANNOTATIONS                 (org.semanticweb.owlapi.manchestersyntax.parser.ManchesterOWLSyntax.ANNOTATIONS          ),
    /** COMMA                       */   COMMA                       (org.semanticweb.owlapi.manchestersyntax.parser.ManchesterOWLSyntax.COMMA                ),
    /** DOMAIN                      */   DOMAIN                      (org.semanticweb.owlapi.manchestersyntax.parser.ManchesterOWLSyntax.DOMAIN               ),
    /** RANGE                       */   RANGE                       (org.semanticweb.owlapi.manchestersyntax.parser.ManchesterOWLSyntax.RANGE                ),
    /** CHARACTERISTICS             */   CHARACTERISTICS             (org.semanticweb.owlapi.manchestersyntax.parser.ManchesterOWLSyntax.CHARACTERISTICS      ),
    /** FUNCTIONAL                  */   FUNCTIONAL                  (org.semanticweb.owlapi.manchestersyntax.parser.ManchesterOWLSyntax.FUNCTIONAL           ),
    /** INVERSE_FUNCTIONAL          */   INVERSE_FUNCTIONAL          (org.semanticweb.owlapi.manchestersyntax.parser.ManchesterOWLSyntax.INVERSE_FUNCTIONAL   ),
    /** SYMMETRIC                   */   SYMMETRIC                   (org.semanticweb.owlapi.manchestersyntax.parser.ManchesterOWLSyntax.SYMMETRIC            ),
    /** TRANSITIVE                  */   TRANSITIVE                  (org.semanticweb.owlapi.manchestersyntax.parser.ManchesterOWLSyntax.TRANSITIVE           ),
    /** REFLEXIVE                   */   REFLEXIVE                   (org.semanticweb.owlapi.manchestersyntax.parser.ManchesterOWLSyntax.REFLEXIVE            ),
    /** IRREFLEXIVE                 */   IRREFLEXIVE                 (org.semanticweb.owlapi.manchestersyntax.parser.ManchesterOWLSyntax.IRREFLEXIVE          ),
    /** LITERAL_TRUE                */   LITERAL_TRUE                (org.semanticweb.owlapi.manchestersyntax.parser.ManchesterOWLSyntax.LITERAL_TRUE         ),
    /** LITERAL_FALSE               */   LITERAL_FALSE               (org.semanticweb.owlapi.manchestersyntax.parser.ManchesterOWLSyntax.LITERAL_FALSE        ),
    /** LITERAL_INTEGER             */   LITERAL_INTEGER             (org.semanticweb.owlapi.manchestersyntax.parser.ManchesterOWLSyntax.LITERAL_INTEGER      ),
    /** LITERAL_FLOAT               */   LITERAL_FLOAT               (org.semanticweb.owlapi.manchestersyntax.parser.ManchesterOWLSyntax.LITERAL_FLOAT        ),
    /** LITERAL_DOUBLE              */   LITERAL_DOUBLE              (org.semanticweb.owlapi.manchestersyntax.parser.ManchesterOWLSyntax.LITERAL_DOUBLE       ),
    /** LITERAL_LITERAL             */   LITERAL_LITERAL             (org.semanticweb.owlapi.manchestersyntax.parser.ManchesterOWLSyntax.LITERAL_LITERAL      ),
    /** LITERAL_LIT_DATATYPE        */   LITERAL_LIT_DATATYPE        (org.semanticweb.owlapi.manchestersyntax.parser.ManchesterOWLSyntax.LITERAL_LIT_DATATYPE ),
    /** LITERAL_LIT_LANG            */   LITERAL_LIT_LANG            (org.semanticweb.owlapi.manchestersyntax.parser.ManchesterOWLSyntax.LITERAL_LIT_LANG     ),
    /** For legacy reasons. */                                 
    /**ANTI_SYMMETRIC              */    ANTI_SYMMETRIC              (org.semanticweb.owlapi.manchestersyntax.parser.ManchesterOWLSyntax.ANTI_SYMMETRIC      ),
    /**ASYMMETRIC                  */    ASYMMETRIC                  (org.semanticweb.owlapi.manchestersyntax.parser.ManchesterOWLSyntax.ASYMMETRIC          ),
    /**INVERSE_OF                  */    INVERSE_OF                  (org.semanticweb.owlapi.manchestersyntax.parser.ManchesterOWLSyntax.INVERSE_OF          ),
    /**INVERSES                    */    INVERSES                    (org.semanticweb.owlapi.manchestersyntax.parser.ManchesterOWLSyntax.INVERSES            ),
    /**SUB_PROPERTY_OF             */    SUB_PROPERTY_OF             (org.semanticweb.owlapi.manchestersyntax.parser.ManchesterOWLSyntax.SUB_PROPERTY_OF     ),
    /**SUPER_PROPERTY_OF           */    SUPER_PROPERTY_OF           (org.semanticweb.owlapi.manchestersyntax.parser.ManchesterOWLSyntax.SUPER_PROPERTY_OF   ),
    /**SUB_PROPERTY_CHAIN          */    SUB_PROPERTY_CHAIN          (org.semanticweb.owlapi.manchestersyntax.parser.ManchesterOWLSyntax.SUB_PROPERTY_CHAIN  ),
    /**HAS_KEY                     */    HAS_KEY                     (org.semanticweb.owlapi.manchestersyntax.parser.ManchesterOWLSyntax.HAS_KEY             ),
    /**RULE                        */    RULE                        (org.semanticweb.owlapi.manchestersyntax.parser.ManchesterOWLSyntax.RULE                );

    //@formatter:on
    org.semanticweb.owlapi.manchestersyntax.parser.ManchesterOWLSyntax legacy;

    private ManchesterOWLSyntax(
            org.semanticweb.owlapi.manchestersyntax.parser.ManchesterOWLSyntax legacy) {try{__CLR4_5_266lvicnl9q.R.inc(6);
        __CLR4_5_266lvicnl9q.R.inc(7);this.legacy = legacy;
    }finally{__CLR4_5_266lvicnl9q.R.flushNeeded();}}

    /** @return frame keyword */
    public boolean isFrameKeyword() {try{__CLR4_5_266lvicnl9q.R.inc(8);
        __CLR4_5_266lvicnl9q.R.inc(9);return legacy.isFrameKeyword();
    }finally{__CLR4_5_266lvicnl9q.R.flushNeeded();}}

    /** @return section keyword */
    public boolean isSectionKeyword() {try{__CLR4_5_266lvicnl9q.R.inc(10);
        __CLR4_5_266lvicnl9q.R.inc(11);return legacy.isSectionKeyword();
    }finally{__CLR4_5_266lvicnl9q.R.flushNeeded();}}

    /** @return axiom keyword */
    public boolean isAxiomKeyword() {try{__CLR4_5_266lvicnl9q.R.inc(12);
        __CLR4_5_266lvicnl9q.R.inc(13);return legacy.isAxiomKeyword();
    }finally{__CLR4_5_266lvicnl9q.R.flushNeeded();}}

    /** @return class conective */
    public boolean isClassExpressionConnectiveKeyword() {try{__CLR4_5_266lvicnl9q.R.inc(14);
        __CLR4_5_266lvicnl9q.R.inc(15);return legacy.isClassExpressionConnectiveKeyword();
    }finally{__CLR4_5_266lvicnl9q.R.flushNeeded();}}

    /** @return class quantifier */
    public boolean isClassExpressionQuantiferKeyword() {try{__CLR4_5_266lvicnl9q.R.inc(16);
        __CLR4_5_266lvicnl9q.R.inc(17);return legacy.isClassExpressionQuantiferKeyword();
    }finally{__CLR4_5_266lvicnl9q.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_5_266lvicnl9q.R.inc(18);
        __CLR4_5_266lvicnl9q.R.inc(19);return legacy.toString();
    }finally{__CLR4_5_266lvicnl9q.R.flushNeeded();}}

    /** @return keyword */
    public String keyword() {try{__CLR4_5_266lvicnl9q.R.inc(20);
        __CLR4_5_266lvicnl9q.R.inc(21);return legacy.keyword();
    }finally{__CLR4_5_266lvicnl9q.R.flushNeeded();}}

    /**
     * @param s
     *        s
     * @return true if matches keyword
     */
    public boolean matches(String s) {try{__CLR4_5_266lvicnl9q.R.inc(22);
        __CLR4_5_266lvicnl9q.R.inc(23);return legacy.matches(s);
    }finally{__CLR4_5_266lvicnl9q.R.flushNeeded();}}

    /**
     * @param s
     *        s
     * @return true if either form matches
     */
    public boolean matchesEitherForm(String s) {try{__CLR4_5_266lvicnl9q.R.inc(24);
        __CLR4_5_266lvicnl9q.R.inc(25);return legacy.matchesEitherForm(s);
    }finally{__CLR4_5_266lvicnl9q.R.flushNeeded();}}

    /**
     * for keywords which match two tokens.
     * 
     * @param s
     *        s
     * @param v
     *        v
     * @return true if matches
     */
    public boolean matches(@Nonnull String s, @Nonnull String v) {try{__CLR4_5_266lvicnl9q.R.inc(26);
        __CLR4_5_266lvicnl9q.R.inc(27);return legacy.matches(s, v);
    }finally{__CLR4_5_266lvicnl9q.R.flushNeeded();}}

    /**
     * @param rendering
     *        rendering
     * @return manchester owl syntax object
     */
    public static ManchesterOWLSyntax parse(String rendering) {try{__CLR4_5_266lvicnl9q.R.inc(28);
        __CLR4_5_266lvicnl9q.R.inc(29);for (ManchesterOWLSyntax m : values()) {{
            __CLR4_5_266lvicnl9q.R.inc(30);if ((((m.matches(rendering))&&(__CLR4_5_266lvicnl9q.R.iget(31)!=0|true))||(__CLR4_5_266lvicnl9q.R.iget(32)==0&false))) {{
                __CLR4_5_266lvicnl9q.R.inc(33);return m;
            }
        }}
        }__CLR4_5_266lvicnl9q.R.inc(34);return null;
    }finally{__CLR4_5_266lvicnl9q.R.flushNeeded();}}
;public static class __CLR4_5_266lvicnl9q{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006d\u0070\u0061\u0074\u0069\u0062\u0069\u006c\u0069\u0074\u0079\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237345588L,8589935092L,35,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;}
