/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.semanticweb.owlapi.profiles.test;

import org.junit.Test;

@SuppressWarnings("javadoc")
public class Profile2TestCase extends ProfileBase {static class __CLR4_5_2b5lb5llvico2bi{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,14631,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testURIResolverTestCase3AWebOnt2DRestriction2D003() {__CLR4_5_2b5lb5llvico2bi.R.globalSliceStart(getClass().getName(),14457);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24ehce7b5l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2b5lb5llvico2bi.R.rethrow($CLV_t2$);}finally{__CLR4_5_2b5lb5llvico2bi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile2TestCase.testURIResolverTestCase3AWebOnt2DRestriction2D003",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14457,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24ehce7b5l(){try{__CLR4_5_2b5lb5llvico2bi.R.inc(14457);
        __CLR4_5_2b5lb5llvico2bi.R.inc(14458);String premiseOntology = rdf
                + " xmlns:first=\"urn:test#\" xml:base=\"urn:test\"><owl:Ontology/><owl:DatatypeProperty rdf:about=\"urn:test#dp\"/>"
                + "<owl:Class rdf:about=\"urn:test#C\"><owl:intersectionOf rdf:parseType=\"Collection\">"
                + "<owl:Class rdf:about=\"urn:test#superC\"/><owl:Restriction rdf:nodeID=\"r\"><owl:onProperty rdf:resource=\"urn:test#dp\"/><owl:someValuesFrom rdf:resource=\"http://www.w3.org/2001/XMLSchema#byte\" /></owl:Restriction></owl:intersectionOf></owl:Class>"
                + "<owl:Class rdf:about=\"urn:test#D\"><owl:intersectionOf rdf:parseType=\"Collection\">"
                + "<owl:Class rdf:about=\"urn:test#superD\"/><rdf:Description rdf:nodeID=\"r\"/></owl:intersectionOf></owl:Class></rdf:RDF>";
        __CLR4_5_2b5lb5llvico2bi.R.inc(14459);test(premiseOntology, false, false, false, true);
    }finally{__CLR4_5_2b5lb5llvico2bi.R.flushNeeded();}}

