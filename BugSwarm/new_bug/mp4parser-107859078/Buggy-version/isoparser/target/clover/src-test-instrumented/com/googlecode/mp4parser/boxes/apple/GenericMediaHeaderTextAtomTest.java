/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.googlecode.mp4parser.boxes.apple;

import com.googlecode.mp4parser.boxes.BoxWriteReadBase;

import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: sannies
 * Date: 6/24/12
 * Time: 4:59 PM
 * To change this template use File | Settings | File Templates.
 */
public class GenericMediaHeaderTextAtomTest extends BoxWriteReadBase<GenericMediaHeaderTextAtom> {static class __CLR4_5_2j9lj9llvl9emvb{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413286414L,8589935092L,24983,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public GenericMediaHeaderTextAtomTest() {
        super("gmhd");__CLR4_5_2j9lj9llvl9emvb.R.inc(24970);try{__CLR4_5_2j9lj9llvl9emvb.R.inc(24969);
    }finally{__CLR4_5_2j9lj9llvl9emvb.R.flushNeeded();}}

    @Override
    public Class<GenericMediaHeaderTextAtom> getBoxUnderTest() {try{__CLR4_5_2j9lj9llvl9emvb.R.inc(24971);
        __CLR4_5_2j9lj9llvl9emvb.R.inc(24972);return GenericMediaHeaderTextAtom.class;
    }finally{__CLR4_5_2j9lj9llvl9emvb.R.flushNeeded();}}

    @Override
    public void setupProperties(Map<String, Object> addPropsHere, GenericMediaHeaderTextAtom box) {try{__CLR4_5_2j9lj9llvl9emvb.R.inc(24973);
        __CLR4_5_2j9lj9llvl9emvb.R.inc(24974);addPropsHere.put("unknown_1", (int) 1);
        __CLR4_5_2j9lj9llvl9emvb.R.inc(24975);addPropsHere.put("unknown_2", (int) 2);
        __CLR4_5_2j9lj9llvl9emvb.R.inc(24976);addPropsHere.put("unknown_3", (int) 3);
        __CLR4_5_2j9lj9llvl9emvb.R.inc(24977);addPropsHere.put("unknown_4", (int) 4);
        __CLR4_5_2j9lj9llvl9emvb.R.inc(24978);addPropsHere.put("unknown_5", (int) 5);
        __CLR4_5_2j9lj9llvl9emvb.R.inc(24979);addPropsHere.put("unknown_6", (int) 6);
        __CLR4_5_2j9lj9llvl9emvb.R.inc(24980);addPropsHere.put("unknown_7", (int) 7);
        __CLR4_5_2j9lj9llvl9emvb.R.inc(24981);addPropsHere.put("unknown_8", (int) 8);
        __CLR4_5_2j9lj9llvl9emvb.R.inc(24982);addPropsHere.put("unknown_9", (int) 9);
    }finally{__CLR4_5_2j9lj9llvl9emvb.R.flushNeeded();}}
}
