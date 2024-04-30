/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.obolibrary.oboformat.model;

import javax.annotation.Nonnull;

/** qualifier value */
public class QualifierValue implements Comparable<QualifierValue> {public static class __CLR4_5_23ce3celvicmt4n{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u006f\u0062\u006f\u0066\u006f\u0072\u006d\u0061\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237308750L,8589935092L,4382,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Nonnull
    protected String qualifier;
    @Nonnull
    protected String value;

    /**
     * @param q
     *        qualifier
     * @param v
     *        value
     */
    public QualifierValue(@Nonnull String q, @Nonnull String v) {try{__CLR4_5_23ce3celvicmt4n.R.inc(4334);
        __CLR4_5_23ce3celvicmt4n.R.inc(4335);qualifier = q;
        __CLR4_5_23ce3celvicmt4n.R.inc(4336);value = v;
    }finally{__CLR4_5_23ce3celvicmt4n.R.flushNeeded();}}

    /**
     * @return qualifier
     */
    @Nonnull
    public String getQualifier() {try{__CLR4_5_23ce3celvicmt4n.R.inc(4337);
        __CLR4_5_23ce3celvicmt4n.R.inc(4338);return qualifier;
    }finally{__CLR4_5_23ce3celvicmt4n.R.flushNeeded();}}

    /**
     * @param qualifier
     *        qualifier
     */
    public void setQualifier(@Nonnull String qualifier) {try{__CLR4_5_23ce3celvicmt4n.R.inc(4339);
        __CLR4_5_23ce3celvicmt4n.R.inc(4340);this.qualifier = qualifier;
    }finally{__CLR4_5_23ce3celvicmt4n.R.flushNeeded();}}

    /**
     * @return value
     */
    @Nonnull
    public String getValue() {try{__CLR4_5_23ce3celvicmt4n.R.inc(4341);
        __CLR4_5_23ce3celvicmt4n.R.inc(4342);return value;
    }finally{__CLR4_5_23ce3celvicmt4n.R.flushNeeded();}}

    /**
     * @param value
     *        value
     */
    public void setValue(@Nonnull String value) {try{__CLR4_5_23ce3celvicmt4n.R.inc(4343);
        __CLR4_5_23ce3celvicmt4n.R.inc(4344);this.value = value;
    }finally{__CLR4_5_23ce3celvicmt4n.R.flushNeeded();}}

    @Nonnull
    @Override
    public String toString() {try{__CLR4_5_23ce3celvicmt4n.R.inc(4345);
        __CLR4_5_23ce3celvicmt4n.R.inc(4346);return '{' + qualifier + '=' + value + '}';
    }finally{__CLR4_5_23ce3celvicmt4n.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_5_23ce3celvicmt4n.R.inc(4347);
        __CLR4_5_23ce3celvicmt4n.R.inc(4348);int prime = 31;
        __CLR4_5_23ce3celvicmt4n.R.inc(4349);int result = 1;
        __CLR4_5_23ce3celvicmt4n.R.inc(4350);result = prime * result + qualifier.hashCode();
        __CLR4_5_23ce3celvicmt4n.R.inc(4351);result = prime * result + value.hashCode();
        __CLR4_5_23ce3celvicmt4n.R.inc(4352);return result;
    }finally{__CLR4_5_23ce3celvicmt4n.R.flushNeeded();}}

    @Override
    public boolean equals(Object obj) {try{__CLR4_5_23ce3celvicmt4n.R.inc(4353);
        __CLR4_5_23ce3celvicmt4n.R.inc(4354);if ((((this == obj)&&(__CLR4_5_23ce3celvicmt4n.R.iget(4355)!=0|true))||(__CLR4_5_23ce3celvicmt4n.R.iget(4356)==0&false))) {{
            __CLR4_5_23ce3celvicmt4n.R.inc(4357);return true;
        }
        }__CLR4_5_23ce3celvicmt4n.R.inc(4358);if ((((obj == null)&&(__CLR4_5_23ce3celvicmt4n.R.iget(4359)!=0|true))||(__CLR4_5_23ce3celvicmt4n.R.iget(4360)==0&false))) {{
            __CLR4_5_23ce3celvicmt4n.R.inc(4361);return false;
        }
        }__CLR4_5_23ce3celvicmt4n.R.inc(4362);if ((((!(obj instanceof QualifierValue))&&(__CLR4_5_23ce3celvicmt4n.R.iget(4363)!=0|true))||(__CLR4_5_23ce3celvicmt4n.R.iget(4364)==0&false))) {{
            __CLR4_5_23ce3celvicmt4n.R.inc(4365);return false;
        }
        }__CLR4_5_23ce3celvicmt4n.R.inc(4366);QualifierValue other = (QualifierValue) obj;
        __CLR4_5_23ce3celvicmt4n.R.inc(4367);if ((((!qualifier.equals(other.qualifier))&&(__CLR4_5_23ce3celvicmt4n.R.iget(4368)!=0|true))||(__CLR4_5_23ce3celvicmt4n.R.iget(4369)==0&false))) {{
            __CLR4_5_23ce3celvicmt4n.R.inc(4370);return false;
        } }else {__CLR4_5_23ce3celvicmt4n.R.inc(4371);if ((((!value.equals(other.value))&&(__CLR4_5_23ce3celvicmt4n.R.iget(4372)!=0|true))||(__CLR4_5_23ce3celvicmt4n.R.iget(4373)==0&false))) {{
            __CLR4_5_23ce3celvicmt4n.R.inc(4374);return false;
        }
        }}__CLR4_5_23ce3celvicmt4n.R.inc(4375);return true;
    }finally{__CLR4_5_23ce3celvicmt4n.R.flushNeeded();}}

    @Override
    public int compareTo(QualifierValue o) {try{__CLR4_5_23ce3celvicmt4n.R.inc(4376);
        __CLR4_5_23ce3celvicmt4n.R.inc(4377);if ((((o == null)&&(__CLR4_5_23ce3celvicmt4n.R.iget(4378)!=0|true))||(__CLR4_5_23ce3celvicmt4n.R.iget(4379)==0&false))) {{
            __CLR4_5_23ce3celvicmt4n.R.inc(4380);return 1;
        }
        // use toString representation
        }__CLR4_5_23ce3celvicmt4n.R.inc(4381);return toString().compareTo(o.toString());
    }finally{__CLR4_5_23ce3celvicmt4n.R.flushNeeded();}}
}
