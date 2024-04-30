/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.semanticweb.owlapi.api.test.baseclasses;

import gnu.trove.set.hash.TCustomHashSet;
import gnu.trove.strategy.HashingStrategy;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

import org.semanticweb.owlapi.model.OWLAxiom;

/**
 * Created by ses on 9/30/14.
 */
public class PlainLiteralTypeFoldingAxiomSet implements Set<OWLAxiom> {public static class __CLR4_5_24to4tolvico0fx{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,6292,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private Set<OWLAxiom> delegate = createPlainLiteralTypeFoldingSet();

    /**
     * @param axioms
     *        set of axioms
     */
    public PlainLiteralTypeFoldingAxiomSet(Collection<OWLAxiom> axioms) {try{__CLR4_5_24to4tolvico0fx.R.inc(6252);
        __CLR4_5_24to4tolvico0fx.R.inc(6253);delegate.addAll(axioms);
    }finally{__CLR4_5_24to4tolvico0fx.R.flushNeeded();}}

    static Set<OWLAxiom> createPlainLiteralTypeFoldingSet() {try{__CLR4_5_24to4tolvico0fx.R.inc(6254);
        __CLR4_5_24to4tolvico0fx.R.inc(6255);HashingStrategy<OWLAxiom> strategy = new OWLAxiomHashingStrategy();
        __CLR4_5_24to4tolvico0fx.R.inc(6256);return new TCustomHashSet<>(strategy);
    }finally{__CLR4_5_24to4tolvico0fx.R.flushNeeded();}}

    private static class OWLAxiomHashingStrategy implements
            HashingStrategy<OWLAxiom> {

        private static final long serialVersionUID = 40000L;

        public OWLAxiomHashingStrategy() {try{__CLR4_5_24to4tolvico0fx.R.inc(6257);}finally{__CLR4_5_24to4tolvico0fx.R.flushNeeded();}}

        /**
         * Computes a hash code for the specified object. Implementers can use
         * the object's own <tt>hashCode</tt> method, the Java runtime's
         * <tt>identityHashCode</tt>, or a custom scheme.
         *
         * @param object
         *        for which the hashcode is to be computed
         * @return the hashCode
         */
        @Override
        public int computeHashCode(OWLAxiom object) {try{__CLR4_5_24to4tolvico0fx.R.inc(6258);
            __CLR4_5_24to4tolvico0fx.R.inc(6259);return LiteralFoldingHashCoder.hashCode(object);
        }finally{__CLR4_5_24to4tolvico0fx.R.flushNeeded();}}

        /**
         * Compares o1 and o2 for equality. Strategy implementers may use the
         * objects' own equals() methods, compare object references, or
         * implement some custom scheme.
         *
         * @param o1
         *        an <code>Object</code> value
         * @param o2
         *        an <code>Object</code> value
         * @return true if the objects are equal according to this strategy.
         */
        @Override
        public boolean equals(OWLAxiom o1, OWLAxiom o2) {try{__CLR4_5_24to4tolvico0fx.R.inc(6260);
            __CLR4_5_24to4tolvico0fx.R.inc(6261);return LiteralFoldingEqualityTester.equalAxiom(o1, o2);
        }finally{__CLR4_5_24to4tolvico0fx.R.flushNeeded();}}
    }

    @Override
    public int size() {try{__CLR4_5_24to4tolvico0fx.R.inc(6262);
        __CLR4_5_24to4tolvico0fx.R.inc(6263);return delegate.size();
    }finally{__CLR4_5_24to4tolvico0fx.R.flushNeeded();}}

    @Override
    public boolean isEmpty() {try{__CLR4_5_24to4tolvico0fx.R.inc(6264);
        __CLR4_5_24to4tolvico0fx.R.inc(6265);return delegate.isEmpty();
    }finally{__CLR4_5_24to4tolvico0fx.R.flushNeeded();}}

