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
package org.semanticweb.owlapi.util;

import static org.semanticweb.owlapi.util.OWLAPIPreconditions.checkNotNull;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLAnnotation;
import org.semanticweb.owlapi.model.OWLAnnotationAssertionAxiom;
import org.semanticweb.owlapi.model.OWLAnnotationProperty;
import org.semanticweb.owlapi.model.OWLAnnotationPropertyDomainAxiom;
import org.semanticweb.owlapi.model.OWLAnnotationPropertyRangeAxiom;
import org.semanticweb.owlapi.model.OWLAnonymousIndividual;
import org.semanticweb.owlapi.model.OWLAsymmetricObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLClassAssertionAxiom;
import org.semanticweb.owlapi.model.OWLDataAllValuesFrom;
import org.semanticweb.owlapi.model.OWLDataComplementOf;
import org.semanticweb.owlapi.model.OWLDataExactCardinality;
import org.semanticweb.owlapi.model.OWLDataHasValue;
import org.semanticweb.owlapi.model.OWLDataIntersectionOf;
import org.semanticweb.owlapi.model.OWLDataMaxCardinality;
import org.semanticweb.owlapi.model.OWLDataMinCardinality;
import org.semanticweb.owlapi.model.OWLDataOneOf;
import org.semanticweb.owlapi.model.OWLDataProperty;
import org.semanticweb.owlapi.model.OWLDataPropertyAssertionAxiom;
import org.semanticweb.owlapi.model.OWLDataPropertyDomainAxiom;
import org.semanticweb.owlapi.model.OWLDataPropertyRangeAxiom;
import org.semanticweb.owlapi.model.OWLDataSomeValuesFrom;
import org.semanticweb.owlapi.model.OWLDataUnionOf;
import org.semanticweb.owlapi.model.OWLDatatype;
import org.semanticweb.owlapi.model.OWLDatatypeDefinitionAxiom;
import org.semanticweb.owlapi.model.OWLDatatypeRestriction;
import org.semanticweb.owlapi.model.OWLDeclarationAxiom;
import org.semanticweb.owlapi.model.OWLDifferentIndividualsAxiom;
import org.semanticweb.owlapi.model.OWLDisjointClassesAxiom;
import org.semanticweb.owlapi.model.OWLDisjointDataPropertiesAxiom;
import org.semanticweb.owlapi.model.OWLDisjointObjectPropertiesAxiom;
import org.semanticweb.owlapi.model.OWLDisjointUnionAxiom;
import org.semanticweb.owlapi.model.OWLEquivalentClassesAxiom;
import org.semanticweb.owlapi.model.OWLEquivalentDataPropertiesAxiom;
import org.semanticweb.owlapi.model.OWLEquivalentObjectPropertiesAxiom;
import org.semanticweb.owlapi.model.OWLFacetRestriction;
import org.semanticweb.owlapi.model.OWLFunctionalDataPropertyAxiom;
import org.semanticweb.owlapi.model.OWLFunctionalObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLHasKeyAxiom;
import org.semanticweb.owlapi.model.OWLInverseFunctionalObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLInverseObjectPropertiesAxiom;
import org.semanticweb.owlapi.model.OWLIrreflexiveObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLLiteral;
import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLNegativeDataPropertyAssertionAxiom;
import org.semanticweb.owlapi.model.OWLNegativeObjectPropertyAssertionAxiom;
import org.semanticweb.owlapi.model.OWLObject;
import org.semanticweb.owlapi.model.OWLObjectAllValuesFrom;
import org.semanticweb.owlapi.model.OWLObjectComplementOf;
import org.semanticweb.owlapi.model.OWLObjectExactCardinality;
import org.semanticweb.owlapi.model.OWLObjectHasSelf;
import org.semanticweb.owlapi.model.OWLObjectHasValue;
import org.semanticweb.owlapi.model.OWLObjectIntersectionOf;
import org.semanticweb.owlapi.model.OWLObjectInverseOf;
import org.semanticweb.owlapi.model.OWLObjectMaxCardinality;
import org.semanticweb.owlapi.model.OWLObjectMinCardinality;
import org.semanticweb.owlapi.model.OWLObjectOneOf;
import org.semanticweb.owlapi.model.OWLObjectProperty;
import org.semanticweb.owlapi.model.OWLObjectPropertyAssertionAxiom;
import org.semanticweb.owlapi.model.OWLObjectPropertyDomainAxiom;
import org.semanticweb.owlapi.model.OWLObjectPropertyRangeAxiom;
import org.semanticweb.owlapi.model.OWLObjectSomeValuesFrom;
import org.semanticweb.owlapi.model.OWLObjectUnionOf;
import org.semanticweb.owlapi.model.OWLObjectVisitor;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLReflexiveObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLSameIndividualAxiom;
import org.semanticweb.owlapi.model.OWLSubAnnotationPropertyOfAxiom;
import org.semanticweb.owlapi.model.OWLSubClassOfAxiom;
import org.semanticweb.owlapi.model.OWLSubDataPropertyOfAxiom;
import org.semanticweb.owlapi.model.OWLSubObjectPropertyOfAxiom;
import org.semanticweb.owlapi.model.OWLSubPropertyChainOfAxiom;
import org.semanticweb.owlapi.model.OWLSymmetricObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLTransitiveObjectPropertyAxiom;
import org.semanticweb.owlapi.model.SWRLBuiltInAtom;
import org.semanticweb.owlapi.model.SWRLClassAtom;
import org.semanticweb.owlapi.model.SWRLDataPropertyAtom;
import org.semanticweb.owlapi.model.SWRLDataRangeAtom;
import org.semanticweb.owlapi.model.SWRLDifferentIndividualsAtom;
import org.semanticweb.owlapi.model.SWRLIndividualArgument;
import org.semanticweb.owlapi.model.SWRLLiteralArgument;
import org.semanticweb.owlapi.model.SWRLObjectPropertyAtom;
import org.semanticweb.owlapi.model.SWRLObjectVisitor;
import org.semanticweb.owlapi.model.SWRLRule;
import org.semanticweb.owlapi.model.SWRLSameIndividualAtom;
import org.semanticweb.owlapi.model.SWRLVariable;

/**
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.0.0
 */
