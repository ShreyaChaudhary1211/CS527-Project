/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.mp4parser.streaming.extensions;

import com.mp4parser.streaming.SampleExtension;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CompositionTimeSampleExtension implements SampleExtension {public static class __CLR4_5_2hmqhmqlvl9elge{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,22861,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static Map<Integer, CompositionTimeSampleExtension> pool =
            Collections.synchronizedMap(new HashMap<Integer, CompositionTimeSampleExtension>());

    public static CompositionTimeSampleExtension create(int offset) {try{__CLR4_5_2hmqhmqlvl9elge.R.inc(22850);
        __CLR4_5_2hmqhmqlvl9elge.R.inc(22851);CompositionTimeSampleExtension c = pool.get(offset);
        __CLR4_5_2hmqhmqlvl9elge.R.inc(22852);if ((((c == null)&&(__CLR4_5_2hmqhmqlvl9elge.R.iget(22853)!=0|true))||(__CLR4_5_2hmqhmqlvl9elge.R.iget(22854)==0&false))) {{
            __CLR4_5_2hmqhmqlvl9elge.R.inc(22855);c = new CompositionTimeSampleExtension();
            __CLR4_5_2hmqhmqlvl9elge.R.inc(22856);c.ctts = offset;
            __CLR4_5_2hmqhmqlvl9elge.R.inc(22857);pool.put(offset, c);
        }
        }__CLR4_5_2hmqhmqlvl9elge.R.inc(22858);return c;
    }finally{__CLR4_5_2hmqhmqlvl9elge.R.flushNeeded();}}

    private int ctts;

    /**
     * This value provides the offset between decoding time and composition time. The offset is expressed as
     * signed long such that CT(n) = DT(n) + CTTS(n). This method is
     *
     * @return offset between decoding time and composition time.
     */
    public int getCompositionTimeOffset() {try{__CLR4_5_2hmqhmqlvl9elge.R.inc(22859);
        __CLR4_5_2hmqhmqlvl9elge.R.inc(22860);return ctts;
    }finally{__CLR4_5_2hmqhmqlvl9elge.R.flushNeeded();}}
}
