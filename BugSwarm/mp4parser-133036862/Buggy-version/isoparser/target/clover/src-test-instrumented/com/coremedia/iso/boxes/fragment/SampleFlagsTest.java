/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.coremedia.iso.boxes.fragment;

import com.coremedia.iso.IsoTypeReader;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitWriterBufferTest;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.nio.ByteBuffer;

/**
 *
 */
public class SampleFlagsTest {static class __CLR4_5_2jekjeklvlulqhj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448889527L,8589935092L,25175,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @Test
    public void testSimple() throws IOException {__CLR4_5_2jekjeklvlulqhj.R.globalSliceStart(getClass().getName(),25148);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27uh9yjjek();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jekjeklvlulqhj.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jekjeklvlulqhj.R.globalSliceEnd(getClass().getName(),"com.coremedia.iso.boxes.fragment.SampleFlagsTest.testSimple",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25148,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27uh9yjjek() throws IOException{try{__CLR4_5_2jekjeklvlulqhj.R.inc(25148);
        __CLR4_5_2jekjeklvlulqhj.R.inc(25149);long l = 0x11223344;
        __CLR4_5_2jekjeklvlulqhj.R.inc(25150);SampleFlags sf = new SampleFlags(ByteBuffer.wrap(new byte[]{0x11, 0x22, 0x33, 0x44}));
        __CLR4_5_2jekjeklvlulqhj.R.inc(25151);ByteBuffer b = ByteBuffer.allocate(4);
        __CLR4_5_2jekjeklvlulqhj.R.inc(25152);sf.getContent(b);
        __CLR4_5_2jekjeklvlulqhj.R.inc(25153);b.rewind();
        __CLR4_5_2jekjeklvlulqhj.R.inc(25154);Assert.assertEquals(l, IsoTypeReader.readUInt32(b));
    }finally{__CLR4_5_2jekjeklvlulqhj.R.flushNeeded();}}

    @Test
    public void testSetterGetterRoundTrip() throws IOException {__CLR4_5_2jekjeklvlulqhj.R.globalSliceStart(getClass().getName(),25155);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mgu6pujer();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jekjeklvlulqhj.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jekjeklvlulqhj.R.globalSliceEnd(getClass().getName(),"com.coremedia.iso.boxes.fragment.SampleFlagsTest.testSetterGetterRoundTrip",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25155,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mgu6pujer() throws IOException{try{__CLR4_5_2jekjeklvlulqhj.R.inc(25155);
        __CLR4_5_2jekjeklvlulqhj.R.inc(25156);SampleFlags sf = new SampleFlags();
        __CLR4_5_2jekjeklvlulqhj.R.inc(25157);sf.setReserved(1);
        __CLR4_5_2jekjeklvlulqhj.R.inc(25158);sf.setSampleDegradationPriority(1);
        __CLR4_5_2jekjeklvlulqhj.R.inc(25159);sf.setSampleDependsOn(1);
        __CLR4_5_2jekjeklvlulqhj.R.inc(25160);sf.setSampleHasRedundancy(2);
        __CLR4_5_2jekjeklvlulqhj.R.inc(25161);sf.setSampleIsDependedOn(3);
        __CLR4_5_2jekjeklvlulqhj.R.inc(25162);sf.setSampleIsDifferenceSample(true);
        __CLR4_5_2jekjeklvlulqhj.R.inc(25163);sf.setSamplePaddingValue(3);
        __CLR4_5_2jekjeklvlulqhj.R.inc(25164);ByteBuffer bb = ByteBuffer.allocate(4);
        __CLR4_5_2jekjeklvlulqhj.R.inc(25165);sf.getContent(bb);
        __CLR4_5_2jekjeklvlulqhj.R.inc(25166);bb.rewind();
        //System.err.println(BitWriterBufferTest.toString(bb));
        __CLR4_5_2jekjeklvlulqhj.R.inc(25167);SampleFlags sf2 = new SampleFlags(bb);


        __CLR4_5_2jekjeklvlulqhj.R.inc(25168);Assert.assertEquals(sf.getReserved(), sf2.getReserved());
        __CLR4_5_2jekjeklvlulqhj.R.inc(25169);Assert.assertEquals(sf.getSampleDependsOn(), sf2.getSampleDependsOn());
        __CLR4_5_2jekjeklvlulqhj.R.inc(25170);Assert.assertEquals(sf.isSampleIsDifferenceSample(), sf2.isSampleIsDifferenceSample());
        __CLR4_5_2jekjeklvlulqhj.R.inc(25171);Assert.assertEquals(sf.getSamplePaddingValue(), sf2.getSamplePaddingValue());

        __CLR4_5_2jekjeklvlulqhj.R.inc(25172);Assert.assertEquals(sf.getSampleDegradationPriority(), sf2.getSampleDegradationPriority());
        __CLR4_5_2jekjeklvlulqhj.R.inc(25173);Assert.assertEquals(sf.getSampleHasRedundancy(), sf2.getSampleHasRedundancy());
        __CLR4_5_2jekjeklvlulqhj.R.inc(25174);Assert.assertEquals(sf.getSampleIsDependedOn(), sf2.getSampleIsDependedOn());

    }finally{__CLR4_5_2jekjeklvlulqhj.R.flushNeeded();}}


}
