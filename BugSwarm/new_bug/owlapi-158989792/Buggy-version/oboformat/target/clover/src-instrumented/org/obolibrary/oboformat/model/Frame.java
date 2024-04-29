/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.obolibrary.oboformat.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import org.obolibrary.obo2owl.OboInOwlCardinalityTools;
import org.obolibrary.oboformat.parser.OBOFormatConstants.OboFormatTag;

/** The Class Frame. */
public class Frame {public static class __CLR4_5_232o32olvicmt47{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u006f\u0062\u006f\u0066\u006f\u0072\u006d\u0061\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237308750L,8589935092L,4160,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** The Enum FrameType. */
    public enum FrameType {
        /** HEADER. */
        HEADER, /** TERM. */
        TERM, /** TYPEDEF. */
        TYPEDEF, /** INSTANCE. */
        INSTANCE, /** ANNOTATION. */
        ANNOTATION
    }

    /** The clauses. */
    protected Collection<Clause> clauses;
    /** The id. */
    protected String id;
    /** The type. */
    protected FrameType type;

    /** Instantiates a new frame. */
    public Frame() {try{__CLR4_5_232o32olvicmt47.R.inc(3984);
        __CLR4_5_232o32olvicmt47.R.inc(3985);init();
    }finally{__CLR4_5_232o32olvicmt47.R.flushNeeded();}}

    /**
     * Instantiates a new frame.
     * 
     * @param type
     *        the type
     */
    public Frame(FrameType type) {try{__CLR4_5_232o32olvicmt47.R.inc(3986);
        __CLR4_5_232o32olvicmt47.R.inc(3987);init();
        __CLR4_5_232o32olvicmt47.R.inc(3988);this.type = type;
    }finally{__CLR4_5_232o32olvicmt47.R.flushNeeded();}}

    /** Init clauses. */
    protected final void init() {try{__CLR4_5_232o32olvicmt47.R.inc(3989);
        __CLR4_5_232o32olvicmt47.R.inc(3990);clauses = new ArrayList<>();
    }finally{__CLR4_5_232o32olvicmt47.R.flushNeeded();}}

    /**
     * freezing a frame signals that a frame has become quiescent, and that data structures can be adjusted to
     * increase performance or reduce memory consumption. If a frozen frame is subsequently modified it will be thawed
     * as necessary.
     */
    public void freeze() {try{__CLR4_5_232o32olvicmt47.R.inc(3991);
        __CLR4_5_232o32olvicmt47.R.inc(3992);if ((((clauses.isEmpty())&&(__CLR4_5_232o32olvicmt47.R.iget(3993)!=0|true))||(__CLR4_5_232o32olvicmt47.R.iget(3994)==0&false))) {{
            __CLR4_5_232o32olvicmt47.R.inc(3995);clauses = Collections.emptyList();
            __CLR4_5_232o32olvicmt47.R.inc(3996);return;
        }

        }__CLR4_5_232o32olvicmt47.R.inc(3997);for (Clause clause : clauses) {{
            __CLR4_5_232o32olvicmt47.R.inc(3998);clause.freeze();
        }

        }__CLR4_5_232o32olvicmt47.R.inc(3999);if ((((clauses.size() == 1)&&(__CLR4_5_232o32olvicmt47.R.iget(4000)!=0|true))||(__CLR4_5_232o32olvicmt47.R.iget(4001)==0&false))) {{
            __CLR4_5_232o32olvicmt47.R.inc(4002);clauses = Collections.singletonList(clauses.iterator().next());
            __CLR4_5_232o32olvicmt47.R.inc(4003);return;
        }

        }__CLR4_5_232o32olvicmt47.R.inc(4004);if ((((clauses instanceof ArrayList<?>)&&(__CLR4_5_232o32olvicmt47.R.iget(4005)!=0|true))||(__CLR4_5_232o32olvicmt47.R.iget(4006)==0&false))) {{
            __CLR4_5_232o32olvicmt47.R.inc(4007);ArrayList<?> arrayList = (ArrayList<?>) clauses;
            __CLR4_5_232o32olvicmt47.R.inc(4008);arrayList.trimToSize();
        }

    }}finally{__CLR4_5_232o32olvicmt47.R.flushNeeded();}}

    /**
     * @return the type
     */
    public FrameType getType() {try{__CLR4_5_232o32olvicmt47.R.inc(4009);
        __CLR4_5_232o32olvicmt47.R.inc(4010);return type;
    }finally{__CLR4_5_232o32olvicmt47.R.flushNeeded();}}

