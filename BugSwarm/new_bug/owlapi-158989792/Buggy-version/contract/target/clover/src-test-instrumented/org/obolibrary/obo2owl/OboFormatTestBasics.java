/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.obolibrary.obo2owl;

import static org.junit.Assert.*;

import java.io.*;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.obolibrary.oboformat.model.OBODoc;
import org.obolibrary.oboformat.parser.OBOFormatParser;
import org.obolibrary.oboformat.writer.OBOFormatWriter;
import org.semanticweb.owlapi.api.test.baseclasses.TestBase;
import org.semanticweb.owlapi.formats.OWLXMLDocumentFormat;
import org.semanticweb.owlapi.io.StringDocumentTarget;
import org.semanticweb.owlapi.model.*;

@SuppressWarnings({ "javadoc", })
public class OboFormatTestBasics extends TestBase {static class __CLR4_5_2ququlvicnz2s{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,1113,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Nonnull
    protected OBODoc parseOBOURL(String fn) throws IOException {try{__CLR4_5_2ququlvicnz2s.R.inc(966);
        __CLR4_5_2ququlvicnz2s.R.inc(967);OBOFormatParser p = new OBOFormatParser();
        __CLR4_5_2ququlvicnz2s.R.inc(968);OBODoc obodoc = p.parseURL(fn);
        __CLR4_5_2ququlvicnz2s.R.inc(969);assertTrue(!obodoc.getTermFrames().isEmpty());
        __CLR4_5_2ququlvicnz2s.R.inc(970);return obodoc;
    }finally{__CLR4_5_2ququlvicnz2s.R.flushNeeded();}}

    @Nonnull
    protected OBODoc parseOBOFile(String fn) {try{__CLR4_5_2ququlvicnz2s.R.inc(971);
        __CLR4_5_2ququlvicnz2s.R.inc(972);return parseOBOFile(fn, false);
    }finally{__CLR4_5_2ququlvicnz2s.R.flushNeeded();}}

    @SuppressWarnings("resource")
    @Nonnull
    protected OBODoc parseOBOFile(String fn, boolean allowEmptyFrames) {try{__CLR4_5_2ququlvicnz2s.R.inc(973);
        __CLR4_5_2ququlvicnz2s.R.inc(974);InputStream inputStream = getInputStream(fn);
        __CLR4_5_2ququlvicnz2s.R.inc(975);OBOFormatParser p = new OBOFormatParser();
        __CLR4_5_2ququlvicnz2s.R.inc(976);OBODoc obodoc;
        __CLR4_5_2ququlvicnz2s.R.inc(977);try {
            __CLR4_5_2ququlvicnz2s.R.inc(978);obodoc = p.parse(new BufferedReader(new InputStreamReader(inputStream)));
            __CLR4_5_2ququlvicnz2s.R.inc(979);assertNotNull("The obodoc should not be null", obodoc);
            __CLR4_5_2ququlvicnz2s.R.inc(980);if ((((obodoc.getTermFrames().isEmpty() && !allowEmptyFrames)&&(__CLR4_5_2ququlvicnz2s.R.iget(981)!=0|true))||(__CLR4_5_2ququlvicnz2s.R.iget(982)==0&false))) {{
                __CLR4_5_2ququlvicnz2s.R.inc(983);fail("Term frames should not be empty.");
            }
            }__CLR4_5_2ququlvicnz2s.R.inc(984);return obodoc;
        } catch (IOException e) {
            __CLR4_5_2ququlvicnz2s.R.inc(985);throw new OWLRuntimeException(e);
        }
    }finally{__CLR4_5_2ququlvicnz2s.R.flushNeeded();}}

