/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.obolibrary.oboformat;

import static org.junit.Assert.*;

import org.junit.Test;
import org.obolibrary.obo2owl.OboFormatTestBasics;
import org.obolibrary.oboformat.model.Clause;
import org.obolibrary.oboformat.model.Frame;
import org.obolibrary.oboformat.model.Frame.FrameType;
import org.obolibrary.oboformat.model.OBODoc;
import org.obolibrary.oboformat.parser.OBOFormatConstants.OboFormatTag;
import org.obolibrary.oboformat.parser.OBOFormatParserException;

@SuppressWarnings({ "javadoc", "null" })
public class CurlyBracesInCommentsTest extends OboFormatTestBasics {static class __CLR4_5_21cj1cjlvicnz9w{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,1765,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test(expected = OBOFormatParserException.class)
    public void testCurlyBracesInComments() {__CLR4_5_21cj1cjlvicnz9w.R.globalSliceStart(getClass().getName(),1747);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2m6rm7v1cj();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,117,114,108,121,66,114,97,99,101,115,73,110,67,111,109,109,101,110,116,115,58,32,91,79,66,79,70,111,114,109,97,116,80,97,114,115,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof OBOFormatParserException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cj1cjlvicnz9w.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cj1cjlvicnz9w.R.globalSliceEnd(getClass().getName(),"org.obolibrary.oboformat.CurlyBracesInCommentsTest.testCurlyBracesInComments",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1747,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2m6rm7v1cj(){try{__CLR4_5_21cj1cjlvicnz9w.R.inc(1747);
        /*
         * Expect an parser exception, as the comment line contains '{' and '}'.
         * This will lead the parser to try and parse it as a trailing
         * qualifier, which fails in this case.
         */
        __CLR4_5_21cj1cjlvicnz9w.R.inc(1748);parseOBOFile("fbbt_comment_test.obo");
    }finally{__CLR4_5_21cj1cjlvicnz9w.R.flushNeeded();}}

    @Test
    public void writeCurlyBracesInComments() throws Exception {__CLR4_5_21cj1cjlvicnz9w.R.globalSliceStart(getClass().getName(),1749);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2knr1hu1cl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cj1cjlvicnz9w.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cj1cjlvicnz9w.R.globalSliceEnd(getClass().getName(),"org.obolibrary.oboformat.CurlyBracesInCommentsTest.writeCurlyBracesInComments",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1749,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2knr1hu1cl() throws Exception{try{__CLR4_5_21cj1cjlvicnz9w.R.inc(1749);
        __CLR4_5_21cj1cjlvicnz9w.R.inc(1750);OBODoc doc = new OBODoc();
        __CLR4_5_21cj1cjlvicnz9w.R.inc(1751);Frame h = new Frame(FrameType.HEADER);
        __CLR4_5_21cj1cjlvicnz9w.R.inc(1752);h.addClause(new Clause(OboFormatTag.TAG_ONTOLOGY, "test"));
        __CLR4_5_21cj1cjlvicnz9w.R.inc(1753);doc.setHeaderFrame(h);
        __CLR4_5_21cj1cjlvicnz9w.R.inc(1754);Frame t = new Frame(FrameType.TERM);
        __CLR4_5_21cj1cjlvicnz9w.R.inc(1755);String id = "TEST:0001";
        __CLR4_5_21cj1cjlvicnz9w.R.inc(1756);t.setId(id);
        __CLR4_5_21cj1cjlvicnz9w.R.inc(1757);t.addClause(new Clause(OboFormatTag.TAG_ID, id));
        __CLR4_5_21cj1cjlvicnz9w.R.inc(1758);String comment = "Comment with a '{' curly braces '}'";
        __CLR4_5_21cj1cjlvicnz9w.R.inc(1759);t.addClause(new Clause(OboFormatTag.TAG_COMMENT, comment));
        __CLR4_5_21cj1cjlvicnz9w.R.inc(1760);doc.addFrame(t);
        __CLR4_5_21cj1cjlvicnz9w.R.inc(1761);String oboString = renderOboToString(doc);
        __CLR4_5_21cj1cjlvicnz9w.R.inc(1762);assertTrue(oboString
                .contains("comment: Comment with a '\\{' curly braces '}'"));
        __CLR4_5_21cj1cjlvicnz9w.R.inc(1763);OBODoc doc2 = parseOboToString(oboString);
        __CLR4_5_21cj1cjlvicnz9w.R.inc(1764);assertEquals(comment,
                doc2.getTermFrame(id).getTagValue(OboFormatTag.TAG_COMMENT));
    }finally{__CLR4_5_21cj1cjlvicnz9w.R.flushNeeded();}}
}
