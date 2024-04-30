/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2009 castLabs GmbH, Berlin
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

package com.coremedia.iso.boxes.fragment;

import com.coremedia.iso.boxes.SampleDependencyTypeBox;
import com.googlecode.mp4parser.AbstractContainerBox;

import com.googlecode.mp4parser.DataSource;

import java.util.ArrayList;
import java.util.List;

/**
 * <h1>4cc = "{@value #TYPE}"</h1>
 * aligned(8) class MovieFragmentBox extends Box(moof){
 * }
 */

public class MovieFragmentBox extends AbstractContainerBox {public static class __CLR4_5_22du2dulvlulc6z{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,3120,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static final String TYPE = "moof";

    public MovieFragmentBox() {
        super(TYPE);__CLR4_5_22du2dulvlulc6z.R.inc(3091);try{__CLR4_5_22du2dulvlulc6z.R.inc(3090);
    }finally{__CLR4_5_22du2dulvlulc6z.R.flushNeeded();}}


    public List<Long> getSyncSamples(SampleDependencyTypeBox sdtp) {try{__CLR4_5_22du2dulvlulc6z.R.inc(3092);
        __CLR4_5_22du2dulvlulc6z.R.inc(3093);List<Long> result = new ArrayList<Long>();

        __CLR4_5_22du2dulvlulc6z.R.inc(3094);final List<SampleDependencyTypeBox.Entry> sampleEntries = sdtp.getEntries();
        __CLR4_5_22du2dulvlulc6z.R.inc(3095);long i = 1;
        __CLR4_5_22du2dulvlulc6z.R.inc(3096);for (SampleDependencyTypeBox.Entry sampleEntry : sampleEntries) {{
            __CLR4_5_22du2dulvlulc6z.R.inc(3097);if ((((sampleEntry.getSampleDependsOn() == 2)&&(__CLR4_5_22du2dulvlulc6z.R.iget(3098)!=0|true))||(__CLR4_5_22du2dulvlulc6z.R.iget(3099)==0&false))) {{
                __CLR4_5_22du2dulvlulc6z.R.inc(3100);result.add(i);
            }
            }__CLR4_5_22du2dulvlulc6z.R.inc(3101);i++;
        }

        }__CLR4_5_22du2dulvlulc6z.R.inc(3102);return result;
    }finally{__CLR4_5_22du2dulvlulc6z.R.flushNeeded();}}


    public int getTrackCount() {try{__CLR4_5_22du2dulvlulc6z.R.inc(3103);
        __CLR4_5_22du2dulvlulc6z.R.inc(3104);return getBoxes(TrackFragmentBox.class, false).size();
    }finally{__CLR4_5_22du2dulvlulc6z.R.flushNeeded();}}

    /**
     * Returns the track numbers associated with this <code>MovieBox</code>.
     *
     * @return the tracknumbers (IDs) of the tracks in their order of appearance in the file
     */

    public long[] getTrackNumbers() {try{__CLR4_5_22du2dulvlulc6z.R.inc(3105);

        __CLR4_5_22du2dulvlulc6z.R.inc(3106);List<TrackFragmentBox> trackBoxes = this.getBoxes(TrackFragmentBox.class, false);
        __CLR4_5_22du2dulvlulc6z.R.inc(3107);long[] trackNumbers = new long[trackBoxes.size()];
        __CLR4_5_22du2dulvlulc6z.R.inc(3108);for (int trackCounter = 0; (((trackCounter < trackBoxes.size())&&(__CLR4_5_22du2dulvlulc6z.R.iget(3109)!=0|true))||(__CLR4_5_22du2dulvlulc6z.R.iget(3110)==0&false)); trackCounter++) {{
            __CLR4_5_22du2dulvlulc6z.R.inc(3111);TrackFragmentBox trackBoxe = trackBoxes.get(trackCounter);
            __CLR4_5_22du2dulvlulc6z.R.inc(3112);trackNumbers[trackCounter] = trackBoxe.getTrackFragmentHeaderBox().getTrackId();
        }
        }__CLR4_5_22du2dulvlulc6z.R.inc(3113);return trackNumbers;
    }finally{__CLR4_5_22du2dulvlulc6z.R.flushNeeded();}}

    public List<TrackFragmentHeaderBox> getTrackFragmentHeaderBoxes() {try{__CLR4_5_22du2dulvlulc6z.R.inc(3114);
        __CLR4_5_22du2dulvlulc6z.R.inc(3115);return getBoxes(TrackFragmentHeaderBox.class, true);
    }finally{__CLR4_5_22du2dulvlulc6z.R.flushNeeded();}}

    public List<TrackRunBox> getTrackRunBoxes() {try{__CLR4_5_22du2dulvlulc6z.R.inc(3116);
        __CLR4_5_22du2dulvlulc6z.R.inc(3117);return getBoxes(TrackRunBox.class, true);
    }finally{__CLR4_5_22du2dulvlulc6z.R.flushNeeded();}}

    public DataSource getFileChannel() {try{__CLR4_5_22du2dulvlulc6z.R.inc(3118);
        __CLR4_5_22du2dulvlulc6z.R.inc(3119);return this.dataSource;
    }finally{__CLR4_5_22du2dulvlulc6z.R.flushNeeded();}}
}
