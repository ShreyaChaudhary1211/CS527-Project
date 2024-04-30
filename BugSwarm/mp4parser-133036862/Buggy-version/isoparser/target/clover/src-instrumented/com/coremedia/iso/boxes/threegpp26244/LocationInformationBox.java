/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.coremedia.iso.boxes.threegpp26244;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.Utf8;
import com.googlecode.mp4parser.AbstractFullBox;

import java.nio.ByteBuffer;

/**
 * <h1>4cc = "{@value #TYPE}"</h1>
 * Location Information Box as specified in TS 26.244.
 */
public class LocationInformationBox extends AbstractFullBox {public static class __CLR4_5_23jz3jzlvlulcq4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,4666,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static final String TYPE = "loci";

    private String language;
    private String name = "";
    private int role;
    private double longitude;
    private double latitude;
    private double altitude;
    private String astronomicalBody = "";
    private String additionalNotes = "";

    public LocationInformationBox() {
        super(TYPE);__CLR4_5_23jz3jzlvlulcq4.R.inc(4608);try{__CLR4_5_23jz3jzlvlulcq4.R.inc(4607);
    }finally{__CLR4_5_23jz3jzlvlulcq4.R.flushNeeded();}}

    public String getLanguage() {try{__CLR4_5_23jz3jzlvlulcq4.R.inc(4609);
        __CLR4_5_23jz3jzlvlulcq4.R.inc(4610);return language;
    }finally{__CLR4_5_23jz3jzlvlulcq4.R.flushNeeded();}}

    public void setLanguage(String language) {try{__CLR4_5_23jz3jzlvlulcq4.R.inc(4611);
        __CLR4_5_23jz3jzlvlulcq4.R.inc(4612);this.language = language;
    }finally{__CLR4_5_23jz3jzlvlulcq4.R.flushNeeded();}}

    public String getName() {try{__CLR4_5_23jz3jzlvlulcq4.R.inc(4613);
        __CLR4_5_23jz3jzlvlulcq4.R.inc(4614);return name;
    }finally{__CLR4_5_23jz3jzlvlulcq4.R.flushNeeded();}}

    public void setName(String name) {try{__CLR4_5_23jz3jzlvlulcq4.R.inc(4615);
        __CLR4_5_23jz3jzlvlulcq4.R.inc(4616);this.name = name;
    }finally{__CLR4_5_23jz3jzlvlulcq4.R.flushNeeded();}}

    public int getRole() {try{__CLR4_5_23jz3jzlvlulcq4.R.inc(4617);
        __CLR4_5_23jz3jzlvlulcq4.R.inc(4618);return role;
    }finally{__CLR4_5_23jz3jzlvlulcq4.R.flushNeeded();}}

    public void setRole(int role) {try{__CLR4_5_23jz3jzlvlulcq4.R.inc(4619);
        __CLR4_5_23jz3jzlvlulcq4.R.inc(4620);this.role = role;
    }finally{__CLR4_5_23jz3jzlvlulcq4.R.flushNeeded();}}

    public double getLongitude() {try{__CLR4_5_23jz3jzlvlulcq4.R.inc(4621);
        __CLR4_5_23jz3jzlvlulcq4.R.inc(4622);return longitude;
    }finally{__CLR4_5_23jz3jzlvlulcq4.R.flushNeeded();}}

    public void setLongitude(double longitude) {try{__CLR4_5_23jz3jzlvlulcq4.R.inc(4623);
        __CLR4_5_23jz3jzlvlulcq4.R.inc(4624);this.longitude = longitude;
    }finally{__CLR4_5_23jz3jzlvlulcq4.R.flushNeeded();}}

    public double getLatitude() {try{__CLR4_5_23jz3jzlvlulcq4.R.inc(4625);
        __CLR4_5_23jz3jzlvlulcq4.R.inc(4626);return latitude;
    }finally{__CLR4_5_23jz3jzlvlulcq4.R.flushNeeded();}}

    public void setLatitude(double latitude) {try{__CLR4_5_23jz3jzlvlulcq4.R.inc(4627);
        __CLR4_5_23jz3jzlvlulcq4.R.inc(4628);this.latitude = latitude;
    }finally{__CLR4_5_23jz3jzlvlulcq4.R.flushNeeded();}}

    public double getAltitude() {try{__CLR4_5_23jz3jzlvlulcq4.R.inc(4629);
        __CLR4_5_23jz3jzlvlulcq4.R.inc(4630);return altitude;
    }finally{__CLR4_5_23jz3jzlvlulcq4.R.flushNeeded();}}

    public void setAltitude(double altitude) {try{__CLR4_5_23jz3jzlvlulcq4.R.inc(4631);
        __CLR4_5_23jz3jzlvlulcq4.R.inc(4632);this.altitude = altitude;
    }finally{__CLR4_5_23jz3jzlvlulcq4.R.flushNeeded();}}

