/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.semanticweb.owlapi.profiles.test;

import org.junit.Ignore;
import org.junit.Test;

@SuppressWarnings("javadoc")
public class Profile1TestCase extends ProfileBase {static class __CLR4_5_2apnapnlvico2an{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,14457,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testURIResolverDatatype2Drestrictions2Ddifferent2Dtypes() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),13883);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27lwp2capn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverDatatype2Drestrictions2Ddifferent2Dtypes",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13883,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27lwp2capn(){try{__CLR4_5_2apnapnlvico2an.R.inc(13883);
        __CLR4_5_2apnapnlvico2an.R.inc(13884);String premiseOntology = "Prefix(:=<http://example.org/>) Prefix(xsd:=<http://www.w3.org/2001/XMLSchema#>) Ontology( Declaration(NamedIndividual(:a)) Declaration(DataProperty(:dp)) Declaration(Class(:A)) SubClassOf(:A DataAllValuesFrom(:dp DataOneOf(\"3\"^^xsd:integer \"4\"^^xsd:int)) ) SubClassOf(:A DataAllValuesFrom(:dp DataOneOf(\"2\"^^xsd:short \"3\"^^xsd:int)) ) ClassAssertion(:A :a) ClassAssertion(DataSomeValuesFrom(:dp DataOneOf(\"3\"^^xsd:integer)) :a ))";
        __CLR4_5_2apnapnlvico2an.R.inc(13885);test(premiseOntology, false, false, false, true);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverConsistent2Ddataproperty2Ddisjointness() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),13886);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2i8s8wfapq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverConsistent2Ddataproperty2Ddisjointness",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13886,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2i8s8wfapq(){try{__CLR4_5_2apnapnlvico2an.R.inc(13886);
        __CLR4_5_2apnapnlvico2an.R.inc(13887);String premiseOntology = "Prefix(:=<http://example.org/>) Prefix(xsd:=<http://www.w3.org/2001/XMLSchema#>) Ontology( Declaration(NamedIndividual(:a)) Declaration(DataProperty(:dp1)) Declaration(DataProperty(:dp2)) Declaration(Class(:A)) DisjointDataProperties(:dp1 :dp2) DataPropertyAssertion(:dp1 :a \"10\"^^xsd:integer) SubClassOf(:A DataSomeValuesFrom(:dp2 DatatypeRestriction(xsd:integer xsd:minInclusive \"18\"^^xsd:integer xsd:maxInclusive \"18\"^^xsd:integer) ) ) ClassAssertion(:A :a))";
        __CLR4_5_2apnapnlvico2an.R.inc(13888);test(premiseOntology, false, false, false, true);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverContradicting2Ddatatype2Drestrictions() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),13889);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28pkz6napt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverContradicting2Ddatatype2Drestrictions",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13889,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28pkz6napt(){try{__CLR4_5_2apnapnlvico2an.R.inc(13889);
        __CLR4_5_2apnapnlvico2an.R.inc(13890);String premiseOntology = "Prefix(:=<http://example.org/>) Prefix(xsd:=<http://www.w3.org/2001/XMLSchema#>) Ontology( Declaration(NamedIndividual(:a)) Declaration(DataProperty(:dp)) Declaration(Class(:A)) SubClassOf(:A DataAllValuesFrom(:dp DataOneOf(\"3\"^^xsd:integer \"4\"^^xsd:integer)) ) SubClassOf(:A DataAllValuesFrom(:dp DataOneOf(\"2\"^^xsd:integer \"3\"^^xsd:integer)) ) SubClassOf(:A DataSomeValuesFrom(:dp DatatypeRestriction(xsd:integer xsd:minInclusive \"4\"^^xsd:integer) ) ) ClassAssertion(:A :a))";
        __CLR4_5_2apnapnlvico2an.R.inc(13891);test(premiseOntology, false, false, false, true);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverContradicting2DdateTime2Drestrictions() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),13892);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23zm5jcapw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverContradicting2DdateTime2Drestrictions",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13892,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23zm5jcapw(){try{__CLR4_5_2apnapnlvico2an.R.inc(13892);
        __CLR4_5_2apnapnlvico2an.R.inc(13893);String premiseOntology = "Prefix(:=<http://example.org/>) Prefix(xsd:=<http://www.w3.org/2001/XMLSchema#>) Ontology( Declaration(NamedIndividual(:a)) Declaration(DataProperty(:dp)) Declaration(Class(:A)) SubClassOf(:A DataHasValue(:dp \"2007-10-08T20:44:11.656+01:00\"^^xsd:dateTime)) SubClassOf(:A DataAllValuesFrom(:dp DatatypeRestriction( xsd:dateTime xsd:minInclusive \"2008-07-08T20:44:11.656+01:00\"^^xsd:dateTime xsd:maxInclusive \"2008-10-08T20:44:11.656+01:00\"^^xsd:dateTime) ) ) ClassAssertion(:A :a))";
        __CLR4_5_2apnapnlvico2an.R.inc(13894);test(premiseOntology, false, false, false, true);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverDatatype2DFloat2DDiscrete2D001() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),13895);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vjtqnfapz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverDatatype2DFloat2DDiscrete2D001",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13895,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vjtqnfapz(){try{__CLR4_5_2apnapnlvico2an.R.inc(13895);
        __CLR4_5_2apnapnlvico2an.R.inc(13896);String premiseOntology = head2
            + "<owl:Ontology/><owl:DatatypeProperty rdf:about=\"urn:test#dp\" />"
            + "<rdf:Description rdf:about=\"urn:test#a\"><rdf:type><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#dp\" /><owl:someValuesFrom><rdfs:Datatype><owl:onDatatype rdf:resource=\"http://www.w3.org/2001/XMLSchema#float\" />"
            + "<owl:withRestrictions rdf:parseType=\"Collection\"><rdf:Description><xsd:minExclusive rdf:datatype=\"http://www.w3.org/2001/XMLSchema#float\">0.0</xsd:minExclusive></rdf:Description><rdf:Description><xsd:maxExclusive rdf:datatype=\"http://www.w3.org/2001/XMLSchema#float\">1.401298464324817e-45</xsd:maxExclusive></rdf:Description></owl:withRestrictions></rdfs:Datatype></owl:someValuesFrom></owl:Restriction></rdf:type></rdf:Description></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(13897);String fspremiseOntology = "Prefix( xsd:=<http://www.w3.org/2001/XMLSchema#> ) Prefix( ex:=<http://example.org/ontology/> ) Ontology( Declaration( DataProperty( ex:dp ) ) ClassAssertion( DataSomeValuesFrom( ex:dp DatatypeRestriction( xsd:float xsd:minExclusive \"0.0\"^^xsd:float xsd:maxExclusive \"1.401298464324817e-45\"^^xsd:float ) ) ex:a ))";
        __CLR4_5_2apnapnlvico2an.R.inc(13898);test(premiseOntology, false, false, false, true);
        __CLR4_5_2apnapnlvico2an.R.inc(13899);test(fspremiseOntology, false, false, false, true);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverDatatype2Drestriction2Dmin2Dmax2Dinconsistency() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),13900);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29nz2o0aq4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverDatatype2Drestriction2Dmin2Dmax2Dinconsistency",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13900,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29nz2o0aq4(){try{__CLR4_5_2apnapnlvico2an.R.inc(13900);
        __CLR4_5_2apnapnlvico2an.R.inc(13901);String premiseOntology = "Prefix(:=<http://example.org/>) Prefix(xsd:=<http://www.w3.org/2001/XMLSchema#>) Ontology( Declaration(NamedIndividual(:a)) Declaration(DataProperty(:dp)) Declaration(Class(:A)) SubClassOf(:A DataSomeValuesFrom(:dp DatatypeRestriction(xsd:integer xsd:minInclusive \"18\"^^xsd:integer)) ) SubClassOf(:A DataAllValuesFrom(:dp DatatypeRestriction(xsd:integer xsd:maxInclusive \"10\"^^xsd:integer)) ) ClassAssertion(:A :a))";
        __CLR4_5_2apnapnlvico2an.R.inc(13902);test(premiseOntology, false, false, false, true);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverDifferent2Dtypes2Dplus2Dcomplement() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),13903);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21a8oufaq7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverDifferent2Dtypes2Dplus2Dcomplement",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13903,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21a8oufaq7(){try{__CLR4_5_2apnapnlvico2an.R.inc(13903);
        __CLR4_5_2apnapnlvico2an.R.inc(13904);String premiseOntology = "Prefix(:=<http://example.org/>) Prefix(xsd:=<http://www.w3.org/2001/XMLSchema#>) Ontology( Declaration(NamedIndividual(:a)) Declaration(DataProperty(:dp)) Declaration(Class(:A)) SubClassOf(:A DataAllValuesFrom(:dp DataOneOf(\"3\"^^xsd:integer \"4\"^^xsd:int)) ) SubClassOf(:A DataAllValuesFrom(:dp DataOneOf(\"2\"^^xsd:short \"3\"^^xsd:integer)) ) ClassAssertion(:A :a) ClassAssertion(DataSomeValuesFrom(:dp DataComplementOf(DataOneOf(\"3\"^^xsd:integer))) :a ))";
        __CLR4_5_2apnapnlvico2an.R.inc(13905);test(premiseOntology, false, false, false, true);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverDisjointClasses2D002() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),13906);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28pvlibaqa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverDisjointClasses2D002",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13906,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28pvlibaqa(){try{__CLR4_5_2apnapnlvico2an.R.inc(13906);
        __CLR4_5_2apnapnlvico2an.R.inc(13907);String premiseOntology = example
            + "<owl:Ontology/>"
            + "<owl:Class rdf:about=\"Boy\" />"
            + "<owl:Class rdf:about=\"Girl\" /><rdf:Description rdf:about=\"Boy\"><owl:disjointWith rdf:resource=\"Girl\" /></rdf:Description><Boy rdf:about=\"Stewie\" /><Girl rdf:about=\"Stewie\" /></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(13908);String fspremiseOntology = "Prefix( :=<http://example.org/> ) Ontology( Declaration( Class( :Boy ) ) Declaration( Class( :Girl ) ) DisjointClasses( :Boy :Girl ) ClassAssertion( :Boy :Stewie ) ClassAssertion( :Girl :Stewie ))";
        __CLR4_5_2apnapnlvico2an.R.inc(13909);test(premiseOntology, true, true, true, true);
        __CLR4_5_2apnapnlvico2an.R.inc(13910);test(fspremiseOntology, true, true, true, true);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverInconsistent2Dbyte2Dfiller() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),13911);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2m9aireaqf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverInconsistent2Dbyte2Dfiller",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13911,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2m9aireaqf(){try{__CLR4_5_2apnapnlvico2an.R.inc(13911);
        __CLR4_5_2apnapnlvico2an.R.inc(13912);String premiseOntology = "Prefix(:=<http://example.org/>) Prefix(xsd:=<http://www.w3.org/2001/XMLSchema#>) Ontology( Declaration(NamedIndividual(:a)) Declaration(DataProperty(:dp)) Declaration(Class(:A)) SubClassOf(:A DataAllValuesFrom(:dp xsd:byte)) ClassAssertion(:A :a) ClassAssertion( DataSomeValuesFrom(:dp DataOneOf(\"6542145\"^^xsd:integer)) :a ))";
        __CLR4_5_2apnapnlvico2an.R.inc(13913);test(premiseOntology, false, false, false, true);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverDatacomplement2Dplus2Drestrictions() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),13914);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jfrcwsaqi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverDatacomplement2Dplus2Drestrictions",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13914,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jfrcwsaqi(){try{__CLR4_5_2apnapnlvico2an.R.inc(13914);
        __CLR4_5_2apnapnlvico2an.R.inc(13915);String premiseOntology = "Prefix(:=<http://example.org/>) Prefix(xsd:=<http://www.w3.org/2001/XMLSchema#>) Ontology( Declaration(NamedIndividual(:a)) Declaration(DataProperty(:dp)) Declaration(Class(:A)) SubClassOf(:A DataAllValuesFrom(:dp DataOneOf(\"3\"^^xsd:integer \"4\"^^xsd:integer)) ) SubClassOf(:A DataAllValuesFrom(:dp DataOneOf(\"2\"^^xsd:integer \"3\"^^xsd:integer)) )\n"
            + " ClassAssertion(:A :a) ClassAssertion(DataSomeValuesFrom(:dp DataComplementOf(DataOneOf(\"3\"^^xsd:integer))) :a))";
        __CLR4_5_2apnapnlvico2an.R.inc(13916);test(premiseOntology, false, false, false, true);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverInconsistent_datatypes() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),13917);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22osodqaql();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverInconsistent_datatypes",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13917,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22osodqaql(){try{__CLR4_5_2apnapnlvico2an.R.inc(13917);
        __CLR4_5_2apnapnlvico2an.R.inc(13918);String premiseOntology = "Prefix(:=<http://example.org/>) Prefix(xsd:=<http://www.w3.org/2001/XMLSchema#>) Ontology(\n"
            + " Declaration(NamedIndividual(:a)) Declaration(DataProperty(:dp)) Declaration(Class(:A)) SubClassOf(:A DataAllValuesFrom(:dp xsd:string)) SubClassOf(:A DataSomeValuesFrom(:dp xsd:integer)) ClassAssertion(:A :a))";
        __CLR4_5_2apnapnlvico2an.R.inc(13919);test(premiseOntology, false, false, false, true);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverMinus2Dinf2Dnot2Dowlreal() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),13920);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21j2rajaqo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverMinus2Dinf2Dnot2Dowlreal",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13920,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21j2rajaqo(){try{__CLR4_5_2apnapnlvico2an.R.inc(13920);
        __CLR4_5_2apnapnlvico2an.R.inc(13921);String premiseOntology = "Prefix(:=<http://example.org/>) Prefix(xsd:=<http://www.w3.org/2001/XMLSchema#>) Prefix(owl:=<http://www.w3.org/2002/07/owl#>) Ontology( Declaration(NamedIndividual(:a)) Declaration(DataProperty(:dp)) Declaration(Class(:A)) SubClassOf(:A DataAllValuesFrom(:dp owl:real)) SubClassOf(:A DataSomeValuesFrom(:dp DataOneOf(\"-INF\"^^xsd:float \"-0\"^^xsd:integer)) ) ClassAssertion(:A :a) NegativeDataPropertyAssertion(:dp :a \"0\"^^xsd:unsignedInt))";
        __CLR4_5_2apnapnlvico2an.R.inc(13922);test(premiseOntology, false, false, false, true);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverNew2DFeature2DAsymmetricProperty2D001() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),13923);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2iwympxaqr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverNew2DFeature2DAsymmetricProperty2D001",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13923,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2iwympxaqr(){try{__CLR4_5_2apnapnlvico2an.R.inc(13923);
        __CLR4_5_2apnapnlvico2an.R.inc(13924);String premiseOntology = example
            + "<owl:Ontology/><owl:ObjectProperty rdf:about=\"parentOf\" /><owl:AsymmetricProperty rdf:about=\"parentOf\" /><rdf:Description rdf:about=\"Peter\"><parentOf rdf:resource=\"Stewie\" /></rdf:Description><rdf:Description rdf:about=\"Stewie\"><parentOf rdf:resource=\"Peter\" /></rdf:Description></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(13925);String fspremiseOntology = "Prefix( :=<http://example.org/> ) Ontology( Declaration( ObjectProperty( :parentOf ) ) AsymmetricObjectProperty( :parentOf ) ObjectPropertyAssertion( :parentOf :Peter :Stewie ) ObjectPropertyAssertion( :parentOf :Stewie :Peter ))";
        __CLR4_5_2apnapnlvico2an.R.inc(13926);test(premiseOntology, false, true, true, true);
        __CLR4_5_2apnapnlvico2an.R.inc(13927);test(fspremiseOntology, false, true, true, true);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverNew2DFeature2DDisjointObjectProperties2D001() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),13928);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2i1epoiaqw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverNew2DFeature2DDisjointObjectProperties2D001",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13928,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2i1epoiaqw(){try{__CLR4_5_2apnapnlvico2an.R.inc(13928);
        __CLR4_5_2apnapnlvico2an.R.inc(13929);String premiseOntology = example
            + "<owl:Ontology/><owl:ObjectProperty rdf:about=\"hasFather\" /><owl:ObjectProperty rdf:about=\"hasMother\" /><rdf:Description rdf:about=\"hasFather\"><owl:propertyDisjointWith rdf:resource=\"hasMother\" /></rdf:Description><rdf:Description rdf:about=\"Stewie\"><hasFather rdf:resource=\"Peter\" /></rdf:Description><rdf:Description rdf:about=\"Stewie\"><hasMother rdf:resource=\"Lois\" /></rdf:Description></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(13930);String fspremiseOntology = "Prefix( :=<http://example.org/> ) Ontology( Declaration( ObjectProperty( :hasFather ) ) Declaration( ObjectProperty( :hasMother ) ) DisjointObjectProperties( :hasFather :hasMother ) ObjectPropertyAssertion( :hasFather :Stewie :Peter ) ObjectPropertyAssertion( :hasMother :Stewie :Lois ))";
        __CLR4_5_2apnapnlvico2an.R.inc(13931);test(premiseOntology, false, true, true, true);
        __CLR4_5_2apnapnlvico2an.R.inc(13932);test(fspremiseOntology, false, true, true, true);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverNew2DFeature2DDisjointObjectProperties2D002() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),13933);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2laeogzar1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverNew2DFeature2DDisjointObjectProperties2D002",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13933,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2laeogzar1(){try{__CLR4_5_2apnapnlvico2an.R.inc(13933);
        __CLR4_5_2apnapnlvico2an.R.inc(13934);String premiseOntology = example
            + "<owl:Ontology/><owl:ObjectProperty rdf:about=\"hasFather\" /><owl:ObjectProperty rdf:about=\"hasMother\" /><owl:ObjectProperty rdf:about=\"hasChild\" /><owl:AllDisjointProperties><owl:members rdf:parseType=\"Collection\"><rdf:Description rdf:about=\"hasFather\" /><rdf:Description rdf:about=\"hasMother\" /><rdf:Description rdf:about=\"hasChild\" /></owl:members></owl:AllDisjointProperties><rdf:Description rdf:about=\"Stewie\"><hasFather rdf:resource=\"Peter\" /></rdf:Description><rdf:Description rdf:about=\"Stewie\"><hasMother rdf:resource=\"Lois\" /></rdf:Description><rdf:Description rdf:about=\"Stewie\"><hasChild rdf:resource=\"StewieJr\" /></rdf:Description></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(13935);String fspremiseOntology = "Prefix( :=<http://example.org/> ) Ontology( Declaration( ObjectProperty( :hasFather ) ) Declaration( ObjectProperty( :hasMother ) ) Declaration( ObjectProperty( :hasChild ) ) DisjointObjectProperties( :hasFather :hasMother :hasChild ) ObjectPropertyAssertion( :hasFather :Stewie :Peter ) ObjectPropertyAssertion( :hasMother :Stewie :Lois ) ObjectPropertyAssertion( :hasChild :Stewie :StewieJr ))";
        __CLR4_5_2apnapnlvico2an.R.inc(13936);test(premiseOntology, false, true, true, true);
        __CLR4_5_2apnapnlvico2an.R.inc(13937);test(fspremiseOntology, false, true, true, true);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverNew2DFeature2DDisjointUnion2D001() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),13938);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qejp93ar6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverNew2DFeature2DDisjointUnion2D001",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13938,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qejp93ar6(){try{__CLR4_5_2apnapnlvico2an.R.inc(13938);
        __CLR4_5_2apnapnlvico2an.R.inc(13939);String premiseOntology = example
            + "<owl:Ontology/>"
            + "<owl:Class rdf:about=\"Child\" />"
            + "<owl:Class rdf:about=\"Boy\" />"
            + "<owl:Class rdf:about=\"Girl\" /><rdf:Description rdf:about=\"Child\"><owl:disjointUnionOf rdf:parseType=\"Collection\"><rdf:Description rdf:about=\"Boy\" /><rdf:Description rdf:about=\"Girl\" /></owl:disjointUnionOf></rdf:Description><Child rdf:about=\"Stewie\" /><rdf:Description rdf:about=\"Stewie\"><rdf:type>"
            + "<owl:Class><owl:complementOf rdf:resource=\"Girl\" /></owl:Class></rdf:type>\n"
            + "</rdf:Description></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(13940);String fspremiseOntology = "Prefix( :=<http://example.org/> ) Ontology(\n"
            + " Declaration( Class( :Child ) ) Declaration( Class( :Boy ) ) Declaration( Class( :Girl ) ) DisjointUnion( :Child :Boy :Girl ) ClassAssertion( :Child :Stewie ) ClassAssertion( ObjectComplementOf( :Girl ) :Stewie ))";
        __CLR4_5_2apnapnlvico2an.R.inc(13941);test(premiseOntology, false, false, false, true);
        __CLR4_5_2apnapnlvico2an.R.inc(13942);test(fspremiseOntology, false, false, false, true);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverNew2DFeature2DIrreflexiveProperty2D001() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),13943);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2f6k60sarb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverNew2DFeature2DIrreflexiveProperty2D001",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13943,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2f6k60sarb(){try{__CLR4_5_2apnapnlvico2an.R.inc(13943);
        __CLR4_5_2apnapnlvico2an.R.inc(13944);String premiseOntology = example
            + "<owl:Ontology/><owl:ObjectProperty rdf:about=\"marriedTo\" /><owl:IrreflexiveProperty rdf:about=\"marriedTo\" /><rdf:Description rdf:about=\"Peter\"><marriedTo rdf:resource=\"Peter\" /></rdf:Description></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(13945);String fspremiseOntology = "Prefix( :=<http://example.org/> ) Ontology( Declaration( ObjectProperty( :marriedTo ) ) IrreflexiveObjectProperty( :marriedTo ) ObjectPropertyAssertion( :marriedTo :Peter :Peter ))";
        __CLR4_5_2apnapnlvico2an.R.inc(13946);test(premiseOntology, false, true, true, true);
        __CLR4_5_2apnapnlvico2an.R.inc(13947);test(fspremiseOntology, false, true, true, true);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverNew2DFeature2DNegativeDataPropertyAssertion2D001() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),13948);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2r52vv6arg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverNew2DFeature2DNegativeDataPropertyAssertion2D001",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13948,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2r52vv6arg(){try{__CLR4_5_2apnapnlvico2an.R.inc(13948);
        __CLR4_5_2apnapnlvico2an.R.inc(13949);String premiseOntology = "Prefix( xsd:=<http://www.w3.org/2001/XMLSchema#> ) Prefix( :=<http://example.org/> ) Ontology( Declaration( DataProperty( :hasAge ) ) NegativeDataPropertyAssertion( :hasAge :Meg \"5\"^^xsd:integer ) DataPropertyAssertion( :hasAge :Meg \"5\"^^xsd:integer ))";
        __CLR4_5_2apnapnlvico2an.R.inc(13950);test(premiseOntology, true, false, true, true);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverNew2DFeature2DNegativeObjectPropertyAssertion2D001() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),13951);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2csqvrxarj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverNew2DFeature2DNegativeObjectPropertyAssertion2D001",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13951,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2csqvrxarj(){try{__CLR4_5_2apnapnlvico2an.R.inc(13951);
        __CLR4_5_2apnapnlvico2an.R.inc(13952);String fspremiseOntology = "Prefix( :=<http://example.org/> ) Ontology( Declaration( ObjectProperty( :hasSon ) ) NegativeObjectPropertyAssertion( :hasSon :Peter :Meg ) ObjectPropertyAssertion( :hasSon :Peter :Meg ))";
        __CLR4_5_2apnapnlvico2an.R.inc(13953);test(fspremiseOntology, true, false, true, true);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverNew2DFeature2DObjectPropertyChain2D001() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),13954);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2igbenjarm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverNew2DFeature2DObjectPropertyChain2D001",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13954,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2igbenjarm(){try{__CLR4_5_2apnapnlvico2an.R.inc(13954);
        __CLR4_5_2apnapnlvico2an.R.inc(13955);String premiseOntology = example
            + "<owl:Ontology/><owl:ObjectProperty rdf:about=\"hasMother\" /><owl:ObjectProperty rdf:about=\"hasSister\" /><owl:ObjectProperty rdf:about=\"hasAunt\" /><rdf:Description rdf:about=\"hasAunt\"><owl:propertyChainAxiom rdf:parseType=\"Collection\"><rdf:Description rdf:about=\"hasMother\" /><rdf:Description rdf:about=\"hasSister\" /></owl:propertyChainAxiom></rdf:Description><rdf:Description rdf:about=\"Stewie\"><hasMother rdf:resource=\"Lois\" /></rdf:Description><rdf:Description rdf:about=\"Lois\"><hasSister rdf:resource=\"Carol\" /></rdf:Description></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(13956);String fspremiseOntology = "Prefix( :=<http://example.org/> ) Ontology( Declaration( ObjectProperty( :hasMother ) ) Declaration( ObjectProperty( :hasSister ) ) Declaration( ObjectProperty( :hasAunt ) ) SubObjectPropertyOf( ObjectPropertyChain( :hasMother :hasSister ) :hasAunt ) ObjectPropertyAssertion( :hasMother :Stewie :Lois ) ObjectPropertyAssertion( :hasSister :Lois :Carol ))";
        __CLR4_5_2apnapnlvico2an.R.inc(13957);test(premiseOntology, true, false, true, true);
        __CLR4_5_2apnapnlvico2an.R.inc(13958);test(fspremiseOntology, true, false, true, true);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverNew2DFeature2DObjectPropertyChain2DBJP2D003() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),13959);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wxuo9arr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverNew2DFeature2DObjectPropertyChain2DBJP2D003",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13959,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wxuo9arr(){try{__CLR4_5_2apnapnlvico2an.R.inc(13959);
        __CLR4_5_2apnapnlvico2an.R.inc(13960);String premiseOntology = head3
            + "<owl:Ontology/><rdf:Description rdf:about=\"urn:test#p\"><owl:propertyChainAxiom rdf:parseType=\"Collection\"><owl:ObjectProperty rdf:about=\"urn:test#p\"/><owl:ObjectProperty rdf:about=\"urn:test#q\"/></owl:propertyChainAxiom></rdf:Description><rdf:Description rdf:about=\"urn:test#a\"><p rdf:resource=\"urn:test#b\"/></rdf:Description><rdf:Description rdf:about=\"urn:test#b\"><q rdf:resource=\"urn:test#c\"/></rdf:Description></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(13961);test(premiseOntology, true, false, true, true);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverNew2DFeature2DObjectPropertyChain2DBJP2D004() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),13962);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_245xtgqaru();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverNew2DFeature2DObjectPropertyChain2DBJP2D004",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13962,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_245xtgqaru(){try{__CLR4_5_2apnapnlvico2an.R.inc(13962);
        __CLR4_5_2apnapnlvico2an.R.inc(13963);String premiseOntology = head3
            + "<owl:Ontology/><rdf:Description rdf:about=\"urn:test#p\"><owl:propertyChainAxiom rdf:parseType=\"Collection\"><owl:ObjectProperty rdf:about=\"urn:test#p\"/><owl:ObjectProperty rdf:about=\"urn:test#q\"/></owl:propertyChainAxiom></rdf:Description><rdf:Description rdf:about=\"urn:test#a\"><q rdf:resource=\"urn:test#b\"/></rdf:Description><rdf:Description rdf:about=\"urn:test#b\"><q rdf:resource=\"urn:test#c\"/></rdf:Description></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(13964);test(premiseOntology, true, false, true, true);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverNew2DFeature2DObjectQCR2D002() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),13965);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25iy84karx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverNew2DFeature2DObjectQCR2D002",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13965,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25iy84karx(){try{__CLR4_5_2apnapnlvico2an.R.inc(13965);
        __CLR4_5_2apnapnlvico2an.R.inc(13966);String premiseOntology = example
            + "<owl:Ontology/><owl:ObjectProperty rdf:about=\"fatherOf\" />"
            + "<owl:Class rdf:about=\"Woman\" /><rdf:Description rdf:about=\"Peter\"><fatherOf rdf:resource=\"Stewie\" /><fatherOf rdf:resource=\"Meg\" /></rdf:Description><Woman rdf:about=\"Meg\" /><rdf:Description rdf:about=\"Peter\"><rdf:type><owl:Restriction><owl:onProperty rdf:resource=\"fatherOf\" /><owl:maxQualifiedCardinality rdf:datatype=\"http://www.w3.org/2001/XMLSchema#nonNegativeInteger\">1</owl:maxQualifiedCardinality><owl:onClass rdf:resource=\"Woman\" /></owl:Restriction></rdf:type></rdf:Description><rdf:Description rdf:about=\"Stewie\"><owl:differentFrom rdf:resource=\"Meg\" /></rdf:Description></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(13967);String fspremiseOntology = "Prefix( :=<http://example.org/> ) Ontology( Declaration( ObjectProperty( :fatherOf ) ) Declaration( Class( :Woman ) ) ObjectPropertyAssertion( :fatherOf :Peter :Stewie ) ObjectPropertyAssertion( :fatherOf :Peter :Meg ) ClassAssertion( :Woman :Meg ) ClassAssertion( ObjectMaxCardinality( 1 :fatherOf :Woman ) :Peter ) DifferentIndividuals( :Stewie :Meg ))";
        __CLR4_5_2apnapnlvico2an.R.inc(13968);test(premiseOntology, false, false, true, true);
        __CLR4_5_2apnapnlvico2an.R.inc(13969);test(fspremiseOntology, false, false, true, true);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverNew2DFeature2DRational2D001() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),13970);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22515oeas2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverNew2DFeature2DRational2D001",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13970,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22515oeas2(){try{__CLR4_5_2apnapnlvico2an.R.inc(13970);
        __CLR4_5_2apnapnlvico2an.R.inc(13971);String premiseOntology = example
            + "<owl:Ontology/><owl:DatatypeProperty rdf:about=\"dp\" /><rdf:Description rdf:about=\"a\"><rdf:type><owl:Restriction><owl:onProperty rdf:resource=\"dp\" /><owl:allValuesFrom rdf:resource=\"http://www.w3.org/2002/07/owl#rational\" /></owl:Restriction></rdf:type></rdf:Description><rdf:Description rdf:about=\"a\"><rdf:type><owl:Restriction><owl:onProperty rdf:resource=\"dp\" /><owl:minCardinality rdf:datatype=\"http://www.w3.org/2001/XMLSchema#nonNegativeInteger\">2</owl:minCardinality></owl:Restriction></rdf:type></rdf:Description></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(13972);String fspremiseOntology = "Prefix( :=<http://example.org/> ) Prefix( owl:=<http://www.w3.org/2002/07/owl#> ) Ontology( Declaration( DataProperty( :dp ) ) ClassAssertion( DataAllValuesFrom( :dp owl:rational ) :a ) ClassAssertion( DataMinCardinality( 2 :dp ) :a ))";
        __CLR4_5_2apnapnlvico2an.R.inc(13973);test(premiseOntology, false, false, false, true);
        __CLR4_5_2apnapnlvico2an.R.inc(13974);test(fspremiseOntology, false, false, false, true);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverNew2DFeature2DRational2D002() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),13975);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_213yt43as7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverNew2DFeature2DRational2D002",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13975,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_213yt43as7(){try{__CLR4_5_2apnapnlvico2an.R.inc(13975);
        __CLR4_5_2apnapnlvico2an.R.inc(13976);String premiseOntology = "<rdf:RDF xml:base=\"urn:test\" xmlns=\"urn:test#\" xmlns:owl=\"http://www.w3.org/2002/07/owl#\" xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\" xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"><owl:Ontology/><owl:DatatypeProperty rdf:about=\"urn:test#dp\" /><rdf:Description rdf:about=\"urn:test#a\"><rdf:type><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#dp\" /><owl:allValuesFrom><rdfs:Datatype><owl:oneOf><rdf:Description><rdf:first rdf:datatype=\"http://www.w3.org/2001/XMLSchema#decimal\">0.5</rdf:first><rdf:rest><rdf:Description><rdf:first rdf:datatype=\"http://www.w3.org/2002/07/owl#rational\">1/2</rdf:first><rdf:rest rdf:resource=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"/></rdf:Description></rdf:rest></rdf:Description></owl:oneOf></rdfs:Datatype></owl:allValuesFrom></owl:Restriction></rdf:type></rdf:Description><rdf:Description rdf:about=\"urn:test#a\"><rdf:type><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#dp\" /><owl:minCardinality rdf:datatype=\"http://www.w3.org/2001/XMLSchema#nonNegativeInteger\">2</owl:minCardinality></owl:Restriction></rdf:type></rdf:Description></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(13977);String fspremiseOntology = "Prefix( :=<http://example.org/> ) Prefix( owl:=<http://www.w3.org/2002/07/owl#> ) Prefix( xsd:=<http://www.w3.org/2001/XMLSchema#> ) Ontology( Declaration( DataProperty( :dp ) ) ClassAssertion( DataAllValuesFrom( :dp DataOneOf( \"0.5\"^^xsd:decimal \"1/2\"^^owl:rational ) ) :a ) ClassAssertion( DataMinCardinality( 2 :dp ) :a ))";
        __CLR4_5_2apnapnlvico2an.R.inc(13978);test(premiseOntology, false, false, false, true);
        __CLR4_5_2apnapnlvico2an.R.inc(13979);test(fspremiseOntology, false, false, false, true);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverNew2DFeature2DRational2D003() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),13980);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24cyrwkasc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverNew2DFeature2DRational2D003",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13980,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24cyrwkasc(){try{__CLR4_5_2apnapnlvico2an.R.inc(13980);
        __CLR4_5_2apnapnlvico2an.R.inc(13981);String premiseOntology = "<rdf:RDF xml:base=\"urn:test\" xmlns=\"urn:test#\" xmlns:owl=\"http://www.w3.org/2002/07/owl#\" xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\" xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"><owl:Ontology/><owl:DatatypeProperty rdf:about=\"urn:test#dp\" /><rdf:Description rdf:about=\"urn:test#a\"><rdf:type><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#dp\" /><owl:allValuesFrom><rdfs:Datatype><owl:oneOf><rdf:Description><rdf:first rdf:datatype=\"http://www.w3.org/2001/XMLSchema#decimal\">0.3333333333333333</rdf:first><rdf:rest><rdf:Description><rdf:first rdf:datatype=\"http://www.w3.org/2002/07/owl#rational\">1/3</rdf:first><rdf:rest rdf:resource=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"/></rdf:Description></rdf:rest></rdf:Description></owl:oneOf></rdfs:Datatype></owl:allValuesFrom></owl:Restriction></rdf:type></rdf:Description><rdf:Description rdf:about=\"urn:test#a\"><rdf:type><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#dp\" /><owl:minCardinality rdf:datatype=\"http://www.w3.org/2001/XMLSchema#nonNegativeInteger\">2</owl:minCardinality></owl:Restriction></rdf:type></rdf:Description></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(13982);String fspremiseOntology = "Prefix( :=<http://example.org/> ) Prefix( owl:=<http://www.w3.org/2002/07/owl#> ) Prefix( xsd:=<http://www.w3.org/2001/XMLSchema#> ) Ontology( Declaration( DataProperty( :dp ) ) ClassAssertion( DataAllValuesFrom( :dp DataOneOf( \"0.3333333333333333\"^^xsd:decimal \"1/3\"^^owl:rational ) ) :a ) ClassAssertion( DataMinCardinality( 2 :dp ) :a ))";
        __CLR4_5_2apnapnlvico2an.R.inc(13983);test(premiseOntology, false, false, false, true);
        __CLR4_5_2apnapnlvico2an.R.inc(13984);test(fspremiseOntology, false, false, false, true);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverNew2DFeature2DReflexiveProperty2D001() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),13985);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tp5qh1ash();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverNew2DFeature2DReflexiveProperty2D001",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13985,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tp5qh1ash(){try{__CLR4_5_2apnapnlvico2an.R.inc(13985);
        __CLR4_5_2apnapnlvico2an.R.inc(13986);String premiseOntology = example
            + "<owl:Ontology/><owl:ObjectProperty rdf:about=\"knows\" /><owl:NamedIndividual rdf:about=\"Peter\" /><owl:ReflexiveProperty rdf:about=\"knows\" /></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(13987);String fspremiseOntology = "Prefix( :=<http://example.org/> ) Ontology(\n"
            + " Declaration( ObjectProperty( :knows ) ) Declaration( NamedIndividual( :Peter ) ) ReflexiveObjectProperty( :knows ))";
        __CLR4_5_2apnapnlvico2an.R.inc(13988);test(premiseOntology, true, true, false, true);
        __CLR4_5_2apnapnlvico2an.R.inc(13989);test(fspremiseOntology, true, true, false, true);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverNew2DFeature2DSelfRestriction2D001() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),13990);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pmbad8asm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverNew2DFeature2DSelfRestriction2D001",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13990,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pmbad8asm(){try{__CLR4_5_2apnapnlvico2an.R.inc(13990);
        __CLR4_5_2apnapnlvico2an.R.inc(13991);String premiseOntology = example
            + "<owl:Ontology/><owl:ObjectProperty rdf:about=\"likes\" /><rdf:Description rdf:about=\"Peter\"><rdf:type><owl:Restriction><owl:onProperty rdf:resource=\"likes\" /><owl:hasSelf rdf:datatype=\"http://www.w3.org/2001/XMLSchema#boolean\">true</owl:hasSelf></owl:Restriction></rdf:type></rdf:Description></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(13992);String fspremiseOntology = "Prefix( :=<http://example.org/> ) Ontology(\n"
            + " Declaration( ObjectProperty( :likes ) ) ClassAssertion( ObjectHasSelf( :likes ) :Peter ))";
        __CLR4_5_2apnapnlvico2an.R.inc(13993);test(premiseOntology, true, false, false, true);
        __CLR4_5_2apnapnlvico2an.R.inc(13994);test(fspremiseOntology, true, false, false, true);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverNew2DFeature2DKeys2D002() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),13995);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dx6xvasr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverNew2DFeature2DKeys2D002",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13995,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dx6xvasr(){try{__CLR4_5_2apnapnlvico2an.R.inc(13995);
        __CLR4_5_2apnapnlvico2an.R.inc(13996);String premiseOntology = example
            + "<owl:Ontology/><owl:DatatypeProperty rdf:about=\"hasSSN\" /><rdf:Description rdf:about=\"http://www.w3.org/2002/07/owl#Thing\"><owl:hasKey rdf:parseType=\"Collection\"><rdf:Description rdf:about=\"hasSSN\" /></owl:hasKey></rdf:Description><rdf:Description rdf:about=\"Peter\"><hasSSN>123-45-6789</hasSSN></rdf:Description><rdf:Description rdf:about=\"Peter_Griffin\"><hasSSN>123-45-6789</hasSSN></rdf:Description><rdf:Description rdf:about=\"Peter\"><owl:differentFrom rdf:resource=\"Peter_Griffin\" /></rdf:Description></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(13997);String fspremiseOntology = "Prefix( owl:=<http://www.w3.org/2002/07/owl#> ) Prefix( :=<http://example.org/> ) Ontology( Declaration( DataProperty( :hasSSN ) ) HasKey( owl:Thing () ( :hasSSN ) ) DataPropertyAssertion( :hasSSN :Peter \"123-45-6789\" ) DataPropertyAssertion( :hasSSN :Peter_Griffin \"123-45-6789\" ) DifferentIndividuals( :Peter :Peter_Griffin ))";
        __CLR4_5_2apnapnlvico2an.R.inc(13998);test(premiseOntology, true, false, false, true);
        __CLR4_5_2apnapnlvico2an.R.inc(13999);test(fspremiseOntology, true, false, false, true);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverNew2DFeature2DKeys2D003() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14000);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22v2rumasw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverNew2DFeature2DKeys2D003",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14000,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22v2rumasw(){try{__CLR4_5_2apnapnlvico2an.R.inc(14000);
        __CLR4_5_2apnapnlvico2an.R.inc(14001);String premiseOntology = example
            + "<owl:Ontology/>"
            + "<owl:Class rdf:about=\"GriffinFamilyMember\" /><owl:DatatypeProperty rdf:about=\"hasName\" /><rdf:Description rdf:about=\"GriffinFamilyMember\"><owl:hasKey rdf:parseType=\"Collection\"><rdf:Description rdf:about=\"hasName\" /></owl:hasKey></rdf:Description><rdf:Description rdf:about=\"Peter\"><hasName>Peter</hasName><rdf:type rdf:resource=\"GriffinFamilyMember\" /></rdf:Description><rdf:Description rdf:about=\"Peter_Griffin\"><hasName>Peter</hasName><rdf:type rdf:resource=\"GriffinFamilyMember\" /></rdf:Description><rdf:Description rdf:about=\"StPeter\"><hasName>Peter</hasName></rdf:Description></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14002);String fspremiseOntology = "Prefix( :=<http://example.org/> ) Ontology( Declaration( Class( :GriffinFamilyMember ) ) Declaration( DataProperty( :hasName ) ) HasKey( :GriffinFamilyMember () ( :hasName ) ) DataPropertyAssertion( :hasName :Peter \"Peter\" ) ClassAssertion( :GriffinFamilyMember :Peter ) DataPropertyAssertion( :hasName :Peter_Griffin \"Peter\" ) ClassAssertion( :GriffinFamilyMember :Peter_Griffin ) DataPropertyAssertion( :hasName :StPeter \"Peter\" ))";
        __CLR4_5_2apnapnlvico2an.R.inc(14003);test(premiseOntology, true, false, true, true);
        __CLR4_5_2apnapnlvico2an.R.inc(14004);test(fspremiseOntology, true, false, true, true);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverNew2DFeature2DKeys2D004() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14005);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2642qn3at1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverNew2DFeature2DKeys2D004",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14005,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2642qn3at1(){try{__CLR4_5_2apnapnlvico2an.R.inc(14005);
        __CLR4_5_2apnapnlvico2an.R.inc(14006);String premiseOntology = example
            + "<owl:Ontology/>"
            + "<owl:Class rdf:about=\"GriffinFamilyMember\" /><owl:DatatypeProperty rdf:about=\"hasName\" /><rdf:Description rdf:about=\"GriffinFamilyMember\"><owl:hasKey rdf:parseType=\"Collection\"><rdf:Description rdf:about=\"hasName\" /></owl:hasKey></rdf:Description><rdf:Description rdf:about=\"Peter\"><hasName>Peter</hasName><rdf:type rdf:resource=\"GriffinFamilyMember\" /></rdf:Description><rdf:Description rdf:about=\"Peter_Griffin\"><hasName>Peter</hasName><rdf:type rdf:resource=\"GriffinFamilyMember\" /></rdf:Description><rdf:Description rdf:about=\"StPeter\"><hasName>Peter</hasName></rdf:Description></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14007);String fspremiseOntology = "Prefix( :=<http://example.org/> ) Ontology( Declaration( Class( :GriffinFamilyMember ) ) Declaration( DataProperty( :hasName ) ) HasKey( :GriffinFamilyMember () ( :hasName ) ) DataPropertyAssertion( :hasName :Peter \"Peter\" ) ClassAssertion( :GriffinFamilyMember :Peter ) DataPropertyAssertion( :hasName :Peter_Griffin \"Peter\" ) ClassAssertion( :GriffinFamilyMember :Peter_Griffin ) DataPropertyAssertion( :hasName :StPeter \"Peter\" ))";
        __CLR4_5_2apnapnlvico2an.R.inc(14008);test(premiseOntology, true, false, true, true);
        __CLR4_5_2apnapnlvico2an.R.inc(14009);test(fspremiseOntology, true, false, true, true);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverNew2DFeature2DKeys2D006() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14010);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cm2o81at6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverNew2DFeature2DKeys2D006",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14010,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cm2o81at6(){try{__CLR4_5_2apnapnlvico2an.R.inc(14010);
        __CLR4_5_2apnapnlvico2an.R.inc(14011);String premiseOntology = example
            + "<owl:Ontology/>"
            + "<owl:Class rdf:about=\"GriffinFamilyMember\" /><owl:DatatypeProperty rdf:about=\"hasName\" /><rdf:Description rdf:about=\"GriffinFamilyMember\"><owl:hasKey rdf:parseType=\"Collection\"><rdf:Description rdf:about=\"hasName\" /></owl:hasKey></rdf:Description><rdf:Description rdf:about=\"Peter\"><hasName>Peter</hasName><hasName>Kichwa-Tembo</hasName><rdf:type rdf:resource=\"GriffinFamilyMember\" /></rdf:Description><rdf:Description rdf:about=\"hasName\"><rdf:type rdf:resource=\"http://www.w3.org/2002/07/owl#FunctionalProperty\" /></rdf:Description></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14012);String fspremiseOntology = "Prefix( :=<http://example.org/> ) Ontology( Declaration( Class( :GriffinFamilyMember ) ) Declaration( DataProperty( :hasName ) ) HasKey( :GriffinFamilyMember () ( :hasName ) ) DataPropertyAssertion( :hasName :Peter \"Peter\" ) DataPropertyAssertion( :hasName :Peter \"Kichwa-Tembo\" ) ClassAssertion( :GriffinFamilyMember :Peter ) FunctionalDataProperty( :hasName ))";
        __CLR4_5_2apnapnlvico2an.R.inc(14013);test(premiseOntology, true, false, true, true);
        __CLR4_5_2apnapnlvico2an.R.inc(14014);test(fspremiseOntology, true, false, true, true);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverNew2DFeature2DKeys2D007() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14015);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fv2n0iatb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverNew2DFeature2DKeys2D007",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14015,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fv2n0iatb(){try{__CLR4_5_2apnapnlvico2an.R.inc(14015);
        __CLR4_5_2apnapnlvico2an.R.inc(14016);String premiseOntology = example
            + "<owl:Ontology/>"
            + "<owl:Class rdf:about=\"Person\" />"
            + "<owl:Class rdf:about=\"Man\" /><owl:DatatypeProperty rdf:about=\"hasSSN\" /><owl:ObjectProperty rdf:about=\"marriedTo\" /><rdf:Description rdf:about=\"Person\"><owl:hasKey rdf:parseType=\"Collection\"><rdf:Description rdf:about=\"hasSSN\" /></owl:hasKey></rdf:Description><rdf:Description rdf:about=\"Peter\"><hasSSN>123-45-6789</hasSSN><rdf:type rdf:resource=\"Person\" /></rdf:Description><rdf:Description rdf:about=\"Lois\"><rdf:type><owl:Restriction><owl:onProperty rdf:resource=\"marriedTo\" /><owl:someValuesFrom>"
            + "<owl:Class><owl:intersectionOf rdf:parseType=\"Collection\"><rdf:Description rdf:about=\"Man\" /><owl:Restriction><owl:onProperty rdf:resource=\"hasSSN\" /><owl:hasValue>123-45-6789</owl:hasValue></owl:Restriction></owl:intersectionOf></owl:Class></owl:someValuesFrom></owl:Restriction></rdf:type></rdf:Description></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14017);test(premiseOntology, true, false, false, true);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverInconsistent2Dinteger2Dfiller() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14018);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nygy66ate();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverInconsistent2Dinteger2Dfiller",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14018,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nygy66ate(){try{__CLR4_5_2apnapnlvico2an.R.inc(14018);
        __CLR4_5_2apnapnlvico2an.R.inc(14019);String premiseOntology = "Prefix(:=<http://example.org/>) Prefix(xsd:=<http://www.w3.org/2001/XMLSchema#>) Ontology( Declaration(NamedIndividual(:a)) Declaration(DataProperty(:hasAge)) Declaration(Class(:Eighteen)) SubClassOf(DataHasValue(:hasAge \"18\"^^xsd:integer) :Eighteen) ClassAssertion(DataHasValue(:hasAge \"18\"^^xsd:integer) :a) ClassAssertion(ObjectComplementOf(:Eighteen) :a))";
        __CLR4_5_2apnapnlvico2an.R.inc(14020);test(premiseOntology, false, false, true, true);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverFunctionality2Dclash() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14021);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28l45knath();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverFunctionality2Dclash",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14021,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28l45knath(){try{__CLR4_5_2apnapnlvico2an.R.inc(14021);
        __CLR4_5_2apnapnlvico2an.R.inc(14022);String premiseOntology = "Prefix(:=<http://example.org/>) Prefix(xsd:=<http://www.w3.org/2001/XMLSchema#>) Ontology( Declaration(NamedIndividual(:a)) Declaration(DataProperty(:hasAge)) FunctionalDataProperty(:hasAge) ClassAssertion(DataHasValue(:hasAge \"18\"^^xsd:integer) :a) ClassAssertion(DataHasValue(:hasAge \"19\"^^xsd:integer) :a))";
        __CLR4_5_2apnapnlvico2an.R.inc(14023);test(premiseOntology, true, false, true, true);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverChain2trans() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14024);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2emzteqatk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverChain2trans",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14024,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2emzteqatk(){try{__CLR4_5_2apnapnlvico2an.R.inc(14024);
        __CLR4_5_2apnapnlvico2an.R.inc(14025);String premiseOntology = "<rdf:RDF xml:base=\"urn:test\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\" xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\" xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\" xmlns:owl=\"http://www.w3.org/2002/07/owl#\"><owl:Ontology rdf:about=\"\"/><owl:ObjectProperty rdf:about=\"urn:test#p\"/><rdf:Description rdf:about=\"urn:test#p\"><owl:propertyChainAxiom rdf:parseType=\"Collection\"><rdf:Description rdf:about=\"urn:test#p\"/><rdf:Description rdf:about=\"urn:test#p\"/></owl:propertyChainAxiom></rdf:Description></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14026);test(premiseOntology, true, false, true, true);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverNew2DFeature2DSelfRestriction2D002() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14027);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2svb95patn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverNew2DFeature2DSelfRestriction2D002",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14027,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2svb95patn(){try{__CLR4_5_2apnapnlvico2an.R.inc(14027);
        __CLR4_5_2apnapnlvico2an.R.inc(14028);String premiseOntology = example
            + "<owl:Ontology/><owl:ObjectProperty rdf:about=\"likes\" /><rdf:Description rdf:about=\"Peter\"><likes rdf:resource=\"Peter\" /></rdf:Description></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14029);String fspremiseOntology = "Prefix( :=<http://example.org/> ) Ontology(\n"
            + " Declaration( ObjectProperty( :likes ) ) ObjectPropertyAssertion( :likes :Peter :Peter ))";
        __CLR4_5_2apnapnlvico2an.R.inc(14030);test(premiseOntology, true, true, true, true);
        __CLR4_5_2apnapnlvico2an.R.inc(14031);test(fspremiseOntology, true, true, true, true);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverDisjointClasses2D001() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14032);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2byvkasats();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverDisjointClasses2D001",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14032,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2byvkasats(){try{__CLR4_5_2apnapnlvico2an.R.inc(14032);
        __CLR4_5_2apnapnlvico2an.R.inc(14033);String premiseOntology = example
            + "<owl:Ontology/>"
            + "<owl:Class rdf:about=\"Boy\" />"
            + "<owl:Class rdf:about=\"Girl\" /><rdf:Description rdf:about=\"Boy\"><owl:disjointWith rdf:resource=\"Girl\" /></rdf:Description><Boy rdf:about=\"Stewie\" /></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14034);String fspremiseOntology = "Prefix( :=<http://example.org/> )Ontology( Declaration( Class( :Boy ) ) Declaration( Class( :Girl ) ) DisjointClasses( :Boy :Girl ) ClassAssertion( :Boy :Stewie ))";
        __CLR4_5_2apnapnlvico2an.R.inc(14035);test(premiseOntology, true, true, true, true);
        __CLR4_5_2apnapnlvico2an.R.inc(14036);test(fspremiseOntology, true, true, true, true);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverDisjointClasses2D003() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14037);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25gvmpuatx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverDisjointClasses2D003",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14037,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25gvmpuatx(){try{__CLR4_5_2apnapnlvico2an.R.inc(14037);
        __CLR4_5_2apnapnlvico2an.R.inc(14038);String premiseOntology = example
            + "<owl:Ontology/>"
            + "<owl:Class rdf:about=\"Boy\" />"
            + "<owl:Class rdf:about=\"Girl\" />"
            + "<owl:Class rdf:about=\"Dog\" /><owl:AllDisjointClasses><owl:members rdf:parseType=\"Collection\"><rdf:Description rdf:about=\"Boy\" /><rdf:Description rdf:about=\"Girl\" /><rdf:Description rdf:about=\"Dog\" /></owl:members></owl:AllDisjointClasses><Boy rdf:about=\"Stewie\" /></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14039);String fspremiseOntology = "Prefix( :=<http://example.org/> ) Ontology(\n"
            + " Declaration( Class( :Boy ) ) Declaration( Class( :Girl ) ) Declaration( Class( :Dog ) ) DisjointClasses( :Boy :Girl :Dog ) ClassAssertion( :Boy :Stewie ))";
        __CLR4_5_2apnapnlvico2an.R.inc(14040);test(premiseOntology, true, true, true, true);
        __CLR4_5_2apnapnlvico2an.R.inc(14041);test(fspremiseOntology, true, true, true, true);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverBnode2somevaluesfrom() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14042);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2en07v9au2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverBnode2somevaluesfrom",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14042,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2en07v9au2(){try{__CLR4_5_2apnapnlvico2an.R.inc(14042);
        __CLR4_5_2apnapnlvico2an.R.inc(14043);String premiseOntology = head
            + "xmlns:ex=\"urn:test#\" xml:base=\"urn:test\"><owl:Ontology/><owl:ObjectProperty rdf:about=\"urn:test#p\"/><owl:Thing rdf:about=\"urn:test#a\"><ex:p><rdf:Description rdf:nodeID=\"urn:test#x\"/></ex:p></owl:Thing></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14044);test(premiseOntology, false, false, false, true);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverConsistent2Dinteger2Dfiller() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14045);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28ezejhau5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverConsistent2Dinteger2Dfiller",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14045,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28ezejhau5(){try{__CLR4_5_2apnapnlvico2an.R.inc(14045);
        __CLR4_5_2apnapnlvico2an.R.inc(14046);String premiseOntology = "Prefix(:=<http://example.org/>)\nPrefix(xsd:=<http://www.w3.org/2001/XMLSchema#>) Ontology( Declaration(NamedIndividual(:a)) Declaration(DataProperty(:dp)) Declaration(Class(:A)) SubClassOf(:A DataHasValue(:dp \"18\"^^xsd:integer)) ClassAssertion(:A :a) ClassAssertion(DataAllValuesFrom(:dp xsd:integer) :a))";
        __CLR4_5_2apnapnlvico2an.R.inc(14047);test(premiseOntology, false, false, true, true);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverNew2DFeature2DObjectQCR2D001() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14048);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28ry6x1au8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverNew2DFeature2DObjectQCR2D001",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14048,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28ry6x1au8(){try{__CLR4_5_2apnapnlvico2an.R.inc(14048);
        __CLR4_5_2apnapnlvico2an.R.inc(14049);String premiseOntology = example
            + "<owl:Ontology/><owl:ObjectProperty rdf:about=\"fatherOf\" />"
            + "<owl:Class rdf:about=\"Man\" /><rdf:Description rdf:about=\"Peter\"><fatherOf rdf:resource=\"Stewie\" /><fatherOf rdf:resource=\"Chris\" /></rdf:Description><Man rdf:about=\"Stewie\" /><Man rdf:about=\"Chris\" /><rdf:Description rdf:about=\"Stewie\"><owl:differentFrom rdf:resource=\"Chris\" /></rdf:Description></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14050);String fspremiseOntology = "Prefix( :=<http://example.org/> ) Ontology( Declaration( ObjectProperty( :fatherOf ) ) Declaration( Class( :Man ) ) ObjectPropertyAssertion( :fatherOf :Peter :Stewie ) ObjectPropertyAssertion( :fatherOf :Peter :Chris ) ClassAssertion( :Man :Stewie ) ClassAssertion( :Man :Chris ) DifferentIndividuals( :Chris :Stewie ))";
        __CLR4_5_2apnapnlvico2an.R.inc(14051);test(premiseOntology, true, true, true, true);
        __CLR4_5_2apnapnlvico2an.R.inc(14052);test(fspremiseOntology, true, true, true, true);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverNew2DFeature2DDisjointDataProperties2D001() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14053);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27lf72vaud();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverNew2DFeature2DDisjointDataProperties2D001",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14053,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27lf72vaud(){try{__CLR4_5_2apnapnlvico2an.R.inc(14053);
        __CLR4_5_2apnapnlvico2an.R.inc(14054);String premiseOntology = example
            + "<owl:Ontology/><owl:DatatypeProperty rdf:about=\"hasName\" /><owl:DatatypeProperty rdf:about=\"hasAddress\" /><rdf:Description rdf:about=\"hasName\"><owl:propertyDisjointWith rdf:resource=\"hasAddress\" /></rdf:Description><rdf:Description rdf:about=\"Peter\"><hasName>Peter Griffin</hasName><hasAddress>Peter Griffin</hasAddress></rdf:Description></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14055);String fspremiseOntology = "Prefix( :=<http://example.org/> ) Ontology( Declaration( DataProperty( :hasName ) ) Declaration( DataProperty( :hasAddress ) ) DisjointDataProperties( :hasName :hasAddress ) DataPropertyAssertion( :hasName :Peter \"Peter Griffin\" ) DataPropertyAssertion( :hasAddress :Peter \"Peter Griffin\" ))";
        __CLR4_5_2apnapnlvico2an.R.inc(14056);test(premiseOntology, false, true, true, true);
        __CLR4_5_2apnapnlvico2an.R.inc(14057);test(fspremiseOntology, false, true, true, true);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverNew2DFeature2DDisjointDataProperties2D002() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14058);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2auf5vcaui();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverNew2DFeature2DDisjointDataProperties2D002",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14058,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2auf5vcaui(){try{__CLR4_5_2apnapnlvico2an.R.inc(14058);
        __CLR4_5_2apnapnlvico2an.R.inc(14059);String premiseOntology = example
            + "<owl:Ontology/><owl:DatatypeProperty rdf:about=\"hasName\" /><owl:DatatypeProperty rdf:about=\"hasAddress\" /><owl:DatatypeProperty rdf:about=\"hasZip\" /><owl:AllDisjointProperties><owl:members rdf:parseType=\"Collection\"><rdf:Description rdf:about=\"hasName\" /><rdf:Description rdf:about=\"hasAddress\" /><rdf:Description rdf:about=\"hasZip\" /></owl:members></owl:AllDisjointProperties><rdf:Description rdf:about=\"Peter\"><hasName>Peter Griffin</hasName></rdf:Description><rdf:Description rdf:about=\"Peter_Griffin\"><hasAddress>Peter Griffin</hasAddress></rdf:Description><rdf:Description rdf:about=\"Petre\"><hasZip>Peter Griffin</hasZip></rdf:Description></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14060);String fspremiseOntology = "Prefix( :=<http://example.org/> ) Ontology( Declaration( DataProperty( :hasName ) ) Declaration( DataProperty( :hasAddress ) ) Declaration( DataProperty( :hasZip ) ) DisjointDataProperties( :hasName :hasAddress :hasZip ) DataPropertyAssertion( :hasName :Peter \"Peter Griffin\" ) DataPropertyAssertion( :hasAddress :Peter_Griffin \"Peter Griffin\" ) DataPropertyAssertion( :hasZip :Petre \"Peter Griffin\" ))";
        __CLR4_5_2apnapnlvico2an.R.inc(14061);test(premiseOntology, false, true, true, true);
        __CLR4_5_2apnapnlvico2an.R.inc(14062);test(fspremiseOntology, false, true, true, true);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverDatatype2DDataComplementOf2D001() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14063);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2buin9laun();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverDatatype2DDataComplementOf2D001",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14063,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2buin9laun(){try{__CLR4_5_2apnapnlvico2an.R.inc(14063);
        __CLR4_5_2apnapnlvico2an.R.inc(14064);String fspremiseOntology = "Prefix( xsd:=<http://www.w3.org/2001/XMLSchema#> ) Prefix( :=<http://example.org/> ) Ontology( Declaration( DataProperty( :p ) ) DataPropertyRange( :p DataComplementOf( xsd:positiveInteger ) ) DataPropertyAssertion( :p :i \"-1\"^^xsd:negativeInteger ) DataPropertyAssertion( :p :i \"A string\"^^xsd:string ))";
        __CLR4_5_2apnapnlvico2an.R.inc(14065);test(fspremiseOntology, false, false, false, true);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverNew2DFeature2DKeys2D005() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14066);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29d2pfkauq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverNew2DFeature2DKeys2D005",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14066,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29d2pfkauq(){try{__CLR4_5_2apnapnlvico2an.R.inc(14066);
        __CLR4_5_2apnapnlvico2an.R.inc(14067);String premiseOntology = example
            + "<owl:Ontology/>"
            + "<owl:Class rdf:about=\"GriffinFamilyMember\" /><owl:DatatypeProperty rdf:about=\"hasName\" /><rdf:Description rdf:about=\"GriffinFamilyMember\"><owl:hasKey rdf:parseType=\"Collection\"><rdf:Description rdf:about=\"hasName\" /></owl:hasKey></rdf:Description><rdf:Description rdf:about=\"Peter\"><hasName>Peter</hasName><hasName>Kichwa-Tembo</hasName><rdf:type rdf:resource=\"GriffinFamilyMember\" /></rdf:Description></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14068);String fspremiseOntology = "Prefix( :=<http://example.org/> ) Ontology( Declaration( Class( :GriffinFamilyMember ) ) Declaration( DataProperty( :hasName ) ) HasKey( :GriffinFamilyMember () ( :hasName ) ) DataPropertyAssertion( :hasName :Peter \"Peter\" ) DataPropertyAssertion( :hasName :Peter \"Kichwa-Tembo\" ) ClassAssertion( :GriffinFamilyMember :Peter ))";
        __CLR4_5_2apnapnlvico2an.R.inc(14069);test(premiseOntology, true, false, true, true);
        __CLR4_5_2apnapnlvico2an.R.inc(14070);test(fspremiseOntology, true, false, true, true);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverNew2DFeature2DKeys2D001() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14071);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23mx5qcauv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverNew2DFeature2DKeys2D001",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14071,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23mx5qcauv(){try{__CLR4_5_2apnapnlvico2an.R.inc(14071);
        __CLR4_5_2apnapnlvico2an.R.inc(14072);String premiseOntology = example
            + "<owl:Ontology/><owl:DatatypeProperty rdf:about=\"hasSSN\" /><rdf:Description rdf:about=\"http://www.w3.org/2002/07/owl#Thing\"><owl:hasKey rdf:parseType=\"Collection\"><rdf:Description rdf:about=\"hasSSN\" /></owl:hasKey></rdf:Description><rdf:Description rdf:about=\"Peter\"><hasSSN>123-45-6789</hasSSN></rdf:Description><rdf:Description rdf:about=\"Peter_Griffin\"><hasSSN>123-45-6789</hasSSN></rdf:Description></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14073);String fspremiseOntology = "Prefix( owl:=<http://www.w3.org/2002/07/owl#> )\nPrefix( :=<http://example.org/> )\nOntology( Declaration( DataProperty( :hasSSN ) ) HasKey( owl:Thing () ( :hasSSN ) ) DataPropertyAssertion( :hasSSN :Peter \"123-45-6789\" ) DataPropertyAssertion( :hasSSN :Peter_Griffin \"123-45-6789\" ))";
        __CLR4_5_2apnapnlvico2an.R.inc(14074);test(fspremiseOntology, true, false, false, true);
        __CLR4_5_2apnapnlvico2an.R.inc(14075);test(premiseOntology, true, false, false, true);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testTestCase3AWebOnt2DI5242D003() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14076);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dxss57av0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testTestCase3AWebOnt2DI5242D003",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14076,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dxss57av0(){try{__CLR4_5_2apnapnlvico2an.R.inc(14076);
        __CLR4_5_2apnapnlvico2an.R.inc(14077);String premiseOntology = rdf
            + " xml:base=\"urn:test\"><owl:Ontology/><owl:ObjectProperty rdf:about=\"urn:test#prop\"><rdfs:range>"
            + "<owl:Class rdf:about=\"urn:test#A\"/></rdfs:range></owl:ObjectProperty></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14078);test(premiseOntology, true, true, true, true);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testTestCase3AWebOnt2DI5262D001() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14079);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2q77epav3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testTestCase3AWebOnt2DI5262D001",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14079,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2q77epav3(){try{__CLR4_5_2apnapnlvico2an.R.inc(14079);
        __CLR4_5_2apnapnlvico2an.R.inc(14080);String premiseOntology = head
            + "xml:base=\"urn:test\"><owl:Ontology/>"
            + "<owl:Class rdf:nodeID=\"B\"><owl:intersectionOf rdf:parseType=\"Collection\">"
            + "<owl:Class rdf:about=\"urn:test#B\"/></owl:intersectionOf></owl:Class><rdf:Description><rdf:type rdf:nodeID=\"B\"/></rdf:Description>"
            + "<owl:Class><owl:intersectionOf rdf:parseType=\"Collection\">"
            + "<owl:Class rdf:about=\"urn:test#C\"/><rdf:Description rdf:nodeID=\"B\"/></owl:intersectionOf></owl:Class></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14081);test(premiseOntology, false, false, false, false);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testTestCase3AWebOnt2DI5262D003() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14082);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27874znav6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testTestCase3AWebOnt2DI5262D003",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14082,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27874znav6(){try{__CLR4_5_2apnapnlvico2an.R.inc(14082);
        __CLR4_5_2apnapnlvico2an.R.inc(14083);String premiseOntology = head
            + "xml:base=\"urn:test\"><owl:Ontology/>"
            + "<owl:Class rdf:nodeID=\"B\"><owl:intersectionOf rdf:parseType=\"Collection\">"
            + "<owl:Class rdf:about=\"urn:test#B\"/></owl:intersectionOf></owl:Class>"
            + "<owl:Class rdf:about=\"urn:test#notB\"><owl:complementOf rdf:nodeID=\"B\"/></owl:Class>"
            + "<owl:Class rdf:about=\"urn:test#u\"><owl:unionOf rdf:parseType=\"Collection\"><rdf:Description rdf:nodeID=\"B\"/>"
            + "<owl:Class rdf:about=\"urn:test#A\"/></owl:unionOf></owl:Class></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14084);test(premiseOntology, false, false, false, false);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testTestCase3AWebOnt2DI5262D005() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14085);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dq72klav9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testTestCase3AWebOnt2DI5262D005",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14085,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dq72klav9(){try{__CLR4_5_2apnapnlvico2an.R.inc(14085);
        __CLR4_5_2apnapnlvico2an.R.inc(14086);String premiseOntology = head
            + "xml:base=\"urn:test\"><owl:Ontology/>"
            + "<owl:Class rdf:nodeID=\"B\"><owl:intersectionOf rdf:parseType=\"Collection\">"
            + "<owl:Class rdf:about=\"urn:test#B\"/></owl:intersectionOf><owl:disjointWith>"
            + "<owl:Class rdf:about=\"urn:test#C\"/></owl:disjointWith><owl:equivalentClass>"
            + "<owl:Class rdf:about=\"urn:test#D\"/></owl:equivalentClass></owl:Class></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14087);test(premiseOntology, false, false, false, false);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testTestCase3AWebOnt2DI5262D009() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14088);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qq6xqhavc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testTestCase3AWebOnt2DI5262D009",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14088,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qq6xqhavc(){try{__CLR4_5_2apnapnlvico2an.R.inc(14088);
        __CLR4_5_2apnapnlvico2an.R.inc(14089);String premiseOntology = head
            + "xmlns:first=\"urn:test#\" xml:base=\"urn:test\"><owl:Ontology/><owl:ObjectProperty rdf:about=\"urn:test#p\" /></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14090);test(premiseOntology, true, true, true, true);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testTestCase3AWebOnt2DI462D004() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14091);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mqr4i5avf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testTestCase3AWebOnt2DI462D004",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14091,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mqr4i5avf(){try{__CLR4_5_2apnapnlvico2an.R.inc(14091);
        __CLR4_5_2apnapnlvico2an.R.inc(14092);String premiseOntology = head
            + "xml:base=\"urn:test\"><owl:Ontology/>"
            + "<owl:Class rdf:about=\"urn:test#C1\"><owl:equivalentClass>"
            + "<owl:Class rdf:about=\"urn:test#C2\"/></owl:equivalentClass></owl:Class></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14093);test(premiseOntology, true, true, true, true);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverTestCase3AWebOnt2DAnnotationProperty2D002() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14094);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29qm4dcavi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverTestCase3AWebOnt2DAnnotationProperty2D002",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14094,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29qm4dcavi(){try{__CLR4_5_2apnapnlvico2an.R.inc(14094);
        __CLR4_5_2apnapnlvico2an.R.inc(14095);String premiseOntology = head
            + "xmlns:first=\"urn:test#\" xml:base=\"urn:test\"><owl:Ontology/>"
            + "<owl:Class rdf:about=\"urn:test#A\">"
            + "<first:ap>"
            + "<owl:Class rdf:about=\"urn:test#B\"/></first:ap></owl:Class><owl:AnnotationProperty rdf:about=\"urn:test#ap\"/></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14096);test(premiseOntology, true, true, true, true);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testTestCase3AWebOnt2DI582D008() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14097);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jv76hiavl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testTestCase3AWebOnt2DI582D008",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14097,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jv76hiavl(){try{__CLR4_5_2apnapnlvico2an.R.inc(14097);
        __CLR4_5_2apnapnlvico2an.R.inc(14098);String premiseOntology = "Prefix(owl:=<http://www.w3.org/2002/07/owl#>)\nPrefix(rdf:=<http://www.w3.org/1999/02/22-rdf-syntax-ns#>)\nPrefix(xml:=<http://www.w3.org/XML/1998/namespace>)\nPrefix(xsd:=<http://www.w3.org/2001/XMLSchema#>)\nPrefix(rdfs:=<http://www.w3.org/2000/01/rdf-schema#>) Ontology(\n Declaration(DataProperty(<http://www.w3.org/2002/03owlt/I5.8/premises008#p>))\n DataPropertyRange(<http://www.w3.org/2002/03owlt/I5.8/premises008#p> xsd:short))";
        __CLR4_5_2apnapnlvico2an.R.inc(14099);test(premiseOntology, false, false, true, true);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverRdfbased2Dsem2Dchar2Dasymmetric2Dterm() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14100);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hsnaqnavo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverRdfbased2Dsem2Dchar2Dasymmetric2Dterm",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14100,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hsnaqnavo(){try{__CLR4_5_2apnapnlvico2an.R.inc(14100);
        __CLR4_5_2apnapnlvico2an.R.inc(14101);String premiseOntology = head
            + "xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\" xmlns:ex=\"http://www.example.org#\" xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"><owl:SymmetricProperty rdf:about=\"http://www.example.org#p\"><rdf:type rdf:resource=\"http://www.w3.org/2002/07/owl#AsymmetricProperty\"/></owl:SymmetricProperty><rdf:Description rdf:about=\"http://www.example.org#x\"><ex:p rdf:resource=\"http://www.example.org#y\"/></rdf:Description></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14102);test(premiseOntology, false, true, true, true);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverRdfbased2Dsem2Dchar2Dtransitive2Dinst() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14103);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2koz4u0avr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverRdfbased2Dsem2Dchar2Dtransitive2Dinst",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14103,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2koz4u0avr(){try{__CLR4_5_2apnapnlvico2an.R.inc(14103);
        __CLR4_5_2apnapnlvico2an.R.inc(14104);String premiseOntology = head
            + "xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\" xmlns:ex=\"http://www.example.org#\" xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"><owl:TransitiveProperty rdf:about=\"http://www.example.org#p\"/><rdf:Description rdf:about=\"http://www.example.org#x\"><ex:p><rdf:Description rdf:about=\"http://www.example.org#y\"><ex:p rdf:resource=\"http://www.example.org#z\"/></rdf:Description></ex:p></rdf:Description></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14105);test(premiseOntology, true, false, true, true);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverRdfbased2Dsem2Dclass2Dnothing2Dterm() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14106);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ghoz1gavu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverRdfbased2Dsem2Dclass2Dnothing2Dterm",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14106,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ghoz1gavu(){try{__CLR4_5_2apnapnlvico2an.R.inc(14106);
        __CLR4_5_2apnapnlvico2an.R.inc(14107);String premiseOntology = head
            + "xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\" xmlns:ex=\"http://www.example.org#\" xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\">"
            + "<owl:Class rdf:about=\"http://www.example.org#c\"/></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14108);test(premiseOntology, true, true, true, true);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverRdfbased2Dsem2Dndis2Dalldifferent2Dfw() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14109);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23f40uoavx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverRdfbased2Dsem2Dndis2Dalldifferent2Dfw",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14109,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23f40uoavx(){try{__CLR4_5_2apnapnlvico2an.R.inc(14109);
        __CLR4_5_2apnapnlvico2an.R.inc(14110);String premiseOntology = head
            + "xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\" xmlns:ex=\"http://www.example.org#\" xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"><owl:AllDifferent rdf:about=\"http://www.example.org#z\"><owl:members rdf:parseType=\"Collection\"><rdf:Description rdf:about=\"http://www.example.org#w1\"><owl:sameAs rdf:resource=\"http://www.example.org#w2\"/></rdf:Description><rdf:Description rdf:about=\"http://www.example.org#w2\"/><rdf:Description rdf:about=\"http://www.example.org#w3\"/></owl:members></owl:AllDifferent></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14111);test(premiseOntology, true, false, true, true);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverRdfbased2Dsem2Deqdis2Dsameas2Dsym() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14112);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_224ivecaw0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverRdfbased2Dsem2Deqdis2Dsameas2Dsym",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14112,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_224ivecaw0(){try{__CLR4_5_2apnapnlvico2an.R.inc(14112);
        __CLR4_5_2apnapnlvico2an.R.inc(14113);String premiseOntology = head
            + "xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\" xmlns:ex=\"http://www.example.org#\" xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"><rdf:Description rdf:about=\"http://www.example.org#x\"><owl:sameAs rdf:resource=\"http://www.example.org#y\"/></rdf:Description></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14114);test(premiseOntology, true, false, true, true);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverPlus2Dminus2D02Dplus2Ddisjointness() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14115);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2j1nevmaw3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverPlus2Dminus2D02Dplus2Ddisjointness",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14115,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2j1nevmaw3(){try{__CLR4_5_2apnapnlvico2an.R.inc(14115);
        __CLR4_5_2apnapnlvico2an.R.inc(14116);String premiseOntology = "Prefix(:=<http://example.org/>) Prefix(xsd:=<http://www.w3.org/2001/XMLSchema#>) Ontology( Declaration(NamedIndividual(:Meg)) Declaration(DataProperty(:numberOfChildren)) DataPropertyAssertion(:numberOfChildren :Meg \"+0.0\"^^xsd:float) DataPropertyAssertion(:numberOfChildren :Meg \"-0.0\"^^xsd:float) FunctionalDataProperty(:numberOfChildren))";
        __CLR4_5_2apnapnlvico2an.R.inc(14117);test(premiseOntology, false, false, true, true);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverRdfbased2Dsem2Deqdis2Dsameas2Dtrans() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14118);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2splu0jaw6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverRdfbased2Dsem2Deqdis2Dsameas2Dtrans",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14118,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2splu0jaw6(){try{__CLR4_5_2apnapnlvico2an.R.inc(14118);
        __CLR4_5_2apnapnlvico2an.R.inc(14119);String premiseOntology = head
            + "xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\" xmlns:ex=\"http://www.example.org#\" xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"><rdf:Description rdf:about=\"http://www.example.org#x\"><owl:sameAs><rdf:Description rdf:about=\"http://www.example.org#y\"><owl:sameAs rdf:resource=\"http://www.example.org#z\"/></rdf:Description></owl:sameAs></rdf:Description></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14120);test(premiseOntology, true, false, true, true);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverRdfbased2Dsem2Dndis2Dalldifferent2Dfw2Ddistinctmembers() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14121);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2u8iyc7aw9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverRdfbased2Dsem2Dndis2Dalldifferent2Dfw2Ddistinctmembers",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14121,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2u8iyc7aw9(){try{__CLR4_5_2apnapnlvico2an.R.inc(14121);
        __CLR4_5_2apnapnlvico2an.R.inc(14122);String premiseOntology = head
            + "xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\" xmlns:ex=\"http://www.example.org#\" xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"><owl:AllDifferent rdf:about=\"http://www.example.org#z\"><owl:distinctMembers rdf:parseType=\"Collection\"><rdf:Description rdf:about=\"http://www.example.org#w1\"><owl:sameAs rdf:resource=\"http://www.example.org#w2\"/></rdf:Description><rdf:Description rdf:about=\"http://www.example.org#w2\"/><rdf:Description rdf:about=\"http://www.example.org#w3\"/></owl:distinctMembers></owl:AllDifferent></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14123);test(premiseOntology, true, false, true, true);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverRdfbased2Dsem2Dchar2Dinversefunc2Dinst() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14124);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2eeplxtawc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverRdfbased2Dsem2Dchar2Dinversefunc2Dinst",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14124,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2eeplxtawc(){try{__CLR4_5_2apnapnlvico2an.R.inc(14124);
        __CLR4_5_2apnapnlvico2an.R.inc(14125);String premiseOntology = head
            + "xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\" xmlns:ex=\"http://www.example.org#\" xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"><owl:InverseFunctionalProperty rdf:about=\"http://www.example.org#p\"/><rdf:Description rdf:about=\"http://www.example.org#x1\"><ex:p rdf:resource=\"http://www.example.org#y\"/></rdf:Description><rdf:Description rdf:about=\"http://www.example.org#x2\"><ex:p rdf:resource=\"http://www.example.org#y\"/></rdf:Description></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14126);test(premiseOntology, false, false, true, true);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverTestCase3AWebOnt2DInverseFunctionalProperty2D001() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14127);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2flpzepawf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverTestCase3AWebOnt2DInverseFunctionalProperty2D001",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14127,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2flpzepawf(){try{__CLR4_5_2apnapnlvico2an.R.inc(14127);
        __CLR4_5_2apnapnlvico2an.R.inc(14128);String premiseOntology = head
            + "xmlns:first=\"urn:test#\" xml:base=\"urn:test\"><owl:Ontology/><owl:InverseFunctionalProperty rdf:about=\"urn:test#prop\"/><rdf:Description rdf:about=\"urn:test#subject1\">"
            + "<first:prop rdf:resource=\"urn:test#object\" /></rdf:Description><rdf:Description rdf:about=\"urn:test#subject2\">"
            + "<first:prop rdf:resource=\"urn:test#object\" /></rdf:Description><rdf:Description rdf:about=\"http://www.w3.org/2002/03owlt/InverseFunctionalProperty/premises001#object\"><rdf:type rdf:resource=\"http://www.w3.org/2002/07/owl#Thing\"/></rdf:Description><rdf:Description rdf:about=\"http://www.w3.org/2002/03owlt/InverseFunctionalProperty/premises001#subject2\"><rdf:type rdf:resource=\"http://www.w3.org/2002/07/owl#Thing\"/></rdf:Description><rdf:Description rdf:about=\"http://www.w3.org/2002/03owlt/InverseFunctionalProperty/premises001#subject1\"><rdf:type rdf:resource=\"http://www.w3.org/2002/07/owl#Thing\"/></rdf:Description></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14129);test(premiseOntology, false, false, false, true);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverRdfbased2Dsem2Dchar2Dsymmetric2Dinst() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14130);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qqxsnmawi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverRdfbased2Dsem2Dchar2Dsymmetric2Dinst",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14130,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qqxsnmawi(){try{__CLR4_5_2apnapnlvico2an.R.inc(14130);
        __CLR4_5_2apnapnlvico2an.R.inc(14131);String premiseOntology = head
            + "xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\" xmlns:ex=\"http://www.example.org#\" xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"><owl:SymmetricProperty rdf:about=\"http://www.example.org#p\"/><rdf:Description rdf:about=\"http://www.example.org#x\"><ex:p rdf:resource=\"http://www.example.org#y\"/></rdf:Description></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14132);test(premiseOntology, false, true, true, true);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Ignore("An ontology missing the <Ontology> tag is not a valid ontology, but the current OWLOntology interface does not allow the profile checkers to know.")
    @Test
    public void testURIResolverRdfbased2Dsem2Deqdis2Deqclass2Dsym() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14133);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2le4csoawl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverRdfbased2Dsem2Deqdis2Deqclass2Dsym",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14133,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2le4csoawl(){try{__CLR4_5_2apnapnlvico2an.R.inc(14133);
        __CLR4_5_2apnapnlvico2an.R.inc(14134);String premiseOntology = head
            + "xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\" xmlns:ex=\"http://www.example.org#\" xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"><rdf:Description rdf:about=\"http://www.example.org#c1\"><owl:equivalentClass rdf:resource=\"http://www.example.org#c2\"/></rdf:Description></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14135);test(premiseOntology, false, false, false, false);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverRdfbased2Dsem2Deqdis2Deqprop2Drflxv() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14136);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29rh1r8awo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverRdfbased2Dsem2Deqdis2Deqprop2Drflxv",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14136,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29rh1r8awo(){try{__CLR4_5_2apnapnlvico2an.R.inc(14136);
        __CLR4_5_2apnapnlvico2an.R.inc(14137);String premiseOntology = head
            + "xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\" xmlns:ex=\"http://www.example.org#\" xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"><owl:ObjectProperty rdf:about=\"http://www.example.org#op\"/><owl:DatatypeProperty rdf:about=\"http://www.example.org#dp\"/></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14138);test(premiseOntology, true, true, true, true);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testTestCase3AWebOnt2DI5262D002() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14139);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23z7676awr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testTestCase3AWebOnt2DI5262D002",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14139,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23z7676awr(){try{__CLR4_5_2apnapnlvico2an.R.inc(14139);
        __CLR4_5_2apnapnlvico2an.R.inc(14140);String premiseOntology = head
            + "xml:base=\"urn:test\"><owl:Ontology/>"
            + "<owl:Class rdf:nodeID=\"B\"><owl:intersectionOf rdf:parseType=\"Collection\">"
            + "<owl:Class rdf:about=\"urn:test#B\"/></owl:intersectionOf><owl:equivalentClass>"
            + "<owl:Class rdf:about=\"urn:test#A\"/></owl:equivalentClass></owl:Class><rdf:Description><rdf:type rdf:nodeID=\"B\"/></rdf:Description></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14141);test(premiseOntology, false, false, false, false);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverTestCase3AWebOnt2Ddescription2Dlogic2D104() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14142);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jfag21awu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverTestCase3AWebOnt2Ddescription2Dlogic2D104",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14142,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jfag21awu(){try{__CLR4_5_2apnapnlvico2an.R.inc(14142);
        __CLR4_5_2apnapnlvico2an.R.inc(14143);String premiseOntology = head2
            + "<owl:Ontology rdf:about=\"\"/>"
            + "<owl:Class rdf:about=\"urn:test#Unsatisfiable\"><owl:equivalentClass>"
            + "<owl:Class rdf:about=\"urn:test#c1\"/></owl:equivalentClass></owl:Class>"
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
        __CLR4_5_2apnapnlvico2an.R.inc(14144);test(premiseOntology, false, false, true, true);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverTestCase3AWebOnt2DSymmetricProperty2D003() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14145);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2369vhdawx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverTestCase3AWebOnt2DSymmetricProperty2D003",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14145,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2369vhdawx(){try{__CLR4_5_2apnapnlvico2an.R.inc(14145);
        __CLR4_5_2apnapnlvico2an.R.inc(14146);String premiseOntology = head
            + "xmlns:first=\"urn:test#\" xml:base=\"urn:test\"><owl:Ontology/><owl:Thing rdf:about=\"urn:test#Ghent\">"
            + "<first:path><owl:Thing rdf:about=\"urn:test#Antwerp\"/></first:path></owl:Thing><owl:SymmetricProperty rdf:about=\"urn:test#path\"/></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14147);test(premiseOntology, false, true, false, true);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverTestCase3AWebOnt2Ddescription2Dlogic2D901() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14148);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2os06n0ax0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverTestCase3AWebOnt2Ddescription2Dlogic2D901",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14148,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2os06n0ax0(){try{__CLR4_5_2apnapnlvico2an.R.inc(14148);
        __CLR4_5_2apnapnlvico2an.R.inc(14149);String premiseOntology = rdf
            + " xml:base=\"urn:test\"><owl:Ontology/><owl:ObjectProperty rdf:about=\"urn:test#r\"/><owl:ObjectProperty rdf:about=\"urn:test#p\"><rdfs:subPropertyOf rdf:resource=\"urn:test#r\"/><rdfs:range>"
            + "<owl:Class rdf:about=\"urn:test#A\"/></rdfs:range></owl:ObjectProperty><owl:ObjectProperty rdf:about=\"urn:test#q\"><rdfs:subPropertyOf rdf:resource=\"urn:test#r\"/><rdfs:range>"
            + "<owl:Class rdf:about=\"urn:test#B\"/></rdfs:range></owl:ObjectProperty>"
            + "<owl:Class rdf:about=\"urn:test#A\"><owl:disjointWith rdf:resource=\"urn:test#B\"/></owl:Class></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14150);test(premiseOntology, true, true, true, true);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverTestCase3AWebOnt2Ddescription2Dlogic2D902() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14151);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s105fhax3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverTestCase3AWebOnt2Ddescription2Dlogic2D902",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14151,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s105fhax3(){try{__CLR4_5_2apnapnlvico2an.R.inc(14151);
        __CLR4_5_2apnapnlvico2an.R.inc(14152);String premiseOntology = rdf
            + " xml:base=\"urn:test\"><owl:Ontology/><owl:ObjectProperty rdf:about=\"urn:test#r\"/><owl:ObjectProperty rdf:about=\"urn:test#p\"><rdfs:subPropertyOf rdf:resource=\"urn:test#r\"/><rdfs:range>"
            + "<owl:Class rdf:about=\"urn:test#A\"/></rdfs:range></owl:ObjectProperty><owl:ObjectProperty rdf:about=\"urn:test#q\"><rdfs:subPropertyOf rdf:resource=\"urn:test#r\"/><rdfs:range>"
            + "<owl:Class rdf:about=\"urn:test#B\"/></rdfs:range></owl:ObjectProperty>"
            + "<owl:Class rdf:about=\"urn:test#A\"><owl:disjointWith rdf:resource=\"urn:test#B\"/></owl:Class></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14153);test(premiseOntology, true, true, true, true);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverTestCase3AWebOnt2DequivalentClass2D006() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14154);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dkx0dcax6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverTestCase3AWebOnt2DequivalentClass2D006",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14154,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dkx0dcax6(){try{__CLR4_5_2apnapnlvico2an.R.inc(14154);
        __CLR4_5_2apnapnlvico2an.R.inc(14155);String premiseOntology = rdf + " xml:base=\"urn:test\"><owl:Ontology/>"
            + "<owl:Class rdf:about=\"urn:test#A\"/>"
            + "<owl:Class rdf:about=\"urn:test#B\"/></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14156);test(premiseOntology, true, true, true, true);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverTestCase3AWebOnt2Dmiscellaneous2D204() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14157);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29ryffkax9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverTestCase3AWebOnt2Dmiscellaneous2D204",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14157,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29ryffkax9(){try{__CLR4_5_2apnapnlvico2an.R.inc(14157);
        __CLR4_5_2apnapnlvico2an.R.inc(14158);String premiseOntology = head
            + "xmlns=\"http://www.w3.org/1999/xhtml\" xmlns:first=\"urn:test#\" xml:base=\"urn:test\"><owl:Ontology/><owl:FunctionalProperty rdf:about=\"urn:test#fp\"/><owl:DatatypeProperty rdf:about=\"urn:test#fp\"/><owl:Thing>"
            + "<first:fp rdf:parseType=\"Literal\"><span xml:lang='en'><b>Good!</b></span></first:fp>"
            + "<first:fp rdf:parseType=\"Literal\"><span xml:lang='en'><b>Bad!</b></span></first:fp></owl:Thing></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14159);test(premiseOntology, false, false, false, true);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverTestCase3AWebOnt2DunionOf2D003() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14160);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24c6dsraxc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverTestCase3AWebOnt2DunionOf2D003",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14160,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24c6dsraxc(){try{__CLR4_5_2apnapnlvico2an.R.inc(14160);
        __CLR4_5_2apnapnlvico2an.R.inc(14161);String premiseOntology = head
            + "xml:base=\"urn:test\"><owl:Ontology/>"
            + "<owl:Class rdf:about=\"urn:test#A\"><owl:oneOf rdf:parseType=\"Collection\"><owl:Thing rdf:about=\"urn:test#a\"/></owl:oneOf></owl:Class>"
            + "<owl:Class rdf:about=\"urn:test#B\"><owl:oneOf rdf:parseType=\"Collection\"><owl:Thing rdf:about=\"urn:test#b\"/></owl:oneOf></owl:Class>"
            + "<owl:Class rdf:about=\"urn:test#A-and-B\"><owl:oneOf rdf:parseType=\"Collection\"><owl:Thing rdf:about=\"urn:test#a\"/><owl:Thing rdf:about=\"urn:test#b\"/></owl:oneOf></owl:Class></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14162);test(premiseOntology, false, false, false, true);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverTestCase3AWebOnt2DunionOf2D004() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14163);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2136f0aaxf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverTestCase3AWebOnt2DunionOf2D004",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14163,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2136f0aaxf(){try{__CLR4_5_2apnapnlvico2an.R.inc(14163);
        __CLR4_5_2apnapnlvico2an.R.inc(14164);String premiseOntology = rdf
            + " xmlns:first=\"urn:test#\" xmlns:second=\"urn:test#\" xml:base=\"urn:test\"><owl:Ontology/>"
            + "<owl:Class rdf:about=\"urn:test#A-and-B\"><owl:unionOf rdf:parseType=\"Collection\">"
            + "<owl:Class rdf:about=\"urn:test#A\"/>"
            + "<owl:Class rdf:about=\"urn:test#B\"/></owl:unionOf></owl:Class>"
            + "<owl:Class rdf:about=\"urn:test#A\"><owl:oneOf rdf:parseType=\"Collection\"><owl:Thing rdf:about=\"urn:test#a\"/></owl:oneOf></owl:Class>"
            + "<owl:Class rdf:about=\"urn:test#B\"><owl:oneOf rdf:parseType=\"Collection\"><owl:Thing rdf:about=\"urn:test#b\"/></owl:oneOf></owl:Class></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14165);test(premiseOntology, false, false, false, true);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverOwl22Drl2Danonymous2Dindividual() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14166);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2c17f7axi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverOwl22Drl2Danonymous2Dindividual",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14166,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2c17f7axi(){try{__CLR4_5_2apnapnlvico2an.R.inc(14166);
        __CLR4_5_2apnapnlvico2an.R.inc(14167);String premiseOntology = head
            + "xmlns:j.0=\"http://owl2.test/rules#\"><owl:Ontology /><owl:ObjectProperty rdf:about=\"http://owl2.test/rules#op\"/><owl:NamedIndividual rdf:about=\"http://owl2.test/rules#I\"/><owl:NamedIndividual><j.0:op rdf:resource=\"http://owl2.test/rules#I\"/></owl:NamedIndividual></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14168);test(premiseOntology, false, false, true, true);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverOwl22Drl2Dinvalid2Dleftside2Dallvaluesfrom() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14169);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pi5tztaxl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverOwl22Drl2Dinvalid2Dleftside2Dallvaluesfrom",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14169,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pi5tztaxl(){try{__CLR4_5_2apnapnlvico2an.R.inc(14169);
        __CLR4_5_2apnapnlvico2an.R.inc(14170);String premiseOntology = head
            + "xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"><owl:Ontology />"
            + "<owl:Class rdf:about=\"http://owl2.test/rules#C\"/>"
            + "<owl:Class rdf:about=\"http://owl2.test/rules#C1\"/><owl:ObjectProperty rdf:about=\"http://owl2.test/rules#op\"/><owl:Restriction><owl:allValuesFrom rdf:resource=\"http://owl2.test/rules#C1\"/><owl:onProperty rdf:resource=\"http://owl2.test/rules#op\"/><rdfs:subClassOf rdf:resource=\"http://owl2.test/rules#C\"/></owl:Restriction></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14171);test(premiseOntology, false, false, false, true);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverOwl22Drl2Dinvalid2Dleftside2Dmaxcard() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14172);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2b1zwj6axo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverOwl22Drl2Dinvalid2Dleftside2Dmaxcard",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14172,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2b1zwj6axo(){try{__CLR4_5_2apnapnlvico2an.R.inc(14172);
        __CLR4_5_2apnapnlvico2an.R.inc(14173);String premiseOntology = head
            + "xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"><owl:Ontology />"
            + "<owl:Class rdf:about=\"http://owl2.test/rules#C\"/><owl:ObjectProperty rdf:about=\"http://owl2.test/rules#op\"/><owl:Restriction><rdfs:subClassOf rdf:resource=\"http://owl2.test/rules#C\"/><owl:maxCardinality rdf:datatype=\"http://www.w3.org/2001/XMLSchema#nonNegativeInteger\">2</owl:maxCardinality><owl:onProperty rdf:resource=\"http://owl2.test/rules#op\"/></owl:Restriction></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14174);test(premiseOntology, false, false, false, true);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverOwl22Drl2Dinvalid2Doneof() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14175);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2iqiyufaxr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverOwl22Drl2Dinvalid2Doneof",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14175,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2iqiyufaxr(){try{__CLR4_5_2apnapnlvico2an.R.inc(14175);
        __CLR4_5_2apnapnlvico2an.R.inc(14176);String premiseOntology = "<rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\" xmlns:owl=\"http://www.w3.org/2002/07/owl#\"><owl:Ontology />"
            + "<owl:Class rdf:about=\"http://owl2.test/rules#Cb\"><owl:oneOf rdf:parseType=\"Collection\"><owl:Thing rdf:about=\"http://owl2.test/rules#X\"/><owl:Thing rdf:about=\"http://owl2.test/rules#Y\"/></owl:oneOf></owl:Class></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14177);test(premiseOntology, false, false, false, true);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverOwl22Drl2Dinvalid2Dowlreal() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14178);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2k2k9gaxu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverOwl22Drl2Dinvalid2Dowlreal",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14178,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2k2k9gaxu(){try{__CLR4_5_2apnapnlvico2an.R.inc(14178);
        __CLR4_5_2apnapnlvico2an.R.inc(14179);String premiseOntology = head
            + "xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"><owl:Ontology />"
            + "<owl:Class rdf:about=\"http://owl2.test/rules#C_Sub\"><rdfs:subClassOf><owl:Restriction><owl:allValuesFrom rdf:resource=\"http://www.w3.org/2002/07/owl#real\"/><owl:onProperty><owl:DatatypeProperty rdf:about=\"http://owl2.test/rules#p\"/></owl:onProperty></owl:Restriction></rdfs:subClassOf></owl:Class></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14180);test(premiseOntology, false, false, false, true);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverOwl22Drl2Dinvalid2Drightside2Dsomevaluesfrom() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14181);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a8shwvaxx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverOwl22Drl2Dinvalid2Drightside2Dsomevaluesfrom",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14181,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a8shwvaxx(){try{__CLR4_5_2apnapnlvico2an.R.inc(14181);
        __CLR4_5_2apnapnlvico2an.R.inc(14182);String premiseOntology = rdf
            + "><owl:Ontology />"
            + "<owl:Class rdf:about=\"http://owl2.test/rules#C_Sub\"><rdfs:subClassOf><owl:Restriction><owl:someValuesFrom>"
            + "<owl:Class rdf:about=\"http://owl2.test/rules#C1\"/></owl:someValuesFrom><owl:onProperty><owl:ObjectProperty rdf:about=\"http://owl2.test/rules#p\"/></owl:onProperty></owl:Restriction></rdfs:subClassOf></owl:Class></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14183);test(premiseOntology, true, true, false, true);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverOwl22Drl2Dinvalid2Drightside2Dunionof() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14184);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gpfumday0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverOwl22Drl2Dinvalid2Drightside2Dunionof",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14184,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gpfumday0(){try{__CLR4_5_2apnapnlvico2an.R.inc(14184);
        __CLR4_5_2apnapnlvico2an.R.inc(14185);String premiseOntology = head
            + "xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"><owl:Ontology />"
            + "<owl:Class rdf:about=\"http://owl2.test/rules#C_Sub\"><rdfs:subClassOf>"
            + "<owl:Class><owl:unionOf rdf:parseType=\"Collection\">"
            + "<owl:Class rdf:about=\"http://owl2.test/rules#C1\"/>"
            + "<owl:Class rdf:about=\"http://owl2.test/rules#C2\"/></owl:unionOf></owl:Class></rdfs:subClassOf></owl:Class></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14186);test(premiseOntology, false, false, false, true);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverOwl22Drl2Dinvalid2Dunionof() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14187);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2r3098way3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverOwl22Drl2Dinvalid2Dunionof",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14187,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2r3098way3(){try{__CLR4_5_2apnapnlvico2an.R.inc(14187);
        __CLR4_5_2apnapnlvico2an.R.inc(14188);String premiseOntology = "<rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\" xmlns:owl=\"http://www.w3.org/2002/07/owl#\"><owl:Ontology />"
            + "<owl:Class rdf:about=\"http://owl2.test/rules#C\"><owl:unionOf rdf:parseType=\"Collection\">"
            + "<owl:Class rdf:about=\"http://owl2.test/rules#C1\"/>"
            + "<owl:Class rdf:about=\"http://owl2.test/rules#C2\"/></owl:unionOf></owl:Class></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14189);test(premiseOntology, false, false, false, true);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverOwl22Drl2Drules2Dfp2DdifferentFrom() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14190);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wj3ajzay6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverOwl22Drl2Drules2Dfp2DdifferentFrom",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14190,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wj3ajzay6(){try{__CLR4_5_2apnapnlvico2an.R.inc(14190);
        __CLR4_5_2apnapnlvico2an.R.inc(14191);String premiseOntology = head
            + "xmlns:j.0=\"http://owl2.test/rules/\"><owl:Ontology /><owl:FunctionalProperty rdf:about=\"http://owl2.test/rules/fp\"><rdf:type rdf:resource=\"http://www.w3.org/2002/07/owl#ObjectProperty\"/></owl:FunctionalProperty><owl:NamedIndividual rdf:about=\"http://owl2.test/rules/Y2\"><j.0:fp><owl:NamedIndividual rdf:about=\"http://owl2.test/rules/X2\"/></j.0:fp></owl:NamedIndividual><owl:NamedIndividual rdf:about=\"http://owl2.test/rules/X1\"><owl:differentFrom rdf:resource=\"http://owl2.test/rules/X2\"/></owl:NamedIndividual><owl:NamedIndividual rdf:about=\"http://owl2.test/rules/Y1\"><j.0:fp rdf:resource=\"http://owl2.test/rules/X1\"/></owl:NamedIndividual></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14192);test(premiseOntology, false, false, true, true);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverOwl22Drl2Drules2Difp2DdifferentFrom() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14193);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gwz7r6ay9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverOwl22Drl2Drules2Difp2DdifferentFrom",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14193,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gwz7r6ay9(){try{__CLR4_5_2apnapnlvico2an.R.inc(14193);
        __CLR4_5_2apnapnlvico2an.R.inc(14194);String premiseOntology = head
            + "xmlns:j.0=\"http://owl2.test/rules/\"><owl:Ontology /><owl:InverseFunctionalProperty rdf:about=\"http://owl2.test/rules/ifp\"><rdf:type rdf:resource=\"http://www.w3.org/2002/07/owl#ObjectProperty\"/></owl:InverseFunctionalProperty><owl:NamedIndividual rdf:about=\"http://owl2.test/rules/Y2\"><j.0:ifp><owl:NamedIndividual rdf:about=\"http://owl2.test/rules/X2\"/></j.0:ifp></owl:NamedIndividual><owl:NamedIndividual rdf:about=\"http://owl2.test/rules/X1\"/><owl:NamedIndividual rdf:about=\"http://owl2.test/rules/Y1\"><owl:differentFrom rdf:resource=\"http://owl2.test/rules/Y2\"/><j.0:ifp rdf:resource=\"http://owl2.test/rules/X1\"/></owl:NamedIndividual></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14195);test(premiseOntology, false, false, true, true);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverOwl22Drl2Dinvalid2Dmincard() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14196);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2i1os7oayc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverOwl22Drl2Dinvalid2Dmincard",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14196,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2i1os7oayc(){try{__CLR4_5_2apnapnlvico2an.R.inc(14196);
        __CLR4_5_2apnapnlvico2an.R.inc(14197);String premiseOntology = head
            + "xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\" xmlns:j.0=\"http://owl2.test/rules#\"><owl:Ontology rdf:about=\"http://org.semanticweb.ontologies/Ontology1232054810511161000\"/>"
            + "<owl:Class rdf:about=\"http://owl2.test/rules#C\"><rdfs:subClassOf><owl:Restriction><owl:minCardinality rdf:datatype=\"http://www.w3.org/2001/XMLSchema#nonNegativeInteger\">1</owl:minCardinality><owl:onProperty><owl:ObjectProperty rdf:about=\"http://owl2.test/rules#OP\"/></owl:onProperty></owl:Restriction></rdfs:subClassOf></owl:Class>"
            + "<owl:Class rdf:about=\"http://www.w3.org/2002/07/owl#Thing\"/><j.0:C rdf:about=\"http://owl2.test/rules#c\"><rdf:type rdf:resource=\"http://www.w3.org/2002/07/owl#Thing\"/></j.0:C></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14198);test(premiseOntology, false, false, false, true);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverOwl22Drl2Dvalid2Doneof() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14199);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tz10wyayf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverOwl22Drl2Dvalid2Doneof",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14199,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tz10wyayf(){try{__CLR4_5_2apnapnlvico2an.R.inc(14199);
        __CLR4_5_2apnapnlvico2an.R.inc(14200);String premiseOntology = rdf
            + "><owl:Ontology />"
            + "<owl:Class rdf:about=\"http://owl2.test/rules#Cb\"/><owl:NamedIndividual rdf:about=\"http://owl2.test/rules#X\"/><owl:NamedIndividual rdf:about=\"http://owl2.test/rules#Y\"/><rdf:Description><rdfs:subClassOf rdf:resource=\"http://owl2.test/rules#Cb\"/><owl:oneOf rdf:parseType=\"Collection\"><owl:NamedIndividual rdf:about=\"http://owl2.test/rules#X\"/><owl:NamedIndividual rdf:about=\"http://owl2.test/rules#Y\"/></owl:oneOf></rdf:Description></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14201);test(premiseOntology, false, false, true, true);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverOwl22Drl2Dvalid2Drightside2Dallvaluesfrom() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14202);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tes0j3ayi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverOwl22Drl2Dvalid2Drightside2Dallvaluesfrom",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14202,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tes0j3ayi(){try{__CLR4_5_2apnapnlvico2an.R.inc(14202);
        __CLR4_5_2apnapnlvico2an.R.inc(14203);String premiseOntology = rdf
            + "><owl:Ontology />"
            + "<owl:Class rdf:about=\"http://owl2.test/rules#C\"><rdfs:subClassOf><owl:Restriction><owl:onProperty><owl:ObjectProperty rdf:about=\"http://owl2.test/rules#op\"/></owl:onProperty><owl:allValuesFrom>"
            + "<owl:Class rdf:about=\"http://owl2.test/rules#C1\"/></owl:allValuesFrom></owl:Restriction></rdfs:subClassOf></owl:Class></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14204);test(premiseOntology, false, false, true, true);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverPlus2Dand2Dminus2D02Dintegers() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14205);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29yp3axayl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverPlus2Dand2Dminus2D02Dintegers",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14205,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29yp3axayl(){try{__CLR4_5_2apnapnlvico2an.R.inc(14205);
        __CLR4_5_2apnapnlvico2an.R.inc(14206);String premiseOntology = "Prefix(:=<http://example.org/>) Prefix(xsd:=<http://www.w3.org/2001/XMLSchema#>) Ontology( Declaration(NamedIndividual(:a)) Declaration(DataProperty(:dp)) Declaration(Class(:A)) SubClassOf(:A DataAllValuesFrom(:dp DataOneOf(\"0\"^^xsd:integer)) ) ClassAssertion(:A :a) ClassAssertion( DataSomeValuesFrom(:dp DataOneOf(\"-0\"^^xsd:integer)) :a ))";
        __CLR4_5_2apnapnlvico2an.R.inc(14207);test(premiseOntology, false, false, false, true);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverRdfbased2Dsem2Dbool2Dcomplement2Dinst() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14208);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mv3ny5ayo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverRdfbased2Dsem2Dbool2Dcomplement2Dinst",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14208,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mv3ny5ayo(){try{__CLR4_5_2apnapnlvico2an.R.inc(14208);
        __CLR4_5_2apnapnlvico2an.R.inc(14209);String premiseOntology = head
            + "xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\" xmlns:ex=\"http://www.example.org#\" xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"><ex:c1 rdf:about=\"http://www.example.org#x\"><rdf:type rdf:resource=\"http://www.example.org#c2\"/></ex:c1><rdf:Description rdf:about=\"http://www.example.org#c1\"><owl:complementOf rdf:resource=\"http://www.example.org#c2\"/></rdf:Description></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14210);test(premiseOntology, false, false, false, false);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverRdfbased2Dsem2Dbool2Dintersection2Dinst2Dcomp() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14211);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uxo2m9ayr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverRdfbased2Dsem2Dbool2Dintersection2Dinst2Dcomp",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14211,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uxo2m9ayr(){try{__CLR4_5_2apnapnlvico2an.R.inc(14211);
        __CLR4_5_2apnapnlvico2an.R.inc(14212);String premiseOntology = head
            + "xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\" xmlns:ex=\"http://www.example.org#\" xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"><ex:x rdf:about=\"http://www.example.org#z\"><rdf:type rdf:resource=\"http://www.example.org#y\"/></ex:x><rdf:Description rdf:about=\"http://www.example.org#c\"><owl:intersectionOf rdf:parseType=\"Collection\"><rdf:Description rdf:about=\"http://www.example.org#x\"/><rdf:Description rdf:about=\"http://www.example.org#y\"/></owl:intersectionOf></rdf:Description></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14213);test(premiseOntology, false, false, false, false);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverRdfbased2Dsem2Dbool2Dintersection2Dinst2Dexpr() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14214);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ozabh5ayu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverRdfbased2Dsem2Dbool2Dintersection2Dinst2Dexpr",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14214,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ozabh5ayu(){try{__CLR4_5_2apnapnlvico2an.R.inc(14214);
        __CLR4_5_2apnapnlvico2an.R.inc(14215);String premiseOntology = head
            + "xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\" xmlns:ex=\"http://www.example.org#\" xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"><ex:c rdf:about=\"http://www.example.org#z\"/><rdf:Description rdf:nodeID=\"A0\"><rdf:first rdf:resource=\"http://www.example.org#x\"/><rdf:rest rdf:parseType=\"Collection\"><rdf:Description rdf:about=\"http://www.example.org#y\"/></rdf:rest></rdf:Description><rdf:Description rdf:about=\"http://www.example.org#c\"><owl:intersectionOf rdf:nodeID=\"A0\"/></rdf:Description></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14216);test(premiseOntology, false, false, false, false);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverRdfbased2Dsem2Dbool2Dintersection2Dterm() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14217);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2oxmq7aayx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverRdfbased2Dsem2Dbool2Dintersection2Dterm",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14217,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2oxmq7aayx(){try{__CLR4_5_2apnapnlvico2an.R.inc(14217);
        __CLR4_5_2apnapnlvico2an.R.inc(14218);String premiseOntology = head
            + "xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\" xmlns:ex=\"http://www.example.org#\" xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"><rdf:Description rdf:about=\"http://www.example.org#c\"><owl:intersectionOf rdf:parseType=\"Collection\"><rdf:Description rdf:about=\"http://www.example.org#x\"/><rdf:Description rdf:about=\"http://www.example.org#y\"/></owl:intersectionOf></rdf:Description></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14219);test(premiseOntology, false, false, false, false);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverRdfbased2Dsem2Dbool2Dunion2Dinst2Dcomp() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14220);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24gfdm1az0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverRdfbased2Dsem2Dbool2Dunion2Dinst2Dcomp",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14220,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24gfdm1az0(){try{__CLR4_5_2apnapnlvico2an.R.inc(14220);
        __CLR4_5_2apnapnlvico2an.R.inc(14221);String premiseOntology = head
            + "xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\" xmlns:ex=\"http://www.example.org#\" xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"><ex:x rdf:about=\"http://www.example.org#z\"/><rdf:Description rdf:about=\"http://www.example.org#c\"><owl:unionOf rdf:parseType=\"Collection\"><rdf:Description rdf:about=\"http://www.example.org#x\"/><rdf:Description rdf:about=\"http://www.example.org#y\"/></owl:unionOf></rdf:Description></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14222);test(premiseOntology, false, false, false, false);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverRdfbased2Dsem2Dbool2Dunion2Dterm() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14223);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ulv8akaz3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverRdfbased2Dsem2Dbool2Dunion2Dterm",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14223,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ulv8akaz3(){try{__CLR4_5_2apnapnlvico2an.R.inc(14223);
        __CLR4_5_2apnapnlvico2an.R.inc(14224);String premiseOntology = head
            + "xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\" xmlns:ex=\"http://www.example.org#\" xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"><rdf:Description rdf:about=\"http://www.example.org#c\"><owl:unionOf rdf:parseType=\"Collection\"><rdf:Description rdf:about=\"http://www.example.org#x\"/><rdf:Description rdf:about=\"http://www.example.org#y\"/></owl:unionOf></rdf:Description></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14225);test(premiseOntology, false, false, false, false);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverRdfbased2Dsem2Dchain2Ddef() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14226);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2oygrzfaz6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverRdfbased2Dsem2Dchain2Ddef",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14226,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2oygrzfaz6(){try{__CLR4_5_2apnapnlvico2an.R.inc(14226);
        __CLR4_5_2apnapnlvico2an.R.inc(14227);String premiseOntology = head
            + "xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\" xmlns:ex=\"http://www.example.org#\" xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"><rdf:Description rdf:about=\"http://www.example.org#x\"><ex:p1><rdf:Description rdf:about=\"http://www.example.org#y\"><ex:p2 rdf:resource=\"http://www.example.org#z\"/></rdf:Description></ex:p1></rdf:Description><rdf:Description rdf:about=\"http://www.example.org#p\"><owl:propertyChainAxiom rdf:parseType=\"Collection\"><rdf:Description rdf:about=\"http://www.example.org#p1\"/><rdf:Description rdf:about=\"http://www.example.org#p2\"/></owl:propertyChainAxiom></rdf:Description></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14228);test(premiseOntology, false, false, false, false);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverRdfbased2Dsem2Dchar2Dasymmetric2Dinst() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14229);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22bpc93az9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverRdfbased2Dsem2Dchar2Dasymmetric2Dinst",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14229,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22bpc93az9(){try{__CLR4_5_2apnapnlvico2an.R.inc(14229);
        __CLR4_5_2apnapnlvico2an.R.inc(14230);String premiseOntology = head
            + "xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\" xmlns:ex=\"http://www.example.org#\" xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"><owl:AsymmetricProperty rdf:about=\"http://www.example.org#p\"/><rdf:Description rdf:about=\"http://www.example.org#x\"><ex:p><rdf:Description rdf:about=\"http://www.example.org#y\"><ex:p rdf:resource=\"http://www.example.org#x\"/></rdf:Description></ex:p></rdf:Description></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14231);test(premiseOntology, false, false, false, false);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverRdfbased2Dsem2Dchar2Dfunctional2Dinst() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14232);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2u7ta56azc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverRdfbased2Dsem2Dchar2Dfunctional2Dinst",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14232,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2u7ta56azc(){try{__CLR4_5_2apnapnlvico2an.R.inc(14232);
        __CLR4_5_2apnapnlvico2an.R.inc(14233);String premiseOntology = head
            + "xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\" xmlns:ex=\"http://www.example.org#\" xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"><owl:FunctionalProperty rdf:about=\"http://www.example.org#p\"/><rdf:Description rdf:about=\"http://www.example.org#x\"><ex:p rdf:resource=\"http://www.example.org#y1\"/><ex:p rdf:resource=\"http://www.example.org#y2\"/></rdf:Description></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14234);test(premiseOntology, false, false, false, false);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverRdfbased2Dsem2Dchar2Dinversefunc2Ddata() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14235);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s2xqqbazf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverRdfbased2Dsem2Dchar2Dinversefunc2Ddata",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14235,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s2xqqbazf(){try{__CLR4_5_2apnapnlvico2an.R.inc(14235);
        __CLR4_5_2apnapnlvico2an.R.inc(14236);String premiseOntology = head
            + "xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\" xmlns:ex=\"http://www.example.org#\" xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"><owl:InverseFunctionalProperty rdf:about=\"http://www.example.org#p\"><rdf:type rdf:resource=\"http://www.w3.org/2002/07/owl#DatatypeProperty\"/></owl:InverseFunctionalProperty><rdf:Description rdf:about=\"http://www.example.org#x1\"><ex:p>data</ex:p></rdf:Description><rdf:Description rdf:about=\"http://www.example.org#x2\"><ex:p>data</ex:p></rdf:Description></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14237);test(premiseOntology, false, false, false, false);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverRdfbased2Dsem2Dchar2Dirreflexive2Dinst() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14238);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2exdoeaazi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverRdfbased2Dsem2Dchar2Dirreflexive2Dinst",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14238,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2exdoeaazi(){try{__CLR4_5_2apnapnlvico2an.R.inc(14238);
        __CLR4_5_2apnapnlvico2an.R.inc(14239);String premiseOntology = head
            + "xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\" xmlns:ex=\"http://www.example.org#\" xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"><owl:IrreflexiveProperty rdf:about=\"http://www.example.org#p\"/><rdf:Description rdf:about=\"http://www.example.org#x\"><ex:p rdf:resource=\"http://www.example.org#x\"/></rdf:Description></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14240);test(premiseOntology, false, false, false, false);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverRdfbased2Dsem2Denum2Dinst2Dincluded() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14241);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xqs0sqazl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverRdfbased2Dsem2Denum2Dinst2Dincluded",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14241,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xqs0sqazl(){try{__CLR4_5_2apnapnlvico2an.R.inc(14241);
        __CLR4_5_2apnapnlvico2an.R.inc(14242);String premiseOntology = head
            + "xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\" xmlns:ex=\"http://www.example.org#\" xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"><rdf:Description rdf:about=\"http://www.example.org#e\"><owl:oneOf rdf:parseType=\"Collection\"><rdf:Description rdf:about=\"http://www.example.org#x\"/><rdf:Description rdf:about=\"http://www.example.org#y\"/></owl:oneOf></rdf:Description></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14243);test(premiseOntology, false, false, false, false);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverRdfbased2Dsem2Deqdis2Ddifferent2Dirrflxv() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14244);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23tc473azo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverRdfbased2Dsem2Deqdis2Ddifferent2Dirrflxv",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14244,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23tc473azo(){try{__CLR4_5_2apnapnlvico2an.R.inc(14244);
        __CLR4_5_2apnapnlvico2an.R.inc(14245);String premiseOntology = head
            + "xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\" xmlns:ex=\"http://www.example.org#\" xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"><rdf:Description rdf:about=\"http://www.example.org#x\"><owl:differentFrom rdf:resource=\"http://www.example.org#x\"/></rdf:Description></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14246);test(premiseOntology, false, false, false, false);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverRdfbased2Dsem2Deqdis2Ddisclass2Deqclass() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14247);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xzmq8vazr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverRdfbased2Dsem2Deqdis2Ddisclass2Deqclass",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14247,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xzmq8vazr(){try{__CLR4_5_2apnapnlvico2an.R.inc(14247);
        __CLR4_5_2apnapnlvico2an.R.inc(14248);String premiseOntology = head
            + "xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\" xmlns:ex=\"http://www.example.org#\" xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"><ex:c1 rdf:about=\"http://www.example.org#x\"/><ex:c2 rdf:about=\"http://www.example.org#y\"/><rdf:Description rdf:about=\"http://www.example.org#c1\"><owl:equivalentClass rdf:resource=\"http://www.example.org#c2\"/><owl:disjointWith rdf:resource=\"http://www.example.org#c2\"/></rdf:Description></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14249);test(premiseOntology, false, false, false, false);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverRdfbased2Dsem2Deqdis2Ddisclass2Dinst() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14250);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29s1ts1azu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverRdfbased2Dsem2Deqdis2Ddisclass2Dinst",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14250,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29s1ts1azu(){try{__CLR4_5_2apnapnlvico2an.R.inc(14250);
        __CLR4_5_2apnapnlvico2an.R.inc(14251);String premiseOntology = head
            + "xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\" xmlns:ex=\"http://www.example.org#\" xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"><ex:c1 rdf:about=\"http://www.example.org#w\"><rdf:type rdf:resource=\"http://www.example.org#c2\"/></ex:c1><rdf:Description rdf:about=\"http://www.example.org#c1\"><owl:disjointWith rdf:resource=\"http://www.example.org#c2\"/></rdf:Description></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14252);test(premiseOntology, false, false, false, false);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverRdfbased2Dsem2Deqdis2Ddisclass2Dirrflxv() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14253);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a4se00azx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverRdfbased2Dsem2Deqdis2Ddisclass2Dirrflxv",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14253,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a4se00azx(){try{__CLR4_5_2apnapnlvico2an.R.inc(14253);
        __CLR4_5_2apnapnlvico2an.R.inc(14254);String premiseOntology = head
            + "xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\" xmlns:ex=\"http://www.example.org#\" xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"><ex:c rdf:about=\"http://www.example.org#x\"/><rdf:Description rdf:about=\"http://www.example.org#c\"><owl:disjointWith rdf:resource=\"http://www.example.org#c\"/></rdf:Description></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14255);test(premiseOntology, false, false, false, false);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverRdfbased2Dsem2Deqdis2Ddisprop2Deqprop() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14256);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hus0gvb00();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverRdfbased2Dsem2Deqdis2Ddisprop2Deqprop",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14256,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hus0gvb00(){try{__CLR4_5_2apnapnlvico2an.R.inc(14256);
        __CLR4_5_2apnapnlvico2an.R.inc(14257);String premiseOntology = head
            + "xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\" xmlns:ex=\"http://www.example.org#\" xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"><rdf:Description rdf:about=\"http://www.example.org#s2\"><ex:p2 rdf:resource=\"http://www.example.org#o2\"/></rdf:Description><rdf:Description rdf:about=\"http://www.example.org#s1\"><ex:p1 rdf:resource=\"http://www.example.org#o1\"/></rdf:Description><rdf:Description rdf:about=\"http://www.example.org#p1\"><owl:equivalentProperty rdf:resource=\"http://www.example.org#p2\"/><owl:propertyDisjointWith rdf:resource=\"http://www.example.org#p2\"/></rdf:Description></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14258);test(premiseOntology, false, false, false, false);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverRdfbased2Dsem2Deqdis2Ddisprop2Dinst() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14259);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dux1vcb03();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverRdfbased2Dsem2Deqdis2Ddisprop2Dinst",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14259,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dux1vcb03(){try{__CLR4_5_2apnapnlvico2an.R.inc(14259);
        __CLR4_5_2apnapnlvico2an.R.inc(14260);String premiseOntology = head
            + "xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\" xmlns:ex=\"http://www.example.org#\" xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"><rdf:Description rdf:about=\"http://www.example.org#s\"><ex:p1 rdf:resource=\"http://www.example.org#o\"/><ex:p2 rdf:resource=\"http://www.example.org#o\"/></rdf:Description><rdf:Description rdf:about=\"http://www.example.org#p1\"><owl:propertyDisjointWith rdf:resource=\"http://www.example.org#p2\"/></rdf:Description></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14261);test(premiseOntology, false, false, false, false);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverRdfbased2Dsem2Deqdis2Ddisprop2Dirrflxv() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14262);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27752bbb06();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverRdfbased2Dsem2Deqdis2Ddisprop2Dirrflxv",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14262,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27752bbb06(){try{__CLR4_5_2apnapnlvico2an.R.inc(14262);
        __CLR4_5_2apnapnlvico2an.R.inc(14263);String premiseOntology = head
            + "xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\" xmlns:ex=\"http://www.example.org#\" xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"><rdf:Description rdf:about=\"http://www.example.org#s\"><ex:p rdf:resource=\"http://www.example.org#o\"/></rdf:Description><rdf:Description rdf:about=\"http://www.example.org#p\"><owl:propertyDisjointWith rdf:resource=\"http://www.example.org#p\"/></rdf:Description></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14264);test(premiseOntology, false, false, false, false);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverRdfbased2Dsem2Deqdis2Deqclass2Dinst() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14265);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2894sj7b09();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverRdfbased2Dsem2Deqdis2Deqclass2Dinst",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14265,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2894sj7b09(){try{__CLR4_5_2apnapnlvico2an.R.inc(14265);
        __CLR4_5_2apnapnlvico2an.R.inc(14266);String premiseOntology = head
            + "xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\" xmlns:ex=\"http://www.example.org#\" xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"><ex:c1 rdf:about=\"http://www.example.org#x\"/><ex:c2 rdf:about=\"http://www.example.org#y\"/><rdf:Description rdf:about=\"http://www.example.org#c1\"><owl:equivalentClass rdf:resource=\"http://www.example.org#c2\"/></rdf:Description></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14267);test(premiseOntology, false, false, false, false);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverRdfbased2Dsem2Deqdis2Deqclass2Dsubclass2D2() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14268);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wjwg1jb0c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverRdfbased2Dsem2Deqdis2Deqclass2Dsubclass2D2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14268,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wjwg1jb0c(){try{__CLR4_5_2apnapnlvico2an.R.inc(14268);
        __CLR4_5_2apnapnlvico2an.R.inc(14269);String premiseOntology = head
            + "xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\" xmlns:ex=\"http://www.example.org#\" xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"><rdf:Description rdf:about=\"http://www.example.org#c2\"><rdfs:subClassOf><rdf:Description rdf:about=\"http://www.example.org#c1\"><rdfs:subClassOf rdf:resource=\"http://www.example.org#c2\"/></rdf:Description></rdfs:subClassOf></rdf:Description></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14270);test(premiseOntology, false, false, false, false);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverRdfbased2Dsem2Deqdis2Deqclass2Dsubst() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14271);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21z3simb0f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverRdfbased2Dsem2Deqdis2Deqclass2Dsubst",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14271,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21z3simb0f(){try{__CLR4_5_2apnapnlvico2an.R.inc(14271);
        __CLR4_5_2apnapnlvico2an.R.inc(14272);String premiseOntology = head
            + "xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\" xmlns:ex=\"http://www.example.org#\" xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"><rdf:Description rdf:about=\"http://www.example.org#c1\"><rdfs:subClassOf><rdf:Description rdf:about=\"http://www.example.org#c2\"><owl:equivalentClass rdf:resource=\"http://www.example.org#d2\"/></rdf:Description></rdfs:subClassOf><owl:equivalentClass rdf:resource=\"http://www.example.org#d1\"/></rdf:Description></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14273);test(premiseOntology, false, false, false, false);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverRdfbased2Dsem2Deqdis2Deqprop2Dinst() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14274);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26t8oaib0i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverRdfbased2Dsem2Deqdis2Deqprop2Dinst",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14274,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26t8oaib0i(){try{__CLR4_5_2apnapnlvico2an.R.inc(14274);
        __CLR4_5_2apnapnlvico2an.R.inc(14275);String premiseOntology = head
            + "xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\" xmlns:ex=\"http://www.example.org#\" xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"><rdf:Description rdf:about=\"http://www.example.org#s2\"><ex:p2 rdf:resource=\"http://www.example.org#o2\"/></rdf:Description><rdf:Description rdf:about=\"http://www.example.org#s1\"><ex:p1 rdf:resource=\"http://www.example.org#o1\"/></rdf:Description><rdf:Description rdf:about=\"http://www.example.org#p1\"><owl:equivalentProperty rdf:resource=\"http://www.example.org#p2\"/></rdf:Description></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14276);test(premiseOntology, false, false, false, false);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverRdfbased2Dsem2Deqdis2Deqprop2Dsubprop2D2() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14277);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kz3ootb0l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverRdfbased2Dsem2Deqdis2Deqprop2Dsubprop2D2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14277,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kz3ootb0l(){try{__CLR4_5_2apnapnlvico2an.R.inc(14277);
        __CLR4_5_2apnapnlvico2an.R.inc(14278);String premiseOntology = head
            + "xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\" xmlns:ex=\"http://www.example.org#\" xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"><rdf:Description rdf:about=\"http://www.example.org#p2\"><rdfs:subPropertyOf><rdf:Description rdf:about=\"http://www.example.org#p1\"><rdfs:subPropertyOf rdf:resource=\"http://www.example.org#p2\"/></rdf:Description></rdfs:subPropertyOf></rdf:Description></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14279);test(premiseOntology, false, false, false, false);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverRdfbased2Dsem2Deqdis2Deqprop2Dsubst() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14280);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s733qnb0o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverRdfbased2Dsem2Deqdis2Deqprop2Dsubst",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14280,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s733qnb0o(){try{__CLR4_5_2apnapnlvico2an.R.inc(14280);
        __CLR4_5_2apnapnlvico2an.R.inc(14281);String premiseOntology = head
            + "xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\" xmlns:ex=\"http://www.example.org#\" xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"><rdf:Description rdf:about=\"http://www.example.org#p1\"><rdfs:subPropertyOf><rdf:Description rdf:about=\"http://www.example.org#p2\"><owl:equivalentProperty rdf:resource=\"http://www.example.org#q2\"/></rdf:Description></rdfs:subPropertyOf><owl:equivalentProperty rdf:resource=\"http://www.example.org#q1\"/></rdf:Description></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14282);test(premiseOntology, false, false, false, false);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverRdfbased2Dsem2Deqdis2Dsameas2Drflxv() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14283);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xay57pb0r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverRdfbased2Dsem2Deqdis2Dsameas2Drflxv",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14283,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xay57pb0r(){try{__CLR4_5_2apnapnlvico2an.R.inc(14283);
        __CLR4_5_2apnapnlvico2an.R.inc(14284);String premiseOntology = head
            + "xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\" xmlns:ex=\"http://www.example.org#\" xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"><rdf:Description rdf:about=\"http://www.example.org#s\"><ex:p rdf:resource=\"http://www.example.org#o\"/></rdf:Description></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14285);test(premiseOntology, false, false, false, false);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverRdfbased2Dsem2Deqdis2Dsameas2Dsubst() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14286);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2evc38ab0u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverRdfbased2Dsem2Deqdis2Dsameas2Dsubst",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14286,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2evc38ab0u(){try{__CLR4_5_2apnapnlvico2an.R.inc(14286);
        __CLR4_5_2apnapnlvico2an.R.inc(14287);String premiseOntology = head
            + "xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\" xmlns:ex=\"http://www.example.org#\" xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"><rdf:Description rdf:about=\"http://www.example.org#s2\"><owl:sameAs><rdf:Description rdf:about=\"http://www.example.org#s1\"><ex:p1 rdf:resource=\"http://www.example.org#o1\"/></rdf:Description></owl:sameAs></rdf:Description><rdf:Description rdf:about=\"http://www.example.org#o2\"><owl:sameAs rdf:resource=\"http://www.example.org#o1\"/></rdf:Description><rdf:Description rdf:about=\"http://www.example.org#p2\"><owl:sameAs rdf:resource=\"http://www.example.org#p1\"/></rdf:Description></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14288);test(premiseOntology, false, false, false, false);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverRdfbased2Dsem2Dinv2Dinst() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14289);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ibib1wb0x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverRdfbased2Dsem2Dinv2Dinst",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14289,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ibib1wb0x(){try{__CLR4_5_2apnapnlvico2an.R.inc(14289);
        __CLR4_5_2apnapnlvico2an.R.inc(14290);String premiseOntology = head
            + "xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\" xmlns:ex=\"http://www.example.org#\" xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"><rdf:Description rdf:about=\"http://www.example.org#s2\"><ex:q rdf:resource=\"http://www.example.org#o2\"/></rdf:Description><rdf:Description rdf:about=\"http://www.example.org#s1\"><ex:p rdf:resource=\"http://www.example.org#o1\"/></rdf:Description><rdf:Description rdf:about=\"http://www.example.org#q\"><owl:inverseOf rdf:resource=\"http://www.example.org#p\"/></rdf:Description></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14291);test(premiseOntology, false, false, false, false);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverRdfbased2Dsem2Dkey2Ddef() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14292);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2430rw7b10();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverRdfbased2Dsem2Dkey2Ddef",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14292,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2430rw7b10(){try{__CLR4_5_2apnapnlvico2an.R.inc(14292);
        __CLR4_5_2apnapnlvico2an.R.inc(14293);String premiseOntology = head
            + "xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\" xmlns:ex=\"http://www.example.org#\" xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"><ex:c rdf:about=\"http://www.example.org#x\"><ex:p1 rdf:resource=\"http://www.example.org#z\"/><ex:p2>data</ex:p2></ex:c><ex:c rdf:about=\"http://www.example.org#y\"><ex:p1 rdf:resource=\"http://www.example.org#z\"/><ex:p2>data</ex:p2></ex:c><rdf:Description rdf:about=\"http://www.example.org#c\"><owl:hasKey rdf:parseType=\"Collection\"><rdf:Description rdf:about=\"http://www.example.org#p1\"/><rdf:Description rdf:about=\"http://www.example.org#p2\"/></owl:hasKey></rdf:Description></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14294);test(premiseOntology, false, false, false, false);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverRdfbased2Dsem2Dndis2Dalldisjointclasses2Dfw() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14295);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mh0wlbb13();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverRdfbased2Dsem2Dndis2Dalldisjointclasses2Dfw",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14295,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mh0wlbb13(){try{__CLR4_5_2apnapnlvico2an.R.inc(14295);
        __CLR4_5_2apnapnlvico2an.R.inc(14296);String premiseOntology = head
            + "xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\" xmlns:ex=\"http://www.example.org#\" xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"><owl:AllDisjointClasses rdf:about=\"http://www.example.org#z\"><owl:members rdf:parseType=\"Collection\"><rdf:Description rdf:about=\"http://www.example.org#c1\"/><rdf:Description rdf:about=\"http://www.example.org#c2\"/><rdf:Description rdf:about=\"http://www.example.org#c3\"/></owl:members></owl:AllDisjointClasses><ex:c1 rdf:about=\"http://www.example.org#w\"><rdf:type rdf:resource=\"http://www.example.org#c2\"/></ex:c1></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14297);test(premiseOntology, false, false, false, false);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverRdfbased2Dsem2Dndis2Dalldisjointproperties2Dfw() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14298);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23wk65ob16();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverRdfbased2Dsem2Dndis2Dalldisjointproperties2Dfw",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14298,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23wk65ob16(){try{__CLR4_5_2apnapnlvico2an.R.inc(14298);
        __CLR4_5_2apnapnlvico2an.R.inc(14299);String premiseOntology = head
            + "xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\" xmlns:ex=\"http://www.example.org#\" xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"><owl:AllDisjointProperties rdf:about=\"http://www.example.org#z\"><owl:members rdf:parseType=\"Collection\"><rdf:Description rdf:about=\"http://www.example.org#p1\"/><rdf:Description rdf:about=\"http://www.example.org#p2\"/><rdf:Description rdf:about=\"http://www.example.org#p3\"/></owl:members></owl:AllDisjointProperties><rdf:Description rdf:about=\"http://www.example.org#s\"><ex:p1 rdf:resource=\"http://www.example.org#o\"/><ex:p2 rdf:resource=\"http://www.example.org#o\"/></rdf:Description></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14300);test(premiseOntology, false, false, false, false);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverRdfbased2Dsem2Dnpa2Ddat2Dfw() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14301);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ssc7kcb19();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverRdfbased2Dsem2Dnpa2Ddat2Dfw",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14301,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ssc7kcb19(){try{__CLR4_5_2apnapnlvico2an.R.inc(14301);
        __CLR4_5_2apnapnlvico2an.R.inc(14302);String premiseOntology = head
            + "xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\" xmlns:ex=\"http://www.example.org#\" xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"><rdf:Description rdf:about=\"http://www.example.org#z\"><owl:sourceIndividual><rdf:Description rdf:about=\"http://www.example.org#s\"><ex:p>data</ex:p></rdf:Description></owl:sourceIndividual><owl:assertionProperty rdf:resource=\"http://www.example.org#p\"/><owl:targetValue>data</owl:targetValue></rdf:Description></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14303);test(premiseOntology, false, false, false, false);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverRdfbased2Dsem2Dnpa2Dind2Dfw() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14304);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vqht2kb1c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverRdfbased2Dsem2Dnpa2Dind2Dfw",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14304,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vqht2kb1c(){try{__CLR4_5_2apnapnlvico2an.R.inc(14304);
        __CLR4_5_2apnapnlvico2an.R.inc(14305);String premiseOntology = head
            + "xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\" xmlns:ex=\"http://www.example.org#\" xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"><rdf:Description rdf:about=\"http://www.example.org#z\"><owl:sourceIndividual><rdf:Description rdf:about=\"http://www.example.org#s\"><ex:p rdf:resource=\"http://www.example.org#o\"/></rdf:Description></owl:sourceIndividual><owl:assertionProperty rdf:resource=\"http://www.example.org#p\"/><owl:targetIndividual rdf:resource=\"http://www.example.org#o\"/></rdf:Description></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14306);test(premiseOntology, false, false, false, false);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverRdfbased2Dsem2Drdfs2Ddomain2Dcond() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14307);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2k2qo0kb1f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverRdfbased2Dsem2Drdfs2Ddomain2Dcond",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14307,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2k2qo0kb1f(){try{__CLR4_5_2apnapnlvico2an.R.inc(14307);
        __CLR4_5_2apnapnlvico2an.R.inc(14308);String premiseOntology = head
            + "xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\" xmlns:ex=\"http://www.example.org#\" xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"><rdf:Description rdf:about=\"http://www.example.org#u\"><ex:p rdf:resource=\"http://www.example.org#v\"/></rdf:Description><rdf:Description rdf:about=\"http://www.example.org#p\"><rdfs:domain rdf:resource=\"http://www.example.org#c\"/></rdf:Description></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14309);test(premiseOntology, false, false, false, false);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverRdfbased2Dsem2Drdfs2Drange2Dcond() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14310);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23hesjvb1i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverRdfbased2Dsem2Drdfs2Drange2Dcond",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14310,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23hesjvb1i(){try{__CLR4_5_2apnapnlvico2an.R.inc(14310);
        __CLR4_5_2apnapnlvico2an.R.inc(14311);String premiseOntology = head
            + "xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\" xmlns:ex=\"http://www.example.org#\" xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"><rdf:Description rdf:about=\"http://www.example.org#u\"><ex:p rdf:resource=\"http://www.example.org#v\"/></rdf:Description><rdf:Description rdf:about=\"http://www.example.org#p\"><rdfs:range rdf:resource=\"http://www.example.org#c\"/></rdf:Description></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14312);test(premiseOntology, false, false, false, false);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverRdfbased2Dsem2Drdfs2Dsubclass2Dcond() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14313);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_216my00b1l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverRdfbased2Dsem2Drdfs2Dsubclass2Dcond",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14313,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_216my00b1l(){try{__CLR4_5_2apnapnlvico2an.R.inc(14313);
        __CLR4_5_2apnapnlvico2an.R.inc(14314);String premiseOntology = head
            + "xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\" xmlns:ex=\"http://www.example.org#\" xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"><ex:c1 rdf:about=\"http://www.example.org#w\"/><rdf:Description rdf:about=\"http://www.example.org#c1\"><rdfs:subClassOf rdf:resource=\"http://www.example.org#c2\"/></rdf:Description></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14315);test(premiseOntology, false, false, false, false);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverRdfbased2Dsem2Drdfs2Dsubclass2Dtrans() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14316);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28yffe0b1o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverRdfbased2Dsem2Drdfs2Dsubclass2Dtrans",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14316,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28yffe0b1o(){try{__CLR4_5_2apnapnlvico2an.R.inc(14316);
        __CLR4_5_2apnapnlvico2an.R.inc(14317);String premiseOntology = head
            + "xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\" xmlns:ex=\"http://www.example.org#\" xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"><rdf:Description rdf:about=\"http://www.example.org#c1\"><rdfs:subClassOf><rdf:Description rdf:about=\"http://www.example.org#c2\"><rdfs:subClassOf rdf:resource=\"http://www.example.org#c3\"/></rdf:Description></rdfs:subClassOf></rdf:Description></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14318);test(premiseOntology, false, false, false, false);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverRdfbased2Dsem2Drdfs2Dsubprop2Dcond() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14319);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s7ldb1r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverRdfbased2Dsem2Drdfs2Dsubprop2Dcond",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14319,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s7ldb1r(){try{__CLR4_5_2apnapnlvico2an.R.inc(14319);
        __CLR4_5_2apnapnlvico2an.R.inc(14320);String premiseOntology = head
            + "xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\" xmlns:ex=\"http://www.example.org#\" xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"><rdf:Description rdf:about=\"http://www.example.org#s\"><ex:p1 rdf:resource=\"http://www.example.org#o\"/></rdf:Description><rdf:Description rdf:about=\"http://www.example.org#p1\"><rdfs:subPropertyOf rdf:resource=\"http://www.example.org#p2\"/></rdf:Description></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14321);test(premiseOntology, false, false, false, false);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverRdfbased2Dsem2Drdfs2Dsubprop2Dtrans() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14322);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2q17vzbb1u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverRdfbased2Dsem2Drdfs2Dsubprop2Dtrans",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14322,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2q17vzbb1u(){try{__CLR4_5_2apnapnlvico2an.R.inc(14322);
        __CLR4_5_2apnapnlvico2an.R.inc(14323);String premiseOntology = head
            + "xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\" xmlns:ex=\"http://www.example.org#\" xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"><rdf:Description rdf:about=\"http://www.example.org#p1\"><rdfs:subPropertyOf><rdf:Description rdf:about=\"http://www.example.org#p2\"><rdfs:subPropertyOf rdf:resource=\"http://www.example.org#p3\"/></rdf:Description></rdfs:subPropertyOf></rdf:Description></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14324);test(premiseOntology, false, false, false, false);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverRdfbased2Dsem2Drdfsext2Ddomain2Dsubprop() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14325);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29hfvs4b1x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverRdfbased2Dsem2Drdfsext2Ddomain2Dsubprop",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14325,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29hfvs4b1x(){try{__CLR4_5_2apnapnlvico2an.R.inc(14325);
        __CLR4_5_2apnapnlvico2an.R.inc(14326);String premiseOntology = head
            + "xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\" xmlns:ex=\"http://www.example.org#\" xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"><rdf:Description rdf:about=\"http://www.example.org#p1\"><rdfs:subPropertyOf><rdf:Description rdf:about=\"http://www.example.org#p2\"><rdfs:domain rdf:resource=\"http://www.example.org#c\"/></rdf:Description></rdfs:subPropertyOf></rdf:Description></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14327);test(premiseOntology, false, false, false, false);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverRdfbased2Dsem2Drdfsext2Ddomain2Dsuperclass() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14328);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mv10nib20();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverRdfbased2Dsem2Drdfsext2Ddomain2Dsuperclass",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14328,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mv10nib20(){try{__CLR4_5_2apnapnlvico2an.R.inc(14328);
        __CLR4_5_2apnapnlvico2an.R.inc(14329);String premiseOntology = head
            + "xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\" xmlns:ex=\"http://www.example.org#\" xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"><rdf:Description rdf:about=\"http://www.example.org#p\"><rdfs:domain><rdf:Description rdf:about=\"http://www.example.org#c1\"><rdfs:subClassOf rdf:resource=\"http://www.example.org#c2\"/></rdf:Description></rdfs:domain></rdf:Description></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14330);test(premiseOntology, false, false, false, false);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverRdfbased2Dsem2Drdfsext2Drange2Dsubprop() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14331);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21nwcz1b23();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverRdfbased2Dsem2Drdfsext2Drange2Dsubprop",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14331,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21nwcz1b23(){try{__CLR4_5_2apnapnlvico2an.R.inc(14331);
        __CLR4_5_2apnapnlvico2an.R.inc(14332);String premiseOntology = head
            + "xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\" xmlns:ex=\"http://www.example.org#\" xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"><rdf:Description rdf:about=\"http://www.example.org#p1\"><rdfs:subPropertyOf><rdf:Description rdf:about=\"http://www.example.org#p2\"><rdfs:range rdf:resource=\"http://www.example.org#c\"/></rdf:Description></rdfs:subPropertyOf></rdf:Description></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14333);test(premiseOntology, false, false, false, false);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverRdfbased2Dsem2Drdfsext2Drange2Dsuperclass() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14334);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2k63yedb26();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverRdfbased2Dsem2Drdfsext2Drange2Dsuperclass",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14334,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2k63yedb26(){try{__CLR4_5_2apnapnlvico2an.R.inc(14334);
        __CLR4_5_2apnapnlvico2an.R.inc(14335);String premiseOntology = head
            + "xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\" xmlns:ex=\"http://www.example.org#\" xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"><rdf:Description rdf:about=\"http://www.example.org#p\"><rdfs:range><rdf:Description rdf:about=\"http://www.example.org#c1\"><rdfs:subClassOf rdf:resource=\"http://www.example.org#c2\"/></rdf:Description></rdfs:range></rdf:Description></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14336);test(premiseOntology, false, false, false, false);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverRdfbased2Dsem2Drestrict2Dallvalues2Dcmp2Dclass() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14337);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2o0oofib29();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverRdfbased2Dsem2Drestrict2Dallvalues2Dcmp2Dclass",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14337,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2o0oofib29(){try{__CLR4_5_2apnapnlvico2an.R.inc(14337);
        __CLR4_5_2apnapnlvico2an.R.inc(14338);String premiseOntology = head
            + "xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\" xmlns:ex=\"http://www.example.org#\" xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"><rdf:Description rdf:about=\"http://www.example.org#x1\"><owl:allValuesFrom><rdf:Description rdf:about=\"http://www.example.org#c1\"><rdfs:subClassOf rdf:resource=\"http://www.example.org#c2\"/></rdf:Description></owl:allValuesFrom><owl:onProperty rdf:resource=\"http://www.example.org#p\"/></rdf:Description><rdf:Description rdf:about=\"http://www.example.org#x2\"><owl:allValuesFrom rdf:resource=\"http://www.example.org#c2\"/><owl:onProperty rdf:resource=\"http://www.example.org#p\"/></rdf:Description></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14339);test(premiseOntology, false, false, false, false);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverRdfbased2Dsem2Drestrict2Dallvalues2Dcmp2Dprop() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14340);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ejreqfb2c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverRdfbased2Dsem2Drestrict2Dallvalues2Dcmp2Dprop",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14340,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ejreqfb2c(){try{__CLR4_5_2apnapnlvico2an.R.inc(14340);
        __CLR4_5_2apnapnlvico2an.R.inc(14341);String premiseOntology = head
            + "xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\" xmlns:ex=\"http://www.example.org#\" xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"><rdf:Description rdf:about=\"http://www.example.org#x1\"><owl:allValuesFrom rdf:resource=\"http://www.example.org#c\"/><owl:onProperty><rdf:Description rdf:about=\"http://www.example.org#p1\"><rdfs:subPropertyOf rdf:resource=\"http://www.example.org#p2\"/></rdf:Description></owl:onProperty></rdf:Description><rdf:Description rdf:about=\"http://www.example.org#x2\"><owl:allValuesFrom rdf:resource=\"http://www.example.org#c\"/><owl:onProperty rdf:resource=\"http://www.example.org#p2\"/></rdf:Description></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14342);test(premiseOntology, false, false, false, false);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverRdfbased2Dsem2Drestrict2Dallvalues2Dinst2Dobj() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14343);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jj54g5b2f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverRdfbased2Dsem2Drestrict2Dallvalues2Dinst2Dobj",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14343,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jj54g5b2f(){try{__CLR4_5_2apnapnlvico2an.R.inc(14343);
        __CLR4_5_2apnapnlvico2an.R.inc(14344);String premiseOntology = head
            + "xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\" xmlns:ex=\"http://www.example.org#\" xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"><ex:z rdf:about=\"http://www.example.org#w\"><ex:p rdf:resource=\"http://www.example.org#x\"/></ex:z><rdf:Description rdf:about=\"http://www.example.org#z\"><owl:allValuesFrom rdf:resource=\"http://www.example.org#c\"/><owl:onProperty rdf:resource=\"http://www.example.org#p\"/></rdf:Description></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14345);test(premiseOntology, false, false, false, false);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverRdfbased2Dsem2Drestrict2Dhasvalue2Dcmp2Dprop() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14346);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2blp8k1b2i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverRdfbased2Dsem2Drestrict2Dhasvalue2Dcmp2Dprop",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14346,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2blp8k1b2i(){try{__CLR4_5_2apnapnlvico2an.R.inc(14346);
        __CLR4_5_2apnapnlvico2an.R.inc(14347);String premiseOntology = head
            + "xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\" xmlns:ex=\"http://www.example.org#\" xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"><rdf:Description rdf:about=\"http://www.example.org#x1\"><owl:hasValue rdf:resource=\"http://www.example.org#v\"/><owl:onProperty><rdf:Description rdf:about=\"http://www.example.org#p1\"><rdfs:subPropertyOf rdf:resource=\"http://www.example.org#p2\"/></rdf:Description></owl:onProperty></rdf:Description><rdf:Description rdf:about=\"http://www.example.org#x2\"><owl:hasValue rdf:resource=\"http://www.example.org#v\"/><owl:onProperty rdf:resource=\"http://www.example.org#p2\"/></rdf:Description></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14348);test(premiseOntology, false, false, false, false);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverRdfbased2Dsem2Drestrict2Dhasvalue2Dinst2Dobj() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14349);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pcia8jb2l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverRdfbased2Dsem2Drestrict2Dhasvalue2Dinst2Dobj",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14349,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pcia8jb2l(){try{__CLR4_5_2apnapnlvico2an.R.inc(14349);
        __CLR4_5_2apnapnlvico2an.R.inc(14350);String premiseOntology = head
            + "xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\" xmlns:ex=\"http://www.example.org#\" xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"><ex:z rdf:about=\"http://www.example.org#w\"/><rdf:Description rdf:about=\"http://www.example.org#z\"><owl:hasValue rdf:resource=\"http://www.example.org#u\"/><owl:onProperty rdf:resource=\"http://www.example.org#p\"/></rdf:Description></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14351);test(premiseOntology, false, false, false, false);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverRdfbased2Dsem2Drestrict2Dhasvalue2Dinst2Dsubj() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14352);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tof7dwb2o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverRdfbased2Dsem2Drestrict2Dhasvalue2Dinst2Dsubj",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14352,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tof7dwb2o(){try{__CLR4_5_2apnapnlvico2an.R.inc(14352);
        __CLR4_5_2apnapnlvico2an.R.inc(14353);String premiseOntology = head
            + "xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\" xmlns:ex=\"http://www.example.org#\" xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"><rdf:Description rdf:about=\"http://www.example.org#z\"><owl:hasValue rdf:resource=\"http://www.example.org#u\"/><owl:onProperty rdf:resource=\"http://www.example.org#p\"/></rdf:Description><rdf:Description rdf:about=\"http://www.example.org#w\"><ex:p rdf:resource=\"http://www.example.org#u\"/></rdf:Description></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14354);test(premiseOntology, false, false, false, false);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverRdfbased2Dsem2Drestrict2Dmaxcard2Dinst2Dobj2Done() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14355);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23hpi4ob2r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverRdfbased2Dsem2Drestrict2Dmaxcard2Dinst2Dobj2Done",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14355,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23hpi4ob2r(){try{__CLR4_5_2apnapnlvico2an.R.inc(14355);
        __CLR4_5_2apnapnlvico2an.R.inc(14356);String premiseOntology = head
            + "xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\" xmlns:ex=\"http://www.example.org#\" xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"><ex:z rdf:about=\"http://www.example.org#w\"><ex:p rdf:resource=\"http://www.example.org#x1\"/><ex:p rdf:resource=\"http://www.example.org#x2\"/></ex:z><rdf:Description rdf:about=\"http://www.example.org#z\"><owl:maxCardinality rdf:datatype=\"http://www.w3.org/2001/XMLSchema#nonNegativeInteger\">1</owl:maxCardinality><owl:onProperty rdf:resource=\"http://www.example.org#p\"/></rdf:Description></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14357);test(premiseOntology, false, false, false, false);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverRdfbased2Dsem2Drestrict2Dmaxcard2Dinst2Dobj2Dzero() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14358);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ngw75wb2u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverRdfbased2Dsem2Drestrict2Dmaxcard2Dinst2Dobj2Dzero",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14358,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ngw75wb2u(){try{__CLR4_5_2apnapnlvico2an.R.inc(14358);
        __CLR4_5_2apnapnlvico2an.R.inc(14359);String premiseOntology = head
            + "xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\" xmlns:ex=\"http://www.example.org#\" xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"><ex:z rdf:about=\"http://www.example.org#w\"><ex:p rdf:resource=\"http://www.example.org#x\"/></ex:z><rdf:Description rdf:about=\"http://www.example.org#z\"><owl:maxCardinality rdf:datatype=\"http://www.w3.org/2001/XMLSchema#nonNegativeInteger\">0</owl:maxCardinality><owl:onProperty rdf:resource=\"http://www.example.org#p\"/></rdf:Description></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14360);test(premiseOntology, false, false, false, false);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverRdfbased2Dsem2Drestrict2Dmaxqcr2Dinst2Dobj2Done() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14361);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2c8tlrgb2x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverRdfbased2Dsem2Drestrict2Dmaxqcr2Dinst2Dobj2Done",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14361,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2c8tlrgb2x(){try{__CLR4_5_2apnapnlvico2an.R.inc(14361);
        __CLR4_5_2apnapnlvico2an.R.inc(14362);String premiseOntology = head
            + "xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\" xmlns:ex=\"http://www.example.org#\" xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"><ex:z rdf:about=\"http://www.example.org#w\"><ex:p><ex:c rdf:about=\"http://www.example.org#x1\"/></ex:p><ex:p><ex:c rdf:about=\"http://www.example.org#x2\"/></ex:p></ex:z><rdf:Description rdf:about=\"http://www.example.org#z\"><owl:maxQualifiedCardinality rdf:datatype=\"http://www.w3.org/2001/XMLSchema#nonNegativeInteger\">1</owl:maxQualifiedCardinality><owl:onProperty rdf:resource=\"http://www.example.org#p\"/><owl:onClass rdf:resource=\"http://www.example.org#c\"/></rdf:Description></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14363);test(premiseOntology, false, false, false, false);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverRdfbased2Dsem2Drestrict2Dmaxqcr2Dinst2Dobj2Dzero() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14364);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ysariwb30();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverRdfbased2Dsem2Drestrict2Dmaxqcr2Dinst2Dobj2Dzero",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14364,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ysariwb30(){try{__CLR4_5_2apnapnlvico2an.R.inc(14364);
        __CLR4_5_2apnapnlvico2an.R.inc(14365);String premiseOntology = head
            + "xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\" xmlns:ex=\"http://www.example.org#\" xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"><ex:z rdf:about=\"http://www.example.org#w\"><ex:p><ex:c rdf:about=\"http://www.example.org#x\"/></ex:p></ex:z><rdf:Description rdf:about=\"http://www.example.org#z\"><owl:maxQualifiedCardinality rdf:datatype=\"http://www.w3.org/2001/XMLSchema#nonNegativeInteger\">0</owl:maxQualifiedCardinality><owl:onProperty rdf:resource=\"http://www.example.org#p\"/><owl:onClass rdf:resource=\"http://www.example.org#c\"/></rdf:Description></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14366);test(premiseOntology, false, false, false, false);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverRdfbased2Dsem2Drestrict2Dsomevalues2Dcmp2Dclass() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14367);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2no3lndb33();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverRdfbased2Dsem2Drestrict2Dsomevalues2Dcmp2Dclass",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14367,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2no3lndb33(){try{__CLR4_5_2apnapnlvico2an.R.inc(14367);
        __CLR4_5_2apnapnlvico2an.R.inc(14368);String premiseOntology = head
            + "xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\" xmlns:ex=\"http://www.example.org#\" xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"><rdf:Description rdf:about=\"http://www.example.org#x1\"><owl:someValuesFrom><rdf:Description rdf:about=\"http://www.example.org#c1\"><rdfs:subClassOf rdf:resource=\"http://www.example.org#c2\"/></rdf:Description></owl:someValuesFrom><owl:onProperty rdf:resource=\"http://www.example.org#p\"/></rdf:Description><rdf:Description rdf:about=\"http://www.example.org#x2\"><owl:someValuesFrom rdf:resource=\"http://www.example.org#c2\"/><owl:onProperty rdf:resource=\"http://www.example.org#p\"/></rdf:Description></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14369);test(premiseOntology, false, false, false, false);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverRdfbased2Dsem2Drestrict2Dsomevalues2Dcmp2Dprop() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14370);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kknpg0b36();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverRdfbased2Dsem2Drestrict2Dsomevalues2Dcmp2Dprop",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14370,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kknpg0b36(){try{__CLR4_5_2apnapnlvico2an.R.inc(14370);
        __CLR4_5_2apnapnlvico2an.R.inc(14371);String premiseOntology = head
            + "xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\" xmlns:ex=\"http://www.example.org#\" xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"><rdf:Description rdf:about=\"http://www.example.org#x1\"><owl:someValuesFrom rdf:resource=\"http://www.example.org#c\"/><owl:onProperty><rdf:Description rdf:about=\"http://www.example.org#p1\"><rdfs:subPropertyOf rdf:resource=\"http://www.example.org#p2\"/></rdf:Description></owl:onProperty></rdf:Description><rdf:Description rdf:about=\"http://www.example.org#x2\"><owl:someValuesFrom rdf:resource=\"http://www.example.org#c\"/><owl:onProperty rdf:resource=\"http://www.example.org#p2\"/></rdf:Description></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14372);test(premiseOntology, false, false, false, false);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverRdfbased2Dsem2Drestrict2Dsomevalues2Dinst2Dsubj() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14373);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nnnj0lb39();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverRdfbased2Dsem2Drestrict2Dsomevalues2Dinst2Dsubj",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14373,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nnnj0lb39(){try{__CLR4_5_2apnapnlvico2an.R.inc(14373);
        __CLR4_5_2apnapnlvico2an.R.inc(14374);String premiseOntology = head
            + "xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\" xmlns:ex=\"http://www.example.org#\" xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"><rdf:Description rdf:about=\"http://www.example.org#z\"><owl:someValuesFrom rdf:resource=\"http://www.example.org#c\"/><owl:onProperty rdf:resource=\"http://www.example.org#p\"/></rdf:Description><rdf:Description rdf:about=\"http://www.example.org#w\"><ex:p><ex:c rdf:about=\"http://www.example.org#x\"/></ex:p></rdf:Description></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14375);test(premiseOntology, false, false, false, false);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverString2Dinteger2Dclash() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14376);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ra5sxlb3c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverString2Dinteger2Dclash",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14376,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ra5sxlb3c(){try{__CLR4_5_2apnapnlvico2an.R.inc(14376);
        __CLR4_5_2apnapnlvico2an.R.inc(14377);String premiseOntology = "Prefix(:=<http://example.org/>) Prefix(xsd:=<http://www.w3.org/2001/XMLSchema#>) Ontology( Declaration(NamedIndividual(:a)) Declaration(DataProperty(:hasAge)) DataPropertyRange(:hasAge xsd:integer) ClassAssertion(DataHasValue(:hasAge \"aString\"^^xsd:string) :a))";
        __CLR4_5_2apnapnlvico2an.R.inc(14378);test(premiseOntology, true, false, true, true);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverTestCase3AWebOnt2DAnnotationProperty2D003() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14379);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26hm5kvb3f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverTestCase3AWebOnt2DAnnotationProperty2D003",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14379,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26hm5kvb3f(){try{__CLR4_5_2apnapnlvico2an.R.inc(14379);
        __CLR4_5_2apnapnlvico2an.R.inc(14380);String premiseOntology = head
            + "xmlns:first=\"urn:test#\" xml:base=\"urn:test\"><owl:Ontology/><owl:AnnotationProperty rdf:about=\"urn:test#ap\"/>"
            + "<owl:Class rdf:about=\"urn:test#A\">"
            + "<first:ap><rdf:Description rdf:about=\"urn:test#B\"/></first:ap></owl:Class></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14381);test(premiseOntology, true, true, true, true);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverTestCase3AWebOnt2DAnnotationProperty2D004() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14382);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_238m6seb3i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverTestCase3AWebOnt2DAnnotationProperty2D004",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14382,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_238m6seb3i(){try{__CLR4_5_2apnapnlvico2an.R.inc(14382);
        __CLR4_5_2apnapnlvico2an.R.inc(14383);String premiseOntology = rdf
            + " xml:base=\"urn:test\"><owl:Ontology /><owl:AnnotationProperty rdf:about=\"urn:test#ap\"><rdfs:range rdf:resource=\"http://www.w3.org/2001/XMLSchema#string\"/></owl:AnnotationProperty></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14384);test(premiseOntology, true, true, true, true);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testTestCase3AWebOnt2DI452D001() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14385);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27k6ygfb3l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testTestCase3AWebOnt2DI452D001",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14385,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27k6ygfb3l(){try{__CLR4_5_2apnapnlvico2an.R.inc(14385);
        __CLR4_5_2apnapnlvico2an.R.inc(14386);String premiseOntology = rdf
            + " xmlns:first=\"urn:test#\" xml:base=\"urn:test\"><owl:Ontology/>"
            + "<owl:Class rdf:about=\"urn:test#EuropeanCountry\" />"
            + "<owl:Class rdf:about=\"urn:test#Person\" />"
            + "<owl:Class rdf:about=\"urn:test#EUCountry\"><owl:oneOf rdf:parseType=\"Collection\">"
            + "<first:EuropeanCountry rdf:about=\"urn:test#UK\"/>"
            + "<first:EuropeanCountry rdf:about=\"urn:test#BE\"/>"
            + "<first:EuropeanCountry rdf:about=\"urn:test#ES\"/>"
            + "<first:EuropeanCountry rdf:about=\"urn:test#FR\"/>"
            + "<first:EuropeanCountry rdf:about=\"urn:test#NL\"/>"
            + "<first:EuropeanCountry rdf:about=\"urn:test#PT\"/></owl:oneOf></owl:Class><owl:ObjectProperty rdf:about=\"urn:test#hasEuroMP\"><rdfs:domain rdf:resource=\"urn:test#EUCountry\"/></owl:ObjectProperty><owl:ObjectProperty rdf:about=\"urn:test#isEuroMPFrom\"><owl:inverseOf rdf:resource=\"urn:test#hasEuroMP\"/></owl:ObjectProperty>"
            + "<owl:Class rdf:about=\"urn:test#EuroMP\"><owl:equivalentClass><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#isEuroMPFrom\" /><owl:someValuesFrom rdf:resource=\"http://www.w3.org/2002/07/owl#Thing\" /></owl:Restriction></owl:equivalentClass></owl:Class>"
            + "<first:Person rdf:about=\"urn:test#Kinnock\" />"
            + "<first:EuropeanCountry rdf:about=\"urn:test#UK\">"
            + "<first:hasEuroMP rdf:resource=\"urn:test#Kinnock\" /></first:EuropeanCountry></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14387);test(premiseOntology, false, false, false, true);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testTestCase3AWebOnt2DI452D002() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14388);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24b6znyb3o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testTestCase3AWebOnt2DI452D002",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14388,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24b6znyb3o(){try{__CLR4_5_2apnapnlvico2an.R.inc(14388);
        __CLR4_5_2apnapnlvico2an.R.inc(14389);String premiseOntology = rdf
            + " xmlns:first=\"urn:test#\" xml:base=\"urn:test\"><owl:Ontology/>"
            + "<owl:Class rdf:about=\"urn:test#EuropeanCountry\" />"
            + "<owl:Class rdf:about=\"urn:test#Person\" />"
            + "<owl:Class rdf:about=\"urn:test#EUCountry\"><owl:oneOf rdf:parseType=\"Collection\">"
            + "<first:EuropeanCountry rdf:about=\"urn:test#UK\"/>"
            + "<first:EuropeanCountry rdf:about=\"urn:test#BE\"/>"
            + "<first:EuropeanCountry rdf:about=\"urn:test#ES\"/>"
            + "<first:EuropeanCountry rdf:about=\"urn:test#FR\"/>"
            + "<first:EuropeanCountry rdf:about=\"urn:test#NL\"/>"
            + "<first:EuropeanCountry rdf:about=\"urn:test#PT\"/></owl:oneOf></owl:Class><owl:ObjectProperty rdf:about=\"urn:test#hasEuroMP\"><rdfs:domain rdf:resource=\"urn:test#EUCountry\"/></owl:ObjectProperty><owl:ObjectProperty rdf:about=\"urn:test#isEuroMPFrom\"><owl:inverseOf rdf:resource=\"urn:test#hasEuroMP\"/></owl:ObjectProperty>"
            + "<owl:Class rdf:about=\"urn:test#EuroMP\"><owl:equivalentClass><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#isEuroMPFrom\" /><owl:someValuesFrom rdf:resource=\"http://www.w3.org/2002/07/owl#Thing\" /></owl:Restriction></owl:equivalentClass></owl:Class>"
            + "<first:Person rdf:about=\"urn:test#Kinnock\"><rdf:type>"
            + "<owl:Class><owl:complementOf rdf:resource=\"urn:test#EuroMP\"/></owl:Class></rdf:type></first:Person>"
            + "<first:EuropeanCountry rdf:about=\"urn:test#UK\">"
            + "<first:hasEuroMP rdf:resource=\"urn:test#Kinnock\" /></first:EuropeanCountry></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14390);test(premiseOntology, false, false, false, true);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testTestCase3AWebOnt2DI462D0052DDirect() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14391);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fap03zb3r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testTestCase3AWebOnt2DI462D0052DDirect",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14391,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fap03zb3r(){try{__CLR4_5_2apnapnlvico2an.R.inc(14391);
        __CLR4_5_2apnapnlvico2an.R.inc(14392);String premiseOntology = head
            + "xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\" xml:base=\"urn:test\"><owl:Ontology/>"
            + "<owl:Class rdf:about=\"urn:test#C1\"><rdfs:comment>An example class.</rdfs:comment><owl:equivalentClass>"
            + "<owl:Class rdf:about=\"urn:test#C2\"/></owl:equivalentClass></owl:Class></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14393);test(premiseOntology, true, true, true, true);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testSpecialURIResolverTestCase3AWebOnt2DI522D001() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14394);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2haqgtub3u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testSpecialURIResolverTestCase3AWebOnt2DI522D001",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14394,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2haqgtub3u(){try{__CLR4_5_2apnapnlvico2an.R.inc(14394);
        __CLR4_5_2apnapnlvico2an.R.inc(14395);String premiseOntology = rdf
            + " xmlns:first=\"urn:test#\" xml:base=\"urn:test\"><owl:Ontology/>"
            + "<owl:Class rdf:about=\"urn:test#Nothing\"><rdfs:subClassOf><owl:Restriction><owl:onProperty><owl:ObjectProperty rdf:about=\"urn:test#p\"/></owl:onProperty><owl:minCardinality rdf:datatype=\"http://www.w3.org/2001/XMLSchema#nonNegativeInteger\">1</owl:minCardinality></owl:Restriction></rdfs:subClassOf><rdfs:subClassOf><owl:Restriction><owl:onProperty><owl:ObjectProperty rdf:about=\"urn:test#p\"/></owl:onProperty><owl:maxCardinality rdf:datatype=\"http://www.w3.org/2001/XMLSchema#nonNegativeInteger\">0</owl:maxCardinality></owl:Restriction></rdfs:subClassOf></owl:Class></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14396);test(premiseOntology, false, false, false, true);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testTestCase3AWebOnt2DI522D002() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14397);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27wbobab3x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testTestCase3AWebOnt2DI522D002",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14397,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27wbobab3x(){try{__CLR4_5_2apnapnlvico2an.R.inc(14397);
        __CLR4_5_2apnapnlvico2an.R.inc(14398);String premiseOntology = rdf
            + " xml:base=\"urn:test\"><owl:Ontology/>"
            + "<owl:Class rdf:about=\"urn:test#Nothing\"><rdfs:subClassOf><owl:Restriction><owl:onProperty><owl:ObjectProperty rdf:about=\"urn:test#p\"/></owl:onProperty><owl:minCardinality rdf:datatype=\"http://www.w3.org/2001/XMLSchema#nonNegativeInteger\">1</owl:minCardinality></owl:Restriction></rdfs:subClassOf><rdfs:subClassOf><owl:Restriction><owl:onProperty><owl:ObjectProperty rdf:about=\"urn:test#p\"/></owl:onProperty><owl:maxCardinality rdf:datatype=\"http://www.w3.org/2001/XMLSchema#nonNegativeInteger\">0</owl:maxCardinality></owl:Restriction></rdfs:subClassOf></owl:Class></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14399);test(premiseOntology, false, false, false, true);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testTestCase3AWebOnt2DI522D003() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14400);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2b5bn3rb40();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testTestCase3AWebOnt2DI522D003",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14400,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2b5bn3rb40(){try{__CLR4_5_2apnapnlvico2an.R.inc(14400);
        __CLR4_5_2apnapnlvico2an.R.inc(14401);String premiseOntology = rdf
            + " xmlns:first=\"urn:test#\" xml:base=\"urn:test\"><owl:Ontology/>"
            + "<owl:Class rdf:about=\"urn:test#Nothing\"><rdfs:subClassOf><owl:Restriction><owl:onProperty><owl:ObjectProperty rdf:about=\"urn:test#p\"/></owl:onProperty><owl:minCardinality rdf:datatype=\"http://www.w3.org/2001/XMLSchema#nonNegativeInteger\">1</owl:minCardinality></owl:Restriction></rdfs:subClassOf><rdfs:subClassOf><owl:Restriction><owl:onProperty><owl:ObjectProperty rdf:about=\"urn:test#p\"/></owl:onProperty><owl:maxCardinality rdf:datatype=\"http://www.w3.org/2001/XMLSchema#nonNegativeInteger\">0</owl:maxCardinality></owl:Restriction></rdfs:subClassOf></owl:Class>"
            + "<owl:Class rdf:about=\"urn:test#A\"><owl:equivalentClass><owl:Restriction><owl:onProperty><owl:ObjectProperty rdf:about=\"urn:test#q\"/></owl:onProperty><owl:someValuesFrom>"
            + "<owl:Class rdf:about=\"http://www.w3.org/2002/07/owl#Thing\"/></owl:someValuesFrom></owl:Restriction></owl:equivalentClass></owl:Class>"
            + "<owl:Class rdf:about=\"urn:test#notA\"><owl:equivalentClass><owl:Restriction><owl:onProperty><owl:ObjectProperty rdf:about=\"urn:test#q\"/></owl:onProperty><owl:allValuesFrom>"
            + "<owl:Class rdf:about=\"urn:test#Nothing\"/></owl:allValuesFrom></owl:Restriction></owl:equivalentClass></owl:Class></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14402);test(premiseOntology, false, false, false, true);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testTestCase3AWebOnt2DI522D004() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14403);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2eeblw8b43();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testTestCase3AWebOnt2DI522D004",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14403,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2eeblw8b43(){try{__CLR4_5_2apnapnlvico2an.R.inc(14403);
        __CLR4_5_2apnapnlvico2an.R.inc(14404);String premiseOntology = rdf
            + " xmlns:first=\"urn:test#\" xmlns:second=\"urn:test#\" xml:base=\"urn:test\"><owl:Ontology/>"
            + "<owl:Class rdf:about=\"urn:test#Nothing\"><rdfs:subClassOf><owl:Restriction><owl:onProperty><owl:ObjectProperty rdf:about=\"urn:test#p\"/></owl:onProperty><owl:minCardinality rdf:datatype=\"http://www.w3.org/2001/XMLSchema#nonNegativeInteger\">1</owl:minCardinality></owl:Restriction></rdfs:subClassOf><rdfs:subClassOf><owl:Restriction><owl:onProperty><owl:ObjectProperty rdf:about=\"urn:test#p\"/></owl:onProperty><owl:maxCardinality rdf:datatype=\"http://www.w3.org/2001/XMLSchema#nonNegativeInteger\">0</owl:maxCardinality></owl:Restriction></rdfs:subClassOf></owl:Class>"
            + "<owl:Class rdf:about=\"urn:test#A\"><owl:equivalentClass><owl:Restriction><owl:onProperty><owl:ObjectProperty rdf:about=\"urn:test#q\"/></owl:onProperty><owl:someValuesFrom>"
            + "<owl:Class rdf:about=\"http://www.w3.org/2002/07/owl#Thing\"/></owl:someValuesFrom></owl:Restriction></owl:equivalentClass></owl:Class>"
            + "<owl:Class rdf:about=\"urn:test#notA\"><owl:equivalentClass><owl:Restriction><owl:onProperty><owl:ObjectProperty rdf:about=\"urn:test#q\"/></owl:onProperty><owl:allValuesFrom>"
            + "<owl:Class rdf:about=\"urn:test#Nothing\"/></owl:allValuesFrom></owl:Restriction></owl:equivalentClass></owl:Class></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14405);test(premiseOntology, false, false, false, true);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testTestCase3AWebOnt2DI522D005() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14406);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hnbkopb46();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testTestCase3AWebOnt2DI522D005",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14406,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hnbkopb46(){try{__CLR4_5_2apnapnlvico2an.R.inc(14406);
        __CLR4_5_2apnapnlvico2an.R.inc(14407);String premiseOntology = rdf
            + " xmlns:first=\"urn:test#\" xml:base=\"urn:test\"><owl:Ontology/>"
            + "<owl:Class rdf:about=\"urn:test#Nothing\"><rdfs:subClassOf><owl:Restriction><owl:onProperty><owl:ObjectProperty rdf:about=\"urn:test#p\"/></owl:onProperty><owl:minCardinality rdf:datatype=\"http://www.w3.org/2001/XMLSchema#nonNegativeInteger\">1</owl:minCardinality></owl:Restriction></rdfs:subClassOf><rdfs:subClassOf><owl:Restriction><owl:onProperty><owl:ObjectProperty rdf:about=\"urn:test#p\"/></owl:onProperty><owl:maxCardinality rdf:datatype=\"http://www.w3.org/2001/XMLSchema#nonNegativeInteger\">0</owl:maxCardinality></owl:Restriction></rdfs:subClassOf></owl:Class>"
            + "<owl:Class rdf:about=\"urn:test#A\"><owl:equivalentClass><owl:Restriction><owl:onProperty><owl:ObjectProperty rdf:about=\"urn:test#q\"/></owl:onProperty><owl:someValuesFrom>"
            + "<owl:Class rdf:about=\"http://www.w3.org/2002/07/owl#Thing\"/></owl:someValuesFrom></owl:Restriction></owl:equivalentClass></owl:Class>"
            + "<owl:Class rdf:about=\"urn:test#notA\"><owl:equivalentClass><owl:Restriction><owl:onProperty><owl:ObjectProperty rdf:about=\"urn:test#q\"/></owl:onProperty><owl:allValuesFrom>"
            + "<owl:Class rdf:about=\"urn:test#Nothing\"/></owl:allValuesFrom></owl:Restriction></owl:equivalentClass></owl:Class>"
            + "<owl:Class rdf:about=\"urn:test#B\"><owl:equivalentClass><owl:Restriction><owl:onProperty><owl:ObjectProperty rdf:about=\"urn:test#r\"/></owl:onProperty><owl:someValuesFrom>"
            + "<owl:Class rdf:about=\"http://www.w3.org/2002/07/owl#Thing\"/></owl:someValuesFrom></owl:Restriction></owl:equivalentClass></owl:Class>"
            + "<owl:Class rdf:about=\"urn:test#notB\"><owl:equivalentClass><owl:Restriction><owl:onProperty><owl:ObjectProperty rdf:about=\"urn:test#r\"/></owl:onProperty><owl:allValuesFrom>"
            + "<owl:Class rdf:about=\"urn:test#Nothing\"/></owl:allValuesFrom></owl:Restriction></owl:equivalentClass></owl:Class>"
            + "<owl:Class rdf:about=\"urn:test#notAorB\"><owl:intersectionOf rdf:parseType=\"Collection\">"
            + "<owl:Class rdf:about=\"urn:test#notA\"/>"
            + "<owl:Class rdf:about=\"urn:test#notB\"/></owl:intersectionOf></owl:Class>"
            + "<owl:Class rdf:about=\"urn:test#AorB\"><owl:equivalentClass><owl:Restriction><owl:onProperty><owl:ObjectProperty rdf:about=\"urn:test#s\"/></owl:onProperty><owl:someValuesFrom>"
            + "<owl:Class rdf:about=\"http://www.w3.org/2002/07/owl#Thing\"/></owl:someValuesFrom></owl:Restriction></owl:equivalentClass></owl:Class>"
            + "<owl:Class rdf:about=\"urn:test#notAorB\"><owl:equivalentClass><owl:Restriction><owl:onProperty><owl:ObjectProperty rdf:about=\"urn:test#s\"/></owl:onProperty><owl:allValuesFrom>"
            + "<owl:Class rdf:about=\"urn:test#Nothing\"/></owl:allValuesFrom></owl:Restriction></owl:equivalentClass></owl:Class></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14408);test(premiseOntology, false, false, false, true);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testTestCase3AWebOnt2DI522D006() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14409);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kwbjh6b49();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testTestCase3AWebOnt2DI522D006",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14409,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kwbjh6b49(){try{__CLR4_5_2apnapnlvico2an.R.inc(14409);
        __CLR4_5_2apnapnlvico2an.R.inc(14410);String premiseOntology = rdf
            + " xml:base=\"urn:test\"><owl:Ontology/>"
            + "<owl:Class rdf:about=\"urn:test#Nothing\"><rdfs:subClassOf><owl:Restriction><owl:onProperty><owl:ObjectProperty rdf:about=\"urn:test#p\"/></owl:onProperty><owl:minCardinality rdf:datatype=\"http://www.w3.org/2001/XMLSchema#nonNegativeInteger\">1</owl:minCardinality></owl:Restriction></rdfs:subClassOf><rdfs:subClassOf><owl:Restriction><owl:onProperty><owl:ObjectProperty rdf:about=\"urn:test#p\"/></owl:onProperty><owl:maxCardinality rdf:datatype=\"http://www.w3.org/2001/XMLSchema#nonNegativeInteger\">0</owl:maxCardinality></owl:Restriction></rdfs:subClassOf></owl:Class>"
            + "<owl:Class rdf:about=\"urn:test#A\"><owl:equivalentClass><owl:Restriction><owl:onProperty><owl:ObjectProperty rdf:about=\"urn:test#q\"/></owl:onProperty><owl:someValuesFrom>"
            + "<owl:Class rdf:about=\"http://www.w3.org/2002/07/owl#Thing\"/></owl:someValuesFrom></owl:Restriction></owl:equivalentClass></owl:Class>"
            + "<owl:Class rdf:about=\"urn:test#notA\"><owl:equivalentClass><owl:Restriction><owl:onProperty><owl:ObjectProperty rdf:about=\"urn:test#q\"/></owl:onProperty><owl:allValuesFrom>"
            + "<owl:Class rdf:about=\"urn:test#Nothing\"/></owl:allValuesFrom></owl:Restriction></owl:equivalentClass></owl:Class>"
            + "<owl:Class rdf:about=\"urn:test#B\"><owl:equivalentClass><owl:Restriction><owl:onProperty><owl:ObjectProperty rdf:about=\"urn:test#r\"/></owl:onProperty><owl:someValuesFrom>"
            + "<owl:Class rdf:about=\"http://www.w3.org/2002/07/owl#Thing\"/></owl:someValuesFrom></owl:Restriction></owl:equivalentClass></owl:Class>"
            + "<owl:Class rdf:about=\"urn:test#notB\"><owl:equivalentClass><owl:Restriction><owl:onProperty><owl:ObjectProperty rdf:about=\"urn:test#r\"/></owl:onProperty><owl:allValuesFrom>"
            + "<owl:Class rdf:about=\"urn:test#Nothing\"/></owl:allValuesFrom></owl:Restriction></owl:equivalentClass></owl:Class>"
            + "<owl:Class rdf:about=\"urn:test#notAorB\"><owl:intersectionOf rdf:parseType=\"Collection\">"
            + "<owl:Class rdf:about=\"urn:test#notA\"/>"
            + "<owl:Class rdf:about=\"urn:test#notB\"/></owl:intersectionOf></owl:Class>"
            + "<owl:Class rdf:about=\"urn:test#AorB\"><owl:equivalentClass><owl:Restriction><owl:onProperty><owl:ObjectProperty rdf:about=\"urn:test#s\"/></owl:onProperty><owl:someValuesFrom>"
            + "<owl:Class rdf:about=\"http://www.w3.org/2002/07/owl#Thing\"/></owl:someValuesFrom></owl:Restriction></owl:equivalentClass></owl:Class>"
            + "<owl:Class rdf:about=\"urn:test#notAorB\"><owl:equivalentClass><owl:Restriction><owl:onProperty><owl:ObjectProperty rdf:about=\"urn:test#s\"/></owl:onProperty><owl:allValuesFrom>"
            + "<owl:Class rdf:about=\"urn:test#Nothing\"/></owl:allValuesFrom></owl:Restriction></owl:equivalentClass></owl:Class></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14411);test(premiseOntology, false, false, false, true);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testTestCase3AWebOnt2DI5212D002() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14412);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2df8lndb4c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testTestCase3AWebOnt2DI5212D002",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14412,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2df8lndb4c(){try{__CLR4_5_2apnapnlvico2an.R.inc(14412);
        __CLR4_5_2apnapnlvico2an.R.inc(14413);String premiseOntology = rdf
            + " xmlns:first=\"urn:test#\" xml:base=\"urn:test\"><owl:Ontology/>"
            + "<owl:Class rdf:about=\"urn:test#Reptile\"><rdfs:subClassOf><owl:Restriction><owl:onProperty><owl:DatatypeProperty rdf:about=\"urn:test#family-name\"/></owl:onProperty><owl:cardinality rdf:datatype=\"http://www.w3.org/2001/XMLSchema#int\">1</owl:cardinality></owl:Restriction></rdfs:subClassOf></owl:Class>"
            + "<owl:Class rdf:about=\"urn:test#Amphisbaenidae\"><rdfs:subClassOf rdf:resource=\"urn:test#Reptile\" /><rdfs:subClassOf><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#family-name\"/><owl:hasValue>Amphisbaenidae</owl:hasValue></owl:Restriction></rdfs:subClassOf></owl:Class>"
            + "<owl:Class rdf:about=\"urn:test#Agamidae\"><rdfs:subClassOf rdf:resource=\"urn:test#Reptile\" /><rdfs:subClassOf><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#family-name\"/><owl:hasValue>Agamidae</owl:hasValue></owl:Restriction></rdfs:subClassOf></owl:Class>"
            + "<owl:Class rdf:about=\"urn:test#Anomalepidae\"><rdfs:subClassOf rdf:resource=\"urn:test#Reptile\" /><rdfs:subClassOf><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#family-name\"/><owl:hasValue>Anomalepidae</owl:hasValue></owl:Restriction></rdfs:subClassOf></owl:Class>"
            + "<owl:Class rdf:about=\"urn:test#Emydidae\"><rdfs:subClassOf rdf:resource=\"urn:test#Reptile\" /><rdfs:subClassOf><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#family-name\"/><owl:hasValue>Emydidae</owl:hasValue></owl:Restriction></rdfs:subClassOf></owl:Class>"
            + "<owl:Class rdf:about=\"urn:test#Crocodylidae\"><rdfs:subClassOf rdf:resource=\"urn:test#Reptile\" /><rdfs:subClassOf><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#family-name\"/><owl:hasValue>Crocodylidae</owl:hasValue></owl:Restriction></rdfs:subClassOf></owl:Class>"
            + "<owl:Class rdf:about=\"urn:test#Gekkonidae\"><rdfs:subClassOf rdf:resource=\"urn:test#Reptile\" /><rdfs:subClassOf><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#family-name\"/><owl:hasValue>Gekkonidae</owl:hasValue></owl:Restriction></rdfs:subClassOf></owl:Class>"
            + "<owl:Class rdf:about=\"urn:test#Sphenodontidae\"><rdfs:subClassOf rdf:resource=\"urn:test#Reptile\" /><rdfs:subClassOf><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#family-name\"/><owl:hasValue>Sphenodontidae</owl:hasValue></owl:Restriction></rdfs:subClassOf></owl:Class>"
            + "<owl:Class rdf:about=\"urn:test#Cordylidae\"><rdfs:subClassOf rdf:resource=\"urn:test#Reptile\" /><rdfs:subClassOf><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#family-name\"/><owl:hasValue>Cordylidae</owl:hasValue></owl:Restriction></rdfs:subClassOf></owl:Class>"
            + "<owl:Class rdf:about=\"urn:test#Bipedidae\"><rdfs:subClassOf rdf:resource=\"urn:test#Reptile\" /><rdfs:subClassOf><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#family-name\"/><owl:hasValue>Bipedidae</owl:hasValue></owl:Restriction></rdfs:subClassOf></owl:Class>"
            + "<owl:Class rdf:about=\"urn:test#Leptotyphlopidae\"><rdfs:subClassOf rdf:resource=\"urn:test#Reptile\" /><rdfs:subClassOf><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#family-name\"/><owl:hasValue>Leptotyphlopidae</owl:hasValue></owl:Restriction></rdfs:subClassOf></owl:Class>"
            + "<owl:Class rdf:about=\"urn:test#Xantusiidae\"><rdfs:subClassOf rdf:resource=\"urn:test#Reptile\" /><rdfs:subClassOf><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#family-name\"/><owl:hasValue>Xantusiidae</owl:hasValue></owl:Restriction></rdfs:subClassOf></owl:Class>"
            + "<owl:Class rdf:about=\"urn:test#Loxocemidae\"><rdfs:subClassOf rdf:resource=\"urn:test#Reptile\" /><rdfs:subClassOf><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#family-name\"/><owl:hasValue>Loxocemidae</owl:hasValue></owl:Restriction></rdfs:subClassOf></owl:Class></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14414);test(premiseOntology, false, false, false, true);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testTestCase3AWebOnt2DI5242D004() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14415);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2aostcqb4f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testTestCase3AWebOnt2DI5242D004",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14415,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2aostcqb4f(){try{__CLR4_5_2apnapnlvico2an.R.inc(14415);
        __CLR4_5_2apnapnlvico2an.R.inc(14416);String premiseOntology = rdf
            + " xml:base=\"urn:test\"><owl:Ontology/>"
            + "<owl:Class rdf:about=\"http://www.w3.org/2002/07/owl#Thing\"><rdfs:subClassOf><owl:Restriction><owl:onProperty><owl:ObjectProperty rdf:about=\"urn:test#prop\"/></owl:onProperty><owl:allValuesFrom>"
            + "<owl:Class rdf:about=\"urn:test#A\"/></owl:allValuesFrom></owl:Restriction></rdfs:subClassOf></owl:Class></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14417);test(premiseOntology, false, false, false, true);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testTestCase3AWebOnt2DI5262D010() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14418);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2r7255rb4i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testTestCase3AWebOnt2DI5262D010",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14418,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2r7255rb4i(){try{__CLR4_5_2apnapnlvico2an.R.inc(14418);
        __CLR4_5_2apnapnlvico2an.R.inc(14419);String premiseOntology = head
            + "xmlns:first=\"urn:test#\" xml:base=\"urn:test\"><owl:Ontology/><owl:ObjectProperty rdf:about=\"urn:test#p\" /></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14420);test(premiseOntology, true, true, true, true);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testTestCase3AWebOnt2DI532D006() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14421);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2418ixzb4l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testTestCase3AWebOnt2DI532D006",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14421,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2418ixzb4l(){try{__CLR4_5_2apnapnlvico2an.R.inc(14421);
        __CLR4_5_2apnapnlvico2an.R.inc(14422);String premiseOntology = head
            + "xmlns:first=\"urn:test#\" xml:base=\"urn:test\"><owl:Ontology/><owl:Thing>"
            + "<first:p><owl:Thing/></first:p></owl:Thing><owl:ObjectProperty rdf:about=\"urn:test#p\" /></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14423);test(premiseOntology, false, false, false, true);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testTestCase3AWebOnt2DI532D008() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14424);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22gremzb4o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testTestCase3AWebOnt2DI532D008",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14424,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22gremzb4o(){try{__CLR4_5_2apnapnlvico2an.R.inc(14424);
        __CLR4_5_2apnapnlvico2an.R.inc(14425);String premiseOntology = head
            + "xmlns:first=\"urn:test#\" xml:base=\"urn:test\"><owl:Ontology/><owl:Thing>"
            + "<first:dp>value</first:dp></owl:Thing><owl:DatatypeProperty rdf:about=\"urn:test#dp\" /></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14426);test(premiseOntology, false, false, false, true);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testTestCase3AWebOnt2DI532D010() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14427);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_266mkuqb4r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testTestCase3AWebOnt2DI532D010",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14427,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_266mkuqb4r(){try{__CLR4_5_2apnapnlvico2an.R.inc(14427);
        __CLR4_5_2apnapnlvico2an.R.inc(14428);String premiseOntology = head
            + "xmlns:first=\"urn:test#\" xml:base=\"urn:test\"><owl:Ontology/><owl:ObjectProperty rdf:about=\"urn:test#p\"/><owl:Thing>"
            + "<first:p>"
            + "<owl:Class rdf:about=\"urn:test#c\"/></first:p></owl:Thing></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14429);test(premiseOntology, false, false, false, true);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testTestCase3AWebOnt2DI532D011() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14430);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29fmjn7b4u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testTestCase3AWebOnt2DI532D011",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14430,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29fmjn7b4u(){try{__CLR4_5_2apnapnlvico2an.R.inc(14430);
        __CLR4_5_2apnapnlvico2an.R.inc(14431);String premiseOntology = head
            + "xmlns:first=\"urn:test#\" xml:base=\"urn:test\"><owl:Ontology/><owl:AnnotationProperty rdf:about=\"urn:test#p\"/><owl:Thing>"
            + "<first:p>"
            + "<owl:Class rdf:about=\"urn:test#c\"/></first:p></owl:Thing></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14432);test(premiseOntology, false, false, false, true);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testTestCase3AWebOnt2DI552D005() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14433);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dvrfeeb4x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testTestCase3AWebOnt2DI552D005",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14433,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dvrfeeb4x(){try{__CLR4_5_2apnapnlvico2an.R.inc(14433);
        __CLR4_5_2apnapnlvico2an.R.inc(14434);String premiseOntology = head + "xml:base=\"urn:test\">"
            + "<owl:Class rdf:about=\"urn:test#a\" /></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14435);test(premiseOntology, true, true, true, true);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testTestCase3AWebOnt2DI582D006() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14436);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dd78wkb50();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testTestCase3AWebOnt2DI582D006",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14436,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dd78wkb50(){try{__CLR4_5_2apnapnlvico2an.R.inc(14436);
        __CLR4_5_2apnapnlvico2an.R.inc(14437);String premiseOntology = rdf
            + " xmlns:first=\"urn:test#\" xmlns:second=\"urn:test#\" xml:base=\"urn:test\"><owl:Ontology/><owl:DatatypeProperty rdf:about=\"urn:test#p\"><rdfs:range rdf:resource=\"http://www.w3.org/2001/XMLSchema#byte\" /></owl:DatatypeProperty></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14438);test(premiseOntology, false, false, true, true);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testTestCase3AWebOnt2DI582D007() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14439);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gm77p1b53();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testTestCase3AWebOnt2DI582D007",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14439,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gm77p1b53(){try{__CLR4_5_2apnapnlvico2an.R.inc(14439);
        __CLR4_5_2apnapnlvico2an.R.inc(14440);String premiseOntology = rdf
            + " xml:base=\"urn:test\"><owl:Ontology/><owl:DatatypeProperty rdf:about=\"urn:test#p\"><rdfs:range rdf:resource=\"http://www.w3.org/2001/XMLSchema#short\" /></owl:DatatypeProperty></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14441);test(premiseOntology, false, false, true, true);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testTestCase3AWebOnt2DI582D009() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14442);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n4759zb56();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testTestCase3AWebOnt2DI582D009",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14442,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n4759zb56(){try{__CLR4_5_2apnapnlvico2an.R.inc(14442);
        __CLR4_5_2apnapnlvico2an.R.inc(14443);String premiseOntology = rdf
            + " xml:base=\"urn:test\"><owl:Ontology/><owl:DatatypeProperty rdf:about=\"urn:test#p\"><rdfs:range rdf:resource=\"http://www.w3.org/2001/XMLSchema#nonNegativeInteger\" /><rdfs:range rdf:resource=\"http://www.w3.org/2001/XMLSchema#nonPositiveInteger\" /></owl:DatatypeProperty></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14444);test(premiseOntology, false, false, true, true);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testTestCase3AWebOnt2DI582D010() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14445);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nl2cp9b59();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testTestCase3AWebOnt2DI582D010",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14445,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nl2cp9b59(){try{__CLR4_5_2apnapnlvico2an.R.inc(14445);
        __CLR4_5_2apnapnlvico2an.R.inc(14446);String premiseOntology = rdf
            + " xml:base=\"urn:test\"><owl:Ontology/><owl:DatatypeProperty rdf:about=\"urn:test#p\"><rdfs:range rdf:resource=\"http://www.w3.org/2001/XMLSchema#nonNegativeInteger\" /></owl:DatatypeProperty><rdf:Description rdf:about=\"urn:test#john\"><rdf:type><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#p\"/><owl:someValuesFrom rdf:resource=\"http://www.w3.org/2001/XMLSchema#nonPositiveInteger\" /></owl:Restriction></rdf:type></rdf:Description></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14447);test(premiseOntology, false, false, false, true);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverTestCase3AWebOnt2DOntology2D001() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14448);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mtcfrob5c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverTestCase3AWebOnt2DOntology2D001",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14448,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mtcfrob5c(){try{__CLR4_5_2apnapnlvico2an.R.inc(14448);
        __CLR4_5_2apnapnlvico2an.R.inc(14449);String premiseOntology = rdf
            + " xmlns:first=\"urn:test#\" xml:base=\"urn:test\"><owl:Ontology rdf:about=\"\" />"
            + "<owl:Class rdf:about=\"urn:test#Car\"><owl:equivalentClass>"
            + "<owl:Class rdf:about=\"urn:test#Automobile\"/></owl:equivalentClass></owl:Class>"
            + "<first:Car rdf:about=\"urn:test#car\"><rdf:type rdf:resource=\"http://www.w3.org/2002/07/owl#Thing\" /></first:Car>"
            + "<first:Automobile rdf:about=\"urn:test#auto\"><rdf:type rdf:resource=\"http://www.w3.org/2002/07/owl#Thing\" /></first:Automobile></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14450);test(premiseOntology, true, true, false, true);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverTestCase3AWebOnt2DRestriction2D001() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14451);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_223il6rb5f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverTestCase3AWebOnt2DRestriction2D001",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14451,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_223il6rb5f(){try{__CLR4_5_2apnapnlvico2an.R.inc(14451);
        __CLR4_5_2apnapnlvico2an.R.inc(14452);String premiseOntology = rdf
            + " xmlns:first=\"urn:test#\" xml:base=\"urn:test\"><owl:Ontology/><owl:ObjectProperty rdf:about=\"urn:test#op\"/><rdf:Description rdf:about=\"urn:test#a\"><rdf:type><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#op\"/><owl:someValuesFrom rdf:resource=\"http://www.w3.org/2002/07/owl#Nothing\" /></owl:Restriction></rdf:type></rdf:Description><rdf:Description rdf:about=\"urn:test#b\"><rdf:type><owl:Restriction><owl:onProperty rdf:resource=\"urn:test#op\"/><owl:someValuesFrom rdf:resource=\"http://www.w3.org/2002/07/owl#Nothing\" /></owl:Restriction></rdf:type></rdf:Description></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14453);test(premiseOntology, true, false, false, true);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}

    @Test
    public void testURIResolverTestCase3AWebOnt2DRestriction2D002() {__CLR4_5_2apnapnlvico2an.R.globalSliceStart(getClass().getName(),14454);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_215hdlqb5i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2apnapnlvico2an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2apnapnlvico2an.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.Profile1TestCase.testURIResolverTestCase3AWebOnt2DRestriction2D002",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14454,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_215hdlqb5i(){try{__CLR4_5_2apnapnlvico2an.R.inc(14454);
        __CLR4_5_2apnapnlvico2an.R.inc(14455);String premiseOntology = head
            + "xml:base=\"urn:test\"><owl:Ontology/><owl:ObjectProperty rdf:about=\"urn:test#op\"/><rdf:Description rdf:about=\"urn:test#a\"><rdf:type><owl:Restriction rdf:nodeID=\"r\"><owl:onProperty rdf:resource=\"urn:test#op\"/><owl:someValuesFrom rdf:resource=\"http://www.w3.org/2002/07/owl#Nothing\" /></owl:Restriction></rdf:type></rdf:Description><rdf:Description rdf:about=\"urn:test#b\"><rdf:type rdf:nodeID=\"r\"/></rdf:Description></rdf:RDF>";
        __CLR4_5_2apnapnlvico2an.R.inc(14456);test(premiseOntology, true, false, false, true);
    }finally{__CLR4_5_2apnapnlvico2an.R.flushNeeded();}}
}
