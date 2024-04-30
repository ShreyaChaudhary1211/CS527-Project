/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.mp4parser.iso14496.part12;


import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractBox;
import com.googlecode.mp4parser.util.Mp4Arrays;

import java.nio.ByteBuffer;


/**
 * This box provides a reference from the containing track to another track in the presentation. These references
 * are typed. A 'hint' reference links from the containing hint track to the media data that it hints. A content
 * description reference 'cdsc' links a descriptive or metadata track to the content which it describes. The
 * 'hind' dependency indicates that the referenced track(s)may contain media data required for decoding of
 * the track containing the track reference. The referenced tracks shall be hint tracks. The 'hind' dependency
 * can, for example, be used for indicating the dependencies between hint tracks documenting layered IP
 * multicast over RTP.
 * Exactly one Track Reference Box can be contained within the Track Box.
 * If this box is not present, the track is not referencing anyother track in any way. The reference array is sized
 * to fill the reference type box.
 */
public class TrackReferenceTypeBox extends AbstractBox {public static class __CLR4_5_2g31g31lvl9el4d{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,20861,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    long[] trackIds = new long[0];

    // \u2018hint\u2019  the referenced track(s) contain the original media for this hint track
    // \u2018cdsc\u2018  this track describes the referenced track.
    // 'hind'  this track depends on the referenced hint track, i.e., it should only be used if the referenced hint track is used.
    // 'vdep'  this track contains auxiliary depth video information for the referenced video track
    // 'vplx'  this track contains auxiliary parallax video information for the referenced video track

    public TrackReferenceTypeBox(String type) {
        super(type);__CLR4_5_2g31g31lvl9el4d.R.inc(20846);try{__CLR4_5_2g31g31lvl9el4d.R.inc(20845);
    }finally{__CLR4_5_2g31g31lvl9el4d.R.flushNeeded();}}

    @Override
    protected long getContentSize() {try{__CLR4_5_2g31g31lvl9el4d.R.inc(20847);
        __CLR4_5_2g31g31lvl9el4d.R.inc(20848);return trackIds.length * 4;
    }finally{__CLR4_5_2g31g31lvl9el4d.R.flushNeeded();}}

    @Override
    protected void getContent(ByteBuffer byteBuffer) {try{__CLR4_5_2g31g31lvl9el4d.R.inc(20849);
        __CLR4_5_2g31g31lvl9el4d.R.inc(20850);for (long trackId : trackIds) {{
            __CLR4_5_2g31g31lvl9el4d.R.inc(20851);IsoTypeWriter.writeUInt32(byteBuffer, trackId);
        }
    }}finally{__CLR4_5_2g31g31lvl9el4d.R.flushNeeded();}}

    @Override
    protected void _parseDetails(ByteBuffer content) {try{__CLR4_5_2g31g31lvl9el4d.R.inc(20852);
        __CLR4_5_2g31g31lvl9el4d.R.inc(20853);while ((((content.remaining() >= 4)&&(__CLR4_5_2g31g31lvl9el4d.R.iget(20854)!=0|true))||(__CLR4_5_2g31g31lvl9el4d.R.iget(20855)==0&false))) {{
            __CLR4_5_2g31g31lvl9el4d.R.inc(20856);trackIds = Mp4Arrays.copyOfAndAppend(trackIds, new long[]{IsoTypeReader.readUInt32(content)});
        }

    }}finally{__CLR4_5_2g31g31lvl9el4d.R.flushNeeded();}}

    public long[] getTrackIds() {try{__CLR4_5_2g31g31lvl9el4d.R.inc(20857);
        __CLR4_5_2g31g31lvl9el4d.R.inc(20858);return trackIds;
    }finally{__CLR4_5_2g31g31lvl9el4d.R.flushNeeded();}}

    public void setTrackIds(long[] trackIds) {try{__CLR4_5_2g31g31lvl9el4d.R.inc(20859);
        __CLR4_5_2g31g31lvl9el4d.R.inc(20860);this.trackIds = trackIds;
    }finally{__CLR4_5_2g31g31lvl9el4d.R.flushNeeded();}}
}
