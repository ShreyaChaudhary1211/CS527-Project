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
 * This box specifies the characteristics of a single track. Exactly one Track Header Box is contained in a track.<br>
 * In the absence of an edit list, the presentation of a track starts at the beginning of the overall presentation. An
 * empty edit is used to offset the start time of a track. <br>
 * The default value of the track header flags for media tracks is 7 (track_enabled, track_in_movie,
 * track_in_preview). If in a presentation all tracks have neither track_in_movie nor track_in_preview set, then all
 * tracks shall be treated as if both flags were set on all tracks. Hint tracks should have the track header flags set
 * to 0, so that they are ignored for local playback and preview.
 */
public class TrackHeaderBox extends AbstractFullBox {public static class __CLR4_5_221q21qlvlulc3s{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,2826,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static Logger LOG = Logger.getLogger(TrackHeaderBox.class);

    public static final String TYPE = "tkhd";

    private Date creationTime = new Date(0);
    private Date modificationTime = new Date(0);
    private long trackId;
    private long duration;
    private int layer;
    private int alternateGroup;
    private float volume;
    private Matrix matrix = Matrix.ROTATE_0;
    private double width;
    private double height;


    public TrackHeaderBox() {
        super(TYPE);__CLR4_5_221q21qlvlulc3s.R.inc(2655);try{__CLR4_5_221q21qlvlulc3s.R.inc(2654);

    }finally{__CLR4_5_221q21qlvlulc3s.R.flushNeeded();}}

    public Date getCreationTime() {try{__CLR4_5_221q21qlvlulc3s.R.inc(2656);
        __CLR4_5_221q21qlvlulc3s.R.inc(2657);return creationTime;
    }finally{__CLR4_5_221q21qlvlulc3s.R.flushNeeded();}}

    public Date getModificationTime() {try{__CLR4_5_221q21qlvlulc3s.R.inc(2658);
        __CLR4_5_221q21qlvlulc3s.R.inc(2659);return modificationTime;
    }finally{__CLR4_5_221q21qlvlulc3s.R.flushNeeded();}}

    public long getTrackId() {try{__CLR4_5_221q21qlvlulc3s.R.inc(2660);
        __CLR4_5_221q21qlvlulc3s.R.inc(2661);return trackId;
    }finally{__CLR4_5_221q21qlvlulc3s.R.flushNeeded();}}

    public long getDuration() {try{__CLR4_5_221q21qlvlulc3s.R.inc(2662);
        __CLR4_5_221q21qlvlulc3s.R.inc(2663);return duration;
    }finally{__CLR4_5_221q21qlvlulc3s.R.flushNeeded();}}

    public int getLayer() {try{__CLR4_5_221q21qlvlulc3s.R.inc(2664);
        __CLR4_5_221q21qlvlulc3s.R.inc(2665);return layer;
    }finally{__CLR4_5_221q21qlvlulc3s.R.flushNeeded();}}

    public int getAlternateGroup() {try{__CLR4_5_221q21qlvlulc3s.R.inc(2666);
        __CLR4_5_221q21qlvlulc3s.R.inc(2667);return alternateGroup;
    }finally{__CLR4_5_221q21qlvlulc3s.R.flushNeeded();}}

    public float getVolume() {try{__CLR4_5_221q21qlvlulc3s.R.inc(2668);
        __CLR4_5_221q21qlvlulc3s.R.inc(2669);return volume;
    }finally{__CLR4_5_221q21qlvlulc3s.R.flushNeeded();}}

    public Matrix getMatrix() {try{__CLR4_5_221q21qlvlulc3s.R.inc(2670);
        __CLR4_5_221q21qlvlulc3s.R.inc(2671);return matrix;
    }finally{__CLR4_5_221q21qlvlulc3s.R.flushNeeded();}}

    public double getWidth() {try{__CLR4_5_221q21qlvlulc3s.R.inc(2672);
        __CLR4_5_221q21qlvlulc3s.R.inc(2673);return width;
    }finally{__CLR4_5_221q21qlvlulc3s.R.flushNeeded();}}

