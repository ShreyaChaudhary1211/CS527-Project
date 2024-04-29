/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2012 Sebastian Annies, Hamburg
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
package com.googlecode.mp4parser.authoring;

import com.googlecode.mp4parser.util.Matrix;

import java.util.Date;

/**
 *
 */
public class TrackMetaData implements Cloneable {public static class __CLR4_5_24jg4jglvl9egh5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,5932,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private String language = "eng";
    private long timescale;
    private Date modificationTime = new Date();
    private Date creationTime = new Date();
    private Matrix matrix = Matrix.ROTATE_0;
    private double width;
    private double height;
    private float volume;
    private long trackId = 1; // zero is not allowed
    private int group = 0;


    /**
     * specifies the front-to-back ordering of video tracks; tracks with lower
     * numbers are closer to the viewer. 0 is the normal value, and -1 would be
     * in front of track 0, and so on.
     */
    int layer;

    public String getLanguage() {try{__CLR4_5_24jg4jglvl9egh5.R.inc(5884);
        __CLR4_5_24jg4jglvl9egh5.R.inc(5885);return language;
    }finally{__CLR4_5_24jg4jglvl9egh5.R.flushNeeded();}}

    public void setLanguage(String language) {try{__CLR4_5_24jg4jglvl9egh5.R.inc(5886);
        __CLR4_5_24jg4jglvl9egh5.R.inc(5887);this.language = language;
    }finally{__CLR4_5_24jg4jglvl9egh5.R.flushNeeded();}}

    public long getTimescale() {try{__CLR4_5_24jg4jglvl9egh5.R.inc(5888);
        __CLR4_5_24jg4jglvl9egh5.R.inc(5889);return timescale;
    }finally{__CLR4_5_24jg4jglvl9egh5.R.flushNeeded();}}

    public void setTimescale(long timescale) {try{__CLR4_5_24jg4jglvl9egh5.R.inc(5890);
        __CLR4_5_24jg4jglvl9egh5.R.inc(5891);this.timescale = timescale;
    }finally{__CLR4_5_24jg4jglvl9egh5.R.flushNeeded();}}

    public Date getModificationTime() {try{__CLR4_5_24jg4jglvl9egh5.R.inc(5892);
        __CLR4_5_24jg4jglvl9egh5.R.inc(5893);return modificationTime;
    }finally{__CLR4_5_24jg4jglvl9egh5.R.flushNeeded();}}

    public void setModificationTime(Date modificationTime) {try{__CLR4_5_24jg4jglvl9egh5.R.inc(5894);
        __CLR4_5_24jg4jglvl9egh5.R.inc(5895);this.modificationTime = modificationTime;
    }finally{__CLR4_5_24jg4jglvl9egh5.R.flushNeeded();}}

    public Date getCreationTime() {try{__CLR4_5_24jg4jglvl9egh5.R.inc(5896);
        __CLR4_5_24jg4jglvl9egh5.R.inc(5897);return creationTime;
    }finally{__CLR4_5_24jg4jglvl9egh5.R.flushNeeded();}}

    public void setCreationTime(Date creationTime) {try{__CLR4_5_24jg4jglvl9egh5.R.inc(5898);
        __CLR4_5_24jg4jglvl9egh5.R.inc(5899);this.creationTime = creationTime;
    }finally{__CLR4_5_24jg4jglvl9egh5.R.flushNeeded();}}

    public double getWidth() {try{__CLR4_5_24jg4jglvl9egh5.R.inc(5900);
        __CLR4_5_24jg4jglvl9egh5.R.inc(5901);return width;
    }finally{__CLR4_5_24jg4jglvl9egh5.R.flushNeeded();}}

    public void setWidth(double width) {try{__CLR4_5_24jg4jglvl9egh5.R.inc(5902);
        __CLR4_5_24jg4jglvl9egh5.R.inc(5903);this.width = width;
    }finally{__CLR4_5_24jg4jglvl9egh5.R.flushNeeded();}}

