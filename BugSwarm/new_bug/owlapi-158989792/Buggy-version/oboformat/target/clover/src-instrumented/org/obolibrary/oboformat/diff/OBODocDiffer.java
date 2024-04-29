/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.obolibrary.oboformat.diff;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Nonnull;

import org.obolibrary.oboformat.model.Clause;
import org.obolibrary.oboformat.model.Frame;
import org.obolibrary.oboformat.model.OBODoc;
import org.obolibrary.oboformat.model.Xref;
import org.obolibrary.oboformat.parser.OBOFormatConstants.OboFormatTag;

/**
 * Diffs two OBO Documents. Performs structural diffing only - does not use
 * reasoning (use OWLDiff or similar tools for this)
 * 
 * @author cjm
 */
public class OBODocDiffer {public static class __CLR4_5_22tm2tmlvicmt21{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u006f\u0062\u006f\u0066\u006f\u0072\u006d\u0061\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237308750L,8589935092L,3713,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * @param doc1
     *        doc1
     * @param doc2
     *        doc2
     * @return list of diffs
     */
    @Nonnull
    public static List<Diff> getDiffs(@Nonnull OBODoc doc1, @Nonnull OBODoc doc2) {try{__CLR4_5_22tm2tmlvicmt21.R.inc(3658);
        __CLR4_5_22tm2tmlvicmt21.R.inc(3659);List<Diff> diffs = new ArrayList<>();
        __CLR4_5_22tm2tmlvicmt21.R.inc(3660);diffs.addAll(getDiffs("Header", doc1.getHeaderFrame(), doc2.getHeaderFrame()));
        __CLR4_5_22tm2tmlvicmt21.R.inc(3661);diffs.addAll(getDiffs("Term", doc1.getTermFrames(), doc2.getTermFrames()));
        __CLR4_5_22tm2tmlvicmt21.R.inc(3662);diffs.addAll(getDiffs("Typedef", doc1.getTypedefFrames(), doc2.getTypedefFrames()));
        __CLR4_5_22tm2tmlvicmt21.R.inc(3663);diffs.addAll(getDiffs("Instance", doc1.getInstanceFrames(), doc2.getInstanceFrames()));
        __CLR4_5_22tm2tmlvicmt21.R.inc(3664);return diffs;
    }finally{__CLR4_5_22tm2tmlvicmt21.R.flushNeeded();}}

    // FRAME LISTS
    @Nonnull
    private static List<Diff> getDiffsAsym(String ftype, @Nonnull Collection<Frame> fl1, @Nonnull Collection<Frame> fl2,
        int n, boolean isCheckFrame) {try{__CLR4_5_22tm2tmlvicmt21.R.inc(3665);
        __CLR4_5_22tm2tmlvicmt21.R.inc(3666);List<Diff> diffs = new ArrayList<>();
        __CLR4_5_22tm2tmlvicmt21.R.inc(3667);Map<String, Frame> fm2 = new HashMap<>();
        __CLR4_5_22tm2tmlvicmt21.R.inc(3668);for (Frame f : fl2) {{
            __CLR4_5_22tm2tmlvicmt21.R.inc(3669);fm2.put(f.getId(), f);
        }
        }__CLR4_5_22tm2tmlvicmt21.R.inc(3670);for (Frame f1 : fl1) {{
            __CLR4_5_22tm2tmlvicmt21.R.inc(3671);if ((((fm2.containsKey(f1.getId()))&&(__CLR4_5_22tm2tmlvicmt21.R.iget(3672)!=0|true))||(__CLR4_5_22tm2tmlvicmt21.R.iget(3673)==0&false))) {{
                __CLR4_5_22tm2tmlvicmt21.R.inc(3674);Frame f2 = fm2.get(f1.getId());
                __CLR4_5_22tm2tmlvicmt21.R.inc(3675);if ((((isCheckFrame)&&(__CLR4_5_22tm2tmlvicmt21.R.iget(3676)!=0|true))||(__CLR4_5_22tm2tmlvicmt21.R.iget(3677)==0&false))) {{
                    // we only need to do this once
                    __CLR4_5_22tm2tmlvicmt21.R.inc(3678);diffs.addAll(getDiffs(ftype, f1, f2));
                }
            }} }else {{
                __CLR4_5_22tm2tmlvicmt21.R.inc(3679);diffs.add(new Diff(ftype, "cannot find frame", f1, n));
            }
        }}
        }__CLR4_5_22tm2tmlvicmt21.R.inc(3680);return diffs;
    }finally{__CLR4_5_22tm2tmlvicmt21.R.flushNeeded();}}