public class HashCode implements OWLObjectVisitor, SWRLObjectVisitor {public static class __CLR4_5_263s63slvickpzf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0061\u0070\u0069\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237201267L,8589935092L,8256,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private int hashCode;
    private static final int MULT = 31;
    private static final int[] primes = { 37,// 37 41 43 47 53 59 61 67 71
            73,// 79 83 89 97 101 103 107 109 113
            127,// 131 137 139 149 151 157 163 167 173
            179,// 181 191 193 197 199 211 223 227 229
            233,// 239 241 251 257 263 269 271 277 281
            283,// 293 307 311 313 317 331 337 347 349
            353,// 359 367 373 379 383 389 397 401 409
            419,// 421 431 433 439 443 449 457 461 463
            467,// 479 487 491 499 503 509 521 523 541
            547,// 557 563 569 571 577 587 593 599 601
            607,// 613 617 619 631 641 643 647 653 659
            661,// 673 677 683 691 701 709 719 727 733
            739,// 743 751 757 761 769 773 787 797 809
            811,// 821 823 827 829 839 853 857 859 863
            877,// 881 883 887 907 911 919 929 937 941
            947,// 953 967 971 977 983 991 997 1009 1013
            1019,// 1021 1031 1033 1039 1049 1051 1061 1063 1069
            1087,// 1091 1093 1097 1103 1109 1117 1123 1129 1151
            1153,// 1163 1171 1181 1187 1193 1201 1213 1217 1223
            1229,// 1231 1237 1249 1259 1277 1279 1283 1289 1291
            1297,// 1301 1303 1307 1319 1321 1327 1361 1367 1373
            1381,// 1399 1409 1423 1427 1429 1433 1439 1447 1451
            1453,// 1459 1471 1481 1483 1487 1489 1493 1499 1511
            1523,// 1531 1543 1549 1553 1559 1567 1571 1579 1583
            1597,// 1601 1607 1609 1613 1619 1621 1627 1637 1657
            1663,// 1667 1669 1693 1697 1699 1709 1721 1723 1733
            1741,// 1747 1753 1759 1777 1783 1787 1789 1801 1811
            1823,// 1831 1847 1861 1867 1871 1873 1877 1879 1889
            1901,// 1907 1913 1931 1933 1949 1951 1973 1979 1987
            1993,// 1997 1999 2003 2011 2017 2027 2029 2039 2053
            2063,// 2069 2081 2083 2087 2089 2099 2111 2113 2129
            2131,// 2137 2141 2143 2153 2161 2179 2203 2207 2213
            2221,// 2237 2239 2243 2251 2267 2269 2273 2281 2287
            2293,// 2297 2309 2311 2333 2339 2341 2347 2351 2357
            2371,// 2377 2381 2383 2389 2393 2399 2411 2417 2423
            2437,// 2441 2447 2459 2467 2473 2477 2503 2521 2531
            2539,// 2543 2549 2551 2557 2579 2591 2593 2609 2617
            2621,// 2633 2647 2657 2659 2663 2671 2677 2683 2687
            2689,// 2693 2699 2707 2711 2713 2719 2729 2731 2741
            2749,// 2753 2767 2777 2789 2791 2797 2801 2803 2819
            2833,// 2837 2843 2851 2857 2861 2879 2887 2897 2903
            2909,// 2917 2927 2939 2953 2957 2963 2969 2971 2999
            3001,// 3011 3019 3023 3037 3041 3049 3061 3067 3079
            3083,// 3089 3109 3119 3121 3137 3163 3167 3169 3181
            3187,// 3191 3203 3209 3217 3221 3229 3251 3253 3257
            3259,// 3271 3299 3301 3307 3313 3319 3323 3329 3331
            3343,// 3347 3359 3361 3371 3373 3389 3391 3407 3413
            3433,// 3449 3457 3461 3463 3467 3469 3491 3499 3511
            3517,// 3527 3529 3533 3539 3541 3547 3557 3559 3571
            3581,// 3583 3593 3607 3613 3617 3623 3631 3637 3643
            3659,// 3671 3673 3677 3691 3697 3701 3709 3719 3727
            3733,// 3739 3761 3767 3769 3779 3793 3797 3803 3821
            3823,// 3833 3847 3851 3853 3863 3877 3881 3889 3907
            3911,// 3917 3919 3923 3929 3931 3943 3947 3967 3989
            4001,// 4003 4007 4013 4019 4021 4027 4049 4051 4057
            4073,// 4079 4091 4093 4099 4111 4127 4129 4133 4139
            4153,// 4157 4159 4177 4201 4211 4217 4219 4229 4231
            4241,// 4243 4253 4259 4261 4271 4273 4283 4289 4297
            4327,// 4337 4339 4349 4357 4363 4373 4391 4397 4409
            4421,// 4423 4441 4447 4451 4457 4463 4481 4483 4493
            4507,// 4513 4517 4519 4523 4547 4549 4561 4567 4583
            4591,// 4597 4603 4621 4637 4639 4643 4649 4651 4657
            4663,// 4673 4679 4691 4703 4721 4723 4729 4733 4751
            4759,// 4783 4787 4789 4793 4799 4801 4813 4817 4831
            4861,// 4871 4877 4889 4903 4909 4919 4931 4933 4937
            4943,// 4951 4957 4967 4969 4973 4987 4993 4999 5003
            5009,// 5011 5021 5023 5039 5051 5059 5077 5081 5087
            5099,// 5101 5107 5113 5119 5147 5153 5167 5171 5179
            5189,// 5197 5209 5227 5231 5233 5237 5261 5273 5279
            5281,// 5297 5303 5309 5323 5333 5347 5351 5381 5387
            5393,// 5399 5407 5413 5417 5419 5431 5437 5441 5443
            5449,// 5471 5477 5479 5483 5501 5503 5507 5519 5521
            5527,// 5531 5557 5563 5569 5573 5581 5591 5623 5639
            5641,// 5647 5651 5653 5657 5659 5669 5683 5689 5693
            5701,// 5711 5717 5737 5741 5743 5749 5779 5783 5791
            5801,// 5807 5813 5821 5827 5839 5843 5849 5851 5857
            5861,// 5867 5869 5879 5881 5897 5903 5923 5927 5939
            5953,// 5981 5987 6007 6011 6029 6037 6043 6047 6053
            6067,// 6073 6079 6089 6091 6101 6113 6121 6131 6133
            6143,// 6151 6163 6173 6197 6199 6203 6211 6217 6221
            6229,// 6247 6257 6263 6269 6271 6277 6287 6299 6301
            6311,// 6317 6323 6329 6337 6343 6353 6359 6361 6367
            6373,// 6379 6389 6397 6421 6427 6449 6451 6469 6473
            6481,// 6491 6521 6529 6547 6551 6553 6563 6569 6571
            6577,// 6581 6599 6607 6619 6637 6653 6659 6661 6673
            6679,// 6689 6691 6701 6703 6709 6719 6733 6737 6761
            6763,// 6779 6781 6791 6793 6803 6823 6827 6829 6833
            6841,// 6857 6863 6869 6871 6883 6899 6907 6911 6917
            6947,// 6949 6959 6961 6967 6971 6977 6983 6991 6997
            7001,// 7013 7019 7027 7039 7043 7057 7069 7079 7103
            7109,// 7121 7127 7129 7151 7159 7177 7187 7193 7207
            7211,// 7213 7219 7229 7237 7243 7247 7253 7283 7297
            7307,// 7309 7321 7331 7333 7349 7351 7369 7393 7411
            7417,// 7433 7451 7457 7459 7477 7481 7487 7489 7499
            7507,// 7517 7523 7529 7537 7541 7547 7549 7559 7561
            7573,// 7577 7583 7589 7591 7603 7607 7621 7639 7643
            7649,// 7669 7673 7681 7687 7691 7699 7703 7717 7723
            7727,// 7741 7753 7757 7759 7789 7793 7817 7823 7829
            7841,// 7853 7867 7873 7877 7879 7883 7901 7907 7919
    };

    /**
     * @param object
     *        the object to compute the hashcode for
     * @return the hashcode
     */
    public static int hashCode(@Nonnull OWLObject object) {try{__CLR4_5_263s63slvickpzf.R.inc(7912);
        __CLR4_5_263s63slvickpzf.R.inc(7913);checkNotNull(object, "object cannot be null");
        __CLR4_5_263s63slvickpzf.R.inc(7914);HashCode hashCode = new HashCode();
        __CLR4_5_263s63slvickpzf.R.inc(7915);object.accept(hashCode);
        __CLR4_5_263s63slvickpzf.R.inc(7916);return hashCode.hashCode;
    }finally{__CLR4_5_263s63slvickpzf.R.flushNeeded();}}

    @Override
    public void visit(OWLOntology ontology) {try{__CLR4_5_263s63slvickpzf.R.inc(7917);
        __CLR4_5_263s63slvickpzf.R.inc(7918);hashCode = ontology.getOntologyID().hashCode();
    }finally{__CLR4_5_263s63slvickpzf.R.flushNeeded();}}

    @Override
    public void visit(OWLAsymmetricObjectPropertyAxiom axiom) {try{__CLR4_5_263s63slvickpzf.R.inc(7919);
        __CLR4_5_263s63slvickpzf.R.inc(7920);hashCode = primes[0];
        __CLR4_5_263s63slvickpzf.R.inc(7921);hashCode = hashCode * MULT + axiom.getProperty().hashCode();
        __CLR4_5_263s63slvickpzf.R.inc(7922);hashCode = hashCode * MULT + axiom.getAnnotations().hashCode();
    }finally{__CLR4_5_263s63slvickpzf.R.flushNeeded();}}

    @Override
    public void visit(OWLClassAssertionAxiom axiom) {try{__CLR4_5_263s63slvickpzf.R.inc(7923);
        __CLR4_5_263s63slvickpzf.R.inc(7924);hashCode = primes[1];
        __CLR4_5_263s63slvickpzf.R.inc(7925);hashCode = hashCode * MULT + axiom.getIndividual().hashCode();
        __CLR4_5_263s63slvickpzf.R.inc(7926);hashCode = hashCode * MULT + axiom.getClassExpression().hashCode();
        __CLR4_5_263s63slvickpzf.R.inc(7927);hashCode = hashCode * MULT + axiom.getAnnotations().hashCode();
    }finally{__CLR4_5_263s63slvickpzf.R.flushNeeded();}}