    /**
     * @param type
     *        the new type
     */
    public void setType(FrameType type) {try{__CLR4_5_232o32olvicmt47.R.inc(4011);
        __CLR4_5_232o32olvicmt47.R.inc(4012);this.type = type;
    }finally{__CLR4_5_232o32olvicmt47.R.flushNeeded();}}

    /**
     * @return the id
     */
    public String getId() {try{__CLR4_5_232o32olvicmt47.R.inc(4013);
        __CLR4_5_232o32olvicmt47.R.inc(4014);return id;
    }finally{__CLR4_5_232o32olvicmt47.R.flushNeeded();}}

    /**
     * @param id
     *        the new id
     */
    public void setId(String id) {try{__CLR4_5_232o32olvicmt47.R.inc(4015);
        __CLR4_5_232o32olvicmt47.R.inc(4016);this.id = id;
    }finally{__CLR4_5_232o32olvicmt47.R.flushNeeded();}}

    /**
     * @return the clauses
     */
    public Collection<Clause> getClauses() {try{__CLR4_5_232o32olvicmt47.R.inc(4017);
        __CLR4_5_232o32olvicmt47.R.inc(4018);return clauses;
    }finally{__CLR4_5_232o32olvicmt47.R.flushNeeded();}}

    /**
     * @param tag
     *        the tag
     * @return the clauses for tag
     */
    @Nonnull
    public Collection<Clause> getClauses(String tag) {try{__CLR4_5_232o32olvicmt47.R.inc(4019);
        __CLR4_5_232o32olvicmt47.R.inc(4020);Collection<Clause> cls = new ArrayList<>();
        __CLR4_5_232o32olvicmt47.R.inc(4021);for (Clause cl : clauses) {{
            __CLR4_5_232o32olvicmt47.R.inc(4022);if ((((cl.getTag().equals(tag))&&(__CLR4_5_232o32olvicmt47.R.iget(4023)!=0|true))||(__CLR4_5_232o32olvicmt47.R.iget(4024)==0&false))) {{
                __CLR4_5_232o32olvicmt47.R.inc(4025);cls.add(cl);
            }
        }}
        }__CLR4_5_232o32olvicmt47.R.inc(4026);return cls;
    }finally{__CLR4_5_232o32olvicmt47.R.flushNeeded();}}

    /**
     * @param tag
     *        the tag
     * @return the clauses for tag
     */
    @Nonnull
    public Collection<Clause> getClauses(@Nonnull OboFormatTag tag) {try{__CLR4_5_232o32olvicmt47.R.inc(4027);
        __CLR4_5_232o32olvicmt47.R.inc(4028);return getClauses(tag.getTag());
    }finally{__CLR4_5_232o32olvicmt47.R.flushNeeded();}}

    /**
     * @param tag
     *        the tag
     * @return null if no value set, otherwise first value
     */
    @Nullable
    public Clause getClause(String tag) {try{__CLR4_5_232o32olvicmt47.R.inc(4029);
        __CLR4_5_232o32olvicmt47.R.inc(4030);for (Clause cl : clauses) {{
            __CLR4_5_232o32olvicmt47.R.inc(4031);if ((((cl.getTag().equals(tag))&&(__CLR4_5_232o32olvicmt47.R.iget(4032)!=0|true))||(__CLR4_5_232o32olvicmt47.R.iget(4033)==0&false))) {{
                __CLR4_5_232o32olvicmt47.R.inc(4034);return cl;
            }
            // TODO - throw exception if more than one clause of this type?
        }}
        }__CLR4_5_232o32olvicmt47.R.inc(4035);return null;
    }finally{__CLR4_5_232o32olvicmt47.R.flushNeeded();}}

    /**
     * @param tag
     *        the tag
     * @return the clause for tag
     */
    @Nullable
    public Clause getClause(@Nonnull OboFormatTag tag) {try{__CLR4_5_232o32olvicmt47.R.inc(4036);
        __CLR4_5_232o32olvicmt47.R.inc(4037);return getClause(tag.getTag());
    }finally{__CLR4_5_232o32olvicmt47.R.flushNeeded();}}

    /**
     * @param clauses
     *        the new clauses
     */
    public void setClauses(Collection<Clause> clauses) {try{__CLR4_5_232o32olvicmt47.R.inc(4038);
        __CLR4_5_232o32olvicmt47.R.inc(4039);this.clauses = clauses;
    }finally{__CLR4_5_232o32olvicmt47.R.flushNeeded();}}

