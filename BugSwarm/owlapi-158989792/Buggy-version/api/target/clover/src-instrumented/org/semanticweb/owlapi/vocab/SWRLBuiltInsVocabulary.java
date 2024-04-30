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

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.model.HasIRI;
import org.semanticweb.owlapi.model.HasPrefixedName;
import org.semanticweb.owlapi.model.HasShortForm;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.SWRLPredicate;

/**
 * @author Matthew Horridge, The University Of Manchester, Medical Informatics
 *         Group
 * @since 2.0.0
 */
public enum SWRLBuiltInsVocabulary
        implements
        SWRLPredicate,
        HasShortForm,
        HasIRI,
        HasPrefixedName {
//@formatter:off
    /** EQUAL */                    EQUAL("equal", 2),
    /** NOT_EQUAL */                NOT_EQUAL("notEqual", 2),
    /** LESS_THAN */                LESS_THAN("lessThan", 2),
    /** LESS_THAN_OR_EQUAL */       LESS_THAN_OR_EQUAL("lessThanOrEqual", 2),
    /** GREATER_THAN */             GREATER_THAN("greaterThan", 2),
    /** GREATER_THAN_OR_EQUAL */    GREATER_THAN_OR_EQUAL("greaterThanOrEqual", 2),
    /** ADD */                      ADD("add", -1),
    /** SUBTRACT */                 SUBTRACT("subtract", 3),
    /** MULTIPLY */                 MULTIPLY("multiply", -1),
    /** DIVIDE */                   DIVIDE("divide", 3),
    /** INTEGER_DIVIDE */           INTEGER_DIVIDE("integerDivide", 3),
    /** MOD */                      MOD("mod", 3),
    /** POW */                      POW("pow", 3),
    /** UNARY_MINUS */              UNARY_MINUS("unaryMinus", 2),
    /** UNARY_PLUS */               UNARY_PLUS("unaryPlus", 2),
    /** ABS */                      ABS("abs", 2),
    /** CEILING */                  CEILING("ceiling", 2),
    /** FLOOR */                    FLOOR("floor", 2),
    /** ROUND */                    ROUND("round", 2),
    /** ROUND_HALF_TO_EVEN */       ROUND_HALF_TO_EVEN("roundHalfToEven", 2, 3),
    /** SIN */                      SIN("sin", 2),
    /** COS */                      COS("cos", 2),
    /** TAN */                      TAN("tan", 2),
    /** BOOLEAN_NOT */              BOOLEAN_NOT("booleanNot", 2),
    /** STRING_EQUALS_IGNORE_CASE */STRING_EQUALS_IGNORE_CASE("stringEqualIgnoreCase", 2),
    /** STRING_CONCAT */            STRING_CONCAT("stringConcat", -1),
    /** SUBSTRING */                SUBSTRING("substring", 3),
    /** STRING_LENGTH */            STRING_LENGTH("stringLength", 2),
    /** NORMALIZE_SPACE */          NORMALIZE_SPACE("normalizeSpace", 2),
    /** UPPER_CASE */               UPPER_CASE("upperCase", 2),
    /** LOWER_CASE */               LOWER_CASE("lowerCase", 2),
    /** TRANSLATE */                TRANSLATE("translate", 4),
    /** CONTAINS */                 CONTAINS("contains", 2),
    /** CONTAINS_IGNORE_CASE */     CONTAINS_IGNORE_CASE("containsIgnoreCase", 2),
    /** STARTS_WITH */              STARTS_WITH("startsWith", 2),
    /** ENDS_WITH */                ENDS_WITH("endsWith", 2),
    /** SUBSTRING_BEFORE */         SUBSTRING_BEFORE("substringBefore", 3),
    /** SUBSTRING_AFTER */          SUBSTRING_AFTER("substringAfter", 3),
    /** MATCHES */                  MATCHES("matchesLax", 2),
    /** REPLACE */                  REPLACE("replace", 4),
    /** TOKENIZE */                 TOKENIZE("tokenize", 3),
    /** YEAR_MONTH_DURATION */      YEAR_MONTH_DURATION("yearMonthDuration", 5),
    /** DAY_TIME_DURATION */        DAY_TIME_DURATION("dayTimeDuration", 5),
    /** DATE_TIME */                DATE_TIME("dateTime", 5),
    /** DATE */                     DATE("date", 5),
    /** TIME */                     TIME("time", 5),
    /** SUBTRACT_DATES */           SUBTRACT_DATES("subtractDates", 3),
    /** SUBTRACT_TIMES */           SUBTRACT_TIMES("subtractTimes", 3),
    /** RESOLVE_URI */              RESOLVE_URI("resolveURI", 3),
    /** ANY_URI */                  ANY_URI("anyURI", 7),
    /** ADD_YEAR_MONTH_DURATIONS */         ADD_YEAR_MONTH_DURATIONS("addYearMonthDurations", -1),
    /** SUBTRACT_YEAR_MONTH_DURATIONS */    SUBTRACT_YEAR_MONTH_DURATIONS("subtractYearMonthDurations", 3),
    /** MULTIPLY_YEAR_MONTH_DURATIONS */    MULTIPLY_YEAR_MONTH_DURATIONS("multiplyYearMonthDurations", 3),
    /** DIVIDE_YEAR_MONTH_DURATIONS */      DIVIDE_YEAR_MONTH_DURATIONS("divideYearMonthDurations", 3),
    /** ADD_DAY_TIME_DURATIONS */           ADD_DAY_TIME_DURATIONS("addDayTimeDurations", -1),
    /** SUBTRACT_DAY_TIME_DURATIONS */      SUBTRACT_DAY_TIME_DURATIONS("subtractDayTimeDurations", 3),
    /** MULTIPLY_DAY_TIME_DURATIONS */      MULTIPLY_DAY_TIME_DURATIONS("multiplyDayTimeDurations", 3),
    /** DIVIDE_DAY_TIME_DURATIONS */        DIVIDE_DAY_TIME_DURATIONS("divideDayTimeDurations", 3),
    /** ADD_DAY_TIME_DURATION_TO_DATE_TIME */           ADD_DAY_TIME_DURATION_TO_DATE_TIME("addDayTimeDurationToDateTime", 3),
    /** SUBTRACT_YEAR_MONTH_DURATION_FROM_DATE_TIME */  SUBTRACT_YEAR_MONTH_DURATION_FROM_DATE_TIME("subtractYearMonthDurationFromDateTime", 3),
    /** SUBTRACT_DAY_TIME_DURATION_FROM_DATE_TIME */    SUBTRACT_DAY_TIME_DURATION_FROM_DATE_TIME("subtractDayTimeDurationFromDateTime", 3),
    /** ADD_YEAR_MONTH_DURATION_TO_DATE */              ADD_YEAR_MONTH_DURATION_TO_DATE("addYearMonthDurationToDate", 3),
    /** ADD_DAY_TIME_DURATION_TO_DATE */                ADD_DAY_TIME_DURATION_TO_DATE("addDayTimeDurationToDate", 3),
    /** SUBTRACT_YEAR_MONTH_DURATION_FROM_DATE */       SUBTRACT_YEAR_MONTH_DURATION_FROM_DATE("subtractYearMonthDurationFromDate", 3),
    /** SUBTRACT_DAY_TIME_DURATION_FROM_DATE */         SUBTRACT_DAY_TIME_DURATION_FROM_DATE("subtractDayTimeDurationFromDate", 3),
    /** ADD_DAY_TIME_DURATION_FROM_TIME */              ADD_DAY_TIME_DURATION_FROM_TIME("addDayTimeDurationToTime", 3),
    /** SUBTRACT_DAY_TIME_DURATION_FROM_TIME */         SUBTRACT_DAY_TIME_DURATION_FROM_TIME("subtractDayTimeDurationFromTime", 3),
    /** SUBTRACT_DATE_TIMES_YIELDING_YEAR_MONTH_DURATION */ SUBTRACT_DATE_TIMES_YIELDING_YEAR_MONTH_DURATION("subtractDateTimesYieldingYearMonthDuration", 3),    
    /** SUBTRACT_DATE_TIMES_YIELDING_DAY_TIME_DURATION */   SUBTRACT_DATE_TIMES_YIELDING_DAY_TIME_DURATION("subtractDateTimesYieldingDayTimeDuration", 3);
//@formatter:on
    @Nonnull
    private final String shortName;
    @Nonnull
    private final String prefixedName;
    @Nonnull
    private final IRI iri;
    // Arity of the predicate (-1 if infinite)
    private final int minArity;
    private final int maxArity;

    SWRLBuiltInsVocabulary(@Nonnull String name, int arity) {
        this(name, arity, arity);__CLR4_5_2cdxcdxlvicksho.R.inc(16054);try{__CLR4_5_2cdxcdxlvicksho.R.inc(16053);
    }finally{__CLR4_5_2cdxcdxlvicksho.R.flushNeeded();}}

    SWRLBuiltInsVocabulary(@Nonnull String name, int minArity, int maxArity) {try{__CLR4_5_2cdxcdxlvicksho.R.inc(16055);
        __CLR4_5_2cdxcdxlvicksho.R.inc(16056);shortName = name;
        __CLR4_5_2cdxcdxlvicksho.R.inc(16057);prefixedName = Namespaces.SWRLB.getPrefixName() + ':' + name;
        __CLR4_5_2cdxcdxlvicksho.R.inc(16058);iri = IRI.create(Namespaces.SWRLB.toString(), name);
        __CLR4_5_2cdxcdxlvicksho.R.inc(16059);this.minArity = minArity;
        __CLR4_5_2cdxcdxlvicksho.R.inc(16060);this.maxArity = maxArity;
    }finally{__CLR4_5_2cdxcdxlvicksho.R.flushNeeded();}}

    @Override
    public String getShortForm() {try{__CLR4_5_2cdxcdxlvicksho.R.inc(16061);
        __CLR4_5_2cdxcdxlvicksho.R.inc(16062);return shortName;
    }finally{__CLR4_5_2cdxcdxlvicksho.R.flushNeeded();}}

    @Override
    public IRI getIRI() {try{__CLR4_5_2cdxcdxlvicksho.R.inc(16063);
        __CLR4_5_2cdxcdxlvicksho.R.inc(16064);return iri;
    }finally{__CLR4_5_2cdxcdxlvicksho.R.flushNeeded();}}

    /**
     * Gets the minimum arity of this built in.
     * 
     * @return The minimum arity of this built in
     */
    public int getMinArity() {try{__CLR4_5_2cdxcdxlvicksho.R.inc(16065);
        __CLR4_5_2cdxcdxlvicksho.R.inc(16066);return minArity;
    }finally{__CLR4_5_2cdxcdxlvicksho.R.flushNeeded();}}

    /**
     * Gets the maximum arity of this built in.
     * 
     * @return The maximum arity of the built in or -1 if the arity is infinite
     */
    public int getMaxArity() {try{__CLR4_5_2cdxcdxlvicksho.R.inc(16067);
        __CLR4_5_2cdxcdxlvicksho.R.inc(16068);return maxArity;
    }finally{__CLR4_5_2cdxcdxlvicksho.R.flushNeeded();}}

    /**
     * Gets a builtin vocabulary value for a given IRI.
     * 
     * @param iri
     *        The IRI
     * @return The builtin vocabulary having the specified IRI, or {@code null}
     *         if there is no builtin vocabulary with the specified IRI
     */
    public static SWRLBuiltInsVocabulary getBuiltIn(IRI iri) {try{__CLR4_5_2cdxcdxlvicksho.R.inc(16069);
        __CLR4_5_2cdxcdxlvicksho.R.inc(16070);for (SWRLBuiltInsVocabulary v : values()) {{
            __CLR4_5_2cdxcdxlvicksho.R.inc(16071);if ((((v.iri.equals(iri))&&(__CLR4_5_2cdxcdxlvicksho.R.iget(16072)!=0|true))||(__CLR4_5_2cdxcdxlvicksho.R.iget(16073)==0&false))) {{
                __CLR4_5_2cdxcdxlvicksho.R.inc(16074);return v;
            }
        }}
        }__CLR4_5_2cdxcdxlvicksho.R.inc(16075);return null;
    }finally{__CLR4_5_2cdxcdxlvicksho.R.flushNeeded();}}

    @Override
    public String getPrefixedName() {try{__CLR4_5_2cdxcdxlvicksho.R.inc(16076);
        __CLR4_5_2cdxcdxlvicksho.R.inc(16077);return prefixedName;
    }finally{__CLR4_5_2cdxcdxlvicksho.R.flushNeeded();}}
;public static class __CLR4_5_2cdxcdxlvicksho{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0061\u0070\u0069\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237201267L,8589935092L,16078,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;}
