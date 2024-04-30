/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.obolibrary.oboformat.diff;

import javax.annotation.Nonnull;

import org.obolibrary.oboformat.model.Clause;
import org.obolibrary.oboformat.model.Frame;

/** Diff */
public class Diff {public static class __CLR4_5_22sj2sjlvicmt1x{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u006f\u0062\u006f\u0066\u006f\u0072\u006d\u0061\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237308750L,8589935092L,3658,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    String type;
    final String frameType;
    Frame frame1;
    Frame frame2;
    Clause clause1;
    Clause clause2;
    final int frameNum;

    /**
     * @param ftype
     *        ftype
     * @param type
     *        type
     * @param f1
     *        f1
     * @param n
     *        n
     */
    public Diff(String ftype, String type, Frame f1, int n) {
        this(ftype, type, f1, null, null, n);__CLR4_5_22sj2sjlvicmt1x.R.inc(3620);try{__CLR4_5_22sj2sjlvicmt1x.R.inc(3619);
    }finally{__CLR4_5_22sj2sjlvicmt1x.R.flushNeeded();}}

    /**
     * @param ftype
     *        ftype
     * @param type
     *        type
     * @param f1
     *        f1
     * @param f2
     *        f2
     * @param c
     *        c
     * @param n
     *        n
     */
    public Diff(String ftype, String type, Frame f1, Frame f2, Clause c, int n) {try{__CLR4_5_22sj2sjlvicmt1x.R.inc(3621);
        __CLR4_5_22sj2sjlvicmt1x.R.inc(3622);this.type = type;
        __CLR4_5_22sj2sjlvicmt1x.R.inc(3623);frame1 = f1;
        __CLR4_5_22sj2sjlvicmt1x.R.inc(3624);frame2 = f2;
        __CLR4_5_22sj2sjlvicmt1x.R.inc(3625);clause1 = c;
        __CLR4_5_22sj2sjlvicmt1x.R.inc(3626);frameNum = n;
        __CLR4_5_22sj2sjlvicmt1x.R.inc(3627);frameType = ftype;
    }finally{__CLR4_5_22sj2sjlvicmt1x.R.flushNeeded();}}

    /**
     * @return type
     */
    public String getType() {try{__CLR4_5_22sj2sjlvicmt1x.R.inc(3628);
        __CLR4_5_22sj2sjlvicmt1x.R.inc(3629);return type;
    }finally{__CLR4_5_22sj2sjlvicmt1x.R.flushNeeded();}}

    /**
     * @param type
     *        type
     */
    public void setType(String type) {try{__CLR4_5_22sj2sjlvicmt1x.R.inc(3630);
        __CLR4_5_22sj2sjlvicmt1x.R.inc(3631);this.type = type;
    }finally{__CLR4_5_22sj2sjlvicmt1x.R.flushNeeded();}}

    /**
     * @return frame1
     */
    public Frame getFrame1() {try{__CLR4_5_22sj2sjlvicmt1x.R.inc(3632);
        __CLR4_5_22sj2sjlvicmt1x.R.inc(3633);return frame1;
    }finally{__CLR4_5_22sj2sjlvicmt1x.R.flushNeeded();}}

    /**
     * @param frame1
     *        frame1
     */
    public void setFrame1(Frame frame1) {try{__CLR4_5_22sj2sjlvicmt1x.R.inc(3634);
        __CLR4_5_22sj2sjlvicmt1x.R.inc(3635);this.frame1 = frame1;
    }finally{__CLR4_5_22sj2sjlvicmt1x.R.flushNeeded();}}

    /**
     * @return frame2
     */
    public Frame getFrame2() {try{__CLR4_5_22sj2sjlvicmt1x.R.inc(3636);
        __CLR4_5_22sj2sjlvicmt1x.R.inc(3637);return frame2;
    }finally{__CLR4_5_22sj2sjlvicmt1x.R.flushNeeded();}}