    /**
     * @param cl
     *        the clause
     */
    public void addClause(Clause cl) {try{__CLR4_5_232o32olvicmt47.R.inc(4040);
        __CLR4_5_232o32olvicmt47.R.inc(4041);if ((((!(clauses instanceof ArrayList))&&(__CLR4_5_232o32olvicmt47.R.iget(4042)!=0|true))||(__CLR4_5_232o32olvicmt47.R.iget(4043)==0&false))) {{
            __CLR4_5_232o32olvicmt47.R.inc(4044);Collection<Clause> tmp  = new ArrayList<>(clauses.size()+1);
            __CLR4_5_232o32olvicmt47.R.inc(4045);tmp.addAll(clauses);
            __CLR4_5_232o32olvicmt47.R.inc(4046);clauses = tmp;
        }
        }__CLR4_5_232o32olvicmt47.R.inc(4047);clauses.add(cl);
    }finally{__CLR4_5_232o32olvicmt47.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_5_232o32olvicmt47.R.inc(4048);
        __CLR4_5_232o32olvicmt47.R.inc(4049);StringBuffer sb = new StringBuffer();
        __CLR4_5_232o32olvicmt47.R.inc(4050);sb.append("Frame(");
        __CLR4_5_232o32olvicmt47.R.inc(4051);sb.append(id);
        __CLR4_5_232o32olvicmt47.R.inc(4052);sb.append(' ');
        __CLR4_5_232o32olvicmt47.R.inc(4053);for (Clause cl : clauses) {{
            __CLR4_5_232o32olvicmt47.R.inc(4054);sb.append(cl);
        }
        }__CLR4_5_232o32olvicmt47.R.inc(4055);sb.append(')');
        __CLR4_5_232o32olvicmt47.R.inc(4056);String string = sb.toString();
        assert (((string != null)&&(__CLR4_5_232o32olvicmt47.R.iget(4057)!=0|true))||(__CLR4_5_232o32olvicmt47.R.iget(4058)==0&false));
        __CLR4_5_232o32olvicmt47.R.inc(4059);return string;
    }finally{__CLR4_5_232o32olvicmt47.R.flushNeeded();}}

    /**
     * @param tag
     *        the tag
     * @return the tag value for tag
     */
    @Nullable
    public Object getTagValue(String tag) {try{__CLR4_5_232o32olvicmt47.R.inc(4060);
        __CLR4_5_232o32olvicmt47.R.inc(4061);Clause clause = getClause(tag);
        __CLR4_5_232o32olvicmt47.R.inc(4062);if ((((clause == null)&&(__CLR4_5_232o32olvicmt47.R.iget(4063)!=0|true))||(__CLR4_5_232o32olvicmt47.R.iget(4064)==0&false))) {{
            __CLR4_5_232o32olvicmt47.R.inc(4065);return null;
        }
        }__CLR4_5_232o32olvicmt47.R.inc(4066);return clause.getValue();
    }finally{__CLR4_5_232o32olvicmt47.R.flushNeeded();}}

    /**
     * @param tag
     *        the tag
     * @return the tag value for tag
     */
    @Nullable
    public Object getTagValue(@Nonnull OboFormatTag tag) {try{__CLR4_5_232o32olvicmt47.R.inc(4067);
        __CLR4_5_232o32olvicmt47.R.inc(4068);return getTagValue(tag.getTag());
    }finally{__CLR4_5_232o32olvicmt47.R.flushNeeded();}}

    /**
     * @param <T>
     *        the generic type
     * @param tag
     *        the tag
     * @param cls
     *        the cls
     * @return the tag value for tag and class
     */
    @SuppressWarnings("null")
    @Nullable
    public <T> T getTagValue(String tag, @Nonnull Class<T> cls) {try{__CLR4_5_232o32olvicmt47.R.inc(4069);
        __CLR4_5_232o32olvicmt47.R.inc(4070);if ((((getClause(tag) == null)&&(__CLR4_5_232o32olvicmt47.R.iget(4071)!=0|true))||(__CLR4_5_232o32olvicmt47.R.iget(4072)==0&false))) {{
            __CLR4_5_232o32olvicmt47.R.inc(4073);return null;
        }
        }__CLR4_5_232o32olvicmt47.R.inc(4074);Object value = getClause(tag).getValue();
        __CLR4_5_232o32olvicmt47.R.inc(4075);if ((((value != null && value.getClass().isAssignableFrom(cls))&&(__CLR4_5_232o32olvicmt47.R.iget(4076)!=0|true))||(__CLR4_5_232o32olvicmt47.R.iget(4077)==0&false))) {{
            __CLR4_5_232o32olvicmt47.R.inc(4078);return cls.cast(value);
        }
        }__CLR4_5_232o32olvicmt47.R.inc(4079);return null;
    }finally{__CLR4_5_232o32olvicmt47.R.flushNeeded();}}

