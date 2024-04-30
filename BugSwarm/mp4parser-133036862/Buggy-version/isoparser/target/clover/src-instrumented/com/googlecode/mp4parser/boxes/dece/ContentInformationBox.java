/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.googlecode.mp4parser.boxes.dece;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.Utf8;
import com.googlecode.mp4parser.AbstractFullBox;

import java.nio.ByteBuffer;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * <pre>
 * aligned(8) class ContentInformationBox
 * extends FullBox(\u2018cinf\u2019, version=0, flags=0)
 * {
 *  string          mimeSubtypeName;
 *  string          profile-level-idc;
 *  string          codecs;
 *  unsigned int(8) protection;
 *  string          languages;
 *  unsigned int(8) brand_entry_count;
 *  for( int i=0; i &lt; brand_entry_count; i++)
 *  {
 *   string iso_brand;
 *   string version
 *  }
 *  unsigned int(8) id_entry_count;
 *  for( int i=0; i &lt; id_entry_count; i++)
 *  {
 *   string namespace;
 *   string asset_id;
 *  }
 * }
 * </pre>
 */
public class ContentInformationBox extends AbstractFullBox {public static class __CLR4_5_2bzmbzmlvlulkgw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,15650,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static final String TYPE = "cinf";

    String mimeSubtypeName;
    String profileLevelIdc;
    String codecs;
    String protection;
    String languages;

    Map<String, String> brandEntries = new LinkedHashMap<String, String>();
    Map<String, String> idEntries = new LinkedHashMap<String, String>();

    public ContentInformationBox() {
        super(TYPE);__CLR4_5_2bzmbzmlvlulkgw.R.inc(15539);try{__CLR4_5_2bzmbzmlvlulkgw.R.inc(15538);
    }finally{__CLR4_5_2bzmbzmlvlulkgw.R.flushNeeded();}}

    @Override
    protected long getContentSize() {try{__CLR4_5_2bzmbzmlvlulkgw.R.inc(15540);
        __CLR4_5_2bzmbzmlvlulkgw.R.inc(15541);long size = 4;
        __CLR4_5_2bzmbzmlvlulkgw.R.inc(15542);size += Utf8.utf8StringLengthInBytes(mimeSubtypeName) + 1;
        __CLR4_5_2bzmbzmlvlulkgw.R.inc(15543);size += Utf8.utf8StringLengthInBytes(profileLevelIdc) + 1;
        __CLR4_5_2bzmbzmlvlulkgw.R.inc(15544);size += Utf8.utf8StringLengthInBytes(codecs) + 1;
        __CLR4_5_2bzmbzmlvlulkgw.R.inc(15545);size += Utf8.utf8StringLengthInBytes(protection) + 1;
        __CLR4_5_2bzmbzmlvlulkgw.R.inc(15546);size += Utf8.utf8StringLengthInBytes(languages) + 1;
        __CLR4_5_2bzmbzmlvlulkgw.R.inc(15547);size += 1;
        __CLR4_5_2bzmbzmlvlulkgw.R.inc(15548);for (Map.Entry<String, String> brandEntry : brandEntries.entrySet()) {{
            __CLR4_5_2bzmbzmlvlulkgw.R.inc(15549);size += Utf8.utf8StringLengthInBytes(brandEntry.getKey()) + 1;
            __CLR4_5_2bzmbzmlvlulkgw.R.inc(15550);size += Utf8.utf8StringLengthInBytes(brandEntry.getValue()) + 1;
        }
        }__CLR4_5_2bzmbzmlvlulkgw.R.inc(15551);size += 1;
        __CLR4_5_2bzmbzmlvlulkgw.R.inc(15552);for (Map.Entry<String, String> idEntry : idEntries.entrySet()) {{
            __CLR4_5_2bzmbzmlvlulkgw.R.inc(15553);size += Utf8.utf8StringLengthInBytes(idEntry.getKey()) + 1;
            __CLR4_5_2bzmbzmlvlulkgw.R.inc(15554);size += Utf8.utf8StringLengthInBytes(idEntry.getValue()) + 1;

        }
        }__CLR4_5_2bzmbzmlvlulkgw.R.inc(15555);return size;
    }finally{__CLR4_5_2bzmbzmlvlulkgw.R.flushNeeded();}}

