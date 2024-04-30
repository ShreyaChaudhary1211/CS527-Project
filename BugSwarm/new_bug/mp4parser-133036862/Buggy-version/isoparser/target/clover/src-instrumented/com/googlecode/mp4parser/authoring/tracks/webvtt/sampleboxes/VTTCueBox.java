/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.googlecode.mp4parser.authoring.tracks.webvtt.sampleboxes;

import com.coremedia.iso.IsoFile;
import com.coremedia.iso.IsoTypeWriter;
import com.mp4parser.streaming.WriteOnlyBox;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

public class VTTCueBox extends WriteOnlyBox {public static class __CLR4_5_2akmakmlvluljgc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,13761,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    CueSourceIDBox cueSourceIDBox; // optional source ID
    CueIDBox cueIDBox; // optional
    CueTimeBox cueTimeBox; // optional current time indication
    CueSettingsBox cueSettingsBox; // optional, cue settings
    CuePayloadBox cuePayloadBox; // the (mandatory) cue payload lines

    public VTTCueBox() {
        super("vtcc");__CLR4_5_2akmakmlvluljgc.R.inc(13703);try{__CLR4_5_2akmakmlvluljgc.R.inc(13702);
    }finally{__CLR4_5_2akmakmlvluljgc.R.flushNeeded();}}

    public long getSize() {try{__CLR4_5_2akmakmlvluljgc.R.inc(13704);
        __CLR4_5_2akmakmlvluljgc.R.inc(13705);return 8 +
                ((((cueSourceIDBox != null )&&(__CLR4_5_2akmakmlvluljgc.R.iget(13706)!=0|true))||(__CLR4_5_2akmakmlvluljgc.R.iget(13707)==0&false))? cueSourceIDBox.getSize() : 0) +
                ((((cueIDBox != null )&&(__CLR4_5_2akmakmlvluljgc.R.iget(13708)!=0|true))||(__CLR4_5_2akmakmlvluljgc.R.iget(13709)==0&false))? cueIDBox.getSize() : 0) +
                ((((cueTimeBox != null )&&(__CLR4_5_2akmakmlvluljgc.R.iget(13710)!=0|true))||(__CLR4_5_2akmakmlvluljgc.R.iget(13711)==0&false))? cueTimeBox.getSize() : 0) +
                ((((cueSettingsBox != null )&&(__CLR4_5_2akmakmlvluljgc.R.iget(13712)!=0|true))||(__CLR4_5_2akmakmlvluljgc.R.iget(13713)==0&false))? cueSettingsBox.getSize() : 0) +
                ((((cuePayloadBox != null )&&(__CLR4_5_2akmakmlvluljgc.R.iget(13714)!=0|true))||(__CLR4_5_2akmakmlvluljgc.R.iget(13715)==0&false))? cuePayloadBox.getSize() : 0);

    }finally{__CLR4_5_2akmakmlvluljgc.R.flushNeeded();}}

    public void getBox(WritableByteChannel writableByteChannel) throws IOException {try{__CLR4_5_2akmakmlvluljgc.R.inc(13716);
        __CLR4_5_2akmakmlvluljgc.R.inc(13717);ByteBuffer header = ByteBuffer.allocate(8);
        __CLR4_5_2akmakmlvluljgc.R.inc(13718);IsoTypeWriter.writeUInt32(header, getSize());
        __CLR4_5_2akmakmlvluljgc.R.inc(13719);header.put(IsoFile.fourCCtoBytes(getType()));
        __CLR4_5_2akmakmlvluljgc.R.inc(13720);writableByteChannel.write((ByteBuffer) header.rewind());
        __CLR4_5_2akmakmlvluljgc.R.inc(13721);if ((((cueSourceIDBox != null)&&(__CLR4_5_2akmakmlvluljgc.R.iget(13722)!=0|true))||(__CLR4_5_2akmakmlvluljgc.R.iget(13723)==0&false))) {{
            __CLR4_5_2akmakmlvluljgc.R.inc(13724);cueSourceIDBox.getBox(writableByteChannel);
        }
        }__CLR4_5_2akmakmlvluljgc.R.inc(13725);if ((((cueIDBox != null)&&(__CLR4_5_2akmakmlvluljgc.R.iget(13726)!=0|true))||(__CLR4_5_2akmakmlvluljgc.R.iget(13727)==0&false))) {{
            __CLR4_5_2akmakmlvluljgc.R.inc(13728);cueIDBox.getBox(writableByteChannel);
        }
        }__CLR4_5_2akmakmlvluljgc.R.inc(13729);if ((((cueTimeBox != null)&&(__CLR4_5_2akmakmlvluljgc.R.iget(13730)!=0|true))||(__CLR4_5_2akmakmlvluljgc.R.iget(13731)==0&false))) {{
            __CLR4_5_2akmakmlvluljgc.R.inc(13732);cueTimeBox.getBox(writableByteChannel);
        }
        }__CLR4_5_2akmakmlvluljgc.R.inc(13733);if ((((cueSettingsBox != null)&&(__CLR4_5_2akmakmlvluljgc.R.iget(13734)!=0|true))||(__CLR4_5_2akmakmlvluljgc.R.iget(13735)==0&false))) {{
            __CLR4_5_2akmakmlvluljgc.R.inc(13736);cueSettingsBox.getBox(writableByteChannel);
        }
        }__CLR4_5_2akmakmlvluljgc.R.inc(13737);if ((((cuePayloadBox != null)&&(__CLR4_5_2akmakmlvluljgc.R.iget(13738)!=0|true))||(__CLR4_5_2akmakmlvluljgc.R.iget(13739)==0&false))) {{
            __CLR4_5_2akmakmlvluljgc.R.inc(13740);cuePayloadBox.getBox(writableByteChannel);
        }
    }}finally{__CLR4_5_2akmakmlvluljgc.R.flushNeeded();}}