    @Nonnull
    protected OBODoc parseOBOFile(@Nonnull Reader fn, boolean allowEmptyFrames) throws IOException {try{__CLR4_5_2ququlvicnz2s.R.inc(986);
        __CLR4_5_2ququlvicnz2s.R.inc(987);OBOFormatParser p = new OBOFormatParser();
        __CLR4_5_2ququlvicnz2s.R.inc(988);OBODoc obodoc = p.parse(new BufferedReader(fn));
        __CLR4_5_2ququlvicnz2s.R.inc(989);assertNotNull("The obodoc should not be null", obodoc);
        __CLR4_5_2ququlvicnz2s.R.inc(990);if ((((obodoc.getTermFrames().isEmpty() && !allowEmptyFrames)&&(__CLR4_5_2ququlvicnz2s.R.iget(991)!=0|true))||(__CLR4_5_2ququlvicnz2s.R.iget(992)==0&false))) {{
            __CLR4_5_2ququlvicnz2s.R.inc(993);fail("Term frames should not be empty.");
        }
        }__CLR4_5_2ququlvicnz2s.R.inc(994);return obodoc;
    }finally{__CLR4_5_2ququlvicnz2s.R.flushNeeded();}}

    @SuppressWarnings("resource")
    @Nonnull
    protected InputStream getInputStream(String fn) {try{__CLR4_5_2ququlvicnz2s.R.inc(995);
        __CLR4_5_2ququlvicnz2s.R.inc(996);InputStream inputStream = OboFormatTestBasics.class.getResourceAsStream(fn);
        __CLR4_5_2ququlvicnz2s.R.inc(997);if ((((inputStream == null)&&(__CLR4_5_2ququlvicnz2s.R.iget(998)!=0|true))||(__CLR4_5_2ququlvicnz2s.R.iget(999)==0&false))) {{
            __CLR4_5_2ququlvicnz2s.R.inc(1000);inputStream = getClass().getResourceAsStream("obo/" + fn);
        }
        }__CLR4_5_2ququlvicnz2s.R.inc(1001);if ((((inputStream == null)&&(__CLR4_5_2ququlvicnz2s.R.iget(1002)!=0|true))||(__CLR4_5_2ququlvicnz2s.R.iget(1003)==0&false))) {{
            __CLR4_5_2ququlvicnz2s.R.inc(1004);inputStream = ClassLoader.getSystemResourceAsStream(fn);
        }
        }__CLR4_5_2ququlvicnz2s.R.inc(1005);if ((((inputStream == null)&&(__CLR4_5_2ququlvicnz2s.R.iget(1006)!=0|true))||(__CLR4_5_2ququlvicnz2s.R.iget(1007)==0&false))) {{
            __CLR4_5_2ququlvicnz2s.R.inc(1008);inputStream = ClassLoader.getSystemResourceAsStream("obo/" + fn);
        }
        }__CLR4_5_2ququlvicnz2s.R.inc(1009);if ((((inputStream == null)&&(__CLR4_5_2ququlvicnz2s.R.iget(1010)!=0|true))||(__CLR4_5_2ququlvicnz2s.R.iget(1011)==0&false))) {{
            __CLR4_5_2ququlvicnz2s.R.inc(1012);try {
                __CLR4_5_2ququlvicnz2s.R.inc(1013);inputStream = new FileInputStream(new File("obo/" + fn));
            } catch (FileNotFoundException e) {
                __CLR4_5_2ququlvicnz2s.R.inc(1014);throw new RuntimeException(e);
            }
        }
        }__CLR4_5_2ququlvicnz2s.R.inc(1015);return inputStream;
    }finally{__CLR4_5_2ququlvicnz2s.R.flushNeeded();}}

    @Nonnull
    protected OBODoc parseOBOFile(@Nonnull File file) throws IOException {try{__CLR4_5_2ququlvicnz2s.R.inc(1016);
        __CLR4_5_2ququlvicnz2s.R.inc(1017);OBOFormatParser p = new OBOFormatParser();
        __CLR4_5_2ququlvicnz2s.R.inc(1018);return p.parse(file.getCanonicalPath());
    }finally{__CLR4_5_2ququlvicnz2s.R.flushNeeded();}}

    @Nonnull
    protected OWLOntology parseOWLFile(String fn) throws OWLOntologyCreationException {try{__CLR4_5_2ququlvicnz2s.R.inc(1019);
        // TODO replace
        __CLR4_5_2ququlvicnz2s.R.inc(1020);return m.loadOntologyFromOntologyDocument(getInputStream(fn));
    }finally{__CLR4_5_2ququlvicnz2s.R.flushNeeded();}}

