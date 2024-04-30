/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.obolibrary.oboformat.model;

import java.util.*;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.obolibrary.obo2owl.OboInOwlCardinalityTools;
import org.obolibrary.oboformat.model.Frame.FrameType;
import org.obolibrary.oboformat.parser.OBOFormatConstants.OboFormatTag;

/**
 * An OBODoc is a container for a header frame and zero or more entity frames.
 */
public class OBODoc {public static class __CLR4_5_237q37qlvicmt4k{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u006f\u0062\u006f\u0066\u006f\u0072\u006d\u0061\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237308750L,8589935092L,4334,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** The header frame. */
    protected Frame headerFrame;
    /** The term frame map. */
    @Nonnull
    protected final Map<String, Frame> termFrameMap = new HashMap<>();
    /** The typedef frame map. */
    @Nonnull
    protected final Map<String, Frame> typedefFrameMap = new HashMap<>();
    /** The instance frame map. */
    @Nonnull
    protected final Map<String, Frame> instanceFrameMap = new HashMap<>();
    /** The annotation frames. */
    @Nonnull
    protected final Collection<Frame> annotationFrames = new LinkedList<>();
    /** The imported obo docs. */
    protected Collection<OBODoc> importedOBODocs = new LinkedList<>();

    /** default constructor. */
    public OBODoc() {try{__CLR4_5_237q37qlvicmt4k.R.inc(4166);}finally{__CLR4_5_237q37qlvicmt4k.R.flushNeeded();}}

    /**
     * @return the header frame
     */
    public Frame getHeaderFrame() {try{__CLR4_5_237q37qlvicmt4k.R.inc(4167);
        __CLR4_5_237q37qlvicmt4k.R.inc(4168);return headerFrame;
    }finally{__CLR4_5_237q37qlvicmt4k.R.flushNeeded();}}

    /**
     * @param headerFrame
     *        the new header frame
     */
    public void setHeaderFrame(Frame headerFrame) {try{__CLR4_5_237q37qlvicmt4k.R.inc(4169);
        __CLR4_5_237q37qlvicmt4k.R.inc(4170);this.headerFrame = headerFrame;
    }finally{__CLR4_5_237q37qlvicmt4k.R.flushNeeded();}}

    /**
     * @return the term frames
     */
    @Nonnull
    public Collection<Frame> getTermFrames() {try{__CLR4_5_237q37qlvicmt4k.R.inc(4171);
        __CLR4_5_237q37qlvicmt4k.R.inc(4172);return termFrameMap.values();
    }finally{__CLR4_5_237q37qlvicmt4k.R.flushNeeded();}}

    /**
     * @return the typedef frames
     */
    @Nonnull
    public Collection<Frame> getTypedefFrames() {try{__CLR4_5_237q37qlvicmt4k.R.inc(4173);
        __CLR4_5_237q37qlvicmt4k.R.inc(4174);return typedefFrameMap.values();
    }finally{__CLR4_5_237q37qlvicmt4k.R.flushNeeded();}}

    /**
     * @return the instance frames
     */
    @Nonnull
    public Collection<Frame> getInstanceFrames() {try{__CLR4_5_237q37qlvicmt4k.R.inc(4175);
        __CLR4_5_237q37qlvicmt4k.R.inc(4176);return instanceFrameMap.values();
    }finally{__CLR4_5_237q37qlvicmt4k.R.flushNeeded();}}

    /**
     * Freezing an OBODoc signals that the document has become quiescent, and that the system may optimize data
     * structures for performance or space.
     */

    public void freezeFrames() {try{__CLR4_5_237q37qlvicmt4k.R.inc(4177);
        __CLR4_5_237q37qlvicmt4k.R.inc(4178);headerFrame.freeze();
        __CLR4_5_237q37qlvicmt4k.R.inc(4179);freezeFrameMap(termFrameMap);
        __CLR4_5_237q37qlvicmt4k.R.inc(4180);freezeFrameMap(typedefFrameMap);
        __CLR4_5_237q37qlvicmt4k.R.inc(4181);freezeFrameMap(instanceFrameMap);
        __CLR4_5_237q37qlvicmt4k.R.inc(4182);for (Frame frame : annotationFrames) {{
            __CLR4_5_237q37qlvicmt4k.R.inc(4183);frame.freeze();
        }

    }}finally{__CLR4_5_237q37qlvicmt4k.R.flushNeeded();}}