    public double getHeight() {try{__CLR4_5_221q21qlvlulc3s.R.inc(2674);
        __CLR4_5_221q21qlvlulc3s.R.inc(2675);return height;
    }finally{__CLR4_5_221q21qlvlulc3s.R.flushNeeded();}}

    protected long getContentSize() {try{__CLR4_5_221q21qlvlulc3s.R.inc(2676);
        __CLR4_5_221q21qlvlulc3s.R.inc(2677);long contentSize = 4;
        __CLR4_5_221q21qlvlulc3s.R.inc(2678);if ((((getVersion() == 1)&&(__CLR4_5_221q21qlvlulc3s.R.iget(2679)!=0|true))||(__CLR4_5_221q21qlvlulc3s.R.iget(2680)==0&false))) {{
            __CLR4_5_221q21qlvlulc3s.R.inc(2681);contentSize += 32;
        } }else {{
            __CLR4_5_221q21qlvlulc3s.R.inc(2682);contentSize += 20;
        }
        }__CLR4_5_221q21qlvlulc3s.R.inc(2683);contentSize += 60;
        __CLR4_5_221q21qlvlulc3s.R.inc(2684);return contentSize;
    }finally{__CLR4_5_221q21qlvlulc3s.R.flushNeeded();}}

    @Override
    public void _parseDetails(ByteBuffer content) {try{__CLR4_5_221q21qlvlulc3s.R.inc(2685);
        __CLR4_5_221q21qlvlulc3s.R.inc(2686);parseVersionAndFlags(content);
        __CLR4_5_221q21qlvlulc3s.R.inc(2687);if ((((getVersion() == 1)&&(__CLR4_5_221q21qlvlulc3s.R.iget(2688)!=0|true))||(__CLR4_5_221q21qlvlulc3s.R.iget(2689)==0&false))) {{
            __CLR4_5_221q21qlvlulc3s.R.inc(2690);creationTime = DateHelper.convert(IsoTypeReader.readUInt64(content));
            __CLR4_5_221q21qlvlulc3s.R.inc(2691);modificationTime = DateHelper.convert(IsoTypeReader.readUInt64(content));
            __CLR4_5_221q21qlvlulc3s.R.inc(2692);trackId = IsoTypeReader.readUInt32(content);
            __CLR4_5_221q21qlvlulc3s.R.inc(2693);IsoTypeReader.readUInt32(content);
            __CLR4_5_221q21qlvlulc3s.R.inc(2694);duration = content.getLong();
        } }else {{
            __CLR4_5_221q21qlvlulc3s.R.inc(2695);creationTime = DateHelper.convert(IsoTypeReader.readUInt32(content));
            __CLR4_5_221q21qlvlulc3s.R.inc(2696);modificationTime = DateHelper.convert(IsoTypeReader.readUInt32(content));
            __CLR4_5_221q21qlvlulc3s.R.inc(2697);trackId = IsoTypeReader.readUInt32(content);
            __CLR4_5_221q21qlvlulc3s.R.inc(2698);IsoTypeReader.readUInt32(content);
            __CLR4_5_221q21qlvlulc3s.R.inc(2699);duration = content.getInt();
        } // 196

        }__CLR4_5_221q21qlvlulc3s.R.inc(2700);if ((((duration < -1)&&(__CLR4_5_221q21qlvlulc3s.R.iget(2701)!=0|true))||(__CLR4_5_221q21qlvlulc3s.R.iget(2702)==0&false))) {{
            __CLR4_5_221q21qlvlulc3s.R.inc(2703);LOG.logWarn("tkhd duration is not in expected range");
        }

        }__CLR4_5_221q21qlvlulc3s.R.inc(2704);IsoTypeReader.readUInt32(content);
        __CLR4_5_221q21qlvlulc3s.R.inc(2705);IsoTypeReader.readUInt32(content);
        __CLR4_5_221q21qlvlulc3s.R.inc(2706);layer = IsoTypeReader.readUInt16(content);    // 204
        __CLR4_5_221q21qlvlulc3s.R.inc(2707);alternateGroup = IsoTypeReader.readUInt16(content);
        __CLR4_5_221q21qlvlulc3s.R.inc(2708);volume = IsoTypeReader.readFixedPoint88(content);
        __CLR4_5_221q21qlvlulc3s.R.inc(2709);IsoTypeReader.readUInt16(content);     // 212
        __CLR4_5_221q21qlvlulc3s.R.inc(2710);matrix = Matrix.fromByteBuffer(content);
        __CLR4_5_221q21qlvlulc3s.R.inc(2711);width = IsoTypeReader.readFixedPoint1616(content);    // 248
        __CLR4_5_221q21qlvlulc3s.R.inc(2712);height = IsoTypeReader.readFixedPoint1616(content);
    }finally{__CLR4_5_221q21qlvlulc3s.R.flushNeeded();}}

