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
import com.googlecode.mp4parser.util.Matrix;

import java.nio.ByteBuffer;
import java.util.Date;

/**
 * <h1>4cc = "{@value #TYPE}"</h1>
 * <code>
 * Box Type: 'mvhd'<br>
 * Container: {@link MovieBox} ('moov')<br>
 * Mandatory: Yes<br>
 * Quantity: Exactly one<br><br>
 * </code>
 * This box defines overall information which is media-independent, and relevant to the entire presentation
 * considered as a whole.
 */
public class MovieHeaderBox extends AbstractFullBox {public static class __CLR4_5_21au1aulvlulbqm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,1841,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static Logger LOG = Logger.getLogger(MovieHeaderBox.class);

    private Date creationTime;
    private Date modificationTime;
    private long timescale;
    private long duration;
    private double rate = 1.0;
    private float volume = 1.0f;
    private Matrix matrix = Matrix.ROTATE_0;
    private long nextTrackId;

    private int previewTime;
    private int previewDuration;
    private int posterTime;
    private int selectionTime;
    private int selectionDuration;
    private int currentTime;


    public static final String TYPE = "mvhd";

    public MovieHeaderBox() {
        super(TYPE);__CLR4_5_21au1aulvlulbqm.R.inc(1687);try{__CLR4_5_21au1aulvlulbqm.R.inc(1686);
    }finally{__CLR4_5_21au1aulvlulbqm.R.flushNeeded();}}

    public Date getCreationTime() {try{__CLR4_5_21au1aulvlulbqm.R.inc(1688);
        __CLR4_5_21au1aulvlulbqm.R.inc(1689);return creationTime;
    }finally{__CLR4_5_21au1aulvlulbqm.R.flushNeeded();}}

    public Date getModificationTime() {try{__CLR4_5_21au1aulvlulbqm.R.inc(1690);
        __CLR4_5_21au1aulvlulbqm.R.inc(1691);return modificationTime;
    }finally{__CLR4_5_21au1aulvlulbqm.R.flushNeeded();}}

    public long getTimescale() {try{__CLR4_5_21au1aulvlulbqm.R.inc(1692);
        __CLR4_5_21au1aulvlulbqm.R.inc(1693);return timescale;
    }finally{__CLR4_5_21au1aulvlulbqm.R.flushNeeded();}}

    public long getDuration() {try{__CLR4_5_21au1aulvlulbqm.R.inc(1694);
        __CLR4_5_21au1aulvlulbqm.R.inc(1695);return duration;
    }finally{__CLR4_5_21au1aulvlulbqm.R.flushNeeded();}}

    public double getRate() {try{__CLR4_5_21au1aulvlulbqm.R.inc(1696);
        __CLR4_5_21au1aulvlulbqm.R.inc(1697);return rate;
    }finally{__CLR4_5_21au1aulvlulbqm.R.flushNeeded();}}

    public float getVolume() {try{__CLR4_5_21au1aulvlulbqm.R.inc(1698);
        __CLR4_5_21au1aulvlulbqm.R.inc(1699);return volume;
    }finally{__CLR4_5_21au1aulvlulbqm.R.flushNeeded();}}

    public Matrix getMatrix() {try{__CLR4_5_21au1aulvlulbqm.R.inc(1700);
        __CLR4_5_21au1aulvlulbqm.R.inc(1701);return matrix;
    }finally{__CLR4_5_21au1aulvlulbqm.R.flushNeeded();}}

    public long getNextTrackId() {try{__CLR4_5_21au1aulvlulbqm.R.inc(1702);
        __CLR4_5_21au1aulvlulbqm.R.inc(1703);return nextTrackId;
    }finally{__CLR4_5_21au1aulvlulbqm.R.flushNeeded();}}

    protected long getContentSize() {try{__CLR4_5_21au1aulvlulbqm.R.inc(1704);
        __CLR4_5_21au1aulvlulbqm.R.inc(1705);long contentSize = 4;
        __CLR4_5_21au1aulvlulbqm.R.inc(1706);if ((((getVersion() == 1)&&(__CLR4_5_21au1aulvlulbqm.R.iget(1707)!=0|true))||(__CLR4_5_21au1aulvlulbqm.R.iget(1708)==0&false))) {{
            __CLR4_5_21au1aulvlulbqm.R.inc(1709);contentSize += 28;
        } }else {{
            __CLR4_5_21au1aulvlulbqm.R.inc(1710);contentSize += 16;
        }
        }__CLR4_5_21au1aulvlulbqm.R.inc(1711);contentSize += 80;
        __CLR4_5_21au1aulvlulbqm.R.inc(1712);return contentSize;
    }finally{__CLR4_5_21au1aulvlulbqm.R.flushNeeded();}}

