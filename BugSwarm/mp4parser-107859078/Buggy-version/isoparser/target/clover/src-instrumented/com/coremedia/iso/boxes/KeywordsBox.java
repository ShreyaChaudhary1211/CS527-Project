/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*  
 * Copyright 2008 CoreMedia AG, Hamburg
 *
 * Licensed under the Apache License, Version 2.0 (the License); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at 
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0 
 * 
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the License is distributed on an AS IS BASIS, 
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and 
 * limitations under the License. 
 */

package com.coremedia.iso.boxes;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.Utf8;
import com.googlecode.mp4parser.AbstractFullBox;

import java.nio.ByteBuffer;

/**
 * <h1>4cc = "{@value #TYPE}"</h1>
 * List of keywords according to 3GPP 26.244.
 */
public class KeywordsBox extends AbstractFullBox {public static class __CLR4_5_214i14ilvl9eewh{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,1499,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static final String TYPE = "kywd";

    private String language;
    private String[] keywords;

    public KeywordsBox() {
        super(TYPE);__CLR4_5_214i14ilvl9eewh.R.inc(1459);try{__CLR4_5_214i14ilvl9eewh.R.inc(1458);
    }finally{__CLR4_5_214i14ilvl9eewh.R.flushNeeded();}}

    public String getLanguage() {try{__CLR4_5_214i14ilvl9eewh.R.inc(1460);
        __CLR4_5_214i14ilvl9eewh.R.inc(1461);return language;
    }finally{__CLR4_5_214i14ilvl9eewh.R.flushNeeded();}}

    public String[] getKeywords() {try{__CLR4_5_214i14ilvl9eewh.R.inc(1462);
        __CLR4_5_214i14ilvl9eewh.R.inc(1463);return keywords;
    }finally{__CLR4_5_214i14ilvl9eewh.R.flushNeeded();}}

    public void setLanguage(String language) {try{__CLR4_5_214i14ilvl9eewh.R.inc(1464);
        __CLR4_5_214i14ilvl9eewh.R.inc(1465);this.language = language;
    }finally{__CLR4_5_214i14ilvl9eewh.R.flushNeeded();}}

    public void setKeywords(String[] keywords) {try{__CLR4_5_214i14ilvl9eewh.R.inc(1466);
        __CLR4_5_214i14ilvl9eewh.R.inc(1467);this.keywords = keywords;
    }finally{__CLR4_5_214i14ilvl9eewh.R.flushNeeded();}}

    protected long getContentSize() {try{__CLR4_5_214i14ilvl9eewh.R.inc(1468);
        __CLR4_5_214i14ilvl9eewh.R.inc(1469);long contentSize = 7;
        __CLR4_5_214i14ilvl9eewh.R.inc(1470);for (String keyword : keywords) {{
            __CLR4_5_214i14ilvl9eewh.R.inc(1471);contentSize += 1 + Utf8.utf8StringLengthInBytes(keyword) + 1;
        }
        }__CLR4_5_214i14ilvl9eewh.R.inc(1472);return contentSize;
    }finally{__CLR4_5_214i14ilvl9eewh.R.flushNeeded();}}

    @Override
    public void _parseDetails(ByteBuffer content) {try{__CLR4_5_214i14ilvl9eewh.R.inc(1473);
        __CLR4_5_214i14ilvl9eewh.R.inc(1474);parseVersionAndFlags(content);
        __CLR4_5_214i14ilvl9eewh.R.inc(1475);language = IsoTypeReader.readIso639(content);
        __CLR4_5_214i14ilvl9eewh.R.inc(1476);int keywordCount = IsoTypeReader.readUInt8(content);
        __CLR4_5_214i14ilvl9eewh.R.inc(1477);keywords = new String[keywordCount];
        __CLR4_5_214i14ilvl9eewh.R.inc(1478);for (int i = 0; (((i < keywordCount)&&(__CLR4_5_214i14ilvl9eewh.R.iget(1479)!=0|true))||(__CLR4_5_214i14ilvl9eewh.R.iget(1480)==0&false)); i++) {{
            __CLR4_5_214i14ilvl9eewh.R.inc(1481);IsoTypeReader.readUInt8(content);
            __CLR4_5_214i14ilvl9eewh.R.inc(1482);keywords[i] = IsoTypeReader.readString(content);
        }
    }}finally{__CLR4_5_214i14ilvl9eewh.R.flushNeeded();}}

    @Override
    protected void getContent(ByteBuffer byteBuffer) {try{__CLR4_5_214i14ilvl9eewh.R.inc(1483);
        __CLR4_5_214i14ilvl9eewh.R.inc(1484);writeVersionAndFlags(byteBuffer);
        __CLR4_5_214i14ilvl9eewh.R.inc(1485);IsoTypeWriter.writeIso639(byteBuffer, language);
        __CLR4_5_214i14ilvl9eewh.R.inc(1486);IsoTypeWriter.writeUInt8(byteBuffer, keywords.length);
        __CLR4_5_214i14ilvl9eewh.R.inc(1487);for (String keyword : keywords) {{
            __CLR4_5_214i14ilvl9eewh.R.inc(1488);IsoTypeWriter.writeUInt8(byteBuffer, Utf8.utf8StringLengthInBytes(keyword) + 1);
            __CLR4_5_214i14ilvl9eewh.R.inc(1489);byteBuffer.put(Utf8.convert(keyword));
        }
    }}finally{__CLR4_5_214i14ilvl9eewh.R.flushNeeded();}}

    public String toString() {try{__CLR4_5_214i14ilvl9eewh.R.inc(1490);
        __CLR4_5_214i14ilvl9eewh.R.inc(1491);StringBuffer buffer = new StringBuffer();
        __CLR4_5_214i14ilvl9eewh.R.inc(1492);buffer.append("KeywordsBox[language=").append(getLanguage());
        __CLR4_5_214i14ilvl9eewh.R.inc(1493);for (int i = 0; (((i < keywords.length)&&(__CLR4_5_214i14ilvl9eewh.R.iget(1494)!=0|true))||(__CLR4_5_214i14ilvl9eewh.R.iget(1495)==0&false)); i++) {{
            __CLR4_5_214i14ilvl9eewh.R.inc(1496);buffer.append(";keyword").append(i).append("=").append(keywords[i]);
        }
        }__CLR4_5_214i14ilvl9eewh.R.inc(1497);buffer.append("]");
        __CLR4_5_214i14ilvl9eewh.R.inc(1498);return buffer.toString();
    }finally{__CLR4_5_214i14ilvl9eewh.R.flushNeeded();}}
}
