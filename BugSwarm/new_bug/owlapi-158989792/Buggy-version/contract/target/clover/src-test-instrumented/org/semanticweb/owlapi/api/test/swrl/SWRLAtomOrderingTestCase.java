/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.semanticweb.owlapi.api.test.swrl;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.Nonnull;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.semanticweb.owlapi.model.OWLAnnotation;
import org.semanticweb.owlapi.model.SWRLAtom;
import org.semanticweb.owlapi.util.CollectionFactory;

import uk.ac.manchester.cs.owl.owlapi.SWRLRuleImpl;

/**
 * @author Matthew Horridge, Stanford University, Bio-Medical Informatics
 *         Research Group, Date: 04/04/2014
 */
@SuppressWarnings("javadoc")
@RunWith(MockitoJUnitRunner.class)
public class SWRLAtomOrderingTestCase {static class __CLR4_5_2829829lvico1l8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,10469,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Mock
    protected SWRLAtom atomA;
    @Mock
    protected SWRLAtom atomB;
    @Mock
    protected SWRLAtom atomC;
    @Mock
    protected SWRLAtom atomD;
    private SWRLRuleImpl rule;
    @Nonnull
    private final Set<SWRLAtom> body = new LinkedHashSet<>();

    @Before
    public void setUp() {try{__CLR4_5_2829829lvico1l8.R.inc(10449);
        __CLR4_5_2829829lvico1l8.R.inc(10450);when(atomA.compareTo(atomB)).thenReturn(-1);
        __CLR4_5_2829829lvico1l8.R.inc(10451);when(atomA.compareTo(atomC)).thenReturn(-1);
        __CLR4_5_2829829lvico1l8.R.inc(10452);when(atomB.compareTo(atomC)).thenReturn(-1);
        __CLR4_5_2829829lvico1l8.R.inc(10453);when(atomC.compareTo(atomB)).thenReturn(1);
        __CLR4_5_2829829lvico1l8.R.inc(10454);when(atomC.compareTo(atomA)).thenReturn(1);
        __CLR4_5_2829829lvico1l8.R.inc(10455);when(atomB.compareTo(atomA)).thenReturn(1);
        __CLR4_5_2829829lvico1l8.R.inc(10456);when(atomA.compareTo(atomA)).thenReturn(0);
        __CLR4_5_2829829lvico1l8.R.inc(10457);when(atomB.compareTo(atomB)).thenReturn(0);
        __CLR4_5_2829829lvico1l8.R.inc(10458);when(atomC.compareTo(atomC)).thenReturn(0);
        __CLR4_5_2829829lvico1l8.R.inc(10459);body.add(atomC);
        __CLR4_5_2829829lvico1l8.R.inc(10460);body.add(atomB);
        __CLR4_5_2829829lvico1l8.R.inc(10461);body.add(atomA);
        __CLR4_5_2829829lvico1l8.R.inc(10462);Set<SWRLAtom> head = new LinkedHashSet<>();
        __CLR4_5_2829829lvico1l8.R.inc(10463);head.add(atomD);
        __CLR4_5_2829829lvico1l8.R.inc(10464);rule = new SWRLRuleImpl(body, head,
                CollectionFactory.<OWLAnnotation> emptySet());
    }finally{__CLR4_5_2829829lvico1l8.R.flushNeeded();}}

    @Test
    public void shouldPreserveBodyOrdering() {__CLR4_5_2829829lvico1l8.R.globalSliceStart(getClass().getName(),10465);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26bearo82p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2829829lvico1l8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2829829lvico1l8.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.swrl.SWRLAtomOrderingTestCase.shouldPreserveBodyOrdering",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10465,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26bearo82p(){try{__CLR4_5_2829829lvico1l8.R.inc(10465);
        __CLR4_5_2829829lvico1l8.R.inc(10466);List<SWRLAtom> ruleImplBody = new ArrayList<>(rule.getBody());
        __CLR4_5_2829829lvico1l8.R.inc(10467);List<SWRLAtom> specifiedBody = new ArrayList<>(body);
        __CLR4_5_2829829lvico1l8.R.inc(10468);assertThat(ruleImplBody, is(equalTo(specifiedBody)));
    }finally{__CLR4_5_2829829lvico1l8.R.flushNeeded();}}
}
