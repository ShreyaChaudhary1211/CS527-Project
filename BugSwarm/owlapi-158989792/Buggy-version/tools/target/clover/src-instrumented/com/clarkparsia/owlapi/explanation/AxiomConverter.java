/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.clarkparsia.owlapi.explanation;

import static org.semanticweb.owlapi.util.OWLAPIPreconditions.verifyNotNull;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.OWLClassAssertionAxiom;
import org.semanticweb.owlapi.model.OWLClassExpression;
import org.semanticweb.owlapi.model.OWLDataFactory;
import org.semanticweb.owlapi.model.OWLDataPropertyAssertionAxiom;
import org.semanticweb.owlapi.model.OWLDataPropertyDomainAxiom;
import org.semanticweb.owlapi.model.OWLDataPropertyRangeAxiom;
import org.semanticweb.owlapi.model.OWLDifferentIndividualsAxiom;
import org.semanticweb.owlapi.model.OWLDisjointClassesAxiom;
import org.semanticweb.owlapi.model.OWLEquivalentClassesAxiom;
import org.semanticweb.owlapi.model.OWLIndividual;
import org.semanticweb.owlapi.model.OWLNegativeDataPropertyAssertionAxiom;
import org.semanticweb.owlapi.model.OWLNegativeObjectPropertyAssertionAxiom;
import org.semanticweb.owlapi.model.OWLObjectComplementOf;
import org.semanticweb.owlapi.model.OWLObjectIntersectionOf;
import org.semanticweb.owlapi.model.OWLObjectOneOf;
import org.semanticweb.owlapi.model.OWLObjectPropertyAssertionAxiom;
import org.semanticweb.owlapi.model.OWLObjectPropertyDomainAxiom;
import org.semanticweb.owlapi.model.OWLObjectPropertyRangeAxiom;
import org.semanticweb.owlapi.model.OWLObjectUnionOf;
import org.semanticweb.owlapi.model.OWLRuntimeException;
import org.semanticweb.owlapi.model.OWLSameIndividualAxiom;
import org.semanticweb.owlapi.model.OWLSubClassOfAxiom;
import org.semanticweb.owlapi.util.CollectionFactory;
import org.semanticweb.owlapi.util.OWLAxiomVisitorExAdapter;

/** The Class AxiomConverter. */
class AxiomConverter extends OWLAxiomVisitorExAdapter<OWLClassExpression> {public static class __CLR4_5_200lviclyja{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u006f\u006f\u006c\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237269396L,8589935092L,100,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final OWLDataFactory factory;

    AxiomConverter(OWLDataFactory df) {
        super(df.getOWLThing());__CLR4_5_200lviclyja.R.inc(1);try{__CLR4_5_200lviclyja.R.inc(0);
        __CLR4_5_200lviclyja.R.inc(2);factory = df;
    }finally{__CLR4_5_200lviclyja.R.flushNeeded();}}

    @Nonnull
    private OWLObjectIntersectionOf and(@Nonnull OWLClassExpression desc1,
            @Nonnull OWLClassExpression desc2) {try{__CLR4_5_200lviclyja.R.inc(3);
        __CLR4_5_200lviclyja.R.inc(4);return factory.getOWLObjectIntersectionOf(set(desc1, desc2));
    }finally{__CLR4_5_200lviclyja.R.flushNeeded();}}

    @Nonnull
    private OWLObjectIntersectionOf and(@Nonnull Set<OWLClassExpression> set) {try{__CLR4_5_200lviclyja.R.inc(5);
        __CLR4_5_200lviclyja.R.inc(6);return factory.getOWLObjectIntersectionOf(set);
    }finally{__CLR4_5_200lviclyja.R.flushNeeded();}}

    @Nonnull
    private OWLObjectComplementOf not(@Nonnull OWLClassExpression desc) {try{__CLR4_5_200lviclyja.R.inc(7);
        __CLR4_5_200lviclyja.R.inc(8);return factory.getOWLObjectComplementOf(desc);
    }finally{__CLR4_5_200lviclyja.R.flushNeeded();}}

