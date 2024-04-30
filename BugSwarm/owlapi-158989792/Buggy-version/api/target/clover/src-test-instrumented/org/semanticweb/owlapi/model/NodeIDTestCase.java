/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.semanticweb.owlapi.model;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author ignazio
 */
@SuppressWarnings("javadoc")
public class NodeIDTestCase {static class __CLR4_5_2ch3ch3lvicku2b{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0061\u0070\u0069\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237216579L,8589935092L,16197,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void shouldCreateNodeString() {__CLR4_5_2ch3ch3lvicku2b.R.globalSliceStart(getClass().getName(),16167);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21dazx3ch3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ch3ch3lvicku2b.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ch3ch3lvicku2b.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.model.NodeIDTestCase.shouldCreateNodeString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16167,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21dazx3ch3(){try{__CLR4_5_2ch3ch3lvicku2b.R.inc(16167);
        __CLR4_5_2ch3ch3lvicku2b.R.inc(16168);assertEquals("_:genid30", NodeID.nodeString(30));
    }finally{__CLR4_5_2ch3ch3lvicku2b.R.flushNeeded();}}

    @Test
    public void shouldCreateIRIFromNodeString() {__CLR4_5_2ch3ch3lvicku2b.R.globalSliceStart(getClass().getName(),16169);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hang5ch5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ch3ch3lvicku2b.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ch3ch3lvicku2b.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.model.NodeIDTestCase.shouldCreateIRIFromNodeString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16169,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hang5ch5(){try{__CLR4_5_2ch3ch3lvicku2b.R.inc(16169);
        __CLR4_5_2ch3ch3lvicku2b.R.inc(16170);assertEquals("_:genid-nodeid-somestring_",
                NodeID.getIRIFromNodeID("somestring_genid"));
    }finally{__CLR4_5_2ch3ch3lvicku2b.R.flushNeeded();}}

    @Test
    public void shouldCreateNextIRI() {__CLR4_5_2ch3ch3lvicku2b.R.globalSliceStart(getClass().getName(),16171);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ytjzbvch7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ch3ch3lvicku2b.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ch3ch3lvicku2b.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.model.NodeIDTestCase.shouldCreateNextIRI",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16171,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ytjzbvch7(){try{__CLR4_5_2ch3ch3lvicku2b.R.inc(16171);
        __CLR4_5_2ch3ch3lvicku2b.R.inc(16172);assertTrue(NodeID.nextAnonymousIRI().matches("_:genid[0-9]+"));
    }finally{__CLR4_5_2ch3ch3lvicku2b.R.flushNeeded();}}

    @Test
    public void shouldFindAnonymousNode() {__CLR4_5_2ch3ch3lvicku2b.R.globalSliceStart(getClass().getName(),16173);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a9jp9ych9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ch3ch3lvicku2b.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ch3ch3lvicku2b.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.model.NodeIDTestCase.shouldFindAnonymousNode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16173,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a9jp9ych9(){try{__CLR4_5_2ch3ch3lvicku2b.R.inc(16173);
        __CLR4_5_2ch3ch3lvicku2b.R.inc(16174);assertTrue(NodeID.isAnonymousNodeIRI("_:sometest_genid_something"));
        __CLR4_5_2ch3ch3lvicku2b.R.inc(16175);assertTrue(NodeID.isAnonymousNodeIRI("_:genid_something"));
        __CLR4_5_2ch3ch3lvicku2b.R.inc(16176);assertFalse(NodeID
                .isAnonymousNodeIRI("http://sometest_genid_something"));
        __CLR4_5_2ch3ch3lvicku2b.R.inc(16177);assertFalse(NodeID.isAnonymousNodeIRI((String) null));
    }finally{__CLR4_5_2ch3ch3lvicku2b.R.flushNeeded();}}

    @Test
    public void shouldFindAnonymousNodeIRI() {__CLR4_5_2ch3ch3lvicku2b.R.globalSliceStart(getClass().getName(),16178);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2q3b6u4che();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ch3ch3lvicku2b.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ch3ch3lvicku2b.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.model.NodeIDTestCase.shouldFindAnonymousNodeIRI",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16178,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2q3b6u4che(){try{__CLR4_5_2ch3ch3lvicku2b.R.inc(16178);
        __CLR4_5_2ch3ch3lvicku2b.R.inc(16179);assertTrue(NodeID.isAnonymousNodeIRI(IRI
                .create("_:sometest_genid_something")));
        __CLR4_5_2ch3ch3lvicku2b.R.inc(16180);assertTrue(NodeID.isAnonymousNodeIRI(IRI.create("_:genid_something")));
        __CLR4_5_2ch3ch3lvicku2b.R.inc(16181);assertFalse(NodeID.isAnonymousNodeIRI(IRI
                .create("http://sometest_genid_something")));
        __CLR4_5_2ch3ch3lvicku2b.R.inc(16182);assertFalse(NodeID.isAnonymousNodeIRI((IRI) null));
    }finally{__CLR4_5_2ch3ch3lvicku2b.R.flushNeeded();}}

