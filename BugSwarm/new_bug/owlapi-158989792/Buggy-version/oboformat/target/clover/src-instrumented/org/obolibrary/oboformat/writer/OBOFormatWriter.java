/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.obolibrary.oboformat.writer;

import static org.semanticweb.owlapi.model.parameters.Navigation.IN_SUB_POSITION;

import java.io.*;
import java.net.URL;
import java.util.*;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.obolibrary.obo2owl.OWLAPIObo2Owl;
import org.obolibrary.oboformat.model.Clause;
import org.obolibrary.oboformat.model.Frame;
import org.obolibrary.oboformat.model.Frame.FrameType;
import org.obolibrary.oboformat.model.OBODoc;
import org.obolibrary.oboformat.model.QualifierValue;
import org.obolibrary.oboformat.model.Xref;
import org.obolibrary.oboformat.parser.OBOFormatConstants;
import org.obolibrary.oboformat.parser.OBOFormatConstants.OboFormatTag;
import org.obolibrary.oboformat.parser.OBOFormatParser;
import org.obolibrary.oboformat.parser.OBOFormatParserException;
import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.model.parameters.Imports;
import org.semanticweb.owlapi.util.StringComparator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Class OBOFormatWriter.
 * 
 * @author Shahid Manzoor
 */
public class OBOFormatWriter {public static class __CLR4_5_24ia4ialvicmt7q{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u006f\u0062\u006f\u0066\u006f\u0072\u006d\u0061\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237308750L,8589935092L,6638,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final Logger LOG = LoggerFactory.getLogger(OBOFormatWriter.class);
    @Nonnull
    private static final Set<String> TAGSINFORMATIVE = buildTagsInformative();
    private boolean isCheckStructure = true;

    /**
     * @return true, if is check structure
     */
    public boolean isCheckStructure() {try{__CLR4_5_24ia4ialvicmt7q.R.inc(5842);
        __CLR4_5_24ia4ialvicmt7q.R.inc(5843);return isCheckStructure;
    }finally{__CLR4_5_24ia4ialvicmt7q.R.flushNeeded();}}

    /**
     * @param isCheckStructure
     *        the new check structure
     */
    public void setCheckStructure(boolean isCheckStructure) {try{__CLR4_5_24ia4ialvicmt7q.R.inc(5844);
        __CLR4_5_24ia4ialvicmt7q.R.inc(5845);this.isCheckStructure = isCheckStructure;
    }finally{__CLR4_5_24ia4ialvicmt7q.R.flushNeeded();}}

    @Nonnull
    private static Set<String> buildTagsInformative() {try{__CLR4_5_24ia4ialvicmt7q.R.inc(5846);
        __CLR4_5_24ia4ialvicmt7q.R.inc(5847);Set<String> set = new HashSet<>();
        __CLR4_5_24ia4ialvicmt7q.R.inc(5848);set.add(OboFormatTag.TAG_IS_A.getTag());
        __CLR4_5_24ia4ialvicmt7q.R.inc(5849);set.add(OboFormatTag.TAG_RELATIONSHIP.getTag());
        __CLR4_5_24ia4ialvicmt7q.R.inc(5850);set.add(OboFormatTag.TAG_DISJOINT_FROM.getTag());
        __CLR4_5_24ia4ialvicmt7q.R.inc(5851);set.add(OboFormatTag.TAG_INTERSECTION_OF.getTag());
        __CLR4_5_24ia4ialvicmt7q.R.inc(5852);set.add(OboFormatTag.TAG_UNION_OF.getTag());
        __CLR4_5_24ia4ialvicmt7q.R.inc(5853);set.add(OboFormatTag.TAG_EQUIVALENT_TO.getTag());
        // removed to be compatible with OBO-Edit
        // set.add( OboFormatTag.TAG_REPLACED_BY.getTag());
        __CLR4_5_24ia4ialvicmt7q.R.inc(5854);set.add(OboFormatTag.TAG_PROPERTY_VALUE.getTag());
        __CLR4_5_24ia4ialvicmt7q.R.inc(5855);set.add(OboFormatTag.TAG_DOMAIN.getTag());
        __CLR4_5_24ia4ialvicmt7q.R.inc(5856);set.add(OboFormatTag.TAG_RANGE.getTag());
        __CLR4_5_24ia4ialvicmt7q.R.inc(5857);set.add(OboFormatTag.TAG_INVERSE_OF.getTag());
        __CLR4_5_24ia4ialvicmt7q.R.inc(5858);set.add(OboFormatTag.TAG_TRANSITIVE_OVER.getTag());
        // removed to be compatible with OBO-Edit
        // set.add( OboFormatTag.TAG_HOLDS_OVER_CHAIN.getTag());
        __CLR4_5_24ia4ialvicmt7q.R.inc(5859);set.add(OboFormatTag.TAG_EQUIVALENT_TO_CHAIN.getTag());
        __CLR4_5_24ia4ialvicmt7q.R.inc(5860);set.add(OboFormatTag.TAG_DISJOINT_OVER.getTag());
        __CLR4_5_24ia4ialvicmt7q.R.inc(5861);return set;
    }finally{__CLR4_5_24ia4ialvicmt7q.R.flushNeeded();}}

    /**
     * @param fn
     *        the file name to read in
     * @param writer
     *        the writer
     * @throws IOException
     *         Signals that an I/O exception has occurred.
     * @throws OBOFormatParserException
     *         the oBO format parser exception
     */
    public void write(@Nonnull String fn, @Nonnull BufferedWriter writer) throws IOException {try{__CLR4_5_24ia4ialvicmt7q.R.inc(5862);
        __CLR4_5_24ia4ialvicmt7q.R.inc(5863);if ((((fn.startsWith("http:"))&&(__CLR4_5_24ia4ialvicmt7q.R.iget(5864)!=0|true))||(__CLR4_5_24ia4ialvicmt7q.R.iget(5865)==0&false))) {{
            __CLR4_5_24ia4ialvicmt7q.R.inc(5866);write(new URL(fn), writer);
        } }else {{
            __CLR4_5_24ia4ialvicmt7q.R.inc(5867);BufferedReader reader = new BufferedReader(new FileReader(new File(fn)));
            __CLR4_5_24ia4ialvicmt7q.R.inc(5868);try {
                __CLR4_5_24ia4ialvicmt7q.R.inc(5869);write(reader, writer);
            } finally {
                __CLR4_5_24ia4ialvicmt7q.R.inc(5870);reader.close();
            }
        }
    }}finally{__CLR4_5_24ia4ialvicmt7q.R.flushNeeded();}}

    /**
     * Write.
     * 
     * @param url
     *        the url
     * @param writer
     *        the writer
     * @throws IOException
     *         Signals that an I/O exception has occurred.
     * @throws OBOFormatParserException
     *         the oBO format parser exception
     */
    public void write(@Nonnull URL url, @Nonnull BufferedWriter writer) throws IOException {try{__CLR4_5_24ia4ialvicmt7q.R.inc(5871);
        __CLR4_5_24ia4ialvicmt7q.R.inc(5872);BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
        __CLR4_5_24ia4ialvicmt7q.R.inc(5873);write(reader, writer);
    }finally{__CLR4_5_24ia4ialvicmt7q.R.flushNeeded();}}

    /**
     * @param reader
     *        the reader
     * @param writer
     *        the writer
     * @throws IOException
     *         Signals that an I/O exception has occurred.
     * @throws OBOFormatParserException
     *         the oBO format parser exception
     */
    public void write(BufferedReader reader, @Nonnull BufferedWriter writer) throws IOException {try{__CLR4_5_24ia4ialvicmt7q.R.inc(5874);
        __CLR4_5_24ia4ialvicmt7q.R.inc(5875);OBOFormatParser parser = new OBOFormatParser();
        __CLR4_5_24ia4ialvicmt7q.R.inc(5876);OBODoc doc = parser.parse(reader);
        __CLR4_5_24ia4ialvicmt7q.R.inc(5877);write(doc, writer);
    }finally{__CLR4_5_24ia4ialvicmt7q.R.flushNeeded();}}

    /**
     * @param doc
     *        the doc
     * @param outFilename
     *        the out file name
     * @throws IOException
     *         Signals that an I/O exception has occurred.
     */
    public void write(@Nonnull OBODoc doc, @Nonnull String outFilename) throws IOException {try{__CLR4_5_24ia4ialvicmt7q.R.inc(5878);
        __CLR4_5_24ia4ialvicmt7q.R.inc(5879);write(doc, new File(outFilename));
    }finally{__CLR4_5_24ia4ialvicmt7q.R.flushNeeded();}}
	
	/**
     * @param doc
     *        the doc
     * @param outFile
     *        the out file
     * @throws IOException
     *         Signals that an I/O exception has occurred.
     */
    public void write(@Nonnull OBODoc doc, @Nonnull File outFile) throws IOException {try{__CLR4_5_24ia4ialvicmt7q.R.inc(5880);
        __CLR4_5_24ia4ialvicmt7q.R.inc(5881);FileOutputStream os = new FileOutputStream(outFile);
        __CLR4_5_24ia4ialvicmt7q.R.inc(5882);OutputStreamWriter osw = new OutputStreamWriter(os, OBOFormatConstants.DEFAULT_CHARACTER_ENCODING);
        __CLR4_5_24ia4ialvicmt7q.R.inc(5883);BufferedWriter bw = new BufferedWriter(osw);
        __CLR4_5_24ia4ialvicmt7q.R.inc(5884);write(doc, bw);
        __CLR4_5_24ia4ialvicmt7q.R.inc(5885);bw.close();
    }finally{__CLR4_5_24ia4ialvicmt7q.R.flushNeeded();}}

    /**
     * @param doc
     *        the doc
     * @param writer
     *        the writer
     * @throws IOException
     *         Signals that an I/O exception has occurred.
     */
    public void write(@Nonnull OBODoc doc, @Nonnull BufferedWriter writer) throws IOException {try{__CLR4_5_24ia4ialvicmt7q.R.inc(5886);
        __CLR4_5_24ia4ialvicmt7q.R.inc(5887);NameProvider nameProvider = new OBODocNameProvider(doc);
        __CLR4_5_24ia4ialvicmt7q.R.inc(5888);write(doc, writer, nameProvider);
    }finally{__CLR4_5_24ia4ialvicmt7q.R.flushNeeded();}}

    /**
     * @param doc
     *        the doc
     * @param writer
     *        the writer
     * @param nameProvider
     *        the name provider
     * @throws IOException
     *         Signals that an I/O exception has occurred.
     */
    public void write(@Nonnull OBODoc doc, @Nonnull BufferedWriter writer, NameProvider nameProvider)
        throws IOException {try{__CLR4_5_24ia4ialvicmt7q.R.inc(5889);
        __CLR4_5_24ia4ialvicmt7q.R.inc(5890);if ((((isCheckStructure)&&(__CLR4_5_24ia4ialvicmt7q.R.iget(5891)!=0|true))||(__CLR4_5_24ia4ialvicmt7q.R.iget(5892)==0&false))) {{
            __CLR4_5_24ia4ialvicmt7q.R.inc(5893);doc.check();
        }
        }__CLR4_5_24ia4ialvicmt7q.R.inc(5894);Frame headerFrame = doc.getHeaderFrame();
        __CLR4_5_24ia4ialvicmt7q.R.inc(5895);writeHeader(headerFrame, writer, nameProvider);
        __CLR4_5_24ia4ialvicmt7q.R.inc(5896);List<Frame> termFrames = new ArrayList<>();
        __CLR4_5_24ia4ialvicmt7q.R.inc(5897);termFrames.addAll(doc.getTermFrames());
        __CLR4_5_24ia4ialvicmt7q.R.inc(5898);Collections.sort(termFrames, FramesComparator.INSTANCE);
        __CLR4_5_24ia4ialvicmt7q.R.inc(5899);List<Frame> typeDefFrames = new ArrayList<>();
        __CLR4_5_24ia4ialvicmt7q.R.inc(5900);typeDefFrames.addAll(doc.getTypedefFrames());
        __CLR4_5_24ia4ialvicmt7q.R.inc(5901);Collections.sort(typeDefFrames, FramesComparator.INSTANCE);
        __CLR4_5_24ia4ialvicmt7q.R.inc(5902);List<Frame> instanceFrames = new ArrayList<>();
        __CLR4_5_24ia4ialvicmt7q.R.inc(5903);typeDefFrames.addAll(doc.getInstanceFrames());
        __CLR4_5_24ia4ialvicmt7q.R.inc(5904);Collections.sort(instanceFrames, FramesComparator.INSTANCE);
        __CLR4_5_24ia4ialvicmt7q.R.inc(5905);for (Frame f : termFrames) {{
            __CLR4_5_24ia4ialvicmt7q.R.inc(5906);write(f, writer, nameProvider);
        }
        }__CLR4_5_24ia4ialvicmt7q.R.inc(5907);for (Frame f : typeDefFrames) {{
            __CLR4_5_24ia4ialvicmt7q.R.inc(5908);write(f, writer, nameProvider);
        }
        }__CLR4_5_24ia4ialvicmt7q.R.inc(5909);for (Frame f : instanceFrames) {{
            __CLR4_5_24ia4ialvicmt7q.R.inc(5910);write(f, writer, nameProvider);
        }
        // to be save always flush writer
        }__CLR4_5_24ia4ialvicmt7q.R.inc(5911);writer.flush();
    }finally{__CLR4_5_24ia4ialvicmt7q.R.flushNeeded();}}

