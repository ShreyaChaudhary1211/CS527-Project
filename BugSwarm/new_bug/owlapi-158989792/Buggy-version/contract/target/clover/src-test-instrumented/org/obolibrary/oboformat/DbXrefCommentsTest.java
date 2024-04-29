/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.obolibrary.oboformat;

import static org.junit.Assert.*;

import java.util.Collection;
import java.util.Iterator;

import org.junit.Test;
import org.obolibrary.obo2owl.OboFormatTestBasics;
import org.obolibrary.oboformat.model.Clause;
import org.obolibrary.oboformat.model.Frame;
import org.obolibrary.oboformat.model.OBODoc;
import org.obolibrary.oboformat.model.Xref;
import org.obolibrary.oboformat.parser.OBOFormatConstants.OboFormatTag;

@SuppressWarnings("javadoc")
public class DbXrefCommentsTest extends OboFormatTestBasics {static class __CLR4_5_21d11d1lvicnza9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,1783,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testDbXrefCommentsRoundtrip() throws Exception {__CLR4_5_21d11d1lvicnza9.R.globalSliceStart(getClass().getName(),1765);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22o7x6t1d1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21d11d1lvicnza9.R.rethrow($CLV_t2$);}finally{__CLR4_5_21d11d1lvicnza9.R.globalSliceEnd(getClass().getName(),"org.obolibrary.oboformat.DbXrefCommentsTest.testDbXrefCommentsRoundtrip",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1765,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22o7x6t1d1() throws Exception{try{__CLR4_5_21d11d1lvicnza9.R.inc(1765);
        __CLR4_5_21d11d1lvicnza9.R.inc(1766);OBODoc obodoc = parseOBOFile("db_xref_comments.obo");
        __CLR4_5_21d11d1lvicnza9.R.inc(1767);Frame frame = obodoc.getTermFrame("MOD:00516");
        __CLR4_5_21d11d1lvicnza9.R.inc(1768);assertNotNull(frame);
        __CLR4_5_21d11d1lvicnza9.R.inc(1769);Clause defClause = frame.getClause(OboFormatTag.TAG_DEF);
        __CLR4_5_21d11d1lvicnza9.R.inc(1770);assertNotNull(defClause);
        __CLR4_5_21d11d1lvicnza9.R.inc(1771);Collection<Xref> xrefs = defClause.getXrefs();
        __CLR4_5_21d11d1lvicnza9.R.inc(1772);assertEquals(2, xrefs.size());
        __CLR4_5_21d11d1lvicnza9.R.inc(1773);Iterator<Xref> iterator = xrefs.iterator();
        __CLR4_5_21d11d1lvicnza9.R.inc(1774);Xref xref1 = iterator.next();
        __CLR4_5_21d11d1lvicnza9.R.inc(1775);assertEquals("RESID:AA0151", xref1.getIdref());
        __CLR4_5_21d11d1lvicnza9.R.inc(1776);String annotation = xref1.getAnnotation();
        __CLR4_5_21d11d1lvicnza9.R.inc(1777);assertEquals("variant", annotation);
        __CLR4_5_21d11d1lvicnza9.R.inc(1778);Xref xref2 = iterator.next();
        __CLR4_5_21d11d1lvicnza9.R.inc(1779);assertEquals("UniMod:148", xref2.getIdref());
        __CLR4_5_21d11d1lvicnza9.R.inc(1780);String original = readResource("db_xref_comments.obo");
        __CLR4_5_21d11d1lvicnza9.R.inc(1781);String renderedOboString = renderOboToString(obodoc);
        __CLR4_5_21d11d1lvicnza9.R.inc(1782);assertEquals(original, renderedOboString);
    }finally{__CLR4_5_21d11d1lvicnza9.R.flushNeeded();}}
}