    /**
     * @param <T>
     *        the generic type
     * @param tag
     *        the tag
     * @param cls
     *        the cls
     * @return the tag value for tag and class
     */
    @Nullable
    public <T> T getTagValue(@Nonnull OboFormatTag tag, @Nonnull Class<T> cls) {try{__CLR4_5_232o32olvicmt47.R.inc(4080);
        __CLR4_5_232o32olvicmt47.R.inc(4081);return getTagValue(tag.getTag(), cls);
    }finally{__CLR4_5_232o32olvicmt47.R.flushNeeded();}}

    /**
     * @param tag
     *        the tag
     * @return the tag values for tag
     */
    @Nonnull
    public Collection<Object> getTagValues(@Nonnull OboFormatTag tag) {try{__CLR4_5_232o32olvicmt47.R.inc(4082);
        __CLR4_5_232o32olvicmt47.R.inc(4083);return getTagValues(tag.getTag());
    }finally{__CLR4_5_232o32olvicmt47.R.flushNeeded();}}

    /**
     * @param tag
     *        the tag
     * @return the tag values for tag
     */
    @Nonnull
    public Collection<Object> getTagValues(String tag) {try{__CLR4_5_232o32olvicmt47.R.inc(4084);
        __CLR4_5_232o32olvicmt47.R.inc(4085);Collection<Object> vals = new ArrayList<>();
        __CLR4_5_232o32olvicmt47.R.inc(4086);for (Clause c : getClauses(tag)) {{
            __CLR4_5_232o32olvicmt47.R.inc(4087);vals.add(c.getValue());
        }
        }__CLR4_5_232o32olvicmt47.R.inc(4088);return vals;
    }finally{__CLR4_5_232o32olvicmt47.R.flushNeeded();}}

    /**
     * @param <T>
     *        the generic type
     * @param tag
     *        the tag
     * @param cls
     *        the cls
     * @return the tag values for tag and class
     */
    @Nonnull
    public <T> Collection<T> getTagValues(@Nonnull OboFormatTag tag, @Nonnull Class<T> cls) {try{__CLR4_5_232o32olvicmt47.R.inc(4089);
        __CLR4_5_232o32olvicmt47.R.inc(4090);return getTagValues(tag.getTag(), cls);
    }finally{__CLR4_5_232o32olvicmt47.R.flushNeeded();}}

    /**
     * @param <T>
     *        the generic type
     * @param tag
     *        the tag
     * @param cls
     *        the cls
     * @return the tag values for tag and class
     */
    @Nonnull
    public <T> Collection<T> getTagValues(String tag, @Nonnull Class<T> cls) {try{__CLR4_5_232o32olvicmt47.R.inc(4091);
        __CLR4_5_232o32olvicmt47.R.inc(4092);Collection<T> vals = new ArrayList<>();
        __CLR4_5_232o32olvicmt47.R.inc(4093);for (Clause c : getClauses(tag)) {{
            __CLR4_5_232o32olvicmt47.R.inc(4094);vals.add(c.getValue(cls));
        }
        }__CLR4_5_232o32olvicmt47.R.inc(4095);return vals;
    }finally{__CLR4_5_232o32olvicmt47.R.flushNeeded();}}

    /**
     * @param tag
     *        the tag
     * @return the tag xrefs for tg
     */
    @SuppressWarnings("null")
    @Nonnull
    public Collection<Xref> getTagXrefs(String tag) {try{__CLR4_5_232o32olvicmt47.R.inc(4096);
        __CLR4_5_232o32olvicmt47.R.inc(4097);Collection<Xref> xrefs = new ArrayList<>();
        __CLR4_5_232o32olvicmt47.R.inc(4098);for (Object ob : getClause(tag).getValues()) {{
            __CLR4_5_232o32olvicmt47.R.inc(4099);if ((((ob instanceof Xref)&&(__CLR4_5_232o32olvicmt47.R.iget(4100)!=0|true))||(__CLR4_5_232o32olvicmt47.R.iget(4101)==0&false))) {{
                __CLR4_5_232o32olvicmt47.R.inc(4102);xrefs.add((Xref) ob);
            }
        }}
        }__CLR4_5_232o32olvicmt47.R.inc(4103);return xrefs;
    }finally{__CLR4_5_232o32olvicmt47.R.flushNeeded();}}

