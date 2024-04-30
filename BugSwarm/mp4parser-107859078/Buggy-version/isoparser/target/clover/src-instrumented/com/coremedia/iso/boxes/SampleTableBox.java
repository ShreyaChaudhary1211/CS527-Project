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

/**
 * <h1>4cc = "{@value #TYPE}"</h1>
 * The sample table contains all the time and data indexing of the media samples in a track. Using the tables
 * here, it is possible to locate samples in time, determine their type (e.g. I-frame or not), and determine their
 * size, container, and offset into that container.  <br>
 * If the track that contains the Sample Table Box references no data, then the Sample Table Box does not need
 * to contain any sub-boxes (this is not a very useful media track).                                          <br>
 * If the track that the Sample Table Box is contained in does reference data, then the following sub-boxes are
 * required: Sample Description, Sample Size, Sample To Chunk, and Chunk Offset. Further, the Sample
 * Description Box shall contain at least one entry. A Sample Description Box is required because it contains the
 * data reference index field which indicates which Data Reference Box to use to retrieve the media samples.
 * Without the Sample Description, it is not possible to determine where the media samples are stored. The Sync
 * Sample Box is optional. If the Sync Sample Box is not present, all samples are sync samples.<br>
 * Annex A provides a narrative description of random access using the structures defined in the Sample Table
 * Box.
 */
public class SampleTableBox extends AbstractContainerBox {public static class __CLR4_5_21o41o4lvl9ef5o{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,2227,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static final String TYPE = "stbl";
    private SampleToChunkBox sampleToChunkBox;

    public SampleTableBox() {
        super(TYPE);__CLR4_5_21o41o4lvl9ef5o.R.inc(2165);try{__CLR4_5_21o41o4lvl9ef5o.R.inc(2164);
    }finally{__CLR4_5_21o41o4lvl9ef5o.R.flushNeeded();}}

    public SampleDescriptionBox getSampleDescriptionBox() {try{__CLR4_5_21o41o4lvl9ef5o.R.inc(2166);
        __CLR4_5_21o41o4lvl9ef5o.R.inc(2167);for (Box box : getBoxes()) {{
            __CLR4_5_21o41o4lvl9ef5o.R.inc(2168);if ((((box instanceof SampleDescriptionBox)&&(__CLR4_5_21o41o4lvl9ef5o.R.iget(2169)!=0|true))||(__CLR4_5_21o41o4lvl9ef5o.R.iget(2170)==0&false))) {{
                __CLR4_5_21o41o4lvl9ef5o.R.inc(2171);return (SampleDescriptionBox) box;
            }
        }}
        }__CLR4_5_21o41o4lvl9ef5o.R.inc(2172);return null;
    }finally{__CLR4_5_21o41o4lvl9ef5o.R.flushNeeded();}}

    public SampleSizeBox getSampleSizeBox() {try{__CLR4_5_21o41o4lvl9ef5o.R.inc(2173);
        __CLR4_5_21o41o4lvl9ef5o.R.inc(2174);for (Box box : getBoxes()) {{
            __CLR4_5_21o41o4lvl9ef5o.R.inc(2175);if ((((box instanceof SampleSizeBox)&&(__CLR4_5_21o41o4lvl9ef5o.R.iget(2176)!=0|true))||(__CLR4_5_21o41o4lvl9ef5o.R.iget(2177)==0&false))) {{
                __CLR4_5_21o41o4lvl9ef5o.R.inc(2178);return (SampleSizeBox) box;
            }
        }}
        }__CLR4_5_21o41o4lvl9ef5o.R.inc(2179);return null;
    }finally{__CLR4_5_21o41o4lvl9ef5o.R.flushNeeded();}}

    public SampleToChunkBox getSampleToChunkBox() {try{__CLR4_5_21o41o4lvl9ef5o.R.inc(2180);
        __CLR4_5_21o41o4lvl9ef5o.R.inc(2181);if ((((sampleToChunkBox != null)&&(__CLR4_5_21o41o4lvl9ef5o.R.iget(2182)!=0|true))||(__CLR4_5_21o41o4lvl9ef5o.R.iget(2183)==0&false))) {{
            __CLR4_5_21o41o4lvl9ef5o.R.inc(2184);return sampleToChunkBox;
        }
        }__CLR4_5_21o41o4lvl9ef5o.R.inc(2185);for (Box box : getBoxes()) {{
            __CLR4_5_21o41o4lvl9ef5o.R.inc(2186);if ((((box instanceof SampleToChunkBox)&&(__CLR4_5_21o41o4lvl9ef5o.R.iget(2187)!=0|true))||(__CLR4_5_21o41o4lvl9ef5o.R.iget(2188)==0&false))) {{
                __CLR4_5_21o41o4lvl9ef5o.R.inc(2189);sampleToChunkBox = (SampleToChunkBox) box;
                __CLR4_5_21o41o4lvl9ef5o.R.inc(2190);return sampleToChunkBox;
            }
        }}
        }__CLR4_5_21o41o4lvl9ef5o.R.inc(2191);return null;
    }finally{__CLR4_5_21o41o4lvl9ef5o.R.flushNeeded();}}