    @Nonnull
    protected OWLOntology convert(OBODoc obodoc) {try{__CLR4_5_2ququlvicnz2s.R.inc(1021);
        __CLR4_5_2ququlvicnz2s.R.inc(1022);OWLAPIObo2Owl bridge = new OWLAPIObo2Owl(setupManager());
        __CLR4_5_2ququlvicnz2s.R.inc(1023);OWLOntology ontology;
        __CLR4_5_2ququlvicnz2s.R.inc(1024);try {
            __CLR4_5_2ququlvicnz2s.R.inc(1025);ontology = bridge.convert(obodoc);
            __CLR4_5_2ququlvicnz2s.R.inc(1026);return ontology;
        } catch (OWLOntologyCreationException e) {
            __CLR4_5_2ququlvicnz2s.R.inc(1027);throw new OWLRuntimeException(e);
        }
    }finally{__CLR4_5_2ququlvicnz2s.R.flushNeeded();}}

    @Nonnull
    protected OWLOntology convertOBOFile(String fn) {try{__CLR4_5_2ququlvicnz2s.R.inc(1028);
        __CLR4_5_2ququlvicnz2s.R.inc(1029);OWLOntology convert = convert(parseOBOFile(fn));
        __CLR4_5_2ququlvicnz2s.R.inc(1030);writeOWL(convert);
        __CLR4_5_2ququlvicnz2s.R.inc(1031);return convert;
    }finally{__CLR4_5_2ququlvicnz2s.R.flushNeeded();}}

    @Nonnull
    protected OBODoc convert(@Nonnull OWLOntology ontology) {try{__CLR4_5_2ququlvicnz2s.R.inc(1032);
        __CLR4_5_2ququlvicnz2s.R.inc(1033);return convert(ontology, false);
    }finally{__CLR4_5_2ququlvicnz2s.R.flushNeeded();}}

    @Nonnull
    protected OBODoc convert(@Nonnull OWLOntology ontology, boolean strictness) {try{__CLR4_5_2ququlvicnz2s.R.inc(1034);
        __CLR4_5_2ququlvicnz2s.R.inc(1035);OWLAPIOwl2Obo bridge = new OWLAPIOwl2Obo(m);
        __CLR4_5_2ququlvicnz2s.R.inc(1036);bridge.setStrictConversion(strictness);
        __CLR4_5_2ququlvicnz2s.R.inc(1037);return bridge.convert(ontology);
    }finally{__CLR4_5_2ququlvicnz2s.R.flushNeeded();}}

    @Nonnull
    protected String writeOBO(@Nonnull OBODoc obodoc) throws IOException {try{__CLR4_5_2ququlvicnz2s.R.inc(1038);
        __CLR4_5_2ququlvicnz2s.R.inc(1039);StringWriter target = new StringWriter();
        __CLR4_5_2ququlvicnz2s.R.inc(1040);OBOFormatWriter oboWriter = new OBOFormatWriter();
        __CLR4_5_2ququlvicnz2s.R.inc(1041);BufferedWriter bw = new BufferedWriter(target);
        __CLR4_5_2ququlvicnz2s.R.inc(1042);oboWriter.setCheckStructure(true);
        __CLR4_5_2ququlvicnz2s.R.inc(1043);oboWriter.write(obodoc, bw);
        __CLR4_5_2ququlvicnz2s.R.inc(1044);bw.flush();
        __CLR4_5_2ququlvicnz2s.R.inc(1045);return target.toString();
    }finally{__CLR4_5_2ququlvicnz2s.R.flushNeeded();}}

    @Nonnull
    protected StringDocumentTarget writeOWL(@Nonnull OWLOntology ontology) {try{__CLR4_5_2ququlvicnz2s.R.inc(1046);
        __CLR4_5_2ququlvicnz2s.R.inc(1047);return writeOWL(ontology, new OWLXMLDocumentFormat());
    }finally{__CLR4_5_2ququlvicnz2s.R.flushNeeded();}}

