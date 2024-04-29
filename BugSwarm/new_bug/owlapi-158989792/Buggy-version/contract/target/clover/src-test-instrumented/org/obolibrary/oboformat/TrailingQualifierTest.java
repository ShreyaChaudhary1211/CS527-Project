/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.obolibrary.oboformat;

import static org.junit.Assert.*;

import java.util.Collection;

import javax.annotation.Nonnull;

import org.junit.Test;
import org.obolibrary.obo2owl.OboFormatTestBasics;
import org.obolibrary.obo2owl.RoundTripPropertyValueTest;
import org.obolibrary.oboformat.model.Clause;
import org.obolibrary.oboformat.model.Frame;
import org.obolibrary.oboformat.model.OBODoc;
import org.obolibrary.oboformat.model.QualifierValue;
import org.obolibrary.oboformat.parser.OBOFormatConstants.OboFormatTag;

/**
 * Comprehensive test for all tags, which support trailing qualifiers.
 * 
 * @see RoundTripPropertyValueTest for basic tests.
 */
@SuppressWarnings("javadoc")
public class TrailingQualifierTest extends OboFormatTestBasics {static class __CLR4_5_21j81j8lvicnzbb{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,2095,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testReadTrailingQualifiers() throws Exception {__CLR4_5_21j81j8lvicnzbb.R.globalSliceStart(getClass().getName(),1988);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ujg6k1j8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21j81j8lvicnzbb.R.rethrow($CLV_t2$);}finally{__CLR4_5_21j81j8lvicnzbb.R.globalSliceEnd(getClass().getName(),"org.obolibrary.oboformat.TrailingQualifierTest.testReadTrailingQualifiers",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1988,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ujg6k1j8() throws Exception{try{__CLR4_5_21j81j8lvicnzbb.R.inc(1988);
        // load test file with trailing qualifiers
        __CLR4_5_21j81j8lvicnzbb.R.inc(1989);OBODoc doc = parseOBOFile("trailing_qualifier.obo");
        __CLR4_5_21j81j8lvicnzbb.R.inc(1990);checkAllTrailingQualifiers(doc);
        // write to OBO
        __CLR4_5_21j81j8lvicnzbb.R.inc(1991);String oboString = renderOboToString(doc);
        // parse written OBO
        __CLR4_5_21j81j8lvicnzbb.R.inc(1992);OBODoc doc2 = parseOboToString(oboString);
        __CLR4_5_21j81j8lvicnzbb.R.inc(1993);checkAllTrailingQualifiers(doc2);
    }finally{__CLR4_5_21j81j8lvicnzbb.R.flushNeeded();}}

    private void checkAllTrailingQualifiers(@Nonnull OBODoc doc) {try{__CLR4_5_21j81j8lvicnzbb.R.inc(1994);
        __CLR4_5_21j81j8lvicnzbb.R.inc(1995);Frame headerFrame = doc.getHeaderFrame();
        assert (((headerFrame != null)&&(__CLR4_5_21j81j8lvicnzbb.R.iget(1996)!=0|true))||(__CLR4_5_21j81j8lvicnzbb.R.iget(1997)==0&false));
        __CLR4_5_21j81j8lvicnzbb.R.inc(1998);hasQualifierClause(headerFrame, OboFormatTag.TAG_AUTO_GENERATED_BY);
        __CLR4_5_21j81j8lvicnzbb.R.inc(1999);hasQualifierClause(headerFrame, OboFormatTag.TAG_SUBSETDEF);
        __CLR4_5_21j81j8lvicnzbb.R.inc(2000);hasQualifierClause(headerFrame, OboFormatTag.TAG_SYNONYMTYPEDEF);
        __CLR4_5_21j81j8lvicnzbb.R.inc(2001);hasQualifierClause(headerFrame, OboFormatTag.TAG_DEFAULT_NAMESPACE);
        __CLR4_5_21j81j8lvicnzbb.R.inc(2002);hasQualifierClause(headerFrame, OboFormatTag.TAG_IDSPACE);
        __CLR4_5_21j81j8lvicnzbb.R.inc(2003);hasQualifierClauses(headerFrame, OboFormatTag.TAG_PROPERTY_VALUE);
        __CLR4_5_21j81j8lvicnzbb.R.inc(2004);Frame frame = doc.getTermFrame("TEST:0001");
        assert (((frame != null)&&(__CLR4_5_21j81j8lvicnzbb.R.iget(2005)!=0|true))||(__CLR4_5_21j81j8lvicnzbb.R.iget(2006)==0&false));
        __CLR4_5_21j81j8lvicnzbb.R.inc(2007);hasQualifierClause(frame, OboFormatTag.TAG_NAME);
        __CLR4_5_21j81j8lvicnzbb.R.inc(2008);hasQualifierClause(frame, OboFormatTag.TAG_NAMESPACE);
        __CLR4_5_21j81j8lvicnzbb.R.inc(2009);hasQualifierClause(frame, OboFormatTag.TAG_ALT_ID);
        __CLR4_5_21j81j8lvicnzbb.R.inc(2010);hasQualifierClause(frame, OboFormatTag.TAG_DEF);
        __CLR4_5_21j81j8lvicnzbb.R.inc(2011);hasQualifierClause(frame, OboFormatTag.TAG_COMMENT);
        __CLR4_5_21j81j8lvicnzbb.R.inc(2012);hasQualifierClause(frame, OboFormatTag.TAG_SUBSET);
        __CLR4_5_21j81j8lvicnzbb.R.inc(2013);hasQualifierClause(frame, OboFormatTag.TAG_SYNONYM);
        __CLR4_5_21j81j8lvicnzbb.R.inc(2014);hasQualifierClause(frame, OboFormatTag.TAG_XREF);
        __CLR4_5_21j81j8lvicnzbb.R.inc(2015);hasQualifierClause(frame, OboFormatTag.TAG_BUILTIN);
        __CLR4_5_21j81j8lvicnzbb.R.inc(2016);hasQualifierClauses(frame, OboFormatTag.TAG_PROPERTY_VALUE);
        __CLR4_5_21j81j8lvicnzbb.R.inc(2017);hasQualifierClause(frame, OboFormatTag.TAG_IS_A);
        __CLR4_5_21j81j8lvicnzbb.R.inc(2018);hasQualifierClauses(frame, OboFormatTag.TAG_INTERSECTION_OF);
        __CLR4_5_21j81j8lvicnzbb.R.inc(2019);hasQualifierClauses(frame, OboFormatTag.TAG_UNION_OF);
        __CLR4_5_21j81j8lvicnzbb.R.inc(2020);hasQualifierClause(frame, OboFormatTag.TAG_EQUIVALENT_TO);
        __CLR4_5_21j81j8lvicnzbb.R.inc(2021);hasQualifierClause(frame, OboFormatTag.TAG_DISJOINT_FROM);
        __CLR4_5_21j81j8lvicnzbb.R.inc(2022);hasQualifierClause(frame, OboFormatTag.TAG_RELATIONSHIP);
        __CLR4_5_21j81j8lvicnzbb.R.inc(2023);hasQualifierClause(frame, OboFormatTag.TAG_CREATED_BY);
        __CLR4_5_21j81j8lvicnzbb.R.inc(2024);frame = doc.getTermFrame("TEST:0008");
        assert (((frame != null)&&(__CLR4_5_21j81j8lvicnzbb.R.iget(2025)!=0|true))||(__CLR4_5_21j81j8lvicnzbb.R.iget(2026)==0&false));
        __CLR4_5_21j81j8lvicnzbb.R.inc(2027);hasQualifierClause(frame, OboFormatTag.TAG_IS_OBSELETE);
        __CLR4_5_21j81j8lvicnzbb.R.inc(2028);hasQualifierClause(frame, OboFormatTag.TAG_REPLACED_BY);
        __CLR4_5_21j81j8lvicnzbb.R.inc(2029);frame = doc.getTermFrame("TEST:0009");
        assert (((frame != null)&&(__CLR4_5_21j81j8lvicnzbb.R.iget(2030)!=0|true))||(__CLR4_5_21j81j8lvicnzbb.R.iget(2031)==0&false));
        __CLR4_5_21j81j8lvicnzbb.R.inc(2032);hasQualifierClause(frame, OboFormatTag.TAG_IS_OBSELETE);
        __CLR4_5_21j81j8lvicnzbb.R.inc(2033);hasQualifierClause(frame, OboFormatTag.TAG_CONSIDER);
        __CLR4_5_21j81j8lvicnzbb.R.inc(2034);frame = doc.getTypedefFrame("TEST_REL:0001");
        assert (((frame != null)&&(__CLR4_5_21j81j8lvicnzbb.R.iget(2035)!=0|true))||(__CLR4_5_21j81j8lvicnzbb.R.iget(2036)==0&false));
        __CLR4_5_21j81j8lvicnzbb.R.inc(2037);hasQualifierClause(frame, OboFormatTag.TAG_DOMAIN);
        __CLR4_5_21j81j8lvicnzbb.R.inc(2038);hasQualifierClause(frame, OboFormatTag.TAG_RANGE);
        __CLR4_5_21j81j8lvicnzbb.R.inc(2039);hasQualifierClause(frame, OboFormatTag.TAG_IS_ANTI_SYMMETRIC);
        __CLR4_5_21j81j8lvicnzbb.R.inc(2040);hasQualifierClause(frame, OboFormatTag.TAG_IS_CYCLIC);
        __CLR4_5_21j81j8lvicnzbb.R.inc(2041);hasQualifierClause(frame, OboFormatTag.TAG_IS_REFLEXIVE);
        __CLR4_5_21j81j8lvicnzbb.R.inc(2042);hasQualifierClause(frame, OboFormatTag.TAG_IS_SYMMETRIC);
        __CLR4_5_21j81j8lvicnzbb.R.inc(2043);hasQualifierClause(frame, OboFormatTag.TAG_IS_TRANSITIVE);
        __CLR4_5_21j81j8lvicnzbb.R.inc(2044);hasQualifierClause(frame, OboFormatTag.TAG_INVERSE_OF);
        __CLR4_5_21j81j8lvicnzbb.R.inc(2045);hasQualifierClause(frame, OboFormatTag.TAG_TRANSITIVE_OVER);
        __CLR4_5_21j81j8lvicnzbb.R.inc(2046);hasQualifierClause(frame, OboFormatTag.TAG_HOLDS_OVER_CHAIN);
        __CLR4_5_21j81j8lvicnzbb.R.inc(2047);hasQualifierClause(frame, OboFormatTag.TAG_IS_CLASS_LEVEL_TAG);
        __CLR4_5_21j81j8lvicnzbb.R.inc(2048);frame = doc.getTypedefFrame("TEST_REL:0006");
        assert (((frame != null)&&(__CLR4_5_21j81j8lvicnzbb.R.iget(2049)!=0|true))||(__CLR4_5_21j81j8lvicnzbb.R.iget(2050)==0&false));
        __CLR4_5_21j81j8lvicnzbb.R.inc(2051);hasQualifierClause(frame, OboFormatTag.TAG_EQUIVALENT_TO_CHAIN);
        __CLR4_5_21j81j8lvicnzbb.R.inc(2052);frame = doc.getTypedefFrame("TEST_REL:0007");
        assert (((frame != null)&&(__CLR4_5_21j81j8lvicnzbb.R.iget(2053)!=0|true))||(__CLR4_5_21j81j8lvicnzbb.R.iget(2054)==0&false));
        __CLR4_5_21j81j8lvicnzbb.R.inc(2055);hasQualifierClause(frame, OboFormatTag.TAG_IS_INVERSE_FUNCTIONAL);
        __CLR4_5_21j81j8lvicnzbb.R.inc(2056);frame = doc.getTypedefFrame("TEST_REL:0008");
        assert (((frame != null)&&(__CLR4_5_21j81j8lvicnzbb.R.iget(2057)!=0|true))||(__CLR4_5_21j81j8lvicnzbb.R.iget(2058)==0&false));
        __CLR4_5_21j81j8lvicnzbb.R.inc(2059);hasQualifierClause(frame, OboFormatTag.TAG_IS_FUNCTIONAL);
        __CLR4_5_21j81j8lvicnzbb.R.inc(2060);frame = doc.getTypedefFrame("TEST_REL:0009");
        assert (((frame != null)&&(__CLR4_5_21j81j8lvicnzbb.R.iget(2061)!=0|true))||(__CLR4_5_21j81j8lvicnzbb.R.iget(2062)==0&false));
        __CLR4_5_21j81j8lvicnzbb.R.inc(2063);hasQualifierClause(frame, OboFormatTag.TAG_IS_METADATA_TAG);
    }finally{__CLR4_5_21j81j8lvicnzbb.R.flushNeeded();}}

    void hasQualifierClause(@Nonnull Frame frame, @Nonnull OboFormatTag tag) {try{__CLR4_5_21j81j8lvicnzbb.R.inc(2064);
        __CLR4_5_21j81j8lvicnzbb.R.inc(2065);Clause clause = frame.getClause(tag);
        __CLR4_5_21j81j8lvicnzbb.R.inc(2066);assertNotNull("Expected a clause " + tag.getTag() + " in frame: "
                + frame, clause);
        __CLR4_5_21j81j8lvicnzbb.R.inc(2067);hasQualifier(clause);
    }finally{__CLR4_5_21j81j8lvicnzbb.R.flushNeeded();}}

    void hasQualifierClauses(@Nonnull Frame frame, @Nonnull OboFormatTag tag) {try{__CLR4_5_21j81j8lvicnzbb.R.inc(2068);
        __CLR4_5_21j81j8lvicnzbb.R.inc(2069);Collection<Clause> clauses = frame.getClauses(tag);
        __CLR4_5_21j81j8lvicnzbb.R.inc(2070);String message = "Expected clauses " + tag.getTag() + " in frame: "
                + frame;
        __CLR4_5_21j81j8lvicnzbb.R.inc(2071);assertNotNull(message, clauses);
        __CLR4_5_21j81j8lvicnzbb.R.inc(2072);assertFalse(message, clauses.isEmpty());
        __CLR4_5_21j81j8lvicnzbb.R.inc(2073);for (Clause clause : clauses) {{
            assert (((clause != null)&&(__CLR4_5_21j81j8lvicnzbb.R.iget(2074)!=0|true))||(__CLR4_5_21j81j8lvicnzbb.R.iget(2075)==0&false));
            __CLR4_5_21j81j8lvicnzbb.R.inc(2076);hasQualifier(clause);
        }
    }}finally{__CLR4_5_21j81j8lvicnzbb.R.flushNeeded();}}

    void hasQualifier(@Nonnull Clause clause) {try{__CLR4_5_21j81j8lvicnzbb.R.inc(2077);
        __CLR4_5_21j81j8lvicnzbb.R.inc(2078);Collection<QualifierValue> qualifierValues = clause
                .getQualifierValues();
        __CLR4_5_21j81j8lvicnzbb.R.inc(2079);assertNotNull(
                "Expected a clause qualifier values in clause: " + clause,
                qualifierValues);
        __CLR4_5_21j81j8lvicnzbb.R.inc(2080);assertFalse("Qualifier values should not be empty in clause:" + clause,
                qualifierValues.isEmpty());
        __CLR4_5_21j81j8lvicnzbb.R.inc(2081);assertTrue("Expected two or more qualifier values",
                qualifierValues.size() >= 2);
        __CLR4_5_21j81j8lvicnzbb.R.inc(2082);boolean foundOne = false;
        __CLR4_5_21j81j8lvicnzbb.R.inc(2083);boolean foundTwo = false;
        // {val1="one",val2="two"}
        __CLR4_5_21j81j8lvicnzbb.R.inc(2084);for (QualifierValue qualifierValue : qualifierValues) {{
            __CLR4_5_21j81j8lvicnzbb.R.inc(2085);if (((("val1".equals(qualifierValue.getQualifier()))&&(__CLR4_5_21j81j8lvicnzbb.R.iget(2086)!=0|true))||(__CLR4_5_21j81j8lvicnzbb.R.iget(2087)==0&false))) {{
                __CLR4_5_21j81j8lvicnzbb.R.inc(2088);foundOne = "one".equals(qualifierValue.getValue());
            } }else {__CLR4_5_21j81j8lvicnzbb.R.inc(2089);if (((("val2".equals(qualifierValue.getQualifier()))&&(__CLR4_5_21j81j8lvicnzbb.R.iget(2090)!=0|true))||(__CLR4_5_21j81j8lvicnzbb.R.iget(2091)==0&false))) {{
                __CLR4_5_21j81j8lvicnzbb.R.inc(2092);foundTwo = "two".equals(qualifierValue.getValue());
            }
        }}}
        }__CLR4_5_21j81j8lvicnzbb.R.inc(2093);assertTrue("Did not find qualifier: val1=\"one\"", foundOne);
        __CLR4_5_21j81j8lvicnzbb.R.inc(2094);assertTrue("Did not find qualifier: val2=\"two\"", foundTwo);
    }finally{__CLR4_5_21j81j8lvicnzbb.R.flushNeeded();}}
}
