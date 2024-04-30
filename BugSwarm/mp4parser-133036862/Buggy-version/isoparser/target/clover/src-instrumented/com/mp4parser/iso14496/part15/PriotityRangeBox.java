/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.mp4parser.iso14496.part15;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractBox;

import java.nio.ByteBuffer;

/**
 * Created by sannies on 08.09.2014.
 */
public class PriotityRangeBox extends AbstractBox {public static class __CLR4_5_2gojgojlvlulnrn{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,21649,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static final String TYPE = "svpr";

    int reserved1 = 0;
    int min_priorityId;
    int reserved2 = 0;
    int max_priorityId;

    public PriotityRangeBox() {
        super(TYPE);__CLR4_5_2gojgojlvlulnrn.R.inc(21620);try{__CLR4_5_2gojgojlvlulnrn.R.inc(21619);
    }finally{__CLR4_5_2gojgojlvlulnrn.R.flushNeeded();}}

    @Override
    protected long getContentSize() {try{__CLR4_5_2gojgojlvlulnrn.R.inc(21621);
        __CLR4_5_2gojgojlvlulnrn.R.inc(21622);return 2;
    }finally{__CLR4_5_2gojgojlvlulnrn.R.flushNeeded();}}

    @Override
    protected void getContent(ByteBuffer byteBuffer) {try{__CLR4_5_2gojgojlvlulnrn.R.inc(21623);
        __CLR4_5_2gojgojlvlulnrn.R.inc(21624);IsoTypeWriter.writeUInt8(byteBuffer, (reserved1 << 6) + min_priorityId);
        __CLR4_5_2gojgojlvlulnrn.R.inc(21625);IsoTypeWriter.writeUInt8(byteBuffer, (reserved2 << 6) + max_priorityId);
    }finally{__CLR4_5_2gojgojlvlulnrn.R.flushNeeded();}}

    @Override
    protected void _parseDetails(ByteBuffer content) {try{__CLR4_5_2gojgojlvlulnrn.R.inc(21626);
        __CLR4_5_2gojgojlvlulnrn.R.inc(21627);min_priorityId = IsoTypeReader.readUInt8(content);
        __CLR4_5_2gojgojlvlulnrn.R.inc(21628);reserved1 = (min_priorityId &0xC0) >> 6;
        __CLR4_5_2gojgojlvlulnrn.R.inc(21629);min_priorityId &= 0x3F;
        __CLR4_5_2gojgojlvlulnrn.R.inc(21630);max_priorityId = IsoTypeReader.readUInt8(content);
        __CLR4_5_2gojgojlvlulnrn.R.inc(21631);reserved2 = (max_priorityId &0xC0) >> 6;
        __CLR4_5_2gojgojlvlulnrn.R.inc(21632);max_priorityId &= 0x3F;
    }finally{__CLR4_5_2gojgojlvlulnrn.R.flushNeeded();}}

    public int getReserved1() {try{__CLR4_5_2gojgojlvlulnrn.R.inc(21633);
        __CLR4_5_2gojgojlvlulnrn.R.inc(21634);return reserved1;
    }finally{__CLR4_5_2gojgojlvlulnrn.R.flushNeeded();}}

    public void setReserved1(int reserved1) {try{__CLR4_5_2gojgojlvlulnrn.R.inc(21635);
        __CLR4_5_2gojgojlvlulnrn.R.inc(21636);this.reserved1 = reserved1;
    }finally{__CLR4_5_2gojgojlvlulnrn.R.flushNeeded();}}

    public int getMin_priorityId() {try{__CLR4_5_2gojgojlvlulnrn.R.inc(21637);
        __CLR4_5_2gojgojlvlulnrn.R.inc(21638);return min_priorityId;
    }finally{__CLR4_5_2gojgojlvlulnrn.R.flushNeeded();}}

    public void setMin_priorityId(int min_priorityId) {try{__CLR4_5_2gojgojlvlulnrn.R.inc(21639);
        __CLR4_5_2gojgojlvlulnrn.R.inc(21640);this.min_priorityId = min_priorityId;
    }finally{__CLR4_5_2gojgojlvlulnrn.R.flushNeeded();}}

    public int getReserved2() {try{__CLR4_5_2gojgojlvlulnrn.R.inc(21641);
        __CLR4_5_2gojgojlvlulnrn.R.inc(21642);return reserved2;
    }finally{__CLR4_5_2gojgojlvlulnrn.R.flushNeeded();}}

    public void setReserved2(int reserved2) {try{__CLR4_5_2gojgojlvlulnrn.R.inc(21643);
        __CLR4_5_2gojgojlvlulnrn.R.inc(21644);this.reserved2 = reserved2;
    }finally{__CLR4_5_2gojgojlvlulnrn.R.flushNeeded();}}

    public int getMax_priorityId() {try{__CLR4_5_2gojgojlvlulnrn.R.inc(21645);
        __CLR4_5_2gojgojlvlulnrn.R.inc(21646);return max_priorityId;
    }finally{__CLR4_5_2gojgojlvlulnrn.R.flushNeeded();}}

    public void setMax_priorityId(int max_priorityId) {try{__CLR4_5_2gojgojlvlulnrn.R.inc(21647);
        __CLR4_5_2gojgojlvlulnrn.R.inc(21648);this.max_priorityId = max_priorityId;
    }finally{__CLR4_5_2gojgojlvlulnrn.R.flushNeeded();}}
}
