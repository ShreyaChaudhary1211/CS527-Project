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
public class ContentInformationBox extends AbstractFullBox {public static class __CLR4_5_2bwzbwzlvl9ek1r{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,15555,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static final String TYPE = "cinf";

    String mimeSubtypeName;
    String profileLevelIdc;
    String codecs;
    String protection;
    String languages;

    Map<String, String> brandEntries = new LinkedHashMap<String, String>();
    Map<String, String> idEntries = new LinkedHashMap<String, String>();

    public ContentInformationBox() {
        super(TYPE);__CLR4_5_2bwzbwzlvl9ek1r.R.inc(15444);try{__CLR4_5_2bwzbwzlvl9ek1r.R.inc(15443);
    }finally{__CLR4_5_2bwzbwzlvl9ek1r.R.flushNeeded();}}

    @Override
    protected long getContentSize() {try{__CLR4_5_2bwzbwzlvl9ek1r.R.inc(15445);
        __CLR4_5_2bwzbwzlvl9ek1r.R.inc(15446);long size = 4;
        __CLR4_5_2bwzbwzlvl9ek1r.R.inc(15447);size += Utf8.utf8StringLengthInBytes(mimeSubtypeName) + 1;
        __CLR4_5_2bwzbwzlvl9ek1r.R.inc(15448);size += Utf8.utf8StringLengthInBytes(profileLevelIdc) + 1;
        __CLR4_5_2bwzbwzlvl9ek1r.R.inc(15449);size += Utf8.utf8StringLengthInBytes(codecs) + 1;
        __CLR4_5_2bwzbwzlvl9ek1r.R.inc(15450);size += Utf8.utf8StringLengthInBytes(protection) + 1;
        __CLR4_5_2bwzbwzlvl9ek1r.R.inc(15451);size += Utf8.utf8StringLengthInBytes(languages) + 1;
        __CLR4_5_2bwzbwzlvl9ek1r.R.inc(15452);size += 1;
        __CLR4_5_2bwzbwzlvl9ek1r.R.inc(15453);for (Map.Entry<String, String> brandEntry : brandEntries.entrySet()) {{
            __CLR4_5_2bwzbwzlvl9ek1r.R.inc(15454);size += Utf8.utf8StringLengthInBytes(brandEntry.getKey()) + 1;
            __CLR4_5_2bwzbwzlvl9ek1r.R.inc(15455);size += Utf8.utf8StringLengthInBytes(brandEntry.getValue()) + 1;
        }
        }__CLR4_5_2bwzbwzlvl9ek1r.R.inc(15456);size += 1;
        __CLR4_5_2bwzbwzlvl9ek1r.R.inc(15457);for (Map.Entry<String, String> idEntry : idEntries.entrySet()) {{
            __CLR4_5_2bwzbwzlvl9ek1r.R.inc(15458);size += Utf8.utf8StringLengthInBytes(idEntry.getKey()) + 1;
            __CLR4_5_2bwzbwzlvl9ek1r.R.inc(15459);size += Utf8.utf8StringLengthInBytes(idEntry.getValue()) + 1;

        }
        }__CLR4_5_2bwzbwzlvl9ek1r.R.inc(15460);return size;
    }finally{__CLR4_5_2bwzbwzlvl9ek1r.R.flushNeeded();}}