    public void getContent(ByteBuffer byteBuffer) {try{__CLR4_5_221q21qlvlulc3s.R.inc(2713);
        __CLR4_5_221q21qlvlulc3s.R.inc(2714);writeVersionAndFlags(byteBuffer);
        __CLR4_5_221q21qlvlulc3s.R.inc(2715);if ((((getVersion() == 1)&&(__CLR4_5_221q21qlvlulc3s.R.iget(2716)!=0|true))||(__CLR4_5_221q21qlvlulc3s.R.iget(2717)==0&false))) {{
            __CLR4_5_221q21qlvlulc3s.R.inc(2718);IsoTypeWriter.writeUInt64(byteBuffer, DateHelper.convert(creationTime));
            __CLR4_5_221q21qlvlulc3s.R.inc(2719);IsoTypeWriter.writeUInt64(byteBuffer, DateHelper.convert(modificationTime));
            __CLR4_5_221q21qlvlulc3s.R.inc(2720);IsoTypeWriter.writeUInt32(byteBuffer, trackId);
            __CLR4_5_221q21qlvlulc3s.R.inc(2721);IsoTypeWriter.writeUInt32(byteBuffer, 0);
            __CLR4_5_221q21qlvlulc3s.R.inc(2722);byteBuffer.putLong(duration);
        } }else {{
            __CLR4_5_221q21qlvlulc3s.R.inc(2723);IsoTypeWriter.writeUInt32(byteBuffer, DateHelper.convert(creationTime));
            __CLR4_5_221q21qlvlulc3s.R.inc(2724);IsoTypeWriter.writeUInt32(byteBuffer, DateHelper.convert(modificationTime));
            __CLR4_5_221q21qlvlulc3s.R.inc(2725);IsoTypeWriter.writeUInt32(byteBuffer, trackId);
            __CLR4_5_221q21qlvlulc3s.R.inc(2726);IsoTypeWriter.writeUInt32(byteBuffer, 0);
            __CLR4_5_221q21qlvlulc3s.R.inc(2727);byteBuffer.putInt((int) duration);
        } // 196
        }__CLR4_5_221q21qlvlulc3s.R.inc(2728);IsoTypeWriter.writeUInt32(byteBuffer, 0);
        __CLR4_5_221q21qlvlulc3s.R.inc(2729);IsoTypeWriter.writeUInt32(byteBuffer, 0);
        __CLR4_5_221q21qlvlulc3s.R.inc(2730);IsoTypeWriter.writeUInt16(byteBuffer, layer);
        __CLR4_5_221q21qlvlulc3s.R.inc(2731);IsoTypeWriter.writeUInt16(byteBuffer, alternateGroup);
        __CLR4_5_221q21qlvlulc3s.R.inc(2732);IsoTypeWriter.writeFixedPoint88(byteBuffer, volume);
        __CLR4_5_221q21qlvlulc3s.R.inc(2733);IsoTypeWriter.writeUInt16(byteBuffer, 0);
        __CLR4_5_221q21qlvlulc3s.R.inc(2734);int i = 0;
        __CLR4_5_221q21qlvlulc3s.R.inc(2735);matrix.getContent(byteBuffer);

        __CLR4_5_221q21qlvlulc3s.R.inc(2736);IsoTypeWriter.writeFixedPoint1616(byteBuffer, width);
        __CLR4_5_221q21qlvlulc3s.R.inc(2737);IsoTypeWriter.writeFixedPoint1616(byteBuffer, height);
    }finally{__CLR4_5_221q21qlvlulc3s.R.flushNeeded();}}

