/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.obolibrary.oboformat.parser;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Nonnull;

import org.obolibrary.oboformat.model.Clause;
import org.obolibrary.oboformat.model.Frame;
import org.obolibrary.oboformat.model.Frame.FrameType;
import org.obolibrary.oboformat.model.FrameMergeException;
import org.obolibrary.oboformat.model.OBODoc;
import org.obolibrary.oboformat.model.Xref;
import org.obolibrary.oboformat.parser.OBOFormatConstants.OboFormatTag;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** xref expander */
public class XrefExpander {public static class __CLR4_5_24dv4dvlvicmt6r{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u006f\u0062\u006f\u0066\u006f\u0072\u006d\u0061\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237308750L,8589935092L,5842,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    protected static final Logger LOG = LoggerFactory.getLogger(XrefExpander.class);
    OBODoc sourceOBODoc;
    OBODoc targetOBODoc;
    String targetBase;
    @Nonnull
    Map<String, Rule> treatMap = new HashMap<>();
    @Nonnull
    Map<String, OBODoc> targetDocMap = new HashMap<>();

    /**
     * @param src
     *        src
     * @throws InvalidXrefMapException
     *         InvalidXrefMapException
     */
    public XrefExpander(@Nonnull OBODoc src) {try{__CLR4_5_24dv4dvlvicmt6r.R.inc(5683);
        __CLR4_5_24dv4dvlvicmt6r.R.inc(5684);sourceOBODoc = src;
        __CLR4_5_24dv4dvlvicmt6r.R.inc(5685);Frame shf = src.getHeaderFrame();
        __CLR4_5_24dv4dvlvicmt6r.R.inc(5686);String ontId = shf.getTagValue(OboFormatTag.TAG_ONTOLOGY, String.class);
        __CLR4_5_24dv4dvlvicmt6r.R.inc(5687);String tgtOntId = ontId + "/xref_expansions";
        __CLR4_5_24dv4dvlvicmt6r.R.inc(5688);targetOBODoc = new OBODoc();
        __CLR4_5_24dv4dvlvicmt6r.R.inc(5689);Frame thf = new Frame(FrameType.HEADER);
        __CLR4_5_24dv4dvlvicmt6r.R.inc(5690);thf.addClause(new Clause(OboFormatTag.TAG_ONTOLOGY, tgtOntId));
        __CLR4_5_24dv4dvlvicmt6r.R.inc(5691);targetOBODoc.setHeaderFrame(thf);
        __CLR4_5_24dv4dvlvicmt6r.R.inc(5692);sourceOBODoc.addImportedOBODoc(targetOBODoc);
        __CLR4_5_24dv4dvlvicmt6r.R.inc(5693);setUp();
    }finally{__CLR4_5_24dv4dvlvicmt6r.R.flushNeeded();}}

    /**
     * @param src
     *        src
     * @param targetBase
     *        targetBase
     * @throws InvalidXrefMapException
     *         InvalidXrefMapException
     */
    public XrefExpander(OBODoc src, String targetBase) {try{__CLR4_5_24dv4dvlvicmt6r.R.inc(5694);
        __CLR4_5_24dv4dvlvicmt6r.R.inc(5695);sourceOBODoc = src;
        __CLR4_5_24dv4dvlvicmt6r.R.inc(5696);this.targetBase = targetBase;
        __CLR4_5_24dv4dvlvicmt6r.R.inc(5697);setUp();
    }finally{__CLR4_5_24dv4dvlvicmt6r.R.flushNeeded();}}

    /**
     * @param src
     *        src
     * @param tgt
     *        tgt
     * @throws InvalidXrefMapException
     *         InvalidXrefMapException
     */
    public XrefExpander(OBODoc src, OBODoc tgt) {try{__CLR4_5_24dv4dvlvicmt6r.R.inc(5698);
        __CLR4_5_24dv4dvlvicmt6r.R.inc(5699);sourceOBODoc = src;
        __CLR4_5_24dv4dvlvicmt6r.R.inc(5700);targetOBODoc = tgt;
        __CLR4_5_24dv4dvlvicmt6r.R.inc(5701);setUp();
    }finally{__CLR4_5_24dv4dvlvicmt6r.R.flushNeeded();}}

