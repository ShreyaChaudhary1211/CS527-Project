/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.mp4parser.iso14496.part15;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractBox;

import java.nio.ByteBuffer;

/**
 * Created by sannies on 08.09.2014.
 */
public class TierBitRateBox extends AbstractBox {public static class __CLR4_5_2gvlgvllvlulnu0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,21915,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static final String TYPE = "tibr";

    long baseBitRate;
    long maxBitRate;
    long avgBitRate;
    long tierBaseBitRate;
    long tierMaxBitRate;
    long tierAvgBitRate;

    public TierBitRateBox() {
        super(TYPE);__CLR4_5_2gvlgvllvlulnu0.R.inc(21874);try{__CLR4_5_2gvlgvllvlulnu0.R.inc(21873);
    }finally{__CLR4_5_2gvlgvllvlulnu0.R.flushNeeded();}}

    @Override
    protected long getContentSize() {try{__CLR4_5_2gvlgvllvlulnu0.R.inc(21875);
        __CLR4_5_2gvlgvllvlulnu0.R.inc(21876);return 24;
    }finally{__CLR4_5_2gvlgvllvlulnu0.R.flushNeeded();}}

    @Override
    protected void getContent(ByteBuffer byteBuffer) {try{__CLR4_5_2gvlgvllvlulnu0.R.inc(21877);
        __CLR4_5_2gvlgvllvlulnu0.R.inc(21878);IsoTypeWriter.writeUInt32(byteBuffer, baseBitRate);
        __CLR4_5_2gvlgvllvlulnu0.R.inc(21879);IsoTypeWriter.writeUInt32(byteBuffer, maxBitRate);
        __CLR4_5_2gvlgvllvlulnu0.R.inc(21880);IsoTypeWriter.writeUInt32(byteBuffer, avgBitRate);
        __CLR4_5_2gvlgvllvlulnu0.R.inc(21881);IsoTypeWriter.writeUInt32(byteBuffer, tierBaseBitRate);
        __CLR4_5_2gvlgvllvlulnu0.R.inc(21882);IsoTypeWriter.writeUInt32(byteBuffer, tierMaxBitRate);
        __CLR4_5_2gvlgvllvlulnu0.R.inc(21883);IsoTypeWriter.writeUInt32(byteBuffer, tierAvgBitRate);

    }finally{__CLR4_5_2gvlgvllvlulnu0.R.flushNeeded();}}

    @Override
    protected void _parseDetails(ByteBuffer content) {try{__CLR4_5_2gvlgvllvlulnu0.R.inc(21884);
        __CLR4_5_2gvlgvllvlulnu0.R.inc(21885);baseBitRate = IsoTypeReader.readUInt32(content);
        __CLR4_5_2gvlgvllvlulnu0.R.inc(21886);maxBitRate = IsoTypeReader.readUInt32(content);
        __CLR4_5_2gvlgvllvlulnu0.R.inc(21887);avgBitRate = IsoTypeReader.readUInt32(content);
        __CLR4_5_2gvlgvllvlulnu0.R.inc(21888);tierBaseBitRate = IsoTypeReader.readUInt32(content);
        __CLR4_5_2gvlgvllvlulnu0.R.inc(21889);tierMaxBitRate = IsoTypeReader.readUInt32(content);
        __CLR4_5_2gvlgvllvlulnu0.R.inc(21890);tierAvgBitRate = IsoTypeReader.readUInt32(content);
    }finally{__CLR4_5_2gvlgvllvlulnu0.R.flushNeeded();}}

    public long getBaseBitRate() {try{__CLR4_5_2gvlgvllvlulnu0.R.inc(21891);
        __CLR4_5_2gvlgvllvlulnu0.R.inc(21892);return baseBitRate;
    }finally{__CLR4_5_2gvlgvllvlulnu0.R.flushNeeded();}}

    public void setBaseBitRate(long baseBitRate) {try{__CLR4_5_2gvlgvllvlulnu0.R.inc(21893);
        __CLR4_5_2gvlgvllvlulnu0.R.inc(21894);this.baseBitRate = baseBitRate;
    }finally{__CLR4_5_2gvlgvllvlulnu0.R.flushNeeded();}}

    public long getMaxBitRate() {try{__CLR4_5_2gvlgvllvlulnu0.R.inc(21895);
        __CLR4_5_2gvlgvllvlulnu0.R.inc(21896);return maxBitRate;
    }finally{__CLR4_5_2gvlgvllvlulnu0.R.flushNeeded();}}

    public void setMaxBitRate(long maxBitRate) {try{__CLR4_5_2gvlgvllvlulnu0.R.inc(21897);
        __CLR4_5_2gvlgvllvlulnu0.R.inc(21898);this.maxBitRate = maxBitRate;
    }finally{__CLR4_5_2gvlgvllvlulnu0.R.flushNeeded();}}

    public long getAvgBitRate() {try{__CLR4_5_2gvlgvllvlulnu0.R.inc(21899);
        __CLR4_5_2gvlgvllvlulnu0.R.inc(21900);return avgBitRate;
    }finally{__CLR4_5_2gvlgvllvlulnu0.R.flushNeeded();}}

    public void setAvgBitRate(long avgBitRate) {try{__CLR4_5_2gvlgvllvlulnu0.R.inc(21901);
        __CLR4_5_2gvlgvllvlulnu0.R.inc(21902);this.avgBitRate = avgBitRate;
    }finally{__CLR4_5_2gvlgvllvlulnu0.R.flushNeeded();}}

    public long getTierBaseBitRate() {try{__CLR4_5_2gvlgvllvlulnu0.R.inc(21903);
        __CLR4_5_2gvlgvllvlulnu0.R.inc(21904);return tierBaseBitRate;
    }finally{__CLR4_5_2gvlgvllvlulnu0.R.flushNeeded();}}

    public void setTierBaseBitRate(long tierBaseBitRate) {try{__CLR4_5_2gvlgvllvlulnu0.R.inc(21905);
        __CLR4_5_2gvlgvllvlulnu0.R.inc(21906);this.tierBaseBitRate = tierBaseBitRate;
    }finally{__CLR4_5_2gvlgvllvlulnu0.R.flushNeeded();}}

    public long getTierMaxBitRate() {try{__CLR4_5_2gvlgvllvlulnu0.R.inc(21907);
        __CLR4_5_2gvlgvllvlulnu0.R.inc(21908);return tierMaxBitRate;
    }finally{__CLR4_5_2gvlgvllvlulnu0.R.flushNeeded();}}

    public void setTierMaxBitRate(long tierMaxBitRate) {try{__CLR4_5_2gvlgvllvlulnu0.R.inc(21909);
        __CLR4_5_2gvlgvllvlulnu0.R.inc(21910);this.tierMaxBitRate = tierMaxBitRate;
    }finally{__CLR4_5_2gvlgvllvlulnu0.R.flushNeeded();}}

    public long getTierAvgBitRate() {try{__CLR4_5_2gvlgvllvlulnu0.R.inc(21911);
        __CLR4_5_2gvlgvllvlulnu0.R.inc(21912);return tierAvgBitRate;
    }finally{__CLR4_5_2gvlgvllvlulnu0.R.flushNeeded();}}

    public void setTierAvgBitRate(long tierAvgBitRate) {try{__CLR4_5_2gvlgvllvlulnu0.R.inc(21913);
        __CLR4_5_2gvlgvllvlulnu0.R.inc(21914);this.tierAvgBitRate = tierAvgBitRate;
    }finally{__CLR4_5_2gvlgvllvlulnu0.R.flushNeeded();}}
}
