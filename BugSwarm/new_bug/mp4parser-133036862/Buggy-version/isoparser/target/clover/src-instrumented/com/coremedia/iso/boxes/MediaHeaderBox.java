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
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.util.DateHelper;
import com.googlecode.mp4parser.util.Logger;

import java.nio.ByteBuffer;
import java.util.Date;

/**
 * <h1>4cc = "{@value #TYPE}"</h1>
 * This box defines overall information which is media-independent, and relevant to the entire presentation
 * considered as a whole.
 */
public class MediaHeaderBox extends AbstractFullBox {public static class __CLR4_5_216a16alvlulbiz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,1602,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static Logger LOG = Logger.getLogger(MediaHeaderBox.class);
    public static final String TYPE = "mdhd";


    private Date creationTime = new Date();
    private Date modificationTime = new Date();
    private long timescale;
    private long duration;
    private String language = "eng";

    public MediaHeaderBox() {
        super(TYPE);__CLR4_5_216a16alvlulbiz.R.inc(1523);try{__CLR4_5_216a16alvlulbiz.R.inc(1522);
    }finally{__CLR4_5_216a16alvlulbiz.R.flushNeeded();}}

    public Date getCreationTime() {try{__CLR4_5_216a16alvlulbiz.R.inc(1524);
        __CLR4_5_216a16alvlulbiz.R.inc(1525);return creationTime;
    }finally{__CLR4_5_216a16alvlulbiz.R.flushNeeded();}}

    public Date getModificationTime() {try{__CLR4_5_216a16alvlulbiz.R.inc(1526);
        __CLR4_5_216a16alvlulbiz.R.inc(1527);return modificationTime;
    }finally{__CLR4_5_216a16alvlulbiz.R.flushNeeded();}}

    public long getTimescale() {try{__CLR4_5_216a16alvlulbiz.R.inc(1528);
        __CLR4_5_216a16alvlulbiz.R.inc(1529);return timescale;
    }finally{__CLR4_5_216a16alvlulbiz.R.flushNeeded();}}

    public long getDuration() {try{__CLR4_5_216a16alvlulbiz.R.inc(1530);
        __CLR4_5_216a16alvlulbiz.R.inc(1531);return duration;
    }finally{__CLR4_5_216a16alvlulbiz.R.flushNeeded();}}

    public String getLanguage() {try{__CLR4_5_216a16alvlulbiz.R.inc(1532);
        __CLR4_5_216a16alvlulbiz.R.inc(1533);return language;
    }finally{__CLR4_5_216a16alvlulbiz.R.flushNeeded();}}

    protected long getContentSize() {try{__CLR4_5_216a16alvlulbiz.R.inc(1534);
        __CLR4_5_216a16alvlulbiz.R.inc(1535);long contentSize = 4;
        __CLR4_5_216a16alvlulbiz.R.inc(1536);if ((((getVersion() == 1)&&(__CLR4_5_216a16alvlulbiz.R.iget(1537)!=0|true))||(__CLR4_5_216a16alvlulbiz.R.iget(1538)==0&false))) {{
            __CLR4_5_216a16alvlulbiz.R.inc(1539);contentSize += 8 + 8 + 4 + 8;
        } }else {{
            __CLR4_5_216a16alvlulbiz.R.inc(1540);contentSize += 4 + 4 + 4 + 4;
        }
        }__CLR4_5_216a16alvlulbiz.R.inc(1541);contentSize += 2;
        __CLR4_5_216a16alvlulbiz.R.inc(1542);contentSize += 2;
        __CLR4_5_216a16alvlulbiz.R.inc(1543);return contentSize;

    }finally{__CLR4_5_216a16alvlulbiz.R.flushNeeded();}}

    public void setCreationTime(Date creationTime) {try{__CLR4_5_216a16alvlulbiz.R.inc(1544);
        __CLR4_5_216a16alvlulbiz.R.inc(1545);this.creationTime = creationTime;
    }finally{__CLR4_5_216a16alvlulbiz.R.flushNeeded();}}

    public void setModificationTime(Date modificationTime) {try{__CLR4_5_216a16alvlulbiz.R.inc(1546);
        __CLR4_5_216a16alvlulbiz.R.inc(1547);this.modificationTime = modificationTime;
    }finally{__CLR4_5_216a16alvlulbiz.R.flushNeeded();}}

    public void setTimescale(long timescale) {try{__CLR4_5_216a16alvlulbiz.R.inc(1548);
        __CLR4_5_216a16alvlulbiz.R.inc(1549);this.timescale = timescale;
    }finally{__CLR4_5_216a16alvlulbiz.R.flushNeeded();}}

    public void setDuration(long duration) {try{__CLR4_5_216a16alvlulbiz.R.inc(1550);
        __CLR4_5_216a16alvlulbiz.R.inc(1551);this.duration = duration;
    }finally{__CLR4_5_216a16alvlulbiz.R.flushNeeded();}}

    public void setLanguage(String language) {try{__CLR4_5_216a16alvlulbiz.R.inc(1552);
        __CLR4_5_216a16alvlulbiz.R.inc(1553);this.language = language;
    }finally{__CLR4_5_216a16alvlulbiz.R.flushNeeded();}}

