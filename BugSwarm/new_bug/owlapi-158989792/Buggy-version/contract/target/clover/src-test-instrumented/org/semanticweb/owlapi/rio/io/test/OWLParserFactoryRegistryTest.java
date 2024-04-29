/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.semanticweb.owlapi.rio.io.test;

import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;
import org.semanticweb.owlapi.api.test.baseclasses.TestBase;
import org.semanticweb.owlapi.functional.parser.OWLFunctionalSyntaxOWLParserFactory;
import org.semanticweb.owlapi.io.OWLParserFactory;
import org.semanticweb.owlapi.krss2.parser.KRSS2OWLParserFactory;
import org.semanticweb.owlapi.manchestersyntax.parser.ManchesterOWLSyntaxOntologyParserFactory;
import org.semanticweb.owlapi.oboformat.OBOFormatOWLAPIParserFactory;
import org.semanticweb.owlapi.owlxml.parser.OWLXMLParserFactory;
import org.semanticweb.owlapi.rdf.rdfxml.parser.RDFXMLParserFactory;
import org.semanticweb.owlapi.rdf.turtle.parser.TurtleOntologyParserFactory;
import org.semanticweb.owlapi.rio.*;
import org.semanticweb.owlapi.util.PriorityCollection;

/**
 * @author Peter Ansell p_ansell@yahoo.com
 */
@SuppressWarnings("javadoc")
public class OWLParserFactoryRegistryTest extends TestBase {static class __CLR4_5_2bn2bn2lvico2dz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,15112,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void setUp() {__CLR4_5_2bn2bn2lvico2dz.R.globalSliceStart(getClass().getName(),15086);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cb7u7wbn2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2bn2bn2lvico2dz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2bn2bn2lvico2dz.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.rio.io.test.OWLParserFactoryRegistryTest.setUp",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15086,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cb7u7wbn2(){try{__CLR4_5_2bn2bn2lvico2dz.R.inc(15086);
        // this test used to count the parsers. However, the extra parser in the
        // compatibility package will show up here in Eclipse tests, creating
        // confusion
        // Switched to list the expected parsers anc checking they all appear.
        // Any extra ones are welcome.
        __CLR4_5_2bn2bn2lvico2dz.R.inc(15087);Set<Class<? extends OWLParserFactory>> factories = new HashSet<>();
        __CLR4_5_2bn2bn2lvico2dz.R.inc(15088);factories.add(RDFXMLParserFactory.class);
        __CLR4_5_2bn2bn2lvico2dz.R.inc(15089);factories.add(OWLXMLParserFactory.class);
        __CLR4_5_2bn2bn2lvico2dz.R.inc(15090);factories.add(OWLFunctionalSyntaxOWLParserFactory.class);
        __CLR4_5_2bn2bn2lvico2dz.R.inc(15091);factories.add(TurtleOntologyParserFactory.class);
        __CLR4_5_2bn2bn2lvico2dz.R.inc(15092);factories.add(ManchesterOWLSyntaxOntologyParserFactory.class);
        __CLR4_5_2bn2bn2lvico2dz.R.inc(15093);factories.add(OBOFormatOWLAPIParserFactory.class);
        __CLR4_5_2bn2bn2lvico2dz.R.inc(15094);factories.add(KRSS2OWLParserFactory.class);
        __CLR4_5_2bn2bn2lvico2dz.R.inc(15095);factories.add(RioTurtleParserFactory.class);
        __CLR4_5_2bn2bn2lvico2dz.R.inc(15096);factories.add(RioNQuadsParserFactory.class);
        __CLR4_5_2bn2bn2lvico2dz.R.inc(15097);factories.add(RioJsonParserFactory.class);
        __CLR4_5_2bn2bn2lvico2dz.R.inc(15098);factories.add(RioNTriplesParserFactory.class);
        __CLR4_5_2bn2bn2lvico2dz.R.inc(15099);factories.add(RioTrigParserFactory.class);
        __CLR4_5_2bn2bn2lvico2dz.R.inc(15100);factories.add(RioBinaryRdfParserFactory.class);
        __CLR4_5_2bn2bn2lvico2dz.R.inc(15101);factories.add(RioJsonLDParserFactory.class);
        __CLR4_5_2bn2bn2lvico2dz.R.inc(15102);factories.add(RioN3ParserFactory.class);
        __CLR4_5_2bn2bn2lvico2dz.R.inc(15103);factories.add(RioRDFXMLParserFactory.class);
        __CLR4_5_2bn2bn2lvico2dz.R.inc(15104);factories.add(RioTrixParserFactory.class);
        __CLR4_5_2bn2bn2lvico2dz.R.inc(15105);factories.add(RioRDFaParserFactory.class);
        __CLR4_5_2bn2bn2lvico2dz.R.inc(15106);PriorityCollection<OWLParserFactory> ontologyParsers = m.getOntologyParsers();
        __CLR4_5_2bn2bn2lvico2dz.R.inc(15107);Set<Class<? extends OWLParserFactory>> found = new HashSet<>();
        __CLR4_5_2bn2bn2lvico2dz.R.inc(15108);for (OWLParserFactory p : ontologyParsers) {{
            __CLR4_5_2bn2bn2lvico2dz.R.inc(15109);found.add(p.getClass());
        }
        }__CLR4_5_2bn2bn2lvico2dz.R.inc(15110);for (Class<? extends OWLParserFactory> p : factories) {{
            __CLR4_5_2bn2bn2lvico2dz.R.inc(15111);assertTrue("Expected among parsers: " + p.getSimpleName(), found.contains(p));
        }
    }}finally{__CLR4_5_2bn2bn2lvico2dz.R.flushNeeded();}}
}