    private static void freezeFrameMap(Map<String, Frame> frameMap) {try{__CLR4_5_237q37qlvicmt4k.R.inc(4184);
        __CLR4_5_237q37qlvicmt4k.R.inc(4185);for (Frame frame : frameMap.values()) {{
            __CLR4_5_237q37qlvicmt4k.R.inc(4186);frame.freeze();
        }
    }}finally{__CLR4_5_237q37qlvicmt4k.R.flushNeeded();}}

    /**
     * @param id
     *        the id
     * @return the term frame
     */
    @Nullable
    public Frame getTermFrame(String id) {try{__CLR4_5_237q37qlvicmt4k.R.inc(4187);
        __CLR4_5_237q37qlvicmt4k.R.inc(4188);return getTermFrame(id, false);
    }finally{__CLR4_5_237q37qlvicmt4k.R.flushNeeded();}}

    /**
     * @param id
     *        the id
     * @param followImport
     *        the follow import
     * @return the term frame
     */
    @Nullable
    public Frame getTermFrame(String id, boolean followImport) {try{__CLR4_5_237q37qlvicmt4k.R.inc(4189);
        __CLR4_5_237q37qlvicmt4k.R.inc(4190);if ((((!followImport)&&(__CLR4_5_237q37qlvicmt4k.R.iget(4191)!=0|true))||(__CLR4_5_237q37qlvicmt4k.R.iget(4192)==0&false))) {{
            __CLR4_5_237q37qlvicmt4k.R.inc(4193);return termFrameMap.get(id);
        }
        // this set is used to check for cycles
        }__CLR4_5_237q37qlvicmt4k.R.inc(4194);Set<String> visited = new HashSet<>();
        __CLR4_5_237q37qlvicmt4k.R.inc(4195);visited.add(getHeaderDescriptor());
        __CLR4_5_237q37qlvicmt4k.R.inc(4196);return getTermFrame(id, visited);
    }finally{__CLR4_5_237q37qlvicmt4k.R.flushNeeded();}}

    /**
     * @param id
     *        the id
     * @param visitedDocs
     *        the visited docs
     * @return the frame
     */
    @Nullable
    private Frame getTermFrame(String id, @Nonnull Set<String> visitedDocs) {try{__CLR4_5_237q37qlvicmt4k.R.inc(4197);
        __CLR4_5_237q37qlvicmt4k.R.inc(4198);Frame f = termFrameMap.get(id);
        __CLR4_5_237q37qlvicmt4k.R.inc(4199);if ((((f != null)&&(__CLR4_5_237q37qlvicmt4k.R.iget(4200)!=0|true))||(__CLR4_5_237q37qlvicmt4k.R.iget(4201)==0&false))) {{
            __CLR4_5_237q37qlvicmt4k.R.inc(4202);return f;
        }
        }__CLR4_5_237q37qlvicmt4k.R.inc(4203);for (OBODoc doc : importedOBODocs) {{
            __CLR4_5_237q37qlvicmt4k.R.inc(4204);String headerDescriptor = doc.getHeaderDescriptor();
            __CLR4_5_237q37qlvicmt4k.R.inc(4205);if ((((!visitedDocs.contains(headerDescriptor))&&(__CLR4_5_237q37qlvicmt4k.R.iget(4206)!=0|true))||(__CLR4_5_237q37qlvicmt4k.R.iget(4207)==0&false))) {{
                __CLR4_5_237q37qlvicmt4k.R.inc(4208);visitedDocs.add(headerDescriptor);
                __CLR4_5_237q37qlvicmt4k.R.inc(4209);f = doc.getTermFrame(id, true);
            }
            }__CLR4_5_237q37qlvicmt4k.R.inc(4210);if ((((f != null)&&(__CLR4_5_237q37qlvicmt4k.R.iget(4211)!=0|true))||(__CLR4_5_237q37qlvicmt4k.R.iget(4212)==0&false))) {{
                __CLR4_5_237q37qlvicmt4k.R.inc(4213);return f;
            }
        }}
        }__CLR4_5_237q37qlvicmt4k.R.inc(4214);return null;
    }finally{__CLR4_5_237q37qlvicmt4k.R.flushNeeded();}}