    /**
     * @return the tags
     */
    @Nonnull
    public Set<String> getTags() {try{__CLR4_5_232o32olvicmt47.R.inc(4104);
        __CLR4_5_232o32olvicmt47.R.inc(4105);Set<String> tags = new HashSet<>();
        __CLR4_5_232o32olvicmt47.R.inc(4106);for (Clause cl : getClauses()) {{
            __CLR4_5_232o32olvicmt47.R.inc(4107);tags.add(cl.getTag());
        }
        }__CLR4_5_232o32olvicmt47.R.inc(4108);return tags;
    }finally{__CLR4_5_232o32olvicmt47.R.flushNeeded();}}

    /**
     * @param extFrame
     *        the external frame
     * @throws FrameMergeException
     *         the frame merge exception
     */
    public void merge(@Nonnull Frame extFrame) throws FrameMergeException {try{__CLR4_5_232o32olvicmt47.R.inc(4109);
        __CLR4_5_232o32olvicmt47.R.inc(4110);if ((((this == extFrame)&&(__CLR4_5_232o32olvicmt47.R.iget(4111)!=0|true))||(__CLR4_5_232o32olvicmt47.R.iget(4112)==0&false))) {{
            __CLR4_5_232o32olvicmt47.R.inc(4113);return;
        }
        }__CLR4_5_232o32olvicmt47.R.inc(4114);if ((((!extFrame.getId().equals(getId()))&&(__CLR4_5_232o32olvicmt47.R.iget(4115)!=0|true))||(__CLR4_5_232o32olvicmt47.R.iget(4116)==0&false))) {{
            __CLR4_5_232o32olvicmt47.R.inc(4117);throw new FrameMergeException("ids do not match");
        }
        }__CLR4_5_232o32olvicmt47.R.inc(4118);if ((((!extFrame.getType().equals(getType()))&&(__CLR4_5_232o32olvicmt47.R.iget(4119)!=0|true))||(__CLR4_5_232o32olvicmt47.R.iget(4120)==0&false))) {{
            __CLR4_5_232o32olvicmt47.R.inc(4121);throw new FrameMergeException("frame types do not match");
        }
        }__CLR4_5_232o32olvicmt47.R.inc(4122);for (Clause c : extFrame.getClauses()) {{
            __CLR4_5_232o32olvicmt47.R.inc(4123);addClause(c);
        }
        // note we do not perform a document structure check at this point
    }}finally{__CLR4_5_232o32olvicmt47.R.flushNeeded();}}

