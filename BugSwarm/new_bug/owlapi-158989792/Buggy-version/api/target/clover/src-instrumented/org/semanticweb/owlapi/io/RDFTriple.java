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
package org.semanticweb.owlapi.io;

import static org.semanticweb.owlapi.util.OWLAPIPreconditions.checkNotNull;
import static org.semanticweb.owlapi.vocab.OWLRDFVocabulary.*;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLLiteral;
import org.semanticweb.owlapi.vocab.OWLRDFVocabulary;

import gnu.trove.map.hash.THashMap;

/**
 * @author Matthew Horridge, The University of Manchester, Bio-Health
 *         Informatics Group
 * @since 3.2
 */
public class RDFTriple implements Serializable, Comparable<RDFTriple> {public static class __CLR4_5_213e13elvickl32{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0061\u0070\u0069\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237201267L,8589935092L,1496,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 40000L;
    @Nonnull private final RDFResource subject;
    @Nonnull private final RDFResourceIRI predicate;
    @Nonnull private final RDFNode object;

    /**
     * @param subject
     *        the subject
     * @param predicate
     *        the predicate
     * @param object
     *        the object
     */
    public RDFTriple(@Nonnull RDFResource subject, @Nonnull RDFResourceIRI predicate, @Nonnull RDFNode object) {try{__CLR4_5_213e13elvickl32.R.inc(1418);
        __CLR4_5_213e13elvickl32.R.inc(1419);this.subject = checkNotNull(subject, "subject cannot be null");
        __CLR4_5_213e13elvickl32.R.inc(1420);this.predicate = checkNotNull(predicate, "predicate cannot be null");
        __CLR4_5_213e13elvickl32.R.inc(1421);this.object = checkNotNull(object, "object cannot be null");
    }finally{__CLR4_5_213e13elvickl32.R.flushNeeded();}}

    /**
     * @param subject
     *        the subject
     * @param subjectAnon
     *        whether the subject is anonymous
     * @param predicate
     *        the predicate
     * @param object
     *        the object
     * @param objectAnon
     *        whether the object is anonymous
     */
    public RDFTriple(@Nonnull IRI subject, boolean subjectAnon, @Nonnull IRI predicate, @Nonnull IRI object,
        boolean objectAnon) {
        this(getResource(subject, subjectAnon),
            // Predicate is not allowed to be anonymous
            new RDFResourceIRI(predicate), getResource(object, objectAnon));__CLR4_5_213e13elvickl32.R.inc(1423);try{__CLR4_5_213e13elvickl32.R.inc(1422);
    }finally{__CLR4_5_213e13elvickl32.R.flushNeeded();}}

    @Nonnull
    private static RDFResource getResource(@Nonnull IRI iri, boolean anon) {try{__CLR4_5_213e13elvickl32.R.inc(1424);
        __CLR4_5_213e13elvickl32.R.inc(1425);if ((((anon)&&(__CLR4_5_213e13elvickl32.R.iget(1426)!=0|true))||(__CLR4_5_213e13elvickl32.R.iget(1427)==0&false))) {{
            __CLR4_5_213e13elvickl32.R.inc(1428);return new RDFResourceBlankNode(iri, true, true);
        }
        }__CLR4_5_213e13elvickl32.R.inc(1429);return new RDFResourceIRI(iri);
    }finally{__CLR4_5_213e13elvickl32.R.flushNeeded();}}

    /**
     * @param subject
     *        the subject
     * @param subjectAnon
     *        whether the subject is anonymous
     * @param predicate
     *        the predicate
     * @param object
     *        the object
     */
    public RDFTriple(@Nonnull IRI subject, boolean subjectAnon, @Nonnull IRI predicate, @Nonnull OWLLiteral object) {
        this(getResource(subject, subjectAnon), new RDFResourceIRI(predicate), new RDFLiteral(object));__CLR4_5_213e13elvickl32.R.inc(1431);try{__CLR4_5_213e13elvickl32.R.inc(1430);
    }finally{__CLR4_5_213e13elvickl32.R.flushNeeded();}}

    /** @return true if subject and object are the same */
    public boolean isSubjectSameAsObject() {try{__CLR4_5_213e13elvickl32.R.inc(1432);
        __CLR4_5_213e13elvickl32.R.inc(1433);return subject.equals(object);
    }finally{__CLR4_5_213e13elvickl32.R.flushNeeded();}}

