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
 * Meta information in a 'udta' box about a track.
 * Defined in 3GPP 26.244.
 *
 * @see com.coremedia.iso.boxes.UserDataBox
 */
public class AlbumBox extends AbstractFullBox {public static class __CLR4_5_2e4e4lvlulay7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,554,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static final String TYPE = "albm";

    private String language;
    private String albumTitle;
    private int trackNumber;

    public AlbumBox() {
        super(TYPE);__CLR4_5_2e4e4lvlulay7.R.inc(509);try{__CLR4_5_2e4e4lvlulay7.R.inc(508);
    }finally{__CLR4_5_2e4e4lvlulay7.R.flushNeeded();}}

    /**
     * Declares the language code for the {@link #getAlbumTitle()} return value. See ISO 639-2/T for the set of three
     * character codes.Each character is packed as the difference between its ASCII value and 0x60. The code is
     * confined to being three lower-case letters, so these values are strictly positive.
     *
     * @return the language code
     */
    public String getLanguage() {try{__CLR4_5_2e4e4lvlulay7.R.inc(510);
        __CLR4_5_2e4e4lvlulay7.R.inc(511);return language;
    }finally{__CLR4_5_2e4e4lvlulay7.R.flushNeeded();}}

    public String getAlbumTitle() {try{__CLR4_5_2e4e4lvlulay7.R.inc(512);
        __CLR4_5_2e4e4lvlulay7.R.inc(513);return albumTitle;
    }finally{__CLR4_5_2e4e4lvlulay7.R.flushNeeded();}}

    public int getTrackNumber() {try{__CLR4_5_2e4e4lvlulay7.R.inc(514);
        __CLR4_5_2e4e4lvlulay7.R.inc(515);return trackNumber;
    }finally{__CLR4_5_2e4e4lvlulay7.R.flushNeeded();}}

    public void setLanguage(String language) {try{__CLR4_5_2e4e4lvlulay7.R.inc(516);
        __CLR4_5_2e4e4lvlulay7.R.inc(517);this.language = language;
    }finally{__CLR4_5_2e4e4lvlulay7.R.flushNeeded();}}

    public void setAlbumTitle(String albumTitle) {try{__CLR4_5_2e4e4lvlulay7.R.inc(518);
        __CLR4_5_2e4e4lvlulay7.R.inc(519);this.albumTitle = albumTitle;
    }finally{__CLR4_5_2e4e4lvlulay7.R.flushNeeded();}}

    public void setTrackNumber(int trackNumber) {try{__CLR4_5_2e4e4lvlulay7.R.inc(520);
        __CLR4_5_2e4e4lvlulay7.R.inc(521);this.trackNumber = trackNumber;
    }finally{__CLR4_5_2e4e4lvlulay7.R.flushNeeded();}}

    protected long getContentSize() {try{__CLR4_5_2e4e4lvlulay7.R.inc(522);
        __CLR4_5_2e4e4lvlulay7.R.inc(523);return 6 + Utf8.utf8StringLengthInBytes(albumTitle) + 1 + ((((trackNumber == -1 )&&(__CLR4_5_2e4e4lvlulay7.R.iget(524)!=0|true))||(__CLR4_5_2e4e4lvlulay7.R.iget(525)==0&false))? 0 : 1);
    }finally{__CLR4_5_2e4e4lvlulay7.R.flushNeeded();}}

    @Override
    public void _parseDetails(ByteBuffer content) {try{__CLR4_5_2e4e4lvlulay7.R.inc(526);
        __CLR4_5_2e4e4lvlulay7.R.inc(527);parseVersionAndFlags(content);
        __CLR4_5_2e4e4lvlulay7.R.inc(528);language = IsoTypeReader.readIso639(content);
        __CLR4_5_2e4e4lvlulay7.R.inc(529);albumTitle = IsoTypeReader.readString(content);

        __CLR4_5_2e4e4lvlulay7.R.inc(530);if ((((content.remaining() > 0)&&(__CLR4_5_2e4e4lvlulay7.R.iget(531)!=0|true))||(__CLR4_5_2e4e4lvlulay7.R.iget(532)==0&false))) {{
            __CLR4_5_2e4e4lvlulay7.R.inc(533);trackNumber = IsoTypeReader.readUInt8(content);
        } }else {{
            __CLR4_5_2e4e4lvlulay7.R.inc(534);trackNumber = -1;
        }
    }}finally{__CLR4_5_2e4e4lvlulay7.R.flushNeeded();}}

    @Override
    protected void getContent(ByteBuffer byteBuffer) {try{__CLR4_5_2e4e4lvlulay7.R.inc(535);
        __CLR4_5_2e4e4lvlulay7.R.inc(536);writeVersionAndFlags(byteBuffer);
        __CLR4_5_2e4e4lvlulay7.R.inc(537);IsoTypeWriter.writeIso639(byteBuffer, language);
        __CLR4_5_2e4e4lvlulay7.R.inc(538);byteBuffer.put(Utf8.convert(albumTitle));
        __CLR4_5_2e4e4lvlulay7.R.inc(539);byteBuffer.put((byte) 0);
        __CLR4_5_2e4e4lvlulay7.R.inc(540);if ((((trackNumber != -1)&&(__CLR4_5_2e4e4lvlulay7.R.iget(541)!=0|true))||(__CLR4_5_2e4e4lvlulay7.R.iget(542)==0&false))) {{
            __CLR4_5_2e4e4lvlulay7.R.inc(543);IsoTypeWriter.writeUInt8(byteBuffer, trackNumber);
        }
    }}finally{__CLR4_5_2e4e4lvlulay7.R.flushNeeded();}}

    public String toString() {try{__CLR4_5_2e4e4lvlulay7.R.inc(544);
        __CLR4_5_2e4e4lvlulay7.R.inc(545);StringBuilder buffer = new StringBuilder();
        __CLR4_5_2e4e4lvlulay7.R.inc(546);buffer.append("AlbumBox[language=").append(getLanguage()).append(";");
        __CLR4_5_2e4e4lvlulay7.R.inc(547);buffer.append("albumTitle=").append(getAlbumTitle());
        __CLR4_5_2e4e4lvlulay7.R.inc(548);if ((((trackNumber >= 0)&&(__CLR4_5_2e4e4lvlulay7.R.iget(549)!=0|true))||(__CLR4_5_2e4e4lvlulay7.R.iget(550)==0&false))) {{
            __CLR4_5_2e4e4lvlulay7.R.inc(551);buffer.append(";trackNumber=").append(getTrackNumber());
        }
        }__CLR4_5_2e4e4lvlulay7.R.inc(552);buffer.append("]");
        __CLR4_5_2e4e4lvlulay7.R.inc(553);return buffer.toString();
    }finally{__CLR4_5_2e4e4lvlulay7.R.flushNeeded();}}
}