    /**
     * @throws InvalidXrefMapException
     *         InvalidXrefMapException
     */
    public final void setUp() {try{__CLR4_5_24dv4dvlvicmt6r.R.inc(5702);
        // required for translation of IDs
        // obo2owl = new Obo2Owl();
        // obo2owl.setObodoc(sourceOBODoc);
        __CLR4_5_24dv4dvlvicmt6r.R.inc(5703);Map<String, String> relationsUseByIdSpace = new HashMap<>();
        __CLR4_5_24dv4dvlvicmt6r.R.inc(5704);for (Clause c : sourceOBODoc.getHeaderFrame().getClauses()) {{
            __CLR4_5_24dv4dvlvicmt6r.R.inc(5705);String[] parts;
            __CLR4_5_24dv4dvlvicmt6r.R.inc(5706);String v = c.getValue(String.class);
            __CLR4_5_24dv4dvlvicmt6r.R.inc(5707);if ((((v == null)&&(__CLR4_5_24dv4dvlvicmt6r.R.iget(5708)!=0|true))||(__CLR4_5_24dv4dvlvicmt6r.R.iget(5709)==0&false))) {{
                __CLR4_5_24dv4dvlvicmt6r.R.inc(5710);LOG.error("problem with header clause in xref expansion: {}", c);
                __CLR4_5_24dv4dvlvicmt6r.R.inc(5711);continue;
            }
            }__CLR4_5_24dv4dvlvicmt6r.R.inc(5712);parts = v.split("\\s");
            __CLR4_5_24dv4dvlvicmt6r.R.inc(5713);String relation = null;
            __CLR4_5_24dv4dvlvicmt6r.R.inc(5714);String idSpace = parts[0];
            __CLR4_5_24dv4dvlvicmt6r.R.inc(5715);if ((((c.getTag().equals(OboFormatTag.TAG_TREAT_XREFS_AS_EQUIVALENT.getTag()))&&(__CLR4_5_24dv4dvlvicmt6r.R.iget(5716)!=0|true))||(__CLR4_5_24dv4dvlvicmt6r.R.iget(5717)==0&false))) {{
                __CLR4_5_24dv4dvlvicmt6r.R.inc(5718);addRule(parts[0], new EquivalenceExpansion());
                // addMacro(idSpace,"is_specific_equivalent_of","Class: ?X
                // EquivalentTo: ?Y and "+oboIdToIRI(parts[1])+" some
                // "+oboIdToIRI(parts[2]));
            } }else {__CLR4_5_24dv4dvlvicmt6r.R.inc(5719);if ((((c.getTag().equals(OboFormatTag.TAG_TREAT_XREFS_AS_GENUS_DIFFERENTIA.getTag()))&&(__CLR4_5_24dv4dvlvicmt6r.R.iget(5720)!=0|true))||(__CLR4_5_24dv4dvlvicmt6r.R.iget(5721)==0&false))) {{
                __CLR4_5_24dv4dvlvicmt6r.R.inc(5722);addRule(idSpace, new GenusDifferentiaExpansion(parts[1], parts[2]));
                // addMacro(idSpace,"is_generic_equivalent_of","Class: ?Y
                // EquivalentTo: ?X and "+oboIdToIRI(parts[1])+" some
                // "+oboIdToIRI(parts[2]));
                __CLR4_5_24dv4dvlvicmt6r.R.inc(5723);relationsUseByIdSpace.put(idSpace, parts[1]);
                __CLR4_5_24dv4dvlvicmt6r.R.inc(5724);relation = parts[1];
            } }else {__CLR4_5_24dv4dvlvicmt6r.R.inc(5725);if ((((c.getTag().equals(OboFormatTag.TAG_TREAT_XREFS_AS_REVERSE_GENUS_DIFFERENTIA.getTag()))&&(__CLR4_5_24dv4dvlvicmt6r.R.iget(5726)!=0|true))||(__CLR4_5_24dv4dvlvicmt6r.R.iget(5727)==0&false))) {{
                __CLR4_5_24dv4dvlvicmt6r.R.inc(5728);addRule(idSpace, new ReverseGenusDifferentiaExpansion(parts[1], parts[2]));
                // addMacro(idSpace,"is_generic_equivalent_of","Class: ?Y
                // EquivalentTo: ?X and "+oboIdToIRI(parts[1])+" some
                // "+oboIdToIRI(parts[2]));
                __CLR4_5_24dv4dvlvicmt6r.R.inc(5729);relationsUseByIdSpace.put(idSpace, parts[1]);
                __CLR4_5_24dv4dvlvicmt6r.R.inc(5730);relation = parts[1];
            } }else {__CLR4_5_24dv4dvlvicmt6r.R.inc(5731);if ((((c.getTag().equals(OboFormatTag.TAG_TREAT_XREFS_AS_HAS_SUBCLASS.getTag()))&&(__CLR4_5_24dv4dvlvicmt6r.R.iget(5732)!=0|true))||(__CLR4_5_24dv4dvlvicmt6r.R.iget(5733)==0&false))) {{
                __CLR4_5_24dv4dvlvicmt6r.R.inc(5734);addRule(idSpace, new HasSubClassExpansion());
            } }else {__CLR4_5_24dv4dvlvicmt6r.R.inc(5735);if ((((c.getTag().equals(OboFormatTag.TAG_TREAT_XREFS_AS_IS_A.getTag()))&&(__CLR4_5_24dv4dvlvicmt6r.R.iget(5736)!=0|true))||(__CLR4_5_24dv4dvlvicmt6r.R.iget(5737)==0&false))) {{
                __CLR4_5_24dv4dvlvicmt6r.R.inc(5738);addRule(idSpace, new IsaExpansion());
            } }else {__CLR4_5_24dv4dvlvicmt6r.R.inc(5739);if ((((c.getTag().equals(OboFormatTag.TAG_TREAT_XREFS_AS_RELATIONSHIP.getTag()))&&(__CLR4_5_24dv4dvlvicmt6r.R.iget(5740)!=0|true))||(__CLR4_5_24dv4dvlvicmt6r.R.iget(5741)==0&false))) {{
                __CLR4_5_24dv4dvlvicmt6r.R.inc(5742);addRule(idSpace, new RelationshipExpansion(parts[1]));
                __CLR4_5_24dv4dvlvicmt6r.R.inc(5743);relationsUseByIdSpace.put(idSpace, parts[1]);
                __CLR4_5_24dv4dvlvicmt6r.R.inc(5744);relation = parts[1];
            } }else {{
                __CLR4_5_24dv4dvlvicmt6r.R.inc(5745);continue;
            }
            }}}}}}__CLR4_5_24dv4dvlvicmt6r.R.inc(5746);if ((((targetBase != null)&&(__CLR4_5_24dv4dvlvicmt6r.R.iget(5747)!=0|true))||(__CLR4_5_24dv4dvlvicmt6r.R.iget(5748)==0&false))) {{
                // create a new bridge ontology for every expansion macro
                __CLR4_5_24dv4dvlvicmt6r.R.inc(5749);OBODoc tgt = new OBODoc();
                __CLR4_5_24dv4dvlvicmt6r.R.inc(5750);Frame thf = new Frame(FrameType.HEADER);
                __CLR4_5_24dv4dvlvicmt6r.R.inc(5751);thf.addClause(new Clause(OboFormatTag.TAG_ONTOLOGY, targetBase + "-" + idSpace.toLowerCase()));
                __CLR4_5_24dv4dvlvicmt6r.R.inc(5752);tgt.setHeaderFrame(thf);
                __CLR4_5_24dv4dvlvicmt6r.R.inc(5753);targetDocMap.put(idSpace, tgt);
                __CLR4_5_24dv4dvlvicmt6r.R.inc(5754);sourceOBODoc.addImportedOBODoc(tgt);
                __CLR4_5_24dv4dvlvicmt6r.R.inc(5755);if ((((relation != null)&&(__CLR4_5_24dv4dvlvicmt6r.R.iget(5756)!=0|true))||(__CLR4_5_24dv4dvlvicmt6r.R.iget(5757)==0&false))) {{
                    // See 4.4.2
                    // "In addition, any Typedef frames for relations used in a
                    // header macro
                    // are also copied into the corresponding bridge ontology
                    __CLR4_5_24dv4dvlvicmt6r.R.inc(5758);Frame tdf = sourceOBODoc.getTypedefFrame(relation);
                    __CLR4_5_24dv4dvlvicmt6r.R.inc(5759);if ((((tdf != null)&&(__CLR4_5_24dv4dvlvicmt6r.R.iget(5760)!=0|true))||(__CLR4_5_24dv4dvlvicmt6r.R.iget(5761)==0&false))) {{
                        __CLR4_5_24dv4dvlvicmt6r.R.inc(5762);try {
                            __CLR4_5_24dv4dvlvicmt6r.R.inc(5763);tgt.addTypedefFrame(tdf);
                        } catch (FrameMergeException e) {
                            __CLR4_5_24dv4dvlvicmt6r.R.inc(5764);LOG.debug("frame merge failed", e);
                        }
                    }
                }}
            }}
        }}
    }}finally{__CLR4_5_24dv4dvlvicmt6r.R.flushNeeded();}}