    /**
     * Check this frame for violations, i.e. cardinality constraint violations.
     * 
     * @throws FrameStructureException
     *         the frame structure exception
     * @see OboInOwlCardinalityTools for equivalent checks in OWL
     */
    @SuppressWarnings("null")
    public void check() throws FrameStructureException {try{__CLR4_5_232o32olvicmt47.R.inc(4124);
        __CLR4_5_232o32olvicmt47.R.inc(4125);if ((((FrameType.HEADER.equals(type))&&(__CLR4_5_232o32olvicmt47.R.iget(4126)!=0|true))||(__CLR4_5_232o32olvicmt47.R.iget(4127)==0&false))) {{
            __CLR4_5_232o32olvicmt47.R.inc(4128);checkMaxOneCardinality(OboFormatTag.TAG_ONTOLOGY, OboFormatTag.TAG_FORMAT_VERSION, OboFormatTag.TAG_DATE,
                OboFormatTag.TAG_DEFAULT_NAMESPACE, OboFormatTag.TAG_SAVED_BY, OboFormatTag.TAG_AUTO_GENERATED_BY);
        }
        }__CLR4_5_232o32olvicmt47.R.inc(4129);if ((((FrameType.TYPEDEF.equals(type))&&(__CLR4_5_232o32olvicmt47.R.iget(4130)!=0|true))||(__CLR4_5_232o32olvicmt47.R.iget(4131)==0&false))) {{
            __CLR4_5_232o32olvicmt47.R.inc(4132);checkMaxOneCardinality(OboFormatTag.TAG_DOMAIN, OboFormatTag.TAG_RANGE, OboFormatTag.TAG_IS_METADATA_TAG,
                OboFormatTag.TAG_IS_CLASS_LEVEL_TAG);
        }
        }__CLR4_5_232o32olvicmt47.R.inc(4133);if ((((!FrameType.HEADER.equals(getType()))&&(__CLR4_5_232o32olvicmt47.R.iget(4134)!=0|true))||(__CLR4_5_232o32olvicmt47.R.iget(4135)==0&false))) {{
            __CLR4_5_232o32olvicmt47.R.inc(4136);if ((((getClauses(OboFormatTag.TAG_ID).size() != 1)&&(__CLR4_5_232o32olvicmt47.R.iget(4137)!=0|true))||(__CLR4_5_232o32olvicmt47.R.iget(4138)==0&false))) {{
                __CLR4_5_232o32olvicmt47.R.inc(4139);throw new FrameStructureException(this, "cardinality of id field must be 1");
            }
            }__CLR4_5_232o32olvicmt47.R.inc(4140);if ((((getClause(OboFormatTag.TAG_ID).getValue() == null)&&(__CLR4_5_232o32olvicmt47.R.iget(4141)!=0|true))||(__CLR4_5_232o32olvicmt47.R.iget(4142)==0&false))) {{
                __CLR4_5_232o32olvicmt47.R.inc(4143);throw new FrameStructureException(this, "id field must not be null");
            }
            }__CLR4_5_232o32olvicmt47.R.inc(4144);if ((((getId() == null)&&(__CLR4_5_232o32olvicmt47.R.iget(4145)!=0|true))||(__CLR4_5_232o32olvicmt47.R.iget(4146)==0&false))) {{
                __CLR4_5_232o32olvicmt47.R.inc(4147);throw new FrameStructureException(this, "id field must be set");
            }
        }}
        }__CLR4_5_232o32olvicmt47.R.inc(4148);Collection<Clause> iClauses = getClauses(OboFormatTag.TAG_INTERSECTION_OF);
        __CLR4_5_232o32olvicmt47.R.inc(4149);if ((((iClauses.size() == 1)&&(__CLR4_5_232o32olvicmt47.R.iget(4150)!=0|true))||(__CLR4_5_232o32olvicmt47.R.iget(4151)==0&false))) {{
            __CLR4_5_232o32olvicmt47.R.inc(4152);throw new FrameStructureException(this, "single intersection_of tags are not allowed");
        }
        }__CLR4_5_232o32olvicmt47.R.inc(4153);checkMaxOneCardinality(OboFormatTag.TAG_IS_ANONYMOUS, OboFormatTag.TAG_NAME,
            // OboFormatTag.TAG_NAMESPACE,
            OboFormatTag.TAG_DEF, OboFormatTag.TAG_COMMENT, OboFormatTag.TAG_IS_ANTI_SYMMETRIC,
            OboFormatTag.TAG_IS_CYCLIC, OboFormatTag.TAG_IS_REFLEXIVE, OboFormatTag.TAG_IS_SYMMETRIC,
            OboFormatTag.TAG_IS_TRANSITIVE, OboFormatTag.TAG_IS_FUNCTIONAL, OboFormatTag.TAG_IS_INVERSE_FUNCTIONAL,
            OboFormatTag.TAG_IS_OBSELETE, OboFormatTag.TAG_CREATED_BY, OboFormatTag.TAG_CREATION_DATE);
    }finally{__CLR4_5_232o32olvicmt47.R.flushNeeded();}}

    /**
     * Check max one cardinality.
     * 
     * @param tags
     *        the tags
     * @throws FrameStructureException
     *         frame structure exception
     */
    private void checkMaxOneCardinality(@Nonnull OboFormatTag... tags) throws FrameStructureException {try{__CLR4_5_232o32olvicmt47.R.inc(4154);
        __CLR4_5_232o32olvicmt47.R.inc(4155);for (OboFormatTag tag : tags) {{
            __CLR4_5_232o32olvicmt47.R.inc(4156);if ((((getClauses(tag).size() > 1)&&(__CLR4_5_232o32olvicmt47.R.iget(4157)!=0|true))||(__CLR4_5_232o32olvicmt47.R.iget(4158)==0&false))) {{
                __CLR4_5_232o32olvicmt47.R.inc(4159);throw new FrameStructureException(this, "multiple " + tag.getTag() + " tags not allowed.");
            }
        }}
    }}finally{__CLR4_5_232o32olvicmt47.R.flushNeeded();}}
}