    /**
     * @param id
     *        the id
     * @return the typedef frame
     */
    @Nullable
    public Frame getTypedefFrame(String id) {try{__CLR4_5_237q37qlvicmt4k.R.inc(4215);
        __CLR4_5_237q37qlvicmt4k.R.inc(4216);return getTypedefFrame(id, false);
    }finally{__CLR4_5_237q37qlvicmt4k.R.flushNeeded();}}

    /**
     * @param id
     *        the id
     * @param followImports
     *        the follow imports
     * @return the typedef frame
     */
    @Nullable
    public Frame getTypedefFrame(String id, boolean followImports) {try{__CLR4_5_237q37qlvicmt4k.R.inc(4217);
        __CLR4_5_237q37qlvicmt4k.R.inc(4218);if ((((!followImports)&&(__CLR4_5_237q37qlvicmt4k.R.iget(4219)!=0|true))||(__CLR4_5_237q37qlvicmt4k.R.iget(4220)==0&false))) {{
            __CLR4_5_237q37qlvicmt4k.R.inc(4221);return typedefFrameMap.get(id);
        }
        // this set is used to check for cycles
        }__CLR4_5_237q37qlvicmt4k.R.inc(4222);Set<String> visited = new HashSet<>();
        __CLR4_5_237q37qlvicmt4k.R.inc(4223);visited.add(getHeaderDescriptor());
        __CLR4_5_237q37qlvicmt4k.R.inc(4224);return getTypedefFrame(id, visited);
    }finally{__CLR4_5_237q37qlvicmt4k.R.flushNeeded();}}

    /**
     * @param id
     *        the id
     * @param visitedDocs
     *        the visited docs
     * @return the frame
     */
    @Nullable
    private Frame getTypedefFrame(String id, @Nonnull Set<String> visitedDocs) {try{__CLR4_5_237q37qlvicmt4k.R.inc(4225);
        __CLR4_5_237q37qlvicmt4k.R.inc(4226);Frame f = typedefFrameMap.get(id);
        __CLR4_5_237q37qlvicmt4k.R.inc(4227);if ((((f != null)&&(__CLR4_5_237q37qlvicmt4k.R.iget(4228)!=0|true))||(__CLR4_5_237q37qlvicmt4k.R.iget(4229)==0&false))) {{
            __CLR4_5_237q37qlvicmt4k.R.inc(4230);return f;
        }
        }__CLR4_5_237q37qlvicmt4k.R.inc(4231);for (OBODoc doc : importedOBODocs) {{
            __CLR4_5_237q37qlvicmt4k.R.inc(4232);String headerDescriptor = doc.getHeaderDescriptor();
            __CLR4_5_237q37qlvicmt4k.R.inc(4233);if ((((!visitedDocs.contains(headerDescriptor))&&(__CLR4_5_237q37qlvicmt4k.R.iget(4234)!=0|true))||(__CLR4_5_237q37qlvicmt4k.R.iget(4235)==0&false))) {{
                __CLR4_5_237q37qlvicmt4k.R.inc(4236);visitedDocs.add(headerDescriptor);
                __CLR4_5_237q37qlvicmt4k.R.inc(4237);f = doc.getTypedefFrame(id, true);
            }
            }__CLR4_5_237q37qlvicmt4k.R.inc(4238);if ((((f != null)&&(__CLR4_5_237q37qlvicmt4k.R.iget(4239)!=0|true))||(__CLR4_5_237q37qlvicmt4k.R.iget(4240)==0&false))) {{
                __CLR4_5_237q37qlvicmt4k.R.inc(4241);return f;
            }
        }}
        }__CLR4_5_237q37qlvicmt4k.R.inc(4242);return null;
    }finally{__CLR4_5_237q37qlvicmt4k.R.flushNeeded();}}

    /**
     * @param id
     *        the id
     * @return the instance frame
     */
    public Frame getInstanceFrame(String id) {try{__CLR4_5_237q37qlvicmt4k.R.inc(4243);
        __CLR4_5_237q37qlvicmt4k.R.inc(4244);return instanceFrameMap.get(id);
    }finally{__CLR4_5_237q37qlvicmt4k.R.flushNeeded();}}

    /**
     * @return the imported obo docs
     */
    public Collection<OBODoc> getImportedOBODocs() {try{__CLR4_5_237q37qlvicmt4k.R.inc(4245);
        __CLR4_5_237q37qlvicmt4k.R.inc(4246);return importedOBODocs;
    }finally{__CLR4_5_237q37qlvicmt4k.R.flushNeeded();}}