    /**
     * @param idSpace
     *        idSpace
     * @return target doc
     */
    public OBODoc getTargetDoc(String idSpace) {try{__CLR4_5_24dv4dvlvicmt6r.R.inc(5765);
        __CLR4_5_24dv4dvlvicmt6r.R.inc(5766);if ((((targetOBODoc != null)&&(__CLR4_5_24dv4dvlvicmt6r.R.iget(5767)!=0|true))||(__CLR4_5_24dv4dvlvicmt6r.R.iget(5768)==0&false))) {{
            __CLR4_5_24dv4dvlvicmt6r.R.inc(5769);return targetOBODoc;
        }
        }__CLR4_5_24dv4dvlvicmt6r.R.inc(5770);return targetDocMap.get(idSpace);
    }finally{__CLR4_5_24dv4dvlvicmt6r.R.flushNeeded();}}

    private void addRule(String db, @Nonnull Rule rule) {try{__CLR4_5_24dv4dvlvicmt6r.R.inc(5771);
        __CLR4_5_24dv4dvlvicmt6r.R.inc(5772);if ((((treatMap.containsKey(db))&&(__CLR4_5_24dv4dvlvicmt6r.R.iget(5773)!=0|true))||(__CLR4_5_24dv4dvlvicmt6r.R.iget(5774)==0&false))) {{
            __CLR4_5_24dv4dvlvicmt6r.R.inc(5775);throw new InvalidXrefMapException(db);
        }
        }__CLR4_5_24dv4dvlvicmt6r.R.inc(5776);rule.idSpace = db;
        __CLR4_5_24dv4dvlvicmt6r.R.inc(5777);treatMap.put(db, rule);
    }finally{__CLR4_5_24dv4dvlvicmt6r.R.flushNeeded();}}

