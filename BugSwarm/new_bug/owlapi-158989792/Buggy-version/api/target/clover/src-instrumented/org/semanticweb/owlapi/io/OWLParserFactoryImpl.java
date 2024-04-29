/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.semanticweb.owlapi.io;

import java.util.List;

import javax.annotation.Nullable;

import org.semanticweb.owlapi.model.OWLDocumentFormatFactory;

/**
 * Generic parser factory.
 * 
 * @author ignazio
 */
public abstract class OWLParserFactoryImpl implements OWLParserFactory {public static class __CLR4_5_2xcxclvickkyd{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0061\u0070\u0069\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237201267L,8589935092L,1212,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 40000L;
    private final OWLDocumentFormatFactory format;

    protected OWLParserFactoryImpl(OWLDocumentFormatFactory format) {try{__CLR4_5_2xcxclvickkyd.R.inc(1200);
        __CLR4_5_2xcxclvickkyd.R.inc(1201);this.format = format;
    }finally{__CLR4_5_2xcxclvickkyd.R.flushNeeded();}}

    @Override
    public OWLDocumentFormatFactory getSupportedFormat() {try{__CLR4_5_2xcxclvickkyd.R.inc(1202);
        __CLR4_5_2xcxclvickkyd.R.inc(1203);return format;
    }finally{__CLR4_5_2xcxclvickkyd.R.flushNeeded();}}

    @Override
    public final OWLParser get() {try{__CLR4_5_2xcxclvickkyd.R.inc(1204);
        __CLR4_5_2xcxclvickkyd.R.inc(1205);return createParser();
    }finally{__CLR4_5_2xcxclvickkyd.R.flushNeeded();}}

    @Nullable
    @Override
    public final String getDefaultMIMEType() {try{__CLR4_5_2xcxclvickkyd.R.inc(1206);
        __CLR4_5_2xcxclvickkyd.R.inc(1207);return format.getDefaultMIMEType();
    }finally{__CLR4_5_2xcxclvickkyd.R.flushNeeded();}}

    @Override
    public final List<String> getMIMETypes() {try{__CLR4_5_2xcxclvickkyd.R.inc(1208);
        __CLR4_5_2xcxclvickkyd.R.inc(1209);return format.getMIMETypes();
    }finally{__CLR4_5_2xcxclvickkyd.R.flushNeeded();}}

    @Override
    public final boolean handlesMimeType(String mimeType) {try{__CLR4_5_2xcxclvickkyd.R.inc(1210);
        __CLR4_5_2xcxclvickkyd.R.inc(1211);return format.handlesMimeType(mimeType);
    }finally{__CLR4_5_2xcxclvickkyd.R.flushNeeded();}}
}