    @Test
    public void shouldFindsharedNodeIRI() {__CLR4_5_2ch3ch3lvicku2b.R.globalSliceStart(getClass().getName(),16183);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2b6rdoschj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ch3ch3lvicku2b.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ch3ch3lvicku2b.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.model.NodeIDTestCase.shouldFindsharedNodeIRI",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16183,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2b6rdoschj(){try{__CLR4_5_2ch3ch3lvicku2b.R.inc(16183);
        __CLR4_5_2ch3ch3lvicku2b.R.inc(16184);assertFalse(NodeID
                .isAnonymousNodeID("_:sometest_genid-nodeid-_something"));
        __CLR4_5_2ch3ch3lvicku2b.R.inc(16185);assertTrue(NodeID.isAnonymousNodeID("_:genid-nodeid-_something"));
        __CLR4_5_2ch3ch3lvicku2b.R.inc(16186);assertFalse(NodeID
                .isAnonymousNodeID("http://sometest_genid-nodeid-_something"));
        __CLR4_5_2ch3ch3lvicku2b.R.inc(16187);assertFalse(NodeID.isAnonymousNodeID(null));
    }finally{__CLR4_5_2ch3ch3lvicku2b.R.flushNeeded();}}

    @Test
    public void shouldbuildNode() {__CLR4_5_2ch3ch3lvicku2b.R.globalSliceStart(getClass().getName(),16188);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qynj6scho();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ch3ch3lvicku2b.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ch3ch3lvicku2b.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.model.NodeIDTestCase.shouldbuildNode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16188,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qynj6scho(){try{__CLR4_5_2ch3ch3lvicku2b.R.inc(16188);
        __CLR4_5_2ch3ch3lvicku2b.R.inc(16189);assertTrue(NodeID.isAnonymousNodeIRI(NodeID.getNodeID(
                "_:sometest_genid_something").getID()));
        __CLR4_5_2ch3ch3lvicku2b.R.inc(16190);assertTrue(NodeID.isAnonymousNodeIRI(NodeID.getNodeID(
                "http://sometest_genid_something").getID()));
        __CLR4_5_2ch3ch3lvicku2b.R.inc(16191);assertTrue(NodeID.isAnonymousNodeIRI(NodeID.getNodeID(null).getID()));
        __CLR4_5_2ch3ch3lvicku2b.R.inc(16192);NodeID id = NodeID.getNodeID(null);
        __CLR4_5_2ch3ch3lvicku2b.R.inc(16193);assertEquals(id.getID(), id.toString());
        __CLR4_5_2ch3ch3lvicku2b.R.inc(16194);assertEquals(NodeID.getNodeID("somestring"),
                NodeID.getNodeID("somestring"));
        __CLR4_5_2ch3ch3lvicku2b.R.inc(16195);assertEquals(
                NodeID.getNodeID("somestring").compareTo(
                        NodeID.getNodeID("someotherstring")),
                "somestring".compareTo("someotherstring"));
        __CLR4_5_2ch3ch3lvicku2b.R.inc(16196);assertEquals(id.hashCode(), id.toString().hashCode());
    }finally{__CLR4_5_2ch3ch3lvicku2b.R.flushNeeded();}}
}