    @Nonnull
    private OWLObjectOneOf oneOf(@Nonnull OWLIndividual ind) {try{__CLR4_5_200lviclyja.R.inc(9);
        __CLR4_5_200lviclyja.R.inc(10);return factory.getOWLObjectOneOf(CollectionFactory.createSet(ind));
    }finally{__CLR4_5_200lviclyja.R.flushNeeded();}}

    @Nonnull
    private OWLObjectUnionOf or(@Nonnull OWLClassExpression desc1,
            @Nonnull OWLClassExpression desc2) {try{__CLR4_5_200lviclyja.R.inc(11);
        __CLR4_5_200lviclyja.R.inc(12);return factory.getOWLObjectUnionOf(set(desc1, desc2));
    }finally{__CLR4_5_200lviclyja.R.flushNeeded();}}

    @Nonnull
    private static <T> Set<T> set(@Nonnull T desc1, @Nonnull T desc2) {try{__CLR4_5_200lviclyja.R.inc(13);
        __CLR4_5_200lviclyja.R.inc(14);Set<T> set = new HashSet<>();
        __CLR4_5_200lviclyja.R.inc(15);set.add(desc1);
        __CLR4_5_200lviclyja.R.inc(16);set.add(desc2);
        __CLR4_5_200lviclyja.R.inc(17);return set;
    }finally{__CLR4_5_200lviclyja.R.flushNeeded();}}

    @Override
    protected OWLClassExpression doDefault(OWLAxiom object) {try{__CLR4_5_200lviclyja.R.inc(18);
        __CLR4_5_200lviclyja.R.inc(19);throw new OWLRuntimeException(
                "Not implemented: Cannot generate explanation for " + object);
    }finally{__CLR4_5_200lviclyja.R.flushNeeded();}}

    @Override
    public OWLClassExpression visit(OWLClassAssertionAxiom axiom) {try{__CLR4_5_200lviclyja.R.inc(20);
        __CLR4_5_200lviclyja.R.inc(21);OWLIndividual ind = axiom.getIndividual();
        __CLR4_5_200lviclyja.R.inc(22);OWLClassExpression c = axiom.getClassExpression();
        __CLR4_5_200lviclyja.R.inc(23);return and(oneOf(ind), not(c));
    }finally{__CLR4_5_200lviclyja.R.flushNeeded();}}

    @Override
    public OWLClassExpression visit(OWLDataPropertyAssertionAxiom axiom) {try{__CLR4_5_200lviclyja.R.inc(24);
        __CLR4_5_200lviclyja.R.inc(25);OWLClassExpression sub = oneOf(axiom.getSubject());
        __CLR4_5_200lviclyja.R.inc(26);OWLClassExpression sup = factory.getOWLDataHasValue(
                axiom.getProperty(), axiom.getObject());
        __CLR4_5_200lviclyja.R.inc(27);OWLSubClassOfAxiom ax = factory.getOWLSubClassOfAxiom(sub, sup);
        __CLR4_5_200lviclyja.R.inc(28);return ax.accept(this);
    }finally{__CLR4_5_200lviclyja.R.flushNeeded();}}

    @Override
    public OWLClassExpression visit(OWLDataPropertyDomainAxiom axiom) {try{__CLR4_5_200lviclyja.R.inc(29);
        __CLR4_5_200lviclyja.R.inc(30);OWLClassExpression sub = factory.getOWLDataSomeValuesFrom(
                axiom.getProperty(), factory.getTopDatatype());
        __CLR4_5_200lviclyja.R.inc(31);return and(sub, not(axiom.getDomain()));
    }finally{__CLR4_5_200lviclyja.R.flushNeeded();}}

    @Override
    public OWLClassExpression visit(OWLDataPropertyRangeAxiom axiom) {try{__CLR4_5_200lviclyja.R.inc(32);
        __CLR4_5_200lviclyja.R.inc(33);return factory.getOWLDataSomeValuesFrom(axiom.getProperty(),
                factory.getOWLDataComplementOf(axiom.getRange()));
    }finally{__CLR4_5_200lviclyja.R.flushNeeded();}}

