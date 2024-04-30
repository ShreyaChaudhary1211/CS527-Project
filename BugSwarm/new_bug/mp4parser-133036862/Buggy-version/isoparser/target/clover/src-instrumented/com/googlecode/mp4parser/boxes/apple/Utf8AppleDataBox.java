/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.googlecode.mp4parser.boxes.apple;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.Utf8;
import com.googlecode.mp4parser.annotations.DoNotParseDetail;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/**
 * 
 */
public abstract class Utf8AppleDataBox extends AppleDataBox {public static class __CLR4_5_2bp3bp3lvlulk5x{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,15175,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    String value;

    protected Utf8AppleDataBox(String type) {
        super(type, 1);__CLR4_5_2bp3bp3lvlulk5x.R.inc(15160);try{__CLR4_5_2bp3bp3lvlulk5x.R.inc(15159);
    }finally{__CLR4_5_2bp3bp3lvlulk5x.R.flushNeeded();}}

    public String getValue() {try{__CLR4_5_2bp3bp3lvlulk5x.R.inc(15161);
        //patched by Toias Bley / UltraMixer
        __CLR4_5_2bp3bp3lvlulk5x.R.inc(15162);if((((!isParsed())&&(__CLR4_5_2bp3bp3lvlulk5x.R.iget(15163)!=0|true))||(__CLR4_5_2bp3bp3lvlulk5x.R.iget(15164)==0&false)))
        {{
            __CLR4_5_2bp3bp3lvlulk5x.R.inc(15165);parseDetails();
        }
        }__CLR4_5_2bp3bp3lvlulk5x.R.inc(15166);return value;
    }finally{__CLR4_5_2bp3bp3lvlulk5x.R.flushNeeded();}}

    public void setValue(String value) {try{__CLR4_5_2bp3bp3lvlulk5x.R.inc(15167);
        __CLR4_5_2bp3bp3lvlulk5x.R.inc(15168);this.value = value;
    }finally{__CLR4_5_2bp3bp3lvlulk5x.R.flushNeeded();}}

    @DoNotParseDetail
    public byte[] writeData() {try{__CLR4_5_2bp3bp3lvlulk5x.R.inc(15169);
        __CLR4_5_2bp3bp3lvlulk5x.R.inc(15170);return Utf8.convert(value);
    }finally{__CLR4_5_2bp3bp3lvlulk5x.R.flushNeeded();}}

    @Override
    protected int getDataLength() {try{__CLR4_5_2bp3bp3lvlulk5x.R.inc(15171);
        __CLR4_5_2bp3bp3lvlulk5x.R.inc(15172);return value.getBytes(Charset.forName("UTF-8")).length;
    }finally{__CLR4_5_2bp3bp3lvlulk5x.R.flushNeeded();}}

    @Override
    protected void parseData(ByteBuffer data) {try{__CLR4_5_2bp3bp3lvlulk5x.R.inc(15173);
        __CLR4_5_2bp3bp3lvlulk5x.R.inc(15174);value = IsoTypeReader.readString(data, data.remaining());
    }finally{__CLR4_5_2bp3bp3lvlulk5x.R.flushNeeded();}}
}
