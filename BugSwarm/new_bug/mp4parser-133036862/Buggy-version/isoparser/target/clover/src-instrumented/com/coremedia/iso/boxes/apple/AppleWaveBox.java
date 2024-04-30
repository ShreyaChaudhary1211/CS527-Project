/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.coremedia.iso.boxes.apple;

import com.googlecode.mp4parser.AbstractContainerBox;

/**
 * <h1>4cc = "{@value #TYPE}"</h1>
 * siDecompressionParam Atom ('wave')
 * <p>The siDecompressionParam atom provides the ability to store data specific to a given audio decompressor in the
 * SoundDescription record. As example, some audio decompression algorithms, such as Microsoft\u2019s ADPCM, require a
 * set of out-of-band values to configure the decompressor. These are stored in an atom of this type.</p>
 * <p>This atom contains other atoms with audio decompressor settings and is a required extension to the sound sample
 * description for MPEG-4 audio. A 'wave' chunk for 'mp4a' typically contains (in order) at least a 'frma' atom, an
 * 'mp4a' atom, an 'esds' atom, and a \u201cTerminator Atom (0x00000000)\u201d atom.</p>
 * <p>The contents of other siDecompressionParam atoms are dependent on the audio decompressor.
 * <ul>
 * <li>Size - An unsigned 32-bit integer holding the size of the decompression parameters atom</li>
 * <li>Type - An unsigned 32-bit field containing the four-character code 'wave'</li>
 * <li>TrackExtension atoms - Atoms containing the necessary out-of-band decompression parameters for the sound decompressor.
 * For MPEG-4 audio ('mp4a'), this includes elementary stream descriptor ('esds'), format ('frma'), and terminator atoms.</li>
 * </ul>
 * <p>Possible paths: /moov/trak/mdia/minf/stbl/stsd/mp4a/wave/esds or /moov/trak/mdia/minf/stbl/stsd/mp4a/wave/mp4a/esds</p>
 *
 * @author Paul Gregoire (mondain@gmail.com)
 */
public final class AppleWaveBox extends AbstractContainerBox {public static class __CLR4_5_22bx2bxlvlulc5t{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,3023,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static final String TYPE = "wave";

    public AppleWaveBox() {
        super(TYPE);__CLR4_5_22bx2bxlvlulc5t.R.inc(3022);try{__CLR4_5_22bx2bxlvlulc5t.R.inc(3021);
    }finally{__CLR4_5_22bx2bxlvlulc5t.R.flushNeeded();}}

}
