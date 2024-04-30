/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.mp4parser.iso23009.part1;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.Utf8;
import com.googlecode.mp4parser.AbstractFullBox;

import java.nio.ByteBuffer;

/**
 *  The Event Message box ('emsg') provides signalling for generic events related to the media
 *  presentation time.
 */
public class EventMessageBox extends AbstractFullBox {public static class __CLR4_5_2h5dh5dlvl9eld4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,22276,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static final String TYPE = "emsg";

    String schemeIdUri;
    String value;
    long timescale;
    long presentationTimeDelta;
    long eventDuration;
    long id;
    byte[] messageData;

    public EventMessageBox() {
        super(TYPE);__CLR4_5_2h5dh5dlvl9eld4.R.inc(22226);try{__CLR4_5_2h5dh5dlvl9eld4.R.inc(22225);
    }finally{__CLR4_5_2h5dh5dlvl9eld4.R.flushNeeded();}}

    @Override
    protected void _parseDetails(ByteBuffer content) {try{__CLR4_5_2h5dh5dlvl9eld4.R.inc(22227);
        __CLR4_5_2h5dh5dlvl9eld4.R.inc(22228);parseVersionAndFlags(content);
        __CLR4_5_2h5dh5dlvl9eld4.R.inc(22229);schemeIdUri = IsoTypeReader.readString(content);
        __CLR4_5_2h5dh5dlvl9eld4.R.inc(22230);value = IsoTypeReader.readString(content);
        __CLR4_5_2h5dh5dlvl9eld4.R.inc(22231);timescale = IsoTypeReader.readUInt32(content);
        __CLR4_5_2h5dh5dlvl9eld4.R.inc(22232);presentationTimeDelta = IsoTypeReader.readUInt32(content);
        __CLR4_5_2h5dh5dlvl9eld4.R.inc(22233);eventDuration = IsoTypeReader.readUInt32(content);
        __CLR4_5_2h5dh5dlvl9eld4.R.inc(22234);id = IsoTypeReader.readUInt32(content);
        __CLR4_5_2h5dh5dlvl9eld4.R.inc(22235);messageData = new byte[content.remaining()];
        __CLR4_5_2h5dh5dlvl9eld4.R.inc(22236);content.get(messageData);
    }finally{__CLR4_5_2h5dh5dlvl9eld4.R.flushNeeded();}}

    @Override
    protected void getContent(ByteBuffer byteBuffer) {try{__CLR4_5_2h5dh5dlvl9eld4.R.inc(22237);
        __CLR4_5_2h5dh5dlvl9eld4.R.inc(22238);writeVersionAndFlags(byteBuffer);
        __CLR4_5_2h5dh5dlvl9eld4.R.inc(22239);IsoTypeWriter.writeUtf8String(byteBuffer, schemeIdUri);
        __CLR4_5_2h5dh5dlvl9eld4.R.inc(22240);IsoTypeWriter.writeUtf8String(byteBuffer, value);
        __CLR4_5_2h5dh5dlvl9eld4.R.inc(22241);IsoTypeWriter.writeUInt32(byteBuffer, timescale);
        __CLR4_5_2h5dh5dlvl9eld4.R.inc(22242);IsoTypeWriter.writeUInt32(byteBuffer, presentationTimeDelta);
        __CLR4_5_2h5dh5dlvl9eld4.R.inc(22243);IsoTypeWriter.writeUInt32(byteBuffer, eventDuration);
        __CLR4_5_2h5dh5dlvl9eld4.R.inc(22244);IsoTypeWriter.writeUInt32(byteBuffer, id);
        __CLR4_5_2h5dh5dlvl9eld4.R.inc(22245);byteBuffer.put(messageData);
    }finally{__CLR4_5_2h5dh5dlvl9eld4.R.flushNeeded();}}

    @Override
    protected long getContentSize() {try{__CLR4_5_2h5dh5dlvl9eld4.R.inc(22246);
        __CLR4_5_2h5dh5dlvl9eld4.R.inc(22247);return 22 + Utf8.utf8StringLengthInBytes(schemeIdUri) + Utf8.utf8StringLengthInBytes(value) + messageData.length;
    }finally{__CLR4_5_2h5dh5dlvl9eld4.R.flushNeeded();}}

    public String getSchemeIdUri() {try{__CLR4_5_2h5dh5dlvl9eld4.R.inc(22248);
        __CLR4_5_2h5dh5dlvl9eld4.R.inc(22249);return schemeIdUri;
    }finally{__CLR4_5_2h5dh5dlvl9eld4.R.flushNeeded();}}