    @Override
    public void _parseDetails(ByteBuffer content) {try{__CLR4_5_216a16alvlulbiz.R.inc(1554);
        __CLR4_5_216a16alvlulbiz.R.inc(1555);parseVersionAndFlags(content);
        __CLR4_5_216a16alvlulbiz.R.inc(1556);if ((((getVersion() == 1)&&(__CLR4_5_216a16alvlulbiz.R.iget(1557)!=0|true))||(__CLR4_5_216a16alvlulbiz.R.iget(1558)==0&false))) {{
            __CLR4_5_216a16alvlulbiz.R.inc(1559);creationTime = DateHelper.convert(IsoTypeReader.readUInt64(content));
            __CLR4_5_216a16alvlulbiz.R.inc(1560);modificationTime = DateHelper.convert(IsoTypeReader.readUInt64(content));
            __CLR4_5_216a16alvlulbiz.R.inc(1561);timescale = IsoTypeReader.readUInt32(content);
            __CLR4_5_216a16alvlulbiz.R.inc(1562);duration = content.getLong();
        } }else {{
            __CLR4_5_216a16alvlulbiz.R.inc(1563);creationTime = DateHelper.convert(IsoTypeReader.readUInt32(content));
            __CLR4_5_216a16alvlulbiz.R.inc(1564);modificationTime = DateHelper.convert(IsoTypeReader.readUInt32(content));
            __CLR4_5_216a16alvlulbiz.R.inc(1565);timescale = IsoTypeReader.readUInt32(content);
            __CLR4_5_216a16alvlulbiz.R.inc(1566);duration = content.getInt();
        }
        }__CLR4_5_216a16alvlulbiz.R.inc(1567);if ((((duration < -1)&&(__CLR4_5_216a16alvlulbiz.R.iget(1568)!=0|true))||(__CLR4_5_216a16alvlulbiz.R.iget(1569)==0&false))) {{
            __CLR4_5_216a16alvlulbiz.R.inc(1570);LOG.logWarn("mdhd duration is not in expected range");
        }


        }__CLR4_5_216a16alvlulbiz.R.inc(1571);language = IsoTypeReader.readIso639(content);
        __CLR4_5_216a16alvlulbiz.R.inc(1572);IsoTypeReader.readUInt16(content);
    }finally{__CLR4_5_216a16alvlulbiz.R.flushNeeded();}}


    public String toString() {try{__CLR4_5_216a16alvlulbiz.R.inc(1573);
        __CLR4_5_216a16alvlulbiz.R.inc(1574);StringBuilder result = new StringBuilder();
        __CLR4_5_216a16alvlulbiz.R.inc(1575);result.append("MediaHeaderBox[");
        __CLR4_5_216a16alvlulbiz.R.inc(1576);result.append("creationTime=").append(getCreationTime());
        __CLR4_5_216a16alvlulbiz.R.inc(1577);result.append(";");
        __CLR4_5_216a16alvlulbiz.R.inc(1578);result.append("modificationTime=").append(getModificationTime());
        __CLR4_5_216a16alvlulbiz.R.inc(1579);result.append(";");
        __CLR4_5_216a16alvlulbiz.R.inc(1580);result.append("timescale=").append(getTimescale());
        __CLR4_5_216a16alvlulbiz.R.inc(1581);result.append(";");
        __CLR4_5_216a16alvlulbiz.R.inc(1582);result.append("duration=").append(getDuration());
        __CLR4_5_216a16alvlulbiz.R.inc(1583);result.append(";");
        __CLR4_5_216a16alvlulbiz.R.inc(1584);result.append("language=").append(getLanguage());
        __CLR4_5_216a16alvlulbiz.R.inc(1585);result.append("]");
        __CLR4_5_216a16alvlulbiz.R.inc(1586);return result.toString();
    }finally{__CLR4_5_216a16alvlulbiz.R.flushNeeded();}}

    protected void getContent(ByteBuffer byteBuffer) {try{__CLR4_5_216a16alvlulbiz.R.inc(1587);
        __CLR4_5_216a16alvlulbiz.R.inc(1588);writeVersionAndFlags(byteBuffer);
        __CLR4_5_216a16alvlulbiz.R.inc(1589);if ((((getVersion() == 1)&&(__CLR4_5_216a16alvlulbiz.R.iget(1590)!=0|true))||(__CLR4_5_216a16alvlulbiz.R.iget(1591)==0&false))) {{
            __CLR4_5_216a16alvlulbiz.R.inc(1592);IsoTypeWriter.writeUInt64(byteBuffer, DateHelper.convert(creationTime));
            __CLR4_5_216a16alvlulbiz.R.inc(1593);IsoTypeWriter.writeUInt64(byteBuffer, DateHelper.convert(modificationTime));
            __CLR4_5_216a16alvlulbiz.R.inc(1594);IsoTypeWriter.writeUInt32(byteBuffer, timescale);
            __CLR4_5_216a16alvlulbiz.R.inc(1595);byteBuffer.putLong(duration);
        } }else {{
            __CLR4_5_216a16alvlulbiz.R.inc(1596);IsoTypeWriter.writeUInt32(byteBuffer, DateHelper.convert(creationTime));
            __CLR4_5_216a16alvlulbiz.R.inc(1597);IsoTypeWriter.writeUInt32(byteBuffer, DateHelper.convert(modificationTime));
            __CLR4_5_216a16alvlulbiz.R.inc(1598);IsoTypeWriter.writeUInt32(byteBuffer, timescale);
            __CLR4_5_216a16alvlulbiz.R.inc(1599);byteBuffer.putInt((int) duration);
        }
        }__CLR4_5_216a16alvlulbiz.R.inc(1600);IsoTypeWriter.writeIso639(byteBuffer, language);
        __CLR4_5_216a16alvlulbiz.R.inc(1601);IsoTypeWriter.writeUInt16(byteBuffer, 0);
    }finally{__CLR4_5_216a16alvlulbiz.R.flushNeeded();}}
}
