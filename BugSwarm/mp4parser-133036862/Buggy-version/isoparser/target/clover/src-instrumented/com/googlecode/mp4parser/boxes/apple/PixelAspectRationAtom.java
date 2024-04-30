/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.googlecode.mp4parser.boxes.apple;

import com.googlecode.mp4parser.AbstractBox;
import com.googlecode.mp4parser.AbstractFullBox;

import java.nio.ByteBuffer;

/**
 * <h1>4cc = "{@value #TYPE}"</h1>
 * This extension specifies the height-to-width ratio of pixels found in
 * the video sample. This is a required extension for MPEG-4 and
 * uncompressed Y \u0301CbCr video formats when non-square pixels are used. It
 * is optional when square pixels are used.
 */
public class PixelAspectRationAtom extends AbstractBox {public static class __CLR4_5_2bh3bh3lvlulk2g{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,14889,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static final String TYPE = "pasp";


    public PixelAspectRationAtom() {
        super(TYPE);__CLR4_5_2bh3bh3lvlulk2g.R.inc(14872);try{__CLR4_5_2bh3bh3lvlulk2g.R.inc(14871);
    }finally{__CLR4_5_2bh3bh3lvlulk2g.R.flushNeeded();}}

    /**
     * An unsigned 32-bit integer specifying the horizontal spacing of pixels,
     * such as luma sampling instants for Y \u0301CbCr or YUV video.
     */
    private int hSpacing;
    /**
     * An unsigned 32-bit integer specifying the vertical spacing of pixels,
     * such as video picture lines.
     */
    private int vSpacing;


    public int gethSpacing() {try{__CLR4_5_2bh3bh3lvlulk2g.R.inc(14873);
        __CLR4_5_2bh3bh3lvlulk2g.R.inc(14874);return hSpacing;
    }finally{__CLR4_5_2bh3bh3lvlulk2g.R.flushNeeded();}}

    public void sethSpacing(int hSpacing) {try{__CLR4_5_2bh3bh3lvlulk2g.R.inc(14875);
        __CLR4_5_2bh3bh3lvlulk2g.R.inc(14876);this.hSpacing = hSpacing;
    }finally{__CLR4_5_2bh3bh3lvlulk2g.R.flushNeeded();}}

    public int getvSpacing() {try{__CLR4_5_2bh3bh3lvlulk2g.R.inc(14877);
        __CLR4_5_2bh3bh3lvlulk2g.R.inc(14878);return vSpacing;
    }finally{__CLR4_5_2bh3bh3lvlulk2g.R.flushNeeded();}}

    public void setvSpacing(int vSpacing) {try{__CLR4_5_2bh3bh3lvlulk2g.R.inc(14879);
        __CLR4_5_2bh3bh3lvlulk2g.R.inc(14880);this.vSpacing = vSpacing;
    }finally{__CLR4_5_2bh3bh3lvlulk2g.R.flushNeeded();}}

    @Override
    protected long getContentSize() {try{__CLR4_5_2bh3bh3lvlulk2g.R.inc(14881);
        __CLR4_5_2bh3bh3lvlulk2g.R.inc(14882);return 8;
    }finally{__CLR4_5_2bh3bh3lvlulk2g.R.flushNeeded();}}

    @Override
    protected void getContent(ByteBuffer byteBuffer) {try{__CLR4_5_2bh3bh3lvlulk2g.R.inc(14883);
        __CLR4_5_2bh3bh3lvlulk2g.R.inc(14884);byteBuffer.putInt(hSpacing);
        __CLR4_5_2bh3bh3lvlulk2g.R.inc(14885);byteBuffer.putInt(vSpacing);

    }finally{__CLR4_5_2bh3bh3lvlulk2g.R.flushNeeded();}}

    @Override
    protected void _parseDetails(ByteBuffer content) {try{__CLR4_5_2bh3bh3lvlulk2g.R.inc(14886);
        __CLR4_5_2bh3bh3lvlulk2g.R.inc(14887);hSpacing = content.getInt();
        __CLR4_5_2bh3bh3lvlulk2g.R.inc(14888);vSpacing = content.getInt();


    }finally{__CLR4_5_2bh3bh3lvlulk2g.R.flushNeeded();}}
}
