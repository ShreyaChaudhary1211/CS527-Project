/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.googlecode.mp4parser.boxes.apple;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractBox;
import com.googlecode.mp4parser.annotations.DoNotParseDetail;

import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Locale;

/**
 * Created by sannies on 10/12/13.
 */
public abstract class AppleDataBox extends AbstractBox {public static class __CLR4_5_2b48b48lvluljuv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,14570,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    int dataType;
    int dataCountry;
    int dataLanguage;

    protected AppleDataBox(String type, int dataType) {
        super(type);__CLR4_5_2b48b48lvluljuv.R.inc(14409);try{__CLR4_5_2b48b48lvluljuv.R.inc(14408);
        __CLR4_5_2b48b48lvluljuv.R.inc(14410);this.dataType = dataType;
    }finally{__CLR4_5_2b48b48lvluljuv.R.flushNeeded();}}

    public String getLanguageString() {try{__CLR4_5_2b48b48lvluljuv.R.inc(14411);
        __CLR4_5_2b48b48lvluljuv.R.inc(14412);String lang = language.get("" + dataLanguage);
        __CLR4_5_2b48b48lvluljuv.R.inc(14413);if ((((lang == null)&&(__CLR4_5_2b48b48lvluljuv.R.iget(14414)!=0|true))||(__CLR4_5_2b48b48lvluljuv.R.iget(14415)==0&false))) {{
            __CLR4_5_2b48b48lvluljuv.R.inc(14416);ByteBuffer b = ByteBuffer.wrap(new byte[2]);
            __CLR4_5_2b48b48lvluljuv.R.inc(14417);IsoTypeWriter.writeUInt16(b, dataLanguage);
            __CLR4_5_2b48b48lvluljuv.R.inc(14418);b.reset();
            __CLR4_5_2b48b48lvluljuv.R.inc(14419);return new Locale(IsoTypeReader.readIso639(b)).getDisplayLanguage();
        } }else {{
            __CLR4_5_2b48b48lvluljuv.R.inc(14420);return lang;
        }
    }}finally{__CLR4_5_2b48b48lvluljuv.R.flushNeeded();}}

    @Override
    protected long getContentSize() {try{__CLR4_5_2b48b48lvluljuv.R.inc(14421);
        __CLR4_5_2b48b48lvluljuv.R.inc(14422);return getDataLength() + 16;
        // actualdatalength + dataheader
    }finally{__CLR4_5_2b48b48lvluljuv.R.flushNeeded();}}

    public int getDataType() {try{__CLR4_5_2b48b48lvluljuv.R.inc(14423);
        __CLR4_5_2b48b48lvluljuv.R.inc(14424);return dataType;
    }finally{__CLR4_5_2b48b48lvluljuv.R.flushNeeded();}}

    public int getDataCountry() {try{__CLR4_5_2b48b48lvluljuv.R.inc(14425);
        __CLR4_5_2b48b48lvluljuv.R.inc(14426);return dataCountry;
    }finally{__CLR4_5_2b48b48lvluljuv.R.flushNeeded();}}

    public void setDataCountry(int dataCountry) {try{__CLR4_5_2b48b48lvluljuv.R.inc(14427);
        __CLR4_5_2b48b48lvluljuv.R.inc(14428);this.dataCountry = dataCountry;
    }finally{__CLR4_5_2b48b48lvluljuv.R.flushNeeded();}}

    public int getDataLanguage() {try{__CLR4_5_2b48b48lvluljuv.R.inc(14429);
        __CLR4_5_2b48b48lvluljuv.R.inc(14430);return dataLanguage;
    }finally{__CLR4_5_2b48b48lvluljuv.R.flushNeeded();}}

    public void setDataLanguage(int dataLanguage) {try{__CLR4_5_2b48b48lvluljuv.R.inc(14431);
        __CLR4_5_2b48b48lvluljuv.R.inc(14432);this.dataLanguage = dataLanguage;
    }finally{__CLR4_5_2b48b48lvluljuv.R.flushNeeded();}}