    /**
     * @return the subject
     */
    @Nonnull
    public RDFResource getSubject() {try{__CLR4_5_213e13elvickl32.R.inc(1434);
        __CLR4_5_213e13elvickl32.R.inc(1435);return subject;
    }finally{__CLR4_5_213e13elvickl32.R.flushNeeded();}}

    /**
     * @return the predicate
     */
    @Nonnull
    public RDFResourceIRI getPredicate() {try{__CLR4_5_213e13elvickl32.R.inc(1436);
        __CLR4_5_213e13elvickl32.R.inc(1437);return predicate;
    }finally{__CLR4_5_213e13elvickl32.R.flushNeeded();}}

    /**
     * @return the object
     */
    @Nonnull
    public RDFNode getObject() {try{__CLR4_5_213e13elvickl32.R.inc(1438);
        __CLR4_5_213e13elvickl32.R.inc(1439);return object;
    }finally{__CLR4_5_213e13elvickl32.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_5_213e13elvickl32.R.inc(1440);
        __CLR4_5_213e13elvickl32.R.inc(1441);return subject.hashCode() * 37 + predicate.hashCode() * 17 + object.hashCode();
    }finally{__CLR4_5_213e13elvickl32.R.flushNeeded();}}

    @Override
    public boolean equals(Object obj) {try{__CLR4_5_213e13elvickl32.R.inc(1442);
        __CLR4_5_213e13elvickl32.R.inc(1443);if ((((obj == this)&&(__CLR4_5_213e13elvickl32.R.iget(1444)!=0|true))||(__CLR4_5_213e13elvickl32.R.iget(1445)==0&false))) {{
            __CLR4_5_213e13elvickl32.R.inc(1446);return true;
        }
        }__CLR4_5_213e13elvickl32.R.inc(1447);if ((((!(obj instanceof RDFTriple))&&(__CLR4_5_213e13elvickl32.R.iget(1448)!=0|true))||(__CLR4_5_213e13elvickl32.R.iget(1449)==0&false))) {{
            __CLR4_5_213e13elvickl32.R.inc(1450);return false;
        }
        }__CLR4_5_213e13elvickl32.R.inc(1451);RDFTriple other = (RDFTriple) obj;
        __CLR4_5_213e13elvickl32.R.inc(1452);return subject.equals(other.subject) && predicate.equals(other.predicate) && object.equals(other.object);
    }finally{__CLR4_5_213e13elvickl32.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_5_213e13elvickl32.R.inc(1453);
        __CLR4_5_213e13elvickl32.R.inc(1454);return String.format("%s %s %s.\n", subject, predicate, object);
    }finally{__CLR4_5_213e13elvickl32.R.flushNeeded();}}

    private static final List<IRI> ORDERED_URIS = Arrays.asList(RDF_TYPE.getIRI(), RDFS_LABEL.getIRI(), OWL_DEPRECATED
        .getIRI(), RDFS_COMMENT.getIRI(), RDFS_IS_DEFINED_BY.getIRI(), RDF_FIRST.getIRI(), RDF_REST.getIRI(),
        OWL_EQUIVALENT_CLASS.getIRI(), OWL_EQUIVALENT_PROPERTY.getIRI(), RDFS_SUBCLASS_OF.getIRI(), RDFS_SUB_PROPERTY_OF
            .getIRI(), RDFS_DOMAIN.getIRI(), RDFS_RANGE.getIRI(), OWL_DISJOINT_WITH.getIRI(), OWL_ON_PROPERTY.getIRI(),
        OWL_DATA_RANGE.getIRI(), OWL_ON_CLASS.getIRI(), OWL_ANNOTATED_SOURCE.getIRI(), OWL_ANNOTATED_PROPERTY.getIRI(),
        OWL_ANNOTATED_TARGET.getIRI());
    static final THashMap<IRI, Integer> specialPredicateRanks = new THashMap<>();