    @Override
    protected void getContent(ByteBuffer byteBuffer) {try{__CLR4_5_2bwzbwzlvl9ek1r.R.inc(15461);
        __CLR4_5_2bwzbwzlvl9ek1r.R.inc(15462);writeVersionAndFlags(byteBuffer);
        __CLR4_5_2bwzbwzlvl9ek1r.R.inc(15463);IsoTypeWriter.writeZeroTermUtf8String(byteBuffer, mimeSubtypeName);
        __CLR4_5_2bwzbwzlvl9ek1r.R.inc(15464);IsoTypeWriter.writeZeroTermUtf8String(byteBuffer, profileLevelIdc);
        __CLR4_5_2bwzbwzlvl9ek1r.R.inc(15465);IsoTypeWriter.writeZeroTermUtf8String(byteBuffer, codecs);
        __CLR4_5_2bwzbwzlvl9ek1r.R.inc(15466);IsoTypeWriter.writeZeroTermUtf8String(byteBuffer, protection);
        __CLR4_5_2bwzbwzlvl9ek1r.R.inc(15467);IsoTypeWriter.writeZeroTermUtf8String(byteBuffer, languages);
        __CLR4_5_2bwzbwzlvl9ek1r.R.inc(15468);IsoTypeWriter.writeUInt8(byteBuffer, brandEntries.size());
        __CLR4_5_2bwzbwzlvl9ek1r.R.inc(15469);for (Map.Entry<String, String> brandEntry : brandEntries.entrySet()) {{
            __CLR4_5_2bwzbwzlvl9ek1r.R.inc(15470);IsoTypeWriter.writeZeroTermUtf8String(byteBuffer, brandEntry.getKey());
            __CLR4_5_2bwzbwzlvl9ek1r.R.inc(15471);IsoTypeWriter.writeZeroTermUtf8String(byteBuffer, brandEntry.getValue());
        }
        }__CLR4_5_2bwzbwzlvl9ek1r.R.inc(15472);IsoTypeWriter.writeUInt8(byteBuffer, idEntries.size());
        __CLR4_5_2bwzbwzlvl9ek1r.R.inc(15473);for (Map.Entry<String, String> idEntry : idEntries.entrySet()) {{
            __CLR4_5_2bwzbwzlvl9ek1r.R.inc(15474);IsoTypeWriter.writeZeroTermUtf8String(byteBuffer, idEntry.getKey());
            __CLR4_5_2bwzbwzlvl9ek1r.R.inc(15475);IsoTypeWriter.writeZeroTermUtf8String(byteBuffer, idEntry.getValue());

        }
    }}finally{__CLR4_5_2bwzbwzlvl9ek1r.R.flushNeeded();}}

    @Override
    protected void _parseDetails(ByteBuffer content) {try{__CLR4_5_2bwzbwzlvl9ek1r.R.inc(15476);
        __CLR4_5_2bwzbwzlvl9ek1r.R.inc(15477);parseVersionAndFlags(content);
        __CLR4_5_2bwzbwzlvl9ek1r.R.inc(15478);mimeSubtypeName = IsoTypeReader.readString(content);
        __CLR4_5_2bwzbwzlvl9ek1r.R.inc(15479);profileLevelIdc = IsoTypeReader.readString(content);
        __CLR4_5_2bwzbwzlvl9ek1r.R.inc(15480);codecs = IsoTypeReader.readString(content);
        __CLR4_5_2bwzbwzlvl9ek1r.R.inc(15481);protection = IsoTypeReader.readString(content);
        __CLR4_5_2bwzbwzlvl9ek1r.R.inc(15482);languages = IsoTypeReader.readString(content);
        __CLR4_5_2bwzbwzlvl9ek1r.R.inc(15483);int brandEntryCount = IsoTypeReader.readUInt8(content);
        __CLR4_5_2bwzbwzlvl9ek1r.R.inc(15484);while ((((brandEntryCount-- > 0)&&(__CLR4_5_2bwzbwzlvl9ek1r.R.iget(15485)!=0|true))||(__CLR4_5_2bwzbwzlvl9ek1r.R.iget(15486)==0&false))) {{
            __CLR4_5_2bwzbwzlvl9ek1r.R.inc(15487);brandEntries.put(IsoTypeReader.readString(content), IsoTypeReader.readString(content));
        }
        }__CLR4_5_2bwzbwzlvl9ek1r.R.inc(15488);int idEntryCount = IsoTypeReader.readUInt8(content);
        __CLR4_5_2bwzbwzlvl9ek1r.R.inc(15489);while ((((idEntryCount-- > 0)&&(__CLR4_5_2bwzbwzlvl9ek1r.R.iget(15490)!=0|true))||(__CLR4_5_2bwzbwzlvl9ek1r.R.iget(15491)==0&false))) {{
            __CLR4_5_2bwzbwzlvl9ek1r.R.inc(15492);idEntries.put(IsoTypeReader.readString(content), IsoTypeReader.readString(content));
        }
    }}finally{__CLR4_5_2bwzbwzlvl9ek1r.R.flushNeeded();}}

    public static class BrandEntry {
        public BrandEntry(String iso_brand, String version) {try{__CLR4_5_2bwzbwzlvl9ek1r.R.inc(15493);
            __CLR4_5_2bwzbwzlvl9ek1r.R.inc(15494);this.iso_brand = iso_brand;
            __CLR4_5_2bwzbwzlvl9ek1r.R.inc(15495);this.version = version;
        }finally{__CLR4_5_2bwzbwzlvl9ek1r.R.flushNeeded();}}