    @DoNotParseDetail
    protected ByteBuffer parseDataLength4ccTypeCountryLanguageAndReturnRest(ByteBuffer content) {try{__CLR4_5_2b48b48lvluljuv.R.inc(14433);
        __CLR4_5_2b48b48lvluljuv.R.inc(14434);int dataLength = content.getInt();
        __CLR4_5_2b48b48lvluljuv.R.inc(14435);int data4cc = content.getInt(); // 'data'
        __CLR4_5_2b48b48lvluljuv.R.inc(14436);dataType = content.getInt();
        __CLR4_5_2b48b48lvluljuv.R.inc(14437);dataCountry = content.getShort();
        __CLR4_5_2b48b48lvluljuv.R.inc(14438);if ((((dataCountry < 0)&&(__CLR4_5_2b48b48lvluljuv.R.iget(14439)!=0|true))||(__CLR4_5_2b48b48lvluljuv.R.iget(14440)==0&false))) {{
            __CLR4_5_2b48b48lvluljuv.R.inc(14441);dataCountry += (1 << 16);
        }
        }__CLR4_5_2b48b48lvluljuv.R.inc(14442);dataLanguage = content.getShort();
        __CLR4_5_2b48b48lvluljuv.R.inc(14443);if ((((dataLanguage < 0)&&(__CLR4_5_2b48b48lvluljuv.R.iget(14444)!=0|true))||(__CLR4_5_2b48b48lvluljuv.R.iget(14445)==0&false))) {{
            __CLR4_5_2b48b48lvluljuv.R.inc(14446);dataLanguage += (1 << 16);
        }
        }__CLR4_5_2b48b48lvluljuv.R.inc(14447);ByteBuffer data = (ByteBuffer) content.duplicate().slice().limit(dataLength - 16);
        __CLR4_5_2b48b48lvluljuv.R.inc(14448);content.position(dataLength - 16 + content.position());
        __CLR4_5_2b48b48lvluljuv.R.inc(14449);return data;
    }finally{__CLR4_5_2b48b48lvluljuv.R.flushNeeded();}}


    @Override
    protected void _parseDetails(ByteBuffer content) {try{__CLR4_5_2b48b48lvluljuv.R.inc(14450);
        __CLR4_5_2b48b48lvluljuv.R.inc(14451);ByteBuffer data = parseDataLength4ccTypeCountryLanguageAndReturnRest(content);
        __CLR4_5_2b48b48lvluljuv.R.inc(14452);parseData(data);
    }finally{__CLR4_5_2b48b48lvluljuv.R.flushNeeded();}}

    protected void getContent(ByteBuffer byteBuffer) {try{__CLR4_5_2b48b48lvluljuv.R.inc(14453);
        __CLR4_5_2b48b48lvluljuv.R.inc(14454);writeDataLength4ccTypeCountryLanguage(byteBuffer);
        __CLR4_5_2b48b48lvluljuv.R.inc(14455);byteBuffer.put(writeData());
    }finally{__CLR4_5_2b48b48lvluljuv.R.flushNeeded();}}

    protected abstract byte[] writeData();

    protected abstract void parseData(ByteBuffer data);

    protected abstract int getDataLength();

    @DoNotParseDetail
    protected void writeDataLength4ccTypeCountryLanguage(ByteBuffer content) {try{__CLR4_5_2b48b48lvluljuv.R.inc(14456);
        __CLR4_5_2b48b48lvluljuv.R.inc(14457);content.putInt(getDataLength() + 16);
        __CLR4_5_2b48b48lvluljuv.R.inc(14458);content.put("data".getBytes());
        __CLR4_5_2b48b48lvluljuv.R.inc(14459);content.putInt(dataType);
        __CLR4_5_2b48b48lvluljuv.R.inc(14460);IsoTypeWriter.writeUInt16(content, dataCountry);
        __CLR4_5_2b48b48lvluljuv.R.inc(14461);IsoTypeWriter.writeUInt16(content, dataLanguage);
    }finally{__CLR4_5_2b48b48lvluljuv.R.flushNeeded();}}