    public String toString() {try{__CLR4_5_221q21qlvlulc3s.R.inc(2738);
        __CLR4_5_221q21qlvlulc3s.R.inc(2739);StringBuilder result = new StringBuilder();
        __CLR4_5_221q21qlvlulc3s.R.inc(2740);result.append("TrackHeaderBox[");
        __CLR4_5_221q21qlvlulc3s.R.inc(2741);result.append("creationTime=").append(getCreationTime());
        __CLR4_5_221q21qlvlulc3s.R.inc(2742);result.append(";");
        __CLR4_5_221q21qlvlulc3s.R.inc(2743);result.append("modificationTime=").append(getModificationTime());
        __CLR4_5_221q21qlvlulc3s.R.inc(2744);result.append(";");
        __CLR4_5_221q21qlvlulc3s.R.inc(2745);result.append("trackId=").append(getTrackId());
        __CLR4_5_221q21qlvlulc3s.R.inc(2746);result.append(";");
        __CLR4_5_221q21qlvlulc3s.R.inc(2747);result.append("duration=").append(getDuration());
        __CLR4_5_221q21qlvlulc3s.R.inc(2748);result.append(";");
        __CLR4_5_221q21qlvlulc3s.R.inc(2749);result.append("layer=").append(getLayer());
        __CLR4_5_221q21qlvlulc3s.R.inc(2750);result.append(";");
        __CLR4_5_221q21qlvlulc3s.R.inc(2751);result.append("alternateGroup=").append(getAlternateGroup());
        __CLR4_5_221q21qlvlulc3s.R.inc(2752);result.append(";");
        __CLR4_5_221q21qlvlulc3s.R.inc(2753);result.append("volume=").append(getVolume());
        __CLR4_5_221q21qlvlulc3s.R.inc(2754);result.append(";");
        __CLR4_5_221q21qlvlulc3s.R.inc(2755);result.append("matrix=").append(matrix);
        __CLR4_5_221q21qlvlulc3s.R.inc(2756);result.append(";");
        __CLR4_5_221q21qlvlulc3s.R.inc(2757);result.append("width=").append(getWidth());
        __CLR4_5_221q21qlvlulc3s.R.inc(2758);result.append(";");
        __CLR4_5_221q21qlvlulc3s.R.inc(2759);result.append("height=").append(getHeight());
        __CLR4_5_221q21qlvlulc3s.R.inc(2760);result.append("]");
        __CLR4_5_221q21qlvlulc3s.R.inc(2761);return result.toString();
    }finally{__CLR4_5_221q21qlvlulc3s.R.flushNeeded();}}

    public void setCreationTime(Date creationTime) {try{__CLR4_5_221q21qlvlulc3s.R.inc(2762);
        __CLR4_5_221q21qlvlulc3s.R.inc(2763);this.creationTime = creationTime;
        __CLR4_5_221q21qlvlulc3s.R.inc(2764);if ((((DateHelper.convert(creationTime) >= (1l << 32))&&(__CLR4_5_221q21qlvlulc3s.R.iget(2765)!=0|true))||(__CLR4_5_221q21qlvlulc3s.R.iget(2766)==0&false))) {{
            __CLR4_5_221q21qlvlulc3s.R.inc(2767);setVersion(1);
        }
    }}finally{__CLR4_5_221q21qlvlulc3s.R.flushNeeded();}}

