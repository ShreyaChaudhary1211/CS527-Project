/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.googlecode.mp4parser.boxes.apple;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractFullBox;

import java.nio.ByteBuffer;

/**
 * <h1>4cc = "{@value #TYPE}"</h1>
 */
public class BaseMediaInfoAtom extends AbstractFullBox {public static class __CLR4_5_2bdjbdjlvlulk0w{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,14789,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static final String TYPE = "gmin";

    short graphicsMode = 64;
    int opColorR = 32768;
    int opColorG = 32768;
    int opColorB = 32768;
    short balance;
    short reserved;

    public BaseMediaInfoAtom() {
        super(TYPE);__CLR4_5_2bdjbdjlvlulk0w.R.inc(14744);try{__CLR4_5_2bdjbdjlvlulk0w.R.inc(14743);
    }finally{__CLR4_5_2bdjbdjlvlulk0w.R.flushNeeded();}}

    @Override
    protected long getContentSize() {try{__CLR4_5_2bdjbdjlvlulk0w.R.inc(14745);
        __CLR4_5_2bdjbdjlvlulk0w.R.inc(14746);return 16;
    }finally{__CLR4_5_2bdjbdjlvlulk0w.R.flushNeeded();}}

    @Override
    protected void getContent(ByteBuffer byteBuffer) {try{__CLR4_5_2bdjbdjlvlulk0w.R.inc(14747);
        __CLR4_5_2bdjbdjlvlulk0w.R.inc(14748);writeVersionAndFlags(byteBuffer);
        __CLR4_5_2bdjbdjlvlulk0w.R.inc(14749);byteBuffer.putShort(graphicsMode);
        __CLR4_5_2bdjbdjlvlulk0w.R.inc(14750);IsoTypeWriter.writeUInt16(byteBuffer, opColorR);
        __CLR4_5_2bdjbdjlvlulk0w.R.inc(14751);IsoTypeWriter.writeUInt16(byteBuffer, opColorG);
        __CLR4_5_2bdjbdjlvlulk0w.R.inc(14752);IsoTypeWriter.writeUInt16(byteBuffer, opColorB);
        __CLR4_5_2bdjbdjlvlulk0w.R.inc(14753);byteBuffer.putShort(balance);
        __CLR4_5_2bdjbdjlvlulk0w.R.inc(14754);byteBuffer.putShort(reserved);
    }finally{__CLR4_5_2bdjbdjlvlulk0w.R.flushNeeded();}}

    @Override
    protected void _parseDetails(ByteBuffer content) {try{__CLR4_5_2bdjbdjlvlulk0w.R.inc(14755);
        __CLR4_5_2bdjbdjlvlulk0w.R.inc(14756);parseVersionAndFlags(content);
        __CLR4_5_2bdjbdjlvlulk0w.R.inc(14757);graphicsMode = content.getShort();
        __CLR4_5_2bdjbdjlvlulk0w.R.inc(14758);opColorR = IsoTypeReader.readUInt16(content);
        __CLR4_5_2bdjbdjlvlulk0w.R.inc(14759);opColorG = IsoTypeReader.readUInt16(content);
        __CLR4_5_2bdjbdjlvlulk0w.R.inc(14760);opColorB = IsoTypeReader.readUInt16(content);
        __CLR4_5_2bdjbdjlvlulk0w.R.inc(14761);balance = content.getShort();
        __CLR4_5_2bdjbdjlvlulk0w.R.inc(14762);reserved = content.getShort();

    }finally{__CLR4_5_2bdjbdjlvlulk0w.R.flushNeeded();}}

    public short getGraphicsMode() {try{__CLR4_5_2bdjbdjlvlulk0w.R.inc(14763);
        __CLR4_5_2bdjbdjlvlulk0w.R.inc(14764);return graphicsMode;
    }finally{__CLR4_5_2bdjbdjlvlulk0w.R.flushNeeded();}}