    @Override
    public boolean contains(Object o) {try{__CLR4_5_24to4tolvico0fx.R.inc(6266);
        __CLR4_5_24to4tolvico0fx.R.inc(6267);return delegate.contains(o);
    }finally{__CLR4_5_24to4tolvico0fx.R.flushNeeded();}}

    @Override
    public Iterator<OWLAxiom> iterator() {try{__CLR4_5_24to4tolvico0fx.R.inc(6268);
        __CLR4_5_24to4tolvico0fx.R.inc(6269);return delegate.iterator();
    }finally{__CLR4_5_24to4tolvico0fx.R.flushNeeded();}}

    @Override
    public Object[] toArray() {try{__CLR4_5_24to4tolvico0fx.R.inc(6270);
        __CLR4_5_24to4tolvico0fx.R.inc(6271);return delegate.toArray();
    }finally{__CLR4_5_24to4tolvico0fx.R.flushNeeded();}}

    @Override
    public <T> T[] toArray(T[] a) {try{__CLR4_5_24to4tolvico0fx.R.inc(6272);
        __CLR4_5_24to4tolvico0fx.R.inc(6273);return delegate.toArray(a);
    }finally{__CLR4_5_24to4tolvico0fx.R.flushNeeded();}}

    @Override
    public boolean add(OWLAxiom owlAxiom) {try{__CLR4_5_24to4tolvico0fx.R.inc(6274);
        __CLR4_5_24to4tolvico0fx.R.inc(6275);return delegate.add(owlAxiom);
    }finally{__CLR4_5_24to4tolvico0fx.R.flushNeeded();}}

    @Override
    public boolean remove(Object o) {try{__CLR4_5_24to4tolvico0fx.R.inc(6276);
        __CLR4_5_24to4tolvico0fx.R.inc(6277);return delegate.remove(o);
    }finally{__CLR4_5_24to4tolvico0fx.R.flushNeeded();}}

    @Override
    public boolean containsAll(Collection<?> c) {try{__CLR4_5_24to4tolvico0fx.R.inc(6278);
        __CLR4_5_24to4tolvico0fx.R.inc(6279);return delegate.containsAll(c);
    }finally{__CLR4_5_24to4tolvico0fx.R.flushNeeded();}}

    @Override
    public boolean addAll(Collection<? extends OWLAxiom> c) {try{__CLR4_5_24to4tolvico0fx.R.inc(6280);
        __CLR4_5_24to4tolvico0fx.R.inc(6281);return delegate.addAll(c);
    }finally{__CLR4_5_24to4tolvico0fx.R.flushNeeded();}}

    @Override
    public boolean retainAll(Collection<?> c) {try{__CLR4_5_24to4tolvico0fx.R.inc(6282);
        __CLR4_5_24to4tolvico0fx.R.inc(6283);return delegate.retainAll(c);
    }finally{__CLR4_5_24to4tolvico0fx.R.flushNeeded();}}

    @Override
    public boolean removeAll(Collection<?> c) {try{__CLR4_5_24to4tolvico0fx.R.inc(6284);
        __CLR4_5_24to4tolvico0fx.R.inc(6285);return delegate.removeAll(c);
    }finally{__CLR4_5_24to4tolvico0fx.R.flushNeeded();}}

    @Override
    public void clear() {try{__CLR4_5_24to4tolvico0fx.R.inc(6286);
        __CLR4_5_24to4tolvico0fx.R.inc(6287);delegate.clear();
    }finally{__CLR4_5_24to4tolvico0fx.R.flushNeeded();}}

    @Override
    public boolean equals(Object o) {try{__CLR4_5_24to4tolvico0fx.R.inc(6288);
        __CLR4_5_24to4tolvico0fx.R.inc(6289);return delegate.equals(o);
    }finally{__CLR4_5_24to4tolvico0fx.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_5_24to4tolvico0fx.R.inc(6290);
        __CLR4_5_24to4tolvico0fx.R.inc(6291);return delegate.hashCode();
    }finally{__CLR4_5_24to4tolvico0fx.R.flushNeeded();}}
}