    /** expand xrefs */
    public void expandXrefs() {try{__CLR4_5_24dv4dvlvicmt6r.R.inc(5778);
        __CLR4_5_24dv4dvlvicmt6r.R.inc(5779);for (Frame f : sourceOBODoc.getTermFrames()) {{
            __CLR4_5_24dv4dvlvicmt6r.R.inc(5780);String id = f.getTagValue(OboFormatTag.TAG_ID, String.class);
            __CLR4_5_24dv4dvlvicmt6r.R.inc(5781);Collection<Clause> clauses = f.getClauses(OboFormatTag.TAG_XREF);
            __CLR4_5_24dv4dvlvicmt6r.R.inc(5782);for (Clause c : clauses) {{
                __CLR4_5_24dv4dvlvicmt6r.R.inc(5783);Xref x = c.getValue(Xref.class);
                __CLR4_5_24dv4dvlvicmt6r.R.inc(5784);if ((((x != null)&&(__CLR4_5_24dv4dvlvicmt6r.R.iget(5785)!=0|true))||(__CLR4_5_24dv4dvlvicmt6r.R.iget(5786)==0&false))) {{
                    __CLR4_5_24dv4dvlvicmt6r.R.inc(5787);String xid = x.getIdref();
                    __CLR4_5_24dv4dvlvicmt6r.R.inc(5788);String s = getIDSpace(xid);
                    __CLR4_5_24dv4dvlvicmt6r.R.inc(5789);if ((((treatMap.containsKey(s))&&(__CLR4_5_24dv4dvlvicmt6r.R.iget(5790)!=0|true))||(__CLR4_5_24dv4dvlvicmt6r.R.iget(5791)==0&false))) {{
                        __CLR4_5_24dv4dvlvicmt6r.R.inc(5792);treatMap.get(s).expand(f, id, xid);
                    }
                }}
            }}
        }}
    }}finally{__CLR4_5_24dv4dvlvicmt6r.R.flushNeeded();}}

