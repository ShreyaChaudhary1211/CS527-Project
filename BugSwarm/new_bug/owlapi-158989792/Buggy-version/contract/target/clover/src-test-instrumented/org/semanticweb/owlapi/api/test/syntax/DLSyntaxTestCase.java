/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.semanticweb.owlapi.api.test.syntax;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.semanticweb.owlapi.api.test.baseclasses.TestBase;
import org.semanticweb.owlapi.dlsyntax.renderer.DLSyntaxObjectRenderer;
import org.semanticweb.owlapi.formats.DLSyntaxDocumentFormat;
import org.semanticweb.owlapi.formats.DLSyntaxHTMLDocumentFormat;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLOntology;

@SuppressWarnings("javadoc")
public class DLSyntaxTestCase extends TestBase {static class __CLR4_5_282t82tlvico1lh{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,10547,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testCommasOnDisjointThree() {__CLR4_5_282t82tlvico1lh.R.globalSliceStart(getClass().getName(),10469);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dn92x282t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_282t82tlvico1lh.R.rethrow($CLV_t2$);}finally{__CLR4_5_282t82tlvico1lh.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.DLSyntaxTestCase.testCommasOnDisjointThree",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10469,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dn92x282t(){try{__CLR4_5_282t82tlvico1lh.R.inc(10469);
        __CLR4_5_282t82tlvico1lh.R.inc(10470);OWLClass a = df.getOWLClass(IRI.create("urn:A"));
        __CLR4_5_282t82tlvico1lh.R.inc(10471);OWLClass b = df.getOWLClass(IRI.create("urn:B"));
        __CLR4_5_282t82tlvico1lh.R.inc(10472);OWLClass c = df.getOWLClass(IRI.create("urn:C"));
        __CLR4_5_282t82tlvico1lh.R.inc(10473);OWLAxiom ax = df.getOWLDisjointClassesAxiom(a, b, c);
        __CLR4_5_282t82tlvico1lh.R.inc(10474);DLSyntaxObjectRenderer visitor = new DLSyntaxObjectRenderer();
        __CLR4_5_282t82tlvico1lh.R.inc(10475);String render = visitor.render(ax);
        __CLR4_5_282t82tlvico1lh.R.inc(10476);assertEquals("A \u2291 \u00ac B, A \u2291 \u00ac C, B \u2291 \u00ac C", render);
    }finally{__CLR4_5_282t82tlvico1lh.R.flushNeeded();}}

