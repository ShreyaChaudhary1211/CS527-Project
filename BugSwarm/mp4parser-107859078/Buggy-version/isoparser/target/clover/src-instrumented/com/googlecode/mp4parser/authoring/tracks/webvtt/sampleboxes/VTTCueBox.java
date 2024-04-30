/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.googlecode.mp4parser.authoring.tracks.webvtt.sampleboxes;

import com.coremedia.iso.IsoFile;
import com.coremedia.iso.IsoTypeWriter;
import com.mp4parser.streaming.WriteOnlyBox;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

public class VTTCueBox extends WriteOnlyBox {public static class __CLR4_5_2ahzahzlvl9ej4c{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,13666,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    CueSourceIDBox cueSourceIDBox; // optional source ID
    CueIDBox cueIDBox; // optional
    CueTimeBox cueTimeBox; // optional current time indication
    CueSettingsBox cueSettingsBox; // optional, cue settings
    CuePayloadBox cuePayloadBox; // the (mandatory) cue payload lines

    public VTTCueBox() {
        super("vtcc");__CLR4_5_2ahzahzlvl9ej4c.R.inc(13608);try{__CLR4_5_2ahzahzlvl9ej4c.R.inc(13607);
    }finally{__CLR4_5_2ahzahzlvl9ej4c.R.flushNeeded();}}

    public long getSize() {try{__CLR4_5_2ahzahzlvl9ej4c.R.inc(13609);
        __CLR4_5_2ahzahzlvl9ej4c.R.inc(13610);return 8 +
                ((((cueSourceIDBox != null )&&(__CLR4_5_2ahzahzlvl9ej4c.R.iget(13611)!=0|true))||(__CLR4_5_2ahzahzlvl9ej4c.R.iget(13612)==0&false))? cueSourceIDBox.getSize() : 0) +
                ((((cueIDBox != null )&&(__CLR4_5_2ahzahzlvl9ej4c.R.iget(13613)!=0|true))||(__CLR4_5_2ahzahzlvl9ej4c.R.iget(13614)==0&false))? cueIDBox.getSize() : 0) +
                ((((cueTimeBox != null )&&(__CLR4_5_2ahzahzlvl9ej4c.R.iget(13615)!=0|true))||(__CLR4_5_2ahzahzlvl9ej4c.R.iget(13616)==0&false))? cueTimeBox.getSize() : 0) +
                ((((cueSettingsBox != null )&&(__CLR4_5_2ahzahzlvl9ej4c.R.iget(13617)!=0|true))||(__CLR4_5_2ahzahzlvl9ej4c.R.iget(13618)==0&false))? cueSettingsBox.getSize() : 0) +
                ((((cuePayloadBox != null )&&(__CLR4_5_2ahzahzlvl9ej4c.R.iget(13619)!=0|true))||(__CLR4_5_2ahzahzlvl9ej4c.R.iget(13620)==0&false))? cuePayloadBox.getSize() : 0);

    }finally{__CLR4_5_2ahzahzlvl9ej4c.R.flushNeeded();}}

    public void getBox(WritableByteChannel writableByteChannel) throws IOException {try{__CLR4_5_2ahzahzlvl9ej4c.R.inc(13621);
        __CLR4_5_2ahzahzlvl9ej4c.R.inc(13622);ByteBuffer header = ByteBuffer.allocate(8);
        __CLR4_5_2ahzahzlvl9ej4c.R.inc(13623);IsoTypeWriter.writeUInt32(header, getSize());
        __CLR4_5_2ahzahzlvl9ej4c.R.inc(13624);header.put(IsoFile.fourCCtoBytes(getType()));
        __CLR4_5_2ahzahzlvl9ej4c.R.inc(13625);writableByteChannel.write((ByteBuffer) header.rewind());
        __CLR4_5_2ahzahzlvl9ej4c.R.inc(13626);if ((((cueSourceIDBox != null)&&(__CLR4_5_2ahzahzlvl9ej4c.R.iget(13627)!=0|true))||(__CLR4_5_2ahzahzlvl9ej4c.R.iget(13628)==0&false))) {{
            __CLR4_5_2ahzahzlvl9ej4c.R.inc(13629);cueSourceIDBox.getBox(writableByteChannel);
        }
        }__CLR4_5_2ahzahzlvl9ej4c.R.inc(13630);if ((((cueIDBox != null)&&(__CLR4_5_2ahzahzlvl9ej4c.R.iget(13631)!=0|true))||(__CLR4_5_2ahzahzlvl9ej4c.R.iget(13632)==0&false))) {{
            __CLR4_5_2ahzahzlvl9ej4c.R.inc(13633);cueIDBox.getBox(writableByteChannel);
        }
        }__CLR4_5_2ahzahzlvl9ej4c.R.inc(13634);if ((((cueTimeBox != null)&&(__CLR4_5_2ahzahzlvl9ej4c.R.iget(13635)!=0|true))||(__CLR4_5_2ahzahzlvl9ej4c.R.iget(13636)==0&false))) {{
            __CLR4_5_2ahzahzlvl9ej4c.R.inc(13637);cueTimeBox.getBox(writableByteChannel);
        }
        }__CLR4_5_2ahzahzlvl9ej4c.R.inc(13638);if ((((cueSettingsBox != null)&&(__CLR4_5_2ahzahzlvl9ej4c.R.iget(13639)!=0|true))||(__CLR4_5_2ahzahzlvl9ej4c.R.iget(13640)==0&false))) {{
            __CLR4_5_2ahzahzlvl9ej4c.R.inc(13641);cueSettingsBox.getBox(writableByteChannel);
        }
        }__CLR4_5_2ahzahzlvl9ej4c.R.inc(13642);if ((((cuePayloadBox != null)&&(__CLR4_5_2ahzahzlvl9ej4c.R.iget(13643)!=0|true))||(__CLR4_5_2ahzahzlvl9ej4c.R.iget(13644)==0&false))) {{
            __CLR4_5_2ahzahzlvl9ej4c.R.inc(13645);cuePayloadBox.getBox(writableByteChannel);
        }
    }}finally{__CLR4_5_2ahzahzlvl9ej4c.R.flushNeeded();}}