    private static void writeLine(@Nonnull StringBuilder ln, @Nonnull BufferedWriter writer) throws IOException {try{__CLR4_5_24ia4ialvicmt7q.R.inc(5912);
        __CLR4_5_24ia4ialvicmt7q.R.inc(5913);ln.append('\n');
        __CLR4_5_24ia4ialvicmt7q.R.inc(5914);writer.write(ln.toString());
    }finally{__CLR4_5_24ia4ialvicmt7q.R.flushNeeded();}}

    private static void writeLine(String ln, @Nonnull BufferedWriter writer) throws IOException {try{__CLR4_5_24ia4ialvicmt7q.R.inc(5915);
        __CLR4_5_24ia4ialvicmt7q.R.inc(5916);writer.write(ln + '\n');
    }finally{__CLR4_5_24ia4ialvicmt7q.R.flushNeeded();}}

    private static void writeEmptyLine(@Nonnull BufferedWriter writer) throws IOException {try{__CLR4_5_24ia4ialvicmt7q.R.inc(5917);
        __CLR4_5_24ia4ialvicmt7q.R.inc(5918);writer.write("\n");
    }finally{__CLR4_5_24ia4ialvicmt7q.R.flushNeeded();}}

    @Nonnull
    private static List<String> duplicateTags(@Nonnull Set<String> src) {try{__CLR4_5_24ia4ialvicmt7q.R.inc(5919);
        __CLR4_5_24ia4ialvicmt7q.R.inc(5920);List<String> tags = new ArrayList<>(src.size());
        __CLR4_5_24ia4ialvicmt7q.R.inc(5921);for (String tag : src) {{
            __CLR4_5_24ia4ialvicmt7q.R.inc(5922);tags.add(tag);
        }
        }__CLR4_5_24ia4ialvicmt7q.R.inc(5923);return tags;
    }finally{__CLR4_5_24ia4ialvicmt7q.R.flushNeeded();}}

    /**
     * Write header.
     * 
     * @param frame
     *        the frame
     * @param writer
     *        the writer
     * @param nameProvider
     *        the name provider
     * @throws IOException
     *         Signals that an I/O exception has occurred.
     */
    public void writeHeader(@Nonnull Frame frame, @Nonnull BufferedWriter writer, NameProvider nameProvider)
        throws IOException {try{__CLR4_5_24ia4ialvicmt7q.R.inc(5924);
        __CLR4_5_24ia4ialvicmt7q.R.inc(5925);List<String> tags = duplicateTags(frame.getTags());
        __CLR4_5_24ia4ialvicmt7q.R.inc(5926);Collections.sort(tags, HeaderTagsComparator.INSTANCE);
        // cmungall: Hardcoding 1.2 is deliberate.
        // obof1.2 never really had much of a spec to speak of, just a guide. We
        // initiated the attempt to make a proper spec and named this 1.4
        // (ignoring the abandoned common logic 1.3 spec...). Formally, 1.4 is
        // actually a subset of 1.2 (as formally as you can get with the 1.2
        // guide), because 1.2 allows open-ended tag values.
        // We opted to write 1.2 in the header because every document produced
        // should be a valid 1.2 doc, and we wanted people to be able to use it
        // without worrying about downstream underspecified ad-hoc parsers
        // throwing a wobbly when they see something other than 1.2 in the
        // header.
        __CLR4_5_24ia4ialvicmt7q.R.inc(5927);write(new Clause(OboFormatTag.TAG_FORMAT_VERSION.getTag(), "1.2"), writer, nameProvider);
        __CLR4_5_24ia4ialvicmt7q.R.inc(5928);for (String tag : tags) {{
            __CLR4_5_24ia4ialvicmt7q.R.inc(5929);if ((((tag.equals(OboFormatTag.TAG_FORMAT_VERSION.getTag()))&&(__CLR4_5_24ia4ialvicmt7q.R.iget(5930)!=0|true))||(__CLR4_5_24ia4ialvicmt7q.R.iget(5931)==0&false))) {{
                __CLR4_5_24ia4ialvicmt7q.R.inc(5932);continue;
            }
            }__CLR4_5_24ia4ialvicmt7q.R.inc(5933);List<Clause> clauses = new ArrayList<>(frame.getClauses(tag));
            __CLR4_5_24ia4ialvicmt7q.R.inc(5934);Collections.sort(clauses, ClauseComparator.INSTANCE);
            __CLR4_5_24ia4ialvicmt7q.R.inc(5935);for (Clause clause : clauses) {{
                assert (((clause != null)&&(__CLR4_5_24ia4ialvicmt7q.R.iget(5936)!=0|true))||(__CLR4_5_24ia4ialvicmt7q.R.iget(5937)==0&false));
                __CLR4_5_24ia4ialvicmt7q.R.inc(5938);if ((((tag.equals(OboFormatTag.TAG_SUBSETDEF.getTag()))&&(__CLR4_5_24ia4ialvicmt7q.R.iget(5939)!=0|true))||(__CLR4_5_24ia4ialvicmt7q.R.iget(5940)==0&false))) {{
                    __CLR4_5_24ia4ialvicmt7q.R.inc(5941);writeSynonymtypedef(clause, writer);
                } }else {__CLR4_5_24ia4ialvicmt7q.R.inc(5942);if ((((tag.equals(OboFormatTag.TAG_SYNONYMTYPEDEF.getTag()))&&(__CLR4_5_24ia4ialvicmt7q.R.iget(5943)!=0|true))||(__CLR4_5_24ia4ialvicmt7q.R.iget(5944)==0&false))) {{
                    __CLR4_5_24ia4ialvicmt7q.R.inc(5945);writeSynonymtypedef(clause, writer);
                } }else {__CLR4_5_24ia4ialvicmt7q.R.inc(5946);if ((((tag.equals(OboFormatTag.TAG_DATE.getTag()))&&(__CLR4_5_24ia4ialvicmt7q.R.iget(5947)!=0|true))||(__CLR4_5_24ia4ialvicmt7q.R.iget(5948)==0&false))) {{
                    __CLR4_5_24ia4ialvicmt7q.R.inc(5949);writeHeaderDate(clause, writer);
                } }else {__CLR4_5_24ia4ialvicmt7q.R.inc(5950);if ((((tag.equals(OboFormatTag.TAG_PROPERTY_VALUE.getTag()))&&(__CLR4_5_24ia4ialvicmt7q.R.iget(5951)!=0|true))||(__CLR4_5_24ia4ialvicmt7q.R.iget(5952)==0&false))) {{
                    __CLR4_5_24ia4ialvicmt7q.R.inc(5953);writePropertyValue(clause, writer);
                } }else {__CLR4_5_24ia4ialvicmt7q.R.inc(5954);if ((((tag.equals(OboFormatTag.TAG_IDSPACE.getTag()))&&(__CLR4_5_24ia4ialvicmt7q.R.iget(5955)!=0|true))||(__CLR4_5_24ia4ialvicmt7q.R.iget(5956)==0&false))) {{
                    __CLR4_5_24ia4ialvicmt7q.R.inc(5957);writeIdSpace(clause, writer);
                } }else {{
                    __CLR4_5_24ia4ialvicmt7q.R.inc(5958);write(clause, writer, nameProvider);
                }
            }}}}}}
        }}
        }__CLR4_5_24ia4ialvicmt7q.R.inc(5959);writeEmptyLine(writer);
    }finally{__CLR4_5_24ia4ialvicmt7q.R.flushNeeded();}}

    /**
     * @param frame
     *        the frame
     * @param writer
     *        the writer
     * @param nameProvider
     *        the name provider
     * @throws IOException
     *         Signals that an I/O exception has occurred.
     */
    @SuppressWarnings("null")
    public void write(@Nonnull Frame frame, @Nonnull BufferedWriter writer, @Nullable NameProvider nameProvider)
        throws IOException {try{__CLR4_5_24ia4ialvicmt7q.R.inc(5960);
        __CLR4_5_24ia4ialvicmt7q.R.inc(5961);StringComparator comparator = null;
        __CLR4_5_24ia4ialvicmt7q.R.inc(5962);if ((((frame.getType() == FrameType.TERM)&&(__CLR4_5_24ia4ialvicmt7q.R.iget(5963)!=0|true))||(__CLR4_5_24ia4ialvicmt7q.R.iget(5964)==0&false))) {{
            __CLR4_5_24ia4ialvicmt7q.R.inc(5965);writeLine("[Term]", writer);
            __CLR4_5_24ia4ialvicmt7q.R.inc(5966);comparator = TermsTagsComparator.INSTANCE;
        } }else {__CLR4_5_24ia4ialvicmt7q.R.inc(5967);if ((((frame.getType() == FrameType.TYPEDEF)&&(__CLR4_5_24ia4ialvicmt7q.R.iget(5968)!=0|true))||(__CLR4_5_24ia4ialvicmt7q.R.iget(5969)==0&false))) {{
            __CLR4_5_24ia4ialvicmt7q.R.inc(5970);writeLine("[Typedef]", writer);
            __CLR4_5_24ia4ialvicmt7q.R.inc(5971);comparator = TypeDefTagsComparator.INSTANCE;
        } }else {__CLR4_5_24ia4ialvicmt7q.R.inc(5972);if ((((frame.getType() == FrameType.INSTANCE)&&(__CLR4_5_24ia4ialvicmt7q.R.iget(5973)!=0|true))||(__CLR4_5_24ia4ialvicmt7q.R.iget(5974)==0&false))) {{
            __CLR4_5_24ia4ialvicmt7q.R.inc(5975);writeLine("[Instance]", writer);
            __CLR4_5_24ia4ialvicmt7q.R.inc(5976);comparator = TypeDefTagsComparator.INSTANCE;
        }
        }}}__CLR4_5_24ia4ialvicmt7q.R.inc(5977);if ((((frame.getId() != null)&&(__CLR4_5_24ia4ialvicmt7q.R.iget(5978)!=0|true))||(__CLR4_5_24ia4ialvicmt7q.R.iget(5979)==0&false))) {{
            __CLR4_5_24ia4ialvicmt7q.R.inc(5980);Object label = frame.getTagValue(OboFormatTag.TAG_NAME);
            __CLR4_5_24ia4ialvicmt7q.R.inc(5981);String extra = "";
            __CLR4_5_24ia4ialvicmt7q.R.inc(5982);if ((((label == null && nameProvider != null)&&(__CLR4_5_24ia4ialvicmt7q.R.iget(5983)!=0|true))||(__CLR4_5_24ia4ialvicmt7q.R.iget(5984)==0&false))) {{
                // the name clause may not be present in this OBODoc - however,
                // the name provider may be able to provide one, in which case,
                // we
                // write it as a parser-invisible comment, thus preserving the
                // document structure but providing useful information for any
                // person that inspects the obo file
                __CLR4_5_24ia4ialvicmt7q.R.inc(5985);label = nameProvider.getName(frame.getId());
                __CLR4_5_24ia4ialvicmt7q.R.inc(5986);if ((((label != null)&&(__CLR4_5_24ia4ialvicmt7q.R.iget(5987)!=0|true))||(__CLR4_5_24ia4ialvicmt7q.R.iget(5988)==0&false))) {{
                    __CLR4_5_24ia4ialvicmt7q.R.inc(5989);extra = " ! " + label;
                }
            }}
            }__CLR4_5_24ia4ialvicmt7q.R.inc(5990);writeLine(OboFormatTag.TAG_ID.getTag() + ": " + frame.getId() + extra, writer);
        }
        }__CLR4_5_24ia4ialvicmt7q.R.inc(5991);List<String> tags = duplicateTags(frame.getTags());
        __CLR4_5_24ia4ialvicmt7q.R.inc(5992);Collections.sort(tags, comparator);
        __CLR4_5_24ia4ialvicmt7q.R.inc(5993);String defaultOboNamespace = null;
        __CLR4_5_24ia4ialvicmt7q.R.inc(5994);if ((((nameProvider != null)&&(__CLR4_5_24ia4ialvicmt7q.R.iget(5995)!=0|true))||(__CLR4_5_24ia4ialvicmt7q.R.iget(5996)==0&false))) {{
            __CLR4_5_24ia4ialvicmt7q.R.inc(5997);defaultOboNamespace = nameProvider.getDefaultOboNamespace();
        }
        }__CLR4_5_24ia4ialvicmt7q.R.inc(5998);for (String tag : tags) {{
            __CLR4_5_24ia4ialvicmt7q.R.inc(5999);List<Clause> clauses = new ArrayList<>(frame.getClauses(tag));
            __CLR4_5_24ia4ialvicmt7q.R.inc(6000);Collections.sort(clauses, ClauseComparator.INSTANCE);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6001);for (Clause clause : clauses) {{
                __CLR4_5_24ia4ialvicmt7q.R.inc(6002);String clauseTag = clause.getTag();
                __CLR4_5_24ia4ialvicmt7q.R.inc(6003);if ((((OboFormatTag.TAG_ID.getTag().equals(clauseTag))&&(__CLR4_5_24ia4ialvicmt7q.R.iget(6004)!=0|true))||(__CLR4_5_24ia4ialvicmt7q.R.iget(6005)==0&false))) {{
                    __CLR4_5_24ia4ialvicmt7q.R.inc(6006);continue;
                } }else {__CLR4_5_24ia4ialvicmt7q.R.inc(6007);if ((((OboFormatTag.TAG_DEF.getTag().equals(clauseTag))&&(__CLR4_5_24ia4ialvicmt7q.R.iget(6008)!=0|true))||(__CLR4_5_24ia4ialvicmt7q.R.iget(6009)==0&false))) {{
                    __CLR4_5_24ia4ialvicmt7q.R.inc(6010);writeDef(clause, writer);
                } }else {__CLR4_5_24ia4ialvicmt7q.R.inc(6011);if ((((OboFormatTag.TAG_SYNONYM.getTag().equals(clauseTag))&&(__CLR4_5_24ia4ialvicmt7q.R.iget(6012)!=0|true))||(__CLR4_5_24ia4ialvicmt7q.R.iget(6013)==0&false))) {{
                    __CLR4_5_24ia4ialvicmt7q.R.inc(6014);writeSynonym(clause, writer);
                } }else {__CLR4_5_24ia4ialvicmt7q.R.inc(6015);if ((((OboFormatTag.TAG_PROPERTY_VALUE.getTag().equals(clauseTag))&&(__CLR4_5_24ia4ialvicmt7q.R.iget(6016)!=0|true))||(__CLR4_5_24ia4ialvicmt7q.R.iget(6017)==0&false))) {{
                    __CLR4_5_24ia4ialvicmt7q.R.inc(6018);writePropertyValue(clause, writer);
                } }else {__CLR4_5_24ia4ialvicmt7q.R.inc(6019);if ((((OboFormatTag.TAG_EXPAND_EXPRESSION_TO.getTag().equals(clauseTag)
                    || OboFormatTag.TAG_EXPAND_ASSERTION_TO.getTag().equals(clauseTag))&&(__CLR4_5_24ia4ialvicmt7q.R.iget(6020)!=0|true))||(__CLR4_5_24ia4ialvicmt7q.R.iget(6021)==0&false))) {{
                    __CLR4_5_24ia4ialvicmt7q.R.inc(6022);writeClauseWithQuotedString(clause, writer);
                } }else {__CLR4_5_24ia4ialvicmt7q.R.inc(6023);if ((((OboFormatTag.TAG_XREF.getTag().equals(clauseTag))&&(__CLR4_5_24ia4ialvicmt7q.R.iget(6024)!=0|true))||(__CLR4_5_24ia4ialvicmt7q.R.iget(6025)==0&false))) {{
                    __CLR4_5_24ia4ialvicmt7q.R.inc(6026);writeXRefClause(clause, writer);
                } }else {__CLR4_5_24ia4ialvicmt7q.R.inc(6027);if ((((OboFormatTag.TAG_NAMESPACE.getTag().equals(clauseTag))&&(__CLR4_5_24ia4ialvicmt7q.R.iget(6028)!=0|true))||(__CLR4_5_24ia4ialvicmt7q.R.iget(6029)==0&false))) {{
                    // only write OBO namespace,
                    // if it is different from the default OBO namespace
                    __CLR4_5_24ia4ialvicmt7q.R.inc(6030);if ((((defaultOboNamespace == null || !clause.getValue().equals(defaultOboNamespace))&&(__CLR4_5_24ia4ialvicmt7q.R.iget(6031)!=0|true))||(__CLR4_5_24ia4ialvicmt7q.R.iget(6032)==0&false))) {{
                        __CLR4_5_24ia4ialvicmt7q.R.inc(6033);write(clause, writer, nameProvider);
                    }
                }} }else {{
                    __CLR4_5_24ia4ialvicmt7q.R.inc(6034);write(clause, writer, nameProvider);
                }
            }}}}}}}}
        }}
        }__CLR4_5_24ia4ialvicmt7q.R.inc(6035);writeEmptyLine(writer);
    }finally{__CLR4_5_24ia4ialvicmt7q.R.flushNeeded();}}

