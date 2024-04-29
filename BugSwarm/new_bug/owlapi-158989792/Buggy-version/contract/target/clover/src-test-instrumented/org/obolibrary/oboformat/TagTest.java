/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.obolibrary.oboformat;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.StringReader;

import javax.annotation.Nonnull;

import org.junit.Test;
import org.obolibrary.obo2owl.OboFormatTestBasics;
import org.obolibrary.oboformat.model.Clause;
import org.obolibrary.oboformat.model.Frame;
import org.obolibrary.oboformat.model.OBODoc;
import org.obolibrary.oboformat.parser.OBOFormatConstants.OboFormatTag;
import org.obolibrary.oboformat.parser.OBOFormatParser;

@SuppressWarnings({ "javadoc", "null" })
public class TagTest extends OboFormatTestBasics {static class __CLR4_5_21h91h9lvicnzb4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,1988,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testParseOBOFile() {__CLR4_5_21h91h9lvicnzb4.R.globalSliceStart(getClass().getName(),1917);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28puohq1h9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21h91h9lvicnzb4.R.rethrow($CLV_t2$);}finally{__CLR4_5_21h91h9lvicnzb4.R.globalSliceEnd(getClass().getName(),"org.obolibrary.oboformat.TagTest.testParseOBOFile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1917,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28puohq1h9(){try{__CLR4_5_21h91h9lvicnzb4.R.inc(1917);
        __CLR4_5_21h91h9lvicnzb4.R.inc(1918);OBODoc obodoc = parseOBOFile("tag_test.obo");
        __CLR4_5_21h91h9lvicnzb4.R.inc(1919);assertEquals(4, obodoc.getTermFrames().size());
        __CLR4_5_21h91h9lvicnzb4.R.inc(1920);assertEquals(1, obodoc.getTypedefFrames().size());
        __CLR4_5_21h91h9lvicnzb4.R.inc(1921);Frame frame = obodoc.getTermFrame("X:1");
        __CLR4_5_21h91h9lvicnzb4.R.inc(1922);assertNotNull(frame);
        __CLR4_5_21h91h9lvicnzb4.R.inc(1923);assertEquals("x1", frame.getTagValue(OboFormatTag.TAG_NAME));
    }finally{__CLR4_5_21h91h9lvicnzb4.R.flushNeeded();}}

    @Test
    public void testParseOBOFile2() {__CLR4_5_21h91h9lvicnzb4.R.globalSliceStart(getClass().getName(),1924);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2sxf3z61hg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21h91h9lvicnzb4.R.rethrow($CLV_t2$);}finally{__CLR4_5_21h91h9lvicnzb4.R.globalSliceEnd(getClass().getName(),"org.obolibrary.oboformat.TagTest.testParseOBOFile2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1924,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2sxf3z61hg(){try{__CLR4_5_21h91h9lvicnzb4.R.inc(1924);
        __CLR4_5_21h91h9lvicnzb4.R.inc(1925);OBODoc obodoc = parseOBOFile("testqvs.obo");
        __CLR4_5_21h91h9lvicnzb4.R.inc(1926);assertEquals(4, obodoc.getTermFrames().size());
        __CLR4_5_21h91h9lvicnzb4.R.inc(1927);assertEquals(1, obodoc.getTypedefFrames().size());
    }finally{__CLR4_5_21h91h9lvicnzb4.R.flushNeeded();}}

