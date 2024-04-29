/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.semanticweb.owlapi.api.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.semanticweb.owlapi.model.MissingImportHandlingStrategy;
import org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration.MissingOntologyHeaderStrategy;
import org.semanticweb.owlapi.model.PriorityCollectionSorting;
import org.semanticweb.owlapi.model.parameters.ConfigurationOptions;

@RunWith(Parameterized.class)
@SuppressWarnings("javadoc")
public class ConfigurationOptionsTestCase {static class __CLR4_5_21va1valvicnzet{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,2445,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=new com_atlassian_clover.TestNameSniffer.Simple();

    @Parameter(0) public ConfigurationOptions config;
    @Parameter(1) public Object value;

    @Parameters(name = "{0}")
    public static List<Object[]> values() {try{__CLR4_5_21va1valvicnzet.R.inc(2422);
        __CLR4_5_21va1valvicnzet.R.inc(2423);List<Object[]> toReturn = new ArrayList<>();
        __CLR4_5_21va1valvicnzet.R.inc(2424);toReturn.add(new Object[] { ConfigurationOptions.ACCEPT_HTTP_COMPRESSION, Boolean.TRUE });
        __CLR4_5_21va1valvicnzet.R.inc(2425);toReturn.add(new Object[] { ConfigurationOptions.CONNECTION_TIMEOUT, 20000 });
        __CLR4_5_21va1valvicnzet.R.inc(2426);toReturn.add(new Object[] { ConfigurationOptions.FOLLOW_REDIRECTS, Boolean.TRUE });
        __CLR4_5_21va1valvicnzet.R.inc(2427);toReturn.add(new Object[] { ConfigurationOptions.INDENT_SIZE, 4 });
        __CLR4_5_21va1valvicnzet.R.inc(2428);toReturn.add(new Object[] { ConfigurationOptions.INDENTING, Boolean.TRUE });
        __CLR4_5_21va1valvicnzet.R.inc(2429);toReturn.add(new Object[] { ConfigurationOptions.LABELS_AS_BANNER, Boolean.FALSE });
        __CLR4_5_21va1valvicnzet.R.inc(2430);toReturn.add(new Object[] { ConfigurationOptions.LOAD_ANNOTATIONS, Boolean.TRUE });
        __CLR4_5_21va1valvicnzet.R.inc(2431);toReturn.add(new Object[] { ConfigurationOptions.PARSE_WITH_STRICT_CONFIGURATION, Boolean.FALSE });
        __CLR4_5_21va1valvicnzet.R.inc(2432);toReturn.add(new Object[] { ConfigurationOptions.MISSING_IMPORT_HANDLING_STRATEGY,
            MissingImportHandlingStrategy.THROW_EXCEPTION });
        __CLR4_5_21va1valvicnzet.R.inc(2433);toReturn.add(new Object[] { ConfigurationOptions.MISSING_ONTOLOGY_HEADER_STRATEGY,
            MissingOntologyHeaderStrategy.INCLUDE_GRAPH });
        __CLR4_5_21va1valvicnzet.R.inc(2434);toReturn.add(new Object[] { ConfigurationOptions.PRIORITY_COLLECTION_SORTING,
            PriorityCollectionSorting.ON_SET_INJECTION_ONLY });
        __CLR4_5_21va1valvicnzet.R.inc(2435);toReturn.add(new Object[] { ConfigurationOptions.REMAP_IDS, Boolean.TRUE });
        __CLR4_5_21va1valvicnzet.R.inc(2436);toReturn.add(new Object[] { ConfigurationOptions.REPORT_STACK_TRACES, Boolean.TRUE });
        __CLR4_5_21va1valvicnzet.R.inc(2437);toReturn.add(new Object[] { ConfigurationOptions.RETRIES_TO_ATTEMPT, 5 });
        __CLR4_5_21va1valvicnzet.R.inc(2438);toReturn.add(new Object[] { ConfigurationOptions.SAVE_IDS, Boolean.FALSE });
        __CLR4_5_21va1valvicnzet.R.inc(2439);toReturn.add(new Object[] { ConfigurationOptions.TREAT_DUBLINCORE_AS_BUILTIN, Boolean.TRUE });
        __CLR4_5_21va1valvicnzet.R.inc(2440);toReturn.add(new Object[] { ConfigurationOptions.USE_NAMESPACE_ENTITIES, Boolean.FALSE });
        __CLR4_5_21va1valvicnzet.R.inc(2441);return toReturn;
    }finally{__CLR4_5_21va1valvicnzet.R.flushNeeded();}}

    @Test
    public void shouldFindExpectedValue() {__CLR4_5_21va1valvicnzet.R.globalSliceStart(getClass().getName(),2442);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29x47841vu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21va1valvicnzet.R.rethrow($CLV_t2$);}finally{__CLR4_5_21va1valvicnzet.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.ConfigurationOptionsTestCase.shouldFindExpectedValue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2442,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29x47841vu(){try{__CLR4_5_21va1valvicnzet.R.inc(2442);
        __CLR4_5_21va1valvicnzet.R.inc(2443);assertEquals(value, config.getValue(value.getClass(), new EnumMap<>(ConfigurationOptions.class)));
        __CLR4_5_21va1valvicnzet.R.inc(2444);assertEquals(value, config.getDefaultValue(value.getClass()));
    }finally{__CLR4_5_21va1valvicnzet.R.flushNeeded();}}
}