    public void setGraphicsMode(short graphicsMode) {try{__CLR4_5_2bdjbdjlvlulk0w.R.inc(14765);
        __CLR4_5_2bdjbdjlvlulk0w.R.inc(14766);this.graphicsMode = graphicsMode;
    }finally{__CLR4_5_2bdjbdjlvlulk0w.R.flushNeeded();}}

    public int getOpColorR() {try{__CLR4_5_2bdjbdjlvlulk0w.R.inc(14767);
        __CLR4_5_2bdjbdjlvlulk0w.R.inc(14768);return opColorR;
    }finally{__CLR4_5_2bdjbdjlvlulk0w.R.flushNeeded();}}

    public void setOpColorR(int opColorR) {try{__CLR4_5_2bdjbdjlvlulk0w.R.inc(14769);
        __CLR4_5_2bdjbdjlvlulk0w.R.inc(14770);this.opColorR = opColorR;
    }finally{__CLR4_5_2bdjbdjlvlulk0w.R.flushNeeded();}}

    public int getOpColorG() {try{__CLR4_5_2bdjbdjlvlulk0w.R.inc(14771);
        __CLR4_5_2bdjbdjlvlulk0w.R.inc(14772);return opColorG;
    }finally{__CLR4_5_2bdjbdjlvlulk0w.R.flushNeeded();}}

    public void setOpColorG(int opColorG) {try{__CLR4_5_2bdjbdjlvlulk0w.R.inc(14773);
        __CLR4_5_2bdjbdjlvlulk0w.R.inc(14774);this.opColorG = opColorG;
    }finally{__CLR4_5_2bdjbdjlvlulk0w.R.flushNeeded();}}

    public int getOpColorB() {try{__CLR4_5_2bdjbdjlvlulk0w.R.inc(14775);
        __CLR4_5_2bdjbdjlvlulk0w.R.inc(14776);return opColorB;
    }finally{__CLR4_5_2bdjbdjlvlulk0w.R.flushNeeded();}}

    public void setOpColorB(int opColorB) {try{__CLR4_5_2bdjbdjlvlulk0w.R.inc(14777);
        __CLR4_5_2bdjbdjlvlulk0w.R.inc(14778);this.opColorB = opColorB;
    }finally{__CLR4_5_2bdjbdjlvlulk0w.R.flushNeeded();}}

    public short getBalance() {try{__CLR4_5_2bdjbdjlvlulk0w.R.inc(14779);
        __CLR4_5_2bdjbdjlvlulk0w.R.inc(14780);return balance;
    }finally{__CLR4_5_2bdjbdjlvlulk0w.R.flushNeeded();}}

    public void setBalance(short balance) {try{__CLR4_5_2bdjbdjlvlulk0w.R.inc(14781);
        __CLR4_5_2bdjbdjlvlulk0w.R.inc(14782);this.balance = balance;
    }finally{__CLR4_5_2bdjbdjlvlulk0w.R.flushNeeded();}}

    public short getReserved() {try{__CLR4_5_2bdjbdjlvlulk0w.R.inc(14783);
        __CLR4_5_2bdjbdjlvlulk0w.R.inc(14784);return reserved;
    }finally{__CLR4_5_2bdjbdjlvlulk0w.R.flushNeeded();}}

    public void setReserved(short reserved) {try{__CLR4_5_2bdjbdjlvlulk0w.R.inc(14785);
        __CLR4_5_2bdjbdjlvlulk0w.R.inc(14786);this.reserved = reserved;
    }finally{__CLR4_5_2bdjbdjlvlulk0w.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_5_2bdjbdjlvlulk0w.R.inc(14787);
        __CLR4_5_2bdjbdjlvlulk0w.R.inc(14788);return "BaseMediaInfoAtom{" +
                "graphicsMode=" + graphicsMode +
                ", opColorR=" + opColorR +
                ", opColorG=" + opColorG +
                ", opColorB=" + opColorB +
                ", balance=" + balance +
                ", reserved=" + reserved +
                '}';
    }finally{__CLR4_5_2bdjbdjlvlulk0w.R.flushNeeded();}}
}