    @Test
    public void testCommasOnDisjointTwo() {__CLR4_5_282t82tlvico1lh.R.globalSliceStart(getClass().getName(),10477);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yfwkrs831();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_282t82tlvico1lh.R.rethrow($CLV_t2$);}finally{__CLR4_5_282t82tlvico1lh.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.DLSyntaxTestCase.testCommasOnDisjointTwo",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10477,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yfwkrs831(){try{__CLR4_5_282t82tlvico1lh.R.inc(10477);
        __CLR4_5_282t82tlvico1lh.R.inc(10478);OWLClass a = df.getOWLClass(IRI.create("urn:A"));
        __CLR4_5_282t82tlvico1lh.R.inc(10479);OWLClass b = df.getOWLClass(IRI.create("urn:B"));
        __CLR4_5_282t82tlvico1lh.R.inc(10480);OWLAxiom ax = df.getOWLDisjointClassesAxiom(a, b);
        __CLR4_5_282t82tlvico1lh.R.inc(10481);DLSyntaxObjectRenderer visitor = new DLSyntaxObjectRenderer();
        __CLR4_5_282t82tlvico1lh.R.inc(10482);String render = visitor.render(ax);
        __CLR4_5_282t82tlvico1lh.R.inc(10483);assertEquals("A \u2291 \u00ac B", render);
    }finally{__CLR4_5_282t82tlvico1lh.R.flushNeeded();}}

    @Test
    public void testCommasOnDisjointFour() {__CLR4_5_282t82tlvico1lh.R.globalSliceStart(getClass().getName(),10484);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pbksvs838();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_282t82tlvico1lh.R.rethrow($CLV_t2$);}finally{__CLR4_5_282t82tlvico1lh.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.DLSyntaxTestCase.testCommasOnDisjointFour",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10484,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pbksvs838(){try{__CLR4_5_282t82tlvico1lh.R.inc(10484);
        __CLR4_5_282t82tlvico1lh.R.inc(10485);OWLClass a = df.getOWLClass(IRI.create("urn:A"));
        __CLR4_5_282t82tlvico1lh.R.inc(10486);OWLClass b = df.getOWLClass(IRI.create("urn:B"));
        __CLR4_5_282t82tlvico1lh.R.inc(10487);OWLClass c = df.getOWLClass(IRI.create("urn:C"));
        __CLR4_5_282t82tlvico1lh.R.inc(10488);OWLClass d = df.getOWLClass(IRI.create("urn:D"));
        __CLR4_5_282t82tlvico1lh.R.inc(10489);OWLAxiom ax = df.getOWLDisjointClassesAxiom(a, b, c, d);
        __CLR4_5_282t82tlvico1lh.R.inc(10490);DLSyntaxObjectRenderer visitor = new DLSyntaxObjectRenderer();
        __CLR4_5_282t82tlvico1lh.R.inc(10491);String render = visitor.render(ax);
        __CLR4_5_282t82tlvico1lh.R.inc(10492);assertEquals("A \u2291 \u00ac B, A \u2291 \u00ac C, A \u2291 \u00ac D, B \u2291 \u00ac C, B \u2291 \u00ac D, C \u2291 \u00ac D", render);
    }finally{__CLR4_5_282t82tlvico1lh.R.flushNeeded();}}

    @Test
    public void testCommasOnDisjointThreeOntologyHTML() throws Exception {__CLR4_5_282t82tlvico1lh.R.globalSliceStart(getClass().getName(),10493);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2sp8l6483h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_282t82tlvico1lh.R.rethrow($CLV_t2$);}finally{__CLR4_5_282t82tlvico1lh.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.DLSyntaxTestCase.testCommasOnDisjointThreeOntologyHTML",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10493,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2sp8l6483h() throws Exception{try{__CLR4_5_282t82tlvico1lh.R.inc(10493);
        __CLR4_5_282t82tlvico1lh.R.inc(10494);OWLOntology o = m.createOntology(IRI.create("urn:test:onto"));
        __CLR4_5_282t82tlvico1lh.R.inc(10495);OWLClass a = df.getOWLClass(IRI.create("urn:A"));
        __CLR4_5_282t82tlvico1lh.R.inc(10496);OWLClass b = df.getOWLClass(IRI.create("urn:B"));
        __CLR4_5_282t82tlvico1lh.R.inc(10497);OWLClass c = df.getOWLClass(IRI.create("urn:C"));
        __CLR4_5_282t82tlvico1lh.R.inc(10498);OWLAxiom ax = df.getOWLDisjointClassesAxiom(a, b, c);
        __CLR4_5_282t82tlvico1lh.R.inc(10499);m.addAxiom(o, ax);
        __CLR4_5_282t82tlvico1lh.R.inc(10500);String render = saveOntology(o, new DLSyntaxHTMLDocumentFormat()).toString();
        __CLR4_5_282t82tlvico1lh.R.inc(10501);assertEquals("<html>\n<body>\n<h1>Ontology: \nOntologyID(OntologyIRI(<urn:test:onto>) VersionIRI(<null>))</h1>\n<h2><a name=\"A\">urn:A</a></h2>\n" + 
            "<div class=\"entitybox\">\n<div class=\"axiombox\"> \n" + 
            "A &#8849; &#172; <a href=\"#B\">B</a>, A &#8849; &#172; <a href=\"#C\">C</a>, <a href=\"#B\">B</a> &#8849; &#172; <a href=\"#C\">C</a> </div>\n" + 
            "<div class=\"usage\" style=\"margin-left: 60px; size: tiny\">\n<h3>Usages (0)</h3>\n</div>\n</div>\n" + 
            "<h2><a name=\"B\">urn:B</a></h2>\n<div class=\"entitybox\">\n<div class=\"usage\" style=\"margin-left: 60px; size: tiny\">\n<h3>Usages (0)</h3>\n</div>\n</div>\n" + 
            "<h2><a name=\"C\">urn:C</a></h2>\n<div class=\"entitybox\">\n<div class=\"usage\" style=\"margin-left: 60px; size: tiny\">\n<h3>Usages (0)</h3>\n</div>\n</div>\n" + 
            "<div>\n</div>\n</body>\n</html>\n", render);
    }finally{__CLR4_5_282t82tlvico1lh.R.flushNeeded();}}

    @Test
    public void testCommasOnDisjointTwoOntologyHTML() throws Exception {__CLR4_5_282t82tlvico1lh.R.globalSliceStart(getClass().getName(),10502);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2p6o3cu83q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_282t82tlvico1lh.R.rethrow($CLV_t2$);}finally{__CLR4_5_282t82tlvico1lh.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.DLSyntaxTestCase.testCommasOnDisjointTwoOntologyHTML",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10502,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2p6o3cu83q() throws Exception{try{__CLR4_5_282t82tlvico1lh.R.inc(10502);
        __CLR4_5_282t82tlvico1lh.R.inc(10503);OWLOntology o = m.createOntology(IRI.create("urn:test:onto"));
        __CLR4_5_282t82tlvico1lh.R.inc(10504);OWLClass a = df.getOWLClass(IRI.create("urn:A"));
        __CLR4_5_282t82tlvico1lh.R.inc(10505);OWLClass b = df.getOWLClass(IRI.create("urn:B"));
        __CLR4_5_282t82tlvico1lh.R.inc(10506);OWLAxiom ax = df.getOWLDisjointClassesAxiom(a, b);
        __CLR4_5_282t82tlvico1lh.R.inc(10507);m.addAxiom(o, ax);
        __CLR4_5_282t82tlvico1lh.R.inc(10508);String render = saveOntology(o, new DLSyntaxHTMLDocumentFormat()).toString();
        __CLR4_5_282t82tlvico1lh.R.inc(10509);assertEquals("<html>\n<body>\n<h1>Ontology: \nOntologyID(OntologyIRI(<urn:test:onto>) VersionIRI(<null>))</h1>\n<h2><a name=\"A\">urn:A</a></h2>\n" + 
            "<div class=\"entitybox\">\n<div class=\"axiombox\"> \nA &#8849; &#172; <a href=\"#B\">B</a> </div>\n" + 
            "<div class=\"usage\" style=\"margin-left: 60px; size: tiny\">\n<h3>Usages (0)</h3>\n</div>\n</div>\n" + 
            "<h2><a name=\"B\">urn:B</a></h2>\n<div class=\"entitybox\">\n<div class=\"usage\" style=\"margin-left: 60px; size: tiny\">\n<h3>Usages (0)</h3>\n</div>\n</div>\n" + 
            "<div>\n</div>\n</body>\n</html>\n", render);
    }finally{__CLR4_5_282t82tlvico1lh.R.flushNeeded();}}

    @Test
    public void testCommasOnDisjointFourOntologyHTML() throws Exception {__CLR4_5_282t82tlvico1lh.R.globalSliceStart(getClass().getName(),10510);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fr0usu83y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_282t82tlvico1lh.R.rethrow($CLV_t2$);}finally{__CLR4_5_282t82tlvico1lh.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.DLSyntaxTestCase.testCommasOnDisjointFourOntologyHTML",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10510,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fr0usu83y() throws Exception{try{__CLR4_5_282t82tlvico1lh.R.inc(10510);
        __CLR4_5_282t82tlvico1lh.R.inc(10511);OWLOntology o = m.createOntology(IRI.create("urn:test:onto"));
        __CLR4_5_282t82tlvico1lh.R.inc(10512);OWLClass a = df.getOWLClass(IRI.create("urn:A"));
        __CLR4_5_282t82tlvico1lh.R.inc(10513);OWLClass b = df.getOWLClass(IRI.create("urn:B"));
        __CLR4_5_282t82tlvico1lh.R.inc(10514);OWLClass c = df.getOWLClass(IRI.create("urn:C"));
        __CLR4_5_282t82tlvico1lh.R.inc(10515);OWLClass d = df.getOWLClass(IRI.create("urn:D"));
        __CLR4_5_282t82tlvico1lh.R.inc(10516);OWLAxiom ax = df.getOWLDisjointClassesAxiom(a, b, c, d);
        __CLR4_5_282t82tlvico1lh.R.inc(10517);m.addAxiom(o, ax);
        __CLR4_5_282t82tlvico1lh.R.inc(10518);String render = saveOntology(o, new DLSyntaxHTMLDocumentFormat()).toString();
        __CLR4_5_282t82tlvico1lh.R.inc(10519);assertEquals("<html>\n<body>\n<h1>Ontology: \nOntologyID(OntologyIRI(<urn:test:onto>) VersionIRI(<null>))</h1>\n<h2><a name=\"A\">urn:A</a></h2>\n" + 
            "<div class=\"entitybox\">\n<div class=\"axiombox\"> \nA &#8849; &#172; <a href=\"#B\">B</a>, A &#8849; &#172; <a href=\"#C\">C</a>, A &#8849; &#172; <a href=\"#D\">D</a>, <a href=\"#B\">B</a> &#8849; &#172; <a href=\"#C\">C</a>, <a href=\"#B\">B</a> &#8849; &#172; <a href=\"#D\">D</a>, <a href=\"#C\">C</a> &#8849; &#172; <a href=\"#D\">D</a> </div>\n" + 
            "<div class=\"usage\" style=\"margin-left: 60px; size: tiny\">\n<h3>Usages (0)</h3>\n</div>\n</div>\n<h2><a name=\"B\">urn:B</a></h2>\n" + 
            "<div class=\"entitybox\">\n<div class=\"usage\" style=\"margin-left: 60px; size: tiny\">\n" + 
            "<h3>Usages (0)</h3>\n</div>\n</div>\n<h2><a name=\"C\">urn:C</a></h2>\n" + 
            "<div class=\"entitybox\">\n<div class=\"usage\" style=\"margin-left: 60px; size: tiny\">\n" + 
            "<h3>Usages (0)</h3>\n</div>\n</div>\n<h2><a name=\"D\">urn:D</a></h2>\n" + 
            "<div class=\"entitybox\">\n<div class=\"usage\" style=\"margin-left: 60px; size: tiny\">\n" + 
            "<h3>Usages (0)</h3>\n</div>\n</div>\n<div>\n</div>\n</body>\n</html>\n", render);
    }finally{__CLR4_5_282t82tlvico1lh.R.flushNeeded();}}

    @Test
    public void testCommasOnDisjointThreeOntology() throws Exception {__CLR4_5_282t82tlvico1lh.R.globalSliceStart(getClass().getName(),10520);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lpns7d848();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_282t82tlvico1lh.R.rethrow($CLV_t2$);}finally{__CLR4_5_282t82tlvico1lh.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.DLSyntaxTestCase.testCommasOnDisjointThreeOntology",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10520,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lpns7d848() throws Exception{try{__CLR4_5_282t82tlvico1lh.R.inc(10520);
        __CLR4_5_282t82tlvico1lh.R.inc(10521);OWLOntology o = m.createOntology();
        __CLR4_5_282t82tlvico1lh.R.inc(10522);OWLClass a = df.getOWLClass(IRI.create("urn:A"));
        __CLR4_5_282t82tlvico1lh.R.inc(10523);OWLClass b = df.getOWLClass(IRI.create("urn:B"));
        __CLR4_5_282t82tlvico1lh.R.inc(10524);OWLClass c = df.getOWLClass(IRI.create("urn:C"));
        __CLR4_5_282t82tlvico1lh.R.inc(10525);OWLAxiom ax = df.getOWLDisjointClassesAxiom(a, b, c);
        __CLR4_5_282t82tlvico1lh.R.inc(10526);m.addAxiom(o, ax);
        __CLR4_5_282t82tlvico1lh.R.inc(10527);String render = saveOntology(o, new DLSyntaxDocumentFormat()).toString();
        __CLR4_5_282t82tlvico1lh.R.inc(10528);assertEquals("A \u2291 \u00ac B, A \u2291 \u00ac C, B \u2291 \u00ac C", render);
    }finally{__CLR4_5_282t82tlvico1lh.R.flushNeeded();}}

    @Test
    public void testCommasOnDisjointTwoOntology() throws Exception {__CLR4_5_282t82tlvico1lh.R.globalSliceStart(getClass().getName(),10529);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mwssl384h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_282t82tlvico1lh.R.rethrow($CLV_t2$);}finally{__CLR4_5_282t82tlvico1lh.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.DLSyntaxTestCase.testCommasOnDisjointTwoOntology",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10529,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mwssl384h() throws Exception{try{__CLR4_5_282t82tlvico1lh.R.inc(10529);
        __CLR4_5_282t82tlvico1lh.R.inc(10530);OWLOntology o = m.createOntology();
        __CLR4_5_282t82tlvico1lh.R.inc(10531);OWLClass a = df.getOWLClass(IRI.create("urn:A"));
        __CLR4_5_282t82tlvico1lh.R.inc(10532);OWLClass b = df.getOWLClass(IRI.create("urn:B"));
        __CLR4_5_282t82tlvico1lh.R.inc(10533);OWLAxiom ax = df.getOWLDisjointClassesAxiom(a, b);
        __CLR4_5_282t82tlvico1lh.R.inc(10534);m.addAxiom(o, ax);
        __CLR4_5_282t82tlvico1lh.R.inc(10535);String render = saveOntology(o, new DLSyntaxDocumentFormat()).toString();
        __CLR4_5_282t82tlvico1lh.R.inc(10536);assertEquals("A \u2291 \u00ac B", render);
    }finally{__CLR4_5_282t82tlvico1lh.R.flushNeeded();}}

    @Test
    public void testCommasOnDisjointFourOntology() throws Exception {__CLR4_5_282t82tlvico1lh.R.globalSliceStart(getClass().getName(),10537);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2h4lwzd84p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_282t82tlvico1lh.R.rethrow($CLV_t2$);}finally{__CLR4_5_282t82tlvico1lh.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.DLSyntaxTestCase.testCommasOnDisjointFourOntology",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10537,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2h4lwzd84p() throws Exception{try{__CLR4_5_282t82tlvico1lh.R.inc(10537);
        __CLR4_5_282t82tlvico1lh.R.inc(10538);OWLOntology o = m.createOntology();
        __CLR4_5_282t82tlvico1lh.R.inc(10539);OWLClass a = df.getOWLClass(IRI.create("urn:A"));
        __CLR4_5_282t82tlvico1lh.R.inc(10540);OWLClass b = df.getOWLClass(IRI.create("urn:B"));
        __CLR4_5_282t82tlvico1lh.R.inc(10541);OWLClass c = df.getOWLClass(IRI.create("urn:C"));
        __CLR4_5_282t82tlvico1lh.R.inc(10542);OWLClass d = df.getOWLClass(IRI.create("urn:D"));
        __CLR4_5_282t82tlvico1lh.R.inc(10543);OWLAxiom ax = df.getOWLDisjointClassesAxiom(a, b, c, d);
        __CLR4_5_282t82tlvico1lh.R.inc(10544);m.addAxiom(o, ax);
        __CLR4_5_282t82tlvico1lh.R.inc(10545);String render = saveOntology(o, new DLSyntaxDocumentFormat()).toString();
        __CLR4_5_282t82tlvico1lh.R.inc(10546);assertEquals("A \u2291 \u00ac B, A \u2291 \u00ac C, A \u2291 \u00ac D, B \u2291 \u00ac C, B \u2291 \u00ac D, C \u2291 \u00ac D", render);
    }finally{__CLR4_5_282t82tlvico1lh.R.flushNeeded();}}
}
