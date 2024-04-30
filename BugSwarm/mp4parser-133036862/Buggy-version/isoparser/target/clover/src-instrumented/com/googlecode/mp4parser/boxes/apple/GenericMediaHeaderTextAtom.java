/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.googlecode.mp4parser.boxes.apple;

import com.googlecode.mp4parser.AbstractBox;

import java.nio.ByteBuffer;

/**
 * <h1>4cc = "{@value #TYPE}"</h1>
 * Undocumented atom in the gmhd atom of text tracks.
 */
public class GenericMediaHeaderTextAtom extends AbstractBox {public static class __CLR4_5_2bffbfflvlulk2c{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,14871,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static final String TYPE = "text";

    int unknown_1 = 65536;
    int unknown_2;
    int unknown_3;
    int unknown_4;
    int unknown_5 = 65536;
    int unknown_6;
    int unknown_7;
    int unknown_8;
    int unknown_9 = 1073741824;

    public GenericMediaHeaderTextAtom() {
        super(TYPE);__CLR4_5_2bffbfflvlulk2c.R.inc(14812);try{__CLR4_5_2bffbfflvlulk2c.R.inc(14811);
    }finally{__CLR4_5_2bffbfflvlulk2c.R.flushNeeded();}}

    @Override
    protected long getContentSize() {try{__CLR4_5_2bffbfflvlulk2c.R.inc(14813);
        __CLR4_5_2bffbfflvlulk2c.R.inc(14814);return 36;
    }finally{__CLR4_5_2bffbfflvlulk2c.R.flushNeeded();}}

    @Override
    protected void getContent(ByteBuffer byteBuffer) {try{__CLR4_5_2bffbfflvlulk2c.R.inc(14815);
        __CLR4_5_2bffbfflvlulk2c.R.inc(14816);byteBuffer.putInt(unknown_1);
        __CLR4_5_2bffbfflvlulk2c.R.inc(14817);byteBuffer.putInt(unknown_2);
        __CLR4_5_2bffbfflvlulk2c.R.inc(14818);byteBuffer.putInt(unknown_3);
        __CLR4_5_2bffbfflvlulk2c.R.inc(14819);byteBuffer.putInt(unknown_4);
        __CLR4_5_2bffbfflvlulk2c.R.inc(14820);byteBuffer.putInt(unknown_5);
        __CLR4_5_2bffbfflvlulk2c.R.inc(14821);byteBuffer.putInt(unknown_6);
        __CLR4_5_2bffbfflvlulk2c.R.inc(14822);byteBuffer.putInt(unknown_7);
        __CLR4_5_2bffbfflvlulk2c.R.inc(14823);byteBuffer.putInt(unknown_8);
        __CLR4_5_2bffbfflvlulk2c.R.inc(14824);byteBuffer.putInt(unknown_9);
    }finally{__CLR4_5_2bffbfflvlulk2c.R.flushNeeded();}}

    @Override
    protected void _parseDetails(ByteBuffer content) {try{__CLR4_5_2bffbfflvlulk2c.R.inc(14825);
        __CLR4_5_2bffbfflvlulk2c.R.inc(14826);unknown_1 = content.getInt();
        __CLR4_5_2bffbfflvlulk2c.R.inc(14827);unknown_2 = content.getInt();
        __CLR4_5_2bffbfflvlulk2c.R.inc(14828);unknown_3 = content.getInt();
        __CLR4_5_2bffbfflvlulk2c.R.inc(14829);unknown_4 = content.getInt();
        __CLR4_5_2bffbfflvlulk2c.R.inc(14830);unknown_5 = content.getInt();
        __CLR4_5_2bffbfflvlulk2c.R.inc(14831);unknown_6 = content.getInt();
        __CLR4_5_2bffbfflvlulk2c.R.inc(14832);unknown_7 = content.getInt();
        __CLR4_5_2bffbfflvlulk2c.R.inc(14833);unknown_8 = content.getInt();
        __CLR4_5_2bffbfflvlulk2c.R.inc(14834);unknown_9 = content.getInt();
    }finally{__CLR4_5_2bffbfflvlulk2c.R.flushNeeded();}}

    public int getUnknown_1() {try{__CLR4_5_2bffbfflvlulk2c.R.inc(14835);
        __CLR4_5_2bffbfflvlulk2c.R.inc(14836);return unknown_1;
    }finally{__CLR4_5_2bffbfflvlulk2c.R.flushNeeded();}}

    public void setUnknown_1(int unknown_1) {try{__CLR4_5_2bffbfflvlulk2c.R.inc(14837);
        __CLR4_5_2bffbfflvlulk2c.R.inc(14838);this.unknown_1 = unknown_1;
    }finally{__CLR4_5_2bffbfflvlulk2c.R.flushNeeded();}}

    public int getUnknown_2() {try{__CLR4_5_2bffbfflvlulk2c.R.inc(14839);
        __CLR4_5_2bffbfflvlulk2c.R.inc(14840);return unknown_2;
    }finally{__CLR4_5_2bffbfflvlulk2c.R.flushNeeded();}}