    private static void writeXRefClause(@Nonnull Clause clause, @Nonnull BufferedWriter writer) throws IOException {try{__CLR4_5_24ia4ialvicmt7q.R.inc(6036);
        __CLR4_5_24ia4ialvicmt7q.R.inc(6037);Xref xref = clause.getValue(Xref.class);
        __CLR4_5_24ia4ialvicmt7q.R.inc(6038);if ((((xref != null)&&(__CLR4_5_24ia4ialvicmt7q.R.iget(6039)!=0|true))||(__CLR4_5_24ia4ialvicmt7q.R.iget(6040)==0&false))) {{
            __CLR4_5_24ia4ialvicmt7q.R.inc(6041);StringBuilder sb = new StringBuilder();
            __CLR4_5_24ia4ialvicmt7q.R.inc(6042);sb.append(clause.getTag());
            __CLR4_5_24ia4ialvicmt7q.R.inc(6043);sb.append(": ");
            __CLR4_5_24ia4ialvicmt7q.R.inc(6044);String idref = xref.getIdref();
            __CLR4_5_24ia4ialvicmt7q.R.inc(6045);int colonPos = idref.indexOf(':');
            __CLR4_5_24ia4ialvicmt7q.R.inc(6046);if ((((colonPos > 0)&&(__CLR4_5_24ia4ialvicmt7q.R.iget(6047)!=0|true))||(__CLR4_5_24ia4ialvicmt7q.R.iget(6048)==0&false))) {{
                __CLR4_5_24ia4ialvicmt7q.R.inc(6049);sb.append(escapeOboString(idref.substring(0, colonPos), EscapeMode.xref));
                __CLR4_5_24ia4ialvicmt7q.R.inc(6050);sb.append(':');
                __CLR4_5_24ia4ialvicmt7q.R.inc(6051);sb.append(escapeOboString(idref.substring(colonPos + 1), EscapeMode.xref));
            } }else {{
                __CLR4_5_24ia4ialvicmt7q.R.inc(6052);sb.append(escapeOboString(idref, EscapeMode.xref));
            }
            }__CLR4_5_24ia4ialvicmt7q.R.inc(6053);String annotation = xref.getAnnotation();
            __CLR4_5_24ia4ialvicmt7q.R.inc(6054);if ((((annotation != null)&&(__CLR4_5_24ia4ialvicmt7q.R.iget(6055)!=0|true))||(__CLR4_5_24ia4ialvicmt7q.R.iget(6056)==0&false))) {{
                __CLR4_5_24ia4ialvicmt7q.R.inc(6057);sb.append(" \"");
                __CLR4_5_24ia4ialvicmt7q.R.inc(6058);sb.append(escapeOboString(annotation, EscapeMode.quotes));
                __CLR4_5_24ia4ialvicmt7q.R.inc(6059);sb.append('"');
            }
            }__CLR4_5_24ia4ialvicmt7q.R.inc(6060);appendQualifiers(sb, clause);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6061);writeLine(sb, writer);
        }
    }}finally{__CLR4_5_24ia4ialvicmt7q.R.flushNeeded();}}

    private static void writeSynonymtypedef(@Nonnull Clause clause, @Nonnull BufferedWriter writer) throws IOException {try{__CLR4_5_24ia4ialvicmt7q.R.inc(6062);
        __CLR4_5_24ia4ialvicmt7q.R.inc(6063);StringBuilder sb = new StringBuilder();
        __CLR4_5_24ia4ialvicmt7q.R.inc(6064);sb.append(clause.getTag());
        __CLR4_5_24ia4ialvicmt7q.R.inc(6065);sb.append(": ");
        __CLR4_5_24ia4ialvicmt7q.R.inc(6066);Iterator<Object> valuesIterator = clause.getValues().iterator();
        __CLR4_5_24ia4ialvicmt7q.R.inc(6067);Collection<?> values = clause.getValues();
        __CLR4_5_24ia4ialvicmt7q.R.inc(6068);for (int i = 0; (((i < values.size())&&(__CLR4_5_24ia4ialvicmt7q.R.iget(6069)!=0|true))||(__CLR4_5_24ia4ialvicmt7q.R.iget(6070)==0&false)); i++) {{
            __CLR4_5_24ia4ialvicmt7q.R.inc(6071);String value = valuesIterator.next().toString();
            assert (((value != null)&&(__CLR4_5_24ia4ialvicmt7q.R.iget(6072)!=0|true))||(__CLR4_5_24ia4ialvicmt7q.R.iget(6073)==0&false));
            __CLR4_5_24ia4ialvicmt7q.R.inc(6074);if ((((i == 1)&&(__CLR4_5_24ia4ialvicmt7q.R.iget(6075)!=0|true))||(__CLR4_5_24ia4ialvicmt7q.R.iget(6076)==0&false))) {{
                __CLR4_5_24ia4ialvicmt7q.R.inc(6077);sb.append('"');
            }
            }__CLR4_5_24ia4ialvicmt7q.R.inc(6078);sb.append(escapeOboString(value, EscapeMode.quotes));
            __CLR4_5_24ia4ialvicmt7q.R.inc(6079);if ((((i == 1)&&(__CLR4_5_24ia4ialvicmt7q.R.iget(6080)!=0|true))||(__CLR4_5_24ia4ialvicmt7q.R.iget(6081)==0&false))) {{
                __CLR4_5_24ia4ialvicmt7q.R.inc(6082);sb.append('"');
            }
            }__CLR4_5_24ia4ialvicmt7q.R.inc(6083);if ((((valuesIterator.hasNext())&&(__CLR4_5_24ia4ialvicmt7q.R.iget(6084)!=0|true))||(__CLR4_5_24ia4ialvicmt7q.R.iget(6085)==0&false))) {{
                __CLR4_5_24ia4ialvicmt7q.R.inc(6086);sb.append(' ');
            }
        }}
        }__CLR4_5_24ia4ialvicmt7q.R.inc(6087);appendQualifiers(sb, clause);
        __CLR4_5_24ia4ialvicmt7q.R.inc(6088);writeLine(sb, writer);
    }finally{__CLR4_5_24ia4ialvicmt7q.R.flushNeeded();}}

    private static void writeHeaderDate(@Nonnull Clause clause, @Nonnull BufferedWriter writer) throws IOException {try{__CLR4_5_24ia4ialvicmt7q.R.inc(6089);
        __CLR4_5_24ia4ialvicmt7q.R.inc(6090);StringBuilder sb = new StringBuilder();
        __CLR4_5_24ia4ialvicmt7q.R.inc(6091);sb.append(clause.getTag());
        __CLR4_5_24ia4ialvicmt7q.R.inc(6092);sb.append(": ");
        __CLR4_5_24ia4ialvicmt7q.R.inc(6093);Object value = clause.getValue();
        assert (((value != null)&&(__CLR4_5_24ia4ialvicmt7q.R.iget(6094)!=0|true))||(__CLR4_5_24ia4ialvicmt7q.R.iget(6095)==0&false));
        __CLR4_5_24ia4ialvicmt7q.R.inc(6096);if ((((value instanceof Date)&&(__CLR4_5_24ia4ialvicmt7q.R.iget(6097)!=0|true))||(__CLR4_5_24ia4ialvicmt7q.R.iget(6098)==0&false))) {{
            __CLR4_5_24ia4ialvicmt7q.R.inc(6099);sb.append(OBOFormatConstants.headerDateFormat().format((Date) value));
        } }else {__CLR4_5_24ia4ialvicmt7q.R.inc(6100);if ((((value instanceof String)&&(__CLR4_5_24ia4ialvicmt7q.R.iget(6101)!=0|true))||(__CLR4_5_24ia4ialvicmt7q.R.iget(6102)==0&false))) {{
            __CLR4_5_24ia4ialvicmt7q.R.inc(6103);sb.append(value);
        } }else {{
            __CLR4_5_24ia4ialvicmt7q.R.inc(6104);if ((((LOG.isWarnEnabled())&&(__CLR4_5_24ia4ialvicmt7q.R.iget(6105)!=0|true))||(__CLR4_5_24ia4ialvicmt7q.R.iget(6106)==0&false))) {{
                __CLR4_5_24ia4ialvicmt7q.R.inc(6107);LOG.warn("Unknown datatype ('{}') for value in clause: {}", value.getClass().getName(), clause);
                __CLR4_5_24ia4ialvicmt7q.R.inc(6108);sb.append(value);
            }
        }}
        }}__CLR4_5_24ia4ialvicmt7q.R.inc(6109);writeLine(sb, writer);
    }finally{__CLR4_5_24ia4ialvicmt7q.R.flushNeeded();}}

    private static void writeIdSpace(@Nonnull Clause cl, @Nonnull BufferedWriter writer) throws IOException {try{__CLR4_5_24ia4ialvicmt7q.R.inc(6110);
        __CLR4_5_24ia4ialvicmt7q.R.inc(6111);StringBuilder sb = new StringBuilder(cl.getTag());
        __CLR4_5_24ia4ialvicmt7q.R.inc(6112);sb.append(": ");
        __CLR4_5_24ia4ialvicmt7q.R.inc(6113);Collection<Object> values = cl.getValues();
        __CLR4_5_24ia4ialvicmt7q.R.inc(6114);int i = 0;
        __CLR4_5_24ia4ialvicmt7q.R.inc(6115);Iterator<Object> iterator = values.iterator();
        __CLR4_5_24ia4ialvicmt7q.R.inc(6116);while ((((iterator.hasNext() && i < 3)&&(__CLR4_5_24ia4ialvicmt7q.R.iget(6117)!=0|true))||(__CLR4_5_24ia4ialvicmt7q.R.iget(6118)==0&false))) {{
            __CLR4_5_24ia4ialvicmt7q.R.inc(6119);String value = iterator.next().toString();
            assert (((value != null)&&(__CLR4_5_24ia4ialvicmt7q.R.iget(6120)!=0|true))||(__CLR4_5_24ia4ialvicmt7q.R.iget(6121)==0&false));
            __CLR4_5_24ia4ialvicmt7q.R.inc(6122);if ((((i == 2)&&(__CLR4_5_24ia4ialvicmt7q.R.iget(6123)!=0|true))||(__CLR4_5_24ia4ialvicmt7q.R.iget(6124)==0&false))) {{
                __CLR4_5_24ia4ialvicmt7q.R.inc(6125);sb.append('"').append(escapeOboString(value, EscapeMode.quotes)).append('"');
            } }else {{
                __CLR4_5_24ia4ialvicmt7q.R.inc(6126);sb.append(escapeOboString(value, EscapeMode.simple)).append(' ');
            }
            }__CLR4_5_24ia4ialvicmt7q.R.inc(6127);i++;
        }
        }__CLR4_5_24ia4ialvicmt7q.R.inc(6128);appendQualifiers(sb, cl);
        __CLR4_5_24ia4ialvicmt7q.R.inc(6129);writeLine(sb, writer);
    }finally{__CLR4_5_24ia4ialvicmt7q.R.flushNeeded();}}

    private static void writeClauseWithQuotedString(@Nonnull Clause clause, @Nonnull BufferedWriter writer)
        throws IOException {try{__CLR4_5_24ia4ialvicmt7q.R.inc(6130);
        __CLR4_5_24ia4ialvicmt7q.R.inc(6131);StringBuilder sb = new StringBuilder();
        __CLR4_5_24ia4ialvicmt7q.R.inc(6132);sb.append(clause.getTag());
        __CLR4_5_24ia4ialvicmt7q.R.inc(6133);sb.append(": ");
        __CLR4_5_24ia4ialvicmt7q.R.inc(6134);boolean first = true;
        __CLR4_5_24ia4ialvicmt7q.R.inc(6135);Iterator<Object> valuesIterator = clause.getValues().iterator();
        __CLR4_5_24ia4ialvicmt7q.R.inc(6136);while ((((valuesIterator.hasNext())&&(__CLR4_5_24ia4ialvicmt7q.R.iget(6137)!=0|true))||(__CLR4_5_24ia4ialvicmt7q.R.iget(6138)==0&false))) {{
            __CLR4_5_24ia4ialvicmt7q.R.inc(6139);if ((((first)&&(__CLR4_5_24ia4ialvicmt7q.R.iget(6140)!=0|true))||(__CLR4_5_24ia4ialvicmt7q.R.iget(6141)==0&false))) {{
                __CLR4_5_24ia4ialvicmt7q.R.inc(6142);sb.append('"');
            }
            }__CLR4_5_24ia4ialvicmt7q.R.inc(6143);String value = valuesIterator.next().toString();
            assert (((value != null)&&(__CLR4_5_24ia4ialvicmt7q.R.iget(6144)!=0|true))||(__CLR4_5_24ia4ialvicmt7q.R.iget(6145)==0&false));
            __CLR4_5_24ia4ialvicmt7q.R.inc(6146);sb.append(escapeOboString(value, EscapeMode.quotes));
            __CLR4_5_24ia4ialvicmt7q.R.inc(6147);if ((((first)&&(__CLR4_5_24ia4ialvicmt7q.R.iget(6148)!=0|true))||(__CLR4_5_24ia4ialvicmt7q.R.iget(6149)==0&false))) {{
                __CLR4_5_24ia4ialvicmt7q.R.inc(6150);sb.append('"');
            }
            }__CLR4_5_24ia4ialvicmt7q.R.inc(6151);if ((((valuesIterator.hasNext())&&(__CLR4_5_24ia4ialvicmt7q.R.iget(6152)!=0|true))||(__CLR4_5_24ia4ialvicmt7q.R.iget(6153)==0&false))) {{
                __CLR4_5_24ia4ialvicmt7q.R.inc(6154);sb.append(' ');
            }
            }__CLR4_5_24ia4ialvicmt7q.R.inc(6155);first = false;
        }
        }__CLR4_5_24ia4ialvicmt7q.R.inc(6156);Collection<Xref> xrefs = clause.getXrefs();
        // if the xrefs value is null, then there should *never* be xrefs at
        // this location
        // not that the value may be a non-null empty list - here we still want
        // to write []
        __CLR4_5_24ia4ialvicmt7q.R.inc(6157);if ((((!xrefs.isEmpty())&&(__CLR4_5_24ia4ialvicmt7q.R.iget(6158)!=0|true))||(__CLR4_5_24ia4ialvicmt7q.R.iget(6159)==0&false))) {{
            __CLR4_5_24ia4ialvicmt7q.R.inc(6160);appendXrefs(sb, xrefs);
        } }else {__CLR4_5_24ia4ialvicmt7q.R.inc(6161);if ((((OboFormatTag.TAG_DEF.getTag().equals(clause.getTag()) || OboFormatTag.TAG_SYNONYM.getTag().equals(
            clause.getTag()) || OboFormatTag.TAG_EXPAND_EXPRESSION_TO.getTag().equals(clause.getTag())
            || OboFormatTag.TAG_EXPAND_ASSERTION_TO.getTag().equals(clause.getTag()))&&(__CLR4_5_24ia4ialvicmt7q.R.iget(6162)!=0|true))||(__CLR4_5_24ia4ialvicmt7q.R.iget(6163)==0&false))) {{
            __CLR4_5_24ia4ialvicmt7q.R.inc(6164);sb.append(" []");
        }
        }}__CLR4_5_24ia4ialvicmt7q.R.inc(6165);appendQualifiers(sb, clause);
        __CLR4_5_24ia4ialvicmt7q.R.inc(6166);writeLine(sb, writer);
    }finally{__CLR4_5_24ia4ialvicmt7q.R.flushNeeded();}}

    private static void appendXrefs(@Nonnull StringBuilder sb, @Nonnull Collection<Xref> xrefs) {try{__CLR4_5_24ia4ialvicmt7q.R.inc(6167);
        __CLR4_5_24ia4ialvicmt7q.R.inc(6168);List<Xref> sortedXrefs = new ArrayList<>(xrefs);
        __CLR4_5_24ia4ialvicmt7q.R.inc(6169);Collections.sort(sortedXrefs, XrefComparator.INSTANCE);
        __CLR4_5_24ia4ialvicmt7q.R.inc(6170);sb.append(" [");
        __CLR4_5_24ia4ialvicmt7q.R.inc(6171);Iterator<Xref> xrefsIterator = sortedXrefs.iterator();
        __CLR4_5_24ia4ialvicmt7q.R.inc(6172);while ((((xrefsIterator.hasNext())&&(__CLR4_5_24ia4ialvicmt7q.R.iget(6173)!=0|true))||(__CLR4_5_24ia4ialvicmt7q.R.iget(6174)==0&false))) {{
            __CLR4_5_24ia4ialvicmt7q.R.inc(6175);Xref current = xrefsIterator.next();
            __CLR4_5_24ia4ialvicmt7q.R.inc(6176);String idref = current.getIdref();
            __CLR4_5_24ia4ialvicmt7q.R.inc(6177);int colonPos = idref.indexOf(':');
            __CLR4_5_24ia4ialvicmt7q.R.inc(6178);if ((((colonPos > 0)&&(__CLR4_5_24ia4ialvicmt7q.R.iget(6179)!=0|true))||(__CLR4_5_24ia4ialvicmt7q.R.iget(6180)==0&false))) {{
                __CLR4_5_24ia4ialvicmt7q.R.inc(6181);sb.append(escapeOboString(idref.substring(0, colonPos), EscapeMode.xrefList));
                __CLR4_5_24ia4ialvicmt7q.R.inc(6182);sb.append(':');
                __CLR4_5_24ia4ialvicmt7q.R.inc(6183);sb.append(escapeOboString(idref.substring(colonPos + 1), EscapeMode.xrefList));
            } }else {{
                __CLR4_5_24ia4ialvicmt7q.R.inc(6184);sb.append(escapeOboString(idref, EscapeMode.xrefList));
            }
            }__CLR4_5_24ia4ialvicmt7q.R.inc(6185);String annotation = current.getAnnotation();
            __CLR4_5_24ia4ialvicmt7q.R.inc(6186);if ((((annotation != null)&&(__CLR4_5_24ia4ialvicmt7q.R.iget(6187)!=0|true))||(__CLR4_5_24ia4ialvicmt7q.R.iget(6188)==0&false))) {{
                __CLR4_5_24ia4ialvicmt7q.R.inc(6189);sb.append(' ');
                __CLR4_5_24ia4ialvicmt7q.R.inc(6190);sb.append('"');
                __CLR4_5_24ia4ialvicmt7q.R.inc(6191);sb.append(escapeOboString(annotation, EscapeMode.quotes));
                __CLR4_5_24ia4ialvicmt7q.R.inc(6192);sb.append('"');
            }
            }__CLR4_5_24ia4ialvicmt7q.R.inc(6193);if ((((xrefsIterator.hasNext())&&(__CLR4_5_24ia4ialvicmt7q.R.iget(6194)!=0|true))||(__CLR4_5_24ia4ialvicmt7q.R.iget(6195)==0&false))) {{
                __CLR4_5_24ia4ialvicmt7q.R.inc(6196);sb.append(", ");
            }
        }}
        }__CLR4_5_24ia4ialvicmt7q.R.inc(6197);sb.append(']');
    }finally{__CLR4_5_24ia4ialvicmt7q.R.flushNeeded();}}

    /**
     * Write def.
     * 
     * @param clause
     *        the clause
     * @param writer
     *        the writer
     * @throws IOException
     *         Signals that an I/O exception has occurred.
     */
    public static void writeDef(@Nonnull Clause clause, @Nonnull BufferedWriter writer) throws IOException {try{__CLR4_5_24ia4ialvicmt7q.R.inc(6198);
        __CLR4_5_24ia4ialvicmt7q.R.inc(6199);writeClauseWithQuotedString(clause, writer);
    }finally{__CLR4_5_24ia4ialvicmt7q.R.flushNeeded();}}

    /**
     * Write property value.
     * 
     * @param clause
     *        the clause
     * @param writer
     *        the writer
     * @throws IOException
     *         Signals that an I/O exception has occurred.
     */
    public static void writePropertyValue(@Nonnull Clause clause, @Nonnull BufferedWriter writer) throws IOException {try{__CLR4_5_24ia4ialvicmt7q.R.inc(6200);
        __CLR4_5_24ia4ialvicmt7q.R.inc(6201);Collection<?> cols = clause.getValues();
        __CLR4_5_24ia4ialvicmt7q.R.inc(6202);if ((((cols.size() < 2)&&(__CLR4_5_24ia4ialvicmt7q.R.iget(6203)!=0|true))||(__CLR4_5_24ia4ialvicmt7q.R.iget(6204)==0&false))) {{
            __CLR4_5_24ia4ialvicmt7q.R.inc(6205);LOG.error("The {} has incorrect number of values: {}", OboFormatTag.TAG_PROPERTY_VALUE.getTag(), clause);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6206);return;
        }
        }__CLR4_5_24ia4ialvicmt7q.R.inc(6207);StringBuilder sb = new StringBuilder();
        __CLR4_5_24ia4ialvicmt7q.R.inc(6208);sb.append(clause.getTag());
        __CLR4_5_24ia4ialvicmt7q.R.inc(6209);sb.append(": ");
        __CLR4_5_24ia4ialvicmt7q.R.inc(6210);Iterator<?> it = cols.iterator();
        // write property
        // TODO replace toString() method
        __CLR4_5_24ia4ialvicmt7q.R.inc(6211);String property = it.next().toString();
        assert (((property != null)&&(__CLR4_5_24ia4ialvicmt7q.R.iget(6212)!=0|true))||(__CLR4_5_24ia4ialvicmt7q.R.iget(6213)==0&false));
        __CLR4_5_24ia4ialvicmt7q.R.inc(6214);sb.append(escapeOboString(property, EscapeMode.simple));
        // write value and optional type
        __CLR4_5_24ia4ialvicmt7q.R.inc(6215);while ((((it.hasNext())&&(__CLR4_5_24ia4ialvicmt7q.R.iget(6216)!=0|true))||(__CLR4_5_24ia4ialvicmt7q.R.iget(6217)==0&false))) {{
            __CLR4_5_24ia4ialvicmt7q.R.inc(6218);sb.append(' ');
            __CLR4_5_24ia4ialvicmt7q.R.inc(6219);String val = it.next().toString(); // TODO replace toString() method
            __CLR4_5_24ia4ialvicmt7q.R.inc(6220);if ((((val.contains(" ") || !val.contains(":"))&&(__CLR4_5_24ia4ialvicmt7q.R.iget(6221)!=0|true))||(__CLR4_5_24ia4ialvicmt7q.R.iget(6222)==0&false))) {{
                __CLR4_5_24ia4ialvicmt7q.R.inc(6223);sb.append('"');
                __CLR4_5_24ia4ialvicmt7q.R.inc(6224);sb.append(escapeOboString(val, EscapeMode.quotes));
                __CLR4_5_24ia4ialvicmt7q.R.inc(6225);sb.append('"');
            } }else {{
                __CLR4_5_24ia4ialvicmt7q.R.inc(6226);sb.append(escapeOboString(val, EscapeMode.simple));
            }
        }}
        }__CLR4_5_24ia4ialvicmt7q.R.inc(6227);appendQualifiers(sb, clause);
        __CLR4_5_24ia4ialvicmt7q.R.inc(6228);writeLine(sb, writer);
    }finally{__CLR4_5_24ia4ialvicmt7q.R.flushNeeded();}}

    /**
     * Write synonym.
     * 
     * @param clause
     *        the clause
     * @param writer
     *        the writer
     * @throws IOException
     *         Signals that an I/O exception has occurred.
     */
    public static void writeSynonym(@Nonnull Clause clause, @Nonnull BufferedWriter writer) throws IOException {try{__CLR4_5_24ia4ialvicmt7q.R.inc(6229);
        __CLR4_5_24ia4ialvicmt7q.R.inc(6230);writeClauseWithQuotedString(clause, writer);
    }finally{__CLR4_5_24ia4ialvicmt7q.R.flushNeeded();}}

    /**
     * Write.
     * 
     * @param clause
     *        the clause
     * @param writer
     *        the writer
     * @param nameProvider
     *        the name provider
     * @throws IOException
     *         Signals that an I/O exception has occurred.
     */
    public static void write(@Nonnull Clause clause, @Nonnull BufferedWriter writer,
        @Nullable NameProvider nameProvider) throws IOException {try{__CLR4_5_24ia4ialvicmt7q.R.inc(6231);
        __CLR4_5_24ia4ialvicmt7q.R.inc(6232);if ((((OboFormatTag.TAG_IS_OBSELETE.getTag().equals(clause.getTag()))&&(__CLR4_5_24ia4ialvicmt7q.R.iget(6233)!=0|true))||(__CLR4_5_24ia4ialvicmt7q.R.iget(6234)==0&false))) {{
            // only write the obsolete tag if the value is Boolean.TRUE or
            // "true"
            __CLR4_5_24ia4ialvicmt7q.R.inc(6235);Object value = clause.getValue();
            __CLR4_5_24ia4ialvicmt7q.R.inc(6236);if ((((value instanceof Boolean)&&(__CLR4_5_24ia4ialvicmt7q.R.iget(6237)!=0|true))||(__CLR4_5_24ia4ialvicmt7q.R.iget(6238)==0&false))) {{
                __CLR4_5_24ia4ialvicmt7q.R.inc(6239);if ((((Boolean.FALSE.equals(value))&&(__CLR4_5_24ia4ialvicmt7q.R.iget(6240)!=0|true))||(__CLR4_5_24ia4ialvicmt7q.R.iget(6241)==0&false))) {{
                    __CLR4_5_24ia4ialvicmt7q.R.inc(6242);return;
                }
            }} }else {{
                // also check for a String representation of Boolean.TRUE
                __CLR4_5_24ia4ialvicmt7q.R.inc(6243);if ((((!Boolean.TRUE.toString().equals(value))&&(__CLR4_5_24ia4ialvicmt7q.R.iget(6244)!=0|true))||(__CLR4_5_24ia4ialvicmt7q.R.iget(6245)==0&false))) {{
                    __CLR4_5_24ia4ialvicmt7q.R.inc(6246);return;
                }
            }}
        }}
        }__CLR4_5_24ia4ialvicmt7q.R.inc(6247);StringBuilder sb = new StringBuilder();
        __CLR4_5_24ia4ialvicmt7q.R.inc(6248);sb.append(clause.getTag());
        __CLR4_5_24ia4ialvicmt7q.R.inc(6249);sb.append(": ");
        __CLR4_5_24ia4ialvicmt7q.R.inc(6250);Iterator<Object> valuesIterator = clause.getValues().iterator();
        __CLR4_5_24ia4ialvicmt7q.R.inc(6251);StringBuilder idsLabel = null;
        __CLR4_5_24ia4ialvicmt7q.R.inc(6252);if ((((nameProvider != null && TAGSINFORMATIVE.contains(clause.getTag()))&&(__CLR4_5_24ia4ialvicmt7q.R.iget(6253)!=0|true))||(__CLR4_5_24ia4ialvicmt7q.R.iget(6254)==0&false))) {{
            __CLR4_5_24ia4ialvicmt7q.R.inc(6255);idsLabel = new StringBuilder();
        }
        }__CLR4_5_24ia4ialvicmt7q.R.inc(6256);while ((((valuesIterator.hasNext())&&(__CLR4_5_24ia4ialvicmt7q.R.iget(6257)!=0|true))||(__CLR4_5_24ia4ialvicmt7q.R.iget(6258)==0&false))) {{
            __CLR4_5_24ia4ialvicmt7q.R.inc(6259);String value = valuesIterator.next().toString();
            assert (((value != null)&&(__CLR4_5_24ia4ialvicmt7q.R.iget(6260)!=0|true))||(__CLR4_5_24ia4ialvicmt7q.R.iget(6261)==0&false));
            __CLR4_5_24ia4ialvicmt7q.R.inc(6262);if ((((idsLabel != null && nameProvider != null)&&(__CLR4_5_24ia4ialvicmt7q.R.iget(6263)!=0|true))||(__CLR4_5_24ia4ialvicmt7q.R.iget(6264)==0&false))) {{
                __CLR4_5_24ia4ialvicmt7q.R.inc(6265);String label = nameProvider.getName(value);
                __CLR4_5_24ia4ialvicmt7q.R.inc(6266);if ((((label != null && (isOpaqueIdentifier(value) || !valuesIterator.hasNext()))&&(__CLR4_5_24ia4ialvicmt7q.R.iget(6267)!=0|true))||(__CLR4_5_24ia4ialvicmt7q.R.iget(6268)==0&false))) {{
                    // only print label if the label exists
                    // and the label is different from the id
                    // relationships: ID part_of LABEL part_of
                    __CLR4_5_24ia4ialvicmt7q.R.inc(6269);if ((((idsLabel.length() > 0)&&(__CLR4_5_24ia4ialvicmt7q.R.iget(6270)!=0|true))||(__CLR4_5_24ia4ialvicmt7q.R.iget(6271)==0&false))) {{
                        __CLR4_5_24ia4ialvicmt7q.R.inc(6272);idsLabel.append(' ');
                    }
                    }__CLR4_5_24ia4ialvicmt7q.R.inc(6273);idsLabel.append(label);
                }
            }}
            }__CLR4_5_24ia4ialvicmt7q.R.inc(6274);EscapeMode mode = EscapeMode.most;
            __CLR4_5_24ia4ialvicmt7q.R.inc(6275);if ((((OboFormatTag.TAG_COMMENT.getTag().equals(clause.getTag()))&&(__CLR4_5_24ia4ialvicmt7q.R.iget(6276)!=0|true))||(__CLR4_5_24ia4ialvicmt7q.R.iget(6277)==0&false))) {{
                __CLR4_5_24ia4ialvicmt7q.R.inc(6278);mode = EscapeMode.parenthesis;
            }
            }__CLR4_5_24ia4ialvicmt7q.R.inc(6279);sb.append(escapeOboString(value, mode));
            __CLR4_5_24ia4ialvicmt7q.R.inc(6280);if ((((valuesIterator.hasNext())&&(__CLR4_5_24ia4ialvicmt7q.R.iget(6281)!=0|true))||(__CLR4_5_24ia4ialvicmt7q.R.iget(6282)==0&false))) {{
                __CLR4_5_24ia4ialvicmt7q.R.inc(6283);sb.append(' ');
            }
        }}
        }__CLR4_5_24ia4ialvicmt7q.R.inc(6284);Collection<Xref> xrefs = clause.getXrefs();
        __CLR4_5_24ia4ialvicmt7q.R.inc(6285);if ((((!xrefs.isEmpty())&&(__CLR4_5_24ia4ialvicmt7q.R.iget(6286)!=0|true))||(__CLR4_5_24ia4ialvicmt7q.R.iget(6287)==0&false))) {{
            __CLR4_5_24ia4ialvicmt7q.R.inc(6288);appendXrefs(sb, xrefs);
        }
        }__CLR4_5_24ia4ialvicmt7q.R.inc(6289);appendQualifiers(sb, clause);
        __CLR4_5_24ia4ialvicmt7q.R.inc(6290);if ((((idsLabel != null && idsLabel.length() > 0)&&(__CLR4_5_24ia4ialvicmt7q.R.iget(6291)!=0|true))||(__CLR4_5_24ia4ialvicmt7q.R.iget(6292)==0&false))) {{
            __CLR4_5_24ia4ialvicmt7q.R.inc(6293);String trimmed = idsLabel.toString().trim();
            __CLR4_5_24ia4ialvicmt7q.R.inc(6294);if ((((!trimmed.isEmpty())&&(__CLR4_5_24ia4ialvicmt7q.R.iget(6295)!=0|true))||(__CLR4_5_24ia4ialvicmt7q.R.iget(6296)==0&false))) {{
                __CLR4_5_24ia4ialvicmt7q.R.inc(6297);sb.append(" ! ");
                __CLR4_5_24ia4ialvicmt7q.R.inc(6298);sb.append(trimmed);
            }
        }}
        }__CLR4_5_24ia4ialvicmt7q.R.inc(6299);writeLine(sb, writer);
    }finally{__CLR4_5_24ia4ialvicmt7q.R.flushNeeded();}}

    private static boolean isOpaqueIdentifier(@Nullable String value) {try{__CLR4_5_24ia4ialvicmt7q.R.inc(6300);
        __CLR4_5_24ia4ialvicmt7q.R.inc(6301);boolean result = false;
        __CLR4_5_24ia4ialvicmt7q.R.inc(6302);if ((((value != null && !value.isEmpty())&&(__CLR4_5_24ia4ialvicmt7q.R.iget(6303)!=0|true))||(__CLR4_5_24ia4ialvicmt7q.R.iget(6304)==0&false))) {{
            // check for colon
            __CLR4_5_24ia4ialvicmt7q.R.inc(6305);int colonPos = value.indexOf(':');
            // check that the suffix after the colon contains only digits
            __CLR4_5_24ia4ialvicmt7q.R.inc(6306);if ((((colonPos > 0 && value.length() > colonPos + 1)&&(__CLR4_5_24ia4ialvicmt7q.R.iget(6307)!=0|true))||(__CLR4_5_24ia4ialvicmt7q.R.iget(6308)==0&false))) {{
                __CLR4_5_24ia4ialvicmt7q.R.inc(6309);result = true;
                __CLR4_5_24ia4ialvicmt7q.R.inc(6310);for (int i = colonPos; (((i < value.length())&&(__CLR4_5_24ia4ialvicmt7q.R.iget(6311)!=0|true))||(__CLR4_5_24ia4ialvicmt7q.R.iget(6312)==0&false)); i++) {{
                    __CLR4_5_24ia4ialvicmt7q.R.inc(6313);char c = value.charAt(i);
                    __CLR4_5_24ia4ialvicmt7q.R.inc(6314);if ((((!Character.isDigit(c) && c != ':')&&(__CLR4_5_24ia4ialvicmt7q.R.iget(6315)!=0|true))||(__CLR4_5_24ia4ialvicmt7q.R.iget(6316)==0&false))) {{
                        __CLR4_5_24ia4ialvicmt7q.R.inc(6317);result = false;
                        __CLR4_5_24ia4ialvicmt7q.R.inc(6318);break;
                    }
                }}
            }}
        }}
        }__CLR4_5_24ia4ialvicmt7q.R.inc(6319);return result;
    }finally{__CLR4_5_24ia4ialvicmt7q.R.flushNeeded();}}

    private static void appendQualifiers(@Nonnull StringBuilder sb, @Nonnull Clause clause) {try{__CLR4_5_24ia4ialvicmt7q.R.inc(6320);
        __CLR4_5_24ia4ialvicmt7q.R.inc(6321);Collection<QualifierValue> qvs = clause.getQualifierValues();
        __CLR4_5_24ia4ialvicmt7q.R.inc(6322);if ((((!qvs.isEmpty())&&(__CLR4_5_24ia4ialvicmt7q.R.iget(6323)!=0|true))||(__CLR4_5_24ia4ialvicmt7q.R.iget(6324)==0&false))) {{
            __CLR4_5_24ia4ialvicmt7q.R.inc(6325);sb.append(" {");
            __CLR4_5_24ia4ialvicmt7q.R.inc(6326);Iterator<QualifierValue> qvsIterator = qvs.iterator();
            __CLR4_5_24ia4ialvicmt7q.R.inc(6327);while ((((qvsIterator.hasNext())&&(__CLR4_5_24ia4ialvicmt7q.R.iget(6328)!=0|true))||(__CLR4_5_24ia4ialvicmt7q.R.iget(6329)==0&false))) {{
                __CLR4_5_24ia4ialvicmt7q.R.inc(6330);QualifierValue qv = qvsIterator.next();
                __CLR4_5_24ia4ialvicmt7q.R.inc(6331);sb.append(qv.getQualifier());
                __CLR4_5_24ia4ialvicmt7q.R.inc(6332);sb.append("=\"");
                __CLR4_5_24ia4ialvicmt7q.R.inc(6333);sb.append(escapeOboString(qv.getValue(), EscapeMode.quotes));
                __CLR4_5_24ia4ialvicmt7q.R.inc(6334);sb.append('"');
                __CLR4_5_24ia4ialvicmt7q.R.inc(6335);if ((((qvsIterator.hasNext())&&(__CLR4_5_24ia4ialvicmt7q.R.iget(6336)!=0|true))||(__CLR4_5_24ia4ialvicmt7q.R.iget(6337)==0&false))) {{
                    __CLR4_5_24ia4ialvicmt7q.R.inc(6338);sb.append(", ");
                }
            }}
            }__CLR4_5_24ia4ialvicmt7q.R.inc(6339);sb.append('}');
        }
    }}finally{__CLR4_5_24ia4ialvicmt7q.R.flushNeeded();}}

    /** The Enum EscapeMode. */
    private enum EscapeMode {
        /** all except xref and xrefList. */
        most, /** simple + parenthesis. */
        parenthesis, /** simple + quotes. */
        quotes, /** simple + comma + colon. */
        xref, /** xref + closing brackets. */
        xrefList, /** newline and backslash. */
        simple
    }

    @Nonnull
    private static CharSequence escapeOboString(@Nonnull String in, EscapeMode mode) {try{__CLR4_5_24ia4ialvicmt7q.R.inc(6340);
        __CLR4_5_24ia4ialvicmt7q.R.inc(6341);boolean modfied = false;
        __CLR4_5_24ia4ialvicmt7q.R.inc(6342);StringBuilder sb = new StringBuilder();
        __CLR4_5_24ia4ialvicmt7q.R.inc(6343);int length = in.length();
        __CLR4_5_24ia4ialvicmt7q.R.inc(6344);for (int i = 0; (((i < length)&&(__CLR4_5_24ia4ialvicmt7q.R.iget(6345)!=0|true))||(__CLR4_5_24ia4ialvicmt7q.R.iget(6346)==0&false)); i++) {{
            __CLR4_5_24ia4ialvicmt7q.R.inc(6347);char c = in.charAt(i);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6348);if ((((c == '\n')&&(__CLR4_5_24ia4ialvicmt7q.R.iget(6349)!=0|true))||(__CLR4_5_24ia4ialvicmt7q.R.iget(6350)==0&false))) {{
                __CLR4_5_24ia4ialvicmt7q.R.inc(6351);modfied = true;
                __CLR4_5_24ia4ialvicmt7q.R.inc(6352);sb.append("\\n");
            } }else {__CLR4_5_24ia4ialvicmt7q.R.inc(6353);if ((((c == '\\')&&(__CLR4_5_24ia4ialvicmt7q.R.iget(6354)!=0|true))||(__CLR4_5_24ia4ialvicmt7q.R.iget(6355)==0&false))) {{
                __CLR4_5_24ia4ialvicmt7q.R.inc(6356);modfied = true;
                __CLR4_5_24ia4ialvicmt7q.R.inc(6357);sb.append("\\\\");
            } }else {__CLR4_5_24ia4ialvicmt7q.R.inc(6358);if ((((c == '"' && (mode == EscapeMode.most || mode == EscapeMode.quotes))&&(__CLR4_5_24ia4ialvicmt7q.R.iget(6359)!=0|true))||(__CLR4_5_24ia4ialvicmt7q.R.iget(6360)==0&false))) {{
                __CLR4_5_24ia4ialvicmt7q.R.inc(6361);modfied = true;
                __CLR4_5_24ia4ialvicmt7q.R.inc(6362);sb.append("\\\"");
            } }else {__CLR4_5_24ia4ialvicmt7q.R.inc(6363);if ((((c == '{' && (mode == EscapeMode.most || mode == EscapeMode.parenthesis))&&(__CLR4_5_24ia4ialvicmt7q.R.iget(6364)!=0|true))||(__CLR4_5_24ia4ialvicmt7q.R.iget(6365)==0&false))) {{
                __CLR4_5_24ia4ialvicmt7q.R.inc(6366);modfied = true;
                __CLR4_5_24ia4ialvicmt7q.R.inc(6367);sb.append("\\{");
            }
            // removed for compatibility with OBO-Edit
            // else if (c == '}' && (mode == EscapeMode.most || mode ==
            // EscapeMode.parenthesis)) {
            // modfied = true;
            // sb.append("\\}");
            // }
            }else {__CLR4_5_24ia4ialvicmt7q.R.inc(6368);if ((((c == ',' && (mode == EscapeMode.xref || mode == EscapeMode.xrefList))&&(__CLR4_5_24ia4ialvicmt7q.R.iget(6369)!=0|true))||(__CLR4_5_24ia4ialvicmt7q.R.iget(6370)==0&false))) {{
                __CLR4_5_24ia4ialvicmt7q.R.inc(6371);modfied = true;
                __CLR4_5_24ia4ialvicmt7q.R.inc(6372);sb.append("\\,");
            } }else {__CLR4_5_24ia4ialvicmt7q.R.inc(6373);if ((((c == ':' && (mode == EscapeMode.xref || mode == EscapeMode.xrefList))&&(__CLR4_5_24ia4ialvicmt7q.R.iget(6374)!=0|true))||(__CLR4_5_24ia4ialvicmt7q.R.iget(6375)==0&false))) {{
                __CLR4_5_24ia4ialvicmt7q.R.inc(6376);modfied = true;
                __CLR4_5_24ia4ialvicmt7q.R.inc(6377);sb.append("\\:");
            } }else {__CLR4_5_24ia4ialvicmt7q.R.inc(6378);if ((((c == ']' && mode == EscapeMode.xrefList)&&(__CLR4_5_24ia4ialvicmt7q.R.iget(6379)!=0|true))||(__CLR4_5_24ia4ialvicmt7q.R.iget(6380)==0&false))) {{
                __CLR4_5_24ia4ialvicmt7q.R.inc(6381);modfied = true;
                __CLR4_5_24ia4ialvicmt7q.R.inc(6382);sb.append("\\]");
            } }else {{
                __CLR4_5_24ia4ialvicmt7q.R.inc(6383);sb.append(c);
            }
        }}}}}}}}
        }__CLR4_5_24ia4ialvicmt7q.R.inc(6384);if ((((modfied)&&(__CLR4_5_24ia4ialvicmt7q.R.iget(6385)!=0|true))||(__CLR4_5_24ia4ialvicmt7q.R.iget(6386)==0&false))) {{
            __CLR4_5_24ia4ialvicmt7q.R.inc(6387);return sb;
        }
        }__CLR4_5_24ia4ialvicmt7q.R.inc(6388);return in;
    }finally{__CLR4_5_24ia4ialvicmt7q.R.flushNeeded();}}

    /** The Class HeaderTagsComparator. */
    private static class HeaderTagsComparator implements StringComparator {

        static final HeaderTagsComparator INSTANCE = new HeaderTagsComparator();
        @Nonnull
        private static final Map<String, Integer> TAGSPRIORITIES = buildTagsPriorities();
        private static final long serialVersionUID = 40000L;

        @Nonnull
        private static Map<String, Integer> buildTagsPriorities() {try{__CLR4_5_24ia4ialvicmt7q.R.inc(6389);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6390);Map<String, Integer> table = new HashMap<>();
            __CLR4_5_24ia4ialvicmt7q.R.inc(6391);table.put(OboFormatTag.TAG_FORMAT_VERSION.getTag(), 0);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6392);table.put(OboFormatTag.TAG_DATA_VERSION.getTag(), 10);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6393);table.put(OboFormatTag.TAG_DATE.getTag(), 15);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6394);table.put(OboFormatTag.TAG_SAVED_BY.getTag(), 20);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6395);table.put(OboFormatTag.TAG_AUTO_GENERATED_BY.getTag(), 25);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6396);table.put(OboFormatTag.TAG_SUBSETDEF.getTag(), 35);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6397);table.put(OboFormatTag.TAG_SYNONYMTYPEDEF.getTag(), 40);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6398);table.put(OboFormatTag.TAG_DEFAULT_NAMESPACE.getTag(), 45);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6399);table.put(OboFormatTag.TAG_NAMESPACE_ID_RULE.getTag(), 46);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6400);table.put(OboFormatTag.TAG_IDSPACE.getTag(), 50);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6401);table.put(OboFormatTag.TAG_TREAT_XREFS_AS_EQUIVALENT.getTag(), 55);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6402);table.put(OboFormatTag.TAG_TREAT_XREFS_AS_GENUS_DIFFERENTIA.getTag(), 60);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6403);table.put(OboFormatTag.TAG_TREAT_XREFS_AS_RELATIONSHIP.getTag(), 65);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6404);table.put(OboFormatTag.TAG_TREAT_XREFS_AS_IS_A.getTag(), 70);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6405);table.put(OboFormatTag.TAG_REMARK.getTag(), 75);
            // moved from pos 30 to emulate OBO-Edit behavior
            __CLR4_5_24ia4ialvicmt7q.R.inc(6406);table.put(OboFormatTag.TAG_IMPORT.getTag(), 80);
            // moved from pos 5 to emulate OBO-Edit behavior
            __CLR4_5_24ia4ialvicmt7q.R.inc(6407);table.put(OboFormatTag.TAG_ONTOLOGY.getTag(), 85);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6408);table.put(OboFormatTag.TAG_PROPERTY_VALUE.getTag(), 100);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6409);table.put(OboFormatTag.TAG_OWL_AXIOMS.getTag(), 110);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6410);return table;
        }finally{__CLR4_5_24ia4ialvicmt7q.R.flushNeeded();}}

        @Override
        public int compare(String o1, String o2) {try{__CLR4_5_24ia4ialvicmt7q.R.inc(6411);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6412);Integer i1 = TAGSPRIORITIES.get(o1);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6413);Integer i2 = TAGSPRIORITIES.get(o2);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6414);if ((((i1 == null)&&(__CLR4_5_24ia4ialvicmt7q.R.iget(6415)!=0|true))||(__CLR4_5_24ia4ialvicmt7q.R.iget(6416)==0&false))) {{
                __CLR4_5_24ia4ialvicmt7q.R.inc(6417);i1 = 10000;
            }
            }__CLR4_5_24ia4ialvicmt7q.R.inc(6418);if ((((i2 == null)&&(__CLR4_5_24ia4ialvicmt7q.R.iget(6419)!=0|true))||(__CLR4_5_24ia4ialvicmt7q.R.iget(6420)==0&false))) {{
                __CLR4_5_24ia4ialvicmt7q.R.inc(6421);i2 = 10000;
            }
            }__CLR4_5_24ia4ialvicmt7q.R.inc(6422);return i1.compareTo(i2);
        }finally{__CLR4_5_24ia4ialvicmt7q.R.flushNeeded();}}
    }

    /** The Class TermsTagsComparator. */
    private static class TermsTagsComparator implements StringComparator {

        static final TermsTagsComparator INSTANCE = new TermsTagsComparator();
        @Nonnull
        private static final Map<String, Integer> TAGSPRIORITIES = buildTagsPriorities();
        private static final long serialVersionUID = 40000L;

        @Nonnull
        private static Map<String, Integer> buildTagsPriorities() {try{__CLR4_5_24ia4ialvicmt7q.R.inc(6423);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6424);Map<String, Integer> table = new HashMap<>();
            __CLR4_5_24ia4ialvicmt7q.R.inc(6425);table.put(OboFormatTag.TAG_ID.getTag(), 5);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6426);table.put(OboFormatTag.TAG_IS_ANONYMOUS.getTag(), 10);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6427);table.put(OboFormatTag.TAG_NAME.getTag(), 15);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6428);table.put(OboFormatTag.TAG_NAMESPACE.getTag(), 20);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6429);table.put(OboFormatTag.TAG_ALT_ID.getTag(), 25);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6430);table.put(OboFormatTag.TAG_DEF.getTag(), 30);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6431);table.put(OboFormatTag.TAG_COMMENT.getTag(), 35);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6432);table.put(OboFormatTag.TAG_SUBSET.getTag(), 40);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6433);table.put(OboFormatTag.TAG_SYNONYM.getTag(), 45);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6434);table.put(OboFormatTag.TAG_XREF.getTag(), 50);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6435);table.put(OboFormatTag.TAG_BUILTIN.getTag(), 55);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6436);table.put(OboFormatTag.TAG_HOLDS_OVER_CHAIN.getTag(), 60);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6437);table.put(OboFormatTag.TAG_IS_A.getTag(), 65);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6438);table.put(OboFormatTag.TAG_INTERSECTION_OF.getTag(), 70);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6439);table.put(OboFormatTag.TAG_UNION_OF.getTag(), 80);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6440);table.put(OboFormatTag.TAG_EQUIVALENT_TO.getTag(), 85);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6441);table.put(OboFormatTag.TAG_DISJOINT_FROM.getTag(), 90);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6442);table.put(OboFormatTag.TAG_RELATIONSHIP.getTag(), 95);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6443);table.put(OboFormatTag.TAG_PROPERTY_VALUE.getTag(), 98);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6444);table.put(OboFormatTag.TAG_IS_OBSELETE.getTag(), 110);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6445);table.put(OboFormatTag.TAG_REPLACED_BY.getTag(), 115);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6446);table.put(OboFormatTag.TAG_CONSIDER.getTag(), 120);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6447);table.put(OboFormatTag.TAG_CREATED_BY.getTag(), 130);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6448);table.put(OboFormatTag.TAG_CREATION_DATE.getTag(), 140);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6449);return table;
        }finally{__CLR4_5_24ia4ialvicmt7q.R.flushNeeded();}}

        @Override
        public int compare(String o1, String o2) {try{__CLR4_5_24ia4ialvicmt7q.R.inc(6450);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6451);Integer i1 = TAGSPRIORITIES.get(o1);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6452);Integer i2 = TAGSPRIORITIES.get(o2);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6453);if ((((i1 == null)&&(__CLR4_5_24ia4ialvicmt7q.R.iget(6454)!=0|true))||(__CLR4_5_24ia4ialvicmt7q.R.iget(6455)==0&false))) {{
                __CLR4_5_24ia4ialvicmt7q.R.inc(6456);i1 = 10000;
            }
            }__CLR4_5_24ia4ialvicmt7q.R.inc(6457);if ((((i2 == null)&&(__CLR4_5_24ia4ialvicmt7q.R.iget(6458)!=0|true))||(__CLR4_5_24ia4ialvicmt7q.R.iget(6459)==0&false))) {{
                __CLR4_5_24ia4ialvicmt7q.R.inc(6460);i2 = 10000;
            }
            }__CLR4_5_24ia4ialvicmt7q.R.inc(6461);return i1.compareTo(i2);
        }finally{__CLR4_5_24ia4ialvicmt7q.R.flushNeeded();}}
    }

    /** The Class ClauseListComparator. */
    private static class ClauseListComparator implements Comparator<Clause>, Serializable {

        protected static final ClauseListComparator INSTANCE = new ClauseListComparator();
        private static final long serialVersionUID = 40000L;

        @Override
        public int compare(Clause o1, Clause o2) {try{__CLR4_5_24ia4ialvicmt7q.R.inc(6462);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6463);String t1 = o1.getTag();
            __CLR4_5_24ia4ialvicmt7q.R.inc(6464);String t2 = o2.getTag();
            __CLR4_5_24ia4ialvicmt7q.R.inc(6465);int compare = TermsTagsComparator.INSTANCE.compare(t1, t2);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6466);if ((((compare == 0)&&(__CLR4_5_24ia4ialvicmt7q.R.iget(6467)!=0|true))||(__CLR4_5_24ia4ialvicmt7q.R.iget(6468)==0&false))) {{
                __CLR4_5_24ia4ialvicmt7q.R.inc(6469);compare = ClauseComparator.INSTANCE.compare(o1, o2);
            }
            }__CLR4_5_24ia4ialvicmt7q.R.inc(6470);return compare;
        }finally{__CLR4_5_24ia4ialvicmt7q.R.flushNeeded();}}
    }

    /**
     * Sort a list of term frame clauses according to in the OBO format
     * specified tag and value order.
     * 
     * @param clauses
     *        the clauses
     */
    public static void sortTermClauses(@Nonnull List<Clause> clauses) {try{__CLR4_5_24ia4ialvicmt7q.R.inc(6471);
        __CLR4_5_24ia4ialvicmt7q.R.inc(6472);Collections.sort(clauses, ClauseListComparator.INSTANCE);
    }finally{__CLR4_5_24ia4ialvicmt7q.R.flushNeeded();}}

    /** The Class TypeDefTagsComparator. */
    private static class TypeDefTagsComparator implements StringComparator {

        static final TypeDefTagsComparator INSTANCE = new TypeDefTagsComparator();
        @Nonnull
        private static final Map<String, Integer> TAGSPRIORITIES = buildTagsPriorities();
        private static final long serialVersionUID = 40000L;

        @Nonnull
        private static Map<String, Integer> buildTagsPriorities() {try{__CLR4_5_24ia4ialvicmt7q.R.inc(6473);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6474);Map<String, Integer> table = new HashMap<>();
            __CLR4_5_24ia4ialvicmt7q.R.inc(6475);table.put(OboFormatTag.TAG_ID.getTag(), 5);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6476);table.put(OboFormatTag.TAG_IS_ANONYMOUS.getTag(), 10);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6477);table.put(OboFormatTag.TAG_NAME.getTag(), 15);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6478);table.put(OboFormatTag.TAG_NAMESPACE.getTag(), 20);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6479);table.put(OboFormatTag.TAG_ALT_ID.getTag(), 25);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6480);table.put(OboFormatTag.TAG_DEF.getTag(), 30);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6481);table.put(OboFormatTag.TAG_COMMENT.getTag(), 35);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6482);table.put(OboFormatTag.TAG_SUBSET.getTag(), 40);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6483);table.put(OboFormatTag.TAG_SYNONYM.getTag(), 45);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6484);table.put(OboFormatTag.TAG_XREF.getTag(), 50);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6485);table.put(OboFormatTag.TAG_PROPERTY_VALUE.getTag(), 55);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6486);table.put(OboFormatTag.TAG_DOMAIN.getTag(), 60);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6487);table.put(OboFormatTag.TAG_RANGE.getTag(), 65);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6488);table.put(OboFormatTag.TAG_BUILTIN.getTag(), 70);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6489);table.put(OboFormatTag.TAG_HOLDS_OVER_CHAIN.getTag(), 71);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6490);table.put(OboFormatTag.TAG_IS_ANTI_SYMMETRIC.getTag(), 75);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6491);table.put(OboFormatTag.TAG_IS_CYCLIC.getTag(), 80);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6492);table.put(OboFormatTag.TAG_IS_REFLEXIVE.getTag(), 85);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6493);table.put(OboFormatTag.TAG_IS_SYMMETRIC.getTag(), 90);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6494);table.put(OboFormatTag.TAG_IS_TRANSITIVE.getTag(), 100);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6495);table.put(OboFormatTag.TAG_IS_FUNCTIONAL.getTag(), 105);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6496);table.put(OboFormatTag.TAG_IS_INVERSE_FUNCTIONAL.getTag(), 110);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6497);table.put(OboFormatTag.TAG_IS_A.getTag(), 115);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6498);table.put(OboFormatTag.TAG_INTERSECTION_OF.getTag(), 120);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6499);table.put(OboFormatTag.TAG_UNION_OF.getTag(), 125);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6500);table.put(OboFormatTag.TAG_EQUIVALENT_TO.getTag(), 130);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6501);table.put(OboFormatTag.TAG_DISJOINT_FROM.getTag(), 135);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6502);table.put(OboFormatTag.TAG_INVERSE_OF.getTag(), 140);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6503);table.put(OboFormatTag.TAG_TRANSITIVE_OVER.getTag(), 145);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6504);table.put(OboFormatTag.TAG_EQUIVALENT_TO_CHAIN.getTag(), 155);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6505);table.put(OboFormatTag.TAG_DISJOINT_OVER.getTag(), 160);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6506);table.put(OboFormatTag.TAG_RELATIONSHIP.getTag(), 165);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6507);table.put(OboFormatTag.TAG_IS_OBSELETE.getTag(), 169);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6508);table.put(OboFormatTag.TAG_REPLACED_BY.getTag(), 185);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6509);table.put(OboFormatTag.TAG_CONSIDER.getTag(), 190);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6510);table.put(OboFormatTag.TAG_CREATED_BY.getTag(), 191);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6511);table.put(OboFormatTag.TAG_CREATION_DATE.getTag(), 192);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6512);table.put(OboFormatTag.TAG_EXPAND_ASSERTION_TO.getTag(), 195);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6513);table.put(OboFormatTag.TAG_EXPAND_EXPRESSION_TO.getTag(), 200);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6514);table.put(OboFormatTag.TAG_IS_METADATA_TAG.getTag(), 205);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6515);table.put(OboFormatTag.TAG_IS_CLASS_LEVEL_TAG.getTag(), 210);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6516);return table;
        }finally{__CLR4_5_24ia4ialvicmt7q.R.flushNeeded();}}

        @Override
        public int compare(String o1, String o2) {try{__CLR4_5_24ia4ialvicmt7q.R.inc(6517);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6518);Integer i1 = TAGSPRIORITIES.get(o1);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6519);Integer i2 = TAGSPRIORITIES.get(o2);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6520);if ((((i1 == null)&&(__CLR4_5_24ia4ialvicmt7q.R.iget(6521)!=0|true))||(__CLR4_5_24ia4ialvicmt7q.R.iget(6522)==0&false))) {{
                __CLR4_5_24ia4ialvicmt7q.R.inc(6523);i1 = 10000;
            }
            }__CLR4_5_24ia4ialvicmt7q.R.inc(6524);if ((((i2 == null)&&(__CLR4_5_24ia4ialvicmt7q.R.iget(6525)!=0|true))||(__CLR4_5_24ia4ialvicmt7q.R.iget(6526)==0&false))) {{
                __CLR4_5_24ia4ialvicmt7q.R.inc(6527);i2 = 10000;
            }
            }__CLR4_5_24ia4ialvicmt7q.R.inc(6528);return i1.compareTo(i2);
        }finally{__CLR4_5_24ia4ialvicmt7q.R.flushNeeded();}}
    }

    /** The Class FramesComparator. */
    private static class FramesComparator implements Comparator<Frame>, Serializable {

        static final FramesComparator INSTANCE = new FramesComparator();
        private static final long serialVersionUID = 40000L;

        @Override
        public int compare(Frame o1, Frame o2) {try{__CLR4_5_24ia4ialvicmt7q.R.inc(6529);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6530);return o1.getId().compareTo(o2.getId());
        }finally{__CLR4_5_24ia4ialvicmt7q.R.flushNeeded();}}
    }

    /**
     * This comparator sorts clauses with the same tag in the specified write
     * order.
     */
    private static class ClauseComparator implements Comparator<Clause>, Serializable {

        static final ClauseComparator INSTANCE = new ClauseComparator();
        private static final long serialVersionUID = 40000L;

        @Override
        public int compare(Clause o1, Clause o2) {try{__CLR4_5_24ia4ialvicmt7q.R.inc(6531);
            // special case for intersections
            __CLR4_5_24ia4ialvicmt7q.R.inc(6532);String tag = o1.getTag();
            __CLR4_5_24ia4ialvicmt7q.R.inc(6533);if ((((OboFormatTag.TAG_INTERSECTION_OF.getTag().equals(tag))&&(__CLR4_5_24ia4ialvicmt7q.R.iget(6534)!=0|true))||(__CLR4_5_24ia4ialvicmt7q.R.iget(6535)==0&false))) {{
                // sort by values size, prefer short ones.
                __CLR4_5_24ia4ialvicmt7q.R.inc(6536);int s1 = o1.getValues().size();
                __CLR4_5_24ia4ialvicmt7q.R.inc(6537);int s2 = o2.getValues().size();
                __CLR4_5_24ia4ialvicmt7q.R.inc(6538);if ((((s1 < s2)&&(__CLR4_5_24ia4ialvicmt7q.R.iget(6539)!=0|true))||(__CLR4_5_24ia4ialvicmt7q.R.iget(6540)==0&false))) {{
                    __CLR4_5_24ia4ialvicmt7q.R.inc(6541);return -1;
                } }else {__CLR4_5_24ia4ialvicmt7q.R.inc(6542);if ((((s1 > s2)&&(__CLR4_5_24ia4ialvicmt7q.R.iget(6543)!=0|true))||(__CLR4_5_24ia4ialvicmt7q.R.iget(6544)==0&false))) {{
                    __CLR4_5_24ia4ialvicmt7q.R.inc(6545);return 1;
                }
            }}}
            // sort by value
            }__CLR4_5_24ia4ialvicmt7q.R.inc(6546);int comp = compareValues(o1.getValue(), o2.getValue());
            __CLR4_5_24ia4ialvicmt7q.R.inc(6547);if ((((comp != 0)&&(__CLR4_5_24ia4ialvicmt7q.R.iget(6548)!=0|true))||(__CLR4_5_24ia4ialvicmt7q.R.iget(6549)==0&false))) {{
                __CLR4_5_24ia4ialvicmt7q.R.inc(6550);return comp;
            }
            }__CLR4_5_24ia4ialvicmt7q.R.inc(6551);return compareValues(o1.getValue2(), o2.getValue2());
        }finally{__CLR4_5_24ia4ialvicmt7q.R.flushNeeded();}}

        /**
         * Compare values.
         * 
         * @param o1
         *        the o1
         * @param o2
         *        the o2
         * @return the int
         */
        @SuppressWarnings("null")
        private static int compareValues(@Nullable Object o1, @Nullable Object o2) {try{__CLR4_5_24ia4ialvicmt7q.R.inc(6552);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6553);if ((((o1 == null && o2 == null)&&(__CLR4_5_24ia4ialvicmt7q.R.iget(6554)!=0|true))||(__CLR4_5_24ia4ialvicmt7q.R.iget(6555)==0&false))) {{
                __CLR4_5_24ia4ialvicmt7q.R.inc(6556);return 0;
            }
            }__CLR4_5_24ia4ialvicmt7q.R.inc(6557);if ((((o1 == null)&&(__CLR4_5_24ia4ialvicmt7q.R.iget(6558)!=0|true))||(__CLR4_5_24ia4ialvicmt7q.R.iget(6559)==0&false))) {{
                __CLR4_5_24ia4ialvicmt7q.R.inc(6560);return -1;
            }
            }__CLR4_5_24ia4ialvicmt7q.R.inc(6561);if ((((o2 == null)&&(__CLR4_5_24ia4ialvicmt7q.R.iget(6562)!=0|true))||(__CLR4_5_24ia4ialvicmt7q.R.iget(6563)==0&false))) {{
                __CLR4_5_24ia4ialvicmt7q.R.inc(6564);return 1;
            }
            }__CLR4_5_24ia4ialvicmt7q.R.inc(6565);String s1 = toStringRepresentation(o1);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6566);String s2 = toStringRepresentation(o2);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6567);int comp = s1.compareToIgnoreCase(s2);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6568);if ((((comp == 0)&&(__CLR4_5_24ia4ialvicmt7q.R.iget(6569)!=0|true))||(__CLR4_5_24ia4ialvicmt7q.R.iget(6570)==0&false))) {{
                // normally ignore case, for sorting
                // but if the strings are equal,
                // try again with case check
                __CLR4_5_24ia4ialvicmt7q.R.inc(6571);comp = s1.compareTo(s2);
            }
            }__CLR4_5_24ia4ialvicmt7q.R.inc(6572);return comp;
        }finally{__CLR4_5_24ia4ialvicmt7q.R.flushNeeded();}}

        /**
         * @param obj
         *        the obj
         * @return toString representation
         */
        @Nullable
        private static String toStringRepresentation(@Nullable Object obj) {try{__CLR4_5_24ia4ialvicmt7q.R.inc(6573);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6574);String s = null;
            __CLR4_5_24ia4ialvicmt7q.R.inc(6575);if ((((obj != null)&&(__CLR4_5_24ia4ialvicmt7q.R.iget(6576)!=0|true))||(__CLR4_5_24ia4ialvicmt7q.R.iget(6577)==0&false))) {{
                __CLR4_5_24ia4ialvicmt7q.R.inc(6578);if ((((obj instanceof Xref)&&(__CLR4_5_24ia4ialvicmt7q.R.iget(6579)!=0|true))||(__CLR4_5_24ia4ialvicmt7q.R.iget(6580)==0&false))) {{
                    __CLR4_5_24ia4ialvicmt7q.R.inc(6581);Xref xref = (Xref) obj;
                    __CLR4_5_24ia4ialvicmt7q.R.inc(6582);s = xref.getIdref() + ' ' + xref.getAnnotation();
                } }else {__CLR4_5_24ia4ialvicmt7q.R.inc(6583);if ((((obj instanceof String)&&(__CLR4_5_24ia4ialvicmt7q.R.iget(6584)!=0|true))||(__CLR4_5_24ia4ialvicmt7q.R.iget(6585)==0&false))) {{
                    __CLR4_5_24ia4ialvicmt7q.R.inc(6586);s = (String) obj;
                } }else {{
                    __CLR4_5_24ia4ialvicmt7q.R.inc(6587);s = obj.toString();
                }
            }}}
            }__CLR4_5_24ia4ialvicmt7q.R.inc(6588);return s;
        }finally{__CLR4_5_24ia4ialvicmt7q.R.flushNeeded();}}
    }

    /** The Class XrefComparator. */
    private static class XrefComparator implements Comparator<Xref>, Serializable {

        static final XrefComparator INSTANCE = new XrefComparator();
        private static final long serialVersionUID = 40000L;

        @Override
        public int compare(Xref o1, Xref o2) {try{__CLR4_5_24ia4ialvicmt7q.R.inc(6589);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6590);String idref1 = o1.getIdref();
            __CLR4_5_24ia4ialvicmt7q.R.inc(6591);String idref2 = o2.getIdref();
            __CLR4_5_24ia4ialvicmt7q.R.inc(6592);return idref1.compareToIgnoreCase(idref2);
        }finally{__CLR4_5_24ia4ialvicmt7q.R.flushNeeded();}}
    }

    /**
     * Provide names for given OBO identifiers. This abstraction layer allows to
     * find names from different sources, including {@link OBODoc}.
     */
    public interface NameProvider {

        /**
         * Try to retrieve the valid name for the given identifier. If not
         * available return null.
         * 
         * @param id
         *        identifier
         * @return name or null
         */
        @Nullable
        String getName(@Nonnull String id);

        /**
         * Retrieve the default OBO namespace.
         * 
         * @return default OBO namespace or null
         */
        @Nullable
        String getDefaultOboNamespace();
    }

    /**
     * Default implementation of a {@link NameProvider} using an underlying.
     * {@link OBODoc}.
     */
    public static class OBODocNameProvider implements NameProvider {

        @Nonnull
        private final OBODoc oboDoc;
        @Nullable
        private final String defaultOboNamespace;

        /**
         * Instantiates a new OBO doc name provider.
         * 
         * @param oboDoc
         *        the obo doc
         */
        public OBODocNameProvider(@Nonnull OBODoc oboDoc) {try{__CLR4_5_24ia4ialvicmt7q.R.inc(6593);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6594);this.oboDoc = oboDoc;
            __CLR4_5_24ia4ialvicmt7q.R.inc(6595);Frame headerFrame = oboDoc.getHeaderFrame();
            __CLR4_5_24ia4ialvicmt7q.R.inc(6596);if ((((headerFrame != null)&&(__CLR4_5_24ia4ialvicmt7q.R.iget(6597)!=0|true))||(__CLR4_5_24ia4ialvicmt7q.R.iget(6598)==0&false))) {{
                __CLR4_5_24ia4ialvicmt7q.R.inc(6599);defaultOboNamespace = headerFrame.getTagValue(OboFormatTag.TAG_DEFAULT_NAMESPACE, String.class);
            } }else {{
                __CLR4_5_24ia4ialvicmt7q.R.inc(6600);defaultOboNamespace = null;
            }
        }}finally{__CLR4_5_24ia4ialvicmt7q.R.flushNeeded();}}

        @Nullable
        @Override
        public String getName(String id) {try{__CLR4_5_24ia4ialvicmt7q.R.inc(6601);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6602);String name = null;
            __CLR4_5_24ia4ialvicmt7q.R.inc(6603);Frame frame = oboDoc.getTermFrame(id);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6604);if ((((frame == null)&&(__CLR4_5_24ia4ialvicmt7q.R.iget(6605)!=0|true))||(__CLR4_5_24ia4ialvicmt7q.R.iget(6606)==0&false))) {{
                __CLR4_5_24ia4ialvicmt7q.R.inc(6607);frame = oboDoc.getTypedefFrame(id);
            }
            }__CLR4_5_24ia4ialvicmt7q.R.inc(6608);if ((((frame != null)&&(__CLR4_5_24ia4ialvicmt7q.R.iget(6609)!=0|true))||(__CLR4_5_24ia4ialvicmt7q.R.iget(6610)==0&false))) {{
                __CLR4_5_24ia4ialvicmt7q.R.inc(6611);Clause cl = frame.getClause(OboFormatTag.TAG_NAME);
                __CLR4_5_24ia4ialvicmt7q.R.inc(6612);if ((((cl != null)&&(__CLR4_5_24ia4ialvicmt7q.R.iget(6613)!=0|true))||(__CLR4_5_24ia4ialvicmt7q.R.iget(6614)==0&false))) {{
                    __CLR4_5_24ia4ialvicmt7q.R.inc(6615);name = cl.getValue(String.class);
                }
            }}
            }__CLR4_5_24ia4ialvicmt7q.R.inc(6616);return name;
        }finally{__CLR4_5_24ia4ialvicmt7q.R.flushNeeded();}}

        @Nullable
        @Override
        public String getDefaultOboNamespace() {try{__CLR4_5_24ia4ialvicmt7q.R.inc(6617);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6618);return defaultOboNamespace;
        }finally{__CLR4_5_24ia4ialvicmt7q.R.flushNeeded();}}
    }

    /**
     * Alternative implementation to lookup labels in an {@link OWLOntology}.
     * <br>
     * This implementation might be a bit slower as it involves additional id
     * conversion back into OWL.
     */
    public static class OWLOntologyNameProvider implements NameProvider {

        @Nonnull
        private final OWLOntology ont;
        @Nullable
        private final String defaultOboNamespace;

        /**
         * @param ont
         *        ontology
         * @param defaultOboNamespace
         *        default OBO namespace
         */
        public OWLOntologyNameProvider(@Nonnull OWLOntology ont, String defaultOboNamespace) {try{__CLR4_5_24ia4ialvicmt7q.R.inc(6619);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6620);this.ont = ont;
            __CLR4_5_24ia4ialvicmt7q.R.inc(6621);this.defaultOboNamespace = defaultOboNamespace;
        }finally{__CLR4_5_24ia4ialvicmt7q.R.flushNeeded();}}

        @Override
        public String getName(String id) {try{__CLR4_5_24ia4ialvicmt7q.R.inc(6622);
            // convert OBO id to IRI
            __CLR4_5_24ia4ialvicmt7q.R.inc(6623);OWLAPIObo2Owl obo2owl = new OWLAPIObo2Owl(ont.getOWLOntologyManager());
            __CLR4_5_24ia4ialvicmt7q.R.inc(6624);IRI iri = obo2owl.oboIdToIRI(id);
            // look for label of entity
            __CLR4_5_24ia4ialvicmt7q.R.inc(6625);Set<OWLAnnotationAssertionAxiom> axioms = ont.getAxioms(OWLAnnotationAssertionAxiom.class,
                OWLAnnotationSubject.class, iri, Imports.INCLUDED, IN_SUB_POSITION);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6626);for (OWLAnnotationAssertionAxiom axiom : axioms) {{
                __CLR4_5_24ia4ialvicmt7q.R.inc(6627);if ((((axiom.getProperty().isLabel())&&(__CLR4_5_24ia4ialvicmt7q.R.iget(6628)!=0|true))||(__CLR4_5_24ia4ialvicmt7q.R.iget(6629)==0&false))) {{
                    __CLR4_5_24ia4ialvicmt7q.R.inc(6630);OWLAnnotationValue value = axiom.getValue();
                    __CLR4_5_24ia4ialvicmt7q.R.inc(6631);if ((((value instanceof OWLLiteral)&&(__CLR4_5_24ia4ialvicmt7q.R.iget(6632)!=0|true))||(__CLR4_5_24ia4ialvicmt7q.R.iget(6633)==0&false))) {{
                        __CLR4_5_24ia4ialvicmt7q.R.inc(6634);return ((OWLLiteral) value).getLiteral();
                    }
                }}
            }}
            }__CLR4_5_24ia4ialvicmt7q.R.inc(6635);return null;
        }finally{__CLR4_5_24ia4ialvicmt7q.R.flushNeeded();}}

        @Override
        public String getDefaultOboNamespace() {try{__CLR4_5_24ia4ialvicmt7q.R.inc(6636);
            __CLR4_5_24ia4ialvicmt7q.R.inc(6637);return defaultOboNamespace;
        }finally{__CLR4_5_24ia4ialvicmt7q.R.flushNeeded();}}
    }
}
