/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.obolibrary.oboformat;

import static org.junit.Assert.*;

import org.junit.Test;
import org.obolibrary.obo2owl.OboFormatTestBasics;
import org.obolibrary.oboformat.model.Clause;
import org.obolibrary.oboformat.model.Frame;
import org.obolibrary.oboformat.model.OBODoc;
import org.obolibrary.oboformat.parser.OBOFormatConstants.OboFormatTag;
import org.obolibrary.oboformat.parser.XrefExpander;

@SuppressWarnings({ "javadoc", "null" })
public class XrefExpanderTest extends OboFormatTestBasics {static class __CLR4_5_21m71m7lvicnzbg{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,2144,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testExpand() {__CLR4_5_21m71m7lvicnzbg.R.globalSliceStart(getClass().getName(),2095);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gtw1w31m7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21m71m7lvicnzbg.R.rethrow($CLV_t2$);}finally{__CLR4_5_21m71m7lvicnzbg.R.globalSliceEnd(getClass().getName(),"org.obolibrary.oboformat.XrefExpanderTest.testExpand",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2095,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gtw1w31m7(){try{__CLR4_5_21m71m7lvicnzbg.R.inc(2095);
        __CLR4_5_21m71m7lvicnzbg.R.inc(2096);OBODoc obodoc = parseOBOFile("treat_xrefs_test.obo");
        __CLR4_5_21m71m7lvicnzbg.R.inc(2097);XrefExpander x = new XrefExpander(obodoc);
        __CLR4_5_21m71m7lvicnzbg.R.inc(2098);x.expandXrefs();
        __CLR4_5_21m71m7lvicnzbg.R.inc(2099);OBODoc tdoc = obodoc.getImportedOBODocs().iterator().next();
        __CLR4_5_21m71m7lvicnzbg.R.inc(2100);assertTrue(!tdoc.getTermFrames().isEmpty());
        __CLR4_5_21m71m7lvicnzbg.R.inc(2101);Frame termFrame = tdoc.getTermFrame("ZFA:0001689");
        assert (((termFrame != null)&&(__CLR4_5_21m71m7lvicnzbg.R.iget(2102)!=0|true))||(__CLR4_5_21m71m7lvicnzbg.R.iget(2103)==0&false));
        __CLR4_5_21m71m7lvicnzbg.R.inc(2104);assertEquals(2, termFrame.getClauses(OboFormatTag.TAG_INTERSECTION_OF)
                .size());
        __CLR4_5_21m71m7lvicnzbg.R.inc(2105);termFrame = tdoc.getTermFrame("EHDAA:571");
        assert (((termFrame != null)&&(__CLR4_5_21m71m7lvicnzbg.R.iget(2106)!=0|true))||(__CLR4_5_21m71m7lvicnzbg.R.iget(2107)==0&false));
        __CLR4_5_21m71m7lvicnzbg.R.inc(2108);assertEquals("UBERON:0002539",
                termFrame.getClause(OboFormatTag.TAG_IS_A).getValue());
        __CLR4_5_21m71m7lvicnzbg.R.inc(2109);termFrame = tdoc.getTermFrame("UBERON:0006800");
        assert (((termFrame != null)&&(__CLR4_5_21m71m7lvicnzbg.R.iget(2110)!=0|true))||(__CLR4_5_21m71m7lvicnzbg.R.iget(2111)==0&false));
        __CLR4_5_21m71m7lvicnzbg.R.inc(2112);assertEquals("CARO:0000008", termFrame.getClause(OboFormatTag.TAG_IS_A)
                .getValue());
    }finally{__CLR4_5_21m71m7lvicnzbg.R.flushNeeded();}}

    @Test
    public void testExpandIntoSeparateBridges() {__CLR4_5_21m71m7lvicnzbg.R.globalSliceStart(getClass().getName(),2113);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2x54ske1mp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21m71m7lvicnzbg.R.rethrow($CLV_t2$);}finally{__CLR4_5_21m71m7lvicnzbg.R.globalSliceEnd(getClass().getName(),"org.obolibrary.oboformat.XrefExpanderTest.testExpandIntoSeparateBridges",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2113,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2x54ske1mp(){try{__CLR4_5_21m71m7lvicnzbg.R.inc(2113);
        __CLR4_5_21m71m7lvicnzbg.R.inc(2114);OBODoc obodoc = parseOBOFile("treat_xrefs_test.obo");
        __CLR4_5_21m71m7lvicnzbg.R.inc(2115);XrefExpander x = new XrefExpander(obodoc, "bridge");
        __CLR4_5_21m71m7lvicnzbg.R.inc(2116);x.expandXrefs();
        __CLR4_5_21m71m7lvicnzbg.R.inc(2117);int n = 0;
        __CLR4_5_21m71m7lvicnzbg.R.inc(2118);for (OBODoc tdoc : obodoc.getImportedOBODocs()) {{
            __CLR4_5_21m71m7lvicnzbg.R.inc(2119);Frame hf = tdoc.getHeaderFrame();
            __CLR4_5_21m71m7lvicnzbg.R.inc(2120);if ((((hf == null)&&(__CLR4_5_21m71m7lvicnzbg.R.iget(2121)!=0|true))||(__CLR4_5_21m71m7lvicnzbg.R.iget(2122)==0&false))) {{
                __CLR4_5_21m71m7lvicnzbg.R.inc(2123);continue;
            }
            }__CLR4_5_21m71m7lvicnzbg.R.inc(2124);Clause impClause = hf.getClause(OboFormatTag.TAG_ONTOLOGY);
            // if (impClause == null) {
            // continue;
            // }
            __CLR4_5_21m71m7lvicnzbg.R.inc(2125);String tid = impClause.getValue(String.class)
                    .replace("bridge-", "");
            __CLR4_5_21m71m7lvicnzbg.R.inc(2126);if ((((tid.equals("zfa"))&&(__CLR4_5_21m71m7lvicnzbg.R.iget(2127)!=0|true))||(__CLR4_5_21m71m7lvicnzbg.R.iget(2128)==0&false))) {{
                __CLR4_5_21m71m7lvicnzbg.R.inc(2129);assertEquals(
                        2,
                        tdoc.getTermFrame("ZFA:0001689")
                                .getClauses(OboFormatTag.TAG_INTERSECTION_OF)
                                .size());
                __CLR4_5_21m71m7lvicnzbg.R.inc(2130);Frame pf = tdoc.getTypedefFrame("part_of");
                __CLR4_5_21m71m7lvicnzbg.R.inc(2131);assertEquals("BFO:0000050", pf.getClause(OboFormatTag.TAG_XREF)
                        .getValue().toString());
                __CLR4_5_21m71m7lvicnzbg.R.inc(2132);n++;
            }
            }__CLR4_5_21m71m7lvicnzbg.R.inc(2133);if ((((tid.equals("ehdaa"))&&(__CLR4_5_21m71m7lvicnzbg.R.iget(2134)!=0|true))||(__CLR4_5_21m71m7lvicnzbg.R.iget(2135)==0&false))) {{
                __CLR4_5_21m71m7lvicnzbg.R.inc(2136);assertEquals("UBERON:0002539", tdoc.getTermFrame("EHDAA:571")
                        .getClause(OboFormatTag.TAG_IS_A).getValue());
                __CLR4_5_21m71m7lvicnzbg.R.inc(2137);n++;
            }
            }__CLR4_5_21m71m7lvicnzbg.R.inc(2138);if ((((tid.equals("caro"))&&(__CLR4_5_21m71m7lvicnzbg.R.iget(2139)!=0|true))||(__CLR4_5_21m71m7lvicnzbg.R.iget(2140)==0&false))) {{
                __CLR4_5_21m71m7lvicnzbg.R.inc(2141);assertEquals(
                        "CARO:0000008",
                        tdoc.getTermFrame("UBERON:0006800")
                                .getClause(OboFormatTag.TAG_IS_A).getValue());
                __CLR4_5_21m71m7lvicnzbg.R.inc(2142);n++;
            }
        }}
        }__CLR4_5_21m71m7lvicnzbg.R.inc(2143);assertEquals(3, n);
        // assertTrue(frame.getClause("name").getValue().equals("x1"));
    }finally{__CLR4_5_21m71m7lvicnzbg.R.flushNeeded();}}
    /*
     * @Test public void testUberonHeader() throws Exception { OBODoc obodoc =
     * parseOBOFile("uberon_header_test.obo"); XrefExpander x = new
     * XrefExpander(obodoc, "bridge"); x.expandXrefs(); }
     */
}
