/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.semanticweb.owlapi.functional.parser;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;

import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("javadoc")
public class CustomTokenizerTest {static class __CLR4_5_2vn3vn3lvicmebv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237289938L,8589935092L,41062,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    static final Logger logger = LoggerFactory.getLogger(CustomTokenizer.class);

    @Test
    public void testParseStringLiteral() {__CLR4_5_2vn3vn3lvicmebv.R.globalSliceStart(getClass().getName(),41007);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26y1z98vn3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2vn3vn3lvicmebv.R.rethrow($CLV_t2$);}finally{__CLR4_5_2vn3vn3lvicmebv.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.functional.parser.CustomTokenizerTest.testParseStringLiteral",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),41007,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26y1z98vn3(){try{__CLR4_5_2vn3vn3lvicmebv.R.inc(41007);
        __CLR4_5_2vn3vn3lvicmebv.R.inc(41008);validateTokenizationOfString("\"hello world\"");
        __CLR4_5_2vn3vn3lvicmebv.R.inc(41009);validateTokenizationOfString("\"hello \\\" world \"");
        __CLR4_5_2vn3vn3lvicmebv.R.inc(41010);validateTokenizationOfString("\"hello \\\\ world\"");
        __CLR4_5_2vn3vn3lvicmebv.R.inc(41011);validateTokenizationOfString("\"hello\\\\\"" + "\"world\"");
    }finally{__CLR4_5_2vn3vn3lvicmebv.R.flushNeeded();}}

    @Test
    public void testParseFullURI() {__CLR4_5_2vn3vn3lvicmebv.R.globalSliceStart(getClass().getName(),41012);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s6tye5vn8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2vn3vn3lvicmebv.R.rethrow($CLV_t2$);}finally{__CLR4_5_2vn3vn3lvicmebv.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.functional.parser.CustomTokenizerTest.testParseFullURI",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),41012,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s6tye5vn8(){try{__CLR4_5_2vn3vn3lvicmebv.R.inc(41012);
        // Good
        __CLR4_5_2vn3vn3lvicmebv.R.inc(41013);validateTokenizationOfString("<http://www.unc.edu/onto#foo>");
        // Bad
        __CLR4_5_2vn3vn3lvicmebv.R.inc(41014);validateTokenizationOfString("<http://www.unc.edu/onto#foo");
    }finally{__CLR4_5_2vn3vn3lvicmebv.R.flushNeeded();}}

    @Ignore
    @Test
    public void testTokenizeGeneOntology() throws Exception {__CLR4_5_2vn3vn3lvicmebv.R.globalSliceStart(getClass().getName(),41015);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_282pwzsvnb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2vn3vn3lvicmebv.R.rethrow($CLV_t2$);}finally{__CLR4_5_2vn3vn3lvicmebv.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.functional.parser.CustomTokenizerTest.testTokenizeGeneOntology",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),41015,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_282pwzsvnb() throws Exception{try{__CLR4_5_2vn3vn3lvicmebv.R.inc(41015);
        __CLR4_5_2vn3vn3lvicmebv.R.inc(41016);String fileName = "/Users/ses/ontologies/GO/go.ofn";
        __CLR4_5_2vn3vn3lvicmebv.R.inc(41017);Reader in = new BufferedReader(new FileReader(fileName));
        __CLR4_5_2vn3vn3lvicmebv.R.inc(41018);Reader in2 = new BufferedReader(new FileReader(fileName));
        __CLR4_5_2vn3vn3lvicmebv.R.inc(41019);validateTokenization(in, in2);
    }finally{__CLR4_5_2vn3vn3lvicmebv.R.flushNeeded();}}

    private static void validateTokenizationOfString(String text) {try{__CLR4_5_2vn3vn3lvicmebv.R.inc(41020);
        class __CLR4_5_2$AC0 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_5_2vn3vn3lvicmebv.R.inc(41021);try (__CLR4_5_2$AC0 __CLR$ACI0=new __CLR4_5_2$AC0(){{__CLR4_5_2vn3vn3lvicmebv.R.inc(41022);}};StringReader reader1 = new StringReader(text);
                __CLR4_5_2$AC0 __CLR$ACI1=new __CLR4_5_2$AC0(){{__CLR4_5_2vn3vn3lvicmebv.R.inc(41023);}};StringReader reader2 = new StringReader(text);) {
            __CLR4_5_2vn3vn3lvicmebv.R.inc(41024);validateTokenization(reader1, reader2);
        }
    }finally{__CLR4_5_2vn3vn3lvicmebv.R.flushNeeded();}}

    void validateTokenizationOfResource(String resourceName) throws IOException {try{__CLR4_5_2vn3vn3lvicmebv.R.inc(41025);
        class __CLR4_5_2$AC1 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_5_2vn3vn3lvicmebv.R.inc(41026);try (__CLR4_5_2$AC1 __CLR$ACI2=new __CLR4_5_2$AC1(){{__CLR4_5_2vn3vn3lvicmebv.R.inc(41027);}};Reader reader1 = new InputStreamReader(getClass()
                .getResourceAsStream(resourceName));
                __CLR4_5_2$AC1 __CLR$ACI3=new __CLR4_5_2$AC1(){{__CLR4_5_2vn3vn3lvicmebv.R.inc(41028);}};Reader reader2 = new InputStreamReader(getClass()
                        .getResourceAsStream(resourceName))) {
            __CLR4_5_2vn3vn3lvicmebv.R.inc(41029);validateTokenization(reader1, reader2);
        }
    }finally{__CLR4_5_2vn3vn3lvicmebv.R.flushNeeded();}}

    private static void validateTokenization(Reader reader1, Reader reader2) {try{__CLR4_5_2vn3vn3lvicmebv.R.inc(41030);
        __CLR4_5_2vn3vn3lvicmebv.R.inc(41031);CustomTokenizer customTokenizer = createCustomTokenizer(reader1);
        __CLR4_5_2vn3vn3lvicmebv.R.inc(41032);OWLFunctionalSyntaxParserTokenManager tokenManager = createTokenManager(reader2);
        __CLR4_5_2vn3vn3lvicmebv.R.inc(41033);while (true) {{
            __CLR4_5_2vn3vn3lvicmebv.R.inc(41034);Token customToken = customTokenizer.getNextToken();
            __CLR4_5_2vn3vn3lvicmebv.R.inc(41035);Token generatedToken = tokenManager.getNextToken();
            __CLR4_5_2vn3vn3lvicmebv.R.inc(41036);assertTokensMatch(generatedToken, customToken);
            // If the end of file occurs in the middle of a token, the existing
            // lexical grammar creates an error token,
            // then keeps going. None of the production rules match the error,
            // so this will quickly lead to a parse
            // exception when called from the generated parser; the tokenizer
            // just keeps on chugging, as it doesn't
            // know that the error is a lexical error.
            // With the newest versions of JavaCC, tokenization errors are
            // treated as exceptions, rather than can't
            // happen errors, however the generated code doesn't compile with a
            // custom lexer.
            __CLR4_5_2vn3vn3lvicmebv.R.inc(41037);if ((((generatedToken.kind == OWLFunctionalSyntaxParserConstants.EOF
                    || generatedToken.kind == OWLFunctionalSyntaxParserConstants.ERROR)&&(__CLR4_5_2vn3vn3lvicmebv.R.iget(41038)!=0|true))||(__CLR4_5_2vn3vn3lvicmebv.R.iget(41039)==0&false))) {{
                __CLR4_5_2vn3vn3lvicmebv.R.inc(41040);return;
            }
        }}
    }}finally{__CLR4_5_2vn3vn3lvicmebv.R.flushNeeded();}}

    static CustomTokenizer createCustomTokenizer(String s) {try{__CLR4_5_2vn3vn3lvicmebv.R.inc(41041);
        __CLR4_5_2vn3vn3lvicmebv.R.inc(41042);StringReader reader = new StringReader(s);
        __CLR4_5_2vn3vn3lvicmebv.R.inc(41043);return createCustomTokenizer(reader);
    }finally{__CLR4_5_2vn3vn3lvicmebv.R.flushNeeded();}}

    private static CustomTokenizer createCustomTokenizer(Reader reader) {try{__CLR4_5_2vn3vn3lvicmebv.R.inc(41044);
        __CLR4_5_2vn3vn3lvicmebv.R.inc(41045);return new CustomTokenizer(reader);
    }finally{__CLR4_5_2vn3vn3lvicmebv.R.flushNeeded();}}

    static OWLFunctionalSyntaxParserTokenManager createTokenManager(String s) {try{__CLR4_5_2vn3vn3lvicmebv.R.inc(41046);
        __CLR4_5_2vn3vn3lvicmebv.R.inc(41047);StringReader reader = new StringReader(s);
        __CLR4_5_2vn3vn3lvicmebv.R.inc(41048);return createTokenManager(reader);
    }finally{__CLR4_5_2vn3vn3lvicmebv.R.flushNeeded();}}

    private static OWLFunctionalSyntaxParserTokenManager createTokenManager(
            Reader reader) {try{__CLR4_5_2vn3vn3lvicmebv.R.inc(41049);
        __CLR4_5_2vn3vn3lvicmebv.R.inc(41050);return new OWLFunctionalSyntaxParserTokenManager(new SimpleCharStream(
                reader));
    }finally{__CLR4_5_2vn3vn3lvicmebv.R.flushNeeded();}}

    private static void assertTokensMatch(Token expected, Token actual) {try{__CLR4_5_2vn3vn3lvicmebv.R.inc(41051);
        __CLR4_5_2vn3vn3lvicmebv.R.inc(41052);try {
            __CLR4_5_2vn3vn3lvicmebv.R.inc(41053);assertNotNull(expected);
            __CLR4_5_2vn3vn3lvicmebv.R.inc(41054);assertNotNull(actual);
            __CLR4_5_2vn3vn3lvicmebv.R.inc(41055);assertEquals(expected.kind, actual.kind);
            __CLR4_5_2vn3vn3lvicmebv.R.inc(41056);assertEquals(expected.image, actual.image);
            __CLR4_5_2vn3vn3lvicmebv.R.inc(41057);assertEquals(expected.getValue(), actual.getValue());
        } catch (AssertionError e) {
            __CLR4_5_2vn3vn3lvicmebv.R.inc(41058);String expected1 = OWLFunctionalSyntaxParserConstants.tokenImage[expected.kind];
            __CLR4_5_2vn3vn3lvicmebv.R.inc(41059);String actual1 = OWLFunctionalSyntaxParserConstants.tokenImage[actual.kind];
            __CLR4_5_2vn3vn3lvicmebv.R.inc(41060);logger.error("token match fail: expected " + expected1
                    + ", actual " + actual1);
            __CLR4_5_2vn3vn3lvicmebv.R.inc(41061);throw e;
        }
    }finally{__CLR4_5_2vn3vn3lvicmebv.R.flushNeeded();}}
}