    public ChunkOffsetBox getChunkOffsetBox() {try{__CLR4_5_21o41o4lvl9ef5o.R.inc(2192);
        __CLR4_5_21o41o4lvl9ef5o.R.inc(2193);for (Box box : getBoxes()) {{
            __CLR4_5_21o41o4lvl9ef5o.R.inc(2194);if ((((box instanceof ChunkOffsetBox)&&(__CLR4_5_21o41o4lvl9ef5o.R.iget(2195)!=0|true))||(__CLR4_5_21o41o4lvl9ef5o.R.iget(2196)==0&false))) {{
                __CLR4_5_21o41o4lvl9ef5o.R.inc(2197);return (ChunkOffsetBox) box;
            }
        }}
        }__CLR4_5_21o41o4lvl9ef5o.R.inc(2198);return null;
    }finally{__CLR4_5_21o41o4lvl9ef5o.R.flushNeeded();}}


    public TimeToSampleBox getTimeToSampleBox() {try{__CLR4_5_21o41o4lvl9ef5o.R.inc(2199);
        __CLR4_5_21o41o4lvl9ef5o.R.inc(2200);for (Box box : getBoxes()) {{
            __CLR4_5_21o41o4lvl9ef5o.R.inc(2201);if ((((box instanceof TimeToSampleBox)&&(__CLR4_5_21o41o4lvl9ef5o.R.iget(2202)!=0|true))||(__CLR4_5_21o41o4lvl9ef5o.R.iget(2203)==0&false))) {{
                __CLR4_5_21o41o4lvl9ef5o.R.inc(2204);return (TimeToSampleBox) box;
            }
        }}
        }__CLR4_5_21o41o4lvl9ef5o.R.inc(2205);return null;
    }finally{__CLR4_5_21o41o4lvl9ef5o.R.flushNeeded();}}

    public SyncSampleBox getSyncSampleBox() {try{__CLR4_5_21o41o4lvl9ef5o.R.inc(2206);
        __CLR4_5_21o41o4lvl9ef5o.R.inc(2207);for (Box box : getBoxes()) {{
            __CLR4_5_21o41o4lvl9ef5o.R.inc(2208);if ((((box instanceof SyncSampleBox)&&(__CLR4_5_21o41o4lvl9ef5o.R.iget(2209)!=0|true))||(__CLR4_5_21o41o4lvl9ef5o.R.iget(2210)==0&false))) {{
                __CLR4_5_21o41o4lvl9ef5o.R.inc(2211);return (SyncSampleBox) box;
            }
        }}
        }__CLR4_5_21o41o4lvl9ef5o.R.inc(2212);return null;
    }finally{__CLR4_5_21o41o4lvl9ef5o.R.flushNeeded();}}

    public CompositionTimeToSample getCompositionTimeToSample() {try{__CLR4_5_21o41o4lvl9ef5o.R.inc(2213);
        __CLR4_5_21o41o4lvl9ef5o.R.inc(2214);for (Box box : getBoxes()) {{
            __CLR4_5_21o41o4lvl9ef5o.R.inc(2215);if ((((box instanceof CompositionTimeToSample)&&(__CLR4_5_21o41o4lvl9ef5o.R.iget(2216)!=0|true))||(__CLR4_5_21o41o4lvl9ef5o.R.iget(2217)==0&false))) {{
                __CLR4_5_21o41o4lvl9ef5o.R.inc(2218);return (CompositionTimeToSample) box;
            }
        }}
        }__CLR4_5_21o41o4lvl9ef5o.R.inc(2219);return null;
    }finally{__CLR4_5_21o41o4lvl9ef5o.R.flushNeeded();}}

    public SampleDependencyTypeBox getSampleDependencyTypeBox() {try{__CLR4_5_21o41o4lvl9ef5o.R.inc(2220);
        __CLR4_5_21o41o4lvl9ef5o.R.inc(2221);for (Box box : getBoxes()) {{
            __CLR4_5_21o41o4lvl9ef5o.R.inc(2222);if ((((box instanceof SampleDependencyTypeBox)&&(__CLR4_5_21o41o4lvl9ef5o.R.iget(2223)!=0|true))||(__CLR4_5_21o41o4lvl9ef5o.R.iget(2224)==0&false))) {{
                __CLR4_5_21o41o4lvl9ef5o.R.inc(2225);return (SampleDependencyTypeBox) box;
            }
        }}
        }__CLR4_5_21o41o4lvl9ef5o.R.inc(2226);return null;
    }finally{__CLR4_5_21o41o4lvl9ef5o.R.flushNeeded();}}

}
