/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.semanticweb.owlapi.search;

import java.util.Set;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.model.OWLDifferentIndividualsAxiom;
import org.semanticweb.owlapi.model.OWLDisjointClassesAxiom;
import org.semanticweb.owlapi.model.OWLDisjointDataPropertiesAxiom;
import org.semanticweb.owlapi.model.OWLDisjointObjectPropertiesAxiom;
import org.semanticweb.owlapi.model.OWLEquivalentClassesAxiom;
import org.semanticweb.owlapi.model.OWLEquivalentDataPropertiesAxiom;
import org.semanticweb.owlapi.model.OWLEquivalentObjectPropertiesAxiom;
import org.semanticweb.owlapi.model.OWLObject;
import org.semanticweb.owlapi.model.OWLSameIndividualAxiom;
import org.semanticweb.owlapi.util.CollectionFactory;
import org.semanticweb.owlapi.util.OWLAxiomVisitorExAdapter;

@SuppressWarnings("unchecked")
class EquivalentVisitor<C extends OWLObject> extends
        OWLAxiomVisitorExAdapter<Set<C>> {public static class __CLR4_5_24i64i6lvickou9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0061\u0070\u0069\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237201267L,8589935092L,5889,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final boolean equiv;

    EquivalentVisitor(boolean equiv) {
        super(CollectionFactory.<C> emptySet());__CLR4_5_24i64i6lvickou9.R.inc(5839);try{__CLR4_5_24i64i6lvickou9.R.inc(5838);
        __CLR4_5_24i64i6lvickou9.R.inc(5840);this.equiv = equiv;
    }finally{__CLR4_5_24i64i6lvickou9.R.flushNeeded();}}

    @Nonnull
    @Override
    public Set<C> visit(@Nonnull OWLEquivalentClassesAxiom axiom) {try{__CLR4_5_24i64i6lvickou9.R.inc(5841);
        __CLR4_5_24i64i6lvickou9.R.inc(5842);if ((((equiv)&&(__CLR4_5_24i64i6lvickou9.R.iget(5843)!=0|true))||(__CLR4_5_24i64i6lvickou9.R.iget(5844)==0&false))) {{
            __CLR4_5_24i64i6lvickou9.R.inc(5845);return (Set<C>) axiom.getClassExpressions();
        }
        }__CLR4_5_24i64i6lvickou9.R.inc(5846);return doDefault(axiom);
    }finally{__CLR4_5_24i64i6lvickou9.R.flushNeeded();}}

    @Nonnull
    @Override
    public Set<C> visit(@Nonnull OWLEquivalentDataPropertiesAxiom axiom) {try{__CLR4_5_24i64i6lvickou9.R.inc(5847);
        __CLR4_5_24i64i6lvickou9.R.inc(5848);if ((((equiv)&&(__CLR4_5_24i64i6lvickou9.R.iget(5849)!=0|true))||(__CLR4_5_24i64i6lvickou9.R.iget(5850)==0&false))) {{
            __CLR4_5_24i64i6lvickou9.R.inc(5851);return (Set<C>) axiom.getProperties();
        }
        }__CLR4_5_24i64i6lvickou9.R.inc(5852);return doDefault(axiom);
    }finally{__CLR4_5_24i64i6lvickou9.R.flushNeeded();}}

    @Nonnull
    @Override
    public Set<C> visit(@Nonnull OWLEquivalentObjectPropertiesAxiom axiom) {try{__CLR4_5_24i64i6lvickou9.R.inc(5853);
        __CLR4_5_24i64i6lvickou9.R.inc(5854);if ((((equiv)&&(__CLR4_5_24i64i6lvickou9.R.iget(5855)!=0|true))||(__CLR4_5_24i64i6lvickou9.R.iget(5856)==0&false))) {{
            __CLR4_5_24i64i6lvickou9.R.inc(5857);return (Set<C>) axiom.getProperties();
        }
        }__CLR4_5_24i64i6lvickou9.R.inc(5858);return doDefault(axiom);
    }finally{__CLR4_5_24i64i6lvickou9.R.flushNeeded();}}

    @Nonnull
    @Override
    public Set<C> visit(@Nonnull OWLDifferentIndividualsAxiom axiom) {try{__CLR4_5_24i64i6lvickou9.R.inc(5859);
        __CLR4_5_24i64i6lvickou9.R.inc(5860);if ((((!equiv)&&(__CLR4_5_24i64i6lvickou9.R.iget(5861)!=0|true))||(__CLR4_5_24i64i6lvickou9.R.iget(5862)==0&false))) {{
            __CLR4_5_24i64i6lvickou9.R.inc(5863);return (Set<C>) axiom.getIndividuals();
        }
        }__CLR4_5_24i64i6lvickou9.R.inc(5864);return doDefault(axiom);
    }finally{__CLR4_5_24i64i6lvickou9.R.flushNeeded();}}

    @Nonnull
    @Override
    public Set<C> visit(@Nonnull OWLSameIndividualAxiom axiom) {try{__CLR4_5_24i64i6lvickou9.R.inc(5865);
        __CLR4_5_24i64i6lvickou9.R.inc(5866);if ((((equiv)&&(__CLR4_5_24i64i6lvickou9.R.iget(5867)!=0|true))||(__CLR4_5_24i64i6lvickou9.R.iget(5868)==0&false))) {{
            __CLR4_5_24i64i6lvickou9.R.inc(5869);return (Set<C>) axiom.getIndividuals();
        }
        }__CLR4_5_24i64i6lvickou9.R.inc(5870);return doDefault(axiom);
    }finally{__CLR4_5_24i64i6lvickou9.R.flushNeeded();}}

    @Nonnull
    @Override
    public Set<C> visit(@Nonnull OWLDisjointClassesAxiom axiom) {try{__CLR4_5_24i64i6lvickou9.R.inc(5871);
        __CLR4_5_24i64i6lvickou9.R.inc(5872);if ((((!equiv)&&(__CLR4_5_24i64i6lvickou9.R.iget(5873)!=0|true))||(__CLR4_5_24i64i6lvickou9.R.iget(5874)==0&false))) {{
            __CLR4_5_24i64i6lvickou9.R.inc(5875);return (Set<C>) axiom.getClassExpressions();
        }
        }__CLR4_5_24i64i6lvickou9.R.inc(5876);return doDefault(axiom);
    }finally{__CLR4_5_24i64i6lvickou9.R.flushNeeded();}}

    @Nonnull
    @Override
    public Set<C> visit(@Nonnull OWLDisjointDataPropertiesAxiom axiom) {try{__CLR4_5_24i64i6lvickou9.R.inc(5877);
        __CLR4_5_24i64i6lvickou9.R.inc(5878);if ((((!equiv)&&(__CLR4_5_24i64i6lvickou9.R.iget(5879)!=0|true))||(__CLR4_5_24i64i6lvickou9.R.iget(5880)==0&false))) {{
            __CLR4_5_24i64i6lvickou9.R.inc(5881);return (Set<C>) axiom.getProperties();
        }
        }__CLR4_5_24i64i6lvickou9.R.inc(5882);return doDefault(axiom);
    }finally{__CLR4_5_24i64i6lvickou9.R.flushNeeded();}}

    @Nonnull
    @Override
    public Set<C> visit(@Nonnull OWLDisjointObjectPropertiesAxiom axiom) {try{__CLR4_5_24i64i6lvickou9.R.inc(5883);
        __CLR4_5_24i64i6lvickou9.R.inc(5884);if ((((!equiv)&&(__CLR4_5_24i64i6lvickou9.R.iget(5885)!=0|true))||(__CLR4_5_24i64i6lvickou9.R.iget(5886)==0&false))) {{
            __CLR4_5_24i64i6lvickou9.R.inc(5887);return (Set<C>) axiom.getProperties();
        }
        }__CLR4_5_24i64i6lvickou9.R.inc(5888);return doDefault(axiom);
    }finally{__CLR4_5_24i64i6lvickou9.R.flushNeeded();}}
}