    @Nonnull
    protected StringDocumentTarget writeOWL(@Nonnull OWLOntology ontology, @Nonnull OWLDocumentFormat format) {try{__CLR4_5_2ququlvicnz2s.R.inc(1048);
        __CLR4_5_2ququlvicnz2s.R.inc(1049);StringDocumentTarget target = new StringDocumentTarget();
        __CLR4_5_2ququlvicnz2s.R.inc(1050);OWLOntologyManager manager = ontology.getOWLOntologyManager();
        __CLR4_5_2ququlvicnz2s.R.inc(1051);try {
            __CLR4_5_2ququlvicnz2s.R.inc(1052);manager.saveOntology(ontology, format, target);
        } catch (OWLOntologyStorageException e) {
            __CLR4_5_2ququlvicnz2s.R.inc(1053);throw new OWLRuntimeException(e);
        }
        __CLR4_5_2ququlvicnz2s.R.inc(1054);return target;
    }finally{__CLR4_5_2ququlvicnz2s.R.flushNeeded();}}

    @Nonnull
    protected static String renderOboToString(@Nonnull OBODoc oboDoc) throws IOException {try{__CLR4_5_2ququlvicnz2s.R.inc(1055);
        __CLR4_5_2ququlvicnz2s.R.inc(1056);OBOFormatWriter writer = new OBOFormatWriter();
        __CLR4_5_2ququlvicnz2s.R.inc(1057);StringWriter out = new StringWriter();
        __CLR4_5_2ququlvicnz2s.R.inc(1058);BufferedWriter stream = new BufferedWriter(out);
        __CLR4_5_2ququlvicnz2s.R.inc(1059);writer.setCheckStructure(true);
        __CLR4_5_2ququlvicnz2s.R.inc(1060);writer.write(oboDoc, stream);
        __CLR4_5_2ququlvicnz2s.R.inc(1061);stream.close();
        __CLR4_5_2ququlvicnz2s.R.inc(1062);return out.getBuffer().toString();
    }finally{__CLR4_5_2ququlvicnz2s.R.flushNeeded();}}

    @Nonnull
    protected static OBODoc parseOboToString(@Nonnull String oboString) throws IOException {try{__CLR4_5_2ququlvicnz2s.R.inc(1063);
        __CLR4_5_2ququlvicnz2s.R.inc(1064);OBOFormatParser p = new OBOFormatParser();
        __CLR4_5_2ququlvicnz2s.R.inc(1065);BufferedReader reader = new BufferedReader(new StringReader(oboString));
        __CLR4_5_2ququlvicnz2s.R.inc(1066);OBODoc parsedOboDoc = p.parse(reader);
        __CLR4_5_2ququlvicnz2s.R.inc(1067);reader.close();
        __CLR4_5_2ququlvicnz2s.R.inc(1068);return parsedOboDoc;
    }finally{__CLR4_5_2ququlvicnz2s.R.flushNeeded();}}

    protected static void renderOBO(@Nonnull OBODoc oboDoc) throws IOException {try{__CLR4_5_2ququlvicnz2s.R.inc(1069);
        __CLR4_5_2ququlvicnz2s.R.inc(1070);OBOFormatWriter writer = new OBOFormatWriter();
        __CLR4_5_2ququlvicnz2s.R.inc(1071);writer.setCheckStructure(true);
        __CLR4_5_2ququlvicnz2s.R.inc(1072);BufferedWriter stream = new BufferedWriter(new StringWriter());
        __CLR4_5_2ququlvicnz2s.R.inc(1073);writer.setCheckStructure(true);
        __CLR4_5_2ququlvicnz2s.R.inc(1074);writer.write(oboDoc, stream);
        __CLR4_5_2ququlvicnz2s.R.inc(1075);stream.close();
    }finally{__CLR4_5_2ququlvicnz2s.R.flushNeeded();}}

    protected static void renderOWL(@Nonnull OWLOntology owlOntology) throws OWLOntologyStorageException {try{__CLR4_5_2ququlvicnz2s.R.inc(1076);
        __CLR4_5_2ququlvicnz2s.R.inc(1077);OWLOntologyManager manager = owlOntology.getOWLOntologyManager();
        __CLR4_5_2ququlvicnz2s.R.inc(1078);manager.saveOntology(owlOntology, new OWLXMLDocumentFormat(), new StringDocumentTarget());
    }finally{__CLR4_5_2ququlvicnz2s.R.flushNeeded();}}