    @Override
    public OWLClassExpression visit(OWLDifferentIndividualsAxiom axiom) {try{__CLR4_5_200lviclyja.R.inc(34);
        __CLR4_5_200lviclyja.R.inc(35);Set<OWLClassExpression> nominals = new HashSet<>();
        __CLR4_5_200lviclyja.R.inc(36);for (OWLIndividual ind : axiom.getIndividuals()) {{
            assert (((ind != null)&&(__CLR4_5_200lviclyja.R.iget(37)!=0|true))||(__CLR4_5_200lviclyja.R.iget(38)==0&false));
            __CLR4_5_200lviclyja.R.inc(39);nominals.add(oneOf(ind));
        }
        }__CLR4_5_200lviclyja.R.inc(40);return factory.getOWLObjectIntersectionOf(nominals);
    }finally{__CLR4_5_200lviclyja.R.flushNeeded();}}

    @Override
    public OWLClassExpression visit(OWLDisjointClassesAxiom axiom) {try{__CLR4_5_200lviclyja.R.inc(41);
        __CLR4_5_200lviclyja.R.inc(42);return and(axiom.getClassExpressions());
    }finally{__CLR4_5_200lviclyja.R.flushNeeded();}}

    @Override
    public OWLClassExpression visit(OWLEquivalentClassesAxiom axiom) {try{__CLR4_5_200lviclyja.R.inc(43);
        __CLR4_5_200lviclyja.R.inc(44);Iterator<OWLClassExpression> classes = axiom.getClassExpressions()
                .iterator();
        __CLR4_5_200lviclyja.R.inc(45);OWLClassExpression c1 = classes.next();
        __CLR4_5_200lviclyja.R.inc(46);OWLClassExpression c2 = classes.next();
        // apply simplification for the cases where either concept is
        // owl:Thing or owlapi:Nothing
        __CLR4_5_200lviclyja.R.inc(47);if ((((c1.isOWLNothing())&&(__CLR4_5_200lviclyja.R.iget(48)!=0|true))||(__CLR4_5_200lviclyja.R.iget(49)==0&false))) {{
            __CLR4_5_200lviclyja.R.inc(50);return verifyNotNull(c2);
        } }else {__CLR4_5_200lviclyja.R.inc(51);if ((((c2.isOWLNothing())&&(__CLR4_5_200lviclyja.R.iget(52)!=0|true))||(__CLR4_5_200lviclyja.R.iget(53)==0&false))) {{
            __CLR4_5_200lviclyja.R.inc(54);return c1;
        } }else {__CLR4_5_200lviclyja.R.inc(55);if ((((c1.isOWLThing())&&(__CLR4_5_200lviclyja.R.iget(56)!=0|true))||(__CLR4_5_200lviclyja.R.iget(57)==0&false))) {{
            __CLR4_5_200lviclyja.R.inc(58);return not(c2);
        } }else {__CLR4_5_200lviclyja.R.inc(59);if ((((c2.isOWLThing())&&(__CLR4_5_200lviclyja.R.iget(60)!=0|true))||(__CLR4_5_200lviclyja.R.iget(61)==0&false))) {{
            __CLR4_5_200lviclyja.R.inc(62);return not(c1);
        } }else {{
            __CLR4_5_200lviclyja.R.inc(63);return or(and(c1, not(c2)), and(not(c1), c2));
        }
    }}}}}finally{__CLR4_5_200lviclyja.R.flushNeeded();}}

    @Override
    public OWLClassExpression
            visit(OWLNegativeDataPropertyAssertionAxiom axiom) {try{__CLR4_5_200lviclyja.R.inc(64);
        __CLR4_5_200lviclyja.R.inc(65);OWLClassExpression sub = oneOf(axiom.getSubject());
        __CLR4_5_200lviclyja.R.inc(66);OWLClassExpression sup = factory.getOWLDataHasValue(
                axiom.getProperty(), axiom.getObject());
        __CLR4_5_200lviclyja.R.inc(67);return factory.getOWLSubClassOfAxiom(sub, not(sup)).accept(this);
    }finally{__CLR4_5_200lviclyja.R.flushNeeded();}}

