/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.googlecode.mp4parser.boxes.apple;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractFullBox;

import java.nio.ByteBuffer;

/**
 * <h1>4cc = "{@value #TYPE}"</h1>
 */
public class BaseMediaInfoAtom extends AbstractFullBox {public static class __CLR4_5_2bawbawlvl9ejrf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,14694,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static final String TYPE = "gmin";

    short graphicsMode = 64;
    int opColorR = 32768;
    int opColorG = 32768;
    int opColorB = 32768;
    short balance;
    short reserved;

    public BaseMediaInfoAtom() {
        super(TYPE);__CLR4_5_2bawbawlvl9ejrf.R.inc(14649);try{__CLR4_5_2bawbawlvl9ejrf.R.inc(14648);
    }finally{__CLR4_5_2bawbawlvl9ejrf.R.flushNeeded();}}

    @Override
    protected long getContentSize() {try{__CLR4_5_2bawbawlvl9ejrf.R.inc(14650);
        __CLR4_5_2bawbawlvl9ejrf.R.inc(14651);return 16;
    }finally{__CLR4_5_2bawbawlvl9ejrf.R.flushNeeded();}}

    @Override
    protected void getContent(ByteBuffer byteBuffer) {try{__CLR4_5_2bawbawlvl9ejrf.R.inc(14652);
        __CLR4_5_2bawbawlvl9ejrf.R.inc(14653);writeVersionAndFlags(byteBuffer);
        __CLR4_5_2bawbawlvl9ejrf.R.inc(14654);byteBuffer.putShort(graphicsMode);
        __CLR4_5_2bawbawlvl9ejrf.R.inc(14655);IsoTypeWriter.writeUInt16(byteBuffer, opColorR);
        __CLR4_5_2bawbawlvl9ejrf.R.inc(14656);IsoTypeWriter.writeUInt16(byteBuffer, opColorG);
        __CLR4_5_2bawbawlvl9ejrf.R.inc(14657);IsoTypeWriter.writeUInt16(byteBuffer, opColorB);
        __CLR4_5_2bawbawlvl9ejrf.R.inc(14658);byteBuffer.putShort(balance);
        __CLR4_5_2bawbawlvl9ejrf.R.inc(14659);byteBuffer.putShort(reserved);
    }finally{__CLR4_5_2bawbawlvl9ejrf.R.flushNeeded();}}

    @Override
    protected void _parseDetails(ByteBuffer content) {try{__CLR4_5_2bawbawlvl9ejrf.R.inc(14660);
        __CLR4_5_2bawbawlvl9ejrf.R.inc(14661);parseVersionAndFlags(content);
        __CLR4_5_2bawbawlvl9ejrf.R.inc(14662);graphicsMode = content.getShort();
        __CLR4_5_2bawbawlvl9ejrf.R.inc(14663);opColorR = IsoTypeReader.readUInt16(content);
        __CLR4_5_2bawbawlvl9ejrf.R.inc(14664);opColorG = IsoTypeReader.readUInt16(content);
        __CLR4_5_2bawbawlvl9ejrf.R.inc(14665);opColorB = IsoTypeReader.readUInt16(content);
        __CLR4_5_2bawbawlvl9ejrf.R.inc(14666);balance = content.getShort();
        __CLR4_5_2bawbawlvl9ejrf.R.inc(14667);reserved = content.getShort();

    }finally{__CLR4_5_2bawbawlvl9ejrf.R.flushNeeded();}}

    public short getGraphicsMode() {try{__CLR4_5_2bawbawlvl9ejrf.R.inc(14668);
        __CLR4_5_2bawbawlvl9ejrf.R.inc(14669);return graphicsMode;
    }finally{__CLR4_5_2bawbawlvl9ejrf.R.flushNeeded();}}