    protected static String renderOWL(@Nonnull OWLOntology owlOntology, @Nonnull OWLDocumentFormat ontologyFormat)
        throws OWLOntologyStorageException, IOException {try{__CLR4_5_2ququlvicnz2s.R.inc(1079);
        __CLR4_5_2ququlvicnz2s.R.inc(1080);OWLOntologyManager manager = owlOntology.getOWLOntologyManager();
        __CLR4_5_2ququlvicnz2s.R.inc(1081);ByteArrayOutputStream out = new ByteArrayOutputStream();
        __CLR4_5_2ququlvicnz2s.R.inc(1082);manager.saveOntology(owlOntology, ontologyFormat, out);
        __CLR4_5_2ququlvicnz2s.R.inc(1083);out.close();
        __CLR4_5_2ququlvicnz2s.R.inc(1084);return out.toString();
    }finally{__CLR4_5_2ququlvicnz2s.R.flushNeeded();}}

    @Nullable
    protected IRI getIriByLabel(@Nonnull OWLOntology ontology, @Nonnull String label) {try{__CLR4_5_2ququlvicnz2s.R.inc(1085);
        __CLR4_5_2ququlvicnz2s.R.inc(1086);for (OWLAnnotationAssertionAxiom aa : ontology.getAxioms(AxiomType.ANNOTATION_ASSERTION)) {{
            __CLR4_5_2ququlvicnz2s.R.inc(1087);OWLAnnotationValue v = aa.getValue();
            __CLR4_5_2ququlvicnz2s.R.inc(1088);OWLAnnotationProperty property = aa.getProperty();
            __CLR4_5_2ququlvicnz2s.R.inc(1089);if ((((property.isLabel() && v instanceof OWLLiteral)&&(__CLR4_5_2ququlvicnz2s.R.iget(1090)!=0|true))||(__CLR4_5_2ququlvicnz2s.R.iget(1091)==0&false))) {{
                __CLR4_5_2ququlvicnz2s.R.inc(1092);if ((((label.equals(((OWLLiteral) v).getLiteral()))&&(__CLR4_5_2ququlvicnz2s.R.iget(1093)!=0|true))||(__CLR4_5_2ququlvicnz2s.R.iget(1094)==0&false))) {{
                    __CLR4_5_2ququlvicnz2s.R.inc(1095);OWLAnnotationSubject subject = aa.getSubject();
                    __CLR4_5_2ququlvicnz2s.R.inc(1096);if ((((subject instanceof IRI)&&(__CLR4_5_2ququlvicnz2s.R.iget(1097)!=0|true))||(__CLR4_5_2ququlvicnz2s.R.iget(1098)==0&false))) {{
                        __CLR4_5_2ququlvicnz2s.R.inc(1099);return (IRI) subject;
                    }
                }}
            }}
        }}
        }__CLR4_5_2ququlvicnz2s.R.inc(1100);return null;
    }finally{__CLR4_5_2ququlvicnz2s.R.flushNeeded();}}

    @Nonnull
    protected String readResource(String resource) throws IOException {try{__CLR4_5_2ququlvicnz2s.R.inc(1101);
        __CLR4_5_2ququlvicnz2s.R.inc(1102);InputStream inputStream = getInputStream(resource);
        __CLR4_5_2ququlvicnz2s.R.inc(1103);BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        __CLR4_5_2ququlvicnz2s.R.inc(1104);StringBuilder sb = new StringBuilder();
        __CLR4_5_2ququlvicnz2s.R.inc(1105);String line;
        __CLR4_5_2ququlvicnz2s.R.inc(1106);while ((line = reader.readLine()) != null) {{
            __CLR4_5_2ququlvicnz2s.R.inc(1109);sb.append(line).append('\n');
        }
        }__CLR4_5_2ququlvicnz2s.R.inc(1110);reader.close();
        __CLR4_5_2ququlvicnz2s.R.inc(1111);inputStream.close();
        __CLR4_5_2ququlvicnz2s.R.inc(1112);return sb.toString();
    }finally{__CLR4_5_2ququlvicnz2s.R.flushNeeded();}}
}
