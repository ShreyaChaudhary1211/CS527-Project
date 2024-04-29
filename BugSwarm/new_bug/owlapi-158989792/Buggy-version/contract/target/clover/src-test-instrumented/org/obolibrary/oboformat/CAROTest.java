/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.obolibrary.oboformat;

import static org.junit.Assert.*;

import java.util.Collection;

import org.junit.Test;
import org.obolibrary.obo2owl.OboFormatTestBasics;
import org.obolibrary.oboformat.model.Clause;
import org.obolibrary.oboformat.model.Frame;
import org.obolibrary.oboformat.model.OBODoc;
import org.obolibrary.oboformat.model.Xref;
import org.obolibrary.oboformat.parser.OBOFormatConstants.OboFormatTag;

@SuppressWarnings("javadoc")
public class CAROTest extends OboFormatTestBasics {static class __CLR4_5_21c01c0lvicnz9o{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,1741,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testParseCARO() {__CLR4_5_21c01c0lvicnz9o.R.globalSliceStart(getClass().getName(),1728);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2p587kt1c0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21c01c0lvicnz9o.R.rethrow($CLV_t2$);}finally{__CLR4_5_21c01c0lvicnz9o.R.globalSliceEnd(getClass().getName(),"org.obolibrary.oboformat.CAROTest.testParseCARO",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1728,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2p587kt1c0(){try{__CLR4_5_21c01c0lvicnz9o.R.inc(1728);
        __CLR4_5_21c01c0lvicnz9o.R.inc(1729);OBODoc obodoc = parseOBOFile("caro.obo");
        __CLR4_5_21c01c0lvicnz9o.R.inc(1730);assertTrue(obodoc.getTermFrames().size() > 2);
        __CLR4_5_21c01c0lvicnz9o.R.inc(1731);Frame cc = obodoc.getTermFrame("CARO:0000014");
        assert (((cc != null)&&(__CLR4_5_21c01c0lvicnz9o.R.iget(1732)!=0|true))||(__CLR4_5_21c01c0lvicnz9o.R.iget(1733)==0&false));
        __CLR4_5_21c01c0lvicnz9o.R.inc(1734);assertEquals("cell component", cc.getTagValue(OboFormatTag.TAG_NAME));
        __CLR4_5_21c01c0lvicnz9o.R.inc(1735);assertEquals("Anatomical structure that is a direct part of the cell.",
                cc.getTagValue(OboFormatTag.TAG_DEF));
        __CLR4_5_21c01c0lvicnz9o.R.inc(1736);Clause dc = cc.getClause(OboFormatTag.TAG_DEF);
        assert (((dc != null)&&(__CLR4_5_21c01c0lvicnz9o.R.iget(1737)!=0|true))||(__CLR4_5_21c01c0lvicnz9o.R.iget(1738)==0&false));
        __CLR4_5_21c01c0lvicnz9o.R.inc(1739);Collection<Xref> dcxs = dc.getXrefs();
        __CLR4_5_21c01c0lvicnz9o.R.inc(1740);assertEquals("CARO:MAH", dcxs.iterator().next().getIdref());
        /*
         * Collection<Xref> defxrefs = cc.getTagXrefs("def");
         * System.out.println("def xrefs = "+defxrefs);
         * assertTrue(defxrefs.iterator().next().getIdref().equals("CARO:MAH"));
         */
        // assertTrue(frame.getClause(OboFormatTag.TAG_NAME.getTag()).getValue().equals("x1"));
    }finally{__CLR4_5_21c01c0lvicnz9o.R.flushNeeded();}}
}
