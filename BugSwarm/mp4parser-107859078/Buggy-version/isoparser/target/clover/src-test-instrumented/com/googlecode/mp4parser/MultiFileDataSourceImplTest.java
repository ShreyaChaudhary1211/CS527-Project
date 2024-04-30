/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.googlecode.mp4parser;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.Channels;

public class MultiFileDataSourceImplTest {static class __CLR4_5_2i7yi7ylvl9emet{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413286414L,8589935092L,23646,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    File a;
    File b;
    File c;

    @Before
    public void setUp() throws Exception {try{__CLR4_5_2i7yi7ylvl9emet.R.inc(23614);
        __CLR4_5_2i7yi7ylvl9emet.R.inc(23615);a = File.createTempFile("MultiFileDataSourceImplTest", "aaa");
        __CLR4_5_2i7yi7ylvl9emet.R.inc(23616);write(a, "aaaaaaaaaa");
        __CLR4_5_2i7yi7ylvl9emet.R.inc(23617);b = File.createTempFile("MultiFileDataSourceImplTest", "bbb");
        __CLR4_5_2i7yi7ylvl9emet.R.inc(23618);write(b, "bbbbbbbbbb");
        __CLR4_5_2i7yi7ylvl9emet.R.inc(23619);c = File.createTempFile("MultiFileDataSourceImplTest", "ccc");
        __CLR4_5_2i7yi7ylvl9emet.R.inc(23620);write(c, "cccccccccc");
    }finally{__CLR4_5_2i7yi7ylvl9emet.R.flushNeeded();}}

    @Test
    public void testWithIn() throws Exception {__CLR4_5_2i7yi7ylvl9emet.R.globalSliceStart(getClass().getName(),23621);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dqhxesi85();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2i7yi7ylvl9emet.R.rethrow($CLV_t2$);}finally{__CLR4_5_2i7yi7ylvl9emet.R.globalSliceEnd(getClass().getName(),"com.googlecode.mp4parser.MultiFileDataSourceImplTest.testWithIn",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23621,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dqhxesi85() throws Exception{try{__CLR4_5_2i7yi7ylvl9emet.R.inc(23621);
        __CLR4_5_2i7yi7ylvl9emet.R.inc(23622);DataSource ds = new MultiFileDataSourceImpl(a, b, c);
        __CLR4_5_2i7yi7ylvl9emet.R.inc(23623);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_5_2i7yi7ylvl9emet.R.inc(23624);Assert.assertEquals("a", check(ds, 0, 1));
        __CLR4_5_2i7yi7ylvl9emet.R.inc(23625);Assert.assertEquals("aa", check(ds, 0, 2));
        __CLR4_5_2i7yi7ylvl9emet.R.inc(23626);Assert.assertEquals("a", check(ds, 1, 1));
        __CLR4_5_2i7yi7ylvl9emet.R.inc(23627);Assert.assertEquals("aa", check(ds, 1, 2));
        __CLR4_5_2i7yi7ylvl9emet.R.inc(23628);Assert.assertEquals("aaaaaaaaaa", check(ds, 0, 10));
        __CLR4_5_2i7yi7ylvl9emet.R.inc(23629);Assert.assertEquals("aaaaaaaaaab", check(ds, 0, 11));
        __CLR4_5_2i7yi7ylvl9emet.R.inc(23630);Assert.assertEquals("aaaaaaab", check(ds, 3, 8));
        __CLR4_5_2i7yi7ylvl9emet.R.inc(23631);Assert.assertEquals("aaaaabbbbbbbbbbccccc", check(ds, 5, 20));
    }finally{__CLR4_5_2i7yi7ylvl9emet.R.flushNeeded();}}

    public String check(DataSource ds, int a, int b) throws IOException {try{__CLR4_5_2i7yi7ylvl9emet.R.inc(23632);
        __CLR4_5_2i7yi7ylvl9emet.R.inc(23633);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_5_2i7yi7ylvl9emet.R.inc(23634);ds.transferTo(a, b, Channels.newChannel(baos));
        __CLR4_5_2i7yi7ylvl9emet.R.inc(23635);String result =  new String(baos.toByteArray());
        __CLR4_5_2i7yi7ylvl9emet.R.inc(23636);System.err.println(result);
        __CLR4_5_2i7yi7ylvl9emet.R.inc(23637);return result;
    }finally{__CLR4_5_2i7yi7ylvl9emet.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_5_2i7yi7ylvl9emet.R.inc(23638);
        __CLR4_5_2i7yi7ylvl9emet.R.inc(23639);a.deleteOnExit();
        __CLR4_5_2i7yi7ylvl9emet.R.inc(23640);b.deleteOnExit();
        __CLR4_5_2i7yi7ylvl9emet.R.inc(23641);c.deleteOnExit();
    }finally{__CLR4_5_2i7yi7ylvl9emet.R.flushNeeded();}}

    private void write(File f, String text) throws IOException {try{__CLR4_5_2i7yi7ylvl9emet.R.inc(23642);
        __CLR4_5_2i7yi7ylvl9emet.R.inc(23643);FileOutputStream fos = new FileOutputStream(f);
        __CLR4_5_2i7yi7ylvl9emet.R.inc(23644);fos.write(text.getBytes());
        __CLR4_5_2i7yi7ylvl9emet.R.inc(23645);fos.close();
    }finally{__CLR4_5_2i7yi7ylvl9emet.R.flushNeeded();}}
}