    public void setGraphicsMode(short graphicsMode) {try{__CLR4_5_2bawbawlvl9ejrf.R.inc(14670);
        __CLR4_5_2bawbawlvl9ejrf.R.inc(14671);this.graphicsMode = graphicsMode;
    }finally{__CLR4_5_2bawbawlvl9ejrf.R.flushNeeded();}}

    public int getOpColorR() {try{__CLR4_5_2bawbawlvl9ejrf.R.inc(14672);
        __CLR4_5_2bawbawlvl9ejrf.R.inc(14673);return opColorR;
    }finally{__CLR4_5_2bawbawlvl9ejrf.R.flushNeeded();}}

    public void setOpColorR(int opColorR) {try{__CLR4_5_2bawbawlvl9ejrf.R.inc(14674);
        __CLR4_5_2bawbawlvl9ejrf.R.inc(14675);this.opColorR = opColorR;
    }finally{__CLR4_5_2bawbawlvl9ejrf.R.flushNeeded();}}

    public int getOpColorG() {try{__CLR4_5_2bawbawlvl9ejrf.R.inc(14676);
        __CLR4_5_2bawbawlvl9ejrf.R.inc(14677);return opColorG;
    }finally{__CLR4_5_2bawbawlvl9ejrf.R.flushNeeded();}}

    public void setOpColorG(int opColorG) {try{__CLR4_5_2bawbawlvl9ejrf.R.inc(14678);
        __CLR4_5_2bawbawlvl9ejrf.R.inc(14679);this.opColorG = opColorG;
    }finally{__CLR4_5_2bawbawlvl9ejrf.R.flushNeeded();}}

    public int getOpColorB() {try{__CLR4_5_2bawbawlvl9ejrf.R.inc(14680);
        __CLR4_5_2bawbawlvl9ejrf.R.inc(14681);return opColorB;
    }finally{__CLR4_5_2bawbawlvl9ejrf.R.flushNeeded();}}

    public void setOpColorB(int opColorB) {try{__CLR4_5_2bawbawlvl9ejrf.R.inc(14682);
        __CLR4_5_2bawbawlvl9ejrf.R.inc(14683);this.opColorB = opColorB;
    }finally{__CLR4_5_2bawbawlvl9ejrf.R.flushNeeded();}}

    public short getBalance() {try{__CLR4_5_2bawbawlvl9ejrf.R.inc(14684);
        __CLR4_5_2bawbawlvl9ejrf.R.inc(14685);return balance;
    }finally{__CLR4_5_2bawbawlvl9ejrf.R.flushNeeded();}}

    public void setBalance(short balance) {try{__CLR4_5_2bawbawlvl9ejrf.R.inc(14686);
        __CLR4_5_2bawbawlvl9ejrf.R.inc(14687);this.balance = balance;
    }finally{__CLR4_5_2bawbawlvl9ejrf.R.flushNeeded();}}

    public short getReserved() {try{__CLR4_5_2bawbawlvl9ejrf.R.inc(14688);
        __CLR4_5_2bawbawlvl9ejrf.R.inc(14689);return reserved;
    }finally{__CLR4_5_2bawbawlvl9ejrf.R.flushNeeded();}}

    public void setReserved(short reserved) {try{__CLR4_5_2bawbawlvl9ejrf.R.inc(14690);
        __CLR4_5_2bawbawlvl9ejrf.R.inc(14691);this.reserved = reserved;
    }finally{__CLR4_5_2bawbawlvl9ejrf.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_5_2bawbawlvl9ejrf.R.inc(14692);
        __CLR4_5_2bawbawlvl9ejrf.R.inc(14693);return "BaseMediaInfoAtom{" +
                "graphicsMode=" + graphicsMode +
                ", opColorR=" + opColorR +
                ", opColorG=" + opColorG +
                ", opColorB=" + opColorB +
                ", balance=" + balance +
                ", reserved=" + reserved +
                '}';
    }finally{__CLR4_5_2bawbawlvl9ejrf.R.flushNeeded();}}
}
