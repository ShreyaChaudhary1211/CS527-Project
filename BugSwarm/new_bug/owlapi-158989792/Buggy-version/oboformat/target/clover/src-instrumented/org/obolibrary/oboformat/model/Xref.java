/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.obolibrary.oboformat.model;

import javax.annotation.Nonnull;

/** Xref */
public class Xref {public static class __CLR4_5_23dq3dqlvicmt4o{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u006f\u0062\u006f\u0066\u006f\u0072\u006d\u0061\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237308750L,8589935092L,4415,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Nonnull
    String idref;
    String annotation;

    /**
     * @param idref
     *        idref
     */
    public Xref(@Nonnull String idref) {try{__CLR4_5_23dq3dqlvicmt4o.R.inc(4382);
        __CLR4_5_23dq3dqlvicmt4o.R.inc(4383);this.idref = idref;
    }finally{__CLR4_5_23dq3dqlvicmt4o.R.flushNeeded();}}

    /**
     * @return idref
     */
    @Nonnull
    public String getIdref() {try{__CLR4_5_23dq3dqlvicmt4o.R.inc(4384);
        __CLR4_5_23dq3dqlvicmt4o.R.inc(4385);return idref;
    }finally{__CLR4_5_23dq3dqlvicmt4o.R.flushNeeded();}}

    /**
     * @param idref
     *        idref
     */
    public void setIdref(@Nonnull String idref) {try{__CLR4_5_23dq3dqlvicmt4o.R.inc(4386);
        __CLR4_5_23dq3dqlvicmt4o.R.inc(4387);this.idref = idref;
    }finally{__CLR4_5_23dq3dqlvicmt4o.R.flushNeeded();}}

    /**
     * @return annotation
     */
    public String getAnnotation() {try{__CLR4_5_23dq3dqlvicmt4o.R.inc(4388);
        __CLR4_5_23dq3dqlvicmt4o.R.inc(4389);return annotation;
    }finally{__CLR4_5_23dq3dqlvicmt4o.R.flushNeeded();}}

    /**
     * @param annotation
     *        annotation
     */
    public void setAnnotation(String annotation) {try{__CLR4_5_23dq3dqlvicmt4o.R.inc(4390);
        __CLR4_5_23dq3dqlvicmt4o.R.inc(4391);this.annotation = annotation;
    }finally{__CLR4_5_23dq3dqlvicmt4o.R.flushNeeded();}}

    @Override
    public boolean equals(Object obj) {try{__CLR4_5_23dq3dqlvicmt4o.R.inc(4392);
        __CLR4_5_23dq3dqlvicmt4o.R.inc(4393);if ((((!(obj instanceof Xref))&&(__CLR4_5_23dq3dqlvicmt4o.R.iget(4394)!=0|true))||(__CLR4_5_23dq3dqlvicmt4o.R.iget(4395)==0&false))) {{
            __CLR4_5_23dq3dqlvicmt4o.R.inc(4396);return false;
        }
        }__CLR4_5_23dq3dqlvicmt4o.R.inc(4397);if ((((obj == this)&&(__CLR4_5_23dq3dqlvicmt4o.R.iget(4398)!=0|true))||(__CLR4_5_23dq3dqlvicmt4o.R.iget(4399)==0&false))) {{
            __CLR4_5_23dq3dqlvicmt4o.R.inc(4400);return true;
        }
        }__CLR4_5_23dq3dqlvicmt4o.R.inc(4401);Xref other = (Xref) obj;
        __CLR4_5_23dq3dqlvicmt4o.R.inc(4402);if ((((!idref.equals(other.idref))&&(__CLR4_5_23dq3dqlvicmt4o.R.iget(4403)!=0|true))||(__CLR4_5_23dq3dqlvicmt4o.R.iget(4404)==0&false))) {{
            __CLR4_5_23dq3dqlvicmt4o.R.inc(4405);return false;
        }
        // if (false) {
        // // TODO: make this configurable?
        // // xref comments are treated as semi-invisible
        // if (annotation == null && other.annotation == null) {
        // return true;
        // }
        // if (annotation == null || other.annotation == null) {
        // return false;
        // }
        // return annotation.equals(other.annotation);
        // }
        }__CLR4_5_23dq3dqlvicmt4o.R.inc(4406);return true;
    }finally{__CLR4_5_23dq3dqlvicmt4o.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_5_23dq3dqlvicmt4o.R.inc(4407);
        __CLR4_5_23dq3dqlvicmt4o.R.inc(4408);return idref.hashCode();
    }finally{__CLR4_5_23dq3dqlvicmt4o.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_5_23dq3dqlvicmt4o.R.inc(4409);
        __CLR4_5_23dq3dqlvicmt4o.R.inc(4410);if ((((annotation == null)&&(__CLR4_5_23dq3dqlvicmt4o.R.iget(4411)!=0|true))||(__CLR4_5_23dq3dqlvicmt4o.R.iget(4412)==0&false))) {{
            __CLR4_5_23dq3dqlvicmt4o.R.inc(4413);return idref;
        }
        }__CLR4_5_23dq3dqlvicmt4o.R.inc(4414);return '<' + idref + " \"" + annotation + "\">";
    }finally{__CLR4_5_23dq3dqlvicmt4o.R.flushNeeded();}}
}
