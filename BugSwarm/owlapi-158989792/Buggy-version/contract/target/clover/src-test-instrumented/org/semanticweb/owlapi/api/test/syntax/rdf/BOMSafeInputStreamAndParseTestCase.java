/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.semanticweb.owlapi.api.test.syntax.rdf;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collection;

import javax.annotation.Nonnull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.semanticweb.owlapi.api.test.baseclasses.TestBase;
import org.semanticweb.owlapi.io.OWLOntologyDocumentSource;
import org.semanticweb.owlapi.io.ReaderDocumentSource;
import org.semanticweb.owlapi.io.StreamDocumentSource;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;

@SuppressWarnings("javadoc")
@RunWith(Parameterized.class)
public class BOMSafeInputStreamAndParseTestCase extends TestBase {static class __CLR4_5_295r95rlvico1t9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,11919,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=new com_atlassian_clover.TestNameSniffer.Simple();

    @Parameters
    public static Collection<Object[]> data() {try{__CLR4_5_295r95rlvico1t9.R.inc(11871);
        __CLR4_5_295r95rlvico1t9.R.inc(11872);return Arrays
            .asList(new Object[][] {
                { "<Ontology xml:base=\"http://www.example.org/ISA14#\" ontologyIRI=\"http://www.example.org/ISA14#\"> <Declaration><Class IRI=\"Researcher\"/></Declaration></Ontology>" },
                { "Ontology: <http://www.example.org/ISA14#>\nClass: <http://www.example.org/ISA14#Researcher>" },
                { "Ontology(<http://www.example.org/ISA14#>\nDeclaration(Class(<http://www.example.org/ISA14#Researcher>)))" },
                { "@prefix owl: <http://www.w3.org/2002/07/owl#> .\n@prefix rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#> .\n<http://www.example.org/ISA14#> rdf:type owl:Ontology .\n<http://www.example.org/ISA14#Researcher> rdf:type owl:Class ." },
                { "<rdf:RDF xml:base=\"http://www.example.org/ISA14#\" xmlns:owl =\"http://www.w3.org/2002/07/owl#\" xmlns:rdf =\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\" ><owl:Ontology rdf:about=\"#\" /><owl:Class rdf:about=\"http://www.example.org/ISA14#Researcher\"/></rdf:RDF>" }, });
    }finally{__CLR4_5_295r95rlvico1t9.R.flushNeeded();}}

    private String input;

    public BOMSafeInputStreamAndParseTestCase(String in) {try{__CLR4_5_295r95rlvico1t9.R.inc(11873);
        __CLR4_5_295r95rlvico1t9.R.inc(11874);input = in;
    }finally{__CLR4_5_295r95rlvico1t9.R.flushNeeded();}}

    @Nonnull
    private static OWLOntologyDocumentSource in(int[] b, String s) throws IOException {try{__CLR4_5_295r95rlvico1t9.R.inc(11875);
        __CLR4_5_295r95rlvico1t9.R.inc(11876);ByteArrayOutputStream out = new ByteArrayOutputStream();
        __CLR4_5_295r95rlvico1t9.R.inc(11877);for (int i : b) {{
            __CLR4_5_295r95rlvico1t9.R.inc(11878);out.write(i);
        }
        }__CLR4_5_295r95rlvico1t9.R.inc(11879);out.write(s.getBytes());
        __CLR4_5_295r95rlvico1t9.R.inc(11880);byte[] byteArray = out.toByteArray();
        __CLR4_5_295r95rlvico1t9.R.inc(11881);return new StreamDocumentSource(new ByteArrayInputStream(byteArray));
    }finally{__CLR4_5_295r95rlvico1t9.R.flushNeeded();}}

    @Nonnull
    private static InputStream inStream(int[] b, String s) throws IOException {try{__CLR4_5_295r95rlvico1t9.R.inc(11882);
        __CLR4_5_295r95rlvico1t9.R.inc(11883);ByteArrayOutputStream out = new ByteArrayOutputStream();
        __CLR4_5_295r95rlvico1t9.R.inc(11884);for (int i : b) {{
            __CLR4_5_295r95rlvico1t9.R.inc(11885);out.write(i);
        }
        }__CLR4_5_295r95rlvico1t9.R.inc(11886);out.write(s.getBytes());
        __CLR4_5_295r95rlvico1t9.R.inc(11887);byte[] byteArray = out.toByteArray();
        __CLR4_5_295r95rlvico1t9.R.inc(11888);return new ByteArrayInputStream(byteArray);
    }finally{__CLR4_5_295r95rlvico1t9.R.flushNeeded();}}