    @Override
    public void visit(OWLDataPropertyAssertionAxiom axiom) {try{__CLR4_5_263s63slvickpzf.R.inc(7928);
        __CLR4_5_263s63slvickpzf.R.inc(7929);hashCode = primes[2];
        __CLR4_5_263s63slvickpzf.R.inc(7930);hashCode = hashCode * MULT + axiom.getSubject().hashCode();
        __CLR4_5_263s63slvickpzf.R.inc(7931);hashCode = hashCode * MULT + axiom.getProperty().hashCode();
        __CLR4_5_263s63slvickpzf.R.inc(7932);hashCode = hashCode * MULT + axiom.getObject().hashCode();
        __CLR4_5_263s63slvickpzf.R.inc(7933);hashCode = hashCode * MULT + axiom.getAnnotations().hashCode();
    }finally{__CLR4_5_263s63slvickpzf.R.flushNeeded();}}

    @Override
    public void visit(OWLDataPropertyDomainAxiom axiom) {try{__CLR4_5_263s63slvickpzf.R.inc(7934);
        __CLR4_5_263s63slvickpzf.R.inc(7935);hashCode = primes[3];
        __CLR4_5_263s63slvickpzf.R.inc(7936);hashCode = hashCode * MULT + axiom.getProperty().hashCode();
        __CLR4_5_263s63slvickpzf.R.inc(7937);hashCode = hashCode * MULT + axiom.getDomain().hashCode();
        __CLR4_5_263s63slvickpzf.R.inc(7938);hashCode = hashCode * MULT + axiom.getAnnotations().hashCode();
    }finally{__CLR4_5_263s63slvickpzf.R.flushNeeded();}}

    @Override
    public void visit(OWLDataPropertyRangeAxiom axiom) {try{__CLR4_5_263s63slvickpzf.R.inc(7939);
        __CLR4_5_263s63slvickpzf.R.inc(7940);hashCode = primes[4];
        __CLR4_5_263s63slvickpzf.R.inc(7941);hashCode = hashCode * MULT + axiom.getProperty().hashCode();
        __CLR4_5_263s63slvickpzf.R.inc(7942);hashCode = hashCode * MULT + axiom.getRange().hashCode();
        __CLR4_5_263s63slvickpzf.R.inc(7943);hashCode = hashCode * MULT + axiom.getAnnotations().hashCode();
    }finally{__CLR4_5_263s63slvickpzf.R.flushNeeded();}}

    @Override
    public void visit(OWLSubDataPropertyOfAxiom axiom) {try{__CLR4_5_263s63slvickpzf.R.inc(7944);
        __CLR4_5_263s63slvickpzf.R.inc(7945);hashCode = primes[5];
        __CLR4_5_263s63slvickpzf.R.inc(7946);hashCode = hashCode * MULT + axiom.getSubProperty().hashCode();
        __CLR4_5_263s63slvickpzf.R.inc(7947);hashCode = hashCode * MULT + axiom.getSuperProperty().hashCode();
        __CLR4_5_263s63slvickpzf.R.inc(7948);hashCode = hashCode * MULT + axiom.getAnnotations().hashCode();
    }finally{__CLR4_5_263s63slvickpzf.R.flushNeeded();}}

    @Override
    public void visit(OWLDeclarationAxiom axiom) {try{__CLR4_5_263s63slvickpzf.R.inc(7949);
        __CLR4_5_263s63slvickpzf.R.inc(7950);hashCode = primes[6];
        __CLR4_5_263s63slvickpzf.R.inc(7951);hashCode = hashCode * MULT + axiom.getEntity().hashCode();
        __CLR4_5_263s63slvickpzf.R.inc(7952);hashCode = hashCode * MULT + axiom.getAnnotations().hashCode();
    }finally{__CLR4_5_263s63slvickpzf.R.flushNeeded();}}

    @Override
    public void visit(OWLDifferentIndividualsAxiom axiom) {try{__CLR4_5_263s63slvickpzf.R.inc(7953);
        __CLR4_5_263s63slvickpzf.R.inc(7954);hashCode = primes[7];
        __CLR4_5_263s63slvickpzf.R.inc(7955);hashCode = hashCode * MULT + axiom.getIndividuals().hashCode();
        __CLR4_5_263s63slvickpzf.R.inc(7956);hashCode = hashCode * MULT + axiom.getAnnotations().hashCode();
    }finally{__CLR4_5_263s63slvickpzf.R.flushNeeded();}}

    @Override
    public void visit(OWLDisjointClassesAxiom axiom) {try{__CLR4_5_263s63slvickpzf.R.inc(7957);
        __CLR4_5_263s63slvickpzf.R.inc(7958);hashCode = primes[8];
        __CLR4_5_263s63slvickpzf.R.inc(7959);hashCode = hashCode * MULT + axiom.getClassExpressions().hashCode();
        __CLR4_5_263s63slvickpzf.R.inc(7960);hashCode = hashCode * MULT + axiom.getAnnotations().hashCode();
    }finally{__CLR4_5_263s63slvickpzf.R.flushNeeded();}}

    @Override
    public void visit(OWLDisjointDataPropertiesAxiom axiom) {try{__CLR4_5_263s63slvickpzf.R.inc(7961);
        __CLR4_5_263s63slvickpzf.R.inc(7962);hashCode = primes[9];
        __CLR4_5_263s63slvickpzf.R.inc(7963);hashCode = hashCode * MULT + axiom.getProperties().hashCode();
        __CLR4_5_263s63slvickpzf.R.inc(7964);hashCode = hashCode * MULT + axiom.getAnnotations().hashCode();
    }finally{__CLR4_5_263s63slvickpzf.R.flushNeeded();}}

    @Override
    public void visit(OWLDisjointObjectPropertiesAxiom axiom) {try{__CLR4_5_263s63slvickpzf.R.inc(7965);
        __CLR4_5_263s63slvickpzf.R.inc(7966);hashCode = primes[10];
        __CLR4_5_263s63slvickpzf.R.inc(7967);hashCode = hashCode * MULT + axiom.getProperties().hashCode();
        __CLR4_5_263s63slvickpzf.R.inc(7968);hashCode = hashCode * MULT + axiom.getAnnotations().hashCode();
    }finally{__CLR4_5_263s63slvickpzf.R.flushNeeded();}}

    @Override
    public void visit(OWLDisjointUnionAxiom axiom) {try{__CLR4_5_263s63slvickpzf.R.inc(7969);
        __CLR4_5_263s63slvickpzf.R.inc(7970);hashCode = primes[11];
        __CLR4_5_263s63slvickpzf.R.inc(7971);hashCode = hashCode * MULT + axiom.getOWLClass().hashCode();
        __CLR4_5_263s63slvickpzf.R.inc(7972);hashCode = hashCode * MULT + axiom.getClassExpressions().hashCode();
        __CLR4_5_263s63slvickpzf.R.inc(7973);hashCode = hashCode * MULT + axiom.getAnnotations().hashCode();
    }finally{__CLR4_5_263s63slvickpzf.R.flushNeeded();}}

    @Override
    public void visit(OWLAnnotationAssertionAxiom axiom) {try{__CLR4_5_263s63slvickpzf.R.inc(7974);
        __CLR4_5_263s63slvickpzf.R.inc(7975);hashCode = primes[12];
        __CLR4_5_263s63slvickpzf.R.inc(7976);hashCode = hashCode * MULT + axiom.getSubject().hashCode();
        __CLR4_5_263s63slvickpzf.R.inc(7977);hashCode = hashCode * MULT + axiom.getProperty().hashCode();
        __CLR4_5_263s63slvickpzf.R.inc(7978);hashCode = hashCode * MULT + axiom.getValue().hashCode();
        __CLR4_5_263s63slvickpzf.R.inc(7979);hashCode = hashCode * MULT + axiom.getAnnotations().hashCode();
    }finally{__CLR4_5_263s63slvickpzf.R.flushNeeded();}}