    public String getAstronomicalBody() {try{__CLR4_5_23jz3jzlvlulcq4.R.inc(4633);
        __CLR4_5_23jz3jzlvlulcq4.R.inc(4634);return astronomicalBody;
    }finally{__CLR4_5_23jz3jzlvlulcq4.R.flushNeeded();}}

    public void setAstronomicalBody(String astronomicalBody) {try{__CLR4_5_23jz3jzlvlulcq4.R.inc(4635);
        __CLR4_5_23jz3jzlvlulcq4.R.inc(4636);this.astronomicalBody = astronomicalBody;
    }finally{__CLR4_5_23jz3jzlvlulcq4.R.flushNeeded();}}

    public String getAdditionalNotes() {try{__CLR4_5_23jz3jzlvlulcq4.R.inc(4637);
        __CLR4_5_23jz3jzlvlulcq4.R.inc(4638);return additionalNotes;
    }finally{__CLR4_5_23jz3jzlvlulcq4.R.flushNeeded();}}

    public void setAdditionalNotes(String additionalNotes) {try{__CLR4_5_23jz3jzlvlulcq4.R.inc(4639);
        __CLR4_5_23jz3jzlvlulcq4.R.inc(4640);this.additionalNotes = additionalNotes;
    }finally{__CLR4_5_23jz3jzlvlulcq4.R.flushNeeded();}}

    protected long getContentSize() {try{__CLR4_5_23jz3jzlvlulcq4.R.inc(4641);
        __CLR4_5_23jz3jzlvlulcq4.R.inc(4642);return 22 + Utf8.convert(name).length + Utf8.convert(astronomicalBody).length + Utf8.convert(additionalNotes).length;
    }finally{__CLR4_5_23jz3jzlvlulcq4.R.flushNeeded();}}

    @Override
    public void _parseDetails(ByteBuffer content) {try{__CLR4_5_23jz3jzlvlulcq4.R.inc(4643);
        __CLR4_5_23jz3jzlvlulcq4.R.inc(4644);parseVersionAndFlags(content);
        __CLR4_5_23jz3jzlvlulcq4.R.inc(4645);language = IsoTypeReader.readIso639(content);
        __CLR4_5_23jz3jzlvlulcq4.R.inc(4646);name = IsoTypeReader.readString(content);
        __CLR4_5_23jz3jzlvlulcq4.R.inc(4647);role = IsoTypeReader.readUInt8(content);
        __CLR4_5_23jz3jzlvlulcq4.R.inc(4648);longitude = IsoTypeReader.readFixedPoint1616(content);
        __CLR4_5_23jz3jzlvlulcq4.R.inc(4649);latitude = IsoTypeReader.readFixedPoint1616(content);
        __CLR4_5_23jz3jzlvlulcq4.R.inc(4650);altitude = IsoTypeReader.readFixedPoint1616(content);
        __CLR4_5_23jz3jzlvlulcq4.R.inc(4651);astronomicalBody = IsoTypeReader.readString(content);
        __CLR4_5_23jz3jzlvlulcq4.R.inc(4652);additionalNotes = IsoTypeReader.readString(content);
    }finally{__CLR4_5_23jz3jzlvlulcq4.R.flushNeeded();}}


    @Override
    protected void getContent(ByteBuffer byteBuffer) {try{__CLR4_5_23jz3jzlvlulcq4.R.inc(4653);
        __CLR4_5_23jz3jzlvlulcq4.R.inc(4654);writeVersionAndFlags(byteBuffer);
        __CLR4_5_23jz3jzlvlulcq4.R.inc(4655);IsoTypeWriter.writeIso639(byteBuffer, language);
        __CLR4_5_23jz3jzlvlulcq4.R.inc(4656);byteBuffer.put(Utf8.convert(name));
        __CLR4_5_23jz3jzlvlulcq4.R.inc(4657);byteBuffer.put((byte) 0);
        __CLR4_5_23jz3jzlvlulcq4.R.inc(4658);IsoTypeWriter.writeUInt8(byteBuffer, role);
        __CLR4_5_23jz3jzlvlulcq4.R.inc(4659);IsoTypeWriter.writeFixedPoint1616(byteBuffer, longitude);
        __CLR4_5_23jz3jzlvlulcq4.R.inc(4660);IsoTypeWriter.writeFixedPoint1616(byteBuffer, latitude);
        __CLR4_5_23jz3jzlvlulcq4.R.inc(4661);IsoTypeWriter.writeFixedPoint1616(byteBuffer, altitude);
        __CLR4_5_23jz3jzlvlulcq4.R.inc(4662);byteBuffer.put(Utf8.convert(astronomicalBody));
        __CLR4_5_23jz3jzlvlulcq4.R.inc(4663);byteBuffer.put((byte) 0);
        __CLR4_5_23jz3jzlvlulcq4.R.inc(4664);byteBuffer.put(Utf8.convert(additionalNotes));
        __CLR4_5_23jz3jzlvlulcq4.R.inc(4665);byteBuffer.put((byte) 0);
    }finally{__CLR4_5_23jz3jzlvlulcq4.R.flushNeeded();}}
}