    @Nonnull
    private static List<Diff> getDiffs(String ftype, @Nonnull Collection<Frame> fl1, @Nonnull Collection<Frame> fl2) {try{__CLR4_5_22tm2tmlvicmt21.R.inc(3681);
        __CLR4_5_22tm2tmlvicmt21.R.inc(3682);List<Diff> diffs = getDiffsAsym(ftype, fl1, fl2, 1, true);
        __CLR4_5_22tm2tmlvicmt21.R.inc(3683);diffs.addAll(getDiffsAsym(ftype, fl1, fl2, 2, false));
        __CLR4_5_22tm2tmlvicmt21.R.inc(3684);return diffs;
    }finally{__CLR4_5_22tm2tmlvicmt21.R.flushNeeded();}}

    // FRAMES
    @SuppressWarnings("null")
    @Nonnull
    private static List<Diff> getDiffsAsym(String ftype, @Nonnull Frame f1, @Nonnull Frame f2, int n) {try{__CLR4_5_22tm2tmlvicmt21.R.inc(3685);
        __CLR4_5_22tm2tmlvicmt21.R.inc(3686);List<Diff> diffs = new ArrayList<>();
        __CLR4_5_22tm2tmlvicmt21.R.inc(3687);for (Clause c : f1.getClauses()) {{
            __CLR4_5_22tm2tmlvicmt21.R.inc(3688);boolean isMatched = false;
            __CLR4_5_22tm2tmlvicmt21.R.inc(3689);for (Clause c2 : f2.getClauses()) {{
                __CLR4_5_22tm2tmlvicmt21.R.inc(3690);if ((((c.getTag().equals(c2.getTag()))&&(__CLR4_5_22tm2tmlvicmt21.R.iget(3691)!=0|true))||(__CLR4_5_22tm2tmlvicmt21.R.iget(3692)==0&false))) {{
                    __CLR4_5_22tm2tmlvicmt21.R.inc(3693);if ((((c.equals(c2))&&(__CLR4_5_22tm2tmlvicmt21.R.iget(3694)!=0|true))||(__CLR4_5_22tm2tmlvicmt21.R.iget(3695)==0&false))) {{
                        __CLR4_5_22tm2tmlvicmt21.R.inc(3696);isMatched = true;
                        __CLR4_5_22tm2tmlvicmt21.R.inc(3697);if ((((OboFormatTag.TAG_XREF.getTag().equals(c.getTag()))&&(__CLR4_5_22tm2tmlvicmt21.R.iget(3698)!=0|true))||(__CLR4_5_22tm2tmlvicmt21.R.iget(3699)==0&false))) {{
                            __CLR4_5_22tm2tmlvicmt21.R.inc(3700);String a1 = c.getValue(Xref.class).getAnnotation();
                            __CLR4_5_22tm2tmlvicmt21.R.inc(3701);String a2 = c2.getValue(Xref.class).getAnnotation();
                            __CLR4_5_22tm2tmlvicmt21.R.inc(3702);isMatched = a1 == null && a2 == null || a1 != null && a1.equals(a2);
                        }
                        }__CLR4_5_22tm2tmlvicmt21.R.inc(3703);break;
                    }
                }}
            }}
            }__CLR4_5_22tm2tmlvicmt21.R.inc(3704);if ((((!isMatched)&&(__CLR4_5_22tm2tmlvicmt21.R.iget(3705)!=0|true))||(__CLR4_5_22tm2tmlvicmt21.R.iget(3706)==0&false))) {{
                __CLR4_5_22tm2tmlvicmt21.R.inc(3707);diffs.add(new Diff(ftype, "cannot_match_clause", f1, f2, c, n));
            }
        }}
        }__CLR4_5_22tm2tmlvicmt21.R.inc(3708);return diffs;
    }finally{__CLR4_5_22tm2tmlvicmt21.R.flushNeeded();}}

    @Nonnull
    private static List<Diff> getDiffs(String ftype, @Nonnull Frame f1, @Nonnull Frame f2) {try{__CLR4_5_22tm2tmlvicmt21.R.inc(3709);
        __CLR4_5_22tm2tmlvicmt21.R.inc(3710);List<Diff> diffs = getDiffsAsym(ftype, f1, f2, 1);
        __CLR4_5_22tm2tmlvicmt21.R.inc(3711);diffs.addAll(getDiffsAsym(ftype, f2, f1, 2));
        __CLR4_5_22tm2tmlvicmt21.R.inc(3712);return diffs;
    }finally{__CLR4_5_22tm2tmlvicmt21.R.flushNeeded();}}
}
