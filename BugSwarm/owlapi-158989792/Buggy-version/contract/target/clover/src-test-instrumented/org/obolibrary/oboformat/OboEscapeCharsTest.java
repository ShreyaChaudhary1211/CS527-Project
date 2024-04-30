/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.obolibrary.oboformat;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.obolibrary.obo2owl.OboFormatTestBasics;
import org.obolibrary.oboformat.diff.Diff;
import org.obolibrary.oboformat.diff.OBODocDiffer;
import org.obolibrary.oboformat.model.Clause;
import org.obolibrary.oboformat.model.Frame;
import org.obolibrary.oboformat.model.OBODoc;
import org.obolibrary.oboformat.parser.OBOFormatConstants.OboFormatTag;

@SuppressWarnings({ "javadoc", "null" })
public class OboEscapeCharsTest extends OboFormatTestBasics {static class __CLR4_5_21f31f3lvicnzaq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,1861,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testEscapeChars() {__CLR4_5_21f31f3lvicnzaq.R.globalSliceStart(getClass().getName(),1839);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25ux7n51f3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21f31f3lvicnzaq.R.rethrow($CLV_t2$);}finally{__CLR4_5_21f31f3lvicnzaq.R.globalSliceEnd(getClass().getName(),"org.obolibrary.oboformat.OboEscapeCharsTest.testEscapeChars",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1839,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25ux7n51f3(){try{__CLR4_5_21f31f3lvicnzaq.R.inc(1839);
        __CLR4_5_21f31f3lvicnzaq.R.inc(1840);OBODoc obodoc = parseOBOFile("escape_chars_test.obo");
        __CLR4_5_21f31f3lvicnzaq.R.inc(1841);assertEquals(3, obodoc.getTermFrames().size());
        __CLR4_5_21f31f3lvicnzaq.R.inc(1842);Frame f1 = obodoc.getTermFrame("GO:0033942");
        __CLR4_5_21f31f3lvicnzaq.R.inc(1843);assertEquals("GO:0033942", f1.getId());
        __CLR4_5_21f31f3lvicnzaq.R.inc(1844);Clause nameClause = f1.getClause(OboFormatTag.TAG_NAME);
        __CLR4_5_21f31f3lvicnzaq.R.inc(1845);assertEquals(
                "4-alpha-D-{(1->4)-alpha-D-glucano}trehalose trehalohydrolase activity",
                nameClause.getValue());
        __CLR4_5_21f31f3lvicnzaq.R.inc(1846);Frame f2 = obodoc.getTermFrame("CL:0000096");
        __CLR4_5_21f31f3lvicnzaq.R.inc(1847);assertEquals("CL:0000096", f2.getId());
        __CLR4_5_21f31f3lvicnzaq.R.inc(1848);Clause defClause = f2.getClause(OboFormatTag.TAG_DEF);
        __CLR4_5_21f31f3lvicnzaq.R.inc(1849);assertEquals("bla bla .\"", defClause.getValue());
        __CLR4_5_21f31f3lvicnzaq.R.inc(1850);Clause commentClause = f2.getClause(OboFormatTag.TAG_COMMENT);
        __CLR4_5_21f31f3lvicnzaq.R.inc(1851);assertEquals("bla bla bla.\nbla bla (bla).", commentClause.getValue());
    }finally{__CLR4_5_21f31f3lvicnzaq.R.flushNeeded();}}

    @Test
    public void testRoundTripEscapeChars() throws Exception {__CLR4_5_21f31f3lvicnzaq.R.globalSliceStart(getClass().getName(),1852);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wnv04e1fg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21f31f3lvicnzaq.R.rethrow($CLV_t2$);}finally{__CLR4_5_21f31f3lvicnzaq.R.globalSliceEnd(getClass().getName(),"org.obolibrary.oboformat.OboEscapeCharsTest.testRoundTripEscapeChars",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1852,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wnv04e1fg() throws Exception{try{__CLR4_5_21f31f3lvicnzaq.R.inc(1852);
        __CLR4_5_21f31f3lvicnzaq.R.inc(1853);OBODoc oboDoc = parseOBOFile("escape_chars_test.obo");
        __CLR4_5_21f31f3lvicnzaq.R.inc(1854);String oboToString = renderOboToString(oboDoc);
        __CLR4_5_21f31f3lvicnzaq.R.inc(1855);OBODoc oboDoc2 = parseOboToString(oboToString);
        __CLR4_5_21f31f3lvicnzaq.R.inc(1856);assertNotNull("There was an error during parsing of the obodoc",
                oboDoc2);
        __CLR4_5_21f31f3lvicnzaq.R.inc(1857);List<Diff> diffs = OBODocDiffer.getDiffs(oboDoc, oboDoc2);
        __CLR4_5_21f31f3lvicnzaq.R.inc(1858);assertEquals("Expected no diffs.", 0, diffs.size());
        __CLR4_5_21f31f3lvicnzaq.R.inc(1859);String original = readResource("escape_chars_test.obo");
        __CLR4_5_21f31f3lvicnzaq.R.inc(1860);assertEquals(original, oboToString);
    }finally{__CLR4_5_21f31f3lvicnzaq.R.flushNeeded();}}
}