    @Override
    public void _parseDetails(ByteBuffer content) {try{__CLR4_5_21au1aulvlulbqm.R.inc(1713);
        __CLR4_5_21au1aulvlulbqm.R.inc(1714);parseVersionAndFlags(content);
        __CLR4_5_21au1aulvlulbqm.R.inc(1715);if ((((getVersion() == 1)&&(__CLR4_5_21au1aulvlulbqm.R.iget(1716)!=0|true))||(__CLR4_5_21au1aulvlulbqm.R.iget(1717)==0&false))) {{
            __CLR4_5_21au1aulvlulbqm.R.inc(1718);creationTime = DateHelper.convert(IsoTypeReader.readUInt64(content));
            __CLR4_5_21au1aulvlulbqm.R.inc(1719);modificationTime = DateHelper.convert(IsoTypeReader.readUInt64(content));
            __CLR4_5_21au1aulvlulbqm.R.inc(1720);timescale = IsoTypeReader.readUInt32(content);
            __CLR4_5_21au1aulvlulbqm.R.inc(1721);duration = content.getLong();

        } }else {{
            __CLR4_5_21au1aulvlulbqm.R.inc(1722);creationTime = DateHelper.convert(IsoTypeReader.readUInt32(content));
            __CLR4_5_21au1aulvlulbqm.R.inc(1723);modificationTime = DateHelper.convert(IsoTypeReader.readUInt32(content));
            __CLR4_5_21au1aulvlulbqm.R.inc(1724);timescale = IsoTypeReader.readUInt32(content);
            __CLR4_5_21au1aulvlulbqm.R.inc(1725);duration = content.getInt();
        }
        }__CLR4_5_21au1aulvlulbqm.R.inc(1726);if ((((duration < -1)&&(__CLR4_5_21au1aulvlulbqm.R.iget(1727)!=0|true))||(__CLR4_5_21au1aulvlulbqm.R.iget(1728)==0&false))) {{
            __CLR4_5_21au1aulvlulbqm.R.inc(1729);LOG.logWarn("mvhd duration is not in expected range");
        }


        }__CLR4_5_21au1aulvlulbqm.R.inc(1730);rate = IsoTypeReader.readFixedPoint1616(content);
        __CLR4_5_21au1aulvlulbqm.R.inc(1731);volume = IsoTypeReader.readFixedPoint88(content);
        __CLR4_5_21au1aulvlulbqm.R.inc(1732);IsoTypeReader.readUInt16(content);
        __CLR4_5_21au1aulvlulbqm.R.inc(1733);IsoTypeReader.readUInt32(content);
        __CLR4_5_21au1aulvlulbqm.R.inc(1734);IsoTypeReader.readUInt32(content);

        __CLR4_5_21au1aulvlulbqm.R.inc(1735);matrix = Matrix.fromByteBuffer(content);

        __CLR4_5_21au1aulvlulbqm.R.inc(1736);previewTime = content.getInt();
        __CLR4_5_21au1aulvlulbqm.R.inc(1737);previewDuration = content.getInt();
        __CLR4_5_21au1aulvlulbqm.R.inc(1738);posterTime = content.getInt();
        __CLR4_5_21au1aulvlulbqm.R.inc(1739);selectionTime = content.getInt();
        __CLR4_5_21au1aulvlulbqm.R.inc(1740);selectionDuration = content.getInt();
        __CLR4_5_21au1aulvlulbqm.R.inc(1741);currentTime = content.getInt();

        __CLR4_5_21au1aulvlulbqm.R.inc(1742);nextTrackId = IsoTypeReader.readUInt32(content);

    }finally{__CLR4_5_21au1aulvlulbqm.R.flushNeeded();}}