    @Override
    public OWLClassExpression visit(
            OWLNegativeObjectPropertyAssertionAxiom axiom) {try{__CLR4_5_200lviclyja.R.inc(68);
        __CLR4_5_200lviclyja.R.inc(69);OWLClassExpression sub = oneOf(axiom.getSubject());
        __CLR4_5_200lviclyja.R.inc(70);OWLClassExpression sup = factory.getOWLObjectHasValue(
                axiom.getProperty(), axiom.getObject());
        __CLR4_5_200lviclyja.R.inc(71);return factory.getOWLSubClassOfAxiom(sub, not(sup)).accept(this);
    }finally{__CLR4_5_200lviclyja.R.flushNeeded();}}

    @Override
    public OWLClassExpression visit(OWLObjectPropertyAssertionAxiom axiom) {try{__CLR4_5_200lviclyja.R.inc(72);
        __CLR4_5_200lviclyja.R.inc(73);OWLClassExpression sub = oneOf(axiom.getSubject());
        __CLR4_5_200lviclyja.R.inc(74);OWLClassExpression sup = factory.getOWLObjectHasValue(
                axiom.getProperty(), axiom.getObject());
        __CLR4_5_200lviclyja.R.inc(75);OWLSubClassOfAxiom ax = factory.getOWLSubClassOfAxiom(sub, sup);
        __CLR4_5_200lviclyja.R.inc(76);return ax.accept(this);
    }finally{__CLR4_5_200lviclyja.R.flushNeeded();}}

    @Override
    public OWLClassExpression visit(OWLObjectPropertyDomainAxiom axiom) {try{__CLR4_5_200lviclyja.R.inc(77);
        __CLR4_5_200lviclyja.R.inc(78);return and(
                factory.getOWLObjectSomeValuesFrom(axiom.getProperty(),
                        factory.getOWLThing()), not(axiom.getDomain()));
    }finally{__CLR4_5_200lviclyja.R.flushNeeded();}}

    @Override
    public OWLClassExpression visit(OWLObjectPropertyRangeAxiom axiom) {try{__CLR4_5_200lviclyja.R.inc(79);
        __CLR4_5_200lviclyja.R.inc(80);return factory.getOWLObjectSomeValuesFrom(axiom.getProperty(),
                not(axiom.getRange()));
    }finally{__CLR4_5_200lviclyja.R.flushNeeded();}}

    @Override
    public OWLClassExpression visit(OWLSameIndividualAxiom axiom) {try{__CLR4_5_200lviclyja.R.inc(81);
        __CLR4_5_200lviclyja.R.inc(82);Set<OWLClassExpression> nominals = new HashSet<>();
        __CLR4_5_200lviclyja.R.inc(83);for (OWLIndividual ind : axiom.getIndividuals()) {{
            assert (((ind != null)&&(__CLR4_5_200lviclyja.R.iget(84)!=0|true))||(__CLR4_5_200lviclyja.R.iget(85)==0&false));
            __CLR4_5_200lviclyja.R.inc(86);nominals.add(not(oneOf(ind)));
        }
        }__CLR4_5_200lviclyja.R.inc(87);return and(nominals);
    }finally{__CLR4_5_200lviclyja.R.flushNeeded();}}

    @Override
    public OWLClassExpression visit(OWLSubClassOfAxiom axiom) {try{__CLR4_5_200lviclyja.R.inc(88);
        __CLR4_5_200lviclyja.R.inc(89);OWLClassExpression sub = axiom.getSubClass();
        __CLR4_5_200lviclyja.R.inc(90);OWLClassExpression sup = axiom.getSuperClass();
        __CLR4_5_200lviclyja.R.inc(91);if ((((sup.isOWLNothing())&&(__CLR4_5_200lviclyja.R.iget(92)!=0|true))||(__CLR4_5_200lviclyja.R.iget(93)==0&false))) {{
            __CLR4_5_200lviclyja.R.inc(94);return sub;
        } }else {__CLR4_5_200lviclyja.R.inc(95);if ((((sub.isOWLThing())&&(__CLR4_5_200lviclyja.R.iget(96)!=0|true))||(__CLR4_5_200lviclyja.R.iget(97)==0&false))) {{
            __CLR4_5_200lviclyja.R.inc(98);return not(sup);
        } }else {{
            __CLR4_5_200lviclyja.R.inc(99);return and(sub, not(sup));
        }
    }}}finally{__CLR4_5_200lviclyja.R.flushNeeded();}}
}
