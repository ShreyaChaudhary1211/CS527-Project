/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.mp4parser.iso14496.part15;

import com.coremedia.iso.boxes.Box;
import com.googlecode.mp4parser.boxes.BoxRoundtripTest;
import com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleGroupDescriptionBox;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

public class Part15GroupDescriptionBoxesTest extends BoxRoundtripTest {static class __CLR4_5_2kloklolvlulrdq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448889527L,8589935092L,26721,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public Part15GroupDescriptionBoxesTest(Box boxUnderTest, Map.Entry<String, Object>... properties) {
        super(boxUnderTest, properties);__CLR4_5_2kloklolvlulrdq.R.inc(26701);try{__CLR4_5_2kloklolvlulrdq.R.inc(26700);
    }finally{__CLR4_5_2kloklolvlulrdq.R.flushNeeded();}}

    @Parameterized.Parameters
    public static Collection<Object[]> data() {try{__CLR4_5_2kloklolvlulrdq.R.inc(26702);
        __CLR4_5_2kloklolvlulrdq.R.inc(26703);StepwiseTemporalLayerEntry stsa = new StepwiseTemporalLayerEntry();
        __CLR4_5_2kloklolvlulrdq.R.inc(26704);SyncSampleEntry sync = new SyncSampleEntry();
        __CLR4_5_2kloklolvlulrdq.R.inc(26705);sync.setNalUnitType(5);
        __CLR4_5_2kloklolvlulrdq.R.inc(26706);sync.setReserved(1);

        __CLR4_5_2kloklolvlulrdq.R.inc(26707);TemporalLayerSampleGroup tscl = new TemporalLayerSampleGroup();
        __CLR4_5_2kloklolvlulrdq.R.inc(26708);tscl.setTemporalLayerId(23);
        __CLR4_5_2kloklolvlulrdq.R.inc(26709);tscl.setTlAvgBitRate(203);
        __CLR4_5_2kloklolvlulrdq.R.inc(26710);tscl.setTlAvgFrameRate(28);
        __CLR4_5_2kloklolvlulrdq.R.inc(26711);tscl.setTlConstantFrameRate(12);
        __CLR4_5_2kloklolvlulrdq.R.inc(26712);tscl.setTlconstraint_indicator_flags(23442324);
        __CLR4_5_2kloklolvlulrdq.R.inc(26713);tscl.setTllevel_idc(75);
        __CLR4_5_2kloklolvlulrdq.R.inc(26714);tscl.setTlMaxBitRate(23467);
        __CLR4_5_2kloklolvlulrdq.R.inc(26715);tscl.setTlprofile_compatibility_flags(26726378);
        __CLR4_5_2kloklolvlulrdq.R.inc(26716);tscl.setTlprofile_idc(12);
        __CLR4_5_2kloklolvlulrdq.R.inc(26717);tscl.setTlprofile_space(1);
        __CLR4_5_2kloklolvlulrdq.R.inc(26718);tscl.setTltier_flag(true);
        __CLR4_5_2kloklolvlulrdq.R.inc(26719);TemporalSubLayerSampleGroup tsas = new TemporalSubLayerSampleGroup();



        __CLR4_5_2kloklolvlulrdq.R.inc(26720);return Arrays.asList(
                new Object[]{new SampleGroupDescriptionBox(),
                        new Map.Entry[]{
                                new E("groupingType", StepwiseTemporalLayerEntry.TYPE),
                                new E("groupEntries", Arrays.asList(stsa))}},

                new Object[]{new SampleGroupDescriptionBox(),
                        new Map.Entry[]{
                                new E("groupingType", SyncSampleEntry.TYPE),
                                new E("groupEntries", Arrays.asList(sync))}},
                new Object[]{new SampleGroupDescriptionBox(),
                        new Map.Entry[]{
                                new E("groupingType", TemporalLayerSampleGroup.TYPE),
                                new E("groupEntries", Arrays.asList(tscl))}},
                new Object[]{new SampleGroupDescriptionBox(),
                        new Map.Entry[]{
                                new E("groupingType", TemporalSubLayerSampleGroup.TYPE),
                                new E("groupEntries", Arrays.asList(tsas))}}
        );
    }finally{__CLR4_5_2kloklolvlulrdq.R.flushNeeded();}}
}