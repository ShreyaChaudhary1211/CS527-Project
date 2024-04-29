/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.googlecode.mp4parser.boxes.apple;

import com.googlecode.mp4parser.AbstractBox;

import java.nio.ByteBuffer;

/**
 * <h1>4cc = "{@value #TYPE}"</h1>
 * Undocumented atom in the gmhd atom of text tracks.
 */
public class GenericMediaHeaderTextAtom extends AbstractBox {public static class __CLR4_5_2bcsbcslvl9ejrn{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,14776,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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
        super(TYPE);__CLR4_5_2bcsbcslvl9ejrn.R.inc(14717);try{__CLR4_5_2bcsbcslvl9ejrn.R.inc(14716);
    }finally{__CLR4_5_2bcsbcslvl9ejrn.R.flushNeeded();}}

    @Override
    protected long getContentSize() {try{__CLR4_5_2bcsbcslvl9ejrn.R.inc(14718);
        __CLR4_5_2bcsbcslvl9ejrn.R.inc(14719);return 36;
    }finally{__CLR4_5_2bcsbcslvl9ejrn.R.flushNeeded();}}

    @Override
    protected void getContent(ByteBuffer byteBuffer) {try{__CLR4_5_2bcsbcslvl9ejrn.R.inc(14720);
        __CLR4_5_2bcsbcslvl9ejrn.R.inc(14721);byteBuffer.putInt(unknown_1);
        __CLR4_5_2bcsbcslvl9ejrn.R.inc(14722);byteBuffer.putInt(unknown_2);
        __CLR4_5_2bcsbcslvl9ejrn.R.inc(14723);byteBuffer.putInt(unknown_3);
        __CLR4_5_2bcsbcslvl9ejrn.R.inc(14724);byteBuffer.putInt(unknown_4);
        __CLR4_5_2bcsbcslvl9ejrn.R.inc(14725);byteBuffer.putInt(unknown_5);
        __CLR4_5_2bcsbcslvl9ejrn.R.inc(14726);byteBuffer.putInt(unknown_6);
        __CLR4_5_2bcsbcslvl9ejrn.R.inc(14727);byteBuffer.putInt(unknown_7);
        __CLR4_5_2bcsbcslvl9ejrn.R.inc(14728);byteBuffer.putInt(unknown_8);
        __CLR4_5_2bcsbcslvl9ejrn.R.inc(14729);byteBuffer.putInt(unknown_9);
    }finally{__CLR4_5_2bcsbcslvl9ejrn.R.flushNeeded();}}

    @Override
    protected void _parseDetails(ByteBuffer content) {try{__CLR4_5_2bcsbcslvl9ejrn.R.inc(14730);
        __CLR4_5_2bcsbcslvl9ejrn.R.inc(14731);unknown_1 = content.getInt();
        __CLR4_5_2bcsbcslvl9ejrn.R.inc(14732);unknown_2 = content.getInt();
        __CLR4_5_2bcsbcslvl9ejrn.R.inc(14733);unknown_3 = content.getInt();
        __CLR4_5_2bcsbcslvl9ejrn.R.inc(14734);unknown_4 = content.getInt();
        __CLR4_5_2bcsbcslvl9ejrn.R.inc(14735);unknown_5 = content.getInt();
        __CLR4_5_2bcsbcslvl9ejrn.R.inc(14736);unknown_6 = content.getInt();
        __CLR4_5_2bcsbcslvl9ejrn.R.inc(14737);unknown_7 = content.getInt();
        __CLR4_5_2bcsbcslvl9ejrn.R.inc(14738);unknown_8 = content.getInt();
        __CLR4_5_2bcsbcslvl9ejrn.R.inc(14739);unknown_9 = content.getInt();
    }finally{__CLR4_5_2bcsbcslvl9ejrn.R.flushNeeded();}}

    public int getUnknown_1() {try{__CLR4_5_2bcsbcslvl9ejrn.R.inc(14740);
        __CLR4_5_2bcsbcslvl9ejrn.R.inc(14741);return unknown_1;
    }finally{__CLR4_5_2bcsbcslvl9ejrn.R.flushNeeded();}}

    public void setUnknown_1(int unknown_1) {try{__CLR4_5_2bcsbcslvl9ejrn.R.inc(14742);
        __CLR4_5_2bcsbcslvl9ejrn.R.inc(14743);this.unknown_1 = unknown_1;
    }finally{__CLR4_5_2bcsbcslvl9ejrn.R.flushNeeded();}}

    public int getUnknown_2() {try{__CLR4_5_2bcsbcslvl9ejrn.R.inc(14744);
        __CLR4_5_2bcsbcslvl9ejrn.R.inc(14745);return unknown_2;
    }finally{__CLR4_5_2bcsbcslvl9ejrn.R.flushNeeded();}}