    /**
     * @param importedOBODocs
     *        the new imported obo docs
     */
    public void setImportedOBODocs(Collection<OBODoc> importedOBODocs) {try{__CLR4_5_237q37qlvicmt4k.R.inc(4247);
        __CLR4_5_237q37qlvicmt4k.R.inc(4248);this.importedOBODocs = importedOBODocs;
    }finally{__CLR4_5_237q37qlvicmt4k.R.flushNeeded();}}

    /**
     * Adds the imported obo doc.
     * 
     * @param doc
     *        the doc
     */
    public void addImportedOBODoc(OBODoc doc) {try{__CLR4_5_237q37qlvicmt4k.R.inc(4249);
        __CLR4_5_237q37qlvicmt4k.R.inc(4250);if ((((importedOBODocs == null)&&(__CLR4_5_237q37qlvicmt4k.R.iget(4251)!=0|true))||(__CLR4_5_237q37qlvicmt4k.R.iget(4252)==0&false))) {{
            __CLR4_5_237q37qlvicmt4k.R.inc(4253);importedOBODocs = new ArrayList<>();
        }
        }__CLR4_5_237q37qlvicmt4k.R.inc(4254);importedOBODocs.add(doc);
    }finally{__CLR4_5_237q37qlvicmt4k.R.flushNeeded();}}

    /**
     * Adds the frame.
     * 
     * @param f
     *        the frame
     * @throws FrameMergeException
     *         the frame merge exception
     */
    public void addFrame(@Nonnull Frame f) throws FrameMergeException {try{__CLR4_5_237q37qlvicmt4k.R.inc(4255);
        __CLR4_5_237q37qlvicmt4k.R.inc(4256);if ((((f.getType() == FrameType.TERM)&&(__CLR4_5_237q37qlvicmt4k.R.iget(4257)!=0|true))||(__CLR4_5_237q37qlvicmt4k.R.iget(4258)==0&false))) {{
            __CLR4_5_237q37qlvicmt4k.R.inc(4259);addTermFrame(f);
        } }else {__CLR4_5_237q37qlvicmt4k.R.inc(4260);if ((((f.getType() == FrameType.TYPEDEF)&&(__CLR4_5_237q37qlvicmt4k.R.iget(4261)!=0|true))||(__CLR4_5_237q37qlvicmt4k.R.iget(4262)==0&false))) {{
            __CLR4_5_237q37qlvicmt4k.R.inc(4263);addTypedefFrame(f);
        } }else {__CLR4_5_237q37qlvicmt4k.R.inc(4264);if ((((f.getType() == FrameType.INSTANCE)&&(__CLR4_5_237q37qlvicmt4k.R.iget(4265)!=0|true))||(__CLR4_5_237q37qlvicmt4k.R.iget(4266)==0&false))) {{
            __CLR4_5_237q37qlvicmt4k.R.inc(4267);addInstanceFrame(f);
        }
    }}}}finally{__CLR4_5_237q37qlvicmt4k.R.flushNeeded();}}

    /**
     * Adds the term frame.
     * 
     * @param f
     *        the frame
     * @throws FrameMergeException
     *         the frame merge exception
     */
    public void addTermFrame(@Nonnull Frame f) throws FrameMergeException {try{__CLR4_5_237q37qlvicmt4k.R.inc(4268);
        __CLR4_5_237q37qlvicmt4k.R.inc(4269);String id = f.getId();
        __CLR4_5_237q37qlvicmt4k.R.inc(4270);if ((((termFrameMap.containsKey(id))&&(__CLR4_5_237q37qlvicmt4k.R.iget(4271)!=0|true))||(__CLR4_5_237q37qlvicmt4k.R.iget(4272)==0&false))) {{
            __CLR4_5_237q37qlvicmt4k.R.inc(4273);termFrameMap.get(id).merge(f);
        } }else {{
            __CLR4_5_237q37qlvicmt4k.R.inc(4274);termFrameMap.put(id, f);
        }
    }}finally{__CLR4_5_237q37qlvicmt4k.R.flushNeeded();}}