    public void setUnknown_2(int unknown_2) {try{__CLR4_5_2bffbfflvlulk2c.R.inc(14841);
        __CLR4_5_2bffbfflvlulk2c.R.inc(14842);this.unknown_2 = unknown_2;
    }finally{__CLR4_5_2bffbfflvlulk2c.R.flushNeeded();}}

    public int getUnknown_3() {try{__CLR4_5_2bffbfflvlulk2c.R.inc(14843);
        __CLR4_5_2bffbfflvlulk2c.R.inc(14844);return unknown_3;
    }finally{__CLR4_5_2bffbfflvlulk2c.R.flushNeeded();}}

    public void setUnknown_3(int unknown_3) {try{__CLR4_5_2bffbfflvlulk2c.R.inc(14845);
        __CLR4_5_2bffbfflvlulk2c.R.inc(14846);this.unknown_3 = unknown_3;
    }finally{__CLR4_5_2bffbfflvlulk2c.R.flushNeeded();}}

    public int getUnknown_4() {try{__CLR4_5_2bffbfflvlulk2c.R.inc(14847);
        __CLR4_5_2bffbfflvlulk2c.R.inc(14848);return unknown_4;
    }finally{__CLR4_5_2bffbfflvlulk2c.R.flushNeeded();}}

    public void setUnknown_4(int unknown_4) {try{__CLR4_5_2bffbfflvlulk2c.R.inc(14849);
        __CLR4_5_2bffbfflvlulk2c.R.inc(14850);this.unknown_4 = unknown_4;
    }finally{__CLR4_5_2bffbfflvlulk2c.R.flushNeeded();}}

    public int getUnknown_5() {try{__CLR4_5_2bffbfflvlulk2c.R.inc(14851);
        __CLR4_5_2bffbfflvlulk2c.R.inc(14852);return unknown_5;
    }finally{__CLR4_5_2bffbfflvlulk2c.R.flushNeeded();}}

    public void setUnknown_5(int unknown_5) {try{__CLR4_5_2bffbfflvlulk2c.R.inc(14853);
        __CLR4_5_2bffbfflvlulk2c.R.inc(14854);this.unknown_5 = unknown_5;
    }finally{__CLR4_5_2bffbfflvlulk2c.R.flushNeeded();}}

    public int getUnknown_6() {try{__CLR4_5_2bffbfflvlulk2c.R.inc(14855);
        __CLR4_5_2bffbfflvlulk2c.R.inc(14856);return unknown_6;
    }finally{__CLR4_5_2bffbfflvlulk2c.R.flushNeeded();}}

    public void setUnknown_6(int unknown_6) {try{__CLR4_5_2bffbfflvlulk2c.R.inc(14857);
        __CLR4_5_2bffbfflvlulk2c.R.inc(14858);this.unknown_6 = unknown_6;
    }finally{__CLR4_5_2bffbfflvlulk2c.R.flushNeeded();}}

    public int getUnknown_7() {try{__CLR4_5_2bffbfflvlulk2c.R.inc(14859);
        __CLR4_5_2bffbfflvlulk2c.R.inc(14860);return unknown_7;
    }finally{__CLR4_5_2bffbfflvlulk2c.R.flushNeeded();}}

    public void setUnknown_7(int unknown_7) {try{__CLR4_5_2bffbfflvlulk2c.R.inc(14861);
        __CLR4_5_2bffbfflvlulk2c.R.inc(14862);this.unknown_7 = unknown_7;
    }finally{__CLR4_5_2bffbfflvlulk2c.R.flushNeeded();}}

    public int getUnknown_8() {try{__CLR4_5_2bffbfflvlulk2c.R.inc(14863);
        __CLR4_5_2bffbfflvlulk2c.R.inc(14864);return unknown_8;
    }finally{__CLR4_5_2bffbfflvlulk2c.R.flushNeeded();}}

    public void setUnknown_8(int unknown_8) {try{__CLR4_5_2bffbfflvlulk2c.R.inc(14865);
        __CLR4_5_2bffbfflvlulk2c.R.inc(14866);this.unknown_8 = unknown_8;
    }finally{__CLR4_5_2bffbfflvlulk2c.R.flushNeeded();}}

    public int getUnknown_9() {try{__CLR4_5_2bffbfflvlulk2c.R.inc(14867);
        __CLR4_5_2bffbfflvlulk2c.R.inc(14868);return unknown_9;
    }finally{__CLR4_5_2bffbfflvlulk2c.R.flushNeeded();}}

    public void setUnknown_9(int unknown_9) {try{__CLR4_5_2bffbfflvlulk2c.R.inc(14869);
        __CLR4_5_2bffbfflvlulk2c.R.inc(14870);this.unknown_9 = unknown_9;
    }finally{__CLR4_5_2bffbfflvlulk2c.R.flushNeeded();}}
}