    public void setModificationTime(Date modificationTime) {try{__CLR4_5_221q21qlvlulc3s.R.inc(2768);
        __CLR4_5_221q21qlvlulc3s.R.inc(2769);this.modificationTime = modificationTime;
        __CLR4_5_221q21qlvlulc3s.R.inc(2770);if ((((DateHelper.convert(modificationTime) >= (1l << 32))&&(__CLR4_5_221q21qlvlulc3s.R.iget(2771)!=0|true))||(__CLR4_5_221q21qlvlulc3s.R.iget(2772)==0&false))) {{
            __CLR4_5_221q21qlvlulc3s.R.inc(2773);setVersion(1);
        }

    }}finally{__CLR4_5_221q21qlvlulc3s.R.flushNeeded();}}

    public void setTrackId(long trackId) {try{__CLR4_5_221q21qlvlulc3s.R.inc(2774);
        __CLR4_5_221q21qlvlulc3s.R.inc(2775);this.trackId = trackId;
    }finally{__CLR4_5_221q21qlvlulc3s.R.flushNeeded();}}

    public void setDuration(long duration) {try{__CLR4_5_221q21qlvlulc3s.R.inc(2776);
        __CLR4_5_221q21qlvlulc3s.R.inc(2777);this.duration = duration;
        __CLR4_5_221q21qlvlulc3s.R.inc(2778);if ((((duration >= (1l << 32))&&(__CLR4_5_221q21qlvlulc3s.R.iget(2779)!=0|true))||(__CLR4_5_221q21qlvlulc3s.R.iget(2780)==0&false))) {{
            __CLR4_5_221q21qlvlulc3s.R.inc(2781);setFlags(1);
        }
    }}finally{__CLR4_5_221q21qlvlulc3s.R.flushNeeded();}}

    public void setLayer(int layer) {try{__CLR4_5_221q21qlvlulc3s.R.inc(2782);
        __CLR4_5_221q21qlvlulc3s.R.inc(2783);this.layer = layer;
    }finally{__CLR4_5_221q21qlvlulc3s.R.flushNeeded();}}

    public void setAlternateGroup(int alternateGroup) {try{__CLR4_5_221q21qlvlulc3s.R.inc(2784);
        __CLR4_5_221q21qlvlulc3s.R.inc(2785);this.alternateGroup = alternateGroup;
    }finally{__CLR4_5_221q21qlvlulc3s.R.flushNeeded();}}

    public void setVolume(float volume) {try{__CLR4_5_221q21qlvlulc3s.R.inc(2786);
        __CLR4_5_221q21qlvlulc3s.R.inc(2787);this.volume = volume;
    }finally{__CLR4_5_221q21qlvlulc3s.R.flushNeeded();}}

    public void setMatrix(Matrix matrix) {try{__CLR4_5_221q21qlvlulc3s.R.inc(2788);
        __CLR4_5_221q21qlvlulc3s.R.inc(2789);this.matrix = matrix;
    }finally{__CLR4_5_221q21qlvlulc3s.R.flushNeeded();}}

    public void setWidth(double width) {try{__CLR4_5_221q21qlvlulc3s.R.inc(2790);
        __CLR4_5_221q21qlvlulc3s.R.inc(2791);this.width = width;
    }finally{__CLR4_5_221q21qlvlulc3s.R.flushNeeded();}}

    public void setHeight(double height) {try{__CLR4_5_221q21qlvlulc3s.R.inc(2792);
        __CLR4_5_221q21qlvlulc3s.R.inc(2793);this.height = height;
    }finally{__CLR4_5_221q21qlvlulc3s.R.flushNeeded();}}


    public boolean isEnabled() {try{__CLR4_5_221q21qlvlulc3s.R.inc(2794);
        __CLR4_5_221q21qlvlulc3s.R.inc(2795);return (getFlags() & 1) > 0;
    }finally{__CLR4_5_221q21qlvlulc3s.R.flushNeeded();}}