    public String toString() {try{__CLR4_5_21au1aulvlulbqm.R.inc(1743);
        __CLR4_5_21au1aulvlulbqm.R.inc(1744);StringBuilder result = new StringBuilder();
        __CLR4_5_21au1aulvlulbqm.R.inc(1745);result.append("MovieHeaderBox[");
        __CLR4_5_21au1aulvlulbqm.R.inc(1746);result.append("creationTime=").append(getCreationTime());
        __CLR4_5_21au1aulvlulbqm.R.inc(1747);result.append(";");
        __CLR4_5_21au1aulvlulbqm.R.inc(1748);result.append("modificationTime=").append(getModificationTime());
        __CLR4_5_21au1aulvlulbqm.R.inc(1749);result.append(";");
        __CLR4_5_21au1aulvlulbqm.R.inc(1750);result.append("timescale=").append(getTimescale());
        __CLR4_5_21au1aulvlulbqm.R.inc(1751);result.append(";");
        __CLR4_5_21au1aulvlulbqm.R.inc(1752);result.append("duration=").append(getDuration());
        __CLR4_5_21au1aulvlulbqm.R.inc(1753);result.append(";");
        __CLR4_5_21au1aulvlulbqm.R.inc(1754);result.append("rate=").append(getRate());
        __CLR4_5_21au1aulvlulbqm.R.inc(1755);result.append(";");
        __CLR4_5_21au1aulvlulbqm.R.inc(1756);result.append("volume=").append(getVolume());
        __CLR4_5_21au1aulvlulbqm.R.inc(1757);result.append(";");
        __CLR4_5_21au1aulvlulbqm.R.inc(1758);result.append("matrix=").append(matrix);
        __CLR4_5_21au1aulvlulbqm.R.inc(1759);result.append(";");
        __CLR4_5_21au1aulvlulbqm.R.inc(1760);result.append("nextTrackId=").append(getNextTrackId());
        __CLR4_5_21au1aulvlulbqm.R.inc(1761);result.append("]");
        __CLR4_5_21au1aulvlulbqm.R.inc(1762);return result.toString();
    }finally{__CLR4_5_21au1aulvlulbqm.R.flushNeeded();}}


    @Override
    protected void getContent(ByteBuffer byteBuffer) {try{__CLR4_5_21au1aulvlulbqm.R.inc(1763);
        __CLR4_5_21au1aulvlulbqm.R.inc(1764);writeVersionAndFlags(byteBuffer);
        __CLR4_5_21au1aulvlulbqm.R.inc(1765);if ((((getVersion() == 1)&&(__CLR4_5_21au1aulvlulbqm.R.iget(1766)!=0|true))||(__CLR4_5_21au1aulvlulbqm.R.iget(1767)==0&false))) {{
            __CLR4_5_21au1aulvlulbqm.R.inc(1768);IsoTypeWriter.writeUInt64(byteBuffer, DateHelper.convert(creationTime));
            __CLR4_5_21au1aulvlulbqm.R.inc(1769);IsoTypeWriter.writeUInt64(byteBuffer, DateHelper.convert(modificationTime));
            __CLR4_5_21au1aulvlulbqm.R.inc(1770);IsoTypeWriter.writeUInt32(byteBuffer, timescale);
            __CLR4_5_21au1aulvlulbqm.R.inc(1771);byteBuffer.putLong(duration);
        } }else {{
            __CLR4_5_21au1aulvlulbqm.R.inc(1772);IsoTypeWriter.writeUInt32(byteBuffer, DateHelper.convert(creationTime));
            __CLR4_5_21au1aulvlulbqm.R.inc(1773);IsoTypeWriter.writeUInt32(byteBuffer, DateHelper.convert(modificationTime));
            __CLR4_5_21au1aulvlulbqm.R.inc(1774);IsoTypeWriter.writeUInt32(byteBuffer, timescale);
            __CLR4_5_21au1aulvlulbqm.R.inc(1775);byteBuffer.putInt((int) duration);
        }
        }__CLR4_5_21au1aulvlulbqm.R.inc(1776);IsoTypeWriter.writeFixedPoint1616(byteBuffer, rate);
        __CLR4_5_21au1aulvlulbqm.R.inc(1777);IsoTypeWriter.writeFixedPoint88(byteBuffer, volume);
        __CLR4_5_21au1aulvlulbqm.R.inc(1778);IsoTypeWriter.writeUInt16(byteBuffer, 0);
        __CLR4_5_21au1aulvlulbqm.R.inc(1779);IsoTypeWriter.writeUInt32(byteBuffer, 0);
        __CLR4_5_21au1aulvlulbqm.R.inc(1780);IsoTypeWriter.writeUInt32(byteBuffer, 0);

        __CLR4_5_21au1aulvlulbqm.R.inc(1781);matrix.getContent(byteBuffer);

        __CLR4_5_21au1aulvlulbqm.R.inc(1782);byteBuffer.putInt(previewTime);
        __CLR4_5_21au1aulvlulbqm.R.inc(1783);byteBuffer.putInt(previewDuration);
        __CLR4_5_21au1aulvlulbqm.R.inc(1784);byteBuffer.putInt(posterTime);
        __CLR4_5_21au1aulvlulbqm.R.inc(1785);byteBuffer.putInt(selectionTime);
        __CLR4_5_21au1aulvlulbqm.R.inc(1786);byteBuffer.putInt(selectionDuration);
        __CLR4_5_21au1aulvlulbqm.R.inc(1787);byteBuffer.putInt(currentTime);

        __CLR4_5_21au1aulvlulbqm.R.inc(1788);IsoTypeWriter.writeUInt32(byteBuffer, nextTrackId);
    }finally{__CLR4_5_21au1aulvlulbqm.R.flushNeeded();}}


