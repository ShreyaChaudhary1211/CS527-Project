/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.obolibrary.oboformat;

import static org.junit.Assert.assertEquals;

import java.util.List;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.junit.Test;
import org.obolibrary.obo2owl.OboFormatTestBasics;
import org.obolibrary.oboformat.diff.Diff;
import org.obolibrary.oboformat.diff.OBODocDiffer;
import org.obolibrary.oboformat.model.Clause;
import org.obolibrary.oboformat.model.Frame;
import org.obolibrary.oboformat.model.Frame.FrameType;
import org.obolibrary.oboformat.model.OBODoc;
import org.obolibrary.oboformat.parser.OBOFormatConstants.OboFormatTag;

@SuppressWarnings({ "javadoc", "null" })
public class PropertyValueTest extends OboFormatTestBasics {static class __CLR4_5_21fp1fplvicnzat{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,1890,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testExpand() {__CLR4_5_21fp1fplvicnzat.R.globalSliceStart(getClass().getName(),1861);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gtw1w31fp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21fp1fplvicnzat.R.rethrow($CLV_t2$);}finally{__CLR4_5_21fp1fplvicnzat.R.globalSliceEnd(getClass().getName(),"org.obolibrary.oboformat.PropertyValueTest.testExpand",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1861,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gtw1w31fp(){try{__CLR4_5_21fp1fplvicnzat.R.inc(1861);
        __CLR4_5_21fp1fplvicnzat.R.inc(1862);OBODoc obodoc = parseOBOFile("property_value_test.obo");
        __CLR4_5_21fp1fplvicnzat.R.inc(1863);Clause propertyValue = obodoc.getTermFrame("UBERON:0004657").getClause(
                OboFormatTag.TAG_PROPERTY_VALUE);
        __CLR4_5_21fp1fplvicnzat.R.inc(1864);assertEquals("IAO:0000412", propertyValue.getValue());
        __CLR4_5_21fp1fplvicnzat.R.inc(1865);assertEquals("http://purl.obolibrary.org/obo/uberon.owl",
                propertyValue.getValue2());
    }finally{__CLR4_5_21fp1fplvicnzat.R.flushNeeded();}}

    @Test
    public void testWriteReadValues() throws Exception {__CLR4_5_21fp1fplvicnzat.R.globalSliceStart(getClass().getName(),1866);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jwwc3w1fu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21fp1fplvicnzat.R.rethrow($CLV_t2$);}finally{__CLR4_5_21fp1fplvicnzat.R.globalSliceEnd(getClass().getName(),"org.obolibrary.oboformat.PropertyValueTest.testWriteReadValues",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1866,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jwwc3w1fu() throws Exception{try{__CLR4_5_21fp1fplvicnzat.R.inc(1866);
        __CLR4_5_21fp1fplvicnzat.R.inc(1867);OBODoc doc = createPVDoc();
        __CLR4_5_21fp1fplvicnzat.R.inc(1868);String oboString = renderOboToString(doc);
        __CLR4_5_21fp1fplvicnzat.R.inc(1869);OBODoc doc2 = parseOboToString(oboString);
        __CLR4_5_21fp1fplvicnzat.R.inc(1870);List<Diff> diffs = OBODocDiffer.getDiffs(doc, doc2);
        __CLR4_5_21fp1fplvicnzat.R.inc(1871);assertEquals("Expected no diffs", 0, diffs.size());
    }finally{__CLR4_5_21fp1fplvicnzat.R.flushNeeded();}}

    @Nonnull
    private static OBODoc createPVDoc() {try{__CLR4_5_21fp1fplvicnzat.R.inc(1872);
        __CLR4_5_21fp1fplvicnzat.R.inc(1873);OBODoc oboDoc = new OBODoc();
        __CLR4_5_21fp1fplvicnzat.R.inc(1874);Frame headerFrame = new Frame(FrameType.HEADER);
        __CLR4_5_21fp1fplvicnzat.R.inc(1875);headerFrame
                .addClause(new Clause(OboFormatTag.TAG_FORMAT_VERSION, "1.2"));
        __CLR4_5_21fp1fplvicnzat.R.inc(1876);headerFrame.addClause(new Clause(OboFormatTag.TAG_ONTOLOGY, "test"));
        __CLR4_5_21fp1fplvicnzat.R.inc(1877);addPropertyValue(headerFrame, "http://purl.org/dc/elements/1.1/title",
                "Ontology for Biomedical Investigation", "xsd:string");
        __CLR4_5_21fp1fplvicnzat.R.inc(1878);addPropertyValue(headerFrame, "defaultLanguage", "en", "xsd:string");
        __CLR4_5_21fp1fplvicnzat.R.inc(1879);oboDoc.setHeaderFrame(headerFrame);
        __CLR4_5_21fp1fplvicnzat.R.inc(1880);return oboDoc;
    }finally{__CLR4_5_21fp1fplvicnzat.R.flushNeeded();}}

    private static void addPropertyValue(@Nonnull Frame frame, String v1,
            String v2, @Nullable String v3) {try{__CLR4_5_21fp1fplvicnzat.R.inc(1881);
        __CLR4_5_21fp1fplvicnzat.R.inc(1882);Clause cl = new Clause(OboFormatTag.TAG_PROPERTY_VALUE);
        __CLR4_5_21fp1fplvicnzat.R.inc(1883);cl.addValue(v1);
        __CLR4_5_21fp1fplvicnzat.R.inc(1884);cl.addValue(v2);
        __CLR4_5_21fp1fplvicnzat.R.inc(1885);if ((((v3 != null)&&(__CLR4_5_21fp1fplvicnzat.R.iget(1886)!=0|true))||(__CLR4_5_21fp1fplvicnzat.R.iget(1887)==0&false))) {{
            __CLR4_5_21fp1fplvicnzat.R.inc(1888);cl.addValue(v3);
        }
        }__CLR4_5_21fp1fplvicnzat.R.inc(1889);frame.addClause(cl);
    }finally{__CLR4_5_21fp1fplvicnzat.R.flushNeeded();}}
}