    public void setUnknown_2(int unknown_2) {try{__CLR4_5_2bcsbcslvl9ejrn.R.inc(14746);
        __CLR4_5_2bcsbcslvl9ejrn.R.inc(14747);this.unknown_2 = unknown_2;
    }finally{__CLR4_5_2bcsbcslvl9ejrn.R.flushNeeded();}}

    public int getUnknown_3() {try{__CLR4_5_2bcsbcslvl9ejrn.R.inc(14748);
        __CLR4_5_2bcsbcslvl9ejrn.R.inc(14749);return unknown_3;
    }finally{__CLR4_5_2bcsbcslvl9ejrn.R.flushNeeded();}}

    public void setUnknown_3(int unknown_3) {try{__CLR4_5_2bcsbcslvl9ejrn.R.inc(14750);
        __CLR4_5_2bcsbcslvl9ejrn.R.inc(14751);this.unknown_3 = unknown_3;
    }finally{__CLR4_5_2bcsbcslvl9ejrn.R.flushNeeded();}}

    public int getUnknown_4() {try{__CLR4_5_2bcsbcslvl9ejrn.R.inc(14752);
        __CLR4_5_2bcsbcslvl9ejrn.R.inc(14753);return unknown_4;
    }finally{__CLR4_5_2bcsbcslvl9ejrn.R.flushNeeded();}}

    public void setUnknown_4(int unknown_4) {try{__CLR4_5_2bcsbcslvl9ejrn.R.inc(14754);
        __CLR4_5_2bcsbcslvl9ejrn.R.inc(14755);this.unknown_4 = unknown_4;
    }finally{__CLR4_5_2bcsbcslvl9ejrn.R.flushNeeded();}}

    public int getUnknown_5() {try{__CLR4_5_2bcsbcslvl9ejrn.R.inc(14756);
        __CLR4_5_2bcsbcslvl9ejrn.R.inc(14757);return unknown_5;
    }finally{__CLR4_5_2bcsbcslvl9ejrn.R.flushNeeded();}}

    public void setUnknown_5(int unknown_5) {try{__CLR4_5_2bcsbcslvl9ejrn.R.inc(14758);
        __CLR4_5_2bcsbcslvl9ejrn.R.inc(14759);this.unknown_5 = unknown_5;
    }finally{__CLR4_5_2bcsbcslvl9ejrn.R.flushNeeded();}}

    public int getUnknown_6() {try{__CLR4_5_2bcsbcslvl9ejrn.R.inc(14760);
        __CLR4_5_2bcsbcslvl9ejrn.R.inc(14761);return unknown_6;
    }finally{__CLR4_5_2bcsbcslvl9ejrn.R.flushNeeded();}}

    public void setUnknown_6(int unknown_6) {try{__CLR4_5_2bcsbcslvl9ejrn.R.inc(14762);
        __CLR4_5_2bcsbcslvl9ejrn.R.inc(14763);this.unknown_6 = unknown_6;
    }finally{__CLR4_5_2bcsbcslvl9ejrn.R.flushNeeded();}}

    public int getUnknown_7() {try{__CLR4_5_2bcsbcslvl9ejrn.R.inc(14764);
        __CLR4_5_2bcsbcslvl9ejrn.R.inc(14765);return unknown_7;
    }finally{__CLR4_5_2bcsbcslvl9ejrn.R.flushNeeded();}}

    public void setUnknown_7(int unknown_7) {try{__CLR4_5_2bcsbcslvl9ejrn.R.inc(14766);
        __CLR4_5_2bcsbcslvl9ejrn.R.inc(14767);this.unknown_7 = unknown_7;
    }finally{__CLR4_5_2bcsbcslvl9ejrn.R.flushNeeded();}}

    public int getUnknown_8() {try{__CLR4_5_2bcsbcslvl9ejrn.R.inc(14768);
        __CLR4_5_2bcsbcslvl9ejrn.R.inc(14769);return unknown_8;
    }finally{__CLR4_5_2bcsbcslvl9ejrn.R.flushNeeded();}}

    public void setUnknown_8(int unknown_8) {try{__CLR4_5_2bcsbcslvl9ejrn.R.inc(14770);
        __CLR4_5_2bcsbcslvl9ejrn.R.inc(14771);this.unknown_8 = unknown_8;
    }finally{__CLR4_5_2bcsbcslvl9ejrn.R.flushNeeded();}}

    public int getUnknown_9() {try{__CLR4_5_2bcsbcslvl9ejrn.R.inc(14772);
        __CLR4_5_2bcsbcslvl9ejrn.R.inc(14773);return unknown_9;
    }finally{__CLR4_5_2bcsbcslvl9ejrn.R.flushNeeded();}}

    public void setUnknown_9(int unknown_9) {try{__CLR4_5_2bcsbcslvl9ejrn.R.inc(14774);
        __CLR4_5_2bcsbcslvl9ejrn.R.inc(14775);this.unknown_9 = unknown_9;
    }finally{__CLR4_5_2bcsbcslvl9ejrn.R.flushNeeded();}}
}
