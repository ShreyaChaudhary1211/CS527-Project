/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.semanticweb.owlapi.io;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.IOException;

import org.junit.Test;

/**
 * Created by ses on 3/12/15.
 */
@SuppressWarnings("javadoc")
public class XZStreamDocumentSourceTest {static class __CLR4_5_2cg9cg9lvicktz4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0061\u0070\u0069\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237216579L,8589935092L,16156,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testReadKoalaDoc() throws IOException {__CLR4_5_2cg9cg9lvicktz4.R.globalSliceStart(getClass().getName(),16137);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2g9oe1hcg9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2cg9cg9lvicktz4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2cg9cg9lvicktz4.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.io.XZStreamDocumentSourceTest.testReadKoalaDoc",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16137,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2g9oe1hcg9() throws IOException{try{__CLR4_5_2cg9cg9lvicktz4.R.inc(16137);
        __CLR4_5_2cg9cg9lvicktz4.R.inc(16138);XZStreamDocumentSource source = new XZStreamDocumentSource(
                getClass().getResourceAsStream("/koala.owl.xz"));

        __CLR4_5_2cg9cg9lvicktz4.R.inc(16139);assertTrue("input stream available",source.isInputStreamAvailable());
        __CLR4_5_2cg9cg9lvicktz4.R.inc(16140);assertTrue("input reader available",source.isReaderAvailable());
        __CLR4_5_2cg9cg9lvicktz4.R.inc(16141);BufferedReader in = new BufferedReader(source.getReader());

        __CLR4_5_2cg9cg9lvicktz4.R.inc(16142);int lineCount=0;
        __CLR4_5_2cg9cg9lvicktz4.R.inc(16143);int koalaCount=0;
        __CLR4_5_2cg9cg9lvicktz4.R.inc(16144);String line=null;
        __CLR4_5_2cg9cg9lvicktz4.R.inc(16145);while((line = in.readLine())!= null) {{
            __CLR4_5_2cg9cg9lvicktz4.R.inc(16148);lineCount++;
            __CLR4_5_2cg9cg9lvicktz4.R.inc(16149);if((((line.contains("Koala"))&&(__CLR4_5_2cg9cg9lvicktz4.R.iget(16150)!=0|true))||(__CLR4_5_2cg9cg9lvicktz4.R.iget(16151)==0&false))) {{
                __CLR4_5_2cg9cg9lvicktz4.R.inc(16152);koalaCount++;
            }
        }}
        }__CLR4_5_2cg9cg9lvicktz4.R.inc(16153);assertEquals("should have 3 Koalas",3,koalaCount);
        __CLR4_5_2cg9cg9lvicktz4.R.inc(16154);assertEquals("should have 250 lines",250,lineCount);
        __CLR4_5_2cg9cg9lvicktz4.R.inc(16155);in.close();
    }finally{__CLR4_5_2cg9cg9lvicktz4.R.flushNeeded();}}
}