    /**
     * Adds the typedef frame.
     * 
     * @param f
     *        the frame
     * @throws FrameMergeException
     *         the frame merge exception
     */
    public void addTypedefFrame(@Nonnull Frame f) throws FrameMergeException {try{__CLR4_5_237q37qlvicmt4k.R.inc(4275);
        __CLR4_5_237q37qlvicmt4k.R.inc(4276);String id = f.getId();
        __CLR4_5_237q37qlvicmt4k.R.inc(4277);if ((((typedefFrameMap.containsKey(id))&&(__CLR4_5_237q37qlvicmt4k.R.iget(4278)!=0|true))||(__CLR4_5_237q37qlvicmt4k.R.iget(4279)==0&false))) {{
            __CLR4_5_237q37qlvicmt4k.R.inc(4280);typedefFrameMap.get(id).merge(f);
        } }else {{
            __CLR4_5_237q37qlvicmt4k.R.inc(4281);typedefFrameMap.put(id, f);
        }
    }}finally{__CLR4_5_237q37qlvicmt4k.R.flushNeeded();}}

    /**
     * Adds the instance frame.
     * 
     * @param f
     *        the frame
     * @throws FrameMergeException
     *         the frame merge exception
     */
    public void addInstanceFrame(@Nonnull Frame f) throws FrameMergeException {try{__CLR4_5_237q37qlvicmt4k.R.inc(4282);
        __CLR4_5_237q37qlvicmt4k.R.inc(4283);String id = f.getId();
        __CLR4_5_237q37qlvicmt4k.R.inc(4284);if ((((instanceFrameMap.containsKey(id))&&(__CLR4_5_237q37qlvicmt4k.R.iget(4285)!=0|true))||(__CLR4_5_237q37qlvicmt4k.R.iget(4286)==0&false))) {{
            __CLR4_5_237q37qlvicmt4k.R.inc(4287);instanceFrameMap.get(id).merge(f);
        } }else {{
            __CLR4_5_237q37qlvicmt4k.R.inc(4288);instanceFrameMap.put(id, f);
        }
    }}finally{__CLR4_5_237q37qlvicmt4k.R.flushNeeded();}}

    /**
     * Looks up the ID prefix to IRI prefix mapping. Header-Tag: idspace
     * 
     * @param prefix
     *        prefix
     * @return IRI prefix as string
     */
    @Nullable
    public static String getIDSpace(@Nonnull String prefix) {try{__CLR4_5_237q37qlvicmt4k.R.inc(4289);
        // built-in
        __CLR4_5_237q37qlvicmt4k.R.inc(4290);if ((((prefix.equals("RO"))&&(__CLR4_5_237q37qlvicmt4k.R.iget(4291)!=0|true))||(__CLR4_5_237q37qlvicmt4k.R.iget(4292)==0&false))) {{
            __CLR4_5_237q37qlvicmt4k.R.inc(4293);return "http://purl.obolibrary.org/obo/RO_";
        }
        // TODO
        }__CLR4_5_237q37qlvicmt4k.R.inc(4294);return null;
    }finally{__CLR4_5_237q37qlvicmt4k.R.flushNeeded();}}

    /**
     * @param prefix
     *        the prefix
     * @return true, if is treat xrefs as equivalent
     */
    public static boolean isTreatXrefsAsEquivalent(@Nullable String prefix) {try{__CLR4_5_237q37qlvicmt4k.R.inc(4295);
        __CLR4_5_237q37qlvicmt4k.R.inc(4296);if (((("RO".equals(prefix))&&(__CLR4_5_237q37qlvicmt4k.R.iget(4297)!=0|true))||(__CLR4_5_237q37qlvicmt4k.R.iget(4298)==0&false))) {{
            __CLR4_5_237q37qlvicmt4k.R.inc(4299);return true;
        }
        }__CLR4_5_237q37qlvicmt4k.R.inc(4300);return false;
    }finally{__CLR4_5_237q37qlvicmt4k.R.flushNeeded();}}