    @Override
    protected void getContent(ByteBuffer byteBuffer) {try{__CLR4_5_2bzmbzmlvlulkgw.R.inc(15556);
        __CLR4_5_2bzmbzmlvlulkgw.R.inc(15557);writeVersionAndFlags(byteBuffer);
        __CLR4_5_2bzmbzmlvlulkgw.R.inc(15558);IsoTypeWriter.writeZeroTermUtf8String(byteBuffer, mimeSubtypeName);
        __CLR4_5_2bzmbzmlvlulkgw.R.inc(15559);IsoTypeWriter.writeZeroTermUtf8String(byteBuffer, profileLevelIdc);
        __CLR4_5_2bzmbzmlvlulkgw.R.inc(15560);IsoTypeWriter.writeZeroTermUtf8String(byteBuffer, codecs);
        __CLR4_5_2bzmbzmlvlulkgw.R.inc(15561);IsoTypeWriter.writeZeroTermUtf8String(byteBuffer, protection);
        __CLR4_5_2bzmbzmlvlulkgw.R.inc(15562);IsoTypeWriter.writeZeroTermUtf8String(byteBuffer, languages);
        __CLR4_5_2bzmbzmlvlulkgw.R.inc(15563);IsoTypeWriter.writeUInt8(byteBuffer, brandEntries.size());
        __CLR4_5_2bzmbzmlvlulkgw.R.inc(15564);for (Map.Entry<String, String> brandEntry : brandEntries.entrySet()) {{
            __CLR4_5_2bzmbzmlvlulkgw.R.inc(15565);IsoTypeWriter.writeZeroTermUtf8String(byteBuffer, brandEntry.getKey());
            __CLR4_5_2bzmbzmlvlulkgw.R.inc(15566);IsoTypeWriter.writeZeroTermUtf8String(byteBuffer, brandEntry.getValue());
        }
        }__CLR4_5_2bzmbzmlvlulkgw.R.inc(15567);IsoTypeWriter.writeUInt8(byteBuffer, idEntries.size());
        __CLR4_5_2bzmbzmlvlulkgw.R.inc(15568);for (Map.Entry<String, String> idEntry : idEntries.entrySet()) {{
            __CLR4_5_2bzmbzmlvlulkgw.R.inc(15569);IsoTypeWriter.writeZeroTermUtf8String(byteBuffer, idEntry.getKey());
            __CLR4_5_2bzmbzmlvlulkgw.R.inc(15570);IsoTypeWriter.writeZeroTermUtf8String(byteBuffer, idEntry.getValue());

        }
    }}finally{__CLR4_5_2bzmbzmlvlulkgw.R.flushNeeded();}}

    @Override
    protected void _parseDetails(ByteBuffer content) {try{__CLR4_5_2bzmbzmlvlulkgw.R.inc(15571);
        __CLR4_5_2bzmbzmlvlulkgw.R.inc(15572);parseVersionAndFlags(content);
        __CLR4_5_2bzmbzmlvlulkgw.R.inc(15573);mimeSubtypeName = IsoTypeReader.readString(content);
        __CLR4_5_2bzmbzmlvlulkgw.R.inc(15574);profileLevelIdc = IsoTypeReader.readString(content);
        __CLR4_5_2bzmbzmlvlulkgw.R.inc(15575);codecs = IsoTypeReader.readString(content);
        __CLR4_5_2bzmbzmlvlulkgw.R.inc(15576);protection = IsoTypeReader.readString(content);
        __CLR4_5_2bzmbzmlvlulkgw.R.inc(15577);languages = IsoTypeReader.readString(content);
        __CLR4_5_2bzmbzmlvlulkgw.R.inc(15578);int brandEntryCount = IsoTypeReader.readUInt8(content);
        __CLR4_5_2bzmbzmlvlulkgw.R.inc(15579);while ((((brandEntryCount-- > 0)&&(__CLR4_5_2bzmbzmlvlulkgw.R.iget(15580)!=0|true))||(__CLR4_5_2bzmbzmlvlulkgw.R.iget(15581)==0&false))) {{
            __CLR4_5_2bzmbzmlvlulkgw.R.inc(15582);brandEntries.put(IsoTypeReader.readString(content), IsoTypeReader.readString(content));
        }
        }__CLR4_5_2bzmbzmlvlulkgw.R.inc(15583);int idEntryCount = IsoTypeReader.readUInt8(content);
        __CLR4_5_2bzmbzmlvlulkgw.R.inc(15584);while ((((idEntryCount-- > 0)&&(__CLR4_5_2bzmbzmlvlulkgw.R.iget(15585)!=0|true))||(__CLR4_5_2bzmbzmlvlulkgw.R.iget(15586)==0&false))) {{
            __CLR4_5_2bzmbzmlvlulkgw.R.inc(15587);idEntries.put(IsoTypeReader.readString(content), IsoTypeReader.readString(content));
        }
    }}finally{__CLR4_5_2bzmbzmlvlulkgw.R.flushNeeded();}}

