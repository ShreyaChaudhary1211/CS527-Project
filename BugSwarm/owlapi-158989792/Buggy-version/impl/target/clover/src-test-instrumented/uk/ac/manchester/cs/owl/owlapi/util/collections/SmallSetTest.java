/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package uk.ac.manchester.cs.owl.owlapi.util.collections;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

@SuppressWarnings("javadoc")
public class SmallSetTest {static class __CLR4_5_2d0md0mlviclhjc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u006d\u0070\u006c\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237246897L,8589935092L,16928,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test(expected = IllegalStateException.class)
    public void testAddRemoveContains() {__CLR4_5_2d0md0mlviclhjc.R.globalSliceStart(getClass().getName(),16870);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fhlrc7d0m();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,65,100,100,82,101,109,111,118,101,67,111,110,116,97,105,110,115,58,32,91,73,108,108,101,103,97,108,83,116,97,116,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalStateException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2d0md0mlviclhjc.R.rethrow($CLV_t2$);}finally{__CLR4_5_2d0md0mlviclhjc.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.util.collections.SmallSetTest.testAddRemoveContains",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16870,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fhlrc7d0m(){try{__CLR4_5_2d0md0mlviclhjc.R.inc(16870);
        __CLR4_5_2d0md0mlviclhjc.R.inc(16871);SmallSet<String> set = new SmallSet<>();
        __CLR4_5_2d0md0mlviclhjc.R.inc(16872);assertEquals("size", 0, set.size());
        __CLR4_5_2d0md0mlviclhjc.R.inc(16873);assertFalse("contains a", set.contains("a"));
        __CLR4_5_2d0md0mlviclhjc.R.inc(16874);set.add("a");
        __CLR4_5_2d0md0mlviclhjc.R.inc(16875);assertTrue("contains a", set.contains("a"));
        __CLR4_5_2d0md0mlviclhjc.R.inc(16876);assertFalse("contains b", set.contains("b"));
        __CLR4_5_2d0md0mlviclhjc.R.inc(16877);set.add("b");
        __CLR4_5_2d0md0mlviclhjc.R.inc(16878);assertTrue("contains a", set.contains("a"));
        __CLR4_5_2d0md0mlviclhjc.R.inc(16879);assertTrue("contains b", set.contains("b"));
        __CLR4_5_2d0md0mlviclhjc.R.inc(16880);assertEquals("set size", 2, set.size());
        __CLR4_5_2d0md0mlviclhjc.R.inc(16881);set.remove("a");
        __CLR4_5_2d0md0mlviclhjc.R.inc(16882);assertFalse("contains a", set.contains("a"));
        __CLR4_5_2d0md0mlviclhjc.R.inc(16883);assertTrue("contains b", set.contains("b"));
        __CLR4_5_2d0md0mlviclhjc.R.inc(16884);assertEquals("set size", 1, set.size());
        __CLR4_5_2d0md0mlviclhjc.R.inc(16885);set.add("a");
        __CLR4_5_2d0md0mlviclhjc.R.inc(16886);set.add("c");
        __CLR4_5_2d0md0mlviclhjc.R.inc(16887);assertTrue("contains a", set.contains("a"));
        __CLR4_5_2d0md0mlviclhjc.R.inc(16888);assertTrue("contains b", set.contains("b"));
        __CLR4_5_2d0md0mlviclhjc.R.inc(16889);assertTrue("contains c", set.contains("c"));
        __CLR4_5_2d0md0mlviclhjc.R.inc(16890);assertEquals("set size", 3, set.size());
        __CLR4_5_2d0md0mlviclhjc.R.inc(16891);set.add("d");
        __CLR4_5_2d0md0mlviclhjc.R.inc(16892);fail("should not be able to add fourth elephant");
    }finally{__CLR4_5_2d0md0mlviclhjc.R.flushNeeded();}}

    @Test
    public void testIterator() {__CLR4_5_2d0md0mlviclhjc.R.globalSliceStart(getClass().getName(),16893);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2d9uicnd19();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2d0md0mlviclhjc.R.rethrow($CLV_t2$);}finally{__CLR4_5_2d0md0mlviclhjc.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.util.collections.SmallSetTest.testIterator",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16893,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2d9uicnd19(){try{__CLR4_5_2d0md0mlviclhjc.R.inc(16893);
        __CLR4_5_2d0md0mlviclhjc.R.inc(16894);List<String> stringList = Arrays.asList("a", "c", "b");
        __CLR4_5_2d0md0mlviclhjc.R.inc(16895);SmallSet<String> set = new SmallSet<>(stringList);
        __CLR4_5_2d0md0mlviclhjc.R.inc(16896);HashSet<String> validationSet = new HashSet<>(stringList);
        __CLR4_5_2d0md0mlviclhjc.R.inc(16897);assertEquals("size", 3, set.size());
        __CLR4_5_2d0md0mlviclhjc.R.inc(16898);String v;
        __CLR4_5_2d0md0mlviclhjc.R.inc(16899);Iterator<String> it = set.iterator();
        __CLR4_5_2d0md0mlviclhjc.R.inc(16900);assertTrue("hasNext", it.hasNext());
        __CLR4_5_2d0md0mlviclhjc.R.inc(16901);v = it.next();
        __CLR4_5_2d0md0mlviclhjc.R.inc(16902);assertTrue("element was in validationSet", validationSet.remove(v));
        __CLR4_5_2d0md0mlviclhjc.R.inc(16903);assertTrue("hasNext", it.hasNext());
        __CLR4_5_2d0md0mlviclhjc.R.inc(16904);v = it.next();
        __CLR4_5_2d0md0mlviclhjc.R.inc(16905);assertTrue("element was in validationSet", validationSet.remove(v));
        __CLR4_5_2d0md0mlviclhjc.R.inc(16906);assertTrue("hasNext", it.hasNext());
        __CLR4_5_2d0md0mlviclhjc.R.inc(16907);v = it.next();
        __CLR4_5_2d0md0mlviclhjc.R.inc(16908);assertTrue("element was in validationSet", validationSet.remove(v));
        __CLR4_5_2d0md0mlviclhjc.R.inc(16909);assertFalse("no more", it.hasNext());
        __CLR4_5_2d0md0mlviclhjc.R.inc(16910);assertTrue("validation set should be empty", validationSet.isEmpty());
    }finally{__CLR4_5_2d0md0mlviclhjc.R.flushNeeded();}}

    @Test
    public void testIteratorPostRemoval() {__CLR4_5_2d0md0mlviclhjc.R.globalSliceStart(getClass().getName(),16911);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e87y5vd1r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2d0md0mlviclhjc.R.rethrow($CLV_t2$);}finally{__CLR4_5_2d0md0mlviclhjc.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.cs.owl.owlapi.util.collections.SmallSetTest.testIteratorPostRemoval",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16911,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e87y5vd1r(){try{__CLR4_5_2d0md0mlviclhjc.R.inc(16911);
        __CLR4_5_2d0md0mlviclhjc.R.inc(16912);List<String> stringList = Arrays.asList("a", "c", "b");
        __CLR4_5_2d0md0mlviclhjc.R.inc(16913);SmallSet<String> set = new SmallSet<>(stringList);
        __CLR4_5_2d0md0mlviclhjc.R.inc(16914);HashSet<String> validationSet = new HashSet<>(stringList);
        __CLR4_5_2d0md0mlviclhjc.R.inc(16915);set.remove("c");
        __CLR4_5_2d0md0mlviclhjc.R.inc(16916);validationSet.remove("c");
        __CLR4_5_2d0md0mlviclhjc.R.inc(16917);assertEquals("size", 2, set.size());
        __CLR4_5_2d0md0mlviclhjc.R.inc(16918);String v;
        __CLR4_5_2d0md0mlviclhjc.R.inc(16919);Iterator<String> it = set.iterator();
        __CLR4_5_2d0md0mlviclhjc.R.inc(16920);assertTrue("hasNext", it.hasNext());
        __CLR4_5_2d0md0mlviclhjc.R.inc(16921);v = it.next();
        __CLR4_5_2d0md0mlviclhjc.R.inc(16922);assertTrue("element was in validationSet", validationSet.remove(v));
        __CLR4_5_2d0md0mlviclhjc.R.inc(16923);assertTrue("hasNext", it.hasNext());
        __CLR4_5_2d0md0mlviclhjc.R.inc(16924);v = it.next();
        __CLR4_5_2d0md0mlviclhjc.R.inc(16925);assertTrue("element was in validationSet", validationSet.remove(v));
        __CLR4_5_2d0md0mlviclhjc.R.inc(16926);assertFalse("no more", it.hasNext());
        __CLR4_5_2d0md0mlviclhjc.R.inc(16927);assertTrue("validation set should be empty", validationSet.isEmpty());
    }finally{__CLR4_5_2d0md0mlviclhjc.R.flushNeeded();}}
}