    /**
     * Merge contents.
     * 
     * @param extDoc
     *        the external doc
     * @throws FrameMergeException
     *         the frame merge exception
     */
    public void mergeContents(@Nonnull OBODoc extDoc) throws FrameMergeException {try{__CLR4_5_237q37qlvicmt4k.R.inc(4301);
        __CLR4_5_237q37qlvicmt4k.R.inc(4302);for (Frame f : extDoc.getTermFrames()) {{
            assert (((f != null)&&(__CLR4_5_237q37qlvicmt4k.R.iget(4303)!=0|true))||(__CLR4_5_237q37qlvicmt4k.R.iget(4304)==0&false));
            __CLR4_5_237q37qlvicmt4k.R.inc(4305);addTermFrame(f);
        }
        }__CLR4_5_237q37qlvicmt4k.R.inc(4306);for (Frame f : extDoc.getTypedefFrames()) {{
            assert (((f != null)&&(__CLR4_5_237q37qlvicmt4k.R.iget(4307)!=0|true))||(__CLR4_5_237q37qlvicmt4k.R.iget(4308)==0&false));
            __CLR4_5_237q37qlvicmt4k.R.inc(4309);addTypedefFrame(f);
        }
        }__CLR4_5_237q37qlvicmt4k.R.inc(4310);for (Frame f : extDoc.getInstanceFrames()) {{
            assert (((f != null)&&(__CLR4_5_237q37qlvicmt4k.R.iget(4311)!=0|true))||(__CLR4_5_237q37qlvicmt4k.R.iget(4312)==0&false));
            __CLR4_5_237q37qlvicmt4k.R.inc(4313);addInstanceFrame(f);
        }
    }}finally{__CLR4_5_237q37qlvicmt4k.R.flushNeeded();}}

    /**
     * Adds the default ontology header.
     * 
     * @param defaultOnt
     *        the default ont
     */
    public void addDefaultOntologyHeader(String defaultOnt) {try{__CLR4_5_237q37qlvicmt4k.R.inc(4314);
        __CLR4_5_237q37qlvicmt4k.R.inc(4315);Frame hf = getHeaderFrame();
        __CLR4_5_237q37qlvicmt4k.R.inc(4316);Clause ontClause = hf.getClause(OboFormatTag.TAG_ONTOLOGY);
        __CLR4_5_237q37qlvicmt4k.R.inc(4317);if ((((ontClause == null)&&(__CLR4_5_237q37qlvicmt4k.R.iget(4318)!=0|true))||(__CLR4_5_237q37qlvicmt4k.R.iget(4319)==0&false))) {{
            __CLR4_5_237q37qlvicmt4k.R.inc(4320);ontClause = new Clause(OboFormatTag.TAG_ONTOLOGY, defaultOnt);
            __CLR4_5_237q37qlvicmt4k.R.inc(4321);hf.addClause(ontClause);
        }
    }}finally{__CLR4_5_237q37qlvicmt4k.R.flushNeeded();}}

    /**
     * Check this document for violations, i.e. cardinality constraint
     * violations.
     * 
     * @throws FrameStructureException
     *         the frame structure exception
     * @see OboInOwlCardinalityTools for equivalent checks in OWL
     */
    public void check() throws FrameStructureException {try{__CLR4_5_237q37qlvicmt4k.R.inc(4322);
        __CLR4_5_237q37qlvicmt4k.R.inc(4323);getHeaderFrame().check();
        __CLR4_5_237q37qlvicmt4k.R.inc(4324);for (Frame f : getTermFrames()) {{
            __CLR4_5_237q37qlvicmt4k.R.inc(4325);f.check();
        }
        }__CLR4_5_237q37qlvicmt4k.R.inc(4326);for (Frame f : getTypedefFrames()) {{
            __CLR4_5_237q37qlvicmt4k.R.inc(4327);f.check();
        }
        }__CLR4_5_237q37qlvicmt4k.R.inc(4328);for (Frame f : getInstanceFrames()) {{
            __CLR4_5_237q37qlvicmt4k.R.inc(4329);f.check();
        }
    }}finally{__CLR4_5_237q37qlvicmt4k.R.flushNeeded();}}

    @Nonnull
    @Override
    public String toString() {try{__CLR4_5_237q37qlvicmt4k.R.inc(4330);
        __CLR4_5_237q37qlvicmt4k.R.inc(4331);return getHeaderDescriptor();
    }finally{__CLR4_5_237q37qlvicmt4k.R.flushNeeded();}}

    /**
     * @return the header descriptor
     */
    @Nonnull
    private String getHeaderDescriptor() {try{__CLR4_5_237q37qlvicmt4k.R.inc(4332);
        __CLR4_5_237q37qlvicmt4k.R.inc(4333);return "OBODoc(" + headerFrame + ')';
    }finally{__CLR4_5_237q37qlvicmt4k.R.flushNeeded();}}
}