    /**
     * @param frame2
     *        frame2
     */
    public void setFrame2(Frame frame2) {try{__CLR4_5_22sj2sjlvicmt1x.R.inc(3638);
        __CLR4_5_22sj2sjlvicmt1x.R.inc(3639);this.frame2 = frame2;
    }finally{__CLR4_5_22sj2sjlvicmt1x.R.flushNeeded();}}

    /**
     * @return clause1
     */
    public Clause getClause1() {try{__CLR4_5_22sj2sjlvicmt1x.R.inc(3640);
        __CLR4_5_22sj2sjlvicmt1x.R.inc(3641);return clause1;
    }finally{__CLR4_5_22sj2sjlvicmt1x.R.flushNeeded();}}

    /**
     * @param clause1
     *        clause1
     */
    public void setClause1(Clause clause1) {try{__CLR4_5_22sj2sjlvicmt1x.R.inc(3642);
        __CLR4_5_22sj2sjlvicmt1x.R.inc(3643);this.clause1 = clause1;
    }finally{__CLR4_5_22sj2sjlvicmt1x.R.flushNeeded();}}

    /**
     * @return clause2
     */
    public Clause getClause2() {try{__CLR4_5_22sj2sjlvicmt1x.R.inc(3644);
        __CLR4_5_22sj2sjlvicmt1x.R.inc(3645);return clause2;
    }finally{__CLR4_5_22sj2sjlvicmt1x.R.flushNeeded();}}

    /**
     * @param clause2
     *        clause2
     */
    public void setClause2(Clause clause2) {try{__CLR4_5_22sj2sjlvicmt1x.R.inc(3646);
        __CLR4_5_22sj2sjlvicmt1x.R.inc(3647);this.clause2 = clause2;
    }finally{__CLR4_5_22sj2sjlvicmt1x.R.flushNeeded();}}

    @Nonnull
    @Override
    public String toString() {try{__CLR4_5_22sj2sjlvicmt1x.R.inc(3648);
        __CLR4_5_22sj2sjlvicmt1x.R.inc(3649);return type + ' ' + frameType + " Frame1=" + ((((frame1 == null )&&(__CLR4_5_22sj2sjlvicmt1x.R.iget(3650)!=0|true))||(__CLR4_5_22sj2sjlvicmt1x.R.iget(3651)==0&false))? "-" : frame1.getId()) + " Frame2="
            + ((((frame2 == null )&&(__CLR4_5_22sj2sjlvicmt1x.R.iget(3652)!=0|true))||(__CLR4_5_22sj2sjlvicmt1x.R.iget(3653)==0&false))? "-" : frame2.getId()) + " Clause1=" + ((((clause1 == null )&&(__CLR4_5_22sj2sjlvicmt1x.R.iget(3654)!=0|true))||(__CLR4_5_22sj2sjlvicmt1x.R.iget(3655)==0&false))? "-" : clause1) + " Clause2="
            + ((((clause2 == null )&&(__CLR4_5_22sj2sjlvicmt1x.R.iget(3656)!=0|true))||(__CLR4_5_22sj2sjlvicmt1x.R.iget(3657)==0&false))? "-" : clause2) + " In=Frame" + frameNum;
    }finally{__CLR4_5_22sj2sjlvicmt1x.R.flushNeeded();}}
    /*
     * public String toOboDelta() throws IOException { Vector<String> lines =
     * new Vector(); String line1 = null; if(frame1.getType() !=
     * frame2.getType()) { throw new
     * IOException("Frames must be of same type: "+frame1+" -vs- "+frame2); }
     * if(frame1.getType() == FrameType.TERM) line1 = "[Term]"; else
     * if(frame1.getType() == FrameType.TYPEDEF) line1 = "[Typedef]"; else
     * if(frame1.getType() == FrameType.INSTANCE) line1 = "[Instance]";
     * lines.add(line1); lines.add("id: "+frame1.getId()); if (clause1 == null)
     * { } else { lines.add("-"); } return line1 + "\n" + line2 + "\n"; }
     */
}