    private static String getIDSpace(@Nonnull String x) {try{__CLR4_5_24dv4dvlvicmt6r.R.inc(5793);
        __CLR4_5_24dv4dvlvicmt6r.R.inc(5794);String[] parts = x.split(":", 2);
        __CLR4_5_24dv4dvlvicmt6r.R.inc(5795);return parts[0];
    }finally{__CLR4_5_24dv4dvlvicmt6r.R.flushNeeded();}}

    /** rule */
    public abstract class Rule {

        protected String xref;
        /** id space */
        public String idSpace;

        /**
         * @param sf
         *        sf
         * @param id
         *        id
         * @param xRef
         *        xref
         */
        public abstract void expand(@Nonnull Frame sf, String id, String xRef);

        @Nonnull
        protected Frame getTargetFrame(String id) {try{__CLR4_5_24dv4dvlvicmt6r.R.inc(5796);
            __CLR4_5_24dv4dvlvicmt6r.R.inc(5797);Frame f = getTargetDoc(idSpace).getTermFrame(id);
            __CLR4_5_24dv4dvlvicmt6r.R.inc(5798);if ((((f == null)&&(__CLR4_5_24dv4dvlvicmt6r.R.iget(5799)!=0|true))||(__CLR4_5_24dv4dvlvicmt6r.R.iget(5800)==0&false))) {{
                __CLR4_5_24dv4dvlvicmt6r.R.inc(5801);f = new Frame();
                __CLR4_5_24dv4dvlvicmt6r.R.inc(5802);f.setId(id);
                __CLR4_5_24dv4dvlvicmt6r.R.inc(5803);try {
                    __CLR4_5_24dv4dvlvicmt6r.R.inc(5804);getTargetDoc(idSpace).addTermFrame(f);
                } catch (FrameMergeException e) {
                    // this should be impossible
                    __CLR4_5_24dv4dvlvicmt6r.R.inc(5805);LOG.error("Frame merge exceptions should not be possible", e);
                }
            }
            }__CLR4_5_24dv4dvlvicmt6r.R.inc(5806);return f;
        }finally{__CLR4_5_24dv4dvlvicmt6r.R.flushNeeded();}}
    }

    /** equivalence expansion */
    public class EquivalenceExpansion extends Rule {

        @Override
        public void expand(@Nonnull Frame sf, String id, String xRef) {try{__CLR4_5_24dv4dvlvicmt6r.R.inc(5807);
            __CLR4_5_24dv4dvlvicmt6r.R.inc(5808);Clause c = new Clause(OboFormatTag.TAG_EQUIVALENT_TO, xRef);
            __CLR4_5_24dv4dvlvicmt6r.R.inc(5809);sf.addClause(c);
        }finally{__CLR4_5_24dv4dvlvicmt6r.R.flushNeeded();}}
    }

    /** subclass expansion */
    public class HasSubClassExpansion extends Rule {

        @Override
        public void expand(Frame sf, String id, String xRef) {try{__CLR4_5_24dv4dvlvicmt6r.R.inc(5810);
            __CLR4_5_24dv4dvlvicmt6r.R.inc(5811);Clause c = new Clause(OboFormatTag.TAG_IS_A, id);
            __CLR4_5_24dv4dvlvicmt6r.R.inc(5812);getTargetFrame(xRef).addClause(c);
        }finally{__CLR4_5_24dv4dvlvicmt6r.R.flushNeeded();}}
    }

    /** genus diff expansion */
    public class GenusDifferentiaExpansion extends Rule {

        protected final String rel;
        protected final String tgt;

        /**
         * @param rel
         *        rel
         * @param tgt
         *        tgt
         */
        public GenusDifferentiaExpansion(String rel, String tgt) {try{__CLR4_5_24dv4dvlvicmt6r.R.inc(5813);
            __CLR4_5_24dv4dvlvicmt6r.R.inc(5814);this.rel = rel;
            __CLR4_5_24dv4dvlvicmt6r.R.inc(5815);this.tgt = tgt;
        }finally{__CLR4_5_24dv4dvlvicmt6r.R.flushNeeded();}}