        String iso_brand;
        String version;

        @Override
        public boolean equals(Object o) {try{__CLR4_5_2bwzbwzlvl9ek1r.R.inc(15496);
            __CLR4_5_2bwzbwzlvl9ek1r.R.inc(15497);if ((((this == o)&&(__CLR4_5_2bwzbwzlvl9ek1r.R.iget(15498)!=0|true))||(__CLR4_5_2bwzbwzlvl9ek1r.R.iget(15499)==0&false))) {__CLR4_5_2bwzbwzlvl9ek1r.R.inc(15500);return true;
            }__CLR4_5_2bwzbwzlvl9ek1r.R.inc(15501);if ((((o == null || getClass() != o.getClass())&&(__CLR4_5_2bwzbwzlvl9ek1r.R.iget(15502)!=0|true))||(__CLR4_5_2bwzbwzlvl9ek1r.R.iget(15503)==0&false))) {__CLR4_5_2bwzbwzlvl9ek1r.R.inc(15504);return false;

            }__CLR4_5_2bwzbwzlvl9ek1r.R.inc(15505);BrandEntry that = (BrandEntry) o;

            __CLR4_5_2bwzbwzlvl9ek1r.R.inc(15506);if (((((((iso_brand != null )&&(__CLR4_5_2bwzbwzlvl9ek1r.R.iget(15507)!=0|true))||(__CLR4_5_2bwzbwzlvl9ek1r.R.iget(15508)==0&false))? !iso_brand.equals(that.iso_brand) : that.iso_brand != null)&&(__CLR4_5_2bwzbwzlvl9ek1r.R.iget(15509)!=0|true))||(__CLR4_5_2bwzbwzlvl9ek1r.R.iget(15510)==0&false))) {__CLR4_5_2bwzbwzlvl9ek1r.R.inc(15511);return false;
            }__CLR4_5_2bwzbwzlvl9ek1r.R.inc(15512);if (((((((version != null )&&(__CLR4_5_2bwzbwzlvl9ek1r.R.iget(15513)!=0|true))||(__CLR4_5_2bwzbwzlvl9ek1r.R.iget(15514)==0&false))? !version.equals(that.version) : that.version != null)&&(__CLR4_5_2bwzbwzlvl9ek1r.R.iget(15515)!=0|true))||(__CLR4_5_2bwzbwzlvl9ek1r.R.iget(15516)==0&false))) {__CLR4_5_2bwzbwzlvl9ek1r.R.inc(15517);return false;

            }__CLR4_5_2bwzbwzlvl9ek1r.R.inc(15518);return true;
        }finally{__CLR4_5_2bwzbwzlvl9ek1r.R.flushNeeded();}}

        @Override
        public int hashCode() {try{__CLR4_5_2bwzbwzlvl9ek1r.R.inc(15519);
            __CLR4_5_2bwzbwzlvl9ek1r.R.inc(15520);int result = (((iso_brand != null )&&(__CLR4_5_2bwzbwzlvl9ek1r.R.iget(15521)!=0|true))||(__CLR4_5_2bwzbwzlvl9ek1r.R.iget(15522)==0&false))? iso_brand.hashCode() : 0;
            __CLR4_5_2bwzbwzlvl9ek1r.R.inc(15523);result = 31 * result + ((((version != null )&&(__CLR4_5_2bwzbwzlvl9ek1r.R.iget(15524)!=0|true))||(__CLR4_5_2bwzbwzlvl9ek1r.R.iget(15525)==0&false))? version.hashCode() : 0);
            __CLR4_5_2bwzbwzlvl9ek1r.R.inc(15526);return result;
        }finally{__CLR4_5_2bwzbwzlvl9ek1r.R.flushNeeded();}}
    }

    public String getMimeSubtypeName() {try{__CLR4_5_2bwzbwzlvl9ek1r.R.inc(15527);
        __CLR4_5_2bwzbwzlvl9ek1r.R.inc(15528);return mimeSubtypeName;
    }finally{__CLR4_5_2bwzbwzlvl9ek1r.R.flushNeeded();}}

