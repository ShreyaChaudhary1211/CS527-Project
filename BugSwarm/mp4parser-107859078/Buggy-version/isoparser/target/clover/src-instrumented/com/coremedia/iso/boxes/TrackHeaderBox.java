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
public class TrackHeaderBox extends AbstractFullBox {public static class __CLR4_5_221b21blvl9efcc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,2811,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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
        super(TYPE);__CLR4_5_221b21blvl9efcc.R.inc(2640);try{__CLR4_5_221b21blvl9efcc.R.inc(2639);

    }finally{__CLR4_5_221b21blvl9efcc.R.flushNeeded();}}

    public Date getCreationTime() {try{__CLR4_5_221b21blvl9efcc.R.inc(2641);
        __CLR4_5_221b21blvl9efcc.R.inc(2642);return creationTime;
    }finally{__CLR4_5_221b21blvl9efcc.R.flushNeeded();}}

    public Date getModificationTime() {try{__CLR4_5_221b21blvl9efcc.R.inc(2643);
        __CLR4_5_221b21blvl9efcc.R.inc(2644);return modificationTime;
    }finally{__CLR4_5_221b21blvl9efcc.R.flushNeeded();}}

    public long getTrackId() {try{__CLR4_5_221b21blvl9efcc.R.inc(2645);
        __CLR4_5_221b21blvl9efcc.R.inc(2646);return trackId;
    }finally{__CLR4_5_221b21blvl9efcc.R.flushNeeded();}}

    public long getDuration() {try{__CLR4_5_221b21blvl9efcc.R.inc(2647);
        __CLR4_5_221b21blvl9efcc.R.inc(2648);return duration;
    }finally{__CLR4_5_221b21blvl9efcc.R.flushNeeded();}}

    public int getLayer() {try{__CLR4_5_221b21blvl9efcc.R.inc(2649);
        __CLR4_5_221b21blvl9efcc.R.inc(2650);return layer;
    }finally{__CLR4_5_221b21blvl9efcc.R.flushNeeded();}}

    public int getAlternateGroup() {try{__CLR4_5_221b21blvl9efcc.R.inc(2651);
        __CLR4_5_221b21blvl9efcc.R.inc(2652);return alternateGroup;
    }finally{__CLR4_5_221b21blvl9efcc.R.flushNeeded();}}

    public float getVolume() {try{__CLR4_5_221b21blvl9efcc.R.inc(2653);
        __CLR4_5_221b21blvl9efcc.R.inc(2654);return volume;
    }finally{__CLR4_5_221b21blvl9efcc.R.flushNeeded();}}

    public Matrix getMatrix() {try{__CLR4_5_221b21blvl9efcc.R.inc(2655);
        __CLR4_5_221b21blvl9efcc.R.inc(2656);return matrix;
    }finally{__CLR4_5_221b21blvl9efcc.R.flushNeeded();}}

    public double getWidth() {try{__CLR4_5_221b21blvl9efcc.R.inc(2657);
        __CLR4_5_221b21blvl9efcc.R.inc(2658);return width;
    }finally{__CLR4_5_221b21blvl9efcc.R.flushNeeded();}}

    public double getHeight() {try{__CLR4_5_221b21blvl9efcc.R.inc(2659);
        __CLR4_5_221b21blvl9efcc.R.inc(2660);return height;
    }finally{__CLR4_5_221b21blvl9efcc.R.flushNeeded();}}

    protected long getContentSize() {try{__CLR4_5_221b21blvl9efcc.R.inc(2661);
        __CLR4_5_221b21blvl9efcc.R.inc(2662);long contentSize = 4;
        __CLR4_5_221b21blvl9efcc.R.inc(2663);if ((((getVersion() == 1)&&(__CLR4_5_221b21blvl9efcc.R.iget(2664)!=0|true))||(__CLR4_5_221b21blvl9efcc.R.iget(2665)==0&false))) {{
            __CLR4_5_221b21blvl9efcc.R.inc(2666);contentSize += 32;
        } }else {{
            __CLR4_5_221b21blvl9efcc.R.inc(2667);contentSize += 20;
        }
        }__CLR4_5_221b21blvl9efcc.R.inc(2668);contentSize += 60;
        __CLR4_5_221b21blvl9efcc.R.inc(2669);return contentSize;
    }finally{__CLR4_5_221b21blvl9efcc.R.flushNeeded();}}

    @Override
    public void _parseDetails(ByteBuffer content) {try{__CLR4_5_221b21blvl9efcc.R.inc(2670);
        __CLR4_5_221b21blvl9efcc.R.inc(2671);parseVersionAndFlags(content);
        __CLR4_5_221b21blvl9efcc.R.inc(2672);if ((((getVersion() == 1)&&(__CLR4_5_221b21blvl9efcc.R.iget(2673)!=0|true))||(__CLR4_5_221b21blvl9efcc.R.iget(2674)==0&false))) {{
            __CLR4_5_221b21blvl9efcc.R.inc(2675);creationTime = DateHelper.convert(IsoTypeReader.readUInt64(content));
            __CLR4_5_221b21blvl9efcc.R.inc(2676);modificationTime = DateHelper.convert(IsoTypeReader.readUInt64(content));
            __CLR4_5_221b21blvl9efcc.R.inc(2677);trackId = IsoTypeReader.readUInt32(content);
            __CLR4_5_221b21blvl9efcc.R.inc(2678);IsoTypeReader.readUInt32(content);
            __CLR4_5_221b21blvl9efcc.R.inc(2679);duration = content.getLong();
        } }else {{
            __CLR4_5_221b21blvl9efcc.R.inc(2680);creationTime = DateHelper.convert(IsoTypeReader.readUInt32(content));
            __CLR4_5_221b21blvl9efcc.R.inc(2681);modificationTime = DateHelper.convert(IsoTypeReader.readUInt32(content));
            __CLR4_5_221b21blvl9efcc.R.inc(2682);trackId = IsoTypeReader.readUInt32(content);
            __CLR4_5_221b21blvl9efcc.R.inc(2683);IsoTypeReader.readUInt32(content);
            __CLR4_5_221b21blvl9efcc.R.inc(2684);duration = content.getInt();
        } // 196

        }__CLR4_5_221b21blvl9efcc.R.inc(2685);if ((((duration < -1)&&(__CLR4_5_221b21blvl9efcc.R.iget(2686)!=0|true))||(__CLR4_5_221b21blvl9efcc.R.iget(2687)==0&false))) {{
            __CLR4_5_221b21blvl9efcc.R.inc(2688);LOG.logWarn("tkhd duration is not in expected range");
        }

        }__CLR4_5_221b21blvl9efcc.R.inc(2689);IsoTypeReader.readUInt32(content);
        __CLR4_5_221b21blvl9efcc.R.inc(2690);IsoTypeReader.readUInt32(content);
        __CLR4_5_221b21blvl9efcc.R.inc(2691);layer = IsoTypeReader.readUInt16(content);    // 204
        __CLR4_5_221b21blvl9efcc.R.inc(2692);alternateGroup = IsoTypeReader.readUInt16(content);
        __CLR4_5_221b21blvl9efcc.R.inc(2693);volume = IsoTypeReader.readFixedPoint88(content);
        __CLR4_5_221b21blvl9efcc.R.inc(2694);IsoTypeReader.readUInt16(content);     // 212
        __CLR4_5_221b21blvl9efcc.R.inc(2695);matrix = Matrix.fromByteBuffer(content);
        __CLR4_5_221b21blvl9efcc.R.inc(2696);width = IsoTypeReader.readFixedPoint1616(content);    // 248
        __CLR4_5_221b21blvl9efcc.R.inc(2697);height = IsoTypeReader.readFixedPoint1616(content);
    }finally{__CLR4_5_221b21blvl9efcc.R.flushNeeded();}}

    public void getContent(ByteBuffer byteBuffer) {try{__CLR4_5_221b21blvl9efcc.R.inc(2698);
        __CLR4_5_221b21blvl9efcc.R.inc(2699);writeVersionAndFlags(byteBuffer);
        __CLR4_5_221b21blvl9efcc.R.inc(2700);if ((((getVersion() == 1)&&(__CLR4_5_221b21blvl9efcc.R.iget(2701)!=0|true))||(__CLR4_5_221b21blvl9efcc.R.iget(2702)==0&false))) {{
            __CLR4_5_221b21blvl9efcc.R.inc(2703);IsoTypeWriter.writeUInt64(byteBuffer, DateHelper.convert(creationTime));
            __CLR4_5_221b21blvl9efcc.R.inc(2704);IsoTypeWriter.writeUInt64(byteBuffer, DateHelper.convert(modificationTime));
            __CLR4_5_221b21blvl9efcc.R.inc(2705);IsoTypeWriter.writeUInt32(byteBuffer, trackId);
            __CLR4_5_221b21blvl9efcc.R.inc(2706);IsoTypeWriter.writeUInt32(byteBuffer, 0);
            __CLR4_5_221b21blvl9efcc.R.inc(2707);byteBuffer.putLong(duration);
        } }else {{
            __CLR4_5_221b21blvl9efcc.R.inc(2708);IsoTypeWriter.writeUInt32(byteBuffer, DateHelper.convert(creationTime));
            __CLR4_5_221b21blvl9efcc.R.inc(2709);IsoTypeWriter.writeUInt32(byteBuffer, DateHelper.convert(modificationTime));
            __CLR4_5_221b21blvl9efcc.R.inc(2710);IsoTypeWriter.writeUInt32(byteBuffer, trackId);
            __CLR4_5_221b21blvl9efcc.R.inc(2711);IsoTypeWriter.writeUInt32(byteBuffer, 0);
            __CLR4_5_221b21blvl9efcc.R.inc(2712);byteBuffer.putInt((int) duration);
        } // 196
        }__CLR4_5_221b21blvl9efcc.R.inc(2713);IsoTypeWriter.writeUInt32(byteBuffer, 0);
        __CLR4_5_221b21blvl9efcc.R.inc(2714);IsoTypeWriter.writeUInt32(byteBuffer, 0);
        __CLR4_5_221b21blvl9efcc.R.inc(2715);IsoTypeWriter.writeUInt16(byteBuffer, layer);
        __CLR4_5_221b21blvl9efcc.R.inc(2716);IsoTypeWriter.writeUInt16(byteBuffer, alternateGroup);
        __CLR4_5_221b21blvl9efcc.R.inc(2717);IsoTypeWriter.writeFixedPoint88(byteBuffer, volume);
        __CLR4_5_221b21blvl9efcc.R.inc(2718);IsoTypeWriter.writeUInt16(byteBuffer, 0);
        __CLR4_5_221b21blvl9efcc.R.inc(2719);int i = 0;
        __CLR4_5_221b21blvl9efcc.R.inc(2720);matrix.getContent(byteBuffer);

        __CLR4_5_221b21blvl9efcc.R.inc(2721);IsoTypeWriter.writeFixedPoint1616(byteBuffer, width);
        __CLR4_5_221b21blvl9efcc.R.inc(2722);IsoTypeWriter.writeFixedPoint1616(byteBuffer, height);
    }finally{__CLR4_5_221b21blvl9efcc.R.flushNeeded();}}

    public String toString() {try{__CLR4_5_221b21blvl9efcc.R.inc(2723);
        __CLR4_5_221b21blvl9efcc.R.inc(2724);StringBuilder result = new StringBuilder();
        __CLR4_5_221b21blvl9efcc.R.inc(2725);result.append("TrackHeaderBox[");
        __CLR4_5_221b21blvl9efcc.R.inc(2726);result.append("creationTime=").append(getCreationTime());
        __CLR4_5_221b21blvl9efcc.R.inc(2727);result.append(";");
        __CLR4_5_221b21blvl9efcc.R.inc(2728);result.append("modificationTime=").append(getModificationTime());
        __CLR4_5_221b21blvl9efcc.R.inc(2729);result.append(";");
        __CLR4_5_221b21blvl9efcc.R.inc(2730);result.append("trackId=").append(getTrackId());
        __CLR4_5_221b21blvl9efcc.R.inc(2731);result.append(";");
        __CLR4_5_221b21blvl9efcc.R.inc(2732);result.append("duration=").append(getDuration());
        __CLR4_5_221b21blvl9efcc.R.inc(2733);result.append(";");
        __CLR4_5_221b21blvl9efcc.R.inc(2734);result.append("layer=").append(getLayer());
        __CLR4_5_221b21blvl9efcc.R.inc(2735);result.append(";");
        __CLR4_5_221b21blvl9efcc.R.inc(2736);result.append("alternateGroup=").append(getAlternateGroup());
        __CLR4_5_221b21blvl9efcc.R.inc(2737);result.append(";");
        __CLR4_5_221b21blvl9efcc.R.inc(2738);result.append("volume=").append(getVolume());
        __CLR4_5_221b21blvl9efcc.R.inc(2739);result.append(";");
        __CLR4_5_221b21blvl9efcc.R.inc(2740);result.append("matrix=").append(matrix);
        __CLR4_5_221b21blvl9efcc.R.inc(2741);result.append(";");
        __CLR4_5_221b21blvl9efcc.R.inc(2742);result.append("width=").append(getWidth());
        __CLR4_5_221b21blvl9efcc.R.inc(2743);result.append(";");
        __CLR4_5_221b21blvl9efcc.R.inc(2744);result.append("height=").append(getHeight());
        __CLR4_5_221b21blvl9efcc.R.inc(2745);result.append("]");
        __CLR4_5_221b21blvl9efcc.R.inc(2746);return result.toString();
    }finally{__CLR4_5_221b21blvl9efcc.R.flushNeeded();}}

    public void setCreationTime(Date creationTime) {try{__CLR4_5_221b21blvl9efcc.R.inc(2747);
        __CLR4_5_221b21blvl9efcc.R.inc(2748);this.creationTime = creationTime;
        __CLR4_5_221b21blvl9efcc.R.inc(2749);if ((((DateHelper.convert(creationTime) >= (1l << 32))&&(__CLR4_5_221b21blvl9efcc.R.iget(2750)!=0|true))||(__CLR4_5_221b21blvl9efcc.R.iget(2751)==0&false))) {{
            __CLR4_5_221b21blvl9efcc.R.inc(2752);setVersion(1);
        }
    }}finally{__CLR4_5_221b21blvl9efcc.R.flushNeeded();}}

    public void setModificationTime(Date modificationTime) {try{__CLR4_5_221b21blvl9efcc.R.inc(2753);
        __CLR4_5_221b21blvl9efcc.R.inc(2754);this.modificationTime = modificationTime;
        __CLR4_5_221b21blvl9efcc.R.inc(2755);if ((((DateHelper.convert(modificationTime) >= (1l << 32))&&(__CLR4_5_221b21blvl9efcc.R.iget(2756)!=0|true))||(__CLR4_5_221b21blvl9efcc.R.iget(2757)==0&false))) {{
            __CLR4_5_221b21blvl9efcc.R.inc(2758);setVersion(1);
        }

    }}finally{__CLR4_5_221b21blvl9efcc.R.flushNeeded();}}

    public void setTrackId(long trackId) {try{__CLR4_5_221b21blvl9efcc.R.inc(2759);
        __CLR4_5_221b21blvl9efcc.R.inc(2760);this.trackId = trackId;
    }finally{__CLR4_5_221b21blvl9efcc.R.flushNeeded();}}

    public void setDuration(long duration) {try{__CLR4_5_221b21blvl9efcc.R.inc(2761);
        __CLR4_5_221b21blvl9efcc.R.inc(2762);this.duration = duration;
        __CLR4_5_221b21blvl9efcc.R.inc(2763);if ((((duration >= (1l << 32))&&(__CLR4_5_221b21blvl9efcc.R.iget(2764)!=0|true))||(__CLR4_5_221b21blvl9efcc.R.iget(2765)==0&false))) {{
            __CLR4_5_221b21blvl9efcc.R.inc(2766);setFlags(1);
        }
    }}finally{__CLR4_5_221b21blvl9efcc.R.flushNeeded();}}

    public void setLayer(int layer) {try{__CLR4_5_221b21blvl9efcc.R.inc(2767);
        __CLR4_5_221b21blvl9efcc.R.inc(2768);this.layer = layer;
    }finally{__CLR4_5_221b21blvl9efcc.R.flushNeeded();}}

    public void setAlternateGroup(int alternateGroup) {try{__CLR4_5_221b21blvl9efcc.R.inc(2769);
        __CLR4_5_221b21blvl9efcc.R.inc(2770);this.alternateGroup = alternateGroup;
    }finally{__CLR4_5_221b21blvl9efcc.R.flushNeeded();}}

    public void setVolume(float volume) {try{__CLR4_5_221b21blvl9efcc.R.inc(2771);
        __CLR4_5_221b21blvl9efcc.R.inc(2772);this.volume = volume;
    }finally{__CLR4_5_221b21blvl9efcc.R.flushNeeded();}}

    public void setMatrix(Matrix matrix) {try{__CLR4_5_221b21blvl9efcc.R.inc(2773);
        __CLR4_5_221b21blvl9efcc.R.inc(2774);this.matrix = matrix;
    }finally{__CLR4_5_221b21blvl9efcc.R.flushNeeded();}}

    public void setWidth(double width) {try{__CLR4_5_221b21blvl9efcc.R.inc(2775);
        __CLR4_5_221b21blvl9efcc.R.inc(2776);this.width = width;
    }finally{__CLR4_5_221b21blvl9efcc.R.flushNeeded();}}

    public void setHeight(double height) {try{__CLR4_5_221b21blvl9efcc.R.inc(2777);
        __CLR4_5_221b21blvl9efcc.R.inc(2778);this.height = height;
    }finally{__CLR4_5_221b21blvl9efcc.R.flushNeeded();}}


    public boolean isEnabled() {try{__CLR4_5_221b21blvl9efcc.R.inc(2779);
        __CLR4_5_221b21blvl9efcc.R.inc(2780);return (getFlags() & 1) > 0;
    }finally{__CLR4_5_221b21blvl9efcc.R.flushNeeded();}}

    public boolean isInMovie() {try{__CLR4_5_221b21blvl9efcc.R.inc(2781);
        __CLR4_5_221b21blvl9efcc.R.inc(2782);return (getFlags() & 2) > 0;
    }finally{__CLR4_5_221b21blvl9efcc.R.flushNeeded();}}

    public boolean isInPreview() {try{__CLR4_5_221b21blvl9efcc.R.inc(2783);
        __CLR4_5_221b21blvl9efcc.R.inc(2784);return (getFlags() & 4) > 0;
    }finally{__CLR4_5_221b21blvl9efcc.R.flushNeeded();}}

    public boolean isInPoster() {try{__CLR4_5_221b21blvl9efcc.R.inc(2785);
        __CLR4_5_221b21blvl9efcc.R.inc(2786);return (getFlags() & 8) > 0;
    }finally{__CLR4_5_221b21blvl9efcc.R.flushNeeded();}}

    public void setEnabled(boolean enabled) {try{__CLR4_5_221b21blvl9efcc.R.inc(2787);
        __CLR4_5_221b21blvl9efcc.R.inc(2788);if ((((enabled)&&(__CLR4_5_221b21blvl9efcc.R.iget(2789)!=0|true))||(__CLR4_5_221b21blvl9efcc.R.iget(2790)==0&false))) {{
            __CLR4_5_221b21blvl9efcc.R.inc(2791);setFlags(getFlags() | 1);
        } }else {{
            __CLR4_5_221b21blvl9efcc.R.inc(2792);setFlags(getFlags() & ~1);
        }
    }}finally{__CLR4_5_221b21blvl9efcc.R.flushNeeded();}}

    public void setInMovie(boolean inMovie) {try{__CLR4_5_221b21blvl9efcc.R.inc(2793);
        __CLR4_5_221b21blvl9efcc.R.inc(2794);if ((((inMovie)&&(__CLR4_5_221b21blvl9efcc.R.iget(2795)!=0|true))||(__CLR4_5_221b21blvl9efcc.R.iget(2796)==0&false))) {{
            __CLR4_5_221b21blvl9efcc.R.inc(2797);setFlags(getFlags() | 2);
        } }else {{
            __CLR4_5_221b21blvl9efcc.R.inc(2798);setFlags(getFlags() & ~2);
        }
    }}finally{__CLR4_5_221b21blvl9efcc.R.flushNeeded();}}

    public void setInPreview(boolean inPreview) {try{__CLR4_5_221b21blvl9efcc.R.inc(2799);
        __CLR4_5_221b21blvl9efcc.R.inc(2800);if ((((inPreview)&&(__CLR4_5_221b21blvl9efcc.R.iget(2801)!=0|true))||(__CLR4_5_221b21blvl9efcc.R.iget(2802)==0&false))) {{
            __CLR4_5_221b21blvl9efcc.R.inc(2803);setFlags(getFlags() | 4);
        } }else {{
            __CLR4_5_221b21blvl9efcc.R.inc(2804);setFlags(getFlags() & ~4);
        }
    }}finally{__CLR4_5_221b21blvl9efcc.R.flushNeeded();}}

    public void setInPoster(boolean inPoster) {try{__CLR4_5_221b21blvl9efcc.R.inc(2805);
        __CLR4_5_221b21blvl9efcc.R.inc(2806);if ((((inPoster)&&(__CLR4_5_221b21blvl9efcc.R.iget(2807)!=0|true))||(__CLR4_5_221b21blvl9efcc.R.iget(2808)==0&false))) {{
            __CLR4_5_221b21blvl9efcc.R.inc(2809);setFlags(getFlags() | 8);
        } }else {{
            __CLR4_5_221b21blvl9efcc.R.inc(2810);setFlags(getFlags() & ~8);
        }
    }}finally{__CLR4_5_221b21blvl9efcc.R.flushNeeded();}}
}