    @Test
    public void testURIResolverTestCase3AWebOnt2DRestriction2D004() {__CLR4_5_2b5lb5llvico2bi.R.globalSliceStart(getClass().getName(),14460);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27nhb6ob5o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2b5lb5llvico2bi.R.rethrow($CLV_t2$);}finally{__CLR4_5_2b5lb5llvico2bi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile2TestCase.testURIResolverTestCase3AWebOnt2DRestriction2D004",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14460,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27nhb6ob5o(){try{__CLR4_5_2b5lb5llvico2bi.R.inc(14460);
        __CLR4_5_2b5lb5llvico2bi.R.inc(14461);String premiseOntology = rdf
                + " xml:base=\"urn:test\"><owl:Ontology/><owl:DatatypeProperty rdf:about=\"urn:test#dp\"/>"
                + "<owl:Class rdf:about=\"urn:test#C\"><owl:intersectionOf rdf:parseType=\"Collection\">"
                + "<owl:Class rdf:about=\"urn:test#superC\"/><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#dp\"/><owl:someValuesFrom rdf:resource=\"http://www.w3.org/2001/XMLSchema#byte\" /></owl:Restriction></owl:intersectionOf></owl:Class>"
                + "<owl:Class rdf:about=\"urn:test#D\"><owl:intersectionOf rdf:parseType=\"Collection\">"
                + "<owl:Class rdf:about=\"urn:test#superD\"/><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#dp\"/><owl:someValuesFrom rdf:resource=\"http://www.w3.org/2001/XMLSchema#byte\" /></owl:Restriction></owl:intersectionOf></owl:Class></rdf:RDF>";
        __CLR4_5_2b5lb5llvico2bi.R.inc(14462);test(premiseOntology, false, false, false, true);
    }finally{__CLR4_5_2b5lb5llvico2bi.R.flushNeeded();}}

    @Test
    public void testURIResolverTestCase3AWebOnt2DSymmetricProperty2D002() {__CLR4_5_2b5lb5llvico2bi.R.globalSliceStart(getClass().getName(),14463);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26f9u9ub5r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2b5lb5llvico2bi.R.rethrow($CLV_t2$);}finally{__CLR4_5_2b5lb5llvico2bi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile2TestCase.testURIResolverTestCase3AWebOnt2DSymmetricProperty2D002",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14463,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26f9u9ub5r(){try{__CLR4_5_2b5lb5llvico2bi.R.inc(14463);
        __CLR4_5_2b5lb5llvico2bi.R.inc(14464);String premiseOntology = rdf
                + " xmlns:first=\"urn:test#\" xml:base=\"urn:test\"><owl:Ontology/><owl:InverseFunctionalProperty rdf:about=\"urn:test#equalityOnA\"><rdfs:range>"
                + "<owl:Class rdf:about=\"urn:test#A\"><owl:oneOf rdf:parseType=\"Collection\"><owl:Thing rdf:about=\"urn:test#a\"/><owl:Thing rdf:about=\"urn:test#b\"/></owl:oneOf></owl:Class></rdfs:range></owl:InverseFunctionalProperty><owl:Thing rdf:about=\"urn:test#a\">"
                + "<first:equalityOnA rdf:resource=\"urn:test#a\"/></owl:Thing><owl:Thing rdf:about=\"urn:test#b\">"
                + "<first:equalityOnA rdf:resource=\"urn:test#b\"/></owl:Thing><owl:Thing rdf:about=\"urn:test#c\"/></rdf:RDF>";
        __CLR4_5_2b5lb5llvico2bi.R.inc(14465);test(premiseOntology, false, false, false, true);
    }finally{__CLR4_5_2b5lb5llvico2bi.R.flushNeeded();}}

    @Test
    public void testURIResolverTestCase3AWebOnt2DThing2D003() {__CLR4_5_2b5lb5llvico2bi.R.globalSliceStart(getClass().getName(),14466);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fkpuubb5u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2b5lb5llvico2bi.R.rethrow($CLV_t2$);}finally{__CLR4_5_2b5lb5llvico2bi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile2TestCase.testURIResolverTestCase3AWebOnt2DThing2D003",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14466,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fkpuubb5u(){try{__CLR4_5_2b5lb5llvico2bi.R.inc(14466);
        __CLR4_5_2b5lb5llvico2bi.R.inc(14467);String premiseOntology = head
                + "xml:base=\"urn:test\"><owl:Ontology/>"
                + "<owl:Class rdf:about=\"http://www.w3.org/2002/07/owl#Thing\"><owl:equivalentClass rdf:resource=\"http://www.w3.org/2002/07/owl#Nothing\"/></owl:Class></rdf:RDF>";
        __CLR4_5_2b5lb5llvico2bi.R.inc(14468);test(premiseOntology, true, true, false, true);
    }finally{__CLR4_5_2b5lb5llvico2bi.R.flushNeeded();}}

    @Test
    public void testURIResolverTestCase3AWebOnt2DThing2D004() {__CLR4_5_2b5lb5llvico2bi.R.globalSliceStart(getClass().getName(),14469);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cbpw1ub5x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2b5lb5llvico2bi.R.rethrow($CLV_t2$);}finally{__CLR4_5_2b5lb5llvico2bi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile2TestCase.testURIResolverTestCase3AWebOnt2DThing2D004",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14469,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cbpw1ub5x(){try{__CLR4_5_2b5lb5llvico2bi.R.inc(14469);
        __CLR4_5_2b5lb5llvico2bi.R.inc(14470);String premiseOntology = head
                + "xml:base=\"urn:test\"><owl:Ontology/>"
                + "<owl:Class rdf:about=\"http://www.w3.org/2002/07/owl#Thing\"><owl:oneOf rdf:parseType=\"Collection\"><owl:Thing rdf:about=\"urn:test#s\"/></owl:oneOf></owl:Class></rdf:RDF>";
        __CLR4_5_2b5lb5llvico2bi.R.inc(14471);test(premiseOntology, true, false, false, true);
    }finally{__CLR4_5_2b5lb5llvico2bi.R.flushNeeded();}}

    @Test
    public void testURIResolverTestCase3AWebOnt2DTransitiveProperty2D002() {__CLR4_5_2b5lb5llvico2bi.R.globalSliceStart(getClass().getName(),14472);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yw1c6ib60();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2b5lb5llvico2bi.R.rethrow($CLV_t2$);}finally{__CLR4_5_2b5lb5llvico2bi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile2TestCase.testURIResolverTestCase3AWebOnt2DTransitiveProperty2D002",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14472,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yw1c6ib60(){try{__CLR4_5_2b5lb5llvico2bi.R.inc(14472);
        __CLR4_5_2b5lb5llvico2bi.R.inc(14473);String premiseOntology = rdf
                + " xmlns:first=\"urn:test#\" xmlns:second=\"urn:test#\" xml:base=\"urn:test\"><owl:Ontology/><owl:SymmetricProperty rdf:about=\"urn:test#symProp\"><rdfs:range>"
                + "<owl:Class><owl:oneOf rdf:parseType=\"Collection\"><owl:Thing rdf:about=\"urn:test#a\"/><owl:Thing rdf:about=\"urn:test#b\"/></owl:oneOf></owl:Class></rdfs:range></owl:SymmetricProperty><owl:Thing rdf:about=\"urn:test#a\">"
                + "<first:symProp rdf:resource=\"urn:test#a\"/></owl:Thing><owl:Thing rdf:about=\"urn:test#b\">"
                + "<first:symProp rdf:resource=\"urn:test#b\"/></owl:Thing></rdf:RDF>";
        __CLR4_5_2b5lb5llvico2bi.R.inc(14474);test(premiseOntology, false, false, false, true);
    }finally{__CLR4_5_2b5lb5llvico2bi.R.flushNeeded();}}

    @Test
    public void testURIResolverTestCase3AWebOnt2DallValuesFrom2D001() {__CLR4_5_2b5lb5llvico2bi.R.globalSliceStart(getClass().getName(),14475);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2x9seikb63();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2b5lb5llvico2bi.R.rethrow($CLV_t2$);}finally{__CLR4_5_2b5lb5llvico2bi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile2TestCase.testURIResolverTestCase3AWebOnt2DallValuesFrom2D001",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14475,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2x9seikb63(){try{__CLR4_5_2b5lb5llvico2bi.R.inc(14475);
        __CLR4_5_2b5lb5llvico2bi.R.inc(14476);String premiseOntology = rdf
                + " xmlns:first=\"urn:test#\" xml:base=\"urn:test\"><owl:Ontology/>"
                + "<owl:Class rdf:about=\"urn:test#r\"><rdfs:subClassOf><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#p\"/><owl:allValuesFrom rdf:resource=\"urn:test#c\"/></owl:Restriction></rdfs:subClassOf></owl:Class><owl:ObjectProperty rdf:about=\"urn:test#p\"/>"
                + "<owl:Class rdf:about=\"urn:test#c\"/>"
                + "<first:r rdf:about=\"urn:test#i\"><rdf:type rdf:resource=\"http://www.w3.org/2002/07/owl#Thing\"/>"
                + "<first:p><owl:Thing rdf:about=\"urn:test#o\" /></first:p></first:r></rdf:RDF>";
        __CLR4_5_2b5lb5llvico2bi.R.inc(14477);test(premiseOntology, false, false, false, true);
    }finally{__CLR4_5_2b5lb5llvico2bi.R.flushNeeded();}}

    @Test
    public void testURIResolverTestCase3AWebOnt2DallValuesFrom2D002() {__CLR4_5_2b5lb5llvico2bi.R.globalSliceStart(getClass().getName(),14478);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yiboo3b66();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2b5lb5llvico2bi.R.rethrow($CLV_t2$);}finally{__CLR4_5_2b5lb5llvico2bi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile2TestCase.testURIResolverTestCase3AWebOnt2DallValuesFrom2D002",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14478,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yiboo3b66(){try{__CLR4_5_2b5lb5llvico2bi.R.inc(14478);
        __CLR4_5_2b5lb5llvico2bi.R.inc(14479);String premiseOntology = rdf
                + " xmlns:first=\"urn:test#\" xml:base=\"urn:test\"><owl:Ontology/>"
                + "<owl:Class rdf:about=\"urn:test#r\"><rdfs:subClassOf><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#p\"/><owl:allValuesFrom rdf:resource=\"urn:test#c\"/></owl:Restriction></rdfs:subClassOf></owl:Class><owl:ObjectProperty rdf:about=\"urn:test#p\"/>"
                + "<owl:Class rdf:about=\"urn:test#c\"/>"
                + "<first:r rdf:about=\"urn:test#i\"><rdf:type rdf:resource=\"http://www.w3.org/2002/07/owl#Thing\"/></first:r></rdf:RDF>";
        __CLR4_5_2b5lb5llvico2bi.R.inc(14480);test(premiseOntology, false, false, false, true);
    }finally{__CLR4_5_2b5lb5llvico2bi.R.flushNeeded();}}

    @Test
    public void testURIResolverTestCase3AWebOnt2DbackwardCompatibleWith2D002() {__CLR4_5_2b5lb5llvico2bi.R.globalSliceStart(getClass().getName(),14481);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2c348yvb69();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2b5lb5llvico2bi.R.rethrow($CLV_t2$);}finally{__CLR4_5_2b5lb5llvico2bi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile2TestCase.testURIResolverTestCase3AWebOnt2DbackwardCompatibleWith2D002",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14481,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2c348yvb69(){try{__CLR4_5_2b5lb5llvico2bi.R.inc(14481);
        __CLR4_5_2b5lb5llvico2bi.R.inc(14482);String premiseOntology = rdf
                + " xmlns:first=\"urn:test#\" xml:base=\"urn:test\"><rdf:Description><owl:backwardCompatibleWith><owl:Ontology rdf:about=\"http://www.example.org/\"/></owl:backwardCompatibleWith></rdf:Description></rdf:RDF>";
        __CLR4_5_2b5lb5llvico2bi.R.inc(14483);test(premiseOntology, true, true, true, true);
    }finally{__CLR4_5_2b5lb5llvico2bi.R.flushNeeded();}}

    @Test
    public void testURIResolverTestCase3AWebOnt2Dcardinality2D001() {__CLR4_5_2b5lb5llvico2bi.R.globalSliceStart(getClass().getName(),14484);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2g9pwpnb6c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2b5lb5llvico2bi.R.rethrow($CLV_t2$);}finally{__CLR4_5_2b5lb5llvico2bi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile2TestCase.testURIResolverTestCase3AWebOnt2Dcardinality2D001",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14484,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2g9pwpnb6c(){try{__CLR4_5_2b5lb5llvico2bi.R.inc(14484);
        __CLR4_5_2b5lb5llvico2bi.R.inc(14485);String premiseOntology = rdf
                + " xml:base=\"urn:test\"><owl:Ontology/>"
                + "<owl:Class rdf:about=\"urn:test#c\"><rdfs:subClassOf><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#p\"/><owl:cardinality rdf:datatype=\"http://www.w3.org/2001/XMLSchema#nonNegativeInteger\">1</owl:cardinality></owl:Restriction></rdfs:subClassOf></owl:Class><owl:ObjectProperty rdf:about=\"urn:test#p\"/></rdf:RDF>";
        __CLR4_5_2b5lb5llvico2bi.R.inc(14486);test(premiseOntology, false, false, false, true);
    }finally{__CLR4_5_2b5lb5llvico2bi.R.flushNeeded();}}

    @Test
    public void testURIResolverTestCase3AWebOnt2Dcardinality2D002() {__CLR4_5_2b5lb5llvico2bi.R.globalSliceStart(getClass().getName(),14487);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jipvi4b6f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2b5lb5llvico2bi.R.rethrow($CLV_t2$);}finally{__CLR4_5_2b5lb5llvico2bi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile2TestCase.testURIResolverTestCase3AWebOnt2Dcardinality2D002",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14487,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jipvi4b6f(){try{__CLR4_5_2b5lb5llvico2bi.R.inc(14487);
        __CLR4_5_2b5lb5llvico2bi.R.inc(14488);String premiseOntology = rdf
                + " xml:base=\"urn:test\"><owl:Ontology/>"
                + "<owl:Class rdf:about=\"urn:test#c\"><rdfs:subClassOf><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#p\"/><owl:maxCardinality rdf:datatype=\"http://www.w3.org/2001/XMLSchema#nonNegativeInteger\">1</owl:maxCardinality></owl:Restriction></rdfs:subClassOf><rdfs:subClassOf><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#p\"/><owl:minCardinality rdf:datatype=\"http://www.w3.org/2001/XMLSchema#nonNegativeInteger\">1</owl:minCardinality></owl:Restriction></rdfs:subClassOf></owl:Class><owl:ObjectProperty rdf:about=\"urn:test#p\"/></rdf:RDF>";
        __CLR4_5_2b5lb5llvico2bi.R.inc(14489);test(premiseOntology, false, false, false, true);
    }finally{__CLR4_5_2b5lb5llvico2bi.R.flushNeeded();}}

    @Test
    public void testURIResolverTestCase3AWebOnt2Dcardinality2D003() {__CLR4_5_2b5lb5llvico2bi.R.globalSliceStart(getClass().getName(),14490);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mrpualb6i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2b5lb5llvico2bi.R.rethrow($CLV_t2$);}finally{__CLR4_5_2b5lb5llvico2bi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile2TestCase.testURIResolverTestCase3AWebOnt2Dcardinality2D003",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14490,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mrpualb6i(){try{__CLR4_5_2b5lb5llvico2bi.R.inc(14490);
        __CLR4_5_2b5lb5llvico2bi.R.inc(14491);String premiseOntology = rdf
                + " xml:base=\"urn:test\"><owl:Ontology/>"
                + "<owl:Class rdf:about=\"urn:test#c\"><rdfs:subClassOf><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#p\"/><owl:cardinality rdf:datatype=\"http://www.w3.org/2001/XMLSchema#nonNegativeInteger\">2</owl:cardinality></owl:Restriction></rdfs:subClassOf></owl:Class><owl:ObjectProperty rdf:about=\"urn:test#p\"/></rdf:RDF>";
        __CLR4_5_2b5lb5llvico2bi.R.inc(14492);test(premiseOntology, false, false, false, true);
    }finally{__CLR4_5_2b5lb5llvico2bi.R.flushNeeded();}}

    @Test
    public void testURIResolverTestCase3AWebOnt2Dcardinality2D004() {__CLR4_5_2b5lb5llvico2bi.R.globalSliceStart(getClass().getName(),14493);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2q0pt32b6l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2b5lb5llvico2bi.R.rethrow($CLV_t2$);}finally{__CLR4_5_2b5lb5llvico2bi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile2TestCase.testURIResolverTestCase3AWebOnt2Dcardinality2D004",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14493,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2q0pt32b6l(){try{__CLR4_5_2b5lb5llvico2bi.R.inc(14493);
        __CLR4_5_2b5lb5llvico2bi.R.inc(14494);String premiseOntology = rdf
                + " xml:base=\"urn:test\"><owl:Ontology/>"
                + "<owl:Class rdf:about=\"urn:test#c\"><rdfs:subClassOf>"
                + "<owl:Class><owl:intersectionOf rdf:parseType=\"Collection\"><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#p\"/><owl:maxCardinality rdf:datatype=\"http://www.w3.org/2001/XMLSchema#nonNegativeInteger\">2</owl:maxCardinality></owl:Restriction><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#p\"/><owl:minCardinality rdf:datatype=\"http://www.w3.org/2001/XMLSchema#nonNegativeInteger\">2</owl:minCardinality></owl:Restriction></owl:intersectionOf></owl:Class></rdfs:subClassOf></owl:Class><owl:ObjectProperty rdf:about=\"urn:test#p\"/></rdf:RDF>";
        __CLR4_5_2b5lb5llvico2bi.R.inc(14495);test(premiseOntology, false, false, false, true);
    }finally{__CLR4_5_2b5lb5llvico2bi.R.flushNeeded();}}

    @Test
    public void testURIResolverTestCase3AWebOnt2Ddescription2Dlogic2D001() {__CLR4_5_2b5lb5llvico2bi.R.globalSliceStart(getClass().getName(),14496);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2r1fnkdb6o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2b5lb5llvico2bi.R.rethrow($CLV_t2$);}finally{__CLR4_5_2b5lb5llvico2bi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile2TestCase.testURIResolverTestCase3AWebOnt2Ddescription2Dlogic2D001",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14496,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2r1fnkdb6o(){try{__CLR4_5_2b5lb5llvico2bi.R.inc(14496);
        __CLR4_5_2b5lb5llvico2bi.R.inc(14497);String premiseOntology = head2
                + "<owl:Ontology rdf:about=\"\"/>"
                + "<owl:Class rdf:about=\"urn:test#Unsatisfiable\"><owl:equivalentClass>"
                + "<owl:Class><owl:unionOf rdf:parseType=\"Collection\">"
                + "<owl:Class><owl:intersectionOf rdf:parseType=\"Collection\">"
                + "<owl:Class rdf:about=\"urn:test#a\"/>"
                + "<owl:Class rdf:about=\"urn:test#b\"/></owl:intersectionOf></owl:Class>"
                + "<owl:Class><owl:intersectionOf rdf:parseType=\"Collection\">"
                + "<owl:Class rdf:about=\"urn:test#a\"/>"
                + "<owl:Class rdf:about=\"urn:test#c\"/></owl:intersectionOf></owl:Class>"
                + "<owl:Class><owl:intersectionOf rdf:parseType=\"Collection\">"
                + "<owl:Class rdf:about=\"urn:test#b\"/>"
                + "<owl:Class rdf:about=\"urn:test#c\"/></owl:intersectionOf></owl:Class></owl:unionOf></owl:Class></owl:equivalentClass></owl:Class>"
                + "<owl:Class rdf:about=\"urn:test#a\"><rdfs:subClassOf>"
                + "<owl:Class><owl:complementOf>"
                + "<owl:Class><owl:unionOf rdf:parseType=\"Collection\">"
                + "<owl:Class rdf:about=\"urn:test#b\"/>"
                + "<owl:Class rdf:about=\"urn:test#c\"/></owl:unionOf></owl:Class></owl:complementOf></owl:Class></rdfs:subClassOf></owl:Class>"
                + "<owl:Class rdf:about=\"urn:test#b\"><rdfs:subClassOf>"
                + "<owl:Class><owl:complementOf>"
                + "<owl:Class rdf:about=\"urn:test#c\"/></owl:complementOf></owl:Class></rdfs:subClassOf></owl:Class>"
                + "<owl:Class rdf:about=\"urn:test#c\"/><rdf:Description><rdf:type rdf:resource=\"urn:test#Unsatisfiable\"/></rdf:Description></rdf:RDF>";
        __CLR4_5_2b5lb5llvico2bi.R.inc(14498);test(premiseOntology, false, false, false, true);
    }finally{__CLR4_5_2b5lb5llvico2bi.R.flushNeeded();}}

    @Test
    public void testURIResolverTestCase3AWebOnt2Ddescription2Dlogic2D002() {__CLR4_5_2b5lb5llvico2bi.R.globalSliceStart(getClass().getName(),14499);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nsforwb6r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2b5lb5llvico2bi.R.rethrow($CLV_t2$);}finally{__CLR4_5_2b5lb5llvico2bi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile2TestCase.testURIResolverTestCase3AWebOnt2Ddescription2Dlogic2D002",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14499,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nsforwb6r(){try{__CLR4_5_2b5lb5llvico2bi.R.inc(14499);
        __CLR4_5_2b5lb5llvico2bi.R.inc(14500);String premiseOntology = head2
                + "<owl:Ontology rdf:about=\"\"/>"
                + "<owl:Class rdf:about=\"urn:test#Unsatisfiable\"><rdfs:subClassOf>"
                + "<owl:Class rdf:about=\"urn:test#c\"/></rdfs:subClassOf><rdfs:subClassOf>"
                + "<owl:Class><owl:complementOf>"
                + "<owl:Class rdf:about=\"urn:test#d\"/></owl:complementOf></owl:Class></rdfs:subClassOf></owl:Class>"
                + "<owl:Class rdf:about=\"urn:test#c\"><rdfs:subClassOf><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#r\"/><owl:allValuesFrom>"
                + "<owl:Class rdf:about=\"urn:test#c\"/></owl:allValuesFrom></owl:Restriction></rdfs:subClassOf></owl:Class>"
                + "<owl:Class rdf:about=\"urn:test#d\"/><owl:ObjectProperty rdf:about=\"urn:test#r\"/><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#r\"/><owl:allValuesFrom>"
                + "<owl:Class rdf:about=\"urn:test#c\"/></owl:allValuesFrom><rdfs:subClassOf>"
                + "<owl:Class rdf:about=\"urn:test#d\"/></rdfs:subClassOf></owl:Restriction><rdf:Description><rdf:type rdf:resource=\"urn:test#Unsatisfiable\"/></rdf:Description></rdf:RDF>";
        __CLR4_5_2b5lb5llvico2bi.R.inc(14501);test(premiseOntology, false, false, false, true);
    }finally{__CLR4_5_2b5lb5llvico2bi.R.flushNeeded();}}

    @Test
    public void testURIResolverTestCase3AWebOnt2Ddescription2Dlogic2D003() {__CLR4_5_2b5lb5llvico2bi.R.globalSliceStart(getClass().getName(),14502);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kjfpzfb6u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2b5lb5llvico2bi.R.rethrow($CLV_t2$);}finally{__CLR4_5_2b5lb5llvico2bi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile2TestCase.testURIResolverTestCase3AWebOnt2Ddescription2Dlogic2D003",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14502,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kjfpzfb6u(){try{__CLR4_5_2b5lb5llvico2bi.R.inc(14502);
        __CLR4_5_2b5lb5llvico2bi.R.inc(14503);String premiseOntology = head2
                + "<owl:Ontology rdf:about=\"\"/>"
                + "<owl:Class rdf:about=\"urn:test#Unsatisfiable\"><owl:equivalentClass>"
                + "<owl:Class><owl:intersectionOf rdf:parseType=\"Collection\"><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#f1\"/><owl:someValuesFrom>"
                + "<owl:Class rdf:about=\"urn:test#p1\"/></owl:someValuesFrom></owl:Restriction><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#f2\"/><owl:someValuesFrom>"
                + "<owl:Class><owl:complementOf>"
                + "<owl:Class rdf:about=\"urn:test#p1\"/></owl:complementOf></owl:Class></owl:someValuesFrom></owl:Restriction><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#f3\"/><owl:someValuesFrom>"
                + "<owl:Class rdf:about=\"urn:test#p2\"/></owl:someValuesFrom></owl:Restriction></owl:intersectionOf></owl:Class></owl:equivalentClass></owl:Class>"
                + "<owl:Class rdf:about=\"urn:test#p1\"/>"
                + "<owl:Class rdf:about=\"urn:test#p2\"/><owl:ObjectProperty rdf:about=\"urn:test#f1\"/><owl:FunctionalProperty rdf:about=\"urn:test#f1\"/><owl:ObjectProperty rdf:about=\"urn:test#f2\"/><owl:FunctionalProperty rdf:about=\"urn:test#f2\"/><owl:ObjectProperty rdf:about=\"urn:test#f3\"><rdfs:subPropertyOf rdf:resource=\"urn:test#f2\"/><rdfs:subPropertyOf rdf:resource=\"urn:test#f1\"/></owl:ObjectProperty><owl:FunctionalProperty rdf:about=\"urn:test#f3\"/><rdf:Description><rdf:type rdf:resource=\"urn:test#Unsatisfiable\"/></rdf:Description></rdf:RDF>";
        __CLR4_5_2b5lb5llvico2bi.R.inc(14504);test(premiseOntology, false, false, false, true);
    }finally{__CLR4_5_2b5lb5llvico2bi.R.flushNeeded();}}

    @Test
    public void testURIResolverTestCase3AWebOnt2Ddescription2Dlogic2D004() {__CLR4_5_2b5lb5llvico2bi.R.globalSliceStart(getClass().getName(),14505);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hafr6yb6x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2b5lb5llvico2bi.R.rethrow($CLV_t2$);}finally{__CLR4_5_2b5lb5llvico2bi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile2TestCase.testURIResolverTestCase3AWebOnt2Ddescription2Dlogic2D004",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14505,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hafr6yb6x(){try{__CLR4_5_2b5lb5llvico2bi.R.inc(14505);
        __CLR4_5_2b5lb5llvico2bi.R.inc(14506);String premiseOntology = head2
                + "<owl:Ontology rdf:about=\"\"/>"
                + "<owl:Class rdf:about=\"urn:test#Unsatisfiable\"><owl:equivalentClass>"
                + "<owl:Class><owl:intersectionOf rdf:parseType=\"Collection\">"
                + "<owl:Class><owl:complementOf><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#rx3\"/><owl:someValuesFrom>"
                + "<owl:Class><owl:intersectionOf rdf:parseType=\"Collection\">"
                + "<owl:Class rdf:about=\"urn:test#c1\"/>"
                + "<owl:Class rdf:about=\"urn:test#c2\"/></owl:intersectionOf></owl:Class></owl:someValuesFrom></owl:Restriction></owl:complementOf></owl:Class><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#rx3\"/><owl:someValuesFrom>"
                + "<owl:Class rdf:about=\"urn:test#c1\"/></owl:someValuesFrom></owl:Restriction><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#rx4\"/><owl:someValuesFrom>"
                + "<owl:Class rdf:about=\"urn:test#c2\"/></owl:someValuesFrom></owl:Restriction></owl:intersectionOf></owl:Class></owl:equivalentClass></owl:Class>"
                + "<owl:Class rdf:about=\"urn:test#c1\"/>"
                + "<owl:Class rdf:about=\"urn:test#c2\"/><owl:ObjectProperty rdf:about=\"urn:test#rx1\"/><owl:ObjectProperty rdf:about=\"urn:test#rx2\"/><owl:ObjectProperty rdf:about=\"urn:test#rx3\"><rdfs:subPropertyOf rdf:resource=\"urn:test#rx1\"/><rdfs:subPropertyOf rdf:resource=\"urn:test#rx\"/></owl:ObjectProperty><owl:FunctionalProperty rdf:about=\"urn:test#rx3\"/><owl:ObjectProperty rdf:about=\"urn:test#rx4\"><rdfs:subPropertyOf rdf:resource=\"urn:test#rx2\"/><rdfs:subPropertyOf rdf:resource=\"urn:test#rx\"/></owl:ObjectProperty><owl:FunctionalProperty rdf:about=\"urn:test#rx4\"/><owl:ObjectProperty rdf:about=\"urn:test#rxa\"/><owl:ObjectProperty rdf:about=\"urn:test#rx1a\"/><owl:ObjectProperty rdf:about=\"urn:test#rx2a\"/><owl:ObjectProperty rdf:about=\"urn:test#rx3a\"><rdfs:subPropertyOf rdf:resource=\"urn:test#rx1a\"/><rdfs:subPropertyOf rdf:resource=\"urn:test#rxa\"/></owl:ObjectProperty><owl:FunctionalProperty rdf:about=\"urn:test#rx3a\"/><owl:ObjectProperty rdf:about=\"urn:test#rx4a\"><rdfs:subPropertyOf rdf:resource=\"urn:test#rx2a\"/><rdfs:subPropertyOf rdf:resource=\"urn:test#rxa\"/></owl:ObjectProperty><owl:FunctionalProperty rdf:about=\"urn:test#rx4a\"/><owl:ObjectProperty rdf:about=\"urn:test#rx\"/><owl:FunctionalProperty rdf:about=\"urn:test#rx\"/><rdf:Description><rdf:type rdf:resource=\"urn:test#Unsatisfiable\"/></rdf:Description></rdf:RDF>";
        __CLR4_5_2b5lb5llvico2bi.R.inc(14507);test(premiseOntology, false, false, false, true);
    }finally{__CLR4_5_2b5lb5llvico2bi.R.flushNeeded();}}

    @Test
    public void testURIResolverTestCase3AWebOnt2Ddescription2Dlogic2D005() {__CLR4_5_2b5lb5llvico2bi.R.globalSliceStart(getClass().getName(),14508);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e1fsehb70();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2b5lb5llvico2bi.R.rethrow($CLV_t2$);}finally{__CLR4_5_2b5lb5llvico2bi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile2TestCase.testURIResolverTestCase3AWebOnt2Ddescription2Dlogic2D005",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14508,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e1fsehb70(){try{__CLR4_5_2b5lb5llvico2bi.R.inc(14508);
        __CLR4_5_2b5lb5llvico2bi.R.inc(14509);String premiseOntology = head2
                + "<owl:Ontology rdf:about=\"\"/>"
                + "<owl:Class rdf:about=\"urn:test#Satisfiable\"><owl:equivalentClass>"
                + "<owl:Class><owl:intersectionOf rdf:parseType=\"Collection\">"
                + "<owl:Class><owl:complementOf><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#rx3a\"/><owl:someValuesFrom>"
                + "<owl:Class><owl:intersectionOf rdf:parseType=\"Collection\">"
                + "<owl:Class rdf:about=\"urn:test#c1\"/>"
                + "<owl:Class rdf:about=\"urn:test#c2\"/></owl:intersectionOf></owl:Class></owl:someValuesFrom></owl:Restriction></owl:complementOf></owl:Class><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#rx3a\"/><owl:someValuesFrom>"
                + "<owl:Class rdf:about=\"urn:test#c1\"/></owl:someValuesFrom></owl:Restriction><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#rx4a\"/><owl:someValuesFrom>"
                + "<owl:Class rdf:about=\"urn:test#c2\"/></owl:someValuesFrom></owl:Restriction></owl:intersectionOf></owl:Class></owl:equivalentClass></owl:Class>"
                + "<owl:Class rdf:about=\"urn:test#c1\"/>"
                + "<owl:Class rdf:about=\"urn:test#c2\"/><owl:ObjectProperty rdf:about=\"urn:test#rx1\"/><owl:ObjectProperty rdf:about=\"urn:test#rx2\"/><owl:ObjectProperty rdf:about=\"urn:test#rx3\"><rdfs:subPropertyOf rdf:resource=\"urn:test#rx1\"/><rdfs:subPropertyOf rdf:resource=\"urn:test#rx\"/></owl:ObjectProperty><owl:FunctionalProperty rdf:about=\"urn:test#rx3\"/><owl:ObjectProperty rdf:about=\"urn:test#rx4\"><rdfs:subPropertyOf rdf:resource=\"urn:test#rx2\"/><rdfs:subPropertyOf rdf:resource=\"urn:test#rx\"/></owl:ObjectProperty><owl:FunctionalProperty rdf:about=\"urn:test#rx4\"/><owl:ObjectProperty rdf:about=\"urn:test#rxa\"/><owl:ObjectProperty rdf:about=\"urn:test#rx1a\"/><owl:ObjectProperty rdf:about=\"urn:test#rx2a\"/><owl:ObjectProperty rdf:about=\"urn:test#rx3a\"><rdfs:subPropertyOf rdf:resource=\"urn:test#rx1a\"/><rdfs:subPropertyOf rdf:resource=\"urn:test#rxa\"/></owl:ObjectProperty><owl:FunctionalProperty rdf:about=\"urn:test#rx3a\"/><owl:ObjectProperty rdf:about=\"urn:test#rx4a\"><rdfs:subPropertyOf rdf:resource=\"urn:test#rx2a\"/><rdfs:subPropertyOf rdf:resource=\"urn:test#rxa\"/></owl:ObjectProperty><owl:FunctionalProperty rdf:about=\"urn:test#rx4a\"/><owl:ObjectProperty rdf:about=\"urn:test#rx\"/><owl:FunctionalProperty rdf:about=\"urn:test#rx\"/><rdf:Description><rdf:type rdf:resource=\"urn:test#Satisfiable\"/></rdf:Description></rdf:RDF>";
        __CLR4_5_2b5lb5llvico2bi.R.inc(14510);test(premiseOntology, false, false, false, true);
    }finally{__CLR4_5_2b5lb5llvico2bi.R.flushNeeded();}}

    @Test
    public void testURIResolverTestCase3AWebOnt2Ddescription2Dlogic2D006() {__CLR4_5_2b5lb5llvico2bi.R.globalSliceStart(getClass().getName(),14511);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2asftm0b73();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2b5lb5llvico2bi.R.rethrow($CLV_t2$);}finally{__CLR4_5_2b5lb5llvico2bi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile2TestCase.testURIResolverTestCase3AWebOnt2Ddescription2Dlogic2D006",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14511,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2asftm0b73(){try{__CLR4_5_2b5lb5llvico2bi.R.inc(14511);
        __CLR4_5_2b5lb5llvico2bi.R.inc(14512);String premiseOntology = head2
                + "<owl:Ontology rdf:about=\"\"/>"
                + "<owl:Class rdf:about=\"urn:test#Satisfiable\"><owl:equivalentClass><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#invR\"/><owl:someValuesFrom>"
                + "<owl:Class><owl:intersectionOf rdf:parseType=\"Collection\"><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#r\"/><owl:someValuesFrom>"
                + "<owl:Class rdf:about=\"urn:test#p1\"/></owl:someValuesFrom></owl:Restriction><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#r\"/><owl:maxCardinality rdf:datatype=\"http://www.w3.org/2001/XMLSchema#nonNegativeInteger\">1</owl:maxCardinality></owl:Restriction></owl:intersectionOf></owl:Class></owl:someValuesFrom></owl:Restriction></owl:equivalentClass></owl:Class>"
                + "<owl:Class rdf:about=\"urn:test#p1\"><rdfs:subClassOf>"
                + "<owl:Class><owl:complementOf>"
                + "<owl:Class><owl:unionOf rdf:parseType=\"Collection\">"
                + "<owl:Class rdf:about=\"urn:test#p2\"/>"
                + "<owl:Class rdf:about=\"urn:test#p3\"/>"
                + "<owl:Class rdf:about=\"urn:test#p4\"/>"
                + "<owl:Class rdf:about=\"urn:test#p5\"/></owl:unionOf></owl:Class></owl:complementOf></owl:Class></rdfs:subClassOf></owl:Class>"
                + "<owl:Class rdf:about=\"urn:test#p2\"><rdfs:subClassOf>"
                + "<owl:Class><owl:complementOf>"
                + "<owl:Class><owl:unionOf rdf:parseType=\"Collection\">"
                + "<owl:Class rdf:about=\"urn:test#p3\"/>"
                + "<owl:Class rdf:about=\"urn:test#p4\"/>"
                + "<owl:Class rdf:about=\"urn:test#p5\"/></owl:unionOf></owl:Class></owl:complementOf></owl:Class></rdfs:subClassOf></owl:Class>"
                + "<owl:Class rdf:about=\"urn:test#p3\"><rdfs:subClassOf>"
                + "<owl:Class><owl:complementOf>"
                + "<owl:Class><owl:unionOf rdf:parseType=\"Collection\">"
                + "<owl:Class rdf:about=\"urn:test#p4\"/>"
                + "<owl:Class rdf:about=\"urn:test#p5\"/></owl:unionOf></owl:Class></owl:complementOf></owl:Class></rdfs:subClassOf></owl:Class>"
                + "<owl:Class rdf:about=\"urn:test#p4\"><rdfs:subClassOf>"
                + "<owl:Class><owl:complementOf>"
                + "<owl:Class rdf:about=\"urn:test#p5\"/></owl:complementOf></owl:Class></rdfs:subClassOf></owl:Class>"
                + "<owl:Class rdf:about=\"urn:test#p5\"/><owl:ObjectProperty rdf:about=\"urn:test#invR\"><owl:inverseOf rdf:resource=\"urn:test#r\"/></owl:ObjectProperty><owl:ObjectProperty rdf:about=\"urn:test#r\"/><rdf:Description><rdf:type rdf:resource=\"urn:test#Satisfiable\"/></rdf:Description></rdf:RDF>";
        __CLR4_5_2b5lb5llvico2bi.R.inc(14513);test(premiseOntology, false, false, false, true);
    }finally{__CLR4_5_2b5lb5llvico2bi.R.flushNeeded();}}

    @Test
    public void testURIResolverTestCase3AWebOnt2Ddescription2Dlogic2D007() {__CLR4_5_2b5lb5llvico2bi.R.globalSliceStart(getClass().getName(),14514);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27jfutjb76();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2b5lb5llvico2bi.R.rethrow($CLV_t2$);}finally{__CLR4_5_2b5lb5llvico2bi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile2TestCase.testURIResolverTestCase3AWebOnt2Ddescription2Dlogic2D007",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14514,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27jfutjb76(){try{__CLR4_5_2b5lb5llvico2bi.R.inc(14514);
        __CLR4_5_2b5lb5llvico2bi.R.inc(14515);String premiseOntology = head2
                + "<owl:Ontology rdf:about=\"\"/>"
                + "<owl:Class rdf:about=\"urn:test#Unsatisfiable\"><owl:equivalentClass>"
                + "<owl:Class><owl:intersectionOf rdf:parseType=\"Collection\"><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#r\"/><owl:someValuesFrom>"
                + "<owl:Class rdf:about=\"urn:test#p1\"/></owl:someValuesFrom></owl:Restriction><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#r\"/><owl:someValuesFrom>"
                + "<owl:Class rdf:about=\"urn:test#p2\"/></owl:someValuesFrom></owl:Restriction><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#r\"/><owl:someValuesFrom>"
                + "<owl:Class rdf:about=\"urn:test#p3\"/></owl:someValuesFrom></owl:Restriction><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#r\"/><owl:maxCardinality rdf:datatype=\"http://www.w3.org/2001/XMLSchema#nonNegativeInteger\">2</owl:maxCardinality></owl:Restriction></owl:intersectionOf></owl:Class></owl:equivalentClass></owl:Class>"
                + "<owl:Class rdf:about=\"urn:test#p1\"><rdfs:subClassOf>"
                + "<owl:Class><owl:complementOf>"
                + "<owl:Class><owl:unionOf rdf:parseType=\"Collection\">"
                + "<owl:Class rdf:about=\"urn:test#p2\"/>"
                + "<owl:Class rdf:about=\"urn:test#p3\"/>"
                + "<owl:Class rdf:about=\"urn:test#p4\"/>"
                + "<owl:Class rdf:about=\"urn:test#p5\"/></owl:unionOf></owl:Class></owl:complementOf></owl:Class></rdfs:subClassOf></owl:Class>"
                + "<owl:Class rdf:about=\"urn:test#p2\"><rdfs:subClassOf>"
                + "<owl:Class><owl:complementOf>"
                + "<owl:Class><owl:unionOf rdf:parseType=\"Collection\">"
                + "<owl:Class rdf:about=\"urn:test#p3\"/>"
                + "<owl:Class rdf:about=\"urn:test#p4\"/>"
                + "<owl:Class rdf:about=\"urn:test#p5\"/></owl:unionOf></owl:Class></owl:complementOf></owl:Class></rdfs:subClassOf></owl:Class>"
                + "<owl:Class rdf:about=\"urn:test#p3\"><rdfs:subClassOf>"
                + "<owl:Class><owl:complementOf>"
                + "<owl:Class><owl:unionOf rdf:parseType=\"Collection\">"
                + "<owl:Class rdf:about=\"urn:test#p4\"/>"
                + "<owl:Class rdf:about=\"urn:test#p5\"/></owl:unionOf></owl:Class></owl:complementOf></owl:Class></rdfs:subClassOf></owl:Class>"
                + "<owl:Class rdf:about=\"urn:test#p4\"><rdfs:subClassOf>"
                + "<owl:Class><owl:complementOf>"
                + "<owl:Class rdf:about=\"urn:test#p5\"/></owl:complementOf></owl:Class></rdfs:subClassOf></owl:Class>"
                + "<owl:Class rdf:about=\"urn:test#p5\"/><owl:ObjectProperty rdf:about=\"urn:test#invR\"><owl:inverseOf rdf:resource=\"urn:test#r\"/></owl:ObjectProperty><owl:ObjectProperty rdf:about=\"urn:test#r\"/><rdf:Description><rdf:type rdf:resource=\"urn:test#Unsatisfiable\"/></rdf:Description></rdf:RDF>";
        __CLR4_5_2b5lb5llvico2bi.R.inc(14516);test(premiseOntology, false, false, false, true);
    }finally{__CLR4_5_2b5lb5llvico2bi.R.flushNeeded();}}

    @Test
    public void testURIResolverTestCase3AWebOnt2Ddescription2Dlogic2D008() {__CLR4_5_2b5lb5llvico2bi.R.globalSliceStart(getClass().getName(),14517);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24afw12b79();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2b5lb5llvico2bi.R.rethrow($CLV_t2$);}finally{__CLR4_5_2b5lb5llvico2bi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile2TestCase.testURIResolverTestCase3AWebOnt2Ddescription2Dlogic2D008",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14517,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24afw12b79(){try{__CLR4_5_2b5lb5llvico2bi.R.inc(14517);
        __CLR4_5_2b5lb5llvico2bi.R.inc(14518);String premiseOntology = head2
                + "<owl:Ontology rdf:about=\"\"/>"
                + "<owl:Class rdf:about=\"urn:test#Unsatisfiable\"><owl:equivalentClass>"
                + "<owl:Class><owl:intersectionOf rdf:parseType=\"Collection\">"
                + "<owl:Class rdf:about=\"urn:test#p2\"/><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#invR\"/><owl:someValuesFrom>"
                + "<owl:Class><owl:intersectionOf rdf:parseType=\"Collection\"><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#r\"/><owl:someValuesFrom>"
                + "<owl:Class rdf:about=\"urn:test#p1\"/></owl:someValuesFrom></owl:Restriction><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#r\"/><owl:maxCardinality rdf:datatype=\"http://www.w3.org/2001/XMLSchema#nonNegativeInteger\">1</owl:maxCardinality></owl:Restriction></owl:intersectionOf></owl:Class></owl:someValuesFrom></owl:Restriction></owl:intersectionOf></owl:Class></owl:equivalentClass></owl:Class>"
                + "<owl:Class rdf:about=\"urn:test#p1\"><rdfs:subClassOf>"
                + "<owl:Class><owl:complementOf>"
                + "<owl:Class><owl:unionOf rdf:parseType=\"Collection\">"
                + "<owl:Class rdf:about=\"urn:test#p2\"/>"
                + "<owl:Class rdf:about=\"urn:test#p3\"/>"
                + "<owl:Class rdf:about=\"urn:test#p4\"/>"
                + "<owl:Class rdf:about=\"urn:test#p5\"/></owl:unionOf></owl:Class></owl:complementOf></owl:Class></rdfs:subClassOf></owl:Class>"
                + "<owl:Class rdf:about=\"urn:test#p2\"><rdfs:subClassOf>"
                + "<owl:Class><owl:complementOf>"
                + "<owl:Class><owl:unionOf rdf:parseType=\"Collection\">"
                + "<owl:Class rdf:about=\"urn:test#p3\"/>"
                + "<owl:Class rdf:about=\"urn:test#p4\"/>"
                + "<owl:Class rdf:about=\"urn:test#p5\"/></owl:unionOf></owl:Class></owl:complementOf></owl:Class></rdfs:subClassOf></owl:Class>"
                + "<owl:Class rdf:about=\"urn:test#p3\"><rdfs:subClassOf>"
                + "<owl:Class><owl:complementOf>"
                + "<owl:Class><owl:unionOf rdf:parseType=\"Collection\">"
                + "<owl:Class rdf:about=\"urn:test#p4\"/>"
                + "<owl:Class rdf:about=\"urn:test#p5\"/></owl:unionOf></owl:Class></owl:complementOf></owl:Class></rdfs:subClassOf></owl:Class>"
                + "<owl:Class rdf:about=\"urn:test#p4\"><rdfs:subClassOf>"
                + "<owl:Class><owl:complementOf>"
                + "<owl:Class rdf:about=\"urn:test#p5\"/></owl:complementOf></owl:Class></rdfs:subClassOf></owl:Class>"
                + "<owl:Class rdf:about=\"urn:test#p5\"/><owl:ObjectProperty rdf:about=\"urn:test#invR\"><owl:inverseOf rdf:resource=\"urn:test#r\"/></owl:ObjectProperty><owl:ObjectProperty rdf:about=\"urn:test#r\"/><rdf:Description><rdf:type rdf:resource=\"urn:test#Unsatisfiable\"/></rdf:Description></rdf:RDF>";
        __CLR4_5_2b5lb5llvico2bi.R.inc(14519);test(premiseOntology, false, false, false, true);
    }finally{__CLR4_5_2b5lb5llvico2bi.R.flushNeeded();}}

    @Test
    public void testURIResolverTestCase3AWebOnt2Ddescription2Dlogic2D009() {__CLR4_5_2b5lb5llvico2bi.R.globalSliceStart(getClass().getName(),14520);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_211fx8lb7c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2b5lb5llvico2bi.R.rethrow($CLV_t2$);}finally{__CLR4_5_2b5lb5llvico2bi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile2TestCase.testURIResolverTestCase3AWebOnt2Ddescription2Dlogic2D009",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14520,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_211fx8lb7c(){try{__CLR4_5_2b5lb5llvico2bi.R.inc(14520);
        __CLR4_5_2b5lb5llvico2bi.R.inc(14521);String premiseOntology = head2
                + "<owl:Ontology rdf:about=\"\"/>"
                + "<owl:Class rdf:about=\"urn:test#Satisfiable\"><owl:equivalentClass>"
                + "<owl:Class><owl:intersectionOf rdf:parseType=\"Collection\"><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#f\"/><owl:someValuesFrom>"
                + "<owl:Class rdf:about=\"urn:test#p\"/></owl:someValuesFrom></owl:Restriction><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#f1\"/><owl:someValuesFrom>"
                + "<owl:Class><owl:complementOf>"
                + "<owl:Class rdf:about=\"urn:test#p\"/></owl:complementOf></owl:Class></owl:someValuesFrom></owl:Restriction></owl:intersectionOf></owl:Class></owl:equivalentClass></owl:Class>"
                + "<owl:Class rdf:about=\"urn:test#p\"/><owl:ObjectProperty rdf:about=\"urn:test#invF\"><owl:inverseOf rdf:resource=\"urn:test#f\"/></owl:ObjectProperty><owl:ObjectProperty rdf:about=\"urn:test#invS\"><owl:inverseOf rdf:resource=\"urn:test#s\"/></owl:ObjectProperty><owl:ObjectProperty rdf:about=\"urn:test#invF1\"><owl:inverseOf rdf:resource=\"urn:test#f1\"/></owl:ObjectProperty><owl:ObjectProperty rdf:about=\"urn:test#f\"/><owl:FunctionalProperty rdf:about=\"urn:test#f\"/><owl:ObjectProperty rdf:about=\"urn:test#s\"><rdfs:subPropertyOf rdf:resource=\"urn:test#f\"/><rdfs:subPropertyOf rdf:resource=\"urn:test#f1\"/></owl:ObjectProperty><owl:FunctionalProperty rdf:about=\"urn:test#s\"/><owl:ObjectProperty rdf:about=\"urn:test#f1\"/><owl:FunctionalProperty rdf:about=\"urn:test#f1\"/><rdf:Description><rdf:type rdf:resource=\"urn:test#Satisfiable\"/></rdf:Description></rdf:RDF>";
        __CLR4_5_2b5lb5llvico2bi.R.inc(14522);test(premiseOntology, false, false, false, true);
    }finally{__CLR4_5_2b5lb5llvico2bi.R.flushNeeded();}}

    @Test
    public void testURIResolverTestCase3AWebOnt2Ddescription2Dlogic2D010() {__CLR4_5_2b5lb5llvico2bi.R.globalSliceStart(getClass().getName(),14523);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kkptbb7f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2b5lb5llvico2bi.R.rethrow($CLV_t2$);}finally{__CLR4_5_2b5lb5llvico2bi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile2TestCase.testURIResolverTestCase3AWebOnt2Ddescription2Dlogic2D010",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14523,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kkptbb7f(){try{__CLR4_5_2b5lb5llvico2bi.R.inc(14523);
        __CLR4_5_2b5lb5llvico2bi.R.inc(14524);String premiseOntology = head2
                + "<owl:Ontology rdf:about=\"\"/>"
                + "<owl:Class rdf:about=\"urn:test#Unsatisfiable\"><owl:equivalentClass>"
                + "<owl:Class><owl:intersectionOf rdf:parseType=\"Collection\">"
                + "<owl:Class><owl:complementOf>"
                + "<owl:Class rdf:about=\"urn:test#p\"/></owl:complementOf></owl:Class><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#f\"/><owl:someValuesFrom>"
                + "<owl:Class><owl:intersectionOf rdf:parseType=\"Collection\"><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#invS\"/><owl:allValuesFrom>"
                + "<owl:Class rdf:about=\"urn:test#p\"/></owl:allValuesFrom></owl:Restriction><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#invF\"/><owl:allValuesFrom><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#s\"/><owl:someValuesFrom>"
                + "<owl:Class rdf:about=\"urn:test#p\"/></owl:someValuesFrom></owl:Restriction></owl:allValuesFrom></owl:Restriction></owl:intersectionOf></owl:Class></owl:someValuesFrom></owl:Restriction></owl:intersectionOf></owl:Class></owl:equivalentClass></owl:Class>"
                + "<owl:Class rdf:about=\"urn:test#p\"/><owl:ObjectProperty rdf:about=\"urn:test#invF\"><owl:inverseOf rdf:resource=\"urn:test#f\"/></owl:ObjectProperty><owl:ObjectProperty rdf:about=\"urn:test#invS\"><owl:inverseOf rdf:resource=\"urn:test#s\"/></owl:ObjectProperty><owl:ObjectProperty rdf:about=\"urn:test#invF1\"><owl:inverseOf rdf:resource=\"urn:test#f1\"/></owl:ObjectProperty><owl:ObjectProperty rdf:about=\"urn:test#f\"/><owl:FunctionalProperty rdf:about=\"urn:test#f\"/><owl:ObjectProperty rdf:about=\"urn:test#s\"><rdfs:subPropertyOf rdf:resource=\"urn:test#f\"/><rdfs:subPropertyOf rdf:resource=\"urn:test#f1\"/></owl:ObjectProperty><owl:FunctionalProperty rdf:about=\"urn:test#s\"/><owl:ObjectProperty rdf:about=\"urn:test#f1\"/><owl:FunctionalProperty rdf:about=\"urn:test#f1\"/><rdf:Description><rdf:type rdf:resource=\"urn:test#Unsatisfiable\"/></rdf:Description></rdf:RDF>";
        __CLR4_5_2b5lb5llvico2bi.R.inc(14525);test(premiseOntology, false, false, false, true);
    }finally{__CLR4_5_2b5lb5llvico2bi.R.flushNeeded();}}

    @Test
    public void testURIResolverTestCase3AWebOnt2Ddescription2Dlogic2D011() {__CLR4_5_2b5lb5llvico2bi.R.globalSliceStart(getClass().getName(),14526);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22of8z6b7i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2b5lb5llvico2bi.R.rethrow($CLV_t2$);}finally{__CLR4_5_2b5lb5llvico2bi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile2TestCase.testURIResolverTestCase3AWebOnt2Ddescription2Dlogic2D011",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14526,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22of8z6b7i(){try{__CLR4_5_2b5lb5llvico2bi.R.inc(14526);
        __CLR4_5_2b5lb5llvico2bi.R.inc(14527);String premiseOntology = head2
                + "<owl:Ontology rdf:about=\"\"/>"
                + "<owl:Class rdf:about=\"urn:test#Unsatisfiable\"><owl:equivalentClass>"
                + "<owl:Class><owl:intersectionOf rdf:parseType=\"Collection\"><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#s\"/><owl:allValuesFrom>"
                + "<owl:Class><owl:complementOf>"
                + "<owl:Class rdf:about=\"urn:test#p\"/></owl:complementOf></owl:Class></owl:allValuesFrom></owl:Restriction><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#s\"/><owl:someValuesFrom>"
                + "<owl:Class><owl:intersectionOf rdf:parseType=\"Collection\">"
                + "<owl:Class rdf:about=\"urn:test#p\"/><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#invS\"/><owl:someValuesFrom>"
                + "<owl:Class rdf:about=\"urn:test#p\"/></owl:someValuesFrom></owl:Restriction></owl:intersectionOf></owl:Class></owl:someValuesFrom></owl:Restriction></owl:intersectionOf></owl:Class></owl:equivalentClass></owl:Class>"
                + "<owl:Class rdf:about=\"urn:test#p\"/><owl:ObjectProperty rdf:about=\"urn:test#invF\"><owl:inverseOf rdf:resource=\"urn:test#f\"/></owl:ObjectProperty><owl:ObjectProperty rdf:about=\"urn:test#invS\"><owl:inverseOf rdf:resource=\"urn:test#s\"/></owl:ObjectProperty><owl:ObjectProperty rdf:about=\"urn:test#invF1\"><owl:inverseOf rdf:resource=\"urn:test#f1\"/></owl:ObjectProperty><owl:ObjectProperty rdf:about=\"urn:test#f\"/><owl:FunctionalProperty rdf:about=\"urn:test#f\"/><owl:ObjectProperty rdf:about=\"urn:test#s\"><rdfs:subPropertyOf rdf:resource=\"urn:test#f\"/><rdfs:subPropertyOf rdf:resource=\"urn:test#f1\"/></owl:ObjectProperty><owl:FunctionalProperty rdf:about=\"urn:test#s\"/><owl:ObjectProperty rdf:about=\"urn:test#f1\"/><owl:FunctionalProperty rdf:about=\"urn:test#f1\"/><rdf:Description><rdf:type rdf:resource=\"urn:test#Unsatisfiable\"/></rdf:Description></rdf:RDF>";
        __CLR4_5_2b5lb5llvico2bi.R.inc(14528);test(premiseOntology, false, false, false, true);
    }finally{__CLR4_5_2b5lb5llvico2bi.R.flushNeeded();}}

    @Test
    public void testURIResolverTestCase3AWebOnt2Ddescription2Dlogic2D012() {__CLR4_5_2b5lb5llvico2bi.R.globalSliceStart(getClass().getName(),14529);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25xf7rnb7l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2b5lb5llvico2bi.R.rethrow($CLV_t2$);}finally{__CLR4_5_2b5lb5llvico2bi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile2TestCase.testURIResolverTestCase3AWebOnt2Ddescription2Dlogic2D012",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14529,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25xf7rnb7l(){try{__CLR4_5_2b5lb5llvico2bi.R.inc(14529);
        __CLR4_5_2b5lb5llvico2bi.R.inc(14530);String premiseOntology = head2
                + "<owl:Ontology rdf:about=\"\"/>"
                + "<owl:Class rdf:about=\"urn:test#Unsatisfiable\"><owl:equivalentClass>"
                + "<owl:Class><owl:intersectionOf rdf:parseType=\"Collection\"><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#f\"/><owl:someValuesFrom>"
                + "<owl:Class rdf:about=\"urn:test#p\"/></owl:someValuesFrom></owl:Restriction><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#s\"/><owl:someValuesFrom>"
                + "<owl:Class rdf:about=\"http://www.w3.org/2002/07/owl#Thing\"/></owl:someValuesFrom></owl:Restriction><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#f1\"/><owl:someValuesFrom>"
                + "<owl:Class><owl:complementOf>"
                + "<owl:Class rdf:about=\"urn:test#p\"/></owl:complementOf></owl:Class></owl:someValuesFrom></owl:Restriction></owl:intersectionOf></owl:Class></owl:equivalentClass></owl:Class>"
                + "<owl:Class rdf:about=\"urn:test#p\"/><owl:ObjectProperty rdf:about=\"urn:test#invF\"><owl:inverseOf rdf:resource=\"urn:test#f\"/></owl:ObjectProperty><owl:ObjectProperty rdf:about=\"urn:test#invS\"><owl:inverseOf rdf:resource=\"urn:test#s\"/></owl:ObjectProperty><owl:ObjectProperty rdf:about=\"urn:test#invF1\"><owl:inverseOf rdf:resource=\"urn:test#f1\"/></owl:ObjectProperty><owl:ObjectProperty rdf:about=\"urn:test#f\"/><owl:FunctionalProperty rdf:about=\"urn:test#f\"/><owl:ObjectProperty rdf:about=\"urn:test#s\"><rdfs:subPropertyOf rdf:resource=\"urn:test#f\"/><rdfs:subPropertyOf rdf:resource=\"urn:test#f1\"/></owl:ObjectProperty><owl:FunctionalProperty rdf:about=\"urn:test#s\"/><owl:ObjectProperty rdf:about=\"urn:test#f1\"/><owl:FunctionalProperty rdf:about=\"urn:test#f1\"/><rdf:Description><rdf:type rdf:resource=\"urn:test#Unsatisfiable\"/></rdf:Description></rdf:RDF>";
        __CLR4_5_2b5lb5llvico2bi.R.inc(14531);test(premiseOntology, false, false, false, true);
    }finally{__CLR4_5_2b5lb5llvico2bi.R.flushNeeded();}}

    @Test
    public void testURIResolverTestCase3AWebOnt2Ddescription2Dlogic2D013() {__CLR4_5_2b5lb5llvico2bi.R.globalSliceStart(getClass().getName(),14532);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_296f6k4b7o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2b5lb5llvico2bi.R.rethrow($CLV_t2$);}finally{__CLR4_5_2b5lb5llvico2bi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile2TestCase.testURIResolverTestCase3AWebOnt2Ddescription2Dlogic2D013",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14532,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_296f6k4b7o(){try{__CLR4_5_2b5lb5llvico2bi.R.inc(14532);
        __CLR4_5_2b5lb5llvico2bi.R.inc(14533);String premiseOntology = head2
                + "<owl:Ontology rdf:about=\"\"/>"
                + "<owl:Class rdf:about=\"urn:test#Unsatisfiable\"><owl:equivalentClass>"
                + "<owl:Class><owl:intersectionOf rdf:parseType=\"Collection\"><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#f\"/><owl:someValuesFrom>"
                + "<owl:Class rdf:about=\"urn:test#p\"/></owl:someValuesFrom></owl:Restriction><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#f1\"/><owl:someValuesFrom>"
                + "<owl:Class><owl:intersectionOf rdf:parseType=\"Collection\">"
                + "<owl:Class><owl:complementOf>"
                + "<owl:Class rdf:about=\"urn:test#p\"/></owl:complementOf></owl:Class><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#invF1\"/><owl:allValuesFrom><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#s\"/><owl:someValuesFrom>"
                + "<owl:Class rdf:about=\"http://www.w3.org/2002/07/owl#Thing\"/></owl:someValuesFrom></owl:Restriction></owl:allValuesFrom></owl:Restriction></owl:intersectionOf></owl:Class></owl:someValuesFrom></owl:Restriction></owl:intersectionOf></owl:Class></owl:equivalentClass></owl:Class>"
                + "<owl:Class rdf:about=\"urn:test#p\"/><owl:ObjectProperty rdf:about=\"urn:test#invF\"><owl:inverseOf rdf:resource=\"urn:test#f\"/></owl:ObjectProperty><owl:ObjectProperty rdf:about=\"urn:test#invS\"><owl:inverseOf rdf:resource=\"urn:test#s\"/></owl:ObjectProperty><owl:ObjectProperty rdf:about=\"urn:test#invF1\"><owl:inverseOf rdf:resource=\"urn:test#f1\"/></owl:ObjectProperty><owl:ObjectProperty rdf:about=\"urn:test#f\"/><owl:FunctionalProperty rdf:about=\"urn:test#f\"/><owl:ObjectProperty rdf:about=\"urn:test#s\"><rdfs:subPropertyOf rdf:resource=\"urn:test#f\"/><rdfs:subPropertyOf rdf:resource=\"urn:test#f1\"/></owl:ObjectProperty><owl:FunctionalProperty rdf:about=\"urn:test#s\"/><owl:ObjectProperty rdf:about=\"urn:test#f1\"/><owl:FunctionalProperty rdf:about=\"urn:test#f1\"/><rdf:Description><rdf:type rdf:resource=\"urn:test#Unsatisfiable\"/></rdf:Description></rdf:RDF>";
        __CLR4_5_2b5lb5llvico2bi.R.inc(14534);test(premiseOntology, false, false, false, true);
    }finally{__CLR4_5_2b5lb5llvico2bi.R.flushNeeded();}}

    @Test
    public void testURIResolverTestCase3AWebOnt2Ddescription2Dlogic2D014() {__CLR4_5_2b5lb5llvico2bi.R.globalSliceStart(getClass().getName(),14535);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cff5clb7r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2b5lb5llvico2bi.R.rethrow($CLV_t2$);}finally{__CLR4_5_2b5lb5llvico2bi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile2TestCase.testURIResolverTestCase3AWebOnt2Ddescription2Dlogic2D014",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14535,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cff5clb7r(){try{__CLR4_5_2b5lb5llvico2bi.R.inc(14535);
        __CLR4_5_2b5lb5llvico2bi.R.inc(14536);String premiseOntology = head2
                + "<owl:Ontology rdf:about=\"\"/>"
                + "<owl:Class rdf:about=\"urn:test#Unsatisfiable\"><owl:equivalentClass>"
                + "<owl:Class><owl:intersectionOf rdf:parseType=\"Collection\">"
                + "<owl:Class><owl:complementOf>"
                + "<owl:Class rdf:about=\"urn:test#p\"/></owl:complementOf></owl:Class><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#r\"/><owl:maxCardinality rdf:datatype=\"http://www.w3.org/2001/XMLSchema#nonNegativeInteger\">1</owl:maxCardinality></owl:Restriction><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#r\"/><owl:someValuesFrom><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#invS\"/><owl:allValuesFrom>"
                + "<owl:Class rdf:about=\"urn:test#p\"/></owl:allValuesFrom></owl:Restriction></owl:someValuesFrom></owl:Restriction><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#s\"/><owl:someValuesFrom>"
                + "<owl:Class rdf:about=\"urn:test#p\"/></owl:someValuesFrom></owl:Restriction></owl:intersectionOf></owl:Class></owl:equivalentClass></owl:Class>"
                + "<owl:Class rdf:about=\"urn:test#p\"/><owl:ObjectProperty rdf:about=\"urn:test#invS\"><owl:inverseOf rdf:resource=\"urn:test#s\"/></owl:ObjectProperty><owl:ObjectProperty rdf:about=\"urn:test#r\"/><owl:ObjectProperty rdf:about=\"urn:test#s\"><rdfs:subPropertyOf rdf:resource=\"urn:test#r\"/></owl:ObjectProperty><rdf:Description><rdf:type rdf:resource=\"urn:test#Unsatisfiable\"/></rdf:Description></rdf:RDF>";
        __CLR4_5_2b5lb5llvico2bi.R.inc(14537);test(premiseOntology, false, false, false, true);
    }finally{__CLR4_5_2b5lb5llvico2bi.R.flushNeeded();}}

    @Test
    public void testURIResolverTestCase3AWebOnt2Ddescription2Dlogic2D015() {__CLR4_5_2b5lb5llvico2bi.R.globalSliceStart(getClass().getName(),14538);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fof452b7u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2b5lb5llvico2bi.R.rethrow($CLV_t2$);}finally{__CLR4_5_2b5lb5llvico2bi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile2TestCase.testURIResolverTestCase3AWebOnt2Ddescription2Dlogic2D015",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14538,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fof452b7u(){try{__CLR4_5_2b5lb5llvico2bi.R.inc(14538);
        __CLR4_5_2b5lb5llvico2bi.R.inc(14539);String premiseOntology = head2
                + "<owl:Ontology rdf:about=\"\"/>"
                + "<owl:Class rdf:about=\"urn:test#Unsatisfiable\"><owl:equivalentClass>"
                + "<owl:Class><owl:intersectionOf rdf:parseType=\"Collection\"><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#s\"/><owl:someValuesFrom>"
                + "<owl:Class><owl:intersectionOf rdf:parseType=\"Collection\">"
                + "<owl:Class><owl:complementOf>"
                + "<owl:Class rdf:about=\"urn:test#p\"/></owl:complementOf></owl:Class>"
                + "<owl:Class><owl:complementOf>"
                + "<owl:Class rdf:about=\"urn:test#q\"/></owl:complementOf></owl:Class></owl:intersectionOf></owl:Class></owl:someValuesFrom></owl:Restriction><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#r\"/><owl:someValuesFrom>"
                + "<owl:Class><owl:intersectionOf rdf:parseType=\"Collection\"><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#invR\"/><owl:maxCardinality rdf:datatype=\"http://www.w3.org/2001/XMLSchema#nonNegativeInteger\">1</owl:maxCardinality></owl:Restriction><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#invR\"/><owl:someValuesFrom><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#s\"/><owl:allValuesFrom>"
                + "<owl:Class rdf:about=\"urn:test#p\"/></owl:allValuesFrom></owl:Restriction></owl:someValuesFrom></owl:Restriction></owl:intersectionOf></owl:Class></owl:someValuesFrom></owl:Restriction></owl:intersectionOf></owl:Class></owl:equivalentClass></owl:Class>"
                + "<owl:Class rdf:about=\"urn:test#p\"/>"
                + "<owl:Class rdf:about=\"urn:test#q\"/><owl:ObjectProperty rdf:about=\"urn:test#invR\"><owl:inverseOf rdf:resource=\"urn:test#r\"/></owl:ObjectProperty><owl:ObjectProperty rdf:about=\"urn:test#r\"/><owl:ObjectProperty rdf:about=\"urn:test#s\"/><rdf:Description><rdf:type rdf:resource=\"urn:test#Unsatisfiable\"/></rdf:Description></rdf:RDF>";
        __CLR4_5_2b5lb5llvico2bi.R.inc(14540);test(premiseOntology, false, false, false, true);
    }finally{__CLR4_5_2b5lb5llvico2bi.R.flushNeeded();}}

    @Test
    public void testURIResolverTestCase3AWebOnt2Ddescription2Dlogic2D016() {__CLR4_5_2b5lb5llvico2bi.R.globalSliceStart(getClass().getName(),14541);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ixf2xjb7x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2b5lb5llvico2bi.R.rethrow($CLV_t2$);}finally{__CLR4_5_2b5lb5llvico2bi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile2TestCase.testURIResolverTestCase3AWebOnt2Ddescription2Dlogic2D016",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14541,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ixf2xjb7x(){try{__CLR4_5_2b5lb5llvico2bi.R.inc(14541);
        __CLR4_5_2b5lb5llvico2bi.R.inc(14542);String premiseOntology = head2
                + "<owl:Ontology rdf:about=\"\"/>"
                + "<owl:Class rdf:about=\"urn:test#Satisfiable\"><owl:equivalentClass>"
                + "<owl:Class><owl:intersectionOf rdf:parseType=\"Collection\"><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#f1\"/><owl:someValuesFrom>"
                + "<owl:Class rdf:about=\"urn:test#p1\"/></owl:someValuesFrom></owl:Restriction><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#f2\"/><owl:someValuesFrom>"
                + "<owl:Class rdf:about=\"urn:test#p2\"/></owl:someValuesFrom></owl:Restriction></owl:intersectionOf></owl:Class></owl:equivalentClass></owl:Class>"
                + "<owl:Class rdf:about=\"urn:test#p1\"><rdfs:subClassOf>"
                + "<owl:Class><owl:complementOf>"
                + "<owl:Class rdf:about=\"urn:test#p2\"/></owl:complementOf></owl:Class></rdfs:subClassOf></owl:Class>"
                + "<owl:Class rdf:about=\"urn:test#p2\"/><owl:ObjectProperty rdf:about=\"urn:test#r\"><rdfs:subPropertyOf rdf:resource=\"urn:test#f2\"/><rdfs:subPropertyOf rdf:resource=\"urn:test#f1\"/></owl:ObjectProperty><owl:ObjectProperty rdf:about=\"urn:test#f1\"/><owl:ObjectProperty rdf:about=\"urn:test#f2\"/><rdf:Description rdf:about='http://www.w3.org/2002/07/owl#Thing'><rdfs:subClassOf><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#f1\"/><owl:maxCardinality rdf:datatype=\"http://www.w3.org/2001/XMLSchema#nonNegativeInteger\">1</owl:maxCardinality></owl:Restriction></rdfs:subClassOf></rdf:Description><rdf:Description rdf:about='http://www.w3.org/2002/07/owl#Thing'><rdfs:subClassOf><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#f2\"/><owl:maxCardinality rdf:datatype=\"http://www.w3.org/2001/XMLSchema#nonNegativeInteger\">1</owl:maxCardinality></owl:Restriction></rdfs:subClassOf></rdf:Description><rdf:Description><rdf:type rdf:resource=\"urn:test#Satisfiable\"/></rdf:Description></rdf:RDF>";
        __CLR4_5_2b5lb5llvico2bi.R.inc(14543);test(premiseOntology, false, false, false, true);
    }finally{__CLR4_5_2b5lb5llvico2bi.R.flushNeeded();}}

    @Test
    public void testURIResolverTestCase3AWebOnt2Ddescription2Dlogic2D017() {__CLR4_5_2b5lb5llvico2bi.R.globalSliceStart(getClass().getName(),14544);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2m6f1q0b80();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2b5lb5llvico2bi.R.rethrow($CLV_t2$);}finally{__CLR4_5_2b5lb5llvico2bi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile2TestCase.testURIResolverTestCase3AWebOnt2Ddescription2Dlogic2D017",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14544,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2m6f1q0b80(){try{__CLR4_5_2b5lb5llvico2bi.R.inc(14544);
        __CLR4_5_2b5lb5llvico2bi.R.inc(14545);String premiseOntology = head2
                + "<owl:Ontology rdf:about=\"\"/>"
                + "<owl:Class rdf:about=\"urn:test#Unsatisfiable\"><owl:equivalentClass>"
                + "<owl:Class><owl:intersectionOf rdf:parseType=\"Collection\"><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#f1\"/><owl:someValuesFrom>"
                + "<owl:Class rdf:about=\"urn:test#p1\"/></owl:someValuesFrom></owl:Restriction><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#f2\"/><owl:someValuesFrom>"
                + "<owl:Class rdf:about=\"urn:test#p2\"/></owl:someValuesFrom></owl:Restriction><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#r\"/><owl:someValuesFrom>"
                + "<owl:Class rdf:about=\"http://www.w3.org/2002/07/owl#Thing\"/></owl:someValuesFrom></owl:Restriction></owl:intersectionOf></owl:Class></owl:equivalentClass></owl:Class>"
                + "<owl:Class rdf:about=\"urn:test#p1\"><rdfs:subClassOf>"
                + "<owl:Class><owl:complementOf>"
                + "<owl:Class rdf:about=\"urn:test#p2\"/></owl:complementOf></owl:Class></rdfs:subClassOf></owl:Class>"
                + "<owl:Class rdf:about=\"urn:test#p2\"/><owl:ObjectProperty rdf:about=\"urn:test#r\"><rdfs:subPropertyOf rdf:resource=\"urn:test#f2\"/><rdfs:subPropertyOf rdf:resource=\"urn:test#f1\"/></owl:ObjectProperty><owl:ObjectProperty rdf:about=\"urn:test#f1\"/><owl:ObjectProperty rdf:about=\"urn:test#f2\"/><rdf:Description rdf:about='http://www.w3.org/2002/07/owl#Thing'><rdfs:subClassOf><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#f1\"/><owl:maxCardinality rdf:datatype=\"http://www.w3.org/2001/XMLSchema#nonNegativeInteger\">1</owl:maxCardinality></owl:Restriction></rdfs:subClassOf></rdf:Description><rdf:Description rdf:about='http://www.w3.org/2002/07/owl#Thing'><rdfs:subClassOf><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#f2\"/><owl:maxCardinality rdf:datatype=\"http://www.w3.org/2001/XMLSchema#nonNegativeInteger\">1</owl:maxCardinality></owl:Restriction></rdfs:subClassOf></rdf:Description><rdf:Description><rdf:type rdf:resource=\"urn:test#Unsatisfiable\"/></rdf:Description></rdf:RDF>";
        __CLR4_5_2b5lb5llvico2bi.R.inc(14546);test(premiseOntology, false, false, false, true);
    }finally{__CLR4_5_2b5lb5llvico2bi.R.flushNeeded();}}

    @Test
    public void testURIResolverTestCase3AWebOnt2Ddescription2Dlogic2D018() {__CLR4_5_2b5lb5llvico2bi.R.globalSliceStart(getClass().getName(),14547);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pff0ihb83();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2b5lb5llvico2bi.R.rethrow($CLV_t2$);}finally{__CLR4_5_2b5lb5llvico2bi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile2TestCase.testURIResolverTestCase3AWebOnt2Ddescription2Dlogic2D018",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14547,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pff0ihb83(){try{__CLR4_5_2b5lb5llvico2bi.R.inc(14547);
        __CLR4_5_2b5lb5llvico2bi.R.inc(14548);String premiseOntology = head2
                + "<owl:Ontology rdf:about=\"\"/>"
                + "<owl:Class rdf:about=\"urn:test#Satisfiable\"><owl:equivalentClass>"
                + "<owl:Class><owl:intersectionOf rdf:parseType=\"Collection\"><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#r\"/><owl:someValuesFrom>"
                + "<owl:Class rdf:about=\"urn:test#p1\"/></owl:someValuesFrom></owl:Restriction><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#r\"/><owl:someValuesFrom>"
                + "<owl:Class rdf:about=\"urn:test#p2\"/></owl:someValuesFrom></owl:Restriction><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#r\"/><owl:someValuesFrom>"
                + "<owl:Class rdf:about=\"urn:test#p3\"/></owl:someValuesFrom></owl:Restriction><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#r\"/><owl:someValuesFrom>"
                + "<owl:Class><owl:intersectionOf rdf:parseType=\"Collection\">"
                + "<owl:Class rdf:about=\"urn:test#p1\"/>"
                + "<owl:Class rdf:about=\"urn:test#p\"/></owl:intersectionOf></owl:Class></owl:someValuesFrom></owl:Restriction><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#r\"/><owl:someValuesFrom>"
                + "<owl:Class><owl:intersectionOf rdf:parseType=\"Collection\">"
                + "<owl:Class rdf:about=\"urn:test#p2\"/>"
                + "<owl:Class rdf:about=\"urn:test#p\"/></owl:intersectionOf></owl:Class></owl:someValuesFrom></owl:Restriction><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#r\"/><owl:someValuesFrom>"
                + "<owl:Class><owl:intersectionOf rdf:parseType=\"Collection\">"
                + "<owl:Class rdf:about=\"urn:test#p3\"/>"
                + "<owl:Class rdf:about=\"urn:test#p\"/></owl:intersectionOf></owl:Class></owl:someValuesFrom></owl:Restriction><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#r\"/><owl:maxCardinality rdf:datatype=\"http://www.w3.org/2001/XMLSchema#nonNegativeInteger\">3</owl:maxCardinality></owl:Restriction></owl:intersectionOf></owl:Class></owl:equivalentClass></owl:Class>"
                + "<owl:Class rdf:about=\"urn:test#p\"/>"
                + "<owl:Class rdf:about=\"urn:test#p1\"><rdfs:subClassOf>"
                + "<owl:Class><owl:complementOf>"
                + "<owl:Class><owl:unionOf rdf:parseType=\"Collection\">"
                + "<owl:Class rdf:about=\"urn:test#p2\"/>"
                + "<owl:Class rdf:about=\"urn:test#p3\"/>"
                + "<owl:Class rdf:about=\"urn:test#p4\"/>"
                + "<owl:Class rdf:about=\"urn:test#p5\"/></owl:unionOf></owl:Class></owl:complementOf></owl:Class></rdfs:subClassOf></owl:Class>"
                + "<owl:Class rdf:about=\"urn:test#p2\"><rdfs:subClassOf>"
                + "<owl:Class><owl:complementOf>"
                + "<owl:Class><owl:unionOf rdf:parseType=\"Collection\">"
                + "<owl:Class rdf:about=\"urn:test#p3\"/>"
                + "<owl:Class rdf:about=\"urn:test#p4\"/>"
                + "<owl:Class rdf:about=\"urn:test#p5\"/></owl:unionOf></owl:Class></owl:complementOf></owl:Class></rdfs:subClassOf></owl:Class>"
                + "<owl:Class rdf:about=\"urn:test#p3\"><rdfs:subClassOf>"
                + "<owl:Class><owl:complementOf>"
                + "<owl:Class><owl:unionOf rdf:parseType=\"Collection\">"
                + "<owl:Class rdf:about=\"urn:test#p4\"/>"
                + "<owl:Class rdf:about=\"urn:test#p5\"/></owl:unionOf></owl:Class></owl:complementOf></owl:Class></rdfs:subClassOf></owl:Class>"
                + "<owl:Class rdf:about=\"urn:test#p4\"><rdfs:subClassOf>"
                + "<owl:Class><owl:complementOf>"
                + "<owl:Class rdf:about=\"urn:test#p5\"/></owl:complementOf></owl:Class></rdfs:subClassOf></owl:Class>"
                + "<owl:Class rdf:about=\"urn:test#p5\"/><owl:ObjectProperty rdf:about=\"urn:test#r\"/><rdf:Description><rdf:type rdf:resource=\"urn:test#Satisfiable\"/></rdf:Description></rdf:RDF>";
        __CLR4_5_2b5lb5llvico2bi.R.inc(14549);test(premiseOntology, false, false, false, true);
    }finally{__CLR4_5_2b5lb5llvico2bi.R.flushNeeded();}}

    @Test
    public void testURIResolverTestCase3AWebOnt2Ddescription2Dlogic2D019() {__CLR4_5_2b5lb5llvico2bi.R.globalSliceStart(getClass().getName(),14550);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2soezayb86();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2b5lb5llvico2bi.R.rethrow($CLV_t2$);}finally{__CLR4_5_2b5lb5llvico2bi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile2TestCase.testURIResolverTestCase3AWebOnt2Ddescription2Dlogic2D019",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14550,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2soezayb86(){try{__CLR4_5_2b5lb5llvico2bi.R.inc(14550);
        __CLR4_5_2b5lb5llvico2bi.R.inc(14551);String premiseOntology = head2
                + "<owl:Ontology rdf:about=\"\"/>"
                + "<owl:Class rdf:about=\"urn:test#Unsatisfiable\"><owl:equivalentClass>"
                + "<owl:Class><owl:intersectionOf rdf:parseType=\"Collection\"><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#r\"/><owl:someValuesFrom>"
                + "<owl:Class rdf:about=\"urn:test#p1\"/></owl:someValuesFrom></owl:Restriction><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#r\"/><owl:someValuesFrom>"
                + "<owl:Class rdf:about=\"urn:test#p2\"/></owl:someValuesFrom></owl:Restriction><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#r\"/><owl:someValuesFrom>"
                + "<owl:Class rdf:about=\"urn:test#p3\"/></owl:someValuesFrom></owl:Restriction><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#r\"/><owl:someValuesFrom>"
                + "<owl:Class><owl:intersectionOf rdf:parseType=\"Collection\">"
                + "<owl:Class rdf:about=\"urn:test#p1\"/>"
                + "<owl:Class rdf:about=\"urn:test#p\"/></owl:intersectionOf></owl:Class></owl:someValuesFrom></owl:Restriction><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#r\"/><owl:someValuesFrom>"
                + "<owl:Class><owl:intersectionOf rdf:parseType=\"Collection\">"
                + "<owl:Class rdf:about=\"urn:test#p2\"/>"
                + "<owl:Class rdf:about=\"urn:test#p\"/></owl:intersectionOf></owl:Class></owl:someValuesFrom></owl:Restriction><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#r\"/><owl:someValuesFrom>"
                + "<owl:Class><owl:intersectionOf rdf:parseType=\"Collection\">"
                + "<owl:Class rdf:about=\"urn:test#p3\"/>"
                + "<owl:Class rdf:about=\"urn:test#p\"/></owl:intersectionOf></owl:Class></owl:someValuesFrom></owl:Restriction><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#r\"/><owl:maxCardinality rdf:datatype=\"http://www.w3.org/2001/XMLSchema#nonNegativeInteger\">3</owl:maxCardinality></owl:Restriction><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#r\"/><owl:someValuesFrom>"
                + "<owl:Class rdf:about=\"urn:test#p4\"/></owl:someValuesFrom></owl:Restriction></owl:intersectionOf></owl:Class></owl:equivalentClass></owl:Class>"
                + "<owl:Class rdf:about=\"urn:test#p\"/>"
                + "<owl:Class rdf:about=\"urn:test#p1\"><rdfs:subClassOf>"
                + "<owl:Class><owl:complementOf>"
                + "<owl:Class><owl:unionOf rdf:parseType=\"Collection\">"
                + "<owl:Class rdf:about=\"urn:test#p2\"/>"
                + "<owl:Class rdf:about=\"urn:test#p3\"/>"
                + "<owl:Class rdf:about=\"urn:test#p4\"/>"
                + "<owl:Class rdf:about=\"urn:test#p5\"/></owl:unionOf></owl:Class></owl:complementOf></owl:Class></rdfs:subClassOf></owl:Class>"
                + "<owl:Class rdf:about=\"urn:test#p2\"><rdfs:subClassOf>"
                + "<owl:Class><owl:complementOf>"
                + "<owl:Class><owl:unionOf rdf:parseType=\"Collection\">"
                + "<owl:Class rdf:about=\"urn:test#p3\"/>"
                + "<owl:Class rdf:about=\"urn:test#p4\"/>"
                + "<owl:Class rdf:about=\"urn:test#p5\"/></owl:unionOf></owl:Class></owl:complementOf></owl:Class></rdfs:subClassOf></owl:Class>"
                + "<owl:Class rdf:about=\"urn:test#p3\"><rdfs:subClassOf>"
                + "<owl:Class><owl:complementOf>"
                + "<owl:Class><owl:unionOf rdf:parseType=\"Collection\">"
                + "<owl:Class rdf:about=\"urn:test#p4\"/>"
                + "<owl:Class rdf:about=\"urn:test#p5\"/></owl:unionOf></owl:Class></owl:complementOf></owl:Class></rdfs:subClassOf></owl:Class>"
                + "<owl:Class rdf:about=\"urn:test#p4\"><rdfs:subClassOf>"
                + "<owl:Class><owl:complementOf>"
                + "<owl:Class rdf:about=\"urn:test#p5\"/></owl:complementOf></owl:Class></rdfs:subClassOf></owl:Class>"
                + "<owl:Class rdf:about=\"urn:test#p5\"/><owl:ObjectProperty rdf:about=\"urn:test#r\"/><rdf:Description><rdf:type rdf:resource=\"urn:test#Unsatisfiable\"/></rdf:Description></rdf:RDF>";
        __CLR4_5_2b5lb5llvico2bi.R.inc(14552);test(premiseOntology, false, false, false, true);
    }finally{__CLR4_5_2b5lb5llvico2bi.R.flushNeeded();}}

    @Test
    public void testURIResolverTestCase3AWebOnt2Ddescription2Dlogic2D020() {__CLR4_5_2b5lb5llvico2bi.R.globalSliceStart(getClass().getName(),14553);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2t5a6q8b89();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2b5lb5llvico2bi.R.rethrow($CLV_t2$);}finally{__CLR4_5_2b5lb5llvico2bi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile2TestCase.testURIResolverTestCase3AWebOnt2Ddescription2Dlogic2D020",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14553,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2t5a6q8b89(){try{__CLR4_5_2b5lb5llvico2bi.R.inc(14553);
        __CLR4_5_2b5lb5llvico2bi.R.inc(14554);String premiseOntology = head2
                + "<owl:Ontology rdf:about=\"\"/>"
                + "<owl:Class rdf:about=\"urn:test#Satisfiable\"><owl:equivalentClass>"
                + "<owl:Class><owl:intersectionOf rdf:parseType=\"Collection\"><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#r\"/><owl:someValuesFrom>"
                + "<owl:Class rdf:about=\"urn:test#p1\"/></owl:someValuesFrom></owl:Restriction><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#r\"/><owl:someValuesFrom>"
                + "<owl:Class rdf:about=\"urn:test#p2\"/></owl:someValuesFrom></owl:Restriction><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#r\"/><owl:someValuesFrom>"
                + "<owl:Class rdf:about=\"urn:test#p3\"/></owl:someValuesFrom></owl:Restriction><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#r\"/><owl:someValuesFrom>"
                + "<owl:Class rdf:about=\"urn:test#p4\"/></owl:someValuesFrom></owl:Restriction><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#r\"/><owl:someValuesFrom>"
                + "<owl:Class><owl:intersectionOf rdf:parseType=\"Collection\">"
                + "<owl:Class rdf:about=\"urn:test#p1\"/>"
                + "<owl:Class rdf:about=\"urn:test#p\"/></owl:intersectionOf></owl:Class></owl:someValuesFrom></owl:Restriction><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#r\"/><owl:someValuesFrom>"
                + "<owl:Class><owl:intersectionOf rdf:parseType=\"Collection\">"
                + "<owl:Class rdf:about=\"urn:test#p2\"/>"
                + "<owl:Class rdf:about=\"urn:test#p\"/></owl:intersectionOf></owl:Class></owl:someValuesFrom></owl:Restriction><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#r\"/><owl:someValuesFrom>"
                + "<owl:Class><owl:intersectionOf rdf:parseType=\"Collection\">"
                + "<owl:Class rdf:about=\"urn:test#p3\"/>"
                + "<owl:Class rdf:about=\"urn:test#p\"/></owl:intersectionOf></owl:Class></owl:someValuesFrom></owl:Restriction><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#r\"/><owl:someValuesFrom>"
                + "<owl:Class><owl:intersectionOf rdf:parseType=\"Collection\">"
                + "<owl:Class rdf:about=\"urn:test#p4\"/>"
                + "<owl:Class rdf:about=\"urn:test#p\"/></owl:intersectionOf></owl:Class></owl:someValuesFrom></owl:Restriction><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#r\"/><owl:maxCardinality rdf:datatype=\"http://www.w3.org/2001/XMLSchema#nonNegativeInteger\">4</owl:maxCardinality></owl:Restriction></owl:intersectionOf></owl:Class></owl:equivalentClass></owl:Class>"
                + "<owl:Class rdf:about=\"urn:test#p\"/>"
                + "<owl:Class rdf:about=\"urn:test#p1\"><rdfs:subClassOf>"
                + "<owl:Class><owl:complementOf>"
                + "<owl:Class><owl:unionOf rdf:parseType=\"Collection\">"
                + "<owl:Class rdf:about=\"urn:test#p2\"/>"
                + "<owl:Class rdf:about=\"urn:test#p3\"/>"
                + "<owl:Class rdf:about=\"urn:test#p4\"/>"
                + "<owl:Class rdf:about=\"urn:test#p5\"/></owl:unionOf></owl:Class></owl:complementOf></owl:Class></rdfs:subClassOf></owl:Class>"
                + "<owl:Class rdf:about=\"urn:test#p2\"><rdfs:subClassOf>"
                + "<owl:Class><owl:complementOf>"
                + "<owl:Class><owl:unionOf rdf:parseType=\"Collection\">"
                + "<owl:Class rdf:about=\"urn:test#p3\"/>"
                + "<owl:Class rdf:about=\"urn:test#p4\"/>"
                + "<owl:Class rdf:about=\"urn:test#p5\"/></owl:unionOf></owl:Class></owl:complementOf></owl:Class></rdfs:subClassOf></owl:Class>"
                + "<owl:Class rdf:about=\"urn:test#p3\"><rdfs:subClassOf>"
                + "<owl:Class><owl:complementOf>"
                + "<owl:Class><owl:unionOf rdf:parseType=\"Collection\">"
                + "<owl:Class rdf:about=\"urn:test#p4\"/>"
                + "<owl:Class rdf:about=\"urn:test#p5\"/></owl:unionOf></owl:Class></owl:complementOf></owl:Class></rdfs:subClassOf></owl:Class>"
                + "<owl:Class rdf:about=\"urn:test#p4\"><rdfs:subClassOf>"
                + "<owl:Class><owl:complementOf>"
                + "<owl:Class rdf:about=\"urn:test#p5\"/></owl:complementOf></owl:Class></rdfs:subClassOf></owl:Class>"
                + "<owl:Class rdf:about=\"urn:test#p5\"/><owl:ObjectProperty rdf:about=\"urn:test#r\"/><rdf:Description><rdf:type rdf:resource=\"urn:test#Satisfiable\"/></rdf:Description></rdf:RDF>";
        __CLR4_5_2b5lb5llvico2bi.R.inc(14555);test(premiseOntology, false, false, false, true);
    }finally{__CLR4_5_2b5lb5llvico2bi.R.flushNeeded();}}

    @Test
    public void testURIResolverTestCase3AWebOnt2Ddescription2Dlogic2D021() {__CLR4_5_2b5lb5llvico2bi.R.globalSliceStart(getClass().getName(),14556);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wea5ipb8c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2b5lb5llvico2bi.R.rethrow($CLV_t2$);}finally{__CLR4_5_2b5lb5llvico2bi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile2TestCase.testURIResolverTestCase3AWebOnt2Ddescription2Dlogic2D021",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14556,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wea5ipb8c(){try{__CLR4_5_2b5lb5llvico2bi.R.inc(14556);
        __CLR4_5_2b5lb5llvico2bi.R.inc(14557);String premiseOntology = head2
                + "<owl:Ontology rdf:about=\"\"/>"
                + "<owl:Class rdf:about=\"urn:test#Satisfiable\"><owl:equivalentClass>"
                + "<owl:Class><owl:intersectionOf rdf:parseType=\"Collection\"><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#r\"/><owl:someValuesFrom>"
                + "<owl:Class rdf:about=\"urn:test#p1\"/></owl:someValuesFrom></owl:Restriction><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#r\"/><owl:someValuesFrom>"
                + "<owl:Class rdf:about=\"urn:test#p2\"/></owl:someValuesFrom></owl:Restriction><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#r\"/><owl:someValuesFrom>"
                + "<owl:Class rdf:about=\"urn:test#p3\"/></owl:someValuesFrom></owl:Restriction><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#r\"/><owl:someValuesFrom>"
                + "<owl:Class rdf:about=\"urn:test#p4\"/></owl:someValuesFrom></owl:Restriction><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#r\"/><owl:someValuesFrom>"
                + "<owl:Class><owl:intersectionOf rdf:parseType=\"Collection\">"
                + "<owl:Class rdf:about=\"urn:test#p1\"/>"
                + "<owl:Class rdf:about=\"urn:test#p\"/></owl:intersectionOf></owl:Class></owl:someValuesFrom></owl:Restriction><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#r\"/><owl:someValuesFrom>"
                + "<owl:Class><owl:intersectionOf rdf:parseType=\"Collection\">"
                + "<owl:Class rdf:about=\"urn:test#p2\"/>"
                + "<owl:Class rdf:about=\"urn:test#p\"/></owl:intersectionOf></owl:Class></owl:someValuesFrom></owl:Restriction><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#r\"/><owl:someValuesFrom>"
                + "<owl:Class><owl:intersectionOf rdf:parseType=\"Collection\">"
                + "<owl:Class rdf:about=\"urn:test#p3\"/>"
                + "<owl:Class rdf:about=\"urn:test#p\"/></owl:intersectionOf></owl:Class></owl:someValuesFrom></owl:Restriction><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#r\"/><owl:someValuesFrom>"
                + "<owl:Class><owl:intersectionOf rdf:parseType=\"Collection\">"
                + "<owl:Class rdf:about=\"urn:test#p4\"/>"
                + "<owl:Class rdf:about=\"urn:test#p\"/></owl:intersectionOf></owl:Class></owl:someValuesFrom></owl:Restriction><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#r\"/><owl:maxCardinality rdf:datatype=\"http://www.w3.org/2001/XMLSchema#nonNegativeInteger\">5</owl:maxCardinality></owl:Restriction><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#r\"/><owl:someValuesFrom>"
                + "<owl:Class rdf:about=\"urn:test#p5\"/></owl:someValuesFrom></owl:Restriction><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#r\"/><owl:someValuesFrom>"
                + "<owl:Class><owl:intersectionOf rdf:parseType=\"Collection\">"
                + "<owl:Class rdf:about=\"urn:test#p5\"/>"
                + "<owl:Class rdf:about=\"urn:test#p\"/></owl:intersectionOf></owl:Class></owl:someValuesFrom></owl:Restriction></owl:intersectionOf></owl:Class></owl:equivalentClass></owl:Class>"
                + "<owl:Class rdf:about=\"urn:test#p\"/>"
                + "<owl:Class rdf:about=\"urn:test#p1\"><rdfs:subClassOf>"
                + "<owl:Class><owl:complementOf>"
                + "<owl:Class><owl:unionOf rdf:parseType=\"Collection\">"
                + "<owl:Class rdf:about=\"urn:test#p2\"/>"
                + "<owl:Class rdf:about=\"urn:test#p3\"/>"
                + "<owl:Class rdf:about=\"urn:test#p4\"/>"
                + "<owl:Class rdf:about=\"urn:test#p5\"/></owl:unionOf></owl:Class></owl:complementOf></owl:Class></rdfs:subClassOf></owl:Class>"
                + "<owl:Class rdf:about=\"urn:test#p2\"><rdfs:subClassOf>"
                + "<owl:Class><owl:complementOf>"
                + "<owl:Class><owl:unionOf rdf:parseType=\"Collection\">"
                + "<owl:Class rdf:about=\"urn:test#p3\"/>"
                + "<owl:Class rdf:about=\"urn:test#p4\"/>"
                + "<owl:Class rdf:about=\"urn:test#p5\"/></owl:unionOf></owl:Class></owl:complementOf></owl:Class></rdfs:subClassOf></owl:Class>"
                + "<owl:Class rdf:about=\"urn:test#p3\"><rdfs:subClassOf>"
                + "<owl:Class><owl:complementOf>"
                + "<owl:Class><owl:unionOf rdf:parseType=\"Collection\">"
                + "<owl:Class rdf:about=\"urn:test#p4\"/>"
                + "<owl:Class rdf:about=\"urn:test#p5\"/></owl:unionOf></owl:Class></owl:complementOf></owl:Class></rdfs:subClassOf></owl:Class>"
                + "<owl:Class rdf:about=\"urn:test#p4\"><rdfs:subClassOf>"
                + "<owl:Class><owl:complementOf>"
                + "<owl:Class rdf:about=\"urn:test#p5\"/></owl:complementOf></owl:Class></rdfs:subClassOf></owl:Class>"
                + "<owl:Class rdf:about=\"urn:test#p5\"/><owl:ObjectProperty rdf:about=\"urn:test#r\"/><rdf:Description><rdf:type rdf:resource=\"urn:test#Satisfiable\"/></rdf:Description></rdf:RDF>";
        __CLR4_5_2b5lb5llvico2bi.R.inc(14558);test(premiseOntology, false, false, false, true);
    }finally{__CLR4_5_2b5lb5llvico2bi.R.flushNeeded();}}

    @Test
    public void testURIResolverTestCase3AWebOnt2Ddescription2Dlogic2D022() {__CLR4_5_2b5lb5llvico2bi.R.globalSliceStart(getClass().getName(),14559);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2zdtxnyb8f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2b5lb5llvico2bi.R.rethrow($CLV_t2$);}finally{__CLR4_5_2b5lb5llvico2bi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile2TestCase.testURIResolverTestCase3AWebOnt2Ddescription2Dlogic2D022",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14559,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2zdtxnyb8f(){try{__CLR4_5_2b5lb5llvico2bi.R.inc(14559);
        __CLR4_5_2b5lb5llvico2bi.R.inc(14560);String premiseOntology = head2
                + "<owl:Ontology rdf:about=\"\"/>"
                + "<owl:Class rdf:about=\"urn:test#Unsatisfiable\"><owl:equivalentClass>"
                + "<owl:Class><owl:intersectionOf rdf:parseType=\"Collection\"><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#r\"/><owl:someValuesFrom>"
                + "<owl:Class rdf:about=\"urn:test#p1\"/></owl:someValuesFrom></owl:Restriction><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#r\"/><owl:someValuesFrom>"
                + "<owl:Class rdf:about=\"urn:test#p2\"/></owl:someValuesFrom></owl:Restriction><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#r\"/><owl:someValuesFrom>"
                + "<owl:Class rdf:about=\"urn:test#p3\"/></owl:someValuesFrom></owl:Restriction><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#r\"/><owl:someValuesFrom>"
                + "<owl:Class rdf:about=\"urn:test#p4\"/></owl:someValuesFrom></owl:Restriction><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#r\"/><owl:someValuesFrom>"
                + "<owl:Class><owl:intersectionOf rdf:parseType=\"Collection\">"
                + "<owl:Class rdf:about=\"urn:test#p1\"/>"
                + "<owl:Class rdf:about=\"urn:test#p\"/></owl:intersectionOf></owl:Class></owl:someValuesFrom></owl:Restriction><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#r\"/><owl:someValuesFrom>"
                + "<owl:Class><owl:intersectionOf rdf:parseType=\"Collection\">"
                + "<owl:Class rdf:about=\"urn:test#p2\"/>"
                + "<owl:Class rdf:about=\"urn:test#p\"/></owl:intersectionOf></owl:Class></owl:someValuesFrom></owl:Restriction><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#r\"/><owl:someValuesFrom>"
                + "<owl:Class><owl:intersectionOf rdf:parseType=\"Collection\">"
                + "<owl:Class rdf:about=\"urn:test#p3\"/>"
                + "<owl:Class rdf:about=\"urn:test#p\"/></owl:intersectionOf></owl:Class></owl:someValuesFrom></owl:Restriction><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#r\"/><owl:someValuesFrom>"
                + "<owl:Class><owl:intersectionOf rdf:parseType=\"Collection\">"
                + "<owl:Class rdf:about=\"urn:test#p4\"/>"
                + "<owl:Class rdf:about=\"urn:test#p\"/></owl:intersectionOf></owl:Class></owl:someValuesFrom></owl:Restriction><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#r\"/><owl:maxCardinality rdf:datatype=\"http://www.w3.org/2001/XMLSchema#nonNegativeInteger\">4</owl:maxCardinality></owl:Restriction><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#r\"/><owl:someValuesFrom>"
                + "<owl:Class rdf:about=\"urn:test#p5\"/></owl:someValuesFrom></owl:Restriction></owl:intersectionOf></owl:Class></owl:equivalentClass></owl:Class>"
                + "<owl:Class rdf:about=\"urn:test#p\"/>"
                + "<owl:Class rdf:about=\"urn:test#p1\"><rdfs:subClassOf>"
                + "<owl:Class><owl:complementOf>"
                + "<owl:Class><owl:unionOf rdf:parseType=\"Collection\">"
                + "<owl:Class rdf:about=\"urn:test#p2\"/>"
                + "<owl:Class rdf:about=\"urn:test#p3\"/>"
                + "<owl:Class rdf:about=\"urn:test#p4\"/>"
                + "<owl:Class rdf:about=\"urn:test#p5\"/></owl:unionOf></owl:Class></owl:complementOf></owl:Class></rdfs:subClassOf></owl:Class>"
                + "<owl:Class rdf:about=\"urn:test#p2\"><rdfs:subClassOf>"
                + "<owl:Class><owl:complementOf>"
                + "<owl:Class><owl:unionOf rdf:parseType=\"Collection\">"
                + "<owl:Class rdf:about=\"urn:test#p3\"/>"
                + "<owl:Class rdf:about=\"urn:test#p4\"/>"
                + "<owl:Class rdf:about=\"urn:test#p5\"/></owl:unionOf></owl:Class></owl:complementOf></owl:Class></rdfs:subClassOf></owl:Class>"
                + "<owl:Class rdf:about=\"urn:test#p3\"><rdfs:subClassOf>"
                + "<owl:Class><owl:complementOf>"
                + "<owl:Class><owl:unionOf rdf:parseType=\"Collection\">"
                + "<owl:Class rdf:about=\"urn:test#p4\"/>"
                + "<owl:Class rdf:about=\"urn:test#p5\"/></owl:unionOf></owl:Class></owl:complementOf></owl:Class></rdfs:subClassOf></owl:Class>"
                + "<owl:Class rdf:about=\"urn:test#p4\"><rdfs:subClassOf>"
                + "<owl:Class><owl:complementOf>"
                + "<owl:Class rdf:about=\"urn:test#p5\"/></owl:complementOf></owl:Class></rdfs:subClassOf></owl:Class>"
                + "<owl:Class rdf:about=\"urn:test#p5\"/><owl:ObjectProperty rdf:about=\"urn:test#r\"/><rdf:Description><rdf:type rdf:resource=\"urn:test#Unsatisfiable\"/></rdf:Description></rdf:RDF>";
        __CLR4_5_2b5lb5llvico2bi.R.inc(14561);test(premiseOntology, false, false, false, true);
    }finally{__CLR4_5_2b5lb5llvico2bi.R.flushNeeded();}}

    @Test
    public void testURIResolverTestCase3AWebOnt2Ddescription2Dlogic2D023() {__CLR4_5_2b5lb5llvico2bi.R.globalSliceStart(getClass().getName(),14562);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2w4tyvhb8i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2b5lb5llvico2bi.R.rethrow($CLV_t2$);}finally{__CLR4_5_2b5lb5llvico2bi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile2TestCase.testURIResolverTestCase3AWebOnt2Ddescription2Dlogic2D023",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14562,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2w4tyvhb8i(){try{__CLR4_5_2b5lb5llvico2bi.R.inc(14562);
        __CLR4_5_2b5lb5llvico2bi.R.inc(14563);String premiseOntology = head2
                + "<owl:Ontology rdf:about=\"\"/>"
                + "<owl:Class rdf:about=\"urn:test#Unsatisfiable\"><rdfs:subClassOf>"
                + "<owl:Class rdf:about=\"urn:test#a\"/></rdfs:subClassOf><rdfs:subClassOf><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#s\"/><owl:someValuesFrom>"
                + "<owl:Class><owl:intersectionOf rdf:parseType=\"Collection\"><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#r\"/><owl:someValuesFrom>"
                + "<owl:Class rdf:about=\"http://www.w3.org/2002/07/owl#Thing\"/></owl:someValuesFrom></owl:Restriction><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#p\"/><owl:someValuesFrom>"
                + "<owl:Class rdf:about=\"http://www.w3.org/2002/07/owl#Thing\"/></owl:someValuesFrom></owl:Restriction><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#r\"/><owl:allValuesFrom>"
                + "<owl:Class rdf:about=\"urn:test#c\"/></owl:allValuesFrom></owl:Restriction><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#p\"/><owl:allValuesFrom><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#r\"/><owl:someValuesFrom>"
                + "<owl:Class rdf:about=\"http://www.w3.org/2002/07/owl#Thing\"/></owl:someValuesFrom></owl:Restriction></owl:allValuesFrom></owl:Restriction><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#p\"/><owl:allValuesFrom><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#p\"/><owl:someValuesFrom>"
                + "<owl:Class rdf:about=\"http://www.w3.org/2002/07/owl#Thing\"/></owl:someValuesFrom></owl:Restriction></owl:allValuesFrom></owl:Restriction><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#p\"/><owl:allValuesFrom><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#r\"/><owl:allValuesFrom>"
                + "<owl:Class rdf:about=\"urn:test#c\"/></owl:allValuesFrom></owl:Restriction></owl:allValuesFrom></owl:Restriction></owl:intersectionOf></owl:Class></owl:someValuesFrom></owl:Restriction></rdfs:subClassOf></owl:Class>"
                + "<owl:Class rdf:about=\"urn:test#a\"/>"
                + "<owl:Class rdf:about=\"urn:test#c\"><owl:equivalentClass><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#invR\"/><owl:allValuesFrom><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#invP\"/><owl:allValuesFrom><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#invS\"/><owl:allValuesFrom>"
                + "<owl:Class><owl:complementOf>"
                + "<owl:Class rdf:about=\"urn:test#a\"/></owl:complementOf></owl:Class></owl:allValuesFrom></owl:Restriction></owl:allValuesFrom></owl:Restriction></owl:allValuesFrom></owl:Restriction></owl:equivalentClass></owl:Class><owl:ObjectProperty rdf:about=\"urn:test#invP\"><owl:inverseOf rdf:resource=\"urn:test#p\"/></owl:ObjectProperty><owl:ObjectProperty rdf:about=\"urn:test#invR\"><owl:inverseOf rdf:resource=\"urn:test#r\"/></owl:ObjectProperty><owl:ObjectProperty rdf:about=\"urn:test#invS\"><owl:inverseOf rdf:resource=\"urn:test#s\"/></owl:ObjectProperty><owl:ObjectProperty rdf:about=\"urn:test#p\"/><owl:TransitiveProperty rdf:about=\"urn:test#p\"/><owl:ObjectProperty rdf:about=\"urn:test#r\"/><owl:ObjectProperty rdf:about=\"urn:test#s\"/><rdf:Description><rdf:type rdf:resource=\"urn:test#Unsatisfiable\"/></rdf:Description></rdf:RDF>";
        __CLR4_5_2b5lb5llvico2bi.R.inc(14564);test(premiseOntology, false, false, false, true);
    }finally{__CLR4_5_2b5lb5llvico2bi.R.flushNeeded();}}

    @Test
    public void testURIResolverTestCase3AWebOnt2Ddescription2Dlogic2D024() {__CLR4_5_2b5lb5llvico2bi.R.globalSliceStart(getClass().getName(),14565);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2svu030b8l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2b5lb5llvico2bi.R.rethrow($CLV_t2$);}finally{__CLR4_5_2b5lb5llvico2bi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile2TestCase.testURIResolverTestCase3AWebOnt2Ddescription2Dlogic2D024",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14565,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2svu030b8l(){try{__CLR4_5_2b5lb5llvico2bi.R.inc(14565);
        __CLR4_5_2b5lb5llvico2bi.R.inc(14566);String premiseOntology = head2
                + "<owl:Ontology rdf:about=\"\"/>"
                + "<owl:Class rdf:about=\"urn:test#Satisfiable\"><owl:equivalentClass>"
                + "<owl:Class><owl:intersectionOf rdf:parseType=\"Collection\">"
                + "<owl:Class><owl:complementOf>"
                + "<owl:Class rdf:about=\"urn:test#a\"/></owl:complementOf></owl:Class><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#invF\"/><owl:someValuesFrom>"
                + "<owl:Class rdf:about=\"urn:test#a\"/></owl:someValuesFrom></owl:Restriction><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#invR\"/><owl:someValuesFrom><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#invF\"/><owl:someValuesFrom>"
                + "<owl:Class rdf:about=\"urn:test#a\"/></owl:someValuesFrom></owl:Restriction></owl:someValuesFrom></owl:Restriction></owl:intersectionOf></owl:Class></owl:equivalentClass></owl:Class>"
                + "<owl:Class rdf:about=\"urn:test#a\"/><owl:ObjectProperty rdf:about=\"urn:test#invF\"><owl:inverseOf rdf:resource=\"urn:test#f\"/></owl:ObjectProperty><owl:ObjectProperty rdf:about=\"urn:test#invR\"><owl:inverseOf rdf:resource=\"urn:test#r\"/></owl:ObjectProperty><owl:ObjectProperty rdf:about=\"urn:test#f\"><rdfs:subPropertyOf rdf:resource=\"urn:test#r\"/></owl:ObjectProperty><owl:ObjectProperty rdf:about=\"urn:test#r\"/><owl:TransitiveProperty rdf:about=\"urn:test#r\"/><rdf:Description rdf:about='http://www.w3.org/2002/07/owl#Thing'><rdfs:subClassOf><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#f\"/><owl:maxCardinality rdf:datatype=\"http://www.w3.org/2001/XMLSchema#nonNegativeInteger\">1</owl:maxCardinality></owl:Restriction></rdfs:subClassOf></rdf:Description><rdf:Description><rdf:type rdf:resource=\"urn:test#Satisfiable\"/></rdf:Description></rdf:RDF>";
        __CLR4_5_2b5lb5llvico2bi.R.inc(14567);test(premiseOntology, false, false, false, true);
    }finally{__CLR4_5_2b5lb5llvico2bi.R.flushNeeded();}}

    @Test
    public void testURIResolverTestCase3AWebOnt2Ddescription2Dlogic2D025() {__CLR4_5_2b5lb5llvico2bi.R.globalSliceStart(getClass().getName(),14568);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pmu1ajb8o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2b5lb5llvico2bi.R.rethrow($CLV_t2$);}finally{__CLR4_5_2b5lb5llvico2bi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile2TestCase.testURIResolverTestCase3AWebOnt2Ddescription2Dlogic2D025",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14568,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pmu1ajb8o(){try{__CLR4_5_2b5lb5llvico2bi.R.inc(14568);
        __CLR4_5_2b5lb5llvico2bi.R.inc(14569);String premiseOntology = head2
                + "<owl:Ontology rdf:about=\"\"/>"
                + "<owl:Class rdf:about=\"urn:test#Satisfiable\"><owl:equivalentClass>"
                + "<owl:Class><owl:intersectionOf rdf:parseType=\"Collection\">"
                + "<owl:Class><owl:complementOf>"
                + "<owl:Class rdf:about=\"urn:test#a\"/></owl:complementOf></owl:Class><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#invF\"/><owl:someValuesFrom>"
                + "<owl:Class rdf:about=\"urn:test#a\"/></owl:someValuesFrom></owl:Restriction><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#invR\"/><owl:someValuesFrom><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#invF\"/><owl:someValuesFrom>"
                + "<owl:Class rdf:about=\"urn:test#a\"/></owl:someValuesFrom></owl:Restriction></owl:someValuesFrom></owl:Restriction></owl:intersectionOf></owl:Class></owl:equivalentClass></owl:Class>"
                + "<owl:Class rdf:about=\"urn:test#a\"/><owl:ObjectProperty rdf:about=\"urn:test#invF\"><owl:inverseOf rdf:resource=\"urn:test#f\"/></owl:ObjectProperty><owl:ObjectProperty rdf:about=\"urn:test#invR\"><owl:inverseOf rdf:resource=\"urn:test#r\"/></owl:ObjectProperty><owl:ObjectProperty rdf:about=\"urn:test#f\"><rdfs:subPropertyOf rdf:resource=\"urn:test#r\"/></owl:ObjectProperty><owl:FunctionalProperty rdf:about=\"urn:test#f\"/><owl:ObjectProperty rdf:about=\"urn:test#r\"/><owl:TransitiveProperty rdf:about=\"urn:test#r\"/><rdf:Description><rdf:type rdf:resource=\"urn:test#Satisfiable\"/></rdf:Description></rdf:RDF>";
        __CLR4_5_2b5lb5llvico2bi.R.inc(14570);test(premiseOntology, false, false, false, true);
    }finally{__CLR4_5_2b5lb5llvico2bi.R.flushNeeded();}}

    @Test
    public void testURIResolverTestCase3AWebOnt2Ddescription2Dlogic2D026() {__CLR4_5_2b5lb5llvico2bi.R.globalSliceStart(getClass().getName(),14571);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mdu2i2b8r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2b5lb5llvico2bi.R.rethrow($CLV_t2$);}finally{__CLR4_5_2b5lb5llvico2bi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile2TestCase.testURIResolverTestCase3AWebOnt2Ddescription2Dlogic2D026",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14571,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mdu2i2b8r(){try{__CLR4_5_2b5lb5llvico2bi.R.inc(14571);
        __CLR4_5_2b5lb5llvico2bi.R.inc(14572);String premiseOntology = head2
                + "<owl:Ontology rdf:about=\"\"/>"
                + "<owl:Class rdf:about=\"urn:test#Unsatisfiable\"><owl:equivalentClass>"
                + "<owl:Class><owl:intersectionOf rdf:parseType=\"Collection\">"
                + "<owl:Class><owl:complementOf>"
                + "<owl:Class rdf:about=\"urn:test#c\"/></owl:complementOf></owl:Class><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#invF\"/><owl:someValuesFrom>"
                + "<owl:Class rdf:about=\"urn:test#d\"/></owl:someValuesFrom></owl:Restriction><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#invR\"/><owl:allValuesFrom><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#invF\"/><owl:someValuesFrom>"
                + "<owl:Class rdf:about=\"urn:test#d\"/></owl:someValuesFrom></owl:Restriction></owl:allValuesFrom></owl:Restriction></owl:intersectionOf></owl:Class></owl:equivalentClass></owl:Class>"
                + "<owl:Class rdf:about=\"urn:test#c\"/>"
                + "<owl:Class rdf:about=\"urn:test#d\"><owl:equivalentClass>"
                + "<owl:Class><owl:intersectionOf rdf:parseType=\"Collection\">"
                + "<owl:Class rdf:about=\"urn:test#c\"/><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#f\"/><owl:someValuesFrom>"
                + "<owl:Class><owl:complementOf>"
                + "<owl:Class rdf:about=\"urn:test#c\"/></owl:complementOf></owl:Class></owl:someValuesFrom></owl:Restriction></owl:intersectionOf></owl:Class></owl:equivalentClass></owl:Class><owl:ObjectProperty rdf:about=\"urn:test#invF\"><owl:inverseOf rdf:resource=\"urn:test#f\"/></owl:ObjectProperty><owl:ObjectProperty rdf:about=\"urn:test#invR\"><owl:inverseOf rdf:resource=\"urn:test#r\"/></owl:ObjectProperty><owl:ObjectProperty rdf:about=\"urn:test#f\"><rdfs:subPropertyOf rdf:resource=\"urn:test#r\"/></owl:ObjectProperty><owl:ObjectProperty rdf:about=\"urn:test#r\"/><owl:TransitiveProperty rdf:about=\"urn:test#r\"/><rdf:Description rdf:about='http://www.w3.org/2002/07/owl#Thing'><rdfs:subClassOf><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#f\"/><owl:maxCardinality rdf:datatype=\"http://www.w3.org/2001/XMLSchema#nonNegativeInteger\">1</owl:maxCardinality></owl:Restriction></rdfs:subClassOf></rdf:Description><rdf:Description><rdf:type rdf:resource=\"urn:test#Unsatisfiable\"/></rdf:Description></rdf:RDF>";
        __CLR4_5_2b5lb5llvico2bi.R.inc(14573);test(premiseOntology, false, false, false, true);
    }finally{__CLR4_5_2b5lb5llvico2bi.R.flushNeeded();}}

    @Test
    public void testURIResolverTestCase3AWebOnt2Ddescription2Dlogic2D027() {__CLR4_5_2b5lb5llvico2bi.R.globalSliceStart(getClass().getName(),14574);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2j4u3plb8u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2b5lb5llvico2bi.R.rethrow($CLV_t2$);}finally{__CLR4_5_2b5lb5llvico2bi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile2TestCase.testURIResolverTestCase3AWebOnt2Ddescription2Dlogic2D027",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14574,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2j4u3plb8u(){try{__CLR4_5_2b5lb5llvico2bi.R.inc(14574);
        __CLR4_5_2b5lb5llvico2bi.R.inc(14575);String premiseOntology = head2
                + "<owl:Ontology rdf:about=\"\"/>"
                + "<owl:Class rdf:about=\"urn:test#Unsatisfiable\"><owl:equivalentClass>"
                + "<owl:Class><owl:intersectionOf rdf:parseType=\"Collection\">"
                + "<owl:Class><owl:complementOf>"
                + "<owl:Class rdf:about=\"urn:test#c\"/></owl:complementOf></owl:Class><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#invF\"/><owl:someValuesFrom>"
                + "<owl:Class rdf:about=\"urn:test#d\"/></owl:someValuesFrom></owl:Restriction><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#invR\"/><owl:allValuesFrom><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#invF\"/><owl:someValuesFrom>"
                + "<owl:Class rdf:about=\"urn:test#d\"/></owl:someValuesFrom></owl:Restriction></owl:allValuesFrom></owl:Restriction></owl:intersectionOf></owl:Class></owl:equivalentClass></owl:Class>"
                + "<owl:Class rdf:about=\"urn:test#c\"/>"
                + "<owl:Class rdf:about=\"urn:test#d\"><owl:equivalentClass>"
                + "<owl:Class><owl:intersectionOf rdf:parseType=\"Collection\">"
                + "<owl:Class rdf:about=\"urn:test#c\"/><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#f\"/><owl:someValuesFrom>"
                + "<owl:Class><owl:complementOf>"
                + "<owl:Class rdf:about=\"urn:test#c\"/></owl:complementOf></owl:Class></owl:someValuesFrom></owl:Restriction></owl:intersectionOf></owl:Class></owl:equivalentClass></owl:Class><owl:ObjectProperty rdf:about=\"urn:test#invF\"><owl:inverseOf rdf:resource=\"urn:test#f\"/></owl:ObjectProperty><owl:ObjectProperty rdf:about=\"urn:test#invR\"><owl:inverseOf rdf:resource=\"urn:test#r\"/></owl:ObjectProperty><owl:ObjectProperty rdf:about=\"urn:test#f\"><rdfs:subPropertyOf rdf:resource=\"urn:test#r\"/></owl:ObjectProperty><owl:FunctionalProperty rdf:about=\"urn:test#f\"/><owl:ObjectProperty rdf:about=\"urn:test#r\"/><owl:TransitiveProperty rdf:about=\"urn:test#r\"/><rdf:Description><rdf:type rdf:resource=\"urn:test#Unsatisfiable\"/></rdf:Description></rdf:RDF>";
        __CLR4_5_2b5lb5llvico2bi.R.inc(14576);test(premiseOntology, false, false, false, true);
    }finally{__CLR4_5_2b5lb5llvico2bi.R.flushNeeded();}}

    @Test
    public void testURIResolverTestCase3AWebOnt2Ddescription2Dlogic2D028() {__CLR4_5_2b5lb5llvico2bi.R.globalSliceStart(getClass().getName(),14577);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fvu4x4b8x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2b5lb5llvico2bi.R.rethrow($CLV_t2$);}finally{__CLR4_5_2b5lb5llvico2bi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile2TestCase.testURIResolverTestCase3AWebOnt2Ddescription2Dlogic2D028",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14577,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fvu4x4b8x(){try{__CLR4_5_2b5lb5llvico2bi.R.inc(14577);
        __CLR4_5_2b5lb5llvico2bi.R.inc(14578);String premiseOntology = head2
                + "<owl:Ontology rdf:about=\"\"/>"
                + "<owl:Class rdf:about=\"urn:test#Satisfiable\"><owl:equivalentClass>"
                + "<owl:Class><owl:intersectionOf rdf:parseType=\"Collection\">"
                + "<owl:Class rdf:about=\"urn:test#p1\"/><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#r\"/><owl:someValuesFrom><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#r\"/><owl:someValuesFrom>"
                + "<owl:Class><owl:intersectionOf rdf:parseType=\"Collection\">"
                + "<owl:Class rdf:about=\"urn:test#p1\"/><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#invR\"/><owl:allValuesFrom>"
                + "<owl:Class><owl:unionOf rdf:parseType=\"Collection\">"
                + "<owl:Class><owl:complementOf>"
                + "<owl:Class rdf:about=\"urn:test#p1\"/></owl:complementOf></owl:Class><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#r\"/><owl:allValuesFrom>"
                + "<owl:Class rdf:about=\"urn:test#p1\"/></owl:allValuesFrom></owl:Restriction></owl:unionOf></owl:Class></owl:allValuesFrom></owl:Restriction></owl:intersectionOf></owl:Class></owl:someValuesFrom></owl:Restriction></owl:someValuesFrom></owl:Restriction></owl:intersectionOf></owl:Class></owl:equivalentClass></owl:Class>"
                + "<owl:Class rdf:about=\"urn:test#p1\"/><owl:ObjectProperty rdf:about=\"urn:test#invF\"><owl:inverseOf rdf:resource=\"urn:test#f\"/></owl:ObjectProperty><owl:ObjectProperty rdf:about=\"urn:test#invR\"><owl:inverseOf rdf:resource=\"urn:test#r\"/></owl:ObjectProperty><owl:ObjectProperty rdf:about=\"urn:test#f\"/><owl:ObjectProperty rdf:about=\"urn:test#r\"/><owl:TransitiveProperty rdf:about=\"urn:test#r\"/><rdf:Description rdf:about='http://www.w3.org/2002/07/owl#Thing'><rdfs:subClassOf><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#f\"/><owl:maxCardinality rdf:datatype=\"http://www.w3.org/2001/XMLSchema#nonNegativeInteger\">1</owl:maxCardinality></owl:Restriction></rdfs:subClassOf></rdf:Description><rdf:Description><rdf:type rdf:resource=\"urn:test#Satisfiable\"/></rdf:Description></rdf:RDF>";
        __CLR4_5_2b5lb5llvico2bi.R.inc(14579);test(premiseOntology, false, false, false, true);
    }finally{__CLR4_5_2b5lb5llvico2bi.R.flushNeeded();}}

    @Test
    public void testURIResolverTestCase3AWebOnt2Ddescription2Dlogic2D029() {__CLR4_5_2b5lb5llvico2bi.R.globalSliceStart(getClass().getName(),14580);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cmu64nb90();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2b5lb5llvico2bi.R.rethrow($CLV_t2$);}finally{__CLR4_5_2b5lb5llvico2bi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile2TestCase.testURIResolverTestCase3AWebOnt2Ddescription2Dlogic2D029",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14580,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cmu64nb90(){try{__CLR4_5_2b5lb5llvico2bi.R.inc(14580);
        __CLR4_5_2b5lb5llvico2bi.R.inc(14581);String premiseOntology = head2
                + "<owl:Ontology rdf:about=\"\"/>"
                + "<owl:Class rdf:about=\"urn:test#Unsatisfiable\"><owl:equivalentClass>"
                + "<owl:Class><owl:intersectionOf rdf:parseType=\"Collection\">"
                + "<owl:Class rdf:about=\"urn:test#p1\"/><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#r\"/><owl:someValuesFrom><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#r\"/><owl:someValuesFrom>"
                + "<owl:Class><owl:intersectionOf rdf:parseType=\"Collection\">"
                + "<owl:Class rdf:about=\"urn:test#p1\"/><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#invR\"/><owl:allValuesFrom>"
                + "<owl:Class><owl:complementOf>"
                + "<owl:Class rdf:about=\"urn:test#p1\"/></owl:complementOf></owl:Class></owl:allValuesFrom></owl:Restriction></owl:intersectionOf></owl:Class></owl:someValuesFrom></owl:Restriction></owl:someValuesFrom></owl:Restriction></owl:intersectionOf></owl:Class></owl:equivalentClass></owl:Class>"
                + "<owl:Class rdf:about=\"urn:test#p1\"/><owl:ObjectProperty rdf:about=\"urn:test#invF\"><owl:inverseOf rdf:resource=\"urn:test#f\"/></owl:ObjectProperty><owl:ObjectProperty rdf:about=\"urn:test#invR\"><owl:inverseOf rdf:resource=\"urn:test#r\"/></owl:ObjectProperty><owl:ObjectProperty rdf:about=\"urn:test#f\"/><owl:ObjectProperty rdf:about=\"urn:test#r\"/><owl:TransitiveProperty rdf:about=\"urn:test#r\"/><rdf:Description rdf:about='http://www.w3.org/2002/07/owl#Thing'><rdfs:subClassOf><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#f\"/><owl:maxCardinality rdf:datatype=\"http://www.w3.org/2001/XMLSchema#nonNegativeInteger\">1</owl:maxCardinality></owl:Restriction></rdfs:subClassOf></rdf:Description><rdf:Description><rdf:type rdf:resource=\"urn:test#Unsatisfiable\"/></rdf:Description></rdf:RDF>";
        __CLR4_5_2b5lb5llvico2bi.R.inc(14582);test(premiseOntology, false, false, false, true);
    }finally{__CLR4_5_2b5lb5llvico2bi.R.flushNeeded();}}

    @Test
    public void testURIResolverTestCase3AWebOnt2Ddescription2Dlogic2D030() {__CLR4_5_2b5lb5llvico2bi.R.globalSliceStart(getClass().getName(),14583);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2c5yypdb93();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2b5lb5llvico2bi.R.rethrow($CLV_t2$);}finally{__CLR4_5_2b5lb5llvico2bi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile2TestCase.testURIResolverTestCase3AWebOnt2Ddescription2Dlogic2D030",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14583,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2c5yypdb93(){try{__CLR4_5_2b5lb5llvico2bi.R.inc(14583);
        __CLR4_5_2b5lb5llvico2bi.R.inc(14584);String premiseOntology = head2
                + "<owl:Ontology rdf:about=\"\"/>"
                + "<owl:Class rdf:about=\"urn:test#Unsatisfiable\"><owl:equivalentClass><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#f\"/><owl:someValuesFrom>"
                + "<owl:Class><owl:intersectionOf rdf:parseType=\"Collection\">"
                + "<owl:Class rdf:about=\"urn:test#p1\"/><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#invF\"/><owl:someValuesFrom><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#f\"/><owl:someValuesFrom>"
                + "<owl:Class><owl:complementOf>"
                + "<owl:Class rdf:about=\"urn:test#p1\"/></owl:complementOf></owl:Class></owl:someValuesFrom></owl:Restriction></owl:someValuesFrom></owl:Restriction></owl:intersectionOf></owl:Class></owl:someValuesFrom></owl:Restriction></owl:equivalentClass></owl:Class>"
                + "<owl:Class rdf:about=\"urn:test#p1\"/><owl:ObjectProperty rdf:about=\"urn:test#invF\"><owl:inverseOf rdf:resource=\"urn:test#f\"/></owl:ObjectProperty><owl:ObjectProperty rdf:about=\"urn:test#invR\"><owl:inverseOf rdf:resource=\"urn:test#r\"/></owl:ObjectProperty><owl:ObjectProperty rdf:about=\"urn:test#f\"/><owl:ObjectProperty rdf:about=\"urn:test#r\"/><owl:TransitiveProperty rdf:about=\"urn:test#r\"/><rdf:Description rdf:about='http://www.w3.org/2002/07/owl#Thing'><rdfs:subClassOf><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#f\"/><owl:maxCardinality rdf:datatype=\"http://www.w3.org/2001/XMLSchema#nonNegativeInteger\">1</owl:maxCardinality></owl:Restriction></rdfs:subClassOf></rdf:Description><rdf:Description><rdf:type rdf:resource=\"urn:test#Unsatisfiable\"/></rdf:Description></rdf:RDF>";
        __CLR4_5_2b5lb5llvico2bi.R.inc(14585);test(premiseOntology, false, false, false, true);
    }finally{__CLR4_5_2b5lb5llvico2bi.R.flushNeeded();}}

    @Test
    public void testURIResolverTestCase3AWebOnt2Ddescription2Dlogic2D031() {__CLR4_5_2b5lb5llvico2bi.R.globalSliceStart(getClass().getName(),14586);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28wyzwwb96();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2b5lb5llvico2bi.R.rethrow($CLV_t2$);}finally{__CLR4_5_2b5lb5llvico2bi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile2TestCase.testURIResolverTestCase3AWebOnt2Ddescription2Dlogic2D031",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14586,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28wyzwwb96(){try{__CLR4_5_2b5lb5llvico2bi.R.inc(14586);
        __CLR4_5_2b5lb5llvico2bi.R.inc(14587);String premiseOntology = head2
                + "<owl:Ontology rdf:about=\"\"/>"
                + "<owl:Class rdf:about=\"urn:test#Satisfiable\"><owl:equivalentClass>"
                + "<owl:Class><owl:intersectionOf rdf:parseType=\"Collection\">"
                + "<owl:Class rdf:about=\"urn:test#p1\"/><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#r\"/><owl:someValuesFrom><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#r\"/><owl:someValuesFrom>"
                + "<owl:Class><owl:intersectionOf rdf:parseType=\"Collection\">"
                + "<owl:Class rdf:about=\"urn:test#p1\"/><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#invR\"/><owl:allValuesFrom>"
                + "<owl:Class><owl:unionOf rdf:parseType=\"Collection\">"
                + "<owl:Class><owl:complementOf>"
                + "<owl:Class rdf:about=\"urn:test#p1\"/></owl:complementOf></owl:Class><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#r\"/><owl:allValuesFrom>"
                + "<owl:Class rdf:about=\"urn:test#p1\"/></owl:allValuesFrom></owl:Restriction></owl:unionOf></owl:Class></owl:allValuesFrom></owl:Restriction></owl:intersectionOf></owl:Class></owl:someValuesFrom></owl:Restriction></owl:someValuesFrom></owl:Restriction></owl:intersectionOf></owl:Class></owl:equivalentClass></owl:Class>"
                + "<owl:Class rdf:about=\"urn:test#p1\"/><owl:ObjectProperty rdf:about=\"urn:test#invF\"><owl:inverseOf rdf:resource=\"urn:test#f\"/></owl:ObjectProperty><owl:ObjectProperty rdf:about=\"urn:test#invR\"><owl:inverseOf rdf:resource=\"urn:test#r\"/></owl:ObjectProperty><owl:ObjectProperty rdf:about=\"urn:test#f\"/><owl:FunctionalProperty rdf:about=\"urn:test#f\"/><owl:ObjectProperty rdf:about=\"urn:test#r\"/><owl:TransitiveProperty rdf:about=\"urn:test#r\"/><rdf:Description><rdf:type rdf:resource=\"urn:test#Satisfiable\"/></rdf:Description></rdf:RDF>";
        __CLR4_5_2b5lb5llvico2bi.R.inc(14588);test(premiseOntology, false, false, false, true);
    }finally{__CLR4_5_2b5lb5llvico2bi.R.flushNeeded();}}

    @Test
    public void testURIResolverTestCase3AWebOnt2Ddescription2Dlogic2D032() {__CLR4_5_2b5lb5llvico2bi.R.globalSliceStart(getClass().getName(),14589);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25nz14fb99();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2b5lb5llvico2bi.R.rethrow($CLV_t2$);}finally{__CLR4_5_2b5lb5llvico2bi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile2TestCase.testURIResolverTestCase3AWebOnt2Ddescription2Dlogic2D032",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14589,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25nz14fb99(){try{__CLR4_5_2b5lb5llvico2bi.R.inc(14589);
        __CLR4_5_2b5lb5llvico2bi.R.inc(14590);String premiseOntology = head2
                + "<owl:Ontology rdf:about=\"\"/>"
                + "<owl:Class rdf:about=\"urn:test#Unsatisfiable\"><owl:equivalentClass>"
                + "<owl:Class><owl:intersectionOf rdf:parseType=\"Collection\">"
                + "<owl:Class rdf:about=\"urn:test#p1\"/><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#r\"/><owl:someValuesFrom><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#r\"/><owl:someValuesFrom>"
                + "<owl:Class><owl:intersectionOf rdf:parseType=\"Collection\">"
                + "<owl:Class rdf:about=\"urn:test#p1\"/><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#invR\"/><owl:allValuesFrom>"
                + "<owl:Class><owl:complementOf>"
                + "<owl:Class rdf:about=\"urn:test#p1\"/></owl:complementOf></owl:Class></owl:allValuesFrom></owl:Restriction></owl:intersectionOf></owl:Class></owl:someValuesFrom></owl:Restriction></owl:someValuesFrom></owl:Restriction></owl:intersectionOf></owl:Class></owl:equivalentClass></owl:Class>"
                + "<owl:Class rdf:about=\"urn:test#p1\"/><owl:ObjectProperty rdf:about=\"urn:test#invF\"><owl:inverseOf rdf:resource=\"urn:test#f\"/></owl:ObjectProperty><owl:ObjectProperty rdf:about=\"urn:test#invR\"><owl:inverseOf rdf:resource=\"urn:test#r\"/></owl:ObjectProperty><owl:ObjectProperty rdf:about=\"urn:test#f\"/><owl:FunctionalProperty rdf:about=\"urn:test#f\"/><owl:ObjectProperty rdf:about=\"urn:test#r\"/><owl:TransitiveProperty rdf:about=\"urn:test#r\"/><rdf:Description><rdf:type rdf:resource=\"urn:test#Unsatisfiable\"/></rdf:Description></rdf:RDF>";
        __CLR4_5_2b5lb5llvico2bi.R.inc(14591);test(premiseOntology, false, false, false, true);
    }finally{__CLR4_5_2b5lb5llvico2bi.R.flushNeeded();}}

    @Test
    public void testURIResolverTestCase3AWebOnt2Ddescription2Dlogic2D033() {__CLR4_5_2b5lb5llvico2bi.R.globalSliceStart(getClass().getName(),14592);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22ez2byb9c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2b5lb5llvico2bi.R.rethrow($CLV_t2$);}finally{__CLR4_5_2b5lb5llvico2bi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile2TestCase.testURIResolverTestCase3AWebOnt2Ddescription2Dlogic2D033",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14592,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22ez2byb9c(){try{__CLR4_5_2b5lb5llvico2bi.R.inc(14592);
        __CLR4_5_2b5lb5llvico2bi.R.inc(14593);String premiseOntology = head2
                + "<owl:Ontology rdf:about=\"\"/>"
                + "<owl:Class rdf:about=\"urn:test#Unsatisfiable\"><owl:equivalentClass><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#f\"/><owl:someValuesFrom>"
                + "<owl:Class><owl:intersectionOf rdf:parseType=\"Collection\">"
                + "<owl:Class rdf:about=\"urn:test#p1\"/><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#invF\"/><owl:allValuesFrom><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#f\"/><owl:someValuesFrom>"
                + "<owl:Class><owl:complementOf>"
                + "<owl:Class rdf:about=\"urn:test#p1\"/></owl:complementOf></owl:Class></owl:someValuesFrom></owl:Restriction></owl:allValuesFrom></owl:Restriction></owl:intersectionOf></owl:Class></owl:someValuesFrom></owl:Restriction></owl:equivalentClass></owl:Class>"
                + "<owl:Class rdf:about=\"urn:test#p1\"/><owl:ObjectProperty rdf:about=\"urn:test#invF\"><owl:inverseOf rdf:resource=\"urn:test#f\"/></owl:ObjectProperty><owl:ObjectProperty rdf:about=\"urn:test#invR\"><owl:inverseOf rdf:resource=\"urn:test#r\"/></owl:ObjectProperty><owl:ObjectProperty rdf:about=\"urn:test#f\"/><owl:FunctionalProperty rdf:about=\"urn:test#f\"/><owl:ObjectProperty rdf:about=\"urn:test#r\"/><owl:TransitiveProperty rdf:about=\"urn:test#r\"/><rdf:Description><rdf:type rdf:resource=\"urn:test#Unsatisfiable\"/></rdf:Description></rdf:RDF>";
        __CLR4_5_2b5lb5llvico2bi.R.inc(14594);test(premiseOntology, false, false, false, true);
    }finally{__CLR4_5_2b5lb5llvico2bi.R.flushNeeded();}}

    @Test
    public void testURIResolverTestCase3AWebOnt2Ddescription2Dlogic2D034() {__CLR4_5_2b5lb5llvico2bi.R.globalSliceStart(getClass().getName(),14595);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2u0wgjb9f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2b5lb5llvico2bi.R.rethrow($CLV_t2$);}finally{__CLR4_5_2b5lb5llvico2bi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile2TestCase.testURIResolverTestCase3AWebOnt2Ddescription2Dlogic2D034",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14595,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2u0wgjb9f(){try{__CLR4_5_2b5lb5llvico2bi.R.inc(14595);
        __CLR4_5_2b5lb5llvico2bi.R.inc(14596);String premiseOntology = head2
                + "<owl:Ontology rdf:about=\"\"/>"
                + "<owl:Class rdf:about=\"urn:test#Satisfiable\"><owl:equivalentClass>"
                + "<owl:Class><owl:intersectionOf rdf:parseType=\"Collection\"><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#r\"/><owl:someValuesFrom><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#invR\"/><owl:allValuesFrom><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#r1\"/><owl:allValuesFrom>"
                + "<owl:Class rdf:about=\"urn:test#p\"/></owl:allValuesFrom></owl:Restriction></owl:allValuesFrom></owl:Restriction></owl:someValuesFrom></owl:Restriction><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#r\"/><owl:someValuesFrom><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#invR\"/><owl:allValuesFrom><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#r1\"/><owl:allValuesFrom>"
                + "<owl:Class><owl:complementOf>"
                + "<owl:Class rdf:about=\"urn:test#p\"/></owl:complementOf></owl:Class></owl:allValuesFrom></owl:Restriction></owl:allValuesFrom></owl:Restriction></owl:someValuesFrom></owl:Restriction></owl:intersectionOf></owl:Class></owl:equivalentClass></owl:Class>"
                + "<owl:Class rdf:about=\"urn:test#p\"/><owl:ObjectProperty rdf:about=\"urn:test#invR\"><owl:inverseOf rdf:resource=\"urn:test#r\"/></owl:ObjectProperty><owl:ObjectProperty rdf:about=\"urn:test#r\"/><owl:ObjectProperty rdf:about=\"urn:test#r1\"/><rdf:Description><rdf:type rdf:resource=\"urn:test#Satisfiable\"/></rdf:Description></rdf:RDF>";
        __CLR4_5_2b5lb5llvico2bi.R.inc(14597);test(premiseOntology, false, false, false, true);
    }finally{__CLR4_5_2b5lb5llvico2bi.R.flushNeeded();}}

    @Test
    public void testURIResolverTestCase3AWebOnt2Ddescription2Dlogic2D035() {__CLR4_5_2b5lb5llvico2bi.R.globalSliceStart(getClass().getName(),14598);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2430v90b9i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2b5lb5llvico2bi.R.rethrow($CLV_t2$);}finally{__CLR4_5_2b5lb5llvico2bi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile2TestCase.testURIResolverTestCase3AWebOnt2Ddescription2Dlogic2D035",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14598,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2430v90b9i(){try{__CLR4_5_2b5lb5llvico2bi.R.inc(14598);
        __CLR4_5_2b5lb5llvico2bi.R.inc(14599);String premiseOntology = "<rdf:RDF xmlns:owl=\"http://www.w3.org/2002/07/owl#\" xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\" xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\" xml:base=\"urn:test\" xmlns:oiled=\"urn:test#\"><owl:Ontology rdf:about=\"\"><rdfs:comment>An ontology illustrating the use of a spy point that limits the cardinality of the interpretation domain to having only two objects.</rdfs:comment></owl:Ontology>"
                + "<owl:Class rdf:about=\"urn:test#Unsatisfiable\"><rdfs:subClassOf><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#r\"/><owl:minCardinality rdf:datatype=\"http://www.w3.org/2001/XMLSchema#nonNegativeInteger\">3</owl:minCardinality></owl:Restriction></rdfs:subClassOf></owl:Class><owl:ObjectProperty rdf:about=\"urn:test#p\"><owl:inverseOf rdf:resource=\"urn:test#invP\"/></owl:ObjectProperty><owl:ObjectProperty rdf:about=\"urn:test#r\"/><owl:ObjectProperty rdf:about=\"urn:test#invP\"/>"
                + "<owl:Class rdf:about=\"http://www.w3.org/2002/07/owl#Thing\"><rdfs:subClassOf><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#p\"/><owl:someValuesFrom>"
                + "<owl:Class><owl:oneOf rdf:parseType=\"Collection\"><owl:Thing rdf:about=\"urn:test#spy\"/></owl:oneOf></owl:Class></owl:someValuesFrom></owl:Restriction></rdfs:subClassOf></owl:Class><rdf:Description rdf:about=\"urn:test#spy\"><rdf:type><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#invP\"/><owl:maxCardinality rdf:datatype=\"http://www.w3.org/2001/XMLSchema#nonNegativeInteger\">2</owl:maxCardinality></owl:Restriction></rdf:type></rdf:Description><oiled:Unsatisfiable/></rdf:RDF>";
        __CLR4_5_2b5lb5llvico2bi.R.inc(14600);test(premiseOntology, false, false, false, true);
    }finally{__CLR4_5_2b5lb5llvico2bi.R.flushNeeded();}}

    @Test
    public void testURIResolverTestCase3AWebOnt2Ddescription2Dlogic2D040() {__CLR4_5_2b5lb5llvico2bi.R.globalSliceStart(getClass().getName(),14601);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hjvxu6b9l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2b5lb5llvico2bi.R.rethrow($CLV_t2$);}finally{__CLR4_5_2b5lb5llvico2bi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile2TestCase.testURIResolverTestCase3AWebOnt2Ddescription2Dlogic2D040",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14601,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hjvxu6b9l(){try{__CLR4_5_2b5lb5llvico2bi.R.inc(14601);
        __CLR4_5_2b5lb5llvico2bi.R.inc(14602);String premiseOntology = "<rdf:RDF xmlns:owl=\"http://www.w3.org/2002/07/owl#\" xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\" xmlns:eg=\"http://example.org/factkb#\" xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\" xml:base=\"urn:test\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\"><owl:Ontology rdf:about=\"\"/>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#A\"/>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#B\"/>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#A0\"/>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#A1\"/>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#A2\"/>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#A3\"/>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#A4\"/>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#A5\"/>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#A6\"/>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#A7\"/>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#A8\"/>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#A9\"/>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#B0\"/>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#B1\"/>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#B2\"/>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#B3\"/>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#B4\"/>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#B5\"/>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#B6\"/>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#B7\"/>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#B8\"/>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#B9\"/>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#C1\"><rdfs:subClassOf>"
                + "<owl:Class><owl:intersectionOf rdf:parseType=\"Collection\">"
                + "<owl:Class><owl:unionOf rdf:parseType=\"Collection\">"
                + "<owl:Class rdf:about=\"http://example.org/factkb#A0\"/>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#B0\"/></owl:unionOf></owl:Class>"
                + "<owl:Class><owl:unionOf rdf:parseType=\"Collection\">"
                + "<owl:Class rdf:about=\"http://example.org/factkb#A1\"/>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#B1\"/></owl:unionOf></owl:Class>"
                + "<owl:Class><owl:unionOf rdf:parseType=\"Collection\">"
                + "<owl:Class rdf:about=\"http://example.org/factkb#A2\"/>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#B2\"/></owl:unionOf></owl:Class>"
                + "<owl:Class><owl:unionOf rdf:parseType=\"Collection\">"
                + "<owl:Class rdf:about=\"http://example.org/factkb#A3\"/>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#B3\"/></owl:unionOf></owl:Class>"
                + "<owl:Class><owl:unionOf rdf:parseType=\"Collection\">"
                + "<owl:Class rdf:about=\"http://example.org/factkb#A4\"/>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#B4\"/></owl:unionOf></owl:Class>"
                + "<owl:Class><owl:unionOf rdf:parseType=\"Collection\">"
                + "<owl:Class rdf:about=\"http://example.org/factkb#A5\"/>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#B5\"/></owl:unionOf></owl:Class>"
                + "<owl:Class><owl:unionOf rdf:parseType=\"Collection\">"
                + "<owl:Class rdf:about=\"http://example.org/factkb#A6\"/>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#B6\"/></owl:unionOf></owl:Class>"
                + "<owl:Class><owl:unionOf rdf:parseType=\"Collection\">"
                + "<owl:Class rdf:about=\"http://example.org/factkb#A7\"/>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#B7\"/></owl:unionOf></owl:Class>"
                + "<owl:Class><owl:unionOf rdf:parseType=\"Collection\">"
                + "<owl:Class rdf:about=\"http://example.org/factkb#A8\"/>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#B8\"/></owl:unionOf></owl:Class>"
                + "<owl:Class><owl:unionOf rdf:parseType=\"Collection\">"
                + "<owl:Class rdf:about=\"http://example.org/factkb#A9\"/>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#B9\"/></owl:unionOf></owl:Class>"
                + "<owl:Class><owl:unionOf rdf:parseType=\"Collection\">"
                + "<owl:Class rdf:about=\"http://example.org/factkb#A10\"/>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#B10\"/></owl:unionOf></owl:Class>"
                + "<owl:Class><owl:unionOf rdf:parseType=\"Collection\">"
                + "<owl:Class rdf:about=\"http://example.org/factkb#A11\"/>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#B11\"/></owl:unionOf></owl:Class>"
                + "<owl:Class><owl:unionOf rdf:parseType=\"Collection\">"
                + "<owl:Class rdf:about=\"http://example.org/factkb#A12\"/>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#B12\"/></owl:unionOf></owl:Class>"
                + "<owl:Class><owl:unionOf rdf:parseType=\"Collection\">"
                + "<owl:Class rdf:about=\"http://example.org/factkb#A13\"/>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#B13\"/></owl:unionOf></owl:Class>"
                + "<owl:Class><owl:unionOf rdf:parseType=\"Collection\">"
                + "<owl:Class rdf:about=\"http://example.org/factkb#A14\"/>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#B14\"/></owl:unionOf></owl:Class>"
                + "<owl:Class><owl:unionOf rdf:parseType=\"Collection\">"
                + "<owl:Class rdf:about=\"http://example.org/factkb#A15\"/>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#B15\"/></owl:unionOf></owl:Class>"
                + "<owl:Class><owl:unionOf rdf:parseType=\"Collection\">"
                + "<owl:Class rdf:about=\"http://example.org/factkb#A16\"/>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#B16\"/></owl:unionOf></owl:Class>"
                + "<owl:Class><owl:unionOf rdf:parseType=\"Collection\">"
                + "<owl:Class rdf:about=\"http://example.org/factkb#A17\"/>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#B17\"/></owl:unionOf></owl:Class>"
                + "<owl:Class><owl:unionOf rdf:parseType=\"Collection\">"
                + "<owl:Class rdf:about=\"http://example.org/factkb#A18\"/>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#B18\"/></owl:unionOf></owl:Class>"
                + "<owl:Class><owl:unionOf rdf:parseType=\"Collection\">"
                + "<owl:Class rdf:about=\"http://example.org/factkb#A19\"/>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#B19\"/></owl:unionOf></owl:Class>"
                + "<owl:Class><owl:unionOf rdf:parseType=\"Collection\">"
                + "<owl:Class rdf:about=\"http://example.org/factkb#A20\"/>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#B20\"/></owl:unionOf></owl:Class>"
                + "<owl:Class><owl:unionOf rdf:parseType=\"Collection\">"
                + "<owl:Class rdf:about=\"http://example.org/factkb#A21\"/>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#B21\"/></owl:unionOf></owl:Class>"
                + "<owl:Class><owl:unionOf rdf:parseType=\"Collection\">"
                + "<owl:Class rdf:about=\"http://example.org/factkb#A22\"/>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#B22\"/></owl:unionOf></owl:Class>"
                + "<owl:Class><owl:unionOf rdf:parseType=\"Collection\">"
                + "<owl:Class rdf:about=\"http://example.org/factkb#A23\"/>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#B23\"/></owl:unionOf></owl:Class>"
                + "<owl:Class><owl:unionOf rdf:parseType=\"Collection\">"
                + "<owl:Class rdf:about=\"http://example.org/factkb#A24\"/>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#B24\"/></owl:unionOf></owl:Class>"
                + "<owl:Class><owl:unionOf rdf:parseType=\"Collection\">"
                + "<owl:Class rdf:about=\"http://example.org/factkb#A25\"/>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#B25\"/></owl:unionOf></owl:Class>"
                + "<owl:Class><owl:unionOf rdf:parseType=\"Collection\">"
                + "<owl:Class rdf:about=\"http://example.org/factkb#A26\"/>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#B26\"/></owl:unionOf></owl:Class>"
                + "<owl:Class><owl:unionOf rdf:parseType=\"Collection\">"
                + "<owl:Class rdf:about=\"http://example.org/factkb#A27\"/>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#B27\"/></owl:unionOf></owl:Class>"
                + "<owl:Class><owl:unionOf rdf:parseType=\"Collection\">"
                + "<owl:Class rdf:about=\"http://example.org/factkb#A28\"/>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#B28\"/></owl:unionOf></owl:Class>"
                + "<owl:Class><owl:unionOf rdf:parseType=\"Collection\">"
                + "<owl:Class rdf:about=\"http://example.org/factkb#A29\"/>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#B29\"/></owl:unionOf></owl:Class>"
                + "<owl:Class><owl:unionOf rdf:parseType=\"Collection\">"
                + "<owl:Class rdf:about=\"http://example.org/factkb#A30\"/>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#B30\"/></owl:unionOf></owl:Class>"
                + "<owl:Class><owl:unionOf rdf:parseType=\"Collection\">"
                + "<owl:Class rdf:about=\"http://example.org/factkb#A31\"/>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#B31\"/></owl:unionOf></owl:Class></owl:intersectionOf></owl:Class></rdfs:subClassOf></owl:Class>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#C2\"><rdfs:subClassOf>"
                + "<owl:Class><owl:intersectionOf rdf:parseType=\"Collection\">"
                + "<owl:Class><owl:unionOf rdf:parseType=\"Collection\">"
                + "<owl:Class rdf:about=\"http://example.org/factkb#A\"/>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#B\"/></owl:unionOf></owl:Class>"
                + "<owl:Class><owl:unionOf rdf:parseType=\"Collection\">"
                + "<owl:Class rdf:about=\"http://example.org/factkb#A\"/>"
                + "<owl:Class><owl:complementOf>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#B\"/></owl:complementOf></owl:Class></owl:unionOf></owl:Class></owl:intersectionOf></owl:Class></rdfs:subClassOf></owl:Class>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#C3\"><rdfs:subClassOf>"
                + "<owl:Class><owl:intersectionOf rdf:parseType=\"Collection\">"
                + "<owl:Class><owl:unionOf rdf:parseType=\"Collection\">"
                + "<owl:Class><owl:complementOf>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#A\"/></owl:complementOf></owl:Class>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#B\"/></owl:unionOf></owl:Class>"
                + "<owl:Class><owl:unionOf rdf:parseType=\"Collection\">"
                + "<owl:Class><owl:complementOf>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#A\"/></owl:complementOf></owl:Class>"
                + "<owl:Class><owl:complementOf>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#B\"/></owl:complementOf></owl:Class></owl:unionOf></owl:Class></owl:intersectionOf></owl:Class></rdfs:subClassOf></owl:Class>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#C4\"><rdfs:subClassOf><owl:Restriction><owl:onProperty rdf:resource=\"http://example.org/factkb#R\"/><owl:someValuesFrom>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#C2\"/></owl:someValuesFrom></owl:Restriction></rdfs:subClassOf></owl:Class>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#C5\"><rdfs:subClassOf><owl:Restriction><owl:onProperty rdf:resource=\"http://example.org/factkb#R\"/><owl:allValuesFrom>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#C3\"/></owl:allValuesFrom></owl:Restriction></rdfs:subClassOf></owl:Class>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#A10\"/>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#A11\"/>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#A12\"/>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#A13\"/>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#A14\"/>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#A15\"/>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#A16\"/>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#A17\"/>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#A18\"/>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#A19\"/>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#A20\"/>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#A21\"/>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#A22\"/>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#A23\"/>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#A24\"/>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#A25\"/>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#A26\"/>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#A27\"/>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#A28\"/>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#A29\"/>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#A30\"/>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#A31\"/>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#B10\"/>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#B11\"/>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#B12\"/>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#B13\"/>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#B14\"/>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#B15\"/>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#B16\"/>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#B17\"/>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#B18\"/>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#B19\"/>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#B20\"/>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#B21\"/>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#B22\"/>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#B23\"/>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#B24\"/>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#B25\"/>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#B26\"/>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#B27\"/>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#B28\"/>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#B29\"/>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#B30\"/>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#B31\"/>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#TEST\"><rdfs:subClassOf>"
                + "<owl:Class><owl:intersectionOf rdf:parseType=\"Collection\">"
                + "<owl:Class rdf:about=\"http://example.org/factkb#C1\"/>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#C4\"/>"
                + "<owl:Class rdf:about=\"http://example.org/factkb#C5\"/></owl:intersectionOf></owl:Class></rdfs:subClassOf></owl:Class><owl:ObjectProperty rdf:about=\"http://example.org/factkb#R\"/><eg:TEST/></rdf:RDF>";
        __CLR4_5_2b5lb5llvico2bi.R.inc(14603);test(premiseOntology, false, false, false, true);
    }finally{__CLR4_5_2b5lb5llvico2bi.R.flushNeeded();}}

    @Test
    public void testURIResolverTestCase3AWebOnt2Ddescription2Dlogic2D101() {__CLR4_5_2b5lb5llvico2bi.R.globalSliceStart(getClass().getName(),14604);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2t6acfgb9o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2b5lb5llvico2bi.R.rethrow($CLV_t2$);}finally{__CLR4_5_2b5lb5llvico2bi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile2TestCase.testURIResolverTestCase3AWebOnt2Ddescription2Dlogic2D101",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14604,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2t6acfgb9o(){try{__CLR4_5_2b5lb5llvico2bi.R.inc(14604);
        __CLR4_5_2b5lb5llvico2bi.R.inc(14605);String premiseOntology = head2
                + "<owl:Ontology rdf:about=\"\"/>"
                + "<owl:Class rdf:about=\"urn:test#Unsatisfiable\"><owl:equivalentClass>"
                + "<owl:Class><owl:intersectionOf rdf:parseType=\"Collection\">"
                + "<owl:Class rdf:about=\"urn:test#c\"/>"
                + "<owl:Class rdf:about=\"urn:test#d\"/></owl:intersectionOf></owl:Class></owl:equivalentClass></owl:Class>"
                + "<owl:Class rdf:about=\"urn:test#c\"><rdfs:subClassOf>"
                + "<owl:Class><owl:complementOf>"
                + "<owl:Class rdf:about=\"urn:test#d\"/></owl:complementOf></owl:Class></rdfs:subClassOf></owl:Class>"
                + "<owl:Class rdf:about=\"urn:test#d\"/>"
                + "<owl:Class rdf:about=\"urn:test#f\"><rdfs:subClassOf>"
                + "<owl:Class rdf:about=\"urn:test#d\"/></rdfs:subClassOf></owl:Class>"
                + "<owl:Class rdf:about=\"urn:test#c1\"><rdfs:subClassOf>"
                + "<owl:Class rdf:about=\"urn:test#d1\"/></rdfs:subClassOf><rdfs:subClassOf>"
                + "<owl:Class><owl:complementOf>"
                + "<owl:Class rdf:about=\"urn:test#d1\"/></owl:complementOf></owl:Class></rdfs:subClassOf></owl:Class>"
                + "<owl:Class rdf:about=\"urn:test#d1\"/>"
                + "<owl:Class rdf:about=\"urn:test#e3\"><rdfs:subClassOf>"
                + "<owl:Class rdf:about=\"urn:test#c\"/></rdfs:subClassOf></owl:Class><owl:ObjectProperty rdf:about=\"urn:test#r\"/><rdf:Description><rdf:type rdf:resource=\"urn:test#Unsatisfiable\"/></rdf:Description></rdf:RDF>";
        __CLR4_5_2b5lb5llvico2bi.R.inc(14606);test(premiseOntology, false, false, true, true);
    }finally{__CLR4_5_2b5lb5llvico2bi.R.flushNeeded();}}

    @Test
    public void testURIResolverTestCase3AWebOnt2Ddescription2Dlogic2D102() {__CLR4_5_2b5lb5llvico2bi.R.globalSliceStart(getClass().getName(),14607);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pxadmzb9r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2b5lb5llvico2bi.R.rethrow($CLV_t2$);}finally{__CLR4_5_2b5lb5llvico2bi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile2TestCase.testURIResolverTestCase3AWebOnt2Ddescription2Dlogic2D102",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14607,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pxadmzb9r(){try{__CLR4_5_2b5lb5llvico2bi.R.inc(14607);
        __CLR4_5_2b5lb5llvico2bi.R.inc(14608);String premiseOntology = head2
                + "<owl:Ontology rdf:about=\"\"/>"
                + "<owl:Class rdf:about=\"urn:test#Unsatisfiable\"><owl:equivalentClass>"
                + "<owl:Class><owl:intersectionOf rdf:parseType=\"Collection\"><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#r\"/><owl:allValuesFrom>"
                + "<owl:Class><owl:intersectionOf rdf:parseType=\"Collection\">"
                + "<owl:Class rdf:about=\"urn:test#c\"/>"
                + "<owl:Class rdf:about=\"urn:test#d\"/></owl:intersectionOf></owl:Class></owl:allValuesFrom></owl:Restriction><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#r\"/><owl:someValuesFrom>"
                + "<owl:Class rdf:about=\"http://www.w3.org/2002/07/owl#Thing\"/></owl:someValuesFrom></owl:Restriction></owl:intersectionOf></owl:Class></owl:equivalentClass></owl:Class>"
                + "<owl:Class rdf:about=\"urn:test#c\"><rdfs:subClassOf>"
                + "<owl:Class><owl:complementOf>"
                + "<owl:Class rdf:about=\"urn:test#d\"/></owl:complementOf></owl:Class></rdfs:subClassOf></owl:Class>"
                + "<owl:Class rdf:about=\"urn:test#d\"/>"
                + "<owl:Class rdf:about=\"urn:test#f\"><rdfs:subClassOf>"
                + "<owl:Class rdf:about=\"urn:test#d\"/></rdfs:subClassOf></owl:Class>"
                + "<owl:Class rdf:about=\"urn:test#c1\"><rdfs:subClassOf>"
                + "<owl:Class rdf:about=\"urn:test#d1\"/></rdfs:subClassOf><rdfs:subClassOf>"
                + "<owl:Class><owl:complementOf>"
                + "<owl:Class rdf:about=\"urn:test#d1\"/></owl:complementOf></owl:Class></rdfs:subClassOf></owl:Class>"
                + "<owl:Class rdf:about=\"urn:test#d1\"/>"
                + "<owl:Class rdf:about=\"urn:test#e3\"><rdfs:subClassOf>"
                + "<owl:Class rdf:about=\"urn:test#c\"/></rdfs:subClassOf></owl:Class><owl:ObjectProperty rdf:about=\"urn:test#r\"/><rdf:Description><rdf:type rdf:resource=\"urn:test#Unsatisfiable\"/></rdf:Description></rdf:RDF>";
        __CLR4_5_2b5lb5llvico2bi.R.inc(14609);test(premiseOntology, false, false, false, true);
    }finally{__CLR4_5_2b5lb5llvico2bi.R.flushNeeded();}}

    @Test
    public void testURIResolverTestCase3AWebOnt2Ddescription2Dlogic2D103() {__CLR4_5_2b5lb5llvico2bi.R.globalSliceStart(getClass().getName(),14610);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2moaeuib9u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2b5lb5llvico2bi.R.rethrow($CLV_t2$);}finally{__CLR4_5_2b5lb5llvico2bi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile2TestCase.testURIResolverTestCase3AWebOnt2Ddescription2Dlogic2D103",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14610,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2moaeuib9u(){try{__CLR4_5_2b5lb5llvico2bi.R.inc(14610);
        __CLR4_5_2b5lb5llvico2bi.R.inc(14611);String premiseOntology = head2
                + "<owl:Ontology rdf:about=\"\"/>"
                + "<owl:Class rdf:about=\"urn:test#Unsatisfiable\"><owl:equivalentClass>"
                + "<owl:Class><owl:intersectionOf rdf:parseType=\"Collection\">"
                + "<owl:Class rdf:about=\"urn:test#e3\"/>"
                + "<owl:Class rdf:about=\"urn:test#f\"/></owl:intersectionOf></owl:Class></owl:equivalentClass></owl:Class>"
                + "<owl:Class rdf:about=\"urn:test#c\"><rdfs:subClassOf>"
                + "<owl:Class><owl:complementOf>"
                + "<owl:Class rdf:about=\"urn:test#d\"/></owl:complementOf></owl:Class></rdfs:subClassOf></owl:Class>"
                + "<owl:Class rdf:about=\"urn:test#d\"/>"
                + "<owl:Class rdf:about=\"urn:test#f\"><rdfs:subClassOf>"
                + "<owl:Class rdf:about=\"urn:test#d\"/></rdfs:subClassOf></owl:Class>"
                + "<owl:Class rdf:about=\"urn:test#c1\"><rdfs:subClassOf>"
                + "<owl:Class rdf:about=\"urn:test#d1\"/></rdfs:subClassOf><rdfs:subClassOf>"
                + "<owl:Class><owl:complementOf>"
                + "<owl:Class rdf:about=\"urn:test#d1\"/></owl:complementOf></owl:Class></rdfs:subClassOf></owl:Class>"
                + "<owl:Class rdf:about=\"urn:test#d1\"/>"
                + "<owl:Class rdf:about=\"urn:test#e3\"><rdfs:subClassOf>"
                + "<owl:Class rdf:about=\"urn:test#c\"/></rdfs:subClassOf></owl:Class><owl:ObjectProperty rdf:about=\"urn:test#r\"/><rdf:Description><rdf:type rdf:resource=\"urn:test#Unsatisfiable\"/></rdf:Description></rdf:RDF>";
        __CLR4_5_2b5lb5llvico2bi.R.inc(14612);test(premiseOntology, false, false, true, true);
    }finally{__CLR4_5_2b5lb5llvico2bi.R.flushNeeded();}}

    @Test
    public void testURIResolverTestCase3AWebOnt2Ddescription2Dlogic2D105() {__CLR4_5_2b5lb5llvico2bi.R.globalSliceStart(getClass().getName(),14613);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2g6ah9kb9x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2b5lb5llvico2bi.R.rethrow($CLV_t2$);}finally{__CLR4_5_2b5lb5llvico2bi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile2TestCase.testURIResolverTestCase3AWebOnt2Ddescription2Dlogic2D105",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14613,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2g6ah9kb9x(){try{__CLR4_5_2b5lb5llvico2bi.R.inc(14613);
        __CLR4_5_2b5lb5llvico2bi.R.inc(14614);String premiseOntology = head2
                + "<owl:Ontology rdf:about=\"\"/>"
                + "<owl:Class rdf:about=\"urn:test#Unsatisfiable\"><owl:equivalentClass>"
                + "<owl:Class><owl:intersectionOf rdf:parseType=\"Collection\"><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#r\"/><owl:minCardinality rdf:datatype=\"http://www.w3.org/2001/XMLSchema#nonNegativeInteger\">2</owl:minCardinality></owl:Restriction><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#r\"/><owl:maxCardinality rdf:datatype=\"http://www.w3.org/2001/XMLSchema#nonNegativeInteger\">1</owl:maxCardinality></owl:Restriction></owl:intersectionOf></owl:Class></owl:equivalentClass></owl:Class>"
                + "<owl:Class rdf:about=\"urn:test#c\"><rdfs:subClassOf>"
                + "<owl:Class><owl:complementOf>"
                + "<owl:Class rdf:about=\"urn:test#d\"/></owl:complementOf></owl:Class></rdfs:subClassOf></owl:Class>"
                + "<owl:Class rdf:about=\"urn:test#d\"/><owl:ObjectProperty rdf:about=\"urn:test#r\"/><rdf:Description><rdf:type rdf:resource=\"urn:test#Unsatisfiable\"/></rdf:Description></rdf:RDF>";
        __CLR4_5_2b5lb5llvico2bi.R.inc(14615);test(premiseOntology, false, false, false, true);
    }finally{__CLR4_5_2b5lb5llvico2bi.R.flushNeeded();}}

    @Test
    public void testURIResolverTestCase3AWebOnt2Ddescription2Dlogic2D106() {__CLR4_5_2b5lb5llvico2bi.R.globalSliceStart(getClass().getName(),14616);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cxaih3ba0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2b5lb5llvico2bi.R.rethrow($CLV_t2$);}finally{__CLR4_5_2b5lb5llvico2bi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile2TestCase.testURIResolverTestCase3AWebOnt2Ddescription2Dlogic2D106",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14616,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cxaih3ba0(){try{__CLR4_5_2b5lb5llvico2bi.R.inc(14616);
        __CLR4_5_2b5lb5llvico2bi.R.inc(14617);String premiseOntology = head2
                + "<owl:Ontology rdf:about=\"\"/>"
                + "<owl:Class rdf:about=\"urn:test#Unsatisfiable\"><owl:equivalentClass>"
                + "<owl:Class><owl:intersectionOf rdf:parseType=\"Collection\"><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#r\"/><owl:maxCardinality rdf:datatype=\"http://www.w3.org/2001/XMLSchema#nonNegativeInteger\">1</owl:maxCardinality></owl:Restriction><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#r\"/><owl:someValuesFrom>"
                + "<owl:Class rdf:about=\"urn:test#c\"/></owl:someValuesFrom></owl:Restriction><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#r\"/><owl:someValuesFrom>"
                + "<owl:Class rdf:about=\"urn:test#d\"/></owl:someValuesFrom></owl:Restriction></owl:intersectionOf></owl:Class></owl:equivalentClass></owl:Class>"
                + "<owl:Class rdf:about=\"urn:test#c\"><rdfs:subClassOf>"
                + "<owl:Class><owl:complementOf>"
                + "<owl:Class rdf:about=\"urn:test#d\"/></owl:complementOf></owl:Class></rdfs:subClassOf></owl:Class>"
                + "<owl:Class rdf:about=\"urn:test#d\"/><owl:ObjectProperty rdf:about=\"urn:test#r\"/><rdf:Description><rdf:type rdf:resource=\"urn:test#Unsatisfiable\"/></rdf:Description></rdf:RDF>";
        __CLR4_5_2b5lb5llvico2bi.R.inc(14618);test(premiseOntology, false, false, false, true);
    }finally{__CLR4_5_2b5lb5llvico2bi.R.flushNeeded();}}

    @Test
    public void testURIResolverTestCase3AWebOnt2Ddescription2Dlogic2D109() {__CLR4_5_2b5lb5llvico2bi.R.globalSliceStart(getClass().getName(),14619);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_236am3oba3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2b5lb5llvico2bi.R.rethrow($CLV_t2$);}finally{__CLR4_5_2b5lb5llvico2bi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile2TestCase.testURIResolverTestCase3AWebOnt2Ddescription2Dlogic2D109",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14619,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_236am3oba3(){try{__CLR4_5_2b5lb5llvico2bi.R.inc(14619);
        __CLR4_5_2b5lb5llvico2bi.R.inc(14620);String premiseOntology = head2
                + "<owl:Ontology rdf:about=\"\"/>"
                + "<owl:Class rdf:about=\"urn:test#Unsatisfiable\"><owl:equivalentClass>"
                + "<owl:Class><owl:intersectionOf rdf:parseType=\"Collection\"><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#tt\"/><owl:allValuesFrom>"
                + "<owl:Class rdf:about=\"urn:test#a\"/></owl:allValuesFrom></owl:Restriction><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#tt\"/><owl:minCardinality rdf:datatype=\"http://www.w3.org/2001/XMLSchema#nonNegativeInteger\">3</owl:minCardinality></owl:Restriction><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#tt\"/><owl:maxCardinality rdf:datatype=\"http://www.w3.org/2001/XMLSchema#nonNegativeInteger\">1</owl:maxCardinality></owl:Restriction><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#tt\"/><owl:maxCardinality rdf:datatype=\"http://www.w3.org/2001/XMLSchema#nonNegativeInteger\">1</owl:maxCardinality></owl:Restriction></owl:intersectionOf></owl:Class></owl:equivalentClass></owl:Class>"
                + "<owl:Class rdf:about=\"urn:test#a\"><rdfs:subClassOf>"
                + "<owl:Class><owl:unionOf rdf:parseType=\"Collection\">"
                + "<owl:Class rdf:about=\"urn:test#c\"/>"
                + "<owl:Class rdf:about=\"urn:test#d\"/></owl:unionOf></owl:Class></rdfs:subClassOf></owl:Class>"
                + "<owl:Class rdf:about=\"urn:test#c\"><rdfs:subClassOf>"
                + "<owl:Class><owl:complementOf>"
                + "<owl:Class rdf:about=\"urn:test#d\"/></owl:complementOf></owl:Class></rdfs:subClassOf></owl:Class>"
                + "<owl:Class rdf:about=\"urn:test#d\"/><owl:ObjectProperty rdf:about=\"urn:test#tt\"/><rdf:Description><rdf:type rdf:resource=\"urn:test#Unsatisfiable\"/></rdf:Description></rdf:RDF>";
        __CLR4_5_2b5lb5llvico2bi.R.inc(14621);test(premiseOntology, false, false, false, true);
    }finally{__CLR4_5_2b5lb5llvico2bi.R.flushNeeded();}}

    @Test
    public void testURIResolverTestCase3AWebOnt2Ddescription2Dlogic2D110() {__CLR4_5_2b5lb5llvico2bi.R.globalSliceStart(getClass().getName(),14622);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22pfeoeba6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2b5lb5llvico2bi.R.rethrow($CLV_t2$);}finally{__CLR4_5_2b5lb5llvico2bi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile2TestCase.testURIResolverTestCase3AWebOnt2Ddescription2Dlogic2D110",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14622,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22pfeoeba6(){try{__CLR4_5_2b5lb5llvico2bi.R.inc(14622);
        __CLR4_5_2b5lb5llvico2bi.R.inc(14623);String premiseOntology = head2
                + "<owl:Ontology rdf:about=\"\"/>"
                + "<owl:Class rdf:about=\"urn:test#Unsatisfiable\"><owl:equivalentClass>"
                + "<owl:Class><owl:intersectionOf rdf:parseType=\"Collection\"><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#r\"/><owl:someValuesFrom>"
                + "<owl:Class><owl:complementOf>"
                + "<owl:Class rdf:about=\"urn:test#e\"/></owl:complementOf></owl:Class></owl:someValuesFrom></owl:Restriction><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#r\"/><owl:allValuesFrom>"
                + "<owl:Class rdf:about=\"urn:test#d\"/></owl:allValuesFrom></owl:Restriction><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#r\"/><owl:allValuesFrom>"
                + "<owl:Class><owl:unionOf rdf:parseType=\"Collection\">"
                + "<owl:Class rdf:about=\"urn:test#e\"/>"
                + "<owl:Class><owl:complementOf>"
                + "<owl:Class rdf:about=\"urn:test#d\"/></owl:complementOf></owl:Class></owl:unionOf></owl:Class></owl:allValuesFrom></owl:Restriction></owl:intersectionOf></owl:Class></owl:equivalentClass></owl:Class>"
                + "<owl:Class rdf:about=\"urn:test#c\"><rdfs:subClassOf>"
                + "<owl:Class><owl:complementOf>"
                + "<owl:Class rdf:about=\"urn:test#d\"/></owl:complementOf></owl:Class></rdfs:subClassOf></owl:Class>"
                + "<owl:Class rdf:about=\"urn:test#d\"/>"
                + "<owl:Class rdf:about=\"urn:test#e\"/><owl:ObjectProperty rdf:about=\"urn:test#r\"/><owl:ObjectProperty rdf:about=\"urn:test#s\"/><rdf:Description><rdf:type rdf:resource=\"urn:test#Unsatisfiable\"/></rdf:Description></rdf:RDF>";
        __CLR4_5_2b5lb5llvico2bi.R.inc(14624);test(premiseOntology, false, false, false, true);
    }finally{__CLR4_5_2b5lb5llvico2bi.R.flushNeeded();}}

    @Test
    public void testURIResolverTestCase3AWebOnt2Ddescription2Dlogic2D111() {__CLR4_5_2b5lb5llvico2bi.R.globalSliceStart(getClass().getName(),14625);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jkk43ba9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2b5lb5llvico2bi.R.rethrow($CLV_t2$);}finally{__CLR4_5_2b5lb5llvico2bi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile2TestCase.testURIResolverTestCase3AWebOnt2Ddescription2Dlogic2D111",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14625,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jkk43ba9(){try{__CLR4_5_2b5lb5llvico2bi.R.inc(14625);
        __CLR4_5_2b5lb5llvico2bi.R.inc(14626);String premiseOntology = head2
                + "<owl:Ontology rdf:about=\"\"/>"
                + "<owl:Class rdf:about=\"urn:test#Unsatisfiable\"><owl:equivalentClass>"
                + "<owl:Class><owl:intersectionOf rdf:parseType=\"Collection\"><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#r\"/><owl:someValuesFrom>"
                + "<owl:Class><owl:complementOf><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#s\"/><owl:maxCardinality rdf:datatype=\"http://www.w3.org/2001/XMLSchema#nonNegativeInteger\">1</owl:maxCardinality></owl:Restriction></owl:complementOf></owl:Class></owl:someValuesFrom></owl:Restriction><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#r\"/><owl:allValuesFrom>"
                + "<owl:Class><owl:unionOf rdf:parseType=\"Collection\">"
                + "<owl:Class rdf:about=\"urn:test#c\"/>"
                + "<owl:Class><owl:complementOf><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#s\"/><owl:minCardinality rdf:datatype=\"http://www.w3.org/2001/XMLSchema#nonNegativeInteger\">2</owl:minCardinality></owl:Restriction></owl:complementOf></owl:Class></owl:unionOf></owl:Class></owl:allValuesFrom></owl:Restriction><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#r\"/><owl:allValuesFrom>"
                + "<owl:Class rdf:about=\"urn:test#d\"/></owl:allValuesFrom></owl:Restriction></owl:intersectionOf></owl:Class></owl:equivalentClass></owl:Class>"
                + "<owl:Class rdf:about=\"urn:test#c\"><rdfs:subClassOf>"
                + "<owl:Class><owl:complementOf>"
                + "<owl:Class rdf:about=\"urn:test#d\"/></owl:complementOf></owl:Class></rdfs:subClassOf></owl:Class>"
                + "<owl:Class rdf:about=\"urn:test#d\"/>"
                + "<owl:Class rdf:about=\"urn:test#e\"/><owl:ObjectProperty rdf:about=\"urn:test#r\"/><owl:ObjectProperty rdf:about=\"urn:test#s\"/><rdf:Description><rdf:type rdf:resource=\"urn:test#Unsatisfiable\"/></rdf:Description></rdf:RDF>";
        __CLR4_5_2b5lb5llvico2bi.R.inc(14627);test(premiseOntology, false, false, false, true);
    }finally{__CLR4_5_2b5lb5llvico2bi.R.flushNeeded();}}

    @Test
    public void testURIResolverTestCase3AWebOnt2Ddescription2Dlogic2D207() {__CLR4_5_2b5lb5llvico2bi.R.globalSliceStart(getClass().getName(),14628);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bt58jpbac();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2b5lb5llvico2bi.R.rethrow($CLV_t2$);}finally{__CLR4_5_2b5lb5llvico2bi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile2TestCase.testURIResolverTestCase3AWebOnt2Ddescription2Dlogic2D207",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14628,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bt58jpbac(){try{__CLR4_5_2b5lb5llvico2bi.R.inc(14628);
        __CLR4_5_2b5lb5llvico2bi.R.inc(14629);String premiseOntology = "<rdf:RDF xml:base=\"urn:test\" xmlns:oiled=\"urn:test#\" xmlns:owl=\"http://www.w3.org/2002/07/owl#\" xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\" xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\"><owl:Ontology rdf:about=\"\"/>"
                + "<owl:Class rdf:about=\"urn:test#C10\"><owl:equivalentClass>"
                + "<owl:Class><owl:intersectionOf rdf:parseType=\"Collection\">"
                + "<owl:Class rdf:about=\"urn:test#C2\"/>"
                + "<owl:Class rdf:about=\"urn:test#C4\"/></owl:intersectionOf></owl:Class></owl:equivalentClass></owl:Class>"
                + "<owl:Class rdf:about=\"urn:test#C12\"><owl:equivalentClass><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#R1\"/><owl:someValuesFrom>"
                + "<owl:Class rdf:about=\"urn:test#C10\"/></owl:someValuesFrom></owl:Restriction></owl:equivalentClass></owl:Class>"
                + "<owl:Class rdf:about=\"urn:test#C2\"/>"
                + "<owl:Class rdf:about=\"urn:test#C4\"/>"
                + "<owl:Class rdf:about=\"urn:test#C6\"><owl:equivalentClass>"
                + "<owl:Class><owl:intersectionOf rdf:parseType=\"Collection\">"
                + "<owl:Class><owl:complementOf>"
                + "<owl:Class rdf:about=\"urn:test#C2\"/></owl:complementOf></owl:Class>"
                + "<owl:Class rdf:about=\"urn:test#C4\"/></owl:intersectionOf></owl:Class></owl:equivalentClass></owl:Class>"
                + "<owl:Class rdf:about=\"urn:test#C8\"><owl:equivalentClass><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#R1\"/><owl:someValuesFrom>"
                + "<owl:Class rdf:about=\"urn:test#C6\"/></owl:someValuesFrom></owl:Restriction></owl:equivalentClass></owl:Class>"
                + "<owl:Class rdf:about=\"urn:test#TEST\"><owl:equivalentClass>"
                + "<owl:Class><owl:intersectionOf rdf:parseType=\"Collection\">"
                + "<owl:Class><owl:complementOf>"
                + "<owl:Class rdf:about=\"urn:test#C8\"/></owl:complementOf></owl:Class>"
                + "<owl:Class rdf:about=\"urn:test#C12\"/></owl:intersectionOf></owl:Class></owl:equivalentClass></owl:Class><owl:ObjectProperty rdf:about=\"urn:test#R1\"/><owl:Thing rdf:about=\"urn:test#V21080\"><rdf:type>"
                + "<owl:Class rdf:about=\"urn:test#TEST\"/></rdf:type><rdf:type>"
                + "<owl:Class><owl:complementOf>"
                + "<owl:Class rdf:about=\"urn:test#C8\"/></owl:complementOf></owl:Class></rdf:type><rdf:type><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#R1\"/><owl:allValuesFrom>"
                + "<owl:Class><owl:complementOf>"
                + "<owl:Class rdf:about=\"urn:test#C6\"/></owl:complementOf></owl:Class></owl:allValuesFrom></owl:Restriction></rdf:type><oiled:R1 rdf:resource=\"urn:test#V21081\"/></owl:Thing><owl:Thing rdf:about=\"urn:test#V21081\"><rdf:type>"
                + "<owl:Class rdf:about=\"urn:test#C4\"/></rdf:type><rdf:type>"
                + "<owl:Class rdf:about=\"urn:test#C2\"/></rdf:type><rdf:type>"
                + "<owl:Class><owl:complementOf>"
                + "<owl:Class rdf:about=\"urn:test#C6\"/></owl:complementOf></owl:Class></rdf:type></owl:Thing></rdf:RDF>";
        __CLR4_5_2b5lb5llvico2bi.R.inc(14630);test(premiseOntology, false, false, false, true);
    }finally{__CLR4_5_2b5lb5llvico2bi.R.flushNeeded();}}
}