    public void setMimeSubtypeName(String mimeSubtypeName) {try{__CLR4_5_2bwzbwzlvl9ek1r.R.inc(15529);
        __CLR4_5_2bwzbwzlvl9ek1r.R.inc(15530);this.mimeSubtypeName = mimeSubtypeName;
    }finally{__CLR4_5_2bwzbwzlvl9ek1r.R.flushNeeded();}}

    public String getProfileLevelIdc() {try{__CLR4_5_2bwzbwzlvl9ek1r.R.inc(15531);
        __CLR4_5_2bwzbwzlvl9ek1r.R.inc(15532);return profileLevelIdc;
    }finally{__CLR4_5_2bwzbwzlvl9ek1r.R.flushNeeded();}}

    public void setProfileLevelIdc(String profileLevelIdc) {try{__CLR4_5_2bwzbwzlvl9ek1r.R.inc(15533);
        __CLR4_5_2bwzbwzlvl9ek1r.R.inc(15534);this.profileLevelIdc = profileLevelIdc;
    }finally{__CLR4_5_2bwzbwzlvl9ek1r.R.flushNeeded();}}

    public String getCodecs() {try{__CLR4_5_2bwzbwzlvl9ek1r.R.inc(15535);
        __CLR4_5_2bwzbwzlvl9ek1r.R.inc(15536);return codecs;
    }finally{__CLR4_5_2bwzbwzlvl9ek1r.R.flushNeeded();}}

    public void setCodecs(String codecs) {try{__CLR4_5_2bwzbwzlvl9ek1r.R.inc(15537);
        __CLR4_5_2bwzbwzlvl9ek1r.R.inc(15538);this.codecs = codecs;
    }finally{__CLR4_5_2bwzbwzlvl9ek1r.R.flushNeeded();}}

    public String getProtection() {try{__CLR4_5_2bwzbwzlvl9ek1r.R.inc(15539);
        __CLR4_5_2bwzbwzlvl9ek1r.R.inc(15540);return protection;
    }finally{__CLR4_5_2bwzbwzlvl9ek1r.R.flushNeeded();}}

    public void setProtection(String protection) {try{__CLR4_5_2bwzbwzlvl9ek1r.R.inc(15541);
        __CLR4_5_2bwzbwzlvl9ek1r.R.inc(15542);this.protection = protection;
    }finally{__CLR4_5_2bwzbwzlvl9ek1r.R.flushNeeded();}}

    public String getLanguages() {try{__CLR4_5_2bwzbwzlvl9ek1r.R.inc(15543);
        __CLR4_5_2bwzbwzlvl9ek1r.R.inc(15544);return languages;
    }finally{__CLR4_5_2bwzbwzlvl9ek1r.R.flushNeeded();}}

    public void setLanguages(String languages) {try{__CLR4_5_2bwzbwzlvl9ek1r.R.inc(15545);
        __CLR4_5_2bwzbwzlvl9ek1r.R.inc(15546);this.languages = languages;
    }finally{__CLR4_5_2bwzbwzlvl9ek1r.R.flushNeeded();}}

    public Map<String, String> getBrandEntries() {try{__CLR4_5_2bwzbwzlvl9ek1r.R.inc(15547);
        __CLR4_5_2bwzbwzlvl9ek1r.R.inc(15548);return brandEntries;
    }finally{__CLR4_5_2bwzbwzlvl9ek1r.R.flushNeeded();}}

    public void setBrandEntries(Map<String, String> brandEntries) {try{__CLR4_5_2bwzbwzlvl9ek1r.R.inc(15549);
        __CLR4_5_2bwzbwzlvl9ek1r.R.inc(15550);this.brandEntries = brandEntries;
    }finally{__CLR4_5_2bwzbwzlvl9ek1r.R.flushNeeded();}}

    public Map<String, String> getIdEntries() {try{__CLR4_5_2bwzbwzlvl9ek1r.R.inc(15551);
        __CLR4_5_2bwzbwzlvl9ek1r.R.inc(15552);return idEntries;
    }finally{__CLR4_5_2bwzbwzlvl9ek1r.R.flushNeeded();}}

    public void setIdEntries(Map<String, String> idEntries) {try{__CLR4_5_2bwzbwzlvl9ek1r.R.inc(15553);
        __CLR4_5_2bwzbwzlvl9ek1r.R.inc(15554);this.idEntries = idEntries;
    }finally{__CLR4_5_2bwzbwzlvl9ek1r.R.flushNeeded();}}
}