    @Override
    public void visit(OWLEquivalentClassesAxiom axiom) {try{__CLR4_5_263s63slvickpzf.R.inc(7980);
        __CLR4_5_263s63slvickpzf.R.inc(7981);hashCode = primes[13];
        __CLR4_5_263s63slvickpzf.R.inc(7982);hashCode = hashCode * MULT + axiom.getClassExpressions().hashCode();
        __CLR4_5_263s63slvickpzf.R.inc(7983);hashCode = hashCode * MULT + axiom.getAnnotations().hashCode();
    }finally{__CLR4_5_263s63slvickpzf.R.flushNeeded();}}

    @Override
    public void visit(OWLEquivalentDataPropertiesAxiom axiom) {try{__CLR4_5_263s63slvickpzf.R.inc(7984);
        __CLR4_5_263s63slvickpzf.R.inc(7985);hashCode = primes[14];
        __CLR4_5_263s63slvickpzf.R.inc(7986);hashCode = hashCode * MULT + axiom.getProperties().hashCode();
        __CLR4_5_263s63slvickpzf.R.inc(7987);hashCode = hashCode * MULT + axiom.getAnnotations().hashCode();
    }finally{__CLR4_5_263s63slvickpzf.R.flushNeeded();}}

    @Override
    public void visit(OWLEquivalentObjectPropertiesAxiom axiom) {try{__CLR4_5_263s63slvickpzf.R.inc(7988);
        __CLR4_5_263s63slvickpzf.R.inc(7989);hashCode = primes[15];
        __CLR4_5_263s63slvickpzf.R.inc(7990);hashCode = hashCode * MULT + axiom.getProperties().hashCode();
        __CLR4_5_263s63slvickpzf.R.inc(7991);hashCode = hashCode * MULT + axiom.getAnnotations().hashCode();
    }finally{__CLR4_5_263s63slvickpzf.R.flushNeeded();}}

    @Override
    public void visit(OWLFunctionalDataPropertyAxiom axiom) {try{__CLR4_5_263s63slvickpzf.R.inc(7992);
        __CLR4_5_263s63slvickpzf.R.inc(7993);hashCode = primes[16];
        __CLR4_5_263s63slvickpzf.R.inc(7994);hashCode = hashCode * MULT + axiom.getProperty().hashCode();
        __CLR4_5_263s63slvickpzf.R.inc(7995);hashCode = hashCode * MULT + axiom.getAnnotations().hashCode();
    }finally{__CLR4_5_263s63slvickpzf.R.flushNeeded();}}

    @Override
    public void visit(OWLFunctionalObjectPropertyAxiom axiom) {try{__CLR4_5_263s63slvickpzf.R.inc(7996);
        __CLR4_5_263s63slvickpzf.R.inc(7997);hashCode = primes[17];
        __CLR4_5_263s63slvickpzf.R.inc(7998);hashCode = hashCode * MULT + axiom.getProperty().hashCode();
        __CLR4_5_263s63slvickpzf.R.inc(7999);hashCode = hashCode * MULT + axiom.getAnnotations().hashCode();
    }finally{__CLR4_5_263s63slvickpzf.R.flushNeeded();}}

    @Override
    public void visit(OWLInverseFunctionalObjectPropertyAxiom axiom) {try{__CLR4_5_263s63slvickpzf.R.inc(8000);
        __CLR4_5_263s63slvickpzf.R.inc(8001);hashCode = primes[18];
        __CLR4_5_263s63slvickpzf.R.inc(8002);hashCode = hashCode * MULT + axiom.getProperty().hashCode();
        __CLR4_5_263s63slvickpzf.R.inc(8003);hashCode = hashCode * MULT + axiom.getAnnotations().hashCode();
    }finally{__CLR4_5_263s63slvickpzf.R.flushNeeded();}}

    @Override
    public void visit(OWLInverseObjectPropertiesAxiom axiom) {try{__CLR4_5_263s63slvickpzf.R.inc(8004);
        __CLR4_5_263s63slvickpzf.R.inc(8005);hashCode = primes[19];
        __CLR4_5_263s63slvickpzf.R.inc(8006);hashCode = hashCode * MULT + axiom.getFirstProperty().hashCode()
                + axiom.getSecondProperty().hashCode();
        __CLR4_5_263s63slvickpzf.R.inc(8007);hashCode = hashCode * MULT + axiom.getAnnotations().hashCode();
    }finally{__CLR4_5_263s63slvickpzf.R.flushNeeded();}}

    @Override
    public void visit(OWLIrreflexiveObjectPropertyAxiom axiom) {try{__CLR4_5_263s63slvickpzf.R.inc(8008);
        __CLR4_5_263s63slvickpzf.R.inc(8009);hashCode = primes[20];
        __CLR4_5_263s63slvickpzf.R.inc(8010);hashCode = hashCode * MULT + axiom.getProperty().hashCode();
        __CLR4_5_263s63slvickpzf.R.inc(8011);hashCode = hashCode * MULT + axiom.getAnnotations().hashCode();
    }finally{__CLR4_5_263s63slvickpzf.R.flushNeeded();}}

    @Override
    public void visit(OWLNegativeDataPropertyAssertionAxiom axiom) {try{__CLR4_5_263s63slvickpzf.R.inc(8012);
        __CLR4_5_263s63slvickpzf.R.inc(8013);hashCode = primes[21];
        __CLR4_5_263s63slvickpzf.R.inc(8014);hashCode = hashCode * MULT + axiom.getSubject().hashCode();
        __CLR4_5_263s63slvickpzf.R.inc(8015);hashCode = hashCode * MULT + axiom.getProperty().hashCode();
        __CLR4_5_263s63slvickpzf.R.inc(8016);hashCode = hashCode * MULT + axiom.getObject().hashCode();
        __CLR4_5_263s63slvickpzf.R.inc(8017);hashCode = hashCode * MULT + axiom.getAnnotations().hashCode();
    }finally{__CLR4_5_263s63slvickpzf.R.flushNeeded();}}