    public void setCreationTime(Date creationTime) {try{__CLR4_5_21au1aulvlulbqm.R.inc(1789);
        __CLR4_5_21au1aulvlulbqm.R.inc(1790);this.creationTime = creationTime;
        __CLR4_5_21au1aulvlulbqm.R.inc(1791);if ((((DateHelper.convert(creationTime) >= (1l << 32))&&(__CLR4_5_21au1aulvlulbqm.R.iget(1792)!=0|true))||(__CLR4_5_21au1aulvlulbqm.R.iget(1793)==0&false))) {{
            __CLR4_5_21au1aulvlulbqm.R.inc(1794);setVersion(1);
        }

    }}finally{__CLR4_5_21au1aulvlulbqm.R.flushNeeded();}}

    public void setModificationTime(Date modificationTime) {try{__CLR4_5_21au1aulvlulbqm.R.inc(1795);
        __CLR4_5_21au1aulvlulbqm.R.inc(1796);this.modificationTime = modificationTime;
        __CLR4_5_21au1aulvlulbqm.R.inc(1797);if ((((DateHelper.convert(modificationTime) >= (1l << 32))&&(__CLR4_5_21au1aulvlulbqm.R.iget(1798)!=0|true))||(__CLR4_5_21au1aulvlulbqm.R.iget(1799)==0&false))) {{
            __CLR4_5_21au1aulvlulbqm.R.inc(1800);setVersion(1);
        }

    }}finally{__CLR4_5_21au1aulvlulbqm.R.flushNeeded();}}

    public void setTimescale(long timescale) {try{__CLR4_5_21au1aulvlulbqm.R.inc(1801);
        __CLR4_5_21au1aulvlulbqm.R.inc(1802);this.timescale = timescale;
    }finally{__CLR4_5_21au1aulvlulbqm.R.flushNeeded();}}

    public void setDuration(long duration) {try{__CLR4_5_21au1aulvlulbqm.R.inc(1803);
        __CLR4_5_21au1aulvlulbqm.R.inc(1804);this.duration = duration;
        __CLR4_5_21au1aulvlulbqm.R.inc(1805);if ((((duration >= (1l << 32))&&(__CLR4_5_21au1aulvlulbqm.R.iget(1806)!=0|true))||(__CLR4_5_21au1aulvlulbqm.R.iget(1807)==0&false))) {{
            __CLR4_5_21au1aulvlulbqm.R.inc(1808);setVersion(1);
        }
    }}finally{__CLR4_5_21au1aulvlulbqm.R.flushNeeded();}}

    public void setRate(double rate) {try{__CLR4_5_21au1aulvlulbqm.R.inc(1809);
        __CLR4_5_21au1aulvlulbqm.R.inc(1810);this.rate = rate;
    }finally{__CLR4_5_21au1aulvlulbqm.R.flushNeeded();}}

    public void setVolume(float volume) {try{__CLR4_5_21au1aulvlulbqm.R.inc(1811);
        __CLR4_5_21au1aulvlulbqm.R.inc(1812);this.volume = volume;
    }finally{__CLR4_5_21au1aulvlulbqm.R.flushNeeded();}}

