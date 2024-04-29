/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.obolibrary.oboformat.writer;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nonnull;

import org.junit.Test;
import org.obolibrary.obo2owl.OboFormatTestBasics;
import org.obolibrary.oboformat.model.Clause;
import org.obolibrary.oboformat.model.Frame;
import org.obolibrary.oboformat.model.OBODoc;
import org.obolibrary.oboformat.parser.OBOFormatConstants.OboFormatTag;

/** Tests for {@link OBOFormatWriter}. */
@SuppressWarnings({ "javadoc", "null" })
public class OBOFormatWriterTest extends OboFormatTestBasics {static class __CLR4_5_21nk1nklvicnzbp{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,2226,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Test a special case of the specification. For intersections put the genus
     * before the differentia, instead of the default case-insensitive
     * alphabetical ordering.
     */
    @Test
    public void testSortTermClausesIntersectionOf() {__CLR4_5_21nk1nklvicnzbp.R.globalSliceStart(getClass().getName(),2144);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2atd9m91nk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21nk1nklvicnzbp.R.rethrow($CLV_t2$);}finally{__CLR4_5_21nk1nklvicnzbp.R.globalSliceEnd(getClass().getName(),"org.obolibrary.oboformat.writer.OBOFormatWriterTest.testSortTermClausesIntersectionOf",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2144,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2atd9m91nk(){try{__CLR4_5_21nk1nklvicnzbp.R.inc(2144);
        __CLR4_5_21nk1nklvicnzbp.R.inc(2145);OBODoc oboDoc = parseOBOFile("equivtest.obo");
        __CLR4_5_21nk1nklvicnzbp.R.inc(2146);Frame frame = oboDoc.getTermFrame("X:1");
        __CLR4_5_21nk1nklvicnzbp.R.inc(2147);List<Clause> clauses = new ArrayList<>(
                frame.getClauses(OboFormatTag.TAG_INTERSECTION_OF));
        __CLR4_5_21nk1nklvicnzbp.R.inc(2148);OBOFormatWriter.sortTermClauses(clauses);
        __CLR4_5_21nk1nklvicnzbp.R.inc(2149);assertEquals("Y:1", clauses.get(0).getValue());
        __CLR4_5_21nk1nklvicnzbp.R.inc(2150);assertEquals("R:1", clauses.get(1).getValue());
        __CLR4_5_21nk1nklvicnzbp.R.inc(2151);assertEquals("Z:1", clauses.get(1).getValue2());
    }finally{__CLR4_5_21nk1nklvicnzbp.R.flushNeeded();}}

    /**
     * Test for sorting clauses according to alphabetical case-insensitive
     * order. Prefer upper-case over lower case for equal strings. Prefer
     * shorter strings over longer strings.
     */
    @Test
    public void testSortTermClausesSynonyms() {__CLR4_5_21nk1nklvicnzbp.R.globalSliceStart(getClass().getName(),2152);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ublup31ns();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21nk1nklvicnzbp.R.rethrow($CLV_t2$);}finally{__CLR4_5_21nk1nklvicnzbp.R.globalSliceEnd(getClass().getName(),"org.obolibrary.oboformat.writer.OBOFormatWriterTest.testSortTermClausesSynonyms",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2152,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ublup31ns(){try{__CLR4_5_21nk1nklvicnzbp.R.inc(2152);
        __CLR4_5_21nk1nklvicnzbp.R.inc(2153);List<Clause> clauses = createSynonymClauses("cc", "ccc", "AAA", "aaa",
                "bbbb");
        __CLR4_5_21nk1nklvicnzbp.R.inc(2154);OBOFormatWriter.sortTermClauses(clauses);
        __CLR4_5_21nk1nklvicnzbp.R.inc(2155);assertEquals("AAA", clauses.get(0).getValue());
        __CLR4_5_21nk1nklvicnzbp.R.inc(2156);assertEquals("aaa", clauses.get(1).getValue());
        __CLR4_5_21nk1nklvicnzbp.R.inc(2157);assertEquals("bbbb", clauses.get(2).getValue());
        __CLR4_5_21nk1nklvicnzbp.R.inc(2158);assertEquals("cc", clauses.get(3).getValue());
        __CLR4_5_21nk1nklvicnzbp.R.inc(2159);assertEquals("ccc", clauses.get(4).getValue());
    }finally{__CLR4_5_21nk1nklvicnzbp.R.flushNeeded();}}

    @Nonnull
    private static List<Clause> createSynonymClauses(@Nonnull String... labels) {try{__CLR4_5_21nk1nklvicnzbp.R.inc(2160);
        __CLR4_5_21nk1nklvicnzbp.R.inc(2161);List<Clause> clauses = new ArrayList<>(labels.length);
        __CLR4_5_21nk1nklvicnzbp.R.inc(2162);for (String label : labels) {{
            __CLR4_5_21nk1nklvicnzbp.R.inc(2163);Clause clause = new Clause(OboFormatTag.TAG_SYNONYM, label);
            __CLR4_5_21nk1nklvicnzbp.R.inc(2164);clauses.add(clause);
        }
        }__CLR4_5_21nk1nklvicnzbp.R.inc(2165);return clauses;
    }finally{__CLR4_5_21nk1nklvicnzbp.R.flushNeeded();}}

    @Test
    public void testWriteObsolete() throws Exception {__CLR4_5_21nk1nklvicnzbp.R.globalSliceStart(getClass().getName(),2166);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hssbsd1o6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21nk1nklvicnzbp.R.rethrow($CLV_t2$);}finally{__CLR4_5_21nk1nklvicnzbp.R.globalSliceEnd(getClass().getName(),"org.obolibrary.oboformat.writer.OBOFormatWriterTest.testWriteObsolete",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2166,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hssbsd1o6() throws Exception{try{__CLR4_5_21nk1nklvicnzbp.R.inc(2166);
        __CLR4_5_21nk1nklvicnzbp.R.inc(2167);assertEquals("", writeObsolete(Boolean.FALSE));
        __CLR4_5_21nk1nklvicnzbp.R.inc(2168);assertEquals("", writeObsolete(Boolean.FALSE.toString()));
        __CLR4_5_21nk1nklvicnzbp.R.inc(2169);assertEquals("is_obsolete: true", writeObsolete(Boolean.TRUE));
        __CLR4_5_21nk1nklvicnzbp.R.inc(2170);assertEquals("is_obsolete: true",
                writeObsolete(Boolean.TRUE.toString()));
    }finally{__CLR4_5_21nk1nklvicnzbp.R.flushNeeded();}}

    @Nonnull
    private static String writeObsolete(Object value) throws Exception {try{__CLR4_5_21nk1nklvicnzbp.R.inc(2171);
        __CLR4_5_21nk1nklvicnzbp.R.inc(2172);Clause cl = new Clause(OboFormatTag.TAG_IS_OBSELETE);
        __CLR4_5_21nk1nklvicnzbp.R.inc(2173);cl.addValue(value);
        __CLR4_5_21nk1nklvicnzbp.R.inc(2174);StringWriter out = new StringWriter();
        __CLR4_5_21nk1nklvicnzbp.R.inc(2175);BufferedWriter bufferedWriter = new BufferedWriter(out);
        __CLR4_5_21nk1nklvicnzbp.R.inc(2176);OBOFormatWriter.write(cl, bufferedWriter, null);
        __CLR4_5_21nk1nklvicnzbp.R.inc(2177);bufferedWriter.close();
        __CLR4_5_21nk1nklvicnzbp.R.inc(2178);return out.toString().trim();
    }finally{__CLR4_5_21nk1nklvicnzbp.R.flushNeeded();}}

    /**
     * Test that the OBO format writer only writes one new-line at the end of
     * the file.
     */
    @Test
    public void testWriteEndOfFile() throws Exception {__CLR4_5_21nk1nklvicnzbp.R.globalSliceStart(getClass().getName(),2179);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yiu9k81oj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21nk1nklvicnzbp.R.rethrow($CLV_t2$);}finally{__CLR4_5_21nk1nklvicnzbp.R.globalSliceEnd(getClass().getName(),"org.obolibrary.oboformat.writer.OBOFormatWriterTest.testWriteEndOfFile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2179,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yiu9k81oj() throws Exception{try{__CLR4_5_21nk1nklvicnzbp.R.inc(2179);
        __CLR4_5_21nk1nklvicnzbp.R.inc(2180);OBODoc oboDoc = parseOBOFile("caro.obo");
        __CLR4_5_21nk1nklvicnzbp.R.inc(2181);String oboString = renderOboToString(oboDoc);
        __CLR4_5_21nk1nklvicnzbp.R.inc(2182);int length = oboString.length();
        __CLR4_5_21nk1nklvicnzbp.R.inc(2183);assertTrue(length > 0);
        __CLR4_5_21nk1nklvicnzbp.R.inc(2184);int newLineCount = 0;
        __CLR4_5_21nk1nklvicnzbp.R.inc(2185);for (int i = length - 1; (((i >= 0)&&(__CLR4_5_21nk1nklvicnzbp.R.iget(2186)!=0|true))||(__CLR4_5_21nk1nklvicnzbp.R.iget(2187)==0&false)); i--) {{
            __CLR4_5_21nk1nklvicnzbp.R.inc(2188);char c = oboString.charAt(i);
            __CLR4_5_21nk1nklvicnzbp.R.inc(2189);if ((((Character.isWhitespace(c))&&(__CLR4_5_21nk1nklvicnzbp.R.iget(2190)!=0|true))||(__CLR4_5_21nk1nklvicnzbp.R.iget(2191)==0&false))) {{
                __CLR4_5_21nk1nklvicnzbp.R.inc(2192);if ((((c == '\n')&&(__CLR4_5_21nk1nklvicnzbp.R.iget(2193)!=0|true))||(__CLR4_5_21nk1nklvicnzbp.R.iget(2194)==0&false))) {{
                    __CLR4_5_21nk1nklvicnzbp.R.inc(2195);newLineCount++;
                }
            }} }else {{
                __CLR4_5_21nk1nklvicnzbp.R.inc(2196);break;
            }
        }}
        }__CLR4_5_21nk1nklvicnzbp.R.inc(2197);assertEquals("GO always had an empty newline at the end.", 2,
                newLineCount);
    }finally{__CLR4_5_21nk1nklvicnzbp.R.flushNeeded();}}

    @Test
    public void testWriteOpaqueIdsAsComments() throws Exception {__CLR4_5_21nk1nklvicnzbp.R.globalSliceStart(getClass().getName(),2198);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2g5k6jb1p2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21nk1nklvicnzbp.R.rethrow($CLV_t2$);}finally{__CLR4_5_21nk1nklvicnzbp.R.globalSliceEnd(getClass().getName(),"org.obolibrary.oboformat.writer.OBOFormatWriterTest.testWriteOpaqueIdsAsComments",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2198,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2g5k6jb1p2() throws Exception{try{__CLR4_5_21nk1nklvicnzbp.R.inc(2198);
        __CLR4_5_21nk1nklvicnzbp.R.inc(2199);OBODoc oboDoc = parseOBOFile("opaque_ids_test.obo");
        __CLR4_5_21nk1nklvicnzbp.R.inc(2200);String oboString = renderOboToString(oboDoc);
        __CLR4_5_21nk1nklvicnzbp.R.inc(2201);String[] lines = oboString.split("\n");
        __CLR4_5_21nk1nklvicnzbp.R.inc(2202);boolean ok = false;
        __CLR4_5_21nk1nklvicnzbp.R.inc(2203);for (String line : lines) {{
            // System.out.println("LINE: "+line);
            __CLR4_5_21nk1nklvicnzbp.R.inc(2204);if ((((line.startsWith("relationship:"))&&(__CLR4_5_21nk1nklvicnzbp.R.iget(2205)!=0|true))||(__CLR4_5_21nk1nklvicnzbp.R.iget(2206)==0&false))) {{
                __CLR4_5_21nk1nklvicnzbp.R.inc(2207);if ((((line.contains("named relation y1"))&&(__CLR4_5_21nk1nklvicnzbp.R.iget(2208)!=0|true))||(__CLR4_5_21nk1nklvicnzbp.R.iget(2209)==0&false))) {{
                    __CLR4_5_21nk1nklvicnzbp.R.inc(2210);ok = true;
                }
            }}
        }}
        }__CLR4_5_21nk1nklvicnzbp.R.inc(2211);assertTrue(ok);
    }finally{__CLR4_5_21nk1nklvicnzbp.R.flushNeeded();}}

    @Test
    public void testPropertyValueOrder() throws Exception {__CLR4_5_21nk1nklvicnzbp.R.globalSliceStart(getClass().getName(),2212);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yxc16d1pg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21nk1nklvicnzbp.R.rethrow($CLV_t2$);}finally{__CLR4_5_21nk1nklvicnzbp.R.globalSliceEnd(getClass().getName(),"org.obolibrary.oboformat.writer.OBOFormatWriterTest.testPropertyValueOrder",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2212,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yxc16d1pg() throws Exception{try{__CLR4_5_21nk1nklvicnzbp.R.inc(2212);
        __CLR4_5_21nk1nklvicnzbp.R.inc(2213);BufferedReader reader = new BufferedReader(new InputStreamReader(
                getInputStream("tag_order_test.obo")));
        __CLR4_5_21nk1nklvicnzbp.R.inc(2214);StringBuilder sb = new StringBuilder();
        __CLR4_5_21nk1nklvicnzbp.R.inc(2215);String line;
        __CLR4_5_21nk1nklvicnzbp.R.inc(2216);while ((line = reader.readLine()) != null) {{
            __CLR4_5_21nk1nklvicnzbp.R.inc(2219);sb.append(line);
            __CLR4_5_21nk1nklvicnzbp.R.inc(2220);sb.append('\n');
        }
        }__CLR4_5_21nk1nklvicnzbp.R.inc(2221);reader.close();
        __CLR4_5_21nk1nklvicnzbp.R.inc(2222);String input = sb.toString();
        __CLR4_5_21nk1nklvicnzbp.R.inc(2223);OBODoc obodoc = parseOboToString(input);
        __CLR4_5_21nk1nklvicnzbp.R.inc(2224);String written = renderOboToString(obodoc);
        __CLR4_5_21nk1nklvicnzbp.R.inc(2225);assertEquals(input, written);
    }finally{__CLR4_5_21nk1nklvicnzbp.R.flushNeeded();}}
}