        @Override
        public void expand(Frame sf, String id, String xRef) {try{__CLR4_5_24dv4dvlvicmt6r.R.inc(5816);
            __CLR4_5_24dv4dvlvicmt6r.R.inc(5817);Clause gc = new Clause(OboFormatTag.TAG_INTERSECTION_OF, xRef);
            __CLR4_5_24dv4dvlvicmt6r.R.inc(5818);Clause dc = new Clause(OboFormatTag.TAG_INTERSECTION_OF);
            __CLR4_5_24dv4dvlvicmt6r.R.inc(5819);dc.setValue(rel);
            __CLR4_5_24dv4dvlvicmt6r.R.inc(5820);dc.addValue(tgt);
            __CLR4_5_24dv4dvlvicmt6r.R.inc(5821);getTargetFrame(id).addClause(gc);
            __CLR4_5_24dv4dvlvicmt6r.R.inc(5822);getTargetFrame(id).addClause(dc);
        }finally{__CLR4_5_24dv4dvlvicmt6r.R.flushNeeded();}}
    }

    /** reverse genus differentia expansion */
    public class ReverseGenusDifferentiaExpansion extends Rule {

        protected final String rel;
        protected final String tgt;

        /**
         * @param rel
         *        rel
         * @param tgt
         *        tgt
         */
        public ReverseGenusDifferentiaExpansion(String rel, String tgt) {try{__CLR4_5_24dv4dvlvicmt6r.R.inc(5823);
            __CLR4_5_24dv4dvlvicmt6r.R.inc(5824);this.rel = rel;
            __CLR4_5_24dv4dvlvicmt6r.R.inc(5825);this.tgt = tgt;
        }finally{__CLR4_5_24dv4dvlvicmt6r.R.flushNeeded();}}

        @Override
        public void expand(Frame sf, String id, String xRef) {try{__CLR4_5_24dv4dvlvicmt6r.R.inc(5826);
            __CLR4_5_24dv4dvlvicmt6r.R.inc(5827);Clause gc = new Clause(OboFormatTag.TAG_INTERSECTION_OF, id);
            __CLR4_5_24dv4dvlvicmt6r.R.inc(5828);Clause dc = new Clause(OboFormatTag.TAG_INTERSECTION_OF);
            __CLR4_5_24dv4dvlvicmt6r.R.inc(5829);dc.setValue(rel);
            __CLR4_5_24dv4dvlvicmt6r.R.inc(5830);dc.addValue(tgt);
            __CLR4_5_24dv4dvlvicmt6r.R.inc(5831);getTargetFrame(xRef).addClause(gc);
            __CLR4_5_24dv4dvlvicmt6r.R.inc(5832);getTargetFrame(xRef).addClause(dc);
        }finally{__CLR4_5_24dv4dvlvicmt6r.R.flushNeeded();}}
    }

    /** is a expansion */
    public class IsaExpansion extends Rule {

        @Override
        public void expand(Frame sf, String id, String xRef) {try{__CLR4_5_24dv4dvlvicmt6r.R.inc(5833);
            __CLR4_5_24dv4dvlvicmt6r.R.inc(5834);Clause c = new Clause(OboFormatTag.TAG_IS_A, xRef);
            __CLR4_5_24dv4dvlvicmt6r.R.inc(5835);getTargetFrame(id).addClause(c);
        }finally{__CLR4_5_24dv4dvlvicmt6r.R.flushNeeded();}}
    }

    /** relationship expansion */
    public class RelationshipExpansion extends Rule {

        protected final String rel;

        /**
         * @param rel
         *        rel
         */
        public RelationshipExpansion(String rel) {try{__CLR4_5_24dv4dvlvicmt6r.R.inc(5836);
            __CLR4_5_24dv4dvlvicmt6r.R.inc(5837);this.rel = rel;
        }finally{__CLR4_5_24dv4dvlvicmt6r.R.flushNeeded();}}

        @Override
        public void expand(Frame sf, String id, String xRef) {try{__CLR4_5_24dv4dvlvicmt6r.R.inc(5838);
            __CLR4_5_24dv4dvlvicmt6r.R.inc(5839);Clause c = new Clause(OboFormatTag.TAG_RELATIONSHIP, rel);
            __CLR4_5_24dv4dvlvicmt6r.R.inc(5840);c.addValue(xRef);
            __CLR4_5_24dv4dvlvicmt6r.R.inc(5841);getTargetFrame(id).addClause(c);
        }finally{__CLR4_5_24dv4dvlvicmt6r.R.flushNeeded();}}
    }
}