    public void setMatrix(Matrix matrix) {try{__CLR4_5_21au1aulvlulbqm.R.inc(1813);
        __CLR4_5_21au1aulvlulbqm.R.inc(1814);this.matrix = matrix;
    }finally{__CLR4_5_21au1aulvlulbqm.R.flushNeeded();}}

    public void setNextTrackId(long nextTrackId) {try{__CLR4_5_21au1aulvlulbqm.R.inc(1815);
        __CLR4_5_21au1aulvlulbqm.R.inc(1816);this.nextTrackId = nextTrackId;
    }finally{__CLR4_5_21au1aulvlulbqm.R.flushNeeded();}}

    public int getPreviewTime() {try{__CLR4_5_21au1aulvlulbqm.R.inc(1817);
        __CLR4_5_21au1aulvlulbqm.R.inc(1818);return previewTime;
    }finally{__CLR4_5_21au1aulvlulbqm.R.flushNeeded();}}

    public void setPreviewTime(int previewTime) {try{__CLR4_5_21au1aulvlulbqm.R.inc(1819);
        __CLR4_5_21au1aulvlulbqm.R.inc(1820);this.previewTime = previewTime;
    }finally{__CLR4_5_21au1aulvlulbqm.R.flushNeeded();}}

    public int getPreviewDuration() {try{__CLR4_5_21au1aulvlulbqm.R.inc(1821);
        __CLR4_5_21au1aulvlulbqm.R.inc(1822);return previewDuration;
    }finally{__CLR4_5_21au1aulvlulbqm.R.flushNeeded();}}

    public void setPreviewDuration(int previewDuration) {try{__CLR4_5_21au1aulvlulbqm.R.inc(1823);
        __CLR4_5_21au1aulvlulbqm.R.inc(1824);this.previewDuration = previewDuration;
    }finally{__CLR4_5_21au1aulvlulbqm.R.flushNeeded();}}

    public int getPosterTime() {try{__CLR4_5_21au1aulvlulbqm.R.inc(1825);
        __CLR4_5_21au1aulvlulbqm.R.inc(1826);return posterTime;
    }finally{__CLR4_5_21au1aulvlulbqm.R.flushNeeded();}}

    public void setPosterTime(int posterTime) {try{__CLR4_5_21au1aulvlulbqm.R.inc(1827);
        __CLR4_5_21au1aulvlulbqm.R.inc(1828);this.posterTime = posterTime;
    }finally{__CLR4_5_21au1aulvlulbqm.R.flushNeeded();}}

    public int getSelectionTime() {try{__CLR4_5_21au1aulvlulbqm.R.inc(1829);
        __CLR4_5_21au1aulvlulbqm.R.inc(1830);return selectionTime;
    }finally{__CLR4_5_21au1aulvlulbqm.R.flushNeeded();}}

    public void setSelectionTime(int selectionTime) {try{__CLR4_5_21au1aulvlulbqm.R.inc(1831);
        __CLR4_5_21au1aulvlulbqm.R.inc(1832);this.selectionTime = selectionTime;
    }finally{__CLR4_5_21au1aulvlulbqm.R.flushNeeded();}}

    public int getSelectionDuration() {try{__CLR4_5_21au1aulvlulbqm.R.inc(1833);
        __CLR4_5_21au1aulvlulbqm.R.inc(1834);return selectionDuration;
    }finally{__CLR4_5_21au1aulvlulbqm.R.flushNeeded();}}

    public void setSelectionDuration(int selectionDuration) {try{__CLR4_5_21au1aulvlulbqm.R.inc(1835);
        __CLR4_5_21au1aulvlulbqm.R.inc(1836);this.selectionDuration = selectionDuration;
    }finally{__CLR4_5_21au1aulvlulbqm.R.flushNeeded();}}

    public int getCurrentTime() {try{__CLR4_5_21au1aulvlulbqm.R.inc(1837);
        __CLR4_5_21au1aulvlulbqm.R.inc(1838);return currentTime;
    }finally{__CLR4_5_21au1aulvlulbqm.R.flushNeeded();}}

    public void setCurrentTime(int currentTime) {try{__CLR4_5_21au1aulvlulbqm.R.inc(1839);
        __CLR4_5_21au1aulvlulbqm.R.inc(1840);this.currentTime = currentTime;
    }finally{__CLR4_5_21au1aulvlulbqm.R.flushNeeded();}}
}