    public static class BrandEntry {
        public BrandEntry(String iso_brand, String version) {try{__CLR4_5_2bzmbzmlvlulkgw.R.inc(15588);
            __CLR4_5_2bzmbzmlvlulkgw.R.inc(15589);this.iso_brand = iso_brand;
            __CLR4_5_2bzmbzmlvlulkgw.R.inc(15590);this.version = version;
        }finally{__CLR4_5_2bzmbzmlvlulkgw.R.flushNeeded();}}

        String iso_brand;
        String version;

        @Override
        public boolean equals(Object o) {try{__CLR4_5_2bzmbzmlvlulkgw.R.inc(15591);
            __CLR4_5_2bzmbzmlvlulkgw.R.inc(15592);if ((((this == o)&&(__CLR4_5_2bzmbzmlvlulkgw.R.iget(15593)!=0|true))||(__CLR4_5_2bzmbzmlvlulkgw.R.iget(15594)==0&false))) {__CLR4_5_2bzmbzmlvlulkgw.R.inc(15595);return true;
            }__CLR4_5_2bzmbzmlvlulkgw.R.inc(15596);if ((((o == null || getClass() != o.getClass())&&(__CLR4_5_2bzmbzmlvlulkgw.R.iget(15597)!=0|true))||(__CLR4_5_2bzmbzmlvlulkgw.R.iget(15598)==0&false))) {__CLR4_5_2bzmbzmlvlulkgw.R.inc(15599);return false;

            }__CLR4_5_2bzmbzmlvlulkgw.R.inc(15600);BrandEntry that = (BrandEntry) o;

            __CLR4_5_2bzmbzmlvlulkgw.R.inc(15601);if (((((((iso_brand != null )&&(__CLR4_5_2bzmbzmlvlulkgw.R.iget(15602)!=0|true))||(__CLR4_5_2bzmbzmlvlulkgw.R.iget(15603)==0&false))? !iso_brand.equals(that.iso_brand) : that.iso_brand != null)&&(__CLR4_5_2bzmbzmlvlulkgw.R.iget(15604)!=0|true))||(__CLR4_5_2bzmbzmlvlulkgw.R.iget(15605)==0&false))) {__CLR4_5_2bzmbzmlvlulkgw.R.inc(15606);return false;
            }__CLR4_5_2bzmbzmlvlulkgw.R.inc(15607);if (((((((version != null )&&(__CLR4_5_2bzmbzmlvlulkgw.R.iget(15608)!=0|true))||(__CLR4_5_2bzmbzmlvlulkgw.R.iget(15609)==0&false))? !version.equals(that.version) : that.version != null)&&(__CLR4_5_2bzmbzmlvlulkgw.R.iget(15610)!=0|true))||(__CLR4_5_2bzmbzmlvlulkgw.R.iget(15611)==0&false))) {__CLR4_5_2bzmbzmlvlulkgw.R.inc(15612);return false;

            }__CLR4_5_2bzmbzmlvlulkgw.R.inc(15613);return true;
        }finally{__CLR4_5_2bzmbzmlvlulkgw.R.flushNeeded();}}

        @Override
        public int hashCode() {try{__CLR4_5_2bzmbzmlvlulkgw.R.inc(15614);
            __CLR4_5_2bzmbzmlvlulkgw.R.inc(15615);int result = (((iso_brand != null )&&(__CLR4_5_2bzmbzmlvlulkgw.R.iget(15616)!=0|true))||(__CLR4_5_2bzmbzmlvlulkgw.R.iget(15617)==0&false))? iso_brand.hashCode() : 0;
            __CLR4_5_2bzmbzmlvlulkgw.R.inc(15618);result = 31 * result + ((((version != null )&&(__CLR4_5_2bzmbzmlvlulkgw.R.iget(15619)!=0|true))||(__CLR4_5_2bzmbzmlvlulkgw.R.iget(15620)==0&false))? version.hashCode() : 0);
            __CLR4_5_2bzmbzmlvlulkgw.R.inc(15621);return result;
        }finally{__CLR4_5_2bzmbzmlvlulkgw.R.flushNeeded();}}
    }

    public String getMimeSubtypeName() {try{__CLR4_5_2bzmbzmlvlulkgw.R.inc(15622);
        __CLR4_5_2bzmbzmlvlulkgw.R.inc(15623);return mimeSubtypeName;
    }finally{__CLR4_5_2bzmbzmlvlulkgw.R.flushNeeded();}}

