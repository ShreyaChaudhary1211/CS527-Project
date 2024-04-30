/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.coremedia.iso.boxes;

import com.coremedia.iso.IsoFile;
import com.googlecode.mp4parser.DataSource;
import com.googlecode.mp4parser.FileDataSourceImpl;
import com.googlecode.mp4parser.MemoryDataSourceImpl;
import junit.framework.Assert;
import junit.framework.TestCase;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;

/**
 * Created by IntelliJ IDEA.
 * User: sannies
 * Date: 24.02.11
 * Time: 12:41
 * To change this template use File | Settings | File Templates.
 */
public class ComponsitionShiftLeastGreatestAtomTest extends TestCase {static class __CLR4_5_2htbhtblvl9em5r{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413286414L,8589935092L,23104,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;


    public void testParse() throws Exception {__CLR4_5_2htbhtblvl9em5r.R.globalSliceStart(getClass().getName(),23087);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2se4tqwhtb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2htbhtblvl9em5r.R.rethrow($CLV_t2$);}finally{__CLR4_5_2htbhtblvl9em5r.R.globalSliceEnd(getClass().getName(),"com.coremedia.iso.boxes.ComponsitionShiftLeastGreatestAtomTest.testParse",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23087,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2se4tqwhtb() throws Exception{try{__CLR4_5_2htbhtblvl9em5r.R.inc(23087);
        __CLR4_5_2htbhtblvl9em5r.R.inc(23088);CompositionShiftLeastGreatestAtom clsg = new CompositionShiftLeastGreatestAtom();
        __CLR4_5_2htbhtblvl9em5r.R.inc(23089);clsg.setCompositionOffsetToDisplayOffsetShift(2);
        __CLR4_5_2htbhtblvl9em5r.R.inc(23090);clsg.setDisplayEndTime(3);
        __CLR4_5_2htbhtblvl9em5r.R.inc(23091);clsg.setDisplayStartTime(4);
        __CLR4_5_2htbhtblvl9em5r.R.inc(23092);clsg.setGreatestDisplayOffset(-2);
        __CLR4_5_2htbhtblvl9em5r.R.inc(23093);clsg.setLeastDisplayOffset(-4);


        __CLR4_5_2htbhtblvl9em5r.R.inc(23094);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_5_2htbhtblvl9em5r.R.inc(23095);clsg.getBox(Channels.newChannel(baos));
        __CLR4_5_2htbhtblvl9em5r.R.inc(23096);IsoFile isoFile = new IsoFile(new MemoryDataSourceImpl(baos.toByteArray()));

        __CLR4_5_2htbhtblvl9em5r.R.inc(23097);CompositionShiftLeastGreatestAtom clsg2 = isoFile.getBoxes(CompositionShiftLeastGreatestAtom.class).get(0);
        __CLR4_5_2htbhtblvl9em5r.R.inc(23098);Assert.assertEquals(baos.toByteArray().length, clsg2.getSize());
        __CLR4_5_2htbhtblvl9em5r.R.inc(23099);Assert.assertEquals(clsg.getCompositionOffsetToDisplayOffsetShift(), clsg2.getCompositionOffsetToDisplayOffsetShift());
        __CLR4_5_2htbhtblvl9em5r.R.inc(23100);Assert.assertEquals(clsg.getGreatestDisplayOffset(), clsg2.getGreatestDisplayOffset());
        __CLR4_5_2htbhtblvl9em5r.R.inc(23101);Assert.assertEquals(clsg.getDisplayEndTime(), clsg2.getDisplayEndTime());
        __CLR4_5_2htbhtblvl9em5r.R.inc(23102);Assert.assertEquals(clsg.getDisplayStartTime(), clsg2.getDisplayStartTime());
        __CLR4_5_2htbhtblvl9em5r.R.inc(23103);Assert.assertEquals(clsg.getLeastDisplayOffset(), clsg2.getLeastDisplayOffset());


    }finally{__CLR4_5_2htbhtblvl9em5r.R.flushNeeded();}}
}