    // Bytes Encoding Form
    // 00 00 FE FF | UTF-32, big-endian
    // FF FE 00 00 | UTF-32, little-endian
    // FE FF |UTF-16, big-endian
    // FF FE |UTF-16, little-endian
    // EF BB BF |UTF-8
    @Test
    public void testBOMError32big() throws OWLOntologyCreationException,
        IOException {__CLR4_5_295r95rlvico1t9.R.globalSliceStart(getClass().getName(),11889);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wibw8i969();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_295r95rlvico1t9.R.rethrow($CLV_t2$);}finally{__CLR4_5_295r95rlvico1t9.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.rdf.BOMSafeInputStreamAndParseTestCase.testBOMError32big",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),11889,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wibw8i969() throws OWLOntologyCreationException, IOException{try{__CLR4_5_295r95rlvico1t9.R.inc(11889);
        __CLR4_5_295r95rlvico1t9.R.inc(11890);int[] b = new int[] { 0x00, 0x00, 0xFE, 0xFF };
        __CLR4_5_295r95rlvico1t9.R.inc(11891);m1.loadOntologyFromOntologyDocument(inStream(b, input));
    }finally{__CLR4_5_295r95rlvico1t9.R.flushNeeded();}}

    @Test
    public void testBOMError32small() throws OWLOntologyCreationException,
        IOException {__CLR4_5_295r95rlvico1t9.R.globalSliceStart(getClass().getName(),11892);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cfjbez96c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_295r95rlvico1t9.R.rethrow($CLV_t2$);}finally{__CLR4_5_295r95rlvico1t9.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.rdf.BOMSafeInputStreamAndParseTestCase.testBOMError32small",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),11892,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cfjbez96c() throws OWLOntologyCreationException, IOException{try{__CLR4_5_295r95rlvico1t9.R.inc(11892);
        __CLR4_5_295r95rlvico1t9.R.inc(11893);int[] b = new int[] { 0xFF, 0xFE, 0x00, 0x00 };
        __CLR4_5_295r95rlvico1t9.R.inc(11894);m1.loadOntologyFromOntologyDocument(in(b, input));
    }finally{__CLR4_5_295r95rlvico1t9.R.flushNeeded();}}

    @Test
    public void testBOMError16big() throws OWLOntologyCreationException,
        IOException {__CLR4_5_295r95rlvico1t9.R.globalSliceStart(getClass().getName(),11895);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ttl2go96f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_295r95rlvico1t9.R.rethrow($CLV_t2$);}finally{__CLR4_5_295r95rlvico1t9.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.rdf.BOMSafeInputStreamAndParseTestCase.testBOMError16big",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),11895,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ttl2go96f() throws OWLOntologyCreationException, IOException{try{__CLR4_5_295r95rlvico1t9.R.inc(11895);
        __CLR4_5_295r95rlvico1t9.R.inc(11896);int[] b = new int[] { 0xFF, 0xFE };
        __CLR4_5_295r95rlvico1t9.R.inc(11897);m1.loadOntologyFromOntologyDocument(in(b, input));
    }finally{__CLR4_5_295r95rlvico1t9.R.flushNeeded();}}

    @Test
    public void testBOMError16small() throws OWLOntologyCreationException,
        IOException {__CLR4_5_295r95rlvico1t9.R.globalSliceStart(getClass().getName(),11898);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2d0jhgv96i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_295r95rlvico1t9.R.rethrow($CLV_t2$);}finally{__CLR4_5_295r95rlvico1t9.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.rdf.BOMSafeInputStreamAndParseTestCase.testBOMError16small",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),11898,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2d0jhgv96i() throws OWLOntologyCreationException, IOException{try{__CLR4_5_295r95rlvico1t9.R.inc(11898);
        __CLR4_5_295r95rlvico1t9.R.inc(11899);int[] b = new int[] { 0xFF, 0xFE };
        __CLR4_5_295r95rlvico1t9.R.inc(11900);m1.loadOntologyFromOntologyDocument(in(b, input));
    }finally{__CLR4_5_295r95rlvico1t9.R.flushNeeded();}}

    @Test
    public void testBOMError8() throws OWLOntologyCreationException,
        IOException {__CLR4_5_295r95rlvico1t9.R.globalSliceStart(getClass().getName(),11901);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yst87v96l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_295r95rlvico1t9.R.rethrow($CLV_t2$);}finally{__CLR4_5_295r95rlvico1t9.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.rdf.BOMSafeInputStreamAndParseTestCase.testBOMError8",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),11901,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yst87v96l() throws OWLOntologyCreationException, IOException{try{__CLR4_5_295r95rlvico1t9.R.inc(11901);
        __CLR4_5_295r95rlvico1t9.R.inc(11902);int[] b = new int[] { 0xEF, 0xBB, 0xBF };
        __CLR4_5_295r95rlvico1t9.R.inc(11903);m1.loadOntologyFromOntologyDocument(in(b, input));
    }finally{__CLR4_5_295r95rlvico1t9.R.flushNeeded();}}

    @Test
    public void testBOMError32bigReader() throws OWLOntologyCreationException,
        IOException {__CLR4_5_295r95rlvico1t9.R.globalSliceStart(getClass().getName(),11904);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2aznbn396o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_295r95rlvico1t9.R.rethrow($CLV_t2$);}finally{__CLR4_5_295r95rlvico1t9.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.rdf.BOMSafeInputStreamAndParseTestCase.testBOMError32bigReader",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),11904,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2aznbn396o() throws OWLOntologyCreationException, IOException{try{__CLR4_5_295r95rlvico1t9.R.inc(11904);
        __CLR4_5_295r95rlvico1t9.R.inc(11905);int[] b = new int[] { 0x00, 0x00, 0xFE, 0xFF };
        __CLR4_5_295r95rlvico1t9.R.inc(11906);m1.loadOntologyFromOntologyDocument(new ReaderDocumentSource(
            new InputStreamReader(inStream(b, input))));
    }finally{__CLR4_5_295r95rlvico1t9.R.flushNeeded();}}

    @Test
    public void testBOMError32Reader() throws OWLOntologyCreationException,
        IOException {__CLR4_5_295r95rlvico1t9.R.globalSliceStart(getClass().getName(),11907);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_245bc8396r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_295r95rlvico1t9.R.rethrow($CLV_t2$);}finally{__CLR4_5_295r95rlvico1t9.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.rdf.BOMSafeInputStreamAndParseTestCase.testBOMError32Reader",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),11907,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_245bc8396r() throws OWLOntologyCreationException, IOException{try{__CLR4_5_295r95rlvico1t9.R.inc(11907);
        __CLR4_5_295r95rlvico1t9.R.inc(11908);int[] b = new int[] { 0xFF, 0xFE, 0x00, 0x00 };
        __CLR4_5_295r95rlvico1t9.R.inc(11909);m1.loadOntologyFromOntologyDocument(new ReaderDocumentSource(
            new InputStreamReader(inStream(b, input))));
    }finally{__CLR4_5_295r95rlvico1t9.R.flushNeeded();}}

    @Test
    public void testBOMError16Reader() throws OWLOntologyCreationException,
        IOException {__CLR4_5_295r95rlvico1t9.R.globalSliceStart(getClass().getName(),11910);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bnhlwp96u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_295r95rlvico1t9.R.rethrow($CLV_t2$);}finally{__CLR4_5_295r95rlvico1t9.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.rdf.BOMSafeInputStreamAndParseTestCase.testBOMError16Reader",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),11910,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bnhlwp96u() throws OWLOntologyCreationException, IOException{try{__CLR4_5_295r95rlvico1t9.R.inc(11910);
        __CLR4_5_295r95rlvico1t9.R.inc(11911);int[] b = new int[] { 0xFF, 0xFE };
        __CLR4_5_295r95rlvico1t9.R.inc(11912);m1.loadOntologyFromOntologyDocument(new ReaderDocumentSource(
            new InputStreamReader(inStream(b, input))));
    }finally{__CLR4_5_295r95rlvico1t9.R.flushNeeded();}}

    @Test
    public void testBOMError16smallReader()
        throws OWLOntologyCreationException, IOException {__CLR4_5_295r95rlvico1t9.R.globalSliceStart(getClass().getName(),11913);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27vyn9q96x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_295r95rlvico1t9.R.rethrow($CLV_t2$);}finally{__CLR4_5_295r95rlvico1t9.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.rdf.BOMSafeInputStreamAndParseTestCase.testBOMError16smallReader",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),11913,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27vyn9q96x() throws OWLOntologyCreationException, IOException{try{__CLR4_5_295r95rlvico1t9.R.inc(11913);
        __CLR4_5_295r95rlvico1t9.R.inc(11914);int[] b = new int[] { 0xFF, 0xFE };
        __CLR4_5_295r95rlvico1t9.R.inc(11915);m1.loadOntologyFromOntologyDocument(new ReaderDocumentSource(
            new InputStreamReader(inStream(b, input))));
    }finally{__CLR4_5_295r95rlvico1t9.R.flushNeeded();}}

    @Test
    public void testBOMError8Reader() throws OWLOntologyCreationException,
        IOException {__CLR4_5_295r95rlvico1t9.R.globalSliceStart(getClass().getName(),11916);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21rileg970();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_295r95rlvico1t9.R.rethrow($CLV_t2$);}finally{__CLR4_5_295r95rlvico1t9.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.rdf.BOMSafeInputStreamAndParseTestCase.testBOMError8Reader",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),11916,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21rileg970() throws OWLOntologyCreationException, IOException{try{__CLR4_5_295r95rlvico1t9.R.inc(11916);
        __CLR4_5_295r95rlvico1t9.R.inc(11917);int[] b = new int[] { 0xEF, 0xBB, 0xBF };
        __CLR4_5_295r95rlvico1t9.R.inc(11918);m1.loadOntologyFromOntologyDocument(new ReaderDocumentSource(
            new InputStreamReader(inStream(b, input))));
    }finally{__CLR4_5_295r95rlvico1t9.R.flushNeeded();}}
}