    public CueSourceIDBox getCueSourceIDBox() {try{__CLR4_5_2akmakmlvluljgc.R.inc(13741);
        __CLR4_5_2akmakmlvluljgc.R.inc(13742);return cueSourceIDBox;
    }finally{__CLR4_5_2akmakmlvluljgc.R.flushNeeded();}}

    public void setCueSourceIDBox(CueSourceIDBox cueSourceIDBox) {try{__CLR4_5_2akmakmlvluljgc.R.inc(13743);
        __CLR4_5_2akmakmlvluljgc.R.inc(13744);this.cueSourceIDBox = cueSourceIDBox;
    }finally{__CLR4_5_2akmakmlvluljgc.R.flushNeeded();}}

    public CueIDBox getCueIDBox() {try{__CLR4_5_2akmakmlvluljgc.R.inc(13745);
        __CLR4_5_2akmakmlvluljgc.R.inc(13746);return cueIDBox;
    }finally{__CLR4_5_2akmakmlvluljgc.R.flushNeeded();}}

    public void setCueIDBox(CueIDBox cueIDBox) {try{__CLR4_5_2akmakmlvluljgc.R.inc(13747);
        __CLR4_5_2akmakmlvluljgc.R.inc(13748);this.cueIDBox = cueIDBox;
    }finally{__CLR4_5_2akmakmlvluljgc.R.flushNeeded();}}

    public CueTimeBox getCueTimeBox() {try{__CLR4_5_2akmakmlvluljgc.R.inc(13749);
        __CLR4_5_2akmakmlvluljgc.R.inc(13750);return cueTimeBox;
    }finally{__CLR4_5_2akmakmlvluljgc.R.flushNeeded();}}

    public void setCueTimeBox(CueTimeBox cueTimeBox) {try{__CLR4_5_2akmakmlvluljgc.R.inc(13751);
        __CLR4_5_2akmakmlvluljgc.R.inc(13752);this.cueTimeBox = cueTimeBox;
    }finally{__CLR4_5_2akmakmlvluljgc.R.flushNeeded();}}

    public CueSettingsBox getCueSettingsBox() {try{__CLR4_5_2akmakmlvluljgc.R.inc(13753);
        __CLR4_5_2akmakmlvluljgc.R.inc(13754);return cueSettingsBox;
    }finally{__CLR4_5_2akmakmlvluljgc.R.flushNeeded();}}

    public void setCueSettingsBox(CueSettingsBox cueSettingsBox) {try{__CLR4_5_2akmakmlvluljgc.R.inc(13755);
        __CLR4_5_2akmakmlvluljgc.R.inc(13756);this.cueSettingsBox = cueSettingsBox;
    }finally{__CLR4_5_2akmakmlvluljgc.R.flushNeeded();}}

    public CuePayloadBox getCuePayloadBox() {try{__CLR4_5_2akmakmlvluljgc.R.inc(13757);
        __CLR4_5_2akmakmlvluljgc.R.inc(13758);return cuePayloadBox;
    }finally{__CLR4_5_2akmakmlvluljgc.R.flushNeeded();}}

    public void setCuePayloadBox(CuePayloadBox cuePayloadBox) {try{__CLR4_5_2akmakmlvluljgc.R.inc(13759);
        __CLR4_5_2akmakmlvluljgc.R.inc(13760);this.cuePayloadBox = cuePayloadBox;
    }finally{__CLR4_5_2akmakmlvluljgc.R.flushNeeded();}}
}
