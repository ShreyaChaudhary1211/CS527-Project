/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.AbstractFullBox;

import java.nio.ByteBuffer;

/**
 * <h1>4cc = "{@value #TYPE}"</h1>
 * <p>
 * The optional composition shift least greatest atom summarizes the calculated
 * minimum and maximum offsets between decode and composition time, as well as
 * the start and end times, for all samples. This allows a reader to determine
 * the minimum required time for decode to obtain proper presentation order without
 * needing to scan the sample table for the range of offsets. The type of the
 * composition shift least greatest atom is \u2018cslg\u2019.</p>
 */
public class CompositionShiftLeastGreatestAtom extends AbstractFullBox {static class __CLR4_5_2hxhxlvlulazv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,683,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static final String TYPE = "cslg";

    public CompositionShiftLeastGreatestAtom() {
        super(TYPE);__CLR4_5_2hxhxlvlulazv.R.inc(646);try{__CLR4_5_2hxhxlvlulazv.R.inc(645);
    }finally{__CLR4_5_2hxhxlvlulazv.R.flushNeeded();}}

    // A 32-bit unsigned integer that specifies the calculated value.
    int compositionOffsetToDisplayOffsetShift;

    // A 32-bit signed integer that specifies the calculated value.
    int leastDisplayOffset;

    // A 32-bit signed integer that specifies the calculated value.
    int greatestDisplayOffset;

    //A 32-bit signed integer that specifies the calculated value.
    int displayStartTime;

    //A 32-bit signed integer that specifies the calculated value.
    int displayEndTime;


    @Override
    protected long getContentSize() {try{__CLR4_5_2hxhxlvlulazv.R.inc(647);
        __CLR4_5_2hxhxlvlulazv.R.inc(648);return 24;
    }finally{__CLR4_5_2hxhxlvlulazv.R.flushNeeded();}}

    @Override
    public void _parseDetails(ByteBuffer content) {try{__CLR4_5_2hxhxlvlulazv.R.inc(649);
        __CLR4_5_2hxhxlvlulazv.R.inc(650);parseVersionAndFlags(content);
        __CLR4_5_2hxhxlvlulazv.R.inc(651);compositionOffsetToDisplayOffsetShift = content.getInt();
        __CLR4_5_2hxhxlvlulazv.R.inc(652);leastDisplayOffset = content.getInt();
        __CLR4_5_2hxhxlvlulazv.R.inc(653);greatestDisplayOffset = content.getInt();
        __CLR4_5_2hxhxlvlulazv.R.inc(654);displayStartTime = content.getInt();
        __CLR4_5_2hxhxlvlulazv.R.inc(655);displayEndTime = content.getInt();
    }finally{__CLR4_5_2hxhxlvlulazv.R.flushNeeded();}}

    @Override
    protected void getContent(ByteBuffer byteBuffer) {try{__CLR4_5_2hxhxlvlulazv.R.inc(656);
        __CLR4_5_2hxhxlvlulazv.R.inc(657);writeVersionAndFlags(byteBuffer);
        __CLR4_5_2hxhxlvlulazv.R.inc(658);byteBuffer.putInt(compositionOffsetToDisplayOffsetShift);
        __CLR4_5_2hxhxlvlulazv.R.inc(659);byteBuffer.putInt(leastDisplayOffset);
        __CLR4_5_2hxhxlvlulazv.R.inc(660);byteBuffer.putInt(greatestDisplayOffset);
        __CLR4_5_2hxhxlvlulazv.R.inc(661);byteBuffer.putInt(displayStartTime);
        __CLR4_5_2hxhxlvlulazv.R.inc(662);byteBuffer.putInt(displayEndTime);
    }finally{__CLR4_5_2hxhxlvlulazv.R.flushNeeded();}}


    public int getCompositionOffsetToDisplayOffsetShift() {try{__CLR4_5_2hxhxlvlulazv.R.inc(663);
        __CLR4_5_2hxhxlvlulazv.R.inc(664);return compositionOffsetToDisplayOffsetShift;
    }finally{__CLR4_5_2hxhxlvlulazv.R.flushNeeded();}}

    public void setCompositionOffsetToDisplayOffsetShift(int compositionOffsetToDisplayOffsetShift) {try{__CLR4_5_2hxhxlvlulazv.R.inc(665);
        __CLR4_5_2hxhxlvlulazv.R.inc(666);this.compositionOffsetToDisplayOffsetShift = compositionOffsetToDisplayOffsetShift;
    }finally{__CLR4_5_2hxhxlvlulazv.R.flushNeeded();}}

    public int getLeastDisplayOffset() {try{__CLR4_5_2hxhxlvlulazv.R.inc(667);
        __CLR4_5_2hxhxlvlulazv.R.inc(668);return leastDisplayOffset;
    }finally{__CLR4_5_2hxhxlvlulazv.R.flushNeeded();}}

    public void setLeastDisplayOffset(int leastDisplayOffset) {try{__CLR4_5_2hxhxlvlulazv.R.inc(669);
        __CLR4_5_2hxhxlvlulazv.R.inc(670);this.leastDisplayOffset = leastDisplayOffset;
    }finally{__CLR4_5_2hxhxlvlulazv.R.flushNeeded();}}

    public int getGreatestDisplayOffset() {try{__CLR4_5_2hxhxlvlulazv.R.inc(671);
        __CLR4_5_2hxhxlvlulazv.R.inc(672);return greatestDisplayOffset;
    }finally{__CLR4_5_2hxhxlvlulazv.R.flushNeeded();}}

    public void setGreatestDisplayOffset(int greatestDisplayOffset) {try{__CLR4_5_2hxhxlvlulazv.R.inc(673);
        __CLR4_5_2hxhxlvlulazv.R.inc(674);this.greatestDisplayOffset = greatestDisplayOffset;
    }finally{__CLR4_5_2hxhxlvlulazv.R.flushNeeded();}}

    public int getDisplayStartTime() {try{__CLR4_5_2hxhxlvlulazv.R.inc(675);
        __CLR4_5_2hxhxlvlulazv.R.inc(676);return displayStartTime;
    }finally{__CLR4_5_2hxhxlvlulazv.R.flushNeeded();}}

    public void setDisplayStartTime(int displayStartTime) {try{__CLR4_5_2hxhxlvlulazv.R.inc(677);
        __CLR4_5_2hxhxlvlulazv.R.inc(678);this.displayStartTime = displayStartTime;
    }finally{__CLR4_5_2hxhxlvlulazv.R.flushNeeded();}}

    public int getDisplayEndTime() {try{__CLR4_5_2hxhxlvlulazv.R.inc(679);
        __CLR4_5_2hxhxlvlulazv.R.inc(680);return displayEndTime;
    }finally{__CLR4_5_2hxhxlvlulazv.R.flushNeeded();}}

    public void setDisplayEndTime(int displayEndTime) {try{__CLR4_5_2hxhxlvlulazv.R.inc(681);
        __CLR4_5_2hxhxlvlulazv.R.inc(682);this.displayEndTime = displayEndTime;
    }finally{__CLR4_5_2hxhxlvlulazv.R.flushNeeded();}}
}
