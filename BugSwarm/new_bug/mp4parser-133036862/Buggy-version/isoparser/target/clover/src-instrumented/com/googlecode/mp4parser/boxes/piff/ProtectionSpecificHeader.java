/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.googlecode.mp4parser.boxes.piff;


import com.coremedia.iso.Hex;
import com.googlecode.mp4parser.contentprotection.GenericHeader;

import java.lang.Class;
import java.lang.IllegalAccessException;
import java.lang.InstantiationException;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.lang.StringBuilder;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;


public abstract class ProtectionSpecificHeader {public static class __CLR4_5_2e8ae8alvlulmu4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,18471,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    protected static Map<UUID, Class<? extends ProtectionSpecificHeader>> uuidRegistry = new HashMap<UUID, Class<? extends ProtectionSpecificHeader>>();

    public abstract UUID getSystemId();

    @Override
    public boolean equals(Object obj) {try{__CLR4_5_2e8ae8alvlulmu4.R.inc(18442);
        __CLR4_5_2e8ae8alvlulmu4.R.inc(18443);throw new RuntimeException("somebody called equals on me but that's not supposed to happen.");
    }finally{__CLR4_5_2e8ae8alvlulmu4.R.flushNeeded();}}

    public static ProtectionSpecificHeader createFor(UUID systemId, ByteBuffer bufferWrapper) {try{__CLR4_5_2e8ae8alvlulmu4.R.inc(18444);
        __CLR4_5_2e8ae8alvlulmu4.R.inc(18445);final Class<? extends ProtectionSpecificHeader> aClass = uuidRegistry.get(systemId);

        __CLR4_5_2e8ae8alvlulmu4.R.inc(18446);ProtectionSpecificHeader protectionSpecificHeader = null;
        __CLR4_5_2e8ae8alvlulmu4.R.inc(18447);if ((((aClass != null)&&(__CLR4_5_2e8ae8alvlulmu4.R.iget(18448)!=0|true))||(__CLR4_5_2e8ae8alvlulmu4.R.iget(18449)==0&false))) {{
            __CLR4_5_2e8ae8alvlulmu4.R.inc(18450);try {
                __CLR4_5_2e8ae8alvlulmu4.R.inc(18451);protectionSpecificHeader = aClass.newInstance();

            } catch (InstantiationException e) {
                __CLR4_5_2e8ae8alvlulmu4.R.inc(18452);throw new RuntimeException(e);
            } catch (IllegalAccessException e) {
                __CLR4_5_2e8ae8alvlulmu4.R.inc(18453);throw new RuntimeException(e);
            }
        }

        }__CLR4_5_2e8ae8alvlulmu4.R.inc(18454);if ((((protectionSpecificHeader == null)&&(__CLR4_5_2e8ae8alvlulmu4.R.iget(18455)!=0|true))||(__CLR4_5_2e8ae8alvlulmu4.R.iget(18456)==0&false))) {{
            __CLR4_5_2e8ae8alvlulmu4.R.inc(18457);protectionSpecificHeader = new GenericHeader();
        }
        }__CLR4_5_2e8ae8alvlulmu4.R.inc(18458);protectionSpecificHeader.parse(bufferWrapper);
        __CLR4_5_2e8ae8alvlulmu4.R.inc(18459);return protectionSpecificHeader;

    }finally{__CLR4_5_2e8ae8alvlulmu4.R.flushNeeded();}}

    public abstract void parse(ByteBuffer byteBuffer);

    public abstract ByteBuffer getData();

    @Override
    public String toString() {try{__CLR4_5_2e8ae8alvlulmu4.R.inc(18460);
        __CLR4_5_2e8ae8alvlulmu4.R.inc(18461);final StringBuilder sb = new StringBuilder();
        __CLR4_5_2e8ae8alvlulmu4.R.inc(18462);sb.append("ProtectionSpecificHeader");
        __CLR4_5_2e8ae8alvlulmu4.R.inc(18463);sb.append("{data=");
        __CLR4_5_2e8ae8alvlulmu4.R.inc(18464);ByteBuffer data = getData().duplicate();
        __CLR4_5_2e8ae8alvlulmu4.R.inc(18465);data.rewind();
        __CLR4_5_2e8ae8alvlulmu4.R.inc(18466);byte[] bytes = new byte[data.limit()];
        __CLR4_5_2e8ae8alvlulmu4.R.inc(18467);data.get(bytes);
        __CLR4_5_2e8ae8alvlulmu4.R.inc(18468);sb.append(Hex.encodeHex(bytes));
        __CLR4_5_2e8ae8alvlulmu4.R.inc(18469);sb.append('}');
        __CLR4_5_2e8ae8alvlulmu4.R.inc(18470);return sb.toString();
    }finally{__CLR4_5_2e8ae8alvlulmu4.R.flushNeeded();}}
}