    public void setSchemeIdUri(String schemeIdUri) {try{__CLR4_5_2h5dh5dlvl9eld4.R.inc(22250);
        __CLR4_5_2h5dh5dlvl9eld4.R.inc(22251);this.schemeIdUri = schemeIdUri;
    }finally{__CLR4_5_2h5dh5dlvl9eld4.R.flushNeeded();}}

    public String getValue() {try{__CLR4_5_2h5dh5dlvl9eld4.R.inc(22252);
        __CLR4_5_2h5dh5dlvl9eld4.R.inc(22253);return value;
    }finally{__CLR4_5_2h5dh5dlvl9eld4.R.flushNeeded();}}

    public void setValue(String value) {try{__CLR4_5_2h5dh5dlvl9eld4.R.inc(22254);
        __CLR4_5_2h5dh5dlvl9eld4.R.inc(22255);this.value = value;
    }finally{__CLR4_5_2h5dh5dlvl9eld4.R.flushNeeded();}}

    public long getTimescale() {try{__CLR4_5_2h5dh5dlvl9eld4.R.inc(22256);
        __CLR4_5_2h5dh5dlvl9eld4.R.inc(22257);return timescale;
    }finally{__CLR4_5_2h5dh5dlvl9eld4.R.flushNeeded();}}

    public void setTimescale(long timescale) {try{__CLR4_5_2h5dh5dlvl9eld4.R.inc(22258);
        __CLR4_5_2h5dh5dlvl9eld4.R.inc(22259);this.timescale = timescale;
    }finally{__CLR4_5_2h5dh5dlvl9eld4.R.flushNeeded();}}

    public long getPresentationTimeDelta() {try{__CLR4_5_2h5dh5dlvl9eld4.R.inc(22260);
        __CLR4_5_2h5dh5dlvl9eld4.R.inc(22261);return presentationTimeDelta;
    }finally{__CLR4_5_2h5dh5dlvl9eld4.R.flushNeeded();}}

    public void setPresentationTimeDelta(long presentationTimeDelta) {try{__CLR4_5_2h5dh5dlvl9eld4.R.inc(22262);
        __CLR4_5_2h5dh5dlvl9eld4.R.inc(22263);this.presentationTimeDelta = presentationTimeDelta;
    }finally{__CLR4_5_2h5dh5dlvl9eld4.R.flushNeeded();}}

    public long getEventDuration() {try{__CLR4_5_2h5dh5dlvl9eld4.R.inc(22264);
        __CLR4_5_2h5dh5dlvl9eld4.R.inc(22265);return eventDuration;
    }finally{__CLR4_5_2h5dh5dlvl9eld4.R.flushNeeded();}}

    public void setEventDuration(long eventDuration) {try{__CLR4_5_2h5dh5dlvl9eld4.R.inc(22266);
        __CLR4_5_2h5dh5dlvl9eld4.R.inc(22267);this.eventDuration = eventDuration;
    }finally{__CLR4_5_2h5dh5dlvl9eld4.R.flushNeeded();}}

    public long getId() {try{__CLR4_5_2h5dh5dlvl9eld4.R.inc(22268);
        __CLR4_5_2h5dh5dlvl9eld4.R.inc(22269);return id;
    }finally{__CLR4_5_2h5dh5dlvl9eld4.R.flushNeeded();}}

    public void setId(long id) {try{__CLR4_5_2h5dh5dlvl9eld4.R.inc(22270);
        __CLR4_5_2h5dh5dlvl9eld4.R.inc(22271);this.id = id;
    }finally{__CLR4_5_2h5dh5dlvl9eld4.R.flushNeeded();}}

    public byte[] getMessageData() {try{__CLR4_5_2h5dh5dlvl9eld4.R.inc(22272);
        __CLR4_5_2h5dh5dlvl9eld4.R.inc(22273);return messageData;
    }finally{__CLR4_5_2h5dh5dlvl9eld4.R.flushNeeded();}}

    public void setMessageData(byte[] messageData) {try{__CLR4_5_2h5dh5dlvl9eld4.R.inc(22274);
        __CLR4_5_2h5dh5dlvl9eld4.R.inc(22275);this.messageData = messageData;
    }finally{__CLR4_5_2h5dh5dlvl9eld4.R.flushNeeded();}}
}