    public boolean isInMovie() {try{__CLR4_5_221q21qlvlulc3s.R.inc(2796);
        __CLR4_5_221q21qlvlulc3s.R.inc(2797);return (getFlags() & 2) > 0;
    }finally{__CLR4_5_221q21qlvlulc3s.R.flushNeeded();}}

    public boolean isInPreview() {try{__CLR4_5_221q21qlvlulc3s.R.inc(2798);
        __CLR4_5_221q21qlvlulc3s.R.inc(2799);return (getFlags() & 4) > 0;
    }finally{__CLR4_5_221q21qlvlulc3s.R.flushNeeded();}}

    public boolean isInPoster() {try{__CLR4_5_221q21qlvlulc3s.R.inc(2800);
        __CLR4_5_221q21qlvlulc3s.R.inc(2801);return (getFlags() & 8) > 0;
    }finally{__CLR4_5_221q21qlvlulc3s.R.flushNeeded();}}

    public void setEnabled(boolean enabled) {try{__CLR4_5_221q21qlvlulc3s.R.inc(2802);
        __CLR4_5_221q21qlvlulc3s.R.inc(2803);if ((((enabled)&&(__CLR4_5_221q21qlvlulc3s.R.iget(2804)!=0|true))||(__CLR4_5_221q21qlvlulc3s.R.iget(2805)==0&false))) {{
            __CLR4_5_221q21qlvlulc3s.R.inc(2806);setFlags(getFlags() | 1);
        } }else {{
            __CLR4_5_221q21qlvlulc3s.R.inc(2807);setFlags(getFlags() & ~1);
        }
    }}finally{__CLR4_5_221q21qlvlulc3s.R.flushNeeded();}}

    public void setInMovie(boolean inMovie) {try{__CLR4_5_221q21qlvlulc3s.R.inc(2808);
        __CLR4_5_221q21qlvlulc3s.R.inc(2809);if ((((inMovie)&&(__CLR4_5_221q21qlvlulc3s.R.iget(2810)!=0|true))||(__CLR4_5_221q21qlvlulc3s.R.iget(2811)==0&false))) {{
            __CLR4_5_221q21qlvlulc3s.R.inc(2812);setFlags(getFlags() | 2);
        } }else {{
            __CLR4_5_221q21qlvlulc3s.R.inc(2813);setFlags(getFlags() & ~2);
        }
    }}finally{__CLR4_5_221q21qlvlulc3s.R.flushNeeded();}}

    public void setInPreview(boolean inPreview) {try{__CLR4_5_221q21qlvlulc3s.R.inc(2814);
        __CLR4_5_221q21qlvlulc3s.R.inc(2815);if ((((inPreview)&&(__CLR4_5_221q21qlvlulc3s.R.iget(2816)!=0|true))||(__CLR4_5_221q21qlvlulc3s.R.iget(2817)==0&false))) {{
            __CLR4_5_221q21qlvlulc3s.R.inc(2818);setFlags(getFlags() | 4);
        } }else {{
            __CLR4_5_221q21qlvlulc3s.R.inc(2819);setFlags(getFlags() & ~4);
        }
    }}finally{__CLR4_5_221q21qlvlulc3s.R.flushNeeded();}}

    public void setInPoster(boolean inPoster) {try{__CLR4_5_221q21qlvlulc3s.R.inc(2820);
        __CLR4_5_221q21qlvlulc3s.R.inc(2821);if ((((inPoster)&&(__CLR4_5_221q21qlvlulc3s.R.iget(2822)!=0|true))||(__CLR4_5_221q21qlvlulc3s.R.iget(2823)==0&false))) {{
            __CLR4_5_221q21qlvlulc3s.R.inc(2824);setFlags(getFlags() | 8);
        } }else {{
            __CLR4_5_221q21qlvlulc3s.R.inc(2825);setFlags(getFlags() & ~8);
        }
    }}finally{__CLR4_5_221q21qlvlulc3s.R.flushNeeded();}}
}