    static {try{__CLR4_5_213e13elvickl32.R.inc(1455);
        __CLR4_5_213e13elvickl32.R.inc(1456);int nextId = 1;
        __CLR4_5_213e13elvickl32.R.inc(1457);for (int i = 0; (((i < ORDERED_URIS.size())&&(__CLR4_5_213e13elvickl32.R.iget(1458)!=0|true))||(__CLR4_5_213e13elvickl32.R.iget(1459)==0&false)); i++) {{
            __CLR4_5_213e13elvickl32.R.inc(1460);specialPredicateRanks.put(ORDERED_URIS.get(i), nextId++);
        }
        }__CLR4_5_213e13elvickl32.R.inc(1461);for (OWLRDFVocabulary vocabulary : OWLRDFVocabulary.values()) {{
            __CLR4_5_213e13elvickl32.R.inc(1462);IRI iri = vocabulary.getIRI();
            __CLR4_5_213e13elvickl32.R.inc(1463);if ((((!specialPredicateRanks.containsKey(iri))&&(__CLR4_5_213e13elvickl32.R.iget(1464)!=0|true))||(__CLR4_5_213e13elvickl32.R.iget(1465)==0&false))) {{
                __CLR4_5_213e13elvickl32.R.inc(1466);specialPredicateRanks.put(iri, nextId++);
            }
        }}
    }}finally{__CLR4_5_213e13elvickl32.R.flushNeeded();}}

    @Override
    public int compareTo(RDFTriple o) {try{__CLR4_5_213e13elvickl32.R.inc(1467);
        // compare by predicate, then subject, then object
        __CLR4_5_213e13elvickl32.R.inc(1468);int diff = comparePredicates(predicate, o.predicate);
        __CLR4_5_213e13elvickl32.R.inc(1469);if ((((diff == 0)&&(__CLR4_5_213e13elvickl32.R.iget(1470)!=0|true))||(__CLR4_5_213e13elvickl32.R.iget(1471)==0&false))) {{
            __CLR4_5_213e13elvickl32.R.inc(1472);diff = subject.compareTo(o.subject);
        }
        }__CLR4_5_213e13elvickl32.R.inc(1473);if ((((diff == 0)&&(__CLR4_5_213e13elvickl32.R.iget(1474)!=0|true))||(__CLR4_5_213e13elvickl32.R.iget(1475)==0&false))) {{
            __CLR4_5_213e13elvickl32.R.inc(1476);diff = object.compareTo(o.object);
        }
        }__CLR4_5_213e13elvickl32.R.inc(1477);return diff;
    }finally{__CLR4_5_213e13elvickl32.R.flushNeeded();}}

    private static int comparePredicates(RDFResourceIRI predicate, RDFResourceIRI otherPredicate) {try{__CLR4_5_213e13elvickl32.R.inc(1478);
        __CLR4_5_213e13elvickl32.R.inc(1479);IRI predicateIRI = predicate.getIRI();
        __CLR4_5_213e13elvickl32.R.inc(1480);Integer specialPredicateRank = specialPredicateRanks.get(predicateIRI);
        __CLR4_5_213e13elvickl32.R.inc(1481);IRI otherPredicateIRI = otherPredicate.getIRI();
        __CLR4_5_213e13elvickl32.R.inc(1482);Integer otherSpecialPredicateRank = specialPredicateRanks.get(otherPredicateIRI);
        __CLR4_5_213e13elvickl32.R.inc(1483);if ((((specialPredicateRank != null)&&(__CLR4_5_213e13elvickl32.R.iget(1484)!=0|true))||(__CLR4_5_213e13elvickl32.R.iget(1485)==0&false))) {{
            __CLR4_5_213e13elvickl32.R.inc(1486);if ((((otherSpecialPredicateRank != null)&&(__CLR4_5_213e13elvickl32.R.iget(1487)!=0|true))||(__CLR4_5_213e13elvickl32.R.iget(1488)==0&false))) {{
                __CLR4_5_213e13elvickl32.R.inc(1489);return specialPredicateRank - otherSpecialPredicateRank;
            } }else {{
                __CLR4_5_213e13elvickl32.R.inc(1490);return -1;
            }
        }} }else {{
            __CLR4_5_213e13elvickl32.R.inc(1491);if ((((otherSpecialPredicateRank != null)&&(__CLR4_5_213e13elvickl32.R.iget(1492)!=0|true))||(__CLR4_5_213e13elvickl32.R.iget(1493)==0&false))) {{
                __CLR4_5_213e13elvickl32.R.inc(1494);return +1;
            } }else {{
                __CLR4_5_213e13elvickl32.R.inc(1495);return predicateIRI.compareTo(otherPredicateIRI);
            }
        }}
    }}finally{__CLR4_5_213e13elvickl32.R.flushNeeded();}}
}