    public CueSourceIDBox getCueSourceIDBox() {try{__CLR4_5_2ahzahzlvl9ej4c.R.inc(13646);
        __CLR4_5_2ahzahzlvl9ej4c.R.inc(13647);return cueSourceIDBox;
    }finally{__CLR4_5_2ahzahzlvl9ej4c.R.flushNeeded();}}

    public void setCueSourceIDBox(CueSourceIDBox cueSourceIDBox) {try{__CLR4_5_2ahzahzlvl9ej4c.R.inc(13648);
        __CLR4_5_2ahzahzlvl9ej4c.R.inc(13649);this.cueSourceIDBox = cueSourceIDBox;
    }finally{__CLR4_5_2ahzahzlvl9ej4c.R.flushNeeded();}}

    public CueIDBox getCueIDBox() {try{__CLR4_5_2ahzahzlvl9ej4c.R.inc(13650);
        __CLR4_5_2ahzahzlvl9ej4c.R.inc(13651);return cueIDBox;
    }finally{__CLR4_5_2ahzahzlvl9ej4c.R.flushNeeded();}}

    public void setCueIDBox(CueIDBox cueIDBox) {try{__CLR4_5_2ahzahzlvl9ej4c.R.inc(13652);
        __CLR4_5_2ahzahzlvl9ej4c.R.inc(13653);this.cueIDBox = cueIDBox;
    }finally{__CLR4_5_2ahzahzlvl9ej4c.R.flushNeeded();}}

    public CueTimeBox getCueTimeBox() {try{__CLR4_5_2ahzahzlvl9ej4c.R.inc(13654);
        __CLR4_5_2ahzahzlvl9ej4c.R.inc(13655);return cueTimeBox;
    }finally{__CLR4_5_2ahzahzlvl9ej4c.R.flushNeeded();}}

    public void setCueTimeBox(CueTimeBox cueTimeBox) {try{__CLR4_5_2ahzahzlvl9ej4c.R.inc(13656);
        __CLR4_5_2ahzahzlvl9ej4c.R.inc(13657);this.cueTimeBox = cueTimeBox;
    }finally{__CLR4_5_2ahzahzlvl9ej4c.R.flushNeeded();}}

    public CueSettingsBox getCueSettingsBox() {try{__CLR4_5_2ahzahzlvl9ej4c.R.inc(13658);
        __CLR4_5_2ahzahzlvl9ej4c.R.inc(13659);return cueSettingsBox;
    }finally{__CLR4_5_2ahzahzlvl9ej4c.R.flushNeeded();}}

    public void setCueSettingsBox(CueSettingsBox cueSettingsBox) {try{__CLR4_5_2ahzahzlvl9ej4c.R.inc(13660);
        __CLR4_5_2ahzahzlvl9ej4c.R.inc(13661);this.cueSettingsBox = cueSettingsBox;
    }finally{__CLR4_5_2ahzahzlvl9ej4c.R.flushNeeded();}}

    public CuePayloadBox getCuePayloadBox() {try{__CLR4_5_2ahzahzlvl9ej4c.R.inc(13662);
        __CLR4_5_2ahzahzlvl9ej4c.R.inc(13663);return cuePayloadBox;
    }finally{__CLR4_5_2ahzahzlvl9ej4c.R.flushNeeded();}}

    public void setCuePayloadBox(CuePayloadBox cuePayloadBox) {try{__CLR4_5_2ahzahzlvl9ej4c.R.inc(13664);
        __CLR4_5_2ahzahzlvl9ej4c.R.inc(13665);this.cuePayloadBox = cuePayloadBox;
    }finally{__CLR4_5_2ahzahzlvl9ej4c.R.flushNeeded();}}
}