    public void setMimeSubtypeName(String mimeSubtypeName) {try{__CLR4_5_2bzmbzmlvlulkgw.R.inc(15624);
        __CLR4_5_2bzmbzmlvlulkgw.R.inc(15625);this.mimeSubtypeName = mimeSubtypeName;
    }finally{__CLR4_5_2bzmbzmlvlulkgw.R.flushNeeded();}}

    public String getProfileLevelIdc() {try{__CLR4_5_2bzmbzmlvlulkgw.R.inc(15626);
        __CLR4_5_2bzmbzmlvlulkgw.R.inc(15627);return profileLevelIdc;
    }finally{__CLR4_5_2bzmbzmlvlulkgw.R.flushNeeded();}}

    public void setProfileLevelIdc(String profileLevelIdc) {try{__CLR4_5_2bzmbzmlvlulkgw.R.inc(15628);
        __CLR4_5_2bzmbzmlvlulkgw.R.inc(15629);this.profileLevelIdc = profileLevelIdc;
    }finally{__CLR4_5_2bzmbzmlvlulkgw.R.flushNeeded();}}

    public String getCodecs() {try{__CLR4_5_2bzmbzmlvlulkgw.R.inc(15630);
        __CLR4_5_2bzmbzmlvlulkgw.R.inc(15631);return codecs;
    }finally{__CLR4_5_2bzmbzmlvlulkgw.R.flushNeeded();}}

    public void setCodecs(String codecs) {try{__CLR4_5_2bzmbzmlvlulkgw.R.inc(15632);
        __CLR4_5_2bzmbzmlvlulkgw.R.inc(15633);this.codecs = codecs;
    }finally{__CLR4_5_2bzmbzmlvlulkgw.R.flushNeeded();}}

    public String getProtection() {try{__CLR4_5_2bzmbzmlvlulkgw.R.inc(15634);
        __CLR4_5_2bzmbzmlvlulkgw.R.inc(15635);return protection;
    }finally{__CLR4_5_2bzmbzmlvlulkgw.R.flushNeeded();}}

    public void setProtection(String protection) {try{__CLR4_5_2bzmbzmlvlulkgw.R.inc(15636);
        __CLR4_5_2bzmbzmlvlulkgw.R.inc(15637);this.protection = protection;
    }finally{__CLR4_5_2bzmbzmlvlulkgw.R.flushNeeded();}}

    public String getLanguages() {try{__CLR4_5_2bzmbzmlvlulkgw.R.inc(15638);
        __CLR4_5_2bzmbzmlvlulkgw.R.inc(15639);return languages;
    }finally{__CLR4_5_2bzmbzmlvlulkgw.R.flushNeeded();}}

    public void setLanguages(String languages) {try{__CLR4_5_2bzmbzmlvlulkgw.R.inc(15640);
        __CLR4_5_2bzmbzmlvlulkgw.R.inc(15641);this.languages = languages;
    }finally{__CLR4_5_2bzmbzmlvlulkgw.R.flushNeeded();}}

    public Map<String, String> getBrandEntries() {try{__CLR4_5_2bzmbzmlvlulkgw.R.inc(15642);
        __CLR4_5_2bzmbzmlvlulkgw.R.inc(15643);return brandEntries;
    }finally{__CLR4_5_2bzmbzmlvlulkgw.R.flushNeeded();}}

    public void setBrandEntries(Map<String, String> brandEntries) {try{__CLR4_5_2bzmbzmlvlulkgw.R.inc(15644);
        __CLR4_5_2bzmbzmlvlulkgw.R.inc(15645);this.brandEntries = brandEntries;
    }finally{__CLR4_5_2bzmbzmlvlulkgw.R.flushNeeded();}}

    public Map<String, String> getIdEntries() {try{__CLR4_5_2bzmbzmlvlulkgw.R.inc(15646);
        __CLR4_5_2bzmbzmlvlulkgw.R.inc(15647);return idEntries;
    }finally{__CLR4_5_2bzmbzmlvlulkgw.R.flushNeeded();}}

    public void setIdEntries(Map<String, String> idEntries) {try{__CLR4_5_2bzmbzmlvlulkgw.R.inc(15648);
        __CLR4_5_2bzmbzmlvlulkgw.R.inc(15649);this.idEntries = idEntries;
    }finally{__CLR4_5_2bzmbzmlvlulkgw.R.flushNeeded();}}
}
