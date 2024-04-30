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

import java.util.LinkedList;
import java.util.List;

/**
 *
 */
public class Movie {public static class __CLR4_5_24bq4bqlvluld9b{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,5654,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    Matrix matrix = Matrix.ROTATE_0;

    public Movie() {try{__CLR4_5_24bq4bqlvluld9b.R.inc(5606);
    }finally{__CLR4_5_24bq4bqlvluld9b.R.flushNeeded();}}

    public Movie(List<Track> tracks) {try{__CLR4_5_24bq4bqlvluld9b.R.inc(5607);
        __CLR4_5_24bq4bqlvluld9b.R.inc(5608);this.tracks = tracks;
    }finally{__CLR4_5_24bq4bqlvluld9b.R.flushNeeded();}}

    List<Track> tracks = new LinkedList<Track>();

    public List<Track> getTracks() {try{__CLR4_5_24bq4bqlvluld9b.R.inc(5609);
        __CLR4_5_24bq4bqlvluld9b.R.inc(5610);return tracks;
    }finally{__CLR4_5_24bq4bqlvluld9b.R.flushNeeded();}}

    public void setTracks(List<Track> tracks) {try{__CLR4_5_24bq4bqlvluld9b.R.inc(5611);
        __CLR4_5_24bq4bqlvluld9b.R.inc(5612);this.tracks = tracks;
    }finally{__CLR4_5_24bq4bqlvluld9b.R.flushNeeded();}}

    public void addTrack(Track nuTrack) {try{__CLR4_5_24bq4bqlvluld9b.R.inc(5613);
        // do some checking
        // perhaps the movie needs to get longer!
        __CLR4_5_24bq4bqlvluld9b.R.inc(5614);if ((((getTrackByTrackId(nuTrack.getTrackMetaData().getTrackId()) != null)&&(__CLR4_5_24bq4bqlvluld9b.R.iget(5615)!=0|true))||(__CLR4_5_24bq4bqlvluld9b.R.iget(5616)==0&false))) {{
            // We already have a track with that trackId. Create a new one
            __CLR4_5_24bq4bqlvluld9b.R.inc(5617);nuTrack.getTrackMetaData().setTrackId(getNextTrackId());
        }
        }__CLR4_5_24bq4bqlvluld9b.R.inc(5618);tracks.add(nuTrack);
    }finally{__CLR4_5_24bq4bqlvluld9b.R.flushNeeded();}}


    @Override
    public String toString() {try{__CLR4_5_24bq4bqlvluld9b.R.inc(5619);
        __CLR4_5_24bq4bqlvluld9b.R.inc(5620);String s = "Movie{ ";
        __CLR4_5_24bq4bqlvluld9b.R.inc(5621);for (Track track : tracks) {{
            __CLR4_5_24bq4bqlvluld9b.R.inc(5622);s += "track_" + track.getTrackMetaData().getTrackId() + " (" + track.getHandler() + ") ";
        }

        }__CLR4_5_24bq4bqlvluld9b.R.inc(5623);s += '}';
        __CLR4_5_24bq4bqlvluld9b.R.inc(5624);return s;
    }finally{__CLR4_5_24bq4bqlvluld9b.R.flushNeeded();}}

    public long getNextTrackId() {try{__CLR4_5_24bq4bqlvluld9b.R.inc(5625);
        __CLR4_5_24bq4bqlvluld9b.R.inc(5626);long nextTrackId = 0;
        __CLR4_5_24bq4bqlvluld9b.R.inc(5627);for (Track track : tracks) {{
            __CLR4_5_24bq4bqlvluld9b.R.inc(5628);nextTrackId = (((nextTrackId < track.getTrackMetaData().getTrackId() )&&(__CLR4_5_24bq4bqlvluld9b.R.iget(5629)!=0|true))||(__CLR4_5_24bq4bqlvluld9b.R.iget(5630)==0&false))? track.getTrackMetaData().getTrackId() : nextTrackId;
        }
        }__CLR4_5_24bq4bqlvluld9b.R.inc(5631);return ++nextTrackId;
    }finally{__CLR4_5_24bq4bqlvluld9b.R.flushNeeded();}}


    public Track getTrackByTrackId(long trackId) {try{__CLR4_5_24bq4bqlvluld9b.R.inc(5632);
        __CLR4_5_24bq4bqlvluld9b.R.inc(5633);for (Track track : tracks) {{
            __CLR4_5_24bq4bqlvluld9b.R.inc(5634);if ((((track.getTrackMetaData().getTrackId() == trackId)&&(__CLR4_5_24bq4bqlvluld9b.R.iget(5635)!=0|true))||(__CLR4_5_24bq4bqlvluld9b.R.iget(5636)==0&false))) {{
                __CLR4_5_24bq4bqlvluld9b.R.inc(5637);return track;
            }
        }}
        }__CLR4_5_24bq4bqlvluld9b.R.inc(5638);return null;
    }finally{__CLR4_5_24bq4bqlvluld9b.R.flushNeeded();}}


    public long getTimescale() {try{__CLR4_5_24bq4bqlvluld9b.R.inc(5639);
        __CLR4_5_24bq4bqlvluld9b.R.inc(5640);long timescale = this.getTracks().iterator().next().getTrackMetaData().getTimescale();
        __CLR4_5_24bq4bqlvluld9b.R.inc(5641);for (Track track : this.getTracks()) {{
            __CLR4_5_24bq4bqlvluld9b.R.inc(5642);timescale = gcd(track.getTrackMetaData().getTimescale(), timescale);
        }
        }__CLR4_5_24bq4bqlvluld9b.R.inc(5643);return timescale;
    }finally{__CLR4_5_24bq4bqlvluld9b.R.flushNeeded();}}

    public Matrix getMatrix() {try{__CLR4_5_24bq4bqlvluld9b.R.inc(5644);
        __CLR4_5_24bq4bqlvluld9b.R.inc(5645);return matrix;
    }finally{__CLR4_5_24bq4bqlvluld9b.R.flushNeeded();}}

    public void setMatrix(Matrix matrix) {try{__CLR4_5_24bq4bqlvluld9b.R.inc(5646);
        __CLR4_5_24bq4bqlvluld9b.R.inc(5647);this.matrix = matrix;
    }finally{__CLR4_5_24bq4bqlvluld9b.R.flushNeeded();}}

    public static long gcd(long a, long b) {try{__CLR4_5_24bq4bqlvluld9b.R.inc(5648);
        __CLR4_5_24bq4bqlvluld9b.R.inc(5649);if ((((b == 0)&&(__CLR4_5_24bq4bqlvluld9b.R.iget(5650)!=0|true))||(__CLR4_5_24bq4bqlvluld9b.R.iget(5651)==0&false))) {{
            __CLR4_5_24bq4bqlvluld9b.R.inc(5652);return a;
        }
        }__CLR4_5_24bq4bqlvluld9b.R.inc(5653);return gcd(b, a % b);
    }finally{__CLR4_5_24bq4bqlvluld9b.R.flushNeeded();}}

}
