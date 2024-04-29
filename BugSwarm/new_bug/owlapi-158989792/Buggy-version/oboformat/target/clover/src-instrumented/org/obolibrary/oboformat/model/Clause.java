/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.obolibrary.oboformat.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import org.obolibrary.oboformat.parser.OBOFormatConstants.OboFormatTag;

/** Clause */
@java.lang.SuppressWarnings({"fallthrough"}) public class Clause {public static class __CLR4_5_22v52v5lvicmt2l{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u006f\u0062\u006f\u0066\u006f\u0072\u006d\u0061\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237308750L,8589935092L,3982,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    protected String tag;
    @Nonnull
    protected List<Object> values = new ArrayList<>();
    @Nonnull
    protected Collection<Xref> xrefs = new ArrayList<>();
    @Nonnull
    protected Collection<QualifierValue> qualifierValues = new ArrayList<>();

    /**
     * @param tag
     *        tag
     */
    public Clause(@Nonnull OboFormatTag tag) {
        this(tag.getTag());__CLR4_5_22v52v5lvicmt2l.R.inc(3714);try{__CLR4_5_22v52v5lvicmt2l.R.inc(3713);
    }finally{__CLR4_5_22v52v5lvicmt2l.R.flushNeeded();}}

    /**
     * @param tag
     *        tag
     */
    public Clause(String tag) {try{__CLR4_5_22v52v5lvicmt2l.R.inc(3715);
        __CLR4_5_22v52v5lvicmt2l.R.inc(3716);this.tag = tag;
    }finally{__CLR4_5_22v52v5lvicmt2l.R.flushNeeded();}}

    /**
     * @param tag
     *        tag
     * @param value
     *        value
     */
    public Clause(String tag, String value) {
        this(tag);__CLR4_5_22v52v5lvicmt2l.R.inc(3718);try{__CLR4_5_22v52v5lvicmt2l.R.inc(3717);
        __CLR4_5_22v52v5lvicmt2l.R.inc(3719);setValue(value);
    }finally{__CLR4_5_22v52v5lvicmt2l.R.flushNeeded();}}

    /**
     * @param tag
     *        tag
     * @param value
     *        value
     */
    public Clause(@Nonnull OboFormatTag tag, String value) {
        this(tag.getTag(), value);__CLR4_5_22v52v5lvicmt2l.R.inc(3721);try{__CLR4_5_22v52v5lvicmt2l.R.inc(3720);
    }finally{__CLR4_5_22v52v5lvicmt2l.R.flushNeeded();}}

    /**
     * default constructor
     * 
     * @deprecated use Clause(String). Using this constructor makes the hashcode
     *             variable.
     */
    @Deprecated
    public Clause() {try{__CLR4_5_22v52v5lvicmt2l.R.inc(3722);}finally{__CLR4_5_22v52v5lvicmt2l.R.flushNeeded();}}

    /**
     * freezing a clause signals that the clause has become quiescent, and that data structures can be adjusted to
     * increase performance, or reduce memory consumption.
     */
    void freeze() {try{__CLR4_5_22v52v5lvicmt2l.R.inc(3723);
        __CLR4_5_22v52v5lvicmt2l.R.inc(3724);freezeValues();
        __CLR4_5_22v52v5lvicmt2l.R.inc(3725);freezeXrefs();
        __CLR4_5_22v52v5lvicmt2l.R.inc(3726);freezeQualifiers();
    }finally{__CLR4_5_22v52v5lvicmt2l.R.flushNeeded();}}

    void freezeValues() {try{__CLR4_5_22v52v5lvicmt2l.R.inc(3727);
        boolean __CLB4_5_2_bool0=false;__CLR4_5_22v52v5lvicmt2l.R.inc(3728);switch (values.size()) {
            case 0:if (!__CLB4_5_2_bool0) {__CLR4_5_22v52v5lvicmt2l.R.inc(3729);__CLB4_5_2_bool0=true;}
                __CLR4_5_22v52v5lvicmt2l.R.inc(3730);values = Collections.emptyList();
                __CLR4_5_22v52v5lvicmt2l.R.inc(3731);break;
            case 1:if (!__CLB4_5_2_bool0) {__CLR4_5_22v52v5lvicmt2l.R.inc(3732);__CLB4_5_2_bool0=true;}
                __CLR4_5_22v52v5lvicmt2l.R.inc(3733);Object o = values.iterator().next();
                __CLR4_5_22v52v5lvicmt2l.R.inc(3734);values = Collections.singletonList(o);
                __CLR4_5_22v52v5lvicmt2l.R.inc(3735);break;
            default:if (!__CLB4_5_2_bool0) {__CLR4_5_22v52v5lvicmt2l.R.inc(3736);__CLB4_5_2_bool0=true;}
                __CLR4_5_22v52v5lvicmt2l.R.inc(3737);((ArrayList) values).trimToSize();
        }
    }finally{__CLR4_5_22v52v5lvicmt2l.R.flushNeeded();}}

    void freezeXrefs() {try{__CLR4_5_22v52v5lvicmt2l.R.inc(3738);
        boolean __CLB4_5_2_bool1=false;__CLR4_5_22v52v5lvicmt2l.R.inc(3739);switch (xrefs.size()) {
            case 0:if (!__CLB4_5_2_bool1) {__CLR4_5_22v52v5lvicmt2l.R.inc(3740);__CLB4_5_2_bool1=true;}
                __CLR4_5_22v52v5lvicmt2l.R.inc(3741);xrefs = Collections.emptyList();
                __CLR4_5_22v52v5lvicmt2l.R.inc(3742);break;
            case 1:if (!__CLB4_5_2_bool1) {__CLR4_5_22v52v5lvicmt2l.R.inc(3743);__CLB4_5_2_bool1=true;}
                __CLR4_5_22v52v5lvicmt2l.R.inc(3744);Xref xref = xrefs.iterator().next();
                __CLR4_5_22v52v5lvicmt2l.R.inc(3745);xrefs = Collections.singletonList(xref);
                __CLR4_5_22v52v5lvicmt2l.R.inc(3746);break;
            default:if (!__CLB4_5_2_bool1) {__CLR4_5_22v52v5lvicmt2l.R.inc(3747);__CLB4_5_2_bool1=true;}
            __CLR4_5_22v52v5lvicmt2l.R.inc(3748);if ((((xrefs instanceof ArrayList)&&(__CLR4_5_22v52v5lvicmt2l.R.iget(3749)!=0|true))||(__CLR4_5_22v52v5lvicmt2l.R.iget(3750)==0&false))) {{
                __CLR4_5_22v52v5lvicmt2l.R.inc(3751);((ArrayList) xrefs).trimToSize();
            }
        }}
    }finally{__CLR4_5_22v52v5lvicmt2l.R.flushNeeded();}}

    void freezeQualifiers() {try{__CLR4_5_22v52v5lvicmt2l.R.inc(3752);
        boolean __CLB4_5_2_bool2=false;__CLR4_5_22v52v5lvicmt2l.R.inc(3753);switch (qualifierValues.size()) {
            case 0:if (!__CLB4_5_2_bool2) {__CLR4_5_22v52v5lvicmt2l.R.inc(3754);__CLB4_5_2_bool2=true;}
                __CLR4_5_22v52v5lvicmt2l.R.inc(3755);qualifierValues = Collections.emptyList();
                __CLR4_5_22v52v5lvicmt2l.R.inc(3756);break;
            case 1:if (!__CLB4_5_2_bool2) {__CLR4_5_22v52v5lvicmt2l.R.inc(3757);__CLB4_5_2_bool2=true;}
                __CLR4_5_22v52v5lvicmt2l.R.inc(3758);QualifierValue qualifierValue = qualifierValues.iterator().next();
                __CLR4_5_22v52v5lvicmt2l.R.inc(3759);qualifierValues = Collections.singletonList(qualifierValue);
                __CLR4_5_22v52v5lvicmt2l.R.inc(3760);break;
            default:if (!__CLB4_5_2_bool2) {__CLR4_5_22v52v5lvicmt2l.R.inc(3761);__CLB4_5_2_bool2=true;}
                __CLR4_5_22v52v5lvicmt2l.R.inc(3762);if ((((qualifierValues instanceof ArrayList)&&(__CLR4_5_22v52v5lvicmt2l.R.iget(3763)!=0|true))||(__CLR4_5_22v52v5lvicmt2l.R.iget(3764)==0&false))) {{
                    __CLR4_5_22v52v5lvicmt2l.R.inc(3765);((ArrayList) qualifierValues).trimToSize();
                }
        }}
    }finally{__CLR4_5_22v52v5lvicmt2l.R.flushNeeded();}}



    /**
     * @return true if no xrefs or qualifiers exist
     */
    public boolean hasNoAnnotations() {try{__CLR4_5_22v52v5lvicmt2l.R.inc(3766);
        __CLR4_5_22v52v5lvicmt2l.R.inc(3767);return xrefs.isEmpty() && qualifierValues.isEmpty();
    }finally{__CLR4_5_22v52v5lvicmt2l.R.flushNeeded();}}

    /**
     * @return tag
     */
    public String getTag() {try{__CLR4_5_22v52v5lvicmt2l.R.inc(3768);
        __CLR4_5_22v52v5lvicmt2l.R.inc(3769);return tag;
    }finally{__CLR4_5_22v52v5lvicmt2l.R.flushNeeded();}}

    /**
     * @param tag
     *        tag
     */
    public void setTag(String tag) {try{__CLR4_5_22v52v5lvicmt2l.R.inc(3770);
        __CLR4_5_22v52v5lvicmt2l.R.inc(3771);this.tag = tag;
    }finally{__CLR4_5_22v52v5lvicmt2l.R.flushNeeded();}}

    /**
     * @return values
     */
    @Nonnull
    public Collection<Object> getValues() {try{__CLR4_5_22v52v5lvicmt2l.R.inc(3772);
        __CLR4_5_22v52v5lvicmt2l.R.inc(3773);return values;
    }finally{__CLR4_5_22v52v5lvicmt2l.R.flushNeeded();}}

    /**
     * @param values
     *        values
     */
    public void setValues(@Nonnull Collection<Object> values) {try{__CLR4_5_22v52v5lvicmt2l.R.inc(3774);
        __CLR4_5_22v52v5lvicmt2l.R.inc(3775);if ((((!(this.values instanceof ArrayList))&&(__CLR4_5_22v52v5lvicmt2l.R.iget(3776)!=0|true))||(__CLR4_5_22v52v5lvicmt2l.R.iget(3777)==0&false))) {{
            boolean __CLB4_5_2_bool3=false;__CLR4_5_22v52v5lvicmt2l.R.inc(3778);switch (values.size()) {
                case 0:if (!__CLB4_5_2_bool3) {__CLR4_5_22v52v5lvicmt2l.R.inc(3779);__CLB4_5_2_bool3=true;}
                    __CLR4_5_22v52v5lvicmt2l.R.inc(3780);this.values = Collections.emptyList();
                    __CLR4_5_22v52v5lvicmt2l.R.inc(3781);break;
                case 1:if (!__CLB4_5_2_bool3) {__CLR4_5_22v52v5lvicmt2l.R.inc(3782);__CLB4_5_2_bool3=true;}
                    __CLR4_5_22v52v5lvicmt2l.R.inc(3783);Object o = values.iterator().next();
                    __CLR4_5_22v52v5lvicmt2l.R.inc(3784);this.values = Collections.singletonList(o);
                    __CLR4_5_22v52v5lvicmt2l.R.inc(3785);break;
                default:if (!__CLB4_5_2_bool3) {__CLR4_5_22v52v5lvicmt2l.R.inc(3786);__CLB4_5_2_bool3=true;}
                    __CLR4_5_22v52v5lvicmt2l.R.inc(3787);this.values = new ArrayList<>(values);
            }
        } }else {{
            __CLR4_5_22v52v5lvicmt2l.R.inc(3788);this.values.clear();
            __CLR4_5_22v52v5lvicmt2l.R.inc(3789);this.values.addAll(values);
        }
    }}finally{__CLR4_5_22v52v5lvicmt2l.R.flushNeeded();}}

    /**
     * @param v
     *        v
     */
    public void setValue(Object v) {try{__CLR4_5_22v52v5lvicmt2l.R.inc(3790);
        __CLR4_5_22v52v5lvicmt2l.R.inc(3791);if((((values instanceof ArrayList)&&(__CLR4_5_22v52v5lvicmt2l.R.iget(3792)!=0|true))||(__CLR4_5_22v52v5lvicmt2l.R.iget(3793)==0&false))) {{
            __CLR4_5_22v52v5lvicmt2l.R.inc(3794);values.clear(); // TODO: Remove this line after profile gathering
            __CLR4_5_22v52v5lvicmt2l.R.inc(3795);values.add(v);
        }  }else {{
            __CLR4_5_22v52v5lvicmt2l.R.inc(3796);this.values = Collections.singletonList(v);
        }
    }}finally{__CLR4_5_22v52v5lvicmt2l.R.flushNeeded();}}

    /**
     * @param v
     *        v
     */
    public void addValue(Object v) {try{__CLR4_5_22v52v5lvicmt2l.R.inc(3797);
        __CLR4_5_22v52v5lvicmt2l.R.inc(3798);if ((((!(this.values instanceof ArrayList))&&(__CLR4_5_22v52v5lvicmt2l.R.iget(3799)!=0|true))||(__CLR4_5_22v52v5lvicmt2l.R.iget(3800)==0&false))) {{
            __CLR4_5_22v52v5lvicmt2l.R.inc(3801);List<Object> newValues = new ArrayList<>(values.size() + 1);
            __CLR4_5_22v52v5lvicmt2l.R.inc(3802);newValues.addAll(this.values);
            __CLR4_5_22v52v5lvicmt2l.R.inc(3803);this.values = newValues;
        }
        }__CLR4_5_22v52v5lvicmt2l.R.inc(3804);values.add(v);
    }finally{__CLR4_5_22v52v5lvicmt2l.R.flushNeeded();}}

    /**
     * @return value
     */
    @Nullable
    public Object getValue() {try{__CLR4_5_22v52v5lvicmt2l.R.inc(3805);
        __CLR4_5_22v52v5lvicmt2l.R.inc(3806);Object value = null;
        __CLR4_5_22v52v5lvicmt2l.R.inc(3807);if ((((!values.isEmpty())&&(__CLR4_5_22v52v5lvicmt2l.R.iget(3808)!=0|true))||(__CLR4_5_22v52v5lvicmt2l.R.iget(3809)==0&false))) {{
            __CLR4_5_22v52v5lvicmt2l.R.inc(3810);value = values.get(0);
        }
        }__CLR4_5_22v52v5lvicmt2l.R.inc(3811);return value;
    }finally{__CLR4_5_22v52v5lvicmt2l.R.flushNeeded();}}

    /**
     * @param cls
     *        cls
     * @param <T>
     *        value type
     * @return value
     */
    @Nullable
    public <T> T getValue(@Nonnull Class<T> cls) {try{__CLR4_5_22v52v5lvicmt2l.R.inc(3812);
        __CLR4_5_22v52v5lvicmt2l.R.inc(3813);Object value = getValue();
        __CLR4_5_22v52v5lvicmt2l.R.inc(3814);if ((((value != null && value.getClass().isAssignableFrom(cls))&&(__CLR4_5_22v52v5lvicmt2l.R.iget(3815)!=0|true))||(__CLR4_5_22v52v5lvicmt2l.R.iget(3816)==0&false))) {{
            __CLR4_5_22v52v5lvicmt2l.R.inc(3817);return cls.cast(value);
        }
        }__CLR4_5_22v52v5lvicmt2l.R.inc(3818);return null;
    }finally{__CLR4_5_22v52v5lvicmt2l.R.flushNeeded();}}

    /**
     * @return value2
     */
    @Nullable
    public Object getValue2() {try{__CLR4_5_22v52v5lvicmt2l.R.inc(3819);
        __CLR4_5_22v52v5lvicmt2l.R.inc(3820);Object value = null;
        __CLR4_5_22v52v5lvicmt2l.R.inc(3821);if ((((values.size() > 1)&&(__CLR4_5_22v52v5lvicmt2l.R.iget(3822)!=0|true))||(__CLR4_5_22v52v5lvicmt2l.R.iget(3823)==0&false))) {{
            __CLR4_5_22v52v5lvicmt2l.R.inc(3824);value = values.get(1);
        }
        }__CLR4_5_22v52v5lvicmt2l.R.inc(3825);return value;
    }finally{__CLR4_5_22v52v5lvicmt2l.R.flushNeeded();}}

    /**
     * @param cls
     *        cls
     * @param <T>
     *        value type
     * @return value2
     */
    @Nullable
    public <T> T getValue2(@Nonnull Class<T> cls) {try{__CLR4_5_22v52v5lvicmt2l.R.inc(3826);
        __CLR4_5_22v52v5lvicmt2l.R.inc(3827);Object value = getValue2();
        __CLR4_5_22v52v5lvicmt2l.R.inc(3828);if ((((value != null && value.getClass().isAssignableFrom(cls))&&(__CLR4_5_22v52v5lvicmt2l.R.iget(3829)!=0|true))||(__CLR4_5_22v52v5lvicmt2l.R.iget(3830)==0&false))) {{
            __CLR4_5_22v52v5lvicmt2l.R.inc(3831);return cls.cast(value);
        }
        }__CLR4_5_22v52v5lvicmt2l.R.inc(3832);return null;
    }finally{__CLR4_5_22v52v5lvicmt2l.R.flushNeeded();}}

    /**
     * @return xrefs
     */
    @Nonnull
    public Collection<Xref> getXrefs() {try{__CLR4_5_22v52v5lvicmt2l.R.inc(3833);
        __CLR4_5_22v52v5lvicmt2l.R.inc(3834);return xrefs;
    }finally{__CLR4_5_22v52v5lvicmt2l.R.flushNeeded();}}

    /**
     * @param xrefs
     *        xrefs
     */
    public void setXrefs(@Nonnull Collection<Xref> xrefs) {try{__CLR4_5_22v52v5lvicmt2l.R.inc(3835);
        __CLR4_5_22v52v5lvicmt2l.R.inc(3836);if ((((!(this.xrefs instanceof ArrayList))&&(__CLR4_5_22v52v5lvicmt2l.R.iget(3837)!=0|true))||(__CLR4_5_22v52v5lvicmt2l.R.iget(3838)==0&false))) {{
            boolean __CLB4_5_2_bool4=false;__CLR4_5_22v52v5lvicmt2l.R.inc(3839);switch (xrefs.size()) {
                case 0:if (!__CLB4_5_2_bool4) {__CLR4_5_22v52v5lvicmt2l.R.inc(3840);__CLB4_5_2_bool4=true;}
                    __CLR4_5_22v52v5lvicmt2l.R.inc(3841);this.xrefs = Collections.emptyList();
                    __CLR4_5_22v52v5lvicmt2l.R.inc(3842);break;
                case 1:if (!__CLB4_5_2_bool4) {__CLR4_5_22v52v5lvicmt2l.R.inc(3843);__CLB4_5_2_bool4=true;}
                    __CLR4_5_22v52v5lvicmt2l.R.inc(3844);Xref xref = xrefs.iterator().next();
                    __CLR4_5_22v52v5lvicmt2l.R.inc(3845);this.xrefs = Collections.singletonList(xref);
                    __CLR4_5_22v52v5lvicmt2l.R.inc(3846);break;
                default:if (!__CLB4_5_2_bool4) {__CLR4_5_22v52v5lvicmt2l.R.inc(3847);__CLB4_5_2_bool4=true;}
                    __CLR4_5_22v52v5lvicmt2l.R.inc(3848);this.xrefs = new ArrayList<>(xrefs);
            }
        } }else {{
            __CLR4_5_22v52v5lvicmt2l.R.inc(3849);this.xrefs.clear();
            __CLR4_5_22v52v5lvicmt2l.R.inc(3850);this.xrefs.addAll(xrefs);
        }
    }}finally{__CLR4_5_22v52v5lvicmt2l.R.flushNeeded();}}

    /**
     * @param xref
     *        xref
     */
    public void addXref(Xref xref) {try{__CLR4_5_22v52v5lvicmt2l.R.inc(3851);
        __CLR4_5_22v52v5lvicmt2l.R.inc(3852);if ((((!(xrefs instanceof ArrayList))&&(__CLR4_5_22v52v5lvicmt2l.R.iget(3853)!=0|true))||(__CLR4_5_22v52v5lvicmt2l.R.iget(3854)==0&false))) {{
            __CLR4_5_22v52v5lvicmt2l.R.inc(3855);List<Xref> newXrefs = new ArrayList<>(xrefs.size() + 1);
            __CLR4_5_22v52v5lvicmt2l.R.inc(3856);newXrefs.addAll(xrefs);
            __CLR4_5_22v52v5lvicmt2l.R.inc(3857);this.xrefs = newXrefs;
        }
        }__CLR4_5_22v52v5lvicmt2l.R.inc(3858);xrefs.add(xref);
    }finally{__CLR4_5_22v52v5lvicmt2l.R.flushNeeded();}}

    /**
     * @return qualifier values
     */
    @Nonnull
    public Collection<QualifierValue> getQualifierValues() {try{__CLR4_5_22v52v5lvicmt2l.R.inc(3859);
        __CLR4_5_22v52v5lvicmt2l.R.inc(3860);return qualifierValues;
    }finally{__CLR4_5_22v52v5lvicmt2l.R.flushNeeded();}}

    /**
     * @param qualifierValues
     *        qualifierValues
     */
    public void setQualifierValues(@Nonnull Collection<QualifierValue> qualifierValues) {try{__CLR4_5_22v52v5lvicmt2l.R.inc(3861);
        __CLR4_5_22v52v5lvicmt2l.R.inc(3862);if ((((!(this.qualifierValues instanceof ArrayList))&&(__CLR4_5_22v52v5lvicmt2l.R.iget(3863)!=0|true))||(__CLR4_5_22v52v5lvicmt2l.R.iget(3864)==0&false))) {{
            boolean __CLB4_5_2_bool5=false;__CLR4_5_22v52v5lvicmt2l.R.inc(3865);switch (qualifierValues.size()) {
                case 0:if (!__CLB4_5_2_bool5) {__CLR4_5_22v52v5lvicmt2l.R.inc(3866);__CLB4_5_2_bool5=true;}
                    __CLR4_5_22v52v5lvicmt2l.R.inc(3867);this.qualifierValues = Collections.emptyList();
                    __CLR4_5_22v52v5lvicmt2l.R.inc(3868);break;
                case 1:if (!__CLB4_5_2_bool5) {__CLR4_5_22v52v5lvicmt2l.R.inc(3869);__CLB4_5_2_bool5=true;}
                    __CLR4_5_22v52v5lvicmt2l.R.inc(3870);QualifierValue qualifierValue = qualifierValues.iterator().next();
                    __CLR4_5_22v52v5lvicmt2l.R.inc(3871);this.qualifierValues = Collections.singletonList(qualifierValue);
                    __CLR4_5_22v52v5lvicmt2l.R.inc(3872);break;
                default:if (!__CLB4_5_2_bool5) {__CLR4_5_22v52v5lvicmt2l.R.inc(3873);__CLB4_5_2_bool5=true;}
                    __CLR4_5_22v52v5lvicmt2l.R.inc(3874);this.qualifierValues = new ArrayList<>(qualifierValues);
            }
        } }else {{
            __CLR4_5_22v52v5lvicmt2l.R.inc(3875);this.qualifierValues.clear();
            __CLR4_5_22v52v5lvicmt2l.R.inc(3876);this.qualifierValues.addAll(qualifierValues);
        }
    }}finally{__CLR4_5_22v52v5lvicmt2l.R.flushNeeded();}}


    /**
     * @param qv
     *        qv
     */
    public void addQualifierValue(QualifierValue qv) {try{__CLR4_5_22v52v5lvicmt2l.R.inc(3877);
        __CLR4_5_22v52v5lvicmt2l.R.inc(3878);if ((((!(qualifierValues instanceof ArrayList))&&(__CLR4_5_22v52v5lvicmt2l.R.iget(3879)!=0|true))||(__CLR4_5_22v52v5lvicmt2l.R.iget(3880)==0&false))) {{
            __CLR4_5_22v52v5lvicmt2l.R.inc(3881);List<QualifierValue> newQualifierValues = new ArrayList<>(qualifierValues.size() + 1);
            __CLR4_5_22v52v5lvicmt2l.R.inc(3882);newQualifierValues.addAll(qualifierValues);
            __CLR4_5_22v52v5lvicmt2l.R.inc(3883);this.qualifierValues = newQualifierValues;
        }

        }__CLR4_5_22v52v5lvicmt2l.R.inc(3884);qualifierValues.add(qv);
    }finally{__CLR4_5_22v52v5lvicmt2l.R.flushNeeded();}}

    @Nonnull
    @Override
    public String toString() {try{__CLR4_5_22v52v5lvicmt2l.R.inc(3885);
        __CLR4_5_22v52v5lvicmt2l.R.inc(3886);StringBuilder sb = new StringBuilder(tag);
        __CLR4_5_22v52v5lvicmt2l.R.inc(3887);sb.append('(');
        __CLR4_5_22v52v5lvicmt2l.R.inc(3888);for (Object ob : values) {{
            __CLR4_5_22v52v5lvicmt2l.R.inc(3889);sb.append(' ');
            __CLR4_5_22v52v5lvicmt2l.R.inc(3890);sb.append(ob);
        }
        }__CLR4_5_22v52v5lvicmt2l.R.inc(3891);if ((((!qualifierValues.isEmpty())&&(__CLR4_5_22v52v5lvicmt2l.R.iget(3892)!=0|true))||(__CLR4_5_22v52v5lvicmt2l.R.iget(3893)==0&false))) {{
            __CLR4_5_22v52v5lvicmt2l.R.inc(3894);sb.append('{');
            __CLR4_5_22v52v5lvicmt2l.R.inc(3895);for (QualifierValue qv : qualifierValues) {{
                __CLR4_5_22v52v5lvicmt2l.R.inc(3896);sb.append(qv);
                __CLR4_5_22v52v5lvicmt2l.R.inc(3897);sb.append(' ');
            }
            }__CLR4_5_22v52v5lvicmt2l.R.inc(3898);sb.append('}');
        }
        }__CLR4_5_22v52v5lvicmt2l.R.inc(3899);if ((((!xrefs.isEmpty())&&(__CLR4_5_22v52v5lvicmt2l.R.iget(3900)!=0|true))||(__CLR4_5_22v52v5lvicmt2l.R.iget(3901)==0&false))) {{
            __CLR4_5_22v52v5lvicmt2l.R.inc(3902);sb.append('[');
            __CLR4_5_22v52v5lvicmt2l.R.inc(3903);for (Xref x : xrefs) {{
                __CLR4_5_22v52v5lvicmt2l.R.inc(3904);sb.append(x);
                __CLR4_5_22v52v5lvicmt2l.R.inc(3905);sb.append(' ');
            }
            }__CLR4_5_22v52v5lvicmt2l.R.inc(3906);sb.append(']');
        }
        }__CLR4_5_22v52v5lvicmt2l.R.inc(3907);sb.append(')');
        __CLR4_5_22v52v5lvicmt2l.R.inc(3908);return sb.toString();
    }finally{__CLR4_5_22v52v5lvicmt2l.R.flushNeeded();}}

    private static boolean collectionsEquals(@Nullable Collection<?> c1, @Nullable Collection<?> c2) {try{__CLR4_5_22v52v5lvicmt2l.R.inc(3909);
        __CLR4_5_22v52v5lvicmt2l.R.inc(3910);if ((((c1 == null || c1.isEmpty())&&(__CLR4_5_22v52v5lvicmt2l.R.iget(3911)!=0|true))||(__CLR4_5_22v52v5lvicmt2l.R.iget(3912)==0&false))) {{
            __CLR4_5_22v52v5lvicmt2l.R.inc(3913);return c2 == null || c2.isEmpty();
        }
        }__CLR4_5_22v52v5lvicmt2l.R.inc(3914);if ((((c2 == null)&&(__CLR4_5_22v52v5lvicmt2l.R.iget(3915)!=0|true))||(__CLR4_5_22v52v5lvicmt2l.R.iget(3916)==0&false))) {{
            __CLR4_5_22v52v5lvicmt2l.R.inc(3917);return false;
        }
        }__CLR4_5_22v52v5lvicmt2l.R.inc(3918);if ((((c1.size() != c2.size())&&(__CLR4_5_22v52v5lvicmt2l.R.iget(3919)!=0|true))||(__CLR4_5_22v52v5lvicmt2l.R.iget(3920)==0&false))) {{
            __CLR4_5_22v52v5lvicmt2l.R.inc(3921);return false;
        }
        // xrefs are stored as lists to preserve order, but order is not import
        // for comparisons
        }__CLR4_5_22v52v5lvicmt2l.R.inc(3922);for (Object x : c1) {{
            __CLR4_5_22v52v5lvicmt2l.R.inc(3923);if ((((!c2.contains(x))&&(__CLR4_5_22v52v5lvicmt2l.R.iget(3924)!=0|true))||(__CLR4_5_22v52v5lvicmt2l.R.iget(3925)==0&false))) {{
                __CLR4_5_22v52v5lvicmt2l.R.inc(3926);return false;
            }
        }}
        }__CLR4_5_22v52v5lvicmt2l.R.inc(3927);return true;
    }finally{__CLR4_5_22v52v5lvicmt2l.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_5_22v52v5lvicmt2l.R.inc(3928);
        __CLR4_5_22v52v5lvicmt2l.R.inc(3929);return 31 * 31 * 31 * qualifierValues.hashCode() + 31 * xrefs.hashCode() + 31 * 31 * values.hashCode()
            + ((((tag == null )&&(__CLR4_5_22v52v5lvicmt2l.R.iget(3930)!=0|true))||(__CLR4_5_22v52v5lvicmt2l.R.iget(3931)==0&false))? 0 : tag.hashCode());
    }finally{__CLR4_5_22v52v5lvicmt2l.R.flushNeeded();}}

    @Override
    public boolean equals(Object obj) {try{__CLR4_5_22v52v5lvicmt2l.R.inc(3932);
        __CLR4_5_22v52v5lvicmt2l.R.inc(3933);if ((((!(obj instanceof Clause))&&(__CLR4_5_22v52v5lvicmt2l.R.iget(3934)!=0|true))||(__CLR4_5_22v52v5lvicmt2l.R.iget(3935)==0&false))) {{
            __CLR4_5_22v52v5lvicmt2l.R.inc(3936);return false;
        }
        }__CLR4_5_22v52v5lvicmt2l.R.inc(3937);if ((((obj == this)&&(__CLR4_5_22v52v5lvicmt2l.R.iget(3938)!=0|true))||(__CLR4_5_22v52v5lvicmt2l.R.iget(3939)==0&false))) {{
            __CLR4_5_22v52v5lvicmt2l.R.inc(3940);return true;
        }
        }__CLR4_5_22v52v5lvicmt2l.R.inc(3941);Clause other = (Clause) obj;
        __CLR4_5_22v52v5lvicmt2l.R.inc(3942);if ((((!getTag().equals(other.getTag()))&&(__CLR4_5_22v52v5lvicmt2l.R.iget(3943)!=0|true))||(__CLR4_5_22v52v5lvicmt2l.R.iget(3944)==0&false))) {{
            __CLR4_5_22v52v5lvicmt2l.R.inc(3945);return false;
        }
        }__CLR4_5_22v52v5lvicmt2l.R.inc(3946);if ((((getValues().size() == 1 && other.getValues().size() == 1)&&(__CLR4_5_22v52v5lvicmt2l.R.iget(3947)!=0|true))||(__CLR4_5_22v52v5lvicmt2l.R.iget(3948)==0&false))) {{
            // special case for comparing booleans
            // this is a bit of a hack - ideally owl2obo would use the correct
            // types
            __CLR4_5_22v52v5lvicmt2l.R.inc(3949);Object v1 = getValue();
            __CLR4_5_22v52v5lvicmt2l.R.inc(3950);Object v2 = other.getValue();
            __CLR4_5_22v52v5lvicmt2l.R.inc(3951);if ((((v1 != v2)&&(__CLR4_5_22v52v5lvicmt2l.R.iget(3952)!=0|true))||(__CLR4_5_22v52v5lvicmt2l.R.iget(3953)==0&false))) {{
                __CLR4_5_22v52v5lvicmt2l.R.inc(3954);if ((((v1 != null)&&(__CLR4_5_22v52v5lvicmt2l.R.iget(3955)!=0|true))||(__CLR4_5_22v52v5lvicmt2l.R.iget(3956)==0&false))) {{
                    __CLR4_5_22v52v5lvicmt2l.R.inc(3957);if ((((!v1.equals(v2))&&(__CLR4_5_22v52v5lvicmt2l.R.iget(3958)!=0|true))||(__CLR4_5_22v52v5lvicmt2l.R.iget(3959)==0&false))) {{
                        __CLR4_5_22v52v5lvicmt2l.R.inc(3960);if ((((Boolean.TRUE.equals(v1) && "true".equals(v2))&&(__CLR4_5_22v52v5lvicmt2l.R.iget(3961)!=0|true))||(__CLR4_5_22v52v5lvicmt2l.R.iget(3962)==0&false))) {{
                            // special case - OK
                        } }else {__CLR4_5_22v52v5lvicmt2l.R.inc(3963);if ((((Boolean.TRUE.equals(v2) && "true".equals(v1))&&(__CLR4_5_22v52v5lvicmt2l.R.iget(3964)!=0|true))||(__CLR4_5_22v52v5lvicmt2l.R.iget(3965)==0&false))) {{
                            // special case - OK
                        } }else {__CLR4_5_22v52v5lvicmt2l.R.inc(3966);if ((((Boolean.FALSE.equals(v1) && "false".equals(v2))&&(__CLR4_5_22v52v5lvicmt2l.R.iget(3967)!=0|true))||(__CLR4_5_22v52v5lvicmt2l.R.iget(3968)==0&false))) {{
                            // special case - OK
                        } }else {__CLR4_5_22v52v5lvicmt2l.R.inc(3969);if ((((Boolean.FALSE.equals(v2) && "false".equals(v1))&&(__CLR4_5_22v52v5lvicmt2l.R.iget(3970)!=0|true))||(__CLR4_5_22v52v5lvicmt2l.R.iget(3971)==0&false))) {{
                            // special case - OK
                        } }else {{
                            __CLR4_5_22v52v5lvicmt2l.R.inc(3972);return false;
                        }
                    }}}}}
                }}
            }}
        }} }else {{
            __CLR4_5_22v52v5lvicmt2l.R.inc(3973);if ((((!getValues().equals(other.getValues()))&&(__CLR4_5_22v52v5lvicmt2l.R.iget(3974)!=0|true))||(__CLR4_5_22v52v5lvicmt2l.R.iget(3975)==0&false))) {{
                __CLR4_5_22v52v5lvicmt2l.R.inc(3976);return false;
            }
        }}
        }__CLR4_5_22v52v5lvicmt2l.R.inc(3977);if ((((!collectionsEquals(xrefs, other.getXrefs()))&&(__CLR4_5_22v52v5lvicmt2l.R.iget(3978)!=0|true))||(__CLR4_5_22v52v5lvicmt2l.R.iget(3979)==0&false))) {{
            __CLR4_5_22v52v5lvicmt2l.R.inc(3980);return false;
        }
        /*
         * if (xrefs != null) { if (other.getXrefs() == null) return false; if
         * (!xrefs.equals(other.getXrefs())) return false; } else { if
         * (other.getXrefs() != null && other.getXrefs().size() > 0) { return
         * false; } }
         */
        }__CLR4_5_22v52v5lvicmt2l.R.inc(3981);return collectionsEquals(qualifierValues, other.getQualifierValues());
    }finally{__CLR4_5_22v52v5lvicmt2l.R.flushNeeded();}}

}
