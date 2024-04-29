/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.googlecode.mp4parser.boxes.mp4.samplegrouping;

import com.googlecode.mp4parser.boxes.BoxWriteReadBase;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Map;


@RunWith(Suite.class)
@Suite.SuiteClasses(value = {
        SampleGroupDescriptionBoxTestSuite.TestRateShareEntry.class,
        SampleGroupDescriptionBoxTestSuite.TestUnkownEntry.class,
        SampleGroupDescriptionBoxTestSuite.TestRollRecoveryEntry.class
})
public class SampleGroupDescriptionBoxTestSuite {static class __CLR4_5_2jjljjllvl9emyu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413286414L,8589935092L,25360,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static class TestRateShareEntry extends BoxWriteReadBase<SampleGroupDescriptionBox> {
        @Override
        public Class<SampleGroupDescriptionBox> getBoxUnderTest() {try{__CLR4_5_2jjljjllvl9emyu.R.inc(25329);
            __CLR4_5_2jjljjllvl9emyu.R.inc(25330);return SampleGroupDescriptionBox.class;
        }finally{__CLR4_5_2jjljjllvl9emyu.R.flushNeeded();}}

        @Override
        public void setupProperties(Map<String, Object> addPropsHere, SampleGroupDescriptionBox box) {try{__CLR4_5_2jjljjllvl9emyu.R.inc(25331);
            __CLR4_5_2jjljjllvl9emyu.R.inc(25332);RateShareEntry rateShareEntry = new RateShareEntry();
            __CLR4_5_2jjljjllvl9emyu.R.inc(25333);rateShareEntry.setDiscardPriority((short) 56);
            __CLR4_5_2jjljjllvl9emyu.R.inc(25334);rateShareEntry.setMaximumBitrate(1000);
            __CLR4_5_2jjljjllvl9emyu.R.inc(25335);rateShareEntry.setMinimumBitrate(100);
            __CLR4_5_2jjljjllvl9emyu.R.inc(25336);rateShareEntry.setOperationPointCut((short) 2);
            __CLR4_5_2jjljjllvl9emyu.R.inc(25337);rateShareEntry.setEntries(Arrays.asList(
                    new RateShareEntry.Entry(100, (short) 50),
                    new RateShareEntry.Entry(1000, (short) 90)
            ));


            __CLR4_5_2jjljjllvl9emyu.R.inc(25338);addPropsHere.put("defaultLength", 5);
            __CLR4_5_2jjljjllvl9emyu.R.inc(25339);addPropsHere.put("version", 1);
            __CLR4_5_2jjljjllvl9emyu.R.inc(25340);addPropsHere.put("groupEntries", Arrays.asList(
                    rateShareEntry
            ));
            __CLR4_5_2jjljjllvl9emyu.R.inc(25341);addPropsHere.put("groupingType", RateShareEntry.TYPE);
        }finally{__CLR4_5_2jjljjllvl9emyu.R.flushNeeded();}}
    }

    public static class TestUnkownEntry extends BoxWriteReadBase<SampleGroupDescriptionBox> {
        @Override
        public Class<SampleGroupDescriptionBox> getBoxUnderTest() {try{__CLR4_5_2jjljjllvl9emyu.R.inc(25342);
            __CLR4_5_2jjljjllvl9emyu.R.inc(25343);return SampleGroupDescriptionBox.class;
        }finally{__CLR4_5_2jjljjllvl9emyu.R.flushNeeded();}}

        @Override
        public void setupProperties(Map<String, Object> addPropsHere, SampleGroupDescriptionBox box) {try{__CLR4_5_2jjljjllvl9emyu.R.inc(25344);
            __CLR4_5_2jjljjllvl9emyu.R.inc(25345);UnknownEntry unknownEntry = new UnknownEntry("abcd");
            __CLR4_5_2jjljjllvl9emyu.R.inc(25346);unknownEntry.setContent(ByteBuffer.wrap(new byte[]{1, 2, 3, 4, 5, 6}));

            __CLR4_5_2jjljjllvl9emyu.R.inc(25347);addPropsHere.put("defaultLength", 5);
            __CLR4_5_2jjljjllvl9emyu.R.inc(25348);addPropsHere.put("version", 1);
            __CLR4_5_2jjljjllvl9emyu.R.inc(25349);addPropsHere.put("groupEntries", Arrays.asList(
                    unknownEntry
            ));
            __CLR4_5_2jjljjllvl9emyu.R.inc(25350);addPropsHere.put("groupingType", "unkn");
        }finally{__CLR4_5_2jjljjllvl9emyu.R.flushNeeded();}}
    }

    public static class TestRollRecoveryEntry extends BoxWriteReadBase<SampleGroupDescriptionBox> {
        @Override
        public Class<SampleGroupDescriptionBox> getBoxUnderTest() {try{__CLR4_5_2jjljjllvl9emyu.R.inc(25351);
            __CLR4_5_2jjljjllvl9emyu.R.inc(25352);return SampleGroupDescriptionBox.class;
        }finally{__CLR4_5_2jjljjllvl9emyu.R.flushNeeded();}}

        @Override
        public void setupProperties(Map<String, Object> addPropsHere, SampleGroupDescriptionBox box) {try{__CLR4_5_2jjljjllvl9emyu.R.inc(25353);
            __CLR4_5_2jjljjllvl9emyu.R.inc(25354);RollRecoveryEntry entry = new RollRecoveryEntry();
            __CLR4_5_2jjljjllvl9emyu.R.inc(25355);entry.setRollDistance((short) 6);

            __CLR4_5_2jjljjllvl9emyu.R.inc(25356);addPropsHere.put("defaultLength", 5);
            __CLR4_5_2jjljjllvl9emyu.R.inc(25357);addPropsHere.put("version", 1);
            __CLR4_5_2jjljjllvl9emyu.R.inc(25358);addPropsHere.put("groupEntries", Arrays.asList(
                    entry
            ));
            __CLR4_5_2jjljjllvl9emyu.R.inc(25359);addPropsHere.put("groupingType", "roll");
        }finally{__CLR4_5_2jjljjllvl9emyu.R.flushNeeded();}}
    }


}

