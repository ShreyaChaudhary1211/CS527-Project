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

import com.googlecode.mp4parser.AbstractContainerBox;

import java.util.List;

/**
 * <h1>4cc = "{@value #TYPE}"</h1>
 * Tracks are used for two purposes: (a) to contain media data (media tracks) and (b) to contain packetization
 * information for streaming protocols (hint tracks).  <br>
 * There shall be at least one media track within an ISO file, and all the media tracks that contributed to the hint
 * tracks shall remain in the file, even if the media data within them is not referenced by the hint tracks; after
 * deleting all hint tracks, the entire un-hinted presentation shall remain.
 */
public class TrackBox extends AbstractContainerBox {public static class __CLR4_5_220r20rlvlulc35{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,2654,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static final String TYPE = "trak";
    private SampleTableBox sampleTableBox;

    public TrackBox() {
        super(TYPE);__CLR4_5_220r20rlvlulc35.R.inc(2620);try{__CLR4_5_220r20rlvlulc35.R.inc(2619);
    }finally{__CLR4_5_220r20rlvlulc35.R.flushNeeded();}}

    public TrackHeaderBox getTrackHeaderBox() {try{__CLR4_5_220r20rlvlulc35.R.inc(2621);
        __CLR4_5_220r20rlvlulc35.R.inc(2622);for (Box box : getBoxes()) {{
            __CLR4_5_220r20rlvlulc35.R.inc(2623);if ((((box instanceof TrackHeaderBox)&&(__CLR4_5_220r20rlvlulc35.R.iget(2624)!=0|true))||(__CLR4_5_220r20rlvlulc35.R.iget(2625)==0&false))) {{
                __CLR4_5_220r20rlvlulc35.R.inc(2626);return (TrackHeaderBox) box;
            }
        }}
        }__CLR4_5_220r20rlvlulc35.R.inc(2627);return null;
    }finally{__CLR4_5_220r20rlvlulc35.R.flushNeeded();}}

    /**
     * Gets the SampleTableBox at mdia/minf/stbl if existing.
     *
     * @return the SampleTableBox or <code>null</code>
     */
    public SampleTableBox getSampleTableBox() {try{__CLR4_5_220r20rlvlulc35.R.inc(2628);
        __CLR4_5_220r20rlvlulc35.R.inc(2629);if ((((sampleTableBox != null)&&(__CLR4_5_220r20rlvlulc35.R.iget(2630)!=0|true))||(__CLR4_5_220r20rlvlulc35.R.iget(2631)==0&false))) {{
            __CLR4_5_220r20rlvlulc35.R.inc(2632);return sampleTableBox;
        }
        }__CLR4_5_220r20rlvlulc35.R.inc(2633);MediaBox mdia = getMediaBox();
        __CLR4_5_220r20rlvlulc35.R.inc(2634);if ((((mdia != null)&&(__CLR4_5_220r20rlvlulc35.R.iget(2635)!=0|true))||(__CLR4_5_220r20rlvlulc35.R.iget(2636)==0&false))) {{
            __CLR4_5_220r20rlvlulc35.R.inc(2637);MediaInformationBox minf = mdia.getMediaInformationBox();
            __CLR4_5_220r20rlvlulc35.R.inc(2638);if ((((minf != null)&&(__CLR4_5_220r20rlvlulc35.R.iget(2639)!=0|true))||(__CLR4_5_220r20rlvlulc35.R.iget(2640)==0&false))) {{
                __CLR4_5_220r20rlvlulc35.R.inc(2641);sampleTableBox = minf.getSampleTableBox();
                __CLR4_5_220r20rlvlulc35.R.inc(2642);return sampleTableBox;
            }
        }}
        }__CLR4_5_220r20rlvlulc35.R.inc(2643);return null;

    }finally{__CLR4_5_220r20rlvlulc35.R.flushNeeded();}}


    public MediaBox getMediaBox() {try{__CLR4_5_220r20rlvlulc35.R.inc(2644);
        __CLR4_5_220r20rlvlulc35.R.inc(2645);for (Box box : getBoxes()) {{
            __CLR4_5_220r20rlvlulc35.R.inc(2646);if ((((box instanceof MediaBox)&&(__CLR4_5_220r20rlvlulc35.R.iget(2647)!=0|true))||(__CLR4_5_220r20rlvlulc35.R.iget(2648)==0&false))) {{
                __CLR4_5_220r20rlvlulc35.R.inc(2649);return (MediaBox) box;
            }
        }}
        }__CLR4_5_220r20rlvlulc35.R.inc(2650);return null;
    }finally{__CLR4_5_220r20rlvlulc35.R.flushNeeded();}}

    @Override
    public void setBoxes(List<Box> boxes) {try{__CLR4_5_220r20rlvlulc35.R.inc(2651);
        __CLR4_5_220r20rlvlulc35.R.inc(2652);super.setBoxes(boxes);
        __CLR4_5_220r20rlvlulc35.R.inc(2653);sampleTableBox = null;
    }finally{__CLR4_5_220r20rlvlulc35.R.flushNeeded();}}

}
