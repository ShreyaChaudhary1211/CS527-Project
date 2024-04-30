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
public class LocationInformationBox extends AbstractFullBox {public static class __CLR4_5_23j23j2lvl9efu7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,4633,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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
        super(TYPE);__CLR4_5_23j23j2lvl9efu7.R.inc(4575);try{__CLR4_5_23j23j2lvl9efu7.R.inc(4574);
    }finally{__CLR4_5_23j23j2lvl9efu7.R.flushNeeded();}}

    public String getLanguage() {try{__CLR4_5_23j23j2lvl9efu7.R.inc(4576);
        __CLR4_5_23j23j2lvl9efu7.R.inc(4577);return language;
    }finally{__CLR4_5_23j23j2lvl9efu7.R.flushNeeded();}}

    public void setLanguage(String language) {try{__CLR4_5_23j23j2lvl9efu7.R.inc(4578);
        __CLR4_5_23j23j2lvl9efu7.R.inc(4579);this.language = language;
    }finally{__CLR4_5_23j23j2lvl9efu7.R.flushNeeded();}}

    public String getName() {try{__CLR4_5_23j23j2lvl9efu7.R.inc(4580);
        __CLR4_5_23j23j2lvl9efu7.R.inc(4581);return name;
    }finally{__CLR4_5_23j23j2lvl9efu7.R.flushNeeded();}}

    public void setName(String name) {try{__CLR4_5_23j23j2lvl9efu7.R.inc(4582);
        __CLR4_5_23j23j2lvl9efu7.R.inc(4583);this.name = name;
    }finally{__CLR4_5_23j23j2lvl9efu7.R.flushNeeded();}}

    public int getRole() {try{__CLR4_5_23j23j2lvl9efu7.R.inc(4584);
        __CLR4_5_23j23j2lvl9efu7.R.inc(4585);return role;
    }finally{__CLR4_5_23j23j2lvl9efu7.R.flushNeeded();}}

    public void setRole(int role) {try{__CLR4_5_23j23j2lvl9efu7.R.inc(4586);
        __CLR4_5_23j23j2lvl9efu7.R.inc(4587);this.role = role;
    }finally{__CLR4_5_23j23j2lvl9efu7.R.flushNeeded();}}

    public double getLongitude() {try{__CLR4_5_23j23j2lvl9efu7.R.inc(4588);
        __CLR4_5_23j23j2lvl9efu7.R.inc(4589);return longitude;
    }finally{__CLR4_5_23j23j2lvl9efu7.R.flushNeeded();}}

    public void setLongitude(double longitude) {try{__CLR4_5_23j23j2lvl9efu7.R.inc(4590);
        __CLR4_5_23j23j2lvl9efu7.R.inc(4591);this.longitude = longitude;
    }finally{__CLR4_5_23j23j2lvl9efu7.R.flushNeeded();}}

    public double getLatitude() {try{__CLR4_5_23j23j2lvl9efu7.R.inc(4592);
        __CLR4_5_23j23j2lvl9efu7.R.inc(4593);return latitude;
    }finally{__CLR4_5_23j23j2lvl9efu7.R.flushNeeded();}}

    public void setLatitude(double latitude) {try{__CLR4_5_23j23j2lvl9efu7.R.inc(4594);
        __CLR4_5_23j23j2lvl9efu7.R.inc(4595);this.latitude = latitude;
    }finally{__CLR4_5_23j23j2lvl9efu7.R.flushNeeded();}}

    public double getAltitude() {try{__CLR4_5_23j23j2lvl9efu7.R.inc(4596);
        __CLR4_5_23j23j2lvl9efu7.R.inc(4597);return altitude;
    }finally{__CLR4_5_23j23j2lvl9efu7.R.flushNeeded();}}

    public void setAltitude(double altitude) {try{__CLR4_5_23j23j2lvl9efu7.R.inc(4598);
        __CLR4_5_23j23j2lvl9efu7.R.inc(4599);this.altitude = altitude;
    }finally{__CLR4_5_23j23j2lvl9efu7.R.flushNeeded();}}

    public String getAstronomicalBody() {try{__CLR4_5_23j23j2lvl9efu7.R.inc(4600);
        __CLR4_5_23j23j2lvl9efu7.R.inc(4601);return astronomicalBody;
    }finally{__CLR4_5_23j23j2lvl9efu7.R.flushNeeded();}}

    public void setAstronomicalBody(String astronomicalBody) {try{__CLR4_5_23j23j2lvl9efu7.R.inc(4602);
        __CLR4_5_23j23j2lvl9efu7.R.inc(4603);this.astronomicalBody = astronomicalBody;
    }finally{__CLR4_5_23j23j2lvl9efu7.R.flushNeeded();}}

    public String getAdditionalNotes() {try{__CLR4_5_23j23j2lvl9efu7.R.inc(4604);
        __CLR4_5_23j23j2lvl9efu7.R.inc(4605);return additionalNotes;
    }finally{__CLR4_5_23j23j2lvl9efu7.R.flushNeeded();}}

    public void setAdditionalNotes(String additionalNotes) {try{__CLR4_5_23j23j2lvl9efu7.R.inc(4606);
        __CLR4_5_23j23j2lvl9efu7.R.inc(4607);this.additionalNotes = additionalNotes;
    }finally{__CLR4_5_23j23j2lvl9efu7.R.flushNeeded();}}

    protected long getContentSize() {try{__CLR4_5_23j23j2lvl9efu7.R.inc(4608);
        __CLR4_5_23j23j2lvl9efu7.R.inc(4609);return 22 + Utf8.convert(name).length + Utf8.convert(astronomicalBody).length + Utf8.convert(additionalNotes).length;
    }finally{__CLR4_5_23j23j2lvl9efu7.R.flushNeeded();}}

    @Override
    public void _parseDetails(ByteBuffer content) {try{__CLR4_5_23j23j2lvl9efu7.R.inc(4610);
        __CLR4_5_23j23j2lvl9efu7.R.inc(4611);parseVersionAndFlags(content);
        __CLR4_5_23j23j2lvl9efu7.R.inc(4612);language = IsoTypeReader.readIso639(content);
        __CLR4_5_23j23j2lvl9efu7.R.inc(4613);name = IsoTypeReader.readString(content);
        __CLR4_5_23j23j2lvl9efu7.R.inc(4614);role = IsoTypeReader.readUInt8(content);
        __CLR4_5_23j23j2lvl9efu7.R.inc(4615);longitude = IsoTypeReader.readFixedPoint1616(content);
        __CLR4_5_23j23j2lvl9efu7.R.inc(4616);latitude = IsoTypeReader.readFixedPoint1616(content);
        __CLR4_5_23j23j2lvl9efu7.R.inc(4617);altitude = IsoTypeReader.readFixedPoint1616(content);
        __CLR4_5_23j23j2lvl9efu7.R.inc(4618);astronomicalBody = IsoTypeReader.readString(content);
        __CLR4_5_23j23j2lvl9efu7.R.inc(4619);additionalNotes = IsoTypeReader.readString(content);
    }finally{__CLR4_5_23j23j2lvl9efu7.R.flushNeeded();}}


    @Override
    protected void getContent(ByteBuffer byteBuffer) {try{__CLR4_5_23j23j2lvl9efu7.R.inc(4620);
        __CLR4_5_23j23j2lvl9efu7.R.inc(4621);writeVersionAndFlags(byteBuffer);
        __CLR4_5_23j23j2lvl9efu7.R.inc(4622);IsoTypeWriter.writeIso639(byteBuffer, language);
        __CLR4_5_23j23j2lvl9efu7.R.inc(4623);byteBuffer.put(Utf8.convert(name));
        __CLR4_5_23j23j2lvl9efu7.R.inc(4624);byteBuffer.put((byte) 0);
        __CLR4_5_23j23j2lvl9efu7.R.inc(4625);IsoTypeWriter.writeUInt8(byteBuffer, role);
        __CLR4_5_23j23j2lvl9efu7.R.inc(4626);IsoTypeWriter.writeFixedPoint1616(byteBuffer, longitude);
        __CLR4_5_23j23j2lvl9efu7.R.inc(4627);IsoTypeWriter.writeFixedPoint1616(byteBuffer, latitude);
        __CLR4_5_23j23j2lvl9efu7.R.inc(4628);IsoTypeWriter.writeFixedPoint1616(byteBuffer, altitude);
        __CLR4_5_23j23j2lvl9efu7.R.inc(4629);byteBuffer.put(Utf8.convert(astronomicalBody));
        __CLR4_5_23j23j2lvl9efu7.R.inc(4630);byteBuffer.put((byte) 0);
        __CLR4_5_23j23j2lvl9efu7.R.inc(4631);byteBuffer.put(Utf8.convert(additionalNotes));
        __CLR4_5_23j23j2lvl9efu7.R.inc(4632);byteBuffer.put((byte) 0);
    }finally{__CLR4_5_23j23j2lvl9efu7.R.flushNeeded();}}
}