    @Test
    public void testParseOBODoc() {__CLR4_5_21h91h9lvicnzb4.R.globalSliceStart(getClass().getName(),1928);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28xc3rw1hk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21h91h9lvicnzb4.R.rethrow($CLV_t2$);}finally{__CLR4_5_21h91h9lvicnzb4.R.globalSliceEnd(getClass().getName(),"org.obolibrary.oboformat.TagTest.testParseOBODoc",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1928,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28xc3rw1hk(){try{__CLR4_5_21h91h9lvicnzb4.R.inc(1928);
        __CLR4_5_21h91h9lvicnzb4.R.inc(1929);OBODoc obodoc = parseOBODoc("[Term]\nid: x\nname: foo\n\n\n[Term]\nid: y\nname: y");
        __CLR4_5_21h91h9lvicnzb4.R.inc(1930);assertEquals(2, obodoc.getTermFrames().size());
        __CLR4_5_21h91h9lvicnzb4.R.inc(1931);Frame frame = obodoc.getTermFrame("x");
        __CLR4_5_21h91h9lvicnzb4.R.inc(1932);assertEquals("foo", frame.getTagValue(OboFormatTag.TAG_NAME));
    }finally{__CLR4_5_21h91h9lvicnzb4.R.flushNeeded();}}

    @Test
    public void testParseFrames() {__CLR4_5_21h91h9lvicnzb4.R.globalSliceStart(getClass().getName(),1933);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2g9pz8u1hp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21h91h9lvicnzb4.R.rethrow($CLV_t2$);}finally{__CLR4_5_21h91h9lvicnzb4.R.globalSliceEnd(getClass().getName(),"org.obolibrary.oboformat.TagTest.testParseFrames",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1933,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2g9pz8u1hp(){try{__CLR4_5_21h91h9lvicnzb4.R.inc(1933);
        __CLR4_5_21h91h9lvicnzb4.R.inc(1934);OBODoc obodoc = parseFrames("[Term]\nid: x\nname: foo");
        __CLR4_5_21h91h9lvicnzb4.R.inc(1935);assertEquals(1, obodoc.getTermFrames().size());
        __CLR4_5_21h91h9lvicnzb4.R.inc(1936);Frame frame = obodoc.getTermFrames().iterator().next();
        __CLR4_5_21h91h9lvicnzb4.R.inc(1937);assertEquals("foo", frame.getTagValue(OboFormatTag.TAG_NAME));
    }finally{__CLR4_5_21h91h9lvicnzb4.R.flushNeeded();}}

    @Test
    public void testParseDefTag() {__CLR4_5_21h91h9lvicnzb4.R.globalSliceStart(getClass().getName(),1938);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2j9f43h1hu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21h91h9lvicnzb4.R.rethrow($CLV_t2$);}finally{__CLR4_5_21h91h9lvicnzb4.R.globalSliceEnd(getClass().getName(),"org.obolibrary.oboformat.TagTest.testParseDefTag",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1938,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2j9f43h1hu(){try{__CLR4_5_21h91h9lvicnzb4.R.inc(1938);
        __CLR4_5_21h91h9lvicnzb4.R.inc(1939);Clause cl = parseLine("def: \"a b c\" [foo:1, bar:2]");
        __CLR4_5_21h91h9lvicnzb4.R.inc(1940);assertEquals(OboFormatTag.TAG_DEF.getTag(), cl.getTag());
        __CLR4_5_21h91h9lvicnzb4.R.inc(1941);assertEquals("a b c", cl.getValue());
        __CLR4_5_21h91h9lvicnzb4.R.inc(1942);assertEquals(1, cl.getValues().size());
    }finally{__CLR4_5_21h91h9lvicnzb4.R.flushNeeded();}}

    @Test
    public void testParseDefTag2() {__CLR4_5_21h91h9lvicnzb4.R.globalSliceStart(getClass().getName(),1943);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mg9tv1hz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21h91h9lvicnzb4.R.rethrow($CLV_t2$);}finally{__CLR4_5_21h91h9lvicnzb4.R.globalSliceEnd(getClass().getName(),"org.obolibrary.oboformat.TagTest.testParseDefTag2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1943,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mg9tv1hz(){try{__CLR4_5_21h91h9lvicnzb4.R.inc(1943);
        __CLR4_5_21h91h9lvicnzb4.R.inc(1944);Clause cl = parseLine("def: \"a b c\" [foo:1 \"blah blah\", bar:2]");
        __CLR4_5_21h91h9lvicnzb4.R.inc(1945);assertEquals(OboFormatTag.TAG_DEF.getTag(), cl.getTag());
        __CLR4_5_21h91h9lvicnzb4.R.inc(1946);assertEquals("a b c", cl.getValue());
    }finally{__CLR4_5_21h91h9lvicnzb4.R.flushNeeded();}}

    @Test
    public void testParseCreationDateTag() {__CLR4_5_21h91h9lvicnzb4.R.globalSliceStart(getClass().getName(),1947);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ro369f1i3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21h91h9lvicnzb4.R.rethrow($CLV_t2$);}finally{__CLR4_5_21h91h9lvicnzb4.R.globalSliceEnd(getClass().getName(),"org.obolibrary.oboformat.TagTest.testParseCreationDateTag",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1947,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ro369f1i3(){try{__CLR4_5_21h91h9lvicnzb4.R.inc(1947);
        __CLR4_5_21h91h9lvicnzb4.R.inc(1948);Clause cl = parseLine("creation_date: 2009-04-28T10:29:37Z");
        __CLR4_5_21h91h9lvicnzb4.R.inc(1949);assertEquals(OboFormatTag.TAG_CREATION_DATE.getTag(), cl.getTag());
    }finally{__CLR4_5_21h91h9lvicnzb4.R.flushNeeded();}}

    @Test
    public void testParseNameTag() {__CLR4_5_21h91h9lvicnzb4.R.globalSliceStart(getClass().getName(),1950);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27nsoa31i6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21h91h9lvicnzb4.R.rethrow($CLV_t2$);}finally{__CLR4_5_21h91h9lvicnzb4.R.globalSliceEnd(getClass().getName(),"org.obolibrary.oboformat.TagTest.testParseNameTag",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1950,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27nsoa31i6(){try{__CLR4_5_21h91h9lvicnzb4.R.inc(1950);
        __CLR4_5_21h91h9lvicnzb4.R.inc(1951);Clause cl = parseLine("name: a b c");
        __CLR4_5_21h91h9lvicnzb4.R.inc(1952);assertEquals(cl.getTag(), OboFormatTag.TAG_NAME.getTag());
        __CLR4_5_21h91h9lvicnzb4.R.inc(1953);assertEquals("a b c", cl.getValue());
    }finally{__CLR4_5_21h91h9lvicnzb4.R.flushNeeded();}}

    @Test
    public void testParseNameTag2() {__CLR4_5_21h91h9lvicnzb4.R.globalSliceStart(getClass().getName(),1954);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ie3huz1ia();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21h91h9lvicnzb4.R.rethrow($CLV_t2$);}finally{__CLR4_5_21h91h9lvicnzb4.R.globalSliceEnd(getClass().getName(),"org.obolibrary.oboformat.TagTest.testParseNameTag2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1954,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ie3huz1ia(){try{__CLR4_5_21h91h9lvicnzb4.R.inc(1954);
        __CLR4_5_21h91h9lvicnzb4.R.inc(1955);Clause cl = parseLine("name:    a b c");
        __CLR4_5_21h91h9lvicnzb4.R.inc(1956);assertEquals(OboFormatTag.TAG_NAME.getTag(), cl.getTag());
        __CLR4_5_21h91h9lvicnzb4.R.inc(1957);assertEquals("a b c", cl.getValue());
    }finally{__CLR4_5_21h91h9lvicnzb4.R.flushNeeded();}}

    @Test
    public void testParseNamespaceTag() {__CLR4_5_21h91h9lvicnzb4.R.globalSliceStart(getClass().getName(),1958);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2g43kbd1ie();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21h91h9lvicnzb4.R.rethrow($CLV_t2$);}finally{__CLR4_5_21h91h9lvicnzb4.R.globalSliceEnd(getClass().getName(),"org.obolibrary.oboformat.TagTest.testParseNamespaceTag",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1958,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2g43kbd1ie(){try{__CLR4_5_21h91h9lvicnzb4.R.inc(1958);
        __CLR4_5_21h91h9lvicnzb4.R.inc(1959);Clause cl = parseLine("namespace: foo");
        __CLR4_5_21h91h9lvicnzb4.R.inc(1960);assertEquals(cl.getTag(), OboFormatTag.TAG_NAMESPACE.getTag());
        __CLR4_5_21h91h9lvicnzb4.R.inc(1961);assertEquals("foo", cl.getValue());
    }finally{__CLR4_5_21h91h9lvicnzb4.R.flushNeeded();}}

    @Test
    public void testParseIsATag() {__CLR4_5_21h91h9lvicnzb4.R.globalSliceStart(getClass().getName(),1962);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ptipcl1ii();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21h91h9lvicnzb4.R.rethrow($CLV_t2$);}finally{__CLR4_5_21h91h9lvicnzb4.R.globalSliceEnd(getClass().getName(),"org.obolibrary.oboformat.TagTest.testParseIsATag",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1962,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ptipcl1ii(){try{__CLR4_5_21h91h9lvicnzb4.R.inc(1962);
        __CLR4_5_21h91h9lvicnzb4.R.inc(1963);Clause cl = parseLine("is_a: x ! foo");
        __CLR4_5_21h91h9lvicnzb4.R.inc(1964);assertEquals(OboFormatTag.TAG_IS_A.getTag(), cl.getTag());
        __CLR4_5_21h91h9lvicnzb4.R.inc(1965);assertEquals("x", cl.getValue());
    }finally{__CLR4_5_21h91h9lvicnzb4.R.flushNeeded();}}

    @Nonnull
    private static Clause parseLine(@Nonnull String line) {try{__CLR4_5_21h91h9lvicnzb4.R.inc(1966);
        __CLR4_5_21h91h9lvicnzb4.R.inc(1967);StringReader sr = new StringReader(line);
        __CLR4_5_21h91h9lvicnzb4.R.inc(1968);OBOFormatParser p = new OBOFormatParser();
        __CLR4_5_21h91h9lvicnzb4.R.inc(1969);BufferedReader br = new BufferedReader(sr);
        __CLR4_5_21h91h9lvicnzb4.R.inc(1970);p.setReader(br);
        __CLR4_5_21h91h9lvicnzb4.R.inc(1971);return p.parseTermFrameClause();
    }finally{__CLR4_5_21h91h9lvicnzb4.R.flushNeeded();}}

    @Nonnull
    private static OBODoc parseFrames(@Nonnull String s) {try{__CLR4_5_21h91h9lvicnzb4.R.inc(1972);
        __CLR4_5_21h91h9lvicnzb4.R.inc(1973);StringReader sr = new StringReader(s);
        __CLR4_5_21h91h9lvicnzb4.R.inc(1974);OBOFormatParser p = new OBOFormatParser();
        __CLR4_5_21h91h9lvicnzb4.R.inc(1975);BufferedReader br = new BufferedReader(sr);
        __CLR4_5_21h91h9lvicnzb4.R.inc(1976);p.setReader(br);
        __CLR4_5_21h91h9lvicnzb4.R.inc(1977);OBODoc obodoc = new OBODoc();
        __CLR4_5_21h91h9lvicnzb4.R.inc(1978);p.parseTermFrame(obodoc);
        __CLR4_5_21h91h9lvicnzb4.R.inc(1979);return obodoc;
    }finally{__CLR4_5_21h91h9lvicnzb4.R.flushNeeded();}}

    @Nonnull
    private static OBODoc parseOBODoc(@Nonnull String s) {try{__CLR4_5_21h91h9lvicnzb4.R.inc(1980);
        __CLR4_5_21h91h9lvicnzb4.R.inc(1981);StringReader sr = new StringReader(s);
        __CLR4_5_21h91h9lvicnzb4.R.inc(1982);OBOFormatParser p = new OBOFormatParser();
        __CLR4_5_21h91h9lvicnzb4.R.inc(1983);BufferedReader br = new BufferedReader(sr);
        __CLR4_5_21h91h9lvicnzb4.R.inc(1984);p.setReader(br);
        __CLR4_5_21h91h9lvicnzb4.R.inc(1985);OBODoc obodoc = new OBODoc();
        __CLR4_5_21h91h9lvicnzb4.R.inc(1986);p.parseOBODoc(obodoc);
        __CLR4_5_21h91h9lvicnzb4.R.inc(1987);return obodoc;
    }finally{__CLR4_5_21h91h9lvicnzb4.R.flushNeeded();}}
}