    public double getHeight() {try{__CLR4_5_24jg4jglvl9egh5.R.inc(5904);
        __CLR4_5_24jg4jglvl9egh5.R.inc(5905);return height;
    }finally{__CLR4_5_24jg4jglvl9egh5.R.flushNeeded();}}

    public void setHeight(double height) {try{__CLR4_5_24jg4jglvl9egh5.R.inc(5906);
        __CLR4_5_24jg4jglvl9egh5.R.inc(5907);this.height = height;
    }finally{__CLR4_5_24jg4jglvl9egh5.R.flushNeeded();}}

    public long getTrackId() {try{__CLR4_5_24jg4jglvl9egh5.R.inc(5908);
        __CLR4_5_24jg4jglvl9egh5.R.inc(5909);return trackId;
    }finally{__CLR4_5_24jg4jglvl9egh5.R.flushNeeded();}}

    public void setTrackId(long trackId) {try{__CLR4_5_24jg4jglvl9egh5.R.inc(5910);
        __CLR4_5_24jg4jglvl9egh5.R.inc(5911);this.trackId = trackId;
    }finally{__CLR4_5_24jg4jglvl9egh5.R.flushNeeded();}}

    public int getLayer() {try{__CLR4_5_24jg4jglvl9egh5.R.inc(5912);
        __CLR4_5_24jg4jglvl9egh5.R.inc(5913);return layer;
    }finally{__CLR4_5_24jg4jglvl9egh5.R.flushNeeded();}}

    public void setLayer(int layer) {try{__CLR4_5_24jg4jglvl9egh5.R.inc(5914);
        __CLR4_5_24jg4jglvl9egh5.R.inc(5915);this.layer = layer;
    }finally{__CLR4_5_24jg4jglvl9egh5.R.flushNeeded();}}

    public float getVolume() {try{__CLR4_5_24jg4jglvl9egh5.R.inc(5916);
        __CLR4_5_24jg4jglvl9egh5.R.inc(5917);return volume;
    }finally{__CLR4_5_24jg4jglvl9egh5.R.flushNeeded();}}

    public void setVolume(float volume) {try{__CLR4_5_24jg4jglvl9egh5.R.inc(5918);
        __CLR4_5_24jg4jglvl9egh5.R.inc(5919);this.volume = volume;
    }finally{__CLR4_5_24jg4jglvl9egh5.R.flushNeeded();}}

    public int getGroup() {try{__CLR4_5_24jg4jglvl9egh5.R.inc(5920);
        __CLR4_5_24jg4jglvl9egh5.R.inc(5921);return group;
    }finally{__CLR4_5_24jg4jglvl9egh5.R.flushNeeded();}}

    public void setGroup(int group) {try{__CLR4_5_24jg4jglvl9egh5.R.inc(5922);
        __CLR4_5_24jg4jglvl9egh5.R.inc(5923);this.group = group;
    }finally{__CLR4_5_24jg4jglvl9egh5.R.flushNeeded();}}

    public Matrix getMatrix() {try{__CLR4_5_24jg4jglvl9egh5.R.inc(5924);
        __CLR4_5_24jg4jglvl9egh5.R.inc(5925);return matrix;
    }finally{__CLR4_5_24jg4jglvl9egh5.R.flushNeeded();}}

    public void setMatrix(Matrix matrix) {try{__CLR4_5_24jg4jglvl9egh5.R.inc(5926);
        __CLR4_5_24jg4jglvl9egh5.R.inc(5927);this.matrix = matrix;
    }finally{__CLR4_5_24jg4jglvl9egh5.R.flushNeeded();}}

    public Object clone() {try{__CLR4_5_24jg4jglvl9egh5.R.inc(5928);
        __CLR4_5_24jg4jglvl9egh5.R.inc(5929);try {
            __CLR4_5_24jg4jglvl9egh5.R.inc(5930);return super.clone();
        } catch (CloneNotSupportedException e) {
            __CLR4_5_24jg4jglvl9egh5.R.inc(5931);return null;
        }
    }finally{__CLR4_5_24jg4jglvl9egh5.R.flushNeeded();}}

}