    private static HashMap<String, String> language = new HashMap<String, String>();

    static {try{__CLR4_5_2b48b48lvluljuv.R.inc(14462);
        __CLR4_5_2b48b48lvluljuv.R.inc(14463);language.put("0", "English");
        __CLR4_5_2b48b48lvluljuv.R.inc(14464);language.put("1", "French");
        __CLR4_5_2b48b48lvluljuv.R.inc(14465);language.put("2", "German");
        __CLR4_5_2b48b48lvluljuv.R.inc(14466);language.put("3", "Italian");
        __CLR4_5_2b48b48lvluljuv.R.inc(14467);language.put("4", "Dutch");
        __CLR4_5_2b48b48lvluljuv.R.inc(14468);language.put("5", "Swedish");
        __CLR4_5_2b48b48lvluljuv.R.inc(14469);language.put("6", "Spanish");
        __CLR4_5_2b48b48lvluljuv.R.inc(14470);language.put("7", "Danish");
        __CLR4_5_2b48b48lvluljuv.R.inc(14471);language.put("8", "Portuguese");
        __CLR4_5_2b48b48lvluljuv.R.inc(14472);language.put("9", "Norwegian");
        __CLR4_5_2b48b48lvluljuv.R.inc(14473);language.put("10", "Hebrew");
        __CLR4_5_2b48b48lvluljuv.R.inc(14474);language.put("11", "Japanese");
        __CLR4_5_2b48b48lvluljuv.R.inc(14475);language.put("12", "Arabic");
        __CLR4_5_2b48b48lvluljuv.R.inc(14476);language.put("13", "Finnish");
        __CLR4_5_2b48b48lvluljuv.R.inc(14477);language.put("14", "Greek");
        __CLR4_5_2b48b48lvluljuv.R.inc(14478);language.put("15", "Icelandic");
        __CLR4_5_2b48b48lvluljuv.R.inc(14479);language.put("16", "Maltese");
        __CLR4_5_2b48b48lvluljuv.R.inc(14480);language.put("17", "Turkish");
        __CLR4_5_2b48b48lvluljuv.R.inc(14481);language.put("18", "Croatian");
        __CLR4_5_2b48b48lvluljuv.R.inc(14482);language.put("19", "Traditional_Chinese");
        __CLR4_5_2b48b48lvluljuv.R.inc(14483);language.put("20", "Urdu");
        __CLR4_5_2b48b48lvluljuv.R.inc(14484);language.put("21", "Hindi");
        __CLR4_5_2b48b48lvluljuv.R.inc(14485);language.put("22", "Thai");
        __CLR4_5_2b48b48lvluljuv.R.inc(14486);language.put("23", "Korean");
        __CLR4_5_2b48b48lvluljuv.R.inc(14487);language.put("24", "Lithuanian");
        __CLR4_5_2b48b48lvluljuv.R.inc(14488);language.put("25", "Polish");
        __CLR4_5_2b48b48lvluljuv.R.inc(14489);language.put("26", "Hungarian");
        __CLR4_5_2b48b48lvluljuv.R.inc(14490);language.put("27", "Estonian");
        __CLR4_5_2b48b48lvluljuv.R.inc(14491);language.put("28", "Lettish");
        __CLR4_5_2b48b48lvluljuv.R.inc(14492);language.put("29", "Sami");
        __CLR4_5_2b48b48lvluljuv.R.inc(14493);language.put("30", "Faroese");
        __CLR4_5_2b48b48lvluljuv.R.inc(14494);language.put("31", "Farsi");
        __CLR4_5_2b48b48lvluljuv.R.inc(14495);language.put("32", "Russian");
        __CLR4_5_2b48b48lvluljuv.R.inc(14496);language.put("33", "Simplified_Chinese");
        __CLR4_5_2b48b48lvluljuv.R.inc(14497);language.put("34", "Flemish");
        __CLR4_5_2b48b48lvluljuv.R.inc(14498);language.put("35", "Irish");
        __CLR4_5_2b48b48lvluljuv.R.inc(14499);language.put("36", "Albanian");
        __CLR4_5_2b48b48lvluljuv.R.inc(14500);language.put("37", "Romanian");
        __CLR4_5_2b48b48lvluljuv.R.inc(14501);language.put("38", "Czech");
        __CLR4_5_2b48b48lvluljuv.R.inc(14502);language.put("39", "Slovak");
        __CLR4_5_2b48b48lvluljuv.R.inc(14503);language.put("40", "Slovenian");
        __CLR4_5_2b48b48lvluljuv.R.inc(14504);language.put("41", "Yiddish");
        __CLR4_5_2b48b48lvluljuv.R.inc(14505);language.put("42", "Serbian");
        __CLR4_5_2b48b48lvluljuv.R.inc(14506);language.put("43", "Macedonian");
        __CLR4_5_2b48b48lvluljuv.R.inc(14507);language.put("44", "Bulgarian");
        __CLR4_5_2b48b48lvluljuv.R.inc(14508);language.put("45", "Ukrainian");
        __CLR4_5_2b48b48lvluljuv.R.inc(14509);language.put("46", "Belarusian");
        __CLR4_5_2b48b48lvluljuv.R.inc(14510);language.put("47", "Uzbek");
        __CLR4_5_2b48b48lvluljuv.R.inc(14511);language.put("48", "Kazakh");
        __CLR4_5_2b48b48lvluljuv.R.inc(14512);language.put("49", "Azerbaijani");
        __CLR4_5_2b48b48lvluljuv.R.inc(14513);language.put("50", "AzerbaijanAr");
        __CLR4_5_2b48b48lvluljuv.R.inc(14514);language.put("51", "Armenian");
        __CLR4_5_2b48b48lvluljuv.R.inc(14515);language.put("52", "Georgian");
        __CLR4_5_2b48b48lvluljuv.R.inc(14516);language.put("53", "Moldavian");
        __CLR4_5_2b48b48lvluljuv.R.inc(14517);language.put("54", "Kirghiz");
        __CLR4_5_2b48b48lvluljuv.R.inc(14518);language.put("55", "Tajiki");
        __CLR4_5_2b48b48lvluljuv.R.inc(14519);language.put("56", "Turkmen");
        __CLR4_5_2b48b48lvluljuv.R.inc(14520);language.put("57", "Mongolian");
        __CLR4_5_2b48b48lvluljuv.R.inc(14521);language.put("58", "MongolianCyr");
        __CLR4_5_2b48b48lvluljuv.R.inc(14522);language.put("59", "Pashto");
        __CLR4_5_2b48b48lvluljuv.R.inc(14523);language.put("60", "Kurdish");
        __CLR4_5_2b48b48lvluljuv.R.inc(14524);language.put("61", "Kashmiri");
        __CLR4_5_2b48b48lvluljuv.R.inc(14525);language.put("62", "Sindhi");
        __CLR4_5_2b48b48lvluljuv.R.inc(14526);language.put("63", "Tibetan");
        __CLR4_5_2b48b48lvluljuv.R.inc(14527);language.put("64", "Nepali");
        __CLR4_5_2b48b48lvluljuv.R.inc(14528);language.put("65", "Sanskrit");
        __CLR4_5_2b48b48lvluljuv.R.inc(14529);language.put("66", "Marathi");
        __CLR4_5_2b48b48lvluljuv.R.inc(14530);language.put("67", "Bengali");
        __CLR4_5_2b48b48lvluljuv.R.inc(14531);language.put("68", "Assamese");
        __CLR4_5_2b48b48lvluljuv.R.inc(14532);language.put("69", "Gujarati");
        __CLR4_5_2b48b48lvluljuv.R.inc(14533);language.put("70", "Punjabi");
        __CLR4_5_2b48b48lvluljuv.R.inc(14534);language.put("71", "Oriya");
        __CLR4_5_2b48b48lvluljuv.R.inc(14535);language.put("72", "Malayalam");
        __CLR4_5_2b48b48lvluljuv.R.inc(14536);language.put("73", "Kannada");
        __CLR4_5_2b48b48lvluljuv.R.inc(14537);language.put("74", "Tamil");
        __CLR4_5_2b48b48lvluljuv.R.inc(14538);language.put("75", "Telugu");
        __CLR4_5_2b48b48lvluljuv.R.inc(14539);language.put("76", "Sinhala");
        __CLR4_5_2b48b48lvluljuv.R.inc(14540);language.put("77", "Burmese");
        __CLR4_5_2b48b48lvluljuv.R.inc(14541);language.put("78", "Khmer");
        __CLR4_5_2b48b48lvluljuv.R.inc(14542);language.put("79", "Lao");
        __CLR4_5_2b48b48lvluljuv.R.inc(14543);language.put("80", "Vietnamese");
        __CLR4_5_2b48b48lvluljuv.R.inc(14544);language.put("81", "Indonesian");
        __CLR4_5_2b48b48lvluljuv.R.inc(14545);language.put("82", "Tagalog");
        __CLR4_5_2b48b48lvluljuv.R.inc(14546);language.put("83", "MalayRoman");
        __CLR4_5_2b48b48lvluljuv.R.inc(14547);language.put("84", "MalayArabic");
        __CLR4_5_2b48b48lvluljuv.R.inc(14548);language.put("85", "Amharic");
        __CLR4_5_2b48b48lvluljuv.R.inc(14549);language.put("87", "Galla");
        __CLR4_5_2b48b48lvluljuv.R.inc(14550);language.put("87", "Oromo");
        __CLR4_5_2b48b48lvluljuv.R.inc(14551);language.put("88", "Somali");
        __CLR4_5_2b48b48lvluljuv.R.inc(14552);language.put("89", "Swahili");
        __CLR4_5_2b48b48lvluljuv.R.inc(14553);language.put("90", "Kinyarwanda");
        __CLR4_5_2b48b48lvluljuv.R.inc(14554);language.put("91", "Rundi");
        __CLR4_5_2b48b48lvluljuv.R.inc(14555);language.put("92", "Nyanja");
        __CLR4_5_2b48b48lvluljuv.R.inc(14556);language.put("93", "Malagasy");
        __CLR4_5_2b48b48lvluljuv.R.inc(14557);language.put("94", "Esperanto");
        __CLR4_5_2b48b48lvluljuv.R.inc(14558);language.put("128", "Welsh");
        __CLR4_5_2b48b48lvluljuv.R.inc(14559);language.put("129", "Basque");
        __CLR4_5_2b48b48lvluljuv.R.inc(14560);language.put("130", "Catalan");
        __CLR4_5_2b48b48lvluljuv.R.inc(14561);language.put("131", "Latin");
        __CLR4_5_2b48b48lvluljuv.R.inc(14562);language.put("132", "Quechua");
        __CLR4_5_2b48b48lvluljuv.R.inc(14563);language.put("133", "Guarani");
        __CLR4_5_2b48b48lvluljuv.R.inc(14564);language.put("134", "Aymara");
        __CLR4_5_2b48b48lvluljuv.R.inc(14565);language.put("135", "Tatar");
        __CLR4_5_2b48b48lvluljuv.R.inc(14566);language.put("136", "Uighur");
        __CLR4_5_2b48b48lvluljuv.R.inc(14567);language.put("137", "Dzongkha");
        __CLR4_5_2b48b48lvluljuv.R.inc(14568);language.put("138", "JavaneseRom");
        __CLR4_5_2b48b48lvluljuv.R.inc(14569);language.put("32767", "Unspecified");
    }finally{__CLR4_5_2b48b48lvluljuv.R.flushNeeded();}}
}