    @Override
    public void visit(OWLNegativeObjectPropertyAssertionAxiom axiom) {try{__CLR4_5_263s63slvickpzf.R.inc(8018);
        __CLR4_5_263s63slvickpzf.R.inc(8019);hashCode = primes[22];
        __CLR4_5_263s63slvickpzf.R.inc(8020);hashCode = hashCode * MULT + axiom.getSubject().hashCode();
        __CLR4_5_263s63slvickpzf.R.inc(8021);hashCode = hashCode * MULT + axiom.getProperty().hashCode();
        __CLR4_5_263s63slvickpzf.R.inc(8022);hashCode = hashCode * MULT + axiom.getObject().hashCode();
        __CLR4_5_263s63slvickpzf.R.inc(8023);hashCode = hashCode * MULT + axiom.getAnnotations().hashCode();
    }finally{__CLR4_5_263s63slvickpzf.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectPropertyAssertionAxiom axiom) {try{__CLR4_5_263s63slvickpzf.R.inc(8024);
        __CLR4_5_263s63slvickpzf.R.inc(8025);hashCode = primes[23];
        __CLR4_5_263s63slvickpzf.R.inc(8026);hashCode = hashCode * MULT + axiom.getSubject().hashCode();
        __CLR4_5_263s63slvickpzf.R.inc(8027);hashCode = hashCode * MULT + axiom.getProperty().hashCode();
        __CLR4_5_263s63slvickpzf.R.inc(8028);hashCode = hashCode * MULT + axiom.getObject().hashCode();
        __CLR4_5_263s63slvickpzf.R.inc(8029);hashCode = hashCode * MULT + axiom.getAnnotations().hashCode();
    }finally{__CLR4_5_263s63slvickpzf.R.flushNeeded();}}

    @Override
    public void visit(OWLSubPropertyChainOfAxiom axiom) {try{__CLR4_5_263s63slvickpzf.R.inc(8030);
        __CLR4_5_263s63slvickpzf.R.inc(8031);hashCode = primes[24];
        __CLR4_5_263s63slvickpzf.R.inc(8032);hashCode = hashCode * MULT + axiom.getPropertyChain().hashCode();
        __CLR4_5_263s63slvickpzf.R.inc(8033);hashCode = hashCode * MULT + axiom.getSuperProperty().hashCode();
        __CLR4_5_263s63slvickpzf.R.inc(8034);hashCode = hashCode * MULT + axiom.getAnnotations().hashCode();
    }finally{__CLR4_5_263s63slvickpzf.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectPropertyDomainAxiom axiom) {try{__CLR4_5_263s63slvickpzf.R.inc(8035);
        __CLR4_5_263s63slvickpzf.R.inc(8036);hashCode = primes[25];
        __CLR4_5_263s63slvickpzf.R.inc(8037);hashCode = hashCode * MULT + axiom.getProperty().hashCode();
        __CLR4_5_263s63slvickpzf.R.inc(8038);hashCode = hashCode * MULT + axiom.getDomain().hashCode();
        __CLR4_5_263s63slvickpzf.R.inc(8039);hashCode = hashCode * MULT + axiom.getAnnotations().hashCode();
    }finally{__CLR4_5_263s63slvickpzf.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectPropertyRangeAxiom axiom) {try{__CLR4_5_263s63slvickpzf.R.inc(8040);
        __CLR4_5_263s63slvickpzf.R.inc(8041);hashCode = primes[26];
        __CLR4_5_263s63slvickpzf.R.inc(8042);hashCode = hashCode * MULT + axiom.getProperty().hashCode();
        __CLR4_5_263s63slvickpzf.R.inc(8043);hashCode = hashCode * MULT + axiom.getRange().hashCode();
        __CLR4_5_263s63slvickpzf.R.inc(8044);hashCode = hashCode * MULT + axiom.getAnnotations().hashCode();
    }finally{__CLR4_5_263s63slvickpzf.R.flushNeeded();}}

    @Override
    public void visit(OWLSubObjectPropertyOfAxiom axiom) {try{__CLR4_5_263s63slvickpzf.R.inc(8045);
        __CLR4_5_263s63slvickpzf.R.inc(8046);hashCode = primes[27];
        __CLR4_5_263s63slvickpzf.R.inc(8047);hashCode = hashCode * MULT + axiom.getSubProperty().hashCode();
        __CLR4_5_263s63slvickpzf.R.inc(8048);hashCode = hashCode * MULT + axiom.getSuperProperty().hashCode();
        __CLR4_5_263s63slvickpzf.R.inc(8049);hashCode = hashCode * MULT + axiom.getAnnotations().hashCode();
    }finally{__CLR4_5_263s63slvickpzf.R.flushNeeded();}}

    @Override
    public void visit(OWLReflexiveObjectPropertyAxiom axiom) {try{__CLR4_5_263s63slvickpzf.R.inc(8050);
        __CLR4_5_263s63slvickpzf.R.inc(8051);hashCode = primes[28];
        __CLR4_5_263s63slvickpzf.R.inc(8052);hashCode = hashCode * MULT + axiom.getProperty().hashCode();
        __CLR4_5_263s63slvickpzf.R.inc(8053);hashCode = hashCode * MULT + axiom.getAnnotations().hashCode();
    }finally{__CLR4_5_263s63slvickpzf.R.flushNeeded();}}

    @Override
    public void visit(OWLSameIndividualAxiom axiom) {try{__CLR4_5_263s63slvickpzf.R.inc(8054);
        __CLR4_5_263s63slvickpzf.R.inc(8055);hashCode = primes[29];
        __CLR4_5_263s63slvickpzf.R.inc(8056);hashCode = hashCode * MULT + axiom.getIndividuals().hashCode();
        __CLR4_5_263s63slvickpzf.R.inc(8057);hashCode = hashCode * MULT + axiom.getAnnotations().hashCode();
    }finally{__CLR4_5_263s63slvickpzf.R.flushNeeded();}}

    @Override
    public void visit(OWLSubClassOfAxiom axiom) {try{__CLR4_5_263s63slvickpzf.R.inc(8058);
        __CLR4_5_263s63slvickpzf.R.inc(8059);hashCode = primes[30];
        __CLR4_5_263s63slvickpzf.R.inc(8060);hashCode = hashCode * MULT + axiom.getSubClass().hashCode();
        __CLR4_5_263s63slvickpzf.R.inc(8061);hashCode = hashCode * MULT + axiom.getSuperClass().hashCode();
        __CLR4_5_263s63slvickpzf.R.inc(8062);hashCode = hashCode * MULT + axiom.getAnnotations().hashCode();
    }finally{__CLR4_5_263s63slvickpzf.R.flushNeeded();}}

    @Override
    public void visit(OWLSymmetricObjectPropertyAxiom axiom) {try{__CLR4_5_263s63slvickpzf.R.inc(8063);
        __CLR4_5_263s63slvickpzf.R.inc(8064);hashCode = primes[31];
        __CLR4_5_263s63slvickpzf.R.inc(8065);hashCode = hashCode * MULT + axiom.getProperty().hashCode();
        __CLR4_5_263s63slvickpzf.R.inc(8066);hashCode = hashCode * MULT + axiom.getAnnotations().hashCode();
    }finally{__CLR4_5_263s63slvickpzf.R.flushNeeded();}}

    @Override
    public void visit(OWLTransitiveObjectPropertyAxiom axiom) {try{__CLR4_5_263s63slvickpzf.R.inc(8067);
        __CLR4_5_263s63slvickpzf.R.inc(8068);hashCode = primes[32];
        __CLR4_5_263s63slvickpzf.R.inc(8069);hashCode = hashCode * MULT + axiom.getProperty().hashCode();
        __CLR4_5_263s63slvickpzf.R.inc(8070);hashCode = hashCode * MULT + axiom.getAnnotations().hashCode();
    }finally{__CLR4_5_263s63slvickpzf.R.flushNeeded();}}

    @Override
    public void visit(OWLClass ce) {try{__CLR4_5_263s63slvickpzf.R.inc(8071);
        __CLR4_5_263s63slvickpzf.R.inc(8072);hashCode = primes[33];
        __CLR4_5_263s63slvickpzf.R.inc(8073);hashCode = hashCode * MULT + ce.getIRI().hashCode();
    }finally{__CLR4_5_263s63slvickpzf.R.flushNeeded();}}

    @Override
    public void visit(OWLDataAllValuesFrom ce) {try{__CLR4_5_263s63slvickpzf.R.inc(8074);
        __CLR4_5_263s63slvickpzf.R.inc(8075);hashCode = primes[34];
        __CLR4_5_263s63slvickpzf.R.inc(8076);hashCode = hashCode * MULT + ce.getProperty().hashCode();
        __CLR4_5_263s63slvickpzf.R.inc(8077);hashCode = hashCode * MULT + ce.getFiller().hashCode();
    }finally{__CLR4_5_263s63slvickpzf.R.flushNeeded();}}

    @Override
    public void visit(OWLDataExactCardinality ce) {try{__CLR4_5_263s63slvickpzf.R.inc(8078);
        __CLR4_5_263s63slvickpzf.R.inc(8079);hashCode = primes[35];
        __CLR4_5_263s63slvickpzf.R.inc(8080);hashCode = hashCode * MULT + ce.getProperty().hashCode();
        __CLR4_5_263s63slvickpzf.R.inc(8081);hashCode = hashCode * MULT + ce.getCardinality();
        __CLR4_5_263s63slvickpzf.R.inc(8082);hashCode = hashCode * MULT + ce.getFiller().hashCode();
    }finally{__CLR4_5_263s63slvickpzf.R.flushNeeded();}}

    @Override
    public void visit(OWLDataMaxCardinality ce) {try{__CLR4_5_263s63slvickpzf.R.inc(8083);
        __CLR4_5_263s63slvickpzf.R.inc(8084);hashCode = primes[36];
        __CLR4_5_263s63slvickpzf.R.inc(8085);hashCode = hashCode * MULT + ce.getProperty().hashCode();
        __CLR4_5_263s63slvickpzf.R.inc(8086);hashCode = hashCode * MULT + ce.getCardinality();
        __CLR4_5_263s63slvickpzf.R.inc(8087);hashCode = hashCode * MULT + ce.getFiller().hashCode();
    }finally{__CLR4_5_263s63slvickpzf.R.flushNeeded();}}

    @Override
    public void visit(OWLDataMinCardinality ce) {try{__CLR4_5_263s63slvickpzf.R.inc(8088);
        __CLR4_5_263s63slvickpzf.R.inc(8089);hashCode = primes[37];
        __CLR4_5_263s63slvickpzf.R.inc(8090);hashCode = hashCode * MULT + ce.getProperty().hashCode();
        __CLR4_5_263s63slvickpzf.R.inc(8091);hashCode = hashCode * MULT + ce.getCardinality();
        __CLR4_5_263s63slvickpzf.R.inc(8092);hashCode = hashCode * MULT + ce.getFiller().hashCode();
    }finally{__CLR4_5_263s63slvickpzf.R.flushNeeded();}}

    @Override
    public void visit(OWLDataSomeValuesFrom ce) {try{__CLR4_5_263s63slvickpzf.R.inc(8093);
        __CLR4_5_263s63slvickpzf.R.inc(8094);hashCode = primes[38];
        __CLR4_5_263s63slvickpzf.R.inc(8095);hashCode = hashCode * MULT + ce.getProperty().hashCode();
        __CLR4_5_263s63slvickpzf.R.inc(8096);hashCode = hashCode * MULT + ce.getFiller().hashCode();
    }finally{__CLR4_5_263s63slvickpzf.R.flushNeeded();}}

    @Override
    public void visit(OWLDataHasValue ce) {try{__CLR4_5_263s63slvickpzf.R.inc(8097);
        __CLR4_5_263s63slvickpzf.R.inc(8098);hashCode = primes[39];
        __CLR4_5_263s63slvickpzf.R.inc(8099);hashCode = hashCode * MULT + ce.getProperty().hashCode();
        __CLR4_5_263s63slvickpzf.R.inc(8100);hashCode = hashCode * MULT + ce.getFiller().hashCode();
    }finally{__CLR4_5_263s63slvickpzf.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectAllValuesFrom ce) {try{__CLR4_5_263s63slvickpzf.R.inc(8101);
        __CLR4_5_263s63slvickpzf.R.inc(8102);hashCode = primes[40];
        __CLR4_5_263s63slvickpzf.R.inc(8103);hashCode = hashCode * MULT + ce.getProperty().hashCode();
        __CLR4_5_263s63slvickpzf.R.inc(8104);hashCode = hashCode * MULT + ce.getFiller().hashCode();
    }finally{__CLR4_5_263s63slvickpzf.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectComplementOf ce) {try{__CLR4_5_263s63slvickpzf.R.inc(8105);
        __CLR4_5_263s63slvickpzf.R.inc(8106);hashCode = primes[41];
        __CLR4_5_263s63slvickpzf.R.inc(8107);hashCode = hashCode * MULT + ce.getOperand().hashCode();
    }finally{__CLR4_5_263s63slvickpzf.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectExactCardinality ce) {try{__CLR4_5_263s63slvickpzf.R.inc(8108);
        __CLR4_5_263s63slvickpzf.R.inc(8109);hashCode = primes[42];
        __CLR4_5_263s63slvickpzf.R.inc(8110);hashCode = hashCode * MULT + ce.getProperty().hashCode();
        __CLR4_5_263s63slvickpzf.R.inc(8111);hashCode = hashCode * MULT + ce.getCardinality();
        __CLR4_5_263s63slvickpzf.R.inc(8112);hashCode = hashCode * MULT + ce.getFiller().hashCode();
    }finally{__CLR4_5_263s63slvickpzf.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectIntersectionOf ce) {try{__CLR4_5_263s63slvickpzf.R.inc(8113);
        __CLR4_5_263s63slvickpzf.R.inc(8114);hashCode = primes[43];
        __CLR4_5_263s63slvickpzf.R.inc(8115);hashCode = hashCode * MULT + ce.getOperands().hashCode();
    }finally{__CLR4_5_263s63slvickpzf.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectMaxCardinality ce) {try{__CLR4_5_263s63slvickpzf.R.inc(8116);
        __CLR4_5_263s63slvickpzf.R.inc(8117);hashCode = primes[44];
        __CLR4_5_263s63slvickpzf.R.inc(8118);hashCode = hashCode * MULT + ce.getProperty().hashCode();
        __CLR4_5_263s63slvickpzf.R.inc(8119);hashCode = hashCode * MULT + ce.getCardinality();
        __CLR4_5_263s63slvickpzf.R.inc(8120);hashCode = hashCode * MULT + ce.getFiller().hashCode();
    }finally{__CLR4_5_263s63slvickpzf.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectMinCardinality ce) {try{__CLR4_5_263s63slvickpzf.R.inc(8121);
        __CLR4_5_263s63slvickpzf.R.inc(8122);hashCode = primes[45];
        __CLR4_5_263s63slvickpzf.R.inc(8123);hashCode = hashCode * MULT + ce.getProperty().hashCode();
        __CLR4_5_263s63slvickpzf.R.inc(8124);hashCode = hashCode * MULT + ce.getCardinality();
        __CLR4_5_263s63slvickpzf.R.inc(8125);hashCode = hashCode * MULT + ce.getFiller().hashCode();
    }finally{__CLR4_5_263s63slvickpzf.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectOneOf ce) {try{__CLR4_5_263s63slvickpzf.R.inc(8126);
        __CLR4_5_263s63slvickpzf.R.inc(8127);hashCode = primes[46];
        __CLR4_5_263s63slvickpzf.R.inc(8128);hashCode = hashCode * MULT + ce.getIndividuals().hashCode();
    }finally{__CLR4_5_263s63slvickpzf.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectHasSelf ce) {try{__CLR4_5_263s63slvickpzf.R.inc(8129);
        __CLR4_5_263s63slvickpzf.R.inc(8130);hashCode = primes[47];
        __CLR4_5_263s63slvickpzf.R.inc(8131);hashCode = hashCode * MULT + ce.getProperty().hashCode();
    }finally{__CLR4_5_263s63slvickpzf.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectSomeValuesFrom ce) {try{__CLR4_5_263s63slvickpzf.R.inc(8132);
        __CLR4_5_263s63slvickpzf.R.inc(8133);hashCode = primes[48];
        __CLR4_5_263s63slvickpzf.R.inc(8134);hashCode = hashCode * MULT + ce.getProperty().hashCode();
        __CLR4_5_263s63slvickpzf.R.inc(8135);hashCode = hashCode * MULT + ce.getFiller().hashCode();
    }finally{__CLR4_5_263s63slvickpzf.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectUnionOf ce) {try{__CLR4_5_263s63slvickpzf.R.inc(8136);
        __CLR4_5_263s63slvickpzf.R.inc(8137);hashCode = primes[49];
        __CLR4_5_263s63slvickpzf.R.inc(8138);hashCode = hashCode * MULT + ce.getOperands().hashCode();
    }finally{__CLR4_5_263s63slvickpzf.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectHasValue ce) {try{__CLR4_5_263s63slvickpzf.R.inc(8139);
        __CLR4_5_263s63slvickpzf.R.inc(8140);hashCode = primes[50];
        __CLR4_5_263s63slvickpzf.R.inc(8141);hashCode = hashCode * MULT + ce.getProperty().hashCode();
        __CLR4_5_263s63slvickpzf.R.inc(8142);hashCode = hashCode * MULT + ce.getFiller().hashCode();
    }finally{__CLR4_5_263s63slvickpzf.R.flushNeeded();}}

    @Override
    public void visit(OWLDataComplementOf node) {try{__CLR4_5_263s63slvickpzf.R.inc(8143);
        __CLR4_5_263s63slvickpzf.R.inc(8144);hashCode = primes[51];
        __CLR4_5_263s63slvickpzf.R.inc(8145);hashCode = hashCode * MULT + node.getDataRange().hashCode();
    }finally{__CLR4_5_263s63slvickpzf.R.flushNeeded();}}

    @Override
    public void visit(OWLDataOneOf node) {try{__CLR4_5_263s63slvickpzf.R.inc(8146);
        __CLR4_5_263s63slvickpzf.R.inc(8147);hashCode = primes[52];
        __CLR4_5_263s63slvickpzf.R.inc(8148);hashCode = hashCode * MULT + node.getValues().hashCode();
    }finally{__CLR4_5_263s63slvickpzf.R.flushNeeded();}}

    @Override
    public void visit(OWLDatatype node) {try{__CLR4_5_263s63slvickpzf.R.inc(8149);
        __CLR4_5_263s63slvickpzf.R.inc(8150);hashCode = primes[53];
        __CLR4_5_263s63slvickpzf.R.inc(8151);hashCode = hashCode * MULT + node.getIRI().hashCode();
    }finally{__CLR4_5_263s63slvickpzf.R.flushNeeded();}}

    @Override
    public void visit(OWLDatatypeRestriction node) {try{__CLR4_5_263s63slvickpzf.R.inc(8152);
        __CLR4_5_263s63slvickpzf.R.inc(8153);hashCode = primes[54];
        __CLR4_5_263s63slvickpzf.R.inc(8154);hashCode = hashCode * MULT + node.getDatatype().hashCode();
        __CLR4_5_263s63slvickpzf.R.inc(8155);hashCode = hashCode * MULT + node.getFacetRestrictions().hashCode();
    }finally{__CLR4_5_263s63slvickpzf.R.flushNeeded();}}

    @Override
    public void visit(OWLDataProperty property) {try{__CLR4_5_263s63slvickpzf.R.inc(8156);
        __CLR4_5_263s63slvickpzf.R.inc(8157);hashCode = primes[55];
        __CLR4_5_263s63slvickpzf.R.inc(8158);hashCode = hashCode * MULT + property.getIRI().hashCode();
    }finally{__CLR4_5_263s63slvickpzf.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectProperty property) {try{__CLR4_5_263s63slvickpzf.R.inc(8159);
        __CLR4_5_263s63slvickpzf.R.inc(8160);hashCode = primes[56];
        __CLR4_5_263s63slvickpzf.R.inc(8161);hashCode = hashCode * MULT + property.getIRI().hashCode();
    }finally{__CLR4_5_263s63slvickpzf.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectInverseOf property) {try{__CLR4_5_263s63slvickpzf.R.inc(8162);
        __CLR4_5_263s63slvickpzf.R.inc(8163);hashCode = primes[57];
        __CLR4_5_263s63slvickpzf.R.inc(8164);hashCode = hashCode * MULT + property.getInverse().hashCode();
    }finally{__CLR4_5_263s63slvickpzf.R.flushNeeded();}}

    @Override
    public void visit(OWLNamedIndividual individual) {try{__CLR4_5_263s63slvickpzf.R.inc(8165);
        __CLR4_5_263s63slvickpzf.R.inc(8166);hashCode = primes[58];
        __CLR4_5_263s63slvickpzf.R.inc(8167);hashCode = hashCode * MULT + individual.getIRI().hashCode();
    }finally{__CLR4_5_263s63slvickpzf.R.flushNeeded();}}

    @Override
    public void visit(OWLFacetRestriction node) {try{__CLR4_5_263s63slvickpzf.R.inc(8168);
        __CLR4_5_263s63slvickpzf.R.inc(8169);hashCode = primes[59];
        __CLR4_5_263s63slvickpzf.R.inc(8170);hashCode = hashCode * MULT + node.getFacet().hashCode();
        __CLR4_5_263s63slvickpzf.R.inc(8171);hashCode = hashCode * MULT + node.getFacetValue().hashCode();
    }finally{__CLR4_5_263s63slvickpzf.R.flushNeeded();}}

    @Override
    public void visit(OWLLiteral node) {try{__CLR4_5_263s63slvickpzf.R.inc(8172);
        __CLR4_5_263s63slvickpzf.R.inc(8173);hashCode = node.hashCode();
    }finally{__CLR4_5_263s63slvickpzf.R.flushNeeded();}}

    @Override
    public void visit(SWRLRule rule) {try{__CLR4_5_263s63slvickpzf.R.inc(8174);
        __CLR4_5_263s63slvickpzf.R.inc(8175);hashCode = primes[61];
        __CLR4_5_263s63slvickpzf.R.inc(8176);hashCode = hashCode * MULT + rule.getBody().hashCode();
        __CLR4_5_263s63slvickpzf.R.inc(8177);hashCode = hashCode * MULT + rule.getHead().hashCode();
    }finally{__CLR4_5_263s63slvickpzf.R.flushNeeded();}}

    @Override
    public void visit(SWRLClassAtom node) {try{__CLR4_5_263s63slvickpzf.R.inc(8178);
        __CLR4_5_263s63slvickpzf.R.inc(8179);hashCode = primes[62];
        __CLR4_5_263s63slvickpzf.R.inc(8180);hashCode = hashCode * MULT + node.getArgument().hashCode();
        __CLR4_5_263s63slvickpzf.R.inc(8181);hashCode = hashCode * MULT + node.getPredicate().hashCode();
    }finally{__CLR4_5_263s63slvickpzf.R.flushNeeded();}}

    @Override
    public void visit(SWRLDataRangeAtom node) {try{__CLR4_5_263s63slvickpzf.R.inc(8182);
        __CLR4_5_263s63slvickpzf.R.inc(8183);hashCode = primes[63];
        __CLR4_5_263s63slvickpzf.R.inc(8184);hashCode = hashCode * MULT + node.getArgument().hashCode();
        __CLR4_5_263s63slvickpzf.R.inc(8185);hashCode = hashCode * MULT + node.getPredicate().hashCode();
    }finally{__CLR4_5_263s63slvickpzf.R.flushNeeded();}}

    @Override
    public void visit(SWRLObjectPropertyAtom node) {try{__CLR4_5_263s63slvickpzf.R.inc(8186);
        __CLR4_5_263s63slvickpzf.R.inc(8187);hashCode = primes[64];
        __CLR4_5_263s63slvickpzf.R.inc(8188);hashCode = hashCode * MULT + node.getFirstArgument().hashCode();
        __CLR4_5_263s63slvickpzf.R.inc(8189);hashCode = hashCode * MULT + node.getSecondArgument().hashCode();
        __CLR4_5_263s63slvickpzf.R.inc(8190);hashCode = hashCode * MULT + node.getPredicate().hashCode();
    }finally{__CLR4_5_263s63slvickpzf.R.flushNeeded();}}

    @Override
    public void visit(SWRLDataPropertyAtom node) {try{__CLR4_5_263s63slvickpzf.R.inc(8191);
        __CLR4_5_263s63slvickpzf.R.inc(8192);hashCode = primes[65];
        __CLR4_5_263s63slvickpzf.R.inc(8193);hashCode = hashCode * MULT + node.getFirstArgument().hashCode();
        __CLR4_5_263s63slvickpzf.R.inc(8194);hashCode = hashCode * MULT + node.getSecondArgument().hashCode();
        __CLR4_5_263s63slvickpzf.R.inc(8195);hashCode = hashCode * MULT + node.getPredicate().hashCode();
    }finally{__CLR4_5_263s63slvickpzf.R.flushNeeded();}}

    @Override
    public void visit(SWRLBuiltInAtom node) {try{__CLR4_5_263s63slvickpzf.R.inc(8196);
        __CLR4_5_263s63slvickpzf.R.inc(8197);hashCode = primes[66];
        __CLR4_5_263s63slvickpzf.R.inc(8198);hashCode = hashCode * MULT + node.getAllArguments().hashCode();
        __CLR4_5_263s63slvickpzf.R.inc(8199);hashCode = hashCode * MULT + node.getPredicate().hashCode();
    }finally{__CLR4_5_263s63slvickpzf.R.flushNeeded();}}

    @Override
    public void visit(SWRLVariable node) {try{__CLR4_5_263s63slvickpzf.R.inc(8200);
        __CLR4_5_263s63slvickpzf.R.inc(8201);hashCode = primes[67];
        __CLR4_5_263s63slvickpzf.R.inc(8202);hashCode = hashCode * MULT + node.getIRI().hashCode();
    }finally{__CLR4_5_263s63slvickpzf.R.flushNeeded();}}

    @Override
    public void visit(SWRLIndividualArgument node) {try{__CLR4_5_263s63slvickpzf.R.inc(8203);
        __CLR4_5_263s63slvickpzf.R.inc(8204);hashCode = primes[68];
        __CLR4_5_263s63slvickpzf.R.inc(8205);hashCode = hashCode * MULT + node.getIndividual().hashCode();
    }finally{__CLR4_5_263s63slvickpzf.R.flushNeeded();}}

    @Override
    public void visit(SWRLLiteralArgument node) {try{__CLR4_5_263s63slvickpzf.R.inc(8206);
        __CLR4_5_263s63slvickpzf.R.inc(8207);hashCode = primes[69];
        __CLR4_5_263s63slvickpzf.R.inc(8208);hashCode = hashCode * MULT + node.getLiteral().hashCode();
    }finally{__CLR4_5_263s63slvickpzf.R.flushNeeded();}}

    @Override
    public void visit(SWRLDifferentIndividualsAtom node) {try{__CLR4_5_263s63slvickpzf.R.inc(8209);
        __CLR4_5_263s63slvickpzf.R.inc(8210);hashCode = primes[70];
        __CLR4_5_263s63slvickpzf.R.inc(8211);hashCode = hashCode * MULT + node.getFirstArgument().hashCode();
        __CLR4_5_263s63slvickpzf.R.inc(8212);hashCode = hashCode * MULT + node.getSecondArgument().hashCode();
    }finally{__CLR4_5_263s63slvickpzf.R.flushNeeded();}}

    @Override
    public void visit(SWRLSameIndividualAtom node) {try{__CLR4_5_263s63slvickpzf.R.inc(8213);
        __CLR4_5_263s63slvickpzf.R.inc(8214);hashCode = primes[71];
        __CLR4_5_263s63slvickpzf.R.inc(8215);hashCode = hashCode * MULT + node.getFirstArgument().hashCode();
        __CLR4_5_263s63slvickpzf.R.inc(8216);hashCode = hashCode * MULT + node.getSecondArgument().hashCode();
    }finally{__CLR4_5_263s63slvickpzf.R.flushNeeded();}}

    @Override
    public void visit(OWLHasKeyAxiom axiom) {try{__CLR4_5_263s63slvickpzf.R.inc(8217);
        __CLR4_5_263s63slvickpzf.R.inc(8218);hashCode = primes[72];
        __CLR4_5_263s63slvickpzf.R.inc(8219);hashCode = hashCode * MULT + axiom.getClassExpression().hashCode();
        __CLR4_5_263s63slvickpzf.R.inc(8220);hashCode = hashCode * MULT + axiom.getPropertyExpressions().hashCode();
    }finally{__CLR4_5_263s63slvickpzf.R.flushNeeded();}}

    @Override
    public void visit(OWLAnnotationPropertyDomainAxiom axiom) {try{__CLR4_5_263s63slvickpzf.R.inc(8221);
        __CLR4_5_263s63slvickpzf.R.inc(8222);hashCode = primes[73];
        __CLR4_5_263s63slvickpzf.R.inc(8223);hashCode = hashCode * MULT + axiom.getProperty().hashCode();
        __CLR4_5_263s63slvickpzf.R.inc(8224);hashCode = hashCode * MULT + axiom.getDomain().hashCode();
    }finally{__CLR4_5_263s63slvickpzf.R.flushNeeded();}}

    @Override
    public void visit(OWLAnnotationPropertyRangeAxiom axiom) {try{__CLR4_5_263s63slvickpzf.R.inc(8225);
        __CLR4_5_263s63slvickpzf.R.inc(8226);hashCode = primes[74];
        __CLR4_5_263s63slvickpzf.R.inc(8227);hashCode = hashCode * MULT + axiom.getProperty().hashCode();
        __CLR4_5_263s63slvickpzf.R.inc(8228);hashCode = hashCode * MULT + axiom.getRange().hashCode();
    }finally{__CLR4_5_263s63slvickpzf.R.flushNeeded();}}

    @Override
    public void visit(OWLSubAnnotationPropertyOfAxiom axiom) {try{__CLR4_5_263s63slvickpzf.R.inc(8229);
        __CLR4_5_263s63slvickpzf.R.inc(8230);hashCode = primes[75];
        __CLR4_5_263s63slvickpzf.R.inc(8231);hashCode = hashCode * MULT + axiom.getSubProperty().hashCode();
        __CLR4_5_263s63slvickpzf.R.inc(8232);hashCode = hashCode * MULT + axiom.getSuperProperty().hashCode();
    }finally{__CLR4_5_263s63slvickpzf.R.flushNeeded();}}

    @Override
    public void visit(OWLDataIntersectionOf node) {try{__CLR4_5_263s63slvickpzf.R.inc(8233);
        __CLR4_5_263s63slvickpzf.R.inc(8234);hashCode = primes[76];
        __CLR4_5_263s63slvickpzf.R.inc(8235);hashCode = hashCode * MULT + node.getOperands().hashCode();
    }finally{__CLR4_5_263s63slvickpzf.R.flushNeeded();}}

    @Override
    public void visit(OWLDataUnionOf node) {try{__CLR4_5_263s63slvickpzf.R.inc(8236);
        __CLR4_5_263s63slvickpzf.R.inc(8237);hashCode = primes[77];
        __CLR4_5_263s63slvickpzf.R.inc(8238);hashCode = hashCode * MULT + node.getOperands().hashCode();
    }finally{__CLR4_5_263s63slvickpzf.R.flushNeeded();}}

    @Override
    public void visit(OWLAnnotationProperty property) {try{__CLR4_5_263s63slvickpzf.R.inc(8239);
        __CLR4_5_263s63slvickpzf.R.inc(8240);hashCode = primes[78];
        __CLR4_5_263s63slvickpzf.R.inc(8241);hashCode = hashCode * MULT + property.getIRI().hashCode();
    }finally{__CLR4_5_263s63slvickpzf.R.flushNeeded();}}

    @Override
    public void visit(OWLAnonymousIndividual individual) {try{__CLR4_5_263s63slvickpzf.R.inc(8242);
        __CLR4_5_263s63slvickpzf.R.inc(8243);hashCode = primes[79];
        __CLR4_5_263s63slvickpzf.R.inc(8244);hashCode = hashCode * MULT + individual.getID().hashCode();
    }finally{__CLR4_5_263s63slvickpzf.R.flushNeeded();}}

    @Override
    public void visit(IRI iri) {try{__CLR4_5_263s63slvickpzf.R.inc(8245);
        __CLR4_5_263s63slvickpzf.R.inc(8246);hashCode = primes[80];
        __CLR4_5_263s63slvickpzf.R.inc(8247);hashCode = hashCode * MULT + iri.toURI().hashCode();
    }finally{__CLR4_5_263s63slvickpzf.R.flushNeeded();}}

    @Override
    public void visit(OWLAnnotation node) {try{__CLR4_5_263s63slvickpzf.R.inc(8248);
        __CLR4_5_263s63slvickpzf.R.inc(8249);hashCode = primes[81];
        __CLR4_5_263s63slvickpzf.R.inc(8250);hashCode = hashCode * MULT + node.getProperty().hashCode();
        __CLR4_5_263s63slvickpzf.R.inc(8251);hashCode = hashCode * MULT + node.getValue().hashCode();
    }finally{__CLR4_5_263s63slvickpzf.R.flushNeeded();}}

    @Override
    public void visit(OWLDatatypeDefinitionAxiom axiom) {try{__CLR4_5_263s63slvickpzf.R.inc(8252);
        __CLR4_5_263s63slvickpzf.R.inc(8253);hashCode = primes[82];
        __CLR4_5_263s63slvickpzf.R.inc(8254);hashCode = hashCode * MULT + axiom.getDatatype().hashCode();
        __CLR4_5_263s63slvickpzf.R.inc(8255);hashCode = hashCode * MULT + axiom.getDataRange().hashCode();
    }finally{__CLR4_5_263s63slvickpzf.R.flushNeeded();}}
}
